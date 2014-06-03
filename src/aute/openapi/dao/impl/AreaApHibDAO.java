/**
 * 
 */
package aute.openapi.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aute.openapi.dao.IAreaApDAO;
import aute.openapi.vo.InfoAreaAp;
import aute.openapi.vo.InfoDetailAp;


/**
 * @author Cangxu
 *
 */
public class AreaApHibDAO extends BaseHibernateDAO implements IAreaApDAO {
	private static final Logger log = LoggerFactory.getLogger(AreaApHibDAO.class);
	/* (non-Javadoc)
	 * @see aute.openapi.dao.IAreaApDAO#findAreaApInfo()
	 */
	@Override
	public List findAreaApInfo() {
		// TODO Auto-generated method stub
		log.debug("finding all InfoAreaAp instances");
		try {
			String queryString = "SELECT topo_area.id,topo_area.districtName,"
				+"topo_area.fullName,topo_areaap.apMac,topo_areaap.location,"
				+"info_fitap.deviceName,info_fitap.acIp FROM topo_area,topo_areaap,"
				+"info_fitap WHERE topo_area.id=topo_areaap.areaId AND topo_areaap.apMac=info_fitap.mac ORDER BY topo_area.id";
			List list = getSession().createSQLQuery(queryString).list();
			
			ArrayList<InfoAreaAp> arrayList = new ArrayList<InfoAreaAp>();
			InfoAreaAp infoAreaAp = null; 
			
			ArrayList<InfoDetailAp> infoDetailApList = null;
			Integer id = new Integer(0) ;
			int temp = 0;
			for(Iterator iterator = list.iterator();iterator.hasNext();){  
	            Object[] objects = (Object[]) iterator.next();  
	            if(temp == 0){
	            	infoAreaAp = new InfoAreaAp();
	            	infoDetailApList = new ArrayList<InfoDetailAp>();
	            	temp++;
	            	id = (Integer)objects[0];
	            	infoAreaAp.setDistrictName(objects[1].toString());
		            infoAreaAp.setFullName(objects[2].toString());
	            }else{
	            	if(!id.equals((Integer)objects[0])){
		            	id = (Integer)objects[0];
		            	infoAreaAp.setApInfo(infoDetailApList);
		            	arrayList.add(infoAreaAp);
		            	
		            	infoAreaAp = new InfoAreaAp();
		            	infoDetailApList = new ArrayList<InfoDetailAp>();
		            	infoAreaAp.setDistrictName(objects[1].toString());
			            infoAreaAp.setFullName(objects[2].toString());
		            }
	            }
	            
	            InfoDetailAp infoDetailAp = new InfoDetailAp();
	            infoDetailAp.setApMac(objects[3].toString());
	            infoDetailAp.setLocation(objects[4].toString());
	            infoDetailAp.setDeviceName(objects[5].toString());
	            infoDetailAp.setAcIp(objects[6].toString());
	            infoDetailApList.add(infoDetailAp);
	        }  
			infoAreaAp.setApInfo(infoDetailApList);
        	arrayList.add(infoAreaAp);
			return arrayList;
		} catch (RuntimeException re) {
			log.error("find all InfoAreaAp instances failed", re);
			throw re;
		}
	}

}

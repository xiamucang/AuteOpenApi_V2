package aute.openapi.task;

import java.util.Date;
/**
 * ��ʱ������
 * @author zhoushibao
 * @version 1��0
 * @since 2014-5-27 14:28:53
 *
 */
public class TimerJob {
	/**
	 * ����ִ�з���
	 */
	public void work(){
		System.out.println(new Date()+":��ʼͳ��ap��Ϣ��������");
		System.out.println("............................");
		System.out.println(new Date()+":ap��Ϣͳ�Ƴɹ���������");
	}
}

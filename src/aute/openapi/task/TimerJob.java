package aute.openapi.task;

import java.util.Date;
/**
 * 定时任务类
 * @author zhoushibao
 * @version 1。0
 * @since 2014-5-27 14:28:53
 *
 */
public class TimerJob {
	/**
	 * 任务执行方法
	 */
	public void work(){
		System.out.println(new Date()+":开始统计ap信息。。。。");
		System.out.println("............................");
		System.out.println(new Date()+":ap信息统计成功！！！！");
	}
}

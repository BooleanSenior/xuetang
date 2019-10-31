package com.cn.xuetang.util;

public class Constants {

	/*
	 * name：上传路径
	 */
	public static String tomcatPath = System.getProperty("catalina.home");
	public static String headPortraitPath = "touxian";// 个人信息的头像
	public static String voiceIntroducePath = "voice/";// 个人信息的语音文件夹名
	public static String workPath = "work";// 作品的路径
	public static String workCover = "workCover/";// 作品的封面文件夹
	public static String photo = "photo";// 个人相册原图文件及缩略图文件
	public static String coverFile = "coverFile";// 首页缩略文件 主播页宣传图片
	public static String memPhoto = "memPhoto";// 会员宣传的文件
	public static String ftpPath="D:\\work";//ftp虚拟目录
	/*
	 * 性別的枚舉常量
	 */

	public static enum sex {
		MAN("1", "男"), FEMAN("2", "女");
		private sex(String value, String name) {
			this.value = value;
			this.name = name;
		}

		private final String value;
		private final String name;

		public String getValue() {
			return value;
		}

		public String getName() {
			return name;
		}
	}

	/*
	 * 雇佣性质("自雇和外娉")
	 */
	public static enum employmentType {
		selfemployment("0", "自雇"), outemployment("1", "外娉");
		private employmentType(String value, String name) {
			this.value = value;
			this.name = name;
		}

		private final String value;
		private final String name;

		public String getValue() {
			return value;
		}

		public String getName() {
			return name;
		}
	}
}

package homeworkListEnum;

import homeworkListEnum.Seasons;

public enum Month {
	JANUARY(31,Seasons.WINTER), FEBRUARY(28,Seasons.WINTER),MARCH(31,Seasons.SPRING),APRIL(30,Seasons.SPRING),MAY(31,Seasons.SPRING),JUNE(30,Seasons.SUMMER),JULLY(31, Seasons.SUMMER), 
	AUGUST(31,Seasons.SUMMER),SEPTEMBER(30,Seasons.FALL),OCTOBER(31,Seasons.FALL), NOVEMBER(30,Seasons.FALL),DECEMBER(31,Seasons.WINTER);
		public int day;
	public Seasons season;
	private Month(int day, Seasons season) {
		this.day = day;
		this.season = season;
	}
	public int getDay() {
		return day;
	}
	public Seasons getSeason() {
		return season;
}
	static void menu () {
	System.out.println("Press 1 for show the name of mnonth ");
	System.out.println("Press 2 for show all months of this season: ");
	System.out.println("Press 3 for show all months that have same quantity of days: ");
	System.out.println("Press 4 for show all months that have less days:");
	System.out.println("Press 5 for show all months that have more days:");
	System.out.println("Press 6 for show next season");
	System.out.println("Press 7 for show previous season");
	System.out.println("Press 8 for show all months have even number of days");
	System.out.println("Press 9 for show all months have odd number of days");
	System.out.println("Press 10 show if entered month have even number of dayss");
}
}
package com.jaymesmorris.poe2tracker;

public final class RouteFactory {

	private RouteFactory() {
	}

	public static Route createDefaultRoute() {
		Route route = new Route();
		route.acts[0] = createAct1();
		route.acts[1] = createAct2();
		route.acts[2] = createAct3();
		route.acts[3] = createAct4();
		route.acts[4] = createAct5();
		route.acts[5] = createAct6();
		return route;
	}

	private static Act createAct1() {
		Act act = new Act();
		act.addChecklistItem("Reach Clearfell");
		act.addChecklistItem("Defeat Rust King");
		act.addChecklistItem("Defeat Rotten Druid");
		act.addChecklistItem("Defeat Draven and Asinia");
		act.addChecklistItem("Defeat Lachlann");
		act.addChecklistItem("Defeat Geonor");
		act.addRegexEntry("Movement Boots", "\"10% i.+mov\"");
		act.addRegexEntry("Talisman", "\"s: tali\"");
		return act;
	}

	private static Act createAct2() {
		Act act = new Act();
		act.addChecklistItem("Reach Caravan");
		act.addRegexEntry("Movement Boots", "\"10% i.+mov\"");
		return act;
	}

	private static Act createAct3() {
		Act act = new Act();
		act.addChecklistItem("-");
		act.addRegexEntry("Movement Boots", "\"10% i.+mov\"");
		return act;
	}

	private static Act createAct4() {
		Act act = new Act();
		act.addChecklistItem("-");
		act.addRegexEntry("Movement Boots", "\"10% i.+mov\"");
		return act;
	}

	private static Act createAct5() {
		Act act = new Act();
		act.addChecklistItem("-");
		act.addRegexEntry("Movement Boots", "\"10% i.+mov\"");
		return act;
	}

	private static Act createAct6() {
		Act act = new Act();
		act.addChecklistItem("-");
		act.addRegexEntry("Movement Boots", "\"10% i.+mov\"");
		return act;
	}
}
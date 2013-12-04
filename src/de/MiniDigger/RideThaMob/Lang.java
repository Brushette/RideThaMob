package de.MiniDigger.RideThaMob;

import org.bukkit.configuration.file.FileConfiguration;

public class Lang {

	private static FileConfiguration config;

	public Lang() {
		config = RideThaMob.pl.getConfig();
	}

	public static String _(LangType type) {
		return get(type);
	}

	public static String _(LangType type, String... args) {
		String s = get( type);
		for (int i = 0; i < args.length; i++) {
			s = s.replaceAll("%" + i + "%", args[i]);
		}
		return s;
	}

	private static String get(LangType type) {
		return config.getString("msgs." + type.name().toLowerCase());
	}
}

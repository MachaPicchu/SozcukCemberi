import java.util.ArrayList;

public class Sözcük {

	public static void sozcukBulmaca(int[] sayi) {
		String[] kelime = new String[6];
		String[] kelimeler = new String[6];

		int i;

		for (i = 0; i < 6; i++) {

			if (sayi[i] == 0) {
				kelime[i] = ("sıfır");
			}

			if (sayi[i] == 1) {
				kelime[i] = ("bir");
			}
			if (sayi[i] == 3) {
				kelime[i] = ("üç");
			}
			if (sayi[i] == 4) {
				kelime[i] = ("dört");
			}
			if (sayi[i] == 6) {
				kelime[i] = ("altı");
			}
			if (sayi[i] == 7) {
				kelime[i] = ("yedi");
			}
			if (sayi[i] == 8) {
				kelime[i] = ("sekiz");
			}
			if (sayi[i] == 9) {
				kelime[i] = ("dokuz");
			}
			if (sayi[i] == 10) {
				kelime[i] = ("on");
			}
			if (sayi[i] == 16) {
				kelime[i] = ("onaltı");
			}
			if (sayi[i] == 17) {
				kelime[i] = ("onyedi");
			}
			if (sayi[i] == 19) {
				kelime[i] = ("ondokuz");
			}
			if (sayi[i] == 36) {
				kelime[i] = ("otuzaltı");
			}
			if (sayi[i] == 37) {
				kelime[i] = ("otuzyedi");
			}
			if (sayi[i] == 46) {
				kelime[i] = ("kırkaltı");
			}
			if (sayi[i] == 48) {
				kelime[i] = ("kırksekiz");
			}
			if (sayi[i] == 61) {
				kelime[i] = ("altmışbir");
			}
			if (sayi[i] == 63) {
				kelime[i] = ("altmışüç");
			}
			if (sayi[i] == 64) {
				kelime[i] = ("altmışdört");
			}
			if (sayi[i] == 69) {
				kelime[i] = ("altmışdokuz");
			}
			if (sayi[i] == 71) {
				kelime[i] = ("yetmişbir");
			}
			if (sayi[i] == 73) {
				kelime[i] = ("yetmişüç");
			}
			if (sayi[i] == 80) {
				kelime[i] = ("seksen");
			}
			if (sayi[i] == 84) {
				kelime[i] = ("seksendört");
			}
			if (sayi[i] == 91) {
				kelime[i] = ("doksanbir");
			}
			if (sayi[i] == 96) {
				kelime[i] = ("doksanaltı");
			}

			if (i == 5) {

				int a, b, c, d, e, f;

				for (a = 0; a < 2; a++) {

					if (a == 0) {
						kelimeler[0] = String.valueOf(kelime[0].charAt(0));

					} else {
						kelimeler[0] = String.valueOf(kelime[0].charAt(kelime[0].length() - 1));

					}

					for (b = 0; b < 2; b++) {

						if (b == 0) {
							kelimeler[1] = String.valueOf(kelime[1].charAt(0));

						} else {
							kelimeler[1] = String.valueOf(kelime[1].charAt(kelime[1].length() - 1));

						}

						for (c = 0; c < 2; c++) {

							if (c == 0) {
								kelimeler[2] = String.valueOf(kelime[2].charAt(0));

							} else {
								kelimeler[2] = String.valueOf(kelime[2].charAt(kelime[2].length() - 1));

							}

							for (d = 0; d < 2; d++) {

								if (d == 0) {
									kelimeler[3] = String.valueOf(kelime[3].charAt(0));

								} else {
									kelimeler[3] = String.valueOf(kelime[3].charAt(kelime[3].length() - 1));

								}

								for (e = 0; e < 2; e++) {

									if (e == 0) {
										kelimeler[4] = String.valueOf(kelime[4].charAt(0));

									} else {
										kelimeler[4] = String.valueOf(kelime[4].charAt(kelime[4].length() - 1));

									}

									for (f = 0; f < 2; f++) {

										if (f == 0) {
											kelimeler[5] = String.valueOf(kelime[5].charAt(0));

											if (!birlestir(kelimeler).contains("oı")
													&& !birlestir(kelimeler).contains("oo")
													&& !birlestir(kelimeler).contains("ıo")
													&& !birlestir(kelimeler).contains("oı")
													&& !birlestir(kelimeler).contains("ao")
													&& !birlestir(kelimeler).contains("oa")
													&& !birlestir(kelimeler).contains("i")
													&& !birlestir(kelimeler).contains("ü")
													&& !birlestir(kelimeler).contains("b")
													&& !birlestir(kelimeler).contains("k")
													&& !birlestir(kelimeler).contains("s")
													&& !birlestir(kelimeler).contains("ç")
													&& !birlestir(kelimeler).contains("d")
													&& !birlestir(kelimeler).contains("z")
													&& !birlestir(kelimeler).contains("y")) {

												System.out.println(birlestir(kelimeler));
											}

										} else {

											kelimeler[5] = String.valueOf(kelime[5].charAt(kelime[5].length() - 1));

											if (!birlestir(kelimeler).contains("oı")
													&& !birlestir(kelimeler).contains("oo")
													&& !birlestir(kelimeler).contains("ıo")
													&& !birlestir(kelimeler).contains("oı")
													&& !birlestir(kelimeler).contains("ao")
													&& !birlestir(kelimeler).contains("oa")
													&& !birlestir(kelimeler).contains("i")
													&& !birlestir(kelimeler).contains("ü")
													&& !birlestir(kelimeler).contains("b")
													&& !birlestir(kelimeler).contains("k")
													&& !birlestir(kelimeler).contains("s")
													&& !birlestir(kelimeler).contains("ç")
													&& !birlestir(kelimeler).contains("d")
													&& !birlestir(kelimeler).contains("z")
													&& !birlestir(kelimeler).contains("y")

											) {
												System.out.println(birlestir(kelimeler));
											}

										}

									}

								}
							}
						}
					}
				}

			}

		}
	}

	public static String birlestir(String[] strArray) {
		String joinedString = String.join("", strArray);
		return joinedString;
	}
}

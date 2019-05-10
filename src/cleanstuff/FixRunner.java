package cleanstuff;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class FixRunner {

	public static void main(String[] args) {

		String[] s = { "BI1", "BI2", "BI3", "BI4", "BI5", "BI6", "BI7", "BI8", "BI9", "BIA", "BIB", "BIC", "BID", "BIE",
				"BIF", "BI10", "BI11", "BI12", "BI13", "BI14", "BI15", "BI16", "BI17", "BI18", "BI19", "BI1A", "BI1B",
				"BI1C", "BI1D", "BI1E", "BI1F", "BI20", "BI21", "BI22", "BI23", "BI24", "BI25", "BI26", "BI27", "BI28",
				"BI29", "BI2A", "BI2B", "BI2C", "BI2D", "BI2E", "BI2F", "BI30", "BI31", "BI32", "BI33", "BI34", "BI35",
				"BI36", "BI37", "BI38", "BI39", "BI3A", "BI3B", "BI3C", "BI3D", "BI3E", "BI3F", "BI40", "BI41", "BI42",
				"BI43", "BI44", "BI45", "BI46", "BI47", "BI48", "BI49", "BI4A", "BI4B", "BI4C", "BI4D", "BI4E", "BI4F",
				"BI50", "BI51", "BI52", "BI53", "BI54", "BI55", "BI56", "BI57", "BI58", "BI59", "BI5A", "BI5B", "BI5C",
				"BI5D", "BI5E", "BI5F", "BI60", "BI61", "BI62", "BI63", "BI64", "BI65", "BI66", "BI67", "BI68", "BI69",
				"BI6A", "BI6B", "BI6C", "BI6D", "BI6E", "BI6F", "BI70", "BI71", "BI72", "BI73", "BI74", "BI75", "BI76",
				"BI77", "BI78", "BI79", "BI7A", "BI7B", "BI7C", "BI7D", "BI7E", "BI7F", "BI80", "BI81", "BI82", "BI83",
				"BI84", "BI85", "BI86", "BI87", "BI88", "BI89", "BI8A", "BI8B", "BI8C", "BI8D", "BI8E", "BI8F", "BI90",
				"BI91", "BI92", "BI93", "BI94", "BI95", "BI96", "BI97", "BI98", "BI99", "BI9A", "BI9B", "BI9C", "BI9D",
				"BI9E", "BI9F", "BIA0", "BIA1", "BIA2", "BIA3", "BIA4", "BIA5", "BIA6", "BIA7", "BIA8", "BIA9", "BIAA",
				"BIAB", "BIAC", "BIAD", "BIAE", "BIAF", "BIB0", "BIB1", "BIB2", "BIB3", "BIB4", "BIB5", "BIB6", "BIB7",
				"BIB8", "BIB9", "BIBA", "BIBB", "BIBC", "BIBD", "BIBE", "BIBF", "BIC0", "BIC1", "BIC2", "BIC3", "BIC4",
				"BIC5", "BIC6", "BIC7", "BIC8", "BIC9", "BICA", "BICB", "BICC", "BICD", "BICE", "BICF", "BID0", "BID1",
				"BID2", "BID3", "BID4", "BID5", "BID6", "BID7", "BID8", "BID9", "BIDA", "BIDB", "BIDC", "BIDD", "BIDE",
				"BIDF", "BIE0", "BIE1", "BIE2", "BIE3", "BIE4", "BIE5", "BIE6", "BIE7", "BIE8", "BIE9", "BIEA", "BIEB",
				"BIEC", "BIED", "BIEE", "BIEF", "BIF0", "BIF1", "BIF2", "BIF3", "BIF4", "BIF5", "BIF6", "BIF7", "BIF8",
				"BIF9", "BIFA", "BIFB", "BIFC", "BIFD", "BIFE", "BIFF", "BI100", "BI102", "BI103", "BI104", "BI105",
				"BI106", "BI107", "BI108", "BI109", "BI10A", "BI10B", "BI10C", "BI10D", "BI10E", "BI10F", "BI110",
				"BI111", "BI112", "BI113", "BI114", "BI115", "BI116", "BI117", "BI118", "BI119", "BI11A", "BI11B",
				"BI11C", "BI11D", "BI11E", "BI11F", "BI120", "BI121", "BI122", "BI123", "BI124", "BI125", "BI126",
				"BI127", "BI128", "BI129", "BI12A", "BI12B", "BI12C", "BI12D", "BI12E", "BI131", "BI132", "BI133",
				"BI134" };
		delete(s);

	}

	public static void delete(String[] files) {

		System.out.println("Vamos a borrar: " + Arrays.toString(files));

		System.out.println("Está seguro de continuar ?? (si/no)");
		Scanner scan = new Scanner(System.in);
		String respuesta = scan.nextLine();

		if (!respuesta.equals("si"))
			return;

			
		String path = "E:\\SharedFolders\\ephesoft-system-folder";
		// String path ="C:\\Synergetics\\SharedFolders\\ephesoft-system-folder";
		System.out.println(files.length);

		for (int i = 0; i < files.length; i++) {
			String pathDirectory = path + "\\" + files[i];
			if (new File(pathDirectory).exists()) {
				try {
					FileUtils.deleteDirectory(new File(pathDirectory));
				} catch (IOException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				System.out.println("Input Folder Deleted " + files[i]);
			} else {
				System.out.println("the folder is not deleted, it was not in the input " + files[i]);
			}
		}
	}

}
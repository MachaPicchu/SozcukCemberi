import java.util.*;
import java.lang.*;

public class SozcukCemberi {

	public static void parcalama(int[] sayi) {
		int i;
		int[] parca = sayi;

		for (i = 0; i < parca.length; i++) {
			print1(parca, parca.length, i);
		}

	}

	public static void print1(int a[], int n, int ind) {
		int[] b = new int[(2 * n)];
		int[] c = new int[n];
		int[] d = new int[n];
		int k = 0;
		int i;
		for (i = 0; i < n; i++) {
			b[i] = b[n + i] = a[i];
		}

		for (i = ind; i < n + ind; i++) {
			c[k] = b[i];
			System.out.print(c[k] + "  ");

			k++;

		}

		System.out.println("");
		Sözcük.sozcukBulmaca(c);

		int l = 6;
		for (i = 0; i < 6; i++) {
			l = l - 1;
			d[l] = c[i];
			System.out.print(d[l] + "  ");

		}
		System.out.println("");

		Sözcük.sozcukBulmaca(d);

	}

	public static void print(int a[], int n, int ind) {
		int i;
		int j = n;
		int k = 0;
		int[] b = new int[(2 * n)];
		int[] c = new int[n];

		int[] parca = new int[6];

		for (i = 0; i < n; i++) {
			b[i] = b[n + i] = a[i];
		}

		for (i = ind; i < n + ind; i++) {
			c[k] = b[i];
			k++;

		}
// ---------------------------------------------------------------------------------------------------------
		System.out.println("");

		parca[0] = c[0];
		parca[1] = c[1];
		parca[2] = c[2] * 10 + c[3];
		parca[3] = c[4] * 10 + c[5];
		parca[4] = c[6] * 10 + c[7];
		parca[5] = c[8] * 10 + c[9];

		System.out.println("");

		parcalama(parca);

// ---------------------------------------------------------------------------------------------------------

		parca[0] = c[0];
		parca[1] = c[1] * 10 + c[2];
		parca[2] = c[3];
		parca[3] = c[4] * 10 + c[5];
		parca[4] = c[6] * 10 + c[7];
		parca[5] = c[8] * 10 + c[9];

		System.out.println("");

		parcalama(parca);

//
//		System.out.println("");

// ---------------------------------------------------------------------------------------------------------

		parca[0] = c[0];
		parca[1] = c[1] * 10 + c[2];
		parca[2] = c[3] * 10 + c[4];
		parca[3] = c[5];
		parca[4] = c[6] * 10 + c[7];
		parca[5] = c[8] * 10 + c[9];

		System.out.println("");

		parcalama(parca);

// ---------------------------------------------------------------------------------------------------------

		parca[0] = c[0];
		parca[1] = c[1] * 10 + c[2];
		parca[2] = c[3] * 10 + c[4];
		parca[3] = c[5] * 10 + c[6];
		parca[4] = c[7];
		parca[5] = c[8] * 10 + c[9];

		System.out.println("");

		parcalama(parca);

//---------------------------------------------------------------------------------------------------------

		parca[0] = c[0];
		parca[1] = c[1] * 10 + c[2];
		parca[2] = c[3] * 10 + c[4];
		parca[3] = c[5] * 10 + c[6];
		parca[4] = c[7] * 10 + c[8];
		parca[5] = c[9];

		System.out.println("");

		parcalama(parca);

// ---------------------------------------------------------------------------------------------------------
		System.out.println("");

		int[] f = new int[10];
		System.out.println("");

		for (i = 0; i < n; i++) {
			f[j - 1] = c[i];
			j = j - 1;
		}

		System.out.println("");

// ---------------------------------------------------------------------------------------------------------

		parca[0] = f[0];
		parca[1] = f[1];
		parca[2] = f[2] * 10 + f[3];
		parca[3] = f[4] * 10 + f[5];
		parca[4] = f[6] * 10 + f[7];
		parca[5] = f[8] * 10 + f[9];

		System.out.println("");

		parcalama(parca);

// ---------------------------------------------------------------------------------------------------------

		parca[0] = f[0];
		parca[1] = f[1] * 10 + f[2];
		parca[2] = f[3];
		parca[3] = f[4] * 10 + f[5];
		parca[4] = f[6] * 10 + f[7];
		parca[5] = f[8] * 10 + f[9];

		System.out.println("");

		parcalama(parca);

// ---------------------------------------------------------------------------------------------------------

		parca[0] = f[0];
		parca[1] = f[1] * 10 + f[2];
		parca[2] = f[3] * 10 + f[4];
		parca[3] = f[5];
		parca[4] = f[6] * 10 + f[7];
		parca[5] = f[8] * 10 + f[9];
		System.out.println("");

		parcalama(parca);

// ---------------------------------------------------------------------------------------------------------

		parca[0] = f[0];
		parca[1] = f[1] * 10 + f[2];
		parca[2] = f[3] * 10 + f[4];
		parca[3] = f[5] * 10 + f[6];
		parca[4] = f[7];
		parca[5] = f[8] * 10 + f[9];

		parcalama(parca);

// ---------------------------------------------------------------------------------------------------------

		parca[0] = f[0];
		parca[1] = f[1] * 10 + f[2];
		parca[2] = f[3] * 10 + f[4];
		parca[3] = f[5] * 10 + f[6];
		parca[4] = f[7] * 10 + f[8];
		parca[5] = f[9];

		parcalama(parca);

// ---------------------------------------------------------------------------------------------------------

	}

	public static void main(String argc[]) {
		int[] a = new int[] { 0, 1, 9, 6, 1, 7, 3, 6, 4, 8 };

		for (int i = 0; i < a.length; i++) {
			print(a, a.length, i);
		}

	}

}

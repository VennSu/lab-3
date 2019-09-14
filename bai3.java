/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng:");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Nhập các phần tử trong mảng:");
        for (int i=1; i<n ; i++){
            System.out.print("Phần tử " +i +":");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Mảng được sắp xếp:");
        for (int i=1; i < n; i++) {
            System.out.print(a[i] +" ");
        }
        int Min = a[0];
        for (int i = 1; i < n; i++) {
            Min = Math.min(Min, a[i]);
            System.out.println("");
            System.out.print("Phần tử nhỏ nhất là:"+Min);
        }
        int tong = 0;
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 3 == 0) {
				tong = tong + a[i];
				System.out.println(tong);
				dem++;
				System.out.println(dem);
			}
		}
		System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + (float) tong / dem);
    }
}

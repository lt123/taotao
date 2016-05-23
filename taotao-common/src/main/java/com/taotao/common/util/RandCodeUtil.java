package com.taotao.common.util;

import java.util.Random;

/**
 * ClassName:RandCodeUtil
 * Function: 加密工具类
 * Reason:   TODO
 * Date:     2016-5-23 上午10:42:33
 * @author   litao
 * @version  V1.0  
 * @see       
 */
public class RandCodeUtil {
	
	private RandCodeUtil(){}
	
	public static char[] getChar(){
        char[] passwordLit = new char[62];
        char fword = 'A';
        char mword = 'a';
        char bword = '0';
        for (int i = 0; i < 62; i++) {
            if (i < 26) {
                passwordLit[i] = fword;
                fword++;
            }else if(i<52){
                passwordLit[i] = mword;
                mword++;
            }else{
                passwordLit[i] = bword;
                bword++;
            }
        }
     return passwordLit;
    }
	
	/**
	 * 
	* @Title: getSalt
	* @Description: TODO(生成加盐字段/验证码)
	* @param @param length  生成加盐字段/验证码的长度
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getSalt(int length){
		StringBuilder sb = new StringBuilder();
		char[] r = getChar();
        Random rr = new Random();
        char[] pw= new char[length];
        for(int i=0;i<pw.length;i++){
            int num = rr.nextInt(62);
            pw[i]=r[num];
            sb.append(pw[i]);
        }
		return sb.toString().toLowerCase();
	} 
	
	public static String getSalt(){
		return getSalt(6);
	} 
	
	public static void main(String[] args) {
		System.out.println(getSalt(5));
	}
	
}
  
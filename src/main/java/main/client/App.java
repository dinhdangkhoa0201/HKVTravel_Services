package main.client;

import daos.NhanVienDAO;
import daos.UserPasswordDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        System.out.println(nhanVienDAO.dangNhap("NV0001"));
        
    }
}

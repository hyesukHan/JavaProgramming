package chap8;

public class Ex8_11 {
    public static void main(String[] args) {
        try{
            startInstall();
            copyFile();
        }catch (SpaceException e){
            System.out.println("에러메세지 " +
                    ""+e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보해주세요.");
        }catch (MemoryException e){
            System.out.println("에러메세지"+e.getMessage());
            e.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요");
        }finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace())
            throw new SpaceException("설치공간이 부족합니다.");
        if(!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }
    static void copyFile(){}
    static void deleteTempFiles(){}
    static boolean enoughSpace(){
        return false;
    }
    static boolean enoughMemory(){
        return true;
    }
    static class SpaceException extends Exception{
       SpaceException(String str){
           super(str);
       }
    }
    static class MemoryException extends Exception{
        MemoryException(String str){
            super(str);
        }
    }
}

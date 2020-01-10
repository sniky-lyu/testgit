package demo;

/**
 * version-1
 * --> version-2
 * --> version-3
 */
public class prt {
    public static void main(String[] args) {
        System.out.println("this is a test for git integration.");
        System.out.println("test for git integration: version-2");
        System.out.println("test for git integration: version-3");
        System.out.println("test for version-5");
        System.out.println("un-committed content, test for git reset --mixed HEAD, 撤销工作目录中所有未提交的修改内容-2");
        System.out.println("test for version-6");
        System.out.println("wrong commit1111");
        System.out.println("committed content, test for git reset --mixed HEAD~1, 撤销上一次的提交内容");
        System.out.println("un-committed content, test for git reset --mixed HEAD, 撤销工作目录中所有未提交的修改内容");
    }
}

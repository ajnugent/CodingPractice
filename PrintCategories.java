public class PrintCategories {

    public static void main(String[] args) {

        String str = "We have a large inventory in our warehouse falling in"
                    + "the category:apparel and the slightly more in demand"
                    + "category:makeup along with category:furniture ...";
        printCategories(str);
    }
    /*
    Extract all the categories from the string argument
     */
    public static void printCategories(String str){

        int i = 0;
        while(true){
            int found = str.indexOf("category", i);
            if(found == -1) break;
            int start = found + 9;
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start, end));
            i = end + 1;
        }
    }
}

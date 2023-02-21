public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Michael";
        post.passport = "6666 № 66666666";
        post.patronymic = "Petrovich";
        post.phone = "911";
        post.surname = "Zubenko";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 11;
        post.birthday.month = 2;
        post.birthday.year = 1996;


    }
}

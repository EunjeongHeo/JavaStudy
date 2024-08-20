package section1.Exercise1;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.reivew = "인생은 무한 루프";
        reviews[0] = inception;
        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.reivew = "인생 시간 영화!";
        reviews[1] = aboutTime;


        //영화 리뷰 정보 출력
        for (MovieReview review: reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.reivew );

        }


    }
}

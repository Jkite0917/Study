package 나도코딩.Chap_07_클래스;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;    // 4개의 인스턴스 변수 r 필드
    int serialNumber;
    static int counter = 0; // 시리얼 번호 생성 역랄 ++
    static boolean canAutoReport = false; // 자동 신고 기능

//    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다 : " + this.serialNumber);
//    }
//    BlackBox(String modelName, String resolution, int price, String color) {
//        this();
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = 200000;
//        this.color = color;
//    }

    void autoReport() {
        if (canAutoReport) {
        System.out.println("자동 신고");
    }
        else {
        System.out.println("자동 신고 기능이 지원되지 않습니다.");
    }
}

void insertMemoryCard(int capacity) {
    System.out.println("메모리 카드가 십입되었습니다.");
    System.out.println("용량은 " + capacity + "GB 입니다.");
}

int getVideoFileCount(int type) {
    if (type == 1) {
        return 9;
    }
    else if (type == 2) {
        return 1;
    }
    return 10;
}

// 날짜 속도 분
void record(boolean showDataTime, boolean showSpeed, int min) {
    System.out.println("녹화를 시작합니다.");
    if (showDataTime) {
        System.out.println("영상에 날짜 정보가 표시됩니다.");
    }

    if(showSpeed) {
        System.out.println("영상에 속도 정보가 표시됩니다.");
    }

    System.out.println("이 영상은 " + min + "분 단위로 기록됩니다.");
}

void record() {
    record(true, true, 5);
}

static void callServiceCenter() {  // static = 모든 객체에서 항상 똑같은 작동
    System.out.println("서비스 센터(1588-0000)으로 연결합니다.");
    // modelName = "test";  = 불가능
    canAutoReport = false;
    // modelName 같은 인스턴스 변수는 객체가 만들어져야 사용이 가능하다.
    // 반대로 canAutoReport같은 인스턴스 메소드는 다른 곳에서도 사용이 가능하다.

    // void -> 인스턴스 메서드
    // static void -> 클래스 메소드
}

void appendModelName(String modelName) {
    this.modelName += modelName;  // this.(class instance variable)
}

    // Getter & Setter
    // 값을 가져오는 / 설정하는 메소드
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }
    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}

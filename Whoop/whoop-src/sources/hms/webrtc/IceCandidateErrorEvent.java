package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    @CalledByNative
    public IceCandidateErrorEvent(String str, int i13, String str2, int i14, String str3) {
        this.address = str;
        this.port = i13;
        this.url = str2;
        this.errorCode = i14;
        this.errorText = str3;
    }
}

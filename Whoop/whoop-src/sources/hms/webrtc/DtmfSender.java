package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class DtmfSender {
    private long nativeDtmfSender;

    public DtmfSender(long j7) {
        this.nativeDtmfSender = j7;
    }

    private void checkDtmfSenderExists() {
        if (this.nativeDtmfSender == 0) {
            throw new IllegalStateException("DtmfSender has been disposed.");
        }
    }

    private static native boolean nativeCanInsertDtmf(long j7);

    private static native int nativeDuration(long j7);

    private static native boolean nativeInsertDtmf(long j7, String str, int i13, int i14);

    private static native int nativeInterToneGap(long j7);

    private static native String nativeTones(long j7);

    public boolean canInsertDtmf() {
        checkDtmfSenderExists();
        return nativeCanInsertDtmf(this.nativeDtmfSender);
    }

    public void dispose() {
        checkDtmfSenderExists();
        JniCommon.nativeReleaseRef(this.nativeDtmfSender);
        this.nativeDtmfSender = 0L;
    }

    public int duration() {
        checkDtmfSenderExists();
        return nativeDuration(this.nativeDtmfSender);
    }

    public boolean insertDtmf(String str, int i13, int i14) {
        checkDtmfSenderExists();
        return nativeInsertDtmf(this.nativeDtmfSender, str, i13, i14);
    }

    public int interToneGap() {
        checkDtmfSenderExists();
        return nativeInterToneGap(this.nativeDtmfSender);
    }

    public String tones() {
        checkDtmfSenderExists();
        return nativeTones(this.nativeDtmfSender);
    }
}

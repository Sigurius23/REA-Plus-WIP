package live.hms.video.sdk;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m65681d2 = {"Llive/hms/video/sdk/ProcessTimeVariables;", "", "<init>", "()V", "timeTakenWithML", "", "getTimeTakenWithML", "()J", "setTimeTakenWithML", "(J)V", "timeTakenWithoutML", "getTimeTakenWithoutML", "setTimeTakenWithoutML", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ProcessTimeVariables {
    public static final ProcessTimeVariables INSTANCE = new ProcessTimeVariables();
    private static long timeTakenWithML;
    private static long timeTakenWithoutML;

    private ProcessTimeVariables() {
    }

    public final long getTimeTakenWithML() {
        return timeTakenWithML;
    }

    public final long getTimeTakenWithoutML() {
        return timeTakenWithoutML;
    }

    public final void setTimeTakenWithML(long j7) {
        timeTakenWithML = j7;
    }

    public final void setTimeTakenWithoutML(long j7) {
        timeTakenWithoutML = j7;
    }
}

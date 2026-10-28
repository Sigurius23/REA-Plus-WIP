package wg0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: wg0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m65681d2 = {"Lwg0/e;", "", "Lwg0/c;", "granularity", "", "delayMillis", "", "charsPerStep", "<init>", "(Ljava/lang/String;ILwg0/c;JI)V", "Lwg0/c;", "getGranularity", "()Lwg0/c;", "J", "getDelayMillis", "()J", "I", "getCharsPerStep", "()I", "CONTROL", "SMOOTH", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC37255e {
    CONTROL(EnumC37253c.WORD, 16, 1),
    SMOOTH(EnumC37253c.CHARACTER, 16, 3);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final int charsPerStep;
    private final long delayMillis;
    private final EnumC37253c granularity;

    EnumC37255e(EnumC37253c enumC37253c, long j7, int i13) {
        this.granularity = enumC37253c;
        this.delayMillis = j7;
        this.charsPerStep = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getCharsPerStep() {
        return this.charsPerStep;
    }

    public final long getDelayMillis() {
        return this.delayMillis;
    }

    public final EnumC37253c getGranularity() {
        return this.granularity;
    }
}

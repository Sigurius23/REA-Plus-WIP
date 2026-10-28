package ek0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: ek0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m65681d2 = {"Lek0/r;", "", "", "code", "", "description", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "I", "getCode", "()I", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Companion", "a", "UNDEFINED", "EXPIRED", "ERROR", "USER_TERMINATED", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC13293r {
    UNDEFINED(-1, "Undefined termination code"),
    EXPIRED(0, "Haptics ran full sequence length"),
    ERROR(1, "Haptics run failed with error"),
    USER_TERMINATED(2, "Haptics run stopped by user double tap");

    private final int code;
    private final String description;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ek0.r$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lek0/r$a;", "", "<init>", "()V", "", "code", "Lek0/r;", "a", "(I)Lek0/r;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC13293r m37339a(int code) {
            for (EnumC13293r enumC13293r : EnumC13293r.values()) {
                if (enumC13293r.getCode() == code) {
                    if (enumC13293r == null) {
                        return EnumC13293r.UNDEFINED;
                    }
                    return enumC13293r;
                }
            }
            enumC13293r = null;
            if (enumC13293r == null) {
                return EnumC13293r.UNDEFINED;
            }
            return enumC13293r;
        }

        private Companion() {
        }
    }

    EnumC13293r(int i13, String str) {
        this.code = i13;
        this.description = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }
}

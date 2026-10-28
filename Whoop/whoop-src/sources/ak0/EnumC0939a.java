package ak0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: ak0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lak0/a;", "", "", "byteValue", "<init>", "(Ljava/lang/String;IB)V", "B", "getByteValue", "()B", "Companion", "a", "NOT_SET", "SET", "ERROR", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC0939a {
    NOT_SET((byte) 0),
    SET((byte) 1),
    ERROR((byte) 2);

    private final byte byteValue;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ak0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lak0/a$a;", "", "<init>", "()V", "", "byteValue", "Lak0/a;", "a", "(B)Lak0/a;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0018  */
        /* JADX INFO: renamed from: a */
        public final EnumC0939a m2368a(byte byteValue) {
            for (EnumC0939a enumC0939a : EnumC0939a.values()) {
                if (enumC0939a.getByteValue() == byteValue) {
                    if (enumC0939a != null) {
                        return enumC0939a;
                    }
                    throw new IllegalArgumentException("Invalid byte value");
                }
            }
            enumC0939a = null;
            if (enumC0939a != null) {
                return enumC0939a;
            }
            throw new IllegalArgumentException("Invalid byte value");
        }

        private Companion() {
        }
    }

    EnumC0939a(byte b) {
        this.byteValue = b;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final byte getByteValue() {
        return this.byteValue;
    }
}

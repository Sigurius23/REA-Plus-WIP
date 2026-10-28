package ba2;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: ba2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\tj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, m65681d2 = {"Lba2/b;", "", "", "byteValue", "", "displayValue", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "B", "getByteValue", "()B", "Ljava/lang/String;", "getDisplayValue", "Companion", "a", "TWENTY", "FIFTY", "ONE_HUNDRED", "TWO_HUNDRED", "FIVE_HUNDRED", "ONE_THOUSAND", "TWO_THOUSAND", "THREE_THOUSAND", "FOUR_THOUSAND", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC2901b {
    TWENTY((byte) 7, "20x"),
    FIFTY((byte) 8, "50x"),
    ONE_HUNDRED((byte) 9, "100x"),
    TWO_HUNDRED((byte) 10, "200x"),
    FIVE_HUNDRED((byte) 11, "500x"),
    ONE_THOUSAND((byte) 12, "1000x"),
    TWO_THOUSAND((byte) 13, "2000x"),
    THREE_THOUSAND((byte) 14, "3000x"),
    FOUR_THOUSAND((byte) 15, "4000x");

    private final byte byteValue;
    private final String displayValue;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ba2.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lba2/b$a;", "", "<init>", "()V", "", "value", "Lba2/b;", "a", "(B)Lba2/b;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC2901b m8497a(byte value) {
            for (EnumC2901b enumC2901b : EnumC2901b.values()) {
                if (enumC2901b.getByteValue() == value) {
                    return enumC2901b;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    EnumC2901b(byte b, String str) {
        this.byteValue = b;
        this.displayValue = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    public final String getDisplayValue() {
        return this.displayValue;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.displayValue;
    }
}

package zj0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: zj0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lzj0/a;", "", "", "byteValue", "<init>", "(Ljava/lang/String;IB)V", "B", "getByteValue", "()B", "Companion", "a", "SET", "NOT_SET", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC40706a {
    SET((byte) 1),
    NOT_SET((byte) 2);

    private final byte byteValue;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zj0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lzj0/a$a;", "", "<init>", "()V", "", "byteValue", "Lzj0/a;", "a", "(B)Lzj0/a;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x002c  */
        /* JADX INFO: renamed from: a */
        public final EnumC40706a m132178a(byte byteValue) {
            EnumC40706a[] enumC40706aArrValues = EnumC40706a.values();
            int length = enumC40706aArrValues.length;
            for (int i13 = 0; i13 < length && enumC40706aArrValues[i13].getByteValue() != byteValue; i13++) {
            }
            for (EnumC40706a enumC40706a : EnumC40706a.values()) {
                if (enumC40706a.getByteValue() == byteValue) {
                    if (enumC40706a != null) {
                        return enumC40706a;
                    }
                    throw new IllegalArgumentException("Invalid byte value");
                }
            }
            enumC40706a = null;
            if (enumC40706a != null) {
                return enumC40706a;
            }
            throw new IllegalArgumentException("Invalid byte value");
        }

        private Companion() {
        }
    }

    EnumC40706a(byte b) {
        this.byteValue = b;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final byte getByteValue() {
        return this.byteValue;
    }
}

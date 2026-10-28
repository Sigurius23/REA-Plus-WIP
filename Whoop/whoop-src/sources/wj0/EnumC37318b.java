package wj0;

import ge3.AbstractC15751g;
import java.util.NoSuchElementException;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: wj0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lwj0/b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "", "byteValue", "B", "getByteValue", "()B", "Companion", "a", "FAILURE", "SUCCESS", "PENDING", "UNSUPPORTED", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC37318b {
    FAILURE(0),
    SUCCESS(1),
    PENDING(2),
    UNSUPPORTED(3);

    private final byte byteValue;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wj0.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lwj0/b$a;", "", "<init>", "()V", "", "value", "Lwj0/b;", "a", "(B)Lwj0/b;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC37318b m119539a(byte value) {
            try {
                for (EnumC37318b enumC37318b : EnumC37318b.values()) {
                    if (enumC37318b.getByteValue() == value) {
                        return enumC37318b;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (NoSuchElementException e5) {
                throw new IllegalArgumentException(AbstractC2875y.m8296i(value, "Value ", " is not a valid CommandResult"), e5);
            }
        }

        private Companion() {
        }
    }

    EnumC37318b(int i13) {
        this.byteValue = (byte) i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final byte getByteValue() {
        return this.byteValue;
    }
}

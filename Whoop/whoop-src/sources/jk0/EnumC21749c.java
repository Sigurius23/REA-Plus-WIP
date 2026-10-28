package jk0;

import ge3.AbstractC15751g;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: jk0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m65681d2 = {"Ljk0/c;", "", "", "locationInt", "<init>", "(Ljava/lang/String;II)V", "I", "getLocationInt", "()I", "Companion", "a", "UNKNOWN", "WRIST", "BICEP", "CALF", "SIDE_TORSO", "GLUTE", "ANKLE", "UNKNOWN_GARMENT", "NOT_CONCLUSIVE", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC21749c {
    UNKNOWN(0),
    WRIST(1),
    BICEP(2),
    CALF(3),
    SIDE_TORSO(4),
    GLUTE(5),
    ANKLE(7),
    UNKNOWN_GARMENT(160),
    NOT_CONCLUSIVE(128);

    private final int locationInt;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: jk0.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ljk0/c$a;", "", "<init>", "()V", "", "searchValue", "Ljk0/c;", "a", "(I)Ljk0/c;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0018  */
        /* JADX INFO: renamed from: a */
        public final EnumC21749c m61367a(int searchValue) {
            for (EnumC21749c enumC21749c : EnumC21749c.values()) {
                if (enumC21749c.getLocationInt() == searchValue) {
                    if (enumC21749c != null) {
                        return enumC21749c;
                    }
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(searchValue, "No GarmentDeviceLocation with value ").toString());
                }
            }
            enumC21749c = null;
            if (enumC21749c != null) {
                return enumC21749c;
            }
            throw new IllegalArgumentException(AbstractC2875y.m8295h(searchValue, "No GarmentDeviceLocation with value ").toString());
        }

        private Companion() {
        }
    }

    EnumC21749c(int i13) {
        this.locationInt = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getLocationInt() {
        return this.locationInt;
    }
}

package zj0;

import ge3.AbstractC15751g;
import java.util.LinkedHashSet;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: zj0.j0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m65681d2 = {"Lzj0/j0;", "", "", "bit", "<init>", "(Ljava/lang/String;II)V", "I", "getBit", "()I", "Companion", "a", "FUELGAUGE_BAD_SOC_ERROR", "FUELGAUGE_TIMEOUT_ERROR", "LISTENER_CHG_STATUS_ERROR", "LISTENER_TIMEOUT_ERROR", "SERIAL_NUM_NOT_ASSIGNED", "STRAP_SIGNATURE_NOT_ASSIGNED", "FIRMWARE_VERSION_NOT_ASSIGNED", "COMMIT_HASH_VERSION_NOT_ASSIGNED", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC40734j0 {
    FUELGAUGE_BAD_SOC_ERROR(0),
    FUELGAUGE_TIMEOUT_ERROR(1),
    LISTENER_CHG_STATUS_ERROR(2),
    LISTENER_TIMEOUT_ERROR(3),
    SERIAL_NUM_NOT_ASSIGNED(4),
    STRAP_SIGNATURE_NOT_ASSIGNED(5),
    FIRMWARE_VERSION_NOT_ASSIGNED(6),
    COMMIT_HASH_VERSION_NOT_ASSIGNED(7);

    private final int bit;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zj0.j0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lzj0/j0$a;", "", "<init>", "()V", "", "errorStatus", "", "Lzj0/j0;", "a", "(I)Ljava/util/Set;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Set<EnumC40734j0> m132208a(int errorStatus) {
            InterfaceC33616a entries = EnumC40734j0.getEntries();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : entries) {
                if (((1 << ((EnumC40734j0) obj).getBit()) & errorStatus) != 0) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }

        private Companion() {
        }
    }

    EnumC40734j0(int i13) {
        this.bit = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getBit() {
        return this.bit;
    }
}

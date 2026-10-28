package rm2;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: rm2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lrm2/f;", "", "", "identifier", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "Companion", "a", "CHOOSE_STRAP", "WAKE_YOUR_WHOOP", "DONT_SEE_YOUR_DEVICE", "TAKE_OFF_YOUR_WHOOP", "TAP_RAPIDLY", "CONNECTION_FAILURE", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC31606f {
    CHOOSE_STRAP("choose_strap"),
    WAKE_YOUR_WHOOP("wake_your_whoop"),
    DONT_SEE_YOUR_DEVICE("dont_see_your_device"),
    TAKE_OFF_YOUR_WHOOP("take_off_your_whoop"),
    TAP_RAPIDLY("tap_rapidly"),
    CONNECTION_FAILURE("connection_failure");

    private final String identifier;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: rm2.f$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lrm2/f$a;", "", "<init>", "()V", "", "identifier", "Lrm2/f;", "a", "(Ljava/lang/String;)Lrm2/f;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC31606f m97637a(String identifier) {
            AbstractC22676k.m65750j(identifier, "identifier");
            for (EnumC31606f enumC31606f : EnumC31606f.values()) {
                if (AbstractC22676k.m65745e(enumC31606f.getIdentifier(), identifier)) {
                    if (enumC31606f == null) {
                        return EnumC31606f.CHOOSE_STRAP;
                    }
                    return enumC31606f;
                }
            }
            enumC31606f = null;
            if (enumC31606f == null) {
                return EnumC31606f.CHOOSE_STRAP;
            }
            return enumC31606f;
        }

        private Companion() {
        }
    }

    EnumC31606f(String str) {
        this.identifier = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}

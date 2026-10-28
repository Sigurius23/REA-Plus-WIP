package mn2;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: mn2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m65681d2 = {"Lmn2/b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "", "isInAppJoinFlow", "()Z", "getAutoExpandsOrderDetails", "autoExpandsOrderDetails", "Companion", "a", "JOIN", "GIFTING", "SHOP", "CART_SCREEN", "DEVICE_UPSELL", "IAJF_PREPAIDS", "IAJF_TRIALS_AA_UPSELL", "TRIAL_OFFER_ACTIVATION", "PLAN_PICKER_ACTIVATION", "BUY_NOW_WITH_CART", "UNKNOWN", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC25719b {
    JOIN("join"),
    GIFTING("gifting"),
    SHOP("shop"),
    CART_SCREEN("cart_screen"),
    DEVICE_UPSELL("device_upsell"),
    IAJF_PREPAIDS("iajf_prepaids"),
    IAJF_TRIALS_AA_UPSELL("iajf-trials-aa-upsell"),
    TRIAL_OFFER_ACTIVATION("lto"),
    PLAN_PICKER_ACTIVATION("plan_picker_activation"),
    BUY_NOW_WITH_CART("buy_now_with_cart"),
    UNKNOWN("unknown");

    private final String value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: mn2.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lmn2/b$a;", "", "<init>", "()V", "", "value", "Lmn2/b;", "a", "(Ljava/lang/String;)Lmn2/b;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:12:0x0024 A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC25719b m75836a(String value) {
            AbstractC22676k.m65750j(value, "value");
            for (EnumC25719b enumC25719b : EnumC25719b.values()) {
                if (AbstractC39421y.m125921F(enumC25719b.getValue(), value, true)) {
                    if (enumC25719b == null) {
                        return EnumC25719b.UNKNOWN;
                    }
                    return enumC25719b;
                }
            }
            enumC25719b = null;
            if (enumC25719b == null) {
                return EnumC25719b.UNKNOWN;
            }
            return enumC25719b;
        }

        private Companion() {
        }
    }

    EnumC25719b(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final boolean getAutoExpandsOrderDetails() {
        return isInAppJoinFlow() || this == DEVICE_UPSELL || this == BUY_NOW_WITH_CART;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isInAppJoinFlow() {
        return this == JOIN || this == IAJF_PREPAIDS || this == IAJF_TRIALS_AA_UPSELL;
    }
}

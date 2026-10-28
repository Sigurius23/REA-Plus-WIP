package b32;

import e32.AbstractC12614a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b32.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b$\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, m65681d2 = {"Lb32/c;", "", "Lb32/e;", "paymentStatus", "Lb32/a;", "pendingPaymentMethodInfo", "", "confirmAttemptTimestamp", "lastAttemptInfo", "", "lastAttemptScreen", "Le32/a;", "overlayState", "<init>", "(Lb32/e;Lb32/a;Ljava/lang/Long;Lb32/a;Ljava/lang/String;Le32/a;)V", "a", "(Lb32/e;Lb32/a;Ljava/lang/Long;Lb32/a;Ljava/lang/String;Le32/a;)Lb32/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lb32/e;", "g", "()Lb32/e;", "b", "Lb32/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lb32/a;", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "d", "e", "Ljava/lang/String;", "f", "Le32/a;", "()Le32/a;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2677c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC2679e paymentStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2675a pendingPaymentMethodInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Long confirmAttemptTimestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C2675a lastAttemptInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String lastAttemptScreen;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC12614a overlayState;

    public C2677c(AbstractC2679e paymentStatus, C2675a c2675a, Long l7, C2675a c2675a2, String str, AbstractC12614a overlayState) {
        AbstractC22676k.m65750j(paymentStatus, "paymentStatus");
        AbstractC22676k.m65750j(overlayState, "overlayState");
        this.paymentStatus = paymentStatus;
        this.pendingPaymentMethodInfo = c2675a;
        this.confirmAttemptTimestamp = l7;
        this.lastAttemptInfo = c2675a2;
        this.lastAttemptScreen = str;
        this.overlayState = overlayState;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2677c m7554b(C2677c c2677c, AbstractC2679e abstractC2679e, C2675a c2675a, Long l7, C2675a c2675a2, String str, AbstractC12614a abstractC12614a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC2679e = c2677c.paymentStatus;
        }
        if ((i13 & 2) != 0) {
            c2675a = c2677c.pendingPaymentMethodInfo;
        }
        if ((i13 & 4) != 0) {
            l7 = c2677c.confirmAttemptTimestamp;
        }
        if ((i13 & 8) != 0) {
            c2675a2 = c2677c.lastAttemptInfo;
        }
        if ((i13 & 16) != 0) {
            str = c2677c.lastAttemptScreen;
        }
        if ((i13 & 32) != 0) {
            abstractC12614a = c2677c.overlayState;
        }
        String str2 = str;
        AbstractC12614a abstractC12614a2 = abstractC12614a;
        return c2677c.m7555a(abstractC2679e, c2675a, l7, c2675a2, str2, abstractC12614a2);
    }

    /* JADX INFO: renamed from: a */
    public final C2677c m7555a(AbstractC2679e paymentStatus, C2675a pendingPaymentMethodInfo, Long confirmAttemptTimestamp, C2675a lastAttemptInfo, String lastAttemptScreen, AbstractC12614a overlayState) {
        AbstractC22676k.m65750j(paymentStatus, "paymentStatus");
        AbstractC22676k.m65750j(overlayState, "overlayState");
        return new C2677c(paymentStatus, pendingPaymentMethodInfo, confirmAttemptTimestamp, lastAttemptInfo, lastAttemptScreen, overlayState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getConfirmAttemptTimestamp() {
        return this.confirmAttemptTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C2675a getLastAttemptInfo() {
        return this.lastAttemptInfo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLastAttemptScreen() {
        return this.lastAttemptScreen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2677c)) {
            return false;
        }
        C2677c c2677c = (C2677c) other;
        return AbstractC22676k.m65745e(this.paymentStatus, c2677c.paymentStatus) && AbstractC22676k.m65745e(this.pendingPaymentMethodInfo, c2677c.pendingPaymentMethodInfo) && AbstractC22676k.m65745e(this.confirmAttemptTimestamp, c2677c.confirmAttemptTimestamp) && AbstractC22676k.m65745e(this.lastAttemptInfo, c2677c.lastAttemptInfo) && AbstractC22676k.m65745e(this.lastAttemptScreen, c2677c.lastAttemptScreen) && AbstractC22676k.m65745e(this.overlayState, c2677c.overlayState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC12614a getOverlayState() {
        return this.overlayState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC2679e getPaymentStatus() {
        return this.paymentStatus;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C2675a getPendingPaymentMethodInfo() {
        return this.pendingPaymentMethodInfo;
    }

    public int hashCode() {
        int iHashCode = this.paymentStatus.hashCode() * 31;
        C2675a c2675a = this.pendingPaymentMethodInfo;
        int iHashCode2 = (iHashCode + (c2675a == null ? 0 : c2675a.hashCode())) * 31;
        Long l7 = this.confirmAttemptTimestamp;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        C2675a c2675a2 = this.lastAttemptInfo;
        int iHashCode4 = (iHashCode3 + (c2675a2 == null ? 0 : c2675a2.hashCode())) * 31;
        String str = this.lastAttemptScreen;
        return this.overlayState.hashCode() + ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "StripeBottomSheetTileDomainState(paymentStatus=" + this.paymentStatus + ", pendingPaymentMethodInfo=" + this.pendingPaymentMethodInfo + ", confirmAttemptTimestamp=" + this.confirmAttemptTimestamp + ", lastAttemptInfo=" + this.lastAttemptInfo + ", lastAttemptScreen=" + this.lastAttemptScreen + ", overlayState=" + this.overlayState + ")";
    }

    public /* synthetic */ C2677c(AbstractC2679e abstractC2679e, C2675a c2675a, Long l7, C2675a c2675a2, String str, AbstractC12614a abstractC12614a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC2679e.d.f10540a : abstractC2679e, (i13 & 2) != 0 ? null : c2675a, (i13 & 4) != 0 ? null : l7, (i13 & 8) != 0 ? null : c2675a2, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? AbstractC12614a.c.f43067a : abstractC12614a);
    }
}

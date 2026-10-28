package g32;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p31.AbstractC28805p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y71.C39282o;

/* JADX INFO: renamed from: g32.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, m65681d2 = {"Lg32/l;", "Lm91/u;", "Lp31/p;", "header", "Ly71/o;", "paymentMethodTile", "", "Lkd1/o;", "acceptedPaymentMethods", "Lg32/m;", "stripeConfiguration", "", "autoPopUp", "<init>", "(Lp31/p;Ly71/o;Ljava/util/List;Lg32/m;Z)V", "a", "(Lp31/p;Ly71/o;Ljava/util/List;Lg32/m;Z)Lg32/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lp31/p;", "f", "()Lp31/p;", "b", "Ly71/o;", "g", "()Ly71/o;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lg32/m;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lg32/m;", "e", "Z", "()Z", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15312l implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC28805p header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39282o paymentMethodTile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<AbstractC22403o> acceptedPaymentMethods;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15313m stripeConfiguration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean autoPopUp;

    /* JADX WARN: Multi-variable type inference failed */
    public C15312l(AbstractC28805p abstractC28805p, C39282o paymentMethodTile, List<? extends AbstractC22403o> acceptedPaymentMethods, C15313m stripeConfiguration, boolean z4) {
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        AbstractC22676k.m65750j(acceptedPaymentMethods, "acceptedPaymentMethods");
        AbstractC22676k.m65750j(stripeConfiguration, "stripeConfiguration");
        this.header = abstractC28805p;
        this.paymentMethodTile = paymentMethodTile;
        this.acceptedPaymentMethods = acceptedPaymentMethods;
        this.stripeConfiguration = stripeConfiguration;
        this.autoPopUp = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C15312l m43500b(C15312l c15312l, AbstractC28805p abstractC28805p, C39282o c39282o, List list, C15313m c15313m, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC28805p = c15312l.header;
        }
        if ((i13 & 2) != 0) {
            c39282o = c15312l.paymentMethodTile;
        }
        if ((i13 & 4) != 0) {
            list = c15312l.acceptedPaymentMethods;
        }
        if ((i13 & 8) != 0) {
            c15313m = c15312l.stripeConfiguration;
        }
        if ((i13 & 16) != 0) {
            z4 = c15312l.autoPopUp;
        }
        boolean z13 = z4;
        List list2 = list;
        return c15312l.m43501a(abstractC28805p, c39282o, list2, c15313m, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C15312l m43501a(AbstractC28805p header, C39282o paymentMethodTile, List<? extends AbstractC22403o> acceptedPaymentMethods, C15313m stripeConfiguration, boolean autoPopUp) {
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        AbstractC22676k.m65750j(acceptedPaymentMethods, "acceptedPaymentMethods");
        AbstractC22676k.m65750j(stripeConfiguration, "stripeConfiguration");
        return new C15312l(header, paymentMethodTile, acceptedPaymentMethods, stripeConfiguration, autoPopUp);
    }

    /* JADX INFO: renamed from: c */
    public final List<AbstractC22403o> m43502c() {
        return this.acceptedPaymentMethods;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getAutoPopUp() {
        return this.autoPopUp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15312l)) {
            return false;
        }
        C15312l c15312l = (C15312l) other;
        return AbstractC22676k.m65745e(this.header, c15312l.header) && AbstractC22676k.m65745e(this.paymentMethodTile, c15312l.paymentMethodTile) && AbstractC22676k.m65745e(this.acceptedPaymentMethods, c15312l.acceptedPaymentMethods) && AbstractC22676k.m65745e(this.stripeConfiguration, c15312l.stripeConfiguration) && this.autoPopUp == c15312l.autoPopUp;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC28805p getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C39282o getPaymentMethodTile() {
        return this.paymentMethodTile;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C15313m getStripeConfiguration() {
        return this.stripeConfiguration;
    }

    public int hashCode() {
        AbstractC28805p abstractC28805p = this.header;
        return Boolean.hashCode(this.autoPopUp) + ((this.stripeConfiguration.hashCode() + AbstractC11895b.m31983b((this.paymentMethodTile.hashCode() + ((abstractC28805p == null ? 0 : abstractC28805p.hashCode()) * 31)) * 31, 31, this.acceptedPaymentMethods)) * 31);
    }

    public String toString() {
        AbstractC28805p abstractC28805p = this.header;
        C39282o c39282o = this.paymentMethodTile;
        List<AbstractC22403o> list = this.acceptedPaymentMethods;
        C15313m c15313m = this.stripeConfiguration;
        boolean z4 = this.autoPopUp;
        StringBuilder sb4 = new StringBuilder("StripeBottomSheetTileViewState(header=");
        sb4.append(abstractC28805p);
        sb4.append(", paymentMethodTile=");
        sb4.append(c39282o);
        sb4.append(", acceptedPaymentMethods=");
        sb4.append(list);
        sb4.append(", stripeConfiguration=");
        sb4.append(c15313m);
        sb4.append(", autoPopUp=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}

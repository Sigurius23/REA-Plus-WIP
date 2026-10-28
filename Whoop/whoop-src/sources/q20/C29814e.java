package q20;

import h20.C16671i1;
import i20.C17928b;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C29814e {

    /* JADX INFO: renamed from: a */
    public final int f121872a;

    /* JADX INFO: renamed from: b */
    public final String f121873b;

    /* JADX INFO: renamed from: c */
    public final String f121874c;

    /* JADX INFO: renamed from: d */
    public final C16671i1 f121875d;

    /* JADX INFO: renamed from: e */
    public final C17928b f121876e;

    /* JADX INFO: renamed from: f */
    public final C29812d f121877f;

    /* JADX INFO: renamed from: g */
    public final C29816f f121878g;

    public C29814e(int i13, String label, String paymentMethodType, C16671i1 c16671i1, C17928b c17928b, C29812d c29812d, C29816f c29816f) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        this.f121872a = i13;
        this.f121873b = label;
        this.f121874c = paymentMethodType;
        this.f121875d = c16671i1;
        this.f121876e = c17928b;
        this.f121877f = c29812d;
        this.f121878g = c29816f;
    }

    /* JADX INFO: renamed from: a */
    public final int m91321a() {
        return this.f121872a;
    }

    /* JADX INFO: renamed from: b */
    public final String m91322b() {
        return this.f121873b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29814e)) {
            return false;
        }
        C29814e c29814e = (C29814e) obj;
        return this.f121872a == c29814e.f121872a && AbstractC22676k.m65745e(this.f121873b, c29814e.f121873b) && AbstractC22676k.m65745e(this.f121874c, c29814e.f121874c) && AbstractC22676k.m65745e(this.f121875d, c29814e.f121875d) && AbstractC22676k.m65745e(this.f121876e, c29814e.f121876e) && this.f121877f.equals(c29814e.f121877f) && this.f121878g.equals(c29814e.f121878g);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f121872a * 31, 31, this.f121873b), 31, this.f121874c);
        C16671i1 c16671i1 = this.f121875d;
        int iHashCode = (iM30450d + (c16671i1 == null ? 0 : c16671i1.hashCode())) * 31;
        C17928b c17928b = this.f121876e;
        return this.f121878g.hashCode() + ((this.f121877f.hashCode() + ((iHashCode + (c17928b != null ? c17928b.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(this.f121872a, "PaymentOption(drawableResourceId=", ", label=", this.f121873b, ", paymentMethodType=");
        sbM53373n.append(this.f121874c);
        sbM53373n.append(", billingDetails=");
        sbM53373n.append(this.f121875d);
        sbM53373n.append(", _shippingDetails=");
        sbM53373n.append(this.f121876e);
        sbM53373n.append(", _labels=");
        sbM53373n.append(this.f121877f);
        sbM53373n.append(", imageLoader=");
        sbM53373n.append(this.f121878g);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}

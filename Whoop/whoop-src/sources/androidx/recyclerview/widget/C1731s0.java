package androidx.recyclerview.widget;

import android.view.View;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.recyclerview.widget.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1731s0 {

    /* JADX INFO: renamed from: a */
    public AbstractC1667c1 f6843a;

    /* JADX INFO: renamed from: b */
    public int f6844b;

    /* JADX INFO: renamed from: c */
    public int f6845c;

    /* JADX INFO: renamed from: d */
    public boolean f6846d;

    /* JADX INFO: renamed from: e */
    public boolean f6847e;

    public C1731s0() {
        m5324d();
    }

    /* JADX INFO: renamed from: a */
    public final void m5321a() {
        this.f6845c = this.f6846d ? this.f6843a.mo5183g() : this.f6843a.mo5187k();
    }

    /* JADX INFO: renamed from: b */
    public final void m5322b(View view, int i13) {
        if (this.f6846d) {
            int iMo5178b = this.f6843a.mo5178b(view);
            AbstractC1667c1 abstractC1667c1 = this.f6843a;
            this.f6845c = (Integer.MIN_VALUE == abstractC1667c1.f6589b ? 0 : abstractC1667c1.mo5188l() - abstractC1667c1.f6589b) + iMo5178b;
        } else {
            this.f6845c = this.f6843a.mo5181e(view);
        }
        this.f6844b = i13;
    }

    /* JADX INFO: renamed from: c */
    public final void m5323c(View view, int i13) {
        AbstractC1667c1 abstractC1667c1 = this.f6843a;
        int iMo5188l = Integer.MIN_VALUE == abstractC1667c1.f6589b ? 0 : abstractC1667c1.mo5188l() - abstractC1667c1.f6589b;
        if (iMo5188l >= 0) {
            m5322b(view, i13);
            return;
        }
        this.f6844b = i13;
        if (!this.f6846d) {
            int iMo5181e = this.f6843a.mo5181e(view);
            int iMo5187k = iMo5181e - this.f6843a.mo5187k();
            this.f6845c = iMo5181e;
            if (iMo5187k > 0) {
                int iMo5183g = (this.f6843a.mo5183g() - Math.min(0, (this.f6843a.mo5183g() - iMo5188l) - this.f6843a.mo5178b(view))) - (this.f6843a.mo5179c(view) + iMo5181e);
                if (iMo5183g < 0) {
                    this.f6845c -= Math.min(iMo5187k, -iMo5183g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo5183g2 = (this.f6843a.mo5183g() - iMo5188l) - this.f6843a.mo5178b(view);
        this.f6845c = this.f6843a.mo5183g() - iMo5183g2;
        if (iMo5183g2 > 0) {
            int iMo5179c = this.f6845c - this.f6843a.mo5179c(view);
            int iMo5187k2 = this.f6843a.mo5187k();
            int iMin = iMo5179c - (Math.min(this.f6843a.mo5181e(view) - iMo5187k2, 0) + iMo5187k2);
            if (iMin < 0) {
                this.f6845c = Math.min(iMo5183g2, -iMin) + this.f6845c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5324d() {
        this.f6844b = -1;
        this.f6845c = Integer.MIN_VALUE;
        this.f6846d = false;
        this.f6847e = false;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AnchorInfo{mPosition=");
        sb4.append(this.f6844b);
        sb4.append(", mCoordinate=");
        sb4.append(this.f6845c);
        sb4.append(", mLayoutFromEnd=");
        sb4.append(this.f6846d);
        sb4.append(", mValid=");
        return AbstractC2875y.m8305r(sb4, this.f6847e, '}');
    }
}

package androidx.compose.material3;

import bc3.AbstractC3006f0;
import bc3.C2996c2;
import java.util.concurrent.CancellationException;
import p000.AbstractC11266d;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p292l1.C23089e4;
import p292l1.C23107h4;
import p292l1.C23170s1;
import p292l1.C23176t1;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/material3/IndicatorLineElement;", "La3/h1;", "Ll1/t1;", "material3"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class IndicatorLineElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final boolean f4741w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC21083i f4742x;

    /* JADX INFO: renamed from: y */
    public final C23089e4 f4743y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC17869a1 f4744z;

    public IndicatorLineElement(boolean z4, InterfaceC21083i interfaceC21083i, C23089e4 c23089e4, InterfaceC17869a1 interfaceC17869a1) {
        C23107h4 c23107h4 = C23107h4.f91269a;
        C23107h4 c23107h5 = C23107h4.f91269a;
        this.f4741w = z4;
        this.f4742x = interfaceC21083i;
        this.f4743y = c23089e4;
        this.f4744z = interfaceC17869a1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C23107h4 c23107h4 = C23107h4.f91269a;
        C23107h4 c23107h5 = C23107h4.f91269a;
        return new C23176t1(this.f4741w, this.f4742x, this.f4743y, this.f4744z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorLineElement)) {
            return false;
        }
        IndicatorLineElement indicatorLineElement = (IndicatorLineElement) obj;
        if (this.f4741w != indicatorLineElement.f4741w || !AbstractC22676k.m65745e(this.f4742x, indicatorLineElement.f4742x) || !this.f4743y.equals(indicatorLineElement.f4743y) || !AbstractC22676k.m65745e(this.f4744z, indicatorLineElement.f4744z)) {
            return false;
        }
        float f13 = C23107h4.f91273e;
        if (!C39174f.m124782b(f13, f13)) {
            return false;
        }
        float f14 = C23107h4.f91272d;
        return C39174f.m124782b(f14, f14);
    }

    public final int hashCode() {
        int iHashCode = (this.f4743y.hashCode() + ((this.f4742x.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.f4741w) * 31, 31, false)) * 31)) * 31;
        InterfaceC17869a1 interfaceC17869a1 = this.f4744z;
        return Float.hashCode(C23107h4.f91272d) + AbstractC11266d.m30447a(C23107h4.f91273e, (iHashCode + (interfaceC17869a1 != null ? interfaceC17869a1.hashCode() : 0)) * 31, 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "indicatorLine";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(Boolean.valueOf(this.f4741w), "enabled");
        c2365d3.m7292c(Boolean.FALSE, "isError");
        c2365d3.m7292c(this.f4742x, "interactionSource");
        c2365d3.m7292c(this.f4743y, "colors");
        c2365d3.m7292c(this.f4744z, "textFieldShape");
        c2365d3.m7292c(new C39174f(C23107h4.f91273e), "focusedIndicatorLineThickness");
        c2365d3.m7292c(new C39174f(C23107h4.f91272d), "unfocusedIndicatorLineThickness");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("IndicatorLineElement(enabled=");
        sb4.append(this.f4741w);
        sb4.append(", isError=false, interactionSource=");
        sb4.append(this.f4742x);
        sb4.append(", colors=");
        sb4.append(this.f4743y);
        sb4.append(", textFieldShape=");
        sb4.append(this.f4744z);
        sb4.append(", focusedIndicatorLineThickness=");
        AbstractC13673n.m38572s(C23107h4.f91273e, ", unfocusedIndicatorLineThickness=", sb4);
        sb4.append((Object) C39174f.m124783c(C23107h4.f91272d));
        sb4.append(')');
        return sb4.toString();
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        boolean z4;
        C23176t1 c23176t1 = (C23176t1) abstractC2316v;
        float f13 = C23107h4.f91273e;
        float f14 = C23107h4.f91272d;
        boolean z13 = c23176t1.f91677Q;
        boolean z14 = this.f4741w;
        boolean z15 = true;
        if (z13 != z14) {
            c23176t1.f91677Q = z14;
            z4 = true;
        } else {
            z4 = false;
        }
        InterfaceC21083i interfaceC21083i = c23176t1.f91678R;
        InterfaceC21083i interfaceC21083i2 = this.f4742x;
        if (interfaceC21083i != interfaceC21083i2) {
            c23176t1.f91678R = interfaceC21083i2;
            C2996c2 c2996c2 = c23176t1.f91682V;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
            c23176t1.f91682V = AbstractC3006f0.m8732z(c23176t1.m7158L0(), null, null, new C23170s1(c23176t1, null, 3), 3);
        }
        C23089e4 c23089e4 = c23176t1.f91683W;
        C23089e4 c23089e5 = this.f4743y;
        if (!AbstractC22676k.m65745e(c23089e4, c23089e5)) {
            c23176t1.f91683W = c23089e5;
            z4 = true;
        }
        InterfaceC17869a1 interfaceC17869a1 = c23176t1.f91685Y;
        InterfaceC17869a1 interfaceC17869a2 = this.f4744z;
        if (!AbstractC22676k.m65745e(interfaceC17869a1, interfaceC17869a2)) {
            if (!AbstractC22676k.m65745e(c23176t1.f91685Y, interfaceC17869a2)) {
                c23176t1.f91685Y = interfaceC17869a2;
                c23176t1.f91687a0.m39909X0();
            }
            z4 = true;
        }
        if (!C39174f.m124782b(c23176t1.f91679S, f13)) {
            c23176t1.f91679S = f13;
            z4 = true;
        }
        if (C39174f.m124782b(c23176t1.f91680T, f14)) {
            z15 = z4;
        } else {
            c23176t1.f91680T = f14;
        }
        if (z15) {
            c23176t1.m67137b1();
        }
    }
}

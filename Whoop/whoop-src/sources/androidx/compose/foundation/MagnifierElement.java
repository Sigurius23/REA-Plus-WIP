package androidx.compose.foundation;

import android.view.View;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p095dp.AbstractC12240d;
import p132f0.AbstractC13838y0;
import p132f0.C13836x0;
import p132f0.InterfaceC13791h1;
import p209i3.C18043y;
import p636y3.C39174f;
import p636y3.C39176h;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/MagnifierElement;", "La3/h1;", "Lf0/x0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class MagnifierElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f4497w;

    /* JADX INFO: renamed from: x */
    public final Function1 f4498x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC13791h1 f4499y;

    public MagnifierElement(Function1 function1, Function1 function2, InterfaceC13791h1 interfaceC13791h1) {
        this.f4497w = function1;
        this.f4498x = function2;
        this.f4499y = interfaceC13791h1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C13836x0(this.f4497w, this.f4498x, this.f4499y);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.f4499y.hashCode() + AbstractC30802r.m94756e(this.f4498x, AbstractC2875y.m8289b(AbstractC11266d.m30447a(Float.NaN, AbstractC11266d.m30447a(Float.NaN, AbstractC11266d.m30451e(AbstractC2875y.m8289b(AbstractC11266d.m30447a(Float.NaN, this.f4497w.hashCode() * 961, 31), 31, true), 9205357640488583168L, 31), 31), 31), 31, true), 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "magnifier";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.f4497w, "sourceCenter");
        c2365d3.m7292c(null, "magnifierCenter");
        c2365d3.m7292c(Float.valueOf(Float.NaN), "zoom");
        c2365d3.m7292c(new C39176h(9205357640488583168L), "size");
        c2365d3.m7292c(new C39174f(Float.NaN), "cornerRadius");
        c2365d3.m7292c(new C39174f(Float.NaN), "elevation");
        c2365d3.m7292c(Boolean.TRUE, "clippingEnabled");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C13836x0 c13836x0 = (C13836x0) abstractC2316v;
        c13836x0.getClass();
        InterfaceC13791h1 interfaceC13791h1 = c13836x0.f49363Q;
        View view = c13836x0.f49364R;
        InterfaceC39171c interfaceC39171c = c13836x0.f49365S;
        c13836x0.f49361O = this.f4497w;
        c13836x0.f49362P = this.f4498x;
        InterfaceC13791h1 interfaceC13791h2 = this.f4499y;
        c13836x0.f49363Q = interfaceC13791h2;
        View viewM34057W = AbstractC12240d.m34057W(c13836x0);
        InterfaceC39171c interfaceC39171c2 = AbstractC0201g.m516p(c13836x0).f776X;
        if (c13836x0.f49366T != null) {
            C18043y c18043y = AbstractC13838y0.f49373a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !interfaceC13791h2.mo39139b()) || !C39176h.m124785a(9205357640488583168L, 9205357640488583168L) || !C39174f.m124782b(Float.NaN, Float.NaN) || !C39174f.m124782b(Float.NaN, Float.NaN) || !interfaceC13791h2.equals(interfaceC13791h1) || !viewM34057W.equals(view) || !AbstractC22676k.m65745e(interfaceC39171c2, interfaceC39171c)) {
                c13836x0.m39194Y0();
            }
        }
        c13836x0.m39195Z0();
    }
}

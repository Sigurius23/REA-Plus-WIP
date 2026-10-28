package b30;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import az1.C2161b;
import b72.AbstractC2784b;
import c93.InterfaceC4339a;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import f11.AbstractC14004d;
import g41.AbstractC15460d;
import l83.C23454a0;
import p132f0.AbstractC13838y0;
import p132f0.C13779d1;
import p209i3.C18043y;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.C39176h;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qs1.AbstractC30574a;
import sv2.AbstractC33042e;
import z50.AbstractC40088d;

/* JADX INFO: renamed from: b30.s2 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2619s2 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10199w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC39171c f10200x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f10201y;

    public /* synthetic */ C2619s2(InterfaceC39171c interfaceC39171c, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f10199w = i13;
        this.f10200x = interfaceC39171c;
        this.f10201y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f10199w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC28601c1 interfaceC28601c1 = this.f10201y;
        InterfaceC39171c interfaceC39171c = this.f10200x;
        switch (i13) {
            case 0:
                InterfaceC39147y it = (InterfaceC39147y) obj;
                AbstractC22676k.m65750j(it, "it");
                interfaceC28601c1.setValue(new C39174f(interfaceC39171c.mo733e0((int) (it.mo3541n() & 4294967295L))));
                return c23454a0;
            case 1:
                return AbstractC2784b.m7911t(interfaceC39171c, interfaceC28601c1, (InterfaceC39147y) obj);
            case 2:
                C2161b c2161b = new C2161b((InterfaceC4339a) obj, 22);
                C2619s2 c2619s2 = new C2619s2(interfaceC39171c, interfaceC28601c1, 3);
                C18043y c18043y = AbstractC13838y0.f49373a;
                return new MagnifierElement(c2161b, c2619s2, Build.VERSION.SDK_INT == 28 ? C13779d1.f49163c : C13779d1.f49164d);
            case 3:
                C39176h c39176h = (C39176h) obj;
                interfaceC28601c1.setValue(new C39180l((((long) interfaceC39171c.mo724F(C39176h.m124787c(c39176h.f168415a))) << 32) | (((long) interfaceC39171c.mo724F(C39176h.m124786b(c39176h.f168415a))) & 4294967295L)));
                return c23454a0;
            case 4:
                C2161b c2161b2 = new C2161b((InterfaceC4339a) obj, 23);
                C2619s2 c2619s3 = new C2619s2(interfaceC39171c, interfaceC28601c1, 5);
                C18043y c18043y2 = AbstractC13838y0.f49373a;
                return new MagnifierElement(c2161b2, c2619s3, Build.VERSION.SDK_INT == 28 ? C13779d1.f49163c : C13779d1.f49164d);
            case 5:
                C39176h c39176h2 = (C39176h) obj;
                interfaceC28601c1.setValue(new C39180l((((long) interfaceC39171c.mo724F(C39176h.m124787c(c39176h2.f168415a))) << 32) | (((long) interfaceC39171c.mo724F(C39176h.m124786b(c39176h2.f168415a))) & 4294967295L)));
                return c23454a0;
            case 6:
                return AbstractC14004d.m39863l(interfaceC39171c, interfaceC28601c1, (InterfaceC39147y) obj);
            case 7:
                return AbstractC15460d.m43644y(interfaceC39171c, interfaceC28601c1, (C39180l) obj);
            case 8:
                return AbstractC30574a.m93738D(interfaceC39171c, interfaceC28601c1, (C39180l) obj);
            case 9:
                return AbstractC33042e.m104481W(interfaceC39171c, interfaceC28601c1, (InterfaceC39147y) obj);
            case 10:
                InterfaceC39147y it3 = (InterfaceC39147y) obj;
                int i14 = ManageActivity.f22343G;
                AbstractC22676k.m65750j(it3, "it");
                interfaceC28601c1.setValue(new C39174f(interfaceC39171c.mo733e0((int) (it3.mo3541n() & 4294967295L))));
                return c23454a0;
            default:
                return AbstractC40088d.m128506y(interfaceC39171c, interfaceC28601c1, (C39180l) obj);
        }
    }
}

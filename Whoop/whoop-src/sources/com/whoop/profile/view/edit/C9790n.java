package com.whoop.profile.view.edit;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.C1643y1;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import c20.C3873a;
import c42.C4180q;
import c42.C4182s;
import c42.C4184u;
import c93.InterfaceC4351m;
import cj1.C4755k;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.whoop.data.remote.commons.ApiErrorResponse;
import com.whoop.membership.view.upcycle.C9144a;
import com.whoop.membership.view.upcycle.UpcycleLandingFragment;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.weightlifting.AbstractC10757a;
import cp0.AbstractC11009x0;
import cp1.C11020g;
import cp1.C11021h;
import cp1.C11031r;
import cq0.AbstractC11057e;
import cy0.C11184c;
import d30.C11552o;
import d30.C11568w;
import d42.AbstractC11700p;
import dn0.AbstractC12216p;
import e10.C12543f;
import e10.C12546g0;
import e10.C12550i0;
import e10.C12567r;
import e10.InterfaceC12549i;
import ej1.AbstractC13261x;
import eo2.AbstractC13393m;
import eo2.C13381a;
import ep1.AbstractC13413h;
import ep1.AbstractC13414i;
import ep1.AbstractC13428w;
import ey0.AbstractC13740g;
import f01.AbstractC13848c;
import f01.AbstractC13882n0;
import f01.C13851d;
import f01.C13885o0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p002a0.C0035k0;
import p002a0.C0047q0;
import p003a1.C0106e;
import p005a3.C0238p0;
import p026b2.C2319y;
import p027b3.InterfaceC2433r1;
import p077d0.C11335b2;
import p077d0.C11400s1;
import p077d0.C11421z1;
import p114eb.AbstractC12939a0;
import p133f1.C13926b1;
import p133f1.C13931d0;
import p133f1.C13951k;
import p133f1.C13954l;
import p133f1.C13972r;
import p133f1.C13981u;
import p133f1.C13988w0;
import p133f1.C13997z0;
import p208i2.AbstractC17911t;
import p208i2.C17898m0;
import p236j.AbstractC21065d;
import p238j0.C21084j;
import p238j0.InterfaceC21082h;
import p238j0.InterfaceC21083i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p294l3.C23254g;
import p329n0.InterfaceC26064q;
import p390p1.C28621h1;
import p390p1.C28624i0;
import p390p1.InterfaceC28670t2;
import p510u0.EnumC34304b1;
import p537ux.C35359u;
import p537ux.C35360v;
import p568w0.C36625a;
import p601x0.AbstractC37794e;
import p601x0.C37793d;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import q30.AbstractC29894a0;
import q83.InterfaceC30057d;
import s40.C32132a;
import u03.InterfaceC34393a;
import v10.C35525a;
import x30.AbstractC37926s0;
import yb3.C39410n;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.n */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9790n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28545w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f28546x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f28547y;

    public /* synthetic */ C9790n(int i13, Object obj, Object obj2) {
        this.f28545w = i13;
        this.f28546x = obj;
        this.f28547y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC12549i c12543f;
        boolean z4;
        C13981u c13981u;
        int i13 = this.f28545w;
        InterfaceC30057d interfaceC30057d = null;
        int i14 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f28547y;
        Object obj3 = this.f28546x;
        switch (i13) {
            case 0:
                return EditProfileScreenKt.EditProfileScreen$lambda$20$0((AbstractC12939a0) obj3, (InterfaceC23462h) obj2, (EditProfileEvent) obj);
            case 1:
                return AbstractC11009x0.m29460W0((InterfaceC4351m) obj3, (List) obj2, (String) obj);
            case 2:
                return AbstractC11057e.m29732k((AbstractC11057e) obj3, (AbstractC1615p0) obj2, obj);
            case 3:
                return AbstractC11057e.m29741v((AbstractC11057e) obj3, (ApiErrorResponse) obj2, obj);
            case 4:
                return AbstractC10757a.m28175w((InterfaceC1585g0) obj3, (InterfaceC23462h) obj2, (C28624i0) obj);
            case 5:
                return UpcycleLandingFragment.m22861K((InterfaceC28670t2) obj3, (UpcycleLandingFragment) obj2, (C9144a.b) obj);
            case 6:
                return new C11335b2(i14, (C11421z1) obj3, (C11400s1) obj2);
            case 7:
                C22665e0 c22665e0 = (C22665e0) obj3;
                C22665e0 c22665e1 = (C22665e0) obj2;
                InterfaceC39407k interfaceC39407k = (InterfaceC39407k) obj;
                if (c22665e0.f89334w == -1) {
                    c22665e0.f89334w = ((C39410n) interfaceC39407k).m125844b().f71133w;
                }
                c22665e1.f89334w = ((C39410n) interfaceC39407k).m125844b().f71134x + 1;
                return "";
            case 8:
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) obj3;
                AbstractC29894a0 challengeResult = (AbstractC29894a0) obj;
                int i15 = Stripe3ds2TransactionActivity.f22356z;
                AbstractC22676k.m65750j(challengeResult, "challengeResult");
                return AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(stripe3ds2TransactionActivity), null, null, new C2319y(stripe3ds2TransactionActivity, challengeResult, (C1643y1) obj2, null, 2), 3);
            case 9:
                InterfaceC39147y coordinates = (InterfaceC39147y) obj;
                AbstractC22676k.m65750j(coordinates, "coordinates");
                ((InterfaceC4351m) obj3).invoke(((C11568w) obj2).f37330a, coordinates);
                return c23454a0;
            case 10:
                return AbstractC11700p.m31261e0((Function1) obj3, (C4182s) obj2, ((Boolean) obj).booleanValue());
            case 11:
                return AbstractC11700p.m31244S((Function1) obj3, (C4180q) obj2, ((Boolean) obj).booleanValue());
            case 12:
                return AbstractC11700p.m31269i0((Function1) obj3, (C4184u) obj2, obj);
            case 13:
                return AbstractC12216p.m33888O((C28621h1) obj3, (Function1) obj2, ((Integer) obj).intValue());
            case 14:
                C12550i0 c12550i0 = (C12550i0) obj3;
                C0106e c0106e = (C0106e) obj2;
                Parcelable result = (Parcelable) obj;
                AbstractC22676k.m65750j(result, "result");
                C1601k1 c1601k1 = c12550i0.f42871a;
                String str = c12550i0.f42874d;
                C12546g0 c12546g0 = (C12546g0) c1601k1.m5001b(str);
                if (c12546g0 != null) {
                    c1601k1.m5004e(null, str);
                    c12543f = c12550i0.f42872b.mo35211f(c12546g0.f42859w, c12546g0.f42860x, c12546g0.f42861y, result);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Arguments should have been initialized before handling result!");
                    c12543f = new C12543f(illegalStateException, AbstractC37926s0.m121456H(illegalStateException), C12567r.f42912a);
                }
                c0106e.invoke(c12543f);
                return c23454a0;
            case 15:
                C35525a c35525a = (C35525a) obj2;
                C32132a host = (C32132a) obj;
                AbstractC22676k.m65750j(host, "host");
                AbstractC21065d abstractC21065d = ((C3873a) ((InterfaceC34393a) obj3).get()).f15854f;
                return abstractC21065d != null ? new C35360v(abstractC21065d) : new C35359u(host, c35525a);
            case 16:
                return AbstractC13261x.m37311i((C4755k) obj3, (Function1) obj2, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13393m.m37814s((C13381a) obj3, (Function1) obj2, (InterfaceC26064q) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13413h.m37955x((Function1) obj3, (C11020g) obj2, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC13414i.m37976s((Function1) obj3, (C11021h) obj2, obj);
            case 20:
                return AbstractC13428w.m38131u((Function1) obj3, (C11031r) obj2, obj);
            case 21:
                return AbstractC13740g.m39023B((Function1) obj3, (C11184c.b) obj2, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                c0238p0.m728a();
                InterfaceC22131e.m63378L(c0238p0, ((C17898m0) obj3).f69599a, (AbstractC17911t) obj2, 0.0f, null, 60);
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((C21084j) ((InterfaceC21083i) obj3)).m58922b((InterfaceC21082h) obj2);
                return c23454a0;
            case 24:
                return AbstractC13848c.m39218d((Function1) obj3, (C13851d) obj2, obj);
            case 25:
                return AbstractC13882n0.m39437u((C13885o0) obj3, (Function1) obj2, obj);
            case 26:
                C13972r c13972r = (C13972r) obj;
                C13951k.m39730m((C0035k0) obj3, (C13981u) obj2, c13972r, 0, c13972r.f49820f.f92227a.f92216a.f92135x.length());
                return c23454a0;
            case 27:
                AbstractC3006f0.m8732z((InterfaceC2994c0) obj3, null, EnumC2998d0.f12007z, new C11552o((InterfaceC2433r1) obj2, (C23254g) obj, interfaceC30057d, 12), 1);
                return c23454a0;
            case 28:
                C13981u c13981u2 = (C13981u) obj;
                ((C13988w0) obj3).m39808m(c13981u2);
                ((Function1) obj2).invoke(c13981u2);
                return c23454a0;
            default:
                C13988w0 c13988w0 = (C13988w0) obj3;
                Context context = (Context) obj2;
                C36625a c36625a = (C36625a) obj;
                c36625a.m117695a();
                C0047q0 c0047q0 = c36625a.f156939a;
                EnumC34304b1[] enumC34304b1Arr = EnumC34304b1.f144053x;
                boolean zM39804i = c13988w0.m39804i();
                C13931d0 c13931d0 = new C13931d0(c13988w0, 5);
                Resources resources = context.getResources();
                C13997z0 c13997z0 = new C13997z0(0, c13931d0, null);
                if (zM39804i) {
                    c0047q0.m98a(new C37793d(AbstractC37794e.f161897b, resources.getString(R.string.copy), R.attr.actionModeCopyDrawable, c13997z0));
                }
                EnumC34304b1[] enumC34304b1Arr2 = EnumC34304b1.f144053x;
                C13926b1 c13926b1 = c13988w0.f49900a;
                ArrayList arrayListM39694e = c13926b1.m39694e(c13988w0.m39806k());
                if (!arrayListM39694e.isEmpty()) {
                    int size = arrayListM39694e.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 < size) {
                            C13954l c13954l = (C13954l) arrayListM39694e.get(i16);
                            C23254g c23254gM39737e = c13954l.m39737e();
                            z4 = c23254gM39737e.f92135x.length() == 0 || ((c13981u = (C13981u) c13926b1.m39690a().m81e(c13954l.f49741a)) != null && Math.abs(c13981u.f49879a.f49872b - c13981u.f49880b.f49872b) == c23254gM39737e.f92135x.length());
                            i16++;
                            c13926b1 = c13926b1;
                        }
                    }
                }
                C13931d0 c13931d1 = new C13931d0(c13988w0, 6);
                C13931d0 c13931d2 = new C13931d0(c13988w0, 7);
                Resources resources2 = context.getResources();
                C13997z0 c13997z1 = new C13997z0(0, c13931d2, c13931d1);
                if (!z4) {
                    c0047q0.m98a(new C37793d(AbstractC37794e.f161899d, resources2.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, c13997z1));
                }
                c36625a.m117695a();
                return c23454a0;
        }
    }

    public /* synthetic */ C9790n(C13951k c13951k, C0035k0 c0035k0, C13981u c13981u) {
        this.f28545w = 26;
        this.f28546x = c0035k0;
        this.f28547y = c13981u;
    }
}

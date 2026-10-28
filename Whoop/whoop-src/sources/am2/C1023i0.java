package am2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import b30.ViewOnClickListenerC2604q1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.google.android.gms.wallet.button.PayButton;
import com.whoop.data.local.room.dao.wipeable.FeatureTeamDao_Impl;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao_Impl;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao_Impl;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CalendarTileModel;
import g40.C15344e2;
import h91.C17027b;
import hy0.AbstractC17795v0;
import ih0.InterfaceC18484b;
import j93.InterfaceC21493z;
import java.util.List;
import jv2.InterfaceC21970a;
import kv2.AbstractC22846b;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import ol0.C28012b;
import p114eb.C12991u0;
import p163g1.C15041i6;
import p163g1.C15072l6;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p294l3.C23250e;
import p294l3.C23254g;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p409q0.AbstractC29701y;
import p445r0.InterfaceC30833a;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import rv2.InterfaceC31850h;
import sv2.AbstractC33042e;
import to1.AbstractC34019l;
import vl0.AbstractC36101d;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: am2.i0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1023i0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3839w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f3840x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f3841y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f3842z;

    public /* synthetic */ C1023i0(Object obj, Object obj2, boolean z4, int i13) {
        this.f3839w = i13;
        this.f3841y = obj;
        this.f3842z = obj2;
        this.f3840x = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f3839w;
        final int i14 = 3;
        final int i15 = 2;
        final int i16 = 1;
        final int i17 = 0;
        InterfaceC30057d interfaceC30057d = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        boolean z4 = this.f3840x;
        Object obj2 = this.f3842z;
        Object obj3 = this.f3841y;
        switch (i13) {
            case 0:
                return AbstractC1035o0.m2820F0((Function1) obj3, (C1037p0) obj2, z4, obj);
            case 1:
                Integer num = (Integer) obj3;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj2;
                PayButton button = (PayButton) obj;
                AbstractC22676k.m65750j(button, "button");
                View viewM121485y = AbstractC37926s0.m121485y(button, 2);
                if (viewM121485y != null) {
                    viewM121485y.setMinimumHeight(num != null ? num.intValue() : viewM121485y.getMinimumHeight());
                }
                button.setAlpha(z4 ? 1.0f : 0.5f);
                button.setEnabled(z4);
                if (z4) {
                    button.setOnClickListener(new ViewOnClickListenerC2604q1(interfaceC4339a, 0));
                } else {
                    button.setOnClickListener(null);
                }
                return c23454a0;
            case 2:
                return ((FeatureTeamDao_Impl) obj3).lambda$updateAllBadgeStatus$1(z4, (List) obj2, (InterfaceC30057d) obj);
            case 3:
                return ((MemberStoryDao_Impl) obj3).lambda$updateAllBadgeStatus$2(z4, (List) obj2, (InterfaceC30057d) obj);
            case 4:
                return ((TeamInviteDao_Impl) obj3).lambda$updateAllBadgeStatus$2(z4, (List) obj2, (InterfaceC30057d) obj);
            case 5:
                String str = (String) obj3;
                C15072l6 c15072l6 = (C15072l6) obj2;
                InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj;
                if (z4) {
                    AbstractC18041w.m51807f(interfaceC18044z, 0);
                }
                AbstractC18041w.m51808g(str, interfaceC18044z);
                ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69974u, new C18017a(null, new C15041i6(c15072l6, 0)));
                return c23454a0;
            case 6:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51806e(((InterfaceC41211c) ((InterfaceC28670t2) obj2).getValue()).mo133889M((Context) obj3), semantics);
                if (!z4) {
                    C23254g c23254g = new C23254g(6, "", null);
                    C18043y c18043y = AbstractC18039u.f70023E;
                    InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[18];
                    c18043y.m51817a(semantics, c23254g);
                }
                return c23454a0;
            case 7:
                return AbstractC17795v0.m51133p(z4, (Function1) obj3, (InterfaceC28601c1) obj2, (InterfaceC15250v) obj);
            case 8:
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj3;
                InterfaceC30833a interfaceC30833a = (InterfaceC30833a) obj2;
                InterfaceC15250v state = (InterfaceC15250v) obj;
                AbstractC22676k.m65750j(state, "state");
                if (((EnumC15251w) state).m43353a() && z4) {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C15344e2(interfaceC30833a, interfaceC30057d, i16), 3);
                }
                return c23454a0;
            case 9:
                return AbstractC22846b.m66245H((C12991u0) obj3, z4, (InterfaceC23462h) obj2, (InterfaceC21970a) obj);
            case 10:
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj3;
                Context context = (Context) obj2;
                List annotatedStringRanges = (List) obj;
                AbstractC22676k.m65750j(annotatedStringRanges, "annotatedStringRanges");
                if (z4) {
                    interfaceC4339a2.invoke();
                    C23250e c23250e = (C23250e) AbstractC25265s.m74100H0(annotatedStringRanges);
                    if (c23250e != null) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse((String) c23250e.f92125a));
                        context.startActivity(intent);
                    }
                }
                return c23454a0;
            case 11:
                final AbstractC29701y abstractC29701y = (AbstractC29701y) obj3;
                final InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) obj2;
                InterfaceC18044z interfaceC18044z2 = (InterfaceC18044z) obj;
                if (z4) {
                    InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a() { // from class: q0.l
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            boolean z13;
                            boolean z14;
                            boolean z15;
                            boolean z16;
                            switch (i17) {
                                case 0:
                                    AbstractC29701y abstractC29701y2 = abstractC29701y;
                                    if (abstractC29701y2.mo39182c()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y2, 0, null), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                                case 1:
                                    AbstractC29701y abstractC29701y3 = abstractC29701y;
                                    if (abstractC29701y3.mo39183d()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y3, 1, null), 3);
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                                case 2:
                                    AbstractC29701y abstractC29701y4 = abstractC29701y;
                                    if (abstractC29701y4.mo39182c()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y4, 0, null), 3);
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    return Boolean.valueOf(z15);
                                default:
                                    AbstractC29701y abstractC29701y5 = abstractC29701y;
                                    if (abstractC29701y5.mo39183d()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y5, 1, null), 3);
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    return Boolean.valueOf(z16);
                            }
                        }
                    };
                    InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                    C18030l c18030l = (C18030l) interfaceC18044z2;
                    c18030l.m51772e(AbstractC18029k.f69977x, new C18017a(null, interfaceC4339a3));
                    c18030l.m51772e(AbstractC18029k.f69979z, new C18017a(null, new InterfaceC4339a() { // from class: q0.l
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            boolean z13;
                            boolean z14;
                            boolean z15;
                            boolean z16;
                            switch (i16) {
                                case 0:
                                    AbstractC29701y abstractC29701y2 = abstractC29701y;
                                    if (abstractC29701y2.mo39182c()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y2, 0, null), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                                case 1:
                                    AbstractC29701y abstractC29701y3 = abstractC29701y;
                                    if (abstractC29701y3.mo39183d()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y3, 1, null), 3);
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                                case 2:
                                    AbstractC29701y abstractC29701y4 = abstractC29701y;
                                    if (abstractC29701y4.mo39182c()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y4, 0, null), 3);
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    return Boolean.valueOf(z15);
                                default:
                                    AbstractC29701y abstractC29701y5 = abstractC29701y;
                                    if (abstractC29701y5.mo39183d()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y5, 1, null), 3);
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    return Boolean.valueOf(z16);
                            }
                        }
                    }));
                } else {
                    InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a() { // from class: q0.l
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            boolean z13;
                            boolean z14;
                            boolean z15;
                            boolean z16;
                            switch (i15) {
                                case 0:
                                    AbstractC29701y abstractC29701y2 = abstractC29701y;
                                    if (abstractC29701y2.mo39182c()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y2, 0, null), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                                case 1:
                                    AbstractC29701y abstractC29701y3 = abstractC29701y;
                                    if (abstractC29701y3.mo39183d()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y3, 1, null), 3);
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                                case 2:
                                    AbstractC29701y abstractC29701y4 = abstractC29701y;
                                    if (abstractC29701y4.mo39182c()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y4, 0, null), 3);
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    return Boolean.valueOf(z15);
                                default:
                                    AbstractC29701y abstractC29701y5 = abstractC29701y;
                                    if (abstractC29701y5.mo39183d()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y5, 1, null), 3);
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    return Boolean.valueOf(z16);
                            }
                        }
                    };
                    InterfaceC21493z[] interfaceC21493zArr2 = AbstractC18041w.f70062a;
                    C18030l c18030l2 = (C18030l) interfaceC18044z2;
                    c18030l2.m51772e(AbstractC18029k.f69978y, new C18017a(null, interfaceC4339a4));
                    c18030l2.m51772e(AbstractC18029k.f69952A, new C18017a(null, new InterfaceC4339a() { // from class: q0.l
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            boolean z13;
                            boolean z14;
                            boolean z15;
                            boolean z16;
                            switch (i14) {
                                case 0:
                                    AbstractC29701y abstractC29701y2 = abstractC29701y;
                                    if (abstractC29701y2.mo39182c()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y2, 0, null), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                                case 1:
                                    AbstractC29701y abstractC29701y3 = abstractC29701y;
                                    if (abstractC29701y3.mo39183d()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y3, 1, null), 3);
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                                case 2:
                                    AbstractC29701y abstractC29701y4 = abstractC29701y;
                                    if (abstractC29701y4.mo39182c()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y4, 0, null), 3);
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    return Boolean.valueOf(z15);
                                default:
                                    AbstractC29701y abstractC29701y5 = abstractC29701y;
                                    if (abstractC29701y5.mo39183d()) {
                                        AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29689m(abstractC29701y5, 1, null), 3);
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    return Boolean.valueOf(z16);
                            }
                        }
                    }));
                }
                return c23454a0;
            case 12:
                return AbstractC33042e.m104508g0((InterfaceC31850h.b) obj2, (Function1) obj3, z4, (InterfaceC26064q) obj);
            case 13:
                return AbstractC34019l.m107538U((C17027b) obj3, (Integer) obj2, z4, (CalendarTileModel) obj);
            default:
                return AbstractC36101d.m114734w((C28012b) obj3, (String) obj2, z4, (InterfaceC18484b) obj);
        }
    }

    public /* synthetic */ C1023i0(Object obj, boolean z4, Object obj2, int i13) {
        this.f3839w = i13;
        this.f3841y = obj;
        this.f3840x = z4;
        this.f3842z = obj2;
    }

    public /* synthetic */ C1023i0(InterfaceC31850h.b bVar, Function1 function1, boolean z4) {
        this.f3839w = 12;
        this.f3842z = bVar;
        this.f3841y = function1;
        this.f3840x = z4;
    }

    public /* synthetic */ C1023i0(boolean z4, Object obj, Object obj2, int i13) {
        this.f3839w = i13;
        this.f3840x = z4;
        this.f3841y = obj;
        this.f3842z = obj2;
    }
}

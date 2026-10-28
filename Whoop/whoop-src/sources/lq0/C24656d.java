package lq0;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.domain.model.teams.Team;
import com.whoop.membership.familyPlan.FamilyPlanHubFragment;
import com.whoop.p069ui.drawer.debug.DebugFeatureFlagSettingsFragment;
import com.whoop.privacyconsent.view.PrivacyConsentFragment;
import com.whoop.service.push.PushService;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import e10.C12572t0;
import e10.C12574u0;
import gf2.C15799h;
import gf2.C15806o;
import h20.C16670i0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import j42.AbstractC21316a;
import java.util.concurrent.CancellationException;
import ji2.C21724c;
import ji2.C21726e;
import jx1.EnumC22030t;
import jx1.EnumC22031u;
import jz1.C22075c;
import kz.AbstractC22907d;
import l83.C23454a0;
import m92.C25327j;
import mc.AbstractC25406c;
import mi2.AbstractC25580c;
import mm1.AbstractC25688b;
import mm1.C25689c;
import mp0.C25818b0;
import mp0.C25853s0;
import mx1.AbstractC26007m;
import n10.C26141m0;
import n40.C26265e;
import n40.C26269i;
import n40.ViewTreeObserverOnGlobalLayoutListenerC26261a;
import nk1.AbstractC26797c;
import nk1.C26798d;
import nm2.C26847c;
import nm2.C26848d;
import nm2.C26849e;
import nq0.C27040c;
import nq0.C27044g;
import p002a0.C0006a1;
import p077d0.C11335b2;
import p114eb.C12970k1;
import p114eb.C12991u0;
import p114eb.C12999y0;
import p134f2.C14015d;
import p164g2.InterfaceC15250v;
import p208i2.AbstractC17904p0;
import p208i2.AbstractC17918w0;
import p208i2.C17894k0;
import p208i2.InterfaceC17869a1;
import p270k2.InterfaceC22131e;
import p279kd.C22379f;
import p292l1.C23101g4;
import p292l1.C23203x4;
import p313lz.C24804a;
import p313lz.C24806c;
import p313lz.C24811h;
import p313lz.C24812i;
import p329n0.InterfaceC26064q;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p507tx.AbstractC34235f;
import p537ux.AbstractC35328e;
import p692zt.C41112p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24684p;
import p718lz1.Function0;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ww1.InterfaceC37657c;
import y00.AbstractC38970u5;
import y00.C38780a6;
import y00.C38803d;
import y00.C38901n;
import y00.C38915o4;
import y00.EnumC38828f4;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lq0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C24656d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96426w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f96427x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f96428y;

    public /* synthetic */ C24656d(int i13, Object obj, Object obj2) {
        this.f96426w = i13;
        this.f96427x = obj;
        this.f96428y = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, l83.h] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f96426w) {
            case 0:
                return C24659g.m72008C((C24659g) this.f96427x, (String) this.f96428y, (View) obj);
            case 1:
                return C24659g.m72023o((C24659g) this.f96427x, (MessageListItem.MessageItem) this.f96428y, (View) obj);
            case 2:
                return C24684p.m72149p((C17894k0) this.f96427x, (C17894k0) this.f96428y, (InterfaceC22131e) obj);
            case 3:
                String str = (String) this.f96428y;
                C24812i c24812i = (C24812i) this.f96427x;
                AbstractC22907d abstractC22907d = c24812i.f97141z;
                AbstractC3076z abstractC3076z = c24812i.f97140y;
                C24806c state = (C24806c) obj;
                AbstractC22676k.m65750j(state, "state");
                boolean z4 = false;
                boolean z13 = true;
                InterfaceC30057d interfaceC30057d = null;
                if (AbstractC39414r.m125876U(str, state.f97123a, false)) {
                    int iOrdinal = AbstractC34235f.m108206N(abstractC22907d).ordinal();
                    if (iOrdinal == 0) {
                        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c24812i), abstractC3076z, null, new C24811h(c24812i, z4, interfaceC30057d, 0), 2);
                    } else if (iOrdinal == 1) {
                        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c24812i), null, null, new C24804a(str, c24812i, (InterfaceC30057d) null), 3);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c24812i), abstractC3076z, null, new C24811h(c24812i, z4, interfaceC30057d, 1), 2);
                    }
                } else if (AbstractC39414r.m125876U(str, state.f97124b, false)) {
                    int iOrdinal2 = AbstractC34235f.m108206N(abstractC22907d).ordinal();
                    if (iOrdinal2 == 0) {
                        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c24812i), abstractC3076z, null, new C24811h(c24812i, z13, interfaceC30057d, 0), 2);
                    } else if (iOrdinal2 == 1) {
                        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c24812i), null, null, new C22379f(c24812i, interfaceC30057d, 7), 3);
                    } else {
                        if (iOrdinal2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c24812i), abstractC3076z, null, new C24811h(c24812i, z13, interfaceC30057d, 1), 2);
                    }
                } else {
                    AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c24812i), null, null, new C16670i0(c24812i, str, interfaceC30057d, 23), 3);
                }
                return C23454a0.f92919a;
            case 4:
                return Function0.m72756p((C22075c) this.f96427x, (Function1) this.f96428y, (InterfaceC26064q) obj);
            case 5:
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f96427x, null, null, new C16670i0((InterfaceC15250v) obj, (C23203x4) this.f96428y, (InterfaceC30057d) null, 24), 3);
                return C23454a0.f92919a;
            case 6:
                AbstractC17918w0.m51529q((InterfaceC22131e) obj, (AbstractC17904p0) this.f96427x, ((C23101g4) this.f96428y).mo3457a());
                return C23454a0.f92919a;
            case 7:
                InterfaceC17869a1 interfaceC17869a1 = (InterfaceC17869a1) this.f96427x;
                C14015d c14015d = (C14015d) obj;
                return c14015d.m39910a(new C0006a1(new C24656d(6, interfaceC17869a1.mo39171a(c14015d.f50036w.mo468d(), c14015d.f50036w.getLayoutDirection(), c14015d), (C23101g4) this.f96428y), 21));
            case 8:
                return C25327j.m74376G((C25327j) this.f96427x, (String) this.f96428y, (C29218v0) obj);
            case 9:
                return PushService.m24503t((PushService) this.f96427x, (C41112p) this.f96428y, ((Boolean) obj).booleanValue());
            case 10:
                C2996c2 c2996c2 = (C2996c2) this.f96427x;
                InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f96428y;
                c2996c2.cancel((CancellationException) null);
                ((C11935t) interfaceC11936u).mo32218s((AbstractC25406c) obj);
                return C23454a0.f92919a;
            case 11:
                return AbstractC25580c.m75226o((Function1) this.f96427x, (C21724c) this.f96428y, ((Boolean) obj).booleanValue());
            case 12:
                return AbstractC25580c.m75230s((Function1) this.f96427x, (C21726e) this.f96428y, (InterfaceC26064q) obj);
            case 13:
                return AbstractC25688b.m75646j((Function1) this.f96427x, (C25689c) this.f96428y, obj);
            case 14:
                return C25818b0.m76070J0((C25818b0) this.f96427x, (SwitchCompat) this.f96428y, ((Boolean) obj).booleanValue());
            case 15:
                return C25818b0.m76116t0((C25818b0) this.f96427x, (C15799h) this.f96428y, (View) obj);
            case 16:
                return C25853s0.m76367Q((C25853s0) this.f96427x, (C15806o) this.f96428y, (View) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return FamilyPlanHubFragment.m22720J((FamilyPlanHubFragment) this.f96427x, this.f96428y, (InterfaceC37657c) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC26007m.m77258l0((EnumC22031u) this.f96427x, (EnumC22030t) this.f96428y, (InterfaceC22131e) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C12574u0 c12574u0 = (C12574u0) this.f96427x;
                C26141m0 c26141m0 = (C26141m0) this.f96428y;
                AbstractC35328e createConfirmAction = (AbstractC35328e) obj;
                AbstractC22676k.m65750j(createConfirmAction, "$this$createConfirmAction");
                C38915o4 paymentMethod = c12574u0.f42940w;
                AbstractC38970u5 abstractC38970u5 = c12574u0.f42941x;
                C38780a6 c38780a6 = new C38780a6(c12574u0.f42943z, new C38803d(c12574u0.f42939E));
                C38901n c38901n = c26141m0.f103562b;
                AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
                String str2 = paymentMethod.f167527w;
                EnumC38828f4 enumC38828f4 = paymentMethod.f167511E;
                if (enumC38828f4 != null) {
                    return createConfirmAction.mo112184a(str2, enumC38828f4, abstractC38970u5, null, null, c38780a6, c38901n);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 20:
                C12572t0 c12572t0 = (C12572t0) this.f96427x;
                C26141m0 c26141m1 = (C26141m0) this.f96428y;
                AbstractC35328e createConfirmAction2 = (AbstractC35328e) obj;
                AbstractC22676k.m65750j(createConfirmAction2, "$this$createConfirmAction");
                return createConfirmAction2.mo112186c(c12572t0.f42935w, c12572t0.f42936x, c12572t0.f42937y, c26141m1.f103562b);
            case 21:
                View view = (View) this.f96427x;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f96428y;
                C28624i0 DisposableEffect = (C28624i0) obj;
                AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
                ViewTreeObserverOnGlobalLayoutListenerC26261a viewTreeObserverOnGlobalLayoutListenerC26261a = new ViewTreeObserverOnGlobalLayoutListenerC26261a(view, 0, interfaceC28601c1);
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC26261a);
                return new C11335b2(2, view, viewTreeObserverOnGlobalLayoutListenerC26261a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C26265e c26265e = (C26265e) this.f96427x;
                C12991u0 c12991u0 = (C12991u0) this.f96428y;
                C12999y0 c12999y0 = (C12999y0) obj;
                c12999y0.f44915b = c26265e.f104429c;
                C26269i c26269i = c26265e.f104428b;
                if (c26269i != null) {
                    if (!c26269i.equals(C26269i.f104433a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c12999y0.f44917d = c12991u0.m36396k().f44819H;
                    c12999y0.f44919f = false;
                    C12970k1 c12970k1 = new C12970k1();
                    c12970k1.f44796a = true;
                    c12999y0.f44919f = c12970k1.f44796a;
                    c12999y0.f44920g = c12970k1.f44797b;
                }
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return PrivacyConsentFragment.m23343K((InterfaceC28601c1) this.f96427x, (PrivacyConsentFragment) this.f96428y, (AbstractC21316a) obj);
            case 24:
                return AbstractC26797c.m79866w((Function1) this.f96427x, (C26798d) this.f96428y, obj);
            case 25:
                return DebugFeatureFlagSettingsFragment.m26858T((InterfaceC28670t2) this.f96427x, (DebugFeatureFlagSettingsFragment) this.f96428y, (InterfaceC26064q) obj);
            case 26:
                return DebugFeatureFlagSettingsFragment.m26846H((DebugFeatureFlagSettingsFragment) this.f96427x, (C26849e) this.f96428y, ((Boolean) obj).booleanValue());
            case 27:
                return C26847c.m80130L((C26847c) this.f96427x, (String) this.f96428y, (C26848d) obj);
            case 28:
                return C27040c.m81153c((Function1) this.f96427x, (FeatureTeam) this.f96428y, (View) obj);
            default:
                return C27044g.m81165c((Function1) this.f96427x, (Team) this.f96428y, (View) obj);
        }
    }

    public /* synthetic */ C24656d(String str, C24812i c24812i) {
        this.f96426w = 3;
        this.f96428y = str;
        this.f96427x = c24812i;
    }

    public /* synthetic */ C24656d(C26265e c26265e, C12991u0 c12991u0, String str) {
        this.f96426w = 22;
        this.f96427x = c26265e;
        this.f96428y = c12991u0;
    }
}

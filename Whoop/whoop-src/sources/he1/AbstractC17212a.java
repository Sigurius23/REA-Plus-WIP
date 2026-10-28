package he1;

import android.util.Log;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c41.C4041i0;
import c41.C4103r;
import c41.C4131v;
import c93.InterfaceC4339a;
import cd0.C4435a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp0.C10965i;
import f01.C13845b;
import f01.C13849c0;
import f71.C14222c;
import g40.C15369i3;
import ge0.C15728c;
import ge1.InterfaceC15733b;
import ge1.InterfaceC15735d;
import ge3.AbstractC15751g;
import gf1.C15786e;
import gy0.AbstractC16272a;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.AbstractC21211n;
import java.io.IOException;
import java.util.Iterator;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import ny0.C27256h;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15170v4;
import p163g1.C15079m3;
import p178gz.C16283a;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p705ea2.C12909h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import z90.AbstractC40203a;

/* JADX INFO: renamed from: he1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010!\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020 2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "drawerTitle", "Lge1/d;", "state", "Lkotlin/Function1;", "Lge1/b;", "Ll83/a0;", "onViewEvent", "H", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lge1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "title", "Lkotlin/Function0;", "onDismiss", "E", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Li2/x;", "color", "s", "(JLandroidx/compose/runtime/Composer;I)V", "", "iconRes", "tint", "u", "(IJLandroidx/compose/runtime/Composer;I)V", "M", "(Landroidx/compose/runtime/Composer;I)V", "subtitle", "onRetry", "q", "(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lge1/d$e;", "A", "(Lge1/d$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "add-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17212a {

    /* JADX INFO: renamed from: he1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f66135w = new a();

        /* JADX INFO: renamed from: a */
        public final long m48652a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48652a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f66136w = new b();

        /* JADX INFO: renamed from: a */
        public final long m48653a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48653a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f66137w = new c();

        /* JADX INFO: renamed from: a */
        public final long m48654a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSecondaryText();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48654a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f66138w = new d();

        /* JADX INFO: renamed from: a */
        public final long m48655a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48655a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f66139w = new e();

        /* JADX INFO: renamed from: a */
        public final long m48656a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48656a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f66140w = new f();

        /* JADX INFO: renamed from: a */
        public final long m48657a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBackgroundDarkStd();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48657a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f66141w = new g();

        /* JADX INFO: renamed from: a */
        public final long m48658a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48658a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f66142w = new h();

        /* JADX INFO: renamed from: a */
        public final long m48659a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48659a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f66143w = new i();

        /* JADX INFO: renamed from: a */
        public final long m48660a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48660a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f66144w = new j();

        /* JADX INFO: renamed from: a */
        public final long m48661a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48661a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f66145w = new k();

        /* JADX INFO: renamed from: a */
        public final long m48662a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48662a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f66146w = new l();

        /* JADX INFO: renamed from: a */
        public final long m48663a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48663a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: he1.a$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f66147w = new m();

        /* JADX INFO: renamed from: a */
        public final long m48664a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSecondaryText();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48664a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m48612A(InterfaceC15735d.e eVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-67169211);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(eVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C15728c(function1, 20);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 4 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), 0.0f, f14, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1570277366);
            Iterator<T> it = eVar.m44361a().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((C4103r) it.next(), null, null, function2, c28655q, C4103r.f16646n, 6);
            }
            c28655q.m87173q(false);
            InterfaceC25312u interfaceC25312uM44363c = eVar.getGpsInfoCalloutState();
            if (interfaceC25312uM44363c == null) {
                c28655q.m87150e0(1434150694);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1434150695);
                AbstractC25303l.m74291r(interfaceC25312uM44363c, null, new C15786e(5), function2, c28655q, 0, 2);
                c28655q.m87173q(false);
            }
            InterfaceC25312u interfaceC25312uM44364d = eVar.getMaxDurationInfoCalloutState();
            if (interfaceC25312uM44364d == null) {
                c28655q.m87150e0(1434415217);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1434415218);
                AbstractC25303l.m74291r(interfaceC25312uM44364d, null, null, function2, c28655q, 0, 6);
                c28655q.m87173q(false);
            }
            InterfaceC25312u interfaceC25312uM44365e = eVar.getMaxSelectionInfoCalloutState();
            if (interfaceC25312uM44365e == null) {
                c28655q.m87150e0(1434608657);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1434608658);
                AbstractC25303l.m74291r(interfaceC25312uM44365e, null, null, function2, c28655q, 0, 6);
                c28655q.m87173q(false);
            }
            InterfaceC25312u interfaceC25312uM44362b = eVar.getFooterState();
            if (interfaceC25312uM44362b == null) {
                c28655q.m87150e0(1434788147);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1434788148);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC25303l.m74291r(interfaceC25312uM44362b, null, null, function2, c28655q, 0, 6);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(eVar, function1, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m48613B(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C4131v) {
            C4131v c4131v = (C4131v) event;
            function1.invoke(new InterfaceC15733b.g(c4131v.getActivityV2Id(), c4131v.getIsSelected()));
        } else if (event instanceof C27256h) {
            C27256h c27256h = (C27256h) event;
            String id4 = c27256h.getId();
            if (AbstractC22676k.m65745e(id4, "delete")) {
                function1.invoke(InterfaceC15733b.c.f59252a);
            } else if (AbstractC22676k.m65745e(id4, "merge")) {
                function1.invoke(InterfaceC15733b.f.f59255a);
            } else {
                Log.w("EditActivitiesDrawer", "Unknown card button id: " + c27256h.getId());
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Modifier m48614C(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1297714175);
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 1 * 8, 0.0f, 0.0f, 13);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m48615D(InterfaceC15735d.e eVar, Function1 function1, int i13, Composer composer, int i14) {
        m48612A(eVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m48616E(String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-359613222);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * 8, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCross(), c28655q, 6);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = d.f66138w;
                c28655q.m87172p0(objM87133R);
            }
            long jMo134584toComposableColorWaAFU9c = p745y81.Function1.m125323a((Function1) objM87133R).mo134584toComposableColorWaAFU9c(c28655q, 0);
            float f13 = 4 * 6;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, c2314t);
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C15369i3(interfaceC4339a, 13);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC15005f3.m43108b(c27430eM107874S, "Dismiss", AbstractC1092a.m3362g(modifierM3419p, false, null, null, (InterfaceC4339a) objM87133R2, 15), jMo134584toComposableColorWaAFU9c, c28655q, 48, 0);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C2886a c2886aM8414L = c38072d.m121952e(c28655q, C38072d.f163054b).getSh4();
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = e.f66139w;
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC30795n.m94707h(str, layoutWeightElement, p745y81.Function1.m125323a((Function1) objM87133R3).mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, i15 & 14, C2886a.f11498d << 18, 196088);
            c28655q = c28655q;
            AbstractC25012a.m73389v(c2314t, f13, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(str, interfaceC4339a, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m48617F(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m48618G(String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m48616E(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0203  */
    /* JADX WARN: Code duplicated, block: B:102:0x0207  */
    /* JADX WARN: Code duplicated, block: B:104:0x0216  */
    /* JADX WARN: Code duplicated, block: B:106:0x0226  */
    /* JADX WARN: Code duplicated, block: B:109:0x0233  */
    /* JADX WARN: Code duplicated, block: B:111:0x0245  */
    /* JADX WARN: Code duplicated, block: B:113:0x024e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0250  */
    /* JADX WARN: Code duplicated, block: B:118:0x0259  */
    /* JADX WARN: Code duplicated, block: B:120:0x026d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0271  */
    /* JADX WARN: Code duplicated, block: B:124:0x027d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0294  */
    /* JADX WARN: Code duplicated, block: B:128:0x0298  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:136:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:138:0x02df  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:145:0x0307  */
    /* JADX WARN: Code duplicated, block: B:146:0x0309  */
    /* JADX WARN: Code duplicated, block: B:150:0x0312  */
    /* JADX WARN: Code duplicated, block: B:157:0x0345  */
    /* JADX WARN: Code duplicated, block: B:159:0x0350  */
    /* JADX WARN: Code duplicated, block: B:161:0x0358  */
    /* JADX WARN: Code duplicated, block: B:164:0x0363  */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:67:0x0137  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x0152  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:80:0x0171  */
    /* JADX WARN: Code duplicated, block: B:82:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:87:0x019e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01da  */
    /* JADX WARN: Code duplicated, block: B:96:0x01de  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX INFO: renamed from: H */
    public static final void m48619H(Modifier modifier, String str, InterfaceC15735d state, Function1 onViewEvent, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        String str2;
        boolean z4;
        Modifier modifier3;
        String str3;
        C28677v1 c28677v1M87180u;
        Object objM87133R;
        C28676v0 c28676v0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        String strM92103Y;
        int i16;
        boolean z13;
        Object objM87133R2;
        String strM44368b;
        String strM44367a;
        boolean z14;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        String strM44360b;
        String strM44359a;
        boolean z15;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        Object objM87133R9;
        int i17;
        boolean zM87157i;
        int i18;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(311451391);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i13 & 512) == 0) {
                    zM87157i = c28655q.m87153g(state);
                } else {
                    zM87157i = c28655q.m87157i(state);
                }
                if (zM87157i) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i15 |= i18;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i24 != 0) {
                    str2 = null;
                }
                float f13 = 4;
                float f14 = f13 * f13;
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12));
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = f.f66140w;
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1092a.m3358c(modifierM118994r, p745y81.Function1.m125323a((Function1) objM87133R).mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a), 2 * 8, 0.0f, 2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (str2 == null) {
                    c28655q.m87150e0(-1998691349);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173557n);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1998691814);
                    c28655q.m87173q(false);
                    strM92103Y = str2;
                }
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C16283a(onViewEvent, 12);
                    c28655q.m87172p0(objM87133R2);
                }
                m48616E(strM92103Y, (InterfaceC4339a) objM87133R2, c28655q, 0);
                if (state instanceof InterfaceC15735d.f) {
                    c28655q.m87150e0(-1998683507);
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = g.f66141w;
                        c28655q.m87172p0(objM87133R9);
                    }
                    m48644s(p745y81.Function1.m125323a((Function1) objM87133R9).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC15735d.d) {
                    c28655q.m87150e0(-1998678469);
                    m48624M(c28655q, 0);
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC15735d.e) {
                    c28655q.m87150e0(-1998676018);
                    m48612A((InterfaceC15735d.e) state, onViewEvent, c28655q, (i15 >> 6) & 126);
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC15735d.b) {
                    c28655q.m87150e0(-1998670634);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = h.f66142w;
                        c28655q.m87172p0(objM87133R8);
                    }
                    m48644s(p745y81.Function1.m125323a((Function1) objM87133R8).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC15735d.c) {
                    c28655q.m87150e0(-1998665021);
                    int i25 = AbstractC16272a.f61965N;
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = i.f66143w;
                        c28655q.m87172p0(objM87133R7);
                    }
                    m48646u(i25, p745y81.Function1.m125323a((Function1) objM87133R7).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC15735d.a) {
                    c28655q.m87150e0(-1998656950);
                    InterfaceC15735d.a aVar = (InterfaceC15735d.a) state;
                    strM44360b = aVar.getTitle();
                    if (strM44360b == null) {
                        c28655q.m87150e0(-1998655328);
                        strM44360b = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173548e);
                    } else {
                        c28655q.m87150e0(-1998655793);
                    }
                    c28655q.m87173q(false);
                    strM44359a = aVar.getSubtitle();
                    if (strM44359a == null) {
                        c28655q.m87150e0(-1998652068);
                        strM44359a = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173565v);
                    } else {
                        c28655q.m87150e0(-1998652626);
                    }
                    c28655q.m87173q(false);
                    if (i16 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z15 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C16283a(onViewEvent, 15);
                        c28655q.m87172p0(objM87133R6);
                    }
                    m48642q(strM44360b, strM44359a, (InterfaceC4339a) objM87133R6, c28655q, 0);
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC15735d.h) {
                    c28655q.m87150e0(-1998644778);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = j.f66144w;
                        c28655q.m87172p0(objM87133R5);
                    }
                    m48644s(p745y81.Function1.m125323a((Function1) objM87133R5).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC15735d.i) {
                    c28655q.m87150e0(-1998639197);
                    int i26 = AbstractC16272a.f61965N;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = k.f66145w;
                        c28655q.m87172p0(objM87133R4);
                    }
                    m48646u(i26, p745y81.Function1.m125323a((Function1) objM87133R4).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (state instanceof InterfaceC15735d.g) {
                        throw AbstractC11895b.m32003v(-1998683856, c28655q, false);
                    }
                    c28655q.m87150e0(-1998631166);
                    InterfaceC15735d.g gVar = (InterfaceC15735d.g) state;
                    strM44368b = gVar.getTitle();
                    if (strM44368b == null) {
                        c28655q.m87150e0(-1998629536);
                        strM44368b = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173548e);
                    } else {
                        c28655q.m87150e0(-1998630001);
                    }
                    c28655q.m87173q(false);
                    strM44367a = gVar.getSubtitle();
                    if (strM44367a == null) {
                        c28655q.m87150e0(-1998626276);
                        strM44367a = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173565v);
                    } else {
                        c28655q.m87150e0(-1998626834);
                    }
                    c28655q.m87173q(false);
                    if (i16 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z14 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C16283a(onViewEvent, 16);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m48642q(strM44368b, strM44367a, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if ((state instanceof InterfaceC15735d.e) || !((InterfaceC15735d.e) state).getShowDeleteConfirmation()) {
                    c28655q.m87150e0(1321901763);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1321842181);
                    m48648w(onViewEvent, c28655q, (i15 >> 9) & 14);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(modifier3, str3, state, onViewEvent, i13, i14, 10);
            }
        }
        i15 |= 48;
        str2 = str;
        if ((i13 & 384) == 0) {
            if ((i13 & 512) == 0) {
                zM87157i = c28655q.m87153g(state);
            } else {
                zM87157i = c28655q.m87157i(state);
            }
            if (zM87157i) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i24 != 0) {
                str2 = null;
            }
            float f15 = 4;
            float f16 = f15 * f15;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier3), AbstractC33253j.m105491g(f16, f16, 0.0f, 0.0f, 12));
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = f.f66140w;
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1092a.m3358c(modifierM118994r2, p745y81.Function1.m125323a((Function1) objM87133R).mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a), 2 * 8, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (str2 == null) {
                c28655q.m87150e0(-1998691349);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173557n);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1998691814);
                c28655q.m87173q(false);
                strM92103Y = str2;
            }
            i16 = i15 & 7168;
            if (i16 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C16283a(onViewEvent, 12);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C16283a(onViewEvent, 12);
                c28655q.m87172p0(objM87133R2);
            }
            m48616E(strM92103Y, (InterfaceC4339a) objM87133R2, c28655q, 0);
            if (state instanceof InterfaceC15735d.f) {
                c28655q.m87150e0(-1998683507);
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = g.f66141w;
                    c28655q.m87172p0(objM87133R9);
                }
                m48644s(p745y81.Function1.m125323a((Function1) objM87133R9).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                c28655q.m87173q(false);
            } else if (state instanceof InterfaceC15735d.d) {
                c28655q.m87150e0(-1998678469);
                m48624M(c28655q, 0);
                c28655q.m87173q(false);
            } else if (state instanceof InterfaceC15735d.e) {
                c28655q.m87150e0(-1998676018);
                m48612A((InterfaceC15735d.e) state, onViewEvent, c28655q, (i15 >> 6) & 126);
                c28655q.m87173q(false);
            } else if (state instanceof InterfaceC15735d.b) {
                c28655q.m87150e0(-1998670634);
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = h.f66142w;
                    c28655q.m87172p0(objM87133R8);
                }
                m48644s(p745y81.Function1.m125323a((Function1) objM87133R8).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                c28655q.m87173q(false);
            } else if (state instanceof InterfaceC15735d.c) {
                c28655q.m87150e0(-1998665021);
                int i27 = AbstractC16272a.f61965N;
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = i.f66143w;
                    c28655q.m87172p0(objM87133R7);
                }
                m48646u(i27, p745y81.Function1.m125323a((Function1) objM87133R7).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                c28655q.m87173q(false);
            } else if (state instanceof InterfaceC15735d.a) {
                c28655q.m87150e0(-1998656950);
                InterfaceC15735d.a aVar2 = (InterfaceC15735d.a) state;
                strM44360b = aVar2.getTitle();
                if (strM44360b == null) {
                    c28655q.m87150e0(-1998655328);
                    strM44360b = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173548e);
                } else {
                    c28655q.m87150e0(-1998655793);
                }
                c28655q.m87173q(false);
                strM44359a = aVar2.getSubtitle();
                if (strM44359a == null) {
                    c28655q.m87150e0(-1998652068);
                    strM44359a = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173565v);
                } else {
                    c28655q.m87150e0(-1998652626);
                }
                c28655q.m87173q(false);
                if (i16 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z15) {
                    objM87133R6 = new C16283a(onViewEvent, 15);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C16283a(onViewEvent, 15);
                    c28655q.m87172p0(objM87133R6);
                }
                m48642q(strM44360b, strM44359a, (InterfaceC4339a) objM87133R6, c28655q, 0);
                c28655q.m87173q(false);
            } else if (state instanceof InterfaceC15735d.h) {
                c28655q.m87150e0(-1998644778);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = j.f66144w;
                    c28655q.m87172p0(objM87133R5);
                }
                m48644s(p745y81.Function1.m125323a((Function1) objM87133R5).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                c28655q.m87173q(false);
            } else if (state instanceof InterfaceC15735d.i) {
                c28655q.m87150e0(-1998639197);
                int i28 = AbstractC16272a.f61965N;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = k.f66145w;
                    c28655q.m87172p0(objM87133R4);
                }
                m48646u(i28, p745y81.Function1.m125323a((Function1) objM87133R4).mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                if (state instanceof InterfaceC15735d.g) {
                    throw AbstractC11895b.m32003v(-1998683856, c28655q, false);
                }
                c28655q.m87150e0(-1998631166);
                InterfaceC15735d.g gVar2 = (InterfaceC15735d.g) state;
                strM44368b = gVar2.getTitle();
                if (strM44368b == null) {
                    c28655q.m87150e0(-1998629536);
                    strM44368b = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173548e);
                } else {
                    c28655q.m87150e0(-1998630001);
                }
                c28655q.m87173q(false);
                strM44367a = gVar2.getSubtitle();
                if (strM44367a == null) {
                    c28655q.m87150e0(-1998626276);
                    strM44367a = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173565v);
                } else {
                    c28655q.m87150e0(-1998626834);
                }
                c28655q.m87173q(false);
                if (i16 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z14) {
                    objM87133R3 = new C16283a(onViewEvent, 16);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C16283a(onViewEvent, 16);
                    c28655q.m87172p0(objM87133R3);
                }
                m48642q(strM44368b, strM44367a, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (state instanceof InterfaceC15735d.e) {
                c28655q.m87150e0(1321901763);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1321901763);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        str3 = str2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(modifier3, str3, state, onViewEvent, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m48620I(Function1 function1) {
        function1.invoke(InterfaceC15733b.d.f59253a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m48621J(Function1 function1) {
        function1.invoke(InterfaceC15733b.b.f59251a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m48622K(Function1 function1) {
        function1.invoke(InterfaceC15733b.f.f59255a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m48623L(Modifier modifier, String str, InterfaceC15735d interfaceC15735d, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m48619H(modifier, str, interfaceC15735d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final void m48624M(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-345459934);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, f13 * f13, 1);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173559p);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8419Q = c38072d.m121952e(c28655q, i14).getT4();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = l.f66146w;
                c28655q.m87172p0(objM87133R);
            }
            long jMo134584toComposableColorWaAFU9c = p745y81.Function1.m125323a((Function1) objM87133R).mo134584toComposableColorWaAFU9c(c28655q, 0);
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM92103Y, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8419Q, null, c28655q, 0, i15, 196602);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC40203a.f173558o);
            C2886a c2886aM8421b = c38072d.m121952e(c28655q, i14).getB2();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = m.f66147w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC30795n.m94707h(strM92103Y2, null, p745y81.Function1.m125323a((Function1) objM87133R2).mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 0, i15, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m48625N(int i13, Composer composer, int i14) {
        m48624M(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m48642q(String str, String str2, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        String str3;
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1186425504);
        if ((i13 & 6) == 0) {
            str3 = str;
            i14 = (c28655q2.m87153g(str3) ? 4 : 2) | i13;
        } else {
            str3 = str;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13 * f13, 1);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, C2299e.f9111N, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            int i15 = AbstractC16272a.f62158t;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f66135w;
                c28655q2.m87172p0(objM87133R);
            }
            m48646u(i15, p745y81.Function1.m125323a((Function1) objM87133R).mo134584toComposableColorWaAFU9c(c28655q2, 0), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8419Q = c38072d.m121952e(c28655q2, i16).getT4();
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = b.f66136w;
                c28655q2.m87172p0(objM87133R2);
            }
            int i17 = C2886a.f11498d << 18;
            int i18 = i14;
            AbstractC30795n.m94707h(str3, null, p745y81.Function1.m125323a((Function1) objM87133R2).mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8419Q, null, c28655q2, i14 & 14, i17, 196090);
            C2886a c2886aM8421b = c38072d.m121952e(c28655q2, i16).getB2();
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = c.f66137w;
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC30795n.m94707h(str2, null, p745y81.Function1.m125323a((Function1) objM87133R3).mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q2, (i18 >> 3) & 14, i17, 196090);
            AbstractC27292z.m82343j(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4 * f13, 0.0f, 0.0f, 13), false, false, null, null, null, AbstractC8693b.m21277k(AbstractC40203a.f173560q), null, null, null, 0.0f, null, null, interfaceC4339a, c28655q2, (TextResource.C8688b.f25889c << 18) | 6, (i18 << 3) & 7168, 8126);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12909h0(str, str2, interfaceC4339a, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m48643r(String str, String str2, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m48642q(str, str2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m48644s(long j7, Composer composer, int i13) {
        int i14;
        long j13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1692852819);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3411h = AbstractC1102d.m3411h(50 * 4, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            j13 = j7;
            AbstractC15170v4.m43202b(null, j13, 0.0f, 0L, 0, c28655q, (i14 << 3) & 112, 29);
            c28655q.m87173q(true);
        } else {
            j13 = j7;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14222c(i13, j13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m48645t(long j7, int i13, Composer composer, int i14) {
        m48644s(j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m48646u(int i13, long j7, Composer composer, int i14) {
        int i15;
        int i16 = i13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1139531162);
        if ((i14 & 6) == 0) {
            i15 = i14 | (c28655q.m87149e(i16) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM3411h = AbstractC1102d.m3411h(50 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C2307m c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            int i17 = i15;
            Modifier modifierM3419p = AbstractC1102d.m3419p(((float) 22.5d) * f13, c2314t);
            C13825t c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * f13, j7);
            Modifier modifierM44456i = AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifierM3419p, c13825tM48880a.f49346b, AbstractC33253j.f138651a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44456i);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            i16 = i13;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i16, c28655q, ((i17 << 3) & 112) | 6), null, AbstractC1102d.m3419p(8 * f13, c2314t), j7, c28655q, ((i17 << 6) & 7168) | 432, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4041i0(i16, i14, j7, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m48647v(int i13, long j7, int i14, Composer composer, int i15) {
        m48646u(i13, j7, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m48648w(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1762263023);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC40203a.f173556m);
            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC40203a.f173553j);
            TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC40203a.f173554k);
            TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC40203a.f173555l);
            int i15 = i14 & 14;
            boolean z4 = i15 == 4;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C16283a(function1, 13);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = i15 == 4;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C16283a(function1, 14);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            int i16 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, false, null, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, interfaceC4339a2, null, null, null, c28655q, (i16 << 3) | (i16 << 6) | (i16 << 9) | (i16 << 27), 384, 0, 247459313);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m48649x(Function1 function1) {
        function1.invoke(InterfaceC15733b.a.f59250a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m48650y(Function1 function1) {
        function1.invoke(InterfaceC15733b.b.f59251a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m48651z(Function1 function1, int i13, Composer composer, int i14) {
        m48648w(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

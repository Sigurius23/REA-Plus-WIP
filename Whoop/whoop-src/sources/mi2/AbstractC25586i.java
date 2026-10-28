package mi2;

import android.content.Context;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import di2.AbstractC12055a;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import hi2.C17316a;
import ih0.AbstractC18489d0;
import ih1.C18522f;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ji2.C21724c;
import ji2.C21725d;
import ji2.C21727f;
import ji2.C21733l;
import ji2.C21734m;
import ji2.InterfaceC21730i;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import mh.C25540h;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11894a;
import p127ev.AbstractC13673n;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24679k;
import p745y81.AbstractC39330c;
import pf.AbstractC29125c;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: mi2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\r\u001a+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\r\u001a+\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001d\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lji2/l;", "parentViewState", "Lkotlin/Function1;", "Lji2/i;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onBackPressed", "z", "(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lji2/f;", "viewState", "s", "(Lji2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "I", "(Landroidx/compose/ui/Modifier;Lji2/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "", "templateName", "L", "(Landroidx/compose/ui/Modifier;Lji2/f;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Lji2/d;", "", "automaticallyPostEnabled", "Lf0/t;", "N", "(Lji2/d;ZLandroidx/compose/runtime/Composer;I)Lf0/t;", "C", "v", "p", "strava_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25586i {

    /* JADX INFO: renamed from: mi2.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21725d f100383w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21727f f100384x;

        public a(C21725d c21725d, C21727f c21727f) {
            this.f100383w = c21725d;
            this.f100384x = c21727f;
        }

        /* JADX INFO: renamed from: a */
        public final void m75282a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            C25540h c25540h = new C25540h((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
            c25540h.f100079c = this.f100383w.getTemplateUrl();
            AbstractC11894a.m31954c(c25540h.m75117a(), this.f100383w.getTemplateName(), null, null, null, this.f100384x.getAutomaticallyPostEnabled() ? 1.0f : 0.3f, c28655q, 0, 892);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m75282a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mi2.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.strava.view.screen.StravaSettingsConnectedScreenKt$ConnectedScreenContent$1$4$1", m100430f = "StravaSettingsConnectedScreen.kt", m100431l = {299, 301}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f100385E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C21727f f100386F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C26068u f100387G;

        /* JADX INFO: renamed from: w */
        int f100388w;

        /* JADX INFO: renamed from: x */
        int f100389x;

        /* JADX INFO: renamed from: y */
        int f100390y;

        /* JADX INFO: renamed from: z */
        Object f100391z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C21727f c21727f, C26068u c26068u, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100386F = c21727f;
            this.f100387G = c26068u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f100386F, this.f100387G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (p180h0.AbstractC16444q3.m46621c(r8.f100387G, r5 - r9, p077d0.AbstractC11348f.m30573u(0.0f, 0.0f, 7, null), r8) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
        
            if (r9.m77563f(r4, 0, r8) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f100385E
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L15
                if (r1 != r3) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L15:
                java.lang.Object r0 = r8.f100391z
                n0.g r0 = (p329n0.InterfaceC26054g) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto La2
            L1e:
                p505ts.AbstractC34132o.m107864I(r9)
                ji2.f r9 = r8.f100386F
                java.util.List r9 = r9.m61244q()
                java.util.Iterator r9 = r9.iterator()
                r1 = 0
                r4 = r1
            L2d:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L43
                java.lang.Object r5 = r9.next()
                ji2.d r5 = (ji2.C21725d) r5
                boolean r5 = r5.getSelected()
                if (r5 == 0) goto L40
                goto L44
            L40:
                int r4 = r4 + 1
                goto L2d
            L43:
                r4 = -1
            L44:
                n0.u r9 = r8.f100387G
                n0.n r9 = r9.m77565h()
                java.lang.Object r9 = r9.f103177k
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.Iterator r9 = r9.iterator()
            L52:
                boolean r5 = r9.hasNext()
                r6 = 0
                if (r5 == 0) goto L67
                java.lang.Object r5 = r9.next()
                r7 = r5
                n0.g r7 = (p329n0.InterfaceC26054g) r7
                n0.o r7 = (p329n0.C26062o) r7
                int r7 = r7.f103184a
                if (r7 != r4) goto L52
                goto L68
            L67:
                r5 = r6
            L68:
                n0.g r5 = (p329n0.InterfaceC26054g) r5
                if (r5 == 0) goto L93
                n0.u r9 = r8.f100387G
                n0.n r9 = r9.m77565h()
                int r9 = r9.f103179m
                int r9 = r9 / r3
                n0.o r5 = (p329n0.C26062o) r5
                int r1 = r5.f103198o
                int r5 = r5.f103199p
                int r5 = r5 / r3
                int r5 = r5 + r1
                n0.u r1 = r8.f100387G
                int r3 = r5 - r9
                float r3 = (float) r3
                r8.f100391z = r6
                r8.f100388w = r4
                r8.f100389x = r9
                r8.f100390y = r5
                r8.f100385E = r2
                java.lang.Object r9 = p180h0.AbstractC16444q3.m46622d(r1, r3, r8)
                if (r9 != r0) goto La2
                goto La1
            L93:
                n0.u r9 = r8.f100387G
                r8.f100391z = r6
                r8.f100388w = r4
                r8.f100385E = r3
                java.lang.Object r9 = r9.m77563f(r4, r1, r8)
                if (r9 != r0) goto La2
            La1:
                return r0
            La2:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mi2.AbstractC25586i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: mi2.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f100392w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C21725d c21725d) {
            return null;
        }
    }

    /* JADX INFO: renamed from: mi2.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f100393w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f100394x;

        public d(Function1 function1, List list) {
            this.f100393w = function1;
            this.f100394x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m75284a(int i13) {
            return this.f100393w.invoke(this.f100394x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m75284a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: mi2.i$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f100395w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21727f f100396x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f100397y;

        public e(List list, C21727f c21727f, Function1 function1) {
            this.f100395w = list;
            this.f100396x = c21727f;
            this.f100397y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m75285a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C21725d c21725d = (C21725d) this.f100395w.get(i13);
            c28655q.m87150e0(-399953764);
            if (c21725d.getTemplateUrl().length() > 0) {
                c28655q.m87150e0(-399888014);
                float f13 = 4;
                AbstractC12889b.m36263b(AbstractC25586i.m75253L(C2314t.f9131w, this.f100396x, this.f100397y, c21725d.getTemplateName()), AbstractC33253j.m105489e(((float) 1.5d) * f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkAlt(), AbstractC25586i.m75255N(c21725d, this.f100396x.getAutomaticallyPostEnabled(), c28655q, 0), f13, AbstractC37817c.m121344e(1389408693, c28655q, new a(c21725d, this.f100396x)), c28655q, 1769472, 8);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-398888977);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m75285a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m75242A(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m75243B(C21733l c21733l, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m75281z(c21733l, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m75244C(C21727f c21727f, Function1 function1, Composer composer, int i13) {
        int i14;
        C21727f c21727f2;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1141828592);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c21727f) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, 8, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(c21727f.getAutomaticallyPostDisplay(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c21727f2 = c21727f;
            function2 = function1;
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i15).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(1683795493, c28655q, new C25581d(0, c21727f2, function1)), c28655q, 24576, 13);
            c28655q.m87173q(true);
        } else {
            c21727f2 = c21727f;
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25582e(c21727f2, function2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m75245D(C21727f c21727f, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "strava_toggle");
            boolean zM61232e = c21727f.getAutomaticallyPostEnabled();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c21727f);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C25583f(function1, c21727f);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(modifierM3599a, zM61232e, false, 0L, null, null, (Function1) objM87133R, c28655q, 6, 60);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m75246E(Function1 function1, C21727f c21727f, boolean z4) {
        List<C21724c> listM61241n = c21727f.m61241n();
        boolean z13 = true;
        if (!(listM61241n instanceof Collection) || !listM61241n.isEmpty()) {
            Iterator<T> it = listM61241n.iterator();
            while (it.hasNext()) {
                if (!((C21724c) it.next()).getSelected()) {
                    z13 = false;
                    break;
                }
            }
        }
        boolean z14 = z13;
        for (C21725d c21725d : c21727f.m61244q()) {
            if (c21725d.getSelected()) {
                function1.invoke(new InterfaceC21730i.m(new C21734m(z4, z14, c21725d.getTemplateName(), c21727f.m61241n(), false, c21727f.getAutomaticallyImportEnabled(), 16, null)));
                return C23454a0.f92919a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m75247F(C21727f c21727f, Function1 function1, int i13, Composer composer, int i14) {
        m75244C(c21727f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final Modifier m75250I(Modifier modifier, C21727f c21727f, Function1 function1) {
        return AbstractC37056f.m118997u(modifier, new C18522f(24, c21727f, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final Modifier m75251J(C21727f c21727f, Function1 function1, Modifier composed, Composer composer, int i13) {
        Modifier modifierM3394p;
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(884335017);
        if (c21727f.getAutomaticallyPostEnabled()) {
            c28655q.m87150e0(-104812408);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, AbstractC31061c.m95629e(composed, (float) 1.5d, 4, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10())));
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c21727f);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C25584g(0, c21727f, function1);
                c28655q.m87172p0(objM87133R);
            }
            modifierM3394p = AbstractC1092a.m3362g(modifierM3394p2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-103429963);
            modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, AbstractC31061c.m95629e(composed, (float) 1.5d, 4, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5())));
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return modifierM3394p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m75252K(Function1 function1, C21727f c21727f) {
        TextResource textResourceM61198b = c21727f.getSelectedActivitiesItem().getMenuItemTitle();
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC12055a.f39972g);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC12055a.f39973h);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC12055a.f39966a);
        List<C21724c> listM61241n = c21727f.m61241n();
        boolean z4 = true;
        if (!(listM61241n instanceof Collection) || !listM61241n.isEmpty()) {
            Iterator<T> it = listM61241n.iterator();
            while (it.hasNext()) {
                if (!((C21724c) it.next()).getSelected()) {
                    z4 = false;
                    break;
                }
            }
        }
        TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC12055a.f39971f);
        TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC12055a.f39970e);
        List<C21724c> listM61241n2 = c21727f.m61241n();
        TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC12055a.f39974i);
        for (C21725d c21725d : c21727f.m61244q()) {
            if (c21725d.getSelected()) {
                function1.invoke(new InterfaceC21730i.l(textResourceM61198b, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, z4, c8688bM21277k4, c8688bM21277k5, listM61241n2, c8688bM21277k6, c21725d.getTemplateName(), c21727f.getAutomaticallyImportEnabled()));
                return C23454a0.f92919a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Modifier m75253L(Modifier modifier, C21727f c21727f, Function1 function1, String str) {
        return c21727f.getAutomaticallyPostEnabled() ? AbstractC1092a.m3362g(AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 2 * 4, 0.0f, 11), false, null, null, new C18656a0(function1, c21727f, str), 15) : AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 2 * 4, 0.0f, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m75254M(Function1 function1, C21727f c21727f, String str) {
        List<C21724c> listM61241n = c21727f.m61241n();
        boolean z4 = true;
        if (!(listM61241n instanceof Collection) || !listM61241n.isEmpty()) {
            Iterator<T> it = listM61241n.iterator();
            while (it.hasNext()) {
                if (!((C21724c) it.next()).getSelected()) {
                    z4 = false;
                    break;
                }
            }
        }
        function1.invoke(new InterfaceC21730i.n(new C21734m(true, z4, str, c21727f.m61241n(), false, c21727f.getAutomaticallyImportEnabled(), 16, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C13825t m75255N(C21725d c21725d, boolean z4, Composer composer, int i13) {
        long jM51541c;
        if (!c21725d.getSelected()) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1382198371);
            c28655q.m87173q(false);
            return null;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1381995042);
        float f13 = 2;
        if (z4) {
            c28655q2.m87150e0(1382061661);
            jM51541c = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
            c28655q2.m87173q(false);
        } else {
            c28655q2.m87150e0(1382117802);
            jM51541c = C17919x.m51541c(0.2f, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery());
            c28655q2.m87173q(false);
        }
        C13825t c13825tM48880a = AbstractC17269i.m48880a(f13, jM51541c);
        c28655q2.m87173q(false);
        return c13825tM48880a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m75271p(C21727f c21727f, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-412550874);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c21727f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f13, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h = AbstractC8693b.m21274h(c21727f.getButtonDisplay(), c28655q, TextResource.$stable);
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            long jM125430y = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
            boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(c21727f);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C25584g(1, c21727f, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3394p, enumC27284v, strM21274h, false, jM125430y, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25582e(c21727f, function1, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m75272q(Function1 function1, C21727f c21727f) {
        function1.invoke(new InterfaceC21730i.b(new C17316a(c21727f.getDisconnectBubbleTitleDisplay(), c21727f.getDisconnectBubbleDescriptionDisplay(), c21727f.getDisconnectBubbleConfirmButtonDisplay(), c21727f.getDisconnectBubbleCancelButtonDisplay())));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m75273r(C21727f c21727f, Function1 function1, int i13, Composer composer, int i14) {
        m75271p(c21727f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05af  */
    /* JADX WARN: Code duplicated, block: B:102:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:103:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:107:0x0628  */
    /* JADX WARN: Code duplicated, block: B:108:0x062a  */
    /* JADX WARN: Code duplicated, block: B:114:0x063a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0676  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0139  */
    /* JADX WARN: Code duplicated, block: B:40:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0213  */
    /* JADX WARN: Code duplicated, block: B:50:0x024b  */
    /* JADX WARN: Code duplicated, block: B:51:0x024f  */
    /* JADX WARN: Code duplicated, block: B:56:0x026a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0361  */
    /* JADX WARN: Code duplicated, block: B:60:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0432  */
    /* JADX WARN: Code duplicated, block: B:65:0x043a  */
    /* JADX WARN: Code duplicated, block: B:70:0x045a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0473  */
    /* JADX WARN: Code duplicated, block: B:80:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:81:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:86:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:89:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0548  */
    /* JADX WARN: Code duplicated, block: B:95:0x0555  */
    /* JADX WARN: Code duplicated, block: B:98:0x05a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v25, types: [int] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    public static final void m75274s(C21727f viewState, Function1 onViewEvent, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C21727f c21727f;
        C28655q c28655q;
        int i15;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        C0213j c0213j;
        C2314t c2314t;
        C0209i c0209i;
        C2305k c2305k;
        C0209i c0209i2;
        boolean z4;
        long j7;
        C28655q c28655q2;
        int i16;
        C38072d c38072d;
        int i17;
        int i18;
        C28655q c28655q3;
        float f18;
        int iHashCode;
        C2314t c2314t2;
        C0213j c0213j2;
        float f19;
        int iHashCode2;
        C0213j c0213j3;
        C28655q c28655q4;
        C2305k c2305k2;
        float f24;
        float f25;
        C28655q c28655q5;
        int i19;
        int iHashCode3;
        C0213j c0213j4;
        C0209i c0209i3;
        int iHashCode4;
        long jM95627c;
        C38072d c38072d2;
        C28655q c28655q6;
        long jM125370W0;
        boolean z13;
        long jM95627c2;
        ?? r14;
        C26068u c26068uM77569a;
        ?? r15;
        int i24;
        Object obj;
        boolean zM87157i;
        Object obj2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(-1947909755);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q7.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q7.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q7.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f26 = 8;
            float f27 = 2 * f26;
            float f28 = 4;
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t3, f27, 0.0f, f27, f28 * f26, 2);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f27);
            C2305k c2305k3 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k3, c28655q7, 6);
            int iHashCode5 = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j5 = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(c0213j5);
            } else {
                c28655q7.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q7, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q7.f115903S) {
                i15 = i14;
            } else {
                i15 = i14;
                if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode5))) {
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N);
                f13 = 1;
                f14 = f13 * f26;
                AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3411h(f14, c2314t3));
                if (viewState.getIconUrl().length() > 0) {
                    c28655q7.m87150e0(-1300330972);
                    C25540h c25540h = new C25540h((Context) c28655q7.m87161k(AndroidCompositionLocals_androidKt.f4976b));
                    c25540h.f100079c = viewState.getIconUrl();
                    f17 = f26;
                    c2305k = c2305k3;
                    c0209i2 = c0209i4;
                    f15 = f28;
                    f16 = f14;
                    c0213j = c0213j5;
                    c2314t = c2314t3;
                    c0209i = c0209i5;
                    z4 = false;
                    j7 = 4602678819172646912L;
                    AbstractC11894a.m31954c(c25540h.m75117a(), null, AbstractC1102d.m3411h(6 * f17, AbstractC25589l.m75313z(c2314t3, ((float) 0.5d) * f17)), null, C39102j.f168201c, 0.0f, c28655q7, 1572912, 952);
                    C28655q c28655q8 = c28655q7;
                    c28655q8.m87173q(false);
                    c28655q2 = c28655q8;
                } else {
                    f15 = f28;
                    f16 = f14;
                    f17 = f26;
                    c0213j = c0213j5;
                    c2314t = c2314t3;
                    c0209i = c0209i5;
                    c2305k = c2305k3;
                    c0209i2 = c0209i4;
                    z4 = false;
                    j7 = 4602678819172646912L;
                    c28655q7.m87150e0(-1299937613);
                    c28655q7.m87173q(false);
                    c28655q2 = c28655q7;
                }
                TextResource textResourceM61248u = viewState.getTitleDisplay();
                i16 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM61248u, c28655q2, i16);
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q2, i17).getBrandWhite();
                C2886a c2886aM8416N = c38072d.m121952e(c28655q2, i17).getT1();
                i18 = C2886a.f11498d << 18;
                c28655q3 = c28655q2;
                f18 = f17;
                C2305k c2305k4 = c2305k;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q3, 0, i18, 196602);
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q3, 48);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                c2314t2 = c2314t;
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c0213j2 = c0213j;
                    c28655q3.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q3.m87178s0();
                }
                C0209i c0209i8 = c0209i2;
                AbstractC28683x.m87239G(c28655q3, c0209i8, c22994r1M66759a);
                C0209i c0209i9 = c0209i;
                AbstractC28683x.m87239G(c28655q3, c0209i9, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N2);
                f19 = 6 * f15;
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3419p(f19, c2314t2), c38072d.m121949b(c28655q3, i17).getAccentPositiveTrend15(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3358c);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q3, c0209i9, interfaceC28653p1M87165m3);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N3);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(viewState.getStatusIcon().getIcon(), c28655q3, 6), AbstractC8693b.m21274h(viewState.getStatusIcon().getContentDescription(), c28655q3, i16), AbstractC1102d.m3419p(((float) 2.5d) * f15, c2314t2), c38072d.m121949b(c28655q3, i17).getAccentAction(), c28655q3, 384, 0);
                AbstractC17176i.m48516r(c28655q3, true, c2314t2, f16, c28655q3);
                c0213j3 = c0213j2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getStatusDisplay(), c28655q3, i16), null, c38072d.m121949b(c28655q3, i17).getAccentAction(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, c28655q3, 0, i18, 196602);
                AbstractC18489d0.m53356B(c28655q3, true, c2314t2, f16, c28655q3);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescriptionDisplay(), c28655q3, i16), null, c38072d.m121949b(c28655q3, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i17).getB1(), null, c28655q3, 0, i18, 196602);
                c28655q4 = c28655q3;
                AbstractC11266d.m30469w((float) 0.5d, f18, c2314t2, c28655q4);
                c2305k2 = C2299e.f9111N;
                AbstractC15751g.m44449b(AbstractC1102d.m3409f(1.0f, new HorizontalAlignElement(c2305k2)), c38072d.m121949b(c28655q4, i17).getWhite10(), f13, 0.0f, c28655q4, 384, 8);
                if (viewState.getShowImportToggle()) {
                    c28655q4.m87150e0(-1298180998);
                    m75277v(viewState, onViewEvent, c28655q4, i15 & 126);
                    f25 = 1.0f;
                    f24 = f18;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getAutomaticallyImportDescriptionDisplay(), c28655q4, i16), null, c38072d.m121949b(c28655q4, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, i17).getB2(), null, c28655q4, 0, i18, 196602);
                    C28655q c28655q9 = c28655q4;
                    AbstractC15751g.m44449b(AbstractC1102d.m3409f(1.0f, new HorizontalAlignElement(c2305k2)), c38072d.m121949b(c28655q9, i17).getWhite10(), f13, 0.0f, c28655q9, 384, 8);
                    c28655q9.m87173q(false);
                    c28655q5 = c28655q9;
                } else {
                    f24 = f18;
                    f25 = 1.0f;
                    c28655q4.m87150e0(-1297572685);
                    c28655q4.m87173q(false);
                    c28655q5 = c28655q4;
                }
                i19 = i15 & 112;
                m75244C(viewState, onViewEvent, c28655q5, i15 & 126);
                Modifier modifierM75250I = m75250I(c2314t2, viewState, onViewEvent);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q5, 54);
                iHashCode3 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q5.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q5, modifierM75250I);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c0213j4 = c0213j3;
                    c28655q5.m87163l(c0213j4);
                } else {
                    c0213j4 = c0213j3;
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i8, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q5, c0209i9, interfaceC28653p1M87165m4);
                if (c28655q5.f115903S && AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode3))) {
                    c0209i3 = c0209i6;
                } else {
                    c0209i3 = c0209i6;
                    AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i7, modifierM118962N4);
                if (f25 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(new LayoutWeightElement(f25, true), 0.0f, 0.0f, f13, 0.0f, 11);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k4, c28655q5, 0);
                iHashCode4 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q5.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q5, modifierM3398t2);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j4);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i8, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q5, c0209i9, interfaceC28653p1M87165m5);
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i7, modifierM118962N5);
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getSelectedActivitiesItem().getMenuItemTitle(), c28655q5, i16);
                if (viewState.getAutomaticallyPostEnabled()) {
                    C38072d c38072d3 = c38072d;
                    jM95627c = AbstractC25012a.m73366B(c28655q5, 1300711192, c38072d3, c28655q5, i17);
                    c28655q5.m87173q(false);
                    c38072d2 = c38072d3;
                } else {
                    C38072d c38072d4 = c38072d;
                    jM95627c = AbstractC31061c.m95627c(c28655q5, 1300792443, c38072d4, c28655q5, i17);
                    c28655q5.m87173q(false);
                    c38072d2 = c38072d4;
                }
                c28655q6 = c28655q5;
                AbstractC30795n.m94707h(strM21274h2, null, jM95627c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q5, i17).getH4(), null, c28655q6, 0, i18, 196602);
                String strM21274h3 = AbstractC8693b.m21274h(viewState.getSelectedActivitiesItem().getMenuItemSubtitle(), c28655q6, i16);
                if (viewState.getAutomaticallyPostEnabled()) {
                    jM125370W0 = AbstractC31061c.m95627c(c28655q6, 1301122779, c38072d2, c28655q6, i17);
                    c28655q6.m87173q(false);
                } else {
                    c28655q6.m87150e0(1301201147);
                    jM125370W0 = c38072d2.m121949b(c28655q6, i17).getWhite10();
                    c28655q6.m87173q(false);
                }
                AbstractC30795n.m94707h(strM21274h3, null, jM125370W0, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q6, i17).getB4(), null, c28655q6, 0, i18, 196602);
                c28655q6.m87173q(true);
                if (viewState.getSelectedActivitiesItem().getRightIcon() == null) {
                    c28655q6.m87150e0(1372350909);
                    r14 = 0;
                    c28655q6.m87173q(false);
                } else {
                    c28655q6.m87150e0(1372350910);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(viewState.getSelectedActivitiesItem().getRightIcon().getIcon(), c28655q6, 6);
                    String strM21274h4 = AbstractC8693b.m21274h(viewState.getSelectedActivitiesItem().getRightIcon().getContentDescription(), c28655q6, i16);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f19, c2314t2);
                    if (viewState.getAutomaticallyPostEnabled()) {
                        jM95627c2 = AbstractC25012a.m73366B(c28655q6, -2034779902, c38072d2, c28655q6, i17);
                        z13 = false;
                        c28655q6.m87173q(false);
                    } else {
                        z13 = false;
                        jM95627c2 = AbstractC31061c.m95627c(c28655q6, -2034698651, c38072d2, c28655q6, i17);
                        c28655q6.m87173q(false);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S, strM21274h4, modifierM3419p, jM95627c2, c28655q6, 384, 0);
                    c28655q6.m87173q(z13);
                    r14 = z13;
                }
                c28655q6.m87173q(true);
                float f29 = f24;
                AbstractC11266d.m30469w((float) 0.8d, f29, c2314t2, c28655q6);
                c26068uM77569a = AbstractC26071x.m77569a(r14, r14, c28655q6, 3);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                boolean zM87157i2 = c28655q6.m87157i(viewState);
                if (i19 == 32) {
                    r15 = 1;
                } else {
                    r15 = r14;
                }
                i24 = (zM87157i2 ? 1 : 0) | r15;
                Object objM87133R = c28655q6.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (i24 == 0 || objM87133R == c28676v0) {
                    C25583f c25583f = new C25583f(2, viewState, onViewEvent);
                    c28655q6.m87172p0(c25583f);
                    obj = c25583f;
                } else {
                    obj = objM87133R;
                }
                C38072d c38072d5 = c38072d2;
                c21727f = viewState;
                AbstractC22674j.m65718d(modifierM3409f, c26068uM77569a, null, null, null, null, false, null, (Function1) obj, c28655q6, 6, 508);
                zM87157i = c28655q6.m87157i(c21727f) | c28655q6.m87153g(c26068uM77569a);
                Object objM87133R2 = c28655q6.m87133R();
                obj2 = objM87133R2;
                if (zM87157i || objM87133R2 == c28676v0) {
                    b bVar = new b(c21727f, c26068uM77569a, null);
                    c28655q6.m87172p0(bVar);
                    obj2 = bVar;
                }
                AbstractC28683x.m87253g(c28655q6, (InterfaceC4351m) obj2, C23454a0.f92919a);
                AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3411h(((float) 0.2d) * f29, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c21727f.getShareableGraphicDescriptionDisplay(), c28655q6, i16), null, c38072d5.m121949b(c28655q6, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q6, i17).getB2(), null, c28655q6, 0, i18, 196602);
                C28655q c28655q10 = c28655q6;
                c28655q10.m87173q(true);
                c28655q = c28655q10;
            }
            AbstractC11266d.m30471y(iHashCode5, c28655q7, iHashCode5, c0209i6);
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q7, c0209i10, modifierM118962N);
            f13 = 1;
            f14 = f13 * f26;
            AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3411h(f14, c2314t3));
            if (viewState.getIconUrl().length() > 0) {
                c28655q7.m87150e0(-1300330972);
                C25540h c25540h2 = new C25540h((Context) c28655q7.m87161k(AndroidCompositionLocals_androidKt.f4976b));
                c25540h2.f100079c = viewState.getIconUrl();
                f17 = f26;
                c2305k = c2305k3;
                c0209i2 = c0209i4;
                f15 = f28;
                f16 = f14;
                c0213j = c0213j5;
                c2314t = c2314t3;
                c0209i = c0209i5;
                z4 = false;
                j7 = 4602678819172646912L;
                AbstractC11894a.m31954c(c25540h2.m75117a(), null, AbstractC1102d.m3411h(6 * f17, AbstractC25589l.m75313z(c2314t3, ((float) 0.5d) * f17)), null, C39102j.f168201c, 0.0f, c28655q7, 1572912, 952);
                C28655q c28655q11 = c28655q7;
                c28655q11.m87173q(false);
                c28655q2 = c28655q11;
            } else {
                f15 = f28;
                f16 = f14;
                f17 = f26;
                c0213j = c0213j5;
                c2314t = c2314t3;
                c0209i = c0209i5;
                c2305k = c2305k3;
                c0209i2 = c0209i4;
                z4 = false;
                j7 = 4602678819172646912L;
                c28655q7.m87150e0(-1299937613);
                c28655q7.m87173q(false);
                c28655q2 = c28655q7;
            }
            TextResource textResourceM61248u2 = viewState.getTitleDisplay();
            i16 = TextResource.$stable;
            String strM21274h5 = AbstractC8693b.m21274h(textResourceM61248u2, c28655q2, i16);
            c38072d = C38072d.f163053a;
            i17 = C38072d.f163054b;
            long jM125430y2 = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            C2886a c2886aM8416N2 = c38072d.m121952e(c28655q2, i17).getT1();
            i18 = C2886a.f11498d << 18;
            c28655q3 = c28655q2;
            f18 = f17;
            C2305k c2305k5 = c2305k;
            AbstractC30795n.m94707h(strM21274h5, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N2, null, c28655q3, 0, i18, 196602);
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q3, 48);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
            c2314t2 = c2314t;
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, c2314t2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c0213j2 = c0213j;
                c28655q3.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                c28655q3.m87178s0();
            }
            C0209i c0209i11 = c0209i2;
            AbstractC28683x.m87239G(c28655q3, c0209i11, c22994r1M66759a3);
            C0209i c0209i12 = c0209i;
            AbstractC28683x.m87239G(c28655q3, c0209i12, interfaceC28653p1M87165m6);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i10, modifierM118962N6);
            f19 = 6 * f15;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3419p(f19, c2314t2), c38072d.m121949b(c28655q3, i17).getAccentPositiveTrend15(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifierM3358c2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q3, c0209i12, interfaceC28653p1M87165m7);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i10, modifierM118962N7);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(viewState.getStatusIcon().getIcon(), c28655q3, 6), AbstractC8693b.m21274h(viewState.getStatusIcon().getContentDescription(), c28655q3, i16), AbstractC1102d.m3419p(((float) 2.5d) * f15, c2314t2), c38072d.m121949b(c28655q3, i17).getAccentAction(), c28655q3, 384, 0);
            AbstractC17176i.m48516r(c28655q3, true, c2314t2, f16, c28655q3);
            c0213j3 = c0213j2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getStatusDisplay(), c28655q3, i16), null, c38072d.m121949b(c28655q3, i17).getAccentAction(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, c28655q3, 0, i18, 196602);
            AbstractC18489d0.m53356B(c28655q3, true, c2314t2, f16, c28655q3);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescriptionDisplay(), c28655q3, i16), null, c38072d.m121949b(c28655q3, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i17).getB1(), null, c28655q3, 0, i18, 196602);
            c28655q4 = c28655q3;
            AbstractC11266d.m30469w((float) 0.5d, f18, c2314t2, c28655q4);
            c2305k2 = C2299e.f9111N;
            AbstractC15751g.m44449b(AbstractC1102d.m3409f(1.0f, new HorizontalAlignElement(c2305k2)), c38072d.m121949b(c28655q4, i17).getWhite10(), f13, 0.0f, c28655q4, 384, 8);
            if (viewState.getShowImportToggle()) {
                c28655q4.m87150e0(-1298180998);
                m75277v(viewState, onViewEvent, c28655q4, i15 & 126);
                f25 = 1.0f;
                f24 = f18;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getAutomaticallyImportDescriptionDisplay(), c28655q4, i16), null, c38072d.m121949b(c28655q4, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, i17).getB2(), null, c28655q4, 0, i18, 196602);
                C28655q c28655q12 = c28655q4;
                AbstractC15751g.m44449b(AbstractC1102d.m3409f(1.0f, new HorizontalAlignElement(c2305k2)), c38072d.m121949b(c28655q12, i17).getWhite10(), f13, 0.0f, c28655q12, 384, 8);
                c28655q12.m87173q(false);
                c28655q5 = c28655q12;
            } else {
                f24 = f18;
                f25 = 1.0f;
                c28655q4.m87150e0(-1297572685);
                c28655q4.m87173q(false);
                c28655q5 = c28655q4;
            }
            i19 = i15 & 112;
            m75244C(viewState, onViewEvent, c28655q5, i15 & 126);
            Modifier modifierM75250I2 = m75250I(c2314t2, viewState, onViewEvent);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l2, c28655q5, 54);
            iHashCode3 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q5.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q5, modifierM75250I2);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c0213j4 = c0213j3;
                c28655q5.m87163l(c0213j4);
            } else {
                c0213j4 = c0213j3;
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i11, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q5, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q5.f115903S) {
                c0209i3 = c0209i6;
                AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
            } else {
                c0209i3 = c0209i6;
                AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i10, modifierM118962N8);
            if (f25 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(new LayoutWeightElement(f25, true), 0.0f, 0.0f, f13, 0.0f, 11);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k5, c28655q5, 0);
            iHashCode4 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q5.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q5, modifierM3398t3);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(c0213j4);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i11, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q5, c0209i12, interfaceC28653p1M87165m9);
            if (c28655q5.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i10, modifierM118962N9);
            String strM21274h6 = AbstractC8693b.m21274h(viewState.getSelectedActivitiesItem().getMenuItemTitle(), c28655q5, i16);
            if (viewState.getAutomaticallyPostEnabled()) {
                C38072d c38072d6 = c38072d;
                jM95627c = AbstractC25012a.m73366B(c28655q5, 1300711192, c38072d6, c28655q5, i17);
                c28655q5.m87173q(false);
                c38072d2 = c38072d6;
            } else {
                C38072d c38072d7 = c38072d;
                jM95627c = AbstractC31061c.m95627c(c28655q5, 1300792443, c38072d7, c28655q5, i17);
                c28655q5.m87173q(false);
                c38072d2 = c38072d7;
            }
            c28655q6 = c28655q5;
            AbstractC30795n.m94707h(strM21274h6, null, jM95627c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q5, i17).getH4(), null, c28655q6, 0, i18, 196602);
            String strM21274h7 = AbstractC8693b.m21274h(viewState.getSelectedActivitiesItem().getMenuItemSubtitle(), c28655q6, i16);
            if (viewState.getAutomaticallyPostEnabled()) {
                jM125370W0 = AbstractC31061c.m95627c(c28655q6, 1301122779, c38072d2, c28655q6, i17);
                c28655q6.m87173q(false);
            } else {
                c28655q6.m87150e0(1301201147);
                jM125370W0 = c38072d2.m121949b(c28655q6, i17).getWhite10();
                c28655q6.m87173q(false);
            }
            AbstractC30795n.m94707h(strM21274h7, null, jM125370W0, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q6, i17).getB4(), null, c28655q6, 0, i18, 196602);
            c28655q6.m87173q(true);
            if (viewState.getSelectedActivitiesItem().getRightIcon() == null) {
                c28655q6.m87150e0(1372350909);
                r14 = 0;
                c28655q6.m87173q(false);
            } else {
                c28655q6.m87150e0(1372350910);
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(viewState.getSelectedActivitiesItem().getRightIcon().getIcon(), c28655q6, 6);
                String strM21274h8 = AbstractC8693b.m21274h(viewState.getSelectedActivitiesItem().getRightIcon().getContentDescription(), c28655q6, i16);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f19, c2314t2);
                if (viewState.getAutomaticallyPostEnabled()) {
                    jM95627c2 = AbstractC25012a.m73366B(c28655q6, -2034779902, c38072d2, c28655q6, i17);
                    z13 = false;
                    c28655q6.m87173q(false);
                } else {
                    z13 = false;
                    jM95627c2 = AbstractC31061c.m95627c(c28655q6, -2034698651, c38072d2, c28655q6, i17);
                    c28655q6.m87173q(false);
                }
                AbstractC15005f3.m43108b(c27430eM107874S2, strM21274h8, modifierM3419p2, jM95627c2, c28655q6, 384, 0);
                c28655q6.m87173q(z13);
                r14 = z13;
            }
            c28655q6.m87173q(true);
            float f210 = f24;
            AbstractC11266d.m30469w((float) 0.8d, f210, c2314t2, c28655q6);
            c26068uM77569a = AbstractC26071x.m77569a(r14, r14, c28655q6, 3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            boolean zM87157i3 = c28655q6.m87157i(viewState);
            if (i19 == 32) {
                r15 = 1;
            } else {
                r15 = r14;
            }
            i24 = (zM87157i3 ? 1 : 0) | r15;
            Object objM87133R3 = c28655q6.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (i24 == 0) {
                C25583f c25583f2 = new C25583f(2, viewState, onViewEvent);
                c28655q6.m87172p0(c25583f2);
                obj = c25583f2;
            } else {
                C25583f c25583f3 = new C25583f(2, viewState, onViewEvent);
                c28655q6.m87172p0(c25583f3);
                obj = c25583f3;
            }
            C38072d c38072d8 = c38072d2;
            c21727f = viewState;
            AbstractC22674j.m65718d(modifierM3409f2, c26068uM77569a, null, null, null, null, false, null, (Function1) obj, c28655q6, 6, 508);
            zM87157i = c28655q6.m87157i(c21727f) | c28655q6.m87153g(c26068uM77569a);
            Object objM87133R4 = c28655q6.m87133R();
            obj2 = objM87133R4;
            if (zM87157i) {
                b bVar2 = new b(c21727f, c26068uM77569a, null);
                c28655q6.m87172p0(bVar2);
                obj2 = bVar2;
            } else {
                b bVar3 = new b(c21727f, c26068uM77569a, null);
                c28655q6.m87172p0(bVar3);
                obj2 = bVar3;
            }
            AbstractC28683x.m87253g(c28655q6, (InterfaceC4351m) obj2, C23454a0.f92919a);
            AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3411h(((float) 0.2d) * f210, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c21727f.getShareableGraphicDescriptionDisplay(), c28655q6, i16), null, c38072d8.m121949b(c28655q6, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q6, i17).getB2(), null, c28655q6, 0, i18, 196602);
            C28655q c28655q13 = c28655q6;
            c28655q13.m87173q(true);
            c28655q = c28655q13;
        } else {
            c21727f = viewState;
            c28655q7.m87138X();
            c28655q = c28655q7;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25582e(c21727f, onViewEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m75275t(C21727f c21727f, Function1 function1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        List<C21725d> listM61244q = c21727f.m61244q();
        C26053f c26053f = (C26053f) LazyRow;
        c26053f.m77529r(listM61244q.size(), null, new d(c.f100392w, listM61244q), new C37816b(new e(listM61244q, c21727f, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m75276u(C21727f c21727f, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m75274s(c21727f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m75277v(C21727f c21727f, Function1 function1, Composer composer, int i13) {
        int i14;
        C21727f c21727f2;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1077018773);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c21727f) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, 8, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(c21727f.getAutomaticallyImportDisplay(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c21727f2 = c21727f;
            function2 = function1;
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i15).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-2098923798, c28655q, new C25581d(1, c21727f2, function1)), c28655q, 24576, 13);
            c28655q.m87173q(true);
        } else {
            c21727f2 = c21727f;
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25582e(c21727f2, function2, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m75278w(C21727f c21727f, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "strava_import_toggle");
            boolean zM61230c = c21727f.getAutomaticallyImportEnabled();
            boolean zM87157i = c28655q.m87157i(c21727f) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C25583f(0, c21727f, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(modifierM3599a, zM61230c, false, 0L, null, null, (Function1) objM87133R, c28655q, 6, 60);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m75279x(C21727f c21727f, Function1 function1, boolean z4) {
        Object next;
        Iterator<T> it = c21727f.m61244q().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((C21725d) next).getSelected());
        C21725d c21725d = (C21725d) next;
        String strM61213b = c21725d != null ? c21725d.getTemplateName() : null;
        if (strM61213b == null) {
            strM61213b = "";
        }
        String str = strM61213b;
        boolean zM61232e = c21727f.getAutomaticallyPostEnabled();
        List<C21724c> listM61241n = c21727f.m61241n();
        boolean z13 = true;
        if (!(listM61241n instanceof Collection) || !listM61241n.isEmpty()) {
            Iterator<T> it3 = listM61241n.iterator();
            while (it3.hasNext()) {
                if (!((C21724c) it3.next()).getSelected()) {
                    z13 = false;
                    break;
                }
            }
        }
        function1.invoke(new InterfaceC21730i.d(new C21734m(zM61232e, z13, str, c21727f.m61241n(), false, z4, 16, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m75280y(C21727f c21727f, Function1 function1, int i13, Composer composer, int i14) {
        m75277v(c21727f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m75281z(C21733l parentViewState, Function1 function1, InterfaceC4339a onBackPressed, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q;
        C0209i c0209i;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(parentViewState, "parentViewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-933953522);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(parentViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onBackPressed) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C21727f c21727fM61296c = parentViewState.getSettingsConnected();
            if (c21727fM61296c == null) {
                c28655q2.m87150e0(-610988706);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-610988705);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM94757f);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c21727fM61296c.getBackgroundImageUrl(), null, null, c28655q2, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3384f(c2314t, false, 1.25f)), null, C39102j.f168202d, 0.0f, null, c28655q2, 25008, 104);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i = c0209i4;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    c0209i = c0209i4;
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                AbstractC6721d.c cVar = new AbstractC6721d.c(null, AbstractC8693b.m21267a(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, null, null, null, null, 8165, null);
                Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                boolean z4 = (i14 & 896) == 256;
                Object objM87133R = c28655q2.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C24679k(onBackPressed, 10);
                    c28655q2.m87172p0(objM87133R);
                }
                C0209i c0209i6 = c0209i;
                int i15 = i14;
                AbstractC6719b.m20143d(modifierM66723l, cVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.c.f25657p << 3, 52);
                c28655q = c28655q2;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90656g, c2305k, c28655q, 6);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                int i16 = i15 & 112;
                onViewEvent = function1;
                m75274s(c21727fM61296c, onViewEvent, c28655q, i16);
                m75271p(c21727fM61296c, onViewEvent, c28655q, i16);
                AbstractC2875y.m8286B(c28655q, true, true, true, false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25585h(parentViewState, onViewEvent, onBackPressed, i13, 0);
        }
    }
}

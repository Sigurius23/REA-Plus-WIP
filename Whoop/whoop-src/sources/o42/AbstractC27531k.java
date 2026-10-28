package o42;

import am2.C1017f0;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1930a;
import as1.C1945f;
import as1.C1947h;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bv2.C3675b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import cd0.C4435a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.InterfaceC13062m;
import f42.AbstractC14081a;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import ih0.AbstractC18489d0;
import ih2.C18526a;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import j02.EnumC21171u0;
import j42.AbstractC21316a;
import k71.C22252i;
import kw1.C22852c;
import l42.AbstractC23333a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import mi2.C25592o;
import mx1.C26003i;
import n42.C26278b;
import n42.C26281e;
import n42.C26283g;
import n42.C26284h;
import n42.EnumC26279c;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26960m0;
import nx1.C27225g;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.C39336i;
import pz0.AbstractC29641d;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import uv0.AbstractC35283c;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: o42.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aG\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a;\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\"\u0010#\u001a;\u0010)\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b)\u0010*\u001a+\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b,\u0010\u0015\u001a#\u0010-\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b-\u0010.\u001a\u000f\u0010/\u001a\u00020$H\u0003¢\u0006\u0004\b/\u00100\u001a+\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u0002012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b3\u00104\u001a+\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u0002052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b7\u00108\u001a\u0017\u00109\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b9\u0010:¨\u0006;"}, m65681d2 = {"Ln42/h;", "parentViewState", "Lj02/u0;", "mode", "Lkotlin/Function1;", "Ll42/a;", "Ll83/a0;", "onNavEvent", "Lj42/a;", "onViewEvent", "f0", "(Ln42/h;Lj02/u0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "b0", "(Landroidx/compose/runtime/Composer;I)V", "", "searchable", "mutualCommunitySharing", "H", "(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isEnabled", "n0", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "viewEvent", "X", "(Lj42/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ln42/g;", "screenViewState", "d0", "(Ln42/g;Lj02/u0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "h0", "(Lj02/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isCommunityFollowersEnabled", "isTeamInvitationEnabled", "isMutualCommunitySharingEnabled", "D", "(ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "title", "description", "checked", "onCheckedChange", "B", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isRecommendationEnabled", "k0", "U", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "q0", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Ln42/e;", "dataSharingViewState", "S", "(Ln42/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ln42/b;", "account", "K", "(Ln42/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "N", "(Ln42/b;Landroidx/compose/runtime/Composer;I)V", "privacy-consent_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27531k {

    /* JADX INFO: renamed from: o42.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.view.screen.PrivacyConsentScreenKt$DataSharingBottomSheet$1$1", m100430f = "PrivacyConsentScreen.kt", m100431l = {469, 470}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f110834w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f110835x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f110836y;

        /* JADX INFO: renamed from: o42.k$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42110a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f110837w;

            public C42110a(Function1 function1) {
                this.f110837w = function1;
            }

            /* JADX INFO: renamed from: b */
            public final Object m83038b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (!z4) {
                    this.f110837w.invoke(new AbstractC21316a.e(""));
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m83038b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f110835x = c15199y3;
            this.f110836y = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m83037h(C15199y3 c15199y3) {
            return c15199y3.m43224e();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f110835x, this.f110836y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f110834w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L46
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L2a
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                g1.y3 r5 = r4.f110835x
                r4.f110834w = r3
                java.lang.Object r5 = r5.m43225f(r4)
                if (r5 != r0) goto L2a
                goto L45
            L2a:
                g1.y3 r5 = r4.f110835x
                o42.g r1 = new o42.g
                r3 = 3
                r1.<init>(r5, r3)
                ec3.s1 r5 = p390p1.AbstractC28683x.m87240H(r1)
                o42.k$a$a r1 = new o42.k$a$a
                kotlin.jvm.functions.Function1 r3 = r4.f110836y
                r1.<init>(r3)
                r4.f110834w = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L46
            L45:
                return r0
            L46:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o42.AbstractC27531k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: o42.k$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f110838w = new b();

        /* JADX INFO: renamed from: a */
        public final long m83039a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBlack50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m83039a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: o42.k$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f110839a;

        static {
            int[] iArr = new int[EnumC21171u0.values().length];
            try {
                iArr[EnumC21171u0.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21171u0.ENTERPRISE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f110839a = iArr;
        }
    }

    /* JADX INFO: renamed from: B */
    private static final void m82968B(String str, String str2, boolean z4, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(316404441);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * 8, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            long j7 = C17919x.f69629f;
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH4(), null, c28655q, (i14 & 14) | 384, i16, 196602);
            AbstractC11266d.m30469w(1, 4, c2314t, c28655q);
            int i17 = i14 >> 3;
            AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB3(), null, c28655q, i17 & 14, i16, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            AbstractC29641d.m91043e(null, z4, false, 0L, null, null, function1, c28655q, (i17 & 112) | ((i14 << 9) & 3670016), 61);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(str, str2, z4, function1, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m82969C(String str, String str2, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m82968B(str, str2, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public static final void m82970D(final boolean z4, final boolean z13, final boolean z14, final Function1 onViewEvent, Composer composer, final int i13) {
        int i14;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1214824880);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z14) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            AbstractC27533m.m83041b(AbstractC30060g.m92103Y(c28655q, AbstractC14081a.f50580b), null, c28655q, 0, 2);
            C2314t c2314t = C2314t.f9131w;
            AbstractC11266d.m30469w(3, 4, c2314t, c28655q);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, z4 ? AbstractC14081a.f50587i : AbstractC14081a.f50599u);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, z4 ? AbstractC14081a.f50588j : AbstractC14081a.f50600v);
            int i16 = i15 & 7168;
            int i17 = i15 & 896;
            boolean z15 = (i16 == 2048) | (i17 == 256);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z15 || objM87133R == c28676v0) {
                objM87133R = new C1017f0(onViewEvent, z14, 3);
                c28655q.m87172p0(objM87133R);
            }
            m82968B(strM92103Y, strM92103Y2, z13, (Function1) objM87133R, c28655q, (i15 << 3) & 896);
            if (z4) {
                c28655q.m87150e0(-1452375411);
                float f13 = ((float) 2.5d) * 8;
                AbstractC15751g.m44449b(AbstractC1099a.m3395q(c2314t, f13, f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), 1, 0.0f, c28655q, 384, 8);
                String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC14081a.f50593o);
                String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC14081a.f50592n);
                boolean z16 = ((i15 & 112) == 32) | (i16 == 2048);
                Object objM87133R2 = c28655q.m87133R();
                if (z16 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C1017f0(onViewEvent, z13, 4);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q = c28655q;
                m82968B(strM92103Y3, strM92103Y4, z14, (Function1) objM87133R2, c28655q, i17);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1451694062);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: o42.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC27531k.m82973G(z4, z13, z14, onViewEvent, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m82971E(Function1 function1, boolean z4, boolean z13) {
        function1.invoke(new AbstractC21316a.f(z13, z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m82972F(Function1 function1, boolean z4, boolean z13) {
        function1.invoke(new AbstractC21316a.f(z4, z13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m82973G(boolean z4, boolean z13, boolean z14, Function1 function1, int i13, Composer composer, int i14) {
        m82970D(z4, z13, z14, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final void m82974H(boolean z4, boolean z13, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-93598718);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            boolean z14 = ((i14 & 14) == 4) | ((i14 & 896) == 256) | ((i14 & 112) == 32);
            Object objM87133R = c28655q2.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C1947h(z4, z13, 2, function1);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, (InterfaceC4339a) objM87133R, 3, null), textResourceM21267a, null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27530j(z4, z13, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m82975I(Function1 function1, boolean z4, boolean z13) {
        function1.invoke(new AbstractC21316a.a(z4, z13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m82976J(boolean z4, boolean z13, Function1 function1, int i13, Composer composer, int i14) {
        m82974H(z4, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    public static final void m82977K(C26278b account, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(account, "account");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(29269467);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(account) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            EnumC26279c enumC26279c = EnumC26279c.COLLAPSED;
            boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(c15199y3M3460c);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new a(c15199y3M3460c, onViewEvent, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, enumC26279c);
            Modifier modifierM3406c = AbstractC1102d.m3406c(0.85f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
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
            C35666g c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
            AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = b.f110838w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35660d.m112871m(null, c35666g, aVar, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, null, AbstractC37817c.m121344e(1823524291, c28655q, new C27525e(account, 0)), false, null, null, null, false, null, C27521a.f110812a.m82958b(), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27522b(account, onViewEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m82978L(C26278b c26278b, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m82980N(c26278b, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m82979M(C26278b c26278b, Function1 function1, int i13, Composer composer, int i14) {
        m82977K(c26278b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    public static final void m82980N(C26278b account, Composer composer, int i13) {
        int i14;
        C26278b c26278b;
        C2314t c2314t;
        AbstractC22676k.m65750j(account, "account");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1056236737);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(account) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            boolean zIsEmpty = account.getAccountDataSharing().m77965a().isEmpty();
            C2305k c2305k = C2299e.f9111N;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3406c = AbstractC1102d.m3406c(0.85f, c2314t2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
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
            TextResource textResourceM77968d = account.getAccountDataSharing().getTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM77968d, c28655q, i15);
            long j7 = C17919x.f69629f;
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i16).getH4();
            C36775k c36775k = new C36775k(3);
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 384, i17, 196090);
            if (zIsEmpty) {
                c28655q.m87150e0(2058602412);
                float f13 = 4;
                AbstractC11266d.m30469w(f13, f13, c2314t2, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC14081a.f50581c, c28655q, 0), null, c38072d.m121949b(c28655q, i16).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q, 0, i17, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(2058894246);
                float f14 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14 * f14, c2314t2));
                c2314t = c2314t2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(account.getAccountDataSharing().getSubtitle(), c28655q, i15), null, c38072d.m121949b(c28655q, i16).getWhite90(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q, 0, i17, 196090);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            float f15 = 4;
            AbstractC11266d.m30469w(f15, f15, c2314t, c28655q);
            C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, f15 * 8, 7);
            boolean zM87155h = c28655q.m87155h(zIsEmpty);
            c26278b = account;
            boolean zM87157i = zM87155h | c28655q.m87157i(c26278b);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C1945f(zIsEmpty, c26278b, 7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(null, null, c22976l1M3381c, null, c2305k, null, false, null, (Function1) objM87133R, c28655q, 196992, 475);
            c28655q.m87173q(true);
        } else {
            c26278b = account;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(c26278b, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m82981O(boolean z4, final C26278b c26278b, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        if (!z4) {
            InterfaceC26064q.m77555a(LazyColumn, c26278b.getAccountDataSharing().m77965a().size(), null, new C37816b(new InterfaceC4352n() { // from class: o42.i
                @Override // c93.InterfaceC4352n
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC27531k.m82982P(c26278b, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                }
            }, true, 1762549744), 6);
        }
        if (AbstractC8693b.m21270d(c26278b.getAccountDataSharing().getDisclaimer())) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C27525e(c26278b, 1), true, 190649950), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m82982P(C26278b c26278b, InterfaceC1103a items, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(items, "$this$items");
        if ((i14 & 48) == 0) {
            i14 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 145) != 144)) {
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(5 * 4, C2314t.f9131w));
            AbstractC27524d.m82965b(c26278b.getAccountDataSharing().m77965a().get(i13), c28655q, TextResource.$stable);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m82983Q(C26278b c26278b, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(5 * 4, C2314t.f9131w));
            String strM21274h = AbstractC8693b.m21274h(c26278b.getAccountDataSharing().getDisclaimer(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB4(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m82984R(C26278b c26278b, int i13, Composer composer, int i14) {
        m82980N(c26278b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    public static final void m82985S(C26281e dataSharingViewState, Function1 onViewEvent, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(dataSharingViewState, "dataSharingViewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2135404431);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(dataSharingViewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            TextResource textResourceM77981e = dataSharingViewState.getTitle();
            int i15 = TextResource.$stable;
            AbstractC27533m.m83041b(AbstractC8693b.m21274h(textResourceM77981e, c28655q2, i15), AbstractC8693b.m21274h(dataSharingViewState.getSubtitle(), c28655q2, i15), c28655q2, 0, 0);
            float f13 = 4;
            float f14 = 5 * f13;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t));
            c28655q2.m87150e0(870720402);
            int i16 = 0;
            for (Object obj : dataSharingViewState.m77977a()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C26278b c26278b = (C26278b) obj;
                if (i16 > 0) {
                    AbstractC33745d.m106667z(c28655q2, -211939643, c2314t, f14, c28655q2);
                } else {
                    c28655q2.m87150e0(2019847945);
                }
                c28655q2.m87173q(false);
                AbstractC27523c.m82961c(c26278b, onViewEvent, c28655q2, i14 & 112);
                i16 = i17;
            }
            c28655q2.m87173q(false);
            if (AbstractC8693b.m21270d(dataSharingViewState.getFooter())) {
                c28655q2.m87150e0(1222746184);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13 * f13, c2314t));
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * 8, 0.0f, 2);
                String strM21274h = AbstractC8693b.m21274h(dataSharingViewState.getFooter(), c28655q2, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, modifierM3396r, c38072d.m121949b(c28655q2, i18).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB2(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(1223093105);
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(dataSharingViewState, onViewEvent, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m82986T(C26281e c26281e, Function1 function1, int i13, Composer composer, int i14) {
        m82985S(c26281e, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U */
    public static final void m82987U(Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-445350674);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(onNavEvent) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC27533m.m83041b(AbstractC30060g.m92103Y(c28655q, AbstractC14081a.f50582d), null, c28655q, 0, 2);
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            AbstractC11266d.m30469w(5, f13, c2314t, c28655q);
            float f14 = ((float) 2.5d) * 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2);
            EnumC27284v enumC27284v = EnumC27284v.TextMedium;
            String strM21273g = AbstractC8693b.m21273g(AbstractC14081a.f50583e, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125388d1 = c38072d.m121949b(c28655q, i15).getWhite90();
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C27527g(onNavEvent, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3396r, enumC27284v, strM21273g, true, jM125388d1, null, false, (InterfaceC4339a) objM87133R, c28655q, 3126, 96);
            String strM83026q0 = m83026q0(c28655q, 0);
            if (strM83026q0.length() > 0) {
                c28655q.m87150e0(-287271710);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f13, c2314t));
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
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
                C21054m c21054mM58880a = C21053l.f79834a.m58880a(AbstractC18489d0.m53377r(c38072d, c28655q, i15), c38072d.m121949b(c28655q, i15).getWhite90(), c38072d.m121949b(c28655q, i15).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32760);
                c28655q = c28655q;
                AbstractC21048g.m58807M(strM83026q0, null, false, c21054mM58880a, null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 502);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-286762380);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(onNavEvent, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m82988V(Function1 function1) {
        function1.invoke(AbstractC23333a.b.f92513a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m82989W(Function1 function1, int i13, Composer composer, int i14) {
        m82987U(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public static final void m82990X(AbstractC21316a viewEvent, Function1 onNavEvent, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(371013974);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(viewEvent) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onNavEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC14081a.f50586h, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC14081a.f50590l, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC14081a.f50589k, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            boolean z4 = ((i14 & 14) == 4) | ((i14 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C25592o(23, onViewEvent, viewEvent);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC14081a.f50579a, objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0);
            boolean z13 = (i14 & 112) == 32;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C27527g(onNavEvent, 2);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            int i16 = 196608 | AbstractC33208p0.b.f138467h;
            int i17 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, true, false, c8688b3, interfaceC4339a2, null, false, false, c28655q, i16 | (i17 << 3) | (i17 << 9) | (i17 << 21), 0, 3652);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) viewEvent, onNavEvent, (InterfaceC23459e) onViewEvent, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m82991Y(Function1 function1, AbstractC21316a abstractC21316a) {
        function1.invoke(abstractC21316a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m82992Z(Function1 function1) {
        function1.invoke(AbstractC23333a.a.f92512a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m82994a0(AbstractC21316a abstractC21316a, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m82990X(abstractC21316a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m82996b0(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(490129887);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m82998c0(int i13, Composer composer, int i14) {
        m82996b0(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d0 */
    private static final void m83000d0(C26283g c26283g, EnumC21171u0 enumC21171u0, Function1 function1, Function1 function2, Composer composer, int i13) {
        int i14;
        boolean z4;
        boolean z13;
        Function1 function3 = function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1974776162);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c26283g) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC21171u0.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            m83008h0(enumC21171u0, function1, c28655q, (i15 >> 3) & 126);
            float f13 = 4;
            AbstractC11266d.m30469w(5, f13, c2314t, c28655q);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q, 1), 14));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            int i16 = c.f110839a[enumC21171u0.ordinal()];
            if (i16 == 1) {
                c28655q.m87150e0(-1050024859);
                m82970D(c26283g.getIsCommunityFollowersEnabled(), c26283g.getIsTeamInvitationEnabled(), c26283g.getIsMutualCommunitySharingEnabled(), function2, c28655q, i15 & 7168);
                function3 = function2;
                float f14 = 8 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                Boolean boolM77989g = c26283g.getIsRecommendationEnabled();
                if (boolM77989g == null) {
                    c28655q.m87150e0(-1049521916);
                    z4 = false;
                    c28655q.m87173q(false);
                } else {
                    z4 = false;
                    c28655q.m87150e0(-1049521915);
                    m83014k0(boolM77989g.booleanValue(), function3, c28655q, (i15 >> 6) & 112);
                    AbstractC30007c.m91851u(c2314t, f14, c28655q, false);
                }
                C26281e c26281eM77983a = c26283g.getDataSharingViewState();
                if (c26281eM77983a == null) {
                    c28655q.m87150e0(-1049284177);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(-1049284176);
                    if (c26281eM77983a.getDisplay()) {
                        c28655q.m87150e0(1982763450);
                        m82985S(c26281eM77983a, function3, c28655q, (i15 >> 6) & 112);
                        z4 = false;
                        AbstractC30007c.m91851u(c2314t, f14, c28655q, false);
                    } else {
                        z4 = false;
                        c28655q.m87150e0(1982921054);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z4);
                }
                m82987U(function1, c28655q, (i15 >> 6) & 14);
                c28655q.m87173q(z4);
            } else {
                if (i16 != 2) {
                    throw AbstractC11895b.m32003v(-1419346269, c28655q, false);
                }
                c28655q.m87150e0(-1048877456);
                C26281e c26281eM77983a2 = c26283g.getDataSharingViewState();
                if (c26281eM77983a2 == null) {
                    c28655q.m87150e0(-1048877457);
                    z13 = false;
                    c28655q.m87173q(false);
                } else {
                    z13 = false;
                    c28655q.m87150e0(-1048877456);
                    if (c26281eM77983a2.getDisplay()) {
                        c28655q.m87150e0(-50012216);
                        m82985S(c26281eM77983a2, function3, c28655q, (i15 >> 6) & 112);
                        AbstractC25012a.m73388u(8, f13, c2314t, c28655q, false);
                    } else {
                        c28655q.m87150e0(-49854612);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC22953f.m66722k(c2314t));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(c26283g, enumC21171u0, function1, function3, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m83002e0(C26283g c26283g, EnumC21171u0 enumC21171u0, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m83000d0(c26283g, enumC21171u0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m83004f0(C26284h parentViewState, EnumC21171u0 enumC21171u0, Function1 onNavEvent, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        EnumC21171u0 enumC21171u1;
        AbstractC22676k.m65750j(parentViewState, "parentViewState");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1766620936);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(parentViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC21171u0 == null ? -1 : enumC21171u0.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 1171) != 1170)) {
            EnumC21171u0 enumC21171u2 = i16 != 0 ? EnumC21171u0.FULL : enumC21171u0;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            if (parentViewState.getIsLoading()) {
                c28655q.m87150e0(-1983558036);
                m82996b0(c28655q, 0);
                c28655q.m87173q(false);
            } else if (parentViewState.getIsGeneralError()) {
                c28655q.m87150e0(-1983472538);
                int i18 = i17 >> 3;
                m82990X(AbstractC21316a.b.f81510a, onNavEvent, onViewEvent, c28655q, (i18 & 896) | (i18 & 112) | 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1983214556);
                C26283g c26283gM77993a = parentViewState.getScreenViewState();
                if (c26283gM77993a == null) {
                    c28655q.m87150e0(-1983214557);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1983214556);
                    if (c26283gM77993a.getIsCommunityToggleSuccess()) {
                        c28655q.m87150e0(-907337796);
                        m82974H(c26283gM77993a.getIsTeamInvitationEnabled(), c26283gM77993a.getIsMutualCommunitySharingEnabled(), onViewEvent, c28655q, (i17 >> 3) & 896);
                        c28655q.m87173q(false);
                    } else if (c26283gM77993a.getIsRecommendationToggleSuccess()) {
                        c28655q.m87150e0(-907156942);
                        Boolean boolM77989g = c26283gM77993a.getIsRecommendationEnabled();
                        m83020n0(boolM77989g != null ? boolM77989g.booleanValue() : false, onViewEvent, c28655q, (i17 >> 6) & 112);
                        c28655q.m87173q(false);
                    } else if (c26283gM77993a.getIsCommunityToggleError()) {
                        c28655q.m87150e0(-906998997);
                        m82990X(new AbstractC21316a.f(c26283gM77993a.getIsTeamInvitationEnabled(), c26283gM77993a.getIsMutualCommunitySharingEnabled()), onNavEvent, onViewEvent, c28655q, (i17 >> 3) & MessageListItemViewType.GIPHY);
                        c28655q.m87173q(false);
                    } else if (c26283gM77993a.getIsRecommendationToggleError()) {
                        c28655q.m87150e0(-906676535);
                        Boolean boolM77989g2 = c26283gM77993a.getIsRecommendationEnabled();
                        m82990X(new AbstractC21316a.g(boolM77989g2 != null ? boolM77989g2.booleanValue() : false), onNavEvent, onViewEvent, c28655q, (i17 >> 3) & MessageListItemViewType.GIPHY);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-906419049);
                        m83000d0(parentViewState.getScreenViewState(), enumC21171u2, onNavEvent, onViewEvent, c28655q, i17 & 8176);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            C26283g c26283gM77993a2 = parentViewState.getScreenViewState();
            C26278b c26278bM77984b = c26283gM77993a2 != null ? c26283gM77993a2.getShowDataSharingSheet() : null;
            if (c26278bM77984b == null) {
                c28655q.m87150e0(-1123026092);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1123026091);
                m82977K(c26278bM77984b, onViewEvent, c28655q, (i17 >> 6) & 112);
                c28655q.m87173q(false);
            }
            enumC21171u1 = enumC21171u2;
        } else {
            c28655q.m87138X();
            enumC21171u1 = enumC21171u0;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) parentViewState, (Object) enumC21171u1, (Object) onNavEvent, (Object) onViewEvent, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m83006g0(C26284h c26284h, EnumC21171u0 enumC21171u0, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m83004f0(c26284h, enumC21171u0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static final void m83008h0(EnumC21171u0 mode, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        C27534n c27534n;
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1425536404);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(mode.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i16 = c.f110839a[mode.ordinal()];
            if (i16 == 1) {
                c27534n = new C27534n(AbstractC14081a.f50601w, AbstractC16319p0.m46430a().getAction().getCross(), AbstractC16277f.f62253K);
            } else {
                if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c27534n = new C27534n(AbstractC14081a.f50585g, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), AbstractC35283c.f150167E);
            }
            AbstractC6721d.a aVar = new AbstractC6721d.a(new TextResource.C8688b(c27534n.getTitleRes(), null, i15, 0 == true ? 1 : 0), 0 == true ? 1 : 0, Integer.valueOf(c27534n.getLeftIcon()), AbstractC30060g.m92103Y(c28655q, c27534n.getLeftIconContentDescriptionRes()), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C27527g(onNavEvent, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(mode, onNavEvent, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m83010i0(Function1 function1) {
        function1.invoke(AbstractC23333a.a.f92512a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m83012j0(EnumC21171u0 enumC21171u0, Function1 function1, int i13, Composer composer, int i14) {
        m83008h0(enumC21171u0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m83014k0(boolean z4, final Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        boolean z13 = z4;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-563057932);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC27533m.m83041b(AbstractC30060g.m92103Y(c28655q, AbstractC14081a.f50596r), null, c28655q, 0, 2);
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            AbstractC11266d.m30469w(3, f13, c2314t, c28655q);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * 8, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            int i15 = i14;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21273g = AbstractC8693b.m21273g(AbstractC14081a.f50598t, c28655q, 0);
            long j7 = C17919x.f69629f;
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i16).getH4();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21273g, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 384, i17, 196602);
            AbstractC11266d.m30469w(1, f13, c2314t, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC14081a.f50597s, c28655q, 0), null, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB3(), null, c28655q, 0, i17, 196602);
            c28655q.m87173q(true);
            boolean z14 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new Function1() { // from class: o42.f
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC27531k.m83016l0(onViewEvent, ((Boolean) obj).booleanValue());
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            z13 = z4;
            AbstractC29641d.m91043e(null, z13, false, 0L, null, null, (Function1) objM87133R, c28655q, (i15 << 3) & 112, 61);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18526a(z13, onViewEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m83016l0(Function1 function1, boolean z4) {
        function1.invoke(new AbstractC21316a.g(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m83018m0(boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m83014k0(z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n0 */
    private static final void m83020n0(boolean z4, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2114319670);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            boolean z13 = ((i14 & 112) == 32) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3675b(function1, z4, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, (InterfaceC4339a) objM87133R, 3, null), textResourceM21267a, null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18526a(z4, function1, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m83022o0(Function1 function1, boolean z4) {
        function1.invoke(new AbstractC21316a.d(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m83024p0(boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m83020n0(z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q0 */
    private static final String m83026q0(Composer composer, int i13) {
        String strM92103Y = AbstractC30060g.m92103Y(composer, AbstractC14081a.f50595q);
        String strM92102X = AbstractC30060g.m92102X(AbstractC14081a.f50591m, new Object[]{AbstractC11895b.m31996o("[", AbstractC30060g.m92103Y(composer, AbstractC14081a.f50594p), "]")}, composer);
        StringBuilder sb4 = new StringBuilder(strM92102X);
        try {
            sb4.insert(AbstractC39414r.m125888g0(strM92102X, "]", 0, false, 6) + 1, "(" + strM92103Y + ")");
        } catch (StringIndexOutOfBoundsException unused) {
            sb4.setLength(0);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}

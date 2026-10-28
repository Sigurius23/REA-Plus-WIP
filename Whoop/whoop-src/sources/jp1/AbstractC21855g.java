package jp1;

import a31.C0341c;
import a81.C0561l;
import am2.C1040r;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import b30.C2476a1;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.onboarding.domain.models.ContraceptionType;
import com.whoop.hormonalinsights.onboarding.domain.models.MciInterest;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import cp1.AbstractC11022i;
import cp1.C11016c;
import cp1.EnumC11017d;
import e93.AbstractC12889b;
import ep1.AbstractC13410e;
import fp1.C14676d;
import fp1.EnumC14674b;
import gb1.AbstractC15673b0;
import hp1.AbstractC17546f;
import hp1.C17543c;
import hp1.C17544d;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import iy0.C21026a;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p163g1.C15079m3;
import p180h0.C16416l0;
import p251jg.C21650c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import zo1.C40925b;

/* JADX INFO: renamed from: jp1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lhp1/d;", "viewState", "Lcp1/d;", "type", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "n", "(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhp1/c;", "", "isActive", "Lkotlin/Function0;", "y", "(Lhp1/c;Lcp1/d;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21855g {

    /* JADX INFO: renamed from: jp1.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.postpartum.view.MultiSelectScreenKt$MultiSelectScreen$2$1", m100430f = "MultiSelectScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f84408E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f84409F;

        /* JADX INFO: renamed from: w */
        int f84410w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17544d f84411x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f84412y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f84413z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C17544d c17544d, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84411x = c17544d;
            this.f84412y = interfaceC28601c1;
            this.f84413z = interfaceC28601c2;
            this.f84408E = interfaceC28601c3;
            this.f84409F = interfaceC28601c4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f84411x, this.f84412y, this.f84413z, this.f84408E, this.f84409F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f84410w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f84411x.getScreenId() != this.f84412y.getValue()) {
                this.f84413z.setValue(null);
                this.f84408E.setValue(null);
                this.f84409F.setValue(new Integer(1));
                this.f84412y.setValue(this.f84411x.getScreenId());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jp1.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f84414w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17543c f84415x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f84416y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f84417z;

        public b(InterfaceC28601c1 interfaceC28601c1, C17543c c17543c, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
            this.f84414w = interfaceC28601c1;
            this.f84415x = c17543c;
            this.f84416y = interfaceC28601c2;
            this.f84417z = interfaceC28601c3;
        }

        /* JADX INFO: renamed from: a */
        public final void m61888a() {
            this.f84414w.setValue(this.f84415x.getValue());
            this.f84416y.setValue(this.f84415x.getNextId());
            this.f84417z.setValue(this.f84415x.getNextCount());
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m61888a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jp1.g$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f84418w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C17543c c17543c) {
            return null;
        }
    }

    /* JADX INFO: renamed from: jp1.g$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f84419w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f84420x;

        public d(Function1 function1, List list) {
            this.f84419w = function1;
            this.f84420x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m61890a(int i13) {
            return this.f84419w.invoke(this.f84420x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m61890a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: jp1.g$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f84421E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f84422F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f84423w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f84424x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC11017d f84425y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C17544d f84426z;

        public e(List list, InterfaceC28601c1 interfaceC28601c1, EnumC11017d enumC11017d, C17544d c17544d, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
            this.f84423w = list;
            this.f84424x = interfaceC28601c1;
            this.f84425y = enumC11017d;
            this.f84426z = c17544d;
            this.f84421E = interfaceC28601c2;
            this.f84422F = interfaceC28601c3;
        }

        /* JADX INFO: renamed from: a */
        public final void m61891a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
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
            C17543c c17543c = (C17543c) this.f84423w.get(i13);
            c28655q.m87150e0(1820638621);
            boolean zM65745e = AbstractC22676k.m65745e(this.f84424x.getValue(), c17543c.getValue());
            EnumC11017d enumC11017d = this.f84425y;
            boolean zM87157i = c28655q.m87157i(c17543c);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new b(this.f84424x, c17543c, this.f84421E, this.f84422F);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21855g.m61886y(c17543c, enumC11017d, zM65745e, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable, 0);
            if (this.f84426z.m49886e().indexOf(c17543c) != AbstractC37056f.m118951C(this.f84426z.m49886e())) {
                c28655q.m87150e0(1821119120);
                AbstractC31061c.m95650z(3, 4, C2314t.f9131w, c28655q, false);
            } else {
                c28655q.m87150e0(1821197922);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m61891a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jp1.g$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84427a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f84428b;

        static {
            int[] iArr = new int[EnumC11017d.values().length];
            try {
                iArr[EnumC11017d.POSTPARTUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11017d.MCI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84427a = iArr;
            int[] iArr2 = new int[HormonalScreenId.values().length];
            try {
                iArr2[HormonalScreenId.MENSTRUAL_CYCLE_MOTIVATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HormonalScreenId.MENSTRUAL_CYCLE_CONTRACEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f84428b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m61859A(C17543c c17543c, boolean z4, EnumC11017d enumC11017d, Composer composer, int i13) throws XmlPullParserException, IOException {
        long jM125374Y0;
        C0209i c0209i;
        long jM95624D;
        C2886a c2886aM8414L;
        long jM53358D;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 2;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            if (c17543c.getIcon() == null) {
                c28655q.m87150e0(1866571307);
                c28655q.m87173q(false);
                c0209i = c0209i4;
            } else {
                c28655q.m87150e0(1866571308);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c17543c.getIcon().toWhoopIcon(), c28655q, 6);
                float f14 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f14, c2314t);
                if (z4) {
                    c28655q.m87150e0(691303821);
                    jM125374Y0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack30();
                } else {
                    c28655q.m87150e0(691304813);
                    jM125374Y0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30();
                }
                c28655q.m87173q(false);
                c0209i = c0209i4;
                AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, jM125374Y0, c28655q, 432, 0);
                AbstractC31061c.m95650z(f13, f14, c2314t, c28655q, false);
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            TextResource textResourceM49880e = c17543c.getTitle();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM49880e, c28655q, i14);
            if (z4) {
                c28655q.m87150e0(292890990);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(292892078);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            long j7 = jM95624D;
            if (enumC11017d == EnumC11017d.POSTPARTUM) {
                c28655q.m87150e0(292895686);
                c2886aM8414L = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB1();
            } else {
                c28655q.m87150e0(292896647);
                c2886aM8414L = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getSh4();
            }
            c28655q.m87173q(false);
            C2886a c2886a = c2886aM8414L;
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q, 0, i15, 196602);
            C28655q c28655q2 = c28655q;
            if (c17543c.getSubtitle() == null) {
                c28655q2.m87150e0(489929263);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(489929264);
                String strM21274h2 = AbstractC8693b.m21274h(c17543c.getSubtitle(), c28655q2, i14);
                if (z4) {
                    c28655q2.m87150e0(1776879295);
                    jM53358D = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50();
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1776880287);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                }
                AbstractC30795n.m94707h(strM21274h2, null, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB4(), null, c28655q2, 0, i15, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m61860B(C17543c c17543c, EnumC11017d enumC11017d, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m61886y(c17543c, enumC11017d, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:119:0x0204 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0206  */
    /* JADX WARN: Code duplicated, block: B:123:0x0219  */
    /* JADX WARN: Code duplicated, block: B:125:0x021e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0223  */
    /* JADX WARN: Code duplicated, block: B:128:0x0226  */
    /* JADX WARN: Code duplicated, block: B:131:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0236  */
    /* JADX WARN: Code duplicated, block: B:138:0x027f  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x02af  */
    /* JADX WARN: Code duplicated, block: B:151:0x0340  */
    /* JADX WARN: Code duplicated, block: B:153:0x034a  */
    /* JADX WARN: Code duplicated, block: B:156:0x035a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0368  */
    /* JADX WARN: Code duplicated, block: B:163:0x0394  */
    /* JADX WARN: Code duplicated, block: B:165:0x0398  */
    /* JADX WARN: Code duplicated, block: B:167:0x039c  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:171:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:175:0x03bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:183:0x0411  */
    /* JADX WARN: Code duplicated, block: B:184:0x041d  */
    /* JADX WARN: Code duplicated, block: B:186:0x042a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0435  */
    /* JADX WARN: Code duplicated, block: B:189:0x0447 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x0449  */
    /* JADX WARN: Code duplicated, block: B:194:0x0484  */
    /* JADX WARN: Code duplicated, block: B:197:0x0494  */
    /* JADX WARN: Code duplicated, block: B:198:0x0497  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:205:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:209:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:212:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:215:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x0145  */
    /* JADX WARN: Code duplicated, block: B:92:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0152  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX INFO: renamed from: n */
    public static final void m61875n(Modifier modifier, C17544d viewState, EnumC11017d enumC11017d, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        EnumC11017d enumC11017d2;
        Modifier modifier3;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        EnumC11017d enumC11017d3;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        TextResource textResource;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c4;
        boolean zM87157i;
        Object aVar;
        InterfaceC28601c1 interfaceC28601c5;
        InterfaceC28601c1 interfaceC28601c6;
        C28676v0 c28676v1;
        Function1 function5;
        InterfaceC28601c1 interfaceC28601c7;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        boolean z15;
        Object objM87133R5;
        C28676v0 c28676v2;
        InterfaceC4339a interfaceC4339a;
        InterfaceC28601c1 interfaceC28601c8;
        int iHashCode;
        C0213j c0213j;
        InterfaceC28601c1 interfaceC28601c9;
        C0209i c0209i;
        InterfaceC28601c1 interfaceC28601c10;
        TextResource textResourceM49890i;
        boolean zM87153g;
        Object objM87133R6;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R7;
        int i19;
        Function1 function6;
        float f13;
        float f14;
        boolean z19;
        boolean z24;
        Object objM87133R8;
        C28676v0 c28676v3;
        InterfaceC28601c1 interfaceC28601c11;
        InterfaceC28601c1 interfaceC28601c12;
        InterfaceC28601c1 interfaceC28601c13;
        C28655q c28655q2;
        int iHashCode2;
        float f15;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean zM87157i2;
        Object c0561l;
        float f16;
        Function1 function7;
        ?? r10;
        C28655q c28655q3;
        float f17;
        ?? r15;
        ?? r14;
        int i24;
        Object objM87133R9;
        TextResource textResourceM49890i2;
        boolean zM87153g2;
        Object objM87133R10;
        boolean z28;
        C28655q c28655q4;
        C28655q c28655q5;
        boolean z29;
        Object objM87133R11;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q6 = (C28655q) composer;
        c28655q6.m87154g0(-1604407100);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q6.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q6.m87157i(viewState) ? 32 : 16;
        }
        int i26 = i14 & 4;
        if (i26 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q6.m87149e(enumC11017d == null ? -1 : enumC11017d.ordinal()) ? 256 : 128;
        }
        int i27 = i14 & 8;
        if (i27 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q6.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q6.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i26 != 0) {
                    enumC11017d3 = EnumC11017d.POSTPARTUM;
                } else {
                    enumC11017d3 = enumC11017d;
                }
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R11 = c28655q6.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C21650c(19);
                        c28655q6.m87172p0(objM87133R11);
                    }
                    function4 = (Function1) objM87133R11;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q6.m87133R();
                textResource = null;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q6.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q6.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q6.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q6.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11895b.m32005x(1, c28655q6);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q6.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(viewState.getScreenId());
                    c28655q6.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                HormonalScreenId hormonalScreenIdM49888g = viewState.getScreenId();
                zM87157i = c28655q6.m87157i(viewState);
                Object objM87133R12 = c28655q6.m87133R();
                if (!zM87157i || objM87133R12 == c28676v0) {
                    Function1 function8 = function4;
                    interfaceC28601c5 = interfaceC28601c2;
                    interfaceC28601c6 = interfaceC28601c3;
                    c28676v1 = c28676v0;
                    function5 = function8;
                    aVar = new a(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c5, interfaceC28601c6, null);
                    interfaceC28601c7 = interfaceC28601c1;
                    c28655q6.m87172p0(aVar);
                } else {
                    c28676v1 = c28676v0;
                    interfaceC28601c7 = interfaceC28601c1;
                    interfaceC28601c6 = interfaceC28601c3;
                    aVar = objM87133R12;
                    function5 = function4;
                    interfaceC28601c5 = interfaceC28601c2;
                }
                AbstractC28683x.m87253g(c28655q6, (InterfaceC4351m) aVar, hormonalScreenIdM49888g);
                boolean zM87157i3 = c28655q6.m87157i(viewState);
                i17 = i16 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z34 = zM87157i3 | z13;
                i18 = i16 & 7168;
                if (i18 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z34 | z14;
                objM87133R5 = c28655q6.m87133R();
                if (z15) {
                    c28676v2 = c28676v1;
                } else {
                    c28676v2 = c28676v1;
                    if (objM87133R5 == c28676v2) {
                    }
                    interfaceC4339a = (InterfaceC4339a) objM87133R5;
                    Modifier modifierMo3471e = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))).mo3471e(modifier2);
                    Modifier modifier4 = modifier2;
                    C22957g c22957g = AbstractC22977m.f90652c;
                    interfaceC28601c8 = interfaceC28601c7;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q6, 0);
                    iHashCode = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q6.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q6, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q6.m87158i0();
                    interfaceC28601c9 = interfaceC28601c5;
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j);
                    } else {
                        c28655q6.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q6, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q6, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q6.f115903S) {
                        interfaceC28601c10 = interfaceC28601c6;
                    } else {
                        interfaceC28601c10 = interfaceC28601c6;
                        if (!AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N);
                        TextResource textResourceM49885d = viewState.getNavigationTitle();
                        TextResource textResourceM49884c = viewState.getNavigationSubtitle();
                        textResourceM49890i = viewState.getSkipTitle();
                        if (textResourceM49890i != null && viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null && viewState.getSkipNextId() != null && AbstractC8693b.m21270d(textResourceM49890i)) {
                            textResource = textResourceM49890i;
                        }
                        zM87153g = c28655q6.m87153g(interfaceC4339a);
                        objM87133R6 = c28655q6.m87133R();
                        if (zM87153g || objM87133R6 == c28676v2) {
                            objM87133R6 = new C21026a(interfaceC4339a, 4);
                            c28655q6.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                        if (i17 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (i18 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objM87133R7 = c28655q6.m87133R();
                        if (z18 || objM87133R7 == c28676v2) {
                            objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                            c28655q6.m87172p0(objM87133R7);
                        }
                        i19 = TextResource.$stable;
                        int i28 = i19 << 3;
                        int i29 = i19 | i28 | (i19 << 9);
                        function6 = function5;
                        enumC11017d2 = enumC11017d3;
                        AbstractC21865q.m61949e(textResourceM49885d, textResourceM49884c, 0, textResource, interfaceC4339a2, (InterfaceC4339a) objM87133R7, c28655q6, i29, 4);
                        C22957g c22957g2 = AbstractC22977m.f90653d;
                        C2305k c2305k = C2299e.f9111N;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        f13 = 3;
                        f14 = 8 * f13;
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f14, new LayoutWeightElement(1.0f, true)), "LazyColumMultiSelect");
                        boolean zM87157i4 = c28655q6.m87157i(viewState);
                        if (i17 == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = zM87157i4 | z19;
                        objM87133R8 = c28655q6.m87133R();
                        if (!z24 || objM87133R8 == c28676v2) {
                            c28676v3 = c28676v2;
                            interfaceC28601c11 = interfaceC28601c10;
                            interfaceC28601c12 = interfaceC28601c8;
                            interfaceC28601c13 = interfaceC28601c9;
                            C1040r c1040r = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                            c28655q6.m87172p0(c1040r);
                            objM87133R8 = c1040r;
                        } else {
                            interfaceC28601c12 = interfaceC28601c8;
                            c28676v3 = c28676v2;
                            interfaceC28601c11 = interfaceC28601c10;
                            interfaceC28601c13 = interfaceC28601c9;
                        }
                        AbstractC22674j.m65717c(modifierM3599a, null, null, c22957g2, c2305k, null, false, null, (Function1) objM87133R8, c28655q6, 221184, 462);
                        c28655q2 = c28655q6;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                        f15 = 4;
                        AbstractC18489d0.m53380u(2, f15, c2314t, c28655q2);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        C11016c c11016cM49887f = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                        TextResource textResourceM49882a = viewState.getButtonTitle();
                        if (interfaceC28601c12.getValue() != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (i17 == 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (i18 == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87157i2 = z26 | z27 | c28655q2.m87157i(viewState);
                        Object objM87133R13 = c28655q2.m87133R();
                        C28676v0 c28676v4 = c28676v3;
                        if (!zM87157i2 || objM87133R13 == c28676v4) {
                            f16 = f14;
                            InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c13;
                            InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c12;
                            function7 = function6;
                            c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c14, (Object) interfaceC28601c15, (Object) interfaceC28601c11, (Object) viewState, 7);
                            enumC11017d2 = enumC11017d2;
                            c28655q2.m87172p0(c0561l);
                        } else {
                            f16 = f14;
                            c0561l = objM87133R13;
                            function7 = function6;
                        }
                        AbstractC13410e.m37926c(c11016cM49887f, textResourceM49882a, modifierM3409f, z25, (InterfaceC4339a) c0561l, c28655q2, i19 | 384 | i28, 0);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                            AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, 1326410988, f13, f15, c2314t));
                            if (viewState.getSkipNextId() == null) {
                                c28655q2.m87150e0(1326506653);
                                c28655q2.m87173q(false);
                                z29 = false;
                                c28655q5 = c28655q2;
                            } else {
                                c28655q2.m87150e0(1326506654);
                                textResourceM49890i2 = viewState.getSkipTitle();
                                if (textResourceM49890i2 == null) {
                                    c28655q2.m87150e0(309693277);
                                    c28655q2.m87173q(false);
                                    z28 = false;
                                    c28655q4 = c28655q2;
                                } else {
                                    c28655q2.m87150e0(309693278);
                                    zM87153g2 = c28655q2.m87153g(interfaceC4339a);
                                    objM87133R10 = c28655q2.m87133R();
                                    if (zM87153g2 || objM87133R10 == c28676v4) {
                                        objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                        c28655q2.m87172p0(objM87133R10);
                                    }
                                    z28 = false;
                                    AbstractC27265l0.m82217i(null, null, textResourceM49890i2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q2, i19 << 6, 0, 4091);
                                    C28655q c28655q7 = c28655q2;
                                    c28655q7.m87173q(false);
                                    c28655q4 = c28655q7;
                                }
                                c28655q4.m87173q(z28);
                                z29 = z28;
                                c28655q5 = c28655q4;
                            }
                            c28655q5.m87173q(z29);
                            r10 = z29;
                            c28655q3 = c28655q5;
                        } else {
                            r10 = 0;
                            c28655q2.m87150e0(1326685834);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                            f17 = f16;
                        } else {
                            f17 = f15 * f15;
                        }
                        AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        if (i17 == 256) {
                            r15 = 1;
                        } else {
                            r15 = r10;
                        }
                        if (i18 == 2048) {
                            r14 = 1;
                        } else {
                            r14 = r10;
                        }
                        i24 = r14 | r15;
                        objM87133R9 = c28655q3.m87133R();
                        if (i24 == 0 || objM87133R9 == c28676v4) {
                            objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                            c28655q3.m87172p0(objM87133R9);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R9, r10, c28655q3, r10, 1);
                        function3 = function7;
                        modifier3 = modifier4;
                        c28655q = c28655q3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q6, c0209i5, modifierM118962N);
                    TextResource textResourceM49885d2 = viewState.getNavigationTitle();
                    TextResource textResourceM49884c2 = viewState.getNavigationSubtitle();
                    textResourceM49890i = viewState.getSkipTitle();
                    if (textResourceM49890i != null) {
                        textResource = textResourceM49890i;
                    }
                    zM87153g = c28655q6.m87153g(interfaceC4339a);
                    objM87133R6 = c28655q6.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new C21026a(interfaceC4339a, 4);
                        c28655q6.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C21026a(interfaceC4339a, 4);
                        c28655q6.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R6;
                    if (i17 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i18 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objM87133R7 = c28655q6.m87133R();
                    if (z18) {
                        objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                        c28655q6.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                        c28655q6.m87172p0(objM87133R7);
                    }
                    i19 = TextResource.$stable;
                    int i210 = i19 << 3;
                    int i211 = i19 | i210 | (i19 << 9);
                    function6 = function5;
                    enumC11017d2 = enumC11017d3;
                    AbstractC21865q.m61949e(textResourceM49885d2, textResourceM49884c2, 0, textResource, interfaceC4339a3, (InterfaceC4339a) objM87133R7, c28655q6, i211, 4);
                    C22957g c22957g3 = AbstractC22977m.f90653d;
                    C2305k c2305k2 = C2299e.f9111N;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    f13 = 3;
                    f14 = 8 * f13;
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f14, new LayoutWeightElement(1.0f, true)), "LazyColumMultiSelect");
                    boolean zM87157i5 = c28655q6.m87157i(viewState);
                    if (i17 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = zM87157i5 | z19;
                    objM87133R8 = c28655q6.m87133R();
                    if (z24) {
                        c28676v3 = c28676v2;
                        interfaceC28601c11 = interfaceC28601c10;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c9;
                        C1040r c1040r2 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                        c28655q6.m87172p0(c1040r2);
                        objM87133R8 = c1040r2;
                    } else {
                        c28676v3 = c28676v2;
                        interfaceC28601c11 = interfaceC28601c10;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c9;
                        C1040r c1040r3 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                        c28655q6.m87172p0(c1040r3);
                        objM87133R8 = c1040r3;
                    }
                    AbstractC22674j.m65717c(modifierM3599a2, null, null, c22957g3, c2305k2, null, false, null, (Function1) objM87133R8, c28655q6, 221184, 462);
                    c28655q2 = c28655q6;
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                    f15 = 4;
                    AbstractC18489d0.m53380u(2, f15, c2314t, c28655q2);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C11016c c11016cM49887f2 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                    TextResource textResourceM49882a2 = viewState.getButtonTitle();
                    if (interfaceC28601c12.getValue() != null) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (i17 == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if (i18 == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z26 | z27 | c28655q2.m87157i(viewState);
                    Object objM87133R14 = c28655q2.m87133R();
                    C28676v0 c28676v5 = c28676v3;
                    if (zM87157i2) {
                        f16 = f14;
                        InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c13;
                        InterfaceC28601c1 interfaceC28601c17 = interfaceC28601c12;
                        function7 = function6;
                        c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c16, (Object) interfaceC28601c17, (Object) interfaceC28601c11, (Object) viewState, 7);
                        enumC11017d2 = enumC11017d2;
                        c28655q2.m87172p0(c0561l);
                    } else {
                        f16 = f14;
                        InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c13;
                        InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c12;
                        function7 = function6;
                        c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c18, (Object) interfaceC28601c19, (Object) interfaceC28601c11, (Object) viewState, 7);
                        enumC11017d2 = enumC11017d2;
                        c28655q2.m87172p0(c0561l);
                    }
                    AbstractC13410e.m37926c(c11016cM49887f2, textResourceM49882a2, modifierM3409f2, z25, (InterfaceC4339a) c0561l, c28655q2, i19 | 384 | i210, 0);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                        AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, 1326410988, f13, f15, c2314t));
                        if (viewState.getSkipNextId() == null) {
                            c28655q2.m87150e0(1326506653);
                            c28655q2.m87173q(false);
                            z29 = false;
                            c28655q5 = c28655q2;
                        } else {
                            c28655q2.m87150e0(1326506654);
                            textResourceM49890i2 = viewState.getSkipTitle();
                            if (textResourceM49890i2 == null) {
                                c28655q2.m87150e0(309693277);
                                c28655q2.m87173q(false);
                                z28 = false;
                                c28655q4 = c28655q2;
                            } else {
                                c28655q2.m87150e0(309693278);
                                zM87153g2 = c28655q2.m87153g(interfaceC4339a);
                                objM87133R10 = c28655q2.m87133R();
                                if (zM87153g2) {
                                    objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                z28 = false;
                                AbstractC27265l0.m82217i(null, null, textResourceM49890i2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q2, i19 << 6, 0, 4091);
                                C28655q c28655q8 = c28655q2;
                                c28655q8.m87173q(false);
                                c28655q4 = c28655q8;
                            }
                            c28655q4.m87173q(z28);
                            z29 = z28;
                            c28655q5 = c28655q4;
                        }
                        c28655q5.m87173q(z29);
                        r10 = z29;
                        c28655q3 = c28655q5;
                    } else {
                        r10 = 0;
                        c28655q2.m87150e0(1326685834);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                        f17 = f16;
                    } else {
                        f17 = f15 * f15;
                    }
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    if (i17 == 256) {
                        r15 = 1;
                    } else {
                        r15 = r10;
                    }
                    if (i18 == 2048) {
                        r14 = 1;
                    } else {
                        r14 = r10;
                    }
                    i24 = r14 | r15;
                    objM87133R9 = c28655q3.m87133R();
                    if (i24 == 0) {
                        objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                        c28655q3.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                        c28655q3.m87172p0(objM87133R9);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R9, r10, c28655q3, r10, 1);
                    function3 = function7;
                    modifier3 = modifier4;
                    c28655q = c28655q3;
                }
                objM87133R5 = new C18656a0(viewState, enumC11017d3, function5, 11);
                c28655q6.m87172p0(objM87133R5);
                interfaceC4339a = (InterfaceC4339a) objM87133R5;
                Modifier modifierMo3471e2 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))).mo3471e(modifier2);
                Modifier modifier5 = modifier2;
                C22957g c22957g4 = AbstractC22977m.f90652c;
                interfaceC28601c8 = interfaceC28601c7;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g4, C2299e.f9110M, c28655q6, 0);
                iHashCode = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q6.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q6, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q6.m87158i0();
                interfaceC28601c9 = interfaceC28601c5;
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j);
                } else {
                    c28655q6.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q6, c0209i6, c23010xM66775a4);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q6, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q6.f115903S) {
                    interfaceC28601c10 = interfaceC28601c6;
                    if (!AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q6, c0209i8, modifierM118962N4);
                    TextResource textResourceM49885d3 = viewState.getNavigationTitle();
                    TextResource textResourceM49884c3 = viewState.getNavigationSubtitle();
                    textResourceM49890i = viewState.getSkipTitle();
                    if (textResourceM49890i != null) {
                        textResource = textResourceM49890i;
                    }
                    zM87153g = c28655q6.m87153g(interfaceC4339a);
                    objM87133R6 = c28655q6.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new C21026a(interfaceC4339a, 4);
                        c28655q6.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C21026a(interfaceC4339a, 4);
                        c28655q6.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    if (i17 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i18 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objM87133R7 = c28655q6.m87133R();
                    if (z18) {
                        objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                        c28655q6.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                        c28655q6.m87172p0(objM87133R7);
                    }
                    i19 = TextResource.$stable;
                    int i212 = i19 << 3;
                    int i213 = i19 | i212 | (i19 << 9);
                    function6 = function5;
                    enumC11017d2 = enumC11017d3;
                    AbstractC21865q.m61949e(textResourceM49885d3, textResourceM49884c3, 0, textResource, interfaceC4339a4, (InterfaceC4339a) objM87133R7, c28655q6, i213, 4);
                    C22957g c22957g5 = AbstractC22977m.f90653d;
                    C2305k c2305k3 = C2299e.f9111N;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    f13 = 3;
                    f14 = 8 * f13;
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f14, new LayoutWeightElement(1.0f, true)), "LazyColumMultiSelect");
                    boolean zM87157i6 = c28655q6.m87157i(viewState);
                    if (i17 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = zM87157i6 | z19;
                    objM87133R8 = c28655q6.m87133R();
                    if (z24) {
                        c28676v3 = c28676v2;
                        interfaceC28601c11 = interfaceC28601c10;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c9;
                        C1040r c1040r4 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                        c28655q6.m87172p0(c1040r4);
                        objM87133R8 = c1040r4;
                    } else {
                        c28676v3 = c28676v2;
                        interfaceC28601c11 = interfaceC28601c10;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c9;
                        C1040r c1040r5 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                        c28655q6.m87172p0(c1040r5);
                        objM87133R8 = c1040r5;
                    }
                    AbstractC22674j.m65717c(modifierM3599a3, null, null, c22957g5, c2305k3, null, false, null, (Function1) objM87133R8, c28655q6, 221184, 462);
                    c28655q2 = c28655q6;
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g4, c2305k3, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                    f15 = 4;
                    AbstractC18489d0.m53380u(2, f15, c2314t, c28655q2);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C11016c c11016cM49887f3 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                    TextResource textResourceM49882a3 = viewState.getButtonTitle();
                    if (interfaceC28601c12.getValue() != null) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (i17 == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if (i18 == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z26 | z27 | c28655q2.m87157i(viewState);
                    Object objM87133R15 = c28655q2.m87133R();
                    C28676v0 c28676v6 = c28676v3;
                    if (zM87157i2) {
                        f16 = f14;
                        InterfaceC28601c1 interfaceC28601c110 = interfaceC28601c13;
                        InterfaceC28601c1 interfaceC28601c111 = interfaceC28601c12;
                        function7 = function6;
                        c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c110, (Object) interfaceC28601c111, (Object) interfaceC28601c11, (Object) viewState, 7);
                        enumC11017d2 = enumC11017d2;
                        c28655q2.m87172p0(c0561l);
                    } else {
                        f16 = f14;
                        InterfaceC28601c1 interfaceC28601c112 = interfaceC28601c13;
                        InterfaceC28601c1 interfaceC28601c113 = interfaceC28601c12;
                        function7 = function6;
                        c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c112, (Object) interfaceC28601c113, (Object) interfaceC28601c11, (Object) viewState, 7);
                        enumC11017d2 = enumC11017d2;
                        c28655q2.m87172p0(c0561l);
                    }
                    AbstractC13410e.m37926c(c11016cM49887f3, textResourceM49882a3, modifierM3409f3, z25, (InterfaceC4339a) c0561l, c28655q2, i19 | 384 | i212, 0);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                        AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, 1326410988, f13, f15, c2314t));
                        if (viewState.getSkipNextId() == null) {
                            c28655q2.m87150e0(1326506653);
                            c28655q2.m87173q(false);
                            z29 = false;
                            c28655q5 = c28655q2;
                        } else {
                            c28655q2.m87150e0(1326506654);
                            textResourceM49890i2 = viewState.getSkipTitle();
                            if (textResourceM49890i2 == null) {
                                c28655q2.m87150e0(309693277);
                                c28655q2.m87173q(false);
                                z28 = false;
                                c28655q4 = c28655q2;
                            } else {
                                c28655q2.m87150e0(309693278);
                                zM87153g2 = c28655q2.m87153g(interfaceC4339a);
                                objM87133R10 = c28655q2.m87133R();
                                if (zM87153g2) {
                                    objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                z28 = false;
                                AbstractC27265l0.m82217i(null, null, textResourceM49890i2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q2, i19 << 6, 0, 4091);
                                C28655q c28655q9 = c28655q2;
                                c28655q9.m87173q(false);
                                c28655q4 = c28655q9;
                            }
                            c28655q4.m87173q(z28);
                            z29 = z28;
                            c28655q5 = c28655q4;
                        }
                        c28655q5.m87173q(z29);
                        r10 = z29;
                        c28655q3 = c28655q5;
                    } else {
                        r10 = 0;
                        c28655q2.m87150e0(1326685834);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                        f17 = f16;
                    } else {
                        f17 = f15 * f15;
                    }
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    if (i17 == 256) {
                        r15 = 1;
                    } else {
                        r15 = r10;
                    }
                    if (i18 == 2048) {
                        r14 = 1;
                    } else {
                        r14 = r10;
                    }
                    i24 = r14 | r15;
                    objM87133R9 = c28655q3.m87133R();
                    if (i24 == 0) {
                        objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                        c28655q3.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                        c28655q3.m87172p0(objM87133R9);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R9, r10, c28655q3, r10, 1);
                    function3 = function7;
                    modifier3 = modifier5;
                    c28655q = c28655q3;
                } else {
                    interfaceC28601c10 = interfaceC28601c6;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q6, c0209i9, modifierM118962N4);
                TextResource textResourceM49885d4 = viewState.getNavigationTitle();
                TextResource textResourceM49884c4 = viewState.getNavigationSubtitle();
                textResourceM49890i = viewState.getSkipTitle();
                if (textResourceM49890i != null) {
                    textResource = textResourceM49890i;
                }
                zM87153g = c28655q6.m87153g(interfaceC4339a);
                objM87133R6 = c28655q6.m87133R();
                if (zM87153g) {
                    objM87133R6 = new C21026a(interfaceC4339a, 4);
                    c28655q6.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C21026a(interfaceC4339a, 4);
                    c28655q6.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                if (i17 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i18 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objM87133R7 = c28655q6.m87133R();
                if (z18) {
                    objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                    c28655q6.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                    c28655q6.m87172p0(objM87133R7);
                }
                i19 = TextResource.$stable;
                int i214 = i19 << 3;
                int i215 = i19 | i214 | (i19 << 9);
                function6 = function5;
                enumC11017d2 = enumC11017d3;
                AbstractC21865q.m61949e(textResourceM49885d4, textResourceM49884c4, 0, textResource, interfaceC4339a5, (InterfaceC4339a) objM87133R7, c28655q6, i215, 4);
                C22957g c22957g6 = AbstractC22977m.f90653d;
                C2305k c2305k4 = C2299e.f9111N;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f13 = 3;
                f14 = 8 * f13;
                Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f14, new LayoutWeightElement(1.0f, true)), "LazyColumMultiSelect");
                boolean zM87157i7 = c28655q6.m87157i(viewState);
                if (i17 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zM87157i7 | z19;
                objM87133R8 = c28655q6.m87133R();
                if (z24) {
                    c28676v3 = c28676v2;
                    interfaceC28601c11 = interfaceC28601c10;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c9;
                    C1040r c1040r6 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                    c28655q6.m87172p0(c1040r6);
                    objM87133R8 = c1040r6;
                } else {
                    c28676v3 = c28676v2;
                    interfaceC28601c11 = interfaceC28601c10;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c9;
                    C1040r c1040r7 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                    c28655q6.m87172p0(c1040r7);
                    objM87133R8 = c1040r7;
                }
                AbstractC22674j.m65717c(modifierM3599a4, null, null, c22957g6, c2305k4, null, false, null, (Function1) objM87133R8, c28655q6, 221184, 462);
                c28655q2 = c28655q6;
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
                f15 = 4;
                AbstractC18489d0.m53380u(2, f15, c2314t, c28655q2);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                C11016c c11016cM49887f4 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM49882a4 = viewState.getButtonTitle();
                if (interfaceC28601c12.getValue() != null) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (i17 == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if (i18 == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87157i2 = z26 | z27 | c28655q2.m87157i(viewState);
                Object objM87133R16 = c28655q2.m87133R();
                C28676v0 c28676v7 = c28676v3;
                if (zM87157i2) {
                    f16 = f14;
                    InterfaceC28601c1 interfaceC28601c114 = interfaceC28601c13;
                    InterfaceC28601c1 interfaceC28601c115 = interfaceC28601c12;
                    function7 = function6;
                    c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c114, (Object) interfaceC28601c115, (Object) interfaceC28601c11, (Object) viewState, 7);
                    enumC11017d2 = enumC11017d2;
                    c28655q2.m87172p0(c0561l);
                } else {
                    f16 = f14;
                    InterfaceC28601c1 interfaceC28601c116 = interfaceC28601c13;
                    InterfaceC28601c1 interfaceC28601c117 = interfaceC28601c12;
                    function7 = function6;
                    c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c116, (Object) interfaceC28601c117, (Object) interfaceC28601c11, (Object) viewState, 7);
                    enumC11017d2 = enumC11017d2;
                    c28655q2.m87172p0(c0561l);
                }
                AbstractC13410e.m37926c(c11016cM49887f4, textResourceM49882a4, modifierM3409f4, z25, (InterfaceC4339a) c0561l, c28655q2, i19 | 384 | i214, 0);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, 1326410988, f13, f15, c2314t));
                    if (viewState.getSkipNextId() == null) {
                        c28655q2.m87150e0(1326506653);
                        c28655q2.m87173q(false);
                        z29 = false;
                        c28655q5 = c28655q2;
                    } else {
                        c28655q2.m87150e0(1326506654);
                        textResourceM49890i2 = viewState.getSkipTitle();
                        if (textResourceM49890i2 == null) {
                            c28655q2.m87150e0(309693277);
                            c28655q2.m87173q(false);
                            z28 = false;
                            c28655q4 = c28655q2;
                        } else {
                            c28655q2.m87150e0(309693278);
                            zM87153g2 = c28655q2.m87153g(interfaceC4339a);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            z28 = false;
                            AbstractC27265l0.m82217i(null, null, textResourceM49890i2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q2, i19 << 6, 0, 4091);
                            C28655q c28655q10 = c28655q2;
                            c28655q10.m87173q(false);
                            c28655q4 = c28655q10;
                        }
                        c28655q4.m87173q(z28);
                        z29 = z28;
                        c28655q5 = c28655q4;
                    }
                    c28655q5.m87173q(z29);
                    r10 = z29;
                    c28655q3 = c28655q5;
                } else {
                    r10 = 0;
                    c28655q2.m87150e0(1326685834);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                    f17 = f16;
                } else {
                    f17 = f15 * f15;
                }
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                if (i17 == 256) {
                    r15 = 1;
                } else {
                    r15 = r10;
                }
                if (i18 == 2048) {
                    r14 = 1;
                } else {
                    r14 = r10;
                }
                i24 = r14 | r15;
                objM87133R9 = c28655q3.m87133R();
                if (i24 == 0) {
                    objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                    c28655q3.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                    c28655q3.m87172p0(objM87133R9);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R9, r10, c28655q3, r10, 1);
                function3 = function7;
                modifier3 = modifier5;
                c28655q = c28655q3;
            } else {
                c28655q6.m87138X();
                enumC11017d2 = enumC11017d;
                modifier3 = modifier2;
                function3 = function2;
                c28655q = c28655q6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(modifier3, viewState, enumC11017d2, function3, i13, i14, 21);
            }
        }
        i15 |= 3072;
        function2 = function1;
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q6.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier2 = c2314t;
            }
            if (i26 != 0) {
                enumC11017d3 = EnumC11017d.POSTPARTUM;
            } else {
                enumC11017d3 = enumC11017d;
            }
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                objM87133R11 = c28655q6.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C21650c(19);
                    c28655q6.m87172p0(objM87133R11);
                }
                function4 = (Function1) objM87133R11;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q6.m87133R();
            textResource = null;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q6.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q6.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q6.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q6.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11895b.m32005x(1, c28655q6);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q6.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(viewState.getScreenId());
                c28655q6.m87172p0(objM87133R4);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            HormonalScreenId hormonalScreenIdM49888g2 = viewState.getScreenId();
            zM87157i = c28655q6.m87157i(viewState);
            Object objM87133R17 = c28655q6.m87133R();
            if (zM87157i) {
                Function1 function9 = function4;
                interfaceC28601c5 = interfaceC28601c2;
                interfaceC28601c6 = interfaceC28601c3;
                c28676v1 = c28676v0;
                function5 = function9;
                aVar = new a(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c5, interfaceC28601c6, null);
                interfaceC28601c7 = interfaceC28601c1;
                c28655q6.m87172p0(aVar);
            } else {
                Function1 function10 = function4;
                interfaceC28601c5 = interfaceC28601c2;
                interfaceC28601c6 = interfaceC28601c3;
                c28676v1 = c28676v0;
                function5 = function10;
                aVar = new a(viewState, interfaceC28601c4, interfaceC28601c1, interfaceC28601c5, interfaceC28601c6, null);
                interfaceC28601c7 = interfaceC28601c1;
                c28655q6.m87172p0(aVar);
            }
            AbstractC28683x.m87253g(c28655q6, (InterfaceC4351m) aVar, hormonalScreenIdM49888g2);
            boolean zM87157i8 = c28655q6.m87157i(viewState);
            i17 = i16 & 896;
            if (i17 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z35 = zM87157i8 | z13;
            i18 = i16 & 7168;
            if (i18 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z35 | z14;
            objM87133R5 = c28655q6.m87133R();
            if (z15) {
                c28676v2 = c28676v1;
                if (objM87133R5 == c28676v2) {
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R5;
                Modifier modifierMo3471e3 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))).mo3471e(modifier2);
                Modifier modifier6 = modifier2;
                C22957g c22957g7 = AbstractC22977m.f90652c;
                interfaceC28601c8 = interfaceC28601c7;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g7, C2299e.f9110M, c28655q6, 0);
                iHashCode = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q6.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q6, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q6.m87158i0();
                interfaceC28601c9 = interfaceC28601c5;
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j);
                } else {
                    c28655q6.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q6, c0209i10, c23010xM66775a7);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q6, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q6.f115903S) {
                    interfaceC28601c10 = interfaceC28601c6;
                    if (!AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q6, c0209i12, modifierM118962N7);
                    TextResource textResourceM49885d5 = viewState.getNavigationTitle();
                    TextResource textResourceM49884c5 = viewState.getNavigationSubtitle();
                    textResourceM49890i = viewState.getSkipTitle();
                    if (textResourceM49890i != null) {
                        textResource = textResourceM49890i;
                    }
                    zM87153g = c28655q6.m87153g(interfaceC4339a);
                    objM87133R6 = c28655q6.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new C21026a(interfaceC4339a, 4);
                        c28655q6.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C21026a(interfaceC4339a, 4);
                        c28655q6.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R6;
                    if (i17 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i18 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objM87133R7 = c28655q6.m87133R();
                    if (z18) {
                        objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                        c28655q6.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                        c28655q6.m87172p0(objM87133R7);
                    }
                    i19 = TextResource.$stable;
                    int i216 = i19 << 3;
                    int i217 = i19 | i216 | (i19 << 9);
                    function6 = function5;
                    enumC11017d2 = enumC11017d3;
                    AbstractC21865q.m61949e(textResourceM49885d5, textResourceM49884c5, 0, textResource, interfaceC4339a6, (InterfaceC4339a) objM87133R7, c28655q6, i217, 4);
                    C22957g c22957g8 = AbstractC22977m.f90653d;
                    C2305k c2305k5 = C2299e.f9111N;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    f13 = 3;
                    f14 = 8 * f13;
                    Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f14, new LayoutWeightElement(1.0f, true)), "LazyColumMultiSelect");
                    boolean zM87157i9 = c28655q6.m87157i(viewState);
                    if (i17 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = zM87157i9 | z19;
                    objM87133R8 = c28655q6.m87133R();
                    if (z24) {
                        c28676v3 = c28676v2;
                        interfaceC28601c11 = interfaceC28601c10;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c9;
                        C1040r c1040r8 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                        c28655q6.m87172p0(c1040r8);
                        objM87133R8 = c1040r8;
                    } else {
                        c28676v3 = c28676v2;
                        interfaceC28601c11 = interfaceC28601c10;
                        interfaceC28601c12 = interfaceC28601c8;
                        interfaceC28601c13 = interfaceC28601c9;
                        C1040r c1040r9 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                        c28655q6.m87172p0(c1040r9);
                        objM87133R8 = c1040r9;
                    }
                    AbstractC22674j.m65717c(modifierM3599a5, null, null, c22957g8, c2305k5, null, false, null, (Function1) objM87133R8, c28655q6, 221184, 462);
                    c28655q2 = c28655q6;
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g7, c2305k5, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3396r5);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N8);
                    f15 = 4;
                    AbstractC18489d0.m53380u(2, f15, c2314t, c28655q2);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C11016c c11016cM49887f5 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                    TextResource textResourceM49882a5 = viewState.getButtonTitle();
                    if (interfaceC28601c12.getValue() != null) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (i17 == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if (i18 == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z26 | z27 | c28655q2.m87157i(viewState);
                    Object objM87133R18 = c28655q2.m87133R();
                    C28676v0 c28676v8 = c28676v3;
                    if (zM87157i2) {
                        f16 = f14;
                        InterfaceC28601c1 interfaceC28601c118 = interfaceC28601c13;
                        InterfaceC28601c1 interfaceC28601c119 = interfaceC28601c12;
                        function7 = function6;
                        c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c118, (Object) interfaceC28601c119, (Object) interfaceC28601c11, (Object) viewState, 7);
                        enumC11017d2 = enumC11017d2;
                        c28655q2.m87172p0(c0561l);
                    } else {
                        f16 = f14;
                        InterfaceC28601c1 interfaceC28601c1110 = interfaceC28601c13;
                        InterfaceC28601c1 interfaceC28601c1111 = interfaceC28601c12;
                        function7 = function6;
                        c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c1110, (Object) interfaceC28601c1111, (Object) interfaceC28601c11, (Object) viewState, 7);
                        enumC11017d2 = enumC11017d2;
                        c28655q2.m87172p0(c0561l);
                    }
                    AbstractC13410e.m37926c(c11016cM49887f5, textResourceM49882a5, modifierM3409f5, z25, (InterfaceC4339a) c0561l, c28655q2, i19 | 384 | i216, 0);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                        AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, 1326410988, f13, f15, c2314t));
                        if (viewState.getSkipNextId() == null) {
                            c28655q2.m87150e0(1326506653);
                            c28655q2.m87173q(false);
                            z29 = false;
                            c28655q5 = c28655q2;
                        } else {
                            c28655q2.m87150e0(1326506654);
                            textResourceM49890i2 = viewState.getSkipTitle();
                            if (textResourceM49890i2 == null) {
                                c28655q2.m87150e0(309693277);
                                c28655q2.m87173q(false);
                                z28 = false;
                                c28655q4 = c28655q2;
                            } else {
                                c28655q2.m87150e0(309693278);
                                zM87153g2 = c28655q2.m87153g(interfaceC4339a);
                                objM87133R10 = c28655q2.m87133R();
                                if (zM87153g2) {
                                    objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                z28 = false;
                                AbstractC27265l0.m82217i(null, null, textResourceM49890i2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q2, i19 << 6, 0, 4091);
                                C28655q c28655q11 = c28655q2;
                                c28655q11.m87173q(false);
                                c28655q4 = c28655q11;
                            }
                            c28655q4.m87173q(z28);
                            z29 = z28;
                            c28655q5 = c28655q4;
                        }
                        c28655q5.m87173q(z29);
                        r10 = z29;
                        c28655q3 = c28655q5;
                    } else {
                        r10 = 0;
                        c28655q2.m87150e0(1326685834);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                        f17 = f16;
                    } else {
                        f17 = f15 * f15;
                    }
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    if (i17 == 256) {
                        r15 = 1;
                    } else {
                        r15 = r10;
                    }
                    if (i18 == 2048) {
                        r14 = 1;
                    } else {
                        r14 = r10;
                    }
                    i24 = r14 | r15;
                    objM87133R9 = c28655q3.m87133R();
                    if (i24 == 0) {
                        objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                        c28655q3.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                        c28655q3.m87172p0(objM87133R9);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R9, r10, c28655q3, r10, 1);
                    function3 = function7;
                    modifier3 = modifier6;
                    c28655q = c28655q3;
                } else {
                    interfaceC28601c10 = interfaceC28601c6;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q6, c0209i13, modifierM118962N7);
                TextResource textResourceM49885d6 = viewState.getNavigationTitle();
                TextResource textResourceM49884c6 = viewState.getNavigationSubtitle();
                textResourceM49890i = viewState.getSkipTitle();
                if (textResourceM49890i != null) {
                    textResource = textResourceM49890i;
                }
                zM87153g = c28655q6.m87153g(interfaceC4339a);
                objM87133R6 = c28655q6.m87133R();
                if (zM87153g) {
                    objM87133R6 = new C21026a(interfaceC4339a, 4);
                    c28655q6.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C21026a(interfaceC4339a, 4);
                    c28655q6.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                if (i17 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i18 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objM87133R7 = c28655q6.m87133R();
                if (z18) {
                    objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                    c28655q6.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                    c28655q6.m87172p0(objM87133R7);
                }
                i19 = TextResource.$stable;
                int i218 = i19 << 3;
                int i219 = i19 | i218 | (i19 << 9);
                function6 = function5;
                enumC11017d2 = enumC11017d3;
                AbstractC21865q.m61949e(textResourceM49885d6, textResourceM49884c6, 0, textResource, interfaceC4339a7, (InterfaceC4339a) objM87133R7, c28655q6, i219, 4);
                C22957g c22957g9 = AbstractC22977m.f90653d;
                C2305k c2305k6 = C2299e.f9111N;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f13 = 3;
                f14 = 8 * f13;
                Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f14, new LayoutWeightElement(1.0f, true)), "LazyColumMultiSelect");
                boolean zM87157i10 = c28655q6.m87157i(viewState);
                if (i17 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zM87157i10 | z19;
                objM87133R8 = c28655q6.m87133R();
                if (z24) {
                    c28676v3 = c28676v2;
                    interfaceC28601c11 = interfaceC28601c10;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c9;
                    C1040r c1040r10 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                    c28655q6.m87172p0(c1040r10);
                    objM87133R8 = c1040r10;
                } else {
                    c28676v3 = c28676v2;
                    interfaceC28601c11 = interfaceC28601c10;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c9;
                    C1040r c1040r11 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                    c28655q6.m87172p0(c1040r11);
                    objM87133R8 = c1040r11;
                }
                AbstractC22674j.m65717c(modifierM3599a6, null, null, c22957g9, c2305k6, null, false, null, (Function1) objM87133R8, c28655q6, 221184, 462);
                c28655q2 = c28655q6;
                Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g7, c2305k6, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3396r6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N9);
                f15 = 4;
                AbstractC18489d0.m53380u(2, f15, c2314t, c28655q2);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                C11016c c11016cM49887f6 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM49882a6 = viewState.getButtonTitle();
                if (interfaceC28601c12.getValue() != null) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (i17 == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if (i18 == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87157i2 = z26 | z27 | c28655q2.m87157i(viewState);
                Object objM87133R19 = c28655q2.m87133R();
                C28676v0 c28676v9 = c28676v3;
                if (zM87157i2) {
                    f16 = f14;
                    InterfaceC28601c1 interfaceC28601c1112 = interfaceC28601c13;
                    InterfaceC28601c1 interfaceC28601c1113 = interfaceC28601c12;
                    function7 = function6;
                    c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c1112, (Object) interfaceC28601c1113, (Object) interfaceC28601c11, (Object) viewState, 7);
                    enumC11017d2 = enumC11017d2;
                    c28655q2.m87172p0(c0561l);
                } else {
                    f16 = f14;
                    InterfaceC28601c1 interfaceC28601c1114 = interfaceC28601c13;
                    InterfaceC28601c1 interfaceC28601c1115 = interfaceC28601c12;
                    function7 = function6;
                    c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c1114, (Object) interfaceC28601c1115, (Object) interfaceC28601c11, (Object) viewState, 7);
                    enumC11017d2 = enumC11017d2;
                    c28655q2.m87172p0(c0561l);
                }
                AbstractC13410e.m37926c(c11016cM49887f6, textResourceM49882a6, modifierM3409f6, z25, (InterfaceC4339a) c0561l, c28655q2, i19 | 384 | i218, 0);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, 1326410988, f13, f15, c2314t));
                    if (viewState.getSkipNextId() == null) {
                        c28655q2.m87150e0(1326506653);
                        c28655q2.m87173q(false);
                        z29 = false;
                        c28655q5 = c28655q2;
                    } else {
                        c28655q2.m87150e0(1326506654);
                        textResourceM49890i2 = viewState.getSkipTitle();
                        if (textResourceM49890i2 == null) {
                            c28655q2.m87150e0(309693277);
                            c28655q2.m87173q(false);
                            z28 = false;
                            c28655q4 = c28655q2;
                        } else {
                            c28655q2.m87150e0(309693278);
                            zM87153g2 = c28655q2.m87153g(interfaceC4339a);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            z28 = false;
                            AbstractC27265l0.m82217i(null, null, textResourceM49890i2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q2, i19 << 6, 0, 4091);
                            C28655q c28655q12 = c28655q2;
                            c28655q12.m87173q(false);
                            c28655q4 = c28655q12;
                        }
                        c28655q4.m87173q(z28);
                        z29 = z28;
                        c28655q5 = c28655q4;
                    }
                    c28655q5.m87173q(z29);
                    r10 = z29;
                    c28655q3 = c28655q5;
                } else {
                    r10 = 0;
                    c28655q2.m87150e0(1326685834);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                    f17 = f16;
                } else {
                    f17 = f15 * f15;
                }
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                if (i17 == 256) {
                    r15 = 1;
                } else {
                    r15 = r10;
                }
                if (i18 == 2048) {
                    r14 = 1;
                } else {
                    r14 = r10;
                }
                i24 = r14 | r15;
                objM87133R9 = c28655q3.m87133R();
                if (i24 == 0) {
                    objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                    c28655q3.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                    c28655q3.m87172p0(objM87133R9);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R9, r10, c28655q3, r10, 1);
                function3 = function7;
                modifier3 = modifier6;
                c28655q = c28655q3;
            } else {
                c28676v2 = c28676v1;
            }
            objM87133R5 = new C18656a0(viewState, enumC11017d3, function5, 11);
            c28655q6.m87172p0(objM87133R5);
            interfaceC4339a = (InterfaceC4339a) objM87133R5;
            Modifier modifierMo3471e4 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))).mo3471e(modifier2);
            Modifier modifier7 = modifier2;
            C22957g c22957g10 = AbstractC22977m.f90652c;
            interfaceC28601c8 = interfaceC28601c7;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g10, C2299e.f9110M, c28655q6, 0);
            iHashCode = Long.hashCode(c28655q6.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q6.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q6, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q6.m87158i0();
            interfaceC28601c9 = interfaceC28601c5;
            if (c28655q6.f115903S) {
                c28655q6.m87163l(c0213j);
            } else {
                c28655q6.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q6, c0209i14, c23010xM66775a10);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q6, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q6.f115903S) {
                interfaceC28601c10 = interfaceC28601c6;
                if (!AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q6, c0209i16, modifierM118962N10);
                TextResource textResourceM49885d7 = viewState.getNavigationTitle();
                TextResource textResourceM49884c7 = viewState.getNavigationSubtitle();
                textResourceM49890i = viewState.getSkipTitle();
                if (textResourceM49890i != null) {
                    textResource = textResourceM49890i;
                }
                zM87153g = c28655q6.m87153g(interfaceC4339a);
                objM87133R6 = c28655q6.m87133R();
                if (zM87153g) {
                    objM87133R6 = new C21026a(interfaceC4339a, 4);
                    c28655q6.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C21026a(interfaceC4339a, 4);
                    c28655q6.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R6;
                if (i17 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i18 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objM87133R7 = c28655q6.m87133R();
                if (z18) {
                    objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                    c28655q6.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                    c28655q6.m87172p0(objM87133R7);
                }
                i19 = TextResource.$stable;
                int i2110 = i19 << 3;
                int i2111 = i19 | i2110 | (i19 << 9);
                function6 = function5;
                enumC11017d2 = enumC11017d3;
                AbstractC21865q.m61949e(textResourceM49885d7, textResourceM49884c7, 0, textResource, interfaceC4339a8, (InterfaceC4339a) objM87133R7, c28655q6, i2111, 4);
                C22957g c22957g11 = AbstractC22977m.f90653d;
                C2305k c2305k7 = C2299e.f9111N;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f13 = 3;
                f14 = 8 * f13;
                Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f14, new LayoutWeightElement(1.0f, true)), "LazyColumMultiSelect");
                boolean zM87157i11 = c28655q6.m87157i(viewState);
                if (i17 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zM87157i11 | z19;
                objM87133R8 = c28655q6.m87133R();
                if (z24) {
                    c28676v3 = c28676v2;
                    interfaceC28601c11 = interfaceC28601c10;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c9;
                    C1040r c1040r12 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                    c28655q6.m87172p0(c1040r12);
                    objM87133R8 = c1040r12;
                } else {
                    c28676v3 = c28676v2;
                    interfaceC28601c11 = interfaceC28601c10;
                    interfaceC28601c12 = interfaceC28601c8;
                    interfaceC28601c13 = interfaceC28601c9;
                    C1040r c1040r13 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                    c28655q6.m87172p0(c1040r13);
                    objM87133R8 = c1040r13;
                }
                AbstractC22674j.m65717c(modifierM3599a7, null, null, c22957g11, c2305k7, null, false, null, (Function1) objM87133R8, c28655q6, 221184, 462);
                c28655q2 = c28655q6;
                Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g10, c2305k7, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3396r7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N11);
                f15 = 4;
                AbstractC18489d0.m53380u(2, f15, c2314t, c28655q2);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                C11016c c11016cM49887f7 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM49882a7 = viewState.getButtonTitle();
                if (interfaceC28601c12.getValue() != null) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (i17 == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if (i18 == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87157i2 = z26 | z27 | c28655q2.m87157i(viewState);
                Object objM87133R110 = c28655q2.m87133R();
                C28676v0 c28676v10 = c28676v3;
                if (zM87157i2) {
                    f16 = f14;
                    InterfaceC28601c1 interfaceC28601c1116 = interfaceC28601c13;
                    InterfaceC28601c1 interfaceC28601c1117 = interfaceC28601c12;
                    function7 = function6;
                    c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c1116, (Object) interfaceC28601c1117, (Object) interfaceC28601c11, (Object) viewState, 7);
                    enumC11017d2 = enumC11017d2;
                    c28655q2.m87172p0(c0561l);
                } else {
                    f16 = f14;
                    InterfaceC28601c1 interfaceC28601c1118 = interfaceC28601c13;
                    InterfaceC28601c1 interfaceC28601c1119 = interfaceC28601c12;
                    function7 = function6;
                    c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c1118, (Object) interfaceC28601c1119, (Object) interfaceC28601c11, (Object) viewState, 7);
                    enumC11017d2 = enumC11017d2;
                    c28655q2.m87172p0(c0561l);
                }
                AbstractC13410e.m37926c(c11016cM49887f7, textResourceM49882a7, modifierM3409f7, z25, (InterfaceC4339a) c0561l, c28655q2, i19 | 384 | i2110, 0);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, 1326410988, f13, f15, c2314t));
                    if (viewState.getSkipNextId() == null) {
                        c28655q2.m87150e0(1326506653);
                        c28655q2.m87173q(false);
                        z29 = false;
                        c28655q5 = c28655q2;
                    } else {
                        c28655q2.m87150e0(1326506654);
                        textResourceM49890i2 = viewState.getSkipTitle();
                        if (textResourceM49890i2 == null) {
                            c28655q2.m87150e0(309693277);
                            c28655q2.m87173q(false);
                            z28 = false;
                            c28655q4 = c28655q2;
                        } else {
                            c28655q2.m87150e0(309693278);
                            zM87153g2 = c28655q2.m87153g(interfaceC4339a);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C16416l0(interfaceC4339a, 10);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            z28 = false;
                            AbstractC27265l0.m82217i(null, null, textResourceM49890i2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q2, i19 << 6, 0, 4091);
                            C28655q c28655q13 = c28655q2;
                            c28655q13.m87173q(false);
                            c28655q4 = c28655q13;
                        }
                        c28655q4.m87173q(z28);
                        z29 = z28;
                        c28655q5 = c28655q4;
                    }
                    c28655q5.m87173q(z29);
                    r10 = z29;
                    c28655q3 = c28655q5;
                } else {
                    r10 = 0;
                    c28655q2.m87150e0(1326685834);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                    f17 = f16;
                } else {
                    f17 = f15 * f15;
                }
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                if (i17 == 256) {
                    r15 = 1;
                } else {
                    r15 = r10;
                }
                if (i18 == 2048) {
                    r14 = 1;
                } else {
                    r14 = r10;
                }
                i24 = r14 | r15;
                objM87133R9 = c28655q3.m87133R();
                if (i24 == 0) {
                    objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                    c28655q3.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                    c28655q3.m87172p0(objM87133R9);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R9, r10, c28655q3, r10, 1);
                function3 = function7;
                modifier3 = modifier7;
                c28655q = c28655q3;
            } else {
                interfaceC28601c10 = interfaceC28601c6;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q6, c0209i17, modifierM118962N10);
            TextResource textResourceM49885d8 = viewState.getNavigationTitle();
            TextResource textResourceM49884c8 = viewState.getNavigationSubtitle();
            textResourceM49890i = viewState.getSkipTitle();
            if (textResourceM49890i != null) {
                textResource = textResourceM49890i;
            }
            zM87153g = c28655q6.m87153g(interfaceC4339a);
            objM87133R6 = c28655q6.m87133R();
            if (zM87153g) {
                objM87133R6 = new C21026a(interfaceC4339a, 4);
                c28655q6.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C21026a(interfaceC4339a, 4);
                c28655q6.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R6;
            if (i17 == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (i18 == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z16 | z17;
            objM87133R7 = c28655q6.m87133R();
            if (z18) {
                objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                c28655q6.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C21850b(enumC11017d3, function5, 1);
                c28655q6.m87172p0(objM87133R7);
            }
            i19 = TextResource.$stable;
            int i2112 = i19 << 3;
            int i2113 = i19 | i2112 | (i19 << 9);
            function6 = function5;
            enumC11017d2 = enumC11017d3;
            AbstractC21865q.m61949e(textResourceM49885d8, textResourceM49884c8, 0, textResource, interfaceC4339a9, (InterfaceC4339a) objM87133R7, c28655q6, i2113, 4);
            C22957g c22957g12 = AbstractC22977m.f90653d;
            C2305k c2305k8 = C2299e.f9111N;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            f13 = 3;
            f14 = 8 * f13;
            Modifier modifierM3599a8 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f14, new LayoutWeightElement(1.0f, true)), "LazyColumMultiSelect");
            boolean zM87157i12 = c28655q6.m87157i(viewState);
            if (i17 == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = zM87157i12 | z19;
            objM87133R8 = c28655q6.m87133R();
            if (z24) {
                c28676v3 = c28676v2;
                interfaceC28601c11 = interfaceC28601c10;
                interfaceC28601c12 = interfaceC28601c8;
                interfaceC28601c13 = interfaceC28601c9;
                C1040r c1040r14 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                c28655q6.m87172p0(c1040r14);
                objM87133R8 = c1040r14;
            } else {
                c28676v3 = c28676v2;
                interfaceC28601c11 = interfaceC28601c10;
                interfaceC28601c12 = interfaceC28601c8;
                interfaceC28601c13 = interfaceC28601c9;
                C1040r c1040r15 = new C1040r(viewState, interfaceC28601c12, enumC11017d2, interfaceC28601c13, interfaceC28601c11, 16, false);
                c28655q6.m87172p0(c1040r15);
                objM87133R8 = c1040r15;
            }
            AbstractC22674j.m65717c(modifierM3599a8, null, null, c22957g12, c2305k8, null, false, null, (Function1) objM87133R8, c28655q6, 221184, 462);
            c28655q2 = c28655q6;
            Modifier modifierM3396r8 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g10, c2305k8, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3396r8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N12);
            f15 = 4;
            AbstractC18489d0.m53380u(2, f15, c2314t, c28655q2);
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
            C11016c c11016cM49887f8 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
            TextResource textResourceM49882a8 = viewState.getButtonTitle();
            if (interfaceC28601c12.getValue() != null) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (i17 == 256) {
                z26 = true;
            } else {
                z26 = false;
            }
            if (i18 == 2048) {
                z27 = true;
            } else {
                z27 = false;
            }
            zM87157i2 = z26 | z27 | c28655q2.m87157i(viewState);
            Object objM87133R111 = c28655q2.m87133R();
            C28676v0 c28676v11 = c28676v3;
            if (zM87157i2) {
                f16 = f14;
                InterfaceC28601c1 interfaceC28601c11110 = interfaceC28601c13;
                InterfaceC28601c1 interfaceC28601c11111 = interfaceC28601c12;
                function7 = function6;
                c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c11110, (Object) interfaceC28601c11111, (Object) interfaceC28601c11, (Object) viewState, 7);
                enumC11017d2 = enumC11017d2;
                c28655q2.m87172p0(c0561l);
            } else {
                f16 = f14;
                InterfaceC28601c1 interfaceC28601c11112 = interfaceC28601c13;
                InterfaceC28601c1 interfaceC28601c11113 = interfaceC28601c12;
                function7 = function6;
                c0561l = new C0561l((Object) enumC11017d2, function7, (Object) interfaceC28601c11112, (Object) interfaceC28601c11113, (Object) interfaceC28601c11, (Object) viewState, 7);
                enumC11017d2 = enumC11017d2;
                c28655q2.m87172p0(c0561l);
            }
            AbstractC13410e.m37926c(c11016cM49887f8, textResourceM49882a8, modifierM3409f8, z25, (InterfaceC4339a) c0561l, c28655q2, i19 | 384 | i2112, 0);
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, 1326410988, f13, f15, c2314t));
                if (viewState.getSkipNextId() == null) {
                    c28655q2.m87150e0(1326506653);
                    c28655q2.m87173q(false);
                    z29 = false;
                    c28655q5 = c28655q2;
                } else {
                    c28655q2.m87150e0(1326506654);
                    textResourceM49890i2 = viewState.getSkipTitle();
                    if (textResourceM49890i2 == null) {
                        c28655q2.m87150e0(309693277);
                        c28655q2.m87173q(false);
                        z28 = false;
                        c28655q4 = c28655q2;
                    } else {
                        c28655q2.m87150e0(309693278);
                        zM87153g2 = c28655q2.m87153g(interfaceC4339a);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R10 = new C16416l0(interfaceC4339a, 10);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C16416l0(interfaceC4339a, 10);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        z28 = false;
                        AbstractC27265l0.m82217i(null, null, textResourceM49890i2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q2, i19 << 6, 0, 4091);
                        C28655q c28655q14 = c28655q2;
                        c28655q14.m87173q(false);
                        c28655q4 = c28655q14;
                    }
                    c28655q4.m87173q(z28);
                    z29 = z28;
                    c28655q5 = c28655q4;
                }
                c28655q5.m87173q(z29);
                r10 = z29;
                c28655q3 = c28655q5;
            } else {
                r10 = 0;
                c28655q2.m87150e0(1326685834);
                c28655q2.m87173q(false);
                c28655q3 = c28655q2;
            }
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                f17 = f16;
            } else {
                f17 = f15 * f15;
            }
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f17, c2314t));
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            if (i17 == 256) {
                r15 = 1;
            } else {
                r15 = r10;
            }
            if (i18 == 2048) {
                r14 = 1;
            } else {
                r14 = r10;
            }
            i24 = r14 | r15;
            objM87133R9 = c28655q3.m87133R();
            if (i24 == 0) {
                objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                c28655q3.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C21850b(enumC11017d2, function7, 2);
                c28655q3.m87172p0(objM87133R9);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R9, r10, c28655q3, r10, 1);
            function3 = function7;
            modifier3 = modifier7;
            c28655q = c28655q3;
        } else {
            c28655q6.m87138X();
            enumC11017d2 = enumC11017d;
            modifier3 = modifier2;
            function3 = function2;
            c28655q = c28655q6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(modifier3, viewState, enumC11017d2, function3, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m61876o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m61877p(C17544d c17544d, EnumC11017d enumC11017d, Function1 function1) {
        HormonalScreenId hormonalScreenIdM49889h = c17544d.getSkipNextId();
        if (hormonalScreenIdM49889h != null) {
            int i13 = f.f84427a[enumC11017d.ordinal()];
            if (i13 == 1) {
                function1.invoke(new AbstractC17546f.g(hormonalScreenIdM49889h));
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                function1.invoke(new AbstractC11022i.f(hormonalScreenIdM49889h));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m61878q(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m61879r(EnumC11017d enumC11017d, Function1 function1) {
        int i13 = f.f84427a[enumC11017d.ordinal()];
        if (i13 == 1) {
            function1.invoke(AbstractC17546f.a.f67870a);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(AbstractC11022i.a.f34542a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m61880s(C17544d c17544d, InterfaceC28601c1 interfaceC28601c1, EnumC11017d enumC11017d, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2476a1(c17544d, 22), true, -790674215), 3);
        List<C17543c> listM49886e = c17544d.m49886e();
        c cVar = c.f84418w;
        ((C26053f) LazyColumn).m77529r(listM49886e.size(), null, new d(cVar, listM49886e), new C37816b(new e(listM49886e, interfaceC28601c1, enumC11017d, c17544d, interfaceC28601c2, interfaceC28601c3), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m61881t(C17544d c17544d, InterfaceC1103a item, Composer composer, int i13) {
        C28655q c28655q;
        C2314t c2314t;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i13 & 1, (i13 & 17) != 16)) {
            TextResource textResourceM49891j = c17544d.getTitle();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM49891j, c28655q2, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            C2886a c2886aM8416N = c38072d.m121952e(c28655q2, i15).getT1();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C36775k c36775k = new C36775k(5);
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierM3409f, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q2, 48, i16, 196088);
            TextResource textResourceM49883b = c17544d.getDescription();
            if (textResourceM49883b == null) {
                c28655q = c28655q2;
                c28655q.m87150e0(-1374517753);
                c28655q.m87173q(false);
                c2314t = c2314t2;
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-1374517752);
                AbstractC18489d0.m53380u(2, 4, c2314t2, c28655q);
                c2314t = c2314t2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM49883b, c28655q, i14), AbstractC1102d.m3409f(1.0f, c2314t2), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 48, i16, 196088);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC18489d0.m53380u(8, (float) 4, c2314t, c28655q);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m61882u(EnumC11017d enumC11017d, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, C17544d c17544d) {
        C40925b c40925b;
        C40925b c40925b2;
        int i13 = f.f84427a[enumC11017d.ordinal()];
        int i14 = 0;
        Object obj = null;
        if (i13 == 1) {
            HormonalScreenId hormonalScreenId = (HormonalScreenId) interfaceC28601c1.getValue();
            String str = (String) interfaceC28601c2.getValue();
            if (str != null) {
                EnumC14674b[] enumC14674bArrValues = EnumC14674b.values();
                int length = enumC14674bArrValues.length;
                while (i14 < length) {
                    EnumC14674b enumC14674b = enumC14674bArrValues[i14];
                    if (AbstractC22676k.m65745e(enumC14674b.name(), str)) {
                        obj = enumC14674b;
                        break;
                    }
                    i14++;
                }
            }
            EnumC14674b enumC14674b2 = obj;
            Integer num = (Integer) interfaceC28601c3.getValue();
            function1.invoke(new AbstractC17546f.c(hormonalScreenId, new C14676d(null, enumC14674b2, null, false, null, num != null ? num.intValue() : 1, null, null, null, null, 989, null)));
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (interfaceC28601c1.getValue() == HormonalScreenId.PREGNANCY_ONBOARDING) {
                function1.invoke(new AbstractC11022i.g(false));
            } else {
                HormonalScreenId hormonalScreenId2 = (HormonalScreenId) interfaceC28601c1.getValue();
                int i15 = f.f84428b[c17544d.getScreenId().ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        c40925b2 = new C40925b(null, null, null, null, null, null, null, 127, null);
                    } else {
                        String str2 = (String) interfaceC28601c2.getValue();
                        if (str2 != null) {
                            ContraceptionType contraceptionType = ContraceptionType.NONE;
                            ContraceptionType[] contraceptionTypeArrValues = ContraceptionType.values();
                            int length2 = contraceptionTypeArrValues.length;
                            while (i14 < length2) {
                                ContraceptionType contraceptionType2 = contraceptionTypeArrValues[i14];
                                if (AbstractC22676k.m65745e(contraceptionType2.name(), str2)) {
                                    obj = contraceptionType2;
                                    break;
                                }
                                i14++;
                            }
                            if (obj == null) {
                                obj = contraceptionType;
                            }
                        }
                        c40925b = new C40925b(null, null, null, null, obj, null, null, 111, null);
                    }
                    function1.invoke(new AbstractC11022i.d(hormonalScreenId2, c40925b2));
                } else {
                    String str3 = (String) interfaceC28601c2.getValue();
                    if (str3 != null) {
                        MciInterest mciInterest = MciInterest.OTHER_OR_NONE_OF_THE_ABOVE;
                        MciInterest[] mciInterestArrValues = MciInterest.values();
                        int length3 = mciInterestArrValues.length;
                        while (i14 < length3) {
                            MciInterest mciInterest2 = mciInterestArrValues[i14];
                            if (AbstractC22676k.m65745e(mciInterest2.name(), str3)) {
                                obj = mciInterest2;
                                break;
                            }
                            i14++;
                        }
                        if (obj == null) {
                            obj = mciInterest;
                        }
                    }
                    c40925b = new C40925b(null, null, null, obj, null, null, null, 119, null);
                }
                c40925b2 = c40925b;
                function1.invoke(new AbstractC11022i.d(hormonalScreenId2, c40925b2));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m61883v(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m61884w(EnumC11017d enumC11017d, Function1 function1) {
        int i13 = f.f84427a[enumC11017d.ordinal()];
        if (i13 == 1) {
            function1.invoke(AbstractC17546f.a.f67870a);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(AbstractC11022i.a.f34542a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m61885x(Modifier modifier, C17544d c17544d, EnumC11017d enumC11017d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m61875n(modifier, c17544d, enumC11017d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public static final void m61886y(C17543c c17543c, EnumC11017d enumC11017d, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        EnumC11017d enumC11017d2;
        boolean z15;
        C28677v1 c28677v1M87180u;
        EnumC11017d enumC11017d3;
        boolean z16;
        boolean z17;
        Object objM87133R;
        long jM95628d;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(325202593);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c17543c) : c28655q.m87157i(c17543c) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC11017d == null ? -1 : enumC11017d.ordinal()) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i16 = 2048;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    enumC11017d3 = EnumC11017d.POSTPARTUM;
                } else {
                    enumC11017d3 = enumC11017d;
                }
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                z17 = (i15 & 7168) == 2048;
                objM87133R = c28655q.m87133R();
                if (z17 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C21026a(interfaceC4339a, 3);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                float f14 = 0 * f13;
                if (z16) {
                    c28655q.m87150e0(-1012906576);
                    jM95628d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1012905336);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                AbstractC12889b.m36263b(modifierM3362g, c33252iM105489e, jM95628d, null, f14, AbstractC37817c.m121344e(804135582, c28655q, new C0341c(c17543c, z16, enumC11017d3, 10)), c28655q, 1769472, 24);
                enumC11017d2 = enumC11017d3;
                z15 = z16;
            } else {
                c28655q.m87138X();
                enumC11017d2 = enumC11017d;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(c17543c, enumC11017d2, z15, interfaceC4339a, i13, i14, 16);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(interfaceC4339a)) {
                i16 = 2048;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                enumC11017d3 = EnumC11017d.POSTPARTUM;
            } else {
                enumC11017d3 = enumC11017d;
            }
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            if ((i15 & 7168) == 2048) {
            }
            objM87133R = c28655q.m87133R();
            if (z17) {
                objM87133R = new C21026a(interfaceC4339a, 3);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21026a(interfaceC4339a, 3);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f15 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f15);
            float f16 = 0 * f15;
            if (z16) {
                c28655q.m87150e0(-1012906576);
                jM95628d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1012905336);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            AbstractC12889b.m36263b(modifierM3362g2, c33252iM105489e2, jM95628d, null, f16, AbstractC37817c.m121344e(804135582, c28655q, new C0341c(c17543c, z16, enumC11017d3, 10)), c28655q, 1769472, 24);
            enumC11017d2 = enumC11017d3;
            z15 = z16;
        } else {
            c28655q.m87138X();
            enumC11017d2 = enumC11017d;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(c17543c, enumC11017d2, z15, interfaceC4339a, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m61887z(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }
}

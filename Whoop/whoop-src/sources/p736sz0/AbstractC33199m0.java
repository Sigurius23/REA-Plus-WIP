package p736sz0;

import a11.C0131i;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.C1815o0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bp0.C3527o;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d41.C11678d;
import e61.C12762e;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gy0.AbstractC16276e;
import hg3.AbstractC17269i;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import kd1.AbstractC22392e;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11361i0;
import p077d0.EnumC11408v0;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
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
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qc1.C30217a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s52.C32223d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: sz0.m0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0095\u0001\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0016H\u0001¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u0005H\u0001¢\u0006\u0004\b$\u0010#¨\u0006%"}, m65681d2 = {"Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "Lkotlin/Function0;", "Ll83/a0;", "onScrimClicked", "primaryButtonText", "primaryAction", "", "showSecondaryAction", "showSecondaryActionIcon", "secondaryButtonText", "secondaryAction", "Landroidx/compose/ui/Modifier;", "modifier", "removeBackgroundModifier", "overlayBackground", "F", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V", "B", "(Lsz0/p0;Landroidx/compose/runtime/Composer;I)V", "Li2/x;", "N", "(Lsz0/p0;Landroidx/compose/runtime/Composer;I)J", "tint", "s", "(Lsz0/p0;JLandroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "image", "u", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "q", "(JLandroidx/compose/runtime/Composer;I)V", "z", "(Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33199m0 {

    /* JADX INFO: renamed from: sz0.m0$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.ProgressModalKt$LoadingCircle$1$1", m100430f = "ProgressModal.kt", m100431l = {DfuBaseService.NOTIFICATION_ID}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138415w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11344e f138416x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11344e c11344e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138416x = c11344e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f138416x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138415w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11344e c11344e = this.f138416x;
                Float f13 = new Float(1.0f);
                C11361i0 c11361i0M30569q = AbstractC11348f.m30569q(AbstractC11348f.m30574v(1500, 0, null, 6), EnumC11408v0.f36577w, 4);
                this.f138415w = 1;
                if (C11344e.m30547d(c11344e, f13, c11361i0M30569q, null, this, 12) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sz0.m0$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.ProgressModalKt$ProgressModal$5$3$1", m100430f = "ProgressModal.kt", m100431l = {162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Landroidx/lifecycle/x;", "it", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;Landroidx/lifecycle/x;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f138417w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC33208p0 f138418x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC33208p0 abstractC33208p0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f138418x = abstractC33208p0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, AbstractC1638x abstractC1638x, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new b(this.f138418x, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138417w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long jM105315h = ((AbstractC33208p0.h) this.f138418x).getDisplayTimeMs();
                this.f138417w = 1;
                if (AbstractC3034m0.m8782b(jM105315h, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            ((AbstractC33208p0.h) this.f138418x).getOnDisplayTimeElapsed().invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sz0.m0$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f138419w = new c();

        /* JADX INFO: renamed from: a */
        public final long m105250a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m105250a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m105209A(int i13, Composer composer, int i14) {
        m105248z(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m105210B(AbstractC33208p0 type, Composer composer, int i13) {
        int i14;
        boolean zIsFeatureEnabled;
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-420122725);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(type) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            int i15 = i14 & 14;
            long jM105222N = m105222N(type, c28655q, i15);
            C2307m c2307m = C2299e.f9102E;
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(((float) 22.5d) * f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
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
            if (type.equals(AbstractC33208p0.c.f138471e) || type.equals(AbstractC33208p0.f.f138478e) || (type instanceof AbstractC33208p0.d)) {
                c28655q.m87150e0(2005152392);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled(FeatureFlagRepositoryKt.DESIGN_LOTTIE_LOADING);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2030183245);
                c28655q.m87173q(false);
                zIsFeatureEnabled = false;
            }
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(2030294943);
                Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "progress_modal_loading_lottie");
                InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C32223d(19);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C30217a(16);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC35684p.m113047h(modifierM3599a, dVarM113128a, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R2, null, null, c28655q, 1769478, 412);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (type.getImageSource() != null) {
                c28655q.m87150e0(2030631324);
                m105243u(type.getImageSource(), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2030730834);
                m105241s(type, jM105222N, c28655q, i15);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(type.getIcon(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1102d.m3419p(8 * f13, c2314t), "progress_modal_loading_default"), jM105222N, c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(type, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m105211C() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m105212D(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m105213E(AbstractC33208p0 abstractC33208p0, int i13, Composer composer, int i14) {
        m105210B(abstractC33208p0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0164  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175  */
    /* JADX WARN: Code duplicated, block: B:127:0x0187  */
    /* JADX WARN: Code duplicated, block: B:131:0x0190  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01de  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:162:0x0201  */
    /* JADX WARN: Code duplicated, block: B:164:0x0204  */
    /* JADX WARN: Code duplicated, block: B:167:0x0209  */
    /* JADX WARN: Code duplicated, block: B:168:0x0210  */
    /* JADX WARN: Code duplicated, block: B:170:0x0214  */
    /* JADX WARN: Code duplicated, block: B:172:0x021a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0228  */
    /* JADX WARN: Code duplicated, block: B:176:0x022a  */
    /* JADX WARN: Code duplicated, block: B:178:0x022e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0231  */
    /* JADX WARN: Code duplicated, block: B:181:0x0235  */
    /* JADX WARN: Code duplicated, block: B:182:0x023a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0249  */
    /* JADX WARN: Code duplicated, block: B:188:0x0253  */
    /* JADX WARN: Code duplicated, block: B:190:0x025f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0279  */
    /* JADX WARN: Code duplicated, block: B:194:0x027c  */
    /* JADX WARN: Code duplicated, block: B:195:0x029c  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:201:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:204:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:205:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x02da  */
    /* JADX WARN: Code duplicated, block: B:212:0x034b  */
    /* JADX WARN: Code duplicated, block: B:213:0x034f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0362  */
    /* JADX WARN: Code duplicated, block: B:218:0x0370  */
    /* JADX WARN: Code duplicated, block: B:221:0x0410  */
    /* JADX WARN: Code duplicated, block: B:223:0x042f  */
    /* JADX WARN: Code duplicated, block: B:224:0x0431  */
    /* JADX WARN: Code duplicated, block: B:227:0x0438 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x043a  */
    /* JADX WARN: Code duplicated, block: B:230:0x045e  */
    /* JADX WARN: Code duplicated, block: B:232:0x046a  */
    /* JADX WARN: Code duplicated, block: B:247:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:250:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:253:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:256:0x04f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:257:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:260:0x050f  */
    /* JADX WARN: Code duplicated, block: B:263:0x052d  */
    /* JADX WARN: Code duplicated, block: B:266:0x0542  */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static final void m105214F(final AbstractC33208p0 type, final TextResource supportText, InterfaceC4339a interfaceC4339a, TextResource textResource, InterfaceC4339a interfaceC4339a2, boolean z4, boolean z13, TextResource textResource2, InterfaceC4339a interfaceC4339a3, Modifier modifier, boolean z14, boolean z15, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        InterfaceC4339a interfaceC4339a4;
        TextResource textResource3;
        int i17;
        InterfaceC4339a interfaceC4339a5;
        int i18;
        int i19;
        boolean z16;
        int i24;
        int i25;
        boolean z17;
        int i26;
        int i27;
        final InterfaceC4339a interfaceC4339a6;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        boolean z18;
        final boolean z19;
        final boolean z24;
        final InterfaceC4339a interfaceC4339a7;
        final TextResource textResource4;
        final TextResource textResource5;
        final Modifier modifier2;
        final boolean z25;
        final InterfaceC4339a interfaceC4339a8;
        final boolean z26;
        C28677v1 c28677v1M87180u;
        int i46;
        C2314t c2314t;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a9;
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        Modifier modifier3;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        boolean z34;
        Object objM87133R4;
        TextResource textResource6;
        Modifier modifierM44019X0;
        int i47;
        boolean z35;
        Object objM87133R5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i48;
        float f13;
        boolean z36;
        Object objM87133R6;
        boolean z37;
        Object objM87133R7;
        Object objM87133R8;
        int i49;
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(supportText, "supportText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(697524981);
        if ((i13 & 6) == 0) {
            i16 = (c28655q.m87153g(type) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87153g(supportText) ? 32 : 16;
        }
        int i54 = i15 & 4;
        if (i54 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a4 = interfaceC4339a;
                i16 |= c28655q.m87157i(interfaceC4339a4) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    textResource3 = textResource;
                    if (c28655q.m87153g(textResource3)) {
                        i49 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i16 |= i49;
                } else {
                    textResource3 = textResource;
                }
                i49 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i16 |= i49;
            } else {
                textResource3 = textResource;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a5 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a5)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    z16 = z4;
                } else {
                    z16 = z4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87155h(z16)) {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    z17 = z13;
                } else {
                    z17 = z13;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z17)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                }
                if ((i13 & 12582912) != 0) {
                    i16 |= ((i15 & 128) == 0 || !c28655q.m87153g(textResource2)) ? 4194304 : 8388608;
                }
                i27 = i15 & 256;
                if (i27 != 0) {
                    i16 |= 100663296;
                    interfaceC4339a6 = interfaceC4339a3;
                } else {
                    interfaceC4339a6 = interfaceC4339a3;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87157i(interfaceC4339a6)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i16;
                i34 = i15 & 512;
                if (i34 != 0) {
                    i29 |= 805306368;
                } else if ((i13 & 805306368) != 0) {
                    if (c28655q.m87153g(modifier)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i29 |= i35;
                }
                i36 = i29;
                i37 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    i38 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i14 | i39;
                } else {
                    i38 = i14;
                }
                i44 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i44 != 0) {
                    if ((i14 & 48) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    if ((i36 & 306783379) == 306783378 || (i38 & 19) != 18) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i36 & 1, z18)) {
                        c28655q.m87140Z();
                        i46 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        c28676v0 = C28635l.f115821a;
                        if (i46 != 0 || c28655q.m87118C()) {
                            if (i54 != 0) {
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C32223d(16);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a9 = interfaceC4339a4;
                            }
                            if ((i15 & 8) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i36 &= -7169;
                            } else {
                                textResourceM21267a = textResource3;
                            }
                            if (i17 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C32223d(17);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i19 != 0) {
                                z16 = false;
                            }
                            if (i25 != 0) {
                                z17 = false;
                            }
                            if ((i15 & 128) != 0) {
                                textResourceM21267a2 = AbstractC8693b.m21267a();
                                i36 &= -29360129;
                            } else {
                                textResourceM21267a2 = textResource2;
                            }
                            if (i27 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32223d(18);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if (i34 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i37 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if (i44 != 0) {
                                z29 = z27;
                                z28 = false;
                            } else {
                                z28 = z15;
                                z29 = z27;
                            }
                        } else {
                            c28655q.m87138X();
                            if ((i15 & 8) != 0) {
                                i36 &= -7169;
                            }
                            if ((i15 & 128) != 0) {
                                i36 &= -29360129;
                            }
                            modifier3 = modifier;
                            z29 = z14;
                            z28 = z15;
                            interfaceC4339a9 = interfaceC4339a4;
                            textResourceM21267a = textResource3;
                            textResourceM21267a2 = textResource2;
                        }
                        c28655q.m87175r();
                        z34 = z16;
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R4;
                        if (z29) {
                            c28655q.m87150e0(306630112);
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = c.f138419w;
                                c28655q.m87172p0(objM87133R8);
                            }
                            Modifier modifierM52565c = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R8));
                            c28655q.m87173q(false);
                            modifierM44019X0 = modifierM52565c;
                            textResource6 = textResourceM21267a2;
                        } else if (z28) {
                            c28655q.m87150e0(306632747);
                            textResource6 = textResourceM21267a2;
                            modifierM44019X0 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBlack90()));
                            c28655q.m87173q(false);
                        } else {
                            textResource6 = textResourceM21267a2;
                            if (!(type instanceof AbstractC33208p0.c) || (type instanceof AbstractC33208p0.d)) {
                                c28655q.m87150e0(306637691);
                                c28655q.m87173q(false);
                                modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                            } else {
                                c28655q.m87150e0(306639730);
                                c28655q.m87173q(false);
                                modifierM44019X0 = AbstractC15673b0.m44028b0(c2314t);
                            }
                        }
                        i47 = i36;
                        if ((i36 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z35 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C12762e(interfaceC4339a9, 10);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3394p(6 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(c2314t, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R5, 28)).mo3471e(modifierM44019X0))).mo3471e(modifier3), "progress_modal");
                        InterfaceC4339a interfaceC4339a10 = interfaceC4339a9;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        Modifier modifier4 = modifier3;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
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
                        i48 = i47 & 14;
                        m105210B(type, c28655q, i48);
                        float f14 = 4;
                        f13 = 9 * f14;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                        String strM21274h = AbstractC8693b.m21274h(type.getTitle(), c28655q, 0);
                        C38072d c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, modifierM3599a2, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
                        AbstractC18489d0.m53380u(2, f14, c2314t, c28655q);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(supportText, c28655q, (i47 >> 3) & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                        if (AbstractC8693b.m21270d(textResourceM21267a)) {
                            AbstractC31061c.m95623C(c28655q, 261109049, c2314t, f13, c28655q);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                            String strM21274h2 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i47 >> 9) & 14);
                            if ((i47 & 57344) == 16384) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z37 || objM87133R7 == c28676v0) {
                                objM87133R7 = new C12762e(interfaceC4339a5, 11);
                                c28655q.m87172p0(objM87133R7);
                            }
                            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, 0L, null, false, (InterfaceC4339a) objM87133R7, c28655q, 54, 120);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(261383895);
                            c28655q.m87173q(false);
                        }
                        if (z34 || !AbstractC8693b.m21270d(textResource6)) {
                            c28655q.m87150e0(261805495);
                            c28655q.m87173q(false);
                        } else {
                            AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 261465301, f14, f14, c2314t));
                            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextLarge;
                            C39274g c39274g = z17 ? new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0) : null;
                            boolean z38 = (i47 & 234881024) == 67108864;
                            Object objM87133R9 = c28655q.m87133R();
                            if (z38 || objM87133R9 == c28676v0) {
                                objM87133R9 = new C1815o0(interfaceC4339a6, 3);
                                c28655q.m87172p0(objM87133R9);
                            }
                            AbstractC27265l0.m82217i(null, enumC27269n0, textResource6, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R9, c28655q, ((i47 >> 15) & 896) | 48, 0, 4073);
                            c28655q.m87173q(false);
                        }
                        if (type instanceof AbstractC33208p0.h) {
                            c28655q.m87150e0(261858815);
                            EnumC1632v enumC1632v = EnumC1632v.ON_RESUME;
                            if (i48 == 4) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z36 || objM87133R6 == c28676v0) {
                                objM87133R6 = new b(type, null);
                                c28655q.m87172p0(objM87133R6);
                            }
                            AbstractC22392e.m64443d(enumC1632v, (Function3) objM87133R6, c28655q, 6);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(262004887);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        interfaceC4339a7 = interfaceC4339a10;
                        z25 = z29;
                        z24 = z34;
                        textResource4 = textResourceM21267a;
                        z19 = z28;
                        textResource5 = textResource6;
                        modifier2 = modifier4;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                        z24 = z16;
                        interfaceC4339a7 = interfaceC4339a4;
                        textResource4 = textResource3;
                        textResource5 = textResource2;
                        modifier2 = modifier;
                        z25 = z14;
                    }
                    interfaceC4339a8 = interfaceC4339a5;
                    z26 = z17;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.l0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33199m0.m105221M(type, supportText, interfaceC4339a7, textResource4, interfaceC4339a8, z24, z26, textResource5, interfaceC4339a6, modifier2, z25, z19, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i38 |= 48;
                if ((i36 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q.m87135U(i36 & 1, z18)) {
                    c28655q.m87140Z();
                    i46 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    if (i46 != 0) {
                        if (i54 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32223d(16);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a9 = interfaceC4339a4;
                        }
                        if ((i15 & 8) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i36 &= -7169;
                        } else {
                            textResourceM21267a = textResource3;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32223d(17);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            z16 = false;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        }
                        if ((i15 & 128) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i36 &= -29360129;
                        } else {
                            textResourceM21267a2 = textResource2;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32223d(18);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (i34 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i44 != 0) {
                            z29 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            z29 = z27;
                        }
                    } else {
                        if (i54 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32223d(16);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a9 = interfaceC4339a4;
                        }
                        if ((i15 & 8) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i36 &= -7169;
                        } else {
                            textResourceM21267a = textResource3;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32223d(17);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            z16 = false;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        }
                        if ((i15 & 128) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i36 &= -29360129;
                        } else {
                            textResourceM21267a2 = textResource2;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32223d(18);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (i34 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i44 != 0) {
                            z29 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            z29 = z27;
                        }
                    }
                    c28655q.m87175r();
                    z34 = z16;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R4;
                    if (z29) {
                        c28655q.m87150e0(306630112);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = c.f138419w;
                            c28655q.m87172p0(objM87133R8);
                        }
                        Modifier modifierM52565c2 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R8));
                        c28655q.m87173q(false);
                        modifierM44019X0 = modifierM52565c2;
                        textResource6 = textResourceM21267a2;
                    } else if (z28) {
                        c28655q.m87150e0(306632747);
                        textResource6 = textResourceM21267a2;
                        modifierM44019X0 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBlack90()));
                        c28655q.m87173q(false);
                    } else {
                        textResource6 = textResourceM21267a2;
                        if (type instanceof AbstractC33208p0.c) {
                            c28655q.m87150e0(306637691);
                            c28655q.m87173q(false);
                            modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                        } else {
                            c28655q.m87150e0(306637691);
                            c28655q.m87173q(false);
                            modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                        }
                    }
                    i47 = i36;
                    if ((i36 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z35) {
                        objM87133R5 = new C12762e(interfaceC4339a9, 10);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C12762e(interfaceC4339a9, 10);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(6 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(c2314t, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R5, 28)).mo3471e(modifierM44019X0))).mo3471e(modifier3), "progress_modal");
                    InterfaceC4339a interfaceC4339a11 = interfaceC4339a9;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    Modifier modifier5 = modifier3;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a3);
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
                    i48 = i47 & 14;
                    m105210B(type, c28655q, i48);
                    float f15 = 4;
                    f13 = 9 * f15;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                    String strM21274h3 = AbstractC8693b.m21274h(type.getTitle(), c28655q, 0);
                    C38072d c38072d2 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h3, modifierM3599a4, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
                    AbstractC18489d0.m53380u(2, f15, c2314t, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(supportText, c28655q, (i47 >> 3) & 14), null, c38072d2.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                    if (AbstractC8693b.m21270d(textResourceM21267a)) {
                        AbstractC31061c.m95623C(c28655q, 261109049, c2314t, f13, c28655q);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                        String strM21274h4 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i47 >> 9) & 14);
                        if ((i47 & 57344) == 16384) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z37) {
                            objM87133R7 = new C12762e(interfaceC4339a5, 11);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C12762e(interfaceC4339a5, 11);
                            c28655q.m87172p0(objM87133R7);
                        }
                        AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h4, false, 0L, null, false, (InterfaceC4339a) objM87133R7, c28655q, 54, 120);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(261383895);
                        c28655q.m87173q(false);
                    }
                    if (z34) {
                        c28655q.m87150e0(261805495);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(261805495);
                        c28655q.m87173q(false);
                    }
                    if (type instanceof AbstractC33208p0.h) {
                        c28655q.m87150e0(261858815);
                        EnumC1632v enumC1632v2 = EnumC1632v.ON_RESUME;
                        if (i48 == 4) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z36) {
                            objM87133R6 = new b(type, null);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new b(type, null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC22392e.m64443d(enumC1632v2, (Function3) objM87133R6, c28655q, 6);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(262004887);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    interfaceC4339a7 = interfaceC4339a11;
                    z25 = z29;
                    z24 = z34;
                    textResource4 = textResourceM21267a;
                    z19 = z28;
                    textResource5 = textResource6;
                    modifier2 = modifier5;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                    z24 = z16;
                    interfaceC4339a7 = interfaceC4339a4;
                    textResource4 = textResource3;
                    textResource5 = textResource2;
                    modifier2 = modifier;
                    z25 = z14;
                }
                interfaceC4339a8 = interfaceC4339a5;
                z26 = z17;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.l0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33199m0.m105221M(type, supportText, interfaceC4339a7, textResource4, interfaceC4339a8, z24, z26, textResource5, interfaceC4339a6, modifier2, z25, z19, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            interfaceC4339a5 = interfaceC4339a2;
            i19 = i15 & 32;
            if (i19 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z16 = z4;
            } else {
                z16 = z4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z16)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                z17 = z13;
            } else {
                z17 = z13;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z17)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
            }
            if ((i13 & 12582912) != 0) {
                i16 |= ((i15 & 128) == 0 || !c28655q.m87153g(textResource2)) ? 4194304 : 8388608;
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                i16 |= 100663296;
                interfaceC4339a6 = interfaceC4339a3;
            } else {
                interfaceC4339a6 = interfaceC4339a3;
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(interfaceC4339a6)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
            }
            i29 = i16;
            i34 = i15 & 512;
            if (i34 != 0) {
                i29 |= 805306368;
            } else if ((i13 & 805306368) != 0) {
                if (c28655q.m87153g(modifier)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i29 |= i35;
            }
            i36 = i29;
            i37 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i37 != 0) {
                i38 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87155h(z14)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i14 | i39;
            } else {
                i38 = i14;
            }
            i44 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i44 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                if ((i36 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q.m87135U(i36 & 1, z18)) {
                    c28655q.m87140Z();
                    i46 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    if (i46 != 0) {
                        if (i54 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32223d(16);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a9 = interfaceC4339a4;
                        }
                        if ((i15 & 8) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i36 &= -7169;
                        } else {
                            textResourceM21267a = textResource3;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32223d(17);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            z16 = false;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        }
                        if ((i15 & 128) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i36 &= -29360129;
                        } else {
                            textResourceM21267a2 = textResource2;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32223d(18);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (i34 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i44 != 0) {
                            z29 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            z29 = z27;
                        }
                    } else {
                        if (i54 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32223d(16);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a9 = interfaceC4339a4;
                        }
                        if ((i15 & 8) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i36 &= -7169;
                        } else {
                            textResourceM21267a = textResource3;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32223d(17);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            z16 = false;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        }
                        if ((i15 & 128) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i36 &= -29360129;
                        } else {
                            textResourceM21267a2 = textResource2;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32223d(18);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (i34 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i44 != 0) {
                            z29 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            z29 = z27;
                        }
                    }
                    c28655q.m87175r();
                    z34 = z16;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R4;
                    if (z29) {
                        c28655q.m87150e0(306630112);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = c.f138419w;
                            c28655q.m87172p0(objM87133R8);
                        }
                        Modifier modifierM52565c3 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R8));
                        c28655q.m87173q(false);
                        modifierM44019X0 = modifierM52565c3;
                        textResource6 = textResourceM21267a2;
                    } else if (z28) {
                        c28655q.m87150e0(306632747);
                        textResource6 = textResourceM21267a2;
                        modifierM44019X0 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBlack90()));
                        c28655q.m87173q(false);
                    } else {
                        textResource6 = textResourceM21267a2;
                        if (type instanceof AbstractC33208p0.c) {
                            c28655q.m87150e0(306637691);
                            c28655q.m87173q(false);
                            modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                        } else {
                            c28655q.m87150e0(306637691);
                            c28655q.m87173q(false);
                            modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                        }
                    }
                    i47 = i36;
                    if ((i36 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z35) {
                        objM87133R5 = new C12762e(interfaceC4339a9, 10);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C12762e(interfaceC4339a9, 10);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(6 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(c2314t, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R5, 28)).mo3471e(modifierM44019X0))).mo3471e(modifier3), "progress_modal");
                    InterfaceC4339a interfaceC4339a12 = interfaceC4339a9;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    Modifier modifier6 = modifier3;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3599a5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    i48 = i47 & 14;
                    m105210B(type, c28655q, i48);
                    float f16 = 4;
                    f13 = 9 * f16;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                    String strM21274h5 = AbstractC8693b.m21274h(type.getTitle(), c28655q, 0);
                    C38072d c38072d3 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h5, modifierM3599a6, c38072d3.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
                    AbstractC18489d0.m53380u(2, f16, c2314t, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(supportText, c28655q, (i47 >> 3) & 14), null, c38072d3.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                    if (AbstractC8693b.m21270d(textResourceM21267a)) {
                        AbstractC31061c.m95623C(c28655q, 261109049, c2314t, f13, c28655q);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                        String strM21274h6 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i47 >> 9) & 14);
                        if ((i47 & 57344) == 16384) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z37) {
                            objM87133R7 = new C12762e(interfaceC4339a5, 11);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C12762e(interfaceC4339a5, 11);
                            c28655q.m87172p0(objM87133R7);
                        }
                        AbstractC27282u.m82292h(modifierM3409f3, enumC27284v3, strM21274h6, false, 0L, null, false, (InterfaceC4339a) objM87133R7, c28655q, 54, 120);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(261383895);
                        c28655q.m87173q(false);
                    }
                    if (z34) {
                        c28655q.m87150e0(261805495);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(261805495);
                        c28655q.m87173q(false);
                    }
                    if (type instanceof AbstractC33208p0.h) {
                        c28655q.m87150e0(261858815);
                        EnumC1632v enumC1632v3 = EnumC1632v.ON_RESUME;
                        if (i48 == 4) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z36) {
                            objM87133R6 = new b(type, null);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new b(type, null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC22392e.m64443d(enumC1632v3, (Function3) objM87133R6, c28655q, 6);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(262004887);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    interfaceC4339a7 = interfaceC4339a12;
                    z25 = z29;
                    z24 = z34;
                    textResource4 = textResourceM21267a;
                    z19 = z28;
                    textResource5 = textResource6;
                    modifier2 = modifier6;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                    z24 = z16;
                    interfaceC4339a7 = interfaceC4339a4;
                    textResource4 = textResource3;
                    textResource5 = textResource2;
                    modifier2 = modifier;
                    z25 = z14;
                }
                interfaceC4339a8 = interfaceC4339a5;
                z26 = z17;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.l0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33199m0.m105221M(type, supportText, interfaceC4339a7, textResource4, interfaceC4339a8, z24, z26, textResource5, interfaceC4339a6, modifier2, z25, z19, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i38 |= 48;
            if ((i36 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q.m87135U(i36 & 1, z18)) {
                c28655q.m87140Z();
                i46 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i46 != 0) {
                    if (i54 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32223d(16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i36 &= -7169;
                    } else {
                        textResourceM21267a = textResource3;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32223d(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    }
                    if ((i15 & 128) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i36 &= -29360129;
                    } else {
                        textResourceM21267a2 = textResource2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32223d(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (i34 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i44 != 0) {
                        z29 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        z29 = z27;
                    }
                } else {
                    if (i54 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32223d(16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i36 &= -7169;
                    } else {
                        textResourceM21267a = textResource3;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32223d(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    }
                    if ((i15 & 128) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i36 &= -29360129;
                    } else {
                        textResourceM21267a2 = textResource2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32223d(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (i34 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i44 != 0) {
                        z29 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        z29 = z27;
                    }
                }
                c28655q.m87175r();
                z34 = z16;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R4;
                if (z29) {
                    c28655q.m87150e0(306630112);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = c.f138419w;
                        c28655q.m87172p0(objM87133R8);
                    }
                    Modifier modifierM52565c4 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R8));
                    c28655q.m87173q(false);
                    modifierM44019X0 = modifierM52565c4;
                    textResource6 = textResourceM21267a2;
                } else if (z28) {
                    c28655q.m87150e0(306632747);
                    textResource6 = textResourceM21267a2;
                    modifierM44019X0 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBlack90()));
                    c28655q.m87173q(false);
                } else {
                    textResource6 = textResourceM21267a2;
                    if (type instanceof AbstractC33208p0.c) {
                        c28655q.m87150e0(306637691);
                        c28655q.m87173q(false);
                        modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                    } else {
                        c28655q.m87150e0(306637691);
                        c28655q.m87173q(false);
                        modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                    }
                }
                i47 = i36;
                if ((i36 & 896) == 256) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z35) {
                    objM87133R5 = new C12762e(interfaceC4339a9, 10);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C12762e(interfaceC4339a9, 10);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(6 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(c2314t, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R5, 28)).mo3471e(modifierM44019X0))).mo3471e(modifier3), "progress_modal");
                InterfaceC4339a interfaceC4339a13 = interfaceC4339a9;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                Modifier modifier7 = modifier3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3599a7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                i48 = i47 & 14;
                m105210B(type, c28655q, i48);
                float f17 = 4;
                f13 = 9 * f17;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                String strM21274h7 = AbstractC8693b.m21274h(type.getTitle(), c28655q, 0);
                C38072d c38072d4 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h7, modifierM3599a8, c38072d4.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
                AbstractC18489d0.m53380u(2, f17, c2314t, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(supportText, c28655q, (i47 >> 3) & 14), null, c38072d4.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    AbstractC31061c.m95623C(c28655q, 261109049, c2314t, f13, c28655q);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
                    String strM21274h8 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i47 >> 9) & 14);
                    if ((i47 & 57344) == 16384) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z37) {
                        objM87133R7 = new C12762e(interfaceC4339a5, 11);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C12762e(interfaceC4339a5, 11);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC27282u.m82292h(modifierM3409f4, enumC27284v4, strM21274h8, false, 0L, null, false, (InterfaceC4339a) objM87133R7, c28655q, 54, 120);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(261383895);
                    c28655q.m87173q(false);
                }
                if (z34) {
                    c28655q.m87150e0(261805495);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(261805495);
                    c28655q.m87173q(false);
                }
                if (type instanceof AbstractC33208p0.h) {
                    c28655q.m87150e0(261858815);
                    EnumC1632v enumC1632v4 = EnumC1632v.ON_RESUME;
                    if (i48 == 4) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z36) {
                        objM87133R6 = new b(type, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new b(type, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC22392e.m64443d(enumC1632v4, (Function3) objM87133R6, c28655q, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(262004887);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a7 = interfaceC4339a13;
                z25 = z29;
                z24 = z34;
                textResource4 = textResourceM21267a;
                z19 = z28;
                textResource5 = textResource6;
                modifier2 = modifier7;
            } else {
                c28655q.m87138X();
                z19 = z15;
                z24 = z16;
                interfaceC4339a7 = interfaceC4339a4;
                textResource4 = textResource3;
                textResource5 = textResource2;
                modifier2 = modifier;
                z25 = z14;
            }
            interfaceC4339a8 = interfaceC4339a5;
            z26 = z17;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.l0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33199m0.m105221M(type, supportText, interfaceC4339a7, textResource4, interfaceC4339a8, z24, z26, textResource5, interfaceC4339a6, modifier2, z25, z19, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        interfaceC4339a4 = interfaceC4339a;
        if ((i13 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                textResource3 = textResource;
                if (c28655q.m87153g(textResource3)) {
                    i49 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i16 |= i49;
            } else {
                textResource3 = textResource;
            }
            i49 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i16 |= i49;
        } else {
            textResource3 = textResource;
        }
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a5 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a5)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i18;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z16 = z4;
            } else {
                z16 = z4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z16)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                z17 = z13;
            } else {
                z17 = z13;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z17)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
            }
            if ((i13 & 12582912) != 0) {
                i16 |= ((i15 & 128) == 0 || !c28655q.m87153g(textResource2)) ? 4194304 : 8388608;
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                i16 |= 100663296;
                interfaceC4339a6 = interfaceC4339a3;
            } else {
                interfaceC4339a6 = interfaceC4339a3;
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87157i(interfaceC4339a6)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
            }
            i29 = i16;
            i34 = i15 & 512;
            if (i34 != 0) {
                i29 |= 805306368;
            } else if ((i13 & 805306368) != 0) {
                if (c28655q.m87153g(modifier)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i29 |= i35;
            }
            i36 = i29;
            i37 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i37 != 0) {
                i38 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87155h(z14)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i14 | i39;
            } else {
                i38 = i14;
            }
            i44 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i44 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                if ((i36 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q.m87135U(i36 & 1, z18)) {
                    c28655q.m87140Z();
                    i46 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    if (i46 != 0) {
                        if (i54 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32223d(16);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a9 = interfaceC4339a4;
                        }
                        if ((i15 & 8) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i36 &= -7169;
                        } else {
                            textResourceM21267a = textResource3;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32223d(17);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            z16 = false;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        }
                        if ((i15 & 128) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i36 &= -29360129;
                        } else {
                            textResourceM21267a2 = textResource2;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32223d(18);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (i34 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i44 != 0) {
                            z29 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            z29 = z27;
                        }
                    } else {
                        if (i54 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32223d(16);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a9 = interfaceC4339a4;
                        }
                        if ((i15 & 8) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i36 &= -7169;
                        } else {
                            textResourceM21267a = textResource3;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32223d(17);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            z16 = false;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        }
                        if ((i15 & 128) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i36 &= -29360129;
                        } else {
                            textResourceM21267a2 = textResource2;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32223d(18);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (i34 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i44 != 0) {
                            z29 = z27;
                            z28 = false;
                        } else {
                            z28 = z15;
                            z29 = z27;
                        }
                    }
                    c28655q.m87175r();
                    z34 = z16;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R4;
                    if (z29) {
                        c28655q.m87150e0(306630112);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = c.f138419w;
                            c28655q.m87172p0(objM87133R8);
                        }
                        Modifier modifierM52565c5 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R8));
                        c28655q.m87173q(false);
                        modifierM44019X0 = modifierM52565c5;
                        textResource6 = textResourceM21267a2;
                    } else if (z28) {
                        c28655q.m87150e0(306632747);
                        textResource6 = textResourceM21267a2;
                        modifierM44019X0 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBlack90()));
                        c28655q.m87173q(false);
                    } else {
                        textResource6 = textResourceM21267a2;
                        if (type instanceof AbstractC33208p0.c) {
                            c28655q.m87150e0(306637691);
                            c28655q.m87173q(false);
                            modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                        } else {
                            c28655q.m87150e0(306637691);
                            c28655q.m87173q(false);
                            modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                        }
                    }
                    i47 = i36;
                    if ((i36 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z35) {
                        objM87133R5 = new C12762e(interfaceC4339a9, 10);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C12762e(interfaceC4339a9, 10);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifierM3599a9 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(6 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(c2314t, interfaceC21083i5, null, false, null, (InterfaceC4339a) objM87133R5, 28)).mo3471e(modifierM44019X0))).mo3471e(modifier3), "progress_modal");
                    InterfaceC4339a interfaceC4339a14 = interfaceC4339a9;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    Modifier modifier8 = modifier3;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3599a9);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    i48 = i47 & 14;
                    m105210B(type, c28655q, i48);
                    float f18 = 4;
                    f13 = 9 * f18;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                    Modifier modifierM3599a10 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                    String strM21274h9 = AbstractC8693b.m21274h(type.getTitle(), c28655q, 0);
                    C38072d c38072d5 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h9, modifierM3599a10, c38072d5.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
                    AbstractC18489d0.m53380u(2, f18, c2314t, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(supportText, c28655q, (i47 >> 3) & 14), null, c38072d5.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                    if (AbstractC8693b.m21270d(textResourceM21267a)) {
                        AbstractC31061c.m95623C(c28655q, 261109049, c2314t, f13, c28655q);
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                        EnumC27284v enumC27284v5 = EnumC27284v.TextLarge;
                        String strM21274h10 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i47 >> 9) & 14);
                        if ((i47 & 57344) == 16384) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z37) {
                            objM87133R7 = new C12762e(interfaceC4339a5, 11);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C12762e(interfaceC4339a5, 11);
                            c28655q.m87172p0(objM87133R7);
                        }
                        AbstractC27282u.m82292h(modifierM3409f5, enumC27284v5, strM21274h10, false, 0L, null, false, (InterfaceC4339a) objM87133R7, c28655q, 54, 120);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(261383895);
                        c28655q.m87173q(false);
                    }
                    if (z34) {
                        c28655q.m87150e0(261805495);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(261805495);
                        c28655q.m87173q(false);
                    }
                    if (type instanceof AbstractC33208p0.h) {
                        c28655q.m87150e0(261858815);
                        EnumC1632v enumC1632v5 = EnumC1632v.ON_RESUME;
                        if (i48 == 4) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z36) {
                            objM87133R6 = new b(type, null);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new b(type, null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC22392e.m64443d(enumC1632v5, (Function3) objM87133R6, c28655q, 6);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(262004887);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    interfaceC4339a7 = interfaceC4339a14;
                    z25 = z29;
                    z24 = z34;
                    textResource4 = textResourceM21267a;
                    z19 = z28;
                    textResource5 = textResource6;
                    modifier2 = modifier8;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                    z24 = z16;
                    interfaceC4339a7 = interfaceC4339a4;
                    textResource4 = textResource3;
                    textResource5 = textResource2;
                    modifier2 = modifier;
                    z25 = z14;
                }
                interfaceC4339a8 = interfaceC4339a5;
                z26 = z17;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.l0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33199m0.m105221M(type, supportText, interfaceC4339a7, textResource4, interfaceC4339a8, z24, z26, textResource5, interfaceC4339a6, modifier2, z25, z19, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i38 |= 48;
            if ((i36 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q.m87135U(i36 & 1, z18)) {
                c28655q.m87140Z();
                i46 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i46 != 0) {
                    if (i54 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32223d(16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i36 &= -7169;
                    } else {
                        textResourceM21267a = textResource3;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32223d(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    }
                    if ((i15 & 128) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i36 &= -29360129;
                    } else {
                        textResourceM21267a2 = textResource2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32223d(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (i34 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i44 != 0) {
                        z29 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        z29 = z27;
                    }
                } else {
                    if (i54 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32223d(16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i36 &= -7169;
                    } else {
                        textResourceM21267a = textResource3;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32223d(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    }
                    if ((i15 & 128) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i36 &= -29360129;
                    } else {
                        textResourceM21267a2 = textResource2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32223d(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (i34 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i44 != 0) {
                        z29 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        z29 = z27;
                    }
                }
                c28655q.m87175r();
                z34 = z16;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i6 = (InterfaceC21083i) objM87133R4;
                if (z29) {
                    c28655q.m87150e0(306630112);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = c.f138419w;
                        c28655q.m87172p0(objM87133R8);
                    }
                    Modifier modifierM52565c6 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R8));
                    c28655q.m87173q(false);
                    modifierM44019X0 = modifierM52565c6;
                    textResource6 = textResourceM21267a2;
                } else if (z28) {
                    c28655q.m87150e0(306632747);
                    textResource6 = textResourceM21267a2;
                    modifierM44019X0 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBlack90()));
                    c28655q.m87173q(false);
                } else {
                    textResource6 = textResourceM21267a2;
                    if (type instanceof AbstractC33208p0.c) {
                        c28655q.m87150e0(306637691);
                        c28655q.m87173q(false);
                        modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                    } else {
                        c28655q.m87150e0(306637691);
                        c28655q.m87173q(false);
                        modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                    }
                }
                i47 = i36;
                if ((i36 & 896) == 256) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z35) {
                    objM87133R5 = new C12762e(interfaceC4339a9, 10);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C12762e(interfaceC4339a9, 10);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifierM3599a11 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(6 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(c2314t, interfaceC21083i6, null, false, null, (InterfaceC4339a) objM87133R5, 28)).mo3471e(modifierM44019X0))).mo3471e(modifier3), "progress_modal");
                InterfaceC4339a interfaceC4339a15 = interfaceC4339a9;
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                Modifier modifier9 = modifier3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3599a11);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                i48 = i47 & 14;
                m105210B(type, c28655q, i48);
                float f19 = 4;
                f13 = 9 * f19;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                Modifier modifierM3599a12 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                String strM21274h11 = AbstractC8693b.m21274h(type.getTitle(), c28655q, 0);
                C38072d c38072d6 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h11, modifierM3599a12, c38072d6.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
                AbstractC18489d0.m53380u(2, f19, c2314t, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(supportText, c28655q, (i47 >> 3) & 14), null, c38072d6.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    AbstractC31061c.m95623C(c28655q, 261109049, c2314t, f13, c28655q);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                    EnumC27284v enumC27284v6 = EnumC27284v.TextLarge;
                    String strM21274h12 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i47 >> 9) & 14);
                    if ((i47 & 57344) == 16384) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z37) {
                        objM87133R7 = new C12762e(interfaceC4339a5, 11);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C12762e(interfaceC4339a5, 11);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC27282u.m82292h(modifierM3409f6, enumC27284v6, strM21274h12, false, 0L, null, false, (InterfaceC4339a) objM87133R7, c28655q, 54, 120);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(261383895);
                    c28655q.m87173q(false);
                }
                if (z34) {
                    c28655q.m87150e0(261805495);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(261805495);
                    c28655q.m87173q(false);
                }
                if (type instanceof AbstractC33208p0.h) {
                    c28655q.m87150e0(261858815);
                    EnumC1632v enumC1632v6 = EnumC1632v.ON_RESUME;
                    if (i48 == 4) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z36) {
                        objM87133R6 = new b(type, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new b(type, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC22392e.m64443d(enumC1632v6, (Function3) objM87133R6, c28655q, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(262004887);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a7 = interfaceC4339a15;
                z25 = z29;
                z24 = z34;
                textResource4 = textResourceM21267a;
                z19 = z28;
                textResource5 = textResource6;
                modifier2 = modifier9;
            } else {
                c28655q.m87138X();
                z19 = z15;
                z24 = z16;
                interfaceC4339a7 = interfaceC4339a4;
                textResource4 = textResource3;
                textResource5 = textResource2;
                modifier2 = modifier;
                z25 = z14;
            }
            interfaceC4339a8 = interfaceC4339a5;
            z26 = z17;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.l0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33199m0.m105221M(type, supportText, interfaceC4339a7, textResource4, interfaceC4339a8, z24, z26, textResource5, interfaceC4339a6, modifier2, z25, z19, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        interfaceC4339a5 = interfaceC4339a2;
        i19 = i15 & 32;
        if (i19 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z16 = z4;
        } else {
            z16 = z4;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z16)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            }
        }
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 1572864;
            z17 = z13;
        } else {
            z17 = z13;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z17)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
        }
        if ((i13 & 12582912) != 0) {
            i16 |= ((i15 & 128) == 0 || !c28655q.m87153g(textResource2)) ? 4194304 : 8388608;
        }
        i27 = i15 & 256;
        if (i27 != 0) {
            i16 |= 100663296;
            interfaceC4339a6 = interfaceC4339a3;
        } else {
            interfaceC4339a6 = interfaceC4339a3;
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87157i(interfaceC4339a6)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i28;
            }
        }
        i29 = i16;
        i34 = i15 & 512;
        if (i34 != 0) {
            i29 |= 805306368;
        } else if ((i13 & 805306368) != 0) {
            if (c28655q.m87153g(modifier)) {
                i35 = 536870912;
            } else {
                i35 = 268435456;
            }
            i29 |= i35;
        }
        i36 = i29;
        i37 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i37 != 0) {
            i38 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q.m87155h(z14)) {
                i39 = 4;
            } else {
                i39 = 2;
            }
            i38 = i14 | i39;
        } else {
            i38 = i14;
        }
        i44 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i44 != 0) {
            if ((i14 & 48) == 0) {
                if (c28655q.m87155h(z15)) {
                    i45 = 32;
                } else {
                    i45 = 16;
                }
                i38 |= i45;
            }
            if ((i36 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q.m87135U(i36 & 1, z18)) {
                c28655q.m87140Z();
                i46 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i46 != 0) {
                    if (i54 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32223d(16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i36 &= -7169;
                    } else {
                        textResourceM21267a = textResource3;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32223d(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    }
                    if ((i15 & 128) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i36 &= -29360129;
                    } else {
                        textResourceM21267a2 = textResource2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32223d(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (i34 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i44 != 0) {
                        z29 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        z29 = z27;
                    }
                } else {
                    if (i54 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32223d(16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i36 &= -7169;
                    } else {
                        textResourceM21267a = textResource3;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32223d(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    }
                    if ((i15 & 128) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i36 &= -29360129;
                    } else {
                        textResourceM21267a2 = textResource2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32223d(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (i34 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i44 != 0) {
                        z29 = z27;
                        z28 = false;
                    } else {
                        z28 = z15;
                        z29 = z27;
                    }
                }
                c28655q.m87175r();
                z34 = z16;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i7 = (InterfaceC21083i) objM87133R4;
                if (z29) {
                    c28655q.m87150e0(306630112);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = c.f138419w;
                        c28655q.m87172p0(objM87133R8);
                    }
                    Modifier modifierM52565c7 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R8));
                    c28655q.m87173q(false);
                    modifierM44019X0 = modifierM52565c7;
                    textResource6 = textResourceM21267a2;
                } else if (z28) {
                    c28655q.m87150e0(306632747);
                    textResource6 = textResourceM21267a2;
                    modifierM44019X0 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBlack90()));
                    c28655q.m87173q(false);
                } else {
                    textResource6 = textResourceM21267a2;
                    if (type instanceof AbstractC33208p0.c) {
                        c28655q.m87150e0(306637691);
                        c28655q.m87173q(false);
                        modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                    } else {
                        c28655q.m87150e0(306637691);
                        c28655q.m87173q(false);
                        modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                    }
                }
                i47 = i36;
                if ((i36 & 896) == 256) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z35) {
                    objM87133R5 = new C12762e(interfaceC4339a9, 10);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C12762e(interfaceC4339a9, 10);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifierM3599a13 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(6 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(c2314t, interfaceC21083i7, null, false, null, (InterfaceC4339a) objM87133R5, 28)).mo3471e(modifierM44019X0))).mo3471e(modifier3), "progress_modal");
                InterfaceC4339a interfaceC4339a16 = interfaceC4339a9;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                Modifier modifier10 = modifier3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3599a13);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                i48 = i47 & 14;
                m105210B(type, c28655q, i48);
                float f110 = 4;
                f13 = 9 * f110;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                Modifier modifierM3599a14 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                String strM21274h13 = AbstractC8693b.m21274h(type.getTitle(), c28655q, 0);
                C38072d c38072d7 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h13, modifierM3599a14, c38072d7.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
                AbstractC18489d0.m53380u(2, f110, c2314t, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(supportText, c28655q, (i47 >> 3) & 14), null, c38072d7.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    AbstractC31061c.m95623C(c28655q, 261109049, c2314t, f13, c28655q);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    EnumC27284v enumC27284v7 = EnumC27284v.TextLarge;
                    String strM21274h14 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i47 >> 9) & 14);
                    if ((i47 & 57344) == 16384) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z37) {
                        objM87133R7 = new C12762e(interfaceC4339a5, 11);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C12762e(interfaceC4339a5, 11);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC27282u.m82292h(modifierM3409f7, enumC27284v7, strM21274h14, false, 0L, null, false, (InterfaceC4339a) objM87133R7, c28655q, 54, 120);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(261383895);
                    c28655q.m87173q(false);
                }
                if (z34) {
                    c28655q.m87150e0(261805495);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(261805495);
                    c28655q.m87173q(false);
                }
                if (type instanceof AbstractC33208p0.h) {
                    c28655q.m87150e0(261858815);
                    EnumC1632v enumC1632v7 = EnumC1632v.ON_RESUME;
                    if (i48 == 4) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z36) {
                        objM87133R6 = new b(type, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new b(type, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC22392e.m64443d(enumC1632v7, (Function3) objM87133R6, c28655q, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(262004887);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a7 = interfaceC4339a16;
                z25 = z29;
                z24 = z34;
                textResource4 = textResourceM21267a;
                z19 = z28;
                textResource5 = textResource6;
                modifier2 = modifier10;
            } else {
                c28655q.m87138X();
                z19 = z15;
                z24 = z16;
                interfaceC4339a7 = interfaceC4339a4;
                textResource4 = textResource3;
                textResource5 = textResource2;
                modifier2 = modifier;
                z25 = z14;
            }
            interfaceC4339a8 = interfaceC4339a5;
            z26 = z17;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.l0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33199m0.m105221M(type, supportText, interfaceC4339a7, textResource4, interfaceC4339a8, z24, z26, textResource5, interfaceC4339a6, modifier2, z25, z19, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i38 |= 48;
        if ((i36 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (c28655q.m87135U(i36 & 1, z18)) {
            c28655q.m87140Z();
            i46 = i13 & 1;
            c2314t = C2314t.f9131w;
            c28676v0 = C28635l.f115821a;
            if (i46 != 0) {
                if (i54 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32223d(16);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a9 = interfaceC4339a4;
                }
                if ((i15 & 8) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i36 &= -7169;
                } else {
                    textResourceM21267a = textResource3;
                }
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32223d(17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                }
                if (i19 != 0) {
                    z16 = false;
                }
                if (i25 != 0) {
                    z17 = false;
                }
                if ((i15 & 128) != 0) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                    i36 &= -29360129;
                } else {
                    textResourceM21267a2 = textResource2;
                }
                if (i27 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32223d(18);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                }
                if (i34 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i37 != 0) {
                    z27 = false;
                } else {
                    z27 = z14;
                }
                if (i44 != 0) {
                    z29 = z27;
                    z28 = false;
                } else {
                    z28 = z15;
                    z29 = z27;
                }
            } else {
                if (i54 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32223d(16);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a9 = interfaceC4339a4;
                }
                if ((i15 & 8) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i36 &= -7169;
                } else {
                    textResourceM21267a = textResource3;
                }
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32223d(17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                }
                if (i19 != 0) {
                    z16 = false;
                }
                if (i25 != 0) {
                    z17 = false;
                }
                if ((i15 & 128) != 0) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                    i36 &= -29360129;
                } else {
                    textResourceM21267a2 = textResource2;
                }
                if (i27 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32223d(18);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                }
                if (i34 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i37 != 0) {
                    z27 = false;
                } else {
                    z27 = z14;
                }
                if (i44 != 0) {
                    z29 = z27;
                    z28 = false;
                } else {
                    z28 = z15;
                    z29 = z27;
                }
            }
            c28655q.m87175r();
            z34 = z16;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i8 = (InterfaceC21083i) objM87133R4;
            if (z29) {
                c28655q.m87150e0(306630112);
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = c.f138419w;
                    c28655q.m87172p0(objM87133R8);
                }
                Modifier modifierM52565c8 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52574l((Function1) objM87133R8));
                c28655q.m87173q(false);
                modifierM44019X0 = modifierM52565c8;
                textResource6 = textResourceM21267a2;
            } else if (z28) {
                c28655q.m87150e0(306632747);
                textResource6 = textResourceM21267a2;
                modifierM44019X0 = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBlack90()));
                c28655q.m87173q(false);
            } else {
                textResource6 = textResourceM21267a2;
                if (type instanceof AbstractC33208p0.c) {
                    c28655q.m87150e0(306637691);
                    c28655q.m87173q(false);
                    modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                } else {
                    c28655q.m87150e0(306637691);
                    c28655q.m87173q(false);
                    modifierM44019X0 = AbstractC15673b0.m44019X0(c2314t, null, 1, null);
                }
            }
            i47 = i36;
            if ((i36 & 896) == 256) {
                z35 = true;
            } else {
                z35 = false;
            }
            objM87133R5 = c28655q.m87133R();
            if (z35) {
                objM87133R5 = new C12762e(interfaceC4339a9, 10);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C12762e(interfaceC4339a9, 10);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifierM3599a15 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(6 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(c2314t, interfaceC21083i8, null, false, null, (InterfaceC4339a) objM87133R5, 28)).mo3471e(modifierM44019X0))).mo3471e(modifier3), "progress_modal");
            InterfaceC4339a interfaceC4339a17 = interfaceC4339a9;
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            Modifier modifier11 = modifier3;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3599a15);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            i48 = i47 & 14;
            m105210B(type, c28655q, i48);
            float f111 = 4;
            f13 = 9 * f111;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            Modifier modifierM3599a16 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
            String strM21274h15 = AbstractC8693b.m21274h(type.getTitle(), c28655q, 0);
            C38072d c38072d8 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h15, modifierM3599a16, c38072d8.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
            AbstractC18489d0.m53380u(2, f111, c2314t, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(supportText, c28655q, (i47 >> 3) & 14), null, c38072d8.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
            if (AbstractC8693b.m21270d(textResourceM21267a)) {
                AbstractC31061c.m95623C(c28655q, 261109049, c2314t, f13, c28655q);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                EnumC27284v enumC27284v8 = EnumC27284v.TextLarge;
                String strM21274h16 = AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i47 >> 9) & 14);
                if ((i47 & 57344) == 16384) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z37) {
                    objM87133R7 = new C12762e(interfaceC4339a5, 11);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C12762e(interfaceC4339a5, 11);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC27282u.m82292h(modifierM3409f8, enumC27284v8, strM21274h16, false, 0L, null, false, (InterfaceC4339a) objM87133R7, c28655q, 54, 120);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(261383895);
                c28655q.m87173q(false);
            }
            if (z34) {
                c28655q.m87150e0(261805495);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(261805495);
                c28655q.m87173q(false);
            }
            if (type instanceof AbstractC33208p0.h) {
                c28655q.m87150e0(261858815);
                EnumC1632v enumC1632v8 = EnumC1632v.ON_RESUME;
                if (i48 == 4) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z36) {
                    objM87133R6 = new b(type, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new b(type, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC22392e.m64443d(enumC1632v8, (Function3) objM87133R6, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(262004887);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC4339a7 = interfaceC4339a17;
            z25 = z29;
            z24 = z34;
            textResource4 = textResourceM21267a;
            z19 = z28;
            textResource5 = textResource6;
            modifier2 = modifier11;
        } else {
            c28655q.m87138X();
            z19 = z15;
            z24 = z16;
            interfaceC4339a7 = interfaceC4339a4;
            textResource4 = textResource3;
            textResource5 = textResource2;
            modifier2 = modifier;
            z25 = z14;
        }
        interfaceC4339a8 = interfaceC4339a5;
        z26 = z17;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.l0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC33199m0.m105221M(type, supportText, interfaceC4339a7, textResource4, interfaceC4339a8, z24, z26, textResource5, interfaceC4339a6, modifier2, z25, z19, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m105215G() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m105216H() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m105217I() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m105218J(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m105219K(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m105220L(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m105221M(AbstractC33208p0 abstractC33208p0, TextResource textResource, InterfaceC4339a interfaceC4339a, TextResource textResource2, InterfaceC4339a interfaceC4339a2, boolean z4, boolean z13, TextResource textResource3, InterfaceC4339a interfaceC4339a3, Modifier modifier, boolean z14, boolean z15, int i13, int i14, int i15, Composer composer, int i16) {
        m105214F(abstractC33208p0, textResource, interfaceC4339a, textResource2, interfaceC4339a2, z4, z13, textResource3, interfaceC4339a3, modifier, z14, z15, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    public static final long m105222N(AbstractC33208p0 abstractC33208p0, Composer composer, int i13) {
        long jM125380b;
        AbstractC22676k.m65750j(abstractC33208p0, "<this>");
        if (abstractC33208p0 instanceof AbstractC33208p0.b) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(987612921);
            if (((AbstractC33208p0.b) abstractC33208p0).getIsLowSeverity()) {
                c28655q.m87150e0(551250964);
                jM125380b = C38072d.f163053a.m121949b(c28655q, 6).getAccentNegativeTrend();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(551309244);
                jM125380b = C38072d.f163053a.m121949b(c28655q, 6).getAccentAlert();
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
            return jM125380b;
        }
        if (abstractC33208p0.equals(AbstractC33208p0.c.f138471e) || (abstractC33208p0 instanceof AbstractC33208p0.d)) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(987619971);
            return AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
        }
        if ((abstractC33208p0 instanceof AbstractC33208p0.e) || abstractC33208p0.equals(AbstractC33208p0.f.f138478e) || (abstractC33208p0 instanceof AbstractC33208p0.g) || abstractC33208p0.equals(AbstractC33208p0.a.f138465e)) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(987625123);
            return AbstractC31061c.m95624D(C38072d.f163053a, c28655q3, 6, false);
        }
        if (!(abstractC33208p0 instanceof AbstractC33208p0.h)) {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(551706013);
            return AbstractC31061c.m95624D(C38072d.f163053a, c28655q4, 6, false);
        }
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87150e0(987627244);
        long jM125400j = C38072d.f163053a.m121949b(c28655q5, 6).getAccentPositiveTrend();
        c28655q5.m87173q(false);
        return jM125400j;
    }

    /* JADX INFO: renamed from: q */
    public static final void m105239q(final long j7, Composer composer, final int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(110554264);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            C13825t c13825tM48880a = AbstractC17269i.m48880a(C38072d.f163053a.m121948a(c28655q, 6).getStroke2Dp().f49345a, j7);
            AbstractC22989q.m66760a(AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifierM3407d, c13825tM48880a.f49346b, AbstractC33253j.f138651a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.k0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    int i15 = i13;
                    return AbstractC33199m0.m105240r(j7, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m105240r(long j7, int i13, Composer composer, int i14) {
        m105239q(j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m105241s(final AbstractC33208p0 type, final long j7, Composer composer, final int i13) {
        int i14;
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-295872011);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(type) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if ((type instanceof AbstractC33208p0.c) || (type instanceof AbstractC33208p0.d) || type.equals(AbstractC33208p0.f.f138478e) || (type instanceof AbstractC33208p0.g) || type.equals(AbstractC33208p0.a.f138465e) || (type instanceof AbstractC33208p0.e)) {
            c28655q.m87150e0(-1049909524);
            m105248z(c28655q, 0);
            m105245w(c28655q, 0);
            c28655q.m87173q(false);
        } else {
            if (!(type instanceof AbstractC33208p0.h) && !(type instanceof AbstractC33208p0.b)) {
                throw AbstractC11895b.m32003v(-865158861, c28655q, false);
            }
            c28655q.m87150e0(-865147765);
            m105239q(j7, c28655q, (i14 >> 3) & 14);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.i0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC33199m0.m105242t(type, j7, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m105242t(AbstractC33208p0 abstractC33208p0, long j7, int i13, Composer composer, int i14) {
        m105241s(abstractC33208p0, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m105243u(AbstractC22403o image, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o;
        AbstractC22676k.m65750j(image, "image");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-195152667);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(image) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3419p = AbstractC1102d.m3419p(25 * 4, C2314t.f9131w);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(image, null, null, c28655q, i14 & 14, 3);
            abstractC22403o = image;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3419p, null, null, 0.0f, null, c28655q, 432, 120);
            c28655q = c28655q;
        } else {
            abstractC22403o = image;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m105244v(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m105243u(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: w */
    public static final void m105245w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-978711077);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11348f.m30553a(0.0f);
                c28655q.m87172p0(objM87133R);
            }
            final C11344e c11344e = (C11344e) objM87133R;
            c28655q.m87150e0(56495971);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            C38072d c38072d = C38072d.f163053a;
            final float fMo743q0 = interfaceC39171c.mo743q0(c38072d.m121948a(c28655q, 6).getStroke2Dp().f49345a);
            c28655q.m87173q(false);
            final long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
            boolean zM87157i = c28655q.m87157i(c11344e);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new a(c11344e, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c11344e);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean zM87151f = c28655q.m87151f(jM125430y) | c28655q.m87157i(c11344e) | c28655q.m87147d(fMo743q0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87151f || objM87133R3 == c28676v0) {
                objM87133R3 = new Function1() { // from class: sz0.j0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC33199m0.m105246x(jM125430y, c11344e, fMo743q0, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R3, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0131i(i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m105246x(long j7, C11344e c11344e, float f13, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC22131e.m63380P(Canvas, j7, 270.0f, ((Number) c11344e.m30549e()).floatValue() * 360.0f, 0L, 0L, 0.0f, new C22135i(f13, 0.0f, 1, 0, null, 26), 880);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m105247y(int i13, Composer composer, int i14) {
        m105245w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m105248z(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1137490893);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            C13825t c13825tM48880a = AbstractC17269i.m48880a(2, C38072d.f163053a.m121949b(c28655q, 6).getWhite10());
            AbstractC22989q.m66760a(AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifierM3407d, c13825tM48880a.f49346b, AbstractC33253j.f138651a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0131i(i13, 5);
        }
    }
}

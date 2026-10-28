package p734sl0;

import android.content.res.Configuration;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import fh0.C14481c;
import gb1.AbstractC15673b0;
import h51.C16934f;
import java.util.List;
import java.util.ListIterator;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import ml0.AbstractC25669a;
import nl0.AbstractC26802d;
import nl0.C26801c;
import nl0.C26804f;
import nl0.C26808j;
import nl0.EnumC26800b;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p132f0.C13821r1;
import p163g1.AbstractC15005f3;
import p238j0.C21084j;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23001u;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p733ry2.C31915d;
import ph1.C29244h;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: sl0.s3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0081\u0001\u0010\u0011\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0019\u001a\u00020\u0006*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c²\u0006\u000e\u0010\u001b\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ll0/y;", "Lnl0/f;", "viewState", "Lkotlin/Function2;", "", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "Ll83/a0;", "onFeedbackClicked", "Lkotlin/Function1;", "Lnl0/d;", "onViewEvent", "Lml0/a;", "onNavigationEvent", "", "isFromWrapper", "isWceLoading", "suppressAutoScroll", "t", "(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZLandroidx/compose/runtime/Composer;II)V", "Ll0/u;", "", "threshold", "currentValue", "Lkotlin/Function0;", "onClick", "n", "(Ll0/u;IILc93/a;Landroidx/compose/runtime/Composer;I)V", "isVisible", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32673s3 {

    /* JADX INFO: renamed from: sl0.s3$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.WhoopCoachMessageListV2Kt$ScrollToBottomArrow$1$1", m100430f = "WhoopCoachMessageListV2.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135559w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f135560x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f135561y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f135562z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, int i14, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135560x = i13;
            this.f135561y = i14;
            this.f135562z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135560x, this.f135561y, this.f135562z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135559w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f135560x > this.f135561y && !AbstractC32673s3.m102315o(this.f135562z)) {
                AbstractC32673s3.m102316p(this.f135562z, true);
            } else if (this.f135560x == 0 && AbstractC32673s3.m102315o(this.f135562z)) {
                AbstractC32673s3.m102316p(this.f135562z, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.s3$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.WhoopCoachMessageListV2Kt$WhoopCoachMessageListV2$3$1", m100430f = "WhoopCoachMessageListV2.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C13821r1 f135563E;

        /* JADX INFO: renamed from: w */
        int f135564w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26804f f135565x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f135566y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f135567z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26804f c26804f, boolean z4, boolean z13, C13821r1 c13821r1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135565x = c26804f;
            this.f135566y = z4;
            this.f135567z = z13;
            this.f135563E = c13821r1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f135565x, this.f135566y, this.f135567z, this.f135563E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135564w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f135565x.getConversation().m79883f().isEmpty() && this.f135566y && !this.f135567z) {
                    C13821r1 c13821r1 = this.f135563E;
                    int iM87024x = c13821r1.f49321d.m87024x();
                    C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(500, 0, AbstractC11333b0.f36312c, 2);
                    this.f135564w = 1;
                    if (c13821r1.m39184f(iM87024x, c11347e2M30574v, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: sl0.s3$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.WhoopCoachMessageListV2Kt$WhoopCoachMessageListV2$4$2$1$1", m100430f = "WhoopCoachMessageListV2.kt", m100431l = {196}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135568w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f135569x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C13821r1 c13821r1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135569x = c13821r1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f135569x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135568w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13821r1 c13821r1 = this.f135569x;
                int iM87024x = c13821r1.f49321d.m87024x();
                C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(500, 0, AbstractC11333b0.f36312c, 2);
                this.f135568w = 1;
                if (c13821r1.m39184f(iM87024x, c11347e2M30574v, this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m102295A(AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m102296B(AbstractC25669a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m102297C(InterfaceC2994c0 interfaceC2994c0, C13821r1 c13821r1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c13821r1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m102298D(InterfaceC23013y interfaceC23013y, C26804f c26804f, InterfaceC4351m interfaceC4351m, Function1 function1, Function1 function2, boolean z4, boolean z13, boolean z14, int i13, int i14, Composer composer, int i15) {
        m102320t(interfaceC23013y, c26804f, interfaceC4351m, function1, function2, z4, z13, z14, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m102314n(InterfaceC23001u interfaceC23001u, int i13, int i14, InterfaceC4339a onClick, Composer composer, int i15) {
        int i16;
        AbstractC22676k.m65750j(interfaceC23001u, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(386022291);
        if ((i15 & 6) == 0) {
            i16 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= c28655q.m87149e(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= c28655q.m87157i(onClick) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Integer numValueOf = Integer.valueOf(i14);
            Integer numValueOf2 = Integer.valueOf(i13);
            boolean z4 = ((i16 & 112) == 32) | ((i16 & 896) == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new a(i14, i13, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(numValueOf, numValueOf2, (InterfaceC4351m) objM87133R2, c28655q);
            AbstractC1090b.m3351f(m102315o(interfaceC28601c1), AbstractC1099a.m3398t(interfaceC23001u.mo3400a(AbstractC1136a.m3599a(C2314t.f9131w, "ScrollToBottomArrow"), C2299e.f9105H), 0.0f, 0.0f, 0.0f, 1 * 8, 7), AbstractC3788w0.m11577e(AbstractC11348f.m30574v(500, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(500, 0, null, 6), 2), null, AbstractC37817c.m121344e(911496635, c28655q, new C32665r0(onClick, 4)), c28655q, 200064, 16);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29244h(interfaceC23001u, i13, i14, onClick, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final boolean m102315o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m102316p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m102317q(InterfaceC4339a interfaceC4339a, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        float f13 = 4;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3419p = AbstractC1102d.m3419p(8 * f13, c2314t);
        C21084j c21084j = new C21084j();
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(interfaceC4339a);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C32579a(interfaceC4339a, 14);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3419p, c21084j, null, false, null, (InterfaceC4339a) objM87133R, 28);
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3360e, c38072d.m121949b(c28655q, i14).getBrandWhite(), AbstractC33253j.f138651a);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159706y0, c28655q, 0), AbstractC1102d.m3419p(f13 * f13, AbstractC1772c1.m5375L(180.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E))), c38072d.m121949b(c28655q, i14).getBrandBlack(), c28655q, 0, 0);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m102318r(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m102319s(InterfaceC23001u interfaceC23001u, int i13, int i14, InterfaceC4339a interfaceC4339a, int i15, Composer composer, int i16) {
        m102314n(interfaceC23001u, i13, i14, interfaceC4339a, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013a  */
    /* JADX WARN: Code duplicated, block: B:102:0x013e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0163  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01da  */
    /* JADX WARN: Code duplicated, block: B:125:0x022f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0233  */
    /* JADX WARN: Code duplicated, block: B:129:0x0248  */
    /* JADX WARN: Code duplicated, block: B:131:0x0256  */
    /* JADX WARN: Code duplicated, block: B:134:0x0292  */
    /* JADX WARN: Code duplicated, block: B:135:0x0296  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:146:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:149:0x033a  */
    /* JADX WARN: Code duplicated, block: B:150:0x033e  */
    /* JADX WARN: Code duplicated, block: B:153:0x034b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0359  */
    /* JADX WARN: Code duplicated, block: B:158:0x0365  */
    /* JADX WARN: Code duplicated, block: B:159:0x0386  */
    /* JADX WARN: Code duplicated, block: B:161:0x039e  */
    /* JADX WARN: Code duplicated, block: B:162:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:165:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:169:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:172:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:180:0x0426  */
    /* JADX WARN: Code duplicated, block: B:182:0x0434  */
    /* JADX WARN: Code duplicated, block: B:183:0x0470  */
    /* JADX WARN: Code duplicated, block: B:185:0x047d  */
    /* JADX WARN: Code duplicated, block: B:187:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:188:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:191:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:193:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:196:0x0549  */
    /* JADX WARN: Code duplicated, block: B:197:0x054b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0554  */
    /* JADX WARN: Code duplicated, block: B:203:0x0559  */
    /* JADX WARN: Code duplicated, block: B:204:0x055e  */
    /* JADX WARN: Code duplicated, block: B:207:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:212:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:215:0x0611  */
    /* JADX WARN: Code duplicated, block: B:221:0x0627  */
    /* JADX WARN: Code duplicated, block: B:224:0x062f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x0641  */
    /* JADX WARN: Code duplicated, block: B:230:0x064f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0662  */
    /* JADX WARN: Code duplicated, block: B:236:0x0674  */
    /* JADX WARN: Code duplicated, block: B:240:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:243:0x0703  */
    /* JADX WARN: Code duplicated, block: B:246:0x0713  */
    /* JADX WARN: Code duplicated, block: B:251:0x0622 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0620 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[LOOP:1: B:213:0x060b->B:253:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0130  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    /* JADX INFO: renamed from: t */
    public static final void m102320t(InterfaceC23013y interfaceC23013y, C26804f viewState, InterfaceC4351m onFeedbackClicked, Function1 function1, Function1 function2, boolean z4, boolean z13, boolean z14, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        int i17;
        boolean z15;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z16;
        int i26;
        boolean z17;
        boolean z18;
        boolean z19;
        Function1 function4;
        boolean z24;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        boolean z25;
        boolean z26;
        C13821r1 c13821r1M92099U;
        Object objM87133R;
        C32695y0 c32695y0;
        Object objM87133R2;
        InterfaceC2994c0 interfaceC2994c0;
        boolean z27;
        Function1 function8;
        int i27;
        boolean z28;
        boolean z29;
        boolean zM87153g;
        Object objM87133R3;
        boolean z34;
        C2314t c2314t;
        int i28;
        C2307m c2307m;
        Function1 function9;
        int i29;
        FeatureFlagChecker featureFlagChecker;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int i34;
        float f13;
        int iHashCode2;
        C26808j c26808jM79948f;
        Object objM87133R4;
        int iHashCode3;
        C16934f c16934fM79974a;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objM87133R5;
        C28676v0 c28676v1;
        Function1 function10;
        C2314t c2314t2;
        Function1 function11;
        float f14;
        C28676v0 c28676v2;
        boolean z38;
        C2314t c2314t3;
        float f15;
        boolean z39;
        C13821r1 c13821r1;
        int i35;
        C13821r1 c13821r2;
        int i36;
        boolean z44;
        Object objM87133R6;
        C28676v0 c28676v3;
        Object objM87133R7;
        Object objM87133R8;
        C28676v0 c28676v4;
        boolean zM87157i;
        Object objM87133R9;
        ListIterator<C26801c> listIterator;
        C26801c c26801c;
        C26801c c26801c2;
        C26801c c26801cPrevious;
        C2314t c2314t4;
        C13821r1 c13821r3;
        Function1 function12;
        Function1 function13;
        float f16;
        boolean z45;
        boolean z46;
        int i37;
        int iHashCode4;
        C0213j c0213j2;
        C0209i c0209i5;
        boolean z47;
        boolean z48;
        Object objM87133R10;
        C28676v0 c28676v5;
        Object objM87133R11;
        Object objM87133R12;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(interfaceC23013y, "<this>");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onFeedbackClicked, "onFeedbackClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1222753061);
        int i38 = (i13 & 6) == 0 ? (c28655q.m87153g(interfaceC23013y) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i38 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i38 |= c28655q.m87157i(onFeedbackClicked) ? 256 : 128;
        }
        int i39 = i14 & 4;
        if (i39 == 0) {
            if ((i13 & 3072) == 0) {
                i38 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 = i14 & 8;
            if (i15 != 0) {
                if ((i13 & 24576) == 0) {
                    function3 = function2;
                    if (c28655q.m87157i(function3)) {
                        i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i16 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i38 |= i16;
                }
                i17 = i14 & 16;
                if (i17 != 0) {
                    i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    z15 = z4;
                } else {
                    z15 = z4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i38 |= i18;
                    }
                }
                i19 = i14 & 32;
                if (i19 != 0) {
                    i38 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i38 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i38 |= 12582912;
                    z16 = z14;
                } else {
                    z16 = z14;
                    if ((i13 & 12582912) == 0) {
                        if (c28655q.m87155h(z16)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i38 |= i26;
                    }
                }
                if ((i38 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q.m87135U(i38 & 1, z17)) {
                    c28676v0 = C28635l.f115821a;
                    if (i39 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C32618h3(11);
                            c28655q.m87172p0(objM87133R12);
                        }
                        function6 = (Function1) objM87133R12;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C32618h3(12);
                            c28655q.m87172p0(objM87133R11);
                        }
                        function7 = (Function1) objM87133R11;
                    } else {
                        function7 = function3;
                    }
                    if (i17 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i19 != 0) {
                        z26 = false;
                    } else {
                        z26 = z13;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    }
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32695y0();
                        c28655q.m87172p0(objM87133R);
                    }
                    c32695y0 = (C32695y0) objM87133R;
                    FeatureFlagChecker featureFlagChecker2 = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                    z27 = z16;
                    InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    function8 = function6;
                    int iMin = (int) Math.min(interfaceC39171c.mo743q0(150), interfaceC39171c.mo743q0(configuration.screenHeightDp) * 0.15f);
                    Integer numValueOf = Integer.valueOf(viewState.getConversation().m79883f().size());
                    boolean zM87157i2 = c28655q.m87157i(viewState);
                    i27 = i38 & 458752;
                    if (i27 == 131072) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z49 = z28 | zM87157i2;
                    if ((29360128 & i38) == 8388608) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    zM87153g = z49 | z29 | c28655q.m87153g(c13821r1M92099U);
                    objM87133R3 = c28655q.m87133R();
                    if (!zM87153g || objM87133R3 == c28676v0) {
                        boolean z52 = z25;
                        objM87133R3 = new b(viewState, z52, z27, c13821r1M92099U, null);
                        z34 = z52;
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        z34 = z25;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, numValueOf);
                    c2314t = C2314t.f9131w;
                    i28 = iMin;
                    Modifier modifierM66779c = ((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, c2314t), true, 1.0f);
                    c2307m = C2299e.f9114w;
                    function9 = function7;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    i29 = i27;
                    featureFlagChecker = featureFlagChecker2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66779c);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    i34 = 14;
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14);
                    C22949e c22949e = AbstractC22977m.f90650a;
                    f13 = 1 * 8;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f13, C2299e.f9109L), c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
                    c26808jM79948f = viewState.getEducationHubState();
                    if (c26808jM79948f == null) {
                        c28655q.m87150e0(382911889);
                        z38 = false;
                        c28655q.m87173q(false);
                        i28 = i28;
                        featureFlagChecker = featureFlagChecker;
                        function10 = function9;
                        i38 = i38;
                        c2314t3 = c2314t;
                        c28676v2 = c28676v0;
                        c13821r1 = c13821r1M92099U;
                        function11 = function8;
                        f15 = 1.0f;
                        i29 = i29;
                    } else {
                        c28655q.m87150e0(382911890);
                        Modifier modifierM3355a = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "educatonHubBox")), null, 3);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32618h3(13);
                            c28655q.m87172p0(objM87133R4);
                        }
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1125a.m3478a(modifierM3355a, (Function1) objM87133R4), 2 * 4, 0.0f, 0.0f, 0.0f, 14);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        c16934fM79974a = c26808jM79948f.getCarouselState();
                        if (c16934fM79974a == null) {
                            c28655q.m87150e0(1607334708);
                            z38 = false;
                            c28655q.m87173q(false);
                            i28 = i28;
                            function10 = function9;
                            i38 = i38;
                            c2314t3 = c2314t;
                            c13821r1 = c13821r1M92099U;
                            c28676v2 = c28676v0;
                            function11 = function8;
                            z39 = true;
                            f15 = 1.0f;
                        } else {
                            c28655q.m87150e0(1607334709);
                            boolean zM87157i3 = c28655q.m87157i(viewState) | c28655q.m87157i(c16934fM79974a);
                            if ((i38 & 7168) == 2048) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z54 = zM87157i3 | z35;
                            if ((57344 & i38) == 16384) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            z37 = z54 | z36;
                            objM87133R5 = c28655q.m87133R();
                            if (z37) {
                                c28676v1 = c28676v0;
                            } else {
                                c28676v1 = c28676v0;
                                if (objM87133R5 == c28676v1) {
                                    function10 = function9;
                                    c2314t2 = c2314t;
                                    function11 = function8;
                                    f14 = 1.0f;
                                }
                                c28676v2 = c28676v1;
                                z38 = false;
                                c2314t3 = c2314t2;
                                f15 = f14;
                                z39 = true;
                                c13821r1 = c13821r1M92099U;
                                AbstractC25303l.m74291r(c16934fM79974a, null, null, (Function1) objM87133R5, c28655q, C16934f.f64958n, 6);
                                c28655q.m87173q(false);
                            }
                            function10 = function9;
                            c2314t2 = c2314t;
                            function11 = function8;
                            f14 = 1.0f;
                            C32663q3 c32663q3 = new C32663q3(c32695y0, viewState, c16934fM79974a, function11, function10, 1);
                            c28655q.m87172p0(c32663q3);
                            objM87133R5 = c32663q3;
                            c28676v2 = c28676v1;
                            z38 = false;
                            c2314t3 = c2314t2;
                            f15 = f14;
                            z39 = true;
                            c13821r1 = c13821r1M92099U;
                            AbstractC25303l.m74291r(c16934fM79974a, null, null, (Function1) objM87133R5, c28655q, C16934f.f64958n, 6);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z39);
                        c28655q.m87173q(z38);
                    }
                    c28655q.m87150e0(-403254426);
                    for (C26801c c26801c3 : viewState.getConversation().m79883f()) {
                        if (c26801c3.getRole() == EnumC26800b.USER) {
                            c28655q.m87150e0(-1951206224);
                            AbstractC32623i3.m101872f(c26801c3.getContent(), c26801c3.m79890f(), c26801c3.getIsSuggestion(), c26801c3.getId(), c28655q, 0, 0);
                            c28655q.m87173q(z38);
                            featureFlagChecker = featureFlagChecker;
                            c2314t4 = c2314t3;
                            c13821r3 = c13821r1;
                            function12 = function11;
                            function13 = function10;
                            f16 = f15;
                            i38 = i38;
                            c2305k = c2305k;
                            z45 = z34;
                            z46 = z38;
                            i37 = i29;
                        } else {
                            c28655q.m87150e0(-1950952644);
                            if (c26801c3.getIsLoading()) {
                                c2314t4 = c2314t3;
                                c13821r3 = c13821r1;
                                function12 = function11;
                                function13 = function10;
                                f16 = f15;
                                z45 = z34;
                                z46 = z38;
                                i37 = i29;
                                c28655q.m87150e0(-1948745785);
                                c28655q.m87173q(z46);
                            } else {
                                c28655q.m87150e0(-1950905152);
                                Modifier modifierM3409f = AbstractC1102d.m3409f(f15, c2314t3);
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
                                iHashCode4 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                                InterfaceC0221l.f734a.getClass();
                                c0213j2 = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j2);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                                c0209i5 = C0217k.f732j;
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                                InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                                boolean zM65745e = AbstractC22676k.m65745e(AbstractC25265s.m74114R0(viewState.getConversation().m79883f()), c26801c3);
                                boolean zM65745e2 = AbstractC22676k.m65745e(AbstractC25265s.m74100H0(viewState.getConversation().m79883f()), c26801c3);
                                C2314t c2314t5 = c2314t3;
                                boolean zM79892h = c26801c3.getShowChatIcon();
                                C13821r1 c13821r4 = c13821r1;
                                String strM79885a = c26801c3.getContent();
                                Function1 function14 = function11;
                                List<InterfaceC25312u> listM79890f = c26801c3.m79890f();
                                Function1 function15 = function10;
                                boolean zM79888d = c26801c3.getFeedbackEnabled();
                                int i44 = i29;
                                String strM79893i = c26801c3.getTimestamp();
                                AiMessageFeedback aiMessageFeedbackM79887c = c26801c3.getFeedback();
                                boolean zM79894j = c26801c3.getIsComplete();
                                boolean zM79896l = c26801c3.getIsStopped();
                                boolean zM87157i4 = c28655q.m87157i(featureFlagChecker) | c28655q.m87157i(c26801c3) | c28655q.m87153g(interfaceC2464x2);
                                if ((i38 & 896) == 256) {
                                    z47 = true;
                                } else {
                                    z47 = false;
                                }
                                z48 = zM87157i4 | z47;
                                objM87133R10 = c28655q.m87133R();
                                if (z48) {
                                    c28676v5 = c28676v2;
                                } else {
                                    c28676v5 = c28676v2;
                                    if (objM87133R10 == c28676v5) {
                                        c28676v2 = c28676v5;
                                    }
                                    c2314t4 = c2314t5;
                                    f16 = 1.0f;
                                    C28655q c28655q2 = c28655q;
                                    i37 = i44;
                                    z45 = z34;
                                    c13821r3 = c13821r4;
                                    AbstractC32611g1.m101757n(viewState, zM65745e2, zM79892h, strM79885a, listM79890f, zM79888d, strM79893i, aiMessageFeedbackM79887c, false, zM79894j, zM79896l, (Function1) objM87133R10, zM65745e, function14, function15, z45, c28655q2, (i38 >> 3) & 14, 523264 & i38, 256);
                                    function12 = function14;
                                    function13 = function15;
                                    c28655q = c28655q2;
                                    c28655q.m87173q(true);
                                    z46 = false;
                                    c28655q.m87173q(false);
                                }
                                c28676v2 = c28676v5;
                                objM87133R10 = new C31915d(featureFlagChecker, c26801c3, interfaceC2464x2, onFeedbackClicked);
                                c28655q.m87172p0(objM87133R10);
                                c2314t4 = c2314t5;
                                f16 = 1.0f;
                                C28655q c28655q3 = c28655q;
                                i37 = i44;
                                z45 = z34;
                                c13821r3 = c13821r4;
                                AbstractC32611g1.m101757n(viewState, zM65745e2, zM79892h, strM79885a, listM79890f, zM79888d, strM79893i, aiMessageFeedbackM79887c, false, zM79894j, zM79896l, (Function1) objM87133R10, zM65745e, function14, function15, z45, c28655q3, (i38 >> 3) & 14, 523264 & i38, 256);
                                function12 = function14;
                                function13 = function15;
                                c28655q = c28655q3;
                                c28655q.m87173q(true);
                                z46 = false;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z46);
                        }
                        i38 = i38;
                        c13821r1 = c13821r3;
                        i29 = i37;
                        z38 = z46;
                        z34 = z45;
                        featureFlagChecker = featureFlagChecker;
                        c2314t3 = c2314t4;
                        c2305k = c2305k;
                        f15 = f16;
                        function11 = function12;
                        function10 = function13;
                    }
                    boolean z55 = z38;
                    i35 = i29;
                    c13821r2 = c13821r1;
                    Function1 function16 = function11;
                    Function1 function17 = function10;
                    i36 = i38;
                    z44 = z34;
                    c28655q.m87173q(z55);
                    if (viewState.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                        List<C26801c> listM79883f = viewState.getConversation().m79883f();
                        listIterator = listM79883f.listIterator(listM79883f.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                c26801c = null;
                                break;
                            }
                            c26801cPrevious = listIterator.previous();
                            if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                                c26801c = c26801cPrevious;
                                break;
                            }
                        }
                        c26801c2 = c26801c;
                        if ((c26801c2 == null && c26801c2.getIsLoading()) || z26) {
                            c28655q.m87150e0(386792377);
                            objM87133R6 = c28655q.m87133R();
                            c28676v3 = c28676v2;
                            if (objM87133R6 == c28676v3) {
                                objM87133R6 = new C32618h3(i34);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Function1 function18 = (Function1) objM87133R6;
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v3) {
                                objM87133R7 = new C32618h3(15);
                                c28655q.m87172p0(objM87133R7);
                            }
                            Function1 function19 = (Function1) objM87133R7;
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v3) {
                                objM87133R8 = new C32618h3(16);
                                c28655q.m87172p0(objM87133R8);
                            }
                            int i45 = i35 | 28080;
                            C28655q c28655q4 = c28655q;
                            c28676v4 = c28676v3;
                            AbstractC32611g1.m101757n(viewState, false, true, "", C25271y.f99162w, false, null, null, true, false, false, function18, true, function19, (Function1) objM87133R8, z44, c28655q4, ((i36 >> 3) & 14) | 100887984, i45, 1728);
                            c28655q = c28655q4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(387332459);
                            c28655q.m87173q(false);
                            c28676v4 = c28676v2;
                        }
                    } else {
                        c28655q.m87150e0(386792377);
                        objM87133R6 = c28655q.m87133R();
                        c28676v3 = c28676v2;
                        if (objM87133R6 == c28676v3) {
                            objM87133R6 = new C32618h3(i34);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function110 = (Function1) objM87133R6;
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v3) {
                            objM87133R7 = new C32618h3(15);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function111 = (Function1) objM87133R7;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v3) {
                            objM87133R8 = new C32618h3(16);
                            c28655q.m87172p0(objM87133R8);
                        }
                        int i46 = i35 | 28080;
                        C28655q c28655q5 = c28655q;
                        c28676v4 = c28676v3;
                        AbstractC32611g1.m101757n(viewState, false, true, "", C25271y.f99162w, false, null, null, true, false, false, function110, true, function111, (Function1) objM87133R8, z44, c28655q5, ((i36 >> 3) & 14) | 100887984, i46, 1728);
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    int iM87024x = c13821r2.f49321d.m87024x() - c13821r2.f49318a.m87024x();
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c13821r2);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i || objM87133R9 == c28676v4) {
                        objM87133R9 = new C32580a0(10, interfaceC2994c0, c13821r2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    m102314n(C1100b.f4583a, i28, iM87024x, (InterfaceC4339a) objM87133R9, c28655q, 6);
                    c28655q.m87173q(true);
                    z24 = z44;
                    z18 = z26;
                    z19 = z27;
                    function5 = function16;
                    function4 = function17;
                } else {
                    c28655q.m87138X();
                    z18 = z13;
                    z19 = z16;
                    function4 = function3;
                    z24 = z15;
                    function5 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14481c(interfaceC23013y, viewState, onFeedbackClicked, function5, function4, z24, z18, z19, i13, i14);
                }
            }
            i38 |= 24576;
            function3 = function2;
            i17 = i14 & 16;
            if (i17 != 0) {
                i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z15 = z4;
            } else {
                z15 = z4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i38 |= i18;
                }
            }
            i19 = i14 & 32;
            if (i19 != 0) {
                i38 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z13)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i38 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i38 |= 12582912;
                z16 = z14;
            } else {
                z16 = z14;
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87155h(z16)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i38 |= i26;
                }
            }
            if ((i38 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i38 & 1, z17)) {
                c28676v0 = C28635l.f115821a;
                if (i39 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C32618h3(11);
                        c28655q.m87172p0(objM87133R12);
                    }
                    function6 = (Function1) objM87133R12;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C32618h3(12);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function7 = (Function1) objM87133R11;
                } else {
                    function7 = function3;
                }
                if (i17 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if (i19 != 0) {
                    z26 = false;
                } else {
                    z26 = z13;
                }
                if (i25 != 0) {
                    z16 = false;
                }
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32695y0();
                    c28655q.m87172p0(objM87133R);
                }
                c32695y0 = (C32695y0) objM87133R;
                FeatureFlagChecker featureFlagChecker3 = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                Configuration configuration2 = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                z27 = z16;
                InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                function8 = function6;
                int iMin2 = (int) Math.min(interfaceC39171c2.mo743q0(150), interfaceC39171c2.mo743q0(configuration2.screenHeightDp) * 0.15f);
                Integer numValueOf2 = Integer.valueOf(viewState.getConversation().m79883f().size());
                boolean zM87157i5 = c28655q.m87157i(viewState);
                i27 = i38 & 458752;
                if (i27 == 131072) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z410 = z28 | zM87157i5;
                if ((29360128 & i38) == 8388608) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                zM87153g = z410 | z29 | c28655q.m87153g(c13821r1M92099U);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    boolean z56 = z25;
                    objM87133R3 = new b(viewState, z56, z27, c13821r1M92099U, null);
                    z34 = z56;
                    c28655q.m87172p0(objM87133R3);
                } else {
                    boolean z57 = z25;
                    objM87133R3 = new b(viewState, z57, z27, c13821r1M92099U, null);
                    z34 = z57;
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, numValueOf2);
                c2314t = C2314t.f9131w;
                i28 = iMin2;
                Modifier modifierM66779c2 = ((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, c2314t), true, 1.0f);
                c2307m = C2299e.f9114w;
                function9 = function7;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                i29 = i27;
                featureFlagChecker = featureFlagChecker3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM66779c2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                i34 = 14;
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14);
                C22949e c22949e2 = AbstractC22977m.f90650a;
                f13 = 1 * 8;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f13, C2299e.f9109L), c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                c26808jM79948f = viewState.getEducationHubState();
                if (c26808jM79948f == null) {
                    c28655q.m87150e0(382911889);
                    z38 = false;
                    c28655q.m87173q(false);
                    i28 = i28;
                    featureFlagChecker = featureFlagChecker;
                    function10 = function9;
                    i38 = i38;
                    c2314t3 = c2314t;
                    c28676v2 = c28676v0;
                    c13821r1 = c13821r1M92099U;
                    function11 = function8;
                    f15 = 1.0f;
                    i29 = i29;
                } else {
                    c28655q.m87150e0(382911890);
                    Modifier modifierM3355a2 = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "educatonHubBox")), null, 3);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32618h3(13);
                        c28655q.m87172p0(objM87133R4);
                    }
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1125a.m3478a(modifierM3355a2, (Function1) objM87133R4), 2 * 4, 0.0f, 0.0f, 0.0f, 14);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                    c16934fM79974a = c26808jM79948f.getCarouselState();
                    if (c16934fM79974a == null) {
                        c28655q.m87150e0(1607334708);
                        z38 = false;
                        c28655q.m87173q(false);
                        i28 = i28;
                        function10 = function9;
                        i38 = i38;
                        c2314t3 = c2314t;
                        c13821r1 = c13821r1M92099U;
                        c28676v2 = c28676v0;
                        function11 = function8;
                        z39 = true;
                        f15 = 1.0f;
                    } else {
                        c28655q.m87150e0(1607334709);
                        boolean zM87157i6 = c28655q.m87157i(viewState) | c28655q.m87157i(c16934fM79974a);
                        if ((i38 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z58 = zM87157i6 | z35;
                        if ((57344 & i38) == 16384) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        z37 = z58 | z36;
                        objM87133R5 = c28655q.m87133R();
                        if (z37) {
                            c28676v1 = c28676v0;
                            if (objM87133R5 == c28676v1) {
                                function10 = function9;
                                c2314t2 = c2314t;
                                function11 = function8;
                                f14 = 1.0f;
                            }
                            c28676v2 = c28676v1;
                            z38 = false;
                            c2314t3 = c2314t2;
                            f15 = f14;
                            z39 = true;
                            c13821r1 = c13821r1M92099U;
                            AbstractC25303l.m74291r(c16934fM79974a, null, null, (Function1) objM87133R5, c28655q, C16934f.f64958n, 6);
                            c28655q.m87173q(false);
                        } else {
                            c28676v1 = c28676v0;
                        }
                        function10 = function9;
                        c2314t2 = c2314t;
                        function11 = function8;
                        f14 = 1.0f;
                        C32663q3 c32663q4 = new C32663q3(c32695y0, viewState, c16934fM79974a, function11, function10, 1);
                        c28655q.m87172p0(c32663q4);
                        objM87133R5 = c32663q4;
                        c28676v2 = c28676v1;
                        z38 = false;
                        c2314t3 = c2314t2;
                        f15 = f14;
                        z39 = true;
                        c13821r1 = c13821r1M92099U;
                        AbstractC25303l.m74291r(c16934fM79974a, null, null, (Function1) objM87133R5, c28655q, C16934f.f64958n, 6);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z39);
                    c28655q.m87173q(z38);
                }
                c28655q.m87150e0(-403254426);
                while (r27.hasNext()) {
                    if (c26801c3.getRole() == EnumC26800b.USER) {
                        c28655q.m87150e0(-1951206224);
                        AbstractC32623i3.m101872f(c26801c3.getContent(), c26801c3.m79890f(), c26801c3.getIsSuggestion(), c26801c3.getId(), c28655q, 0, 0);
                        c28655q.m87173q(z38);
                        featureFlagChecker = featureFlagChecker;
                        c2314t4 = c2314t3;
                        c13821r3 = c13821r1;
                        function12 = function11;
                        function13 = function10;
                        f16 = f15;
                        i38 = i38;
                        c2305k = c2305k;
                        z45 = z34;
                        z46 = z38;
                        i37 = i29;
                    } else {
                        c28655q.m87150e0(-1950952644);
                        if (c26801c3.getIsLoading()) {
                            c28655q.m87150e0(-1950905152);
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(f15, c2314t3);
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                            c0209i5 = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                            InterfaceC2464x2 interfaceC2464x3 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                            boolean zM65745e3 = AbstractC22676k.m65745e(AbstractC25265s.m74114R0(viewState.getConversation().m79883f()), c26801c3);
                            boolean zM65745e4 = AbstractC22676k.m65745e(AbstractC25265s.m74100H0(viewState.getConversation().m79883f()), c26801c3);
                            C2314t c2314t6 = c2314t3;
                            boolean zM79892h2 = c26801c3.getShowChatIcon();
                            C13821r1 c13821r5 = c13821r1;
                            String strM79885a2 = c26801c3.getContent();
                            Function1 function112 = function11;
                            List<InterfaceC25312u> listM79890f2 = c26801c3.m79890f();
                            Function1 function113 = function10;
                            boolean zM79888d2 = c26801c3.getFeedbackEnabled();
                            int i47 = i29;
                            String strM79893i2 = c26801c3.getTimestamp();
                            AiMessageFeedback aiMessageFeedbackM79887c2 = c26801c3.getFeedback();
                            boolean zM79894j2 = c26801c3.getIsComplete();
                            boolean zM79896l2 = c26801c3.getIsStopped();
                            boolean zM87157i7 = c28655q.m87157i(featureFlagChecker) | c28655q.m87157i(c26801c3) | c28655q.m87153g(interfaceC2464x3);
                            if ((i38 & 896) == 256) {
                                z47 = true;
                            } else {
                                z47 = false;
                            }
                            z48 = zM87157i7 | z47;
                            objM87133R10 = c28655q.m87133R();
                            if (z48) {
                                c28676v5 = c28676v2;
                                if (objM87133R10 == c28676v5) {
                                    c28676v2 = c28676v5;
                                }
                                c2314t4 = c2314t6;
                                f16 = 1.0f;
                                C28655q c28655q6 = c28655q;
                                i37 = i47;
                                z45 = z34;
                                c13821r3 = c13821r5;
                                AbstractC32611g1.m101757n(viewState, zM65745e4, zM79892h2, strM79885a2, listM79890f2, zM79888d2, strM79893i2, aiMessageFeedbackM79887c2, false, zM79894j2, zM79896l2, (Function1) objM87133R10, zM65745e3, function112, function113, z45, c28655q6, (i38 >> 3) & 14, 523264 & i38, 256);
                                function12 = function112;
                                function13 = function113;
                                c28655q = c28655q6;
                                c28655q.m87173q(true);
                                z46 = false;
                                c28655q.m87173q(false);
                            } else {
                                c28676v5 = c28676v2;
                            }
                            c28676v2 = c28676v5;
                            objM87133R10 = new C31915d(featureFlagChecker, c26801c3, interfaceC2464x3, onFeedbackClicked);
                            c28655q.m87172p0(objM87133R10);
                            c2314t4 = c2314t6;
                            f16 = 1.0f;
                            C28655q c28655q7 = c28655q;
                            i37 = i47;
                            z45 = z34;
                            c13821r3 = c13821r5;
                            AbstractC32611g1.m101757n(viewState, zM65745e4, zM79892h2, strM79885a2, listM79890f2, zM79888d2, strM79893i2, aiMessageFeedbackM79887c2, false, zM79894j2, zM79896l2, (Function1) objM87133R10, zM65745e3, function112, function113, z45, c28655q7, (i38 >> 3) & 14, 523264 & i38, 256);
                            function12 = function112;
                            function13 = function113;
                            c28655q = c28655q7;
                            c28655q.m87173q(true);
                            z46 = false;
                            c28655q.m87173q(false);
                        } else {
                            c2314t4 = c2314t3;
                            c13821r3 = c13821r1;
                            function12 = function11;
                            function13 = function10;
                            f16 = f15;
                            z45 = z34;
                            z46 = z38;
                            i37 = i29;
                            c28655q.m87150e0(-1948745785);
                            c28655q.m87173q(z46);
                        }
                        c28655q.m87173q(z46);
                    }
                    i38 = i38;
                    c13821r1 = c13821r3;
                    i29 = i37;
                    z38 = z46;
                    z34 = z45;
                    featureFlagChecker = featureFlagChecker;
                    c2314t3 = c2314t4;
                    c2305k = c2305k;
                    f15 = f16;
                    function11 = function12;
                    function10 = function13;
                }
                boolean z59 = z38;
                i35 = i29;
                c13821r2 = c13821r1;
                Function1 function114 = function11;
                Function1 function115 = function10;
                i36 = i38;
                z44 = z34;
                c28655q.m87173q(z59);
                if (viewState.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                    List<C26801c> listM79883f2 = viewState.getConversation().m79883f();
                    listIterator = listM79883f2.listIterator(listM79883f2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c26801c = null;
                            break;
                        }
                        c26801cPrevious = listIterator.previous();
                        if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                            c26801c = c26801cPrevious;
                            break;
                        }
                    }
                    c26801c2 = c26801c;
                    if (c26801c2 == null) {
                        c28655q.m87150e0(387332459);
                        c28655q.m87173q(false);
                        c28676v4 = c28676v2;
                    } else {
                        c28655q.m87150e0(387332459);
                        c28655q.m87173q(false);
                        c28676v4 = c28676v2;
                    }
                } else {
                    c28655q.m87150e0(386792377);
                    objM87133R6 = c28655q.m87133R();
                    c28676v3 = c28676v2;
                    if (objM87133R6 == c28676v3) {
                        objM87133R6 = new C32618h3(i34);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function116 = (Function1) objM87133R6;
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v3) {
                        objM87133R7 = new C32618h3(15);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function117 = (Function1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v3) {
                        objM87133R8 = new C32618h3(16);
                        c28655q.m87172p0(objM87133R8);
                    }
                    int i48 = i35 | 28080;
                    C28655q c28655q8 = c28655q;
                    c28676v4 = c28676v3;
                    AbstractC32611g1.m101757n(viewState, false, true, "", C25271y.f99162w, false, null, null, true, false, false, function116, true, function117, (Function1) objM87133R8, z44, c28655q8, ((i36 >> 3) & 14) | 100887984, i48, 1728);
                    c28655q = c28655q8;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                int iM87024x2 = c13821r2.f49321d.m87024x() - c13821r2.f49318a.m87024x();
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c13821r2);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R9 = new C32580a0(10, interfaceC2994c0, c13821r2);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C32580a0(10, interfaceC2994c0, c13821r2);
                    c28655q.m87172p0(objM87133R9);
                }
                m102314n(C1100b.f4583a, i28, iM87024x2, (InterfaceC4339a) objM87133R9, c28655q, 6);
                c28655q.m87173q(true);
                z24 = z44;
                z18 = z26;
                z19 = z27;
                function5 = function114;
                function4 = function115;
            } else {
                c28655q.m87138X();
                z18 = z13;
                z19 = z16;
                function4 = function3;
                z24 = z15;
                function5 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14481c(interfaceC23013y, viewState, onFeedbackClicked, function5, function4, z24, z18, z19, i13, i14);
            }
        }
        i38 |= 3072;
        i15 = i14 & 8;
        if (i15 != 0) {
            if ((i13 & 24576) == 0) {
                function3 = function2;
                if (c28655q.m87157i(function3)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i38 |= i16;
            }
            i17 = i14 & 16;
            if (i17 != 0) {
                i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z15 = z4;
            } else {
                z15 = z4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i38 |= i18;
                }
            }
            i19 = i14 & 32;
            if (i19 != 0) {
                i38 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z13)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i38 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i38 |= 12582912;
                z16 = z14;
            } else {
                z16 = z14;
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87155h(z16)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i38 |= i26;
                }
            }
            if ((i38 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i38 & 1, z17)) {
                c28676v0 = C28635l.f115821a;
                if (i39 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C32618h3(11);
                        c28655q.m87172p0(objM87133R12);
                    }
                    function6 = (Function1) objM87133R12;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C32618h3(12);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function7 = (Function1) objM87133R11;
                } else {
                    function7 = function3;
                }
                if (i17 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if (i19 != 0) {
                    z26 = false;
                } else {
                    z26 = z13;
                }
                if (i25 != 0) {
                    z16 = false;
                }
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32695y0();
                    c28655q.m87172p0(objM87133R);
                }
                c32695y0 = (C32695y0) objM87133R;
                FeatureFlagChecker featureFlagChecker4 = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                Configuration configuration3 = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                z27 = z16;
                InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                function8 = function6;
                int iMin3 = (int) Math.min(interfaceC39171c3.mo743q0(150), interfaceC39171c3.mo743q0(configuration3.screenHeightDp) * 0.15f);
                Integer numValueOf3 = Integer.valueOf(viewState.getConversation().m79883f().size());
                boolean zM87157i8 = c28655q.m87157i(viewState);
                i27 = i38 & 458752;
                if (i27 == 131072) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z411 = z28 | zM87157i8;
                if ((29360128 & i38) == 8388608) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                zM87153g = z411 | z29 | c28655q.m87153g(c13821r1M92099U);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    boolean z510 = z25;
                    objM87133R3 = new b(viewState, z510, z27, c13821r1M92099U, null);
                    z34 = z510;
                    c28655q.m87172p0(objM87133R3);
                } else {
                    boolean z511 = z25;
                    objM87133R3 = new b(viewState, z511, z27, c13821r1M92099U, null);
                    z34 = z511;
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, numValueOf3);
                c2314t = C2314t.f9131w;
                i28 = iMin3;
                Modifier modifierM66779c3 = ((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, c2314t), true, 1.0f);
                c2307m = C2299e.f9114w;
                function9 = function7;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                i29 = i27;
                featureFlagChecker = featureFlagChecker4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM66779c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                i34 = 14;
                Modifier modifierM92116f2 = AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14);
                C22949e c22949e3 = AbstractC22977m.f90650a;
                f13 = 1 * 8;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f13, C2299e.f9109L), c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM92116f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                c26808jM79948f = viewState.getEducationHubState();
                if (c26808jM79948f == null) {
                    c28655q.m87150e0(382911889);
                    z38 = false;
                    c28655q.m87173q(false);
                    i28 = i28;
                    featureFlagChecker = featureFlagChecker;
                    function10 = function9;
                    i38 = i38;
                    c2314t3 = c2314t;
                    c28676v2 = c28676v0;
                    c13821r1 = c13821r1M92099U;
                    function11 = function8;
                    f15 = 1.0f;
                    i29 = i29;
                } else {
                    c28655q.m87150e0(382911890);
                    Modifier modifierM3355a3 = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "educatonHubBox")), null, 3);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32618h3(13);
                        c28655q.m87172p0(objM87133R4);
                    }
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1125a.m3478a(modifierM3355a3, (Function1) objM87133R4), 2 * 4, 0.0f, 0.0f, 0.0f, 14);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                    c16934fM79974a = c26808jM79948f.getCarouselState();
                    if (c16934fM79974a == null) {
                        c28655q.m87150e0(1607334708);
                        z38 = false;
                        c28655q.m87173q(false);
                        i28 = i28;
                        function10 = function9;
                        i38 = i38;
                        c2314t3 = c2314t;
                        c13821r1 = c13821r1M92099U;
                        c28676v2 = c28676v0;
                        function11 = function8;
                        z39 = true;
                        f15 = 1.0f;
                    } else {
                        c28655q.m87150e0(1607334709);
                        boolean zM87157i9 = c28655q.m87157i(viewState) | c28655q.m87157i(c16934fM79974a);
                        if ((i38 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z512 = zM87157i9 | z35;
                        if ((57344 & i38) == 16384) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        z37 = z512 | z36;
                        objM87133R5 = c28655q.m87133R();
                        if (z37) {
                            c28676v1 = c28676v0;
                            if (objM87133R5 == c28676v1) {
                                function10 = function9;
                                c2314t2 = c2314t;
                                function11 = function8;
                                f14 = 1.0f;
                            }
                            c28676v2 = c28676v1;
                            z38 = false;
                            c2314t3 = c2314t2;
                            f15 = f14;
                            z39 = true;
                            c13821r1 = c13821r1M92099U;
                            AbstractC25303l.m74291r(c16934fM79974a, null, null, (Function1) objM87133R5, c28655q, C16934f.f64958n, 6);
                            c28655q.m87173q(false);
                        } else {
                            c28676v1 = c28676v0;
                        }
                        function10 = function9;
                        c2314t2 = c2314t;
                        function11 = function8;
                        f14 = 1.0f;
                        C32663q3 c32663q5 = new C32663q3(c32695y0, viewState, c16934fM79974a, function11, function10, 1);
                        c28655q.m87172p0(c32663q5);
                        objM87133R5 = c32663q5;
                        c28676v2 = c28676v1;
                        z38 = false;
                        c2314t3 = c2314t2;
                        f15 = f14;
                        z39 = true;
                        c13821r1 = c13821r1M92099U;
                        AbstractC25303l.m74291r(c16934fM79974a, null, null, (Function1) objM87133R5, c28655q, C16934f.f64958n, 6);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z39);
                    c28655q.m87173q(z38);
                }
                c28655q.m87150e0(-403254426);
                while (r27.hasNext()) {
                    if (c26801c3.getRole() == EnumC26800b.USER) {
                        c28655q.m87150e0(-1951206224);
                        AbstractC32623i3.m101872f(c26801c3.getContent(), c26801c3.m79890f(), c26801c3.getIsSuggestion(), c26801c3.getId(), c28655q, 0, 0);
                        c28655q.m87173q(z38);
                        featureFlagChecker = featureFlagChecker;
                        c2314t4 = c2314t3;
                        c13821r3 = c13821r1;
                        function12 = function11;
                        function13 = function10;
                        f16 = f15;
                        i38 = i38;
                        c2305k = c2305k;
                        z45 = z34;
                        z46 = z38;
                        i37 = i29;
                    } else {
                        c28655q.m87150e0(-1950952644);
                        if (c26801c3.getIsLoading()) {
                            c28655q.m87150e0(-1950905152);
                            Modifier modifierM3409f3 = AbstractC1102d.m3409f(f15, c2314t3);
                            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                            c0209i5 = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                            InterfaceC2464x2 interfaceC2464x4 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                            boolean zM65745e5 = AbstractC22676k.m65745e(AbstractC25265s.m74114R0(viewState.getConversation().m79883f()), c26801c3);
                            boolean zM65745e6 = AbstractC22676k.m65745e(AbstractC25265s.m74100H0(viewState.getConversation().m79883f()), c26801c3);
                            C2314t c2314t7 = c2314t3;
                            boolean zM79892h3 = c26801c3.getShowChatIcon();
                            C13821r1 c13821r6 = c13821r1;
                            String strM79885a3 = c26801c3.getContent();
                            Function1 function118 = function11;
                            List<InterfaceC25312u> listM79890f3 = c26801c3.m79890f();
                            Function1 function119 = function10;
                            boolean zM79888d3 = c26801c3.getFeedbackEnabled();
                            int i49 = i29;
                            String strM79893i3 = c26801c3.getTimestamp();
                            AiMessageFeedback aiMessageFeedbackM79887c3 = c26801c3.getFeedback();
                            boolean zM79894j3 = c26801c3.getIsComplete();
                            boolean zM79896l3 = c26801c3.getIsStopped();
                            boolean zM87157i10 = c28655q.m87157i(featureFlagChecker) | c28655q.m87157i(c26801c3) | c28655q.m87153g(interfaceC2464x4);
                            if ((i38 & 896) == 256) {
                                z47 = true;
                            } else {
                                z47 = false;
                            }
                            z48 = zM87157i10 | z47;
                            objM87133R10 = c28655q.m87133R();
                            if (z48) {
                                c28676v5 = c28676v2;
                                if (objM87133R10 == c28676v5) {
                                    c28676v2 = c28676v5;
                                }
                                c2314t4 = c2314t7;
                                f16 = 1.0f;
                                C28655q c28655q9 = c28655q;
                                i37 = i49;
                                z45 = z34;
                                c13821r3 = c13821r6;
                                AbstractC32611g1.m101757n(viewState, zM65745e6, zM79892h3, strM79885a3, listM79890f3, zM79888d3, strM79893i3, aiMessageFeedbackM79887c3, false, zM79894j3, zM79896l3, (Function1) objM87133R10, zM65745e5, function118, function119, z45, c28655q9, (i38 >> 3) & 14, 523264 & i38, 256);
                                function12 = function118;
                                function13 = function119;
                                c28655q = c28655q9;
                                c28655q.m87173q(true);
                                z46 = false;
                                c28655q.m87173q(false);
                            } else {
                                c28676v5 = c28676v2;
                            }
                            c28676v2 = c28676v5;
                            objM87133R10 = new C31915d(featureFlagChecker, c26801c3, interfaceC2464x4, onFeedbackClicked);
                            c28655q.m87172p0(objM87133R10);
                            c2314t4 = c2314t7;
                            f16 = 1.0f;
                            C28655q c28655q10 = c28655q;
                            i37 = i49;
                            z45 = z34;
                            c13821r3 = c13821r6;
                            AbstractC32611g1.m101757n(viewState, zM65745e6, zM79892h3, strM79885a3, listM79890f3, zM79888d3, strM79893i3, aiMessageFeedbackM79887c3, false, zM79894j3, zM79896l3, (Function1) objM87133R10, zM65745e5, function118, function119, z45, c28655q10, (i38 >> 3) & 14, 523264 & i38, 256);
                            function12 = function118;
                            function13 = function119;
                            c28655q = c28655q10;
                            c28655q.m87173q(true);
                            z46 = false;
                            c28655q.m87173q(false);
                        } else {
                            c2314t4 = c2314t3;
                            c13821r3 = c13821r1;
                            function12 = function11;
                            function13 = function10;
                            f16 = f15;
                            z45 = z34;
                            z46 = z38;
                            i37 = i29;
                            c28655q.m87150e0(-1948745785);
                            c28655q.m87173q(z46);
                        }
                        c28655q.m87173q(z46);
                    }
                    i38 = i38;
                    c13821r1 = c13821r3;
                    i29 = i37;
                    z38 = z46;
                    z34 = z45;
                    featureFlagChecker = featureFlagChecker;
                    c2314t3 = c2314t4;
                    c2305k = c2305k;
                    f15 = f16;
                    function11 = function12;
                    function10 = function13;
                }
                boolean z513 = z38;
                i35 = i29;
                c13821r2 = c13821r1;
                Function1 function1110 = function11;
                Function1 function1111 = function10;
                i36 = i38;
                z44 = z34;
                c28655q.m87173q(z513);
                if (viewState.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                    List<C26801c> listM79883f3 = viewState.getConversation().m79883f();
                    listIterator = listM79883f3.listIterator(listM79883f3.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c26801c = null;
                            break;
                        }
                        c26801cPrevious = listIterator.previous();
                        if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                            c26801c = c26801cPrevious;
                            break;
                        }
                    }
                    c26801c2 = c26801c;
                    if (c26801c2 == null) {
                        c28655q.m87150e0(387332459);
                        c28655q.m87173q(false);
                        c28676v4 = c28676v2;
                    } else {
                        c28655q.m87150e0(387332459);
                        c28655q.m87173q(false);
                        c28676v4 = c28676v2;
                    }
                } else {
                    c28655q.m87150e0(386792377);
                    objM87133R6 = c28655q.m87133R();
                    c28676v3 = c28676v2;
                    if (objM87133R6 == c28676v3) {
                        objM87133R6 = new C32618h3(i34);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function1112 = (Function1) objM87133R6;
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v3) {
                        objM87133R7 = new C32618h3(15);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function1113 = (Function1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v3) {
                        objM87133R8 = new C32618h3(16);
                        c28655q.m87172p0(objM87133R8);
                    }
                    int i410 = i35 | 28080;
                    C28655q c28655q11 = c28655q;
                    c28676v4 = c28676v3;
                    AbstractC32611g1.m101757n(viewState, false, true, "", C25271y.f99162w, false, null, null, true, false, false, function1112, true, function1113, (Function1) objM87133R8, z44, c28655q11, ((i36 >> 3) & 14) | 100887984, i410, 1728);
                    c28655q = c28655q11;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                int iM87024x3 = c13821r2.f49321d.m87024x() - c13821r2.f49318a.m87024x();
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c13821r2);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R9 = new C32580a0(10, interfaceC2994c0, c13821r2);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C32580a0(10, interfaceC2994c0, c13821r2);
                    c28655q.m87172p0(objM87133R9);
                }
                m102314n(C1100b.f4583a, i28, iM87024x3, (InterfaceC4339a) objM87133R9, c28655q, 6);
                c28655q.m87173q(true);
                z24 = z44;
                z18 = z26;
                z19 = z27;
                function5 = function1110;
                function4 = function1111;
            } else {
                c28655q.m87138X();
                z18 = z13;
                z19 = z16;
                function4 = function3;
                z24 = z15;
                function5 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14481c(interfaceC23013y, viewState, onFeedbackClicked, function5, function4, z24, z18, z19, i13, i14);
            }
        }
        i38 |= 24576;
        function3 = function2;
        i17 = i14 & 16;
        if (i17 != 0) {
            i38 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z15 = z4;
        } else {
            z15 = z4;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z15)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i38 |= i18;
            }
        }
        i19 = i14 & 32;
        if (i19 != 0) {
            i38 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q.m87155h(z13)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i38 |= i24;
        }
        i25 = i14 & 64;
        if (i25 != 0) {
            i38 |= 12582912;
            z16 = z14;
        } else {
            z16 = z14;
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87155h(z16)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i38 |= i26;
            }
        }
        if ((i38 & 4793491) != 4793490) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (c28655q.m87135U(i38 & 1, z17)) {
            c28676v0 = C28635l.f115821a;
            if (i39 != 0) {
                objM87133R12 = c28655q.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = new C32618h3(11);
                    c28655q.m87172p0(objM87133R12);
                }
                function6 = (Function1) objM87133R12;
            } else {
                function6 = function1;
            }
            if (i15 != 0) {
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C32618h3(12);
                    c28655q.m87172p0(objM87133R11);
                }
                function7 = (Function1) objM87133R11;
            } else {
                function7 = function3;
            }
            if (i17 != 0) {
                z25 = false;
            } else {
                z25 = z15;
            }
            if (i19 != 0) {
                z26 = false;
            } else {
                z26 = z13;
            }
            if (i25 != 0) {
                z16 = false;
            }
            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C32695y0();
                c28655q.m87172p0(objM87133R);
            }
            c32695y0 = (C32695y0) objM87133R;
            FeatureFlagChecker featureFlagChecker5 = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
            Configuration configuration4 = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
            z27 = z16;
            InterfaceC39171c interfaceC39171c4 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            function8 = function6;
            int iMin4 = (int) Math.min(interfaceC39171c4.mo743q0(150), interfaceC39171c4.mo743q0(configuration4.screenHeightDp) * 0.15f);
            Integer numValueOf4 = Integer.valueOf(viewState.getConversation().m79883f().size());
            boolean zM87157i11 = c28655q.m87157i(viewState);
            i27 = i38 & 458752;
            if (i27 == 131072) {
                z28 = true;
            } else {
                z28 = false;
            }
            boolean z412 = z28 | zM87157i11;
            if ((29360128 & i38) == 8388608) {
                z29 = true;
            } else {
                z29 = false;
            }
            zM87153g = z412 | z29 | c28655q.m87153g(c13821r1M92099U);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                boolean z514 = z25;
                objM87133R3 = new b(viewState, z514, z27, c13821r1M92099U, null);
                z34 = z514;
                c28655q.m87172p0(objM87133R3);
            } else {
                boolean z515 = z25;
                objM87133R3 = new b(viewState, z515, z27, c13821r1M92099U, null);
                z34 = z515;
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, numValueOf4);
            c2314t = C2314t.f9131w;
            i28 = iMin4;
            Modifier modifierM66779c4 = ((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, c2314t), true, 1.0f);
            c2307m = C2299e.f9114w;
            function9 = function7;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
            i29 = i27;
            featureFlagChecker = featureFlagChecker5;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM66779c4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
            i34 = 14;
            Modifier modifierM92116f3 = AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14);
            C22949e c22949e4 = AbstractC22977m.f90650a;
            f13 = 1 * 8;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f13, C2299e.f9109L), c2305k, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM92116f3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
            c26808jM79948f = viewState.getEducationHubState();
            if (c26808jM79948f == null) {
                c28655q.m87150e0(382911889);
                z38 = false;
                c28655q.m87173q(false);
                i28 = i28;
                featureFlagChecker = featureFlagChecker;
                function10 = function9;
                i38 = i38;
                c2314t3 = c2314t;
                c28676v2 = c28676v0;
                c13821r1 = c13821r1M92099U;
                function11 = function8;
                f15 = 1.0f;
                i29 = i29;
            } else {
                c28655q.m87150e0(382911890);
                Modifier modifierM3355a4 = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "educatonHubBox")), null, 3);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C32618h3(13);
                    c28655q.m87172p0(objM87133R4);
                }
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1125a.m3478a(modifierM3355a4, (Function1) objM87133R4), 2 * 4, 0.0f, 0.0f, 0.0f, 14);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                c16934fM79974a = c26808jM79948f.getCarouselState();
                if (c16934fM79974a == null) {
                    c28655q.m87150e0(1607334708);
                    z38 = false;
                    c28655q.m87173q(false);
                    i28 = i28;
                    function10 = function9;
                    i38 = i38;
                    c2314t3 = c2314t;
                    c13821r1 = c13821r1M92099U;
                    c28676v2 = c28676v0;
                    function11 = function8;
                    z39 = true;
                    f15 = 1.0f;
                } else {
                    c28655q.m87150e0(1607334709);
                    boolean zM87157i12 = c28655q.m87157i(viewState) | c28655q.m87157i(c16934fM79974a);
                    if ((i38 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z516 = zM87157i12 | z35;
                    if ((57344 & i38) == 16384) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = z516 | z36;
                    objM87133R5 = c28655q.m87133R();
                    if (z37) {
                        c28676v1 = c28676v0;
                        if (objM87133R5 == c28676v1) {
                            function10 = function9;
                            c2314t2 = c2314t;
                            function11 = function8;
                            f14 = 1.0f;
                        }
                        c28676v2 = c28676v1;
                        z38 = false;
                        c2314t3 = c2314t2;
                        f15 = f14;
                        z39 = true;
                        c13821r1 = c13821r1M92099U;
                        AbstractC25303l.m74291r(c16934fM79974a, null, null, (Function1) objM87133R5, c28655q, C16934f.f64958n, 6);
                        c28655q.m87173q(false);
                    } else {
                        c28676v1 = c28676v0;
                    }
                    function10 = function9;
                    c2314t2 = c2314t;
                    function11 = function8;
                    f14 = 1.0f;
                    C32663q3 c32663q6 = new C32663q3(c32695y0, viewState, c16934fM79974a, function11, function10, 1);
                    c28655q.m87172p0(c32663q6);
                    objM87133R5 = c32663q6;
                    c28676v2 = c28676v1;
                    z38 = false;
                    c2314t3 = c2314t2;
                    f15 = f14;
                    z39 = true;
                    c13821r1 = c13821r1M92099U;
                    AbstractC25303l.m74291r(c16934fM79974a, null, null, (Function1) objM87133R5, c28655q, C16934f.f64958n, 6);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z39);
                c28655q.m87173q(z38);
            }
            c28655q.m87150e0(-403254426);
            while (r27.hasNext()) {
                if (c26801c3.getRole() == EnumC26800b.USER) {
                    c28655q.m87150e0(-1951206224);
                    AbstractC32623i3.m101872f(c26801c3.getContent(), c26801c3.m79890f(), c26801c3.getIsSuggestion(), c26801c3.getId(), c28655q, 0, 0);
                    c28655q.m87173q(z38);
                    featureFlagChecker = featureFlagChecker;
                    c2314t4 = c2314t3;
                    c13821r3 = c13821r1;
                    function12 = function11;
                    function13 = function10;
                    f16 = f15;
                    i38 = i38;
                    c2305k = c2305k;
                    z45 = z34;
                    z46 = z38;
                    i37 = i29;
                } else {
                    c28655q.m87150e0(-1950952644);
                    if (c26801c3.getIsLoading()) {
                        c28655q.m87150e0(-1950905152);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(f15, c2314t3);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                        c0209i5 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                        InterfaceC2464x2 interfaceC2464x5 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                        boolean zM65745e7 = AbstractC22676k.m65745e(AbstractC25265s.m74114R0(viewState.getConversation().m79883f()), c26801c3);
                        boolean zM65745e8 = AbstractC22676k.m65745e(AbstractC25265s.m74100H0(viewState.getConversation().m79883f()), c26801c3);
                        C2314t c2314t8 = c2314t3;
                        boolean zM79892h4 = c26801c3.getShowChatIcon();
                        C13821r1 c13821r7 = c13821r1;
                        String strM79885a4 = c26801c3.getContent();
                        Function1 function1114 = function11;
                        List<InterfaceC25312u> listM79890f4 = c26801c3.m79890f();
                        Function1 function1115 = function10;
                        boolean zM79888d4 = c26801c3.getFeedbackEnabled();
                        int i411 = i29;
                        String strM79893i4 = c26801c3.getTimestamp();
                        AiMessageFeedback aiMessageFeedbackM79887c4 = c26801c3.getFeedback();
                        boolean zM79894j4 = c26801c3.getIsComplete();
                        boolean zM79896l4 = c26801c3.getIsStopped();
                        boolean zM87157i13 = c28655q.m87157i(featureFlagChecker) | c28655q.m87157i(c26801c3) | c28655q.m87153g(interfaceC2464x5);
                        if ((i38 & 896) == 256) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                        z48 = zM87157i13 | z47;
                        objM87133R10 = c28655q.m87133R();
                        if (z48) {
                            c28676v5 = c28676v2;
                            if (objM87133R10 == c28676v5) {
                                c28676v2 = c28676v5;
                            }
                            c2314t4 = c2314t8;
                            f16 = 1.0f;
                            C28655q c28655q12 = c28655q;
                            i37 = i411;
                            z45 = z34;
                            c13821r3 = c13821r7;
                            AbstractC32611g1.m101757n(viewState, zM65745e8, zM79892h4, strM79885a4, listM79890f4, zM79888d4, strM79893i4, aiMessageFeedbackM79887c4, false, zM79894j4, zM79896l4, (Function1) objM87133R10, zM65745e7, function1114, function1115, z45, c28655q12, (i38 >> 3) & 14, 523264 & i38, 256);
                            function12 = function1114;
                            function13 = function1115;
                            c28655q = c28655q12;
                            c28655q.m87173q(true);
                            z46 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28676v5 = c28676v2;
                        }
                        c28676v2 = c28676v5;
                        objM87133R10 = new C31915d(featureFlagChecker, c26801c3, interfaceC2464x5, onFeedbackClicked);
                        c28655q.m87172p0(objM87133R10);
                        c2314t4 = c2314t8;
                        f16 = 1.0f;
                        C28655q c28655q13 = c28655q;
                        i37 = i411;
                        z45 = z34;
                        c13821r3 = c13821r7;
                        AbstractC32611g1.m101757n(viewState, zM65745e8, zM79892h4, strM79885a4, listM79890f4, zM79888d4, strM79893i4, aiMessageFeedbackM79887c4, false, zM79894j4, zM79896l4, (Function1) objM87133R10, zM65745e7, function1114, function1115, z45, c28655q13, (i38 >> 3) & 14, 523264 & i38, 256);
                        function12 = function1114;
                        function13 = function1115;
                        c28655q = c28655q13;
                        c28655q.m87173q(true);
                        z46 = false;
                        c28655q.m87173q(false);
                    } else {
                        c2314t4 = c2314t3;
                        c13821r3 = c13821r1;
                        function12 = function11;
                        function13 = function10;
                        f16 = f15;
                        z45 = z34;
                        z46 = z38;
                        i37 = i29;
                        c28655q.m87150e0(-1948745785);
                        c28655q.m87173q(z46);
                    }
                    c28655q.m87173q(z46);
                }
                i38 = i38;
                c13821r1 = c13821r3;
                i29 = i37;
                z38 = z46;
                z34 = z45;
                featureFlagChecker = featureFlagChecker;
                c2314t3 = c2314t4;
                c2305k = c2305k;
                f15 = f16;
                function11 = function12;
                function10 = function13;
            }
            boolean z517 = z38;
            i35 = i29;
            c13821r2 = c13821r1;
            Function1 function1116 = function11;
            Function1 function1117 = function10;
            i36 = i38;
            z44 = z34;
            c28655q.m87173q(z517);
            if (viewState.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                List<C26801c> listM79883f4 = viewState.getConversation().m79883f();
                listIterator = listM79883f4.listIterator(listM79883f4.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        c26801c = null;
                        break;
                    }
                    c26801cPrevious = listIterator.previous();
                    if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                        c26801c = c26801cPrevious;
                        break;
                    }
                }
                c26801c2 = c26801c;
                if (c26801c2 == null) {
                    c28655q.m87150e0(387332459);
                    c28655q.m87173q(false);
                    c28676v4 = c28676v2;
                } else {
                    c28655q.m87150e0(387332459);
                    c28655q.m87173q(false);
                    c28676v4 = c28676v2;
                }
            } else {
                c28655q.m87150e0(386792377);
                objM87133R6 = c28655q.m87133R();
                c28676v3 = c28676v2;
                if (objM87133R6 == c28676v3) {
                    objM87133R6 = new C32618h3(i34);
                    c28655q.m87172p0(objM87133R6);
                }
                Function1 function1118 = (Function1) objM87133R6;
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v3) {
                    objM87133R7 = new C32618h3(15);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function1119 = (Function1) objM87133R7;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v3) {
                    objM87133R8 = new C32618h3(16);
                    c28655q.m87172p0(objM87133R8);
                }
                int i412 = i35 | 28080;
                C28655q c28655q14 = c28655q;
                c28676v4 = c28676v3;
                AbstractC32611g1.m101757n(viewState, false, true, "", C25271y.f99162w, false, null, null, true, false, false, function1118, true, function1119, (Function1) objM87133R8, z44, c28655q14, ((i36 >> 3) & 14) | 100887984, i412, 1728);
                c28655q = c28655q14;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            int iM87024x4 = c13821r2.f49321d.m87024x() - c13821r2.f49318a.m87024x();
            zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c13821r2);
            objM87133R9 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R9 = new C32580a0(10, interfaceC2994c0, c13821r2);
                c28655q.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C32580a0(10, interfaceC2994c0, c13821r2);
                c28655q.m87172p0(objM87133R9);
            }
            m102314n(C1100b.f4583a, i28, iM87024x4, (InterfaceC4339a) objM87133R9, c28655q, 6);
            c28655q.m87173q(true);
            z24 = z44;
            z18 = z26;
            z19 = z27;
            function5 = function1116;
            function4 = function1117;
        } else {
            c28655q.m87138X();
            z18 = z13;
            z19 = z16;
            function4 = function3;
            z24 = z15;
            function5 = function1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14481c(interfaceC23013y, viewState, onFeedbackClicked, function5, function4, z24, z18, z19, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m102321u(AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m102322v(AbstractC25669a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m102323w(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        drawBehind.mo727R(AbstractC15673b0.m43972A(), 0L, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)))) & 4294967295L), drawBehind.mo743q0(2 * 4), (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? 1.0f : 0.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m102324x(C32695y0 c32695y0, C26804f c26804f, C16934f c16934f, Function1 function1, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        c32695y0.m102587a(event, 0, c26804f, c16934f, function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m102325y(FeatureFlagChecker featureFlagChecker, C26801c c26801c, InterfaceC2464x2 interfaceC2464x2, InterfaceC4351m interfaceC4351m, AiFeedbackType aiFeedbackType) {
        AiMessageFeedback aiMessageFeedbackM79887c = (!featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_FEEDBACK_V3) || aiFeedbackType == null) ? c26801c.getFeedback() : new AiMessageFeedback(aiFeedbackType.getValue(), "", C25271y.f99162w);
        if (interfaceC2464x2 != null) {
            ((C2463x1) interfaceC2464x2).m7442a();
        }
        interfaceC4351m.invoke(c26801c.getId(), aiMessageFeedbackM79887c);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m102326z(AiFeedbackType aiFeedbackType) {
        return C23454a0.f92919a;
    }
}

package wz0;

import a41.C0372h;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import com.whoop.navigation.models.GenericInteraction;
import hg3.AbstractC17269i;
import i51.EnumC18104a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.C11407v;
import p291l0.AbstractC22989q;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p668z1.C39970s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p733ry2.C31919h;
import pf.AbstractC29125c;
import q12.C29802c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uz1.C35429g;
import v41.AbstractC35684p;
import v41.AbstractC35687q0;
import v41.EnumC35690s;
import v41.InterfaceC35689r0;
import vv2.C36538d;
import wb3.AbstractC37056f;
import wr1.C37572f;

/* JADX INFO: renamed from: wz0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006)²\u0006\u000e\u0010\u001a\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020&8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lwz0/e;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k", "(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lwz0/f;", "steps", "", "Lv41/r0;", "S", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/Set;", "resource", "", "playToken", "", "frozen", "Lkotlin/Function0;", "onFinished", "A", "(Landroidx/compose/ui/Modifier;Lv41/r0;IZLc93/a;Landroidx/compose/runtime/Composer;I)V", "play", "T", "(Lwz0/e;I)I", "Ly3/f;", "a", "F", "R", "()F", "DEFAULT_ANIMATED_SEQUENCE_HEIGHT", "completed", "animationFinished", "minimumDurationElapsed", "Lv41/s;", "loadingState", "atEnd", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37777d {

    /* JADX INFO: renamed from: a */
    private static final float f161807a = 200;

    /* JADX INFO: renamed from: wz0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.animatedsequence.AnimatedSequenceKt$AnimatedSequence$2$1", m100430f = "AnimatedSequence.kt", m100431l = {LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        long f161808w;

        /* JADX INFO: renamed from: x */
        int f161809x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Long f161810y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f161811z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l7, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161810y = l7;
            this.f161811z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f161810y, this.f161811z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161809x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Long l7 = this.f161810y;
                if (l7 != null) {
                    long jLongValue = l7.longValue();
                    this.f161808w = jLongValue;
                    this.f161809x = 1;
                    if (AbstractC3034m0.m8782b(jLongValue, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return c23454a0;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC37777d.m121214o(this.f161811z, true);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: wz0.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.animatedsequence.AnimatedSequenceKt$AnimatedSequence$3$1", m100430f = "AnimatedSequence.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C37779f f161812E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f161813F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f161814G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f161815H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f161816I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28601c1 f161817J;

        /* JADX INFO: renamed from: w */
        int f161818w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f161819x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C37778e f161820y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f161821z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, C37778e c37778e, boolean z4, C37779f c37779f, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161819x = i13;
            this.f161820y = c37778e;
            this.f161821z = z4;
            this.f161812E = c37779f;
            this.f161813F = function1;
            this.f161814G = interfaceC28601c1;
            this.f161815H = interfaceC28601c2;
            this.f161816I = interfaceC28601c3;
            this.f161817J = interfaceC28601c4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f161819x, this.f161820y, this.f161821z, this.f161812E, this.f161813F, this.f161814G, this.f161815H, this.f161816I, this.f161817J, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f161818w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean zM121222w = AbstractC37777d.m121222w(this.f161814G);
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (zM121222w) {
                return c23454a0;
            }
            EnumC37780g enumC37780gM121175b = AbstractC37774a.m121175b(this.f161819x, AbstractC37056f.m118951C(this.f161820y.m121229e()), this.f161820y.getRepeatMode(), AbstractC37777d.m121224y(this.f161815H) || this.f161821z, AbstractC37777d.m121213n(this.f161816I));
            if (enumC37780gM121175b == EnumC37780g.WAIT) {
                return c23454a0;
            }
            GenericInteraction genericInteractionM121234d = this.f161812E.getOnStepCompleteInteraction();
            if (genericInteractionM121234d != null) {
                this.f161813F.invoke(genericInteractionM121234d);
            }
            if (enumC37780gM121175b == EnumC37780g.NEXT) {
                int iM121219t = AbstractC37777d.m121219t(this.f161817J);
                AbstractC37777d.m121220u(this.f161817J, iM121219t + 1);
                AbstractC17269i.m48918v(iM121219t);
            } else {
                AbstractC37777d.m121223x(this.f161814G, true);
                GenericInteraction genericInteractionM121227b = this.f161820y.getOnCompleteInteraction();
                if (genericInteractionM121227b != null) {
                    this.f161813F.invoke(genericInteractionM121227b);
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: wz0.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.animatedsequence.AnimatedSequenceKt$SequenceLottie$4$1", m100430f = "AnimatedSequence.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161822w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f161823x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f161824y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f161825z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161823x = interfaceC4339a;
            this.f161824y = interfaceC28601c1;
            this.f161825z = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f161823x, this.f161824y, this.f161825z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f161822w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC37777d.m121184E(this.f161824y) && AbstractC37777d.m121181B(this.f161825z) == EnumC35690s.READY) {
                this.f161823x.invoke();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m121180A(Modifier modifier, InterfaceC35689r0 interfaceC35689r0, int i13, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1688708018);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? c28655q.m87153g(interfaceC35689r0) : c28655q.m87157i(interfaceC35689r0) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            int i16 = i15 & 896;
            boolean z13 = i16 == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(EnumC35690s.LOADING);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM87149e = (i16 == 256) | c28655q.m87149e(m121181B(interfaceC28601c1).ordinal());
            Object objM87133R2 = c28655q.m87133R();
            if (zM87149e || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Float fValueOf = Float.valueOf(1.0f);
            if (!z4) {
                fValueOf = null;
            }
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                objM87133R3 = new C29802c(28, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c2);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C35429g(15, interfaceC28601c2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC35687q0.m113102l(modifier, interfaceC35689r0, null, null, null, null, 1, false, fValueOf, null, function1, (InterfaceC4339a) objM87133R4, c28655q, (i15 & 14) | 1572864 | (i15 & 112), 0, 700);
            Integer numValueOf = Integer.valueOf(i13);
            Boolean boolValueOf = Boolean.valueOf(m121184E(interfaceC28601c2));
            EnumC35690s enumC35690sM121181B = m121181B(interfaceC28601c1);
            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c1) | ((i15 & 57344) == 16384);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87153g3 || objM87133R5 == c28676v0) {
                interfaceC4339a2 = interfaceC4339a;
                objM87133R5 = new c(interfaceC4339a2, interfaceC28601c2, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            AbstractC28683x.m87255i(numValueOf, boolValueOf, enumC35690sM121181B, (InterfaceC4351m) objM87133R5, c28655q);
        } else {
            interfaceC4339a2 = interfaceC4339a;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(modifier, interfaceC35689r0, i13, z4, interfaceC4339a2, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final EnumC35690s m121181B(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC35690s) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m121182C(Modifier modifier, InterfaceC35689r0 interfaceC35689r0, int i13, boolean z4, InterfaceC4339a interfaceC4339a, int i14, Composer composer, int i15) {
        m121180A(modifier, interfaceC35689r0, i13, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m121183D(InterfaceC28601c1 interfaceC28601c1, EnumC35690s enumC35690s) {
        interfaceC28601c1.setValue(enumC35690s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final boolean m121184E(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: F */
    private static final void m121185F(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m121186G(InterfaceC28601c1 interfaceC28601c1, EnumC35690s it) {
        AbstractC22676k.m65750j(it, "it");
        m121183D(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m121187H(InterfaceC28601c1 interfaceC28601c1) {
        m121185F(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    public static final float m121197R() {
        return f161807a;
    }

    /* JADX INFO: renamed from: S */
    private static final Set<InterfaceC35689r0> m121198S(List<C37779f> list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(list);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            List<C37779f> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C37779f) it.next()).getLottie());
            }
            objM87133R = AbstractC25265s.m74159y0(arrayList);
            c28655q.m87172p0(objM87133R);
        }
        List<InterfaceC35689r0> list3 = (List) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(list);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C39970s();
            c28655q.m87172p0(objM87133R2);
        }
        C39970s c39970s = (C39970s) objM87133R2;
        c28655q.m87150e0(-1090715232);
        for (InterfaceC35689r0 interfaceC35689r0 : list3) {
            c28655q.m87144b0(-557543862, interfaceC35689r0);
            if (((Boolean) AbstractC30060g.m92098T(AbstractC35684p.m113060u(interfaceC35689r0), c28655q, 0, 62).f148045E.getValue()).booleanValue()) {
                c39970s.put(interfaceC35689r0, C23454a0.f92919a);
            }
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return c39970s.f172479y;
    }

    /* JADX INFO: renamed from: T */
    private static final int m121199T(C37778e c37778e, int i13) {
        return AbstractC37774a.m121176c(i13, c37778e.m121229e().size(), c37778e.getRepeatMode());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:103:0x0319  */
    /* JADX WARN: Code duplicated, block: B:104:0x031d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0338  */
    /* JADX WARN: Code duplicated, block: B:91:0x026a  */
    /* JADX WARN: Code duplicated, block: B:94:0x029c  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a0  */
    /* JADX INFO: renamed from: k */
    public static final void m121210k(Modifier modifier, final C37778e state, final Function1 onViewEvent, Composer composer, final int i13, final int i14) {
        final Modifier modifier2;
        int i15;
        C37778e c37778e;
        Function1 function1;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        C11347e2 c11347e2;
        C39174f c39174fM121230f;
        Modifier modifierM3409f;
        int iHashCode;
        int iHashCode2;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1140800590);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            if (state.m121229e().isEmpty()) {
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i17 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: wz0.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i17) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC37777d.m121211l(modifier2, state, onViewEvent, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC37777d.m121218s(modifier2, state, onViewEvent, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                Set<InterfaceC35689r0> setM121198S = m121198S(state.m121229e(), c28655q2, 0);
                Object[] objArr = {state.m121229e()};
                Object objM87133R = c28655q2.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C37572f(11);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q2, 48);
                Object[] objArr2 = {state.m121229e()};
                Object objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C37572f(12);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R2, c28655q2, 48);
                int iM121199T = m121199T(state, m121219t(interfaceC28601c3));
                C37779f c37779f = state.m121229e().get(iM121199T);
                boolean zContains = setM121198S.contains(c37779f.getLottie());
                Long lM121174a = AbstractC37774a.m121174a(c37779f.getMinDurationMs(), zContains);
                boolean zM87149e = c28655q2.m87149e(m121219t(interfaceC28601c3));
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87149e || objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R3;
                boolean zM87149e2 = c28655q2.m87149e(m121219t(interfaceC28601c3)) | c28655q2.m87153g(lM121174a);
                Object objM87133R4 = c28655q2.m87133R();
                if (zM87149e2 || objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC31061c.m95647w(lM121174a == null, c28655q2);
                }
                InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R4;
                Integer numValueOf = Integer.valueOf(m121219t(interfaceC28601c3));
                boolean zM87153g = c28655q2.m87153g(lM121174a) | c28655q2.m87153g(interfaceC28601c6);
                Object objM87133R5 = c28655q2.m87133R();
                if (zM87153g || objM87133R5 == c28676v0) {
                    objM87133R5 = new a(lM121174a, interfaceC28601c6, null);
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87254h(numValueOf, lM121174a, (InterfaceC4351m) objM87133R5, c28655q2);
                Object[] objArr3 = {Integer.valueOf(m121219t(interfaceC28601c3)), Boolean.valueOf(m121224y(interfaceC28601c5)), Boolean.valueOf(m121213n(interfaceC28601c6)), Boolean.valueOf(zContains), Boolean.valueOf(m121222w(interfaceC28601c4))};
                boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87149e(iM121199T) | c28655q2.m87157i(state) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87155h(zContains) | c28655q2.m87153g(interfaceC28601c6) | c28655q2.m87157i(c37779f) | ((i15 & 896) == 256) | c28655q2.m87153g(interfaceC28601c3);
                Object objM87133R6 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R6 == c28676v0) {
                    interfaceC28601c1 = interfaceC28601c5;
                    b bVar = new b(iM121199T, state, zContains, c37779f, onViewEvent, interfaceC28601c4, interfaceC28601c1, interfaceC28601c6, interfaceC28601c3, null);
                    interfaceC28601c2 = interfaceC28601c3;
                    c28655q2.m87172p0(bVar);
                    objM87133R6 = bVar;
                } else {
                    interfaceC28601c2 = interfaceC28601c3;
                    interfaceC28601c1 = interfaceC28601c5;
                }
                AbstractC28683x.m87256j(objArr3, (InterfaceC4351m) objM87133R6, c28655q2);
                C11407v c11407v = AbstractC11333b0.f36310a;
                C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(600, 0, c11407v, 2);
                Modifier modifierM3599a = AbstractC1136a.m3599a(modifier2, "AnimatedSequence");
                C23010x c23010xM73381n = AbstractC25012a.m73381n(3, 4, C2299e.f9111N, c28655q2, 54);
                int iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM73381n);
                C0209i c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                C0209i c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c11347e2 = c11347e2M30574v;
                } else {
                    c11347e2 = c11347e2M30574v;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(r20, "AnimatedSequenceAnimation");
                    c39174fM121230f = r2.getWidth();
                    if (c39174fM121230f != null || (modifierM3409f = AbstractC1102d.m3424u(c39174fM121230f.f168413w, c2314t)) == null) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, r20);
                    }
                    Modifier modifierM3411h = AbstractC1102d.m3411h(r2.getHeight(), modifierM3599a2.mo3471e(modifierM3409f));
                    C2307m c2307m = C2299e.f9114w;
                    Modifier modifier3 = modifier2;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3411h);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    C11347e2 c11347e3 = c11347e2;
                    InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c2;
                    c28655q = c28655q2;
                    AbstractC29125c.m88520b(Integer.valueOf(m121219t(interfaceC28601c2)), null, c11347e3, "AnimatedSequenceLottie", AbstractC37817c.m121344e(1821323700, c28655q2, new C26949h(state, interfaceC28601c2, interfaceC28601c1, 26)), c28655q, 27648, 2);
                    c28655q.m87173q(true);
                    Modifier modifierM3355a = AbstractC1091c.m3355a(r20, AbstractC11348f.m30574v(600, 0, c11407v, 2), 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3355a);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    c37778e = state;
                    function1 = onViewEvent;
                    AbstractC29125c.m88520b(Integer.valueOf(m121219t(interfaceC28601c7)), null, c11347e3, "AnimatedSequenceContent", AbstractC37817c.m121344e(725885163, c28655q, new C36538d(6, c37778e, function1)), c28655q, 27648, 2);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier2 = modifier3;
                }
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(r20, "AnimatedSequenceAnimation");
                c39174fM121230f = r2.getWidth();
                if (c39174fM121230f != null) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, r20);
                } else {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, r20);
                }
                Modifier modifierM3411h2 = AbstractC1102d.m3411h(r2.getHeight(), modifierM3599a3.mo3471e(modifierM3409f));
                C2307m c2307m2 = C2299e.f9114w;
                Modifier modifier4 = modifier2;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3411h2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
                C11347e2 c11347e4 = c11347e2;
                InterfaceC28601c1 interfaceC28601c8 = interfaceC28601c2;
                c28655q = c28655q2;
                AbstractC29125c.m88520b(Integer.valueOf(m121219t(interfaceC28601c2)), null, c11347e4, "AnimatedSequenceLottie", AbstractC37817c.m121344e(1821323700, c28655q2, new C26949h(state, interfaceC28601c2, interfaceC28601c1, 26)), c28655q, 27648, 2);
                c28655q.m87173q(true);
                Modifier modifierM3355a2 = AbstractC1091c.m3355a(r20, AbstractC11348f.m30574v(600, 0, c11407v, 2), 2);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3355a2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                c37778e = state;
                function1 = onViewEvent;
                AbstractC29125c.m88520b(Integer.valueOf(m121219t(interfaceC28601c8)), null, c11347e4, "AnimatedSequenceContent", AbstractC37817c.m121344e(725885163, c28655q, new C36538d(6, c37778e, function1)), c28655q, 27648, 2);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier2 = modifier4;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c37778e = state;
        function1 = onViewEvent;
        c28655q = c28655q2;
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i18 = 1;
            final C37778e c37778e2 = c37778e;
            final Function1 function2 = function1;
            interfaceC4351m = new InterfaceC4351m() { // from class: wz0.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i18) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC37777d.m121211l(modifier2, c37778e2, function2, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC37777d.m121218s(modifier2, c37778e2, function2, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m121211l(Modifier modifier, C37778e c37778e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m121210k(modifier, c37778e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC28601c1 m121212m() {
        return AbstractC28683x.m87272z(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final boolean m121213n(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m121214o(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m121215p(C37778e c37778e, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, int i13, Composer composer, int i14) {
        int i15;
        if ((i14 & 6) == 0) {
            i15 = i14 | (((C28655q) composer).m87149e(i13) ? 4 : 2);
        } else {
            i15 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC35689r0 interfaceC35689r0M121232b = c37778e.m121229e().get(m121199T(c37778e, i13)).getLottie();
            boolean z4 = c37778e.getRepeatMode() == EnumC18104a.OFF;
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | ((i15 & 14) == 4) | c28655q.m87153g(interfaceC28601c2);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C0372h(i13, interfaceC28601c1, interfaceC28601c2);
                c28655q.m87172p0(objM87133R);
            }
            m121180A(modifierM3407d, interfaceC35689r0M121232b, i13, z4, (InterfaceC4339a) objM87133R, c28655q, ((i15 << 6) & 896) | 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m121216q(int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        if (i13 == m121219t(interfaceC28601c1)) {
            m121225z(interfaceC28601c2, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m121217r(C37778e c37778e, Function1 function1, int i13, Composer composer, int i14) {
        if ((i14 & 6) == 0) {
            i14 |= ((C28655q) composer).m87149e(i13) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C25306o c25306oM121231a = c37778e.m121229e().get(m121199T(c37778e, i13)).getContent();
            if (c25306oM121231a == null) {
                c28655q.m87150e0(-315366461);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-315366460);
                AbstractC25303l.m74290q(c25306oM121231a, null, null, function1, c28655q, 0, 6);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m121218s(Modifier modifier, C37778e c37778e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m121210k(modifier, c37778e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final int m121219t(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m121220u(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC28601c1 m121221v() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final boolean m121222w(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m121223x(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final boolean m121224y(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z */
    private static final void m121225z(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }
}

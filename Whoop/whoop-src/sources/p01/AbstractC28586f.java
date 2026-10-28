package p01;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import hb3.AbstractC17104a0;
import j93.AbstractC21478l0;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import no0.C26984y0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p718lz1.C24823a;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p01.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\b\u001a!\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lp01/b;", "viewState", "Ll83/a0;", "i", "(Landroidx/compose/ui/Modifier;Lp01/b;Landroidx/compose/runtime/Composer;II)V", "s", "(Lp01/b;Landroidx/compose/runtime/Composer;I)V", "o", "l", "Lq2/a;", "haptic", "u", "(Lp01/b;Lq2/a;Landroidx/compose/runtime/Composer;II)V", "", "animatedProgress", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28586f {

    /* JADX INFO: renamed from: p01.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.circularprogressindicator.CircularProgressIndicatorKt$CircularProgressIndicator$1$1", m100430f = "CircularProgressIndicator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f115685E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC2994c0 f115686F;

        /* JADX INFO: renamed from: w */
        int f115687w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f115688x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f115689y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C28582b f115690z;

        /* JADX INFO: renamed from: p01.f$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.circularprogressindicator.CircularProgressIndicatorKt$CircularProgressIndicator$1$1$1", m100430f = "CircularProgressIndicator.kt", m100431l = {69}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42149a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f115691w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28601c1 f115692x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C28582b f115693y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42149a(InterfaceC28601c1 interfaceC28601c1, C28582b c28582b, InterfaceC30057d<? super C42149a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f115692x = interfaceC28601c1;
                this.f115693y = c28582b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42149a(this.f115692x, this.f115693y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42149a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f115691w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f115692x.setValue(Boolean.TRUE);
                    long completionAnimationDuration = this.f115693y.getCompletionAnimationDuration() + ((long) 500);
                    this.f115691w = 1;
                    if (AbstractC3034m0.m8782b(completionAnimationDuration, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f115692x.setValue(Boolean.FALSE);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C28582b c28582b, InterfaceC28601c1 interfaceC28601c3, InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115688x = interfaceC28601c1;
            this.f115689y = interfaceC28601c2;
            this.f115690z = c28582b;
            this.f115685E = interfaceC28601c3;
            this.f115686F = interfaceC2994c0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f115688x, this.f115689y, this.f115690z, this.f115685E, this.f115686F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f115687w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!((Boolean) this.f115688x.getValue()).booleanValue()) {
                Object value = this.f115689y.getValue();
                Boolean bool = Boolean.TRUE;
                if (!AbstractC22676k.m65745e(value, bool) && AbstractC22676k.m65745e(this.f115690z.getIsCompleted(), bool)) {
                    InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f115685E.getValue();
                    if (interfaceC3027k1 != null) {
                        interfaceC3027k1.cancel((CancellationException) null);
                    }
                    this.f115685E.setValue(AbstractC3006f0.m8732z(this.f115686F, null, null, new C42149a(this.f115688x, this.f115690z, null), 3));
                }
            }
            this.f115689y.setValue(this.f115690z.getIsCompleted());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: p01.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.circularprogressindicator.CircularProgressIndicatorKt$TriggerHapticFeedback$1$1", m100430f = "CircularProgressIndicator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f115694w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f115695x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C28582b f115696y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC29805a f115697z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28601c1 interfaceC28601c1, C28582b c28582b, InterfaceC29805a interfaceC29805a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115695x = interfaceC28601c1;
            this.f115696y = c28582b;
            this.f115697z = interfaceC29805a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f115695x, this.f115696y, this.f115697z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f115694w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Object value = this.f115695x.getValue();
            Boolean bool = Boolean.TRUE;
            if (!AbstractC22676k.m65745e(value, bool) && AbstractC22676k.m65745e(this.f115696y.getIsCompleted(), bool)) {
                this.f115697z.mo7428a(0);
            }
            this.f115695x.setValue(this.f115696y.getIsCompleted());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: p01.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f115698a;

        static {
            int[] iArr = new int[EnumC28588h.values().length];
            try {
                iArr[EnumC28588h.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28588h.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f115698a = iArr;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m86944i(Modifier modifier, C28582b viewState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28582b c28582b;
        Object aVar;
        InterfaceC28601c1 interfaceC28601c1;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1845593216);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t : modifier2;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(viewState.getIsCompleted());
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            Boolean boolValueOf = Boolean.valueOf(viewState.getTriggerCompletionAnimation());
            Boolean isCompleted = viewState.getIsCompleted();
            boolean zM87157i = ((i17 & 112) == 32 || ((i17 & 64) != 0 && c28655q.m87157i(viewState))) | c28655q.m87157i(interfaceC2994c0);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                aVar = new a(interfaceC28601c3, interfaceC28601c2, viewState, interfaceC28601c4, interfaceC2994c0, null);
                interfaceC28601c1 = interfaceC28601c3;
                c28582b = viewState;
                c28655q.m87172p0(aVar);
            } else {
                interfaceC28601c1 = interfaceC28601c3;
                aVar = objM87133R5;
                c28582b = viewState;
            }
            AbstractC28683x.m87254h(boolValueOf, isCompleted, (InterfaceC4351m) aVar, c28655q);
            Modifier modifierM3419p = AbstractC1102d.m3419p(c28582b.getSize() + 3, modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            AbstractC1090b.m3351f(!((Boolean) interfaceC28601c1.getValue()).booleanValue(), AbstractC1102d.m3407d(1.0f, c2314t), AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(2030819806, c28655q, new C24823a(c28582b, 10)), c28655q, 200112, 16);
            AbstractC1090b.m3351f(((Boolean) interfaceC28601c1.getValue()).booleanValue(), AbstractC1102d.m3407d(1.0f, c2314t), AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, C28587g.f115699a.m86960b(), c28655q, 200112, 16);
            c28655q.m87173q(true);
            m86956u(c28582b, null, c28655q, (i17 >> 3) & 14, 2);
            modifier2 = modifier3;
        } else {
            c28582b = viewState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier2, c28582b, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m86945j(C28582b c28582b, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3407d);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        m86954s(c28582b, composer, 0);
        int i14 = c.f115698a[c28582b.getDisplayMode().ordinal()];
        if (i14 == 1) {
            c28655q.m87150e0(-1407786130);
            m86950o(c28582b, composer, 0);
            c28655q.m87173q(false);
        } else {
            if (i14 != 2) {
                throw AbstractC11895b.m32003v(-1407788250, c28655q, false);
            }
            c28655q.m87150e0(-1407783277);
            m86947l(c28582b, composer, 0);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m86946k(Modifier modifier, C28582b c28582b, int i13, int i14, Composer composer, int i15) {
        m86944i(modifier, c28582b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m86947l(final C28582b viewState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1533346929);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        boolean z4 = true;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            final long jMo134584toComposableColorWaAFU9c = viewState.getCompletedColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            final long jMo134584toComposableColorWaAFU9c2 = viewState.getPartialCompletedColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            final long jMo134584toComposableColorWaAFU9c3 = viewState.getRemainingColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            if ((i14 & 14) != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(viewState))) {
                z4 = false;
            }
            boolean zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c2) | z4 | c28655q.m87151f(jMo134584toComposableColorWaAFU9c) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c3);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: p01.c
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC28586f.m86948m(viewState, jMo134584toComposableColorWaAFU9c2, jMo134584toComposableColorWaAFU9c, jMo134584toComposableColorWaAFU9c3, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28584d(viewState, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m86948m(C28582b c28582b, long j7, long j13, long j14, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float f13 = 2;
        float fMo743q0 = Canvas.mo743q0(c28582b.getSize()) / f13;
        float f14 = c28582b.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() * 360.0f;
        float f15 = f13 * fMo743q0;
        InterfaceC22131e.m63380P(Canvas, c28582b.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() < 1.0f ? j7 : j13, -90.0f, f14, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() >> 32)) - fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() & 4294967295L)) - fMo743q0)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), 0.0f, new C22135i(c28582b.getStrokeWidth(), 0.0f, 1, 0, null, 26), 832);
        InterfaceC22131e.m63380P(Canvas, j14, f14 - 90.0f, 360.0f - f14, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() >> 32)) - fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() & 4294967295L)) - fMo743q0)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32), 0.0f, new C22135i(c28582b.getStrokeWidth(), 0.0f, 1, 0, null, 26), 832);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m86949n(C28582b c28582b, int i13, Composer composer, int i14) {
        m86947l(c28582b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m86950o(final C28582b viewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1333678916);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            final long jMo134584toComposableColorWaAFU9c = viewState.getCompletedColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            final long jMo134584toComposableColorWaAFU9c2 = viewState.getPartialCompletedColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            final long jMo134584toComposableColorWaAFU9c3 = viewState.getRemainingColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            final InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(viewState.getStepsCompleted() / viewState.getTotalSteps(), AbstractC11348f.m30574v(300, 0, AbstractC11333b0.f36310a, 2), "animatedProgress", null, c28655q2, 3072, 20);
            c28655q = c28655q2;
            Modifier modifierM3419p = AbstractC1102d.m3419p(viewState.getSize(), C2314t.f9131w);
            boolean zM87151f = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c3) | c28655q.m87153g(interfaceC28670t2M30588b) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c2);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: p01.e
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC28586f.m86952q(viewState, jMo134584toComposableColorWaAFU9c3, jMo134584toComposableColorWaAFU9c, jMo134584toComposableColorWaAFU9c2, interfaceC28670t2M30588b, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28584d(viewState, i13, 1);
        }
    }

    /* JADX INFO: renamed from: p */
    private static final float m86951p(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m86952q(C28582b c28582b, long j7, long j13, long j14, InterfaceC28670t2 interfaceC28670t2, InterfaceC22131e interfaceC22131e) {
        float f13;
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float f14 = 2;
        float fMo743q0 = Canvas.mo743q0(c28582b.getSize()) / f14;
        float strokeWidth = c28582b.getStrokeWidth();
        float totalSteps = 360.0f / c28582b.getTotalSteps();
        float stepsSpacing = c28582b.getTotalSteps() == 1 ? 0.0f : c28582b.getStepsSpacing();
        int totalSteps2 = c28582b.getTotalSteps();
        float f15 = -90.0f;
        int i13 = 0;
        float f16 = -90.0f;
        while (i13 < totalSteps2) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() >> 32)) - fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() & 4294967295L)) - fMo743q0)) & 4294967295L);
            float f17 = f14 * fMo743q0;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
            float f18 = strokeWidth;
            float f19 = f16;
            InterfaceC22131e.m63380P(Canvas, j7, f19, totalSteps - stepsSpacing, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, new C22135i(f18, 0.0f, 1, 0, null, 26), 832);
            f16 = f19 + totalSteps;
            i13++;
            Canvas = interfaceC22131e;
            totalSteps2 = totalSteps2;
            strokeWidth = f18;
        }
        float f24 = strokeWidth;
        float fM86951p = m86951p(interfaceC28670t2) * c28582b.getTotalSteps();
        int i14 = 0;
        for (int totalSteps3 = c28582b.getTotalSteps(); i14 < totalSteps3; totalSteps3 = totalSteps3) {
            float f25 = totalSteps - stepsSpacing;
            float f26 = fM86951p - i14;
            if (f26 <= 0.0f) {
                f13 = f15;
            } else if (c28582b.getCompletedBrush() == null || c28582b.getPartiallyCompletedBrush() == null) {
                float f27 = f15;
                long j15 = c28582b.getStepsCompleted() >= c28582b.getTotalSteps() ? j13 : j14;
                float f28 = f14 * fMo743q0;
                InterfaceC22131e.m63380P(interfaceC22131e, j15, f27, AbstractC12889b.m36283m(f26, 0.0f, 1.0f) * f25, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() >> 32)) - fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)) - fMo743q0)) & 4294967295L), (((long) Float.floatToRawIntBits(f28)) << 32) | (((long) Float.floatToRawIntBits(f28)) & 4294967295L), 0.0f, new C22135i(f24, 0.0f, 1, 0, null, 26), 832);
                f13 = f27;
            } else {
                AbstractC17911t completedBrush = c28582b.getStepsCompleted() >= c28582b.getTotalSteps() ? c28582b.getCompletedBrush() : c28582b.getPartiallyCompletedBrush();
                float f29 = f14 * fMo743q0;
                float f34 = f15;
                InterfaceC22131e.m63381X(interfaceC22131e, completedBrush, f34, AbstractC12889b.m36283m(f26, 0.0f, 1.0f) * f25, false, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() >> 32)) - fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)) - fMo743q0)) & 4294967295L), (((long) Float.floatToRawIntBits(f29)) << 32) | (((long) Float.floatToRawIntBits(f29)) & 4294967295L), new C22135i(f24, 0.0f, 1, 0, null, 26), 0, 832);
                f13 = f34;
            }
            i14++;
            f15 = f13 + totalSteps;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m86953r(C28582b c28582b, int i13, Composer composer, int i14) {
        m86950o(c28582b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m86954s(C28582b viewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C17919x c17919xM31989h;
        long white70;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1471241669);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            long jMo134584toComposableColorWaAFU9c = viewState.getCompletedColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            String labelText = viewState.getLabelText();
            if (labelText == null) {
                int i15 = c.f115698a[viewState.getDisplayMode().ordinal()];
                if (i15 == 1) {
                    labelText = AbstractC12889b.m36284n(viewState.getStepsCompleted(), 0, viewState.getTotalSteps()) + "/" + viewState.getTotalSteps();
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    labelText = AbstractC31061c.m95635k(AbstractC12889b.m36284n((int) (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() * 100), 0, 100), "%");
                }
            }
            EnumC39333f labelTextColor = viewState.getLabelTextColor();
            C17919x c17919xM31989h2 = null;
            if (labelTextColor == null) {
                c28655q2.m87150e0(-380191959);
                c28655q2.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q2.m87150e0(819019736);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, labelTextColor.mo134584toComposableColorWaAFU9c(c28655q2, 0));
            }
            if (c17919xM31989h == null) {
                c28655q2.m87150e0(-380144404);
                Boolean isCompleted = viewState.getIsCompleted();
                if (isCompleted == null) {
                    c28655q2.m87150e0(-380144405);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-380144404);
                    if (isCompleted.booleanValue()) {
                        c28655q2.m87150e0(-316778773);
                        c28655q2.m87173q(false);
                        white70 = jMo134584toComposableColorWaAFU9c;
                    } else {
                        c28655q2.m87150e0(-316777564);
                        white70 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                        c28655q2.m87173q(false);
                    }
                    c17919xM31989h2 = AbstractC11895b.m31989h(c28655q2, false, white70);
                }
                c28655q2.m87173q(false);
                c17919xM31989h = c17919xM31989h2;
            } else {
                c28655q2.m87150e0(819019038);
                c28655q2.m87173q(false);
            }
            if (c17919xM31989h == null) {
                c28655q2.m87150e0(-380052489);
                int i16 = c.f115698a[viewState.getDisplayMode().ordinal()];
                if (i16 == 1) {
                    if (viewState.getStepsCompleted() >= viewState.getTotalSteps()) {
                        c28655q2.m87150e0(1440521927);
                    } else {
                        c28655q2.m87150e0(1440523136);
                        jMo134584toComposableColorWaAFU9c = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                    }
                    c28655q2.m87173q(false);
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() >= 1.0f) {
                        c28655q2.m87150e0(1440525671);
                    } else {
                        c28655q2.m87150e0(1440526880);
                        jMo134584toComposableColorWaAFU9c = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                    }
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(819019368);
                c28655q2.m87173q(false);
                jMo134584toComposableColorWaAFU9c = c17919xM31989h.f69639a;
            }
            c28655q = c28655q2;
            AbstractC30795n.m94707h(labelText, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, viewState.getLabelTextStyle(), null, c28655q, 0, 0, 196090);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28584d(viewState, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m86955t(C28582b c28582b, int i13, Composer composer, int i14) {
        m86954s(c28582b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX INFO: renamed from: u */
    public static final void m86956u(C28582b viewState, InterfaceC29805a interfaceC29805a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC29805a interfaceC29805a2;
        InterfaceC29805a interfaceC29805a3;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87157i;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1391355730);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= ((i14 & 2) == 0 && c28655q.m87157i(interfaceC29805a)) ? 32 : 16;
        }
        boolean z4 = true;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 2) != 0) {
                    interfaceC29805a3 = (InterfaceC29805a) c28655q.m87161k(AbstractC2453v1.f9573l);
                    i15 &= -113;
                }
                c28655q.m87175r();
                if (viewState.getTriggerHapticOnCompletion()) {
                    c28655q.m87150e0(851015235);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(viewState.getIsCompleted());
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    Boolean isCompleted = viewState.getIsCompleted();
                    if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q.m87157i(viewState))) {
                        z4 = false;
                    }
                    zM87157i = c28655q.m87157i(interfaceC29805a3) | z4;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new b(interfaceC28601c1, viewState, interfaceC29805a3, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, isCompleted);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(851369844);
                    c28655q.m87173q(false);
                }
                interfaceC29805a2 = interfaceC29805a3;
            } else {
                c28655q.m87138X();
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
            }
            interfaceC29805a3 = interfaceC29805a;
            c28655q.m87175r();
            if (viewState.getTriggerHapticOnCompletion()) {
                c28655q.m87150e0(851015235);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getIsCompleted());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                Boolean isCompleted2 = viewState.getIsCompleted();
                if ((i15 & 14) != 4) {
                    z4 = false;
                }
                zM87157i = c28655q.m87157i(interfaceC29805a3) | z4;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new b(interfaceC28601c1, viewState, interfaceC29805a3, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new b(interfaceC28601c1, viewState, interfaceC29805a3, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, isCompleted2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(851369844);
                c28655q.m87173q(false);
            }
            interfaceC29805a2 = interfaceC29805a3;
        } else {
            c28655q.m87138X();
            interfaceC29805a2 = interfaceC29805a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(viewState, i13, interfaceC29805a2, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m86957v(C28582b c28582b, InterfaceC29805a interfaceC29805a, int i13, int i14, Composer composer, int i15) {
        m86956u(c28582b, interfaceC29805a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

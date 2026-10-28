package kd1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ig0.C18464d;
import jp2.C21881l;
import l83.C23454a0;
import p184h5.C16888l;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: kd1.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001aA\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006.\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/lifecycle/v;", "lifecycleEvent", "Lkotlin/Function3;", "Lbc3/c0;", "Landroidx/lifecycle/x;", "Lq83/d;", "Ll83/a0;", "", "block", "d", "(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "", "predicate", "", "alphaWhenVisible", "j", "(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;", "latestEffectBlock", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22392e {

    /* JADX INFO: renamed from: kd1.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.util.ComposeUtilKt$LifecycleEffect$1$1$observer$1$1", m100430f = "ComposeUtil.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87620w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f87621x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC1585g0 f87622y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f87623z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1585g0 interfaceC1585g0, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87622y = interfaceC1585g0;
            this.f87623z = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f87622y, this.f87623z, interfaceC30057d);
            aVar.f87621x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f87621x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87620w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function3 function3M64444e = AbstractC22392e.m64444e(this.f87623z);
                AbstractC1638x lifecycle = this.f87622y.getLifecycle();
                this.f87621x = null;
                this.f87620w = 1;
                if (function3M64444e.invoke(interfaceC2994c0, lifecycle, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kd1.e$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"kd1/e$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f87624a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f87625b;

        public b(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f87624a = interfaceC1585g0;
            this.f87625b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f87624a.getLifecycle().mo4988d(this.f87625b);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m64443d(EnumC1632v lifecycleEvent, Function3 block, Composer composer, int i13) {
        int i14;
        EnumC1632v enumC1632v;
        AbstractC22676k.m65750j(lifecycleEvent, "lifecycleEvent");
        AbstractC22676k.m65750j(block, "block");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-222875699);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(lifecycleEvent.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(block) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(block, c28655q);
            AbstractC1638x lifecycle = interfaceC1585g0.getLifecycle();
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | ((i14 & 14) == 4) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87157i(interfaceC1585g0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                enumC1632v = lifecycleEvent;
                C21881l c21881l = new C21881l((Object) interfaceC1585g0, (Object) enumC1632v, (Object) interfaceC2994c0, interfaceC28601c1M87238F, 2);
                c28655q.m87172p0(c21881l);
                objM87133R2 = c21881l;
            } else {
                enumC1632v = lifecycleEvent;
            }
            AbstractC28683x.m87251e(lifecycle, (Function1) objM87133R2, c28655q);
        } else {
            enumC1632v = lifecycleEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(enumC1632v, block, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Function3 m64444e(InterfaceC28670t2 interfaceC28670t2) {
        return (Function3) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC28620h0 m64445f(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v, InterfaceC2994c0 interfaceC2994c0, InterfaceC28670t2 interfaceC28670t2, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C16888l c16888l = new C16888l(enumC1632v, interfaceC2994c0, interfaceC28670t2, 1);
        interfaceC1585g0.getLifecycle().mo4986a(c16888l);
        return new b(interfaceC1585g0, c16888l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m64446g(EnumC1632v enumC1632v, InterfaceC2994c0 interfaceC2994c0, InterfaceC28670t2 interfaceC28670t2, InterfaceC1585g0 lifecycleOwner, EnumC1632v event) {
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(event, "event");
        if (event == enumC1632v) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(lifecycleOwner, interfaceC28670t2, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m64447h(EnumC1632v enumC1632v, Function3 function3, int i13, Composer composer, int i14) {
        m64443d(enumC1632v, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final Modifier m64449j(Modifier modifier, boolean z4, float f13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        if (z4) {
            f13 = 0.0f;
        }
        return AbstractC34132o.m107879c(f13, modifier);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Modifier m64450k(Modifier modifier, boolean z4, float f13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 1.0f;
        }
        return m64449j(modifier, z4, f13);
    }
}

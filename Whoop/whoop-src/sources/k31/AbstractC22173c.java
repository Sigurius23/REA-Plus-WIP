package k31;

import androidx.compose.runtime.Composer;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d71.C11757c;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: k31.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lk31/d;", "replayViewState", "Ll83/a0;", "b", "(Lk31/d;Landroidx/compose/runtime/Composer;I)V", "", "expand", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22173c {

    /* JADX INFO: renamed from: k31.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.replay.ReplayKt$Replay$1$1$1", m100430f = "Replay.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f85988w;

        /* JADX INFO: renamed from: x */
        int f85989x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22174d f85990y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f85991z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22174d c22174d, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85990y = c22174d;
            this.f85991z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f85990y, this.f85991z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC28601c1 interfaceC28601c1;
            InterfaceC28601c1 interfaceC28601c2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f85989x;
            boolean z4 = true;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC28601c1 = this.f85991z;
                if (!this.f85990y.getIsExpanded()) {
                    z4 = false;
                } else if (this.f85990y.getShouldAnimateReplayButton()) {
                    this.f85988w = interfaceC28601c1;
                    this.f85989x = 1;
                    if (AbstractC3034m0.m8782b(750L, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    interfaceC28601c2 = interfaceC28601c1;
                }
                AbstractC22173c.m63472d(interfaceC28601c1, z4);
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC28601c2 = (InterfaceC28601c1) this.f85988w;
            AbstractC34132o.m107864I(obj);
            interfaceC28601c1 = interfaceC28601c2;
            AbstractC22173c.m63472d(interfaceC28601c1, z4);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m63470b(C22174d replayViewState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(replayViewState, "replayViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2066549501);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(replayViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            if (replayViewState.getIsExpanded() && !replayViewState.getShouldAnimateReplayButton()) {
                z4 = true;
            }
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(z4, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM87153g = c28655q.m87153g(replayViewState);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new a(replayViewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, replayViewState);
            AbstractC22172b.m63464e(replayViewState.getPrimaryIcon(), replayViewState.getPrimaryText(), m63471c(interfaceC28601c1), replayViewState.getOnEvent(), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(replayViewState, i13, 29);
        }
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m63471c(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m63472d(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m63473e(C22174d c22174d, int i13, Composer composer, int i14) {
        m63470b(c22174d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

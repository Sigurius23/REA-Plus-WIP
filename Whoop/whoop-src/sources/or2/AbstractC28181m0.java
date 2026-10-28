package or2;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: or2.m0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aO\u0010\u000b\u001a\u00020\b*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lbc3/c0;", "Lec3/p1;", "Lbc3/k1;", "job", "Lq83/j;", "context", "Lkotlin/Function2;", "Lq83/d;", "Ll83/a0;", "", "runJob", "a", "(Lbc3/c0;Lec3/p1;Lq83/j;Lc93/m;)V", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28181m0 {

    /* JADX INFO: renamed from: or2.m0$a */
    @InterfaceC32271e(m100429c = "com.whoop.util.JobUtilKt$launchUniqueJob$1", m100430f = "JobUtil.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113897w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113898x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4351m f113899y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113899y = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f113899y, interfaceC30057d);
            aVar.f113898x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f113898x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113897w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC4351m interfaceC4351m = this.f113899y;
                this.f113898x = null;
                this.f113897w = 1;
                if (interfaceC4351m.invoke(interfaceC2994c0, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: a */
    public static final void m85297a(InterfaceC2994c0 interfaceC2994c0, InterfaceC13075p1 job, InterfaceC30063j context, InterfaceC4351m runJob) {
        InterfaceC3027k1 interfaceC3027k1;
        AbstractC22676k.m65750j(interfaceC2994c0, "<this>");
        AbstractC22676k.m65750j(job, "job");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(runJob, "runJob");
        C13045h2 c13045h2 = (C13045h2) job;
        InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) c13045h2.getValue();
        if (interfaceC3027k2 != null && interfaceC3027k2.isActive() && (interfaceC3027k1 = (InterfaceC3027k1) c13045h2.getValue()) != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        c13045h2.m36571k(null, AbstractC3006f0.m8732z(interfaceC2994c0, context, null, new a(runJob, null), 2));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m85298b(InterfaceC2994c0 interfaceC2994c0, InterfaceC13075p1 interfaceC13075p1, InterfaceC30063j interfaceC30063j, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC30063j = C30064k.f122676w;
        }
        m85297a(interfaceC2994c0, interfaceC13075p1, interfaceC30063j, interfaceC4351m);
    }
}

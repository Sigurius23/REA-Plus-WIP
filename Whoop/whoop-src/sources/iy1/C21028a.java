package iy1;

import java.util.Iterator;
import java.util.Set;
import jy1.C22047a;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: iy1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000e"}, m65681d2 = {"Liy1/a;", "Liy1/c;", "", "writers", "<init>", "(Ljava/util/Set;)V", "Ljy1/a;", "metric", "Ll83/a0;", "a", "(Ljy1/a;Lq83/d;)Ljava/lang/Object;", "b", "(Ljy1/a;)V", "Ljava/util/Set;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21028a implements InterfaceC21030c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<InterfaceC21030c> writers;

    /* JADX INFO: renamed from: iy1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.domain.CompositeMetricWriter", m100430f = "CompositeMetricWriter.kt", m100431l = {8}, m100432m = "insertMetricToCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f79606E;

        /* JADX INFO: renamed from: F */
        int f79607F;

        /* JADX INFO: renamed from: G */
        int f79608G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f79609H;

        /* JADX INFO: renamed from: J */
        int f79611J;

        /* JADX INFO: renamed from: w */
        Object f79612w;

        /* JADX INFO: renamed from: x */
        Object f79613x;

        /* JADX INFO: renamed from: y */
        Object f79614y;

        /* JADX INFO: renamed from: z */
        Object f79615z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79609H = obj;
            this.f79611J |= Integer.MIN_VALUE;
            return C21028a.this.mo58700a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21028a(Set<? extends InterfaceC21030c> writers) {
        AbstractC22676k.m65750j(writers, "writers");
        this.writers = writers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iy1.InterfaceC21030c
    /* JADX INFO: renamed from: a */
    public Object mo58700a(C22047a c22047a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        Iterator it;
        int i13;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f79611J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f79611J = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f79609H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar.f79611J;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            it = this.writers.iterator();
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = aVar.f79607F;
            it = (Iterator) aVar.f79614y;
            C22047a c22047a2 = (C22047a) aVar.f79612w;
            AbstractC34132o.m107864I(obj);
            i13 = i16;
            c22047a = c22047a2;
        }
        while (it.hasNext()) {
            InterfaceC21030c interfaceC21030c = (InterfaceC21030c) it.next();
            aVar.f79612w = c22047a;
            aVar.f79613x = null;
            aVar.f79614y = it;
            aVar.f79615z = null;
            aVar.f79606E = null;
            aVar.f79607F = i13;
            aVar.f79608G = 0;
            aVar.f79611J = 1;
            if (interfaceC21030c.mo58700a(c22047a, aVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    @Override // iy1.InterfaceC21030c
    /* JADX INFO: renamed from: b */
    public void mo58701b(C22047a metric) {
        AbstractC22676k.m65750j(metric, "metric");
        Iterator<T> it = this.writers.iterator();
        while (it.hasNext()) {
            ((InterfaceC21030c) it.next()).mo58701b(metric);
        }
    }
}

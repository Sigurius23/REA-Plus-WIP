package p605x6;

import android.content.Context;
import androidx.room.ExecutorC1834u1;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import p080d4.C11653l;
import p218ic.C18373n0;
import p218ic.EnumC18371m0;
import p249jc.C21596v;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p537ux.C35331f0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30599e;
import q83.AbstractC30060g;
import r51.C30936d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sc.C32352b;
import sc.InterfaceC32351a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: x6.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C38014s {

    /* JADX INFO: renamed from: a */
    public static final C35331f0 f162837a = new C35331f0(5);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m121745a(Context context, String name, AbstractC32269c abstractC32269c) {
        C38019x c38019x;
        if (abstractC32269c instanceof C38019x) {
            c38019x = (C38019x) abstractC32269c;
            int i13 = c38019x.f162853y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38019x.f162853y = i13 - Integer.MIN_VALUE;
            } else {
                c38019x = new C38019x(this, abstractC32269c);
            }
        } else {
            c38019x = new C38019x(this, abstractC32269c);
        }
        Object objM108238x = c38019x.f162851w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38019x.f162853y;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108238x);
            AbstractC22676k.m65750j(context, "context");
            C21596v c21596vM60637g = C21596v.m60637g(context);
            WorkDatabase workDatabase = c21596vM60637g.f82807c;
            InterfaceC32351a executor = c21596vM60637g.f82808d;
            AbstractC22676k.m65750j(workDatabase, "<this>");
            AbstractC22676k.m65750j(executor, "executor");
            AbstractC22676k.m65750j(name, "name");
            C30936d c30936d = new C30936d(name, 1);
            ExecutorC1834u1 executorC1834u1 = ((C32352b) executor).f133915a;
            AbstractC22676k.m65749i(executorC1834u1, "getSerialTaskExecutor(...)");
            C11653l c11653lM92129t = AbstractC30060g.m92129t(executorC1834u1, "loadStatusFuture", new C30599e(13, c30936d, workDatabase));
            c38019x.f162853y = 1;
            objM108238x = AbstractC34235f.m108238x(c11653lM92129t, c38019x);
            if (objM108238x == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108238x);
        }
        List list = (List) objM108238x;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (AbstractC37056f.m118959K(EnumC18371m0.f71516x, EnumC18371m0.f71515w).contains(((C18373n0) list.get(i15)).f71521b)) {
                return Boolean.valueOf(z4);
            }
        }
        z4 = false;
        return Boolean.valueOf(z4);
    }
}

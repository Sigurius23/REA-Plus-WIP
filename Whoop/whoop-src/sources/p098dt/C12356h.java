package p098dt;

import aa3.C0627i1;
import bc3.AbstractC3006f0;
import gt.C16177p;
import gt.InterfaceC16166e;
import java.util.concurrent.Executor;
import p155ft.InterfaceC14761a;
import p155ft.InterfaceC14762b;
import p155ft.InterfaceC14763c;
import p155ft.InterfaceC14764d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dt.h */
/* JADX INFO: loaded from: classes.dex */
public final class C12356h implements InterfaceC16166e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f41532w;

    /* JADX INFO: renamed from: x */
    public static final C12356h f41529x = new C12356h(0);

    /* JADX INFO: renamed from: y */
    public static final C12356h f41530y = new C12356h(1);

    /* JADX INFO: renamed from: z */
    public static final C12356h f41531z = new C12356h(2);

    /* JADX INFO: renamed from: E */
    public static final C12356h f41528E = new C12356h(3);

    public /* synthetic */ C12356h(int i13) {
        this.f41532w = i13;
    }

    @Override // gt.InterfaceC16166e
    /* JADX INFO: renamed from: f */
    public final Object mo7223f(C0627i1 c0627i1) {
        switch (this.f41532w) {
            case 0:
                Object objMo1624h = c0627i1.mo1624h(new C16177p(InterfaceC14761a.class, Executor.class));
                AbstractC22676k.m65749i(objMo1624h, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC3006f0.m8723q((Executor) objMo1624h);
            case 1:
                Object objMo1624h2 = c0627i1.mo1624h(new C16177p(InterfaceC14763c.class, Executor.class));
                AbstractC22676k.m65749i(objMo1624h2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC3006f0.m8723q((Executor) objMo1624h2);
            case 2:
                Object objMo1624h3 = c0627i1.mo1624h(new C16177p(InterfaceC14762b.class, Executor.class));
                AbstractC22676k.m65749i(objMo1624h3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC3006f0.m8723q((Executor) objMo1624h3);
            default:
                Object objMo1624h4 = c0627i1.mo1624h(new C16177p(InterfaceC14764d.class, Executor.class));
                AbstractC22676k.m65749i(objMo1624h4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC3006f0.m8723q((Executor) objMo1624h4);
        }
    }
}

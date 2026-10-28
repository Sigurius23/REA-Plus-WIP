package sr2;

import android.app.Application;
import gb.C15660u;
import hf3.C17239a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import nd1.AbstractC26585k;
import nf3.C26669a;
import nf3.C26670b;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.KoinAppAlreadyStartedException;
import p005a3.C0271z0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf3.C29155a;
import tf3.C33768a;
import v63.AbstractC35744b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sr2.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Landroid/app/Application;", "application", "Lnf3/b;", "a", "(Landroid/app/Application;)Lnf3/b;", "", "Ltf3/a;", "Ljava/util/List;", "getCommonModules", "()Ljava/util/List;", "commonModules", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32929k {

    /* JADX INFO: renamed from: a */
    private static final List<C33768a> f137216a = AbstractC26585k.m79057a(C32925g.f137209a.m103752b());

    /* JADX INFO: renamed from: a */
    public static final C26670b m103807a(Application application) {
        C26670b c26670b;
        AbstractC22676k.m65750j(application, "application");
        synchronized (C29155a.f118016a) {
            c26670b = new C26670b();
            if (C29155a.f118017b != null) {
                throw new KoinAppAlreadyStartedException();
            }
            C29155a.f118017b = c26670b.f106049a;
            m103808b(application, c26670b);
            c26670b.m79358a();
        }
        return c26670b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    private static final C23454a0 m103808b(Application androidContext, C26670b startKoin) throws DefinitionOverrideException {
        AbstractC22676k.m65750j(startKoin, "$this$startKoin");
        C26669a c26669a = startKoin.f106049a;
        C17239a c17239a = new C17239a(0);
        c26669a.getClass();
        c26669a.f106048c = c17239a;
        AbstractC22676k.m65750j(androidContext, "androidContext");
        if (c26669a.f106048c.m92137D(2)) {
            c26669a.f106048c.m92136C("[init] declare Android Context");
        }
        C15660u c15660u = new C15660u(androidContext, 1);
        C33768a c33768a = new C33768a();
        c15660u.invoke(c33768a);
        c26669a.m79357a(AbstractC37056f.m118958J(c33768a), true);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f137216a);
        arrayList.addAll(AbstractC32933o.m103888a());
        if (c26669a.f106048c.m92137D(2)) {
            double dM113233f = AbstractC35744b.m113233f(new C0271z0(20, startKoin, arrayList));
            int size = ((ConcurrentHashMap) c26669a.f106047b.f132769x).size();
            c26669a.f106048c.m92136C("loaded " + size + " definitions - " + dM113233f + " ms");
        } else {
            c26669a.m79357a(arrayList, startKoin.f106050b);
        }
        return C23454a0.f92919a;
    }
}

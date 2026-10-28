package p715kotlin.reflect.jvm.internal;

import androidx.profileinstaller.ProfileVerifier;
import ch3.C4685h;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5101l0;
import dc3.C11934s;
import fa3.AbstractC14325r;
import fa3.C14303b;
import fa3.C14319l;
import fa3.C14326s;
import fa3.C14329v;
import fa3.EnumC14304b0;
import ga3.C15630h;
import hb3.C17119i;
import hb3.C17121j;
import ia3.C18295a;
import ia3.C18296b;
import ia3.C18298d;
import ib3.C18342a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kb3.C22342k;
import kb3.InterfaceC22344m;
import l83.C23454a0;
import l83.C23461g;
import lb3.C23783k;
import m83.AbstractC25260n;
import m83.C25271y;
import mb3.C25393j;
import mb3.C25395l;
import mb3.InterfaceC25394k;
import o93.AbstractC27736h;
import o93.C27739k;
import o93.C27740l;
import oa3.C27763f;
import oa3.C27764g;
import p014aj.C0928c;
import p014aj.C0929d;
import p037bu.C3632c;
import p249jc.C21565a;
import p249jc.C21567b;
import p437qt.C30582e;
import p474s.C31983m2;
import p581we.C37199o;
import p692zt.C41113q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p93.C29022a;
import q93.C30083g;
import q93.C30086j;
import q93.C30092p;
import q93.C30094r;
import q93.EnumC30084h;
import r93.C31161v0;
import r93.InterfaceC31109b0;
import sa3.C32331e;
import t93.C33665a;
import t93.InterfaceC33666b;
import t93.InterfaceC33668d;
import u93.C34671d0;
import u93.C34673e0;
import u93.C34688m;
import ua3.C34727g;
import va3.C35850h;
import w93.C36971d;
import w93.C36972e;
import wb3.AbstractC37056f;
import x93.AbstractC38109c;
import z93.C40211b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ljava/lang/Class;", "Lw93/e;", "getOrCreateModule", "(Ljava/lang/Class;)Lw93/e;", "Ll83/a0;", "clearModuleByClassLoaderCache", "()V", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "Ljava/lang/ref/WeakReference;", "moduleByClassLoader", "Ljava/util/concurrent/ConcurrentMap;", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ModuleByClassLoaderKt {
    private static final ConcurrentMap<WeakClassLoaderBox, WeakReference<C36972e>> moduleByClassLoader = new ConcurrentHashMap();

    public static final void clearModuleByClassLoaderCache() {
        moduleByClassLoader.clear();
    }

    public static final C36972e getOrCreateModule(Class<?> cls) {
        InterfaceC33666b interfaceC33666bM92215K;
        InterfaceC33668d interfaceC33668dM92215K;
        WeakClassLoaderBox weakClassLoaderBox;
        ClassLoader classLoader;
        AbstractC22676k.m65750j(cls, "<this>");
        ClassLoader classLoaderM122092d = AbstractC38109c.m122092d(cls);
        WeakClassLoaderBox weakClassLoaderBox2 = new WeakClassLoaderBox(classLoaderM122092d);
        ConcurrentMap<WeakClassLoaderBox, WeakReference<C36972e>> concurrentMap = moduleByClassLoader;
        WeakReference<C36972e> weakReference = concurrentMap.get(weakClassLoaderBox2);
        if (weakReference != null) {
            C36972e c36972e = weakReference.get();
            if (c36972e != null) {
                return c36972e;
            }
            concurrentMap.remove(weakClassLoaderBox2, weakReference);
        }
        C17121j c17121j = C17121j.f65758d;
        C0929d c0929d = new C0929d(classLoaderM122092d);
        ClassLoader classLoader2 = C23454a0.class.getClassLoader();
        AbstractC22676k.m65749i(classLoader2, "getClassLoader(...)");
        C0929d c0929d2 = new C0929d(classLoader2);
        C0928c c0928c = new C0928c(classLoaderM122092d, 26);
        String moduleName = "runtime module for " + classLoaderM122092d;
        C36971d c36971d = C36971d.f158230b;
        C36971d c36971d2 = C36971d.f158231c;
        AbstractC22676k.m65750j(moduleName, "moduleName");
        C22342k c22342k = new C22342k("DeserializationComponentsForJava.ModuleData");
        EnumC30084h[] enumC30084hArr = EnumC30084h.f122783w;
        C30086j c30086j = new C30086j(c22342k);
        C34673e0 c34673e0 = new C34673e0(C35850h.m113816g("<" + moduleName + '>'), c22342k, c30086j, 56);
        InterfaceC22344m interfaceC22344m = c22342k.f87184a;
        interfaceC22344m.lock();
        try {
            if (c30086j.f111790a != null) {
                throw new AssertionError("Built-ins module is already set: " + c30086j.f111790a + " (attempting to reset to " + c34673e0 + ")");
            }
            c30086j.f111790a = c34673e0;
            interfaceC22344m.unlock();
            int i13 = 1;
            c30086j.f122786f = new C27739k(c34673e0, i13);
            C27763f c27763f = new C27763f();
            C0929d c0929d3 = new C0929d();
            C41113q c41113q = new C41113q(c22342k, c34673e0);
            C27764g c27764g = C27764g.f111955c;
            C23461g c23461g = new C23461g(1, 9, 0);
            C14326s c14326s = AbstractC14325r.f52292d;
            C23461g c23461g2 = c14326s.f52295b;
            EnumC14304b0 globalReportLevel = (c23461g2 == null || c23461g2.f92932y - c23461g.f92932y > 0) ? c14326s.f52294a : c14326s.f52296c;
            AbstractC22676k.m65750j(globalReportLevel, "globalReportLevel");
            C4685h c4685h = new C4685h(new C14329v(globalReportLevel, globalReportLevel == EnumC14304b0.WARN ? null : globalReportLevel), new C11934s(c23461g, i13));
            C15630h c15630h = C15630h.f58668c;
            C15630h c15630h2 = C15630h.f58666a;
            C30582e c30582e = new C30582e(c22342k);
            C27740l c27740l = new C27740l(c34673e0, c41113q);
            C14303b c14303b = new C14303b(c4685h);
            C18296b c18296b = C18296b.f71247a;
            C21567b c21567b = new C21567b(new C21565a(11));
            InterfaceC25394k.f99489b.getClass();
            C25395l c25395l = C25393j.f99488b;
            C18298d c18298d = new C18298d(new C18295a(c22342k, c0928c, c0929d, c27763f, c15630h, c36971d, c15630h2, c30582e, c36971d2, c0929d3, c27764g, C31161v0.f128379x, C40211b.f173631a, c34673e0, c27740l, c14303b, c21567b, C14319l.f52275a, c18296b, c25395l, c4685h, new C27764g()));
            C32331e metadataVersion = C32331e.f133827g;
            AbstractC22676k.m65750j(metadataVersion, "metadataVersion");
            C5101l0 c5101l0 = new C5101l0(c0929d, c27763f, false, 27);
            C5099k0 c5099k0 = new C5099k0();
            c5099k0.f21439x = c0929d;
            WeakClassLoaderBox weakClassLoaderBox3 = weakClassLoaderBox2;
            int i14 = 12;
            c5099k0.f21440y = c22342k.m64223b(new C11934s(c5099k0, i14));
            c5099k0.f21441z = c34673e0;
            c5099k0.f21436E = c41113q;
            c5099k0.f21437F = new C37199o((InterfaceC31109b0) c34673e0, c41113q);
            c5099k0.f21438w = C32331e.f133827g;
            c5099k0.f21438w = metadataVersion;
            List listM118958J = AbstractC37056f.m118958J(C23783k.f94164a);
            AbstractC27736h abstractC27736h = c34673e0.f146045E;
            C30086j c30086j2 = abstractC27736h instanceof C30086j ? (C30086j) abstractC27736h : null;
            C27764g c27764g2 = C27764g.f111954b;
            if (c30086j2 == null || (interfaceC33666bM92215K = c30086j2.m92215K()) == null) {
                interfaceC33666bM92215K = C33665a.f140610b;
            }
            if (c30086j2 == null || (interfaceC33668dM92215K = c30086j2.m92215K()) == null) {
                interfaceC33668dM92215K = C33665a.f140612d;
            }
            C17119i c17119i = new C17119i(c22342k, c34673e0, c5101l0, c5099k0, c18298d, c36971d, c27764g2, C25271y.f99162w, c41113q, interfaceC33666bM92215K, interfaceC33668dM92215K, C34727g.f146269a, c25395l, new C30582e(c22342k), listM118958J, c17121j);
            c27763f.f111953a = c17119i;
            c0929d3.f3422w = new C3632c(c18298d);
            C30092p additionalClassPartsProvider = c30086j.m92215K();
            C30092p platformDependentDeclarationFilter = c30086j.m92215K();
            C30582e c30582e2 = new C30582e(c22342k);
            AbstractC22676k.m65750j(additionalClassPartsProvider, "additionalClassPartsProvider");
            AbstractC22676k.m65750j(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
            C30094r c30094r = new C30094r(c22342k, c0929d2, c34673e0);
            C0928c c0928c2 = new C0928c(c30094r, i14);
            C18342a c18342a = C18342a.f71436m;
            c30094r.f122809c = new C17119i(c22342k, c34673e0, c0928c2, new C5101l0(c34673e0, c41113q, c18342a), c30094r, AbstractC37056f.m118959K(new C29022a(c22342k, c34673e0), new C30083g(c22342k, c34673e0)), c41113q, additionalClassPartsProvider, platformDependentDeclarationFilter, c18342a.f59017a, c25395l, c30582e2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
            c34673e0.f146048H = new C34671d0(AbstractC25260n.m74049W0(new C34673e0[]{c34673e0}));
            c34673e0.f146049I = new C34688m(AbstractC37056f.m118959K(c18298d, c30094r), "CompositeProvider@RuntimeModuleData for " + c34673e0);
            C31983m2 c31983m2 = new C31983m2();
            c31983m2.f132768w = c27763f;
            c31983m2.f132769x = c0929d;
            c31983m2.f132770y = new ConcurrentHashMap();
            C36972e c36972e2 = new C36972e(c17119i, c31983m2);
            while (true) {
                try {
                    ConcurrentMap<WeakClassLoaderBox, WeakReference<C36972e>> concurrentMap2 = moduleByClassLoader;
                    weakClassLoaderBox = weakClassLoaderBox3;
                    try {
                        WeakReference<C36972e> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(weakClassLoaderBox, new WeakReference<>(c36972e2));
                        if (weakReferencePutIfAbsent == null) {
                            weakClassLoaderBox.setTemporaryStrongRef(null);
                            return c36972e2;
                        }
                        classLoader = null;
                        try {
                            C36972e c36972e3 = weakReferencePutIfAbsent.get();
                            if (c36972e3 != null) {
                                weakClassLoaderBox.setTemporaryStrongRef(null);
                                return c36972e3;
                            }
                            concurrentMap2.remove(weakClassLoaderBox, weakReferencePutIfAbsent);
                            weakClassLoaderBox3 = weakClassLoaderBox;
                        } catch (Throwable th3) {
                            th = th3;
                            weakClassLoaderBox.setTemporaryStrongRef(classLoader);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        classLoader = null;
                        weakClassLoaderBox.setTemporaryStrongRef(classLoader);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    weakClassLoaderBox = weakClassLoaderBox3;
                }
            }
        } catch (Throwable th6) {
            try {
                c22342k.f87185b.getClass();
                throw th6;
            } catch (Throwable th7) {
                interfaceC22344m.unlock();
                throw th7;
            }
        }
    }
}

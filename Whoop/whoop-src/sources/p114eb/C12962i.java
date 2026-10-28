package p114eb;

import android.os.Bundle;
import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import l83.InterfaceC23462h;
import p002a0.C0022g;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eb.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C12962i implements InterfaceC23462h {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21461d f44774w;

    /* JADX INFO: renamed from: x */
    public final AbstractC22680m f44775x;

    /* JADX INFO: renamed from: y */
    public InterfaceC12959h f44776y;

    /* JADX WARN: Multi-variable type inference failed */
    public C12962i(InterfaceC21461d navArgsClass, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(navArgsClass, "navArgsClass");
        this.f44774w = navArgsClass;
        this.f44775x = (AbstractC22680m) interfaceC4339a;
    }

    @Override // l83.InterfaceC23462h
    /* JADX INFO: renamed from: b */
    public final boolean mo5046b() {
        return this.f44776y != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // l83.InterfaceC23462h
    public final Object getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        InterfaceC12959h interfaceC12959h = this.f44776y;
        if (interfaceC12959h != null) {
            return interfaceC12959h;
        }
        Bundle bundle = (Bundle) this.f44775x.invoke();
        C0022g c0022g = AbstractC12965j.f44781b;
        InterfaceC21461d interfaceC21461d = this.f44774w;
        Method method = (Method) c0022g.get(interfaceC21461d);
        if (method == null) {
            method = AbstractC21598x.m60663S(interfaceC21461d).getMethod("fromBundle", (Class[]) Arrays.copyOf(AbstractC12965j.f44780a, 1));
            c0022g.put(interfaceC21461d, method);
            AbstractC22676k.m65749i(method, "navArgsClass.java.getMet…                        }");
        }
        Object objInvoke = method.invoke(null, bundle);
        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        InterfaceC12959h interfaceC12959h2 = (InterfaceC12959h) objInvoke;
        this.f44776y = interfaceC12959h2;
        return interfaceC12959h2;
    }
}

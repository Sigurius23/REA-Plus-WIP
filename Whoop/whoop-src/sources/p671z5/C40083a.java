package p671z5;

import al0.C0971f;
import android.content.Context;
import bc3.InterfaceC2994c0;
import f93.InterfaceC14291c;
import io.sentry.hints.C20363j;
import j93.InterfaceC21493z;
import java.util.List;
import ne3.AbstractC26632p;
import p007a6.C0410c;
import p007a6.C0429i0;
import p045c6.C4262e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: z5.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40083a implements InterfaceC14291c {

    /* JADX INFO: renamed from: E */
    public volatile C0429i0 f172994E;

    /* JADX INFO: renamed from: w */
    public final C40084b f172995w;

    /* JADX INFO: renamed from: x */
    public final Function1 f172996x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC2994c0 f172997y;

    /* JADX INFO: renamed from: z */
    public final Object f172998z = new Object();

    public C40083a(C40084b c40084b, Function1 function1, InterfaceC2994c0 interfaceC2994c0) {
        this.f172995w = c40084b;
        this.f172996x = function1;
        this.f172997y = interfaceC2994c0;
    }

    @Override // f93.InterfaceC14291c
    public final Object getValue(Object obj, InterfaceC21493z property) {
        C0429i0 c0429i0;
        Context thisRef = (Context) obj;
        AbstractC22676k.m65750j(thisRef, "thisRef");
        AbstractC22676k.m65750j(property, "property");
        C0429i0 c0429i1 = this.f172994E;
        if (c0429i1 != null) {
            return c0429i1;
        }
        synchronized (this.f172998z) {
            try {
                if (this.f172994E == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    C4262e c4262e = new C4262e(AbstractC26632p.f105900w, this.f172995w, new C0971f(this, applicationContext, 19));
                    Function1 function1 = this.f172996x;
                    AbstractC22676k.m65747g(applicationContext);
                    List migrations = (List) function1.invoke(applicationContext);
                    InterfaceC2994c0 interfaceC2994c0 = this.f172997y;
                    AbstractC22676k.m65750j(migrations, "migrations");
                    this.f172994E = new C0429i0(c4262e, AbstractC37056f.m118958J(new C0410c(migrations, null, 0)), new C20363j(10), interfaceC2994c0);
                }
                c0429i0 = this.f172994E;
                AbstractC22676k.m65747g(c0429i0);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c0429i0;
    }
}

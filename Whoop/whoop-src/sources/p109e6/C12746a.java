package p109e6;

import a11.C0134l;
import android.content.Context;
import bc3.InterfaceC2994c0;
import e61.C12762e;
import f93.InterfaceC14291c;
import io.sentry.hints.C20363j;
import j93.InterfaceC21493z;
import java.util.List;
import p007a6.C0410c;
import p007a6.C0429i0;
import p007a6.C0441m0;
import p138f6.C14130b;
import p138f6.C14131c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12746a implements InterfaceC14291c {

    /* JADX INFO: renamed from: E */
    public volatile C14130b f43627E;

    /* JADX INFO: renamed from: w */
    public final String f43628w;

    /* JADX INFO: renamed from: x */
    public final Function1 f43629x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC2994c0 f43630y;

    /* JADX INFO: renamed from: z */
    public final Object f43631z = new Object();

    public C12746a(String str, InterfaceC2994c0 interfaceC2994c0, Function1 function1) {
        this.f43628w = str;
        this.f43629x = function1;
        this.f43630y = interfaceC2994c0;
    }

    @Override // f93.InterfaceC14291c
    public final Object getValue(Object obj, InterfaceC21493z property) {
        C14130b c14130b;
        Context thisRef = (Context) obj;
        AbstractC22676k.m65750j(thisRef, "thisRef");
        AbstractC22676k.m65750j(property, "property");
        C14130b c14130b2 = this.f43627E;
        if (c14130b2 != null) {
            return c14130b2;
        }
        synchronized (this.f43631z) {
            try {
                if (this.f43627E == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    Function1 function1 = this.f43629x;
                    AbstractC22676k.m65747g(applicationContext);
                    List migrations = (List) function1.invoke(applicationContext);
                    InterfaceC2994c0 interfaceC2994c0 = this.f43630y;
                    C0134l c0134l = new C0134l(16, applicationContext, this);
                    AbstractC22676k.m65750j(migrations, "migrations");
                    this.f43627E = new C14130b(new C14130b(new C0429i0(new C0441m0(C14131c.f50836a, new C12762e(c0134l, 3)), AbstractC37056f.m118958J(new C0410c(migrations, null, 0)), new C20363j(10), interfaceC2994c0)));
                }
                c14130b = this.f43627E;
                AbstractC22676k.m65747g(c14130b);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c14130b;
    }
}

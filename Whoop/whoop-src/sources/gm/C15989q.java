package gm;

import a00.C0072g;
import a33.C0352d;
import android.content.Context;
import dm.C12173c;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import lr.RunnableC24693e;
import p122em.C13321a;
import p127ev.C13668i;
import p307lm.InterfaceC24505b;
import pm.InterfaceC29353a;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: gm.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C15989q {

    /* JADX INFO: renamed from: e */
    public static volatile C15983k f60505e;

    /* JADX INFO: renamed from: a */
    public final InterfaceC29353a f60506a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29353a f60507b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC24505b f60508c;

    /* JADX INFO: renamed from: d */
    public final C13668i f60509d;

    public C15989q(InterfaceC29353a interfaceC29353a, InterfaceC29353a interfaceC29353a2, InterfaceC24505b interfaceC24505b, C13668i c13668i, C0072g c0072g) {
        this.f60506a = interfaceC29353a;
        this.f60507b = interfaceC29353a2;
        this.f60508c = interfaceC24505b;
        this.f60509d = c13668i;
        ((Executor) c0072g.f223x).execute(new RunnableC24693e(c0072g, 2));
    }

    /* JADX INFO: renamed from: a */
    public static C15989q m45132a() {
        C15983k c15983k = f60505e;
        if (c15983k != null) {
            return (C15989q) c15983k.f60493F.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX INFO: renamed from: b */
    public static void m45133b(Context context) {
        if (f60505e == null) {
            synchronized (C15989q.class) {
                try {
                    if (f60505e == null) {
                        C15982j c15982j = new C15982j();
                        context.getClass();
                        c15982j.f60491w = context;
                        f60505e = c15982j.m45128b();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C15988p m45134c(InterfaceC15984l interfaceC15984l) {
        byte[] bytes;
        Set setUnmodifiableSet = interfaceC15984l != null ? Collections.unmodifiableSet(C13321a.f46153d) : Collections.singleton(new C12173c("proto"));
        C0352d c0352dM45125a = C15981i.m45125a();
        interfaceC15984l.getClass();
        c0352dM45125a.f1237x = "cct";
        C13321a c13321a = (C13321a) interfaceC15984l;
        String str = c13321a.f46156a;
        String str2 = c13321a.f46157b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC31061c.m95640p("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c0352dM45125a.f1238y = bytes;
        return new C15988p(setUnmodifiableSet, c0352dM45125a.m932d(), this);
    }
}

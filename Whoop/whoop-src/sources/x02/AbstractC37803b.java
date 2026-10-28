package x02;

import a63.C0486f0;
import a63.C0490h0;
import ad3.AbstractC0757c;
import b63.C2764b;
import b63.C2768f;
import bc3.C3023j1;
import bc3.InterfaceC3027k1;
import com.google.gson.Gson;
import io.getstream.chat.android.client.ChatClient;
import l83.C23454a0;
import n63.AbstractC26410b;
import p005a3.C0227m1;
import p027b3.C2442t0;
import p392p3.C28761b0;
import p459rf.C31345p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30061h;
import ud3.C34826l0;
import v53.C35709c;
import v53.C35711e;
import vb1.C35868a;
import z53.C40109a;
import z53.C40110b;
import z53.C40115g;

/* JADX INFO: renamed from: x02.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lud3/l0;", "okHttpClient", "Lcom/google/gson/Gson;", "gson", "Lad3/c;", "kotlinSerialization", "Lv53/c;", "d", "(Lud3/l0;Lcom/google/gson/Gson;Lad3/c;)Lv53/c;", "network_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37803b {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: d */
    public static final C35709c m121312d(C34826l0 okHttpClient, Gson gson, AbstractC0757c abstractC0757c) {
        AbstractC22676k.m65750j(okHttpClient, "okHttpClient");
        AbstractC22676k.m65750j(gson, "gson");
        C35711e c35711e = new C35711e();
        m121314f(okHttpClient, abstractC0757c, gson, c35711e);
        ?? block = c35711e.f151940d;
        AbstractC22676k.m65750j(block, "block");
        C40110b c40110b = new C40110b();
        c40110b.f173134a = C40109a.f173131x;
        c40110b.f173136c = 10;
        block.invoke(c40110b);
        C40115g c40115g = new C40115g(c40110b);
        C35709c c35709c = new C35709c(c40115g, c35711e);
        InterfaceC30061h interfaceC30061h = c35709c.f151935z.get(C3023j1.f12041w);
        AbstractC22676k.m65747g(interfaceC30061h);
        ((InterfaceC3027k1) interfaceC30061h).invokeOnCompletion(new C0227m1(c40115g, 27));
        return c35709c;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C35709c m121313e(C34826l0 c34826l0, Gson gson, AbstractC0757c abstractC0757c, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            abstractC0757c = null;
        }
        return m121312d(c34826l0, gson, abstractC0757c);
    }

    /* JADX INFO: renamed from: f */
    private static final C23454a0 m121314f(C34826l0 c34826l0, AbstractC0757c abstractC0757c, Gson gson, C35711e HttpClient) {
        AbstractC22676k.m65750j(HttpClient, "$this$HttpClient");
        HttpClient.f151943g = true;
        int i13 = 11;
        HttpClient.f151940d = new C2442t0(i13, HttpClient.f151940d, new C31345p(c34826l0, 9));
        HttpClient.m113182a(C2768f.f10902c, new C28761b0(17, abstractC0757c, gson));
        HttpClient.m113182a(C0490h0.f1652d, new C35868a(13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m121315g(C34826l0 c34826l0, C40110b engine) {
        AbstractC22676k.m65750j(engine, "$this$engine");
        engine.f173135b = c34826l0;
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m121316h(AbstractC0757c abstractC0757c, Gson gson, C2764b install) {
        AbstractC22676k.m65750j(install, "$this$install");
        if (abstractC0757c != null) {
            AbstractC26410b.m78139a(install, abstractC0757c);
        } else {
            AbstractC37802a.m121308b(install, gson, null, 2, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m121317i(C0486f0 install) {
        AbstractC22676k.m65750j(install, "$this$install");
        Long lValueOf = Long.valueOf(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);
        C0486f0.m1200a(lValueOf);
        install.f1646b = lValueOf;
        C0486f0.m1200a(lValueOf);
        install.f1647c = lValueOf;
        return C23454a0.f92919a;
    }
}

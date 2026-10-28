package ge3;

import fe3.AbstractC14421e;
import fe3.C14419c;
import io.sentry.hints.C20363j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: ge3.e */
/* JADX INFO: loaded from: classes5.dex */
public class C15749e implements InterfaceC15758n {

    /* JADX INFO: renamed from: e */
    public static final C20363j f59412e = new C20363j(20);

    /* JADX INFO: renamed from: a */
    public final Class f59413a;

    /* JADX INFO: renamed from: b */
    public final Method f59414b;

    /* JADX INFO: renamed from: c */
    public final Method f59415c;

    /* JADX INFO: renamed from: d */
    public final Method f59416d;

    public C15749e(Class cls) throws NoSuchMethodException {
        this.f59413a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC22676k.m65749i(declaredMethod, "getDeclaredMethod(...)");
        this.f59414b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f59415c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f59416d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: a */
    public final boolean mo44414a(SSLSocket sSLSocket) {
        return this.f59413a.isInstance(sSLSocket);
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: b */
    public final String mo44415b(SSLSocket sSLSocket) {
        if (this.f59413a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f59415c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC39397a.f169546a);
                }
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e13) {
                Throwable cause = e13.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC22676k.m65745e(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e13);
                }
            }
        }
        return null;
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: c */
    public final void mo44416c(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC22676k.m65750j(protocols, "protocols");
        if (this.f59413a.isInstance(sSLSocket)) {
            try {
                this.f59414b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f59416d;
                AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
                method.invoke(sSLSocket, C20363j.m56530n(protocols));
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e13) {
                throw new AssertionError(e13);
            }
        }
    }

    @Override // ge3.InterfaceC15758n
    public final boolean isSupported() {
        boolean z4 = C14419c.f52591e;
        return AbstractC34870c0.m109992b0();
    }
}

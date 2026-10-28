package y33;

import ae3.C0801i;
import com.iterable.iterableapi.C5378v;
import e53.C12745d;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34810e0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: y33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C39198a implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w */
    public final String f168468w;

    /* JADX INFO: renamed from: x */
    public final C12745d f168469x;

    /* JADX INFO: renamed from: y */
    public String f168470y;

    public C39198a(String apiKey, C12745d tokenRepository) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(tokenRepository, "tokenRepository");
        this.f168468w = apiKey;
        this.f168469x = tokenRepository;
        this.f168470y = "jwt";
    }

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) {
        C34810e0 url;
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        if (AbstractC39414r.m125876U(c34832o0.f146712a.f146570i, "video", false)) {
            C5378v c5378vM109878g = c34832o0.f146712a.m109878g();
            c5378vM109878g.m16525a("api_key", this.f168468w);
            url = c5378vM109878g.m16526b();
        } else {
            url = c34832o0.f146712a;
        }
        String str = (String) this.f168469x.f43626a;
        C34830n0 c34830n0M109907b = c34832o0.m109907b();
        AbstractC22676k.m65750j(url, "url");
        c34830n0M109907b.f146687a = url;
        c34830n0M109907b.m109902c("stream-auth-type", this.f168470y);
        if (!AbstractC39414r.m125890i0(str)) {
            c34830n0M109907b.m109900a(TokenAuthInterceptor.AUTH_HEADER, str);
        }
        return c0801i.m1939b(new C34832o0(c34830n0M109907b));
    }
}

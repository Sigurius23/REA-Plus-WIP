package y33;

import android.content.Context;
import androidx.lifecycle.AbstractC1638x;
import b43.C2721b;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import d33.C11585c;
import e53.C12745d;
import e53.InterfaceC12744c;
import f53.C14123k;
import io.getstream.android.video.generated.apis.ProductvideoApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23470p;
import me3.C25480c;
import p450r5.C30929c;
import p530up.AbstractC35148d;
import p537ux.C35331f0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import ud3.C34824k0;
import ud3.C34826l0;
import wd3.AbstractC37174h;
import z33.C40053b;

/* JADX INFO: renamed from: y33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C39200c {

    /* JADX INFO: renamed from: a */
    public final C12745d f168473a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2994c0 f168474b;

    /* JADX INFO: renamed from: c */
    public final String f168475c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1638x f168476d;

    /* JADX INFO: renamed from: e */
    public final C39198a f168477e;

    /* JADX INFO: renamed from: f */
    public final C23470p f168478f;

    /* JADX INFO: renamed from: g */
    public final C34826l0 f168479g;

    /* JADX INFO: renamed from: h */
    public final C23470p f168480h;

    /* JADX INFO: renamed from: i */
    public final C23470p f168481i;

    /* JADX INFO: renamed from: j */
    public final C14123k f168482j;

    public C39200c(Context context, InterfaceC12744c tokenProvider, C11585c c11585c, C12745d tokenRepository, InterfaceC2994c0 scope, String apiUrl, String wssUrl, long j7, C2721b loggingLevel, String apiKey, AbstractC1638x lifecycle) {
        AbstractC22676k.m65749i(Collections.synchronizedList(new ArrayList()), "synchronizedList(...)");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        AbstractC22676k.m65750j(tokenRepository, "tokenRepository");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(apiUrl, "apiUrl");
        AbstractC22676k.m65750j(wssUrl, "wssUrl");
        AbstractC22676k.m65750j(loggingLevel, "loggingLevel");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        this.f168473a = tokenRepository;
        this.f168474b = scope;
        this.f168475c = apiUrl;
        this.f168476d = lifecycle;
        C39198a c39198a = new C39198a(apiKey, tokenRepository);
        this.f168477e = c39198a;
        this.f168478f = AbstractC30060g.m92088H(new C39199b(this, 1));
        C34824k0 c34824k0 = new C34824k0();
        c34824k0.m109891a(new C39201d());
        c34824k0.m109891a(c39198a);
        C25480c c25480c = new C25480c(new C35331f0(this));
        c25480c.f99804z = loggingLevel.f10731b.f10729w;
        c34824k0.m109891a(c25480c);
        c34824k0.f146617f = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c34824k0.m109892b(j7, timeUnit);
        c34824k0.m109896f(j7, timeUnit);
        c34824k0.m109895e(j7, timeUnit);
        c34824k0.f146635x = AbstractC37174h.m119135b("timeout", j7, timeUnit);
        C34826l0 c34826l0 = new C34826l0(c34824k0);
        this.f168479g = c34826l0;
        C23470p c23470pM92088H = AbstractC30060g.m92088H(new C30929c(10, this, context));
        this.f168480h = c23470pM92088H;
        this.f168481i = AbstractC30060g.m92088H(new C39199b(this, 0));
        String str = (String) tokenRepository.f43626a;
        C40053b c40053b = (C40053b) c23470pM92088H.getValue();
        InterfaceC30063j coroutineContext = scope.getCoroutineContext();
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.f168482j = new C14123k(apiKey, wssUrl, c11585c, str, c34826l0, c40053b, AbstractC35148d.m111177h(null, coroutineContext.plus(AbstractC3076z.limitedParallelism$default(ExecutorC22364d.f87316w, 1, null, 2, null)), 1), lifecycle, tokenProvider, tokenRepository);
    }

    /* JADX INFO: renamed from: a */
    public final ProductvideoApi m124884a() {
        Object value = this.f168481i.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (ProductvideoApi) value;
    }

    /* JADX INFO: renamed from: b */
    public final void m124885b(String token) {
        AbstractC22676k.m65750j(token, "token");
        C12745d c12745d = this.f168473a;
        c12745d.getClass();
        c12745d.f43626a = token;
    }
}

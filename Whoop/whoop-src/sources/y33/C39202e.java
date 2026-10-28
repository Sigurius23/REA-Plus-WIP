package y33;

import android.content.Context;
import androidx.lifecycle.AbstractC1638x;
import b23.EnumC2341g;
import b30.C2570m;
import b43.EnumC2720a;
import c53.AbstractC4257c;
import e53.C12745d;
import h53.C16941f;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.video.android.core.api.SignalServerService;
import j43.C21317a;
import java.util.concurrent.TimeUnit;
import l53.C23369j;
import l53.C23372m;
import l83.C23470p;
import me3.C25480c;
import me3.InterfaceC25479b;
import org.webrtc.Logging;
import p002a0.C0006a1;
import p087db.C11856j0;
import p320m5.C25067k;
import p33.C28822o;
import p530up.AbstractC35148d;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29224y0;
import q83.AbstractC30060g;
import ud3.C34824k0;
import ud3.C34826l0;
import wd3.AbstractC37174h;
import z33.C40053b;

/* JADX INFO: renamed from: y33.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C39202e {

    /* JADX INFO: renamed from: a */
    public final String f168483a;

    /* JADX INFO: renamed from: b */
    public final C0006a1 f168484b;

    /* JADX INFO: renamed from: c */
    public final C34826l0 f168485c;

    /* JADX INFO: renamed from: d */
    public final C28822o f168486d;

    /* JADX INFO: renamed from: e */
    public final C16941f f168487e;

    public C39202e(Context context, C12745d c12745d, C2570m sfuAnalytics, String apiKey, String apiUrl, String wssUrl, AbstractC1638x lifecycle, C23372m c23372m, C0006a1 c0006a1) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(sfuAnalytics, "sfuAnalytics");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(apiUrl, "apiUrl");
        AbstractC22676k.m65750j(wssUrl, "wssUrl");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        this.f168483a = apiUrl;
        this.f168484b = c0006a1;
        C39198a c39198a = new C39198a(apiKey, c12745d);
        C34824k0 c34824k0 = new C34824k0();
        c34824k0.m109891a(c39198a);
        C25480c c25480c = new C25480c(InterfaceC25479b.f99800m);
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        EnumC2720a httpLoggingLevel = EnumC2720a.BASIC;
        Logging.Severity webRtcLoggingLevel = Logging.Severity.LS_NONE;
        AbstractC22676k.m65750j(httpLoggingLevel, "httpLoggingLevel");
        AbstractC22676k.m65750j(webRtcLoggingLevel, "webRtcLoggingLevel");
        c25480c.f99804z = httpLoggingLevel.f10729w;
        c34824k0.m109891a(c25480c);
        c34824k0.f146617f = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c34824k0.m109892b(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit);
        c34824k0.m109896f(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit);
        c34824k0.m109895e(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit);
        c34824k0.f146635x = AbstractC37174h.m119135b("timeout", ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit);
        C34826l0 c34826l0 = new C34826l0(c34824k0);
        this.f168485c = c34826l0;
        Object value = AbstractC30060g.m92088H(new C25067k(this, 19)).getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        this.f168486d = new C28822o(new C23369j(c23372m, (SignalServerService) ((C29224y0) value).m88733b(SignalServerService.class)), new C21317a(this, 23));
        C23470p c23470pM92088H = AbstractC30060g.m92088H(new C25067k(this, context));
        this.f168487e = new C16941f(apiKey, wssUrl, c34826l0, (C40053b) c23470pM92088H.getValue(), AbstractC35148d.m111177h(AbstractC4257c.m13288a(), null, 2), lifecycle, new C11856j0((String) c12745d.f43626a, 2), c12745d, sfuAnalytics);
    }
}

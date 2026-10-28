package i92;

import com.whoop.service.network.model.UserSessionDtoKt;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import java.util.TreeSet;
import m83.AbstractC25265s;
import me3.C25480c;
import me3.EnumC25478a;
import p211i5.C18090c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: i92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Li92/b;", "", "<init>", "()V", "Lme3/c;", "b", "()Lme3/c;", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18257b {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC34116n f71058b = InterfaceC34116n.INSTANCE.m107848a("HttpLog");

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m52594c(String message) {
        AbstractC22676k.m65750j(message, "message");
        if (AbstractC39414r.m125876U(message, "password", false) || AbstractC39414r.m125876U(message, UserSessionDtoKt.ACCESS_TOKEN, false) || AbstractC39414r.m125876U(message, UserSessionDtoKt.REFRESH_TOKEN, false)) {
            f71058b.mo85219j("Message removed", new AbstractC30556a.a[0]);
        } else {
            f71058b.mo85219j(message, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C25480c m52595b() {
        EnumC25478a enumC25478a = EnumC25478a.f99797x;
        C25480c c25480c = new C25480c(new C18090c(8));
        c25480c.f99804z = enumC25478a;
        AbstractC39421y.m125922G();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        AbstractC25265s.m74141p0(treeSet, (Iterable) c25480c.f99802x);
        treeSet.add(TokenAuthInterceptor.AUTH_HEADER);
        c25480c.f99802x = treeSet;
        return c25480c;
    }
}

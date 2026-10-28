package yn0;

import androidx.core.app.NotificationCompat;
import co0.C4858a;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import java.time.Clock;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.AbstractC28219z;
import p114eb.C12969k0;
import p114eb.C12995w0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yn0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lyn0/a;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "Ljava/time/Clock;", "clock", "Lco0/a;", "jwtTokenParser", "<init>", "(Lj02/i0;Ljava/time/Clock;Lco0/a;)V", "", "jwtToken", "", "a", "(Ljava/lang/String;)Z", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "Lj02/i0;", "b", "Ljava/time/Clock;", "c", "Lco0/a;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39669a implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4858a jwtTokenParser;

    public C39669a(C21147i0 navDeepLinkRequestHelper, Clock clock, C4858a jwtTokenParser) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(jwtTokenParser, "jwtTokenParser");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.clock = clock;
        this.jwtTokenParser = jwtTokenParser;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m126814a(String jwtToken) {
        Long lM15500b = this.jwtTokenParser.m15500b(jwtToken);
        if (lM15500b != null) {
            return this.clock.millis() / ((long) 1000) >= lM15500b.longValue();
        }
        return true;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.o3)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.o3 o3Var = (AbstractC21155m0.o3) navigationScreen;
        String resetToken = o3Var.getResetToken();
        if (resetToken == null) {
            resetToken = "";
        }
        String str = o3Var.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String();
        String str2 = str != null ? str : "";
        String expires = o3Var.getExpires();
        boolean zM126814a = false;
        if (expires != null && expires.length() != 0) {
            Long lM125933R = AbstractC39421y.m125933R(expires);
            long jMillis = this.clock.millis();
            if (lM125933R != null && jMillis >= lM125933R.longValue() * ((long) 1000)) {
                zM126814a = true;
            }
        } else if (AbstractC39414r.m125876U(resetToken, ".", false)) {
            zM126814a = m126814a(resetToken);
        }
        C12969k0 c12969k0M95630f = AbstractC31061c.m95630f(AbstractC28219z.m85447b("resetPassword", AbstractC25247g0.m73990Y(new C23465k("resetToken", resetToken), new C23465k("isExpired", String.valueOf(zM126814a)), new C23465k(NotificationCompat.CATEGORY_EMAIL, str2))), "toString(...)", this.navDeepLinkRequestHelper);
        C12995w0 c12995w0M95631g = AbstractC31061c.m95631g();
        c12995w0M95631g.f44891a = true;
        return new InterfaceC21149j0.c(c12969k0M95630f, c12995w0M95631g.m36508a(), null, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C39669a(C21147i0 c21147i0, Clock clock, C4858a c4858a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        c21147i0 = (i13 & 1) != 0 ? new C21147i0() : c21147i0;
        if ((i13 & 2) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(c21147i0, clock, (i13 & 4) != 0 ? new C4858a(null, 1, null) : c4858a);
    }
}

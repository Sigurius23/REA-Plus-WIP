package co0;

import android.util.Base64;
import androidx.core.app.NotificationCompat;
import java.util.List;
import org.json.JSONObject;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: co0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lco0/a;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "jwtToken", "Lorg/json/JSONObject;", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)Ljava/lang/Long;", "Ltr2/n;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4858a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C4858a(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final String m15499a(String jwtToken) {
        String strOptString;
        AbstractC22676k.m65750j(jwtToken, "jwtToken");
        JSONObject jSONObjectM15501c = m15501c(jwtToken);
        if (jSONObjectM15501c != null && jSONObjectM15501c.has(NotificationCompat.CATEGORY_EMAIL) && (strOptString = jSONObjectM15501c.optString(NotificationCompat.CATEGORY_EMAIL, null)) != null && strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Long m15500b(String jwtToken) {
        AbstractC22676k.m65750j(jwtToken, "jwtToken");
        JSONObject jSONObjectM15501c = m15501c(jwtToken);
        if (jSONObjectM15501c != null && jSONObjectM15501c.has("exp")) {
            Long lValueOf = Long.valueOf(jSONObjectM15501c.optLong("exp", -1L));
            if (lValueOf.longValue() != -1) {
                return lValueOf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m15501c(String jwtToken) {
        AbstractC22676k.m65750j(jwtToken, "jwtToken");
        if (jwtToken.length() != 0) {
            try {
                List listM125906y0 = AbstractC39414r.m125906y0(jwtToken, new String[]{"."}, 6);
                if (listM125906y0.size() == 3) {
                    byte[] bArrDecode = Base64.decode((String) listM125906y0.get(1), 10);
                    AbstractC22676k.m65749i(bArrDecode, "decode(...)");
                    return new JSONObject(new String(bArrDecode, AbstractC39397a.f169546a));
                }
            } catch (Exception e5) {
                this.logger.mo85230v("Failed to parse JWT token", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
        return null;
    }

    public /* synthetic */ C4858a(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("JwtTokenParser") : interfaceC34116n);
    }
}

package g80;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import x60.AbstractC38022b;

/* JADX INFO: renamed from: g80.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lg80/i;", "", "Lcom/whoop/design/util/TextResource;", "loginErrorTitle", "loginErrorDescription", "", "analyticsName", "Lg80/h;", "displayType", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lg80/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "g", "c", "Ljava/lang/String;", "e", "d", "Lg80/h;", "f", "()Lg80/h;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15568i {

    /* JADX INFO: renamed from: g */
    private static final C15568i f58478g;

    /* JADX INFO: renamed from: i */
    private static final C15568i f58480i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource loginErrorTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource loginErrorDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC15567h displayType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f58477f = TextResource.$stable;

    /* JADX INFO: renamed from: h */
    private static final C15568i f58479h = new C15568i(new TextResource.C8688b(AbstractC38022b.f162883X, null, 2, null), new TextResource.C8688b(AbstractC38022b.f162867H, null, 2, null), "email_password_incorrect", null, 8, null);

    /* JADX INFO: renamed from: j */
    private static final C15568i f58481j = new C15568i(new TextResource.C8688b(AbstractC38022b.f162877R, null, 2, null), AbstractC8693b.m21267a(), "password_attempts_exceeded", EnumC15567h.ALERT_TILE);

    /* JADX INFO: renamed from: g80.i$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m65681d2 = {"Lg80/i$a;", "", "<init>", "()V", "Lg80/i;", "GenericError", "Lg80/i;", "a", "()Lg80/i;", "IncorrectCredentials", "b", "NetworkError", "c", "PasswordAttemptExceededError", "d", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C15568i m43850a() {
            return C15568i.f58478g;
        }

        /* JADX INFO: renamed from: b */
        public final C15568i m43851b() {
            return C15568i.f58479h;
        }

        /* JADX INFO: renamed from: c */
        public final C15568i m43852c() {
            return C15568i.f58480i;
        }

        /* JADX INFO: renamed from: d */
        public final C15568i m43853d() {
            return C15568i.f58481j;
        }

        private Companion() {
        }
    }

    static {
        int i13 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        EnumC15567h enumC15567h = null;
        f58478g = new C15568i(new TextResource.C8688b(AbstractC38022b.f162883X, null, 2, null), new TextResource.C8688b(AbstractC38022b.f162864E, null, 2, null), "generic_error", enumC15567h, i13, defaultConstructorMarker);
        f58480i = new C15568i(new TextResource.C8688b(AbstractC38022b.f162883X, null, 2, null), new TextResource.C8688b(AbstractC38022b.f162870K, null, 2, null), "network_error", enumC15567h, i13, defaultConstructorMarker);
    }

    public C15568i(TextResource loginErrorTitle, TextResource loginErrorDescription, String analyticsName, EnumC15567h displayType) {
        AbstractC22676k.m65750j(loginErrorTitle, "loginErrorTitle");
        AbstractC22676k.m65750j(loginErrorDescription, "loginErrorDescription");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(displayType, "displayType");
        this.loginErrorTitle = loginErrorTitle;
        this.loginErrorDescription = loginErrorDescription;
        this.analyticsName = analyticsName;
        this.displayType = displayType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15568i)) {
            return false;
        }
        C15568i c15568i = (C15568i) other;
        return AbstractC22676k.m65745e(this.loginErrorTitle, c15568i.loginErrorTitle) && AbstractC22676k.m65745e(this.loginErrorDescription, c15568i.loginErrorDescription) && AbstractC22676k.m65745e(this.analyticsName, c15568i.analyticsName) && this.displayType == c15568i.displayType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC15567h getDisplayType() {
        return this.displayType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getLoginErrorDescription() {
        return this.loginErrorDescription;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getLoginErrorTitle() {
        return this.loginErrorTitle;
    }

    public int hashCode() {
        return this.displayType.hashCode() + AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.loginErrorTitle.hashCode() * 31, this.loginErrorDescription, 31), 31, this.analyticsName);
    }

    public String toString() {
        TextResource textResource = this.loginErrorTitle;
        TextResource textResource2 = this.loginErrorDescription;
        String str = this.analyticsName;
        EnumC15567h enumC15567h = this.displayType;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("LoginErrorState(loginErrorTitle=", textResource, ", loginErrorDescription=", textResource2, ", analyticsName=");
        sbM106658q.append(str);
        sbM106658q.append(", displayType=");
        sbM106658q.append(enumC15567h);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C15568i(TextResource textResource, TextResource textResource2, String str, EnumC15567h enumC15567h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, str, (i13 & 8) != 0 ? EnumC15567h.DIALOG : enumC15567h);
    }
}

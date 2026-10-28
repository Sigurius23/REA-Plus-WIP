package uy1;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.domain.model.AuthMaterial;
import java.util.Base64;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import y92.C39352a;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: uy1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0011B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Luy1/a;", "", "Ly92/a;", "authManager", "Ljava/util/Base64$Decoder;", "base64Decoder", "Lad3/c;", "json", "Ltr2/n;", "logger", "<init>", "(Ly92/a;Ljava/util/Base64$Decoder;Lad3/c;Ltr2/n;)V", "", "jwtToken", "Luy1/i;", "b", "(Ljava/lang/String;)Luy1/i;", "a", "(Lq83/d;)Ljava/lang/Object;", "Ly92/a;", "Ljava/util/Base64$Decoder;", "c", "Lad3/c;", "d", "Ltr2/n;", "e", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35377a {

    /* JADX INFO: renamed from: e */
    private static final a f150680e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f150681f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Base64.Decoder base64Decoder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: uy1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Luy1/a$a;", "", "<init>", "()V", "", "CMS_ACCESS_COMPLIANCE_MODE", "Ljava/lang/String;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: uy1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.management.JwtClaimProvider", m100430f = "JwtClaimProvider.kt", m100431l = {34}, m100432m = "getMfaState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f150686w;

        /* JADX INFO: renamed from: y */
        int f150688y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f150686w = obj;
            this.f150688y |= Integer.MIN_VALUE;
            return C35377a.this.m112271a(this);
        }
    }

    public C35377a(C39352a authManager, Base64.Decoder base64Decoder, AbstractC0757c json, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(base64Decoder, "base64Decoder");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(logger, "logger");
        this.authManager = authManager;
        this.base64Decoder = base64Decoder;
        this.json = json;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final C35385i m112270b(String jwtToken) {
        EnumC35384h enumC35384h;
        List listM125906y0 = AbstractC39414r.m125906y0(jwtToken, new String[]{"."}, 6);
        if (listM125906y0.size() != 3) {
            throw new IllegalStateException("Unknown jwt format");
        }
        byte[] bArrDecode = this.base64Decoder.decode((String) listM125906y0.get(1));
        AbstractC22676k.m65749i(bArrDecode, "decode(...)");
        JsonElement jsonElementM1835f = this.json.m1835f(new String(bArrDecode, AbstractC39397a.f169546a));
        JsonElement jsonElement = (JsonElement) AbstractC0770m.m1847i(jsonElementM1835f).get((Object) "jit_whoop:mfa_configured");
        String strM1844f = jsonElement != null ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement)) : null;
        JsonElement jsonElement2 = (JsonElement) AbstractC0770m.m1847i(jsonElementM1835f).get((Object) "jit_whoop:mfa_required");
        String strM1844f2 = jsonElement2 != null ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement2)) : null;
        JsonElement jsonElement3 = (JsonElement) AbstractC0770m.m1847i(jsonElementM1835f).get((Object) "jit_whoop:compliance_mode");
        String strM1844f3 = jsonElement3 != null ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement3)) : null;
        Boolean boolValueOf = strM1844f != null ? Boolean.valueOf(Boolean.parseBoolean(strM1844f)) : null;
        Boolean boolValueOf2 = strM1844f2 != null ? Boolean.valueOf(Boolean.parseBoolean(strM1844f2)) : null;
        if (AbstractC22676k.m65745e(strM1844f3, "CMS_ACCESS")) {
            enumC35384h = EnumC35384h.CMS_ACCESS;
        } else {
            enumC35384h = AbstractC22676k.m65745e(boolValueOf2, Boolean.TRUE) ? EnumC35384h.ADVANCED_LABS : EnumC35384h.NONE;
        }
        if (boolValueOf == null) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("mfa_configured claim is null or invalid: '", strM1844f, "'").toString());
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        if (boolValueOf2 != null) {
            return new C35385i(zBooleanValue, boolValueOf2.booleanValue(), enumC35384h);
        }
        throw new IllegalArgumentException(AbstractC11895b.m31996o("mfa_required claim is null or invalid: '", strM1844f2, "'").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m112271a(InterfaceC30057d<? super C35385i> interfaceC30057d) {
        b bVar;
        String accessToken;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f150688y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f150688y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM125478a = bVar.f150686w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f150688y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125478a);
            this.logger.mo85228t("Getting MFA state from JWT token", new AbstractC30556a.a[0]);
            C39352a c39352a = this.authManager;
            bVar.f150688y = 1;
            objM125478a = c39352a.m125478a(bVar);
            if (objM125478a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM125478a);
        }
        AuthMaterial authMaterial = (AuthMaterial) objM125478a;
        if (authMaterial == null || (accessToken = authMaterial.getAccessToken()) == null) {
            this.logger.mo85222m("No access token available", new AbstractC30556a.a[0]);
            throw new IllegalStateException("No access token! this shouldn't happen");
        }
        this.logger.mo85228t("Access token retrieved, parsing MFA state", new AbstractC30556a.a[0]);
        C35385i c35385iM112270b = m112270b(accessToken);
        this.logger.mo85228t("MFA state parsed: mfaConfigured=" + c35385iM112270b.getMfaConfigured() + ", mfaRequired=" + c35385iM112270b.getMfaRequired(), new AbstractC30556a.a[0]);
        return c35385iM112270b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C35377a(C39352a c39352a, Base64.Decoder decoder, AbstractC0757c abstractC0757c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            decoder = Base64.getDecoder();
            AbstractC22676k.m65749i(decoder, "getDecoder(...)");
        }
        this(c39352a, decoder, (i13 & 4) != 0 ? AbstractC0757c.f2762d : abstractC0757c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("JwtClaimProvider") : interfaceC34116n);
    }
}

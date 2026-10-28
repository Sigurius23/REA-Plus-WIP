package p664yy;

import com.stripe.android.core.exception.InvalidRequestException;
import i93.C18284j;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p442qy.C30764c;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import yv0.C39805h;

/* JADX INFO: renamed from: yy.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C39859g extends AbstractC39872m0 {

    /* JADX INFO: renamed from: a */
    public final EnumC39868k0 f172132a;

    /* JADX INFO: renamed from: b */
    public final String f172133b;

    /* JADX INFO: renamed from: c */
    public final Map f172134c;

    /* JADX INFO: renamed from: d */
    public final C39857f f172135d;

    /* JADX INFO: renamed from: e */
    public final C30764c f172136e;

    /* JADX INFO: renamed from: f */
    public final String f172137f;

    /* JADX INFO: renamed from: g */
    public final String f172138g;

    /* JADX INFO: renamed from: h */
    public final String f172139h;

    /* JADX INFO: renamed from: i */
    public final C18284j f172140i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f172141j;

    /* JADX INFO: renamed from: k */
    public Map f172142k;

    public C39859g(EnumC39868k0 enumC39868k0, String baseUrl, Map map, C39857f options, C30764c c30764c, String apiVersion, String str) {
        String strM74110N0;
        AbstractC22676k.m65750j(baseUrl, "baseUrl");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(apiVersion, "apiVersion");
        this.f172132a = enumC39868k0;
        this.f172133b = baseUrl;
        this.f172134c = map;
        this.f172135d = options;
        this.f172136e = c30764c;
        this.f172137f = apiVersion;
        this.f172138g = str;
        this.f172139h = (map == null || (strM74110N0 = AbstractC25265s.m74110N0(AbstractC39877q.m127950g(null, AbstractC39877q.m127945b(map)), "&", null, null, new C39805h(10), 30)) == null) ? "" : strM74110N0;
        C39852c0 c39852c0 = new C39852c0(options, c30764c, apiVersion, str);
        EnumC39870l0 enumC39870l0 = EnumC39870l0.Form;
        this.f172140i = AbstractC39881u.f172198a;
        this.f172141j = c39852c0.m127932a();
        this.f172142k = c39852c0.f172121h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39859g)) {
            return false;
        }
        C39859g c39859g = (C39859g) obj;
        return this.f172132a == c39859g.f172132a && AbstractC22676k.m65745e(this.f172133b, c39859g.f172133b) && AbstractC22676k.m65745e(this.f172134c, c39859g.f172134c) && AbstractC22676k.m65745e(this.f172135d, c39859g.f172135d) && AbstractC22676k.m65745e(this.f172136e, c39859g.f172136e) && AbstractC22676k.m65745e(this.f172137f, c39859g.f172137f) && this.f172138g.equals(c39859g.f172138g);
    }

    @Override // p664yy.AbstractC39872m0
    public final Map getHeaders() {
        return this.f172141j;
    }

    @Override // p664yy.AbstractC39872m0
    public final EnumC39868k0 getMethod() {
        return this.f172132a;
    }

    @Override // p664yy.AbstractC39872m0
    public final Map getPostHeaders() {
        return this.f172142k;
    }

    @Override // p664yy.AbstractC39872m0
    public final Iterable getRetryResponseCodes() {
        return this.f172140i;
    }

    @Override // p664yy.AbstractC39872m0
    public final boolean getShouldCache() {
        return false;
    }

    @Override // p664yy.AbstractC39872m0
    public final String getUrl() {
        EnumC39868k0 enumC39868k0 = EnumC39868k0.GET;
        String str = this.f172133b;
        EnumC39868k0 enumC39868k1 = this.f172132a;
        if (enumC39868k0 != enumC39868k1 && EnumC39868k0.DELETE != enumC39868k1) {
            return str;
        }
        String str2 = this.f172139h;
        if (str2.length() <= 0) {
            str2 = null;
        }
        return AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{str, str2}), AbstractC39414r.m125876U(str, "?", false) ? "&" : "?", null, null, null, 62);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f172132a.hashCode() * 31, 31, this.f172133b);
        Map map = this.f172134c;
        int iHashCode = (this.f172135d.hashCode() + ((iM30450d + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        C30764c c30764c = this.f172136e;
        return Boolean.hashCode(false) + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (c30764c == null ? 0 : c30764c.hashCode())) * 31, 31, this.f172137f), 31, this.f172138g);
    }

    @Override // p664yy.AbstractC39872m0
    public final void setPostHeaders(Map map) {
        this.f172142k = map;
    }

    public final String toString() {
        return AbstractC18489d0.m53370k(this.f172132a.f172167w, " ", this.f172133b);
    }

    @Override // p664yy.AbstractC39872m0
    public final void writePostBody(OutputStream outputStream) throws InvalidRequestException, IOException {
        try {
            byte[] bytes = this.f172139h.getBytes(AbstractC39397a.f169546a);
            AbstractC22676k.m65749i(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.flush();
        } catch (UnsupportedEncodingException e5) {
            throw new InvalidRequestException(0, 7, null, AbstractC11895b.m31996o("Unable to encode parameters to ", AbstractC39397a.f169546a.name(), ". Please contact support@stripe.com for assistance."), e5, null);
        }
    }
}

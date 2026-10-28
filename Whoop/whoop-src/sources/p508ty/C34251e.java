package p508ty;

import com.stripe.android.core.exception.InvalidRequestException;
import i93.C18284j;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import p088dc.AbstractC11895b;
import p474s.AbstractC32004s;
import p664yy.AbstractC39872m0;
import p664yy.AbstractC39881u;
import p664yy.C39854d0;
import p664yy.EnumC39868k0;
import p664yy.EnumC39870l0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: ty.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C34251e extends AbstractC39872m0 {

    /* JADX INFO: renamed from: a */
    public final Object f143662a;

    /* JADX INFO: renamed from: b */
    public final EnumC39868k0 f143663b;

    /* JADX INFO: renamed from: c */
    public final C18284j f143664c;

    /* JADX INFO: renamed from: d */
    public final String f143665d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f143666e;

    /* JADX INFO: renamed from: f */
    public Map f143667f;

    public C34251e(String str, Map map) {
        this.f143662a = map;
        C39854d0 c39854d0 = new C39854d0(str);
        this.f143663b = EnumC39868k0.POST;
        EnumC39870l0 enumC39870l0 = EnumC39870l0.Form;
        this.f143664c = AbstractC39881u.f172198a;
        this.f143665d = "https://m.stripe.com/6";
        this.f143666e = c39854d0.m127932a();
        this.f143667f = c39854d0.f172126d;
    }

    @Override // p664yy.AbstractC39872m0
    public final Map getHeaders() {
        return this.f143666e;
    }

    @Override // p664yy.AbstractC39872m0
    public final EnumC39868k0 getMethod() {
        return this.f143663b;
    }

    @Override // p664yy.AbstractC39872m0
    public final Map getPostHeaders() {
        return this.f143667f;
    }

    @Override // p664yy.AbstractC39872m0
    public final Iterable getRetryResponseCodes() {
        return this.f143664c;
    }

    @Override // p664yy.AbstractC39872m0
    public final String getUrl() {
        return this.f143665d;
    }

    @Override // p664yy.AbstractC39872m0
    public final void setPostHeaders(Map map) {
        this.f143667f = map;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p664yy.AbstractC39872m0
    public final void writePostBody(OutputStream outputStream) throws InvalidRequestException, IOException {
        try {
            byte[] bytes = String.valueOf(AbstractC32004s.m99546o(this.f143662a)).getBytes(AbstractC39397a.f169546a);
            AbstractC22676k.m65749i(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.flush();
        } catch (UnsupportedEncodingException e5) {
            throw new InvalidRequestException(0, 7, null, AbstractC11895b.m31996o("Unable to encode parameters to ", AbstractC39397a.f169546a.name(), ". Please contact support@stripe.com for assistance."), e5, null);
        }
    }
}

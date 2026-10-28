package q30;

import bc3.AbstractC3028k2;
import gw.C16250a;
import gw.C16255f;
import gw.C16258i;
import gw.C16260k;
import gw.C16261l;
import gw.C16267r;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import n30.InterfaceC26213d;
import n43.C26285a;
import ng3.C26701n;
import o30.C27504b;
import o30.C27507e;
import o30.C27509g;
import o30.InterfaceC27506d;
import org.json.JSONException;
import org.json.JSONObject;
import p408q.C29662f;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r30.C30897b;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q30.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29932t0 {

    /* JADX INFO: renamed from: g */
    public static final long f122236g = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f122237h = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC27506d f122238a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC26213d f122239b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30063j f122240c;

    /* JADX INFO: renamed from: d */
    public final C29938w0 f122241d;

    /* JADX INFO: renamed from: e */
    public final SecretKey f122242e;

    /* JADX INFO: renamed from: f */
    public final C29662f f122243f;

    public C29932t0(InterfaceC27506d messageTransformer, String sdkReferenceId, ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey, String acsUrl, InterfaceC26213d errorReporter, C27507e c27507e, InterfaceC30063j workContext, C29919n creqExecutorConfig) {
        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
        AbstractC22676k.m65750j(messageTransformer, "messageTransformer");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(creqExecutorConfig, "creqExecutorConfig");
        AbstractC22676k.m65750j(sdkReferenceId, "sdkReferenceId");
        AbstractC22676k.m65750j(acsUrl, "acsUrl");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f122238a = messageTransformer;
        this.f122239b = errorReporter;
        this.f122240c = workContext;
        this.f122241d = c29938w0;
        SecretKey secretKeyM82920a = c27507e.m82920a(eCPublicKey, eCPrivateKey, sdkReferenceId);
        this.f122242e = secretKeyM82920a;
        this.f122243f = new C29662f(messageTransformer, secretKeyM82920a, errorReporter, creqExecutorConfig);
    }

    /* JADX INFO: renamed from: a */
    public static final String m91523a(C29932t0 c29932t0, JSONObject jSONObject) throws JSONException {
        InterfaceC27506d interfaceC27506d = c29932t0.f122238a;
        SecretKey secretKey = c29932t0.f122242e;
        C27504b c27504b = (C27504b) interfaceC27506d;
        c27504b.getClass();
        AbstractC22676k.m65750j(secretKey, "secretKey");
        String string = jSONObject.getString("acsTransID");
        AbstractC22676k.m65749i(string, "getString(...)");
        C16258i c16258i = C16258i.f61812K;
        C16255f c16255f = C27504b.f110770z;
        if (c16258i.f61776w.equals(C16250a.f61775x.f61776w)) {
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        }
        Objects.requireNonNull(c16255f);
        C16260k c16260k = new C16260k(c16258i, c16255f, null, null, null, null, null, null, null, null, null, string, null, null, null, null, null, 0, null, null, null, null, null, null, null, null);
        jSONObject.put("sdkCounterStoA", String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(c27504b.f110772x)}, 1)));
        C16261l c16261l = new C16261l(c16260k, new C16267r(jSONObject.toString()));
        C16255f c16255f2 = c16260k.f61830O;
        AbstractC22676k.m65749i(c16255f2, "getEncryptionMethod(...)");
        byte[] encoded = secretKey.getEncoded();
        C16255f c16255f3 = C16255f.f61798I;
        if (c16255f3 == c16255f2) {
            encoded = Arrays.copyOfRange(encoded, 0, c16255f3.f61803y / 8);
            AbstractC22676k.m65747g(encoded);
        } else {
            AbstractC22676k.m65747g(encoded);
        }
        c16261l.m46081b(new C27509g(new SecretKeySpec(encoded, "AES")));
        byte b = (byte) (c27504b.f110772x + 1);
        c27504b.f110772x = b;
        if (b == 0) {
            throw new IllegalArgumentException("SDK to ACS counter is zero");
        }
        String strM46083d = c16261l.m46083d();
        AbstractC22676k.m65749i(strM46083d, "serialize(...)");
        return strM46083d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m91524b(C30897b c30897b, AbstractC32269c abstractC32269c) {
        C29930s0 c29930s0;
        if (abstractC32269c instanceof C29930s0) {
            c29930s0 = (C29930s0) abstractC32269c;
            int i13 = c29930s0.f122235z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c29930s0.f122235z = i13 - Integer.MIN_VALUE;
            } else {
                c29930s0 = new C29930s0(this, abstractC32269c);
            }
        } else {
            c29930s0 = new C29930s0(this, abstractC32269c);
        }
        Object objM8750d = c29930s0.f122233x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c29930s0.f122235z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8750d);
            C26285a c26285a = new C26285a(this, c30897b, (InterfaceC30057d) null, 11);
            c29930s0.f122232w = c30897b;
            c29930s0.f122235z = 1;
            objM8750d = AbstractC3028k2.m8750d(f122236g, c26285a, c29930s0);
            if (objM8750d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c30897b = c29930s0.f122232w;
            AbstractC34132o.m107864I(objM8750d);
        }
        AbstractC29931t abstractC29931t = (AbstractC29931t) objM8750d;
        return abstractC29931t == null ? C26701n.m79401f(c30897b) : abstractC29931t;
    }
}

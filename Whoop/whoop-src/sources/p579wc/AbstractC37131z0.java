package p579wc;

import aws.sdk.kotlin.runtime.auth.credentials.InvalidSsoTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import com.squareup.wire.AbstractC5583n;
import e73.C12803b;
import m83.AbstractC25260n;
import p031b9.AbstractC2875y;
import p251jg.C21655h;
import p251jg.C21659l;
import p251jg.C21660m;
import p251jg.C21663p;
import p302lf.C23892b;
import p365od.C27826e;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p673z7.C40137a;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32417h;
import tg.AbstractC33774f;
import ug.C34912a;
import ug.C34913b;
import ug.EnumC34931t;
import vg.C35971r;
import vg.InterfaceC35967n;
import x30.AbstractC37926s0;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: wc.z0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC37131z0 {
    /* JADX INFO: renamed from: a */
    public static final C37113q0 m119044a(C27826e c27826e, C37113q0 c37113q0, C34912a c34912a) {
        String str = c27826e.f112086a;
        if (str == null) {
            throw new IllegalStateException("missing accessToken from CreateTokenResponse");
        }
        c34912a.getClass();
        C33647p c33647p = C34913b.f147015x;
        C34913b c34913bM106274t = C33647p.m106274t();
        Duration.Companion companion = Duration.INSTANCE;
        return new C37113q0(str, c34913bM106274t.m110115d(DurationKt.toDuration(c27826e.f112087b, DurationUnit.SECONDS)), c27826e.f112089d, c37113q0.f158775d, c37113q0.f158776e, c37113q0.f158777f, c37113q0.f158778g, c37113q0.f158779h);
    }

    /* JADX INFO: renamed from: b */
    public static final String m119045b(InterfaceC35967n interfaceC35967n, String... strArr) {
        AbstractC22676k.m65750j(interfaceC35967n, "<this>");
        Object value = C35971r.f153160d.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return AbstractC25260n.m74028D0(strArr, (String) value, null, null, null, 62);
    }

    /* JADX INFO: renamed from: c */
    public static final String m119046c(String cacheKey) {
        AbstractC22676k.m65750j(cacheKey, "cacheKey");
        return AbstractC2875y.m8299l(AbstractC33774f.m106780a(AbstractC32417h.m101179J(new C23892b(), AbstractC39421y.m125919D(cacheKey))), ".json");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public static final Object m119047d(String str, InterfaceC35967n interfaceC35967n, AbstractC32269c abstractC32269c) {
        C37129y0 c37129y0;
        if (abstractC32269c instanceof C37129y0) {
            c37129y0 = (C37129y0) abstractC32269c;
            int i13 = c37129y0.f158849x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37129y0.f158849x = i13 - Integer.MIN_VALUE;
            } else {
                c37129y0 = new C37129y0(abstractC32269c);
            }
        } else {
            c37129y0 = new C37129y0(abstractC32269c);
        }
        Object objM114209d = c37129y0.f158848w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37129y0.f158849x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM114209d);
            String strM119045b = m119045b(interfaceC35967n, AbstractC37926s0.m121486z(m119045b(interfaceC35967n, "~", ".aws", "sso", "cache"), interfaceC35967n), m119046c(str));
            c37129y0.f158849x = 1;
            objM114209d = ((C35971r) interfaceC35967n).m114209d(strM119045b, c37129y0);
            if (objM114209d == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM114209d);
        }
        byte[] bArr = (byte[]) objM114209d;
        if (bArr == null) {
            throw new ProviderConfigurationException("Invalid or missing SSO session cache. Run `aws sso login` to initiate a new SSO session", null);
        }
        C40137a c40137a = new C40137a(bArr);
        try {
            AbstractC5583n abstractC5583nM128689i = c40137a.m128689i();
            if (abstractC5583nM128689i.getClass() != C21655h.class) {
                StringBuilder sb4 = new StringBuilder("expected ");
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                sb4.append(c22673i0.getOrCreateKotlinClass(C21655h.class));
                sb4.append("; found ");
                sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
                throw new DeserializationException(sb4.toString());
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            C34913b c34913bM106272p = null;
            String str7 = null;
            String str8 = null;
            while (true) {
                AbstractC5583n abstractC5583nM128689i2 = c40137a.m128689i();
                if (abstractC5583nM128689i2 instanceof C21659l) {
                    if (str3 == null) {
                        throw new InvalidSsoTokenException("missing `accessToken`", null);
                    }
                    if (str2 == null) {
                        throw new InvalidSsoTokenException("missing `expiresAt`", null);
                    }
                    C33647p c33647p = C34913b.f147015x;
                    return new C37113q0(str3, C33647p.m106272p(str2), str4, str5, str6, c34913bM106272p, str7, str8);
                }
                if (!(abstractC5583nM128689i2 instanceof C21660m)) {
                    throw new IllegalStateException("expected either key or end of object");
                }
                String str9 = ((C21660m) abstractC5583nM128689i2).f83174c;
                switch (str9.hashCode()) {
                    case -1446909349:
                        if (str9.equals("clientSecret")) {
                            AbstractC5583n abstractC5583nM128689i3 = c40137a.m128689i();
                            if (abstractC5583nM128689i3.getClass() != C21663p.class) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("expected ");
                                C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                                sb5.append(c22673i1.getOrCreateKotlinClass(C21663p.class));
                                sb5.append("; found ");
                                sb5.append(c22673i1.getOrCreateKotlinClass(abstractC5583nM128689i3.getClass()));
                                throw new DeserializationException(sb5.toString());
                            }
                            str6 = ((C21663p) abstractC5583nM128689i3).f83177c;
                        } else {
                            c40137a.m128699s();
                        }
                        break;
                    case -1311790642:
                        if (str9.equals("registrationExpiresAt")) {
                            AbstractC5583n abstractC5583nM128689i4 = c40137a.m128689i();
                            if (abstractC5583nM128689i4.getClass() != C21663p.class) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("expected ");
                                C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                                sb6.append(c22673i2.getOrCreateKotlinClass(C21663p.class));
                                sb6.append("; found ");
                                sb6.append(c22673i2.getOrCreateKotlinClass(abstractC5583nM128689i4.getClass()));
                                throw new DeserializationException(sb6.toString());
                            }
                            String str10 = ((C21663p) abstractC5583nM128689i4).f83177c;
                            C33647p c33647p2 = C34913b.f147015x;
                            c34913bM106272p = C33647p.m106272p(str10);
                        } else {
                            c40137a.m128699s();
                        }
                        break;
                    case -1042689291:
                        if (str9.equals("accessToken")) {
                            AbstractC5583n abstractC5583nM128689i5 = c40137a.m128689i();
                            if (abstractC5583nM128689i5.getClass() != C21663p.class) {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("expected ");
                                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                                sb7.append(c22673i3.getOrCreateKotlinClass(C21663p.class));
                                sb7.append("; found ");
                                sb7.append(c22673i3.getOrCreateKotlinClass(abstractC5583nM128689i5.getClass()));
                                throw new DeserializationException(sb7.toString());
                            }
                            str3 = ((C21663p) abstractC5583nM128689i5).f83177c;
                        } else {
                            c40137a.m128699s();
                        }
                        break;
                    case -934795532:
                        if (str9.equals("region")) {
                            AbstractC5583n abstractC5583nM128689i6 = c40137a.m128689i();
                            if (abstractC5583nM128689i6.getClass() != C21663p.class) {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("expected ");
                                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                                sb8.append(c22673i4.getOrCreateKotlinClass(C21663p.class));
                                sb8.append("; found ");
                                sb8.append(c22673i4.getOrCreateKotlinClass(abstractC5583nM128689i6.getClass()));
                                throw new DeserializationException(sb8.toString());
                            }
                            str7 = ((C21663p) abstractC5583nM128689i6).f83177c;
                        } else {
                            c40137a.m128699s();
                        }
                        break;
                    case -56506402:
                        if (str9.equals("refreshToken")) {
                            AbstractC5583n abstractC5583nM128689i7 = c40137a.m128689i();
                            if (abstractC5583nM128689i7.getClass() != C21663p.class) {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append("expected ");
                                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                                sb9.append(c22673i5.getOrCreateKotlinClass(C21663p.class));
                                sb9.append("; found ");
                                sb9.append(c22673i5.getOrCreateKotlinClass(abstractC5583nM128689i7.getClass()));
                                throw new DeserializationException(sb9.toString());
                            }
                            str4 = ((C21663p) abstractC5583nM128689i7).f83177c;
                        } else {
                            c40137a.m128699s();
                        }
                        break;
                    case 250196615:
                        if (str9.equals("expiresAt")) {
                            AbstractC5583n abstractC5583nM128689i8 = c40137a.m128689i();
                            if (abstractC5583nM128689i8.getClass() != C21663p.class) {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("expected ");
                                C22673i0 c22673i6 = AbstractC22671h0.f89337a;
                                sb10.append(c22673i6.getOrCreateKotlinClass(C21663p.class));
                                sb10.append("; found ");
                                sb10.append(c22673i6.getOrCreateKotlinClass(abstractC5583nM128689i8.getClass()));
                                throw new DeserializationException(sb10.toString());
                            }
                            str2 = ((C21663p) abstractC5583nM128689i8).f83177c;
                        } else {
                            c40137a.m128699s();
                        }
                        break;
                    case 908408390:
                        if (str9.equals("clientId")) {
                            AbstractC5583n abstractC5583nM128689i9 = c40137a.m128689i();
                            if (abstractC5583nM128689i9.getClass() != C21663p.class) {
                                StringBuilder sb11 = new StringBuilder();
                                sb11.append("expected ");
                                C22673i0 c22673i7 = AbstractC22671h0.f89337a;
                                sb11.append(c22673i7.getOrCreateKotlinClass(C21663p.class));
                                sb11.append("; found ");
                                sb11.append(c22673i7.getOrCreateKotlinClass(abstractC5583nM128689i9.getClass()));
                                throw new DeserializationException(sb11.toString());
                            }
                            str5 = ((C21663p) abstractC5583nM128689i9).f83177c;
                        } else {
                            c40137a.m128699s();
                        }
                        break;
                    case 1316787629:
                        if (str9.equals("startUrl")) {
                            AbstractC5583n abstractC5583nM128689i10 = c40137a.m128689i();
                            if (abstractC5583nM128689i10.getClass() != C21663p.class) {
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append("expected ");
                                C22673i0 c22673i8 = AbstractC22671h0.f89337a;
                                sb12.append(c22673i8.getOrCreateKotlinClass(C21663p.class));
                                sb12.append("; found ");
                                sb12.append(c22673i8.getOrCreateKotlinClass(abstractC5583nM128689i10.getClass()));
                                throw new DeserializationException(sb12.toString());
                            }
                            str8 = ((C21663p) abstractC5583nM128689i10).f83177c;
                        } else {
                            c40137a.m128699s();
                        }
                        break;
                    default:
                        c40137a.m128699s();
                        break;
                }
            }
        } catch (Exception e5) {
            throw new InvalidSsoTokenException("invalid cached SSO token", e5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final byte[] m119048e(C37113q0 token) {
        AbstractC22676k.m65750j(token, "token");
        C12803b c12803b = new C12803b(true);
        c12803b.m35863f();
        c12803b.m35874q("accessToken");
        c12803b.m35875r(token.f158772a);
        c12803b.m35874q("expiresAt");
        C34913b c34913b = token.f158773b;
        EnumC34931t enumC34931t = EnumC34931t.f147048w;
        c12803b.m35875r(c34913b.m110113b(enumC34931t));
        m119049f(c12803b, "refreshToken", token.f158774c);
        m119049f(c12803b, "clientId", token.f158775d);
        m119049f(c12803b, "clientSecret", token.f158776e);
        C34913b c34913b2 = token.f158777f;
        m119049f(c12803b, "registrationExpiresAt", c34913b2 != null ? c34913b2.m110113b(enumC34931t) : null);
        m119049f(c12803b, "region", token.f158778g);
        m119049f(c12803b, "startUrl", token.f158779h);
        c12803b.m35868k();
        return c12803b.m35869l();
    }

    /* JADX INFO: renamed from: f */
    public static final void m119049f(C12803b c12803b, String str, String str2) {
        if (str2 == null) {
            return;
        }
        c12803b.m35874q(str);
        c12803b.m35875r(str2);
    }
}

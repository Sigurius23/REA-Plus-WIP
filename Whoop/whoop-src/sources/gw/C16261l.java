package gw;

import b30.C2570m;
import com.nimbusds.jose.JOSEException;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import p263jw.AbstractC21975a;
import p628xw.AbstractC38676f;
import p628xw.C38672b;

/* JADX INFO: renamed from: gw.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C16261l extends AbstractC16256g {

    /* JADX INFO: renamed from: E */
    public C38672b f61843E;

    /* JADX INFO: renamed from: F */
    public C38672b f61844F;

    /* JADX INFO: renamed from: G */
    public int f61845G;

    /* JADX INFO: renamed from: x */
    public C16260k f61846x;

    /* JADX INFO: renamed from: y */
    public C38672b f61847y;

    /* JADX INFO: renamed from: z */
    public C38672b f61848z;

    public C16261l(C16260k c16260k, C16267r c16267r) {
        this.f61846x = c16260k;
        this.f61804w = c16267r;
        this.f61847y = null;
        this.f61843E = null;
        this.f61845G = 1;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m46081b(InterfaceC16259j interfaceC16259j) {
        try {
            if (this.f61845G != 1) {
                throw new IllegalStateException("The JWE object must be in an unencrypted state");
            }
            m46082c(interfaceC16259j);
            try {
                try {
                    C16260k c16260k = this.f61846x;
                    C16267r c16267r = this.f61804w;
                    byte[] bytes = c16267r.f61875x;
                    if (bytes == null) {
                        C38672b c38672b = c16267r.f61876y;
                        if (c38672b != null) {
                            bytes = c38672b.m124047a();
                        } else {
                            String string = c16267r.toString();
                            bytes = string != null ? string.getBytes(AbstractC38676f.f166480a) : null;
                        }
                    }
                    C2570m c2570mMo46079a = interfaceC16259j.mo46079a(c16260k, bytes, this.f61846x.m46075a().f166476w.getBytes(StandardCharsets.US_ASCII));
                    C16260k c16260k2 = (C16260k) c2570mMo46079a.f9987x;
                    if (c16260k2 != null) {
                        this.f61846x = c16260k2;
                    }
                    this.f61847y = (C38672b) c2570mMo46079a.f9988y;
                    this.f61848z = (C38672b) c2570mMo46079a.f9989z;
                    this.f61843E = (C38672b) c2570mMo46079a.f9984E;
                    this.f61844F = (C38672b) c2570mMo46079a.f9985F;
                    this.f61845G = 2;
                } catch (JOSEException e5) {
                    throw e5;
                }
            } catch (Exception e13) {
                throw new JOSEException(e13.getMessage(), e13);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m46082c(InterfaceC16259j interfaceC16259j) throws JOSEException {
        AbstractC21975a abstractC21975a = (AbstractC21975a) interfaceC16259j;
        Set set = abstractC21975a.f85104a;
        if (!set.contains((C16258i) this.f61846x.f61787w)) {
            throw new JOSEException("The " + ((C16258i) this.f61846x.f61787w) + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + set);
        }
        Set set2 = abstractC21975a.f85105b;
        if (set2.contains(this.f61846x.f61830O)) {
            return;
        }
        throw new JOSEException("The " + this.f61846x.f61830O + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + set2);
    }

    /* JADX INFO: renamed from: d */
    public final String m46083d() {
        int i13 = this.f61845G;
        if (i13 != 2 && i13 != 3) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
        StringBuilder sb4 = new StringBuilder(this.f61846x.m46075a().f166476w);
        sb4.append('.');
        C38672b c38672b = this.f61847y;
        if (c38672b != null) {
            sb4.append(c38672b);
        }
        sb4.append('.');
        C38672b c38672b2 = this.f61848z;
        if (c38672b2 != null) {
            sb4.append(c38672b2);
        }
        sb4.append('.');
        sb4.append(this.f61843E);
        sb4.append('.');
        C38672b c38672b3 = this.f61844F;
        if (c38672b3 != null) {
            sb4.append(c38672b3);
        }
        return sb4.toString();
    }
}

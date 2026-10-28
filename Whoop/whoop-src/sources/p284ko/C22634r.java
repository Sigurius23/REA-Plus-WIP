package p284ko;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: ko.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C22634r implements InterfaceC22628l {

    /* JADX INFO: renamed from: E */
    public C22608b f89054E;

    /* JADX INFO: renamed from: F */
    public C22620h f89055F;

    /* JADX INFO: renamed from: G */
    public InterfaceC22628l f89056G;

    /* JADX INFO: renamed from: H */
    public C22627k0 f89057H;

    /* JADX INFO: renamed from: I */
    public C22624j f89058I;

    /* JADX INFO: renamed from: J */
    public C22617f0 f89059J;

    /* JADX INFO: renamed from: K */
    public InterfaceC22628l f89060K;

    /* JADX INFO: renamed from: w */
    public final Context f89061w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f89062x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC22628l f89063y;

    /* JADX INFO: renamed from: z */
    public C22639w f89064z;

    public C22634r(Context context, InterfaceC22628l interfaceC22628l) {
        this.f89061w = context.getApplicationContext();
        interfaceC22628l.getClass();
        this.f89063y = interfaceC22628l;
        this.f89062x = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static void m65571b(InterfaceC22628l interfaceC22628l, InterfaceC22625j0 interfaceC22625j0) {
        if (interfaceC22628l != null) {
            interfaceC22628l.mo65561y(interfaceC22625j0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m65572a(InterfaceC22628l interfaceC22628l) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f89062x;
            if (i13 >= arrayList.size()) {
                return;
            }
            interfaceC22628l.mo65561y((InterfaceC22625j0) arrayList.get(i13));
            i13++;
        }
    }

    @Override // p284ko.InterfaceC22628l
    public final void close() {
        InterfaceC22628l interfaceC22628l = this.f89060K;
        if (interfaceC22628l != null) {
            try {
                interfaceC22628l.close();
            } finally {
                this.f89060K = null;
            }
        }
    }

    @Override // p284ko.InterfaceC22628l
    public final Map getResponseHeaders() {
        InterfaceC22628l interfaceC22628l = this.f89060K;
        return interfaceC22628l == null ? Collections.EMPTY_MAP : interfaceC22628l.getResponseHeaders();
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        InterfaceC22628l interfaceC22628l = this.f89060K;
        if (interfaceC22628l == null) {
            return null;
        }
        return interfaceC22628l.getUri();
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) {
        InterfaceC22628l interfaceC22628l = this.f89060K;
        interfaceC22628l.getClass();
        return interfaceC22628l.read(bArr, i13, i14);
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: y */
    public final void mo65561y(InterfaceC22625j0 interfaceC22625j0) {
        interfaceC22625j0.getClass();
        this.f89063y.mo65561y(interfaceC22625j0);
        this.f89062x.add(interfaceC22625j0);
        m65571b(this.f89064z, interfaceC22625j0);
        m65571b(this.f89054E, interfaceC22625j0);
        m65571b(this.f89055F, interfaceC22625j0);
        m65571b(this.f89056G, interfaceC22625j0);
        m65571b(this.f89057H, interfaceC22625j0);
        m65571b(this.f89058I, interfaceC22625j0);
        m65571b(this.f89059J, interfaceC22625j0);
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) {
        AbstractC24543a.m71573i(this.f89060K == null);
        Uri uri = c22630n.f89019a;
        String scheme = uri.getScheme();
        int i13 = AbstractC24567y.f95875a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f89061w;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f89064z == null) {
                    C22639w c22639w = new C22639w(false);
                    this.f89064z = c22639w;
                    m65572a(c22639w);
                }
                this.f89060K = this.f89064z;
            } else {
                if (this.f89054E == null) {
                    C22608b c22608b = new C22608b(context);
                    this.f89054E = c22608b;
                    m65572a(c22608b);
                }
                this.f89060K = this.f89054E;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f89054E == null) {
                C22608b c22608b2 = new C22608b(context);
                this.f89054E = c22608b2;
                m65572a(c22608b2);
            }
            this.f89060K = this.f89054E;
        } else if ("content".equals(scheme)) {
            if (this.f89055F == null) {
                C22620h c22620h = new C22620h(context);
                this.f89055F = c22620h;
                m65572a(c22620h);
            }
            this.f89060K = this.f89055F;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC22628l interfaceC22628l = this.f89063y;
            if (zEquals) {
                if (this.f89056G == null) {
                    try {
                        InterfaceC22628l interfaceC22628l2 = (InterfaceC22628l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f89056G = interfaceC22628l2;
                        m65572a(interfaceC22628l2);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e5) {
                        throw new RuntimeException("Error instantiating RTMP extension", e5);
                    }
                    if (this.f89056G == null) {
                        this.f89056G = interfaceC22628l;
                    }
                }
                this.f89060K = this.f89056G;
            } else if ("udp".equals(scheme)) {
                if (this.f89057H == null) {
                    C22627k0 c22627k0 = new C22627k0();
                    this.f89057H = c22627k0;
                    m65572a(c22627k0);
                }
                this.f89060K = this.f89057H;
            } else if ("data".equals(scheme)) {
                if (this.f89058I == null) {
                    C22624j c22624j = new C22624j(false);
                    this.f89058I = c22624j;
                    m65572a(c22624j);
                }
                this.f89060K = this.f89058I;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f89059J == null) {
                    C22617f0 c22617f0 = new C22617f0(context);
                    this.f89059J = c22617f0;
                    m65572a(c22617f0);
                }
                this.f89060K = this.f89059J;
            } else {
                this.f89060K = interfaceC22628l;
            }
        }
        return this.f89060K.mo65551z(c22630n);
    }
}

package p674z8;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: z8.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C40172h implements InterfaceC40170f {

    /* JADX INFO: renamed from: E */
    public C40165a f173351E;

    /* JADX INFO: renamed from: F */
    public C40167c f173352F;

    /* JADX INFO: renamed from: G */
    public InterfaceC40170f f173353G;

    /* JADX INFO: renamed from: H */
    public C40179o f173354H;

    /* JADX INFO: renamed from: I */
    public C40168d f173355I;

    /* JADX INFO: renamed from: J */
    public C40176l f173356J;

    /* JADX INFO: renamed from: K */
    public InterfaceC40170f f173357K;

    /* JADX INFO: renamed from: w */
    public final Context f173358w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f173359x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC40170f f173360y;

    /* JADX INFO: renamed from: z */
    public C40174j f173361z;

    public C40172h(Context context, InterfaceC40170f interfaceC40170f) {
        this.f173358w = context.getApplicationContext();
        interfaceC40170f.getClass();
        this.f173360y = interfaceC40170f;
        this.f173359x = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static void m128888b(InterfaceC40170f interfaceC40170f, InterfaceC40178n interfaceC40178n) {
        if (interfaceC40170f != null) {
            interfaceC40170f.addTransferListener(interfaceC40178n);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m128889a(InterfaceC40170f interfaceC40170f) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f173359x;
            if (i13 >= arrayList.size()) {
                return;
            }
            interfaceC40170f.addTransferListener((InterfaceC40178n) arrayList.get(i13));
            i13++;
        }
    }

    @Override // p674z8.InterfaceC40170f
    public final void addTransferListener(InterfaceC40178n interfaceC40178n) {
        interfaceC40178n.getClass();
        this.f173360y.addTransferListener(interfaceC40178n);
        this.f173359x.add(interfaceC40178n);
        m128888b(this.f173361z, interfaceC40178n);
        m128888b(this.f173351E, interfaceC40178n);
        m128888b(this.f173352F, interfaceC40178n);
        m128888b(this.f173353G, interfaceC40178n);
        m128888b(this.f173354H, interfaceC40178n);
        m128888b(this.f173355I, interfaceC40178n);
        m128888b(this.f173356J, interfaceC40178n);
    }

    @Override // p674z8.InterfaceC40170f
    public final void close() {
        InterfaceC40170f interfaceC40170f = this.f173357K;
        if (interfaceC40170f != null) {
            try {
                interfaceC40170f.close();
            } finally {
                this.f173357K = null;
            }
        }
    }

    @Override // p674z8.InterfaceC40170f
    public final Map getResponseHeaders() {
        InterfaceC40170f interfaceC40170f = this.f173357K;
        return interfaceC40170f == null ? Collections.EMPTY_MAP : interfaceC40170f.getResponseHeaders();
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        InterfaceC40170f interfaceC40170f = this.f173357K;
        if (interfaceC40170f == null) {
            return null;
        }
        return interfaceC40170f.getUri();
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) {
        AbstractC35849g.m113807i(this.f173357K == null);
        Uri uri = c40171g.f173343a;
        String scheme = uri.getScheme();
        int i13 = AbstractC38065t.f163031a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f173358w;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f173361z == null) {
                    C40174j c40174j = new C40174j(false);
                    this.f173361z = c40174j;
                    m128889a(c40174j);
                }
                this.f173357K = this.f173361z;
            } else {
                if (this.f173351E == null) {
                    C40165a c40165a = new C40165a(context);
                    this.f173351E = c40165a;
                    m128889a(c40165a);
                }
                this.f173357K = this.f173351E;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f173351E == null) {
                C40165a c40165a2 = new C40165a(context);
                this.f173351E = c40165a2;
                m128889a(c40165a2);
            }
            this.f173357K = this.f173351E;
        } else if ("content".equals(scheme)) {
            if (this.f173352F == null) {
                C40167c c40167c = new C40167c(context);
                this.f173352F = c40167c;
                m128889a(c40167c);
            }
            this.f173357K = this.f173352F;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC40170f interfaceC40170f = this.f173360y;
            if (zEquals) {
                if (this.f173353G == null) {
                    try {
                        InterfaceC40170f interfaceC40170f2 = (InterfaceC40170f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f173353G = interfaceC40170f2;
                        m128889a(interfaceC40170f2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC38046a.m121826u("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e5) {
                        throw new RuntimeException("Error instantiating RTMP extension", e5);
                    }
                    if (this.f173353G == null) {
                        this.f173353G = interfaceC40170f;
                    }
                }
                this.f173357K = this.f173353G;
            } else if ("udp".equals(scheme)) {
                if (this.f173354H == null) {
                    C40179o c40179o = new C40179o();
                    this.f173354H = c40179o;
                    m128889a(c40179o);
                }
                this.f173357K = this.f173354H;
            } else if ("data".equals(scheme)) {
                if (this.f173355I == null) {
                    C40168d c40168d = new C40168d(false);
                    this.f173355I = c40168d;
                    m128889a(c40168d);
                }
                this.f173357K = this.f173355I;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f173356J == null) {
                    C40176l c40176l = new C40176l(context);
                    this.f173356J = c40176l;
                    m128889a(c40176l);
                }
                this.f173357K = this.f173356J;
            } else {
                this.f173357K = interfaceC40170f;
            }
        }
        return this.f173357K.open(c40171g);
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) {
        InterfaceC40170f interfaceC40170f = this.f173357K;
        interfaceC40170f.getClass();
        return interfaceC40170f.read(bArr, i13, i14);
    }
}

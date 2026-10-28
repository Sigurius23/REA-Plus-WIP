package p185h6;

import java.nio.ByteBuffer;
import p212i6.C18148a;

/* JADX INFO: renamed from: h6.r */
/* JADX INFO: loaded from: classes.dex */
public final class C16963r {

    /* JADX INFO: renamed from: a */
    public int f65099a = 1;

    /* JADX INFO: renamed from: b */
    public final C16966u f65100b;

    /* JADX INFO: renamed from: c */
    public C16966u f65101c;

    /* JADX INFO: renamed from: d */
    public C16966u f65102d;

    /* JADX INFO: renamed from: e */
    public int f65103e;

    /* JADX INFO: renamed from: f */
    public int f65104f;

    public C16963r(C16966u c16966u) {
        this.f65100b = c16966u;
        this.f65101c = c16966u;
    }

    /* JADX INFO: renamed from: a */
    public final void m47719a() {
        this.f65099a = 1;
        this.f65101c = this.f65100b;
        this.f65104f = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m47720b() {
        C18148a c18148aM47732b = this.f65101c.f65118b.m47732b();
        int iM52082a = c18148aM47732b.m52082a(6);
        return !(iM52082a == 0 || ((ByteBuffer) c18148aM47732b.f70446z).get(iM52082a + c18148aM47732b.f70443w) == 0) || this.f65103e == 65039;
    }
}

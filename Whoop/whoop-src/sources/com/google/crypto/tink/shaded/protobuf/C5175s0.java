package com.google.crypto.tink.shaded.protobuf;

import androidx.health.platform.client.proto.C1448d;
import nh3.AbstractC26725a;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5175s0 implements InterfaceC5124a1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC5122a f21586a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5130c1 f21587b;

    /* JADX INFO: renamed from: c */
    public final C5170q f21588c;

    public C5175s0(AbstractC5130c1 abstractC5130c1, C5170q c5170q, AbstractC5122a abstractC5122a) {
        this.f21587b = abstractC5130c1;
        c5170q.getClass();
        this.f21588c = c5170q;
        this.f21586a = abstractC5122a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: a */
    public final void mo16112a(Object obj, Object obj2) {
        AbstractC5127b1.m16134j(this.f21587b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: b */
    public final void mo16113b(Object obj) {
        ((C5136e1) this.f21587b).getClass();
        C5133d1 c5133d1 = ((AbstractC5184x) obj).unknownFields;
        if (c5133d1.f21504e) {
            c5133d1.f21504e = false;
        }
        this.f21588c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: c */
    public final boolean mo16114c(Object obj) {
        this.f21588c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: d */
    public final Object mo16115d() {
        AbstractC5122a abstractC5122a = this.f21586a;
        return abstractC5122a instanceof AbstractC5184x ? ((AbstractC5184x) abstractC5122a).m16367s() : abstractC5122a.mo16107d().m16348c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: e */
    public final int mo16116e(AbstractC5184x abstractC5184x) {
        ((C5136e1) this.f21587b).getClass();
        C5133d1 c5133d1 = abstractC5184x.unknownFields;
        int i13 = c5133d1.f21503d;
        if (i13 != -1) {
            return i13;
        }
        int iM16254h0 = 0;
        for (int i14 = 0; i14 < c5133d1.f21500a; i14++) {
            int i15 = c5133d1.f21501b[i14] >>> 3;
            iM16254h0 += C5158m.m16254h0(3, (AbstractC5146i) c5133d1.f21502c[i14]) + C5158m.m16260n0(i15) + C5158m.m16259m0(2) + (C5158m.m16259m0(1) * 2);
        }
        c5133d1.f21503d = iM16254h0;
        return iM16254h0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: f */
    public final void mo16117f(Object obj, C5155l c5155l, C5167p c5167p) {
        this.f21587b.mo16151a(obj);
        this.f21588c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: g */
    public final void mo16118g(Object obj, byte[] bArr, int i13, int i14, C1448d c1448d) {
        AbstractC5184x abstractC5184x = (AbstractC5184x) obj;
        if (abstractC5184x.unknownFields == C5133d1.f21499f) {
            abstractC5184x.unknownFields = C5133d1.m16158c();
        }
        throw AbstractC26725a.m79500d(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: h */
    public final void mo16119h(Object obj, C5153k0 c5153k0) {
        this.f21588c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: i */
    public final boolean mo16120i(AbstractC5184x abstractC5184x, AbstractC5184x abstractC5184x2) {
        C5136e1 c5136e1 = (C5136e1) this.f21587b;
        c5136e1.getClass();
        C5133d1 c5133d1 = abstractC5184x.unknownFields;
        c5136e1.getClass();
        return c5133d1.equals(abstractC5184x2.unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5124a1
    /* JADX INFO: renamed from: j */
    public final int mo16121j(AbstractC5184x abstractC5184x) {
        ((C5136e1) this.f21587b).getClass();
        return abstractC5184x.unknownFields.hashCode();
    }
}

package qa;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import mm.C25680d;
import no.nordicsemi.android.dfu.DfuBaseService;
import p499t9.C33619a0;
import p499t9.C33650s;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: qa.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C30103h implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30107l f122832a;

    /* JADX INFO: renamed from: b */
    public final C34610p f122833b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f122834c;

    /* JADX INFO: renamed from: f */
    public InterfaceC33639k0 f122837f;

    /* JADX INFO: renamed from: g */
    public int f122838g;

    /* JADX INFO: renamed from: h */
    public int f122839h;

    /* JADX INFO: renamed from: i */
    public long[] f122840i;

    /* JADX INFO: renamed from: j */
    public long f122841j;

    /* JADX INFO: renamed from: e */
    public byte[] f122836e = AbstractC38065t.f163033c;

    /* JADX INFO: renamed from: d */
    public final C38059n f122835d = new C38059n();

    public C30103h(InterfaceC30107l interfaceC30107l, C34610p c34610p) {
        C34610p c34610p2;
        this.f122832a = interfaceC30107l;
        if (c34610p != null) {
            C34608o c34608oM109410a = c34610p.m109410a();
            c34608oM109410a.f145741m = AbstractC34587d0.m109382o("application/x-media3-cues");
            c34608oM109410a.f145738j = c34610p.f145783n;
            c34608oM109410a.f145725I = interfaceC30107l.mo91110c0();
            c34610p2 = new C34610p(c34608oM109410a);
        } else {
            c34610p2 = null;
        }
        this.f122833b = c34610p2;
        this.f122834c = new ArrayList();
        this.f122839h = 0;
        this.f122840i = AbstractC38065t.f163034d;
        this.f122841j = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m92226a(C30102g c30102g) {
        AbstractC35849g.m113808j(this.f122837f);
        byte[] bArr = c30102g.f122831x;
        int length = bArr.length;
        C38059n c38059n = this.f122835d;
        c38059n.getClass();
        c38059n.m121844D(bArr.length, bArr);
        this.f122837f.mo36176d(c38059n, length, 0);
        this.f122837f.mo36174b(c30102g.f122830w, 1, length, 0, null);
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        int i13 = this.f122839h;
        AbstractC35849g.m113807i((i13 == 0 || i13 == 5) ? false : true);
        this.f122841j = j13;
        if (this.f122839h == 2) {
            this.f122839h = 1;
        }
        if (this.f122839h == 4) {
            this.f122839h = 3;
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        AbstractC35849g.m113807i(this.f122839h == 0);
        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(0, 3);
        this.f122837f = interfaceC33639k0Mo3101o;
        C34610p c34610p = this.f122833b;
        if (c34610p != null) {
            interfaceC33639k0Mo3101o.mo36173a(c34610p);
            interfaceC33648q.mo3098l();
            interfaceC33648q.mo3109v(new C33619a0(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f122839h = 1;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: RuntimeException -> 0x00c7, TryCatch #0 {RuntimeException -> 0x00c7, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:44:0x00c9, B:37:0x008c), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: RuntimeException -> 0x00c7, TryCatch #0 {RuntimeException -> 0x00c7, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:44:0x00c9, B:37:0x008c), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[Catch: RuntimeException -> 0x00c7, LOOP:1: B:39:0x00b2->B:41:0x00b8, LOOP_END, TryCatch #0 {RuntimeException -> 0x00c7, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:44:0x00c9, B:37:0x008c), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
      0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        int i13;
        long j7;
        C30106k c30106k;
        int i14;
        int i15 = this.f122839h;
        AbstractC35849g.m113807i((i15 == 0 || i15 == 5) ? false : true);
        int i16 = this.f122839h;
        int iM114016k = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i16 == 1) {
            int iM114016k2 = interfaceC33646o.getLength() != -1 ? AbstractC35903f.m114016k(interfaceC33646o.getLength()) : 1024;
            if (iM114016k2 > this.f122836e.length) {
                this.f122836e = new byte[iM114016k2];
            }
            this.f122838g = 0;
            this.f122839h = 2;
        }
        int i17 = this.f122839h;
        ArrayList arrayList = this.f122834c;
        if (i17 == 2) {
            byte[] bArr = this.f122836e;
            if (bArr.length == this.f122838g) {
                this.f122836e = Arrays.copyOf(bArr, bArr.length + DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            }
            byte[] bArr2 = this.f122836e;
            int i18 = this.f122838g;
            int i19 = interfaceC33646o.read(bArr2, i18, bArr2.length - i18);
            if (i19 != -1) {
                this.f122838g += i19;
            }
            long length = interfaceC33646o.getLength();
            if (length != -1) {
                i13 = 0;
                if (this.f122838g == length) {
                    try {
                        j7 = this.f122841j;
                        if (j7 != -9223372036854775807L) {
                            c30106k = new C30106k(j7, true);
                        } else {
                            c30106k = C30106k.f122844c;
                        }
                        this.f122832a.mo91120k(this.f122836e, 0, this.f122838g, c30106k, new C25680d(this, 19));
                        Collections.sort(arrayList);
                        this.f122840i = new long[arrayList.size()];
                        for (i14 = i13; i14 < arrayList.size(); i14++) {
                            this.f122840i[i14] = ((C30102g) arrayList.get(i14)).f122830w;
                        }
                        this.f122836e = AbstractC38065t.f163033c;
                        this.f122839h = 4;
                    } catch (RuntimeException e5) {
                        throw ParserException.m5049a(e5, "SubtitleParser failed.");
                    }
                }
            } else {
                i13 = 0;
            }
            if (i19 == -1) {
                j7 = this.f122841j;
                if (j7 != -9223372036854775807L) {
                    c30106k = new C30106k(j7, true);
                } else {
                    c30106k = C30106k.f122844c;
                }
                this.f122832a.mo91120k(this.f122836e, 0, this.f122838g, c30106k, new C25680d(this, 19));
                Collections.sort(arrayList);
                this.f122840i = new long[arrayList.size()];
                while (i14 < arrayList.size()) {
                    this.f122840i[i14] = ((C30102g) arrayList.get(i14)).f122830w;
                }
                this.f122836e = AbstractC38065t.f163033c;
                this.f122839h = 4;
            }
        } else {
            i13 = 0;
        }
        if (this.f122839h == 3) {
            if (interfaceC33646o.getLength() != -1) {
                iM114016k = AbstractC35903f.m114016k(interfaceC33646o.getLength());
            }
            if (interfaceC33646o.mo3097k(iM114016k) == -1) {
                long j13 = this.f122841j;
                for (int iM121911d = j13 == -9223372036854775807L ? i13 : AbstractC38065t.m121911d(this.f122840i, j13, true); iM121911d < arrayList.size(); iM121911d++) {
                    m92226a((C30102g) arrayList.get(iM121911d));
                }
                this.f122839h = 4;
            }
        }
        if (this.f122839h == 4) {
            return -1;
        }
        return i13;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
        if (this.f122839h == 5) {
            return;
        }
        this.f122832a.reset();
        this.f122839h = 5;
    }
}

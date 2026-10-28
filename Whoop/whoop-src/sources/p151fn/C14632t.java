package p151fn;

import android.util.Log;
import android.util.SparseArray;
import ed3.C13117a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import live.hms.video.utils.HMSConstantsKt;
import p012ab.C0690l0;
import p078d1.C11457j;
import p309lo.AbstractC24543a;
import p309lo.C24561s;
import p309lo.C24566x;
import p499t9.C33623c0;
import p499t9.C33624d;
import p499t9.C33650s;
import p588wm.C37359a;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;

/* JADX INFO: renamed from: fn.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C14632t implements InterfaceC37367i {

    /* JADX INFO: renamed from: e */
    public boolean f54011e;

    /* JADX INFO: renamed from: f */
    public boolean f54012f;

    /* JADX INFO: renamed from: g */
    public boolean f54013g;

    /* JADX INFO: renamed from: h */
    public long f54014h;

    /* JADX INFO: renamed from: i */
    public C14629q f54015i;

    /* JADX INFO: renamed from: j */
    public InterfaceC37369k f54016j;

    /* JADX INFO: renamed from: k */
    public boolean f54017k;

    /* JADX INFO: renamed from: a */
    public final C24566x f54007a = new C24566x(0);

    /* JADX INFO: renamed from: c */
    public final C13117a f54009c = new C13117a(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f54008b = new SparseArray();

    /* JADX INFO: renamed from: d */
    public final C14630r f54010d = new C14630r(0);

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        long j14;
        SparseArray sparseArray = this.f54008b;
        C24566x c24566x = this.f54007a;
        synchronized (c24566x) {
            j14 = c24566x.f95872b;
        }
        boolean z4 = j14 == -9223372036854775807L;
        if (!z4) {
            long jM71661c = c24566x.m71661c();
            z4 = (jM71661c == -9223372036854775807L || jM71661c == 0 || jM71661c == j13) ? false : true;
        }
        if (z4) {
            c24566x.m71662d(j13);
        }
        C14629q c14629q = this.f54015i;
        if (c14629q != null) {
            c14629q.m106253e(j13);
        }
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            C14631s c14631s = (C14631s) sparseArray.valueAt(i13);
            c14631s.f54005f = false;
            c14631s.f54000a.mo41817a();
        }
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C37364f c37364f = (C37364f) interfaceC37368j;
        c37364f.mo3092c(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c37364f.m119648a(bArr[13] & 7, false);
            c37364f.mo3092c(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f54016j = interfaceC37369k;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0230  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws EOFException, InterruptedIOException {
        long j7;
        ?? r10;
        InterfaceC14620h c14622j;
        long j13;
        AbstractC24543a.m71574j(this.f54016j);
        long j14 = ((C37364f) interfaceC37368j).f159851y;
        long j15 = -9223372036854775807L;
        C14630r c14630r = this.f54010d;
        if (j14 != -1) {
            j7 = 0;
            if (!c14630r.f53994d) {
                C24566x c24566x = c14630r.f53992b;
                C13117a c13117a = c14630r.f53993c;
                if (!c14630r.f53996f) {
                    C37364f c37364f = (C37364f) interfaceC37368j;
                    long j16 = c37364f.f159851y;
                    int iMin = (int) Math.min(20000L, j16);
                    long j17 = j16 - ((long) iMin);
                    if (c37364f.f159852z != j17) {
                        c33650s.f140436a = j17;
                        return 1;
                    }
                    c13117a.m36686H(iMin);
                    c37364f.f159847F = 0;
                    c37364f.mo3092c(c13117a.f45381a, 0, iMin, false);
                    int i13 = c13117a.f45382b;
                    for (int i14 = c13117a.f45383c - 4; i14 >= i13; i14--) {
                        if (C14630r.m41829b(i14, c13117a.f45381a) == 442) {
                            c13117a.m36689K(i14 + 4);
                            long jM41830c = C14630r.m41830c(c13117a);
                            if (jM41830c != -9223372036854775807L) {
                                j15 = jM41830c;
                                break;
                            }
                        }
                    }
                    c14630r.f53998h = j15;
                    c14630r.f53996f = true;
                    return 0;
                }
                if (c14630r.f53998h == -9223372036854775807L) {
                    c14630r.m41831a(interfaceC37368j);
                    return 0;
                }
                if (c14630r.f53995e) {
                    long j18 = c14630r.f53997g;
                    if (j18 == -9223372036854775807L) {
                        c14630r.m41831a(interfaceC37368j);
                        return 0;
                    }
                    long jM71660b = c24566x.m71660b(c14630r.f53998h) - c24566x.m71660b(j18);
                    c14630r.f53999i = jM71660b;
                    if (jM71660b < 0) {
                        StringBuilder sb4 = new StringBuilder(65);
                        sb4.append("Invalid duration: ");
                        sb4.append(jM71660b);
                        sb4.append(". Using TIME_UNSET instead.");
                        Log.w("PsDurationReader", sb4.toString());
                        c14630r.f53999i = -9223372036854775807L;
                    }
                    c14630r.m41831a(interfaceC37368j);
                    return 0;
                }
                C37364f c37364f2 = (C37364f) interfaceC37368j;
                int iMin2 = (int) Math.min(20000L, c37364f2.f159851y);
                long j19 = 0;
                if (c37364f2.f159852z != j19) {
                    c33650s.f140436a = j19;
                    return 1;
                }
                c13117a.m36686H(iMin2);
                c37364f2.f159847F = 0;
                c37364f2.mo3092c(c13117a.f45381a, 0, iMin2, false);
                int i15 = c13117a.f45383c;
                for (int i16 = c13117a.f45382b; i16 < i15 - 3; i16++) {
                    if (C14630r.m41829b(i16, c13117a.f45381a) == 442) {
                        c13117a.m36689K(i16 + 4);
                        long jM41830c2 = C14630r.m41830c(c13117a);
                        if (jM41830c2 != -9223372036854775807L) {
                            j13 = jM41830c2;
                            c14630r.f53997g = j13;
                            c14630r.f53995e = true;
                            return 0;
                        }
                    }
                }
                j13 = -9223372036854775807L;
                c14630r.f53997g = j13;
                c14630r.f53995e = true;
                return 0;
            }
        } else {
            j7 = 0;
        }
        if (this.f54017k) {
            r10 = 0;
        } else {
            this.f54017k = true;
            long j24 = c14630r.f53999i;
            if (j24 != -9223372036854775807L) {
                r10 = 0;
                C14629q c14629q = new C14629q(new C33623c0(), new C11457j(c14630r.f53992b), j24, j24 + 1, 0L, j14, 188L, 1000);
                this.f54015i = c14629q;
                this.f54016j.mo3111x((C37359a) c14629q.f140382c);
            } else {
                r10 = 0;
                this.f54016j.mo3111x(new C37370l(j24));
            }
        }
        C14629q c14629q2 = this.f54015i;
        if (c14629q2 != null && ((C33624d) c14629q2.f140384e) != null) {
            return c14629q2.m106252b(interfaceC37368j, c33650s);
        }
        C37364f c37364f3 = (C37364f) interfaceC37368j;
        c37364f3.f159847F = r10;
        long jMo3095g = j14 != -1 ? j14 - c37364f3.mo3095g() : -1L;
        if (jMo3095g != -1 && jMo3095g < 4) {
            return -1;
        }
        C13117a c13117a2 = this.f54009c;
        if (!c37364f3.mo3092c(c13117a2.f45381a, r10, 4, true)) {
            return -1;
        }
        c13117a2.m36689K(r10);
        int iM36699i = c13117a2.m36699i();
        if (iM36699i == 441) {
            return -1;
        }
        if (iM36699i == 442) {
            c37364f3.mo3092c(c13117a2.f45381a, r10, 10, r10);
            c13117a2.m36689K(9);
            c37364f3.mo3100n((c13117a2.m36715y() & 7) + 14);
            return r10;
        }
        if (iM36699i == 443) {
            c37364f3.mo3092c(c13117a2.f45381a, r10, 2, r10);
            c13117a2.m36689K(r10);
            c37364f3.mo3100n(c13117a2.m36682D() + 6);
            return r10;
        }
        if (((iM36699i & (-256)) >> 8) != 1) {
            c37364f3.mo3100n(1);
            return r10;
        }
        int i17 = iM36699i & 255;
        SparseArray sparseArray = this.f54008b;
        C14631s c14631s = (C14631s) sparseArray.get(i17);
        if (!this.f54011e) {
            if (c14631s == null) {
                InterfaceC14620h interfaceC14620h = null;
                if (i17 == 189) {
                    c14622j = new C14614b(null, 0);
                    this.f54012f = true;
                    this.f54014h = c37364f3.f159852z;
                } else if ((iM36699i & 224) == 192) {
                    c14622j = new C14627o(null);
                    this.f54012f = true;
                    this.f54014h = c37364f3.f159852z;
                } else if ((iM36699i & 240) == 224) {
                    c14622j = new C14622j(null);
                    this.f54013g = true;
                    this.f54014h = c37364f3.f159852z;
                } else if (interfaceC14620h != null) {
                    interfaceC14620h.mo1712g(this.f54016j, new C0690l0(i17, 256, 1, (byte) 0));
                    c14631s = new C14631s(interfaceC14620h, this.f54007a);
                    sparseArray.put(i17, c14631s);
                }
                interfaceC14620h = c14622j;
                if (interfaceC14620h != null) {
                    interfaceC14620h.mo1712g(this.f54016j, new C0690l0(i17, 256, 1, (byte) 0));
                    c14631s = new C14631s(interfaceC14620h, this.f54007a);
                    sparseArray.put(i17, c14631s);
                }
            }
            if (c37364f3.f159852z > ((this.f54012f && this.f54013g) ? this.f54014h + HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE : 1048576L)) {
                this.f54011e = true;
                this.f54016j.mo3098l();
            }
        }
        c37364f3.mo3092c(c13117a2.f45381a, r10, 2, r10);
        c13117a2.m36689K(r10);
        int iM36682D = c13117a2.m36682D() + 6;
        if (c14631s == null) {
            c37364f3.mo3100n(iM36682D);
            return r10;
        }
        c13117a2.m36686H(iM36682D);
        c37364f3.mo3094f(c13117a2.f45381a, r10, iM36682D, r10);
        c13117a2.m36689K(6);
        InterfaceC14620h interfaceC14620h2 = c14631s.f54000a;
        C24561s c24561s = c14631s.f54002c;
        c13117a2.m36697g(c24561s.f95858b, r10, 3);
        c24561s.m71640q(r10);
        c24561s.m71643t(8);
        c14631s.f54003d = c24561s.m71631h();
        c14631s.f54004e = c24561s.m71631h();
        c24561s.m71643t(6);
        c13117a2.m36697g(c24561s.f95858b, r10, c24561s.m71632i(8));
        c24561s.m71640q(r10);
        C24566x c24566x2 = c14631s.f54001b;
        c14631s.f54006g = 0L;
        if (c14631s.f54003d) {
            c24561s.m71643t(4);
            long jM71632i = ((long) c24561s.m71632i(3)) << 30;
            c24561s.m71643t(1);
            long jM71632i2 = jM71632i | ((long) (c24561s.m71632i(15) << 15));
            c24561s.m71643t(1);
            long jM71632i3 = jM71632i2 | ((long) c24561s.m71632i(15));
            c24561s.m71643t(1);
            if (!c14631s.f54005f && c14631s.f54004e) {
                c24561s.m71643t(4);
                long jM71632i4 = ((long) c24561s.m71632i(3)) << 30;
                c24561s.m71643t(1);
                long jM71632i5 = jM71632i4 | ((long) (c24561s.m71632i(15) << 15));
                c24561s.m71643t(1);
                long jM71632i6 = ((long) c24561s.m71632i(15)) | jM71632i5;
                c24561s.m71643t(1);
                c24566x2.m71660b(jM71632i6);
                c14631s.f54005f = true;
            }
            c14631s.f54006g = c24566x2.m71660b(jM71632i3);
        }
        interfaceC14620h2.mo41818d(4, c14631s.f54006g);
        interfaceC14620h2.mo1711f(c13117a2);
        interfaceC14620h2.mo1713h();
        c13117a2.m36688J(c13117a2.f45381a.length);
        return r10;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}

package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import ne3.C26616h;
import ne3.C26624l;
import ne3.InterfaceC26618i;
import ne3.InterfaceC26620j;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C5587r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC26620j f22106a;

    /* JADX INFO: renamed from: b */
    public long f22107b;

    /* JADX INFO: renamed from: d */
    public int f22109d;

    /* JADX INFO: renamed from: h */
    public EnumC5573d f22113h;

    /* JADX INFO: renamed from: c */
    public long f22108c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f22110e = 2;

    /* JADX INFO: renamed from: f */
    public int f22111f = -1;

    /* JADX INFO: renamed from: g */
    public long f22112g = -1;

    /* JADX INFO: renamed from: i */
    public final ArrayList f22114i = new ArrayList();

    public C5587r(InterfaceC26620j interfaceC26620j) {
        this.f22106a = interfaceC26620j;
    }

    /* JADX INFO: renamed from: a */
    public final void m16804a(int i13, EnumC5573d fieldEncoding, Object obj) {
        AbstractC22676k.m65750j(fieldEncoding, "fieldEncoding");
        C5588s c5588s = new C5588s((InterfaceC26618i) this.f22114i.get(this.f22109d - 1));
        AbstractC5586q abstractC5586qM16739a = fieldEncoding.m16739a();
        AbstractC22676k.m65748h(abstractC5586qM16739a, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        abstractC5586qM16739a.encodeWithTag(c5588s, i13, obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m16805b(int i13) throws IOException {
        if (this.f22110e == i13) {
            this.f22110e = 6;
            return;
        }
        long j7 = this.f22107b;
        long j13 = this.f22108c;
        if (j7 > j13) {
            throw new IOException("Expected to end at " + this.f22108c + " but was " + this.f22107b);
        }
        if (j7 != j13) {
            this.f22110e = 7;
            return;
        }
        this.f22108c = this.f22112g;
        this.f22112g = -1L;
        this.f22110e = 6;
    }

    /* JADX INFO: renamed from: c */
    public final long m16806c() {
        if (this.f22110e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f22110e);
        }
        long j7 = this.f22108c - this.f22107b;
        this.f22106a.mo79207g0(j7);
        this.f22110e = 6;
        this.f22107b = this.f22108c;
        this.f22108c = this.f22112g;
        this.f22112g = -1L;
        return j7;
    }

    /* JADX INFO: renamed from: d */
    public final long m16807d() {
        if (this.f22110e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i13 = this.f22109d + 1;
        this.f22109d = i13;
        if (i13 > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        ArrayList arrayList = this.f22114i;
        if (i13 > arrayList.size()) {
            arrayList.add(new C26616h());
        }
        long j7 = this.f22112g;
        this.f22112g = -1L;
        this.f22110e = 6;
        return j7;
    }

    /* JADX INFO: renamed from: e */
    public final C26624l m16808e(long j7) {
        if (this.f22110e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i13 = this.f22109d - 1;
        this.f22109d = i13;
        if (i13 < 0 || this.f22112g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f22107b == this.f22108c || i13 == 0) {
            this.f22108c = j7;
            C26616h c26616h = (C26616h) this.f22114i.get(i13);
            long j13 = c26616h.f105866x;
            return j13 > 0 ? c26616h.mo79218m0(j13) : C26624l.f105881E;
        }
        throw new IOException("Expected to end at " + this.f22108c + " but was " + this.f22107b);
    }

    /* JADX INFO: renamed from: f */
    public final int m16809f() throws ProtocolException {
        int i13;
        InterfaceC26620j interfaceC26620j = this.f22106a;
        interfaceC26620j.mo79207g0(1L);
        this.f22107b++;
        byte b = interfaceC26620j.readByte();
        if (b >= 0) {
            return b;
        }
        int i14 = b & 127;
        interfaceC26620j.mo79207g0(1L);
        this.f22107b++;
        byte b6 = interfaceC26620j.readByte();
        if (b6 >= 0) {
            i13 = b6 << 7;
        } else {
            i14 |= (b6 & 127) << 7;
            interfaceC26620j.mo79207g0(1L);
            this.f22107b++;
            byte b8 = interfaceC26620j.readByte();
            if (b8 >= 0) {
                i13 = b8 << 14;
            } else {
                i14 |= (b8 & 127) << 14;
                interfaceC26620j.mo79207g0(1L);
                this.f22107b++;
                byte b14 = interfaceC26620j.readByte();
                if (b14 < 0) {
                    int i15 = i14 | ((b14 & 127) << 21);
                    interfaceC26620j.mo79207g0(1L);
                    this.f22107b++;
                    byte b15 = interfaceC26620j.readByte();
                    int i16 = i15 | (b15 << 28);
                    if (b15 < 0) {
                        for (int i17 = 0; i17 < 5; i17++) {
                            interfaceC26620j.mo79207g0(1L);
                            this.f22107b++;
                            if (interfaceC26620j.readByte() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i16;
                }
                i13 = b14 << 21;
            }
        }
        return i13 | i14;
    }

    /* JADX INFO: renamed from: g */
    public final int m16810g() {
        int i13 = this.f22110e;
        if (i13 == 7) {
            this.f22110e = 2;
            return this.f22111f;
        }
        if (i13 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f22107b < this.f22108c && !this.f22106a.mo79222o()) {
            int iM16809f = m16809f();
            if (iM16809f == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i14 = iM16809f >> 3;
            this.f22111f = i14;
            int i15 = iM16809f & 7;
            if (i15 == 0) {
                this.f22113h = EnumC5573d.VARINT;
                this.f22110e = 0;
                return i14;
            }
            if (i15 == 1) {
                this.f22113h = EnumC5573d.FIXED64;
                this.f22110e = 1;
                return i14;
            }
            if (i15 == 2) {
                this.f22113h = EnumC5573d.LENGTH_DELIMITED;
                this.f22110e = 2;
                int iM16809f2 = m16809f();
                if (iM16809f2 < 0) {
                    throw new ProtocolException(AbstractC2875y.m8295h(iM16809f2, "Negative length: "));
                }
                if (this.f22112g != -1) {
                    throw new IllegalStateException();
                }
                long j7 = this.f22108c;
                this.f22112g = j7;
                long j13 = this.f22107b + ((long) iM16809f2);
                this.f22108c = j13;
                if (j13 <= j7) {
                    return this.f22111f;
                }
                throw new EOFException();
            }
            if (i15 != 3) {
                if (i15 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i15 != 5) {
                    throw new ProtocolException(AbstractC2875y.m8295h(i15, "Unexpected field encoding: "));
                }
                this.f22113h = EnumC5573d.FIXED32;
                this.f22110e = 5;
                return i14;
            }
            m16817n(i14);
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final int m16811h() throws IOException {
        int i13 = this.f22110e;
        if (i13 != 5 && i13 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f22110e);
        }
        InterfaceC26620j interfaceC26620j = this.f22106a;
        interfaceC26620j.mo79207g0(4L);
        this.f22107b += (long) 4;
        int iMo79192Q0 = interfaceC26620j.mo79192Q0();
        m16805b(5);
        return iMo79192Q0;
    }

    /* JADX INFO: renamed from: i */
    public final long m16812i() throws IOException {
        int i13 = this.f22110e;
        if (i13 != 1 && i13 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f22110e);
        }
        InterfaceC26620j interfaceC26620j = this.f22106a;
        interfaceC26620j.mo79207g0(8L);
        this.f22107b += (long) 8;
        long jMo79204e0 = interfaceC26620j.mo79204e0();
        m16805b(1);
        return jMo79204e0;
    }

    /* JADX INFO: renamed from: j */
    public final void m16813j(int i13) {
        EnumC5573d enumC5573d = this.f22113h;
        AbstractC22676k.m65747g(enumC5573d);
        m16804a(i13, enumC5573d, enumC5573d.m16739a().decode(this));
    }

    /* JADX INFO: renamed from: k */
    public final int m16814k() {
        int i13 = this.f22110e;
        if (i13 == 0 || i13 == 2) {
            int iM16809f = m16809f();
            m16805b(0);
            return iM16809f;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f22110e);
    }

    /* JADX INFO: renamed from: l */
    public final long m16815l() {
        int i13 = this.f22110e;
        if (i13 != 0 && i13 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f22110e);
        }
        long j7 = 0;
        for (int i14 = 0; i14 < 64; i14 += 7) {
            InterfaceC26620j interfaceC26620j = this.f22106a;
            interfaceC26620j.mo79207g0(1L);
            this.f22107b++;
            byte b = interfaceC26620j.readByte();
            j7 |= ((long) (b & 127)) << i14;
            if ((b & 128) == 0) {
                m16805b(0);
                return j7;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    /* JADX INFO: renamed from: m */
    public final void m16816m() {
        int i13 = this.f22110e;
        if (i13 == 0) {
            m16815l();
            return;
        }
        if (i13 == 1) {
            m16812i();
            return;
        }
        if (i13 == 2) {
            this.f22106a.skip(m16806c());
        } else {
            if (i13 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            m16811h();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m16817n(int i13) throws IOException {
        while (this.f22107b < this.f22108c) {
            InterfaceC26620j interfaceC26620j = this.f22106a;
            if (interfaceC26620j.mo79222o()) {
                break;
            }
            int iM16809f = m16809f();
            if (iM16809f == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i14 = iM16809f >> 3;
            int i15 = iM16809f & 7;
            if (i15 == 0) {
                this.f22110e = 0;
                m16815l();
            } else if (i15 == 1) {
                this.f22110e = 1;
                m16812i();
            } else if (i15 == 2) {
                long jM16809f = m16809f();
                this.f22107b += jM16809f;
                interfaceC26620j.skip(jM16809f);
            } else if (i15 == 3) {
                m16817n(i14);
            } else if (i15 == 4) {
                if (i14 != i13) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i15 != 5) {
                    throw new ProtocolException(AbstractC2875y.m8295h(i15, "Unexpected field encoding: "));
                }
                this.f22110e = 5;
                m16811h();
            }
        }
        throw new EOFException();
    }
}

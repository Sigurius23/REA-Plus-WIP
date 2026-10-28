package com.squareup.wire;

import ne3.C26624l;
import ne3.InterfaceC26618i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C5588s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC26618i f22115a;

    public C5588s(InterfaceC26618i sink) {
        AbstractC22676k.m65750j(sink, "sink");
        this.f22115a = sink;
    }

    /* JADX INFO: renamed from: a */
    public final void m16818a(C26624l value) {
        AbstractC22676k.m65750j(value, "value");
        this.f22115a.mo79191Q(value);
    }

    /* JADX INFO: renamed from: b */
    public final void m16819b(int i13, EnumC5573d fieldEncoding) {
        AbstractC22676k.m65750j(fieldEncoding, "fieldEncoding");
        m16820c((i13 << 3) | fieldEncoding.f22090w);
    }

    /* JADX INFO: renamed from: c */
    public final void m16820c(int i13) {
        while (true) {
            int i14 = i13 & (-128);
            InterfaceC26618i interfaceC26618i = this.f22115a;
            if (i14 == 0) {
                interfaceC26618i.writeByte(i13);
                return;
            } else {
                interfaceC26618i.writeByte((i13 & 127) | 128);
                i13 >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16821d(long j7) {
        while (true) {
            long j13 = (-128) & j7;
            InterfaceC26618i interfaceC26618i = this.f22115a;
            if (j13 == 0) {
                interfaceC26618i.writeByte((int) j7);
                return;
            } else {
                interfaceC26618i.writeByte((((int) j7) & 127) | 128);
                j7 >>>= 7;
            }
        }
    }
}

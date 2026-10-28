package p163g1;

import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p238j0.C21078d;
import p238j0.C21080f;
import p238j0.C21086l;
import p238j0.InterfaceC21082h;
import p505ts.AbstractC34132o;
import p636y3.C39174f;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.z2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15208z2 {

    /* JADX INFO: renamed from: a */
    public float f57099a;

    /* JADX INFO: renamed from: b */
    public float f57100b;

    /* JADX INFO: renamed from: c */
    public float f57101c;

    /* JADX INFO: renamed from: d */
    public float f57102d;

    /* JADX INFO: renamed from: e */
    public final C11344e f57103e;

    /* JADX INFO: renamed from: f */
    public InterfaceC21082h f57104f;

    /* JADX INFO: renamed from: g */
    public InterfaceC21082h f57105g;

    public C15208z2(float f13, float f14, float f15, float f16) {
        this.f57099a = f13;
        this.f57100b = f14;
        this.f57101c = f15;
        this.f57102d = f16;
        this.f57103e = new C11344e(new C39174f(f13), AbstractC11348f.f36369k, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [j0.h] */
    /* JADX WARN: Type inference failed for: r6v1, types: [j0.h] */
    /* JADX WARN: Type inference failed for: r6v2, types: [j0.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, l83.a0] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: a */
    public final Object m43226a(InterfaceC21082h interfaceC21082h, AbstractC32269c abstractC32269c) {
        C15188x2 c15188x2;
        float f13;
        ?? r10;
        C11344e c11344e = this.f57103e;
        if (abstractC32269c instanceof C15188x2) {
            c15188x2 = (C15188x2) abstractC32269c;
            int i13 = c15188x2.f57004z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15188x2.f57004z = i13 - Integer.MIN_VALUE;
            } else {
                c15188x2 = new C15188x2(this, abstractC32269c);
            }
        } else {
            c15188x2 = new C15188x2(this, abstractC32269c);
        }
        Object obj = c15188x2.f57002x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15188x2.f57004z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                if (interfaceC21082h instanceof C21086l) {
                    f13 = this.f57100b;
                } else if (interfaceC21082h instanceof C21080f) {
                    f13 = this.f57101c;
                } else {
                    f13 = interfaceC21082h instanceof C21078d ? this.f57102d : this.f57099a;
                }
                this.f57105g = interfaceC21082h;
                r10 = interfaceC21082h;
                if (!C39174f.m124782b(((C39174f) c11344e.f36345e.getValue()).f168413w, f13)) {
                    InterfaceC21082h interfaceC21082h2 = this.f57104f;
                    c15188x2.f57001w = interfaceC21082h;
                    c15188x2.f57004z = 1;
                    if (AbstractC15148t2.m43191a(c11344e, f13, interfaceC21082h2, interfaceC21082h, c15188x2) == enumC31071a) {
                        r10 = interfaceC21082h;
                        return enumC31071a;
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC21082h interfaceC21082h3 = c15188x2.f57001w;
                AbstractC34132o.m107864I(obj);
                r10 = interfaceC21082h3;
            }
            r10 = interfaceC21082h;
            this.f57104f = r10;
            interfaceC21082h = C23454a0.f92919a;
            return interfaceC21082h;
        } catch (Throwable th3) {
            this.f57104f = interfaceC21082h;
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m43227b(AbstractC32269c abstractC32269c) {
        C15198y2 c15198y2;
        float f13;
        if (abstractC32269c instanceof C15198y2) {
            c15198y2 = (C15198y2) abstractC32269c;
            int i13 = c15198y2.f57058y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15198y2.f57058y = i13 - Integer.MIN_VALUE;
            } else {
                c15198y2 = new C15198y2(this, abstractC32269c);
            }
        } else {
            c15198y2 = new C15198y2(this, abstractC32269c);
        }
        Object obj = c15198y2.f57056w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15198y2.f57058y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21082h interfaceC21082h = this.f57105g;
                if (interfaceC21082h instanceof C21086l) {
                    f13 = this.f57100b;
                } else if (interfaceC21082h instanceof C21080f) {
                    f13 = this.f57101c;
                } else {
                    f13 = interfaceC21082h instanceof C21078d ? this.f57102d : this.f57099a;
                }
                C11344e c11344e = this.f57103e;
                if (!C39174f.m124782b(((C39174f) c11344e.f36345e.getValue()).f168413w, f13)) {
                    C39174f c39174f = new C39174f(f13);
                    c15198y2.f57058y = 1;
                    if (c11344e.m30551g(c39174f, c15198y2) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f57104f = this.f57105g;
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            this.f57104f = this.f57105g;
            throw th3;
        }
    }
}

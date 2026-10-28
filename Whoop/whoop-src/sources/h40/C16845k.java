package h40;

import ec3.AbstractC13091v;
import ec3.C13084s1;
import h00.C16500f;
import h02.C16587n0;
import l83.C23454a0;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p163g1.C15199y3;
import p390p1.AbstractC28683x;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h40.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C16845k {

    /* JADX INFO: renamed from: a */
    public final C15199y3 f64729a;

    /* JADX INFO: renamed from: b */
    public final C16838d f64730b;

    /* JADX INFO: renamed from: c */
    public EnumC16841g f64731c;

    public C16845k(C15199y3 modalBottomSheetState, C16838d keyboardHandler) {
        AbstractC22676k.m65750j(modalBottomSheetState, "modalBottomSheetState");
        AbstractC22676k.m65750j(keyboardHandler, "keyboardHandler");
        this.f64729a = modalBottomSheetState;
        this.f64730b = keyboardHandler;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Enum m47441a(AbstractC32269c abstractC32269c) {
        C16842h c16842h;
        C16845k c16845k;
        if (abstractC32269c instanceof C16842h) {
            c16842h = (C16842h) abstractC32269c;
            int i13 = c16842h.f64720z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16842h.f64720z = i13 - Integer.MIN_VALUE;
            } else {
                c16842h = new C16842h(this, abstractC32269c);
            }
        } else {
            c16842h = new C16842h(this, abstractC32269c);
        }
        Object obj = c16842h.f64718x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16842h.f64720z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C16840f(this, 0));
            C16837c c16837c = new C16837c(2, 1, null);
            c16842h.f64717w = this;
            c16842h.f64720z = 1;
            if (AbstractC13091v.m36616z(c13084s1M87240H, c16837c, c16842h) == enumC31071a) {
                return enumC31071a;
            }
            c16845k = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16845k = c16842h.f64717w;
            AbstractC34132o.m107864I(obj);
        }
        EnumC16841g enumC16841g = c16845k.f64731c;
        return enumC16841g == null ? EnumC16841g.f64715x : enumC16841g;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m47442b(AbstractC32269c abstractC32269c) {
        C16843i c16843i;
        Object objM36616z;
        C16845k c16845k;
        if (abstractC32269c instanceof C16843i) {
            c16843i = (C16843i) abstractC32269c;
            int i13 = c16843i.f64724z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16843i.f64724z = i13 - Integer.MIN_VALUE;
            } else {
                c16843i = new C16843i(this, abstractC32269c);
            }
        } else {
            c16843i = new C16843i(this, abstractC32269c);
        }
        Object obj = c16843i.f64722x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16843i.f64724z;
        InterfaceC30057d interfaceC30057d = null;
        int i15 = 2;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f64731c = EnumC16841g.f64714w;
            c16843i.f64721w = this;
            c16843i.f64724z = 1;
            C16838d c16838d = this.f64730b;
            if (((Boolean) c16838d.f64708b.getValue()).booleanValue()) {
                InterfaceC2464x2 interfaceC2464x2 = c16838d.f64707a;
                if (interfaceC2464x2 != null) {
                    ((C2463x1) interfaceC2464x2).m7442a();
                }
                objM36616z = AbstractC13091v.m36616z(AbstractC28683x.m87240H(new C16587n0(c16838d, 5)), new C16837c(i15, 0, interfaceC30057d), c16843i);
                if (objM36616z != enumC31071a) {
                    objM36616z = c23454a0;
                }
                if (objM36616z != enumC31071a) {
                    objM36616z = c23454a0;
                }
            } else {
                objM36616z = c23454a0;
            }
            if (objM36616z != enumC31071a) {
                c16845k = this;
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        c16845k = c16843i.f64721w;
        AbstractC34132o.m107864I(obj);
        if (c16845k.f64729a.m43224e()) {
            C16500f c16500f = new C16500f(c16845k, interfaceC30057d, 1);
            c16843i.f64721w = null;
            c16843i.f64724z = 2;
            if (AbstractC35902e.m113964g(10, c16500f, c16843i) == enumC31071a) {
                return enumC31071a;
            }
        }
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (ec3.AbstractC13091v.m36616z(r7, r2, r0) == r1) goto L22;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m47443c(s83.AbstractC32269c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h40.C16844j
            if (r0 == 0) goto L13
            r0 = r7
            h40.j r0 = (h40.C16844j) r0
            int r1 = r0.f64728z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64728z = r1
            goto L18
        L13:
            h40.j r0 = new h40.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f64726x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f64728z
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L39
            if (r2 == r3) goto L33
            if (r2 != r5) goto L2b
            p505ts.AbstractC34132o.m107864I(r7)
            goto L6b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            h40.k r2 = r0.f64725w
            p505ts.AbstractC34132o.m107864I(r7)
            goto L50
        L39:
            p505ts.AbstractC34132o.m107864I(r7)
            h00.f r7 = new h00.f
            r2 = 2
            r7.<init>(r6, r4, r2)
            r0.f64725w = r6
            r0.f64728z = r3
            r2 = 10
            java.lang.Object r7 = p550vd.AbstractC35902e.m113964g(r2, r7, r0)
            if (r7 != r1) goto L4f
            goto L6a
        L4f:
            r2 = r6
        L50:
            h40.f r7 = new h40.f
            r3 = 1
            r7.<init>(r2, r3)
            ec3.s1 r7 = p390p1.AbstractC28683x.m87240H(r7)
            h40.c r2 = new h40.c
            r3 = 2
            r2.<init>(r5, r3, r4)
            r0.f64725w = r4
            r0.f64728z = r5
            java.lang.Object r7 = ec3.AbstractC13091v.m36616z(r7, r2, r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h40.C16845k.m47443c(s83.c):java.lang.Object");
    }
}

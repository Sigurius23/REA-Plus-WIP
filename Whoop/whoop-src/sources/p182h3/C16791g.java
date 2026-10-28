package p182h3;

import com.squareup.wire.AbstractC5583n;
import l83.C23454a0;
import p163g1.C15065l;
import p318m3.C24983m;
import p505ts.AbstractC34132o;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C16791g {

    /* JADX INFO: renamed from: a */
    public int f64543a;

    /* JADX INFO: renamed from: b */
    public float f64544b;

    /* JADX INFO: renamed from: c */
    public final Object f64545c;

    public C16791g(int i13, C15065l c15065l) {
        this.f64543a = i13;
        this.f64545c = c15065l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: a */
    public float m47336a(int i13, boolean z4, boolean z13, boolean z14) {
        boolean z15;
        C24983m c24983m = (C24983m) this.f64545c;
        int i14 = 1;
        if (z4) {
            int iM16750I = AbstractC5583n.m16750I(c24983m.f97768f, i13, z4);
            int lineStart = c24983m.f97768f.getLineStart(iM16750I);
            int iM73312f = c24983m.m73312f(iM16750I);
            if (i13 == lineStart || i13 == iM73312f) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        int i15 = i13 * 4;
        if (!z14) {
            i14 = z15 ? 2 : 3;
        } else if (z15) {
            i14 = 0;
        }
        int i16 = i15 + i14;
        if (this.f64543a == i16) {
            return this.f64544b;
        }
        float fM73314h = z14 ? c24983m.m73314h(i13, z4) : c24983m.m73315i(i13, z4);
        if (z13) {
            this.f64543a = i16;
            this.f64544b = fM73314h;
        }
        return fM73314h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m47337b(float f13, AbstractC32269c abstractC32269c) {
        C16790f c16790f;
        if (abstractC32269c instanceof C16790f) {
            c16790f = (C16790f) abstractC32269c;
            int i13 = c16790f.f64542y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16790f.f64542y = i13 - Integer.MIN_VALUE;
            } else {
                c16790f = new C16790f(this, abstractC32269c);
            }
        } else {
            c16790f = new C16790f(this, abstractC32269c);
        }
        Object objInvoke = c16790f.f64540w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16790f.f64542y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            C15065l c15065l = (C15065l) this.f64545c;
            Float f14 = new Float(f13);
            c16790f.f64542y = 1;
            objInvoke = c15065l.invoke(f14, c16790f);
            if (objInvoke == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objInvoke);
        }
        this.f64544b += ((Number) objInvoke).floatValue();
        return C23454a0.f92919a;
    }

    public C16791g(C24983m c24983m) {
        this.f64545c = c24983m;
        this.f64543a = -1;
    }
}

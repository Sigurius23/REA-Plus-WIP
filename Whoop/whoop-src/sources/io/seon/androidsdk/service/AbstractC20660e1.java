package io.seon.androidsdk.service;

import java.io.EOFException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import s30.AbstractC32100b;

/* JADX INFO: renamed from: io.seon.androidsdk.service.e1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20660e1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77285a;

    /* JADX INFO: renamed from: b */
    public int f77286b;

    /* JADX INFO: renamed from: c */
    public int f77287c;

    /* JADX INFO: renamed from: d */
    public int f77288d;

    /* JADX INFO: renamed from: e */
    public int f77289e;

    /* JADX INFO: renamed from: f */
    public final int f77290f;

    /* JADX INFO: renamed from: g */
    public final Object f77291g;

    public AbstractC20660e1(int i13, int i14) {
        this.f77285a = 0;
        this.f77286b = 0;
        this.f77287c = 0;
        this.f77288d = 0;
        this.f77290f = i14;
        this.f77289e = i13;
        this.f77291g = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i13, i14);
    }

    /* JADX INFO: renamed from: a */
    public void mo56787a(float[] fArr) {
        int length = fArr.length;
        int i13 = this.f77290f;
        if (length < i13) {
            throw new IllegalArgumentException("Element size does not match buffer array size");
        }
        ((float[][]) this.f77291g)[this.f77287c] = Arrays.copyOf(fArr, i13);
        int i14 = this.f77287c + 1;
        int i15 = this.f77289e;
        this.f77287c = i14 % i15;
        int i16 = this.f77288d;
        if (i16 < i15) {
            this.f77288d = i16 + 1;
        } else {
            this.f77286b = (this.f77286b + 1) % i15;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m56791b(int i13) throws EOFException {
        int i14 = this.f77287c;
        int i15 = i14 + i13;
        if (i13 < 0 || i15 > this.f77289e) {
            AbstractC32100b.m99859d(i13, this.f77289e - i14);
            throw null;
        }
        this.f77287c = i15;
    }

    /* JADX INFO: renamed from: c */
    public void m56792c(int i13) throws EOFException {
        int i14 = this.f77289e;
        int i15 = this.f77287c;
        if (i13 < i15) {
            AbstractC32100b.m99859d(i13 - i15, i14 - i15);
            throw null;
        }
        if (i13 < i14) {
            this.f77287c = i13;
        } else if (i13 == i14) {
            this.f77287c = i13;
        } else {
            AbstractC32100b.m99859d(i13 - i15, i14 - i15);
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m56793d(int i13) {
        if (i13 == 0) {
            return;
        }
        int i14 = this.f77286b;
        int i15 = i14 + i13;
        if (i13 < 0 || i15 > this.f77287c) {
            AbstractC32100b.m99860e(i13, this.f77287c - i14);
            throw null;
        }
        this.f77286b = i15;
    }

    /* JADX INFO: renamed from: e */
    public void m56794e(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "newReadPosition shouldn't be negative: ").toString());
        }
        if (i13 > this.f77286b) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "newReadPosition shouldn't be ahead of the read position: ", " > ");
            sbM30466t.append(this.f77286b);
            throw new IllegalArgumentException(sbM30466t.toString().toString());
        }
        this.f77286b = i13;
        if (this.f77288d > i13) {
            this.f77288d = i13;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m56795f() {
        int i13 = this.f77290f - 8;
        int i14 = this.f77287c;
        if (i13 >= i14) {
            this.f77289e = i13;
            return;
        }
        if (i13 < 0) {
            AbstractC32100b.m99862g(this);
            throw null;
        }
        if (i13 < this.f77288d) {
            AbstractC32100b.m99864i(this);
            throw null;
        }
        if (this.f77286b != i14) {
            AbstractC32100b.m99863h(this);
            throw null;
        }
        this.f77289e = i13;
        this.f77286b = i13;
        this.f77287c = i13;
    }

    public final String toString() {
        switch (this.f77285a) {
            case 0:
                float[][] fArr = (float[][]) this.f77291g;
                ArrayList arrayList = new ArrayList();
                for (float[] fArr2 : fArr) {
                    ArrayList arrayList2 = new ArrayList();
                    for (float f13 : fArr2) {
                        arrayList2.add(Float.valueOf(f13));
                    }
                    arrayList.add(arrayList2);
                }
                return arrayList.toString();
            default:
                StringBuilder sb4 = new StringBuilder("Buffer(");
                sb4.append(this.f77287c - this.f77286b);
                sb4.append(" used, ");
                sb4.append(this.f77289e - this.f77287c);
                sb4.append(" free, ");
                int i13 = this.f77288d;
                int i14 = this.f77289e;
                int i15 = this.f77290f;
                sb4.append((i15 - i14) + i13);
                sb4.append(" reserved of ");
                return AbstractC11895b.m31999r(sb4, i15, ')');
        }
    }

    public AbstractC20660e1(ByteBuffer byteBuffer) {
        this.f77285a = 1;
        this.f77291g = byteBuffer;
        this.f77289e = byteBuffer.limit();
        this.f77290f = byteBuffer.limit();
    }
}

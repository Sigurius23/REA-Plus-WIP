package androidx.fragment.app;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC1635w;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C1275b implements Parcelable {
    public static final Parcelable.Creator<C1275b> CREATOR = new C0113a(24);

    /* JADX INFO: renamed from: E */
    public final int f5529E;

    /* JADX INFO: renamed from: F */
    public final String f5530F;

    /* JADX INFO: renamed from: G */
    public final int f5531G;

    /* JADX INFO: renamed from: H */
    public final int f5532H;

    /* JADX INFO: renamed from: I */
    public final CharSequence f5533I;

    /* JADX INFO: renamed from: J */
    public final int f5534J;

    /* JADX INFO: renamed from: K */
    public final CharSequence f5535K;

    /* JADX INFO: renamed from: L */
    public final ArrayList f5536L;

    /* JADX INFO: renamed from: M */
    public final ArrayList f5537M;

    /* JADX INFO: renamed from: N */
    public final boolean f5538N;

    /* JADX INFO: renamed from: w */
    public final int[] f5539w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f5540x;

    /* JADX INFO: renamed from: y */
    public final int[] f5541y;

    /* JADX INFO: renamed from: z */
    public final int[] f5542z;

    public C1275b(C1271a c1271a) {
        int size = c1271a.f5563c.size();
        this.f5539w = new int[size * 6];
        if (!c1271a.f5569i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f5540x = new ArrayList(size);
        this.f5541y = new int[size];
        this.f5542z = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            C1278b2 c1278b2 = (C1278b2) c1271a.f5563c.get(i14);
            int i15 = i13 + 1;
            this.f5539w[i13] = c1278b2.f5547a;
            ArrayList arrayList = this.f5540x;
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1278b2.f5548b;
            arrayList.add(abstractComponentCallbacksC1320m0 != null ? abstractComponentCallbacksC1320m0.mWho : null);
            int[] iArr = this.f5539w;
            iArr[i15] = c1278b2.f5549c ? 1 : 0;
            iArr[i13 + 2] = c1278b2.f5550d;
            iArr[i13 + 3] = c1278b2.f5551e;
            int i16 = i13 + 5;
            iArr[i13 + 4] = c1278b2.f5552f;
            i13 += 6;
            iArr[i16] = c1278b2.f5553g;
            this.f5541y[i14] = c1278b2.f5554h.ordinal();
            this.f5542z[i14] = c1278b2.f5555i.ordinal();
        }
        this.f5529E = c1271a.f5568h;
        this.f5530F = c1271a.f5571k;
        this.f5531G = c1271a.f5520v;
        this.f5532H = c1271a.f5572l;
        this.f5533I = c1271a.f5573m;
        this.f5534J = c1271a.f5574n;
        this.f5535K = c1271a.f5575o;
        this.f5536L = c1271a.f5576p;
        this.f5537M = c1271a.f5577q;
        this.f5538N = c1271a.f5578r;
    }

    /* JADX INFO: renamed from: b */
    public final void m4063b(C1271a c1271a) {
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f5539w;
            boolean z4 = true;
            if (i13 >= iArr.length) {
                c1271a.f5568h = this.f5529E;
                c1271a.f5571k = this.f5530F;
                c1271a.f5569i = true;
                c1271a.f5572l = this.f5532H;
                c1271a.f5573m = this.f5533I;
                c1271a.f5574n = this.f5534J;
                c1271a.f5575o = this.f5535K;
                c1271a.f5576p = this.f5536L;
                c1271a.f5577q = this.f5537M;
                c1271a.f5578r = this.f5538N;
                return;
            }
            C1278b2 c1278b2 = new C1278b2();
            int i15 = i13 + 1;
            c1278b2.f5547a = iArr[i13];
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "Instantiate " + c1271a + " op #" + i14 + " base fragment #" + iArr[i15]);
            }
            c1278b2.f5554h = EnumC1635w.values()[this.f5541y[i14]];
            c1278b2.f5555i = EnumC1635w.values()[this.f5542z[i14]];
            int i16 = i13 + 2;
            if (iArr[i15] == 0) {
                z4 = false;
            }
            c1278b2.f5549c = z4;
            int i17 = iArr[i16];
            c1278b2.f5550d = i17;
            int i18 = iArr[i13 + 3];
            c1278b2.f5551e = i18;
            int i19 = i13 + 5;
            int i24 = iArr[i13 + 4];
            c1278b2.f5552f = i24;
            i13 += 6;
            int i25 = iArr[i19];
            c1278b2.f5553g = i25;
            c1271a.f5564d = i17;
            c1271a.f5565e = i18;
            c1271a.f5566f = i24;
            c1271a.f5567g = i25;
            c1271a.m4066b(c1278b2);
            i14++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final C1271a m4064f(AbstractC1329o1 abstractC1329o1) {
        C1271a c1271a = new C1271a(abstractC1329o1);
        m4063b(c1271a);
        c1271a.f5520v = this.f5531G;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f5540x;
            if (i13 >= arrayList.size()) {
                c1271a.m4044h(1);
                return c1271a;
            }
            String str = (String) arrayList.get(i13);
            if (str != null) {
                ((C1278b2) c1271a.f5563c.get(i13)).f5548b = abstractC1329o1.f5717c.m4055b(str);
            }
            i13++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeIntArray(this.f5539w);
        parcel.writeStringList(this.f5540x);
        parcel.writeIntArray(this.f5541y);
        parcel.writeIntArray(this.f5542z);
        parcel.writeInt(this.f5529E);
        parcel.writeString(this.f5530F);
        parcel.writeInt(this.f5531G);
        parcel.writeInt(this.f5532H);
        TextUtils.writeToParcel(this.f5533I, parcel, 0);
        parcel.writeInt(this.f5534J);
        TextUtils.writeToParcel(this.f5535K, parcel, 0);
        parcel.writeStringList(this.f5536L);
        parcel.writeStringList(this.f5537M);
        parcel.writeInt(this.f5538N ? 1 : 0);
    }

    public C1275b(Parcel parcel) {
        this.f5539w = parcel.createIntArray();
        this.f5540x = parcel.createStringArrayList();
        this.f5541y = parcel.createIntArray();
        this.f5542z = parcel.createIntArray();
        this.f5529E = parcel.readInt();
        this.f5530F = parcel.readString();
        this.f5531G = parcel.readInt();
        this.f5532H = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f5533I = (CharSequence) creator.createFromParcel(parcel);
        this.f5534J = parcel.readInt();
        this.f5535K = (CharSequence) creator.createFromParcel(parcel);
        this.f5536L = parcel.createStringArrayList();
        this.f5537M = parcel.createStringArrayList();
        this.f5538N = parcel.readInt() != 0;
    }
}

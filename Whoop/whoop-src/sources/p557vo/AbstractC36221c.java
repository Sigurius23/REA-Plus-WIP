package p557vo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.AbstractC1772c1;
import java.nio.charset.Charset;
import java.util.List;
import l83.C23465k;
import mc.C25411h;
import p181h2.C16618c;
import p636y3.C39179k;
import p647yf.AbstractC39506s;
import p647yf.C39505r;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34818h0;
import xa3.C38148i;
import xa3.C38151l;
import yb3.AbstractC39397a;
import yb3.C39412p;

/* JADX INFO: renamed from: vo.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC36221c {
    /* JADX INFO: renamed from: a */
    public static final void m115320a(C25411h c25411h, Object resource) {
        AbstractC22676k.m65750j(c25411h, "<this>");
        AbstractC22676k.m65750j(resource, "resource");
        if (resource instanceof AbstractC39506s) {
            AbstractC39506s abstractC39506s = (AbstractC39506s) resource;
            synchronized (abstractC39506s.f169924w) {
                C39505r c39505r = abstractC39506s.f169924w;
                if (c39505r.f169923b) {
                    throw new IllegalStateException("caller attempted to share() a fully unshared object");
                }
                c39505r.f169922a++;
            }
            c25411h.f99515a.add(abstractC39506s);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C23465k m115321b(C34818h0 c34818h0) {
        Charset charset = AbstractC39397a.f169546a;
        if (c34818h0 != null) {
            C39412p c39412p = C34818h0.f146589e;
            Charset charsetM109889a = c34818h0.m109889a(null);
            if (charsetM109889a == null) {
                c34818h0 = AbstractC1772c1.m5373J(c34818h0 + "; charset=utf-8");
            } else {
                charset = charsetM109889a;
            }
        }
        return new C23465k(charset, c34818h0);
    }

    /* JADX INFO: renamed from: c */
    public static final C39179k m115322c(C16618c c16618c) {
        return new C39179k(Math.round(c16618c.f63939a), Math.round(c16618c.f63940b), Math.round(c16618c.f63941c), Math.round(c16618c.f63942d));
    }

    /* JADX INFO: renamed from: d */
    public static C38148i m115323d(Function1 changeOptions) {
        AbstractC22676k.m65750j(changeOptions, "changeOptions");
        C38151l c38151l = new C38151l();
        changeOptions.invoke(c38151l);
        c38151l.f163366a = true;
        return new C38148i(c38151l);
    }

    /* JADX INFO: renamed from: e */
    public static void m115324e(Parcel parcel, int i13, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        parcel.writeBundle(bundle);
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: f */
    public static void m115325f(Parcel parcel, int i13, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        parcel.writeByteArray(bArr);
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: g */
    public static void m115326g(Parcel parcel, int i13, Float f13) {
        if (f13 == null) {
            return;
        }
        m115337r(parcel, i13, 4);
        parcel.writeFloat(f13.floatValue());
    }

    /* JADX INFO: renamed from: h */
    public static void m115327h(Parcel parcel, int i13, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        parcel.writeStrongBinder(iBinder);
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: i */
    public static void m115328i(Parcel parcel, int i13, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        parcel.writeIntArray(iArr);
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: j */
    public static void m115329j(Parcel parcel, int i13, List list) {
        if (list == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeInt(((Integer) list.get(i14)).intValue());
        }
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: k */
    public static void m115330k(Parcel parcel, int i13, Integer num) {
        if (num == null) {
            return;
        }
        m115337r(parcel, i13, 4);
        parcel.writeInt(num.intValue());
    }

    /* JADX INFO: renamed from: l */
    public static void m115331l(Parcel parcel, int i13, Parcelable parcelable, int i14) {
        if (parcelable == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        parcelable.writeToParcel(parcel, i14);
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: m */
    public static void m115332m(Parcel parcel, int i13, String str) {
        if (str == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        parcel.writeString(str);
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: n */
    public static void m115333n(Parcel parcel, int i13, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        parcel.writeStringArray(strArr);
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: o */
    public static void m115334o(Parcel parcel, int i13, List list) {
        if (list == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        parcel.writeStringList(list);
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: p */
    public static void m115335p(Parcel parcel, int i13, Parcelable[] parcelableArr, int i14) {
        if (parcelableArr == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i14);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: q */
    public static void m115336q(Parcel parcel, int i13, List list) {
        if (list == null) {
            return;
        }
        int iM115338s = m115338s(parcel, i13);
        int size = list.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            Parcelable parcelable = (Parcelable) list.get(i14);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m115339t(parcel, iM115338s);
    }

    /* JADX INFO: renamed from: r */
    public static void m115337r(Parcel parcel, int i13, int i14) {
        parcel.writeInt(i13 | (i14 << 16));
    }

    /* JADX INFO: renamed from: s */
    public static int m115338s(Parcel parcel, int i13) {
        parcel.writeInt(i13 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: t */
    public static void m115339t(Parcel parcel, int i13) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i13 - 4);
        parcel.writeInt(iDataPosition - i13);
        parcel.setDataPosition(iDataPosition);
    }
}

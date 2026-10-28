package q20;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import java.security.KeyPair;
import java.security.interfaces.ECPublicKey;
import o30.InterfaceC27506d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29893a;
import q30.C29895b;
import q30.C29897c;
import q30.C29899d;
import q30.C29901e;
import q30.C29903f;
import q30.C29905g;
import q30.C29910i0;
import q30.C29915l;
import q30.C29917m;
import q30.C29919n;
import q30.C29920n0;
import q30.C29923p;
import q30.C29925q;
import q30.C29926q0;
import q30.C29927r;
import q30.C29929s;
import q30.C29933u;
import q30.C29935v;
import q30.C29937w;
import q30.C29939x;
import q30.C29941y;
import q30.C29942z;
import r30.C30897b;
import r30.C30900e;
import r30.C30902g;
import r30.EnumC30905j;
import t20.C33326g;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38793c;
import y00.C38809d5;
import y00.C38915o4;
import y00.EnumC38922p2;

/* JADX INFO: renamed from: q20.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C29831p implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121934a;

    public /* synthetic */ C29831p(int i13) {
        this.f121934a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        switch (this.f121934a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29834s(parcel.readString(), parcel.readInt(), C29832q.CREATOR.createFromParcel(parcel), (C33326g) parcel.readParcelable(C29834s.class.getClassLoader()), parcel.readInt() == 0 ? null : C29833r.CREATOR.createFromParcel(parcel), (C38809d5) parcel.readParcelable(C29834s.class.getClassLoader()), EnumC29820h.valueOf(parcel.readString()), (AbstractC38970u5) parcel.readParcelable(C29834s.class.getClassLoader()), (AbstractC38869j5) parcel.readParcelable(C29834s.class.getClassLoader()));
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29832q(parcel.readString(), parcel.readString(), parcel.readString(), (C38793c) parcel.readParcelable(C29832q.class.getClassLoader()), parcel.readInt() != 0);
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29833r((C38915o4) parcel.readParcelable(C29833r.class.getClassLoader()), parcel.readInt() == 0 ? null : EnumC38922p2.valueOf(parcel.readString()));
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29838w((C38915o4) parcel.readParcelable(C29838w.class.getClassLoader()), parcel.readInt() == 0 ? null : EnumC29836u.valueOf(parcel.readString()), (AbstractC38970u5) parcel.readParcelable(C29838w.class.getClassLoader()));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C29839x.f121958x;
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C29817f0.f121885w;
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C29819g0.f121891w;
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C29821h0.f121897w;
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29823i0(parcel.readString(), parcel.readInt() != 0);
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29893a(parcel.readString(), (ECPublicKey) parcel.readSerializable(), (ECPublicKey) parcel.readSerializable());
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29895b(parcel.readString(), C29926q0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C29897c.f122151w;
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29899d(parcel.readString());
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new C29901e(string, boolValueOf);
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new C29903f(boolValueOf2);
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C29905g.f122177w;
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29915l(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29919n((InterfaceC27506d) parcel.readSerializable(), parcel.readString(), C30897b.CREATOR.createFromParcel(parcel), parcel.readString(), C29917m.CREATOR.createFromParcel(parcel));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29917m(parcel.createByteArray(), parcel.createByteArray());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29923p(C30902g.CREATOR.createFromParcel(parcel));
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29925q((Throwable) parcel.readSerializable());
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29927r(C30897b.CREATOR.createFromParcel(parcel), C30900e.CREATOR.createFromParcel(parcel), C29919n.CREATOR.createFromParcel(parcel));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29929s(C30902g.CREATOR.createFromParcel(parcel));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29933u(parcel.readString(), parcel.readInt() == 0 ? null : EnumC30905j.valueOf(parcel.readString()), C29920n0.CREATOR.createFromParcel(parcel));
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29935v(parcel.readString(), parcel.readInt() == 0 ? null : EnumC30905j.valueOf(parcel.readString()), C29920n0.CREATOR.createFromParcel(parcel));
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29937w(C30902g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EnumC30905j.valueOf(parcel.readString()), C29920n0.CREATOR.createFromParcel(parcel));
            case 26:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29939x((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : EnumC30905j.valueOf(parcel.readString()), C29920n0.CREATOR.createFromParcel(parcel));
            case 27:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29941y(parcel.readString(), parcel.readInt() == 0 ? null : EnumC30905j.valueOf(parcel.readString()), C29920n0.CREATOR.createFromParcel(parcel));
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29942z(parcel.readString(), parcel.readInt() == 0 ? null : EnumC30905j.valueOf(parcel.readString()), C29920n0.CREATOR.createFromParcel(parcel));
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29910i0(parcel.readString(), (KeyPair) parcel.readSerializable(), C29915l.CREATOR.createFromParcel(parcel), parcel.readInt(), C29920n0.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f121934a) {
            case 0:
                return new C29834s[i13];
            case 1:
                return new C29832q[i13];
            case 2:
                return new C29833r[i13];
            case 3:
                return new C29838w[i13];
            case 4:
                return new C29839x[i13];
            case 5:
                return new C29817f0[i13];
            case 6:
                return new C29819g0[i13];
            case 7:
                return new C29821h0[i13];
            case 8:
                return new C29823i0[i13];
            case 9:
                return new C29893a[i13];
            case 10:
                return new C29895b[i13];
            case 11:
                return new C29897c[i13];
            case 12:
                return new C29899d[i13];
            case 13:
                return new C29901e[i13];
            case 14:
                return new C29903f[i13];
            case 15:
                return new C29905g[i13];
            case 16:
                return new C29915l[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C29919n[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C29917m[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C29923p[i13];
            case 20:
                return new C29925q[i13];
            case 21:
                return new C29927r[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C29929s[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C29933u[i13];
            case 24:
                return new C29935v[i13];
            case 25:
                return new C29937w[i13];
            case 26:
                return new C29939x[i13];
            case 27:
                return new C29941y[i13];
            case 28:
                return new C29942z[i13];
            default:
                return new C29910i0[i13];
        }
    }
}

package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.mapbox.maps.ImageHolder;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import h20.C16689l1;
import h20.EnumC16660g2;
import k10.C22117a;
import kn.C22597a;
import kz.C22904a;
import kz.C22905b;
import kz.C22906c;
import kz.C22908e;
import kz.C22909f;
import kz.C22910g;
import kz.C22914k;
import kz.C22915l;
import kz.C22916m;
import kz.C22919p;
import l10.C23217b;
import l10.C23218c;
import l30.C23292a;
import l30.C23306o;
import l30.EnumC23305n;
import lv.C24757b;
import m30.C24988d;
import m30.C24989e;
import m30.C24990f;
import m30.C24991g;
import m30.C24992h;
import p296l5.C23344h;
import p308ln.C24519a;
import p308ln.C24520b;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38842g8;
import y00.C38977v3;

/* JADX INFO: renamed from: jz.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C22060h implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85572a;

    public /* synthetic */ C22060h(int i13) {
        this.f85572a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        switch (this.f85572a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22061i(FinancialConnectionsSession.CREATOR.createFromParcel(parcel), (C38842g8) parcel.readParcelable(C22061i.class.getClassLoader()));
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22062j((Throwable) parcel.readSerializable());
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C22064l.f85576w;
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22065m(FinancialConnectionsSession.CREATOR.createFromParcel(parcel));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22066n((Throwable) parcel.readSerializable());
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22117a(parcel.readString(), (C38977v3) parcel.readParcelable(C22117a.class.getClassLoader()));
            case 6:
                return new C22597a(parcel);
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22904a(C22058f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C22057e.CREATOR.createFromParcel(parcel));
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22905b(C22058f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C22057e.CREATOR.createFromParcel(parcel));
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22906c(C22058f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C22057e.CREATOR.createFromParcel(parcel));
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C22908e.f90456w;
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22909f(parcel.readInt() == 0 ? null : C22919p.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FinancialConnectionsSession.CREATOR.createFromParcel(parcel) : null, (C38842g8) parcel.readParcelable(C22909f.class.getClassLoader()));
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22910g((Throwable) parcel.readSerializable());
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C22914k.f90466w;
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22915l(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22916m((Throwable) parcel.readSerializable());
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C22919p(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C23217b(parcel.readInt() == 0 ? null : EnumC16660g2.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), C16689l1.CREATOR.createFromParcel(parcel), (InterfaceC35320a) parcel.readParcelable(C23217b.class.getClassLoader()), (InterfaceC35322b) parcel.readParcelable(C23217b.class.getClassLoader()), parcel.createStringArrayList());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C23218c(C23217b.CREATOR.createFromParcel(parcel));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C23292a(parcel.readString(), parcel.readInt());
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C23306o(parcel.readString(), parcel.readString(), EnumC23305n.valueOf(parcel.readString()));
            case 21:
                C23344h c23344h = new C23344h(parcel);
                c23344h.f92555w = parcel.readInt();
                return c23344h;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C24519a(parcel);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C24520b(parcel);
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                boolean z13 = false;
                if (parcel.readInt() != 0) {
                    z13 = true;
                    z4 = true;
                } else {
                    z4 = true;
                }
                int i13 = parcel.readInt();
                boolean z14 = z4;
                float f13 = parcel.readFloat();
                float f14 = parcel.readFloat();
                float f15 = parcel.readFloat();
                float f16 = parcel.readFloat();
                float f17 = parcel.readFloat();
                boolean z15 = z14;
                float f18 = parcel.readFloat();
                if (parcel.readInt() == 0) {
                    z15 = z13;
                }
                if (parcel.readInt() == 0) {
                    z15 = z13;
                }
                if (parcel.readInt() == 0) {
                    z15 = false;
                }
                return new C24757b(z13, i13, f13, f14, f15, f16, f17, f18, z15, z15, z15, parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel));
            case 25:
                C24988d c24988d = new C24988d(parcel);
                c24988d.f97786z = parcel.readString();
                c24988d.f97785E = parcel.readInt();
                return c24988d;
            case 26:
                C24989e c24989e = new C24989e(parcel);
                c24989e.f97789z = parcel.readString();
                c24989e.f97787E = parcel.readString();
                c24989e.f97788F = parcel.readInt();
                return c24989e;
            case 27:
                C24990f c24990f = new C24990f(parcel);
                c24990f.f97793z = parcel.readInt();
                c24990f.f97790E = parcel.readString();
                c24990f.f97791F = parcel.readInt();
                c24990f.f97792G = parcel.readString();
                return c24990f;
            case 28:
                C24991g c24991g = new C24991g(parcel);
                c24991g.f97797z = parcel.readString();
                c24991g.f97794E = parcel.readString();
                c24991g.f97795F = parcel.readString();
                c24991g.f97796G = parcel.readString();
                return c24991g;
            default:
                return new C24992h(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f85572a) {
            case 0:
                return new C22061i[i13];
            case 1:
                return new C22062j[i13];
            case 2:
                return new C22064l[i13];
            case 3:
                return new C22065m[i13];
            case 4:
                return new C22066n[i13];
            case 5:
                return new C22117a[i13];
            case 6:
                return new C22597a[i13];
            case 7:
                return new C22904a[i13];
            case 8:
                return new C22905b[i13];
            case 9:
                return new C22906c[i13];
            case 10:
                return new C22908e[i13];
            case 11:
                return new C22909f[i13];
            case 12:
                return new C22910g[i13];
            case 13:
                return new C22914k[i13];
            case 14:
                return new C22915l[i13];
            case 15:
                return new C22916m[i13];
            case 16:
                return new C22919p[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C23217b[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C23218c[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C23292a[i13];
            case 20:
                return new C23306o[i13];
            case 21:
                return new C23344h[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C24519a[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C24520b[i13];
            case 24:
                return new C24757b[i13];
            case 25:
                return new C24988d[i13];
            case 26:
                return new C24989e[i13];
            case 27:
                return new C24990f[i13];
            case 28:
                return new C24991g[i13];
            default:
                return new C24992h[i13];
        }
    }
}

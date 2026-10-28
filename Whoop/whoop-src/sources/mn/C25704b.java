package mn;

import a30.C0290f1;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import e10.InterfaceC12576v0;
import h20.AbstractC16737t1;
import h20.C16636c2;
import h20.C16661g3;
import h20.C16665h1;
import h20.C16666h2;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16721q3;
import h20.C16756w2;
import h20.C16761x1;
import h20.EnumC16673i3;
import i20.C17928b;
import io.getstream.video.android.model.StreamCallId;
import j00.AbstractC21106i0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import mq.C25874b;
import my.C26027a;
import n20.C26173h;
import np.C26997b;
import np.C27005j;
import np.C27006k;
import o10.C27388a;
import o10.C27391d;
import o10.C27394g;
import p10.C28694c;
import p10.C28699h;
import p10.EnumC28698g;
import p345nn.C26850a;
import p345nn.C26851b;
import p345nn.C26852c;
import p345nn.C26853d;
import p345nn.C26854e;
import p345nn.C26855f;
import p345nn.C26859j;
import p345nn.C26860k;
import p345nn.C26861l;
import p345nn.C26862m;
import p345nn.C26863n;
import p373on.C28040a;
import p373on.C28041b;
import p373on.C28042c;
import p373on.C28043d;
import p373on.C28044e;
import p529uo.C35109d;
import p557vo.AbstractC36220b;
import p599wz.C37709d0;
import p599wz.C37718g0;
import p599wz.EnumC37721h0;
import p599wz.InterfaceC37739n0;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;
import y00.EnumC38853i;
import y00.EnumC38941r3;

/* JADX INFO: renamed from: mn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C25704b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101212a;

    public /* synthetic */ C25704b(int i13) {
        this.f101212a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f101212a) {
            case 0:
                return new C25705c(parcel);
            case 1:
                return new C25706d(parcel);
            case 2:
                C25874b c25874b = new C25874b();
                c25874b.f102027I = 255;
                c25874b.f102029K = -2;
                c25874b.f102030L = -2;
                c25874b.f102031M = -2;
                c25874b.f102038T = Boolean.TRUE;
                c25874b.f102049w = parcel.readInt();
                c25874b.f102050x = (Integer) parcel.readSerializable();
                c25874b.f102051y = (Integer) parcel.readSerializable();
                c25874b.f102052z = (Integer) parcel.readSerializable();
                c25874b.f102023E = (Integer) parcel.readSerializable();
                c25874b.f102024F = (Integer) parcel.readSerializable();
                c25874b.f102025G = (Integer) parcel.readSerializable();
                c25874b.f102026H = (Integer) parcel.readSerializable();
                c25874b.f102027I = parcel.readInt();
                c25874b.f102028J = parcel.readString();
                c25874b.f102029K = parcel.readInt();
                c25874b.f102030L = parcel.readInt();
                c25874b.f102031M = parcel.readInt();
                c25874b.f102033O = parcel.readString();
                c25874b.f102034P = parcel.readString();
                c25874b.f102035Q = parcel.readInt();
                c25874b.f102037S = (Integer) parcel.readSerializable();
                c25874b.f102039U = (Integer) parcel.readSerializable();
                c25874b.f102040V = (Integer) parcel.readSerializable();
                c25874b.f102041W = (Integer) parcel.readSerializable();
                c25874b.f102042X = (Integer) parcel.readSerializable();
                c25874b.f102043Y = (Integer) parcel.readSerializable();
                c25874b.f102044Z = (Integer) parcel.readSerializable();
                c25874b.f102047c0 = (Integer) parcel.readSerializable();
                c25874b.f102045a0 = (Integer) parcel.readSerializable();
                c25874b.f102046b0 = (Integer) parcel.readSerializable();
                c25874b.f102038T = (Boolean) parcel.readSerializable();
                c25874b.f102032N = (Locale) parcel.readSerializable();
                c25874b.f102048d0 = (Boolean) parcel.readSerializable();
                return c25874b;
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                C16636c2 c16636c2 = (C16636c2) parcel.readParcelable(C26027a.class.getClassLoader());
                C16666h2 c16666h2 = (C16666h2) parcel.readParcelable(C26027a.class.getClassLoader());
                C16756w2 c16756w2 = (C16756w2) parcel.readParcelable(C26027a.class.getClassLoader());
                C16671i1 c16671i1 = (C16671i1) parcel.readParcelable(C26027a.class.getClassLoader());
                C17928b c17928b = (C17928b) parcel.readParcelable(C26027a.class.getClassLoader());
                boolean z4 = false;
                boolean z13 = true;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() == 0) {
                    z13 = z4;
                }
                C16689l1 c16689l1 = (C16689l1) parcel.readParcelable(C26027a.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(EnumC38853i.valueOf(parcel.readString()));
                }
                boolean z14 = parcel.readInt() != 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                AbstractC16737t1 abstractC16737t1 = (AbstractC16737t1) parcel.readParcelable(C26027a.class.getClassLoader());
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                int i16 = 0;
                while (i16 != i15) {
                    arrayList2.add(parcel.readParcelable(C26027a.class.getClassLoader()));
                    i16++;
                    i15 = i15;
                }
                int i17 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i17);
                int i18 = 0;
                while (i18 != i17) {
                    arrayList3.add(parcel.readParcelable(C26027a.class.getClassLoader()));
                    i18++;
                    i17 = i17;
                }
                C16661g3 c16661g3 = (C16661g3) parcel.readParcelable(C26027a.class.getClassLoader());
                String string2 = parcel.readString();
                C37709d0 c37709d0 = (C37709d0) parcel.readParcelable(C26027a.class.getClassLoader());
                int i19 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i19);
                int i24 = 0;
                while (i24 != i19) {
                    linkedHashMap.put(parcel.readParcelable(C26027a.class.getClassLoader()), EnumC16673i3.valueOf(parcel.readString()));
                    i24++;
                    i19 = i19;
                }
                return new C26027a(string, c16636c2, c16666h2, c16756w2, c16671i1, c17928b, z4, z13, c16689l1, arrayList, z14, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, abstractC16737t1, arrayList2, arrayList3, c16661g3, string2, c37709d0, linkedHashMap, (C16721q3) parcel.readParcelable(C26027a.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (C16665h1) parcel.readParcelable(C26027a.class.getClassLoader()));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C26173h((C0290f1) parcel.readParcelable(C26173h.class.getClassLoader()), C16761x1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 5:
                return new C26850a(parcel);
            case 6:
                return new C26851b(parcel);
            case 7:
                return new C26852c(parcel);
            case 8:
                return new C26853d(parcel);
            case 9:
                return new C26854e(parcel);
            case 10:
                return new C26855f(parcel);
            case 11:
                return new C26859j(parcel);
            case 12:
                return new C26860k(parcel);
            case 13:
                return new C26861l(parcel);
            case 14:
                return new C26862m(parcel);
            case 15:
                return new C26863n(parcel);
            case 16:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                Status status = null;
                while (parcel.dataPosition() < iM115294F) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        AbstractC36220b.m115293E(parcel, i25);
                    } else {
                        status = (Status) AbstractC36220b.m115302g(parcel, i25, Status.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new C26997b(status);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                List listM115307l = C27005j.f107685L;
                LocationRequest locationRequest = null;
                String strM115303h = null;
                String strM115303h2 = null;
                String strM115303h3 = null;
                boolean zM115312t = false;
                boolean zM115312t2 = false;
                boolean zM115312t3 = false;
                boolean zM115312t4 = false;
                boolean zM115312t5 = false;
                long jM115289A = Long.MAX_VALUE;
                while (parcel.dataPosition() < iM115294F2) {
                    int i26 = parcel.readInt();
                    char c3 = (char) i26;
                    if (c3 != 1) {
                        switch (c3) {
                            case 5:
                                listM115307l = AbstractC36220b.m115307l(parcel, i26, C35109d.CREATOR);
                                break;
                            case 6:
                                strM115303h = AbstractC36220b.m115303h(parcel, i26);
                                break;
                            case 7:
                                zM115312t = AbstractC36220b.m115312t(parcel, i26);
                                break;
                            case '\b':
                                zM115312t2 = AbstractC36220b.m115312t(parcel, i26);
                                break;
                            case '\t':
                                zM115312t3 = AbstractC36220b.m115312t(parcel, i26);
                                break;
                            case '\n':
                                strM115303h2 = AbstractC36220b.m115303h(parcel, i26);
                                break;
                            case 11:
                                zM115312t4 = AbstractC36220b.m115312t(parcel, i26);
                                break;
                            case '\f':
                                zM115312t5 = AbstractC36220b.m115312t(parcel, i26);
                                break;
                            case '\r':
                                strM115303h3 = AbstractC36220b.m115303h(parcel, i26);
                                break;
                            case 14:
                                jM115289A = AbstractC36220b.m115289A(parcel, i26);
                                break;
                            default:
                                AbstractC36220b.m115293E(parcel, i26);
                                break;
                        }
                    } else {
                        locationRequest = (LocationRequest) AbstractC36220b.m115302g(parcel, i26, LocationRequest.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                return new C27005j(locationRequest, listM115307l, strM115303h, zM115312t, zM115312t2, zM115312t3, strM115303h2, zM115312t4, zM115312t5, strM115303h3, jM115289A);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                int iM115317y = 1;
                C27005j c27005j = null;
                IBinder iBinderM115316x = null;
                PendingIntent pendingIntent = null;
                IBinder iBinderM115316x2 = null;
                IBinder iBinderM115316x3 = null;
                while (parcel.dataPosition() < iM115294F3) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            iM115317y = AbstractC36220b.m115317y(parcel, i27);
                            break;
                        case 2:
                            c27005j = (C27005j) AbstractC36220b.m115302g(parcel, i27, C27005j.CREATOR);
                            break;
                        case 3:
                            iBinderM115316x = AbstractC36220b.m115316x(parcel, i27);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) AbstractC36220b.m115302g(parcel, i27, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderM115316x2 = AbstractC36220b.m115316x(parcel, i27);
                            break;
                        case 6:
                            iBinderM115316x3 = AbstractC36220b.m115316x(parcel, i27);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i27);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                return new C27006k(iM115317y, c27005j, iBinderM115316x, pendingIntent, iBinderM115316x2, iBinderM115316x3);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C27388a(C37718g0.CREATOR.createFromParcel(parcel), (InterfaceC37739n0) parcel.readParcelable(C27388a.class.getClassLoader()), EnumC37721h0.valueOf(parcel.readString()));
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C27391d((InterfaceC12576v0) parcel.readParcelable(C27391d.class.getClassLoader()));
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C27394g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (EnumC38941r3) parcel.readParcelable(C27394g.class.getClassLoader()));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new StreamCallId(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C28040a(parcel);
            case 24:
                return new C28041b(parcel);
            case 25:
                ArrayList arrayList4 = new ArrayList();
                parcel.readList(arrayList4, C28042c.class.getClassLoader());
                return new C28043d(arrayList4);
            case 26:
                return new C28042c(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 27:
                return new C28044e(parcel);
            case 28:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C28694c((InterfaceC12576v0) parcel.readParcelable(C28694c.class.getClassLoader()));
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C28699h((C38809d5) parcel.readParcelable(C28699h.class.getClassLoader()), (AbstractC38970u5) parcel.readParcelable(C28699h.class.getClassLoader()), (AbstractC38869j5) parcel.readParcelable(C28699h.class.getClassLoader()), EnumC28698g.valueOf(parcel.readString()), (C37718g0) parcel.readParcelable(C28699h.class.getClassLoader()), (AbstractC21106i0) parcel.readParcelable(C28699h.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f101212a) {
            case 0:
                return new C25705c[i13];
            case 1:
                return new C25706d[i13];
            case 2:
                return new C25874b[i13];
            case 3:
                return new C26027a[i13];
            case 4:
                return new C26173h[i13];
            case 5:
                return new C26850a[i13];
            case 6:
                return new C26851b[i13];
            case 7:
                return new C26852c[i13];
            case 8:
                return new C26853d[i13];
            case 9:
                return new C26854e[i13];
            case 10:
                return new C26855f[i13];
            case 11:
                return new C26859j[i13];
            case 12:
                return new C26860k[i13];
            case 13:
                return new C26861l[i13];
            case 14:
                return new C26862m[i13];
            case 15:
                return new C26863n[i13];
            case 16:
                return new C26997b[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C27005j[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C27006k[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C27388a[i13];
            case 20:
                return new C27391d[i13];
            case 21:
                return new C27394g[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new StreamCallId[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C28040a[i13];
            case 24:
                return new C28041b[i13];
            case 25:
                return new C28043d[i13];
            case 26:
                return new C28042c[i13];
            case 27:
                return new C28044e[i13];
            case 28:
                return new C28694c[i13];
            default:
                return new C28699h[i13];
        }
    }
}

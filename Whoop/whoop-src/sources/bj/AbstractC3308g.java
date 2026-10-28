package bj;

import android.graphics.Path;
import dj.AbstractC12058c;
import dj.AbstractC12064i;
import hg3.AbstractC17269i;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.ArrayList;
import java.util.Collections;
import p031b9.AbstractC2875y;
import p049cj.C4738d;
import p108e4.AbstractC12682p;
import p119ej.C13224a;
import p426qi.C30387i;
import p581we.C37199o;
import p616xi.C38313a;
import p616xi.C38314b;
import p616xi.InterfaceC38318f;
import p649yi.C39546a;
import p649yi.C39549d;
import p649yi.C39552g;
import p649yi.C39554i;
import p649yi.C39558m;
import p649yi.C39559n;
import p649yi.C39560o;
import p649yi.C39561p;
import p649yi.C39562q;
import p649yi.InterfaceC39547b;

/* JADX INFO: renamed from: bj.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3308g {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12875a = C37199o.m119195L("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:320:0x0514 A[LOOP:1: B:318:0x050e->B:320:0x0514, LOOP_END] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static InterfaceC39547b m9605a(C4738d c4738d, C30387i c30387i) {
        C38314b c38314bM48885c0;
        String strNextString;
        InterfaceC39547b c39546a;
        InterfaceC39547b c39558m;
        InterfaceC39547b c39549d;
        int i13;
        c4738d.beginObject();
        int iNextInt = 2;
        while (true) {
            c38314bM48885c0 = null;
            c39549d = null;
            if (!c4738d.hasNext()) {
                strNextString = null;
                break;
            }
            int iMo14824m = c4738d.mo14824m(f12875a);
            if (iMo14824m == 0) {
                strNextString = c4738d.nextString();
                break;
            }
            if (iMo14824m != 1) {
                c4738d.mo14825s();
                c4738d.skipValue();
            } else {
                iNextInt = c4738d.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        boolean zMo14821h = false;
        int i14 = 0;
        switch (strNextString) {
            case "el":
                C37199o c37199o = AbstractC3305e.f12867a;
                boolean z4 = iNextInt == 3;
                boolean zMo14821h2 = false;
                String strNextString2 = null;
                InterfaceC38318f interfaceC38318fM9600b = null;
                C38313a c38313aM48891f0 = null;
                while (c4738d.hasNext()) {
                    int iMo14824m2 = c4738d.mo14824m(AbstractC3305e.f12867a);
                    if (iMo14824m2 == 0) {
                        strNextString2 = c4738d.nextString();
                    } else if (iMo14824m2 == 1) {
                        interfaceC38318fM9600b = AbstractC3297a.m9600b(c4738d, c30387i);
                    } else if (iMo14824m2 == 2) {
                        c38313aM48891f0 = AbstractC17269i.m48891f0(c4738d, c30387i);
                    } else if (iMo14824m2 == 3) {
                        zMo14821h2 = c4738d.mo14821h();
                    } else if (iMo14824m2 != 4) {
                        c4738d.mo14825s();
                        c4738d.skipValue();
                    } else {
                        z4 = c4738d.nextInt() == 3;
                    }
                }
                c39546a = new C39546a(strNextString2, interfaceC38318fM9600b, c38313aM48891f0, z4, zMo14821h2);
                c39549d = c39546a;
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "fl":
                C37199o c37199o2 = AbstractC3327z.f12913a;
                int iNextInt2 = 1;
                boolean zMo14821h3 = false;
                boolean zMo14821h4 = false;
                C38313a c38313a = null;
                String strNextString3 = null;
                C38313a c38313aM48883b0 = null;
                while (c4738d.hasNext()) {
                    int iMo14824m3 = c4738d.mo14824m(AbstractC3327z.f12913a);
                    if (iMo14824m3 == 0) {
                        strNextString3 = c4738d.nextString();
                    } else if (iMo14824m3 == 1) {
                        c38313aM48883b0 = AbstractC17269i.m48883b0(c4738d, c30387i);
                    } else if (iMo14824m3 == 2) {
                        c38313a = AbstractC17269i.m48889e0(c4738d, c30387i);
                    } else if (iMo14824m3 == 3) {
                        zMo14821h3 = c4738d.mo14821h();
                    } else if (iMo14824m3 == 4) {
                        iNextInt2 = c4738d.nextInt();
                    } else if (iMo14824m3 != 5) {
                        c4738d.mo14825s();
                        c4738d.skipValue();
                    } else {
                        zMo14821h4 = c4738d.mo14821h();
                    }
                }
                if (c38313a == null) {
                    c38313a = new C38313a(Collections.singletonList(new C13224a(100)), 2);
                }
                c39558m = new C39558m(strNextString3, zMo14821h3, iNextInt2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c38313aM48883b0, c38313a, zMo14821h4);
                c39549d = c39558m;
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "gf":
                C37199o c37199o3 = AbstractC3314m.f12889a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i15 = 0;
                boolean zMo14821h5 = false;
                C38313a c38313a2 = null;
                String strNextString4 = null;
                C38313a c38313aM48887d0 = null;
                C38313a c38313aM48891f1 = null;
                C38313a c38313aM48891f2 = null;
                while (c4738d.hasNext()) {
                    switch (c4738d.mo14824m(AbstractC3314m.f12889a)) {
                        case 0:
                            strNextString4 = c4738d.nextString();
                            break;
                        case 1:
                            c4738d.beginObject();
                            int iNextInt3 = -1;
                            while (c4738d.hasNext()) {
                                int iMo14824m4 = c4738d.mo14824m(AbstractC3314m.f12890b);
                                if (iMo14824m4 == 0) {
                                    iNextInt3 = c4738d.nextInt();
                                } else if (iMo14824m4 != 1) {
                                    c4738d.mo14825s();
                                    c4738d.skipValue();
                                } else {
                                    c38313aM48887d0 = AbstractC17269i.m48887d0(c4738d, c30387i, iNextInt3);
                                }
                            }
                            c4738d.endObject();
                            break;
                        case 2:
                            c38313a2 = AbstractC17269i.m48889e0(c4738d, c30387i);
                            break;
                        case 3:
                            i15 = c4738d.nextInt() != 1 ? 2 : 1;
                            break;
                        case 4:
                            c38313aM48891f1 = AbstractC17269i.m48891f0(c4738d, c30387i);
                            break;
                        case 5:
                            c38313aM48891f2 = AbstractC17269i.m48891f0(c4738d, c30387i);
                            break;
                        case 6:
                            fillType = c4738d.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zMo14821h5 = c4738d.mo14821h();
                            break;
                        default:
                            c4738d.mo14825s();
                            c4738d.skipValue();
                            break;
                    }
                }
                if (c38313a2 == null) {
                    c38313a2 = new C38313a(Collections.singletonList(new C13224a(100)), 2);
                }
                c39549d = new C39549d(strNextString4, i15, fillType, c38313aM48887d0, c38313a2, c38313aM48891f1, c38313aM48891f2, zMo14821h5);
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "gr":
                C37199o c37199o4 = AbstractC3298a0.f12855a;
                ArrayList arrayList = new ArrayList();
                String strNextString5 = null;
                while (c4738d.hasNext()) {
                    int iMo14824m5 = c4738d.mo14824m(AbstractC3298a0.f12855a);
                    if (iMo14824m5 == 0) {
                        strNextString5 = c4738d.nextString();
                    } else if (iMo14824m5 == 1) {
                        zMo14821h = c4738d.mo14821h();
                    } else if (iMo14824m5 != 2) {
                        c4738d.skipValue();
                    } else {
                        c4738d.beginArray();
                        while (c4738d.hasNext()) {
                            InterfaceC39547b interfaceC39547bM9605a = m9605a(c4738d, c30387i);
                            if (interfaceC39547bM9605a != null) {
                                arrayList.add(interfaceC39547bM9605a);
                            }
                        }
                        c4738d.endArray();
                    }
                }
                c39549d = new C39559n(strNextString5, arrayList, zMo14821h);
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "gs":
                c39549d = AbstractC3315n.m9609a(c4738d, c30387i);
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "mm":
                C37199o c37199o5 = AbstractC3321t.f12906a;
                boolean zMo14821h6 = false;
                int i16 = 0;
                String strNextString6 = null;
                while (c4738d.hasNext()) {
                    int iMo14824m6 = c4738d.mo14824m(AbstractC3321t.f12906a);
                    if (iMo14824m6 == 0) {
                        strNextString6 = c4738d.nextString();
                    } else if (iMo14824m6 == 1) {
                        int iNextInt4 = c4738d.nextInt();
                        if (iNextInt4 != 1) {
                            if (iNextInt4 == 2) {
                                i16 = 2;
                            } else if (iNextInt4 == 3) {
                                i16 = 3;
                            } else if (iNextInt4 == 4) {
                                i16 = 4;
                            } else if (iNextInt4 == 5) {
                                i16 = 5;
                            }
                        }
                        i16 = 1;
                    } else if (iMo14824m6 != 2) {
                        c4738d.mo14825s();
                        c4738d.skipValue();
                    } else {
                        zMo14821h6 = c4738d.mo14821h();
                    }
                }
                C39552g c39552g = new C39552g(strNextString6, i16, zMo14821h6);
                c30387i.m92858a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                c39549d = c39552g;
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "rc":
                C37199o c37199o6 = AbstractC3323v.f12908a;
                boolean zMo14821h7 = false;
                String strNextString7 = null;
                InterfaceC38318f interfaceC38318fM9600b2 = null;
                C38313a c38313aM48891f3 = null;
                C38314b c38314bM48885c1 = null;
                while (c4738d.hasNext()) {
                    int iMo14824m7 = c4738d.mo14824m(AbstractC3323v.f12908a);
                    if (iMo14824m7 == 0) {
                        strNextString7 = c4738d.nextString();
                    } else if (iMo14824m7 == 1) {
                        interfaceC38318fM9600b2 = AbstractC3297a.m9600b(c4738d, c30387i);
                    } else if (iMo14824m7 == 2) {
                        c38313aM48891f3 = AbstractC17269i.m48891f0(c4738d, c30387i);
                    } else if (iMo14824m7 == 3) {
                        c38314bM48885c1 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                    } else if (iMo14824m7 != 4) {
                        c4738d.skipValue();
                    } else {
                        zMo14821h7 = c4738d.mo14821h();
                    }
                }
                c39546a = new C39554i(strNextString7, interfaceC38318fM9600b2, c38313aM48891f3, c38314bM48885c1, zMo14821h7);
                c39549d = c39546a;
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "rd":
                c39549d = AbstractC3325x.m9622a(c4738d, c30387i);
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "rp":
                c39549d = AbstractC3324w.m9621a(c4738d, c30387i);
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "sh":
                C37199o c37199o7 = AbstractC3300b0.f12859a;
                String strNextString8 = null;
                C38313a c38313a3 = null;
                int iNextInt5 = 0;
                boolean zMo14821h8 = false;
                while (c4738d.hasNext()) {
                    int iMo14824m8 = c4738d.mo14824m(AbstractC3300b0.f12859a);
                    if (iMo14824m8 == 0) {
                        strNextString8 = c4738d.nextString();
                    } else if (iMo14824m8 == 1) {
                        iNextInt5 = c4738d.nextInt();
                    } else if (iMo14824m8 == 2) {
                        c38313a3 = new C38313a(AbstractC3318q.m9616a(c4738d, c30387i, AbstractC12064i.m33265c(), C3326y.f12911a, false), 5);
                    } else if (iMo14824m8 != 3) {
                        c4738d.skipValue();
                    } else {
                        zMo14821h8 = c4738d.mo14821h();
                    }
                }
                c39549d = new C39560o(strNextString8, iNextInt5, c38313a3, zMo14821h8);
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "sr":
                c39549d = AbstractC3322u.m9620a(c4738d, c30387i, iNextInt);
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "st":
                C37199o c37199o8 = AbstractC3302c0.f12862a;
                ArrayList arrayList2 = new ArrayList();
                float fNextDouble = 0.0f;
                C38313a c38313a4 = null;
                String strNextString9 = null;
                C38314b c38314b = null;
                C38313a c38313aM48883b1 = null;
                C38314b c38314bM48885c2 = null;
                int i17 = 0;
                int i18 = 0;
                boolean zMo14821h9 = false;
                while (c4738d.hasNext()) {
                    switch (c4738d.mo14824m(AbstractC3302c0.f12862a)) {
                        case 0:
                            strNextString9 = c4738d.nextString();
                            c38314bM48885c0 = null;
                            i14 = 0;
                            break;
                        case 1:
                            c38313aM48883b1 = AbstractC17269i.m48883b0(c4738d, c30387i);
                            c38314bM48885c0 = null;
                            i14 = 0;
                            break;
                        case 2:
                            c38314bM48885c2 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                            c38314bM48885c0 = null;
                            i14 = 0;
                            break;
                        case 3:
                            c38313a4 = AbstractC17269i.m48889e0(c4738d, c30387i);
                            c38314bM48885c0 = null;
                            i14 = 0;
                            break;
                        case 4:
                            i17 = AbstractC12682p.m35486f(3)[c4738d.nextInt() - 1];
                            c38314bM48885c0 = null;
                            i14 = 0;
                            break;
                        case 5:
                            i18 = AbstractC12682p.m35486f(3)[c4738d.nextInt() - 1];
                            c38314bM48885c0 = null;
                            i14 = 0;
                            break;
                        case 6:
                            fNextDouble = (float) c4738d.nextDouble();
                            c38314bM48885c0 = null;
                            i14 = 0;
                            break;
                        case 7:
                            zMo14821h9 = c4738d.mo14821h();
                            c38314bM48885c0 = null;
                            break;
                        case 8:
                            c4738d.beginArray();
                            while (c4738d.hasNext()) {
                                c4738d.beginObject();
                                String strNextString10 = c38314bM48885c0;
                                while (c4738d.hasNext()) {
                                    int iMo14824m9 = c4738d.mo14824m(AbstractC3302c0.f12863b);
                                    if (iMo14824m9 == 0) {
                                        strNextString10 = c4738d.nextString();
                                    } else if (iMo14824m9 != 1) {
                                        c4738d.mo14825s();
                                        c4738d.skipValue();
                                    } else {
                                        c38314bM48885c0 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                                    }
                                }
                                c4738d.endObject();
                                strNextString10.getClass();
                                switch (strNextString10.hashCode()) {
                                    case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                                        if (!strNextString10.equals("d")) {
                                            i13 = -1;
                                        } else {
                                            i13 = i14;
                                        }
                                        break;
                                    case 103:
                                        if (!strNextString10.equals("g")) {
                                            i13 = -1;
                                        } else {
                                            i13 = 1;
                                        }
                                        break;
                                    case 111:
                                        if (!strNextString10.equals("o")) {
                                            i13 = -1;
                                        } else {
                                            i13 = 2;
                                        }
                                        break;
                                    default:
                                        i13 = -1;
                                        break;
                                }
                                switch (i13) {
                                    case 0:
                                    case 1:
                                        arrayList2.add(c38314bM48885c0);
                                        break;
                                    case 2:
                                        c38314b = c38314bM48885c0;
                                        break;
                                }
                                c38314bM48885c0 = null;
                            }
                            c4738d.endArray();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((C38314b) arrayList2.get(i14));
                            }
                            c38314bM48885c0 = null;
                            break;
                        default:
                            c4738d.skipValue();
                            break;
                    }
                }
                if (c38313a4 == null) {
                    c38313a4 = new C38313a(Collections.singletonList(new C13224a(100)), 2);
                }
                c39549d = new C39561p(strNextString9, c38314b, arrayList2, c38313aM48883b1, c38313a4, c38314bM48885c2, i17 == 0 ? 1 : i17, i18 == 0 ? 1 : i18, fNextDouble, zMo14821h9);
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "tm":
                C37199o c37199o9 = AbstractC3304d0.f12866a;
                String strNextString11 = null;
                C38314b c38314bM48885c3 = null;
                C38314b c38314bM48885c4 = null;
                C38314b c38314bM48885c5 = null;
                int i19 = 0;
                boolean zMo14821h10 = false;
                while (c4738d.hasNext()) {
                    int iMo14824m10 = c4738d.mo14824m(AbstractC3304d0.f12866a);
                    if (iMo14824m10 == 0) {
                        c38314bM48885c3 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                    } else if (iMo14824m10 == 1) {
                        c38314bM48885c4 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                    } else if (iMo14824m10 == 2) {
                        c38314bM48885c5 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                    } else if (iMo14824m10 == 3) {
                        strNextString11 = c4738d.nextString();
                    } else if (iMo14824m10 == 4) {
                        int iNextInt6 = c4738d.nextInt();
                        if (iNextInt6 == 1) {
                            i19 = 1;
                        } else {
                            if (iNextInt6 != 2) {
                                throw new IllegalArgumentException(AbstractC2875y.m8295h(iNextInt6, "Unknown trim path type "));
                            }
                            i19 = 2;
                        }
                    } else if (iMo14824m10 != 5) {
                        c4738d.skipValue();
                    } else {
                        zMo14821h10 = c4738d.mo14821h();
                    }
                }
                c39558m = new C39562q(strNextString11, i19, c38314bM48885c3, c38314bM48885c4, c38314bM48885c5, zMo14821h10);
                c39549d = c39558m;
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            case "tr":
                c39549d = AbstractC3301c.m9602a(c4738d, c30387i);
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
            default:
                AbstractC12058c.m33239b("Unknown shape type ".concat(strNextString));
                while (c4738d.hasNext()) {
                    c4738d.skipValue();
                }
                c4738d.endObject();
                return c39549d;
        }
    }
}

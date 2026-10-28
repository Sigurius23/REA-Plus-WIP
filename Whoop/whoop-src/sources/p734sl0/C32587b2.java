package p734sl0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import aws.smithy.kotlin.runtime.time.ParseException;
import b30.C2665z;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.profile.presentation.edit.C9723b;
import i93.C18284j;
import l83.C23454a0;
import org.joda.time.DateTimeConstants;
import p180h0.EnumC16377d2;
import p335n6.InterfaceC26398o;
import p510u0.C34340n1;
import p545v6.C35712a;
import p545v6.C35713b;
import p545v6.C35714c;
import p545v6.C35721j;
import p545v6.C35722k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.C35002d;
import p740ux0.C35365a;
import pp2.C29451o;
import r80.AbstractC31061c;
import so2.C32843a;
import sx1.AbstractC33074j;
import sx1.C33065a;
import tq2.C34084a;
import tr0.C34093a;
import tx0.C34238a;
import u71.C34569c;
import ub2.C34742a;
import uf0.C34908i;
import uf3.C34911a;
import ug.AbstractC34924m;
import ug.C34917f;
import ug.C34918g;
import ug.C34920i;
import ug.C34922k;
import ug.C34929r;
import uw0.C35291a;
import v41.AbstractC35662e;
import wb3.AbstractC37056f;
import xf3.C38266c;
import xk0.C38423a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sl0.b2 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32587b2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135036w;

    public /* synthetic */ C32587b2(int i13) {
        this.f135036w = i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13;
        C34917f c34917f;
        C34917f c34917f2;
        C34917f c34917f3;
        C34917f c34917f4;
        C34917f c34917f5;
        C34917f c34917f6;
        C34917f c34917f7;
        C34917f c34917f8;
        C34917f c34917f9;
        C34917f c34917f10;
        C34917f c34917f11;
        int i14 = this.f135036w;
        final char c3 = '-';
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i15 = 13;
        int i16 = 2;
        byte b = 0;
        int i17 = 0;
        switch (i14) {
            case 0:
                return AbstractC32597d2.m101690S((C38423a.a) obj, ((Boolean) obj2).booleanValue());
            case 1:
                return C32843a.m103074c((Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return C33065a.m104716e((Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC33074j.m104774w((C9598e) obj, (String) obj2);
            case 4:
                return C34084a.m107741c((Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return C34093a.m107777f((C38266c) obj, (C34911a) obj2);
            case 6:
                return C34093a.m107778g((C38266c) obj, (C34911a) obj2);
            case 7:
                return C34093a.m107779h((C38266c) obj, (C34911a) obj2);
            case 8:
                return C34093a.m107780i((C38266c) obj, (C34911a) obj2);
            case 9:
                C34340n1 c34340n1 = (C34340n1) obj2;
                return AbstractC37056f.m118959K(Float.valueOf(c34340n1.f144248a.m87022x()), Boolean.valueOf(((EnumC16377d2) c34340n1.f144253f.getValue()) == EnumC16377d2.f62971w));
            case 10:
                return C34742a.m109741c((Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return C34908i.m110096c((Composer) obj, ((Integer) obj2).intValue());
            case 12:
                String str = (String) obj;
                C18284j range = (C18284j) obj2;
                AbstractC22676k.m65750j(str, "str");
                AbstractC22676k.m65750j(range, "range");
                return Integer.valueOf(Integer.parseInt(AbstractC39414r.m125857C0(str, range)));
            case 13:
                String str2 = (String) obj;
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                AbstractC22676k.m65750j(str2, "str");
                AbstractC34924m.m110128J(iIntValue, 0, str2);
                C34917f c34917f12 = (C34917f) new C9723b((Function1) C34922k.f147040w, 9, (int) (true ? 1 : 0)).invoke(str2, num);
                int i18 = c34917f12.f147021a;
                C18284j c18284j = (C18284j) c34917f12.f147022b;
                if (c18284j.isEmpty()) {
                    throw new ParseException(str2, "expected integer", iIntValue);
                }
                int i19 = Integer.parseInt(AbstractC39414r.m125857C0(str2, c18284j));
                for (int i24 = c18284j.f71134x - c18284j.f71133w; i24 < 8; i24++) {
                    i19 *= 10;
                }
                return new C34917f(i18, Integer.valueOf(i19));
            case 14:
                String str3 = (String) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(str3, "str");
                AbstractC34924m.m110128J(iIntValue2, 3, str3);
                int i25 = iIntValue2 + 3;
                String strSubstring = str3.substring(iIntValue2, i25);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                switch (strSubstring.hashCode()) {
                    case 66051:
                        if (strSubstring.equals("Apr")) {
                            i13 = 4;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 66195:
                        if (strSubstring.equals("Aug")) {
                            i13 = 8;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 68578:
                        if (strSubstring.equals("Dec")) {
                            i13 = 12;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 70499:
                        if (strSubstring.equals("Feb")) {
                            i13 = 2;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 74231:
                        if (strSubstring.equals("Jan")) {
                            i13 = 1;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 74849:
                        if (strSubstring.equals("Jul")) {
                            i13 = 7;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 74851:
                        if (strSubstring.equals("Jun")) {
                            i13 = 6;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 77118:
                        if (strSubstring.equals("Mar")) {
                            i13 = 3;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 77125:
                        if (strSubstring.equals("May")) {
                            i13 = 5;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 78517:
                        if (strSubstring.equals("Nov")) {
                            i13 = 11;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 79104:
                        if (strSubstring.equals("Oct")) {
                            i13 = 10;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    case 83006:
                        if (strSubstring.equals("Sep")) {
                            i13 = 9;
                            return new C34917f(i25, Integer.valueOf(i13));
                        }
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                    default:
                        throw new ParseException(str3, AbstractC31061c.m95633i('`', "invalid month `", strSubstring), iIntValue2);
                }
            case 15:
                String str4 = (String) obj;
                Integer num2 = (Integer) obj2;
                num2.getClass();
                AbstractC22676k.m65750j(str4, "str");
                int i26 = 4;
                C34917f c34917f13 = (C34917f) new C9723b(new C32587b2(12), i26, i26).invoke(str4, num2);
                int i27 = c34917f13.f147021a;
                int iIntValue3 = ((Number) c34917f13.f147022b).intValue();
                try {
                    AbstractC34924m.m110128J(i27, 1, str4);
                    char cCharAt = str4.charAt(i27);
                    if (cCharAt != '-') {
                        throw new ParseException(str4, "expected `-` found `" + cCharAt + '`', i27);
                    }
                    c34917f = new C34917f(i27 + 1, Character.valueOf(cCharAt));
                    C34917f c34917f14 = (C34917f) new C32627j2(i16, new C18284j(1, 12, 1)).invoke(str4, Integer.valueOf(c34917f.f147021a));
                    int i28 = c34917f14.f147021a;
                    int iIntValue4 = ((Number) c34917f14.f147022b).intValue();
                    try {
                        AbstractC34924m.m110128J(i28, 1, str4);
                        char cCharAt2 = str4.charAt(i28);
                        if (cCharAt2 == '-') {
                            c34917f2 = new C34917f(i28 + 1, Character.valueOf(cCharAt2));
                            C34917f c34917f15 = (C34917f) new C32627j2(i16, new C18284j(1, 31, 1)).invoke(str4, Integer.valueOf(c34917f2.f147021a));
                            return new C34917f(c34917f15.f147021a, new C34918g(iIntValue3, iIntValue4, ((Number) c34917f15.f147022b).intValue()));
                        }
                        throw new ParseException(str4, "expected `-` found `" + cCharAt2 + '`', i28);
                    } catch (ParseException unused) {
                        c34917f2 = new C34917f(i28, null);
                    }
                } catch (ParseException unused2) {
                    c34917f = new C34917f(i27, null);
                }
                break;
            case 16:
                String str5 = (String) obj;
                Integer num3 = (Integer) obj2;
                num3.getClass();
                AbstractC22676k.m65750j(str5, "str");
                C34917f c34917f16 = (C34917f) new C32627j2(i16, new C18284j(0, 24, 1)).invoke(str5, num3);
                int i29 = c34917f16.f147021a;
                int iIntValue5 = ((Number) c34917f16.f147022b).intValue();
                try {
                    AbstractC34924m.m110128J(i29, 1, str5);
                    char cCharAt3 = str5.charAt(i29);
                    if (cCharAt3 != ':') {
                        throw new ParseException(str5, "expected `:` found `" + cCharAt3 + '`', i29);
                    }
                    c34917f3 = new C34917f(i29 + 1, Character.valueOf(cCharAt3));
                    C34917f c34917f17 = (C34917f) new C32627j2(i16, new C18284j(0, 59, 1)).invoke(str5, Integer.valueOf(c34917f3.f147021a));
                    int i34 = c34917f17.f147021a;
                    int iIntValue6 = ((Number) c34917f17.f147022b).intValue();
                    try {
                        AbstractC34924m.m110128J(i34, 1, str5);
                        char cCharAt4 = str5.charAt(i34);
                        if (cCharAt4 != ':') {
                            throw new ParseException(str5, "expected `:` found `" + cCharAt4 + '`', i34);
                        }
                        c34917f4 = new C34917f(i34 + 1, Character.valueOf(cCharAt4));
                        C34917f c34917f18 = (C34917f) new C32627j2(i16, new C18284j(0, 60, 1)).invoke(str5, Integer.valueOf(c34917f4.f147021a));
                        int i35 = c34917f18.f147021a;
                        int iIntValue7 = ((Number) c34917f18.f147022b).intValue();
                        try {
                            c34917f5 = (C34917f) new C32587b2(i15).invoke(str5, Integer.valueOf(((C34917f) new C2665z(".,", 14, b).invoke(str5, Integer.valueOf(i35))).f147021a));
                            break;
                        } catch (ParseException unused3) {
                            c34917f5 = new C34917f(i35, null);
                        }
                        int i36 = c34917f5.f147021a;
                        Object obj3 = c34917f5.f147022b;
                        if (obj3 == null) {
                            obj3 = 0;
                        }
                        C34917f c34917f19 = new C34917f(i36, obj3);
                        int iIntValue8 = ((Number) c34917f19.f147022b).intValue();
                        C34917f c34917f20 = (C34917f) new C32587b2(18).invoke(str5, Integer.valueOf(c34917f19.f147021a));
                        return new C34917f(c34917f20.f147021a, new C34920i(iIntValue5, iIntValue6, iIntValue7, iIntValue8, ((Number) c34917f20.f147022b).intValue()));
                    } catch (ParseException unused4) {
                        c34917f4 = new C34917f(i34, null);
                    }
                } catch (ParseException unused5) {
                    c34917f3 = new C34917f(i29, null);
                }
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                String str6 = (String) obj;
                Integer num4 = (Integer) obj2;
                num4.getClass();
                Object obj4 = 0;
                AbstractC22676k.m65750j(str6, "str");
                C34917f c34917f21 = (C34917f) new C32627j2(i16, new C18284j(0, 24, 1)).invoke(str6, num4);
                int i37 = c34917f21.f147021a;
                int iIntValue9 = ((Number) c34917f21.f147022b).intValue();
                C32627j2 c32627j2 = new C32627j2(i16, new C18284j(0, 59, 1));
                AbstractC34924m.m110128J(i37, 1, str6);
                char cCharAt5 = str6.charAt(i37);
                if (cCharAt5 != ':') {
                    throw new ParseException(str6, "expected `:` found `" + cCharAt5 + '`', i37);
                }
                C34917f c34917f22 = (C34917f) c32627j2.invoke(str6, Integer.valueOf(new C34917f(i37 + 1, Character.valueOf(cCharAt5)).f147021a));
                int i38 = c34917f22.f147021a;
                int iIntValue10 = ((Number) c34917f22.f147022b).intValue();
                if (i38 >= str6.length() || str6.charAt(i38) != ':') {
                    c34917f6 = new C34917f(i38, obj4);
                } else {
                    C32627j2 c32627j3 = new C32627j2(i16, new C18284j(0, 60, 1));
                    AbstractC34924m.m110128J(i38, 1, str6);
                    char cCharAt6 = str6.charAt(i38);
                    if (cCharAt6 != ':') {
                        throw new ParseException(str6, "expected `:` found `" + cCharAt6 + '`', i38);
                    }
                    c34917f6 = (C34917f) c32627j3.invoke(str6, Integer.valueOf(new C34917f(i38 + 1, Character.valueOf(cCharAt6)).f147021a));
                }
                int i39 = c34917f6.f147021a;
                int iIntValue11 = ((Number) c34917f6.f147022b).intValue();
                try {
                    c34917f7 = (C34917f) new C32587b2(i15).invoke(str6, Integer.valueOf(((C34917f) new C2665z(".", 14, b).invoke(str6, Integer.valueOf(i39))).f147021a));
                    break;
                } catch (ParseException unused6) {
                    c34917f7 = new C34917f(i39, null);
                }
                int i44 = c34917f7.f147021a;
                Object obj5 = c34917f7.f147022b;
                C34917f c34917f23 = new C34917f(i44, obj5 != null ? obj5 : 0);
                int iIntValue12 = ((Number) c34917f23.f147022b).intValue();
                C34917f c34917f24 = (C34917f) new C32587b2(19).invoke(str6, Integer.valueOf(((C34917f) C34929r.f147046w.invoke(str6, Integer.valueOf(c34917f23.f147021a))).f147021a));
                return new C34917f(c34917f24.f147021a, new C34920i(iIntValue9, iIntValue10, iIntValue11, iIntValue12, ((Number) c34917f24.f147022b).intValue()));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                String str7 = (String) obj;
                Integer num5 = (Integer) obj2;
                int iIntValue13 = num5.intValue();
                AbstractC22676k.m65750j(str7, "str");
                try {
                    InterfaceC4351m[] interfaceC4351mArr = {new C29451o(16, new C2665z("Zz", 14, b), new C34569c(19)), new C32587b2(20)};
                    int iIntValue14 = num5.intValue();
                    while (true) {
                        if (b < interfaceC4351mArr.length) {
                            try {
                                c34917f8 = (C34917f) interfaceC4351mArr[b].invoke(str7, num5);
                            } catch (ParseException unused7) {
                                b++;
                            }
                        } else {
                            c34917f8 = null;
                        }
                    }
                    if (c34917f8 != null) {
                        return c34917f8;
                    }
                    throw new ParseException(str7, "no alternatives matched", iIntValue14);
                } catch (ParseException unused8) {
                    throw new ParseException(str7, "invalid timezone offset; expected `Z|z` or `(+-)HH:MM`", iIntValue13);
                }
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str8 = (String) obj;
                Integer num6 = (Integer) obj2;
                int iIntValue15 = num6.intValue();
                AbstractC22676k.m65750j(str8, "str");
                try {
                    int i45 = 20;
                    InterfaceC4351m[] interfaceC4351mArr2 = {new C29451o(16, new C34238a(new InterfaceC4351m[]{new C2665z("GMT", i15, b), new C2665z("UTC", i15, b), new C2665z("UT", i15, b), new C2665z("Z", i15, b)}, 10), new C34569c(i45)), new C32587b2(i45)};
                    int iIntValue16 = num6.intValue();
                    while (true) {
                        if (i17 < interfaceC4351mArr2.length) {
                            try {
                                c34917f9 = (C34917f) interfaceC4351mArr2[i17].invoke(str8, num6);
                            } catch (ParseException unused9) {
                                i17++;
                            }
                        } else {
                            c34917f9 = null;
                        }
                    }
                    if (c34917f9 != null) {
                        return c34917f9;
                    }
                    throw new ParseException(str8, "no alternatives matched", iIntValue16);
                } catch (ParseException unused10) {
                    throw new ParseException(str8, "invalid timezone offset; expected `GMT` or `(+-)HHMM`", iIntValue15);
                }
            case 20:
                String str9 = (String) obj;
                Integer num7 = (Integer) obj2;
                num7.getClass();
                AbstractC22676k.m65750j(str9, "str");
                final char c7 = '+';
                InterfaceC4351m[] interfaceC4351mArr3 = {new InterfaceC4351m() { // from class: ug.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj6, Object obj7) {
                        String str10 = (String) obj6;
                        int iIntValue17 = ((Integer) obj7).intValue();
                        AbstractC22676k.m65750j(str10, "str");
                        AbstractC34924m.m110128J(iIntValue17, 1, str10);
                        char cCharAt7 = str10.charAt(iIntValue17);
                        char c14 = c7;
                        if (cCharAt7 == c14) {
                            return new C34917f(iIntValue17 + 1, Character.valueOf(cCharAt7));
                        }
                        throw new ParseException(str10, "expected `" + c14 + "` found `" + cCharAt7 + '`', iIntValue17);
                    }
                }, new InterfaceC4351m() { // from class: ug.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj6, Object obj7) {
                        String str10 = (String) obj6;
                        int iIntValue17 = ((Integer) obj7).intValue();
                        AbstractC22676k.m65750j(str10, "str");
                        AbstractC34924m.m110128J(iIntValue17, 1, str10);
                        char cCharAt7 = str10.charAt(iIntValue17);
                        char c14 = c3;
                        if (cCharAt7 == c14) {
                            return new C34917f(iIntValue17 + 1, Character.valueOf(cCharAt7));
                        }
                        throw new ParseException(str10, "expected `" + c14 + "` found `" + cCharAt7 + '`', iIntValue17);
                    }
                }};
                int iIntValue17 = num7.intValue();
                int length = interfaceC4351mArr3.length;
                int i46 = 0;
                while (true) {
                    if (i46 < length) {
                        try {
                            c34917f10 = (C34917f) interfaceC4351mArr3[i46].invoke(str9, num7);
                        } catch (ParseException unused11) {
                            i46++;
                        }
                    } else {
                        c34917f10 = null;
                    }
                }
                if (c34917f10 == null) {
                    throw new ParseException(str9, "no alternatives matched", iIntValue17);
                }
                C34917f c34917f25 = new C34917f(c34917f10.f147021a, Integer.valueOf(((Character) c34917f10.f147022b).charValue() == '-' ? -1 : 1));
                int iIntValue18 = ((Number) c34917f25.f147022b).intValue();
                C34917f c34917f26 = (C34917f) new C32627j2(i16, new C18284j(0, 24, 1)).invoke(str9, Integer.valueOf(c34917f25.f147021a));
                int i47 = c34917f26.f147021a;
                int iIntValue19 = ((Number) c34917f26.f147022b).intValue();
                try {
                    AbstractC34924m.m110128J(i47, 1, str9);
                    char cCharAt7 = str9.charAt(i47);
                    if (cCharAt7 == ':') {
                        c34917f11 = new C34917f(i47 + 1, Character.valueOf(cCharAt7));
                        int length2 = str9.length();
                        int i48 = c34917f11.f147021a;
                        C34917f c34917f27 = i48 < length2 ? (C34917f) new C32627j2(i16, new C18284j(0, 59, 1)).invoke(str9, Integer.valueOf(i48)) : new C34917f(i48, 0);
                        return new C34917f(c34917f27.f147021a, Integer.valueOf(((((Number) c34917f27.f147022b).intValue() * 60) + (iIntValue19 * DateTimeConstants.SECONDS_PER_HOUR)) * iIntValue18));
                    }
                    throw new ParseException(str9, "expected `:` found `" + cCharAt7 + '`', i47);
                } catch (ParseException unused12) {
                    c34917f11 = new C34917f(i47, null);
                }
                break;
            case 21:
                return C35002d.m110513c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C35291a.m111974c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C35365a.m112204e((Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return AbstractC35662e.m112947k((Composer) obj, ((Integer) obj2).intValue());
            case 25:
                ((C35721j) obj).f151962c = (InterfaceC26398o) obj2;
                return c23454a0;
            case 26:
                ((C35721j) obj).f151963d = (C35714c) obj2;
                return c23454a0;
            case 27:
                ((C35722k) obj).f151964c = (InterfaceC26398o) obj2;
                return c23454a0;
            case 28:
                ((C35722k) obj).f151966e = ((C35712a) obj2).f151945a;
                return c23454a0;
            default:
                ((C35722k) obj).f151965d = ((C35713b) obj2).f151946a;
                return c23454a0;
        }
    }
}

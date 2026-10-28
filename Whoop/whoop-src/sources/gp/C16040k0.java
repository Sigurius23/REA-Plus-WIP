package gp;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.C4999x5ced43e0;
import com.google.android.gms.fido.fido2.api.common.C5001x11efcb6;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import java.util.ArrayList;
import mp.C25801t0;
import p557vo.AbstractC36220b;

/* JADX INFO: renamed from: gp.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16040k0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60673a;

    public /* synthetic */ C16040k0(int i13) {
        this.f60673a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f60673a) {
            case 0:
                int iM115294F = AbstractC36220b.m115294F(parcel);
                C16058u c16058u = null;
                C16060w c16060w = null;
                byte[] bArrM115299d = null;
                ArrayList arrayListM115307l = null;
                Double dValueOf = null;
                ArrayList arrayListM115307l2 = null;
                C16039k c16039k = null;
                Integer numM115318z = null;
                C16020a0 c16020a0 = null;
                String strM115303h = null;
                C16025d c16025d = null;
                String strM115303h2 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iM115294F) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            c16058u = (C16058u) AbstractC36220b.m115302g(parcel, i13, C16058u.CREATOR);
                            break;
                        case 3:
                            c16060w = (C16060w) AbstractC36220b.m115302g(parcel, i13, C16060w.CREATOR);
                            break;
                        case 4:
                            bArrM115299d = AbstractC36220b.m115299d(parcel, i13);
                            break;
                        case 5:
                            arrayListM115307l = AbstractC36220b.m115307l(parcel, i13, C16057t.CREATOR);
                            break;
                        case 6:
                            int iM115290B = AbstractC36220b.m115290B(parcel, i13);
                            if (iM115290B != 0) {
                                AbstractC36220b.m115296H(parcel, iM115290B, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        case 7:
                            arrayListM115307l2 = AbstractC36220b.m115307l(parcel, i13, C16055s.CREATOR);
                            break;
                        case '\b':
                            c16039k = (C16039k) AbstractC36220b.m115302g(parcel, i13, C16039k.CREATOR);
                            break;
                        case '\t':
                            numM115318z = AbstractC36220b.m115318z(parcel, i13);
                            break;
                        case '\n':
                            c16020a0 = (C16020a0) AbstractC36220b.m115302g(parcel, i13, C16020a0.CREATOR);
                            break;
                        case 11:
                            strM115303h = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case '\f':
                            c16025d = (C16025d) AbstractC36220b.m115302g(parcel, i13, C16025d.CREATOR);
                            break;
                        case '\r':
                            strM115303h2 = AbstractC36220b.m115303h(parcel, i13);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) AbstractC36220b.m115302g(parcel, i13, ResultReceiver.CREATOR);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i13);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F);
                return new C16053r(c16058u, c16060w, bArrM115299d, arrayListM115307l, dValueOf, arrayListM115307l2, c16039k, numM115318z, c16020a0, strM115303h, c16025d, strM115303h2, resultReceiver);
            case 1:
                int iM115294F2 = AbstractC36220b.m115294F(parcel);
                String strM115303h3 = null;
                String strM115303h4 = null;
                byte[] bArrM115299d2 = null;
                C16033h c16033h = null;
                C16031g c16031g = null;
                C16035i c16035i = null;
                C16027e c16027e = null;
                String strM115303h5 = null;
                while (parcel.dataPosition() < iM115294F2) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strM115303h3 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case 2:
                            strM115303h4 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case 3:
                            bArrM115299d2 = AbstractC36220b.m115299d(parcel, i14);
                            break;
                        case 4:
                            c16033h = (C16033h) AbstractC36220b.m115302g(parcel, i14, C16033h.CREATOR);
                            break;
                        case 5:
                            c16031g = (C16031g) AbstractC36220b.m115302g(parcel, i14, C16031g.CREATOR);
                            break;
                        case 6:
                            c16035i = (C16035i) AbstractC36220b.m115302g(parcel, i14, C16035i.CREATOR);
                            break;
                        case 7:
                            c16027e = (C16027e) AbstractC36220b.m115302g(parcel, i14, C16027e.CREATOR);
                            break;
                        case '\b':
                            strM115303h5 = AbstractC36220b.m115303h(parcel, i14);
                            break;
                        case '\t':
                            AbstractC36220b.m115303h(parcel, i14);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i14);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F2);
                return new C16051q(strM115303h3, strM115303h4, bArrM115299d2, c16033h, c16031g, c16035i, c16027e, strM115303h5);
            case 2:
                int iM115294F3 = AbstractC36220b.m115294F(parcel);
                String strM115303h6 = null;
                byte[] bArrM115299d3 = null;
                ArrayList arrayListM115307l3 = null;
                while (parcel.dataPosition() < iM115294F3) {
                    int i15 = parcel.readInt();
                    char c3 = (char) i15;
                    if (c3 == 2) {
                        strM115303h6 = AbstractC36220b.m115303h(parcel, i15);
                    } else if (c3 == 3) {
                        bArrM115299d3 = AbstractC36220b.m115299d(parcel, i15);
                    } else if (c3 != 4) {
                        AbstractC36220b.m115293E(parcel, i15);
                    } else {
                        arrayListM115307l3 = AbstractC36220b.m115307l(parcel, i15, Transport.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F3);
                return new C16055s(strM115303h6, bArrM115299d3, arrayListM115307l3);
            case 3:
                int iM115294F4 = AbstractC36220b.m115294F(parcel);
                String strM115303h7 = null;
                Integer numM115318z2 = null;
                while (parcel.dataPosition() < iM115294F4) {
                    int i16 = parcel.readInt();
                    char c7 = (char) i16;
                    if (c7 == 2) {
                        strM115303h7 = AbstractC36220b.m115303h(parcel, i16);
                    } else if (c7 != 3) {
                        AbstractC36220b.m115293E(parcel, i16);
                    } else {
                        numM115318z2 = AbstractC36220b.m115318z(parcel, i16);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F4);
                return new C16057t(strM115303h7, numM115318z2.intValue());
            case 4:
                int iM115294F5 = AbstractC36220b.m115294F(parcel);
                String strM115303h8 = null;
                String strM115303h9 = null;
                String strM115303h10 = null;
                while (parcel.dataPosition() < iM115294F5) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 2) {
                        strM115303h8 = AbstractC36220b.m115303h(parcel, i17);
                    } else if (c14 == 3) {
                        strM115303h9 = AbstractC36220b.m115303h(parcel, i17);
                    } else if (c14 != 4) {
                        AbstractC36220b.m115293E(parcel, i17);
                    } else {
                        strM115303h10 = AbstractC36220b.m115303h(parcel, i17);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F5);
                return new C16058u(strM115303h8, strM115303h9, strM115303h10);
            case 5:
                try {
                    return EnumC16059v.m45356b(parcel.readString());
                } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e5) {
                    throw new RuntimeException(e5);
                }
            case 6:
                int iM115294F6 = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d4 = null;
                String strM115303h11 = null;
                String strM115303h12 = null;
                String strM115303h13 = null;
                while (parcel.dataPosition() < iM115294F6) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 2) {
                        bArrM115299d4 = AbstractC36220b.m115299d(parcel, i18);
                    } else if (c15 == 3) {
                        strM115303h11 = AbstractC36220b.m115303h(parcel, i18);
                    } else if (c15 == 4) {
                        strM115303h12 = AbstractC36220b.m115303h(parcel, i18);
                    } else if (c15 != 5) {
                        AbstractC36220b.m115293E(parcel, i18);
                    } else {
                        strM115303h13 = AbstractC36220b.m115303h(parcel, i18);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F6);
                return new C16060w(strM115303h11, strM115303h12, strM115303h13, bArrM115299d4);
            case 7:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return EnumC16062y.m45357b(string);
                } catch (C5001x11efcb6 e13) {
                    throw new RuntimeException(e13);
                }
            case 8:
                int iM115294F7 = AbstractC36220b.m115294F(parcel);
                String strM115303h14 = null;
                while (parcel.dataPosition() < iM115294F7) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        AbstractC36220b.m115293E(parcel, i19);
                    } else {
                        strM115303h14 = AbstractC36220b.m115303h(parcel, i19);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F7);
                return new C16042l0(strM115303h14);
            case 9:
                try {
                    return EnumC16063z.m45358b(parcel.readString());
                } catch (TokenBinding$UnsupportedTokenBindingStatusException e14) {
                    throw new RuntimeException(e14);
                }
            case 10:
                int iM115294F8 = AbstractC36220b.m115294F(parcel);
                String strM115303h15 = null;
                String strM115303h16 = null;
                while (parcel.dataPosition() < iM115294F8) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 2) {
                        strM115303h15 = AbstractC36220b.m115303h(parcel, i24);
                    } else if (c16 != 3) {
                        AbstractC36220b.m115293E(parcel, i24);
                    } else {
                        strM115303h16 = AbstractC36220b.m115303h(parcel, i24);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F8);
                return new C16020a0(strM115303h15, strM115303h16);
            case 11:
                try {
                    return EnumC16023c.m45340b(parcel.readString());
                } catch (C4999x5ced43e0 e15) {
                    throw new RuntimeException(e15);
                }
            case 12:
                int iM115294F9 = AbstractC36220b.m115294F(parcel);
                boolean zM115312t = false;
                while (parcel.dataPosition() < iM115294F9) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        AbstractC36220b.m115293E(parcel, i25);
                    } else {
                        zM115312t = AbstractC36220b.m115312t(parcel, i25);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F9);
                return new C16022b0(zM115312t);
            case 13:
                try {
                    return EnumC16024c0.m45341b(parcel.readString());
                } catch (zzbc e16) {
                    throw new RuntimeException(e16);
                }
            case 14:
                int iM115294F10 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l4 = null;
                while (parcel.dataPosition() < iM115294F10) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        AbstractC36220b.m115293E(parcel, i26);
                    } else {
                        arrayListM115307l4 = AbstractC36220b.m115307l(parcel, i26, C16028e0.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F10);
                return new C16026d0(arrayListM115307l4);
            case 15:
                int iM115294F11 = AbstractC36220b.m115294F(parcel);
                int iM115317y = 0;
                short s13 = 0;
                short s14 = 0;
                while (parcel.dataPosition() < iM115294F11) {
                    int i27 = parcel.readInt();
                    char c17 = (char) i27;
                    if (c17 == 1) {
                        iM115317y = AbstractC36220b.m115317y(parcel, i27);
                    } else if (c17 == 2) {
                        AbstractC36220b.m115295G(parcel, i27, 4);
                        s13 = (short) parcel.readInt();
                    } else if (c17 != 3) {
                        AbstractC36220b.m115293E(parcel, i27);
                    } else {
                        AbstractC36220b.m115295G(parcel, i27, 4);
                        s14 = (short) parcel.readInt();
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F11);
                return new C16028e0(iM115317y, s13, s14);
            case 16:
                int iM115294F12 = AbstractC36220b.m115294F(parcel);
                C16026d0 c16026d0 = null;
                C16044m0 c16044m0 = null;
                C16029f c16029f = null;
                C16046n0 c16046n0 = null;
                String strM115303h17 = null;
                while (parcel.dataPosition() < iM115294F12) {
                    int i28 = parcel.readInt();
                    char c18 = (char) i28;
                    if (c18 == 1) {
                        c16026d0 = (C16026d0) AbstractC36220b.m115302g(parcel, i28, C16026d0.CREATOR);
                    } else if (c18 == 2) {
                        c16044m0 = (C16044m0) AbstractC36220b.m115302g(parcel, i28, C16044m0.CREATOR);
                    } else if (c18 == 3) {
                        c16029f = (C16029f) AbstractC36220b.m115302g(parcel, i28, C16029f.CREATOR);
                    } else if (c18 == 4) {
                        c16046n0 = (C16046n0) AbstractC36220b.m115302g(parcel, i28, C16046n0.CREATOR);
                    } else if (c18 != 5) {
                        AbstractC36220b.m115293E(parcel, i28);
                    } else {
                        strM115303h17 = AbstractC36220b.m115303h(parcel, i28);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F12);
                return new C16027e(c16026d0, c16044m0, c16029f, c16046n0, strM115303h17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iM115294F13 = AbstractC36220b.m115294F(parcel);
                C16047o c16047o = null;
                C16050p0 c16050p0 = null;
                C16022b0 c16022b0 = null;
                C16056s0 c16056s0 = null;
                C16030f0 c16030f0 = null;
                C16032g0 c16032g0 = null;
                C16052q0 c16052q0 = null;
                C16034h0 c16034h0 = null;
                C16049p c16049p = null;
                C16038j0 c16038j0 = null;
                C16042l0 c16042l0 = null;
                C16036i0 c16036i0 = null;
                while (parcel.dataPosition() < iM115294F13) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 2:
                            c16047o = (C16047o) AbstractC36220b.m115302g(parcel, i29, C16047o.CREATOR);
                            break;
                        case 3:
                            c16050p0 = (C16050p0) AbstractC36220b.m115302g(parcel, i29, C16050p0.CREATOR);
                            break;
                        case 4:
                            c16022b0 = (C16022b0) AbstractC36220b.m115302g(parcel, i29, C16022b0.CREATOR);
                            break;
                        case 5:
                            c16056s0 = (C16056s0) AbstractC36220b.m115302g(parcel, i29, C16056s0.CREATOR);
                            break;
                        case 6:
                            c16030f0 = (C16030f0) AbstractC36220b.m115302g(parcel, i29, C16030f0.CREATOR);
                            break;
                        case 7:
                            c16032g0 = (C16032g0) AbstractC36220b.m115302g(parcel, i29, C16032g0.CREATOR);
                            break;
                        case '\b':
                            c16052q0 = (C16052q0) AbstractC36220b.m115302g(parcel, i29, C16052q0.CREATOR);
                            break;
                        case '\t':
                            c16034h0 = (C16034h0) AbstractC36220b.m115302g(parcel, i29, C16034h0.CREATOR);
                            break;
                        case '\n':
                            c16049p = (C16049p) AbstractC36220b.m115302g(parcel, i29, C16049p.CREATOR);
                            break;
                        case 11:
                            c16038j0 = (C16038j0) AbstractC36220b.m115302g(parcel, i29, C16038j0.CREATOR);
                            break;
                        case '\f':
                            c16042l0 = (C16042l0) AbstractC36220b.m115302g(parcel, i29, C16042l0.CREATOR);
                            break;
                        case '\r':
                            c16036i0 = (C16036i0) AbstractC36220b.m115302g(parcel, i29, C16036i0.CREATOR);
                            break;
                        default:
                            AbstractC36220b.m115293E(parcel, i29);
                            break;
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F13);
                return new C16025d(c16047o, c16050p0, c16022b0, c16056s0, c16030f0, c16032g0, c16052q0, c16034h0, c16049p, c16038j0, c16042l0, c16036i0);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iM115294F14 = AbstractC36220b.m115294F(parcel);
                boolean zM115312t2 = false;
                while (parcel.dataPosition() < iM115294F14) {
                    int i34 = parcel.readInt();
                    if (((char) i34) != 1) {
                        AbstractC36220b.m115293E(parcel, i34);
                    } else {
                        zM115312t2 = AbstractC36220b.m115312t(parcel, i34);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F14);
                return new C16029f(zM115312t2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iM115294F15 = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d5 = null;
                byte[] bArrM115299d6 = null;
                while (parcel.dataPosition() < iM115294F15) {
                    int i35 = parcel.readInt();
                    char c19 = (char) i35;
                    if (c19 == 1) {
                        bArrM115299d5 = AbstractC36220b.m115299d(parcel, i35);
                    } else if (c19 != 2) {
                        AbstractC36220b.m115293E(parcel, i35);
                    } else {
                        bArrM115299d6 = AbstractC36220b.m115299d(parcel, i35);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F15);
                return new C16044m0(bArrM115299d5 == null ? null : C25801t0.m76048l(bArrM115299d5.length, bArrM115299d5), bArrM115299d6 != null ? C25801t0.m76048l(bArrM115299d6.length, bArrM115299d6) : null);
            case 20:
                int iM115294F16 = AbstractC36220b.m115294F(parcel);
                boolean zM115312t3 = false;
                byte[] bArrM115299d7 = null;
                while (parcel.dataPosition() < iM115294F16) {
                    int i36 = parcel.readInt();
                    char c24 = (char) i36;
                    if (c24 == 1) {
                        zM115312t3 = AbstractC36220b.m115312t(parcel, i36);
                    } else if (c24 != 2) {
                        AbstractC36220b.m115293E(parcel, i36);
                    } else {
                        bArrM115299d7 = AbstractC36220b.m115299d(parcel, i36);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F16);
                return new C16046n0(zM115312t3, bArrM115299d7 != null ? C25801t0.m76048l(bArrM115299d7.length, bArrM115299d7) : null);
            case 21:
                int iM115294F17 = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d8 = null;
                byte[] bArrM115299d9 = null;
                byte[] bArrM115299d10 = null;
                byte[] bArrM115299d11 = null;
                byte[] bArrM115299d12 = null;
                while (parcel.dataPosition() < iM115294F17) {
                    int i37 = parcel.readInt();
                    char c25 = (char) i37;
                    if (c25 == 2) {
                        bArrM115299d8 = AbstractC36220b.m115299d(parcel, i37);
                    } else if (c25 == 3) {
                        bArrM115299d9 = AbstractC36220b.m115299d(parcel, i37);
                    } else if (c25 == 4) {
                        bArrM115299d10 = AbstractC36220b.m115299d(parcel, i37);
                    } else if (c25 == 5) {
                        bArrM115299d11 = AbstractC36220b.m115299d(parcel, i37);
                    } else if (c25 != 6) {
                        AbstractC36220b.m115293E(parcel, i37);
                    } else {
                        bArrM115299d12 = AbstractC36220b.m115299d(parcel, i37);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F17);
                return new C16031g(bArrM115299d8, bArrM115299d9, bArrM115299d10, bArrM115299d11, bArrM115299d12);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iM115294F18 = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d13 = null;
                byte[] bArrM115299d14 = null;
                byte[] bArrM115299d15 = null;
                String[] strArrM115304i = null;
                while (parcel.dataPosition() < iM115294F18) {
                    int i38 = parcel.readInt();
                    char c26 = (char) i38;
                    if (c26 == 2) {
                        bArrM115299d13 = AbstractC36220b.m115299d(parcel, i38);
                    } else if (c26 == 3) {
                        bArrM115299d14 = AbstractC36220b.m115299d(parcel, i38);
                    } else if (c26 == 4) {
                        bArrM115299d15 = AbstractC36220b.m115299d(parcel, i38);
                    } else if (c26 != 5) {
                        AbstractC36220b.m115293E(parcel, i38);
                    } else {
                        strArrM115304i = AbstractC36220b.m115304i(parcel, i38);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F18);
                return new C16033h(bArrM115299d13, bArrM115299d14, bArrM115299d15, strArrM115304i);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iM115294F19 = AbstractC36220b.m115294F(parcel);
                int iM115317y2 = 0;
                String strM115303h18 = null;
                int iM115317y3 = 0;
                while (parcel.dataPosition() < iM115294F19) {
                    int i39 = parcel.readInt();
                    char c27 = (char) i39;
                    if (c27 == 2) {
                        iM115317y2 = AbstractC36220b.m115317y(parcel, i39);
                    } else if (c27 == 3) {
                        strM115303h18 = AbstractC36220b.m115303h(parcel, i39);
                    } else if (c27 != 4) {
                        AbstractC36220b.m115293E(parcel, i39);
                    } else {
                        iM115317y3 = AbstractC36220b.m115317y(parcel, i39);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F19);
                return new C16035i(iM115317y2, iM115317y3, strM115303h18);
            case 24:
                int iM115294F20 = AbstractC36220b.m115294F(parcel);
                String strM115303h19 = null;
                Boolean boolValueOf = null;
                String strM115303h20 = null;
                String strM115303h21 = null;
                while (parcel.dataPosition() < iM115294F20) {
                    int i44 = parcel.readInt();
                    char c28 = (char) i44;
                    if (c28 == 2) {
                        strM115303h19 = AbstractC36220b.m115303h(parcel, i44);
                    } else if (c28 == 3) {
                        int iM115290B2 = AbstractC36220b.m115290B(parcel, i44);
                        if (iM115290B2 == 0) {
                            boolValueOf = null;
                        } else {
                            AbstractC36220b.m115296H(parcel, iM115290B2, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c28 == 4) {
                        strM115303h20 = AbstractC36220b.m115303h(parcel, i44);
                    } else if (c28 != 5) {
                        AbstractC36220b.m115293E(parcel, i44);
                    } else {
                        strM115303h21 = AbstractC36220b.m115303h(parcel, i44);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F20);
                return new C16039k(strM115303h19, strM115303h20, boolValueOf, strM115303h21);
            case 25:
                try {
                    return C16041l.m45352b(parcel.readInt());
                } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e17) {
                    throw new RuntimeException(e17);
                }
            case 26:
                int iM115294F21 = AbstractC36220b.m115294F(parcel);
                byte[] bArrM115299d16 = null;
                byte[] bArrM115299d17 = null;
                byte[] bArrM115299d18 = null;
                long jM115289A = 0;
                while (parcel.dataPosition() < iM115294F21) {
                    int i45 = parcel.readInt();
                    char c29 = (char) i45;
                    if (c29 == 1) {
                        jM115289A = AbstractC36220b.m115289A(parcel, i45);
                    } else if (c29 == 2) {
                        bArrM115299d16 = AbstractC36220b.m115299d(parcel, i45);
                    } else if (c29 == 3) {
                        bArrM115299d17 = AbstractC36220b.m115299d(parcel, i45);
                    } else if (c29 != 4) {
                        AbstractC36220b.m115293E(parcel, i45);
                    } else {
                        bArrM115299d18 = AbstractC36220b.m115299d(parcel, i45);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F21);
                return new C16048o0(jM115289A, bArrM115299d16, bArrM115299d17, bArrM115299d18);
            case 27:
                int iM115294F22 = AbstractC36220b.m115294F(parcel);
                ArrayList arrayListM115307l5 = null;
                while (parcel.dataPosition() < iM115294F22) {
                    int i46 = parcel.readInt();
                    if (((char) i46) != 1) {
                        AbstractC36220b.m115293E(parcel, i46);
                    } else {
                        arrayListM115307l5 = AbstractC36220b.m115307l(parcel, i46, C16048o0.CREATOR);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F22);
                return new C16050p0(arrayListM115307l5);
            case 28:
                int iM115294F23 = AbstractC36220b.m115294F(parcel);
                while (parcel.dataPosition() < iM115294F23) {
                    int i47 = parcel.readInt();
                    if (((char) i47) != 1) {
                        AbstractC36220b.m115293E(parcel, i47);
                    } else {
                        AbstractC36220b.m115312t(parcel, i47);
                    }
                }
                AbstractC36220b.m115308m(parcel, iM115294F23);
                return new C16052q0();
            default:
                try {
                    return EnumC16045n.m45353b(parcel.readInt());
                } catch (ErrorCode$UnsupportedErrorCodeException e18) {
                    throw new IllegalArgumentException(e18);
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        switch (this.f60673a) {
            case 0:
                return new C16053r[i13];
            case 1:
                return new C16051q[i13];
            case 2:
                return new C16055s[i13];
            case 3:
                return new C16057t[i13];
            case 4:
                return new C16058u[i13];
            case 5:
                return new EnumC16059v[i13];
            case 6:
                return new C16060w[i13];
            case 7:
                return new EnumC16062y[i13];
            case 8:
                return new C16042l0[i13];
            case 9:
                return new EnumC16063z[i13];
            case 10:
                return new C16020a0[i13];
            case 11:
                return new EnumC16023c[i13];
            case 12:
                return new C16022b0[i13];
            case 13:
                return new EnumC16024c0[i13];
            case 14:
                return new C16026d0[i13];
            case 15:
                return new C16028e0[i13];
            case 16:
                return new C16027e[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C16025d[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C16029f[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C16044m0[i13];
            case 20:
                return new C16046n0[i13];
            case 21:
                return new C16031g[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C16033h[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C16035i[i13];
            case 24:
                return new C16039k[i13];
            case 25:
                return new C16041l[i13];
            case 26:
                return new C16048o0[i13];
            case 27:
                return new C16050p0[i13];
            case 28:
                return new C16052q0[i13];
            default:
                return new EnumC16045n[i13];
        }
    }
}

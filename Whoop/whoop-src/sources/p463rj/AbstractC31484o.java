package p463rj;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aws.sdk.kotlin.runtime.auth.credentials.InvalidLoginTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import b30.C2549j2;
import c93.InterfaceC4339a;
import ch.C4582c;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.mapbox.common.logger.LogPriority;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.attestation.AttestationError;
import d13.AbstractC11478a;
import d40.AbstractC11673r;
import e93.AbstractC12889b;
import g40.InterfaceC15450y2;
import g40.InterfaceC15455z2;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21467g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p043c4.C3963i;
import p088dc.AbstractC11895b;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17251l;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17243d;
import p208i2.C17875c1;
import p208i2.C17919x;
import p251jg.C21649b;
import p251jg.C21652e;
import p251jg.C21655h;
import p251jg.C21659l;
import p251jg.C21660m;
import p251jg.C21663p;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22949e;
import p291l0.C22994r1;
import p292l1.AbstractC23149o4;
import p292l1.AbstractC23164r1;
import p302lf.C23893c;
import p319m4.AbstractC25012a;
import p335n6.C26385b;
import p335n6.C26396m;
import p335n6.InterfaceC26398o;
import p355o2.AbstractC27433f0;
import p355o2.C27428d;
import p355o2.C27430e;
import p355o2.C27438i;
import p355o2.C27441l;
import p355o2.C27442m;
import p355o2.C27449t;
import p365od.C27827f;
import p370oj.C27961h;
import p370oj.C27966m;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p477s2.AbstractC32073e;
import p479s4.AbstractC32122c;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p525uj.AbstractC35032j;
import p525uj.AbstractC35033k;
import p525uj.C35031i;
import p525uj.C35035m;
import p543v4.AbstractC35642a;
import p543v4.C35645d;
import p579wc.AbstractC37131z0;
import p579wc.C37087g0;
import p579wc.C37126x;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p619xl.C38445a;
import p623xr.C38619o;
import p635y2.InterfaceC39127r0;
import p672z6.C40121d;
import p672z6.C40122e;
import p672z6.C40123f;
import p673z7.C40137a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22677k0;
import r83.EnumC31071a;
import re.C31271g;
import re.C31273h;
import re.C31292q0;
import rs.AbstractC31780b;
import s83.AbstractC32269c;
import se.AbstractC32417h;
import t40.EnumC33531a;
import tg.AbstractC33774f;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34818h0;
import ud3.C34820i0;
import ud3.C34822j0;
import ug.C34913b;
import vg.C35971r;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import x30.C37928t;
import x31.C37942a;
import x43.AbstractC37978j;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import z51.C40103n;

/* JADX INFO: renamed from: rj.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31484o {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x01f3 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:20:0x005d, B:23:0x006d, B:24:0x007d, B:26:0x0085, B:28:0x0089, B:32:0x0098, B:35:0x00a2, B:37:0x00ac, B:39:0x00b4, B:40:0x00dc, B:41:0x00dd, B:44:0x00e7, B:46:0x00f1, B:47:0x00f8, B:48:0x0120, B:49:0x0121, B:52:0x012b, B:54:0x0135, B:55:0x013d, B:56:0x0165, B:57:0x0166, B:60:0x0170, B:62:0x017a, B:63:0x0180, B:64:0x01a8, B:65:0x01a9, B:68:0x01b2, B:70:0x01bc, B:71:0x01c2, B:72:0x01ea, B:73:0x01eb, B:76:0x01f8, B:78:0x0202, B:79:0x0204, B:81:0x020c, B:83:0x0210, B:84:0x0218, B:120:0x032e, B:86:0x021d, B:89:0x0227, B:91:0x0231, B:92:0x0236, B:93:0x025e, B:94:0x025f, B:97:0x0269, B:99:0x0273, B:100:0x0278, B:101:0x02a0, B:102:0x02a1, B:105:0x02ab, B:107:0x02b5, B:108:0x02bb, B:109:0x02e3, B:110:0x02e4, B:113:0x02ed, B:115:0x02f7, B:116:0x02fd, B:117:0x0325, B:118:0x0326, B:121:0x0333, B:123:0x033d, B:124:0x0343, B:125:0x036b, B:126:0x036c, B:127:0x0373, B:129:0x0377, B:130:0x039f, B:75:0x01f3, B:131:0x03a0, B:132:0x03a7, B:163:0x040e, B:164:0x0433), top: B:170:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: A */
    public static final Object m96948A(String str, InterfaceC35967n interfaceC35967n, String str2, AbstractC32269c abstractC32269c) {
        C37087g0 c37087g0;
        if (abstractC32269c instanceof C37087g0) {
            c37087g0 = (C37087g0) abstractC32269c;
            int i13 = c37087g0.f158656x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37087g0.f158656x = i13 - Integer.MIN_VALUE;
            } else {
                c37087g0 = new C37087g0(abstractC32269c);
            }
        } else {
            c37087g0 = new C37087g0(abstractC32269c);
        }
        Object objM114209d = c37087g0.f158655w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37087g0.f158656x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM114209d);
            String strM119045b = AbstractC37131z0.m119045b(interfaceC35967n, AbstractC37926s0.m121486z(str2, interfaceC35967n), m96970v(str));
            c37087g0.f158656x = 1;
            objM114209d = ((C35971r) interfaceC35967n).m114209d(strM119045b, c37087g0);
            if (objM114209d == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM114209d);
        }
        byte[] bArr = (byte[]) objM114209d;
        if (bArr == null) {
            throw new ProviderConfigurationException("Invalid or missing login session cache. Run `aws login` to initiate a new session", null);
        }
        C40137a c40137a = new C40137a(bArr);
        try {
            AbstractC5583n abstractC5583nM128689i = c40137a.m128689i();
            if (abstractC5583nM128689i.getClass() != C21655h.class) {
                StringBuilder sb4 = new StringBuilder("expected ");
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                sb4.append(c22673i0.getOrCreateKotlinClass(C21655h.class));
                sb4.append("; found ");
                sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
                throw new DeserializationException(sb4.toString());
            }
            boolean z4 = false;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (true) {
                AbstractC5583n abstractC5583nM128689i2 = c40137a.m128689i();
                if (abstractC5583nM128689i2 instanceof C21659l) {
                    if (!z4) {
                        throw new InvalidLoginTokenException("missing `accessToken`", null);
                    }
                    if (str4 == null) {
                        throw new InvalidLoginTokenException("missing `accessKeyId`", null);
                    }
                    if (str5 == null) {
                        throw new InvalidLoginTokenException("missing `secretAccessKey`", null);
                    }
                    if (str6 == null) {
                        throw new InvalidLoginTokenException("missing `sessionToken`", null);
                    }
                    if (str7 == null) {
                        throw new InvalidLoginTokenException("missing `accountId`", null);
                    }
                    if (str3 == null) {
                        throw new InvalidLoginTokenException("missing `expiresAt`", null);
                    }
                    C33647p c33647p = C34913b.f147015x;
                    C34913b c34913bM106272p = C33647p.m106272p(str3);
                    if (str11 == null) {
                        throw new InvalidLoginTokenException("missing `clientId`", null);
                    }
                    if (str9 == null) {
                        throw new InvalidLoginTokenException("missing `refreshToken`", null);
                    }
                    if (str12 != null) {
                        return new C37126x(str4, str5, str6, str7, str8, c34913bM106272p, str9, str10, str11, str12);
                    }
                    throw new InvalidLoginTokenException("missing `dpopKey`", null);
                }
                if (!(abstractC5583nM128689i2 instanceof C21660m)) {
                    throw new IllegalStateException("expected either key or end of object");
                }
                switch (((C21660m) abstractC5583nM128689i2).f83174c) {
                    case "accessToken":
                        AbstractC5583n abstractC5583nM128689i3 = c40137a.m128689i();
                        if (abstractC5583nM128689i3.getClass() != C21655h.class) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("expected ");
                            C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                            sb5.append(c22673i1.getOrCreateKotlinClass(C21655h.class));
                            sb5.append("; found ");
                            sb5.append(c22673i1.getOrCreateKotlinClass(abstractC5583nM128689i3.getClass()));
                            throw new DeserializationException(sb5.toString());
                        }
                        while (true) {
                            AbstractC5583n abstractC5583nM128689i4 = c40137a.m128689i();
                            if (abstractC5583nM128689i4 instanceof C21659l) {
                                z4 = true;
                            }
                            if (!(abstractC5583nM128689i4 instanceof C21660m)) {
                                throw new IllegalStateException("expected key or end of object in accessToken");
                            }
                            String str13 = ((C21660m) abstractC5583nM128689i4).f83174c;
                            switch (str13.hashCode()) {
                                case -1933894261:
                                    if (str13.equals("secretAccessKey")) {
                                        AbstractC5583n abstractC5583nM128689i5 = c40137a.m128689i();
                                        if (abstractC5583nM128689i5.getClass() != C21663p.class) {
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append("expected ");
                                            C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                                            sb6.append(c22673i2.getOrCreateKotlinClass(C21663p.class));
                                            sb6.append("; found ");
                                            sb6.append(c22673i2.getOrCreateKotlinClass(abstractC5583nM128689i5.getClass()));
                                            throw new DeserializationException(sb6.toString());
                                        }
                                        str5 = ((C21663p) abstractC5583nM128689i5).f83177c;
                                    } else {
                                        c40137a.m128699s();
                                    }
                                    break;
                                case -1827029976:
                                    if (str13.equals("accountId")) {
                                        AbstractC5583n abstractC5583nM128689i6 = c40137a.m128689i();
                                        if (abstractC5583nM128689i6.getClass() != C21663p.class) {
                                            StringBuilder sb7 = new StringBuilder();
                                            sb7.append("expected ");
                                            C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                                            sb7.append(c22673i3.getOrCreateKotlinClass(C21663p.class));
                                            sb7.append("; found ");
                                            sb7.append(c22673i3.getOrCreateKotlinClass(abstractC5583nM128689i6.getClass()));
                                            throw new DeserializationException(sb7.toString());
                                        }
                                        str7 = ((C21663p) abstractC5583nM128689i6).f83177c;
                                    } else {
                                        c40137a.m128699s();
                                    }
                                    break;
                                case -1051286314:
                                    if (str13.equals("accessKeyId")) {
                                        AbstractC5583n abstractC5583nM128689i7 = c40137a.m128689i();
                                        if (abstractC5583nM128689i7.getClass() != C21663p.class) {
                                            StringBuilder sb8 = new StringBuilder();
                                            sb8.append("expected ");
                                            C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                                            sb8.append(c22673i4.getOrCreateKotlinClass(C21663p.class));
                                            sb8.append("; found ");
                                            sb8.append(c22673i4.getOrCreateKotlinClass(abstractC5583nM128689i7.getClass()));
                                            throw new DeserializationException(sb8.toString());
                                        }
                                        str4 = ((C21663p) abstractC5583nM128689i7).f83177c;
                                    } else {
                                        c40137a.m128699s();
                                    }
                                    break;
                                case -696552189:
                                    if (str13.equals("sessionToken")) {
                                        AbstractC5583n abstractC5583nM128689i8 = c40137a.m128689i();
                                        if (abstractC5583nM128689i8.getClass() != C21663p.class) {
                                            StringBuilder sb9 = new StringBuilder();
                                            sb9.append("expected ");
                                            C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                                            sb9.append(c22673i5.getOrCreateKotlinClass(C21663p.class));
                                            sb9.append("; found ");
                                            sb9.append(c22673i5.getOrCreateKotlinClass(abstractC5583nM128689i8.getClass()));
                                            throw new DeserializationException(sb9.toString());
                                        }
                                        str6 = ((C21663p) abstractC5583nM128689i8).f83177c;
                                    } else {
                                        c40137a.m128699s();
                                    }
                                    break;
                                case 250196615:
                                    if (str13.equals("expiresAt")) {
                                        AbstractC5583n abstractC5583nM128689i9 = c40137a.m128689i();
                                        if (abstractC5583nM128689i9.getClass() != C21663p.class) {
                                            StringBuilder sb10 = new StringBuilder();
                                            sb10.append("expected ");
                                            C22673i0 c22673i6 = AbstractC22671h0.f89337a;
                                            sb10.append(c22673i6.getOrCreateKotlinClass(C21663p.class));
                                            sb10.append("; found ");
                                            sb10.append(c22673i6.getOrCreateKotlinClass(abstractC5583nM128689i9.getClass()));
                                            throw new DeserializationException(sb10.toString());
                                        }
                                        str3 = ((C21663p) abstractC5583nM128689i9).f83177c;
                                    } else {
                                        c40137a.m128699s();
                                    }
                                    break;
                                default:
                                    c40137a.m128699s();
                                    break;
                            }
                            break;
                        }
                    case "refreshToken":
                        AbstractC5583n abstractC5583nM128689i10 = c40137a.m128689i();
                        if (abstractC5583nM128689i10.getClass() != C21663p.class) {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("expected ");
                            C22673i0 c22673i7 = AbstractC22671h0.f89337a;
                            sb11.append(c22673i7.getOrCreateKotlinClass(C21663p.class));
                            sb11.append("; found ");
                            sb11.append(c22673i7.getOrCreateKotlinClass(abstractC5583nM128689i10.getClass()));
                            throw new DeserializationException(sb11.toString());
                        }
                        str9 = ((C21663p) abstractC5583nM128689i10).f83177c;
                    case "tokenType":
                        AbstractC5583n abstractC5583nM128689i11 = c40137a.m128689i();
                        if (abstractC5583nM128689i11.getClass() != C21663p.class) {
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append("expected ");
                            C22673i0 c22673i8 = AbstractC22671h0.f89337a;
                            sb12.append(c22673i8.getOrCreateKotlinClass(C21663p.class));
                            sb12.append("; found ");
                            sb12.append(c22673i8.getOrCreateKotlinClass(abstractC5583nM128689i11.getClass()));
                            throw new DeserializationException(sb12.toString());
                        }
                        str8 = ((C21663p) abstractC5583nM128689i11).f83177c;
                    case "clientId":
                        AbstractC5583n abstractC5583nM128689i12 = c40137a.m128689i();
                        if (abstractC5583nM128689i12.getClass() != C21663p.class) {
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append("expected ");
                            C22673i0 c22673i9 = AbstractC22671h0.f89337a;
                            sb13.append(c22673i9.getOrCreateKotlinClass(C21663p.class));
                            sb13.append("; found ");
                            sb13.append(c22673i9.getOrCreateKotlinClass(abstractC5583nM128689i12.getClass()));
                            throw new DeserializationException(sb13.toString());
                        }
                        str11 = ((C21663p) abstractC5583nM128689i12).f83177c;
                    case "idToken":
                        AbstractC5583n abstractC5583nM128689i13 = c40137a.m128689i();
                        if (abstractC5583nM128689i13.getClass() != C21663p.class) {
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append("expected ");
                            C22673i0 c22673i10 = AbstractC22671h0.f89337a;
                            sb14.append(c22673i10.getOrCreateKotlinClass(C21663p.class));
                            sb14.append("; found ");
                            sb14.append(c22673i10.getOrCreateKotlinClass(abstractC5583nM128689i13.getClass()));
                            throw new DeserializationException(sb14.toString());
                        }
                        str10 = ((C21663p) abstractC5583nM128689i13).f83177c;
                    case "dpopKey":
                        AbstractC5583n abstractC5583nM128689i14 = c40137a.m128689i();
                        if (abstractC5583nM128689i14.getClass() != C21663p.class) {
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append("expected ");
                            C22673i0 c22673i11 = AbstractC22671h0.f89337a;
                            sb15.append(c22673i11.getOrCreateKotlinClass(C21663p.class));
                            sb15.append("; found ");
                            sb15.append(c22673i11.getOrCreateKotlinClass(abstractC5583nM128689i14.getClass()));
                            throw new DeserializationException(sb15.toString());
                        }
                        str12 = ((C21663p) abstractC5583nM128689i14).f83177c;
                    default:
                        c40137a.m128699s();
                }
            }
        } catch (Exception e5) {
            throw new InvalidLoginTokenException("invalid cached login token", e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m96949a(boolean z4, C37928t c37928t, Set set, IdentifierSpec identifierSpec, Modifier modifier, Composer composer, int i13) {
        boolean z13;
        int i14;
        Set set2;
        Modifier modifier2;
        IdentifierSpec identifierSpec2 = identifierSpec;
        List list = c37928t.f162389g;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(930357458);
        if ((i13 & 6) == 0) {
            z13 = z4;
            i14 = (c28655q.m87155h(z13) ? 4 : 2) | i13;
        } else {
            z13 = z4;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c37928t) : c28655q.m87157i(c37928t) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            set2 = set;
            i14 |= c28655q.m87157i(set2) ? 256 : 128;
        } else {
            set2 = set;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(identifierSpec2) : c28655q.m87157i(identifierSpec2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            modifier2 = modifier;
            i14 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            modifier2 = modifier;
        }
        int i15 = i14;
        if ((i15 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            int i16 = 0;
            for (Object obj : list) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                int i18 = i15 << 3;
                AbstractC32073e.m99745g(z13, (InterfaceC15450y2) obj, modifier2, set2, identifierSpec2, c28655q, (i15 & 14) | ((i15 >> 6) & 896) | (i18 & 7168) | (IdentifierSpec.$stable << 12) | (i18 & 57344), 0);
                c28655q.m87150e0(1630992727);
                if (i16 != AbstractC37056f.m118951C(list)) {
                    AbstractC15751g.m44449b(null, AbstractC11673r.m31082k(c28655q).f37670c, AbstractC11673r.m31083l(c28655q).f37679c, 0.0f, c28655q, 0, 9);
                }
                c28655q.m87173q(false);
                z13 = z4;
                set2 = set;
                identifierSpec2 = identifierSpec;
                modifier2 = modifier;
                i16 = i17;
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(z4, (InterfaceC15455z2) c37928t, (Object) set, (Object) identifierSpec, modifier, i13, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX INFO: renamed from: b */
    public static final void m96950b(boolean z4, String label, String str, Function1 function1, C35031i theme, Modifier modifier, Composer composer, int i13) {
        long j7;
        boolean z13;
        long j13;
        long j14;
        boolean z14;
        long j15;
        long j16;
        boolean z15;
        C2314t c2314t;
        ?? r10;
        Modifier modifier2;
        C28655q c28655q;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(theme, "theme");
        C17919x c17919x = theme.f148291m;
        float f13 = theme.f148282d;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-940983527);
        int i14 = i13 | (c28655q2.m87155h(z4) ? 4 : 2) | (c28655q2.m87153g(label) ? 32 : 16) | (c28655q2.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q2.m87153g(theme) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((374491 & i14) == 74898 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            modifier2 = modifier;
            c28655q = c28655q2;
        } else {
            C33252i c33252iM105489e = str.equals("single") ? AbstractC33253j.f138651a : AbstractC33253j.m105489e(f13);
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f13);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3413j = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t2), theme.f148279a, 0.0f, 2);
            c28655q2.m87152f0(5687216);
            if (c17919x == null) {
                c28655q2.m87152f0(-412521741);
                C35035m c35035m = (C35035m) c28655q2.m87161k(AbstractC35033k.f148295a);
                c28655q2.m87173q(false);
                j7 = c35035m.f148312I;
            } else {
                j7 = c17919x.f69639a;
            }
            c28655q2.m87173q(false);
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3413j, j7, c33252iM105489e2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            boolean zM87153g = c28655q2.m87153g(Boolean.valueOf(z4)) | c28655q2.m87153g(function1);
            Object objM87133R = c28655q2.m87133R();
            Object obj = C28635l.f115821a;
            if (zM87153g || objM87133R == obj) {
                z13 = false;
                objM87133R = new C31480k(function1, z4, 0);
                c28655q2.m87172p0(objM87133R);
            } else {
                z13 = false;
            }
            Modifier modifierM3361f = AbstractC1092a.m3361f(modifierM3409f, z13, null, (InterfaceC4339a) objM87133R, 7);
            float f14 = 1;
            if (z4) {
                c28655q2.m87152f0(-2020315376);
                c28655q2.m87152f0(-412521741);
                C35035m c35035m2 = (C35035m) c28655q2.m87161k(AbstractC35033k.f148295a);
                c28655q2.m87173q(z13);
                j13 = c35035m2.f148330a;
            } else {
                c28655q2.m87152f0(-2020315342);
                c28655q2.m87152f0(-412521741);
                C35035m c35035m3 = (C35035m) c28655q2.m87161k(AbstractC35033k.f148295a);
                c28655q2.m87173q(z13);
                j13 = c35035m3.f148364u;
            }
            c28655q2.m87173q(z13);
            Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM3361f, f14, j13, c33252iM105489e2);
            c28655q2.m87152f0(-2020315159);
            if (!z4) {
                j14 = theme.f148283e;
            } else if (c17919x == null) {
                c28655q2.m87152f0(-412521741);
                C35035m c35035m4 = (C35035m) c28655q2.m87161k(AbstractC35033k.f148295a);
                c28655q2.m87173q(z13);
                j14 = c35035m4.f148312I;
            } else {
                j14 = c17919x.f69639a;
            }
            c28655q2.m87173q(z13);
            Modifier modifierM3394p = AbstractC1099a.m3394p(theme.f148281c, AbstractC1092a.m3358c(modifierM44455h, j14, c33252iM105489e2));
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(AbstractC35032j.m110704f(c28655q2).f148308E), c2306l, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(24, c2314t2), c33252iM105489e);
            float f15 = 2;
            if (z4) {
                c28655q2.m87152f0(-1897287848);
                j15 = AbstractC35032j.m110704f(c28655q2).f148330a;
                z14 = false;
                c28655q2.m87173q(false);
            } else {
                z14 = false;
                c28655q2.m87152f0(-1897287742);
                j15 = AbstractC35032j.m110704f(c28655q2).f148364u;
                c28655q2.m87173q(false);
            }
            Modifier modifierM44455h2 = AbstractC15751g.m44455h(modifierM118994r, f15, j15, c33252iM105489e);
            if (z4) {
                c28655q2.m87152f0(-1897287438);
                j16 = AbstractC35032j.m110704f(c28655q2).f148330a;
                c28655q2.m87173q(z14);
            } else {
                c28655q2.m87152f0(-1897287332);
                j16 = AbstractC35032j.m110704f(c28655q2).f148366w;
                c28655q2.m87173q(z14);
            }
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM44455h2, j16, c33252iM105489e);
            boolean zM87153g2 = c28655q2.m87153g(Boolean.valueOf(z4)) | c28655q2.m87153g(function1);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == obj) {
                z15 = z4;
                objM87133R2 = new C31480k(function1, z15, 1);
                c28655q2.m87172p0(objM87133R2);
            } else {
                z15 = z4;
            }
            Modifier modifierM3361f2 = AbstractC1092a.m3361f(modifierM3358c2, false, null, (InterfaceC4339a) objM87133R2, 7);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3361f2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            c28655q2.m87152f0(-1897286991);
            if (z15) {
                C27430e c27430eM82859b = AbstractC37978j.f162635a;
                if (c27430eM82859b == null) {
                    C27428d c27428d = new C27428d("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i15 = AbstractC27433f0.f110561a;
                    C17875c1 c17875c1 = new C17875c1(C17919x.f69625b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new C27442m(9.0f, 16.17f));
                    arrayList.add(new C27441l(4.83f, 12.0f));
                    arrayList.add(new C27449t(-1.42f, 1.41f));
                    arrayList.add(new C27441l(9.0f, 19.0f));
                    arrayList.add(new C27441l(21.0f, 7.0f));
                    arrayList.add(new C27449t(-1.41f, -1.41f));
                    arrayList.add(C27438i.f110602c);
                    C27428d.m82858a(c27428d, arrayList, c17875c1);
                    c27430eM82859b = c27428d.m82859b();
                    AbstractC37978j.f162635a = c27430eM82859b;
                }
                C27430e c27430e = c27430eM82859b;
                c2314t = c2314t2;
                r10 = 0;
                AbstractC23164r1.m67133b(c27430e, "Checked", AbstractC1102d.m3419p(16, c2314t2), C17919x.f69629f, c28655q2, 3504, 0);
            } else {
                c2314t = c2314t2;
                r10 = 0;
            }
            c28655q2.m87173q(r10);
            c28655q2.m87173q(true);
            AbstractC23149o4.m67127b(label, null, AbstractC35032j.m110704f(c28655q2).f148358o, 0L, null, 0L, null, 0L, 0, false, 0, 0, AbstractC35032j.m110704f(c28655q2).m110711a(Integer.valueOf(theme.f148286h), c28655q2, r10), c28655q2, (i14 >> 3) & 14, 0, 65530);
            C28655q c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            modifier2 = c2314t;
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27961h(z4, label, str, function1, theme, modifier2, i13);
    }

    /* JADX INFO: renamed from: c */
    public static final void m96951c(String text, boolean z4, InterfaceC4339a interfaceC4339a, C35031i theme, Modifier modifier, Composer composer, int i13) {
        boolean z13;
        InterfaceC4339a interfaceC4339a2;
        C35031i c35031i;
        Modifier modifier2;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(theme, "theme");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1929145109);
        int i14 = (c28655q.m87153g(text) ? 4 : 2) | i13 | (c28655q.m87155h(z4) ? 32 : 16) | (c28655q.m87157i(interfaceC4339a) ? 256 : 128) | (c28655q.m87153g(theme) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87153g(modifier) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK);
        if ((46811 & i14) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
            c35031i = theme;
            interfaceC4339a2 = interfaceC4339a;
            z13 = z4;
        } else {
            C37816b c37816bM121341b = AbstractC37817c.m121341b(1437005702, c28655q, new C3963i(theme, text, i14, 5));
            int i15 = i14 >> 3;
            m96954f(z4, interfaceC4339a, theme, modifier, c37816bM121341b, c28655q, (i15 & 14) | 24576 | (i15 & 112) | (i15 & 896) | (i15 & 7168));
            z13 = z4;
            interfaceC4339a2 = interfaceC4339a;
            c35031i = theme;
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C31481l(text, z13, interfaceC4339a2, c35031i, modifier2, i13);
    }

    /* JADX INFO: renamed from: d */
    public static final void m96952d(boolean z4, C31477h c31477h, C35031i theme, Modifier modifier, Composer composer, int i13) {
        boolean z13;
        C31477h c31477h2;
        C35031i c35031i;
        Modifier modifier2;
        AbstractC22676k.m65750j(theme, "theme");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-608225526);
        int i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13 | (c28655q.m87157i(c31477h) ? 32 : 16) | (c28655q.m87153g(theme) ? 256 : 128) | (c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 5851) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
            c35031i = theme;
            c31477h2 = c31477h;
            z13 = z4;
        } else {
            m96954f(z4, c31477h, theme, modifier, AbstractC37817c.m121341b(-1203678641, c28655q, new C31482m(z4, theme)), c28655q, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168));
            z13 = z4;
            c31477h2 = c31477h;
            c35031i = theme;
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27966m(z13, c31477h2, c35031i, modifier2, i13);
    }

    /* JADX INFO: renamed from: e */
    public static final void m96953e(String str, InterfaceC26398o interfaceC26398o, C40123f c40123f, int i13, Composer composer, int i14, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-192911377);
        int i17 = (c28655q.m87153g(str) ? 4 : 2) | i14;
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
        } else {
            i16 = i17 | (c28655q.m87153g(interfaceC26398o) ? 32 : 16);
        }
        if (((i16 | (c28655q.m87153g(c40123f) ? 256 : 128) | 3072) & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87140Z();
            if ((i14 & 1) == 0 || c28655q.m87118C()) {
                if (i18 != 0) {
                    interfaceC26398o = C26396m.f104850a;
                }
                i13 = Integer.MAX_VALUE;
            } else {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            c28655q.m87152f0(1849434622);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C40122e.f173169w;
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
            c28655q.m87152f0(-1115894518);
            c28655q.m87152f0(1886828752);
            if (!(c28655q.f115906a instanceof C26385b)) {
                AbstractC28683x.m87269w();
                throw null;
            }
            c28655q.m87146c0();
            if (c28655q.f115903S) {
                c28655q.m87163l(new C4582c(interfaceC4339a, 4));
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, new C37942a(27), str);
            AbstractC28683x.m87239G(c28655q, new C37942a(28), interfaceC26398o);
            AbstractC28683x.m87239G(c28655q, new C37942a(29), c40123f);
            C40121d c40121d = new C40121d(0);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(i13))) {
                c28655q.m87172p0(Integer.valueOf(i13));
                c28655q.m87143b(Integer.valueOf(i13), c40121d);
            }
            AbstractC25012a.m73392y(c28655q, true, false, false);
        }
        InterfaceC26398o interfaceC26398o2 = interfaceC26398o;
        int i19 = i13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(str, interfaceC26398o2, c40123f, i19, i14, i15);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m96954f(boolean z4, InterfaceC4339a interfaceC4339a, C35031i theme, Modifier modifier, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C17919x c17919x;
        long j7;
        AbstractC22676k.m65750j(theme, "theme");
        long j13 = theme.f148284f;
        long j14 = theme.f148283e;
        C17919x c17919x2 = theme.f148290l;
        float f13 = theme.f148282d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(537098187);
        if ((i13 & 14) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= c28655q.m87153g(theme) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i14 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((57344 & i13) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((46811 & i14) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87152f0(-2097475203);
            Modifier modifierM36262a0 = C2314t.f9131w;
            if (z4) {
                float f14 = 2;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(f13);
                if (c17919x2 == null) {
                    c28655q.m87152f0(-412521741);
                    C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
                    c28655q.m87173q(false);
                    j7 = c35035m.f148330a;
                } else {
                    j7 = c17919x2.f69639a;
                }
                modifierM36262a0 = AbstractC12889b.m36262a0(modifierM36262a0, f14, c33252iM105489e, false, 0L, C17919x.m51541c(0.5f, j7), 12);
            } else {
                j13 = j13;
            }
            c28655q.m87173q(false);
            Modifier modifierM118994r = AbstractC37056f.m118994r(modifier.mo3471e(modifierM36262a0), AbstractC33253j.m105489e(f13));
            if (z4 && (c17919x = theme.f148291m) != null) {
                j14 = c17919x.f69639a;
            }
            Modifier modifierM3411h = AbstractC1102d.m3411h(theme.f148279a, AbstractC1092a.m3361f(AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM118994r, j14, AbstractC33253j.m105489e(f13)), 1, (!z4 || c17919x2 == null) ? j13 : c17919x2.f69639a, AbstractC33253j.m105489e(f13)), false, null, interfaceC4339a, 7));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC18489d0.m53384y((i14 >> 12) & 14, c37816b, c28655q, true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C31483n(z4, interfaceC4339a, theme, modifier, c37816b, i13);
    }

    /* JADX INFO: renamed from: g */
    public static final ArrayList m96955g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C38619o c38619o = (C38619o) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", c38619o.f166129a);
            bundle.putLong("event_timestamp", c38619o.f166130b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: h */
    public static String m96956h(int i13, int i14, String str) {
        if (i13 < 0) {
            return AbstractC31780b.m98690k("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return AbstractC31780b.m98690k("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "negative size: "));
    }

    /* JADX INFO: renamed from: i */
    public static void m96957i(int i13, int i14) {
        String strM98690k;
        if (i13 < 0 || i13 >= i14) {
            if (i13 < 0) {
                strM98690k = AbstractC31780b.m98690k("%s (%s) must not be negative", "index", Integer.valueOf(i13));
            } else {
                if (i14 < 0) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "negative size: "));
                }
                strM98690k = AbstractC31780b.m98690k("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
            }
            throw new IndexOutOfBoundsException(strM98690k);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m96958j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m96959k(int i13, int i14) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(m96956h(i13, i14, "index"));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m96960l(int i13, int i14, int i15) {
        String strM96956h;
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            if (i13 < 0 || i13 > i15) {
                strM96956h = m96956h(i13, i15, "start index");
            } else {
                strM96956h = (i14 < 0 || i14 > i15) ? m96956h(i14, i15, "end index") : AbstractC31780b.m98690k("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strM96956h);
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m96961m(int i13, int i14) {
        return AbstractC35642a.m112838g(i13, (Color.alpha(i13) * i14) / 255);
    }

    /* JADX INFO: renamed from: n */
    public static float[] m96962n(float[] fArr, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i13, length);
        float[] fArr2 = new float[i13];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: o */
    public static C34820i0 m96963o(String str, String str2, AbstractC34846v0 abstractC34846v0) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("form-data; name=");
        C34818h0 c34818h0 = C34822j0.f146597e;
        AbstractC31479j.m96937p(sbM53374o, str);
        if (str2 != null) {
            sbM53374o.append("; filename=");
            AbstractC31479j.m96937p(sbM53374o, str2);
        }
        String string = sbM53374o.toString();
        C22677k0 c22677k0 = new C22677k0(2, false);
        c22677k0.m65765f("Content-Disposition", string);
        C34807d0 c34807d0M65766g = c22677k0.m65766g();
        if (c34807d0M65766g.m109863a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c34807d0M65766g.m109863a("Content-Length") == null) {
            return new C34820i0(c34807d0M65766g, abstractC34846v0);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public static C35645d[] m96964p(String str) {
        int i13;
        String strTrim;
        float[] fArrM96962n;
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i16 < str.length()) {
            while (i16 < str.length()) {
                char cCharAt = str.charAt(i16);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i15, i16).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i14) != 'z' || strTrim.charAt(i14) == 'Z') {
                                fArrM96962n = new float[i14];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i17 = i14;
                                    int i18 = 1;
                                    while (i18 < length) {
                                        int i19 = i14;
                                        int i24 = i19;
                                        int i25 = i24;
                                        int i26 = i25;
                                        for (int i27 = i18; i27 < strTrim.length(); i27++) {
                                            char cCharAt2 = strTrim.charAt(i27);
                                            if (cCharAt2 == ' ') {
                                                i19 = 0;
                                                i25 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i19 = 0;
                                                        i25 = 1;
                                                        break;
                                                    case '-':
                                                        if (i27 == i18 || i19 != 0) {
                                                            i19 = 0;
                                                        } else {
                                                            i19 = 0;
                                                            i25 = 1;
                                                            i26 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i24 == 0) {
                                                            i19 = 0;
                                                            i24 = 1;
                                                        } else {
                                                            i19 = 0;
                                                            i25 = 1;
                                                            i26 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i19 = 0;
                                                        break;
                                                }
                                            } else {
                                                i19 = 1;
                                            }
                                            if (i25 != 0) {
                                                if (i18 < i27) {
                                                    fArr[i17] = Float.parseFloat(strTrim.substring(i18, i27));
                                                    i17++;
                                                }
                                                if (i26 != 0) {
                                                    i18 = i27;
                                                } else {
                                                    i18 = i27 + 1;
                                                }
                                                i14 = 0;
                                            }
                                        }
                                        if (i18 < i27) {
                                            fArr[i17] = Float.parseFloat(strTrim.substring(i18, i27));
                                            i17++;
                                        }
                                        if (i26 != 0) {
                                            i18 = i27;
                                        } else {
                                            i18 = i27 + 1;
                                        }
                                        i14 = 0;
                                    }
                                    fArrM96962n = m96962n(fArr, i17);
                                    i14 = 0;
                                } catch (NumberFormatException e5) {
                                    throw new RuntimeException(AbstractC11895b.m31996o("error in parsing \"", strTrim, "\""), e5);
                                }
                            }
                            arrayList.add(new C35645d(strTrim.charAt(i14), fArrM96962n));
                        }
                        i15 = i16;
                        i16++;
                        i14 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i16++;
            }
            strTrim = str.substring(i15, i16).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i14) != 'z') {
                    fArrM96962n = new float[i14];
                } else {
                    fArrM96962n = new float[i14];
                }
                arrayList.add(new C35645d(strTrim.charAt(i14), fArrM96962n));
            }
            i15 = i16;
            i16++;
            i14 = 0;
        }
        if (i16 - i15 != 1 || i15 >= str.length()) {
            i13 = 0;
        } else {
            i13 = 0;
            arrayList.add(new C35645d(str.charAt(i15), new float[0]));
        }
        return (C35645d[]) arrayList.toArray(new C35645d[i13]);
    }

    /* JADX INFO: renamed from: q */
    public static C35645d[] m96965q(C35645d[] c35645dArr) {
        C35645d[] c35645dArr2 = new C35645d[c35645dArr.length];
        for (int i13 = 0; i13 < c35645dArr.length; i13++) {
            c35645dArr2[i13] = new C35645d(c35645dArr[i13]);
        }
        return c35645dArr2;
    }

    /* JADX INFO: renamed from: r */
    public static final C31273h m96966r(C21649b c21649b) {
        C31271g c31271g = new C31271g();
        C17251l c17251l = C17251l.f66278i;
        int i13 = 1;
        int i14 = 0;
        C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccessToken")}), 0);
        C17248i c17248i2 = new C17248i(C17251l.f66274e, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("ExpiresIn")}), 0);
        C17248i c17248i3 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("IdToken")}), 0);
        C17248i c17248i4 = new C17248i(C17251l.f66279j, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("NewDeviceMetadata")}), 0);
        C17248i c17248i5 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("RefreshToken")}), 0);
        C17248i c17248i6 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("TokenType")}), 0);
        C38445a c38445a = new C38445a(13);
        c38445a.m123180p(c17248i);
        c38445a.m123180p(c17248i2);
        c38445a.m123180p(c17248i3);
        c38445a.m123180p(c17248i4);
        c38445a.m123180p(c17248i5);
        c38445a.m123180p(c17248i6);
        InterfaceC17242c interfaceC17242cM60916d = c21649b.m60916d(new C17249j(c38445a));
        while (true) {
            Integer numMo45167q = interfaceC17242cM60916d.mo45167q();
            int i15 = c17248i.f66267b;
            if (numMo45167q != null && numMo45167q.intValue() == i15) {
                c31271g.f128785b = interfaceC17242cM60916d.mo45166o();
            } else {
                int i16 = c17248i2.f66267b;
                if (numMo45167q != null && numMo45167q.intValue() == i16) {
                    c31271g.f128784a = interfaceC17242cM60916d.mo45164h();
                } else {
                    int i17 = c17248i3.f66267b;
                    if (numMo45167q != null && numMo45167q.intValue() == i17) {
                        c31271g.f128786c = interfaceC17242cM60916d.mo45166o();
                    } else {
                        int i18 = c17248i4.f66267b;
                        if (numMo45167q != null && numMo45167q.intValue() == i18) {
                            C27827f c27827f = new C27827f();
                            InterfaceC17243d[] interfaceC17243dArr = new InterfaceC17243d[i13];
                            interfaceC17243dArr[i14] = new C21652e("DeviceGroupKey");
                            C17248i c17248i7 = new C17248i(c17251l, AbstractC25260n.m74059b1(interfaceC17243dArr), i14);
                            int i19 = i14;
                            InterfaceC17243d[] interfaceC17243dArr2 = new InterfaceC17243d[i13];
                            interfaceC17243dArr2[i19] = new C21652e("DeviceKey");
                            C17248i c17248i8 = new C17248i(c17251l, AbstractC25260n.m74059b1(interfaceC17243dArr2), i19);
                            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i7, c17248i8), c21649b);
                            while (true) {
                                Integer numMo45167q2 = interfaceC17242cM30855g.mo45167q();
                                int i24 = c17248i7.f66267b;
                                if (numMo45167q2 == null || numMo45167q2.intValue() != i24) {
                                    int i25 = c17248i8.f66267b;
                                    if (numMo45167q2 == null || numMo45167q2.intValue() != i25) {
                                        if (numMo45167q2 == null) {
                                            break;
                                        }
                                        interfaceC17242cM30855g.skipValue();
                                    } else {
                                        c27827f.f112092b = interfaceC17242cM30855g.mo45166o();
                                    }
                                } else {
                                    c27827f.f112091a = interfaceC17242cM30855g.mo45166o();
                                }
                            }
                            c31271g.f128789f = new C31292q0(c27827f);
                        } else {
                            int i26 = c17248i5.f66267b;
                            if (numMo45167q != null && numMo45167q.intValue() == i26) {
                                c31271g.f128787d = interfaceC17242cM60916d.mo45166o();
                            } else {
                                int i27 = c17248i6.f66267b;
                                if (numMo45167q != null && numMo45167q.intValue() == i27) {
                                    c31271g.f128788e = interfaceC17242cM60916d.mo45166o();
                                } else {
                                    if (numMo45167q == null) {
                                        return new C31273h(c31271g);
                                    }
                                    interfaceC17242cM60916d.skipValue();
                                }
                            }
                        }
                        i13 = 1;
                        i14 = 0;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: s */
    public static AttestationError m96967s(Throwable th3) {
        if (!(th3 instanceof StandardIntegrityException)) {
            EnumC33531a enumC33531a = EnumC33531a.f139972w;
            return new AttestationError("An unknown error occurred", th3);
        }
        if (((EnumC33531a) AttestationError.f22594w.get(Integer.valueOf(((StandardIntegrityException) th3).f20483w.f20493w))) == null) {
            EnumC33531a enumC33531a2 = EnumC33531a.f139972w;
        }
        String message = th3.getMessage();
        if (message == null) {
            message = "Integrity error occurred";
        }
        return new AttestationError(message, th3);
    }

    /* JADX INFO: renamed from: t */
    public static int m96968t(Context context, int i13, int i14) {
        Integer numValueOf;
        TypedValue typedValueM56323V = AbstractC20301a.m56323V(context, i13);
        if (typedValueM56323V != null) {
            int i15 = typedValueM56323V.resourceId;
            numValueOf = Integer.valueOf(i15 != 0 ? AbstractC32122c.getColor(context, i15) : typedValueM56323V.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i14;
    }

    /* JADX INFO: renamed from: u */
    public static int m96969u(View view, int i13) {
        Context context = view.getContext();
        TypedValue typedValueM56325X = AbstractC20301a.m56325X(view.getContext(), i13, view.getClass().getCanonicalName());
        int i14 = typedValueM56325X.resourceId;
        return i14 != 0 ? AbstractC32122c.getColor(context, i14) : typedValueM56325X.data;
    }

    /* JADX INFO: renamed from: v */
    public static final String m96970v(String cacheKey) {
        AbstractC22676k.m65750j(cacheKey, "cacheKey");
        return AbstractC2875y.m8299l(AbstractC33774f.m106780a(AbstractC32417h.m101179J(new C23893c(), AbstractC39421y.m125919D(AbstractC39414r.m125869O0(cacheKey).toString()))), ".json");
    }

    /* JADX INFO: renamed from: w */
    public static boolean m96971w(int i13) {
        return i13 != 0 && AbstractC35642a.m112835d(i13) > 0.5d;
    }

    /* JADX INFO: renamed from: x */
    public static int m96972x(float f13, int i13, int i14) {
        return AbstractC35642a.m112836e(AbstractC35642a.m112838g(i14, Math.round(Color.alpha(i14) * f13)), i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static void m96973y(C35645d[] c35645dArr, Path path) {
        int i13;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f24;
        float f25;
        float f26;
        C35645d[] c35645dArr2 = c35645dArr;
        float[] fArr = new float[6];
        int length = c35645dArr2.length;
        int i14 = 0;
        int i15 = 0;
        char c3 = 'm';
        while (i15 < length) {
            C35645d c35645d = c35645dArr2[i15];
            char c7 = c35645d.f151454a;
            float[] fArr2 = c35645d.f151455b;
            float f27 = fArr[i14];
            float f28 = fArr[1];
            float f29 = fArr[2];
            float f34 = fArr[3];
            float f35 = fArr[4];
            int i16 = i14;
            float f36 = fArr[5];
            switch (c7) {
                case 'A':
                case 'a':
                    i13 = 7;
                    break;
                case 'C':
                case LogPriority.NONE /* 99 */:
                    i13 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i13 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i13 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f35, f36);
                    f27 = f35;
                    f29 = f27;
                    f28 = f36;
                    f34 = f28;
                default:
                    i13 = 2;
                    break;
            }
            float f37 = f35;
            float f38 = f36;
            float f39 = f27;
            float f43 = f28;
            int i17 = i16;
            while (i17 < fArr2.length) {
                if (c7 == 'A') {
                    fArr2 = fArr2;
                    i17 = i17;
                    c35645d = c35645d;
                    float f44 = f43;
                    i15 = i15;
                    int i18 = i17 + 5;
                    int i19 = i17 + 6;
                    C35645d.m112844a(path, f39, f44, fArr2[i18], fArr2[i19], fArr2[i17], fArr2[i17 + 1], fArr2[i17 + 2], fArr2[i17 + 3] != 0.0f ? 1 : i16, fArr2[i17 + 4] != 0.0f ? 1 : i16);
                    f29 = fArr2[i18];
                    f13 = fArr2[i19];
                    f34 = f13;
                    f14 = f29;
                } else if (c7 == 'C') {
                    fArr2 = fArr2;
                    i17 = i17;
                    i15 = i15;
                    c35645d = c35645d;
                    int i24 = i17 + 2;
                    int i25 = i17 + 3;
                    int i26 = i17 + 4;
                    int i27 = i17 + 5;
                    path.cubicTo(fArr2[i17], fArr2[i17 + 1], fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                    float f45 = fArr2[i26];
                    float f46 = fArr2[i27];
                    f29 = fArr2[i24];
                    f34 = fArr2[i25];
                    f13 = f46;
                    f14 = f45;
                } else if (c7 == 'H') {
                    fArr2 = fArr2;
                    i17 = i17;
                    c35645d = c35645d;
                    f13 = f43;
                    i15 = i15;
                    path.lineTo(fArr2[i17], f13);
                    f14 = fArr2[i17];
                } else if (c7 == 'Q') {
                    fArr2 = fArr2;
                    i17 = i17;
                    i15 = i15;
                    c35645d = c35645d;
                    int i28 = i17 + 1;
                    int i29 = i17 + 2;
                    int i34 = i17 + 3;
                    path.quadTo(fArr2[i17], fArr2[i28], fArr2[i29], fArr2[i34]);
                    float f47 = fArr2[i17];
                    float f48 = fArr2[i28];
                    float f49 = fArr2[i29];
                    float f54 = fArr2[i34];
                    f29 = f47;
                    f34 = f48;
                    f14 = f49;
                    f13 = f54;
                } else if (c7 == 'V') {
                    fArr2 = fArr2;
                    i17 = i17;
                    i15 = i15;
                    c35645d = c35645d;
                    f14 = f39;
                    path.lineTo(f14, fArr2[i17]);
                    f13 = fArr2[i17];
                } else if (c7 != 'a') {
                    if (c7 == 'c') {
                        fArr2 = fArr2;
                        i17 = i17;
                        int i35 = i17 + 2;
                        int i36 = i17 + 3;
                        int i37 = i17 + 4;
                        int i38 = i17 + 5;
                        path.rCubicTo(fArr2[i17], fArr2[i17 + 1], fArr2[i35], fArr2[i36], fArr2[i37], fArr2[i38]);
                        float f55 = fArr2[i35] + f39;
                        float f56 = fArr2[i36] + f43;
                        f39 += fArr2[i37];
                        f43 += fArr2[i38];
                        f29 = f55;
                        f34 = f56;
                    } else if (c7 != 'h') {
                        if (c7 != 'q') {
                            if (c7 != 'v') {
                                if (c7 == 'L') {
                                    fArr2 = fArr2;
                                    i17 = i17;
                                    int i39 = i17 + 1;
                                    path.lineTo(fArr2[i17], fArr2[i39]);
                                    f14 = fArr2[i17];
                                    f13 = fArr2[i39];
                                } else if (c7 == 'M') {
                                    fArr2 = fArr2;
                                    i17 = i17;
                                    f14 = fArr2[i17];
                                    f13 = fArr2[i17 + 1];
                                    if (i17 > 0) {
                                        path.lineTo(f14, f13);
                                    } else {
                                        path.moveTo(f14, f13);
                                        f37 = f14;
                                        f38 = f13;
                                    }
                                } else if (c7 == 'S') {
                                    fArr2 = fArr2;
                                    i17 = i17;
                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                        f39 = (f39 * 2.0f) - f29;
                                        f43 = (f43 * 2.0f) - f34;
                                    }
                                    float f57 = f39;
                                    float f58 = f43;
                                    int i44 = i17 + 1;
                                    int i45 = i17 + 2;
                                    int i46 = i17 + 3;
                                    path.cubicTo(f57, f58, fArr2[i17], fArr2[i44], fArr2[i45], fArr2[i46]);
                                    f29 = fArr2[i17];
                                    f34 = fArr2[i44];
                                    f14 = fArr2[i45];
                                    f13 = fArr2[i46];
                                } else if (c7 == 'T') {
                                    fArr2 = fArr2;
                                    i17 = i17;
                                    if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                        f39 = (f39 * 2.0f) - f29;
                                        f43 = (f43 * 2.0f) - f34;
                                    }
                                    int i47 = i17 + 1;
                                    path.quadTo(f39, f43, fArr2[i17], fArr2[i47]);
                                    f14 = fArr2[i17];
                                    f13 = fArr2[i47];
                                    c35645d = c35645d;
                                    f29 = f39;
                                    f34 = f43;
                                } else if (c7 == 'l') {
                                    fArr2 = fArr2;
                                    i17 = i17;
                                    int i48 = i17 + 1;
                                    path.rLineTo(fArr2[i17], fArr2[i48]);
                                    f39 += fArr2[i17];
                                    f18 = fArr2[i48];
                                } else if (c7 == 'm') {
                                    fArr2 = fArr2;
                                    i17 = i17;
                                    float f59 = fArr2[i17];
                                    f39 += f59;
                                    float f64 = fArr2[i17 + 1];
                                    f43 += f64;
                                    if (i17 > 0) {
                                        path.rLineTo(f59, f64);
                                    } else {
                                        path.rMoveTo(f59, f64);
                                        c35645d = c35645d;
                                        f14 = f39;
                                        f37 = f14;
                                        f13 = f43;
                                        f38 = f13;
                                    }
                                } else if (c7 != 's') {
                                    if (c7 != 't') {
                                        f14 = f39;
                                    } else {
                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                            f25 = f39 - f29;
                                            f26 = f43 - f34;
                                        } else {
                                            f26 = 0.0f;
                                            f25 = 0.0f;
                                        }
                                        int i49 = i17 + 1;
                                        path.rQuadTo(f25, f26, fArr2[i17], fArr2[i49]);
                                        float f65 = f25 + f39;
                                        float f66 = f26 + f43;
                                        float f67 = f39 + fArr2[i17];
                                        f43 += fArr2[i49];
                                        f34 = f66;
                                        f14 = f67;
                                        f29 = f65;
                                    }
                                    f13 = f43;
                                } else {
                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                        f19 = f43 - f34;
                                        f24 = f39 - f29;
                                    } else {
                                        f24 = 0.0f;
                                        f19 = 0.0f;
                                    }
                                    int i54 = i17;
                                    int i55 = i54 + 1;
                                    int i56 = i54 + 2;
                                    int i57 = i54 + 3;
                                    fArr2 = fArr2;
                                    i17 = i54;
                                    path.rCubicTo(f24, f19, fArr2[i54], fArr2[i55], fArr2[i56], fArr2[i57]);
                                    f15 = fArr2[i17] + f39;
                                    f16 = fArr2[i55] + f43;
                                    f39 += fArr2[i56];
                                    f17 = fArr2[i57];
                                }
                                c35645d = c35645d;
                            } else {
                                fArr2 = fArr2;
                                i17 = i17;
                                path.rLineTo(0.0f, fArr2[i17]);
                                f18 = fArr2[i17];
                            }
                            f43 += f18;
                        } else {
                            fArr2 = fArr2;
                            i17 = i17;
                            int i58 = i17 + 1;
                            int i59 = i17 + 2;
                            int i64 = i17 + 3;
                            path.rQuadTo(fArr2[i17], fArr2[i58], fArr2[i59], fArr2[i64]);
                            f15 = fArr2[i17] + f39;
                            f16 = fArr2[i58] + f43;
                            f39 += fArr2[i59];
                            f17 = fArr2[i64];
                        }
                        f43 += f17;
                        f29 = f15;
                        f34 = f16;
                    } else {
                        fArr2 = fArr2;
                        i17 = i17;
                        path.rLineTo(fArr2[i17], 0.0f);
                        f39 += fArr2[i17];
                    }
                    c35645d = c35645d;
                    f14 = f39;
                    f13 = f43;
                } else {
                    fArr2 = fArr2;
                    i17 = i17;
                    int i65 = i17 + 5;
                    float f68 = fArr2[i65] + f39;
                    int i66 = i17 + 6;
                    float f69 = fArr2[i66] + f43;
                    c35645d = c35645d;
                    float f74 = f39;
                    float f75 = f43;
                    i15 = i15;
                    C35645d.m112844a(path, f74, f75, f68, f69, fArr2[i17], fArr2[i17 + 1], fArr2[i17 + 2], fArr2[i17 + 3] != 0.0f ? 1 : i16, fArr2[i17 + 4] != 0.0f ? 1 : i16);
                    f14 = f74 + fArr2[i65];
                    f13 = f75 + fArr2[i66];
                    f29 = f14;
                    f34 = f13;
                }
                i17 += i13;
                path = path;
                c35645d = c35645d;
                c7 = c7;
                i15 = i15;
                f39 = f14;
                f43 = f13;
                c3 = c7;
                fArr2 = fArr2;
            }
            fArr[i16] = f39;
            fArr[1] = f43;
            fArr[2] = f29;
            fArr[3] = f34;
            fArr[4] = f37;
            fArr[5] = f38;
            c3 = c35645d.f151454a;
            i15++;
            c35645dArr2 = c35645dArr;
            i14 = i16;
        }
    }

    /* JADX INFO: renamed from: z */
    public static final byte[] m96974z(byte[] bArr) {
        if (bArr.length <= 32) {
            return AbstractC25260n.m74030F0(new byte[32 - bArr.length], bArr);
        }
        throw new IllegalStateException(("Unexpected byte array of size " + bArr.length + "; expected 32 bytes or less").toString());
    }
}

package p482s7;

import android.content.Context;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.room.C1836v0;
import c93.InterfaceC4339a;
import d30.C11514a;
import d30.C11529f;
import e30.AbstractC12605c;
import e30.C12603a;
import f20.EnumC14023b;
import gf.C15760a;
import gf.C15762c;
import gf.C15768i;
import gf.InterfaceC15761b;
import h20.C16771z;
import h20.EnumC16673i3;
import h20.InterfaceC16640d0;
import i20.C17928b;
import io.ktor.utils.p228io.core.internal.MalformedUTF8InputException;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23472r;
import l83.C23474t;
import l83.C23476v;
import l83.C23479y;
import org.json.JSONObject;
import p031b9.AbstractC2875y;
import p078d1.C11457j;
import p087db.C11856j0;
import p249jc.AbstractC21598x;
import p474s.AbstractC32004s;
import p479s4.AbstractC32121b;
import p499t9.C33623c0;
import p546v7.C35752b;
import p598wy.InterfaceC37689b;
import p613xf.AbstractC38256b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29718h0;
import q20.AbstractC29840y;
import q20.C29810c;
import q20.EnumC29820h;
import t20.C33333n;
import ug.C34913b;
import v00.AbstractC35461d0;
import v00.C35459c0;
import v00.C35463e0;
import v00.C35465f0;
import v00.C35469h0;
import v00.C35484p;
import v00.InterfaceC35457b0;
import v00.InterfaceC35471i0;
import va3.AbstractC35846d;
import va3.C35847e;
import ve.C35920e;
import x93.AbstractC38109c;
import x93.C38111d;
import y00.C38793c;
import y00.C38887l3;
import y00.C38890l6;
import y00.EnumC38828f4;
import y00.EnumC38922p2;
import y00.EnumC38941r3;
import y00.InterfaceC38802c8;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: s7.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32237a implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static EnumC38941r3 m100287a(InterfaceC35471i0 interfaceC35471i0, boolean z4, EnumC29820h customerRequestedSave) {
        AbstractC22676k.m65750j(customerRequestedSave, "customerRequestedSave");
        if (!z4) {
            if (!(interfaceC35471i0 instanceof C35469h0) && !(interfaceC35471i0 instanceof C35463e0)) {
                if (interfaceC35471i0 instanceof C35465f0) {
                    return customerRequestedSave == EnumC29820h.f121893x ? EnumC38941r3.ALWAYS : EnumC38941r3.UNSPECIFIED;
                }
                throw new NoWhenBranchMatchedException();
            }
            return EnumC38941r3.UNSPECIFIED;
        }
        if (interfaceC35471i0 instanceof C35469h0) {
            return EnumC38941r3.UNSPECIFIED;
        }
        if (interfaceC35471i0 instanceof C35463e0) {
            EnumC38941r3 enumC38941r3 = ((C35463e0) interfaceC35471i0).f151002w;
            return enumC38941r3 == null ? EnumC38941r3.LIMITED : enumC38941r3;
        }
        if (interfaceC35471i0 instanceof C35465f0) {
            return customerRequestedSave == EnumC29820h.f121893x ? EnumC38941r3.ALWAYS : EnumC38941r3.LIMITED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [gf.b] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [gf.b] */
    /* JADX WARN: Type inference failed for: r8v3, types: [gf.i] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [gf.l] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: b */
    public static C35920e m100288b(C35920e c35920e, C34913b c34913b, C15762c c15762c, int i13) {
        String accessKeyId = c35920e.f152982a;
        String secretAccessKey = c35920e.f152983b;
        String str = c35920e.f152984c;
        if ((i13 & 8) != 0) {
            c34913b = c35920e.f152985d;
        }
        C34913b c34913b2 = c34913b;
        c35920e.getClass();
        InterfaceC15761b interfaceC15761b = c35920e.f152986e;
        C15760a c15760a = AbstractC38256b.f164024a;
        String str2 = (String) interfaceC15761b.mo33082b(c15760a);
        InterfaceC15761b interfaceC15761b2 = c15762c;
        if ((i13 & 32) != 0) {
            interfaceC15761b2 = c35920e.f152986e;
        }
        AbstractC22676k.m65750j(c35920e, "<this>");
        AbstractC22676k.m65750j(accessKeyId, "accessKeyId");
        AbstractC22676k.m65750j(secretAccessKey, "secretAccessKey");
        ?? M60709w0 = interfaceC15761b2;
        M60709w0 = interfaceC15761b2;
        if (((String) c35920e.f152986e.mo33082b(c15760a)) != null && str2 == null) {
            C15762c c15762cM60709w0 = AbstractC21598x.m60709w0(interfaceC15761b2);
            c15762cM60709w0.m44476e(c15760a);
            M60709w0 = !c15762cM60709w0.f59424w.isEmpty() ? c15762cM60709w0 : 0;
        }
        if (str2 != null) {
            if (!AbstractC22676k.m65745e(M60709w0 != 0 ? (String) M60709w0.mo33082b(c15760a) : null, str2)) {
                M60709w0 = M60709w0 != 0 ? AbstractC21598x.m60709w0(M60709w0) : new C15762c();
                AbstractC21598x.m60701s0(M60709w0, c15760a, str2);
            } else if (M60709w0 == 0) {
                M60709w0 = C15768i.f59433w;
            }
        } else if (M60709w0 == 0) {
            M60709w0 = C15768i.f59433w;
        }
        return new C35920e(accessKeyId, secretAccessKey, str, c34913b2, M60709w0);
    }

    /* JADX INFO: renamed from: c */
    public static C33333n m100289c(AbstractC12605c viewModel, C35459c0 paymentMethodMetadata, String selectedPaymentMethodCode, C11514a c11514a) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        InterfaceC38802c8 interfaceC38802c8 = paymentMethodMetadata.f150996w;
        InterfaceC35471i0 interfaceC35471i0 = paymentMethodMetadata.f150976S;
        C35484p c35484p = paymentMethodMetadata.f150973P;
        boolean zM100011q = AbstractC32121b.m100011q(selectedPaymentMethodCode, interfaceC35471i0, interfaceC38802c8, c35484p != null);
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        boolean zEquals = selectedPaymentMethodCode.equals("link");
        boolean z4 = zM100011q && !zEquals;
        EnumC38922p2 enumC38922p2 = paymentMethodMetadata.f150977T;
        String str = paymentMethodMetadata.f150990g0;
        boolean z13 = viewModel.f43003G;
        boolean z14 = interfaceC38802c8 instanceof C38887l3;
        String id4 = interfaceC38802c8.getId();
        String clientSecret = interfaceC38802c8.getClientSecret();
        C17928b c17928b = viewModel.f43025w.f64402E;
        C11457j c11457j = viewModel.f43010N;
        InterfaceC16640d0 interfaceC16640d0Mo35330n = viewModel.mo35330n();
        AbstractC29840y abstractC29840yMo47218b = interfaceC16640d0Mo35330n != null ? interfaceC16640d0Mo35330n.mo47218b() : null;
        C1836v0 c1836v0 = new C1836v0(2, viewModel.f43016T, C16771z.class, "updateMandateText", "updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V", 0, 21);
        C29718h0 c29718h0 = new C29718h0(1, c11514a, C11514a.class, "handleLinkedBankAccountChanged", "handleLinkedBankAccountChanged(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V", 0, 21);
        int i13 = 0;
        int i14 = 1;
        C29718h0 c29718h1 = new C29718h0(i14, viewModel, AbstractC12605c.class, "updatePrimaryButtonState", "updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V", i13, 22);
        C29718h0 c29718h2 = new C29718h0(i14, viewModel, AbstractC12605c.class, "onError", "onError(Lcom/stripe/android/core/strings/ResolvableString;)V", i13, 23);
        C29810c c29810c = paymentMethodMetadata.f150979V;
        boolean z15 = c35484p != null ? c35484p.f151062z : false;
        EnumC14023b enumC14023b = paymentMethodMetadata.f150980W;
        boolean zIsEmpty = ((List) ((InterfaceC4339a) viewModel.f43022Z.f64022c.f104635y).invoke()).isEmpty();
        InterfaceC35457b0 interfaceC35457b0 = (InterfaceC35457b0) ((Map) AbstractC35461d0.f151001b.getValue()).get(selectedPaymentMethodCode);
        EnumC16673i3 enumC16673i3 = (EnumC16673i3) paymentMethodMetadata.f150983Z.get(interfaceC35457b0 != null ? interfaceC35457b0.getType() : null);
        if (enumC16673i3 == null) {
            enumC16673i3 = EnumC16673i3.f64121w;
        }
        return new C33333n(zEquals, c29810c, enumC38922p2, str, z4, z13, z14, id4, clientSecret, "payment_element", c17928b, abstractC29840yMo47218b, c11457j, new C11529f(viewModel, 8), c1836v0, c29718h0, new C11529f(viewModel, 9), c29718h1, c29718h2, new C12603a(viewModel, 4), z15, enumC14023b, zIsEmpty, enumC16673i3, paymentMethodMetadata.f150967J, paymentMethodMetadata.f150984a0, paymentMethodMetadata.f150987d0);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ec A[ADDED_TO_REGION, EDGE_INSN: B:101:0x01ec->B:86:0x01ec BREAK  A[LOOP:2: B:43:0x0115->B:83:0x01e2], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x01e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x016b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x010f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final int m100290d(ByteBuffer encodeUTF8, CharSequence text, int i13, int i14, int i15, int i16) {
        short s13;
        int i17;
        int i18;
        int i19;
        int i24;
        int iCharAt;
        int i25;
        int iCharAt2;
        AbstractC22676k.m65750j(encodeUTF8, "$this$encodeUTF8");
        AbstractC22676k.m65750j(text, "text");
        short s14 = 65535;
        int iMin = Math.min(i14, i13 + 65535);
        int i26 = i16;
        if (i26 > 65535) {
            i26 = 65535;
        }
        int i27 = i13;
        int i28 = i15;
        while (i28 < i26 && i27 < iMin) {
            int i29 = i27 + 1;
            char cCharAt = text.charAt(i27);
            int i34 = cCharAt & 65535;
            if ((cCharAt & 65408) != 0) {
                int i35 = i26 - 3;
                while (true) {
                    i17 = 55232;
                    int i36 = 1;
                    s13 = s14;
                    if (i35 - i28 <= 0 || i27 >= iMin) {
                        break;
                    }
                    int i37 = i27 + 1;
                    char cCharAt2 = text.charAt(i27);
                    if (Character.isHighSurrogate(cCharAt2)) {
                        if (i37 == iMin || !Character.isLowSurrogate(text.charAt(i37))) {
                            i27 = i37;
                            i25 = 63;
                        } else {
                            i27 += 2;
                            iCharAt2 = ((cCharAt2 - 55232) << 10) | (text.charAt(i37) - 56320);
                        }
                        if (i25 < 0 && i25 < 128) {
                            encodeUTF8.put(i28, (byte) i25);
                        } else if (128 > i25 && i25 < 2048) {
                            encodeUTF8.put(i28, (byte) (((i25 >> 6) & 31) | 192));
                            encodeUTF8.put(i28 + 1, (byte) ((i25 & 63) | 128));
                            i36 = 2;
                        } else if (2048 > i25 && i25 < 65536) {
                            encodeUTF8.put(i28, (byte) (((i25 >> 12) & 15) | 224));
                            encodeUTF8.put(i28 + 1, (byte) (((i25 >> 6) & 63) | 128));
                            encodeUTF8.put(i28 + 2, (byte) ((i25 & 63) | 128));
                            i36 = 3;
                        } else {
                            if (65536 <= i25 || i25 >= 1114112) {
                                m100300o(i25);
                                throw null;
                            }
                            encodeUTF8.put(i28, (byte) (((i25 >> 18) & 7) | 240));
                            encodeUTF8.put(i28 + 1, (byte) (((i25 >> 12) & 63) | 128));
                            encodeUTF8.put(i28 + 2, (byte) (((i25 >> 6) & 63) | 128));
                            encodeUTF8.put(i28 + 3, (byte) ((i25 & 63) | 128));
                            i36 = 4;
                        }
                        i28 += i36;
                        s14 = s13;
                    } else {
                        i27 = i37;
                        iCharAt2 = cCharAt2;
                    }
                    i25 = iCharAt2;
                    if (i25 < 0) {
                        if (128 > i25) {
                            if (2048 > i25) {
                                if (65536 <= i25) {
                                }
                                m100300o(i25);
                                throw null;
                            }
                            if (65536 <= i25) {
                            }
                            m100300o(i25);
                            throw null;
                        }
                        if (2048 > i25) {
                            if (65536 <= i25) {
                            }
                            m100300o(i25);
                            throw null;
                        }
                        if (65536 <= i25) {
                        }
                        m100300o(i25);
                        throw null;
                    }
                    if (128 > i25) {
                        if (2048 > i25) {
                            if (65536 <= i25) {
                            }
                            m100300o(i25);
                            throw null;
                        }
                        if (65536 <= i25) {
                        }
                        m100300o(i25);
                        throw null;
                    }
                    if (2048 > i25) {
                        if (65536 <= i25) {
                        }
                        m100300o(i25);
                        throw null;
                    }
                    if (65536 <= i25) {
                    }
                    m100300o(i25);
                    throw null;
                    i28 += i36;
                    s14 = s13;
                }
                if (i28 == i35) {
                    while (true) {
                        int i38 = i26 - i28;
                        if (i38 > 0 && i27 < iMin) {
                            int i39 = i27 + 1;
                            char cCharAt3 = text.charAt(i27);
                            if (Character.isHighSurrogate(cCharAt3)) {
                                if (i39 == iMin || !Character.isLowSurrogate(text.charAt(i39))) {
                                    i27 = i39;
                                    i18 = 63;
                                } else {
                                    i27 += 2;
                                    iCharAt = ((cCharAt3 - i17) << 10) | (text.charAt(i39) - 56320);
                                }
                                if (1 <= i18 && i18 < 128) {
                                    i19 = 1;
                                } else if (128 > i18 && i18 < 2048) {
                                    i19 = 2;
                                } else if (2048 > i18 && i18 < 65536) {
                                    i19 = 3;
                                } else {
                                    if (65536 <= i18 || i18 >= 1114112) {
                                        break;
                                    }
                                    i19 = 4;
                                }
                                if (i19 > i38) {
                                    i27--;
                                } else {
                                    if (i18 < 0 && i18 < 128) {
                                        encodeUTF8.put(i28, (byte) i18);
                                        i24 = 1;
                                    } else if (128 > i18 && i18 < 2048) {
                                        encodeUTF8.put(i28, (byte) (((i18 >> 6) & 31) | 192));
                                        encodeUTF8.put(i28 + 1, (byte) ((i18 & 63) | 128));
                                        i24 = 2;
                                    } else if (2048 > i18 && i18 < 65536) {
                                        encodeUTF8.put(i28, (byte) (((i18 >> 12) & 15) | 224));
                                        encodeUTF8.put(i28 + 1, (byte) (((i18 >> 6) & 63) | 128));
                                        encodeUTF8.put(i28 + 2, (byte) ((i18 & 63) | 128));
                                        i24 = 3;
                                    } else {
                                        if (65536 <= i18 || i18 >= 1114112) {
                                            m100300o(i18);
                                            throw null;
                                        }
                                        encodeUTF8.put(i28, (byte) (((i18 >> 18) & 7) | 240));
                                        encodeUTF8.put(i28 + 1, (byte) (((i18 >> 12) & 63) | 128));
                                        encodeUTF8.put(i28 + 2, (byte) (((i18 >> 6) & 63) | 128));
                                        encodeUTF8.put(i28 + 3, (byte) ((i18 & 63) | 128));
                                        i24 = 4;
                                    }
                                    i28 += i24;
                                    i17 = 55232;
                                }
                            } else {
                                i27 = i39;
                                iCharAt = cCharAt3;
                            }
                            i18 = iCharAt;
                            if (1 <= i18) {
                                if (128 > i18) {
                                    if (2048 > i18) {
                                        if (65536 <= i18) {
                                            break;
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (65536 <= i18) {
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (2048 > i18) {
                                    if (65536 <= i18) {
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (65536 <= i18) {
                                    break;
                                    break;
                                }
                                break;
                                break;
                            }
                            if (128 > i18) {
                                if (2048 > i18) {
                                    if (65536 <= i18) {
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (65536 <= i18) {
                                    break;
                                    break;
                                }
                                break;
                                break;
                            }
                            if (2048 > i18) {
                                if (65536 <= i18) {
                                    break;
                                    break;
                                }
                                break;
                                break;
                            }
                            if (65536 <= i18) {
                                break;
                            }
                            break;
                            break;
                            if (i19 > i38) {
                                i27--;
                            } else {
                                if (i18 < 0) {
                                    if (128 > i18) {
                                        if (2048 > i18) {
                                            if (65536 <= i18) {
                                            }
                                            m100300o(i18);
                                            throw null;
                                        }
                                        if (65536 <= i18) {
                                        }
                                        m100300o(i18);
                                        throw null;
                                    }
                                    if (2048 > i18) {
                                        if (65536 <= i18) {
                                        }
                                        m100300o(i18);
                                        throw null;
                                    }
                                    if (65536 <= i18) {
                                    }
                                    m100300o(i18);
                                    throw null;
                                }
                                if (128 > i18) {
                                    if (2048 > i18) {
                                        if (65536 <= i18) {
                                        }
                                        m100300o(i18);
                                        throw null;
                                    }
                                    if (65536 <= i18) {
                                    }
                                    m100300o(i18);
                                    throw null;
                                }
                                if (2048 > i18) {
                                    if (65536 <= i18) {
                                    }
                                    m100300o(i18);
                                    throw null;
                                }
                                if (65536 <= i18) {
                                }
                                m100300o(i18);
                                throw null;
                                i28 += i24;
                                i17 = 55232;
                            }
                        }
                    }
                    m100300o(i18);
                    throw null;
                }
                return ((((short) (i27 - i13)) & s13) << 16) | (((short) (i28 - i15)) & s13);
            }
            encodeUTF8.put(i28, (byte) i34);
            i28++;
            i27 = i29;
        }
        s13 = 65535;
        return ((((short) (i27 - i13)) & s13) << 16) | (((short) (i28 - i15)) & s13);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    /* JADX INFO: renamed from: e */
    public static final C38111d m100291e(Annotation[] annotationArr, C35847e fqName) {
        AbstractC22676k.m65750j(annotationArr, "<this>");
        AbstractC22676k.m65750j(fqName, "fqName");
        for (Annotation annotation : annotationArr) {
            if (AbstractC22676k.m65745e(AbstractC38109c.m122089a(AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation))).m113773a(), fqName)) {
                if (annotation != null) {
                    return new C38111d(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new C38111d(annotation);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final ArrayList m100292f(Annotation[] annotationArr) {
        AbstractC22676k.m65750j(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C38111d(annotation));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static C35752b m100293g(Context context, String str) {
        AbstractC22676k.m65750j(context, "context");
        if (str.length() != 0) {
            return new C35752b(context, new C11856j0(str, 16, false));
        }
        throw new IllegalArgumentException("Service package name must not be empty.");
    }

    /* JADX INFO: renamed from: h */
    public static final int m100294h(int i13) {
        return (i13 >>> 10) + 55232;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m100295i(int i13) {
        return (i13 >>> 16) == 0;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m100296j(int i13) {
        return i13 <= 1114111;
    }

    /* JADX INFO: renamed from: k */
    public static final void m100297k(String str, Throwable th3) {
        Log.e("ComposeInternal", str, th3);
    }

    /* JADX INFO: renamed from: l */
    public static final int m100298l(int i13) {
        return (i13 & 1023) + 56320;
    }

    /* JADX INFO: renamed from: n */
    public static final void m100299n(int i13) throws MalformedUTF8InputException {
        throw new MalformedUTF8InputException(AbstractC2875y.m8296i(i13, "Expected ", " more character bytes"));
    }

    /* JADX INFO: renamed from: o */
    public static final void m100300o(int i13) {
        throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Malformed code-point ", " found"));
    }

    /* JADX INFO: renamed from: p */
    public static C38890l6 m100301p(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("address");
        C38793c c38793c = jSONObjectOptJSONObject != null ? new C38793c(AbstractC32004s.m99551t("city", jSONObjectOptJSONObject), AbstractC32004s.m99551t("country", jSONObjectOptJSONObject), AbstractC32004s.m99551t("line1", jSONObjectOptJSONObject), AbstractC32004s.m99551t("line2", jSONObjectOptJSONObject), AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject), AbstractC32004s.m99551t("state", jSONObjectOptJSONObject)) : null;
        String strM99551t = AbstractC32004s.m99551t(NotificationCompat.CATEGORY_EMAIL, jSONObject);
        String strM99551t2 = AbstractC32004s.m99551t("name", jSONObject);
        String strM99551t3 = AbstractC32004s.m99551t("phone", jSONObject);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("verified_address");
        return new C38890l6(c38793c, strM99551t, strM99551t2, strM99551t3, jSONObjectOptJSONObject2 != null ? new C38793c(AbstractC32004s.m99551t("city", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("country", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("line1", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("line2", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("state", jSONObjectOptJSONObject2)) : null, AbstractC32004s.m99551t("verified_email", jSONObject), AbstractC32004s.m99551t("verified_name", jSONObject), AbstractC32004s.m99551t("verified_phone", jSONObject));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX INFO: renamed from: q */
    public static final byte m100302q(String str) {
        C23472r c23472r;
        AbstractC22676k.m65750j(str, "<this>");
        C23474t c23474tM100303r = m100303r(10, str);
        if (c23474tM100303r != null) {
            int i13 = c23474tM100303r.f92952w;
            if (Integer.compareUnsigned(i13, 255) > 0) {
                c23472r = null;
            } else {
                c23472r = new C23472r((byte) i13);
            }
        } else {
            c23472r = null;
        }
        if (c23472r != null) {
            return c23472r.f92950w;
        }
        AbstractC39421y.m125923H(str);
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public static final C23474t m100303r(int i13, String str) {
        int i14;
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC35846d.m113779c(i13);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i15 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC22676k.m65751k(cCharAt, 48) < 0) {
            i14 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i14 = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i14 < length) {
            int iDigit = Character.digit((int) str.charAt(i14), i13);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i15, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, i13);
                if (Integer.compareUnsigned(i15, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i16 = i15 * i13;
            int i17 = iDigit + i16;
            if (Integer.compareUnsigned(i17, i16) < 0) {
                return null;
            }
            i14++;
            i15 = i17;
        }
        return new C23474t(i15);
    }

    /* JADX INFO: renamed from: s */
    public static final C23476v m100304s(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC35846d.m113779c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC22676k.m65751k(cCharAt, 48) < 0) {
            i13 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j7 = 10;
        long j13 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i13 < length) {
            int iDigit = Character.digit((int) str.charAt(i13), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j13, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j7);
                if (Long.compareUnsigned(j13, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j14 = j13 * j7;
            long j15 = (((long) iDigit) & 4294967295L) + j14;
            if (Long.compareUnsigned(j15, j14) < 0) {
                return null;
            }
            i13++;
            j13 = j15;
        }
        return new C23476v(j13);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX INFO: renamed from: t */
    public static final short m100305t(String str) {
        C23479y c23479y;
        AbstractC22676k.m65750j(str, "<this>");
        C23474t c23474tM100303r = m100303r(16, str);
        if (c23474tM100303r != null) {
            int i13 = c23474tM100303r.f92952w;
            if (Integer.compareUnsigned(i13, 65535) > 0) {
                c23479y = null;
            } else {
                c23479y = new C23479y((short) i13);
            }
        } else {
            c23479y = null;
        }
        if (c23479y != null) {
            return c23479y.f92957w;
        }
        AbstractC39421y.m125923H(str);
        throw null;
    }
}

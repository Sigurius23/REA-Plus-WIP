package z21;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2549j2;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import j11.C21203f;
import java.util.Iterator;
import java.util.List;
import jp2.C21882m;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27283u0;
import ny0.AbstractC27285v0;
import ny0.EnumC27251e1;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import qz0.AbstractC30795n;
import te1.C33750a;
import wb3.AbstractC37056f;
import x81.C38070b;
import x81.C38072d;

/* JADX INFO: renamed from: z21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0091\u0001\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "level", "", "", "listOfNumbers", "initialSelection", "", "enabled", "Lny0/v0;", "buttonType", "Lkotlin/Function0;", "Li2/x;", "activeColorProvider", "", "testTagPrefix", "Lkotlin/Function1;", "Ll83/a0;", "selectedNumber", "e", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/Integer;ZLny0/v0;Lc93/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40021c {
    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:107:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:119:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x017b  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:129:0x0184  */
    /* JADX WARN: Code duplicated, block: B:132:0x0189  */
    /* JADX WARN: Code duplicated, block: B:133:0x0194  */
    /* JADX WARN: Code duplicated, block: B:135:0x0198  */
    /* JADX WARN: Code duplicated, block: B:136:0x019a  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:151:0x020e  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0252  */
    /* JADX WARN: Code duplicated, block: B:159:0x0256  */
    /* JADX WARN: Code duplicated, block: B:162:0x0263  */
    /* JADX WARN: Code duplicated, block: B:164:0x0271  */
    /* JADX WARN: Code duplicated, block: B:167:0x0279  */
    /* JADX WARN: Code duplicated, block: B:170:0x0289  */
    /* JADX WARN: Code duplicated, block: B:173:0x0297  */
    /* JADX WARN: Code duplicated, block: B:175:0x029a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0318  */
    /* JADX WARN: Code duplicated, block: B:179:0x0329  */
    /* JADX WARN: Code duplicated, block: B:181:0x0331  */
    /* JADX WARN: Code duplicated, block: B:182:0x033a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0361  */
    /* JADX WARN: Code duplicated, block: B:187:0x039d  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:191:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:193:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:199:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:204:0x043f  */
    /* JADX WARN: Code duplicated, block: B:207:0x0451  */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public static final void m128282e(Modifier modifier, TextResource textResource, TextResource textResource2, List<Integer> listOfNumbers, Integer num, boolean z4, AbstractC27285v0 abstractC27285v0, InterfaceC4339a interfaceC4339a, String str, Function1 selectedNumber, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        TextResource textResource3;
        int i16;
        TextResource textResource4;
        int i17;
        int i18;
        Integer num2;
        int i19;
        int i24;
        boolean z13;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z14;
        InterfaceC4339a interfaceC4339a2;
        String str2;
        Modifier modifier3;
        TextResource textResource5;
        TextResource textResource6;
        AbstractC27285v0 abstractC27285v1;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        int i34;
        C2314t c2314t;
        AbstractC27285v0 cVar;
        InterfaceC4339a interfaceC4339a3;
        Integer num3;
        boolean z15;
        String str3;
        TextResource textResource7;
        Object objM87133R;
        long jM125316b;
        int iHashCode;
        InterfaceC4339a interfaceC4339a4;
        C0209i c0209i;
        C0209i c0209i2;
        String str4;
        InterfaceC28601c1 interfaceC28601c1;
        int i35;
        int iHashCode2;
        C0209i c0209i3;
        ?? r10;
        boolean z16;
        C28655q c28655q2;
        C28655q c28655q3;
        int iHashCode3;
        Iterator<T> it;
        long j7;
        long j13;
        float f13;
        int i36;
        int i37;
        boolean zM87157i;
        int i38;
        AbstractC22676k.m65750j(listOfNumbers, "listOfNumbers");
        AbstractC22676k.m65750j(selectedNumber, "selectedNumber");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(1861091483);
        int i39 = i14 & 1;
        if (i39 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i44 = i14 & 2;
        if (i44 == 0) {
            if ((i13 & 48) == 0) {
                textResource3 = textResource;
                i15 |= c28655q4.m87153g(textResource3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    textResource4 = textResource2;
                    if (c28655q4.m87153g(textResource4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q4.m87157i(listOfNumbers)) {
                        i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i38;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        num2 = num;
                        if (c28655q4.m87153g(num2)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        z13 = z4;
                    } else {
                        z13 = z4;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q4.m87155h(z13)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                    }
                    if ((i13 & 1572864) == 0) {
                        if ((i14 & 64) != 0) {
                            i37 = 524288;
                        } else {
                            if ((i13 & 2097152) == 0) {
                                zM87157i = c28655q4.m87153g(abstractC27285v0);
                            } else {
                                zM87157i = c28655q4.m87157i(abstractC27285v0);
                            }
                            if (zM87157i) {
                                i37 = 1048576;
                            } else {
                                i37 = 524288;
                            }
                        }
                        i15 |= i37;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        if ((i13 & 12582912) == 0) {
                            if (c28655q4.m87157i(interfaceC4339a)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i15 |= i27;
                        }
                        i28 = i14 & 256;
                        if (i28 != 0) {
                            if ((i13 & 100663296) == 0) {
                                if (c28655q4.m87153g(str)) {
                                    i29 = 67108864;
                                } else {
                                    i29 = AndroidSDKConstants.FLAG_MUTABLE;
                                }
                                i15 |= i29;
                            }
                            if ((i13 & 805306368) == 0) {
                                if (c28655q4.m87157i(selectedNumber)) {
                                    i36 = 536870912;
                                } else {
                                    i36 = 268435456;
                                }
                                i15 |= i36;
                            }
                            if ((i15 & 306783379) != 306783378) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (c28655q4.m87135U(i15 & 1, z14)) {
                                c28655q4.m87140Z();
                                i34 = i13 & 1;
                                c2314t = C2314t.f9131w;
                                if (i34 != 0 || c28655q4.m87118C()) {
                                    if (i39 != 0) {
                                        modifier2 = c2314t;
                                    }
                                    if (i44 != 0) {
                                        textResource3 = null;
                                    }
                                    if (i16 != 0) {
                                        textResource4 = null;
                                    }
                                    if (i18 != 0) {
                                        num2 = null;
                                    }
                                    if (i24 != 0) {
                                        z13 = true;
                                    }
                                    if ((i14 & 64) != 0) {
                                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                        i15 &= -3670017;
                                    } else {
                                        cVar = abstractC27285v0;
                                    }
                                    if (i26 != 0) {
                                        interfaceC4339a3 = null;
                                    } else {
                                        interfaceC4339a3 = interfaceC4339a;
                                    }
                                    num3 = num2;
                                    z15 = z13;
                                    if (i28 != 0) {
                                        str3 = null;
                                    } else {
                                        str3 = str;
                                    }
                                    textResource7 = textResource3;
                                } else {
                                    c28655q4.m87138X();
                                    if ((i14 & 64) != 0) {
                                        i15 &= -3670017;
                                    }
                                    cVar = abstractC27285v0;
                                    interfaceC4339a3 = interfaceC4339a;
                                    num3 = num2;
                                    z15 = z13;
                                    modifier2 = modifier2;
                                    textResource7 = textResource3;
                                    textResource4 = textResource4;
                                    str3 = str;
                                }
                                c28655q4.m87175r();
                                objM87133R = c28655q4.m87133R();
                                if (objM87133R == C28635l.f115821a) {
                                    objM87133R = AbstractC28683x.m87272z(num3);
                                    c28655q4.m87172p0(objM87133R);
                                }
                                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
                                jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                                iHashCode = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifier2);
                                InterfaceC0221l.f734a.getClass();
                                Modifier modifier4 = modifier2;
                                interfaceC4339a4 = C0217k.f724b;
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                C0209i c0209i4 = C0217k.f729g;
                                AbstractC28683x.m87239G(c28655q4, c0209i4, c23010xM66775a);
                                c0209i = C0217k.f728f;
                                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m);
                                c0209i2 = C0217k.f732j;
                                if (c28655q4.f115903S) {
                                    str4 = str3;
                                } else {
                                    str4 = str3;
                                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                    }
                                    C0209i c0209i5 = C0217k.f726d;
                                    AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N);
                                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                                    interfaceC28601c1 = interfaceC28601c2;
                                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                                    i35 = i15;
                                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                                    c28655q4.m87158i0();
                                    if (c28655q4.f115903S) {
                                        c28655q4.m87163l(interfaceC4339a4);
                                    } else {
                                        c28655q4.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q4, c0209i4, c22994r1M66759a);
                                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m2);
                                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                    }
                                    AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N2);
                                    if (textResource7 != null) {
                                        c28655q4.m87150e0(59283326);
                                        if (1.0f <= 0.0d) {
                                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                        }
                                        if (1.0f > Float.MAX_VALUE) {
                                            f13 = Float.MAX_VALUE;
                                        } else {
                                            f13 = 1.0f;
                                        }
                                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                                        String strM21274h = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                        C38072d c38072d = C38072d.f163053a;
                                        c0209i3 = c0209i;
                                        r10 = 1;
                                        z16 = false;
                                        AbstractC30795n.m94707h(strM21274h, layoutWeightElement, c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                        C28655q c28655q5 = c28655q4;
                                        c28655q5.m87173q(false);
                                        c28655q2 = c28655q5;
                                    } else {
                                        c0209i3 = c0209i;
                                        r10 = 1;
                                        z16 = false;
                                        c28655q4.m87150e0(59526893);
                                        c28655q4.m87173q(false);
                                    }
                                    if (textResource4 != null) {
                                        c28655q2 = c28655q4;
                                        c28655q2.m87150e0(59572742);
                                        if (interfaceC4339a3 != null) {
                                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                        } else {
                                            j13 = jM125316b;
                                        }
                                        C28655q c28655q6 = c28655q2;
                                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q6, 24576, 13);
                                        C28655q c28655q7 = c28655q6;
                                        c28655q7.m87173q(z16);
                                        c28655q3 = c28655q7;
                                    } else {
                                        c28655q2 = c28655q4;
                                        c28655q2.m87150e0(60009997);
                                        c28655q2.m87173q(z16);
                                        c28655q3 = c28655q2;
                                    }
                                    c28655q3.m87173q(r10);
                                    float f14 = 2 * 4;
                                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, r10);
                                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q3, 6);
                                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
                                    c28655q3.m87158i0();
                                    if (c28655q3.f115903S) {
                                        c28655q3.m87163l(interfaceC4339a4);
                                    } else {
                                        c28655q3.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q3, c0209i4, c22994r1M66759a2);
                                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m3);
                                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                    }
                                    AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N3);
                                    c28655q3.m87150e0(-177024899);
                                    it = listOfNumbers.iterator();
                                    while (it.hasNext()) {
                                        int iIntValue = ((Number) it.next()).intValue();
                                        if (interfaceC4339a3 != null) {
                                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                        } else {
                                            j7 = jM125316b;
                                        }
                                        TextResource textResource8 = textResource4;
                                        String str5 = str4;
                                        InterfaceC28601c1 interfaceC28601c3 = interfaceC28601c1;
                                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str5, iIntValue, interfaceC28601c3, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                        textResource4 = textResource8;
                                        z16 = z16;
                                        z15 = z15;
                                        cVar = cVar;
                                        str4 = str5;
                                        interfaceC28601c1 = interfaceC28601c3;
                                    }
                                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                                    textResource5 = textResource7;
                                    textResource6 = textResource4;
                                    z13 = z15;
                                    abstractC27285v1 = cVar;
                                    str2 = str4;
                                    num2 = num3;
                                    interfaceC4339a2 = interfaceC4339a3;
                                    modifier3 = modifier4;
                                    c28655q = c28655q3;
                                }
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                                C0209i c0209i6 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q4, c0209i6, modifierM118962N);
                                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                                interfaceC28601c1 = interfaceC28601c2;
                                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                                i35 = i15;
                                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3409f2);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i4, c22994r1M66759a3);
                                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m4);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i6, modifierM118962N4);
                                if (textResource7 != null) {
                                    c28655q4.m87150e0(59283326);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f13 = Float.MAX_VALUE;
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f13, true);
                                    String strM21274h2 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                    C38072d c38072d2 = C38072d.f163053a;
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    AbstractC30795n.m94707h(strM21274h2, layoutWeightElement2, c38072d2.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                    C28655q c28655q8 = c28655q4;
                                    c28655q8.m87173q(false);
                                    c28655q2 = c28655q8;
                                } else {
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    c28655q4.m87150e0(59526893);
                                    c28655q4.m87173q(false);
                                }
                                if (textResource4 != null) {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(59572742);
                                    if (interfaceC4339a3 != null) {
                                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j13 = jM125316b;
                                    }
                                    C28655q c28655q9 = c28655q2;
                                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q9, 24576, 13);
                                    C28655q c28655q10 = c28655q9;
                                    c28655q10.m87173q(z16);
                                    c28655q3 = c28655q10;
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(60009997);
                                    c28655q2.m87173q(z16);
                                    c28655q3 = c28655q2;
                                }
                                c28655q3.m87173q(r10);
                                float f15 = 2 * 4;
                                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f15, r10);
                                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9107J, c28655q3, 6);
                                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3396r2);
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i4, c22994r1M66759a4);
                                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m5);
                                if (c28655q3.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N5);
                                c28655q3.m87150e0(-177024899);
                                it = listOfNumbers.iterator();
                                while (it.hasNext()) {
                                    int iIntValue2 = ((Number) it.next()).intValue();
                                    if (interfaceC4339a3 != null) {
                                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j7 = jM125316b;
                                    }
                                    TextResource textResource9 = textResource4;
                                    String str6 = str4;
                                    InterfaceC28601c1 interfaceC28601c4 = interfaceC28601c1;
                                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str6, iIntValue2, interfaceC28601c4, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                    textResource4 = textResource9;
                                    z16 = z16;
                                    z15 = z15;
                                    cVar = cVar;
                                    str4 = str6;
                                    interfaceC28601c1 = interfaceC28601c4;
                                }
                                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                                textResource5 = textResource7;
                                textResource6 = textResource4;
                                z13 = z15;
                                abstractC27285v1 = cVar;
                                str2 = str4;
                                num2 = num3;
                                interfaceC4339a2 = interfaceC4339a3;
                                modifier3 = modifier4;
                                c28655q = c28655q3;
                            } else {
                                c28655q4.m87138X();
                                interfaceC4339a2 = interfaceC4339a;
                                str2 = str;
                                modifier3 = modifier2;
                                textResource5 = textResource3;
                                textResource6 = textResource4;
                                abstractC27285v1 = abstractC27285v0;
                                c28655q = c28655q4;
                            }
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                            }
                        }
                        i15 |= 100663296;
                        if ((i13 & 805306368) == 0) {
                            if (c28655q4.m87157i(selectedNumber)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i15 |= i36;
                        }
                        if ((i15 & 306783379) != 306783378) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q4.m87135U(i15 & 1, z14)) {
                            c28655q4.m87140Z();
                            i34 = i13 & 1;
                            c2314t = C2314t.f9131w;
                            if (i34 != 0) {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            }
                            c28655q4.m87175r();
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = AbstractC28683x.m87272z(num3);
                                c28655q4.m87172p0(objM87133R);
                            }
                            InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R;
                            jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier5 = modifier2;
                            interfaceC4339a4 = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            C0209i c0209i7 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q4, c0209i7, c23010xM66775a2);
                            c0209i = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m6);
                            c0209i2 = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                str4 = str3;
                                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i8 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q4, c0209i8, modifierM118962N6);
                                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                                interfaceC28601c1 = interfaceC28601c5;
                                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                                i35 = i15;
                                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3409f3);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i7, c22994r1M66759a5);
                                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m7);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i8, modifierM118962N7);
                                if (textResource7 != null) {
                                    c28655q4.m87150e0(59283326);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f13 = Float.MAX_VALUE;
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f13, true);
                                    String strM21274h3 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                    C38072d c38072d3 = C38072d.f163053a;
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    AbstractC30795n.m94707h(strM21274h3, layoutWeightElement3, c38072d3.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                    C28655q c28655q11 = c28655q4;
                                    c28655q11.m87173q(false);
                                    c28655q2 = c28655q11;
                                } else {
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    c28655q4.m87150e0(59526893);
                                    c28655q4.m87173q(false);
                                }
                                if (textResource4 != null) {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(59572742);
                                    if (interfaceC4339a3 != null) {
                                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j13 = jM125316b;
                                    }
                                    C28655q c28655q12 = c28655q2;
                                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q12, 24576, 13);
                                    C28655q c28655q13 = c28655q12;
                                    c28655q13.m87173q(z16);
                                    c28655q3 = c28655q13;
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(60009997);
                                    c28655q2.m87173q(z16);
                                    c28655q3 = c28655q2;
                                }
                                c28655q3.m87173q(r10);
                                float f16 = 2 * 4;
                                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f16, r10);
                                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16), C2299e.f9107J, c28655q3, 6);
                                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3396r3);
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i7, c22994r1M66759a6);
                                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m8);
                                if (c28655q3.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N8);
                                c28655q3.m87150e0(-177024899);
                                it = listOfNumbers.iterator();
                                while (it.hasNext()) {
                                    int iIntValue3 = ((Number) it.next()).intValue();
                                    if (interfaceC4339a3 != null) {
                                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j7 = jM125316b;
                                    }
                                    TextResource textResource10 = textResource4;
                                    String str7 = str4;
                                    InterfaceC28601c1 interfaceC28601c6 = interfaceC28601c1;
                                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str7, iIntValue3, interfaceC28601c6, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                    textResource4 = textResource10;
                                    z16 = z16;
                                    z15 = z15;
                                    cVar = cVar;
                                    str4 = str7;
                                    interfaceC28601c1 = interfaceC28601c6;
                                }
                                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                                textResource5 = textResource7;
                                textResource6 = textResource4;
                                z13 = z15;
                                abstractC27285v1 = cVar;
                                str2 = str4;
                                num2 = num3;
                                interfaceC4339a2 = interfaceC4339a3;
                                modifier3 = modifier5;
                                c28655q = c28655q3;
                            } else {
                                str4 = str3;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                            C0209i c0209i9 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i9, modifierM118962N6);
                            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c5;
                            C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierM3409f4);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i7, c22994r1M66759a7);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m9);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i9, modifierM118962N9);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f13, true);
                                String strM21274h4 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d4 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h4, layoutWeightElement4, c38072d4.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q14 = c28655q4;
                                c28655q14.m87173q(false);
                                c28655q2 = c28655q14;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q15 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q15, 24576, 13);
                                C28655q c28655q16 = c28655q15;
                                c28655q16.m87173q(z16);
                                c28655q3 = c28655q16;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f17 = 2 * 4;
                            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f17, r10);
                            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f17), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierM3396r4);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i7, c22994r1M66759a8);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m10);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N10);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue4 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource11 = textResource4;
                                String str8 = str4;
                                InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str8, iIntValue4, interfaceC28601c7, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource11;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str8;
                                interfaceC28601c1 = interfaceC28601c7;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier5;
                            c28655q = c28655q3;
                        } else {
                            c28655q4.m87138X();
                            interfaceC4339a2 = interfaceC4339a;
                            str2 = str;
                            modifier3 = modifier2;
                            textResource5 = textResource3;
                            textResource6 = textResource4;
                            abstractC27285v1 = abstractC27285v0;
                            c28655q = c28655q4;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                        }
                    }
                    i15 |= 12582912;
                    i28 = i14 & 256;
                    if (i28 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q4.m87153g(str)) {
                                i29 = 67108864;
                            } else {
                                i29 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i29;
                        }
                        if ((i13 & 805306368) == 0) {
                            if (c28655q4.m87157i(selectedNumber)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i15 |= i36;
                        }
                        if ((i15 & 306783379) != 306783378) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q4.m87135U(i15 & 1, z14)) {
                            c28655q4.m87140Z();
                            i34 = i13 & 1;
                            c2314t = C2314t.f9131w;
                            if (i34 != 0) {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            }
                            c28655q4.m87175r();
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = AbstractC28683x.m87272z(num3);
                                c28655q4.m87172p0(objM87133R);
                            }
                            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R;
                            jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier6 = modifier2;
                            interfaceC4339a4 = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            C0209i c0209i10 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q4, c0209i10, c23010xM66775a3);
                            c0209i = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11);
                            c0209i2 = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                str4 = str3;
                                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i11 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q4, c0209i11, modifierM118962N11);
                                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                                interfaceC28601c1 = interfaceC28601c8;
                                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                                i35 = i15;
                                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierM3409f5);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i10, c22994r1M66759a9);
                                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m12);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i11, modifierM118962N12);
                                if (textResource7 != null) {
                                    c28655q4.m87150e0(59283326);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f13 = Float.MAX_VALUE;
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(f13, true);
                                    String strM21274h5 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                    C38072d c38072d5 = C38072d.f163053a;
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    AbstractC30795n.m94707h(strM21274h5, layoutWeightElement5, c38072d5.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                    C28655q c28655q17 = c28655q4;
                                    c28655q17.m87173q(false);
                                    c28655q2 = c28655q17;
                                } else {
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    c28655q4.m87150e0(59526893);
                                    c28655q4.m87173q(false);
                                }
                                if (textResource4 != null) {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(59572742);
                                    if (interfaceC4339a3 != null) {
                                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j13 = jM125316b;
                                    }
                                    C28655q c28655q18 = c28655q2;
                                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q18, 24576, 13);
                                    C28655q c28655q19 = c28655q18;
                                    c28655q19.m87173q(z16);
                                    c28655q3 = c28655q19;
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(60009997);
                                    c28655q2.m87173q(z16);
                                    c28655q3 = c28655q2;
                                }
                                c28655q3.m87173q(r10);
                                float f18 = 2 * 4;
                                Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f18, r10);
                                C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f18), C2299e.f9107J, c28655q3, 6);
                                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
                                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM3396r5);
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i10, c22994r1M66759a10);
                                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m13);
                                if (c28655q3.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i11, modifierM118962N13);
                                c28655q3.m87150e0(-177024899);
                                it = listOfNumbers.iterator();
                                while (it.hasNext()) {
                                    int iIntValue5 = ((Number) it.next()).intValue();
                                    if (interfaceC4339a3 != null) {
                                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j7 = jM125316b;
                                    }
                                    TextResource textResource12 = textResource4;
                                    String str9 = str4;
                                    InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c1;
                                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str9, iIntValue5, interfaceC28601c9, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                    textResource4 = textResource12;
                                    z16 = z16;
                                    z15 = z15;
                                    cVar = cVar;
                                    str4 = str9;
                                    interfaceC28601c1 = interfaceC28601c9;
                                }
                                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                                textResource5 = textResource7;
                                textResource6 = textResource4;
                                z13 = z15;
                                abstractC27285v1 = cVar;
                                str2 = str4;
                                num2 = num3;
                                interfaceC4339a2 = interfaceC4339a3;
                                modifier3 = modifier6;
                                c28655q = c28655q3;
                            } else {
                                str4 = str3;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                            C0209i c0209i12 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i12, modifierM118962N11);
                            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c8;
                            C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierM3409f6);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i10, c22994r1M66759a11);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m14);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i12, modifierM118962N14);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(f13, true);
                                String strM21274h6 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d6 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h6, layoutWeightElement6, c38072d6.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q110 = c28655q4;
                                c28655q110.m87173q(false);
                                c28655q2 = c28655q110;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q111 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111, 24576, 13);
                                C28655q c28655q112 = c28655q111;
                                c28655q112.m87173q(z16);
                                c28655q3 = c28655q112;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f19 = 2 * 4;
                            Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f19, r10);
                            C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f19), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, modifierM3396r6);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i10, c22994r1M66759a12);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m15);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N15);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue6 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource13 = textResource4;
                                String str10 = str4;
                                InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str10, iIntValue6, interfaceC28601c10, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource13;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str10;
                                interfaceC28601c1 = interfaceC28601c10;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier6;
                            c28655q = c28655q3;
                        } else {
                            c28655q4.m87138X();
                            interfaceC4339a2 = interfaceC4339a;
                            str2 = str;
                            modifier3 = modifier2;
                            textResource5 = textResource3;
                            textResource6 = textResource4;
                            abstractC27285v1 = abstractC27285v0;
                            c28655q = c28655q4;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                        }
                    }
                    i15 |= 100663296;
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier7 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i13, c23010xM66775a4);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m16);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i14 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i14, modifierM118962N16);
                            Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c11;
                            C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q4.m87165m();
                            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q4, modifierM3409f7);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i13, c22994r1M66759a13);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m17);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i14, modifierM118962N17);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(f13, true);
                                String strM21274h7 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d7 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h7, layoutWeightElement7, c38072d7.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q113 = c28655q4;
                                c28655q113.m87173q(false);
                                c28655q2 = c28655q113;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q114 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q114, 24576, 13);
                                C28655q c28655q115 = c28655q114;
                                c28655q115.m87173q(z16);
                                c28655q3 = c28655q115;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f110 = 2 * 4;
                            Modifier modifierM3396r7 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f110, r10);
                            C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f110), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q3.m87165m();
                            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q3, modifierM3396r7);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i13, c22994r1M66759a14);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m18);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i14, modifierM118962N18);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue7 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource14 = textResource4;
                                String str11 = str4;
                                InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11, iIntValue7, interfaceC28601c12, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource14;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str11;
                                interfaceC28601c1 = interfaceC28601c12;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier7;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i15 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i15, modifierM118962N16);
                        Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c11;
                        C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q4.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q4, modifierM3409f8);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i13, c22994r1M66759a15);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m19);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i15, modifierM118962N19);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(f13, true);
                            String strM21274h8 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d8 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h8, layoutWeightElement8, c38072d8.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q116 = c28655q4;
                            c28655q116.m87173q(false);
                            c28655q2 = c28655q116;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q117 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q117, 24576, 13);
                            C28655q c28655q118 = c28655q117;
                            c28655q118.m87173q(z16);
                            c28655q3 = c28655q118;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f111 = 2 * 4;
                        Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111, r10);
                        C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q3.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r8);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i13, c22994r1M66759a16);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m110);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i15, modifierM118962N110);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue8 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource15 = textResource4;
                            String str12 = str4;
                            InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str12, iIntValue8, interfaceC28601c13, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource15;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str12;
                            interfaceC28601c1 = interfaceC28601c13;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier7;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 24576;
                num2 = num;
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    z13 = z4;
                } else {
                    z13 = z4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q4.m87155h(z13)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 1572864) == 0) {
                    if ((i14 & 64) != 0) {
                        i37 = 524288;
                    } else {
                        if ((i13 & 2097152) == 0) {
                            zM87157i = c28655q4.m87153g(abstractC27285v0);
                        } else {
                            zM87157i = c28655q4.m87157i(abstractC27285v0);
                        }
                        if (zM87157i) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                    }
                    i15 |= i37;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q4.m87157i(interfaceC4339a)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 256;
                    if (i28 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q4.m87153g(str)) {
                                i29 = 67108864;
                            } else {
                                i29 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i29;
                        }
                        if ((i13 & 805306368) == 0) {
                            if (c28655q4.m87157i(selectedNumber)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i15 |= i36;
                        }
                        if ((i15 & 306783379) != 306783378) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q4.m87135U(i15 & 1, z14)) {
                            c28655q4.m87140Z();
                            i34 = i13 & 1;
                            c2314t = C2314t.f9131w;
                            if (i34 != 0) {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            }
                            c28655q4.m87175r();
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = AbstractC28683x.m87272z(num3);
                                c28655q4.m87172p0(objM87133R);
                            }
                            InterfaceC28601c1 interfaceC28601c14 = (InterfaceC28601c1) objM87133R;
                            jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q4.m87165m();
                            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier8 = modifier2;
                            interfaceC4339a4 = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            C0209i c0209i16 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q4, c0209i16, c23010xM66775a5);
                            c0209i = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111);
                            c0209i2 = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                str4 = str3;
                                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i17 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q4, c0209i17, modifierM118962N111);
                                Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                                interfaceC28601c1 = interfaceC28601c14;
                                C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                                i35 = i15;
                                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q4.m87165m();
                                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f9);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i16, c22994r1M66759a17);
                                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m112);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i17, modifierM118962N112);
                                if (textResource7 != null) {
                                    c28655q4.m87150e0(59283326);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f13 = Float.MAX_VALUE;
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(f13, true);
                                    String strM21274h9 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                    C38072d c38072d9 = C38072d.f163053a;
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    AbstractC30795n.m94707h(strM21274h9, layoutWeightElement9, c38072d9.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                    C28655q c28655q119 = c28655q4;
                                    c28655q119.m87173q(false);
                                    c28655q2 = c28655q119;
                                } else {
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    c28655q4.m87150e0(59526893);
                                    c28655q4.m87173q(false);
                                }
                                if (textResource4 != null) {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(59572742);
                                    if (interfaceC4339a3 != null) {
                                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j13 = jM125316b;
                                    }
                                    C28655q c28655q1110 = c28655q2;
                                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1110, 24576, 13);
                                    C28655q c28655q1111 = c28655q1110;
                                    c28655q1111.m87173q(z16);
                                    c28655q3 = c28655q1111;
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(60009997);
                                    c28655q2.m87173q(z16);
                                    c28655q3 = c28655q2;
                                }
                                c28655q3.m87173q(r10);
                                float f112 = 2 * 4;
                                Modifier modifierM3396r9 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f112, r10);
                                C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f112), C2299e.f9107J, c28655q3, 6);
                                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q3.m87165m();
                                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r9);
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i16, c22994r1M66759a18);
                                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m113);
                                if (c28655q3.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i17, modifierM118962N113);
                                c28655q3.m87150e0(-177024899);
                                it = listOfNumbers.iterator();
                                while (it.hasNext()) {
                                    int iIntValue9 = ((Number) it.next()).intValue();
                                    if (interfaceC4339a3 != null) {
                                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j7 = jM125316b;
                                    }
                                    TextResource textResource16 = textResource4;
                                    String str13 = str4;
                                    InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c1;
                                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str13, iIntValue9, interfaceC28601c15, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                    textResource4 = textResource16;
                                    z16 = z16;
                                    z15 = z15;
                                    cVar = cVar;
                                    str4 = str13;
                                    interfaceC28601c1 = interfaceC28601c15;
                                }
                                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                                textResource5 = textResource7;
                                textResource6 = textResource4;
                                z13 = z15;
                                abstractC27285v1 = cVar;
                                str2 = str4;
                                num2 = num3;
                                interfaceC4339a2 = interfaceC4339a3;
                                modifier3 = modifier8;
                                c28655q = c28655q3;
                            } else {
                                str4 = str3;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                            C0209i c0209i18 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i18, modifierM118962N111);
                            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c14;
                            C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q4.m87165m();
                            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f10);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i16, c22994r1M66759a19);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m114);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i18, modifierM118962N114);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(f13, true);
                                String strM21274h10 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d10 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h10, layoutWeightElement10, c38072d10.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d10.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q1112 = c28655q4;
                                c28655q1112.m87173q(false);
                                c28655q2 = c28655q1112;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q1113 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1113, 24576, 13);
                                C28655q c28655q1114 = c28655q1113;
                                c28655q1114.m87173q(z16);
                                c28655q3 = c28655q1114;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f113 = 2 * 4;
                            Modifier modifierM3396r10 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f113, r10);
                            C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f113), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q3.m87165m();
                            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r10);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i16, c22994r1M66759a110);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m115);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i18, modifierM118962N115);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue10 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource17 = textResource4;
                                String str14 = str4;
                                InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str14, iIntValue10, interfaceC28601c16, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource17;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str14;
                                interfaceC28601c1 = interfaceC28601c16;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier8;
                            c28655q = c28655q3;
                        } else {
                            c28655q4.m87138X();
                            interfaceC4339a2 = interfaceC4339a;
                            str2 = str;
                            modifier3 = modifier2;
                            textResource5 = textResource3;
                            textResource6 = textResource4;
                            abstractC27285v1 = abstractC27285v0;
                            c28655q = c28655q4;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                        }
                    }
                    i15 |= 100663296;
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c17 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q4.m87165m();
                        Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier9 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i19 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i19, c23010xM66775a6);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m116);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i110 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i110, modifierM118962N116);
                            Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c17;
                            C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q4.m87165m();
                            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i19, c22994r1M66759a111);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m117);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i110, modifierM118962N117);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(f13, true);
                                String strM21274h11 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d11 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h11, layoutWeightElement11, c38072d11.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q1115 = c28655q4;
                                c28655q1115.m87173q(false);
                                c28655q2 = c28655q1115;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q1116 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1116, 24576, 13);
                                C28655q c28655q1117 = c28655q1116;
                                c28655q1117.m87173q(z16);
                                c28655q3 = c28655q1117;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f114 = 2 * 4;
                            Modifier modifierM3396r11 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f114, r10);
                            C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f114), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q3.m87165m();
                            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i19, c22994r1M66759a112);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m118);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i110, modifierM118962N118);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue11 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource18 = textResource4;
                                String str15 = str4;
                                InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str15, iIntValue11, interfaceC28601c18, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource18;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str15;
                                interfaceC28601c1 = interfaceC28601c18;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier9;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i111, modifierM118962N116);
                        Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c17;
                        C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q4.m87165m();
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f12);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i19, c22994r1M66759a113);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m119);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i111, modifierM118962N119);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(f13, true);
                            String strM21274h12 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d12 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h12, layoutWeightElement12, c38072d12.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d12.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q1118 = c28655q4;
                            c28655q1118.m87173q(false);
                            c28655q2 = c28655q1118;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q1119 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1119, 24576, 13);
                            C28655q c28655q11110 = c28655q1119;
                            c28655q11110.m87173q(z16);
                            c28655q3 = c28655q11110;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f115 = 2 * 4;
                        Modifier modifierM3396r12 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f115, r10);
                        C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f115), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q3.m87165m();
                        Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r12);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i19, c22994r1M66759a114);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1110);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111, modifierM118962N1110);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue12 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource19 = textResource4;
                            String str16 = str4;
                            InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str16, iIntValue12, interfaceC28601c19, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource19;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str16;
                            interfaceC28601c1 = interfaceC28601c19;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier9;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 12582912;
                i28 = i14 & 256;
                if (i28 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q4.m87153g(str)) {
                            i29 = 67108864;
                        } else {
                            i29 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i29;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c110 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q4.m87165m();
                        Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier10 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i112 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i112, c23010xM66775a7);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i113 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i113, modifierM118962N1111);
                            Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c110;
                            C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q4.m87165m();
                            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f13);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i112, c22994r1M66759a115);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1112);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i113, modifierM118962N1112);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(f13, true);
                                String strM21274h13 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d13 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h13, layoutWeightElement13, c38072d13.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d13.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q11111 = c28655q4;
                                c28655q11111.m87173q(false);
                                c28655q2 = c28655q11111;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q11112 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11112, 24576, 13);
                                C28655q c28655q11113 = c28655q11112;
                                c28655q11113.m87173q(z16);
                                c28655q3 = c28655q11113;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f116 = 2 * 4;
                            Modifier modifierM3396r13 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f116, r10);
                            C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f116), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q3.m87165m();
                            Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r13);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i112, c22994r1M66759a116);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1113);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i113, modifierM118962N1113);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue13 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource110 = textResource4;
                                String str17 = str4;
                                InterfaceC28601c1 interfaceC28601c111 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str17, iIntValue13, interfaceC28601c111, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource110;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str17;
                                interfaceC28601c1 = interfaceC28601c111;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier10;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i114, modifierM118962N1111);
                        Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c110;
                        C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q4.m87165m();
                        Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f14);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i112, c22994r1M66759a117);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1114);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i114, modifierM118962N1114);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(f13, true);
                            String strM21274h14 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d14 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h14, layoutWeightElement14, c38072d14.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d14.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q11114 = c28655q4;
                            c28655q11114.m87173q(false);
                            c28655q2 = c28655q11114;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q11115 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11115, 24576, 13);
                            C28655q c28655q11116 = c28655q11115;
                            c28655q11116.m87173q(z16);
                            c28655q3 = c28655q11116;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f117 = 2 * 4;
                        Modifier modifierM3396r14 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f117, r10);
                        C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f117), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q3.m87165m();
                        Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r14);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i112, c22994r1M66759a118);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1115);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i114, modifierM118962N1115);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue14 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource111 = textResource4;
                            String str18 = str4;
                            InterfaceC28601c1 interfaceC28601c112 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str18, iIntValue14, interfaceC28601c112, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource111;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str18;
                            interfaceC28601c1 = interfaceC28601c112;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier10;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c113 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q4.m87165m();
                    Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier11 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i115 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i115, c23010xM66775a8);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1116);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i116 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i116, modifierM118962N1116);
                        Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c113;
                        C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q4.m87165m();
                        Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f15);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i115, c22994r1M66759a119);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1117);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i116, modifierM118962N1117);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement15 = new LayoutWeightElement(f13, true);
                            String strM21274h15 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d15 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h15, layoutWeightElement15, c38072d15.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d15.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q11117 = c28655q4;
                            c28655q11117.m87173q(false);
                            c28655q2 = c28655q11117;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q11118 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11118, 24576, 13);
                            C28655q c28655q11119 = c28655q11118;
                            c28655q11119.m87173q(z16);
                            c28655q3 = c28655q11119;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f118 = 2 * 4;
                        Modifier modifierM3396r15 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f118, r10);
                        C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f118), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q3.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r15);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i115, c22994r1M66759a1110);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1118);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i116, modifierM118962N1118);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue15 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource112 = textResource4;
                            String str19 = str4;
                            InterfaceC28601c1 interfaceC28601c114 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str19, iIntValue15, interfaceC28601c114, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource112;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str19;
                            interfaceC28601c1 = interfaceC28601c114;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier11;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i117 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i117, modifierM118962N1116);
                    Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c113;
                    C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q4.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f16);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i115, c22994r1M66759a1111);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1119);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i117, modifierM118962N1119);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement16 = new LayoutWeightElement(f13, true);
                        String strM21274h16 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d16 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h16, layoutWeightElement16, c38072d16.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d16.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q111110 = c28655q4;
                        c28655q111110.m87173q(false);
                        c28655q2 = c28655q111110;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q111111 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111, 24576, 13);
                        C28655q c28655q111112 = c28655q111111;
                        c28655q111112.m87173q(z16);
                        c28655q3 = c28655q111112;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f119 = 2 * 4;
                    Modifier modifierM3396r16 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f119, r10);
                    C22994r1 c22994r1M66759a1112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f119), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q3.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r16);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i115, c22994r1M66759a1112);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i117, modifierM118962N11110);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue16 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource113 = textResource4;
                        String str110 = str4;
                        InterfaceC28601c1 interfaceC28601c115 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str110, iIntValue16, interfaceC28601c115, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource113;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str110;
                        interfaceC28601c1 = interfaceC28601c115;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier11;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 384;
            textResource4 = textResource2;
            if ((i13 & 3072) == 0) {
                if (c28655q4.m87157i(listOfNumbers)) {
                    i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i38;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    num2 = num;
                    if (c28655q4.m87153g(num2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    z13 = z4;
                } else {
                    z13 = z4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q4.m87155h(z13)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 1572864) == 0) {
                    if ((i14 & 64) != 0) {
                        i37 = 524288;
                    } else {
                        if ((i13 & 2097152) == 0) {
                            zM87157i = c28655q4.m87153g(abstractC27285v0);
                        } else {
                            zM87157i = c28655q4.m87157i(abstractC27285v0);
                        }
                        if (zM87157i) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                    }
                    i15 |= i37;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q4.m87157i(interfaceC4339a)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 256;
                    if (i28 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q4.m87153g(str)) {
                                i29 = 67108864;
                            } else {
                                i29 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i29;
                        }
                        if ((i13 & 805306368) == 0) {
                            if (c28655q4.m87157i(selectedNumber)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i15 |= i36;
                        }
                        if ((i15 & 306783379) != 306783378) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q4.m87135U(i15 & 1, z14)) {
                            c28655q4.m87140Z();
                            i34 = i13 & 1;
                            c2314t = C2314t.f9131w;
                            if (i34 != 0) {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            }
                            c28655q4.m87175r();
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = AbstractC28683x.m87272z(num3);
                                c28655q4.m87172p0(objM87133R);
                            }
                            InterfaceC28601c1 interfaceC28601c116 = (InterfaceC28601c1) objM87133R;
                            jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q4.m87165m();
                            Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier12 = modifier2;
                            interfaceC4339a4 = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            C0209i c0209i118 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q4, c0209i118, c23010xM66775a9);
                            c0209i = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111);
                            c0209i2 = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                str4 = str3;
                                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i119 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q4, c0209i119, modifierM118962N11111);
                                Modifier modifierM3409f17 = AbstractC1102d.m3409f(1.0f, c2314t);
                                interfaceC28601c1 = interfaceC28601c116;
                                C22994r1 c22994r1M66759a1113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                                i35 = i15;
                                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q4.m87165m();
                                Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f17);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i118, c22994r1M66759a1113);
                                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11112);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i119, modifierM118962N11112);
                                if (textResource7 != null) {
                                    c28655q4.m87150e0(59283326);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f13 = Float.MAX_VALUE;
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    LayoutWeightElement layoutWeightElement17 = new LayoutWeightElement(f13, true);
                                    String strM21274h17 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                    C38072d c38072d17 = C38072d.f163053a;
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    AbstractC30795n.m94707h(strM21274h17, layoutWeightElement17, c38072d17.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d17.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                    C28655q c28655q111113 = c28655q4;
                                    c28655q111113.m87173q(false);
                                    c28655q2 = c28655q111113;
                                } else {
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    c28655q4.m87150e0(59526893);
                                    c28655q4.m87173q(false);
                                }
                                if (textResource4 != null) {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(59572742);
                                    if (interfaceC4339a3 != null) {
                                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j13 = jM125316b;
                                    }
                                    C28655q c28655q111114 = c28655q2;
                                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111114, 24576, 13);
                                    C28655q c28655q111115 = c28655q111114;
                                    c28655q111115.m87173q(z16);
                                    c28655q3 = c28655q111115;
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(60009997);
                                    c28655q2.m87173q(z16);
                                    c28655q3 = c28655q2;
                                }
                                c28655q3.m87173q(r10);
                                float f1110 = 2 * 4;
                                Modifier modifierM3396r17 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1110, r10);
                                C22994r1 c22994r1M66759a1114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1110), C2299e.f9107J, c28655q3, 6);
                                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q3.m87165m();
                                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r17);
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i118, c22994r1M66759a1114);
                                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11113);
                                if (c28655q3.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i119, modifierM118962N11113);
                                c28655q3.m87150e0(-177024899);
                                it = listOfNumbers.iterator();
                                while (it.hasNext()) {
                                    int iIntValue17 = ((Number) it.next()).intValue();
                                    if (interfaceC4339a3 != null) {
                                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j7 = jM125316b;
                                    }
                                    TextResource textResource114 = textResource4;
                                    String str111 = str4;
                                    InterfaceC28601c1 interfaceC28601c117 = interfaceC28601c1;
                                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111, iIntValue17, interfaceC28601c117, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                    textResource4 = textResource114;
                                    z16 = z16;
                                    z15 = z15;
                                    cVar = cVar;
                                    str4 = str111;
                                    interfaceC28601c1 = interfaceC28601c117;
                                }
                                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                                textResource5 = textResource7;
                                textResource6 = textResource4;
                                z13 = z15;
                                abstractC27285v1 = cVar;
                                str2 = str4;
                                num2 = num3;
                                interfaceC4339a2 = interfaceC4339a3;
                                modifier3 = modifier12;
                                c28655q = c28655q3;
                            } else {
                                str4 = str3;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                            C0209i c0209i1110 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i1110, modifierM118962N11111);
                            Modifier modifierM3409f18 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c116;
                            C22994r1 c22994r1M66759a1115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q4.m87165m();
                            Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f18);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i118, c22994r1M66759a1115);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11114);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i1110, modifierM118962N11114);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement18 = new LayoutWeightElement(f13, true);
                                String strM21274h18 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d18 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h18, layoutWeightElement18, c38072d18.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d18.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q111116 = c28655q4;
                                c28655q111116.m87173q(false);
                                c28655q2 = c28655q111116;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q111117 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111117, 24576, 13);
                                C28655q c28655q111118 = c28655q111117;
                                c28655q111118.m87173q(z16);
                                c28655q3 = c28655q111118;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f1111 = 2 * 4;
                            Modifier modifierM3396r18 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111, r10);
                            C22994r1 c22994r1M66759a1116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q3.m87165m();
                            Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r18);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i118, c22994r1M66759a1116);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11115);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i1110, modifierM118962N11115);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue18 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource115 = textResource4;
                                String str112 = str4;
                                InterfaceC28601c1 interfaceC28601c118 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str112, iIntValue18, interfaceC28601c118, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource115;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str112;
                                interfaceC28601c1 = interfaceC28601c118;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier12;
                            c28655q = c28655q3;
                        } else {
                            c28655q4.m87138X();
                            interfaceC4339a2 = interfaceC4339a;
                            str2 = str;
                            modifier3 = modifier2;
                            textResource5 = textResource3;
                            textResource6 = textResource4;
                            abstractC27285v1 = abstractC27285v0;
                            c28655q = c28655q4;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                        }
                    }
                    i15 |= 100663296;
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c119 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q4.m87165m();
                        Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier13 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i1111 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i1111, c23010xM66775a10);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11116);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i1112 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i1112, modifierM118962N11116);
                            Modifier modifierM3409f19 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c119;
                            C22994r1 c22994r1M66759a1117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q4.m87165m();
                            Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f19);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i1111, c22994r1M66759a1117);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11117);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i1112, modifierM118962N11117);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement19 = new LayoutWeightElement(f13, true);
                                String strM21274h19 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d19 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h19, layoutWeightElement19, c38072d19.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d19.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q111119 = c28655q4;
                                c28655q111119.m87173q(false);
                                c28655q2 = c28655q111119;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q1111110 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111110, 24576, 13);
                                C28655q c28655q1111111 = c28655q1111110;
                                c28655q1111111.m87173q(z16);
                                c28655q3 = c28655q1111111;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f1112 = 2 * 4;
                            Modifier modifierM3396r19 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1112, r10);
                            C22994r1 c22994r1M66759a1118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1112), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q3.m87165m();
                            Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r19);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i1111, c22994r1M66759a1118);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11118);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i1112, modifierM118962N11118);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue19 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource116 = textResource4;
                                String str113 = str4;
                                InterfaceC28601c1 interfaceC28601c1110 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str113, iIntValue19, interfaceC28601c1110, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource116;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str113;
                                interfaceC28601c1 = interfaceC28601c1110;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier13;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i1113 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i1113, modifierM118962N11116);
                        Modifier modifierM3409f110 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c119;
                        C22994r1 c22994r1M66759a1119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q4.m87165m();
                        Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f110);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1111, c22994r1M66759a1119);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11119);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1113, modifierM118962N11119);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement110 = new LayoutWeightElement(f13, true);
                            String strM21274h110 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d110 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h110, layoutWeightElement110, c38072d110.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d110.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q1111112 = c28655q4;
                            c28655q1111112.m87173q(false);
                            c28655q2 = c28655q1111112;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q1111113 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111113, 24576, 13);
                            C28655q c28655q1111114 = c28655q1111113;
                            c28655q1111114.m87173q(z16);
                            c28655q3 = c28655q1111114;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f1113 = 2 * 4;
                        Modifier modifierM3396r110 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1113, r10);
                        C22994r1 c22994r1M66759a11110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1113), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q3.m87165m();
                        Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r110);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1111, c22994r1M66759a11110);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111110);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1113, modifierM118962N111110);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue110 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource117 = textResource4;
                            String str114 = str4;
                            InterfaceC28601c1 interfaceC28601c1111 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str114, iIntValue110, interfaceC28601c1111, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource117;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str114;
                            interfaceC28601c1 = interfaceC28601c1111;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier13;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 12582912;
                i28 = i14 & 256;
                if (i28 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q4.m87153g(str)) {
                            i29 = 67108864;
                        } else {
                            i29 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i29;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c1112 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q4.m87165m();
                        Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier14 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i1114 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i1114, c23010xM66775a11);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i1115 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i1115, modifierM118962N111111);
                            Modifier modifierM3409f111 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c1112;
                            C22994r1 c22994r1M66759a11111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q4.m87165m();
                            Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i1114, c22994r1M66759a11111);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111112);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i1115, modifierM118962N111112);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement111 = new LayoutWeightElement(f13, true);
                                String strM21274h111 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d111 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h111, layoutWeightElement111, c38072d111.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q1111115 = c28655q4;
                                c28655q1111115.m87173q(false);
                                c28655q2 = c28655q1111115;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q1111116 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111116, 24576, 13);
                                C28655q c28655q1111117 = c28655q1111116;
                                c28655q1111117.m87173q(z16);
                                c28655q3 = c28655q1111117;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f1114 = 2 * 4;
                            Modifier modifierM3396r111 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1114, r10);
                            C22994r1 c22994r1M66759a11112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1114), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q3.m87165m();
                            Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i1114, c22994r1M66759a11112);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111113);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i1115, modifierM118962N111113);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue111 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource118 = textResource4;
                                String str115 = str4;
                                InterfaceC28601c1 interfaceC28601c1113 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str115, iIntValue111, interfaceC28601c1113, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource118;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str115;
                                interfaceC28601c1 = interfaceC28601c1113;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier14;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i1116 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i1116, modifierM118962N111111);
                        Modifier modifierM3409f112 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c1112;
                        C22994r1 c22994r1M66759a11113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q4.m87165m();
                        Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f112);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1114, c22994r1M66759a11113);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111114);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1116, modifierM118962N111114);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement112 = new LayoutWeightElement(f13, true);
                            String strM21274h112 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d112 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h112, layoutWeightElement112, c38072d112.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d112.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q1111118 = c28655q4;
                            c28655q1111118.m87173q(false);
                            c28655q2 = c28655q1111118;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q1111119 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111119, 24576, 13);
                            C28655q c28655q11111110 = c28655q1111119;
                            c28655q11111110.m87173q(z16);
                            c28655q3 = c28655q11111110;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f1115 = 2 * 4;
                        Modifier modifierM3396r112 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1115, r10);
                        C22994r1 c22994r1M66759a11114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1115), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q3.m87165m();
                        Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r112);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1114, c22994r1M66759a11114);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111115);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1116, modifierM118962N111115);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue112 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource119 = textResource4;
                            String str116 = str4;
                            InterfaceC28601c1 interfaceC28601c1114 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str116, iIntValue112, interfaceC28601c1114, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource119;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str116;
                            interfaceC28601c1 = interfaceC28601c1114;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier14;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c1115 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q4.m87165m();
                    Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier15 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i1117 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i1117, c23010xM66775a12);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111116);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i1118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i1118, modifierM118962N111116);
                        Modifier modifierM3409f113 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c1115;
                        C22994r1 c22994r1M66759a11115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q4.m87165m();
                        Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f113);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1117, c22994r1M66759a11115);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111117);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1118, modifierM118962N111117);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement113 = new LayoutWeightElement(f13, true);
                            String strM21274h113 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d113 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h113, layoutWeightElement113, c38072d113.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d113.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q11111111 = c28655q4;
                            c28655q11111111.m87173q(false);
                            c28655q2 = c28655q11111111;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q11111112 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111112, 24576, 13);
                            C28655q c28655q11111113 = c28655q11111112;
                            c28655q11111113.m87173q(z16);
                            c28655q3 = c28655q11111113;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f1116 = 2 * 4;
                        Modifier modifierM3396r113 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1116, r10);
                        C22994r1 c22994r1M66759a11116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1116), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q3.m87165m();
                        Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r113);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1117, c22994r1M66759a11116);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111118);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1118, modifierM118962N111118);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue113 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource1110 = textResource4;
                            String str117 = str4;
                            InterfaceC28601c1 interfaceC28601c1116 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str117, iIntValue113, interfaceC28601c1116, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource1110;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str117;
                            interfaceC28601c1 = interfaceC28601c1116;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier15;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i1119 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i1119, modifierM118962N111116);
                    Modifier modifierM3409f114 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c1115;
                    C22994r1 c22994r1M66759a11117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q4.m87165m();
                    Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f114);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1117, c22994r1M66759a11117);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111119);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1119, modifierM118962N111119);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement114 = new LayoutWeightElement(f13, true);
                        String strM21274h114 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d114 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h114, layoutWeightElement114, c38072d114.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d114.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q11111114 = c28655q4;
                        c28655q11111114.m87173q(false);
                        c28655q2 = c28655q11111114;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q11111115 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111115, 24576, 13);
                        C28655q c28655q11111116 = c28655q11111115;
                        c28655q11111116.m87173q(z16);
                        c28655q3 = c28655q11111116;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f1117 = 2 * 4;
                    Modifier modifierM3396r114 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1117, r10);
                    C22994r1 c22994r1M66759a11118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1117), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q3.m87165m();
                    Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r114);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1117, c22994r1M66759a11118);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1119, modifierM118962N1111110);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue114 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource1111 = textResource4;
                        String str118 = str4;
                        InterfaceC28601c1 interfaceC28601c1117 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str118, iIntValue114, interfaceC28601c1117, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource1111;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str118;
                        interfaceC28601c1 = interfaceC28601c1117;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier15;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 24576;
            num2 = num;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87155h(z13)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 1572864) == 0) {
                if ((i14 & 64) != 0) {
                    i37 = 524288;
                } else {
                    if ((i13 & 2097152) == 0) {
                        zM87157i = c28655q4.m87153g(abstractC27285v0);
                    } else {
                        zM87157i = c28655q4.m87157i(abstractC27285v0);
                    }
                    if (zM87157i) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                }
                i15 |= i37;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 256;
                if (i28 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q4.m87153g(str)) {
                            i29 = 67108864;
                        } else {
                            i29 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i29;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c1118 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q4.m87165m();
                        Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier16 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i11110 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i11110, c23010xM66775a13);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i11111 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i11111, modifierM118962N1111111);
                            Modifier modifierM3409f115 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c1118;
                            C22994r1 c22994r1M66759a11119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q4.m87165m();
                            Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f115);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i11110, c22994r1M66759a11119);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111112);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i11111, modifierM118962N1111112);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement115 = new LayoutWeightElement(f13, true);
                                String strM21274h115 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d115 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h115, layoutWeightElement115, c38072d115.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d115.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q11111117 = c28655q4;
                                c28655q11111117.m87173q(false);
                                c28655q2 = c28655q11111117;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q11111118 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111118, 24576, 13);
                                C28655q c28655q11111119 = c28655q11111118;
                                c28655q11111119.m87173q(z16);
                                c28655q3 = c28655q11111119;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f1118 = 2 * 4;
                            Modifier modifierM3396r115 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1118, r10);
                            C22994r1 c22994r1M66759a111110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1118), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q3.m87165m();
                            Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r115);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i11110, c22994r1M66759a111110);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111113);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i11111, modifierM118962N1111113);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue115 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource1112 = textResource4;
                                String str119 = str4;
                                InterfaceC28601c1 interfaceC28601c1119 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str119, iIntValue115, interfaceC28601c1119, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource1112;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str119;
                                interfaceC28601c1 = interfaceC28601c1119;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier16;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i11112 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i11112, modifierM118962N1111111);
                        Modifier modifierM3409f116 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c1118;
                        C22994r1 c22994r1M66759a111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q4.m87165m();
                        Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f116);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11110, c22994r1M66759a111111);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111114);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11112, modifierM118962N1111114);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement116 = new LayoutWeightElement(f13, true);
                            String strM21274h116 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d116 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h116, layoutWeightElement116, c38072d116.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d116.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q111111110 = c28655q4;
                            c28655q111111110.m87173q(false);
                            c28655q2 = c28655q111111110;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q111111111 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111, 24576, 13);
                            C28655q c28655q111111112 = c28655q111111111;
                            c28655q111111112.m87173q(z16);
                            c28655q3 = c28655q111111112;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f1119 = 2 * 4;
                        Modifier modifierM3396r116 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1119, r10);
                        C22994r1 c22994r1M66759a111112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1119), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111115 = c28655q3.m87165m();
                        Modifier modifierM118962N1111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r116);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11110, c22994r1M66759a111112);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111115);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11112, modifierM118962N1111115);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue116 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource1113 = textResource4;
                            String str1110 = str4;
                            InterfaceC28601c1 interfaceC28601c11110 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1110, iIntValue116, interfaceC28601c11110, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource1113;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str1110;
                            interfaceC28601c1 = interfaceC28601c11110;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier16;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c11111 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111116 = c28655q4.m87165m();
                    Modifier modifierM118962N1111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier17 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i11113 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i11113, c23010xM66775a14);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111116);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i11114, modifierM118962N1111116);
                        Modifier modifierM3409f117 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c11111;
                        C22994r1 c22994r1M66759a111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111117 = c28655q4.m87165m();
                        Modifier modifierM118962N1111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f117);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11113, c22994r1M66759a111113);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111117);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11114, modifierM118962N1111117);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement117 = new LayoutWeightElement(f13, true);
                            String strM21274h117 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d117 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h117, layoutWeightElement117, c38072d117.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d117.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q111111113 = c28655q4;
                            c28655q111111113.m87173q(false);
                            c28655q2 = c28655q111111113;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q111111114 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111114, 24576, 13);
                            C28655q c28655q111111115 = c28655q111111114;
                            c28655q111111115.m87173q(z16);
                            c28655q3 = c28655q111111115;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f11110 = 2 * 4;
                        Modifier modifierM3396r117 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11110, r10);
                        C22994r1 c22994r1M66759a111114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11110), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111118 = c28655q3.m87165m();
                        Modifier modifierM118962N1111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r117);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11113, c22994r1M66759a111114);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111118);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11114, modifierM118962N1111118);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue117 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource1114 = textResource4;
                            String str1111 = str4;
                            InterfaceC28601c1 interfaceC28601c11112 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111, iIntValue117, interfaceC28601c11112, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource1114;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str1111;
                            interfaceC28601c1 = interfaceC28601c11112;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier17;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i11115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i11115, modifierM118962N1111116);
                    Modifier modifierM3409f118 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c11111;
                    C22994r1 c22994r1M66759a111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111119 = c28655q4.m87165m();
                    Modifier modifierM118962N1111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f118);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11113, c22994r1M66759a111115);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111119);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11115, modifierM118962N1111119);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement118 = new LayoutWeightElement(f13, true);
                        String strM21274h118 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d118 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h118, layoutWeightElement118, c38072d118.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d118.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q111111116 = c28655q4;
                        c28655q111111116.m87173q(false);
                        c28655q2 = c28655q111111116;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q111111117 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111117, 24576, 13);
                        C28655q c28655q111111118 = c28655q111111117;
                        c28655q111111118.m87173q(z16);
                        c28655q3 = c28655q111111118;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f11111 = 2 * 4;
                    Modifier modifierM3396r118 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111, r10);
                    C22994r1 c22994r1M66759a111116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11111), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111110 = c28655q3.m87165m();
                    Modifier modifierM118962N11111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r118);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11113, c22994r1M66759a111116);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11115, modifierM118962N11111110);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue118 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource1115 = textResource4;
                        String str1112 = str4;
                        InterfaceC28601c1 interfaceC28601c11113 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1112, iIntValue118, interfaceC28601c11113, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource1115;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str1112;
                        interfaceC28601c1 = interfaceC28601c11113;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier17;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 12582912;
            i28 = i14 & 256;
            if (i28 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q4.m87153g(str)) {
                        i29 = 67108864;
                    } else {
                        i29 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i29;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c11114 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111 = c28655q4.m87165m();
                    Modifier modifierM118962N11111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier18 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i11116 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i11116, c23010xM66775a15);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11117 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i11117, modifierM118962N11111111);
                        Modifier modifierM3409f119 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c11114;
                        C22994r1 c22994r1M66759a111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111112 = c28655q4.m87165m();
                        Modifier modifierM118962N11111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f119);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11116, c22994r1M66759a111117);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111112);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11117, modifierM118962N11111112);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement119 = new LayoutWeightElement(f13, true);
                            String strM21274h119 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d119 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h119, layoutWeightElement119, c38072d119.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d119.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q111111119 = c28655q4;
                            c28655q111111119.m87173q(false);
                            c28655q2 = c28655q111111119;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q1111111110 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111110, 24576, 13);
                            C28655q c28655q1111111111 = c28655q1111111110;
                            c28655q1111111111.m87173q(z16);
                            c28655q3 = c28655q1111111111;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f11112 = 2 * 4;
                        Modifier modifierM3396r119 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11112, r10);
                        C22994r1 c22994r1M66759a111118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11112), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111113 = c28655q3.m87165m();
                        Modifier modifierM118962N11111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r119);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11116, c22994r1M66759a111118);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111113);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11117, modifierM118962N11111113);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue119 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource1116 = textResource4;
                            String str1113 = str4;
                            InterfaceC28601c1 interfaceC28601c11115 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1113, iIntValue119, interfaceC28601c11115, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource1116;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str1113;
                            interfaceC28601c1 = interfaceC28601c11115;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier18;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i11118 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i11118, modifierM118962N11111111);
                    Modifier modifierM3409f1110 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c11114;
                    C22994r1 c22994r1M66759a111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111114 = c28655q4.m87165m();
                    Modifier modifierM118962N11111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1110);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11116, c22994r1M66759a111119);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111114);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11118, modifierM118962N11111114);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement1110 = new LayoutWeightElement(f13, true);
                        String strM21274h1110 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d1110 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h1110, layoutWeightElement1110, c38072d1110.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1110.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q1111111112 = c28655q4;
                        c28655q1111111112.m87173q(false);
                        c28655q2 = c28655q1111111112;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q1111111113 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111113, 24576, 13);
                        C28655q c28655q1111111114 = c28655q1111111113;
                        c28655q1111111114.m87173q(z16);
                        c28655q3 = c28655q1111111114;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f11113 = 2 * 4;
                    Modifier modifierM3396r1110 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11113, r10);
                    C22994r1 c22994r1M66759a1111110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11113), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111115 = c28655q3.m87165m();
                    Modifier modifierM118962N11111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1110);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11116, c22994r1M66759a1111110);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111115);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11118, modifierM118962N11111115);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue1110 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource1117 = textResource4;
                        String str1114 = str4;
                        InterfaceC28601c1 interfaceC28601c11116 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1114, iIntValue1110, interfaceC28601c11116, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource1117;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str1114;
                        interfaceC28601c1 = interfaceC28601c11116;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier18;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i13 & 805306368) == 0) {
                if (c28655q4.m87157i(selectedNumber)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i15 |= i36;
            }
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                c28655q4.m87140Z();
                i34 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i34 != 0) {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                } else {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                }
                c28655q4.m87175r();
                objM87133R = c28655q4.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = AbstractC28683x.m87272z(num3);
                    c28655q4.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c11117 = (InterfaceC28601c1) objM87133R;
                jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111116 = c28655q4.m87165m();
                Modifier modifierM118962N11111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier19 = modifier2;
                interfaceC4339a4 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i11119 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i11119, c23010xM66775a16);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111116);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    str4 = str3;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i111110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i111110, modifierM118962N11111116);
                    Modifier modifierM3409f1111 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c11117;
                    C22994r1 c22994r1M66759a1111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111117 = c28655q4.m87165m();
                    Modifier modifierM118962N11111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1111);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11119, c22994r1M66759a1111111);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111117);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i111110, modifierM118962N11111117);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement1111 = new LayoutWeightElement(f13, true);
                        String strM21274h1111 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d1111 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h1111, layoutWeightElement1111, c38072d1111.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1111.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q1111111115 = c28655q4;
                        c28655q1111111115.m87173q(false);
                        c28655q2 = c28655q1111111115;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q1111111116 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111116, 24576, 13);
                        C28655q c28655q1111111117 = c28655q1111111116;
                        c28655q1111111117.m87173q(z16);
                        c28655q3 = c28655q1111111117;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f11114 = 2 * 4;
                    Modifier modifierM3396r1111 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11114, r10);
                    C22994r1 c22994r1M66759a1111112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11114), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111118 = c28655q3.m87165m();
                    Modifier modifierM118962N11111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1111);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11119, c22994r1M66759a1111112);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111118);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111110, modifierM118962N11111118);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue1111 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource1118 = textResource4;
                        String str1115 = str4;
                        InterfaceC28601c1 interfaceC28601c11118 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1115, iIntValue1111, interfaceC28601c11118, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource1118;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str1115;
                        interfaceC28601c1 = interfaceC28601c11118;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier19;
                    c28655q = c28655q3;
                } else {
                    str4 = str3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                C0209i c0209i111111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i111111, modifierM118962N11111116);
                Modifier modifierM3409f1112 = AbstractC1102d.m3409f(1.0f, c2314t);
                interfaceC28601c1 = interfaceC28601c11117;
                C22994r1 c22994r1M66759a1111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                i35 = i15;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111119 = c28655q4.m87165m();
                Modifier modifierM118962N11111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1112);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i11119, c22994r1M66759a1111113);
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111119);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i111111, modifierM118962N11111119);
                if (textResource7 != null) {
                    c28655q4.m87150e0(59283326);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement1112 = new LayoutWeightElement(f13, true);
                    String strM21274h1112 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                    C38072d c38072d1112 = C38072d.f163053a;
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    AbstractC30795n.m94707h(strM21274h1112, layoutWeightElement1112, c38072d1112.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1112.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                    C28655q c28655q1111111118 = c28655q4;
                    c28655q1111111118.m87173q(false);
                    c28655q2 = c28655q1111111118;
                } else {
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    c28655q4.m87150e0(59526893);
                    c28655q4.m87173q(false);
                }
                if (textResource4 != null) {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(59572742);
                    if (interfaceC4339a3 != null) {
                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j13 = jM125316b;
                    }
                    C28655q c28655q1111111119 = c28655q2;
                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111119, 24576, 13);
                    C28655q c28655q11111111110 = c28655q1111111119;
                    c28655q11111111110.m87173q(z16);
                    c28655q3 = c28655q11111111110;
                } else {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(60009997);
                    c28655q2.m87173q(z16);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(r10);
                float f11115 = 2 * 4;
                Modifier modifierM3396r1112 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11115, r10);
                C22994r1 c22994r1M66759a1111114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11115), C2299e.f9107J, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111110 = c28655q3.m87165m();
                Modifier modifierM118962N111111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1112);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a4);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11119, c22994r1M66759a1111114);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111110);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i111111, modifierM118962N111111110);
                c28655q3.m87150e0(-177024899);
                it = listOfNumbers.iterator();
                while (it.hasNext()) {
                    int iIntValue1112 = ((Number) it.next()).intValue();
                    if (interfaceC4339a3 != null) {
                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j7 = jM125316b;
                    }
                    TextResource textResource1119 = textResource4;
                    String str1116 = str4;
                    InterfaceC28601c1 interfaceC28601c11119 = interfaceC28601c1;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1116, iIntValue1112, interfaceC28601c11119, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                    textResource4 = textResource1119;
                    z16 = z16;
                    z15 = z15;
                    cVar = cVar;
                    str4 = str1116;
                    interfaceC28601c1 = interfaceC28601c11119;
                }
                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                textResource5 = textResource7;
                textResource6 = textResource4;
                z13 = z15;
                abstractC27285v1 = cVar;
                str2 = str4;
                num2 = num3;
                interfaceC4339a2 = interfaceC4339a3;
                modifier3 = modifier19;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                str2 = str;
                modifier3 = modifier2;
                textResource5 = textResource3;
                textResource6 = textResource4;
                abstractC27285v1 = abstractC27285v0;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
            }
        }
        i15 |= 48;
        textResource3 = textResource;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                textResource4 = textResource2;
                if (c28655q4.m87153g(textResource4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q4.m87157i(listOfNumbers)) {
                    i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i38;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    num2 = num;
                    if (c28655q4.m87153g(num2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    z13 = z4;
                } else {
                    z13 = z4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q4.m87155h(z13)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 1572864) == 0) {
                    if ((i14 & 64) != 0) {
                        i37 = 524288;
                    } else {
                        if ((i13 & 2097152) == 0) {
                            zM87157i = c28655q4.m87153g(abstractC27285v0);
                        } else {
                            zM87157i = c28655q4.m87157i(abstractC27285v0);
                        }
                        if (zM87157i) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                    }
                    i15 |= i37;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q4.m87157i(interfaceC4339a)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 256;
                    if (i28 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q4.m87153g(str)) {
                                i29 = 67108864;
                            } else {
                                i29 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i29;
                        }
                        if ((i13 & 805306368) == 0) {
                            if (c28655q4.m87157i(selectedNumber)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i15 |= i36;
                        }
                        if ((i15 & 306783379) != 306783378) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q4.m87135U(i15 & 1, z14)) {
                            c28655q4.m87140Z();
                            i34 = i13 & 1;
                            c2314t = C2314t.f9131w;
                            if (i34 != 0) {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i44 != 0) {
                                    textResource3 = null;
                                }
                                if (i16 != 0) {
                                    textResource4 = null;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 64) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                    i15 &= -3670017;
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                num3 = num2;
                                z15 = z13;
                                if (i28 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource7 = textResource3;
                            }
                            c28655q4.m87175r();
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = AbstractC28683x.m87272z(num3);
                                c28655q4.m87172p0(objM87133R);
                            }
                            InterfaceC28601c1 interfaceC28601c111110 = (InterfaceC28601c1) objM87133R;
                            jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                            C23010x c23010xM66775a17 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111111111 = c28655q4.m87165m();
                            Modifier modifierM118962N111111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier110 = modifier2;
                            interfaceC4339a4 = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            C0209i c0209i111112 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q4, c0209i111112, c23010xM66775a17);
                            c0209i = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111);
                            c0209i2 = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                str4 = str3;
                                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i111113 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q4, c0209i111113, modifierM118962N111111111);
                                Modifier modifierM3409f1113 = AbstractC1102d.m3409f(1.0f, c2314t);
                                interfaceC28601c1 = interfaceC28601c111110;
                                C22994r1 c22994r1M66759a1111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                                i35 = i15;
                                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m111111112 = c28655q4.m87165m();
                                Modifier modifierM118962N111111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1113);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i111112, c22994r1M66759a1111115);
                                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111112);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i111113, modifierM118962N111111112);
                                if (textResource7 != null) {
                                    c28655q4.m87150e0(59283326);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f13 = Float.MAX_VALUE;
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    LayoutWeightElement layoutWeightElement1113 = new LayoutWeightElement(f13, true);
                                    String strM21274h1113 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                    C38072d c38072d1113 = C38072d.f163053a;
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    AbstractC30795n.m94707h(strM21274h1113, layoutWeightElement1113, c38072d1113.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1113.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                    C28655q c28655q11111111111 = c28655q4;
                                    c28655q11111111111.m87173q(false);
                                    c28655q2 = c28655q11111111111;
                                } else {
                                    c0209i3 = c0209i;
                                    r10 = 1;
                                    z16 = false;
                                    c28655q4.m87150e0(59526893);
                                    c28655q4.m87173q(false);
                                }
                                if (textResource4 != null) {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(59572742);
                                    if (interfaceC4339a3 != null) {
                                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j13 = jM125316b;
                                    }
                                    C28655q c28655q11111111112 = c28655q2;
                                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111112, 24576, 13);
                                    C28655q c28655q11111111113 = c28655q11111111112;
                                    c28655q11111111113.m87173q(z16);
                                    c28655q3 = c28655q11111111113;
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(60009997);
                                    c28655q2.m87173q(z16);
                                    c28655q3 = c28655q2;
                                }
                                c28655q3.m87173q(r10);
                                float f11116 = 2 * 4;
                                Modifier modifierM3396r1113 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11116, r10);
                                C22994r1 c22994r1M66759a1111116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11116), C2299e.f9107J, c28655q3, 6);
                                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m111111113 = c28655q3.m87165m();
                                Modifier modifierM118962N111111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1113);
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(interfaceC4339a4);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i111112, c22994r1M66759a1111116);
                                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111113);
                                if (c28655q3.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i111113, modifierM118962N111111113);
                                c28655q3.m87150e0(-177024899);
                                it = listOfNumbers.iterator();
                                while (it.hasNext()) {
                                    int iIntValue1113 = ((Number) it.next()).intValue();
                                    if (interfaceC4339a3 != null) {
                                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                    } else {
                                        j7 = jM125316b;
                                    }
                                    TextResource textResource11110 = textResource4;
                                    String str1117 = str4;
                                    InterfaceC28601c1 interfaceC28601c111111 = interfaceC28601c1;
                                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1117, iIntValue1113, interfaceC28601c111111, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                    textResource4 = textResource11110;
                                    z16 = z16;
                                    z15 = z15;
                                    cVar = cVar;
                                    str4 = str1117;
                                    interfaceC28601c1 = interfaceC28601c111111;
                                }
                                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                                textResource5 = textResource7;
                                textResource6 = textResource4;
                                z13 = z15;
                                abstractC27285v1 = cVar;
                                str2 = str4;
                                num2 = num3;
                                interfaceC4339a2 = interfaceC4339a3;
                                modifier3 = modifier110;
                                c28655q = c28655q3;
                            } else {
                                str4 = str3;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                            C0209i c0209i111114 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i111114, modifierM118962N111111111);
                            Modifier modifierM3409f1114 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c111110;
                            C22994r1 c22994r1M66759a1111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111111114 = c28655q4.m87165m();
                            Modifier modifierM118962N111111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1114);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i111112, c22994r1M66759a1111117);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111114);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i111114, modifierM118962N111111114);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement1114 = new LayoutWeightElement(f13, true);
                                String strM21274h1114 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d1114 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h1114, layoutWeightElement1114, c38072d1114.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1114.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q11111111114 = c28655q4;
                                c28655q11111111114.m87173q(false);
                                c28655q2 = c28655q11111111114;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q11111111115 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111115, 24576, 13);
                                C28655q c28655q11111111116 = c28655q11111111115;
                                c28655q11111111116.m87173q(z16);
                                c28655q3 = c28655q11111111116;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f11117 = 2 * 4;
                            Modifier modifierM3396r1114 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11117, r10);
                            C22994r1 c22994r1M66759a1111118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11117), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111111115 = c28655q3.m87165m();
                            Modifier modifierM118962N111111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1114);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i111112, c22994r1M66759a1111118);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111115);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i111114, modifierM118962N111111115);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue1114 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource11111 = textResource4;
                                String str1118 = str4;
                                InterfaceC28601c1 interfaceC28601c111112 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1118, iIntValue1114, interfaceC28601c111112, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource11111;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str1118;
                                interfaceC28601c1 = interfaceC28601c111112;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier110;
                            c28655q = c28655q3;
                        } else {
                            c28655q4.m87138X();
                            interfaceC4339a2 = interfaceC4339a;
                            str2 = str;
                            modifier3 = modifier2;
                            textResource5 = textResource3;
                            textResource6 = textResource4;
                            abstractC27285v1 = abstractC27285v0;
                            c28655q = c28655q4;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                        }
                    }
                    i15 |= 100663296;
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c111113 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a18 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111116 = c28655q4.m87165m();
                        Modifier modifierM118962N111111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier111 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i111115 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i111115, c23010xM66775a18);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111116);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i111116 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i111116, modifierM118962N111111116);
                            Modifier modifierM3409f1115 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c111113;
                            C22994r1 c22994r1M66759a1111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111111117 = c28655q4.m87165m();
                            Modifier modifierM118962N111111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1115);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i111115, c22994r1M66759a1111119);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111117);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i111116, modifierM118962N111111117);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement1115 = new LayoutWeightElement(f13, true);
                                String strM21274h1115 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d1115 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h1115, layoutWeightElement1115, c38072d1115.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1115.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q11111111117 = c28655q4;
                                c28655q11111111117.m87173q(false);
                                c28655q2 = c28655q11111111117;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q11111111118 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111118, 24576, 13);
                                C28655q c28655q11111111119 = c28655q11111111118;
                                c28655q11111111119.m87173q(z16);
                                c28655q3 = c28655q11111111119;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f11118 = 2 * 4;
                            Modifier modifierM3396r1115 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11118, r10);
                            C22994r1 c22994r1M66759a11111110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11118), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111111118 = c28655q3.m87165m();
                            Modifier modifierM118962N111111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1115);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i111115, c22994r1M66759a11111110);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111118);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i111116, modifierM118962N111111118);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue1115 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource11112 = textResource4;
                                String str1119 = str4;
                                InterfaceC28601c1 interfaceC28601c111114 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1119, iIntValue1115, interfaceC28601c111114, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource11112;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str1119;
                                interfaceC28601c1 = interfaceC28601c111114;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier111;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i111117 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i111117, modifierM118962N111111116);
                        Modifier modifierM3409f1116 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c111113;
                        C22994r1 c22994r1M66759a11111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111119 = c28655q4.m87165m();
                        Modifier modifierM118962N111111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1116);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i111115, c22994r1M66759a11111111);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111119);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i111117, modifierM118962N111111119);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement1116 = new LayoutWeightElement(f13, true);
                            String strM21274h1116 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d1116 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h1116, layoutWeightElement1116, c38072d1116.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1116.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q111111111110 = c28655q4;
                            c28655q111111111110.m87173q(false);
                            c28655q2 = c28655q111111111110;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q111111111111 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111111, 24576, 13);
                            C28655q c28655q111111111112 = c28655q111111111111;
                            c28655q111111111112.m87173q(z16);
                            c28655q3 = c28655q111111111112;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f11119 = 2 * 4;
                        Modifier modifierM3396r1116 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11119, r10);
                        C22994r1 c22994r1M66759a11111112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11119), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111110 = c28655q3.m87165m();
                        Modifier modifierM118962N1111111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1116);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111115, c22994r1M66759a11111112);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111110);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111117, modifierM118962N1111111110);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue1116 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource11113 = textResource4;
                            String str11110 = str4;
                            InterfaceC28601c1 interfaceC28601c111115 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11110, iIntValue1116, interfaceC28601c111115, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource11113;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str11110;
                            interfaceC28601c1 = interfaceC28601c111115;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier111;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 12582912;
                i28 = i14 & 256;
                if (i28 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q4.m87153g(str)) {
                            i29 = 67108864;
                        } else {
                            i29 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i29;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c111116 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a19 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111111 = c28655q4.m87165m();
                        Modifier modifierM118962N1111111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier112 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i111118 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i111118, c23010xM66775a19);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i111119 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i111119, modifierM118962N1111111111);
                            Modifier modifierM3409f1117 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c111116;
                            C22994r1 c22994r1M66759a11111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111111112 = c28655q4.m87165m();
                            Modifier modifierM118962N1111111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1117);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i111118, c22994r1M66759a11111113);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111112);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i111119, modifierM118962N1111111112);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement1117 = new LayoutWeightElement(f13, true);
                                String strM21274h1117 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d1117 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h1117, layoutWeightElement1117, c38072d1117.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1117.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q111111111113 = c28655q4;
                                c28655q111111111113.m87173q(false);
                                c28655q2 = c28655q111111111113;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q111111111114 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111114, 24576, 13);
                                C28655q c28655q111111111115 = c28655q111111111114;
                                c28655q111111111115.m87173q(z16);
                                c28655q3 = c28655q111111111115;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f111110 = 2 * 4;
                            Modifier modifierM3396r1117 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111110, r10);
                            C22994r1 c22994r1M66759a11111114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111110), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111111113 = c28655q3.m87165m();
                            Modifier modifierM118962N1111111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1117);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i111118, c22994r1M66759a11111114);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111113);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i111119, modifierM118962N1111111113);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue1117 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource11114 = textResource4;
                                String str11111 = str4;
                                InterfaceC28601c1 interfaceC28601c111117 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11111, iIntValue1117, interfaceC28601c111117, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource11114;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str11111;
                                interfaceC28601c1 = interfaceC28601c111117;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier112;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i1111110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i1111110, modifierM118962N1111111111);
                        Modifier modifierM3409f1118 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c111116;
                        C22994r1 c22994r1M66759a11111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111114 = c28655q4.m87165m();
                        Modifier modifierM118962N1111111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1118);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i111118, c22994r1M66759a11111115);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111114);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1111110, modifierM118962N1111111114);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement1118 = new LayoutWeightElement(f13, true);
                            String strM21274h1118 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d1118 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h1118, layoutWeightElement1118, c38072d1118.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1118.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q111111111116 = c28655q4;
                            c28655q111111111116.m87173q(false);
                            c28655q2 = c28655q111111111116;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q111111111117 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111117, 24576, 13);
                            C28655q c28655q111111111118 = c28655q111111111117;
                            c28655q111111111118.m87173q(z16);
                            c28655q3 = c28655q111111111118;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f111111 = 2 * 4;
                        Modifier modifierM3396r1118 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111111, r10);
                        C22994r1 c22994r1M66759a11111116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111111), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111115 = c28655q3.m87165m();
                        Modifier modifierM118962N1111111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1118);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111118, c22994r1M66759a11111116);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111115);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1111110, modifierM118962N1111111115);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue1118 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource11115 = textResource4;
                            String str11112 = str4;
                            InterfaceC28601c1 interfaceC28601c111118 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11112, iIntValue1118, interfaceC28601c111118, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource11115;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str11112;
                            interfaceC28601c1 = interfaceC28601c111118;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier112;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c111119 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a110 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111116 = c28655q4.m87165m();
                    Modifier modifierM118962N1111111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier113 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i1111111 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111, c23010xM66775a110);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111116);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i1111112 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i1111112, modifierM118962N1111111116);
                        Modifier modifierM3409f1119 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c111119;
                        C22994r1 c22994r1M66759a11111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111117 = c28655q4.m87165m();
                        Modifier modifierM118962N1111111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1119);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1111111, c22994r1M66759a11111117);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111117);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1111112, modifierM118962N1111111117);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement1119 = new LayoutWeightElement(f13, true);
                            String strM21274h1119 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d1119 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h1119, layoutWeightElement1119, c38072d1119.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1119.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q111111111119 = c28655q4;
                            c28655q111111111119.m87173q(false);
                            c28655q2 = c28655q111111111119;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q1111111111110 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111110, 24576, 13);
                            C28655q c28655q1111111111111 = c28655q1111111111110;
                            c28655q1111111111111.m87173q(z16);
                            c28655q3 = c28655q1111111111111;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f111112 = 2 * 4;
                        Modifier modifierM3396r1119 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111112, r10);
                        C22994r1 c22994r1M66759a11111118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111112), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111118 = c28655q3.m87165m();
                        Modifier modifierM118962N1111111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1119);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1111111, c22994r1M66759a11111118);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111118);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1111112, modifierM118962N1111111118);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue1119 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource11116 = textResource4;
                            String str11113 = str4;
                            InterfaceC28601c1 interfaceC28601c1111110 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11113, iIntValue1119, interfaceC28601c1111110, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource11116;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str11113;
                            interfaceC28601c1 = interfaceC28601c1111110;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier113;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i1111113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i1111113, modifierM118962N1111111116);
                    Modifier modifierM3409f11110 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c111119;
                    C22994r1 c22994r1M66759a11111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111119 = c28655q4.m87165m();
                    Modifier modifierM118962N1111111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11110);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111, c22994r1M66759a11111119);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111119);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1111113, modifierM118962N1111111119);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement11110 = new LayoutWeightElement(f13, true);
                        String strM21274h11110 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d11110 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h11110, layoutWeightElement11110, c38072d11110.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11110.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q1111111111112 = c28655q4;
                        c28655q1111111111112.m87173q(false);
                        c28655q2 = c28655q1111111111112;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q1111111111113 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111113, 24576, 13);
                        C28655q c28655q1111111111114 = c28655q1111111111113;
                        c28655q1111111111114.m87173q(z16);
                        c28655q3 = c28655q1111111111114;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f111113 = 2 * 4;
                    Modifier modifierM3396r11110 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111113, r10);
                    C22994r1 c22994r1M66759a111111110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111113), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111110 = c28655q3.m87165m();
                    Modifier modifierM118962N11111111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11110);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111111, c22994r1M66759a111111110);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111111110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111113, modifierM118962N11111111110);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue11110 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource11117 = textResource4;
                        String str11114 = str4;
                        InterfaceC28601c1 interfaceC28601c1111111 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11114, iIntValue11110, interfaceC28601c1111111, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource11117;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str11114;
                        interfaceC28601c1 = interfaceC28601c1111111;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier113;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 24576;
            num2 = num;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87155h(z13)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 1572864) == 0) {
                if ((i14 & 64) != 0) {
                    i37 = 524288;
                } else {
                    if ((i13 & 2097152) == 0) {
                        zM87157i = c28655q4.m87153g(abstractC27285v0);
                    } else {
                        zM87157i = c28655q4.m87157i(abstractC27285v0);
                    }
                    if (zM87157i) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                }
                i15 |= i37;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 256;
                if (i28 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q4.m87153g(str)) {
                            i29 = 67108864;
                        } else {
                            i29 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i29;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c1111112 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a111 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111111111 = c28655q4.m87165m();
                        Modifier modifierM118962N11111111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier114 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i1111114 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i1111114, c23010xM66775a111);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111111);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i1111115 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i1111115, modifierM118962N11111111111);
                            Modifier modifierM3409f11111 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c1111112;
                            C22994r1 c22994r1M66759a111111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11111111112 = c28655q4.m87165m();
                            Modifier modifierM118962N11111111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11111);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i1111114, c22994r1M66759a111111111);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111112);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i1111115, modifierM118962N11111111112);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement11111 = new LayoutWeightElement(f13, true);
                                String strM21274h11111 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d11111 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h11111, layoutWeightElement11111, c38072d11111.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11111.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q1111111111115 = c28655q4;
                                c28655q1111111111115.m87173q(false);
                                c28655q2 = c28655q1111111111115;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q1111111111116 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111116, 24576, 13);
                                C28655q c28655q1111111111117 = c28655q1111111111116;
                                c28655q1111111111117.m87173q(z16);
                                c28655q3 = c28655q1111111111117;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f111114 = 2 * 4;
                            Modifier modifierM3396r11111 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111114, r10);
                            C22994r1 c22994r1M66759a111111112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111114), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11111111113 = c28655q3.m87165m();
                            Modifier modifierM118962N11111111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11111);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i1111114, c22994r1M66759a111111112);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111111113);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i1111115, modifierM118962N11111111113);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue11111 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource11118 = textResource4;
                                String str11115 = str4;
                                InterfaceC28601c1 interfaceC28601c1111113 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11115, iIntValue11111, interfaceC28601c1111113, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource11118;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str11115;
                                interfaceC28601c1 = interfaceC28601c1111113;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier114;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i1111116 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i1111116, modifierM118962N11111111111);
                        Modifier modifierM3409f11112 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c1111112;
                        C22994r1 c22994r1M66759a111111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111111114 = c28655q4.m87165m();
                        Modifier modifierM118962N11111111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11112);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1111114, c22994r1M66759a111111113);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111114);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1111116, modifierM118962N11111111114);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement11112 = new LayoutWeightElement(f13, true);
                            String strM21274h11112 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d11112 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h11112, layoutWeightElement11112, c38072d11112.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11112.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q1111111111118 = c28655q4;
                            c28655q1111111111118.m87173q(false);
                            c28655q2 = c28655q1111111111118;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q1111111111119 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111119, 24576, 13);
                            C28655q c28655q11111111111110 = c28655q1111111111119;
                            c28655q11111111111110.m87173q(z16);
                            c28655q3 = c28655q11111111111110;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f111115 = 2 * 4;
                        Modifier modifierM3396r11112 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111115, r10);
                        C22994r1 c22994r1M66759a111111114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111115), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111111115 = c28655q3.m87165m();
                        Modifier modifierM118962N11111111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11112);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1111114, c22994r1M66759a111111114);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111111115);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1111116, modifierM118962N11111111115);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue11112 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource11119 = textResource4;
                            String str11116 = str4;
                            InterfaceC28601c1 interfaceC28601c1111114 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11116, iIntValue11112, interfaceC28601c1111114, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource11119;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str11116;
                            interfaceC28601c1 = interfaceC28601c1111114;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier114;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c1111115 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a112 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111116 = c28655q4.m87165m();
                    Modifier modifierM118962N11111111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier115 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i1111117 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i1111117, c23010xM66775a112);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111116);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i1111118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i1111118, modifierM118962N11111111116);
                        Modifier modifierM3409f11113 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c1111115;
                        C22994r1 c22994r1M66759a111111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111111117 = c28655q4.m87165m();
                        Modifier modifierM118962N11111111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11113);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1111117, c22994r1M66759a111111115);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111117);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i1111118, modifierM118962N11111111117);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement11113 = new LayoutWeightElement(f13, true);
                            String strM21274h11113 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d11113 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h11113, layoutWeightElement11113, c38072d11113.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11113.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q11111111111111 = c28655q4;
                            c28655q11111111111111.m87173q(false);
                            c28655q2 = c28655q11111111111111;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q11111111111112 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111111112, 24576, 13);
                            C28655q c28655q11111111111113 = c28655q11111111111112;
                            c28655q11111111111113.m87173q(z16);
                            c28655q3 = c28655q11111111111113;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f111116 = 2 * 4;
                        Modifier modifierM3396r11113 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111116, r10);
                        C22994r1 c22994r1M66759a111111116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111116), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111111118 = c28655q3.m87165m();
                        Modifier modifierM118962N11111111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11113);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1111117, c22994r1M66759a111111116);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111111118);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1111118, modifierM118962N11111111118);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue11113 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource111110 = textResource4;
                            String str11117 = str4;
                            InterfaceC28601c1 interfaceC28601c1111116 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11117, iIntValue11113, interfaceC28601c1111116, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource111110;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str11117;
                            interfaceC28601c1 = interfaceC28601c1111116;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier115;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i1111119 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i1111119, modifierM118962N11111111116);
                    Modifier modifierM3409f11114 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c1111115;
                    C22994r1 c22994r1M66759a111111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111119 = c28655q4.m87165m();
                    Modifier modifierM118962N11111111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11114);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1111117, c22994r1M66759a111111117);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111119);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1111119, modifierM118962N11111111119);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement11114 = new LayoutWeightElement(f13, true);
                        String strM21274h11114 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d11114 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h11114, layoutWeightElement11114, c38072d11114.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11114.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q11111111111114 = c28655q4;
                        c28655q11111111111114.m87173q(false);
                        c28655q2 = c28655q11111111111114;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q11111111111115 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111111115, 24576, 13);
                        C28655q c28655q11111111111116 = c28655q11111111111115;
                        c28655q11111111111116.m87173q(z16);
                        c28655q3 = c28655q11111111111116;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f111117 = 2 * 4;
                    Modifier modifierM3396r11114 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111117, r10);
                    C22994r1 c22994r1M66759a111111118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111117), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111110 = c28655q3.m87165m();
                    Modifier modifierM118962N111111111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11114);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111117, c22994r1M66759a111111118);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111111110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111119, modifierM118962N111111111110);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue11114 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource111111 = textResource4;
                        String str11118 = str4;
                        InterfaceC28601c1 interfaceC28601c1111117 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11118, iIntValue11114, interfaceC28601c1111117, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource111111;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str11118;
                        interfaceC28601c1 = interfaceC28601c1111117;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier115;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 12582912;
            i28 = i14 & 256;
            if (i28 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q4.m87153g(str)) {
                        i29 = 67108864;
                    } else {
                        i29 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i29;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c1111118 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a113 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111111 = c28655q4.m87165m();
                    Modifier modifierM118962N111111111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier116 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i11111110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i11111110, c23010xM66775a113);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111111);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11111111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i11111111, modifierM118962N111111111111);
                        Modifier modifierM3409f11115 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c1111118;
                        C22994r1 c22994r1M66759a111111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111111112 = c28655q4.m87165m();
                        Modifier modifierM118962N111111111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11115);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11111110, c22994r1M66759a111111119);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111112);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11111111, modifierM118962N111111111112);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement11115 = new LayoutWeightElement(f13, true);
                            String strM21274h11115 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d11115 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h11115, layoutWeightElement11115, c38072d11115.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11115.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q11111111111117 = c28655q4;
                            c28655q11111111111117.m87173q(false);
                            c28655q2 = c28655q11111111111117;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q11111111111118 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111111118, 24576, 13);
                            C28655q c28655q11111111111119 = c28655q11111111111118;
                            c28655q11111111111119.m87173q(z16);
                            c28655q3 = c28655q11111111111119;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f111118 = 2 * 4;
                        Modifier modifierM3396r11115 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111118, r10);
                        C22994r1 c22994r1M66759a1111111110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111118), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111111113 = c28655q3.m87165m();
                        Modifier modifierM118962N111111111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11115);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11111110, c22994r1M66759a1111111110);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111111113);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11111111, modifierM118962N111111111113);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue11115 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource111112 = textResource4;
                            String str11119 = str4;
                            InterfaceC28601c1 interfaceC28601c1111119 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str11119, iIntValue11115, interfaceC28601c1111119, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource111112;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str11119;
                            interfaceC28601c1 = interfaceC28601c1111119;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier116;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i11111112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i11111112, modifierM118962N111111111111);
                    Modifier modifierM3409f11116 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c1111118;
                    C22994r1 c22994r1M66759a1111111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111114 = c28655q4.m87165m();
                    Modifier modifierM118962N111111111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11116);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11111110, c22994r1M66759a1111111111);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111114);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11111112, modifierM118962N111111111114);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement11116 = new LayoutWeightElement(f13, true);
                        String strM21274h11116 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d11116 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h11116, layoutWeightElement11116, c38072d11116.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11116.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q111111111111110 = c28655q4;
                        c28655q111111111111110.m87173q(false);
                        c28655q2 = c28655q111111111111110;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q111111111111111 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111111111, 24576, 13);
                        C28655q c28655q111111111111112 = c28655q111111111111111;
                        c28655q111111111111112.m87173q(z16);
                        c28655q3 = c28655q111111111111112;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f111119 = 2 * 4;
                    Modifier modifierM3396r11116 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111119, r10);
                    C22994r1 c22994r1M66759a1111111112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111119), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111115 = c28655q3.m87165m();
                    Modifier modifierM118962N111111111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11116);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11111110, c22994r1M66759a1111111112);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111111115);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11111112, modifierM118962N111111111115);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue11116 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource111113 = textResource4;
                        String str111110 = str4;
                        InterfaceC28601c1 interfaceC28601c11111110 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111110, iIntValue11116, interfaceC28601c11111110, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource111113;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str111110;
                        interfaceC28601c1 = interfaceC28601c11111110;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier116;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i13 & 805306368) == 0) {
                if (c28655q4.m87157i(selectedNumber)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i15 |= i36;
            }
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                c28655q4.m87140Z();
                i34 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i34 != 0) {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                } else {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                }
                c28655q4.m87175r();
                objM87133R = c28655q4.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = AbstractC28683x.m87272z(num3);
                    c28655q4.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c11111111 = (InterfaceC28601c1) objM87133R;
                jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                C23010x c23010xM66775a114 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111111116 = c28655q4.m87165m();
                Modifier modifierM118962N111111111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier117 = modifier2;
                interfaceC4339a4 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i11111113 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i11111113, c23010xM66775a114);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111116);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    str4 = str3;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11111114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i11111114, modifierM118962N111111111116);
                    Modifier modifierM3409f11117 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c11111111;
                    C22994r1 c22994r1M66759a1111111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111117 = c28655q4.m87165m();
                    Modifier modifierM118962N111111111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11117);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11111113, c22994r1M66759a1111111113);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111117);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11111114, modifierM118962N111111111117);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement11117 = new LayoutWeightElement(f13, true);
                        String strM21274h11117 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d11117 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h11117, layoutWeightElement11117, c38072d11117.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11117.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q111111111111113 = c28655q4;
                        c28655q111111111111113.m87173q(false);
                        c28655q2 = c28655q111111111111113;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q111111111111114 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111111114, 24576, 13);
                        C28655q c28655q111111111111115 = c28655q111111111111114;
                        c28655q111111111111115.m87173q(z16);
                        c28655q3 = c28655q111111111111115;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f1111110 = 2 * 4;
                    Modifier modifierM3396r11117 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111110, r10);
                    C22994r1 c22994r1M66759a1111111114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111110), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111118 = c28655q3.m87165m();
                    Modifier modifierM118962N111111111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11117);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11111113, c22994r1M66759a1111111114);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111111118);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11111114, modifierM118962N111111111118);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue11117 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource111114 = textResource4;
                        String str111111 = str4;
                        InterfaceC28601c1 interfaceC28601c11111112 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111111, iIntValue11117, interfaceC28601c11111112, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource111114;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str111111;
                        interfaceC28601c1 = interfaceC28601c11111112;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier117;
                    c28655q = c28655q3;
                } else {
                    str4 = str3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                C0209i c0209i11111115 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i11111115, modifierM118962N111111111116);
                Modifier modifierM3409f11118 = AbstractC1102d.m3409f(1.0f, c2314t);
                interfaceC28601c1 = interfaceC28601c11111111;
                C22994r1 c22994r1M66759a1111111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                i35 = i15;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111111119 = c28655q4.m87165m();
                Modifier modifierM118962N111111111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11118);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i11111113, c22994r1M66759a1111111115);
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111119);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i11111115, modifierM118962N111111111119);
                if (textResource7 != null) {
                    c28655q4.m87150e0(59283326);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement11118 = new LayoutWeightElement(f13, true);
                    String strM21274h11118 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                    C38072d c38072d11118 = C38072d.f163053a;
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    AbstractC30795n.m94707h(strM21274h11118, layoutWeightElement11118, c38072d11118.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11118.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                    C28655q c28655q111111111111116 = c28655q4;
                    c28655q111111111111116.m87173q(false);
                    c28655q2 = c28655q111111111111116;
                } else {
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    c28655q4.m87150e0(59526893);
                    c28655q4.m87173q(false);
                }
                if (textResource4 != null) {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(59572742);
                    if (interfaceC4339a3 != null) {
                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j13 = jM125316b;
                    }
                    C28655q c28655q111111111111117 = c28655q2;
                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111111117, 24576, 13);
                    C28655q c28655q111111111111118 = c28655q111111111111117;
                    c28655q111111111111118.m87173q(z16);
                    c28655q3 = c28655q111111111111118;
                } else {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(60009997);
                    c28655q2.m87173q(z16);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(r10);
                float f1111111 = 2 * 4;
                Modifier modifierM3396r11118 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111111, r10);
                C22994r1 c22994r1M66759a1111111116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111111), C2299e.f9107J, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111111110 = c28655q3.m87165m();
                Modifier modifierM118962N1111111111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11118);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a4);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11111113, c22994r1M66759a1111111116);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111111110);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11111115, modifierM118962N1111111111110);
                c28655q3.m87150e0(-177024899);
                it = listOfNumbers.iterator();
                while (it.hasNext()) {
                    int iIntValue11118 = ((Number) it.next()).intValue();
                    if (interfaceC4339a3 != null) {
                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j7 = jM125316b;
                    }
                    TextResource textResource111115 = textResource4;
                    String str111112 = str4;
                    InterfaceC28601c1 interfaceC28601c11111113 = interfaceC28601c1;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111112, iIntValue11118, interfaceC28601c11111113, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                    textResource4 = textResource111115;
                    z16 = z16;
                    z15 = z15;
                    cVar = cVar;
                    str4 = str111112;
                    interfaceC28601c1 = interfaceC28601c11111113;
                }
                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                textResource5 = textResource7;
                textResource6 = textResource4;
                z13 = z15;
                abstractC27285v1 = cVar;
                str2 = str4;
                num2 = num3;
                interfaceC4339a2 = interfaceC4339a3;
                modifier3 = modifier117;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                str2 = str;
                modifier3 = modifier2;
                textResource5 = textResource3;
                textResource6 = textResource4;
                abstractC27285v1 = abstractC27285v0;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
            }
        }
        i15 |= 384;
        textResource4 = textResource2;
        if ((i13 & 3072) == 0) {
            if (c28655q4.m87157i(listOfNumbers)) {
                i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i38;
        }
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                num2 = num;
                if (c28655q4.m87153g(num2)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87155h(z13)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 1572864) == 0) {
                if ((i14 & 64) != 0) {
                    i37 = 524288;
                } else {
                    if ((i13 & 2097152) == 0) {
                        zM87157i = c28655q4.m87153g(abstractC27285v0);
                    } else {
                        zM87157i = c28655q4.m87157i(abstractC27285v0);
                    }
                    if (zM87157i) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                }
                i15 |= i37;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 256;
                if (i28 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q4.m87153g(str)) {
                            i29 = 67108864;
                        } else {
                            i29 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i29;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q4.m87157i(selectedNumber)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i15 |= i36;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        c28655q4.m87140Z();
                        i34 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i34 != 0) {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        } else {
                            if (i39 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i44 != 0) {
                                textResource3 = null;
                            }
                            if (i16 != 0) {
                                textResource4 = null;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 64) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                                i15 &= -3670017;
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num3 = num2;
                            z15 = z13;
                            if (i28 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource7 = textResource3;
                        }
                        c28655q4.m87175r();
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC28683x.m87272z(num3);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c11111114 = (InterfaceC28601c1) objM87133R;
                        jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                        C23010x c23010xM66775a115 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111111111 = c28655q4.m87165m();
                        Modifier modifierM118962N1111111111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier118 = modifier2;
                        interfaceC4339a4 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        C0209i c0209i11111116 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i11111116, c23010xM66775a115);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111111);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            str4 = str3;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i11111117 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i11111117, modifierM118962N1111111111111);
                            Modifier modifierM3409f11119 = AbstractC1102d.m3409f(1.0f, c2314t);
                            interfaceC28601c1 = interfaceC28601c11111114;
                            C22994r1 c22994r1M66759a1111111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                            i35 = i15;
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111111111112 = c28655q4.m87165m();
                            Modifier modifierM118962N1111111111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11119);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i11111116, c22994r1M66759a1111111117);
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111112);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i11111117, modifierM118962N1111111111112);
                            if (textResource7 != null) {
                                c28655q4.m87150e0(59283326);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement11119 = new LayoutWeightElement(f13, true);
                                String strM21274h11119 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                                C38072d c38072d11119 = C38072d.f163053a;
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                AbstractC30795n.m94707h(strM21274h11119, layoutWeightElement11119, c38072d11119.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11119.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                                C28655q c28655q111111111111119 = c28655q4;
                                c28655q111111111111119.m87173q(false);
                                c28655q2 = c28655q111111111111119;
                            } else {
                                c0209i3 = c0209i;
                                r10 = 1;
                                z16 = false;
                                c28655q4.m87150e0(59526893);
                                c28655q4.m87173q(false);
                            }
                            if (textResource4 != null) {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(59572742);
                                if (interfaceC4339a3 != null) {
                                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j13 = jM125316b;
                                }
                                C28655q c28655q1111111111111110 = c28655q2;
                                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111111110, 24576, 13);
                                C28655q c28655q1111111111111111 = c28655q1111111111111110;
                                c28655q1111111111111111.m87173q(z16);
                                c28655q3 = c28655q1111111111111111;
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(60009997);
                                c28655q2.m87173q(z16);
                                c28655q3 = c28655q2;
                            }
                            c28655q3.m87173q(r10);
                            float f1111112 = 2 * 4;
                            Modifier modifierM3396r11119 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111112, r10);
                            C22994r1 c22994r1M66759a1111111118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111112), C2299e.f9107J, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111111111113 = c28655q3.m87165m();
                            Modifier modifierM118962N1111111111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11119);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a4);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i11111116, c22994r1M66759a1111111118);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111111113);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i11111117, modifierM118962N1111111111113);
                            c28655q3.m87150e0(-177024899);
                            it = listOfNumbers.iterator();
                            while (it.hasNext()) {
                                int iIntValue11119 = ((Number) it.next()).intValue();
                                if (interfaceC4339a3 != null) {
                                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                                } else {
                                    j7 = jM125316b;
                                }
                                TextResource textResource111116 = textResource4;
                                String str111113 = str4;
                                InterfaceC28601c1 interfaceC28601c11111115 = interfaceC28601c1;
                                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111113, iIntValue11119, interfaceC28601c11111115, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                                textResource4 = textResource111116;
                                z16 = z16;
                                z15 = z15;
                                cVar = cVar;
                                str4 = str111113;
                                interfaceC28601c1 = interfaceC28601c11111115;
                            }
                            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                            textResource5 = textResource7;
                            textResource6 = textResource4;
                            z13 = z15;
                            abstractC27285v1 = cVar;
                            str2 = str4;
                            num2 = num3;
                            interfaceC4339a2 = interfaceC4339a3;
                            modifier3 = modifier118;
                            c28655q = c28655q3;
                        } else {
                            str4 = str3;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                        C0209i c0209i11111118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i11111118, modifierM118962N1111111111111);
                        Modifier modifierM3409f111110 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c11111114;
                        C22994r1 c22994r1M66759a1111111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111111114 = c28655q4.m87165m();
                        Modifier modifierM118962N1111111111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111110);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11111116, c22994r1M66759a1111111119);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111114);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11111118, modifierM118962N1111111111114);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement111110 = new LayoutWeightElement(f13, true);
                            String strM21274h111110 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d111110 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h111110, layoutWeightElement111110, c38072d111110.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111110.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q1111111111111112 = c28655q4;
                            c28655q1111111111111112.m87173q(false);
                            c28655q2 = c28655q1111111111111112;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q1111111111111113 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111111113, 24576, 13);
                            C28655q c28655q1111111111111114 = c28655q1111111111111113;
                            c28655q1111111111111114.m87173q(z16);
                            c28655q3 = c28655q1111111111111114;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f1111113 = 2 * 4;
                        Modifier modifierM3396r111110 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111113, r10);
                        C22994r1 c22994r1M66759a11111111110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111113), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111111115 = c28655q3.m87165m();
                        Modifier modifierM118962N1111111111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111110);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11111116, c22994r1M66759a11111111110);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111111115);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11111118, modifierM118962N1111111111115);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue111110 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource111117 = textResource4;
                            String str111114 = str4;
                            InterfaceC28601c1 interfaceC28601c11111116 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111114, iIntValue111110, interfaceC28601c11111116, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource111117;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str111114;
                            interfaceC28601c1 = interfaceC28601c11111116;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier118;
                        c28655q = c28655q3;
                    } else {
                        c28655q4.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        str2 = str;
                        modifier3 = modifier2;
                        textResource5 = textResource3;
                        textResource6 = textResource4;
                        abstractC27285v1 = abstractC27285v0;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 100663296;
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c11111117 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a116 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111111116 = c28655q4.m87165m();
                    Modifier modifierM118962N1111111111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier119 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i11111119 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i11111119, c23010xM66775a116);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111116);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i111111110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i111111110, modifierM118962N1111111111116);
                        Modifier modifierM3409f111111 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c11111117;
                        C22994r1 c22994r1M66759a11111111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111111117 = c28655q4.m87165m();
                        Modifier modifierM118962N1111111111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111111);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i11111119, c22994r1M66759a11111111111);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111117);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i111111110, modifierM118962N1111111111117);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement111111 = new LayoutWeightElement(f13, true);
                            String strM21274h111111 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d111111 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h111111, layoutWeightElement111111, c38072d111111.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111111.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q1111111111111115 = c28655q4;
                            c28655q1111111111111115.m87173q(false);
                            c28655q2 = c28655q1111111111111115;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q1111111111111116 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111111116, 24576, 13);
                            C28655q c28655q1111111111111117 = c28655q1111111111111116;
                            c28655q1111111111111117.m87173q(z16);
                            c28655q3 = c28655q1111111111111117;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f1111114 = 2 * 4;
                        Modifier modifierM3396r111111 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111114, r10);
                        C22994r1 c22994r1M66759a11111111112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111114), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111111118 = c28655q3.m87165m();
                        Modifier modifierM118962N1111111111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111111);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11111119, c22994r1M66759a11111111112);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111111118);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111111110, modifierM118962N1111111111118);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue111111 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource111118 = textResource4;
                            String str111115 = str4;
                            InterfaceC28601c1 interfaceC28601c11111118 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111115, iIntValue111111, interfaceC28601c11111118, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource111118;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str111115;
                            interfaceC28601c1 = interfaceC28601c11111118;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier119;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i111111111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i111111111, modifierM118962N1111111111116);
                    Modifier modifierM3409f111112 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c11111117;
                    C22994r1 c22994r1M66759a11111111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111111119 = c28655q4.m87165m();
                    Modifier modifierM118962N1111111111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111112);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11111119, c22994r1M66759a11111111113);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111119);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i111111111, modifierM118962N1111111111119);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement111112 = new LayoutWeightElement(f13, true);
                        String strM21274h111112 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d111112 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h111112, layoutWeightElement111112, c38072d111112.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111112.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q1111111111111118 = c28655q4;
                        c28655q1111111111111118.m87173q(false);
                        c28655q2 = c28655q1111111111111118;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q1111111111111119 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111111119, 24576, 13);
                        C28655q c28655q11111111111111110 = c28655q1111111111111119;
                        c28655q11111111111111110.m87173q(z16);
                        c28655q3 = c28655q11111111111111110;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f1111115 = 2 * 4;
                    Modifier modifierM3396r111112 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111115, r10);
                    C22994r1 c22994r1M66759a11111111114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111115), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111111110 = c28655q3.m87165m();
                    Modifier modifierM118962N11111111111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111112);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11111119, c22994r1M66759a11111111114);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111111111110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111111111, modifierM118962N11111111111110);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue111112 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource111119 = textResource4;
                        String str111116 = str4;
                        InterfaceC28601c1 interfaceC28601c11111119 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111116, iIntValue111112, interfaceC28601c11111119, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource111119;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str111116;
                        interfaceC28601c1 = interfaceC28601c11111119;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier119;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 12582912;
            i28 = i14 & 256;
            if (i28 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q4.m87153g(str)) {
                        i29 = 67108864;
                    } else {
                        i29 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i29;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c111111110 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a117 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111111111 = c28655q4.m87165m();
                    Modifier modifierM118962N11111111111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier1110 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i111111112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i111111112, c23010xM66775a117);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111111111);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i111111113 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i111111113, modifierM118962N11111111111111);
                        Modifier modifierM3409f111113 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c111111110;
                        C22994r1 c22994r1M66759a11111111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111111111112 = c28655q4.m87165m();
                        Modifier modifierM118962N11111111111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111113);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i111111112, c22994r1M66759a11111111115);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111111112);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i111111113, modifierM118962N11111111111112);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement111113 = new LayoutWeightElement(f13, true);
                            String strM21274h111113 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d111113 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h111113, layoutWeightElement111113, c38072d111113.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111113.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q11111111111111111 = c28655q4;
                            c28655q11111111111111111.m87173q(false);
                            c28655q2 = c28655q11111111111111111;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q11111111111111112 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111111111112, 24576, 13);
                            C28655q c28655q11111111111111113 = c28655q11111111111111112;
                            c28655q11111111111111113.m87173q(z16);
                            c28655q3 = c28655q11111111111111113;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f1111116 = 2 * 4;
                        Modifier modifierM3396r111113 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111116, r10);
                        C22994r1 c22994r1M66759a11111111116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111116), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111111111113 = c28655q3.m87165m();
                        Modifier modifierM118962N11111111111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111113);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111111112, c22994r1M66759a11111111116);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111111111113);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111111113, modifierM118962N11111111111113);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue111113 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource1111110 = textResource4;
                            String str111117 = str4;
                            InterfaceC28601c1 interfaceC28601c111111111 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111117, iIntValue111113, interfaceC28601c111111111, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource1111110;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str111117;
                            interfaceC28601c1 = interfaceC28601c111111111;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier1110;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i111111114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i111111114, modifierM118962N11111111111111);
                    Modifier modifierM3409f111114 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c111111110;
                    C22994r1 c22994r1M66759a11111111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111111114 = c28655q4.m87165m();
                    Modifier modifierM118962N11111111111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111114);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i111111112, c22994r1M66759a11111111117);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111111114);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i111111114, modifierM118962N11111111111114);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement111114 = new LayoutWeightElement(f13, true);
                        String strM21274h111114 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d111114 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h111114, layoutWeightElement111114, c38072d111114.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111114.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q11111111111111114 = c28655q4;
                        c28655q11111111111111114.m87173q(false);
                        c28655q2 = c28655q11111111111111114;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q11111111111111115 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111111111115, 24576, 13);
                        C28655q c28655q11111111111111116 = c28655q11111111111111115;
                        c28655q11111111111111116.m87173q(z16);
                        c28655q3 = c28655q11111111111111116;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f1111117 = 2 * 4;
                    Modifier modifierM3396r111114 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111117, r10);
                    C22994r1 c22994r1M66759a11111111118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111117), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111111115 = c28655q3.m87165m();
                    Modifier modifierM118962N11111111111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111114);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111111112, c22994r1M66759a11111111118);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111111111115);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111111114, modifierM118962N11111111111115);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue111114 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource1111111 = textResource4;
                        String str111118 = str4;
                        InterfaceC28601c1 interfaceC28601c111111112 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111118, iIntValue111114, interfaceC28601c111111112, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource1111111;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str111118;
                        interfaceC28601c1 = interfaceC28601c111111112;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier1110;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i13 & 805306368) == 0) {
                if (c28655q4.m87157i(selectedNumber)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i15 |= i36;
            }
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                c28655q4.m87140Z();
                i34 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i34 != 0) {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                } else {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                }
                c28655q4.m87175r();
                objM87133R = c28655q4.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = AbstractC28683x.m87272z(num3);
                    c28655q4.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c111111113 = (InterfaceC28601c1) objM87133R;
                jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                C23010x c23010xM66775a118 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111111116 = c28655q4.m87165m();
                Modifier modifierM118962N11111111111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier1111 = modifier2;
                interfaceC4339a4 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i111111115 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i111111115, c23010xM66775a118);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111111116);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    str4 = str3;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i111111116 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i111111116, modifierM118962N11111111111116);
                    Modifier modifierM3409f111115 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c111111113;
                    C22994r1 c22994r1M66759a11111111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111111117 = c28655q4.m87165m();
                    Modifier modifierM118962N11111111111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111115);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i111111115, c22994r1M66759a11111111119);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111111117);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i111111116, modifierM118962N11111111111117);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement111115 = new LayoutWeightElement(f13, true);
                        String strM21274h111115 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d111115 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h111115, layoutWeightElement111115, c38072d111115.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111115.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q11111111111111117 = c28655q4;
                        c28655q11111111111111117.m87173q(false);
                        c28655q2 = c28655q11111111111111117;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q11111111111111118 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111111111118, 24576, 13);
                        C28655q c28655q11111111111111119 = c28655q11111111111111118;
                        c28655q11111111111111119.m87173q(z16);
                        c28655q3 = c28655q11111111111111119;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f1111118 = 2 * 4;
                    Modifier modifierM3396r111115 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111118, r10);
                    C22994r1 c22994r1M66759a111111111110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111118), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111111118 = c28655q3.m87165m();
                    Modifier modifierM118962N11111111111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111115);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111111115, c22994r1M66759a111111111110);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111111111118);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111111116, modifierM118962N11111111111118);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue111115 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource1111112 = textResource4;
                        String str111119 = str4;
                        InterfaceC28601c1 interfaceC28601c111111114 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str111119, iIntValue111115, interfaceC28601c111111114, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource1111112;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str111119;
                        interfaceC28601c1 = interfaceC28601c111111114;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier1111;
                    c28655q = c28655q3;
                } else {
                    str4 = str3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                C0209i c0209i111111117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i111111117, modifierM118962N11111111111116);
                Modifier modifierM3409f111116 = AbstractC1102d.m3409f(1.0f, c2314t);
                interfaceC28601c1 = interfaceC28601c111111113;
                C22994r1 c22994r1M66759a111111111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                i35 = i15;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111111119 = c28655q4.m87165m();
                Modifier modifierM118962N11111111111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111116);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i111111115, c22994r1M66759a111111111111);
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m11111111111119);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i111111117, modifierM118962N11111111111119);
                if (textResource7 != null) {
                    c28655q4.m87150e0(59283326);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement111116 = new LayoutWeightElement(f13, true);
                    String strM21274h111116 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                    C38072d c38072d111116 = C38072d.f163053a;
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    AbstractC30795n.m94707h(strM21274h111116, layoutWeightElement111116, c38072d111116.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111116.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                    C28655q c28655q111111111111111110 = c28655q4;
                    c28655q111111111111111110.m87173q(false);
                    c28655q2 = c28655q111111111111111110;
                } else {
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    c28655q4.m87150e0(59526893);
                    c28655q4.m87173q(false);
                }
                if (textResource4 != null) {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(59572742);
                    if (interfaceC4339a3 != null) {
                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j13 = jM125316b;
                    }
                    C28655q c28655q111111111111111111 = c28655q2;
                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111111111111, 24576, 13);
                    C28655q c28655q111111111111111112 = c28655q111111111111111111;
                    c28655q111111111111111112.m87173q(z16);
                    c28655q3 = c28655q111111111111111112;
                } else {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(60009997);
                    c28655q2.m87173q(z16);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(r10);
                float f1111119 = 2 * 4;
                Modifier modifierM3396r111116 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111119, r10);
                C22994r1 c22994r1M66759a111111111112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111119), C2299e.f9107J, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111111111110 = c28655q3.m87165m();
                Modifier modifierM118962N111111111111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111116);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a4);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i111111115, c22994r1M66759a111111111112);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111111111110);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i111111117, modifierM118962N111111111111110);
                c28655q3.m87150e0(-177024899);
                it = listOfNumbers.iterator();
                while (it.hasNext()) {
                    int iIntValue111116 = ((Number) it.next()).intValue();
                    if (interfaceC4339a3 != null) {
                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j7 = jM125316b;
                    }
                    TextResource textResource1111113 = textResource4;
                    String str1111110 = str4;
                    InterfaceC28601c1 interfaceC28601c111111115 = interfaceC28601c1;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111110, iIntValue111116, interfaceC28601c111111115, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                    textResource4 = textResource1111113;
                    z16 = z16;
                    z15 = z15;
                    cVar = cVar;
                    str4 = str1111110;
                    interfaceC28601c1 = interfaceC28601c111111115;
                }
                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                textResource5 = textResource7;
                textResource6 = textResource4;
                z13 = z15;
                abstractC27285v1 = cVar;
                str2 = str4;
                num2 = num3;
                interfaceC4339a2 = interfaceC4339a3;
                modifier3 = modifier1111;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                str2 = str;
                modifier3 = modifier2;
                textResource5 = textResource3;
                textResource6 = textResource4;
                abstractC27285v1 = abstractC27285v0;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
            }
        }
        i15 |= 24576;
        num2 = num;
        i24 = i14 & 32;
        if (i24 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
        } else {
            z13 = z4;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87155h(z13)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
        }
        if ((i13 & 1572864) == 0) {
            if ((i14 & 64) != 0) {
                i37 = 524288;
            } else {
                if ((i13 & 2097152) == 0) {
                    zM87157i = c28655q4.m87153g(abstractC27285v0);
                } else {
                    zM87157i = c28655q4.m87157i(abstractC27285v0);
                }
                if (zM87157i) {
                    i37 = 1048576;
                } else {
                    i37 = 524288;
                }
            }
            i15 |= i37;
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            if ((i13 & 12582912) == 0) {
                if (c28655q4.m87157i(interfaceC4339a)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i14 & 256;
            if (i28 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q4.m87153g(str)) {
                        i29 = 67108864;
                    } else {
                        i29 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i29;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87157i(selectedNumber)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i15 |= i36;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i34 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    } else {
                        if (i39 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i44 != 0) {
                            textResource3 = null;
                        }
                        if (i16 != 0) {
                            textResource4 = null;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 64) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                            i15 &= -3670017;
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        num3 = num2;
                        z15 = z13;
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource7 = textResource3;
                    }
                    c28655q4.m87175r();
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC28683x.m87272z(num3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c111111116 = (InterfaceC28601c1) objM87133R;
                    jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                    C23010x c23010xM66775a119 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111111111 = c28655q4.m87165m();
                    Modifier modifierM118962N111111111111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier1112 = modifier2;
                    interfaceC4339a4 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    C0209i c0209i111111118 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i111111118, c23010xM66775a119);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111111111);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        str4 = str3;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i111111119 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i111111119, modifierM118962N111111111111111);
                        Modifier modifierM3409f111117 = AbstractC1102d.m3409f(1.0f, c2314t);
                        interfaceC28601c1 = interfaceC28601c111111116;
                        C22994r1 c22994r1M66759a111111111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                        i35 = i15;
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111111111112 = c28655q4.m87165m();
                        Modifier modifierM118962N111111111111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111117);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i111111118, c22994r1M66759a111111111113);
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111111112);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i111111119, modifierM118962N111111111111112);
                        if (textResource7 != null) {
                            c28655q4.m87150e0(59283326);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement111117 = new LayoutWeightElement(f13, true);
                            String strM21274h111117 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                            C38072d c38072d111117 = C38072d.f163053a;
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            AbstractC30795n.m94707h(strM21274h111117, layoutWeightElement111117, c38072d111117.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111117.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                            C28655q c28655q111111111111111113 = c28655q4;
                            c28655q111111111111111113.m87173q(false);
                            c28655q2 = c28655q111111111111111113;
                        } else {
                            c0209i3 = c0209i;
                            r10 = 1;
                            z16 = false;
                            c28655q4.m87150e0(59526893);
                            c28655q4.m87173q(false);
                        }
                        if (textResource4 != null) {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(59572742);
                            if (interfaceC4339a3 != null) {
                                j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j13 = jM125316b;
                            }
                            C28655q c28655q111111111111111114 = c28655q2;
                            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111111111114, 24576, 13);
                            C28655q c28655q111111111111111115 = c28655q111111111111111114;
                            c28655q111111111111111115.m87173q(z16);
                            c28655q3 = c28655q111111111111111115;
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(60009997);
                            c28655q2.m87173q(z16);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        float f11111110 = 2 * 4;
                        Modifier modifierM3396r111117 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111110, r10);
                        C22994r1 c22994r1M66759a111111111114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11111110), C2299e.f9107J, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111111111113 = c28655q3.m87165m();
                        Modifier modifierM118962N111111111111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111117);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a4);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111111118, c22994r1M66759a111111111114);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111111111113);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111111119, modifierM118962N111111111111113);
                        c28655q3.m87150e0(-177024899);
                        it = listOfNumbers.iterator();
                        while (it.hasNext()) {
                            int iIntValue111117 = ((Number) it.next()).intValue();
                            if (interfaceC4339a3 != null) {
                                j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                            } else {
                                j7 = jM125316b;
                            }
                            TextResource textResource1111114 = textResource4;
                            String str1111111 = str4;
                            InterfaceC28601c1 interfaceC28601c111111117 = interfaceC28601c1;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111111, iIntValue111117, interfaceC28601c111111117, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                            textResource4 = textResource1111114;
                            z16 = z16;
                            z15 = z15;
                            cVar = cVar;
                            str4 = str1111111;
                            interfaceC28601c1 = interfaceC28601c111111117;
                        }
                        AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                        textResource5 = textResource7;
                        textResource6 = textResource4;
                        z13 = z15;
                        abstractC27285v1 = cVar;
                        str2 = str4;
                        num2 = num3;
                        interfaceC4339a2 = interfaceC4339a3;
                        modifier3 = modifier1112;
                        c28655q = c28655q3;
                    } else {
                        str4 = str3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                    C0209i c0209i1111111110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111110, modifierM118962N111111111111111);
                    Modifier modifierM3409f111118 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c111111116;
                    C22994r1 c22994r1M66759a111111111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111111114 = c28655q4.m87165m();
                    Modifier modifierM118962N111111111111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111118);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i111111118, c22994r1M66759a111111111115);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111111114);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111110, modifierM118962N111111111111114);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement111118 = new LayoutWeightElement(f13, true);
                        String strM21274h111118 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d111118 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h111118, layoutWeightElement111118, c38072d111118.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111118.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q111111111111111116 = c28655q4;
                        c28655q111111111111111116.m87173q(false);
                        c28655q2 = c28655q111111111111111116;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q111111111111111117 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q111111111111111117, 24576, 13);
                        C28655q c28655q111111111111111118 = c28655q111111111111111117;
                        c28655q111111111111111118.m87173q(z16);
                        c28655q3 = c28655q111111111111111118;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f11111111 = 2 * 4;
                    Modifier modifierM3396r111118 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111111, r10);
                    C22994r1 c22994r1M66759a111111111116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11111111), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111111115 = c28655q3.m87165m();
                    Modifier modifierM118962N111111111111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111118);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111111118, c22994r1M66759a111111111116);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111111111115);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111111110, modifierM118962N111111111111115);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue111118 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource1111115 = textResource4;
                        String str1111112 = str4;
                        InterfaceC28601c1 interfaceC28601c111111118 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111112, iIntValue111118, interfaceC28601c111111118, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource1111115;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str1111112;
                        interfaceC28601c1 = interfaceC28601c111111118;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier1112;
                    c28655q = c28655q3;
                } else {
                    c28655q4.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    str2 = str;
                    modifier3 = modifier2;
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    abstractC27285v1 = abstractC27285v0;
                    c28655q = c28655q4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
                }
            }
            i15 |= 100663296;
            if ((i13 & 805306368) == 0) {
                if (c28655q4.m87157i(selectedNumber)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i15 |= i36;
            }
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                c28655q4.m87140Z();
                i34 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i34 != 0) {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                } else {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                }
                c28655q4.m87175r();
                objM87133R = c28655q4.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = AbstractC28683x.m87272z(num3);
                    c28655q4.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c111111119 = (InterfaceC28601c1) objM87133R;
                jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                C23010x c23010xM66775a1110 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111111111116 = c28655q4.m87165m();
                Modifier modifierM118962N111111111111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier1113 = modifier2;
                interfaceC4339a4 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i1111111111 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i1111111111, c23010xM66775a1110);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111111116);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    str4 = str3;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1111111112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111112, modifierM118962N111111111111116);
                    Modifier modifierM3409f111119 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c111111119;
                    C22994r1 c22994r1M66759a111111111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111111117 = c28655q4.m87165m();
                    Modifier modifierM118962N111111111111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f111119);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111111, c22994r1M66759a111111111117);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111111117);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111112, modifierM118962N111111111111117);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement111119 = new LayoutWeightElement(f13, true);
                        String strM21274h111119 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d111119 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h111119, layoutWeightElement111119, c38072d111119.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111119.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q111111111111111119 = c28655q4;
                        c28655q111111111111111119.m87173q(false);
                        c28655q2 = c28655q111111111111111119;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q1111111111111111110 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111111111110, 24576, 13);
                        C28655q c28655q1111111111111111111 = c28655q1111111111111111110;
                        c28655q1111111111111111111.m87173q(z16);
                        c28655q3 = c28655q1111111111111111111;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f11111112 = 2 * 4;
                    Modifier modifierM3396r111119 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111112, r10);
                    C22994r1 c22994r1M66759a111111111118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11111112), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111111118 = c28655q3.m87165m();
                    Modifier modifierM118962N111111111111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r111119);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111111111, c22994r1M66759a111111111118);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m111111111111118);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111111112, modifierM118962N111111111111118);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue111119 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource1111116 = textResource4;
                        String str1111113 = str4;
                        InterfaceC28601c1 interfaceC28601c1111111110 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111113, iIntValue111119, interfaceC28601c1111111110, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource1111116;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str1111113;
                        interfaceC28601c1 = interfaceC28601c1111111110;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier1113;
                    c28655q = c28655q3;
                } else {
                    str4 = str3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                C0209i c0209i1111111113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i1111111113, modifierM118962N111111111111116);
                Modifier modifierM3409f1111110 = AbstractC1102d.m3409f(1.0f, c2314t);
                interfaceC28601c1 = interfaceC28601c111111119;
                C22994r1 c22994r1M66759a111111111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                i35 = i15;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111111111119 = c28655q4.m87165m();
                Modifier modifierM118962N111111111111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1111110);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i1111111111, c22994r1M66759a111111111119);
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m111111111111119);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i1111111113, modifierM118962N111111111111119);
                if (textResource7 != null) {
                    c28655q4.m87150e0(59283326);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement1111110 = new LayoutWeightElement(f13, true);
                    String strM21274h1111110 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                    C38072d c38072d1111110 = C38072d.f163053a;
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    AbstractC30795n.m94707h(strM21274h1111110, layoutWeightElement1111110, c38072d1111110.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1111110.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                    C28655q c28655q1111111111111111112 = c28655q4;
                    c28655q1111111111111111112.m87173q(false);
                    c28655q2 = c28655q1111111111111111112;
                } else {
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    c28655q4.m87150e0(59526893);
                    c28655q4.m87173q(false);
                }
                if (textResource4 != null) {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(59572742);
                    if (interfaceC4339a3 != null) {
                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j13 = jM125316b;
                    }
                    C28655q c28655q1111111111111111113 = c28655q2;
                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111111111113, 24576, 13);
                    C28655q c28655q1111111111111111114 = c28655q1111111111111111113;
                    c28655q1111111111111111114.m87173q(z16);
                    c28655q3 = c28655q1111111111111111114;
                } else {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(60009997);
                    c28655q2.m87173q(z16);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(r10);
                float f11111113 = 2 * 4;
                Modifier modifierM3396r1111110 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111113, r10);
                C22994r1 c22994r1M66759a1111111111110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11111113), C2299e.f9107J, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111111111110 = c28655q3.m87165m();
                Modifier modifierM118962N1111111111111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1111110);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a4);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1111111111, c22994r1M66759a1111111111110);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111111111110);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1111111113, modifierM118962N1111111111111110);
                c28655q3.m87150e0(-177024899);
                it = listOfNumbers.iterator();
                while (it.hasNext()) {
                    int iIntValue1111110 = ((Number) it.next()).intValue();
                    if (interfaceC4339a3 != null) {
                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j7 = jM125316b;
                    }
                    TextResource textResource1111117 = textResource4;
                    String str1111114 = str4;
                    InterfaceC28601c1 interfaceC28601c1111111111 = interfaceC28601c1;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111114, iIntValue1111110, interfaceC28601c1111111111, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                    textResource4 = textResource1111117;
                    z16 = z16;
                    z15 = z15;
                    cVar = cVar;
                    str4 = str1111114;
                    interfaceC28601c1 = interfaceC28601c1111111111;
                }
                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                textResource5 = textResource7;
                textResource6 = textResource4;
                z13 = z15;
                abstractC27285v1 = cVar;
                str2 = str4;
                num2 = num3;
                interfaceC4339a2 = interfaceC4339a3;
                modifier3 = modifier1113;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                str2 = str;
                modifier3 = modifier2;
                textResource5 = textResource3;
                textResource6 = textResource4;
                abstractC27285v1 = abstractC27285v0;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
            }
        }
        i15 |= 12582912;
        i28 = i14 & 256;
        if (i28 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q4.m87153g(str)) {
                    i29 = 67108864;
                } else {
                    i29 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i29;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q4.m87157i(selectedNumber)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i15 |= i36;
            }
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                c28655q4.m87140Z();
                i34 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i34 != 0) {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                } else {
                    if (i39 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i44 != 0) {
                        textResource3 = null;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 64) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                        i15 &= -3670017;
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    num3 = num2;
                    z15 = z13;
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource7 = textResource3;
                }
                c28655q4.m87175r();
                objM87133R = c28655q4.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = AbstractC28683x.m87272z(num3);
                    c28655q4.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c1111111112 = (InterfaceC28601c1) objM87133R;
                jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
                C23010x c23010xM66775a1111 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111111111111 = c28655q4.m87165m();
                Modifier modifierM118962N1111111111111111 = AbstractC37056f.m118962N(c28655q4, modifier2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier1114 = modifier2;
                interfaceC4339a4 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i1111111114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i1111111114, c23010xM66775a1111);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111111111);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    str4 = str3;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1111111115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111115, modifierM118962N1111111111111111);
                    Modifier modifierM3409f1111111 = AbstractC1102d.m3409f(1.0f, c2314t);
                    interfaceC28601c1 = interfaceC28601c1111111112;
                    C22994r1 c22994r1M66759a1111111111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    i35 = i15;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111111111112 = c28655q4.m87165m();
                    Modifier modifierM118962N1111111111111112 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1111111);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111114, c22994r1M66759a1111111111111);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111111112);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i1111111115, modifierM118962N1111111111111112);
                    if (textResource7 != null) {
                        c28655q4.m87150e0(59283326);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement1111111 = new LayoutWeightElement(f13, true);
                        String strM21274h1111111 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                        C38072d c38072d1111111 = C38072d.f163053a;
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        AbstractC30795n.m94707h(strM21274h1111111, layoutWeightElement1111111, c38072d1111111.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1111111.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                        C28655q c28655q1111111111111111115 = c28655q4;
                        c28655q1111111111111111115.m87173q(false);
                        c28655q2 = c28655q1111111111111111115;
                    } else {
                        c0209i3 = c0209i;
                        r10 = 1;
                        z16 = false;
                        c28655q4.m87150e0(59526893);
                        c28655q4.m87173q(false);
                    }
                    if (textResource4 != null) {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(59572742);
                        if (interfaceC4339a3 != null) {
                            j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j13 = jM125316b;
                        }
                        C28655q c28655q1111111111111111116 = c28655q2;
                        AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111111111116, 24576, 13);
                        C28655q c28655q1111111111111111117 = c28655q1111111111111111116;
                        c28655q1111111111111111117.m87173q(z16);
                        c28655q3 = c28655q1111111111111111117;
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(60009997);
                        c28655q2.m87173q(z16);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    float f11111114 = 2 * 4;
                    Modifier modifierM3396r1111111 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111114, r10);
                    C22994r1 c22994r1M66759a1111111111112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11111114), C2299e.f9107J, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111111111113 = c28655q3.m87165m();
                    Modifier modifierM118962N1111111111111113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1111111);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a4);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111111114, c22994r1M66759a1111111111112);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111111111113);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111111115, modifierM118962N1111111111111113);
                    c28655q3.m87150e0(-177024899);
                    it = listOfNumbers.iterator();
                    while (it.hasNext()) {
                        int iIntValue1111111 = ((Number) it.next()).intValue();
                        if (interfaceC4339a3 != null) {
                            j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                        } else {
                            j7 = jM125316b;
                        }
                        TextResource textResource1111118 = textResource4;
                        String str1111115 = str4;
                        InterfaceC28601c1 interfaceC28601c1111111113 = interfaceC28601c1;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111115, iIntValue1111111, interfaceC28601c1111111113, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                        textResource4 = textResource1111118;
                        z16 = z16;
                        z15 = z15;
                        cVar = cVar;
                        str4 = str1111115;
                        interfaceC28601c1 = interfaceC28601c1111111113;
                    }
                    AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                    textResource5 = textResource7;
                    textResource6 = textResource4;
                    z13 = z15;
                    abstractC27285v1 = cVar;
                    str2 = str4;
                    num2 = num3;
                    interfaceC4339a2 = interfaceC4339a3;
                    modifier3 = modifier1114;
                    c28655q = c28655q3;
                } else {
                    str4 = str3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                C0209i c0209i1111111116 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i1111111116, modifierM118962N1111111111111111);
                Modifier modifierM3409f1111112 = AbstractC1102d.m3409f(1.0f, c2314t);
                interfaceC28601c1 = interfaceC28601c1111111112;
                C22994r1 c22994r1M66759a1111111111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                i35 = i15;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111111111114 = c28655q4.m87165m();
                Modifier modifierM118962N1111111111111114 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1111112);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i1111111114, c22994r1M66759a1111111111113);
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111111114);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i1111111116, modifierM118962N1111111111111114);
                if (textResource7 != null) {
                    c28655q4.m87150e0(59283326);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement1111112 = new LayoutWeightElement(f13, true);
                    String strM21274h1111112 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                    C38072d c38072d1111112 = C38072d.f163053a;
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    AbstractC30795n.m94707h(strM21274h1111112, layoutWeightElement1111112, c38072d1111112.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1111112.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                    C28655q c28655q1111111111111111118 = c28655q4;
                    c28655q1111111111111111118.m87173q(false);
                    c28655q2 = c28655q1111111111111111118;
                } else {
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    c28655q4.m87150e0(59526893);
                    c28655q4.m87173q(false);
                }
                if (textResource4 != null) {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(59572742);
                    if (interfaceC4339a3 != null) {
                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j13 = jM125316b;
                    }
                    C28655q c28655q1111111111111111119 = c28655q2;
                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q1111111111111111119, 24576, 13);
                    C28655q c28655q11111111111111111110 = c28655q1111111111111111119;
                    c28655q11111111111111111110.m87173q(z16);
                    c28655q3 = c28655q11111111111111111110;
                } else {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(60009997);
                    c28655q2.m87173q(z16);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(r10);
                float f11111115 = 2 * 4;
                Modifier modifierM3396r1111112 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111115, r10);
                C22994r1 c22994r1M66759a1111111111114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11111115), C2299e.f9107J, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111111111115 = c28655q3.m87165m();
                Modifier modifierM118962N1111111111111115 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1111112);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a4);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1111111114, c22994r1M66759a1111111111114);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111111111115);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1111111116, modifierM118962N1111111111111115);
                c28655q3.m87150e0(-177024899);
                it = listOfNumbers.iterator();
                while (it.hasNext()) {
                    int iIntValue1111112 = ((Number) it.next()).intValue();
                    if (interfaceC4339a3 != null) {
                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j7 = jM125316b;
                    }
                    TextResource textResource1111119 = textResource4;
                    String str1111116 = str4;
                    InterfaceC28601c1 interfaceC28601c1111111114 = interfaceC28601c1;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111116, iIntValue1111112, interfaceC28601c1111111114, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                    textResource4 = textResource1111119;
                    z16 = z16;
                    z15 = z15;
                    cVar = cVar;
                    str4 = str1111116;
                    interfaceC28601c1 = interfaceC28601c1111111114;
                }
                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                textResource5 = textResource7;
                textResource6 = textResource4;
                z13 = z15;
                abstractC27285v1 = cVar;
                str2 = str4;
                num2 = num3;
                interfaceC4339a2 = interfaceC4339a3;
                modifier3 = modifier1114;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                str2 = str;
                modifier3 = modifier2;
                textResource5 = textResource3;
                textResource6 = textResource4;
                abstractC27285v1 = abstractC27285v0;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
            }
        }
        i15 |= 100663296;
        if ((i13 & 805306368) == 0) {
            if (c28655q4.m87157i(selectedNumber)) {
                i36 = 536870912;
            } else {
                i36 = 268435456;
            }
            i15 |= i36;
        }
        if ((i15 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z14)) {
            c28655q4.m87140Z();
            i34 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i34 != 0) {
                if (i39 != 0) {
                    modifier2 = c2314t;
                }
                if (i44 != 0) {
                    textResource3 = null;
                }
                if (i16 != 0) {
                    textResource4 = null;
                }
                if (i18 != 0) {
                    num2 = null;
                }
                if (i24 != 0) {
                    z13 = true;
                }
                if ((i14 & 64) != 0) {
                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                    i15 &= -3670017;
                } else {
                    cVar = abstractC27285v0;
                }
                if (i26 != 0) {
                    interfaceC4339a3 = null;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                num3 = num2;
                z15 = z13;
                if (i28 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                textResource7 = textResource3;
            } else {
                if (i39 != 0) {
                    modifier2 = c2314t;
                }
                if (i44 != 0) {
                    textResource3 = null;
                }
                if (i16 != 0) {
                    textResource4 = null;
                }
                if (i18 != 0) {
                    num2 = null;
                }
                if (i24 != 0) {
                    z13 = true;
                }
                if ((i14 & 64) != 0) {
                    cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
                    i15 &= -3670017;
                } else {
                    cVar = abstractC27285v0;
                }
                if (i26 != 0) {
                    interfaceC4339a3 = null;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                num3 = num2;
                z15 = z13;
                if (i28 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                textResource7 = textResource3;
            }
            c28655q4.m87175r();
            objM87133R = c28655q4.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(num3);
                c28655q4.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1111111115 = (InterfaceC28601c1) objM87133R;
            jM125316b = C38070b.f163049a.m121943a(c28655q4, 6).getActive();
            C23010x c23010xM66775a1112 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111111111111116 = c28655q4.m87165m();
            Modifier modifierM118962N1111111111111116 = AbstractC37056f.m118962N(c28655q4, modifier2);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier1115 = modifier2;
            interfaceC4339a4 = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a4);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i1111111117 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i1111111117, c23010xM66775a1112);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111111116);
            c0209i2 = C0217k.f732j;
            if (c28655q4.f115903S) {
                str4 = str3;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1111111118 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i1111111118, modifierM118962N1111111111111116);
                Modifier modifierM3409f1111113 = AbstractC1102d.m3409f(1.0f, c2314t);
                interfaceC28601c1 = interfaceC28601c1111111115;
                C22994r1 c22994r1M66759a1111111111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                i35 = i15;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111111111117 = c28655q4.m87165m();
                Modifier modifierM118962N1111111111111117 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1111113);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i1111111117, c22994r1M66759a1111111111115);
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111111117);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i1111111118, modifierM118962N1111111111111117);
                if (textResource7 != null) {
                    c28655q4.m87150e0(59283326);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement1111113 = new LayoutWeightElement(f13, true);
                    String strM21274h1111113 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                    C38072d c38072d1111113 = C38072d.f163053a;
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    AbstractC30795n.m94707h(strM21274h1111113, layoutWeightElement1111113, c38072d1111113.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1111113.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                    C28655q c28655q11111111111111111111 = c28655q4;
                    c28655q11111111111111111111.m87173q(false);
                    c28655q2 = c28655q11111111111111111111;
                } else {
                    c0209i3 = c0209i;
                    r10 = 1;
                    z16 = false;
                    c28655q4.m87150e0(59526893);
                    c28655q4.m87173q(false);
                }
                if (textResource4 != null) {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(59572742);
                    if (interfaceC4339a3 != null) {
                        j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j13 = jM125316b;
                    }
                    C28655q c28655q11111111111111111112 = c28655q2;
                    AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111111111111112, 24576, 13);
                    C28655q c28655q11111111111111111113 = c28655q11111111111111111112;
                    c28655q11111111111111111113.m87173q(z16);
                    c28655q3 = c28655q11111111111111111113;
                } else {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(60009997);
                    c28655q2.m87173q(z16);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(r10);
                float f11111116 = 2 * 4;
                Modifier modifierM3396r1111113 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111116, r10);
                C22994r1 c22994r1M66759a1111111111116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11111116), C2299e.f9107J, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111111111118 = c28655q3.m87165m();
                Modifier modifierM118962N1111111111111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1111113);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a4);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1111111117, c22994r1M66759a1111111111116);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m1111111111111118);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1111111118, modifierM118962N1111111111111118);
                c28655q3.m87150e0(-177024899);
                it = listOfNumbers.iterator();
                while (it.hasNext()) {
                    int iIntValue1111113 = ((Number) it.next()).intValue();
                    if (interfaceC4339a3 != null) {
                        j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                    } else {
                        j7 = jM125316b;
                    }
                    TextResource textResource11111110 = textResource4;
                    String str1111117 = str4;
                    InterfaceC28601c1 interfaceC28601c1111111116 = interfaceC28601c1;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111117, iIntValue1111113, interfaceC28601c1111111116, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                    textResource4 = textResource11111110;
                    z16 = z16;
                    z15 = z15;
                    cVar = cVar;
                    str4 = str1111117;
                    interfaceC28601c1 = interfaceC28601c1111111116;
                }
                AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
                textResource5 = textResource7;
                textResource6 = textResource4;
                z13 = z15;
                abstractC27285v1 = cVar;
                str2 = str4;
                num2 = num3;
                interfaceC4339a2 = interfaceC4339a3;
                modifier3 = modifier1115;
                c28655q = c28655q3;
            } else {
                str4 = str3;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
            C0209i c0209i1111111119 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i1111111119, modifierM118962N1111111111111116);
            Modifier modifierM3409f1111114 = AbstractC1102d.m3409f(1.0f, c2314t);
            interfaceC28601c1 = interfaceC28601c1111111115;
            C22994r1 c22994r1M66759a1111111111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
            i35 = i15;
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111111111111119 = c28655q4.m87165m();
            Modifier modifierM118962N1111111111111119 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1111114);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a4);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i1111111117, c22994r1M66759a1111111111117);
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m1111111111111119);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i1111111119, modifierM118962N1111111111111119);
            if (textResource7 != null) {
                c28655q4.m87150e0(59283326);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement1111114 = new LayoutWeightElement(f13, true);
                String strM21274h1111114 = AbstractC8693b.m21274h(textResource7, c28655q4, (i35 >> 3) & 14);
                C38072d c38072d1111114 = C38072d.f163053a;
                c0209i3 = c0209i;
                r10 = 1;
                z16 = false;
                AbstractC30795n.m94707h(strM21274h1111114, layoutWeightElement1111114, c38072d1111114.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1111114.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196600);
                C28655q c28655q11111111111111111114 = c28655q4;
                c28655q11111111111111111114.m87173q(false);
                c28655q2 = c28655q11111111111111111114;
            } else {
                c0209i3 = c0209i;
                r10 = 1;
                z16 = false;
                c28655q4.m87150e0(59526893);
                c28655q4.m87173q(false);
            }
            if (textResource4 != null) {
                c28655q2 = c28655q4;
                c28655q2.m87150e0(59572742);
                if (interfaceC4339a3 != null) {
                    j13 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                } else {
                    j13 = jM125316b;
                }
                C28655q c28655q11111111111111111115 = c28655q2;
                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1638676498, c28655q2, new C21882m(textResource4, 5)), c28655q11111111111111111115, 24576, 13);
                C28655q c28655q11111111111111111116 = c28655q11111111111111111115;
                c28655q11111111111111111116.m87173q(z16);
                c28655q3 = c28655q11111111111111111116;
            } else {
                c28655q2 = c28655q4;
                c28655q2.m87150e0(60009997);
                c28655q2.m87173q(z16);
                c28655q3 = c28655q2;
            }
            c28655q3.m87173q(r10);
            float f11111117 = 2 * 4;
            Modifier modifierM3396r1111114 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11111117, r10);
            C22994r1 c22994r1M66759a1111111111118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11111117), C2299e.f9107J, c28655q3, 6);
            iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11111111111111110 = c28655q3.m87165m();
            Modifier modifierM118962N11111111111111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r1111114);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a4);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i1111111117, c22994r1M66759a1111111111118);
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m11111111111111110);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i1111111119, modifierM118962N11111111111111110);
            c28655q3.m87150e0(-177024899);
            it = listOfNumbers.iterator();
            while (it.hasNext()) {
                int iIntValue1111114 = ((Number) it.next()).intValue();
                if (interfaceC4339a3 != null) {
                    j7 = ((C17919x) interfaceC4339a3.invoke()).f69639a;
                } else {
                    j7 = jM125316b;
                }
                TextResource textResource11111111 = textResource4;
                String str1111118 = str4;
                InterfaceC28601c1 interfaceC28601c1111111117 = interfaceC28601c1;
                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1424523371, c28655q3, new C2549j2(str1111118, iIntValue1111114, interfaceC28601c1111111117, cVar, z15, selectedNumber, 22)), c28655q3, 24576, 13);
                textResource4 = textResource11111111;
                z16 = z16;
                z15 = z15;
                cVar = cVar;
                str4 = str1111118;
                interfaceC28601c1 = interfaceC28601c1111111117;
            }
            AbstractC25012a.m73392y(c28655q3, z16, r10, r10);
            textResource5 = textResource7;
            textResource6 = textResource4;
            z13 = z15;
            abstractC27285v1 = cVar;
            str2 = str4;
            num2 = num3;
            interfaceC4339a2 = interfaceC4339a3;
            modifier3 = modifier1115;
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            interfaceC4339a2 = interfaceC4339a;
            str2 = str;
            modifier3 = modifier2;
            textResource5 = textResource3;
            textResource6 = textResource4;
            abstractC27285v1 = abstractC27285v0;
            c28655q = c28655q4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21203f(modifier3, textResource5, textResource6, listOfNumbers, num2, z13, abstractC27285v1, interfaceC4339a2, str2, selectedNumber, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m128283f(InterfaceC22997s1 interfaceC22997s1, TextResource textResource, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, 0), interfaceC22997s1.mo66772c(C2314t.f9131w, true, 1.0f), C38070b.f163049a.m121943a(c28655q, 6).getActive(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196088);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m128284g(InterfaceC22997s1 interfaceC22997s1, String str, int i13, InterfaceC28601c1 interfaceC28601c1, AbstractC27285v0 abstractC27285v0, boolean z4, Function1 function1, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM53364e = AbstractC18489d0.m53364e(interfaceC22997s1.mo66772c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), true, 1.0f), 2, 4);
            String strM73373f = str != null ? AbstractC25012a.m73373f(i13, str, "_days_") : null;
            String strValueOf = String.valueOf(i13);
            Integer num = (Integer) interfaceC28601c1.getValue();
            boolean z13 = num != null && i13 == num.intValue();
            boolean zM87149e = c28655q.m87149e(i13) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87149e || objM87133R == C28635l.f115821a) {
                objM87133R = new C33750a(interfaceC28601c1, i13, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27283u0.m82318q(modifierM53364e, strValueOf, null, null, abstractC27285v0, z13, z4, 0.0f, strM73373f, (InterfaceC4339a) objM87133R, c28655q, 0, 140);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m128285h(InterfaceC28601c1 interfaceC28601c1, int i13, Function1 function1) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m128286i(Modifier modifier, TextResource textResource, TextResource textResource2, List list, Integer num, boolean z4, AbstractC27285v0 abstractC27285v0, InterfaceC4339a interfaceC4339a, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128282e(modifier, textResource, textResource2, list, num, z4, abstractC27285v0, interfaceC4339a, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

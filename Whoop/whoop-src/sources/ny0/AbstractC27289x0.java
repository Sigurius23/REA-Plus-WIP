package ny0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15680h;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26957l;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ny0.x0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ay\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "subtitle", "description", "Landroidx/compose/ui/Modifier;", "modifier", "Li2/x;", "selectedBackgroundColor", "", "initialToggle", "enabled", "Lny0/y0;", "type", "fillWidthOfContainer", "Lkotlin/Function1;", "Ll83/a0;", "onToggle", "c", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27289x0 {
    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0173  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177  */
    /* JADX WARN: Code duplicated, block: B:125:0x0180  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:130:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0194  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01af  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:154:0x0210  */
    /* JADX WARN: Code duplicated, block: B:157:0x0220  */
    /* JADX WARN: Code duplicated, block: B:158:0x0222  */
    /* JADX WARN: Code duplicated, block: B:160:0x0229  */
    /* JADX WARN: Code duplicated, block: B:161:0x0230  */
    /* JADX WARN: Code duplicated, block: B:164:0x023b  */
    /* JADX WARN: Code duplicated, block: B:165:0x023d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0244  */
    /* JADX WARN: Code duplicated, block: B:170:0x0248  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:179:0x02da  */
    /* JADX WARN: Code duplicated, block: B:182:0x0301  */
    /* JADX WARN: Code duplicated, block: B:183:0x0305  */
    /* JADX WARN: Code duplicated, block: B:186:0x0312  */
    /* JADX WARN: Code duplicated, block: B:188:0x0320  */
    /* JADX WARN: Code duplicated, block: B:191:0x0365  */
    /* JADX WARN: Code duplicated, block: B:193:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:198:0x0417  */
    /* JADX WARN: Code duplicated, block: B:200:0x0431  */
    /* JADX WARN: Code duplicated, block: B:203:0x0444  */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x011d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x0126  */
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
    /* JADX INFO: renamed from: c */
    public static final void m82331c(final TextResource title, TextResource textResource, TextResource textResource2, Modifier modifier, long j7, boolean z4, boolean z13, final EnumC27291y0 type, boolean z14, final Function1 onToggle, Composer composer, final int i13, final int i14) {
        int i15;
        TextResource textResourceM21267a;
        Modifier modifier2;
        long brandWhite;
        int i16;
        boolean z15;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z16;
        final TextResource textResourceM21267a2;
        final boolean z17;
        final TextResource textResource3;
        final Modifier modifier3;
        final boolean z18;
        final long j13;
        final boolean z19;
        C28677v1 c28677v1M87180u;
        int i27;
        C2314t c2314t;
        int i28;
        boolean z24;
        int i29;
        long j14;
        boolean z25;
        boolean z26;
        int i34;
        long jM95628d;
        long jM95624D;
        long jM53358D;
        long j15;
        Modifier modifierM3428y;
        Modifier modifierM3409f;
        boolean z27;
        Object objM87133R;
        float f13;
        int i35;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C39111m c39111m;
        long j16;
        int i36;
        int i37;
        int i38;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(792375140);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= ((i14 & 2) == 0 && c28655q.m87153g(textResource)) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                textResourceM21267a = textResource2;
                int i39 = c28655q.m87153g(textResourceM21267a) ? 256 : 128;
                i15 |= i39;
            } else {
                textResourceM21267a = textResource2;
            }
            i15 |= i39;
        } else {
            textResourceM21267a = textResource2;
        }
        int i44 = i14 & 8;
        if (i44 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                brandWhite = j7;
                if ((i14 & 16) == 0 || !c28655q.m87151f(brandWhite)) {
                    i38 = DfuBaseService.ERROR_REMOTE_MASK;
                } else {
                    i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i15 |= i38;
            } else {
                brandWhite = j7;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    z15 = z4;
                    if (c28655q.m87155h(z15)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 64;
                if (i18 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
                if ((i13 & 12582912) == 0) {
                    int i45 = i15;
                    if (c28655q.m87149e(type.ordinal())) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i15 = i45 | i37;
                }
                i24 = i15;
                i25 = i14 & 256;
                if (i25 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87155h(z14)) {
                            i26 = 67108864;
                        } else {
                            i26 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i24 |= i26;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q.m87157i(onToggle)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i24 |= i36;
                    }
                    if ((i24 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i24 & 1, z16)) {
                        c28655q.m87140Z();
                        i27 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i27 != 0 || c28655q.m87118C()) {
                            if ((i14 & 2) != 0) {
                                textResourceM21267a2 = AbstractC8693b.m21267a();
                                i24 &= -113;
                            } else {
                                textResourceM21267a2 = textResource;
                            }
                            i28 = i24;
                            if ((i14 & 4) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i28 &= -897;
                            }
                            if (i44 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i14 & 16) != 0) {
                                brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i28 &= -57345;
                            }
                            if (i16 != 0) {
                                z15 = false;
                            }
                            if (i18 != 0) {
                                z24 = true;
                            } else {
                                z24 = z13;
                            }
                            i29 = i28;
                            j14 = brandWhite;
                            if (i25 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 2) != 0) {
                                i24 &= -113;
                            }
                            int i46 = i24;
                            if ((i14 & 4) != 0) {
                                i46 &= -897;
                            }
                            if ((i14 & 16) != 0) {
                                i46 &= -57345;
                            }
                            z24 = z13;
                            z25 = z14;
                            i29 = i46;
                            j14 = brandWhite;
                            textResourceM21267a2 = textResource;
                        }
                        c28655q.m87175r();
                        if (z15) {
                            c28655q.m87150e0(1263313051);
                            z26 = false;
                            c28655q.m87173q(false);
                            jM95628d = j14;
                            i34 = 6;
                        } else {
                            z26 = false;
                            c28655q.m87150e0(1263314539);
                            i34 = 6;
                            jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                        }
                        if (z15) {
                            c28655q.m87150e0(1263316462);
                            jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, i34, z26);
                        } else {
                            c28655q.m87150e0(1263317550);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, i34, z26);
                        }
                        long j17 = jM95624D;
                        if (z15) {
                            c28655q.m87150e0(1263319851);
                            jM53358D = C38072d.f163053a.m121949b(c28655q, i34).getBlack50();
                            c28655q.m87173q(z26);
                        } else {
                            c28655q.m87150e0(1263320843);
                            jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, i34, z26);
                        }
                        j15 = jM53358D;
                        if (z25 != 0) {
                            modifierM3428y = modifier2;
                        } else {
                            modifierM3428y = AbstractC1102d.m3428y(modifier2, null, z26, 3);
                        }
                        if (z25 != 0) {
                            modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        } else {
                            modifierM3409f = c2314t;
                        }
                        boolean z28 = z24;
                        if ((i29 & 1879048192) == 536870912) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z27 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C26957l(onToggle, 14);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifier4 = modifier2;
                        f13 = 1 * 4;
                        Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1099a.m3393o(type.getPadding(), AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1112d.m3448b(modifierM3428y, z15, z28, null, (Function1) objM87133R, 12), z28), jM95628d, AbstractC17918w0.f69621a)), AbstractC33253j.m105489e(f13));
                        i35 = i29;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        boolean z29 = z15;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        String strM21274h = AbstractC8693b.m21274h(title, c28655q, i35 & 14);
                        C2886a style = type.getStyle();
                        c39111m = AbstractC39083d.f168140a;
                        AbstractC30795n.m94707h(strM21274h, new WithAlignmentLineElement(c39111m), j17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style, null, c28655q, 0, 0, 196600);
                        if (AbstractC8693b.m21270d(textResourceM21267a2)) {
                            AbstractC31061c.m95623C(c28655q, -1682250881, c2314t, f13, c28655q);
                            j16 = j15;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, (i35 >> 3) & 14), new WithAlignmentLineElement(c39111m), j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196600);
                            c28655q.m87173q(false);
                        } else {
                            j16 = j15;
                            c28655q.m87150e0(-1681938556);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        if (AbstractC8693b.m21270d(textResourceM21267a)) {
                            c28655q.m87150e0(1014858528);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i35 >> 6) & 14), null, j16, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196090);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1015081480);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier4;
                        z17 = z28;
                        z18 = z29;
                        z19 = z25;
                        textResource3 = textResourceM21267a;
                        j13 = j14;
                    } else {
                        c28655q.m87138X();
                        textResourceM21267a2 = textResource;
                        z17 = z13;
                        textResource3 = textResourceM21267a;
                        modifier3 = modifier2;
                        z18 = z15;
                        j13 = brandWhite;
                        z19 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.w0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC27289x0.m82333e(title, textResourceM21267a2, textResource3, modifier3, j13, z18, z17, type, z19, onToggle, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i24 |= 100663296;
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(onToggle)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i24 |= i36;
                }
                if ((i24 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i24 & 1, z16)) {
                    c28655q.m87140Z();
                    i27 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        if ((i14 & 2) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i24 &= -113;
                        } else {
                            textResourceM21267a2 = textResource;
                        }
                        i28 = i24;
                        if ((i14 & 4) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i28 &= -897;
                        }
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 16) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i28 &= -57345;
                        }
                        if (i16 != 0) {
                            z15 = false;
                        }
                        if (i18 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        i29 = i28;
                        j14 = brandWhite;
                        if (i25 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i24 &= -113;
                        } else {
                            textResourceM21267a2 = textResource;
                        }
                        i28 = i24;
                        if ((i14 & 4) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i28 &= -897;
                        }
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 16) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i28 &= -57345;
                        }
                        if (i16 != 0) {
                            z15 = false;
                        }
                        if (i18 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        i29 = i28;
                        j14 = brandWhite;
                        if (i25 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                    }
                    c28655q.m87175r();
                    if (z15) {
                        c28655q.m87150e0(1263313051);
                        z26 = false;
                        c28655q.m87173q(false);
                        jM95628d = j14;
                        i34 = 6;
                    } else {
                        z26 = false;
                        c28655q.m87150e0(1263314539);
                        i34 = 6;
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (z15) {
                        c28655q.m87150e0(1263316462);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, i34, z26);
                    } else {
                        c28655q.m87150e0(1263317550);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, i34, z26);
                    }
                    long j18 = jM95624D;
                    if (z15) {
                        c28655q.m87150e0(1263319851);
                        jM53358D = C38072d.f163053a.m121949b(c28655q, i34).getBlack50();
                        c28655q.m87173q(z26);
                    } else {
                        c28655q.m87150e0(1263320843);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, i34, z26);
                    }
                    j15 = jM53358D;
                    if (z25 != 0) {
                        modifierM3428y = modifier2;
                    } else {
                        modifierM3428y = AbstractC1102d.m3428y(modifier2, null, z26, 3);
                    }
                    if (z25 != 0) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    } else {
                        modifierM3409f = c2314t;
                    }
                    boolean z210 = z24;
                    if ((i29 & 1879048192) == 536870912) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C26957l(onToggle, 14);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C26957l(onToggle, 14);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifier5 = modifier2;
                    f13 = 1 * 4;
                    Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1099a.m3393o(type.getPadding(), AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1112d.m3448b(modifierM3428y, z15, z210, null, (Function1) objM87133R, 12), z210), jM95628d, AbstractC17918w0.f69621a)), AbstractC33253j.m105489e(f13));
                    i35 = i29;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM118994r2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    boolean z211 = z15;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i5 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                    String strM21274h2 = AbstractC8693b.m21274h(title, c28655q, i35 & 14);
                    C2886a style2 = type.getStyle();
                    c39111m = AbstractC39083d.f168140a;
                    AbstractC30795n.m94707h(strM21274h2, new WithAlignmentLineElement(c39111m), j18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style2, null, c28655q, 0, 0, 196600);
                    if (AbstractC8693b.m21270d(textResourceM21267a2)) {
                        AbstractC31061c.m95623C(c28655q, -1682250881, c2314t, f13, c28655q);
                        j16 = j15;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, (i35 >> 3) & 14), new WithAlignmentLineElement(c39111m), j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196600);
                        c28655q.m87173q(false);
                    } else {
                        j16 = j15;
                        c28655q.m87150e0(-1681938556);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (AbstractC8693b.m21270d(textResourceM21267a)) {
                        c28655q.m87150e0(1014858528);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i35 >> 6) & 14), null, j16, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196090);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1015081480);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                    z17 = z210;
                    z18 = z211;
                    z19 = z25;
                    textResource3 = textResourceM21267a;
                    j13 = j14;
                } else {
                    c28655q.m87138X();
                    textResourceM21267a2 = textResource;
                    z17 = z13;
                    textResource3 = textResourceM21267a;
                    modifier3 = modifier2;
                    z18 = z15;
                    j13 = brandWhite;
                    z19 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.w0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC27289x0.m82333e(title, textResourceM21267a2, textResource3, modifier3, j13, z18, z17, type, z19, onToggle, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z15 = z4;
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z13)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            if ((i13 & 12582912) == 0) {
                int i47 = i15;
                if (c28655q.m87149e(type.ordinal())) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i15 = i47 | i37;
            }
            i24 = i15;
            i25 = i14 & 256;
            if (i25 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i24 |= i26;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(onToggle)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i24 |= i36;
                }
                if ((i24 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i24 & 1, z16)) {
                    c28655q.m87140Z();
                    i27 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        if ((i14 & 2) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i24 &= -113;
                        } else {
                            textResourceM21267a2 = textResource;
                        }
                        i28 = i24;
                        if ((i14 & 4) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i28 &= -897;
                        }
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 16) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i28 &= -57345;
                        }
                        if (i16 != 0) {
                            z15 = false;
                        }
                        if (i18 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        i29 = i28;
                        j14 = brandWhite;
                        if (i25 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i24 &= -113;
                        } else {
                            textResourceM21267a2 = textResource;
                        }
                        i28 = i24;
                        if ((i14 & 4) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i28 &= -897;
                        }
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 16) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i28 &= -57345;
                        }
                        if (i16 != 0) {
                            z15 = false;
                        }
                        if (i18 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        i29 = i28;
                        j14 = brandWhite;
                        if (i25 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                    }
                    c28655q.m87175r();
                    if (z15) {
                        c28655q.m87150e0(1263313051);
                        z26 = false;
                        c28655q.m87173q(false);
                        jM95628d = j14;
                        i34 = 6;
                    } else {
                        z26 = false;
                        c28655q.m87150e0(1263314539);
                        i34 = 6;
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (z15) {
                        c28655q.m87150e0(1263316462);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, i34, z26);
                    } else {
                        c28655q.m87150e0(1263317550);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, i34, z26);
                    }
                    long j19 = jM95624D;
                    if (z15) {
                        c28655q.m87150e0(1263319851);
                        jM53358D = C38072d.f163053a.m121949b(c28655q, i34).getBlack50();
                        c28655q.m87173q(z26);
                    } else {
                        c28655q.m87150e0(1263320843);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, i34, z26);
                    }
                    j15 = jM53358D;
                    if (z25 != 0) {
                        modifierM3428y = modifier2;
                    } else {
                        modifierM3428y = AbstractC1102d.m3428y(modifier2, null, z26, 3);
                    }
                    if (z25 != 0) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    } else {
                        modifierM3409f = c2314t;
                    }
                    boolean z212 = z24;
                    if ((i29 & 1879048192) == 536870912) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C26957l(onToggle, 14);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C26957l(onToggle, 14);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifier6 = modifier2;
                    f13 = 1 * 4;
                    Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1099a.m3393o(type.getPadding(), AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1112d.m3448b(modifierM3428y, z15, z212, null, (Function1) objM87133R, 12), z212), jM95628d, AbstractC17918w0.f69621a)), AbstractC33253j.m105489e(f13));
                    i35 = i29;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM118994r3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    boolean z213 = z15;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i8 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                    C0209i c0209i9 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                    String strM21274h3 = AbstractC8693b.m21274h(title, c28655q, i35 & 14);
                    C2886a style3 = type.getStyle();
                    c39111m = AbstractC39083d.f168140a;
                    AbstractC30795n.m94707h(strM21274h3, new WithAlignmentLineElement(c39111m), j19, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style3, null, c28655q, 0, 0, 196600);
                    if (AbstractC8693b.m21270d(textResourceM21267a2)) {
                        AbstractC31061c.m95623C(c28655q, -1682250881, c2314t, f13, c28655q);
                        j16 = j15;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, (i35 >> 3) & 14), new WithAlignmentLineElement(c39111m), j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196600);
                        c28655q.m87173q(false);
                    } else {
                        j16 = j15;
                        c28655q.m87150e0(-1681938556);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (AbstractC8693b.m21270d(textResourceM21267a)) {
                        c28655q.m87150e0(1014858528);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i35 >> 6) & 14), null, j16, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196090);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1015081480);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier6;
                    z17 = z212;
                    z18 = z213;
                    z19 = z25;
                    textResource3 = textResourceM21267a;
                    j13 = j14;
                } else {
                    c28655q.m87138X();
                    textResourceM21267a2 = textResource;
                    z17 = z13;
                    textResource3 = textResourceM21267a;
                    modifier3 = modifier2;
                    z18 = z15;
                    j13 = brandWhite;
                    z19 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.w0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC27289x0.m82333e(title, textResourceM21267a2, textResource3, modifier3, j13, z18, z17, type, z19, onToggle, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i24 |= 100663296;
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i24 |= i36;
            }
            if ((i24 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i24 & 1, z16)) {
                c28655q.m87140Z();
                i27 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i24 &= -113;
                    } else {
                        textResourceM21267a2 = textResource;
                    }
                    i28 = i24;
                    if ((i14 & 4) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i28 &= -897;
                    }
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 16) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i28 &= -57345;
                    }
                    if (i16 != 0) {
                        z15 = false;
                    }
                    if (i18 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    i29 = i28;
                    j14 = brandWhite;
                    if (i25 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i24 &= -113;
                    } else {
                        textResourceM21267a2 = textResource;
                    }
                    i28 = i24;
                    if ((i14 & 4) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i28 &= -897;
                    }
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 16) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i28 &= -57345;
                    }
                    if (i16 != 0) {
                        z15 = false;
                    }
                    if (i18 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    i29 = i28;
                    j14 = brandWhite;
                    if (i25 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                }
                c28655q.m87175r();
                if (z15) {
                    c28655q.m87150e0(1263313051);
                    z26 = false;
                    c28655q.m87173q(false);
                    jM95628d = j14;
                    i34 = 6;
                } else {
                    z26 = false;
                    c28655q.m87150e0(1263314539);
                    i34 = 6;
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z15) {
                    c28655q.m87150e0(1263316462);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, i34, z26);
                } else {
                    c28655q.m87150e0(1263317550);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, i34, z26);
                }
                long j110 = jM95624D;
                if (z15) {
                    c28655q.m87150e0(1263319851);
                    jM53358D = C38072d.f163053a.m121949b(c28655q, i34).getBlack50();
                    c28655q.m87173q(z26);
                } else {
                    c28655q.m87150e0(1263320843);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, i34, z26);
                }
                j15 = jM53358D;
                if (z25 != 0) {
                    modifierM3428y = modifier2;
                } else {
                    modifierM3428y = AbstractC1102d.m3428y(modifier2, null, z26, 3);
                }
                if (z25 != 0) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                } else {
                    modifierM3409f = c2314t;
                }
                boolean z214 = z24;
                if ((i29 & 1879048192) == 536870912) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C26957l(onToggle, 14);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26957l(onToggle, 14);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifier7 = modifier2;
                f13 = 1 * 4;
                Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1099a.m3393o(type.getPadding(), AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1112d.m3448b(modifierM3428y, z15, z214, null, (Function1) objM87133R, 12), z214), jM95628d, AbstractC17918w0.f69621a)), AbstractC33253j.m105489e(f13));
                i35 = i29;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM118994r4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                boolean z215 = z15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
                String strM21274h4 = AbstractC8693b.m21274h(title, c28655q, i35 & 14);
                C2886a style4 = type.getStyle();
                c39111m = AbstractC39083d.f168140a;
                AbstractC30795n.m94707h(strM21274h4, new WithAlignmentLineElement(c39111m), j110, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style4, null, c28655q, 0, 0, 196600);
                if (AbstractC8693b.m21270d(textResourceM21267a2)) {
                    AbstractC31061c.m95623C(c28655q, -1682250881, c2314t, f13, c28655q);
                    j16 = j15;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, (i35 >> 3) & 14), new WithAlignmentLineElement(c39111m), j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196600);
                    c28655q.m87173q(false);
                } else {
                    j16 = j15;
                    c28655q.m87150e0(-1681938556);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    c28655q.m87150e0(1014858528);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i35 >> 6) & 14), null, j16, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196090);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1015081480);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier7;
                z17 = z214;
                z18 = z215;
                z19 = z25;
                textResource3 = textResourceM21267a;
                j13 = j14;
            } else {
                c28655q.m87138X();
                textResourceM21267a2 = textResource;
                z17 = z13;
                textResource3 = textResourceM21267a;
                modifier3 = modifier2;
                z18 = z15;
                j13 = brandWhite;
                z19 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.w0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC27289x0.m82333e(title, textResourceM21267a2, textResource3, modifier3, j13, z18, z17, type, z19, onToggle, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i13 & 24576) == 0) {
            brandWhite = j7;
            if ((i14 & 16) == 0) {
                i38 = DfuBaseService.ERROR_REMOTE_MASK;
            } else {
                i38 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i38;
        } else {
            brandWhite = j7;
        }
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                z15 = z4;
                if (c28655q.m87155h(z15)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z13)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            if ((i13 & 12582912) == 0) {
                int i48 = i15;
                if (c28655q.m87149e(type.ordinal())) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i15 = i48 | i37;
            }
            i24 = i15;
            i25 = i14 & 256;
            if (i25 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i24 |= i26;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(onToggle)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i24 |= i36;
                }
                if ((i24 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i24 & 1, z16)) {
                    c28655q.m87140Z();
                    i27 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        if ((i14 & 2) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i24 &= -113;
                        } else {
                            textResourceM21267a2 = textResource;
                        }
                        i28 = i24;
                        if ((i14 & 4) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i28 &= -897;
                        }
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 16) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i28 &= -57345;
                        }
                        if (i16 != 0) {
                            z15 = false;
                        }
                        if (i18 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        i29 = i28;
                        j14 = brandWhite;
                        if (i25 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                            i24 &= -113;
                        } else {
                            textResourceM21267a2 = textResource;
                        }
                        i28 = i24;
                        if ((i14 & 4) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i28 &= -897;
                        }
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 16) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i28 &= -57345;
                        }
                        if (i16 != 0) {
                            z15 = false;
                        }
                        if (i18 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        i29 = i28;
                        j14 = brandWhite;
                        if (i25 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                    }
                    c28655q.m87175r();
                    if (z15) {
                        c28655q.m87150e0(1263313051);
                        z26 = false;
                        c28655q.m87173q(false);
                        jM95628d = j14;
                        i34 = 6;
                    } else {
                        z26 = false;
                        c28655q.m87150e0(1263314539);
                        i34 = 6;
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (z15) {
                        c28655q.m87150e0(1263316462);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, i34, z26);
                    } else {
                        c28655q.m87150e0(1263317550);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, i34, z26);
                    }
                    long j111 = jM95624D;
                    if (z15) {
                        c28655q.m87150e0(1263319851);
                        jM53358D = C38072d.f163053a.m121949b(c28655q, i34).getBlack50();
                        c28655q.m87173q(z26);
                    } else {
                        c28655q.m87150e0(1263320843);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, i34, z26);
                    }
                    j15 = jM53358D;
                    if (z25 != 0) {
                        modifierM3428y = modifier2;
                    } else {
                        modifierM3428y = AbstractC1102d.m3428y(modifier2, null, z26, 3);
                    }
                    if (z25 != 0) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    } else {
                        modifierM3409f = c2314t;
                    }
                    boolean z216 = z24;
                    if ((i29 & 1879048192) == 536870912) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C26957l(onToggle, 14);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C26957l(onToggle, 14);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifier8 = modifier2;
                    f13 = 1 * 4;
                    Modifier modifierM118994r5 = AbstractC37056f.m118994r(AbstractC1099a.m3393o(type.getPadding(), AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1112d.m3448b(modifierM3428y, z15, z216, null, (Function1) objM87133R, 12), z216), jM95628d, AbstractC17918w0.f69621a)), AbstractC33253j.m105489e(f13));
                    i35 = i29;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM118994r5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    boolean z217 = z15;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a5);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m9);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N9);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                    String strM21274h5 = AbstractC8693b.m21274h(title, c28655q, i35 & 14);
                    C2886a style5 = type.getStyle();
                    c39111m = AbstractC39083d.f168140a;
                    AbstractC30795n.m94707h(strM21274h5, new WithAlignmentLineElement(c39111m), j111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style5, null, c28655q, 0, 0, 196600);
                    if (AbstractC8693b.m21270d(textResourceM21267a2)) {
                        AbstractC31061c.m95623C(c28655q, -1682250881, c2314t, f13, c28655q);
                        j16 = j15;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, (i35 >> 3) & 14), new WithAlignmentLineElement(c39111m), j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196600);
                        c28655q.m87173q(false);
                    } else {
                        j16 = j15;
                        c28655q.m87150e0(-1681938556);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (AbstractC8693b.m21270d(textResourceM21267a)) {
                        c28655q.m87150e0(1014858528);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i35 >> 6) & 14), null, j16, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196090);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1015081480);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier8;
                    z17 = z216;
                    z18 = z217;
                    z19 = z25;
                    textResource3 = textResourceM21267a;
                    j13 = j14;
                } else {
                    c28655q.m87138X();
                    textResourceM21267a2 = textResource;
                    z17 = z13;
                    textResource3 = textResourceM21267a;
                    modifier3 = modifier2;
                    z18 = z15;
                    j13 = brandWhite;
                    z19 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.w0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC27289x0.m82333e(title, textResourceM21267a2, textResource3, modifier3, j13, z18, z17, type, z19, onToggle, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i24 |= 100663296;
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i24 |= i36;
            }
            if ((i24 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i24 & 1, z16)) {
                c28655q.m87140Z();
                i27 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i24 &= -113;
                    } else {
                        textResourceM21267a2 = textResource;
                    }
                    i28 = i24;
                    if ((i14 & 4) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i28 &= -897;
                    }
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 16) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i28 &= -57345;
                    }
                    if (i16 != 0) {
                        z15 = false;
                    }
                    if (i18 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    i29 = i28;
                    j14 = brandWhite;
                    if (i25 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i24 &= -113;
                    } else {
                        textResourceM21267a2 = textResource;
                    }
                    i28 = i24;
                    if ((i14 & 4) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i28 &= -897;
                    }
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 16) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i28 &= -57345;
                    }
                    if (i16 != 0) {
                        z15 = false;
                    }
                    if (i18 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    i29 = i28;
                    j14 = brandWhite;
                    if (i25 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                }
                c28655q.m87175r();
                if (z15) {
                    c28655q.m87150e0(1263313051);
                    z26 = false;
                    c28655q.m87173q(false);
                    jM95628d = j14;
                    i34 = 6;
                } else {
                    z26 = false;
                    c28655q.m87150e0(1263314539);
                    i34 = 6;
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z15) {
                    c28655q.m87150e0(1263316462);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, i34, z26);
                } else {
                    c28655q.m87150e0(1263317550);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, i34, z26);
                }
                long j112 = jM95624D;
                if (z15) {
                    c28655q.m87150e0(1263319851);
                    jM53358D = C38072d.f163053a.m121949b(c28655q, i34).getBlack50();
                    c28655q.m87173q(z26);
                } else {
                    c28655q.m87150e0(1263320843);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, i34, z26);
                }
                j15 = jM53358D;
                if (z25 != 0) {
                    modifierM3428y = modifier2;
                } else {
                    modifierM3428y = AbstractC1102d.m3428y(modifier2, null, z26, 3);
                }
                if (z25 != 0) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                } else {
                    modifierM3409f = c2314t;
                }
                boolean z218 = z24;
                if ((i29 & 1879048192) == 536870912) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C26957l(onToggle, 14);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26957l(onToggle, 14);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifier9 = modifier2;
                f13 = 1 * 4;
                Modifier modifierM118994r6 = AbstractC37056f.m118994r(AbstractC1099a.m3393o(type.getPadding(), AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1112d.m3448b(modifierM3428y, z15, z218, null, (Function1) objM87133R, 12), z218), jM95628d, AbstractC17918w0.f69621a)), AbstractC33253j.m105489e(f13));
                i35 = i29;
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM118994r6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                boolean z219 = z15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i17 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i17, c23010xM66775a6);
                C0209i c0209i18 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N11);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N12);
                String strM21274h6 = AbstractC8693b.m21274h(title, c28655q, i35 & 14);
                C2886a style6 = type.getStyle();
                c39111m = AbstractC39083d.f168140a;
                AbstractC30795n.m94707h(strM21274h6, new WithAlignmentLineElement(c39111m), j112, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style6, null, c28655q, 0, 0, 196600);
                if (AbstractC8693b.m21270d(textResourceM21267a2)) {
                    AbstractC31061c.m95623C(c28655q, -1682250881, c2314t, f13, c28655q);
                    j16 = j15;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, (i35 >> 3) & 14), new WithAlignmentLineElement(c39111m), j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196600);
                    c28655q.m87173q(false);
                } else {
                    j16 = j15;
                    c28655q.m87150e0(-1681938556);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    c28655q.m87150e0(1014858528);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i35 >> 6) & 14), null, j16, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196090);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1015081480);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier9;
                z17 = z218;
                z18 = z219;
                z19 = z25;
                textResource3 = textResourceM21267a;
                j13 = j14;
            } else {
                c28655q.m87138X();
                textResourceM21267a2 = textResource;
                z17 = z13;
                textResource3 = textResourceM21267a;
                modifier3 = modifier2;
                z18 = z15;
                j13 = brandWhite;
                z19 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.w0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC27289x0.m82333e(title, textResourceM21267a2, textResource3, modifier3, j13, z18, z17, type, z19, onToggle, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z15 = z4;
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q.m87155h(z13)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i15 |= i19;
        }
        if ((i13 & 12582912) == 0) {
            int i49 = i15;
            if (c28655q.m87149e(type.ordinal())) {
                i37 = 8388608;
            } else {
                i37 = 4194304;
            }
            i15 = i49 | i37;
        }
        i24 = i15;
        i25 = i14 & 256;
        if (i25 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87155h(z14)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i24 |= i26;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i24 |= i36;
            }
            if ((i24 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i24 & 1, z16)) {
                c28655q.m87140Z();
                i27 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i24 &= -113;
                    } else {
                        textResourceM21267a2 = textResource;
                    }
                    i28 = i24;
                    if ((i14 & 4) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i28 &= -897;
                    }
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 16) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i28 &= -57345;
                    }
                    if (i16 != 0) {
                        z15 = false;
                    }
                    if (i18 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    i29 = i28;
                    j14 = brandWhite;
                    if (i25 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                        i24 &= -113;
                    } else {
                        textResourceM21267a2 = textResource;
                    }
                    i28 = i24;
                    if ((i14 & 4) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i28 &= -897;
                    }
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 16) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i28 &= -57345;
                    }
                    if (i16 != 0) {
                        z15 = false;
                    }
                    if (i18 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    i29 = i28;
                    j14 = brandWhite;
                    if (i25 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                }
                c28655q.m87175r();
                if (z15) {
                    c28655q.m87150e0(1263313051);
                    z26 = false;
                    c28655q.m87173q(false);
                    jM95628d = j14;
                    i34 = 6;
                } else {
                    z26 = false;
                    c28655q.m87150e0(1263314539);
                    i34 = 6;
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z15) {
                    c28655q.m87150e0(1263316462);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, i34, z26);
                } else {
                    c28655q.m87150e0(1263317550);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, i34, z26);
                }
                long j113 = jM95624D;
                if (z15) {
                    c28655q.m87150e0(1263319851);
                    jM53358D = C38072d.f163053a.m121949b(c28655q, i34).getBlack50();
                    c28655q.m87173q(z26);
                } else {
                    c28655q.m87150e0(1263320843);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, i34, z26);
                }
                j15 = jM53358D;
                if (z25 != 0) {
                    modifierM3428y = modifier2;
                } else {
                    modifierM3428y = AbstractC1102d.m3428y(modifier2, null, z26, 3);
                }
                if (z25 != 0) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                } else {
                    modifierM3409f = c2314t;
                }
                boolean z2110 = z24;
                if ((i29 & 1879048192) == 536870912) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C26957l(onToggle, 14);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26957l(onToggle, 14);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifier10 = modifier2;
                f13 = 1 * 4;
                Modifier modifierM118994r7 = AbstractC37056f.m118994r(AbstractC1099a.m3393o(type.getPadding(), AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1112d.m3448b(modifierM3428y, z15, z2110, null, (Function1) objM87133R, 12), z2110), jM95628d, AbstractC17918w0.f69621a)), AbstractC33253j.m105489e(f13));
                i35 = i29;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM118994r7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                boolean z2111 = z15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a7);
                C0209i c0209i111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m13);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N13);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N14);
                String strM21274h7 = AbstractC8693b.m21274h(title, c28655q, i35 & 14);
                C2886a style7 = type.getStyle();
                c39111m = AbstractC39083d.f168140a;
                AbstractC30795n.m94707h(strM21274h7, new WithAlignmentLineElement(c39111m), j113, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style7, null, c28655q, 0, 0, 196600);
                if (AbstractC8693b.m21270d(textResourceM21267a2)) {
                    AbstractC31061c.m95623C(c28655q, -1682250881, c2314t, f13, c28655q);
                    j16 = j15;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, (i35 >> 3) & 14), new WithAlignmentLineElement(c39111m), j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196600);
                    c28655q.m87173q(false);
                } else {
                    j16 = j15;
                    c28655q.m87150e0(-1681938556);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    c28655q.m87150e0(1014858528);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i35 >> 6) & 14), null, j16, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196090);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1015081480);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier10;
                z17 = z2110;
                z18 = z2111;
                z19 = z25;
                textResource3 = textResourceM21267a;
                j13 = j14;
            } else {
                c28655q.m87138X();
                textResourceM21267a2 = textResource;
                z17 = z13;
                textResource3 = textResourceM21267a;
                modifier3 = modifier2;
                z18 = z15;
                j13 = brandWhite;
                z19 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.w0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC27289x0.m82333e(title, textResourceM21267a2, textResource3, modifier3, j13, z18, z17, type, z19, onToggle, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i24 |= 100663296;
        if ((i13 & 805306368) == 0) {
            if (c28655q.m87157i(onToggle)) {
                i36 = 536870912;
            } else {
                i36 = 268435456;
            }
            i24 |= i36;
        }
        if ((i24 & 306783379) != 306783378) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i24 & 1, z16)) {
            c28655q.m87140Z();
            i27 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                if ((i14 & 2) != 0) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                    i24 &= -113;
                } else {
                    textResourceM21267a2 = textResource;
                }
                i28 = i24;
                if ((i14 & 4) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i28 &= -897;
                }
                if (i44 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 16) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i28 &= -57345;
                }
                if (i16 != 0) {
                    z15 = false;
                }
                if (i18 != 0) {
                    z24 = true;
                } else {
                    z24 = z13;
                }
                i29 = i28;
                j14 = brandWhite;
                if (i25 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
            } else {
                if ((i14 & 2) != 0) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                    i24 &= -113;
                } else {
                    textResourceM21267a2 = textResource;
                }
                i28 = i24;
                if ((i14 & 4) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i28 &= -897;
                }
                if (i44 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 16) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i28 &= -57345;
                }
                if (i16 != 0) {
                    z15 = false;
                }
                if (i18 != 0) {
                    z24 = true;
                } else {
                    z24 = z13;
                }
                i29 = i28;
                j14 = brandWhite;
                if (i25 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
            }
            c28655q.m87175r();
            if (z15) {
                c28655q.m87150e0(1263313051);
                z26 = false;
                c28655q.m87173q(false);
                jM95628d = j14;
                i34 = 6;
            } else {
                z26 = false;
                c28655q.m87150e0(1263314539);
                i34 = 6;
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            if (z15) {
                c28655q.m87150e0(1263316462);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, i34, z26);
            } else {
                c28655q.m87150e0(1263317550);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, i34, z26);
            }
            long j114 = jM95624D;
            if (z15) {
                c28655q.m87150e0(1263319851);
                jM53358D = C38072d.f163053a.m121949b(c28655q, i34).getBlack50();
                c28655q.m87173q(z26);
            } else {
                c28655q.m87150e0(1263320843);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, i34, z26);
            }
            j15 = jM53358D;
            if (z25 != 0) {
                modifierM3428y = modifier2;
            } else {
                modifierM3428y = AbstractC1102d.m3428y(modifier2, null, z26, 3);
            }
            if (z25 != 0) {
                modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            } else {
                modifierM3409f = c2314t;
            }
            boolean z2112 = z24;
            if ((i29 & 1879048192) == 536870912) {
                z27 = true;
            } else {
                z27 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z27) {
                objM87133R = new C26957l(onToggle, 14);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C26957l(onToggle, 14);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifier11 = modifier2;
            f13 = 1 * 4;
            Modifier modifierM118994r8 = AbstractC37056f.m118994r(AbstractC1099a.m3393o(type.getPadding(), AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1112d.m3448b(modifierM3428y, z15, z2112, null, (Function1) objM87133R, 12), z2112), jM95628d, AbstractC17918w0.f69621a)), AbstractC33253j.m105489e(f13));
            i35 = i29;
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM118994r8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            boolean z2113 = z15;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i113 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a8);
            C0209i c0209i114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m15);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N15);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i113, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m16);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N16);
            String strM21274h8 = AbstractC8693b.m21274h(title, c28655q, i35 & 14);
            C2886a style8 = type.getStyle();
            c39111m = AbstractC39083d.f168140a;
            AbstractC30795n.m94707h(strM21274h8, new WithAlignmentLineElement(c39111m), j114, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style8, null, c28655q, 0, 0, 196600);
            if (AbstractC8693b.m21270d(textResourceM21267a2)) {
                AbstractC31061c.m95623C(c28655q, -1682250881, c2314t, f13, c28655q);
                j16 = j15;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a2, c28655q, (i35 >> 3) & 14), new WithAlignmentLineElement(c39111m), j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196600);
                c28655q.m87173q(false);
            } else {
                j16 = j15;
                c28655q.m87150e0(-1681938556);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (AbstractC8693b.m21270d(textResourceM21267a)) {
                c28655q.m87150e0(1014858528);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, (i35 >> 6) & 14), null, j16, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196090);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1015081480);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier11;
            z17 = z2112;
            z18 = z2113;
            z19 = z25;
            textResource3 = textResourceM21267a;
            j13 = j14;
        } else {
            c28655q.m87138X();
            textResourceM21267a2 = textResource;
            z17 = z13;
            textResource3 = textResourceM21267a;
            modifier3 = modifier2;
            z18 = z15;
            j13 = brandWhite;
            z19 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.w0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC27289x0.m82333e(title, textResourceM21267a2, textResource3, modifier3, j13, z18, z17, type, z19, onToggle, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m82332d(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m82333e(TextResource textResource, TextResource textResource2, TextResource textResource3, Modifier modifier, long j7, boolean z4, boolean z13, EnumC27291y0 enumC27291y0, boolean z14, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m82331c(textResource, textResource2, textResource3, modifier, j7, z4, z13, enumC27291y0, z14, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

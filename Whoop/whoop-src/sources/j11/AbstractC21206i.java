package j11;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bm2.C3444h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9785i;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import hy0.C17737e0;
import iy0.C21026a;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: j11.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "", "showCloseIcon", "Lkotlin/Function0;", "Ll83/a0;", "onDismissRequest", "Lj11/o;", "textAlignment", "uppercaseTitle", "", "icon", "Lj11/p;", "topDialogStyle", "slot", "g", "(Lcom/whoop/design/util/TextResource;ZLc93/a;Lj11/o;ZLjava/lang/Integer;Lj11/p;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "n", "(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V", "p", "j", "(ILandroidx/compose/runtime/Composer;I)V", "l", "(Landroidx/compose/runtime/Composer;I)V", "Ll83/k;", "Ly3/f;", "r", "(Lj11/o;Ljava/lang/Integer;Z)Ll83/k;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21206i {

    /* JADX INFO: renamed from: j11.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f80809a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f80810b;

        static {
            int[] iArr = new int[EnumC21213p.values().length];
            try {
                iArr[EnumC21213p.MARGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21213p.START_ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21213p.CENTER_ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21213p.LOTTIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC21213p.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f80809a = iArr;
            int[] iArr2 = new int[EnumC21212o.values().length];
            try {
                iArr2[EnumC21212o.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC21212o.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f80810b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:104:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:110:0x0159  */
    /* JADX WARN: Code duplicated, block: B:113:0x016e  */
    /* JADX WARN: Code duplicated, block: B:116:0x017f  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:135:0x020a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0218  */
    /* JADX WARN: Code duplicated, block: B:140:0x024c  */
    /* JADX WARN: Code duplicated, block: B:141:0x024e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0255  */
    /* JADX WARN: Code duplicated, block: B:146:0x0259  */
    /* JADX WARN: Code duplicated, block: B:149:0x0289  */
    /* JADX WARN: Code duplicated, block: B:152:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:156:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:158:0x02db  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:169:0x0304  */
    /* JADX WARN: Code duplicated, block: B:171:0x030d  */
    /* JADX WARN: Code duplicated, block: B:172:0x031b  */
    /* JADX WARN: Code duplicated, block: B:173:0x032f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0343  */
    /* JADX WARN: Code duplicated, block: B:176:0x0354  */
    /* JADX WARN: Code duplicated, block: B:177:0x0364  */
    /* JADX WARN: Code duplicated, block: B:179:0x039b  */
    /* JADX WARN: Code duplicated, block: B:182:0x03be  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:186:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:192:0x045a  */
    /* JADX WARN: Code duplicated, block: B:193:0x045e  */
    /* JADX WARN: Code duplicated, block: B:196:0x046b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0479  */
    /* JADX WARN: Code duplicated, block: B:200:0x0494  */
    /* JADX WARN: Code duplicated, block: B:203:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x0108, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: g */
    public static final void m59466g(TextResource textResource, boolean z4, InterfaceC4339a onDismissRequest, EnumC21212o enumC21212o, boolean z13, Integer num, EnumC21213p enumC21213p, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        TextResource textResource2;
        int i15;
        int i16;
        Integer num2;
        int i17;
        int i18;
        int iOrdinal;
        int i19;
        int i24;
        InterfaceC4351m interfaceC4351mM59434b;
        int i25;
        boolean z14;
        boolean z15;
        EnumC21213p enumC21213p2;
        InterfaceC4351m interfaceC4351m2;
        TextResource textResource3;
        Integer num3;
        EnumC21212o enumC21212o2;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        EnumC21212o enumC21212o3;
        boolean z16;
        EnumC21213p enumC21213p3;
        C22957g c22957g;
        int iHashCode;
        C2314t c2314t;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        TextResource textResource4;
        C0209i c0209i4;
        Integer num4;
        int iHashCode2;
        C0209i c0209i5;
        int i26;
        C28655q c28655q2;
        int iHashCode3;
        int i27;
        Integer num5;
        boolean z17;
        String strM21274h;
        C2314t c2314t2;
        int i28;
        int i29;
        TextResource textResource5;
        boolean z18;
        C28655q c28655q3;
        int iHashCode4;
        int iHashCode5;
        boolean z19;
        Object objM87133R;
        AbstractC22676k.m65750j(onDismissRequest, "onDismissRequest");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(2044619805);
        int i34 = i14 & 1;
        if (i34 != 0) {
            i15 = i13 | 6;
            textResource2 = textResource;
        } else if ((i13 & 6) == 0) {
            textResource2 = textResource;
            i15 = (c28655q4.m87153g(textResource2) ? 4 : 2) | i13;
        } else {
            textResource2 = textResource;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q4.m87157i(onDismissRequest) ? 256 : 128;
        }
        int i35 = i14 & 8;
        if (i35 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q4.m87149e(enumC21212o == null ? -1 : enumC21212o.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i36 = i14 & 16;
        if (i36 == 0) {
            if ((i13 & 24576) == 0) {
                i15 |= c28655q4.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                num2 = num;
            } else {
                num2 = num;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87153g(num2)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (enumC21213p == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC21213p.ordinal();
                }
                if (c28655q4.m87149e(iOrdinal)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
                interfaceC4351mM59434b = interfaceC4351m;
            } else {
                interfaceC4351mM59434b = interfaceC4351m;
                if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(interfaceC4351mM59434b)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i15 |= i25;
                }
            }
            if ((i15 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                if (i34 != 0) {
                    textResource2 = null;
                }
                if (i35 != 0) {
                    enumC21212o3 = EnumC21212o.CENTER;
                } else {
                    enumC21212o3 = enumC21212o;
                }
                if (i36 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                Integer num6 = i16 == 0 ? num2 : null;
                if (i18 != 0) {
                    enumC21213p3 = EnumC21213p.DEFAULT;
                } else {
                    enumC21213p3 = enumC21213p;
                }
                if (i24 != 0) {
                    interfaceC4351mM59434b = C21199b.f80775a.m59434b();
                }
                c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, c2314t);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                InterfaceC4351m interfaceC4351m3 = interfaceC4351mM59434b;
                if (c28655q4.f115903S) {
                    textResource4 = textResource2;
                } else {
                    textResource4 = textResource2;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                    C2307m c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    num4 = num6;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                    if (z4) {
                        c28655q4.m87150e0(-1114991760);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q4, 48);
                        iHashCode5 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
                        C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q4, 0);
                        if ((i15 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R = c28655q4.m87133R();
                        if (z19 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C21026a(onDismissRequest, 2);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        c0209i5 = c0209i2;
                        i26 = 1;
                        AbstractC27242b1.m82092d(c27270o, strM21273g, null, null, interfaceC4339a2, c28655q4, 0, 12);
                        C28655q c28655q5 = c28655q4;
                        c28655q5.m87173q(true);
                        c28655q5.m87173q(false);
                        c28655q2 = c28655q5;
                    } else {
                        C28655q c28655q6 = c28655q4;
                        c0209i5 = c0209i2;
                        i26 = 1;
                        c28655q6.m87150e0(-1114414199);
                        c28655q6.m87173q(false);
                        c28655q2 = c28655q6;
                    }
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q2, 48);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                    i27 = a.f80809a[enumC21213p3.ordinal()];
                    if (i27 != i26) {
                        num5 = num4;
                        z17 = false;
                        c28655q2.m87150e0(445944667);
                        AbstractC25012a.m73388u(5, 4, c2314t, c28655q2, false);
                    } else if (i27 != 2) {
                        num5 = num4;
                        z17 = false;
                        c28655q2.m87150e0(445947649);
                        m59475p(num5, c28655q2, (i15 >> 15) & 14);
                        c28655q2.m87173q(false);
                    } else if (i27 != 3) {
                        if (i27 != 4) {
                            z17 = false;
                            c28655q2.m87150e0(445951933);
                            m59471l(c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            if (i27 == 5) {
                                throw AbstractC11895b.m32003v(445942795, c28655q2, false);
                            }
                            c28655q2.m87150e0(445953875);
                            z17 = false;
                            c28655q2.m87173q(false);
                        }
                        num5 = num4;
                    } else {
                        z17 = false;
                        c28655q2.m87150e0(445949858);
                        num5 = num4;
                        m59473n(num5, c28655q2, (i15 >> 15) & 14);
                        c28655q2.m87173q(false);
                    }
                    if (textResource4 == null) {
                        c28655q2.m87150e0(939743630);
                        c28655q2.m87173q(z17);
                        z18 = i26;
                        c2314t2 = c2314t;
                        textResource5 = textResource4;
                        c28655q3 = c28655q2;
                    } else {
                        c28655q2.m87150e0(939743631);
                        C23465k c23465kM59477r = m59477r(enumC21212o3, num5, z4);
                        TextResource textResource6 = textResource4;
                        strM21274h = AbstractC8693b.m21274h(textResource6, c28655q2, i15 & 14);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, ((C39174f) c23465kM59477r.f92937w).f168413w, i26 * 4, ((C39174f) c23465kM59477r.f92938x).f168413w, 0.0f, 8);
                        c2314t2 = c2314t;
                        if (z16) {
                            strM21274h = strM21274h.toUpperCase(Locale.ROOT);
                            AbstractC22676k.m65749i(strM21274h, "toUpperCase(...)");
                        }
                        C38072d c38072d = C38072d.f163053a;
                        long jM125430y = c38072d.m121949b(c28655q2, 6).getBrandWhite();
                        i28 = a.f80810b[enumC21212o3.ordinal()];
                        if (i28 != 1) {
                            i29 = 3;
                        } else {
                            if (i28 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i29 = 5;
                        }
                        C2886a c2886aM8436q = c38072d.m121952e(c28655q2, 6).getH3();
                        textResource5 = textResource6;
                        C28655q c28655q7 = c28655q2;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, new C36775k(i29), 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q7, 0, 0, 196088);
                        C28655q c28655q8 = c28655q7;
                        c28655q8.m87173q(false);
                        z18 = 1;
                        c28655q3 = c28655q8;
                    }
                    c28655q3.m87173q(z18);
                    c28655q3.m87173q(z18);
                    float f13 = 8;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 2 * f13, 0.0f, 0.0f, ((float) 1.5d) * f13, 6);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3398t2);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m5);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N5);
                    AbstractC11895b.m31978A((i15 >> 21) & 14, interfaceC4351m3, c28655q3, true, true);
                    TextResource textResource7 = textResource5;
                    num3 = num5;
                    textResource3 = textResource7;
                    EnumC21212o enumC21212o4 = enumC21212o3;
                    interfaceC4351m2 = interfaceC4351m3;
                    enumC21212o2 = enumC21212o4;
                    z15 = z16;
                    enumC21213p2 = enumC21213p3;
                    c28655q = c28655q3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                C2307m c2307m2 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                num4 = num6;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N6);
                if (z4) {
                    c28655q4.m87150e0(-1114991760);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q4, 48);
                    iHashCode5 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3409f3);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m7);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N7);
                    C27270o c27270o2 = new C27270o(AbstractC27274q.c.f109140f, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM21273g2 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q4, 0);
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (z19) {
                        objM87133R = new C21026a(onDismissRequest, 2);
                        c28655q4.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C21026a(onDismissRequest, 2);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    c0209i5 = c0209i2;
                    i26 = 1;
                    AbstractC27242b1.m82092d(c27270o2, strM21273g2, null, null, interfaceC4339a3, c28655q4, 0, 12);
                    C28655q c28655q9 = c28655q4;
                    c28655q9.m87173q(true);
                    c28655q9.m87173q(false);
                    c28655q2 = c28655q9;
                } else {
                    C28655q c28655q10 = c28655q4;
                    c0209i5 = c0209i2;
                    i26 = 1;
                    c28655q10.m87150e0(-1114414199);
                    c28655q10.m87173q(false);
                    c28655q2 = c28655q10;
                }
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m8);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N8);
                i27 = a.f80809a[enumC21213p3.ordinal()];
                if (i27 != i26) {
                    num5 = num4;
                    z17 = false;
                    c28655q2.m87150e0(445944667);
                    AbstractC25012a.m73388u(5, 4, c2314t, c28655q2, false);
                } else if (i27 != 2) {
                    num5 = num4;
                    z17 = false;
                    c28655q2.m87150e0(445947649);
                    m59475p(num5, c28655q2, (i15 >> 15) & 14);
                    c28655q2.m87173q(false);
                } else if (i27 != 3) {
                    if (i27 != 4) {
                        z17 = false;
                        c28655q2.m87150e0(445951933);
                        m59471l(c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        if (i27 == 5) {
                            throw AbstractC11895b.m32003v(445942795, c28655q2, false);
                        }
                        c28655q2.m87150e0(445953875);
                        z17 = false;
                        c28655q2.m87173q(false);
                    }
                    num5 = num4;
                } else {
                    z17 = false;
                    c28655q2.m87150e0(445949858);
                    num5 = num4;
                    m59473n(num5, c28655q2, (i15 >> 15) & 14);
                    c28655q2.m87173q(false);
                }
                if (textResource4 == null) {
                    c28655q2.m87150e0(939743630);
                    c28655q2.m87173q(z17);
                    z18 = i26;
                    c2314t2 = c2314t;
                    textResource5 = textResource4;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(939743631);
                    C23465k c23465kM59477r2 = m59477r(enumC21212o3, num5, z4);
                    TextResource textResource8 = textResource4;
                    strM21274h = AbstractC8693b.m21274h(textResource8, c28655q2, i15 & 14);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, ((C39174f) c23465kM59477r2.f92937w).f168413w, i26 * 4, ((C39174f) c23465kM59477r2.f92938x).f168413w, 0.0f, 8);
                    c2314t2 = c2314t;
                    if (z16) {
                        strM21274h = strM21274h.toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(strM21274h, "toUpperCase(...)");
                    }
                    C38072d c38072d2 = C38072d.f163053a;
                    long jM125430y2 = c38072d2.m121949b(c28655q2, 6).getBrandWhite();
                    i28 = a.f80810b[enumC21212o3.ordinal()];
                    if (i28 != 1) {
                        i29 = 3;
                    } else {
                        if (i28 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i29 = 5;
                    }
                    C2886a c2886aM8436q2 = c38072d2.m121952e(c28655q2, 6).getH3();
                    textResource5 = textResource8;
                    C28655q c28655q11 = c28655q2;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t3, jM125430y2, 0L, null, null, null, 0L, null, new C36775k(i29), 0L, 0, false, 0, 0, null, c2886aM8436q2, null, c28655q11, 0, 0, 196088);
                    C28655q c28655q12 = c28655q11;
                    c28655q12.m87173q(false);
                    z18 = 1;
                    c28655q3 = c28655q12;
                }
                c28655q3.m87173q(z18);
                c28655q3.m87173q(z18);
                float f14 = 8;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t2, 2 * f14, 0.0f, 0.0f, ((float) 1.5d) * f14, 6);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode4 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM3398t4);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m9);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N9);
                AbstractC11895b.m31978A((i15 >> 21) & 14, interfaceC4351m3, c28655q3, true, true);
                TextResource textResource9 = textResource5;
                num3 = num5;
                textResource3 = textResource9;
                EnumC21212o enumC21212o5 = enumC21212o3;
                interfaceC4351m2 = interfaceC4351m3;
                enumC21212o2 = enumC21212o5;
                z15 = z16;
                enumC21213p2 = enumC21213p3;
                c28655q = c28655q3;
            } else {
                C28655q c28655q13 = c28655q4;
                c28655q13.m87138X();
                z15 = z13;
                enumC21213p2 = enumC21213p;
                interfaceC4351m2 = interfaceC4351mM59434b;
                textResource3 = textResource2;
                num3 = num2;
                enumC21212o2 = enumC21212o;
                c28655q = c28655q13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(textResource3, z4, onDismissRequest, enumC21212o2, z15, num3, enumC21213p2, interfaceC4351m2, i13, i14);
            }
        }
        i15 |= 24576;
        i16 = i14 & 32;
        if (i16 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            num2 = num;
        } else {
            num2 = num;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87153g(num2)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
        }
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (enumC21213p == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC21213p.ordinal();
            }
            if (c28655q4.m87149e(iOrdinal)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i15 |= i19;
        }
        i24 = i14 & 128;
        if (i24 != 0) {
            i15 |= 12582912;
            interfaceC4351mM59434b = interfaceC4351m;
        } else {
            interfaceC4351mM59434b = interfaceC4351m;
            if ((i13 & 12582912) == 0) {
                if (c28655q4.m87157i(interfaceC4351mM59434b)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
        }
        if ((i15 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z14)) {
            if (i34 != 0) {
                textResource2 = null;
            }
            if (i35 != 0) {
                enumC21212o3 = EnumC21212o.CENTER;
            } else {
                enumC21212o3 = enumC21212o;
            }
            if (i36 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            if (i16 == 0) {
            }
            if (i18 != 0) {
                enumC21213p3 = EnumC21213p.DEFAULT;
            } else {
                enumC21213p3 = enumC21213p;
            }
            if (i24 != 0) {
                interfaceC4351mM59434b = C21199b.f80775a.m59434b();
            }
            c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q4, 0);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, c2314t);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a6);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m10);
            c0209i3 = C0217k.f732j;
            InterfaceC4351m interfaceC4351m4 = interfaceC4351mM59434b;
            if (c28655q4.f115903S) {
                textResource4 = textResource2;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
                C2307m c2307m3 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, false);
                num4 = num6;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11);
                if (z4) {
                    c28655q4.m87150e0(-1114991760);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q4, 48);
                    iHashCode5 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierM3409f5);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N12);
                    C27270o c27270o3 = new C27270o(AbstractC27274q.c.f109140f, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM21273g3 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q4, 0);
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (z19) {
                        objM87133R = new C21026a(onDismissRequest, 2);
                        c28655q4.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C21026a(onDismissRequest, 2);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    c0209i5 = c0209i2;
                    i26 = 1;
                    AbstractC27242b1.m82092d(c27270o3, strM21273g3, null, null, interfaceC4339a4, c28655q4, 0, 12);
                    C28655q c28655q14 = c28655q4;
                    c28655q14.m87173q(true);
                    c28655q14.m87173q(false);
                    c28655q2 = c28655q14;
                } else {
                    C28655q c28655q15 = c28655q4;
                    c0209i5 = c0209i2;
                    i26 = 1;
                    c28655q15.m87150e0(-1114414199);
                    c28655q15.m87173q(false);
                    c28655q2 = c28655q15;
                }
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3409f6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m13);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N13);
                i27 = a.f80809a[enumC21213p3.ordinal()];
                if (i27 != i26) {
                    num5 = num4;
                    z17 = false;
                    c28655q2.m87150e0(445944667);
                    AbstractC25012a.m73388u(5, 4, c2314t, c28655q2, false);
                } else if (i27 != 2) {
                    num5 = num4;
                    z17 = false;
                    c28655q2.m87150e0(445947649);
                    m59475p(num5, c28655q2, (i15 >> 15) & 14);
                    c28655q2.m87173q(false);
                } else if (i27 != 3) {
                    if (i27 != 4) {
                        z17 = false;
                        c28655q2.m87150e0(445951933);
                        m59471l(c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        if (i27 == 5) {
                            throw AbstractC11895b.m32003v(445942795, c28655q2, false);
                        }
                        c28655q2.m87150e0(445953875);
                        z17 = false;
                        c28655q2.m87173q(false);
                    }
                    num5 = num4;
                } else {
                    z17 = false;
                    c28655q2.m87150e0(445949858);
                    num5 = num4;
                    m59473n(num5, c28655q2, (i15 >> 15) & 14);
                    c28655q2.m87173q(false);
                }
                if (textResource4 == null) {
                    c28655q2.m87150e0(939743630);
                    c28655q2.m87173q(z17);
                    z18 = i26;
                    c2314t2 = c2314t;
                    textResource5 = textResource4;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(939743631);
                    C23465k c23465kM59477r3 = m59477r(enumC21212o3, num5, z4);
                    TextResource textResource10 = textResource4;
                    strM21274h = AbstractC8693b.m21274h(textResource10, c28655q2, i15 & 14);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, ((C39174f) c23465kM59477r3.f92937w).f168413w, i26 * 4, ((C39174f) c23465kM59477r3.f92938x).f168413w, 0.0f, 8);
                    c2314t2 = c2314t;
                    if (z16) {
                        strM21274h = strM21274h.toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(strM21274h, "toUpperCase(...)");
                    }
                    C38072d c38072d3 = C38072d.f163053a;
                    long jM125430y3 = c38072d3.m121949b(c28655q2, 6).getBrandWhite();
                    i28 = a.f80810b[enumC21212o3.ordinal()];
                    if (i28 != 1) {
                        i29 = 3;
                    } else {
                        if (i28 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i29 = 5;
                    }
                    C2886a c2886aM8436q3 = c38072d3.m121952e(c28655q2, 6).getH3();
                    textResource5 = textResource10;
                    C28655q c28655q16 = c28655q2;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t5, jM125430y3, 0L, null, null, null, 0L, null, new C36775k(i29), 0L, 0, false, 0, 0, null, c2886aM8436q3, null, c28655q16, 0, 0, 196088);
                    C28655q c28655q17 = c28655q16;
                    c28655q17.m87173q(false);
                    z18 = 1;
                    c28655q3 = c28655q17;
                }
                c28655q3.m87173q(z18);
                c28655q3.m87173q(z18);
                float f15 = 8;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t2, 2 * f15, 0.0f, 0.0f, ((float) 1.5d) * f15, 6);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode4 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q3.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q3, modifierM3398t6);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m14);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N14);
                AbstractC11895b.m31978A((i15 >> 21) & 14, interfaceC4351m4, c28655q3, true, true);
                TextResource textResource11 = textResource5;
                num3 = num5;
                textResource3 = textResource11;
                EnumC21212o enumC21212o6 = enumC21212o3;
                interfaceC4351m2 = interfaceC4351m4;
                enumC21212o2 = enumC21212o6;
                z15 = z16;
                enumC21213p2 = enumC21213p3;
                c28655q = c28655q3;
            } else {
                textResource4 = textResource2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
            C2307m c2307m4 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m4, false);
            num4 = num6;
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, c2314t);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d7);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m15);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N15);
            if (z4) {
                c28655q4.m87150e0(-1114991760);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q4, 48);
                iHashCode5 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierM3409f7);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m16);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N16);
                C27270o c27270o4 = new C27270o(AbstractC27274q.c.f109140f, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, false, false, false, 0.0f, false, 1020, null);
                String strM21273g4 = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q4, 0);
                if ((i15 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R = c28655q4.m87133R();
                if (z19) {
                    objM87133R = new C21026a(onDismissRequest, 2);
                    c28655q4.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21026a(onDismissRequest, 2);
                    c28655q4.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                c0209i5 = c0209i2;
                i26 = 1;
                AbstractC27242b1.m82092d(c27270o4, strM21273g4, null, null, interfaceC4339a5, c28655q4, 0, 12);
                C28655q c28655q18 = c28655q4;
                c28655q18.m87173q(true);
                c28655q18.m87173q(false);
                c28655q2 = c28655q18;
            } else {
                C28655q c28655q19 = c28655q4;
                c0209i5 = c0209i2;
                i26 = 1;
                c28655q19.m87150e0(-1114414199);
                c28655q19.m87173q(false);
                c28655q2 = c28655q19;
            }
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q2, 48);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3409f8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a10);
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m17);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N17);
            i27 = a.f80809a[enumC21213p3.ordinal()];
            if (i27 != i26) {
                num5 = num4;
                z17 = false;
                c28655q2.m87150e0(445944667);
                AbstractC25012a.m73388u(5, 4, c2314t, c28655q2, false);
            } else if (i27 != 2) {
                num5 = num4;
                z17 = false;
                c28655q2.m87150e0(445947649);
                m59475p(num5, c28655q2, (i15 >> 15) & 14);
                c28655q2.m87173q(false);
            } else if (i27 != 3) {
                if (i27 != 4) {
                    z17 = false;
                    c28655q2.m87150e0(445951933);
                    m59471l(c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    if (i27 == 5) {
                        throw AbstractC11895b.m32003v(445942795, c28655q2, false);
                    }
                    c28655q2.m87150e0(445953875);
                    z17 = false;
                    c28655q2.m87173q(false);
                }
                num5 = num4;
            } else {
                z17 = false;
                c28655q2.m87150e0(445949858);
                num5 = num4;
                m59473n(num5, c28655q2, (i15 >> 15) & 14);
                c28655q2.m87173q(false);
            }
            if (textResource4 == null) {
                c28655q2.m87150e0(939743630);
                c28655q2.m87173q(z17);
                z18 = i26;
                c2314t2 = c2314t;
                textResource5 = textResource4;
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(939743631);
                C23465k c23465kM59477r4 = m59477r(enumC21212o3, num5, z4);
                TextResource textResource12 = textResource4;
                strM21274h = AbstractC8693b.m21274h(textResource12, c28655q2, i15 & 14);
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, ((C39174f) c23465kM59477r4.f92937w).f168413w, i26 * 4, ((C39174f) c23465kM59477r4.f92938x).f168413w, 0.0f, 8);
                c2314t2 = c2314t;
                if (z16) {
                    strM21274h = strM21274h.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(strM21274h, "toUpperCase(...)");
                }
                C38072d c38072d4 = C38072d.f163053a;
                long jM125430y4 = c38072d4.m121949b(c28655q2, 6).getBrandWhite();
                i28 = a.f80810b[enumC21212o3.ordinal()];
                if (i28 != 1) {
                    i29 = 3;
                } else {
                    if (i28 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i29 = 5;
                }
                C2886a c2886aM8436q4 = c38072d4.m121952e(c28655q2, 6).getH3();
                textResource5 = textResource12;
                C28655q c28655q110 = c28655q2;
                AbstractC30795n.m94707h(strM21274h, modifierM3398t7, jM125430y4, 0L, null, null, null, 0L, null, new C36775k(i29), 0L, 0, false, 0, 0, null, c2886aM8436q4, null, c28655q110, 0, 0, 196088);
                C28655q c28655q111 = c28655q110;
                c28655q111.m87173q(false);
                z18 = 1;
                c28655q3 = c28655q111;
            }
            c28655q3.m87173q(z18);
            c28655q3.m87173q(z18);
            float f16 = 8;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t2, 2 * f16, 0.0f, 0.0f, ((float) 1.5d) * f16, 6);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m4, false);
            iHashCode4 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q3.m87165m();
            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q3, modifierM3398t8);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m18);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N18);
            AbstractC11895b.m31978A((i15 >> 21) & 14, interfaceC4351m4, c28655q3, true, true);
            TextResource textResource13 = textResource5;
            num3 = num5;
            textResource3 = textResource13;
            EnumC21212o enumC21212o7 = enumC21212o3;
            interfaceC4351m2 = interfaceC4351m4;
            enumC21212o2 = enumC21212o7;
            z15 = z16;
            enumC21213p2 = enumC21213p3;
            c28655q = c28655q3;
        } else {
            C28655q c28655q112 = c28655q4;
            c28655q112.m87138X();
            z15 = z13;
            enumC21213p2 = enumC21213p;
            interfaceC4351m2 = interfaceC4351mM59434b;
            textResource3 = textResource2;
            num3 = num2;
            enumC21212o2 = enumC21212o;
            c28655q = c28655q112;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9785i(textResource3, z4, onDismissRequest, enumC21212o2, z15, num3, enumC21213p2, interfaceC4351m2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m59467h(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m59468i(TextResource textResource, boolean z4, InterfaceC4339a interfaceC4339a, EnumC21212o enumC21212o, boolean z13, Integer num, EnumC21213p enumC21213p, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m59466g(textResource, z4, interfaceC4339a, enumC21212o, z13, num, enumC21213p, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m59469j(int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(967654717);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            float f13 = 4;
            float f14 = 5 * f13;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i15 << 3) & 112) | 6), null, AbstractC1102d.m3415l(((float) 9.5d) * f13, AbstractC1099a.m3398t(c2314t, f13 * f13, 0.0f, 0.0f, 0.0f, 14)), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3444h(i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m59470k(int i13, int i14, Composer composer, int i15) {
        m59469j(i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m59471l(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(26710144);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 6 * f13, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(10 * f13, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m59472m(int i13, Composer composer, int i14) {
        m59471l(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m59473n(Integer num, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1185736873);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(num) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (num == null) {
                c28655q.m87150e0(-961126186);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-961126185);
                m59469j(num.intValue(), c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21205h(num, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m59474o(Integer num, int i13, Composer composer, int i14) {
        m59473n(num, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m59475p(Integer num, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1203061528);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(num) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (num == null) {
                c28655q.m87150e0(1862277577);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1862277578);
                m59469j(num.intValue(), c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21205h(num, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m59476q(Integer num, int i13, Composer composer, int i14) {
        m59475p(num, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final C23465k m59477r(EnumC21212o enumC21212o, Integer num, boolean z4) {
        float f13;
        float f14;
        float f15 = ((num == null && z4) ? 6 : 0) * 4;
        if (enumC21212o == EnumC21212o.LEFT) {
            f13 = 2;
            f14 = 8;
        } else {
            f13 = (enumC21212o == EnumC21212o.CENTER && num == null && z4) ? 6 : 0;
            f14 = 4;
        }
        return new C23465k(new C39174f(f13 * f14), new C39174f(f15));
    }
}

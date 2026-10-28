package p736sz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17808z1;
import i21.C17994d;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import qz0.AbstractC30795n;
import sr2.C32940v;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sz0.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a·\u0001\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lsz0/f1;", "statAlignment", "Lcom/whoop/design/util/TextResource;", "stat", "", "icon", "statSuffix", "Lsz0/h1;", "statSuffixType", "Lsz0/g1;", "statTrend", "statTitle", "", "isPressed", "Li2/x;", "statValueTextColor", "statTitleTextColor", "Lb91/a;", "statValueStyle", "statSuffixStyle", "statTitleStyle", "forcesStatAndSuffixLeftToRight", "Lkotlin/Function0;", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V", "suffixType", "j", "(Landroidx/compose/ui/Modifier;Lsz0/h1;)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33207p {

    /* JADX INFO: renamed from: sz0.p$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f138459a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f138460b;

        static {
            int[] iArr = new int[EnumC33179f1.values().length];
            try {
                iArr[EnumC33179f1.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33179f1.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f138459a = iArr;
            int[] iArr2 = new int[EnumC33185h1.values().length];
            try {
                iArr2[EnumC33185h1.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC33185h1.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f138460b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0153  */
    /* JADX WARN: Code duplicated, block: B:110:0x0159  */
    /* JADX WARN: Code duplicated, block: B:112:0x015d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x016f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x017b  */
    /* JADX WARN: Code duplicated, block: B:125:0x017f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x018a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x0196  */
    /* JADX WARN: Code duplicated, block: B:136:0x019a  */
    /* JADX WARN: Code duplicated, block: B:137:0x019f  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:156:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:166:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:174:0x0208  */
    /* JADX WARN: Code duplicated, block: B:178:0x0214  */
    /* JADX WARN: Code duplicated, block: B:181:0x021d  */
    /* JADX WARN: Code duplicated, block: B:183:0x022b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x0276  */
    /* JADX WARN: Code duplicated, block: B:206:0x0279  */
    /* JADX WARN: Code duplicated, block: B:207:0x027c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0280  */
    /* JADX WARN: Code duplicated, block: B:210:0x0282  */
    /* JADX WARN: Code duplicated, block: B:212:0x0286  */
    /* JADX WARN: Code duplicated, block: B:214:0x0289  */
    /* JADX WARN: Code duplicated, block: B:215:0x028c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0290  */
    /* JADX WARN: Code duplicated, block: B:218:0x0292  */
    /* JADX WARN: Code duplicated, block: B:220:0x0296  */
    /* JADX WARN: Code duplicated, block: B:221:0x0299  */
    /* JADX WARN: Code duplicated, block: B:224:0x029f  */
    /* JADX WARN: Code duplicated, block: B:225:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:228:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:229:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:232:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:236:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:240:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:241:0x0310  */
    /* JADX WARN: Code duplicated, block: B:243:0x0316  */
    /* JADX WARN: Code duplicated, block: B:244:0x0318  */
    /* JADX WARN: Code duplicated, block: B:246:0x031c  */
    /* JADX WARN: Code duplicated, block: B:248:0x0322  */
    /* JADX WARN: Code duplicated, block: B:249:0x032f  */
    /* JADX WARN: Code duplicated, block: B:251:0x0346  */
    /* JADX WARN: Code duplicated, block: B:254:0x035f  */
    /* JADX WARN: Code duplicated, block: B:256:0x036f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0371  */
    /* JADX WARN: Code duplicated, block: B:260:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x037a  */
    /* JADX WARN: Code duplicated, block: B:263:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:266:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:268:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:269:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:271:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:274:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:275:0x0401  */
    /* JADX WARN: Code duplicated, block: B:278:0x0414  */
    /* JADX WARN: Code duplicated, block: B:280:0x0422  */
    /* JADX WARN: Code duplicated, block: B:283:0x0453  */
    /* JADX WARN: Code duplicated, block: B:284:0x0457  */
    /* JADX WARN: Code duplicated, block: B:287:0x0464  */
    /* JADX WARN: Code duplicated, block: B:289:0x0472  */
    /* JADX WARN: Code duplicated, block: B:292:0x047a  */
    /* JADX WARN: Code duplicated, block: B:295:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:296:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:298:0x0504  */
    /* JADX WARN: Code duplicated, block: B:299:0x0513  */
    /* JADX WARN: Code duplicated, block: B:301:0x056b  */
    /* JADX WARN: Code duplicated, block: B:302:0x056f  */
    /* JADX WARN: Code duplicated, block: B:305:0x057c  */
    /* JADX WARN: Code duplicated, block: B:307:0x058a  */
    /* JADX WARN: Code duplicated, block: B:311:0x0629  */
    /* JADX WARN: Code duplicated, block: B:314:0x064d  */
    /* JADX WARN: Code duplicated, block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:88:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:95:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public static final void m105301e(Modifier modifier, EnumC33179f1 enumC33179f1, final TextResource stat, Integer num, TextResource textResource, EnumC33185h1 enumC33185h1, C33182g1 c33182g1, final TextResource statTitle, boolean z4, long j7, long j13, C2886a c2886a, C2886a c2886a2, C2886a c2886a3, boolean z13, InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        int i17;
        int i18;
        TextResource textResource2;
        int i19;
        int i24;
        int i25;
        int iOrdinal;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z14;
        final EnumC33179f1 enumC33179f2;
        final EnumC33185h1 enumC33185h2;
        final boolean z15;
        final C2886a c2886a4;
        final C2886a c2886a5;
        final C2886a c2886a6;
        final boolean z16;
        final InterfaceC4339a interfaceC4339a2;
        C28655q c28655q;
        final TextResource textResource3;
        final Modifier modifier3;
        final C33182g1 c33182g2;
        final long j14;
        final long j15;
        final Integer num2;
        C28677v1 c28677v1M87180u;
        int i44;
        C28676v0 c28676v0;
        C2314t c2314t;
        EnumC33179f1 enumC33179f3;
        Integer num3;
        EnumC33185h1 enumC33185h3;
        C33182g1 c33182g3;
        boolean z17;
        long jM125430y;
        int i45;
        int i46;
        long jM125382b1;
        C2886a c2886aM8403A;
        C2886a c2886aM8420a;
        C2886a c2886aM8415M;
        boolean z18;
        EnumC33179f1 enumC33179f4;
        C2886a c2886a7;
        C2886a c2886a8;
        boolean z19;
        int i47;
        Integer num4;
        int i48;
        C33182g1 c33182g4;
        C2886a c2886a9;
        InterfaceC4339a interfaceC4339a3;
        Object objM87133R;
        Modifier modifier4;
        Modifier modifierM3362g;
        int i49;
        C2305k c2305k;
        EnumC39181m enumC39181m;
        int iHashCode;
        C33182g1 c33182g5;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int iHashCode2;
        boolean z24;
        int iHashCode3;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objM87133R2;
        boolean zM87157i;
        boolean zM87157i2;
        boolean zM87157i3;
        int i54;
        AbstractC22676k.m65750j(stat, "stat");
        AbstractC22676k.m65750j(statTitle, "statTitle");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1179550475);
        int i55 = i15 & 1;
        if (i55 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        int i56 = i15 & 2;
        int i57 = 16;
        if (i56 != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87149e(enumC33179f1 == null ? -1 : enumC33179f1.ordinal()) ? 32 : 16;
        }
        int i58 = 128;
        if ((i13 & 384) == 0) {
            i16 |= c28655q2.m87153g(stat) ? 256 : 128;
        }
        int i59 = i15 & 8;
        int i64 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i59 == 0) {
            if ((i13 & 3072) == 0) {
                i16 |= c28655q2.m87153g(num) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            if (i17 != 0) {
                if ((i13 & 24576) == 0) {
                    textResource2 = textResource;
                    if (c28655q2.m87153g(textResource2)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 32;
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                if (i24 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (enumC33185h1 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC33185h1.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(c33182g1)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i16 |= i28;
                    }
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87153g(statTitle)) {
                            i54 = 8388608;
                        } else {
                            i54 = 4194304;
                        }
                        i16 |= i54;
                    }
                    i29 = i15 & 256;
                    if (i29 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87155h(z4)) {
                                i34 = 67108864;
                            } else {
                                i34 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i16 |= i34;
                        }
                        if ((i13 & 805306368) != 0) {
                            i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                        }
                        if ((i14 & 6) == 0) {
                            i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                        } else {
                            i35 = i14;
                        }
                        if ((i14 & 48) == 0) {
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                                if ((i14 & 64) == 0) {
                                    zM87157i3 = c28655q2.m87153g(c2886a);
                                } else {
                                    zM87157i3 = c28655q2.m87157i(c2886a);
                                }
                                if (zM87157i3) {
                                    i57 = 32;
                                }
                            }
                            i35 |= i57;
                        }
                        if ((i14 & 384) == 0) {
                            if ((i15 & 4096) == 0) {
                                if ((i14 & 512) == 0) {
                                    zM87157i2 = c28655q2.m87153g(c2886a2);
                                } else {
                                    zM87157i2 = c28655q2.m87157i(c2886a2);
                                }
                                if (zM87157i2) {
                                    i58 = 256;
                                }
                            }
                            i35 |= i58;
                        }
                        if ((i14 & 3072) == 0) {
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                                if ((i14 & 4096) == 0) {
                                    zM87157i = c28655q2.m87153g(c2886a3);
                                } else {
                                    zM87157i = c28655q2.m87157i(c2886a3);
                                }
                                if (zM87157i) {
                                    i64 = 2048;
                                }
                            }
                            i35 |= i64;
                        }
                        i36 = i35;
                        i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                        if (i37 != 0) {
                            if ((i14 & 24576) == 0) {
                                if (!c28655q2.m87155h(z13)) {
                                    i18 = 8192;
                                }
                                i36 |= i18;
                            }
                            i38 = i15 & 32768;
                            if (i38 != 0) {
                                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                                if (c28655q2.m87157i(interfaceC4339a)) {
                                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                                }
                                i36 |= i25;
                            }
                            i39 = i16;
                            if ((i16 & 306783379) == 306783378 || (74899 & i36) != 74898) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (c28655q2.m87135U(i39 & 1, z14)) {
                                c28655q2.m87140Z();
                                i44 = i13 & 1;
                                c28676v0 = C28635l.f115821a;
                                c2314t = C2314t.f9131w;
                                if (i44 != 0 || c28655q2.m87118C()) {
                                    if (i55 != 0) {
                                        modifier2 = c2314t;
                                    }
                                    if (i56 != 0) {
                                        enumC33179f3 = EnumC33179f1.Start;
                                    } else {
                                        enumC33179f3 = enumC33179f1;
                                    }
                                    if (i59 != 0) {
                                        num3 = null;
                                    } else {
                                        num3 = num;
                                    }
                                    if (i17 != 0) {
                                        textResource2 = null;
                                    }
                                    if (i24 != 0) {
                                        enumC33185h3 = EnumC33185h1.TEXT;
                                    } else {
                                        enumC33185h3 = enumC33185h1;
                                    }
                                    if (i27 != 0) {
                                        c33182g3 = null;
                                    } else {
                                        c33182g3 = c33182g1;
                                    }
                                    if (i29 != 0) {
                                        z17 = false;
                                    } else {
                                        z17 = z4;
                                    }
                                    if ((i15 & 512) != 0) {
                                        i45 = i39 & (-1879048193);
                                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                    } else {
                                        jM125430y = j7;
                                        i45 = i39;
                                    }
                                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                        i46 = 6;
                                        i36 &= -15;
                                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                    } else {
                                        i46 = 6;
                                        jM125382b1 = j13;
                                    }
                                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                        i36 &= -113;
                                    } else {
                                        c2886aM8403A = c2886a;
                                    }
                                    if ((i15 & 4096) != 0) {
                                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                        i36 &= -897;
                                    } else {
                                        c2886aM8420a = c2886a2;
                                    }
                                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                        i36 &= -7169;
                                    } else {
                                        c2886aM8415M = c2886a3;
                                    }
                                    if (i37 != 0) {
                                        z18 = false;
                                    } else {
                                        z18 = z13;
                                    }
                                    if (i38 != 0) {
                                        objM87133R = c28655q2.m87133R();
                                        if (objM87133R == c28676v0) {
                                            objM87133R = new C32940v(15);
                                            c28655q2.m87172p0(objM87133R);
                                        }
                                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                                        c2886a7 = c2886aM8403A;
                                        c2886a8 = c2886aM8415M;
                                        z19 = z18;
                                        i47 = i36;
                                        num4 = num3;
                                        i48 = i45;
                                        c33182g4 = c33182g3;
                                        c2886a9 = c2886aM8420a;
                                        interfaceC4339a3 = interfaceC4339a4;
                                        enumC33179f4 = enumC33179f3;
                                    } else {
                                        C2886a c2886a10 = c2886aM8415M;
                                        enumC33179f4 = enumC33179f3;
                                        c2886a7 = c2886aM8403A;
                                        c2886a8 = c2886a10;
                                        z19 = z18;
                                        i47 = i36;
                                        num4 = num3;
                                        i48 = i45;
                                        c33182g4 = c33182g3;
                                        c2886a9 = c2886aM8420a;
                                        interfaceC4339a3 = interfaceC4339a;
                                    }
                                } else {
                                    c28655q2.m87138X();
                                    int i65 = (i15 & 512) != 0 ? i39 & (-1879048193) : i39;
                                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                        i36 &= -15;
                                    }
                                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                        i36 &= -113;
                                    }
                                    if ((i15 & 4096) != 0) {
                                        i36 &= -897;
                                    }
                                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                        i36 &= -7169;
                                    }
                                    enumC33185h3 = enumC33185h1;
                                    z17 = z4;
                                    jM125430y = j7;
                                    jM125382b1 = j13;
                                    c2886a7 = c2886a;
                                    c2886a9 = c2886a2;
                                    z19 = z13;
                                    interfaceC4339a3 = interfaceC4339a;
                                    i48 = i65;
                                    c2886a8 = c2886a3;
                                    i47 = i36;
                                    enumC33179f4 = enumC33179f1;
                                    num4 = num;
                                    c33182g4 = c33182g1;
                                }
                                c28655q2.m87175r();
                                if (num4 != null) {
                                    c28655q2.m87150e0(323385136);
                                    if ((i47 & 458752) == 131072) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    objM87133R2 = c28655q2.m87133R();
                                    if (z27 || objM87133R2 == c28676v0) {
                                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                        c28655q2.m87172p0(objM87133R2);
                                    }
                                    Modifier modifier5 = modifier2;
                                    modifierM3362g = AbstractC1092a.m3362g(modifier5, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                                    modifier4 = modifier5;
                                    c28655q2.m87173q(false);
                                } else {
                                    modifier4 = modifier2;
                                    c28655q2.m87150e0(323386173);
                                    c28655q2.m87173q(false);
                                    modifierM3362g = modifier4;
                                }
                                i49 = a.f138459a[enumC33179f4.ordinal()];
                                if (i49 != 1) {
                                    c2305k = C2299e.f9110M;
                                } else {
                                    if (i49 == 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    c2305k = C2299e.f9111N;
                                }
                                C28674u2 c28674u2 = AbstractC2453v1.f9575n;
                                enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u2);
                                Modifier modifier6 = modifier4;
                                num = num4;
                                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                                iHashCode = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                                InterfaceC0221l.f734a.getClass();
                                c33182g5 = c33182g4;
                                c0213j = C0217k.f724b;
                                c28655q2.m87158i0();
                                C2886a c2886a11 = c2886a7;
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                c0209i = C0217k.f729g;
                                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                                c0209i2 = C0217k.f728f;
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                                c0209i3 = C0217k.f732j;
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                                }
                                c0209i4 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                                Modifier modifierM3429z = AbstractC1102d.m3429z(c2314t, null, 3);
                                C2886a c2886a12 = c2886a9;
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                                InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3429z);
                                c28655q2.m87158i0();
                                TextResource textResource4 = textResource2;
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
                                if (z19) {
                                    enumC39181m = EnumC39181m.f168423w;
                                }
                                EnumC33185h1 enumC33185h4 = enumC33185h3;
                                long j16 = jM125430y;
                                AbstractC28683x.m87247a(c28674u2.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j16, c2886a11, textResource4, enumC33185h4, c2886a12)), c28655q2, 56);
                                if (num == null) {
                                    c28655q2.m87150e0(109632338);
                                    z24 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(109632339);
                                    int iIntValue = num.intValue();
                                    AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                                    float f13 = 4;
                                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue, c28655q2, 6), null, AbstractC1102d.m3415l(f13 * f13, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                                    z24 = false;
                                    c28655q2.m87173q(false);
                                }
                                if (c33182g5 == null) {
                                    c28655q2.m87150e0(110152053);
                                    c28655q2.m87173q(z24);
                                    z26 = z17;
                                    z25 = true;
                                } else {
                                    c28655q2.m87150e0(110152054);
                                    float f14 = 8;
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f14, 0.0f, 0.0f, 0.0f, 14));
                                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f14, 0.0f, 0.0f, 13);
                                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                                    c28655q2.m87158i0();
                                    if (c28655q2.f115903S) {
                                        c28655q2.m87163l(c0213j);
                                    } else {
                                        c28655q2.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                    }
                                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                                    z25 = true;
                                    boolean z28 = z17;
                                    AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z28, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                                    z26 = z28;
                                    c28655q2.m87173q(true);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(z25);
                                long j17 = jM125382b1;
                                C2886a c2886a13 = c2886a8;
                                c28655q = c28655q2;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a13, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                                c28655q2.m87173q(z25);
                                modifier3 = modifier6;
                                interfaceC4339a2 = interfaceC4339a5;
                                z15 = z26;
                                c2886a4 = c2886a11;
                                j15 = j17;
                                c2886a6 = c2886a13;
                                z16 = z19;
                                j14 = j16;
                                textResource3 = textResource4;
                                enumC33185h2 = enumC33185h4;
                                c2886a5 = c2886a12;
                                enumC33179f2 = enumC33179f4;
                                c33182g2 = c33182g5;
                            } else {
                                c28655q2.m87138X();
                                enumC33179f2 = enumC33179f1;
                                enumC33185h2 = enumC33185h1;
                                z15 = z4;
                                c2886a4 = c2886a;
                                c2886a5 = c2886a2;
                                c2886a6 = c2886a3;
                                z16 = z13;
                                interfaceC4339a2 = interfaceC4339a;
                                c28655q = c28655q2;
                                textResource3 = textResource2;
                                modifier3 = modifier2;
                                c33182g2 = c33182g1;
                                j14 = j7;
                                j15 = j13;
                            }
                            num2 = num;
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue2);
                                    }
                                };
                            }
                        }
                        i36 |= 24576;
                        i38 = i15 & 32768;
                        if (i38 != 0) {
                            i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            }
                            i36 |= i25;
                        }
                        i39 = i16;
                        if ((i16 & 306783379) == 306783378) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (c28655q2.m87135U(i39 & 1, z14)) {
                            c28655q2.m87140Z();
                            i44 = i13 & 1;
                            c28676v0 = C28635l.f115821a;
                            c2314t = C2314t.f9131w;
                            if (i44 != 0) {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a6;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a14 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a14;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            } else {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a7;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a15 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a15;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            }
                            c28655q2.m87175r();
                            if (num4 != null) {
                                c28655q2.m87150e0(323385136);
                                if ((i47 & 458752) == 131072) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                objM87133R2 = c28655q2.m87133R();
                                if (z27) {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                Modifier modifier7 = modifier2;
                                modifierM3362g = AbstractC1092a.m3362g(modifier7, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                                modifier4 = modifier7;
                                c28655q2.m87173q(false);
                            } else {
                                modifier4 = modifier2;
                                c28655q2.m87150e0(323386173);
                                c28655q2.m87173q(false);
                                modifierM3362g = modifier4;
                            }
                            i49 = a.f138459a[enumC33179f4.ordinal()];
                            if (i49 != 1) {
                                c2305k = C2299e.f9110M;
                            } else {
                                if (i49 == 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c2305k = C2299e.f9111N;
                            }
                            C28674u2 c28674u3 = AbstractC2453v1.f9575n;
                            enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u3);
                            Modifier modifier8 = modifier4;
                            num = num4;
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                            InterfaceC0221l.f734a.getClass();
                            c33182g5 = c33182g4;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            C2886a c2886a16 = c2886a7;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            c0209i = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                            c0209i2 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                            c0209i3 = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                            Modifier modifierM3429z2 = AbstractC1102d.m3429z(c2314t, null, 3);
                            C2886a c2886a17 = c2886a9;
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                            InterfaceC4339a interfaceC4339a8 = interfaceC4339a3;
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3429z2);
                            c28655q2.m87158i0();
                            TextResource textResource5 = textResource2;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                            if (z19) {
                                enumC39181m = EnumC39181m.f168423w;
                            }
                            EnumC33185h1 enumC33185h5 = enumC33185h3;
                            long j18 = jM125430y;
                            AbstractC28683x.m87247a(c28674u3.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j18, c2886a16, textResource5, enumC33185h5, c2886a17)), c28655q2, 56);
                            if (num == null) {
                                c28655q2.m87150e0(109632338);
                                z24 = false;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(109632339);
                                int iIntValue2 = num.intValue();
                                AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                                float f15 = 4;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue2, c28655q2, 6), null, AbstractC1102d.m3415l(f15 * f15, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                                z24 = false;
                                c28655q2.m87173q(false);
                            }
                            if (c33182g5 == null) {
                                c28655q2.m87150e0(110152053);
                                c28655q2.m87173q(z24);
                                z26 = z17;
                                z25 = true;
                            } else {
                                c28655q2.m87150e0(110152054);
                                float f16 = 8;
                                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f16, 0.0f, 0.0f, 0.0f, 14));
                                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f16, 0.0f, 0.0f, 13);
                                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m6);
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N6);
                                z25 = true;
                                boolean z29 = z17;
                                AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z29, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                                z26 = z29;
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z25);
                            long j19 = jM125382b1;
                            C2886a c2886a18 = c2886a8;
                            c28655q = c28655q2;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j19, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a18, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                            c28655q2.m87173q(z25);
                            modifier3 = modifier8;
                            interfaceC4339a2 = interfaceC4339a8;
                            z15 = z26;
                            c2886a4 = c2886a16;
                            j15 = j19;
                            c2886a6 = c2886a18;
                            z16 = z19;
                            j14 = j18;
                            textResource3 = textResource5;
                            enumC33185h2 = enumC33185h5;
                            c2886a5 = c2886a17;
                            enumC33179f2 = enumC33179f4;
                            c33182g2 = c33182g5;
                        } else {
                            c28655q2.m87138X();
                            enumC33179f2 = enumC33179f1;
                            enumC33185h2 = enumC33185h1;
                            z15 = z4;
                            c2886a4 = c2886a;
                            c2886a5 = c2886a2;
                            c2886a6 = c2886a3;
                            z16 = z13;
                            interfaceC4339a2 = interfaceC4339a;
                            c28655q = c28655q2;
                            textResource3 = textResource2;
                            modifier3 = modifier2;
                            c33182g2 = c33182g1;
                            j14 = j7;
                            j15 = j13;
                        }
                        num2 = num;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue3);
                                }
                            };
                        }
                    }
                    i16 |= 100663296;
                    if ((i13 & 805306368) != 0) {
                        i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 6) == 0) {
                        i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                    } else {
                        i35 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                            if ((i14 & 64) == 0) {
                                zM87157i3 = c28655q2.m87153g(c2886a);
                            } else {
                                zM87157i3 = c28655q2.m87157i(c2886a);
                            }
                            if (zM87157i3) {
                                i57 = 32;
                            }
                        }
                        i35 |= i57;
                    }
                    if ((i14 & 384) == 0) {
                        if ((i15 & 4096) == 0) {
                            if ((i14 & 512) == 0) {
                                zM87157i2 = c28655q2.m87153g(c2886a2);
                            } else {
                                zM87157i2 = c28655q2.m87157i(c2886a2);
                            }
                            if (zM87157i2) {
                                i58 = 256;
                            }
                        }
                        i35 |= i58;
                    }
                    if ((i14 & 3072) == 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                            if ((i14 & 4096) == 0) {
                                zM87157i = c28655q2.m87153g(c2886a3);
                            } else {
                                zM87157i = c28655q2.m87157i(c2886a3);
                            }
                            if (zM87157i) {
                                i64 = 2048;
                            }
                        }
                        i35 |= i64;
                    }
                    i36 = i35;
                    i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i37 != 0) {
                        if ((i14 & 24576) == 0) {
                            if (!c28655q2.m87155h(z13)) {
                                i18 = 8192;
                            }
                            i36 |= i18;
                        }
                        i38 = i15 & 32768;
                        if (i38 != 0) {
                            i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            }
                            i36 |= i25;
                        }
                        i39 = i16;
                        if ((i16 & 306783379) == 306783378) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (c28655q2.m87135U(i39 & 1, z14)) {
                            c28655q2.m87140Z();
                            i44 = i13 & 1;
                            c28676v0 = C28635l.f115821a;
                            c2314t = C2314t.f9131w;
                            if (i44 != 0) {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a9;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a19 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a19;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            } else {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a10;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a110 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a110;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            }
                            c28655q2.m87175r();
                            if (num4 != null) {
                                c28655q2.m87150e0(323385136);
                                if ((i47 & 458752) == 131072) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                objM87133R2 = c28655q2.m87133R();
                                if (z27) {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                Modifier modifier9 = modifier2;
                                modifierM3362g = AbstractC1092a.m3362g(modifier9, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                                modifier4 = modifier9;
                                c28655q2.m87173q(false);
                            } else {
                                modifier4 = modifier2;
                                c28655q2.m87150e0(323386173);
                                c28655q2.m87173q(false);
                                modifierM3362g = modifier4;
                            }
                            i49 = a.f138459a[enumC33179f4.ordinal()];
                            if (i49 != 1) {
                                c2305k = C2299e.f9110M;
                            } else {
                                if (i49 == 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c2305k = C2299e.f9111N;
                            }
                            C28674u2 c28674u4 = AbstractC2453v1.f9575n;
                            enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u4);
                            Modifier modifier10 = modifier4;
                            num = num4;
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                            InterfaceC0221l.f734a.getClass();
                            c33182g5 = c33182g4;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            C2886a c2886a111 = c2886a7;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            c0209i = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
                            c0209i2 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m7);
                            c0209i3 = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N7);
                            Modifier modifierM3429z3 = AbstractC1102d.m3429z(c2314t, null, 3);
                            C2886a c2886a112 = c2886a9;
                            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                            InterfaceC4339a interfaceC4339a11 = interfaceC4339a3;
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3429z3);
                            c28655q2.m87158i0();
                            TextResource textResource6 = textResource2;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a3);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m8);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N8);
                            if (z19) {
                                enumC39181m = EnumC39181m.f168423w;
                            }
                            EnumC33185h1 enumC33185h6 = enumC33185h3;
                            long j110 = jM125430y;
                            AbstractC28683x.m87247a(c28674u4.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j110, c2886a111, textResource6, enumC33185h6, c2886a112)), c28655q2, 56);
                            if (num == null) {
                                c28655q2.m87150e0(109632338);
                                z24 = false;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(109632339);
                                int iIntValue3 = num.intValue();
                                AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                                float f17 = 4;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue3, c28655q2, 6), null, AbstractC1102d.m3415l(f17 * f17, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                                z24 = false;
                                c28655q2.m87173q(false);
                            }
                            if (c33182g5 == null) {
                                c28655q2.m87150e0(110152053);
                                c28655q2.m87173q(z24);
                                z26 = z17;
                                z25 = true;
                            } else {
                                c28655q2.m87150e0(110152054);
                                float f18 = 8;
                                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f18, 0.0f, 0.0f, 0.0f, 14));
                                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f18, 0.0f, 0.0f, 13);
                                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3398t3);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m9);
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N9);
                                z25 = true;
                                boolean z210 = z17;
                                AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z210, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                                z26 = z210;
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z25);
                            long j111 = jM125382b1;
                            C2886a c2886a113 = c2886a8;
                            c28655q = c28655q2;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                            c28655q2.m87173q(z25);
                            modifier3 = modifier10;
                            interfaceC4339a2 = interfaceC4339a11;
                            z15 = z26;
                            c2886a4 = c2886a111;
                            j15 = j111;
                            c2886a6 = c2886a113;
                            z16 = z19;
                            j14 = j110;
                            textResource3 = textResource6;
                            enumC33185h2 = enumC33185h6;
                            c2886a5 = c2886a112;
                            enumC33179f2 = enumC33179f4;
                            c33182g2 = c33182g5;
                        } else {
                            c28655q2.m87138X();
                            enumC33179f2 = enumC33179f1;
                            enumC33185h2 = enumC33185h1;
                            z15 = z4;
                            c2886a4 = c2886a;
                            c2886a5 = c2886a2;
                            c2886a6 = c2886a3;
                            z16 = z13;
                            interfaceC4339a2 = interfaceC4339a;
                            c28655q = c28655q2;
                            textResource3 = textResource2;
                            modifier3 = modifier2;
                            c33182g2 = c33182g1;
                            j14 = j7;
                            j15 = j13;
                        }
                        num2 = num;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue4 = ((Integer) obj2).intValue();
                                    return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue4);
                                }
                            };
                        }
                    }
                    i36 |= 24576;
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a12;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a114 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a114;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a13;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a115 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a115;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier11 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier11, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier11;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u5 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u5);
                        Modifier modifier12 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a116 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m10);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N10);
                        Modifier modifierM3429z4 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a117 = c2886a9;
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a14 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3429z4);
                        c28655q2.m87158i0();
                        TextResource textResource7 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h7 = enumC33185h3;
                        long j112 = jM125430y;
                        AbstractC28683x.m87247a(c28674u5.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j112, c2886a116, textResource7, enumC33185h7, c2886a117)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue4 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f19 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue4, c28655q2, 6), null, AbstractC1102d.m3415l(f19 * f19, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f110 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f110, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f110, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3398t4);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d4);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m12);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N12);
                            z25 = true;
                            boolean z211 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z211, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z211;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j113 = jM125382b1;
                        C2886a c2886a118 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j113, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier12;
                        interfaceC4339a2 = interfaceC4339a14;
                        z15 = z26;
                        c2886a4 = c2886a116;
                        j15 = j113;
                        c2886a6 = c2886a118;
                        z16 = z19;
                        j14 = j112;
                        textResource3 = textResource7;
                        enumC33185h2 = enumC33185h7;
                        c2886a5 = c2886a117;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue5 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue5);
                            }
                        };
                    }
                }
                i16 |= 1572864;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(statTitle)) {
                        i54 = 8388608;
                    } else {
                        i54 = 4194304;
                    }
                    i16 |= i54;
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z4)) {
                            i34 = 67108864;
                        } else {
                            i34 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i34;
                    }
                    if ((i13 & 805306368) != 0) {
                        i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 6) == 0) {
                        i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                    } else {
                        i35 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                            if ((i14 & 64) == 0) {
                                zM87157i3 = c28655q2.m87153g(c2886a);
                            } else {
                                zM87157i3 = c28655q2.m87157i(c2886a);
                            }
                            if (zM87157i3) {
                                i57 = 32;
                            }
                        }
                        i35 |= i57;
                    }
                    if ((i14 & 384) == 0) {
                        if ((i15 & 4096) == 0) {
                            if ((i14 & 512) == 0) {
                                zM87157i2 = c28655q2.m87153g(c2886a2);
                            } else {
                                zM87157i2 = c28655q2.m87157i(c2886a2);
                            }
                            if (zM87157i2) {
                                i58 = 256;
                            }
                        }
                        i35 |= i58;
                    }
                    if ((i14 & 3072) == 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                            if ((i14 & 4096) == 0) {
                                zM87157i = c28655q2.m87153g(c2886a3);
                            } else {
                                zM87157i = c28655q2.m87157i(c2886a3);
                            }
                            if (zM87157i) {
                                i64 = 2048;
                            }
                        }
                        i35 |= i64;
                    }
                    i36 = i35;
                    i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i37 != 0) {
                        if ((i14 & 24576) == 0) {
                            if (!c28655q2.m87155h(z13)) {
                                i18 = 8192;
                            }
                            i36 |= i18;
                        }
                        i38 = i15 & 32768;
                        if (i38 != 0) {
                            i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            }
                            i36 |= i25;
                        }
                        i39 = i16;
                        if ((i16 & 306783379) == 306783378) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (c28655q2.m87135U(i39 & 1, z14)) {
                            c28655q2.m87140Z();
                            i44 = i13 & 1;
                            c28676v0 = C28635l.f115821a;
                            c2314t = C2314t.f9131w;
                            if (i44 != 0) {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a15;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a119 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a119;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            } else {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a16;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a1110 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a1110;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            }
                            c28655q2.m87175r();
                            if (num4 != null) {
                                c28655q2.m87150e0(323385136);
                                if ((i47 & 458752) == 131072) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                objM87133R2 = c28655q2.m87133R();
                                if (z27) {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                Modifier modifier13 = modifier2;
                                modifierM3362g = AbstractC1092a.m3362g(modifier13, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                                modifier4 = modifier13;
                                c28655q2.m87173q(false);
                            } else {
                                modifier4 = modifier2;
                                c28655q2.m87150e0(323386173);
                                c28655q2.m87173q(false);
                                modifierM3362g = modifier4;
                            }
                            i49 = a.f138459a[enumC33179f4.ordinal()];
                            if (i49 != 1) {
                                c2305k = C2299e.f9110M;
                            } else {
                                if (i49 == 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c2305k = C2299e.f9111N;
                            }
                            C28674u2 c28674u6 = AbstractC2453v1.f9575n;
                            enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u6);
                            Modifier modifier14 = modifier4;
                            num = num4;
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                            InterfaceC0221l.f734a.getClass();
                            c33182g5 = c33182g4;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            C2886a c2886a1111 = c2886a7;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            c0209i = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a5);
                            c0209i2 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m13);
                            c0209i3 = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N13);
                            Modifier modifierM3429z5 = AbstractC1102d.m3429z(c2314t, null, 3);
                            C2886a c2886a1112 = c2886a9;
                            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                            InterfaceC4339a interfaceC4339a17 = interfaceC4339a3;
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3429z5);
                            c28655q2.m87158i0();
                            TextResource textResource8 = textResource2;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a5);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m14);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N14);
                            if (z19) {
                                enumC39181m = EnumC39181m.f168423w;
                            }
                            EnumC33185h1 enumC33185h8 = enumC33185h3;
                            long j114 = jM125430y;
                            AbstractC28683x.m87247a(c28674u6.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j114, c2886a1111, textResource8, enumC33185h8, c2886a1112)), c28655q2, 56);
                            if (num == null) {
                                c28655q2.m87150e0(109632338);
                                z24 = false;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(109632339);
                                int iIntValue5 = num.intValue();
                                AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                                float f111 = 4;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue5, c28655q2, 6), null, AbstractC1102d.m3415l(f111 * f111, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                                z24 = false;
                                c28655q2.m87173q(false);
                            }
                            if (c33182g5 == null) {
                                c28655q2.m87150e0(110152053);
                                c28655q2.m87173q(z24);
                                z26 = z17;
                                z25 = true;
                            } else {
                                c28655q2.m87150e0(110152054);
                                float f112 = 8;
                                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f112, 0.0f, 0.0f, 0.0f, 14));
                                Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f112, 0.0f, 0.0f, 13);
                                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3398t5);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d5);
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m15);
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N15);
                                z25 = true;
                                boolean z212 = z17;
                                AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z212, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                                z26 = z212;
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z25);
                            long j115 = jM125382b1;
                            C2886a c2886a1113 = c2886a8;
                            c28655q = c28655q2;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j115, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                            c28655q2.m87173q(z25);
                            modifier3 = modifier14;
                            interfaceC4339a2 = interfaceC4339a17;
                            z15 = z26;
                            c2886a4 = c2886a1111;
                            j15 = j115;
                            c2886a6 = c2886a1113;
                            z16 = z19;
                            j14 = j114;
                            textResource3 = textResource8;
                            enumC33185h2 = enumC33185h8;
                            c2886a5 = c2886a1112;
                            enumC33179f2 = enumC33179f4;
                            c33182g2 = c33182g5;
                        } else {
                            c28655q2.m87138X();
                            enumC33179f2 = enumC33179f1;
                            enumC33185h2 = enumC33185h1;
                            z15 = z4;
                            c2886a4 = c2886a;
                            c2886a5 = c2886a2;
                            c2886a6 = c2886a3;
                            z16 = z13;
                            interfaceC4339a2 = interfaceC4339a;
                            c28655q = c28655q2;
                            textResource3 = textResource2;
                            modifier3 = modifier2;
                            c33182g2 = c33182g1;
                            j14 = j7;
                            j15 = j13;
                        }
                        num2 = num;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue6 = ((Integer) obj2).intValue();
                                    return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue6);
                                }
                            };
                        }
                    }
                    i36 |= 24576;
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a18;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a1114 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a1114;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a19;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a1115 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a1115;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier15 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier15, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier15;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u7 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u7);
                        Modifier modifier16 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a1116 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a6);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m16);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N16);
                        Modifier modifierM3429z6 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a1117 = c2886a9;
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a110 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3429z6);
                        c28655q2.m87158i0();
                        TextResource textResource9 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m17);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N17);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h9 = enumC33185h3;
                        long j116 = jM125430y;
                        AbstractC28683x.m87247a(c28674u7.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j116, c2886a1116, textResource9, enumC33185h9, c2886a1117)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue6 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f113 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue6, c28655q2, 6), null, AbstractC1102d.m3415l(f113 * f113, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f114 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f114, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f114, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3398t6);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d6);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m18);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N18);
                            z25 = true;
                            boolean z213 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z213, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z213;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j117 = jM125382b1;
                        C2886a c2886a1118 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j117, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier16;
                        interfaceC4339a2 = interfaceC4339a110;
                        z15 = z26;
                        c2886a4 = c2886a1116;
                        j15 = j117;
                        c2886a6 = c2886a1118;
                        z16 = z19;
                        j14 = j116;
                        textResource3 = textResource9;
                        enumC33185h2 = enumC33185h9;
                        c2886a5 = c2886a1117;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue7 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue7);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                }
                if ((i14 & 6) == 0) {
                    i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                } else {
                    i35 = i14;
                }
                if ((i14 & 48) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                        if ((i14 & 64) == 0) {
                            zM87157i3 = c28655q2.m87153g(c2886a);
                        } else {
                            zM87157i3 = c28655q2.m87157i(c2886a);
                        }
                        if (zM87157i3) {
                            i57 = 32;
                        }
                    }
                    i35 |= i57;
                }
                if ((i14 & 384) == 0) {
                    if ((i15 & 4096) == 0) {
                        if ((i14 & 512) == 0) {
                            zM87157i2 = c28655q2.m87153g(c2886a2);
                        } else {
                            zM87157i2 = c28655q2.m87157i(c2886a2);
                        }
                        if (zM87157i2) {
                            i58 = 256;
                        }
                    }
                    i35 |= i58;
                }
                if ((i14 & 3072) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        if ((i14 & 4096) == 0) {
                            zM87157i = c28655q2.m87153g(c2886a3);
                        } else {
                            zM87157i = c28655q2.m87157i(c2886a3);
                        }
                        if (zM87157i) {
                            i64 = 2048;
                        }
                    }
                    i35 |= i64;
                }
                i36 = i35;
                i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i37 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (!c28655q2.m87155h(z13)) {
                            i18 = 8192;
                        }
                        i36 |= i18;
                    }
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a111;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a1119 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a1119;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a112;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a11110 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a11110;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier17 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier17, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier17;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u8 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u8);
                        Modifier modifier18 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a11111 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a7);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m19);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N19);
                        Modifier modifierM3429z7 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a11112 = c2886a9;
                        C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a113 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM3429z7);
                        c28655q2.m87158i0();
                        TextResource textResource10 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a7);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m110);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N110);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h10 = enumC33185h3;
                        long j118 = jM125430y;
                        AbstractC28683x.m87247a(c28674u8.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j118, c2886a11111, textResource10, enumC33185h10, c2886a11112)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue7 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f115 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue7, c28655q2, 6), null, AbstractC1102d.m3415l(f115 * f115, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f116 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f116, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f116, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM3398t7);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d7);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111);
                            z25 = true;
                            boolean z214 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z214, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z214;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j119 = jM125382b1;
                        C2886a c2886a11113 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j119, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier18;
                        interfaceC4339a2 = interfaceC4339a113;
                        z15 = z26;
                        c2886a4 = c2886a11111;
                        j15 = j119;
                        c2886a6 = c2886a11113;
                        z16 = z19;
                        j14 = j118;
                        textResource3 = textResource10;
                        enumC33185h2 = enumC33185h10;
                        c2886a5 = c2886a11112;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue8 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue8);
                            }
                        };
                    }
                }
                i36 |= 24576;
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a114;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11114 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11114;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a115;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11115 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11115;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier19 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier19, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier19;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u9 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u9);
                    Modifier modifier110 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a11116 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a8);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m112);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N112);
                    Modifier modifierM3429z8 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a11117 = c2886a9;
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a116 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM3429z8);
                    c28655q2.m87158i0();
                    TextResource textResource11 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m113);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N113);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h11 = enumC33185h3;
                    long j1110 = jM125430y;
                    AbstractC28683x.m87247a(c28674u9.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1110, c2886a11116, textResource11, enumC33185h11, c2886a11117)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue8 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f117 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue8, c28655q2, 6), null, AbstractC1102d.m3415l(f117 * f117, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f118 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f118, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f118, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                        Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM3398t8);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d8);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m114);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N114);
                        z25 = true;
                        boolean z215 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z215, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z215;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j1111 = jM125382b1;
                    C2886a c2886a11118 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier110;
                    interfaceC4339a2 = interfaceC4339a116;
                    z15 = z26;
                    c2886a4 = c2886a11116;
                    j15 = j1111;
                    c2886a6 = c2886a11118;
                    z16 = z19;
                    j14 = j1110;
                    textResource3 = textResource11;
                    enumC33185h2 = enumC33185h11;
                    c2886a5 = c2886a11117;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue9 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue9);
                        }
                    };
                }
            }
            i16 |= 24576;
            textResource2 = textResource;
            i24 = i15 & 32;
            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i24 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (enumC33185h1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC33185h1.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(c33182g1)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(statTitle)) {
                        i54 = 8388608;
                    } else {
                        i54 = 4194304;
                    }
                    i16 |= i54;
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z4)) {
                            i34 = 67108864;
                        } else {
                            i34 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i34;
                    }
                    if ((i13 & 805306368) != 0) {
                        i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 6) == 0) {
                        i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                    } else {
                        i35 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                            if ((i14 & 64) == 0) {
                                zM87157i3 = c28655q2.m87153g(c2886a);
                            } else {
                                zM87157i3 = c28655q2.m87157i(c2886a);
                            }
                            if (zM87157i3) {
                                i57 = 32;
                            }
                        }
                        i35 |= i57;
                    }
                    if ((i14 & 384) == 0) {
                        if ((i15 & 4096) == 0) {
                            if ((i14 & 512) == 0) {
                                zM87157i2 = c28655q2.m87153g(c2886a2);
                            } else {
                                zM87157i2 = c28655q2.m87157i(c2886a2);
                            }
                            if (zM87157i2) {
                                i58 = 256;
                            }
                        }
                        i35 |= i58;
                    }
                    if ((i14 & 3072) == 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                            if ((i14 & 4096) == 0) {
                                zM87157i = c28655q2.m87153g(c2886a3);
                            } else {
                                zM87157i = c28655q2.m87157i(c2886a3);
                            }
                            if (zM87157i) {
                                i64 = 2048;
                            }
                        }
                        i35 |= i64;
                    }
                    i36 = i35;
                    i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i37 != 0) {
                        if ((i14 & 24576) == 0) {
                            if (!c28655q2.m87155h(z13)) {
                                i18 = 8192;
                            }
                            i36 |= i18;
                        }
                        i38 = i15 & 32768;
                        if (i38 != 0) {
                            i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            }
                            i36 |= i25;
                        }
                        i39 = i16;
                        if ((i16 & 306783379) == 306783378) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (c28655q2.m87135U(i39 & 1, z14)) {
                            c28655q2.m87140Z();
                            i44 = i13 & 1;
                            c28676v0 = C28635l.f115821a;
                            c2314t = C2314t.f9131w;
                            if (i44 != 0) {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a117;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a11119 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a11119;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            } else {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a118 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a118;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a111110 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a111110;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            }
                            c28655q2.m87175r();
                            if (num4 != null) {
                                c28655q2.m87150e0(323385136);
                                if ((i47 & 458752) == 131072) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                objM87133R2 = c28655q2.m87133R();
                                if (z27) {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                Modifier modifier111 = modifier2;
                                modifierM3362g = AbstractC1092a.m3362g(modifier111, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                                modifier4 = modifier111;
                                c28655q2.m87173q(false);
                            } else {
                                modifier4 = modifier2;
                                c28655q2.m87150e0(323386173);
                                c28655q2.m87173q(false);
                                modifierM3362g = modifier4;
                            }
                            i49 = a.f138459a[enumC33179f4.ordinal()];
                            if (i49 != 1) {
                                c2305k = C2299e.f9110M;
                            } else {
                                if (i49 == 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c2305k = C2299e.f9111N;
                            }
                            C28674u2 c28674u10 = AbstractC2453v1.f9575n;
                            enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u10);
                            Modifier modifier112 = modifier4;
                            num = num4;
                            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                            InterfaceC0221l.f734a.getClass();
                            c33182g5 = c33182g4;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            C2886a c2886a111111 = c2886a7;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            c0209i = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a9);
                            c0209i2 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m115);
                            c0209i3 = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N115);
                            Modifier modifierM3429z9 = AbstractC1102d.m3429z(c2314t, null, 3);
                            C2886a c2886a111112 = c2886a9;
                            C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                            InterfaceC4339a interfaceC4339a119 = interfaceC4339a3;
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
                            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierM3429z9);
                            c28655q2.m87158i0();
                            TextResource textResource12 = textResource2;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a9);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m116);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N116);
                            if (z19) {
                                enumC39181m = EnumC39181m.f168423w;
                            }
                            EnumC33185h1 enumC33185h12 = enumC33185h3;
                            long j1112 = jM125430y;
                            AbstractC28683x.m87247a(c28674u10.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1112, c2886a111111, textResource12, enumC33185h12, c2886a111112)), c28655q2, 56);
                            if (num == null) {
                                c28655q2.m87150e0(109632338);
                                z24 = false;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(109632339);
                                int iIntValue9 = num.intValue();
                                AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                                float f119 = 4;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue9, c28655q2, 6), null, AbstractC1102d.m3415l(f119 * f119, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                                z24 = false;
                                c28655q2.m87173q(false);
                            }
                            if (c33182g5 == null) {
                                c28655q2.m87150e0(110152053);
                                c28655q2.m87173q(z24);
                                z26 = z17;
                                z25 = true;
                            } else {
                                c28655q2.m87150e0(110152054);
                                float f1110 = 8;
                                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1110, 0.0f, 0.0f, 0.0f, 14));
                                Modifier modifierM3398t9 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1110, 0.0f, 0.0f, 13);
                                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM3398t9);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d9);
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m117);
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N117);
                                z25 = true;
                                boolean z216 = z17;
                                AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z216, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                                z26 = z216;
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z25);
                            long j1113 = jM125382b1;
                            C2886a c2886a111113 = c2886a8;
                            c28655q = c28655q2;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1113, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                            c28655q2.m87173q(z25);
                            modifier3 = modifier112;
                            interfaceC4339a2 = interfaceC4339a119;
                            z15 = z26;
                            c2886a4 = c2886a111111;
                            j15 = j1113;
                            c2886a6 = c2886a111113;
                            z16 = z19;
                            j14 = j1112;
                            textResource3 = textResource12;
                            enumC33185h2 = enumC33185h12;
                            c2886a5 = c2886a111112;
                            enumC33179f2 = enumC33179f4;
                            c33182g2 = c33182g5;
                        } else {
                            c28655q2.m87138X();
                            enumC33179f2 = enumC33179f1;
                            enumC33185h2 = enumC33185h1;
                            z15 = z4;
                            c2886a4 = c2886a;
                            c2886a5 = c2886a2;
                            c2886a6 = c2886a3;
                            z16 = z13;
                            interfaceC4339a2 = interfaceC4339a;
                            c28655q = c28655q2;
                            textResource3 = textResource2;
                            modifier3 = modifier2;
                            c33182g2 = c33182g1;
                            j14 = j7;
                            j15 = j13;
                        }
                        num2 = num;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue10 = ((Integer) obj2).intValue();
                                    return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue10);
                                }
                            };
                        }
                    }
                    i36 |= 24576;
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a1110;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a111114 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a111114;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a1111;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a111115 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a111115;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier113 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier113, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier113;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u11 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u11);
                        Modifier modifier114 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                        Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a111116 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a10);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m118);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N118);
                        Modifier modifierM3429z10 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a111117 = c2886a9;
                        C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a1112 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifierM3429z10);
                        c28655q2.m87158i0();
                        TextResource textResource13 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a10);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m119);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N119);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h13 = enumC33185h3;
                        long j1114 = jM125430y;
                        AbstractC28683x.m87247a(c28674u11.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1114, c2886a111116, textResource13, enumC33185h13, c2886a111117)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue10 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f1111 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue10, c28655q2, 6), null, AbstractC1102d.m3415l(f1111 * f1111, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f1112 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1112, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t10 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1112, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
                            Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, modifierM3398t10);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d10);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1110);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1110);
                            z25 = true;
                            boolean z217 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z217, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z217;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j1115 = jM125382b1;
                        C2886a c2886a111118 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1115, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier114;
                        interfaceC4339a2 = interfaceC4339a1112;
                        z15 = z26;
                        c2886a4 = c2886a111116;
                        j15 = j1115;
                        c2886a6 = c2886a111118;
                        z16 = z19;
                        j14 = j1114;
                        textResource3 = textResource13;
                        enumC33185h2 = enumC33185h13;
                        c2886a5 = c2886a111117;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue11 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue11);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                }
                if ((i14 & 6) == 0) {
                    i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                } else {
                    i35 = i14;
                }
                if ((i14 & 48) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                        if ((i14 & 64) == 0) {
                            zM87157i3 = c28655q2.m87153g(c2886a);
                        } else {
                            zM87157i3 = c28655q2.m87157i(c2886a);
                        }
                        if (zM87157i3) {
                            i57 = 32;
                        }
                    }
                    i35 |= i57;
                }
                if ((i14 & 384) == 0) {
                    if ((i15 & 4096) == 0) {
                        if ((i14 & 512) == 0) {
                            zM87157i2 = c28655q2.m87153g(c2886a2);
                        } else {
                            zM87157i2 = c28655q2.m87157i(c2886a2);
                        }
                        if (zM87157i2) {
                            i58 = 256;
                        }
                    }
                    i35 |= i58;
                }
                if ((i14 & 3072) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        if ((i14 & 4096) == 0) {
                            zM87157i = c28655q2.m87153g(c2886a3);
                        } else {
                            zM87157i = c28655q2.m87157i(c2886a3);
                        }
                        if (zM87157i) {
                            i64 = 2048;
                        }
                    }
                    i35 |= i64;
                }
                i36 = i35;
                i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i37 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (!c28655q2.m87155h(z13)) {
                            i18 = 8192;
                        }
                        i36 |= i18;
                    }
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a1113 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a1113;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a111119 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a111119;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a1114 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a1114;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a1111110 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a1111110;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier115 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier115, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier115;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u12 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u12);
                        Modifier modifier116 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
                        Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a1111111 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a11);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111);
                        Modifier modifierM3429z11 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a1111112 = c2886a9;
                        C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a1115 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q2.m87165m();
                        Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q2, modifierM3429z11);
                        c28655q2.m87158i0();
                        TextResource textResource14 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a11);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1112);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1112);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h14 = enumC33185h3;
                        long j1116 = jM125430y;
                        AbstractC28683x.m87247a(c28674u12.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1116, c2886a1111111, textResource14, enumC33185h14, c2886a1111112)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue11 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f1113 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue11, c28655q2, 6), null, AbstractC1102d.m3415l(f1113 * f1113, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f1114 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1114, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t11 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1114, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q2.m87165m();
                            Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d11);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1113);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1113);
                            z25 = true;
                            boolean z218 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z218, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z218;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j1117 = jM125382b1;
                        C2886a c2886a1111113 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1117, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier116;
                        interfaceC4339a2 = interfaceC4339a1115;
                        z15 = z26;
                        c2886a4 = c2886a1111111;
                        j15 = j1117;
                        c2886a6 = c2886a1111113;
                        z16 = z19;
                        j14 = j1116;
                        textResource3 = textResource14;
                        enumC33185h2 = enumC33185h14;
                        c2886a5 = c2886a1111112;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue12 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue12);
                            }
                        };
                    }
                }
                i36 |= 24576;
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a1116 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a1116;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a1111114 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a1111114;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a1117 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a1117;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a1111115 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a1111115;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier117 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier117, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier117;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u13 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u13);
                    Modifier modifier118 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q2.m87165m();
                    Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a1111116 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a12);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1114);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1114);
                    Modifier modifierM3429z12 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a1111117 = c2886a9;
                    C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a1118 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q2.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q2, modifierM3429z12);
                    c28655q2.m87158i0();
                    TextResource textResource15 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a12);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1115);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1115);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h15 = enumC33185h3;
                    long j1118 = jM125430y;
                    AbstractC28683x.m87247a(c28674u13.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1118, c2886a1111116, textResource15, enumC33185h15, c2886a1111117)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue12 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f1115 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue12, c28655q2, 6), null, AbstractC1102d.m3415l(f1115 * f1115, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f1116 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1116, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t12 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1116, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q2.m87165m();
                        Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q2, modifierM3398t12);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d12);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1116);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1116);
                        z25 = true;
                        boolean z219 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z219, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z219;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j1119 = jM125382b1;
                    C2886a c2886a1111118 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1119, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier118;
                    interfaceC4339a2 = interfaceC4339a1118;
                    z15 = z26;
                    c2886a4 = c2886a1111116;
                    j15 = j1119;
                    c2886a6 = c2886a1111118;
                    z16 = z19;
                    j14 = j1118;
                    textResource3 = textResource15;
                    enumC33185h2 = enumC33185h15;
                    c2886a5 = c2886a1111117;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue13 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue13);
                        }
                    };
                }
            }
            i16 |= 1572864;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87153g(statTitle)) {
                    i54 = 8388608;
                } else {
                    i54 = 4194304;
                }
                i16 |= i54;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z4)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i34;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                }
                if ((i14 & 6) == 0) {
                    i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                } else {
                    i35 = i14;
                }
                if ((i14 & 48) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                        if ((i14 & 64) == 0) {
                            zM87157i3 = c28655q2.m87153g(c2886a);
                        } else {
                            zM87157i3 = c28655q2.m87157i(c2886a);
                        }
                        if (zM87157i3) {
                            i57 = 32;
                        }
                    }
                    i35 |= i57;
                }
                if ((i14 & 384) == 0) {
                    if ((i15 & 4096) == 0) {
                        if ((i14 & 512) == 0) {
                            zM87157i2 = c28655q2.m87153g(c2886a2);
                        } else {
                            zM87157i2 = c28655q2.m87157i(c2886a2);
                        }
                        if (zM87157i2) {
                            i58 = 256;
                        }
                    }
                    i35 |= i58;
                }
                if ((i14 & 3072) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        if ((i14 & 4096) == 0) {
                            zM87157i = c28655q2.m87153g(c2886a3);
                        } else {
                            zM87157i = c28655q2.m87157i(c2886a3);
                        }
                        if (zM87157i) {
                            i64 = 2048;
                        }
                    }
                    i35 |= i64;
                }
                i36 = i35;
                i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i37 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (!c28655q2.m87155h(z13)) {
                            i18 = 8192;
                        }
                        i36 |= i18;
                    }
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a1119 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a1119;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a1111119 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a1111119;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a11110 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a11110;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a11111110 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a11111110;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier119 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier119, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier119;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u14 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u14);
                        Modifier modifier1110 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q2.m87165m();
                        Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a11111111 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a13);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1117);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1117);
                        Modifier modifierM3429z13 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a11111112 = c2886a9;
                        C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a11111 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q2.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q2, modifierM3429z13);
                        c28655q2.m87158i0();
                        TextResource textResource16 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a13);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1118);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1118);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h16 = enumC33185h3;
                        long j11110 = jM125430y;
                        AbstractC28683x.m87247a(c28674u14.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11110, c2886a11111111, textResource16, enumC33185h16, c2886a11111112)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue13 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f1117 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue13, c28655q2, 6), null, AbstractC1102d.m3415l(f1117 * f1117, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f1118 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1118, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t13 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1118, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q2.m87165m();
                            Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q2, modifierM3398t13);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d13);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1119);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1119);
                            z25 = true;
                            boolean z2110 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2110, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z2110;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j11111 = jM125382b1;
                        C2886a c2886a11111113 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier1110;
                        interfaceC4339a2 = interfaceC4339a11111;
                        z15 = z26;
                        c2886a4 = c2886a11111111;
                        j15 = j11111;
                        c2886a6 = c2886a11111113;
                        z16 = z19;
                        j14 = j11110;
                        textResource3 = textResource16;
                        enumC33185h2 = enumC33185h16;
                        c2886a5 = c2886a11111112;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue14 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue14);
                            }
                        };
                    }
                }
                i36 |= 24576;
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a11112 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a11112;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11111114 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11111114;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a11113 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a11113;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11111115 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11111115;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier1111 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier1111, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier1111;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u15 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u15);
                    Modifier modifier1112 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q2.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a11111116 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a14);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11110);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11110);
                    Modifier modifierM3429z14 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a11111117 = c2886a9;
                    C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a11114 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q2.m87165m();
                    Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q2, modifierM3429z14);
                    c28655q2.m87158i0();
                    TextResource textResource17 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a14);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h17 = enumC33185h3;
                    long j11112 = jM125430y;
                    AbstractC28683x.m87247a(c28674u15.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11112, c2886a11111116, textResource17, enumC33185h17, c2886a11111117)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue14 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f1119 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue14, c28655q2, 6), null, AbstractC1102d.m3415l(f1119 * f1119, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f11110 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f11110, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t14 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f11110, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q2.m87165m();
                        Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q2, modifierM3398t14);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d14);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11112);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11112);
                        z25 = true;
                        boolean z2111 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2111, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z2111;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j11113 = jM125382b1;
                    C2886a c2886a11111118 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11113, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier1112;
                    interfaceC4339a2 = interfaceC4339a11114;
                    z15 = z26;
                    c2886a4 = c2886a11111116;
                    j15 = j11113;
                    c2886a6 = c2886a11111118;
                    z16 = z19;
                    j14 = j11112;
                    textResource3 = textResource17;
                    enumC33185h2 = enumC33185h17;
                    c2886a5 = c2886a11111117;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue15 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue15);
                        }
                    };
                }
            }
            i16 |= 100663296;
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
            }
            if ((i14 & 6) == 0) {
                i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
            } else {
                i35 = i14;
            }
            if ((i14 & 48) == 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                    if ((i14 & 64) == 0) {
                        zM87157i3 = c28655q2.m87153g(c2886a);
                    } else {
                        zM87157i3 = c28655q2.m87157i(c2886a);
                    }
                    if (zM87157i3) {
                        i57 = 32;
                    }
                }
                i35 |= i57;
            }
            if ((i14 & 384) == 0) {
                if ((i15 & 4096) == 0) {
                    if ((i14 & 512) == 0) {
                        zM87157i2 = c28655q2.m87153g(c2886a2);
                    } else {
                        zM87157i2 = c28655q2.m87157i(c2886a2);
                    }
                    if (zM87157i2) {
                        i58 = 256;
                    }
                }
                i35 |= i58;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    if ((i14 & 4096) == 0) {
                        zM87157i = c28655q2.m87153g(c2886a3);
                    } else {
                        zM87157i = c28655q2.m87157i(c2886a3);
                    }
                    if (zM87157i) {
                        i64 = 2048;
                    }
                }
                i35 |= i64;
            }
            i36 = i35;
            i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i37 != 0) {
                if ((i14 & 24576) == 0) {
                    if (!c28655q2.m87155h(z13)) {
                        i18 = 8192;
                    }
                    i36 |= i18;
                }
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a11115 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a11115;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11111119 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11111119;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a11116 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a11116;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a111111110 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a111111110;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier1113 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier1113, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier1113;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u16 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u16);
                    Modifier modifier1114 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q2.m87165m();
                    Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a111111111 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a15);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11113);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11113);
                    Modifier modifierM3429z15 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a111111112 = c2886a9;
                    C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a11117 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q2.m87165m();
                    Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q2, modifierM3429z15);
                    c28655q2.m87158i0();
                    TextResource textResource18 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a15);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11114);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11114);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h18 = enumC33185h3;
                    long j11114 = jM125430y;
                    AbstractC28683x.m87247a(c28674u16.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11114, c2886a111111111, textResource18, enumC33185h18, c2886a111111112)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue15 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f11111 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue15, c28655q2, 6), null, AbstractC1102d.m3415l(f11111 * f11111, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f11112 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f11112, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t15 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f11112, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q2.m87165m();
                        Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q2, modifierM3398t15);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d15);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11115);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11115);
                        z25 = true;
                        boolean z2112 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2112, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z2112;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j11115 = jM125382b1;
                    C2886a c2886a111111113 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11115, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a111111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier1114;
                    interfaceC4339a2 = interfaceC4339a11117;
                    z15 = z26;
                    c2886a4 = c2886a111111111;
                    j15 = j11115;
                    c2886a6 = c2886a111111113;
                    z16 = z19;
                    j14 = j11114;
                    textResource3 = textResource18;
                    enumC33185h2 = enumC33185h18;
                    c2886a5 = c2886a111111112;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue16 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue16);
                        }
                    };
                }
            }
            i36 |= 24576;
            i38 = i15 & 32768;
            if (i38 != 0) {
                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i36 |= i25;
            }
            i39 = i16;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q2.m87135U(i39 & 1, z14)) {
                c28655q2.m87140Z();
                i44 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a11118 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a11118;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a111111114 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a111111114;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a11119 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a11119;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a111111115 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a111111115;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q2.m87175r();
                if (num4 != null) {
                    c28655q2.m87150e0(323385136);
                    if ((i47 & 458752) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z27) {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifier1115 = modifier2;
                    modifierM3362g = AbstractC1092a.m3362g(modifier1115, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    modifier4 = modifier1115;
                    c28655q2.m87173q(false);
                } else {
                    modifier4 = modifier2;
                    c28655q2.m87150e0(323386173);
                    c28655q2.m87173q(false);
                    modifierM3362g = modifier4;
                }
                i49 = a.f138459a[enumC33179f4.ordinal()];
                if (i49 != 1) {
                    c2305k = C2299e.f9110M;
                } else {
                    if (i49 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2305k = C2299e.f9111N;
                }
                C28674u2 c28674u17 = AbstractC2453v1.f9575n;
                enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u17);
                Modifier modifier1116 = modifier4;
                num = num4;
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q2.m87165m();
                Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c33182g5 = c33182g4;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                C2886a c2886a111111116 = c2886a7;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a16);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11116);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11116);
                Modifier modifierM3429z16 = AbstractC1102d.m3429z(c2314t, null, 3);
                C2886a c2886a111111117 = c2886a9;
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                InterfaceC4339a interfaceC4339a111110 = interfaceC4339a3;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q2.m87165m();
                Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q2, modifierM3429z16);
                c28655q2.m87158i0();
                TextResource textResource19 = textResource2;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a16);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11117);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11117);
                if (z19) {
                    enumC39181m = EnumC39181m.f168423w;
                }
                EnumC33185h1 enumC33185h19 = enumC33185h3;
                long j11116 = jM125430y;
                AbstractC28683x.m87247a(c28674u17.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11116, c2886a111111116, textResource19, enumC33185h19, c2886a111111117)), c28655q2, 56);
                if (num == null) {
                    c28655q2.m87150e0(109632338);
                    z24 = false;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(109632339);
                    int iIntValue16 = num.intValue();
                    AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                    float f11113 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue16, c28655q2, 6), null, AbstractC1102d.m3415l(f11113 * f11113, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                    z24 = false;
                    c28655q2.m87173q(false);
                }
                if (c33182g5 == null) {
                    c28655q2.m87150e0(110152053);
                    c28655q2.m87173q(z24);
                    z26 = z17;
                    z25 = true;
                } else {
                    c28655q2.m87150e0(110152054);
                    float f11114 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f11114, 0.0f, 0.0f, 0.0f, 14));
                    Modifier modifierM3398t16 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f11114, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q2.m87165m();
                    Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q2, modifierM3398t16);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d16);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11118);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11118);
                    z25 = true;
                    boolean z2113 = z17;
                    AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2113, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                    z26 = z2113;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z25);
                long j11117 = jM125382b1;
                C2886a c2886a111111118 = c2886a8;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11117, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a111111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                c28655q2.m87173q(z25);
                modifier3 = modifier1116;
                interfaceC4339a2 = interfaceC4339a111110;
                z15 = z26;
                c2886a4 = c2886a111111116;
                j15 = j11117;
                c2886a6 = c2886a111111118;
                z16 = z19;
                j14 = j11116;
                textResource3 = textResource19;
                enumC33185h2 = enumC33185h19;
                c2886a5 = c2886a111111117;
                enumC33179f2 = enumC33179f4;
                c33182g2 = c33182g5;
            } else {
                c28655q2.m87138X();
                enumC33179f2 = enumC33179f1;
                enumC33185h2 = enumC33185h1;
                z15 = z4;
                c2886a4 = c2886a;
                c2886a5 = c2886a2;
                c2886a6 = c2886a3;
                z16 = z13;
                interfaceC4339a2 = interfaceC4339a;
                c28655q = c28655q2;
                textResource3 = textResource2;
                modifier3 = modifier2;
                c33182g2 = c33182g1;
                j14 = j7;
                j15 = j13;
            }
            num2 = num;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue17 = ((Integer) obj2).intValue();
                        return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue17);
                    }
                };
            }
        }
        i16 |= 3072;
        i17 = i15 & 16;
        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
        if (i17 != 0) {
            if ((i13 & 24576) == 0) {
                textResource2 = textResource;
                if (c28655q2.m87153g(textResource2)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            i24 = i15 & 32;
            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i24 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (enumC33185h1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC33185h1.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(c33182g1)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(statTitle)) {
                        i54 = 8388608;
                    } else {
                        i54 = 4194304;
                    }
                    i16 |= i54;
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87155h(z4)) {
                            i34 = 67108864;
                        } else {
                            i34 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i34;
                    }
                    if ((i13 & 805306368) != 0) {
                        i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 6) == 0) {
                        i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                    } else {
                        i35 = i14;
                    }
                    if ((i14 & 48) == 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                            if ((i14 & 64) == 0) {
                                zM87157i3 = c28655q2.m87153g(c2886a);
                            } else {
                                zM87157i3 = c28655q2.m87157i(c2886a);
                            }
                            if (zM87157i3) {
                                i57 = 32;
                            }
                        }
                        i35 |= i57;
                    }
                    if ((i14 & 384) == 0) {
                        if ((i15 & 4096) == 0) {
                            if ((i14 & 512) == 0) {
                                zM87157i2 = c28655q2.m87153g(c2886a2);
                            } else {
                                zM87157i2 = c28655q2.m87157i(c2886a2);
                            }
                            if (zM87157i2) {
                                i58 = 256;
                            }
                        }
                        i35 |= i58;
                    }
                    if ((i14 & 3072) == 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                            if ((i14 & 4096) == 0) {
                                zM87157i = c28655q2.m87153g(c2886a3);
                            } else {
                                zM87157i = c28655q2.m87157i(c2886a3);
                            }
                            if (zM87157i) {
                                i64 = 2048;
                            }
                        }
                        i35 |= i64;
                    }
                    i36 = i35;
                    i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i37 != 0) {
                        if ((i14 & 24576) == 0) {
                            if (!c28655q2.m87155h(z13)) {
                                i18 = 8192;
                            }
                            i36 |= i18;
                        }
                        i38 = i15 & 32768;
                        if (i38 != 0) {
                            i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            }
                            i36 |= i25;
                        }
                        i39 = i16;
                        if ((i16 & 306783379) == 306783378) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (c28655q2.m87135U(i39 & 1, z14)) {
                            c28655q2.m87140Z();
                            i44 = i13 & 1;
                            c28676v0 = C28635l.f115821a;
                            c2314t = C2314t.f9131w;
                            if (i44 != 0) {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a111111 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a111111;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a111111119 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a111111119;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            } else {
                                if (i55 != 0) {
                                    modifier2 = c2314t;
                                }
                                if (i56 != 0) {
                                    enumC33179f3 = EnumC33179f1.Start;
                                } else {
                                    enumC33179f3 = enumC33179f1;
                                }
                                if (i59 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i17 != 0) {
                                    textResource2 = null;
                                }
                                if (i24 != 0) {
                                    enumC33185h3 = EnumC33185h1.TEXT;
                                } else {
                                    enumC33185h3 = enumC33185h1;
                                }
                                if (i27 != 0) {
                                    c33182g3 = null;
                                } else {
                                    c33182g3 = c33182g1;
                                }
                                if (i29 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                if ((i15 & 512) != 0) {
                                    i45 = i39 & (-1879048193);
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                } else {
                                    jM125430y = j7;
                                    i45 = i39;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i46 = 6;
                                    i36 &= -15;
                                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                                } else {
                                    i46 = 6;
                                    jM125382b1 = j13;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                    i36 &= -113;
                                } else {
                                    c2886aM8403A = c2886a;
                                }
                                if ((i15 & 4096) != 0) {
                                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                    i36 &= -897;
                                } else {
                                    c2886aM8420a = c2886a2;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                    i36 &= -7169;
                                } else {
                                    c2886aM8415M = c2886a3;
                                }
                                if (i37 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z13;
                                }
                                if (i38 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C32940v(15);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a111112 = (InterfaceC4339a) objM87133R;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886aM8415M;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a111112;
                                    enumC33179f4 = enumC33179f3;
                                } else {
                                    C2886a c2886a1111111110 = c2886aM8415M;
                                    enumC33179f4 = enumC33179f3;
                                    c2886a7 = c2886aM8403A;
                                    c2886a8 = c2886a1111111110;
                                    z19 = z18;
                                    i47 = i36;
                                    num4 = num3;
                                    i48 = i45;
                                    c33182g4 = c33182g3;
                                    c2886a9 = c2886aM8420a;
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                            }
                            c28655q2.m87175r();
                            if (num4 != null) {
                                c28655q2.m87150e0(323385136);
                                if ((i47 & 458752) == 131072) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                objM87133R2 = c28655q2.m87133R();
                                if (z27) {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                Modifier modifier1117 = modifier2;
                                modifierM3362g = AbstractC1092a.m3362g(modifier1117, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                                modifier4 = modifier1117;
                                c28655q2.m87173q(false);
                            } else {
                                modifier4 = modifier2;
                                c28655q2.m87150e0(323386173);
                                c28655q2.m87173q(false);
                                modifierM3362g = modifier4;
                            }
                            i49 = a.f138459a[enumC33179f4.ordinal()];
                            if (i49 != 1) {
                                c2305k = C2299e.f9110M;
                            } else {
                                if (i49 == 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c2305k = C2299e.f9111N;
                            }
                            C28674u2 c28674u18 = AbstractC2453v1.f9575n;
                            enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u18);
                            Modifier modifier1118 = modifier4;
                            num = num4;
                            C23010x c23010xM66775a17 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q2.m87165m();
                            Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                            InterfaceC0221l.f734a.getClass();
                            c33182g5 = c33182g4;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            C2886a c2886a1111111111 = c2886a7;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            c0209i = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a17);
                            c0209i2 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11119);
                            c0209i3 = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11119);
                            Modifier modifierM3429z17 = AbstractC1102d.m3429z(c2314t, null, 3);
                            C2886a c2886a1111111112 = c2886a9;
                            C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                            InterfaceC4339a interfaceC4339a111113 = interfaceC4339a3;
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q2.m87165m();
                            Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q2, modifierM3429z17);
                            c28655q2.m87158i0();
                            TextResource textResource110 = textResource2;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a17);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111110);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111110);
                            if (z19) {
                                enumC39181m = EnumC39181m.f168423w;
                            }
                            EnumC33185h1 enumC33185h110 = enumC33185h3;
                            long j11118 = jM125430y;
                            AbstractC28683x.m87247a(c28674u18.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11118, c2886a1111111111, textResource110, enumC33185h110, c2886a1111111112)), c28655q2, 56);
                            if (num == null) {
                                c28655q2.m87150e0(109632338);
                                z24 = false;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(109632339);
                                int iIntValue17 = num.intValue();
                                AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                                float f11115 = 4;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue17, c28655q2, 6), null, AbstractC1102d.m3415l(f11115 * f11115, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                                z24 = false;
                                c28655q2.m87173q(false);
                            }
                            if (c33182g5 == null) {
                                c28655q2.m87150e0(110152053);
                                c28655q2.m87173q(z24);
                                z26 = z17;
                                z25 = true;
                            } else {
                                c28655q2.m87150e0(110152054);
                                float f11116 = 8;
                                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f11116, 0.0f, 0.0f, 0.0f, 14));
                                Modifier modifierM3398t17 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f11116, 0.0f, 0.0f, 13);
                                InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q2.m87165m();
                                Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q2, modifierM3398t17);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d17);
                                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111);
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111);
                                z25 = true;
                                boolean z2114 = z17;
                                AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2114, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                                z26 = z2114;
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z25);
                            long j11119 = jM125382b1;
                            C2886a c2886a1111111113 = c2886a8;
                            c28655q = c28655q2;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11119, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1111111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                            c28655q2.m87173q(z25);
                            modifier3 = modifier1118;
                            interfaceC4339a2 = interfaceC4339a111113;
                            z15 = z26;
                            c2886a4 = c2886a1111111111;
                            j15 = j11119;
                            c2886a6 = c2886a1111111113;
                            z16 = z19;
                            j14 = j11118;
                            textResource3 = textResource110;
                            enumC33185h2 = enumC33185h110;
                            c2886a5 = c2886a1111111112;
                            enumC33179f2 = enumC33179f4;
                            c33182g2 = c33182g5;
                        } else {
                            c28655q2.m87138X();
                            enumC33179f2 = enumC33179f1;
                            enumC33185h2 = enumC33185h1;
                            z15 = z4;
                            c2886a4 = c2886a;
                            c2886a5 = c2886a2;
                            c2886a6 = c2886a3;
                            z16 = z13;
                            interfaceC4339a2 = interfaceC4339a;
                            c28655q = c28655q2;
                            textResource3 = textResource2;
                            modifier3 = modifier2;
                            c33182g2 = c33182g1;
                            j14 = j7;
                            j15 = j13;
                        }
                        num2 = num;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue18 = ((Integer) obj2).intValue();
                                    return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue18);
                                }
                            };
                        }
                    }
                    i36 |= 24576;
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a111114 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a111114;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a1111111114 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a1111111114;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a111115 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a111115;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a1111111115 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a1111111115;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier1119 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier1119, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier1119;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u19 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u19);
                        Modifier modifier11110 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a18 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q2.m87165m();
                        Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a1111111116 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a18);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111112);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111112);
                        Modifier modifierM3429z18 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a1111111117 = c2886a9;
                        C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a111116 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q2.m87165m();
                        Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q2, modifierM3429z18);
                        c28655q2.m87158i0();
                        TextResource textResource111 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a18);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111113);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111113);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h111 = enumC33185h3;
                        long j111110 = jM125430y;
                        AbstractC28683x.m87247a(c28674u19.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j111110, c2886a1111111116, textResource111, enumC33185h111, c2886a1111111117)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue18 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f11117 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue18, c28655q2, 6), null, AbstractC1102d.m3415l(f11117 * f11117, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f11118 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f11118, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t18 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f11118, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q2.m87165m();
                            Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q2, modifierM3398t18);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d18);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111114);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111114);
                            z25 = true;
                            boolean z2115 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2115, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z2115;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j111111 = jM125382b1;
                        C2886a c2886a1111111118 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j111111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1111111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier11110;
                        interfaceC4339a2 = interfaceC4339a111116;
                        z15 = z26;
                        c2886a4 = c2886a1111111116;
                        j15 = j111111;
                        c2886a6 = c2886a1111111118;
                        z16 = z19;
                        j14 = j111110;
                        textResource3 = textResource111;
                        enumC33185h2 = enumC33185h111;
                        c2886a5 = c2886a1111111117;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue19 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue19);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                }
                if ((i14 & 6) == 0) {
                    i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                } else {
                    i35 = i14;
                }
                if ((i14 & 48) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                        if ((i14 & 64) == 0) {
                            zM87157i3 = c28655q2.m87153g(c2886a);
                        } else {
                            zM87157i3 = c28655q2.m87157i(c2886a);
                        }
                        if (zM87157i3) {
                            i57 = 32;
                        }
                    }
                    i35 |= i57;
                }
                if ((i14 & 384) == 0) {
                    if ((i15 & 4096) == 0) {
                        if ((i14 & 512) == 0) {
                            zM87157i2 = c28655q2.m87153g(c2886a2);
                        } else {
                            zM87157i2 = c28655q2.m87157i(c2886a2);
                        }
                        if (zM87157i2) {
                            i58 = 256;
                        }
                    }
                    i35 |= i58;
                }
                if ((i14 & 3072) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        if ((i14 & 4096) == 0) {
                            zM87157i = c28655q2.m87153g(c2886a3);
                        } else {
                            zM87157i = c28655q2.m87157i(c2886a3);
                        }
                        if (zM87157i) {
                            i64 = 2048;
                        }
                    }
                    i35 |= i64;
                }
                i36 = i35;
                i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i37 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (!c28655q2.m87155h(z13)) {
                            i18 = 8192;
                        }
                        i36 |= i18;
                    }
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a111117 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a111117;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a1111111119 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a1111111119;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a111118 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a111118;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a11111111110 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a11111111110;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier11111 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier11111, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier11111;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u110 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u110);
                        Modifier modifier11112 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a19 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q2.m87165m();
                        Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a11111111111 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a19);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111115);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111115);
                        Modifier modifierM3429z19 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a11111111112 = c2886a9;
                        C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a111119 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q2.m87165m();
                        Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q2, modifierM3429z19);
                        c28655q2.m87158i0();
                        TextResource textResource112 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a19);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111116);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111116);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h112 = enumC33185h3;
                        long j111112 = jM125430y;
                        AbstractC28683x.m87247a(c28674u110.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j111112, c2886a11111111111, textResource112, enumC33185h112, c2886a11111111112)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue19 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f11119 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue19, c28655q2, 6), null, AbstractC1102d.m3415l(f11119 * f11119, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f111110 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f111110, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t19 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f111110, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q2.m87165m();
                            Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q2, modifierM3398t19);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d19);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111117);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111117);
                            z25 = true;
                            boolean z2116 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2116, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z2116;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j111113 = jM125382b1;
                        C2886a c2886a11111111113 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j111113, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11111111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier11112;
                        interfaceC4339a2 = interfaceC4339a111119;
                        z15 = z26;
                        c2886a4 = c2886a11111111111;
                        j15 = j111113;
                        c2886a6 = c2886a11111111113;
                        z16 = z19;
                        j14 = j111112;
                        textResource3 = textResource112;
                        enumC33185h2 = enumC33185h112;
                        c2886a5 = c2886a11111111112;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue110 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue110);
                            }
                        };
                    }
                }
                i36 |= 24576;
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a1111110 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a1111110;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11111111114 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11111111114;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a1111111 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a1111111;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11111111115 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11111111115;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier11113 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier11113, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier11113;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u111 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u111);
                    Modifier modifier11114 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a110 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q2.m87165m();
                    Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a11111111116 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a110);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111118);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111118);
                    Modifier modifierM3429z110 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a11111111117 = c2886a9;
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a1111112 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q2.m87165m();
                    Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q2, modifierM3429z110);
                    c28655q2.m87158i0();
                    TextResource textResource113 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111119);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111119);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h113 = enumC33185h3;
                    long j111114 = jM125430y;
                    AbstractC28683x.m87247a(c28674u111.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j111114, c2886a11111111116, textResource113, enumC33185h113, c2886a11111111117)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue110 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f111111 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue110, c28655q2, 6), null, AbstractC1102d.m3415l(f111111 * f111111, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f111112 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f111112, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t110 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f111112, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q2.m87165m();
                        Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q2, modifierM3398t110);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d110);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111110);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111110);
                        z25 = true;
                        boolean z2117 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2117, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z2117;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j111115 = jM125382b1;
                    C2886a c2886a11111111118 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j111115, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11111111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier11114;
                    interfaceC4339a2 = interfaceC4339a1111112;
                    z15 = z26;
                    c2886a4 = c2886a11111111116;
                    j15 = j111115;
                    c2886a6 = c2886a11111111118;
                    z16 = z19;
                    j14 = j111114;
                    textResource3 = textResource113;
                    enumC33185h2 = enumC33185h113;
                    c2886a5 = c2886a11111111117;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue111 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue111);
                        }
                    };
                }
            }
            i16 |= 1572864;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87153g(statTitle)) {
                    i54 = 8388608;
                } else {
                    i54 = 4194304;
                }
                i16 |= i54;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z4)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i34;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                }
                if ((i14 & 6) == 0) {
                    i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                } else {
                    i35 = i14;
                }
                if ((i14 & 48) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                        if ((i14 & 64) == 0) {
                            zM87157i3 = c28655q2.m87153g(c2886a);
                        } else {
                            zM87157i3 = c28655q2.m87157i(c2886a);
                        }
                        if (zM87157i3) {
                            i57 = 32;
                        }
                    }
                    i35 |= i57;
                }
                if ((i14 & 384) == 0) {
                    if ((i15 & 4096) == 0) {
                        if ((i14 & 512) == 0) {
                            zM87157i2 = c28655q2.m87153g(c2886a2);
                        } else {
                            zM87157i2 = c28655q2.m87157i(c2886a2);
                        }
                        if (zM87157i2) {
                            i58 = 256;
                        }
                    }
                    i35 |= i58;
                }
                if ((i14 & 3072) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        if ((i14 & 4096) == 0) {
                            zM87157i = c28655q2.m87153g(c2886a3);
                        } else {
                            zM87157i = c28655q2.m87157i(c2886a3);
                        }
                        if (zM87157i) {
                            i64 = 2048;
                        }
                    }
                    i35 |= i64;
                }
                i36 = i35;
                i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i37 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (!c28655q2.m87155h(z13)) {
                            i18 = 8192;
                        }
                        i36 |= i18;
                    }
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a1111113 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a1111113;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a11111111119 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a11111111119;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a1111114 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a1111114;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a111111111110 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a111111111110;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier11115 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier11115, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier11115;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u112 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u112);
                        Modifier modifier11116 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a111 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q2.m87165m();
                        Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a111111111111 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a111);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111111);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111111);
                        Modifier modifierM3429z111 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a111111111112 = c2886a9;
                        C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a1111115 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q2.m87165m();
                        Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q2, modifierM3429z111);
                        c28655q2.m87158i0();
                        TextResource textResource114 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a111);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111112);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111112);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h114 = enumC33185h3;
                        long j111116 = jM125430y;
                        AbstractC28683x.m87247a(c28674u112.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j111116, c2886a111111111111, textResource114, enumC33185h114, c2886a111111111112)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue111 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f111113 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue111, c28655q2, 6), null, AbstractC1102d.m3415l(f111113 * f111113, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f111114 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f111114, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t111 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f111114, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q2.m87165m();
                            Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q2, modifierM3398t111);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d111);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111113);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111113);
                            z25 = true;
                            boolean z2118 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2118, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z2118;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j111117 = jM125382b1;
                        C2886a c2886a111111111113 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j111117, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a111111111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier11116;
                        interfaceC4339a2 = interfaceC4339a1111115;
                        z15 = z26;
                        c2886a4 = c2886a111111111111;
                        j15 = j111117;
                        c2886a6 = c2886a111111111113;
                        z16 = z19;
                        j14 = j111116;
                        textResource3 = textResource114;
                        enumC33185h2 = enumC33185h114;
                        c2886a5 = c2886a111111111112;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue112 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue112);
                            }
                        };
                    }
                }
                i36 |= 24576;
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a1111116 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a1111116;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a111111111114 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a111111111114;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a1111117 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a1111117;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a111111111115 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a111111111115;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier11117 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier11117, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier11117;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u113 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u113);
                    Modifier modifier11118 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a112 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q2.m87165m();
                    Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a111111111116 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a112);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111114);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111114);
                    Modifier modifierM3429z112 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a111111111117 = c2886a9;
                    C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a1111118 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111115 = c28655q2.m87165m();
                    Modifier modifierM118962N1111115 = AbstractC37056f.m118962N(c28655q2, modifierM3429z112);
                    c28655q2.m87158i0();
                    TextResource textResource115 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a112);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111115);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111115);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h115 = enumC33185h3;
                    long j111118 = jM125430y;
                    AbstractC28683x.m87247a(c28674u113.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j111118, c2886a111111111116, textResource115, enumC33185h115, c2886a111111111117)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue112 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f111115 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue112, c28655q2, 6), null, AbstractC1102d.m3415l(f111115 * f111115, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f111116 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f111116, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t112 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f111116, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111116 = c28655q2.m87165m();
                        Modifier modifierM118962N1111116 = AbstractC37056f.m118962N(c28655q2, modifierM3398t112);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d112);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111116);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111116);
                        z25 = true;
                        boolean z2119 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z2119, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z2119;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j111119 = jM125382b1;
                    C2886a c2886a111111111118 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j111119, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a111111111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier11118;
                    interfaceC4339a2 = interfaceC4339a1111118;
                    z15 = z26;
                    c2886a4 = c2886a111111111116;
                    j15 = j111119;
                    c2886a6 = c2886a111111111118;
                    z16 = z19;
                    j14 = j111118;
                    textResource3 = textResource115;
                    enumC33185h2 = enumC33185h115;
                    c2886a5 = c2886a111111111117;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue113 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue113);
                        }
                    };
                }
            }
            i16 |= 100663296;
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
            }
            if ((i14 & 6) == 0) {
                i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
            } else {
                i35 = i14;
            }
            if ((i14 & 48) == 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                    if ((i14 & 64) == 0) {
                        zM87157i3 = c28655q2.m87153g(c2886a);
                    } else {
                        zM87157i3 = c28655q2.m87157i(c2886a);
                    }
                    if (zM87157i3) {
                        i57 = 32;
                    }
                }
                i35 |= i57;
            }
            if ((i14 & 384) == 0) {
                if ((i15 & 4096) == 0) {
                    if ((i14 & 512) == 0) {
                        zM87157i2 = c28655q2.m87153g(c2886a2);
                    } else {
                        zM87157i2 = c28655q2.m87157i(c2886a2);
                    }
                    if (zM87157i2) {
                        i58 = 256;
                    }
                }
                i35 |= i58;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    if ((i14 & 4096) == 0) {
                        zM87157i = c28655q2.m87153g(c2886a3);
                    } else {
                        zM87157i = c28655q2.m87157i(c2886a3);
                    }
                    if (zM87157i) {
                        i64 = 2048;
                    }
                }
                i35 |= i64;
            }
            i36 = i35;
            i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i37 != 0) {
                if ((i14 & 24576) == 0) {
                    if (!c28655q2.m87155h(z13)) {
                        i18 = 8192;
                    }
                    i36 |= i18;
                }
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a1111119 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a1111119;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a111111111119 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a111111111119;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a11111110 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a11111110;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a1111111111110 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a1111111111110;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier11119 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier11119, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier11119;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u114 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u114);
                    Modifier modifier111110 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a113 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111117 = c28655q2.m87165m();
                    Modifier modifierM118962N1111117 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a1111111111111 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a113);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111117);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111117);
                    Modifier modifierM3429z113 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a1111111111112 = c2886a9;
                    C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a11111111 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111118 = c28655q2.m87165m();
                    Modifier modifierM118962N1111118 = AbstractC37056f.m118962N(c28655q2, modifierM3429z113);
                    c28655q2.m87158i0();
                    TextResource textResource116 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a113);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111118);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111118);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h116 = enumC33185h3;
                    long j1111110 = jM125430y;
                    AbstractC28683x.m87247a(c28674u114.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1111110, c2886a1111111111111, textResource116, enumC33185h116, c2886a1111111111112)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue113 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f111117 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue113, c28655q2, 6), null, AbstractC1102d.m3415l(f111117 * f111117, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f111118 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f111118, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t113 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f111118, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111119 = c28655q2.m87165m();
                        Modifier modifierM118962N1111119 = AbstractC37056f.m118962N(c28655q2, modifierM3398t113);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d113);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111119);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111119);
                        z25 = true;
                        boolean z21110 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21110, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z21110;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j1111111 = jM125382b1;
                    C2886a c2886a1111111111113 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1111111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1111111111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier111110;
                    interfaceC4339a2 = interfaceC4339a11111111;
                    z15 = z26;
                    c2886a4 = c2886a1111111111111;
                    j15 = j1111111;
                    c2886a6 = c2886a1111111111113;
                    z16 = z19;
                    j14 = j1111110;
                    textResource3 = textResource116;
                    enumC33185h2 = enumC33185h116;
                    c2886a5 = c2886a1111111111112;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue114 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue114);
                        }
                    };
                }
            }
            i36 |= 24576;
            i38 = i15 & 32768;
            if (i38 != 0) {
                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i36 |= i25;
            }
            i39 = i16;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q2.m87135U(i39 & 1, z14)) {
                c28655q2.m87140Z();
                i44 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a11111112 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a11111112;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a1111111111114 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a1111111111114;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a11111113 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a11111113;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a1111111111115 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a1111111111115;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q2.m87175r();
                if (num4 != null) {
                    c28655q2.m87150e0(323385136);
                    if ((i47 & 458752) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z27) {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifier111111 = modifier2;
                    modifierM3362g = AbstractC1092a.m3362g(modifier111111, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    modifier4 = modifier111111;
                    c28655q2.m87173q(false);
                } else {
                    modifier4 = modifier2;
                    c28655q2.m87150e0(323386173);
                    c28655q2.m87173q(false);
                    modifierM3362g = modifier4;
                }
                i49 = a.f138459a[enumC33179f4.ordinal()];
                if (i49 != 1) {
                    c2305k = C2299e.f9110M;
                } else {
                    if (i49 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2305k = C2299e.f9111N;
                }
                C28674u2 c28674u115 = AbstractC2453v1.f9575n;
                enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u115);
                Modifier modifier111112 = modifier4;
                num = num4;
                C23010x c23010xM66775a114 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111110 = c28655q2.m87165m();
                Modifier modifierM118962N11111110 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c33182g5 = c33182g4;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                C2886a c2886a1111111111116 = c2886a7;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a114);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111110);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111110);
                Modifier modifierM3429z114 = AbstractC1102d.m3429z(c2314t, null, 3);
                C2886a c2886a1111111111117 = c2886a9;
                C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                InterfaceC4339a interfaceC4339a11111114 = interfaceC4339a3;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111 = c28655q2.m87165m();
                Modifier modifierM118962N11111111 = AbstractC37056f.m118962N(c28655q2, modifierM3429z114);
                c28655q2.m87158i0();
                TextResource textResource117 = textResource2;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a114);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111111);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111111);
                if (z19) {
                    enumC39181m = EnumC39181m.f168423w;
                }
                EnumC33185h1 enumC33185h117 = enumC33185h3;
                long j1111112 = jM125430y;
                AbstractC28683x.m87247a(c28674u115.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1111112, c2886a1111111111116, textResource117, enumC33185h117, c2886a1111111111117)), c28655q2, 56);
                if (num == null) {
                    c28655q2.m87150e0(109632338);
                    z24 = false;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(109632339);
                    int iIntValue114 = num.intValue();
                    AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                    float f111119 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue114, c28655q2, 6), null, AbstractC1102d.m3415l(f111119 * f111119, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                    z24 = false;
                    c28655q2.m87173q(false);
                }
                if (c33182g5 == null) {
                    c28655q2.m87150e0(110152053);
                    c28655q2.m87173q(z24);
                    z26 = z17;
                    z25 = true;
                } else {
                    c28655q2.m87150e0(110152054);
                    float f1111110 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1111110, 0.0f, 0.0f, 0.0f, 14));
                    Modifier modifierM3398t114 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1111110, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111112 = c28655q2.m87165m();
                    Modifier modifierM118962N11111112 = AbstractC37056f.m118962N(c28655q2, modifierM3398t114);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d114);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111112);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111112);
                    z25 = true;
                    boolean z21111 = z17;
                    AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21111, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                    z26 = z21111;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z25);
                long j1111113 = jM125382b1;
                C2886a c2886a1111111111118 = c2886a8;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1111113, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1111111111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                c28655q2.m87173q(z25);
                modifier3 = modifier111112;
                interfaceC4339a2 = interfaceC4339a11111114;
                z15 = z26;
                c2886a4 = c2886a1111111111116;
                j15 = j1111113;
                c2886a6 = c2886a1111111111118;
                z16 = z19;
                j14 = j1111112;
                textResource3 = textResource117;
                enumC33185h2 = enumC33185h117;
                c2886a5 = c2886a1111111111117;
                enumC33179f2 = enumC33179f4;
                c33182g2 = c33182g5;
            } else {
                c28655q2.m87138X();
                enumC33179f2 = enumC33179f1;
                enumC33185h2 = enumC33185h1;
                z15 = z4;
                c2886a4 = c2886a;
                c2886a5 = c2886a2;
                c2886a6 = c2886a3;
                z16 = z13;
                interfaceC4339a2 = interfaceC4339a;
                c28655q = c28655q2;
                textResource3 = textResource2;
                modifier3 = modifier2;
                c33182g2 = c33182g1;
                j14 = j7;
                j15 = j13;
            }
            num2 = num;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue115 = ((Integer) obj2).intValue();
                        return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue115);
                    }
                };
            }
        }
        i16 |= 24576;
        textResource2 = textResource;
        i24 = i15 & 32;
        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i24 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (enumC33185h1 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC33185h1.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = 65536;
            }
            i16 |= i26;
        }
        i27 = i15 & 64;
        if (i27 != 0) {
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87153g(c33182g1)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87153g(statTitle)) {
                    i54 = 8388608;
                } else {
                    i54 = 4194304;
                }
                i16 |= i54;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z4)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i34;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
                }
                if ((i14 & 6) == 0) {
                    i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
                } else {
                    i35 = i14;
                }
                if ((i14 & 48) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                        if ((i14 & 64) == 0) {
                            zM87157i3 = c28655q2.m87153g(c2886a);
                        } else {
                            zM87157i3 = c28655q2.m87157i(c2886a);
                        }
                        if (zM87157i3) {
                            i57 = 32;
                        }
                    }
                    i35 |= i57;
                }
                if ((i14 & 384) == 0) {
                    if ((i15 & 4096) == 0) {
                        if ((i14 & 512) == 0) {
                            zM87157i2 = c28655q2.m87153g(c2886a2);
                        } else {
                            zM87157i2 = c28655q2.m87157i(c2886a2);
                        }
                        if (zM87157i2) {
                            i58 = 256;
                        }
                    }
                    i35 |= i58;
                }
                if ((i14 & 3072) == 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        if ((i14 & 4096) == 0) {
                            zM87157i = c28655q2.m87153g(c2886a3);
                        } else {
                            zM87157i = c28655q2.m87157i(c2886a3);
                        }
                        if (zM87157i) {
                            i64 = 2048;
                        }
                    }
                    i35 |= i64;
                }
                i36 = i35;
                i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i37 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (!c28655q2.m87155h(z13)) {
                            i18 = 8192;
                        }
                        i36 |= i18;
                    }
                    i38 = i15 & 32768;
                    if (i38 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i36 |= i25;
                    }
                    i39 = i16;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i39 & 1, z14)) {
                        c28655q2.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a11111115 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a11111115;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a1111111111119 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a1111111111119;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        } else {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i56 != 0) {
                                enumC33179f3 = EnumC33179f1.Start;
                            } else {
                                enumC33179f3 = enumC33179f1;
                            }
                            if (i59 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i17 != 0) {
                                textResource2 = null;
                            }
                            if (i24 != 0) {
                                enumC33185h3 = EnumC33185h1.TEXT;
                            } else {
                                enumC33185h3 = enumC33185h1;
                            }
                            if (i27 != 0) {
                                c33182g3 = null;
                            } else {
                                c33182g3 = c33182g1;
                            }
                            if (i29 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            if ((i15 & 512) != 0) {
                                i45 = i39 & (-1879048193);
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            } else {
                                jM125430y = j7;
                                i45 = i39;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                i46 = 6;
                                i36 &= -15;
                                jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                            } else {
                                i46 = 6;
                                jM125382b1 = j13;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                                i36 &= -113;
                            } else {
                                c2886aM8403A = c2886a;
                            }
                            if ((i15 & 4096) != 0) {
                                c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                                i36 &= -897;
                            } else {
                                c2886aM8420a = c2886a2;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                                i36 &= -7169;
                            } else {
                                c2886aM8415M = c2886a3;
                            }
                            if (i37 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i38 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32940v(15);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a11111116 = (InterfaceC4339a) objM87133R;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886aM8415M;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a11111116;
                                enumC33179f4 = enumC33179f3;
                            } else {
                                C2886a c2886a11111111111110 = c2886aM8415M;
                                enumC33179f4 = enumC33179f3;
                                c2886a7 = c2886aM8403A;
                                c2886a8 = c2886a11111111111110;
                                z19 = z18;
                                i47 = i36;
                                num4 = num3;
                                i48 = i45;
                                c33182g4 = c33182g3;
                                c2886a9 = c2886aM8420a;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                        }
                        c28655q2.m87175r();
                        if (num4 != null) {
                            c28655q2.m87150e0(323385136);
                            if ((i47 & 458752) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z27) {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C31918g(interfaceC4339a3, 2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Modifier modifier111113 = modifier2;
                            modifierM3362g = AbstractC1092a.m3362g(modifier111113, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            modifier4 = modifier111113;
                            c28655q2.m87173q(false);
                        } else {
                            modifier4 = modifier2;
                            c28655q2.m87150e0(323386173);
                            c28655q2.m87173q(false);
                            modifierM3362g = modifier4;
                        }
                        i49 = a.f138459a[enumC33179f4.ordinal()];
                        if (i49 != 1) {
                            c2305k = C2299e.f9110M;
                        } else {
                            if (i49 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2305k = C2299e.f9111N;
                        }
                        C28674u2 c28674u116 = AbstractC2453v1.f9575n;
                        enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u116);
                        Modifier modifier111114 = modifier4;
                        num = num4;
                        C23010x c23010xM66775a115 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111113 = c28655q2.m87165m();
                        Modifier modifierM118962N11111113 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c33182g5 = c33182g4;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        C2886a c2886a11111111111111 = c2886a7;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a115);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111113);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111113);
                        Modifier modifierM3429z115 = AbstractC1102d.m3429z(c2314t, null, 3);
                        C2886a c2886a11111111111112 = c2886a9;
                        C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        InterfaceC4339a interfaceC4339a11111117 = interfaceC4339a3;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111114 = c28655q2.m87165m();
                        Modifier modifierM118962N11111114 = AbstractC37056f.m118962N(c28655q2, modifierM3429z115);
                        c28655q2.m87158i0();
                        TextResource textResource118 = textResource2;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a115);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111114);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111114);
                        if (z19) {
                            enumC39181m = EnumC39181m.f168423w;
                        }
                        EnumC33185h1 enumC33185h118 = enumC33185h3;
                        long j1111114 = jM125430y;
                        AbstractC28683x.m87247a(c28674u116.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1111114, c2886a11111111111111, textResource118, enumC33185h118, c2886a11111111111112)), c28655q2, 56);
                        if (num == null) {
                            c28655q2.m87150e0(109632338);
                            z24 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(109632339);
                            int iIntValue115 = num.intValue();
                            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                            float f1111111 = 4;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue115, c28655q2, 6), null, AbstractC1102d.m3415l(f1111111 * f1111111, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                            z24 = false;
                            c28655q2.m87173q(false);
                        }
                        if (c33182g5 == null) {
                            c28655q2.m87150e0(110152053);
                            c28655q2.m87173q(z24);
                            z26 = z17;
                            z25 = true;
                        } else {
                            c28655q2.m87150e0(110152054);
                            float f1111112 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1111112, 0.0f, 0.0f, 0.0f, 14));
                            Modifier modifierM3398t115 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1111112, 0.0f, 0.0f, 13);
                            InterfaceC39127r0 interfaceC39127r0M66763d115 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11111115 = c28655q2.m87165m();
                            Modifier modifierM118962N11111115 = AbstractC37056f.m118962N(c28655q2, modifierM3398t115);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d115);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111115);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111115);
                            z25 = true;
                            boolean z21112 = z17;
                            AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21112, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                            z26 = z21112;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z25);
                        long j1111115 = jM125382b1;
                        C2886a c2886a11111111111113 = c2886a8;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1111115, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11111111111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                        c28655q2.m87173q(z25);
                        modifier3 = modifier111114;
                        interfaceC4339a2 = interfaceC4339a11111117;
                        z15 = z26;
                        c2886a4 = c2886a11111111111111;
                        j15 = j1111115;
                        c2886a6 = c2886a11111111111113;
                        z16 = z19;
                        j14 = j1111114;
                        textResource3 = textResource118;
                        enumC33185h2 = enumC33185h118;
                        c2886a5 = c2886a11111111111112;
                        enumC33179f2 = enumC33179f4;
                        c33182g2 = c33182g5;
                    } else {
                        c28655q2.m87138X();
                        enumC33179f2 = enumC33179f1;
                        enumC33185h2 = enumC33185h1;
                        z15 = z4;
                        c2886a4 = c2886a;
                        c2886a5 = c2886a2;
                        c2886a6 = c2886a3;
                        z16 = z13;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q = c28655q2;
                        textResource3 = textResource2;
                        modifier3 = modifier2;
                        c33182g2 = c33182g1;
                        j14 = j7;
                        j15 = j13;
                    }
                    num2 = num;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue116 = ((Integer) obj2).intValue();
                                return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue116);
                            }
                        };
                    }
                }
                i36 |= 24576;
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a11111118 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a11111118;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11111111111114 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11111111111114;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a11111119 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a11111119;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11111111111115 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11111111111115;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier111115 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier111115, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier111115;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u117 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u117);
                    Modifier modifier111116 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a116 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111116 = c28655q2.m87165m();
                    Modifier modifierM118962N11111116 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a11111111111116 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a116);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111116);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111116);
                    Modifier modifierM3429z116 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a11111111111117 = c2886a9;
                    C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a111111110 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111117 = c28655q2.m87165m();
                    Modifier modifierM118962N11111117 = AbstractC37056f.m118962N(c28655q2, modifierM3429z116);
                    c28655q2.m87158i0();
                    TextResource textResource119 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a116);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111117);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111117);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h119 = enumC33185h3;
                    long j1111116 = jM125430y;
                    AbstractC28683x.m87247a(c28674u117.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1111116, c2886a11111111111116, textResource119, enumC33185h119, c2886a11111111111117)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue116 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f1111113 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue116, c28655q2, 6), null, AbstractC1102d.m3415l(f1111113 * f1111113, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f1111114 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1111114, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t116 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1111114, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d116 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111118 = c28655q2.m87165m();
                        Modifier modifierM118962N11111118 = AbstractC37056f.m118962N(c28655q2, modifierM3398t116);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d116);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111118);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111118);
                        z25 = true;
                        boolean z21113 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21113, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z21113;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j1111117 = jM125382b1;
                    C2886a c2886a11111111111118 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1111117, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11111111111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier111116;
                    interfaceC4339a2 = interfaceC4339a111111110;
                    z15 = z26;
                    c2886a4 = c2886a11111111111116;
                    j15 = j1111117;
                    c2886a6 = c2886a11111111111118;
                    z16 = z19;
                    j14 = j1111116;
                    textResource3 = textResource119;
                    enumC33185h2 = enumC33185h119;
                    c2886a5 = c2886a11111111111117;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue117 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue117);
                        }
                    };
                }
            }
            i16 |= 100663296;
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
            }
            if ((i14 & 6) == 0) {
                i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
            } else {
                i35 = i14;
            }
            if ((i14 & 48) == 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                    if ((i14 & 64) == 0) {
                        zM87157i3 = c28655q2.m87153g(c2886a);
                    } else {
                        zM87157i3 = c28655q2.m87157i(c2886a);
                    }
                    if (zM87157i3) {
                        i57 = 32;
                    }
                }
                i35 |= i57;
            }
            if ((i14 & 384) == 0) {
                if ((i15 & 4096) == 0) {
                    if ((i14 & 512) == 0) {
                        zM87157i2 = c28655q2.m87153g(c2886a2);
                    } else {
                        zM87157i2 = c28655q2.m87157i(c2886a2);
                    }
                    if (zM87157i2) {
                        i58 = 256;
                    }
                }
                i35 |= i58;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    if ((i14 & 4096) == 0) {
                        zM87157i = c28655q2.m87153g(c2886a3);
                    } else {
                        zM87157i = c28655q2.m87157i(c2886a3);
                    }
                    if (zM87157i) {
                        i64 = 2048;
                    }
                }
                i35 |= i64;
            }
            i36 = i35;
            i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i37 != 0) {
                if ((i14 & 24576) == 0) {
                    if (!c28655q2.m87155h(z13)) {
                        i18 = 8192;
                    }
                    i36 |= i18;
                }
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a111111111 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a111111111;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a11111111111119 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a11111111111119;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a111111112 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a111111112;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a111111111111110 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a111111111111110;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier111117 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier111117, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier111117;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u118 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u118);
                    Modifier modifier111118 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a117 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111119 = c28655q2.m87165m();
                    Modifier modifierM118962N11111119 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a111111111111111 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a117);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11111119);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11111119);
                    Modifier modifierM3429z117 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a111111111111112 = c2886a9;
                    C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a111111113 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111110 = c28655q2.m87165m();
                    Modifier modifierM118962N111111110 = AbstractC37056f.m118962N(c28655q2, modifierM3429z117);
                    c28655q2.m87158i0();
                    TextResource textResource1110 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a117);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111110);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h1110 = enumC33185h3;
                    long j1111118 = jM125430y;
                    AbstractC28683x.m87247a(c28674u118.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j1111118, c2886a111111111111111, textResource1110, enumC33185h1110, c2886a111111111111112)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue117 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f1111115 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue117, c28655q2, 6), null, AbstractC1102d.m3415l(f1111115 * f1111115, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f1111116 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1111116, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t117 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1111116, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d117 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111111 = c28655q2.m87165m();
                        Modifier modifierM118962N111111111 = AbstractC37056f.m118962N(c28655q2, modifierM3398t117);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d117);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111111);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111111);
                        z25 = true;
                        boolean z21114 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21114, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z21114;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j1111119 = jM125382b1;
                    C2886a c2886a111111111111113 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j1111119, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a111111111111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier111118;
                    interfaceC4339a2 = interfaceC4339a111111113;
                    z15 = z26;
                    c2886a4 = c2886a111111111111111;
                    j15 = j1111119;
                    c2886a6 = c2886a111111111111113;
                    z16 = z19;
                    j14 = j1111118;
                    textResource3 = textResource1110;
                    enumC33185h2 = enumC33185h1110;
                    c2886a5 = c2886a111111111111112;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue118 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue118);
                        }
                    };
                }
            }
            i36 |= 24576;
            i38 = i15 & 32768;
            if (i38 != 0) {
                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i36 |= i25;
            }
            i39 = i16;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q2.m87135U(i39 & 1, z14)) {
                c28655q2.m87140Z();
                i44 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a111111114 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a111111114;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a111111111111114 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a111111111111114;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a111111115 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a111111115;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a111111111111115 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a111111111111115;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q2.m87175r();
                if (num4 != null) {
                    c28655q2.m87150e0(323385136);
                    if ((i47 & 458752) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z27) {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifier111119 = modifier2;
                    modifierM3362g = AbstractC1092a.m3362g(modifier111119, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    modifier4 = modifier111119;
                    c28655q2.m87173q(false);
                } else {
                    modifier4 = modifier2;
                    c28655q2.m87150e0(323386173);
                    c28655q2.m87173q(false);
                    modifierM3362g = modifier4;
                }
                i49 = a.f138459a[enumC33179f4.ordinal()];
                if (i49 != 1) {
                    c2305k = C2299e.f9110M;
                } else {
                    if (i49 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2305k = C2299e.f9111N;
                }
                C28674u2 c28674u119 = AbstractC2453v1.f9575n;
                enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u119);
                Modifier modifier1111110 = modifier4;
                num = num4;
                C23010x c23010xM66775a118 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111112 = c28655q2.m87165m();
                Modifier modifierM118962N111111112 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c33182g5 = c33182g4;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                C2886a c2886a111111111111116 = c2886a7;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a118);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111112);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111112);
                Modifier modifierM3429z118 = AbstractC1102d.m3429z(c2314t, null, 3);
                C2886a c2886a111111111111117 = c2886a9;
                C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                InterfaceC4339a interfaceC4339a111111116 = interfaceC4339a3;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111113 = c28655q2.m87165m();
                Modifier modifierM118962N111111113 = AbstractC37056f.m118962N(c28655q2, modifierM3429z118);
                c28655q2.m87158i0();
                TextResource textResource1111 = textResource2;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a118);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111113);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111113);
                if (z19) {
                    enumC39181m = EnumC39181m.f168423w;
                }
                EnumC33185h1 enumC33185h1111 = enumC33185h3;
                long j11111110 = jM125430y;
                AbstractC28683x.m87247a(c28674u119.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11111110, c2886a111111111111116, textResource1111, enumC33185h1111, c2886a111111111111117)), c28655q2, 56);
                if (num == null) {
                    c28655q2.m87150e0(109632338);
                    z24 = false;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(109632339);
                    int iIntValue118 = num.intValue();
                    AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                    float f1111117 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue118, c28655q2, 6), null, AbstractC1102d.m3415l(f1111117 * f1111117, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                    z24 = false;
                    c28655q2.m87173q(false);
                }
                if (c33182g5 == null) {
                    c28655q2.m87150e0(110152053);
                    c28655q2.m87173q(z24);
                    z26 = z17;
                    z25 = true;
                } else {
                    c28655q2.m87150e0(110152054);
                    float f1111118 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f1111118, 0.0f, 0.0f, 0.0f, 14));
                    Modifier modifierM3398t118 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f1111118, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d118 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111114 = c28655q2.m87165m();
                    Modifier modifierM118962N111111114 = AbstractC37056f.m118962N(c28655q2, modifierM3398t118);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d118);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111114);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111114);
                    z25 = true;
                    boolean z21115 = z17;
                    AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21115, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                    z26 = z21115;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z25);
                long j11111111 = jM125382b1;
                C2886a c2886a111111111111118 = c2886a8;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11111111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a111111111111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                c28655q2.m87173q(z25);
                modifier3 = modifier1111110;
                interfaceC4339a2 = interfaceC4339a111111116;
                z15 = z26;
                c2886a4 = c2886a111111111111116;
                j15 = j11111111;
                c2886a6 = c2886a111111111111118;
                z16 = z19;
                j14 = j11111110;
                textResource3 = textResource1111;
                enumC33185h2 = enumC33185h1111;
                c2886a5 = c2886a111111111111117;
                enumC33179f2 = enumC33179f4;
                c33182g2 = c33182g5;
            } else {
                c28655q2.m87138X();
                enumC33179f2 = enumC33179f1;
                enumC33185h2 = enumC33185h1;
                z15 = z4;
                c2886a4 = c2886a;
                c2886a5 = c2886a2;
                c2886a6 = c2886a3;
                z16 = z13;
                interfaceC4339a2 = interfaceC4339a;
                c28655q = c28655q2;
                textResource3 = textResource2;
                modifier3 = modifier2;
                c33182g2 = c33182g1;
                j14 = j7;
                j15 = j13;
            }
            num2 = num;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue119 = ((Integer) obj2).intValue();
                        return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue119);
                    }
                };
            }
        }
        i16 |= 1572864;
        if ((i13 & 12582912) == 0) {
            if (c28655q2.m87153g(statTitle)) {
                i54 = 8388608;
            } else {
                i54 = 4194304;
            }
            i16 |= i54;
        }
        i29 = i15 & 256;
        if (i29 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87155h(z4)) {
                    i34 = 67108864;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i34;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
            }
            if ((i14 & 6) == 0) {
                i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
            } else {
                i35 = i14;
            }
            if ((i14 & 48) == 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                    if ((i14 & 64) == 0) {
                        zM87157i3 = c28655q2.m87153g(c2886a);
                    } else {
                        zM87157i3 = c28655q2.m87157i(c2886a);
                    }
                    if (zM87157i3) {
                        i57 = 32;
                    }
                }
                i35 |= i57;
            }
            if ((i14 & 384) == 0) {
                if ((i15 & 4096) == 0) {
                    if ((i14 & 512) == 0) {
                        zM87157i2 = c28655q2.m87153g(c2886a2);
                    } else {
                        zM87157i2 = c28655q2.m87157i(c2886a2);
                    }
                    if (zM87157i2) {
                        i58 = 256;
                    }
                }
                i35 |= i58;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    if ((i14 & 4096) == 0) {
                        zM87157i = c28655q2.m87153g(c2886a3);
                    } else {
                        zM87157i = c28655q2.m87157i(c2886a3);
                    }
                    if (zM87157i) {
                        i64 = 2048;
                    }
                }
                i35 |= i64;
            }
            i36 = i35;
            i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i37 != 0) {
                if ((i14 & 24576) == 0) {
                    if (!c28655q2.m87155h(z13)) {
                        i18 = 8192;
                    }
                    i36 |= i18;
                }
                i38 = i15 & 32768;
                if (i38 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i36 |= i25;
                }
                i39 = i16;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i39 & 1, z14)) {
                    c28655q2.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a111111117 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a111111117;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a111111111111119 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a111111111111119;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i56 != 0) {
                            enumC33179f3 = EnumC33179f1.Start;
                        } else {
                            enumC33179f3 = enumC33179f1;
                        }
                        if (i59 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i17 != 0) {
                            textResource2 = null;
                        }
                        if (i24 != 0) {
                            enumC33185h3 = EnumC33185h1.TEXT;
                        } else {
                            enumC33185h3 = enumC33185h1;
                        }
                        if (i27 != 0) {
                            c33182g3 = null;
                        } else {
                            c33182g3 = c33182g1;
                        }
                        if (i29 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        if ((i15 & 512) != 0) {
                            i45 = i39 & (-1879048193);
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        } else {
                            jM125430y = j7;
                            i45 = i39;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 = 6;
                            i36 &= -15;
                            jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                        } else {
                            i46 = 6;
                            jM125382b1 = j13;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                            i36 &= -113;
                        } else {
                            c2886aM8403A = c2886a;
                        }
                        if ((i15 & 4096) != 0) {
                            c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                            i36 &= -897;
                        } else {
                            c2886aM8420a = c2886a2;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                            i36 &= -7169;
                        } else {
                            c2886aM8415M = c2886a3;
                        }
                        if (i37 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i38 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32940v(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a111111118 = (InterfaceC4339a) objM87133R;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886aM8415M;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a111111118;
                            enumC33179f4 = enumC33179f3;
                        } else {
                            C2886a c2886a1111111111111110 = c2886aM8415M;
                            enumC33179f4 = enumC33179f3;
                            c2886a7 = c2886aM8403A;
                            c2886a8 = c2886a1111111111111110;
                            z19 = z18;
                            i47 = i36;
                            num4 = num3;
                            i48 = i45;
                            c33182g4 = c33182g3;
                            c2886a9 = c2886aM8420a;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    }
                    c28655q2.m87175r();
                    if (num4 != null) {
                        c28655q2.m87150e0(323385136);
                        if ((i47 & 458752) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z27) {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C31918g(interfaceC4339a3, 2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifier1111111 = modifier2;
                        modifierM3362g = AbstractC1092a.m3362g(modifier1111111, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        modifier4 = modifier1111111;
                        c28655q2.m87173q(false);
                    } else {
                        modifier4 = modifier2;
                        c28655q2.m87150e0(323386173);
                        c28655q2.m87173q(false);
                        modifierM3362g = modifier4;
                    }
                    i49 = a.f138459a[enumC33179f4.ordinal()];
                    if (i49 != 1) {
                        c2305k = C2299e.f9110M;
                    } else {
                        if (i49 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2305k = C2299e.f9111N;
                    }
                    C28674u2 c28674u1110 = AbstractC2453v1.f9575n;
                    enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u1110);
                    Modifier modifier1111112 = modifier4;
                    num = num4;
                    C23010x c23010xM66775a119 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111115 = c28655q2.m87165m();
                    Modifier modifierM118962N111111115 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c33182g5 = c33182g4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    C2886a c2886a1111111111111111 = c2886a7;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a119);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111115);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111115);
                    Modifier modifierM3429z119 = AbstractC1102d.m3429z(c2314t, null, 3);
                    C2886a c2886a1111111111111112 = c2886a9;
                    C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    InterfaceC4339a interfaceC4339a111111119 = interfaceC4339a3;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111116 = c28655q2.m87165m();
                    Modifier modifierM118962N111111116 = AbstractC37056f.m118962N(c28655q2, modifierM3429z119);
                    c28655q2.m87158i0();
                    TextResource textResource1112 = textResource2;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a119);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111116);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111116);
                    if (z19) {
                        enumC39181m = EnumC39181m.f168423w;
                    }
                    EnumC33185h1 enumC33185h1112 = enumC33185h3;
                    long j11111112 = jM125430y;
                    AbstractC28683x.m87247a(c28674u1110.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11111112, c2886a1111111111111111, textResource1112, enumC33185h1112, c2886a1111111111111112)), c28655q2, 56);
                    if (num == null) {
                        c28655q2.m87150e0(109632338);
                        z24 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(109632339);
                        int iIntValue119 = num.intValue();
                        AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                        float f1111119 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue119, c28655q2, 6), null, AbstractC1102d.m3415l(f1111119 * f1111119, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                        z24 = false;
                        c28655q2.m87173q(false);
                    }
                    if (c33182g5 == null) {
                        c28655q2.m87150e0(110152053);
                        c28655q2.m87173q(z24);
                        z26 = z17;
                        z25 = true;
                    } else {
                        c28655q2.m87150e0(110152054);
                        float f11111110 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f11111110, 0.0f, 0.0f, 0.0f, 14));
                        Modifier modifierM3398t119 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f11111110, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d119 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111117 = c28655q2.m87165m();
                        Modifier modifierM118962N111111117 = AbstractC37056f.m118962N(c28655q2, modifierM3398t119);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d119);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111117);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111117);
                        z25 = true;
                        boolean z21116 = z17;
                        AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21116, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                        z26 = z21116;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z25);
                    long j11111113 = jM125382b1;
                    C2886a c2886a1111111111111113 = c2886a8;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11111113, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1111111111111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                    c28655q2.m87173q(z25);
                    modifier3 = modifier1111112;
                    interfaceC4339a2 = interfaceC4339a111111119;
                    z15 = z26;
                    c2886a4 = c2886a1111111111111111;
                    j15 = j11111113;
                    c2886a6 = c2886a1111111111111113;
                    z16 = z19;
                    j14 = j11111112;
                    textResource3 = textResource1112;
                    enumC33185h2 = enumC33185h1112;
                    c2886a5 = c2886a1111111111111112;
                    enumC33179f2 = enumC33179f4;
                    c33182g2 = c33182g5;
                } else {
                    c28655q2.m87138X();
                    enumC33179f2 = enumC33179f1;
                    enumC33185h2 = enumC33185h1;
                    z15 = z4;
                    c2886a4 = c2886a;
                    c2886a5 = c2886a2;
                    c2886a6 = c2886a3;
                    z16 = z13;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q = c28655q2;
                    textResource3 = textResource2;
                    modifier3 = modifier2;
                    c33182g2 = c33182g1;
                    j14 = j7;
                    j15 = j13;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue1110 = ((Integer) obj2).intValue();
                            return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue1110);
                        }
                    };
                }
            }
            i36 |= 24576;
            i38 = i15 & 32768;
            if (i38 != 0) {
                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i36 |= i25;
            }
            i39 = i16;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q2.m87135U(i39 & 1, z14)) {
                c28655q2.m87140Z();
                i44 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a1111111110 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a1111111110;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a1111111111111114 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a1111111111111114;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a1111111111 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a1111111111;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a1111111111111115 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a1111111111111115;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q2.m87175r();
                if (num4 != null) {
                    c28655q2.m87150e0(323385136);
                    if ((i47 & 458752) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z27) {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifier1111113 = modifier2;
                    modifierM3362g = AbstractC1092a.m3362g(modifier1111113, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    modifier4 = modifier1111113;
                    c28655q2.m87173q(false);
                } else {
                    modifier4 = modifier2;
                    c28655q2.m87150e0(323386173);
                    c28655q2.m87173q(false);
                    modifierM3362g = modifier4;
                }
                i49 = a.f138459a[enumC33179f4.ordinal()];
                if (i49 != 1) {
                    c2305k = C2299e.f9110M;
                } else {
                    if (i49 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2305k = C2299e.f9111N;
                }
                C28674u2 c28674u1111 = AbstractC2453v1.f9575n;
                enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u1111);
                Modifier modifier1111114 = modifier4;
                num = num4;
                C23010x c23010xM66775a1110 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111118 = c28655q2.m87165m();
                Modifier modifierM118962N111111118 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c33182g5 = c33182g4;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                C2886a c2886a1111111111111116 = c2886a7;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a1110);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111118);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111118);
                Modifier modifierM3429z1110 = AbstractC1102d.m3429z(c2314t, null, 3);
                C2886a c2886a1111111111111117 = c2886a9;
                C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                InterfaceC4339a interfaceC4339a1111111112 = interfaceC4339a3;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111119 = c28655q2.m87165m();
                Modifier modifierM118962N111111119 = AbstractC37056f.m118962N(c28655q2, modifierM3429z1110);
                c28655q2.m87158i0();
                TextResource textResource1113 = textResource2;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a1110);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m111111119);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N111111119);
                if (z19) {
                    enumC39181m = EnumC39181m.f168423w;
                }
                EnumC33185h1 enumC33185h1113 = enumC33185h3;
                long j11111114 = jM125430y;
                AbstractC28683x.m87247a(c28674u1111.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11111114, c2886a1111111111111116, textResource1113, enumC33185h1113, c2886a1111111111111117)), c28655q2, 56);
                if (num == null) {
                    c28655q2.m87150e0(109632338);
                    z24 = false;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(109632339);
                    int iIntValue1110 = num.intValue();
                    AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                    float f11111111 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue1110, c28655q2, 6), null, AbstractC1102d.m3415l(f11111111 * f11111111, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                    z24 = false;
                    c28655q2.m87173q(false);
                }
                if (c33182g5 == null) {
                    c28655q2.m87150e0(110152053);
                    c28655q2.m87173q(z24);
                    z26 = z17;
                    z25 = true;
                } else {
                    c28655q2.m87150e0(110152054);
                    float f11111112 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f11111112, 0.0f, 0.0f, 0.0f, 14));
                    Modifier modifierM3398t1110 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f11111112, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d1110 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111110 = c28655q2.m87165m();
                    Modifier modifierM118962N1111111110 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1110);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d1110);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111111110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111111110);
                    z25 = true;
                    boolean z21117 = z17;
                    AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21117, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                    z26 = z21117;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z25);
                long j11111115 = jM125382b1;
                C2886a c2886a1111111111111118 = c2886a8;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11111115, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a1111111111111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                c28655q2.m87173q(z25);
                modifier3 = modifier1111114;
                interfaceC4339a2 = interfaceC4339a1111111112;
                z15 = z26;
                c2886a4 = c2886a1111111111111116;
                j15 = j11111115;
                c2886a6 = c2886a1111111111111118;
                z16 = z19;
                j14 = j11111114;
                textResource3 = textResource1113;
                enumC33185h2 = enumC33185h1113;
                c2886a5 = c2886a1111111111111117;
                enumC33179f2 = enumC33179f4;
                c33182g2 = c33182g5;
            } else {
                c28655q2.m87138X();
                enumC33179f2 = enumC33179f1;
                enumC33185h2 = enumC33185h1;
                z15 = z4;
                c2886a4 = c2886a;
                c2886a5 = c2886a2;
                c2886a6 = c2886a3;
                z16 = z13;
                interfaceC4339a2 = interfaceC4339a;
                c28655q = c28655q2;
                textResource3 = textResource2;
                modifier3 = modifier2;
                c33182g2 = c33182g1;
                j14 = j7;
                j15 = j13;
            }
            num2 = num;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue1111 = ((Integer) obj2).intValue();
                        return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue1111);
                    }
                };
            }
        }
        i16 |= 100663296;
        if ((i13 & 805306368) != 0) {
            i16 |= ((i15 & 512) == 0 || !c28655q2.m87151f(j7)) ? 268435456 : 536870912;
        }
        if ((i14 & 6) == 0) {
            i35 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87151f(j13)) ? 2 : 4);
        } else {
            i35 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
                if ((i14 & 64) == 0) {
                    zM87157i3 = c28655q2.m87153g(c2886a);
                } else {
                    zM87157i3 = c28655q2.m87157i(c2886a);
                }
                if (zM87157i3) {
                    i57 = 32;
                }
            }
            i35 |= i57;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 4096) == 0) {
                if ((i14 & 512) == 0) {
                    zM87157i2 = c28655q2.m87153g(c2886a2);
                } else {
                    zM87157i2 = c28655q2.m87157i(c2886a2);
                }
                if (zM87157i2) {
                    i58 = 256;
                }
            }
            i35 |= i58;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                if ((i14 & 4096) == 0) {
                    zM87157i = c28655q2.m87153g(c2886a3);
                } else {
                    zM87157i = c28655q2.m87157i(c2886a3);
                }
                if (zM87157i) {
                    i64 = 2048;
                }
            }
            i35 |= i64;
        }
        i36 = i35;
        i37 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i37 != 0) {
            if ((i14 & 24576) == 0) {
                if (!c28655q2.m87155h(z13)) {
                    i18 = 8192;
                }
                i36 |= i18;
            }
            i38 = i15 & 32768;
            if (i38 != 0) {
                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i36 |= i25;
            }
            i39 = i16;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q2.m87135U(i39 & 1, z14)) {
                c28655q2.m87140Z();
                i44 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a1111111113 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a1111111113;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a1111111111111119 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a1111111111111119;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i56 != 0) {
                        enumC33179f3 = EnumC33179f1.Start;
                    } else {
                        enumC33179f3 = enumC33179f1;
                    }
                    if (i59 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i17 != 0) {
                        textResource2 = null;
                    }
                    if (i24 != 0) {
                        enumC33185h3 = EnumC33185h1.TEXT;
                    } else {
                        enumC33185h3 = enumC33185h1;
                    }
                    if (i27 != 0) {
                        c33182g3 = null;
                    } else {
                        c33182g3 = c33182g1;
                    }
                    if (i29 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    if ((i15 & 512) != 0) {
                        i45 = i39 & (-1879048193);
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    } else {
                        jM125430y = j7;
                        i45 = i39;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        i46 = 6;
                        i36 &= -15;
                        jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                    } else {
                        i46 = 6;
                        jM125382b1 = j13;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                        i36 &= -113;
                    } else {
                        c2886aM8403A = c2886a;
                    }
                    if ((i15 & 4096) != 0) {
                        c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                        i36 &= -897;
                    } else {
                        c2886aM8420a = c2886a2;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                        i36 &= -7169;
                    } else {
                        c2886aM8415M = c2886a3;
                    }
                    if (i37 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i38 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a1111111114 = (InterfaceC4339a) objM87133R;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886aM8415M;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a1111111114;
                        enumC33179f4 = enumC33179f3;
                    } else {
                        C2886a c2886a11111111111111110 = c2886aM8415M;
                        enumC33179f4 = enumC33179f3;
                        c2886a7 = c2886aM8403A;
                        c2886a8 = c2886a11111111111111110;
                        z19 = z18;
                        i47 = i36;
                        num4 = num3;
                        i48 = i45;
                        c33182g4 = c33182g3;
                        c2886a9 = c2886aM8420a;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q2.m87175r();
                if (num4 != null) {
                    c28655q2.m87150e0(323385136);
                    if ((i47 & 458752) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z27) {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C31918g(interfaceC4339a3, 2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifier1111115 = modifier2;
                    modifierM3362g = AbstractC1092a.m3362g(modifier1111115, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    modifier4 = modifier1111115;
                    c28655q2.m87173q(false);
                } else {
                    modifier4 = modifier2;
                    c28655q2.m87150e0(323386173);
                    c28655q2.m87173q(false);
                    modifierM3362g = modifier4;
                }
                i49 = a.f138459a[enumC33179f4.ordinal()];
                if (i49 != 1) {
                    c2305k = C2299e.f9110M;
                } else {
                    if (i49 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2305k = C2299e.f9111N;
                }
                C28674u2 c28674u1112 = AbstractC2453v1.f9575n;
                enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u1112);
                Modifier modifier1111116 = modifier4;
                num = num4;
                C23010x c23010xM66775a1111 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111111 = c28655q2.m87165m();
                Modifier modifierM118962N1111111111 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c33182g5 = c33182g4;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                C2886a c2886a11111111111111111 = c2886a7;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a1111);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111111111);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111111111);
                Modifier modifierM3429z1111 = AbstractC1102d.m3429z(c2314t, null, 3);
                C2886a c2886a11111111111111112 = c2886a9;
                C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                InterfaceC4339a interfaceC4339a1111111115 = interfaceC4339a3;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111112 = c28655q2.m87165m();
                Modifier modifierM118962N1111111112 = AbstractC37056f.m118962N(c28655q2, modifierM3429z1111);
                c28655q2.m87158i0();
                TextResource textResource1114 = textResource2;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a1111);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111111112);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111111112);
                if (z19) {
                    enumC39181m = EnumC39181m.f168423w;
                }
                EnumC33185h1 enumC33185h1114 = enumC33185h3;
                long j11111116 = jM125430y;
                AbstractC28683x.m87247a(c28674u1112.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11111116, c2886a11111111111111111, textResource1114, enumC33185h1114, c2886a11111111111111112)), c28655q2, 56);
                if (num == null) {
                    c28655q2.m87150e0(109632338);
                    z24 = false;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(109632339);
                    int iIntValue1111 = num.intValue();
                    AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                    float f11111113 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue1111, c28655q2, 6), null, AbstractC1102d.m3415l(f11111113 * f11111113, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                    z24 = false;
                    c28655q2.m87173q(false);
                }
                if (c33182g5 == null) {
                    c28655q2.m87150e0(110152053);
                    c28655q2.m87173q(z24);
                    z26 = z17;
                    z25 = true;
                } else {
                    c28655q2.m87150e0(110152054);
                    float f11111114 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f11111114, 0.0f, 0.0f, 0.0f, 14));
                    Modifier modifierM3398t1111 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f11111114, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d1111 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111113 = c28655q2.m87165m();
                    Modifier modifierM118962N1111111113 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1111);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d1111);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111111113);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111111113);
                    z25 = true;
                    boolean z21118 = z17;
                    AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21118, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                    z26 = z21118;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z25);
                long j11111117 = jM125382b1;
                C2886a c2886a11111111111111113 = c2886a8;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11111117, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11111111111111113, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
                c28655q2.m87173q(z25);
                modifier3 = modifier1111116;
                interfaceC4339a2 = interfaceC4339a1111111115;
                z15 = z26;
                c2886a4 = c2886a11111111111111111;
                j15 = j11111117;
                c2886a6 = c2886a11111111111111113;
                z16 = z19;
                j14 = j11111116;
                textResource3 = textResource1114;
                enumC33185h2 = enumC33185h1114;
                c2886a5 = c2886a11111111111111112;
                enumC33179f2 = enumC33179f4;
                c33182g2 = c33182g5;
            } else {
                c28655q2.m87138X();
                enumC33179f2 = enumC33179f1;
                enumC33185h2 = enumC33185h1;
                z15 = z4;
                c2886a4 = c2886a;
                c2886a5 = c2886a2;
                c2886a6 = c2886a3;
                z16 = z13;
                interfaceC4339a2 = interfaceC4339a;
                c28655q = c28655q2;
                textResource3 = textResource2;
                modifier3 = modifier2;
                c33182g2 = c33182g1;
                j14 = j7;
                j15 = j13;
            }
            num2 = num;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue1112 = ((Integer) obj2).intValue();
                        return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue1112);
                    }
                };
            }
        }
        i36 |= 24576;
        i38 = i15 & 32768;
        if (i38 != 0) {
            i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            }
            i36 |= i25;
        }
        i39 = i16;
        if ((i16 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c28655q2.m87135U(i39 & 1, z14)) {
            c28655q2.m87140Z();
            i44 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            c2314t = C2314t.f9131w;
            if (i44 != 0) {
                if (i55 != 0) {
                    modifier2 = c2314t;
                }
                if (i56 != 0) {
                    enumC33179f3 = EnumC33179f1.Start;
                } else {
                    enumC33179f3 = enumC33179f1;
                }
                if (i59 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if (i17 != 0) {
                    textResource2 = null;
                }
                if (i24 != 0) {
                    enumC33185h3 = EnumC33185h1.TEXT;
                } else {
                    enumC33185h3 = enumC33185h1;
                }
                if (i27 != 0) {
                    c33182g3 = null;
                } else {
                    c33182g3 = c33182g1;
                }
                if (i29 != 0) {
                    z17 = false;
                } else {
                    z17 = z4;
                }
                if ((i15 & 512) != 0) {
                    i45 = i39 & (-1879048193);
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                } else {
                    jM125430y = j7;
                    i45 = i39;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    i46 = 6;
                    i36 &= -15;
                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                } else {
                    i46 = 6;
                    jM125382b1 = j13;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                    i36 &= -113;
                } else {
                    c2886aM8403A = c2886a;
                }
                if ((i15 & 4096) != 0) {
                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                    i36 &= -897;
                } else {
                    c2886aM8420a = c2886a2;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                    i36 &= -7169;
                } else {
                    c2886aM8415M = c2886a3;
                }
                if (i37 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                if (i38 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32940v(15);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a1111111116 = (InterfaceC4339a) objM87133R;
                    c2886a7 = c2886aM8403A;
                    c2886a8 = c2886aM8415M;
                    z19 = z18;
                    i47 = i36;
                    num4 = num3;
                    i48 = i45;
                    c33182g4 = c33182g3;
                    c2886a9 = c2886aM8420a;
                    interfaceC4339a3 = interfaceC4339a1111111116;
                    enumC33179f4 = enumC33179f3;
                } else {
                    C2886a c2886a11111111111111114 = c2886aM8415M;
                    enumC33179f4 = enumC33179f3;
                    c2886a7 = c2886aM8403A;
                    c2886a8 = c2886a11111111111111114;
                    z19 = z18;
                    i47 = i36;
                    num4 = num3;
                    i48 = i45;
                    c33182g4 = c33182g3;
                    c2886a9 = c2886aM8420a;
                    interfaceC4339a3 = interfaceC4339a;
                }
            } else {
                if (i55 != 0) {
                    modifier2 = c2314t;
                }
                if (i56 != 0) {
                    enumC33179f3 = EnumC33179f1.Start;
                } else {
                    enumC33179f3 = enumC33179f1;
                }
                if (i59 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if (i17 != 0) {
                    textResource2 = null;
                }
                if (i24 != 0) {
                    enumC33185h3 = EnumC33185h1.TEXT;
                } else {
                    enumC33185h3 = enumC33185h1;
                }
                if (i27 != 0) {
                    c33182g3 = null;
                } else {
                    c33182g3 = c33182g1;
                }
                if (i29 != 0) {
                    z17 = false;
                } else {
                    z17 = z4;
                }
                if ((i15 & 512) != 0) {
                    i45 = i39 & (-1879048193);
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                } else {
                    jM125430y = j7;
                    i45 = i39;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    i46 = 6;
                    i36 &= -15;
                    jM125382b1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                } else {
                    i46 = 6;
                    jM125382b1 = j13;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    c2886aM8403A = C38072d.f163053a.m121952e(c28655q2, i46).getN5();
                    i36 &= -113;
                } else {
                    c2886aM8403A = c2886a;
                }
                if ((i15 & 4096) != 0) {
                    c2886aM8420a = C38072d.f163053a.m121952e(c28655q2, 6).getB1();
                    i36 &= -897;
                } else {
                    c2886aM8420a = c2886a2;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
                    i36 &= -7169;
                } else {
                    c2886aM8415M = c2886a3;
                }
                if (i37 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                if (i38 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32940v(15);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a1111111117 = (InterfaceC4339a) objM87133R;
                    c2886a7 = c2886aM8403A;
                    c2886a8 = c2886aM8415M;
                    z19 = z18;
                    i47 = i36;
                    num4 = num3;
                    i48 = i45;
                    c33182g4 = c33182g3;
                    c2886a9 = c2886aM8420a;
                    interfaceC4339a3 = interfaceC4339a1111111117;
                    enumC33179f4 = enumC33179f3;
                } else {
                    C2886a c2886a11111111111111115 = c2886aM8415M;
                    enumC33179f4 = enumC33179f3;
                    c2886a7 = c2886aM8403A;
                    c2886a8 = c2886a11111111111111115;
                    z19 = z18;
                    i47 = i36;
                    num4 = num3;
                    i48 = i45;
                    c33182g4 = c33182g3;
                    c2886a9 = c2886aM8420a;
                    interfaceC4339a3 = interfaceC4339a;
                }
            }
            c28655q2.m87175r();
            if (num4 != null) {
                c28655q2.m87150e0(323385136);
                if ((i47 & 458752) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z27) {
                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C31918g(interfaceC4339a3, 2);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifier1111117 = modifier2;
                modifierM3362g = AbstractC1092a.m3362g(modifier1111117, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                modifier4 = modifier1111117;
                c28655q2.m87173q(false);
            } else {
                modifier4 = modifier2;
                c28655q2.m87150e0(323386173);
                c28655q2.m87173q(false);
                modifierM3362g = modifier4;
            }
            i49 = a.f138459a[enumC33179f4.ordinal()];
            if (i49 != 1) {
                c2305k = C2299e.f9110M;
            } else {
                if (i49 == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c2305k = C2299e.f9111N;
            }
            C28674u2 c28674u1113 = AbstractC2453v1.f9575n;
            enumC39181m = (EnumC39181m) c28655q2.m87161k(c28674u1113);
            Modifier modifier1111118 = modifier4;
            num = num4;
            C23010x c23010xM66775a1112 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111111114 = c28655q2.m87165m();
            Modifier modifierM118962N1111111114 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
            InterfaceC0221l.f734a.getClass();
            c33182g5 = c33182g4;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            C2886a c2886a11111111111111116 = c2886a7;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a1112);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111111114);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111111114);
            Modifier modifierM3429z1112 = AbstractC1102d.m3429z(c2314t, null, 3);
            C2886a c2886a11111111111111117 = c2886a9;
            C22994r1 c22994r1M66759a1112 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            InterfaceC4339a interfaceC4339a1111111118 = interfaceC4339a3;
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111111115 = c28655q2.m87165m();
            Modifier modifierM118962N1111111115 = AbstractC37056f.m118962N(c28655q2, modifierM3429z1112);
            c28655q2.m87158i0();
            TextResource textResource1115 = textResource2;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a1112);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111111115);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111111115);
            if (z19) {
                enumC39181m = EnumC39181m.f168423w;
            }
            EnumC33185h1 enumC33185h1115 = enumC33185h3;
            long j11111118 = jM125430y;
            AbstractC28683x.m87247a(c28674u1113.mo86977a(enumC39181m), AbstractC37817c.m121344e(1134619547, c28655q2, new C17994d(stat, j11111118, c2886a11111111111111116, textResource1115, enumC33185h1115, c2886a11111111111111117)), c28655q2, 56);
            if (num == null) {
                c28655q2.m87150e0(109632338);
                z24 = false;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(109632339);
                int iIntValue1112 = num.intValue();
                AbstractC18489d0.m53380u(1, 8, c2314t, c28655q2);
                float f11111115 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue1112, c28655q2, 6), null, AbstractC1102d.m3415l(f11111115 * f11111115, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
                z24 = false;
                c28655q2.m87173q(false);
            }
            if (c33182g5 == null) {
                c28655q2.m87150e0(110152053);
                c28655q2.m87173q(z24);
                z26 = z17;
                z25 = true;
            } else {
                c28655q2.m87150e0(110152054);
                float f11111116 = 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 1 * f11111116, 0.0f, 0.0f, 0.0f, 14));
                Modifier modifierM3398t1112 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f11111116, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d1112 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111116 = c28655q2.m87165m();
                Modifier modifierM118962N1111111116 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1112);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d1112);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1111111116);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1111111116);
                z25 = true;
                boolean z21119 = z17;
                AbstractC17808z1.m51177e(c33182g5.getTrendText(), true, c33182g5.getTrendType(), z21119, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q2, ((i48 >> 15) & 7168) | 48, 0, 32752);
                z26 = z21119;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z25);
            long j11111119 = jM125382b1;
            C2886a c2886a11111111111111118 = c2886a8;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(statTitle, c28655q2, (i48 >> 21) & 14), null, j11111119, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11111111111111118, null, c28655q, (i47 << 6) & 896, (i47 << 9) & 3670016, 196602);
            c28655q2.m87173q(z25);
            modifier3 = modifier1111118;
            interfaceC4339a2 = interfaceC4339a1111111118;
            z15 = z26;
            c2886a4 = c2886a11111111111111116;
            j15 = j11111119;
            c2886a6 = c2886a11111111111111118;
            z16 = z19;
            j14 = j11111118;
            textResource3 = textResource1115;
            enumC33185h2 = enumC33185h1115;
            c2886a5 = c2886a11111111111111117;
            enumC33179f2 = enumC33179f4;
            c33182g2 = c33182g5;
        } else {
            c28655q2.m87138X();
            enumC33179f2 = enumC33179f1;
            enumC33185h2 = enumC33185h1;
            z15 = z4;
            c2886a4 = c2886a;
            c2886a5 = c2886a2;
            c2886a6 = c2886a3;
            z16 = z13;
            interfaceC4339a2 = interfaceC4339a;
            c28655q = c28655q2;
            textResource3 = textResource2;
            modifier3 = modifier2;
            c33182g2 = c33182g1;
            j14 = j7;
            j15 = j13;
        }
        num2 = num;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.o
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue1113 = ((Integer) obj2).intValue();
                    return AbstractC33207p.m105305i(modifier3, enumC33179f2, stat, num2, textResource3, enumC33185h2, c33182g2, statTitle, z15, j14, j15, c2886a4, c2886a5, c2886a6, z16, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue1113);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m105302f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m105303g(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m105304h(TextResource textResource, long j7, C2886a c2886a, TextResource textResource2, EnumC33185h1 enumC33185h1, C2886a c2886a2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3429z = AbstractC1102d.m3429z(C2314t.f9131w, null, 3);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3429z);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C39111m c39111m = AbstractC39083d.f168140a;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, 0), new WithAlignmentLineElement(c39111m), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q, 0, 0, 196600);
            if (textResource2 == null) {
                c28655q.m87150e0(1905197889);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1905197890);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, 0), m105306j(new WithAlignmentLineElement(c39111m), enumC33185h1), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a2, null, c28655q, 0, 0, 196600);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m105305i(Modifier modifier, EnumC33179f1 enumC33179f1, TextResource textResource, Integer num, TextResource textResource2, EnumC33185h1 enumC33185h1, C33182g1 c33182g1, TextResource textResource3, boolean z4, long j7, long j13, C2886a c2886a, C2886a c2886a2, C2886a c2886a3, boolean z13, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m105301e(modifier, enumC33179f1, textResource, num, textResource2, enumC33185h1, c33182g1, textResource3, z4, j7, j13, c2886a, c2886a2, c2886a3, z13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final Modifier m105306j(Modifier modifier, EnumC33185h1 enumC33185h1) {
        int i13 = a.f138460b[enumC33185h1.ordinal()];
        if (i13 == 1) {
            return modifier;
        }
        if (i13 == 2) {
            return AbstractC1099a.m3398t(modifier, ((float) 0.5d) * 8, 0.0f, 0.0f, 0.0f, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}

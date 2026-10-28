package i51;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b01.C2190k;
import b30.C2609r;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import e93.AbstractC12889b;
import gb1.AbstractC15676d;
import hy0.C17794v;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17924z0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p294l3.C23248d;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.C32096b;
import p490t0.AbstractC33253j;
import p510u0.C34370y0;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p635y2.AbstractC39083d;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p636y3.C39176h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.EnumC35690s;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: i51.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Li51/i;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lv41/s;", "Ll83/a0;", "onDynamicLottieLoadingChanged", "d", "(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "textOverlay", "", "j", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Z", "lottieLoadingState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18109f {

    /* JADX INFO: renamed from: i51.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70323a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f70324b;

        static {
            int[] iArr = new int[EnumC18110g.values().length];
            try {
                iArr[EnumC18110g.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18110g.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18110g.STREAK_LOTTIE_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC18110g.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC18110g.STREAK_LOTTIE_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f70323a = iArr;
            int[] iArr2 = new int[EnumC18119p.values().length];
            try {
                iArr2[EnumC18119p.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC18119p.STREAK_FROZEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC18119p.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f70324b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0271  */
    /* JADX WARN: Code duplicated, block: B:104:0x0279  */
    /* JADX WARN: Code duplicated, block: B:106:0x027d  */
    /* JADX WARN: Code duplicated, block: B:110:0x029b  */
    /* JADX WARN: Code duplicated, block: B:115:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:138:0x034c  */
    /* JADX WARN: Code duplicated, block: B:140:0x035e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0372  */
    /* JADX WARN: Code duplicated, block: B:144:0x0387  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:159:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:167:0x0408  */
    /* JADX WARN: Code duplicated, block: B:169:0x0416  */
    /* JADX WARN: Code duplicated, block: B:175:0x042f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0436  */
    /* JADX WARN: Code duplicated, block: B:180:0x0439  */
    /* JADX WARN: Code duplicated, block: B:181:0x0444  */
    /* JADX WARN: Code duplicated, block: B:183:0x0453  */
    /* JADX WARN: Code duplicated, block: B:185:0x0459  */
    /* JADX WARN: Code duplicated, block: B:188:0x046f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0472  */
    /* JADX WARN: Code duplicated, block: B:192:0x052d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0530  */
    /* JADX WARN: Code duplicated, block: B:196:0x0533  */
    /* JADX WARN: Code duplicated, block: B:198:0x0548  */
    /* JADX WARN: Code duplicated, block: B:200:0x0551  */
    /* JADX WARN: Code duplicated, block: B:201:0x0564  */
    /* JADX WARN: Code duplicated, block: B:204:0x0584  */
    /* JADX WARN: Code duplicated, block: B:207:0x058f  */
    /* JADX WARN: Code duplicated, block: B:209:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:210:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:213:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:217:0x0605  */
    /* JADX WARN: Code duplicated, block: B:220:0x0649  */
    /* JADX WARN: Code duplicated, block: B:221:0x0654  */
    /* JADX WARN: Code duplicated, block: B:223:0x0695  */
    /* JADX WARN: Code duplicated, block: B:225:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:234:0x0757  */
    /* JADX WARN: Code duplicated, block: B:236:0x075f  */
    /* JADX WARN: Code duplicated, block: B:239:0x076a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    /* JADX WARN: Code duplicated, block: B:77:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    /* JADX WARN: Code duplicated, block: B:81:0x0156  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x017b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:93:0x021e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0222  */
    /* JADX WARN: Code duplicated, block: B:96:0x024e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0253  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v55 */
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
    /* JADX INFO: renamed from: d */
    public static final void m51967d(C18112i viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int[] iArr;
        int i18;
        int i19;
        float f13;
        float f14;
        long jM134215getMediaSize0ZcVfYs;
        boolean z13;
        boolean zM87155h;
        EnumC35690s enumC35690s;
        Object obj;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87147d;
        Object obj2;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Modifier modifier5;
        C0209i c0209i4;
        AbstractC18111h mediaSource;
        boolean z14;
        C39077b1 c39077b1;
        boolean z15;
        C0209i c0209i5;
        C0209i c0209i6;
        C0209i c0209i7;
        InterfaceC4339a interfaceC4339a2;
        long j7;
        C0209i c0209i8;
        Modifier modifier6;
        ?? r10;
        int i24;
        C2314t c2314t2;
        Function1 function4;
        float f15;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z16;
        boolean z17;
        Object objM87133R;
        Object obj3;
        float f16;
        C28655q c28655q2;
        TextResource textOverlay;
        int i25;
        int i26;
        int i27;
        C2307m c2307m;
        C2886a n13;
        int i28;
        float f17;
        float f18;
        boolean z18;
        Function1 function5;
        int iHashCode2;
        InterfaceC4339a interfaceC4339a3;
        C0209i c0209i9;
        C0209i c0209i10;
        C0209i c0209i11;
        C0209i c0209i12;
        String strM21274h;
        TextResource textOverlaySuffix;
        String strM21274h2;
        String strM8299l;
        long j13;
        float fM36284n;
        float f19;
        C38072d c38072d;
        String str;
        int i29;
        boolean z19;
        long jM73366B;
        long j14;
        long jM113246h;
        Function1 function6;
        C23248d c23248d;
        boolean z24;
        int iM67308j;
        C28655q c28655q3;
        C2886a c2886aM8397c;
        int iHashCode3;
        C39111m c39111m;
        C28655q c28655q4;
        C28655q c28655q5;
        C28655q c28655q6;
        Float fValueOf = Float.valueOf(1.5f);
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(-992019062);
        if ((i13 & 6) == 0) {
            i15 = (c28655q7.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i34 = i14 & 2;
        if (i34 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q7.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q7.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q7.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        function2 = null;
                    }
                    EnumC18110g size = viewState.getSize();
                    iArr = a.f70323a;
                    i18 = iArr[size.ordinal()];
                    if (i18 != 1) {
                        i19 = 4;
                    } else if (i18 != 2 || i18 == 3) {
                        i19 = 5;
                    } else {
                        if (i18 != 4 && i18 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i19 = 10;
                    }
                    float f24 = 4;
                    f13 = i19 * f24;
                    f14 = f13 * 0.6f;
                    jM134215getMediaSize0ZcVfYs = viewState.getSize().m134215getMediaSize0ZcVfYs(15 * f24);
                    if (viewState.getSize() != EnumC18110g.LARGE || viewState.getSize() == EnumC18110g.STREAK_LOTTIE_LARGE) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87155h = c28655q7.m87155h(viewState.getMediaSource() instanceof AbstractC18111h.a);
                    Object objM87133R2 = c28655q7.m87133R();
                    Object obj4 = C28635l.f115821a;
                    obj = objM87133R2;
                    if (zM87155h || objM87133R2 == obj4) {
                        if (viewState.getMediaSource() instanceof AbstractC18111h.a) {
                            enumC35690s = EnumC35690s.LOADING;
                        } else {
                            enumC35690s = EnumC35690s.READY;
                        }
                        Object objM87272z = AbstractC28683x.m87272z(enumC35690s);
                        c28655q7.m87172p0(objM87272z);
                        obj = objM87272z;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj;
                    boolean reserveOverlaySpace = viewState.getReserveOverlaySpace();
                    zM87147d = c28655q7.m87147d(f14);
                    Object objM87133R3 = c28655q7.m87133R();
                    obj2 = objM87133R3;
                    if (zM87147d || objM87133R3 == obj4) {
                        Object c2190k = new C2190k(f14, 5);
                        c28655q7.m87172p0(c2190k);
                        obj2 = c2190k;
                    }
                    Modifier modifierM44099b = AbstractC15676d.m44099b(modifier4, reserveOverlaySpace, (Function1) obj2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9105H, false);
                    iHashCode = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifierM44099b);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(interfaceC4339a);
                    } else {
                        c28655q7.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q7.f115903S) {
                        modifier5 = modifier4;
                    } else {
                        modifier5 = modifier4;
                        if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N);
                        mediaSource = viewState.getMediaSource();
                        z14 = mediaSource instanceof AbstractC18111h.d;
                        c39077b1 = C39102j.f168200b;
                        if (z14) {
                            c28655q7.m87150e0(-999074405);
                            c0209i6 = c0209i4;
                            z15 = z13;
                            c0209i5 = c0209i;
                            interfaceC4339a2 = interfaceC4339a;
                            c0209i8 = c0209i2;
                            j7 = jM134215getMediaSize0ZcVfYs;
                            c2314t2 = c2314t;
                            c0209i7 = c0209i3;
                            r10 = 0;
                            modifier6 = modifier5;
                            AbstractC35684p.m113047h(AbstractC1102d.m3420q(jM134215getMediaSize0ZcVfYs, c2314t), ((AbstractC18111h.d) mediaSource).getWrapper(), false, 0.0f, 0, null, null, c39077b1, null, c28655q7, 12582912, 380);
                            C28655q c28655q8 = c28655q7;
                            c28655q8.m87173q(false);
                            f15 = f13;
                            interfaceC28601c2 = interfaceC28601c1;
                            function4 = function2;
                            c28655q2 = c28655q8;
                        } else {
                            z15 = z13;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i4;
                            c0209i7 = c0209i3;
                            interfaceC4339a2 = interfaceC4339a;
                            j7 = jM134215getMediaSize0ZcVfYs;
                            c0209i8 = c0209i2;
                            modifier6 = modifier5;
                            r10 = 0;
                            r10 = 0;
                            i24 = i15;
                            c2314t2 = c2314t;
                            function4 = function2;
                            if (mediaSource instanceof AbstractC18111h.c) {
                                c28655q7.m87150e0(-998814904);
                                Modifier modifierM3420q = AbstractC1102d.m3420q(j7, c2314t2);
                                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(((AbstractC18111h.c) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                                f16 = f13;
                                AbstractC29125c.m88522c(abstractC26165aM64500i, "", modifierM3420q, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                                c28655q7.m87173q(false);
                            } else if (mediaSource instanceof AbstractC18111h.b) {
                                c28655q7.m87150e0(-998507384);
                                Modifier modifierM3420q2 = AbstractC1102d.m3420q(j7, c2314t2);
                                AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(((AbstractC18111h.b) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                                f16 = f13;
                                AbstractC29125c.m88522c(abstractC26165aM64500i2, "", modifierM3420q2, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                                c28655q7.m87173q(false);
                            } else {
                                f15 = f13;
                                if (mediaSource instanceof AbstractC18111h.a) {
                                    throw AbstractC11895b.m32003v(1768884794, c28655q7, false);
                                }
                                c28655q7.m87150e0(1768915691);
                                C18122s model = ((AbstractC18111h.a) mediaSource).getModel();
                                Modifier modifierM3420q3 = AbstractC1102d.m3420q(j7, c2314t2);
                                interfaceC28601c2 = interfaceC28601c1;
                                boolean zM87153g = c28655q7.m87153g(interfaceC28601c2);
                                if ((i24 & 896) == 256) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                z17 = z16 | zM87153g;
                                objM87133R = c28655q7.m87133R();
                                if (z17 || objM87133R == obj4) {
                                    obj3 = objM87133R;
                                    Object c2609r = new C2609r(function4, interfaceC28601c2, 14);
                                    c28655q7.m87172p0(c2609r);
                                    obj3 = c2609r;
                                }
                                obj3 = objM87133R;
                                AbstractC18121r.m52029d(model, modifierM3420q3, (Function1) obj3, null, c28655q7, 0, 8);
                                c28655q7.m87173q(false);
                                c28655q2 = c28655q7;
                            }
                            interfaceC28601c2 = interfaceC28601c1;
                            f15 = f16;
                            c28655q2 = c28655q7;
                        }
                        textOverlay = viewState.getTextOverlay();
                        if (textOverlay != null || !AbstractC8693b.m21270d(textOverlay) || m51968e(interfaceC28601c2) != EnumC35690s.READY) {
                            textOverlay = null;
                        }
                        if (textOverlay == null) {
                            c28655q2.m87150e0(-997575184);
                            c28655q2.m87173q(r10);
                            function6 = function4;
                            z19 = true;
                            c28655q6 = c28655q2;
                        } else {
                            c28655q2.m87150e0(-997575183);
                            i25 = iArr[viewState.getSize().ordinal()];
                            if (i25 != 1) {
                                i26 = 2;
                                if (i25 != 2 || i25 == 3) {
                                    i27 = 5;
                                    c2307m = null;
                                    c28655q2.m87150e0(851643970);
                                    if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                        c28655q2.m87150e0(851645955);
                                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                                    } else {
                                        c28655q2.m87150e0(851646915);
                                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                                    }
                                    c28655q2.m87173q(r10);
                                    c28655q2.m87173q(r10);
                                } else {
                                    if (i25 != 4) {
                                        i27 = 5;
                                        if (i25 != 5) {
                                            throw AbstractC11895b.m32003v(851638503, c28655q2, r10);
                                        }
                                    } else {
                                        i27 = 5;
                                    }
                                    c28655q2.m87150e0(851649990);
                                    if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                        c28655q2.m87150e0(851652068);
                                        C38072d c38072d2 = C38072d.f163053a;
                                        c2307m = null;
                                        n13 = C2886a.m8397c(c38072d2.m121952e(c28655q2, 6).getN2(), C23285v0.m67364b(c38072d2.m121952e(c28655q2, 6).getN2().getStyle(), 0L, AbstractC35745c.m113246h(60), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                                    } else {
                                        c2307m = null;
                                        c28655q2.m87150e0(851655043);
                                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN1();
                                    }
                                    c28655q2.m87173q(r10);
                                    c28655q2.m87173q(r10);
                                }
                            } else {
                                i26 = 2;
                                i27 = 5;
                                c2307m = null;
                                c28655q2.m87150e0(851640899);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                                c28655q2.m87173q(r10);
                            }
                            i28 = iArr[viewState.getSize().ordinal()];
                            if (i28 != 1) {
                                f17 = (float) 0.25d;
                            } else if (i28 != i26 || i28 == 3) {
                                f17 = 1;
                            } else {
                                if (i28 != 4 && i28 != i27) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f17 = i26;
                            }
                            f18 = f17 * 8;
                            z18 = z15;
                            Modifier modifierM3392n = AbstractC1099a.m3392n(AbstractC1102d.m3428y(c2314t2, c2307m, z18, 1), 0.0f, f15, 1);
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, r10);
                            function5 = function4;
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3392n);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                interfaceC4339a3 = interfaceC4339a2;
                                c28655q2.m87163l(interfaceC4339a3);
                            } else {
                                interfaceC4339a3 = interfaceC4339a2;
                                c28655q2.m87178s0();
                            }
                            c0209i9 = c0209i5;
                            AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d2);
                            c0209i10 = c0209i8;
                            AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m2);
                            if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                c0209i11 = c0209i7;
                            } else {
                                c0209i11 = c0209i7;
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                            }
                            c0209i12 = c0209i6;
                            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N2);
                            strM21274h = AbstractC8693b.m21274h(textOverlay, c28655q2, r10);
                            textOverlaySuffix = viewState.getTextOverlaySuffix();
                            if (textOverlaySuffix != null || !AbstractC8693b.m21270d(textOverlaySuffix)) {
                                textOverlaySuffix = null;
                            }
                            if (textOverlaySuffix == null) {
                                c28655q2.m87150e0(1845056546);
                                c28655q2.m87173q(r10);
                                strM21274h2 = null;
                            } else {
                                c28655q2.m87150e0(1845056547);
                                strM21274h2 = AbstractC8693b.m21274h(textOverlaySuffix, c28655q2, r10);
                                c28655q2.m87173q(r10);
                            }
                            if (strM21274h2 != null || (strM8299l = AbstractC2875y.m8299l(strM21274h, strM21274h2)) == null) {
                                strM8299l = strM21274h;
                            }
                            j13 = j7;
                            fM36284n = AbstractC12889b.m36284n(strM8299l.length(), 2, 12) / 2.0f;
                            if (fM36284n < 1.5f) {
                                f19 = 1.5f;
                            } else {
                                f19 = fM36284n;
                            }
                            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1127a.m3488c(C1100b.f4583a.mo3401b(c2314t2), f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524286), AbstractC33253j.m105486b(30));
                            C17909s c17909s = AbstractC17911t.f69612b;
                            c38072d = C38072d.f163053a;
                            str = strM21274h2;
                            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM118994r, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.7f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.5f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.3f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.f69636m)), 0L, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                            i29 = a.f70324b[viewState.getTextOverlayStyle().ordinal()];
                            z19 = true;
                            if (i29 != 1) {
                                jM73366B = AbstractC25012a.m73366B(c28655q2, 2137771313, c38072d, c28655q2, 6);
                                c28655q2.m87173q(false);
                            } else if (i29 != 2) {
                                c28655q2.m87150e0(2137774322);
                                jM73366B = c38072d.m121949b(c28655q2, 6).getStrainZone2();
                                c28655q2.m87173q(false);
                            } else {
                                if (i29 == 3) {
                                    throw AbstractC11895b.m32003v(2137768005, c28655q2, false);
                                }
                                c28655q2.m87150e0(2137777101);
                                jM73366B = c38072d.m121949b(c28655q2, 6).getGreyL1();
                                c28655q2.m87173q(false);
                            }
                            j14 = jM73366B;
                            jM113246h = n13.getStyle().f92255a.f92192b;
                            if ((1095216660480L & jM113246h) == 0) {
                                jM113246h = AbstractC35745c.m113246h(16);
                            }
                            if (z18) {
                                c28655q2.m87150e0(1846764275);
                                c2886aM8397c = C2886a.m8397c(n13, C23285v0.m67364b(n13.getStyle(), 0L, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.7f), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(interfaceC4339a3);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a);
                                AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m3);
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N3);
                                c39111m = AbstractC39083d.f168140a;
                                C28655q c28655q9 = c28655q2;
                                C2886a c2886a = n13;
                                function6 = function5;
                                AbstractC30795n.m94707h(strM21274h, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886a, fValueOf, c28655q9, 0, 12586416, 51192);
                                c28655q4 = c28655q9;
                                if (str == null) {
                                    c28655q4.m87150e0(1806258676);
                                    z24 = false;
                                    c28655q4.m87173q(false);
                                    c28655q5 = c28655q4;
                                } else {
                                    c28655q4.m87150e0(1806258677);
                                    AbstractC30795n.m94707h(str, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886aM8397c, fValueOf, c28655q4, 0, 12586416, 51192);
                                    C28655q c28655q10 = c28655q4;
                                    z24 = false;
                                    c28655q10.m87173q(false);
                                    c28655q5 = c28655q10;
                                }
                                c28655q5.m87173q(true);
                                c28655q5.m87173q(z24);
                                c28655q3 = c28655q5;
                            } else {
                                C2886a c2886a2 = n13;
                                function6 = function5;
                                c28655q2.m87150e0(1848232590);
                                c23248d = new C23248d();
                                c23248d.m67300b(strM21274h);
                                if (str != null) {
                                    iM67308j = c23248d.m67308j(new C23267m0(0L, AbstractC35745c.m113248j(0.7f, 8589934592L), (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65533));
                                    try {
                                        c23248d.m67300b(str);
                                        c23248d.m67304f(iM67308j);
                                    } catch (Throwable th3) {
                                        c23248d.m67304f(iM67308j);
                                        throw th3;
                                    }
                                }
                                C28655q c28655q11 = c28655q2;
                                AbstractC30060g.m92105a(c23248d.m67309k(), AbstractC1102d.m3425v(AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2), 0.0f, C39176h.m124787c(j13), 1), C23285v0.m67364b(c2886a2.getStyle(), j14, 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 1, false, 1, 0, null, null, C34370y0.m108670a(4, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.5f), jM113246h), c28655q11, 1794048, 904);
                                C28655q c28655q12 = c28655q11;
                                z24 = false;
                                c28655q12.m87173q(false);
                                c28655q3 = c28655q12;
                            }
                            c28655q3.m87173q(true);
                            c28655q3.m87173q(z24);
                            c28655q6 = c28655q3;
                        }
                        c28655q6.m87173q(z19);
                        function3 = function6;
                        modifier3 = modifier6;
                        c28655q = c28655q6;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N);
                    mediaSource = viewState.getMediaSource();
                    z14 = mediaSource instanceof AbstractC18111h.d;
                    c39077b1 = C39102j.f168200b;
                    if (z14) {
                        c28655q7.m87150e0(-999074405);
                        c0209i6 = c0209i4;
                        z15 = z13;
                        c0209i5 = c0209i;
                        interfaceC4339a2 = interfaceC4339a;
                        c0209i8 = c0209i2;
                        j7 = jM134215getMediaSize0ZcVfYs;
                        c2314t2 = c2314t;
                        c0209i7 = c0209i3;
                        r10 = 0;
                        modifier6 = modifier5;
                        AbstractC35684p.m113047h(AbstractC1102d.m3420q(jM134215getMediaSize0ZcVfYs, c2314t), ((AbstractC18111h.d) mediaSource).getWrapper(), false, 0.0f, 0, null, null, c39077b1, null, c28655q7, 12582912, 380);
                        C28655q c28655q13 = c28655q7;
                        c28655q13.m87173q(false);
                        f15 = f13;
                        interfaceC28601c2 = interfaceC28601c1;
                        function4 = function2;
                        c28655q2 = c28655q13;
                    } else {
                        z15 = z13;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i4;
                        c0209i7 = c0209i3;
                        interfaceC4339a2 = interfaceC4339a;
                        j7 = jM134215getMediaSize0ZcVfYs;
                        c0209i8 = c0209i2;
                        modifier6 = modifier5;
                        r10 = 0;
                        r10 = 0;
                        i24 = i15;
                        c2314t2 = c2314t;
                        function4 = function2;
                        if (mediaSource instanceof AbstractC18111h.c) {
                            c28655q7.m87150e0(-998814904);
                            Modifier modifierM3420q4 = AbstractC1102d.m3420q(j7, c2314t2);
                            AbstractC26165a abstractC26165aM64500i3 = AbstractC22404p.m64500i(((AbstractC18111h.c) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                            f16 = f13;
                            AbstractC29125c.m88522c(abstractC26165aM64500i3, "", modifierM3420q4, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                            c28655q7.m87173q(false);
                        } else if (mediaSource instanceof AbstractC18111h.b) {
                            c28655q7.m87150e0(-998507384);
                            Modifier modifierM3420q5 = AbstractC1102d.m3420q(j7, c2314t2);
                            AbstractC26165a abstractC26165aM64500i4 = AbstractC22404p.m64500i(((AbstractC18111h.b) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                            f16 = f13;
                            AbstractC29125c.m88522c(abstractC26165aM64500i4, "", modifierM3420q5, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                            c28655q7.m87173q(false);
                        } else {
                            f15 = f13;
                            if (mediaSource instanceof AbstractC18111h.a) {
                                throw AbstractC11895b.m32003v(1768884794, c28655q7, false);
                            }
                            c28655q7.m87150e0(1768915691);
                            C18122s model2 = ((AbstractC18111h.a) mediaSource).getModel();
                            Modifier modifierM3420q6 = AbstractC1102d.m3420q(j7, c2314t2);
                            interfaceC28601c2 = interfaceC28601c1;
                            boolean zM87153g2 = c28655q7.m87153g(interfaceC28601c2);
                            if ((i24 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | zM87153g2;
                            objM87133R = c28655q7.m87133R();
                            if (z17) {
                                obj3 = objM87133R;
                                Object c2609r2 = new C2609r(function4, interfaceC28601c2, 14);
                                c28655q7.m87172p0(c2609r2);
                                obj3 = c2609r2;
                            } else {
                                obj3 = objM87133R;
                                Object c2609r3 = new C2609r(function4, interfaceC28601c2, 14);
                                c28655q7.m87172p0(c2609r3);
                                obj3 = c2609r3;
                            }
                            obj3 = objM87133R;
                            AbstractC18121r.m52029d(model2, modifierM3420q6, (Function1) obj3, null, c28655q7, 0, 8);
                            c28655q7.m87173q(false);
                            c28655q2 = c28655q7;
                        }
                        interfaceC28601c2 = interfaceC28601c1;
                        f15 = f16;
                        c28655q2 = c28655q7;
                    }
                    textOverlay = viewState.getTextOverlay();
                    if (textOverlay != null) {
                        textOverlay = null;
                    } else {
                        textOverlay = null;
                    }
                    if (textOverlay == null) {
                        c28655q2.m87150e0(-997575184);
                        c28655q2.m87173q(r10);
                        function6 = function4;
                        z19 = true;
                        c28655q6 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-997575183);
                        i25 = iArr[viewState.getSize().ordinal()];
                        if (i25 != 1) {
                            i26 = 2;
                            if (i25 != 2) {
                                i27 = 5;
                                c2307m = null;
                                c28655q2.m87150e0(851643970);
                                if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                    c28655q2.m87150e0(851645955);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                                } else {
                                    c28655q2.m87150e0(851646915);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                                }
                                c28655q2.m87173q(r10);
                                c28655q2.m87173q(r10);
                            } else {
                                i27 = 5;
                                c2307m = null;
                                c28655q2.m87150e0(851643970);
                                if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                    c28655q2.m87150e0(851645955);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                                } else {
                                    c28655q2.m87150e0(851646915);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                                }
                                c28655q2.m87173q(r10);
                                c28655q2.m87173q(r10);
                            }
                        } else {
                            i26 = 2;
                            i27 = 5;
                            c2307m = null;
                            c28655q2.m87150e0(851640899);
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                            c28655q2.m87173q(r10);
                        }
                        i28 = iArr[viewState.getSize().ordinal()];
                        if (i28 != 1) {
                            f17 = (float) 0.25d;
                        } else if (i28 != i26) {
                            f17 = 1;
                        } else {
                            f17 = 1;
                        }
                        f18 = f17 * 8;
                        z18 = z15;
                        Modifier modifierM3392n2 = AbstractC1099a.m3392n(AbstractC1102d.m3428y(c2314t2, c2307m, z18, 1), 0.0f, f15, 1);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, r10);
                        function5 = function4;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3392n2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            interfaceC4339a3 = interfaceC4339a2;
                            c28655q2.m87163l(interfaceC4339a3);
                        } else {
                            interfaceC4339a3 = interfaceC4339a2;
                            c28655q2.m87178s0();
                        }
                        c0209i9 = c0209i5;
                        AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d3);
                        c0209i10 = c0209i8;
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m4);
                        if (c28655q2.f115903S) {
                            c0209i11 = c0209i7;
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                        } else {
                            c0209i11 = c0209i7;
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                        }
                        c0209i12 = c0209i6;
                        AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N4);
                        strM21274h = AbstractC8693b.m21274h(textOverlay, c28655q2, r10);
                        textOverlaySuffix = viewState.getTextOverlaySuffix();
                        if (textOverlaySuffix != null) {
                            textOverlaySuffix = null;
                        } else {
                            textOverlaySuffix = null;
                        }
                        if (textOverlaySuffix == null) {
                            c28655q2.m87150e0(1845056546);
                            c28655q2.m87173q(r10);
                            strM21274h2 = null;
                        } else {
                            c28655q2.m87150e0(1845056547);
                            strM21274h2 = AbstractC8693b.m21274h(textOverlaySuffix, c28655q2, r10);
                            c28655q2.m87173q(r10);
                        }
                        if (strM21274h2 != null) {
                            strM8299l = strM21274h;
                        } else {
                            strM8299l = strM21274h;
                        }
                        j13 = j7;
                        fM36284n = AbstractC12889b.m36284n(strM8299l.length(), 2, 12) / 2.0f;
                        if (fM36284n < 1.5f) {
                            f19 = 1.5f;
                        } else {
                            f19 = fM36284n;
                        }
                        Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1127a.m3488c(C1100b.f4583a.mo3401b(c2314t2), f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524286), AbstractC33253j.m105486b(30));
                        C17909s c17909s2 = AbstractC17911t.f69612b;
                        c38072d = C38072d.f163053a;
                        str = strM21274h2;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM118994r2, C17909s.m51489g(c17909s2, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.7f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.5f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.3f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.f69636m)), 0L, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                        i29 = a.f70324b[viewState.getTextOverlayStyle().ordinal()];
                        z19 = true;
                        if (i29 != 1) {
                            jM73366B = AbstractC25012a.m73366B(c28655q2, 2137771313, c38072d, c28655q2, 6);
                            c28655q2.m87173q(false);
                        } else if (i29 != 2) {
                            c28655q2.m87150e0(2137774322);
                            jM73366B = c38072d.m121949b(c28655q2, 6).getStrainZone2();
                            c28655q2.m87173q(false);
                        } else {
                            if (i29 == 3) {
                                throw AbstractC11895b.m32003v(2137768005, c28655q2, false);
                            }
                            c28655q2.m87150e0(2137777101);
                            jM73366B = c38072d.m121949b(c28655q2, 6).getGreyL1();
                            c28655q2.m87173q(false);
                        }
                        j14 = jM73366B;
                        jM113246h = n13.getStyle().f92255a.f92192b;
                        if ((1095216660480L & jM113246h) == 0) {
                            jM113246h = AbstractC35745c.m113246h(16);
                        }
                        if (z18) {
                            c28655q2.m87150e0(1846764275);
                            c2886aM8397c = C2886a.m8397c(n13, C23285v0.m67364b(n13.getStyle(), 0L, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.7f), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a3);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m5);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N5);
                            c39111m = AbstractC39083d.f168140a;
                            C28655q c28655q14 = c28655q2;
                            C2886a c2886a3 = n13;
                            function6 = function5;
                            AbstractC30795n.m94707h(strM21274h, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886a3, fValueOf, c28655q14, 0, 12586416, 51192);
                            c28655q4 = c28655q14;
                            if (str == null) {
                                c28655q4.m87150e0(1806258676);
                                z24 = false;
                                c28655q4.m87173q(false);
                                c28655q5 = c28655q4;
                            } else {
                                c28655q4.m87150e0(1806258677);
                                AbstractC30795n.m94707h(str, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886aM8397c, fValueOf, c28655q4, 0, 12586416, 51192);
                                C28655q c28655q15 = c28655q4;
                                z24 = false;
                                c28655q15.m87173q(false);
                                c28655q5 = c28655q15;
                            }
                            c28655q5.m87173q(true);
                            c28655q5.m87173q(z24);
                            c28655q3 = c28655q5;
                        } else {
                            C2886a c2886a4 = n13;
                            function6 = function5;
                            c28655q2.m87150e0(1848232590);
                            c23248d = new C23248d();
                            c23248d.m67300b(strM21274h);
                            if (str != null) {
                                iM67308j = c23248d.m67308j(new C23267m0(0L, AbstractC35745c.m113248j(0.7f, 8589934592L), (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65533));
                                c23248d.m67300b(str);
                                c23248d.m67304f(iM67308j);
                            }
                            C28655q c28655q16 = c28655q2;
                            AbstractC30060g.m92105a(c23248d.m67309k(), AbstractC1102d.m3425v(AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2), 0.0f, C39176h.m124787c(j13), 1), C23285v0.m67364b(c2886a4.getStyle(), j14, 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 1, false, 1, 0, null, null, C34370y0.m108670a(4, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.5f), jM113246h), c28655q16, 1794048, 904);
                            C28655q c28655q17 = c28655q16;
                            z24 = false;
                            c28655q17.m87173q(false);
                            c28655q3 = c28655q17;
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(z24);
                        c28655q6 = c28655q3;
                    }
                    c28655q6.m87173q(z19);
                    function3 = function6;
                    modifier3 = modifier6;
                    c28655q = c28655q6;
                } else {
                    c28655q7.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                    c28655q = c28655q7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C17794v(i13, i14, 5, (Object) viewState, (Object) modifier3, (InterfaceC23459e) function3);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i34 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    function2 = null;
                }
                EnumC18110g size2 = viewState.getSize();
                iArr = a.f70323a;
                i18 = iArr[size2.ordinal()];
                if (i18 != 1) {
                    i19 = 4;
                } else if (i18 != 2) {
                    i19 = 5;
                } else {
                    i19 = 5;
                }
                float f25 = 4;
                f13 = i19 * f25;
                f14 = f13 * 0.6f;
                jM134215getMediaSize0ZcVfYs = viewState.getSize().m134215getMediaSize0ZcVfYs(15 * f25);
                if (viewState.getSize() != EnumC18110g.LARGE) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                zM87155h = c28655q7.m87155h(viewState.getMediaSource() instanceof AbstractC18111h.a);
                Object objM87133R4 = c28655q7.m87133R();
                Object obj5 = C28635l.f115821a;
                obj = objM87133R4;
                if (zM87155h) {
                    if (viewState.getMediaSource() instanceof AbstractC18111h.a) {
                        enumC35690s = EnumC35690s.LOADING;
                    } else {
                        enumC35690s = EnumC35690s.READY;
                    }
                    Object objM87272z2 = AbstractC28683x.m87272z(enumC35690s);
                    c28655q7.m87172p0(objM87272z2);
                    obj = objM87272z2;
                } else {
                    if (viewState.getMediaSource() instanceof AbstractC18111h.a) {
                        enumC35690s = EnumC35690s.LOADING;
                    } else {
                        enumC35690s = EnumC35690s.READY;
                    }
                    Object objM87272z3 = AbstractC28683x.m87272z(enumC35690s);
                    c28655q7.m87172p0(objM87272z3);
                    obj = objM87272z3;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj;
                boolean reserveOverlaySpace2 = viewState.getReserveOverlaySpace();
                zM87147d = c28655q7.m87147d(f14);
                Object objM87133R5 = c28655q7.m87133R();
                obj2 = objM87133R5;
                if (zM87147d) {
                    Object c2190k2 = new C2190k(f14, 5);
                    c28655q7.m87172p0(c2190k2);
                    obj2 = c2190k2;
                } else {
                    Object c2190k3 = new C2190k(f14, 5);
                    c28655q7.m87172p0(c2190k3);
                    obj2 = c2190k3;
                }
                Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifier4, reserveOverlaySpace2, (Function1) obj2);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q7.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q7, modifierM44099b2);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d4);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m6);
                c0209i3 = C0217k.f732j;
                if (c28655q7.f115903S) {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N6);
                    mediaSource = viewState.getMediaSource();
                    z14 = mediaSource instanceof AbstractC18111h.d;
                    c39077b1 = C39102j.f168200b;
                    if (z14) {
                        c28655q7.m87150e0(-999074405);
                        c0209i6 = c0209i4;
                        z15 = z13;
                        c0209i5 = c0209i;
                        interfaceC4339a2 = interfaceC4339a;
                        c0209i8 = c0209i2;
                        j7 = jM134215getMediaSize0ZcVfYs;
                        c2314t2 = c2314t;
                        c0209i7 = c0209i3;
                        r10 = 0;
                        modifier6 = modifier5;
                        AbstractC35684p.m113047h(AbstractC1102d.m3420q(jM134215getMediaSize0ZcVfYs, c2314t), ((AbstractC18111h.d) mediaSource).getWrapper(), false, 0.0f, 0, null, null, c39077b1, null, c28655q7, 12582912, 380);
                        C28655q c28655q18 = c28655q7;
                        c28655q18.m87173q(false);
                        f15 = f13;
                        interfaceC28601c2 = interfaceC28601c1;
                        function4 = function2;
                        c28655q2 = c28655q18;
                    } else {
                        z15 = z13;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i4;
                        c0209i7 = c0209i3;
                        interfaceC4339a2 = interfaceC4339a;
                        j7 = jM134215getMediaSize0ZcVfYs;
                        c0209i8 = c0209i2;
                        modifier6 = modifier5;
                        r10 = 0;
                        r10 = 0;
                        i24 = i15;
                        c2314t2 = c2314t;
                        function4 = function2;
                        if (mediaSource instanceof AbstractC18111h.c) {
                            c28655q7.m87150e0(-998814904);
                            Modifier modifierM3420q7 = AbstractC1102d.m3420q(j7, c2314t2);
                            AbstractC26165a abstractC26165aM64500i5 = AbstractC22404p.m64500i(((AbstractC18111h.c) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                            f16 = f13;
                            AbstractC29125c.m88522c(abstractC26165aM64500i5, "", modifierM3420q7, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                            c28655q7.m87173q(false);
                        } else if (mediaSource instanceof AbstractC18111h.b) {
                            c28655q7.m87150e0(-998507384);
                            Modifier modifierM3420q8 = AbstractC1102d.m3420q(j7, c2314t2);
                            AbstractC26165a abstractC26165aM64500i6 = AbstractC22404p.m64500i(((AbstractC18111h.b) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                            f16 = f13;
                            AbstractC29125c.m88522c(abstractC26165aM64500i6, "", modifierM3420q8, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                            c28655q7.m87173q(false);
                        } else {
                            f15 = f13;
                            if (mediaSource instanceof AbstractC18111h.a) {
                                throw AbstractC11895b.m32003v(1768884794, c28655q7, false);
                            }
                            c28655q7.m87150e0(1768915691);
                            C18122s model3 = ((AbstractC18111h.a) mediaSource).getModel();
                            Modifier modifierM3420q9 = AbstractC1102d.m3420q(j7, c2314t2);
                            interfaceC28601c2 = interfaceC28601c1;
                            boolean zM87153g3 = c28655q7.m87153g(interfaceC28601c2);
                            if ((i24 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | zM87153g3;
                            objM87133R = c28655q7.m87133R();
                            if (z17) {
                                obj3 = objM87133R;
                                Object c2609r4 = new C2609r(function4, interfaceC28601c2, 14);
                                c28655q7.m87172p0(c2609r4);
                                obj3 = c2609r4;
                            } else {
                                obj3 = objM87133R;
                                Object c2609r5 = new C2609r(function4, interfaceC28601c2, 14);
                                c28655q7.m87172p0(c2609r5);
                                obj3 = c2609r5;
                            }
                            obj3 = objM87133R;
                            AbstractC18121r.m52029d(model3, modifierM3420q9, (Function1) obj3, null, c28655q7, 0, 8);
                            c28655q7.m87173q(false);
                            c28655q2 = c28655q7;
                        }
                        interfaceC28601c2 = interfaceC28601c1;
                        f15 = f16;
                        c28655q2 = c28655q7;
                    }
                    textOverlay = viewState.getTextOverlay();
                    if (textOverlay != null) {
                        textOverlay = null;
                    } else {
                        textOverlay = null;
                    }
                    if (textOverlay == null) {
                        c28655q2.m87150e0(-997575184);
                        c28655q2.m87173q(r10);
                        function6 = function4;
                        z19 = true;
                        c28655q6 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-997575183);
                        i25 = iArr[viewState.getSize().ordinal()];
                        if (i25 != 1) {
                            i26 = 2;
                            if (i25 != 2) {
                                i27 = 5;
                                c2307m = null;
                                c28655q2.m87150e0(851643970);
                                if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                    c28655q2.m87150e0(851645955);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                                } else {
                                    c28655q2.m87150e0(851646915);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                                }
                                c28655q2.m87173q(r10);
                                c28655q2.m87173q(r10);
                            } else {
                                i27 = 5;
                                c2307m = null;
                                c28655q2.m87150e0(851643970);
                                if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                    c28655q2.m87150e0(851645955);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                                } else {
                                    c28655q2.m87150e0(851646915);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                                }
                                c28655q2.m87173q(r10);
                                c28655q2.m87173q(r10);
                            }
                        } else {
                            i26 = 2;
                            i27 = 5;
                            c2307m = null;
                            c28655q2.m87150e0(851640899);
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                            c28655q2.m87173q(r10);
                        }
                        i28 = iArr[viewState.getSize().ordinal()];
                        if (i28 != 1) {
                            f17 = (float) 0.25d;
                        } else if (i28 != i26) {
                            f17 = 1;
                        } else {
                            f17 = 1;
                        }
                        f18 = f17 * 8;
                        z18 = z15;
                        Modifier modifierM3392n3 = AbstractC1099a.m3392n(AbstractC1102d.m3428y(c2314t2, c2307m, z18, 1), 0.0f, f15, 1);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9102E, r10);
                        function5 = function4;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3392n3);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            interfaceC4339a3 = interfaceC4339a2;
                            c28655q2.m87163l(interfaceC4339a3);
                        } else {
                            interfaceC4339a3 = interfaceC4339a2;
                            c28655q2.m87178s0();
                        }
                        c0209i9 = c0209i5;
                        AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d5);
                        c0209i10 = c0209i8;
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m7);
                        if (c28655q2.f115903S) {
                            c0209i11 = c0209i7;
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                        } else {
                            c0209i11 = c0209i7;
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                        }
                        c0209i12 = c0209i6;
                        AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N7);
                        strM21274h = AbstractC8693b.m21274h(textOverlay, c28655q2, r10);
                        textOverlaySuffix = viewState.getTextOverlaySuffix();
                        if (textOverlaySuffix != null) {
                            textOverlaySuffix = null;
                        } else {
                            textOverlaySuffix = null;
                        }
                        if (textOverlaySuffix == null) {
                            c28655q2.m87150e0(1845056546);
                            c28655q2.m87173q(r10);
                            strM21274h2 = null;
                        } else {
                            c28655q2.m87150e0(1845056547);
                            strM21274h2 = AbstractC8693b.m21274h(textOverlaySuffix, c28655q2, r10);
                            c28655q2.m87173q(r10);
                        }
                        if (strM21274h2 != null) {
                            strM8299l = strM21274h;
                        } else {
                            strM8299l = strM21274h;
                        }
                        j13 = j7;
                        fM36284n = AbstractC12889b.m36284n(strM8299l.length(), 2, 12) / 2.0f;
                        if (fM36284n < 1.5f) {
                            f19 = 1.5f;
                        } else {
                            f19 = fM36284n;
                        }
                        Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1127a.m3488c(C1100b.f4583a.mo3401b(c2314t2), f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524286), AbstractC33253j.m105486b(30));
                        C17909s c17909s3 = AbstractC17911t.f69612b;
                        c38072d = C38072d.f163053a;
                        str = strM21274h2;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM118994r3, C17909s.m51489g(c17909s3, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.7f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.5f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.3f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.f69636m)), 0L, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                        i29 = a.f70324b[viewState.getTextOverlayStyle().ordinal()];
                        z19 = true;
                        if (i29 != 1) {
                            jM73366B = AbstractC25012a.m73366B(c28655q2, 2137771313, c38072d, c28655q2, 6);
                            c28655q2.m87173q(false);
                        } else if (i29 != 2) {
                            c28655q2.m87150e0(2137774322);
                            jM73366B = c38072d.m121949b(c28655q2, 6).getStrainZone2();
                            c28655q2.m87173q(false);
                        } else {
                            if (i29 == 3) {
                                throw AbstractC11895b.m32003v(2137768005, c28655q2, false);
                            }
                            c28655q2.m87150e0(2137777101);
                            jM73366B = c38072d.m121949b(c28655q2, 6).getGreyL1();
                            c28655q2.m87173q(false);
                        }
                        j14 = jM73366B;
                        jM113246h = n13.getStyle().f92255a.f92192b;
                        if ((1095216660480L & jM113246h) == 0) {
                            jM113246h = AbstractC35745c.m113246h(16);
                        }
                        if (z18) {
                            c28655q2.m87150e0(1846764275);
                            c2886aM8397c = C2886a.m8397c(n13, C23285v0.m67364b(n13.getStyle(), 0L, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.7f), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                            Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a3);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a3);
                            AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m8);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N8);
                            c39111m = AbstractC39083d.f168140a;
                            C28655q c28655q19 = c28655q2;
                            C2886a c2886a5 = n13;
                            function6 = function5;
                            AbstractC30795n.m94707h(strM21274h, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886a5, fValueOf, c28655q19, 0, 12586416, 51192);
                            c28655q4 = c28655q19;
                            if (str == null) {
                                c28655q4.m87150e0(1806258676);
                                z24 = false;
                                c28655q4.m87173q(false);
                                c28655q5 = c28655q4;
                            } else {
                                c28655q4.m87150e0(1806258677);
                                AbstractC30795n.m94707h(str, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886aM8397c, fValueOf, c28655q4, 0, 12586416, 51192);
                                C28655q c28655q110 = c28655q4;
                                z24 = false;
                                c28655q110.m87173q(false);
                                c28655q5 = c28655q110;
                            }
                            c28655q5.m87173q(true);
                            c28655q5.m87173q(z24);
                            c28655q3 = c28655q5;
                        } else {
                            C2886a c2886a6 = n13;
                            function6 = function5;
                            c28655q2.m87150e0(1848232590);
                            c23248d = new C23248d();
                            c23248d.m67300b(strM21274h);
                            if (str != null) {
                                iM67308j = c23248d.m67308j(new C23267m0(0L, AbstractC35745c.m113248j(0.7f, 8589934592L), (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65533));
                                c23248d.m67300b(str);
                                c23248d.m67304f(iM67308j);
                            }
                            C28655q c28655q111 = c28655q2;
                            AbstractC30060g.m92105a(c23248d.m67309k(), AbstractC1102d.m3425v(AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2), 0.0f, C39176h.m124787c(j13), 1), C23285v0.m67364b(c2886a6.getStyle(), j14, 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 1, false, 1, 0, null, null, C34370y0.m108670a(4, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.5f), jM113246h), c28655q111, 1794048, 904);
                            C28655q c28655q112 = c28655q111;
                            z24 = false;
                            c28655q112.m87173q(false);
                            c28655q3 = c28655q112;
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(z24);
                        c28655q6 = c28655q3;
                    }
                    c28655q6.m87173q(z19);
                    function3 = function6;
                    modifier3 = modifier6;
                    c28655q = c28655q6;
                } else {
                    modifier5 = modifier4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N6);
                mediaSource = viewState.getMediaSource();
                z14 = mediaSource instanceof AbstractC18111h.d;
                c39077b1 = C39102j.f168200b;
                if (z14) {
                    c28655q7.m87150e0(-999074405);
                    c0209i6 = c0209i4;
                    z15 = z13;
                    c0209i5 = c0209i;
                    interfaceC4339a2 = interfaceC4339a;
                    c0209i8 = c0209i2;
                    j7 = jM134215getMediaSize0ZcVfYs;
                    c2314t2 = c2314t;
                    c0209i7 = c0209i3;
                    r10 = 0;
                    modifier6 = modifier5;
                    AbstractC35684p.m113047h(AbstractC1102d.m3420q(jM134215getMediaSize0ZcVfYs, c2314t), ((AbstractC18111h.d) mediaSource).getWrapper(), false, 0.0f, 0, null, null, c39077b1, null, c28655q7, 12582912, 380);
                    C28655q c28655q113 = c28655q7;
                    c28655q113.m87173q(false);
                    f15 = f13;
                    interfaceC28601c2 = interfaceC28601c1;
                    function4 = function2;
                    c28655q2 = c28655q113;
                } else {
                    z15 = z13;
                    c0209i5 = c0209i;
                    c0209i6 = c0209i4;
                    c0209i7 = c0209i3;
                    interfaceC4339a2 = interfaceC4339a;
                    j7 = jM134215getMediaSize0ZcVfYs;
                    c0209i8 = c0209i2;
                    modifier6 = modifier5;
                    r10 = 0;
                    r10 = 0;
                    i24 = i15;
                    c2314t2 = c2314t;
                    function4 = function2;
                    if (mediaSource instanceof AbstractC18111h.c) {
                        c28655q7.m87150e0(-998814904);
                        Modifier modifierM3420q10 = AbstractC1102d.m3420q(j7, c2314t2);
                        AbstractC26165a abstractC26165aM64500i7 = AbstractC22404p.m64500i(((AbstractC18111h.c) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                        f16 = f13;
                        AbstractC29125c.m88522c(abstractC26165aM64500i7, "", modifierM3420q10, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                        c28655q7.m87173q(false);
                    } else if (mediaSource instanceof AbstractC18111h.b) {
                        c28655q7.m87150e0(-998507384);
                        Modifier modifierM3420q11 = AbstractC1102d.m3420q(j7, c2314t2);
                        AbstractC26165a abstractC26165aM64500i8 = AbstractC22404p.m64500i(((AbstractC18111h.b) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                        f16 = f13;
                        AbstractC29125c.m88522c(abstractC26165aM64500i8, "", modifierM3420q11, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                        c28655q7.m87173q(false);
                    } else {
                        f15 = f13;
                        if (mediaSource instanceof AbstractC18111h.a) {
                            throw AbstractC11895b.m32003v(1768884794, c28655q7, false);
                        }
                        c28655q7.m87150e0(1768915691);
                        C18122s model4 = ((AbstractC18111h.a) mediaSource).getModel();
                        Modifier modifierM3420q12 = AbstractC1102d.m3420q(j7, c2314t2);
                        interfaceC28601c2 = interfaceC28601c1;
                        boolean zM87153g4 = c28655q7.m87153g(interfaceC28601c2);
                        if ((i24 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zM87153g4;
                        objM87133R = c28655q7.m87133R();
                        if (z17) {
                            obj3 = objM87133R;
                            Object c2609r6 = new C2609r(function4, interfaceC28601c2, 14);
                            c28655q7.m87172p0(c2609r6);
                            obj3 = c2609r6;
                        } else {
                            obj3 = objM87133R;
                            Object c2609r7 = new C2609r(function4, interfaceC28601c2, 14);
                            c28655q7.m87172p0(c2609r7);
                            obj3 = c2609r7;
                        }
                        obj3 = objM87133R;
                        AbstractC18121r.m52029d(model4, modifierM3420q12, (Function1) obj3, null, c28655q7, 0, 8);
                        c28655q7.m87173q(false);
                        c28655q2 = c28655q7;
                    }
                    interfaceC28601c2 = interfaceC28601c1;
                    f15 = f16;
                    c28655q2 = c28655q7;
                }
                textOverlay = viewState.getTextOverlay();
                if (textOverlay != null) {
                    textOverlay = null;
                } else {
                    textOverlay = null;
                }
                if (textOverlay == null) {
                    c28655q2.m87150e0(-997575184);
                    c28655q2.m87173q(r10);
                    function6 = function4;
                    z19 = true;
                    c28655q6 = c28655q2;
                } else {
                    c28655q2.m87150e0(-997575183);
                    i25 = iArr[viewState.getSize().ordinal()];
                    if (i25 != 1) {
                        i26 = 2;
                        if (i25 != 2) {
                            i27 = 5;
                            c2307m = null;
                            c28655q2.m87150e0(851643970);
                            if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                c28655q2.m87150e0(851645955);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                            } else {
                                c28655q2.m87150e0(851646915);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                            }
                            c28655q2.m87173q(r10);
                            c28655q2.m87173q(r10);
                        } else {
                            i27 = 5;
                            c2307m = null;
                            c28655q2.m87150e0(851643970);
                            if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                c28655q2.m87150e0(851645955);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                            } else {
                                c28655q2.m87150e0(851646915);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                            }
                            c28655q2.m87173q(r10);
                            c28655q2.m87173q(r10);
                        }
                    } else {
                        i26 = 2;
                        i27 = 5;
                        c2307m = null;
                        c28655q2.m87150e0(851640899);
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                        c28655q2.m87173q(r10);
                    }
                    i28 = iArr[viewState.getSize().ordinal()];
                    if (i28 != 1) {
                        f17 = (float) 0.25d;
                    } else if (i28 != i26) {
                        f17 = 1;
                    } else {
                        f17 = 1;
                    }
                    f18 = f17 * 8;
                    z18 = z15;
                    Modifier modifierM3392n4 = AbstractC1099a.m3392n(AbstractC1102d.m3428y(c2314t2, c2307m, z18, 1), 0.0f, f15, 1);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9102E, r10);
                    function5 = function4;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3392n4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q2.m87163l(interfaceC4339a3);
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q2.m87178s0();
                    }
                    c0209i9 = c0209i5;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d6);
                    c0209i10 = c0209i8;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m9);
                    if (c28655q2.f115903S) {
                        c0209i11 = c0209i7;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                    } else {
                        c0209i11 = c0209i7;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                    }
                    c0209i12 = c0209i6;
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N9);
                    strM21274h = AbstractC8693b.m21274h(textOverlay, c28655q2, r10);
                    textOverlaySuffix = viewState.getTextOverlaySuffix();
                    if (textOverlaySuffix != null) {
                        textOverlaySuffix = null;
                    } else {
                        textOverlaySuffix = null;
                    }
                    if (textOverlaySuffix == null) {
                        c28655q2.m87150e0(1845056546);
                        c28655q2.m87173q(r10);
                        strM21274h2 = null;
                    } else {
                        c28655q2.m87150e0(1845056547);
                        strM21274h2 = AbstractC8693b.m21274h(textOverlaySuffix, c28655q2, r10);
                        c28655q2.m87173q(r10);
                    }
                    if (strM21274h2 != null) {
                        strM8299l = strM21274h;
                    } else {
                        strM8299l = strM21274h;
                    }
                    j13 = j7;
                    fM36284n = AbstractC12889b.m36284n(strM8299l.length(), 2, 12) / 2.0f;
                    if (fM36284n < 1.5f) {
                        f19 = 1.5f;
                    } else {
                        f19 = fM36284n;
                    }
                    Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1127a.m3488c(C1100b.f4583a.mo3401b(c2314t2), f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524286), AbstractC33253j.m105486b(30));
                    C17909s c17909s4 = AbstractC17911t.f69612b;
                    c38072d = C38072d.f163053a;
                    str = strM21274h2;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM118994r4, C17909s.m51489g(c17909s4, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.7f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.5f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.3f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.f69636m)), 0L, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                    i29 = a.f70324b[viewState.getTextOverlayStyle().ordinal()];
                    z19 = true;
                    if (i29 != 1) {
                        jM73366B = AbstractC25012a.m73366B(c28655q2, 2137771313, c38072d, c28655q2, 6);
                        c28655q2.m87173q(false);
                    } else if (i29 != 2) {
                        c28655q2.m87150e0(2137774322);
                        jM73366B = c38072d.m121949b(c28655q2, 6).getStrainZone2();
                        c28655q2.m87173q(false);
                    } else {
                        if (i29 == 3) {
                            throw AbstractC11895b.m32003v(2137768005, c28655q2, false);
                        }
                        c28655q2.m87150e0(2137777101);
                        jM73366B = c38072d.m121949b(c28655q2, 6).getGreyL1();
                        c28655q2.m87173q(false);
                    }
                    j14 = jM73366B;
                    jM113246h = n13.getStyle().f92255a.f92192b;
                    if ((1095216660480L & jM113246h) == 0) {
                        jM113246h = AbstractC35745c.m113246h(16);
                    }
                    if (z18) {
                        c28655q2.m87150e0(1846764275);
                        c2886aM8397c = C2886a.m8397c(n13, C23285v0.m67364b(n13.getStyle(), 0L, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.7f), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                        Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a3);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m10);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N10);
                        c39111m = AbstractC39083d.f168140a;
                        C28655q c28655q114 = c28655q2;
                        C2886a c2886a7 = n13;
                        function6 = function5;
                        AbstractC30795n.m94707h(strM21274h, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886a7, fValueOf, c28655q114, 0, 12586416, 51192);
                        c28655q4 = c28655q114;
                        if (str == null) {
                            c28655q4.m87150e0(1806258676);
                            z24 = false;
                            c28655q4.m87173q(false);
                            c28655q5 = c28655q4;
                        } else {
                            c28655q4.m87150e0(1806258677);
                            AbstractC30795n.m94707h(str, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886aM8397c, fValueOf, c28655q4, 0, 12586416, 51192);
                            C28655q c28655q115 = c28655q4;
                            z24 = false;
                            c28655q115.m87173q(false);
                            c28655q5 = c28655q115;
                        }
                        c28655q5.m87173q(true);
                        c28655q5.m87173q(z24);
                        c28655q3 = c28655q5;
                    } else {
                        C2886a c2886a8 = n13;
                        function6 = function5;
                        c28655q2.m87150e0(1848232590);
                        c23248d = new C23248d();
                        c23248d.m67300b(strM21274h);
                        if (str != null) {
                            iM67308j = c23248d.m67308j(new C23267m0(0L, AbstractC35745c.m113248j(0.7f, 8589934592L), (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65533));
                            c23248d.m67300b(str);
                            c23248d.m67304f(iM67308j);
                        }
                        C28655q c28655q116 = c28655q2;
                        AbstractC30060g.m92105a(c23248d.m67309k(), AbstractC1102d.m3425v(AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2), 0.0f, C39176h.m124787c(j13), 1), C23285v0.m67364b(c2886a8.getStyle(), j14, 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 1, false, 1, 0, null, null, C34370y0.m108670a(4, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.5f), jM113246h), c28655q116, 1794048, 904);
                        C28655q c28655q117 = c28655q116;
                        z24 = false;
                        c28655q117.m87173q(false);
                        c28655q3 = c28655q117;
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(z24);
                    c28655q6 = c28655q3;
                }
                c28655q6.m87173q(z19);
                function3 = function6;
                modifier3 = modifier6;
                c28655q = c28655q6;
            } else {
                c28655q7.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 5, (Object) viewState, (Object) modifier3, (InterfaceC23459e) function3);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q7.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i34 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    function2 = null;
                }
                EnumC18110g size3 = viewState.getSize();
                iArr = a.f70323a;
                i18 = iArr[size3.ordinal()];
                if (i18 != 1) {
                    i19 = 4;
                } else if (i18 != 2) {
                    i19 = 5;
                } else {
                    i19 = 5;
                }
                float f26 = 4;
                f13 = i19 * f26;
                f14 = f13 * 0.6f;
                jM134215getMediaSize0ZcVfYs = viewState.getSize().m134215getMediaSize0ZcVfYs(15 * f26);
                if (viewState.getSize() != EnumC18110g.LARGE) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                zM87155h = c28655q7.m87155h(viewState.getMediaSource() instanceof AbstractC18111h.a);
                Object objM87133R6 = c28655q7.m87133R();
                Object obj6 = C28635l.f115821a;
                obj = objM87133R6;
                if (zM87155h) {
                    if (viewState.getMediaSource() instanceof AbstractC18111h.a) {
                        enumC35690s = EnumC35690s.LOADING;
                    } else {
                        enumC35690s = EnumC35690s.READY;
                    }
                    Object objM87272z4 = AbstractC28683x.m87272z(enumC35690s);
                    c28655q7.m87172p0(objM87272z4);
                    obj = objM87272z4;
                } else {
                    if (viewState.getMediaSource() instanceof AbstractC18111h.a) {
                        enumC35690s = EnumC35690s.LOADING;
                    } else {
                        enumC35690s = EnumC35690s.READY;
                    }
                    Object objM87272z5 = AbstractC28683x.m87272z(enumC35690s);
                    c28655q7.m87172p0(objM87272z5);
                    obj = objM87272z5;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj;
                boolean reserveOverlaySpace3 = viewState.getReserveOverlaySpace();
                zM87147d = c28655q7.m87147d(f14);
                Object objM87133R7 = c28655q7.m87133R();
                obj2 = objM87133R7;
                if (zM87147d) {
                    Object c2190k4 = new C2190k(f14, 5);
                    c28655q7.m87172p0(c2190k4);
                    obj2 = c2190k4;
                } else {
                    Object c2190k5 = new C2190k(f14, 5);
                    c28655q7.m87172p0(c2190k5);
                    obj2 = c2190k5;
                }
                Modifier modifierM44099b3 = AbstractC15676d.m44099b(modifier4, reserveOverlaySpace3, (Function1) obj2);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q7.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q7, modifierM44099b3);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d7);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m11);
                c0209i3 = C0217k.f732j;
                if (c28655q7.f115903S) {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N11);
                    mediaSource = viewState.getMediaSource();
                    z14 = mediaSource instanceof AbstractC18111h.d;
                    c39077b1 = C39102j.f168200b;
                    if (z14) {
                        c28655q7.m87150e0(-999074405);
                        c0209i6 = c0209i4;
                        z15 = z13;
                        c0209i5 = c0209i;
                        interfaceC4339a2 = interfaceC4339a;
                        c0209i8 = c0209i2;
                        j7 = jM134215getMediaSize0ZcVfYs;
                        c2314t2 = c2314t;
                        c0209i7 = c0209i3;
                        r10 = 0;
                        modifier6 = modifier5;
                        AbstractC35684p.m113047h(AbstractC1102d.m3420q(jM134215getMediaSize0ZcVfYs, c2314t), ((AbstractC18111h.d) mediaSource).getWrapper(), false, 0.0f, 0, null, null, c39077b1, null, c28655q7, 12582912, 380);
                        C28655q c28655q118 = c28655q7;
                        c28655q118.m87173q(false);
                        f15 = f13;
                        interfaceC28601c2 = interfaceC28601c1;
                        function4 = function2;
                        c28655q2 = c28655q118;
                    } else {
                        z15 = z13;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i4;
                        c0209i7 = c0209i3;
                        interfaceC4339a2 = interfaceC4339a;
                        j7 = jM134215getMediaSize0ZcVfYs;
                        c0209i8 = c0209i2;
                        modifier6 = modifier5;
                        r10 = 0;
                        r10 = 0;
                        i24 = i15;
                        c2314t2 = c2314t;
                        function4 = function2;
                        if (mediaSource instanceof AbstractC18111h.c) {
                            c28655q7.m87150e0(-998814904);
                            Modifier modifierM3420q13 = AbstractC1102d.m3420q(j7, c2314t2);
                            AbstractC26165a abstractC26165aM64500i9 = AbstractC22404p.m64500i(((AbstractC18111h.c) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                            f16 = f13;
                            AbstractC29125c.m88522c(abstractC26165aM64500i9, "", modifierM3420q13, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                            c28655q7.m87173q(false);
                        } else if (mediaSource instanceof AbstractC18111h.b) {
                            c28655q7.m87150e0(-998507384);
                            Modifier modifierM3420q14 = AbstractC1102d.m3420q(j7, c2314t2);
                            AbstractC26165a abstractC26165aM64500i10 = AbstractC22404p.m64500i(((AbstractC18111h.b) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                            f16 = f13;
                            AbstractC29125c.m88522c(abstractC26165aM64500i10, "", modifierM3420q14, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                            c28655q7.m87173q(false);
                        } else {
                            f15 = f13;
                            if (mediaSource instanceof AbstractC18111h.a) {
                                throw AbstractC11895b.m32003v(1768884794, c28655q7, false);
                            }
                            c28655q7.m87150e0(1768915691);
                            C18122s model5 = ((AbstractC18111h.a) mediaSource).getModel();
                            Modifier modifierM3420q15 = AbstractC1102d.m3420q(j7, c2314t2);
                            interfaceC28601c2 = interfaceC28601c1;
                            boolean zM87153g5 = c28655q7.m87153g(interfaceC28601c2);
                            if ((i24 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | zM87153g5;
                            objM87133R = c28655q7.m87133R();
                            if (z17) {
                                obj3 = objM87133R;
                                Object c2609r8 = new C2609r(function4, interfaceC28601c2, 14);
                                c28655q7.m87172p0(c2609r8);
                                obj3 = c2609r8;
                            } else {
                                obj3 = objM87133R;
                                Object c2609r9 = new C2609r(function4, interfaceC28601c2, 14);
                                c28655q7.m87172p0(c2609r9);
                                obj3 = c2609r9;
                            }
                            obj3 = objM87133R;
                            AbstractC18121r.m52029d(model5, modifierM3420q15, (Function1) obj3, null, c28655q7, 0, 8);
                            c28655q7.m87173q(false);
                            c28655q2 = c28655q7;
                        }
                        interfaceC28601c2 = interfaceC28601c1;
                        f15 = f16;
                        c28655q2 = c28655q7;
                    }
                    textOverlay = viewState.getTextOverlay();
                    if (textOverlay != null) {
                        textOverlay = null;
                    } else {
                        textOverlay = null;
                    }
                    if (textOverlay == null) {
                        c28655q2.m87150e0(-997575184);
                        c28655q2.m87173q(r10);
                        function6 = function4;
                        z19 = true;
                        c28655q6 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-997575183);
                        i25 = iArr[viewState.getSize().ordinal()];
                        if (i25 != 1) {
                            i26 = 2;
                            if (i25 != 2) {
                                i27 = 5;
                                c2307m = null;
                                c28655q2.m87150e0(851643970);
                                if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                    c28655q2.m87150e0(851645955);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                                } else {
                                    c28655q2.m87150e0(851646915);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                                }
                                c28655q2.m87173q(r10);
                                c28655q2.m87173q(r10);
                            } else {
                                i27 = 5;
                                c2307m = null;
                                c28655q2.m87150e0(851643970);
                                if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                    c28655q2.m87150e0(851645955);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                                } else {
                                    c28655q2.m87150e0(851646915);
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                                }
                                c28655q2.m87173q(r10);
                                c28655q2.m87173q(r10);
                            }
                        } else {
                            i26 = 2;
                            i27 = 5;
                            c2307m = null;
                            c28655q2.m87150e0(851640899);
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                            c28655q2.m87173q(r10);
                        }
                        i28 = iArr[viewState.getSize().ordinal()];
                        if (i28 != 1) {
                            f17 = (float) 0.25d;
                        } else if (i28 != i26) {
                            f17 = 1;
                        } else {
                            f17 = 1;
                        }
                        f18 = f17 * 8;
                        z18 = z15;
                        Modifier modifierM3392n5 = AbstractC1099a.m3392n(AbstractC1102d.m3428y(c2314t2, c2307m, z18, 1), 0.0f, f15, 1);
                        InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9102E, r10);
                        function5 = function4;
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3392n5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            interfaceC4339a3 = interfaceC4339a2;
                            c28655q2.m87163l(interfaceC4339a3);
                        } else {
                            interfaceC4339a3 = interfaceC4339a2;
                            c28655q2.m87178s0();
                        }
                        c0209i9 = c0209i5;
                        AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d8);
                        c0209i10 = c0209i8;
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m12);
                        if (c28655q2.f115903S) {
                            c0209i11 = c0209i7;
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                        } else {
                            c0209i11 = c0209i7;
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                        }
                        c0209i12 = c0209i6;
                        AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N12);
                        strM21274h = AbstractC8693b.m21274h(textOverlay, c28655q2, r10);
                        textOverlaySuffix = viewState.getTextOverlaySuffix();
                        if (textOverlaySuffix != null) {
                            textOverlaySuffix = null;
                        } else {
                            textOverlaySuffix = null;
                        }
                        if (textOverlaySuffix == null) {
                            c28655q2.m87150e0(1845056546);
                            c28655q2.m87173q(r10);
                            strM21274h2 = null;
                        } else {
                            c28655q2.m87150e0(1845056547);
                            strM21274h2 = AbstractC8693b.m21274h(textOverlaySuffix, c28655q2, r10);
                            c28655q2.m87173q(r10);
                        }
                        if (strM21274h2 != null) {
                            strM8299l = strM21274h;
                        } else {
                            strM8299l = strM21274h;
                        }
                        j13 = j7;
                        fM36284n = AbstractC12889b.m36284n(strM8299l.length(), 2, 12) / 2.0f;
                        if (fM36284n < 1.5f) {
                            f19 = 1.5f;
                        } else {
                            f19 = fM36284n;
                        }
                        Modifier modifierM118994r5 = AbstractC37056f.m118994r(AbstractC1127a.m3488c(C1100b.f4583a.mo3401b(c2314t2), f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524286), AbstractC33253j.m105486b(30));
                        C17909s c17909s5 = AbstractC17911t.f69612b;
                        c38072d = C38072d.f163053a;
                        str = strM21274h2;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM118994r5, C17909s.m51489g(c17909s5, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.7f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.5f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.3f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.f69636m)), 0L, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                        i29 = a.f70324b[viewState.getTextOverlayStyle().ordinal()];
                        z19 = true;
                        if (i29 != 1) {
                            jM73366B = AbstractC25012a.m73366B(c28655q2, 2137771313, c38072d, c28655q2, 6);
                            c28655q2.m87173q(false);
                        } else if (i29 != 2) {
                            c28655q2.m87150e0(2137774322);
                            jM73366B = c38072d.m121949b(c28655q2, 6).getStrainZone2();
                            c28655q2.m87173q(false);
                        } else {
                            if (i29 == 3) {
                                throw AbstractC11895b.m32003v(2137768005, c28655q2, false);
                            }
                            c28655q2.m87150e0(2137777101);
                            jM73366B = c38072d.m121949b(c28655q2, 6).getGreyL1();
                            c28655q2.m87173q(false);
                        }
                        j14 = jM73366B;
                        jM113246h = n13.getStyle().f92255a.f92192b;
                        if ((1095216660480L & jM113246h) == 0) {
                            jM113246h = AbstractC35745c.m113246h(16);
                        }
                        if (z18) {
                            c28655q2.m87150e0(1846764275);
                            c2886aM8397c = C2886a.m8397c(n13, C23285v0.m67364b(n13.getStyle(), 0L, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.7f), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                            Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3396r5);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a3);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a5);
                            AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m13);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N13);
                            c39111m = AbstractC39083d.f168140a;
                            C28655q c28655q119 = c28655q2;
                            C2886a c2886a9 = n13;
                            function6 = function5;
                            AbstractC30795n.m94707h(strM21274h, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886a9, fValueOf, c28655q119, 0, 12586416, 51192);
                            c28655q4 = c28655q119;
                            if (str == null) {
                                c28655q4.m87150e0(1806258676);
                                z24 = false;
                                c28655q4.m87173q(false);
                                c28655q5 = c28655q4;
                            } else {
                                c28655q4.m87150e0(1806258677);
                                AbstractC30795n.m94707h(str, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886aM8397c, fValueOf, c28655q4, 0, 12586416, 51192);
                                C28655q c28655q1110 = c28655q4;
                                z24 = false;
                                c28655q1110.m87173q(false);
                                c28655q5 = c28655q1110;
                            }
                            c28655q5.m87173q(true);
                            c28655q5.m87173q(z24);
                            c28655q3 = c28655q5;
                        } else {
                            C2886a c2886a10 = n13;
                            function6 = function5;
                            c28655q2.m87150e0(1848232590);
                            c23248d = new C23248d();
                            c23248d.m67300b(strM21274h);
                            if (str != null) {
                                iM67308j = c23248d.m67308j(new C23267m0(0L, AbstractC35745c.m113248j(0.7f, 8589934592L), (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65533));
                                c23248d.m67300b(str);
                                c23248d.m67304f(iM67308j);
                            }
                            C28655q c28655q1111 = c28655q2;
                            AbstractC30060g.m92105a(c23248d.m67309k(), AbstractC1102d.m3425v(AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2), 0.0f, C39176h.m124787c(j13), 1), C23285v0.m67364b(c2886a10.getStyle(), j14, 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 1, false, 1, 0, null, null, C34370y0.m108670a(4, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.5f), jM113246h), c28655q1111, 1794048, 904);
                            C28655q c28655q1112 = c28655q1111;
                            z24 = false;
                            c28655q1112.m87173q(false);
                            c28655q3 = c28655q1112;
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(z24);
                        c28655q6 = c28655q3;
                    }
                    c28655q6.m87173q(z19);
                    function3 = function6;
                    modifier3 = modifier6;
                    c28655q = c28655q6;
                } else {
                    modifier5 = modifier4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N11);
                mediaSource = viewState.getMediaSource();
                z14 = mediaSource instanceof AbstractC18111h.d;
                c39077b1 = C39102j.f168200b;
                if (z14) {
                    c28655q7.m87150e0(-999074405);
                    c0209i6 = c0209i4;
                    z15 = z13;
                    c0209i5 = c0209i;
                    interfaceC4339a2 = interfaceC4339a;
                    c0209i8 = c0209i2;
                    j7 = jM134215getMediaSize0ZcVfYs;
                    c2314t2 = c2314t;
                    c0209i7 = c0209i3;
                    r10 = 0;
                    modifier6 = modifier5;
                    AbstractC35684p.m113047h(AbstractC1102d.m3420q(jM134215getMediaSize0ZcVfYs, c2314t), ((AbstractC18111h.d) mediaSource).getWrapper(), false, 0.0f, 0, null, null, c39077b1, null, c28655q7, 12582912, 380);
                    C28655q c28655q1113 = c28655q7;
                    c28655q1113.m87173q(false);
                    f15 = f13;
                    interfaceC28601c2 = interfaceC28601c1;
                    function4 = function2;
                    c28655q2 = c28655q1113;
                } else {
                    z15 = z13;
                    c0209i5 = c0209i;
                    c0209i6 = c0209i4;
                    c0209i7 = c0209i3;
                    interfaceC4339a2 = interfaceC4339a;
                    j7 = jM134215getMediaSize0ZcVfYs;
                    c0209i8 = c0209i2;
                    modifier6 = modifier5;
                    r10 = 0;
                    r10 = 0;
                    i24 = i15;
                    c2314t2 = c2314t;
                    function4 = function2;
                    if (mediaSource instanceof AbstractC18111h.c) {
                        c28655q7.m87150e0(-998814904);
                        Modifier modifierM3420q16 = AbstractC1102d.m3420q(j7, c2314t2);
                        AbstractC26165a abstractC26165aM64500i11 = AbstractC22404p.m64500i(((AbstractC18111h.c) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                        f16 = f13;
                        AbstractC29125c.m88522c(abstractC26165aM64500i11, "", modifierM3420q16, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                        c28655q7.m87173q(false);
                    } else if (mediaSource instanceof AbstractC18111h.b) {
                        c28655q7.m87150e0(-998507384);
                        Modifier modifierM3420q17 = AbstractC1102d.m3420q(j7, c2314t2);
                        AbstractC26165a abstractC26165aM64500i12 = AbstractC22404p.m64500i(((AbstractC18111h.b) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                        f16 = f13;
                        AbstractC29125c.m88522c(abstractC26165aM64500i12, "", modifierM3420q17, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                        c28655q7.m87173q(false);
                    } else {
                        f15 = f13;
                        if (mediaSource instanceof AbstractC18111h.a) {
                            throw AbstractC11895b.m32003v(1768884794, c28655q7, false);
                        }
                        c28655q7.m87150e0(1768915691);
                        C18122s model6 = ((AbstractC18111h.a) mediaSource).getModel();
                        Modifier modifierM3420q18 = AbstractC1102d.m3420q(j7, c2314t2);
                        interfaceC28601c2 = interfaceC28601c1;
                        boolean zM87153g6 = c28655q7.m87153g(interfaceC28601c2);
                        if ((i24 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zM87153g6;
                        objM87133R = c28655q7.m87133R();
                        if (z17) {
                            obj3 = objM87133R;
                            Object c2609r10 = new C2609r(function4, interfaceC28601c2, 14);
                            c28655q7.m87172p0(c2609r10);
                            obj3 = c2609r10;
                        } else {
                            obj3 = objM87133R;
                            Object c2609r11 = new C2609r(function4, interfaceC28601c2, 14);
                            c28655q7.m87172p0(c2609r11);
                            obj3 = c2609r11;
                        }
                        obj3 = objM87133R;
                        AbstractC18121r.m52029d(model6, modifierM3420q18, (Function1) obj3, null, c28655q7, 0, 8);
                        c28655q7.m87173q(false);
                        c28655q2 = c28655q7;
                    }
                    interfaceC28601c2 = interfaceC28601c1;
                    f15 = f16;
                    c28655q2 = c28655q7;
                }
                textOverlay = viewState.getTextOverlay();
                if (textOverlay != null) {
                    textOverlay = null;
                } else {
                    textOverlay = null;
                }
                if (textOverlay == null) {
                    c28655q2.m87150e0(-997575184);
                    c28655q2.m87173q(r10);
                    function6 = function4;
                    z19 = true;
                    c28655q6 = c28655q2;
                } else {
                    c28655q2.m87150e0(-997575183);
                    i25 = iArr[viewState.getSize().ordinal()];
                    if (i25 != 1) {
                        i26 = 2;
                        if (i25 != 2) {
                            i27 = 5;
                            c2307m = null;
                            c28655q2.m87150e0(851643970);
                            if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                c28655q2.m87150e0(851645955);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                            } else {
                                c28655q2.m87150e0(851646915);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                            }
                            c28655q2.m87173q(r10);
                            c28655q2.m87173q(r10);
                        } else {
                            i27 = 5;
                            c2307m = null;
                            c28655q2.m87150e0(851643970);
                            if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                c28655q2.m87150e0(851645955);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                            } else {
                                c28655q2.m87150e0(851646915);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                            }
                            c28655q2.m87173q(r10);
                            c28655q2.m87173q(r10);
                        }
                    } else {
                        i26 = 2;
                        i27 = 5;
                        c2307m = null;
                        c28655q2.m87150e0(851640899);
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                        c28655q2.m87173q(r10);
                    }
                    i28 = iArr[viewState.getSize().ordinal()];
                    if (i28 != 1) {
                        f17 = (float) 0.25d;
                    } else if (i28 != i26) {
                        f17 = 1;
                    } else {
                        f17 = 1;
                    }
                    f18 = f17 * 8;
                    z18 = z15;
                    Modifier modifierM3392n6 = AbstractC1099a.m3392n(AbstractC1102d.m3428y(c2314t2, c2307m, z18, 1), 0.0f, f15, 1);
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9102E, r10);
                    function5 = function4;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3392n6);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q2.m87163l(interfaceC4339a3);
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q2.m87178s0();
                    }
                    c0209i9 = c0209i5;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d9);
                    c0209i10 = c0209i8;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m14);
                    if (c28655q2.f115903S) {
                        c0209i11 = c0209i7;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                    } else {
                        c0209i11 = c0209i7;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                    }
                    c0209i12 = c0209i6;
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N14);
                    strM21274h = AbstractC8693b.m21274h(textOverlay, c28655q2, r10);
                    textOverlaySuffix = viewState.getTextOverlaySuffix();
                    if (textOverlaySuffix != null) {
                        textOverlaySuffix = null;
                    } else {
                        textOverlaySuffix = null;
                    }
                    if (textOverlaySuffix == null) {
                        c28655q2.m87150e0(1845056546);
                        c28655q2.m87173q(r10);
                        strM21274h2 = null;
                    } else {
                        c28655q2.m87150e0(1845056547);
                        strM21274h2 = AbstractC8693b.m21274h(textOverlaySuffix, c28655q2, r10);
                        c28655q2.m87173q(r10);
                    }
                    if (strM21274h2 != null) {
                        strM8299l = strM21274h;
                    } else {
                        strM8299l = strM21274h;
                    }
                    j13 = j7;
                    fM36284n = AbstractC12889b.m36284n(strM8299l.length(), 2, 12) / 2.0f;
                    if (fM36284n < 1.5f) {
                        f19 = 1.5f;
                    } else {
                        f19 = fM36284n;
                    }
                    Modifier modifierM118994r6 = AbstractC37056f.m118994r(AbstractC1127a.m3488c(C1100b.f4583a.mo3401b(c2314t2), f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524286), AbstractC33253j.m105486b(30));
                    C17909s c17909s6 = AbstractC17911t.f69612b;
                    c38072d = C38072d.f163053a;
                    str = strM21274h2;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM118994r6, C17909s.m51489g(c17909s6, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.7f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.5f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.3f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.f69636m)), 0L, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                    i29 = a.f70324b[viewState.getTextOverlayStyle().ordinal()];
                    z19 = true;
                    if (i29 != 1) {
                        jM73366B = AbstractC25012a.m73366B(c28655q2, 2137771313, c38072d, c28655q2, 6);
                        c28655q2.m87173q(false);
                    } else if (i29 != 2) {
                        c28655q2.m87150e0(2137774322);
                        jM73366B = c38072d.m121949b(c28655q2, 6).getStrainZone2();
                        c28655q2.m87173q(false);
                    } else {
                        if (i29 == 3) {
                            throw AbstractC11895b.m32003v(2137768005, c28655q2, false);
                        }
                        c28655q2.m87150e0(2137777101);
                        jM73366B = c38072d.m121949b(c28655q2, 6).getGreyL1();
                        c28655q2.m87173q(false);
                    }
                    j14 = jM73366B;
                    jM113246h = n13.getStyle().f92255a.f92192b;
                    if ((1095216660480L & jM113246h) == 0) {
                        jM113246h = AbstractC35745c.m113246h(16);
                    }
                    if (z18) {
                        c28655q2.m87150e0(1846764275);
                        c2886aM8397c = C2886a.m8397c(n13, C23285v0.m67364b(n13.getStyle(), 0L, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.7f), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                        Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3396r6);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a3);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m15);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N15);
                        c39111m = AbstractC39083d.f168140a;
                        C28655q c28655q1114 = c28655q2;
                        C2886a c2886a11 = n13;
                        function6 = function5;
                        AbstractC30795n.m94707h(strM21274h, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886a11, fValueOf, c28655q1114, 0, 12586416, 51192);
                        c28655q4 = c28655q1114;
                        if (str == null) {
                            c28655q4.m87150e0(1806258676);
                            z24 = false;
                            c28655q4.m87173q(false);
                            c28655q5 = c28655q4;
                        } else {
                            c28655q4.m87150e0(1806258677);
                            AbstractC30795n.m94707h(str, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886aM8397c, fValueOf, c28655q4, 0, 12586416, 51192);
                            C28655q c28655q1115 = c28655q4;
                            z24 = false;
                            c28655q1115.m87173q(false);
                            c28655q5 = c28655q1115;
                        }
                        c28655q5.m87173q(true);
                        c28655q5.m87173q(z24);
                        c28655q3 = c28655q5;
                    } else {
                        C2886a c2886a12 = n13;
                        function6 = function5;
                        c28655q2.m87150e0(1848232590);
                        c23248d = new C23248d();
                        c23248d.m67300b(strM21274h);
                        if (str != null) {
                            iM67308j = c23248d.m67308j(new C23267m0(0L, AbstractC35745c.m113248j(0.7f, 8589934592L), (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65533));
                            c23248d.m67300b(str);
                            c23248d.m67304f(iM67308j);
                        }
                        C28655q c28655q1116 = c28655q2;
                        AbstractC30060g.m92105a(c23248d.m67309k(), AbstractC1102d.m3425v(AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2), 0.0f, C39176h.m124787c(j13), 1), C23285v0.m67364b(c2886a12.getStyle(), j14, 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 1, false, 1, 0, null, null, C34370y0.m108670a(4, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.5f), jM113246h), c28655q1116, 1794048, 904);
                        C28655q c28655q1117 = c28655q1116;
                        z24 = false;
                        c28655q1117.m87173q(false);
                        c28655q3 = c28655q1117;
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(z24);
                    c28655q6 = c28655q3;
                }
                c28655q6.m87173q(z19);
                function3 = function6;
                modifier3 = modifier6;
                c28655q = c28655q6;
            } else {
                c28655q7.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 5, (Object) viewState, (Object) modifier3, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q7.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i34 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                function2 = null;
            }
            EnumC18110g size4 = viewState.getSize();
            iArr = a.f70323a;
            i18 = iArr[size4.ordinal()];
            if (i18 != 1) {
                i19 = 4;
            } else if (i18 != 2) {
                i19 = 5;
            } else {
                i19 = 5;
            }
            float f27 = 4;
            f13 = i19 * f27;
            f14 = f13 * 0.6f;
            jM134215getMediaSize0ZcVfYs = viewState.getSize().m134215getMediaSize0ZcVfYs(15 * f27);
            if (viewState.getSize() != EnumC18110g.LARGE) {
                z13 = true;
            } else {
                z13 = true;
            }
            zM87155h = c28655q7.m87155h(viewState.getMediaSource() instanceof AbstractC18111h.a);
            Object objM87133R8 = c28655q7.m87133R();
            Object obj7 = C28635l.f115821a;
            obj = objM87133R8;
            if (zM87155h) {
                if (viewState.getMediaSource() instanceof AbstractC18111h.a) {
                    enumC35690s = EnumC35690s.LOADING;
                } else {
                    enumC35690s = EnumC35690s.READY;
                }
                Object objM87272z6 = AbstractC28683x.m87272z(enumC35690s);
                c28655q7.m87172p0(objM87272z6);
                obj = objM87272z6;
            } else {
                if (viewState.getMediaSource() instanceof AbstractC18111h.a) {
                    enumC35690s = EnumC35690s.LOADING;
                } else {
                    enumC35690s = EnumC35690s.READY;
                }
                Object objM87272z7 = AbstractC28683x.m87272z(enumC35690s);
                c28655q7.m87172p0(objM87272z7);
                obj = objM87272z7;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj;
            boolean reserveOverlaySpace4 = viewState.getReserveOverlaySpace();
            zM87147d = c28655q7.m87147d(f14);
            Object objM87133R9 = c28655q7.m87133R();
            obj2 = objM87133R9;
            if (zM87147d) {
                Object c2190k6 = new C2190k(f14, 5);
                c28655q7.m87172p0(c2190k6);
                obj2 = c2190k6;
            } else {
                Object c2190k7 = new C2190k(f14, 5);
                c28655q7.m87172p0(c2190k7);
                obj2 = c2190k7;
            }
            Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifier4, reserveOverlaySpace4, (Function1) obj2);
            InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9105H, false);
            iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q7.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q7, modifierM44099b4);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a);
            } else {
                c28655q7.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q7, c0209i, interfaceC39127r0M66763d10);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m16);
            c0209i3 = C0217k.f732j;
            if (c28655q7.f115903S) {
                modifier5 = modifier4;
                if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N16);
                mediaSource = viewState.getMediaSource();
                z14 = mediaSource instanceof AbstractC18111h.d;
                c39077b1 = C39102j.f168200b;
                if (z14) {
                    c28655q7.m87150e0(-999074405);
                    c0209i6 = c0209i4;
                    z15 = z13;
                    c0209i5 = c0209i;
                    interfaceC4339a2 = interfaceC4339a;
                    c0209i8 = c0209i2;
                    j7 = jM134215getMediaSize0ZcVfYs;
                    c2314t2 = c2314t;
                    c0209i7 = c0209i3;
                    r10 = 0;
                    modifier6 = modifier5;
                    AbstractC35684p.m113047h(AbstractC1102d.m3420q(jM134215getMediaSize0ZcVfYs, c2314t), ((AbstractC18111h.d) mediaSource).getWrapper(), false, 0.0f, 0, null, null, c39077b1, null, c28655q7, 12582912, 380);
                    C28655q c28655q1118 = c28655q7;
                    c28655q1118.m87173q(false);
                    f15 = f13;
                    interfaceC28601c2 = interfaceC28601c1;
                    function4 = function2;
                    c28655q2 = c28655q1118;
                } else {
                    z15 = z13;
                    c0209i5 = c0209i;
                    c0209i6 = c0209i4;
                    c0209i7 = c0209i3;
                    interfaceC4339a2 = interfaceC4339a;
                    j7 = jM134215getMediaSize0ZcVfYs;
                    c0209i8 = c0209i2;
                    modifier6 = modifier5;
                    r10 = 0;
                    r10 = 0;
                    i24 = i15;
                    c2314t2 = c2314t;
                    function4 = function2;
                    if (mediaSource instanceof AbstractC18111h.c) {
                        c28655q7.m87150e0(-998814904);
                        Modifier modifierM3420q19 = AbstractC1102d.m3420q(j7, c2314t2);
                        AbstractC26165a abstractC26165aM64500i13 = AbstractC22404p.m64500i(((AbstractC18111h.c) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                        f16 = f13;
                        AbstractC29125c.m88522c(abstractC26165aM64500i13, "", modifierM3420q19, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                        c28655q7.m87173q(false);
                    } else if (mediaSource instanceof AbstractC18111h.b) {
                        c28655q7.m87150e0(-998507384);
                        Modifier modifierM3420q110 = AbstractC1102d.m3420q(j7, c2314t2);
                        AbstractC26165a abstractC26165aM64500i14 = AbstractC22404p.m64500i(((AbstractC18111h.b) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                        f16 = f13;
                        AbstractC29125c.m88522c(abstractC26165aM64500i14, "", modifierM3420q110, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                        c28655q7.m87173q(false);
                    } else {
                        f15 = f13;
                        if (mediaSource instanceof AbstractC18111h.a) {
                            throw AbstractC11895b.m32003v(1768884794, c28655q7, false);
                        }
                        c28655q7.m87150e0(1768915691);
                        C18122s model7 = ((AbstractC18111h.a) mediaSource).getModel();
                        Modifier modifierM3420q111 = AbstractC1102d.m3420q(j7, c2314t2);
                        interfaceC28601c2 = interfaceC28601c1;
                        boolean zM87153g7 = c28655q7.m87153g(interfaceC28601c2);
                        if ((i24 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zM87153g7;
                        objM87133R = c28655q7.m87133R();
                        if (z17) {
                            obj3 = objM87133R;
                            Object c2609r12 = new C2609r(function4, interfaceC28601c2, 14);
                            c28655q7.m87172p0(c2609r12);
                            obj3 = c2609r12;
                        } else {
                            obj3 = objM87133R;
                            Object c2609r13 = new C2609r(function4, interfaceC28601c2, 14);
                            c28655q7.m87172p0(c2609r13);
                            obj3 = c2609r13;
                        }
                        obj3 = objM87133R;
                        AbstractC18121r.m52029d(model7, modifierM3420q111, (Function1) obj3, null, c28655q7, 0, 8);
                        c28655q7.m87173q(false);
                        c28655q2 = c28655q7;
                    }
                    interfaceC28601c2 = interfaceC28601c1;
                    f15 = f16;
                    c28655q2 = c28655q7;
                }
                textOverlay = viewState.getTextOverlay();
                if (textOverlay != null) {
                    textOverlay = null;
                } else {
                    textOverlay = null;
                }
                if (textOverlay == null) {
                    c28655q2.m87150e0(-997575184);
                    c28655q2.m87173q(r10);
                    function6 = function4;
                    z19 = true;
                    c28655q6 = c28655q2;
                } else {
                    c28655q2.m87150e0(-997575183);
                    i25 = iArr[viewState.getSize().ordinal()];
                    if (i25 != 1) {
                        i26 = 2;
                        if (i25 != 2) {
                            i27 = 5;
                            c2307m = null;
                            c28655q2.m87150e0(851643970);
                            if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                c28655q2.m87150e0(851645955);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                            } else {
                                c28655q2.m87150e0(851646915);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                            }
                            c28655q2.m87173q(r10);
                            c28655q2.m87173q(r10);
                        } else {
                            i27 = 5;
                            c2307m = null;
                            c28655q2.m87150e0(851643970);
                            if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                                c28655q2.m87150e0(851645955);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                            } else {
                                c28655q2.m87150e0(851646915);
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                            }
                            c28655q2.m87173q(r10);
                            c28655q2.m87173q(r10);
                        }
                    } else {
                        i26 = 2;
                        i27 = 5;
                        c2307m = null;
                        c28655q2.m87150e0(851640899);
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                        c28655q2.m87173q(r10);
                    }
                    i28 = iArr[viewState.getSize().ordinal()];
                    if (i28 != 1) {
                        f17 = (float) 0.25d;
                    } else if (i28 != i26) {
                        f17 = 1;
                    } else {
                        f17 = 1;
                    }
                    f18 = f17 * 8;
                    z18 = z15;
                    Modifier modifierM3392n7 = AbstractC1099a.m3392n(AbstractC1102d.m3428y(c2314t2, c2307m, z18, 1), 0.0f, f15, 1);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9102E, r10);
                    function5 = function4;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3392n7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q2.m87163l(interfaceC4339a3);
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q2.m87178s0();
                    }
                    c0209i9 = c0209i5;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d11);
                    c0209i10 = c0209i8;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m17);
                    if (c28655q2.f115903S) {
                        c0209i11 = c0209i7;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                    } else {
                        c0209i11 = c0209i7;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                    }
                    c0209i12 = c0209i6;
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N17);
                    strM21274h = AbstractC8693b.m21274h(textOverlay, c28655q2, r10);
                    textOverlaySuffix = viewState.getTextOverlaySuffix();
                    if (textOverlaySuffix != null) {
                        textOverlaySuffix = null;
                    } else {
                        textOverlaySuffix = null;
                    }
                    if (textOverlaySuffix == null) {
                        c28655q2.m87150e0(1845056546);
                        c28655q2.m87173q(r10);
                        strM21274h2 = null;
                    } else {
                        c28655q2.m87150e0(1845056547);
                        strM21274h2 = AbstractC8693b.m21274h(textOverlaySuffix, c28655q2, r10);
                        c28655q2.m87173q(r10);
                    }
                    if (strM21274h2 != null) {
                        strM8299l = strM21274h;
                    } else {
                        strM8299l = strM21274h;
                    }
                    j13 = j7;
                    fM36284n = AbstractC12889b.m36284n(strM8299l.length(), 2, 12) / 2.0f;
                    if (fM36284n < 1.5f) {
                        f19 = 1.5f;
                    } else {
                        f19 = fM36284n;
                    }
                    Modifier modifierM118994r7 = AbstractC37056f.m118994r(AbstractC1127a.m3488c(C1100b.f4583a.mo3401b(c2314t2), f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524286), AbstractC33253j.m105486b(30));
                    C17909s c17909s7 = AbstractC17911t.f69612b;
                    c38072d = C38072d.f163053a;
                    str = strM21274h2;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM118994r7, C17909s.m51489g(c17909s7, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.7f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.5f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.3f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.f69636m)), 0L, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                    i29 = a.f70324b[viewState.getTextOverlayStyle().ordinal()];
                    z19 = true;
                    if (i29 != 1) {
                        jM73366B = AbstractC25012a.m73366B(c28655q2, 2137771313, c38072d, c28655q2, 6);
                        c28655q2.m87173q(false);
                    } else if (i29 != 2) {
                        c28655q2.m87150e0(2137774322);
                        jM73366B = c38072d.m121949b(c28655q2, 6).getStrainZone2();
                        c28655q2.m87173q(false);
                    } else {
                        if (i29 == 3) {
                            throw AbstractC11895b.m32003v(2137768005, c28655q2, false);
                        }
                        c28655q2.m87150e0(2137777101);
                        jM73366B = c38072d.m121949b(c28655q2, 6).getGreyL1();
                        c28655q2.m87173q(false);
                    }
                    j14 = jM73366B;
                    jM113246h = n13.getStyle().f92255a.f92192b;
                    if ((1095216660480L & jM113246h) == 0) {
                        jM113246h = AbstractC35745c.m113246h(16);
                    }
                    if (z18) {
                        c28655q2.m87150e0(1846764275);
                        c2886aM8397c = C2886a.m8397c(n13, C23285v0.m67364b(n13.getStyle(), 0L, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.7f), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                        Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                        C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3396r7);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a3);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a7);
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m18);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N18);
                        c39111m = AbstractC39083d.f168140a;
                        C28655q c28655q1119 = c28655q2;
                        C2886a c2886a13 = n13;
                        function6 = function5;
                        AbstractC30795n.m94707h(strM21274h, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886a13, fValueOf, c28655q1119, 0, 12586416, 51192);
                        c28655q4 = c28655q1119;
                        if (str == null) {
                            c28655q4.m87150e0(1806258676);
                            z24 = false;
                            c28655q4.m87173q(false);
                            c28655q5 = c28655q4;
                        } else {
                            c28655q4.m87150e0(1806258677);
                            AbstractC30795n.m94707h(str, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886aM8397c, fValueOf, c28655q4, 0, 12586416, 51192);
                            C28655q c28655q11110 = c28655q4;
                            z24 = false;
                            c28655q11110.m87173q(false);
                            c28655q5 = c28655q11110;
                        }
                        c28655q5.m87173q(true);
                        c28655q5.m87173q(z24);
                        c28655q3 = c28655q5;
                    } else {
                        C2886a c2886a14 = n13;
                        function6 = function5;
                        c28655q2.m87150e0(1848232590);
                        c23248d = new C23248d();
                        c23248d.m67300b(strM21274h);
                        if (str != null) {
                            iM67308j = c23248d.m67308j(new C23267m0(0L, AbstractC35745c.m113248j(0.7f, 8589934592L), (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65533));
                            c23248d.m67300b(str);
                            c23248d.m67304f(iM67308j);
                        }
                        C28655q c28655q11111 = c28655q2;
                        AbstractC30060g.m92105a(c23248d.m67309k(), AbstractC1102d.m3425v(AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2), 0.0f, C39176h.m124787c(j13), 1), C23285v0.m67364b(c2886a14.getStyle(), j14, 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 1, false, 1, 0, null, null, C34370y0.m108670a(4, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.5f), jM113246h), c28655q11111, 1794048, 904);
                        C28655q c28655q11112 = c28655q11111;
                        z24 = false;
                        c28655q11112.m87173q(false);
                        c28655q3 = c28655q11112;
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(z24);
                    c28655q6 = c28655q3;
                }
                c28655q6.m87173q(z19);
                function3 = function6;
                modifier3 = modifier6;
                c28655q = c28655q6;
            } else {
                modifier5 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N16);
            mediaSource = viewState.getMediaSource();
            z14 = mediaSource instanceof AbstractC18111h.d;
            c39077b1 = C39102j.f168200b;
            if (z14) {
                c28655q7.m87150e0(-999074405);
                c0209i6 = c0209i4;
                z15 = z13;
                c0209i5 = c0209i;
                interfaceC4339a2 = interfaceC4339a;
                c0209i8 = c0209i2;
                j7 = jM134215getMediaSize0ZcVfYs;
                c2314t2 = c2314t;
                c0209i7 = c0209i3;
                r10 = 0;
                modifier6 = modifier5;
                AbstractC35684p.m113047h(AbstractC1102d.m3420q(jM134215getMediaSize0ZcVfYs, c2314t), ((AbstractC18111h.d) mediaSource).getWrapper(), false, 0.0f, 0, null, null, c39077b1, null, c28655q7, 12582912, 380);
                C28655q c28655q11113 = c28655q7;
                c28655q11113.m87173q(false);
                f15 = f13;
                interfaceC28601c2 = interfaceC28601c1;
                function4 = function2;
                c28655q2 = c28655q11113;
            } else {
                z15 = z13;
                c0209i5 = c0209i;
                c0209i6 = c0209i4;
                c0209i7 = c0209i3;
                interfaceC4339a2 = interfaceC4339a;
                j7 = jM134215getMediaSize0ZcVfYs;
                c0209i8 = c0209i2;
                modifier6 = modifier5;
                r10 = 0;
                r10 = 0;
                i24 = i15;
                c2314t2 = c2314t;
                function4 = function2;
                if (mediaSource instanceof AbstractC18111h.c) {
                    c28655q7.m87150e0(-998814904);
                    Modifier modifierM3420q112 = AbstractC1102d.m3420q(j7, c2314t2);
                    AbstractC26165a abstractC26165aM64500i15 = AbstractC22404p.m64500i(((AbstractC18111h.c) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                    f16 = f13;
                    AbstractC29125c.m88522c(abstractC26165aM64500i15, "", modifierM3420q112, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                    c28655q7.m87173q(false);
                } else if (mediaSource instanceof AbstractC18111h.b) {
                    c28655q7.m87150e0(-998507384);
                    Modifier modifierM3420q113 = AbstractC1102d.m3420q(j7, c2314t2);
                    AbstractC26165a abstractC26165aM64500i16 = AbstractC22404p.m64500i(((AbstractC18111h.b) mediaSource).getSource(), null, null, c28655q7, 0, 3);
                    f16 = f13;
                    AbstractC29125c.m88522c(abstractC26165aM64500i16, "", modifierM3420q113, null, c39077b1, 0.0f, null, c28655q7, 24624, 104);
                    c28655q7.m87173q(false);
                } else {
                    f15 = f13;
                    if (mediaSource instanceof AbstractC18111h.a) {
                        throw AbstractC11895b.m32003v(1768884794, c28655q7, false);
                    }
                    c28655q7.m87150e0(1768915691);
                    C18122s model8 = ((AbstractC18111h.a) mediaSource).getModel();
                    Modifier modifierM3420q114 = AbstractC1102d.m3420q(j7, c2314t2);
                    interfaceC28601c2 = interfaceC28601c1;
                    boolean zM87153g8 = c28655q7.m87153g(interfaceC28601c2);
                    if ((i24 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zM87153g8;
                    objM87133R = c28655q7.m87133R();
                    if (z17) {
                        obj3 = objM87133R;
                        Object c2609r14 = new C2609r(function4, interfaceC28601c2, 14);
                        c28655q7.m87172p0(c2609r14);
                        obj3 = c2609r14;
                    } else {
                        obj3 = objM87133R;
                        Object c2609r15 = new C2609r(function4, interfaceC28601c2, 14);
                        c28655q7.m87172p0(c2609r15);
                        obj3 = c2609r15;
                    }
                    obj3 = objM87133R;
                    AbstractC18121r.m52029d(model8, modifierM3420q114, (Function1) obj3, null, c28655q7, 0, 8);
                    c28655q7.m87173q(false);
                    c28655q2 = c28655q7;
                }
                interfaceC28601c2 = interfaceC28601c1;
                f15 = f16;
                c28655q2 = c28655q7;
            }
            textOverlay = viewState.getTextOverlay();
            if (textOverlay != null) {
                textOverlay = null;
            } else {
                textOverlay = null;
            }
            if (textOverlay == null) {
                c28655q2.m87150e0(-997575184);
                c28655q2.m87173q(r10);
                function6 = function4;
                z19 = true;
                c28655q6 = c28655q2;
            } else {
                c28655q2.m87150e0(-997575183);
                i25 = iArr[viewState.getSize().ordinal()];
                if (i25 != 1) {
                    i26 = 2;
                    if (i25 != 2) {
                        i27 = 5;
                        c2307m = null;
                        c28655q2.m87150e0(851643970);
                        if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                            c28655q2.m87150e0(851645955);
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                        } else {
                            c28655q2.m87150e0(851646915);
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                        }
                        c28655q2.m87173q(r10);
                        c28655q2.m87173q(r10);
                    } else {
                        i27 = 5;
                        c2307m = null;
                        c28655q2.m87150e0(851643970);
                        if (m51973j(AbstractC8693b.m21274h(textOverlay, c28655q2, r10), c28655q2, r10)) {
                            c28655q2.m87150e0(851645955);
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                        } else {
                            c28655q2.m87150e0(851646915);
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN3();
                        }
                        c28655q2.m87173q(r10);
                        c28655q2.m87173q(r10);
                    }
                } else {
                    i26 = 2;
                    i27 = 5;
                    c2307m = null;
                    c28655q2.m87150e0(851640899);
                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN4();
                    c28655q2.m87173q(r10);
                }
                i28 = iArr[viewState.getSize().ordinal()];
                if (i28 != 1) {
                    f17 = (float) 0.25d;
                } else if (i28 != i26) {
                    f17 = 1;
                } else {
                    f17 = 1;
                }
                f18 = f17 * 8;
                z18 = z15;
                Modifier modifierM3392n8 = AbstractC1099a.m3392n(AbstractC1102d.m3428y(c2314t2, c2307m, z18, 1), 0.0f, f15, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9102E, r10);
                function5 = function4;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM3392n8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q2.m87163l(interfaceC4339a3);
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q2.m87178s0();
                }
                c0209i9 = c0209i5;
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d12);
                c0209i10 = c0209i8;
                AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m19);
                if (c28655q2.f115903S) {
                    c0209i11 = c0209i7;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                } else {
                    c0209i11 = c0209i7;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i11);
                }
                c0209i12 = c0209i6;
                AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N19);
                strM21274h = AbstractC8693b.m21274h(textOverlay, c28655q2, r10);
                textOverlaySuffix = viewState.getTextOverlaySuffix();
                if (textOverlaySuffix != null) {
                    textOverlaySuffix = null;
                } else {
                    textOverlaySuffix = null;
                }
                if (textOverlaySuffix == null) {
                    c28655q2.m87150e0(1845056546);
                    c28655q2.m87173q(r10);
                    strM21274h2 = null;
                } else {
                    c28655q2.m87150e0(1845056547);
                    strM21274h2 = AbstractC8693b.m21274h(textOverlaySuffix, c28655q2, r10);
                    c28655q2.m87173q(r10);
                }
                if (strM21274h2 != null) {
                    strM8299l = strM21274h;
                } else {
                    strM8299l = strM21274h;
                }
                j13 = j7;
                fM36284n = AbstractC12889b.m36284n(strM8299l.length(), 2, 12) / 2.0f;
                if (fM36284n < 1.5f) {
                    f19 = 1.5f;
                } else {
                    f19 = fM36284n;
                }
                Modifier modifierM118994r8 = AbstractC37056f.m118994r(AbstractC1127a.m3488c(C1100b.f4583a.mo3401b(c2314t2), f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524286), AbstractC33253j.m105486b(30));
                C17909s c17909s8 = AbstractC17911t.f69612b;
                c38072d = C38072d.f163053a;
                str = strM21274h2;
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM118994r8, C17909s.m51489g(c17909s8, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.7f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.5f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.m51541c(0.3f, c38072d.m121949b(c28655q2, 6).getBrandBlack())), new C17919x(C17919x.f69636m)), 0L, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                i29 = a.f70324b[viewState.getTextOverlayStyle().ordinal()];
                z19 = true;
                if (i29 != 1) {
                    jM73366B = AbstractC25012a.m73366B(c28655q2, 2137771313, c38072d, c28655q2, 6);
                    c28655q2.m87173q(false);
                } else if (i29 != 2) {
                    c28655q2.m87150e0(2137774322);
                    jM73366B = c38072d.m121949b(c28655q2, 6).getStrainZone2();
                    c28655q2.m87173q(false);
                } else {
                    if (i29 == 3) {
                        throw AbstractC11895b.m32003v(2137768005, c28655q2, false);
                    }
                    c28655q2.m87150e0(2137777101);
                    jM73366B = c38072d.m121949b(c28655q2, 6).getGreyL1();
                    c28655q2.m87173q(false);
                }
                j14 = jM73366B;
                jM113246h = n13.getStyle().f92255a.f92192b;
                if ((1095216660480L & jM113246h) == 0) {
                    jM113246h = AbstractC35745c.m113246h(16);
                }
                if (z18) {
                    c28655q2.m87150e0(1846764275);
                    c2886aM8397c = C2886a.m8397c(n13, C23285v0.m67364b(n13.getStyle(), 0L, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.7f), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                    Modifier modifierM3396r8 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM3396r8);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a3);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i11);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N110);
                    c39111m = AbstractC39083d.f168140a;
                    C28655q c28655q11114 = c28655q2;
                    C2886a c2886a15 = n13;
                    function6 = function5;
                    AbstractC30795n.m94707h(strM21274h, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886a15, fValueOf, c28655q11114, 0, 12586416, 51192);
                    c28655q4 = c28655q11114;
                    if (str == null) {
                        c28655q4.m87150e0(1806258676);
                        z24 = false;
                        c28655q4.m87173q(false);
                        c28655q5 = c28655q4;
                    } else {
                        c28655q4.m87150e0(1806258677);
                        AbstractC30795n.m94707h(str, new WithAlignmentLineElement(c39111m), j14, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, c2886aM8397c, fValueOf, c28655q4, 0, 12586416, 51192);
                        C28655q c28655q11115 = c28655q4;
                        z24 = false;
                        c28655q11115.m87173q(false);
                        c28655q5 = c28655q11115;
                    }
                    c28655q5.m87173q(true);
                    c28655q5.m87173q(z24);
                    c28655q3 = c28655q5;
                } else {
                    C2886a c2886a16 = n13;
                    function6 = function5;
                    c28655q2.m87150e0(1848232590);
                    c23248d = new C23248d();
                    c23248d.m67300b(strM21274h);
                    if (str != null) {
                        iM67308j = c23248d.m67308j(new C23267m0(0L, AbstractC35745c.m113248j(0.7f, 8589934592L), (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65533));
                        c23248d.m67300b(str);
                        c23248d.m67304f(iM67308j);
                    }
                    C28655q c28655q11116 = c28655q2;
                    AbstractC30060g.m92105a(c23248d.m67309k(), AbstractC1102d.m3425v(AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2), 0.0f, C39176h.m124787c(j13), 1), C23285v0.m67364b(c2886a16.getStyle(), j14, 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 1, false, 1, 0, null, null, C34370y0.m108670a(4, AbstractC11478a.m30852d(jM113246h, 4294967296L, 0.5f), jM113246h), c28655q11116, 1794048, 904);
                    C28655q c28655q11117 = c28655q11116;
                    z24 = false;
                    c28655q11117.m87173q(false);
                    c28655q3 = c28655q11117;
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(z24);
                c28655q6 = c28655q3;
            }
            c28655q6.m87173q(z19);
            function3 = function6;
            modifier3 = modifier6;
            c28655q = c28655q6;
        } else {
            c28655q7.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c28655q = c28655q7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 5, (Object) viewState, (Object) modifier3, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final EnumC35690s m51968e(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC35690s) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: f */
    private static final void m51969f(InterfaceC28601c1 interfaceC28601c1, EnumC35690s enumC35690s) {
        interfaceC28601c1.setValue(enumC35690s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m51970g(float f13, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3398t(applyIf, 0.0f, 0.0f, 0.0f, f13, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m51971h(Function1 function1, InterfaceC28601c1 interfaceC28601c1, EnumC35690s state) {
        AbstractC22676k.m65750j(state, "state");
        m51969f(interfaceC28601c1, state);
        if (function1 != null) {
            function1.invoke(state);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m51972i(C18112i c18112i, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51967d(c18112i, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m51973j(String textOverlay, Composer composer, int i13) {
        AbstractC22676k.m65750j(textOverlay, "textOverlay");
        return textOverlay.length() > 5;
    }
}

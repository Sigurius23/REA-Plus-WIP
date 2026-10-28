package c41;

import am2.C1012d;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import c31.C3929m;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import mh.C25540h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import ph.C29227a;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.b3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aa\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lc41/d3;", "type", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "imageContentDescription", "title", "subTitle", "", "ctaUrl", "name", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lc41/d3;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lc41/d3;)I", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3995b3 {

    /* JADX INFO: renamed from: c41.b3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16270a;

        static {
            int[] iArr = new int[EnumC4009d3.values().length];
            try {
                iArr[EnumC4009d3.ARTICLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4009d3.PODCAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4009d3.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16270a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019f  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:117:0x0221  */
    /* JADX WARN: Code duplicated, block: B:120:0x0245  */
    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:124:0x028d  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:130:0x02db  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:134:0x0319  */
    /* JADX WARN: Code duplicated, block: B:138:0x0336  */
    /* JADX WARN: Code duplicated, block: B:141:0x0366  */
    /* JADX WARN: Code duplicated, block: B:142:0x036a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0377  */
    /* JADX WARN: Code duplicated, block: B:147:0x0385  */
    /* JADX WARN: Code duplicated, block: B:150:0x0421  */
    /* JADX WARN: Code duplicated, block: B:151:0x0425  */
    /* JADX WARN: Code duplicated, block: B:154:0x0432  */
    /* JADX WARN: Code duplicated, block: B:156:0x0440  */
    /* JADX WARN: Code duplicated, block: B:159:0x047c  */
    /* JADX WARN: Code duplicated, block: B:161:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:164:0x050a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0514  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
    /* JADX WARN: Code duplicated, block: B:83:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:97:0x0188  */
    /* JADX WARN: Code duplicated, block: B:98:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v20 */
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
    public static final void m12108d(EnumC4009d3 type, AbstractC22403o image, TextResource textResource, TextResource title, TextResource textResource2, String str, String name, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        boolean z4;
        C28655q c28655q;
        TextResource textResource3;
        C28677v1 c28677v1M87180u;
        TextResource textResource4;
        C2314t c2314t;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        C28676v0 c28676v0;
        Object c1012d;
        C2314t c2314t2;
        float f13;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        float f14;
        C0209i c0209i4;
        int iHashCode2;
        C2314t c2314t3;
        float f15;
        Object objM87133R;
        String strM21274h;
        float f16;
        int i17;
        ?? r10;
        int iHashCode3;
        C38072d c38072d;
        C28655q c28655q2;
        int iHashCode4;
        int i18;
        C28655q c28655q3;
        int iHashCode5;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        TextResource subTitle = textResource2;
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1417622936);
        if ((i13 & 6) == 0) {
            i15 = (c28655q4.m87149e(type.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87153g(image) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                i15 |= c28655q4.m87153g(textResource) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q4.m87153g(title)) {
                    i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i27;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q4.m87153g(subTitle)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i26;
            }
            if ((196608 & i13) == 0) {
                str2 = str;
                if (c28655q4.m87153g(str2)) {
                    i25 = 131072;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            } else {
                str2 = str;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q4.m87153g(name)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q4.m87157i(onViewEvent)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
            i16 = i15;
            if ((i16 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i16 & 1, z4)) {
                if (i28 != 0) {
                    textResource4 = null;
                } else {
                    textResource4 = textResource;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                if ((i16 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i16 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z18 = z13 | z14;
                if ((i16 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z19 = z18 | z15;
                if ((i16 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z19 | z16;
                Object objM87133R2 = c28655q4.m87133R();
                c28676v0 = C28635l.f115821a;
                if (!z17 || objM87133R2 == c28676v0) {
                    c2314t2 = c2314t;
                    c1012d = new C1012d((Object) onViewEvent, name, (Object) str2, (Object) type, 6);
                    c28655q4.m87172p0(c1012d);
                } else {
                    c2314t2 = c2314t;
                    c1012d = objM87133R2;
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) c1012d, 15);
                C22949e c22949e = AbstractC22977m.f90650a;
                f13 = 8;
                C2305k c2305k = C2299e.f9110M;
                C22971k c22971kM66747j = AbstractC22977m.m66747j(2 * f13, c2305k);
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66747j, c2306l, c28655q4, 54);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    f14 = f13;
                } else {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                    c2314t3 = c2314t2;
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, c2314t3);
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
                    f15 = 4;
                    Modifier modifierM3421r = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t3, AbstractC33253j.m105489e(3 * f15)), 23 * f15, 18 * f15);
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C3929m(15);
                        c28655q4.m87172p0(objM87133R);
                    }
                    AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(image, null, (Function1) objM87133R, c28655q4, ((i16 >> 3) & 14) | 384, 1);
                    if (textResource4 == 0) {
                        c28655q4.m87150e0(-965000789);
                        c28655q4.m87173q(false);
                        strM21274h = null;
                    } else {
                        c28655q4.m87150e0(-965000788);
                        strM21274h = AbstractC8693b.m21274h(textResource4, c28655q4, 0);
                        c28655q4.m87173q(false);
                    }
                    textResource = textResource4;
                    f16 = f14;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, strM21274h, modifierM3421r, null, C39102j.f168199a, 0.0f, null, c28655q4, 24576, 104);
                    if (type == EnumC4009d3.VIDEO) {
                        Modifier modifierM53365f = AbstractC18489d0.m53365f(c28655q4, -964840363, f16, f15, c2314t3);
                        C38072d c38072d2 = C38072d.f163053a;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53365f, c38072d2.m121949b(c28655q4, 6).getBlack70(), AbstractC33253j.f138651a);
                        C2307m c2307m = C2299e.f9102E;
                        C1100b c1100b = C1100b.f4583a;
                        Modifier modifierMo3400a = c1100b.mo3400a(modifierM3358c, c2307m);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode5 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierMo3400a);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
                        i17 = 6;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62139p4, c28655q4, 0), AbstractC30060g.m92103Y(c28655q4, AbstractC16277f.f62243H1), c1100b.mo3400a(c2314t3, c2307m), c38072d2.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 0, 0);
                        r10 = 1;
                        c28655q4.m87173q(true);
                        c28655q4.m87173q(false);
                    } else {
                        i17 = 6;
                        r10 = 1;
                        c28655q4.m87150e0(-964057148);
                        c28655q4.m87173q(false);
                    }
                    c28655q4.m87173q(r10);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, r10);
                    float f17 = ((float) r10) * f16;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f17, c2306l), c2305k, c28655q4, 54);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, layoutWeightElement);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N4);
                    String strM21274h2 = AbstractC8693b.m21274h(title, c28655q4, (i16 >> 9) & 14);
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q4, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 3, 0, null, c38072d.m121952e(c28655q4, i17).getB2(), null, c28655q4, 0, 3120, 185850);
                    c28655q2 = c28655q4;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 48);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(m12112h(type), c28655q2, 0), null, AbstractC1102d.m3419p(f15 * f15, AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, f17, 0.0f, 11)), c38072d.m121949b(c28655q2, 6).getWhite50(), c28655q2, 432, 0);
                    if (AbstractC8693b.m21270d(textResource2)) {
                        c28655q2.m87150e0(-1119956770);
                        subTitle = textResource2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(subTitle, c28655q2, (i16 >> 12) & 14), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, 0, 48, 194042);
                        C28655q c28655q5 = c28655q2;
                        i18 = 0;
                        c28655q5.m87173q(false);
                        c28655q3 = c28655q5;
                    } else {
                        subTitle = textResource2;
                        i18 = 0;
                        c28655q2.m87150e0(-1119637160);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f61985Q1, c28655q3, i18), null, AbstractC1102d.m3419p(5 * f15, c2314t3), c38072d.m121949b(c28655q3, 6).getBrandWhite(), c28655q3, 432, 0);
                    c28655q3.m87173q(true);
                    c28655q = c28655q3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                c2314t3 = c2314t2;
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, c2314t3);
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
                f15 = 4;
                Modifier modifierM3421r2 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t3, AbstractC33253j.m105489e(3 * f15)), 23 * f15, 18 * f15);
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C3929m(15);
                    c28655q4.m87172p0(objM87133R);
                }
                AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(image, null, (Function1) objM87133R, c28655q4, ((i16 >> 3) & 14) | 384, 1);
                if (textResource4 == 0) {
                    c28655q4.m87150e0(-965000789);
                    c28655q4.m87173q(false);
                    strM21274h = null;
                } else {
                    c28655q4.m87150e0(-965000788);
                    strM21274h = AbstractC8693b.m21274h(textResource4, c28655q4, 0);
                    c28655q4.m87173q(false);
                }
                textResource = textResource4;
                f16 = f14;
                AbstractC29125c.m88522c(abstractC26165aM64500i2, strM21274h, modifierM3421r2, null, C39102j.f168199a, 0.0f, null, c28655q4, 24576, 104);
                if (type == EnumC4009d3.VIDEO) {
                    Modifier modifierM53365f2 = AbstractC18489d0.m53365f(c28655q4, -964840363, f16, f15, c2314t3);
                    C38072d c38072d3 = C38072d.f163053a;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM53365f2, c38072d3.m121949b(c28655q4, 6).getBlack70(), AbstractC33253j.f138651a);
                    C2307m c2307m2 = C2299e.f9102E;
                    C1100b c1100b2 = C1100b.f4583a;
                    Modifier modifierMo3400a2 = c1100b2.mo3400a(modifierM3358c2, c2307m2);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode5 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierMo3400a2);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m7);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N7);
                    i17 = 6;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62139p4, c28655q4, 0), AbstractC30060g.m92103Y(c28655q4, AbstractC16277f.f62243H1), c1100b2.mo3400a(c2314t3, c2307m2), c38072d3.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 0, 0);
                    r10 = 1;
                    c28655q4.m87173q(true);
                    c28655q4.m87173q(false);
                } else {
                    i17 = 6;
                    r10 = 1;
                    c28655q4.m87150e0(-964057148);
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(r10);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, r10);
                float f18 = ((float) r10) * f16;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f18, c2306l), c2305k, c28655q4, 54);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, layoutWeightElement2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m8);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N8);
                String strM21274h3 = AbstractC8693b.m21274h(title, c28655q4, (i16 >> 9) & 14);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h3, null, c38072d.m121949b(c28655q4, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 3, 0, null, c38072d.m121952e(c28655q4, i17).getB2(), null, c28655q4, 0, 3120, 185850);
                c28655q2 = c28655q4;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 48);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, c2314t3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N9);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(m12112h(type), c28655q2, 0), null, AbstractC1102d.m3419p(f15 * f15, AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, f18, 0.0f, 11)), c38072d.m121949b(c28655q2, 6).getWhite50(), c28655q2, 432, 0);
                if (AbstractC8693b.m21270d(textResource2)) {
                    c28655q2.m87150e0(-1119956770);
                    subTitle = textResource2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(subTitle, c28655q2, (i16 >> 12) & 14), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, 0, 48, 194042);
                    C28655q c28655q6 = c28655q2;
                    i18 = 0;
                    c28655q6.m87173q(false);
                    c28655q3 = c28655q6;
                } else {
                    subTitle = textResource2;
                    i18 = 0;
                    c28655q2.m87150e0(-1119637160);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f61985Q1, c28655q3, i18), null, AbstractC1102d.m3419p(5 * f15, c2314t3), c38072d.m121949b(c28655q3, 6).getBrandWhite(), c28655q3, 432, 0);
                c28655q3.m87173q(true);
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                c28655q = c28655q4;
            }
            textResource3 = textResource;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b((Object) type, (Object) image, (Object) textResource3, (Object) title, (Object) subTitle, (Object) str, (Object) name, onViewEvent, i13, i14, 4);
            }
        }
        i15 |= 384;
        if ((i13 & 3072) == 0) {
            if (c28655q4.m87153g(title)) {
                i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i27;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q4.m87153g(subTitle)) {
                i26 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i26 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i26;
        }
        if ((196608 & i13) == 0) {
            str2 = str;
            if (c28655q4.m87153g(str2)) {
                i25 = 131072;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        } else {
            str2 = str;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q4.m87153g(name)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i15 |= i24;
        }
        if ((12582912 & i13) == 0) {
            if (c28655q4.m87157i(onViewEvent)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i15 |= i19;
        }
        i16 = i15;
        if ((i16 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i16 & 1, z4)) {
            if (i28 != 0) {
                textResource4 = null;
            } else {
                textResource4 = textResource;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            if ((i16 & 29360128) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i16 & 3670016) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z110 = z13 | z14;
            if ((i16 & 458752) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z111 = z110 | z15;
            if ((i16 & 14) == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z111 | z16;
            Object objM87133R3 = c28655q4.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z17) {
                c2314t2 = c2314t;
                c1012d = new C1012d((Object) onViewEvent, name, (Object) str2, (Object) type, 6);
                c28655q4.m87172p0(c1012d);
            } else {
                c2314t2 = c2314t;
                c1012d = new C1012d((Object) onViewEvent, name, (Object) str2, (Object) type, 6);
                c28655q4.m87172p0(c1012d);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) c1012d, 15);
            C22949e c22949e2 = AbstractC22977m.f90650a;
            f13 = 8;
            C2305k c2305k2 = C2299e.f9110M;
            C22971k c22971kM66747j2 = AbstractC22977m.m66747j(2 * f13, c2305k2);
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22971kM66747j2, c2306l2, c28655q4, 54);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM3362g2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m10);
            c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S) {
                f14 = f13;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                c2314t3 = c2314t2;
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, c2314t3);
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
                f15 = 4;
                Modifier modifierM3421r3 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t3, AbstractC33253j.m105489e(3 * f15)), 23 * f15, 18 * f15);
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C3929m(15);
                    c28655q4.m87172p0(objM87133R);
                }
                AbstractC26165a abstractC26165aM64500i3 = AbstractC22404p.m64500i(image, null, (Function1) objM87133R, c28655q4, ((i16 >> 3) & 14) | 384, 1);
                if (textResource4 == 0) {
                    c28655q4.m87150e0(-965000789);
                    c28655q4.m87173q(false);
                    strM21274h = null;
                } else {
                    c28655q4.m87150e0(-965000788);
                    strM21274h = AbstractC8693b.m21274h(textResource4, c28655q4, 0);
                    c28655q4.m87173q(false);
                }
                textResource = textResource4;
                f16 = f14;
                AbstractC29125c.m88522c(abstractC26165aM64500i3, strM21274h, modifierM3421r3, null, C39102j.f168199a, 0.0f, null, c28655q4, 24576, 104);
                if (type == EnumC4009d3.VIDEO) {
                    Modifier modifierM53365f3 = AbstractC18489d0.m53365f(c28655q4, -964840363, f16, f15, c2314t3);
                    C38072d c38072d4 = C38072d.f163053a;
                    Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM53365f3, c38072d4.m121949b(c28655q4, 6).getBlack70(), AbstractC33253j.f138651a);
                    C2307m c2307m3 = C2299e.f9102E;
                    C1100b c1100b3 = C1100b.f4583a;
                    Modifier modifierMo3400a3 = c1100b3.mo3400a(modifierM3358c3, c2307m3);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode5 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierMo3400a3);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N12);
                    i17 = 6;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62139p4, c28655q4, 0), AbstractC30060g.m92103Y(c28655q4, AbstractC16277f.f62243H1), c1100b3.mo3400a(c2314t3, c2307m3), c38072d4.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 0, 0);
                    r10 = 1;
                    c28655q4.m87173q(true);
                    c28655q4.m87173q(false);
                } else {
                    i17 = 6;
                    r10 = 1;
                    c28655q4.m87150e0(-964057148);
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(r10);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, r10);
                float f19 = ((float) r10) * f16;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f19, c2306l2), c2305k2, c28655q4, 54);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q4, layoutWeightElement3);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m13);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N13);
                String strM21274h4 = AbstractC8693b.m21274h(title, c28655q4, (i16 >> 9) & 14);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h4, null, c38072d.m121949b(c28655q4, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 3, 0, null, c38072d.m121952e(c28655q4, i17).getB2(), null, c28655q4, 0, 3120, 185850);
                c28655q2 = c28655q4;
                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q2, 48);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, c2314t3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a5);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m14);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N14);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(m12112h(type), c28655q2, 0), null, AbstractC1102d.m3419p(f15 * f15, AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, f19, 0.0f, 11)), c38072d.m121949b(c28655q2, 6).getWhite50(), c28655q2, 432, 0);
                if (AbstractC8693b.m21270d(textResource2)) {
                    c28655q2.m87150e0(-1119956770);
                    subTitle = textResource2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(subTitle, c28655q2, (i16 >> 12) & 14), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, 0, 48, 194042);
                    C28655q c28655q7 = c28655q2;
                    i18 = 0;
                    c28655q7.m87173q(false);
                    c28655q3 = c28655q7;
                } else {
                    subTitle = textResource2;
                    i18 = 0;
                    c28655q2.m87150e0(-1119637160);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f61985Q1, c28655q3, i18), null, AbstractC1102d.m3419p(5 * f15, c2314t3), c38072d.m121949b(c28655q3, 6).getBrandWhite(), c28655q3, 432, 0);
                c28655q3.m87173q(true);
                c28655q = c28655q3;
            } else {
                f14 = f13;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
            c2314t3 = c2314t2;
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, c2314t3);
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
            f15 = 4;
            Modifier modifierM3421r4 = AbstractC1102d.m3421r(AbstractC37056f.m118994r(c2314t3, AbstractC33253j.m105489e(3 * f15)), 23 * f15, 18 * f15);
            objM87133R = c28655q4.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C3929m(15);
                c28655q4.m87172p0(objM87133R);
            }
            AbstractC26165a abstractC26165aM64500i4 = AbstractC22404p.m64500i(image, null, (Function1) objM87133R, c28655q4, ((i16 >> 3) & 14) | 384, 1);
            if (textResource4 == 0) {
                c28655q4.m87150e0(-965000789);
                c28655q4.m87173q(false);
                strM21274h = null;
            } else {
                c28655q4.m87150e0(-965000788);
                strM21274h = AbstractC8693b.m21274h(textResource4, c28655q4, 0);
                c28655q4.m87173q(false);
            }
            textResource = textResource4;
            f16 = f14;
            AbstractC29125c.m88522c(abstractC26165aM64500i4, strM21274h, modifierM3421r4, null, C39102j.f168199a, 0.0f, null, c28655q4, 24576, 104);
            if (type == EnumC4009d3.VIDEO) {
                Modifier modifierM53365f4 = AbstractC18489d0.m53365f(c28655q4, -964840363, f16, f15, c2314t3);
                C38072d c38072d5 = C38072d.f163053a;
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM53365f4, c38072d5.m121949b(c28655q4, 6).getBlack70(), AbstractC33253j.f138651a);
                C2307m c2307m4 = C2299e.f9102E;
                C1100b c1100b4 = C1100b.f4583a;
                Modifier modifierMo3400a4 = c1100b4.mo3400a(modifierM3358c4, c2307m4);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m4, false);
                iHashCode5 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierMo3400a4);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m16);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N16);
                i17 = 6;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62139p4, c28655q4, 0), AbstractC30060g.m92103Y(c28655q4, AbstractC16277f.f62243H1), c1100b4.mo3400a(c2314t3, c2307m4), c38072d5.m121949b(c28655q4, 6).getBrandWhite(), c28655q4, 0, 0);
                r10 = 1;
                c28655q4.m87173q(true);
                c28655q4.m87173q(false);
            } else {
                i17 = 6;
                r10 = 1;
                c28655q4.m87150e0(-964057148);
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(r10);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, r10);
            float f110 = ((float) r10) * f16;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f110, c2306l2), c2305k2, c28655q4, 54);
            iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q4.m87165m();
            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q4, layoutWeightElement4);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m17);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N17);
            String strM21274h5 = AbstractC8693b.m21274h(title, c28655q4, (i16 >> 9) & 14);
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h5, null, c38072d.m121949b(c28655q4, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 3, 0, null, c38072d.m121952e(c28655q4, i17).getB2(), null, c28655q4, 0, 3120, 185850);
            c28655q2 = c28655q4;
            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q2, 48);
            iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, c2314t3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a6);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m18);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N18);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(m12112h(type), c28655q2, 0), null, AbstractC1102d.m3419p(f15 * f15, AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, f110, 0.0f, 11)), c38072d.m121949b(c28655q2, 6).getWhite50(), c28655q2, 432, 0);
            if (AbstractC8693b.m21270d(textResource2)) {
                c28655q2.m87150e0(-1119956770);
                subTitle = textResource2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(subTitle, c28655q2, (i16 >> 12) & 14), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, 0, 48, 194042);
                C28655q c28655q8 = c28655q2;
                i18 = 0;
                c28655q8.m87173q(false);
                c28655q3 = c28655q8;
            } else {
                subTitle = textResource2;
                i18 = 0;
                c28655q2.m87150e0(-1119637160);
                c28655q2.m87173q(false);
                c28655q3 = c28655q2;
            }
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f61985Q1, c28655q3, i18), null, AbstractC1102d.m3419p(5 * f15, c2314t3), c38072d.m121949b(c28655q3, 6).getBrandWhite(), c28655q3, 432, 0);
            c28655q3.m87173q(true);
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        textResource3 = textResource;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b((Object) type, (Object) image, (Object) textResource3, (Object) title, (Object) subTitle, (Object) str, (Object) name, onViewEvent, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m12109e(Function1 function1, String str, String str2, EnumC4009d3 enumC4009d3) {
        function1.invoke(new C4161z2(str, str2, enumC4009d3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m12110f(C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.f100086j = new C29227a(0, 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m12111g(EnumC4009d3 enumC4009d3, AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, String str2, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12108d(enumC4009d3, abstractC22403o, textResource, textResource2, textResource3, str, str2, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final int m12112h(EnumC4009d3 enumC4009d3) {
        int i13 = a.f16270a[enumC4009d3.ordinal()];
        if (i13 == 1) {
            return AbstractC16272a.f62152s;
        }
        if (i13 == 2) {
            return AbstractC16272a.f62155s2;
        }
        if (i13 == 3) {
            return AbstractC16272a.f62149r2;
        }
        throw new NoWhenBranchMatchedException();
    }
}

package zt2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import g41.C15457a;
import g41.C15461e;
import gb1.AbstractC15676d;
import hy0.AbstractC17755i2;
import hy0.EnumC17740f;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.Locale;
import java.util.Map;
import kd1.AbstractC22403o;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import p727py0.C29616a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import w71.C36891k;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yo1.C39689b;
import zi1.C40674e0;
import zm1.C40893d;
import zr1.C41067a;

/* JADX INFO: renamed from: zt2.i */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lzt2/h;", "goalSectionItemState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onActionButtonClicked", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lzt2/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41140i {
    /* JADX WARN: Code duplicated, block: B:102:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01df  */
    /* JADX WARN: Code duplicated, block: B:107:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:109:0x022a  */
    /* JADX WARN: Code duplicated, block: B:111:0x023c  */
    /* JADX WARN: Code duplicated, block: B:113:0x024a  */
    /* JADX WARN: Code duplicated, block: B:114:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x0329  */
    /* JADX WARN: Code duplicated, block: B:118:0x034f  */
    /* JADX WARN: Code duplicated, block: B:119:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:124:0x0403  */
    /* JADX WARN: Code duplicated, block: B:127:0x041c  */
    /* JADX WARN: Code duplicated, block: B:130:0x042f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0431  */
    /* JADX WARN: Code duplicated, block: B:134:0x0439  */
    /* JADX WARN: Code duplicated, block: B:137:0x043e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0441  */
    /* JADX WARN: Code duplicated, block: B:142:0x0482  */
    /* JADX WARN: Code duplicated, block: B:144:0x048a  */
    /* JADX WARN: Code duplicated, block: B:147:0x049c  */
    /* JADX WARN: Code duplicated, block: B:149:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:156:0x054a  */
    /* JADX WARN: Code duplicated, block: B:159:0x056c  */
    /* JADX WARN: Code duplicated, block: B:161:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:164:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:178:0x068d  */
    /* JADX WARN: Code duplicated, block: B:182:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:184:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:187:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:188:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:191:0x06f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:198:0x0730  */
    /* JADX WARN: Code duplicated, block: B:202:0x0751  */
    /* JADX WARN: Code duplicated, block: B:205:0x0782  */
    /* JADX WARN: Code duplicated, block: B:206:0x0786  */
    /* JADX WARN: Code duplicated, block: B:209:0x0799  */
    /* JADX WARN: Code duplicated, block: B:211:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:214:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:226:0x089f  */
    /* JADX WARN: Code duplicated, block: B:229:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:252:0x0993  */
    /* JADX WARN: Code duplicated, block: B:254:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:257:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x017f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0193  */
    /* JADX WARN: Code duplicated, block: B:95:0x019d  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v14, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v16, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v17, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v18, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v19, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v21, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v23, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v25, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v26, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v28, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r11v38, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r13v36, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v7, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r1v27, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r28v5, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v6, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v7, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v8, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v33, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v38 */
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
    /* JADX INFO: renamed from: h */
    public static final void m133596h(C41139h goalSectionItemState, Modifier modifier, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        int i17;
        InterfaceC4339a interfaceC4339a2;
        int i18;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        ?? r10;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Object obj;
        Function1 function4;
        InterfaceC4339a interfaceC4339a4;
        String id4;
        String strConcat;
        int iHashCode;
        C0213j c0213j;
        Modifier modifier4;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Function1 function5;
        Object obj2;
        C0209i c0209i4;
        int iHashCode2;
        InterfaceC4339a interfaceC4339a5;
        C0209i c0209i5;
        AbstractC22403o titleImage;
        C23000t1 c23000t1;
        Modifier modifierMo66772c;
        int iHashCode3;
        C22949e c22949e;
        C23000t1 c23000t2;
        C2314t c2314t2;
        C0209i c0209i6;
        C0209i c0209i7;
        C0209i c0209i8;
        boolean z13;
        C28655q c28655q;
        C28655q c28655q2;
        boolean z14;
        C28655q c28655q3;
        ?? r14;
        ?? r15;
        int i19;
        ?? r16;
        int i24;
        Object objM87133R;
        Object obj3;
        Function1 function6;
        Object obj4;
        C2314t c2314t3;
        C22949e c22949e2;
        int iHashCode4;
        C0213j c0213j2;
        C0209i c0209i9;
        C0209i c0209i10;
        int i25;
        C0209i c0209i11;
        Function1 function7;
        C0213j c0213j3;
        C0209i c0209i12;
        C2314t c2314t4;
        C22949e c22949e3;
        ?? r17;
        ?? r18;
        C2306l c2306l;
        int i26;
        ?? r19;
        Object obj5;
        int iHashCode5;
        C0213j c0213j4;
        C0209i c0209i13;
        C0209i c0209i14;
        C0213j c0213j5;
        C0209i c0209i15;
        Object obj6;
        C23000t1 c23000t3;
        ?? r110;
        InterfaceC4339a interfaceC4339a6;
        boolean z15;
        ?? r111;
        Object obj7;
        Object objM87133R2;
        Object obj8;
        Object obj9;
        int i27;
        boolean z16;
        Object objM87133R3;
        Function1 function8;
        Object objM87133R4;
        Object obj10;
        Object objM87133R5;
        Object obj11;
        C2306l c2306l2 = C2299e.f9108K;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(goalSectionItemState, "goalSectionItemState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-851147333);
        int i28 = (i13 & 6) == 0 ? (c28655q4.m87157i(goalSectionItemState) ? 4 : 2) | i13 : i13;
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i28 |= c28655q4.m87153g(modifier2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q4.m87157i(function2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i28 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q4.m87157i(interfaceC4339a2)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i28 |= i18;
                    }
                    if ((i28 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q4.m87135U(i28 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            modifier2 = c2314t;
                        }
                        obj = C28635l.f115821a;
                        if (i15 != 0) {
                            objM87133R5 = c28655q4.m87133R();
                            if (objM87133R5 == obj) {
                                obj11 = objM87133R5;
                                C40893d c40893d = new C40893d(15);
                                c28655q4.m87172p0(c40893d);
                                obj11 = c40893d;
                            }
                            obj11 = objM87133R5;
                            function4 = (Function1) obj11;
                        } else {
                            function4 = function2;
                        }
                        if (i17 != 0) {
                            objM87133R4 = c28655q4.m87133R();
                            if (objM87133R4 == obj) {
                                obj10 = objM87133R4;
                                C40674e0 c40674e0 = new C40674e0(14);
                                c28655q4.m87172p0(c40674e0);
                                obj10 = c40674e0;
                            }
                            obj10 = objM87133R4;
                            interfaceC4339a4 = (InterfaceC4339a) obj10;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        id4 = goalSectionItemState.getId();
                        if (id4 != null) {
                            String lowerCase = id4.toLowerCase(Locale.ROOT);
                            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                            strConcat = lowerCase.concat("_edit_button");
                        } else {
                            strConcat = null;
                        }
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q4, 0);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        modifier4 = modifier2;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        function5 = function4;
                        if (c28655q4.f115903S) {
                            obj2 = obj;
                        } else {
                            obj2 = obj;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                            C22949e c22949e4 = AbstractC22977m.f90650a;
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e4, c2306l2, c28655q4, 48);
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                            interfaceC4339a5 = interfaceC4339a4;
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, c2314t);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q4.f115903S && AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                                c0209i5 = c0209i3;
                            } else {
                                c0209i5 = c0209i3;
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                            titleImage = goalSectionItemState.getTitleImage();
                            c23000t1 = C23000t1.f90727a;
                            if (titleImage == null) {
                                modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                            } else {
                                modifierMo66772c = c2314t;
                            }
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e4, c2306l2, c28655q4, 48);
                            Modifier modifier5 = modifierMo66772c;
                            iHashCode3 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                            c22949e = c22949e4;
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifier5);
                            c28655q4.m87158i0();
                            c23000t2 = c23000t1;
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
                            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
                            if (goalSectionItemState.getTitleImage() != null) {
                                c28655q4.m87150e0(-999861702);
                                AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                                c28655q4.m87173q(false);
                                function5 = function5;
                                c2306l2 = c2306l2;
                                c0209i5 = c0209i5;
                                c0213j = c0213j;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                r15 = 0;
                                modifier4 = modifier4;
                                obj2 = obj2;
                                c22949e = c22949e;
                                interfaceC4339a5 = interfaceC4339a5;
                                c23000t2 = c23000t2;
                                r14 = c28655q4;
                            } else {
                                c28655q4.m87150e0(-999578641);
                                if (goalSectionItemState.getDisplayHeaderDivider()) {
                                    c28655q4.m87150e0(-999527615);
                                    if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                        c28655q4.m87150e0(-999377141);
                                        c0209i8 = c0209i4;
                                        c2314t2 = c2314t;
                                        c0209i6 = c0209i2;
                                        c0209i7 = c0209i;
                                        AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                        C28655q c28655q5 = c28655q4;
                                        AbstractC31061c.m95650z(7, 4, c2314t2, c28655q5, false);
                                        z14 = false;
                                        c28655q3 = c28655q5;
                                    } else {
                                        c2314t2 = c2314t;
                                        c0209i6 = c0209i2;
                                        c0209i7 = c0209i;
                                        c0209i8 = c0209i4;
                                        c28655q4.m87150e0(-998874662);
                                        float f13 = 1;
                                        z14 = false;
                                        AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f13 * 8, f13, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                        C28655q c28655q6 = c28655q4;
                                        c28655q6.m87173q(false);
                                        c28655q3 = c28655q6;
                                    }
                                    c28655q3.m87173q(z14);
                                    z13 = z14;
                                    c28655q2 = c28655q3;
                                } else {
                                    function5 = function5;
                                    c2306l2 = c2306l2;
                                    c0209i5 = c0209i5;
                                    c0213j = c0213j;
                                    c2314t2 = c2314t;
                                    c0209i6 = c0209i2;
                                    c0209i7 = c0209i;
                                    c0209i8 = c0209i4;
                                    z13 = false;
                                    modifier4 = modifier4;
                                    obj2 = obj2;
                                    c22949e = c22949e;
                                    interfaceC4339a5 = interfaceC4339a5;
                                    c23000t2 = c23000t2;
                                    c28655q4.m87150e0(-998457712);
                                    if (goalSectionItemState.getUseHeaderDividerV2()) {
                                        c28655q4.m87150e0(-998368029);
                                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                        C28655q c28655q7 = c28655q4;
                                        c28655q7.m87173q(false);
                                        c28655q = c28655q7;
                                    } else {
                                        c28655q4.m87150e0(-998177627);
                                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                        C28655q c28655q8 = c28655q4;
                                        c28655q8.m87173q(false);
                                        c28655q = c28655q8;
                                    }
                                    c28655q.m87173q(false);
                                    c28655q2 = c28655q;
                                }
                                c28655q2.m87173q(z13);
                                r15 = z13;
                                r14 = c28655q2;
                            }
                            r14.m87173q(true);
                            if (!goalSectionItemState.getDisplayHeaderDivider() || goalSectionItemState.getUseHeaderDividerV2()) {
                                r14.m87150e0(991675841);
                                r14.m87173q(r15);
                            } else {
                                r14.m87150e0(991608571);
                                AbstractC22953f.m66715b(r14, c23000t2.mo66772c(c2314t2, true, 1.0f));
                                r14.m87173q(r15);
                            }
                            boolean zM87157i = r14.m87157i(goalSectionItemState);
                            i19 = i28 & 896;
                            if (i19 == 256) {
                                r16 = 1;
                            } else {
                                r16 = r15;
                            }
                            i24 = (zM87157i ? 1 : 0) | r16;
                            objM87133R = r14.m87133R();
                            if (i24 == 0) {
                                obj3 = obj2;
                                if (objM87133R == obj3) {
                                    function6 = function5;
                                    obj4 = objM87133R;
                                }
                                c2314t3 = c2314t2;
                                Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                                c22949e2 = c22949e;
                                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                                iHashCode4 = Long.hashCode(r14.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = r14.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(r14, modifierM44101d);
                                r14.m87158i0();
                                if (r14.f115903S) {
                                    c0213j2 = c0213j;
                                    r14.m87163l(c0213j2);
                                } else {
                                    c0213j2 = c0213j;
                                    r14.m87178s0();
                                }
                                c0209i9 = c0209i7;
                                AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a3);
                                C0209i c0209i16 = c0209i6;
                                AbstractC28683x.m87239G(r14, c0209i16, interfaceC28653p1M87165m4);
                                if (r14.f115903S && AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode4))) {
                                    c0209i10 = c0209i5;
                                } else {
                                    c0209i10 = c0209i5;
                                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                                }
                                C0209i c0209i17 = c0209i8;
                                AbstractC28683x.m87239G(r14, c0209i17, modifierM118962N4);
                                if (goalSectionItemState.getActionText() != null) {
                                    r14.m87150e0(1689087092);
                                    ?? r28 = r14;
                                    i25 = i19;
                                    function7 = function6;
                                    c0209i12 = c0209i9;
                                    c22949e3 = c22949e2;
                                    c2314t4 = c2314t3;
                                    c0213j3 = c0213j2;
                                    c0209i11 = c0209i10;
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r28, 0, C2886a.f11498d << 18, 196602);
                                    ?? r112 = r28;
                                    r112.m87173q(false);
                                    r17 = r112;
                                } else {
                                    i25 = i19;
                                    c0209i11 = c0209i10;
                                    function7 = function6;
                                    c0213j3 = c0213j2;
                                    c0209i12 = c0209i9;
                                    c2314t4 = c2314t3;
                                    ?? r113 = r15;
                                    c22949e3 = c22949e2;
                                    r14.m87150e0(1689235644);
                                    r14.m87173q(r113);
                                    r17 = r14;
                                }
                                if (goalSectionItemState.getIcon() != null) {
                                    r17.m87150e0(1689305363);
                                    float f14 = 4;
                                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f14, c2314t4));
                                    ?? r29 = r17;
                                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f14, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r29, 384, 0);
                                    ?? r114 = r29;
                                    r114.m87173q(false);
                                    r18 = r114;
                                } else {
                                    r17.m87150e0(1689744540);
                                    r17.m87173q(false);
                                    r18 = r17;
                                }
                                r18.m87173q(true);
                                r18.m87173q(true);
                                if (goalSectionItemState.getSubTitle() == null && AbstractC8693b.m21270d(goalSectionItemState.getSubTitle())) {
                                    r18.m87150e0(1614409493);
                                    C2306l c2306l3 = c2306l2;
                                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e3, c2306l3, r18, 48);
                                    int iHashCode6 = Long.hashCode(r18.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m5 = r18.m87165m();
                                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(r18, c2314t4);
                                    r18.m87158i0();
                                    if (r18.f115903S) {
                                        r18.m87163l(c0213j3);
                                    } else {
                                        r18.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(r18, c0209i12, c22994r1M66759a4);
                                    AbstractC28683x.m87239G(r18, c0209i16, interfaceC28653p1M87165m5);
                                    if (r18.f115903S || !AbstractC22676k.m65745e(r18.m87133R(), Integer.valueOf(iHashCode6))) {
                                        AbstractC11266d.m30471y(iHashCode6, r18, iHashCode6, c0209i11);
                                    }
                                    AbstractC28683x.m87239G(r18, c0209i17, modifierM118962N5);
                                    ?? r210 = r18;
                                    c2306l = c2306l3;
                                    i26 = 48;
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getSubTitle(), r18, TextResource.$stable), null, C38072d.f163053a.m121949b(r18, C38072d.f163054b).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getB1(), null, r210, 0, C2886a.f11498d << 18, 196602);
                                    ?? r115 = r210;
                                    r115.m87173q(true);
                                    AbstractC31061c.m95650z(1, 8, c2314t4, r115, false);
                                    r19 = r115;
                                } else {
                                    c2306l = c2306l2;
                                    i26 = 48;
                                    r18.m87150e0(1614693949);
                                    r18.m87173q(false);
                                    r19 = r18;
                                }
                                r19.m87150e0(-502100598);
                                for (InterfaceC25312u interfaceC25312u : goalSectionItemState.m133581h()) {
                                    Modifier modifier6 = modifier4;
                                    AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier6)));
                                    objM87133R2 = r19.m87133R();
                                    obj8 = obj3;
                                    if (objM87133R2 == obj8) {
                                        obj9 = objM87133R2;
                                        C40893d c40893d2 = new C40893d(16);
                                        r19.m87172p0(c40893d2);
                                        obj9 = c40893d2;
                                    }
                                    obj9 = objM87133R2;
                                    C25307p c25307pM74306g = p720m91.Function1.m74306g((Function1) obj9);
                                    i27 = i25;
                                    if (i27 == 256) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    objM87133R3 = r19.m87133R();
                                    if (!z16 || objM87133R3 == obj8) {
                                        function8 = function7;
                                        objM87133R3 = new C41067a(function8, 1);
                                        r19.m87172p0(objM87133R3);
                                    } else {
                                        function8 = function7;
                                    }
                                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                                    modifier4 = modifier6;
                                    i25 = i27;
                                    obj3 = obj8;
                                    function7 = function8;
                                }
                                Function1 function9 = function7;
                                Modifier modifier7 = modifier4;
                                obj5 = obj3;
                                r19.m87173q(false);
                                if (goalSectionItemState.getCallout() != null || AbstractC22676k.m65745e(goalSectionItemState.getCallout(), AbstractC8693b.m21267a())) {
                                    r19.m87150e0(1615423069);
                                    r19.m87173q(false);
                                } else {
                                    r19.m87150e0(1615354838);
                                    AbstractC31061c.m95650z((float) 1.5d, 8, c2314t4, r19, false);
                                }
                                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t4);
                                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                                iHashCode5 = Long.hashCode(r19.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m6 = r19.m87165m();
                                Modifier modifierM118962N6 = AbstractC37056f.m118962N(r19, modifierM3409f2);
                                InterfaceC0221l.f734a.getClass();
                                c0213j4 = C0217k.f724b;
                                r19.m87158i0();
                                if (r19.f115903S) {
                                    r19.m87163l(c0213j4);
                                } else {
                                    r19.m87178s0();
                                }
                                c0209i13 = C0217k.f729g;
                                AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a5);
                                C0209i c0209i18 = C0217k.f728f;
                                AbstractC28683x.m87239G(r19, c0209i18, interfaceC28653p1M87165m6);
                                c0209i14 = C0217k.f732j;
                                if (r19.f115903S || !AbstractC22676k.m65745e(r19.m87133R(), Integer.valueOf(iHashCode5))) {
                                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                                }
                                C0209i c0209i19 = C0217k.f726d;
                                AbstractC28683x.m87239G(r19, c0209i19, modifierM118962N6);
                                if (goalSectionItemState.getCallout() != null || AbstractC22676k.m65745e(goalSectionItemState.getCallout(), AbstractC8693b.m21267a())) {
                                    c0213j5 = c0213j4;
                                    c0209i15 = c0209i13;
                                    obj6 = obj5;
                                    c23000t3 = c23000t2;
                                    r19.m87150e0(637182520);
                                    r19.m87173q(false);
                                    r110 = r19;
                                } else {
                                    r19.m87150e0(636695293);
                                    C23000t1 c23000t4 = c23000t2;
                                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c23000t4.mo66772c(c2314t4, true, 3.0f));
                                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, r19, i26);
                                    int iHashCode7 = Long.hashCode(r19.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m7 = r19.m87165m();
                                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(r19, modifierM3409f3);
                                    r19.m87158i0();
                                    if (r19.f115903S) {
                                        r19.m87163l(c0213j4);
                                    } else {
                                        r19.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(r19, c0209i13, c23010xM66775a2);
                                    AbstractC28683x.m87239G(r19, c0209i18, interfaceC28653p1M87165m7);
                                    if (r19.f115903S || !AbstractC22676k.m65745e(r19.m87133R(), Integer.valueOf(iHashCode7))) {
                                        AbstractC11266d.m30471y(iHashCode7, r19, iHashCode7, c0209i14);
                                    }
                                    AbstractC28683x.m87239G(r19, c0209i19, modifierM118962N7);
                                    String strM21274h = AbstractC8693b.m21274h(goalSectionItemState.getCallout(), r19, TextResource.$stable);
                                    ?? r116 = C38072d.f163053a;
                                    int i34 = C38072d.f163054b;
                                    ?? r211 = r19;
                                    c0209i15 = c0209i13;
                                    c23000t3 = c23000t4;
                                    c0213j5 = c0213j4;
                                    obj6 = obj5;
                                    AbstractC30795n.m94707h(strM21274h, null, r116.m121949b(r19, i34).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r116.m121952e(r19, i34).getB2(), null, r211, 0, C2886a.f11498d << 18, 196602);
                                    ?? r117 = r211;
                                    r117.m87173q(true);
                                    r117.m87173q(false);
                                    r110 = r117;
                                }
                                if (goalSectionItemState.getLinkText() != null || AbstractC22676k.m65745e(goalSectionItemState.getLinkText(), AbstractC8693b.m21267a())) {
                                    interfaceC4339a6 = interfaceC4339a5;
                                    z15 = true;
                                    r110.m87150e0(637966386);
                                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                    r110.m87173q(false);
                                    r111 = r110;
                                } else {
                                    r110.m87150e0(637314394);
                                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, r110, 48);
                                    int iHashCode8 = Long.hashCode(r110.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m8 = r110.m87165m();
                                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(r110, modifierM3409f4);
                                    r110.m87158i0();
                                    if (r110.f115903S) {
                                        r110.m87163l(c0213j5);
                                    } else {
                                        r110.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(r110, c0209i15, c23010xM66775a3);
                                    AbstractC28683x.m87239G(r110, c0209i18, interfaceC28653p1M87165m8);
                                    if (r110.f115903S || !AbstractC22676k.m65745e(r110.m87133R(), Integer.valueOf(iHashCode8))) {
                                        AbstractC11266d.m30471y(iHashCode8, r110, iHashCode8, c0209i14);
                                    }
                                    AbstractC28683x.m87239G(r110, c0209i19, modifierM118962N8);
                                    Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t4, 1 * 8, 0.0f, 2);
                                    EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                                    TextResource linkText = goalSectionItemState.getLinkText();
                                    C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, false ? 1 : 0);
                                    boolean z17 = (i28 & 7168) == 2048;
                                    Object objM87133R6 = r110.m87133R();
                                    if (z17 || objM87133R6 == obj6) {
                                        interfaceC4339a6 = interfaceC4339a5;
                                        C29616a c29616a = new C29616a(interfaceC4339a6, 27);
                                        r110.m87172p0(c29616a);
                                        obj7 = c29616a;
                                    } else {
                                        interfaceC4339a6 = interfaceC4339a5;
                                        obj7 = objM87133R6;
                                    }
                                    ?? r118 = r110;
                                    AbstractC27265l0.m82217i(modifierM3392n, enumC27269n0, linkText, null, c39274g, false, null, null, false, false, null, null, (Function1) obj7, r118, (TextResource.$stable << 6) | 54 | (C39274g.f168929c << 12), 0, 4072);
                                    ?? r119 = r118;
                                    z15 = true;
                                    r119.m87173q(true);
                                    r119.m87173q(false);
                                    r111 = r119;
                                }
                                r111.m87173q(z15);
                                r111.m87173q(z15);
                                interfaceC4339a3 = interfaceC4339a6;
                                function3 = function9;
                                modifier3 = modifier7;
                                r10 = r111;
                            } else {
                                obj3 = obj2;
                            }
                            function6 = function5;
                            C39689b c39689b = new C39689b(goalSectionItemState, function6, 26);
                            r14.m87172p0(c39689b);
                            obj4 = c39689b;
                            c2314t3 = c2314t2;
                            Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                            c22949e2 = c22949e;
                            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                            iHashCode4 = Long.hashCode(r14.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = r14.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(r14, modifierM44101d2);
                            r14.m87158i0();
                            if (r14.f115903S) {
                                c0213j2 = c0213j;
                                r14.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                r14.m87178s0();
                            }
                            c0209i9 = c0209i7;
                            AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a6);
                            C0209i c0209i110 = c0209i6;
                            AbstractC28683x.m87239G(r14, c0209i110, interfaceC28653p1M87165m9);
                            if (r14.f115903S) {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            } else {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            }
                            C0209i c0209i111 = c0209i8;
                            AbstractC28683x.m87239G(r14, c0209i111, modifierM118962N9);
                            if (goalSectionItemState.getActionText() != null) {
                                r14.m87150e0(1689087092);
                                ?? r212 = r14;
                                i25 = i19;
                                function7 = function6;
                                c0209i12 = c0209i9;
                                c22949e3 = c22949e2;
                                c2314t4 = c2314t3;
                                c0213j3 = c0213j2;
                                c0209i11 = c0209i10;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r212, 0, C2886a.f11498d << 18, 196602);
                                ?? r1110 = r212;
                                r1110.m87173q(false);
                                r17 = r1110;
                            } else {
                                i25 = i19;
                                c0209i11 = c0209i10;
                                function7 = function6;
                                c0213j3 = c0213j2;
                                c0209i12 = c0209i9;
                                c2314t4 = c2314t3;
                                ?? r1111 = r15;
                                c22949e3 = c22949e2;
                                r14.m87150e0(1689235644);
                                r14.m87173q(r1111);
                                r17 = r14;
                            }
                            if (goalSectionItemState.getIcon() != null) {
                                r17.m87150e0(1689305363);
                                float f15 = 4;
                                AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f15, c2314t4));
                                ?? r213 = r17;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f15, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r213, 384, 0);
                                ?? r1112 = r213;
                                r1112.m87173q(false);
                                r18 = r1112;
                            } else {
                                r17.m87150e0(1689744540);
                                r17.m87173q(false);
                                r18 = r17;
                            }
                            r18.m87173q(true);
                            r18.m87173q(true);
                            if (goalSectionItemState.getSubTitle() == null) {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            } else {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            }
                            r19.m87150e0(-502100598);
                            while (r2.hasNext()) {
                                Modifier modifier8 = modifier4;
                                AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier8)));
                                objM87133R2 = r19.m87133R();
                                obj8 = obj3;
                                if (objM87133R2 == obj8) {
                                    obj9 = objM87133R2;
                                    C40893d c40893d3 = new C40893d(16);
                                    r19.m87172p0(c40893d3);
                                    obj9 = c40893d3;
                                }
                                obj9 = objM87133R2;
                                C25307p c25307pM74306g2 = p720m91.Function1.m74306g((Function1) obj9);
                                i27 = i25;
                                if (i27 == 256) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R3 = r19.m87133R();
                                if (z16) {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                } else {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                }
                                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g2, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                                modifier4 = modifier8;
                                i25 = i27;
                                obj3 = obj8;
                                function7 = function8;
                            }
                            Function1 function10 = function7;
                            Modifier modifier9 = modifier4;
                            obj5 = obj3;
                            r19.m87173q(false);
                            if (goalSectionItemState.getCallout() != null) {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            } else {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            }
                            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t4);
                            C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                            iHashCode5 = Long.hashCode(r19.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = r19.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(r19, modifierM3409f5);
                            InterfaceC0221l.f734a.getClass();
                            c0213j4 = C0217k.f724b;
                            r19.m87158i0();
                            if (r19.f115903S) {
                                r19.m87163l(c0213j4);
                            } else {
                                r19.m87178s0();
                            }
                            c0209i13 = C0217k.f729g;
                            AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a7);
                            C0209i c0209i112 = C0217k.f728f;
                            AbstractC28683x.m87239G(r19, c0209i112, interfaceC28653p1M87165m10);
                            c0209i14 = C0217k.f732j;
                            if (r19.f115903S) {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            } else {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            }
                            C0209i c0209i113 = C0217k.f726d;
                            AbstractC28683x.m87239G(r19, c0209i113, modifierM118962N10);
                            if (goalSectionItemState.getCallout() != null) {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            } else {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            }
                            if (goalSectionItemState.getLinkText() != null) {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            } else {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            }
                            r111.m87173q(z15);
                            r111.m87173q(z15);
                            interfaceC4339a3 = interfaceC4339a6;
                            function3 = function10;
                            modifier3 = modifier9;
                            r10 = r111;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                        C22949e c22949e5 = AbstractC22977m.f90650a;
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e5, c2306l2, c28655q4, 48);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                        interfaceC4339a5 = interfaceC4339a4;
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a8);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11);
                        if (c28655q4.f115903S) {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        } else {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11);
                        titleImage = goalSectionItemState.getTitleImage();
                        c23000t1 = C23000t1.f90727a;
                        if (titleImage == null) {
                            modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                        } else {
                            modifierMo66772c = c2314t;
                        }
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e5, c2306l2, c28655q4, 48);
                        Modifier modifier10 = modifierMo66772c;
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                        c22949e = c22949e5;
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifier10);
                        c28655q4.m87158i0();
                        c23000t2 = c23000t1;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a9);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m12);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N12);
                        if (goalSectionItemState.getTitleImage() != null) {
                            c28655q4.m87150e0(-999861702);
                            AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                            c28655q4.m87173q(false);
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            r15 = 0;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            r14 = c28655q4;
                        } else {
                            c28655q4.m87150e0(-999578641);
                            if (goalSectionItemState.getDisplayHeaderDivider()) {
                                c28655q4.m87150e0(-999527615);
                                if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                    c28655q4.m87150e0(-999377141);
                                    c0209i8 = c0209i4;
                                    c2314t2 = c2314t;
                                    c0209i6 = c0209i2;
                                    c0209i7 = c0209i;
                                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                    C28655q c28655q9 = c28655q4;
                                    AbstractC31061c.m95650z(7, 4, c2314t2, c28655q9, false);
                                    z14 = false;
                                    c28655q3 = c28655q9;
                                } else {
                                    c2314t2 = c2314t;
                                    c0209i6 = c0209i2;
                                    c0209i7 = c0209i;
                                    c0209i8 = c0209i4;
                                    c28655q4.m87150e0(-998874662);
                                    float f16 = 1;
                                    z14 = false;
                                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f16 * 8, f16, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                    C28655q c28655q10 = c28655q4;
                                    c28655q10.m87173q(false);
                                    c28655q3 = c28655q10;
                                }
                                c28655q3.m87173q(z14);
                                z13 = z14;
                                c28655q2 = c28655q3;
                            } else {
                                function5 = function5;
                                c2306l2 = c2306l2;
                                c0209i5 = c0209i5;
                                c0213j = c0213j;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                z13 = false;
                                modifier4 = modifier4;
                                obj2 = obj2;
                                c22949e = c22949e;
                                interfaceC4339a5 = interfaceC4339a5;
                                c23000t2 = c23000t2;
                                c28655q4.m87150e0(-998457712);
                                if (goalSectionItemState.getUseHeaderDividerV2()) {
                                    c28655q4.m87150e0(-998368029);
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                    C28655q c28655q11 = c28655q4;
                                    c28655q11.m87173q(false);
                                    c28655q = c28655q11;
                                } else {
                                    c28655q4.m87150e0(-998177627);
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                    C28655q c28655q12 = c28655q4;
                                    c28655q12.m87173q(false);
                                    c28655q = c28655q12;
                                }
                                c28655q.m87173q(false);
                                c28655q2 = c28655q;
                            }
                            c28655q2.m87173q(z13);
                            r15 = z13;
                            r14 = c28655q2;
                        }
                        r14.m87173q(true);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            r14.m87150e0(991675841);
                            r14.m87173q(r15);
                        } else {
                            r14.m87150e0(991675841);
                            r14.m87173q(r15);
                        }
                        boolean zM87157i2 = r14.m87157i(goalSectionItemState);
                        i19 = i28 & 896;
                        if (i19 == 256) {
                            r16 = 1;
                        } else {
                            r16 = r15;
                        }
                        i24 = (zM87157i2 ? 1 : 0) | r16;
                        objM87133R = r14.m87133R();
                        if (i24 == 0) {
                            obj3 = obj2;
                            if (objM87133R == obj3) {
                                function6 = function5;
                                obj4 = objM87133R;
                            }
                            c2314t3 = c2314t2;
                            Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                            c22949e2 = c22949e;
                            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                            iHashCode4 = Long.hashCode(r14.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = r14.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(r14, modifierM44101d3);
                            r14.m87158i0();
                            if (r14.f115903S) {
                                c0213j2 = c0213j;
                                r14.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                r14.m87178s0();
                            }
                            c0209i9 = c0209i7;
                            AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a10);
                            C0209i c0209i114 = c0209i6;
                            AbstractC28683x.m87239G(r14, c0209i114, interfaceC28653p1M87165m13);
                            if (r14.f115903S) {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            } else {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            }
                            C0209i c0209i115 = c0209i8;
                            AbstractC28683x.m87239G(r14, c0209i115, modifierM118962N13);
                            if (goalSectionItemState.getActionText() != null) {
                                r14.m87150e0(1689087092);
                                ?? r214 = r14;
                                i25 = i19;
                                function7 = function6;
                                c0209i12 = c0209i9;
                                c22949e3 = c22949e2;
                                c2314t4 = c2314t3;
                                c0213j3 = c0213j2;
                                c0209i11 = c0209i10;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r214, 0, C2886a.f11498d << 18, 196602);
                                ?? r1113 = r214;
                                r1113.m87173q(false);
                                r17 = r1113;
                            } else {
                                i25 = i19;
                                c0209i11 = c0209i10;
                                function7 = function6;
                                c0213j3 = c0213j2;
                                c0209i12 = c0209i9;
                                c2314t4 = c2314t3;
                                ?? r1114 = r15;
                                c22949e3 = c22949e2;
                                r14.m87150e0(1689235644);
                                r14.m87173q(r1114);
                                r17 = r14;
                            }
                            if (goalSectionItemState.getIcon() != null) {
                                r17.m87150e0(1689305363);
                                float f17 = 4;
                                AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f17, c2314t4));
                                ?? r215 = r17;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f17, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r215, 384, 0);
                                ?? r1115 = r215;
                                r1115.m87173q(false);
                                r18 = r1115;
                            } else {
                                r17.m87150e0(1689744540);
                                r17.m87173q(false);
                                r18 = r17;
                            }
                            r18.m87173q(true);
                            r18.m87173q(true);
                            if (goalSectionItemState.getSubTitle() == null) {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            } else {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            }
                            r19.m87150e0(-502100598);
                            while (r2.hasNext()) {
                                Modifier modifier11 = modifier4;
                                AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier11)));
                                objM87133R2 = r19.m87133R();
                                obj8 = obj3;
                                if (objM87133R2 == obj8) {
                                    obj9 = objM87133R2;
                                    C40893d c40893d4 = new C40893d(16);
                                    r19.m87172p0(c40893d4);
                                    obj9 = c40893d4;
                                }
                                obj9 = objM87133R2;
                                C25307p c25307pM74306g3 = p720m91.Function1.m74306g((Function1) obj9);
                                i27 = i25;
                                if (i27 == 256) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R3 = r19.m87133R();
                                if (z16) {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                } else {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                }
                                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g3, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                                modifier4 = modifier11;
                                i25 = i27;
                                obj3 = obj8;
                                function7 = function8;
                            }
                            Function1 function11 = function7;
                            Modifier modifier12 = modifier4;
                            obj5 = obj3;
                            r19.m87173q(false);
                            if (goalSectionItemState.getCallout() != null) {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            } else {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            }
                            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t4);
                            C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                            iHashCode5 = Long.hashCode(r19.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m14 = r19.m87165m();
                            Modifier modifierM118962N14 = AbstractC37056f.m118962N(r19, modifierM3409f6);
                            InterfaceC0221l.f734a.getClass();
                            c0213j4 = C0217k.f724b;
                            r19.m87158i0();
                            if (r19.f115903S) {
                                r19.m87163l(c0213j4);
                            } else {
                                r19.m87178s0();
                            }
                            c0209i13 = C0217k.f729g;
                            AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a11);
                            C0209i c0209i116 = C0217k.f728f;
                            AbstractC28683x.m87239G(r19, c0209i116, interfaceC28653p1M87165m14);
                            c0209i14 = C0217k.f732j;
                            if (r19.f115903S) {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            } else {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            }
                            C0209i c0209i117 = C0217k.f726d;
                            AbstractC28683x.m87239G(r19, c0209i117, modifierM118962N14);
                            if (goalSectionItemState.getCallout() != null) {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            } else {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            }
                            if (goalSectionItemState.getLinkText() != null) {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            } else {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            }
                            r111.m87173q(z15);
                            r111.m87173q(z15);
                            interfaceC4339a3 = interfaceC4339a6;
                            function3 = function11;
                            modifier3 = modifier12;
                            r10 = r111;
                        } else {
                            obj3 = obj2;
                        }
                        function6 = function5;
                        C39689b c39689b2 = new C39689b(goalSectionItemState, function6, 26);
                        r14.m87172p0(c39689b2);
                        obj4 = c39689b2;
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = r14.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(r14, modifierM44101d4);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a12);
                        C0209i c0209i118 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i118, interfaceC28653p1M87165m15);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i119 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i119, modifierM118962N15);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r216 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r216, 0, C2886a.f11498d << 18, 196602);
                            ?? r1116 = r216;
                            r1116.m87173q(false);
                            r17 = r1116;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r1117 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r1117);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f18 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f18, c2314t4));
                            ?? r217 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f18, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r217, 384, 0);
                            ?? r1118 = r217;
                            r1118.m87173q(false);
                            r18 = r1118;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier13 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier13)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d5 = new C40893d(16);
                                r19.m87172p0(c40893d5);
                                obj9 = c40893d5;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g4 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g4, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier13;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function12 = function7;
                        Modifier modifier14 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = r19.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(r19, modifierM3409f7);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a13);
                        C0209i c0209i1110 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i1110, interfaceC28653p1M87165m16);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i1111 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i1111, modifierM118962N16);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function12;
                        modifier3 = modifier14;
                        r10 = r111;
                    } else {
                        c28655q4.m87138X();
                        modifier3 = modifier2;
                        function3 = function2;
                        interfaceC4339a3 = interfaceC4339a2;
                        r10 = c28655q4;
                    }
                    c28677v1M87180u = r10.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36891k(goalSectionItemState, modifier3, function3, interfaceC4339a3, i13, i14, 22);
                    }
                }
                i28 |= 3072;
                interfaceC4339a2 = interfaceC4339a;
                if ((i28 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q4.m87135U(i28 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    obj = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == obj) {
                            obj11 = objM87133R5;
                            C40893d c40893d6 = new C40893d(15);
                            c28655q4.m87172p0(c40893d6);
                            obj11 = c40893d6;
                        }
                        obj11 = objM87133R5;
                        function4 = (Function1) obj11;
                    } else {
                        function4 = function2;
                    }
                    if (i17 != 0) {
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == obj) {
                            obj10 = objM87133R4;
                            C40674e0 c40674e1 = new C40674e0(14);
                            c28655q4.m87172p0(c40674e1);
                            obj10 = c40674e1;
                        }
                        obj10 = objM87133R4;
                        interfaceC4339a4 = (InterfaceC4339a) obj10;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    id4 = goalSectionItemState.getId();
                    if (id4 != null) {
                        String lowerCase2 = id4.toLowerCase(Locale.ROOT);
                        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                        strConcat = lowerCase2.concat("_edit_button");
                    } else {
                        strConcat = null;
                    }
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q4.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q4, modifierM3409f8);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    modifier4 = modifier2;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a4);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m17);
                    c0209i3 = C0217k.f732j;
                    function5 = function4;
                    if (c28655q4.f115903S) {
                        obj2 = obj;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N17);
                        C22949e c22949e6 = AbstractC22977m.f90650a;
                        C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(c22949e6, c2306l2, c28655q4, 48);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q4.m87165m();
                        interfaceC4339a5 = interfaceC4339a4;
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a14);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m18);
                        if (c28655q4.f115903S) {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        } else {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N18);
                        titleImage = goalSectionItemState.getTitleImage();
                        c23000t1 = C23000t1.f90727a;
                        if (titleImage == null) {
                            modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                        } else {
                            modifierMo66772c = c2314t;
                        }
                        C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(c22949e6, c2306l2, c28655q4, 48);
                        Modifier modifier15 = modifierMo66772c;
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q4.m87165m();
                        c22949e = c22949e6;
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q4, modifier15);
                        c28655q4.m87158i0();
                        c23000t2 = c23000t1;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a15);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m19);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N19);
                        if (goalSectionItemState.getTitleImage() != null) {
                            c28655q4.m87150e0(-999861702);
                            AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                            c28655q4.m87173q(false);
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            r15 = 0;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            r14 = c28655q4;
                        } else {
                            c28655q4.m87150e0(-999578641);
                            if (goalSectionItemState.getDisplayHeaderDivider()) {
                                c28655q4.m87150e0(-999527615);
                                if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                    c28655q4.m87150e0(-999377141);
                                    c0209i8 = c0209i4;
                                    c2314t2 = c2314t;
                                    c0209i6 = c0209i2;
                                    c0209i7 = c0209i;
                                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                    C28655q c28655q13 = c28655q4;
                                    AbstractC31061c.m95650z(7, 4, c2314t2, c28655q13, false);
                                    z14 = false;
                                    c28655q3 = c28655q13;
                                } else {
                                    c2314t2 = c2314t;
                                    c0209i6 = c0209i2;
                                    c0209i7 = c0209i;
                                    c0209i8 = c0209i4;
                                    c28655q4.m87150e0(-998874662);
                                    float f19 = 1;
                                    z14 = false;
                                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f19 * 8, f19, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                    C28655q c28655q14 = c28655q4;
                                    c28655q14.m87173q(false);
                                    c28655q3 = c28655q14;
                                }
                                c28655q3.m87173q(z14);
                                z13 = z14;
                                c28655q2 = c28655q3;
                            } else {
                                function5 = function5;
                                c2306l2 = c2306l2;
                                c0209i5 = c0209i5;
                                c0213j = c0213j;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                z13 = false;
                                modifier4 = modifier4;
                                obj2 = obj2;
                                c22949e = c22949e;
                                interfaceC4339a5 = interfaceC4339a5;
                                c23000t2 = c23000t2;
                                c28655q4.m87150e0(-998457712);
                                if (goalSectionItemState.getUseHeaderDividerV2()) {
                                    c28655q4.m87150e0(-998368029);
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                    C28655q c28655q15 = c28655q4;
                                    c28655q15.m87173q(false);
                                    c28655q = c28655q15;
                                } else {
                                    c28655q4.m87150e0(-998177627);
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                    C28655q c28655q16 = c28655q4;
                                    c28655q16.m87173q(false);
                                    c28655q = c28655q16;
                                }
                                c28655q.m87173q(false);
                                c28655q2 = c28655q;
                            }
                            c28655q2.m87173q(z13);
                            r15 = z13;
                            r14 = c28655q2;
                        }
                        r14.m87173q(true);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            r14.m87150e0(991675841);
                            r14.m87173q(r15);
                        } else {
                            r14.m87150e0(991675841);
                            r14.m87173q(r15);
                        }
                        boolean zM87157i3 = r14.m87157i(goalSectionItemState);
                        i19 = i28 & 896;
                        if (i19 == 256) {
                            r16 = 1;
                        } else {
                            r16 = r15;
                        }
                        i24 = (zM87157i3 ? 1 : 0) | r16;
                        objM87133R = r14.m87133R();
                        if (i24 == 0) {
                            obj3 = obj2;
                            if (objM87133R == obj3) {
                                function6 = function5;
                                obj4 = objM87133R;
                            }
                            c2314t3 = c2314t2;
                            Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                            c22949e2 = c22949e;
                            C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                            iHashCode4 = Long.hashCode(r14.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m110 = r14.m87165m();
                            Modifier modifierM118962N110 = AbstractC37056f.m118962N(r14, modifierM44101d5);
                            r14.m87158i0();
                            if (r14.f115903S) {
                                c0213j2 = c0213j;
                                r14.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                r14.m87178s0();
                            }
                            c0209i9 = c0209i7;
                            AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a16);
                            C0209i c0209i1112 = c0209i6;
                            AbstractC28683x.m87239G(r14, c0209i1112, interfaceC28653p1M87165m110);
                            if (r14.f115903S) {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            } else {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            }
                            C0209i c0209i1113 = c0209i8;
                            AbstractC28683x.m87239G(r14, c0209i1113, modifierM118962N110);
                            if (goalSectionItemState.getActionText() != null) {
                                r14.m87150e0(1689087092);
                                ?? r218 = r14;
                                i25 = i19;
                                function7 = function6;
                                c0209i12 = c0209i9;
                                c22949e3 = c22949e2;
                                c2314t4 = c2314t3;
                                c0213j3 = c0213j2;
                                c0209i11 = c0209i10;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r218, 0, C2886a.f11498d << 18, 196602);
                                ?? r1119 = r218;
                                r1119.m87173q(false);
                                r17 = r1119;
                            } else {
                                i25 = i19;
                                c0209i11 = c0209i10;
                                function7 = function6;
                                c0213j3 = c0213j2;
                                c0209i12 = c0209i9;
                                c2314t4 = c2314t3;
                                ?? r11110 = r15;
                                c22949e3 = c22949e2;
                                r14.m87150e0(1689235644);
                                r14.m87173q(r11110);
                                r17 = r14;
                            }
                            if (goalSectionItemState.getIcon() != null) {
                                r17.m87150e0(1689305363);
                                float f110 = 4;
                                AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f110, c2314t4));
                                ?? r219 = r17;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f110, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r219, 384, 0);
                                ?? r11111 = r219;
                                r11111.m87173q(false);
                                r18 = r11111;
                            } else {
                                r17.m87150e0(1689744540);
                                r17.m87173q(false);
                                r18 = r17;
                            }
                            r18.m87173q(true);
                            r18.m87173q(true);
                            if (goalSectionItemState.getSubTitle() == null) {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            } else {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            }
                            r19.m87150e0(-502100598);
                            while (r2.hasNext()) {
                                Modifier modifier16 = modifier4;
                                AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier16)));
                                objM87133R2 = r19.m87133R();
                                obj8 = obj3;
                                if (objM87133R2 == obj8) {
                                    obj9 = objM87133R2;
                                    C40893d c40893d7 = new C40893d(16);
                                    r19.m87172p0(c40893d7);
                                    obj9 = c40893d7;
                                }
                                obj9 = objM87133R2;
                                C25307p c25307pM74306g5 = p720m91.Function1.m74306g((Function1) obj9);
                                i27 = i25;
                                if (i27 == 256) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R3 = r19.m87133R();
                                if (z16) {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                } else {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                }
                                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g5, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                                modifier4 = modifier16;
                                i25 = i27;
                                obj3 = obj8;
                                function7 = function8;
                            }
                            Function1 function13 = function7;
                            Modifier modifier17 = modifier4;
                            obj5 = obj3;
                            r19.m87173q(false);
                            if (goalSectionItemState.getCallout() != null) {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            } else {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            }
                            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t4);
                            C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                            iHashCode5 = Long.hashCode(r19.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111 = r19.m87165m();
                            Modifier modifierM118962N111 = AbstractC37056f.m118962N(r19, modifierM3409f9);
                            InterfaceC0221l.f734a.getClass();
                            c0213j4 = C0217k.f724b;
                            r19.m87158i0();
                            if (r19.f115903S) {
                                r19.m87163l(c0213j4);
                            } else {
                                r19.m87178s0();
                            }
                            c0209i13 = C0217k.f729g;
                            AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a17);
                            C0209i c0209i1114 = C0217k.f728f;
                            AbstractC28683x.m87239G(r19, c0209i1114, interfaceC28653p1M87165m111);
                            c0209i14 = C0217k.f732j;
                            if (r19.f115903S) {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            } else {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            }
                            C0209i c0209i1115 = C0217k.f726d;
                            AbstractC28683x.m87239G(r19, c0209i1115, modifierM118962N111);
                            if (goalSectionItemState.getCallout() != null) {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            } else {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            }
                            if (goalSectionItemState.getLinkText() != null) {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            } else {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            }
                            r111.m87173q(z15);
                            r111.m87173q(z15);
                            interfaceC4339a3 = interfaceC4339a6;
                            function3 = function13;
                            modifier3 = modifier17;
                            r10 = r111;
                        } else {
                            obj3 = obj2;
                        }
                        function6 = function5;
                        C39689b c39689b3 = new C39689b(goalSectionItemState, function6, 26);
                        r14.m87172p0(c39689b3);
                        obj4 = c39689b3;
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m112 = r14.m87165m();
                        Modifier modifierM118962N112 = AbstractC37056f.m118962N(r14, modifierM44101d6);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a18);
                        C0209i c0209i1116 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i1116, interfaceC28653p1M87165m112);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i1117 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i1117, modifierM118962N112);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r2110 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2110, 0, C2886a.f11498d << 18, 196602);
                            ?? r11112 = r2110;
                            r11112.m87173q(false);
                            r17 = r11112;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r11113 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r11113);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f111 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f111, c2314t4));
                            ?? r2111 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f111, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2111, 384, 0);
                            ?? r11114 = r2111;
                            r11114.m87173q(false);
                            r18 = r11114;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier18 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier18)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d8 = new C40893d(16);
                                r19.m87172p0(c40893d8);
                                obj9 = c40893d8;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g6 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g6, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier18;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function14 = function7;
                        Modifier modifier19 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m113 = r19.m87165m();
                        Modifier modifierM118962N113 = AbstractC37056f.m118962N(r19, modifierM3409f10);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a19);
                        C0209i c0209i1118 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i1118, interfaceC28653p1M87165m113);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i1119 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i1119, modifierM118962N113);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function14;
                        modifier3 = modifier19;
                        r10 = r111;
                    } else {
                        obj2 = obj;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N17);
                    C22949e c22949e7 = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(c22949e7, c2306l2, c28655q4, 48);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q4.m87165m();
                    interfaceC4339a5 = interfaceC4339a4;
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m114);
                    if (c28655q4.f115903S) {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N114);
                    titleImage = goalSectionItemState.getTitleImage();
                    c23000t1 = C23000t1.f90727a;
                    if (titleImage == null) {
                        modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                    } else {
                        modifierMo66772c = c2314t;
                    }
                    C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(c22949e7, c2306l2, c28655q4, 48);
                    Modifier modifier110 = modifierMo66772c;
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q4.m87165m();
                    c22949e = c22949e7;
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q4, modifier110);
                    c28655q4.m87158i0();
                    c23000t2 = c23000t1;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m115);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N115);
                    if (goalSectionItemState.getTitleImage() != null) {
                        c28655q4.m87150e0(-999861702);
                        AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                        c28655q4.m87173q(false);
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        r15 = 0;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        r14 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-999578641);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            c28655q4.m87150e0(-999527615);
                            if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                c28655q4.m87150e0(-999377141);
                                c0209i8 = c0209i4;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                C28655q c28655q17 = c28655q4;
                                AbstractC31061c.m95650z(7, 4, c2314t2, c28655q17, false);
                                z14 = false;
                                c28655q3 = c28655q17;
                            } else {
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                c28655q4.m87150e0(-998874662);
                                float f112 = 1;
                                z14 = false;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f112 * 8, f112, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                C28655q c28655q18 = c28655q4;
                                c28655q18.m87173q(false);
                                c28655q3 = c28655q18;
                            }
                            c28655q3.m87173q(z14);
                            z13 = z14;
                            c28655q2 = c28655q3;
                        } else {
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            z13 = false;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            c28655q4.m87150e0(-998457712);
                            if (goalSectionItemState.getUseHeaderDividerV2()) {
                                c28655q4.m87150e0(-998368029);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q19 = c28655q4;
                                c28655q19.m87173q(false);
                                c28655q = c28655q19;
                            } else {
                                c28655q4.m87150e0(-998177627);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q110 = c28655q4;
                                c28655q110.m87173q(false);
                                c28655q = c28655q110;
                            }
                            c28655q.m87173q(false);
                            c28655q2 = c28655q;
                        }
                        c28655q2.m87173q(z13);
                        r15 = z13;
                        r14 = c28655q2;
                    }
                    r14.m87173q(true);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    } else {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    }
                    boolean zM87157i4 = r14.m87157i(goalSectionItemState);
                    i19 = i28 & 896;
                    if (i19 == 256) {
                        r16 = 1;
                    } else {
                        r16 = r15;
                    }
                    i24 = (zM87157i4 ? 1 : 0) | r16;
                    objM87133R = r14.m87133R();
                    if (i24 == 0) {
                        obj3 = obj2;
                        if (objM87133R == obj3) {
                            function6 = function5;
                            obj4 = objM87133R;
                        }
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m116 = r14.m87165m();
                        Modifier modifierM118962N116 = AbstractC37056f.m118962N(r14, modifierM44101d7);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a112);
                        C0209i c0209i11110 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i11110, interfaceC28653p1M87165m116);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i11111 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i11111, modifierM118962N116);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r2112 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2112, 0, C2886a.f11498d << 18, 196602);
                            ?? r11115 = r2112;
                            r11115.m87173q(false);
                            r17 = r11115;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r11116 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r11116);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f113 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f113, c2314t4));
                            ?? r2113 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f113, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2113, 384, 0);
                            ?? r11117 = r2113;
                            r11117.m87173q(false);
                            r18 = r11117;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier111 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier111)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d9 = new C40893d(16);
                                r19.m87172p0(c40893d9);
                                obj9 = c40893d9;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g7 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g7, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier111;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function15 = function7;
                        Modifier modifier112 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = r19.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(r19, modifierM3409f11);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a113);
                        C0209i c0209i11112 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i11112, interfaceC28653p1M87165m117);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i11113 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i11113, modifierM118962N117);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function15;
                        modifier3 = modifier112;
                        r10 = r111;
                    } else {
                        obj3 = obj2;
                    }
                    function6 = function5;
                    C39689b c39689b4 = new C39689b(goalSectionItemState, function6, 26);
                    r14.m87172p0(c39689b4);
                    obj4 = c39689b4;
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d8 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = r14.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(r14, modifierM44101d8);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a114);
                    C0209i c0209i11114 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i11114, interfaceC28653p1M87165m118);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i11115 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i11115, modifierM118962N118);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r2114 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2114, 0, C2886a.f11498d << 18, 196602);
                        ?? r11118 = r2114;
                        r11118.m87173q(false);
                        r17 = r11118;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r11119 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r11119);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f114 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f114, c2314t4));
                        ?? r2115 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f114, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2115, 384, 0);
                        ?? r111110 = r2115;
                        r111110.m87173q(false);
                        r18 = r111110;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier113 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier113)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d10 = new C40893d(16);
                            r19.m87172p0(c40893d10);
                            obj9 = c40893d10;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g8 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g8, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier113;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function16 = function7;
                    Modifier modifier114 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = r19.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(r19, modifierM3409f12);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a115);
                    C0209i c0209i11116 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i11116, interfaceC28653p1M87165m119);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i11117 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i11117, modifierM118962N119);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function16;
                    modifier3 = modifier114;
                    r10 = r111;
                } else {
                    c28655q4.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                    r10 = c28655q4;
                }
                c28677v1M87180u = r10.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k(goalSectionItemState, modifier3, function3, interfaceC4339a3, i13, i14, 22);
                }
            }
            i28 |= 384;
            function2 = function1;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q4.m87157i(interfaceC4339a2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i28 |= i18;
                }
                if ((i28 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q4.m87135U(i28 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    obj = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == obj) {
                            obj11 = objM87133R5;
                            C40893d c40893d11 = new C40893d(15);
                            c28655q4.m87172p0(c40893d11);
                            obj11 = c40893d11;
                        }
                        obj11 = objM87133R5;
                        function4 = (Function1) obj11;
                    } else {
                        function4 = function2;
                    }
                    if (i17 != 0) {
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == obj) {
                            obj10 = objM87133R4;
                            C40674e0 c40674e2 = new C40674e0(14);
                            c28655q4.m87172p0(c40674e2);
                            obj10 = c40674e2;
                        }
                        obj10 = objM87133R4;
                        interfaceC4339a4 = (InterfaceC4339a) obj10;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    id4 = goalSectionItemState.getId();
                    if (id4 != null) {
                        String lowerCase3 = id4.toLowerCase(Locale.ROOT);
                        AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
                        strConcat = lowerCase3.concat("_edit_button");
                    } else {
                        strConcat = null;
                    }
                    Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m120 = c28655q4.m87165m();
                    Modifier modifierM118962N120 = AbstractC37056f.m118962N(c28655q4, modifierM3409f13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    modifier4 = modifier2;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a5);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m120);
                    c0209i3 = C0217k.f732j;
                    function5 = function4;
                    if (c28655q4.f115903S) {
                        obj2 = obj;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N120);
                        C22949e c22949e8 = AbstractC22977m.f90650a;
                        C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(c22949e8, c2306l2, c28655q4, 48);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q4.m87165m();
                        interfaceC4339a5 = interfaceC4339a4;
                        Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a116);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1110);
                        if (c28655q4.f115903S) {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        } else {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1110);
                        titleImage = goalSectionItemState.getTitleImage();
                        c23000t1 = C23000t1.f90727a;
                        if (titleImage == null) {
                            modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                        } else {
                            modifierMo66772c = c2314t;
                        }
                        C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(c22949e8, c2306l2, c28655q4, 48);
                        Modifier modifier115 = modifierMo66772c;
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q4.m87165m();
                        c22949e = c22949e8;
                        Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q4, modifier115);
                        c28655q4.m87158i0();
                        c23000t2 = c23000t1;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a117);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111);
                        if (goalSectionItemState.getTitleImage() != null) {
                            c28655q4.m87150e0(-999861702);
                            AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                            c28655q4.m87173q(false);
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            r15 = 0;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            r14 = c28655q4;
                        } else {
                            c28655q4.m87150e0(-999578641);
                            if (goalSectionItemState.getDisplayHeaderDivider()) {
                                c28655q4.m87150e0(-999527615);
                                if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                    c28655q4.m87150e0(-999377141);
                                    c0209i8 = c0209i4;
                                    c2314t2 = c2314t;
                                    c0209i6 = c0209i2;
                                    c0209i7 = c0209i;
                                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                    C28655q c28655q111 = c28655q4;
                                    AbstractC31061c.m95650z(7, 4, c2314t2, c28655q111, false);
                                    z14 = false;
                                    c28655q3 = c28655q111;
                                } else {
                                    c2314t2 = c2314t;
                                    c0209i6 = c0209i2;
                                    c0209i7 = c0209i;
                                    c0209i8 = c0209i4;
                                    c28655q4.m87150e0(-998874662);
                                    float f115 = 1;
                                    z14 = false;
                                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f115 * 8, f115, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                    C28655q c28655q112 = c28655q4;
                                    c28655q112.m87173q(false);
                                    c28655q3 = c28655q112;
                                }
                                c28655q3.m87173q(z14);
                                z13 = z14;
                                c28655q2 = c28655q3;
                            } else {
                                function5 = function5;
                                c2306l2 = c2306l2;
                                c0209i5 = c0209i5;
                                c0213j = c0213j;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                z13 = false;
                                modifier4 = modifier4;
                                obj2 = obj2;
                                c22949e = c22949e;
                                interfaceC4339a5 = interfaceC4339a5;
                                c23000t2 = c23000t2;
                                c28655q4.m87150e0(-998457712);
                                if (goalSectionItemState.getUseHeaderDividerV2()) {
                                    c28655q4.m87150e0(-998368029);
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                    C28655q c28655q113 = c28655q4;
                                    c28655q113.m87173q(false);
                                    c28655q = c28655q113;
                                } else {
                                    c28655q4.m87150e0(-998177627);
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                    C28655q c28655q114 = c28655q4;
                                    c28655q114.m87173q(false);
                                    c28655q = c28655q114;
                                }
                                c28655q.m87173q(false);
                                c28655q2 = c28655q;
                            }
                            c28655q2.m87173q(z13);
                            r15 = z13;
                            r14 = c28655q2;
                        }
                        r14.m87173q(true);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            r14.m87150e0(991675841);
                            r14.m87173q(r15);
                        } else {
                            r14.m87150e0(991675841);
                            r14.m87173q(r15);
                        }
                        boolean zM87157i5 = r14.m87157i(goalSectionItemState);
                        i19 = i28 & 896;
                        if (i19 == 256) {
                            r16 = 1;
                        } else {
                            r16 = r15;
                        }
                        i24 = (zM87157i5 ? 1 : 0) | r16;
                        objM87133R = r14.m87133R();
                        if (i24 == 0) {
                            obj3 = obj2;
                            if (objM87133R == obj3) {
                                function6 = function5;
                                obj4 = objM87133R;
                            }
                            c2314t3 = c2314t2;
                            Modifier modifierM44101d9 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                            c22949e2 = c22949e;
                            C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                            iHashCode4 = Long.hashCode(r14.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1112 = r14.m87165m();
                            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(r14, modifierM44101d9);
                            r14.m87158i0();
                            if (r14.f115903S) {
                                c0213j2 = c0213j;
                                r14.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                r14.m87178s0();
                            }
                            c0209i9 = c0209i7;
                            AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a118);
                            C0209i c0209i11118 = c0209i6;
                            AbstractC28683x.m87239G(r14, c0209i11118, interfaceC28653p1M87165m1112);
                            if (r14.f115903S) {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            } else {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            }
                            C0209i c0209i11119 = c0209i8;
                            AbstractC28683x.m87239G(r14, c0209i11119, modifierM118962N1112);
                            if (goalSectionItemState.getActionText() != null) {
                                r14.m87150e0(1689087092);
                                ?? r2116 = r14;
                                i25 = i19;
                                function7 = function6;
                                c0209i12 = c0209i9;
                                c22949e3 = c22949e2;
                                c2314t4 = c2314t3;
                                c0213j3 = c0213j2;
                                c0209i11 = c0209i10;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2116, 0, C2886a.f11498d << 18, 196602);
                                ?? r111111 = r2116;
                                r111111.m87173q(false);
                                r17 = r111111;
                            } else {
                                i25 = i19;
                                c0209i11 = c0209i10;
                                function7 = function6;
                                c0213j3 = c0213j2;
                                c0209i12 = c0209i9;
                                c2314t4 = c2314t3;
                                ?? r111112 = r15;
                                c22949e3 = c22949e2;
                                r14.m87150e0(1689235644);
                                r14.m87173q(r111112);
                                r17 = r14;
                            }
                            if (goalSectionItemState.getIcon() != null) {
                                r17.m87150e0(1689305363);
                                float f116 = 4;
                                AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f116, c2314t4));
                                ?? r2117 = r17;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f116, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2117, 384, 0);
                                ?? r111113 = r2117;
                                r111113.m87173q(false);
                                r18 = r111113;
                            } else {
                                r17.m87150e0(1689744540);
                                r17.m87173q(false);
                                r18 = r17;
                            }
                            r18.m87173q(true);
                            r18.m87173q(true);
                            if (goalSectionItemState.getSubTitle() == null) {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            } else {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            }
                            r19.m87150e0(-502100598);
                            while (r2.hasNext()) {
                                Modifier modifier116 = modifier4;
                                AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier116)));
                                objM87133R2 = r19.m87133R();
                                obj8 = obj3;
                                if (objM87133R2 == obj8) {
                                    obj9 = objM87133R2;
                                    C40893d c40893d12 = new C40893d(16);
                                    r19.m87172p0(c40893d12);
                                    obj9 = c40893d12;
                                }
                                obj9 = objM87133R2;
                                C25307p c25307pM74306g9 = p720m91.Function1.m74306g((Function1) obj9);
                                i27 = i25;
                                if (i27 == 256) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R3 = r19.m87133R();
                                if (z16) {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                } else {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                }
                                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g9, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                                modifier4 = modifier116;
                                i25 = i27;
                                obj3 = obj8;
                                function7 = function8;
                            }
                            Function1 function17 = function7;
                            Modifier modifier117 = modifier4;
                            obj5 = obj3;
                            r19.m87173q(false);
                            if (goalSectionItemState.getCallout() != null) {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            } else {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            }
                            Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t4);
                            C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                            iHashCode5 = Long.hashCode(r19.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1113 = r19.m87165m();
                            Modifier modifierM118962N1113 = AbstractC37056f.m118962N(r19, modifierM3409f14);
                            InterfaceC0221l.f734a.getClass();
                            c0213j4 = C0217k.f724b;
                            r19.m87158i0();
                            if (r19.f115903S) {
                                r19.m87163l(c0213j4);
                            } else {
                                r19.m87178s0();
                            }
                            c0209i13 = C0217k.f729g;
                            AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a119);
                            C0209i c0209i111110 = C0217k.f728f;
                            AbstractC28683x.m87239G(r19, c0209i111110, interfaceC28653p1M87165m1113);
                            c0209i14 = C0217k.f732j;
                            if (r19.f115903S) {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            } else {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            }
                            C0209i c0209i111111 = C0217k.f726d;
                            AbstractC28683x.m87239G(r19, c0209i111111, modifierM118962N1113);
                            if (goalSectionItemState.getCallout() != null) {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            } else {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            }
                            if (goalSectionItemState.getLinkText() != null) {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            } else {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            }
                            r111.m87173q(z15);
                            r111.m87173q(z15);
                            interfaceC4339a3 = interfaceC4339a6;
                            function3 = function17;
                            modifier3 = modifier117;
                            r10 = r111;
                        } else {
                            obj3 = obj2;
                        }
                        function6 = function5;
                        C39689b c39689b5 = new C39689b(goalSectionItemState, function6, 26);
                        r14.m87172p0(c39689b5);
                        obj4 = c39689b5;
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d10 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1114 = r14.m87165m();
                        Modifier modifierM118962N1114 = AbstractC37056f.m118962N(r14, modifierM44101d10);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a1110);
                        C0209i c0209i111112 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i111112, interfaceC28653p1M87165m1114);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i111113 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i111113, modifierM118962N1114);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r2118 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2118, 0, C2886a.f11498d << 18, 196602);
                            ?? r111114 = r2118;
                            r111114.m87173q(false);
                            r17 = r111114;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r111115 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r111115);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f117 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f117, c2314t4));
                            ?? r2119 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f117, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2119, 384, 0);
                            ?? r111116 = r2119;
                            r111116.m87173q(false);
                            r18 = r111116;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier118 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier118)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d13 = new C40893d(16);
                                r19.m87172p0(c40893d13);
                                obj9 = c40893d13;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g10 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g10, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier118;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function18 = function7;
                        Modifier modifier119 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1115 = r19.m87165m();
                        Modifier modifierM118962N1115 = AbstractC37056f.m118962N(r19, modifierM3409f15);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a1111);
                        C0209i c0209i111114 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i111114, interfaceC28653p1M87165m1115);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i111115 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i111115, modifierM118962N1115);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function18;
                        modifier3 = modifier119;
                        r10 = r111;
                    } else {
                        obj2 = obj;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N120);
                    C22949e c22949e9 = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a1112 = AbstractC22988p1.m66759a(c22949e9, c2306l2, c28655q4, 48);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q4.m87165m();
                    interfaceC4339a5 = interfaceC4339a4;
                    Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1112);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1116);
                    if (c28655q4.f115903S) {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1116);
                    titleImage = goalSectionItemState.getTitleImage();
                    c23000t1 = C23000t1.f90727a;
                    if (titleImage == null) {
                        modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                    } else {
                        modifierMo66772c = c2314t;
                    }
                    C22994r1 c22994r1M66759a1113 = AbstractC22988p1.m66759a(c22949e9, c2306l2, c28655q4, 48);
                    Modifier modifier1110 = modifierMo66772c;
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q4.m87165m();
                    c22949e = c22949e9;
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q4, modifier1110);
                    c28655q4.m87158i0();
                    c23000t2 = c23000t1;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1113);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1117);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1117);
                    if (goalSectionItemState.getTitleImage() != null) {
                        c28655q4.m87150e0(-999861702);
                        AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                        c28655q4.m87173q(false);
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        r15 = 0;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        r14 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-999578641);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            c28655q4.m87150e0(-999527615);
                            if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                c28655q4.m87150e0(-999377141);
                                c0209i8 = c0209i4;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                C28655q c28655q115 = c28655q4;
                                AbstractC31061c.m95650z(7, 4, c2314t2, c28655q115, false);
                                z14 = false;
                                c28655q3 = c28655q115;
                            } else {
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                c28655q4.m87150e0(-998874662);
                                float f118 = 1;
                                z14 = false;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f118 * 8, f118, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                C28655q c28655q116 = c28655q4;
                                c28655q116.m87173q(false);
                                c28655q3 = c28655q116;
                            }
                            c28655q3.m87173q(z14);
                            z13 = z14;
                            c28655q2 = c28655q3;
                        } else {
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            z13 = false;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            c28655q4.m87150e0(-998457712);
                            if (goalSectionItemState.getUseHeaderDividerV2()) {
                                c28655q4.m87150e0(-998368029);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q117 = c28655q4;
                                c28655q117.m87173q(false);
                                c28655q = c28655q117;
                            } else {
                                c28655q4.m87150e0(-998177627);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q118 = c28655q4;
                                c28655q118.m87173q(false);
                                c28655q = c28655q118;
                            }
                            c28655q.m87173q(false);
                            c28655q2 = c28655q;
                        }
                        c28655q2.m87173q(z13);
                        r15 = z13;
                        r14 = c28655q2;
                    }
                    r14.m87173q(true);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    } else {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    }
                    boolean zM87157i6 = r14.m87157i(goalSectionItemState);
                    i19 = i28 & 896;
                    if (i19 == 256) {
                        r16 = 1;
                    } else {
                        r16 = r15;
                    }
                    i24 = (zM87157i6 ? 1 : 0) | r16;
                    objM87133R = r14.m87133R();
                    if (i24 == 0) {
                        obj3 = obj2;
                        if (objM87133R == obj3) {
                            function6 = function5;
                            obj4 = objM87133R;
                        }
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d11 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a1114 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = r14.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(r14, modifierM44101d11);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a1114);
                        C0209i c0209i111116 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i111116, interfaceC28653p1M87165m1118);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i111117 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i111117, modifierM118962N1118);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r21110 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21110, 0, C2886a.f11498d << 18, 196602);
                            ?? r111117 = r21110;
                            r111117.m87173q(false);
                            r17 = r111117;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r111118 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r111118);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f119 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f119, c2314t4));
                            ?? r21111 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f119, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21111, 384, 0);
                            ?? r111119 = r21111;
                            r111119.m87173q(false);
                            r18 = r111119;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier1111 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier1111)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d14 = new C40893d(16);
                                r19.m87172p0(c40893d14);
                                obj9 = c40893d14;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g11 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g11, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier1111;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function19 = function7;
                        Modifier modifier1112 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a1115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1119 = r19.m87165m();
                        Modifier modifierM118962N1119 = AbstractC37056f.m118962N(r19, modifierM3409f16);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a1115);
                        C0209i c0209i111118 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i111118, interfaceC28653p1M87165m1119);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i111119 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i111119, modifierM118962N1119);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function19;
                        modifier3 = modifier1112;
                        r10 = r111;
                    } else {
                        obj3 = obj2;
                    }
                    function6 = function5;
                    C39689b c39689b6 = new C39689b(goalSectionItemState, function6, 26);
                    r14.m87172p0(c39689b6);
                    obj4 = c39689b6;
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d12 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a1116 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = r14.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(r14, modifierM44101d12);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a1116);
                    C0209i c0209i1111110 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i1111110, interfaceC28653p1M87165m11110);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i1111111 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i1111111, modifierM118962N11110);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r21112 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21112, 0, C2886a.f11498d << 18, 196602);
                        ?? r1111110 = r21112;
                        r1111110.m87173q(false);
                        r17 = r1111110;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r1111111 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r1111111);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f1110 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f1110, c2314t4));
                        ?? r21113 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f1110, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21113, 384, 0);
                        ?? r1111112 = r21113;
                        r1111112.m87173q(false);
                        r18 = r1111112;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier1113 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier1113)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d15 = new C40893d(16);
                            r19.m87172p0(c40893d15);
                            obj9 = c40893d15;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g12 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g12, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier1113;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function110 = function7;
                    Modifier modifier1114 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f17 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a1117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111 = r19.m87165m();
                    Modifier modifierM118962N11111 = AbstractC37056f.m118962N(r19, modifierM3409f17);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a1117);
                    C0209i c0209i1111112 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i1111112, interfaceC28653p1M87165m11111);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i1111113 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i1111113, modifierM118962N11111);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function110;
                    modifier3 = modifier1114;
                    r10 = r111;
                } else {
                    c28655q4.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                    r10 = c28655q4;
                }
                c28677v1M87180u = r10.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k(goalSectionItemState, modifier3, function3, interfaceC4339a3, i13, i14, 22);
                }
            }
            i28 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i28 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i28 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                obj = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == obj) {
                        obj11 = objM87133R5;
                        C40893d c40893d16 = new C40893d(15);
                        c28655q4.m87172p0(c40893d16);
                        obj11 = c40893d16;
                    }
                    obj11 = objM87133R5;
                    function4 = (Function1) obj11;
                } else {
                    function4 = function2;
                }
                if (i17 != 0) {
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == obj) {
                        obj10 = objM87133R4;
                        C40674e0 c40674e3 = new C40674e0(14);
                        c28655q4.m87172p0(c40674e3);
                        obj10 = c40674e3;
                    }
                    obj10 = objM87133R4;
                    interfaceC4339a4 = (InterfaceC4339a) obj10;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                id4 = goalSectionItemState.getId();
                if (id4 != null) {
                    String lowerCase4 = id4.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase4, "toLowerCase(...)");
                    strConcat = lowerCase4.concat("_edit_button");
                } else {
                    strConcat = null;
                }
                Modifier modifierM3409f18 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m121 = c28655q4.m87165m();
                Modifier modifierM118962N121 = AbstractC37056f.m118962N(c28655q4, modifierM3409f18);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                modifier4 = modifier2;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a6);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m121);
                c0209i3 = C0217k.f732j;
                function5 = function4;
                if (c28655q4.f115903S) {
                    obj2 = obj;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N121);
                    C22949e c22949e10 = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a1118 = AbstractC22988p1.m66759a(c22949e10, c2306l2, c28655q4, 48);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q4.m87165m();
                    interfaceC4339a5 = interfaceC4339a4;
                    Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1118);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11112);
                    if (c28655q4.f115903S) {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11112);
                    titleImage = goalSectionItemState.getTitleImage();
                    c23000t1 = C23000t1.f90727a;
                    if (titleImage == null) {
                        modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                    } else {
                        modifierMo66772c = c2314t;
                    }
                    C22994r1 c22994r1M66759a1119 = AbstractC22988p1.m66759a(c22949e10, c2306l2, c28655q4, 48);
                    Modifier modifier1115 = modifierMo66772c;
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q4.m87165m();
                    c22949e = c22949e10;
                    Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q4, modifier1115);
                    c28655q4.m87158i0();
                    c23000t2 = c23000t1;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1119);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11113);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11113);
                    if (goalSectionItemState.getTitleImage() != null) {
                        c28655q4.m87150e0(-999861702);
                        AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                        c28655q4.m87173q(false);
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        r15 = 0;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        r14 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-999578641);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            c28655q4.m87150e0(-999527615);
                            if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                c28655q4.m87150e0(-999377141);
                                c0209i8 = c0209i4;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                C28655q c28655q119 = c28655q4;
                                AbstractC31061c.m95650z(7, 4, c2314t2, c28655q119, false);
                                z14 = false;
                                c28655q3 = c28655q119;
                            } else {
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                c28655q4.m87150e0(-998874662);
                                float f1111 = 1;
                                z14 = false;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f1111 * 8, f1111, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                C28655q c28655q1110 = c28655q4;
                                c28655q1110.m87173q(false);
                                c28655q3 = c28655q1110;
                            }
                            c28655q3.m87173q(z14);
                            z13 = z14;
                            c28655q2 = c28655q3;
                        } else {
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            z13 = false;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            c28655q4.m87150e0(-998457712);
                            if (goalSectionItemState.getUseHeaderDividerV2()) {
                                c28655q4.m87150e0(-998368029);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q1111 = c28655q4;
                                c28655q1111.m87173q(false);
                                c28655q = c28655q1111;
                            } else {
                                c28655q4.m87150e0(-998177627);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q1112 = c28655q4;
                                c28655q1112.m87173q(false);
                                c28655q = c28655q1112;
                            }
                            c28655q.m87173q(false);
                            c28655q2 = c28655q;
                        }
                        c28655q2.m87173q(z13);
                        r15 = z13;
                        r14 = c28655q2;
                    }
                    r14.m87173q(true);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    } else {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    }
                    boolean zM87157i7 = r14.m87157i(goalSectionItemState);
                    i19 = i28 & 896;
                    if (i19 == 256) {
                        r16 = 1;
                    } else {
                        r16 = r15;
                    }
                    i24 = (zM87157i7 ? 1 : 0) | r16;
                    objM87133R = r14.m87133R();
                    if (i24 == 0) {
                        obj3 = obj2;
                        if (objM87133R == obj3) {
                            function6 = function5;
                            obj4 = objM87133R;
                        }
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d13 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a11110 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11114 = r14.m87165m();
                        Modifier modifierM118962N11114 = AbstractC37056f.m118962N(r14, modifierM44101d13);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a11110);
                        C0209i c0209i1111114 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i1111114, interfaceC28653p1M87165m11114);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i1111115 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i1111115, modifierM118962N11114);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r21114 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21114, 0, C2886a.f11498d << 18, 196602);
                            ?? r1111113 = r21114;
                            r1111113.m87173q(false);
                            r17 = r1111113;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r1111114 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r1111114);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f1112 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f1112, c2314t4));
                            ?? r21115 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f1112, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21115, 384, 0);
                            ?? r1111115 = r21115;
                            r1111115.m87173q(false);
                            r18 = r1111115;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier1116 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier1116)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d17 = new C40893d(16);
                                r19.m87172p0(c40893d17);
                                obj9 = c40893d17;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g13 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g13, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier1116;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function111 = function7;
                        Modifier modifier1117 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f19 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a11111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11115 = r19.m87165m();
                        Modifier modifierM118962N11115 = AbstractC37056f.m118962N(r19, modifierM3409f19);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a11111);
                        C0209i c0209i1111116 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i1111116, interfaceC28653p1M87165m11115);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i1111117 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i1111117, modifierM118962N11115);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function111;
                        modifier3 = modifier1117;
                        r10 = r111;
                    } else {
                        obj3 = obj2;
                    }
                    function6 = function5;
                    C39689b c39689b7 = new C39689b(goalSectionItemState, function6, 26);
                    r14.m87172p0(c39689b7);
                    obj4 = c39689b7;
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d14 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a11112 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11116 = r14.m87165m();
                    Modifier modifierM118962N11116 = AbstractC37056f.m118962N(r14, modifierM44101d14);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a11112);
                    C0209i c0209i1111118 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i1111118, interfaceC28653p1M87165m11116);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i1111119 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i1111119, modifierM118962N11116);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r21116 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21116, 0, C2886a.f11498d << 18, 196602);
                        ?? r1111116 = r21116;
                        r1111116.m87173q(false);
                        r17 = r1111116;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r1111117 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r1111117);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f1113 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f1113, c2314t4));
                        ?? r21117 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f1113, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21117, 384, 0);
                        ?? r1111118 = r21117;
                        r1111118.m87173q(false);
                        r18 = r1111118;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier1118 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier1118)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d18 = new C40893d(16);
                            r19.m87172p0(c40893d18);
                            obj9 = c40893d18;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g14 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g14, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier1118;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function112 = function7;
                    Modifier modifier1119 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f110 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a11113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11117 = r19.m87165m();
                    Modifier modifierM118962N11117 = AbstractC37056f.m118962N(r19, modifierM3409f110);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a11113);
                    C0209i c0209i11111110 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i11111110, interfaceC28653p1M87165m11117);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i11111111 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i11111111, modifierM118962N11117);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function112;
                    modifier3 = modifier1119;
                    r10 = r111;
                } else {
                    obj2 = obj;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N121);
                C22949e c22949e11 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a11114 = AbstractC22988p1.m66759a(c22949e11, c2306l2, c28655q4, 48);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q4.m87165m();
                interfaceC4339a5 = interfaceC4339a4;
                Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a11114);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11118);
                if (c28655q4.f115903S) {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11118);
                titleImage = goalSectionItemState.getTitleImage();
                c23000t1 = C23000t1.f90727a;
                if (titleImage == null) {
                    modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                } else {
                    modifierMo66772c = c2314t;
                }
                C22994r1 c22994r1M66759a11115 = AbstractC22988p1.m66759a(c22949e11, c2306l2, c28655q4, 48);
                Modifier modifier11110 = modifierMo66772c;
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q4.m87165m();
                c22949e = c22949e11;
                Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q4, modifier11110);
                c28655q4.m87158i0();
                c23000t2 = c23000t1;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a11115);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11119);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11119);
                if (goalSectionItemState.getTitleImage() != null) {
                    c28655q4.m87150e0(-999861702);
                    AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                    c28655q4.m87173q(false);
                    function5 = function5;
                    c2306l2 = c2306l2;
                    c0209i5 = c0209i5;
                    c0213j = c0213j;
                    c2314t2 = c2314t;
                    c0209i6 = c0209i2;
                    c0209i7 = c0209i;
                    c0209i8 = c0209i4;
                    r15 = 0;
                    modifier4 = modifier4;
                    obj2 = obj2;
                    c22949e = c22949e;
                    interfaceC4339a5 = interfaceC4339a5;
                    c23000t2 = c23000t2;
                    r14 = c28655q4;
                } else {
                    c28655q4.m87150e0(-999578641);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        c28655q4.m87150e0(-999527615);
                        if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                            c28655q4.m87150e0(-999377141);
                            c0209i8 = c0209i4;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                            C28655q c28655q1113 = c28655q4;
                            AbstractC31061c.m95650z(7, 4, c2314t2, c28655q1113, false);
                            z14 = false;
                            c28655q3 = c28655q1113;
                        } else {
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            c28655q4.m87150e0(-998874662);
                            float f1114 = 1;
                            z14 = false;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f1114 * 8, f1114, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                            C28655q c28655q1114 = c28655q4;
                            c28655q1114.m87173q(false);
                            c28655q3 = c28655q1114;
                        }
                        c28655q3.m87173q(z14);
                        z13 = z14;
                        c28655q2 = c28655q3;
                    } else {
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        z13 = false;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        c28655q4.m87150e0(-998457712);
                        if (goalSectionItemState.getUseHeaderDividerV2()) {
                            c28655q4.m87150e0(-998368029);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                            C28655q c28655q1115 = c28655q4;
                            c28655q1115.m87173q(false);
                            c28655q = c28655q1115;
                        } else {
                            c28655q4.m87150e0(-998177627);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                            C28655q c28655q1116 = c28655q4;
                            c28655q1116.m87173q(false);
                            c28655q = c28655q1116;
                        }
                        c28655q.m87173q(false);
                        c28655q2 = c28655q;
                    }
                    c28655q2.m87173q(z13);
                    r15 = z13;
                    r14 = c28655q2;
                }
                r14.m87173q(true);
                if (goalSectionItemState.getDisplayHeaderDivider()) {
                    r14.m87150e0(991675841);
                    r14.m87173q(r15);
                } else {
                    r14.m87150e0(991675841);
                    r14.m87173q(r15);
                }
                boolean zM87157i8 = r14.m87157i(goalSectionItemState);
                i19 = i28 & 896;
                if (i19 == 256) {
                    r16 = 1;
                } else {
                    r16 = r15;
                }
                i24 = (zM87157i8 ? 1 : 0) | r16;
                objM87133R = r14.m87133R();
                if (i24 == 0) {
                    obj3 = obj2;
                    if (objM87133R == obj3) {
                        function6 = function5;
                        obj4 = objM87133R;
                    }
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d15 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a11116 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111110 = r14.m87165m();
                    Modifier modifierM118962N111110 = AbstractC37056f.m118962N(r14, modifierM44101d15);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a11116);
                    C0209i c0209i11111112 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i11111112, interfaceC28653p1M87165m111110);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i11111113 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i11111113, modifierM118962N111110);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r21118 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21118, 0, C2886a.f11498d << 18, 196602);
                        ?? r1111119 = r21118;
                        r1111119.m87173q(false);
                        r17 = r1111119;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r11111110 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r11111110);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f1115 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f1115, c2314t4));
                        ?? r21119 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f1115, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21119, 384, 0);
                        ?? r11111111 = r21119;
                        r11111111.m87173q(false);
                        r18 = r11111111;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier11111 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier11111)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d19 = new C40893d(16);
                            r19.m87172p0(c40893d19);
                            obj9 = c40893d19;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g15 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g15, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier11111;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function113 = function7;
                    Modifier modifier11112 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f111 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a11117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111 = r19.m87165m();
                    Modifier modifierM118962N111111 = AbstractC37056f.m118962N(r19, modifierM3409f111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a11117);
                    C0209i c0209i11111114 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i11111114, interfaceC28653p1M87165m111111);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i11111115 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i11111115, modifierM118962N111111);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function113;
                    modifier3 = modifier11112;
                    r10 = r111;
                } else {
                    obj3 = obj2;
                }
                function6 = function5;
                C39689b c39689b8 = new C39689b(goalSectionItemState, function6, 26);
                r14.m87172p0(c39689b8);
                obj4 = c39689b8;
                c2314t3 = c2314t2;
                Modifier modifierM44101d16 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                c22949e2 = c22949e;
                C22994r1 c22994r1M66759a11118 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                iHashCode4 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111112 = r14.m87165m();
                Modifier modifierM118962N111112 = AbstractC37056f.m118962N(r14, modifierM44101d16);
                r14.m87158i0();
                if (r14.f115903S) {
                    c0213j2 = c0213j;
                    r14.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    r14.m87178s0();
                }
                c0209i9 = c0209i7;
                AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a11118);
                C0209i c0209i11111116 = c0209i6;
                AbstractC28683x.m87239G(r14, c0209i11111116, interfaceC28653p1M87165m111112);
                if (r14.f115903S) {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                } else {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                }
                C0209i c0209i11111117 = c0209i8;
                AbstractC28683x.m87239G(r14, c0209i11111117, modifierM118962N111112);
                if (goalSectionItemState.getActionText() != null) {
                    r14.m87150e0(1689087092);
                    ?? r211110 = r14;
                    i25 = i19;
                    function7 = function6;
                    c0209i12 = c0209i9;
                    c22949e3 = c22949e2;
                    c2314t4 = c2314t3;
                    c0213j3 = c0213j2;
                    c0209i11 = c0209i10;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r211110, 0, C2886a.f11498d << 18, 196602);
                    ?? r11111112 = r211110;
                    r11111112.m87173q(false);
                    r17 = r11111112;
                } else {
                    i25 = i19;
                    c0209i11 = c0209i10;
                    function7 = function6;
                    c0213j3 = c0213j2;
                    c0209i12 = c0209i9;
                    c2314t4 = c2314t3;
                    ?? r11111113 = r15;
                    c22949e3 = c22949e2;
                    r14.m87150e0(1689235644);
                    r14.m87173q(r11111113);
                    r17 = r14;
                }
                if (goalSectionItemState.getIcon() != null) {
                    r17.m87150e0(1689305363);
                    float f1116 = 4;
                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f1116, c2314t4));
                    ?? r211111 = r17;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f1116, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r211111, 384, 0);
                    ?? r11111114 = r211111;
                    r11111114.m87173q(false);
                    r18 = r11111114;
                } else {
                    r17.m87150e0(1689744540);
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(true);
                r18.m87173q(true);
                if (goalSectionItemState.getSubTitle() == null) {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                } else {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                }
                r19.m87150e0(-502100598);
                while (r2.hasNext()) {
                    Modifier modifier11113 = modifier4;
                    AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier11113)));
                    objM87133R2 = r19.m87133R();
                    obj8 = obj3;
                    if (objM87133R2 == obj8) {
                        obj9 = objM87133R2;
                        C40893d c40893d110 = new C40893d(16);
                        r19.m87172p0(c40893d110);
                        obj9 = c40893d110;
                    }
                    obj9 = objM87133R2;
                    C25307p c25307pM74306g16 = p720m91.Function1.m74306g((Function1) obj9);
                    i27 = i25;
                    if (i27 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = r19.m87133R();
                    if (z16) {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    } else {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g16, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                    modifier4 = modifier11113;
                    i25 = i27;
                    obj3 = obj8;
                    function7 = function8;
                }
                Function1 function114 = function7;
                Modifier modifier11114 = modifier4;
                obj5 = obj3;
                r19.m87173q(false);
                if (goalSectionItemState.getCallout() != null) {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                } else {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                }
                Modifier modifierM3409f112 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C22994r1 c22994r1M66759a11119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                iHashCode5 = Long.hashCode(r19.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111113 = r19.m87165m();
                Modifier modifierM118962N111113 = AbstractC37056f.m118962N(r19, modifierM3409f112);
                InterfaceC0221l.f734a.getClass();
                c0213j4 = C0217k.f724b;
                r19.m87158i0();
                if (r19.f115903S) {
                    r19.m87163l(c0213j4);
                } else {
                    r19.m87178s0();
                }
                c0209i13 = C0217k.f729g;
                AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a11119);
                C0209i c0209i11111118 = C0217k.f728f;
                AbstractC28683x.m87239G(r19, c0209i11111118, interfaceC28653p1M87165m111113);
                c0209i14 = C0217k.f732j;
                if (r19.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                }
                C0209i c0209i11111119 = C0217k.f726d;
                AbstractC28683x.m87239G(r19, c0209i11111119, modifierM118962N111113);
                if (goalSectionItemState.getCallout() != null) {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                } else {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                }
                if (goalSectionItemState.getLinkText() != null) {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                }
                r111.m87173q(z15);
                r111.m87173q(z15);
                interfaceC4339a3 = interfaceC4339a6;
                function3 = function114;
                modifier3 = modifier11114;
                r10 = r111;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
                r10 = c28655q4;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(goalSectionItemState, modifier3, function3, interfaceC4339a3, i13, i14, 22);
            }
        }
        i28 |= 48;
        modifier2 = modifier;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q4.m87157i(function2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i28 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q4.m87157i(interfaceC4339a2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i28 |= i18;
                }
                if ((i28 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q4.m87135U(i28 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    obj = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == obj) {
                            obj11 = objM87133R5;
                            C40893d c40893d111 = new C40893d(15);
                            c28655q4.m87172p0(c40893d111);
                            obj11 = c40893d111;
                        }
                        obj11 = objM87133R5;
                        function4 = (Function1) obj11;
                    } else {
                        function4 = function2;
                    }
                    if (i17 != 0) {
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == obj) {
                            obj10 = objM87133R4;
                            C40674e0 c40674e4 = new C40674e0(14);
                            c28655q4.m87172p0(c40674e4);
                            obj10 = c40674e4;
                        }
                        obj10 = objM87133R4;
                        interfaceC4339a4 = (InterfaceC4339a) obj10;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    id4 = goalSectionItemState.getId();
                    if (id4 != null) {
                        String lowerCase5 = id4.toLowerCase(Locale.ROOT);
                        AbstractC22676k.m65749i(lowerCase5, "toLowerCase(...)");
                        strConcat = lowerCase5.concat("_edit_button");
                    } else {
                        strConcat = null;
                    }
                    Modifier modifierM3409f113 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q4, 0);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m122 = c28655q4.m87165m();
                    Modifier modifierM118962N122 = AbstractC37056f.m118962N(c28655q4, modifierM3409f113);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    modifier4 = modifier2;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a7);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m122);
                    c0209i3 = C0217k.f732j;
                    function5 = function4;
                    if (c28655q4.f115903S) {
                        obj2 = obj;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N122);
                        C22949e c22949e12 = AbstractC22977m.f90650a;
                        C22994r1 c22994r1M66759a111110 = AbstractC22988p1.m66759a(c22949e12, c2306l2, c28655q4, 48);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q4.m87165m();
                        interfaceC4339a5 = interfaceC4339a4;
                        Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111110);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111114);
                        if (c28655q4.f115903S) {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        } else {
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111114);
                        titleImage = goalSectionItemState.getTitleImage();
                        c23000t1 = C23000t1.f90727a;
                        if (titleImage == null) {
                            modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                        } else {
                            modifierMo66772c = c2314t;
                        }
                        C22994r1 c22994r1M66759a111111 = AbstractC22988p1.m66759a(c22949e12, c2306l2, c28655q4, 48);
                        Modifier modifier11115 = modifierMo66772c;
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q4.m87165m();
                        c22949e = c22949e12;
                        Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q4, modifier11115);
                        c28655q4.m87158i0();
                        c23000t2 = c23000t1;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111111);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111115);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111115);
                        if (goalSectionItemState.getTitleImage() != null) {
                            c28655q4.m87150e0(-999861702);
                            AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                            c28655q4.m87173q(false);
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            r15 = 0;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            r14 = c28655q4;
                        } else {
                            c28655q4.m87150e0(-999578641);
                            if (goalSectionItemState.getDisplayHeaderDivider()) {
                                c28655q4.m87150e0(-999527615);
                                if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                    c28655q4.m87150e0(-999377141);
                                    c0209i8 = c0209i4;
                                    c2314t2 = c2314t;
                                    c0209i6 = c0209i2;
                                    c0209i7 = c0209i;
                                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                    C28655q c28655q1117 = c28655q4;
                                    AbstractC31061c.m95650z(7, 4, c2314t2, c28655q1117, false);
                                    z14 = false;
                                    c28655q3 = c28655q1117;
                                } else {
                                    c2314t2 = c2314t;
                                    c0209i6 = c0209i2;
                                    c0209i7 = c0209i;
                                    c0209i8 = c0209i4;
                                    c28655q4.m87150e0(-998874662);
                                    float f1117 = 1;
                                    z14 = false;
                                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f1117 * 8, f1117, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                    C28655q c28655q1118 = c28655q4;
                                    c28655q1118.m87173q(false);
                                    c28655q3 = c28655q1118;
                                }
                                c28655q3.m87173q(z14);
                                z13 = z14;
                                c28655q2 = c28655q3;
                            } else {
                                function5 = function5;
                                c2306l2 = c2306l2;
                                c0209i5 = c0209i5;
                                c0213j = c0213j;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                z13 = false;
                                modifier4 = modifier4;
                                obj2 = obj2;
                                c22949e = c22949e;
                                interfaceC4339a5 = interfaceC4339a5;
                                c23000t2 = c23000t2;
                                c28655q4.m87150e0(-998457712);
                                if (goalSectionItemState.getUseHeaderDividerV2()) {
                                    c28655q4.m87150e0(-998368029);
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                    C28655q c28655q1119 = c28655q4;
                                    c28655q1119.m87173q(false);
                                    c28655q = c28655q1119;
                                } else {
                                    c28655q4.m87150e0(-998177627);
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                    C28655q c28655q11110 = c28655q4;
                                    c28655q11110.m87173q(false);
                                    c28655q = c28655q11110;
                                }
                                c28655q.m87173q(false);
                                c28655q2 = c28655q;
                            }
                            c28655q2.m87173q(z13);
                            r15 = z13;
                            r14 = c28655q2;
                        }
                        r14.m87173q(true);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            r14.m87150e0(991675841);
                            r14.m87173q(r15);
                        } else {
                            r14.m87150e0(991675841);
                            r14.m87173q(r15);
                        }
                        boolean zM87157i9 = r14.m87157i(goalSectionItemState);
                        i19 = i28 & 896;
                        if (i19 == 256) {
                            r16 = 1;
                        } else {
                            r16 = r15;
                        }
                        i24 = (zM87157i9 ? 1 : 0) | r16;
                        objM87133R = r14.m87133R();
                        if (i24 == 0) {
                            obj3 = obj2;
                            if (objM87133R == obj3) {
                                function6 = function5;
                                obj4 = objM87133R;
                            }
                            c2314t3 = c2314t2;
                            Modifier modifierM44101d17 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                            c22949e2 = c22949e;
                            C22994r1 c22994r1M66759a111112 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                            iHashCode4 = Long.hashCode(r14.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111116 = r14.m87165m();
                            Modifier modifierM118962N111116 = AbstractC37056f.m118962N(r14, modifierM44101d17);
                            r14.m87158i0();
                            if (r14.f115903S) {
                                c0213j2 = c0213j;
                                r14.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                r14.m87178s0();
                            }
                            c0209i9 = c0209i7;
                            AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a111112);
                            C0209i c0209i111111110 = c0209i6;
                            AbstractC28683x.m87239G(r14, c0209i111111110, interfaceC28653p1M87165m111116);
                            if (r14.f115903S) {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            } else {
                                c0209i10 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                            }
                            C0209i c0209i111111111 = c0209i8;
                            AbstractC28683x.m87239G(r14, c0209i111111111, modifierM118962N111116);
                            if (goalSectionItemState.getActionText() != null) {
                                r14.m87150e0(1689087092);
                                ?? r211112 = r14;
                                i25 = i19;
                                function7 = function6;
                                c0209i12 = c0209i9;
                                c22949e3 = c22949e2;
                                c2314t4 = c2314t3;
                                c0213j3 = c0213j2;
                                c0209i11 = c0209i10;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r211112, 0, C2886a.f11498d << 18, 196602);
                                ?? r11111115 = r211112;
                                r11111115.m87173q(false);
                                r17 = r11111115;
                            } else {
                                i25 = i19;
                                c0209i11 = c0209i10;
                                function7 = function6;
                                c0213j3 = c0213j2;
                                c0209i12 = c0209i9;
                                c2314t4 = c2314t3;
                                ?? r11111116 = r15;
                                c22949e3 = c22949e2;
                                r14.m87150e0(1689235644);
                                r14.m87173q(r11111116);
                                r17 = r14;
                            }
                            if (goalSectionItemState.getIcon() != null) {
                                r17.m87150e0(1689305363);
                                float f1118 = 4;
                                AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f1118, c2314t4));
                                ?? r211113 = r17;
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f1118, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r211113, 384, 0);
                                ?? r11111117 = r211113;
                                r11111117.m87173q(false);
                                r18 = r11111117;
                            } else {
                                r17.m87150e0(1689744540);
                                r17.m87173q(false);
                                r18 = r17;
                            }
                            r18.m87173q(true);
                            r18.m87173q(true);
                            if (goalSectionItemState.getSubTitle() == null) {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            } else {
                                c2306l = c2306l2;
                                i26 = 48;
                                r18.m87150e0(1614693949);
                                r18.m87173q(false);
                                r19 = r18;
                            }
                            r19.m87150e0(-502100598);
                            while (r2.hasNext()) {
                                Modifier modifier11116 = modifier4;
                                AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier11116)));
                                objM87133R2 = r19.m87133R();
                                obj8 = obj3;
                                if (objM87133R2 == obj8) {
                                    obj9 = objM87133R2;
                                    C40893d c40893d112 = new C40893d(16);
                                    r19.m87172p0(c40893d112);
                                    obj9 = c40893d112;
                                }
                                obj9 = objM87133R2;
                                C25307p c25307pM74306g17 = p720m91.Function1.m74306g((Function1) obj9);
                                i27 = i25;
                                if (i27 == 256) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R3 = r19.m87133R();
                                if (z16) {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                } else {
                                    function8 = function7;
                                    objM87133R3 = new C41067a(function8, 1);
                                    r19.m87172p0(objM87133R3);
                                }
                                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g17, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                                modifier4 = modifier11116;
                                i25 = i27;
                                obj3 = obj8;
                                function7 = function8;
                            }
                            Function1 function115 = function7;
                            Modifier modifier11117 = modifier4;
                            obj5 = obj3;
                            r19.m87173q(false);
                            if (goalSectionItemState.getCallout() != null) {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            } else {
                                r19.m87150e0(1615423069);
                                r19.m87173q(false);
                            }
                            Modifier modifierM3409f114 = AbstractC1102d.m3409f(1.0f, c2314t4);
                            C22994r1 c22994r1M66759a111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                            iHashCode5 = Long.hashCode(r19.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111117 = r19.m87165m();
                            Modifier modifierM118962N111117 = AbstractC37056f.m118962N(r19, modifierM3409f114);
                            InterfaceC0221l.f734a.getClass();
                            c0213j4 = C0217k.f724b;
                            r19.m87158i0();
                            if (r19.f115903S) {
                                r19.m87163l(c0213j4);
                            } else {
                                r19.m87178s0();
                            }
                            c0209i13 = C0217k.f729g;
                            AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a111113);
                            C0209i c0209i111111112 = C0217k.f728f;
                            AbstractC28683x.m87239G(r19, c0209i111111112, interfaceC28653p1M87165m111117);
                            c0209i14 = C0217k.f732j;
                            if (r19.f115903S) {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            } else {
                                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                            }
                            C0209i c0209i111111113 = C0217k.f726d;
                            AbstractC28683x.m87239G(r19, c0209i111111113, modifierM118962N111117);
                            if (goalSectionItemState.getCallout() != null) {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            } else {
                                c0213j5 = c0213j4;
                                c0209i15 = c0209i13;
                                obj6 = obj5;
                                c23000t3 = c23000t2;
                                r19.m87150e0(637182520);
                                r19.m87173q(false);
                                r110 = r19;
                            }
                            if (goalSectionItemState.getLinkText() != null) {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            } else {
                                interfaceC4339a6 = interfaceC4339a5;
                                z15 = true;
                                r110.m87150e0(637966386);
                                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                                r110.m87173q(false);
                                r111 = r110;
                            }
                            r111.m87173q(z15);
                            r111.m87173q(z15);
                            interfaceC4339a3 = interfaceC4339a6;
                            function3 = function115;
                            modifier3 = modifier11117;
                            r10 = r111;
                        } else {
                            obj3 = obj2;
                        }
                        function6 = function5;
                        C39689b c39689b9 = new C39689b(goalSectionItemState, function6, 26);
                        r14.m87172p0(c39689b9);
                        obj4 = c39689b9;
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d18 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a111114 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111118 = r14.m87165m();
                        Modifier modifierM118962N111118 = AbstractC37056f.m118962N(r14, modifierM44101d18);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a111114);
                        C0209i c0209i111111114 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i111111114, interfaceC28653p1M87165m111118);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i111111115 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i111111115, modifierM118962N111118);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r211114 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r211114, 0, C2886a.f11498d << 18, 196602);
                            ?? r11111118 = r211114;
                            r11111118.m87173q(false);
                            r17 = r11111118;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r11111119 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r11111119);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f1119 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f1119, c2314t4));
                            ?? r211115 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f1119, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r211115, 384, 0);
                            ?? r111111110 = r211115;
                            r111111110.m87173q(false);
                            r18 = r111111110;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier11118 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier11118)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d113 = new C40893d(16);
                                r19.m87172p0(c40893d113);
                                obj9 = c40893d113;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g18 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g18, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier11118;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function116 = function7;
                        Modifier modifier11119 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f115 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111119 = r19.m87165m();
                        Modifier modifierM118962N111119 = AbstractC37056f.m118962N(r19, modifierM3409f115);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a111115);
                        C0209i c0209i111111116 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i111111116, interfaceC28653p1M87165m111119);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i111111117 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i111111117, modifierM118962N111119);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function116;
                        modifier3 = modifier11119;
                        r10 = r111;
                    } else {
                        obj2 = obj;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N122);
                    C22949e c22949e13 = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a111116 = AbstractC22988p1.m66759a(c22949e13, c2306l2, c28655q4, 48);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q4.m87165m();
                    interfaceC4339a5 = interfaceC4339a4;
                    Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111116);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111110);
                    if (c28655q4.f115903S) {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111110);
                    titleImage = goalSectionItemState.getTitleImage();
                    c23000t1 = C23000t1.f90727a;
                    if (titleImage == null) {
                        modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                    } else {
                        modifierMo66772c = c2314t;
                    }
                    C22994r1 c22994r1M66759a111117 = AbstractC22988p1.m66759a(c22949e13, c2306l2, c28655q4, 48);
                    Modifier modifier111110 = modifierMo66772c;
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q4.m87165m();
                    c22949e = c22949e13;
                    Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q4, modifier111110);
                    c28655q4.m87158i0();
                    c23000t2 = c23000t1;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111117);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111111);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111111);
                    if (goalSectionItemState.getTitleImage() != null) {
                        c28655q4.m87150e0(-999861702);
                        AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                        c28655q4.m87173q(false);
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        r15 = 0;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        r14 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-999578641);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            c28655q4.m87150e0(-999527615);
                            if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                c28655q4.m87150e0(-999377141);
                                c0209i8 = c0209i4;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                C28655q c28655q11111 = c28655q4;
                                AbstractC31061c.m95650z(7, 4, c2314t2, c28655q11111, false);
                                z14 = false;
                                c28655q3 = c28655q11111;
                            } else {
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                c28655q4.m87150e0(-998874662);
                                float f11110 = 1;
                                z14 = false;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f11110 * 8, f11110, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                C28655q c28655q11112 = c28655q4;
                                c28655q11112.m87173q(false);
                                c28655q3 = c28655q11112;
                            }
                            c28655q3.m87173q(z14);
                            z13 = z14;
                            c28655q2 = c28655q3;
                        } else {
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            z13 = false;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            c28655q4.m87150e0(-998457712);
                            if (goalSectionItemState.getUseHeaderDividerV2()) {
                                c28655q4.m87150e0(-998368029);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q11113 = c28655q4;
                                c28655q11113.m87173q(false);
                                c28655q = c28655q11113;
                            } else {
                                c28655q4.m87150e0(-998177627);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q11114 = c28655q4;
                                c28655q11114.m87173q(false);
                                c28655q = c28655q11114;
                            }
                            c28655q.m87173q(false);
                            c28655q2 = c28655q;
                        }
                        c28655q2.m87173q(z13);
                        r15 = z13;
                        r14 = c28655q2;
                    }
                    r14.m87173q(true);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    } else {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    }
                    boolean zM87157i10 = r14.m87157i(goalSectionItemState);
                    i19 = i28 & 896;
                    if (i19 == 256) {
                        r16 = 1;
                    } else {
                        r16 = r15;
                    }
                    i24 = (zM87157i10 ? 1 : 0) | r16;
                    objM87133R = r14.m87133R();
                    if (i24 == 0) {
                        obj3 = obj2;
                        if (objM87133R == obj3) {
                            function6 = function5;
                            obj4 = objM87133R;
                        }
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d19 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a111118 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111112 = r14.m87165m();
                        Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(r14, modifierM44101d19);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a111118);
                        C0209i c0209i111111118 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i111111118, interfaceC28653p1M87165m1111112);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i111111119 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i111111119, modifierM118962N1111112);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r211116 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r211116, 0, C2886a.f11498d << 18, 196602);
                            ?? r111111111 = r211116;
                            r111111111.m87173q(false);
                            r17 = r111111111;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r111111112 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r111111112);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f11111 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f11111, c2314t4));
                            ?? r211117 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f11111, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r211117, 384, 0);
                            ?? r111111113 = r211117;
                            r111111113.m87173q(false);
                            r18 = r111111113;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier111111 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier111111)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d114 = new C40893d(16);
                                r19.m87172p0(c40893d114);
                                obj9 = c40893d114;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g19 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g19, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier111111;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function117 = function7;
                        Modifier modifier111112 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f116 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111113 = r19.m87165m();
                        Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(r19, modifierM3409f116);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a111119);
                        C0209i c0209i1111111110 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i1111111110, interfaceC28653p1M87165m1111113);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i1111111111 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i1111111111, modifierM118962N1111113);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function117;
                        modifier3 = modifier111112;
                        r10 = r111;
                    } else {
                        obj3 = obj2;
                    }
                    function6 = function5;
                    C39689b c39689b10 = new C39689b(goalSectionItemState, function6, 26);
                    r14.m87172p0(c39689b10);
                    obj4 = c39689b10;
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d110 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a1111110 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111114 = r14.m87165m();
                    Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(r14, modifierM44101d110);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a1111110);
                    C0209i c0209i1111111112 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i1111111112, interfaceC28653p1M87165m1111114);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i1111111113 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i1111111113, modifierM118962N1111114);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r211118 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r211118, 0, C2886a.f11498d << 18, 196602);
                        ?? r111111114 = r211118;
                        r111111114.m87173q(false);
                        r17 = r111111114;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r111111115 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r111111115);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f11112 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f11112, c2314t4));
                        ?? r211119 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f11112, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r211119, 384, 0);
                        ?? r111111116 = r211119;
                        r111111116.m87173q(false);
                        r18 = r111111116;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier111113 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier111113)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d115 = new C40893d(16);
                            r19.m87172p0(c40893d115);
                            obj9 = c40893d115;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g110 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g110, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier111113;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function118 = function7;
                    Modifier modifier111114 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f117 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a1111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111115 = r19.m87165m();
                    Modifier modifierM118962N1111115 = AbstractC37056f.m118962N(r19, modifierM3409f117);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a1111111);
                    C0209i c0209i1111111114 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i1111111114, interfaceC28653p1M87165m1111115);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i1111111115 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i1111111115, modifierM118962N1111115);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function118;
                    modifier3 = modifier111114;
                    r10 = r111;
                } else {
                    c28655q4.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                    r10 = c28655q4;
                }
                c28677v1M87180u = r10.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k(goalSectionItemState, modifier3, function3, interfaceC4339a3, i13, i14, 22);
                }
            }
            i28 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i28 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i28 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                obj = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == obj) {
                        obj11 = objM87133R5;
                        C40893d c40893d116 = new C40893d(15);
                        c28655q4.m87172p0(c40893d116);
                        obj11 = c40893d116;
                    }
                    obj11 = objM87133R5;
                    function4 = (Function1) obj11;
                } else {
                    function4 = function2;
                }
                if (i17 != 0) {
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == obj) {
                        obj10 = objM87133R4;
                        C40674e0 c40674e5 = new C40674e0(14);
                        c28655q4.m87172p0(c40674e5);
                        obj10 = c40674e5;
                    }
                    obj10 = objM87133R4;
                    interfaceC4339a4 = (InterfaceC4339a) obj10;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                id4 = goalSectionItemState.getId();
                if (id4 != null) {
                    String lowerCase6 = id4.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase6, "toLowerCase(...)");
                    strConcat = lowerCase6.concat("_edit_button");
                } else {
                    strConcat = null;
                }
                Modifier modifierM3409f118 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m123 = c28655q4.m87165m();
                Modifier modifierM118962N123 = AbstractC37056f.m118962N(c28655q4, modifierM3409f118);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                modifier4 = modifier2;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a8);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m123);
                c0209i3 = C0217k.f732j;
                function5 = function4;
                if (c28655q4.f115903S) {
                    obj2 = obj;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N123);
                    C22949e c22949e14 = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a1111112 = AbstractC22988p1.m66759a(c22949e14, c2306l2, c28655q4, 48);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111116 = c28655q4.m87165m();
                    interfaceC4339a5 = interfaceC4339a4;
                    Modifier modifierM118962N1111116 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1111112);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111116);
                    if (c28655q4.f115903S) {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111116);
                    titleImage = goalSectionItemState.getTitleImage();
                    c23000t1 = C23000t1.f90727a;
                    if (titleImage == null) {
                        modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                    } else {
                        modifierMo66772c = c2314t;
                    }
                    C22994r1 c22994r1M66759a1111113 = AbstractC22988p1.m66759a(c22949e14, c2306l2, c28655q4, 48);
                    Modifier modifier111115 = modifierMo66772c;
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111117 = c28655q4.m87165m();
                    c22949e = c22949e14;
                    Modifier modifierM118962N1111117 = AbstractC37056f.m118962N(c28655q4, modifier111115);
                    c28655q4.m87158i0();
                    c23000t2 = c23000t1;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1111113);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111117);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111117);
                    if (goalSectionItemState.getTitleImage() != null) {
                        c28655q4.m87150e0(-999861702);
                        AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                        c28655q4.m87173q(false);
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        r15 = 0;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        r14 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-999578641);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            c28655q4.m87150e0(-999527615);
                            if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                c28655q4.m87150e0(-999377141);
                                c0209i8 = c0209i4;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                C28655q c28655q11115 = c28655q4;
                                AbstractC31061c.m95650z(7, 4, c2314t2, c28655q11115, false);
                                z14 = false;
                                c28655q3 = c28655q11115;
                            } else {
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                c28655q4.m87150e0(-998874662);
                                float f11113 = 1;
                                z14 = false;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f11113 * 8, f11113, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                C28655q c28655q11116 = c28655q4;
                                c28655q11116.m87173q(false);
                                c28655q3 = c28655q11116;
                            }
                            c28655q3.m87173q(z14);
                            z13 = z14;
                            c28655q2 = c28655q3;
                        } else {
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            z13 = false;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            c28655q4.m87150e0(-998457712);
                            if (goalSectionItemState.getUseHeaderDividerV2()) {
                                c28655q4.m87150e0(-998368029);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q11117 = c28655q4;
                                c28655q11117.m87173q(false);
                                c28655q = c28655q11117;
                            } else {
                                c28655q4.m87150e0(-998177627);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q11118 = c28655q4;
                                c28655q11118.m87173q(false);
                                c28655q = c28655q11118;
                            }
                            c28655q.m87173q(false);
                            c28655q2 = c28655q;
                        }
                        c28655q2.m87173q(z13);
                        r15 = z13;
                        r14 = c28655q2;
                    }
                    r14.m87173q(true);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    } else {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    }
                    boolean zM87157i11 = r14.m87157i(goalSectionItemState);
                    i19 = i28 & 896;
                    if (i19 == 256) {
                        r16 = 1;
                    } else {
                        r16 = r15;
                    }
                    i24 = (zM87157i11 ? 1 : 0) | r16;
                    objM87133R = r14.m87133R();
                    if (i24 == 0) {
                        obj3 = obj2;
                        if (objM87133R == obj3) {
                            function6 = function5;
                            obj4 = objM87133R;
                        }
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d111 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a1111114 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111118 = r14.m87165m();
                        Modifier modifierM118962N1111118 = AbstractC37056f.m118962N(r14, modifierM44101d111);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a1111114);
                        C0209i c0209i1111111116 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i1111111116, interfaceC28653p1M87165m1111118);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i1111111117 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i1111111117, modifierM118962N1111118);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r2111110 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2111110, 0, C2886a.f11498d << 18, 196602);
                            ?? r111111117 = r2111110;
                            r111111117.m87173q(false);
                            r17 = r111111117;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r111111118 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r111111118);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f11114 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f11114, c2314t4));
                            ?? r2111111 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f11114, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2111111, 384, 0);
                            ?? r111111119 = r2111111;
                            r111111119.m87173q(false);
                            r18 = r111111119;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier111116 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier111116)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d117 = new C40893d(16);
                                r19.m87172p0(c40893d117);
                                obj9 = c40893d117;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g111 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g111, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier111116;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function119 = function7;
                        Modifier modifier111117 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f119 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a1111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111119 = r19.m87165m();
                        Modifier modifierM118962N1111119 = AbstractC37056f.m118962N(r19, modifierM3409f119);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a1111115);
                        C0209i c0209i1111111118 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i1111111118, interfaceC28653p1M87165m1111119);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i1111111119 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i1111111119, modifierM118962N1111119);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function119;
                        modifier3 = modifier111117;
                        r10 = r111;
                    } else {
                        obj3 = obj2;
                    }
                    function6 = function5;
                    C39689b c39689b11 = new C39689b(goalSectionItemState, function6, 26);
                    r14.m87172p0(c39689b11);
                    obj4 = c39689b11;
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d112 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a1111116 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111110 = r14.m87165m();
                    Modifier modifierM118962N11111110 = AbstractC37056f.m118962N(r14, modifierM44101d112);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a1111116);
                    C0209i c0209i11111111110 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i11111111110, interfaceC28653p1M87165m11111110);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i11111111111 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i11111111111, modifierM118962N11111110);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r2111112 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2111112, 0, C2886a.f11498d << 18, 196602);
                        ?? r1111111110 = r2111112;
                        r1111111110.m87173q(false);
                        r17 = r1111111110;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r1111111111 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r1111111111);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f11115 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f11115, c2314t4));
                        ?? r2111113 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f11115, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2111113, 384, 0);
                        ?? r1111111112 = r2111113;
                        r1111111112.m87173q(false);
                        r18 = r1111111112;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier111118 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier111118)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d118 = new C40893d(16);
                            r19.m87172p0(c40893d118);
                            obj9 = c40893d118;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g112 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g112, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier111118;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function1110 = function7;
                    Modifier modifier111119 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f1110 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a1111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111 = r19.m87165m();
                    Modifier modifierM118962N11111111 = AbstractC37056f.m118962N(r19, modifierM3409f1110);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a1111117);
                    C0209i c0209i11111111112 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i11111111112, interfaceC28653p1M87165m11111111);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i11111111113 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i11111111113, modifierM118962N11111111);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function1110;
                    modifier3 = modifier111119;
                    r10 = r111;
                } else {
                    obj2 = obj;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N123);
                C22949e c22949e15 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a1111118 = AbstractC22988p1.m66759a(c22949e15, c2306l2, c28655q4, 48);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111112 = c28655q4.m87165m();
                interfaceC4339a5 = interfaceC4339a4;
                Modifier modifierM118962N11111112 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1111118);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11111112);
                if (c28655q4.f115903S) {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11111112);
                titleImage = goalSectionItemState.getTitleImage();
                c23000t1 = C23000t1.f90727a;
                if (titleImage == null) {
                    modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                } else {
                    modifierMo66772c = c2314t;
                }
                C22994r1 c22994r1M66759a1111119 = AbstractC22988p1.m66759a(c22949e15, c2306l2, c28655q4, 48);
                Modifier modifier1111110 = modifierMo66772c;
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111113 = c28655q4.m87165m();
                c22949e = c22949e15;
                Modifier modifierM118962N11111113 = AbstractC37056f.m118962N(c28655q4, modifier1111110);
                c28655q4.m87158i0();
                c23000t2 = c23000t1;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1111119);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11111113);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11111113);
                if (goalSectionItemState.getTitleImage() != null) {
                    c28655q4.m87150e0(-999861702);
                    AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                    c28655q4.m87173q(false);
                    function5 = function5;
                    c2306l2 = c2306l2;
                    c0209i5 = c0209i5;
                    c0213j = c0213j;
                    c2314t2 = c2314t;
                    c0209i6 = c0209i2;
                    c0209i7 = c0209i;
                    c0209i8 = c0209i4;
                    r15 = 0;
                    modifier4 = modifier4;
                    obj2 = obj2;
                    c22949e = c22949e;
                    interfaceC4339a5 = interfaceC4339a5;
                    c23000t2 = c23000t2;
                    r14 = c28655q4;
                } else {
                    c28655q4.m87150e0(-999578641);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        c28655q4.m87150e0(-999527615);
                        if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                            c28655q4.m87150e0(-999377141);
                            c0209i8 = c0209i4;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                            C28655q c28655q11119 = c28655q4;
                            AbstractC31061c.m95650z(7, 4, c2314t2, c28655q11119, false);
                            z14 = false;
                            c28655q3 = c28655q11119;
                        } else {
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            c28655q4.m87150e0(-998874662);
                            float f11116 = 1;
                            z14 = false;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f11116 * 8, f11116, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                            C28655q c28655q111110 = c28655q4;
                            c28655q111110.m87173q(false);
                            c28655q3 = c28655q111110;
                        }
                        c28655q3.m87173q(z14);
                        z13 = z14;
                        c28655q2 = c28655q3;
                    } else {
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        z13 = false;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        c28655q4.m87150e0(-998457712);
                        if (goalSectionItemState.getUseHeaderDividerV2()) {
                            c28655q4.m87150e0(-998368029);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                            C28655q c28655q111111 = c28655q4;
                            c28655q111111.m87173q(false);
                            c28655q = c28655q111111;
                        } else {
                            c28655q4.m87150e0(-998177627);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                            C28655q c28655q111112 = c28655q4;
                            c28655q111112.m87173q(false);
                            c28655q = c28655q111112;
                        }
                        c28655q.m87173q(false);
                        c28655q2 = c28655q;
                    }
                    c28655q2.m87173q(z13);
                    r15 = z13;
                    r14 = c28655q2;
                }
                r14.m87173q(true);
                if (goalSectionItemState.getDisplayHeaderDivider()) {
                    r14.m87150e0(991675841);
                    r14.m87173q(r15);
                } else {
                    r14.m87150e0(991675841);
                    r14.m87173q(r15);
                }
                boolean zM87157i12 = r14.m87157i(goalSectionItemState);
                i19 = i28 & 896;
                if (i19 == 256) {
                    r16 = 1;
                } else {
                    r16 = r15;
                }
                i24 = (zM87157i12 ? 1 : 0) | r16;
                objM87133R = r14.m87133R();
                if (i24 == 0) {
                    obj3 = obj2;
                    if (objM87133R == obj3) {
                        function6 = function5;
                        obj4 = objM87133R;
                    }
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d113 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a11111110 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111114 = r14.m87165m();
                    Modifier modifierM118962N11111114 = AbstractC37056f.m118962N(r14, modifierM44101d113);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a11111110);
                    C0209i c0209i11111111114 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i11111111114, interfaceC28653p1M87165m11111114);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i11111111115 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i11111111115, modifierM118962N11111114);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r2111114 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2111114, 0, C2886a.f11498d << 18, 196602);
                        ?? r1111111113 = r2111114;
                        r1111111113.m87173q(false);
                        r17 = r1111111113;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r1111111114 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r1111111114);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f11117 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f11117, c2314t4));
                        ?? r2111115 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f11117, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2111115, 384, 0);
                        ?? r1111111115 = r2111115;
                        r1111111115.m87173q(false);
                        r18 = r1111111115;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier1111111 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier1111111)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d119 = new C40893d(16);
                            r19.m87172p0(c40893d119);
                            obj9 = c40893d119;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g113 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g113, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier1111111;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function1111 = function7;
                    Modifier modifier1111112 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f1111 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a11111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111115 = r19.m87165m();
                    Modifier modifierM118962N11111115 = AbstractC37056f.m118962N(r19, modifierM3409f1111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a11111111);
                    C0209i c0209i11111111116 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i11111111116, interfaceC28653p1M87165m11111115);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i11111111117 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i11111111117, modifierM118962N11111115);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function1111;
                    modifier3 = modifier1111112;
                    r10 = r111;
                } else {
                    obj3 = obj2;
                }
                function6 = function5;
                C39689b c39689b12 = new C39689b(goalSectionItemState, function6, 26);
                r14.m87172p0(c39689b12);
                obj4 = c39689b12;
                c2314t3 = c2314t2;
                Modifier modifierM44101d114 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                c22949e2 = c22949e;
                C22994r1 c22994r1M66759a11111112 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                iHashCode4 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111116 = r14.m87165m();
                Modifier modifierM118962N11111116 = AbstractC37056f.m118962N(r14, modifierM44101d114);
                r14.m87158i0();
                if (r14.f115903S) {
                    c0213j2 = c0213j;
                    r14.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    r14.m87178s0();
                }
                c0209i9 = c0209i7;
                AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a11111112);
                C0209i c0209i11111111118 = c0209i6;
                AbstractC28683x.m87239G(r14, c0209i11111111118, interfaceC28653p1M87165m11111116);
                if (r14.f115903S) {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                } else {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                }
                C0209i c0209i11111111119 = c0209i8;
                AbstractC28683x.m87239G(r14, c0209i11111111119, modifierM118962N11111116);
                if (goalSectionItemState.getActionText() != null) {
                    r14.m87150e0(1689087092);
                    ?? r2111116 = r14;
                    i25 = i19;
                    function7 = function6;
                    c0209i12 = c0209i9;
                    c22949e3 = c22949e2;
                    c2314t4 = c2314t3;
                    c0213j3 = c0213j2;
                    c0209i11 = c0209i10;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2111116, 0, C2886a.f11498d << 18, 196602);
                    ?? r1111111116 = r2111116;
                    r1111111116.m87173q(false);
                    r17 = r1111111116;
                } else {
                    i25 = i19;
                    c0209i11 = c0209i10;
                    function7 = function6;
                    c0213j3 = c0213j2;
                    c0209i12 = c0209i9;
                    c2314t4 = c2314t3;
                    ?? r1111111117 = r15;
                    c22949e3 = c22949e2;
                    r14.m87150e0(1689235644);
                    r14.m87173q(r1111111117);
                    r17 = r14;
                }
                if (goalSectionItemState.getIcon() != null) {
                    r17.m87150e0(1689305363);
                    float f11118 = 4;
                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f11118, c2314t4));
                    ?? r2111117 = r17;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f11118, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2111117, 384, 0);
                    ?? r1111111118 = r2111117;
                    r1111111118.m87173q(false);
                    r18 = r1111111118;
                } else {
                    r17.m87150e0(1689744540);
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(true);
                r18.m87173q(true);
                if (goalSectionItemState.getSubTitle() == null) {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                } else {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                }
                r19.m87150e0(-502100598);
                while (r2.hasNext()) {
                    Modifier modifier1111113 = modifier4;
                    AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier1111113)));
                    objM87133R2 = r19.m87133R();
                    obj8 = obj3;
                    if (objM87133R2 == obj8) {
                        obj9 = objM87133R2;
                        C40893d c40893d1110 = new C40893d(16);
                        r19.m87172p0(c40893d1110);
                        obj9 = c40893d1110;
                    }
                    obj9 = objM87133R2;
                    C25307p c25307pM74306g114 = p720m91.Function1.m74306g((Function1) obj9);
                    i27 = i25;
                    if (i27 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = r19.m87133R();
                    if (z16) {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    } else {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g114, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                    modifier4 = modifier1111113;
                    i25 = i27;
                    obj3 = obj8;
                    function7 = function8;
                }
                Function1 function1112 = function7;
                Modifier modifier1111114 = modifier4;
                obj5 = obj3;
                r19.m87173q(false);
                if (goalSectionItemState.getCallout() != null) {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                } else {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                }
                Modifier modifierM3409f1112 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C22994r1 c22994r1M66759a11111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                iHashCode5 = Long.hashCode(r19.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111117 = r19.m87165m();
                Modifier modifierM118962N11111117 = AbstractC37056f.m118962N(r19, modifierM3409f1112);
                InterfaceC0221l.f734a.getClass();
                c0213j4 = C0217k.f724b;
                r19.m87158i0();
                if (r19.f115903S) {
                    r19.m87163l(c0213j4);
                } else {
                    r19.m87178s0();
                }
                c0209i13 = C0217k.f729g;
                AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a11111113);
                C0209i c0209i111111111110 = C0217k.f728f;
                AbstractC28683x.m87239G(r19, c0209i111111111110, interfaceC28653p1M87165m11111117);
                c0209i14 = C0217k.f732j;
                if (r19.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                }
                C0209i c0209i111111111111 = C0217k.f726d;
                AbstractC28683x.m87239G(r19, c0209i111111111111, modifierM118962N11111117);
                if (goalSectionItemState.getCallout() != null) {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                } else {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                }
                if (goalSectionItemState.getLinkText() != null) {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                }
                r111.m87173q(z15);
                r111.m87173q(z15);
                interfaceC4339a3 = interfaceC4339a6;
                function3 = function1112;
                modifier3 = modifier1111114;
                r10 = r111;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
                r10 = c28655q4;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(goalSectionItemState, modifier3, function3, interfaceC4339a3, i13, i14, 22);
            }
        }
        i28 |= 384;
        function2 = function1;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q4.m87157i(interfaceC4339a2)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i28 |= i18;
            }
            if ((i28 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i28 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                obj = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == obj) {
                        obj11 = objM87133R5;
                        C40893d c40893d1111 = new C40893d(15);
                        c28655q4.m87172p0(c40893d1111);
                        obj11 = c40893d1111;
                    }
                    obj11 = objM87133R5;
                    function4 = (Function1) obj11;
                } else {
                    function4 = function2;
                }
                if (i17 != 0) {
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == obj) {
                        obj10 = objM87133R4;
                        C40674e0 c40674e6 = new C40674e0(14);
                        c28655q4.m87172p0(c40674e6);
                        obj10 = c40674e6;
                    }
                    obj10 = objM87133R4;
                    interfaceC4339a4 = (InterfaceC4339a) obj10;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                id4 = goalSectionItemState.getId();
                if (id4 != null) {
                    String lowerCase7 = id4.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase7, "toLowerCase(...)");
                    strConcat = lowerCase7.concat("_edit_button");
                } else {
                    strConcat = null;
                }
                Modifier modifierM3409f1113 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m124 = c28655q4.m87165m();
                Modifier modifierM118962N124 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1113);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                modifier4 = modifier2;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a9);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m124);
                c0209i3 = C0217k.f732j;
                function5 = function4;
                if (c28655q4.f115903S) {
                    obj2 = obj;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N124);
                    C22949e c22949e16 = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a11111114 = AbstractC22988p1.m66759a(c22949e16, c2306l2, c28655q4, 48);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111118 = c28655q4.m87165m();
                    interfaceC4339a5 = interfaceC4339a4;
                    Modifier modifierM118962N11111118 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a11111114);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11111118);
                    if (c28655q4.f115903S) {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11111118);
                    titleImage = goalSectionItemState.getTitleImage();
                    c23000t1 = C23000t1.f90727a;
                    if (titleImage == null) {
                        modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                    } else {
                        modifierMo66772c = c2314t;
                    }
                    C22994r1 c22994r1M66759a11111115 = AbstractC22988p1.m66759a(c22949e16, c2306l2, c28655q4, 48);
                    Modifier modifier1111115 = modifierMo66772c;
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111119 = c28655q4.m87165m();
                    c22949e = c22949e16;
                    Modifier modifierM118962N11111119 = AbstractC37056f.m118962N(c28655q4, modifier1111115);
                    c28655q4.m87158i0();
                    c23000t2 = c23000t1;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a11111115);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11111119);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11111119);
                    if (goalSectionItemState.getTitleImage() != null) {
                        c28655q4.m87150e0(-999861702);
                        AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                        c28655q4.m87173q(false);
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        r15 = 0;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        r14 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-999578641);
                        if (goalSectionItemState.getDisplayHeaderDivider()) {
                            c28655q4.m87150e0(-999527615);
                            if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                                c28655q4.m87150e0(-999377141);
                                c0209i8 = c0209i4;
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                                C28655q c28655q111113 = c28655q4;
                                AbstractC31061c.m95650z(7, 4, c2314t2, c28655q111113, false);
                                z14 = false;
                                c28655q3 = c28655q111113;
                            } else {
                                c2314t2 = c2314t;
                                c0209i6 = c0209i2;
                                c0209i7 = c0209i;
                                c0209i8 = c0209i4;
                                c28655q4.m87150e0(-998874662);
                                float f11119 = 1;
                                z14 = false;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f11119 * 8, f11119, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                                C28655q c28655q111114 = c28655q4;
                                c28655q111114.m87173q(false);
                                c28655q3 = c28655q111114;
                            }
                            c28655q3.m87173q(z14);
                            z13 = z14;
                            c28655q2 = c28655q3;
                        } else {
                            function5 = function5;
                            c2306l2 = c2306l2;
                            c0209i5 = c0209i5;
                            c0213j = c0213j;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            z13 = false;
                            modifier4 = modifier4;
                            obj2 = obj2;
                            c22949e = c22949e;
                            interfaceC4339a5 = interfaceC4339a5;
                            c23000t2 = c23000t2;
                            c28655q4.m87150e0(-998457712);
                            if (goalSectionItemState.getUseHeaderDividerV2()) {
                                c28655q4.m87150e0(-998368029);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q111115 = c28655q4;
                                c28655q111115.m87173q(false);
                                c28655q = c28655q111115;
                            } else {
                                c28655q4.m87150e0(-998177627);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                                C28655q c28655q111116 = c28655q4;
                                c28655q111116.m87173q(false);
                                c28655q = c28655q111116;
                            }
                            c28655q.m87173q(false);
                            c28655q2 = c28655q;
                        }
                        c28655q2.m87173q(z13);
                        r15 = z13;
                        r14 = c28655q2;
                    }
                    r14.m87173q(true);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    } else {
                        r14.m87150e0(991675841);
                        r14.m87173q(r15);
                    }
                    boolean zM87157i13 = r14.m87157i(goalSectionItemState);
                    i19 = i28 & 896;
                    if (i19 == 256) {
                        r16 = 1;
                    } else {
                        r16 = r15;
                    }
                    i24 = (zM87157i13 ? 1 : 0) | r16;
                    objM87133R = r14.m87133R();
                    if (i24 == 0) {
                        obj3 = obj2;
                        if (objM87133R == obj3) {
                            function6 = function5;
                            obj4 = objM87133R;
                        }
                        c2314t3 = c2314t2;
                        Modifier modifierM44101d115 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                        c22949e2 = c22949e;
                        C22994r1 c22994r1M66759a11111116 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111110 = r14.m87165m();
                        Modifier modifierM118962N111111110 = AbstractC37056f.m118962N(r14, modifierM44101d115);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            c0213j2 = c0213j;
                            r14.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            r14.m87178s0();
                        }
                        c0209i9 = c0209i7;
                        AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a11111116);
                        C0209i c0209i111111111112 = c0209i6;
                        AbstractC28683x.m87239G(r14, c0209i111111111112, interfaceC28653p1M87165m111111110);
                        if (r14.f115903S) {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        } else {
                            c0209i10 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                        }
                        C0209i c0209i111111111113 = c0209i8;
                        AbstractC28683x.m87239G(r14, c0209i111111111113, modifierM118962N111111110);
                        if (goalSectionItemState.getActionText() != null) {
                            r14.m87150e0(1689087092);
                            ?? r2111118 = r14;
                            i25 = i19;
                            function7 = function6;
                            c0209i12 = c0209i9;
                            c22949e3 = c22949e2;
                            c2314t4 = c2314t3;
                            c0213j3 = c0213j2;
                            c0209i11 = c0209i10;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r2111118, 0, C2886a.f11498d << 18, 196602);
                            ?? r1111111119 = r2111118;
                            r1111111119.m87173q(false);
                            r17 = r1111111119;
                        } else {
                            i25 = i19;
                            c0209i11 = c0209i10;
                            function7 = function6;
                            c0213j3 = c0213j2;
                            c0209i12 = c0209i9;
                            c2314t4 = c2314t3;
                            ?? r11111111110 = r15;
                            c22949e3 = c22949e2;
                            r14.m87150e0(1689235644);
                            r14.m87173q(r11111111110);
                            r17 = r14;
                        }
                        if (goalSectionItemState.getIcon() != null) {
                            r17.m87150e0(1689305363);
                            float f111110 = 4;
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f111110, c2314t4));
                            ?? r2111119 = r17;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f111110, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r2111119, 384, 0);
                            ?? r11111111111 = r2111119;
                            r11111111111.m87173q(false);
                            r18 = r11111111111;
                        } else {
                            r17.m87150e0(1689744540);
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(true);
                        r18.m87173q(true);
                        if (goalSectionItemState.getSubTitle() == null) {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        } else {
                            c2306l = c2306l2;
                            i26 = 48;
                            r18.m87150e0(1614693949);
                            r18.m87173q(false);
                            r19 = r18;
                        }
                        r19.m87150e0(-502100598);
                        while (r2.hasNext()) {
                            Modifier modifier1111116 = modifier4;
                            AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier1111116)));
                            objM87133R2 = r19.m87133R();
                            obj8 = obj3;
                            if (objM87133R2 == obj8) {
                                obj9 = objM87133R2;
                                C40893d c40893d1112 = new C40893d(16);
                                r19.m87172p0(c40893d1112);
                                obj9 = c40893d1112;
                            }
                            obj9 = objM87133R2;
                            C25307p c25307pM74306g115 = p720m91.Function1.m74306g((Function1) obj9);
                            i27 = i25;
                            if (i27 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = r19.m87133R();
                            if (z16) {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                                objM87133R3 = new C41067a(function8, 1);
                                r19.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g115, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                            modifier4 = modifier1111116;
                            i25 = i27;
                            obj3 = obj8;
                            function7 = function8;
                        }
                        Function1 function1113 = function7;
                        Modifier modifier1111117 = modifier4;
                        obj5 = obj3;
                        r19.m87173q(false);
                        if (goalSectionItemState.getCallout() != null) {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        } else {
                            r19.m87150e0(1615423069);
                            r19.m87173q(false);
                        }
                        Modifier modifierM3409f1114 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        C22994r1 c22994r1M66759a11111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                        iHashCode5 = Long.hashCode(r19.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111111 = r19.m87165m();
                        Modifier modifierM118962N111111111 = AbstractC37056f.m118962N(r19, modifierM3409f1114);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r19.m87158i0();
                        if (r19.f115903S) {
                            r19.m87163l(c0213j4);
                        } else {
                            r19.m87178s0();
                        }
                        c0209i13 = C0217k.f729g;
                        AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a11111117);
                        C0209i c0209i111111111114 = C0217k.f728f;
                        AbstractC28683x.m87239G(r19, c0209i111111111114, interfaceC28653p1M87165m111111111);
                        c0209i14 = C0217k.f732j;
                        if (r19.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                        }
                        C0209i c0209i111111111115 = C0217k.f726d;
                        AbstractC28683x.m87239G(r19, c0209i111111111115, modifierM118962N111111111);
                        if (goalSectionItemState.getCallout() != null) {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        } else {
                            c0213j5 = c0213j4;
                            c0209i15 = c0209i13;
                            obj6 = obj5;
                            c23000t3 = c23000t2;
                            r19.m87150e0(637182520);
                            r19.m87173q(false);
                            r110 = r19;
                        }
                        if (goalSectionItemState.getLinkText() != null) {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                            z15 = true;
                            r110.m87150e0(637966386);
                            AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                            r110.m87173q(false);
                            r111 = r110;
                        }
                        r111.m87173q(z15);
                        r111.m87173q(z15);
                        interfaceC4339a3 = interfaceC4339a6;
                        function3 = function1113;
                        modifier3 = modifier1111117;
                        r10 = r111;
                    } else {
                        obj3 = obj2;
                    }
                    function6 = function5;
                    C39689b c39689b13 = new C39689b(goalSectionItemState, function6, 26);
                    r14.m87172p0(c39689b13);
                    obj4 = c39689b13;
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d116 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a11111118 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111112 = r14.m87165m();
                    Modifier modifierM118962N111111112 = AbstractC37056f.m118962N(r14, modifierM44101d116);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a11111118);
                    C0209i c0209i111111111116 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i111111111116, interfaceC28653p1M87165m111111112);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i111111111117 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i111111111117, modifierM118962N111111112);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r21111110 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21111110, 0, C2886a.f11498d << 18, 196602);
                        ?? r11111111112 = r21111110;
                        r11111111112.m87173q(false);
                        r17 = r11111111112;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r11111111113 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r11111111113);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f111111 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f111111, c2314t4));
                        ?? r21111111 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f111111, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21111111, 384, 0);
                        ?? r11111111114 = r21111111;
                        r11111111114.m87173q(false);
                        r18 = r11111111114;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier1111118 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier1111118)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d1113 = new C40893d(16);
                            r19.m87172p0(c40893d1113);
                            obj9 = c40893d1113;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g116 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g116, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier1111118;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function1114 = function7;
                    Modifier modifier1111119 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f1115 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a11111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111113 = r19.m87165m();
                    Modifier modifierM118962N111111113 = AbstractC37056f.m118962N(r19, modifierM3409f1115);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a11111119);
                    C0209i c0209i111111111118 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i111111111118, interfaceC28653p1M87165m111111113);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i111111111119 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i111111111119, modifierM118962N111111113);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function1114;
                    modifier3 = modifier1111119;
                    r10 = r111;
                } else {
                    obj2 = obj;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N124);
                C22949e c22949e17 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a111111110 = AbstractC22988p1.m66759a(c22949e17, c2306l2, c28655q4, 48);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111114 = c28655q4.m87165m();
                interfaceC4339a5 = interfaceC4339a4;
                Modifier modifierM118962N111111114 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111111110);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111111114);
                if (c28655q4.f115903S) {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111111114);
                titleImage = goalSectionItemState.getTitleImage();
                c23000t1 = C23000t1.f90727a;
                if (titleImage == null) {
                    modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                } else {
                    modifierMo66772c = c2314t;
                }
                C22994r1 c22994r1M66759a111111111 = AbstractC22988p1.m66759a(c22949e17, c2306l2, c28655q4, 48);
                Modifier modifier11111110 = modifierMo66772c;
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111115 = c28655q4.m87165m();
                c22949e = c22949e17;
                Modifier modifierM118962N111111115 = AbstractC37056f.m118962N(c28655q4, modifier11111110);
                c28655q4.m87158i0();
                c23000t2 = c23000t1;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111111111);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111111115);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111111115);
                if (goalSectionItemState.getTitleImage() != null) {
                    c28655q4.m87150e0(-999861702);
                    AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                    c28655q4.m87173q(false);
                    function5 = function5;
                    c2306l2 = c2306l2;
                    c0209i5 = c0209i5;
                    c0213j = c0213j;
                    c2314t2 = c2314t;
                    c0209i6 = c0209i2;
                    c0209i7 = c0209i;
                    c0209i8 = c0209i4;
                    r15 = 0;
                    modifier4 = modifier4;
                    obj2 = obj2;
                    c22949e = c22949e;
                    interfaceC4339a5 = interfaceC4339a5;
                    c23000t2 = c23000t2;
                    r14 = c28655q4;
                } else {
                    c28655q4.m87150e0(-999578641);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        c28655q4.m87150e0(-999527615);
                        if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                            c28655q4.m87150e0(-999377141);
                            c0209i8 = c0209i4;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                            C28655q c28655q111117 = c28655q4;
                            AbstractC31061c.m95650z(7, 4, c2314t2, c28655q111117, false);
                            z14 = false;
                            c28655q3 = c28655q111117;
                        } else {
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            c28655q4.m87150e0(-998874662);
                            float f111112 = 1;
                            z14 = false;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f111112 * 8, f111112, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                            C28655q c28655q111118 = c28655q4;
                            c28655q111118.m87173q(false);
                            c28655q3 = c28655q111118;
                        }
                        c28655q3.m87173q(z14);
                        z13 = z14;
                        c28655q2 = c28655q3;
                    } else {
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        z13 = false;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        c28655q4.m87150e0(-998457712);
                        if (goalSectionItemState.getUseHeaderDividerV2()) {
                            c28655q4.m87150e0(-998368029);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                            C28655q c28655q111119 = c28655q4;
                            c28655q111119.m87173q(false);
                            c28655q = c28655q111119;
                        } else {
                            c28655q4.m87150e0(-998177627);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                            C28655q c28655q1111110 = c28655q4;
                            c28655q1111110.m87173q(false);
                            c28655q = c28655q1111110;
                        }
                        c28655q.m87173q(false);
                        c28655q2 = c28655q;
                    }
                    c28655q2.m87173q(z13);
                    r15 = z13;
                    r14 = c28655q2;
                }
                r14.m87173q(true);
                if (goalSectionItemState.getDisplayHeaderDivider()) {
                    r14.m87150e0(991675841);
                    r14.m87173q(r15);
                } else {
                    r14.m87150e0(991675841);
                    r14.m87173q(r15);
                }
                boolean zM87157i14 = r14.m87157i(goalSectionItemState);
                i19 = i28 & 896;
                if (i19 == 256) {
                    r16 = 1;
                } else {
                    r16 = r15;
                }
                i24 = (zM87157i14 ? 1 : 0) | r16;
                objM87133R = r14.m87133R();
                if (i24 == 0) {
                    obj3 = obj2;
                    if (objM87133R == obj3) {
                        function6 = function5;
                        obj4 = objM87133R;
                    }
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d117 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a111111112 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111116 = r14.m87165m();
                    Modifier modifierM118962N111111116 = AbstractC37056f.m118962N(r14, modifierM44101d117);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a111111112);
                    C0209i c0209i1111111111110 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i1111111111110, interfaceC28653p1M87165m111111116);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i1111111111111 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i1111111111111, modifierM118962N111111116);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r21111112 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21111112, 0, C2886a.f11498d << 18, 196602);
                        ?? r11111111115 = r21111112;
                        r11111111115.m87173q(false);
                        r17 = r11111111115;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r11111111116 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r11111111116);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f111113 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f111113, c2314t4));
                        ?? r21111113 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f111113, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21111113, 384, 0);
                        ?? r11111111117 = r21111113;
                        r11111111117.m87173q(false);
                        r18 = r11111111117;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier11111111 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier11111111)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d1114 = new C40893d(16);
                            r19.m87172p0(c40893d1114);
                            obj9 = c40893d1114;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g117 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g117, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier11111111;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function1115 = function7;
                    Modifier modifier11111112 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f1116 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a111111113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111117 = r19.m87165m();
                    Modifier modifierM118962N111111117 = AbstractC37056f.m118962N(r19, modifierM3409f1116);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a111111113);
                    C0209i c0209i1111111111112 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i1111111111112, interfaceC28653p1M87165m111111117);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i1111111111113 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i1111111111113, modifierM118962N111111117);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function1115;
                    modifier3 = modifier11111112;
                    r10 = r111;
                } else {
                    obj3 = obj2;
                }
                function6 = function5;
                C39689b c39689b14 = new C39689b(goalSectionItemState, function6, 26);
                r14.m87172p0(c39689b14);
                obj4 = c39689b14;
                c2314t3 = c2314t2;
                Modifier modifierM44101d118 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                c22949e2 = c22949e;
                C22994r1 c22994r1M66759a111111114 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                iHashCode4 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111118 = r14.m87165m();
                Modifier modifierM118962N111111118 = AbstractC37056f.m118962N(r14, modifierM44101d118);
                r14.m87158i0();
                if (r14.f115903S) {
                    c0213j2 = c0213j;
                    r14.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    r14.m87178s0();
                }
                c0209i9 = c0209i7;
                AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a111111114);
                C0209i c0209i1111111111114 = c0209i6;
                AbstractC28683x.m87239G(r14, c0209i1111111111114, interfaceC28653p1M87165m111111118);
                if (r14.f115903S) {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                } else {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                }
                C0209i c0209i1111111111115 = c0209i8;
                AbstractC28683x.m87239G(r14, c0209i1111111111115, modifierM118962N111111118);
                if (goalSectionItemState.getActionText() != null) {
                    r14.m87150e0(1689087092);
                    ?? r21111114 = r14;
                    i25 = i19;
                    function7 = function6;
                    c0209i12 = c0209i9;
                    c22949e3 = c22949e2;
                    c2314t4 = c2314t3;
                    c0213j3 = c0213j2;
                    c0209i11 = c0209i10;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21111114, 0, C2886a.f11498d << 18, 196602);
                    ?? r11111111118 = r21111114;
                    r11111111118.m87173q(false);
                    r17 = r11111111118;
                } else {
                    i25 = i19;
                    c0209i11 = c0209i10;
                    function7 = function6;
                    c0213j3 = c0213j2;
                    c0209i12 = c0209i9;
                    c2314t4 = c2314t3;
                    ?? r11111111119 = r15;
                    c22949e3 = c22949e2;
                    r14.m87150e0(1689235644);
                    r14.m87173q(r11111111119);
                    r17 = r14;
                }
                if (goalSectionItemState.getIcon() != null) {
                    r17.m87150e0(1689305363);
                    float f111114 = 4;
                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f111114, c2314t4));
                    ?? r21111115 = r17;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f111114, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21111115, 384, 0);
                    ?? r111111111110 = r21111115;
                    r111111111110.m87173q(false);
                    r18 = r111111111110;
                } else {
                    r17.m87150e0(1689744540);
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(true);
                r18.m87173q(true);
                if (goalSectionItemState.getSubTitle() == null) {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                } else {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                }
                r19.m87150e0(-502100598);
                while (r2.hasNext()) {
                    Modifier modifier11111113 = modifier4;
                    AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier11111113)));
                    objM87133R2 = r19.m87133R();
                    obj8 = obj3;
                    if (objM87133R2 == obj8) {
                        obj9 = objM87133R2;
                        C40893d c40893d1115 = new C40893d(16);
                        r19.m87172p0(c40893d1115);
                        obj9 = c40893d1115;
                    }
                    obj9 = objM87133R2;
                    C25307p c25307pM74306g118 = p720m91.Function1.m74306g((Function1) obj9);
                    i27 = i25;
                    if (i27 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = r19.m87133R();
                    if (z16) {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    } else {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g118, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                    modifier4 = modifier11111113;
                    i25 = i27;
                    obj3 = obj8;
                    function7 = function8;
                }
                Function1 function1116 = function7;
                Modifier modifier11111114 = modifier4;
                obj5 = obj3;
                r19.m87173q(false);
                if (goalSectionItemState.getCallout() != null) {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                } else {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                }
                Modifier modifierM3409f1117 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C22994r1 c22994r1M66759a111111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                iHashCode5 = Long.hashCode(r19.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111119 = r19.m87165m();
                Modifier modifierM118962N111111119 = AbstractC37056f.m118962N(r19, modifierM3409f1117);
                InterfaceC0221l.f734a.getClass();
                c0213j4 = C0217k.f724b;
                r19.m87158i0();
                if (r19.f115903S) {
                    r19.m87163l(c0213j4);
                } else {
                    r19.m87178s0();
                }
                c0209i13 = C0217k.f729g;
                AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a111111115);
                C0209i c0209i1111111111116 = C0217k.f728f;
                AbstractC28683x.m87239G(r19, c0209i1111111111116, interfaceC28653p1M87165m111111119);
                c0209i14 = C0217k.f732j;
                if (r19.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                }
                C0209i c0209i1111111111117 = C0217k.f726d;
                AbstractC28683x.m87239G(r19, c0209i1111111111117, modifierM118962N111111119);
                if (goalSectionItemState.getCallout() != null) {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                } else {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                }
                if (goalSectionItemState.getLinkText() != null) {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                }
                r111.m87173q(z15);
                r111.m87173q(z15);
                interfaceC4339a3 = interfaceC4339a6;
                function3 = function1116;
                modifier3 = modifier11111114;
                r10 = r111;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
                r10 = c28655q4;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(goalSectionItemState, modifier3, function3, interfaceC4339a3, i13, i14, 22);
            }
        }
        i28 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i28 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i28 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier2 = c2314t;
            }
            obj = C28635l.f115821a;
            if (i15 != 0) {
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == obj) {
                    obj11 = objM87133R5;
                    C40893d c40893d1116 = new C40893d(15);
                    c28655q4.m87172p0(c40893d1116);
                    obj11 = c40893d1116;
                }
                obj11 = objM87133R5;
                function4 = (Function1) obj11;
            } else {
                function4 = function2;
            }
            if (i17 != 0) {
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == obj) {
                    obj10 = objM87133R4;
                    C40674e0 c40674e7 = new C40674e0(14);
                    c28655q4.m87172p0(c40674e7);
                    obj10 = c40674e7;
                }
                obj10 = objM87133R4;
                interfaceC4339a4 = (InterfaceC4339a) obj10;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            id4 = goalSectionItemState.getId();
            if (id4 != null) {
                String lowerCase8 = id4.toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase8, "toLowerCase(...)");
                strConcat = lowerCase8.concat("_edit_button");
            } else {
                strConcat = null;
            }
            Modifier modifierM3409f1118 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q4, 0);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m125 = c28655q4.m87165m();
            Modifier modifierM118962N125 = AbstractC37056f.m118962N(c28655q4, modifierM3409f1118);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            modifier4 = modifier2;
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a10);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m125);
            c0209i3 = C0217k.f732j;
            function5 = function4;
            if (c28655q4.f115903S) {
                obj2 = obj;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N125);
                C22949e c22949e18 = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a111111116 = AbstractC22988p1.m66759a(c22949e18, c2306l2, c28655q4, 48);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111110 = c28655q4.m87165m();
                interfaceC4339a5 = interfaceC4339a4;
                Modifier modifierM118962N1111111110 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111111116);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111111110);
                if (c28655q4.f115903S) {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111111110);
                titleImage = goalSectionItemState.getTitleImage();
                c23000t1 = C23000t1.f90727a;
                if (titleImage == null) {
                    modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                } else {
                    modifierMo66772c = c2314t;
                }
                C22994r1 c22994r1M66759a111111117 = AbstractC22988p1.m66759a(c22949e18, c2306l2, c28655q4, 48);
                Modifier modifier11111115 = modifierMo66772c;
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111111 = c28655q4.m87165m();
                c22949e = c22949e18;
                Modifier modifierM118962N1111111111 = AbstractC37056f.m118962N(c28655q4, modifier11111115);
                c28655q4.m87158i0();
                c23000t2 = c23000t1;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a111111117);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111111111);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111111111);
                if (goalSectionItemState.getTitleImage() != null) {
                    c28655q4.m87150e0(-999861702);
                    AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                    c28655q4.m87173q(false);
                    function5 = function5;
                    c2306l2 = c2306l2;
                    c0209i5 = c0209i5;
                    c0213j = c0213j;
                    c2314t2 = c2314t;
                    c0209i6 = c0209i2;
                    c0209i7 = c0209i;
                    c0209i8 = c0209i4;
                    r15 = 0;
                    modifier4 = modifier4;
                    obj2 = obj2;
                    c22949e = c22949e;
                    interfaceC4339a5 = interfaceC4339a5;
                    c23000t2 = c23000t2;
                    r14 = c28655q4;
                } else {
                    c28655q4.m87150e0(-999578641);
                    if (goalSectionItemState.getDisplayHeaderDivider()) {
                        c28655q4.m87150e0(-999527615);
                        if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                            c28655q4.m87150e0(-999377141);
                            c0209i8 = c0209i4;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                            C28655q c28655q1111111 = c28655q4;
                            AbstractC31061c.m95650z(7, 4, c2314t2, c28655q1111111, false);
                            z14 = false;
                            c28655q3 = c28655q1111111;
                        } else {
                            c2314t2 = c2314t;
                            c0209i6 = c0209i2;
                            c0209i7 = c0209i;
                            c0209i8 = c0209i4;
                            c28655q4.m87150e0(-998874662);
                            float f111115 = 1;
                            z14 = false;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f111115 * 8, f111115, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                            C28655q c28655q1111112 = c28655q4;
                            c28655q1111112.m87173q(false);
                            c28655q3 = c28655q1111112;
                        }
                        c28655q3.m87173q(z14);
                        z13 = z14;
                        c28655q2 = c28655q3;
                    } else {
                        function5 = function5;
                        c2306l2 = c2306l2;
                        c0209i5 = c0209i5;
                        c0213j = c0213j;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        z13 = false;
                        modifier4 = modifier4;
                        obj2 = obj2;
                        c22949e = c22949e;
                        interfaceC4339a5 = interfaceC4339a5;
                        c23000t2 = c23000t2;
                        c28655q4.m87150e0(-998457712);
                        if (goalSectionItemState.getUseHeaderDividerV2()) {
                            c28655q4.m87150e0(-998368029);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                            C28655q c28655q1111113 = c28655q4;
                            c28655q1111113.m87173q(false);
                            c28655q = c28655q1111113;
                        } else {
                            c28655q4.m87150e0(-998177627);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                            C28655q c28655q1111114 = c28655q4;
                            c28655q1111114.m87173q(false);
                            c28655q = c28655q1111114;
                        }
                        c28655q.m87173q(false);
                        c28655q2 = c28655q;
                    }
                    c28655q2.m87173q(z13);
                    r15 = z13;
                    r14 = c28655q2;
                }
                r14.m87173q(true);
                if (goalSectionItemState.getDisplayHeaderDivider()) {
                    r14.m87150e0(991675841);
                    r14.m87173q(r15);
                } else {
                    r14.m87150e0(991675841);
                    r14.m87173q(r15);
                }
                boolean zM87157i15 = r14.m87157i(goalSectionItemState);
                i19 = i28 & 896;
                if (i19 == 256) {
                    r16 = 1;
                } else {
                    r16 = r15;
                }
                i24 = (zM87157i15 ? 1 : 0) | r16;
                objM87133R = r14.m87133R();
                if (i24 == 0) {
                    obj3 = obj2;
                    if (objM87133R == obj3) {
                        function6 = function5;
                        obj4 = objM87133R;
                    }
                    c2314t3 = c2314t2;
                    Modifier modifierM44101d119 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                    c22949e2 = c22949e;
                    C22994r1 c22994r1M66759a111111118 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111112 = r14.m87165m();
                    Modifier modifierM118962N1111111112 = AbstractC37056f.m118962N(r14, modifierM44101d119);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    c0209i9 = c0209i7;
                    AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a111111118);
                    C0209i c0209i1111111111118 = c0209i6;
                    AbstractC28683x.m87239G(r14, c0209i1111111111118, interfaceC28653p1M87165m1111111112);
                    if (r14.f115903S) {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    } else {
                        c0209i10 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                    }
                    C0209i c0209i1111111111119 = c0209i8;
                    AbstractC28683x.m87239G(r14, c0209i1111111111119, modifierM118962N1111111112);
                    if (goalSectionItemState.getActionText() != null) {
                        r14.m87150e0(1689087092);
                        ?? r21111116 = r14;
                        i25 = i19;
                        function7 = function6;
                        c0209i12 = c0209i9;
                        c22949e3 = c22949e2;
                        c2314t4 = c2314t3;
                        c0213j3 = c0213j2;
                        c0209i11 = c0209i10;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21111116, 0, C2886a.f11498d << 18, 196602);
                        ?? r111111111111 = r21111116;
                        r111111111111.m87173q(false);
                        r17 = r111111111111;
                    } else {
                        i25 = i19;
                        c0209i11 = c0209i10;
                        function7 = function6;
                        c0213j3 = c0213j2;
                        c0209i12 = c0209i9;
                        c2314t4 = c2314t3;
                        ?? r111111111112 = r15;
                        c22949e3 = c22949e2;
                        r14.m87150e0(1689235644);
                        r14.m87173q(r111111111112);
                        r17 = r14;
                    }
                    if (goalSectionItemState.getIcon() != null) {
                        r17.m87150e0(1689305363);
                        float f111116 = 4;
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f111116, c2314t4));
                        ?? r21111117 = r17;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f111116, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21111117, 384, 0);
                        ?? r111111111113 = r21111117;
                        r111111111113.m87173q(false);
                        r18 = r111111111113;
                    } else {
                        r17.m87150e0(1689744540);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    r18.m87173q(true);
                    if (goalSectionItemState.getSubTitle() == null) {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    } else {
                        c2306l = c2306l2;
                        i26 = 48;
                        r18.m87150e0(1614693949);
                        r18.m87173q(false);
                        r19 = r18;
                    }
                    r19.m87150e0(-502100598);
                    while (r2.hasNext()) {
                        Modifier modifier11111116 = modifier4;
                        AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier11111116)));
                        objM87133R2 = r19.m87133R();
                        obj8 = obj3;
                        if (objM87133R2 == obj8) {
                            obj9 = objM87133R2;
                            C40893d c40893d1117 = new C40893d(16);
                            r19.m87172p0(c40893d1117);
                            obj9 = c40893d1117;
                        }
                        obj9 = objM87133R2;
                        C25307p c25307pM74306g119 = p720m91.Function1.m74306g((Function1) obj9);
                        i27 = i25;
                        if (i27 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = r19.m87133R();
                        if (z16) {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C41067a(function8, 1);
                            r19.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g119, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                        modifier4 = modifier11111116;
                        i25 = i27;
                        obj3 = obj8;
                        function7 = function8;
                    }
                    Function1 function1117 = function7;
                    Modifier modifier11111117 = modifier4;
                    obj5 = obj3;
                    r19.m87173q(false);
                    if (goalSectionItemState.getCallout() != null) {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    } else {
                        r19.m87150e0(1615423069);
                        r19.m87173q(false);
                    }
                    Modifier modifierM3409f1119 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    C22994r1 c22994r1M66759a111111119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                    iHashCode5 = Long.hashCode(r19.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111113 = r19.m87165m();
                    Modifier modifierM118962N1111111113 = AbstractC37056f.m118962N(r19, modifierM3409f1119);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r19.m87158i0();
                    if (r19.f115903S) {
                        r19.m87163l(c0213j4);
                    } else {
                        r19.m87178s0();
                    }
                    c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a111111119);
                    C0209i c0209i11111111111110 = C0217k.f728f;
                    AbstractC28683x.m87239G(r19, c0209i11111111111110, interfaceC28653p1M87165m1111111113);
                    c0209i14 = C0217k.f732j;
                    if (r19.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                    }
                    C0209i c0209i11111111111111 = C0217k.f726d;
                    AbstractC28683x.m87239G(r19, c0209i11111111111111, modifierM118962N1111111113);
                    if (goalSectionItemState.getCallout() != null) {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    } else {
                        c0213j5 = c0213j4;
                        c0209i15 = c0209i13;
                        obj6 = obj5;
                        c23000t3 = c23000t2;
                        r19.m87150e0(637182520);
                        r19.m87173q(false);
                        r110 = r19;
                    }
                    if (goalSectionItemState.getLinkText() != null) {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        z15 = true;
                        r110.m87150e0(637966386);
                        AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                        r110.m87173q(false);
                        r111 = r110;
                    }
                    r111.m87173q(z15);
                    r111.m87173q(z15);
                    interfaceC4339a3 = interfaceC4339a6;
                    function3 = function1117;
                    modifier3 = modifier11111117;
                    r10 = r111;
                } else {
                    obj3 = obj2;
                }
                function6 = function5;
                C39689b c39689b15 = new C39689b(goalSectionItemState, function6, 26);
                r14.m87172p0(c39689b15);
                obj4 = c39689b15;
                c2314t3 = c2314t2;
                Modifier modifierM44101d1110 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                c22949e2 = c22949e;
                C22994r1 c22994r1M66759a1111111110 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                iHashCode4 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111114 = r14.m87165m();
                Modifier modifierM118962N1111111114 = AbstractC37056f.m118962N(r14, modifierM44101d1110);
                r14.m87158i0();
                if (r14.f115903S) {
                    c0213j2 = c0213j;
                    r14.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    r14.m87178s0();
                }
                c0209i9 = c0209i7;
                AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a1111111110);
                C0209i c0209i11111111111112 = c0209i6;
                AbstractC28683x.m87239G(r14, c0209i11111111111112, interfaceC28653p1M87165m1111111114);
                if (r14.f115903S) {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                } else {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                }
                C0209i c0209i11111111111113 = c0209i8;
                AbstractC28683x.m87239G(r14, c0209i11111111111113, modifierM118962N1111111114);
                if (goalSectionItemState.getActionText() != null) {
                    r14.m87150e0(1689087092);
                    ?? r21111118 = r14;
                    i25 = i19;
                    function7 = function6;
                    c0209i12 = c0209i9;
                    c22949e3 = c22949e2;
                    c2314t4 = c2314t3;
                    c0213j3 = c0213j2;
                    c0209i11 = c0209i10;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r21111118, 0, C2886a.f11498d << 18, 196602);
                    ?? r111111111114 = r21111118;
                    r111111111114.m87173q(false);
                    r17 = r111111111114;
                } else {
                    i25 = i19;
                    c0209i11 = c0209i10;
                    function7 = function6;
                    c0213j3 = c0213j2;
                    c0209i12 = c0209i9;
                    c2314t4 = c2314t3;
                    ?? r111111111115 = r15;
                    c22949e3 = c22949e2;
                    r14.m87150e0(1689235644);
                    r14.m87173q(r111111111115);
                    r17 = r14;
                }
                if (goalSectionItemState.getIcon() != null) {
                    r17.m87150e0(1689305363);
                    float f111117 = 4;
                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f111117, c2314t4));
                    ?? r21111119 = r17;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f111117, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r21111119, 384, 0);
                    ?? r111111111116 = r21111119;
                    r111111111116.m87173q(false);
                    r18 = r111111111116;
                } else {
                    r17.m87150e0(1689744540);
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(true);
                r18.m87173q(true);
                if (goalSectionItemState.getSubTitle() == null) {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                } else {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                }
                r19.m87150e0(-502100598);
                while (r2.hasNext()) {
                    Modifier modifier11111118 = modifier4;
                    AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier11111118)));
                    objM87133R2 = r19.m87133R();
                    obj8 = obj3;
                    if (objM87133R2 == obj8) {
                        obj9 = objM87133R2;
                        C40893d c40893d1118 = new C40893d(16);
                        r19.m87172p0(c40893d1118);
                        obj9 = c40893d1118;
                    }
                    obj9 = objM87133R2;
                    C25307p c25307pM74306g1110 = p720m91.Function1.m74306g((Function1) obj9);
                    i27 = i25;
                    if (i27 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = r19.m87133R();
                    if (z16) {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    } else {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g1110, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                    modifier4 = modifier11111118;
                    i25 = i27;
                    obj3 = obj8;
                    function7 = function8;
                }
                Function1 function1118 = function7;
                Modifier modifier11111119 = modifier4;
                obj5 = obj3;
                r19.m87173q(false);
                if (goalSectionItemState.getCallout() != null) {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                } else {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                }
                Modifier modifierM3409f11110 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C22994r1 c22994r1M66759a1111111111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                iHashCode5 = Long.hashCode(r19.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111115 = r19.m87165m();
                Modifier modifierM118962N1111111115 = AbstractC37056f.m118962N(r19, modifierM3409f11110);
                InterfaceC0221l.f734a.getClass();
                c0213j4 = C0217k.f724b;
                r19.m87158i0();
                if (r19.f115903S) {
                    r19.m87163l(c0213j4);
                } else {
                    r19.m87178s0();
                }
                c0209i13 = C0217k.f729g;
                AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a1111111111);
                C0209i c0209i11111111111114 = C0217k.f728f;
                AbstractC28683x.m87239G(r19, c0209i11111111111114, interfaceC28653p1M87165m1111111115);
                c0209i14 = C0217k.f732j;
                if (r19.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                }
                C0209i c0209i11111111111115 = C0217k.f726d;
                AbstractC28683x.m87239G(r19, c0209i11111111111115, modifierM118962N1111111115);
                if (goalSectionItemState.getCallout() != null) {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                } else {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                }
                if (goalSectionItemState.getLinkText() != null) {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                }
                r111.m87173q(z15);
                r111.m87173q(z15);
                interfaceC4339a3 = interfaceC4339a6;
                function3 = function1118;
                modifier3 = modifier11111119;
                r10 = r111;
            } else {
                obj2 = obj;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N125);
            C22949e c22949e19 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a1111111112 = AbstractC22988p1.m66759a(c22949e19, c2306l2, c28655q4, 48);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111111116 = c28655q4.m87165m();
            interfaceC4339a5 = interfaceC4339a4;
            Modifier modifierM118962N1111111116 = AbstractC37056f.m118962N(c28655q4, c2314t);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1111111112);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111111116);
            if (c28655q4.f115903S) {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
            } else {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111111116);
            titleImage = goalSectionItemState.getTitleImage();
            c23000t1 = C23000t1.f90727a;
            if (titleImage == null) {
                modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
            } else {
                modifierMo66772c = c2314t;
            }
            C22994r1 c22994r1M66759a1111111113 = AbstractC22988p1.m66759a(c22949e19, c2306l2, c28655q4, 48);
            Modifier modifier111111110 = modifierMo66772c;
            iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111111117 = c28655q4.m87165m();
            c22949e = c22949e19;
            Modifier modifierM118962N1111111117 = AbstractC37056f.m118962N(c28655q4, modifier111111110);
            c28655q4.m87158i0();
            c23000t2 = c23000t1;
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a1111111113);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1111111117);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1111111117);
            if (goalSectionItemState.getTitleImage() != null) {
                c28655q4.m87150e0(-999861702);
                AbstractC41138g.m133573b(c2314t, new C41137f(goalSectionItemState.getTitleImage(), false, 2, null), c28655q4, (AbstractC22403o.f87638a << 3) | 6);
                c28655q4.m87173q(false);
                function5 = function5;
                c2306l2 = c2306l2;
                c0209i5 = c0209i5;
                c0213j = c0213j;
                c2314t2 = c2314t;
                c0209i6 = c0209i2;
                c0209i7 = c0209i;
                c0209i8 = c0209i4;
                r15 = 0;
                modifier4 = modifier4;
                obj2 = obj2;
                c22949e = c22949e;
                interfaceC4339a5 = interfaceC4339a5;
                c23000t2 = c23000t2;
                r14 = c28655q4;
            } else {
                c28655q4.m87150e0(-999578641);
                if (goalSectionItemState.getDisplayHeaderDivider()) {
                    c28655q4.m87150e0(-999527615);
                    if (goalSectionItemState.getTitleStyle() == EnumC17740f.CENTERED) {
                        c28655q4.m87150e0(-999377141);
                        c0209i8 = c0209i4;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, c28655q4, (TextResource.$stable << 9) | 6, 210);
                        C28655q c28655q1111115 = c28655q4;
                        AbstractC31061c.m95650z(7, 4, c2314t2, c28655q1111115, false);
                        z14 = false;
                        c28655q3 = c28655q1111115;
                    } else {
                        c2314t2 = c2314t;
                        c0209i6 = c0209i2;
                        c0209i7 = c0209i;
                        c0209i8 = c0209i4;
                        c28655q4.m87150e0(-998874662);
                        float f111118 = 1;
                        z14 = false;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f111118 * 8, f111118, 3), null, goalSectionItemState.getTitleStyle(), goalSectionItemState.getTitle(), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, c28655q4, TextResource.$stable << 9, 210);
                        C28655q c28655q1111116 = c28655q4;
                        c28655q1111116.m87173q(false);
                        c28655q3 = c28655q1111116;
                    }
                    c28655q3.m87173q(z14);
                    z13 = z14;
                    c28655q2 = c28655q3;
                } else {
                    function5 = function5;
                    c2306l2 = c2306l2;
                    c0209i5 = c0209i5;
                    c0213j = c0213j;
                    c2314t2 = c2314t;
                    c0209i6 = c0209i2;
                    c0209i7 = c0209i;
                    c0209i8 = c0209i4;
                    z13 = false;
                    modifier4 = modifier4;
                    obj2 = obj2;
                    c22949e = c22949e;
                    interfaceC4339a5 = interfaceC4339a5;
                    c23000t2 = c23000t2;
                    c28655q4.m87150e0(-998457712);
                    if (goalSectionItemState.getUseHeaderDividerV2()) {
                        c28655q4.m87150e0(-998368029);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                        C28655q c28655q1111117 = c28655q4;
                        c28655q1111117.m87173q(false);
                        c28655q = c28655q1111117;
                    } else {
                        c28655q4.m87150e0(-998177627);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getTitle(), c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getSh4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                        C28655q c28655q1111118 = c28655q4;
                        c28655q1111118.m87173q(false);
                        c28655q = c28655q1111118;
                    }
                    c28655q.m87173q(false);
                    c28655q2 = c28655q;
                }
                c28655q2.m87173q(z13);
                r15 = z13;
                r14 = c28655q2;
            }
            r14.m87173q(true);
            if (goalSectionItemState.getDisplayHeaderDivider()) {
                r14.m87150e0(991675841);
                r14.m87173q(r15);
            } else {
                r14.m87150e0(991675841);
                r14.m87173q(r15);
            }
            boolean zM87157i16 = r14.m87157i(goalSectionItemState);
            i19 = i28 & 896;
            if (i19 == 256) {
                r16 = 1;
            } else {
                r16 = r15;
            }
            i24 = (zM87157i16 ? 1 : 0) | r16;
            objM87133R = r14.m87133R();
            if (i24 == 0) {
                obj3 = obj2;
                if (objM87133R == obj3) {
                    function6 = function5;
                    obj4 = objM87133R;
                }
                c2314t3 = c2314t2;
                Modifier modifierM44101d1111 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
                c22949e2 = c22949e;
                C22994r1 c22994r1M66759a1111111114 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
                iHashCode4 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111118 = r14.m87165m();
                Modifier modifierM118962N1111111118 = AbstractC37056f.m118962N(r14, modifierM44101d1111);
                r14.m87158i0();
                if (r14.f115903S) {
                    c0213j2 = c0213j;
                    r14.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    r14.m87178s0();
                }
                c0209i9 = c0209i7;
                AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a1111111114);
                C0209i c0209i11111111111116 = c0209i6;
                AbstractC28683x.m87239G(r14, c0209i11111111111116, interfaceC28653p1M87165m1111111118);
                if (r14.f115903S) {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                } else {
                    c0209i10 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
                }
                C0209i c0209i11111111111117 = c0209i8;
                AbstractC28683x.m87239G(r14, c0209i11111111111117, modifierM118962N1111111118);
                if (goalSectionItemState.getActionText() != null) {
                    r14.m87150e0(1689087092);
                    ?? r211111110 = r14;
                    i25 = i19;
                    function7 = function6;
                    c0209i12 = c0209i9;
                    c22949e3 = c22949e2;
                    c2314t4 = c2314t3;
                    c0213j3 = c0213j2;
                    c0209i11 = c0209i10;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r211111110, 0, C2886a.f11498d << 18, 196602);
                    ?? r111111111117 = r211111110;
                    r111111111117.m87173q(false);
                    r17 = r111111111117;
                } else {
                    i25 = i19;
                    c0209i11 = c0209i10;
                    function7 = function6;
                    c0213j3 = c0213j2;
                    c0209i12 = c0209i9;
                    c2314t4 = c2314t3;
                    ?? r111111111118 = r15;
                    c22949e3 = c22949e2;
                    r14.m87150e0(1689235644);
                    r14.m87173q(r111111111118);
                    r17 = r14;
                }
                if (goalSectionItemState.getIcon() != null) {
                    r17.m87150e0(1689305363);
                    float f111119 = 4;
                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f111119, c2314t4));
                    ?? r211111111 = r17;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f111119, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r211111111, 384, 0);
                    ?? r111111111119 = r211111111;
                    r111111111119.m87173q(false);
                    r18 = r111111111119;
                } else {
                    r17.m87150e0(1689744540);
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(true);
                r18.m87173q(true);
                if (goalSectionItemState.getSubTitle() == null) {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                } else {
                    c2306l = c2306l2;
                    i26 = 48;
                    r18.m87150e0(1614693949);
                    r18.m87173q(false);
                    r19 = r18;
                }
                r19.m87150e0(-502100598);
                while (r2.hasNext()) {
                    Modifier modifier111111111 = modifier4;
                    AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier111111111)));
                    objM87133R2 = r19.m87133R();
                    obj8 = obj3;
                    if (objM87133R2 == obj8) {
                        obj9 = objM87133R2;
                        C40893d c40893d1119 = new C40893d(16);
                        r19.m87172p0(c40893d1119);
                        obj9 = c40893d1119;
                    }
                    obj9 = objM87133R2;
                    C25307p c25307pM74306g1111 = p720m91.Function1.m74306g((Function1) obj9);
                    i27 = i25;
                    if (i27 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = r19.m87133R();
                    if (z16) {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    } else {
                        function8 = function7;
                        objM87133R3 = new C41067a(function8, 1);
                        r19.m87172p0(objM87133R3);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g1111, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                    modifier4 = modifier111111111;
                    i25 = i27;
                    obj3 = obj8;
                    function7 = function8;
                }
                Function1 function1119 = function7;
                Modifier modifier111111112 = modifier4;
                obj5 = obj3;
                r19.m87173q(false);
                if (goalSectionItemState.getCallout() != null) {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                } else {
                    r19.m87150e0(1615423069);
                    r19.m87173q(false);
                }
                Modifier modifierM3409f11111 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C22994r1 c22994r1M66759a1111111115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
                iHashCode5 = Long.hashCode(r19.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111119 = r19.m87165m();
                Modifier modifierM118962N1111111119 = AbstractC37056f.m118962N(r19, modifierM3409f11111);
                InterfaceC0221l.f734a.getClass();
                c0213j4 = C0217k.f724b;
                r19.m87158i0();
                if (r19.f115903S) {
                    r19.m87163l(c0213j4);
                } else {
                    r19.m87178s0();
                }
                c0209i13 = C0217k.f729g;
                AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a1111111115);
                C0209i c0209i11111111111118 = C0217k.f728f;
                AbstractC28683x.m87239G(r19, c0209i11111111111118, interfaceC28653p1M87165m1111111119);
                c0209i14 = C0217k.f732j;
                if (r19.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
                }
                C0209i c0209i11111111111119 = C0217k.f726d;
                AbstractC28683x.m87239G(r19, c0209i11111111111119, modifierM118962N1111111119);
                if (goalSectionItemState.getCallout() != null) {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                } else {
                    c0213j5 = c0213j4;
                    c0209i15 = c0209i13;
                    obj6 = obj5;
                    c23000t3 = c23000t2;
                    r19.m87150e0(637182520);
                    r19.m87173q(false);
                    r110 = r19;
                }
                if (goalSectionItemState.getLinkText() != null) {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                    z15 = true;
                    r110.m87150e0(637966386);
                    AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                    r110.m87173q(false);
                    r111 = r110;
                }
                r111.m87173q(z15);
                r111.m87173q(z15);
                interfaceC4339a3 = interfaceC4339a6;
                function3 = function1119;
                modifier3 = modifier111111112;
                r10 = r111;
            } else {
                obj3 = obj2;
            }
            function6 = function5;
            C39689b c39689b16 = new C39689b(goalSectionItemState, function6, 26);
            r14.m87172p0(c39689b16);
            obj4 = c39689b16;
            c2314t3 = c2314t2;
            Modifier modifierM44101d1112 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) obj4, 15), strConcat);
            c22949e2 = c22949e;
            C22994r1 c22994r1M66759a1111111116 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, r14, r15);
            iHashCode4 = Long.hashCode(r14.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11111111110 = r14.m87165m();
            Modifier modifierM118962N11111111110 = AbstractC37056f.m118962N(r14, modifierM44101d1112);
            r14.m87158i0();
            if (r14.f115903S) {
                c0213j2 = c0213j;
                r14.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                r14.m87178s0();
            }
            c0209i9 = c0209i7;
            AbstractC28683x.m87239G(r14, c0209i9, c22994r1M66759a1111111116);
            C0209i c0209i111111111111110 = c0209i6;
            AbstractC28683x.m87239G(r14, c0209i111111111111110, interfaceC28653p1M87165m11111111110);
            if (r14.f115903S) {
                c0209i10 = c0209i5;
                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
            } else {
                c0209i10 = c0209i5;
                AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i10);
            }
            C0209i c0209i111111111111111 = c0209i8;
            AbstractC28683x.m87239G(r14, c0209i111111111111111, modifierM118962N11111111110);
            if (goalSectionItemState.getActionText() != null) {
                r14.m87150e0(1689087092);
                ?? r211111112 = r14;
                i25 = i19;
                function7 = function6;
                c0209i12 = c0209i9;
                c22949e3 = c22949e2;
                c2314t4 = c2314t3;
                c0213j3 = c0213j2;
                c0209i11 = c0209i10;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalSectionItemState.getActionText(), r14, TextResource.$stable), null, C38072d.f163053a.m121949b(r14, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, r211111112, 0, C2886a.f11498d << 18, 196602);
                ?? r1111111111110 = r211111112;
                r1111111111110.m87173q(false);
                r17 = r1111111111110;
            } else {
                i25 = i19;
                c0209i11 = c0209i10;
                function7 = function6;
                c0213j3 = c0213j2;
                c0209i12 = c0209i9;
                c2314t4 = c2314t3;
                ?? r1111111111111 = r15;
                c22949e3 = c22949e2;
                r14.m87150e0(1689235644);
                r14.m87173q(r1111111111111);
                r17 = r14;
            }
            if (goalSectionItemState.getIcon() != null) {
                r17.m87150e0(1689305363);
                float f1111110 = 4;
                AbstractC22953f.m66715b(r17, AbstractC1102d.m3424u(1 * f1111110, c2314t4));
                ?? r211111113 = r17;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(goalSectionItemState.getIcon().getIcon(), r17, 6), AbstractC8693b.m21274h(goalSectionItemState.getIcon().getContentDescription(), r17, TextResource.$stable), AbstractC1102d.m3419p(((float) 3.25d) * f1111110, c2314t4), C38072d.f163053a.m121949b(r17, C38072d.f163054b).getBrandWhite(), r211111113, 384, 0);
                ?? r1111111111112 = r211111113;
                r1111111111112.m87173q(false);
                r18 = r1111111111112;
            } else {
                r17.m87150e0(1689744540);
                r17.m87173q(false);
                r18 = r17;
            }
            r18.m87173q(true);
            r18.m87173q(true);
            if (goalSectionItemState.getSubTitle() == null) {
                c2306l = c2306l2;
                i26 = 48;
                r18.m87150e0(1614693949);
                r18.m87173q(false);
                r19 = r18;
            } else {
                c2306l = c2306l2;
                i26 = 48;
                r18.m87150e0(1614693949);
                r18.m87173q(false);
                r19 = r18;
            }
            r19.m87150e0(-502100598);
            while (r2.hasNext()) {
                Modifier modifier111111113 = modifier4;
                AbstractC22953f.m66715b(r19, AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3409f(1.0f, modifier111111113)));
                objM87133R2 = r19.m87133R();
                obj8 = obj3;
                if (objM87133R2 == obj8) {
                    obj9 = objM87133R2;
                    C40893d c40893d11110 = new C40893d(16);
                    r19.m87172p0(c40893d11110);
                    obj9 = c40893d11110;
                }
                obj9 = objM87133R2;
                C25307p c25307pM74306g1112 = p720m91.Function1.m74306g((Function1) obj9);
                i27 = i25;
                if (i27 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = r19.m87133R();
                if (z16) {
                    function8 = function7;
                    objM87133R3 = new C41067a(function8, 1);
                    r19.m87172p0(objM87133R3);
                } else {
                    function8 = function7;
                    objM87133R3 = new C41067a(function8, 1);
                    r19.m87172p0(objM87133R3);
                }
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74306g1112, null, (Function1) objM87133R3, r19, C25307p.f99300b << 3, 4);
                modifier4 = modifier111111113;
                i25 = i27;
                obj3 = obj8;
                function7 = function8;
            }
            Function1 function11110 = function7;
            Modifier modifier111111114 = modifier4;
            obj5 = obj3;
            r19.m87173q(false);
            if (goalSectionItemState.getCallout() != null) {
                r19.m87150e0(1615423069);
                r19.m87173q(false);
            } else {
                r19.m87150e0(1615423069);
                r19.m87173q(false);
            }
            Modifier modifierM3409f11112 = AbstractC1102d.m3409f(1.0f, c2314t4);
            C22994r1 c22994r1M66759a1111111117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r19, i26);
            iHashCode5 = Long.hashCode(r19.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11111111111 = r19.m87165m();
            Modifier modifierM118962N11111111111 = AbstractC37056f.m118962N(r19, modifierM3409f11112);
            InterfaceC0221l.f734a.getClass();
            c0213j4 = C0217k.f724b;
            r19.m87158i0();
            if (r19.f115903S) {
                r19.m87163l(c0213j4);
            } else {
                r19.m87178s0();
            }
            c0209i13 = C0217k.f729g;
            AbstractC28683x.m87239G(r19, c0209i13, c22994r1M66759a1111111117);
            C0209i c0209i111111111111112 = C0217k.f728f;
            AbstractC28683x.m87239G(r19, c0209i111111111111112, interfaceC28653p1M87165m11111111111);
            c0209i14 = C0217k.f732j;
            if (r19.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
            } else {
                AbstractC11266d.m30471y(iHashCode5, r19, iHashCode5, c0209i14);
            }
            C0209i c0209i111111111111113 = C0217k.f726d;
            AbstractC28683x.m87239G(r19, c0209i111111111111113, modifierM118962N11111111111);
            if (goalSectionItemState.getCallout() != null) {
                c0213j5 = c0213j4;
                c0209i15 = c0209i13;
                obj6 = obj5;
                c23000t3 = c23000t2;
                r19.m87150e0(637182520);
                r19.m87173q(false);
                r110 = r19;
            } else {
                c0213j5 = c0213j4;
                c0209i15 = c0209i13;
                obj6 = obj5;
                c23000t3 = c23000t2;
                r19.m87150e0(637182520);
                r19.m87173q(false);
                r110 = r19;
            }
            if (goalSectionItemState.getLinkText() != null) {
                interfaceC4339a6 = interfaceC4339a5;
                z15 = true;
                r110.m87150e0(637966386);
                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                r110.m87173q(false);
                r111 = r110;
            } else {
                interfaceC4339a6 = interfaceC4339a5;
                z15 = true;
                r110.m87150e0(637966386);
                AbstractC22953f.m66715b(r110, c23000t3.mo66772c(c2314t4, true, 2.0f));
                r110.m87173q(false);
                r111 = r110;
            }
            r111.m87173q(z15);
            r111.m87173q(z15);
            interfaceC4339a3 = interfaceC4339a6;
            function3 = function11110;
            modifier3 = modifier111111114;
            r10 = r111;
        } else {
            c28655q4.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
            r10 = c28655q4;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(goalSectionItemState, modifier3, function3, interfaceC4339a3, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m133597i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m133598j() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m133599k(C41139h c41139h, Function1 function1) {
        C9598e destination = c41139h.getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m133600l(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C15461e.class), new C15457a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C41145n.class), new C41142k());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C41133b.class), new C41132a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m133601m(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m133602n(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m133603o(C41139h c41139h, Modifier modifier, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m133596h(c41139h, modifier, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

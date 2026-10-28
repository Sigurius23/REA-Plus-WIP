package st1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17766l1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.AbstractC27289x0;
import ny0.EnumC27284v;
import ny0.EnumC27291y0;
import oq1.C28119c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13821r1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28617g1;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39147y;
import p668z1.C39970s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24959n;
import p734sl0.C32618h3;
import p745y81.EnumC39333f;
import q12.C29802c;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qx0.C30745a;
import qz0.AbstractC30795n;
import rs1.AbstractC31794f;
import rt1.C31813k;
import rt1.EnumC31808f;
import s51.C32209f;
import sg2.C32469t;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: st1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a{\u0010\r\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2&\b\u0002\u0010\f\u001a \u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lrt1/k;", "viewState", "", "", "savedSymptoms", "savedNotes", "", "shouldShowSkipButton", "Lkotlin/Function1;", "Ll83/a0;", "onClickSkip", "Lkotlin/Function3;", "onClickSave", "j", "(Lrt1/k;Ljava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "isSymptomsAdded", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(ZZ)I", "Ly81/f;", "v", "(ZZ)Ly81/f;", "notes", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32993n {
    /* JADX WARN: Code duplicated, block: B:100:0x013d A[LOOP:0: B:98:0x0137->B:100:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0160  */
    /* JADX WARN: Code duplicated, block: B:107:0x016f  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:116:0x01da  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:122:0x030a  */
    /* JADX WARN: Code duplicated, block: B:125:0x038b  */
    /* JADX WARN: Code duplicated, block: B:126:0x038e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0397  */
    /* JADX WARN: Code duplicated, block: B:130:0x039a  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:141:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:144:0x0408  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
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
    /* JADX INFO: renamed from: j */
    public static final void m104204j(final C31813k viewState, List<String> list, String str, boolean z4, Function1 function1, Function3 function3, Composer composer, int i13, int i14) {
        List<String> list2;
        int i15;
        String str2;
        int i16;
        int i17;
        boolean z13;
        int i18;
        int i19;
        Function1 function2;
        int i24;
        int i25;
        Function3 function4;
        int i26;
        boolean z14;
        List<String> list3;
        String str3;
        final Function3 function5;
        boolean z15;
        Function1 function6;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        List<String> list4;
        String str4;
        boolean z16;
        C28676v0 c28676v0;
        Function1 function7;
        Function3 function8;
        Object objM87133R;
        Object objM30468v;
        InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R2;
        Object obj;
        final C39970s c39970s;
        Object objM87133R3;
        Object obj2;
        final InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R4;
        Object obj3;
        final InterfaceC28670t2 interfaceC28670t2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        final boolean z17;
        int i27;
        Object objM87133R5;
        Object obj4;
        Object objM87133R6;
        Object obj5;
        boolean z18;
        boolean z19;
        boolean zM87157i;
        Object obj6;
        final Function1 function9;
        boolean z24;
        C39970s c39970s2;
        Object objM87133R7;
        Object obj7;
        Object objM87133R8;
        Object obj8;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1735492601);
        int i28 = (i13 & 6) == 0 ? (c28655q2.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                list2 = list;
                i28 |= c28655q2.m87157i(list2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    str2 = str;
                    if (c28655q2.m87153g(str2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i28 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        z13 = z4;
                        if (c28655q2.m87155h(z13)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i28 |= i18;
                    }
                    i19 = i14 & 16;
                    if (i19 != 0) {
                        if ((i13 & 24576) == 0) {
                            function2 = function1;
                            if (c28655q2.m87157i(function2)) {
                                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i24 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i28 |= i24;
                        }
                        i25 = i14 & 32;
                        if (i25 != 0) {
                            i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                            function4 = function3;
                        } else {
                            function4 = function3;
                            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                                if (c28655q2.m87157i(function4)) {
                                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                                } else {
                                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                                }
                                i28 |= i26;
                            }
                        }
                        if ((i28 & 74899) != 74898) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q2.m87135U(i28 & 1, z14)) {
                            if (i29 != 0) {
                                list4 = C25271y.f99162w;
                            } else {
                                list4 = list2;
                            }
                            if (i15 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if (i17 != 0) {
                                z16 = true;
                            } else {
                                z16 = z13;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i19 != 0) {
                                objM87133R8 = c28655q2.m87133R();
                                if (objM87133R8 == c28676v0) {
                                    obj8 = objM87133R8;
                                    C32618h3 c32618h3 = new C32618h3(20);
                                    c28655q2.m87172p0(c32618h3);
                                    obj8 = c32618h3;
                                }
                                obj8 = objM87133R8;
                                function7 = (Function1) obj8;
                            } else {
                                function7 = function2;
                            }
                            if (i25 != 0) {
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    obj7 = objM87133R7;
                                    C30745a c30745a = new C30745a(13);
                                    c28655q2.m87172p0(c30745a);
                                    obj7 = c30745a;
                                }
                                obj7 = objM87133R7;
                                function8 = (Function3) obj7;
                            } else {
                                function8 = function4;
                            }
                            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                            objM87133R = c28655q2.m87133R();
                            objM30468v = objM87133R;
                            if (objM87133R == c28676v0) {
                                objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                            }
                            interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                            objM87133R2 = c28655q2.m87133R();
                            obj = objM87133R2;
                            if (objM87133R2 == c28676v0) {
                                c39970s2 = new C39970s();
                                for (EnumC31808f enumC31808f : viewState.getSheetContentViewState().m98866b()) {
                                    c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                                }
                                c28655q2.m87172p0(c39970s2);
                                obj = c39970s2;
                            }
                            c39970s = (C39970s) obj;
                            objM87133R3 = c28655q2.m87133R();
                            obj2 = objM87133R3;
                            if (objM87133R3 == c28676v0) {
                                C28633k1 c28633k1M87272z = AbstractC28683x.m87272z("");
                                c28655q2.m87172p0(c28633k1M87272z);
                                obj2 = c28633k1M87272z;
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) obj2;
                            objM87133R4 = c28655q2.m87133R();
                            obj3 = objM87133R4;
                            if (objM87133R4 == c28676v0) {
                                C28612f0 c28612f0M87264r = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                                c28655q2.m87172p0(c28612f0M87264r);
                                obj3 = c28612f0M87264r;
                            }
                            interfaceC28670t2 = (InterfaceC28670t2) obj3;
                            C2314t c2314t = C2314t.f9131w;
                            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14), "LabradorReadingSelectSymptomBottomSheet");
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                            List<String> list5 = list4;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                            TextResource textResourceM98867c = viewState.getSheetContentViewState().getTitle();
                            int i34 = TextResource.$stable;
                            String strM21274h = AbstractC8693b.m21274h(textResourceM98867c, c28655q2, i34);
                            C38072d c38072d = C38072d.f163053a;
                            int i35 = C38072d.f163054b;
                            long jM125430y = c38072d.m121949b(c28655q2, i35).getBrandWhite();
                            C2886a c2886aM8417O = c38072d.m121952e(c28655q2, i35).getT2();
                            C36775k c36775k = new C36775k(5);
                            int i36 = C2886a.f11498d << 18;
                            z17 = z16;
                            i27 = i28;
                            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 0, i36, 196090);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i34), null, c38072d.m121949b(c28655q2, i35).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i35).getB1(), null, c28655q2, 0, i36, 196090);
                            float f13 = 4;
                            float f14 = f13 * f13;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t));
                            AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f13), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t));
                            int i37 = 2;
                            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i37, false ? 1 : 0);
                            TextResource textResourceM21278l = AbstractC8693b.m21278l(str4);
                            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i37, false ? 1 : 0);
                            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("");
                            objM87133R5 = c28655q2.m87133R();
                            obj4 = objM87133R5;
                            if (objM87133R5 == c28676v0) {
                                C24959n c24959n = new C24959n(interfaceC28690z0, 1);
                                c28655q2.m87172p0(c24959n);
                                obj4 = c24959n;
                            }
                            Modifier modifierM3500d = AbstractC1131a.m3500d(c2314t, (Function1) obj4);
                            objM87133R6 = c28655q2.m87133R();
                            obj5 = objM87133R6;
                            if (objM87133R6 == c28676v0) {
                                C29802c c29802c = new C29802c(10, interfaceC28601c1);
                                c28655q2.m87172p0(c29802c);
                                obj5 = c29802c;
                            }
                            Function1 function10 = (Function1) obj5;
                            int i38 = TextResource.C8688b.f25889c;
                            AbstractC17766l1.m50964e(modifierM3500d, c8688b, textResourceM21278l, c8688b2, textResourceM21278l2, 0, 0, false, false, false, null, false, function10, c28655q2, (i38 << 9) | (i38 << 3) | 6 | (i34 << 6) | (i34 << 12), 384, 4064);
                            Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f14, c28655q2, c2314t, 1.0f);
                            float f15 = 8;
                            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e, 5 * f15, f13 * f15), "SymptomsBottomSheetPrimaryButton");
                            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                            String strM21273g = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                            long jMo134584toComposableColorWaAFU9c = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                            if ((i27 & 7168) == 2048) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if ((57344 & i27) == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                            Object objM87133R9 = c28655q2.m87133R();
                            if (!zM87157i || objM87133R9 == c28676v0) {
                                function9 = function7;
                                function5 = function8;
                                obj6 = new InterfaceC4339a() { // from class: st1.m
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                                    }
                                };
                                z24 = z17;
                                c28655q2.m87172p0(obj6);
                            } else {
                                obj6 = objM87133R9;
                                z24 = z17;
                                function9 = function7;
                                function5 = function8;
                            }
                            AbstractC27282u.m82292h(modifierM3599a2, enumC27284v, strM21273g, false, jMo134584toComposableColorWaAFU9c, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                            C28655q c28655q3 = c28655q2;
                            c28655q3.m87173q(true);
                            function6 = function9;
                            list3 = list5;
                            str3 = str4;
                            z15 = z24;
                            c28655q = c28655q3;
                        } else {
                            C28655q c28655q4 = c28655q2;
                            c28655q4.m87138X();
                            list3 = list2;
                            str3 = str2;
                            function5 = function4;
                            z15 = z13;
                            function6 = function2;
                            c28655q = c28655q4;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                        }
                    }
                    i28 |= 24576;
                    function2 = function1;
                    i25 = i14 & 32;
                    if (i25 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        function4 = function3;
                    } else {
                        function4 = function3;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(function4)) {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i28 |= i26;
                        }
                    }
                    if ((i28 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i28 & 1, z14)) {
                        if (i29 != 0) {
                            list4 = C25271y.f99162w;
                        } else {
                            list4 = list2;
                        }
                        if (i15 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i19 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                obj8 = objM87133R8;
                                C32618h3 c32618h4 = new C32618h3(20);
                                c28655q2.m87172p0(c32618h4);
                                obj8 = c32618h4;
                            }
                            obj8 = objM87133R8;
                            function7 = (Function1) obj8;
                        } else {
                            function7 = function2;
                        }
                        if (i25 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                obj7 = objM87133R7;
                                C30745a c30745a2 = new C30745a(13);
                                c28655q2.m87172p0(c30745a2);
                                obj7 = c30745a2;
                            }
                            obj7 = objM87133R7;
                            function8 = (Function3) obj7;
                        } else {
                            function8 = function4;
                        }
                        C13821r1 c13821r1M92099U2 = AbstractC30060g.m92099U(0, c28655q2, 1);
                        objM87133R = c28655q2.m87133R();
                        objM30468v = objM87133R;
                        if (objM87133R == c28676v0) {
                            objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                        objM87133R2 = c28655q2.m87133R();
                        obj = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            c39970s2 = new C39970s();
                            while (r13.hasNext()) {
                                c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                            }
                            c28655q2.m87172p0(c39970s2);
                            obj = c39970s2;
                        }
                        c39970s = (C39970s) obj;
                        objM87133R3 = c28655q2.m87133R();
                        obj2 = objM87133R3;
                        if (objM87133R3 == c28676v0) {
                            C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z("");
                            c28655q2.m87172p0(c28633k1M87272z2);
                            obj2 = c28633k1M87272z2;
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) obj2;
                        objM87133R4 = c28655q2.m87133R();
                        obj3 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C28612f0 c28612f0M87264r2 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                            c28655q2.m87172p0(c28612f0M87264r2);
                            obj3 = c28612f0M87264r2;
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) obj3;
                        C2314t c2314t2 = C2314t.f9131w;
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t2, c13821r1M92099U2, 14), "LabradorReadingSelectSymptomBottomSheet");
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                        List<String> list6 = list4;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3599a3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                        TextResource textResourceM98867c2 = viewState.getSheetContentViewState().getTitle();
                        int i39 = TextResource.$stable;
                        String strM21274h2 = AbstractC8693b.m21274h(textResourceM98867c2, c28655q2, i39);
                        C38072d c38072d2 = C38072d.f163053a;
                        int i310 = C38072d.f163054b;
                        long jM125430y2 = c38072d2.m121949b(c28655q2, i310).getBrandWhite();
                        C2886a c2886aM8417O2 = c38072d2.m121952e(c28655q2, i310).getT2();
                        C36775k c36775k2 = new C36775k(5);
                        int i311 = C2886a.f11498d << 18;
                        z17 = z16;
                        i27 = i28;
                        AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q2, 0, i311, 196090);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i39), null, c38072d2.m121949b(c28655q2, i310).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i310).getB1(), null, c28655q2, 0, i311, 196090);
                        float f16 = 4;
                        float f17 = f16 * f16;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f17, c2314t2));
                        AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f16), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f17, c2314t2));
                        int i312 = 2;
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i312, false ? 1 : 0);
                        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(str4);
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i312, false ? 1 : 0);
                        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("");
                        objM87133R5 = c28655q2.m87133R();
                        obj4 = objM87133R5;
                        if (objM87133R5 == c28676v0) {
                            C24959n c24959n2 = new C24959n(interfaceC28690z0, 1);
                            c28655q2.m87172p0(c24959n2);
                            obj4 = c24959n2;
                        }
                        Modifier modifierM3500d2 = AbstractC1131a.m3500d(c2314t2, (Function1) obj4);
                        objM87133R6 = c28655q2.m87133R();
                        obj5 = objM87133R6;
                        if (objM87133R6 == c28676v0) {
                            C29802c c29802c2 = new C29802c(10, interfaceC28601c1);
                            c28655q2.m87172p0(c29802c2);
                            obj5 = c29802c2;
                        }
                        Function1 function11 = (Function1) obj5;
                        int i313 = TextResource.C8688b.f25889c;
                        AbstractC17766l1.m50964e(modifierM3500d2, c8688b3, textResourceM21278l3, c8688b4, textResourceM21278l4, 0, 0, false, false, false, null, false, function11, c28655q2, (i313 << 9) | (i313 << 3) | 6 | (i39 << 6) | (i39 << 12), 384, 4064);
                        Modifier modifierM91835e2 = AbstractC30007c.m91835e(c2314t2, f17, c28655q2, c2314t2, 1.0f);
                        float f18 = 8;
                        Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e2, 5 * f18, f16 * f18), "SymptomsBottomSheetPrimaryButton");
                        EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                        String strM21273g2 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                        long jMo134584toComposableColorWaAFU9c2 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                        if ((i27 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if ((57344 & i27) == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                        Object objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            function9 = function7;
                            function5 = function8;
                            obj6 = new InterfaceC4339a() { // from class: st1.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                                }
                            };
                            z24 = z17;
                            c28655q2.m87172p0(obj6);
                        } else {
                            function9 = function7;
                            function5 = function8;
                            obj6 = new InterfaceC4339a() { // from class: st1.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                                }
                            };
                            z24 = z17;
                            c28655q2.m87172p0(obj6);
                        }
                        AbstractC27282u.m82292h(modifierM3599a4, enumC27284v2, strM21273g2, false, jMo134584toComposableColorWaAFU9c2, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                        C28655q c28655q5 = c28655q2;
                        c28655q5.m87173q(true);
                        function6 = function9;
                        list3 = list6;
                        str3 = str4;
                        z15 = z24;
                        c28655q = c28655q5;
                    } else {
                        C28655q c28655q6 = c28655q2;
                        c28655q6.m87138X();
                        list3 = list2;
                        str3 = str2;
                        function5 = function4;
                        z15 = z13;
                        function6 = function2;
                        c28655q = c28655q6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                    }
                }
                i28 |= 3072;
                z13 = z4;
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i28 |= i24;
                    }
                    i25 = i14 & 32;
                    if (i25 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        function4 = function3;
                    } else {
                        function4 = function3;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(function4)) {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i28 |= i26;
                        }
                    }
                    if ((i28 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i28 & 1, z14)) {
                        if (i29 != 0) {
                            list4 = C25271y.f99162w;
                        } else {
                            list4 = list2;
                        }
                        if (i15 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i19 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                obj8 = objM87133R8;
                                C32618h3 c32618h5 = new C32618h3(20);
                                c28655q2.m87172p0(c32618h5);
                                obj8 = c32618h5;
                            }
                            obj8 = objM87133R8;
                            function7 = (Function1) obj8;
                        } else {
                            function7 = function2;
                        }
                        if (i25 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                obj7 = objM87133R7;
                                C30745a c30745a3 = new C30745a(13);
                                c28655q2.m87172p0(c30745a3);
                                obj7 = c30745a3;
                            }
                            obj7 = objM87133R7;
                            function8 = (Function3) obj7;
                        } else {
                            function8 = function4;
                        }
                        C13821r1 c13821r1M92099U3 = AbstractC30060g.m92099U(0, c28655q2, 1);
                        objM87133R = c28655q2.m87133R();
                        objM30468v = objM87133R;
                        if (objM87133R == c28676v0) {
                            objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                        objM87133R2 = c28655q2.m87133R();
                        obj = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            c39970s2 = new C39970s();
                            while (r13.hasNext()) {
                                c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                            }
                            c28655q2.m87172p0(c39970s2);
                            obj = c39970s2;
                        }
                        c39970s = (C39970s) obj;
                        objM87133R3 = c28655q2.m87133R();
                        obj2 = objM87133R3;
                        if (objM87133R3 == c28676v0) {
                            C28633k1 c28633k1M87272z3 = AbstractC28683x.m87272z("");
                            c28655q2.m87172p0(c28633k1M87272z3);
                            obj2 = c28633k1M87272z3;
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) obj2;
                        objM87133R4 = c28655q2.m87133R();
                        obj3 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C28612f0 c28612f0M87264r3 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                            c28655q2.m87172p0(c28612f0M87264r3);
                            obj3 = c28612f0M87264r3;
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) obj3;
                        C2314t c2314t3 = C2314t.f9131w;
                        Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t3, c13821r1M92099U3, 14), "LabradorReadingSelectSymptomBottomSheet");
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                        List<String> list7 = list4;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3599a5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                        TextResource textResourceM98867c3 = viewState.getSheetContentViewState().getTitle();
                        int i314 = TextResource.$stable;
                        String strM21274h3 = AbstractC8693b.m21274h(textResourceM98867c3, c28655q2, i314);
                        C38072d c38072d3 = C38072d.f163053a;
                        int i315 = C38072d.f163054b;
                        long jM125430y3 = c38072d3.m121949b(c28655q2, i315).getBrandWhite();
                        C2886a c2886aM8417O3 = c38072d3.m121952e(c28655q2, i315).getT2();
                        C36775k c36775k3 = new C36775k(5);
                        int i316 = C2886a.f11498d << 18;
                        z17 = z16;
                        i27 = i28;
                        AbstractC30795n.m94707h(strM21274h3, null, jM125430y3, 0L, null, null, null, 0L, null, c36775k3, 0L, 0, false, 0, 0, null, c2886aM8417O3, null, c28655q2, 0, i316, 196090);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i314), null, c38072d3.m121949b(c28655q2, i315).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i315).getB1(), null, c28655q2, 0, i316, 196090);
                        float f19 = 4;
                        float f110 = f19 * f19;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f110, c2314t3));
                        AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f19), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f110, c2314t3));
                        int i317 = 2;
                        TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i317, false ? 1 : 0);
                        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(str4);
                        TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i317, false ? 1 : 0);
                        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("");
                        objM87133R5 = c28655q2.m87133R();
                        obj4 = objM87133R5;
                        if (objM87133R5 == c28676v0) {
                            C24959n c24959n3 = new C24959n(interfaceC28690z0, 1);
                            c28655q2.m87172p0(c24959n3);
                            obj4 = c24959n3;
                        }
                        Modifier modifierM3500d3 = AbstractC1131a.m3500d(c2314t3, (Function1) obj4);
                        objM87133R6 = c28655q2.m87133R();
                        obj5 = objM87133R6;
                        if (objM87133R6 == c28676v0) {
                            C29802c c29802c3 = new C29802c(10, interfaceC28601c1);
                            c28655q2.m87172p0(c29802c3);
                            obj5 = c29802c3;
                        }
                        Function1 function12 = (Function1) obj5;
                        int i318 = TextResource.C8688b.f25889c;
                        AbstractC17766l1.m50964e(modifierM3500d3, c8688b5, textResourceM21278l5, c8688b6, textResourceM21278l6, 0, 0, false, false, false, null, false, function12, c28655q2, (i318 << 9) | (i318 << 3) | 6 | (i314 << 6) | (i314 << 12), 384, 4064);
                        Modifier modifierM91835e3 = AbstractC30007c.m91835e(c2314t3, f110, c28655q2, c2314t3, 1.0f);
                        float f111 = 8;
                        Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e3, 5 * f111, f19 * f111), "SymptomsBottomSheetPrimaryButton");
                        EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                        String strM21273g3 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                        long jMo134584toComposableColorWaAFU9c3 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                        if ((i27 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if ((57344 & i27) == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                        Object objM87133R11 = c28655q2.m87133R();
                        if (zM87157i) {
                            function9 = function7;
                            function5 = function8;
                            obj6 = new InterfaceC4339a() { // from class: st1.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                                }
                            };
                            z24 = z17;
                            c28655q2.m87172p0(obj6);
                        } else {
                            function9 = function7;
                            function5 = function8;
                            obj6 = new InterfaceC4339a() { // from class: st1.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                                }
                            };
                            z24 = z17;
                            c28655q2.m87172p0(obj6);
                        }
                        AbstractC27282u.m82292h(modifierM3599a6, enumC27284v3, strM21273g3, false, jMo134584toComposableColorWaAFU9c3, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                        C28655q c28655q7 = c28655q2;
                        c28655q7.m87173q(true);
                        function6 = function9;
                        list3 = list7;
                        str3 = str4;
                        z15 = z24;
                        c28655q = c28655q7;
                    } else {
                        C28655q c28655q8 = c28655q2;
                        c28655q8.m87138X();
                        list3 = list2;
                        str3 = str2;
                        function5 = function4;
                        z15 = z13;
                        function6 = function2;
                        c28655q = c28655q8;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                    }
                }
                i28 |= 24576;
                function2 = function1;
                i25 = i14 & 32;
                if (i25 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(function4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i28 |= i26;
                    }
                }
                if ((i28 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z14)) {
                    if (i29 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if (i15 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj8 = objM87133R8;
                            C32618h3 c32618h6 = new C32618h3(20);
                            c28655q2.m87172p0(c32618h6);
                            obj8 = c32618h6;
                        }
                        obj8 = objM87133R8;
                        function7 = (Function1) obj8;
                    } else {
                        function7 = function2;
                    }
                    if (i25 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj7 = objM87133R7;
                            C30745a c30745a4 = new C30745a(13);
                            c28655q2.m87172p0(c30745a4);
                            obj7 = c30745a4;
                        }
                        obj7 = objM87133R7;
                        function8 = (Function3) obj7;
                    } else {
                        function8 = function4;
                    }
                    C13821r1 c13821r1M92099U4 = AbstractC30060g.m92099U(0, c28655q2, 1);
                    objM87133R = c28655q2.m87133R();
                    objM30468v = objM87133R;
                    if (objM87133R == c28676v0) {
                        objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                    objM87133R2 = c28655q2.m87133R();
                    obj = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        c39970s2 = new C39970s();
                        while (r13.hasNext()) {
                            c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                        }
                        c28655q2.m87172p0(c39970s2);
                        obj = c39970s2;
                    }
                    c39970s = (C39970s) obj;
                    objM87133R3 = c28655q2.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z4 = AbstractC28683x.m87272z("");
                        c28655q2.m87172p0(c28633k1M87272z4);
                        obj2 = c28633k1M87272z4;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    objM87133R4 = c28655q2.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28612f0 c28612f0M87264r4 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                        c28655q2.m87172p0(c28612f0M87264r4);
                        obj3 = c28612f0M87264r4;
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) obj3;
                    C2314t c2314t4 = C2314t.f9131w;
                    Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t4, c13821r1M92099U4, 14), "LabradorReadingSelectSymptomBottomSheet");
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    List<String> list8 = list4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3599a7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                    TextResource textResourceM98867c4 = viewState.getSheetContentViewState().getTitle();
                    int i319 = TextResource.$stable;
                    String strM21274h4 = AbstractC8693b.m21274h(textResourceM98867c4, c28655q2, i319);
                    C38072d c38072d4 = C38072d.f163053a;
                    int i3110 = C38072d.f163054b;
                    long jM125430y4 = c38072d4.m121949b(c28655q2, i3110).getBrandWhite();
                    C2886a c2886aM8417O4 = c38072d4.m121952e(c28655q2, i3110).getT2();
                    C36775k c36775k4 = new C36775k(5);
                    int i3111 = C2886a.f11498d << 18;
                    z17 = z16;
                    i27 = i28;
                    AbstractC30795n.m94707h(strM21274h4, null, jM125430y4, 0L, null, null, null, 0L, null, c36775k4, 0L, 0, false, 0, 0, null, c2886aM8417O4, null, c28655q2, 0, i3111, 196090);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i319), null, c38072d4.m121949b(c28655q2, i3110).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i3110).getB1(), null, c28655q2, 0, i3111, 196090);
                    float f112 = 4;
                    float f113 = f112 * f112;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f113, c2314t4));
                    AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f112), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f113, c2314t4));
                    int i3112 = 2;
                    TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i3112, false ? 1 : 0);
                    TextResource textResourceM21278l7 = AbstractC8693b.m21278l(str4);
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i3112, false ? 1 : 0);
                    TextResource textResourceM21278l8 = AbstractC8693b.m21278l("");
                    objM87133R5 = c28655q2.m87133R();
                    obj4 = objM87133R5;
                    if (objM87133R5 == c28676v0) {
                        C24959n c24959n4 = new C24959n(interfaceC28690z0, 1);
                        c28655q2.m87172p0(c24959n4);
                        obj4 = c24959n4;
                    }
                    Modifier modifierM3500d4 = AbstractC1131a.m3500d(c2314t4, (Function1) obj4);
                    objM87133R6 = c28655q2.m87133R();
                    obj5 = objM87133R6;
                    if (objM87133R6 == c28676v0) {
                        C29802c c29802c4 = new C29802c(10, interfaceC28601c1);
                        c28655q2.m87172p0(c29802c4);
                        obj5 = c29802c4;
                    }
                    Function1 function13 = (Function1) obj5;
                    int i3113 = TextResource.C8688b.f25889c;
                    AbstractC17766l1.m50964e(modifierM3500d4, c8688b7, textResourceM21278l7, c8688b8, textResourceM21278l8, 0, 0, false, false, false, null, false, function13, c28655q2, (i3113 << 9) | (i3113 << 3) | 6 | (i319 << 6) | (i319 << 12), 384, 4064);
                    Modifier modifierM91835e4 = AbstractC30007c.m91835e(c2314t4, f113, c28655q2, c2314t4, 1.0f);
                    float f114 = 8;
                    Modifier modifierM3599a8 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e4, 5 * f114, f112 * f114), "SymptomsBottomSheetPrimaryButton");
                    EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
                    String strM21273g4 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                    long jMo134584toComposableColorWaAFU9c4 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    if ((i27 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((57344 & i27) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                    Object objM87133R12 = c28655q2.m87133R();
                    if (zM87157i) {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    } else {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    }
                    AbstractC27282u.m82292h(modifierM3599a8, enumC27284v4, strM21273g4, false, jMo134584toComposableColorWaAFU9c4, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                    C28655q c28655q9 = c28655q2;
                    c28655q9.m87173q(true);
                    function6 = function9;
                    list3 = list8;
                    str3 = str4;
                    z15 = z24;
                    c28655q = c28655q9;
                } else {
                    C28655q c28655q10 = c28655q2;
                    c28655q10.m87138X();
                    list3 = list2;
                    str3 = str2;
                    function5 = function4;
                    z15 = z13;
                    function6 = function2;
                    c28655q = c28655q10;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                }
            }
            i28 |= 384;
            str2 = str;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i28 |= i18;
                }
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i28 |= i24;
                    }
                    i25 = i14 & 32;
                    if (i25 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        function4 = function3;
                    } else {
                        function4 = function3;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(function4)) {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i28 |= i26;
                        }
                    }
                    if ((i28 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i28 & 1, z14)) {
                        if (i29 != 0) {
                            list4 = C25271y.f99162w;
                        } else {
                            list4 = list2;
                        }
                        if (i15 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i19 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                obj8 = objM87133R8;
                                C32618h3 c32618h7 = new C32618h3(20);
                                c28655q2.m87172p0(c32618h7);
                                obj8 = c32618h7;
                            }
                            obj8 = objM87133R8;
                            function7 = (Function1) obj8;
                        } else {
                            function7 = function2;
                        }
                        if (i25 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                obj7 = objM87133R7;
                                C30745a c30745a5 = new C30745a(13);
                                c28655q2.m87172p0(c30745a5);
                                obj7 = c30745a5;
                            }
                            obj7 = objM87133R7;
                            function8 = (Function3) obj7;
                        } else {
                            function8 = function4;
                        }
                        C13821r1 c13821r1M92099U5 = AbstractC30060g.m92099U(0, c28655q2, 1);
                        objM87133R = c28655q2.m87133R();
                        objM30468v = objM87133R;
                        if (objM87133R == c28676v0) {
                            objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                        objM87133R2 = c28655q2.m87133R();
                        obj = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            c39970s2 = new C39970s();
                            while (r13.hasNext()) {
                                c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                            }
                            c28655q2.m87172p0(c39970s2);
                            obj = c39970s2;
                        }
                        c39970s = (C39970s) obj;
                        objM87133R3 = c28655q2.m87133R();
                        obj2 = objM87133R3;
                        if (objM87133R3 == c28676v0) {
                            C28633k1 c28633k1M87272z5 = AbstractC28683x.m87272z("");
                            c28655q2.m87172p0(c28633k1M87272z5);
                            obj2 = c28633k1M87272z5;
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) obj2;
                        objM87133R4 = c28655q2.m87133R();
                        obj3 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C28612f0 c28612f0M87264r5 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                            c28655q2.m87172p0(c28612f0M87264r5);
                            obj3 = c28612f0M87264r5;
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) obj3;
                        C2314t c2314t5 = C2314t.f9131w;
                        Modifier modifierM3599a9 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t5, c13821r1M92099U5, 14), "LabradorReadingSelectSymptomBottomSheet");
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                        List<String> list9 = list4;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3599a9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                        TextResource textResourceM98867c5 = viewState.getSheetContentViewState().getTitle();
                        int i3114 = TextResource.$stable;
                        String strM21274h5 = AbstractC8693b.m21274h(textResourceM98867c5, c28655q2, i3114);
                        C38072d c38072d5 = C38072d.f163053a;
                        int i3115 = C38072d.f163054b;
                        long jM125430y5 = c38072d5.m121949b(c28655q2, i3115).getBrandWhite();
                        C2886a c2886aM8417O5 = c38072d5.m121952e(c28655q2, i3115).getT2();
                        C36775k c36775k5 = new C36775k(5);
                        int i3116 = C2886a.f11498d << 18;
                        z17 = z16;
                        i27 = i28;
                        AbstractC30795n.m94707h(strM21274h5, null, jM125430y5, 0L, null, null, null, 0L, null, c36775k5, 0L, 0, false, 0, 0, null, c2886aM8417O5, null, c28655q2, 0, i3116, 196090);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i3114), null, c38072d5.m121949b(c28655q2, i3115).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q2, i3115).getB1(), null, c28655q2, 0, i3116, 196090);
                        float f115 = 4;
                        float f116 = f115 * f115;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f116, c2314t5));
                        AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f115), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f116, c2314t5));
                        int i3117 = 2;
                        TextResource.C8688b c8688b9 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i3117, false ? 1 : 0);
                        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(str4);
                        TextResource.C8688b c8688b10 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i3117, false ? 1 : 0);
                        TextResource textResourceM21278l10 = AbstractC8693b.m21278l("");
                        objM87133R5 = c28655q2.m87133R();
                        obj4 = objM87133R5;
                        if (objM87133R5 == c28676v0) {
                            C24959n c24959n5 = new C24959n(interfaceC28690z0, 1);
                            c28655q2.m87172p0(c24959n5);
                            obj4 = c24959n5;
                        }
                        Modifier modifierM3500d5 = AbstractC1131a.m3500d(c2314t5, (Function1) obj4);
                        objM87133R6 = c28655q2.m87133R();
                        obj5 = objM87133R6;
                        if (objM87133R6 == c28676v0) {
                            C29802c c29802c5 = new C29802c(10, interfaceC28601c1);
                            c28655q2.m87172p0(c29802c5);
                            obj5 = c29802c5;
                        }
                        Function1 function14 = (Function1) obj5;
                        int i3118 = TextResource.C8688b.f25889c;
                        AbstractC17766l1.m50964e(modifierM3500d5, c8688b9, textResourceM21278l9, c8688b10, textResourceM21278l10, 0, 0, false, false, false, null, false, function14, c28655q2, (i3118 << 9) | (i3118 << 3) | 6 | (i3114 << 6) | (i3114 << 12), 384, 4064);
                        Modifier modifierM91835e5 = AbstractC30007c.m91835e(c2314t5, f116, c28655q2, c2314t5, 1.0f);
                        float f117 = 8;
                        Modifier modifierM3599a10 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e5, 5 * f117, f115 * f117), "SymptomsBottomSheetPrimaryButton");
                        EnumC27284v enumC27284v5 = EnumC27284v.TextLarge;
                        String strM21273g5 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                        long jMo134584toComposableColorWaAFU9c5 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                        if ((i27 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if ((57344 & i27) == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                        Object objM87133R13 = c28655q2.m87133R();
                        if (zM87157i) {
                            function9 = function7;
                            function5 = function8;
                            obj6 = new InterfaceC4339a() { // from class: st1.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                                }
                            };
                            z24 = z17;
                            c28655q2.m87172p0(obj6);
                        } else {
                            function9 = function7;
                            function5 = function8;
                            obj6 = new InterfaceC4339a() { // from class: st1.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                                }
                            };
                            z24 = z17;
                            c28655q2.m87172p0(obj6);
                        }
                        AbstractC27282u.m82292h(modifierM3599a10, enumC27284v5, strM21273g5, false, jMo134584toComposableColorWaAFU9c5, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                        C28655q c28655q11 = c28655q2;
                        c28655q11.m87173q(true);
                        function6 = function9;
                        list3 = list9;
                        str3 = str4;
                        z15 = z24;
                        c28655q = c28655q11;
                    } else {
                        C28655q c28655q12 = c28655q2;
                        c28655q12.m87138X();
                        list3 = list2;
                        str3 = str2;
                        function5 = function4;
                        z15 = z13;
                        function6 = function2;
                        c28655q = c28655q12;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                    }
                }
                i28 |= 24576;
                function2 = function1;
                i25 = i14 & 32;
                if (i25 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(function4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i28 |= i26;
                    }
                }
                if ((i28 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z14)) {
                    if (i29 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if (i15 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj8 = objM87133R8;
                            C32618h3 c32618h8 = new C32618h3(20);
                            c28655q2.m87172p0(c32618h8);
                            obj8 = c32618h8;
                        }
                        obj8 = objM87133R8;
                        function7 = (Function1) obj8;
                    } else {
                        function7 = function2;
                    }
                    if (i25 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj7 = objM87133R7;
                            C30745a c30745a6 = new C30745a(13);
                            c28655q2.m87172p0(c30745a6);
                            obj7 = c30745a6;
                        }
                        obj7 = objM87133R7;
                        function8 = (Function3) obj7;
                    } else {
                        function8 = function4;
                    }
                    C13821r1 c13821r1M92099U6 = AbstractC30060g.m92099U(0, c28655q2, 1);
                    objM87133R = c28655q2.m87133R();
                    objM30468v = objM87133R;
                    if (objM87133R == c28676v0) {
                        objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                    objM87133R2 = c28655q2.m87133R();
                    obj = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        c39970s2 = new C39970s();
                        while (r13.hasNext()) {
                            c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                        }
                        c28655q2.m87172p0(c39970s2);
                        obj = c39970s2;
                    }
                    c39970s = (C39970s) obj;
                    objM87133R3 = c28655q2.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z6 = AbstractC28683x.m87272z("");
                        c28655q2.m87172p0(c28633k1M87272z6);
                        obj2 = c28633k1M87272z6;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    objM87133R4 = c28655q2.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28612f0 c28612f0M87264r6 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                        c28655q2.m87172p0(c28612f0M87264r6);
                        obj3 = c28612f0M87264r6;
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) obj3;
                    C2314t c2314t6 = C2314t.f9131w;
                    Modifier modifierM3599a11 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t6, c13821r1M92099U6, 14), "LabradorReadingSelectSymptomBottomSheet");
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    List<String> list10 = list4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3599a11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                    TextResource textResourceM98867c6 = viewState.getSheetContentViewState().getTitle();
                    int i3119 = TextResource.$stable;
                    String strM21274h6 = AbstractC8693b.m21274h(textResourceM98867c6, c28655q2, i3119);
                    C38072d c38072d6 = C38072d.f163053a;
                    int i31110 = C38072d.f163054b;
                    long jM125430y6 = c38072d6.m121949b(c28655q2, i31110).getBrandWhite();
                    C2886a c2886aM8417O6 = c38072d6.m121952e(c28655q2, i31110).getT2();
                    C36775k c36775k6 = new C36775k(5);
                    int i31111 = C2886a.f11498d << 18;
                    z17 = z16;
                    i27 = i28;
                    AbstractC30795n.m94707h(strM21274h6, null, jM125430y6, 0L, null, null, null, 0L, null, c36775k6, 0L, 0, false, 0, 0, null, c2886aM8417O6, null, c28655q2, 0, i31111, 196090);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i3119), null, c38072d6.m121949b(c28655q2, i31110).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q2, i31110).getB1(), null, c28655q2, 0, i31111, 196090);
                    float f118 = 4;
                    float f119 = f118 * f118;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f119, c2314t6));
                    AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f118), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f119, c2314t6));
                    int i31112 = 2;
                    TextResource.C8688b c8688b11 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i31112, false ? 1 : 0);
                    TextResource textResourceM21278l11 = AbstractC8693b.m21278l(str4);
                    TextResource.C8688b c8688b12 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i31112, false ? 1 : 0);
                    TextResource textResourceM21278l12 = AbstractC8693b.m21278l("");
                    objM87133R5 = c28655q2.m87133R();
                    obj4 = objM87133R5;
                    if (objM87133R5 == c28676v0) {
                        C24959n c24959n6 = new C24959n(interfaceC28690z0, 1);
                        c28655q2.m87172p0(c24959n6);
                        obj4 = c24959n6;
                    }
                    Modifier modifierM3500d6 = AbstractC1131a.m3500d(c2314t6, (Function1) obj4);
                    objM87133R6 = c28655q2.m87133R();
                    obj5 = objM87133R6;
                    if (objM87133R6 == c28676v0) {
                        C29802c c29802c6 = new C29802c(10, interfaceC28601c1);
                        c28655q2.m87172p0(c29802c6);
                        obj5 = c29802c6;
                    }
                    Function1 function15 = (Function1) obj5;
                    int i31113 = TextResource.C8688b.f25889c;
                    AbstractC17766l1.m50964e(modifierM3500d6, c8688b11, textResourceM21278l11, c8688b12, textResourceM21278l12, 0, 0, false, false, false, null, false, function15, c28655q2, (i31113 << 9) | (i31113 << 3) | 6 | (i3119 << 6) | (i3119 << 12), 384, 4064);
                    Modifier modifierM91835e6 = AbstractC30007c.m91835e(c2314t6, f119, c28655q2, c2314t6, 1.0f);
                    float f1110 = 8;
                    Modifier modifierM3599a12 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e6, 5 * f1110, f118 * f1110), "SymptomsBottomSheetPrimaryButton");
                    EnumC27284v enumC27284v6 = EnumC27284v.TextLarge;
                    String strM21273g6 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                    long jMo134584toComposableColorWaAFU9c6 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    if ((i27 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((57344 & i27) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                    Object objM87133R14 = c28655q2.m87133R();
                    if (zM87157i) {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    } else {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    }
                    AbstractC27282u.m82292h(modifierM3599a12, enumC27284v6, strM21273g6, false, jMo134584toComposableColorWaAFU9c6, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                    C28655q c28655q13 = c28655q2;
                    c28655q13.m87173q(true);
                    function6 = function9;
                    list3 = list10;
                    str3 = str4;
                    z15 = z24;
                    c28655q = c28655q13;
                } else {
                    C28655q c28655q14 = c28655q2;
                    c28655q14.m87138X();
                    list3 = list2;
                    str3 = str2;
                    function5 = function4;
                    z15 = z13;
                    function6 = function2;
                    c28655q = c28655q14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                }
            }
            i28 |= 3072;
            z13 = z4;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i28 |= i24;
                }
                i25 = i14 & 32;
                if (i25 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(function4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i28 |= i26;
                    }
                }
                if ((i28 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z14)) {
                    if (i29 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if (i15 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj8 = objM87133R8;
                            C32618h3 c32618h9 = new C32618h3(20);
                            c28655q2.m87172p0(c32618h9);
                            obj8 = c32618h9;
                        }
                        obj8 = objM87133R8;
                        function7 = (Function1) obj8;
                    } else {
                        function7 = function2;
                    }
                    if (i25 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj7 = objM87133R7;
                            C30745a c30745a7 = new C30745a(13);
                            c28655q2.m87172p0(c30745a7);
                            obj7 = c30745a7;
                        }
                        obj7 = objM87133R7;
                        function8 = (Function3) obj7;
                    } else {
                        function8 = function4;
                    }
                    C13821r1 c13821r1M92099U7 = AbstractC30060g.m92099U(0, c28655q2, 1);
                    objM87133R = c28655q2.m87133R();
                    objM30468v = objM87133R;
                    if (objM87133R == c28676v0) {
                        objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                    objM87133R2 = c28655q2.m87133R();
                    obj = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        c39970s2 = new C39970s();
                        while (r13.hasNext()) {
                            c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                        }
                        c28655q2.m87172p0(c39970s2);
                        obj = c39970s2;
                    }
                    c39970s = (C39970s) obj;
                    objM87133R3 = c28655q2.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z7 = AbstractC28683x.m87272z("");
                        c28655q2.m87172p0(c28633k1M87272z7);
                        obj2 = c28633k1M87272z7;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    objM87133R4 = c28655q2.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28612f0 c28612f0M87264r7 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                        c28655q2.m87172p0(c28612f0M87264r7);
                        obj3 = c28612f0M87264r7;
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) obj3;
                    C2314t c2314t7 = C2314t.f9131w;
                    Modifier modifierM3599a13 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t7, c13821r1M92099U7, 14), "LabradorReadingSelectSymptomBottomSheet");
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    List<String> list11 = list4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3599a13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                    TextResource textResourceM98867c7 = viewState.getSheetContentViewState().getTitle();
                    int i31114 = TextResource.$stable;
                    String strM21274h7 = AbstractC8693b.m21274h(textResourceM98867c7, c28655q2, i31114);
                    C38072d c38072d7 = C38072d.f163053a;
                    int i31115 = C38072d.f163054b;
                    long jM125430y7 = c38072d7.m121949b(c28655q2, i31115).getBrandWhite();
                    C2886a c2886aM8417O7 = c38072d7.m121952e(c28655q2, i31115).getT2();
                    C36775k c36775k7 = new C36775k(5);
                    int i31116 = C2886a.f11498d << 18;
                    z17 = z16;
                    i27 = i28;
                    AbstractC30795n.m94707h(strM21274h7, null, jM125430y7, 0L, null, null, null, 0L, null, c36775k7, 0L, 0, false, 0, 0, null, c2886aM8417O7, null, c28655q2, 0, i31116, 196090);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i31114), null, c38072d7.m121949b(c28655q2, i31115).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q2, i31115).getB1(), null, c28655q2, 0, i31116, 196090);
                    float f1111 = 4;
                    float f1112 = f1111 * f1111;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1112, c2314t7));
                    AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f1111), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1112, c2314t7));
                    int i31117 = 2;
                    TextResource.C8688b c8688b13 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i31117, false ? 1 : 0);
                    TextResource textResourceM21278l13 = AbstractC8693b.m21278l(str4);
                    TextResource.C8688b c8688b14 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i31117, false ? 1 : 0);
                    TextResource textResourceM21278l14 = AbstractC8693b.m21278l("");
                    objM87133R5 = c28655q2.m87133R();
                    obj4 = objM87133R5;
                    if (objM87133R5 == c28676v0) {
                        C24959n c24959n7 = new C24959n(interfaceC28690z0, 1);
                        c28655q2.m87172p0(c24959n7);
                        obj4 = c24959n7;
                    }
                    Modifier modifierM3500d7 = AbstractC1131a.m3500d(c2314t7, (Function1) obj4);
                    objM87133R6 = c28655q2.m87133R();
                    obj5 = objM87133R6;
                    if (objM87133R6 == c28676v0) {
                        C29802c c29802c7 = new C29802c(10, interfaceC28601c1);
                        c28655q2.m87172p0(c29802c7);
                        obj5 = c29802c7;
                    }
                    Function1 function16 = (Function1) obj5;
                    int i31118 = TextResource.C8688b.f25889c;
                    AbstractC17766l1.m50964e(modifierM3500d7, c8688b13, textResourceM21278l13, c8688b14, textResourceM21278l14, 0, 0, false, false, false, null, false, function16, c28655q2, (i31118 << 9) | (i31118 << 3) | 6 | (i31114 << 6) | (i31114 << 12), 384, 4064);
                    Modifier modifierM91835e7 = AbstractC30007c.m91835e(c2314t7, f1112, c28655q2, c2314t7, 1.0f);
                    float f1113 = 8;
                    Modifier modifierM3599a14 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e7, 5 * f1113, f1111 * f1113), "SymptomsBottomSheetPrimaryButton");
                    EnumC27284v enumC27284v7 = EnumC27284v.TextLarge;
                    String strM21273g7 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                    long jMo134584toComposableColorWaAFU9c7 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    if ((i27 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((57344 & i27) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                    Object objM87133R15 = c28655q2.m87133R();
                    if (zM87157i) {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    } else {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    }
                    AbstractC27282u.m82292h(modifierM3599a14, enumC27284v7, strM21273g7, false, jMo134584toComposableColorWaAFU9c7, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                    C28655q c28655q15 = c28655q2;
                    c28655q15.m87173q(true);
                    function6 = function9;
                    list3 = list11;
                    str3 = str4;
                    z15 = z24;
                    c28655q = c28655q15;
                } else {
                    C28655q c28655q16 = c28655q2;
                    c28655q16.m87138X();
                    list3 = list2;
                    str3 = str2;
                    function5 = function4;
                    z15 = z13;
                    function6 = function2;
                    c28655q = c28655q16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                }
            }
            i28 |= 24576;
            function2 = function1;
            i25 = i14 & 32;
            if (i25 != 0) {
                i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i28 |= i26;
                }
            }
            if ((i28 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i28 & 1, z14)) {
                if (i29 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if (i15 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj8 = objM87133R8;
                        C32618h3 c32618h10 = new C32618h3(20);
                        c28655q2.m87172p0(c32618h10);
                        obj8 = c32618h10;
                    }
                    obj8 = objM87133R8;
                    function7 = (Function1) obj8;
                } else {
                    function7 = function2;
                }
                if (i25 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj7 = objM87133R7;
                        C30745a c30745a8 = new C30745a(13);
                        c28655q2.m87172p0(c30745a8);
                        obj7 = c30745a8;
                    }
                    obj7 = objM87133R7;
                    function8 = (Function3) obj7;
                } else {
                    function8 = function4;
                }
                C13821r1 c13821r1M92099U8 = AbstractC30060g.m92099U(0, c28655q2, 1);
                objM87133R = c28655q2.m87133R();
                objM30468v = objM87133R;
                if (objM87133R == c28676v0) {
                    objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                objM87133R2 = c28655q2.m87133R();
                obj = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    c39970s2 = new C39970s();
                    while (r13.hasNext()) {
                        c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                    }
                    c28655q2.m87172p0(c39970s2);
                    obj = c39970s2;
                }
                c39970s = (C39970s) obj;
                objM87133R3 = c28655q2.m87133R();
                obj2 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z8 = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(c28633k1M87272z8);
                    obj2 = c28633k1M87272z8;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                objM87133R4 = c28655q2.m87133R();
                obj3 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28612f0 c28612f0M87264r8 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                    c28655q2.m87172p0(c28612f0M87264r8);
                    obj3 = c28612f0M87264r8;
                }
                interfaceC28670t2 = (InterfaceC28670t2) obj3;
                C2314t c2314t8 = C2314t.f9131w;
                Modifier modifierM3599a15 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t8, c13821r1M92099U8, 14), "LabradorReadingSelectSymptomBottomSheet");
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                List<String> list12 = list4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3599a15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                TextResource textResourceM98867c8 = viewState.getSheetContentViewState().getTitle();
                int i31119 = TextResource.$stable;
                String strM21274h8 = AbstractC8693b.m21274h(textResourceM98867c8, c28655q2, i31119);
                C38072d c38072d8 = C38072d.f163053a;
                int i311110 = C38072d.f163054b;
                long jM125430y8 = c38072d8.m121949b(c28655q2, i311110).getBrandWhite();
                C2886a c2886aM8417O8 = c38072d8.m121952e(c28655q2, i311110).getT2();
                C36775k c36775k8 = new C36775k(5);
                int i311111 = C2886a.f11498d << 18;
                z17 = z16;
                i27 = i28;
                AbstractC30795n.m94707h(strM21274h8, null, jM125430y8, 0L, null, null, null, 0L, null, c36775k8, 0L, 0, false, 0, 0, null, c2886aM8417O8, null, c28655q2, 0, i311111, 196090);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i31119), null, c38072d8.m121949b(c28655q2, i311110).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q2, i311110).getB1(), null, c28655q2, 0, i311111, 196090);
                float f1114 = 4;
                float f1115 = f1114 * f1114;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1115, c2314t8));
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f1114), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1115, c2314t8));
                int i311112 = 2;
                TextResource.C8688b c8688b15 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i311112, false ? 1 : 0);
                TextResource textResourceM21278l15 = AbstractC8693b.m21278l(str4);
                TextResource.C8688b c8688b16 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i311112, false ? 1 : 0);
                TextResource textResourceM21278l16 = AbstractC8693b.m21278l("");
                objM87133R5 = c28655q2.m87133R();
                obj4 = objM87133R5;
                if (objM87133R5 == c28676v0) {
                    C24959n c24959n8 = new C24959n(interfaceC28690z0, 1);
                    c28655q2.m87172p0(c24959n8);
                    obj4 = c24959n8;
                }
                Modifier modifierM3500d8 = AbstractC1131a.m3500d(c2314t8, (Function1) obj4);
                objM87133R6 = c28655q2.m87133R();
                obj5 = objM87133R6;
                if (objM87133R6 == c28676v0) {
                    C29802c c29802c8 = new C29802c(10, interfaceC28601c1);
                    c28655q2.m87172p0(c29802c8);
                    obj5 = c29802c8;
                }
                Function1 function17 = (Function1) obj5;
                int i311113 = TextResource.C8688b.f25889c;
                AbstractC17766l1.m50964e(modifierM3500d8, c8688b15, textResourceM21278l15, c8688b16, textResourceM21278l16, 0, 0, false, false, false, null, false, function17, c28655q2, (i311113 << 9) | (i311113 << 3) | 6 | (i31119 << 6) | (i31119 << 12), 384, 4064);
                Modifier modifierM91835e8 = AbstractC30007c.m91835e(c2314t8, f1115, c28655q2, c2314t8, 1.0f);
                float f1116 = 8;
                Modifier modifierM3599a16 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e8, 5 * f1116, f1114 * f1116), "SymptomsBottomSheetPrimaryButton");
                EnumC27284v enumC27284v8 = EnumC27284v.TextLarge;
                String strM21273g8 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                long jMo134584toComposableColorWaAFU9c8 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                if ((i27 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if ((57344 & i27) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                Object objM87133R16 = c28655q2.m87133R();
                if (zM87157i) {
                    function9 = function7;
                    function5 = function8;
                    obj6 = new InterfaceC4339a() { // from class: st1.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                        }
                    };
                    z24 = z17;
                    c28655q2.m87172p0(obj6);
                } else {
                    function9 = function7;
                    function5 = function8;
                    obj6 = new InterfaceC4339a() { // from class: st1.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                        }
                    };
                    z24 = z17;
                    c28655q2.m87172p0(obj6);
                }
                AbstractC27282u.m82292h(modifierM3599a16, enumC27284v8, strM21273g8, false, jMo134584toComposableColorWaAFU9c8, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                C28655q c28655q17 = c28655q2;
                c28655q17.m87173q(true);
                function6 = function9;
                list3 = list12;
                str3 = str4;
                z15 = z24;
                c28655q = c28655q17;
            } else {
                C28655q c28655q18 = c28655q2;
                c28655q18.m87138X();
                list3 = list2;
                str3 = str2;
                function5 = function4;
                z15 = z13;
                function6 = function2;
                c28655q = c28655q18;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
            }
        }
        i28 |= 48;
        list2 = list;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                str2 = str;
                if (c28655q2.m87153g(str2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i28 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i28 |= i18;
                }
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i28 |= i24;
                    }
                    i25 = i14 & 32;
                    if (i25 != 0) {
                        i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        function4 = function3;
                    } else {
                        function4 = function3;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(function4)) {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i28 |= i26;
                        }
                    }
                    if ((i28 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i28 & 1, z14)) {
                        if (i29 != 0) {
                            list4 = C25271y.f99162w;
                        } else {
                            list4 = list2;
                        }
                        if (i15 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i19 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                obj8 = objM87133R8;
                                C32618h3 c32618h11 = new C32618h3(20);
                                c28655q2.m87172p0(c32618h11);
                                obj8 = c32618h11;
                            }
                            obj8 = objM87133R8;
                            function7 = (Function1) obj8;
                        } else {
                            function7 = function2;
                        }
                        if (i25 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                obj7 = objM87133R7;
                                C30745a c30745a9 = new C30745a(13);
                                c28655q2.m87172p0(c30745a9);
                                obj7 = c30745a9;
                            }
                            obj7 = objM87133R7;
                            function8 = (Function3) obj7;
                        } else {
                            function8 = function4;
                        }
                        C13821r1 c13821r1M92099U9 = AbstractC30060g.m92099U(0, c28655q2, 1);
                        objM87133R = c28655q2.m87133R();
                        objM30468v = objM87133R;
                        if (objM87133R == c28676v0) {
                            objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                        objM87133R2 = c28655q2.m87133R();
                        obj = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            c39970s2 = new C39970s();
                            while (r13.hasNext()) {
                                c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                            }
                            c28655q2.m87172p0(c39970s2);
                            obj = c39970s2;
                        }
                        c39970s = (C39970s) obj;
                        objM87133R3 = c28655q2.m87133R();
                        obj2 = objM87133R3;
                        if (objM87133R3 == c28676v0) {
                            C28633k1 c28633k1M87272z9 = AbstractC28683x.m87272z("");
                            c28655q2.m87172p0(c28633k1M87272z9);
                            obj2 = c28633k1M87272z9;
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) obj2;
                        objM87133R4 = c28655q2.m87133R();
                        obj3 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C28612f0 c28612f0M87264r9 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                            c28655q2.m87172p0(c28612f0M87264r9);
                            obj3 = c28612f0M87264r9;
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) obj3;
                        C2314t c2314t9 = C2314t.f9131w;
                        Modifier modifierM3599a17 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t9, c13821r1M92099U9, 14), "LabradorReadingSelectSymptomBottomSheet");
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                        List<String> list13 = list4;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3599a17);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N9);
                        TextResource textResourceM98867c9 = viewState.getSheetContentViewState().getTitle();
                        int i311114 = TextResource.$stable;
                        String strM21274h9 = AbstractC8693b.m21274h(textResourceM98867c9, c28655q2, i311114);
                        C38072d c38072d9 = C38072d.f163053a;
                        int i311115 = C38072d.f163054b;
                        long jM125430y9 = c38072d9.m121949b(c28655q2, i311115).getBrandWhite();
                        C2886a c2886aM8417O9 = c38072d9.m121952e(c28655q2, i311115).getT2();
                        C36775k c36775k9 = new C36775k(5);
                        int i311116 = C2886a.f11498d << 18;
                        z17 = z16;
                        i27 = i28;
                        AbstractC30795n.m94707h(strM21274h9, null, jM125430y9, 0L, null, null, null, 0L, null, c36775k9, 0L, 0, false, 0, 0, null, c2886aM8417O9, null, c28655q2, 0, i311116, 196090);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i311114), null, c38072d9.m121949b(c28655q2, i311115).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q2, i311115).getB1(), null, c28655q2, 0, i311116, 196090);
                        float f1117 = 4;
                        float f1118 = f1117 * f1117;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1118, c2314t9));
                        AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f1117), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1118, c2314t9));
                        int i311117 = 2;
                        TextResource.C8688b c8688b17 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i311117, false ? 1 : 0);
                        TextResource textResourceM21278l17 = AbstractC8693b.m21278l(str4);
                        TextResource.C8688b c8688b18 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i311117, false ? 1 : 0);
                        TextResource textResourceM21278l18 = AbstractC8693b.m21278l("");
                        objM87133R5 = c28655q2.m87133R();
                        obj4 = objM87133R5;
                        if (objM87133R5 == c28676v0) {
                            C24959n c24959n9 = new C24959n(interfaceC28690z0, 1);
                            c28655q2.m87172p0(c24959n9);
                            obj4 = c24959n9;
                        }
                        Modifier modifierM3500d9 = AbstractC1131a.m3500d(c2314t9, (Function1) obj4);
                        objM87133R6 = c28655q2.m87133R();
                        obj5 = objM87133R6;
                        if (objM87133R6 == c28676v0) {
                            C29802c c29802c9 = new C29802c(10, interfaceC28601c1);
                            c28655q2.m87172p0(c29802c9);
                            obj5 = c29802c9;
                        }
                        Function1 function18 = (Function1) obj5;
                        int i311118 = TextResource.C8688b.f25889c;
                        AbstractC17766l1.m50964e(modifierM3500d9, c8688b17, textResourceM21278l17, c8688b18, textResourceM21278l18, 0, 0, false, false, false, null, false, function18, c28655q2, (i311118 << 9) | (i311118 << 3) | 6 | (i311114 << 6) | (i311114 << 12), 384, 4064);
                        Modifier modifierM91835e9 = AbstractC30007c.m91835e(c2314t9, f1118, c28655q2, c2314t9, 1.0f);
                        float f1119 = 8;
                        Modifier modifierM3599a18 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e9, 5 * f1119, f1117 * f1119), "SymptomsBottomSheetPrimaryButton");
                        EnumC27284v enumC27284v9 = EnumC27284v.TextLarge;
                        String strM21273g9 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                        long jMo134584toComposableColorWaAFU9c9 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                        if ((i27 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if ((57344 & i27) == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                        Object objM87133R17 = c28655q2.m87133R();
                        if (zM87157i) {
                            function9 = function7;
                            function5 = function8;
                            obj6 = new InterfaceC4339a() { // from class: st1.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                                }
                            };
                            z24 = z17;
                            c28655q2.m87172p0(obj6);
                        } else {
                            function9 = function7;
                            function5 = function8;
                            obj6 = new InterfaceC4339a() { // from class: st1.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                                }
                            };
                            z24 = z17;
                            c28655q2.m87172p0(obj6);
                        }
                        AbstractC27282u.m82292h(modifierM3599a18, enumC27284v9, strM21273g9, false, jMo134584toComposableColorWaAFU9c9, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                        C28655q c28655q19 = c28655q2;
                        c28655q19.m87173q(true);
                        function6 = function9;
                        list3 = list13;
                        str3 = str4;
                        z15 = z24;
                        c28655q = c28655q19;
                    } else {
                        C28655q c28655q110 = c28655q2;
                        c28655q110.m87138X();
                        list3 = list2;
                        str3 = str2;
                        function5 = function4;
                        z15 = z13;
                        function6 = function2;
                        c28655q = c28655q110;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                    }
                }
                i28 |= 24576;
                function2 = function1;
                i25 = i14 & 32;
                if (i25 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(function4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i28 |= i26;
                    }
                }
                if ((i28 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z14)) {
                    if (i29 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if (i15 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj8 = objM87133R8;
                            C32618h3 c32618h12 = new C32618h3(20);
                            c28655q2.m87172p0(c32618h12);
                            obj8 = c32618h12;
                        }
                        obj8 = objM87133R8;
                        function7 = (Function1) obj8;
                    } else {
                        function7 = function2;
                    }
                    if (i25 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj7 = objM87133R7;
                            C30745a c30745a10 = new C30745a(13);
                            c28655q2.m87172p0(c30745a10);
                            obj7 = c30745a10;
                        }
                        obj7 = objM87133R7;
                        function8 = (Function3) obj7;
                    } else {
                        function8 = function4;
                    }
                    C13821r1 c13821r1M92099U10 = AbstractC30060g.m92099U(0, c28655q2, 1);
                    objM87133R = c28655q2.m87133R();
                    objM30468v = objM87133R;
                    if (objM87133R == c28676v0) {
                        objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                    objM87133R2 = c28655q2.m87133R();
                    obj = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        c39970s2 = new C39970s();
                        while (r13.hasNext()) {
                            c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                        }
                        c28655q2.m87172p0(c39970s2);
                        obj = c39970s2;
                    }
                    c39970s = (C39970s) obj;
                    objM87133R3 = c28655q2.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z10 = AbstractC28683x.m87272z("");
                        c28655q2.m87172p0(c28633k1M87272z10);
                        obj2 = c28633k1M87272z10;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    objM87133R4 = c28655q2.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28612f0 c28612f0M87264r10 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                        c28655q2.m87172p0(c28612f0M87264r10);
                        obj3 = c28612f0M87264r10;
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) obj3;
                    C2314t c2314t10 = C2314t.f9131w;
                    Modifier modifierM3599a19 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t10, c13821r1M92099U10, 14), "LabradorReadingSelectSymptomBottomSheet");
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    List<String> list14 = list4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3599a19);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
                    TextResource textResourceM98867c10 = viewState.getSheetContentViewState().getTitle();
                    int i311119 = TextResource.$stable;
                    String strM21274h10 = AbstractC8693b.m21274h(textResourceM98867c10, c28655q2, i311119);
                    C38072d c38072d10 = C38072d.f163053a;
                    int i3111110 = C38072d.f163054b;
                    long jM125430y10 = c38072d10.m121949b(c28655q2, i3111110).getBrandWhite();
                    C2886a c2886aM8417O10 = c38072d10.m121952e(c28655q2, i3111110).getT2();
                    C36775k c36775k10 = new C36775k(5);
                    int i3111111 = C2886a.f11498d << 18;
                    z17 = z16;
                    i27 = i28;
                    AbstractC30795n.m94707h(strM21274h10, null, jM125430y10, 0L, null, null, null, 0L, null, c36775k10, 0L, 0, false, 0, 0, null, c2886aM8417O10, null, c28655q2, 0, i3111111, 196090);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i311119), null, c38072d10.m121949b(c28655q2, i3111110).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d10.m121952e(c28655q2, i3111110).getB1(), null, c28655q2, 0, i3111111, 196090);
                    float f11110 = 4;
                    float f11111 = f11110 * f11110;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f11111, c2314t10));
                    AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f11110), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f11111, c2314t10));
                    int i3111112 = 2;
                    TextResource.C8688b c8688b19 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i3111112, false ? 1 : 0);
                    TextResource textResourceM21278l19 = AbstractC8693b.m21278l(str4);
                    TextResource.C8688b c8688b110 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i3111112, false ? 1 : 0);
                    TextResource textResourceM21278l110 = AbstractC8693b.m21278l("");
                    objM87133R5 = c28655q2.m87133R();
                    obj4 = objM87133R5;
                    if (objM87133R5 == c28676v0) {
                        C24959n c24959n10 = new C24959n(interfaceC28690z0, 1);
                        c28655q2.m87172p0(c24959n10);
                        obj4 = c24959n10;
                    }
                    Modifier modifierM3500d10 = AbstractC1131a.m3500d(c2314t10, (Function1) obj4);
                    objM87133R6 = c28655q2.m87133R();
                    obj5 = objM87133R6;
                    if (objM87133R6 == c28676v0) {
                        C29802c c29802c10 = new C29802c(10, interfaceC28601c1);
                        c28655q2.m87172p0(c29802c10);
                        obj5 = c29802c10;
                    }
                    Function1 function19 = (Function1) obj5;
                    int i3111113 = TextResource.C8688b.f25889c;
                    AbstractC17766l1.m50964e(modifierM3500d10, c8688b19, textResourceM21278l19, c8688b110, textResourceM21278l110, 0, 0, false, false, false, null, false, function19, c28655q2, (i3111113 << 9) | (i3111113 << 3) | 6 | (i311119 << 6) | (i311119 << 12), 384, 4064);
                    Modifier modifierM91835e10 = AbstractC30007c.m91835e(c2314t10, f11111, c28655q2, c2314t10, 1.0f);
                    float f11112 = 8;
                    Modifier modifierM3599a110 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e10, 5 * f11112, f11110 * f11112), "SymptomsBottomSheetPrimaryButton");
                    EnumC27284v enumC27284v10 = EnumC27284v.TextLarge;
                    String strM21273g10 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                    long jMo134584toComposableColorWaAFU9c10 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    if ((i27 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((57344 & i27) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                    Object objM87133R18 = c28655q2.m87133R();
                    if (zM87157i) {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    } else {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    }
                    AbstractC27282u.m82292h(modifierM3599a110, enumC27284v10, strM21273g10, false, jMo134584toComposableColorWaAFU9c10, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                    C28655q c28655q111 = c28655q2;
                    c28655q111.m87173q(true);
                    function6 = function9;
                    list3 = list14;
                    str3 = str4;
                    z15 = z24;
                    c28655q = c28655q111;
                } else {
                    C28655q c28655q112 = c28655q2;
                    c28655q112.m87138X();
                    list3 = list2;
                    str3 = str2;
                    function5 = function4;
                    z15 = z13;
                    function6 = function2;
                    c28655q = c28655q112;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                }
            }
            i28 |= 3072;
            z13 = z4;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i28 |= i24;
                }
                i25 = i14 & 32;
                if (i25 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(function4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i28 |= i26;
                    }
                }
                if ((i28 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z14)) {
                    if (i29 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if (i15 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj8 = objM87133R8;
                            C32618h3 c32618h13 = new C32618h3(20);
                            c28655q2.m87172p0(c32618h13);
                            obj8 = c32618h13;
                        }
                        obj8 = objM87133R8;
                        function7 = (Function1) obj8;
                    } else {
                        function7 = function2;
                    }
                    if (i25 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj7 = objM87133R7;
                            C30745a c30745a11 = new C30745a(13);
                            c28655q2.m87172p0(c30745a11);
                            obj7 = c30745a11;
                        }
                        obj7 = objM87133R7;
                        function8 = (Function3) obj7;
                    } else {
                        function8 = function4;
                    }
                    C13821r1 c13821r1M92099U11 = AbstractC30060g.m92099U(0, c28655q2, 1);
                    objM87133R = c28655q2.m87133R();
                    objM30468v = objM87133R;
                    if (objM87133R == c28676v0) {
                        objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                    objM87133R2 = c28655q2.m87133R();
                    obj = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        c39970s2 = new C39970s();
                        while (r13.hasNext()) {
                            c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                        }
                        c28655q2.m87172p0(c39970s2);
                        obj = c39970s2;
                    }
                    c39970s = (C39970s) obj;
                    objM87133R3 = c28655q2.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z11 = AbstractC28683x.m87272z("");
                        c28655q2.m87172p0(c28633k1M87272z11);
                        obj2 = c28633k1M87272z11;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    objM87133R4 = c28655q2.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28612f0 c28612f0M87264r11 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                        c28655q2.m87172p0(c28612f0M87264r11);
                        obj3 = c28612f0M87264r11;
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) obj3;
                    C2314t c2314t11 = C2314t.f9131w;
                    Modifier modifierM3599a111 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t11, c13821r1M92099U11, 14), "LabradorReadingSelectSymptomBottomSheet");
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    List<String> list15 = list4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3599a111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11);
                    TextResource textResourceM98867c11 = viewState.getSheetContentViewState().getTitle();
                    int i3111114 = TextResource.$stable;
                    String strM21274h11 = AbstractC8693b.m21274h(textResourceM98867c11, c28655q2, i3111114);
                    C38072d c38072d11 = C38072d.f163053a;
                    int i3111115 = C38072d.f163054b;
                    long jM125430y11 = c38072d11.m121949b(c28655q2, i3111115).getBrandWhite();
                    C2886a c2886aM8417O11 = c38072d11.m121952e(c28655q2, i3111115).getT2();
                    C36775k c36775k11 = new C36775k(5);
                    int i3111116 = C2886a.f11498d << 18;
                    z17 = z16;
                    i27 = i28;
                    AbstractC30795n.m94707h(strM21274h11, null, jM125430y11, 0L, null, null, null, 0L, null, c36775k11, 0L, 0, false, 0, 0, null, c2886aM8417O11, null, c28655q2, 0, i3111116, 196090);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i3111114), null, c38072d11.m121949b(c28655q2, i3111115).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q2, i3111115).getB1(), null, c28655q2, 0, i3111116, 196090);
                    float f11113 = 4;
                    float f11114 = f11113 * f11113;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f11114, c2314t11));
                    AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f11113), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f11114, c2314t11));
                    int i3111117 = 2;
                    TextResource.C8688b c8688b111 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i3111117, false ? 1 : 0);
                    TextResource textResourceM21278l111 = AbstractC8693b.m21278l(str4);
                    TextResource.C8688b c8688b112 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i3111117, false ? 1 : 0);
                    TextResource textResourceM21278l112 = AbstractC8693b.m21278l("");
                    objM87133R5 = c28655q2.m87133R();
                    obj4 = objM87133R5;
                    if (objM87133R5 == c28676v0) {
                        C24959n c24959n11 = new C24959n(interfaceC28690z0, 1);
                        c28655q2.m87172p0(c24959n11);
                        obj4 = c24959n11;
                    }
                    Modifier modifierM3500d11 = AbstractC1131a.m3500d(c2314t11, (Function1) obj4);
                    objM87133R6 = c28655q2.m87133R();
                    obj5 = objM87133R6;
                    if (objM87133R6 == c28676v0) {
                        C29802c c29802c11 = new C29802c(10, interfaceC28601c1);
                        c28655q2.m87172p0(c29802c11);
                        obj5 = c29802c11;
                    }
                    Function1 function110 = (Function1) obj5;
                    int i3111118 = TextResource.C8688b.f25889c;
                    AbstractC17766l1.m50964e(modifierM3500d11, c8688b111, textResourceM21278l111, c8688b112, textResourceM21278l112, 0, 0, false, false, false, null, false, function110, c28655q2, (i3111118 << 9) | (i3111118 << 3) | 6 | (i3111114 << 6) | (i3111114 << 12), 384, 4064);
                    Modifier modifierM91835e11 = AbstractC30007c.m91835e(c2314t11, f11114, c28655q2, c2314t11, 1.0f);
                    float f11115 = 8;
                    Modifier modifierM3599a112 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e11, 5 * f11115, f11113 * f11115), "SymptomsBottomSheetPrimaryButton");
                    EnumC27284v enumC27284v11 = EnumC27284v.TextLarge;
                    String strM21273g11 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                    long jMo134584toComposableColorWaAFU9c11 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    if ((i27 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((57344 & i27) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                    Object objM87133R19 = c28655q2.m87133R();
                    if (zM87157i) {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    } else {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    }
                    AbstractC27282u.m82292h(modifierM3599a112, enumC27284v11, strM21273g11, false, jMo134584toComposableColorWaAFU9c11, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                    C28655q c28655q113 = c28655q2;
                    c28655q113.m87173q(true);
                    function6 = function9;
                    list3 = list15;
                    str3 = str4;
                    z15 = z24;
                    c28655q = c28655q113;
                } else {
                    C28655q c28655q114 = c28655q2;
                    c28655q114.m87138X();
                    list3 = list2;
                    str3 = str2;
                    function5 = function4;
                    z15 = z13;
                    function6 = function2;
                    c28655q = c28655q114;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                }
            }
            i28 |= 24576;
            function2 = function1;
            i25 = i14 & 32;
            if (i25 != 0) {
                i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i28 |= i26;
                }
            }
            if ((i28 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i28 & 1, z14)) {
                if (i29 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if (i15 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj8 = objM87133R8;
                        C32618h3 c32618h14 = new C32618h3(20);
                        c28655q2.m87172p0(c32618h14);
                        obj8 = c32618h14;
                    }
                    obj8 = objM87133R8;
                    function7 = (Function1) obj8;
                } else {
                    function7 = function2;
                }
                if (i25 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj7 = objM87133R7;
                        C30745a c30745a12 = new C30745a(13);
                        c28655q2.m87172p0(c30745a12);
                        obj7 = c30745a12;
                    }
                    obj7 = objM87133R7;
                    function8 = (Function3) obj7;
                } else {
                    function8 = function4;
                }
                C13821r1 c13821r1M92099U12 = AbstractC30060g.m92099U(0, c28655q2, 1);
                objM87133R = c28655q2.m87133R();
                objM30468v = objM87133R;
                if (objM87133R == c28676v0) {
                    objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                objM87133R2 = c28655q2.m87133R();
                obj = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    c39970s2 = new C39970s();
                    while (r13.hasNext()) {
                        c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                    }
                    c28655q2.m87172p0(c39970s2);
                    obj = c39970s2;
                }
                c39970s = (C39970s) obj;
                objM87133R3 = c28655q2.m87133R();
                obj2 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z12 = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(c28633k1M87272z12);
                    obj2 = c28633k1M87272z12;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                objM87133R4 = c28655q2.m87133R();
                obj3 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28612f0 c28612f0M87264r12 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                    c28655q2.m87172p0(c28612f0M87264r12);
                    obj3 = c28612f0M87264r12;
                }
                interfaceC28670t2 = (InterfaceC28670t2) obj3;
                C2314t c2314t12 = C2314t.f9131w;
                Modifier modifierM3599a113 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t12, c13821r1M92099U12, 14), "LabradorReadingSelectSymptomBottomSheet");
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                List<String> list16 = list4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3599a113);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N12);
                TextResource textResourceM98867c12 = viewState.getSheetContentViewState().getTitle();
                int i3111119 = TextResource.$stable;
                String strM21274h12 = AbstractC8693b.m21274h(textResourceM98867c12, c28655q2, i3111119);
                C38072d c38072d12 = C38072d.f163053a;
                int i31111110 = C38072d.f163054b;
                long jM125430y12 = c38072d12.m121949b(c28655q2, i31111110).getBrandWhite();
                C2886a c2886aM8417O12 = c38072d12.m121952e(c28655q2, i31111110).getT2();
                C36775k c36775k12 = new C36775k(5);
                int i31111111 = C2886a.f11498d << 18;
                z17 = z16;
                i27 = i28;
                AbstractC30795n.m94707h(strM21274h12, null, jM125430y12, 0L, null, null, null, 0L, null, c36775k12, 0L, 0, false, 0, 0, null, c2886aM8417O12, null, c28655q2, 0, i31111111, 196090);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i3111119), null, c38072d12.m121949b(c28655q2, i31111110).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d12.m121952e(c28655q2, i31111110).getB1(), null, c28655q2, 0, i31111111, 196090);
                float f11116 = 4;
                float f11117 = f11116 * f11116;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f11117, c2314t12));
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f11116), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f11117, c2314t12));
                int i31111112 = 2;
                TextResource.C8688b c8688b113 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i31111112, false ? 1 : 0);
                TextResource textResourceM21278l113 = AbstractC8693b.m21278l(str4);
                TextResource.C8688b c8688b114 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i31111112, false ? 1 : 0);
                TextResource textResourceM21278l114 = AbstractC8693b.m21278l("");
                objM87133R5 = c28655q2.m87133R();
                obj4 = objM87133R5;
                if (objM87133R5 == c28676v0) {
                    C24959n c24959n12 = new C24959n(interfaceC28690z0, 1);
                    c28655q2.m87172p0(c24959n12);
                    obj4 = c24959n12;
                }
                Modifier modifierM3500d12 = AbstractC1131a.m3500d(c2314t12, (Function1) obj4);
                objM87133R6 = c28655q2.m87133R();
                obj5 = objM87133R6;
                if (objM87133R6 == c28676v0) {
                    C29802c c29802c12 = new C29802c(10, interfaceC28601c1);
                    c28655q2.m87172p0(c29802c12);
                    obj5 = c29802c12;
                }
                Function1 function111 = (Function1) obj5;
                int i31111113 = TextResource.C8688b.f25889c;
                AbstractC17766l1.m50964e(modifierM3500d12, c8688b113, textResourceM21278l113, c8688b114, textResourceM21278l114, 0, 0, false, false, false, null, false, function111, c28655q2, (i31111113 << 9) | (i31111113 << 3) | 6 | (i3111119 << 6) | (i3111119 << 12), 384, 4064);
                Modifier modifierM91835e12 = AbstractC30007c.m91835e(c2314t12, f11117, c28655q2, c2314t12, 1.0f);
                float f11118 = 8;
                Modifier modifierM3599a114 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e12, 5 * f11118, f11116 * f11118), "SymptomsBottomSheetPrimaryButton");
                EnumC27284v enumC27284v12 = EnumC27284v.TextLarge;
                String strM21273g12 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                long jMo134584toComposableColorWaAFU9c12 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                if ((i27 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if ((57344 & i27) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                Object objM87133R110 = c28655q2.m87133R();
                if (zM87157i) {
                    function9 = function7;
                    function5 = function8;
                    obj6 = new InterfaceC4339a() { // from class: st1.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                        }
                    };
                    z24 = z17;
                    c28655q2.m87172p0(obj6);
                } else {
                    function9 = function7;
                    function5 = function8;
                    obj6 = new InterfaceC4339a() { // from class: st1.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                        }
                    };
                    z24 = z17;
                    c28655q2.m87172p0(obj6);
                }
                AbstractC27282u.m82292h(modifierM3599a114, enumC27284v12, strM21273g12, false, jMo134584toComposableColorWaAFU9c12, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                C28655q c28655q115 = c28655q2;
                c28655q115.m87173q(true);
                function6 = function9;
                list3 = list16;
                str3 = str4;
                z15 = z24;
                c28655q = c28655q115;
            } else {
                C28655q c28655q116 = c28655q2;
                c28655q116.m87138X();
                list3 = list2;
                str3 = str2;
                function5 = function4;
                z15 = z13;
                function6 = function2;
                c28655q = c28655q116;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
            }
        }
        i28 |= 384;
        str2 = str;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i28 |= i18;
            }
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i28 |= i24;
                }
                i25 = i14 & 32;
                if (i25 != 0) {
                    i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(function4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i28 |= i26;
                    }
                }
                if ((i28 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i28 & 1, z14)) {
                    if (i29 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    if (i15 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj8 = objM87133R8;
                            C32618h3 c32618h15 = new C32618h3(20);
                            c28655q2.m87172p0(c32618h15);
                            obj8 = c32618h15;
                        }
                        obj8 = objM87133R8;
                        function7 = (Function1) obj8;
                    } else {
                        function7 = function2;
                    }
                    if (i25 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj7 = objM87133R7;
                            C30745a c30745a13 = new C30745a(13);
                            c28655q2.m87172p0(c30745a13);
                            obj7 = c30745a13;
                        }
                        obj7 = objM87133R7;
                        function8 = (Function3) obj7;
                    } else {
                        function8 = function4;
                    }
                    C13821r1 c13821r1M92099U13 = AbstractC30060g.m92099U(0, c28655q2, 1);
                    objM87133R = c28655q2.m87133R();
                    objM30468v = objM87133R;
                    if (objM87133R == c28676v0) {
                        objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                    objM87133R2 = c28655q2.m87133R();
                    obj = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        c39970s2 = new C39970s();
                        while (r13.hasNext()) {
                            c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                        }
                        c28655q2.m87172p0(c39970s2);
                        obj = c39970s2;
                    }
                    c39970s = (C39970s) obj;
                    objM87133R3 = c28655q2.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z13 = AbstractC28683x.m87272z("");
                        c28655q2.m87172p0(c28633k1M87272z13);
                        obj2 = c28633k1M87272z13;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    objM87133R4 = c28655q2.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28612f0 c28612f0M87264r13 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                        c28655q2.m87172p0(c28612f0M87264r13);
                        obj3 = c28612f0M87264r13;
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) obj3;
                    C2314t c2314t13 = C2314t.f9131w;
                    Modifier modifierM3599a115 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t13, c13821r1M92099U13, 14), "LabradorReadingSelectSymptomBottomSheet");
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    List<String> list17 = list4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3599a115);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N13);
                    TextResource textResourceM98867c13 = viewState.getSheetContentViewState().getTitle();
                    int i31111114 = TextResource.$stable;
                    String strM21274h13 = AbstractC8693b.m21274h(textResourceM98867c13, c28655q2, i31111114);
                    C38072d c38072d13 = C38072d.f163053a;
                    int i31111115 = C38072d.f163054b;
                    long jM125430y13 = c38072d13.m121949b(c28655q2, i31111115).getBrandWhite();
                    C2886a c2886aM8417O13 = c38072d13.m121952e(c28655q2, i31111115).getT2();
                    C36775k c36775k13 = new C36775k(5);
                    int i31111116 = C2886a.f11498d << 18;
                    z17 = z16;
                    i27 = i28;
                    AbstractC30795n.m94707h(strM21274h13, null, jM125430y13, 0L, null, null, null, 0L, null, c36775k13, 0L, 0, false, 0, 0, null, c2886aM8417O13, null, c28655q2, 0, i31111116, 196090);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i31111114), null, c38072d13.m121949b(c28655q2, i31111115).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d13.m121952e(c28655q2, i31111115).getB1(), null, c28655q2, 0, i31111116, 196090);
                    float f11119 = 4;
                    float f111110 = f11119 * f11119;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111110, c2314t13));
                    AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f11119), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111110, c2314t13));
                    int i31111117 = 2;
                    TextResource.C8688b c8688b115 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i31111117, false ? 1 : 0);
                    TextResource textResourceM21278l115 = AbstractC8693b.m21278l(str4);
                    TextResource.C8688b c8688b116 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i31111117, false ? 1 : 0);
                    TextResource textResourceM21278l116 = AbstractC8693b.m21278l("");
                    objM87133R5 = c28655q2.m87133R();
                    obj4 = objM87133R5;
                    if (objM87133R5 == c28676v0) {
                        C24959n c24959n13 = new C24959n(interfaceC28690z0, 1);
                        c28655q2.m87172p0(c24959n13);
                        obj4 = c24959n13;
                    }
                    Modifier modifierM3500d13 = AbstractC1131a.m3500d(c2314t13, (Function1) obj4);
                    objM87133R6 = c28655q2.m87133R();
                    obj5 = objM87133R6;
                    if (objM87133R6 == c28676v0) {
                        C29802c c29802c13 = new C29802c(10, interfaceC28601c1);
                        c28655q2.m87172p0(c29802c13);
                        obj5 = c29802c13;
                    }
                    Function1 function112 = (Function1) obj5;
                    int i31111118 = TextResource.C8688b.f25889c;
                    AbstractC17766l1.m50964e(modifierM3500d13, c8688b115, textResourceM21278l115, c8688b116, textResourceM21278l116, 0, 0, false, false, false, null, false, function112, c28655q2, (i31111118 << 9) | (i31111118 << 3) | 6 | (i31111114 << 6) | (i31111114 << 12), 384, 4064);
                    Modifier modifierM91835e13 = AbstractC30007c.m91835e(c2314t13, f111110, c28655q2, c2314t13, 1.0f);
                    float f111111 = 8;
                    Modifier modifierM3599a116 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e13, 5 * f111111, f11119 * f111111), "SymptomsBottomSheetPrimaryButton");
                    EnumC27284v enumC27284v13 = EnumC27284v.TextLarge;
                    String strM21273g13 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                    long jMo134584toComposableColorWaAFU9c13 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    if ((i27 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((57344 & i27) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                    Object objM87133R111 = c28655q2.m87133R();
                    if (zM87157i) {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    } else {
                        function9 = function7;
                        function5 = function8;
                        obj6 = new InterfaceC4339a() { // from class: st1.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                            }
                        };
                        z24 = z17;
                        c28655q2.m87172p0(obj6);
                    }
                    AbstractC27282u.m82292h(modifierM3599a116, enumC27284v13, strM21273g13, false, jMo134584toComposableColorWaAFU9c13, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                    C28655q c28655q117 = c28655q2;
                    c28655q117.m87173q(true);
                    function6 = function9;
                    list3 = list17;
                    str3 = str4;
                    z15 = z24;
                    c28655q = c28655q117;
                } else {
                    C28655q c28655q118 = c28655q2;
                    c28655q118.m87138X();
                    list3 = list2;
                    str3 = str2;
                    function5 = function4;
                    z15 = z13;
                    function6 = function2;
                    c28655q = c28655q118;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
                }
            }
            i28 |= 24576;
            function2 = function1;
            i25 = i14 & 32;
            if (i25 != 0) {
                i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i28 |= i26;
                }
            }
            if ((i28 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i28 & 1, z14)) {
                if (i29 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if (i15 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj8 = objM87133R8;
                        C32618h3 c32618h16 = new C32618h3(20);
                        c28655q2.m87172p0(c32618h16);
                        obj8 = c32618h16;
                    }
                    obj8 = objM87133R8;
                    function7 = (Function1) obj8;
                } else {
                    function7 = function2;
                }
                if (i25 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj7 = objM87133R7;
                        C30745a c30745a14 = new C30745a(13);
                        c28655q2.m87172p0(c30745a14);
                        obj7 = c30745a14;
                    }
                    obj7 = objM87133R7;
                    function8 = (Function3) obj7;
                } else {
                    function8 = function4;
                }
                C13821r1 c13821r1M92099U14 = AbstractC30060g.m92099U(0, c28655q2, 1);
                objM87133R = c28655q2.m87133R();
                objM30468v = objM87133R;
                if (objM87133R == c28676v0) {
                    objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                objM87133R2 = c28655q2.m87133R();
                obj = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    c39970s2 = new C39970s();
                    while (r13.hasNext()) {
                        c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                    }
                    c28655q2.m87172p0(c39970s2);
                    obj = c39970s2;
                }
                c39970s = (C39970s) obj;
                objM87133R3 = c28655q2.m87133R();
                obj2 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z14 = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(c28633k1M87272z14);
                    obj2 = c28633k1M87272z14;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                objM87133R4 = c28655q2.m87133R();
                obj3 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28612f0 c28612f0M87264r14 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                    c28655q2.m87172p0(c28612f0M87264r14);
                    obj3 = c28612f0M87264r14;
                }
                interfaceC28670t2 = (InterfaceC28670t2) obj3;
                C2314t c2314t14 = C2314t.f9131w;
                Modifier modifierM3599a117 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t14, c13821r1M92099U14, 14), "LabradorReadingSelectSymptomBottomSheet");
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                List<String> list18 = list4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3599a117);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N14);
                TextResource textResourceM98867c14 = viewState.getSheetContentViewState().getTitle();
                int i31111119 = TextResource.$stable;
                String strM21274h14 = AbstractC8693b.m21274h(textResourceM98867c14, c28655q2, i31111119);
                C38072d c38072d14 = C38072d.f163053a;
                int i311111110 = C38072d.f163054b;
                long jM125430y14 = c38072d14.m121949b(c28655q2, i311111110).getBrandWhite();
                C2886a c2886aM8417O14 = c38072d14.m121952e(c28655q2, i311111110).getT2();
                C36775k c36775k14 = new C36775k(5);
                int i311111111 = C2886a.f11498d << 18;
                z17 = z16;
                i27 = i28;
                AbstractC30795n.m94707h(strM21274h14, null, jM125430y14, 0L, null, null, null, 0L, null, c36775k14, 0L, 0, false, 0, 0, null, c2886aM8417O14, null, c28655q2, 0, i311111111, 196090);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i31111119), null, c38072d14.m121949b(c28655q2, i311111110).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d14.m121952e(c28655q2, i311111110).getB1(), null, c28655q2, 0, i311111111, 196090);
                float f111112 = 4;
                float f111113 = f111112 * f111112;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111113, c2314t14));
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f111112), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111113, c2314t14));
                int i311111112 = 2;
                TextResource.C8688b c8688b117 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i311111112, false ? 1 : 0);
                TextResource textResourceM21278l117 = AbstractC8693b.m21278l(str4);
                TextResource.C8688b c8688b118 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i311111112, false ? 1 : 0);
                TextResource textResourceM21278l118 = AbstractC8693b.m21278l("");
                objM87133R5 = c28655q2.m87133R();
                obj4 = objM87133R5;
                if (objM87133R5 == c28676v0) {
                    C24959n c24959n14 = new C24959n(interfaceC28690z0, 1);
                    c28655q2.m87172p0(c24959n14);
                    obj4 = c24959n14;
                }
                Modifier modifierM3500d14 = AbstractC1131a.m3500d(c2314t14, (Function1) obj4);
                objM87133R6 = c28655q2.m87133R();
                obj5 = objM87133R6;
                if (objM87133R6 == c28676v0) {
                    C29802c c29802c14 = new C29802c(10, interfaceC28601c1);
                    c28655q2.m87172p0(c29802c14);
                    obj5 = c29802c14;
                }
                Function1 function113 = (Function1) obj5;
                int i311111113 = TextResource.C8688b.f25889c;
                AbstractC17766l1.m50964e(modifierM3500d14, c8688b117, textResourceM21278l117, c8688b118, textResourceM21278l118, 0, 0, false, false, false, null, false, function113, c28655q2, (i311111113 << 9) | (i311111113 << 3) | 6 | (i31111119 << 6) | (i31111119 << 12), 384, 4064);
                Modifier modifierM91835e14 = AbstractC30007c.m91835e(c2314t14, f111113, c28655q2, c2314t14, 1.0f);
                float f111114 = 8;
                Modifier modifierM3599a118 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e14, 5 * f111114, f111112 * f111114), "SymptomsBottomSheetPrimaryButton");
                EnumC27284v enumC27284v14 = EnumC27284v.TextLarge;
                String strM21273g14 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                long jMo134584toComposableColorWaAFU9c14 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                if ((i27 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if ((57344 & i27) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                Object objM87133R112 = c28655q2.m87133R();
                if (zM87157i) {
                    function9 = function7;
                    function5 = function8;
                    obj6 = new InterfaceC4339a() { // from class: st1.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                        }
                    };
                    z24 = z17;
                    c28655q2.m87172p0(obj6);
                } else {
                    function9 = function7;
                    function5 = function8;
                    obj6 = new InterfaceC4339a() { // from class: st1.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                        }
                    };
                    z24 = z17;
                    c28655q2.m87172p0(obj6);
                }
                AbstractC27282u.m82292h(modifierM3599a118, enumC27284v14, strM21273g14, false, jMo134584toComposableColorWaAFU9c14, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                C28655q c28655q119 = c28655q2;
                c28655q119.m87173q(true);
                function6 = function9;
                list3 = list18;
                str3 = str4;
                z15 = z24;
                c28655q = c28655q119;
            } else {
                C28655q c28655q1110 = c28655q2;
                c28655q1110.m87138X();
                list3 = list2;
                str3 = str2;
                function5 = function4;
                z15 = z13;
                function6 = function2;
                c28655q = c28655q1110;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
            }
        }
        i28 |= 3072;
        z13 = z4;
        i19 = i14 & 16;
        if (i19 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i28 |= i24;
            }
            i25 = i14 & 32;
            if (i25 != 0) {
                i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i28 |= i26;
                }
            }
            if ((i28 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i28 & 1, z14)) {
                if (i29 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if (i15 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj8 = objM87133R8;
                        C32618h3 c32618h17 = new C32618h3(20);
                        c28655q2.m87172p0(c32618h17);
                        obj8 = c32618h17;
                    }
                    obj8 = objM87133R8;
                    function7 = (Function1) obj8;
                } else {
                    function7 = function2;
                }
                if (i25 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj7 = objM87133R7;
                        C30745a c30745a15 = new C30745a(13);
                        c28655q2.m87172p0(c30745a15);
                        obj7 = c30745a15;
                    }
                    obj7 = objM87133R7;
                    function8 = (Function3) obj7;
                } else {
                    function8 = function4;
                }
                C13821r1 c13821r1M92099U15 = AbstractC30060g.m92099U(0, c28655q2, 1);
                objM87133R = c28655q2.m87133R();
                objM30468v = objM87133R;
                if (objM87133R == c28676v0) {
                    objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
                objM87133R2 = c28655q2.m87133R();
                obj = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    c39970s2 = new C39970s();
                    while (r13.hasNext()) {
                        c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                    }
                    c28655q2.m87172p0(c39970s2);
                    obj = c39970s2;
                }
                c39970s = (C39970s) obj;
                objM87133R3 = c28655q2.m87133R();
                obj2 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z15 = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(c28633k1M87272z15);
                    obj2 = c28633k1M87272z15;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                objM87133R4 = c28655q2.m87133R();
                obj3 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28612f0 c28612f0M87264r15 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                    c28655q2.m87172p0(c28612f0M87264r15);
                    obj3 = c28612f0M87264r15;
                }
                interfaceC28670t2 = (InterfaceC28670t2) obj3;
                C2314t c2314t15 = C2314t.f9131w;
                Modifier modifierM3599a119 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t15, c13821r1M92099U15, 14), "LabradorReadingSelectSymptomBottomSheet");
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                List<String> list19 = list4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3599a119);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a15);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N15);
                TextResource textResourceM98867c15 = viewState.getSheetContentViewState().getTitle();
                int i311111114 = TextResource.$stable;
                String strM21274h15 = AbstractC8693b.m21274h(textResourceM98867c15, c28655q2, i311111114);
                C38072d c38072d15 = C38072d.f163053a;
                int i311111115 = C38072d.f163054b;
                long jM125430y15 = c38072d15.m121949b(c28655q2, i311111115).getBrandWhite();
                C2886a c2886aM8417O15 = c38072d15.m121952e(c28655q2, i311111115).getT2();
                C36775k c36775k15 = new C36775k(5);
                int i311111116 = C2886a.f11498d << 18;
                z17 = z16;
                i27 = i28;
                AbstractC30795n.m94707h(strM21274h15, null, jM125430y15, 0L, null, null, null, 0L, null, c36775k15, 0L, 0, false, 0, 0, null, c2886aM8417O15, null, c28655q2, 0, i311111116, 196090);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i311111114), null, c38072d15.m121949b(c28655q2, i311111115).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d15.m121952e(c28655q2, i311111115).getB1(), null, c28655q2, 0, i311111116, 196090);
                float f111115 = 4;
                float f111116 = f111115 * f111115;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111116, c2314t15));
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f111115), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111116, c2314t15));
                int i311111117 = 2;
                TextResource.C8688b c8688b119 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i311111117, false ? 1 : 0);
                TextResource textResourceM21278l119 = AbstractC8693b.m21278l(str4);
                TextResource.C8688b c8688b1110 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i311111117, false ? 1 : 0);
                TextResource textResourceM21278l1110 = AbstractC8693b.m21278l("");
                objM87133R5 = c28655q2.m87133R();
                obj4 = objM87133R5;
                if (objM87133R5 == c28676v0) {
                    C24959n c24959n15 = new C24959n(interfaceC28690z0, 1);
                    c28655q2.m87172p0(c24959n15);
                    obj4 = c24959n15;
                }
                Modifier modifierM3500d15 = AbstractC1131a.m3500d(c2314t15, (Function1) obj4);
                objM87133R6 = c28655q2.m87133R();
                obj5 = objM87133R6;
                if (objM87133R6 == c28676v0) {
                    C29802c c29802c15 = new C29802c(10, interfaceC28601c1);
                    c28655q2.m87172p0(c29802c15);
                    obj5 = c29802c15;
                }
                Function1 function114 = (Function1) obj5;
                int i311111118 = TextResource.C8688b.f25889c;
                AbstractC17766l1.m50964e(modifierM3500d15, c8688b119, textResourceM21278l119, c8688b1110, textResourceM21278l1110, 0, 0, false, false, false, null, false, function114, c28655q2, (i311111118 << 9) | (i311111118 << 3) | 6 | (i311111114 << 6) | (i311111114 << 12), 384, 4064);
                Modifier modifierM91835e15 = AbstractC30007c.m91835e(c2314t15, f111116, c28655q2, c2314t15, 1.0f);
                float f111117 = 8;
                Modifier modifierM3599a1110 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e15, 5 * f111117, f111115 * f111117), "SymptomsBottomSheetPrimaryButton");
                EnumC27284v enumC27284v15 = EnumC27284v.TextLarge;
                String strM21273g15 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
                long jMo134584toComposableColorWaAFU9c15 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
                if ((i27 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if ((57344 & i27) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
                Object objM87133R113 = c28655q2.m87133R();
                if (zM87157i) {
                    function9 = function7;
                    function5 = function8;
                    obj6 = new InterfaceC4339a() { // from class: st1.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                        }
                    };
                    z24 = z17;
                    c28655q2.m87172p0(obj6);
                } else {
                    function9 = function7;
                    function5 = function8;
                    obj6 = new InterfaceC4339a() { // from class: st1.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                        }
                    };
                    z24 = z17;
                    c28655q2.m87172p0(obj6);
                }
                AbstractC27282u.m82292h(modifierM3599a1110, enumC27284v15, strM21273g15, false, jMo134584toComposableColorWaAFU9c15, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
                C28655q c28655q1111 = c28655q2;
                c28655q1111.m87173q(true);
                function6 = function9;
                list3 = list19;
                str3 = str4;
                z15 = z24;
                c28655q = c28655q1111;
            } else {
                C28655q c28655q1112 = c28655q2;
                c28655q1112.m87138X();
                list3 = list2;
                str3 = str2;
                function5 = function4;
                z15 = z13;
                function6 = function2;
                c28655q = c28655q1112;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
            }
        }
        i28 |= 24576;
        function2 = function1;
        i25 = i14 & 32;
        if (i25 != 0) {
            i28 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function4 = function3;
        } else {
            function4 = function3;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(function4)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i28 |= i26;
            }
        }
        if ((i28 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i28 & 1, z14)) {
            if (i29 != 0) {
                list4 = C25271y.f99162w;
            } else {
                list4 = list2;
            }
            if (i15 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i17 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    obj8 = objM87133R8;
                    C32618h3 c32618h18 = new C32618h3(20);
                    c28655q2.m87172p0(c32618h18);
                    obj8 = c32618h18;
                }
                obj8 = objM87133R8;
                function7 = (Function1) obj8;
            } else {
                function7 = function2;
            }
            if (i25 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    obj7 = objM87133R7;
                    C30745a c30745a16 = new C30745a(13);
                    c28655q2.m87172p0(c30745a16);
                    obj7 = c30745a16;
                }
                obj7 = objM87133R7;
                function8 = (Function3) obj7;
            } else {
                function8 = function4;
            }
            C13821r1 c13821r1M92099U16 = AbstractC30060g.m92099U(0, c28655q2, 1);
            objM87133R = c28655q2.m87133R();
            objM30468v = objM87133R;
            if (objM87133R == c28676v0) {
                objM30468v = AbstractC11266d.m30468v(0.0f, c28655q2);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM30468v;
            objM87133R2 = c28655q2.m87133R();
            obj = objM87133R2;
            if (objM87133R2 == c28676v0) {
                c39970s2 = new C39970s();
                while (r13.hasNext()) {
                    c39970s2.put(enumC31808f, Boolean.valueOf(list4.contains(enumC31808f.name())));
                }
                c28655q2.m87172p0(c39970s2);
                obj = c39970s2;
            }
            c39970s = (C39970s) obj;
            objM87133R3 = c28655q2.m87133R();
            obj2 = objM87133R3;
            if (objM87133R3 == c28676v0) {
                C28633k1 c28633k1M87272z16 = AbstractC28683x.m87272z("");
                c28655q2.m87172p0(c28633k1M87272z16);
                obj2 = c28633k1M87272z16;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj2;
            objM87133R4 = c28655q2.m87133R();
            obj3 = objM87133R4;
            if (objM87133R4 == c28676v0) {
                C28612f0 c28612f0M87264r16 = AbstractC28683x.m87264r(new C32209f(9, c39970s, interfaceC28601c1));
                c28655q2.m87172p0(c28612f0M87264r16);
                obj3 = c28612f0M87264r16;
            }
            interfaceC28670t2 = (InterfaceC28670t2) obj3;
            C2314t c2314t16 = C2314t.f9131w;
            Modifier modifierM3599a1111 = AbstractC1136a.m3599a(AbstractC30060g.m92116f0(c2314t16, c13821r1M92099U16, 14), "LabradorReadingSelectSymptomBottomSheet");
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            List<String> list110 = list4;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3599a1111);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N16);
            TextResource textResourceM98867c16 = viewState.getSheetContentViewState().getTitle();
            int i311111119 = TextResource.$stable;
            String strM21274h16 = AbstractC8693b.m21274h(textResourceM98867c16, c28655q2, i311111119);
            C38072d c38072d16 = C38072d.f163053a;
            int i3111111110 = C38072d.f163054b;
            long jM125430y16 = c38072d16.m121949b(c28655q2, i3111111110).getBrandWhite();
            C2886a c2886aM8417O16 = c38072d16.m121952e(c28655q2, i3111111110).getT2();
            C36775k c36775k16 = new C36775k(5);
            int i3111111111 = C2886a.f11498d << 18;
            z17 = z16;
            i27 = i28;
            AbstractC30795n.m94707h(strM21274h16, null, jM125430y16, 0L, null, null, null, 0L, null, c36775k16, 0L, 0, false, 0, 0, null, c2886aM8417O16, null, c28655q2, 0, i3111111111, 196090);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSheetContentViewState().getSubtitle(), c28655q2, i311111119), null, c38072d16.m121949b(c28655q2, i3111111110).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d16.m121952e(c28655q2, i3111111110).getB1(), null, c28655q2, 0, i3111111111, 196090);
            float f111118 = 4;
            float f111119 = f111118 * f111118;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111119, c2314t16));
            AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(2 * f111118), null, null, 0, 0, AbstractC37817c.m121344e(1244787156, c28655q2, new C28119c(15, viewState, c39970s)), c28655q2, 1572912, 61);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111119, c2314t16));
            int i3111111112 = 2;
            TextResource.C8688b c8688b1111 = new TextResource.C8688b(AbstractC31794f.f131618B0, null, i3111111112, false ? 1 : 0);
            TextResource textResourceM21278l1111 = AbstractC8693b.m21278l(str4);
            TextResource.C8688b c8688b1112 = new TextResource.C8688b(AbstractC31794f.f131616A0, false ? 1 : 0, i3111111112, false ? 1 : 0);
            TextResource textResourceM21278l1112 = AbstractC8693b.m21278l("");
            objM87133R5 = c28655q2.m87133R();
            obj4 = objM87133R5;
            if (objM87133R5 == c28676v0) {
                C24959n c24959n16 = new C24959n(interfaceC28690z0, 1);
                c28655q2.m87172p0(c24959n16);
                obj4 = c24959n16;
            }
            Modifier modifierM3500d16 = AbstractC1131a.m3500d(c2314t16, (Function1) obj4);
            objM87133R6 = c28655q2.m87133R();
            obj5 = objM87133R6;
            if (objM87133R6 == c28676v0) {
                C29802c c29802c16 = new C29802c(10, interfaceC28601c1);
                c28655q2.m87172p0(c29802c16);
                obj5 = c29802c16;
            }
            Function1 function115 = (Function1) obj5;
            int i3111111113 = TextResource.C8688b.f25889c;
            AbstractC17766l1.m50964e(modifierM3500d16, c8688b1111, textResourceM21278l1111, c8688b1112, textResourceM21278l1112, 0, 0, false, false, false, null, false, function115, c28655q2, (i3111111113 << 9) | (i3111111113 << 3) | 6 | (i311111119 << 6) | (i311111119 << 12), 384, 4064);
            Modifier modifierM91835e16 = AbstractC30007c.m91835e(c2314t16, f111119, c28655q2, c2314t16, 1.0f);
            float f1111110 = 8;
            Modifier modifierM3599a1112 = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM91835e16, 5 * f1111110, f111118 * f1111110), "SymptomsBottomSheetPrimaryButton");
            EnumC27284v enumC27284v16 = EnumC27284v.TextLarge;
            String strM21273g16 = AbstractC8693b.m21273g(m104217w(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17), c28655q2, 0);
            long jMo134584toComposableColorWaAFU9c16 = m104216v(((Boolean) interfaceC28670t2.getValue()).booleanValue(), z17).mo134584toComposableColorWaAFU9c(c28655q2, 0);
            if ((i27 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            if ((57344 & i27) == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            zM87157i = z18 | z19 | c28655q2.m87157i(viewState) | ((i27 & 458752) == 131072);
            Object objM87133R114 = c28655q2.m87133R();
            if (zM87157i) {
                function9 = function7;
                function5 = function8;
                obj6 = new InterfaceC4339a() { // from class: st1.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                    }
                };
                z24 = z17;
                c28655q2.m87172p0(obj6);
            } else {
                function9 = function7;
                function5 = function8;
                obj6 = new InterfaceC4339a() { // from class: st1.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC32993n.m104214t(z17, interfaceC28670t2, function9, viewState, c39970s, function5, interfaceC28601c1);
                    }
                };
                z24 = z17;
                c28655q2.m87172p0(obj6);
            }
            AbstractC27282u.m82292h(modifierM3599a1112, enumC27284v16, strM21273g16, false, jMo134584toComposableColorWaAFU9c16, null, false, (InterfaceC4339a) obj6, c28655q2, 54, 104);
            C28655q c28655q1113 = c28655q2;
            c28655q1113.m87173q(true);
            function6 = function9;
            list3 = list110;
            str3 = str4;
            z15 = z24;
            c28655q = c28655q1113;
        } else {
            C28655q c28655q1114 = c28655q2;
            c28655q1114.m87138X();
            list3 = list2;
            str3 = str2;
            function5 = function4;
            z15 = z13;
            function6 = function2;
            c28655q = c28655q1114;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(viewState, list3, str3, z15, function6, function5, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m104205k(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m104206l(String str, List list, String str2) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(list, "<unused var>");
        AbstractC22676k.m65750j(str2, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final String m104207m(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: n */
    private static final void m104208n(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final boolean m104209o(Map map, InterfaceC28601c1 interfaceC28601c1) {
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    return true;
                }
            }
        }
        return m104207m(interfaceC28601c1).length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m104210p(C31813k c31813k, Map map, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (EnumC31808f enumC31808f : c31813k.getSheetContentViewState().m98866b()) {
                float f13 = 4;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * f13, 1), 3, f13);
                TextResource localizedString = enumC31808f.toLocalizedString();
                EnumC27291y0 enumC27291y0 = EnumC27291y0.TextSmall;
                long jM125371X = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                Boolean bool = (Boolean) map.get(enumC31808f);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                boolean zM87149e = c28655q.m87149e(enumC31808f.ordinal());
                Object objM87133R = c28655q.m87133R();
                if (zM87149e || objM87133R == C28635l.f115821a) {
                    objM87133R = new C32469t(5, map, enumC31808f);
                    c28655q.m87172p0(objM87133R);
                }
                C28655q c28655q2 = c28655q;
                AbstractC27289x0.m82331c(localizedString, null, null, modifierM53364e, jM125371X, zBooleanValue, false, enumC27291y0, false, (Function1) objM87133R, c28655q2, TextResource.$stable | 12582912, 326);
                c28655q = c28655q2;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m104211q(Map map, EnumC31808f enumC31808f, boolean z4) {
        map.put(enumC31808f, Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m104212r(InterfaceC28690z0 interfaceC28690z0, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        InterfaceC39147y interfaceC39147yMo3517V = coordinates.mo3517V();
        ((C28617g1) interfaceC28690z0).m87023y(Float.intBitsToFloat((int) ((interfaceC39147yMo3517V != null ? interfaceC39147yMo3517V.mo3537k(coordinates, 0L) : 0L) & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m104213s(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m104208n(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m104214t(boolean z4, InterfaceC28670t2 interfaceC28670t2, Function1 function1, C31813k c31813k, Map map, Function3 function3, InterfaceC28601c1 interfaceC28601c1) {
        boolean z13 = z4 && !((Boolean) interfaceC28670t2.getValue()).booleanValue();
        if (z13) {
            function1.invoke(c31813k.getCompletedTimeStamp());
        } else {
            if (z13) {
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((EnumC31808f) ((Map.Entry) it.next()).getKey()).getSerializedValue());
            }
            function3.invoke(c31813k.getCompletedTimeStamp(), arrayList, m104207m(interfaceC28601c1));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m104215u(C31813k c31813k, List list, String str, boolean z4, Function1 function1, Function3 function3, int i13, int i14, Composer composer, int i15) {
        m104204j(c31813k, list, str, z4, function1, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final EnumC39333f m104216v(boolean z4, boolean z13) {
        if (!z4 && z13) {
            return EnumC39333f.BRAND_WHITE;
        }
        return EnumC39333f.RECOVERY;
    }

    /* JADX INFO: renamed from: w */
    private static final int m104217w(boolean z4, boolean z13) {
        if (!z4 && z13) {
            return AbstractC31794f.f131661i;
        }
        return AbstractC31794f.f131645a;
    }
}

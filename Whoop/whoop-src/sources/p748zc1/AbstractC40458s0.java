package p748zc1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b03.C2206c;
import b91.C2886a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e51.C12740p;
import eg2.C13179l;
import gy0.AbstractC16272a;
import h00.C16506i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l51.AbstractC23354d;
import l51.AbstractC23355e;
import l51.C23356f;
import l51.C23357g;
import l51.C23358h;
import l83.C23454a0;
import m81.AbstractC25230e;
import m81.C25232g;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import wr0.C37549q0;
import x81.C38072d;
import z72.C40160f;

/* JADX INFO: renamed from: zc1.s0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a/\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\u000f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Le51/p;", "tags", "", "selectedIndex", "", "onSelect", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "index", "r", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40458s0 {
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5 A[LOOP:0: B:54:0x00df->B:56:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:61:0x014b  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    private static final void m130805h(List<C12740p> list, int i13, Function1 function1, Modifier modifier, Composer composer, int i14, int i15) {
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ArrayList arrayList;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1898289060);
        int i16 = (i14 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i17 = i15 & 8;
        if (i17 == 0) {
            if ((i14 & 3072) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(817937283);
                List<C12740p> list2 = list;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (C12740p c12740p : list2) {
                    arrayList.add(new C25232g(c12740p.getId(), null, AbstractC8693b.m21278l(c12740p.getNameDisplay()), C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB2()));
                }
                c28655q.m87173q(false);
                AbstractC25230e.m73956l(arrayList, i13, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), new C39174f(((float) 1.5d) * 8), null, null, function1, c28655q, (i16 & 112) | 3072 | ((i16 << 12) & 3670016), 48);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16506i(modifier3, list, function1, i13, i14, i15);
            }
        }
        i16 |= 3072;
        modifier2 = modifier;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28655q.m87150e0(817937283);
            List<C12740p> list3 = list;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            while (r3.hasNext()) {
                arrayList.add(new C25232g(c12740p.getId(), null, AbstractC8693b.m21278l(c12740p.getNameDisplay()), C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB2()));
            }
            c28655q.m87173q(false);
            AbstractC25230e.m73956l(arrayList, i13, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), new C39174f(((float) 1.5d) * 8), null, null, function1, c28655q, (i16 & 112) | 3072 | ((i16 << 12) & 3670016), 48);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16506i(modifier3, list, function1, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m130806i(List list, int i13, Function1 function1, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m130805h(list, i13, function1, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x018a  */
    /* JADX WARN: Code duplicated, block: B:57:0x018e  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0207  */
    /* JADX WARN: Code duplicated, block: B:76:0x0249  */
    /* JADX WARN: Code duplicated, block: B:77:0x024d  */
    /* JADX WARN: Code duplicated, block: B:80:0x025a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0268  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:93:0x0316  */
    /* JADX WARN: Code duplicated, block: B:95:0x033a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0347  */
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
    /* JADX INFO: renamed from: j */
    public static final void m130807j(Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        int i16;
        Function1 function4;
        Object objM87133R;
        C23357g c23357g;
        C23356f c23356fM67620b;
        boolean zM87147d;
        Object objM87133R2;
        C23357g c23357g2;
        Object objM87133R3;
        InterfaceC28593a1 interfaceC28593a1;
        Object objM87133R4;
        List list;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C23357g c23357g3;
        int iHashCode2;
        int iHashCode3;
        boolean zM87157i;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1389349240);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C40160f(14);
                        c28655q.m87172p0(objM87133R7);
                    }
                    int i19 = i15;
                    function4 = (Function1) objM87133R7;
                    i16 = i19;
                } else {
                    i16 = i15;
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    TextResource textResourceM21278l = AbstractC8693b.m21278l("EXERCISE DETAILS");
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Side Plank - L");
                    C38072d c38072d = C38072d.f163053a;
                    C23357g c23357g4 = new C23357g(textResourceM21278l, textResourceM21278l2, new C23358h(AbstractC13673n.m38561h(c38072d), null), new C23358h(Integer.valueOf(c38072d.m121951d().getVarious().getEducation()), null), new AbstractC22403o.a(AbstractC16272a.f62056c), null, true, false, null, 416, null);
                    c28655q.m87172p0(c23357g4);
                    objM87133R = c23357g4;
                }
                c23357g = (C23357g) objM87133R;
                c23356fM67620b = AbstractC23355e.m67620b(null, C23357g.INSTANCE.m67647e(c23357g.getSubtitle(), c23357g.getSubtitleStyle(), c23357g.getSubtitleStickOnScroll()), c28655q, 0, 1);
                zM87147d = c28655q.m87147d(c23356fM67620b.m67622b());
                objM87133R2 = c28655q.m87133R();
                if (zM87147d || objM87133R2 == c28676v0) {
                    objM87133R2 = c23356fM67620b.m67621a(c23357g);
                    c28655q.m87172p0(objM87133R2);
                }
                c23357g2 = (C23357g) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC31061c.m95646v(0, c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    int i24 = 4;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    AnalyticEventModel analyticEventModel = null;
                    objM87133R4 = AbstractC37056f.m118959K(new C12740p("Progress", NotificationCompat.CATEGORY_PROGRESS, analyticEventModel, i24, defaultConstructorMarker), new C12740p("History", "history", analyticEventModel, i24, defaultConstructorMarker), new C12740p("Instructions", "instructions", analyticEventModel, i24, defaultConstructorMarker));
                    c28655q.m87172p0(objM87133R4);
                }
                list = (List) objM87133R4;
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
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
                int i25 = i16;
                if (c28655q.f115903S) {
                    c23357g3 = c23357g2;
                } else {
                    c23357g3 = c23357g2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    Function1 function5 = function4;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    AbstractC22989q.m66760a(AbstractC34132o.m107879c(c23356fM67620b.m67622b(), AbstractC1092a.m3357b(C1100b.f4583a.mo3401b(c2314t), AbstractC23354d.m67617o(), null, 0.0f, 6)), c28655q, 0);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    AbstractC23354d.m67609g(AbstractC1102d.m3409f(1.0f, c2314t), c23357g3, function5, null, false, c28655q, (C23357g.f92580k << 3) | 24582 | ((i25 << 3) & 896), 8);
                    int iM130809l = m130809l(interfaceC28593a1);
                    zM87157i = c28655q.m87157i(list);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i || objM87133R5 == c28676v0) {
                        objM87133R5 = new C37549q0(list, interfaceC28593a1, 1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    float f13 = 8;
                    m130805h(list, iM130809l, (Function1) objM87133R5, AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC23354d.m67618p(), 0.0f, 2), 0.0f, ((float) 0.5d) * f13, 0.0f, 1 * f13, 5), c28655q, 0, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    C26068u c26068uM67623c = c23356fM67620b.getListState();
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3495a = AbstractC1129a.m3495a(AbstractC11895b.m31988g(modifierM3409f3, true, 1.0f), c23356fM67620b.getNestedScrollConnection(), null);
                    C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, 2 * f13, 7);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(0 * f13);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C40160f(15);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC22674j.m65717c(modifierM3495a, c26068uM67623c, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) objM87133R6, c28655q, 805331328, 488);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                    function3 = function5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                Function1 function6 = function4;
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                AbstractC22989q.m66760a(AbstractC34132o.m107879c(c23356fM67620b.m67622b(), AbstractC1092a.m3357b(C1100b.f4583a.mo3401b(c2314t), AbstractC23354d.m67617o(), null, 0.0f, 6)), c28655q, 0);
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                AbstractC23354d.m67609g(AbstractC1102d.m3409f(1.0f, c2314t), c23357g3, function6, null, false, c28655q, (C23357g.f92580k << 3) | 24582 | ((i25 << 3) & 896), 8);
                int iM130809l2 = m130809l(interfaceC28593a1);
                zM87157i = c28655q.m87157i(list);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R5 = new C37549q0(list, interfaceC28593a1, 1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C37549q0(list, interfaceC28593a1, 1);
                    c28655q.m87172p0(objM87133R5);
                }
                float f14 = 8;
                m130805h(list, iM130809l2, (Function1) objM87133R5, AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC23354d.m67618p(), 0.0f, 2), 0.0f, ((float) 0.5d) * f14, 0.0f, 1 * f14, 5), c28655q, 0, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                C26068u c26068uM67623c2 = c23356fM67620b.getListState();
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3495a2 = AbstractC1129a.m3495a(AbstractC11895b.m31988g(modifierM3409f6, true, 1.0f), c23356fM67620b.getNestedScrollConnection(), null);
                C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, 2 * f14, 7);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(0 * f14);
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C40160f(15);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC22674j.m65717c(modifierM3495a2, c26068uM67623c2, c22976l1M3381c2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R6, c28655q, 805331328, 488);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
                function3 = function6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2206c(modifier3, function3, i13, i14, 3);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C40160f(14);
                    c28655q.m87172p0(objM87133R7);
                }
                int i110 = i15;
                function4 = (Function1) objM87133R7;
                i16 = i110;
            } else {
                i16 = i15;
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l("EXERCISE DETAILS");
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Side Plank - L");
                C38072d c38072d2 = C38072d.f163053a;
                C23357g c23357g5 = new C23357g(textResourceM21278l3, textResourceM21278l4, new C23358h(AbstractC13673n.m38561h(c38072d2), null), new C23358h(Integer.valueOf(c38072d2.m121951d().getVarious().getEducation()), null), new AbstractC22403o.a(AbstractC16272a.f62056c), null, true, false, null, 416, null);
                c28655q.m87172p0(c23357g5);
                objM87133R = c23357g5;
            }
            c23357g = (C23357g) objM87133R;
            c23356fM67620b = AbstractC23355e.m67620b(null, C23357g.INSTANCE.m67647e(c23357g.getSubtitle(), c23357g.getSubtitleStyle(), c23357g.getSubtitleStickOnScroll()), c28655q, 0, 1);
            zM87147d = c28655q.m87147d(c23356fM67620b.m67622b());
            objM87133R2 = c28655q.m87133R();
            if (zM87147d) {
                objM87133R2 = c23356fM67620b.m67621a(c23357g);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = c23356fM67620b.m67621a(c23357g);
                c28655q.m87172p0(objM87133R2);
            }
            c23357g2 = (C23357g) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC31061c.m95646v(0, c28655q);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R3;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                int i26 = 4;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                AnalyticEventModel analyticEventModel2 = null;
                objM87133R4 = AbstractC37056f.m118959K(new C12740p("Progress", NotificationCompat.CATEGORY_PROGRESS, analyticEventModel2, i26, defaultConstructorMarker2), new C12740p("History", "history", analyticEventModel2, i26, defaultConstructorMarker2), new C12740p("Instructions", "instructions", analyticEventModel2, i26, defaultConstructorMarker2));
                c28655q.m87172p0(objM87133R4);
            }
            list = (List) objM87133R4;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            c0209i = C0217k.f732j;
            int i27 = i16;
            if (c28655q.f115903S) {
                c23357g3 = c23357g2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                Function1 function7 = function4;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                AbstractC22989q.m66760a(AbstractC34132o.m107879c(c23356fM67620b.m67622b(), AbstractC1092a.m3357b(C1100b.f4583a.mo3401b(c2314t), AbstractC23354d.m67617o(), null, 0.0f, 6)), c28655q, 0);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                AbstractC23354d.m67609g(AbstractC1102d.m3409f(1.0f, c2314t), c23357g3, function7, null, false, c28655q, (C23357g.f92580k << 3) | 24582 | ((i27 << 3) & 896), 8);
                int iM130809l3 = m130809l(interfaceC28593a1);
                zM87157i = c28655q.m87157i(list);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R5 = new C37549q0(list, interfaceC28593a1, 1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C37549q0(list, interfaceC28593a1, 1);
                    c28655q.m87172p0(objM87133R5);
                }
                float f15 = 8;
                m130805h(list, iM130809l3, (Function1) objM87133R5, AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC23354d.m67618p(), 0.0f, 2), 0.0f, ((float) 0.5d) * f15, 0.0f, 1 * f15, 5), c28655q, 0, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                C26068u c26068uM67623c3 = c23356fM67620b.getListState();
                Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3495a3 = AbstractC1129a.m3495a(AbstractC11895b.m31988g(modifierM3409f9, true, 1.0f), c23356fM67620b.getNestedScrollConnection(), null);
                C22976l1 c22976l1M3381c3 = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, 2 * f15, 7);
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(0 * f15);
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C40160f(15);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC22674j.m65717c(modifierM3495a3, c26068uM67623c3, c22976l1M3381c3, c22971kM66746i3, null, null, false, null, (Function1) objM87133R6, c28655q, 805331328, 488);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
                function3 = function7;
            } else {
                c23357g3 = c23357g2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t);
            Function1 function8 = function4;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f10);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
            AbstractC22989q.m66760a(AbstractC34132o.m107879c(c23356fM67620b.m67622b(), AbstractC1092a.m3357b(C1100b.f4583a.mo3401b(c2314t), AbstractC23354d.m67617o(), null, 0.0f, 6)), c28655q, 0);
            Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f11);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
            AbstractC23354d.m67609g(AbstractC1102d.m3409f(1.0f, c2314t), c23357g3, function8, null, false, c28655q, (C23357g.f92580k << 3) | 24582 | ((i27 << 3) & 896), 8);
            int iM130809l4 = m130809l(interfaceC28593a1);
            zM87157i = c28655q.m87157i(list);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R5 = new C37549q0(list, interfaceC28593a1, 1);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C37549q0(list, interfaceC28593a1, 1);
                c28655q.m87172p0(objM87133R5);
            }
            float f16 = 8;
            m130805h(list, iM130809l4, (Function1) objM87133R5, AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC23354d.m67618p(), 0.0f, 2), 0.0f, ((float) 0.5d) * f16, 0.0f, 1 * f16, 5), c28655q, 0, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            C26068u c26068uM67623c4 = c23356fM67620b.getListState();
            Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3495a4 = AbstractC1129a.m3495a(AbstractC11895b.m31988g(modifierM3409f12, true, 1.0f), c23356fM67620b.getNestedScrollConnection(), null);
            C22976l1 c22976l1M3381c4 = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, 2 * f16, 7);
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(0 * f16);
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C40160f(15);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC22674j.m65717c(modifierM3495a4, c26068uM67623c4, c22976l1M3381c4, c22971kM66746i4, null, null, false, null, (Function1) objM87133R6, c28655q, 805331328, 488);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
            function3 = function8;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2206c(modifier3, function3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m130808k(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final int m130809l(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: m */
    private static final void m130810m(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m130811n(List list, InterfaceC28593a1 interfaceC28593a1, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(((C12740p) it.next()).getId(), id4)) {
                break;
            }
            i13++;
        }
        m130810m(interfaceC28593a1, i13 >= 0 ? i13 : 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m130812o(InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77555a(LazyColumn, 24, new C40160f(16), C40266a1.f174170a.m129315b(), 4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Object m130813p(int i13) {
        return AbstractC2875y.m8295h(i13, "row_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m130814q(Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m130807j(modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public static final void m130815r(int i13, Modifier modifier, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(658015890);
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q2.m87149e(i13) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 == 0) {
            if ((i14 & 48) == 0) {
                modifier2 = modifier;
                i16 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                String strM8296i = AbstractC2875y.m8296i(i13 + 1, "Section ", " — Sample content for scroll testing. Scroll up to collapse the header.");
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM8296i, AbstractC1099a.m3396r(modifier4, 0.0f, 1 * 8, 1), c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB4(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13179l(i13, i14, i15, 4, modifier3);
            }
        }
        i16 |= 48;
        modifier2 = modifier;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            String strM8296i2 = AbstractC2875y.m8296i(i13 + 1, "Section ", " — Sample content for scroll testing. Scroll up to collapse the header.");
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM8296i2, AbstractC1099a.m3396r(modifier4, 0.0f, 1 * 8, 1), c38072d2.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i19).getB4(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13179l(i13, i14, i15, 4, modifier3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m130816s(int i13, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m130815r(i13, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}

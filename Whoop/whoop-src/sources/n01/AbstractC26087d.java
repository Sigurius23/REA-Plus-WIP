package n01;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.ActionSequenceAction;
import com.whoop.whoopaction.domain.models.ActionSequenceStep;
import com.whoop.whoopaction.domain.models.StateClearAction;
import com.whoop.whoopaction.domain.models.StatePopAction;
import com.whoop.whoopaction.domain.models.StatePushAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import gf1.C15786e;
import hy0.AbstractC17755i2;
import j81.C21421e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mx1.C26009o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25294d0;
import ry0.AbstractC31907b;
import ry0.C31909d;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: n01.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ao\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00052&\b\u0002\u0010\f\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u008d\u0001\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00052$\u0010\f\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010!\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"\u001a%\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006*\u00020#2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b$\u0010%\u001a3\u0010(\u001a\u0004\u0018\u00010\u0019*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "cellModifier", "Ln01/e;", "state", "Lkotlin/Function1;", "", "", "Ll83/a0;", "onSelectionChanged", "Lkotlin/Function3;", "", "onCellToggled", "e", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "cellId", "isCurrentlySelected", "", "selectedOptions", "", "maxSelection", "minSelection", "replacementSelection", "n", "(Ljava/lang/String;ZLjava/util/List;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "", "selectionWrite", "cellWrite", "onViewEvent", "m", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "stateKey", "keepSelectionArray", "p", "(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;", "Lry0/d;", "o", "(Lry0/d;Ljava/lang/String;)Ljava/util/List;", "isSelected", "resultingSelection", "l", "(Ln01/e;Ljava/lang/String;ZLjava/util/List;)Ljava/lang/Object;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26087d {
    /* JADX WARN: Code duplicated, block: B:101:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:115:0x0204  */
    /* JADX WARN: Code duplicated, block: B:119:0x0214  */
    /* JADX WARN: Code duplicated, block: B:120:0x0219  */
    /* JADX WARN: Code duplicated, block: B:123:0x0220  */
    /* JADX WARN: Code duplicated, block: B:125:0x0223  */
    /* JADX WARN: Code duplicated, block: B:126:0x023a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0243  */
    /* JADX WARN: Code duplicated, block: B:130:0x0249  */
    /* JADX WARN: Code duplicated, block: B:134:0x0293  */
    /* JADX WARN: Code duplicated, block: B:138:0x029d  */
    /* JADX WARN: Code duplicated, block: B:141:0x02de  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:157:0x0364  */
    /* JADX WARN: Code duplicated, block: B:160:0x0372  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0128 A[LOOP:3: B:89:0x0122->B:91:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x017d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:0x0194  */
    /* JADX INFO: renamed from: e */
    public static final void m77588e(Modifier modifier, Modifier modifier2, C26088e c26088e, Function1 function1, Function3 function3, Composer composer, int i13, int i14) {
        Modifier modifier3;
        int i15;
        Modifier modifier4;
        int i16;
        int i17;
        int i18;
        Function3 function4;
        int i19;
        boolean z4;
        Function1 function2;
        Modifier modifier5;
        Modifier modifier6;
        Function3 function5;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier7;
        C28676v0 c28676v0;
        Function1 function6;
        Function3 function7;
        boolean zM87153g;
        Object objM87133R;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        C39967p c39967p;
        float f13;
        float f14;
        Function1 function8;
        Function3 function9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ArrayList arrayList3;
        int i24;
        int i25;
        String str;
        C31909d c31909d;
        boolean zContains;
        String sectionTitle;
        float f15;
        float f16;
        float f17;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        C39967p c39967p2;
        Function1 function10;
        Function3 function11;
        C31909d c31909d2;
        String sectionTitle2;
        Object objM87133R3;
        Object objM87133R4;
        int i26;
        C26088e state = c26088e;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(594340458);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
            modifier3 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier3 = modifier;
            i15 = (c28655q.m87153g(modifier3) ? 4 : 2) | i13;
        } else {
            modifier3 = modifier;
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                modifier4 = modifier2;
                i15 |= c28655q.m87153g(modifier4) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(state)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i15 |= i26;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function4 = function3;
                        if (c28655q.m87157i(function4)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier7 = c2314t;
                        } else {
                            modifier7 = modifier3;
                        }
                        if (i28 != 0) {
                            modifier6 = c2314t;
                        } else {
                            modifier6 = modifier4;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C26009o(7);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function6 = (Function1) objM87133R4;
                        } else {
                            function6 = function1;
                        }
                        if (i18 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C15786e(25);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function3) objM87133R3;
                        } else {
                            function7 = function4;
                        }
                        zM87153g = c28655q.m87153g(state);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g || objM87133R == c28676v0) {
                            List<C31909d> listM77603c = state.m77603c();
                            arrayList = new ArrayList();
                            for (Object obj : listM77603c) {
                                if (((C31909d) obj).getSelected()) {
                                    arrayList.add(obj);
                                }
                            }
                            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((C31909d) it.next()).getId());
                            }
                            objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                            c28655q.m87172p0(objM87133R);
                        }
                        c39967p = (C39967p) objM87133R;
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier7);
                        f13 = 8;
                        f14 = 1 * f13;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
                        function8 = function6;
                        function9 = function7;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                        List<C31909d> listM77603c2 = state.m77603c();
                        arrayList3 = new ArrayList();
                        for (Object obj2 : listM77603c2) {
                            if (!state.m77604e().contains(((C31909d) obj2).getId())) {
                                arrayList3.add(obj2);
                            }
                        }
                        c28655q.m87150e0(931723729);
                        i24 = 0;
                        for (Object obj3 : arrayList3) {
                            i25 = i24 + 1;
                            str = null;
                            if (i24 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            c31909d = (C31909d) obj3;
                            zContains = c39967p.contains(c31909d.getId());
                            sectionTitle = c31909d.getSectionTitle();
                            if (sectionTitle != null && !AbstractC39414r.m125890i0(sectionTitle)) {
                                c31909d2 = (C31909d) AbstractC25265s.m74102I0(i24 - 1, arrayList3);
                                if (c31909d2 != null) {
                                    sectionTitle2 = c31909d2.getSectionTitle();
                                } else {
                                    sectionTitle2 = null;
                                }
                                if (!sectionTitle.equals(sectionTitle2)) {
                                    str = sectionTitle;
                                }
                            }
                            if (str == null) {
                                c28655q.m87150e0(-1374433010);
                                c28655q.m87173q(false);
                                z13 = false;
                                f16 = f13;
                                f17 = 1.0f;
                            } else {
                                c28655q.m87150e0(-1374433009);
                                if (i24 > 0) {
                                    f15 = 3;
                                } else {
                                    f15 = 0;
                                }
                                C28655q c28655q2 = c28655q;
                                f16 = f13;
                                f17 = 1.0f;
                                z13 = false;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, f14, 5), null, null, AbstractC8693b.m21278l(str), null, 0L, 0L, null, c28655q2, 0, 246);
                                c28655q = c28655q2;
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(f17, modifier6);
                            if (!c31909d.getIsDisabled() || state.getIsDisabled()) {
                                z14 = true;
                            } else {
                                z14 = z13;
                            }
                            C31909d c31909dM99205a = c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : zContains, (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : z14, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null);
                            boolean zM87157i = c28655q.m87157i(state) | c28655q.m87157i(c31909d) | c28655q.m87155h(zContains) | c28655q.m87153g(c39967p);
                            if ((i15 & 7168) == 2048) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            boolean z18 = zM87157i | z15;
                            if ((57344 & i15) == 16384) {
                                z16 = true;
                            } else {
                                z16 = z13;
                            }
                            z17 = z18 | z16;
                            objM87133R2 = c28655q.m87133R();
                            if (!z17 || objM87133R2 == c28676v0) {
                                c39967p2 = c39967p;
                                function10 = function8;
                                function11 = function9;
                                C26086c c26086c = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                                c28655q.m87172p0(c26086c);
                                objM87133R2 = c26086c;
                            } else {
                                function10 = function8;
                                function11 = function9;
                                c39967p2 = c39967p;
                            }
                            AbstractC31907b.m99196f(modifierM3409f2, c31909dM99205a, (InterfaceC4339a) objM87133R2, true, c28655q, 3072, 0);
                            state = c26088e;
                            c39967p = c39967p2;
                            function8 = function10;
                            function9 = function11;
                            i15 = i15;
                            modifier6 = modifier6;
                            arrayList3 = arrayList3;
                            c28676v0 = c28676v0;
                            modifier7 = modifier7;
                            f13 = f16;
                            f14 = f14;
                            i24 = i25;
                            c2314t = c2314t;
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        function2 = function8;
                        function5 = function9;
                        modifier5 = modifier7;
                    } else {
                        c28655q.m87138X();
                        function2 = function1;
                        modifier5 = modifier3;
                        modifier6 = modifier4;
                        function5 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, c26088e, function2, function5, i13, i14, 6);
                    }
                }
                i15 |= 24576;
                function4 = function3;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier3;
                    }
                    if (i28 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26009o(7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C15786e(25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function3) objM87133R3;
                    } else {
                        function7 = function4;
                    }
                    zM87153g = c28655q.m87153g(state);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        List<C31909d> listM77603c3 = state.m77603c();
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            if (((C31909d) obj).getSelected()) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((C31909d) it.next()).getId());
                        }
                        objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                        c28655q.m87172p0(objM87133R);
                    } else {
                        List<C31909d> listM77603c4 = state.m77603c();
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            if (((C31909d) obj).getSelected()) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((C31909d) it.next()).getId());
                        }
                        objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                        c28655q.m87172p0(objM87133R);
                    }
                    c39967p = (C39967p) objM87133R;
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier7);
                    f13 = 8;
                    f14 = 1 * f13;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
                    function8 = function6;
                    function9 = function7;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
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
                    List<C31909d> listM77603c5 = state.m77603c();
                    arrayList3 = new ArrayList();
                    while (r5.hasNext()) {
                        if (!state.m77604e().contains(((C31909d) obj2).getId())) {
                            arrayList3.add(obj2);
                        }
                    }
                    c28655q.m87150e0(931723729);
                    i24 = 0;
                    while (r24.hasNext()) {
                        i25 = i24 + 1;
                        str = null;
                        if (i24 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        c31909d = (C31909d) obj3;
                        zContains = c39967p.contains(c31909d.getId());
                        sectionTitle = c31909d.getSectionTitle();
                        if (sectionTitle != null) {
                            c31909d2 = (C31909d) AbstractC25265s.m74102I0(i24 - 1, arrayList3);
                            if (c31909d2 != null) {
                                sectionTitle2 = c31909d2.getSectionTitle();
                            } else {
                                sectionTitle2 = null;
                            }
                            if (!sectionTitle.equals(sectionTitle2)) {
                                str = sectionTitle;
                            }
                        }
                        if (str == null) {
                            c28655q.m87150e0(-1374433010);
                            c28655q.m87173q(false);
                            z13 = false;
                            f16 = f13;
                            f17 = 1.0f;
                        } else {
                            c28655q.m87150e0(-1374433009);
                            if (i24 > 0) {
                                f15 = 3;
                            } else {
                                f15 = 0;
                            }
                            C28655q c28655q3 = c28655q;
                            f16 = f13;
                            f17 = 1.0f;
                            z13 = false;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, f14, 5), null, null, AbstractC8693b.m21278l(str), null, 0L, 0L, null, c28655q3, 0, 246);
                            c28655q = c28655q3;
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(f17, modifier6);
                        if (c31909d.getIsDisabled()) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        C31909d c31909dM99205a2 = c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : zContains, (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : z14, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null);
                        boolean zM87157i2 = c28655q.m87157i(state) | c28655q.m87157i(c31909d) | c28655q.m87155h(zContains) | c28655q.m87153g(c39967p);
                        if ((i15 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        boolean z19 = zM87157i2 | z15;
                        if ((57344 & i15) == 16384) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        z17 = z19 | z16;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            c39967p2 = c39967p;
                            function10 = function8;
                            function11 = function9;
                            C26086c c26086c2 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                            c28655q.m87172p0(c26086c2);
                            objM87133R2 = c26086c2;
                        } else {
                            c39967p2 = c39967p;
                            function10 = function8;
                            function11 = function9;
                            C26086c c26086c3 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                            c28655q.m87172p0(c26086c3);
                            objM87133R2 = c26086c3;
                        }
                        AbstractC31907b.m99196f(modifierM3409f4, c31909dM99205a2, (InterfaceC4339a) objM87133R2, true, c28655q, 3072, 0);
                        state = c26088e;
                        c39967p = c39967p2;
                        function8 = function10;
                        function9 = function11;
                        i15 = i15;
                        modifier6 = modifier6;
                        arrayList3 = arrayList3;
                        c28676v0 = c28676v0;
                        modifier7 = modifier7;
                        f13 = f16;
                        f14 = f14;
                        i24 = i25;
                        c2314t = c2314t;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    function2 = function8;
                    function5 = function9;
                    modifier5 = modifier7;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    function5 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, c26088e, function2, function5, i13, i14, 6);
                }
            }
            i15 |= 3072;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function3;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier3;
                    }
                    if (i28 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26009o(7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C15786e(25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function3) objM87133R3;
                    } else {
                        function7 = function4;
                    }
                    zM87153g = c28655q.m87153g(state);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        List<C31909d> listM77603c6 = state.m77603c();
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            if (((C31909d) obj).getSelected()) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((C31909d) it.next()).getId());
                        }
                        objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                        c28655q.m87172p0(objM87133R);
                    } else {
                        List<C31909d> listM77603c7 = state.m77603c();
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            if (((C31909d) obj).getSelected()) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((C31909d) it.next()).getId());
                        }
                        objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                        c28655q.m87172p0(objM87133R);
                    }
                    c39967p = (C39967p) objM87133R;
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, modifier7);
                    f13 = 8;
                    f14 = 1 * f13;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
                    function8 = function6;
                    function9 = function7;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    List<C31909d> listM77603c8 = state.m77603c();
                    arrayList3 = new ArrayList();
                    while (r5.hasNext()) {
                        if (!state.m77604e().contains(((C31909d) obj2).getId())) {
                            arrayList3.add(obj2);
                        }
                    }
                    c28655q.m87150e0(931723729);
                    i24 = 0;
                    while (r24.hasNext()) {
                        i25 = i24 + 1;
                        str = null;
                        if (i24 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        c31909d = (C31909d) obj3;
                        zContains = c39967p.contains(c31909d.getId());
                        sectionTitle = c31909d.getSectionTitle();
                        if (sectionTitle != null) {
                            c31909d2 = (C31909d) AbstractC25265s.m74102I0(i24 - 1, arrayList3);
                            if (c31909d2 != null) {
                                sectionTitle2 = c31909d2.getSectionTitle();
                            } else {
                                sectionTitle2 = null;
                            }
                            if (!sectionTitle.equals(sectionTitle2)) {
                                str = sectionTitle;
                            }
                        }
                        if (str == null) {
                            c28655q.m87150e0(-1374433010);
                            c28655q.m87173q(false);
                            z13 = false;
                            f16 = f13;
                            f17 = 1.0f;
                        } else {
                            c28655q.m87150e0(-1374433009);
                            if (i24 > 0) {
                                f15 = 3;
                            } else {
                                f15 = 0;
                            }
                            C28655q c28655q4 = c28655q;
                            f16 = f13;
                            f17 = 1.0f;
                            z13 = false;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, f14, 5), null, null, AbstractC8693b.m21278l(str), null, 0L, 0L, null, c28655q4, 0, 246);
                            c28655q = c28655q4;
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f6 = AbstractC1102d.m3409f(f17, modifier6);
                        if (c31909d.getIsDisabled()) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        C31909d c31909dM99205a3 = c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : zContains, (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : z14, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null);
                        boolean zM87157i3 = c28655q.m87157i(state) | c28655q.m87157i(c31909d) | c28655q.m87155h(zContains) | c28655q.m87153g(c39967p);
                        if ((i15 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        boolean z110 = zM87157i3 | z15;
                        if ((57344 & i15) == 16384) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        z17 = z110 | z16;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            c39967p2 = c39967p;
                            function10 = function8;
                            function11 = function9;
                            C26086c c26086c4 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                            c28655q.m87172p0(c26086c4);
                            objM87133R2 = c26086c4;
                        } else {
                            c39967p2 = c39967p;
                            function10 = function8;
                            function11 = function9;
                            C26086c c26086c5 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                            c28655q.m87172p0(c26086c5);
                            objM87133R2 = c26086c5;
                        }
                        AbstractC31907b.m99196f(modifierM3409f6, c31909dM99205a3, (InterfaceC4339a) objM87133R2, true, c28655q, 3072, 0);
                        state = c26088e;
                        c39967p = c39967p2;
                        function8 = function10;
                        function9 = function11;
                        i15 = i15;
                        modifier6 = modifier6;
                        arrayList3 = arrayList3;
                        c28676v0 = c28676v0;
                        modifier7 = modifier7;
                        f13 = f16;
                        f14 = f14;
                        i24 = i25;
                        c2314t = c2314t;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    function2 = function8;
                    function5 = function9;
                    modifier5 = modifier7;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    function5 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, c26088e, function2, function5, i13, i14, 6);
                }
            }
            i15 |= 24576;
            function4 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier3;
                }
                if (i28 != 0) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier4;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26009o(7);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15786e(25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function3) objM87133R3;
                } else {
                    function7 = function4;
                }
                zM87153g = c28655q.m87153g(state);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    List<C31909d> listM77603c9 = state.m77603c();
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (((C31909d) obj).getSelected()) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C31909d) it.next()).getId());
                    }
                    objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                    c28655q.m87172p0(objM87133R);
                } else {
                    List<C31909d> listM77603c10 = state.m77603c();
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (((C31909d) obj).getSelected()) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C31909d) it.next()).getId());
                    }
                    objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                    c28655q.m87172p0(objM87133R);
                }
                c39967p = (C39967p) objM87133R;
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, modifier7);
                f13 = 8;
                f14 = 1 * f13;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
                function8 = function6;
                function9 = function7;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                List<C31909d> listM77603c11 = state.m77603c();
                arrayList3 = new ArrayList();
                while (r5.hasNext()) {
                    if (!state.m77604e().contains(((C31909d) obj2).getId())) {
                        arrayList3.add(obj2);
                    }
                }
                c28655q.m87150e0(931723729);
                i24 = 0;
                while (r24.hasNext()) {
                    i25 = i24 + 1;
                    str = null;
                    if (i24 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    c31909d = (C31909d) obj3;
                    zContains = c39967p.contains(c31909d.getId());
                    sectionTitle = c31909d.getSectionTitle();
                    if (sectionTitle != null) {
                        c31909d2 = (C31909d) AbstractC25265s.m74102I0(i24 - 1, arrayList3);
                        if (c31909d2 != null) {
                            sectionTitle2 = c31909d2.getSectionTitle();
                        } else {
                            sectionTitle2 = null;
                        }
                        if (!sectionTitle.equals(sectionTitle2)) {
                            str = sectionTitle;
                        }
                    }
                    if (str == null) {
                        c28655q.m87150e0(-1374433010);
                        c28655q.m87173q(false);
                        z13 = false;
                        f16 = f13;
                        f17 = 1.0f;
                    } else {
                        c28655q.m87150e0(-1374433009);
                        if (i24 > 0) {
                            f15 = 3;
                        } else {
                            f15 = 0;
                        }
                        C28655q c28655q5 = c28655q;
                        f16 = f13;
                        f17 = 1.0f;
                        z13 = false;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, f14, 5), null, null, AbstractC8693b.m21278l(str), null, 0L, 0L, null, c28655q5, 0, 246);
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(f17, modifier6);
                    if (c31909d.getIsDisabled()) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    C31909d c31909dM99205a4 = c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : zContains, (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : z14, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null);
                    boolean zM87157i4 = c28655q.m87157i(state) | c28655q.m87157i(c31909d) | c28655q.m87155h(zContains) | c28655q.m87153g(c39967p);
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    boolean z111 = zM87157i4 | z15;
                    if ((57344 & i15) == 16384) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    z17 = z111 | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        c39967p2 = c39967p;
                        function10 = function8;
                        function11 = function9;
                        C26086c c26086c6 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                        c28655q.m87172p0(c26086c6);
                        objM87133R2 = c26086c6;
                    } else {
                        c39967p2 = c39967p;
                        function10 = function8;
                        function11 = function9;
                        C26086c c26086c7 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                        c28655q.m87172p0(c26086c7);
                        objM87133R2 = c26086c7;
                    }
                    AbstractC31907b.m99196f(modifierM3409f8, c31909dM99205a4, (InterfaceC4339a) objM87133R2, true, c28655q, 3072, 0);
                    state = c26088e;
                    c39967p = c39967p2;
                    function8 = function10;
                    function9 = function11;
                    i15 = i15;
                    modifier6 = modifier6;
                    arrayList3 = arrayList3;
                    c28676v0 = c28676v0;
                    modifier7 = modifier7;
                    f13 = f16;
                    f14 = f14;
                    i24 = i25;
                    c2314t = c2314t;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                function2 = function8;
                function5 = function9;
                modifier5 = modifier7;
            } else {
                c28655q.m87138X();
                function2 = function1;
                modifier5 = modifier3;
                modifier6 = modifier4;
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, c26088e, function2, function5, i13, i14, 6);
            }
        }
        i15 |= 48;
        modifier4 = modifier2;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(state)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i15 |= i26;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function1)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function3;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier3;
                    }
                    if (i28 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26009o(7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C15786e(25);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function3) objM87133R3;
                    } else {
                        function7 = function4;
                    }
                    zM87153g = c28655q.m87153g(state);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        List<C31909d> listM77603c12 = state.m77603c();
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            if (((C31909d) obj).getSelected()) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((C31909d) it.next()).getId());
                        }
                        objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                        c28655q.m87172p0(objM87133R);
                    } else {
                        List<C31909d> listM77603c13 = state.m77603c();
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            if (((C31909d) obj).getSelected()) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((C31909d) it.next()).getId());
                        }
                        objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                        c28655q.m87172p0(objM87133R);
                    }
                    c39967p = (C39967p) objM87133R;
                    Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, modifier7);
                    f13 = 8;
                    f14 = 1 * f13;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
                    function8 = function6;
                    function9 = function7;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f9);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    List<C31909d> listM77603c14 = state.m77603c();
                    arrayList3 = new ArrayList();
                    while (r5.hasNext()) {
                        if (!state.m77604e().contains(((C31909d) obj2).getId())) {
                            arrayList3.add(obj2);
                        }
                    }
                    c28655q.m87150e0(931723729);
                    i24 = 0;
                    while (r24.hasNext()) {
                        i25 = i24 + 1;
                        str = null;
                        if (i24 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        c31909d = (C31909d) obj3;
                        zContains = c39967p.contains(c31909d.getId());
                        sectionTitle = c31909d.getSectionTitle();
                        if (sectionTitle != null) {
                            c31909d2 = (C31909d) AbstractC25265s.m74102I0(i24 - 1, arrayList3);
                            if (c31909d2 != null) {
                                sectionTitle2 = c31909d2.getSectionTitle();
                            } else {
                                sectionTitle2 = null;
                            }
                            if (!sectionTitle.equals(sectionTitle2)) {
                                str = sectionTitle;
                            }
                        }
                        if (str == null) {
                            c28655q.m87150e0(-1374433010);
                            c28655q.m87173q(false);
                            z13 = false;
                            f16 = f13;
                            f17 = 1.0f;
                        } else {
                            c28655q.m87150e0(-1374433009);
                            if (i24 > 0) {
                                f15 = 3;
                            } else {
                                f15 = 0;
                            }
                            C28655q c28655q6 = c28655q;
                            f16 = f13;
                            f17 = 1.0f;
                            z13 = false;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, f14, 5), null, null, AbstractC8693b.m21278l(str), null, 0L, 0L, null, c28655q6, 0, 246);
                            c28655q = c28655q6;
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f10 = AbstractC1102d.m3409f(f17, modifier6);
                        if (c31909d.getIsDisabled()) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        C31909d c31909dM99205a5 = c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : zContains, (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : z14, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null);
                        boolean zM87157i5 = c28655q.m87157i(state) | c28655q.m87157i(c31909d) | c28655q.m87155h(zContains) | c28655q.m87153g(c39967p);
                        if ((i15 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        boolean z112 = zM87157i5 | z15;
                        if ((57344 & i15) == 16384) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        z17 = z112 | z16;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            c39967p2 = c39967p;
                            function10 = function8;
                            function11 = function9;
                            C26086c c26086c8 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                            c28655q.m87172p0(c26086c8);
                            objM87133R2 = c26086c8;
                        } else {
                            c39967p2 = c39967p;
                            function10 = function8;
                            function11 = function9;
                            C26086c c26086c9 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                            c28655q.m87172p0(c26086c9);
                            objM87133R2 = c26086c9;
                        }
                        AbstractC31907b.m99196f(modifierM3409f10, c31909dM99205a5, (InterfaceC4339a) objM87133R2, true, c28655q, 3072, 0);
                        state = c26088e;
                        c39967p = c39967p2;
                        function8 = function10;
                        function9 = function11;
                        i15 = i15;
                        modifier6 = modifier6;
                        arrayList3 = arrayList3;
                        c28676v0 = c28676v0;
                        modifier7 = modifier7;
                        f13 = f16;
                        f14 = f14;
                        i24 = i25;
                        c2314t = c2314t;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    function2 = function8;
                    function5 = function9;
                    modifier5 = modifier7;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    function5 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, c26088e, function2, function5, i13, i14, 6);
                }
            }
            i15 |= 24576;
            function4 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier3;
                }
                if (i28 != 0) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier4;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26009o(7);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15786e(25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function3) objM87133R3;
                } else {
                    function7 = function4;
                }
                zM87153g = c28655q.m87153g(state);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    List<C31909d> listM77603c15 = state.m77603c();
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (((C31909d) obj).getSelected()) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C31909d) it.next()).getId());
                    }
                    objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                    c28655q.m87172p0(objM87133R);
                } else {
                    List<C31909d> listM77603c16 = state.m77603c();
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (((C31909d) obj).getSelected()) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C31909d) it.next()).getId());
                    }
                    objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                    c28655q.m87172p0(objM87133R);
                }
                c39967p = (C39967p) objM87133R;
                Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, modifier7);
                f13 = 8;
                f14 = 1 * f13;
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
                function8 = function6;
                function9 = function7;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f11);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                List<C31909d> listM77603c17 = state.m77603c();
                arrayList3 = new ArrayList();
                while (r5.hasNext()) {
                    if (!state.m77604e().contains(((C31909d) obj2).getId())) {
                        arrayList3.add(obj2);
                    }
                }
                c28655q.m87150e0(931723729);
                i24 = 0;
                while (r24.hasNext()) {
                    i25 = i24 + 1;
                    str = null;
                    if (i24 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    c31909d = (C31909d) obj3;
                    zContains = c39967p.contains(c31909d.getId());
                    sectionTitle = c31909d.getSectionTitle();
                    if (sectionTitle != null) {
                        c31909d2 = (C31909d) AbstractC25265s.m74102I0(i24 - 1, arrayList3);
                        if (c31909d2 != null) {
                            sectionTitle2 = c31909d2.getSectionTitle();
                        } else {
                            sectionTitle2 = null;
                        }
                        if (!sectionTitle.equals(sectionTitle2)) {
                            str = sectionTitle;
                        }
                    }
                    if (str == null) {
                        c28655q.m87150e0(-1374433010);
                        c28655q.m87173q(false);
                        z13 = false;
                        f16 = f13;
                        f17 = 1.0f;
                    } else {
                        c28655q.m87150e0(-1374433009);
                        if (i24 > 0) {
                            f15 = 3;
                        } else {
                            f15 = 0;
                        }
                        C28655q c28655q7 = c28655q;
                        f16 = f13;
                        f17 = 1.0f;
                        z13 = false;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, f14, 5), null, null, AbstractC8693b.m21278l(str), null, 0L, 0L, null, c28655q7, 0, 246);
                        c28655q = c28655q7;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(f17, modifier6);
                    if (c31909d.getIsDisabled()) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    C31909d c31909dM99205a6 = c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : zContains, (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : z14, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null);
                    boolean zM87157i6 = c28655q.m87157i(state) | c28655q.m87157i(c31909d) | c28655q.m87155h(zContains) | c28655q.m87153g(c39967p);
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    boolean z113 = zM87157i6 | z15;
                    if ((57344 & i15) == 16384) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    z17 = z113 | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        c39967p2 = c39967p;
                        function10 = function8;
                        function11 = function9;
                        C26086c c26086c10 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                        c28655q.m87172p0(c26086c10);
                        objM87133R2 = c26086c10;
                    } else {
                        c39967p2 = c39967p;
                        function10 = function8;
                        function11 = function9;
                        C26086c c26086c11 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                        c28655q.m87172p0(c26086c11);
                        objM87133R2 = c26086c11;
                    }
                    AbstractC31907b.m99196f(modifierM3409f12, c31909dM99205a6, (InterfaceC4339a) objM87133R2, true, c28655q, 3072, 0);
                    state = c26088e;
                    c39967p = c39967p2;
                    function8 = function10;
                    function9 = function11;
                    i15 = i15;
                    modifier6 = modifier6;
                    arrayList3 = arrayList3;
                    c28676v0 = c28676v0;
                    modifier7 = modifier7;
                    f13 = f16;
                    f14 = f14;
                    i24 = i25;
                    c2314t = c2314t;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                function2 = function8;
                function5 = function9;
                modifier5 = modifier7;
            } else {
                c28655q.m87138X();
                function2 = function1;
                modifier5 = modifier3;
                modifier6 = modifier4;
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, c26088e, function2, function5, i13, i14, 6);
            }
        }
        i15 |= 3072;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function3;
                if (c28655q.m87157i(function4)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier3;
                }
                if (i28 != 0) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier4;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26009o(7);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C15786e(25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function3) objM87133R3;
                } else {
                    function7 = function4;
                }
                zM87153g = c28655q.m87153g(state);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    List<C31909d> listM77603c18 = state.m77603c();
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (((C31909d) obj).getSelected()) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C31909d) it.next()).getId());
                    }
                    objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                    c28655q.m87172p0(objM87133R);
                } else {
                    List<C31909d> listM77603c19 = state.m77603c();
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (((C31909d) obj).getSelected()) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C31909d) it.next()).getId());
                    }
                    objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                    c28655q.m87172p0(objM87133R);
                }
                c39967p = (C39967p) objM87133R;
                Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, modifier7);
                f13 = 8;
                f14 = 1 * f13;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
                function8 = function6;
                function9 = function7;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f13);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                List<C31909d> listM77603c110 = state.m77603c();
                arrayList3 = new ArrayList();
                while (r5.hasNext()) {
                    if (!state.m77604e().contains(((C31909d) obj2).getId())) {
                        arrayList3.add(obj2);
                    }
                }
                c28655q.m87150e0(931723729);
                i24 = 0;
                while (r24.hasNext()) {
                    i25 = i24 + 1;
                    str = null;
                    if (i24 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    c31909d = (C31909d) obj3;
                    zContains = c39967p.contains(c31909d.getId());
                    sectionTitle = c31909d.getSectionTitle();
                    if (sectionTitle != null) {
                        c31909d2 = (C31909d) AbstractC25265s.m74102I0(i24 - 1, arrayList3);
                        if (c31909d2 != null) {
                            sectionTitle2 = c31909d2.getSectionTitle();
                        } else {
                            sectionTitle2 = null;
                        }
                        if (!sectionTitle.equals(sectionTitle2)) {
                            str = sectionTitle;
                        }
                    }
                    if (str == null) {
                        c28655q.m87150e0(-1374433010);
                        c28655q.m87173q(false);
                        z13 = false;
                        f16 = f13;
                        f17 = 1.0f;
                    } else {
                        c28655q.m87150e0(-1374433009);
                        if (i24 > 0) {
                            f15 = 3;
                        } else {
                            f15 = 0;
                        }
                        C28655q c28655q8 = c28655q;
                        f16 = f13;
                        f17 = 1.0f;
                        z13 = false;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, f14, 5), null, null, AbstractC8693b.m21278l(str), null, 0L, 0L, null, c28655q8, 0, 246);
                        c28655q = c28655q8;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f14 = AbstractC1102d.m3409f(f17, modifier6);
                    if (c31909d.getIsDisabled()) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    C31909d c31909dM99205a7 = c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : zContains, (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : z14, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null);
                    boolean zM87157i7 = c28655q.m87157i(state) | c28655q.m87157i(c31909d) | c28655q.m87155h(zContains) | c28655q.m87153g(c39967p);
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    boolean z114 = zM87157i7 | z15;
                    if ((57344 & i15) == 16384) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    z17 = z114 | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        c39967p2 = c39967p;
                        function10 = function8;
                        function11 = function9;
                        C26086c c26086c12 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                        c28655q.m87172p0(c26086c12);
                        objM87133R2 = c26086c12;
                    } else {
                        c39967p2 = c39967p;
                        function10 = function8;
                        function11 = function9;
                        C26086c c26086c13 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                        c28655q.m87172p0(c26086c13);
                        objM87133R2 = c26086c13;
                    }
                    AbstractC31907b.m99196f(modifierM3409f14, c31909dM99205a7, (InterfaceC4339a) objM87133R2, true, c28655q, 3072, 0);
                    state = c26088e;
                    c39967p = c39967p2;
                    function8 = function10;
                    function9 = function11;
                    i15 = i15;
                    modifier6 = modifier6;
                    arrayList3 = arrayList3;
                    c28676v0 = c28676v0;
                    modifier7 = modifier7;
                    f13 = f16;
                    f14 = f14;
                    i24 = i25;
                    c2314t = c2314t;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                function2 = function8;
                function5 = function9;
                modifier5 = modifier7;
            } else {
                c28655q.m87138X();
                function2 = function1;
                modifier5 = modifier3;
                modifier6 = modifier4;
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, c26088e, function2, function5, i13, i14, 6);
            }
        }
        i15 |= 24576;
        function4 = function3;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier7 = c2314t;
            } else {
                modifier7 = modifier3;
            }
            if (i28 != 0) {
                modifier6 = c2314t;
            } else {
                modifier6 = modifier4;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C26009o(7);
                    c28655q.m87172p0(objM87133R4);
                }
                function6 = (Function1) objM87133R4;
            } else {
                function6 = function1;
            }
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C15786e(25);
                    c28655q.m87172p0(objM87133R3);
                }
                function7 = (Function3) objM87133R3;
            } else {
                function7 = function4;
            }
            zM87153g = c28655q.m87153g(state);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                List<C31909d> listM77603c111 = state.m77603c();
                arrayList = new ArrayList();
                while (r13.hasNext()) {
                    if (((C31909d) obj).getSelected()) {
                        arrayList.add(obj);
                    }
                }
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C31909d) it.next()).getId());
                }
                objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                c28655q.m87172p0(objM87133R);
            } else {
                List<C31909d> listM77603c112 = state.m77603c();
                arrayList = new ArrayList();
                while (r13.hasNext()) {
                    if (((C31909d) obj).getSelected()) {
                        arrayList.add(obj);
                    }
                }
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C31909d) it.next()).getId());
                }
                objM87133R = AbstractC28683x.m87242J(AbstractC25265s.m74159y0(arrayList2));
                c28655q.m87172p0(objM87133R);
            }
            c39967p = (C39967p) objM87133R;
            Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, modifier7);
            f13 = 8;
            f14 = 1 * f13;
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
            function8 = function6;
            function9 = function7;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f15);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            List<C31909d> listM77603c113 = state.m77603c();
            arrayList3 = new ArrayList();
            while (r5.hasNext()) {
                if (!state.m77604e().contains(((C31909d) obj2).getId())) {
                    arrayList3.add(obj2);
                }
            }
            c28655q.m87150e0(931723729);
            i24 = 0;
            while (r24.hasNext()) {
                i25 = i24 + 1;
                str = null;
                if (i24 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                c31909d = (C31909d) obj3;
                zContains = c39967p.contains(c31909d.getId());
                sectionTitle = c31909d.getSectionTitle();
                if (sectionTitle != null) {
                    c31909d2 = (C31909d) AbstractC25265s.m74102I0(i24 - 1, arrayList3);
                    if (c31909d2 != null) {
                        sectionTitle2 = c31909d2.getSectionTitle();
                    } else {
                        sectionTitle2 = null;
                    }
                    if (!sectionTitle.equals(sectionTitle2)) {
                        str = sectionTitle;
                    }
                }
                if (str == null) {
                    c28655q.m87150e0(-1374433010);
                    c28655q.m87173q(false);
                    z13 = false;
                    f16 = f13;
                    f17 = 1.0f;
                } else {
                    c28655q.m87150e0(-1374433009);
                    if (i24 > 0) {
                        f15 = 3;
                    } else {
                        f15 = 0;
                    }
                    C28655q c28655q9 = c28655q;
                    f16 = f13;
                    f17 = 1.0f;
                    z13 = false;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, f14, 5), null, null, AbstractC8693b.m21278l(str), null, 0L, 0L, null, c28655q9, 0, 246);
                    c28655q = c28655q9;
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f16 = AbstractC1102d.m3409f(f17, modifier6);
                if (c31909d.getIsDisabled()) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                C31909d c31909dM99205a8 = c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : zContains, (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : z14, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null);
                boolean zM87157i8 = c28655q.m87157i(state) | c28655q.m87157i(c31909d) | c28655q.m87155h(zContains) | c28655q.m87153g(c39967p);
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                boolean z115 = zM87157i8 | z15;
                if ((57344 & i15) == 16384) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                z17 = z115 | z16;
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    c39967p2 = c39967p;
                    function10 = function8;
                    function11 = function9;
                    C26086c c26086c14 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                    c28655q.m87172p0(c26086c14);
                    objM87133R2 = c26086c14;
                } else {
                    c39967p2 = c39967p;
                    function10 = function8;
                    function11 = function9;
                    C26086c c26086c15 = new C26086c(state, c31909d, zContains, c39967p2, function10, function11);
                    c28655q.m87172p0(c26086c15);
                    objM87133R2 = c26086c15;
                }
                AbstractC31907b.m99196f(modifierM3409f16, c31909dM99205a8, (InterfaceC4339a) objM87133R2, true, c28655q, 3072, 0);
                state = c26088e;
                c39967p = c39967p2;
                function8 = function10;
                function9 = function11;
                i15 = i15;
                modifier6 = modifier6;
                arrayList3 = arrayList3;
                c28676v0 = c28676v0;
                modifier7 = modifier7;
                f13 = f16;
                f14 = f14;
                i24 = i25;
                c2314t = c2314t;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            function2 = function8;
            function5 = function9;
            modifier5 = modifier7;
        } else {
            c28655q.m87138X();
            function2 = function1;
            modifier5 = modifier3;
            modifier6 = modifier4;
            function5 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, c26088e, function2, function5, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m77589f(List it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m77590g(String str, boolean z4, List list) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(list, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m77591h(C26088e c26088e, C31909d c31909d, boolean z4, C39967p c39967p, Function1 function1, Function3 function3) {
        boolean isDisabled = c26088e.getIsDisabled();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (isDisabled) {
            return c23454a0;
        }
        m77597n(c31909d.getId(), z4, c39967p, c26088e.getMaxSelection(), c26088e.getMinSelection(), m77598o(c31909d, c26088e.getStateUpdateValueKey()), function1, function3);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m77592i(Modifier modifier, Modifier modifier2, C26088e c26088e, Function1 function1, Function3 function3, int i13, int i14, Composer composer, int i15) {
        m77588e(modifier, modifier2, c26088e, function1, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Object m77595l(C26088e c26088e, String str, boolean z4, List<String> list) {
        DefaultConstructorMarker defaultConstructorMarker;
        Object next;
        Map<String, JsonElement> state;
        Set<String> setKeySet;
        Iterator<T> it = c26088e.m77603c().iterator();
        do {
            defaultConstructorMarker = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C31909d) next).getId(), str));
        C31909d c31909d = (C31909d) next;
        Object actionArgument = c31909d != null ? c31909d.getActionArgument() : null;
        Object deselectArgument = c31909d != null ? c31909d.getDeselectArgument() : null;
        if (z4) {
            return m77599p(actionArgument, c26088e.getStateUpdateValueKey(), true);
        }
        int i13 = 2;
        boolean z13 = false;
        if (deselectArgument != null) {
            return m77600q(deselectArgument, c26088e.getStateUpdateValueKey(), false, 2, null);
        }
        if (list.isEmpty()) {
            StateUpdateAction stateUpdateAction = actionArgument instanceof StateUpdateAction ? (StateUpdateAction) actionArgument : null;
            if (stateUpdateAction != null && (state = stateUpdateAction.getState()) != null && (setKeySet = state.keySet()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    if (!AbstractC22676k.m65745e((String) obj, c26088e.getStateUpdateValueKey())) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return new StateClearAction(arrayList, z13, i13, defaultConstructorMarker);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m77596m(Object obj, Object obj2, Function1 function1) {
        if (obj2 == null) {
            function1.invoke(obj);
            return;
        }
        Action action = obj instanceof Action ? (Action) obj : null;
        Action actionM74257a = action != null ? AbstractC25294d0.m74257a(action) : null;
        Action action2 = obj2 instanceof Action ? (Action) obj2 : null;
        Action actionM74257a2 = action2 != null ? AbstractC25294d0.m74257a(action2) : null;
        if (actionM74257a != null && actionM74257a2 != null) {
            function1.invoke(new ActionSequenceAction(AbstractC37056f.m118959K(new ActionSequenceStep(actionM74257a, null), new ActionSequenceStep(actionM74257a2, null))));
        } else {
            function1.invoke(obj);
            function1.invoke(new DesignItemInteraction(obj2, null));
        }
    }

    /* JADX INFO: renamed from: n */
    private static final void m77597n(String str, boolean z4, List<String> list, int i13, int i14, List<String> list2, Function1 function1, Function3 function3) {
        boolean z13;
        if (!z4) {
            z13 = true;
            if (list2 != null && list2.size() <= i13) {
                list.clear();
                list.addAll(list2);
            } else if (i13 == 1) {
                list.clear();
                list.add(str);
            } else if (list.size() >= i13) {
                return;
            } else {
                list.add(str);
            }
        } else {
            if (list.size() <= i14) {
                return;
            }
            list.remove(str);
            z13 = false;
        }
        List listM74093D1 = AbstractC25265s.m74093D1(list);
        function1.invoke(listM74093D1);
        function3.invoke(str, Boolean.valueOf(z13), listM74093D1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX INFO: renamed from: o */
    private static final List<String> m77598o(C31909d c31909d, String str) {
        JsonElement jsonElement;
        String content;
        Map<String, JsonElement> state;
        if (str != null) {
            Object actionArgument = c31909d.getActionArgument();
            StateUpdateAction stateUpdateAction = actionArgument instanceof StateUpdateAction ? (StateUpdateAction) actionArgument : null;
            if (stateUpdateAction == null || (state = stateUpdateAction.getState()) == null) {
                jsonElement = null;
            } else {
                jsonElement = state.get(str);
            }
        } else {
            jsonElement = null;
        }
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement2 : jsonArray) {
            JsonPrimitive jsonPrimitive = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
            if (jsonPrimitive == null) {
                content = null;
            } else {
                if (!jsonPrimitive.isString()) {
                    jsonPrimitive = null;
                }
                if (jsonPrimitive != null) {
                    content = jsonPrimitive.getContent();
                } else {
                    content = null;
                }
            }
            if (content != null) {
                arrayList.add(content);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX INFO: renamed from: p */
    private static final Object m77599p(Object obj, String str, boolean z4) {
        Map<String, JsonElement> mapM73991Z;
        if (str != null) {
            if (obj instanceof StateUpdateAction) {
                if (z4) {
                    StateUpdateAction stateUpdateAction = (StateUpdateAction) obj;
                    if (stateUpdateAction.getState().get(str) instanceof JsonArray) {
                        mapM73991Z = stateUpdateAction.getState();
                    } else {
                        mapM73991Z = AbstractC25247g0.m73991Z(str, ((StateUpdateAction) obj).getState());
                    }
                } else {
                    mapM73991Z = AbstractC25247g0.m73991Z(str, ((StateUpdateAction) obj).getState());
                }
                StateUpdateAction stateUpdateAction2 = (StateUpdateAction) obj;
                if (mapM73991Z.isEmpty() && !stateUpdateAction2.getDismissModal()) {
                    obj = null;
                }
                StateUpdateAction stateUpdateAction3 = (StateUpdateAction) obj;
                if (stateUpdateAction3 != null) {
                    return StateUpdateAction.copy$default(stateUpdateAction3, mapM73991Z, false, 2, null);
                }
                return null;
            }
            if (obj instanceof StateClearAction) {
                StateClearAction stateClearAction = (StateClearAction) obj;
                List<String> keys = stateClearAction.getKeys();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : keys) {
                    if (!AbstractC22676k.m65745e((String) obj2, str)) {
                        arrayList.add(obj2);
                    }
                }
                StateClearAction stateClearActionCopy$default = StateClearAction.copy$default(stateClearAction, arrayList, false, 2, null);
                if (stateClearActionCopy$default.getKeys().isEmpty()) {
                    return null;
                }
                return stateClearActionCopy$default;
            }
            if (obj instanceof StatePushAction) {
                if (AbstractC22676k.m65745e(((StatePushAction) obj).getKey(), str)) {
                    return null;
                }
            } else if ((obj instanceof StatePopAction) && AbstractC22676k.m65745e(((StatePopAction) obj).getKey(), str)) {
                return null;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m77600q(Object obj, String str, boolean z4, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return m77599p(obj, str, z4);
    }
}

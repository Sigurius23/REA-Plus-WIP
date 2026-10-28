package m50;

import ad3.AbstractC0770m;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.access.circumference.models.SegmentedControlDisplayModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import d21.C11503a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k50.C22200c;
import l83.C23454a0;
import l83.C23465k;
import m01.C24875c;
import m31.C25002h;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import n83.C26463f;
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
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import q01.AbstractC29745a;
import q01.C29746b;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: m50.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\u000e\u0010\u0013\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "key", "", "centimeters", "Lcom/whoop/domain/model/UnitSystem;", "unit", "Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "q", "(Ljava/lang/String;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "Lm50/d;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lm50/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedUnit", "selectedCentimeters", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25077c {

    /* JADX INFO: renamed from: m50.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.access.circumference.view.CircumferenceItemKt$CircumferenceView$2$1", m100430f = "CircumferenceItem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28593a1 f98213E;

        /* JADX INFO: renamed from: w */
        int f98214w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f98215x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f98216y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25078d f98217z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, Function1 function1, C25078d c25078d, InterfaceC28593a1 interfaceC28593a1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f98215x = interfaceC28601c1;
            this.f98216y = function1;
            this.f98217z = c25078d;
            this.f98213E = interfaceC28593a1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f98215x, this.f98216y, this.f98217z, this.f98213E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f98214w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC25077c.m73548f(this.f98216y, this.f98217z, this.f98213E, AbstractC25077c.m73553k(this.f98215x));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0258  */
    /* JADX WARN: Code duplicated, block: B:103:0x025c  */
    /* JADX WARN: Code duplicated, block: B:106:0x026f  */
    /* JADX WARN: Code duplicated, block: B:108:0x027d  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:114:0x0300 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0306  */
    /* JADX WARN: Code duplicated, block: B:119:0x032d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0337  */
    /* JADX WARN: Code duplicated, block: B:125:0x0111 A[EDGE_INSN: B:125:0x0111->B:68:0x0111 BREAK  A[LOOP:1: B:61:0x00f2->B:66:0x010d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d A[LOOP:1: B:61:0x00f2->B:66:0x010d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d4 A[LOOP:0: B:89:0x01ce->B:91:0x01d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0208  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void m73547e(C25078d viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function3;
        boolean zM87149e;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87149e2;
        Object objM87133R2;
        InterfaceC28593a1 interfaceC28593a1;
        boolean zM87153g;
        Object objM87133R3;
        Iterator<SegmentedControlDisplayModel> it;
        int i18;
        int i19;
        boolean z13;
        boolean zM87153g2;
        Object objM87133R4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ArrayList arrayList;
        Iterator<T> it3;
        boolean z14;
        boolean z15;
        Object objM87133R5;
        Function1 function4;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean zM87153g3;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(853088533);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
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
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C24875c(7);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function3 = (Function1) objM87133R7;
                    } else {
                        function3 = function2;
                    }
                    zM87149e = c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
                    objM87133R = c28655q.m87133R();
                    if (zM87149e || objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(viewState.getDefaultUnitSystem());
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    zM87149e2 = c28655q.m87149e(viewState.getCircumferenceInCentimeters());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e2 || objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(viewState.getCircumferenceInCentimeters(), c28655q);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    zM87153g = c28655q.m87153g(viewState.m73568j()) | c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g || objM87133R3 == c28676v0) {
                        it = viewState.m73568j().iterator();
                        i18 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i18 = -1;
                                break;
                            } else if (UnitSystemExtKt.unitSystemFromString(it.next().getId()) == viewState.getDefaultUnitSystem()) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i18 < 0) {
                            i18 = 0;
                        }
                        objM87133R3 = Integer.valueOf(i18);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int iIntValue = ((Number) objM87133R3).intValue();
                    boolean zM87157i = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28593a1);
                    i19 = i15 & 896;
                    if (i19 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87153g2 = z13 | zM87157i | c28655q.m87153g(interfaceC28601c1);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R4 == c28676v0) {
                        a aVar = new a(interfaceC28601c1, function3, viewState, interfaceC28593a1, null);
                        c28655q.m87172p0(aVar);
                        objM87133R4 = aVar;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
                    Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3);
                    float f13 = 8;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f13), C2299e.f9110M, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3427x);
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
                    List<SegmentedControlDisplayModel> listM73568j = viewState.m73568j();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM73568j, 10));
                    it3 = listM73568j.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new C33223u0(((SegmentedControlDisplayModel) it3.next()).getNameDisplay(), null, 2, 0 == true ? 1 : 0));
                    }
                    boolean zM87157i2 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28593a1);
                    if (i19 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i2 | z14;
                    objM87133R5 = c28655q.m87133R();
                    if (z15 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C25076b(viewState, interfaceC28601c1, function3, interfaceC28593a1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifier5 = modifier4;
                    function4 = function3;
                    AbstractC33231x0.m105420e(arrayList, iIntValue, null, null, (Function1) objM87133R5, c28655q, 0, 12);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM73381n = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    String label = viewState.getLabel();
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    AbstractC30795n.m94707h(label, null, c38072d.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    C29746b c29746b = new C29746b(m73553k(interfaceC28601c1), m73555m(interfaceC28593a1), viewState.getInchesRange(), viewState.getCentimetersRange(), viewState.getInchesLabel(), viewState.getCentimetersLabel());
                    zM87153g3 = c28655q.m87153g(interfaceC28593a1) | (i19 == 256) | c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c1);
                    objM87133R6 = c28655q.m87133R();
                    if (!zM87153g3 || objM87133R6 == c28676v0) {
                        function2 = function4;
                        objM87133R6 = new C25076b(function2, viewState, interfaceC28593a1, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function2 = function4;
                    }
                    AbstractC29745a.m91189d(c29746b, (Function1) objM87133R6, null, 0.0f, null, false, c28655q, C29746b.f121668g, 60);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C25002h(i13, i14, 2, modifier3, function2, viewState);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C24875c(7);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                } else {
                    function3 = function2;
                }
                zM87149e = c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
                objM87133R = c28655q.m87133R();
                if (zM87149e) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getDefaultUnitSystem());
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC28683x.m87272z(viewState.getDefaultUnitSystem());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87149e2 = c28655q.m87149e(viewState.getCircumferenceInCentimeters());
                objM87133R2 = c28655q.m87133R();
                if (zM87149e2) {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getCircumferenceInCentimeters(), c28655q);
                } else {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getCircumferenceInCentimeters(), c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                zM87153g = c28655q.m87153g(viewState.m73568j()) | c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    it = viewState.m73568j().iterator();
                    i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        } else {
                            if (UnitSystemExtKt.unitSystemFromString(it.next().getId()) == viewState.getDefaultUnitSystem()) {
                                break;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (i18 < 0) {
                        i18 = 0;
                    }
                    objM87133R3 = Integer.valueOf(i18);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    it = viewState.m73568j().iterator();
                    i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        } else {
                            if (UnitSystemExtKt.unitSystemFromString(it.next().getId()) == viewState.getDefaultUnitSystem()) {
                                break;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (i18 < 0) {
                        i18 = 0;
                    }
                    objM87133R3 = Integer.valueOf(i18);
                    c28655q.m87172p0(objM87133R3);
                }
                int iIntValue2 = ((Number) objM87133R3).intValue();
                boolean zM87157i3 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28593a1);
                i19 = i15 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87153g2 = z13 | zM87157i3 | c28655q.m87153g(interfaceC28601c1);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g2) {
                    a aVar2 = new a(interfaceC28601c1, function3, viewState, interfaceC28593a1, null);
                    c28655q.m87172p0(aVar2);
                    objM87133R4 = aVar2;
                } else {
                    a aVar3 = new a(interfaceC28601c1, function3, viewState, interfaceC28593a1, null);
                    c28655q.m87172p0(aVar3);
                    objM87133R4 = aVar3;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
                Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3);
                float f14 = 8;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f14), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3427x2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                List<SegmentedControlDisplayModel> listM73568j2 = viewState.m73568j();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM73568j2, 10));
                it3 = listM73568j2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C33223u0(((SegmentedControlDisplayModel) it3.next()).getNameDisplay(), null, 2, 0 == true ? 1 : 0));
                }
                boolean zM87157i4 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28593a1);
                if (i19 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i4 | z14;
                objM87133R5 = c28655q.m87133R();
                if (z15) {
                    objM87133R5 = new C25076b(viewState, interfaceC28601c1, function3, interfaceC28593a1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C25076b(viewState, interfaceC28601c1, function3, interfaceC28593a1);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifier6 = modifier4;
                function4 = function3;
                AbstractC33231x0.m105420e(arrayList, iIntValue2, null, null, (Function1) objM87133R5, c28655q, 0, 12);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM73381n2 = AbstractC25012a.m73381n(1, f14, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                String label2 = viewState.getLabel();
                C38072d c38072d2 = C38072d.f163053a;
                int i26 = C38072d.f163054b;
                AbstractC30795n.m94707h(label2, null, c38072d2.m121949b(c28655q, i26).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i26).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                C29746b c29746b2 = new C29746b(m73553k(interfaceC28601c1), m73555m(interfaceC28593a1), viewState.getInchesRange(), viewState.getCentimetersRange(), viewState.getInchesLabel(), viewState.getCentimetersLabel());
                zM87153g3 = c28655q.m87153g(interfaceC28593a1) | (i19 == 256) | c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c1);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g3) {
                    function2 = function4;
                    objM87133R6 = new C25076b(function2, viewState, interfaceC28593a1, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function2 = function4;
                    objM87133R6 = new C25076b(function2, viewState, interfaceC28593a1, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC29745a.m91189d(c29746b2, (Function1) objM87133R6, null, 0.0f, null, false, c28655q, C29746b.f121668g, 60);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 2, modifier3, function2, viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
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
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C24875c(7);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                } else {
                    function3 = function2;
                }
                zM87149e = c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
                objM87133R = c28655q.m87133R();
                if (zM87149e) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getDefaultUnitSystem());
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC28683x.m87272z(viewState.getDefaultUnitSystem());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87149e2 = c28655q.m87149e(viewState.getCircumferenceInCentimeters());
                objM87133R2 = c28655q.m87133R();
                if (zM87149e2) {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getCircumferenceInCentimeters(), c28655q);
                } else {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getCircumferenceInCentimeters(), c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                zM87153g = c28655q.m87153g(viewState.m73568j()) | c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    it = viewState.m73568j().iterator();
                    i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        } else {
                            if (UnitSystemExtKt.unitSystemFromString(it.next().getId()) == viewState.getDefaultUnitSystem()) {
                                break;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (i18 < 0) {
                        i18 = 0;
                    }
                    objM87133R3 = Integer.valueOf(i18);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    it = viewState.m73568j().iterator();
                    i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        } else {
                            if (UnitSystemExtKt.unitSystemFromString(it.next().getId()) == viewState.getDefaultUnitSystem()) {
                                break;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (i18 < 0) {
                        i18 = 0;
                    }
                    objM87133R3 = Integer.valueOf(i18);
                    c28655q.m87172p0(objM87133R3);
                }
                int iIntValue3 = ((Number) objM87133R3).intValue();
                boolean zM87157i5 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28593a1);
                i19 = i15 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87153g2 = z13 | zM87157i5 | c28655q.m87153g(interfaceC28601c1);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g2) {
                    a aVar4 = new a(interfaceC28601c1, function3, viewState, interfaceC28593a1, null);
                    c28655q.m87172p0(aVar4);
                    objM87133R4 = aVar4;
                } else {
                    a aVar5 = new a(interfaceC28601c1, function3, viewState, interfaceC28593a1, null);
                    c28655q.m87172p0(aVar5);
                    objM87133R4 = aVar5;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
                Modifier modifierM3427x3 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3);
                float f15 = 8;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f15), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3427x3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                List<SegmentedControlDisplayModel> listM73568j3 = viewState.m73568j();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM73568j3, 10));
                it3 = listM73568j3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C33223u0(((SegmentedControlDisplayModel) it3.next()).getNameDisplay(), null, 2, 0 == true ? 1 : 0));
                }
                boolean zM87157i6 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28593a1);
                if (i19 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i6 | z14;
                objM87133R5 = c28655q.m87133R();
                if (z15) {
                    objM87133R5 = new C25076b(viewState, interfaceC28601c1, function3, interfaceC28593a1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C25076b(viewState, interfaceC28601c1, function3, interfaceC28593a1);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifier7 = modifier4;
                function4 = function3;
                AbstractC33231x0.m105420e(arrayList, iIntValue3, null, null, (Function1) objM87133R5, c28655q, 0, 12);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM73381n3 = AbstractC25012a.m73381n(1, f15, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                String label3 = viewState.getLabel();
                C38072d c38072d3 = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                AbstractC30795n.m94707h(label3, null, c38072d3.m121949b(c28655q, i27).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i27).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                C29746b c29746b3 = new C29746b(m73553k(interfaceC28601c1), m73555m(interfaceC28593a1), viewState.getInchesRange(), viewState.getCentimetersRange(), viewState.getInchesLabel(), viewState.getCentimetersLabel());
                zM87153g3 = c28655q.m87153g(interfaceC28593a1) | (i19 == 256) | c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c1);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g3) {
                    function2 = function4;
                    objM87133R6 = new C25076b(function2, viewState, interfaceC28593a1, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function2 = function4;
                    objM87133R6 = new C25076b(function2, viewState, interfaceC28593a1, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC29745a.m91189d(c29746b3, (Function1) objM87133R6, null, 0.0f, null, false, c28655q, C29746b.f121668g, 60);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 2, modifier3, function2, viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C24875c(7);
                    c28655q.m87172p0(objM87133R7);
                }
                function3 = (Function1) objM87133R7;
            } else {
                function3 = function2;
            }
            zM87149e = c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
            objM87133R = c28655q.m87133R();
            if (zM87149e) {
                objM87133R = AbstractC28683x.m87272z(viewState.getDefaultUnitSystem());
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(viewState.getDefaultUnitSystem());
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zM87149e2 = c28655q.m87149e(viewState.getCircumferenceInCentimeters());
            objM87133R2 = c28655q.m87133R();
            if (zM87149e2) {
                objM87133R2 = AbstractC31061c.m95646v(viewState.getCircumferenceInCentimeters(), c28655q);
            } else {
                objM87133R2 = AbstractC31061c.m95646v(viewState.getCircumferenceInCentimeters(), c28655q);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
            zM87153g = c28655q.m87153g(viewState.m73568j()) | c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                it = viewState.m73568j().iterator();
                i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i18 = -1;
                        break;
                    } else {
                        if (UnitSystemExtKt.unitSystemFromString(it.next().getId()) == viewState.getDefaultUnitSystem()) {
                            break;
                            break;
                        }
                        i18++;
                    }
                }
                if (i18 < 0) {
                    i18 = 0;
                }
                objM87133R3 = Integer.valueOf(i18);
                c28655q.m87172p0(objM87133R3);
            } else {
                it = viewState.m73568j().iterator();
                i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i18 = -1;
                        break;
                    } else {
                        if (UnitSystemExtKt.unitSystemFromString(it.next().getId()) == viewState.getDefaultUnitSystem()) {
                            break;
                            break;
                        }
                        i18++;
                    }
                }
                if (i18 < 0) {
                    i18 = 0;
                }
                objM87133R3 = Integer.valueOf(i18);
                c28655q.m87172p0(objM87133R3);
            }
            int iIntValue4 = ((Number) objM87133R3).intValue();
            boolean zM87157i7 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28593a1);
            i19 = i15 & 896;
            if (i19 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87153g2 = z13 | zM87157i7 | c28655q.m87153g(interfaceC28601c1);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g2) {
                a aVar6 = new a(interfaceC28601c1, function3, viewState, interfaceC28593a1, null);
                c28655q.m87172p0(aVar6);
                objM87133R4 = aVar6;
            } else {
                a aVar7 = new a(interfaceC28601c1, function3, viewState, interfaceC28593a1, null);
                c28655q.m87172p0(aVar7);
                objM87133R4 = aVar7;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
            Modifier modifierM3427x4 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3);
            float f16 = 8;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f16), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3427x4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
            List<SegmentedControlDisplayModel> listM73568j4 = viewState.m73568j();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM73568j4, 10));
            it3 = listM73568j4.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C33223u0(((SegmentedControlDisplayModel) it3.next()).getNameDisplay(), null, 2, 0 == true ? 1 : 0));
            }
            boolean zM87157i8 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28593a1);
            if (i19 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i8 | z14;
            objM87133R5 = c28655q.m87133R();
            if (z15) {
                objM87133R5 = new C25076b(viewState, interfaceC28601c1, function3, interfaceC28593a1);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C25076b(viewState, interfaceC28601c1, function3, interfaceC28593a1);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifier8 = modifier4;
            function4 = function3;
            AbstractC33231x0.m105420e(arrayList, iIntValue4, null, null, (Function1) objM87133R5, c28655q, 0, 12);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM73381n4 = AbstractC25012a.m73381n(1, f16, C2299e.f9111N, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            String label4 = viewState.getLabel();
            C38072d c38072d4 = C38072d.f163053a;
            int i28 = C38072d.f163054b;
            AbstractC30795n.m94707h(label4, null, c38072d4.m121949b(c28655q, i28).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i28).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            C29746b c29746b4 = new C29746b(m73553k(interfaceC28601c1), m73555m(interfaceC28593a1), viewState.getInchesRange(), viewState.getCentimetersRange(), viewState.getInchesLabel(), viewState.getCentimetersLabel());
            zM87153g3 = c28655q.m87153g(interfaceC28593a1) | (i19 == 256) | c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c1);
            objM87133R6 = c28655q.m87133R();
            if (zM87153g3) {
                function2 = function4;
                objM87133R6 = new C25076b(function2, viewState, interfaceC28593a1, interfaceC28601c1);
                c28655q.m87172p0(objM87133R6);
            } else {
                function2 = function4;
                objM87133R6 = new C25076b(function2, viewState, interfaceC28593a1, interfaceC28601c1);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC29745a.m91189d(c29746b4, (Function1) objM87133R6, null, 0.0f, null, false, c28655q, C29746b.f121668g, 60);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier8;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 2, modifier3, function2, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m73548f(Function1 function1, C25078d c25078d, InterfaceC28593a1 interfaceC28593a1, UnitSystem unitSystem) {
        Object next;
        String id4;
        C26463f c26463f = new C26463f();
        String stateUpdateUnitKey = c25078d.getStateUpdateUnitKey();
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (stateUpdateUnitKey != null) {
            Iterator<T> it = c25078d.m73568j().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (UnitSystemExtKt.unitSystemFromString(((SegmentedControlDisplayModel) next).getId()) != unitSystem);
            SegmentedControlDisplayModel segmentedControlDisplayModel = (SegmentedControlDisplayModel) next;
            if (segmentedControlDisplayModel != null && (id4 = segmentedControlDisplayModel.getId()) != null) {
            }
        }
        c26463f.putAll(m73559q(c25078d.getStateUpdateCircumferenceKey(), m73555m(interfaceC28593a1), unitSystem).getState());
        for (C22200c c22200c : c25078d.m73564f()) {
            c26463f.put(c22200c.getStateKey(), AbstractC0770m.m1840b(Integer.valueOf(c22200c.m63659b(unitSystem))));
        }
        function1.invoke(new DesignItemInteraction(new StateUpdateAction((Map) c26463f.m78380b(), false, 2, defaultConstructorMarker), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m73549g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m73550h(C25078d c25078d, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28593a1 interfaceC28593a1, int i13) {
        UnitSystem unitSystemUnitSystemFromString = UnitSystemExtKt.unitSystemFromString(c25078d.m73568j().get(i13).getId());
        if (unitSystemUnitSystemFromString != null) {
            m73554l(interfaceC28601c1, unitSystemUnitSystemFromString);
            m73548f(function1, c25078d, interfaceC28593a1, unitSystemUnitSystemFromString);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m73551i(Function1 function1, C25078d c25078d, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        m73556n(interfaceC28593a1, i13);
        function1.invoke(new DesignItemInteraction(m73559q(c25078d.getStateUpdateCircumferenceKey(), i13, m73553k(interfaceC28601c1)), null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m73552j(C25078d c25078d, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m73547e(c25078d, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final UnitSystem m73553k(InterfaceC28601c1 interfaceC28601c1) {
        return (UnitSystem) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m73554l(InterfaceC28601c1 interfaceC28601c1, UnitSystem unitSystem) {
        interfaceC28601c1.setValue(unitSystem);
    }

    /* JADX INFO: renamed from: m */
    private static final int m73555m(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: n */
    private static final void m73556n(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: q */
    private static final StateUpdateAction m73559q(String str, int i13, UnitSystem unitSystem) {
        if (UnitSystemExtKt.isImperial(unitSystem)) {
            i13 = C11503a.f37005a.m30912a(i13);
        }
        return new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(str, AbstractC0770m.m1840b(Integer.valueOf(i13)))), false, 2, (DefaultConstructorMarker) null);
    }
}

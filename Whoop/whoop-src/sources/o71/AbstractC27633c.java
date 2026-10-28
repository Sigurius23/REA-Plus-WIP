package o71;

import am2.C1040r;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import d21.AbstractC11508f;
import d21.C11505c;
import d21.C11509g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jp2.C21881l;
import kotlin.C2032u;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m31.C25002h;
import m83.AbstractC25267u;
import n83.C26463f;
import nx1.C27225g;
import ny0.C27266m;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
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
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s41.AbstractC32195c;
import s41.C32194b;
import s41.C32196d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: o71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u000f\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0016²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lo71/h;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Lo71/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll0/s1;", "", "label", "Lkotlin/Function0;", "picker", "x", "(Ll0/s1;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/domain/model/UnitSystem;", "selectedUnit", "", "selectedCentimeters", "selectedPounds", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27633c {

    /* JADX INFO: renamed from: o71.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.heightweight.HeightWeightItemKt$HeightWeightView$2$1", m100430f = "HeightWeightItem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28593a1 f111196E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28593a1 f111197F;

        /* JADX INFO: renamed from: w */
        int f111198w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f111199x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C27638h f111200y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f111201z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, C27638h c27638h, Function1 function1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28593a1 interfaceC28593a2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111199x = interfaceC28601c1;
            this.f111200y = c27638h;
            this.f111201z = function1;
            this.f111196E = interfaceC28593a1;
            this.f111197F = interfaceC28593a2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f111199x, this.f111200y, this.f111201z, this.f111196E, this.f111197F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f111198w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC27633c.m83420j(this.f111200y, this.f111201z, this.f111196E, this.f111197F, AbstractC27633c.m83428r(this.f111199x));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0187  */
    /* JADX WARN: Code duplicated, block: B:103:0x01de  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:109:0x0203  */
    /* JADX WARN: Code duplicated, block: B:113:0x0226 A[LOOP:0: B:111:0x0220->B:113:0x0226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0252  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:120:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0265  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:127:0x02af  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:142:0x031d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0327  */
    /* JADX WARN: Code duplicated, block: B:146:0x0334  */
    /* JADX WARN: Code duplicated, block: B:149:0x035a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0364  */
    /* JADX WARN: Code duplicated, block: B:155:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x014d A[EDGE_INSN: B:156:0x014d->B:88:0x014d BREAK  A[LOOP:1: B:81:0x012e->B:86:0x0149], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x0101  */
    /* JADX WARN: Code duplicated, block: B:79:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x0149 A[LOOP:1: B:81:0x012e->B:86:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x016f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171  */
    /* JADX WARN: Code duplicated, block: B:97:0x017e A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: i */
    public static final void m83419i(C27638h c27638h, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
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
        C11505c heightPickerState;
        Integer numValueOf;
        boolean zM87153g;
        Object objM87133R2;
        C11505c heightPickerState2;
        int heightInCentimeters;
        InterfaceC28593a1 interfaceC28593a1;
        C32194b weightPickerState;
        Integer numValueOf2;
        boolean zM87153g2;
        Object objM87133R3;
        C32194b weightPickerState2;
        int weightInPounds;
        InterfaceC28593a1 interfaceC28593a2;
        boolean zM87153g3;
        Object objM87133R4;
        Iterator<C27639i> it;
        int i18;
        int i19;
        boolean z13;
        boolean zM87153g4;
        Object objM87133R5;
        InterfaceC28593a1 interfaceC28593a3;
        C28676v0 c28676v1;
        C2306l c2306l;
        InterfaceC28601c1 interfaceC28601c2;
        int iHashCode;
        C0213j c0213j;
        Function1 function4;
        C0209i c0209i;
        ArrayList arrayList;
        Iterator<T> it3;
        boolean z14;
        boolean z15;
        Object c1040r;
        Function1 function5;
        float f13;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        C11505c heightPickerState3;
        C23000t1 c23000t1;
        String heightLabel;
        C32194b weightPickerState3;
        Object objM87133R6;
        C27638h viewState = c27638h;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1934848493);
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
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C27266m(26);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function3 = (Function1) objM87133R6;
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
                    heightPickerState = viewState.getHeightPickerState();
                    if (heightPickerState != null) {
                        numValueOf = Integer.valueOf(heightPickerState.getHeightInCentimeters());
                    } else {
                        numValueOf = null;
                    }
                    zM87153g = c28655q.m87153g(numValueOf);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g || objM87133R2 == c28676v0) {
                        heightPickerState2 = viewState.getHeightPickerState();
                        if (heightPickerState2 != null) {
                            heightInCentimeters = heightPickerState2.getHeightInCentimeters();
                        } else {
                            heightInCentimeters = 0;
                        }
                        objM87133R2 = AbstractC31061c.m95646v(heightInCentimeters, c28655q);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                    weightPickerState = viewState.getWeightPickerState();
                    if (weightPickerState != null) {
                        numValueOf2 = Integer.valueOf(weightPickerState.getWeightInPounds());
                    } else {
                        numValueOf2 = null;
                    }
                    zM87153g2 = c28655q.m87153g(numValueOf2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R3 == c28676v0) {
                        weightPickerState2 = viewState.getWeightPickerState();
                        if (weightPickerState2 != null) {
                            weightInPounds = weightPickerState2.getWeightInPounds();
                        } else {
                            weightInPounds = 0;
                        }
                        objM87133R3 = AbstractC31061c.m95646v(weightInPounds, c28655q);
                    }
                    interfaceC28593a2 = (InterfaceC28593a1) objM87133R3;
                    zM87153g3 = c28655q.m87153g(viewState.m83451e()) | c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g3 || objM87133R4 == c28676v0) {
                        it = viewState.m83451e().iterator();
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
                        objM87133R4 = Integer.valueOf(i18);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int iIntValue = ((Number) objM87133R4).intValue();
                    boolean zM87157i = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(interfaceC28593a2);
                    i19 = i15 & 896;
                    if (i19 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87153g4 = z13 | zM87157i | c28655q.m87153g(interfaceC28601c1);
                    objM87133R5 = c28655q.m87133R();
                    if (!zM87153g4 || objM87133R5 == c28676v0) {
                        interfaceC28593a3 = interfaceC28593a2;
                        c28676v1 = c28676v0;
                        c2306l = null;
                        a aVar = new a(interfaceC28601c1, viewState, function3, interfaceC28593a1, interfaceC28593a3, null);
                        interfaceC28601c2 = interfaceC28601c1;
                        viewState = viewState;
                        c28655q.m87172p0(aVar);
                        objM87133R5 = aVar;
                    } else {
                        c28676v1 = c28676v0;
                        interfaceC28601c2 = interfaceC28601c1;
                        interfaceC28593a3 = interfaceC28593a2;
                        c2306l = null;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), c2306l, 3);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * 8), C2299e.f9110M, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3427x);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    function4 = function3;
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
                    List<C27639i> listM83451e = viewState.m83451e();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM83451e, 10));
                    it3 = listM83451e.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new C33223u0(((C27639i) it3.next()).getNameDisplay(), null, 2, null));
                    }
                    boolean zM87157i2 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(interfaceC28593a3);
                    if (i19 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i2 | z14;
                    Object objM87133R7 = c28655q.m87133R();
                    if (!z15 || objM87133R7 == c28676v1) {
                        function5 = function4;
                        f13 = 1.0f;
                        c1040r = new C1040r(viewState, interfaceC28601c2, function5, interfaceC28593a1, interfaceC28593a3, 27, false);
                        c28655q.m87172p0(c1040r);
                    } else {
                        c1040r = objM87133R7;
                        f13 = 1.0f;
                        function5 = function4;
                    }
                    Function1 function6 = (Function1) c1040r;
                    Modifier modifier5 = modifier4;
                    AbstractC33231x0.m105420e(arrayList, iIntValue, null, null, function6, c28655q, 0, 12);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(f13, c2314t);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    heightPickerState3 = c27638h.getHeightPickerState();
                    c23000t1 = C23000t1.f90727a;
                    if (heightPickerState3 == null) {
                        c28655q.m87150e0(1270117372);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1270117373);
                        heightLabel = c27638h.getHeightLabel();
                        if (heightLabel == null) {
                            heightLabel = "";
                        }
                        m83434x(c23000t1, heightLabel, AbstractC37817c.m121344e(-1245729322, c28655q, new C2032u((Object) heightPickerState3, (Object) interfaceC28593a1, function5, (Object) interfaceC28601c2, 29)), c28655q, 390);
                        c28655q.m87173q(false);
                    }
                    weightPickerState3 = c27638h.getWeightPickerState();
                    if (weightPickerState3 == null) {
                        c28655q.m87150e0(1271576852);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1271576853);
                        String weightLabel = c27638h.getWeightLabel();
                        m83434x(c23000t1, weightLabel != null ? weightLabel : "", AbstractC37817c.m121344e(1529039260, c28655q, new C27632b(weightPickerState3, interfaceC28593a3, function5, interfaceC28601c2, 0)), c28655q, 390);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                    function2 = function5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C25002h(i13, i14, 28, modifier3, function2, c27638h);
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
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C27266m(26);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function3 = (Function1) objM87133R6;
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
                heightPickerState = viewState.getHeightPickerState();
                if (heightPickerState != null) {
                    numValueOf = Integer.valueOf(heightPickerState.getHeightInCentimeters());
                } else {
                    numValueOf = null;
                }
                zM87153g = c28655q.m87153g(numValueOf);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    heightPickerState2 = viewState.getHeightPickerState();
                    if (heightPickerState2 != null) {
                        heightInCentimeters = heightPickerState2.getHeightInCentimeters();
                    } else {
                        heightInCentimeters = 0;
                    }
                    objM87133R2 = AbstractC31061c.m95646v(heightInCentimeters, c28655q);
                } else {
                    heightPickerState2 = viewState.getHeightPickerState();
                    if (heightPickerState2 != null) {
                        heightInCentimeters = heightPickerState2.getHeightInCentimeters();
                    } else {
                        heightInCentimeters = 0;
                    }
                    objM87133R2 = AbstractC31061c.m95646v(heightInCentimeters, c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                weightPickerState = viewState.getWeightPickerState();
                if (weightPickerState != null) {
                    numValueOf2 = Integer.valueOf(weightPickerState.getWeightInPounds());
                } else {
                    numValueOf2 = null;
                }
                zM87153g2 = c28655q.m87153g(numValueOf2);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g2) {
                    weightPickerState2 = viewState.getWeightPickerState();
                    if (weightPickerState2 != null) {
                        weightInPounds = weightPickerState2.getWeightInPounds();
                    } else {
                        weightInPounds = 0;
                    }
                    objM87133R3 = AbstractC31061c.m95646v(weightInPounds, c28655q);
                } else {
                    weightPickerState2 = viewState.getWeightPickerState();
                    if (weightPickerState2 != null) {
                        weightInPounds = weightPickerState2.getWeightInPounds();
                    } else {
                        weightInPounds = 0;
                    }
                    objM87133R3 = AbstractC31061c.m95646v(weightInPounds, c28655q);
                }
                interfaceC28593a2 = (InterfaceC28593a1) objM87133R3;
                zM87153g3 = c28655q.m87153g(viewState.m83451e()) | c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
                objM87133R4 = c28655q.m87133R();
                if (zM87153g3) {
                    it = viewState.m83451e().iterator();
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
                    objM87133R4 = Integer.valueOf(i18);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    it = viewState.m83451e().iterator();
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
                    objM87133R4 = Integer.valueOf(i18);
                    c28655q.m87172p0(objM87133R4);
                }
                int iIntValue2 = ((Number) objM87133R4).intValue();
                boolean zM87157i3 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(interfaceC28593a2);
                i19 = i15 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87153g4 = z13 | zM87157i3 | c28655q.m87153g(interfaceC28601c1);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g4) {
                    interfaceC28593a3 = interfaceC28593a2;
                    c28676v1 = c28676v0;
                    c2306l = null;
                    a aVar2 = new a(interfaceC28601c1, viewState, function3, interfaceC28593a1, interfaceC28593a3, null);
                    interfaceC28601c2 = interfaceC28601c1;
                    viewState = viewState;
                    c28655q.m87172p0(aVar2);
                    objM87133R5 = aVar2;
                } else {
                    interfaceC28593a3 = interfaceC28593a2;
                    c28676v1 = c28676v0;
                    c2306l = null;
                    a aVar3 = new a(interfaceC28601c1, viewState, function3, interfaceC28593a1, interfaceC28593a3, null);
                    interfaceC28601c2 = interfaceC28601c1;
                    viewState = viewState;
                    c28655q.m87172p0(aVar3);
                    objM87133R5 = aVar3;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), c2306l, 3);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * 8), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3427x2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                function4 = function3;
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
                List<C27639i> listM83451e2 = viewState.m83451e();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM83451e2, 10));
                it3 = listM83451e2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C33223u0(((C27639i) it3.next()).getNameDisplay(), null, 2, null));
                }
                boolean zM87157i4 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(interfaceC28593a3);
                if (i19 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i4 | z14;
                Object objM87133R8 = c28655q.m87133R();
                if (z15) {
                    function5 = function4;
                    f13 = 1.0f;
                    c1040r = new C1040r(viewState, interfaceC28601c2, function5, interfaceC28593a1, interfaceC28593a3, 27, false);
                    c28655q.m87172p0(c1040r);
                } else {
                    function5 = function4;
                    f13 = 1.0f;
                    c1040r = new C1040r(viewState, interfaceC28601c2, function5, interfaceC28593a1, interfaceC28593a3, 27, false);
                    c28655q.m87172p0(c1040r);
                }
                Function1 function7 = (Function1) c1040r;
                Modifier modifier6 = modifier4;
                AbstractC33231x0.m105420e(arrayList, iIntValue2, null, null, function7, c28655q, 0, 12);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(f13, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                heightPickerState3 = c27638h.getHeightPickerState();
                c23000t1 = C23000t1.f90727a;
                if (heightPickerState3 == null) {
                    c28655q.m87150e0(1270117372);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1270117373);
                    heightLabel = c27638h.getHeightLabel();
                    if (heightLabel == null) {
                        heightLabel = "";
                    }
                    m83434x(c23000t1, heightLabel, AbstractC37817c.m121344e(-1245729322, c28655q, new C2032u((Object) heightPickerState3, (Object) interfaceC28593a1, function5, (Object) interfaceC28601c2, 29)), c28655q, 390);
                    c28655q.m87173q(false);
                }
                weightPickerState3 = c27638h.getWeightPickerState();
                if (weightPickerState3 == null) {
                    c28655q.m87150e0(1271576852);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1271576853);
                    String weightLabel2 = c27638h.getWeightLabel();
                    m83434x(c23000t1, weightLabel2 != null ? weightLabel2 : "", AbstractC37817c.m121344e(1529039260, c28655q, new C27632b(weightPickerState3, interfaceC28593a3, function5, interfaceC28601c2, 0)), c28655q, 390);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier6;
                function2 = function5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 28, modifier3, function2, c27638h);
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
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C27266m(26);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function3 = (Function1) objM87133R6;
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
                heightPickerState = viewState.getHeightPickerState();
                if (heightPickerState != null) {
                    numValueOf = Integer.valueOf(heightPickerState.getHeightInCentimeters());
                } else {
                    numValueOf = null;
                }
                zM87153g = c28655q.m87153g(numValueOf);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    heightPickerState2 = viewState.getHeightPickerState();
                    if (heightPickerState2 != null) {
                        heightInCentimeters = heightPickerState2.getHeightInCentimeters();
                    } else {
                        heightInCentimeters = 0;
                    }
                    objM87133R2 = AbstractC31061c.m95646v(heightInCentimeters, c28655q);
                } else {
                    heightPickerState2 = viewState.getHeightPickerState();
                    if (heightPickerState2 != null) {
                        heightInCentimeters = heightPickerState2.getHeightInCentimeters();
                    } else {
                        heightInCentimeters = 0;
                    }
                    objM87133R2 = AbstractC31061c.m95646v(heightInCentimeters, c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                weightPickerState = viewState.getWeightPickerState();
                if (weightPickerState != null) {
                    numValueOf2 = Integer.valueOf(weightPickerState.getWeightInPounds());
                } else {
                    numValueOf2 = null;
                }
                zM87153g2 = c28655q.m87153g(numValueOf2);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g2) {
                    weightPickerState2 = viewState.getWeightPickerState();
                    if (weightPickerState2 != null) {
                        weightInPounds = weightPickerState2.getWeightInPounds();
                    } else {
                        weightInPounds = 0;
                    }
                    objM87133R3 = AbstractC31061c.m95646v(weightInPounds, c28655q);
                } else {
                    weightPickerState2 = viewState.getWeightPickerState();
                    if (weightPickerState2 != null) {
                        weightInPounds = weightPickerState2.getWeightInPounds();
                    } else {
                        weightInPounds = 0;
                    }
                    objM87133R3 = AbstractC31061c.m95646v(weightInPounds, c28655q);
                }
                interfaceC28593a2 = (InterfaceC28593a1) objM87133R3;
                zM87153g3 = c28655q.m87153g(viewState.m83451e()) | c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
                objM87133R4 = c28655q.m87133R();
                if (zM87153g3) {
                    it = viewState.m83451e().iterator();
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
                    objM87133R4 = Integer.valueOf(i18);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    it = viewState.m83451e().iterator();
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
                    objM87133R4 = Integer.valueOf(i18);
                    c28655q.m87172p0(objM87133R4);
                }
                int iIntValue3 = ((Number) objM87133R4).intValue();
                boolean zM87157i5 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(interfaceC28593a2);
                i19 = i15 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87153g4 = z13 | zM87157i5 | c28655q.m87153g(interfaceC28601c1);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g4) {
                    interfaceC28593a3 = interfaceC28593a2;
                    c28676v1 = c28676v0;
                    c2306l = null;
                    a aVar4 = new a(interfaceC28601c1, viewState, function3, interfaceC28593a1, interfaceC28593a3, null);
                    interfaceC28601c2 = interfaceC28601c1;
                    viewState = viewState;
                    c28655q.m87172p0(aVar4);
                    objM87133R5 = aVar4;
                } else {
                    interfaceC28593a3 = interfaceC28593a2;
                    c28676v1 = c28676v0;
                    c2306l = null;
                    a aVar5 = new a(interfaceC28601c1, viewState, function3, interfaceC28593a1, interfaceC28593a3, null);
                    interfaceC28601c2 = interfaceC28601c1;
                    viewState = viewState;
                    c28655q.m87172p0(aVar5);
                    objM87133R5 = aVar5;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                Modifier modifierM3427x3 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), c2306l, 3);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * 8), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3427x3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                function4 = function3;
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
                List<C27639i> listM83451e3 = viewState.m83451e();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM83451e3, 10));
                it3 = listM83451e3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C33223u0(((C27639i) it3.next()).getNameDisplay(), null, 2, null));
                }
                boolean zM87157i6 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(interfaceC28593a3);
                if (i19 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i6 | z14;
                Object objM87133R9 = c28655q.m87133R();
                if (z15) {
                    function5 = function4;
                    f13 = 1.0f;
                    c1040r = new C1040r(viewState, interfaceC28601c2, function5, interfaceC28593a1, interfaceC28593a3, 27, false);
                    c28655q.m87172p0(c1040r);
                } else {
                    function5 = function4;
                    f13 = 1.0f;
                    c1040r = new C1040r(viewState, interfaceC28601c2, function5, interfaceC28593a1, interfaceC28593a3, 27, false);
                    c28655q.m87172p0(c1040r);
                }
                Function1 function8 = (Function1) c1040r;
                Modifier modifier7 = modifier4;
                AbstractC33231x0.m105420e(arrayList, iIntValue3, null, null, function8, c28655q, 0, 12);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(f13, c2314t);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                heightPickerState3 = c27638h.getHeightPickerState();
                c23000t1 = C23000t1.f90727a;
                if (heightPickerState3 == null) {
                    c28655q.m87150e0(1270117372);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1270117373);
                    heightLabel = c27638h.getHeightLabel();
                    if (heightLabel == null) {
                        heightLabel = "";
                    }
                    m83434x(c23000t1, heightLabel, AbstractC37817c.m121344e(-1245729322, c28655q, new C2032u((Object) heightPickerState3, (Object) interfaceC28593a1, function5, (Object) interfaceC28601c2, 29)), c28655q, 390);
                    c28655q.m87173q(false);
                }
                weightPickerState3 = c27638h.getWeightPickerState();
                if (weightPickerState3 == null) {
                    c28655q.m87150e0(1271576852);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1271576853);
                    String weightLabel3 = c27638h.getWeightLabel();
                    m83434x(c23000t1, weightLabel3 != null ? weightLabel3 : "", AbstractC37817c.m121344e(1529039260, c28655q, new C27632b(weightPickerState3, interfaceC28593a3, function5, interfaceC28601c2, 0)), c28655q, 390);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier7;
                function2 = function5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 28, modifier3, function2, c27638h);
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
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C27266m(26);
                    c28655q.m87172p0(objM87133R6);
                }
                function3 = (Function1) objM87133R6;
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
            heightPickerState = viewState.getHeightPickerState();
            if (heightPickerState != null) {
                numValueOf = Integer.valueOf(heightPickerState.getHeightInCentimeters());
            } else {
                numValueOf = null;
            }
            zM87153g = c28655q.m87153g(numValueOf);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                heightPickerState2 = viewState.getHeightPickerState();
                if (heightPickerState2 != null) {
                    heightInCentimeters = heightPickerState2.getHeightInCentimeters();
                } else {
                    heightInCentimeters = 0;
                }
                objM87133R2 = AbstractC31061c.m95646v(heightInCentimeters, c28655q);
            } else {
                heightPickerState2 = viewState.getHeightPickerState();
                if (heightPickerState2 != null) {
                    heightInCentimeters = heightPickerState2.getHeightInCentimeters();
                } else {
                    heightInCentimeters = 0;
                }
                objM87133R2 = AbstractC31061c.m95646v(heightInCentimeters, c28655q);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
            weightPickerState = viewState.getWeightPickerState();
            if (weightPickerState != null) {
                numValueOf2 = Integer.valueOf(weightPickerState.getWeightInPounds());
            } else {
                numValueOf2 = null;
            }
            zM87153g2 = c28655q.m87153g(numValueOf2);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g2) {
                weightPickerState2 = viewState.getWeightPickerState();
                if (weightPickerState2 != null) {
                    weightInPounds = weightPickerState2.getWeightInPounds();
                } else {
                    weightInPounds = 0;
                }
                objM87133R3 = AbstractC31061c.m95646v(weightInPounds, c28655q);
            } else {
                weightPickerState2 = viewState.getWeightPickerState();
                if (weightPickerState2 != null) {
                    weightInPounds = weightPickerState2.getWeightInPounds();
                } else {
                    weightInPounds = 0;
                }
                objM87133R3 = AbstractC31061c.m95646v(weightInPounds, c28655q);
            }
            interfaceC28593a2 = (InterfaceC28593a1) objM87133R3;
            zM87153g3 = c28655q.m87153g(viewState.m83451e()) | c28655q.m87149e(viewState.getDefaultUnitSystem().ordinal());
            objM87133R4 = c28655q.m87133R();
            if (zM87153g3) {
                it = viewState.m83451e().iterator();
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
                objM87133R4 = Integer.valueOf(i18);
                c28655q.m87172p0(objM87133R4);
            } else {
                it = viewState.m83451e().iterator();
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
                objM87133R4 = Integer.valueOf(i18);
                c28655q.m87172p0(objM87133R4);
            }
            int iIntValue4 = ((Number) objM87133R4).intValue();
            boolean zM87157i7 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(interfaceC28593a2);
            i19 = i15 & 896;
            if (i19 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87153g4 = z13 | zM87157i7 | c28655q.m87153g(interfaceC28601c1);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g4) {
                interfaceC28593a3 = interfaceC28593a2;
                c28676v1 = c28676v0;
                c2306l = null;
                a aVar6 = new a(interfaceC28601c1, viewState, function3, interfaceC28593a1, interfaceC28593a3, null);
                interfaceC28601c2 = interfaceC28601c1;
                viewState = viewState;
                c28655q.m87172p0(aVar6);
                objM87133R5 = aVar6;
            } else {
                interfaceC28593a3 = interfaceC28593a2;
                c28676v1 = c28676v0;
                c2306l = null;
                a aVar7 = new a(interfaceC28601c1, viewState, function3, interfaceC28593a1, interfaceC28593a3, null);
                interfaceC28601c2 = interfaceC28601c1;
                viewState = viewState;
                c28655q.m87172p0(aVar7);
                objM87133R5 = aVar7;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
            Modifier modifierM3427x4 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), c2306l, 3);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * 8), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3427x4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            function4 = function3;
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
            List<C27639i> listM83451e4 = viewState.m83451e();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM83451e4, 10));
            it3 = listM83451e4.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C33223u0(((C27639i) it3.next()).getNameDisplay(), null, 2, null));
            }
            boolean zM87157i8 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(interfaceC28593a3);
            if (i19 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i8 | z14;
            Object objM87133R10 = c28655q.m87133R();
            if (z15) {
                function5 = function4;
                f13 = 1.0f;
                c1040r = new C1040r(viewState, interfaceC28601c2, function5, interfaceC28593a1, interfaceC28593a3, 27, false);
                c28655q.m87172p0(c1040r);
            } else {
                function5 = function4;
                f13 = 1.0f;
                c1040r = new C1040r(viewState, interfaceC28601c2, function5, interfaceC28593a1, interfaceC28593a3, 27, false);
                c28655q.m87172p0(c1040r);
            }
            Function1 function9 = (Function1) c1040r;
            Modifier modifier8 = modifier4;
            AbstractC33231x0.m105420e(arrayList, iIntValue4, null, null, function9, c28655q, 0, 12);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(f13, c2314t);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            heightPickerState3 = c27638h.getHeightPickerState();
            c23000t1 = C23000t1.f90727a;
            if (heightPickerState3 == null) {
                c28655q.m87150e0(1270117372);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1270117373);
                heightLabel = c27638h.getHeightLabel();
                if (heightLabel == null) {
                    heightLabel = "";
                }
                m83434x(c23000t1, heightLabel, AbstractC37817c.m121344e(-1245729322, c28655q, new C2032u((Object) heightPickerState3, (Object) interfaceC28593a1, function5, (Object) interfaceC28601c2, 29)), c28655q, 390);
                c28655q.m87173q(false);
            }
            weightPickerState3 = c27638h.getWeightPickerState();
            if (weightPickerState3 == null) {
                c28655q.m87150e0(1271576852);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1271576853);
                String weightLabel4 = c27638h.getWeightLabel();
                m83434x(c23000t1, weightLabel4 != null ? weightLabel4 : "", AbstractC37817c.m121344e(1529039260, c28655q, new C27632b(weightPickerState3, interfaceC28593a3, function5, interfaceC28601c2, 0)), c28655q, 390);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier8;
            function2 = function5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 28, modifier3, function2, c27638h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m83420j(C27638h c27638h, Function1 function1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28593a1 interfaceC28593a2, UnitSystem unitSystem) {
        Object next;
        String id4;
        String stateUpdateUnitKey = c27638h.getStateUpdateUnitKey();
        Object c27636f = null;
        if (stateUpdateUnitKey != null) {
            C26463f c26463f = new C26463f();
            Iterator<T> it = c27638h.m83451e().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (UnitSystemExtKt.unitSystemFromString(((C27639i) next).getId()) != unitSystem);
            C27639i c27639i = (C27639i) next;
            if (c27639i != null && (id4 = c27639i.getId()) != null) {
            }
            C11505c heightPickerState = c27638h.getHeightPickerState();
            if (heightPickerState != null) {
                c26463f.putAll(((StateUpdateAction) heightPickerState.getStateUpdate().invoke(Integer.valueOf(m83430t(interfaceC28593a1)), unitSystem)).getState());
            }
            C32194b weightPickerState = c27638h.getWeightPickerState();
            if (weightPickerState != null) {
                c26463f.putAll(((StateUpdateAction) weightPickerState.getStateUpdate().invoke(Integer.valueOf(m83432v(interfaceC28593a2)), unitSystem)).getState());
            }
            c27636f = new DesignItemInteraction(new StateUpdateAction((Map) c26463f.m78380b(), false, 2, (DefaultConstructorMarker) null), null);
        } else if (c27638h.getHeightPickerState() != null && c27638h.getWeightPickerState() != null) {
            c27636f = new C27635e(m83430t(interfaceC28593a1), m83432v(interfaceC28593a2), unitSystem);
        } else if (c27638h.getHeightPickerState() != null) {
            c27636f = new C27634d(m83430t(interfaceC28593a1), unitSystem);
        } else if (c27638h.getWeightPickerState() != null) {
            c27636f = new C27636f(m83432v(interfaceC28593a2), unitSystem);
        }
        if (c27636f != null) {
            function1.invoke(c27636f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m83421k(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m83422l(C27638h c27638h, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28593a1 interfaceC28593a2, int i13) {
        UnitSystem unitSystemUnitSystemFromString = UnitSystemExtKt.unitSystemFromString(c27638h.m83451e().get(i13).getId());
        if (unitSystemUnitSystemFromString != null) {
            m83429s(interfaceC28601c1, unitSystemUnitSystemFromString);
            m83420j(c27638h, function1, interfaceC28593a1, interfaceC28593a2, unitSystemUnitSystemFromString);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m83423m(C11505c c11505c, InterfaceC28593a1 interfaceC28593a1, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C11509g c11509g = new C11509g(m83428r(interfaceC28601c1), m83430t(interfaceC28593a1), c11505c.getFeetRange(), c11505c.getCentimetersRange(), c11505c.getFeetLabel(), c11505c.getInchesLabel(), c11505c.getCentimetersLabel());
            boolean zM87153g = c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(function1) | c28655q.m87157i(c11505c) | c28655q.m87153g(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C21881l((Object) function1, (Object) c11505c, (Object) interfaceC28593a1, interfaceC28601c1, 17);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC11508f.m30953e(c11509g, (Function1) objM87133R, null, 0.0f, null, false, c28655q, 0, 60);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m83424n(Function1 function1, C11505c c11505c, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        m83431u(interfaceC28593a1, i13);
        function1.invoke(c11505c.getStateUpdateHeightKey() != null ? new DesignItemInteraction(c11505c.getStateUpdate().invoke(Integer.valueOf(i13), m83428r(interfaceC28601c1)), null) : new C27634d(i13, m83428r(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m83425o(C32194b c32194b, InterfaceC28593a1 interfaceC28593a1, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C32196d c32196d = new C32196d(m83428r(interfaceC28601c1), m83432v(interfaceC28593a1), c32194b.getPoundsRange(), c32194b.getKilogramsRange(), c32194b.getPoundsLabel(), c32194b.getKilogramsLabel());
            boolean zM87153g = c28655q.m87153g(interfaceC28593a1) | c28655q.m87153g(function1) | c28655q.m87157i(c32194b) | c28655q.m87153g(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                C21881l c21881l = new C21881l((Object) function1, (Object) c32194b, (Object) interfaceC28593a1, interfaceC28601c1, 16);
                c28655q.m87172p0(c21881l);
                objM87133R = c21881l;
            }
            AbstractC32195c.m100133d(c32196d, (Function1) objM87133R, null, 0.0f, null, false, c28655q, 0, 60);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m83426p(Function1 function1, C32194b c32194b, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        m83433w(interfaceC28593a1, i13);
        function1.invoke(c32194b.getStateUpdateWeightKey() != null ? new DesignItemInteraction(c32194b.getStateUpdate().invoke(Integer.valueOf(i13), m83428r(interfaceC28601c1)), null) : new C27636f(i13, m83428r(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m83427q(C27638h c27638h, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m83419i(c27638h, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final UnitSystem m83428r(InterfaceC28601c1 interfaceC28601c1) {
        return (UnitSystem) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m83429s(InterfaceC28601c1 interfaceC28601c1, UnitSystem unitSystem) {
        interfaceC28601c1.setValue(unitSystem);
    }

    /* JADX INFO: renamed from: t */
    private static final int m83430t(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: u */
    private static final void m83431u(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: v */
    private static final int m83432v(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: w */
    private static final void m83433w(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: x */
    private static final void m83434x(InterfaceC22997s1 interfaceC22997s1, String str, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        String str2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-568510360);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            str2 = str;
            i14 |= c28655q2.m87153g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4351m) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierMo66772c = interfaceC22997s1.mo66772c(C2314t.f9131w, true, 1.0f);
            C2305k c2305k = C2299e.f9111N;
            C23010x c23010xM73381n = AbstractC25012a.m73381n(1, 8, c2305k, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo66772c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(c2305k);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(str2, horizontalAlignElement, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH5(), null, c28655q2, (i14 >> 3) & 14, 0, 196600);
            c28655q = c28655q2;
            AbstractC11895b.m32007z((i14 >> 6) & 14, interfaceC4351m, c28655q, true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) interfaceC22997s1, str, (InterfaceC23459e) interfaceC4351m, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m83435y(InterfaceC22997s1 interfaceC22997s1, String str, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m83434x(interfaceC22997s1, str, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

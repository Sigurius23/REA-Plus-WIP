package h90;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import d21.AbstractC11508f;
import d21.C11509g;
import fc0.C14361e;
import fc0.C14362f;
import gb1.AbstractC15676d;
import gf1.C15786e;
import h00.C16513l0;
import h02.C16576i;
import i93.C18284j;
import j80.InterfaceC21413a;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13921a0;
import p178gz.C16283a;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
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
import p571w3.C36775k;
import p714k80.AbstractC22288q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s41.AbstractC32195c;
import s41.C32196d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h90.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lh90/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Lh90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/domain/model/UnitSystem;", "selectedUnit", "onUnitSelected", "x", "(Lh90/c;Lcom/whoop/domain/model/UnitSystem;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "G", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "selectedCentimeters", "selectedPounds", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17024b {

    /* JADX INFO: renamed from: h90.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.heightandweight.HeightAndWeightScreenKt$HeightAndWeightScreenView$2$1", m100430f = "HeightAndWeightScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65440w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f65441x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28593a1 f65442y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f65443z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f65441x = function1;
            this.f65442y = interfaceC28593a1;
            this.f65443z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f65441x, this.f65442y, this.f65443z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f65440w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f65441x.invoke(new InterfaceC21413a.v0(AbstractC17024b.m48038v(this.f65442y), AbstractC17024b.m48034r(this.f65443z)));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h90.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.heightandweight.HeightAndWeightScreenKt$HeightAndWeightScreenView$3$1", m100430f = "HeightAndWeightScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65444w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f65445x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28593a1 f65446y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f65447z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f65445x = function1;
            this.f65446y = interfaceC28593a1;
            this.f65447z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f65445x, this.f65446y, this.f65447z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f65444w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f65445x.invoke(new InterfaceC21413a.b0(AbstractC17024b.m48036t(this.f65446y), AbstractC17024b.m48034r(this.f65447z)));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h90.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.heightandweight.HeightAndWeightScreenKt$HeightAndWeightScreenView$4$1", m100430f = "HeightAndWeightScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28593a1 f65448E;

        /* JADX INFO: renamed from: w */
        int f65449w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f65450x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28593a1 f65451y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f65452z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28593a1 interfaceC28593a2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f65450x = function1;
            this.f65451y = interfaceC28593a1;
            this.f65452z = interfaceC28601c1;
            this.f65448E = interfaceC28593a2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f65450x, this.f65451y, this.f65452z, this.f65448E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f65449w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f65450x.invoke(new InterfaceC21413a.v0(AbstractC17024b.m48038v(this.f65451y), AbstractC17024b.m48034r(this.f65452z)));
            this.f65450x.invoke(new InterfaceC21413a.b0(AbstractC17024b.m48036t(this.f65448E), AbstractC17024b.m48034r(this.f65452z)));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m48009A(Function1 function1) {
        function1.invoke(UnitSystem.METRIC);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Modifier m48010B(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return m48015G(applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m48011C(C17025c c17025c, UnitSystem unitSystem, Function1 function1, int i13, Composer composer, int i14) {
        m48040x(c17025c, unitSystem, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final Modifier m48015G(Modifier modifier) {
        return AbstractC37056f.m118997u(modifier, new C15786e(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final Modifier m48016H(Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1266238744);
        Modifier modifierMo3471e = composed.mo3471e(AbstractC1099a.m3396r(AbstractC11895b.m31987f(1, 4, C2314t.f9131w, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10()), 0.0f, 2 * 8, 1));
        c28655q.m87173q(false);
        return modifierMo3471e;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0253  */
    /* JADX WARN: Code duplicated, block: B:105:0x027e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0284  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:115:0x036a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0394  */
    /* JADX WARN: Code duplicated, block: B:122:0x039d  */
    /* JADX WARN: Code duplicated, block: B:123:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:138:0x0476  */
    /* JADX WARN: Code duplicated, block: B:140:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code duplicated, block: B:81:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0216  */
    /* JADX WARN: Code duplicated, block: B:93:0x0231  */
    /* JADX WARN: Code duplicated, block: B:97:0x0243  */
    /* JADX INFO: renamed from: l */
    public static final void m48028l(C17025c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28593a1 interfaceC28593a1;
        Object objM87133R3;
        InterfaceC28593a1 interfaceC28593a2;
        int i16;
        boolean z13;
        Object objM87133R4;
        boolean z14;
        Object objM87133R5;
        boolean z15;
        Object objM87133R6;
        InterfaceC28593a1 interfaceC28593a3;
        InterfaceC28601c1 interfaceC28601c2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R7;
        int iHashCode2;
        float f13;
        int iHashCode3;
        InterfaceC28593a1 interfaceC28593a4;
        Object objM87133R8;
        float f14;
        int iHashCode4;
        Object objM87133R9;
        Object objM87133R10;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(866684596);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
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
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C16513l0(29);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function4 = (Function1) objM87133R10;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getUnitSystem());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(viewState.getPreselectedCentimeters(), c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC31061c.m95646v(viewState.getPreselectedPounds(), c28655q);
                }
                interfaceC28593a2 = (InterfaceC28593a1) objM87133R3;
                Integer numValueOf = Integer.valueOf(m48038v(interfaceC28593a2));
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13 || objM87133R4 == c28676v0) {
                    objM87133R4 = new a(function4, interfaceC28593a2, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, numValueOf);
                Integer numValueOf2 = Integer.valueOf(m48036t(interfaceC28593a1));
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z14 || objM87133R5 == c28676v0) {
                    objM87133R5 = new b(function4, interfaceC28593a1, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf2);
                UnitSystem unitSystemM48034r = m48034r(interfaceC28601c1);
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (!z15 || objM87133R6 == c28676v0) {
                    interfaceC28593a3 = interfaceC28593a1;
                    c cVar = new c(function4, interfaceC28593a2, interfaceC28601c1, interfaceC28593a3, null);
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q.m87172p0(cVar);
                    objM87133R6 = cVar;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    interfaceC28593a3 = interfaceC28593a1;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, unitSystemM48034r);
                C2314t c2314t = C2314t.f9131w;
                float f15 = 8;
                float f16 = 2 * f15;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f16, 7 * f15, f16, 0.0f, 8), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                AbstractC22403o abstractC22403oM48053l = viewState.getImage();
                TextResource textResourceM48059r = viewState.getTitle();
                String strM48058q = viewState.getSubtitle();
                int i18 = AbstractC22403o.f87638a;
                int i19 = TextResource.$stable;
                int i24 = i15;
                AbstractC22288q.m64032b(abstractC22403oM48053l, textResourceM48059r, strM48058q, c28655q, i18 | (i19 << 3), 0);
                UnitSystem unitSystemM48034r2 = m48034r(interfaceC28601c2);
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C13921a0(19, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R7);
                }
                m48040x(viewState, unitSystemM48034r2, (Function1) objM87133R7, c28655q, i19 | i18 | i19 | i19 | i19 | i19 | 384 | (i24 & 14));
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                C2305k c2305k = C2299e.f9111N;
                float f17 = 1 * f15;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), c2305k, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
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
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(c2305k);
                String strM21274h = AbstractC8693b.m21274h(viewState.getHeightTitle(), c28655q, i19);
                C38072d c38072d = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                C2886a c2886aM8438s = c38072d.m121952e(c28655q, i25).getH5();
                long jM125382b1 = c38072d.m121949b(c28655q, i25).getWhite50();
                int i26 = C2886a.f11498d << 18;
                InterfaceC28601c1 interfaceC28601c3 = interfaceC28601c2;
                interfaceC28593a4 = interfaceC28593a3;
                AbstractC30795n.m94707h(strM21274h, horizontalAlignElement, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q, 0, i26, 196600);
                C11509g c11509g = new C11509g(m48034r(interfaceC28601c3), m48036t(interfaceC28593a4), new C18284j(viewState.getHeightFeetMin(), viewState.getHeightFeetMax(), 1), new C18284j(viewState.getHeightCentimetersMin(), viewState.getHeightCentimetersMax(), 1), viewState.getHeightFeetLabel(), viewState.getHeightInchesLabel(), viewState.getHeightCentimetersLabel());
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C14362f(interfaceC28593a4, 2);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC11508f.m30953e(c11509g, (Function1) objM87133R8, null, 0.0f, null, false, c28655q, C11509g.f37027h | 48, 60);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f14, true);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), c2305k, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getWeightTitle(), c28655q, i19), new HorizontalAlignElement(c2305k), c38072d.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getH5(), null, c28655q, 0, i26, 196600);
                C32196d c32196d = new C32196d(m48034r(interfaceC28601c3), m48038v(interfaceC28593a2), new C18284j(viewState.getWeightPoundsMin(), viewState.getWeightPoundsMax(), 1), new C18284j(viewState.getWeightKilogramsMin(), viewState.getWeightKilogramsMax(), 1), viewState.getWeightPoundsLabel(), viewState.getWeightKilogramsLabel());
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C14362f(interfaceC28593a2, 3);
                    c28655q.m87172p0(objM87133R9);
                }
                c28655q = c28655q;
                AbstractC32195c.m100133d(c32196d, (Function1) objM87133R9, null, 0.0f, null, false, c28655q, C32196d.f133326g | 48, 60);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t, 0, 13 * f15)));
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(viewState, i13, function3, i14, 18);
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
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C16513l0(29);
                    c28655q.m87172p0(objM87133R10);
                }
                function4 = (Function1) objM87133R10;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(viewState.getUnitSystem());
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95646v(viewState.getPreselectedCentimeters(), c28655q);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC31061c.m95646v(viewState.getPreselectedPounds(), c28655q);
            }
            interfaceC28593a2 = (InterfaceC28593a1) objM87133R3;
            Integer numValueOf3 = Integer.valueOf(m48038v(interfaceC28593a2));
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z13) {
                objM87133R4 = new a(function4, interfaceC28593a2, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(function4, interfaceC28593a2, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, numValueOf3);
            Integer numValueOf4 = Integer.valueOf(m48036t(interfaceC28593a1));
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R5 = c28655q.m87133R();
            if (z14) {
                objM87133R5 = new b(function4, interfaceC28593a1, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new b(function4, interfaceC28593a1, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf4);
            UnitSystem unitSystemM48034r3 = m48034r(interfaceC28601c1);
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R6 = c28655q.m87133R();
            if (z15) {
                interfaceC28593a3 = interfaceC28593a1;
                c cVar2 = new c(function4, interfaceC28593a2, interfaceC28601c1, interfaceC28593a3, null);
                interfaceC28601c2 = interfaceC28601c1;
                c28655q.m87172p0(cVar2);
                objM87133R6 = cVar2;
            } else {
                interfaceC28593a3 = interfaceC28593a1;
                c cVar3 = new c(function4, interfaceC28593a2, interfaceC28601c1, interfaceC28593a3, null);
                interfaceC28601c2 = interfaceC28601c1;
                c28655q.m87172p0(cVar3);
                objM87133R6 = cVar3;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, unitSystemM48034r3);
            C2314t c2314t2 = C2314t.f9131w;
            float f18 = 8;
            float f19 = 2 * f18;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t2), f19, 7 * f18, f19, 0.0f, 8), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            AbstractC22403o abstractC22403oM48053l2 = viewState.getImage();
            TextResource textResourceM48059r2 = viewState.getTitle();
            String strM48058q2 = viewState.getSubtitle();
            int i110 = AbstractC22403o.f87638a;
            int i111 = TextResource.$stable;
            int i27 = i15;
            AbstractC22288q.m64032b(abstractC22403oM48053l2, textResourceM48059r2, strM48058q2, c28655q, i110 | (i111 << 3), 0);
            UnitSystem unitSystemM48034r4 = m48034r(interfaceC28601c2);
            objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C13921a0(19, interfaceC28601c2);
                c28655q.m87172p0(objM87133R7);
            }
            m48040x(viewState, unitSystemM48034r4, (Function1) objM87133R7, c28655q, i111 | i110 | i111 | i111 | i111 | i111 | 384 | (i27 & 14));
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f13, true);
            C2305k c2305k2 = C2299e.f9111N;
            float f110 = 1 * f18;
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f110), c2305k2, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a5);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
            HorizontalAlignElement horizontalAlignElement2 = new HorizontalAlignElement(c2305k2);
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getHeightTitle(), c28655q, i111);
            C38072d c38072d2 = C38072d.f163053a;
            int i28 = C38072d.f163054b;
            C2886a c2886aM8438s2 = c38072d2.m121952e(c28655q, i28).getH5();
            long jM125382b2 = c38072d2.m121949b(c28655q, i28).getWhite50();
            int i29 = C2886a.f11498d << 18;
            InterfaceC28601c1 interfaceC28601c4 = interfaceC28601c2;
            interfaceC28593a4 = interfaceC28593a3;
            AbstractC30795n.m94707h(strM21274h2, horizontalAlignElement2, jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s2, null, c28655q, 0, i29, 196600);
            C11509g c11509g2 = new C11509g(m48034r(interfaceC28601c4), m48036t(interfaceC28593a4), new C18284j(viewState.getHeightFeetMin(), viewState.getHeightFeetMax(), 1), new C18284j(viewState.getHeightCentimetersMin(), viewState.getHeightCentimetersMax(), 1), viewState.getHeightFeetLabel(), viewState.getHeightInchesLabel(), viewState.getHeightCentimetersLabel());
            objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C14362f(interfaceC28593a4, 2);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC11508f.m30953e(c11509g2, (Function1) objM87133R8, null, 0.0f, null, false, c28655q, C11509g.f37027h | 48, 60);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f14 = Float.MAX_VALUE;
            } else {
                f14 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f14, true);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f110), c2305k2, c28655q, 54);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N8);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getWeightTitle(), c28655q, i111), new HorizontalAlignElement(c2305k2), c38072d2.m121949b(c28655q, i28).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i28).getH5(), null, c28655q, 0, i29, 196600);
            C32196d c32196d2 = new C32196d(m48034r(interfaceC28601c4), m48038v(interfaceC28593a2), new C18284j(viewState.getWeightPoundsMin(), viewState.getWeightPoundsMax(), 1), new C18284j(viewState.getWeightKilogramsMin(), viewState.getWeightKilogramsMax(), 1), viewState.getWeightPoundsLabel(), viewState.getWeightKilogramsLabel());
            objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new C14362f(interfaceC28593a2, 3);
                c28655q.m87172p0(objM87133R9);
            }
            c28655q = c28655q;
            AbstractC32195c.m100133d(c32196d2, (Function1) objM87133R9, null, 0.0f, null, false, c28655q, C32196d.f133326g | 48, 60);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t2, 0, 13 * f18)));
            c28655q.m87173q(true);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(viewState, i13, function3, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m48029m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m48030n(InterfaceC28601c1 interfaceC28601c1, UnitSystem it) {
        AbstractC22676k.m65750j(it, "it");
        m48035s(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m48031o(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m48037u(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m48032p(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m48039w(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m48033q(C17025c c17025c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m48028l(c17025c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final UnitSystem m48034r(InterfaceC28601c1 interfaceC28601c1) {
        return (UnitSystem) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m48035s(InterfaceC28601c1 interfaceC28601c1, UnitSystem unitSystem) {
        interfaceC28601c1.setValue(unitSystem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final int m48036t(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: u */
    private static final void m48037u(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final int m48038v(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: w */
    private static final void m48039w(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x020a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0228  */
    /* JADX WARN: Code duplicated, block: B:90:0x022a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0232  */
    /* JADX INFO: renamed from: x */
    private static final void m48040x(C17025c c17025c, UnitSystem unitSystem, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28676v0 c28676v0;
        boolean z4;
        Object objM87133R;
        C28676v0 c28676v1;
        float f13;
        boolean z13;
        Object objM87133R2;
        boolean z14;
        Object objM87133R3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1022702006);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(c17025c) : c28655q2.m87157i(c17025c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87149e(unitSystem.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R4 = c28655q2.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (objM87133R4 == c28676v2) {
                objM87133R4 = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R4;
            float f14 = 2;
            float f15 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, f14 * f15, 1);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * f15, AbstractC31061c.m95629e(modifierM3396r, f14, 4, c38072d.m121949b(c28655q2, i15).getBlack30()));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i16 = i14 & 896;
            boolean z15 = i16 == 256;
            Object objM87133R5 = c28655q2.m87133R();
            if (z15) {
                c28676v0 = c28676v2;
            } else {
                c28676v0 = c28676v2;
                if (objM87133R5 == c28676v0) {
                }
                Modifier modifierM3360e = AbstractC1092a.m3360e(layoutWeightElement, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R5, 28);
                if (unitSystem == UnitSystem.IMPERIAL) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C16513l0(27);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3360e, z4, (Function1) objM87133R);
                TextResource textResourceM48054m = c17025c.getImperialTitle();
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM48054m, c28655q2, i17);
                C2886a c2886aM8438s = c38072d.m121952e(c28655q2, i15).getH5();
                long jM125430y = c38072d.m121949b(c28655q2, i15).getBrandWhite();
                C36775k c36775k = new C36775k(3);
                int i18 = C2886a.f11498d << 18;
                c28676v1 = c28676v0;
                AbstractC30795n.m94707h(strM21274h, modifierM44099b, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q2, 0, i18, 196088);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f13, true);
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13 || objM87133R2 == c28676v1) {
                    objM87133R2 = new C16283a(function1, 11);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e2 = AbstractC1092a.m3360e(layoutWeightElement2, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28);
                if (unitSystem == UnitSystem.METRIC) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v1) {
                    objM87133R3 = new C16513l0(28);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c17025c.getMetricTitle(), c28655q2, i17), AbstractC15676d.m44099b(modifierM3360e2, z14, (Function1) objM87133R3), c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getH5(), null, c28655q2, 0, i18, 196088);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            }
            objM87133R5 = new C16283a(function1, 10);
            c28655q2.m87172p0(objM87133R5);
            Modifier modifierM3360e3 = AbstractC1092a.m3360e(layoutWeightElement, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R5, 28);
            if (unitSystem == UnitSystem.IMPERIAL) {
                z4 = true;
            } else {
                z4 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C16513l0(27);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM3360e3, z4, (Function1) objM87133R);
            TextResource textResourceM48054m2 = c17025c.getImperialTitle();
            int i19 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM48054m2, c28655q2, i19);
            C2886a c2886aM8438s2 = c38072d.m121952e(c28655q2, i15).getH5();
            long jM125430y2 = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            C36775k c36775k2 = new C36775k(3);
            int i110 = C2886a.f11498d << 18;
            c28676v1 = c28676v0;
            AbstractC30795n.m94707h(strM21274h2, modifierM44099b2, jM125430y2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8438s2, null, c28655q2, 0, i110, 196088);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f13, true);
            if (i16 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z13) {
                objM87133R2 = new C16283a(function1, 11);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C16283a(function1, 11);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3360e4 = AbstractC1092a.m3360e(layoutWeightElement3, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28);
            if (unitSystem == UnitSystem.METRIC) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v1) {
                objM87133R3 = new C16513l0(28);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c17025c.getMetricTitle(), c28655q2, i19), AbstractC15676d.m44099b(modifierM3360e4, z14, (Function1) objM87133R3), c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getH5(), null, c28655q2, 0, i110, 196088);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(c17025c, unitSystem, function1, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m48041y(Function1 function1) {
        function1.invoke(UnitSystem.IMPERIAL);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Modifier m48042z(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return m48015G(applyIf);
    }
}

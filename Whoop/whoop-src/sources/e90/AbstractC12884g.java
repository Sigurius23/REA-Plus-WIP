package e90;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c31.EnumC3921e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.Gender;
import d30.C11546l;
import d30.C11558r;
import d62.C11736b;
import e81.C12824e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j80.InterfaceC21413a;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p714k80.AbstractC22288q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x60.AbstractC38022b;
import x81.C38072d;
import yb3.AbstractC39414r;
import z80.AbstractC40180a;

/* JADX INFO: renamed from: e90.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0013²\u0006\u000e\u0010\r\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Le90/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Le90/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Le90/c;", "item", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Le90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedGender", "", "genderList", "", "showBaseLineDialog", "buttonEnabled", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12884g {

    /* JADX INFO: renamed from: e90.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.gender.GenderSelectionScreenKt$GenderSelectionScreenView$2$1", m100430f = "GenderSelectionScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f44356w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f44357x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f44358y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f44357x = function1;
            this.f44358y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f44357x, this.f44358y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f44356w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f44357x.invoke(AbstractC12884g.m36205k(this.f44358y) ? EnumC3921e.ENABLE : EnumC3921e.DISABLE);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x020e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0249  */
    /* JADX WARN: Code duplicated, block: B:82:0x024b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0258  */
    /* JADX WARN: Code duplicated, block: B:92:0x027d  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b8  */
    /* JADX INFO: renamed from: i */
    public static final void m36203i(final C12885h viewState, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C12881d c12881d;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c4;
        int i15;
        boolean z13;
        Object objM87133R5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC28601c1 interfaceC28601c5;
        final InterfaceC28601c1 interfaceC28601c6;
        final Function1 function5;
        final C12881d c12881d2;
        final InterfaceC28601c1 interfaceC28601c7;
        final InterfaceC28601c1 interfaceC28601c8;
        final InterfaceC28601c1 interfaceC28601c9;
        int i16;
        boolean z14;
        boolean z15;
        Object objM87133R6;
        boolean zM87153g;
        Object objM87133R7;
        boolean z16;
        boolean z17;
        Object obj;
        final InterfaceC28601c1 interfaceC28601c10;
        final C12881d c12881d3;
        final InterfaceC28601c1 interfaceC28601c11;
        final InterfaceC28601c1 interfaceC28601c12;
        final Function1 function6;
        int i17;
        final InterfaceC28601c1 interfaceC28601c13;
        Object objM87133R8;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1021288162);
        int i18 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(viewState) ? 4 : 2) : i13;
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i18 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i18 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C12824e(7);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                } else {
                    function4 = function2;
                }
                c12881d = new C12881d();
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getPreselectedGender());
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(c12881d.m36190b(viewState.getPreselectedGender(), viewState.m36224e(), viewState.getPreselectedBaseLine()));
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShowDialogByDefault()));
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC31061c.m95647w(!AbstractC39414r.m125890i0(viewState.getPreselectedGender()), c28655q2);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                Boolean boolValueOf = Boolean.valueOf(m36205k(interfaceC28601c4));
                i15 = i18 & 112;
                if (i15 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R5 = c28655q2.m87133R();
                if (z13 || objM87133R5 == c28676v0) {
                    objM87133R5 = new a(function4, interfaceC28601c4, null);
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R5, boolValueOf);
                C2314t c2314t = C2314t.f9131w;
                float f13 = 8;
                float f14 = 2 * f13;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f14, 0.0f, f14, 0.0f, 10);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
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
                interfaceC28601c5 = interfaceC28601c4;
                AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubtitle(), c28655q2, AbstractC22403o.f87638a | (TextResource.$stable << 3), 0);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(4 * f13, c2314t));
                c28655q.m87150e0(1003408487);
                for (C12880c c12880c : m36213s(interfaceC28601c2)) {
                    boolean zM87153g2 = c28655q.m87153g(c12881d) | c28655q.m87157i(viewState);
                    if (i15 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87153g2 | z16;
                    Object objM87133R9 = c28655q.m87133R();
                    if (!z17 || objM87133R9 == c28676v0) {
                        final int i24 = 0;
                        interfaceC28601c10 = interfaceC28601c5;
                        c12881d3 = c12881d;
                        interfaceC28601c11 = interfaceC28601c2;
                        interfaceC28601c12 = interfaceC28601c3;
                        function6 = function4;
                        i17 = i15;
                        interfaceC28601c13 = interfaceC28601c1;
                        obj = new Function1() { // from class: e90.f
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i24) {
                                    case 0:
                                        return AbstractC12884g.m36207m(c12881d3, viewState, function6, interfaceC28601c13, interfaceC28601c11, interfaceC28601c12, interfaceC28601c10, (String) obj2);
                                    default:
                                        return AbstractC12884g.m36208n(c12881d3, viewState, function6, interfaceC28601c13, interfaceC28601c11, interfaceC28601c12, interfaceC28601c10, (C12878a) obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(obj);
                    } else {
                        interfaceC28601c10 = interfaceC28601c5;
                        c12881d3 = c12881d;
                        interfaceC28601c13 = interfaceC28601c1;
                        interfaceC28601c12 = interfaceC28601c3;
                        function6 = function4;
                        i17 = i15;
                        obj = objM87133R9;
                        interfaceC28601c11 = interfaceC28601c2;
                    }
                    m36217w(c12880c, (Function1) obj, c28655q, TextResource.$stable, 0);
                    c12881d = c12881d3;
                    interfaceC28601c1 = interfaceC28601c13;
                    interfaceC28601c2 = interfaceC28601c11;
                    interfaceC28601c3 = interfaceC28601c12;
                    interfaceC28601c5 = interfaceC28601c10;
                    i15 = i17;
                    function4 = function6;
                }
                interfaceC28601c6 = interfaceC28601c5;
                function5 = function4;
                c12881d2 = c12881d;
                interfaceC28601c7 = interfaceC28601c1;
                interfaceC28601c8 = interfaceC28601c2;
                interfaceC28601c9 = interfaceC28601c3;
                i16 = i15;
                c28655q.m87173q(false);
                AbstractC11266d.m30469w(13, f13, c2314t, c28655q);
                if (m36215u(interfaceC28601c9)) {
                    c28655q.m87150e0(1041710241);
                    TextResource textResourceM36183e = viewState.getDialogData().getTitle();
                    TextResource textResourceM36182d = viewState.getDialogData().getSubtitle();
                    TextResource textResourceM36181c = viewState.getDialogData().getCta();
                    TextResource textResourceM36180b = viewState.getDialogData().getCancelCta();
                    List<C12878a> listM36179a = viewState.getDialogData().m36179a();
                    boolean zM87153g3 = c28655q.m87153g(c12881d2) | c28655q.m87157i(viewState);
                    if (i16 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87153g3 | z14;
                    objM87133R6 = c28655q.m87133R();
                    if (z15 || objM87133R6 == c28676v0) {
                        final int i25 = 1;
                        Function1 function7 = new Function1() { // from class: e90.f
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i25) {
                                    case 0:
                                        return AbstractC12884g.m36207m(c12881d2, viewState, function5, interfaceC28601c9, interfaceC28601c6, interfaceC28601c7, interfaceC28601c8, (String) obj2);
                                    default:
                                        return AbstractC12884g.m36208n(c12881d2, viewState, function5, interfaceC28601c9, interfaceC28601c6, interfaceC28601c7, interfaceC28601c8, (C12878a) obj2);
                                }
                            }
                        };
                        interfaceC28601c9 = interfaceC28601c9;
                        interfaceC28601c8 = interfaceC28601c8;
                        c28655q.m87172p0(function7);
                        objM87133R6 = function7;
                    }
                    Function1 function8 = (Function1) objM87133R6;
                    zM87153g = c28655q.m87153g(c12881d2);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87153g || objM87133R7 == c28676v0) {
                        objM87133R7 = new C11558r(c12881d2, interfaceC28601c9, interfaceC28601c8, 4);
                        c28655q.m87172p0(objM87133R7);
                    }
                    int i26 = TextResource.$stable;
                    AbstractC40180a.m128902j(textResourceM36183e, textResourceM36182d, textResourceM36181c, textResourceM36180b, listM36179a, function8, (InterfaceC4339a) objM87133R7, c28655q, (i26 << 9) | (i26 << 3) | i26 | (i26 << 6), 0);
                    c28655q.m87173q(false);
                } else {
                    function5 = function5;
                    c28655q.m87150e0(1042529974);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11736b(viewState, i13, function3, i14, 12);
            }
        }
        i18 |= 48;
        function2 = function1;
        if ((i18 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C12824e(7);
                    c28655q2.m87172p0(objM87133R8);
                }
                function4 = (Function1) objM87133R8;
            } else {
                function4 = function2;
            }
            c12881d = new C12881d();
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(viewState.getPreselectedGender());
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(c12881d.m36190b(viewState.getPreselectedGender(), viewState.m36224e(), viewState.getPreselectedBaseLine()));
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShowDialogByDefault()));
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC31061c.m95647w(!AbstractC39414r.m125890i0(viewState.getPreselectedGender()), c28655q2);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            Boolean boolValueOf2 = Boolean.valueOf(m36205k(interfaceC28601c4));
            i15 = i18 & 112;
            if (i15 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R5 = c28655q2.m87133R();
            if (z13) {
                objM87133R5 = new a(function4, interfaceC28601c4, null);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new a(function4, interfaceC28601c4, null);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R5, boolValueOf2);
            C2314t c2314t2 = C2314t.f9131w;
            float f15 = 8;
            float f16 = 2 * f15;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t2), f16, 0.0f, f16, 0.0f, 10);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
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
            interfaceC28601c5 = interfaceC28601c4;
            AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubtitle(), c28655q2, AbstractC22403o.f87638a | (TextResource.$stable << 3), 0);
            c28655q = c28655q2;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(4 * f15, c2314t2));
            c28655q.m87150e0(1003408487);
            while (r20.hasNext()) {
                boolean zM87153g4 = c28655q.m87153g(c12881d) | c28655q.m87157i(viewState);
                if (i15 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87153g4 | z16;
                Object objM87133R10 = c28655q.m87133R();
                if (z17) {
                    final int i27 = 0;
                    interfaceC28601c10 = interfaceC28601c5;
                    c12881d3 = c12881d;
                    interfaceC28601c11 = interfaceC28601c2;
                    interfaceC28601c12 = interfaceC28601c3;
                    function6 = function4;
                    i17 = i15;
                    interfaceC28601c13 = interfaceC28601c1;
                    obj = new Function1() { // from class: e90.f
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i27) {
                                case 0:
                                    return AbstractC12884g.m36207m(c12881d3, viewState, function6, interfaceC28601c13, interfaceC28601c11, interfaceC28601c12, interfaceC28601c10, (String) obj2);
                                default:
                                    return AbstractC12884g.m36208n(c12881d3, viewState, function6, interfaceC28601c13, interfaceC28601c11, interfaceC28601c12, interfaceC28601c10, (C12878a) obj2);
                            }
                        }
                    };
                    c28655q.m87172p0(obj);
                } else {
                    final int i28 = 0;
                    interfaceC28601c10 = interfaceC28601c5;
                    c12881d3 = c12881d;
                    interfaceC28601c11 = interfaceC28601c2;
                    interfaceC28601c12 = interfaceC28601c3;
                    function6 = function4;
                    i17 = i15;
                    interfaceC28601c13 = interfaceC28601c1;
                    obj = new Function1() { // from class: e90.f
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i28) {
                                case 0:
                                    return AbstractC12884g.m36207m(c12881d3, viewState, function6, interfaceC28601c13, interfaceC28601c11, interfaceC28601c12, interfaceC28601c10, (String) obj2);
                                default:
                                    return AbstractC12884g.m36208n(c12881d3, viewState, function6, interfaceC28601c13, interfaceC28601c11, interfaceC28601c12, interfaceC28601c10, (C12878a) obj2);
                            }
                        }
                    };
                    c28655q.m87172p0(obj);
                }
                m36217w(c12880c, (Function1) obj, c28655q, TextResource.$stable, 0);
                c12881d = c12881d3;
                interfaceC28601c1 = interfaceC28601c13;
                interfaceC28601c2 = interfaceC28601c11;
                interfaceC28601c3 = interfaceC28601c12;
                interfaceC28601c5 = interfaceC28601c10;
                i15 = i17;
                function4 = function6;
            }
            interfaceC28601c6 = interfaceC28601c5;
            function5 = function4;
            c12881d2 = c12881d;
            interfaceC28601c7 = interfaceC28601c1;
            interfaceC28601c8 = interfaceC28601c2;
            interfaceC28601c9 = interfaceC28601c3;
            i16 = i15;
            c28655q.m87173q(false);
            AbstractC11266d.m30469w(13, f15, c2314t2, c28655q);
            if (m36215u(interfaceC28601c9)) {
                c28655q.m87150e0(1041710241);
                TextResource textResourceM36183e2 = viewState.getDialogData().getTitle();
                TextResource textResourceM36182d2 = viewState.getDialogData().getSubtitle();
                TextResource textResourceM36181c2 = viewState.getDialogData().getCta();
                TextResource textResourceM36180b2 = viewState.getDialogData().getCancelCta();
                List<C12878a> listM36179a2 = viewState.getDialogData().m36179a();
                boolean zM87153g5 = c28655q.m87153g(c12881d2) | c28655q.m87157i(viewState);
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87153g5 | z14;
                objM87133R6 = c28655q.m87133R();
                if (z15) {
                    final int i29 = 1;
                    Function1 function9 = new Function1() { // from class: e90.f
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i29) {
                                case 0:
                                    return AbstractC12884g.m36207m(c12881d2, viewState, function5, interfaceC28601c9, interfaceC28601c6, interfaceC28601c7, interfaceC28601c8, (String) obj2);
                                default:
                                    return AbstractC12884g.m36208n(c12881d2, viewState, function5, interfaceC28601c9, interfaceC28601c6, interfaceC28601c7, interfaceC28601c8, (C12878a) obj2);
                            }
                        }
                    };
                    interfaceC28601c9 = interfaceC28601c9;
                    interfaceC28601c8 = interfaceC28601c8;
                    c28655q.m87172p0(function9);
                    objM87133R6 = function9;
                } else {
                    final int i210 = 1;
                    Function1 function10 = new Function1() { // from class: e90.f
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i210) {
                                case 0:
                                    return AbstractC12884g.m36207m(c12881d2, viewState, function5, interfaceC28601c9, interfaceC28601c6, interfaceC28601c7, interfaceC28601c8, (String) obj2);
                                default:
                                    return AbstractC12884g.m36208n(c12881d2, viewState, function5, interfaceC28601c9, interfaceC28601c6, interfaceC28601c7, interfaceC28601c8, (C12878a) obj2);
                            }
                        }
                    };
                    interfaceC28601c9 = interfaceC28601c9;
                    interfaceC28601c8 = interfaceC28601c8;
                    c28655q.m87172p0(function10);
                    objM87133R6 = function10;
                }
                Function1 function11 = (Function1) objM87133R6;
                zM87153g = c28655q.m87153g(c12881d2);
                objM87133R7 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R7 = new C11558r(c12881d2, interfaceC28601c9, interfaceC28601c8, 4);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C11558r(c12881d2, interfaceC28601c9, interfaceC28601c8, 4);
                    c28655q.m87172p0(objM87133R7);
                }
                int i211 = TextResource.$stable;
                AbstractC40180a.m128902j(textResourceM36183e2, textResourceM36182d2, textResourceM36181c2, textResourceM36180b2, listM36179a2, function11, (InterfaceC4339a) objM87133R7, c28655q, (i211 << 9) | (i211 << 3) | i211 | (i211 << 6), 0);
                c28655q.m87173q(false);
            } else {
                function5 = function5;
                c28655q.m87150e0(1042529974);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(viewState, i13, function3, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m36204j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final boolean m36205k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m36206l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m36207m(C12881d c12881d, C12885h c12885h, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, String it) {
        AbstractC22676k.m65750j(it, "it");
        m36212r(interfaceC28601c1, it);
        m36214t(interfaceC28601c2, C12881d.m36188c(c12881d, m36211q(interfaceC28601c1), c12885h.m36224e(), null, 4, null));
        if (AbstractC22676k.m65745e(m36211q(interfaceC28601c1), Gender.NON_BINARY.getValue()) || AbstractC22676k.m65745e(m36211q(interfaceC28601c1), Gender.PREFER_NOT_TO_SAY.getValue())) {
            m36216v(interfaceC28601c3, true);
            m36206l(interfaceC28601c4, false);
        } else {
            m36206l(interfaceC28601c4, true);
        }
        function1.invoke(new InterfaceC21413a.a0(m36211q(interfaceC28601c1)));
        function1.invoke(new InterfaceC21413a.z(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m36208n(C12881d c12881d, C12885h c12885h, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, C12878a it) {
        AbstractC22676k.m65750j(it, "it");
        m36216v(interfaceC28601c1, false);
        m36206l(interfaceC28601c2, true);
        m36214t(interfaceC28601c4, c12881d.m36190b(m36211q(interfaceC28601c3), c12885h.m36224e(), it.getText()));
        function1.invoke(new InterfaceC21413a.z(it.getType()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m36209o(C12881d c12881d, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m36216v(interfaceC28601c1, false);
        m36214t(interfaceC28601c2, c12881d.m36189a(m36213s(interfaceC28601c2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m36210p(C12885h c12885h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m36203i(c12885h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final String m36211q(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final void m36212r(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: s */
    private static final List<C12880c> m36213s(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: t */
    private static final void m36214t(InterfaceC28601c1 interfaceC28601c1, List<C12880c> list) {
        interfaceC28601c1.setValue(list);
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m36215u(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m36216v(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x025e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0270  */
    /* JADX WARN: Code duplicated, block: B:88:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0346  */
    /* JADX WARN: Code duplicated, block: B:94:0x0350  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0270, please report this as an issue */
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
    /* JADX INFO: renamed from: w */
    private static final void m36217w(C12880c c12880c, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C2314t c2314t;
        float f13;
        long jM95628d;
        float f14;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        float f15;
        C38072d c38072d;
        int i16;
        boolean z16;
        long jM73366B;
        int i17;
        boolean z17;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1835349776);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c12880c) : c28655q.m87157i(c12880c) ? 4 : 2);
        } else {
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
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C12824e(6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                c2314t = C2314t.f9131w;
                float f16 = 8;
                f13 = 1 * f16;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13, 0.0f, 0.0f, 13);
                if (c12880c.getSelected()) {
                    c28655q.m87150e0(-1971241682);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(-1971168367);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                float f17 = 2;
                f14 = 4;
                Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3398t, f17, f14, jM95628d);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(c12880c))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C11546l(13, function4, c12880c);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3362g(modifierM95629e, false, null, null, (InterfaceC4339a) objM87133R, 15), "Gender " + c12880c.getType());
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9103F, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                float f18 = f17 * f16;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f18, 7);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                f15 = f14 * f16;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, f15, f18, f15, 0.0f, 8);
                String strM21274h = AbstractC8693b.m21274h(c12880c.getText(), c28655q, TextResource.$stable);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                C2886a sh4 = c38072d.m121952e(c28655q, i16).getSh4();
                if (c12880c.getSelected()) {
                    c28655q.m87150e0(416574221);
                    jM73366B = c38072d.m121949b(c28655q, i16).getBlack90();
                    z16 = false;
                    c28655q.m87173q(false);
                } else {
                    z16 = false;
                    jM73366B = AbstractC25012a.m73366B(c28655q, 416644746, c38072d, c28655q, i16);
                    c28655q.m87173q(false);
                }
                i17 = C2886a.f11498d << 18;
                Function1 function5 = function4;
                z17 = z16;
                AbstractC30795n.m94707h(strM21274h, modifierM3398t3, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh4, null, c28655q, 0, i17, 196600);
                c28655q = c28655q;
                if (c12880c.getBaseline() == null) {
                    c28655q.m87150e0(416764994);
                    c28655q.m87173q(z17);
                } else {
                    c28655q.m87150e0(416764995);
                    AbstractC30795n.m94707h(AbstractC8693b.m21275i(AbstractC30060g.m92103Y(c28655q, AbstractC38022b.f162862C) + " " + c12880c.getBaseline(), c28655q, z17 ? 1 : 0), AbstractC1099a.m3398t(c2314t, f15, 0.0f, f15, 0.0f, 10), c38072d.m121949b(c28655q, i16).getBlack90(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB4(), null, c28655q, 48, i17, 196088);
                    c28655q = c28655q;
                    c28655q.m87173q(z17);
                }
                c28655q.m87173q(true);
                if (c12880c.getBaseline() == null) {
                    c28655q.m87150e0(-1362616653);
                    c28655q.m87173q(z17);
                } else {
                    c28655q.m87150e0(-1362616652);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1.m121951d().getAction().getPencil(), c28655q, 6), AbstractC8693b.m21273g(AbstractC38022b.f162863D, c28655q, z17 ? 1 : 0), AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3394p(f13, c2314t)), c38072d.m121949b(c28655q, i16).getBlack90(), c28655q, 384, 0);
                    c28655q.m87173q(z17);
                }
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11736b(c12880c, i13, function3, i14, 11);
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
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C12824e(6);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            c2314t = C2314t.f9131w;
            float f19 = 8;
            f13 = 1 * f19;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13, 0.0f, 0.0f, 13);
            if (c12880c.getSelected()) {
                c28655q.m87150e0(-1971241682);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-1971168367);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            float f110 = 2;
            f14 = 4;
            Modifier modifierM95629e2 = AbstractC31061c.m95629e(modifierM3398t4, f110, f14, jM95628d);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i15 & 14) != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            z15 = z14 | z13;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C11546l(13, function4, c12880c);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C11546l(13, function4, c12880c);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1092a.m3362g(modifierM95629e2, false, null, null, (InterfaceC4339a) objM87133R, 15), "Gender " + c12880c.getType());
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9103F, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            float f111 = f110 * f19;
            Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f111, 7);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            f15 = f14 * f19;
            Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, f15, f111, f15, 0.0f, 8);
            String strM21274h2 = AbstractC8693b.m21274h(c12880c.getText(), c28655q, TextResource.$stable);
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            C2886a sh5 = c38072d.m121952e(c28655q, i16).getSh4();
            if (c12880c.getSelected()) {
                c28655q.m87150e0(416574221);
                jM73366B = c38072d.m121949b(c28655q, i16).getBlack90();
                z16 = false;
                c28655q.m87173q(false);
            } else {
                z16 = false;
                jM73366B = AbstractC25012a.m73366B(c28655q, 416644746, c38072d, c28655q, i16);
                c28655q.m87173q(false);
            }
            i17 = C2886a.f11498d << 18;
            Function1 function6 = function4;
            z17 = z16;
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t6, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh5, null, c28655q, 0, i17, 196600);
            c28655q = c28655q;
            if (c12880c.getBaseline() == null) {
                c28655q.m87150e0(416764994);
                c28655q.m87173q(z17);
            } else {
                c28655q.m87150e0(416764995);
                AbstractC30795n.m94707h(AbstractC8693b.m21275i(AbstractC30060g.m92103Y(c28655q, AbstractC38022b.f162862C) + " " + c12880c.getBaseline(), c28655q, z17 ? 1 : 0), AbstractC1099a.m3398t(c2314t, f15, 0.0f, f15, 0.0f, 10), c38072d.m121949b(c28655q, i16).getBlack90(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB4(), null, c28655q, 48, i17, 196088);
                c28655q = c28655q;
                c28655q.m87173q(z17);
            }
            c28655q.m87173q(true);
            if (c12880c.getBaseline() == null) {
                c28655q.m87150e0(-1362616653);
                c28655q.m87173q(z17);
            } else {
                c28655q.m87150e0(-1362616652);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r1.m121951d().getAction().getPencil(), c28655q, 6), AbstractC8693b.m21273g(AbstractC38022b.f162863D, c28655q, z17 ? 1 : 0), AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3394p(f13, c2314t)), c38072d.m121949b(c28655q, i16).getBlack90(), c28655q, 384, 0);
                c28655q.m87173q(z17);
            }
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(c12880c, i13, function3, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m36218x(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m36219y(Function1 function1, C12880c c12880c) {
        function1.invoke(c12880c.getType());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m36220z(C12880c c12880c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m36217w(c12880c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

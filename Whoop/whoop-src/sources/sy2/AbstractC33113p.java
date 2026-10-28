package sy2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import hy0.AbstractC17766l1;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import iz0.AbstractC21048g;
import iz0.C21054m;
import java.util.concurrent.CancellationException;
import kz2.AbstractC22927d;
import l83.C23454a0;
import ny2.AbstractC27299a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p031b9.AbstractC2875y;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31917f;
import p733ry2.AbstractC31920i;
import p733ry2.C31915d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s01.C32049e;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import s90.C32290f;
import sr2.C32940v;
import ty2.AbstractC34268a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sy2.p */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\u0007¨\u0006\u000f²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lty2/a$a$f;", "viewState", "Lkotlin/Function1;", "Lny2/a;", "Ll83/a0;", "onViewEvent", "k", "(Lty2/a$a$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "currentText", "o", "(Ljava/lang/String;Lty2/a$a$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "t", "Lbc3/k1;", "debounceJob", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33113p {

    /* JADX INFO: renamed from: sy2.p$a */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.TextInputStepScreenKt$TextAreaInput$1$1$1", m100430f = "TextInputStepScreen.kt", m100431l = {158}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138113w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f138114x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f138115y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138114x = function1;
            this.f138115y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f138114x, this.f138115y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138113w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f138113w = 1;
                if (AbstractC3034m0.m8782b(100L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f138114x.invoke(new AbstractC27299a.z(this.f138115y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sy2.p$b */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.TextInputStepScreenKt$TextFieldInput$4$1$1", m100430f = "TextInputStepScreen.kt", m100431l = {195}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138116w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f138117x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f138118y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138117x = function1;
            this.f138118y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f138117x, this.f138118y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138116w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f138116w = 1;
                if (AbstractC3034m0.m8782b(100L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f138117x.invoke(new AbstractC27299a.z(this.f138118y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m104946A(AbstractC34268a.a.f fVar, Function1 function1, int i13, Composer composer, int i14) {
        m104966t(fVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m104957k(AbstractC34268a.a.f viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC34268a.a.f fVar;
        C2314t c2314t;
        float f13;
        C28676v0 c28676v0;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1426510346);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(c2314t2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R == c28676v1) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            boolean zM87157i = c28655q.m87157i(interfaceC15237i);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v1) {
                objM87133R2 = new C33104g(interfaceC15237i, 2);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM44028b0, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t2));
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            c28655q.m87158i0();
            int i15 = i14;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            int i16 = i15 & 112;
            int i17 = i15 & 126;
            AbstractC31917f.m99349g(viewState, onViewEvent, c28655q, i17);
            float f14 = 2;
            float f15 = 4 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t2));
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9105H, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            C2305k c2305k = C2299e.f9111N;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC22953f.m66720i(c2314t2), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            String strM108465f = viewState.getContent();
            if (strM108465f == null) {
                c28655q.m87150e0(-1855643242);
                c28655q.m87173q(false);
                z4 = false;
                c2314t = c2314t2;
                f13 = f15;
                c28676v0 = c28676v1;
            } else {
                c28655q.m87150e0(-1855643241);
                float f16 = 8;
                float f17 = f14 * f16;
                c2314t = c2314t2;
                f13 = f15;
                c28676v0 = c28676v1;
                z4 = false;
                AbstractC21048g.m58807M(AbstractC8693b.m21275i(strM108465f, c28655q, 0), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), f17, ((float) 0.5d) * f16, f17, 0.0f, 8), false, AbstractC22927d.m66688a(c28655q, 0), null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 500);
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            if (viewState.getRowCount() > 1) {
                c28655q.m87150e0(-1854982848);
                c28655q.m87144b0(-1722405358, Integer.valueOf(viewState.getStepId()));
                fVar = viewState;
                m104961o(AbstractC8693b.m21274h(AbstractC8693b.m21278l(viewState.getTextInput()), c28655q, TextResource.$stable), fVar, onViewEvent, c28655q, (i15 << 3) & MessageListItemViewType.GIPHY);
                c28655q.m87173q(z4);
                c28655q.m87173q(z4);
            } else {
                fVar = viewState;
                c28655q.m87150e0(-1854536510);
                m104966t(fVar, onViewEvent, c28655q, i17);
                c28655q.m87173q(z4);
            }
            TextResource textResourceM108470k = fVar.getPrimaryButton();
            boolean zM108474o = fVar.getIsPrimaryButtonEnabled();
            boolean z13 = i16 == 32 ? true : z4;
            Object objM87133R3 = c28655q.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                objM87133R3 = new C33098a(onViewEvent, 6);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC31920i.m99360c(textResourceM108470k, zM108474o, null, (InterfaceC4339a) objM87133R3, c28655q, TextResource.$stable, 4);
            AbstractC2875y.m8286B(c28655q, true, true, true, true);
        } else {
            fVar = viewState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33112o(fVar, onViewEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m104958l(InterfaceC15237i interfaceC15237i) {
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m104959m(Function1 function1) {
        function1.invoke(AbstractC27299a.o.f109339a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m104960n(AbstractC34268a.a.f fVar, Function1 function1, int i13, Composer composer, int i14) {
        m104957k(fVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m104961o(String str, AbstractC34268a.a.f fVar, Function1 function1, Composer composer, int i13) {
        String str2;
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(609201646);
        if ((i13 & 6) == 0) {
            str2 = str;
            i14 = (c28655q2.m87153g(str2) ? 4 : 2) | i13;
        } else {
            str2 = str;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(fVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
            TextResource textResourceM108468i = fVar.getLabel();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(str2);
            TextResource textResourceM108467h = fVar.getHint();
            TextResource textResourceM108466g = fVar.getErrorMessage();
            boolean zM21270d = AbstractC8693b.m21270d(fVar.getErrorMessage());
            boolean z4 = true;
            int iM108471l = fVar.getRowCount();
            int iM108469j = fVar.getMaxInputLength();
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, f13, 0.0f, f13, 0.0f, 10);
            boolean zM87157i = c28655q2.m87157i(interfaceC2994c0);
            if ((i14 & 896) != 256) {
                z4 = false;
            }
            boolean z13 = zM87157i | z4;
            Object objM87133R3 = c28655q2.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                objM87133R3 = new C32290f((Object) interfaceC2994c0, (Object) interfaceC28601c1, function1, 6);
                c28655q2.m87172p0(objM87133R3);
            }
            int i15 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC17766l1.m50964e(modifierM3398t, textResourceM108468i, textResourceM21278l, textResourceM108467h, textResourceM108466g, iM108469j, iM108471l, zM21270d, false, false, null, false, (Function1) objM87133R3, c28655q, (i15 << 3) | 6 | (i15 << 6) | (i15 << 9) | (i15 << 12), 0, 3840);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(str, fVar, function1, i13, 13);
        }
    }

    /* JADX INFO: renamed from: p */
    private static final InterfaceC3027k1 m104962p(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC3027k1) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: q */
    private static final void m104963q(InterfaceC28601c1 interfaceC28601c1, InterfaceC3027k1 interfaceC3027k1) {
        interfaceC28601c1.setValue(interfaceC3027k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m104964r(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC3027k1 interfaceC3027k1M104962p = m104962p(interfaceC28601c1);
        if (interfaceC3027k1M104962p != null) {
            interfaceC3027k1M104962p.cancel((CancellationException) null);
        }
        m104963q(interfaceC28601c1, AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(function1, it, null), 3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m104965s(String str, AbstractC34268a.a.f fVar, Function1 function1, int i13, Composer composer, int i14) {
        m104961o(str, fVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: t */
    private static final void m104966t(AbstractC34268a.a.f fVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1625157046);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(fVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
            TextResource textResourceM21278l = AbstractC8693b.m21278l(fVar.getTextInput());
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM21278l, c28655q2, i15);
            boolean zM87149e = c28655q2.m87149e(fVar.getStepId());
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87149e || objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(strM21274h);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            TextResource textResourceM108468i = fVar.getLabel();
            C2886a c2886aM8432m = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getFormLabel();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
            TextResource textResourceM108466g = fVar.getErrorMessage();
            boolean zM21270d = AbstractC8693b.m21270d(fVar.getErrorMessage());
            boolean zM87153g = c28655q2.m87153g(interfaceC2464x2);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87153g || objM87133R4 == c28676v0) {
                objM87133R4 = new C33116s(interfaceC2464x2, 2);
                c28655q2.m87172p0(objM87133R4);
            }
            C34348q0 c34348q0 = new C34348q0((Function1) objM87133R4, null, null, null, 62);
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, f13, 0.0f, f13, 0.0f, 10);
            C37816b c37816bM121344e = AbstractC37817c.m121344e(1229414546, c28655q2, new C33109l(fVar, 1));
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C32940v(14);
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
            boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(interfaceC2994c0) | ((i14 & 112) == 32);
            Object objM87133R6 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R6 == c28676v0) {
                C31915d c31915d = new C31915d((Object) interfaceC28601c2, (Object) interfaceC2994c0, (Object) interfaceC28601c1, function1, 6);
                c28655q2.m87172p0(c31915d);
                objM87133R6 = c31915d;
            }
            c28655q = c28655q2;
            AbstractC30792k.m94678l(modifierM3398t, textResourceM21278l2, null, textResourceM108468i, c2886aM8432m, null, c37816bM121344e, null, textResourceM108466g, zM21270d, false, null, 0L, false, 1, 0, 7, false, null, false, false, 0, false, null, null, null, null, null, null, c34348q0, interfaceC4339a, (Function1) objM87133R6, c28655q, (i15 << 3) | 1572870 | (i15 << 9) | (C2886a.f11498d << 12) | (i15 << 24), 1597440, 0, 6, 536788132, 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33112o(fVar, function1, i13, 1);
        }
    }

    /* JADX INFO: renamed from: u */
    private static final InterfaceC3027k1 m104967u(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC3027k1) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m104968v(InterfaceC28601c1 interfaceC28601c1, InterfaceC3027k1 interfaceC3027k1) {
        interfaceC28601c1.setValue(interfaceC3027k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m104969w(InterfaceC2464x2 interfaceC2464x2, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        if (interfaceC2464x2 != null) {
            ((C2463x1) interfaceC2464x2).m7442a();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m104970x(AbstractC34268a.a.f fVar, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(fVar.getHint(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m104971y() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m104972z(InterfaceC28601c1 interfaceC28601c1, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c2, Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue(it);
        InterfaceC3027k1 interfaceC3027k1M104967u = m104967u(interfaceC28601c2);
        if (interfaceC3027k1M104967u != null) {
            interfaceC3027k1M104967u.cancel((CancellationException) null);
        }
        m104968v(interfaceC28601c2, AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(function1, it, null), 3));
        return C23454a0.f92919a;
    }
}

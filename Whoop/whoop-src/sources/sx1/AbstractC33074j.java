package sx1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bs2.AbstractC3613f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import cp0.C10941a;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import oq1.C28119c;
import org.xmlpull.v1.XmlPullParserException;
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
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32587b2;
import p734sl0.C32627j2;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s51.C32205b;
import s51.C32209f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg2.C32469t;
import so2.C32848f;
import sr2.C32940v;
import ux1.C35367a;
import ux1.C35368b;
import ux1.C35370d;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: sx1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aE\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0005*\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lux1/d;", "viewState", "Lkotlin/Function2;", "Lcom/whoop/navigation/e;", "", "Ll83/a0;", "onCtaClicked", "Lkotlin/Function0;", "onModalClose", "v", "(Lux1/d;Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "A", "(Lux1/d;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "S", "(Lux1/d;Landroidx/compose/runtime/Composer;I)V", "mediaUrl", "M", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33074j {

    /* JADX INFO: renamed from: sx1.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.reactivationmodal.ReactivationModalScreenKt$ReactivationModalScreen$3$1", m100430f = "ReactivationModalScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137922w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f137923x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f137924y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137923x = c15199y3;
            this.f137924y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f137923x, this.f137924y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137922w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            EnumC15209z3 enumC15209z3M43221b = this.f137923x.m43221b();
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
            if (enumC15209z3M43221b != enumC15209z3 && this.f137923x.m43222c() == enumC15209z3) {
                this.f137924y.invoke();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m104732A(C35370d c35370d, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1471031099);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c35370d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = false;
            C2305k c2305k = C2299e.f9111N;
            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1099a.m3396r(C2314t.f9131w, 1 * 8, 0.0f, 2), null, 3);
            boolean zM87157i = c28655q.m87157i(c35370d);
            if ((i14 & 112) == 32) {
                z4 = true;
            }
            boolean z13 = zM87157i | z4;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C32469t(12, c35370d, interfaceC4351m);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(modifierM3427x, null, null, null, c2305k, null, false, null, (Function1) objM87133R, c28655q, 196614, 478);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(c35370d, interfaceC4351m, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m104733B(final C35370d c35370d, InterfaceC4351m interfaceC4351m, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        if (c35370d.getMediaImage() != null) {
            final int i13 = 1;
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: sx1.h
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i14 = i13;
                    InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i14) {
                        case 0:
                            return AbstractC33074j.m104738G(c35370d, interfaceC1103a, composer, iIntValue);
                        case 1:
                            return AbstractC33074j.m104734C(c35370d, interfaceC1103a, composer, iIntValue);
                        case 2:
                            return AbstractC33074j.m104736E(c35370d, interfaceC1103a, composer, iIntValue);
                        default:
                            return AbstractC33074j.m104737F(c35370d, interfaceC1103a, composer, iIntValue);
                    }
                }
            }, true, -1645772934), 3);
        } else {
            String mediaUrl = c35370d.getMediaUrl();
            if (mediaUrl != null) {
                InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C28119c(19, mediaUrl, c35370d), true, -1377640914), 3);
            }
        }
        final int i14 = 2;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: sx1.h
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC33074j.m104738G(c35370d, interfaceC1103a, composer, iIntValue);
                    case 1:
                        return AbstractC33074j.m104734C(c35370d, interfaceC1103a, composer, iIntValue);
                    case 2:
                        return AbstractC33074j.m104736E(c35370d, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC33074j.m104737F(c35370d, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, -375573776), 3);
        final int i15 = 3;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: sx1.h
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i16 = i15;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i16) {
                    case 0:
                        return AbstractC33074j.m104738G(c35370d, interfaceC1103a, composer, iIntValue);
                    case 1:
                        return AbstractC33074j.m104734C(c35370d, interfaceC1103a, composer, iIntValue);
                    case 2:
                        return AbstractC33074j.m104736E(c35370d, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC33074j.m104737F(c35370d, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, -1932614055), 3);
        if (!c35370d.m112231e().isEmpty()) {
            final int i16 = 0;
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: sx1.h
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i17 = i16;
                    InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i17) {
                        case 0:
                            return AbstractC33074j.m104738G(c35370d, interfaceC1103a, composer, iIntValue);
                        case 1:
                            return AbstractC33074j.m104734C(c35370d, interfaceC1103a, composer, iIntValue);
                        case 2:
                            return AbstractC33074j.m104736E(c35370d, interfaceC1103a, composer, iIntValue);
                        default:
                            return AbstractC33074j.m104737F(c35370d, interfaceC1103a, composer, iIntValue);
                    }
                }
            }, true, 683663797), 3);
        }
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C33073i(c35370d, interfaceC4351m, 0), true, -731472712), 3);
        C35368b secondaryCta = c35370d.getSecondaryCta();
        if (secondaryCta != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C28119c(18, secondaryCta, interfaceC4351m), true, 902760030), 3);
        }
        InterfaceC26064q.m77556b(LazyColumn, null, C33065a.f137888a.m104719d(), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m104734C(C35370d c35370d, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C2305k c2305k = C2299e.f9111N;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * 4);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44017W0 = AbstractC15673b0.m44017W0(c2314t, c33252iM105489e);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44017W0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c35370d.getMediaImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), "Device", AbstractC1102d.m3419p(200, AbstractC1102d.m3409f(1.0f, c2314t)), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            m104750S(c35370d, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m104735D(String str, C35370d c35370d, InterfaceC1103a item, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C2305k c2305k = C2299e.f9111N;
            Modifier modifierM44017W0 = AbstractC15673b0.m44017W0(C2314t.f9131w, AbstractC33253j.m105489e(3 * 4));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44017W0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (str.length() > 0) {
                c28655q.m87150e0(-634575186);
                m104744M(str, c28655q, 0);
                m104750S(c35370d, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-634456022);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m104736E(C35370d c35370d, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM21274h = AbstractC8693b.m21274h(c35370d.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 3 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i14).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m104737F(C35370d c35370d, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM21274h = AbstractC8693b.m21274h(c35370d.getSubtitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i14).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m104738G(C35370d c35370d, InterfaceC1103a item, Composer composer, int i13) {
        C2306l c2306l;
        C2314t c2314t;
        C2306l c2306l2 = C2299e.f9108K;
        AbstractC22676k.m65750j(item, "$this$item");
        ?? r10 = 1;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 8;
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 0.0f;
            int i14 = 2;
            float f15 = 4;
            Modifier modifierM3411h = AbstractC1102d.m3411h(22 * f15, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t2, ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 2 * f13, 0.0f, 0.0f, 13));
            int i15 = 48;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-2023902029);
            Iterator it = AbstractC25265s.m74156w1(c35370d.m112231e(), 3).iterator();
            int i16 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C35367a c35367a = (C35367a) next;
                C2305k c2305k = C2299e.f9111N;
                float f16 = f15;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, r10), ((float) r10) * f13, f14, i14);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, i15);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                TextResource value = c35367a.getValue();
                int i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(value, c28655q, i18);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                C2886a bnM = c38072d.m121952e(c28655q, i19).getBnM();
                long brandWhite = c38072d.m121949b(c28655q, i19).getBrandWhite();
                C36775k c36775k = new C36775k(3);
                int i24 = C2886a.f11498d << 18;
                C2314t c2314t3 = c2314t2;
                C28655q c28655q2 = c28655q;
                int i25 = i16;
                Iterator it3 = it;
                float f17 = f13;
                C2306l c2306l3 = c2306l2;
                AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, bnM, null, c28655q2, 0, i24, 196090);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35367a.getTitle(), c28655q2, i18), null, c38072d.m121949b(c28655q2, i19).getSecondaryText(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getH4(), null, c28655q2, 0, i24, 196090);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                if (i25 < Math.min(c35370d.m112231e().size(), 3) - 1) {
                    c28655q.m87150e0(-363025292);
                    c2314t = c2314t3;
                    c2306l = c2306l3;
                    AbstractC15751g.m44449b(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3424u(((float) 0.2d) * f16, c2314t).mo3471e(new VerticalAlignElement(c2306l))), c38072d.m121949b(c28655q, i19).getWhite10(), 0.0f, 0.0f, c28655q, 0, 12);
                    c28655q.m87173q(false);
                } else {
                    c2306l = c2306l3;
                    c2314t = c2314t3;
                    c28655q.m87150e0(-362676604);
                    c28655q.m87173q(false);
                }
                it = it3;
                c2314t2 = c2314t;
                c2306l2 = c2306l;
                i16 = i17;
                f13 = f17;
                f14 = 0.0f;
                i14 = 2;
                f15 = f16;
                i15 = 48;
                r10 = 1;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m104739H(C35370d c35370d, InterfaceC4351m interfaceC4351m, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h = AbstractC8693b.m21274h(c35370d.getCta().getText(), c28655q, TextResource.$stable);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 3 * 8, 0.0f, 0.0f, 13));
            boolean zM87153g = c28655q.m87153g(interfaceC4351m) | c28655q.m87157i(c35370d);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C32209f(11, interfaceC4351m, c35370d);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 120);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m104740I(InterfaceC4351m interfaceC4351m, C35370d c35370d) {
        interfaceC4351m.invoke(c35370d.getCta().getDestination(), c35370d.getCta().getTrackingLabel());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m104741J(C35368b c35368b, InterfaceC4351m interfaceC4351m, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC11266d.m30469w(2, 8, C2314t.f9131w, c28655q);
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
            TextResource text = c35368b.getText();
            C39274g icon = c35368b.getIcon();
            boolean zM87153g = c28655q.m87153g(interfaceC4351m) | c28655q.m87157i(c35368b);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C32469t(11, interfaceC4351m, c35368b);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27265l0.m82217i(null, enumC27269n0, text, null, icon, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 48 | (C39274g.f168929c << 12), 0, 4073);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m104742K(InterfaceC4351m interfaceC4351m, C35368b c35368b, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4351m.invoke(c35368b.getDestination(), c35368b.getTrackingLabel());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m104743L(C35370d c35370d, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m104732A(c35370d, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final void m104744M(String str, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-21357048);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, 1.7777778f), 3, 4);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C32940v(7);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C32940v(8);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C32940v(9);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C32940v(10);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC3613f.m10967f(modifierM53364e, str, true, false, false, false, false, false, true, false, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, (InterfaceC4339a) objM87133R4, c28655q, ((i14 << 3) & 112) | 920322432, 3510, 24);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m104745N() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m104746O() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m104747P() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m104748Q() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m104749R(String str, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m104744M(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private static final void m104750S(C35370d c35370d, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(403561045);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c35370d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * f13, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C39274g icon = c35370d.getIcon();
            if (icon == null) {
                c28655q.m87150e0(-1104996714);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1104996713);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.getIcon(), c28655q, 6), null, AbstractC1099a.m3398t(AbstractC1102d.m3419p(4 * f13, c2314t), 0.0f, 0.0f, 1 * f13, 0.0f, 11), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSecondaryText(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35370d.getTagText(), c28655q, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSecondaryText(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 261626);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c35370d, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m104751T(C35370d c35370d, int i13, Composer composer, int i14) {
        m104750S(c35370d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
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
    /* JADX INFO: renamed from: v */
    public static final void m104773v(C35370d viewState, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4351m interfaceC4351m2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        C28655q c28655q;
        InterfaceC4351m interfaceC4351m3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        C15199y3 c15199y3M3460c;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-174290884);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i15 |= c28655q2.m87157i(interfaceC4351m2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
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
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32587b2(3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R3;
                    } else {
                        interfaceC4351m3 = interfaceC4351m2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32940v(11);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                    EnumC15209z3 enumC15209z3M43221b = c15199y3M3460c.m43221b();
                    EnumC15209z3 enumC15209z3M43222c = c15199y3M3460c.m43222c();
                    zM87157i = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 896) == 256);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new a(c15199y3M3460c, interfaceC4339a3, null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87254h(enumC15209z3M43221b, enumC15209z3M43222c, (InterfaceC4351m) objM87133R, c28655q2);
                    c28655q = c28655q2;
                    AbstractC35660d.m112871m(AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a), new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3M3460c), EnumC39333f.BLACK_70, null, null, null, AbstractC37817c.m121344e(1574587114, c28655q2, new C33073i(viewState, interfaceC4351m3, 1)), false, null, null, null, false, null, C33065a.f137888a.m104718c(), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16240);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4351m3 = interfaceC4351m2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32205b(viewState, interfaceC4351m3, interfaceC4339a3, i13, i14, 20);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32587b2(3);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R3;
                } else {
                    interfaceC4351m3 = interfaceC4351m2;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32940v(11);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                EnumC15209z3 enumC15209z3M43221b2 = c15199y3M3460c.m43221b();
                EnumC15209z3 enumC15209z3M43222c2 = c15199y3M3460c.m43222c();
                zM87157i = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 896) == 256);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new a(c15199y3M3460c, interfaceC4339a3, null);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(c15199y3M3460c, interfaceC4339a3, null);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC28683x.m87254h(enumC15209z3M43221b2, enumC15209z3M43222c2, (InterfaceC4351m) objM87133R, c28655q2);
                c28655q = c28655q2;
                AbstractC35660d.m112871m(AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a), new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3M3460c), EnumC39333f.BLACK_70, null, null, null, AbstractC37817c.m121344e(1574587114, c28655q2, new C33073i(viewState, interfaceC4351m3, 1)), false, null, null, null, false, null, C33065a.f137888a.m104718c(), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16240);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b(viewState, interfaceC4351m3, interfaceC4339a3, i13, i14, 20);
            }
        }
        i15 |= 48;
        interfaceC4351m2 = interfaceC4351m;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
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
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32587b2(3);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R3;
                } else {
                    interfaceC4351m3 = interfaceC4351m2;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32940v(11);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
                EnumC15209z3 enumC15209z3M43221b3 = c15199y3M3460c.m43221b();
                EnumC15209z3 enumC15209z3M43222c3 = c15199y3M3460c.m43222c();
                zM87157i = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 896) == 256);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new a(c15199y3M3460c, interfaceC4339a3, null);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(c15199y3M3460c, interfaceC4339a3, null);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC28683x.m87254h(enumC15209z3M43221b3, enumC15209z3M43222c3, (InterfaceC4351m) objM87133R, c28655q2);
                c28655q = c28655q2;
                AbstractC35660d.m112871m(AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a), new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3M3460c), EnumC39333f.BLACK_70, null, null, null, AbstractC37817c.m121344e(1574587114, c28655q2, new C33073i(viewState, interfaceC4351m3, 1)), false, null, null, null, false, null, C33065a.f137888a.m104718c(), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16240);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b(viewState, interfaceC4351m3, interfaceC4339a3, i13, i14, 20);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C32587b2(3);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4351m3 = (InterfaceC4351m) objM87133R3;
            } else {
                interfaceC4351m3 = interfaceC4351m2;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32940v(11);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
            EnumC15209z3 enumC15209z3M43221b4 = c15199y3M3460c.m43221b();
            EnumC15209z3 enumC15209z3M43222c4 = c15199y3M3460c.m43222c();
            zM87157i = c28655q2.m87157i(c15199y3M3460c) | ((i15 & 896) == 256);
            objM87133R = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R = new a(c15199y3M3460c, interfaceC4339a3, null);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new a(c15199y3M3460c, interfaceC4339a3, null);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC28683x.m87254h(enumC15209z3M43221b4, enumC15209z3M43222c4, (InterfaceC4351m) objM87133R, c28655q2);
            c28655q = c28655q2;
            AbstractC35660d.m112871m(AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a), new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3M3460c), EnumC39333f.BLACK_70, null, null, null, AbstractC37817c.m121344e(1574587114, c28655q2, new C33073i(viewState, interfaceC4351m3, 1)), false, null, null, null, false, null, C33065a.f137888a.m104718c(), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16240);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4351m3 = interfaceC4351m2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(viewState, interfaceC4351m3, interfaceC4339a3, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m104774w(C9598e c9598e, String str) {
        AbstractC22676k.m65750j(c9598e, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m104775x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m104776y(C35370d c35370d, InterfaceC4351m interfaceC4351m, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m104732A(c35370d, interfaceC4351m, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m104777z(C35370d c35370d, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m104773v(c35370d, interfaceC4351m, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

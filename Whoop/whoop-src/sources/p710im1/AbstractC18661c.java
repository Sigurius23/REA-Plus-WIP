package p710im1;

import a80.C0542f;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ev2.C13698g;
import fm1.C14600d;
import h02.C16576i;
import hb3.AbstractC17104a0;
import hy0.C17734d1;
import ig0.C18468h;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p132f0.C13821r1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import wm1.C37380b;

/* JADX INFO: renamed from: im1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\f\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "Lm91/u;", "headerItems", "Lf0/r1;", "scrollState", "Lim1/d0;", "itemViewEventHelper", "Lfm1/d;", "homeMetaData", "Ll83/a0;", "g", "(Ljava/util/List;Lf0/r1;Lim1/d0;Lfm1/d;Landroidx/compose/runtime/Composer;I)V", "l", "(Ljava/util/List;Lim1/d0;Lfm1/d;Landroidx/compose/runtime/Composer;I)V", "", "isScrolling", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18661c {

    /* JADX INFO: renamed from: im1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.AnimatedHeaderItemsSectionKt$HeaderItems$1$1$1$1", m100430f = "AnimatedHeaderItemsSection.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73222w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18665d0 f73223x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25312u f73224y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C18665d0 c18665d0, InterfaceC25312u interfaceC25312u, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73223x = c18665d0;
            this.f73224y = interfaceC25312u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f73223x, this.f73224y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f73222w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f73223x.m54173t(this.f73224y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m54134g(List<? extends InterfaceC25312u> headerItems, C13821r1 scrollState, C18665d0 itemViewEventHelper, C14600d homeMetaData, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(headerItems, "headerItems");
        AbstractC22676k.m65750j(scrollState, "scrollState");
        AbstractC22676k.m65750j(itemViewEventHelper, "itemViewEventHelper");
        AbstractC22676k.m65750j(homeMetaData, "homeMetaData");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-172513723);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(headerItems) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(scrollState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(itemViewEventHelper) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(homeMetaData) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            c28655q.m87138X();
        } else if (headerItems.isEmpty()) {
            c28655q.m87150e0(1720278397);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1719765223);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87264r(new C18701v0(scrollState, 1));
                c28655q.m87172p0(objM87133R);
            }
            boolean z4 = !m54136i((InterfaceC28670t2) objM87133R);
            C37380b.Companion companion = C37380b.INSTANCE;
            AbstractC1090b.m3351f(z4, null, companion.m119677b().m11562a(companion.m119676a()), companion.m119678c().m11563a(companion.m119681f()), null, AbstractC37817c.m121344e(-423369550, c28655q, new C0542f(headerItems, itemViewEventHelper, homeMetaData, 18)), c28655q, 200064, 18);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17734d1(headerItems, scrollState, itemViewEventHelper, homeMetaData, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final boolean m54135h(C13821r1 c13821r1) {
        return c13821r1.f49318a.m87024x() > 0;
    }

    /* JADX INFO: renamed from: i */
    private static final boolean m54136i(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m54137j(List list, C18665d0 c18665d0, C14600d c14600d, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        float f13 = 2 * 8;
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f13, c2314t));
        m54139l(list, c18665d0, c14600d, composer, 0);
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f13, c2314t));
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m54138k(List list, C13821r1 c13821r1, C18665d0 c18665d0, C14600d c14600d, int i13, Composer composer, int i14) {
        m54134g(list, c13821r1, c18665d0, c14600d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m54139l(List<? extends InterfaceC25312u> list, C18665d0 c18665d0, C14600d c14600d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1478548065);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c18665d0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c14600d) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            c28655q.m87150e0(-555750460);
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                float f13 = (i15 < list.size() - 1 ? 2 : 0) * 8;
                boolean zM87157i = c28655q.m87157i(c18665d0) | c28655q.m87157i(interfaceC25312u);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new a(c18665d0, interfaceC25312u, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                C25307p c25307pM54175b = AbstractC18667e0.m54175b();
                C13698g c13698g = new C13698g(f13, 3);
                boolean zM87157i2 = c28655q.m87157i(c18665d0) | c28655q.m87157i(interfaceC25312u) | c28655q.m87157i(c14600d);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C18468h(c18665d0, interfaceC25312u, c14600d, 3);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM54175b, c13698g, (Function1) objM87133R2, c28655q, C25307p.f99300b << 3, 0);
                i15 = i16;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(list, c18665d0, c14600d, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Modifier m54140m(float f13, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-996303149);
        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m54141n(C18665d0 c18665d0, InterfaceC25312u interfaceC25312u, C14600d c14600d, Object it) {
        AbstractC22676k.m65750j(it, "it");
        c18665d0.m54172j(interfaceC25312u, c14600d, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m54142o(List list, C18665d0 c18665d0, C14600d c14600d, int i13, Composer composer, int i14) {
        m54139l(list, c18665d0, c14600d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

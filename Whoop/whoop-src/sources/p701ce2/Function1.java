package p701ce2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1935f;
import az1.C2161b;
import b01.C2192m;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import be2.C3174a;
import be2.C3176c;
import be2.InterfaceC3175b;
import be2.InterfaceC3177d;
import bf0.C3189a;
import c62.C4273a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd0.C4435a;
import coil.compose.AsyncImagePainter$State$Success;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd2.AbstractC22415a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mh.C25540h;
import nf3.C26669a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p341nh.C26714h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: ce2.c, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function1;", "Lbe2/b$c;", "Ll83/a0;", "onNavEvent", "B", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lbe2/d;", "viewState", "Lbe2/b;", "onEvent", "A", "(Lbe2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lbe2/d$a;", "q", "(Lbe2/d$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lbe2/a;", "regulatoryInfoViewState", "", "isImageLoaded", "Lkotlin/Function0;", "onImageLoadSuccess", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lbe2/a;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Lbe2/d$b;", "m", "(Lbe2/d$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lbe2/c;", "viewModel", "shepherd_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {

    /* JADX INFO: renamed from: ce2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f18102w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f18103x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f18104y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f18105z;

        /* JADX INFO: renamed from: ce2.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41343a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f18106w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41343a(C21647a c21647a) {
                super(0);
                this.f18106w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f18106w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f18102w = c38266c;
            this.f18103x = interfaceC35951a;
            this.f18104y = interfaceC4339a;
            this.f18105z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, be2.c] */
        @Override // c93.InterfaceC4339a
        public final C3176c invoke() {
            return AbstractC21598x.m60668X(this.f18102w, this.f18103x, new C41343a(this.f18105z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3176c.class), null, this.f18104y);
        }
    }

    /* JADX INFO: renamed from: ce2.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.registration.view.ShepherdRegistrationScreenKt$ShepherdRegistrationScreen$1$1", m100430f = "ShepherdRegistrationScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18107w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f18108x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18108x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f18108x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18107w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Function1.m14077C(this.f18108x).m9146p(InterfaceC3175b.b.f12425a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    public static final void m14075A(InterfaceC3177d viewState, p715kotlin.jvm.functions.Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(220542708);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (viewState instanceof InterfaceC3177d.b) {
            c28655q.m87150e0(1488151789);
            m14095m((InterfaceC3177d.b) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        } else {
            if (!(viewState instanceof InterfaceC3177d.a)) {
                throw AbstractC11895b.m32003v(1488149436, c28655q, false);
            }
            c28655q.m87150e0(1488155258);
            m14099q((InterfaceC3177d.a) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(viewState, onEvent, i13, 0);
        }
    }

    /* JADX INFO: renamed from: B */
    public static final void m14076B(p715kotlin.jvm.functions.Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-48159636);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onNavEvent) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC13058l viewState = m14077C(interfaceC23462h).getViewState();
            InterfaceC3177d.b bVarM9159b = InterfaceC3177d.b.INSTANCE.m9159b();
            int i15 = AbstractC33208p0.f138461d;
            int i16 = TextResource.$stable;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, bVarM9159b, null, c28655q, (((i15 | i16) | i16) | i16) << 3, 2);
            C3176c c3176cM14077C = m14077C(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(interfaceC23462h);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c3176cM14077C);
            InterfaceC3177d interfaceC3177dM14078D = m14078D(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i14 & 14) == 4);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4493a(onNavEvent, interfaceC23462h, 0);
                c28655q.m87172p0(objM87133R3);
            }
            m14075A(interfaceC3177dM14078D, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(onNavEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C3176c m14077C(InterfaceC23462h interfaceC23462h) {
        return (C3176c) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: D */
    private static final InterfaceC3177d m14078D(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC3177d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m14079E(p715kotlin.jvm.functions.Function1 function1, InterfaceC23462h interfaceC23462h, InterfaceC3175b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC3175b.d) {
            m14077C(interfaceC23462h).m9146p((InterfaceC3175b.d) event);
        } else {
            if (!(event instanceof InterfaceC3175b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m14080F(p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m14076B(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m14081G(InterfaceC3177d interfaceC3177d, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m14075A(interfaceC3177d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m14095m(InterfaceC3177d.b viewState, p715kotlin.jvm.functions.Function1 onEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-73372658);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            AbstractC33208p0 abstractC33208p0M9157f = viewState.getType();
            TextResource textResourceM9156e = viewState.getSupportText();
            TextResource textResourceM9154c = viewState.getPrimaryButtonText();
            int i16 = i15 & 112;
            boolean z4 = i16 == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C3189a(onEvent, 16);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            TextResource textResourceM9155d = viewState.getSecondaryButtonText();
            boolean z13 = i16 == 32;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C3189a(onEvent, 17);
                c28655q2.m87172p0(objM87133R2);
            }
            int i17 = 196608 | AbstractC33208p0.f138461d;
            int i18 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(abstractC33208p0M9157f, textResourceM9156e, null, textResourceM9154c, interfaceC4339a, true, false, textResourceM9155d, (InterfaceC4339a) objM87133R2, null, false, false, c28655q, i17 | (i18 << 3) | (i18 << 9) | (i18 << 21), 0, 3652);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(viewState, onEvent, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m14096n(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC3175b.b.f12425a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m14097o(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC3175b.a.f12424a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m14098p(InterfaceC3177d.b bVar, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m14095m(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0168  */
    /* JADX WARN: Code duplicated, block: B:48:0x016c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0187  */
    /* JADX WARN: Code duplicated, block: B:57:0x023c  */
    /* JADX WARN: Code duplicated, block: B:59:0x024e  */
    /* JADX WARN: Code duplicated, block: B:60:0x025b  */
    /* JADX INFO: renamed from: q */
    private static final void m14099q(InterfaceC3177d.a aVar, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13) {
        int i14;
        boolean z4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        C28676v0 c28676v0;
        int iHashCode;
        Object objM87133R2;
        C28676v0 c28676v1;
        InterfaceC28601c1 interfaceC28601c2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2124843272);
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(aVar) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (objM87133R3 == c28676v2) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM94757f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                i14 = i15;
            } else {
                i14 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(aVar.getPageTitle(), null, Integer.valueOf(aVar.getIcon()), AbstractC30060g.m92103Y(c28655q, AbstractC22415a.f87687d), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                if ((i14 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == c28676v2) {
                    objM87133R = new C3189a(function1, 15);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = interfaceC28601c3;
                c28676v0 = c28676v2;
                AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                float f13 = 8;
                float f14 = 2 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                TextResource textResourceM9148b = aVar.getHeaderTitle();
                int i16 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM9148b, c28655q, i16);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
                C2886a c2886aM8417O = c38072d.m121952e(c28655q, i17).getT2();
                int i18 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i18, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getDescription(), c28655q, i16), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i18, 196602);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f13, c2314t));
                c28655q.m87150e0(-1391865886);
                for (C3174a c3174a : aVar.m9151e()) {
                    boolean zM14100r = m14100r(interfaceC28601c1);
                    objM87133R2 = c28655q.m87133R();
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R2 = new C2192m(15, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    m14105w(c3174a, zM14100r, (InterfaceC4339a) objM87133R2, c28655q, 384);
                    c28676v0 = c28676v1;
                    interfaceC28601c1 = interfaceC28601c2;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            AbstractC6721d.a aVar3 = new AbstractC6721d.a(aVar.getPageTitle(), null, Integer.valueOf(aVar.getIcon()), AbstractC30060g.m92103Y(c28655q, AbstractC22415a.f87687d), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            if ((i14 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z4) {
                objM87133R = new C3189a(function1, 15);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3189a(function1, 15);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = interfaceC28601c3;
            c28676v0 = c28676v2;
            AbstractC6719b.m20143d(null, aVar3, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            float f15 = 8;
            float f16 = 2 * f15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), c2305k, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            TextResource textResourceM9148b2 = aVar.getHeaderTitle();
            int i19 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM9148b2, c28655q, i19);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            long jM125430y2 = c38072d2.m121949b(c28655q, i110).getBrandWhite();
            C2886a c2886aM8417O2 = c38072d2.m121952e(c28655q, i110).getT2();
            int i111 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q, 0, i111, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getDescription(), c28655q, i19), null, c38072d2.m121949b(c28655q, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getB1(), null, c28655q, 0, i111, 196602);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f15, c2314t));
            c28655q.m87150e0(-1391865886);
            while (r0.hasNext()) {
                boolean zM14100r2 = m14100r(interfaceC28601c1);
                objM87133R2 = c28655q.m87133R();
                c28676v1 = c28676v0;
                if (objM87133R2 == c28676v1) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R2 = new C2192m(15, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                }
                m14105w(c3174a, zM14100r2, (InterfaceC4339a) objM87133R2, c28655q, 384);
                c28676v0 = c28676v1;
                interfaceC28601c1 = interfaceC28601c2;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(aVar, function1, i13, 1);
        }
    }

    /* JADX INFO: renamed from: r */
    private static final boolean m14100r(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m14101s(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m14102t(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC3175b.a.f12424a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m14103u(InterfaceC28601c1 interfaceC28601c1) {
        m14101s(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m14104v(InterfaceC3177d.a aVar, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m14099q(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m14105w(C3174a c3174a, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1000139449);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(c3174a) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            String strM21274h = AbstractC8693b.m21274h(c3174a.getSectionTitle(), c28655q2, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getT2(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            C28655q c28655q3 = c28655q2;
            for (AbstractC22403o abstractC22403o : c3174a.m9140b()) {
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R = c28655q3.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C2161b(interfaceC4339a, 8);
                    c28655q3.m87172p0(objM87133R);
                }
                p715kotlin.jvm.functions.Function1 function1 = (p715kotlin.jvm.functions.Function1) objM87133R;
                Object objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C4273a(7);
                    c28655q3.m87172p0(objM87133R2);
                }
                C28655q c28655q4 = c28655q3;
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, function1, (p715kotlin.jvm.functions.Function1) objM87133R2, c28655q4, AbstractC22403o.f87638a | 384, 0);
                float fIntBitsToFloat = z4 ? Float.intBitsToFloat((int) (abstractC26165aM64500i.getF4822H() >> 32)) / Float.intBitsToFloat((int) (abstractC26165aM64500i.getF4822H() & 4294967295L)) : 1.0f;
                C2314t c2314t = C2314t.f9131w;
                c28655q3 = c28655q4;
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(AbstractC1099a.m3384f(c2314t, false, fIntBitsToFloat)), null, C39102j.f168200b, 0.0f, null, c28655q3, 24624, 104);
            }
            c28655q = c28655q3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(c3174a, z4, interfaceC4339a, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m14106x(InterfaceC4339a interfaceC4339a, AsyncImagePainter$State$Success it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m14107y(C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75121e(C26714h.f106216c);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m14108z(C3174a c3174a, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m14105w(c3174a, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

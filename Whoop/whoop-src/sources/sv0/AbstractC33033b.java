package sv0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import java.io.IOException;
import l83.C23454a0;
import lv0.AbstractC24758a;
import lv0.C24759b;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import oq1.C28119c;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC37785x;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p738tv0.AbstractC34202b;
import pv0.C29576c;
import pv0.C29577d;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import s90.C32290f;
import su1.C33018d;

/* JADX INFO: renamed from: sv0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lpv0/c;", "viewModel", "Leb/u0;", "composeNavController", "Llv0/b;", "analyticsHelper", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "e", "(Lpv0/c;Leb/u0;Llv0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lpv0/d;", "viewState", "content-search_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33033b {

    /* JADX INFO: renamed from: sv0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.contentsearch.view.navigation.ContentSearchNavHostKt$ContentSearchNavHost$1$1$2$1$1", m100430f = "ContentSearchNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137582w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24759b f137583x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C24759b c24759b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137583x = c24759b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f137583x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137582w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f137583x.m72499a(new AbstractC24758a.e(null, null, 3, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m104304e(C29576c viewModel, C12991u0 composeNavController, C24759b analyticsHelper, Function1 onEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-85699080);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(composeNavController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(analyticsHelper) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), new C29577d(false, false, false, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, 131071, null), null, c28655q2, 0, 2);
            boolean zM87153g = c28655q2.m87153g(interfaceC28601c1M87260n) | ((i14 & 7168) == 2048) | c28655q2.m87157i(analyticsHelper);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C32290f(onEvent, interfaceC28601c1M87260n, analyticsHelper, 4);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC17269i.m48888e(composeNavController, "LANDING", null, (Function1) objM87133R, c28655q2, (i14 >> 3) & 14);
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33018d(i13, 1, viewModel, composeNavController, analyticsHelper, onEvent);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final C29577d m104305f(InterfaceC28670t2 interfaceC28670t2) {
        return (C29577d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104306g(Function1 function1, InterfaceC28670t2 interfaceC28670t2, C24759b c24759b, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "LANDING", null, new C37816b(new C28119c(function1, interfaceC28670t2), true, -2109164675), 6);
        AbstractC12889b.m36291u(NavHost, "SEARCH", null, new C37816b(new C26949h((Object) c24759b, function1, (Object) interfaceC28670t2, 15), true, -1239485132), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m104307h(Function1 function1, InterfaceC28670t2 interfaceC28670t2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC37785x.m121280a(m104305f(interfaceC28670t2), function1, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m104308i(C24759b c24759b, Function1 function1, InterfaceC28670t2 interfaceC28670t2, C12982q it, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c24759b);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new a(c24759b, null);
            c28655q.m87172p0(objM87133R);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        AbstractC34202b.m108107e(m104305f(interfaceC28670t2), function1, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m104309j(C29576c c29576c, C12991u0 c12991u0, C24759b c24759b, Function1 function1, int i13, Composer composer, int i14) {
        m104304e(c29576c, c12991u0, c24759b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

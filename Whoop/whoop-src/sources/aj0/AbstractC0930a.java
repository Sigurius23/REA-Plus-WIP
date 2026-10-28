package aj0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import l83.C23454a0;
import p000.C22079k;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ri0.InterfaceC31443b;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ti0.C33841f;

/* JADX INFO: renamed from: aj0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lti0/f;", "navigationState", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "action", "b", "(Lti0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0930a {

    /* JADX INFO: renamed from: aj0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.template.navigation.NavigationTemplateScreenContentKt$NavigationTemplateScreenContent$1$1", m100430f = "NavigationTemplateScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3423w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33841f f3424x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f3425y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C33841f c33841f, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3424x = c33841f;
            this.f3425y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f3424x, this.f3425y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f3423w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC22676k.m65745e(this.f3424x.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                this.f3425y.invoke(new InterfaceC31443b.c(this.f3424x.getDestination(), true));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2364b(C33841f navigationState, Function1 action, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(navigationState, "navigationState");
        AbstractC22676k.m65750j(action, "action");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(544041822);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(navigationState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(action) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Function0.m105274p(C33205o0.f138451a.m105288b(), null, null, c28655q, C33211q0.f138501k, 6);
            C9598e destination = navigationState.getDestination();
            boolean zM87157i = c28655q.m87157i(navigationState) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new a(navigationState, action, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, destination);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(navigationState, action, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m2365c(C33841f c33841f, Function1 function1, int i13, Composer composer, int i14) {
        m2364b(c33841f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

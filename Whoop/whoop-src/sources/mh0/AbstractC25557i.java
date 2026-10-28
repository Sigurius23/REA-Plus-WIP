package mh0;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c91.InterfaceC4327a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.items.ActionButtonStyle;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.ApiRequest;
import gz0.EnumC16313m0;
import l01.C23045q;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import m31.C25002h;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: mh0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lmh0/h;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lmh0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lmh0/e;", "miniArchState", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25557i {

    /* JADX INFO: renamed from: mh0.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.startturnbutton.StartTurnButtonWrapperKt$StartTurnButtonWrapper$1$1", m100430f = "StartTurnButtonWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100213w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f100214x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC23864c<C25553e, InterfaceC25554f> f100215y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f100216z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, AbstractC23864c<C25553e, InterfaceC25554f> abstractC23864c, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100214x = function1;
            this.f100215y = abstractC23864c;
            this.f100216z = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f100214x, this.f100215y, this.f100216z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100213w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String pendingTurnId = AbstractC25557i.m75154d(this.f100216z).getPendingTurnId();
            if (pendingTurnId != null) {
                this.f100214x.invoke(new InterfaceC4327a.a(pendingTurnId));
                this.f100215y.mo1216g(InterfaceC25554f.a.f100197a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m75153c(Modifier modifier, C25556h itemState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        String str;
        char c3;
        AbstractC23864c abstractC23864c;
        AbstractC23864c abstractC23864c2;
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-499704393);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q2.m87135U(i17 & 1, (i17 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            C25553e c25553e = new C25553e(false, null, 3, null);
            ApiRequest apiRequestM75148f = itemState.getRequest();
            if (AbstractC39414r.m125890i0(apiRequestM75148f.getPath())) {
                apiRequestM75148f = null;
            }
            if (apiRequestM75148f != null) {
                str = apiRequestM75148f.getPath() + ":" + apiRequestM75148f.getMethod() + ":" + apiRequestM75148f.getBody();
            } else {
                str = null;
            }
            c28655q2.m87150e0(1371609227);
            boolean zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, 6).isFeatureEnabled("safe-design-view-model-injection-android");
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zIsFeatureEnabled) {
                InterfaceC1583f2 interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q2, -707312137, false, c28655q2);
                Context applicationContext = ((Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                boolean zM87153g = c28655q2.m87153g(str) | c28655q2.m87153g(c25553e) | c28655q2.m87153g(null);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    c3 = 3;
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c25553e, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25555g.class), null, str);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    c3 = 3;
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-707976188);
                InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q2);
                if (interfaceC1583f2M73844a == null) {
                    c28655q2.m87150e0(-707931115);
                    c28655q2.m87173q(false);
                    abstractC23864c2 = null;
                } else {
                    c28655q2.m87150e0(-707931114);
                    Context applicationContext2 = ((Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                    Application application2 = (Application) applicationContext2;
                    boolean zM87153g2 = c28655q2.m87153g(str) | c28655q2.m87153g(c25553e) | c28655q2.m87153g(null);
                    Object objM87133R2 = c28655q2.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25555g.class), null, new C23863b(c25553e), str);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    abstractC23864c2 = (AbstractC23864c) objM87133R2;
                    c28655q2.m87173q(false);
                }
                if (abstractC23864c2 == null) {
                    c28655q2.m87150e0(-707430526);
                    boolean zM87153g3 = c28655q2.m87153g(null) | c28655q2.m87153g(str) | c28655q2.m87153g(c25553e);
                    Object objM87133R3 = c28655q2.m87133R();
                    if (zM87153g3 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C23863b(c25553e);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    abstractC23864c2 = (C23863b) objM87133R3;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-438479417);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(false);
                abstractC23864c = abstractC23864c2;
                c3 = 3;
                c28676v0 = c28676v0;
            }
            AbstractC23864c abstractC23864c3 = abstractC23864c;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c25553e, null, c28655q2, 0, 2);
            String pendingTurnId = m75154d(interfaceC28601c1M87260n).getPendingTurnId();
            boolean zM87153g4 = c28655q2.m87153g(interfaceC28601c1M87260n) | ((i17 & 896) == 256) | c28655q2.m87157i(abstractC23864c3);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87153g4 || objM87133R4 == c28676v0) {
                objM87133R4 = new a(onViewEvent, abstractC23864c3, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, pendingTurnId);
            TextResource textResourceM75150h = itemState.getTitle();
            EnumC16313m0 enumC16313m0M75146c = itemState.getIcon();
            ActionButtonStyle actionButtonStyleM75149g = itemState.getStyle();
            InterfaceC39332e interfaceC39332eM75145b = itemState.getForegroundColor();
            InterfaceC39332e interfaceC39332eM75147e = itemState.getIconColor();
            InterfaceC39332e interfaceC39332eM75144a = itemState.getBackgroundColor();
            boolean isEnabled = m75154d(interfaceC28601c1M87260n).getIsEnabled();
            boolean zM87157i = c28655q2.m87157i(abstractC23864c3) | c28655q2.m87157i(itemState);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new C23045q(28, abstractC23864c3, itemState);
                c28655q2.m87172p0(objM87133R5);
            }
            Modifier modifier4 = modifier3;
            AbstractC25552d.m75133c(modifier4, textResourceM75150h, enumC16313m0M75146c, actionButtonStyleM75149g, interfaceC39332eM75145b, interfaceC39332eM75147e, interfaceC39332eM75144a, isEnabled, (InterfaceC4339a) objM87133R5, c28655q2, (i17 & 14) | (TextResource.$stable << 3), 0);
            c28655q = c28655q2;
            modifier2 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(modifier2, itemState, onViewEvent, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C25553e m75154d(InterfaceC28670t2 interfaceC28670t2) {
        return (C25553e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m75155e(AbstractC23864c abstractC23864c, C25556h c25556h) {
        abstractC23864c.mo1216g(new InterfaceC25554f.b(c25556h.getRequest()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m75156f(Modifier modifier, C25556h c25556h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m75153c(modifier, c25556h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

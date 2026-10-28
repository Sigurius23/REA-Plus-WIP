package fh0;

import am2.C1012d;
import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.UpdateAction;
import f02.C13917c;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;

/* JADX INFO: renamed from: fh0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lfh0/h;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lfh0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lfh0/e;", "miniArchState", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14487i {

    /* JADX INFO: renamed from: fh0.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.contextstatustoggle.ContextStatusToggleWrapperKt$ContextStatusToggleWrapper$1$1", m100430f = "ContextStatusToggleWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f52903w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C14483e, InterfaceC14484f> f52904x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14486h f52905y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C14483e, InterfaceC14484f> abstractC23864c, C14486h c14486h, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f52904x = abstractC23864c;
            this.f52905y = c14486h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f52904x, this.f52905y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f52903w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f52904x.mo1216g(new InterfaceC14484f.a(this.f52905y.getIsActive()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m41388c(Modifier modifier, C14486h itemState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC23864c abstractC23864c;
        Object obj;
        Object obj2;
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2005451137);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            C14483e c14483e = new C14483e(itemState.getIsActive(), false, false, 6, null);
            c28655q.m87150e0(1371609227);
            boolean zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zIsFeatureEnabled) {
                InterfaceC1583f2 interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                Context applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c14483e) | c28655q.m87153g(null);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c14483e, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14485g.class), null, null);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
            } else {
                c28655q.m87150e0(-707976188);
                InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj2 = null;
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                    Application application2 = (Application) applicationContext2;
                    boolean zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c14483e) | c28655q.m87153g(null);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14485g.class), null, new C23863b(c14483e), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        obj2 = null;
                        obj = null;
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R2;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    boolean zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c14483e) | c28655q.m87153g(obj);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87153g3 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C23863b(c14483e);
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (C23863b) objM87133R3;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
            AbstractC23864c abstractC23864c2 = abstractC23864c;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), c14483e, null, c28655q, 0, 2);
            Boolean boolValueOf = Boolean.valueOf(itemState.getIsActive());
            boolean zM87157i = c28655q.m87157i(abstractC23864c2) | c28655q.m87157i(itemState);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                objM87133R4 = new a(abstractC23864c2, itemState, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf);
            TextResource activeLabel = m41389d(interfaceC28601c1M87260n).getIsActive() ? itemState.getActiveLabel() : itemState.getInactiveLabel();
            TextResource activeSublabel = m41389d(interfaceC28601c1M87260n).getIsActive() ? itemState.getActiveSublabel() : itemState.getInactiveSublabel();
            UpdateAction activeAction = m41389d(interfaceC28601c1M87260n).getIsActive() ? itemState.getActiveAction() : itemState.getInactiveAction();
            AnalyticEventModel activeAnalyticEvent = m41389d(interfaceC28601c1M87260n).getIsActive() ? itemState.getActiveAnalyticEvent() : itemState.getInactiveAnalyticEvent();
            boolean isActive = m41389d(interfaceC28601c1M87260n).getIsActive();
            boolean z4 = !m41389d(interfaceC28601c1M87260n).getIsLoading();
            TextResource errorMessage = itemState.getErrorMessage();
            boolean showError = m41389d(interfaceC28601c1M87260n).getShowError();
            boolean zM87157i2 = c28655q.m87157i(activeAnalyticEvent) | ((i15 & 896) == 256) | c28655q.m87157i(abstractC23864c2) | c28655q.m87157i(activeAction);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i2 || objM87133R5 == c28676v0) {
                objM87133R5 = new C1012d(activeAnalyticEvent, abstractC23864c2, activeAction, onViewEvent);
                c28655q.m87172p0(objM87133R5);
            }
            int i17 = i15 & 14;
            int i18 = TextResource.$stable;
            Modifier modifier5 = modifier4;
            AbstractC14482d.m41361d(modifier5, activeLabel, activeSublabel, isActive, z4, errorMessage, showError, (InterfaceC4339a) objM87133R5, c28655q, i17 | (i18 << 3) | (i18 << 6) | (i18 << 15), 0);
            c28655q = c28655q;
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 3, modifier3, onViewEvent, itemState);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final C14483e m41389d(InterfaceC28670t2 interfaceC28670t2) {
        return (C14483e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m41390e(AnalyticEventModel analyticEventModel, AbstractC23864c abstractC23864c, UpdateAction updateAction, Function1 function1) {
        if (analyticEventModel != null) {
            AbstractC13673n.m38578y(null, analyticEventModel, function1);
        }
        abstractC23864c.mo1216g(new InterfaceC14484f.b(updateAction));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m41391f(Modifier modifier, C14486h c14486h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m41388c(modifier, c14486h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

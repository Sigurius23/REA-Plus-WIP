package com.whoop.settings;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.C4780c;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.onboarding.OnboardingStatus;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.data.onboarding.OnboardingStatusInteractor;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.C25271y;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p705ea2.AbstractC42783n;
import p705ea2.C12912j;
import p705ea2.C12914k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/settings/OnboardingStatusDebugFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "G", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "I", "()Lcom/whoop/data/onboarding/OnboardingStatusDao;", "onboardingStatusDao", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "x", "H", "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OnboardingStatusDebugFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingStatusDao = AbstractC30060g.m92088H(new C12912j(this, 0));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingStatusChecker = AbstractC30060g.m92088H(new C12912j(this, 1));

    /* JADX INFO: renamed from: com.whoop.settings.OnboardingStatusDebugFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.OnboardingStatusDebugFragment$onCreateView$1$3$1$1", m100430f = "OnboardingStatusDebugFragment.kt", m100431l = {126}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10037a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30136w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f30138y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10037a(Function1 function1, InterfaceC30057d<? super C10037a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30138y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return OnboardingStatusDebugFragment.this.new C10037a(this.f30138y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10037a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30136w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    OnboardingStatusDao onboardingStatusDaoM25069I = OnboardingStatusDebugFragment.this.m25069I();
                    this.f30136w = 1;
                    obj = onboardingStatusDaoM25069I.getOnboardingStatus(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f30138y.invoke((List) obj);
            } catch (Exception unused) {
                this.f30138y.invoke(C25271y.f99162w);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.OnboardingStatusDebugFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.settings.OnboardingStatusDebugFragment$onCreateView$1$4$1$1", m100430f = "OnboardingStatusDebugFragment.kt", m100431l = {136}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10038b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30139w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ OnboardingStatus f30141y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4351m f30142z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10038b(OnboardingStatus onboardingStatus, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C10038b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30141y = onboardingStatus;
            this.f30142z = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return OnboardingStatusDebugFragment.this.new C10038b(this.f30141y, this.f30142z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10038b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30139w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    OnboardingStatusDao onboardingStatusDaoM25069I = OnboardingStatusDebugFragment.this.m25069I();
                    OnboardingStatus onboardingStatus = this.f30141y;
                    this.f30139w = 1;
                    if (onboardingStatusDaoM25069I.updateTable(onboardingStatus, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f30142z.invoke(Boolean.TRUE, null);
            } catch (Exception e5) {
                this.f30142z.invoke(Boolean.FALSE, e5.getMessage());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m25067G() {
        Log.d("OnboardingStatusDebug", "Attempting to sync interactor cache");
        try {
            if (!(m25068H() instanceof OnboardingStatusInteractor)) {
                Log.d("OnboardingStatusDebug", "OnboardingStatusChecker is not OnboardingStatusInteractor");
                m25068H().retriggerOnboardingFetch();
                return;
            }
            OnboardingStatusChecker onboardingStatusCheckerM25068H = m25068H();
            AbstractC22676k.m65748h(onboardingStatusCheckerM25068H, "null cannot be cast to non-null type com.whoop.data.onboarding.OnboardingStatusInteractor");
            OnboardingStatusInteractor onboardingStatusInteractor = (OnboardingStatusInteractor) onboardingStatusCheckerM25068H;
            Log.d("OnboardingStatusDebug", "Found OnboardingStatusInteractor instance");
            try {
                Method declaredMethod = OnboardingStatusInteractor.class.getDeclaredMethod("loadOnboardingStatusFromTable", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(onboardingStatusInteractor, null);
                Log.d("OnboardingStatusDebug", "Successfully called loadOnboardingStatusFromTable()");
            } catch (Exception e5) {
                Log.e("OnboardingStatusDebug", "Failed to call loadOnboardingStatusFromTable via reflection", e5);
                try {
                    Field declaredField = OnboardingStatusInteractor.class.getDeclaredField("onboardingStatus");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(onboardingStatusInteractor);
                    AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                    Map mapM65772c = AbstractC22681m0.m65772c(obj);
                    int size = mapM65772c.size();
                    mapM65772c.clear();
                    Log.d("OnboardingStatusDebug", "Cleared cache with " + size + " entries");
                } catch (Exception e13) {
                    Log.e("OnboardingStatusDebug", "Failed to clear cache via reflection", e13);
                }
                m25068H().retriggerOnboardingFetch();
            }
        } catch (Exception e14) {
            Log.e("OnboardingStatusDebug", "Failed to sync interactor cache", e14);
            m25068H().retriggerOnboardingFetch();
        }
    }

    /* JADX INFO: renamed from: H */
    private final OnboardingStatusChecker m25068H() {
        return (OnboardingStatusChecker) this.onboardingStatusChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final OnboardingStatusDao m25069I() {
        return (OnboardingStatusDao) this.onboardingStatusDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m25070J(OnboardingStatusDebugFragment onboardingStatusDebugFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(onboardingStatusDebugFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C12912j(onboardingStatusDebugFragment, 2);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(onboardingStatusDebugFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C12912j(onboardingStatusDebugFragment, 3);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(onboardingStatusDebugFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4780c(onboardingStatusDebugFragment, 28);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(onboardingStatusDebugFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C12914k(onboardingStatusDebugFragment, 1);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC42783n.m36348l(interfaceC4339a, interfaceC4339a2, function1, (InterfaceC4351m) objM87133R4, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m25071K(OnboardingStatusDebugFragment onboardingStatusDebugFragment) {
        AbstractC5583n.m16799z(onboardingStatusDebugFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m25072L(OnboardingStatusDebugFragment onboardingStatusDebugFragment) {
        onboardingStatusDebugFragment.m25067G();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m25073M(OnboardingStatusDebugFragment onboardingStatusDebugFragment, Function1 callback) {
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(onboardingStatusDebugFragment), null, null, onboardingStatusDebugFragment.new C10037a(callback, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m25074N(OnboardingStatusDebugFragment onboardingStatusDebugFragment, OnboardingStatus status, InterfaceC4351m callback) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(onboardingStatusDebugFragment), null, null, onboardingStatusDebugFragment.new C10038b(status, callback, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final OnboardingStatusChecker m25075O(OnboardingStatusDebugFragment onboardingStatusDebugFragment) {
        return (OnboardingStatusChecker) AbstractC29125c.m88492A(onboardingStatusDebugFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OnboardingStatusChecker.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final OnboardingStatusDao m25076P(OnboardingStatusDebugFragment onboardingStatusDebugFragment) {
        return (OnboardingStatusDao) AbstractC29125c.m88492A(onboardingStatusDebugFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OnboardingStatusDao.class), null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C12914k(this, 0), true, 618121534));
    }
}

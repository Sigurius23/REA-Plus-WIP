package com.whoop.profile.view;

import a81.InterfaceC0569t;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.RunnableC1319m;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.profile.navigation.ProfileActionRouter;
import com.whoop.profile.navigation.ProfileNavigationRouter;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.ProfileViewModel;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, m65681d2 = {"Lcom/whoop/profile/view/ProfileScreenEventRouter;", "", "Lcom/whoop/profile/navigation/ProfileActionRouter;", "actionRouter", "Lcom/whoop/profile/presentation/ProfileViewModel;", "viewModel", "Lcom/whoop/profile/navigation/ProfileNavigationRouter;", "navRouter", "Lkotlin/Function1;", "Ljava/lang/Runnable;", "Ll83/a0;", "runAfterCurrentEvent", "<init>", "(Lcom/whoop/profile/navigation/ProfileActionRouter;Lcom/whoop/profile/presentation/ProfileViewModel;Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lkotlin/jvm/functions/Function1;)V", "scheduleDeferredClearIfCancelOnly", "()V", "Lcom/whoop/profile/presentation/ProfileEvent;", NotificationCompat.CATEGORY_EVENT, "onProfileScreenEvent", "(Lcom/whoop/profile/presentation/ProfileEvent;)V", "La81/t;", "modalEvent", "onGenericModalEvent", "(La81/t;)V", "Lcom/whoop/profile/navigation/ProfileActionRouter;", "Lcom/whoop/profile/presentation/ProfileViewModel;", "Lcom/whoop/profile/navigation/ProfileNavigationRouter;", "Lkotlin/jvm/functions/Function1;", "", "pendingModalCardButtonId", "Ljava/lang/String;", "deferredModalCardButtonIdForConfirm", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileScreenEventRouter {
    public static final int $stable = 8;
    private final ProfileActionRouter actionRouter;
    private String deferredModalCardButtonIdForConfirm;
    private final ProfileNavigationRouter navRouter;
    private String pendingModalCardButtonId;
    private final Function1 runAfterCurrentEvent;
    private final ProfileViewModel viewModel;

    public ProfileScreenEventRouter(ProfileActionRouter actionRouter, ProfileViewModel viewModel, ProfileNavigationRouter navRouter, Function1 runAfterCurrentEvent) {
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(runAfterCurrentEvent, "runAfterCurrentEvent");
        this.actionRouter = actionRouter;
        this.viewModel = viewModel;
        this.navRouter = navRouter;
        this.runAfterCurrentEvent = runAfterCurrentEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _init_$lambda$0(Runnable runnable) {
        AbstractC22676k.m65750j(runnable, "runnable");
        new Handler(Looper.getMainLooper()).post(runnable);
        return C23454a0.f92919a;
    }

    private final void scheduleDeferredClearIfCancelOnly() {
        this.runAfterCurrentEvent.invoke(new RunnableC1319m(this, 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onGenericModalEvent(InterfaceC0569t modalEvent) {
        AbstractC22676k.m65750j(modalEvent, "modalEvent");
        if (modalEvent instanceof InterfaceC0569t.b) {
            InterfaceC0569t.b bVar = (InterfaceC0569t.b) modalEvent;
            onProfileScreenEvent(new ProfileEvent.ItemClicked(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), bVar.getElement()));
            return;
        }
        String str = null;
        Object[] objArr = 0;
        if (modalEvent instanceof InterfaceC0569t.a) {
            this.deferredModalCardButtonIdForConfirm = this.pendingModalCardButtonId;
            this.pendingModalCardButtonId = null;
            this.viewModel.sendViewEvent(ProfileEvent.DismissDesignModal.INSTANCE);
            scheduleDeferredClearIfCancelOnly();
            return;
        }
        if (modalEvent instanceof InterfaceC0569t.f) {
            this.viewModel.sendViewEvent(new ProfileEvent.PresentDesignModal(((InterfaceC0569t.f) modalEvent).getModal(), str, 2, objArr == true ? 1 : 0));
            return;
        }
        if (modalEvent instanceof InterfaceC0569t.d) {
            String str2 = this.deferredModalCardButtonIdForConfirm;
            this.deferredModalCardButtonIdForConfirm = null;
            this.viewModel.sendViewEvent(new ProfileEvent.ExecuteWhoopAction(((InterfaceC0569t.d) modalEvent).getAction(), str2));
        } else if (modalEvent instanceof InterfaceC0569t.c) {
            this.navRouter.route(new ProfileEvent.BackendDrivenNavigation(((InterfaceC0569t.c) modalEvent).getDestination(), "profile", null, 4, null));
        } else {
            if (!(modalEvent instanceof InterfaceC0569t.e)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navRouter.route(new ProfileEvent.PerformDismissNavigation(((InterfaceC0569t.e) modalEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()));
        }
    }

    public final void onProfileScreenEvent(ProfileEvent event) {
        AbstractC22676k.m65750j(event, "event");
        ProfileEvent profileEventRoute = this.actionRouter.route(event);
        if (profileEventRoute instanceof ProfileEvent.NavigationEvent) {
            this.navRouter.route((ProfileEvent.NavigationEvent) profileEventRoute);
        } else if (profileEventRoute instanceof ProfileEvent.ViewEvent) {
            if (profileEventRoute instanceof ProfileEvent.PresentDesignModal) {
                this.pendingModalCardButtonId = ((ProfileEvent.PresentDesignModal) profileEventRoute).getCardButtonId();
                this.deferredModalCardButtonIdForConfirm = null;
            }
            this.viewModel.sendViewEvent((ProfileEvent.ViewEvent) profileEventRoute);
        }
    }

    public /* synthetic */ ProfileScreenEventRouter(ProfileActionRouter profileActionRouter, ProfileViewModel profileViewModel, ProfileNavigationRouter profileNavigationRouter, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(profileActionRouter, profileViewModel, profileNavigationRouter, (i13 & 8) != 0 ? new C6498i(20) : function1);
    }
}

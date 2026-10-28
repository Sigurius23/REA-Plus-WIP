package com.whoop.navigation;

import j02.C21173v0;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.navigation.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lcom/whoop/navigation/e;", "", "Lcom/whoop/navigation/AppScreen;", HMSTrackSource.SCREEN, "Lcom/whoop/navigation/NavigationScreenModel;", "parameters", "Lj02/v0;", "tab", "<init>", "(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;)V", "a", "(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;)Lcom/whoop/navigation/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/AppScreen;", "d", "()Lcom/whoop/navigation/AppScreen;", "b", "Lcom/whoop/navigation/NavigationScreenModel;", "c", "()Lcom/whoop/navigation/NavigationScreenModel;", "Lj02/v0;", "e", "()Lj02/v0;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C9598e {

    /* JADX INFO: renamed from: d */
    public static final int f28134d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AppScreen screen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final NavigationScreenModel parameters;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21173v0 tab;

    public C9598e(AppScreen screen, NavigationScreenModel parameters, C21173v0 c21173v0) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.screen = screen;
        this.parameters = parameters;
        this.tab = c21173v0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C9598e m23127b(C9598e c9598e, AppScreen appScreen, NavigationScreenModel navigationScreenModel, C21173v0 c21173v0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            appScreen = c9598e.screen;
        }
        if ((i13 & 2) != 0) {
            navigationScreenModel = c9598e.parameters;
        }
        if ((i13 & 4) != 0) {
            c21173v0 = c9598e.tab;
        }
        return c9598e.m23128a(appScreen, navigationScreenModel, c21173v0);
    }

    /* JADX INFO: renamed from: a */
    public final C9598e m23128a(AppScreen screen, NavigationScreenModel parameters, C21173v0 tab) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(parameters, "parameters");
        return new C9598e(screen, parameters, tab);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final NavigationScreenModel getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AppScreen getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C21173v0 getTab() {
        return this.tab;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C9598e)) {
            return false;
        }
        C9598e c9598e = (C9598e) other;
        return AbstractC22676k.m65745e(this.screen, c9598e.screen) && AbstractC22676k.m65745e(this.parameters, c9598e.parameters) && AbstractC22676k.m65745e(this.tab, c9598e.tab);
    }

    public int hashCode() {
        int iHashCode = (this.parameters.hashCode() + (this.screen.hashCode() * 31)) * 31;
        C21173v0 c21173v0 = this.tab;
        return iHashCode + (c21173v0 == null ? 0 : c21173v0.hashCode());
    }

    public String toString() {
        return "NavigationAction(screen=" + this.screen + ", parameters=" + this.parameters + ", tab=" + this.tab + ")";
    }

    public /* synthetic */ C9598e(AppScreen appScreen, NavigationScreenModel navigationScreenModel, C21173v0 c21173v0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AppScreen.C9318g6.f27632w : appScreen, (i13 & 2) != 0 ? NavigationScreenModel.None.INSTANCE : navigationScreenModel, (i13 & 4) != 0 ? null : c21173v0);
    }
}

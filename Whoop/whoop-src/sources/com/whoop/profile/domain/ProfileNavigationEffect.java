package com.whoop.profile.domain;

import com.whoop.navigation.C9598e;
import j02.C21166s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileNavigationEffect;", "", "BackendDriven", "PerformDismiss", "Companion", "Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;", "Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ProfileNavigationEffect {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String PROFILE_NAVIGATION_SOURCE = "profile";

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileNavigationEffect$Companion;", "", "<init>", "()V", "PROFILE_NAVIGATION_SOURCE", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PROFILE_NAVIGATION_SOURCE = "profile";

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;", "Lcom/whoop/profile/domain/ProfileNavigationEffect;", "Lj02/s;", "dismissEvent", "<init>", "(Lj02/s;)V", "component1", "()Lj02/s;", "copy", "(Lj02/s;)Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj02/s;", "getDismissEvent", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PerformDismiss implements ProfileNavigationEffect {
        public static final int $stable = C21166s.f80697d;
        private final C21166s dismissEvent;

        public PerformDismiss(C21166s dismissEvent) {
            AbstractC22676k.m65750j(dismissEvent, "dismissEvent");
            this.dismissEvent = dismissEvent;
        }

        public static /* synthetic */ PerformDismiss copy$default(PerformDismiss performDismiss, C21166s c21166s, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c21166s = performDismiss.dismissEvent;
            }
            return performDismiss.copy(c21166s);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final C21166s getDismissEvent() {
            return this.dismissEvent;
        }

        public final PerformDismiss copy(C21166s dismissEvent) {
            AbstractC22676k.m65750j(dismissEvent, "dismissEvent");
            return new PerformDismiss(dismissEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PerformDismiss) && AbstractC22676k.m65745e(this.dismissEvent, ((PerformDismiss) other).dismissEvent);
        }

        public final C21166s getDismissEvent() {
            return this.dismissEvent;
        }

        public int hashCode() {
            return this.dismissEvent.hashCode();
        }

        public String toString() {
            return "PerformDismiss(dismissEvent=" + this.dismissEvent + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;", "Lcom/whoop/profile/domain/ProfileNavigationEffect;", "Lcom/whoop/navigation/e;", "navAction", "", "source", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;)V", "component1", "()Lcom/whoop/navigation/e;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/profile/domain/ProfileNavigationEffect$BackendDriven;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/e;", "getNavAction", "Ljava/lang/String;", "getSource", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class BackendDriven implements ProfileNavigationEffect {
        public static final int $stable = C9598e.f28134d;
        private final C9598e navAction;
        private final String source;

        public BackendDriven(C9598e navAction, String source) {
            AbstractC22676k.m65750j(navAction, "navAction");
            AbstractC22676k.m65750j(source, "source");
            this.navAction = navAction;
            this.source = source;
        }

        public static /* synthetic */ BackendDriven copy$default(BackendDriven backendDriven, C9598e c9598e, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c9598e = backendDriven.navAction;
            }
            if ((i13 & 2) != 0) {
                str = backendDriven.source;
            }
            return backendDriven.copy(c9598e, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final BackendDriven copy(C9598e navAction, String source) {
            AbstractC22676k.m65750j(navAction, "navAction");
            AbstractC22676k.m65750j(source, "source");
            return new BackendDriven(navAction, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackendDriven)) {
                return false;
            }
            BackendDriven backendDriven = (BackendDriven) other;
            return AbstractC22676k.m65745e(this.navAction, backendDriven.navAction) && AbstractC22676k.m65745e(this.source, backendDriven.source);
        }

        public final C9598e getNavAction() {
            return this.navAction;
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.navAction.hashCode() * 31);
        }

        public String toString() {
            return "BackendDriven(navAction=" + this.navAction + ", source=" + this.source + ")";
        }

        public /* synthetic */ BackendDriven(C9598e c9598e, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c9598e, (i13 & 2) != 0 ? "profile" : str);
        }
    }
}

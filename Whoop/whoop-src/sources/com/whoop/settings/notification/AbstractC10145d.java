package com.whoop.settings.notification;

import ih0.AbstractC18489d0;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.settings.notification.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/settings/notification/d;", "", "<init>", "()V", "a", "b", "c", "Lcom/whoop/settings/notification/d$a;", "Lcom/whoop/settings/notification/d$b;", "Lcom/whoop/settings/notification/d$c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10145d {

    /* JADX INFO: renamed from: com.whoop.settings.notification.d$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/settings/notification/d$a;", "Lcom/whoop/settings/notification/d;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC10145d {

        /* JADX INFO: renamed from: a */
        public static final a f30663a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.d$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/settings/notification/d$b;", "Lcom/whoop/settings/notification/d;", "", "nameSpace", "", "isCurrentlyActive", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC10145d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String nameSpace;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isCurrentlyActive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String nameSpace, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(nameSpace, "nameSpace");
            this.nameSpace = nameSpace;
            this.isCurrentlyActive = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNameSpace() {
            return this.nameSpace;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsCurrentlyActive() {
            return this.isCurrentlyActive;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.nameSpace, bVar.nameSpace) && this.isCurrentlyActive == bVar.isCurrentlyActive;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCurrentlyActive) + (this.nameSpace.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("ToggleNotification(nameSpace=", this.nameSpace, ", isCurrentlyActive=", ")", this.isCurrentlyActive);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.d$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/settings/notification/d$c;", "Lcom/whoop/settings/notification/d;", "", "nameSpace", "", "isDetectionOn", "isNotificationOn", "<init>", "(Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC10145d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String nameSpace;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isDetectionOn;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isNotificationOn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String nameSpace, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(nameSpace, "nameSpace");
            this.nameSpace = nameSpace;
            this.isDetectionOn = z4;
            this.isNotificationOn = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNameSpace() {
            return this.nameSpace;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsDetectionOn() {
            return this.isDetectionOn;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsNotificationOn() {
            return this.isNotificationOn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.nameSpace, cVar.nameSpace) && this.isDetectionOn == cVar.isDetectionOn && this.isNotificationOn == cVar.isNotificationOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNotificationOn) + AbstractC2875y.m8289b(this.nameSpace.hashCode() * 31, 31, this.isDetectionOn);
        }

        public String toString() {
            String str = this.nameSpace;
            boolean z4 = this.isDetectionOn;
            return AbstractC18489d0.m53372m(AbstractC25012a.m73379l("ToggleShepherdNotification(nameSpace=", str, ", isDetectionOn=", ", isNotificationOn=", z4), this.isNotificationOn, ")");
        }
    }

    public /* synthetic */ AbstractC10145d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10145d() {
    }
}

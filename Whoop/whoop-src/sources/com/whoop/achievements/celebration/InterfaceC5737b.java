package com.whoop.achievements.celebration;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import i51.C18118o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: com.whoop.achievements.celebration.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b;", "", "d", "c", "a", "b", "Lcom/whoop/achievements/celebration/b$a;", "Lcom/whoop/achievements/celebration/b$c;", "Lcom/whoop/achievements/celebration/b$d;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC5737b {

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$a;", "Lcom/whoop/achievements/celebration/b;", "a", "Lcom/whoop/achievements/celebration/b$a$a;", "Lcom/whoop/achievements/celebration/b$b;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC5737b {

        /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$a$a;", "Lcom/whoop/achievements/celebration/b$a;", "Li51/o;", "celebrationOverlay", "<init>", "(Li51/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li51/o;", "()Li51/o;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41365a implements a {

            /* JADX INFO: renamed from: b */
            public static final int f22686b = C18118o.f70347k;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C18118o celebrationOverlay;

            public C41365a(C18118o celebrationOverlay) {
                AbstractC22676k.m65750j(celebrationOverlay, "celebrationOverlay");
                this.celebrationOverlay = celebrationOverlay;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C18118o getCelebrationOverlay() {
                return this.celebrationOverlay;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41365a) && AbstractC22676k.m65745e(this.celebrationOverlay, ((C41365a) other).celebrationOverlay);
            }

            public int hashCode() {
                return this.celebrationOverlay.hashCode();
            }

            public String toString() {
                return "CelebrationViewed(celebrationOverlay=" + this.celebrationOverlay + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$b;", "", "Lcom/whoop/achievements/celebration/b$a;", NotificationCompat.CATEGORY_EVENT, "Li51/o;", "element", "<init>", "(Ljava/lang/Object;Li51/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Li51/o;", "()Li51/o;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC5737b, a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C18118o element;

        public b(Object event, C18118o element) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            this.event = event;
            this.element = element;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C18118o getElement() {
            return this.element;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.event, bVar.event) && AbstractC22676k.m65745e(this.element, bVar.element);
        }

        public int hashCode() {
            return this.element.hashCode() + (this.event.hashCode() * 31);
        }

        public String toString() {
            return "CelebrationItemClicked(event=" + this.event + ", element=" + this.element + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$c */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$c;", "Lcom/whoop/achievements/celebration/b;", "a", "b", "c", "Lcom/whoop/achievements/celebration/b$c$a;", "Lcom/whoop/achievements/celebration/b$c$b;", "Lcom/whoop/achievements/celebration/b$c$c;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface c extends InterfaceC5737b {

        /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$c$a */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$c$a;", "Lcom/whoop/achievements/celebration/b$c;", "<init>", "()V", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements c {

            /* JADX INFO: renamed from: a */
            public static final a f22690a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$c$b */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$c$b;", "Lcom/whoop/achievements/celebration/b$c;", "<init>", "()V", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements c {

            /* JADX INFO: renamed from: a */
            public static final b f22691a = new b();

            private b() {
            }
        }

        /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$c$c, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$c$c;", "Lcom/whoop/achievements/celebration/b$c;", "Lcom/whoop/navigation/e;", "action", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41366c implements c {

            /* JADX INFO: renamed from: b */
            public static final int f22692b = C9598e.f28134d;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C9598e action;

            public C41366c(C9598e action) {
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C9598e getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41366c) && AbstractC22676k.m65745e(this.action, ((C41366c) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106650i("NavigateToDestination(action=", this.action, ")");
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$d */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$d;", "Lcom/whoop/achievements/celebration/b;", "a", "b", "Lcom/whoop/achievements/celebration/b$d$a;", "Lcom/whoop/achievements/celebration/b$d$b;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface d extends InterfaceC5737b {

        /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$d$a */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$d$a;", "Lcom/whoop/achievements/celebration/b$d;", "", "achievementType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a implements d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String achievementType;

            public a(String achievementType) {
                AbstractC22676k.m65750j(achievementType, "achievementType");
                this.achievementType = achievementType;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAchievementType() {
                return this.achievementType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.achievementType, ((a) other).achievementType);
            }

            public int hashCode() {
                return this.achievementType.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("FetchCelebration(achievementType=", this.achievementType, ")");
            }
        }

        /* JADX INFO: renamed from: com.whoop.achievements.celebration.b$d$b */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/achievements/celebration/b$d$b;", "Lcom/whoop/achievements/celebration/b$d;", "", "celebrationType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String celebrationType;

            public b(String celebrationType) {
                AbstractC22676k.m65750j(celebrationType, "celebrationType");
                this.celebrationType = celebrationType;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCelebrationType() {
                return this.celebrationType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.celebrationType, ((b) other).celebrationType);
            }

            public int hashCode() {
                return this.celebrationType.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("FetchStreakCelebration(celebrationType=", this.celebrationType, ")");
            }
        }
    }
}

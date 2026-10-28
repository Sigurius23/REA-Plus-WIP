package ie2;

import p000.AbstractC30802r;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ie2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lie2/a;", "", "b", "c", "d", "e", "a", "Lie2/a$a;", "Lie2/a$b;", "Lie2/a$c;", "Lie2/a$d;", "Lie2/a$e;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC18446a {

    /* JADX INFO: renamed from: ie2.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lie2/a$a;", "Lie2/a;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC18446a {

        /* JADX INFO: renamed from: a */
        public static final a f71822a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: ie2.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lie2/a$b;", "Lie2/a;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC18446a {

        /* JADX INFO: renamed from: a */
        public static final b f71823a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: ie2.a$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lie2/a$c;", "Lie2/a;", "", "isDetectionOn", "isNotificationOn", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC18446a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isDetectionOn;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isNotificationOn;

        public c(boolean z4, boolean z13) {
            this.isDetectionOn = z4;
            this.isNotificationOn = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsDetectionOn() {
            return this.isDetectionOn;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return this.isDetectionOn == cVar.isDetectionOn && this.isNotificationOn == cVar.isNotificationOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNotificationOn) + (Boolean.hashCode(this.isDetectionOn) * 31);
        }

        public String toString() {
            return AbstractC30802r.m94762k("StartUpdatingShepherdDetectionSettings(isDetectionOn=", ", isNotificationOn=", ")", this.isDetectionOn, this.isNotificationOn);
        }
    }

    /* JADX INFO: renamed from: ie2.a$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lie2/a$d;", "Lie2/a;", "", "isDetectionOn", "isNotificationOn", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC18446a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isDetectionOn;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isNotificationOn;

        public d(boolean z4, boolean z13) {
            this.isDetectionOn = z4;
            this.isNotificationOn = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsDetectionOn() {
            return this.isDetectionOn;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsNotificationOn() {
            return this.isNotificationOn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.isDetectionOn == dVar.isDetectionOn && this.isNotificationOn == dVar.isNotificationOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNotificationOn) + (Boolean.hashCode(this.isDetectionOn) * 31);
        }

        public String toString() {
            return AbstractC30802r.m94762k("StartUpdatingShepherdNotificationSettings(isDetectionOn=", ", isNotificationOn=", ")", this.isDetectionOn, this.isNotificationOn);
        }
    }

    /* JADX INFO: renamed from: ie2.a$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lie2/a$e;", "Lie2/a;", "", "isDetectionOn", "isNotificationOn", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC18446a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isDetectionOn;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isNotificationOn;

        public e(boolean z4, boolean z13) {
            this.isDetectionOn = z4;
            this.isNotificationOn = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsDetectionOn() {
            return this.isDetectionOn;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsNotificationOn() {
            return this.isNotificationOn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.isDetectionOn == eVar.isDetectionOn && this.isNotificationOn == eVar.isNotificationOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNotificationOn) + (Boolean.hashCode(this.isDetectionOn) * 31);
        }

        public String toString() {
            return AbstractC30802r.m94762k("UpdateShepherdSettings(isDetectionOn=", ", isNotificationOn=", ")", this.isDetectionOn, this.isNotificationOn);
        }
    }
}

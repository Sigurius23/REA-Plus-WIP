package fp1;

import c13.AbstractC3855a;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumScreenType;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fp1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lfp1/c;", "", "<init>", "()V", "c", "d", "b", "f", "a", "g", "e", "Lfp1/c$a;", "Lfp1/c$b;", "Lfp1/c$c;", "Lfp1/c$d;", "Lfp1/c$e;", "Lfp1/c$f;", "Lfp1/c$g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14675c {

    /* JADX INFO: renamed from: fp1.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfp1/c$a;", "Lfp1/c;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC14675c {

        /* JADX INFO: renamed from: a */
        public static final a f54180a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: fp1.c$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lfp1/c$b;", "Lfp1/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextScreen", "Lfp1/d;", "content", "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lfp1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "b", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "Lfp1/d;", "()Lfp1/d;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC14675c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HormonalScreenId nextScreen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C14676d content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HormonalScreenId hormonalScreenId, C14676d content) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.nextScreen = hormonalScreenId;
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14676d getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final HormonalScreenId getNextScreen() {
            return this.nextScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.nextScreen == bVar.nextScreen && AbstractC22676k.m65745e(this.content, bVar.content);
        }

        public int hashCode() {
            HormonalScreenId hormonalScreenId = this.nextScreen;
            return this.content.hashCode() + ((hormonalScreenId == null ? 0 : hormonalScreenId.hashCode()) * 31);
        }

        public String toString() {
            return "Forward(nextScreen=" + this.nextScreen + ", content=" + this.content + ")";
        }
    }

    /* JADX INFO: renamed from: fp1.c$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lfp1/c$c;", "Lfp1/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", HMSTrackSource.SCREEN, "", "id", "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "b", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC14675c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PostPartumScreenType screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PostPartumScreenType screen, String id4) {
            super(null);
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(id4, "id");
            this.screen = screen;
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PostPartumScreenType getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.screen == cVar.screen && AbstractC22676k.m65745e(this.id, cVar.id);
        }

        public int hashCode() {
            return this.id.hashCode() + (this.screen.hashCode() * 31);
        }

        public String toString() {
            return "LoadData(screen=" + this.screen + ", id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: fp1.c$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lfp1/c$d;", "Lfp1/c;", "", "isStealthModeOn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC14675c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeOn;

        public d(boolean z4) {
            super(null);
            this.isStealthModeOn = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsStealthModeOn() {
            return this.isStealthModeOn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.isStealthModeOn == ((d) other).isStealthModeOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStealthModeOn);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Save(isStealthModeOn=", ")", this.isStealthModeOn);
        }
    }

    /* JADX INFO: renamed from: fp1.c$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfp1/c$e;", "Lfp1/c;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC14675c {

        /* JADX INFO: renamed from: a */
        public static final e f54186a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: fp1.c$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfp1/c$f;", "Lfp1/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextScreen", "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC14675c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HormonalScreenId nextScreen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HormonalScreenId nextScreen) {
            super(null);
            AbstractC22676k.m65750j(nextScreen, "nextScreen");
            this.nextScreen = nextScreen;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final HormonalScreenId getNextScreen() {
            return this.nextScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.nextScreen == ((f) other).nextScreen;
        }

        public int hashCode() {
            return this.nextScreen.hashCode();
        }

        public String toString() {
            return "Skip(nextScreen=" + this.nextScreen + ")";
        }
    }

    /* JADX INFO: renamed from: fp1.c$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfp1/c$g;", "Lfp1/c;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC14675c {

        /* JADX INFO: renamed from: a */
        public static final g f54188a = new g();

        private g() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC14675c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14675c() {
    }
}

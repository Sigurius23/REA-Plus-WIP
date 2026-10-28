package em1;

import live.hms.video.media.tracks.HMSTrackSource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: em1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lem1/a;", "Lem1/t;", "<init>", "()V", "b", "a", "Lem1/a$a;", "Lem1/a$b;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13325a implements InterfaceC13346t {

    /* JADX INFO: renamed from: em1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lem1/a$a;", "Lem1/a;", "", HMSTrackSource.SCREEN, "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC13325a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String identifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String screen, String identifier) {
            super(null);
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(identifier, "identifier");
            this.screen = screen;
            this.identifier = identifier;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.screen, aVar.screen) && AbstractC22676k.m65745e(this.identifier, aVar.identifier);
        }

        public int hashCode() {
            return this.identifier.hashCode() + (this.screen.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("MarkAsSeen(screen=", this.screen, ", identifier=", this.identifier, ")");
        }
    }

    /* JADX INFO: renamed from: em1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lem1/a$b;", "Lem1/a;", "", HMSTrackSource.SCREEN, "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC13325a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String identifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String screen, String identifier) {
            super(null);
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(identifier, "identifier");
            this.screen = screen;
            this.identifier = identifier;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.screen, bVar.screen) && AbstractC22676k.m65745e(this.identifier, bVar.identifier);
        }

        public int hashCode() {
            return this.identifier.hashCode() + (this.screen.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("SetAutoPop(screen=", this.screen, ", identifier=", this.identifier, ")");
        }
    }

    public /* synthetic */ AbstractC13325a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13325a() {
    }
}

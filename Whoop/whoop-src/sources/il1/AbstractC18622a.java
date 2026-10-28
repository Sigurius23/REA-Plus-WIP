package il1;

import com.whoop.navigation.C9598e;
import java.util.List;
import live.hms.video.media.tracks.HMSTrackSource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: il1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lil1/a;", "", "<init>", "()V", "d", "c", "b", "a", "Lil1/a$a;", "Lil1/a$b;", "Lil1/a$c;", "Lil1/a$d;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18622a {

    /* JADX INFO: renamed from: il1.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/a$a;", "Lil1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC18622a {

        /* JADX INFO: renamed from: a */
        public static final a f72820a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lil1/a$b;", "Lil1/a;", "", HMSTrackSource.SCREEN, "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC18622a {

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
            return AbstractC2875y.m8300m("MarkAsSeen(screen=", this.screen, ", identifier=", this.identifier, ")");
        }
    }

    /* JADX INFO: renamed from: il1.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lil1/a$c;", "Lil1/a;", "", HMSTrackSource.SCREEN, "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC18622a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String identifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String screen, String identifier) {
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
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.screen, cVar.screen) && AbstractC22676k.m65745e(this.identifier, cVar.identifier);
        }

        public int hashCode() {
            return this.identifier.hashCode() + (this.screen.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("SetAutoPop(screen=", this.screen, ", identifier=", this.identifier, ")");
        }
    }

    /* JADX INFO: renamed from: il1.a$d */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lil1/a$d;", "Lil1/a;", "", "Lcom/whoop/navigation/e;", "destinations", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC18622a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C9598e> destinations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<C9598e> destinations) {
            super(null);
            AbstractC22676k.m65750j(destinations, "destinations");
            this.destinations = destinations;
        }

        /* JADX INFO: renamed from: a */
        public final List<C9598e> m53902a() {
            return this.destinations;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.destinations, ((d) other).destinations);
        }

        public int hashCode() {
            return this.destinations.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("UpdateDestinations(destinations=", ")", this.destinations);
        }
    }

    public /* synthetic */ AbstractC18622a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18622a() {
    }
}

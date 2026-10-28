package tk2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import w41.AbstractC36826z;
import w41.C36823w;

/* JADX INFO: renamed from: tk2.q */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ltk2/q;", "", "b", "a", "Ltk2/q$a;", "Ltk2/q$b;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC33899q {

    /* JADX INFO: renamed from: tk2.q$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ltk2/q$a;", "Ltk2/q;", "Ly81/f;", "backgroundColor", "<init>", "(Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/f;", "()Ly81/f;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC33899q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC39333f backgroundColor;

        public a(EnumC39333f backgroundColor) {
            AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
            this.backgroundColor = backgroundColor;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC39333f getBackgroundColor() {
            return this.backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.backgroundColor == ((a) other).backgroundColor;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode();
        }

        public String toString() {
            return "BackGroundColorState(backgroundColor=" + this.backgroundColor + ")";
        }
    }

    /* JADX INFO: renamed from: tk2.q$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ltk2/q$b;", "Ltk2/q;", "Lw41/z;", "mapState", "Lw41/w;", "userLocation", "<init>", "(Lw41/z;Lw41/w;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw41/z;", "()Lw41/z;", "b", "Lw41/w;", "()Lw41/w;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC33899q {

        /* JADX INFO: renamed from: c */
        public static final int f142068c = C36823w.f157507c | AbstractC36826z.f157519a;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC36826z mapState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C36823w userLocation;

        public b(AbstractC36826z abstractC36826z, C36823w c36823w) {
            this.mapState = abstractC36826z;
            this.userLocation = c36823w;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC36826z getMapState() {
            return this.mapState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C36823w getUserLocation() {
            return this.userLocation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.mapState, bVar.mapState) && AbstractC22676k.m65745e(this.userLocation, bVar.userLocation);
        }

        public int hashCode() {
            AbstractC36826z abstractC36826z = this.mapState;
            int iHashCode = (abstractC36826z == null ? 0 : abstractC36826z.hashCode()) * 31;
            C36823w c36823w = this.userLocation;
            return iHashCode + (c36823w != null ? c36823w.hashCode() : 0);
        }

        public String toString() {
            return "Map(mapState=" + this.mapState + ", userLocation=" + this.userLocation + ")";
        }
    }
}

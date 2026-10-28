package ta2;

import j02.AbstractC21155m0;
import live.hms.video.media.tracks.HMSTrackSource;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ta2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lta2/a;", "", "<init>", "()V", "c", "a", "b", "Lta2/a$a;", "Lta2/a$b;", "Lta2/a$c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33673a {

    /* JADX INFO: renamed from: ta2.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lta2/a$a;", "Lta2/a;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC33673a {

        /* JADX INFO: renamed from: a */
        public static final a f140652a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ta2.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lta2/a$b;", "Lta2/a;", "Lj02/m0;", HMSTrackSource.SCREEN, "<init>", "(Lj02/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj02/m0;", "()Lj02/m0;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC33673a {

        /* JADX INFO: renamed from: b */
        public static final int f140653b = AbstractC21155m0.f80247a;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC21155m0 screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC21155m0 screen) {
            super(null);
            AbstractC22676k.m65750j(screen, "screen");
            this.screen = screen;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC21155m0 getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.screen, ((b) other).screen);
        }

        public int hashCode() {
            return this.screen.hashCode();
        }

        public String toString() {
            return "NavigationEvent(screen=" + this.screen + ")";
        }
    }

    /* JADX INFO: renamed from: ta2.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lta2/a$c;", "Lta2/a;", "", "shareMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC33673a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String shareMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String shareMessage) {
            super(null);
            AbstractC22676k.m65750j(shareMessage, "shareMessage");
            this.shareMessage = shareMessage;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getShareMessage() {
            return this.shareMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.shareMessage, ((c) other).shareMessage);
        }

        public int hashCode() {
            return this.shareMessage.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ShareRafLink(shareMessage=", this.shareMessage, ")");
        }
    }

    public /* synthetic */ AbstractC33673a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC33673a() {
    }
}

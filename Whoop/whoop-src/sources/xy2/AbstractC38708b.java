package xy2;

import com.whoop.whooplabs.data.remote.domain.dto.bff.CompletedCampaignsScreenResponse;
import live.hms.video.media.tracks.HMSTrackSource;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xy2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lxy2/b;", "", "<init>", "()V", "c", "a", "b", "Lxy2/b$a;", "Lxy2/b$b;", "Lxy2/b$c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38708b {

    /* JADX INFO: renamed from: xy2.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxy2/b$a;", "Lxy2/b;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;", HMSTrackSource.SCREEN, "<init>", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC38708b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CompletedCampaignsScreenResponse screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CompletedCampaignsScreenResponse screen) {
            super(null);
            AbstractC22676k.m65750j(screen, "screen");
            this.screen = screen;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CompletedCampaignsScreenResponse getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.screen, ((a) other).screen);
        }

        public int hashCode() {
            return this.screen.hashCode();
        }

        public String toString() {
            return "CompletedCampaignsLoaded(screen=" + this.screen + ")";
        }
    }

    /* JADX INFO: renamed from: xy2.b$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lxy2/b$b;", "Lxy2/b;", "", "campaignFilter", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC38708b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String campaignFilter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String campaignFilter) {
            super(null);
            AbstractC22676k.m65750j(campaignFilter, "campaignFilter");
            this.campaignFilter = campaignFilter;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCampaignFilter() {
            return this.campaignFilter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.campaignFilter, ((b) other).campaignFilter);
        }

        public int hashCode() {
            return this.campaignFilter.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ErrorLoadingCompletedCampaigns(campaignFilter=", this.campaignFilter, ")");
        }
    }

    /* JADX INFO: renamed from: xy2.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxy2/b$c;", "Lxy2/b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC38708b {

        /* JADX INFO: renamed from: a */
        public static final c f166593a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC38708b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC38708b() {
    }
}

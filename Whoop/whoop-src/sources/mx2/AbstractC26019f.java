package mx2;

import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignDetailsScreenResponse;
import live.hms.video.media.tracks.HMSTrackSource;
import org.joda.time.DateTime;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mx2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lmx2/f;", "", "<init>", "()V", "b", "a", "Lmx2/f$a;", "Lmx2/f$b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26019f {

    /* JADX INFO: renamed from: mx2.f$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lmx2/f$b;", "Lmx2/f;", "Lmx2/e;", "modal", "<init>", "(Lmx2/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx2/e;", "()Lmx2/e;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC26019f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC26018e modal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC26018e modal) {
            super(null);
            AbstractC22676k.m65750j(modal, "modal");
            this.modal = modal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC26018e getModal() {
            return this.modal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.modal, ((b) other).modal);
        }

        public int hashCode() {
            return this.modal.hashCode();
        }

        public String toString() {
            return "ShowingModal(modal=" + this.modal + ")";
        }
    }

    public /* synthetic */ AbstractC26019f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC26019f() {
    }

    /* JADX INFO: renamed from: mx2.f$a */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, m65681d2 = {"Lmx2/f$a;", "Lmx2/f;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", HMSTrackSource.SCREEN, "Lmx2/k;", "overlayState", "", "isDeviceConnected", "Lorg/joda/time/DateTime;", "lastBtHrReceivedTime", "<init>", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lmx2/k;ZLorg/joda/time/DateTime;)V", "", "reason", "g", "(Ljava/lang/String;)Lmx2/f$a;", "a", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lmx2/k;ZLorg/joda/time/DateTime;)Lmx2/f$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", "e", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", "b", "Lmx2/k;", "d", "()Lmx2/k;", "c", "Z", "f", "()Z", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC26019f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CampaignDetailsScreenResponse screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC26024k overlayState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isDeviceConnected;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final DateTime lastBtHrReceivedTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CampaignDetailsScreenResponse screen, AbstractC26024k overlayState, boolean z4, DateTime dateTime) {
            super(null);
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(overlayState, "overlayState");
            this.screen = screen;
            this.overlayState = overlayState;
            this.isDeviceConnected = z4;
            this.lastBtHrReceivedTime = dateTime;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m77338b(a aVar, CampaignDetailsScreenResponse campaignDetailsScreenResponse, AbstractC26024k abstractC26024k, boolean z4, DateTime dateTime, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                campaignDetailsScreenResponse = aVar.screen;
            }
            if ((i13 & 2) != 0) {
                abstractC26024k = aVar.overlayState;
            }
            if ((i13 & 4) != 0) {
                z4 = aVar.isDeviceConnected;
            }
            if ((i13 & 8) != 0) {
                dateTime = aVar.lastBtHrReceivedTime;
            }
            return aVar.m77339a(campaignDetailsScreenResponse, abstractC26024k, z4, dateTime);
        }

        /* JADX INFO: renamed from: a */
        public final a m77339a(CampaignDetailsScreenResponse screen, AbstractC26024k overlayState, boolean isDeviceConnected, DateTime lastBtHrReceivedTime) {
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(overlayState, "overlayState");
            return new a(screen, overlayState, isDeviceConnected, lastBtHrReceivedTime);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DateTime getLastBtHrReceivedTime() {
            return this.lastBtHrReceivedTime;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AbstractC26024k getOverlayState() {
            return this.overlayState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final CampaignDetailsScreenResponse getScreen() {
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
            return AbstractC22676k.m65745e(this.screen, aVar.screen) && AbstractC22676k.m65745e(this.overlayState, aVar.overlayState) && this.isDeviceConnected == aVar.isDeviceConnected && AbstractC22676k.m65745e(this.lastBtHrReceivedTime, aVar.lastBtHrReceivedTime);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsDeviceConnected() {
            return this.isDeviceConnected;
        }

        /* JADX INFO: renamed from: g */
        public final a m77344g(String reason) {
            AbstractC26024k abstractC26024k = this.overlayState;
            return abstractC26024k instanceof AbstractC26024k.b ? m77338b(this, null, AbstractC26024k.b.m77412b((AbstractC26024k.b) abstractC26024k, null, null, reason, 3, null), false, null, 13, null) : this;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b((this.overlayState.hashCode() + (this.screen.hashCode() * 31)) * 31, 31, this.isDeviceConnected);
            DateTime dateTime = this.lastBtHrReceivedTime;
            return iM8289b + (dateTime == null ? 0 : dateTime.hashCode());
        }

        public String toString() {
            return "CampaignDetailsLoaded(screen=" + this.screen + ", overlayState=" + this.overlayState + ", isDeviceConnected=" + this.isDeviceConnected + ", lastBtHrReceivedTime=" + this.lastBtHrReceivedTime + ")";
        }

        public /* synthetic */ a(CampaignDetailsScreenResponse campaignDetailsScreenResponse, AbstractC26024k abstractC26024k, boolean z4, DateTime dateTime, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(campaignDetailsScreenResponse, (i13 & 2) != 0 ? AbstractC26024k.d.f102940a : abstractC26024k, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : dateTime);
        }
    }
}

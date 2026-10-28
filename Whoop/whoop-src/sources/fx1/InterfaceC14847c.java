package fx1;

import com.whoop.membership.management.domain.models.MembershipAdjustmentCheckoutScreenResponse;
import com.whoop.payments.domain.models.Card;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import live.hms.video.media.tracks.HMSTrackSource;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: fx1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lfx1/c;", "", "c", "a", "d", "b", "e", "Lfx1/c$a;", "Lfx1/c$b;", "Lfx1/c$c;", "Lfx1/c$d;", "Lfx1/c$e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14847c {

    /* JADX INFO: renamed from: fx1.c$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R'\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfx1/c$a;", "Lfx1/c;", "", "", "payload", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC14847c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> payload;

        public a(Map<String, String> map) {
            this.payload = map;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m42731a() {
            return this.payload;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.payload, ((a) other).payload);
        }

        public int hashCode() {
            Map<String, String> map = this.payload;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        public String toString() {
            return AbstractC26725a.m79504h("Error(payload=", ")", this.payload);
        }

        public /* synthetic */ a(Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : map);
        }
    }

    /* JADX INFO: renamed from: fx1.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfx1/c$c;", "Lfx1/c;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC14847c {

        /* JADX INFO: renamed from: a */
        public static final c f55353a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: fx1.c$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfx1/c$e;", "Lfx1/c;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14847c {

        /* JADX INFO: renamed from: a */
        public static final e f55361a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: fx1.c$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R'\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lfx1/c$b;", "Lfx1/c;", "", "", "checkoutPayload", "path", "Lcom/whoop/payments/domain/models/Card;", "card", "<init>", "(Ljava/util/Map;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Ljava/lang/String;", "c", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC14847c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> checkoutPayload;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Card card;

        public b(Map<String, String> map, String str, Card card) {
            this.checkoutPayload = map;
            this.path = str;
            this.card = card;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, String> m42733b() {
            return this.checkoutPayload;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.checkoutPayload, bVar.checkoutPayload) && AbstractC22676k.m65745e(this.path, bVar.path) && AbstractC22676k.m65745e(this.card, bVar.card);
        }

        public int hashCode() {
            Map<String, String> map = this.checkoutPayload;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            String str = this.path;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Card card = this.card;
            return iHashCode2 + (card != null ? card.hashCode() : 0);
        }

        public String toString() {
            return "FailedCheckout(checkoutPayload=" + this.checkoutPayload + ", path=" + this.path + ", card=" + this.card + ")";
        }

        public /* synthetic */ b(Map map, String str, Card card, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : map, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : card);
        }
    }

    /* JADX INFO: renamed from: fx1.c$d */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJX\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b'\u0010 R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b(\u0010 R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b$\u0010 ¨\u0006)"}, m65681d2 = {"Lfx1/c$d;", "Lfx1/c;", "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;", HMSTrackSource.SCREEN, "", "isExpanded", "", "selectedPaymentOptionIndex", "Lcom/whoop/payments/domain/models/Card;", "card", "validCard", "showConfirmModal", "newCardIsMandatory", "<init>", "(Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;ZILcom/whoop/payments/domain/models/Card;ZZZ)V", "a", "(Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;ZILcom/whoop/payments/domain/models/Card;ZZZ)Lfx1/c$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;", "e", "()Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;", "b", "Z", "i", "()Z", "c", "I", "f", "d", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC14847c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final MembershipAdjustmentCheckoutScreenResponse screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isExpanded;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int selectedPaymentOptionIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Card card;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean validCard;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean showConfirmModal;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean newCardIsMandatory;

        public d(MembershipAdjustmentCheckoutScreenResponse screen, boolean z4, int i13, Card card, boolean z13, boolean z14, boolean z15) {
            AbstractC22676k.m65750j(screen, "screen");
            this.screen = screen;
            this.isExpanded = z4;
            this.selectedPaymentOptionIndex = i13;
            this.card = card;
            this.validCard = z13;
            this.showConfirmModal = z14;
            this.newCardIsMandatory = z15;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ d m42735b(d dVar, MembershipAdjustmentCheckoutScreenResponse membershipAdjustmentCheckoutScreenResponse, boolean z4, int i13, Card card, boolean z13, boolean z14, boolean z15, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                membershipAdjustmentCheckoutScreenResponse = dVar.screen;
            }
            if ((i14 & 2) != 0) {
                z4 = dVar.isExpanded;
            }
            if ((i14 & 4) != 0) {
                i13 = dVar.selectedPaymentOptionIndex;
            }
            if ((i14 & 8) != 0) {
                card = dVar.card;
            }
            if ((i14 & 16) != 0) {
                z13 = dVar.validCard;
            }
            if ((i14 & 32) != 0) {
                z14 = dVar.showConfirmModal;
            }
            if ((i14 & 64) != 0) {
                z15 = dVar.newCardIsMandatory;
            }
            boolean z16 = z14;
            boolean z17 = z15;
            boolean z18 = z13;
            int i15 = i13;
            return dVar.m42736a(membershipAdjustmentCheckoutScreenResponse, z4, i15, card, z18, z16, z17);
        }

        /* JADX INFO: renamed from: a */
        public final d m42736a(MembershipAdjustmentCheckoutScreenResponse screen, boolean isExpanded, int selectedPaymentOptionIndex, Card card, boolean validCard, boolean showConfirmModal, boolean newCardIsMandatory) {
            AbstractC22676k.m65750j(screen, "screen");
            return new d(screen, isExpanded, selectedPaymentOptionIndex, card, validCard, showConfirmModal, newCardIsMandatory);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getNewCardIsMandatory() {
            return this.newCardIsMandatory;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final MembershipAdjustmentCheckoutScreenResponse getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.screen, dVar.screen) && this.isExpanded == dVar.isExpanded && this.selectedPaymentOptionIndex == dVar.selectedPaymentOptionIndex && AbstractC22676k.m65745e(this.card, dVar.card) && this.validCard == dVar.validCard && this.showConfirmModal == dVar.showConfirmModal && this.newCardIsMandatory == dVar.newCardIsMandatory;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getSelectedPaymentOptionIndex() {
            return this.selectedPaymentOptionIndex;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShowConfirmModal() {
            return this.showConfirmModal;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getValidCard() {
            return this.validCard;
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.selectedPaymentOptionIndex, AbstractC2875y.m8289b(this.screen.hashCode() * 31, 31, this.isExpanded), 31);
            Card card = this.card;
            return Boolean.hashCode(this.newCardIsMandatory) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30448b + (card == null ? 0 : card.hashCode())) * 31, 31, this.validCard), 31, this.showConfirmModal);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        public String toString() {
            MembershipAdjustmentCheckoutScreenResponse membershipAdjustmentCheckoutScreenResponse = this.screen;
            boolean z4 = this.isExpanded;
            int i13 = this.selectedPaymentOptionIndex;
            Card card = this.card;
            boolean z13 = this.validCard;
            boolean z14 = this.showConfirmModal;
            boolean z15 = this.newCardIsMandatory;
            StringBuilder sb4 = new StringBuilder("Result(screen=");
            sb4.append(membershipAdjustmentCheckoutScreenResponse);
            sb4.append(", isExpanded=");
            sb4.append(z4);
            sb4.append(", selectedPaymentOptionIndex=");
            sb4.append(i13);
            sb4.append(", card=");
            sb4.append(card);
            sb4.append(", validCard=");
            AbstractC38963t7.m124392v(sb4, z13, ", showConfirmModal=", z14, ", newCardIsMandatory=");
            return AbstractC18489d0.m53372m(sb4, z15, ")");
        }

        public /* synthetic */ d(MembershipAdjustmentCheckoutScreenResponse membershipAdjustmentCheckoutScreenResponse, boolean z4, int i13, Card card, boolean z13, boolean z14, boolean z15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(membershipAdjustmentCheckoutScreenResponse, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? null : card, (i14 & 16) != 0 ? true : z13, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? false : z15);
        }
    }
}

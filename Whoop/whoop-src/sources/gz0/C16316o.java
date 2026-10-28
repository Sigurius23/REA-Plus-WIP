package gz0;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import live.hms.video.sdk.models.enums.HMSMessageType;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 0\u001f¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010(R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b0\u0010(R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u0010(R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010(R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u0010(R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010(R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u0010(R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u0010(R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b9\u0010(R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b:\u0010(R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b;\u0010(R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b<\u0010(R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b=\u0010(R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\b?\u0010(R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b@\u0010(R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\bA\u0010(R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\bB\u0010(R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\bD\u0010(R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010.\u001a\u0004\bE\u0010(R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\bF\u0010(R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\bG\u0010(R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010.\u001a\u0004\bH\u0010(R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010.\u001a\u0004\bI\u0010(R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bJ\u0010(R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010.\u001a\u0004\b>\u0010(R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010.\u001a\u0004\b-\u0010(R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010.\u001a\u0004\bC\u0010(R#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b7\u0010L¨\u0006M"}, m65681d2 = {"Lgz0/o;", "", "", "advancedLabsSettings", "barsChart", "cancelMembership", HMSMessageType.CHAT, "chatBubble", "chatWithRedDot", "creditCard", "discount", "expires", "extendMembership", "gift", "giftCard", "key", "membershipManagement", "mxmSupport", "newArrivals", "referral", "report", "restore", "returnIcon", "selectedCheck", "send", "shipping", "shippingBox", "shoppingCart", "hsaFsa", "advancedLabs", "naturalCycles", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIIIIIIIIIIIIIIIIIIIIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "i", "k", "l", "m", "n", "p", "q", "o", "r", "t", "u", "v", "s", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "A", "B", "C", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16316o {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int advancedLabs;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int naturalCycles;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int advancedLabsSettings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int barsChart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int cancelMembership;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int chat;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int chatBubble;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int chatWithRedDot;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int creditCard;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int discount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int expires;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int extendMembership;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int gift;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int giftCard;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int membershipManagement;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int mxmSupport;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int newArrivals;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int referral;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int report;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int restore;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int returnIcon;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int selectedCheck;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int send;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int shipping;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int shippingBox;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int shoppingCart;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int hsaFsa;

    public C16316o(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, int i36, int i37, int i38, int i39, int i44, int i45, int i46, int i47, int i48, int i49, int i54, int i55, int i56, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.advancedLabsSettings = i13;
        this.barsChart = i14;
        this.cancelMembership = i15;
        this.chat = i16;
        this.chatBubble = i17;
        this.chatWithRedDot = i18;
        this.creditCard = i19;
        this.discount = i24;
        this.expires = i25;
        this.extendMembership = i26;
        this.gift = i27;
        this.giftCard = i28;
        this.key = i29;
        this.membershipManagement = i34;
        this.mxmSupport = i35;
        this.newArrivals = i36;
        this.referral = i37;
        this.report = i38;
        this.restore = i39;
        this.returnIcon = i44;
        this.selectedCheck = i45;
        this.send = i46;
        this.shipping = i47;
        this.shippingBox = i48;
        this.shoppingCart = i49;
        this.hsaFsa = i54;
        this.advancedLabs = i55;
        this.naturalCycles = i56;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final int getShipping() {
        return this.shipping;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getShippingBox() {
        return this.shippingBox;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getShoppingCart() {
        return this.shoppingCart;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAdvancedLabs() {
        return this.advancedLabs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAdvancedLabsSettings() {
        return this.advancedLabsSettings;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBarsChart() {
        return this.barsChart;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCancelMembership() {
        return this.cancelMembership;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getChat() {
        return this.chat;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16316o)) {
            return false;
        }
        C16316o c16316o = (C16316o) other;
        return this.advancedLabsSettings == c16316o.advancedLabsSettings && this.barsChart == c16316o.barsChart && this.cancelMembership == c16316o.cancelMembership && this.chat == c16316o.chat && this.chatBubble == c16316o.chatBubble && this.chatWithRedDot == c16316o.chatWithRedDot && this.creditCard == c16316o.creditCard && this.discount == c16316o.discount && this.expires == c16316o.expires && this.extendMembership == c16316o.extendMembership && this.gift == c16316o.gift && this.giftCard == c16316o.giftCard && this.key == c16316o.key && this.membershipManagement == c16316o.membershipManagement && this.mxmSupport == c16316o.mxmSupport && this.newArrivals == c16316o.newArrivals && this.referral == c16316o.referral && this.report == c16316o.report && this.restore == c16316o.restore && this.returnIcon == c16316o.returnIcon && this.selectedCheck == c16316o.selectedCheck && this.send == c16316o.send && this.shipping == c16316o.shipping && this.shippingBox == c16316o.shippingBox && this.shoppingCart == c16316o.shoppingCart && this.hsaFsa == c16316o.hsaFsa && this.advancedLabs == c16316o.advancedLabs && this.naturalCycles == c16316o.naturalCycles && AbstractC22676k.m65745e(this.descriptions, c16316o.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getChatBubble() {
        return this.chatBubble;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getChatWithRedDot() {
        return this.chatWithRedDot;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getCreditCard() {
        return this.creditCard;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.naturalCycles, AbstractC11266d.m30448b(this.advancedLabs, AbstractC11266d.m30448b(this.hsaFsa, AbstractC11266d.m30448b(this.shoppingCart, AbstractC11266d.m30448b(this.shippingBox, AbstractC11266d.m30448b(this.shipping, AbstractC11266d.m30448b(this.send, AbstractC11266d.m30448b(this.selectedCheck, AbstractC11266d.m30448b(this.returnIcon, AbstractC11266d.m30448b(this.restore, AbstractC11266d.m30448b(this.report, AbstractC11266d.m30448b(this.referral, AbstractC11266d.m30448b(this.newArrivals, AbstractC11266d.m30448b(this.mxmSupport, AbstractC11266d.m30448b(this.membershipManagement, AbstractC11266d.m30448b(this.key, AbstractC11266d.m30448b(this.giftCard, AbstractC11266d.m30448b(this.gift, AbstractC11266d.m30448b(this.extendMembership, AbstractC11266d.m30448b(this.expires, AbstractC11266d.m30448b(this.discount, AbstractC11266d.m30448b(this.creditCard, AbstractC11266d.m30448b(this.chatWithRedDot, AbstractC11266d.m30448b(this.chatBubble, AbstractC11266d.m30448b(this.chat, AbstractC11266d.m30448b(this.cancelMembership, AbstractC11266d.m30448b(this.barsChart, Integer.hashCode(this.advancedLabsSettings) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final List<C22396h<Integer>> m46393i() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getExpires() {
        return this.expires;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getExtendMembership() {
        return this.extendMembership;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getGift() {
        return this.gift;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getGiftCard() {
        return this.giftCard;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getHsaFsa() {
        return this.hsaFsa;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getMembershipManagement() {
        return this.membershipManagement;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getMxmSupport() {
        return this.mxmSupport;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getNaturalCycles() {
        return this.naturalCycles;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getNewArrivals() {
        return this.newArrivals;
    }

    public String toString() {
        int i13 = this.advancedLabsSettings;
        int i14 = this.barsChart;
        int i15 = this.cancelMembership;
        int i16 = this.chat;
        int i17 = this.chatBubble;
        int i18 = this.chatWithRedDot;
        int i19 = this.creditCard;
        int i24 = this.discount;
        int i25 = this.expires;
        int i26 = this.extendMembership;
        int i27 = this.gift;
        int i28 = this.giftCard;
        int i29 = this.key;
        int i34 = this.membershipManagement;
        int i35 = this.mxmSupport;
        int i36 = this.newArrivals;
        int i37 = this.referral;
        int i38 = this.report;
        int i39 = this.restore;
        int i44 = this.returnIcon;
        int i45 = this.selectedCheck;
        int i46 = this.send;
        int i47 = this.shipping;
        int i48 = this.shippingBox;
        int i49 = this.shoppingCart;
        int i54 = this.hsaFsa;
        int i55 = this.advancedLabs;
        int i56 = this.naturalCycles;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "GrowthIcons(advancedLabsSettings=", ", barsChart=", ", cancelMembership=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", chat=", i16, ", chatBubble=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", chatWithRedDot=", i18, ", creditCard=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", discount=", i24, ", expires=");
        AbstractC30802r.m94773v(sbM30465s, i25, ", extendMembership=", i26, ", gift=");
        AbstractC30802r.m94773v(sbM30465s, i27, ", giftCard=", i28, ", key=");
        AbstractC30802r.m94773v(sbM30465s, i29, ", membershipManagement=", i34, ", mxmSupport=");
        AbstractC30802r.m94773v(sbM30465s, i35, ", newArrivals=", i36, ", referral=");
        AbstractC30802r.m94773v(sbM30465s, i37, ", report=", i38, ", restore=");
        AbstractC30802r.m94773v(sbM30465s, i39, ", returnIcon=", i44, ", selectedCheck=");
        AbstractC30802r.m94773v(sbM30465s, i45, ", send=", i46, ", shipping=");
        AbstractC30802r.m94773v(sbM30465s, i47, ", shippingBox=", i48, ", shoppingCart=");
        AbstractC30802r.m94773v(sbM30465s, i49, ", hsaFsa=", i54, ", advancedLabs=");
        AbstractC30802r.m94773v(sbM30465s, i55, ", naturalCycles=", i56, ", descriptions=");
        return AbstractC3855a.m11829m(sbM30465s, list, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getReferral() {
        return this.referral;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getReport() {
        return this.report;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final int getRestore() {
        return this.restore;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getReturnIcon() {
        return this.returnIcon;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getSelectedCheck() {
        return this.selectedCheck;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getSend() {
        return this.send;
    }
}

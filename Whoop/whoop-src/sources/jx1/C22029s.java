package jx1;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.payments.domain.models.Card;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q22.C29855e;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: jx1.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0084\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b1\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010)R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\b@\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b7\u0010D\u001a\u0004\bE\u0010+R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b9\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u00100\u001a\u0004\bI\u0010)R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bE\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bB\u0010O\u001a\u0004\bK\u0010PR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b5\u0010Q\u001a\u0004\b8\u0010RR\u0017\u0010\u001b\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bG\u0010L\u001a\u0004\b4\u0010NR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bJ\u0010S\u001a\u0004\b>\u0010TR\u0017\u0010\u001e\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bU\u0010L\u001a\u0004\bU\u0010NR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bV\u0010XR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b3\u0010Y\u001a\u0004\b:\u0010ZR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b[\u0010)¨\u0006\\"}, m65681d2 = {"Ljx1/s;", "Lm91/u;", "", "title", "subtitle", "price", "expandedPrice", "expandedSubtitle", "", "Ljx1/c;", "summaryItems", "expandTitle", "expandText", "Ljx1/d;", "paymentOptions", "", "paymentOptionSelected", "Ljx1/g;", "primaryCta", "secondaryCta", "footerText", "", "isExpanded", "Lq22/e;", "formValidator", "Lcom/whoop/payments/domain/models/Card;", "card", "buttonEnabled", "Ljx1/f;", "confirmModal", "showConfirmModal", "Ljx1/t;", "style", "Ljx1/u;", "checkoutType", "trackingMonths", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;)Ljx1/s;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "b", "u", "c", "p", "d", "j", "e", "k", "f", "Ljava/util/List;", "v", "()Ljava/util/List;", "g", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljx1/d;", "o", "()Ljx1/d;", "I", "n", "Ljx1/g;", "q", "()Ljx1/g;", "l", "r", "m", "Z", "y", "()Z", "Lq22/e;", "()Lq22/e;", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "Ljx1/f;", "()Ljx1/f;", "s", "t", "Ljx1/t;", "()Ljx1/t;", "Ljx1/u;", "()Ljx1/u;", "x", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22029s implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String price;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String expandedPrice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String expandedSubtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C22008c> summaryItems;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String expandTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String expandText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C22010d paymentOptions;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int paymentOptionSelected;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C22016g primaryCta;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C22016g secondaryCta;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String footerText;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C29855e formValidator;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Card card;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean buttonEnabled;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C22014f confirmModal;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean showConfirmModal;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final EnumC22030t style;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final EnumC22031u checkoutType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final String trackingMonths;

    public C22029s(String title, String subtitle, String price, String str, String str2, List<C22008c> summaryItems, String str3, String str4, C22010d c22010d, int i13, C22016g primaryCta, C22016g c22016g, String footerText, boolean z4, C29855e c29855e, Card card, boolean z13, C22014f c22014f, boolean z14, EnumC22030t style, EnumC22031u checkoutType, String trackingMonths) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(summaryItems, "summaryItems");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(checkoutType, "checkoutType");
        AbstractC22676k.m65750j(trackingMonths, "trackingMonths");
        this.title = title;
        this.subtitle = subtitle;
        this.price = price;
        this.expandedPrice = str;
        this.expandedSubtitle = str2;
        this.summaryItems = summaryItems;
        this.expandTitle = str3;
        this.expandText = str4;
        this.paymentOptions = c22010d;
        this.paymentOptionSelected = i13;
        this.primaryCta = primaryCta;
        this.secondaryCta = c22016g;
        this.footerText = footerText;
        this.isExpanded = z4;
        this.formValidator = c29855e;
        this.card = card;
        this.buttonEnabled = z13;
        this.confirmModal = c22014f;
        this.showConfirmModal = z14;
        this.style = style;
        this.checkoutType = checkoutType;
        this.trackingMonths = trackingMonths;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22029s m62975b(C22029s c22029s, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, C22010d c22010d, int i13, C22016g c22016g, C22016g c22016g2, String str8, boolean z4, C29855e c29855e, Card card, boolean z13, C22014f c22014f, boolean z14, EnumC22030t enumC22030t, EnumC22031u enumC22031u, String str9, int i14, Object obj) {
        String str10;
        EnumC22031u enumC22031u2;
        String str11 = (i14 & 1) != 0 ? c22029s.title : str;
        String str12 = (i14 & 2) != 0 ? c22029s.subtitle : str2;
        String str13 = (i14 & 4) != 0 ? c22029s.price : str3;
        String str14 = (i14 & 8) != 0 ? c22029s.expandedPrice : str4;
        String str15 = (i14 & 16) != 0 ? c22029s.expandedSubtitle : str5;
        List list2 = (i14 & 32) != 0 ? c22029s.summaryItems : list;
        String str16 = (i14 & 64) != 0 ? c22029s.expandTitle : str6;
        String str17 = (i14 & 128) != 0 ? c22029s.expandText : str7;
        C22010d c22010d2 = (i14 & 256) != 0 ? c22029s.paymentOptions : c22010d;
        int i15 = (i14 & 512) != 0 ? c22029s.paymentOptionSelected : i13;
        C22016g c22016g3 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22029s.primaryCta : c22016g;
        C22016g c22016g4 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22029s.secondaryCta : c22016g2;
        String str18 = (i14 & 4096) != 0 ? c22029s.footerText : str8;
        boolean z15 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c22029s.isExpanded : z4;
        String str19 = str11;
        C29855e c29855e2 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c22029s.formValidator : c29855e;
        Card card2 = (i14 & 32768) != 0 ? c22029s.card : card;
        boolean z16 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c22029s.buttonEnabled : z13;
        C22014f c22014f2 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c22029s.confirmModal : c22014f;
        boolean z17 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c22029s.showConfirmModal : z14;
        EnumC22030t enumC22030t2 = (i14 & 524288) != 0 ? c22029s.style : enumC22030t;
        EnumC22031u enumC22031u3 = (i14 & 1048576) != 0 ? c22029s.checkoutType : enumC22031u;
        if ((i14 & 2097152) != 0) {
            enumC22031u2 = enumC22031u3;
            str10 = c22029s.trackingMonths;
        } else {
            str10 = str9;
            enumC22031u2 = enumC22031u3;
        }
        return c22029s.m62976a(str19, str12, str13, str14, str15, list2, str16, str17, c22010d2, i15, c22016g3, c22016g4, str18, z15, c29855e2, card2, z16, c22014f2, z17, enumC22030t2, enumC22031u2, str10);
    }

    /* JADX INFO: renamed from: a */
    public final C22029s m62976a(String title, String subtitle, String price, String expandedPrice, String expandedSubtitle, List<C22008c> summaryItems, String expandTitle, String expandText, C22010d paymentOptions, int paymentOptionSelected, C22016g primaryCta, C22016g secondaryCta, String footerText, boolean isExpanded, C29855e formValidator, Card card, boolean buttonEnabled, C22014f confirmModal, boolean showConfirmModal, EnumC22030t style, EnumC22031u checkoutType, String trackingMonths) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(summaryItems, "summaryItems");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(checkoutType, "checkoutType");
        AbstractC22676k.m65750j(trackingMonths, "trackingMonths");
        return new C22029s(title, subtitle, price, expandedPrice, expandedSubtitle, summaryItems, expandTitle, expandText, paymentOptions, paymentOptionSelected, primaryCta, secondaryCta, footerText, isExpanded, formValidator, card, buttonEnabled, confirmModal, showConfirmModal, style, checkoutType, trackingMonths);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getButtonEnabled() {
        return this.buttonEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22029s)) {
            return false;
        }
        C22029s c22029s = (C22029s) other;
        return AbstractC22676k.m65745e(this.title, c22029s.title) && AbstractC22676k.m65745e(this.subtitle, c22029s.subtitle) && AbstractC22676k.m65745e(this.price, c22029s.price) && AbstractC22676k.m65745e(this.expandedPrice, c22029s.expandedPrice) && AbstractC22676k.m65745e(this.expandedSubtitle, c22029s.expandedSubtitle) && AbstractC22676k.m65745e(this.summaryItems, c22029s.summaryItems) && AbstractC22676k.m65745e(this.expandTitle, c22029s.expandTitle) && AbstractC22676k.m65745e(this.expandText, c22029s.expandText) && AbstractC22676k.m65745e(this.paymentOptions, c22029s.paymentOptions) && this.paymentOptionSelected == c22029s.paymentOptionSelected && AbstractC22676k.m65745e(this.primaryCta, c22029s.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, c22029s.secondaryCta) && AbstractC22676k.m65745e(this.footerText, c22029s.footerText) && this.isExpanded == c22029s.isExpanded && AbstractC22676k.m65745e(this.formValidator, c22029s.formValidator) && AbstractC22676k.m65745e(this.card, c22029s.card) && this.buttonEnabled == c22029s.buttonEnabled && AbstractC22676k.m65745e(this.confirmModal, c22029s.confirmModal) && this.showConfirmModal == c22029s.showConfirmModal && this.style == c22029s.style && this.checkoutType == c22029s.checkoutType && AbstractC22676k.m65745e(this.trackingMonths, c22029s.trackingMonths);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC22031u getCheckoutType() {
        return this.checkoutType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C22014f getConfirmModal() {
        return this.confirmModal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getExpandText() {
        return this.expandText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.price);
        String str = this.expandedPrice;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expandedSubtitle;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.summaryItems);
        String str3 = this.expandTitle;
        int iHashCode2 = (iM31983b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expandText;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C22010d c22010d = this.paymentOptions;
        int iHashCode4 = (this.primaryCta.hashCode() + AbstractC11266d.m30448b(this.paymentOptionSelected, (iHashCode3 + (c22010d == null ? 0 : c22010d.hashCode())) * 31, 31)) * 31;
        C22016g c22016g = this.secondaryCta;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode4 + (c22016g == null ? 0 : c22016g.hashCode())) * 31, 31, this.footerText), 31, this.isExpanded);
        C29855e c29855e = this.formValidator;
        int iHashCode5 = (iM8289b + (c29855e == null ? 0 : c29855e.hashCode())) * 31;
        Card card = this.card;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode5 + (card == null ? 0 : card.hashCode())) * 31, 31, this.buttonEnabled);
        C22014f c22014f = this.confirmModal;
        return this.trackingMonths.hashCode() + ((this.checkoutType.hashCode() + ((this.style.hashCode() + AbstractC2875y.m8289b((iM8289b2 + (c22014f != null ? c22014f.hashCode() : 0)) * 31, 31, this.showConfirmModal)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getExpandTitle() {
        return this.expandTitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getExpandedPrice() {
        return this.expandedPrice;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getExpandedSubtitle() {
        return this.expandedSubtitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C29855e getFormValidator() {
        return this.formValidator;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getPaymentOptionSelected() {
        return this.paymentOptionSelected;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C22010d getPaymentOptions() {
        return this.paymentOptions;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final C22016g getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final C22016g getSecondaryCta() {
        return this.secondaryCta;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getShowConfirmModal() {
        return this.showConfirmModal;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final EnumC22030t getStyle() {
        return this.style;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.price;
        String str4 = this.expandedPrice;
        String str5 = this.expandedSubtitle;
        List<C22008c> list = this.summaryItems;
        String str6 = this.expandTitle;
        String str7 = this.expandText;
        C22010d c22010d = this.paymentOptions;
        int i13 = this.paymentOptionSelected;
        C22016g c22016g = this.primaryCta;
        C22016g c22016g2 = this.secondaryCta;
        String str8 = this.footerText;
        boolean z4 = this.isExpanded;
        C29855e c29855e = this.formValidator;
        Card card = this.card;
        boolean z13 = this.buttonEnabled;
        C22014f c22014f = this.confirmModal;
        boolean z14 = this.showConfirmModal;
        EnumC22030t enumC22030t = this.style;
        EnumC22031u enumC22031u = this.checkoutType;
        String str9 = this.trackingMonths;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MembershipCheckoutCardViewState(title=", str, ", subtitle=", str2, ", price=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", expandedPrice=", str4, ", expandedSubtitle=");
        AbstractC36095b.m114694v(str5, ", summaryItems=", ", expandTitle=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str6, ", expandText=", str7, ", paymentOptions=");
        sbM32001t.append(c22010d);
        sbM32001t.append(", paymentOptionSelected=");
        sbM32001t.append(i13);
        sbM32001t.append(", primaryCta=");
        sbM32001t.append(c22016g);
        sbM32001t.append(", secondaryCta=");
        sbM32001t.append(c22016g2);
        sbM32001t.append(", footerText=");
        AbstractC38963t7.m124390t(sbM32001t, str8, ", isExpanded=", z4, ", formValidator=");
        sbM32001t.append(c29855e);
        sbM32001t.append(", card=");
        sbM32001t.append(card);
        sbM32001t.append(", buttonEnabled=");
        sbM32001t.append(z13);
        sbM32001t.append(", confirmModal=");
        sbM32001t.append(c22014f);
        sbM32001t.append(", showConfirmModal=");
        sbM32001t.append(z14);
        sbM32001t.append(", style=");
        sbM32001t.append(enumC22030t);
        sbM32001t.append(", checkoutType=");
        sbM32001t.append(enumC22031u);
        sbM32001t.append(", trackingMonths=");
        sbM32001t.append(str9);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: v */
    public final List<C22008c> m62995v() {
        return this.summaryItems;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getTrackingMonths() {
        return this.trackingMonths;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }
}

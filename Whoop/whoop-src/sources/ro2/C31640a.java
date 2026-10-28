package ro2;

import android.annotation.SuppressLint;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutSectionSpacingType;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import hy0.C17736e;
import hy0.C17777p0;
import hy0.EnumC17774o0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io2.AbstractC20775n0;
import io2.C20748a;
import io2.C20751b0;
import io2.C20755d0;
import io2.C20762h;
import io2.C20768k;
import io2.C20772m;
import io2.C20777o0;
import io2.C20779p0;
import io2.C20783t;
import io2.C20784u;
import io2.C20786w;
import io2.EnumC20750b;
import io2.EnumC20785v;
import j11.EnumC21213p;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.EnumC22400l;
import ln2.AbstractC24541a;
import m83.AbstractC25247g0;
import m83.C25271y;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p31.AbstractC28805p;
import p31.EnumC28807r;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33208p0;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import po2.C29404c;
import po2.InterfaceC29402a;
import wb3.AbstractC37056f;
import y71.AbstractC39279l;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: ro2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b!\u0010\u0013R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&R\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b5\u0010&R\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u0010&R\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&R\u001a\u0010?\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010&R\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010$\u001a\u0004\bA\u0010&R\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010$\u001a\u0004\bD\u0010&R\u0017\u0010K\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010N\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010JR\u0017\u0010T\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010Y\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\\\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010XR\u0017\u0010b\u001a\u00020]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010e\u001a\u00020]8\u0006¢\u0006\f\n\u0004\bc\u0010_\u001a\u0004\bd\u0010aR\u0017\u0010h\u001a\u00020]8\u0006¢\u0006\f\n\u0004\bf\u0010_\u001a\u0004\bg\u0010aR\u0017\u0010k\u001a\u00020]8\u0006¢\u0006\f\n\u0004\bi\u0010_\u001a\u0004\bj\u0010aR\u0017\u0010n\u001a\u00020]8\u0006¢\u0006\f\n\u0004\bl\u0010_\u001a\u0004\bm\u0010aR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0017\u0010u\u001a\u00020]8\u0006¢\u0006\f\n\u0004\bs\u0010_\u001a\u0004\bt\u0010aR\u0017\u0010x\u001a\u00020]8\u0006¢\u0006\f\n\u0004\bv\u0010_\u001a\u0004\bw\u0010aR\u0017\u0010{\u001a\u00020]8\u0006¢\u0006\f\n\u0004\by\u0010_\u001a\u0004\bz\u0010aR\u0017\u0010~\u001a\u00020]8\u0006¢\u0006\f\n\u0004\b|\u0010_\u001a\u0004\b}\u0010aR\u0019\u0010\u0081\u0001\u001a\u00020]8\u0006¢\u0006\r\n\u0004\b\u007f\u0010_\u001a\u0005\b\u0080\u0001\u0010aR\u001a\u0010\u0084\u0001\u001a\u00020]8\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010_\u001a\u0005\b\u0083\u0001\u0010aR\u001a\u0010\u0087\u0001\u001a\u00020]8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010_\u001a\u0005\b\u0086\u0001\u0010aR\u001a\u0010\u008a\u0001\u001a\u00020]8\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010_\u001a\u0005\b\u0089\u0001\u0010aR\u001a\u0010\u008d\u0001\u001a\u00020]8\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010_\u001a\u0005\b\u008c\u0001\u0010aR\u001a\u0010\u0090\u0001\u001a\u00020]8\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010_\u001a\u0005\b\u008f\u0001\u0010aR\u001a\u0010\u0093\u0001\u001a\u00020]8\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010_\u001a\u0005\b\u0092\u0001\u0010aR\u001a\u0010\u0096\u0001\u001a\u00020]8\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010_\u001a\u0005\b\u0095\u0001\u0010aR\u001a\u0010\u0099\u0001\u001a\u00020]8\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010_\u001a\u0005\b\u0098\u0001\u0010aR\u001d\u0010\u009f\u0001\u001a\u00030\u009a\u00018\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001d\u0010¢\u0001\u001a\u00030\u009a\u00018\u0006¢\u0006\u0010\n\u0006\b \u0001\u0010\u009c\u0001\u001a\u0006\b¡\u0001\u0010\u009e\u0001R\u001d\u0010¨\u0001\u001a\u00030£\u00018\u0006¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001c\u0010ª\u0001\u001a\u00030£\u00018\u0006¢\u0006\u000f\n\u0006\b©\u0001\u0010¥\u0001\u001a\u0005\b\n\u0010§\u0001R\u001c\u0010¬\u0001\u001a\u00030£\u00018\u0006¢\u0006\u000f\n\u0006\b«\u0001\u0010¥\u0001\u001a\u0005\b\u0015\u0010§\u0001R\u001d\u0010¯\u0001\u001a\u00030£\u00018\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010¥\u0001\u001a\u0006\b®\u0001\u0010§\u0001R\u001c\u0010±\u0001\u001a\u00030£\u00018\u0006¢\u0006\u000f\n\u0006\b°\u0001\u0010¥\u0001\u001a\u0005\b\u0010\u0010§\u0001R\u001c\u0010³\u0001\u001a\u00030£\u00018\u0006¢\u0006\u000f\n\u0006\b²\u0001\u0010¥\u0001\u001a\u0005\b\u0018\u0010§\u0001R\u001c\u0010µ\u0001\u001a\u00030£\u00018\u0006¢\u0006\u000f\n\u0006\b´\u0001\u0010¥\u0001\u001a\u0005\b\u001c\u0010§\u0001R\u001d\u0010»\u0001\u001a\u00030¶\u00018\u0006¢\u0006\u0010\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001¨\u0006¼\u0001"}, m65681d2 = {"Lro2/a;", "", "<init>", "()V", "Lio2/b0;", "paymentMethodTile", "Lpo2/c$c;", "g", "(Lio2/b0;)Lpo2/c$c;", "Lio2/t;", "b", "Lio2/t;", "getSampleOrderDetailsSummaryViewState", "()Lio2/t;", "sampleOrderDetailsSummaryViewState", "Lio2/u;", "c", "Lio2/u;", "getSampleOrderDetailsViewState", "()Lio2/u;", "sampleOrderDetailsViewState", "d", "getSampleOrderDetailsWithStrikethroughPriceViewState", "sampleOrderDetailsWithStrikethroughPriceViewState", "e", "getSampleOrderDetailsCollapsedViewState", "sampleOrderDetailsCollapsedViewState", "Lio2/k;", "f", "Lio2/k;", "getSampleCheckoutInfoViewState", "()Lio2/k;", "sampleCheckoutInfoViewState", "getSampleOrderDetailsWithCheckoutInfoViewState", "sampleOrderDetailsWithCheckoutInfoViewState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lio2/b0;", "getSamplePaymentMethodTileNoCardOnFileViewState", "()Lio2/b0;", "samplePaymentMethodTileNoCardOnFileViewState", "i", "getSamplePaymentMethodTileExpiredViewState", "samplePaymentMethodTileExpiredViewState", "j", "getSamplePaymentMethodTileValidCardViewState", "samplePaymentMethodTileValidCardViewState", "k", "getSamplePaymentMethodTileWithHsaFsaViewState", "samplePaymentMethodTileWithHsaFsaViewState", "l", "getSampleReducedPaymentMethodTileNoCardOnFileViewState", "sampleReducedPaymentMethodTileNoCardOnFileViewState", "m", "getSampleReducedPaymentMethodTileNoCardOnStripeViewState", "sampleReducedPaymentMethodTileNoCardOnStripeViewState", "n", "getSampleReducedPaymentMethodTileExpiredViewState", "sampleReducedPaymentMethodTileExpiredViewState", "o", "getSampleReducedPaymentMethodTileValidCardViewState", "sampleReducedPaymentMethodTileValidCardViewState", "p", "getSampleReducedPaymentMethodTileValidStripeCardViewState", "sampleReducedPaymentMethodTileValidStripeCardViewState", "q", "getSampleReducedPaymentMethodTileWithHsaFsaViewState", "sampleReducedPaymentMethodTileWithHsaFsaViewState", "r", "getSampleViewStateReducedPaymentMethodTileWithHsaFsaViewState", "sampleViewStateReducedPaymentMethodTileWithHsaFsaViewState", "Lio2/h;", "s", "Lio2/h;", "getSampleCheckoutFooterViewState", "()Lio2/h;", "sampleCheckoutFooterViewState", "t", "getSampleCheckoutFooterDisabledViewState", "sampleCheckoutFooterDisabledViewState", "Lpo2/c$a;", "u", "Lpo2/c$a;", "getSampleDividerSectionViewState", "()Lpo2/c$a;", "sampleDividerSectionViewState", "v", "Lpo2/c$c;", "getSampleCheckoutScreenViewState", "()Lpo2/c$c;", "sampleCheckoutScreenViewState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "getSampleCheckoutWithoutFooterScreenViewState", "sampleCheckoutWithoutFooterScreenViewState", "Lpo2/c;", "x", "Lpo2/c;", "getSampleLoadingViewState", "()Lpo2/c;", "sampleLoadingViewState", "y", "getSampleNetworkErrorViewState", "sampleNetworkErrorViewState", "z", "getSampleFailedStripeFlowControllerConfigurationViewState", "sampleFailedStripeFlowControllerConfigurationViewState", "A", "getSampleRequestFailedViewState", "sampleRequestFailedViewState", "B", "getSampleSuccessViewState", "sampleSuccessViewState", "Lpo2/c$d;", "C", "Lpo2/c$d;", "samplePopUpDialogState", "D", "getSampleUniversalCheckoutViewState", "sampleUniversalCheckoutViewState", "E", "getSampleReducedUniversalCheckoutViewState", "sampleReducedUniversalCheckoutViewState", "F", "getSampleUniversalCheckoutWithoutFooterViewState", "sampleUniversalCheckoutWithoutFooterViewState", "G", "getSampleUniversalCheckoutViewStateWithPopUpDialog", "sampleUniversalCheckoutViewStateWithPopUpDialog", "H", "getSampleProcessingOrderViewState", "sampleProcessingOrderViewState", "I", "getSampleSuccessfulProcessedOrderViewState", "sampleSuccessfulProcessedOrderViewState", "J", "getSampleFailedCheckoutViewState", "sampleFailedCheckoutViewState", "K", "getSampleReducedFailedCheckoutViewState", "sampleReducedFailedCheckoutViewState", "L", "getSampleFailedCheckoutOnlyTitleViewState", "sampleFailedCheckoutOnlyTitleViewState", "M", "getSampleFailedCheckoutDefaultTitleViewState", "sampleFailedCheckoutDefaultTitleViewState", "N", "getSampleReducedProcessingOrderViewState", "sampleReducedProcessingOrderViewState", "O", "getSampleReducedSuccessfulProcessedOrderViewState", "sampleReducedSuccessfulProcessedOrderViewState", "P", "getSampleReducedUniversalCheckoutWithUnconfiguredFlowControllerViewState", "sampleReducedUniversalCheckoutWithUnconfiguredFlowControllerViewState", "Lio2/d0;", "Q", "Lio2/d0;", "getPreviewTileShippingAddressData", "()Lio2/d0;", "previewTileShippingAddressData", "R", "getPreviewTileShippingMethodData", "previewTileShippingMethodData", "Lio2/o0;", "S", "Lio2/o0;", "a", "()Lio2/o0;", "sampleCollapsedPromoInputCodeViewState", "T", "sampleExpandedPromoInputCodeViewState", "U", "sampleLoadingPromoInputCodeViewState", "V", "getSampleValidPromoInputCodeViewState", "sampleValidPromoInputCodeViewState", "W", "sampleInvalidPromoInputCodeViewState", "X", "sampleValidPromoCodeAndGiftCardPromoInputCodeViewState", "Y", "sampleValidPromoCodeAndGiftCardWithErrorMessagePromoInputCodeViewState", "Lhy0/p0;", "Z", "Lhy0/p0;", "getSampleAnnualCheckboxViewState", "()Lhy0/p0;", "sampleAnnualCheckboxViewState", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31640a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final C29404c sampleRequestFailedViewState;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final C29404c sampleSuccessViewState;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final C29404c.d samplePopUpDialogState;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final C29404c sampleUniversalCheckoutViewState;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final C29404c sampleReducedUniversalCheckoutViewState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final C29404c sampleUniversalCheckoutWithoutFooterViewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final C29404c sampleUniversalCheckoutViewStateWithPopUpDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final C29404c sampleProcessingOrderViewState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final C29404c sampleSuccessfulProcessedOrderViewState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final C29404c sampleFailedCheckoutViewState;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final C29404c sampleReducedFailedCheckoutViewState;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final C29404c sampleFailedCheckoutOnlyTitleViewState;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final C29404c sampleFailedCheckoutDefaultTitleViewState;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final C29404c sampleReducedProcessingOrderViewState;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final C29404c sampleReducedSuccessfulProcessedOrderViewState;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final C29404c sampleReducedUniversalCheckoutWithUnconfiguredFlowControllerViewState;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final C20755d0 previewTileShippingAddressData;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final C20755d0 previewTileShippingMethodData;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final C20777o0 sampleCollapsedPromoInputCodeViewState;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final C20777o0 sampleExpandedPromoInputCodeViewState;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final C20777o0 sampleLoadingPromoInputCodeViewState;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final C20777o0 sampleValidPromoInputCodeViewState;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final C20777o0 sampleInvalidPromoInputCodeViewState;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private static final C20777o0 sampleValidPromoCodeAndGiftCardPromoInputCodeViewState;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private static final C20777o0 sampleValidPromoCodeAndGiftCardWithErrorMessagePromoInputCodeViewState;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private static final C17777p0 sampleAnnualCheckboxViewState;

    /* JADX INFO: renamed from: a */
    public static final C31640a f130747a;

    /* JADX INFO: renamed from: a0 */
    public static final int f130748a0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C20783t sampleOrderDetailsSummaryViewState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C20784u sampleOrderDetailsViewState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C20784u sampleOrderDetailsWithStrikethroughPriceViewState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C20784u sampleOrderDetailsCollapsedViewState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C20768k sampleCheckoutInfoViewState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C20784u sampleOrderDetailsWithCheckoutInfoViewState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C20751b0 samplePaymentMethodTileNoCardOnFileViewState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C20751b0 samplePaymentMethodTileExpiredViewState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C20751b0 samplePaymentMethodTileValidCardViewState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final C20751b0 samplePaymentMethodTileWithHsaFsaViewState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final C20751b0 sampleReducedPaymentMethodTileNoCardOnFileViewState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final C20751b0 sampleReducedPaymentMethodTileNoCardOnStripeViewState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final C20751b0 sampleReducedPaymentMethodTileExpiredViewState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final C20751b0 sampleReducedPaymentMethodTileValidCardViewState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @SuppressLint({"ResourceType"})
    private static final C20751b0 sampleReducedPaymentMethodTileValidStripeCardViewState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final C20751b0 sampleReducedPaymentMethodTileWithHsaFsaViewState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final C20751b0 sampleViewStateReducedPaymentMethodTileWithHsaFsaViewState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final C20762h sampleCheckoutFooterViewState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final C20762h sampleCheckoutFooterDisabledViewState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final C29404c.a sampleDividerSectionViewState;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final C29404c.c sampleCheckoutScreenViewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final C29404c.c sampleCheckoutWithoutFooterScreenViewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final C29404c sampleLoadingViewState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final C29404c sampleNetworkErrorViewState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final C29404c sampleFailedStripeFlowControllerConfigurationViewState;

    /* JADX INFO: renamed from: ro2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f130774w = new a();

        /* JADX INFO: renamed from: a */
        public final long m97782a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m97782a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ro2.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f130775w = new b();

        /* JADX INFO: renamed from: a */
        public final long m97783a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m97783a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ro2.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f130776w = new c();

        /* JADX INFO: renamed from: a */
        public final long m97784a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m97784a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ro2.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f130777w = new d();

        /* JADX INFO: renamed from: a */
        public final long m97785a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m97785a((C39336i) obj));
        }
    }

    static {
        C31640a c31640a = new C31640a();
        f130747a = c31640a;
        C20783t c20783t = new C20783t(AbstractC8693b.m21278l("WHOOP Free Trial"), AbstractC8693b.m21278l("If you choose not to continue after your trial ends, your device and battery pack must be returned."), AbstractC8693b.m21278l("Learn More"), new C9598e(null, null, null, 7, null));
        sampleOrderDetailsSummaryViewState = c20783t;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Order details");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Order Details (2)");
        C20786w c20786w = new C20786w(AbstractC8693b.m21278l("Peak membership"), AbstractC8693b.m21278l("6 month membership"), new AbstractC22403o.a(AbstractC16272a.f62050b), null, AbstractC8693b.m21278l("$180"), null, AbstractC8693b.m21278l("Qty: 1"), EnumC20785v.WHITE);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Peak membership");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("6 month membership");
        AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f62006T4);
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("$180");
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("Qty: 1");
        EnumC20785v enumC20785v = EnumC20785v.TRANSPARENT;
        C20784u c20784u = new C20784u(textResourceM21278l, textResourceM21278l2, AbstractC37056f.m118959K(c20786w, new C20786w(textResourceM21278l3, textResourceM21278l4, aVar, null, textResourceM21278l5, null, textResourceM21278l6, enumC20785v)), null, c20783t, true);
        sampleOrderDetailsViewState = c20784u;
        sampleOrderDetailsWithStrikethroughPriceViewState = new C20784u(AbstractC8693b.m21278l("Order details"), AbstractC8693b.m21278l("Order Details (2)"), AbstractC37056f.m118959K(new C20786w(AbstractC8693b.m21278l("Peak membership"), AbstractC8693b.m21278l("6 month membership"), new AbstractC22403o.a(AbstractC16272a.f62050b), null, AbstractC8693b.m21278l("$180"), AbstractC8693b.m21278l("$270"), AbstractC8693b.m21278l("Qty: 1"), enumC20785v), new C20786w(AbstractC8693b.m21278l("Peak membership"), AbstractC8693b.m21278l("6 month membership"), new AbstractC22403o.a(AbstractC16272a.f62006T4), null, AbstractC8693b.m21278l("$180"), null, AbstractC8693b.m21278l("Qty: 1"), enumC20785v)), null, c20783t, true);
        sampleOrderDetailsCollapsedViewState = C20784u.m57295b(c20784u, AbstractC8693b.m21278l("Order details (1)"), null, null, null, null, false, 30, null);
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("Item subtotal");
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l("$180");
        EnumC20750b enumC20750b = EnumC20750b.REGULAR;
        C20768k c20768k = new C20768k(AbstractC37056f.m118959K(new C20748a(textResourceM21278l7, textResourceM21278l8, enumC20750b), new C20748a(AbstractC8693b.m21278l("Discounts"), AbstractC8693b.m21278l("-$59.40"), EnumC20750b.HIGHLIGHT_GREEN), new C20748a(AbstractC8693b.m21278l("Tax"), AbstractC8693b.m21278l("$5.99"), enumC20750b)), new C20772m(AbstractC8693b.m21278l("Total due"), AbstractC8693b.m21278l("$126.59")));
        sampleCheckoutInfoViewState = c20768k;
        sampleOrderDetailsWithCheckoutInfoViewState = C20784u.m57295b(c20784u, null, null, null, c20768k, null, false, 55, null);
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l("Payment Method");
        EnumC28807r enumC28807r = EnumC28807r.LARGE;
        AbstractC28805p.a aVar2 = new AbstractC28805p.a(textResourceM21278l9, null, enumC28807r, null, null, null, false, false, null, null, MessageListItemViewType.POLL, null);
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l("Add a new payment method");
        EnumC16313m0 enumC16313m0 = EnumC16313m0.CREDIT_CARD;
        C39274g c39274g = new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null);
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
        C39274g c39274g2 = new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null);
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        C20751b0 c20751b0 = new C20751b0(aVar2, new C39282o(null, textResourceM21278l10, null, false, false, new AbstractC39279l.b(null, null, c39274g, null, c39274g2, enumC39333f, null, null, null, null, null, false, 4043, null), false, null, null, new C9598e(null, null, null, 7, null), false, null, null, null, null, 31197, null), null, AbstractC37056f.m118958J(new AbstractC22403o.a(enumC16313m0.toWhoopIcon())), "", "", null);
        samplePaymentMethodTileNoCardOnFileViewState = c20751b0;
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l("Payment Method");
        TextResource textResourceM21278l12 = AbstractC8693b.m21278l("Change");
        EnumC16313m0 enumC16313m2 = EnumC16313m0.ARROW_FORWARD;
        int whoopIcon = enumC16313m2.toWhoopIcon();
        C9598e c9598e = new C9598e(null, null, null, 7, null);
        EnumC22400l enumC22400l = EnumC22400l.NONE;
        AbstractC28805p.e eVar = new AbstractC28805p.e(textResourceM21278l11, textResourceM21278l12, whoopIcon, enumC22400l, false, false, 0, false, enumC28807r, null, c9598e, null, 2800, null);
        TextResource textResourceM21278l13 = AbstractC8693b.m21278l("••••7492");
        C39274g c39274g3 = new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null);
        TextResource textResourceM21278l14 = AbstractC8693b.m21278l("Expired");
        int i13 = C17919x.f69638o;
        C20751b0 c20751b0M57124b = C20751b0.m57124b(c20751b0, eVar, new C39282o(null, textResourceM21278l13, null, false, false, new AbstractC39279l.b(null, null, c39274g3, p745y81.Function1.m125324b(AbstractC17918w0.m51533u()), null, enumC39333f, null, null, textResourceM21278l14, null, null, false, 3795, null), false, null, null, new C9598e(null, null, null, 7, null), false, null, null, null, null, 31197, null), null, null, null, null, null, 124, null);
        samplePaymentMethodTileExpiredViewState = c20751b0M57124b;
        C20751b0 c20751b0M57124b2 = C20751b0.m57124b(c20751b0M57124b, null, new C39282o(null, AbstractC8693b.m21278l("••••7492"), null, false, false, new AbstractC39279l.b(null, null, new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null), p745y81.Function1.m125324b(AbstractC17918w0.m51533u()), null, enumC39333f, null, null, null, null, null, false, 4051, null), false, null, null, new C9598e(null, null, null, 7, null), false, null, null, null, null, 31197, null), null, null, null, null, null, 125, null);
        samplePaymentMethodTileValidCardViewState = c20751b0M57124b2;
        C39282o c39282o = new C39282o(null, AbstractC8693b.m21278l("••••7492"), null, false, false, new AbstractC39279l.b(null, null, new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null), p745y81.Function1.m125324b(AbstractC17918w0.m51533u()), null, enumC39333f, null, null, null, null, null, false, 4051, null), false, null, null, new C9598e(null, null, null, 7, null), false, null, null, null, null, 31197, null);
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l15 = AbstractC8693b.m21278l("Pay with hsa/fsa");
        EnumC16313m0 enumC16313m3 = EnumC16313m0.HSA_FSA;
        samplePaymentMethodTileWithHsaFsaViewState = C20751b0.m57124b(c20751b0M57124b2, null, c39282o, C39282o.Companion.m125229d(companion, textResourceM21278l15, null, null, null, null, new C39274g(enumC16313m3.toWhoopIcon(), null, 2, null), p745y81.Function1.m125323a(a.f130774w), new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null), p745y81.Function1.m125323a(b.f130775w), null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388126, null), null, "cartId", "source", AbstractC25247g0.m73989X(AbstractC37056f.m118979e0("currency", "usd")), 9, null);
        C20751b0 c20751b1 = new C20751b0(new AbstractC28805p.a(AbstractC8693b.m21278l("Payment Method"), null, enumC28807r, null, null, null, false, false, null, null, MessageListItemViewType.POLL, null), C39282o.Companion.m125229d(companion, AbstractC8693b.m21278l("Add a new payment method"), null, null, null, null, new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null), null, null, null, null, null, null, null, null, false, false, null, true, null, null, null, false, null, 8257502, null), null, AbstractC37056f.m118959K(new AbstractC22403o.c("AMERICAN_EXPRESS", 0, 0, 0, 14, null), new AbstractC22403o.c("MASTERCARD", 0, 0, 0, 14, null), new AbstractC22403o.c("VISA", 0, 0, 0, 14, null), new AbstractC22403o.c("DISCOVER", 0, 0, 0, 14, null), new AbstractC22403o.c("DINERS_CLUB", 0, 0, 0, 14, null), new AbstractC22403o.c("GOOGLE_PAY", 0, 0, 0, 14, null)), "id", "", AbstractC25247g0.m73989X(AbstractC37056f.m118979e0("currency", "usd")));
        sampleReducedPaymentMethodTileNoCardOnFileViewState = c20751b1;
        C20751b0 c20751b0M57124b3 = C20751b0.m57124b(c20751b1, null, C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC24541a.f95769a), null, null, null, null, new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null), null, null, null, null, null, null, null, null, false, false, null, true, null, null, null, false, null, 8257502, null), null, null, null, null, null, 125, null);
        sampleReducedPaymentMethodTileNoCardOnStripeViewState = c20751b0M57124b3;
        C20751b0 c20751b0M57124b4 = C20751b0.m57124b(c20751b0M57124b3, new AbstractC28805p.e(AbstractC8693b.m21278l("Payment Method"), AbstractC8693b.m21278l("Change"), enumC16313m2.toWhoopIcon(), enumC22400l, false, false, 0, false, enumC28807r, null, new C9598e(null, null, null, 7, null), null, 2800, null), new C39282o(null, AbstractC8693b.m21278l("••••7492"), null, false, false, new AbstractC39279l.c(null, null, new AbstractC22403o.c("MASTERCARD", 0, 0, 0, 14, null), p745y81.Function1.m125324b(AbstractC17918w0.m51533u()), null, null, null, null, AbstractC8693b.m21278l("Expired"), null, null, false, 3827, null), false, null, null, null, false, null, null, null, null, 31197, null), null, null, null, null, null, 124, null);
        sampleReducedPaymentMethodTileExpiredViewState = c20751b0M57124b4;
        sampleReducedPaymentMethodTileValidCardViewState = C20751b0.m57124b(c20751b0M57124b4, null, new C39282o(null, AbstractC8693b.m21278l("••••7492"), null, false, false, new AbstractC39279l.c(null, null, new AbstractC22403o.c("MASTERCARD", 0, 0, 0, 14, null), p745y81.Function1.m125324b(AbstractC17918w0.m51533u()), null, null, null, null, null, null, null, false, 4083, null), false, null, null, null, false, null, null, null, null, 31197, null), null, null, null, null, null, 125, null);
        C20751b0 c20751b0M57124b5 = C20751b0.m57124b(c20751b1, null, new C39282o(null, AbstractC8693b.m21278l("Mock Payment Option"), null, false, false, new AbstractC39279l.c(null, null, new AbstractC22403o.a(7), p745y81.Function1.m125324b(AbstractC17918w0.m51533u()), null, null, null, null, null, null, null, false, 4083, null), false, null, null, null, false, null, null, null, null, 32733, null), null, null, null, null, null, 125, null);
        sampleReducedPaymentMethodTileValidStripeCardViewState = c20751b0M57124b5;
        sampleReducedPaymentMethodTileWithHsaFsaViewState = C20751b0.m57124b(c20751b0M57124b3, null, new C39282o(null, AbstractC8693b.m21278l("••••7492"), null, false, false, new AbstractC39279l.b(null, null, new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null), null, null, null, null, null, null, null, null, false, 4091, null), false, null, null, null, true, null, null, null, null, 31197, null), C39282o.Companion.m125229d(companion, AbstractC8693b.m21278l("Pay with hsa/fsa"), null, null, null, null, new C39274g(enumC16313m3.toWhoopIcon(), null, 2, null), null, new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null), enumC39333f, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388190, null), null, "", null, null, 41, null);
        sampleViewStateReducedPaymentMethodTileWithHsaFsaViewState = C20751b0.m57124b(c20751b0M57124b3, null, null, C39282o.Companion.m125229d(companion, AbstractC8693b.m21278l("Pay with hsa/fsa"), null, null, null, null, new C39274g(enumC16313m3.toWhoopIcon(), null, 2, null), p745y81.Function1.m125323a(c.f130776w), new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null), p745y81.Function1.m125323a(d.f130777w), null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388126, null), null, "id", "source", null, 75, null);
        C20762h c20762h = new C20762h(AbstractC8693b.m21278l("By placing an order, you agree to the WHOOP Terms of Use and Privacy Policy. Your next bill is $359 + tax and will be billed on November 8, 2026 unless canceled. Thereafter your membership will renew automatically as an annual WHOOP Life membership.\\\n\\\nPlease make sure all details are correct before placing your order, as changes can't be made after submitting."), AbstractC8693b.m21278l("Buy membership"), "test-checkout-path", "text-id", true, false);
        sampleCheckoutFooterViewState = c20762h;
        sampleCheckoutFooterDisabledViewState = C20762h.m57170b(c20762h, null, null, null, null, false, false, 47, null);
        List listM118958J = AbstractC37056f.m118958J(new C17736e(null, null, null, 7, null));
        UniversalCheckoutSectionSpacingType universalCheckoutSectionSpacingType = UniversalCheckoutSectionSpacingType.NORMAL;
        C29404c.a aVar3 = new C29404c.a(listM118958J, universalCheckoutSectionSpacingType);
        sampleDividerSectionViewState = aVar3;
        C29404c.c cVar = new C29404c.c(AbstractC8693b.m21278l("Checkout"), false, AbstractC37056f.m118959K(new C29404c.a(AbstractC37056f.m118958J(C20784u.m57295b(c20784u, null, null, AbstractC37056f.m118958J(c20784u.m57299f().get(0)), null, null, false, 59, null)), universalCheckoutSectionSpacingType), aVar3, new C29404c.a(AbstractC37056f.m118958J(c20768k), universalCheckoutSectionSpacingType), aVar3, new C29404c.a(AbstractC37056f.m118958J(c20751b0), universalCheckoutSectionSpacingType)), AbstractC37056f.m118958J(c20762h), 2, null);
        sampleCheckoutScreenViewState = cVar;
        C25271y c25271y = C25271y.f99162w;
        C29404c.c cVarM89669b = C29404c.c.m89669b(cVar, null, false, null, c25271y, 7, null);
        sampleCheckoutWithoutFooterScreenViewState = cVarM89669b;
        C33205o0 c33205o0 = C33205o0.f138451a;
        sampleLoadingViewState = new C29404c(null, new C29404c.b(c33205o0.m105288b(), null, null, null, 14, null), null, null, null, 25, null);
        C33211q0 c33211q0M105289c = c33205o0.m105289c();
        InterfaceC29402a.l lVar = new InterfaceC29402a.l("fakePath", "fakePayload", "source", null, null, null, 56, null);
        InterfaceC29402a.m mVar = InterfaceC29402a.m.f119335a;
        sampleNetworkErrorViewState = new C29404c(null, new C29404c.b(c33211q0M105289c, lVar, null, mVar, 4, null), null, null, null, 25, null);
        sampleFailedStripeFlowControllerConfigurationViewState = new C29404c(null, new C29404c.b(c33205o0.m105289c(), new InterfaceC29402a.l("fakePath", "fakePayload", "source", null, null, null, 56, null), null, mVar, 4, null), null, null, null, 29, null);
        sampleRequestFailedViewState = new C29404c(null, new C29404c.b(c33205o0.m105291e(), new InterfaceC29402a.l("fakePath", "fakePayload", "source", null, null, null, 56, null), null, mVar, 4, null), null, null, null, 25, null);
        sampleSuccessViewState = new C29404c(null, new C29404c.b(c33205o0.m105293g(), null, null, null, 14, null), null, null, null, 29, null);
        C29404c.d dVar = new C29404c.d(AbstractC8693b.m21278l("title"), AbstractC8693b.m21278l("Confirm"), null, AbstractC8693b.m21278l("Cancel"), AbstractC8693b.m21278l("description"), true, true, EnumC21213p.LOTTIE, null, null, 4, null);
        samplePopUpDialogState = dVar;
        sampleUniversalCheckoutViewState = new C29404c(null, null, cVar, null, null, 24, null);
        sampleReducedUniversalCheckoutViewState = new C29404c(null, null, c31640a.m97781g(c20751b0M57124b5), "id", null, 16, null);
        sampleUniversalCheckoutWithoutFooterViewState = new C29404c(null, null, cVarM89669b, null, null, 24, null);
        sampleUniversalCheckoutViewStateWithPopUpDialog = new C29404c(dVar, null, new C29404c.c(AbstractC8693b.m21278l("Checkout"), false, null, null, 14, null), "id", null, 16, null);
        C29404c c29404c = new C29404c(null, new C29404c.b(new C33211q0(null, new AbstractC33208p0.d(AbstractC8693b.m21277k(AbstractC24541a.f95776h)), AbstractC8693b.m21277k(AbstractC24541a.f95775g), null, null, false, false, null, false, true, 505, null), null, null, null, 14, null), cVar, null, null, 25, null);
        sampleProcessingOrderViewState = c29404c;
        C29404c c29404c2 = new C29404c(null, new C29404c.b(new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC24541a.f95774f), 0L, null, 6, null), null, null, null, false, false, null, false, true, 509, null), new InterfaceC29402a.q("cartId"), null, null, 12, null), cVar, null, null, 25, null);
        sampleSuccessfulProcessedOrderViewState = c29404c2;
        C33211q0 c33211q0 = new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21278l("Error"), false, null, 6, null), AbstractC8693b.m21278l("Invalid card"), null, AbstractC8693b.m21277k(AbstractC24541a.f95772d), false, false, null, false, true, 489, null);
        InterfaceC29402a.i iVar = InterfaceC29402a.i.f119319a;
        C29404c c29404c3 = new C29404c(null, new C29404c.b(c33211q0, iVar, null, null, 12, null), m97774h(c31640a, null, 1, null), null, null, 25, null);
        sampleFailedCheckoutViewState = c29404c3;
        sampleReducedFailedCheckoutViewState = C29404c.m89656c(c29404c3, null, null, c31640a.m97781g(c20751b0M57124b5), "id", null, 19, null);
        sampleFailedCheckoutOnlyTitleViewState = new C29404c(null, new C29404c.b(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC24541a.f95773e), false, null, 6, null), AbstractC8693b.m21278l("Invalid card"), null, AbstractC8693b.m21277k(AbstractC24541a.f95772d), false, false, null, false, true, 489, null), iVar, null, null, 12, null), c31640a.m97781g(c20751b0M57124b5), "id", null, 17, null);
        sampleFailedCheckoutDefaultTitleViewState = new C29404c(null, new C29404c.b(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC24541a.f95773e), false, null, 6, null), AbstractC8693b.m21267a(), null, AbstractC8693b.m21277k(AbstractC24541a.f95772d), false, false, null, false, true, 489, null), iVar, null, null, 12, null), c31640a.m97781g(c20751b0M57124b5), "id", null, 17, null);
        sampleReducedProcessingOrderViewState = C29404c.m89656c(c29404c, null, null, c31640a.m97781g(c20751b0M57124b5), "id", null, 19, null);
        sampleReducedSuccessfulProcessedOrderViewState = C29404c.m89656c(c29404c2, null, null, c31640a.m97781g(c20751b0M57124b5), "id", null, 19, null);
        sampleReducedUniversalCheckoutWithUnconfiguredFlowControllerViewState = new C29404c(null, null, new C29404c.c(AbstractC8693b.m21278l("Checkout"), false, AbstractC37056f.m118959K(new C29404c.a(AbstractC37056f.m118958J(C20784u.m57295b(c20784u, null, null, AbstractC37056f.m118958J(new C20786w(AbstractC8693b.m21278l("Peak membership"), AbstractC8693b.m21278l("6 month membership"), new AbstractC22403o.c("imageUrl", 0, 0, 0, 14, null), null, AbstractC8693b.m21278l("$180"), null, AbstractC8693b.m21278l("Qty: 1"), enumC20785v)), null, null, false, 27, null)), universalCheckoutSectionSpacingType), aVar3, new C29404c.a(AbstractC37056f.m118958J(c20768k), universalCheckoutSectionSpacingType), aVar3, new C29404c.a(AbstractC37056f.m118958J(C20751b0.m57124b(c20751b0M57124b5, new AbstractC28805p.a(AbstractC8693b.m21278l("Payment Method"), null, enumC28807r, null, null, null, false, false, null, null, MessageListItemViewType.POLL, null), C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC24541a.f95769a), null, null, null, null, new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null), null, null, null, null, null, null, null, null, false, false, null, true, null, null, null, false, null, 8241118, null), null, null, null, null, null, 124, null)), universalCheckoutSectionSpacingType)), AbstractC37056f.m118958J(C20762h.m57170b(c20762h, null, null, null, null, false, false, 47, null)), 2, null), "id", null, 16, null);
        AbstractC28805p.e eVar2 = new AbstractC28805p.e(AbstractC8693b.m21278l("Shipping Address"), AbstractC8693b.m21278l("Change"), enumC16313m2.toWhoopIcon(), enumC22400l, false, false, 0, false, enumC28807r, null, new C9598e(null, null, null, 7, null), null, 2800, null);
        TextResource textResourceM21278l16 = AbstractC8693b.m21278l("Add a new shipping address");
        EnumC16313m0 enumC16313m4 = EnumC16313m0.LOCATION;
        C39282o c39282o2 = new C39282o(null, textResourceM21278l16, null, false, false, new AbstractC39279l.b(null, null, new C39274g(enumC16313m4.toWhoopIcon(), null, 2, null), null, new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null), enumC39333f, null, null, null, null, null, false, 4043, null), false, null, null, new C9598e(null, null, null, 7, null), false, null, null, null, null, 31197, null);
        AppScreen.C9318g6 c9318g6 = AppScreen.C9318g6.f27632w;
        NavigationScreenModel.None none = NavigationScreenModel.None.INSTANCE;
        previewTileShippingAddressData = new C20755d0(eVar2, c39282o2, new C9598e(c9318g6, none, null, 4, null), "");
        previewTileShippingMethodData = new C20755d0(new AbstractC28805p.e(AbstractC8693b.m21278l("Shipping method"), AbstractC8693b.m21278l("Change"), enumC16313m2.toWhoopIcon(), enumC22400l, false, false, 0, false, enumC28807r, null, new C9598e(null, null, null, 7, null), null, 2800, null), new C39282o(null, AbstractC8693b.m21278l("Free (Arrives in 5 - 7 days)"), null, false, false, new AbstractC39279l.b(null, null, new C39274g(enumC16313m4.toWhoopIcon(), null, 2, null), null, new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null), enumC39333f, null, null, null, null, null, false, 4043, null), false, null, null, new C9598e(null, null, null, 7, null), false, null, null, null, null, 31197, null), new C9598e(c9318g6, none, null, 4, null), "");
        sampleCollapsedPromoInputCodeViewState = new C20777o0(AbstractC8693b.m21278l("Enter a promo code?"), AbstractC8693b.m21278l("Enter a promo code"), AbstractC8693b.m21278l("APPLY"), null, c25271y, false, "");
        sampleExpandedPromoInputCodeViewState = new C20777o0(AbstractC8693b.m21278l("Enter a promo code?"), AbstractC8693b.m21278l("Enter a promo code"), AbstractC8693b.m21278l("APPLY"), null, c25271y, true, "");
        sampleLoadingPromoInputCodeViewState = new C20777o0(AbstractC8693b.m21278l("Enter a promo code?"), AbstractC8693b.m21278l("Enter a promo code"), AbstractC8693b.m21278l("APPLY"), AbstractC20775n0.b.f78016a, c25271y, true, "");
        TextResource textResourceM21278l17 = AbstractC8693b.m21278l("Enter a promo code");
        TextResource textResourceM21278l18 = AbstractC8693b.m21278l("Enter a promo code?");
        TextResource textResourceM21278l19 = AbstractC8693b.m21278l("APPLY");
        List listM118958J2 = AbstractC37056f.m118958J(new C20779p0("id", AbstractC8693b.m21278l("EXT10"), null));
        AbstractC20775n0.c cVar2 = AbstractC20775n0.c.f78017a;
        sampleValidPromoInputCodeViewState = new C20777o0(textResourceM21278l18, textResourceM21278l17, textResourceM21278l19, cVar2, listM118958J2, true, "");
        TextResource textResourceM21278l20 = AbstractC8693b.m21278l("Enter a promo code");
        TextResource textResourceM21278l21 = AbstractC8693b.m21278l("Enter a promo code?");
        TextResource textResourceM21278l22 = AbstractC8693b.m21278l("APPLY");
        TextResource textResourceM21278l23 = AbstractC8693b.m21278l("Invalid Promo Code");
        EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND;
        sampleInvalidPromoInputCodeViewState = new C20777o0(textResourceM21278l21, textResourceM21278l20, textResourceM21278l22, new AbstractC20775n0.a(textResourceM21278l23, enumC39333f2), c25271y, true, "");
        C20777o0 c20777o0 = new C20777o0(AbstractC8693b.m21278l("Enter a promo code?"), AbstractC8693b.m21278l("Enter a promo code"), AbstractC8693b.m21278l("APPLY"), cVar2, AbstractC37056f.m118959K(new C20779p0("id", AbstractC8693b.m21278l("EXT10"), null), new C20779p0("id", AbstractC8693b.m21278l("•••• C124"), EnumC16313m0.GIFT_CARD)), true, "");
        sampleValidPromoCodeAndGiftCardPromoInputCodeViewState = c20777o0;
        sampleValidPromoCodeAndGiftCardWithErrorMessagePromoInputCodeViewState = C20777o0.m57244b(c20777o0, null, null, null, new AbstractC20775n0.a(AbstractC8693b.m21278l("Invalid Promo Code"), enumC39333f2), null, false, null, 119, null);
        sampleAnnualCheckboxViewState = new C17777p0("id", AbstractC8693b.m21278l("Save 33% by switching to annual billing"), true, EnumC17774o0.CHECKBOX);
        f130748a0 = 8;
    }

    private C31640a() {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C29404c.c m97774h(C31640a c31640a, C20751b0 c20751b0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c20751b0 = null;
        }
        return c31640a.m97781g(c20751b0);
    }

    /* JADX INFO: renamed from: a */
    public final C20777o0 m97775a() {
        return sampleCollapsedPromoInputCodeViewState;
    }

    /* JADX INFO: renamed from: b */
    public final C20777o0 m97776b() {
        return sampleExpandedPromoInputCodeViewState;
    }

    /* JADX INFO: renamed from: c */
    public final C20777o0 m97777c() {
        return sampleInvalidPromoInputCodeViewState;
    }

    /* JADX INFO: renamed from: d */
    public final C20777o0 m97778d() {
        return sampleLoadingPromoInputCodeViewState;
    }

    /* JADX INFO: renamed from: e */
    public final C20777o0 m97779e() {
        return sampleValidPromoCodeAndGiftCardPromoInputCodeViewState;
    }

    /* JADX INFO: renamed from: f */
    public final C20777o0 m97780f() {
        return sampleValidPromoCodeAndGiftCardWithErrorMessagePromoInputCodeViewState;
    }

    /* JADX INFO: renamed from: g */
    public final C29404c.c m97781g(C20751b0 paymentMethodTile) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Checkout");
        List listM118958J = AbstractC37056f.m118958J(C20784u.m57295b(sampleOrderDetailsViewState, null, null, AbstractC37056f.m118958J(new C20786w(AbstractC8693b.m21278l("Peak membership"), AbstractC8693b.m21278l("6 month membership"), new AbstractC22403o.c("imageUrl", 0, 0, 0, 14, null), null, AbstractC8693b.m21278l("$180"), null, AbstractC8693b.m21278l("Qty: 1"), EnumC20785v.TRANSPARENT)), null, null, false, 27, null));
        UniversalCheckoutSectionSpacingType universalCheckoutSectionSpacingType = UniversalCheckoutSectionSpacingType.NORMAL;
        C29404c.a aVar = new C29404c.a(listM118958J, universalCheckoutSectionSpacingType);
        C29404c.a aVar2 = sampleDividerSectionViewState;
        return new C29404c.c(textResourceM21278l, false, AbstractC37056f.m118959K(aVar, aVar2, new C29404c.a(AbstractC37056f.m118958J(sampleCheckoutInfoViewState), universalCheckoutSectionSpacingType), aVar2, new C29404c.a(AbstractC37056f.m118958J(paymentMethodTile == null ? sampleReducedPaymentMethodTileNoCardOnStripeViewState : paymentMethodTile), universalCheckoutSectionSpacingType)), AbstractC37056f.m118958J(sampleCheckoutFooterViewState), 2, null);
    }
}

package com.whoop.challengedetails.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jh3.AbstractC21702c;
import kg2.C22458d;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0081\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001cJ\u0090\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010A\u0012\u0004\bC\u0010@\u001a\u0004\bB\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010D\u0012\u0004\bE\u0010@\u001a\u0004\b\u0007\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010=\u0012\u0004\bG\u0010@\u001a\u0004\bF\u0010\u001cR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\bI\u0010@\u001a\u0004\bH\u0010\u001cR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010J\u0012\u0004\bL\u0010@\u001a\u0004\bK\u0010$R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\bN\u0010@\u001a\u0004\bM\u0010\u001cR \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\bP\u0010@\u001a\u0004\bO\u0010\u001cR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\bR\u0010@\u001a\u0004\bQ\u0010\u001cR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010S\u0012\u0004\bU\u0010@\u001a\u0004\bT\u0010)R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010=\u0012\u0004\bW\u0010@\u001a\u0004\bV\u0010\u001cR \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010=\u0012\u0004\bY\u0010@\u001a\u0004\bX\u0010\u001c¨\u0006\\"}, m65681d2 = {"Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "", "headerImageUrl", "", "isMemberEligible", "ineligibleText", "challengeTitle", "", "Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;", "challengeCardItems", "descriptionTitle", "descriptionText", "ctaText", "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;", "style", "savingText", "savingSubText", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;", "component11", "component12", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$challenge_details_release", "(Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getToolbarTitle", "getToolbarTitle$annotations", "()V", "Ljava/lang/String;", "getHeaderImageUrl", "getHeaderImageUrl$annotations", "Z", "isMemberEligible$annotations", "getIneligibleText", "getIneligibleText$annotations", "getChallengeTitle", "getChallengeTitle$annotations", "Ljava/util/List;", "getChallengeCardItems", "getChallengeCardItems$annotations", "getDescriptionTitle", "getDescriptionTitle$annotations", "getDescriptionText", "getDescriptionText$annotations", "getCtaText", "getCtaText$annotations", "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;", "getStyle", "getStyle$annotations", "getSavingText", "getSavingText$annotations", "getSavingSubText", "getSavingSubText$annotations", "Companion", "$serializer", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChallengeDetailsResponse {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("challenge_card_items")
    private final List<ChallengeCardItem> challengeCardItems;

    @SerializedName("challenge_title")
    private final TextResource challengeTitle;

    @SerializedName("cta_text")
    private final TextResource ctaText;

    @SerializedName("description_text")
    private final TextResource descriptionText;

    @SerializedName("description_title")
    private final TextResource descriptionTitle;

    @SerializedName("header_image_url")
    private final String headerImageUrl;

    @SerializedName("ineligible_text")
    private final TextResource ineligibleText;

    @SerializedName("is_member_eligible")
    private final boolean isMemberEligible;

    @SerializedName("saving_sub_text")
    private final TextResource savingSubText;

    @SerializedName("saving_text")
    private final TextResource savingText;

    @SerializedName("style")
    private final ChallengeDetailsStyle style;

    @SerializedName("toolbar_title")
    private final TextResource toolbarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;", "serializer", "()Lwc3/c;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChallengeDetailsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C22458d(11)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C22458d(12)), null, null};
    }

    public /* synthetic */ ChallengeDetailsResponse(int i13, TextResource textResource, String str, boolean z4, TextResource textResource2, TextResource textResource3, List list, TextResource textResource4, TextResource textResource5, TextResource textResource6, ChallengeDetailsStyle challengeDetailsStyle, TextResource textResource7, TextResource textResource8, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, ChallengeDetailsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.toolbarTitle = textResource;
        this.headerImageUrl = str;
        this.isMemberEligible = z4;
        this.ineligibleText = textResource2;
        this.challengeTitle = textResource3;
        this.challengeCardItems = list;
        this.descriptionTitle = textResource4;
        this.descriptionText = textResource5;
        this.ctaText = textResource6;
        this.style = challengeDetailsStyle;
        this.savingText = textResource7;
        this.savingSubText = textResource8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ChallengeCardItem$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return ChallengeDetailsStyle.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeDetailsResponse copy$default(ChallengeDetailsResponse challengeDetailsResponse, TextResource textResource, String str, boolean z4, TextResource textResource2, TextResource textResource3, List list, TextResource textResource4, TextResource textResource5, TextResource textResource6, ChallengeDetailsStyle challengeDetailsStyle, TextResource textResource7, TextResource textResource8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = challengeDetailsResponse.toolbarTitle;
        }
        if ((i13 & 2) != 0) {
            str = challengeDetailsResponse.headerImageUrl;
        }
        if ((i13 & 4) != 0) {
            z4 = challengeDetailsResponse.isMemberEligible;
        }
        if ((i13 & 8) != 0) {
            textResource2 = challengeDetailsResponse.ineligibleText;
        }
        if ((i13 & 16) != 0) {
            textResource3 = challengeDetailsResponse.challengeTitle;
        }
        if ((i13 & 32) != 0) {
            list = challengeDetailsResponse.challengeCardItems;
        }
        if ((i13 & 64) != 0) {
            textResource4 = challengeDetailsResponse.descriptionTitle;
        }
        if ((i13 & 128) != 0) {
            textResource5 = challengeDetailsResponse.descriptionText;
        }
        if ((i13 & 256) != 0) {
            textResource6 = challengeDetailsResponse.ctaText;
        }
        if ((i13 & 512) != 0) {
            challengeDetailsStyle = challengeDetailsResponse.style;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            textResource7 = challengeDetailsResponse.savingText;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            textResource8 = challengeDetailsResponse.savingSubText;
        }
        TextResource textResource9 = textResource7;
        TextResource textResource10 = textResource8;
        TextResource textResource11 = textResource6;
        ChallengeDetailsStyle challengeDetailsStyle2 = challengeDetailsStyle;
        TextResource textResource12 = textResource4;
        TextResource textResource13 = textResource5;
        TextResource textResource14 = textResource3;
        List list2 = list;
        return challengeDetailsResponse.copy(textResource, str, z4, textResource2, textResource14, list2, textResource12, textResource13, textResource11, challengeDetailsStyle2, textResource9, textResource10);
    }

    @InterfaceC37143h("challenge_card_items")
    public static /* synthetic */ void getChallengeCardItems$annotations() {
    }

    @InterfaceC37143h("challenge_title")
    public static /* synthetic */ void getChallengeTitle$annotations() {
    }

    @InterfaceC37143h("cta_text")
    public static /* synthetic */ void getCtaText$annotations() {
    }

    @InterfaceC37143h("description_text")
    public static /* synthetic */ void getDescriptionText$annotations() {
    }

    @InterfaceC37143h("description_title")
    public static /* synthetic */ void getDescriptionTitle$annotations() {
    }

    @InterfaceC37143h("header_image_url")
    public static /* synthetic */ void getHeaderImageUrl$annotations() {
    }

    @InterfaceC37143h("ineligible_text")
    public static /* synthetic */ void getIneligibleText$annotations() {
    }

    @InterfaceC37143h("saving_sub_text")
    public static /* synthetic */ void getSavingSubText$annotations() {
    }

    @InterfaceC37143h("saving_text")
    public static /* synthetic */ void getSavingText$annotations() {
    }

    @InterfaceC37143h("style")
    public static /* synthetic */ void getStyle$annotations() {
    }

    @InterfaceC37143h("toolbar_title")
    public static /* synthetic */ void getToolbarTitle$annotations() {
    }

    @InterfaceC37143h("is_member_eligible")
    public static /* synthetic */ void isMemberEligible$annotations() {
    }

    public static final /* synthetic */ void write$Self$challenge_details_release(ChallengeDetailsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.toolbarTitle);
        output.encodeStringElement(serialDesc, 1, self.headerImageUrl);
        output.encodeBooleanElement(serialDesc, 2, self.isMemberEligible);
        output.encodeNullableSerializableElement(serialDesc, 3, c25452a, self.ineligibleText);
        output.encodeSerializableElement(serialDesc, 4, c25452a, self.challengeTitle);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.challengeCardItems);
        output.encodeSerializableElement(serialDesc, 6, c25452a, self.descriptionTitle);
        output.encodeSerializableElement(serialDesc, 7, c25452a, self.descriptionText);
        output.encodeSerializableElement(serialDesc, 8, c25452a, self.ctaText);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.style);
        output.encodeSerializableElement(serialDesc, 10, c25452a, self.savingText);
        output.encodeSerializableElement(serialDesc, 11, c25452a, self.savingSubText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ChallengeDetailsStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TextResource getSavingText() {
        return this.savingText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TextResource getSavingSubText() {
        return this.savingSubText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMemberEligible() {
        return this.isMemberEligible;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getIneligibleText() {
        return this.ineligibleText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getChallengeTitle() {
        return this.challengeTitle;
    }

    public final List<ChallengeCardItem> component6() {
        return this.challengeCardItems;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextResource getDescriptionTitle() {
        return this.descriptionTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextResource getDescriptionText() {
        return this.descriptionText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    public final ChallengeDetailsResponse copy(TextResource toolbarTitle, String headerImageUrl, boolean isMemberEligible, TextResource ineligibleText, TextResource challengeTitle, List<ChallengeCardItem> challengeCardItems, TextResource descriptionTitle, TextResource descriptionText, TextResource ctaText, ChallengeDetailsStyle style, TextResource savingText, TextResource savingSubText) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(headerImageUrl, "headerImageUrl");
        AbstractC22676k.m65750j(challengeTitle, "challengeTitle");
        AbstractC22676k.m65750j(challengeCardItems, "challengeCardItems");
        AbstractC22676k.m65750j(descriptionTitle, "descriptionTitle");
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(savingText, "savingText");
        AbstractC22676k.m65750j(savingSubText, "savingSubText");
        return new ChallengeDetailsResponse(toolbarTitle, headerImageUrl, isMemberEligible, ineligibleText, challengeTitle, challengeCardItems, descriptionTitle, descriptionText, ctaText, style, savingText, savingSubText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeDetailsResponse)) {
            return false;
        }
        ChallengeDetailsResponse challengeDetailsResponse = (ChallengeDetailsResponse) other;
        return AbstractC22676k.m65745e(this.toolbarTitle, challengeDetailsResponse.toolbarTitle) && AbstractC22676k.m65745e(this.headerImageUrl, challengeDetailsResponse.headerImageUrl) && this.isMemberEligible == challengeDetailsResponse.isMemberEligible && AbstractC22676k.m65745e(this.ineligibleText, challengeDetailsResponse.ineligibleText) && AbstractC22676k.m65745e(this.challengeTitle, challengeDetailsResponse.challengeTitle) && AbstractC22676k.m65745e(this.challengeCardItems, challengeDetailsResponse.challengeCardItems) && AbstractC22676k.m65745e(this.descriptionTitle, challengeDetailsResponse.descriptionTitle) && AbstractC22676k.m65745e(this.descriptionText, challengeDetailsResponse.descriptionText) && AbstractC22676k.m65745e(this.ctaText, challengeDetailsResponse.ctaText) && this.style == challengeDetailsResponse.style && AbstractC22676k.m65745e(this.savingText, challengeDetailsResponse.savingText) && AbstractC22676k.m65745e(this.savingSubText, challengeDetailsResponse.savingSubText);
    }

    public final List<ChallengeCardItem> getChallengeCardItems() {
        return this.challengeCardItems;
    }

    public final TextResource getChallengeTitle() {
        return this.challengeTitle;
    }

    public final TextResource getCtaText() {
        return this.ctaText;
    }

    public final TextResource getDescriptionText() {
        return this.descriptionText;
    }

    public final TextResource getDescriptionTitle() {
        return this.descriptionTitle;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final TextResource getIneligibleText() {
        return this.ineligibleText;
    }

    public final TextResource getSavingSubText() {
        return this.savingSubText;
    }

    public final TextResource getSavingText() {
        return this.savingText;
    }

    public final ChallengeDetailsStyle getStyle() {
        return this.style;
    }

    public final TextResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.toolbarTitle.hashCode() * 31, 31, this.headerImageUrl), 31, this.isMemberEligible);
        TextResource textResource = this.ineligibleText;
        return this.savingSubText.hashCode() + AbstractC31061c.m95625a((this.style.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a((iM8289b + (textResource == null ? 0 : textResource.hashCode())) * 31, this.challengeTitle, 31), 31, this.challengeCardItems), this.descriptionTitle, 31), this.descriptionText, 31), this.ctaText, 31)) * 31, this.savingText, 31);
    }

    public final boolean isMemberEligible() {
        return this.isMemberEligible;
    }

    public String toString() {
        TextResource textResource = this.toolbarTitle;
        String str = this.headerImageUrl;
        boolean z4 = this.isMemberEligible;
        TextResource textResource2 = this.ineligibleText;
        TextResource textResource3 = this.challengeTitle;
        List<ChallengeCardItem> list = this.challengeCardItems;
        TextResource textResource4 = this.descriptionTitle;
        TextResource textResource5 = this.descriptionText;
        TextResource textResource6 = this.ctaText;
        ChallengeDetailsStyle challengeDetailsStyle = this.style;
        TextResource textResource7 = this.savingText;
        TextResource textResource8 = this.savingSubText;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("ChallengeDetailsResponse(toolbarTitle=", textResource, ", headerImageUrl=", str, ", isMemberEligible=");
        AbstractC21702c.m61144o(textResource2, ", ineligibleText=", ", challengeTitle=", sbM91845o, z4);
        AbstractC21702c.m61143n(textResource3, ", challengeCardItems=", ", descriptionTitle=", sbM91845o, list);
        AbstractC30007c.m91855y(sbM91845o, textResource4, ", descriptionText=", textResource5, ", ctaText=");
        sbM91845o.append(textResource6);
        sbM91845o.append(", style=");
        sbM91845o.append(challengeDetailsStyle);
        sbM91845o.append(", savingText=");
        return AbstractC33745d.m106655n(sbM91845o, textResource7, ", savingSubText=", textResource8, ")");
    }

    public ChallengeDetailsResponse(TextResource toolbarTitle, String headerImageUrl, boolean z4, TextResource textResource, TextResource challengeTitle, List<ChallengeCardItem> challengeCardItems, TextResource descriptionTitle, TextResource descriptionText, TextResource ctaText, ChallengeDetailsStyle style, TextResource savingText, TextResource savingSubText) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(headerImageUrl, "headerImageUrl");
        AbstractC22676k.m65750j(challengeTitle, "challengeTitle");
        AbstractC22676k.m65750j(challengeCardItems, "challengeCardItems");
        AbstractC22676k.m65750j(descriptionTitle, "descriptionTitle");
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(savingText, "savingText");
        AbstractC22676k.m65750j(savingSubText, "savingSubText");
        this.toolbarTitle = toolbarTitle;
        this.headerImageUrl = headerImageUrl;
        this.isMemberEligible = z4;
        this.ineligibleText = textResource;
        this.challengeTitle = challengeTitle;
        this.challengeCardItems = challengeCardItems;
        this.descriptionTitle = descriptionTitle;
        this.descriptionText = descriptionText;
        this.ctaText = ctaText;
        this.style = style;
        this.savingText = savingText;
        this.savingSubText = savingSubText;
    }
}

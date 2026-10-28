package com.whoop.activation.domain.models.steps;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r70.C31050b;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002SRBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0098\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b/\u0010#J\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bC\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bD\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bE\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bH\u0010\u001cR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bI\u0010#R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bJ\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bK\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bL\u0010#R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bP\u0010,R\u0014\u0010Q\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u001c¨\u0006T"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/TrialPlanOption;", "Lcom/whoop/activation/domain/models/steps/PlanPickerOption;", "", "shouldSkipNextScreen", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "price", "priceSubtitle", "", "disclaimer", "selected", "membershipTier", "trackingLabel", "tag", "strikethroughPrice", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentType", "Lcom/whoop/navigation/e;", "destination", "<init>", "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "component13", "()Lcom/whoop/navigation/e;", "copy", "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;)Lcom/whoop/activation/domain/models/steps/TrialPlanOption;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/TrialPlanOption;Lzc3/c;Lyc3/g;)V", "write$Self", "Z", "getShouldSkipNextScreen", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "getPrice", "getPriceSubtitle", "Ljava/lang/String;", "getDisclaimer", "getSelected", "getMembershipTier", "getTrackingLabel", "getTag", "getStrikethroughPrice", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "getCommitmentType", "Lcom/whoop/navigation/e;", "getDestination", "isSelected", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrialPlanOption implements PlanPickerOption {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CommitmentType commitmentType;
    private final C9598e destination;
    private final String disclaimer;
    private final String membershipTier;
    private final TextResource price;
    private final TextResource priceSubtitle;
    private final boolean selected;
    private final boolean shouldSkipNextScreen;
    private final String strikethroughPrice;
    private final TextResource subtitle;
    private final String tag;
    private final TextResource title;
    private final String trackingLabel;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/TrialPlanOption$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/TrialPlanOption;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrialPlanOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        $stable = i13 | i14 | i14 | i14 | i14;
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31050b(10)), AbstractC30060g.m92087G(enumC23463i, new C31050b(11))};
    }

    public /* synthetic */ TrialPlanOption(int i13, boolean z4, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, boolean z13, String str2, String str3, String str4, String str5, CommitmentType commitmentType, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i13 & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 8191, TrialPlanOption$$serializer.INSTANCE.getDescriptor());
        }
        this.shouldSkipNextScreen = z4;
        this.title = textResource;
        this.subtitle = textResource2;
        this.price = textResource3;
        this.priceSubtitle = textResource4;
        this.disclaimer = str;
        this.selected = z13;
        this.membershipTier = str2;
        this.trackingLabel = str3;
        this.tag = str4;
        this.strikethroughPrice = str5;
        this.commitmentType = commitmentType;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.activation.domain.models.steps.CommitmentType", CommitmentType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ TrialPlanOption copy$default(TrialPlanOption trialPlanOption, boolean z4, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, boolean z13, String str2, String str3, String str4, String str5, CommitmentType commitmentType, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = trialPlanOption.shouldSkipNextScreen;
        }
        return trialPlanOption.copy(z4, (i13 & 2) != 0 ? trialPlanOption.title : textResource, (i13 & 4) != 0 ? trialPlanOption.subtitle : textResource2, (i13 & 8) != 0 ? trialPlanOption.price : textResource3, (i13 & 16) != 0 ? trialPlanOption.priceSubtitle : textResource4, (i13 & 32) != 0 ? trialPlanOption.disclaimer : str, (i13 & 64) != 0 ? trialPlanOption.selected : z13, (i13 & 128) != 0 ? trialPlanOption.membershipTier : str2, (i13 & 256) != 0 ? trialPlanOption.trackingLabel : str3, (i13 & 512) != 0 ? trialPlanOption.tag : str4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? trialPlanOption.strikethroughPrice : str5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? trialPlanOption.commitmentType : commitmentType, (i13 & 4096) != 0 ? trialPlanOption.destination : c9598e);
    }

    public static final /* synthetic */ void write$Self$activation_release(TrialPlanOption self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.shouldSkipNextScreen);
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.price);
        output.encodeSerializableElement(serialDesc, 4, c25452a, self.priceSubtitle);
        output.encodeStringElement(serialDesc, 5, self.disclaimer);
        output.encodeBooleanElement(serialDesc, 6, self.selected);
        output.encodeStringElement(serialDesc, 7, self.membershipTier);
        output.encodeStringElement(serialDesc, 8, self.trackingLabel);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.tag);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.strikethroughPrice);
        output.encodeSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.getCommitmentType());
        output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShouldSkipNextScreen() {
        return this.shouldSkipNextScreen;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final CommitmentType getCommitmentType() {
        return this.commitmentType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getPriceSubtitle() {
        return this.priceSubtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMembershipTier() {
        return this.membershipTier;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    public final TrialPlanOption copy(boolean shouldSkipNextScreen, TextResource title, TextResource subtitle, TextResource price, TextResource priceSubtitle, String disclaimer, boolean selected, String membershipTier, String trackingLabel, String tag, String strikethroughPrice, CommitmentType commitmentType, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(priceSubtitle, "priceSubtitle");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(membershipTier, "membershipTier");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(commitmentType, "commitmentType");
        return new TrialPlanOption(shouldSkipNextScreen, title, subtitle, price, priceSubtitle, disclaimer, selected, membershipTier, trackingLabel, tag, strikethroughPrice, commitmentType, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrialPlanOption)) {
            return false;
        }
        TrialPlanOption trialPlanOption = (TrialPlanOption) other;
        return this.shouldSkipNextScreen == trialPlanOption.shouldSkipNextScreen && AbstractC22676k.m65745e(this.title, trialPlanOption.title) && AbstractC22676k.m65745e(this.subtitle, trialPlanOption.subtitle) && AbstractC22676k.m65745e(this.price, trialPlanOption.price) && AbstractC22676k.m65745e(this.priceSubtitle, trialPlanOption.priceSubtitle) && AbstractC22676k.m65745e(this.disclaimer, trialPlanOption.disclaimer) && this.selected == trialPlanOption.selected && AbstractC22676k.m65745e(this.membershipTier, trialPlanOption.membershipTier) && AbstractC22676k.m65745e(this.trackingLabel, trialPlanOption.trackingLabel) && AbstractC22676k.m65745e(this.tag, trialPlanOption.tag) && AbstractC22676k.m65745e(this.strikethroughPrice, trialPlanOption.strikethroughPrice) && this.commitmentType == trialPlanOption.commitmentType && AbstractC22676k.m65745e(this.destination, trialPlanOption.destination);
    }

    @Override // com.whoop.activation.domain.models.steps.PlanPickerOption
    public CommitmentType getCommitmentType() {
        return this.commitmentType;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getMembershipTier() {
        return this.membershipTier;
    }

    public final TextResource getPrice() {
        return this.price;
    }

    public final TextResource getPriceSubtitle() {
        return this.priceSubtitle;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean getShouldSkipNextScreen() {
        return this.shouldSkipNextScreen;
    }

    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final String getTag() {
        return this.tag;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(Boolean.hashCode(this.shouldSkipNextScreen) * 31, this.title, 31), this.subtitle, 31), this.price, 31), this.priceSubtitle, 31), 31, this.disclaimer), 31, this.selected), 31, this.membershipTier), 31, this.trackingLabel);
        String str = this.tag;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.strikethroughPrice;
        int iHashCode2 = (this.commitmentType.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        C9598e c9598e = this.destination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    @Override // com.whoop.activation.domain.models.steps.PlanPickerOption
    /* JADX INFO: renamed from: isSelected */
    public boolean getIsOptionSelected() {
        return this.selected;
    }

    public String toString() {
        boolean z4 = this.shouldSkipNextScreen;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.price;
        TextResource textResource4 = this.priceSubtitle;
        String str = this.disclaimer;
        boolean z13 = this.selected;
        String str2 = this.membershipTier;
        String str3 = this.trackingLabel;
        String str4 = this.tag;
        String str5 = this.strikethroughPrice;
        CommitmentType commitmentType = this.commitmentType;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("TrialPlanOption(shouldSkipNextScreen=");
        sb4.append(z4);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", subtitle=");
        AbstractC30007c.m91855y(sb4, textResource2, ", price=", textResource3, ", priceSubtitle=");
        AbstractC30007c.m91856z(sb4, textResource4, ", disclaimer=", str, ", selected=");
        AbstractC38963t7.m124391u(sb4, z13, ", membershipTier=", str2, ", trackingLabel=");
        AbstractC11266d.m30444B(sb4, str3, ", tag=", str4, ", strikethroughPrice=");
        sb4.append(str5);
        sb4.append(", commitmentType=");
        sb4.append(commitmentType);
        sb4.append(", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    public TrialPlanOption(boolean z4, TextResource title, TextResource subtitle, TextResource price, TextResource priceSubtitle, String disclaimer, boolean z13, String membershipTier, String trackingLabel, String str, String str2, CommitmentType commitmentType, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(priceSubtitle, "priceSubtitle");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(membershipTier, "membershipTier");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(commitmentType, "commitmentType");
        this.shouldSkipNextScreen = z4;
        this.title = title;
        this.subtitle = subtitle;
        this.price = price;
        this.priceSubtitle = priceSubtitle;
        this.disclaimer = disclaimer;
        this.selected = z13;
        this.membershipTier = membershipTier;
        this.trackingLabel = trackingLabel;
        this.tag = str;
        this.strikethroughPrice = str2;
        this.commitmentType = commitmentType;
        this.destination = c9598e;
    }
}

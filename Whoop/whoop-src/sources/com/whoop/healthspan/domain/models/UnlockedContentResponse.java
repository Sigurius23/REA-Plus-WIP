package com.whoop.healthspan.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import java.lang.annotation.Annotation;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJBo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u008c\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b\u0005\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bA\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bD\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bE\u0010\u001dR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bF\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bG\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010(¨\u0006L"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;", "", "Lcom/whoop/design/models/items/DateSelectorModel;", "datePicker", "", "isCalibrating", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "whoopAgeAmoeba", "previousWhoopAgeAmoeba", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/healthspan/domain/models/FeaturedHighlight;", "featuredHighlights", "hasBeenSeenByUser", "Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;", "amoebaOnboardingSteps", "hasOnboarded", "healthspanLabsIntroEnabled", "<init>", "(Lcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component2", "()Z", "component3", "()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Boolean;", "copy", "(Lcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;)Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/DateSelectorModel;", "getDatePicker", "Z", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "getWhoopAgeAmoeba", "getPreviousWhoopAgeAmoeba", "Ljava/util/List;", "getItems", "getFeaturedHighlights", "getHasBeenSeenByUser", "getAmoebaOnboardingSteps", "getHasOnboarded", "Ljava/lang/Boolean;", "getHealthspanLabsIntroEnabled", "Companion", "$serializer", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UnlockedContentResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<AmoebaOnboardingStep> amoebaOnboardingSteps;
    private final DateSelectorModel datePicker;
    private final List<FeaturedHighlight> featuredHighlights;
    private final boolean hasBeenSeenByUser;
    private final boolean hasOnboarded;
    private final Boolean healthspanLabsIntroEnabled;
    private final boolean isCalibrating;
    private final List<DesignSystemModel> items;
    private final WhoopAgeAmoeba previousWhoopAgeAmoeba;
    private final WhoopAgeAmoeba whoopAgeAmoeba;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UnlockedContentResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C15620a(24)), AbstractC30060g.m92087G(enumC23463i, new C15620a(25)), null, AbstractC30060g.m92087G(enumC23463i, new C15620a(26)), null, null};
    }

    public /* synthetic */ UnlockedContentResponse(int i13, DateSelectorModel dateSelectorModel, boolean z4, WhoopAgeAmoeba whoopAgeAmoeba, WhoopAgeAmoeba whoopAgeAmoeba2, List list, List list2, boolean z13, List list3, boolean z14, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, UnlockedContentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.datePicker = dateSelectorModel;
        this.isCalibrating = z4;
        this.whoopAgeAmoeba = whoopAgeAmoeba;
        this.previousWhoopAgeAmoeba = whoopAgeAmoeba2;
        this.items = list;
        this.featuredHighlights = list2;
        this.hasBeenSeenByUser = z13;
        this.amoebaOnboardingSteps = list3;
        this.hasOnboarded = z14;
        this.healthspanLabsIntroEnabled = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(FeaturedHighlight$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(AmoebaOnboardingStep$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnlockedContentResponse copy$default(UnlockedContentResponse unlockedContentResponse, DateSelectorModel dateSelectorModel, boolean z4, WhoopAgeAmoeba whoopAgeAmoeba, WhoopAgeAmoeba whoopAgeAmoeba2, List list, List list2, boolean z13, List list3, boolean z14, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateSelectorModel = unlockedContentResponse.datePicker;
        }
        if ((i13 & 2) != 0) {
            z4 = unlockedContentResponse.isCalibrating;
        }
        if ((i13 & 4) != 0) {
            whoopAgeAmoeba = unlockedContentResponse.whoopAgeAmoeba;
        }
        if ((i13 & 8) != 0) {
            whoopAgeAmoeba2 = unlockedContentResponse.previousWhoopAgeAmoeba;
        }
        if ((i13 & 16) != 0) {
            list = unlockedContentResponse.items;
        }
        if ((i13 & 32) != 0) {
            list2 = unlockedContentResponse.featuredHighlights;
        }
        if ((i13 & 64) != 0) {
            z13 = unlockedContentResponse.hasBeenSeenByUser;
        }
        if ((i13 & 128) != 0) {
            list3 = unlockedContentResponse.amoebaOnboardingSteps;
        }
        if ((i13 & 256) != 0) {
            z14 = unlockedContentResponse.hasOnboarded;
        }
        if ((i13 & 512) != 0) {
            bool = unlockedContentResponse.healthspanLabsIntroEnabled;
        }
        boolean z15 = z14;
        Boolean bool2 = bool;
        boolean z16 = z13;
        List list4 = list3;
        List list5 = list;
        List list6 = list2;
        return unlockedContentResponse.copy(dateSelectorModel, z4, whoopAgeAmoeba, whoopAgeAmoeba2, list5, list6, z16, list4, z15, bool2);
    }

    public static final /* synthetic */ void write$Self$healthspan_release(UnlockedContentResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, DateSelectorModel$$serializer.INSTANCE, self.datePicker);
        output.encodeBooleanElement(serialDesc, 1, self.isCalibrating);
        WhoopAgeAmoeba$$serializer whoopAgeAmoeba$$serializer = WhoopAgeAmoeba$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, whoopAgeAmoeba$$serializer, self.whoopAgeAmoeba);
        output.encodeNullableSerializableElement(serialDesc, 3, whoopAgeAmoeba$$serializer, self.previousWhoopAgeAmoeba);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.items);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.featuredHighlights);
        output.encodeBooleanElement(serialDesc, 6, self.hasBeenSeenByUser);
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.amoebaOnboardingSteps);
        output.encodeBooleanElement(serialDesc, 8, self.hasOnboarded);
        output.encodeNullableSerializableElement(serialDesc, 9, BooleanSerializer.INSTANCE, self.healthspanLabsIntroEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getHealthspanLabsIntroEnabled() {
        return this.healthspanLabsIntroEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCalibrating() {
        return this.isCalibrating;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WhoopAgeAmoeba getWhoopAgeAmoeba() {
        return this.whoopAgeAmoeba;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WhoopAgeAmoeba getPreviousWhoopAgeAmoeba() {
        return this.previousWhoopAgeAmoeba;
    }

    public final List<DesignSystemModel> component5() {
        return this.items;
    }

    public final List<FeaturedHighlight> component6() {
        return this.featuredHighlights;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHasBeenSeenByUser() {
        return this.hasBeenSeenByUser;
    }

    public final List<AmoebaOnboardingStep> component8() {
        return this.amoebaOnboardingSteps;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHasOnboarded() {
        return this.hasOnboarded;
    }

    public final UnlockedContentResponse copy(DateSelectorModel datePicker, boolean isCalibrating, WhoopAgeAmoeba whoopAgeAmoeba, WhoopAgeAmoeba previousWhoopAgeAmoeba, List<? extends DesignSystemModel> items, List<FeaturedHighlight> featuredHighlights, boolean hasBeenSeenByUser, List<AmoebaOnboardingStep> amoebaOnboardingSteps, boolean hasOnboarded, Boolean healthspanLabsIntroEnabled) {
        AbstractC22676k.m65750j(whoopAgeAmoeba, "whoopAgeAmoeba");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(featuredHighlights, "featuredHighlights");
        AbstractC22676k.m65750j(amoebaOnboardingSteps, "amoebaOnboardingSteps");
        return new UnlockedContentResponse(datePicker, isCalibrating, whoopAgeAmoeba, previousWhoopAgeAmoeba, items, featuredHighlights, hasBeenSeenByUser, amoebaOnboardingSteps, hasOnboarded, healthspanLabsIntroEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnlockedContentResponse)) {
            return false;
        }
        UnlockedContentResponse unlockedContentResponse = (UnlockedContentResponse) other;
        return AbstractC22676k.m65745e(this.datePicker, unlockedContentResponse.datePicker) && this.isCalibrating == unlockedContentResponse.isCalibrating && AbstractC22676k.m65745e(this.whoopAgeAmoeba, unlockedContentResponse.whoopAgeAmoeba) && AbstractC22676k.m65745e(this.previousWhoopAgeAmoeba, unlockedContentResponse.previousWhoopAgeAmoeba) && AbstractC22676k.m65745e(this.items, unlockedContentResponse.items) && AbstractC22676k.m65745e(this.featuredHighlights, unlockedContentResponse.featuredHighlights) && this.hasBeenSeenByUser == unlockedContentResponse.hasBeenSeenByUser && AbstractC22676k.m65745e(this.amoebaOnboardingSteps, unlockedContentResponse.amoebaOnboardingSteps) && this.hasOnboarded == unlockedContentResponse.hasOnboarded && AbstractC22676k.m65745e(this.healthspanLabsIntroEnabled, unlockedContentResponse.healthspanLabsIntroEnabled);
    }

    public final List<AmoebaOnboardingStep> getAmoebaOnboardingSteps() {
        return this.amoebaOnboardingSteps;
    }

    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    public final List<FeaturedHighlight> getFeaturedHighlights() {
        return this.featuredHighlights;
    }

    public final boolean getHasBeenSeenByUser() {
        return this.hasBeenSeenByUser;
    }

    public final boolean getHasOnboarded() {
        return this.hasOnboarded;
    }

    public final Boolean getHealthspanLabsIntroEnabled() {
        return this.healthspanLabsIntroEnabled;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final WhoopAgeAmoeba getPreviousWhoopAgeAmoeba() {
        return this.previousWhoopAgeAmoeba;
    }

    public final WhoopAgeAmoeba getWhoopAgeAmoeba() {
        return this.whoopAgeAmoeba;
    }

    public int hashCode() {
        DateSelectorModel dateSelectorModel = this.datePicker;
        int iHashCode = (this.whoopAgeAmoeba.hashCode() + AbstractC2875y.m8289b((dateSelectorModel == null ? 0 : dateSelectorModel.hashCode()) * 31, 31, this.isCalibrating)) * 31;
        WhoopAgeAmoeba whoopAgeAmoeba = this.previousWhoopAgeAmoeba;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode + (whoopAgeAmoeba == null ? 0 : whoopAgeAmoeba.hashCode())) * 31, 31, this.items), 31, this.featuredHighlights), 31, this.hasBeenSeenByUser), 31, this.amoebaOnboardingSteps), 31, this.hasOnboarded);
        Boolean bool = this.healthspanLabsIntroEnabled;
        return iM8289b + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isCalibrating() {
        return this.isCalibrating;
    }

    public String toString() {
        DateSelectorModel dateSelectorModel = this.datePicker;
        boolean z4 = this.isCalibrating;
        WhoopAgeAmoeba whoopAgeAmoeba = this.whoopAgeAmoeba;
        WhoopAgeAmoeba whoopAgeAmoeba2 = this.previousWhoopAgeAmoeba;
        List<DesignSystemModel> list = this.items;
        List<FeaturedHighlight> list2 = this.featuredHighlights;
        boolean z13 = this.hasBeenSeenByUser;
        List<AmoebaOnboardingStep> list3 = this.amoebaOnboardingSteps;
        boolean z14 = this.hasOnboarded;
        Boolean bool = this.healthspanLabsIntroEnabled;
        StringBuilder sb4 = new StringBuilder("UnlockedContentResponse(datePicker=");
        sb4.append(dateSelectorModel);
        sb4.append(", isCalibrating=");
        sb4.append(z4);
        sb4.append(", whoopAgeAmoeba=");
        sb4.append(whoopAgeAmoeba);
        sb4.append(", previousWhoopAgeAmoeba=");
        sb4.append(whoopAgeAmoeba2);
        sb4.append(", items=");
        AbstractC21702c.m61148s(sb4, list, ", featuredHighlights=", list2, ", hasBeenSeenByUser=");
        AbstractC25012a.m73391x(", amoebaOnboardingSteps=", ", hasOnboarded=", sb4, list3, z13);
        sb4.append(z14);
        sb4.append(", healthspanLabsIntroEnabled=");
        sb4.append(bool);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnlockedContentResponse(DateSelectorModel dateSelectorModel, boolean z4, WhoopAgeAmoeba whoopAgeAmoeba, WhoopAgeAmoeba whoopAgeAmoeba2, List<? extends DesignSystemModel> items, List<FeaturedHighlight> featuredHighlights, boolean z13, List<AmoebaOnboardingStep> amoebaOnboardingSteps, boolean z14, Boolean bool) {
        AbstractC22676k.m65750j(whoopAgeAmoeba, "whoopAgeAmoeba");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(featuredHighlights, "featuredHighlights");
        AbstractC22676k.m65750j(amoebaOnboardingSteps, "amoebaOnboardingSteps");
        this.datePicker = dateSelectorModel;
        this.isCalibrating = z4;
        this.whoopAgeAmoeba = whoopAgeAmoeba;
        this.previousWhoopAgeAmoeba = whoopAgeAmoeba2;
        this.items = items;
        this.featuredHighlights = featuredHighlights;
        this.hasBeenSeenByUser = z13;
        this.amoebaOnboardingSteps = amoebaOnboardingSteps;
        this.hasOnboarded = z14;
        this.healthspanLabsIntroEnabled = bool;
    }
}

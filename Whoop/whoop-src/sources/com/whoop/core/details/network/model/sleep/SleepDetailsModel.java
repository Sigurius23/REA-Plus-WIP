package com.whoop.core.details.network.model.sleep;

import com.whoop.core.details.network.model.MetaData;
import com.whoop.core.details.network.model.MetaData$$serializer;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.AdditionalInfoTextModel$$serializer;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.BarGraphContainerModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gp1.C16065a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 i2\u00020\u0001:\u0002jiB\u007f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u009f\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002HÆ\u0003¢\u0006\u0004\b2\u0010#J\u0012\u00103\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b7\u00108J \u0001\u00109\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020A2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bB\u0010CJ'\u0010L\u001a\u00020I2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0001¢\u0006\u0004\bJ\u0010KR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010O\u0012\u0004\bQ\u0010R\u001a\u0004\bP\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010S\u001a\u0004\bT\u0010'R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010U\u0012\u0004\bW\u0010R\u001a\u0004\bV\u0010)R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010X\u0012\u0004\bZ\u0010R\u001a\u0004\bY\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\b\\\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010]\u001a\u0004\b^\u0010/R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010_\u0012\u0004\ba\u0010R\u001a\u0004\b`\u00101R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bb\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010e\u001a\u0004\bf\u00106R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010g\u001a\u0004\bh\u00108¨\u0006k"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;", "", "", "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;", "sleepMetricBreakdowns", "Lcom/whoop/design/models/items/graph/GraphModel;", "graphResponse", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;", "vowStrings", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;", "sleepDetailsLabelsModel", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "heartRateZoneContainer", "Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;", "missingHrData", "Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;", "activityDisplayType", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;", "sleepDetailsEditComponent", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;", "sleepDetailsMetricModals", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "whoopCoachVow", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "additionalInfoText", "Lcom/whoop/core/details/network/model/MetaData;", "metadata", "<init>", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component3", "()Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;", "component4", "()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;", "component5", "()Lcom/whoop/design/models/items/BarGraphContainerModel;", "component6", "()Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;", "component7", "()Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;", "component8", "()Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;", "component9", "component10", "()Lcom/whoop/design/models/items/WhoopCoachVowModel;", "component11", "()Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "component12", "()Lcom/whoop/core/details/network/model/MetaData;", "copy", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/List;", "getSleepMetricBreakdowns", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraphResponse", "getGraphResponse$annotations", "()V", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;", "getVowStrings", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;", "getSleepDetailsLabelsModel", "getSleepDetailsLabelsModel$annotations", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "getHeartRateZoneContainer", "getHeartRateZoneContainer$annotations", "Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;", "getMissingHrData", "Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;", "getActivityDisplayType", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;", "getSleepDetailsEditComponent", "getSleepDetailsEditComponent$annotations", "getSleepDetailsMetricModals", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "getWhoopCoachVow", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "getAdditionalInfoText", "Lcom/whoop/core/details/network/model/MetaData;", "getMetadata", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepDetailsModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final ActivityDisplayType activityDisplayType;
    private final AdditionalInfoTextModel additionalInfoText;
    private final GraphModel graphResponse;
    private final BarGraphContainerModel heartRateZoneContainer;
    private final MetaData metadata;
    private final MissingHRDataModel missingHrData;
    private final SleepDetailsEditModel sleepDetailsEditComponent;
    private final SleepDetailsLabelsModel sleepDetailsLabelsModel;
    private final List<SleepDetailsMetricModalsModel> sleepDetailsMetricModals;
    private final List<SleepMetricBreakdownModel> sleepMetricBreakdowns;
    private final SleepDetailsVowsModel vowStrings;
    private final WhoopCoachVowModel whoopCoachVow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepDetailsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C16065a(22)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C16065a(23)), null, AbstractC30060g.m92087G(enumC23463i, new C16065a(24)), null, null, null};
    }

    public /* synthetic */ SleepDetailsModel(int i13, List list, GraphModel graphModel, SleepDetailsVowsModel sleepDetailsVowsModel, SleepDetailsLabelsModel sleepDetailsLabelsModel, BarGraphContainerModel barGraphContainerModel, MissingHRDataModel missingHRDataModel, ActivityDisplayType activityDisplayType, SleepDetailsEditModel sleepDetailsEditModel, List list2, WhoopCoachVowModel whoopCoachVowModel, AdditionalInfoTextModel additionalInfoTextModel, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, SleepDetailsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.sleepMetricBreakdowns = list;
        this.graphResponse = graphModel;
        this.vowStrings = sleepDetailsVowsModel;
        this.sleepDetailsLabelsModel = sleepDetailsLabelsModel;
        this.heartRateZoneContainer = barGraphContainerModel;
        this.missingHrData = missingHRDataModel;
        this.activityDisplayType = activityDisplayType;
        this.sleepDetailsEditComponent = sleepDetailsEditModel;
        this.sleepDetailsMetricModals = list2;
        this.whoopCoachVow = whoopCoachVowModel;
        this.additionalInfoText = additionalInfoTextModel;
        this.metadata = metaData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SleepMetricBreakdownModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return ActivityDisplayType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(SleepDetailsMetricModalsModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepDetailsModel copy$default(SleepDetailsModel sleepDetailsModel, List list, GraphModel graphModel, SleepDetailsVowsModel sleepDetailsVowsModel, SleepDetailsLabelsModel sleepDetailsLabelsModel, BarGraphContainerModel barGraphContainerModel, MissingHRDataModel missingHRDataModel, ActivityDisplayType activityDisplayType, SleepDetailsEditModel sleepDetailsEditModel, List list2, WhoopCoachVowModel whoopCoachVowModel, AdditionalInfoTextModel additionalInfoTextModel, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = sleepDetailsModel.sleepMetricBreakdowns;
        }
        if ((i13 & 2) != 0) {
            graphModel = sleepDetailsModel.graphResponse;
        }
        if ((i13 & 4) != 0) {
            sleepDetailsVowsModel = sleepDetailsModel.vowStrings;
        }
        if ((i13 & 8) != 0) {
            sleepDetailsLabelsModel = sleepDetailsModel.sleepDetailsLabelsModel;
        }
        if ((i13 & 16) != 0) {
            barGraphContainerModel = sleepDetailsModel.heartRateZoneContainer;
        }
        if ((i13 & 32) != 0) {
            missingHRDataModel = sleepDetailsModel.missingHrData;
        }
        if ((i13 & 64) != 0) {
            activityDisplayType = sleepDetailsModel.activityDisplayType;
        }
        if ((i13 & 128) != 0) {
            sleepDetailsEditModel = sleepDetailsModel.sleepDetailsEditComponent;
        }
        if ((i13 & 256) != 0) {
            list2 = sleepDetailsModel.sleepDetailsMetricModals;
        }
        if ((i13 & 512) != 0) {
            whoopCoachVowModel = sleepDetailsModel.whoopCoachVow;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            additionalInfoTextModel = sleepDetailsModel.additionalInfoText;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            metaData = sleepDetailsModel.metadata;
        }
        AdditionalInfoTextModel additionalInfoTextModel2 = additionalInfoTextModel;
        MetaData metaData2 = metaData;
        List list3 = list2;
        WhoopCoachVowModel whoopCoachVowModel2 = whoopCoachVowModel;
        ActivityDisplayType activityDisplayType2 = activityDisplayType;
        SleepDetailsEditModel sleepDetailsEditModel2 = sleepDetailsEditModel;
        BarGraphContainerModel barGraphContainerModel2 = barGraphContainerModel;
        MissingHRDataModel missingHRDataModel2 = missingHRDataModel;
        return sleepDetailsModel.copy(list, graphModel, sleepDetailsVowsModel, sleepDetailsLabelsModel, barGraphContainerModel2, missingHRDataModel2, activityDisplayType2, sleepDetailsEditModel2, list3, whoopCoachVowModel2, additionalInfoTextModel2, metaData2);
    }

    @InterfaceC37143h("graph")
    public static /* synthetic */ void getGraphResponse$annotations() {
    }

    @InterfaceC37143h("bar_graph_container")
    public static /* synthetic */ void getHeartRateZoneContainer$annotations() {
    }

    @InterfaceC37143h("sleep_details_edit_components")
    public static /* synthetic */ void getSleepDetailsEditComponent$annotations() {
    }

    @InterfaceC37143h("sleep_details_labels")
    public static /* synthetic */ void getSleepDetailsLabelsModel$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_details_release(SleepDetailsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.sleepMetricBreakdowns);
        output.encodeNullableSerializableElement(serialDesc, 1, GraphModel$$serializer.INSTANCE, self.graphResponse);
        output.encodeSerializableElement(serialDesc, 2, SleepDetailsVowsModel$$serializer.INSTANCE, self.vowStrings);
        output.encodeSerializableElement(serialDesc, 3, SleepDetailsLabelsModel$$serializer.INSTANCE, self.sleepDetailsLabelsModel);
        output.encodeNullableSerializableElement(serialDesc, 4, BarGraphContainerModel$$serializer.INSTANCE, self.heartRateZoneContainer);
        output.encodeNullableSerializableElement(serialDesc, 5, MissingHRDataModel$$serializer.INSTANCE, self.missingHrData);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.activityDisplayType);
        output.encodeSerializableElement(serialDesc, 7, SleepDetailsEditModel$$serializer.INSTANCE, self.sleepDetailsEditComponent);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.sleepDetailsMetricModals);
        output.encodeNullableSerializableElement(serialDesc, 9, WhoopCoachVowModel$$serializer.INSTANCE, self.whoopCoachVow);
        output.encodeNullableSerializableElement(serialDesc, 10, AdditionalInfoTextModel$$serializer.INSTANCE, self.additionalInfoText);
        output.encodeNullableSerializableElement(serialDesc, 11, MetaData$$serializer.INSTANCE, self.metadata);
    }

    public final List<SleepMetricBreakdownModel> component1() {
        return this.sleepMetricBreakdowns;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final AdditionalInfoTextModel getAdditionalInfoText() {
        return this.additionalInfoText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GraphModel getGraphResponse() {
        return this.graphResponse;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SleepDetailsVowsModel getVowStrings() {
        return this.vowStrings;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SleepDetailsLabelsModel getSleepDetailsLabelsModel() {
        return this.sleepDetailsLabelsModel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BarGraphContainerModel getHeartRateZoneContainer() {
        return this.heartRateZoneContainer;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MissingHRDataModel getMissingHrData() {
        return this.missingHrData;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ActivityDisplayType getActivityDisplayType() {
        return this.activityDisplayType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SleepDetailsEditModel getSleepDetailsEditComponent() {
        return this.sleepDetailsEditComponent;
    }

    public final List<SleepDetailsMetricModalsModel> component9() {
        return this.sleepDetailsMetricModals;
    }

    public final SleepDetailsModel copy(List<SleepMetricBreakdownModel> sleepMetricBreakdowns, GraphModel graphResponse, SleepDetailsVowsModel vowStrings, SleepDetailsLabelsModel sleepDetailsLabelsModel, BarGraphContainerModel heartRateZoneContainer, MissingHRDataModel missingHrData, ActivityDisplayType activityDisplayType, SleepDetailsEditModel sleepDetailsEditComponent, List<SleepDetailsMetricModalsModel> sleepDetailsMetricModals, WhoopCoachVowModel whoopCoachVow, AdditionalInfoTextModel additionalInfoText, MetaData metadata) {
        AbstractC22676k.m65750j(sleepMetricBreakdowns, "sleepMetricBreakdowns");
        AbstractC22676k.m65750j(vowStrings, "vowStrings");
        AbstractC22676k.m65750j(sleepDetailsLabelsModel, "sleepDetailsLabelsModel");
        AbstractC22676k.m65750j(activityDisplayType, "activityDisplayType");
        AbstractC22676k.m65750j(sleepDetailsEditComponent, "sleepDetailsEditComponent");
        AbstractC22676k.m65750j(sleepDetailsMetricModals, "sleepDetailsMetricModals");
        return new SleepDetailsModel(sleepMetricBreakdowns, graphResponse, vowStrings, sleepDetailsLabelsModel, heartRateZoneContainer, missingHrData, activityDisplayType, sleepDetailsEditComponent, sleepDetailsMetricModals, whoopCoachVow, additionalInfoText, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDetailsModel)) {
            return false;
        }
        SleepDetailsModel sleepDetailsModel = (SleepDetailsModel) other;
        return AbstractC22676k.m65745e(this.sleepMetricBreakdowns, sleepDetailsModel.sleepMetricBreakdowns) && AbstractC22676k.m65745e(this.graphResponse, sleepDetailsModel.graphResponse) && AbstractC22676k.m65745e(this.vowStrings, sleepDetailsModel.vowStrings) && AbstractC22676k.m65745e(this.sleepDetailsLabelsModel, sleepDetailsModel.sleepDetailsLabelsModel) && AbstractC22676k.m65745e(this.heartRateZoneContainer, sleepDetailsModel.heartRateZoneContainer) && AbstractC22676k.m65745e(this.missingHrData, sleepDetailsModel.missingHrData) && this.activityDisplayType == sleepDetailsModel.activityDisplayType && AbstractC22676k.m65745e(this.sleepDetailsEditComponent, sleepDetailsModel.sleepDetailsEditComponent) && AbstractC22676k.m65745e(this.sleepDetailsMetricModals, sleepDetailsModel.sleepDetailsMetricModals) && AbstractC22676k.m65745e(this.whoopCoachVow, sleepDetailsModel.whoopCoachVow) && AbstractC22676k.m65745e(this.additionalInfoText, sleepDetailsModel.additionalInfoText) && AbstractC22676k.m65745e(this.metadata, sleepDetailsModel.metadata);
    }

    public final ActivityDisplayType getActivityDisplayType() {
        return this.activityDisplayType;
    }

    public final AdditionalInfoTextModel getAdditionalInfoText() {
        return this.additionalInfoText;
    }

    public final GraphModel getGraphResponse() {
        return this.graphResponse;
    }

    public final BarGraphContainerModel getHeartRateZoneContainer() {
        return this.heartRateZoneContainer;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final MissingHRDataModel getMissingHrData() {
        return this.missingHrData;
    }

    public final SleepDetailsEditModel getSleepDetailsEditComponent() {
        return this.sleepDetailsEditComponent;
    }

    public final SleepDetailsLabelsModel getSleepDetailsLabelsModel() {
        return this.sleepDetailsLabelsModel;
    }

    public final List<SleepDetailsMetricModalsModel> getSleepDetailsMetricModals() {
        return this.sleepDetailsMetricModals;
    }

    public final List<SleepMetricBreakdownModel> getSleepMetricBreakdowns() {
        return this.sleepMetricBreakdowns;
    }

    public final SleepDetailsVowsModel getVowStrings() {
        return this.vowStrings;
    }

    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    public int hashCode() {
        int iHashCode = this.sleepMetricBreakdowns.hashCode() * 31;
        GraphModel graphModel = this.graphResponse;
        int iHashCode2 = (this.sleepDetailsLabelsModel.hashCode() + ((this.vowStrings.hashCode() + ((iHashCode + (graphModel == null ? 0 : graphModel.hashCode())) * 31)) * 31)) * 31;
        BarGraphContainerModel barGraphContainerModel = this.heartRateZoneContainer;
        int iHashCode3 = (iHashCode2 + (barGraphContainerModel == null ? 0 : barGraphContainerModel.hashCode())) * 31;
        MissingHRDataModel missingHRDataModel = this.missingHrData;
        int iM31983b = AbstractC11895b.m31983b((this.sleepDetailsEditComponent.hashCode() + ((this.activityDisplayType.hashCode() + ((iHashCode3 + (missingHRDataModel == null ? 0 : missingHRDataModel.hashCode())) * 31)) * 31)) * 31, 31, this.sleepDetailsMetricModals);
        WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVow;
        int iHashCode4 = (iM31983b + (whoopCoachVowModel == null ? 0 : whoopCoachVowModel.hashCode())) * 31;
        AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
        int iHashCode5 = (iHashCode4 + (additionalInfoTextModel == null ? 0 : additionalInfoTextModel.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode5 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        return "SleepDetailsModel(sleepMetricBreakdowns=" + this.sleepMetricBreakdowns + ", graphResponse=" + this.graphResponse + ", vowStrings=" + this.vowStrings + ", sleepDetailsLabelsModel=" + this.sleepDetailsLabelsModel + ", heartRateZoneContainer=" + this.heartRateZoneContainer + ", missingHrData=" + this.missingHrData + ", activityDisplayType=" + this.activityDisplayType + ", sleepDetailsEditComponent=" + this.sleepDetailsEditComponent + ", sleepDetailsMetricModals=" + this.sleepDetailsMetricModals + ", whoopCoachVow=" + this.whoopCoachVow + ", additionalInfoText=" + this.additionalInfoText + ", metadata=" + this.metadata + ")";
    }

    public SleepDetailsModel(List<SleepMetricBreakdownModel> sleepMetricBreakdowns, GraphModel graphModel, SleepDetailsVowsModel vowStrings, SleepDetailsLabelsModel sleepDetailsLabelsModel, BarGraphContainerModel barGraphContainerModel, MissingHRDataModel missingHRDataModel, ActivityDisplayType activityDisplayType, SleepDetailsEditModel sleepDetailsEditComponent, List<SleepDetailsMetricModalsModel> sleepDetailsMetricModals, WhoopCoachVowModel whoopCoachVowModel, AdditionalInfoTextModel additionalInfoTextModel, MetaData metaData) {
        AbstractC22676k.m65750j(sleepMetricBreakdowns, "sleepMetricBreakdowns");
        AbstractC22676k.m65750j(vowStrings, "vowStrings");
        AbstractC22676k.m65750j(sleepDetailsLabelsModel, "sleepDetailsLabelsModel");
        AbstractC22676k.m65750j(activityDisplayType, "activityDisplayType");
        AbstractC22676k.m65750j(sleepDetailsEditComponent, "sleepDetailsEditComponent");
        AbstractC22676k.m65750j(sleepDetailsMetricModals, "sleepDetailsMetricModals");
        this.sleepMetricBreakdowns = sleepMetricBreakdowns;
        this.graphResponse = graphModel;
        this.vowStrings = vowStrings;
        this.sleepDetailsLabelsModel = sleepDetailsLabelsModel;
        this.heartRateZoneContainer = barGraphContainerModel;
        this.missingHrData = missingHRDataModel;
        this.activityDisplayType = activityDisplayType;
        this.sleepDetailsEditComponent = sleepDetailsEditComponent;
        this.sleepDetailsMetricModals = sleepDetailsMetricModals;
        this.whoopCoachVow = whoopCoachVowModel;
        this.additionalInfoText = additionalInfoTextModel;
        this.metadata = metaData;
    }
}

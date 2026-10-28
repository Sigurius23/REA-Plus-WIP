package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t91.C33662a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bs\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/Jr\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b2\u0010+J\u0010\u00103\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010+R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010/¨\u0006I"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;", "", "Lcom/whoop/advancedlabs/domain/models/MetaData;", "metadata", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;", "sections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analytics", "", "initiallySelectedSegmentId", "", "Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;", "bottomStickyItems", "Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;", "attendedAppointmentDialog", "<init>", "(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/MetaData;", "component2", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "component5", "()Ljava/lang/String;", "component6", "()Ljava/util/Map;", "component7", "()Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;", "copy", "(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/MetaData;", "getMetadata", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Ljava/util/List;", "getSections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "getAnalytics", "Ljava/lang/String;", "getInitiallySelectedSegmentId", "Ljava/util/Map;", "getBottomStickyItems", "Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;", "getAttendedAppointmentDialog", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AdvancedLabsResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final AdvancedLabsAnalyticsDomainModel analytics;
    private final AttendedAppointmentDialogModel attendedAppointmentDialog;
    private final Map<String, AdvanceLabsStickyModel> bottomStickyItems;
    private final String initiallySelectedSegmentId;
    private final MetaData metadata;
    private final NavigationBarModel navigationBar;
    private final List<AdvancedLabsSectionModel> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AdvancedLabsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C33662a(12)), null, null, AbstractC30060g.m92087G(enumC23463i, new C33662a(13)), null};
    }

    public /* synthetic */ AdvancedLabsResponse(int i13, MetaData metaData, NavigationBarModel navigationBarModel, List list, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str, Map map, AttendedAppointmentDialogModel attendedAppointmentDialogModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (126 != (i13 & 126)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 126, AdvancedLabsResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
        this.navigationBar = navigationBarModel;
        this.sections = list;
        this.analytics = advancedLabsAnalyticsDomainModel;
        this.initiallySelectedSegmentId = str;
        this.bottomStickyItems = map;
        this.attendedAppointmentDialog = attendedAppointmentDialogModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AdvancedLabsSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, AdvanceLabsStickyModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedLabsResponse copy$default(AdvancedLabsResponse advancedLabsResponse, MetaData metaData, NavigationBarModel navigationBarModel, List list, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str, Map map, AttendedAppointmentDialogModel attendedAppointmentDialogModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            metaData = advancedLabsResponse.metadata;
        }
        if ((i13 & 2) != 0) {
            navigationBarModel = advancedLabsResponse.navigationBar;
        }
        if ((i13 & 4) != 0) {
            list = advancedLabsResponse.sections;
        }
        if ((i13 & 8) != 0) {
            advancedLabsAnalyticsDomainModel = advancedLabsResponse.analytics;
        }
        if ((i13 & 16) != 0) {
            str = advancedLabsResponse.initiallySelectedSegmentId;
        }
        if ((i13 & 32) != 0) {
            map = advancedLabsResponse.bottomStickyItems;
        }
        if ((i13 & 64) != 0) {
            attendedAppointmentDialogModel = advancedLabsResponse.attendedAppointmentDialog;
        }
        Map map2 = map;
        AttendedAppointmentDialogModel attendedAppointmentDialogModel2 = attendedAppointmentDialogModel;
        String str2 = str;
        List list2 = list;
        return advancedLabsResponse.copy(metaData, navigationBarModel, list2, advancedLabsAnalyticsDomainModel, str2, map2, attendedAppointmentDialogModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(AdvancedLabsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.metadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, MetaData$$serializer.INSTANCE, self.metadata);
        }
        output.encodeSerializableElement(serialDesc, 1, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 3, AdvancedLabsAnalyticsDomainModel$$serializer.INSTANCE, self.analytics);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.initiallySelectedSegmentId);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.bottomStickyItems);
        output.encodeNullableSerializableElement(serialDesc, 6, AttendedAppointmentDialogModel$$serializer.INSTANCE, self.attendedAppointmentDialog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<AdvancedLabsSectionModel> component3() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final Map<String, AdvanceLabsStickyModel> component6() {
        return this.bottomStickyItems;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AttendedAppointmentDialogModel getAttendedAppointmentDialog() {
        return this.attendedAppointmentDialog;
    }

    public final AdvancedLabsResponse copy(MetaData metadata, NavigationBarModel navigationBar, List<AdvancedLabsSectionModel> sections, AdvancedLabsAnalyticsDomainModel analytics, String initiallySelectedSegmentId, Map<String, AdvanceLabsStickyModel> bottomStickyItems, AttendedAppointmentDialogModel attendedAppointmentDialog) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        return new AdvancedLabsResponse(metadata, navigationBar, sections, analytics, initiallySelectedSegmentId, bottomStickyItems, attendedAppointmentDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedLabsResponse)) {
            return false;
        }
        AdvancedLabsResponse advancedLabsResponse = (AdvancedLabsResponse) other;
        return AbstractC22676k.m65745e(this.metadata, advancedLabsResponse.metadata) && AbstractC22676k.m65745e(this.navigationBar, advancedLabsResponse.navigationBar) && AbstractC22676k.m65745e(this.sections, advancedLabsResponse.sections) && AbstractC22676k.m65745e(this.analytics, advancedLabsResponse.analytics) && AbstractC22676k.m65745e(this.initiallySelectedSegmentId, advancedLabsResponse.initiallySelectedSegmentId) && AbstractC22676k.m65745e(this.bottomStickyItems, advancedLabsResponse.bottomStickyItems) && AbstractC22676k.m65745e(this.attendedAppointmentDialog, advancedLabsResponse.attendedAppointmentDialog);
    }

    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    public final AttendedAppointmentDialogModel getAttendedAppointmentDialog() {
        return this.attendedAppointmentDialog;
    }

    public final Map<String, AdvanceLabsStickyModel> getBottomStickyItems() {
        return this.bottomStickyItems;
    }

    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<AdvancedLabsSectionModel> getSections() {
        return this.sections;
    }

    public int hashCode() {
        MetaData metaData = this.metadata;
        int iM31983b = AbstractC11895b.m31983b((this.navigationBar.hashCode() + ((metaData == null ? 0 : metaData.hashCode()) * 31)) * 31, 31, this.sections);
        AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analytics;
        int iHashCode = (iM31983b + (advancedLabsAnalyticsDomainModel == null ? 0 : advancedLabsAnalyticsDomainModel.hashCode())) * 31;
        String str = this.initiallySelectedSegmentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, AdvanceLabsStickyModel> map = this.bottomStickyItems;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        AttendedAppointmentDialogModel attendedAppointmentDialogModel = this.attendedAppointmentDialog;
        return iHashCode3 + (attendedAppointmentDialogModel != null ? attendedAppointmentDialogModel.hashCode() : 0);
    }

    public String toString() {
        MetaData metaData = this.metadata;
        NavigationBarModel navigationBarModel = this.navigationBar;
        List<AdvancedLabsSectionModel> list = this.sections;
        AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analytics;
        String str = this.initiallySelectedSegmentId;
        Map<String, AdvanceLabsStickyModel> map = this.bottomStickyItems;
        AttendedAppointmentDialogModel attendedAppointmentDialogModel = this.attendedAppointmentDialog;
        StringBuilder sb4 = new StringBuilder("AdvancedLabsResponse(metadata=");
        sb4.append(metaData);
        sb4.append(", navigationBar=");
        sb4.append(navigationBarModel);
        sb4.append(", sections=");
        sb4.append(list);
        sb4.append(", analytics=");
        sb4.append(advancedLabsAnalyticsDomainModel);
        sb4.append(", initiallySelectedSegmentId=");
        AbstractC36095b.m114695w(sb4, str, ", bottomStickyItems=", map, ", attendedAppointmentDialog=");
        sb4.append(attendedAppointmentDialogModel);
        sb4.append(")");
        return sb4.toString();
    }

    public AdvancedLabsResponse(MetaData metaData, NavigationBarModel navigationBar, List<AdvancedLabsSectionModel> sections, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str, Map<String, AdvanceLabsStickyModel> map, AttendedAppointmentDialogModel attendedAppointmentDialogModel) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        this.metadata = metaData;
        this.navigationBar = navigationBar;
        this.sections = sections;
        this.analytics = advancedLabsAnalyticsDomainModel;
        this.initiallySelectedSegmentId = str;
        this.bottomStickyItems = map;
        this.attendedAppointmentDialog = attendedAppointmentDialogModel;
    }

    public /* synthetic */ AdvancedLabsResponse(MetaData metaData, NavigationBarModel navigationBarModel, List list, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str, Map map, AttendedAppointmentDialogModel attendedAppointmentDialogModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : metaData, navigationBarModel, list, advancedLabsAnalyticsDomainModel, str, map, attendedAppointmentDialogModel);
    }
}

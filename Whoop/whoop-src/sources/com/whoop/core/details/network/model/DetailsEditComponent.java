package com.whoop.core.details.network.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0088\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b?\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b@\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bE\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bF\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010&R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bI\u0010 R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bJ\u0010\u001a¨\u0006M"}, m65681d2 = {"Lcom/whoop/core/details/network/model/DetailsEditComponent;", "", "", "activityTypeInternalName", "", "Lcom/whoop/core/details/network/model/StrapLocation;", "allowedStrapLocations", "callToActionDisplay", "editActivityTitleDisplay", "Lcom/whoop/core/details/network/model/TimeSelectorSection;", "endTimeSelector", "location", "locationDividerTitleDisplay", "locationPromptDisplay", "Lcom/whoop/core/details/network/model/SingleScoreType;", "singleScoreType", "startTimeSelector", "timeDividerTitleDisplay", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Lcom/whoop/core/details/network/model/TimeSelectorSection;", "component6", "()Lcom/whoop/core/details/network/model/StrapLocation;", "component7", "component8", "component9", "()Lcom/whoop/core/details/network/model/SingleScoreType;", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;)Lcom/whoop/core/details/network/model/DetailsEditComponent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/DetailsEditComponent;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getActivityTypeInternalName", "Ljava/util/List;", "getAllowedStrapLocations", "getCallToActionDisplay", "getEditActivityTitleDisplay", "Lcom/whoop/core/details/network/model/TimeSelectorSection;", "getEndTimeSelector", "Lcom/whoop/core/details/network/model/StrapLocation;", "getLocation", "getLocationDividerTitleDisplay", "getLocationPromptDisplay", "Lcom/whoop/core/details/network/model/SingleScoreType;", "getSingleScoreType", "getStartTimeSelector", "getTimeDividerTitleDisplay", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DetailsEditComponent {
    private static final InterfaceC23462h[] $childSerializers;
    private final String activityTypeInternalName;
    private final List<StrapLocation> allowedStrapLocations;
    private final String callToActionDisplay;
    private final String editActivityTitleDisplay;
    private final TimeSelectorSection endTimeSelector;
    private final StrapLocation location;
    private final String locationDividerTitleDisplay;
    private final String locationPromptDisplay;
    private final SingleScoreType singleScoreType;
    private final TimeSelectorSection startTimeSelector;
    private final String timeDividerTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/DetailsEditComponent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/DetailsEditComponent;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DetailsEditComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C6451a(6)), null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C6451a(7)), null, null};
    }

    public /* synthetic */ DetailsEditComponent(int i13, String str, List list, String str2, String str3, TimeSelectorSection timeSelectorSection, StrapLocation strapLocation, String str4, String str5, SingleScoreType singleScoreType, TimeSelectorSection timeSelectorSection2, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (2045 != (i13 & 2045)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2045, DetailsEditComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.activityTypeInternalName = str;
        if ((i13 & 2) == 0) {
            this.allowedStrapLocations = C25271y.f99162w;
        } else {
            this.allowedStrapLocations = list;
        }
        this.callToActionDisplay = str2;
        this.editActivityTitleDisplay = str3;
        this.endTimeSelector = timeSelectorSection;
        this.location = strapLocation;
        this.locationDividerTitleDisplay = str4;
        this.locationPromptDisplay = str5;
        this.singleScoreType = singleScoreType;
        this.startTimeSelector = timeSelectorSection2;
        this.timeDividerTitleDisplay = str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StrapLocation$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return SingleScoreType.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailsEditComponent copy$default(DetailsEditComponent detailsEditComponent, String str, List list, String str2, String str3, TimeSelectorSection timeSelectorSection, StrapLocation strapLocation, String str4, String str5, SingleScoreType singleScoreType, TimeSelectorSection timeSelectorSection2, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = detailsEditComponent.activityTypeInternalName;
        }
        if ((i13 & 2) != 0) {
            list = detailsEditComponent.allowedStrapLocations;
        }
        if ((i13 & 4) != 0) {
            str2 = detailsEditComponent.callToActionDisplay;
        }
        if ((i13 & 8) != 0) {
            str3 = detailsEditComponent.editActivityTitleDisplay;
        }
        if ((i13 & 16) != 0) {
            timeSelectorSection = detailsEditComponent.endTimeSelector;
        }
        if ((i13 & 32) != 0) {
            strapLocation = detailsEditComponent.location;
        }
        if ((i13 & 64) != 0) {
            str4 = detailsEditComponent.locationDividerTitleDisplay;
        }
        if ((i13 & 128) != 0) {
            str5 = detailsEditComponent.locationPromptDisplay;
        }
        if ((i13 & 256) != 0) {
            singleScoreType = detailsEditComponent.singleScoreType;
        }
        if ((i13 & 512) != 0) {
            timeSelectorSection2 = detailsEditComponent.startTimeSelector;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str6 = detailsEditComponent.timeDividerTitleDisplay;
        }
        TimeSelectorSection timeSelectorSection3 = timeSelectorSection2;
        String str7 = str6;
        String str8 = str5;
        SingleScoreType singleScoreType2 = singleScoreType;
        StrapLocation strapLocation2 = strapLocation;
        String str9 = str4;
        TimeSelectorSection timeSelectorSection4 = timeSelectorSection;
        String str10 = str2;
        return detailsEditComponent.copy(str, list, str10, str3, timeSelectorSection4, strapLocation2, str9, str8, singleScoreType2, timeSelectorSection3, str7);
    }

    public static final /* synthetic */ void write$Self$core_details_release(DetailsEditComponent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.activityTypeInternalName);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.allowedStrapLocations, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.allowedStrapLocations);
        }
        output.encodeStringElement(serialDesc, 2, self.callToActionDisplay);
        output.encodeStringElement(serialDesc, 3, self.editActivityTitleDisplay);
        TimeSelectorSection$$serializer timeSelectorSection$$serializer = TimeSelectorSection$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 4, timeSelectorSection$$serializer, self.endTimeSelector);
        output.encodeNullableSerializableElement(serialDesc, 5, StrapLocation$$serializer.INSTANCE, self.location);
        output.encodeStringElement(serialDesc, 6, self.locationDividerTitleDisplay);
        output.encodeStringElement(serialDesc, 7, self.locationPromptDisplay);
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.singleScoreType);
        output.encodeSerializableElement(serialDesc, 9, timeSelectorSection$$serializer, self.startTimeSelector);
        output.encodeStringElement(serialDesc, 10, self.timeDividerTitleDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityTypeInternalName() {
        return this.activityTypeInternalName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TimeSelectorSection getStartTimeSelector() {
        return this.startTimeSelector;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTimeDividerTitleDisplay() {
        return this.timeDividerTitleDisplay;
    }

    public final List<StrapLocation> component2() {
        return this.allowedStrapLocations;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCallToActionDisplay() {
        return this.callToActionDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEditActivityTitleDisplay() {
        return this.editActivityTitleDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TimeSelectorSection getEndTimeSelector() {
        return this.endTimeSelector;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StrapLocation getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocationDividerTitleDisplay() {
        return this.locationDividerTitleDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLocationPromptDisplay() {
        return this.locationPromptDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SingleScoreType getSingleScoreType() {
        return this.singleScoreType;
    }

    public final DetailsEditComponent copy(String activityTypeInternalName, List<StrapLocation> allowedStrapLocations, String callToActionDisplay, String editActivityTitleDisplay, TimeSelectorSection endTimeSelector, StrapLocation location, String locationDividerTitleDisplay, String locationPromptDisplay, SingleScoreType singleScoreType, TimeSelectorSection startTimeSelector, String timeDividerTitleDisplay) {
        AbstractC22676k.m65750j(activityTypeInternalName, "activityTypeInternalName");
        AbstractC22676k.m65750j(allowedStrapLocations, "allowedStrapLocations");
        AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
        AbstractC22676k.m65750j(editActivityTitleDisplay, "editActivityTitleDisplay");
        AbstractC22676k.m65750j(endTimeSelector, "endTimeSelector");
        AbstractC22676k.m65750j(locationDividerTitleDisplay, "locationDividerTitleDisplay");
        AbstractC22676k.m65750j(locationPromptDisplay, "locationPromptDisplay");
        AbstractC22676k.m65750j(startTimeSelector, "startTimeSelector");
        AbstractC22676k.m65750j(timeDividerTitleDisplay, "timeDividerTitleDisplay");
        return new DetailsEditComponent(activityTypeInternalName, allowedStrapLocations, callToActionDisplay, editActivityTitleDisplay, endTimeSelector, location, locationDividerTitleDisplay, locationPromptDisplay, singleScoreType, startTimeSelector, timeDividerTitleDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsEditComponent)) {
            return false;
        }
        DetailsEditComponent detailsEditComponent = (DetailsEditComponent) other;
        return AbstractC22676k.m65745e(this.activityTypeInternalName, detailsEditComponent.activityTypeInternalName) && AbstractC22676k.m65745e(this.allowedStrapLocations, detailsEditComponent.allowedStrapLocations) && AbstractC22676k.m65745e(this.callToActionDisplay, detailsEditComponent.callToActionDisplay) && AbstractC22676k.m65745e(this.editActivityTitleDisplay, detailsEditComponent.editActivityTitleDisplay) && AbstractC22676k.m65745e(this.endTimeSelector, detailsEditComponent.endTimeSelector) && AbstractC22676k.m65745e(this.location, detailsEditComponent.location) && AbstractC22676k.m65745e(this.locationDividerTitleDisplay, detailsEditComponent.locationDividerTitleDisplay) && AbstractC22676k.m65745e(this.locationPromptDisplay, detailsEditComponent.locationPromptDisplay) && this.singleScoreType == detailsEditComponent.singleScoreType && AbstractC22676k.m65745e(this.startTimeSelector, detailsEditComponent.startTimeSelector) && AbstractC22676k.m65745e(this.timeDividerTitleDisplay, detailsEditComponent.timeDividerTitleDisplay);
    }

    public final String getActivityTypeInternalName() {
        return this.activityTypeInternalName;
    }

    public final List<StrapLocation> getAllowedStrapLocations() {
        return this.allowedStrapLocations;
    }

    public final String getCallToActionDisplay() {
        return this.callToActionDisplay;
    }

    public final String getEditActivityTitleDisplay() {
        return this.editActivityTitleDisplay;
    }

    public final TimeSelectorSection getEndTimeSelector() {
        return this.endTimeSelector;
    }

    public final StrapLocation getLocation() {
        return this.location;
    }

    public final String getLocationDividerTitleDisplay() {
        return this.locationDividerTitleDisplay;
    }

    public final String getLocationPromptDisplay() {
        return this.locationPromptDisplay;
    }

    public final SingleScoreType getSingleScoreType() {
        return this.singleScoreType;
    }

    public final TimeSelectorSection getStartTimeSelector() {
        return this.startTimeSelector;
    }

    public final String getTimeDividerTitleDisplay() {
        return this.timeDividerTitleDisplay;
    }

    public int hashCode() {
        int iHashCode = (this.endTimeSelector.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.activityTypeInternalName.hashCode() * 31, 31, this.allowedStrapLocations), 31, this.callToActionDisplay), 31, this.editActivityTitleDisplay)) * 31;
        StrapLocation strapLocation = this.location;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (strapLocation == null ? 0 : strapLocation.hashCode())) * 31, 31, this.locationDividerTitleDisplay), 31, this.locationPromptDisplay);
        SingleScoreType singleScoreType = this.singleScoreType;
        return this.timeDividerTitleDisplay.hashCode() + ((this.startTimeSelector.hashCode() + ((iM30450d + (singleScoreType != null ? singleScoreType.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        String str = this.activityTypeInternalName;
        List<StrapLocation> list = this.allowedStrapLocations;
        String str2 = this.callToActionDisplay;
        String str3 = this.editActivityTitleDisplay;
        TimeSelectorSection timeSelectorSection = this.endTimeSelector;
        StrapLocation strapLocation = this.location;
        String str4 = this.locationDividerTitleDisplay;
        String str5 = this.locationPromptDisplay;
        SingleScoreType singleScoreType = this.singleScoreType;
        TimeSelectorSection timeSelectorSection2 = this.startTimeSelector;
        String str6 = this.timeDividerTitleDisplay;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("DetailsEditComponent(activityTypeInternalName=", str, ", allowedStrapLocations=", ", callToActionDisplay=", list);
        AbstractC11266d.m30444B(sbM94766o, str2, ", editActivityTitleDisplay=", str3, ", endTimeSelector=");
        sbM94766o.append(timeSelectorSection);
        sbM94766o.append(", location=");
        sbM94766o.append(strapLocation);
        sbM94766o.append(", locationDividerTitleDisplay=");
        AbstractC11266d.m30444B(sbM94766o, str4, ", locationPromptDisplay=", str5, ", singleScoreType=");
        sbM94766o.append(singleScoreType);
        sbM94766o.append(", startTimeSelector=");
        sbM94766o.append(timeSelectorSection2);
        sbM94766o.append(", timeDividerTitleDisplay=");
        return AbstractC25012a.m73376i(str6, ")", sbM94766o);
    }

    public DetailsEditComponent(String activityTypeInternalName, List<StrapLocation> allowedStrapLocations, String callToActionDisplay, String editActivityTitleDisplay, TimeSelectorSection endTimeSelector, StrapLocation strapLocation, String locationDividerTitleDisplay, String locationPromptDisplay, SingleScoreType singleScoreType, TimeSelectorSection startTimeSelector, String timeDividerTitleDisplay) {
        AbstractC22676k.m65750j(activityTypeInternalName, "activityTypeInternalName");
        AbstractC22676k.m65750j(allowedStrapLocations, "allowedStrapLocations");
        AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
        AbstractC22676k.m65750j(editActivityTitleDisplay, "editActivityTitleDisplay");
        AbstractC22676k.m65750j(endTimeSelector, "endTimeSelector");
        AbstractC22676k.m65750j(locationDividerTitleDisplay, "locationDividerTitleDisplay");
        AbstractC22676k.m65750j(locationPromptDisplay, "locationPromptDisplay");
        AbstractC22676k.m65750j(startTimeSelector, "startTimeSelector");
        AbstractC22676k.m65750j(timeDividerTitleDisplay, "timeDividerTitleDisplay");
        this.activityTypeInternalName = activityTypeInternalName;
        this.allowedStrapLocations = allowedStrapLocations;
        this.callToActionDisplay = callToActionDisplay;
        this.editActivityTitleDisplay = editActivityTitleDisplay;
        this.endTimeSelector = endTimeSelector;
        this.location = strapLocation;
        this.locationDividerTitleDisplay = locationDividerTitleDisplay;
        this.locationPromptDisplay = locationPromptDisplay;
        this.singleScoreType = singleScoreType;
        this.startTimeSelector = startTimeSelector;
        this.timeDividerTitleDisplay = timeDividerTitleDisplay;
    }

    public /* synthetic */ DetailsEditComponent(String str, List list, String str2, String str3, TimeSelectorSection timeSelectorSection, StrapLocation strapLocation, String str4, String str5, SingleScoreType singleScoreType, TimeSelectorSection timeSelectorSection2, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, str2, str3, timeSelectorSection, strapLocation, str4, str5, singleScoreType, timeSelectorSection2, str6);
    }
}

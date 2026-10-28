package com.whoop.core.details.network.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFB\u0085\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u009f\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ¢\u0001\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b<\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b=\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b>\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b?\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b@\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bA\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\bB\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bC\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bD\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bE\u0010\u001b¨\u0006H"}, m65681d2 = {"Lcom/whoop/core/details/network/model/ItemModel;", "", "", "", "achievementIcons", "endIcon", "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;", "heartRateTimeline", "repsDisplay", "volumeDisplay", "volumeTitleDisplay", "subtitleDisplay", "titleDisplay", "tonnageDisplay", "intensityDisplay", "imageUrl", "exerciseId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/ItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/ItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/List;", "getAchievementIcons", "Ljava/lang/String;", "getEndIcon", "getHeartRateTimeline", "getRepsDisplay", "getVolumeDisplay", "getVolumeTitleDisplay", "getSubtitleDisplay", "getTitleDisplay", "getTonnageDisplay", "getIntensityDisplay", "getImageUrl", "getExerciseId", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ItemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<String> achievementIcons;
    private final String endIcon;
    private final String exerciseId;
    private final List<HeartRateTimelineModel> heartRateTimeline;
    private final String imageUrl;
    private final String intensityDisplay;
    private final String repsDisplay;
    private final String subtitleDisplay;
    private final String titleDisplay;
    private final String tonnageDisplay;
    private final String volumeDisplay;
    private final String volumeTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/ItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/ItemModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C6451a(13)), null, AbstractC30060g.m92087G(enumC23463i, new C6451a(14)), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ ItemModel(int i13, List list, String str, List list2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (4092 != (i13 & 4092)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4092, ItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.achievementIcons = (i13 & 1) == 0 ? C25271y.f99162w : list;
        if ((i13 & 2) == 0) {
            this.endIcon = null;
        } else {
            this.endIcon = str;
        }
        this.heartRateTimeline = list2;
        this.repsDisplay = str2;
        this.volumeDisplay = str3;
        this.volumeTitleDisplay = str4;
        this.subtitleDisplay = str5;
        this.titleDisplay = str6;
        this.tonnageDisplay = str7;
        this.intensityDisplay = str8;
        this.imageUrl = str9;
        this.exerciseId = str10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(HeartRateTimelineModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemModel copy$default(ItemModel itemModel, List list, String str, List list2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = itemModel.achievementIcons;
        }
        if ((i13 & 2) != 0) {
            str = itemModel.endIcon;
        }
        if ((i13 & 4) != 0) {
            list2 = itemModel.heartRateTimeline;
        }
        if ((i13 & 8) != 0) {
            str2 = itemModel.repsDisplay;
        }
        if ((i13 & 16) != 0) {
            str3 = itemModel.volumeDisplay;
        }
        if ((i13 & 32) != 0) {
            str4 = itemModel.volumeTitleDisplay;
        }
        if ((i13 & 64) != 0) {
            str5 = itemModel.subtitleDisplay;
        }
        if ((i13 & 128) != 0) {
            str6 = itemModel.titleDisplay;
        }
        if ((i13 & 256) != 0) {
            str7 = itemModel.tonnageDisplay;
        }
        if ((i13 & 512) != 0) {
            str8 = itemModel.intensityDisplay;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str9 = itemModel.imageUrl;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str10 = itemModel.exerciseId;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str3;
        String str18 = str4;
        return itemModel.copy(list, str, list2, str2, str17, str18, str15, str16, str13, str14, str11, str12);
    }

    public static final /* synthetic */ void write$Self$core_details_release(ItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.achievementIcons, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.achievementIcons);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.endIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.endIcon);
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.heartRateTimeline);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.repsDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.volumeDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.volumeTitleDisplay);
        output.encodeStringElement(serialDesc, 6, self.subtitleDisplay);
        output.encodeStringElement(serialDesc, 7, self.titleDisplay);
        output.encodeStringElement(serialDesc, 8, self.tonnageDisplay);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.intensityDisplay);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.exerciseId);
    }

    public final List<String> component1() {
        return this.achievementIcons;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIntensityDisplay() {
        return this.intensityDisplay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    public final List<HeartRateTimelineModel> component3() {
        return this.heartRateTimeline;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRepsDisplay() {
        return this.repsDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVolumeDisplay() {
        return this.volumeDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVolumeTitleDisplay() {
        return this.volumeTitleDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTonnageDisplay() {
        return this.tonnageDisplay;
    }

    public final ItemModel copy(List<String> achievementIcons, String endIcon, List<HeartRateTimelineModel> heartRateTimeline, String repsDisplay, String volumeDisplay, String volumeTitleDisplay, String subtitleDisplay, String titleDisplay, String tonnageDisplay, String intensityDisplay, String imageUrl, String exerciseId) {
        AbstractC22676k.m65750j(achievementIcons, "achievementIcons");
        AbstractC22676k.m65750j(heartRateTimeline, "heartRateTimeline");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tonnageDisplay, "tonnageDisplay");
        return new ItemModel(achievementIcons, endIcon, heartRateTimeline, repsDisplay, volumeDisplay, volumeTitleDisplay, subtitleDisplay, titleDisplay, tonnageDisplay, intensityDisplay, imageUrl, exerciseId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemModel)) {
            return false;
        }
        ItemModel itemModel = (ItemModel) other;
        return AbstractC22676k.m65745e(this.achievementIcons, itemModel.achievementIcons) && AbstractC22676k.m65745e(this.endIcon, itemModel.endIcon) && AbstractC22676k.m65745e(this.heartRateTimeline, itemModel.heartRateTimeline) && AbstractC22676k.m65745e(this.repsDisplay, itemModel.repsDisplay) && AbstractC22676k.m65745e(this.volumeDisplay, itemModel.volumeDisplay) && AbstractC22676k.m65745e(this.volumeTitleDisplay, itemModel.volumeTitleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, itemModel.subtitleDisplay) && AbstractC22676k.m65745e(this.titleDisplay, itemModel.titleDisplay) && AbstractC22676k.m65745e(this.tonnageDisplay, itemModel.tonnageDisplay) && AbstractC22676k.m65745e(this.intensityDisplay, itemModel.intensityDisplay) && AbstractC22676k.m65745e(this.imageUrl, itemModel.imageUrl) && AbstractC22676k.m65745e(this.exerciseId, itemModel.exerciseId);
    }

    public final List<String> getAchievementIcons() {
        return this.achievementIcons;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final List<HeartRateTimelineModel> getHeartRateTimeline() {
        return this.heartRateTimeline;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getIntensityDisplay() {
        return this.intensityDisplay;
    }

    public final String getRepsDisplay() {
        return this.repsDisplay;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getTonnageDisplay() {
        return this.tonnageDisplay;
    }

    public final String getVolumeDisplay() {
        return this.volumeDisplay;
    }

    public final String getVolumeTitleDisplay() {
        return this.volumeTitleDisplay;
    }

    public int hashCode() {
        int iHashCode = this.achievementIcons.hashCode() * 31;
        String str = this.endIcon;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.heartRateTimeline);
        String str2 = this.repsDisplay;
        int iHashCode2 = (iM31983b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.volumeDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.volumeTitleDisplay;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.subtitleDisplay), 31, this.titleDisplay), 31, this.tonnageDisplay);
        String str5 = this.intensityDisplay;
        int iHashCode4 = (iM30450d + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.exerciseId;
        return iHashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.achievementIcons;
        String str = this.endIcon;
        List<HeartRateTimelineModel> list2 = this.heartRateTimeline;
        String str2 = this.repsDisplay;
        String str3 = this.volumeDisplay;
        String str4 = this.volumeTitleDisplay;
        String str5 = this.subtitleDisplay;
        String str6 = this.titleDisplay;
        String str7 = this.tonnageDisplay;
        String str8 = this.intensityDisplay;
        String str9 = this.imageUrl;
        String str10 = this.exerciseId;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("ItemModel(achievementIcons=", ", endIcon=", str, ", heartRateTimeline=", list);
        AbstractC17176i.m48511m(", repsDisplay=", str2, ", volumeDisplay=", sbM79507k, list2);
        AbstractC11266d.m30444B(sbM79507k, str3, ", volumeTitleDisplay=", str4, ", subtitleDisplay=");
        AbstractC11266d.m30444B(sbM79507k, str5, ", titleDisplay=", str6, ", tonnageDisplay=");
        AbstractC11266d.m30444B(sbM79507k, str7, ", intensityDisplay=", str8, ", imageUrl=");
        return AbstractC11266d.m30464r(sbM79507k, str9, ", exerciseId=", str10, ")");
    }

    public ItemModel(List<String> achievementIcons, String str, List<HeartRateTimelineModel> heartRateTimeline, String str2, String str3, String str4, String subtitleDisplay, String titleDisplay, String tonnageDisplay, String str5, String str6, String str7) {
        AbstractC22676k.m65750j(achievementIcons, "achievementIcons");
        AbstractC22676k.m65750j(heartRateTimeline, "heartRateTimeline");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tonnageDisplay, "tonnageDisplay");
        this.achievementIcons = achievementIcons;
        this.endIcon = str;
        this.heartRateTimeline = heartRateTimeline;
        this.repsDisplay = str2;
        this.volumeDisplay = str3;
        this.volumeTitleDisplay = str4;
        this.subtitleDisplay = subtitleDisplay;
        this.titleDisplay = titleDisplay;
        this.tonnageDisplay = tonnageDisplay;
        this.intensityDisplay = str5;
        this.imageUrl = str6;
        this.exerciseId = str7;
    }

    public /* synthetic */ ItemModel(List list, String str, List list2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : str, list2, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }
}

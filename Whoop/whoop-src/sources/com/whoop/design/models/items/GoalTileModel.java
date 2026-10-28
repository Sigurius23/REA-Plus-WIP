package com.whoop.design.models.items;

import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36958e;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0084\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b/\u0010,J\u0010\u00100\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b0\u0010!J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bC\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bF\u0010\u001cR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010I\u0012\u0004\bK\u0010L\u001a\u0004\bJ\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010(R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010O\u0012\u0004\bQ\u0010L\u001a\u0004\bP\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010R\u001a\u0004\bS\u0010,¨\u0006V"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "Lcom/whoop/design/models/items/CheckmarkStyle;", "checkmarkStyle", "progressDisplay", "", "goalDays", "imageUrl", "", "Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;", "days", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/BottomSheetInfoModel;", "bottomInfoSheet", "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "circularProgressIndicator", "", "id", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Lcom/whoop/design/models/items/CheckmarkStyle;", "component3", "component4", "()I", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/whoop/navigation/e;", "component8", "()Lcom/whoop/design/models/items/BottomSheetInfoModel;", "component9", "()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "component10", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;)Lcom/whoop/design/models/items/GoalTileModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/GoalTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitleDisplay", "Lcom/whoop/design/models/items/CheckmarkStyle;", "getCheckmarkStyle", "getProgressDisplay", "I", "getGoalDays", "getImageUrl", "Ljava/util/List;", "getDays", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Lcom/whoop/design/models/items/BottomSheetInfoModel;", "getBottomInfoSheet", "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "getCircularProgressIndicator", "getCircularProgressIndicator$annotations", "Ljava/lang/String;", "getId", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GoalTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final BottomSheetInfoModel bottomInfoSheet;
    private final CheckmarkStyle checkmarkStyle;
    private final CircularProgressIndicator circularProgressIndicator;
    private final List<GoalTrackerIndicatorModel> days;
    private final C9598e destination;
    private final int goalDays;
    private final String id;
    private final TextResource imageUrl;
    private final TextResource progressDisplay;
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/GoalTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GoalTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36958e(6)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36958e(7)), AbstractC30060g.m92087G(enumC23463i, new C36958e(8)), null, AbstractC30060g.m92087G(enumC23463i, new C36958e(9)), null};
    }

    public /* synthetic */ GoalTileModel(int i13, TextResource textResource, CheckmarkStyle checkmarkStyle, TextResource textResource2, int i14, TextResource textResource3, List list, C9598e c9598e, BottomSheetInfoModel bottomSheetInfoModel, CircularProgressIndicator circularProgressIndicator, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (687 != (i13 & 687)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 687, GoalTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = textResource;
        this.checkmarkStyle = checkmarkStyle;
        this.progressDisplay = textResource2;
        this.goalDays = i14;
        if ((i13 & 16) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = textResource3;
        }
        this.days = list;
        if ((i13 & 64) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        this.bottomInfoSheet = bottomSheetInfoModel;
        if ((i13 & 256) == 0) {
            this.circularProgressIndicator = null;
        } else {
            this.circularProgressIndicator = circularProgressIndicator;
        }
        this.id = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.CheckmarkStyle", CheckmarkStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(GoalTrackerIndicatorModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CircularProgressIndicator.class), AbstractC38195a.m122336d(CircularProgressIndicator$$serializer.INSTANCE), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoalTileModel copy$default(GoalTileModel goalTileModel, TextResource textResource, CheckmarkStyle checkmarkStyle, TextResource textResource2, int i13, TextResource textResource3, List list, C9598e c9598e, BottomSheetInfoModel bottomSheetInfoModel, CircularProgressIndicator circularProgressIndicator, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            textResource = goalTileModel.titleDisplay;
        }
        if ((i14 & 2) != 0) {
            checkmarkStyle = goalTileModel.checkmarkStyle;
        }
        if ((i14 & 4) != 0) {
            textResource2 = goalTileModel.progressDisplay;
        }
        if ((i14 & 8) != 0) {
            i13 = goalTileModel.goalDays;
        }
        if ((i14 & 16) != 0) {
            textResource3 = goalTileModel.imageUrl;
        }
        if ((i14 & 32) != 0) {
            list = goalTileModel.days;
        }
        if ((i14 & 64) != 0) {
            c9598e = goalTileModel.destination;
        }
        if ((i14 & 128) != 0) {
            bottomSheetInfoModel = goalTileModel.bottomInfoSheet;
        }
        if ((i14 & 256) != 0) {
            circularProgressIndicator = goalTileModel.circularProgressIndicator;
        }
        if ((i14 & 512) != 0) {
            str = goalTileModel.id;
        }
        CircularProgressIndicator circularProgressIndicator2 = circularProgressIndicator;
        String str2 = str;
        C9598e c9598e2 = c9598e;
        BottomSheetInfoModel bottomSheetInfoModel2 = bottomSheetInfoModel;
        TextResource textResource4 = textResource3;
        List list2 = list;
        return goalTileModel.copy(textResource, checkmarkStyle, textResource2, i13, textResource4, list2, c9598e2, bottomSheetInfoModel2, circularProgressIndicator2, str2);
    }

    public static /* synthetic */ void getCircularProgressIndicator$annotations() {
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(GoalTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.checkmarkStyle);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.progressDisplay);
        output.encodeIntElement(serialDesc, 3, self.goalDays);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, c25452a, self.imageUrl);
        }
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.days);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.destination);
        }
        output.encodeNullableSerializableElement(serialDesc, 7, BottomSheetInfoModel$$serializer.INSTANCE, self.bottomInfoSheet);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.circularProgressIndicator != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.circularProgressIndicator);
        }
        output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CheckmarkStyle getCheckmarkStyle() {
        return this.checkmarkStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getProgressDisplay() {
        return this.progressDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getGoalDays() {
        return this.goalDays;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getImageUrl() {
        return this.imageUrl;
    }

    public final List<GoalTrackerIndicatorModel> component6() {
        return this.days;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BottomSheetInfoModel getBottomInfoSheet() {
        return this.bottomInfoSheet;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public final GoalTileModel copy(TextResource titleDisplay, CheckmarkStyle checkmarkStyle, TextResource progressDisplay, int goalDays, TextResource imageUrl, List<GoalTrackerIndicatorModel> days, C9598e destination, BottomSheetInfoModel bottomInfoSheet, CircularProgressIndicator circularProgressIndicator, String id4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(checkmarkStyle, "checkmarkStyle");
        AbstractC22676k.m65750j(progressDisplay, "progressDisplay");
        AbstractC22676k.m65750j(days, "days");
        return new GoalTileModel(titleDisplay, checkmarkStyle, progressDisplay, goalDays, imageUrl, days, destination, bottomInfoSheet, circularProgressIndicator, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoalTileModel)) {
            return false;
        }
        GoalTileModel goalTileModel = (GoalTileModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, goalTileModel.titleDisplay) && this.checkmarkStyle == goalTileModel.checkmarkStyle && AbstractC22676k.m65745e(this.progressDisplay, goalTileModel.progressDisplay) && this.goalDays == goalTileModel.goalDays && AbstractC22676k.m65745e(this.imageUrl, goalTileModel.imageUrl) && AbstractC22676k.m65745e(this.days, goalTileModel.days) && AbstractC22676k.m65745e(this.destination, goalTileModel.destination) && AbstractC22676k.m65745e(this.bottomInfoSheet, goalTileModel.bottomInfoSheet) && AbstractC22676k.m65745e(this.circularProgressIndicator, goalTileModel.circularProgressIndicator) && AbstractC22676k.m65745e(this.id, goalTileModel.id);
    }

    public final BottomSheetInfoModel getBottomInfoSheet() {
        return this.bottomInfoSheet;
    }

    public final CheckmarkStyle getCheckmarkStyle() {
        return this.checkmarkStyle;
    }

    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public final List<GoalTrackerIndicatorModel> getDays() {
        return this.days;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final int getGoalDays() {
        return this.goalDays;
    }

    public final String getId() {
        return this.id;
    }

    public final TextResource getImageUrl() {
        return this.imageUrl;
    }

    public final TextResource getProgressDisplay() {
        return this.progressDisplay;
    }

    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.goalDays, AbstractC31061c.m95625a((this.checkmarkStyle.hashCode() + (this.titleDisplay.hashCode() * 31)) * 31, this.progressDisplay, 31), 31);
        TextResource textResource = this.imageUrl;
        int iM31983b = AbstractC11895b.m31983b((iM30448b + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.days);
        C9598e c9598e = this.destination;
        int iHashCode = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        BottomSheetInfoModel bottomSheetInfoModel = this.bottomInfoSheet;
        int iHashCode2 = (iHashCode + (bottomSheetInfoModel == null ? 0 : bottomSheetInfoModel.hashCode())) * 31;
        CircularProgressIndicator circularProgressIndicator = this.circularProgressIndicator;
        int iHashCode3 = (iHashCode2 + (circularProgressIndicator == null ? 0 : circularProgressIndicator.hashCode())) * 31;
        String str = this.id;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        CheckmarkStyle checkmarkStyle = this.checkmarkStyle;
        TextResource textResource2 = this.progressDisplay;
        int i13 = this.goalDays;
        TextResource textResource3 = this.imageUrl;
        List<GoalTrackerIndicatorModel> list = this.days;
        C9598e c9598e = this.destination;
        BottomSheetInfoModel bottomSheetInfoModel = this.bottomInfoSheet;
        CircularProgressIndicator circularProgressIndicator = this.circularProgressIndicator;
        String str = this.id;
        StringBuilder sb4 = new StringBuilder("GoalTileModel(titleDisplay=");
        sb4.append(textResource);
        sb4.append(", checkmarkStyle=");
        sb4.append(checkmarkStyle);
        sb4.append(", progressDisplay=");
        sb4.append(textResource2);
        sb4.append(", goalDays=");
        sb4.append(i13);
        sb4.append(", imageUrl=");
        AbstractC21702c.m61143n(textResource3, ", days=", ", destination=", sb4, list);
        sb4.append(c9598e);
        sb4.append(", bottomInfoSheet=");
        sb4.append(bottomSheetInfoModel);
        sb4.append(", circularProgressIndicator=");
        sb4.append(circularProgressIndicator);
        sb4.append(", id=");
        sb4.append(str);
        sb4.append(")");
        return sb4.toString();
    }

    public GoalTileModel(TextResource titleDisplay, CheckmarkStyle checkmarkStyle, TextResource progressDisplay, int i13, TextResource textResource, List<GoalTrackerIndicatorModel> days, C9598e c9598e, BottomSheetInfoModel bottomSheetInfoModel, CircularProgressIndicator circularProgressIndicator, String str) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(checkmarkStyle, "checkmarkStyle");
        AbstractC22676k.m65750j(progressDisplay, "progressDisplay");
        AbstractC22676k.m65750j(days, "days");
        this.titleDisplay = titleDisplay;
        this.checkmarkStyle = checkmarkStyle;
        this.progressDisplay = progressDisplay;
        this.goalDays = i13;
        this.imageUrl = textResource;
        this.days = days;
        this.destination = c9598e;
        this.bottomInfoSheet = bottomSheetInfoModel;
        this.circularProgressIndicator = circularProgressIndicator;
        this.id = str;
    }

    public /* synthetic */ GoalTileModel(TextResource textResource, CheckmarkStyle checkmarkStyle, TextResource textResource2, int i13, TextResource textResource3, List list, C9598e c9598e, BottomSheetInfoModel bottomSheetInfoModel, CircularProgressIndicator circularProgressIndicator, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, checkmarkStyle, textResource2, i13, (i14 & 16) != 0 ? null : textResource3, list, (i14 & 64) != 0 ? null : c9598e, bottomSheetInfoModel, (i14 & 256) != 0 ? null : circularProgressIndicator, str);
    }
}

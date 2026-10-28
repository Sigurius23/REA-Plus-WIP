package com.whoop.weightlifting.data.dto;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ArticleTileModel;
import com.whoop.design.models.items.ArticleTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import ku2.C22837a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWB\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016B§\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010\"J¦\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u0010\u0010.\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010=\u0012\u0004\bB\u0010@\u001a\u0004\bA\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010=\u0012\u0004\bD\u0010@\u001a\u0004\bC\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010=\u0012\u0004\bF\u0010@\u001a\u0004\bE\u0010\u001dR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010G\u0012\u0004\bI\u0010@\u001a\u0004\bH\u0010\"R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010G\u0012\u0004\bK\u0010@\u001a\u0004\bJ\u0010\"R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010G\u0012\u0004\bM\u0010@\u001a\u0004\bL\u0010\"R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010N\u0012\u0004\bP\u0010@\u001a\u0004\bO\u0010&R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010G\u0012\u0004\bR\u0010@\u001a\u0004\bQ\u0010\"R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010S\u0012\u0004\bU\u0010@\u001a\u0004\bT\u0010)R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bV\u0010\"¨\u0006Y"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "", "", "workoutLibraryTitle", "whoopWorkoutsTitle", "myWorkoutsTitle", "myWorkoutsCtaText", "", "Lcom/whoop/design/models/items/ArticleTileModel;", "whoopWorkoutsList", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;", "myWorkoutsList", "Lcom/whoop/design/models/DesignSystemModel;", "myWorkoutHeaderItems", "Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;", "myWorkoutsEmptyState", "myProgress", "Lcom/whoop/weightlifting/data/dto/MetaData;", "metadata", "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;", "metadataList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;", "component9", "component10", "()Lcom/whoop/weightlifting/data/dto/MetaData;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;)Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getWorkoutLibraryTitle", "getWorkoutLibraryTitle$annotations", "()V", "getWhoopWorkoutsTitle", "getWhoopWorkoutsTitle$annotations", "getMyWorkoutsTitle", "getMyWorkoutsTitle$annotations", "getMyWorkoutsCtaText", "getMyWorkoutsCtaText$annotations", "Ljava/util/List;", "getWhoopWorkoutsList", "getWhoopWorkoutsList$annotations", "getMyWorkoutsList", "getMyWorkoutsList$annotations", "getMyWorkoutHeaderItems", "getMyWorkoutHeaderItems$annotations", "Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;", "getMyWorkoutsEmptyState", "getMyWorkoutsEmptyState$annotations", "getMyProgress", "getMyProgress$annotations", "Lcom/whoop/weightlifting/data/dto/MetaData;", "getMetadata", "getMetadata$annotations", "getMetadataList", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutLibraryModel {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("metadata")
    private final MetaData metadata;
    private final List<WorkoutLibraryMetadataListItemDto> metadataList;

    @SerializedName("my_progress")
    private final List<DesignSystemModel> myProgress;

    @SerializedName("my_workouts_header_items")
    private final List<DesignSystemModel> myWorkoutHeaderItems;

    @SerializedName("my_workouts_ctatext")
    private final String myWorkoutsCtaText;

    @SerializedName("my_workouts_empty_state")
    private final MyWorkoutsEmptyState myWorkoutsEmptyState;

    @SerializedName("my_workouts_list")
    private final List<WorkoutTemplateOverviewDto> myWorkoutsList;

    @SerializedName("my_workouts_title")
    private final String myWorkoutsTitle;

    @SerializedName("whoop_workouts_list")
    private final List<ArticleTileModel> whoopWorkoutsList;

    @SerializedName("whoop_workouts_title")
    private final String whoopWorkoutsTitle;

    @SerializedName("workout_library_title")
    private final String workoutLibraryTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutLibraryModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C22837a(8)), AbstractC30060g.m92087G(enumC23463i, new C22837a(9)), AbstractC30060g.m92087G(enumC23463i, new C22837a(10)), null, AbstractC30060g.m92087G(enumC23463i, new C22837a(11)), null, AbstractC30060g.m92087G(enumC23463i, new C22837a(12))};
    }

    public /* synthetic */ WorkoutLibraryModel(int i13, String str, String str2, String str3, String str4, List list, List list2, List list3, MyWorkoutsEmptyState myWorkoutsEmptyState, List list4, MetaData metaData, List list5, SerializationConstructorMarker serializationConstructorMarker) {
        if (447 != (i13 & 447)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 447, WorkoutLibraryModel$$serializer.INSTANCE.getDescriptor());
        }
        this.workoutLibraryTitle = str;
        this.whoopWorkoutsTitle = str2;
        this.myWorkoutsTitle = str3;
        this.myWorkoutsCtaText = str4;
        this.whoopWorkoutsList = list;
        this.myWorkoutsList = list2;
        if ((i13 & 64) == 0) {
            this.myWorkoutHeaderItems = null;
        } else {
            this.myWorkoutHeaderItems = list3;
        }
        this.myWorkoutsEmptyState = myWorkoutsEmptyState;
        this.myProgress = list4;
        if ((i13 & 512) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.metadataList = null;
        } else {
            this.metadataList = list5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ArticleTileModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(WorkoutTemplateOverviewDto$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(WorkoutLibraryMetadataListItemDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutLibraryModel copy$default(WorkoutLibraryModel workoutLibraryModel, String str, String str2, String str3, String str4, List list, List list2, List list3, MyWorkoutsEmptyState myWorkoutsEmptyState, List list4, MetaData metaData, List list5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = workoutLibraryModel.workoutLibraryTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = workoutLibraryModel.whoopWorkoutsTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = workoutLibraryModel.myWorkoutsTitle;
        }
        if ((i13 & 8) != 0) {
            str4 = workoutLibraryModel.myWorkoutsCtaText;
        }
        if ((i13 & 16) != 0) {
            list = workoutLibraryModel.whoopWorkoutsList;
        }
        if ((i13 & 32) != 0) {
            list2 = workoutLibraryModel.myWorkoutsList;
        }
        if ((i13 & 64) != 0) {
            list3 = workoutLibraryModel.myWorkoutHeaderItems;
        }
        if ((i13 & 128) != 0) {
            myWorkoutsEmptyState = workoutLibraryModel.myWorkoutsEmptyState;
        }
        if ((i13 & 256) != 0) {
            list4 = workoutLibraryModel.myProgress;
        }
        if ((i13 & 512) != 0) {
            metaData = workoutLibraryModel.metadata;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list5 = workoutLibraryModel.metadataList;
        }
        MetaData metaData2 = metaData;
        List list6 = list5;
        MyWorkoutsEmptyState myWorkoutsEmptyState2 = myWorkoutsEmptyState;
        List list7 = list4;
        List list8 = list2;
        List list9 = list3;
        List list10 = list;
        String str5 = str3;
        return workoutLibraryModel.copy(str, str2, str5, str4, list10, list8, list9, myWorkoutsEmptyState2, list7, metaData2, list6);
    }

    @InterfaceC37143h("metadata")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @InterfaceC37143h("my_progress")
    public static /* synthetic */ void getMyProgress$annotations() {
    }

    @InterfaceC37143h("my_workouts_header_items")
    public static /* synthetic */ void getMyWorkoutHeaderItems$annotations() {
    }

    @InterfaceC37143h("my_workouts_ctatext")
    public static /* synthetic */ void getMyWorkoutsCtaText$annotations() {
    }

    @InterfaceC37143h("my_workouts_empty_state")
    public static /* synthetic */ void getMyWorkoutsEmptyState$annotations() {
    }

    @InterfaceC37143h("my_workouts_list")
    public static /* synthetic */ void getMyWorkoutsList$annotations() {
    }

    @InterfaceC37143h("my_workouts_title")
    public static /* synthetic */ void getMyWorkoutsTitle$annotations() {
    }

    @InterfaceC37143h("whoop_workouts_list")
    public static /* synthetic */ void getWhoopWorkoutsList$annotations() {
    }

    @InterfaceC37143h("whoop_workouts_title")
    public static /* synthetic */ void getWhoopWorkoutsTitle$annotations() {
    }

    @InterfaceC37143h("workout_library_title")
    public static /* synthetic */ void getWorkoutLibraryTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutLibraryModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.workoutLibraryTitle);
        output.encodeStringElement(serialDesc, 1, self.whoopWorkoutsTitle);
        output.encodeStringElement(serialDesc, 2, self.myWorkoutsTitle);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.myWorkoutsCtaText);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.whoopWorkoutsList);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.myWorkoutsList);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.myWorkoutHeaderItems != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.myWorkoutHeaderItems);
        }
        output.encodeSerializableElement(serialDesc, 7, MyWorkoutsEmptyState$$serializer.INSTANCE, self.myWorkoutsEmptyState);
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.myProgress);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.metadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, MetaData$$serializer.INSTANCE, self.metadata);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.metadataList == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.metadataList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWorkoutLibraryTitle() {
        return this.workoutLibraryTitle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final List<WorkoutLibraryMetadataListItemDto> component11() {
        return this.metadataList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWhoopWorkoutsTitle() {
        return this.whoopWorkoutsTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMyWorkoutsTitle() {
        return this.myWorkoutsTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMyWorkoutsCtaText() {
        return this.myWorkoutsCtaText;
    }

    public final List<ArticleTileModel> component5() {
        return this.whoopWorkoutsList;
    }

    public final List<WorkoutTemplateOverviewDto> component6() {
        return this.myWorkoutsList;
    }

    public final List<DesignSystemModel> component7() {
        return this.myWorkoutHeaderItems;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MyWorkoutsEmptyState getMyWorkoutsEmptyState() {
        return this.myWorkoutsEmptyState;
    }

    public final List<DesignSystemModel> component9() {
        return this.myProgress;
    }

    public final WorkoutLibraryModel copy(String workoutLibraryTitle, String whoopWorkoutsTitle, String myWorkoutsTitle, String myWorkoutsCtaText, List<ArticleTileModel> whoopWorkoutsList, List<WorkoutTemplateOverviewDto> myWorkoutsList, List<? extends DesignSystemModel> myWorkoutHeaderItems, MyWorkoutsEmptyState myWorkoutsEmptyState, List<? extends DesignSystemModel> myProgress, MetaData metadata, List<WorkoutLibraryMetadataListItemDto> metadataList) {
        AbstractC22676k.m65750j(workoutLibraryTitle, "workoutLibraryTitle");
        AbstractC22676k.m65750j(whoopWorkoutsTitle, "whoopWorkoutsTitle");
        AbstractC22676k.m65750j(myWorkoutsTitle, "myWorkoutsTitle");
        AbstractC22676k.m65750j(whoopWorkoutsList, "whoopWorkoutsList");
        AbstractC22676k.m65750j(myWorkoutsList, "myWorkoutsList");
        AbstractC22676k.m65750j(myWorkoutsEmptyState, "myWorkoutsEmptyState");
        return new WorkoutLibraryModel(workoutLibraryTitle, whoopWorkoutsTitle, myWorkoutsTitle, myWorkoutsCtaText, whoopWorkoutsList, myWorkoutsList, myWorkoutHeaderItems, myWorkoutsEmptyState, myProgress, metadata, metadataList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutLibraryModel)) {
            return false;
        }
        WorkoutLibraryModel workoutLibraryModel = (WorkoutLibraryModel) other;
        return AbstractC22676k.m65745e(this.workoutLibraryTitle, workoutLibraryModel.workoutLibraryTitle) && AbstractC22676k.m65745e(this.whoopWorkoutsTitle, workoutLibraryModel.whoopWorkoutsTitle) && AbstractC22676k.m65745e(this.myWorkoutsTitle, workoutLibraryModel.myWorkoutsTitle) && AbstractC22676k.m65745e(this.myWorkoutsCtaText, workoutLibraryModel.myWorkoutsCtaText) && AbstractC22676k.m65745e(this.whoopWorkoutsList, workoutLibraryModel.whoopWorkoutsList) && AbstractC22676k.m65745e(this.myWorkoutsList, workoutLibraryModel.myWorkoutsList) && AbstractC22676k.m65745e(this.myWorkoutHeaderItems, workoutLibraryModel.myWorkoutHeaderItems) && AbstractC22676k.m65745e(this.myWorkoutsEmptyState, workoutLibraryModel.myWorkoutsEmptyState) && AbstractC22676k.m65745e(this.myProgress, workoutLibraryModel.myProgress) && AbstractC22676k.m65745e(this.metadata, workoutLibraryModel.metadata) && AbstractC22676k.m65745e(this.metadataList, workoutLibraryModel.metadataList);
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final List<WorkoutLibraryMetadataListItemDto> getMetadataList() {
        return this.metadataList;
    }

    public final List<DesignSystemModel> getMyProgress() {
        return this.myProgress;
    }

    public final List<DesignSystemModel> getMyWorkoutHeaderItems() {
        return this.myWorkoutHeaderItems;
    }

    public final String getMyWorkoutsCtaText() {
        return this.myWorkoutsCtaText;
    }

    public final MyWorkoutsEmptyState getMyWorkoutsEmptyState() {
        return this.myWorkoutsEmptyState;
    }

    public final List<WorkoutTemplateOverviewDto> getMyWorkoutsList() {
        return this.myWorkoutsList;
    }

    public final String getMyWorkoutsTitle() {
        return this.myWorkoutsTitle;
    }

    public final List<ArticleTileModel> getWhoopWorkoutsList() {
        return this.whoopWorkoutsList;
    }

    public final String getWhoopWorkoutsTitle() {
        return this.whoopWorkoutsTitle;
    }

    public final String getWorkoutLibraryTitle() {
        return this.workoutLibraryTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.workoutLibraryTitle.hashCode() * 31, 31, this.whoopWorkoutsTitle), 31, this.myWorkoutsTitle);
        String str = this.myWorkoutsCtaText;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.whoopWorkoutsList), 31, this.myWorkoutsList);
        List<DesignSystemModel> list = this.myWorkoutHeaderItems;
        int iHashCode = (this.myWorkoutsEmptyState.hashCode() + ((iM31983b + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        List<DesignSystemModel> list2 = this.myProgress;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        MetaData metaData = this.metadata;
        int iHashCode3 = (iHashCode2 + (metaData == null ? 0 : metaData.hashCode())) * 31;
        List<WorkoutLibraryMetadataListItemDto> list3 = this.metadataList;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        String str = this.workoutLibraryTitle;
        String str2 = this.whoopWorkoutsTitle;
        String str3 = this.myWorkoutsTitle;
        String str4 = this.myWorkoutsCtaText;
        List<ArticleTileModel> list = this.whoopWorkoutsList;
        List<WorkoutTemplateOverviewDto> list2 = this.myWorkoutsList;
        List<DesignSystemModel> list3 = this.myWorkoutHeaderItems;
        MyWorkoutsEmptyState myWorkoutsEmptyState = this.myWorkoutsEmptyState;
        List<DesignSystemModel> list4 = this.myProgress;
        MetaData metaData = this.metadata;
        List<WorkoutLibraryMetadataListItemDto> list5 = this.metadataList;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WorkoutLibraryModel(workoutLibraryTitle=", str, ", whoopWorkoutsTitle=", str2, ", myWorkoutsTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", myWorkoutsCtaText=", str4, ", whoopWorkoutsList=");
        AbstractC21702c.m61148s(sbM32001t, list, ", myWorkoutsList=", list2, ", myWorkoutHeaderItems=");
        sbM32001t.append(list3);
        sbM32001t.append(", myWorkoutsEmptyState=");
        sbM32001t.append(myWorkoutsEmptyState);
        sbM32001t.append(", myProgress=");
        sbM32001t.append(list4);
        sbM32001t.append(", metadata=");
        sbM32001t.append(metaData);
        sbM32001t.append(", metadataList=");
        return AbstractC3855a.m11829m(sbM32001t, list5, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkoutLibraryModel(String workoutLibraryTitle, String whoopWorkoutsTitle, String myWorkoutsTitle, String str, List<ArticleTileModel> whoopWorkoutsList, List<WorkoutTemplateOverviewDto> myWorkoutsList, List<? extends DesignSystemModel> list, MyWorkoutsEmptyState myWorkoutsEmptyState, List<? extends DesignSystemModel> list2, MetaData metaData, List<WorkoutLibraryMetadataListItemDto> list3) {
        AbstractC22676k.m65750j(workoutLibraryTitle, "workoutLibraryTitle");
        AbstractC22676k.m65750j(whoopWorkoutsTitle, "whoopWorkoutsTitle");
        AbstractC22676k.m65750j(myWorkoutsTitle, "myWorkoutsTitle");
        AbstractC22676k.m65750j(whoopWorkoutsList, "whoopWorkoutsList");
        AbstractC22676k.m65750j(myWorkoutsList, "myWorkoutsList");
        AbstractC22676k.m65750j(myWorkoutsEmptyState, "myWorkoutsEmptyState");
        this.workoutLibraryTitle = workoutLibraryTitle;
        this.whoopWorkoutsTitle = whoopWorkoutsTitle;
        this.myWorkoutsTitle = myWorkoutsTitle;
        this.myWorkoutsCtaText = str;
        this.whoopWorkoutsList = whoopWorkoutsList;
        this.myWorkoutsList = myWorkoutsList;
        this.myWorkoutHeaderItems = list;
        this.myWorkoutsEmptyState = myWorkoutsEmptyState;
        this.myProgress = list2;
        this.metadata = metaData;
        this.metadataList = list3;
    }

    public /* synthetic */ WorkoutLibraryModel(String str, String str2, String str3, String str4, List list, List list2, List list3, MyWorkoutsEmptyState myWorkoutsEmptyState, List list4, MetaData metaData, List list5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, list2, (i13 & 64) != 0 ? null : list3, myWorkoutsEmptyState, list4, (i13 & 512) != 0 ? null : metaData, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : list5);
    }
}

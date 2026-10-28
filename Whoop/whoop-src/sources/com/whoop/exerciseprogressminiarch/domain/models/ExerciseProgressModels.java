package com.whoop.exerciseprogressminiarch.domain.models;

import com.whoop.design.models.TimeSegmentModel;
import com.whoop.design.models.TimeSegmentModel$$serializer;
import com.whoop.design.models.items.NoDataGraphModel;
import com.whoop.design.models.items.NoDataGraphModel$$serializer;
import com.whoop.design.models.items.SegmentControllerModel;
import com.whoop.design.models.items.SegmentControllerModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import db2.C11888a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00066"}, m65681d2 = {"Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;", "", "", "id", "", "Lcom/whoop/design/models/TimeSegmentModel;", "timeSegments", "Lcom/whoop/design/models/items/SegmentControllerModel;", "segmentController", "Lcom/whoop/design/models/items/NoDataGraphModel;", "noDataGraphState", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$exercise_progress_mini_arch_release", "(Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/SegmentControllerModel;", "component4", "()Lcom/whoop/design/models/items/NoDataGraphModel;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;)Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getTimeSegments", "Lcom/whoop/design/models/items/SegmentControllerModel;", "getSegmentController", "Lcom/whoop/design/models/items/NoDataGraphModel;", "getNoDataGraphState", "Companion", "$serializer", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseProgressModels {
    private final String id;
    private final NoDataGraphModel noDataGraphState;
    private final SegmentControllerModel segmentController;
    private final List<TimeSegmentModel> timeSegments;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11888a(23)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;", "serializer", "()Lwc3/c;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseProgressModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExerciseProgressModels(int i13, String str, List list, SegmentControllerModel segmentControllerModel, NoDataGraphModel noDataGraphModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ExerciseProgressModels$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.timeSegments = list;
        this.segmentController = segmentControllerModel;
        this.noDataGraphState = noDataGraphModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TimeSegmentModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExerciseProgressModels copy$default(ExerciseProgressModels exerciseProgressModels, String str, List list, SegmentControllerModel segmentControllerModel, NoDataGraphModel noDataGraphModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exerciseProgressModels.id;
        }
        if ((i13 & 2) != 0) {
            list = exerciseProgressModels.timeSegments;
        }
        if ((i13 & 4) != 0) {
            segmentControllerModel = exerciseProgressModels.segmentController;
        }
        if ((i13 & 8) != 0) {
            noDataGraphModel = exerciseProgressModels.noDataGraphState;
        }
        return exerciseProgressModels.copy(str, list, segmentControllerModel, noDataGraphModel);
    }

    public static final /* synthetic */ void write$Self$exercise_progress_mini_arch_release(ExerciseProgressModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.timeSegments);
        output.encodeSerializableElement(serialDesc, 2, SegmentControllerModel$$serializer.INSTANCE, self.segmentController);
        output.encodeNullableSerializableElement(serialDesc, 3, NoDataGraphModel$$serializer.INSTANCE, self.noDataGraphState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<TimeSegmentModel> component2() {
        return this.timeSegments;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SegmentControllerModel getSegmentController() {
        return this.segmentController;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NoDataGraphModel getNoDataGraphState() {
        return this.noDataGraphState;
    }

    public final ExerciseProgressModels copy(String id4, List<TimeSegmentModel> timeSegments, SegmentControllerModel segmentController, NoDataGraphModel noDataGraphState) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(timeSegments, "timeSegments");
        AbstractC22676k.m65750j(segmentController, "segmentController");
        return new ExerciseProgressModels(id4, timeSegments, segmentController, noDataGraphState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseProgressModels)) {
            return false;
        }
        ExerciseProgressModels exerciseProgressModels = (ExerciseProgressModels) other;
        return AbstractC22676k.m65745e(this.id, exerciseProgressModels.id) && AbstractC22676k.m65745e(this.timeSegments, exerciseProgressModels.timeSegments) && AbstractC22676k.m65745e(this.segmentController, exerciseProgressModels.segmentController) && AbstractC22676k.m65745e(this.noDataGraphState, exerciseProgressModels.noDataGraphState);
    }

    public final String getId() {
        return this.id;
    }

    public final NoDataGraphModel getNoDataGraphState() {
        return this.noDataGraphState;
    }

    public final SegmentControllerModel getSegmentController() {
        return this.segmentController;
    }

    public final List<TimeSegmentModel> getTimeSegments() {
        return this.timeSegments;
    }

    public int hashCode() {
        int iHashCode = (this.segmentController.hashCode() + AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.timeSegments)) * 31;
        NoDataGraphModel noDataGraphModel = this.noDataGraphState;
        return iHashCode + (noDataGraphModel == null ? 0 : noDataGraphModel.hashCode());
    }

    public String toString() {
        String str = this.id;
        List<TimeSegmentModel> list = this.timeSegments;
        SegmentControllerModel segmentControllerModel = this.segmentController;
        NoDataGraphModel noDataGraphModel = this.noDataGraphState;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ExerciseProgressModels(id=", str, ", timeSegments=", ", segmentController=", list);
        sbM94766o.append(segmentControllerModel);
        sbM94766o.append(", noDataGraphState=");
        sbM94766o.append(noDataGraphModel);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public ExerciseProgressModels(String id4, List<TimeSegmentModel> timeSegments, SegmentControllerModel segmentController, NoDataGraphModel noDataGraphModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(timeSegments, "timeSegments");
        AbstractC22676k.m65750j(segmentController, "segmentController");
        this.id = id4;
        this.timeSegments = timeSegments;
        this.segmentController = segmentController;
        this.noDataGraphState = noDataGraphModel;
    }
}

package com.whoop.weightlifting.data.domain;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import jp1.C21864p;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lu2.C24751a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJB\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b\u0005\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b7\u0010\u001e¨\u0006:"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/CompletedSetData;", "", "Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "during", "", "isExerciseTrackable", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "strapLocation", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "strapLaterality", "wasEditedAfterCompletion", "<init>", "(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/domain/CompletedSetData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "component2", "()Z", "component3", "()Lcom/whoop/weightlifting/data/domain/StrapLocation;", "component4", "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "component5", "copy", "(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)Lcom/whoop/weightlifting/data/domain/CompletedSetData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "getDuring", "getDuring$annotations", "()V", "Z", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "getStrapLocation", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "getStrapLaterality", "getWasEditedAfterCompletion", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CompletedSetData {
    private static final InterfaceC23462h[] $childSerializers;
    private final DateTimeRange during;
    private final boolean isExerciseTrackable;
    private final StrapLaterality strapLaterality;
    private final StrapLocation strapLocation;
    private final boolean wasEditedAfterCompletion;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/CompletedSetData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/domain/CompletedSetData;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CompletedSetData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C21864p(15)), AbstractC30060g.m92087G(enumC23463i, new C21864p(16)), null};
    }

    public /* synthetic */ CompletedSetData(int i13, DateTimeRange dateTimeRange, boolean z4, StrapLocation strapLocation, StrapLaterality strapLaterality, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CompletedSetData$$serializer.INSTANCE.getDescriptor());
        }
        this.during = dateTimeRange;
        this.isExerciseTrackable = z4;
        this.strapLocation = strapLocation;
        this.strapLaterality = strapLaterality;
        if ((i13 & 16) == 0) {
            this.wasEditedAfterCompletion = false;
        } else {
            this.wasEditedAfterCompletion = z13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.weightlifting.data.domain.StrapLocation", StrapLocation.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.weightlifting.data.domain.StrapLaterality", StrapLaterality.values());
    }

    public static /* synthetic */ CompletedSetData copy$default(CompletedSetData completedSetData, DateTimeRange dateTimeRange, boolean z4, StrapLocation strapLocation, StrapLaterality strapLaterality, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateTimeRange = completedSetData.during;
        }
        if ((i13 & 2) != 0) {
            z4 = completedSetData.isExerciseTrackable;
        }
        if ((i13 & 4) != 0) {
            strapLocation = completedSetData.strapLocation;
        }
        if ((i13 & 8) != 0) {
            strapLaterality = completedSetData.strapLaterality;
        }
        if ((i13 & 16) != 0) {
            z13 = completedSetData.wasEditedAfterCompletion;
        }
        boolean z14 = z13;
        StrapLocation strapLocation2 = strapLocation;
        return completedSetData.copy(dateTimeRange, z4, strapLocation2, strapLaterality, z14);
    }

    @InterfaceC37144i(with = C24751a.class)
    public static /* synthetic */ void getDuring$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(CompletedSetData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C24751a.f96786a, self.during);
        output.encodeBooleanElement(serialDesc, 1, self.isExerciseTrackable);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.strapLocation);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.strapLaterality);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.wasEditedAfterCompletion) {
            output.encodeBooleanElement(serialDesc, 4, self.wasEditedAfterCompletion);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DateTimeRange getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsExerciseTrackable() {
        return this.isExerciseTrackable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StrapLocation getStrapLocation() {
        return this.strapLocation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StrapLaterality getStrapLaterality() {
        return this.strapLaterality;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getWasEditedAfterCompletion() {
        return this.wasEditedAfterCompletion;
    }

    public final CompletedSetData copy(DateTimeRange during, boolean isExerciseTrackable, StrapLocation strapLocation, StrapLaterality strapLaterality, boolean wasEditedAfterCompletion) {
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(strapLocation, "strapLocation");
        AbstractC22676k.m65750j(strapLaterality, "strapLaterality");
        return new CompletedSetData(during, isExerciseTrackable, strapLocation, strapLaterality, wasEditedAfterCompletion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedSetData)) {
            return false;
        }
        CompletedSetData completedSetData = (CompletedSetData) other;
        return AbstractC22676k.m65745e(this.during, completedSetData.during) && this.isExerciseTrackable == completedSetData.isExerciseTrackable && this.strapLocation == completedSetData.strapLocation && this.strapLaterality == completedSetData.strapLaterality && this.wasEditedAfterCompletion == completedSetData.wasEditedAfterCompletion;
    }

    public final DateTimeRange getDuring() {
        return this.during;
    }

    public final StrapLaterality getStrapLaterality() {
        return this.strapLaterality;
    }

    public final StrapLocation getStrapLocation() {
        return this.strapLocation;
    }

    public final boolean getWasEditedAfterCompletion() {
        return this.wasEditedAfterCompletion;
    }

    public int hashCode() {
        return Boolean.hashCode(this.wasEditedAfterCompletion) + ((this.strapLaterality.hashCode() + ((this.strapLocation.hashCode() + AbstractC2875y.m8289b(this.during.hashCode() * 31, 31, this.isExerciseTrackable)) * 31)) * 31);
    }

    public final boolean isExerciseTrackable() {
        return this.isExerciseTrackable;
    }

    public String toString() {
        DateTimeRange dateTimeRange = this.during;
        boolean z4 = this.isExerciseTrackable;
        StrapLocation strapLocation = this.strapLocation;
        StrapLaterality strapLaterality = this.strapLaterality;
        boolean z13 = this.wasEditedAfterCompletion;
        StringBuilder sb4 = new StringBuilder("CompletedSetData(during=");
        sb4.append(dateTimeRange);
        sb4.append(", isExerciseTrackable=");
        sb4.append(z4);
        sb4.append(", strapLocation=");
        sb4.append(strapLocation);
        sb4.append(", strapLaterality=");
        sb4.append(strapLaterality);
        sb4.append(", wasEditedAfterCompletion=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public CompletedSetData(DateTimeRange during, boolean z4, StrapLocation strapLocation, StrapLaterality strapLaterality, boolean z13) {
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(strapLocation, "strapLocation");
        AbstractC22676k.m65750j(strapLaterality, "strapLaterality");
        this.during = during;
        this.isExerciseTrackable = z4;
        this.strapLocation = strapLocation;
        this.strapLaterality = strapLaterality;
        this.wasEditedAfterCompletion = z13;
    }

    public /* synthetic */ CompletedSetData(DateTimeRange dateTimeRange, boolean z4, StrapLocation strapLocation, StrapLaterality strapLaterality, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateTimeRange, z4, strapLocation, strapLaterality, (i13 & 16) != 0 ? false : z13);
    }
}

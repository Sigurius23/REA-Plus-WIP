package com.whoop.core.details.network.model;

import com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CoreDetailsModelState;", "", "CoreDetails", "RecoveryDetails", "Companion", "Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;", "Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public interface CoreDetailsModelState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CoreDetailsModelState$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/CoreDetailsModelState;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final InterfaceC37138c serializer() {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            return new C37142g("com.whoop.core.details.network.model.CoreDetailsModelState", c22673i0.getOrCreateKotlinClass(CoreDetailsModelState.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(CoreDetails.class), c22673i0.getOrCreateKotlinClass(RecoveryDetails.class)}, new InterfaceC37138c[]{CoreDetailsModelState$CoreDetails$$serializer.INSTANCE, CoreDetailsModelState$RecoveryDetails$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;", "Lcom/whoop/core/details/network/model/CoreDetailsModelState;", "Lcom/whoop/core/details/network/model/CoreDetailsModel;", "coreDetails", "<init>", "(Lcom/whoop/core/details/network/model/CoreDetailsModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/core/details/network/model/CoreDetailsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/core/details/network/model/CoreDetailsModel;", "copy", "(Lcom/whoop/core/details/network/model/CoreDetailsModel;)Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/core/details/network/model/CoreDetailsModel;", "getCoreDetails", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class CoreDetails implements CoreDetailsModelState {
        private final CoreDetailsModel coreDetails;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CoreDetailsModelState$CoreDetails$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ CoreDetails(int i13, CoreDetailsModel coreDetailsModel, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, CoreDetailsModelState$CoreDetails$$serializer.INSTANCE.getDescriptor());
            }
            this.coreDetails = coreDetailsModel;
        }

        public static /* synthetic */ CoreDetails copy$default(CoreDetails coreDetails, CoreDetailsModel coreDetailsModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                coreDetailsModel = coreDetails.coreDetails;
            }
            return coreDetails.copy(coreDetailsModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CoreDetailsModel getCoreDetails() {
            return this.coreDetails;
        }

        public final CoreDetails copy(CoreDetailsModel coreDetails) {
            AbstractC22676k.m65750j(coreDetails, "coreDetails");
            return new CoreDetails(coreDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CoreDetails) && AbstractC22676k.m65745e(this.coreDetails, ((CoreDetails) other).coreDetails);
        }

        public final CoreDetailsModel getCoreDetails() {
            return this.coreDetails;
        }

        public int hashCode() {
            return this.coreDetails.hashCode();
        }

        public String toString() {
            return "CoreDetails(coreDetails=" + this.coreDetails + ")";
        }

        public CoreDetails(CoreDetailsModel coreDetails) {
            AbstractC22676k.m65750j(coreDetails, "coreDetails");
            this.coreDetails = coreDetails;
        }
    }

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails;", "Lcom/whoop/core/details/network/model/CoreDetailsModelState;", "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "recoveryDetails", "<init>", "(Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "copy", "(Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;)Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "getRecoveryDetails", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class RecoveryDetails implements CoreDetailsModelState {
        private final RecoveryDetailsModel recoveryDetails;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CoreDetailsModelState$RecoveryDetails$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ RecoveryDetails(int i13, RecoveryDetailsModel recoveryDetailsModel, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, CoreDetailsModelState$RecoveryDetails$$serializer.INSTANCE.getDescriptor());
            }
            this.recoveryDetails = recoveryDetailsModel;
        }

        public static /* synthetic */ RecoveryDetails copy$default(RecoveryDetails recoveryDetails, RecoveryDetailsModel recoveryDetailsModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                recoveryDetailsModel = recoveryDetails.recoveryDetails;
            }
            return recoveryDetails.copy(recoveryDetailsModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RecoveryDetailsModel getRecoveryDetails() {
            return this.recoveryDetails;
        }

        public final RecoveryDetails copy(RecoveryDetailsModel recoveryDetails) {
            AbstractC22676k.m65750j(recoveryDetails, "recoveryDetails");
            return new RecoveryDetails(recoveryDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RecoveryDetails) && AbstractC22676k.m65745e(this.recoveryDetails, ((RecoveryDetails) other).recoveryDetails);
        }

        public final RecoveryDetailsModel getRecoveryDetails() {
            return this.recoveryDetails;
        }

        public int hashCode() {
            return this.recoveryDetails.hashCode();
        }

        public String toString() {
            return "RecoveryDetails(recoveryDetails=" + this.recoveryDetails + ")";
        }

        public RecoveryDetails(RecoveryDetailsModel recoveryDetails) {
            AbstractC22676k.m65750j(recoveryDetails, "recoveryDetails");
            this.recoveryDetails = recoveryDetails;
        }
    }
}

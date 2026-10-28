package com.whoop.core.details.activitytargets;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/ActivityDetailsTargetsMiniArchModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/activitytargets/ActivityDetailsTargetsMiniArchModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/activitytargets/ActivityDetailsTargetsMiniArchModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getPath", "Companion", "a", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityDetailsTargetsMiniArchModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TYPE = "ACTIVITY_DETAILS_TARGETS_MINI_ARCH";
    private final String id;
    private final String path;

    /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.ActivityDetailsTargetsMiniArchModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/ActivityDetailsTargetsMiniArchModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/activitytargets/ActivityDetailsTargetsMiniArchModel;", "serializer", "()Lwc3/c;", "", "TYPE", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityDetailsTargetsMiniArchModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivityDetailsTargetsMiniArchModel(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ActivityDetailsTargetsMiniArchModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.path = str2;
    }

    public static /* synthetic */ ActivityDetailsTargetsMiniArchModel copy$default(ActivityDetailsTargetsMiniArchModel activityDetailsTargetsMiniArchModel, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activityDetailsTargetsMiniArchModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = activityDetailsTargetsMiniArchModel.path;
        }
        return activityDetailsTargetsMiniArchModel.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$core_details_release(ActivityDetailsTargetsMiniArchModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.path);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final ActivityDetailsTargetsMiniArchModel copy(String id4, String path) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(path, "path");
        return new ActivityDetailsTargetsMiniArchModel(id4, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityDetailsTargetsMiniArchModel)) {
            return false;
        }
        ActivityDetailsTargetsMiniArchModel activityDetailsTargetsMiniArchModel = (ActivityDetailsTargetsMiniArchModel) other;
        return AbstractC22676k.m65745e(this.id, activityDetailsTargetsMiniArchModel.id) && AbstractC22676k.m65745e(this.path, activityDetailsTargetsMiniArchModel.path);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.path.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("ActivityDetailsTargetsMiniArchModel(id=", this.id, ", path=", this.path, ")");
    }

    public ActivityDetailsTargetsMiniArchModel(String id4, String path) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(path, "path");
        this.id = id4;
        this.path = path;
    }
}

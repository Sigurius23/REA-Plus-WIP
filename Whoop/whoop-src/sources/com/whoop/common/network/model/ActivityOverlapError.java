package com.whoop.common.network.model;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ri2.C31469a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJT\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b2\u0010\u001d¨\u00066"}, m65681d2 = {"Lcom/whoop/common/network/model/ActivityOverlapError;", "", "", "", "overlappingActivities", "resolution", "dismissButton", "errorTitle", "proceedButton", "message", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$add_activity_release", "(Lcom/whoop/common/network/model/ActivityOverlapError;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/common/network/model/ActivityOverlapError;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOverlappingActivities", "Ljava/lang/String;", "getResolution", "getDismissButton", "getErrorTitle", "getProceedButton", "getMessage", "Companion", "$serializer", "a", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityOverlapError {
    private final String dismissButton;
    private final String errorTitle;
    private final String message;
    private final List<String> overlappingActivities;
    private final String proceedButton;
    private final String resolution;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31469a(8)), null, null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.common.network.model.ActivityOverlapError$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/common/network/model/ActivityOverlapError$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/common/network/model/ActivityOverlapError;", "serializer", "()Lwc3/c;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityOverlapError$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivityOverlapError(int i13, List list, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (47 != (i13 & 47)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 47, ActivityOverlapError$$serializer.INSTANCE.getDescriptor());
        }
        this.overlappingActivities = list;
        this.resolution = str;
        this.dismissButton = str2;
        this.errorTitle = str3;
        if ((i13 & 16) == 0) {
            this.proceedButton = null;
        } else {
            this.proceedButton = str4;
        }
        this.message = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityOverlapError copy$default(ActivityOverlapError activityOverlapError, List list, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = activityOverlapError.overlappingActivities;
        }
        if ((i13 & 2) != 0) {
            str = activityOverlapError.resolution;
        }
        if ((i13 & 4) != 0) {
            str2 = activityOverlapError.dismissButton;
        }
        if ((i13 & 8) != 0) {
            str3 = activityOverlapError.errorTitle;
        }
        if ((i13 & 16) != 0) {
            str4 = activityOverlapError.proceedButton;
        }
        if ((i13 & 32) != 0) {
            str5 = activityOverlapError.message;
        }
        String str6 = str4;
        String str7 = str5;
        return activityOverlapError.copy(list, str, str2, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$add_activity_release(ActivityOverlapError self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.overlappingActivities);
        output.encodeStringElement(serialDesc, 1, self.resolution);
        output.encodeStringElement(serialDesc, 2, self.dismissButton);
        output.encodeStringElement(serialDesc, 3, self.errorTitle);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.proceedButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.proceedButton);
        }
        output.encodeStringElement(serialDesc, 5, self.message);
    }

    public final List<String> component1() {
        return this.overlappingActivities;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDismissButton() {
        return this.dismissButton;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProceedButton() {
        return this.proceedButton;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ActivityOverlapError copy(List<String> overlappingActivities, String resolution, String dismissButton, String errorTitle, String proceedButton, String message) {
        AbstractC22676k.m65750j(overlappingActivities, "overlappingActivities");
        AbstractC22676k.m65750j(resolution, "resolution");
        AbstractC22676k.m65750j(dismissButton, "dismissButton");
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(message, "message");
        return new ActivityOverlapError(overlappingActivities, resolution, dismissButton, errorTitle, proceedButton, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityOverlapError)) {
            return false;
        }
        ActivityOverlapError activityOverlapError = (ActivityOverlapError) other;
        return AbstractC22676k.m65745e(this.overlappingActivities, activityOverlapError.overlappingActivities) && AbstractC22676k.m65745e(this.resolution, activityOverlapError.resolution) && AbstractC22676k.m65745e(this.dismissButton, activityOverlapError.dismissButton) && AbstractC22676k.m65745e(this.errorTitle, activityOverlapError.errorTitle) && AbstractC22676k.m65745e(this.proceedButton, activityOverlapError.proceedButton) && AbstractC22676k.m65745e(this.message, activityOverlapError.message);
    }

    public final String getDismissButton() {
        return this.dismissButton;
    }

    public final String getErrorTitle() {
        return this.errorTitle;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getOverlappingActivities() {
        return this.overlappingActivities;
    }

    public final String getProceedButton() {
        return this.proceedButton;
    }

    public final String getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.overlappingActivities.hashCode() * 31, 31, this.resolution), 31, this.dismissButton), 31, this.errorTitle);
        String str = this.proceedButton;
        return this.message.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        List<String> list = this.overlappingActivities;
        String str = this.resolution;
        String str2 = this.dismissButton;
        String str3 = this.errorTitle;
        String str4 = this.proceedButton;
        String str5 = this.message;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("ActivityOverlapError(overlappingActivities=", ", resolution=", str, ", dismissButton=", list);
        AbstractC11266d.m30444B(sbM79507k, str2, ", errorTitle=", str3, ", proceedButton=");
        return AbstractC11266d.m30464r(sbM79507k, str4, ", message=", str5, ")");
    }

    public ActivityOverlapError(List<String> overlappingActivities, String resolution, String dismissButton, String errorTitle, String str, String message) {
        AbstractC22676k.m65750j(overlappingActivities, "overlappingActivities");
        AbstractC22676k.m65750j(resolution, "resolution");
        AbstractC22676k.m65750j(dismissButton, "dismissButton");
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(message, "message");
        this.overlappingActivities = overlappingActivities;
        this.resolution = resolution;
        this.dismissButton = dismissButton;
        this.errorTitle = errorTitle;
        this.proceedButton = str;
        this.message = message;
    }

    public /* synthetic */ ActivityOverlapError(List list, String str, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, (i13 & 16) != 0 ? null : str4, str5);
    }
}

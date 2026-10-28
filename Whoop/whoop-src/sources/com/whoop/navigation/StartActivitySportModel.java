package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006+"}, m65681d2 = {"Lcom/whoop/navigation/StartActivitySportModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "sportId", "", "autoStartActivity", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/StartActivitySportModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/whoop/navigation/StartActivitySportModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getSportId", "Ljava/lang/Boolean;", "getAutoStartActivity", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StartActivitySportModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean autoStartActivity;
    private final Integer sportId;

    /* JADX INFO: renamed from: com.whoop.navigation.StartActivitySportModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/StartActivitySportModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/StartActivitySportModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StartActivitySportModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartActivitySportModel() {
        this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ StartActivitySportModel copy$default(StartActivitySportModel startActivitySportModel, Integer num, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = startActivitySportModel.sportId;
        }
        if ((i13 & 2) != 0) {
            bool = startActivitySportModel.autoStartActivity;
        }
        return startActivitySportModel.copy(num, bool);
    }

    public static final /* synthetic */ void write$Self$navigation_release(StartActivitySportModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.sportId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.sportId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.autoStartActivity == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.autoStartActivity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAutoStartActivity() {
        return this.autoStartActivity;
    }

    public final StartActivitySportModel copy(Integer sportId, Boolean autoStartActivity) {
        return new StartActivitySportModel(sportId, autoStartActivity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartActivitySportModel)) {
            return false;
        }
        StartActivitySportModel startActivitySportModel = (StartActivitySportModel) other;
        return AbstractC22676k.m65745e(this.sportId, startActivitySportModel.sportId) && AbstractC22676k.m65745e(this.autoStartActivity, startActivitySportModel.autoStartActivity);
    }

    public final Boolean getAutoStartActivity() {
        return this.autoStartActivity;
    }

    public final Integer getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        Integer num = this.sportId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.autoStartActivity;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "StartActivitySportModel(sportId=" + this.sportId + ", autoStartActivity=" + this.autoStartActivity + ")";
    }

    public /* synthetic */ StartActivitySportModel(int i13, Integer num, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.sportId = null;
        } else {
            this.sportId = num;
        }
        if ((i13 & 2) == 0) {
            this.autoStartActivity = null;
        } else {
            this.autoStartActivity = bool;
        }
    }

    public StartActivitySportModel(Integer num, Boolean bool) {
        this.sportId = num;
        this.autoStartActivity = bool;
    }

    public /* synthetic */ StartActivitySportModel(Integer num, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : bool);
    }
}

package com.whoop.data.remote.domain.request;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001b¨\u0006-"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;", "", "", "during", "source", "", "gpsEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDuring", "getSource", "Z", "getGpsEnabled", "getGpsEnabled$annotations", "()V", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserCreatedWorkoutDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("during")
    private final String during;

    @SerializedName("gpsEnabled")
    private final boolean gpsEnabled;

    @SerializedName("source")
    private final String source;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserCreatedWorkoutDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserCreatedWorkoutDto(int i13, String str, String str2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i13 & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 5, UserCreatedWorkoutDto$$serializer.INSTANCE.getDescriptor());
        }
        this.during = str;
        if ((i13 & 2) == 0) {
            this.source = com.whoop.service.network.model.UserState.Sources.AUTO_USER;
        } else {
            this.source = str2;
        }
        this.gpsEnabled = z4;
    }

    public static /* synthetic */ UserCreatedWorkoutDto copy$default(UserCreatedWorkoutDto userCreatedWorkoutDto, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userCreatedWorkoutDto.during;
        }
        if ((i13 & 2) != 0) {
            str2 = userCreatedWorkoutDto.source;
        }
        if ((i13 & 4) != 0) {
            z4 = userCreatedWorkoutDto.gpsEnabled;
        }
        return userCreatedWorkoutDto.copy(str, str2, z4);
    }

    @InterfaceC37143h("gpsEnabled")
    public static /* synthetic */ void getGpsEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(UserCreatedWorkoutDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.during);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.source, com.whoop.service.network.model.UserState.Sources.AUTO_USER)) {
            output.encodeStringElement(serialDesc, 1, self.source);
        }
        output.encodeBooleanElement(serialDesc, 2, self.gpsEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getGpsEnabled() {
        return this.gpsEnabled;
    }

    public final UserCreatedWorkoutDto copy(String during, String source, boolean gpsEnabled) {
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(source, "source");
        return new UserCreatedWorkoutDto(during, source, gpsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCreatedWorkoutDto)) {
            return false;
        }
        UserCreatedWorkoutDto userCreatedWorkoutDto = (UserCreatedWorkoutDto) other;
        return AbstractC22676k.m65745e(this.during, userCreatedWorkoutDto.during) && AbstractC22676k.m65745e(this.source, userCreatedWorkoutDto.source) && this.gpsEnabled == userCreatedWorkoutDto.gpsEnabled;
    }

    public final String getDuring() {
        return this.during;
    }

    public final boolean getGpsEnabled() {
        return this.gpsEnabled;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return Boolean.hashCode(this.gpsEnabled) + AbstractC11266d.m30450d(this.during.hashCode() * 31, 31, this.source);
    }

    public String toString() {
        String str = this.during;
        String str2 = this.source;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("UserCreatedWorkoutDto(during=", str, ", source=", str2, ", gpsEnabled="), this.gpsEnabled, ")");
    }

    public UserCreatedWorkoutDto(String during, String source, boolean z4) {
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(source, "source");
        this.during = during;
        this.source = source;
        this.gpsEnabled = z4;
    }

    public /* synthetic */ UserCreatedWorkoutDto(String str, String str2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? com.whoop.service.network.model.UserState.Sources.AUTO_USER : str2, z4);
    }
}

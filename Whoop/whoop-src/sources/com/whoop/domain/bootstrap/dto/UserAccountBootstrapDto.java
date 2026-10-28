package com.whoop.domain.bootstrap.dto;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJX\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b2\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b3\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b6\u0010\u001c¨\u0006:"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;", "", "", "username", NotificationCompat.CATEGORY_EMAIL, "", "canUploadData", "deidentified", "concealed", "", "userId", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;)Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUsername", "getEmail", "Z", "getCanUploadData", "getDeidentified", "getConcealed", "Ljava/lang/Integer;", "getUserId", "getCreatedAt", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserAccountBootstrapDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("can_upload_data")
    private final boolean canUploadData;
    private final boolean concealed;

    @SerializedName("created_at")
    private final String createdAt;
    private final boolean deidentified;
    private final String email;

    @SerializedName("user_id")
    private final Integer userId;
    private final String username;

    /* JADX INFO: renamed from: com.whoop.domain.bootstrap.dto.UserAccountBootstrapDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserAccountBootstrapDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserAccountBootstrapDto(int i13, String str, String str2, boolean z4, boolean z13, boolean z14, Integer num, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, UserAccountBootstrapDto$$serializer.INSTANCE.getDescriptor());
        }
        this.username = str;
        this.email = str2;
        this.canUploadData = z4;
        this.deidentified = z13;
        this.concealed = z14;
        this.userId = num;
        this.createdAt = str3;
    }

    public static /* synthetic */ UserAccountBootstrapDto copy$default(UserAccountBootstrapDto userAccountBootstrapDto, String str, String str2, boolean z4, boolean z13, boolean z14, Integer num, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userAccountBootstrapDto.username;
        }
        if ((i13 & 2) != 0) {
            str2 = userAccountBootstrapDto.email;
        }
        if ((i13 & 4) != 0) {
            z4 = userAccountBootstrapDto.canUploadData;
        }
        if ((i13 & 8) != 0) {
            z13 = userAccountBootstrapDto.deidentified;
        }
        if ((i13 & 16) != 0) {
            z14 = userAccountBootstrapDto.concealed;
        }
        if ((i13 & 32) != 0) {
            num = userAccountBootstrapDto.userId;
        }
        if ((i13 & 64) != 0) {
            str3 = userAccountBootstrapDto.createdAt;
        }
        Integer num2 = num;
        String str4 = str3;
        boolean z15 = z14;
        boolean z16 = z4;
        return userAccountBootstrapDto.copy(str, str2, z16, z13, z15, num2, str4);
    }

    public static final /* synthetic */ void write$Self$core_release(UserAccountBootstrapDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.username);
        output.encodeStringElement(serialDesc, 1, self.email);
        output.encodeBooleanElement(serialDesc, 2, self.canUploadData);
        output.encodeBooleanElement(serialDesc, 3, self.deidentified);
        output.encodeBooleanElement(serialDesc, 4, self.concealed);
        output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.userId);
        output.encodeStringElement(serialDesc, 6, self.createdAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanUploadData() {
        return this.canUploadData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDeidentified() {
        return this.deidentified;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getConcealed() {
        return this.concealed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final UserAccountBootstrapDto copy(String username, String email, boolean canUploadData, boolean deidentified, boolean concealed, Integer userId, String createdAt) {
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        return new UserAccountBootstrapDto(username, email, canUploadData, deidentified, concealed, userId, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAccountBootstrapDto)) {
            return false;
        }
        UserAccountBootstrapDto userAccountBootstrapDto = (UserAccountBootstrapDto) other;
        return AbstractC22676k.m65745e(this.username, userAccountBootstrapDto.username) && AbstractC22676k.m65745e(this.email, userAccountBootstrapDto.email) && this.canUploadData == userAccountBootstrapDto.canUploadData && this.deidentified == userAccountBootstrapDto.deidentified && this.concealed == userAccountBootstrapDto.concealed && AbstractC22676k.m65745e(this.userId, userAccountBootstrapDto.userId) && AbstractC22676k.m65745e(this.createdAt, userAccountBootstrapDto.createdAt);
    }

    public final boolean getCanUploadData() {
        return this.canUploadData;
    }

    public final boolean getConcealed() {
        return this.concealed;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getDeidentified() {
        return this.deidentified;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.username.hashCode() * 31, 31, this.email), 31, this.canUploadData), 31, this.deidentified), 31, this.concealed);
        Integer num = this.userId;
        return this.createdAt.hashCode() + ((iM8289b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        String str = this.username;
        String str2 = this.email;
        boolean z4 = this.canUploadData;
        boolean z13 = this.deidentified;
        boolean z14 = this.concealed;
        Integer num = this.userId;
        String str3 = this.createdAt;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UserAccountBootstrapDto(username=", str, ", email=", str2, ", canUploadData=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", deidentified=", z13, ", concealed=");
        sbM32001t.append(z14);
        sbM32001t.append(", userId=");
        sbM32001t.append(num);
        sbM32001t.append(", createdAt=");
        return AbstractC25012a.m73376i(str3, ")", sbM32001t);
    }

    public UserAccountBootstrapDto(String username, String email, boolean z4, boolean z13, boolean z14, Integer num, String createdAt) {
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        this.username = username;
        this.email = email;
        this.canUploadData = z4;
        this.deidentified = z13;
        this.concealed = z14;
        this.userId = num;
        this.createdAt = createdAt;
    }
}

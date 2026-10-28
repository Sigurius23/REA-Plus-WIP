package com.whoop.activation.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/activation/domain/models/EmailCheckResponse;", "", "", "valid", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "dialogInfo", "<init>", "(ZLcom/whoop/activation/domain/models/EmailDialogInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/whoop/activation/domain/models/EmailDialogInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/EmailCheckResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Lcom/whoop/activation/domain/models/EmailDialogInfo;", "copy", "(ZLcom/whoop/activation/domain/models/EmailDialogInfo;)Lcom/whoop/activation/domain/models/EmailCheckResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getValid", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "getDialogInfo", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EmailCheckResponse {

    @SerializedName("dialog_info")
    private final EmailDialogInfo dialogInfo;

    @SerializedName("valid")
    private final boolean valid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/EmailCheckResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/EmailCheckResponse;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EmailCheckResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EmailCheckResponse(int i13, boolean z4, EmailDialogInfo emailDialogInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, EmailCheckResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.valid = z4;
        this.dialogInfo = emailDialogInfo;
    }

    public static /* synthetic */ EmailCheckResponse copy$default(EmailCheckResponse emailCheckResponse, boolean z4, EmailDialogInfo emailDialogInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = emailCheckResponse.valid;
        }
        if ((i13 & 2) != 0) {
            emailDialogInfo = emailCheckResponse.dialogInfo;
        }
        return emailCheckResponse.copy(z4, emailDialogInfo);
    }

    public static final /* synthetic */ void write$Self$activation_release(EmailCheckResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.valid);
        output.encodeNullableSerializableElement(serialDesc, 1, EmailDialogInfo$$serializer.INSTANCE, self.dialogInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EmailDialogInfo getDialogInfo() {
        return this.dialogInfo;
    }

    public final EmailCheckResponse copy(boolean valid, EmailDialogInfo dialogInfo) {
        return new EmailCheckResponse(valid, dialogInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailCheckResponse)) {
            return false;
        }
        EmailCheckResponse emailCheckResponse = (EmailCheckResponse) other;
        return this.valid == emailCheckResponse.valid && AbstractC22676k.m65745e(this.dialogInfo, emailCheckResponse.dialogInfo);
    }

    public final EmailDialogInfo getDialogInfo() {
        return this.dialogInfo;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.valid) * 31;
        EmailDialogInfo emailDialogInfo = this.dialogInfo;
        return iHashCode + (emailDialogInfo == null ? 0 : emailDialogInfo.hashCode());
    }

    public String toString() {
        return "EmailCheckResponse(valid=" + this.valid + ", dialogInfo=" + this.dialogInfo + ")";
    }

    public EmailCheckResponse(boolean z4, EmailDialogInfo emailDialogInfo) {
        this.valid = z4;
        this.dialogInfo = emailDialogInfo;
    }
}

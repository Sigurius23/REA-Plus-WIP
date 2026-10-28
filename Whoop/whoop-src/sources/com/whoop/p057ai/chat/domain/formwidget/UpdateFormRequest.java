package com.whoop.p057ai.chat.domain.formwidget;

import androidx.core.app.NotificationCompat;
import cj0.C4744f;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;", "", "Lcom/whoop/ai/chat/domain/formwidget/a;", NotificationCompat.CATEGORY_STATUS, "", "conversationFingerprint", "turnId", "<init>", "(Lcom/whoop/ai/chat/domain/formwidget/a;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/ai/chat/domain/formwidget/a;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/ai/chat/domain/formwidget/a;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/whoop/ai/chat/domain/formwidget/a;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/ai/chat/domain/formwidget/a;", "getStatus", "Ljava/lang/String;", "getConversationFingerprint", "getTurnId", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpdateFormRequest {
    public static final int $stable = 0;
    private final String conversationFingerprint;
    private final EnumC5933a status;
    private final String turnId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4744f(13)), null, null};

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.UpdateFormRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpdateFormRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpdateFormRequest(int i13, EnumC5933a enumC5933a, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, UpdateFormRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.status = enumC5933a;
        if ((i13 & 2) == 0) {
            this.conversationFingerprint = null;
        } else {
            this.conversationFingerprint = str;
        }
        if ((i13 & 4) == 0) {
            this.turnId = null;
        } else {
            this.turnId = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.ai.chat.domain.formwidget.FormStatus", EnumC5933a.values());
    }

    public static /* synthetic */ UpdateFormRequest copy$default(UpdateFormRequest updateFormRequest, EnumC5933a enumC5933a, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC5933a = updateFormRequest.status;
        }
        if ((i13 & 2) != 0) {
            str = updateFormRequest.conversationFingerprint;
        }
        if ((i13 & 4) != 0) {
            str2 = updateFormRequest.turnId;
        }
        return updateFormRequest.copy(enumC5933a, str, str2);
    }

    public static final /* synthetic */ void write$Self$bot_release(UpdateFormRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.conversationFingerprint != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.conversationFingerprint);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.turnId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.turnId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC5933a getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversationFingerprint() {
        return this.conversationFingerprint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    public final UpdateFormRequest copy(EnumC5933a status, String conversationFingerprint, String turnId) {
        AbstractC22676k.m65750j(status, "status");
        return new UpdateFormRequest(status, conversationFingerprint, turnId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateFormRequest)) {
            return false;
        }
        UpdateFormRequest updateFormRequest = (UpdateFormRequest) other;
        return this.status == updateFormRequest.status && AbstractC22676k.m65745e(this.conversationFingerprint, updateFormRequest.conversationFingerprint) && AbstractC22676k.m65745e(this.turnId, updateFormRequest.turnId);
    }

    public final String getConversationFingerprint() {
        return this.conversationFingerprint;
    }

    public final EnumC5933a getStatus() {
        return this.status;
    }

    public final String getTurnId() {
        return this.turnId;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.conversationFingerprint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.turnId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        EnumC5933a enumC5933a = this.status;
        String str = this.conversationFingerprint;
        String str2 = this.turnId;
        StringBuilder sb4 = new StringBuilder("UpdateFormRequest(status=");
        sb4.append(enumC5933a);
        sb4.append(", conversationFingerprint=");
        sb4.append(str);
        sb4.append(", turnId=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public UpdateFormRequest(EnumC5933a status, String str, String str2) {
        AbstractC22676k.m65750j(status, "status");
        this.status = status;
        this.conversationFingerprint = str;
        this.turnId = str2;
    }

    public /* synthetic */ UpdateFormRequest(EnumC5933a enumC5933a, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC5933a, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2);
    }
}

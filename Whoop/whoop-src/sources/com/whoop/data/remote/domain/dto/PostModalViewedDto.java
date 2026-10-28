package com.whoop.data.remote.domain.dto;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.growth.ModalViewedStatus;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import vw0.C36541a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/PostModalViewedDto;", "", "", "userId", "", "name", "Lcom/whoop/data/remote/domain/response/growth/ModalViewedStatus;", NotificationCompat.CATEGORY_STATUS, "<init>", "(ILjava/lang/String;Lcom/whoop/data/remote/domain/response/growth/ModalViewedStatus;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/whoop/data/remote/domain/response/growth/ModalViewedStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/PostModalViewedDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/data/remote/domain/response/growth/ModalViewedStatus;", "copy", "(ILjava/lang/String;Lcom/whoop/data/remote/domain/response/growth/ModalViewedStatus;)Lcom/whoop/data/remote/domain/dto/PostModalViewedDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getUserId", "Ljava/lang/String;", "getName", "Lcom/whoop/data/remote/domain/response/growth/ModalViewedStatus;", "getStatus", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PostModalViewedDto {

    @SerializedName("name")
    private final String name;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final ModalViewedStatus status;

    @SerializedName("user_id")
    private final int userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36541a(6))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/PostModalViewedDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/PostModalViewedDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PostModalViewedDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PostModalViewedDto(int i13, int i14, String str, ModalViewedStatus modalViewedStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PostModalViewedDto$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = i14;
        this.name = str;
        this.status = modalViewedStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.data.remote.domain.response.growth.ModalViewedStatus", ModalViewedStatus.values());
    }

    public static /* synthetic */ PostModalViewedDto copy$default(PostModalViewedDto postModalViewedDto, int i13, String str, ModalViewedStatus modalViewedStatus, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = postModalViewedDto.userId;
        }
        if ((i14 & 2) != 0) {
            str = postModalViewedDto.name;
        }
        if ((i14 & 4) != 0) {
            modalViewedStatus = postModalViewedDto.status;
        }
        return postModalViewedDto.copy(i13, str, modalViewedStatus);
    }

    public static final /* synthetic */ void write$Self$core_release(PostModalViewedDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.userId);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ModalViewedStatus getStatus() {
        return this.status;
    }

    public final PostModalViewedDto copy(int userId, String name, ModalViewedStatus status) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(status, "status");
        return new PostModalViewedDto(userId, name, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostModalViewedDto)) {
            return false;
        }
        PostModalViewedDto postModalViewedDto = (PostModalViewedDto) other;
        return this.userId == postModalViewedDto.userId && AbstractC22676k.m65745e(this.name, postModalViewedDto.name) && this.status == postModalViewedDto.status;
    }

    public final String getName() {
        return this.name;
    }

    public final ModalViewedStatus getStatus() {
        return this.status;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.status.hashCode() + AbstractC11266d.m30450d(Integer.hashCode(this.userId) * 31, 31, this.name);
    }

    public String toString() {
        int i13 = this.userId;
        String str = this.name;
        ModalViewedStatus modalViewedStatus = this.status;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "PostModalViewedDto(userId=", ", name=", str, ", status=");
        sbM53373n.append(modalViewedStatus);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public PostModalViewedDto(int i13, String name, ModalViewedStatus status) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(status, "status");
        this.userId = i13;
        this.name = name;
        this.status = status;
    }
}

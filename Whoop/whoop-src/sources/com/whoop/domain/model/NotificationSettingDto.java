package com.whoop.domain.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b'\u0010(\u001a\u0004\b\u0003\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b-\u0010\u001b¨\u00060"}, m65681d2 = {"Lcom/whoop/domain/model/NotificationSettingDto;", "", "", "isActive", "", "namespace", "subtitle", "title", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/NotificationSettingDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/NotificationSettingDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "isActive$annotations", "()V", "Ljava/lang/String;", "getNamespace", "getNamespace$annotations", "getSubtitle", "getTitle", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NotificationSettingDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("active")
    private final boolean isActive;

    @SerializedName("push_namespace")
    private final String namespace;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/NotificationSettingDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/NotificationSettingDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NotificationSettingDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NotificationSettingDto(int i13, boolean z4, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, NotificationSettingDto$$serializer.INSTANCE.getDescriptor());
        }
        this.isActive = z4;
        this.namespace = str;
        this.subtitle = str2;
        this.title = str3;
    }

    public static /* synthetic */ NotificationSettingDto copy$default(NotificationSettingDto notificationSettingDto, boolean z4, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = notificationSettingDto.isActive;
        }
        if ((i13 & 2) != 0) {
            str = notificationSettingDto.namespace;
        }
        if ((i13 & 4) != 0) {
            str2 = notificationSettingDto.subtitle;
        }
        if ((i13 & 8) != 0) {
            str3 = notificationSettingDto.title;
        }
        return notificationSettingDto.copy(z4, str, str2, str3);
    }

    @InterfaceC37143h("push_namespace")
    public static /* synthetic */ void getNamespace$annotations() {
    }

    @InterfaceC37143h("active")
    public static /* synthetic */ void isActive$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(NotificationSettingDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isActive);
        output.encodeStringElement(serialDesc, 1, self.namespace);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final NotificationSettingDto copy(boolean isActive, String namespace, String subtitle, String title) {
        AbstractC22676k.m65750j(namespace, "namespace");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(title, "title");
        return new NotificationSettingDto(isActive, namespace, subtitle, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSettingDto)) {
            return false;
        }
        NotificationSettingDto notificationSettingDto = (NotificationSettingDto) other;
        return this.isActive == notificationSettingDto.isActive && AbstractC22676k.m65745e(this.namespace, notificationSettingDto.namespace) && AbstractC22676k.m65745e(this.subtitle, notificationSettingDto.subtitle) && AbstractC22676k.m65745e(this.title, notificationSettingDto.title);
    }

    public final String getNamespace() {
        return this.namespace;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.isActive) * 31, 31, this.namespace), 31, this.subtitle);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        boolean z4 = this.isActive;
        String str = this.namespace;
        return AbstractC11266d.m30464r(AbstractC13673n.m38567n("NotificationSettingDto(isActive=", ", namespace=", str, ", subtitle=", z4), this.subtitle, ", title=", this.title, ")");
    }

    public NotificationSettingDto(boolean z4, String namespace, String subtitle, String title) {
        AbstractC22676k.m65750j(namespace, "namespace");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(title, "title");
        this.isActive = z4;
        this.namespace = namespace;
        this.subtitle = subtitle;
        this.title = title;
    }
}

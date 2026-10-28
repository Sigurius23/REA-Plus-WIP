package io.getstream.chat.android.client.api2.model.dto;

import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;", "", "id", "", "push_provider", "push_provider_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPush_provider", "getPush_provider_name", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DeviceDto {
    private final String id;
    private final String push_provider;
    private final String push_provider_name;

    public DeviceDto(String id4, String push_provider, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(push_provider, "push_provider");
        this.id = id4;
        this.push_provider = push_provider;
        this.push_provider_name = str;
    }

    public static /* synthetic */ DeviceDto copy$default(DeviceDto deviceDto, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = deviceDto.id;
        }
        if ((i13 & 2) != 0) {
            str2 = deviceDto.push_provider;
        }
        if ((i13 & 4) != 0) {
            str3 = deviceDto.push_provider_name;
        }
        return deviceDto.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPush_provider() {
        return this.push_provider;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPush_provider_name() {
        return this.push_provider_name;
    }

    public final DeviceDto copy(String id4, String push_provider, String push_provider_name) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(push_provider, "push_provider");
        return new DeviceDto(id4, push_provider, push_provider_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDto)) {
            return false;
        }
        DeviceDto deviceDto = (DeviceDto) other;
        return AbstractC22676k.m65745e(this.id, deviceDto.id) && AbstractC22676k.m65745e(this.push_provider, deviceDto.push_provider) && AbstractC22676k.m65745e(this.push_provider_name, deviceDto.push_provider_name);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPush_provider() {
        return this.push_provider;
    }

    public final String getPush_provider_name() {
        return this.push_provider_name;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.push_provider);
        String str = this.push_provider_name;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.push_provider_name, ")", AbstractC11895b.m32001t("DeviceDto(id=", this.id, ", push_provider=", this.push_provider, ", push_provider_name="));
    }
}

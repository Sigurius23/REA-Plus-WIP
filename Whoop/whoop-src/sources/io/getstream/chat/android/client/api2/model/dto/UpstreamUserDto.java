package io.getstream.chat.android.client.api2.model.dto;

import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@StreamHandsOff(reason = "Field names can't be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map")
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eHÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012HÆ\u0003J\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0012HÆ\u0003J©\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0012HÆ\u0001J\u0013\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&¨\u0006:"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "banned", "", "id", "", "name", "image", "invisible", "privacy_settings", "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "language", "role", "devices", "", "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;", "teams", "teams_role", "", "extraData", "", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getBanned", "()Z", "getId", "()Ljava/lang/String;", "getName", "getImage", "getInvisible", "getPrivacy_settings", "()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "getLanguage", "getRole", "getDevices", "()Ljava/util/List;", "getTeams", "getTeams_role", "()Ljava/util/Map;", "getExtraData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpstreamUserDto implements ExtraDataDto {
    private final boolean banned;
    private final List<DeviceDto> devices;
    private final Map<String, Object> extraData;
    private final String id;
    private final String image;
    private final boolean invisible;
    private final String language;
    private final String name;
    private final PrivacySettingsDto privacy_settings;
    private final String role;
    private final List<String> teams;
    private final Map<String, String> teams_role;

    public UpstreamUserDto(boolean z4, String id4, String name, String image, boolean z13, PrivacySettingsDto privacySettingsDto, String language, String role, List<DeviceDto> devices, List<String> teams, Map<String, String> map, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(devices, "devices");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.banned = z4;
        this.id = id4;
        this.name = name;
        this.image = image;
        this.invisible = z13;
        this.privacy_settings = privacySettingsDto;
        this.language = language;
        this.role = role;
        this.devices = devices;
        this.teams = teams;
        this.teams_role = map;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpstreamUserDto copy$default(UpstreamUserDto upstreamUserDto, boolean z4, String str, String str2, String str3, boolean z13, PrivacySettingsDto privacySettingsDto, String str4, String str5, List list, List list2, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = upstreamUserDto.banned;
        }
        if ((i13 & 2) != 0) {
            str = upstreamUserDto.id;
        }
        if ((i13 & 4) != 0) {
            str2 = upstreamUserDto.name;
        }
        if ((i13 & 8) != 0) {
            str3 = upstreamUserDto.image;
        }
        if ((i13 & 16) != 0) {
            z13 = upstreamUserDto.invisible;
        }
        if ((i13 & 32) != 0) {
            privacySettingsDto = upstreamUserDto.privacy_settings;
        }
        if ((i13 & 64) != 0) {
            str4 = upstreamUserDto.language;
        }
        if ((i13 & 128) != 0) {
            str5 = upstreamUserDto.role;
        }
        if ((i13 & 256) != 0) {
            list = upstreamUserDto.devices;
        }
        if ((i13 & 512) != 0) {
            list2 = upstreamUserDto.teams;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = upstreamUserDto.teams_role;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            map2 = upstreamUserDto.extraData;
        }
        Map map3 = map;
        Map map4 = map2;
        List list3 = list;
        List list4 = list2;
        String str6 = str4;
        String str7 = str5;
        boolean z14 = z13;
        PrivacySettingsDto privacySettingsDto2 = privacySettingsDto;
        return upstreamUserDto.copy(z4, str, str2, str3, z14, privacySettingsDto2, str6, str7, list3, list4, map3, map4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getBanned() {
        return this.banned;
    }

    public final List<String> component10() {
        return this.teams;
    }

    public final Map<String, String> component11() {
        return this.teams_role;
    }

    public final Map<String, Object> component12() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getInvisible() {
        return this.invisible;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PrivacySettingsDto getPrivacy_settings() {
        return this.privacy_settings;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final List<DeviceDto> component9() {
        return this.devices;
    }

    public final UpstreamUserDto copy(boolean banned, String id4, String name, String image, boolean invisible, PrivacySettingsDto privacy_settings, String language, String role, List<DeviceDto> devices, List<String> teams, Map<String, String> teams_role, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(devices, "devices");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new UpstreamUserDto(banned, id4, name, image, invisible, privacy_settings, language, role, devices, teams, teams_role, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamUserDto)) {
            return false;
        }
        UpstreamUserDto upstreamUserDto = (UpstreamUserDto) other;
        return this.banned == upstreamUserDto.banned && AbstractC22676k.m65745e(this.id, upstreamUserDto.id) && AbstractC22676k.m65745e(this.name, upstreamUserDto.name) && AbstractC22676k.m65745e(this.image, upstreamUserDto.image) && this.invisible == upstreamUserDto.invisible && AbstractC22676k.m65745e(this.privacy_settings, upstreamUserDto.privacy_settings) && AbstractC22676k.m65745e(this.language, upstreamUserDto.language) && AbstractC22676k.m65745e(this.role, upstreamUserDto.role) && AbstractC22676k.m65745e(this.devices, upstreamUserDto.devices) && AbstractC22676k.m65745e(this.teams, upstreamUserDto.teams) && AbstractC22676k.m65745e(this.teams_role, upstreamUserDto.teams_role) && AbstractC22676k.m65745e(this.extraData, upstreamUserDto.extraData);
    }

    public final boolean getBanned() {
        return this.banned;
    }

    public final List<DeviceDto> getDevices() {
        return this.devices;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final boolean getInvisible() {
        return this.invisible;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getName() {
        return this.name;
    }

    public final PrivacySettingsDto getPrivacy_settings() {
        return this.privacy_settings;
    }

    public final String getRole() {
        return this.role;
    }

    public final List<String> getTeams() {
        return this.teams;
    }

    public final Map<String, String> getTeams_role() {
        return this.teams_role;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.banned) * 31, 31, this.id), 31, this.name), 31, this.image), 31, this.invisible);
        PrivacySettingsDto privacySettingsDto = this.privacy_settings;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM8289b + (privacySettingsDto == null ? 0 : privacySettingsDto.hashCode())) * 31, 31, this.language), 31, this.role), 31, this.devices), 31, this.teams);
        Map<String, String> map = this.teams_role;
        return this.extraData.hashCode() + ((iM31983b + (map != null ? map.hashCode() : 0)) * 31);
    }

    public String toString() {
        boolean z4 = this.banned;
        String str = this.id;
        String str2 = this.name;
        String str3 = this.image;
        boolean z13 = this.invisible;
        PrivacySettingsDto privacySettingsDto = this.privacy_settings;
        String str4 = this.language;
        String str5 = this.role;
        List<DeviceDto> list = this.devices;
        List<String> list2 = this.teams;
        Map<String, String> map = this.teams_role;
        Map<String, Object> map2 = this.extraData;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("UpstreamUserDto(banned=", ", id=", str, ", name=", z4);
        AbstractC11266d.m30444B(sbM38567n, str2, ", image=", str3, ", invisible=");
        sbM38567n.append(z13);
        sbM38567n.append(", privacy_settings=");
        sbM38567n.append(privacySettingsDto);
        sbM38567n.append(", language=");
        AbstractC11266d.m30444B(sbM38567n, str4, ", role=", str5, ", devices=");
        AbstractC21702c.m61148s(sbM38567n, list, ", teams=", list2, ", teams_role=");
        return AbstractC30802r.m94765n(sbM38567n, map, ", extraData=", map2, ")");
    }
}

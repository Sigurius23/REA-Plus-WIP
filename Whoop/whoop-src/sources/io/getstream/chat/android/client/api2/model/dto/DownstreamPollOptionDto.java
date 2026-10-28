package io.getstream.chat.android.client.api2.model.dto;

import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "id", "", "text", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getText", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamPollOptionDto implements ExtraDataDto {
    private final Map<String, Object> extraData;
    private final String id;
    private final String text;

    public DownstreamPollOptionDto(String id4, String text, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        this.id = id4;
        this.text = text;
        this.extraData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamPollOptionDto copy$default(DownstreamPollOptionDto downstreamPollOptionDto, String str, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamPollOptionDto.id;
        }
        if ((i13 & 2) != 0) {
            str2 = downstreamPollOptionDto.text;
        }
        if ((i13 & 4) != 0) {
            map = downstreamPollOptionDto.extraData;
        }
        return downstreamPollOptionDto.copy(str, str2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Map<String, Object> component3() {
        return this.extraData;
    }

    public final DownstreamPollOptionDto copy(String id4, String text, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        return new DownstreamPollOptionDto(id4, text, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamPollOptionDto)) {
            return false;
        }
        DownstreamPollOptionDto downstreamPollOptionDto = (DownstreamPollOptionDto) other;
        return AbstractC22676k.m65745e(this.id, downstreamPollOptionDto.id) && AbstractC22676k.m65745e(this.text, downstreamPollOptionDto.text) && AbstractC22676k.m65745e(this.extraData, downstreamPollOptionDto.extraData);
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.text);
        Map<String, Object> map = this.extraData;
        return iM30450d + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        return AbstractC13673n.m38565l(AbstractC11895b.m32001t("DownstreamPollOptionDto(id=", str, ", text=", str2, ", extraData="), this.extraData, ")");
    }
}

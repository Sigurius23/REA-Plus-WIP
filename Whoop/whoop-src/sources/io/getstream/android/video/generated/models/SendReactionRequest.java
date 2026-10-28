package io.getstream.android.video.generated.models;

import java.util.Map;
import m83.C25272z;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SendReactionRequest;", "", "type", "", "emojiCode", "custom", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCustom", "()Ljava/util/Map;", "getEmojiCode", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SendReactionRequest {
    private final Map<String, Object> custom;
    private final String emojiCode;
    private final String type;

    public SendReactionRequest(@InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "emoji_code") String str, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.emojiCode = str;
        this.custom = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendReactionRequest copy$default(SendReactionRequest sendReactionRequest, String str, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sendReactionRequest.type;
        }
        if ((i13 & 2) != 0) {
            str2 = sendReactionRequest.emojiCode;
        }
        if ((i13 & 4) != 0) {
            map = sendReactionRequest.custom;
        }
        return sendReactionRequest.copy(str, str2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmojiCode() {
        return this.emojiCode;
    }

    public final Map<String, Object> component3() {
        return this.custom;
    }

    public final SendReactionRequest copy(@InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "emoji_code") String emojiCode, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom) {
        AbstractC22676k.m65750j(type, "type");
        return new SendReactionRequest(type, emojiCode, custom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendReactionRequest)) {
            return false;
        }
        SendReactionRequest sendReactionRequest = (SendReactionRequest) other;
        return AbstractC22676k.m65745e(this.type, sendReactionRequest.type) && AbstractC22676k.m65745e(this.emojiCode, sendReactionRequest.emojiCode) && AbstractC22676k.m65745e(this.custom, sendReactionRequest.custom);
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final String getEmojiCode() {
        return this.emojiCode;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.emojiCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.custom;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.emojiCode;
        return AbstractC13673n.m38565l(AbstractC11895b.m32001t("SendReactionRequest(type=", str, ", emojiCode=", str2, ", custom="), this.custom, ")");
    }

    public /* synthetic */ SendReactionRequest(String str, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? C25272z.f99163w : map);
    }
}

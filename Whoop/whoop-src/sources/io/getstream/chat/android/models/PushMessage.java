package io.getstream.chat.android.models;

import c13.AbstractC3855a;
import java.util.Map;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003Jo\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/models/PushMessage;", "", "messageId", "", "channelId", "channelType", "getstream", "", "extraData", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getMessageId", "()Ljava/lang/String;", "getChannelId", "getChannelType", "getGetstream", "()Ljava/util/Map;", "getExtraData", "getMetadata", "type", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PushMessage {
    private final String channelId;
    private final String channelType;
    private final Map<String, Object> extraData;
    private final Map<String, Object> getstream;
    private final String messageId;
    private final Map<String, Object> metadata;

    public PushMessage(String messageId, String channelId, String channelType, Map<String, ? extends Object> getstream, Map<String, ? extends Object> extraData, Map<String, ? extends Object> metadata) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(getstream, "getstream");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(metadata, "metadata");
        this.messageId = messageId;
        this.channelId = channelId;
        this.channelType = channelType;
        this.getstream = getstream;
        this.extraData = extraData;
        this.metadata = metadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PushMessage copy$default(PushMessage pushMessage, String str, String str2, String str3, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pushMessage.messageId;
        }
        if ((i13 & 2) != 0) {
            str2 = pushMessage.channelId;
        }
        if ((i13 & 4) != 0) {
            str3 = pushMessage.channelType;
        }
        if ((i13 & 8) != 0) {
            map = pushMessage.getstream;
        }
        if ((i13 & 16) != 0) {
            map2 = pushMessage.extraData;
        }
        if ((i13 & 32) != 0) {
            map3 = pushMessage.metadata;
        }
        Map map4 = map2;
        Map map5 = map3;
        return pushMessage.copy(str, str2, str3, map, map4, map5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    public final Map<String, Object> component4() {
        return this.getstream;
    }

    public final Map<String, Object> component5() {
        return this.extraData;
    }

    public final Map<String, Object> component6() {
        return this.metadata;
    }

    public final PushMessage copy(String messageId, String channelId, String channelType, Map<String, ? extends Object> getstream, Map<String, ? extends Object> extraData, Map<String, ? extends Object> metadata) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(getstream, "getstream");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(metadata, "metadata");
        return new PushMessage(messageId, channelId, channelType, getstream, extraData, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushMessage)) {
            return false;
        }
        PushMessage pushMessage = (PushMessage) other;
        return AbstractC22676k.m65745e(this.messageId, pushMessage.messageId) && AbstractC22676k.m65745e(this.channelId, pushMessage.channelId) && AbstractC22676k.m65745e(this.channelType, pushMessage.channelType) && AbstractC22676k.m65745e(this.getstream, pushMessage.getstream) && AbstractC22676k.m65745e(this.extraData, pushMessage.extraData) && AbstractC22676k.m65745e(this.metadata, pushMessage.metadata);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Map<String, Object> getGetstream() {
        return this.getstream;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getType() {
        Object obj = this.extraData.get("type");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int hashCode() {
        return this.metadata.hashCode() + AbstractC3855a.m11821e(this.extraData, AbstractC3855a.m11821e(this.getstream, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.messageId.hashCode() * 31, 31, this.channelId), 31, this.channelType), 31), 31);
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.channelId;
        String str3 = this.channelType;
        Map<String, Object> map = this.getstream;
        Map<String, Object> map2 = this.extraData;
        Map<String, Object> map3 = this.metadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PushMessage(messageId=", str, ", channelId=", str2, ", channelType=");
        AbstractC36095b.m114695w(sbM32001t, str3, ", getstream=", map, ", extraData=");
        return AbstractC30802r.m94765n(sbM32001t, map2, ", metadata=", map3, ")");
    }
}

package io.getstream.chat.android.client.api2.model.requests;

import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/SendActionRequest;", "", "channel_id", "", "message_id", "type", "form_data", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getChannel_id", "()Ljava/lang/String;", "getMessage_id", "getType", "getForm_data", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SendActionRequest {
    private final String channel_id;
    private final Map<Object, Object> form_data;
    private final String message_id;
    private final String type;

    public SendActionRequest(String channel_id, String message_id, String type, Map<Object, ? extends Object> form_data) {
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(form_data, "form_data");
        this.channel_id = channel_id;
        this.message_id = message_id;
        this.type = type;
        this.form_data = form_data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendActionRequest copy$default(SendActionRequest sendActionRequest, String str, String str2, String str3, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sendActionRequest.channel_id;
        }
        if ((i13 & 2) != 0) {
            str2 = sendActionRequest.message_id;
        }
        if ((i13 & 4) != 0) {
            str3 = sendActionRequest.type;
        }
        if ((i13 & 8) != 0) {
            map = sendActionRequest.form_data;
        }
        return sendActionRequest.copy(str, str2, str3, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Map<Object, Object> component4() {
        return this.form_data;
    }

    public final SendActionRequest copy(String channel_id, String message_id, String type, Map<Object, ? extends Object> form_data) {
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(form_data, "form_data");
        return new SendActionRequest(channel_id, message_id, type, form_data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendActionRequest)) {
            return false;
        }
        SendActionRequest sendActionRequest = (SendActionRequest) other;
        return AbstractC22676k.m65745e(this.channel_id, sendActionRequest.channel_id) && AbstractC22676k.m65745e(this.message_id, sendActionRequest.message_id) && AbstractC22676k.m65745e(this.type, sendActionRequest.type) && AbstractC22676k.m65745e(this.form_data, sendActionRequest.form_data);
    }

    public final String getChannel_id() {
        return this.channel_id;
    }

    public final Map<Object, Object> getForm_data() {
        return this.form_data;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.form_data.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.channel_id.hashCode() * 31, 31, this.message_id), 31, this.type);
    }

    public String toString() {
        String str = this.channel_id;
        String str2 = this.message_id;
        return AbstractC30007c.m91842l(AbstractC11895b.m32001t("SendActionRequest(channel_id=", str, ", message_id=", str2, ", type="), this.type, ", form_data=", this.form_data, ")");
    }
}

package io.getstream.chat.android.client.notifications.parser;

import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.Map;
import l83.InterfaceC23462h;
import m83.C25272z;
import p292l1.C23091f0;
import p441qx.C30716i0;
import p441qx.C30722l0;
import p471rx.AbstractC31885f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR/\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;", "", "<init>", "()V", "", "json", "", "parse", "(Ljava/lang/String;)Ljava/util/Map;", "TAG", "Ljava/lang/String;", "Lcom/squareup/moshi/JsonAdapter;", "", "mapAdapter$delegate", "Ll83/h;", "getMapAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "mapAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamPayloadParser {
    private static final String TAG = "StreamPayloadParser";
    public static final StreamPayloadParser INSTANCE = new StreamPayloadParser();

    /* JADX INFO: renamed from: mapAdapter$delegate, reason: from kotlin metadata */
    private static final InterfaceC23462h mapAdapter = AbstractC30060g.m92088H(new C23091f0(18));

    private StreamPayloadParser() {
    }

    private final JsonAdapter<Map<String, Object>> getMapAdapter() {
        Object value = mapAdapter.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (JsonAdapter) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter mapAdapter_delegate$lambda$0() {
        return new C30722l0(new C30716i0()).m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), AbstractC31885f.f132390a, null);
    }

    public final Map<String, Object> parse(String json) {
        Map<String, Object> mapFromJson;
        C25272z c25272z = C25272z.f99163w;
        if (json != null) {
            try {
                String str = !AbstractC39414r.m125890i0(json) ? json : null;
                if (str != null && (mapFromJson = INSTANCE.getMapAdapter().fromJson(str)) != null) {
                    return mapFromJson;
                }
            } catch (Throwable th3) {
                C2343i c2343i = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
                    C2343i.f9271c.log(enumC2341g, TAG, "[parse] failed: ".concat(json), th3);
                }
            }
        }
        return c25272z;
    }
}

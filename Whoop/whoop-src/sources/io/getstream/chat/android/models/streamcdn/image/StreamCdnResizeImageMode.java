package io.getstream.chat.android.models.streamcdn.image;

import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;", "", "queryParameterName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getQueryParameterName", "()Ljava/lang/String;", "CLIP", "CROP", "FILL", "SCALE", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public enum StreamCdnResizeImageMode {
    CLIP("clip"),
    CROP(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_CROP_MODE),
    FILL("fill"),
    SCALE("scale");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String queryParameterName;

    StreamCdnResizeImageMode(String str) {
        this.queryParameterName = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getQueryParameterName() {
        return this.queryParameterName;
    }
}

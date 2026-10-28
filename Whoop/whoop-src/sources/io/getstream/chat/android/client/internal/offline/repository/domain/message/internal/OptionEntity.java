package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;", "", "id", "", "text", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getText", "getExtraData", "()Ljava/util/Map;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class OptionEntity {
    private final Map<String, Object> extraData;
    private final String id;
    private final String text;

    public OptionEntity(String id4, String text, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.text = text;
        this.extraData = extraData;
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
}

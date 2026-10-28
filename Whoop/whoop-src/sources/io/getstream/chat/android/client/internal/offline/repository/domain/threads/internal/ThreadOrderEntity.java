package io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;", "", "id", "", "order", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getOrder", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadOrderEntity {
    private final String id;
    private final List<String> order;

    public ThreadOrderEntity(String id4, List<String> order) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(order, "order");
        this.id = id4;
        this.order = order;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getOrder() {
        return this.order;
    }
}

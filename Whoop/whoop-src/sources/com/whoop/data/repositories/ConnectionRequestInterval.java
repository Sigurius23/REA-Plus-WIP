package com.whoop.data.repositories;

import io.getstream.chat.android.client.ChatClient;
import js0.AbstractC21907a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/data/repositories/ConnectionRequestInterval;", "Ljs0/a;", "", "<init>", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ConnectionRequestInterval extends AbstractC21907a<Long> {
    public static final ConnectionRequestInterval INSTANCE = new ConnectionRequestInterval();

    private ConnectionRequestInterval() {
        super("CONNECTION_REQUEST_INTERVAL_MILLIS", Long.valueOf(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT));
    }
}

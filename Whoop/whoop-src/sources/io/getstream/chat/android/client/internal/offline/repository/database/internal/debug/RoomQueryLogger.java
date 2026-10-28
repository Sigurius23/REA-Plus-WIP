package io.getstream.chat.android.client.internal.offline.repository.database.internal.debug;

import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/internal/debug/RoomQueryLogger;", "<init>", "()V", "", "sqlQuery", "", "", "bindArgs", "Ll83/a0;", "onQuery", "(Ljava/lang/String;Ljava/util/List;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RoomQueryLogger {
    public final void onQuery(String sqlQuery, List<? extends Object> bindArgs) {
        AbstractC22676k.m65750j(sqlQuery, "sqlQuery");
        AbstractC22676k.m65750j(bindArgs, "bindArgs");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, "Chat:RoomLog")) {
            C2343i.f9271c.log(enumC2341g, "Chat:RoomLog", "Query: " + sqlQuery + ", Args: " + bindArgs, null);
        }
    }
}

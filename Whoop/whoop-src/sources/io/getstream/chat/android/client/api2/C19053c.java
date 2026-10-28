package io.getstream.chat.android.client.api2;

import io.getstream.chat.android.client.api2.mapping.EventMapping;
import io.getstream.chat.android.client.api2.model.response.EventResponse;
import io.getstream.chat.android.client.api2.model.response.SyncHistoryResponse;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.api2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19053c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73743w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EventMapping f73744x;

    public /* synthetic */ C19053c(EventMapping eventMapping, int i13) {
        this.f73743w = i13;
        this.f73744x = eventMapping;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73743w) {
            case 0:
                return MoshiChatApi.sendEvent$lambda$94$lambda$93(this.f73744x, (EventResponse) obj);
            default:
                return MoshiChatApi.m54574M(this.f73744x, (SyncHistoryResponse) obj);
        }
    }
}

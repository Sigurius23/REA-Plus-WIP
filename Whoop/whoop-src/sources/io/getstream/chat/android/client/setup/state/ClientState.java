package io.getstream.chat.android.client.setup.state;

import com.whoop.service.network.model.UserState;
import ec3.InterfaceC13037f2;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/setup/state/ClientState;", "", "Lec3/f2;", "Lio/getstream/chat/android/models/InitializationState;", "getInitializationState", "()Lec3/f2;", "initializationState", "Lio/getstream/chat/android/models/User;", "getUser", UserState.Sources.USER, "Lio/getstream/chat/android/models/ConnectionState;", "getConnectionState", "connectionState", "", "isOnline", "()Z", "isOffline", "isConnecting", "isNetworkAvailable", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ClientState {
    InterfaceC13037f2 getConnectionState();

    InterfaceC13037f2 getInitializationState();

    InterfaceC13037f2 getUser();

    boolean isConnecting();

    boolean isNetworkAvailable();

    boolean isOffline();

    boolean isOnline();
}

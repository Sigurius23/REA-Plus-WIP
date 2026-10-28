package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.plugin.listeners.LiveLocationListener;
import io.getstream.chat.android.models.Location;
import java.util.List;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/LiveLocationListener;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "mutableGlobalState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V", "Lio/getstream/chat/android/models/Location;", "location", "Ln23/h;", "Ll83/a0;", "onUpdateLiveLocationPrecondition", "(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;", "", "result", "onQueryActiveLocationsResult", "(Ln23/h;Lq83/d;)Ljava/lang/Object;", "onUpdateLiveLocationResult", "(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onStopLiveLocationSharingResult", "onStartLiveLocationSharingResult", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LiveLocationListenerState implements LiveLocationListener {
    private final MutableGlobalState mutableGlobalState;

    public LiveLocationListenerState(MutableGlobalState mutableGlobalState) {
        AbstractC22676k.m65750j(mutableGlobalState, "mutableGlobalState");
        this.mutableGlobalState = mutableGlobalState;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onQueryActiveLocationsResult(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (abstractC26205h instanceof C26204g) {
            this.mutableGlobalState.addLiveLocations((List) ((C26204g) abstractC26205h).f103919a);
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onStartLiveLocationSharingResult(Location location, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (abstractC26205h instanceof C26204g) {
            this.mutableGlobalState.addLiveLocation((Location) ((C26204g) abstractC26205h).f103919a);
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onStopLiveLocationSharingResult(Location location, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (abstractC26205h instanceof C26204g) {
            this.mutableGlobalState.removeExpiredLiveLocations();
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onUpdateLiveLocationPrecondition(Location location, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onUpdateLiveLocationResult(Location location, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (abstractC26205h instanceof C26204g) {
            this.mutableGlobalState.addLiveLocation((Location) ((C26204g) abstractC26205h).f103919a);
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }
}

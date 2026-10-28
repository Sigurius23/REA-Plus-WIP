package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import io.getstream.chat.android.client.ChatClient;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"io/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView$pauseAudioPlayerListener$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onPause", "(Landroidx/lifecycle/g0;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AudioRecordingAttachmentsGroupView$pauseAudioPlayerListener$1 implements DefaultLifecycleObserver {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        super.onCreate(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        ChatClient.INSTANCE.instance().getAudioPlayer().pause();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}

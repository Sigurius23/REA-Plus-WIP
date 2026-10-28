package io.getstream.chat.android.client.channel;

import androidx.lifecycle.InterfaceC1585g0;
import io.getstream.chat.android.client.ChatEventListener;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.utils.observable.Disposable;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Arrays;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a6\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\n\u001aC\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\"\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\f0\u000b\"\n\u0012\u0006\b\u0001\u0012\u00020\u00000\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u000e\u001aK\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\f0\u000b\"\n\u0012\u0006\b\u0001\u0012\u00020\u00000\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u000f\u001a.\u0010\u0010\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/events/ChatEvent;", "T", "Lio/getstream/chat/android/client/channel/ChannelClient;", "Lio/getstream/chat/android/client/ChatEventListener;", "listener", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "subscribeFor", "(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "Landroidx/lifecycle/g0;", "lifecycleOwner", "(Lio/getstream/chat/android/client/channel/ChannelClient;Landroidx/lifecycle/g0;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "", "Lj93/d;", "eventTypes", "(Lio/getstream/chat/android/client/channel/ChannelClient;[Lj93/d;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "(Lio/getstream/chat/android/client/channel/ChannelClient;Landroidx/lifecycle/g0;[Lj93/d;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "subscribeForSingle", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelClientExtensionsKt {

    /* JADX WARN: Unknown type variable: T in type: io.getstream.chat.android.client.ChatEventListener<T> */
    /* JADX INFO: renamed from: io.getstream.chat.android.client.channel.ChannelClientExtensionsKt$subscribeFor$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 176)
    public static final class C190811<EventT extends ChatEvent> implements ChatEventListener {
        final /* synthetic */ ChatEventListener<T> $listener;

        /* JADX WARN: Unknown type variable: T in type: io.getstream.chat.android.client.ChatEventListener<T> */
        public C190811(ChatEventListener<T> chatEventListener) {
            this.$listener = chatEventListener;
        }

        @Override // io.getstream.chat.android.client.ChatEventListener
        public final void onEvent(ChatEvent event) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65756p();
            throw null;
        }
    }

    /* JADX WARN: Unknown type variable: T in type: io.getstream.chat.android.client.ChatEventListener<T> */
    /* JADX INFO: renamed from: io.getstream.chat.android.client.channel.ChannelClientExtensionsKt$subscribeFor$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 176)
    public static final class C190822<EventT extends ChatEvent> implements ChatEventListener {
        final /* synthetic */ ChatEventListener<T> $listener;

        /* JADX WARN: Unknown type variable: T in type: io.getstream.chat.android.client.ChatEventListener<T> */
        public C190822(ChatEventListener<T> chatEventListener) {
            this.$listener = chatEventListener;
        }

        @Override // io.getstream.chat.android.client.ChatEventListener
        public final void onEvent(ChatEvent event) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65756p();
            throw null;
        }
    }

    public static final Disposable subscribeFor(ChannelClient channelClient, InterfaceC21461d[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(channelClient, "<this>");
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        ArrayList arrayList = new ArrayList(eventTypes.length);
        for (InterfaceC21461d interfaceC21461d : eventTypes) {
            arrayList.add(AbstractC21598x.m60663S(interfaceC21461d));
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        return channelClient.subscribeFor((Class<? extends ChatEvent>[]) Arrays.copyOf(clsArr, clsArr.length), listener);
    }

    public static final <T extends ChatEvent> Disposable subscribeForSingle(ChannelClient channelClient, ChatEventListener<T> listener) {
        AbstractC22676k.m65750j(channelClient, "<this>");
        AbstractC22676k.m65750j(listener, "listener");
        AbstractC22676k.m65756p();
        throw null;
    }

    public static final Disposable subscribeFor(ChannelClient channelClient, InterfaceC1585g0 lifecycleOwner, InterfaceC21461d[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(channelClient, "<this>");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        ArrayList arrayList = new ArrayList(eventTypes.length);
        for (InterfaceC21461d interfaceC21461d : eventTypes) {
            arrayList.add(AbstractC21598x.m60663S(interfaceC21461d));
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        return channelClient.subscribeFor(lifecycleOwner, (Class<? extends ChatEvent>[]) Arrays.copyOf(clsArr, clsArr.length), listener);
    }

    public static final <T extends ChatEvent> Disposable subscribeFor(ChannelClient channelClient, InterfaceC1585g0 lifecycleOwner, ChatEventListener<T> listener) {
        AbstractC22676k.m65750j(channelClient, "<this>");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(listener, "listener");
        AbstractC22676k.m65756p();
        throw null;
    }

    public static final <T extends ChatEvent> Disposable subscribeFor(ChannelClient channelClient, ChatEventListener<T> listener) {
        AbstractC22676k.m65750j(channelClient, "<this>");
        AbstractC22676k.m65750j(listener, "listener");
        AbstractC22676k.m65756p();
        throw null;
    }
}

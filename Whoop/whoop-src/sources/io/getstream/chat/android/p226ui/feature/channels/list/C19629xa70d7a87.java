package io.getstream.chat.android.p226ui.feature.channels.list;

import android.graphics.drawable.Drawable;
import io.getstream.chat.android.models.Channel;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.list.ChannelListView$sam$io_getstream_chat_android_ui_feature_channels_list_ChannelListView_ChannelOptionIconProvider$0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19629xa70d7a87 implements ChannelListView.ChannelOptionIconProvider, InterfaceC22666f {
    private final /* synthetic */ Function1 function;

    public C19629xa70d7a87(Function1 function) {
        AbstractC22676k.m65750j(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ChannelListView.ChannelOptionIconProvider) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelOptionIconProvider, p715kotlin.jvm.functions.Function1
    public final /* synthetic */ Drawable invoke(Channel channel) {
        return (Drawable) this.function.invoke(channel);
    }
}

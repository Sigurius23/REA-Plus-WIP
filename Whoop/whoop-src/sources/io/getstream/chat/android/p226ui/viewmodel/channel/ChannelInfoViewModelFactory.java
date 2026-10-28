package io.getstream.chat.android.p226ui.viewmodel.channel;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import io.getstream.chat.android.p226ui.common.state.channel.info.ChannelInfoViewState;
import j93.InterfaceC21461d;
import p000.C28503p;
import p298l8.AbstractC23420c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModelFactory;", "Landroidx/lifecycle/a2;", "", "cid", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "", "optionFilter", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoViewModelFactory implements InterfaceC1563a2 {
    private final String cid;
    private final Function1 optionFilter;

    public ChannelInfoViewModelFactory(String cid, Function1 optionFilter) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(optionFilter, "optionFilter");
        this.cid = cid;
        this.optionFilter = optionFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(ChannelInfoViewState.Content.Option it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(InterfaceC21461d interfaceC21461d, AbstractC23420c abstractC23420c) {
        return (T) super.create(interfaceC21461d, abstractC23420c);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> cls, AbstractC23420c abstractC23420c) {
        return (T) super.create(cls, abstractC23420c);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        if (modelClass.equals(ChannelInfoViewModel.class)) {
            return new ChannelInfoViewModel(this.cid, this.optionFilter, null, 4, null);
        }
        throw new IllegalArgumentException("ChannelInfoViewModelFactory can only create instances of ChannelInfoViewModel");
    }

    public /* synthetic */ ChannelInfoViewModelFactory(String str, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? new C28503p(5) : function1);
    }
}

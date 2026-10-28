package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1585g0;
import j93.InterfaceC21461d;
import p298l8.AbstractC23420c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"io/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1", "Landroidx/lifecycle/a2;", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AllPollOptionsDialogFragment$viewModel$2$1 implements InterfaceC1563a2 {
    final /* synthetic */ AllPollOptionsDialogFragment this$0;

    public AllPollOptionsDialogFragment$viewModel$2$1(AllPollOptionsDialogFragment allPollOptionsDialogFragment) {
        this.this$0 = allPollOptionsDialogFragment;
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
        String string = this.this$0.requireArguments().getString("message_id");
        AbstractC22676k.m65747g(string);
        String string2 = this.this$0.requireArguments().getString("channel_id");
        AbstractC22676k.m65747g(string2);
        String string3 = this.this$0.requireArguments().getString("channel_type");
        AbstractC22676k.m65747g(string3);
        InterfaceC1585g0 viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return new AllPollOptionsDialogFragment.AllPollOptionsViewModel(null, string, string2, string3, AbstractC1613o1.m5020j(viewLifecycleOwner), 1, null);
    }
}

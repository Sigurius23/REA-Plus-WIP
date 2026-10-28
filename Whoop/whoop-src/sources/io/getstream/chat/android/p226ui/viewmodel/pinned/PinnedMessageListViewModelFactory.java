package io.getstream.chat.android.p226ui.viewmodel.pinned;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import io.getstream.chat.android.p226ui.common.feature.pinned.PinnedMessageListController;
import j93.InterfaceC21461d;
import p298l8.AbstractC23420c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory;", "Landroidx/lifecycle/a2;", "", "cid", "<init>", "(Ljava/lang/String;)V", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "Ljava/lang/String;", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PinnedMessageListViewModelFactory implements InterfaceC1563a2 {
    private final String cid;

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory$Builder;", "", "<init>", "()V", "", "cid", "(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory$Builder;", "Landroidx/lifecycle/a2;", "build", "()Landroidx/lifecycle/a2;", "Ljava/lang/String;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private String cid;

        public final InterfaceC1563a2 build() {
            String str = this.cid;
            if (str != null) {
                return new PinnedMessageListViewModelFactory(str);
            }
            throw new IllegalStateException("Channel cid should not be null");
        }

        public final Builder cid(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            this.cid = cid;
            return this;
        }
    }

    public PinnedMessageListViewModelFactory(String str) {
        this.cid = str;
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
        if (this.cid != null) {
            if (modelClass.equals(PinnedMessageListViewModel.class)) {
                return new PinnedMessageListViewModel(new PinnedMessageListController(this.cid, null, 2, null));
            }
            throw new IllegalArgumentException("PinnedMessageListViewModelFactory can only create instances of PinnedMessageListViewModel");
        }
        throw new IllegalArgumentException("Channel cid should not be null");
    }
}

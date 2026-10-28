package io.getstream.chat.android.p226ui.viewmodel.mentions;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.querysort.QuerySorter;
import j93.InterfaceC21461d;
import p298l8.AbstractC23420c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModelFactory;", "Landroidx/lifecycle/a2;", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Message;", "sort", "<init>", "(Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MentionListViewModelFactory implements InterfaceC1563a2 {
    private final QuerySorter<Message> sort;

    /* JADX WARN: Multi-variable type inference failed */
    public MentionListViewModelFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(InterfaceC21461d interfaceC21461d, AbstractC23420c abstractC23420c) {
        return (T) super.create(interfaceC21461d, abstractC23420c);
    }

    public MentionListViewModelFactory(QuerySorter<Message> querySorter) {
        this.sort = querySorter;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> cls, AbstractC23420c abstractC23420c) {
        return (T) super.create(cls, abstractC23420c);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        if (modelClass.equals(MentionListViewModel.class)) {
            return new MentionListViewModel(this.sort, null, 2, null);
        }
        throw new IllegalArgumentException("MentionListViewModelFactory can only create instances of MentionListViewModel");
    }

    public /* synthetic */ MentionListViewModelFactory(QuerySorter querySorter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : querySorter);
    }
}

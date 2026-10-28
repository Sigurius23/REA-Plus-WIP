package io.getstream.chat.android.p226ui.feature.messages.list;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.MessageListView$configureAttributes$lambda$109$lambda$107$lambda$106$$inlined$filterIsInstance$1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19723x27b37ffa implements Function1 {
    public static final C19723x27b37ffa INSTANCE = new C19723x27b37ffa();

    @Override // p715kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof MessageListItem.MessageItem);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(obj instanceof MessageListItem.MessageItem);
    }
}

package io.getstream.chat.android.p226ui.common.utils;

import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a2\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, m65681d2 = {"emptyExpandableList", "Lio/getstream/chat/android/ui/common/utils/ExpandableList;", "T", "canExpand", "", "items", "", "minimumVisibleItems", "", "visibleItems", "isCollapsed", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ExpandableListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canExpand(List<?> list, int i13) {
        return list.size() > i13;
    }

    public static final <T> ExpandableList<T> emptyExpandableList() {
        return new ExpandableList<>(C25271y.f99162w, 0, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> visibleItems(List<? extends T> list, int i13, boolean z4) {
        return (z4 && canExpand(list, i13)) ? AbstractC25265s.m74156w1(list, i13) : list;
    }
}

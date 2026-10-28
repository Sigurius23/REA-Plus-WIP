package io.getstream.chat.android.p226ui.common.extensions.internal;

import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.RecyclerView;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroidx/recyclerview/widget/o2;", "VH", "Landroidx/recyclerview/widget/i1;", "A", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/Function1;", "Ll83/a0;", "action", "doForAllViewHolders", "(Landroidx/recyclerview/widget/i1;Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RecyclerViewKt {
    public static final <VH extends AbstractC1717o2, A extends AbstractC1692i1> void doForAllViewHolders(A a5, RecyclerView recyclerView, Function1 action) {
        AbstractC22676k.m65750j(a5, "<this>");
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        AbstractC22676k.m65750j(action, "action");
        int itemCount = a5.getDisplayCount();
        for (int i13 = 0; i13 < itemCount; i13++) {
            AbstractC1717o2 abstractC1717o2FindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i13);
            if (abstractC1717o2FindViewHolderForAdapterPosition == null) {
                abstractC1717o2FindViewHolderForAdapterPosition = null;
            }
            if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                action.invoke(abstractC1717o2FindViewHolderForAdapterPosition);
            }
        }
    }
}

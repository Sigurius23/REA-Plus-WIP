package io.getstream.chat.android.p226ui.widgets.internal;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import io.getstream.chat.android.ui.widgets.internal.SimpleListAdapter.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005:\u0001 B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0007J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u0001H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0013¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;", "", "T", "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;", "VH", "Landroidx/recyclerview/widget/i1;", "<init>", "()V", "", "getItemCount", "()I", "holder", "position", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;I)V", "", "items", "setItems", "(Ljava/util/List;)V", "item", "removeItem", "(Ljava/lang/Object;)V", "clear", "onViewRecycled", "(Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;)V", "", "itemList", "Ljava/util/List;", "getItemList", "()Ljava/util/List;", "setItemList", "ViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class SimpleListAdapter<T, VH extends ViewHolder<T>> extends AbstractC1692i1 {
    private List<T> itemList = new ArrayList();

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;", "", "T", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "item", "Ll83/a0;", "bind", "(Ljava/lang/Object;)V", "unbind", "()V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class ViewHolder<T> extends AbstractC1717o2 {
        private final Context context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View itemView) {
            super(itemView);
            AbstractC22676k.m65750j(itemView, "itemView");
            Context context = itemView.getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            this.context = context;
        }

        public abstract void bind(T item);

        public final Context getContext() {
            return this.context;
        }

        public void unbind() {
        }
    }

    public final void clear() {
        this.itemList.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemCount() {
        return this.itemList.size();
    }

    public final List<T> getItemList() {
        return this.itemList;
    }

    public final void removeItem(T item) {
        AbstractC22676k.m65750j(item, "item");
        int iIndexOf = this.itemList.indexOf(item);
        if (iIndexOf != -1) {
            this.itemList.remove(item);
            notifyItemRemoved(iIndexOf);
        }
    }

    public final void setItemList(List<T> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.itemList = list;
    }

    public final void setItems(List<? extends T> items) {
        AbstractC22676k.m65750j(items, "items");
        this.itemList.clear();
        this.itemList.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(VH holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.bind(this.itemList.get(position));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onViewRecycled(VH holder) {
        AbstractC22676k.m65750j(holder, "holder");
        super.onViewRecycled((AbstractC1717o2) holder);
        holder.unbind();
    }
}

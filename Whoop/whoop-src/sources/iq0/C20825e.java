package iq0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.List;
import lq0.C24654b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iq0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Liq0/e;", "Landroidx/recyclerview/widget/i1;", "Llq0/b;", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/User;", "Ll83/a0;", "onMentionClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "items", "setItems", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "c", "(Landroid/view/ViewGroup;I)Llq0/b;", "getItemCount", "()I", "holder", "position", "b", "(Llq0/b;I)V", "a", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "users", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20825e extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onMentionClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<User> users;

    public C20825e(Function1 onMentionClick) {
        AbstractC22676k.m65750j(onMentionClick, "onMentionClick");
        this.onMentionClick = onMentionClick;
        this.users = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m57441d(C24654b c24654b, C20825e c20825e, View view) {
        int bindingAdapterPosition = c24654b.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            c20825e.onMentionClick.invoke(c20825e.users.get(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C24654b holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.bind(this.users.get(position));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C24654b onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        C24654b c24654b = new C24654b(parent, null, 2, 0 == true ? 1 : 0);
        c24654b.itemView.setOnClickListener(new ViewOnClickListenerC20817a(this, c24654b, 1));
        return c24654b;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getDisplayCount() {
        return this.users.size();
    }

    public final void setItems(List<User> items) {
        AbstractC22676k.m65750j(items, "items");
        this.users.clear();
        this.users.addAll(items);
        notifyDataSetChanged();
    }
}

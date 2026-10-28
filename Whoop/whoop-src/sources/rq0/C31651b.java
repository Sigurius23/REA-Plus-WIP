package rq0;

import android.content.Context;
import androidx.recyclerview.widget.C1668c2;
import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.LinearLayoutManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lrq0/b;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/c2;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/k2;", "state", "Ll83/a0;", "onLayoutChildren", "(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C31651b extends LinearLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31651b(Context context) {
        super(1);
        AbstractC22676k.m65750j(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public void onLayoutChildren(C1668c2 recycler, C1701k2 state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e5) {
            System.out.print((Object) e5.getMessage());
        }
    }
}

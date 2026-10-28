package com.whoop.realtime.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k52.AbstractC22209e;
import lm2.InterfaceC24516b;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e¨\u0006 "}, m65681d2 = {"Lcom/whoop/realtime/presentation/a;", "Landroidx/recyclerview/widget/i1;", "Lcom/whoop/realtime/presentation/g;", "", "Lcom/whoop/realtime/presentation/c;", "initialLists", "Lkotlin/Function1;", "Lcom/whoop/realtime/presentation/c$a;", "Ll83/a0;", "onClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "b", "(Landroid/view/ViewGroup;I)Lcom/whoop/realtime/presentation/g;", "holder", "position", "a", "(Lcom/whoop/realtime/presentation/g;I)V", "getItemCount", "()I", "Llm2/b;", "newActivity", "c", "(Llm2/b;)V", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "lists", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9877a extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<List<AbstractC9879c>> lists;

    public C9877a(List<? extends List<? extends AbstractC9879c>> initialLists, Function1 onClick) {
        AbstractC22676k.m65750j(initialLists, "initialLists");
        AbstractC22676k.m65750j(onClick, "onClick");
        this.onClick = onClick;
        this.lists = AbstractC25265s.m74097F1(initialLists);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C9883g holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m24025a(this.lists.get(position));
        holder.getRecyclerView().setTag("category-" + position);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9883g onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(AbstractC22209e.f86403o, parent, false);
        AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        return new C9883g((RecyclerView) viewInflate, this.onClick);
    }

    /* JADX INFO: renamed from: c */
    public final void m24007c(InterfaceC24516b newActivity) {
        AbstractC22676k.m65750j(newActivity, "newActivity");
        List<List<AbstractC9879c>> list = this.lists;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Object> list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (Object objM24012b : list2) {
                AbstractC9879c.a aVar = objM24012b instanceof AbstractC9879c.a ? (AbstractC9879c.a) objM24012b : null;
                if (aVar != null) {
                    objM24012b = AbstractC9879c.a.m24012b(aVar, null, AbstractC22676k.m65745e(aVar.getActivity(), newActivity), 1, null);
                }
                arrayList2.add(objM24012b);
            }
            arrayList.add(arrayList2);
        }
        this.lists.clear();
        AbstractC25265s.m74141p0(this.lists, arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getDisplayCount() {
        return this.lists.size();
    }
}

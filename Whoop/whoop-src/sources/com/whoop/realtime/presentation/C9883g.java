package com.whoop.realtime.presentation;

import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/realtime/presentation/g;", "Landroidx/recyclerview/widget/o2;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/Function1;", "Lcom/whoop/realtime/presentation/c$a;", "Ll83/a0;", "onClick", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V", "", "Lcom/whoop/realtime/presentation/c;", "list", "a", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView;", "b", "()Landroidx/recyclerview/widget/RecyclerView;", "Lcom/whoop/realtime/presentation/b;", "Lcom/whoop/realtime/presentation/b;", "adapter", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9883g extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final RecyclerView recyclerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9878b adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9883g(RecyclerView recyclerView, Function1 onClick) {
        super(recyclerView);
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        AbstractC22676k.m65750j(onClick, "onClick");
        this.recyclerView = recyclerView;
        C9878b c9878b = new C9878b(new ArrayList(), onClick);
        this.adapter = c9878b;
        recyclerView.setAdapter(c9878b);
    }

    /* JADX INFO: renamed from: a */
    public final void m24025a(List<? extends AbstractC9879c> list) {
        AbstractC22676k.m65750j(list, "list");
        List<AbstractC9879c> listM24009a = this.adapter.m24009a();
        listM24009a.clear();
        listM24009a.addAll(list);
        this.adapter.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }
}

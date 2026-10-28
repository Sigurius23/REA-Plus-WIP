package com.whoop.realtime.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import java.util.List;
import k52.AbstractC22209e;
import o52.AbstractC27541a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/realtime/presentation/b;", "Landroidx/recyclerview/widget/i1;", "Lo52/a;", "", "Lcom/whoop/realtime/presentation/c;", "activityListItems", "Lkotlin/Function1;", "Lcom/whoop/realtime/presentation/c$a;", "Ll83/a0;", "onClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "c", "(Landroid/view/ViewGroup;I)Lo52/a;", "holder", "position", "b", "(Lo52/a;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "a", "Ljava/util/List;", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C9878b extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<AbstractC9879c> activityListItems;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 onClick;

    public C9878b(List<AbstractC9879c> activityListItems, Function1 onClick) {
        AbstractC22676k.m65750j(activityListItems, "activityListItems");
        AbstractC22676k.m65750j(onClick, "onClick");
        this.activityListItems = activityListItems;
        this.onClick = onClick;
    }

    /* JADX INFO: renamed from: a */
    public final List<AbstractC9879c> m24009a() {
        return this.activityListItems;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbstractC27541a holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.mo24021a(this.activityListItems.get(position));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC27541a onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == 0) {
            View viewInflate = layoutInflaterFrom.inflate(AbstractC22209e.f86398j, parent, false);
            AbstractC22676k.m65749i(viewInflate, "inflate(...)");
            return new C9880d(viewInflate, this.onClick);
        }
        if (viewType == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(AbstractC22209e.f86404p, parent, false);
            AbstractC22676k.m65749i(viewInflate2, "inflate(...)");
            return new C9884h(viewInflate2);
        }
        if (viewType == 2) {
            View viewInflate3 = layoutInflaterFrom.inflate(AbstractC22209e.f86406r, parent, false);
            AbstractC22676k.m65749i(viewInflate3, "inflate(...)");
            return new C9891o(viewInflate3);
        }
        if (viewType != 3) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(viewType, "unknown viewType "));
        }
        View viewInflate4 = layoutInflaterFrom.inflate(AbstractC22209e.f86405q, parent, false);
        AbstractC22676k.m65749i(viewInflate4, "inflate(...)");
        return new C9890n(viewInflate4);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getDisplayCount() {
        return this.activityListItems.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public int getItemViewType(int position) {
        AbstractC9879c abstractC9879c = this.activityListItems.get(position);
        if (abstractC9879c instanceof AbstractC9879c.a) {
            return 0;
        }
        if (abstractC9879c instanceof AbstractC9879c.b) {
            return 1;
        }
        if (abstractC9879c instanceof AbstractC9879c.d) {
            return 2;
        }
        if (abstractC9879c instanceof AbstractC9879c.c) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}

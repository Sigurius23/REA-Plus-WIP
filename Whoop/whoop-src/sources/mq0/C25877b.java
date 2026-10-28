package mq0;

import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bq0.C3546b;
import com.whoop.data.local.prefs.PreferenceHelper;
import eq0.AbstractC13496m;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lmq0/b;", "Landroidx/recyclerview/widget/o2;", "Leq0/m;", "categoryItemViewBinding", "Lkotlin/Function1;", "Liq0/t;", "Ll83/a0;", "widgetOnClickListener", "<init>", "(Leq0/m;Lkotlin/jvm/functions/Function1;)V", "Lbq0/b;", "dataWidget", "Ll83/k;", "", "authHeader", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "a", "(Lbq0/b;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V", "Leq0/m;", "b", "Lkotlin/jvm/functions/Function1;", "Lmq0/f;", "c", "Lmq0/f;", "dataWidgetImageAdapter", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25877b extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC13496m categoryItemViewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 widgetOnClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25881f dataWidgetImageAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25877b(AbstractC13496m categoryItemViewBinding, Function1 widgetOnClickListener) {
        super(categoryItemViewBinding.getRoot());
        AbstractC22676k.m65750j(categoryItemViewBinding, "categoryItemViewBinding");
        AbstractC22676k.m65750j(widgetOnClickListener, "widgetOnClickListener");
        this.categoryItemViewBinding = categoryItemViewBinding;
        this.widgetOnClickListener = widgetOnClickListener;
    }

    /* JADX INFO: renamed from: a */
    public final void m76484a(C3546b dataWidget, C23465k authHeader, PreferenceHelper preferenceHelper) {
        AbstractC22676k.m65750j(dataWidget, "dataWidget");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        this.dataWidgetImageAdapter = new C25881f(dataWidget.m10581b(), authHeader, this.widgetOnClickListener, preferenceHelper);
        this.itemView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        AbstractC13496m abstractC13496m = this.categoryItemViewBinding;
        abstractC13496m.f47457b.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView = abstractC13496m.f47457b;
        C25881f c25881f = this.dataWidgetImageAdapter;
        if (c25881f == null) {
            AbstractC22676k.m65757q("dataWidgetImageAdapter");
            throw null;
        }
        recyclerView.setAdapter(c25881f);
        abstractC13496m.f47456a.setText(this.categoryItemViewBinding.getRoot().getContext().getString(dataWidget.getWidgetType()));
    }
}

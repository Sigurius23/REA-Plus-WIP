package mq0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import bq0.C3546b;
import com.whoop.data.local.prefs.PreferenceHelper;
import eq0.AbstractC13496m;
import java.util.List;
import l83.C23465k;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001d\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010!R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lmq0/a;", "Landroidx/recyclerview/widget/i1;", "Lmq0/b;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lkotlin/Function1;", "Liq0/t;", "Ll83/a0;", "widgetOnClickListener", "<init>", "(Lcom/whoop/data/local/prefs/PreferenceHelper;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "b", "(Landroid/view/ViewGroup;I)Lmq0/b;", "getItemCount", "()I", "holderDataWidget", "position", "a", "(Lmq0/b;I)V", "", "Lbq0/b;", "dataWidgets", "Ll83/k;", "", "authHeader", "c", "(Ljava/util/List;Ll83/k;)V", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "d", "Ll83/k;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25876a extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 widgetOnClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private List<C3546b> dataWidgets;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C23465k authHeader;

    public C25876a(PreferenceHelper preferenceHelper, Function1 widgetOnClickListener) {
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(widgetOnClickListener, "widgetOnClickListener");
        this.preferenceHelper = preferenceHelper;
        this.widgetOnClickListener = widgetOnClickListener;
        this.dataWidgets = C25271y.f99162w;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C25877b holderDataWidget, int position) {
        AbstractC22676k.m65750j(holderDataWidget, "holderDataWidget");
        holderDataWidget.m76484a(this.dataWidgets.get(position), this.authHeader, this.preferenceHelper);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C25877b onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC13496m abstractC13496mM38212c = AbstractC13496m.m38212c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC22676k.m65749i(abstractC13496mM38212c, "inflate(...)");
        return new C25877b(abstractC13496mM38212c, this.widgetOnClickListener);
    }

    /* JADX INFO: renamed from: c */
    public final void m76483c(List<C3546b> dataWidgets, C23465k authHeader) {
        AbstractC22676k.m65750j(dataWidgets, "dataWidgets");
        this.dataWidgets = dataWidgets;
        this.authHeader = authHeader;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getPageCount() {
        return this.dataWidgets.size();
    }
}

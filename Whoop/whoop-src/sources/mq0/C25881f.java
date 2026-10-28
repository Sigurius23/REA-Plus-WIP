package mq0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import bq0.C3547c;
import com.whoop.data.local.prefs.PreferenceHelper;
import eq0.AbstractC13492l0;
import java.util.List;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mq0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lmq0/f;", "Landroidx/recyclerview/widget/i1;", "Lmq0/g;", "", "Lbq0/c;", "dataWidgetImages", "Ll83/k;", "", "authHeader", "Lkotlin/Function1;", "Liq0/t;", "Ll83/a0;", "widgetOnClickListener", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "<init>", "(Ljava/util/List;Ll83/k;Lkotlin/jvm/functions/Function1;Lcom/whoop/data/local/prefs/PreferenceHelper;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "b", "(Landroid/view/ViewGroup;I)Lmq0/g;", "getItemCount", "()I", "holderImage", "position", "a", "(Lmq0/g;I)V", "Ljava/util/List;", "Ll83/k;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25881f extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C3547c> dataWidgetImages;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C23465k authHeader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 widgetOnClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    public C25881f(List<C3547c> dataWidgetImages, C23465k c23465k, Function1 widgetOnClickListener, PreferenceHelper preferenceHelper) {
        AbstractC22676k.m65750j(dataWidgetImages, "dataWidgetImages");
        AbstractC22676k.m65750j(widgetOnClickListener, "widgetOnClickListener");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        this.dataWidgetImages = dataWidgetImages;
        this.authHeader = c23465k;
        this.widgetOnClickListener = widgetOnClickListener;
        this.preferenceHelper = preferenceHelper;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C25882g holderImage, int position) {
        AbstractC22676k.m65750j(holderImage, "holderImage");
        holderImage.m76512c(this.dataWidgetImages.get(position), this.authHeader, this.preferenceHelper);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C25882g onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC13492l0 abstractC13492l0M38208c = AbstractC13492l0.m38208c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC22676k.m65749i(abstractC13492l0M38208c, "inflate(...)");
        return new C25882g(abstractC13492l0M38208c, this.widgetOnClickListener);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getPageCount() {
        return this.dataWidgetImages.size();
    }
}

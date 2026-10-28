package pq0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.domain.model.teams.Widget;
import eq0.AbstractC13540u3;
import java.util.List;
import l83.C23465k;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pq0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010 R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006#"}, m65681d2 = {"Lpq0/j;", "Landroidx/recyclerview/widget/i1;", "Lpq0/k;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "<init>", "(Lcom/whoop/data/local/prefs/PreferenceHelper;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "c", "(Landroid/view/ViewGroup;I)Lpq0/k;", "holder", "position", "Ll83/a0;", "b", "(Lpq0/k;I)V", "getItemCount", "()I", "", "Lcom/whoop/domain/model/teams/Widget;", "globalWidgets", "Ll83/k;", "", "authHeader", "d", "(Ljava/util/List;Ll83/k;)V", "page", "a", "(I)Ljava/lang/String;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "Ljava/util/List;", "widgets", "Ll83/k;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29475j extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<Widget> widgets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C23465k authHeader;

    public C29475j(PreferenceHelper preferenceHelper) {
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        this.preferenceHelper = preferenceHelper;
        this.widgets = C25271y.f99162w;
    }

    /* JADX INFO: renamed from: a */
    public final String m90009a(int page) {
        return !this.widgets.isEmpty() ? this.widgets.get(page).getCollection().name() : "";
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C29476k holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m90013a(this.widgets.get(position), this.authHeader, this.preferenceHelper);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C29476k onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC13540u3 abstractC13540u3M38257c = AbstractC13540u3.m38257c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC22676k.m65749i(abstractC13540u3M38257c, "inflate(...)");
        return new C29476k(abstractC13540u3M38257c);
    }

    /* JADX INFO: renamed from: d */
    public final void m90012d(List<Widget> globalWidgets, C23465k authHeader) {
        AbstractC22676k.m65750j(globalWidgets, "globalWidgets");
        this.widgets = globalWidgets;
        this.authHeader = authHeader;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getDisplayCount() {
        return this.widgets.size();
    }
}

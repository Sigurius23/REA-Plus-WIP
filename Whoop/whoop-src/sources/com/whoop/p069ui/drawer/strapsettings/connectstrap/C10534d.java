package com.whoop.p069ui.drawer.strapsettings.connectstrap;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import hi0.AbstractC17307e;
import hi0.AbstractC17308f;
import hi0.AbstractC17312j;
import or2.AbstractC28146a2;
import p312lx.AbstractC24780a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qm2.C30502s;

/* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;", "Llx/a;", "Lqm2/s;", "Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "itemType", "h0", "(Landroid/view/ViewGroup;I)Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;", "viewHolder", "scanResult", "position", "Ll83/a0;", "g0", "(Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;Lqm2/s;I)V", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10534d extends AbstractC24780a {

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.d$a */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;", "Lor2/a2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "setText", "(Landroid/widget/TextView;)V", "text", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC28146a2 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private TextView text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            AbstractC22676k.m65750j(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(AbstractC17307e.f66720d1);
            AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
            this.text = (TextView) viewFindViewById;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getText() {
            return this.text;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public /* bridge */ boolean m27140c0(C30502s c30502s) {
        return super.contains(c30502s);
    }

    @Override // p312lx.AbstractC24780a, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof C30502s) {
            return m27140c0((C30502s) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public /* bridge */ int m27141d0() {
        return super.size();
    }

    /* JADX INFO: renamed from: e0 */
    public /* bridge */ int m27142e0(C30502s c30502s) {
        return super.indexOf(c30502s);
    }

    /* JADX INFO: renamed from: f0 */
    public /* bridge */ int m27143f0(C30502s c30502s) {
        return super.lastIndexOf(c30502s);
    }

    @Override // mx.AbstractC25990c
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void mo27138L(a viewHolder, C30502s scanResult, int position) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(scanResult, "scanResult");
        TextView text = viewHolder.getText();
        String name = scanResult.getName();
        if (name == null) {
            name = "";
        }
        if (name.length() == 0) {
            name = viewHolder.getContext().getString(AbstractC17312j.f67010o1);
            AbstractC22676k.m65749i(name, "getString(...)");
        }
        text.setText(name);
    }

    @Override // mx.AbstractC25990c
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public a mo27139M(ViewGroup parent, int itemType) {
        AbstractC22676k.m65750j(parent, "parent");
        View viewM77127z = m77127z(parent, AbstractC17308f.f66893o);
        AbstractC22676k.m65749i(viewM77127z, "inflateView(...)");
        return new a(viewM77127z);
    }

    /* JADX INFO: renamed from: i0 */
    public /* bridge */ boolean m27146i0(C30502s c30502s) {
        return super.remove(c30502s);
    }

    @Override // p312lx.AbstractC24780a, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof C30502s) {
            return m27142e0((C30502s) obj);
        }
        return -1;
    }

    @Override // p312lx.AbstractC24780a, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof C30502s) {
            return m27143f0((C30502s) obj);
        }
        return -1;
    }

    @Override // p312lx.AbstractC24780a, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof C30502s) {
            return m27146i0((C30502s) obj);
        }
        return false;
    }

    @Override // p312lx.AbstractC24780a, java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m27141d0();
    }
}

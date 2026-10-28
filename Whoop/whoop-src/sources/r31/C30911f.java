package r31;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: r31.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\r\u0010\u000eJj\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001e\u0010%¨\u0006*"}, m65681d2 = {"Lr31/f;", "Lm91/u;", "", "id", "title", "Lr31/e;", NotificationCompat.CATEGORY_STATUS, "", "items", "button", "", "selectedIds", "allSelectionIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lr31/e;Ljava/util/List;Lm91/u;Ljava/util/List;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lr31/e;Ljava/util/List;Lm91/u;Ljava/util/List;Ljava/util/List;)Lr31/f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lr31/e;", "g", "()Lr31/e;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lm91/u;", "()Lm91/u;", "getSelectedIds", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30911f implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f127478h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC30910e status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC25312u button;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<Integer> selectedIds;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<Integer> allSelectionIds;

    /* JADX WARN: Multi-variable type inference failed */
    public C30911f(String id4, String title, EnumC30910e status, List<? extends InterfaceC25312u> items, InterfaceC25312u interfaceC25312u, List<Integer> selectedIds, List<Integer> allSelectionIds) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(selectedIds, "selectedIds");
        AbstractC22676k.m65750j(allSelectionIds, "allSelectionIds");
        this.id = id4;
        this.title = title;
        this.status = status;
        this.items = items;
        this.button = interfaceC25312u;
        this.selectedIds = selectedIds;
        this.allSelectionIds = allSelectionIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C30911f m95031b(C30911f c30911f, String str, String str2, EnumC30910e enumC30910e, List list, InterfaceC25312u interfaceC25312u, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c30911f.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c30911f.title;
        }
        if ((i13 & 4) != 0) {
            enumC30910e = c30911f.status;
        }
        if ((i13 & 8) != 0) {
            list = c30911f.items;
        }
        if ((i13 & 16) != 0) {
            interfaceC25312u = c30911f.button;
        }
        if ((i13 & 32) != 0) {
            list2 = c30911f.selectedIds;
        }
        if ((i13 & 64) != 0) {
            list3 = c30911f.allSelectionIds;
        }
        List list4 = list2;
        List list5 = list3;
        InterfaceC25312u interfaceC25312u2 = interfaceC25312u;
        EnumC30910e enumC30910e2 = enumC30910e;
        return c30911f.m95032a(str, str2, enumC30910e2, list, interfaceC25312u2, list4, list5);
    }

    /* JADX INFO: renamed from: a */
    public final C30911f m95032a(String id4, String title, EnumC30910e status, List<? extends InterfaceC25312u> items, InterfaceC25312u button, List<Integer> selectedIds, List<Integer> allSelectionIds) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(selectedIds, "selectedIds");
        AbstractC22676k.m65750j(allSelectionIds, "allSelectionIds");
        return new C30911f(id4, title, status, items, button, selectedIds, allSelectionIds);
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m95033c() {
        return this.allSelectionIds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getButton() {
        return this.button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30911f)) {
            return false;
        }
        C30911f c30911f = (C30911f) other;
        return AbstractC22676k.m65745e(this.id, c30911f.id) && AbstractC22676k.m65745e(this.title, c30911f.title) && this.status == c30911f.status && AbstractC22676k.m65745e(this.items, c30911f.items) && AbstractC22676k.m65745e(this.button, c30911f.button) && AbstractC22676k.m65745e(this.selectedIds, c30911f.selectedIds) && AbstractC22676k.m65745e(this.allSelectionIds, c30911f.allSelectionIds);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC25312u> m95035f() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC30910e getStatus() {
        return this.status;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.status.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title)) * 31, 31, this.items);
        InterfaceC25312u interfaceC25312u = this.button;
        return this.allSelectionIds.hashCode() + AbstractC11895b.m31983b((iM31983b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, 31, this.selectedIds);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        EnumC30910e enumC30910e = this.status;
        List<InterfaceC25312u> list = this.items;
        InterfaceC25312u interfaceC25312u = this.button;
        List<Integer> list2 = this.selectedIds;
        List<Integer> list3 = this.allSelectionIds;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SelectionWidgetViewState(id=", str, ", title=", str2, ", status=");
        sbM32001t.append(enumC30910e);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", button=");
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(", selectedIds=");
        sbM32001t.append(list2);
        sbM32001t.append(", allSelectionIds=");
        return AbstractC3855a.m11829m(sbM32001t, list3, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C30911f(String str, String str2, EnumC30910e enumC30910e, List list, InterfaceC25312u interfaceC25312u, List list2, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 32;
        C25271y c25271y = C25271y.f99162w;
        this(str, str2, enumC30910e, list, interfaceC25312u, i14 != 0 ? c25271y : list2, (i13 & 64) != 0 ? c25271y : list3);
    }
}

package n01;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Set;
import m83.C25235a0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import ry0.C31909d;

/* JADX INFO: renamed from: n01.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jd\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Ln01/e;", "Lm91/u;", "", "id", "", "maxSelection", "minSelection", "", "Lry0/d;", "cells", "", "hiddenCells", "stateUpdateValueKey", "", "isDisabled", "<init>", "(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;Z)Ln01/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "I", "f", "c", "g", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Ljava/util/Set;", "()Ljava/util/Set;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "i", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26088e implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f103319h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int maxSelection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int minSelection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C31909d> cells;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<String> hiddenCells;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String stateUpdateValueKey;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isDisabled;

    public C26088e(String id4, int i13, int i14, List<C31909d> cells, Set<String> hiddenCells, String str, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cells, "cells");
        AbstractC22676k.m65750j(hiddenCells, "hiddenCells");
        this.id = id4;
        this.maxSelection = i13;
        this.minSelection = i14;
        this.cells = cells;
        this.hiddenCells = hiddenCells;
        this.stateUpdateValueKey = str;
        this.isDisabled = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26088e m77601b(C26088e c26088e, String str, int i13, int i14, List list, Set set, String str2, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = c26088e.id;
        }
        if ((i15 & 2) != 0) {
            i13 = c26088e.maxSelection;
        }
        if ((i15 & 4) != 0) {
            i14 = c26088e.minSelection;
        }
        if ((i15 & 8) != 0) {
            list = c26088e.cells;
        }
        if ((i15 & 16) != 0) {
            set = c26088e.hiddenCells;
        }
        if ((i15 & 32) != 0) {
            str2 = c26088e.stateUpdateValueKey;
        }
        if ((i15 & 64) != 0) {
            z4 = c26088e.isDisabled;
        }
        String str3 = str2;
        boolean z13 = z4;
        Set set2 = set;
        int i16 = i14;
        return c26088e.m77602a(str, i13, i16, list, set2, str3, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C26088e m77602a(String id4, int maxSelection, int minSelection, List<C31909d> cells, Set<String> hiddenCells, String stateUpdateValueKey, boolean isDisabled) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cells, "cells");
        AbstractC22676k.m65750j(hiddenCells, "hiddenCells");
        return new C26088e(id4, maxSelection, minSelection, cells, hiddenCells, stateUpdateValueKey, isDisabled);
    }

    /* JADX INFO: renamed from: c */
    public final List<C31909d> m77603c() {
        return this.cells;
    }

    /* JADX INFO: renamed from: e */
    public final Set<String> m77604e() {
        return this.hiddenCells;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26088e)) {
            return false;
        }
        C26088e c26088e = (C26088e) other;
        return AbstractC22676k.m65745e(this.id, c26088e.id) && this.maxSelection == c26088e.maxSelection && this.minSelection == c26088e.minSelection && AbstractC22676k.m65745e(this.cells, c26088e.cells) && AbstractC22676k.m65745e(this.hiddenCells, c26088e.hiddenCells) && AbstractC22676k.m65745e(this.stateUpdateValueKey, c26088e.stateUpdateValueKey) && this.isDisabled == c26088e.isDisabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxSelection() {
        return this.maxSelection;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMinSelection() {
        return this.minSelection;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public int hashCode() {
        int iM73368a = AbstractC25012a.m73368a(this.hiddenCells, AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.minSelection, AbstractC11266d.m30448b(this.maxSelection, this.id.hashCode() * 31, 31), 31), 31, this.cells), 31);
        String str = this.stateUpdateValueKey;
        return Boolean.hashCode(this.isDisabled) + ((iM73368a + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    public String toString() {
        String str = this.id;
        int i13 = this.maxSelection;
        int i14 = this.minSelection;
        List<C31909d> list = this.cells;
        Set<String> set = this.hiddenCells;
        String str2 = this.stateUpdateValueKey;
        boolean z4 = this.isDisabled;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "SelectableCellListState(id=", str, ", maxSelection=", ", minSelection=");
        sbM30467u.append(i14);
        sbM30467u.append(", cells=");
        sbM30467u.append(list);
        sbM30467u.append(", hiddenCells=");
        sbM30467u.append(set);
        sbM30467u.append(", stateUpdateValueKey=");
        sbM30467u.append(str2);
        sbM30467u.append(", isDisabled=");
        return AbstractC18489d0.m53372m(sbM30467u, z4, ")");
    }

    public /* synthetic */ C26088e(String str, int i13, int i14, List list, Set set, String str2, boolean z4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i15 & 4) != 0 ? 0 : i14, list, (i15 & 16) != 0 ? C25235a0.f99113w : set, (i15 & 32) != 0 ? null : str2, (i15 & 64) != 0 ? false : z4);
    }
}

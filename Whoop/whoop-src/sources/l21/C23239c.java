package l21;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: l21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010Jl\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b)\u0010.¨\u0006/"}, m65681d2 = {"Ll21/c;", "Lm91/u;", "", "id", "title", "", "items", "button", "", "isCompleted", "", "servedTimeMillis", "", "", "magnitudeLevels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm91/u;ZLjava/lang/Long;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm91/u;ZLjava/lang/Long;Ljava/util/Map;)Ll21/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "Lm91/u;", "()Lm91/u;", "Z", "i", "()Z", "f", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "Ljava/util/Map;", "()Ljava/util/Map;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23239c implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f92089h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u button;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isCompleted;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Long servedTimeMillis;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Map<Integer, String> magnitudeLevels;

    /* JADX WARN: Multi-variable type inference failed */
    public C23239c(String id4, String title, List<? extends InterfaceC25312u> items, InterfaceC25312u interfaceC25312u, boolean z4, Long l7, Map<Integer, String> magnitudeLevels) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(magnitudeLevels, "magnitudeLevels");
        this.id = id4;
        this.title = title;
        this.items = items;
        this.button = interfaceC25312u;
        this.isCompleted = z4;
        this.servedTimeMillis = l7;
        this.magnitudeLevels = magnitudeLevels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C23239c m67280b(C23239c c23239c, String str, String str2, List list, InterfaceC25312u interfaceC25312u, boolean z4, Long l7, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c23239c.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c23239c.title;
        }
        if ((i13 & 4) != 0) {
            list = c23239c.items;
        }
        if ((i13 & 8) != 0) {
            interfaceC25312u = c23239c.button;
        }
        if ((i13 & 16) != 0) {
            z4 = c23239c.isCompleted;
        }
        if ((i13 & 32) != 0) {
            l7 = c23239c.servedTimeMillis;
        }
        if ((i13 & 64) != 0) {
            map = c23239c.magnitudeLevels;
        }
        Long l12 = l7;
        Map map2 = map;
        boolean z13 = z4;
        List list2 = list;
        return c23239c.m67281a(str, str2, list2, interfaceC25312u, z13, l12, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C23239c m67281a(String id4, String title, List<? extends InterfaceC25312u> items, InterfaceC25312u button, boolean isCompleted, Long servedTimeMillis, Map<Integer, String> magnitudeLevels) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(magnitudeLevels, "magnitudeLevels");
        return new C23239c(id4, title, items, button, isCompleted, servedTimeMillis, magnitudeLevels);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC25312u getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC25312u> m67283e() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23239c)) {
            return false;
        }
        C23239c c23239c = (C23239c) other;
        return AbstractC22676k.m65745e(this.id, c23239c.id) && AbstractC22676k.m65745e(this.title, c23239c.title) && AbstractC22676k.m65745e(this.items, c23239c.items) && AbstractC22676k.m65745e(this.button, c23239c.button) && this.isCompleted == c23239c.isCompleted && AbstractC22676k.m65745e(this.servedTimeMillis, c23239c.servedTimeMillis) && AbstractC22676k.m65745e(this.magnitudeLevels, c23239c.magnitudeLevels);
    }

    /* JADX INFO: renamed from: f */
    public final Map<Integer, String> m67284f() {
        return this.magnitudeLevels;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getServedTimeMillis() {
        return this.servedTimeMillis;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title), 31, this.items);
        InterfaceC25312u interfaceC25312u = this.button;
        int iM8289b = AbstractC2875y.m8289b((iM31983b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, 31, this.isCompleted);
        Long l7 = this.servedTimeMillis;
        return this.magnitudeLevels.hashCode() + ((iM8289b + (l7 != null ? l7.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        List<InterfaceC25312u> list = this.items;
        InterfaceC25312u interfaceC25312u = this.button;
        boolean z4 = this.isCompleted;
        Long l7 = this.servedTimeMillis;
        Map<Integer, String> map = this.magnitudeLevels;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("JournalEntryWidgetViewState(id=", str, ", title=", str2, ", items=");
        sbM32001t.append(list);
        sbM32001t.append(", button=");
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(", isCompleted=");
        sbM32001t.append(z4);
        sbM32001t.append(", servedTimeMillis=");
        sbM32001t.append(l7);
        sbM32001t.append(", magnitudeLevels=");
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    public /* synthetic */ C23239c(String str, String str2, List list, InterfaceC25312u interfaceC25312u, boolean z4, Long l7, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, interfaceC25312u, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : l7, (i13 & 64) != 0 ? C25272z.f99163w : map);
    }
}

package zz0;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: zz0.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lzz0/m;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "isLoading", "Lzz0/a;", "datePickerState", "", "Lzz0/i;", "months", "Lzz0/h;", "legendItems", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lcom/whoop/design/util/TextResource;ZLzz0/a;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;)V", "a", "(Lcom/whoop/design/util/TextResource;ZLzz0/a;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;)Lzz0/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "c", "Lzz0/a;", "()Lzz0/a;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41252m implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f177975g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C41240a datePickerState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C41248i> months;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C41247h> legendItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Object event;

    public C41252m(TextResource title, boolean z4, C41240a datePickerState, List<C41248i> months, List<C41247h> legendItems, Object event) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(datePickerState, "datePickerState");
        AbstractC22676k.m65750j(months, "months");
        AbstractC22676k.m65750j(legendItems, "legendItems");
        AbstractC22676k.m65750j(event, "event");
        this.title = title;
        this.isLoading = z4;
        this.datePickerState = datePickerState;
        this.months = months;
        this.legendItems = legendItems;
        this.event = event;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C41252m m134013b(C41252m c41252m, TextResource textResource, boolean z4, C41240a c41240a, List list, List list2, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            textResource = c41252m.title;
        }
        if ((i13 & 2) != 0) {
            z4 = c41252m.isLoading;
        }
        if ((i13 & 4) != 0) {
            c41240a = c41252m.datePickerState;
        }
        if ((i13 & 8) != 0) {
            list = c41252m.months;
        }
        if ((i13 & 16) != 0) {
            list2 = c41252m.legendItems;
        }
        if ((i13 & 32) != 0) {
            obj = c41252m.event;
        }
        List list3 = list2;
        Object obj3 = obj;
        return c41252m.m134014a(textResource, z4, c41240a, list, list3, obj3);
    }

    /* JADX INFO: renamed from: a */
    public final C41252m m134014a(TextResource title, boolean isLoading, C41240a datePickerState, List<C41248i> months, List<C41247h> legendItems, Object event) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(datePickerState, "datePickerState");
        AbstractC22676k.m65750j(months, "months");
        AbstractC22676k.m65750j(legendItems, "legendItems");
        AbstractC22676k.m65750j(event, "event");
        return new C41252m(title, isLoading, datePickerState, months, legendItems, event);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C41240a getDatePickerState() {
        return this.datePickerState;
    }

    /* JADX INFO: renamed from: e */
    public final List<C41247h> m134016e() {
        return this.legendItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41252m)) {
            return false;
        }
        C41252m c41252m = (C41252m) other;
        return AbstractC22676k.m65745e(this.title, c41252m.title) && this.isLoading == c41252m.isLoading && AbstractC22676k.m65745e(this.datePickerState, c41252m.datePickerState) && AbstractC22676k.m65745e(this.months, c41252m.months) && AbstractC22676k.m65745e(this.legendItems, c41252m.legendItems) && AbstractC22676k.m65745e(this.event, c41252m.event);
    }

    /* JADX INFO: renamed from: f */
    public final List<C41248i> m134017f() {
        return this.months;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return this.event.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.datePickerState.hashCode() + AbstractC2875y.m8289b(this.title.hashCode() * 31, 31, this.isLoading)) * 31, 31, this.months), 31, this.legendItems);
    }

    public String toString() {
        TextResource textResource = this.title;
        boolean z4 = this.isLoading;
        C41240a c41240a = this.datePickerState;
        List<C41248i> list = this.months;
        List<C41247h> list2 = this.legendItems;
        Object obj = this.event;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("BehaviorsCalendarViewState(title=", textResource, ", isLoading=", z4, ", datePickerState=");
        sbM91846p.append(c41240a);
        sbM91846p.append(", months=");
        sbM91846p.append(list);
        sbM91846p.append(", legendItems=");
        sbM91846p.append(list2);
        sbM91846p.append(", event=");
        sbM91846p.append(obj);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C41252m(TextResource textResource, boolean z4, C41240a c41240a, List list, List list2, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        textResource = (i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource;
        z4 = (i13 & 2) != 0 ? false : z4;
        c41240a = (i13 & 4) != 0 ? new C41240a(null, false, false, null, null, 31, null) : c41240a;
        int i14 = i13 & 8;
        List list3 = C25271y.f99162w;
        this(textResource, z4, c41240a, i14 != 0 ? list3 : list, (i13 & 16) == 0 ? list2 : list3, (i13 & 32) != 0 ? C23454a0.f92919a : obj);
    }
}

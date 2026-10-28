package v90;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: v90.v */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, m65681d2 = {"Lv90/v;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "planPickerTitle", "", "Lv90/s;", "upcycleOptions", "planPickerSubtitle", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)Lv90/v;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35830v implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource planPickerTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C35827s> upcycleOptions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource planPickerSubtitle;

    public C35830v(TextResource planPickerTitle, List<C35827s> upcycleOptions, TextResource planPickerSubtitle) {
        AbstractC22676k.m65750j(planPickerTitle, "planPickerTitle");
        AbstractC22676k.m65750j(upcycleOptions, "upcycleOptions");
        AbstractC22676k.m65750j(planPickerSubtitle, "planPickerSubtitle");
        this.planPickerTitle = planPickerTitle;
        this.upcycleOptions = upcycleOptions;
        this.planPickerSubtitle = planPickerSubtitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35830v m113715b(C35830v c35830v, TextResource textResource, List list, TextResource textResource2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c35830v.planPickerTitle;
        }
        if ((i13 & 2) != 0) {
            list = c35830v.upcycleOptions;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c35830v.planPickerSubtitle;
        }
        return c35830v.m113716a(textResource, list, textResource2);
    }

    /* JADX INFO: renamed from: a */
    public final C35830v m113716a(TextResource planPickerTitle, List<C35827s> upcycleOptions, TextResource planPickerSubtitle) {
        AbstractC22676k.m65750j(planPickerTitle, "planPickerTitle");
        AbstractC22676k.m65750j(upcycleOptions, "upcycleOptions");
        AbstractC22676k.m65750j(planPickerSubtitle, "planPickerSubtitle");
        return new C35830v(planPickerTitle, upcycleOptions, planPickerSubtitle);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getPlanPickerSubtitle() {
        return this.planPickerSubtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getPlanPickerTitle() {
        return this.planPickerTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35830v)) {
            return false;
        }
        C35830v c35830v = (C35830v) other;
        return AbstractC22676k.m65745e(this.planPickerTitle, c35830v.planPickerTitle) && AbstractC22676k.m65745e(this.upcycleOptions, c35830v.upcycleOptions) && AbstractC22676k.m65745e(this.planPickerSubtitle, c35830v.planPickerSubtitle);
    }

    /* JADX INFO: renamed from: f */
    public final List<C35827s> m113719f() {
        return this.upcycleOptions;
    }

    public int hashCode() {
        return this.planPickerSubtitle.hashCode() + AbstractC11895b.m31983b(this.planPickerTitle.hashCode() * 31, 31, this.upcycleOptions);
    }

    public String toString() {
        TextResource textResource = this.planPickerTitle;
        List<C35827s> list = this.upcycleOptions;
        return AbstractC30007c.m91841k(AbstractC33745d.m106657p(textResource, "UpcyclePlanPickerState(planPickerTitle=", ", upcycleOptions=", ", planPickerSubtitle=", list), this.planPickerSubtitle, ")");
    }
}

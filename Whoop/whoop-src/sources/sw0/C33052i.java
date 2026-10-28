package sw0;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sw0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, m65681d2 = {"Lsw0/i;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "groupPriority", "", "Lsw0/j;", "toggles", "Lcom/whoop/design/models/DesignSystemModel;", "emptyState", "<init>", "(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)V", "a", "(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)Lsw0/i;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "I", "d", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/whoop/design/models/DesignSystemModel;", "()Lcom/whoop/design/models/DesignSystemModel;", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33052i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int groupPriority;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C33053j> toggles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final DesignSystemModel emptyState;

    public C33052i(TextResource title, int i13, List<C33053j> toggles, DesignSystemModel designSystemModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(toggles, "toggles");
        this.title = title;
        this.groupPriority = i13;
        this.toggles = toggles;
        this.emptyState = designSystemModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33052i m104646b(C33052i c33052i, TextResource textResource, int i13, List list, DesignSystemModel designSystemModel, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            textResource = c33052i.title;
        }
        if ((i14 & 2) != 0) {
            i13 = c33052i.groupPriority;
        }
        if ((i14 & 4) != 0) {
            list = c33052i.toggles;
        }
        if ((i14 & 8) != 0) {
            designSystemModel = c33052i.emptyState;
        }
        return c33052i.m104647a(textResource, i13, list, designSystemModel);
    }

    /* JADX INFO: renamed from: a */
    public final C33052i m104647a(TextResource title, int groupPriority, List<C33053j> toggles, DesignSystemModel emptyState) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(toggles, "toggles");
        return new C33052i(title, groupPriority, toggles, emptyState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DesignSystemModel getEmptyState() {
        return this.emptyState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getGroupPriority() {
        return this.groupPriority;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33052i)) {
            return false;
        }
        C33052i c33052i = (C33052i) other;
        return AbstractC22676k.m65745e(this.title, c33052i.title) && this.groupPriority == c33052i.groupPriority && AbstractC22676k.m65745e(this.toggles, c33052i.toggles) && AbstractC22676k.m65745e(this.emptyState, c33052i.emptyState);
    }

    /* JADX INFO: renamed from: f */
    public final List<C33053j> m104651f() {
        return this.toggles;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.groupPriority, this.title.hashCode() * 31, 31), 31, this.toggles);
        DesignSystemModel designSystemModel = this.emptyState;
        return iM31983b + (designSystemModel == null ? 0 : designSystemModel.hashCode());
    }

    public String toString() {
        return "GroupedTogglesDomainState(title=" + this.title + ", groupPriority=" + this.groupPriority + ", toggles=" + this.toggles + ", emptyState=" + this.emptyState + ")";
    }

    public /* synthetic */ C33052i(TextResource textResource, int i13, List list, DesignSystemModel designSystemModel, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, i13, list, (i14 & 8) != 0 ? null : designSystemModel);
    }
}

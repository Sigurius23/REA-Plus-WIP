package am0;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: am0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, m65681d2 = {"Lam0/e;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "header", "", "Lam0/f;", "workoutList", "buttonViewState", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "Lm91/u;", "()Lm91/u;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1001e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C1002f> workoutList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u buttonViewState;

    public C1001e(TextResource title, TextResource header, List<C1002f> workoutList, InterfaceC25312u buttonViewState) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(workoutList, "workoutList");
        AbstractC22676k.m65750j(buttonViewState, "buttonViewState");
        this.title = title;
        this.header = header;
        this.workoutList = workoutList;
        this.buttonViewState = buttonViewState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getButtonViewState() {
        return this.buttonViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e */
    public final List<C1002f> m2702e() {
        return this.workoutList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1001e)) {
            return false;
        }
        C1001e c1001e = (C1001e) other;
        return AbstractC22676k.m65745e(this.title, c1001e.title) && AbstractC22676k.m65745e(this.header, c1001e.header) && AbstractC22676k.m65745e(this.workoutList, c1001e.workoutList) && AbstractC22676k.m65745e(this.buttonViewState, c1001e.buttonViewState);
    }

    public int hashCode() {
        return this.buttonViewState.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.header, 31), 31, this.workoutList);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.header;
        List<C1002f> list = this.workoutList;
        InterfaceC25312u interfaceC25312u = this.buttonViewState;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("StrengthTrainerWidgetState(title=", textResource, ", header=", textResource2, ", workoutList=");
        sbM106658q.append(list);
        sbM106658q.append(", buttonViewState=");
        sbM106658q.append(interfaceC25312u);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}

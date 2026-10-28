package b81;

import androidx.core.app.NotificationCompat;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: b81.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lb81/f;", "Lm91/u;", "", "id", "", "behaviors", "Lb81/e;", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;Ljava/util/List;Lb81/e;)V", "a", "(Ljava/lang/String;Ljava/util/List;Lb81/e;)Lb81/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lb81/e;", "e", "()Lb81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2799f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> behaviors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC2798e status;

    /* JADX WARN: Multi-variable type inference failed */
    public C2799f(String id4, List<? extends InterfaceC25312u> behaviors, EnumC2798e status) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(behaviors, "behaviors");
        AbstractC22676k.m65750j(status, "status");
        this.id = id4;
        this.behaviors = behaviors;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2799f m7969b(C2799f c2799f, String str, List list, EnumC2798e enumC2798e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c2799f.id;
        }
        if ((i13 & 2) != 0) {
            list = c2799f.behaviors;
        }
        if ((i13 & 4) != 0) {
            enumC2798e = c2799f.status;
        }
        return c2799f.m7970a(str, list, enumC2798e);
    }

    /* JADX INFO: renamed from: a */
    public final C2799f m7970a(String id4, List<? extends InterfaceC25312u> behaviors, EnumC2798e status) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(behaviors, "behaviors");
        AbstractC22676k.m65750j(status, "status");
        return new C2799f(id4, behaviors, status);
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m7971c() {
        return this.behaviors;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC2798e getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2799f)) {
            return false;
        }
        C2799f c2799f = (C2799f) other;
        return AbstractC22676k.m65745e(this.id, c2799f.id) && AbstractC22676k.m65745e(this.behaviors, c2799f.behaviors) && this.status == c2799f.status;
    }

    public int hashCode() {
        return this.status.hashCode() + AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.behaviors);
    }

    public String toString() {
        String str = this.id;
        List<InterfaceC25312u> list = this.behaviors;
        EnumC2798e enumC2798e = this.status;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("MultiSelectViewState(id=", str, ", behaviors=", ", status=", list);
        sbM94766o.append(enumC2798e);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ C2799f(String str, List list, EnumC2798e enumC2798e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i13 & 4) != 0 ? EnumC2798e.ENABLED : enumC2798e);
    }
}

package p712j91;

import androidx.compose.runtime.Composer;
import p208i2.AbstractC17911t;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j91.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lj91/a;", "Lj91/b;", "Li2/t;", "brush", "<init>", "(Li2/t;)V", "a", "(Landroidx/compose/runtime/Composer;I)Li2/t;", "b", "()Li2/t;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li2/t;", "getBrush", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21429a implements InterfaceC21430b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC17911t brush;

    public C21429a(AbstractC17911t brush) {
        AbstractC22676k.m65750j(brush, "brush");
        this.brush = brush;
    }

    @Override // p712j91.InterfaceC21430b
    /* JADX INFO: renamed from: a */
    public AbstractC17911t mo60316a(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-278668147);
        AbstractC17911t abstractC17911t = this.brush;
        c28655q.m87173q(false);
        return abstractC17911t;
    }

    @Override // p712j91.InterfaceC21430b
    /* JADX INFO: renamed from: b, reason: from getter */
    public AbstractC17911t getBrush() {
        return this.brush;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C21429a) && AbstractC22676k.m65745e(this.brush, ((C21429a) other).brush);
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    public String toString() {
        return "SimpleBrushProvider(brush=" + this.brush + ")";
    }
}

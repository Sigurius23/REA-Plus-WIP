package p712j91;

import androidx.compose.runtime.Composer;
import p208i2.AbstractC17911t;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC42793j;
import x81.C38072d;

/* JADX INFO: renamed from: j91.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lj91/d;", "Lj91/b;", "Lkotlin/Function1;", "Ly81/i;", "Li2/t;", "brushFactory", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "a", "(Landroidx/compose/runtime/Composer;I)Li2/t;", "b", "()Li2/t;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21432d implements InterfaceC21430b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 brushFactory;

    public C21432d(Function1 brushFactory) {
        AbstractC22676k.m65750j(brushFactory, "brushFactory");
        this.brushFactory = brushFactory;
    }

    @Override // p712j91.InterfaceC21430b
    /* JADX INFO: renamed from: a */
    public AbstractC17911t mo60316a(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1623712324);
        AbstractC17911t abstractC17911t = (AbstractC17911t) this.brushFactory.invoke(C38072d.f163053a.m121949b(c28655q, 6));
        c28655q.m87173q(false);
        return abstractC17911t;
    }

    @Override // p712j91.InterfaceC21430b
    /* JADX INFO: renamed from: b */
    public AbstractC17911t getBrush() {
        return (AbstractC17911t) this.brushFactory.invoke(AbstractC42793j.m125436c());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C21432d.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.design.foundation.brush.WhoopBrushProvider");
        return AbstractC22676k.m65745e(getBrush(), ((C21432d) other).getBrush());
    }

    public int hashCode() {
        return getBrush().hashCode();
    }

    public String toString() {
        return "WhoopBrushProvider(" + getBrush() + ")";
    }
}

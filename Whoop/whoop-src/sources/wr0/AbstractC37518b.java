package wr0;

import bc3.InterfaceC2994c0;
import ec3.InterfaceC13037f2;
import ld1.AbstractC23864c;
import or2.C28180m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wr0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lwr0/b;", "Lld1/c;", "Lwr0/c;", "Lwr0/a;", "Lbc3/c0;", "coroutineScope", "<init>", "(Lbc3/c0;)V", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37518b extends AbstractC23864c<C37520c, AbstractC37516a> {

    /* JADX INFO: renamed from: x */
    public static final int f160453x = AbstractC23864c.f94380w;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC37518b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // ld1.AbstractC23864c
    public abstract InterfaceC13037f2 getViewState();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC37518b(InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
    }

    public /* synthetic */ AbstractC37518b(InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

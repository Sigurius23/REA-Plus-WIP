package qe1;

import com.whoop.design.models.items.ArticleTileCarouselModel;
import h51.C16934f;
import jb1.AbstractC21537c;
import le1.InterfaceC23875b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: qe1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lqe1/d;", "", "<init>", "()V", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "Lqe1/c;", "b", "(Lcom/whoop/design/models/items/ArticleTileCarouselModel;)Lqe1/c;", "Lle1/b;", "result", "a", "(Lle1/b;)Lqe1/c;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30306d {
    /* JADX INFO: renamed from: b */
    private final InterfaceC30305c m92659b(ArticleTileCarouselModel articleTileCarouselModel) {
        InterfaceC25312u interfaceC25312uM60541h = AbstractC21537c.m60555e(null, 1, null).m60541h(articleTileCarouselModel);
        C16934f c16934f = interfaceC25312uM60541h instanceof C16934f ? (C16934f) interfaceC25312uM60541h : null;
        return c16934f != null ? new InterfaceC30305c.b(c16934f) : InterfaceC30305c.a.f124015a;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC30305c m92660a(InterfaceC23875b result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof InterfaceC23875b.b) {
            return m92659b(((InterfaceC23875b.b) result).getData());
        }
        if (result instanceof InterfaceC23875b.a) {
            return InterfaceC30305c.a.f124015a;
        }
        throw new NoWhenBranchMatchedException();
    }
}

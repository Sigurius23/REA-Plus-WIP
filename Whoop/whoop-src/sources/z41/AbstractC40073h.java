package z41;

import b51.InterfaceC2737a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z41.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lz41/k;", "Lb51/a;", "drawArea", "Lz41/k$a;", "a", "(Lz41/k;Lb51/a;)Lz41/k$a;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40073h {
    /* JADX INFO: renamed from: a */
    public static final AbstractC40076k.a m128447a(AbstractC40076k abstractC40076k, InterfaceC2737a drawArea) {
        AbstractC22676k.m65750j(abstractC40076k, "<this>");
        AbstractC22676k.m65750j(drawArea, "drawArea");
        if (abstractC40076k instanceof AbstractC40076k.a) {
            AbstractC40076k.a aVar = (AbstractC40076k.a) abstractC40076k;
            return new AbstractC40076k.a(aVar.getX(), aVar.getY());
        }
        if (!(abstractC40076k instanceof AbstractC40076k.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC40076k.b bVar = (AbstractC40076k.b) abstractC40076k;
        return new AbstractC40076k.a(drawArea.getWidth() * ((float) bVar.getX()), drawArea.getHeight() * ((float) bVar.getY()));
    }
}

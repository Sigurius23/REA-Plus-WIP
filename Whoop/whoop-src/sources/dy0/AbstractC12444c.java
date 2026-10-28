package dy0;

import c41.C4042i1;
import c62.AbstractC4275c;
import com.whoop.deepdive.domain.models.ArchMiniLastNightModel;
import com.whoop.deepdive.domain.models.ArchMiniRecoveryImpactsModel;
import com.whoop.deepdive.domain.models.ArchMiniTrendsModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ContributorTileModel;
import d62.C11738d;
import do0.C12229c;
import e31.C12612d;
import im2.C18712c;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import km2.C22596g;
import l83.C23454a0;
import p31.C28801l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import qu1.C30628d;
import qu1.C30630f;
import qu1.C30631g;

/* JADX INFO: renamed from: dy0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "g", "()Ljb1/a;", "itemReducer", "deep-dive_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12444c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f42388a = AbstractC21537c.m60554d(new C12229c(12));

    /* JADX INFO: renamed from: dy0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f42389w;

        public a(Function1 function1) {
            this.f42389w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f42389w.invoke((ArchMiniTrendsModel) it);
        }
    }

    /* JADX INFO: renamed from: dy0.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f42390w;

        public b(Function1 function1) {
            this.f42390w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f42390w.invoke((ArchMiniLastNightModel) it);
        }
    }

    /* JADX INFO: renamed from: dy0.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f42391w;

        public c(Function1 function1) {
            this.f42391w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f42391w.invoke((ArchMiniRecoveryImpactsModel) it);
        }
    }

    /* JADX INFO: renamed from: dy0.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f42392w;

        public d(Function1 function1) {
            this.f42392w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f42392w.invoke((ContributorTileModel) it);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C21535a m35010g() {
        return f42388a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m35011h(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C12443b(AbstractC21537c.m60555e(null, 1, null), 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m35012i(C21535a c21535a, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C12229c c12229c = new C12229c(13);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArchMiniTrendsModel.class), new a(c12229c));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArchMiniLastNightModel.class), new b(new C12443b(c21535a, 1)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArchMiniRecoveryImpactsModel.class), new c(new C12229c(14)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ContributorTileModel.class), new d(new C12443b(c21535a, 2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C22596g m35013j(ArchMiniTrendsModel model) {
        AbstractC22676k.m65750j(model, "model");
        C18712c c18712c = new C18712c(new C18712c.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, 2, null);
        String path = model.getPath();
        if (path == null) {
            path = "";
        }
        return new C22596g(c18712c, path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C30628d m35014k(C21535a c21535a, ArchMiniLastNightModel model) {
        AbstractC22676k.m65750j(model, "model");
        String path = model.getPath();
        if (path == null) {
            path = "";
        }
        InterfaceC25312u interfaceC25312uM60541h = c21535a.m60541h(model.getHeaderSection());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.sectionheader.HomeSectionHeaderItemState");
        return new C30628d(path, new C30630f(null, (C28801l) interfaceC25312uM60541h, null, new C30631g(C12612d.f43056a.m35366a(), null, null, 6, null), 5, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C11738d m35015l(ArchMiniRecoveryImpactsModel model) {
        AbstractC22676k.m65750j(model, "model");
        String path = model.getPath();
        if (path == null) {
            path = "";
        }
        return new C11738d(AbstractC4275c.b.f17358a, path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C4042i1 m35016m(C21535a c21535a, ContributorTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        InterfaceC25312u interfaceC25312uM60541h = c21535a.m60541h(model);
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.ContributorTileState");
        C4042i1 c4042i1 = (C4042i1) interfaceC25312uM60541h;
        return c4042i1.m12323c().isEmpty() ? C4042i1.m12321b(c4042i1, null, null, null, null, null, 0, 31, null) : c4042i1;
    }
}

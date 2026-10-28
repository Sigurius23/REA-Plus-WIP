package s02;

import fy1.InterfaceC14871g;
import hb1.AbstractC17084g;
import hb1.C17081d;
import iy1.InterfaceC21030c;
import java.util.Iterator;
import jy1.C22047a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: s02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m65681d2 = {"Ls02/a;", "", "Liy1/c;", "metricWriter", "Lfy1/g;", "nanoClock", "<init>", "(Liy1/c;Lfy1/g;)V", "", "path", "Ll83/a0;", "a", "(Ljava/lang/String;)V", "Lhb1/g;", "viewState", "b", "(Lhb1/g;)V", "Liy1/c;", "Lfy1/g;", "c", "Ljava/lang/String;", "", "d", "J", "startNano", "", "e", "Z", "hasEmitted", "f", "nested-bff-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32051a {

    /* JADX INFO: renamed from: g */
    public static final int f132941g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14871g nanoClock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String path;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long startNano;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean hasEmitted;

    public C32051a(InterfaceC21030c metricWriter, InterfaceC14871g nanoClock) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(nanoClock, "nanoClock");
        this.metricWriter = metricWriter;
        this.nanoClock = nanoClock;
    }

    /* JADX INFO: renamed from: a */
    public final void m99621a(String path) {
        AbstractC22676k.m65750j(path, "path");
        if (this.path == null) {
            this.path = path;
            this.startNano = this.nanoClock.mo42899a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m99622b(AbstractC17084g viewState) {
        String str;
        AbstractC22676k.m65750j(viewState, "viewState");
        if (this.hasEmitted || !(viewState instanceof AbstractC17084g.d) || (str = this.path) == null) {
            return;
        }
        this.hasEmitted = true;
        double dMo42899a = (this.nanoClock.mo42899a() - this.startNano) / 1000000.0d;
        AbstractC17084g.d dVar = (AbstractC17084g.d) viewState;
        Iterator<T> it = dVar.m48213a().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C17081d) it.next()).m48209a().size();
        }
        this.metricWriter.mo58701b(new C22047a(0, "nested_bff.render_duration", Double.valueOf(dMo42899a), AbstractC37056f.m118959K("path:".concat(str), AbstractC2875y.m8295h(dVar.m48213a().size(), "section_count:"), AbstractC2875y.m8295h(size, "item_count:")), null, 17, null));
    }
}

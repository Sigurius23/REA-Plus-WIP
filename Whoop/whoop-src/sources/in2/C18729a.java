package in2;

import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.AbstractC3076z;
import hc3.AbstractC17182o;
import kc3.ExecutorC22364d;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: in2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lin2/a;", "Lin2/d;", "<init>", "()V", "Lbc3/z;", "a", "Lbc3/z;", "c", "()Lbc3/z;", "Default", "Lbc3/w1;", "b", "Lbc3/w1;", "e", "()Lbc3/w1;", "Main", "d", "IO", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C18729a implements InterfaceC18732d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC3076z Default = AbstractC3050q0.f12077a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC3069w1 Main = AbstractC17182o.f65999a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC3076z IO = ExecutorC22364d.f87316w;

    @Override // in2.InterfaceC18732d
    /* JADX INFO: renamed from: c, reason: from getter */
    public AbstractC3076z getDefault() {
        return this.Default;
    }

    @Override // in2.InterfaceC18732d
    /* JADX INFO: renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
    public AbstractC3076z mo54465b() {
        return this.IO;
    }

    @Override // in2.InterfaceC18732d
    /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
    public AbstractC3069w1 mo54464a() {
        return this.Main;
    }
}

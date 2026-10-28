package p720m91;

import j93.InterfaceC21461d;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m91.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR+\u0010\u0011\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lm91/q;", "", "<init>", "()V", "Lm91/p;", "factory", "Ll83/a0;", "b", "(Lm91/p;)V", "a", "()Lm91/p;", "", "Lj93/d;", "Lm91/f;", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "composerByItemState", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25308q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<InterfaceC21461d, InterfaceC25297f<?>> composerByItemState = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final C25307p m74322a() {
        return new C25307p(this.composerByItemState);
    }

    /* JADX INFO: renamed from: b */
    public final void m74323b(C25307p factory) {
        AbstractC22676k.m65750j(factory, "factory");
        this.composerByItemState.putAll(factory.m74320b());
    }

    /* JADX INFO: renamed from: c */
    public final Map<InterfaceC21461d, InterfaceC25297f<?>> m74324c() {
        return this.composerByItemState;
    }
}

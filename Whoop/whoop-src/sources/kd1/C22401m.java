package kd1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kd1.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00118F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\r\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lkd1/m;", "", "<init>", "()V", "Ll83/a0;", "g", "c", "id", "d", "(Ljava/lang/Object;)V", "f", "b", "", "a", "Ljava/util/Set;", "registered", "loaded", "", "Z", "compositionReady", "<set-?>", "Lp1/c1;", "()Z", "e", "(Z)V", "allImagesLoaded", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22401m {

    /* JADX INFO: renamed from: e */
    public static final int f87632e = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean compositionReady;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<Object> registered = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<Object> loaded = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28601c1 allImagesLoaded = AbstractC28683x.m87272z(Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    private final void m64477e(boolean z4) {
        this.allImagesLoaded.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: g */
    private final void m64478g() {
        boolean z4;
        if (this.compositionReady) {
            if (!this.registered.isEmpty()) {
                Set<Object> set = this.registered;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!this.loaded.contains(it.next())) {
                                z4 = false;
                            }
                        }
                    }
                }
            }
            z4 = true;
        } else {
            z4 = false;
        }
        m64477e(z4);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m64479a() {
        return ((Boolean) this.allImagesLoaded.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m64480b(Object id4) {
        AbstractC22676k.m65750j(id4, "id");
        if (this.registered.contains(id4)) {
            this.loaded.add(id4);
            m64478g();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m64481c() {
        this.compositionReady = true;
        m64478g();
    }

    /* JADX INFO: renamed from: d */
    public final void m64482d(Object id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.registered.add(id4);
        m64478g();
    }

    /* JADX INFO: renamed from: f */
    public final void m64483f(Object id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.registered.remove(id4);
        this.loaded.remove(id4);
        m64478g();
    }
}

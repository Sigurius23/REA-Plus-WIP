package kd1;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kd1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, m65681d2 = {"Lkd1/h;", "T", "", "component", "", "name", "type", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "a", "()Ljava/lang/Object;", "b", "c", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "d", "Ljava/lang/String;", "e", "getType", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22396h<T> {

    /* JADX INFO: renamed from: d */
    public static final int f87627d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final T component;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object type;

    public C22396h(T t14, String name, Object obj) {
        AbstractC22676k.m65750j(name, "name");
        this.component = t14;
        this.name = name;
        this.type = obj;
    }

    /* JADX INFO: renamed from: a */
    public final T m64455a() {
        return this.component;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: d */
    public final T m64458d() {
        return this.component;
    }

    /* JADX INFO: renamed from: e */
    public final String m64459e() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22396h)) {
            return false;
        }
        C22396h c22396h = (C22396h) other;
        return AbstractC22676k.m65745e(this.component, c22396h.component) && AbstractC22676k.m65745e(this.name, c22396h.name) && AbstractC22676k.m65745e(this.type, c22396h.type);
    }

    public int hashCode() {
        T t14 = this.component;
        int iM30450d = AbstractC11266d.m30450d((t14 == null ? 0 : t14.hashCode()) * 31, 31, this.name);
        Object obj = this.type;
        return iM30450d + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return this.name + ": " + this.component;
    }
}

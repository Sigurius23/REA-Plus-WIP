package b91;

import p294l3.C23285v0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b91.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lb91/a;", "", "Ll3/v0;", "style", "Lb91/b;", "type", "<init>", "(Ll3/v0;Lb91/b;)V", "b", "(Ll3/v0;Lb91/b;)Lb91/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll3/v0;", "d", "()Ll3/v0;", "Lb91/b;", "e", "()Lb91/b;", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2886a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final int f11498d = 8;

    /* JADX INFO: renamed from: e */
    private static final C2886a f11499e = new C2886a(null, null, 3, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23285v0 style;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2887b type;

    /* JADX INFO: renamed from: b91.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lb91/a$a;", "", "<init>", "()V", "Lb91/a;", "Default", "Lb91/a;", "a", "()Lb91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2886a m8401a() {
            return C2886a.f11499e;
        }

        private Companion() {
        }
    }

    public C2886a(C23285v0 style, InterfaceC2887b type) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(type, "type");
        this.style = style;
        this.type = type;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C2886a m8397c(C2886a c2886a, C23285v0 c23285v0, InterfaceC2887b interfaceC2887b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c23285v0 = c2886a.style;
        }
        if ((i13 & 2) != 0) {
            interfaceC2887b = c2886a.type;
        }
        return c2886a.m8398b(c23285v0, interfaceC2887b);
    }

    /* JADX INFO: renamed from: b */
    public final C2886a m8398b(C23285v0 style, InterfaceC2887b type) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(type, "type");
        return new C2886a(style, type);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C23285v0 getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC2887b getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2886a)) {
            return false;
        }
        C2886a c2886a = (C2886a) other;
        return AbstractC22676k.m65745e(this.style, c2886a.style) && AbstractC22676k.m65745e(this.type, c2886a.type);
    }

    public int hashCode() {
        return this.type.hashCode() + (this.style.hashCode() * 31);
    }

    public String toString() {
        return "TextStyleInfo(style=" + this.style + ", type=" + this.type + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2886a(C23285v0 c23285v0, InterfaceC2887b interfaceC2887b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            C23285v0 c23285v1 = C23285v0.f92254d;
            c23285v0 = C23285v0.f92254d;
        }
        this(c23285v0, (i13 & 2) != 0 ? InterfaceC2887b.j.f11510a : interfaceC2887b);
    }
}

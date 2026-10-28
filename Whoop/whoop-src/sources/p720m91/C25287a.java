package p720m91;

import d13.AbstractC11478a;
import p077d0.C11393q0;
import p390p1.C28633k1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: m91.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B%\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ@\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lm91/a;", "K", "Lm91/u;", "V", "", "id", "item", "Ld0/q0;", "", "transitionState", "<init>", "(Ljava/lang/Object;Lm91/u;Ld0/q0;)V", "Lm91/e0;", "visibilityState", "(Ljava/lang/Object;Lm91/u;Lm91/e0;)V", "a", "(Ljava/lang/Object;Lm91/u;Ld0/q0;)Lm91/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "b", "Lm91/u;", "d", "()Lm91/u;", "Ld0/q0;", "e", "()Ld0/q0;", "f", "()Lm91/e0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25287a<K, V extends InterfaceC25312u> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final K id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final V item;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11393q0 transitionState;

    /* JADX INFO: renamed from: m91.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99272a;

        static {
            int[] iArr = new int[EnumC25296e0.values().length];
            try {
                iArr[EnumC25296e0.Entering.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25296e0.Visible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25296e0.Exiting.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25296e0.Invisible.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f99272a = iArr;
        }
    }

    public C25287a(K k5, V item, C11393q0 transitionState) {
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(transitionState, "transitionState");
        this.id = k5;
        this.item = item;
        this.transitionState = transitionState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C25287a m74232b(C25287a c25287a, Object obj, InterfaceC25312u interfaceC25312u, C11393q0 c11393q0, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = c25287a.id;
        }
        if ((i13 & 2) != 0) {
            interfaceC25312u = c25287a.item;
        }
        if ((i13 & 4) != 0) {
            c11393q0 = c25287a.transitionState;
        }
        return c25287a.m74233a(obj, interfaceC25312u, c11393q0);
    }

    /* JADX INFO: renamed from: a */
    public final C25287a<K, V> m74233a(K id4, V item, C11393q0 transitionState) {
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(transitionState, "transitionState");
        return new C25287a<>(id4, item, transitionState);
    }

    /* JADX INFO: renamed from: c */
    public final K m74234c() {
        return this.id;
    }

    /* JADX INFO: renamed from: d */
    public final V m74235d() {
        return this.item;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C11393q0 getTransitionState() {
        return this.transitionState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25287a)) {
            return false;
        }
        C25287a c25287a = (C25287a) other;
        return AbstractC22676k.m65745e(this.id, c25287a.id) && AbstractC22676k.m65745e(this.item, c25287a.item) && AbstractC22676k.m65745e(this.transitionState, c25287a.transitionState);
    }

    /* JADX INFO: renamed from: f */
    public final EnumC25296e0 m74237f() {
        C11393q0 c11393q0 = this.transitionState;
        boolean zM30627H0 = c11393q0.m30627H0();
        C28633k1 c28633k1 = c11393q0.f36535z;
        if (zM30627H0 && ((Boolean) c28633k1.getValue()).booleanValue()) {
            return EnumC25296e0.Visible;
        }
        if (!c11393q0.m30627H0() || ((Boolean) c28633k1.getValue()).booleanValue()) {
            return (c11393q0.m30627H0() || !((Boolean) c28633k1.getValue()).booleanValue()) ? EnumC25296e0.Exiting : EnumC25296e0.Entering;
        }
        return EnumC25296e0.Invisible;
    }

    public int hashCode() {
        K k5 = this.id;
        return this.transitionState.hashCode() + AbstractC11478a.m30851c(this.item, (k5 == null ? 0 : k5.hashCode()) * 31, 31);
    }

    public String toString() {
        return "AnimatableListItem(id=" + this.id + ", item=" + this.item + ", transitionState=" + this.transitionState + ")";
    }

    public C25287a(K k5, V item, EnumC25296e0 visibilityState) {
        C11393q0 c11393q0;
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(visibilityState, "visibilityState");
        int i13 = a.f99272a[visibilityState.ordinal()];
        if (i13 == 1) {
            c11393q0 = new C11393q0(Boolean.FALSE);
            c11393q0.m30628I0(Boolean.TRUE);
        } else if (i13 == 2) {
            c11393q0 = new C11393q0(Boolean.TRUE);
        } else if (i13 == 3) {
            c11393q0 = new C11393q0(Boolean.TRUE);
            c11393q0.m30628I0(Boolean.FALSE);
        } else if (i13 == 4) {
            c11393q0 = new C11393q0(Boolean.FALSE);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this(k5, item, c11393q0);
    }
}

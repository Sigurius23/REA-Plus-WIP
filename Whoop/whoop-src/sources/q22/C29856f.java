package q22;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q22.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lq22/f;", "", "", "value", "Lq22/i;", "state", "Lq22/h;", "type", "<init>", "(Ljava/lang/String;Lq22/i;Lq22/h;)V", "a", "(Ljava/lang/String;Lq22/i;Lq22/h;)Lq22/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lq22/i;", "c", "()Lq22/i;", "Lq22/h;", "d", "()Lq22/h;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29856f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC29859i state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC29858h type;

    public C29856f(String value, AbstractC29859i state, EnumC29858h type) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(type, "type");
        this.value = value;
        this.state = state;
        this.type = type;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29856f m91486b(C29856f c29856f, String str, AbstractC29859i abstractC29859i, EnumC29858h enumC29858h, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c29856f.value;
        }
        if ((i13 & 2) != 0) {
            abstractC29859i = c29856f.state;
        }
        if ((i13 & 4) != 0) {
            enumC29858h = c29856f.type;
        }
        return c29856f.m91487a(str, abstractC29859i, enumC29858h);
    }

    /* JADX INFO: renamed from: a */
    public final C29856f m91487a(String value, AbstractC29859i state, EnumC29858h type) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(type, "type");
        return new C29856f(value, state, type);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC29859i getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC29858h getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29856f)) {
            return false;
        }
        C29856f c29856f = (C29856f) other;
        return AbstractC22676k.m65745e(this.value, c29856f.value) && AbstractC22676k.m65745e(this.state, c29856f.state) && this.type == c29856f.type;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.state.hashCode() + (this.value.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "PaymentMethodField(value=" + this.value + ", state=" + this.state + ", type=" + this.type + ")";
    }

    public /* synthetic */ C29856f(String str, AbstractC29859i abstractC29859i, EnumC29858h enumC29858h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? AbstractC29859i.b.f122036a : abstractC29859i, enumC29858h);
    }
}

package yi1;

import c13.AbstractC3855a;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: yi1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lyi1/h;", "Lm91/u;", "Lyi1/l;", "header", "", "error", "", "items", "<init>", "(Lyi1/l;ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyi1/l;", "b", "()Lyi1/l;", "Z", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39574h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39578l header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean error;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C39574h(C39578l header, boolean z4, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(items, "items");
        this.header = header;
        this.error = z4;
        this.items = items;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39578l getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m126438c() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39574h)) {
            return false;
        }
        C39574h c39574h = (C39574h) other;
        return AbstractC22676k.m65745e(this.header, c39574h.header) && this.error == c39574h.error && AbstractC22676k.m65745e(this.items, c39574h.items);
    }

    public int hashCode() {
        return this.items.hashCode() + AbstractC2875y.m8289b(this.header.hashCode() * 31, 31, this.error);
    }

    public String toString() {
        C39578l c39578l = this.header;
        boolean z4 = this.error;
        List<InterfaceC25312u> list = this.items;
        StringBuilder sb4 = new StringBuilder("LabradorEnabledViewState(header=");
        sb4.append(c39578l);
        sb4.append(", error=");
        sb4.append(z4);
        sb4.append(", items=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}

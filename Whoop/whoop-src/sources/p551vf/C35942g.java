package p551vf;

import c93.InterfaceC4339a;
import cg.C4560o;
import java.util.Map;
import l83.C23470p;
import p031b9.AbstractC2875y;
import p326mf.AbstractC25492l;
import p326mf.C25489i;
import p326mf.EnumC25498r;
import p326mf.InterfaceC25488h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: vf.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C35942g implements InterfaceC35936a {

    /* JADX INFO: renamed from: a */
    public final C35937b f153033a;

    /* JADX INFO: renamed from: b */
    public final boolean f153034b;

    /* JADX INFO: renamed from: c */
    public final EnumC25498r f153035c;

    /* JADX INFO: renamed from: d */
    public final C23470p f153036d;

    /* JADX INFO: renamed from: e */
    public final C23470p f153037e;

    /* JADX INFO: renamed from: f */
    public final AbstractC25492l f153038f;

    public C35942g(C35937b builder, boolean z4) {
        AbstractC22676k.m65750j(builder, "builder");
        this.f153033a = builder;
        this.f153034b = z4;
        this.f153035c = builder.f153015w;
        final int i13 = 0;
        this.f153036d = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: vf.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C35942g f153032x;

            {
                this.f153032x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.f153032x.f153033a.f153016x.m14239b();
                    case 1:
                        Map values = (Map) this.f153032x.f153033a.f153017y.f475x;
                        AbstractC22676k.m65750j(values, "values");
                        return new C25489i(values);
                    default:
                        return this.f153032x.f153033a.f153014E.m74900Q();
                }
            }
        });
        final int i14 = 1;
        this.f153037e = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: vf.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C35942g f153032x;

            {
                this.f153032x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f153032x.f153033a.f153016x.m14239b();
                    case 1:
                        Map values = (Map) this.f153032x.f153033a.f153017y.f475x;
                        AbstractC22676k.m65750j(values, "values");
                        return new C25489i(values);
                    default:
                        return this.f153032x.f153033a.f153014E.m74900Q();
                }
            }
        });
        this.f153038f = builder.f153018z;
        final int i15 = 2;
        AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: vf.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C35942g f153032x;

            {
                this.f153032x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return this.f153032x.f153033a.f153016x.m14239b();
                    case 1:
                        Map values = (Map) this.f153032x.f153033a.f153017y.f475x;
                        AbstractC22676k.m65750j(values, "values");
                        return new C25489i(values);
                    default:
                        return this.f153032x.f153033a.f153014E.m74900Q();
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35942g)) {
            return false;
        }
        C35942g c35942g = (C35942g) obj;
        return AbstractC22676k.m65745e(this.f153033a, c35942g.f153033a) && this.f153034b == c35942g.f153034b;
    }

    @Override // p551vf.InterfaceC35936a
    public final AbstractC25492l getBody() {
        return this.f153038f;
    }

    @Override // p551vf.InterfaceC35936a
    public final InterfaceC25488h getHeaders() {
        return (InterfaceC25488h) this.f153037e.getValue();
    }

    @Override // p551vf.InterfaceC35936a
    public final EnumC25498r getMethod() {
        return this.f153035c;
    }

    @Override // p551vf.InterfaceC35936a
    public final C4560o getUrl() {
        return (C4560o) this.f153036d.getValue();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153034b) + (this.f153033a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("HttpRequestBuilderView(builder=");
        sb4.append(this.f153033a);
        sb4.append(", allowToBuilder=");
        return AbstractC2875y.m8305r(sb4, this.f153034b, ')');
    }
}

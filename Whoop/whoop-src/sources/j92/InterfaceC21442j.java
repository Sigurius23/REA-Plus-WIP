package j92;

import c13.AbstractC3855a;
import java.util.List;
import jy1.C22047a;
import m83.AbstractC25265s;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: j92.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0003\u000e\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lj92/j;", "", "Ljy1/a;", "b", "()Ljy1/a;", "", "getName", "()Ljava/lang/String;", "name", "", "c", "()Ljava/lang/Boolean;", "usingCognito", "", "a", "()Ljava/util/List;", "tags", "Lj92/j$a;", "Lj92/j$b;", "Lj92/j$c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21442j {

    /* JADX INFO: renamed from: j92.j$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\u0013\u0010\u001d¨\u0006$"}, m65681d2 = {"Lj92/j$a;", "Lj92/j;", "", "usingCognito", "userSignedOut", "", "", "extraTags", "<init>", "(Ljava/lang/Boolean;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "b", "Z", "getUserSignedOut", "()Z", "Ljava/util/List;", "getExtraTags", "()Ljava/util/List;", "d", "Ljava/lang/String;", "getName", "name", "e", "tags", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC21442j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Boolean usingCognito;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean userSignedOut;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> extraTags;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<String> tags;

        public a(Boolean bool, boolean z4, List<String> extraTags) {
            AbstractC22676k.m65750j(extraTags, "extraTags");
            this.usingCognito = bool;
            this.userSignedOut = z4;
            this.extraTags = extraTags;
            this.name = "whoop.token-refresh.failure";
            this.tags = AbstractC25265s.m74129g1(AbstractC37056f.m118958J("user_signed_out:" + z4), extraTags);
        }

        @Override // j92.InterfaceC21442j
        /* JADX INFO: renamed from: a */
        public List<String> mo60344a() {
            return this.tags;
        }

        @Override // j92.InterfaceC21442j
        /* JADX INFO: renamed from: b */
        public /* bridge */ C22047a mo60345b() {
            return super.mo60345b();
        }

        @Override // j92.InterfaceC21442j
        /* JADX INFO: renamed from: c, reason: from getter */
        public Boolean getUsingCognito() {
            return this.usingCognito;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.usingCognito, aVar.usingCognito) && this.userSignedOut == aVar.userSignedOut && AbstractC22676k.m65745e(this.extraTags, aVar.extraTags);
        }

        @Override // j92.InterfaceC21442j
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            Boolean bool = this.usingCognito;
            return this.extraTags.hashCode() + AbstractC2875y.m8289b((bool == null ? 0 : bool.hashCode()) * 31, 31, this.userSignedOut);
        }

        public String toString() {
            Boolean bool = this.usingCognito;
            boolean z4 = this.userSignedOut;
            List<String> list = this.extraTags;
            StringBuilder sb4 = new StringBuilder("RefreshTokenFailureWithReasonMetric(usingCognito=");
            sb4.append(bool);
            sb4.append(", userSignedOut=");
            sb4.append(z4);
            sb4.append(", extraTags=");
            return AbstractC3855a.m11829m(sb4, list, ")");
        }
    }

    /* JADX INFO: renamed from: j92.j$b */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lj92/j$b;", "Lj92/j;", "", "usingCognito", "<init>", "(Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "getName", "name", "", "Ljava/util/List;", "()Ljava/util/List;", "tags", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC21442j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Boolean usingCognito;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String name = "whoop.token-refresh.success";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> tags = C25271y.f99162w;

        public b(Boolean bool) {
            this.usingCognito = bool;
        }

        @Override // j92.InterfaceC21442j
        /* JADX INFO: renamed from: a */
        public List<String> mo60344a() {
            return this.tags;
        }

        @Override // j92.InterfaceC21442j
        /* JADX INFO: renamed from: b */
        public /* bridge */ C22047a mo60345b() {
            return super.mo60345b();
        }

        @Override // j92.InterfaceC21442j
        /* JADX INFO: renamed from: c, reason: from getter */
        public Boolean getUsingCognito() {
            return this.usingCognito;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.usingCognito, ((b) other).usingCognito);
        }

        @Override // j92.InterfaceC21442j
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            Boolean bool = this.usingCognito;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106651j("RefreshTokenSuccessMetric(usingCognito=", this.usingCognito, ")");
        }
    }

    /* JADX INFO: renamed from: j92.j$c */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lj92/j$c;", "Lj92/j;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "c", "Ljava/lang/Void;", "d", "()Ljava/lang/Void;", "usingCognito", "", "Ljava/util/List;", "a", "()Ljava/util/List;", "tags", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC21442j {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final Void usingCognito = null;

        /* JADX INFO: renamed from: a */
        public static final c f82308a = new c();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final String name = "whoop.token-refresh.using_old_storage";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final List<String> tags = C25271y.f99162w;

        private c() {
        }

        @Override // j92.InterfaceC21442j
        /* JADX INFO: renamed from: a */
        public List<String> mo60344a() {
            return tags;
        }

        @Override // j92.InterfaceC21442j
        /* JADX INFO: renamed from: b */
        public /* bridge */ C22047a mo60345b() {
            return super.mo60345b();
        }

        @Override // j92.InterfaceC21442j
        /* JADX INFO: renamed from: c */
        public /* bridge */ /* synthetic */ Boolean getUsingCognito() {
            return (Boolean) m60347d();
        }

        /* JADX INFO: renamed from: d */
        public Void m60347d() {
            return usingCognito;
        }

        @Override // j92.InterfaceC21442j
        public String getName() {
            return name;
        }
    }

    /* JADX INFO: renamed from: a */
    List<String> mo60344a();

    /* JADX INFO: renamed from: b */
    default C22047a mo60345b() {
        List<String> listMo60344a;
        Boolean usingCognito = getUsingCognito();
        if (AbstractC22676k.m65745e(usingCognito, Boolean.TRUE)) {
            listMo60344a = AbstractC25265s.m74128f1("using_cognito:true", mo60344a());
        } else if (AbstractC22676k.m65745e(usingCognito, Boolean.FALSE)) {
            listMo60344a = AbstractC25265s.m74128f1("using_cognito:false", mo60344a());
        } else {
            if (usingCognito != null) {
                throw new NoWhenBranchMatchedException();
            }
            listMo60344a = mo60344a();
        }
        return new C22047a(0, getName(), null, listMo60344a, null, 21, null);
    }

    /* JADX INFO: renamed from: c */
    Boolean getUsingCognito();

    String getName();
}

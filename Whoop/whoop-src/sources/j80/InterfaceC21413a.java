package j80;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.activation.domain.models.ConsentSubmission;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.domain.model.UnitSystem;
import d70.C11748b;
import d70.C11749c;
import d70.C11750d;
import d70.C11751e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p90.C28997e;
import r80.EnumC31059a;

/* JADX INFO: renamed from: j80.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:0\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01\u0082\u0001023456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`a¨\u0006bÀ\u0006\u0003"}, m65681d2 = {"Lj80/a;", "Lj80/b;", "y", "p", "q", "r", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "u", "i0", "j0", "c0", "a", "m0", "g", "f", "e", "c", "d", "q0", "s0", "u0", "g0", "t0", "a0", "k0", "e0", "d0", "f0", "h0", "l0", "z", "v0", "b0", "n0", "b", "t", "s", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "l", "o", "n", "m", "j", "x", "o0", "r0", "p0", "Lj80/a$a;", "Lj80/a$b;", "Lj80/a$c;", "Lj80/a$d;", "Lj80/a$e;", "Lj80/a$f;", "Lj80/a$g;", "Lj80/a$h;", "Lj80/a$i;", "Lj80/a$j;", "Lj80/a$k;", "Lj80/a$l;", "Lj80/a$m;", "Lj80/a$n;", "Lj80/a$o;", "Lj80/a$p;", "Lj80/a$q;", "Lj80/a$r;", "Lj80/a$s;", "Lj80/a$t;", "Lj80/a$u;", "Lj80/a$v;", "Lj80/a$w;", "Lj80/a$x;", "Lj80/a$y;", "Lj80/a$z;", "Lj80/a$a0;", "Lj80/a$b0;", "Lj80/a$c0;", "Lj80/a$d0;", "Lj80/a$e0;", "Lj80/a$f0;", "Lj80/a$g0;", "Lj80/a$h0;", "Lj80/a$i0;", "Lj80/a$j0;", "Lj80/a$k0;", "Lj80/a$l0;", "Lj80/a$m0;", "Lj80/a$n0;", "Lj80/a$o0;", "Lj80/a$p0;", "Lj80/a$q0;", "Lj80/a$r0;", "Lj80/a$s0;", "Lj80/a$t0;", "Lj80/a$u0;", "Lj80/a$v0;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21413a extends InterfaceC21414b {

    /* JADX INFO: renamed from: j80.a$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$a;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final a f82094a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: j80.a$a0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj80/a$a0;", "Lj80/a;", "", "type", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String type;

        public a0(String type) {
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a0) && AbstractC22676k.m65745e(this.type, ((a0) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("GenderSubmitted(type=", this.type, ")");
        }
    }

    /* JADX INFO: renamed from: j80.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$b;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final b f82096a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: j80.a$b0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lj80/a$b0;", "Lj80/a;", "", "centimeters", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "<init>", "(ILcom/whoop/domain/model/UnitSystem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int centimeters;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final UnitSystem unitSystem;

        public b0(int i13, UnitSystem unitSystem) {
            AbstractC22676k.m65750j(unitSystem, "unitSystem");
            this.centimeters = i13;
            this.unitSystem = unitSystem;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCentimeters() {
            return this.centimeters;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final UnitSystem getUnitSystem() {
            return this.unitSystem;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) other;
            return this.centimeters == b0Var.centimeters && this.unitSystem == b0Var.unitSystem;
        }

        public int hashCode() {
            return this.unitSystem.hashCode() + (Integer.hashCode(this.centimeters) * 31);
        }

        public String toString() {
            return "HeightSubmitted(centimeters=" + this.centimeters + ", unitSystem=" + this.unitSystem + ")";
        }
    }

    /* JADX INFO: renamed from: j80.a$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$c;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final c f82099a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: j80.a$d */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj80/a$d;", "Lj80/a;", "", "country", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String country;

        public d(String country) {
            AbstractC22676k.m65750j(country, "country");
            this.country = country;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.country, ((d) other).country);
        }

        public int hashCode() {
            return this.country.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("CountrySubmitted(country=", this.country, ")");
        }
    }

    /* JADX INFO: renamed from: j80.a$d0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj80/a$d0;", "Lj80/a;", "Lr80/a;", "billingFrequency", "<init>", "(Lr80/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr80/a;", "()Lr80/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC31059a billingFrequency;

        public d0(EnumC31059a billingFrequency) {
            AbstractC22676k.m65750j(billingFrequency, "billingFrequency");
            this.billingFrequency = billingFrequency;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC31059a getBillingFrequency() {
            return this.billingFrequency;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d0) && this.billingFrequency == ((d0) other).billingFrequency;
        }

        public int hashCode() {
            return this.billingFrequency.hashCode();
        }

        public String toString() {
            return "OnBillingFrequencySelected(billingFrequency=" + this.billingFrequency + ")";
        }
    }

    /* JADX INFO: renamed from: j80.a$e */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$e;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final e f82105a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: j80.a$e0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj80/a$e0;", "Lj80/a;", "Ld70/b;", "birthday", "<init>", "(Ld70/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/b;", "()Ld70/b;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C11748b birthday;

        public e0(C11748b birthday) {
            AbstractC22676k.m65750j(birthday, "birthday");
            this.birthday = birthday;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C11748b getBirthday() {
            return this.birthday;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e0) && AbstractC22676k.m65745e(this.birthday, ((e0) other).birthday);
        }

        public int hashCode() {
            return this.birthday.hashCode();
        }

        public String toString() {
            return "OnBirthdaySubmitted(birthday=" + this.birthday + ")";
        }
    }

    /* JADX INFO: renamed from: j80.a$f */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$f;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final f f82107a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: j80.a$f0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj80/a$f0;", "Lj80/a;", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentTypeSelected", "<init>", "(Lcom/whoop/activation/domain/models/steps/CommitmentType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CommitmentType commitmentTypeSelected;

        public f0(CommitmentType commitmentTypeSelected) {
            AbstractC22676k.m65750j(commitmentTypeSelected, "commitmentTypeSelected");
            this.commitmentTypeSelected = commitmentTypeSelected;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CommitmentType getCommitmentTypeSelected() {
            return this.commitmentTypeSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f0) && this.commitmentTypeSelected == ((f0) other).commitmentTypeSelected;
        }

        public int hashCode() {
            return this.commitmentTypeSelected.hashCode();
        }

        public String toString() {
            return "OnCommitmentTypeSelected(commitmentTypeSelected=" + this.commitmentTypeSelected + ")";
        }
    }

    /* JADX INFO: renamed from: j80.a$g */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj80/a$g;", "Lj80/a;", "", "type", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String type;

        public g(String type) {
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.type, ((g) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DismissLoginError(type=", this.type, ")");
        }
    }

    /* JADX INFO: renamed from: j80.a$g0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lj80/a$g0;", "Lj80/a;", "", "optedIn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean optedIn;

        public g0(boolean z4) {
            this.optedIn = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getOptedIn() {
            return this.optedIn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g0) && this.optedIn == ((g0) other).optedIn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.optedIn);
        }

        public String toString() {
            return AbstractC3855a.m11827k("OnMarketingOptInChanged(optedIn=", ")", this.optedIn);
        }
    }

    /* JADX INFO: renamed from: j80.a$h */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$h;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final h f82111a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: j80.a$h0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lj80/a$h0;", "Lj80/a;", "", "paymentMethodIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int paymentMethodIndex;

        public h0(int i13) {
            this.paymentMethodIndex = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getPaymentMethodIndex() {
            return this.paymentMethodIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h0) && this.paymentMethodIndex == ((h0) other).paymentMethodIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.paymentMethodIndex);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.paymentMethodIndex, "OnPaymentMethodSelected(paymentMethodIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: j80.a$i */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$i;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final i f82113a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: j80.a$i0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$i0;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final i0 f82114a = new i0();

        private i0() {
        }
    }

    /* JADX INFO: renamed from: j80.a$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$j;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final j f82115a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: j80.a$j0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$j0;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final j0 f82116a = new j0();

        private j0() {
        }
    }

    /* JADX INFO: renamed from: j80.a$k */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$k;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final k f82117a = new k();

        private k() {
        }
    }

    /* JADX INFO: renamed from: j80.a$k0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj80/a$k0;", "Lj80/a;", "", "stripeToken", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String stripeToken;

        public k0(String stripeToken) {
            AbstractC22676k.m65750j(stripeToken, "stripeToken");
            this.stripeToken = stripeToken;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getStripeToken() {
            return this.stripeToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k0) && AbstractC22676k.m65745e(this.stripeToken, ((k0) other).stripeToken);
        }

        public int hashCode() {
            return this.stripeToken.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnStripeTokenCreated(stripeToken=", this.stripeToken, ")");
        }
    }

    /* JADX INFO: renamed from: j80.a$l */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj80/a$l;", "Lj80/a;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        public l(String str) {
            this.source = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && AbstractC22676k.m65745e(this.source, ((l) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("FetchAfterActivationFinalScreens(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j80.a$l0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lj80/a$l0;", "Lj80/a;", "", "consentsAccepted", "marketingOptIn", "recommendationOptIn", "", "Lcom/whoop/activation/domain/models/ConsentSubmission;", "consentSubmissions", "<init>", "(ZZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean consentsAccepted;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean marketingOptIn;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean recommendationOptIn;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<ConsentSubmission> consentSubmissions;

        public l0(boolean z4, boolean z13, boolean z14, List<ConsentSubmission> consentSubmissions) {
            AbstractC22676k.m65750j(consentSubmissions, "consentSubmissions");
            this.consentsAccepted = z4;
            this.marketingOptIn = z13;
            this.recommendationOptIn = z14;
            this.consentSubmissions = consentSubmissions;
        }

        /* JADX INFO: renamed from: a */
        public final List<ConsentSubmission> m60187a() {
            return this.consentSubmissions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getConsentsAccepted() {
            return this.consentsAccepted;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getMarketingOptIn() {
            return this.marketingOptIn;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getRecommendationOptIn() {
            return this.recommendationOptIn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l0)) {
                return false;
            }
            l0 l0Var = (l0) other;
            return this.consentsAccepted == l0Var.consentsAccepted && this.marketingOptIn == l0Var.marketingOptIn && this.recommendationOptIn == l0Var.recommendationOptIn && AbstractC22676k.m65745e(this.consentSubmissions, l0Var.consentSubmissions);
        }

        public int hashCode() {
            return this.consentSubmissions.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.consentsAccepted) * 31, 31, this.marketingOptIn), 31, this.recommendationOptIn);
        }

        public String toString() {
            boolean z4 = this.consentsAccepted;
            boolean z13 = this.marketingOptIn;
            boolean z14 = this.recommendationOptIn;
            List<ConsentSubmission> list = this.consentSubmissions;
            StringBuilder sbM32002u = AbstractC11895b.m32002u("OnTermsSubmitted(consentsAccepted=", ", marketingOptIn=", ", recommendationOptIn=", z4, z13);
            sbM32002u.append(z14);
            sbM32002u.append(", consentSubmissions=");
            sbM32002u.append(list);
            sbM32002u.append(")");
            return sbM32002u.toString();
        }
    }

    /* JADX INFO: renamed from: j80.a$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$m;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final m f82124a = new m();

        private m() {
        }
    }

    /* JADX INFO: renamed from: j80.a$m0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj80/a$m0;", "Lj80/a;", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestination", "<init>", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ActivationFlowDestination currentDestination;

        public m0(ActivationFlowDestination currentDestination) {
            AbstractC22676k.m65750j(currentDestination, "currentDestination");
            this.currentDestination = currentDestination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivationFlowDestination getCurrentDestination() {
            return this.currentDestination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m0) && this.currentDestination == ((m0) other).currentDestination;
        }

        public int hashCode() {
            return this.currentDestination.hashCode();
        }

        public String toString() {
            return "PreviousScreen(currentDestination=" + this.currentDestination + ")";
        }
    }

    /* JADX INFO: renamed from: j80.a$n */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$n;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final n f82126a = new n();

        private n() {
        }
    }

    /* JADX INFO: renamed from: j80.a$n0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lj80/a$n0;", "Lj80/a;", "", "selectedRafCodesAmount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int selectedRafCodesAmount;

        public n0(int i13) {
            this.selectedRafCodesAmount = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getSelectedRafCodesAmount() {
            return this.selectedRafCodesAmount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n0) && this.selectedRafCodesAmount == ((n0) other).selectedRafCodesAmount;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectedRafCodesAmount);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.selectedRafCodesAmount, "RafCodesSelected(selectedRafCodesAmount=", ")");
        }
    }

    /* JADX INFO: renamed from: j80.a$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$o;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final o f82128a = new o();

        private o() {
        }
    }

    /* JADX INFO: renamed from: j80.a$o0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lj80/a$o0;", "Lj80/a;", "", "shouldDismissError", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean shouldDismissError;

        public o0(boolean z4) {
            this.shouldDismissError = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShouldDismissError() {
            return this.shouldDismissError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o0) && this.shouldDismissError == ((o0) other).shouldDismissError;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldDismissError);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SetDismissErrorState(shouldDismissError=", ")", this.shouldDismissError);
        }
    }

    /* JADX INFO: renamed from: j80.a$p */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$p;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final p f82130a = new p();

        private p() {
        }
    }

    /* JADX INFO: renamed from: j80.a$p0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$p0;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final p0 f82131a = new p0();

        private p0() {
        }
    }

    /* JADX INFO: renamed from: j80.a$q */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$q;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final q f82132a = new q();

        private q() {
        }
    }

    /* JADX INFO: renamed from: j80.a$q0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj80/a$q0;", "Lj80/a;", "", "state", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String state;

        public q0(String state) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof q0) && AbstractC22676k.m65745e(this.state, ((q0) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("StateSubmitted(state=", this.state, ")");
        }
    }

    /* JADX INFO: renamed from: j80.a$r */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$r;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final r f82134a = new r();

        private r() {
        }
    }

    /* JADX INFO: renamed from: j80.a$r0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj80/a$r0;", "Lj80/a;", "Lp90/e;", "card", "<init>", "(Lp90/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp90/e;", "()Lp90/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28997e card;

        public r0(C28997e card) {
            AbstractC22676k.m65750j(card, "card");
            this.card = card;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C28997e getCard() {
            return this.card;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r0) && AbstractC22676k.m65745e(this.card, ((r0) other).card);
        }

        public int hashCode() {
            return this.card.hashCode();
        }

        public String toString() {
            return "StoreCardInMemberInfo(card=" + this.card + ")";
        }
    }

    /* JADX INFO: renamed from: j80.a$s */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$s;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final s f82136a = new s();

        private s() {
        }
    }

    /* JADX INFO: renamed from: j80.a$s0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj80/a$s0;", "Lj80/a;", "Ld70/c;", NotificationCompat.CATEGORY_EMAIL, "<init>", "(Ld70/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/c;", "()Ld70/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C11749c email;

        public s0(C11749c email) {
            AbstractC22676k.m65750j(email, "email");
            this.email = email;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C11749c getEmail() {
            return this.email;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s0) && AbstractC22676k.m65745e(this.email, ((s0) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "SubmitEmail(email=" + this.email + ")";
        }
    }

    /* JADX INFO: renamed from: j80.a$t */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$t;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final t f82138a = new t();

        private t() {
        }
    }

    /* JADX INFO: renamed from: j80.a$u */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$u;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final u f82142a = new u();

        private u() {
        }
    }

    /* JADX INFO: renamed from: j80.a$v */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$v;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final v f82145a = new v();

        private v() {
        }
    }

    /* JADX INFO: renamed from: j80.a$v0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lj80/a$v0;", "Lj80/a;", "", "pounds", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "<init>", "(ILcom/whoop/domain/model/UnitSystem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int pounds;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final UnitSystem unitSystem;

        public v0(int i13, UnitSystem unitSystem) {
            AbstractC22676k.m65750j(unitSystem, "unitSystem");
            this.pounds = i13;
            this.unitSystem = unitSystem;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getPounds() {
            return this.pounds;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final UnitSystem getUnitSystem() {
            return this.unitSystem;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v0)) {
                return false;
            }
            v0 v0Var = (v0) other;
            return this.pounds == v0Var.pounds && this.unitSystem == v0Var.unitSystem;
        }

        public int hashCode() {
            return this.unitSystem.hashCode() + (Integer.hashCode(this.pounds) * 31);
        }

        public String toString() {
            return "WeightSubmitted(pounds=" + this.pounds + ", unitSystem=" + this.unitSystem + ")";
        }
    }

    /* JADX INFO: renamed from: j80.a$w */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$w;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final w f82148a = new w();

        private w() {
        }
    }

    /* JADX INFO: renamed from: j80.a$x */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/a$x;", "Lj80/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements InterfaceC21413a {

        /* JADX INFO: renamed from: a */
        public static final x f82149a = new x();

        private x() {
        }
    }

    /* JADX INFO: renamed from: j80.a$y */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lj80/a$y;", "Lj80/a;", "Ld70/c;", NotificationCompat.CATEGORY_EMAIL, "", "fromPostPairing", "<init>", "(Ld70/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/c;", "()Ld70/c;", "b", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C11749c email;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean fromPostPairing;

        public y(C11749c email, boolean z4) {
            AbstractC22676k.m65750j(email, "email");
            this.email = email;
            this.fromPostPairing = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C11749c getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFromPostPairing() {
            return this.fromPostPairing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof y)) {
                return false;
            }
            y yVar = (y) other;
            return AbstractC22676k.m65745e(this.email, yVar.email) && this.fromPostPairing == yVar.fromPostPairing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.fromPostPairing) + (this.email.hashCode() * 31);
        }

        public String toString() {
            return "ForgotPassword(email=" + this.email + ", fromPostPairing=" + this.fromPostPairing + ")";
        }
    }

    /* JADX INFO: renamed from: j80.a$z */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj80/a$z;", "Lj80/a;", "", "type", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String type;

        public z(String str) {
            this.type = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof z) && AbstractC22676k.m65745e(this.type, ((z) other).type);
        }

        public int hashCode() {
            String str = this.type;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("GenderBaselineSubmitted(type=", this.type, ")");
        }
    }

    /* JADX INFO: renamed from: j80.a$u0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lj80/a$u0;", "Lj80/a;", "Ld70/e;", "password", "", "filledViaCredentialManager", "<init>", "(Ld70/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/e;", "b", "()Ld70/e;", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C11751e password;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean filledViaCredentialManager;

        public u0(C11751e password, boolean z4) {
            AbstractC22676k.m65750j(password, "password");
            this.password = password;
            this.filledViaCredentialManager = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFilledViaCredentialManager() {
            return this.filledViaCredentialManager;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C11751e getPassword() {
            return this.password;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof u0)) {
                return false;
            }
            u0 u0Var = (u0) other;
            return AbstractC22676k.m65745e(this.password, u0Var.password) && this.filledViaCredentialManager == u0Var.filledViaCredentialManager;
        }

        public int hashCode() {
            return Boolean.hashCode(this.filledViaCredentialManager) + (this.password.hashCode() * 31);
        }

        public String toString() {
            return "SubmitPassword(password=" + this.password + ", filledViaCredentialManager=" + this.filledViaCredentialManager + ")";
        }

        public /* synthetic */ u0(C11751e c11751e, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c11751e, (i13 & 2) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: j80.a$c0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lj80/a$c0;", "Lj80/a;", "", "isSkipAction", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestination", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "<init>", "(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)V", "a", "(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lj80/a$c0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "c", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "d", "()Lcom/whoop/activation/iajf/domain/SignUpSource;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isSkipAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ActivationFlowDestination currentDestination;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final SignUpSource signUpSource;

        public c0(boolean z4, ActivationFlowDestination activationFlowDestination, SignUpSource signUpSource) {
            AbstractC22676k.m65750j(signUpSource, "signUpSource");
            this.isSkipAction = z4;
            this.currentDestination = activationFlowDestination;
            this.signUpSource = signUpSource;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c0 m60173b(c0 c0Var, boolean z4, ActivationFlowDestination activationFlowDestination, SignUpSource signUpSource, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = c0Var.isSkipAction;
            }
            if ((i13 & 2) != 0) {
                activationFlowDestination = c0Var.currentDestination;
            }
            if ((i13 & 4) != 0) {
                signUpSource = c0Var.signUpSource;
            }
            return c0Var.m60174a(z4, activationFlowDestination, signUpSource);
        }

        /* JADX INFO: renamed from: a */
        public final c0 m60174a(boolean isSkipAction, ActivationFlowDestination currentDestination, SignUpSource signUpSource) {
            AbstractC22676k.m65750j(signUpSource, "signUpSource");
            return new c0(isSkipAction, currentDestination, signUpSource);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ActivationFlowDestination getCurrentDestination() {
            return this.currentDestination;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final SignUpSource getSignUpSource() {
            return this.signUpSource;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsSkipAction() {
            return this.isSkipAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) other;
            return this.isSkipAction == c0Var.isSkipAction && this.currentDestination == c0Var.currentDestination && this.signUpSource == c0Var.signUpSource;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isSkipAction) * 31;
            ActivationFlowDestination activationFlowDestination = this.currentDestination;
            return this.signUpSource.hashCode() + ((iHashCode + (activationFlowDestination == null ? 0 : activationFlowDestination.hashCode())) * 31);
        }

        public String toString() {
            return "NextScreen(isSkipAction=" + this.isSkipAction + ", currentDestination=" + this.currentDestination + ", signUpSource=" + this.signUpSource + ")";
        }

        public /* synthetic */ c0(boolean z4, ActivationFlowDestination activationFlowDestination, SignUpSource signUpSource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : activationFlowDestination, (i13 & 4) != 0 ? SignUpSource.ACTIVATION : signUpSource);
        }
    }

    /* JADX INFO: renamed from: j80.a$t0 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lj80/a$t0;", "Lj80/a;", "Ld70/d;", "firstName", "lastName", "", "username", "<init>", "(Ld70/d;Ld70/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/d;", "()Ld70/d;", "b", "c", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t0 implements InterfaceC21413a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C11750d firstName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C11750d lastName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String username;

        public t0(C11750d c11750d, C11750d c11750d2, String str) {
            this.firstName = c11750d;
            this.lastName = c11750d2;
            this.username = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C11750d getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C11750d getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t0)) {
                return false;
            }
            t0 t0Var = (t0) other;
            return AbstractC22676k.m65745e(this.firstName, t0Var.firstName) && AbstractC22676k.m65745e(this.lastName, t0Var.lastName) && AbstractC22676k.m65745e(this.username, t0Var.username);
        }

        public int hashCode() {
            C11750d c11750d = this.firstName;
            int iHashCode = (c11750d == null ? 0 : c11750d.hashCode()) * 31;
            C11750d c11750d2 = this.lastName;
            int iHashCode2 = (iHashCode + (c11750d2 == null ? 0 : c11750d2.hashCode())) * 31;
            String str = this.username;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            C11750d c11750d = this.firstName;
            C11750d c11750d2 = this.lastName;
            String str = this.username;
            StringBuilder sb4 = new StringBuilder("SubmitNameInfo(firstName=");
            sb4.append(c11750d);
            sb4.append(", lastName=");
            sb4.append(c11750d2);
            sb4.append(", username=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ t0(C11750d c11750d, C11750d c11750d2, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : c11750d, (i13 & 2) != 0 ? null : c11750d2, (i13 & 4) != 0 ? null : str);
        }
    }
}

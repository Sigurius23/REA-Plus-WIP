package em1;

import android.companion.CompanionDeviceManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: em1.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lem1/k;", "Lem1/t;", "<init>", "()V", "c", "e", "d", "b", "f", "a", "Lem1/k$a;", "Lem1/k$b;", "Lem1/k$c;", "Lem1/k$d;", "Lem1/k$e;", "Lem1/k$f;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13337k implements InterfaceC13346t {

    /* JADX INFO: renamed from: em1.k$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lem1/k$a;", "Lem1/k;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC13337k {

        /* JADX INFO: renamed from: a */
        public static final a f46205a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: em1.k$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lem1/k$b;", "Lem1/k;", "Landroid/companion/CompanionDeviceManager$Callback;", "callback", "<init>", "(Landroid/companion/CompanionDeviceManager$Callback;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/companion/CompanionDeviceManager$Callback;", "()Landroid/companion/CompanionDeviceManager$Callback;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC13337k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CompanionDeviceManager.Callback callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CompanionDeviceManager.Callback callback) {
            super(null);
            AbstractC22676k.m65750j(callback, "callback");
            this.callback = callback;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CompanionDeviceManager.Callback getCallback() {
            return this.callback;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.callback, ((b) other).callback);
        }

        public int hashCode() {
            return this.callback.hashCode();
        }

        public String toString() {
            return "CdmContinue(callback=" + this.callback + ")";
        }
    }

    /* JADX INFO: renamed from: em1.k$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lem1/k$c;", "Lem1/k;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC13337k {

        /* JADX INFO: renamed from: a */
        public static final c f46207a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: em1.k$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lem1/k$d;", "Lem1/k;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC13337k {

        /* JADX INFO: renamed from: a */
        public static final d f46208a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: em1.k$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lem1/k$e;", "Lem1/k;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC13337k {

        /* JADX INFO: renamed from: a */
        public static final e f46209a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: em1.k$f */
    @Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lem1/k$f;", "Lem1/k;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC13337k {
    }

    public /* synthetic */ AbstractC13337k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13337k() {
    }
}

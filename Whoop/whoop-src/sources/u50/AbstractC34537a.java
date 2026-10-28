package u50;

import c13.AbstractC3855a;
import com.whoop.access.omronauth.domain.models.OmronAuthModel;
import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: u50.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Lu50/a;", "", "<init>", "()V", "e", "d", "c", "b", "f", "i", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lu50/a$a;", "Lu50/a$b;", "Lu50/a$c;", "Lu50/a$d;", "Lu50/a$e;", "Lu50/a$f;", "Lu50/a$g;", "Lu50/a$h;", "Lu50/a$i;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34537a {

    /* JADX INFO: renamed from: u50.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lu50/a$a;", "Lu50/a;", "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "model", "<init>", "(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "()Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC34537a {

        /* JADX INFO: renamed from: b */
        public static final int f145163b = ((((C9598e.f28134d | CardButtonModel.$stable) | FeatureListModel.$stable) | TitleSubTitleModel.$stable) | ImageUrlModel.$stable) | NavigationBarModel.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final OmronAuthModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OmronAuthModel model) {
            super(null);
            AbstractC22676k.m65750j(model, "model");
            this.model = model;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final OmronAuthModel getModel() {
            return this.model;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.model, ((a) other).model);
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        public String toString() {
            return "ApplyContent(model=" + this.model + ")";
        }
    }

    /* JADX INFO: renamed from: u50.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu50/a$b;", "Lu50/a;", "<init>", "()V", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC34537a {

        /* JADX INFO: renamed from: a */
        public static final b f145165a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: u50.a$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lu50/a$c;", "Lu50/a;", "", "success", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC34537a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean success;

        public c(boolean z4) {
            super(null);
            this.success = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.success == ((c) other).success;
        }

        public int hashCode() {
            return Boolean.hashCode(this.success);
        }

        public String toString() {
            return AbstractC3855a.m11827k("FinishOAuth(success=", ")", this.success);
        }
    }

    /* JADX INFO: renamed from: u50.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu50/a$d;", "Lu50/a;", "<init>", "()V", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC34537a {

        /* JADX INFO: renamed from: a */
        public static final d f145167a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: u50.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu50/a$e;", "Lu50/a;", "<init>", "()V", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC34537a {

        /* JADX INFO: renamed from: a */
        public static final e f145168a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: u50.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu50/a$f;", "Lu50/a;", "<init>", "()V", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC34537a {

        /* JADX INFO: renamed from: a */
        public static final f f145169a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: u50.a$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu50/a$g;", "Lu50/a;", "<init>", "()V", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC34537a {

        /* JADX INFO: renamed from: a */
        public static final g f145170a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: u50.a$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu50/a$h;", "Lu50/a;", "<init>", "()V", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC34537a {

        /* JADX INFO: renamed from: a */
        public static final h f145171a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: u50.a$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu50/a$i;", "Lu50/a;", "<init>", "()V", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC34537a {

        /* JADX INFO: renamed from: a */
        public static final i f145172a = new i();

        private i() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC34537a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34537a() {
    }
}

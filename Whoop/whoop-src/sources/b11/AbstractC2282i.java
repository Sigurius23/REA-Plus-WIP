package b11;

import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import x81.C38072d;

/* JADX INFO: renamed from: b11.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0014\u0011\u001c\u001d\u000e\f\u0018\u001eB9\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\b\u001f !\"#$%&¨\u0006'"}, m65681d2 = {"Lb11/i;", "", "", "icon", "statusIcon", "Lcom/whoop/design/util/TextResource;", "contentDescription", "", "enableIconAnimation", "minutes", "<init>", "(IILcom/whoop/design/util/TextResource;ZLjava/lang/Integer;)V", "a", "I", "b", "()I", "getStatusIcon", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "Z", "getEnableIconAnimation", "()Z", "e", "Ljava/lang/Integer;", "getMinutes", "()Ljava/lang/Integer;", "g", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lb11/i$a;", "Lb11/i$b;", "Lb11/i$c;", "Lb11/i$d;", "Lb11/i$e;", "Lb11/i$f;", "Lb11/i$g;", "Lb11/i$h;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2282i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int statusIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource contentDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean enableIconAnimation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer minutes;

    /* JADX INFO: renamed from: b11.i$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m65681d2 = {"Lb11/i$a;", "Lb11/i;", "", "minutesBehind", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "I", "getMinutesBehind", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC2282i {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int minutesBehind;

        public /* synthetic */ a(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i13);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.minutesBehind == ((a) other).minutesBehind;
        }

        public int hashCode() {
            return Integer.hashCode(this.minutesBehind);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.minutesBehind, "ChargingStateAndCatchingUp(minutesBehind=", ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i13) {
            super(0, C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), new TextResource.C8688b(AbstractC16277f.f62370r, null, 2, 0 == true ? 1 : 0), true, Integer.valueOf(i13), 1, null);
            this.minutesBehind = i13;
        }
    }

    /* JADX INFO: renamed from: b11.i$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lb11/i$b;", "Lb11/i;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC2282i {

        /* JADX INFO: renamed from: f */
        public static final b f9057f = new b();

        /* JADX WARN: Multi-variable type inference failed */
        private b() {
            super(0, C38072d.f163053a.m121951d().getTinyIcons().getEllipse(), new TextResource.C8688b(AbstractC16277f.f62366q, null, 2, 0 == true ? 1 : 0), false, null, 25, null);
        }
    }

    /* JADX INFO: renamed from: b11.i$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m65681d2 = {"Lb11/i$c;", "Lb11/i;", "", "minutesBehind", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "I", "getMinutesBehind", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC2282i {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int minutesBehind;

        public /* synthetic */ c(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i13);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.minutesBehind == ((c) other).minutesBehind;
        }

        public int hashCode() {
            return Integer.hashCode(this.minutesBehind);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.minutesBehind, "ConnectedAndCatchingUp(minutesBehind=", ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(int i13) {
            super(0, C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), new TextResource.C8688b(AbstractC16277f.f62390w, null, 2, 0 == true ? 1 : 0), true, Integer.valueOf(i13), 1, null);
            this.minutesBehind = i13;
        }
    }

    /* JADX INFO: renamed from: b11.i$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lb11/i$d;", "Lb11/i;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC2282i {

        /* JADX INFO: renamed from: f */
        public static final d f9059f = new d();

        /* JADX WARN: Multi-variable type inference failed */
        private d() {
            super(0, C38072d.f163053a.m121951d().getTinyIcons().getEllipse(), new TextResource.C8688b(AbstractC16277f.f62386v, null, 2, 0 == true ? 1 : 0), false, null, 25, null);
        }
    }

    /* JADX INFO: renamed from: b11.i$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lb11/i$e;", "Lb11/i;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC2282i {

        /* JADX INFO: renamed from: f */
        public static final e f9060f = new e();

        /* JADX WARN: Multi-variable type inference failed */
        private e() {
            super(0, C38072d.f163053a.m121951d().getTinyIcons().getEllipse(), new TextResource.C8688b(AbstractC16277f.f62374s, null, 2, 0 == true ? 1 : 0), false, null, 25, null);
        }
    }

    /* JADX INFO: renamed from: b11.i$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m65681d2 = {"Lb11/i$f;", "Lb11/i;", "", "minutesBehind", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "I", "getMinutesBehind", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC2282i {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int minutesBehind;

        public /* synthetic */ f(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i13);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.minutesBehind == ((f) other).minutesBehind;
        }

        public int hashCode() {
            return Integer.hashCode(this.minutesBehind);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.minutesBehind, "LowChargeAndCatchingUp(minutesBehind=", ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(int i13) {
            super(0, C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), new TextResource.C8688b(AbstractC16277f.f62378t, null, 2, 0 == true ? 1 : 0), true, Integer.valueOf(i13), 1, null);
            this.minutesBehind = i13;
        }
    }

    /* JADX INFO: renamed from: b11.i$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lb11/i$g;", "Lb11/i;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC2282i {

        /* JADX INFO: renamed from: f */
        public static final g f9062f = new g();

        /* JADX WARN: Multi-variable type inference failed */
        private g() {
            super(0, C38072d.f163053a.m121951d().getTinyIcons().getEllipse(), new TextResource.C8688b(AbstractC16277f.f62382u, null, 2, 0 == true ? 1 : 0), false, null, 25, null);
        }
    }

    /* JADX INFO: renamed from: b11.i$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lb11/i$h;", "Lb11/i;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC2282i {

        /* JADX INFO: renamed from: f */
        public static final h f9063f = new h();

        /* JADX WARN: Multi-variable type inference failed */
        private h() {
            super(0, C38072d.f163053a.m121951d().getTinyIcons().getEllipse(), new TextResource.C8688b(AbstractC16277f.f62394x, null, 2, 0 == true ? 1 : 0), false, null, 25, null);
        }
    }

    public /* synthetic */ AbstractC2282i(int i13, int i14, TextResource textResource, boolean z4, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, textResource, z4, num);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    private AbstractC2282i(int i13, int i14, TextResource textResource, boolean z4, Integer num) {
        this.icon = i13;
        this.statusIcon = i14;
        this.contentDescription = textResource;
        this.enableIconAnimation = z4;
        this.minutes = num;
    }

    public /* synthetic */ AbstractC2282i(int i13, int i14, TextResource textResource, boolean z4, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? C38072d.f163053a.m121951d().getStrap().getStrapCutout() : i13, i14, textResource, (i15 & 8) != 0 ? false : z4, (i15 & 16) != 0 ? null : num, null);
    }
}

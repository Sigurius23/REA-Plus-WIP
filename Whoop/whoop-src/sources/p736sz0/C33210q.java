package p736sz0;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: sz0.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u008e\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b6\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b=\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b2\u0010?R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b)\u00109¨\u0006@"}, m65681d2 = {"Lsz0/q;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/util/TextResource;", "stat", "", "statIcon", "statSuffix", "Lsz0/h1;", "statSuffixType", "Lsz0/g1;", "statTrend", "statTitle", "", "isPressed", "Ly81/f;", "statValueTextColor", "statTitleTextColor", "Lsz0/f1;", "statAlignment", "forcesStatAndSuffixLeftToRight", "<init>", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;Z)V", "a", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;Z)Lsz0/q;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lsz0/h1;", "i", "()Lsz0/h1;", "f", "Lsz0/g1;", "l", "()Lsz0/g1;", "j", "Z", "n", "()Z", "Ly81/f;", "m", "()Ly81/f;", "k", "Lsz0/f1;", "()Lsz0/f1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33210q implements InterfaceC25312u {

    /* JADX INFO: renamed from: m */
    public static final int f138488m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource stat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer statIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource statSuffix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC33185h1 statSuffixType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C33182g1 statTrend;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource statTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isPressed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC39333f statValueTextColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC39333f statTitleTextColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC33179f1 statAlignment;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean forcesStatAndSuffixLeftToRight;

    public C33210q(Object event, TextResource stat, Integer num, TextResource textResource, EnumC33185h1 statSuffixType, C33182g1 c33182g1, TextResource statTitle, boolean z4, EnumC39333f statValueTextColor, EnumC39333f statTitleTextColor, EnumC33179f1 statAlignment, boolean z13) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(stat, "stat");
        AbstractC22676k.m65750j(statSuffixType, "statSuffixType");
        AbstractC22676k.m65750j(statTitle, "statTitle");
        AbstractC22676k.m65750j(statValueTextColor, "statValueTextColor");
        AbstractC22676k.m65750j(statTitleTextColor, "statTitleTextColor");
        AbstractC22676k.m65750j(statAlignment, "statAlignment");
        this.event = event;
        this.stat = stat;
        this.statIcon = num;
        this.statSuffix = textResource;
        this.statSuffixType = statSuffixType;
        this.statTrend = c33182g1;
        this.statTitle = statTitle;
        this.isPressed = z4;
        this.statValueTextColor = statValueTextColor;
        this.statTitleTextColor = statTitleTextColor;
        this.statAlignment = statAlignment;
        this.forcesStatAndSuffixLeftToRight = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33210q m105317b(C33210q c33210q, Object obj, TextResource textResource, Integer num, TextResource textResource2, EnumC33185h1 enumC33185h1, C33182g1 c33182g1, TextResource textResource3, boolean z4, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC33179f1 enumC33179f1, boolean z13, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = c33210q.event;
        }
        if ((i13 & 2) != 0) {
            textResource = c33210q.stat;
        }
        if ((i13 & 4) != 0) {
            num = c33210q.statIcon;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c33210q.statSuffix;
        }
        if ((i13 & 16) != 0) {
            enumC33185h1 = c33210q.statSuffixType;
        }
        if ((i13 & 32) != 0) {
            c33182g1 = c33210q.statTrend;
        }
        if ((i13 & 64) != 0) {
            textResource3 = c33210q.statTitle;
        }
        if ((i13 & 128) != 0) {
            z4 = c33210q.isPressed;
        }
        if ((i13 & 256) != 0) {
            enumC39333f = c33210q.statValueTextColor;
        }
        if ((i13 & 512) != 0) {
            enumC39333f2 = c33210q.statTitleTextColor;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            enumC33179f1 = c33210q.statAlignment;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            z13 = c33210q.forcesStatAndSuffixLeftToRight;
        }
        EnumC33179f1 enumC33179f2 = enumC33179f1;
        boolean z14 = z13;
        EnumC39333f enumC39333f3 = enumC39333f;
        EnumC39333f enumC39333f4 = enumC39333f2;
        TextResource textResource4 = textResource3;
        boolean z15 = z4;
        EnumC33185h1 enumC33185h2 = enumC33185h1;
        C33182g1 c33182g2 = c33182g1;
        return c33210q.m105318a(obj, textResource, num, textResource2, enumC33185h2, c33182g2, textResource4, z15, enumC39333f3, enumC39333f4, enumC33179f2, z14);
    }

    /* JADX INFO: renamed from: a */
    public final C33210q m105318a(Object event, TextResource stat, Integer statIcon, TextResource statSuffix, EnumC33185h1 statSuffixType, C33182g1 statTrend, TextResource statTitle, boolean isPressed, EnumC39333f statValueTextColor, EnumC39333f statTitleTextColor, EnumC33179f1 statAlignment, boolean forcesStatAndSuffixLeftToRight) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(stat, "stat");
        AbstractC22676k.m65750j(statSuffixType, "statSuffixType");
        AbstractC22676k.m65750j(statTitle, "statTitle");
        AbstractC22676k.m65750j(statValueTextColor, "statValueTextColor");
        AbstractC22676k.m65750j(statTitleTextColor, "statTitleTextColor");
        AbstractC22676k.m65750j(statAlignment, "statAlignment");
        return new C33210q(event, stat, statIcon, statSuffix, statSuffixType, statTrend, statTitle, isPressed, statValueTextColor, statTitleTextColor, statAlignment, forcesStatAndSuffixLeftToRight);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getForcesStatAndSuffixLeftToRight() {
        return this.forcesStatAndSuffixLeftToRight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getStat() {
        return this.stat;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33210q)) {
            return false;
        }
        C33210q c33210q = (C33210q) other;
        return AbstractC22676k.m65745e(this.event, c33210q.event) && AbstractC22676k.m65745e(this.stat, c33210q.stat) && AbstractC22676k.m65745e(this.statIcon, c33210q.statIcon) && AbstractC22676k.m65745e(this.statSuffix, c33210q.statSuffix) && this.statSuffixType == c33210q.statSuffixType && AbstractC22676k.m65745e(this.statTrend, c33210q.statTrend) && AbstractC22676k.m65745e(this.statTitle, c33210q.statTitle) && this.isPressed == c33210q.isPressed && this.statValueTextColor == c33210q.statValueTextColor && this.statTitleTextColor == c33210q.statTitleTextColor && this.statAlignment == c33210q.statAlignment && this.forcesStatAndSuffixLeftToRight == c33210q.forcesStatAndSuffixLeftToRight;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC33179f1 getStatAlignment() {
        return this.statAlignment;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getStatIcon() {
        return this.statIcon;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent, reason: from getter */
    public Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getStatSuffix() {
        return this.statSuffix;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.event.hashCode() * 31, this.stat, 31);
        Integer num = this.statIcon;
        int iHashCode = (iM95625a + (num == null ? 0 : num.hashCode())) * 31;
        TextResource textResource = this.statSuffix;
        int iHashCode2 = (this.statSuffixType.hashCode() + ((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31;
        C33182g1 c33182g1 = this.statTrend;
        return Boolean.hashCode(this.forcesStatAndSuffixLeftToRight) + ((this.statAlignment.hashCode() + AbstractC21702c.m61132c(this.statTitleTextColor, AbstractC21702c.m61132c(this.statValueTextColor, AbstractC2875y.m8289b(AbstractC31061c.m95625a((iHashCode2 + (c33182g1 != null ? c33182g1.hashCode() : 0)) * 31, this.statTitle, 31), 31, this.isPressed), 31), 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC33185h1 getStatSuffixType() {
        return this.statSuffixType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getStatTitle() {
        return this.statTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC39333f getStatTitleTextColor() {
        return this.statTitleTextColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C33182g1 getStatTrend() {
        return this.statTrend;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC39333f getStatValueTextColor() {
        return this.statValueTextColor;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsPressed() {
        return this.isPressed;
    }

    public String toString() {
        Object obj = this.event;
        TextResource textResource = this.stat;
        Integer num = this.statIcon;
        TextResource textResource2 = this.statSuffix;
        EnumC33185h1 enumC33185h1 = this.statSuffixType;
        C33182g1 c33182g1 = this.statTrend;
        TextResource textResource3 = this.statTitle;
        boolean z4 = this.isPressed;
        EnumC39333f enumC39333f = this.statValueTextColor;
        EnumC39333f enumC39333f2 = this.statTitleTextColor;
        EnumC33179f1 enumC33179f1 = this.statAlignment;
        boolean z13 = this.forcesStatAndSuffixLeftToRight;
        StringBuilder sb4 = new StringBuilder("HorizontalStatState(event=");
        sb4.append(obj);
        sb4.append(", stat=");
        sb4.append(textResource);
        sb4.append(", statIcon=");
        sb4.append(num);
        sb4.append(", statSuffix=");
        sb4.append(textResource2);
        sb4.append(", statSuffixType=");
        sb4.append(enumC33185h1);
        sb4.append(", statTrend=");
        sb4.append(c33182g1);
        sb4.append(", statTitle=");
        AbstractC33745d.m106664w(textResource3, ", isPressed=", ", statValueTextColor=", sb4, z4);
        sb4.append(enumC39333f);
        sb4.append(", statTitleTextColor=");
        sb4.append(enumC39333f2);
        sb4.append(", statAlignment=");
        sb4.append(enumC33179f1);
        sb4.append(", forcesStatAndSuffixLeftToRight=");
        sb4.append(z13);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C33210q(Object obj, TextResource textResource, Integer num, TextResource textResource2, EnumC33185h1 enumC33185h1, C33182g1 c33182g1, TextResource textResource3, boolean z4, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC33179f1 enumC33179f1, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, textResource, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : textResource2, (i13 & 16) != 0 ? EnumC33185h1.TEXT : enumC33185h1, (i13 & 32) != 0 ? null : c33182g1, textResource3, (i13 & 128) != 0 ? false : z4, (i13 & 256) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i13 & 512) != 0 ? EnumC39333f.WHITE_50 : enumC39333f2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC33179f1.Start : enumC33179f1, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z13);
    }
}

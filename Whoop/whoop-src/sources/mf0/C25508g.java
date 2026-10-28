package mf0;

import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import ny0.C27238a0;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import ze0.AbstractC40584c;

/* JADX INFO: renamed from: mf0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b*\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b+\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b#\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b'\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\u001f\u00105R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b3\u00108¨\u00069"}, m65681d2 = {"Lmf0/g;", "", "Lze0/c$d;", "navigationBar", "Lkd1/o;", "imageUrl", "", "title", "subtitle", "nameLabel", "nameValue", "dateLabel", "Lgz0/m0;", "dateIcon", "timeLabel", "Lorg/joda/time/LocalDateTime;", "dateTimeValue", "Lny0/a0;", "button", "", "isDateTimeSelected", "<init>", "(Lze0/c$d;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lny0/a0;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lze0/c$d;", "g", "()Lze0/c$d;", "b", "Lkd1/o;", "d", "()Lkd1/o;", "c", "Ljava/lang/String;", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "f", "Lgz0/m0;", "getDateIcon", "()Lgz0/m0;", "i", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "k", "Lny0/a0;", "()Lny0/a0;", "l", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25508g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC40584c.d navigationBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String nameLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String nameValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String dateLabel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC16313m0 dateIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String timeLabel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final LocalDateTime dateTimeValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C27238a0 button;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isDateTimeSelected;

    public C25508g(AbstractC40584c.d navigationBar, AbstractC22403o imageUrl, String title, String subtitle, String nameLabel, String str, String dateLabel, EnumC16313m0 enumC16313m0, String timeLabel, LocalDateTime dateTimeValue, C27238a0 button, boolean z4) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(nameLabel, "nameLabel");
        AbstractC22676k.m65750j(dateLabel, "dateLabel");
        AbstractC22676k.m65750j(timeLabel, "timeLabel");
        AbstractC22676k.m65750j(dateTimeValue, "dateTimeValue");
        AbstractC22676k.m65750j(button, "button");
        this.navigationBar = navigationBar;
        this.imageUrl = imageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.nameLabel = nameLabel;
        this.nameValue = str;
        this.dateLabel = dateLabel;
        this.dateIcon = enumC16313m0;
        this.timeLabel = timeLabel;
        this.dateTimeValue = dateTimeValue;
        this.button = button;
        this.isDateTimeSelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27238a0 getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDateLabel() {
        return this.dateLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDateTime getDateTimeValue() {
        return this.dateTimeValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNameLabel() {
        return this.nameLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25508g)) {
            return false;
        }
        C25508g c25508g = (C25508g) other;
        return AbstractC22676k.m65745e(this.navigationBar, c25508g.navigationBar) && AbstractC22676k.m65745e(this.imageUrl, c25508g.imageUrl) && AbstractC22676k.m65745e(this.title, c25508g.title) && AbstractC22676k.m65745e(this.subtitle, c25508g.subtitle) && AbstractC22676k.m65745e(this.nameLabel, c25508g.nameLabel) && AbstractC22676k.m65745e(this.nameValue, c25508g.nameValue) && AbstractC22676k.m65745e(this.dateLabel, c25508g.dateLabel) && this.dateIcon == c25508g.dateIcon && AbstractC22676k.m65745e(this.timeLabel, c25508g.timeLabel) && AbstractC22676k.m65745e(this.dateTimeValue, c25508g.dateTimeValue) && AbstractC22676k.m65745e(this.button, c25508g.button) && this.isDateTimeSelected == c25508g.isDateTimeSelected;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNameValue() {
        return this.nameValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC40584c.d getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC30007c.m91833c(this.imageUrl, this.navigationBar.hashCode() * 31, 31), 31, this.title), 31, this.subtitle), 31, this.nameLabel);
        String str = this.nameValue;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.dateLabel);
        EnumC16313m0 enumC16313m0 = this.dateIcon;
        return Boolean.hashCode(this.isDateTimeSelected) + ((this.button.hashCode() + ((this.dateTimeValue.hashCode() + AbstractC11266d.m30450d((iM30450d2 + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0)) * 31, 31, this.timeLabel)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsDateTimeSelected() {
        return this.isDateTimeSelected;
    }

    public String toString() {
        AbstractC40584c.d dVar = this.navigationBar;
        AbstractC22403o abstractC22403o = this.imageUrl;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.nameLabel;
        String str4 = this.nameValue;
        String str5 = this.dateLabel;
        EnumC16313m0 enumC16313m0 = this.dateIcon;
        String str6 = this.timeLabel;
        LocalDateTime localDateTime = this.dateTimeValue;
        C27238a0 c27238a0 = this.button;
        boolean z4 = this.isDateTimeSelected;
        StringBuilder sb4 = new StringBuilder("TestInputViewState(navigationBar=");
        sb4.append(dVar);
        sb4.append(", imageUrl=");
        sb4.append(abstractC22403o);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str, ", subtitle=", str2, ", nameLabel=");
        AbstractC11266d.m30444B(sb4, str3, ", nameValue=", str4, ", dateLabel=");
        sb4.append(str5);
        sb4.append(", dateIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", timeLabel=");
        sb4.append(str6);
        sb4.append(", dateTimeValue=");
        sb4.append(localDateTime);
        sb4.append(", button=");
        sb4.append(c27238a0);
        sb4.append(", isDateTimeSelected=");
        sb4.append(z4);
        sb4.append(")");
        return sb4.toString();
    }
}

package kf2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import x81.C38072d;
import y00.AbstractC38963t7;
import y71.C39274g;

/* JADX INFO: renamed from: kf2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b(\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b#\u00101R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010 \u001a\u0004\b2\u0010\"R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b4\u0010\"R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b3\u0010\"R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b-\u0010,¨\u00065"}, m65681d2 = {"Lkf2/b;", "", "", "showScheduleList", "", "Lkf2/a;", "alarmScheduleList", "showCreatedButton", "shouldShowCallOutText", "Lcom/whoop/design/util/TextResource;", "callOutText", "Ly81/f;", "callOutTextColor", "Ly71/g;", "callOutIcon", "shouldShowDescriptionText", "descriptionText", "isScheduleEnabled", "shouldShowOverlay", "scheduleOffText", "<init>", "(ZLjava/util/List;ZZLcom/whoop/design/util/TextResource;Ly81/f;Ly71/g;ZLcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "k", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "j", "d", "g", "e", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "f", "Ly81/f;", "()Ly81/f;", "Ly71/g;", "()Ly71/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "l", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22443b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showScheduleList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C22442a> alarmScheduleList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showCreatedButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean shouldShowCallOutText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource callOutText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f callOutTextColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C39274g callOutIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean shouldShowDescriptionText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource descriptionText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isScheduleEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean shouldShowOverlay;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource scheduleOffText;

    public C22443b(boolean z4, List<C22442a> alarmScheduleList, boolean z13, boolean z14, TextResource callOutText, EnumC39333f callOutTextColor, C39274g callOutIcon, boolean z15, TextResource descriptionText, boolean z16, boolean z17, TextResource scheduleOffText) {
        AbstractC22676k.m65750j(alarmScheduleList, "alarmScheduleList");
        AbstractC22676k.m65750j(callOutText, "callOutText");
        AbstractC22676k.m65750j(callOutTextColor, "callOutTextColor");
        AbstractC22676k.m65750j(callOutIcon, "callOutIcon");
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        AbstractC22676k.m65750j(scheduleOffText, "scheduleOffText");
        this.showScheduleList = z4;
        this.alarmScheduleList = alarmScheduleList;
        this.showCreatedButton = z13;
        this.shouldShowCallOutText = z14;
        this.callOutText = callOutText;
        this.callOutTextColor = callOutTextColor;
        this.callOutIcon = callOutIcon;
        this.shouldShowDescriptionText = z15;
        this.descriptionText = descriptionText;
        this.isScheduleEnabled = z16;
        this.shouldShowOverlay = z17;
        this.scheduleOffText = scheduleOffText;
    }

    /* JADX INFO: renamed from: a */
    public final List<C22442a> m64762a() {
        return this.alarmScheduleList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39274g getCallOutIcon() {
        return this.callOutIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCallOutText() {
        return this.callOutText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC39333f getCallOutTextColor() {
        return this.callOutTextColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDescriptionText() {
        return this.descriptionText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22443b)) {
            return false;
        }
        C22443b c22443b = (C22443b) other;
        return this.showScheduleList == c22443b.showScheduleList && AbstractC22676k.m65745e(this.alarmScheduleList, c22443b.alarmScheduleList) && this.showCreatedButton == c22443b.showCreatedButton && this.shouldShowCallOutText == c22443b.shouldShowCallOutText && AbstractC22676k.m65745e(this.callOutText, c22443b.callOutText) && this.callOutTextColor == c22443b.callOutTextColor && AbstractC22676k.m65745e(this.callOutIcon, c22443b.callOutIcon) && this.shouldShowDescriptionText == c22443b.shouldShowDescriptionText && AbstractC22676k.m65745e(this.descriptionText, c22443b.descriptionText) && this.isScheduleEnabled == c22443b.isScheduleEnabled && this.shouldShowOverlay == c22443b.shouldShowOverlay && AbstractC22676k.m65745e(this.scheduleOffText, c22443b.scheduleOffText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getScheduleOffText() {
        return this.scheduleOffText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShouldShowCallOutText() {
        return this.shouldShowCallOutText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShouldShowDescriptionText() {
        return this.shouldShowDescriptionText;
    }

    public int hashCode() {
        return this.scheduleOffText.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC2875y.m8289b((this.callOutIcon.hashCode() + AbstractC21702c.m61132c(this.callOutTextColor, AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(Boolean.hashCode(this.showScheduleList) * 31, 31, this.alarmScheduleList), 31, this.showCreatedButton), 31, this.shouldShowCallOutText), this.callOutText, 31), 31)) * 31, 31, this.shouldShowDescriptionText), this.descriptionText, 31), 31, this.isScheduleEnabled), 31, this.shouldShowOverlay);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShouldShowOverlay() {
        return this.shouldShowOverlay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getShowCreatedButton() {
        return this.showCreatedButton;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowScheduleList() {
        return this.showScheduleList;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsScheduleEnabled() {
        return this.isScheduleEnabled;
    }

    public String toString() {
        boolean z4 = this.showScheduleList;
        List<C22442a> list = this.alarmScheduleList;
        boolean z13 = this.showCreatedButton;
        boolean z14 = this.shouldShowCallOutText;
        TextResource textResource = this.callOutText;
        EnumC39333f enumC39333f = this.callOutTextColor;
        C39274g c39274g = this.callOutIcon;
        boolean z15 = this.shouldShowDescriptionText;
        TextResource textResource2 = this.descriptionText;
        boolean z16 = this.isScheduleEnabled;
        boolean z17 = this.shouldShowOverlay;
        TextResource textResource3 = this.scheduleOffText;
        StringBuilder sb4 = new StringBuilder("SleepScheduleList(showScheduleList=");
        sb4.append(z4);
        sb4.append(", alarmScheduleList=");
        sb4.append(list);
        sb4.append(", showCreatedButton=");
        AbstractC38963t7.m124392v(sb4, z13, ", shouldShowCallOutText=", z14, ", callOutText=");
        sb4.append(textResource);
        sb4.append(", callOutTextColor=");
        sb4.append(enumC39333f);
        sb4.append(", callOutIcon=");
        sb4.append(c39274g);
        sb4.append(", shouldShowDescriptionText=");
        sb4.append(z15);
        sb4.append(", descriptionText=");
        AbstractC33745d.m106664w(textResource2, ", isScheduleEnabled=", ", shouldShowOverlay=", sb4, z16);
        sb4.append(z17);
        sb4.append(", scheduleOffText=");
        sb4.append(textResource3);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C22443b(boolean z4, List list, boolean z13, boolean z14, TextResource textResource, EnumC39333f enumC39333f, C39274g c39274g, boolean z15, TextResource textResource2, boolean z16, boolean z17, TextResource textResource3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 32) != 0 ? EnumC39333f.WHITE_50 : enumC39333f, (i13 & 64) != 0 ? new C39274g(AbstractC18489d0.m53362c(C38072d.f163053a), null, 2, null) : c39274g, (i13 & 128) != 0 ? false : z15, (i13 & 256) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 512) != 0 ? false : z16, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? z17 : false, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC8693b.m21267a() : textResource3);
    }
}

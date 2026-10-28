package kf2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y71.C39274g;

/* JADX INFO: renamed from: kf2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001e\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\"R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b(\u0010\"R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b*\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010\u0013¨\u0006-"}, m65681d2 = {"Lkf2/a;", "", "Ly81/f;", "alarmTagColor", "alarmTagTextColor", "Lcom/whoop/design/util/TextResource;", "alarmTagText", "Ly71/g;", "alarmTagIcon", "", "daysScheduledLabelDisplayList", "editTitle", "deleteTitle", "latestWakeTime", "", "scheduleId", "<init>", "(Ly81/f;Ly81/f;Lcom/whoop/design/util/TextResource;Ly71/g;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/f;", "()Ly81/f;", "b", "d", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Ly71/g;", "()Ly71/g;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Ljava/lang/String;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22442a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC39333f alarmTagColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f alarmTagTextColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource alarmTagText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39274g alarmTagIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<TextResource> daysScheduledLabelDisplayList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource editTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource deleteTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource latestWakeTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String scheduleId;

    /* JADX WARN: Multi-variable type inference failed */
    public C22442a(EnumC39333f alarmTagColor, EnumC39333f alarmTagTextColor, TextResource alarmTagText, C39274g alarmTagIcon, List<? extends TextResource> daysScheduledLabelDisplayList, TextResource editTitle, TextResource deleteTitle, TextResource latestWakeTime, String scheduleId) {
        AbstractC22676k.m65750j(alarmTagColor, "alarmTagColor");
        AbstractC22676k.m65750j(alarmTagTextColor, "alarmTagTextColor");
        AbstractC22676k.m65750j(alarmTagText, "alarmTagText");
        AbstractC22676k.m65750j(alarmTagIcon, "alarmTagIcon");
        AbstractC22676k.m65750j(daysScheduledLabelDisplayList, "daysScheduledLabelDisplayList");
        AbstractC22676k.m65750j(editTitle, "editTitle");
        AbstractC22676k.m65750j(deleteTitle, "deleteTitle");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(scheduleId, "scheduleId");
        this.alarmTagColor = alarmTagColor;
        this.alarmTagTextColor = alarmTagTextColor;
        this.alarmTagText = alarmTagText;
        this.alarmTagIcon = alarmTagIcon;
        this.daysScheduledLabelDisplayList = daysScheduledLabelDisplayList;
        this.editTitle = editTitle;
        this.deleteTitle = deleteTitle;
        this.latestWakeTime = latestWakeTime;
        this.scheduleId = scheduleId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getAlarmTagColor() {
        return this.alarmTagColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39274g getAlarmTagIcon() {
        return this.alarmTagIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getAlarmTagText() {
        return this.alarmTagText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC39333f getAlarmTagTextColor() {
        return this.alarmTagTextColor;
    }

    /* JADX INFO: renamed from: e */
    public final List<TextResource> m64757e() {
        return this.daysScheduledLabelDisplayList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22442a)) {
            return false;
        }
        C22442a c22442a = (C22442a) other;
        return this.alarmTagColor == c22442a.alarmTagColor && this.alarmTagTextColor == c22442a.alarmTagTextColor && AbstractC22676k.m65745e(this.alarmTagText, c22442a.alarmTagText) && AbstractC22676k.m65745e(this.alarmTagIcon, c22442a.alarmTagIcon) && AbstractC22676k.m65745e(this.daysScheduledLabelDisplayList, c22442a.daysScheduledLabelDisplayList) && AbstractC22676k.m65745e(this.editTitle, c22442a.editTitle) && AbstractC22676k.m65745e(this.deleteTitle, c22442a.deleteTitle) && AbstractC22676k.m65745e(this.latestWakeTime, c22442a.latestWakeTime) && AbstractC22676k.m65745e(this.scheduleId, c22442a.scheduleId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getDeleteTitle() {
        return this.deleteTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getEditTitle() {
        return this.editTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getLatestWakeTime() {
        return this.latestWakeTime;
    }

    public int hashCode() {
        return this.scheduleId.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b((this.alarmTagIcon.hashCode() + AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.alarmTagTextColor, this.alarmTagColor.hashCode() * 31, 31), this.alarmTagText, 31)) * 31, 31, this.daysScheduledLabelDisplayList), this.editTitle, 31), this.deleteTitle, 31), this.latestWakeTime, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getScheduleId() {
        return this.scheduleId;
    }

    public String toString() {
        EnumC39333f enumC39333f = this.alarmTagColor;
        EnumC39333f enumC39333f2 = this.alarmTagTextColor;
        TextResource textResource = this.alarmTagText;
        C39274g c39274g = this.alarmTagIcon;
        List<TextResource> list = this.daysScheduledLabelDisplayList;
        TextResource textResource2 = this.editTitle;
        TextResource textResource3 = this.deleteTitle;
        TextResource textResource4 = this.latestWakeTime;
        String str = this.scheduleId;
        StringBuilder sb4 = new StringBuilder("AlarmScheduleListViewState(alarmTagColor=");
        sb4.append(enumC39333f);
        sb4.append(", alarmTagTextColor=");
        sb4.append(enumC39333f2);
        sb4.append(", alarmTagText=");
        sb4.append(textResource);
        sb4.append(", alarmTagIcon=");
        sb4.append(c39274g);
        sb4.append(", daysScheduledLabelDisplayList=");
        AbstractC30007c.m91852v(textResource2, ", editTitle=", ", deleteTitle=", sb4, list);
        AbstractC30007c.m91855y(sb4, textResource3, ", latestWakeTime=", textResource4, ", scheduleId=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}

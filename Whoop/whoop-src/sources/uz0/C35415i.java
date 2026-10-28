package uz0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: uz0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b.\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b!\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b(\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b$\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b8\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\b7\u0010\u0019R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b2\u00109\u001a\u0004\b/\u0010:R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b0\u0010=R\u0011\u0010?\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b>\u0010'R\u0011\u0010@\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010'¨\u0006A"}, m65681d2 = {"Luz0/i;", "Lm91/u;", "", "id", "", "isSelected", "Lkd1/o;", "iconImageSource", "activityTitle", "activityStrain", "activityDuration", "activityDurationUnit", "activityDurationLabel", "Luz0/o;", "targetZones", "Luz0/b;", "intensityStyle", "intensityTitle", "intensitySubtitle", "Luz0/l;", "buttonViewState", "content", "<init>", "(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/o;Luz0/b;Ljava/lang/String;Ljava/lang/String;Luz0/l;Lm91/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Z", "p", "()Z", "c", "Lkd1/o;", "i", "()Lkd1/o;", "d", "f", "e", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Luz0/o;", "m", "()Luz0/o;", "j", "Luz0/b;", "()Luz0/b;", "k", "l", "Luz0/l;", "()Luz0/l;", "n", "Lm91/u;", "()Lm91/u;", "o", "isIntensityVariation", "isHrZonesVariation", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35415i implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o iconImageSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String activityTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String activityStrain;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String activityDuration;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String activityDurationUnit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String activityDurationLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C35421o targetZones;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC35408b intensityStyle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String intensityTitle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String intensitySubtitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C35418l buttonViewState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC25312u content;

    public C35415i(String id4, boolean z4, AbstractC22403o iconImageSource, String activityTitle, String str, String str2, String str3, String str4, C35421o c35421o, EnumC35408b enumC35408b, String str5, String str6, C35418l c35418l, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(iconImageSource, "iconImageSource");
        AbstractC22676k.m65750j(activityTitle, "activityTitle");
        this.id = id4;
        this.isSelected = z4;
        this.iconImageSource = iconImageSource;
        this.activityTitle = activityTitle;
        this.activityStrain = str;
        this.activityDuration = str2;
        this.activityDurationUnit = str3;
        this.activityDurationLabel = str4;
        this.targetZones = c35421o;
        this.intensityStyle = enumC35408b;
        this.intensityTitle = str5;
        this.intensitySubtitle = str6;
        this.buttonViewState = c35418l;
        this.content = interfaceC25312u;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityDuration() {
        return this.activityDuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivityDurationLabel() {
        return this.activityDurationLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityDurationUnit() {
        return this.activityDurationUnit;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getActivityStrain() {
        return this.activityStrain;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35415i)) {
            return false;
        }
        C35415i c35415i = (C35415i) other;
        return AbstractC22676k.m65745e(this.id, c35415i.id) && this.isSelected == c35415i.isSelected && AbstractC22676k.m65745e(this.iconImageSource, c35415i.iconImageSource) && AbstractC22676k.m65745e(this.activityTitle, c35415i.activityTitle) && AbstractC22676k.m65745e(this.activityStrain, c35415i.activityStrain) && AbstractC22676k.m65745e(this.activityDuration, c35415i.activityDuration) && AbstractC22676k.m65745e(this.activityDurationUnit, c35415i.activityDurationUnit) && AbstractC22676k.m65745e(this.activityDurationLabel, c35415i.activityDurationLabel) && AbstractC22676k.m65745e(this.targetZones, c35415i.targetZones) && this.intensityStyle == c35415i.intensityStyle && AbstractC22676k.m65745e(this.intensityTitle, c35415i.intensityTitle) && AbstractC22676k.m65745e(this.intensitySubtitle, c35415i.intensitySubtitle) && AbstractC22676k.m65745e(this.buttonViewState, c35415i.buttonViewState) && AbstractC22676k.m65745e(this.content, c35415i.content);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getActivityTitle() {
        return this.activityTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C35418l getButtonViewState() {
        return this.buttonViewState;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC25312u getContent() {
        return this.content;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC30007c.m91833c(this.iconImageSource, AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.isSelected), 31), 31, this.activityTitle);
        String str = this.activityStrain;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activityDuration;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.activityDurationUnit;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.activityDurationLabel;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C35421o c35421o = this.targetZones;
        int iHashCode5 = (iHashCode4 + (c35421o == null ? 0 : c35421o.hashCode())) * 31;
        EnumC35408b enumC35408b = this.intensityStyle;
        int iHashCode6 = (iHashCode5 + (enumC35408b == null ? 0 : enumC35408b.hashCode())) * 31;
        String str5 = this.intensityTitle;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.intensitySubtitle;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C35418l c35418l = this.buttonViewState;
        int iHashCode9 = (iHashCode8 + (c35418l == null ? 0 : c35418l.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.content;
        return iHashCode9 + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC22403o getIconImageSource() {
        return this.iconImageSource;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC35408b getIntensityStyle() {
        return this.intensityStyle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getIntensitySubtitle() {
        return this.intensitySubtitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getIntensityTitle() {
        return this.intensityTitle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C35421o getTargetZones() {
        return this.targetZones;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m112367n() {
        return this.targetZones != null && this.intensityTitle == null && this.intensityStyle == null && this.intensitySubtitle == null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m112368o() {
        return !(this.intensityTitle == null || this.intensityStyle == null || this.intensitySubtitle == null) || this.targetZones == null;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.id;
        boolean z4 = this.isSelected;
        AbstractC22403o abstractC22403o = this.iconImageSource;
        String str2 = this.activityTitle;
        String str3 = this.activityStrain;
        String str4 = this.activityDuration;
        String str5 = this.activityDurationUnit;
        String str6 = this.activityDurationLabel;
        C35421o c35421o = this.targetZones;
        EnumC35408b enumC35408b = this.intensityStyle;
        String str7 = this.intensityTitle;
        String str8 = this.intensitySubtitle;
        C35418l c35418l = this.buttonViewState;
        InterfaceC25312u interfaceC25312u = this.content;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ActivityRecommendationTileViewState(id=", str, ", isSelected=", ", iconImageSource=", z4);
        sbM73379l.append(abstractC22403o);
        sbM73379l.append(", activityTitle=");
        sbM73379l.append(str2);
        sbM73379l.append(", activityStrain=");
        AbstractC11266d.m30444B(sbM73379l, str3, ", activityDuration=", str4, ", activityDurationUnit=");
        AbstractC11266d.m30444B(sbM73379l, str5, ", activityDurationLabel=", str6, ", targetZones=");
        sbM73379l.append(c35421o);
        sbM73379l.append(", intensityStyle=");
        sbM73379l.append(enumC35408b);
        sbM73379l.append(", intensityTitle=");
        AbstractC11266d.m30444B(sbM73379l, str7, ", intensitySubtitle=", str8, ", buttonViewState=");
        sbM73379l.append(c35418l);
        sbM73379l.append(", content=");
        sbM73379l.append(interfaceC25312u);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    public /* synthetic */ C35415i(String str, boolean z4, AbstractC22403o abstractC22403o, String str2, String str3, String str4, String str5, String str6, C35421o c35421o, EnumC35408b enumC35408b, String str7, String str8, C35418l c35418l, InterfaceC25312u interfaceC25312u, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, abstractC22403o, str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : str6, (i13 & 256) != 0 ? null : c35421o, (i13 & 512) != 0 ? null : enumC35408b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str8, (i13 & 4096) != 0 ? null : c35418l, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : interfaceC25312u);
    }
}

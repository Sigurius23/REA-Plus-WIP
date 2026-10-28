package cw2;

import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: cw2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b\u001f\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b!\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b*\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b+\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b\u001c\u0010-¨\u0006."}, m65681d2 = {"Lcw2/e;", "Lm91/u;", "", "title", "titleSuffix", "subtitle", "subtitleSuffix", "Lgz0/m0;", "leadingIcon", "Ly81/f;", "leadingIconColor", "subtitleColor", "trailingIcon", "trailingIconColor", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ly81/f;Ly81/f;Lgz0/m0;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "i", "c", "e", "d", "g", "Lgz0/m0;", "()Lgz0/m0;", "f", "Ly81/f;", "()Ly81/f;", "j", "k", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11164e implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f35738k = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String titleSuffix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String subtitleSuffix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 leadingIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f leadingIconColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39333f subtitleColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC16313m0 trailingIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC39333f trailingIconColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final GenericInteraction genericInteraction;

    public C11164e(String title, String titleSuffix, String subtitle, String subtitleSuffix, EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC16313m0 enumC16313m1, EnumC39333f enumC39333f3, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleSuffix, "titleSuffix");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleSuffix, "subtitleSuffix");
        this.title = title;
        this.titleSuffix = titleSuffix;
        this.subtitle = subtitle;
        this.subtitleSuffix = subtitleSuffix;
        this.leadingIcon = enumC16313m0;
        this.leadingIconColor = enumC39333f;
        this.subtitleColor = enumC39333f2;
        this.trailingIcon = enumC16313m1;
        this.trailingIconColor = enumC39333f3;
        this.genericInteraction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getLeadingIconColor() {
        return this.leadingIconColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11164e)) {
            return false;
        }
        C11164e c11164e = (C11164e) other;
        return AbstractC22676k.m65745e(this.title, c11164e.title) && AbstractC22676k.m65745e(this.titleSuffix, c11164e.titleSuffix) && AbstractC22676k.m65745e(this.subtitle, c11164e.subtitle) && AbstractC22676k.m65745e(this.subtitleSuffix, c11164e.subtitleSuffix) && this.leadingIcon == c11164e.leadingIcon && this.leadingIconColor == c11164e.leadingIconColor && this.subtitleColor == c11164e.subtitleColor && this.trailingIcon == c11164e.trailingIcon && this.trailingIconColor == c11164e.trailingIconColor && AbstractC22676k.m65745e(this.genericInteraction, c11164e.genericInteraction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitleSuffix() {
        return this.subtitleSuffix;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.titleSuffix), 31, this.subtitle), 31, this.subtitleSuffix);
        EnumC16313m0 enumC16313m0 = this.leadingIcon;
        int iHashCode = (iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC39333f enumC39333f = this.leadingIconColor;
        int iHashCode2 = (iHashCode + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        EnumC39333f enumC39333f2 = this.subtitleColor;
        int iHashCode3 = (iHashCode2 + (enumC39333f2 == null ? 0 : enumC39333f2.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.trailingIcon;
        int iHashCode4 = (iHashCode3 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31;
        EnumC39333f enumC39333f3 = this.trailingIconColor;
        int iHashCode5 = (iHashCode4 + (enumC39333f3 == null ? 0 : enumC39333f3.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        return iHashCode5 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitleSuffix() {
        return this.titleSuffix;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC16313m0 getTrailingIcon() {
        return this.trailingIcon;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC39333f getTrailingIconColor() {
        return this.trailingIconColor;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.titleSuffix;
        String str3 = this.subtitle;
        String str4 = this.subtitleSuffix;
        EnumC16313m0 enumC16313m0 = this.leadingIcon;
        EnumC39333f enumC39333f = this.leadingIconColor;
        EnumC39333f enumC39333f2 = this.subtitleColor;
        EnumC16313m0 enumC16313m1 = this.trailingIcon;
        EnumC39333f enumC39333f3 = this.trailingIconColor;
        GenericInteraction genericInteraction = this.genericInteraction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MeasurementEntryItemViewState(title=", str, ", titleSuffix=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitleSuffix=", str4, ", leadingIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", leadingIconColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", subtitleColor=");
        sbM32001t.append(enumC39333f2);
        sbM32001t.append(", trailingIcon=");
        sbM32001t.append(enumC16313m1);
        sbM32001t.append(", trailingIconColor=");
        sbM32001t.append(enumC39333f3);
        sbM32001t.append(", genericInteraction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}

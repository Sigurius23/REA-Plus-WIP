package i31;

import b91.EnumC2888c;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import m83.C25271y;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: i31.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0090\u0001\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b$\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b3\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u00105\u001a\u0004\b0\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\b4\u00109¨\u0006:"}, m65681d2 = {"Li31/g;", "Lm91/u;", "", "id", "title", "Lb91/c;", "titleTypography", "leading", "Lkd1/o;", "iconImageSource", "", "description", "trailing", "emoji", "", "isSelected", "iconBackgroundEnabled", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;)Li31/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "j", "c", "Lb91/c;", "k", "()Lb91/c;", "d", "Lm91/u;", "i", "()Lm91/u;", "e", "Lkd1/o;", "g", "()Lkd1/o;", "f", "Ljava/util/List;", "()Ljava/util/List;", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "m", "()Z", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18052g implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC2888c titleTypography;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u leading;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o iconImageSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<InterfaceC25312u> description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC25312u trailing;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC25312u emoji;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean iconBackgroundEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    /* JADX WARN: Multi-variable type inference failed */
    public C18052g(String str, String title, EnumC2888c titleTypography, InterfaceC25312u interfaceC25312u, AbstractC22403o abstractC22403o, List<? extends InterfaceC25312u> description, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, boolean z4, boolean z13, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleTypography, "titleTypography");
        AbstractC22676k.m65750j(description, "description");
        this.id = str;
        this.title = title;
        this.titleTypography = titleTypography;
        this.leading = interfaceC25312u;
        this.iconImageSource = abstractC22403o;
        this.description = description;
        this.trailing = interfaceC25312u2;
        this.emoji = interfaceC25312u3;
        this.isSelected = z4;
        this.iconBackgroundEnabled = z13;
        this.interaction = genericInteraction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18052g m51840b(C18052g c18052g, String str, String str2, EnumC2888c enumC2888c, InterfaceC25312u interfaceC25312u, AbstractC22403o abstractC22403o, List list, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, boolean z4, boolean z13, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c18052g.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c18052g.title;
        }
        if ((i13 & 4) != 0) {
            enumC2888c = c18052g.titleTypography;
        }
        if ((i13 & 8) != 0) {
            interfaceC25312u = c18052g.leading;
        }
        if ((i13 & 16) != 0) {
            abstractC22403o = c18052g.iconImageSource;
        }
        if ((i13 & 32) != 0) {
            list = c18052g.description;
        }
        if ((i13 & 64) != 0) {
            interfaceC25312u2 = c18052g.trailing;
        }
        if ((i13 & 128) != 0) {
            interfaceC25312u3 = c18052g.emoji;
        }
        if ((i13 & 256) != 0) {
            z4 = c18052g.isSelected;
        }
        if ((i13 & 512) != 0) {
            z13 = c18052g.iconBackgroundEnabled;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            genericInteraction = c18052g.interaction;
        }
        boolean z14 = z13;
        GenericInteraction genericInteraction2 = genericInteraction;
        InterfaceC25312u interfaceC25312u4 = interfaceC25312u3;
        boolean z15 = z4;
        List list2 = list;
        InterfaceC25312u interfaceC25312u5 = interfaceC25312u2;
        AbstractC22403o abstractC22403o2 = abstractC22403o;
        EnumC2888c enumC2888c2 = enumC2888c;
        return c18052g.m51841a(str, str2, enumC2888c2, interfaceC25312u, abstractC22403o2, list2, interfaceC25312u5, interfaceC25312u4, z15, z14, genericInteraction2);
    }

    /* JADX INFO: renamed from: a */
    public final C18052g m51841a(String id4, String title, EnumC2888c titleTypography, InterfaceC25312u leading, AbstractC22403o iconImageSource, List<? extends InterfaceC25312u> description, InterfaceC25312u trailing, InterfaceC25312u emoji, boolean isSelected, boolean iconBackgroundEnabled, GenericInteraction interaction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleTypography, "titleTypography");
        AbstractC22676k.m65750j(description, "description");
        return new C18052g(id4, title, titleTypography, leading, iconImageSource, description, trailing, emoji, isSelected, iconBackgroundEnabled, interaction);
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m51842c() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getEmoji() {
        return this.emoji;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18052g)) {
            return false;
        }
        C18052g c18052g = (C18052g) other;
        return AbstractC22676k.m65745e(this.id, c18052g.id) && AbstractC22676k.m65745e(this.title, c18052g.title) && this.titleTypography == c18052g.titleTypography && AbstractC22676k.m65745e(this.leading, c18052g.leading) && AbstractC22676k.m65745e(this.iconImageSource, c18052g.iconImageSource) && AbstractC22676k.m65745e(this.description, c18052g.description) && AbstractC22676k.m65745e(this.trailing, c18052g.trailing) && AbstractC22676k.m65745e(this.emoji, c18052g.emoji) && this.isSelected == c18052g.isSelected && this.iconBackgroundEnabled == c18052g.iconBackgroundEnabled && AbstractC22676k.m65745e(this.interaction, c18052g.interaction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIconBackgroundEnabled() {
        return this.iconBackgroundEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC22403o getIconImageSource() {
        return this.iconImageSource;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (this.titleTypography.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title)) * 31;
        InterfaceC25312u interfaceC25312u = this.leading;
        int iHashCode2 = (iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.iconImageSource;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.description);
        InterfaceC25312u interfaceC25312u2 = this.trailing;
        int iHashCode3 = (iM31983b + (interfaceC25312u2 == null ? 0 : interfaceC25312u2.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u3 = this.emoji;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (interfaceC25312u3 == null ? 0 : interfaceC25312u3.hashCode())) * 31, 31, this.isSelected), 31, this.iconBackgroundEnabled);
        GenericInteraction genericInteraction = this.interaction;
        return iM8289b + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC25312u getLeading() {
        return this.leading;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC2888c getTitleTypography() {
        return this.titleTypography;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC25312u getTrailing() {
        return this.trailing;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        EnumC2888c enumC2888c = this.titleTypography;
        InterfaceC25312u interfaceC25312u = this.leading;
        AbstractC22403o abstractC22403o = this.iconImageSource;
        List<InterfaceC25312u> list = this.description;
        InterfaceC25312u interfaceC25312u2 = this.trailing;
        InterfaceC25312u interfaceC25312u3 = this.emoji;
        boolean z4 = this.isSelected;
        boolean z13 = this.iconBackgroundEnabled;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RecommendationTileHeaderViewState(id=", str, ", title=", str2, ", titleTypography=");
        sbM32001t.append(enumC2888c);
        sbM32001t.append(", leading=");
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(", iconImageSource=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", description=");
        sbM32001t.append(list);
        sbM32001t.append(", trailing=");
        sbM32001t.append(interfaceC25312u2);
        sbM32001t.append(", emoji=");
        sbM32001t.append(interfaceC25312u3);
        sbM32001t.append(", isSelected=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", iconBackgroundEnabled=", z13, ", interaction=");
        return AbstractC26725a.m79506j(sbM32001t, genericInteraction, ")");
    }

    public /* synthetic */ C18052g(String str, String str2, EnumC2888c enumC2888c, InterfaceC25312u interfaceC25312u, AbstractC22403o abstractC22403o, List list, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, boolean z4, boolean z13, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? EnumC2888c.SH4 : enumC2888c, (i13 & 8) != 0 ? null : interfaceC25312u, (i13 & 16) != 0 ? null : abstractC22403o, (i13 & 32) != 0 ? C25271y.f99162w : list, (i13 & 64) != 0 ? null : interfaceC25312u2, (i13 & 128) != 0 ? null : interfaceC25312u3, (i13 & 256) != 0 ? false : z4, (i13 & 512) != 0 ? true : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : genericInteraction);
    }
}

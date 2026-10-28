package lo0;

import com.whoop.navigation.models.GenericInteraction;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lo0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001a\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u0017\u0010$¨\u0006%"}, m65681d2 = {"Llo0/a;", "Lm91/u;", "", "id", "text", "", "isSelected", "Ly81/f;", "selectedColor", "selectedBorderColor", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLy81/f;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "e", "c", "Z", "f", "()Z", "d", "Ly81/f;", "()Ly81/f;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24568a implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f95888g = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f selectedColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f selectedBorderColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    public C24568a(String id4, String text, boolean z4, EnumC39333f selectedColor, EnumC39333f selectedBorderColor, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(selectedColor, "selectedColor");
        AbstractC22676k.m65750j(selectedBorderColor, "selectedBorderColor");
        this.id = id4;
        this.text = text;
        this.isSelected = z4;
        this.selectedColor = selectedColor;
        this.selectedBorderColor = selectedBorderColor;
        this.interaction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getSelectedBorderColor() {
        return this.selectedBorderColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getSelectedColor() {
        return this.selectedColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24568a)) {
            return false;
        }
        C24568a c24568a = (C24568a) other;
        return AbstractC22676k.m65745e(this.id, c24568a.id) && AbstractC22676k.m65745e(this.text, c24568a.text) && this.isSelected == c24568a.isSelected && this.selectedColor == c24568a.selectedColor && this.selectedBorderColor == c24568a.selectedBorderColor && AbstractC22676k.m65745e(this.interaction, c24568a.interaction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM61132c = AbstractC21702c.m61132c(this.selectedBorderColor, AbstractC21702c.m61132c(this.selectedColor, AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.text), 31, this.isSelected), 31), 31);
        GenericInteraction genericInteraction = this.interaction;
        return iM61132c + (genericInteraction == null ? 0 : genericInteraction.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        boolean z4 = this.isSelected;
        EnumC39333f enumC39333f = this.selectedColor;
        EnumC39333f enumC39333f2 = this.selectedBorderColor;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AppointmentButtonViewState(id=", str, ", text=", str2, ", isSelected=");
        sbM32001t.append(z4);
        sbM32001t.append(", selectedColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", selectedBorderColor=");
        sbM32001t.append(enumC39333f2);
        sbM32001t.append(", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}

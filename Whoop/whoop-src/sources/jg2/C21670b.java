package jg2;

import c13.AbstractC3855a;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: jg2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\r¨\u0006!"}, m65681d2 = {"Ljg2/b;", "Lm91/u;", "", "id", "label", "placeholder", "selectedOptionId", "", "Ljg2/b$a;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "d", "f", "e", "Ljava/util/List;", "()Ljava/util/List;", "selectedLabel", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21670b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String placeholder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedOptionId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<a> options;

    /* JADX INFO: renamed from: jg2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ljg2/b$a;", "", "", "id", "label", "Lgz0/m0;", "icon", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Lgz0/m0;", "()Lgz0/m0;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: e */
        public static final int f83194e = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC16313m0 icon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final GenericInteraction interaction;

        public a(String id4, String label, EnumC16313m0 enumC16313m0, GenericInteraction genericInteraction) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(label, "label");
            this.id = id4;
            this.label = label;
            this.icon = enumC16313m0;
            this.interaction = genericInteraction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final GenericInteraction getInteraction() {
            return this.interaction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.id, aVar.id) && AbstractC22676k.m65745e(this.label, aVar.label) && this.icon == aVar.icon && AbstractC22676k.m65745e(this.interaction, aVar.interaction);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.label);
            EnumC16313m0 enumC16313m0 = this.icon;
            int iHashCode = (iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
            GenericInteraction genericInteraction = this.interaction;
            return iHashCode + (genericInteraction != null ? genericInteraction.hashCode() : 0);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.label;
            EnumC16313m0 enumC16313m0 = this.icon;
            GenericInteraction genericInteraction = this.interaction;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Option(id=", str, ", label=", str2, ", icon=");
            sbM32001t.append(enumC16313m0);
            sbM32001t.append(", interaction=");
            sbM32001t.append(genericInteraction);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    public C21670b(String id4, String str, String str2, String str3, List<a> options) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(options, "options");
        this.id = id4;
        this.label = str;
        this.placeholder = str2;
        this.selectedOptionId = str3;
        this.options = options;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b */
    public final List<a> m60934b() {
        return this.options;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: e */
    public final String m60936e() {
        Object next;
        Iterator<T> it = this.options.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((a) next).getId(), this.selectedOptionId));
        a aVar = (a) next;
        if (aVar != null) {
            return aVar.getLabel();
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21670b)) {
            return false;
        }
        C21670b c21670b = (C21670b) other;
        return AbstractC22676k.m65745e(this.id, c21670b.id) && AbstractC22676k.m65745e(this.label, c21670b.label) && AbstractC22676k.m65745e(this.placeholder, c21670b.placeholder) && AbstractC22676k.m65745e(this.selectedOptionId, c21670b.selectedOptionId) && AbstractC22676k.m65745e(this.options, c21670b.options);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedOptionId() {
        return this.selectedOptionId;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedOptionId;
        return this.options.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        String str3 = this.placeholder;
        String str4 = this.selectedOptionId;
        List<a> list = this.options;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DropdownItemViewState(id=", str, ", label=", str2, ", placeholder=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", selectedOptionId=", str4, ", options=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }
}

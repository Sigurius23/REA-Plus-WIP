package hv2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import gv2.C16246d;
import gv2.C16247e;
import gv2.C16248f;
import gv2.C16249g;
import gv2.InterfaceC16243a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: hv2.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0003\u0014\u0018\u0012B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lhv2/k;", "", "Lhv2/k$b;", "fullScreenModal", "Lhv2/k$c;", "content", "<init>", "(Lhv2/k$b;Lhv2/k$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhv2/k$b;", "b", "()Lhv2/k$b;", "Lhv2/k$c;", "()Lhv2/k$c;", "c", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17689k {

    /* JADX INFO: renamed from: d */
    public static final int f68628d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c content;

    /* JADX INFO: renamed from: hv2.k$c */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u0019\u0010(¨\u0006)"}, m65681d2 = {"Lhv2/k$c;", "", "Lgv2/g;", "textField", "Lgv2/f;", "textArea", "Lm91/u;", "linkAnExercise", "Lgv2/d;", "equipmentDropDown", "muscleGroups", "Lgv2/e;", "cta", "<init>", "(Lgv2/g;Lgv2/f;Lm91/u;Lgv2/d;Lgv2/d;Lgv2/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgv2/g;", "f", "()Lgv2/g;", "b", "Lgv2/f;", "e", "()Lgv2/f;", "c", "Lm91/u;", "()Lm91/u;", "d", "Lgv2/d;", "()Lgv2/d;", "Lgv2/e;", "()Lgv2/e;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C16249g textField;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C16248f textArea;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC25312u linkAnExercise;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C16246d equipmentDropDown;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C16246d muscleGroups;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C16247e cta;

        public c(C16249g textField, C16248f textArea, InterfaceC25312u linkAnExercise, C16246d equipmentDropDown, C16246d muscleGroups, C16247e cta) {
            AbstractC22676k.m65750j(textField, "textField");
            AbstractC22676k.m65750j(textArea, "textArea");
            AbstractC22676k.m65750j(linkAnExercise, "linkAnExercise");
            AbstractC22676k.m65750j(equipmentDropDown, "equipmentDropDown");
            AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
            AbstractC22676k.m65750j(cta, "cta");
            this.textField = textField;
            this.textArea = textArea;
            this.linkAnExercise = linkAnExercise;
            this.equipmentDropDown = equipmentDropDown;
            this.muscleGroups = muscleGroups;
            this.cta = cta;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C16247e getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C16246d getEquipmentDropDown() {
            return this.equipmentDropDown;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC25312u getLinkAnExercise() {
            return this.linkAnExercise;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C16246d getMuscleGroups() {
            return this.muscleGroups;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C16248f getTextArea() {
            return this.textArea;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.textField, cVar.textField) && AbstractC22676k.m65745e(this.textArea, cVar.textArea) && AbstractC22676k.m65745e(this.linkAnExercise, cVar.linkAnExercise) && AbstractC22676k.m65745e(this.equipmentDropDown, cVar.equipmentDropDown) && AbstractC22676k.m65745e(this.muscleGroups, cVar.muscleGroups) && AbstractC22676k.m65745e(this.cta, cVar.cta);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C16249g getTextField() {
            return this.textField;
        }

        public int hashCode() {
            return this.cta.hashCode() + ((this.muscleGroups.hashCode() + ((this.equipmentDropDown.hashCode() + AbstractC11478a.m30851c(this.linkAnExercise, (this.textArea.hashCode() + (this.textField.hashCode() * 31)) * 31, 31)) * 31)) * 31);
        }

        public String toString() {
            return "ScreenContent(textField=" + this.textField + ", textArea=" + this.textArea + ", linkAnExercise=" + this.linkAnExercise + ", equipmentDropDown=" + this.equipmentDropDown + ", muscleGroups=" + this.muscleGroups + ", cta=" + this.cta + ")";
        }
    }

    public C17689k(b bVar, c cVar) {
        this.fullScreenModal = bVar;
        this.content = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFullScreenModal() {
        return this.fullScreenModal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17689k)) {
            return false;
        }
        C17689k c17689k = (C17689k) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c17689k.fullScreenModal) && AbstractC22676k.m65745e(this.content, c17689k.content);
    }

    public int hashCode() {
        b bVar = this.fullScreenModal;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        c cVar = this.content;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "CustomExerciseViewState(fullScreenModal=" + this.fullScreenModal + ", content=" + this.content + ")";
    }

    public /* synthetic */ C17689k(b bVar, c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bVar, (i13 & 2) != 0 ? null : cVar);
    }

    /* JADX INFO: renamed from: hv2.k$b */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b%\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u0019\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, m65681d2 = {"Lhv2/k$b;", "", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Lgv2/a;", "primaryClickEvent", "secondaryButtonText", "secondaryClickEvent", "followUpEvent", "", "showSecondaryButton", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgv2/a;Lcom/whoop/design/util/TextResource;Lgv2/a;Lgv2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lgv2/a;", "()Lgv2/a;", "e", "f", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: i */
        public static final int f68631i = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC16243a primaryClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC16243a secondaryClickEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC16243a followUpEvent;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean showSecondaryButton;

        public b(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC16243a interfaceC16243a, TextResource secondaryButtonText, InterfaceC16243a interfaceC16243a2, InterfaceC16243a interfaceC16243a3, boolean z4) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.primaryClickEvent = interfaceC16243a;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryClickEvent = interfaceC16243a2;
            this.followUpEvent = interfaceC16243a3;
            this.showSecondaryButton = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC16243a getFollowUpEvent() {
            return this.followUpEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC16243a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC16243a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.type, bVar.type) && AbstractC22676k.m65745e(this.supportText, bVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, bVar.primaryButtonText) && AbstractC22676k.m65745e(this.primaryClickEvent, bVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, bVar.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryClickEvent, bVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, bVar.followUpEvent) && this.showSecondaryButton == bVar.showSecondaryButton;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShowSecondaryButton() {
            return this.showSecondaryButton;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC16243a interfaceC16243a = this.primaryClickEvent;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC16243a == null ? 0 : interfaceC16243a.hashCode())) * 31, this.secondaryButtonText, 31);
            InterfaceC16243a interfaceC16243a2 = this.secondaryClickEvent;
            int iHashCode = (iM95625a2 + (interfaceC16243a2 == null ? 0 : interfaceC16243a2.hashCode())) * 31;
            InterfaceC16243a interfaceC16243a3 = this.followUpEvent;
            return Boolean.hashCode(this.showSecondaryButton) + ((iHashCode + (interfaceC16243a3 != null ? interfaceC16243a3.hashCode() : 0)) * 31);
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC16243a interfaceC16243a = this.primaryClickEvent;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC16243a interfaceC16243a2 = this.secondaryClickEvent;
            InterfaceC16243a interfaceC16243a3 = this.followUpEvent;
            boolean z4 = this.showSecondaryButton;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", primaryClickEvent=");
            sbM30862n.append(interfaceC16243a);
            sbM30862n.append(", secondaryButtonText=");
            sbM30862n.append(textResource3);
            sbM30862n.append(", secondaryClickEvent=");
            sbM30862n.append(interfaceC16243a2);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC16243a3);
            sbM30862n.append(", showSecondaryButton=");
            sbM30862n.append(z4);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ b(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC16243a interfaceC16243a, TextResource textResource3, InterfaceC16243a interfaceC16243a2, InterfaceC16243a interfaceC16243a3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC16243a, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC16243a2, (i13 & 64) == 0 ? interfaceC16243a3 : null, (i13 & 128) != 0 ? false : z4);
        }
    }
}

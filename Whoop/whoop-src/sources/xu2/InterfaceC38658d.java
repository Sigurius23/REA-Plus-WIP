package xu2;

import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cu2.AbstractC11128h;
import d13.AbstractC11478a;
import eu2.C13659p;
import hu2.InterfaceC17655b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xu2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lxu2/d;", "", "a", "c", "b", "Lxu2/d$b;", "Lxu2/d$c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC38658d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f166378a;

    /* JADX INFO: renamed from: xu2.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lxu2/d$a;", "", "<init>", "()V", "Lxu2/d$b;", "b", "Lxu2/d$b;", "a", "()Lxu2/d$b;", "initial", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f166378a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final b initial = new b(null, null, new InterfaceC38655a.b(true), null, InterfaceC17655b.c.f68493w, false, 33, null);

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final b m123953a() {
            return initial;
        }
    }

    /* JADX INFO: renamed from: xu2.d$b */
    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JV\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b!\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b+\u0010/¨\u00060"}, m65681d2 = {"Lxu2/d$b;", "Lxu2/d;", "Lcom/whoop/design/atomic/organism/toolbar/d$a;", "toolbarState", "", "Leu2/p;", "workoutGroups", "Lxu2/a;", "cta", "Lxu2/b;", "displayedDialog", "Lhu2/b;", "backClickEvent", "", "showOnboardingOverlayForOtherExercise", "<init>", "(Lcom/whoop/design/atomic/organism/toolbar/d$a;Ljava/util/List;Lxu2/a;Lxu2/b;Lhu2/b;Z)V", "a", "(Lcom/whoop/design/atomic/organism/toolbar/d$a;Ljava/util/List;Lxu2/a;Lxu2/b;Lhu2/b;Z)Lxu2/d$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/atomic/organism/toolbar/d$a;", "g", "()Lcom/whoop/design/atomic/organism/toolbar/d$a;", "c", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "d", "Lxu2/a;", "()Lxu2/a;", "e", "Lxu2/b;", "()Lxu2/b;", "f", "Lhu2/b;", "()Lhu2/b;", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC38658d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC6721d.a toolbarState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C13659p> workoutGroups;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC38655a cta;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final AbstractC38656b displayedDialog;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC17655b backClickEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean showOnboardingOverlayForOtherExercise;

        public b(AbstractC6721d.a toolbarState, List<C13659p> list, InterfaceC38655a cta, AbstractC38656b abstractC38656b, InterfaceC17655b backClickEvent, boolean z4) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(cta, "cta");
            AbstractC22676k.m65750j(backClickEvent, "backClickEvent");
            this.toolbarState = toolbarState;
            this.workoutGroups = list;
            this.cta = cta;
            this.displayedDialog = abstractC38656b;
            this.backClickEvent = backClickEvent;
            this.showOnboardingOverlayForOtherExercise = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m123954b(b bVar, AbstractC6721d.a aVar, List list, InterfaceC38655a interfaceC38655a, AbstractC38656b abstractC38656b, InterfaceC17655b interfaceC17655b, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                aVar = bVar.toolbarState;
            }
            if ((i13 & 2) != 0) {
                list = bVar.workoutGroups;
            }
            if ((i13 & 4) != 0) {
                interfaceC38655a = bVar.cta;
            }
            if ((i13 & 8) != 0) {
                abstractC38656b = bVar.displayedDialog;
            }
            if ((i13 & 16) != 0) {
                interfaceC17655b = bVar.backClickEvent;
            }
            if ((i13 & 32) != 0) {
                z4 = bVar.showOnboardingOverlayForOtherExercise;
            }
            InterfaceC17655b interfaceC17655b2 = interfaceC17655b;
            boolean z13 = z4;
            return bVar.m123955a(aVar, list, interfaceC38655a, abstractC38656b, interfaceC17655b2, z13);
        }

        /* JADX INFO: renamed from: a */
        public final b m123955a(AbstractC6721d.a toolbarState, List<C13659p> workoutGroups, InterfaceC38655a cta, AbstractC38656b displayedDialog, InterfaceC17655b backClickEvent, boolean showOnboardingOverlayForOtherExercise) {
            AbstractC22676k.m65750j(toolbarState, "toolbarState");
            AbstractC22676k.m65750j(cta, "cta");
            AbstractC22676k.m65750j(backClickEvent, "backClickEvent");
            return new b(toolbarState, workoutGroups, cta, displayedDialog, backClickEvent, showOnboardingOverlayForOtherExercise);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC17655b getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC38655a getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final AbstractC38656b getDisplayedDialog() {
            return this.displayedDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.toolbarState, bVar.toolbarState) && AbstractC22676k.m65745e(this.workoutGroups, bVar.workoutGroups) && AbstractC22676k.m65745e(this.cta, bVar.cta) && AbstractC22676k.m65745e(this.displayedDialog, bVar.displayedDialog) && AbstractC22676k.m65745e(this.backClickEvent, bVar.backClickEvent) && this.showOnboardingOverlayForOtherExercise == bVar.showOnboardingOverlayForOtherExercise;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShowOnboardingOverlayForOtherExercise() {
            return this.showOnboardingOverlayForOtherExercise;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final AbstractC6721d.a getToolbarState() {
            return this.toolbarState;
        }

        /* JADX INFO: renamed from: h */
        public final List<C13659p> m123961h() {
            return this.workoutGroups;
        }

        public int hashCode() {
            int iHashCode = this.toolbarState.hashCode() * 31;
            List<C13659p> list = this.workoutGroups;
            int iHashCode2 = (this.cta.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
            AbstractC38656b abstractC38656b = this.displayedDialog;
            return Boolean.hashCode(this.showOnboardingOverlayForOtherExercise) + ((this.backClickEvent.hashCode() + ((iHashCode2 + (abstractC38656b != null ? abstractC38656b.hashCode() : 0)) * 31)) * 31);
        }

        public String toString() {
            return "Editing(toolbarState=" + this.toolbarState + ", workoutGroups=" + this.workoutGroups + ", cta=" + this.cta + ", displayedDialog=" + this.displayedDialog + ", backClickEvent=" + this.backClickEvent + ", showOnboardingOverlayForOtherExercise=" + this.showOnboardingOverlayForOtherExercise + ")";
        }

        public /* synthetic */ b(AbstractC6721d.a aVar, List list, InterfaceC38655a interfaceC38655a, AbstractC38656b abstractC38656b, InterfaceC17655b interfaceC17655b, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new AbstractC6721d.a(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 32767, null) : aVar, list, interfaceC38655a, abstractC38656b, interfaceC17655b, (i13 & 32) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: xu2.d$c */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u00013B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b0\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/¨\u00064"}, m65681d2 = {"Lxu2/d$c;", "Lxu2/d;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "", "showSecondaryAction", "primaryButtonText", "secondaryButtonText", "Lhu2/b;", "buttonClickViewEvent", "secondaryButtonClickViewEvent", "followUpEvent", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhu2/b;Lhu2/b;Lhu2/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lsz0/p0;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhu2/b;Lhu2/b;Lhu2/b;)Lxu2/d$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lsz0/p0;", "q", "()Lsz0/p0;", "c", "Lcom/whoop/design/util/TextResource;", "p", "()Lcom/whoop/design/util/TextResource;", "d", "Z", "o", "()Z", "e", "l", "f", "n", "g", "Lhu2/b;", "j", "()Lhu2/b;", "m", "i", "k", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC38658d {

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: k */
        public static final int f166387k = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: l */
        private static final c f166388l = new c(AbstractC33208p0.c.f138471e, null, false, null, null, null, null, null, 254, null);

        /* JADX INFO: renamed from: m */
        private static final c f166389m;

        /* JADX INFO: renamed from: n */
        private static final c f166390n;

        /* JADX INFO: renamed from: o */
        private static final c f166391o;

        /* JADX INFO: renamed from: p */
        private static final c f166392p;

        /* JADX INFO: renamed from: q */
        private static final c f166393q;

        /* JADX INFO: renamed from: r */
        private static final c f166394r;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean showSecondaryAction;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC17655b buttonClickViewEvent;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final InterfaceC17655b secondaryButtonClickViewEvent;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final InterfaceC17655b followUpEvent;

        /* JADX INFO: renamed from: xu2.d$c$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lxu2/d$c$a;", "", "<init>", "()V", "Lxu2/d$c;", "loading", "Lxu2/d$c;", "b", "()Lxu2/d$c;", "networkError", "c", "serverError", "g", "saved", "e", "saving", "f", "linkingError", "a", "retryLinkingError", "d", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final c m123979a() {
                return c.f166393q;
            }

            /* JADX INFO: renamed from: b */
            public final c m123980b() {
                return c.f166388l;
            }

            /* JADX INFO: renamed from: c */
            public final c m123981c() {
                return c.f166389m;
            }

            /* JADX INFO: renamed from: d */
            public final c m123982d() {
                return c.f166394r;
            }

            /* JADX INFO: renamed from: e */
            public final c m123983e() {
                return c.f166391o;
            }

            /* JADX INFO: renamed from: f */
            public final c m123984f() {
                return c.f166392p;
            }

            /* JADX INFO: renamed from: g */
            public final c m123985g() {
                return c.f166390n;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            boolean z4 = false;
            InterfaceC17655b interfaceC17655b = null;
            f166389m = new c(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35473h1), z4, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0), null, z4, AbstractC8693b.m21277k(AbstractC11128h.f35409N), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC17655b, 246, null);
            boolean z13 = false;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            f166390n = new c(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35506s1), z13, objArr2, 6, objArr), null, z13, AbstractC8693b.m21277k(AbstractC11128h.f35409N), null, 0 == true ? 1 : 0, interfaceC17655b, null, 246, null);
            TextResource textResource = null;
            Object[] objArr3 = 0 == true ? 1 : 0;
            InterfaceC17655b interfaceC17655b2 = null;
            Object[] objArr4 = 0 == true ? 1 : 0;
            f166391o = new c(new AbstractC33208p0.h(textResource, 0L, objArr3, 7, 0 == true ? 1 : 0), textResource, false, null, objArr4, null, 0 == true ? 1 : 0, interfaceC17655b2, 254, null);
            InterfaceC17655b interfaceC17655b3 = null;
            f166392p = new c(AbstractC33208p0.f.f138478e, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC17655b2, interfaceC17655b3, 254, null);
            Object[] objArr5 = 0 == true ? 1 : 0;
            c cVar = new c(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35416P0), false, null, 6, null), AbstractC8693b.m21277k(AbstractC11128h.f35458c1), false, AbstractC8693b.m21277k(AbstractC11128h.f35421R), objArr5, interfaceC17655b2, interfaceC17655b3, null, 244, null);
            f166393q = cVar;
            f166394r = m123969i(cVar, null, AbstractC8693b.m21277k(AbstractC11128h.f35461d1), true, AbstractC8693b.m21277k(AbstractC11128h.f35424S), AbstractC8693b.m21277k(AbstractC11128h.f35409N), null, null, null, 225, null);
        }

        public c(AbstractC33208p0 type, TextResource supportText, boolean z4, TextResource primaryButtonText, TextResource secondaryButtonText, InterfaceC17655b interfaceC17655b, InterfaceC17655b interfaceC17655b2, InterfaceC17655b interfaceC17655b3) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.showSecondaryAction = z4;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = secondaryButtonText;
            this.buttonClickViewEvent = interfaceC17655b;
            this.secondaryButtonClickViewEvent = interfaceC17655b2;
            this.followUpEvent = interfaceC17655b3;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ c m123969i(c cVar, AbstractC33208p0 abstractC33208p0, TextResource textResource, boolean z4, TextResource textResource2, TextResource textResource3, InterfaceC17655b interfaceC17655b, InterfaceC17655b interfaceC17655b2, InterfaceC17655b interfaceC17655b3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC33208p0 = cVar.type;
            }
            if ((i13 & 2) != 0) {
                textResource = cVar.supportText;
            }
            if ((i13 & 4) != 0) {
                z4 = cVar.showSecondaryAction;
            }
            if ((i13 & 8) != 0) {
                textResource2 = cVar.primaryButtonText;
            }
            if ((i13 & 16) != 0) {
                textResource3 = cVar.secondaryButtonText;
            }
            if ((i13 & 32) != 0) {
                interfaceC17655b = cVar.buttonClickViewEvent;
            }
            if ((i13 & 64) != 0) {
                interfaceC17655b2 = cVar.secondaryButtonClickViewEvent;
            }
            if ((i13 & 128) != 0) {
                interfaceC17655b3 = cVar.followUpEvent;
            }
            InterfaceC17655b interfaceC17655b4 = interfaceC17655b2;
            InterfaceC17655b interfaceC17655b5 = interfaceC17655b3;
            TextResource textResource4 = textResource3;
            InterfaceC17655b interfaceC17655b6 = interfaceC17655b;
            return cVar.m123970h(abstractC33208p0, textResource, z4, textResource2, textResource4, interfaceC17655b6, interfaceC17655b4, interfaceC17655b5);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.type, cVar.type) && AbstractC22676k.m65745e(this.supportText, cVar.supportText) && this.showSecondaryAction == cVar.showSecondaryAction && AbstractC22676k.m65745e(this.primaryButtonText, cVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, cVar.secondaryButtonText) && AbstractC22676k.m65745e(this.buttonClickViewEvent, cVar.buttonClickViewEvent) && AbstractC22676k.m65745e(this.secondaryButtonClickViewEvent, cVar.secondaryButtonClickViewEvent) && AbstractC22676k.m65745e(this.followUpEvent, cVar.followUpEvent);
        }

        /* JADX INFO: renamed from: h */
        public final c m123970h(AbstractC33208p0 type, TextResource supportText, boolean showSecondaryAction, TextResource primaryButtonText, TextResource secondaryButtonText, InterfaceC17655b buttonClickViewEvent, InterfaceC17655b secondaryButtonClickViewEvent, InterfaceC17655b followUpEvent) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            return new c(type, supportText, showSecondaryAction, primaryButtonText, secondaryButtonText, buttonClickViewEvent, secondaryButtonClickViewEvent, followUpEvent);
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), 31, this.showSecondaryAction), this.primaryButtonText, 31), this.secondaryButtonText, 31);
            InterfaceC17655b interfaceC17655b = this.buttonClickViewEvent;
            int iHashCode = (iM95625a + (interfaceC17655b == null ? 0 : interfaceC17655b.hashCode())) * 31;
            InterfaceC17655b interfaceC17655b2 = this.secondaryButtonClickViewEvent;
            int iHashCode2 = (iHashCode + (interfaceC17655b2 == null ? 0 : interfaceC17655b2.hashCode())) * 31;
            InterfaceC17655b interfaceC17655b3 = this.followUpEvent;
            return iHashCode2 + (interfaceC17655b3 != null ? interfaceC17655b3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final InterfaceC17655b getButtonClickViewEvent() {
            return this.buttonClickViewEvent;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final InterfaceC17655b getFollowUpEvent() {
            return this.followUpEvent;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final InterfaceC17655b getSecondaryButtonClickViewEvent() {
            return this.secondaryButtonClickViewEvent;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getShowSecondaryAction() {
            return this.showSecondaryAction;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            boolean z4 = this.showSecondaryAction;
            TextResource textResource2 = this.primaryButtonText;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC17655b interfaceC17655b = this.buttonClickViewEvent;
            InterfaceC17655b interfaceC17655b2 = this.secondaryButtonClickViewEvent;
            InterfaceC17655b interfaceC17655b3 = this.followUpEvent;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", showSecondaryAction=");
            AbstractC21702c.m61144o(textResource2, ", primaryButtonText=", ", secondaryButtonText=", sbM30862n, z4);
            sbM30862n.append(textResource3);
            sbM30862n.append(", buttonClickViewEvent=");
            sbM30862n.append(interfaceC17655b);
            sbM30862n.append(", secondaryButtonClickViewEvent=");
            sbM30862n.append(interfaceC17655b2);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC17655b3);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ c(AbstractC33208p0 abstractC33208p0, TextResource textResource, boolean z4, TextResource textResource2, TextResource textResource3, InterfaceC17655b interfaceC17655b, InterfaceC17655b interfaceC17655b2, InterfaceC17655b interfaceC17655b3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC17655b, (i13 & 64) != 0 ? null : interfaceC17655b2, (i13 & 128) != 0 ? null : interfaceC17655b3);
        }
    }
}

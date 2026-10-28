package uw1;

import c41.C4092p2;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.EnumC21213p;
import java.util.List;
import jx1.C22015f0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33211q0;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import ww1.AbstractC37659e;
import ww1.InterfaceC37657c;
import ww1.InterfaceC37658d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: uw1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0016\u001a\u0014B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Luw1/c;", "", "Luw1/c$a;", "popUpDialog", "Luw1/c$b;", "fullScreenModal", "Luw1/c$c;", "screenContent", "<init>", "(Luw1/c$a;Luw1/c$b;Luw1/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luw1/c$a;", "b", "()Luw1/c$a;", "Luw1/c$b;", "()Luw1/c$b;", "c", "Luw1/c$c;", "()Luw1/c$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35310c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a popUpDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final c screenContent;

    /* JADX INFO: renamed from: uw1.c$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Luw1/c$c;", "", "", "navigationBarTitle", "", "Ljx1/f0;", "sections", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String navigationBarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<C22015f0> sections;

        public c(String navigationBarTitle, List<C22015f0> sections) {
            AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
            AbstractC22676k.m65750j(sections, "sections");
            this.navigationBarTitle = navigationBarTitle;
            this.sections = sections;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNavigationBarTitle() {
            return this.navigationBarTitle;
        }

        /* JADX INFO: renamed from: b */
        public final List<C22015f0> m112126b() {
            return this.sections;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.navigationBarTitle, cVar.navigationBarTitle) && AbstractC22676k.m65745e(this.sections, cVar.sections);
        }

        public int hashCode() {
            return this.sections.hashCode() + (this.navigationBarTitle.hashCode() * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("ScreenContent(navigationBarTitle=", this.navigationBarTitle, ", sections=", ")", this.sections);
        }
    }

    public C35310c(a aVar, b bVar, c cVar) {
        this.popUpDialog = aVar;
        this.fullScreenModal = bVar;
        this.screenContent = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35310c)) {
            return false;
        }
        C35310c c35310c = (C35310c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c35310c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c35310c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c35310c.screenContent);
    }

    public int hashCode() {
        a aVar = this.popUpDialog;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.fullScreenModal;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.screenContent;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "FamilyPlanHubViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: uw1.c$b */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Luw1/c$b;", "", "Lsz0/q0;", "state", "Lww1/d;", "primaryClickEvent", "secondaryClickEvent", "Lww1/e;", "backClickEvent", "<init>", "(Lsz0/q0;Lww1/d;Lww1/d;Lww1/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lww1/d;", "()Lww1/d;", "c", "Lww1/e;", "()Lww1/e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e */
        public static final int f150415e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC37658d primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC37658d secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AbstractC37659e backClickEvent;

        public b(C33211q0 state, InterfaceC37658d interfaceC37658d, InterfaceC37658d interfaceC37658d2, AbstractC37659e abstractC37659e) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC37658d;
            this.secondaryClickEvent = interfaceC37658d2;
            this.backClickEvent = abstractC37659e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC37659e getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC37658d getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC37658d getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.state, bVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, bVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, bVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, bVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC37658d interfaceC37658d = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC37658d == null ? 0 : interfaceC37658d.hashCode())) * 31;
            InterfaceC37658d interfaceC37658d2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC37658d2 == null ? 0 : interfaceC37658d2.hashCode())) * 31;
            AbstractC37659e abstractC37659e = this.backClickEvent;
            return iHashCode3 + (abstractC37659e != null ? abstractC37659e.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ b(C33211q0 c33211q0, InterfaceC37658d interfaceC37658d, InterfaceC37658d interfaceC37658d2, AbstractC37659e abstractC37659e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC37658d, (i13 & 4) != 0 ? null : interfaceC37658d2, (i13 & 8) != 0 ? null : abstractC37659e);
        }
    }

    public /* synthetic */ C35310c(a aVar, b bVar, c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : cVar);
    }

    /* JADX INFO: renamed from: uw1.c$a */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b2\u00103R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b4\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b\"\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b4\u00108\u001a\u0004\b,\u00109R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b&\u0010<R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001cR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010\u001c¨\u0006B"}, m65681d2 = {"Luw1/c$a;", "", "Lcom/whoop/design/util/TextResource;", "title", "primaryActionText", "Ly81/e;", "primaryActionColor", "secondaryActionText", "description", "", "iconRes", "", "showCloseIcon", "useSolidButtons", "Lj11/p;", "topDialogStyle", "Lww1/c;", "approveEvent", "dismissEvent", "", "Lc41/p2;", "callouts", "", "userId", "familyPlanId", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZZLj11/p;Lww1/c;Lww1/c;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "Ly81/e;", "e", "()Ly81/e;", "d", "g", "Ljava/lang/Integer;", "getIconRes", "()Ljava/lang/Integer;", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "k", "Lj11/p;", "j", "()Lj11/p;", "Lww1/c;", "()Lww1/c;", "l", "Ljava/util/List;", "()Ljava/util/List;", "m", "Ljava/lang/String;", "getUserId", "n", "getFamilyPlanId", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource primaryActionText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC39332e primaryActionColor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource secondaryActionText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Integer iconRes;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean showCloseIcon;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean useSolidButtons;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final EnumC21213p topDialogStyle;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final InterfaceC37657c approveEvent;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final InterfaceC37657c dismissEvent;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final List<C4092p2> callouts;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final String userId;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final String familyPlanId;

        public a(TextResource title, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, TextResource description, Integer num, boolean z4, boolean z13, EnumC21213p topDialogStyle, InterfaceC37657c interfaceC37657c, InterfaceC37657c interfaceC37657c2, List<C4092p2> callouts, String userId, String familyPlanId) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(topDialogStyle, "topDialogStyle");
            AbstractC22676k.m65750j(callouts, "callouts");
            AbstractC22676k.m65750j(userId, "userId");
            AbstractC22676k.m65750j(familyPlanId, "familyPlanId");
            this.title = title;
            this.primaryActionText = textResource;
            this.primaryActionColor = interfaceC39332e;
            this.secondaryActionText = textResource2;
            this.description = description;
            this.iconRes = num;
            this.showCloseIcon = z4;
            this.useSolidButtons = z13;
            this.topDialogStyle = topDialogStyle;
            this.approveEvent = interfaceC37657c;
            this.dismissEvent = interfaceC37657c2;
            this.callouts = callouts;
            this.userId = userId;
            this.familyPlanId = familyPlanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC37657c getApproveEvent() {
            return this.approveEvent;
        }

        /* JADX INFO: renamed from: b */
        public final List<C4092p2> m112111b() {
            return this.callouts;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC37657c getDismissEvent() {
            return this.dismissEvent;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC39332e getPrimaryActionColor() {
            return this.primaryActionColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.primaryActionText, aVar.primaryActionText) && AbstractC22676k.m65745e(this.primaryActionColor, aVar.primaryActionColor) && AbstractC22676k.m65745e(this.secondaryActionText, aVar.secondaryActionText) && AbstractC22676k.m65745e(this.description, aVar.description) && AbstractC22676k.m65745e(this.iconRes, aVar.iconRes) && this.showCloseIcon == aVar.showCloseIcon && this.useSolidButtons == aVar.useSolidButtons && this.topDialogStyle == aVar.topDialogStyle && AbstractC22676k.m65745e(this.approveEvent, aVar.approveEvent) && AbstractC22676k.m65745e(this.dismissEvent, aVar.dismissEvent) && AbstractC22676k.m65745e(this.callouts, aVar.callouts) && AbstractC22676k.m65745e(this.userId, aVar.userId) && AbstractC22676k.m65745e(this.familyPlanId, aVar.familyPlanId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getPrimaryActionText() {
            return this.primaryActionText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getSecondaryActionText() {
            return this.secondaryActionText;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            TextResource textResource = this.primaryActionText;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            int iHashCode3 = (iHashCode2 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
            TextResource textResource2 = this.secondaryActionText;
            int iM95625a = AbstractC31061c.m95625a((iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, this.description, 31);
            Integer num = this.iconRes;
            int iM106647f = AbstractC33745d.m106647f(this.topDialogStyle, AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM95625a + (num == null ? 0 : num.hashCode())) * 31, 31, this.showCloseIcon), 31, this.useSolidButtons), 31);
            InterfaceC37657c interfaceC37657c = this.approveEvent;
            int iHashCode4 = (iM106647f + (interfaceC37657c == null ? 0 : interfaceC37657c.hashCode())) * 31;
            InterfaceC37657c interfaceC37657c2 = this.dismissEvent;
            return this.familyPlanId.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b((iHashCode4 + (interfaceC37657c2 != null ? interfaceC37657c2.hashCode() : 0)) * 31, 31, this.callouts), 31, this.userId);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final EnumC21213p getTopDialogStyle() {
            return this.topDialogStyle;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getUseSolidButtons() {
            return this.useSolidButtons;
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.primaryActionText;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            TextResource textResource3 = this.secondaryActionText;
            TextResource textResource4 = this.description;
            Integer num = this.iconRes;
            boolean z4 = this.showCloseIcon;
            boolean z13 = this.useSolidButtons;
            EnumC21213p enumC21213p = this.topDialogStyle;
            InterfaceC37657c interfaceC37657c = this.approveEvent;
            InterfaceC37657c interfaceC37657c2 = this.dismissEvent;
            List<C4092p2> list = this.callouts;
            String str = this.userId;
            String str2 = this.familyPlanId;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("FamilyPlanHubPopUpDialogState(title=", textResource, ", primaryActionText=", textResource2, ", primaryActionColor=");
            AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", secondaryActionText=", textResource3, ", description=");
            sbM106658q.append(textResource4);
            sbM106658q.append(", iconRes=");
            sbM106658q.append(num);
            sbM106658q.append(", showCloseIcon=");
            AbstractC38963t7.m124392v(sbM106658q, z4, ", useSolidButtons=", z13, ", topDialogStyle=");
            sbM106658q.append(enumC21213p);
            sbM106658q.append(", approveEvent=");
            sbM106658q.append(interfaceC37657c);
            sbM106658q.append(", dismissEvent=");
            sbM106658q.append(interfaceC37657c2);
            sbM106658q.append(", callouts=");
            sbM106658q.append(list);
            sbM106658q.append(", userId=");
            return AbstractC11266d.m30464r(sbM106658q, str, ", familyPlanId=", str2, ")");
        }

        public /* synthetic */ a(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, Integer num, boolean z4, boolean z13, EnumC21213p enumC21213p, InterfaceC37657c interfaceC37657c, InterfaceC37657c interfaceC37657c2, List list, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : interfaceC39332e, (i13 & 8) != 0 ? null : textResource3, textResource4, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? EnumC21213p.DEFAULT : enumC21213p, (i13 & 512) != 0 ? null : interfaceC37657c, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : interfaceC37657c2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C25271y.f99162w : list, str, str2);
        }
    }
}

package hs2;

import c41.C4092p2;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import fs2.InterfaceC14759l;
import fy1.InterfaceC14875k;
import gz0.EnumC16313m0;
import hy0.C17749h0;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: hs2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\"\u001b#\u0015\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m65681d2 = {"Lhs2/e;", "Lfy1/k;", "Lhs2/e$a;", "fullScreenModal", "Lfs2/l;", "callState", "Lhs2/e$d;", "screenContent", "<init>", "(Lhs2/e$a;Lfs2/l;Lhs2/e$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lhs2/e$a;", "c", "()Lhs2/e$a;", "Lfs2/l;", "()Lfs2/l;", "d", "Lhs2/e$d;", "()Lhs2/e$d;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "e", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17611e implements InterfaceC14875k {

    /* JADX INFO: renamed from: e */
    public static final int f68281e = (((C17749h0.f69004h | C4092p2.f16593v) | DialogModel.$stable) | C9598e.f28134d) | C33211q0.f138501k;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final a fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14759l callState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final d screenContent;

    /* JADX INFO: renamed from: hs2.e$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lhs2/e$b;", "", "", "title", "Lhs2/e$c;", "rightButton", "<init>", "(Ljava/lang/String;Lhs2/e$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lhs2/e$c;", "()Lhs2/e$c;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: c */
        public static final int f68290c = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final c rightButton;

        public b(String str, c cVar) {
            this.title = str;
            this.rightButton = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getRightButton() {
            return this.rightButton;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.rightButton, bVar.rightButton);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            c cVar = this.rightButton;
            return iHashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "NavigationBarViewState(title=" + this.title + ", rightButton=" + this.rightButton + ")";
        }
    }

    /* JADX INFO: renamed from: hs2.e$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lhs2/e$c;", "", "Lgz0/m0;", "icon", "", "contentDescription", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "c", "()Lgz0/m0;", "b", "Ljava/lang/String;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: d */
        public static final int f68293d = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC16313m0 icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String contentDescription;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C9598e destination;

        public c(EnumC16313m0 icon, String str, C9598e c9598e) {
            AbstractC22676k.m65750j(icon, "icon");
            this.icon = icon;
            this.contentDescription = str;
            this.destination = c9598e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContentDescription() {
            return this.contentDescription;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.icon == cVar.icon && AbstractC22676k.m65745e(this.contentDescription, cVar.contentDescription) && AbstractC22676k.m65745e(this.destination, cVar.destination);
        }

        public int hashCode() {
            int iHashCode = this.icon.hashCode() * 31;
            String str = this.contentDescription;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C9598e c9598e = this.destination;
            return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
        }

        public String toString() {
            EnumC16313m0 enumC16313m0 = this.icon;
            String str = this.contentDescription;
            C9598e c9598e = this.destination;
            StringBuilder sb4 = new StringBuilder("NavigationButtonViewState(icon=");
            sb4.append(enumC16313m0);
            sb4.append(", contentDescription=");
            sb4.append(str);
            sb4.append(", destination=");
            return AbstractC33745d.m106656o(sb4, c9598e, ")");
        }
    }

    /* JADX INFO: renamed from: hs2.e$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lhs2/e$d;", "", "Lhs2/e$e;", "waitingRoom", "Lhs2/c;", "participants", "", "arePermissionsEnabled", "<init>", "(Lhs2/e$e;Lhs2/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhs2/e$e;", "c", "()Lhs2/e$e;", "b", "Lhs2/c;", "()Lhs2/c;", "Z", "()Z", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: d */
        public static final int f68297d = ((C17749h0.f69004h | C4092p2.f16593v) | DialogModel.$stable) | C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final e waitingRoom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C17609c participants;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean arePermissionsEnabled;

        public d(e waitingRoom, C17609c participants, boolean z4) {
            AbstractC22676k.m65750j(waitingRoom, "waitingRoom");
            AbstractC22676k.m65750j(participants, "participants");
            this.waitingRoom = waitingRoom;
            this.participants = participants;
            this.arePermissionsEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getArePermissionsEnabled() {
            return this.arePermissionsEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C17609c getParticipants() {
            return this.participants;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e getWaitingRoom() {
            return this.waitingRoom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.waitingRoom, dVar.waitingRoom) && AbstractC22676k.m65745e(this.participants, dVar.participants) && this.arePermissionsEnabled == dVar.arePermissionsEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.arePermissionsEnabled) + ((this.participants.hashCode() + (this.waitingRoom.hashCode() * 31)) * 31);
        }

        public String toString() {
            e eVar = this.waitingRoom;
            C17609c c17609c = this.participants;
            boolean z4 = this.arePermissionsEnabled;
            StringBuilder sb4 = new StringBuilder("ScreenContent(waitingRoom=");
            sb4.append(eVar);
            sb4.append(", participants=");
            sb4.append(c17609c);
            sb4.append(", arePermissionsEnabled=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: hs2.e$e */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006$"}, m65681d2 = {"Lhs2/e$e;", "", "Lhs2/e$b;", "navigationBar", "", "header", "description", "primaryButtonTitle", "Lcom/whoop/design/models/modal/DialogModel;", "permissionsModal", "Lc41/p2;", "permissionsCallout", "<init>", "(Lhs2/e$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/DialogModel;Lc41/p2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhs2/e$b;", "c", "()Lhs2/e$b;", "b", "Ljava/lang/String;", "d", "f", "e", "Lcom/whoop/design/models/modal/DialogModel;", "()Lcom/whoop/design/models/modal/DialogModel;", "Lc41/p2;", "()Lc41/p2;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: g */
        public static final int f68301g = (C4092p2.f16593v | DialogModel.$stable) | C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final b navigationBar;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String header;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String primaryButtonTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final DialogModel permissionsModal;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C4092p2 permissionsCallout;

        public e(b navigationBar, String header, String description, String primaryButtonTitle, DialogModel permissionsModal, C4092p2 c4092p2) {
            AbstractC22676k.m65750j(navigationBar, "navigationBar");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
            AbstractC22676k.m65750j(permissionsModal, "permissionsModal");
            this.navigationBar = navigationBar;
            this.header = header;
            this.description = description;
            this.primaryButtonTitle = primaryButtonTitle;
            this.permissionsModal = permissionsModal;
            this.permissionsCallout = c4092p2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getNavigationBar() {
            return this.navigationBar;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C4092p2 getPermissionsCallout() {
            return this.permissionsCallout;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DialogModel getPermissionsModal() {
            return this.permissionsModal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.navigationBar, eVar.navigationBar) && AbstractC22676k.m65745e(this.header, eVar.header) && AbstractC22676k.m65745e(this.description, eVar.description) && AbstractC22676k.m65745e(this.primaryButtonTitle, eVar.primaryButtonTitle) && AbstractC22676k.m65745e(this.permissionsModal, eVar.permissionsModal) && AbstractC22676k.m65745e(this.permissionsCallout, eVar.permissionsCallout);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPrimaryButtonTitle() {
            return this.primaryButtonTitle;
        }

        public int hashCode() {
            int iHashCode = (this.permissionsModal.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBar.hashCode() * 31, 31, this.header), 31, this.description), 31, this.primaryButtonTitle)) * 31;
            C4092p2 c4092p2 = this.permissionsCallout;
            return iHashCode + (c4092p2 == null ? 0 : c4092p2.hashCode());
        }

        public String toString() {
            b bVar = this.navigationBar;
            String str = this.header;
            String str2 = this.description;
            String str3 = this.primaryButtonTitle;
            DialogModel dialogModel = this.permissionsModal;
            C4092p2 c4092p2 = this.permissionsCallout;
            StringBuilder sb4 = new StringBuilder("WaitingRoomContent(navigationBar=");
            sb4.append(bVar);
            sb4.append(", header=");
            sb4.append(str);
            sb4.append(", description=");
            AbstractC11266d.m30444B(sb4, str2, ", primaryButtonTitle=", str3, ", permissionsModal=");
            sb4.append(dialogModel);
            sb4.append(", permissionsCallout=");
            sb4.append(c4092p2);
            sb4.append(")");
            return sb4.toString();
        }
    }

    public C17611e(a aVar, InterfaceC14759l interfaceC14759l, d dVar) {
        this.fullScreenModal = aVar;
        this.callState = interfaceC14759l;
        this.screenContent = dVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC14759l getCallState() {
        return this.callState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17611e)) {
            return false;
        }
        C17611e c17611e = (C17611e) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c17611e.fullScreenModal) && AbstractC22676k.m65745e(this.callState, c17611e.callState) && AbstractC22676k.m65745e(this.screenContent, c17611e.screenContent);
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        a aVar = this.fullScreenModal;
        if (aVar == null) {
            return this.screenContent != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
        }
        AbstractC33208p0 type = aVar.getState().getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
    }

    public int hashCode() {
        a aVar = this.fullScreenModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        InterfaceC14759l interfaceC14759l = this.callState;
        int iHashCode2 = (iHashCode + (interfaceC14759l == null ? 0 : interfaceC14759l.hashCode())) * 31;
        d dVar = this.screenContent;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "VideoCallViewState(fullScreenModal=" + this.fullScreenModal + ", callState=" + this.callState + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: hs2.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lhs2/e$a;", "", "Lsz0/q0;", "state", "Lhs2/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lhs2/a;Lhs2/a;Lhs2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lhs2/a;", "()Lhs2/a;", "c", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: e */
        public static final int f68285e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC17607a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC17607a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC17607a backClickEvent;

        public a(C33211q0 state, InterfaceC17607a interfaceC17607a, InterfaceC17607a interfaceC17607a2, InterfaceC17607a interfaceC17607a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC17607a;
            this.secondaryClickEvent = interfaceC17607a2;
            this.backClickEvent = interfaceC17607a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC17607a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC17607a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC17607a getSecondaryClickEvent() {
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
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.state, aVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, aVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, aVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, aVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC17607a interfaceC17607a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC17607a == null ? 0 : interfaceC17607a.hashCode())) * 31;
            InterfaceC17607a interfaceC17607a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC17607a2 == null ? 0 : interfaceC17607a2.hashCode())) * 31;
            InterfaceC17607a interfaceC17607a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC17607a3 != null ? interfaceC17607a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ a(C33211q0 c33211q0, InterfaceC17607a interfaceC17607a, InterfaceC17607a interfaceC17607a2, InterfaceC17607a interfaceC17607a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC17607a, (i13 & 4) != 0 ? null : interfaceC17607a2, (i13 & 8) != 0 ? null : interfaceC17607a3);
        }
    }

    public /* synthetic */ C17611e(a aVar, InterfaceC14759l interfaceC14759l, d dVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : interfaceC14759l, (i13 & 4) != 0 ? null : dVar);
    }
}

package nl2;

import c41.C4092p2;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import jl2.C21776c;
import jl2.EnumC21774a;
import ml2.InterfaceC25676a;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33211q0;
import p736sz0.C33218s1;
import p736sz0.C33221t1;
import p736sz0.EnumC33227v1;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import x21.C37858a;

/* JADX INFO: renamed from: nl2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0018\"#$\u001c\u0016\u001aB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006%"}, m65681d2 = {"Lnl2/c;", "", "Lnl2/c$d;", "fullScreenModal", "Lnl2/c$c;", "dialogState", "Lnl2/c$f;", "content", "Lnl2/c$a;", "bottomSheetState", "<init>", "(Lnl2/c$d;Lnl2/c$c;Lnl2/c$f;Lnl2/c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnl2/c$d;", "d", "()Lnl2/c$d;", "b", "Lnl2/c$c;", "c", "()Lnl2/c$c;", "Lnl2/c$f;", "()Lnl2/c$f;", "Lnl2/c$a;", "()Lnl2/c$a;", "f", "e", "g", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26816c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final d fullScreenModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c dialogState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final f content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final a bottomSheetState;

    /* JADX INFO: renamed from: nl2.c$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000f\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lnl2/c$a;", "", "Lcom/whoop/design/util/TextResource;", "getTitle", "()Lcom/whoop/design/util/TextResource;", "title", "Lx21/a;", "c", "()Lx21/a;", "numberPickerState", "Lnl2/c$b;", "a", "()Lnl2/c$b;", "primaryButton", "Lc41/p2;", "b", "()Lc41/p2;", "infoCalloutState", "Lnl2/c$a$a;", "Lnl2/c$a$b;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: nl2.c$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, m65681d2 = {"Lnl2/c$a$a;", "Lnl2/c$a;", "Lcom/whoop/design/util/TextResource;", "title", "Lx21/a;", "numberPickerState", "Lnl2/c$b;", "primaryButton", "Lc41/p2;", "infoCalloutState", "<init>", "(Lcom/whoop/design/util/TextResource;Lx21/a;Lnl2/c$b;Lc41/p2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "getTitle", "()Lcom/whoop/design/util/TextResource;", "b", "Lx21/a;", "c", "()Lx21/a;", "Lnl2/c$b;", "()Lnl2/c$b;", "d", "Lc41/p2;", "()Lc41/p2;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42064a implements a {

            /* JADX INFO: renamed from: e */
            public static final int f106911e;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final C37858a numberPickerState;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final b primaryButton;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final C4092p2 infoCalloutState;

            static {
                int i13 = C4092p2.f16593v;
                int i14 = TextResource.$stable;
                f106911e = i13 | i14 | C37858a.f162062h | i14;
            }

            public C42064a(TextResource title, C37858a numberPickerState, b primaryButton, C4092p2 c4092p2) {
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(numberPickerState, "numberPickerState");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                this.title = title;
                this.numberPickerState = numberPickerState;
                this.primaryButton = primaryButton;
                this.infoCalloutState = c4092p2;
            }

            @Override // nl2.C26816c.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getPrimaryButton() {
                return this.primaryButton;
            }

            @Override // nl2.C26816c.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public C4092p2 getInfoCalloutState() {
                return this.infoCalloutState;
            }

            @Override // nl2.C26816c.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C37858a getNumberPickerState() {
                return this.numberPickerState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C42064a)) {
                    return false;
                }
                C42064a c42064a = (C42064a) other;
                return AbstractC22676k.m65745e(this.title, c42064a.title) && AbstractC22676k.m65745e(this.numberPickerState, c42064a.numberPickerState) && AbstractC22676k.m65745e(this.primaryButton, c42064a.primaryButton) && AbstractC22676k.m65745e(this.infoCalloutState, c42064a.infoCalloutState);
            }

            @Override // nl2.C26816c.a
            public TextResource getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = (this.primaryButton.hashCode() + ((this.numberPickerState.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31;
                C4092p2 c4092p2 = this.infoCalloutState;
                return iHashCode + (c4092p2 == null ? 0 : c4092p2.hashCode());
            }

            public String toString() {
                return "BottomSheetMaxHrPickerState(title=" + this.title + ", numberPickerState=" + this.numberPickerState + ", primaryButton=" + this.primaryButton + ", infoCalloutState=" + this.infoCalloutState + ")";
            }
        }

        /* JADX INFO: renamed from: nl2.c$a$b */
        @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b$\u0010,R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b\u001c\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b \u00101¨\u00062"}, m65681d2 = {"Lnl2/c$a$b;", "Lnl2/c$a;", "Ljl2/a;", "zoneId", "Lsz0/v1;", "zoneValueType", "", "isOutOfRange", "Lcom/whoop/design/util/TextResource;", "title", "Lx21/a;", "numberPickerState", "Lnl2/c$b;", "primaryButton", "Lc41/p2;", "infoCalloutState", "<init>", "(Ljl2/a;Lsz0/v1;Ljava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lx21/a;Lnl2/c$b;Lc41/p2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljl2/a;", "d", "()Ljl2/a;", "b", "Lsz0/v1;", "e", "()Lsz0/v1;", "c", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "Lcom/whoop/design/util/TextResource;", "getTitle", "()Lcom/whoop/design/util/TextResource;", "Lx21/a;", "()Lx21/a;", "Lnl2/c$b;", "()Lnl2/c$b;", "g", "Lc41/p2;", "()Lc41/p2;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: h */
            public static final int f106916h;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final EnumC21774a zoneId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final EnumC33227v1 zoneValueType;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final Boolean isOutOfRange;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final C37858a numberPickerState;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final b primaryButton;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final C4092p2 infoCalloutState;

            static {
                int i13 = C4092p2.f16593v;
                int i14 = TextResource.$stable;
                f106916h = i13 | i14 | C37858a.f162062h | i14;
            }

            public b(EnumC21774a zoneId, EnumC33227v1 zoneValueType, Boolean bool, TextResource title, C37858a numberPickerState, b primaryButton, C4092p2 c4092p2) {
                AbstractC22676k.m65750j(zoneId, "zoneId");
                AbstractC22676k.m65750j(zoneValueType, "zoneValueType");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(numberPickerState, "numberPickerState");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                this.zoneId = zoneId;
                this.zoneValueType = zoneValueType;
                this.isOutOfRange = bool;
                this.title = title;
                this.numberPickerState = numberPickerState;
                this.primaryButton = primaryButton;
                this.infoCalloutState = c4092p2;
            }

            @Override // nl2.C26816c.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getPrimaryButton() {
                return this.primaryButton;
            }

            @Override // nl2.C26816c.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public C4092p2 getInfoCalloutState() {
                return this.infoCalloutState;
            }

            @Override // nl2.C26816c.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C37858a getNumberPickerState() {
                return this.numberPickerState;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final EnumC21774a getZoneId() {
                return this.zoneId;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final EnumC33227v1 getZoneValueType() {
                return this.zoneValueType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return this.zoneId == bVar.zoneId && this.zoneValueType == bVar.zoneValueType && AbstractC22676k.m65745e(this.isOutOfRange, bVar.isOutOfRange) && AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.numberPickerState, bVar.numberPickerState) && AbstractC22676k.m65745e(this.primaryButton, bVar.primaryButton) && AbstractC22676k.m65745e(this.infoCalloutState, bVar.infoCalloutState);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Boolean getIsOutOfRange() {
                return this.isOutOfRange;
            }

            @Override // nl2.C26816c.a
            public TextResource getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = (this.zoneValueType.hashCode() + (this.zoneId.hashCode() * 31)) * 31;
                Boolean bool = this.isOutOfRange;
                int iHashCode2 = (this.primaryButton.hashCode() + ((this.numberPickerState.hashCode() + AbstractC31061c.m95625a((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, this.title, 31)) * 31)) * 31;
                C4092p2 c4092p2 = this.infoCalloutState;
                return iHashCode2 + (c4092p2 != null ? c4092p2.hashCode() : 0);
            }

            public String toString() {
                return "BottomSheetZonePickerState(zoneId=" + this.zoneId + ", zoneValueType=" + this.zoneValueType + ", isOutOfRange=" + this.isOutOfRange + ", title=" + this.title + ", numberPickerState=" + this.numberPickerState + ", primaryButton=" + this.primaryButton + ", infoCalloutState=" + this.infoCalloutState + ")";
            }
        }

        /* JADX INFO: renamed from: a */
        b getPrimaryButton();

        /* JADX INFO: renamed from: b */
        C4092p2 getInfoCalloutState();

        /* JADX INFO: renamed from: c */
        C37858a getNumberPickerState();

        TextResource getTitle();
    }

    /* JADX INFO: renamed from: nl2.c$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001d\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b\u0019\u0010*R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010\u0015¨\u0006+"}, m65681d2 = {"Lnl2/c$e;", "", "Ljl2/c$a;", "type", "Lcom/whoop/design/util/TextResource;", "label", "", "value", "", "units", "", "editable", "Ly81/f;", "color", "minValue", "maxValue", "<init>", "(Ljl2/c$a;Lcom/whoop/design/util/TextResource;ILjava/lang/String;ZLy81/f;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljl2/c$a;", "f", "()Ljl2/c$a;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "Ljava/lang/String;", "g", "e", "Z", "()Z", "Ly81/f;", "()Ly81/f;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: i */
        public static final int f106940i = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21776c.a type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource label;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String units;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean editable;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC39333f color;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final int minValue;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final int maxValue;

        public e(C21776c.a type, TextResource label, int i13, String units, boolean z4, EnumC39333f color, int i14, int i15) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(units, "units");
            AbstractC22676k.m65750j(color, "color");
            this.type = type;
            this.label = label;
            this.value = i13;
            this.units = units;
            this.editable = z4;
            this.color = color;
            this.minValue = i14;
            this.maxValue = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC39333f getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEditable() {
            return this.editable;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMaxValue() {
            return this.maxValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMinValue() {
            return this.minValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.type == eVar.type && AbstractC22676k.m65745e(this.label, eVar.label) && this.value == eVar.value && AbstractC22676k.m65745e(this.units, eVar.units) && this.editable == eVar.editable && this.color == eVar.color && this.minValue == eVar.minValue && this.maxValue == eVar.maxValue;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C21776c.a getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getUnits() {
            return this.units;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxValue) + AbstractC11266d.m30448b(this.minValue, AbstractC21702c.m61132c(this.color, AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.value, AbstractC31061c.m95625a(this.type.hashCode() * 31, this.label, 31), 31), 31, this.units), 31, this.editable), 31), 31);
        }

        public String toString() {
            C21776c.a aVar = this.type;
            TextResource textResource = this.label;
            int i13 = this.value;
            String str = this.units;
            boolean z4 = this.editable;
            EnumC39333f enumC39333f = this.color;
            int i14 = this.minValue;
            int i15 = this.maxValue;
            StringBuilder sb4 = new StringBuilder("HREntryRowViewState(type=");
            sb4.append(aVar);
            sb4.append(", label=");
            sb4.append(textResource);
            sb4.append(", value=");
            AbstractC11895b.m31979B(i13, ", units=", str, ", editable=", sb4);
            sb4.append(z4);
            sb4.append(", color=");
            sb4.append(enumC39333f);
            sb4.append(", minValue=");
            return AbstractC26725a.m79505i(sb4, i14, ", maxValue=", i15, ")");
        }
    }

    /* JADX INFO: renamed from: nl2.c$f */
    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b+\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b$\u00100R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b'\u00100¨\u00062"}, m65681d2 = {"Lnl2/c$f;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "introTitle", "introBody", "", "Lnl2/c$e;", "entryRows", "Lnl2/c$g;", "toggleViewState", "Lsz0/s1;", "defaultHrZones", "Lsz0/t1;", "zoneViewState", "Lnl2/c$b;", "primaryButton", "secondaryButton", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lnl2/c$g;Ljava/util/List;Lsz0/t1;Lnl2/c$b;Lnl2/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Lnl2/c$g;", "f", "()Lnl2/c$g;", "getDefaultHrZones", "Lsz0/t1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lsz0/t1;", "Lnl2/c$b;", "()Lnl2/c$b;", "i", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource introTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource introBody;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<e> entryRows;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final g toggleViewState;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<C33218s1> defaultHrZones;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C33221t1 zoneViewState;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final b primaryButton;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final b secondaryButton;

        public f(TextResource toolbarTitle, TextResource introTitle, TextResource introBody, List<e> entryRows, g gVar, List<C33218s1> defaultHrZones, C33221t1 zoneViewState, b primaryButton, b secondaryButton) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(introTitle, "introTitle");
            AbstractC22676k.m65750j(introBody, "introBody");
            AbstractC22676k.m65750j(entryRows, "entryRows");
            AbstractC22676k.m65750j(defaultHrZones, "defaultHrZones");
            AbstractC22676k.m65750j(zoneViewState, "zoneViewState");
            AbstractC22676k.m65750j(primaryButton, "primaryButton");
            AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
            this.toolbarTitle = toolbarTitle;
            this.introTitle = introTitle;
            this.introBody = introBody;
            this.entryRows = entryRows;
            this.toggleViewState = gVar;
            this.defaultHrZones = defaultHrZones;
            this.zoneViewState = zoneViewState;
            this.primaryButton = primaryButton;
            this.secondaryButton = secondaryButton;
        }

        /* JADX INFO: renamed from: a */
        public final List<e> m80038a() {
            return this.entryRows;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getIntroBody() {
            return this.introBody;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getIntroTitle() {
            return this.introTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b getSecondaryButton() {
            return this.secondaryButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.toolbarTitle, fVar.toolbarTitle) && AbstractC22676k.m65745e(this.introTitle, fVar.introTitle) && AbstractC22676k.m65745e(this.introBody, fVar.introBody) && AbstractC22676k.m65745e(this.entryRows, fVar.entryRows) && AbstractC22676k.m65745e(this.toggleViewState, fVar.toggleViewState) && AbstractC22676k.m65745e(this.defaultHrZones, fVar.defaultHrZones) && AbstractC22676k.m65745e(this.zoneViewState, fVar.zoneViewState) && AbstractC22676k.m65745e(this.primaryButton, fVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, fVar.secondaryButton);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final g getToggleViewState() {
            return this.toggleViewState;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C33221t1 getZoneViewState() {
            return this.zoneViewState;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.toolbarTitle.hashCode() * 31, this.introTitle, 31), this.introBody, 31), 31, this.entryRows);
            g gVar = this.toggleViewState;
            return this.secondaryButton.hashCode() + ((this.primaryButton.hashCode() + ((this.zoneViewState.hashCode() + AbstractC11895b.m31983b((iM31983b + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.defaultHrZones)) * 31)) * 31);
        }

        public String toString() {
            TextResource textResource = this.toolbarTitle;
            TextResource textResource2 = this.introTitle;
            TextResource textResource3 = this.introBody;
            List<e> list = this.entryRows;
            g gVar = this.toggleViewState;
            List<C33218s1> list2 = this.defaultHrZones;
            C33221t1 c33221t1 = this.zoneViewState;
            b bVar = this.primaryButton;
            b bVar2 = this.secondaryButton;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("ScreenContent(toolbarTitle=", textResource, ", introTitle=", textResource2, ", introBody=");
            AbstractC21702c.m61143n(textResource3, ", entryRows=", ", toggleViewState=", sbM106658q, list);
            sbM106658q.append(gVar);
            sbM106658q.append(", defaultHrZones=");
            sbM106658q.append(list2);
            sbM106658q.append(", zoneViewState=");
            sbM106658q.append(c33221t1);
            sbM106658q.append(", primaryButton=");
            sbM106658q.append(bVar);
            sbM106658q.append(", secondaryButton=");
            sbM106658q.append(bVar2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }
    }

    /* JADX INFO: renamed from: nl2.c$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lnl2/c$g;", "", "", "toggleValue", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "<init>", "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: d */
        public static final int f106958d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean toggleValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource subtitle;

        public g(boolean z4, TextResource title, TextResource subtitle) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            this.toggleValue = z4;
            this.title = title;
            this.subtitle = subtitle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getToggleValue() {
            return this.toggleValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return this.toggleValue == gVar.toggleValue && AbstractC22676k.m65745e(this.title, gVar.title) && AbstractC22676k.m65745e(this.subtitle, gVar.subtitle);
        }

        public int hashCode() {
            return this.subtitle.hashCode() + AbstractC31061c.m95625a(Boolean.hashCode(this.toggleValue) * 31, this.title, 31);
        }

        public String toString() {
            boolean z4 = this.toggleValue;
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            StringBuilder sb4 = new StringBuilder("ToggleManualHeartRateViewState(toggleValue=");
            sb4.append(z4);
            sb4.append(", title=");
            sb4.append(textResource);
            sb4.append(", subtitle=");
            return AbstractC30007c.m91841k(sb4, textResource2, ")");
        }
    }

    public C26816c(d dVar, c cVar, f fVar, a aVar) {
        this.fullScreenModal = dVar;
        this.dialogState = cVar;
        this.content = fVar;
        this.bottomSheetState = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getDialogState() {
        return this.dialogState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getFullScreenModal() {
        return this.fullScreenModal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26816c)) {
            return false;
        }
        C26816c c26816c = (C26816c) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c26816c.fullScreenModal) && AbstractC22676k.m65745e(this.dialogState, c26816c.dialogState) && AbstractC22676k.m65745e(this.content, c26816c.content) && AbstractC22676k.m65745e(this.bottomSheetState, c26816c.bottomSheetState);
    }

    public int hashCode() {
        d dVar = this.fullScreenModal;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        c cVar = this.dialogState;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        f fVar = this.content;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        a aVar = this.bottomSheetState;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "HrSettingsViewState(fullScreenModal=" + this.fullScreenModal + ", dialogState=" + this.dialogState + ", content=" + this.content + ", bottomSheetState=" + this.bottomSheetState + ")";
    }

    /* JADX INFO: renamed from: nl2.c$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lnl2/c$b;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "enabled", "Lml2/a;", "action", "<init>", "(Lcom/whoop/design/util/TextResource;ZLml2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Z", "()Z", "Lml2/a;", "()Lml2/a;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: d */
        public static final int f106924d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean enabled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC25676a action;

        public b(TextResource title, boolean z4, InterfaceC25676a interfaceC25676a) {
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
            this.enabled = z4;
            this.action = interfaceC25676a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25676a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getTitle() {
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
            return AbstractC22676k.m65745e(this.title, bVar.title) && this.enabled == bVar.enabled && AbstractC22676k.m65745e(this.action, bVar.action);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.title.hashCode() * 31, 31, this.enabled);
            InterfaceC25676a interfaceC25676a = this.action;
            return iM8289b + (interfaceC25676a == null ? 0 : interfaceC25676a.hashCode());
        }

        public String toString() {
            TextResource textResource = this.title;
            boolean z4 = this.enabled;
            InterfaceC25676a interfaceC25676a = this.action;
            StringBuilder sbM91846p = AbstractC30007c.m91846p("ButtonInfoState(title=", textResource, ", enabled=", z4, ", action=");
            sbM91846p.append(interfaceC25676a);
            sbM91846p.append(")");
            return sbM91846p.toString();
        }

        public /* synthetic */ b(TextResource textResource, boolean z4, InterfaceC25676a interfaceC25676a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, z4, (i13 & 4) != 0 ? null : interfaceC25676a);
        }
    }

    /* JADX INFO: renamed from: nl2.c$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lnl2/c$d;", "", "Lsz0/q0;", "state", "Lml2/a;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Lsz0/q0;Lml2/a;Lml2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "c", "()Lsz0/q0;", "b", "Lml2/a;", "()Lml2/a;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: d */
        public static final int f106936d = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25676a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC25676a secondaryClickEvent;

        public d(C33211q0 state, InterfaceC25676a interfaceC25676a, InterfaceC25676a interfaceC25676a2) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC25676a;
            this.secondaryClickEvent = interfaceC25676a2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25676a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC25676a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.state, dVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, dVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, dVar.secondaryClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC25676a interfaceC25676a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC25676a == null ? 0 : interfaceC25676a.hashCode())) * 31;
            InterfaceC25676a interfaceC25676a2 = this.secondaryClickEvent;
            return iHashCode2 + (interfaceC25676a2 != null ? interfaceC25676a2.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ d(C33211q0 c33211q0, InterfaceC25676a interfaceC25676a, InterfaceC25676a interfaceC25676a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC25676a, (i13 & 4) != 0 ? null : interfaceC25676a2);
        }
    }

    public /* synthetic */ C26816c(d dVar, c cVar, f fVar, a aVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : dVar, (i13 & 2) != 0 ? null : cVar, (i13 & 4) != 0 ? null : fVar, (i13 & 8) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: nl2.c$c */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJj\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b \u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b(\u0010'¨\u0006,"}, m65681d2 = {"Lnl2/c$c;", "", "Lcom/whoop/design/util/TextResource;", "title", "primaryActionText", "Ly81/e;", "primaryActionColor", "secondaryActionText", "description", "Lml2/a;", "approveEvent", "", "showCloseIcon", "secondaryAction", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lml2/a;ZLml2/a;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lml2/a;ZLml2/a;)Lnl2/c$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "Ly81/e;", "e", "()Ly81/e;", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lml2/a;", "()Lml2/a;", "g", "Z", "i", "()Z", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

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
        private final InterfaceC25676a approveEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean showCloseIcon;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final InterfaceC25676a secondaryAction;

        public c(TextResource title, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, TextResource description, InterfaceC25676a interfaceC25676a, boolean z4, InterfaceC25676a interfaceC25676a2) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            this.title = title;
            this.primaryActionText = textResource;
            this.primaryActionColor = interfaceC39332e;
            this.secondaryActionText = textResource2;
            this.description = description;
            this.approveEvent = interfaceC25676a;
            this.showCloseIcon = z4;
            this.secondaryAction = interfaceC25676a2;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m80017b(c cVar, TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, InterfaceC25676a interfaceC25676a, boolean z4, InterfaceC25676a interfaceC25676a2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = cVar.title;
            }
            if ((i13 & 2) != 0) {
                textResource2 = cVar.primaryActionText;
            }
            if ((i13 & 4) != 0) {
                interfaceC39332e = cVar.primaryActionColor;
            }
            if ((i13 & 8) != 0) {
                textResource3 = cVar.secondaryActionText;
            }
            if ((i13 & 16) != 0) {
                textResource4 = cVar.description;
            }
            if ((i13 & 32) != 0) {
                interfaceC25676a = cVar.approveEvent;
            }
            if ((i13 & 64) != 0) {
                z4 = cVar.showCloseIcon;
            }
            if ((i13 & 128) != 0) {
                interfaceC25676a2 = cVar.secondaryAction;
            }
            boolean z13 = z4;
            InterfaceC25676a interfaceC25676a3 = interfaceC25676a2;
            TextResource textResource5 = textResource4;
            InterfaceC25676a interfaceC25676a4 = interfaceC25676a;
            return cVar.m80018a(textResource, textResource2, interfaceC39332e, textResource3, textResource5, interfaceC25676a4, z13, interfaceC25676a3);
        }

        /* JADX INFO: renamed from: a */
        public final c m80018a(TextResource title, TextResource primaryActionText, InterfaceC39332e primaryActionColor, TextResource secondaryActionText, TextResource description, InterfaceC25676a approveEvent, boolean showCloseIcon, InterfaceC25676a secondaryAction) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            return new c(title, primaryActionText, primaryActionColor, secondaryActionText, description, approveEvent, showCloseIcon, secondaryAction);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC25676a getApproveEvent() {
            return this.approveEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC39332e getPrimaryActionColor() {
            return this.primaryActionColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.primaryActionText, cVar.primaryActionText) && AbstractC22676k.m65745e(this.primaryActionColor, cVar.primaryActionColor) && AbstractC22676k.m65745e(this.secondaryActionText, cVar.secondaryActionText) && AbstractC22676k.m65745e(this.description, cVar.description) && AbstractC22676k.m65745e(this.approveEvent, cVar.approveEvent) && this.showCloseIcon == cVar.showCloseIcon && AbstractC22676k.m65745e(this.secondaryAction, cVar.secondaryAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getPrimaryActionText() {
            return this.primaryActionText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final InterfaceC25676a getSecondaryAction() {
            return this.secondaryAction;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getSecondaryActionText() {
            return this.secondaryActionText;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            TextResource textResource = this.primaryActionText;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            int iHashCode3 = (iHashCode2 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
            TextResource textResource2 = this.secondaryActionText;
            int iM95625a = AbstractC31061c.m95625a((iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, this.description, 31);
            InterfaceC25676a interfaceC25676a = this.approveEvent;
            int iM8289b = AbstractC2875y.m8289b((iM95625a + (interfaceC25676a == null ? 0 : interfaceC25676a.hashCode())) * 31, 31, this.showCloseIcon);
            InterfaceC25676a interfaceC25676a2 = this.secondaryAction;
            return iM8289b + (interfaceC25676a2 != null ? interfaceC25676a2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.primaryActionText;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            TextResource textResource3 = this.secondaryActionText;
            TextResource textResource4 = this.description;
            InterfaceC25676a interfaceC25676a = this.approveEvent;
            boolean z4 = this.showCloseIcon;
            InterfaceC25676a interfaceC25676a2 = this.secondaryAction;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("DialogState(title=", textResource, ", primaryActionText=", textResource2, ", primaryActionColor=");
            AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", secondaryActionText=", textResource3, ", description=");
            sbM106658q.append(textResource4);
            sbM106658q.append(", approveEvent=");
            sbM106658q.append(interfaceC25676a);
            sbM106658q.append(", showCloseIcon=");
            sbM106658q.append(z4);
            sbM106658q.append(", secondaryAction=");
            sbM106658q.append(interfaceC25676a2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ c(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, InterfaceC25676a interfaceC25676a, boolean z4, InterfaceC25676a interfaceC25676a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : interfaceC39332e, (i13 & 8) != 0 ? null : textResource3, textResource4, (i13 & 32) != 0 ? null : interfaceC25676a, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? null : interfaceC25676a2);
        }
    }
}

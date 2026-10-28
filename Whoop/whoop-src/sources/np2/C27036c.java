package np2;

import b01.InterfaceC2189j;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.EnumC21213p;
import java.util.List;
import jh3.AbstractC21702c;
import kp2.InterfaceC22758a;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: np2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u001c\u001a \f*\u001eB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b \u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m65681d2 = {"Lnp2/c;", "Lfy1/k;", "Lnp2/c$f;", "popUpDialog", "Lnp2/c$c;", "fullScreenModal", "Lnp2/c$d;", "screenContent", "Lnp2/c$a;", "bottomSheet", "<init>", "(Lnp2/c$f;Lnp2/c$c;Lnp2/c$d;Lnp2/c$a;)V", "b", "(Lnp2/c$f;Lnp2/c$c;Lnp2/c$d;Lnp2/c$a;)Lnp2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnp2/c$f;", "f", "()Lnp2/c$f;", "c", "Lnp2/c$c;", "e", "()Lnp2/c$c;", "d", "Lnp2/c$d;", "g", "()Lnp2/c$d;", "Lnp2/c$a;", "()Lnp2/c$a;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27036c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final f popUpDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final c fullScreenModal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final d screenContent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final a bottomSheet;

    /* JADX INFO: renamed from: np2.c$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#¨\u0006$"}, m65681d2 = {"Lnp2/c$a;", "", "", "fieldType", "title", "", "Lnp2/c$e;", "options", "selectedValue", "searchQuery", "", "openTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "getSelectedValue", "e", "getSearchQuery", "f", "J", "()J", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fieldType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<e> options;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String selectedValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String searchQuery;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final long openTimestamp;

        public a(String fieldType, String title, List<e> options, String str, String searchQuery, long j7) {
            AbstractC22676k.m65750j(fieldType, "fieldType");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(options, "options");
            AbstractC22676k.m65750j(searchQuery, "searchQuery");
            this.fieldType = fieldType;
            this.title = title;
            this.options = options;
            this.selectedValue = str;
            this.searchQuery = searchQuery;
            this.openTimestamp = j7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFieldType() {
            return this.fieldType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getOpenTimestamp() {
            return this.openTimestamp;
        }

        /* JADX INFO: renamed from: c */
        public final List<e> m81122c() {
            return this.options;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.fieldType, aVar.fieldType) && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.options, aVar.options) && AbstractC22676k.m65745e(this.selectedValue, aVar.selectedValue) && AbstractC22676k.m65745e(this.searchQuery, aVar.searchQuery) && this.openTimestamp == aVar.openTimestamp;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.fieldType.hashCode() * 31, 31, this.title), 31, this.options);
            String str = this.selectedValue;
            return Long.hashCode(this.openTimestamp) + AbstractC11266d.m30450d((iM31983b + (str == null ? 0 : str.hashCode())) * 31, 31, this.searchQuery);
        }

        public String toString() {
            String str = this.fieldType;
            String str2 = this.title;
            List<e> list = this.options;
            String str3 = this.selectedValue;
            String str4 = this.searchQuery;
            long j7 = this.openTimestamp;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("BottomSheetState(fieldType=", str, ", title=", str2, ", options=");
            AbstractC17176i.m48511m(", selectedValue=", str3, ", searchQuery=", sbM32001t, list);
            sbM32001t.append(str4);
            sbM32001t.append(", openTimestamp=");
            sbM32001t.append(j7);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: np2.c$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lnp2/c$b;", "", "", "Lm91/u;", "itemViewState", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Lnp2/c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends InterfaceC25312u> itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            this.itemViewState = itemViewState;
        }

        /* JADX INFO: renamed from: a */
        public final b m81124a(List<? extends InterfaceC25312u> itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            return new b(itemViewState);
        }

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC25312u> m81125b() {
            return this.itemViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.itemViewState, ((b) other).itemViewState);
        }

        public int hashCode() {
            return this.itemViewState.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("ComponentItem(itemViewState=", ")", this.itemViewState);
        }
    }

    /* JADX INFO: renamed from: np2.c$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lnp2/c$e;", "Lb01/j;", "", "value", "text", "id", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getText", "c", "getId", "d", "Z", "()Z", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC2189j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isSelected;

        public e(String value, String text, String id4, boolean z4) {
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(text, "text");
            AbstractC22676k.m65750j(id4, "id");
            this.value = value;
            this.text = text;
            this.id = id4;
            this.isSelected = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.value, eVar.value) && AbstractC22676k.m65745e(this.text, eVar.text) && AbstractC22676k.m65745e(this.id, eVar.id) && this.isSelected == eVar.isSelected;
        }

        @Override // b01.InterfaceC2189j
        public String getId() {
            return this.id;
        }

        @Override // b01.InterfaceC2189j
        public String getText() {
            return this.text;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.value.hashCode() * 31, 31, this.text), 31, this.id);
        }

        public String toString() {
            String str = this.value;
            String str2 = this.text;
            return AbstractC21702c.m61137h(AbstractC11895b.m32001t("SelectionOption(value=", str, ", text=", str2, ", id="), this.id, ", isSelected=", this.isSelected, ")");
        }
    }

    public C27036c(f fVar, c cVar, d dVar, a aVar) {
        this.popUpDialog = fVar;
        this.fullScreenModal = cVar;
        this.screenContent = dVar;
        this.bottomSheet = aVar;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C27036c m81114c(C27036c c27036c, f fVar, c cVar, d dVar, a aVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            fVar = c27036c.popUpDialog;
        }
        if ((i13 & 2) != 0) {
            cVar = c27036c.fullScreenModal;
        }
        if ((i13 & 4) != 0) {
            dVar = c27036c.screenContent;
        }
        if ((i13 & 8) != 0) {
            aVar = c27036c.bottomSheet;
        }
        return c27036c.m81115b(fVar, cVar, dVar, aVar);
    }

    /* JADX INFO: renamed from: b */
    public final C27036c m81115b(f popUpDialog, c fullScreenModal, d screenContent, a bottomSheet) {
        return new C27036c(popUpDialog, fullScreenModal, screenContent, bottomSheet);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getFullScreenModal() {
        return this.fullScreenModal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27036c)) {
            return false;
        }
        C27036c c27036c = (C27036c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c27036c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c27036c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c27036c.screenContent) && AbstractC22676k.m65745e(this.bottomSheet, c27036c.bottomSheet);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getScreenContent() {
        return this.screenContent;
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        c cVar = this.fullScreenModal;
        if (cVar == null) {
            return this.screenContent != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
        }
        AbstractC33208p0 type = cVar.getState().getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
    }

    public int hashCode() {
        f fVar = this.popUpDialog;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        c cVar = this.fullScreenModal;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.screenContent;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.bottomSheet;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ShippingAddressViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ", bottomSheet=" + this.bottomSheet + ")";
    }

    /* JADX INFO: renamed from: np2.c$d */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\"\u0010\u001e¨\u0006#"}, m65681d2 = {"Lnp2/c$d;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "", "Lnp2/c$b;", "items", "", "displayRefreshingAnimation", "Lm91/u;", "stickyArea", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLjava/util/List;)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLjava/util/List;)Lnp2/c$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Z", "()Z", "e", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<b> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<InterfaceC25312u> stickyArea;

        /* JADX WARN: Multi-variable type inference failed */
        public d(TextResource toolbarTitle, List<b> items, boolean z4, List<? extends InterfaceC25312u> stickyArea) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(stickyArea, "stickyArea");
            this.toolbarTitle = toolbarTitle;
            this.items = items;
            this.displayRefreshingAnimation = z4;
            this.stickyArea = stickyArea;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ d m81132b(d dVar, TextResource textResource, List list, boolean z4, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = dVar.toolbarTitle;
            }
            if ((i13 & 2) != 0) {
                list = dVar.items;
            }
            if ((i13 & 4) != 0) {
                z4 = dVar.displayRefreshingAnimation;
            }
            if ((i13 & 8) != 0) {
                list2 = dVar.stickyArea;
            }
            return dVar.m81133a(textResource, list, z4, list2);
        }

        /* JADX INFO: renamed from: a */
        public final d m81133a(TextResource toolbarTitle, List<b> items, boolean displayRefreshingAnimation, List<? extends InterfaceC25312u> stickyArea) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(stickyArea, "stickyArea");
            return new d(toolbarTitle, items, displayRefreshingAnimation, stickyArea);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: d */
        public final List<b> m81135d() {
            return this.items;
        }

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC25312u> m81136e() {
            return this.stickyArea;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.toolbarTitle, dVar.toolbarTitle) && AbstractC22676k.m65745e(this.items, dVar.items) && this.displayRefreshingAnimation == dVar.displayRefreshingAnimation && AbstractC22676k.m65745e(this.stickyArea, dVar.stickyArea);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public int hashCode() {
            return this.stickyArea.hashCode() + AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.toolbarTitle.hashCode() * 31, 31, this.items), 31, this.displayRefreshingAnimation);
        }

        public String toString() {
            TextResource textResource = this.toolbarTitle;
            List<b> list = this.items;
            boolean z4 = this.displayRefreshingAnimation;
            List<InterfaceC25312u> list2 = this.stickyArea;
            StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ScreenContent(toolbarTitle=", ", items=", ", displayRefreshingAnimation=", list);
            sbM106657p.append(z4);
            sbM106657p.append(", stickyArea=");
            sbM106657p.append(list2);
            sbM106657p.append(")");
            return sbM106657p.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ d(TextResource textResource, List list, boolean z4, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            int i14 = i13 & 2;
            C25271y c25271y = C25271y.f99162w;
            this(textResource, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? c25271y : list2);
        }
    }

    public /* synthetic */ C27036c(f fVar, c cVar, d dVar, a aVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : fVar, (i13 & 2) != 0 ? null : cVar, (i13 & 4) != 0 ? null : dVar, (i13 & 8) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: np2.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, m65681d2 = {"Lnp2/c$c;", "", "Lsz0/q0;", "state", "Lnp2/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "", "isFormSubmissionLoading", "isCustomSubmissionError", "<init>", "(Lsz0/q0;Lnp2/a;Lnp2/a;Lnp2/a;Ljava/lang/Boolean;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lnp2/a;", "()Lnp2/a;", "c", "e", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "Z", "()Z", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: g */
        public static final int f107917g = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC27034a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC27034a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC27034a backClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Boolean isFormSubmissionLoading;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isCustomSubmissionError;

        public c(C33211q0 state, InterfaceC27034a interfaceC27034a, InterfaceC27034a interfaceC27034a2, InterfaceC27034a interfaceC27034a3, Boolean bool, boolean z4) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC27034a;
            this.secondaryClickEvent = interfaceC27034a2;
            this.backClickEvent = interfaceC27034a3;
            this.isFormSubmissionLoading = bool;
            this.isCustomSubmissionError = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC27034a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC27034a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC27034a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsCustomSubmissionError() {
            return this.isCustomSubmissionError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.state, cVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, cVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, cVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, cVar.backClickEvent) && AbstractC22676k.m65745e(this.isFormSubmissionLoading, cVar.isFormSubmissionLoading) && this.isCustomSubmissionError == cVar.isCustomSubmissionError;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Boolean getIsFormSubmissionLoading() {
            return this.isFormSubmissionLoading;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC27034a interfaceC27034a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC27034a == null ? 0 : interfaceC27034a.hashCode())) * 31;
            InterfaceC27034a interfaceC27034a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC27034a2 == null ? 0 : interfaceC27034a2.hashCode())) * 31;
            InterfaceC27034a interfaceC27034a3 = this.backClickEvent;
            int iHashCode4 = (iHashCode3 + (interfaceC27034a3 == null ? 0 : interfaceC27034a3.hashCode())) * 31;
            Boolean bool = this.isFormSubmissionLoading;
            return Boolean.hashCode(this.isCustomSubmissionError) + ((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ", isFormSubmissionLoading=" + this.isFormSubmissionLoading + ", isCustomSubmissionError=" + this.isCustomSubmissionError + ")";
        }

        public /* synthetic */ c(C33211q0 c33211q0, InterfaceC27034a interfaceC27034a, InterfaceC27034a interfaceC27034a2, InterfaceC27034a interfaceC27034a3, Boolean bool, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC27034a, (i13 & 4) != 0 ? null : interfaceC27034a2, (i13 & 8) != 0 ? null : interfaceC27034a3, (i13 & 16) != 0 ? null : bool, (i13 & 32) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: np2.c$f */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b \u00101\u001a\u0004\b$\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b\u001e\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b(\u00104¨\u00065"}, m65681d2 = {"Lnp2/c$f;", "", "Lcom/whoop/design/util/TextResource;", "title", "primaryActionText", "Ly81/e;", "primaryActionColor", "secondaryActionText", "description", "", "showCloseIcon", "useSolidButtons", "Lj11/p;", "topDialogStyle", "Lkp2/a;", "dialogType", "Lnp2/a;", "approveEvent", "dismissEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lkp2/a;Lnp2/a;Lnp2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "Ly81/e;", "e", "()Ly81/e;", "d", "g", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "k", "Lj11/p;", "j", "()Lj11/p;", "Lkp2/a;", "()Lkp2/a;", "Lnp2/a;", "()Lnp2/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f {

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
        private final boolean showCloseIcon;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean useSolidButtons;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final EnumC21213p topDialogStyle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final InterfaceC22758a dialogType;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final InterfaceC27034a approveEvent;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final InterfaceC27034a dismissEvent;

        public f(TextResource title, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, TextResource description, boolean z4, boolean z13, EnumC21213p topDialogStyle, InterfaceC22758a interfaceC22758a, InterfaceC27034a interfaceC27034a, InterfaceC27034a interfaceC27034a2) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(topDialogStyle, "topDialogStyle");
            this.title = title;
            this.primaryActionText = textResource;
            this.primaryActionColor = interfaceC39332e;
            this.secondaryActionText = textResource2;
            this.description = description;
            this.showCloseIcon = z4;
            this.useSolidButtons = z13;
            this.topDialogStyle = topDialogStyle;
            this.dialogType = interfaceC22758a;
            this.approveEvent = interfaceC27034a;
            this.dismissEvent = interfaceC27034a2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC27034a getApproveEvent() {
            return this.approveEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC22758a getDialogType() {
            return this.dialogType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC27034a getDismissEvent() {
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
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.title, fVar.title) && AbstractC22676k.m65745e(this.primaryActionText, fVar.primaryActionText) && AbstractC22676k.m65745e(this.primaryActionColor, fVar.primaryActionColor) && AbstractC22676k.m65745e(this.secondaryActionText, fVar.secondaryActionText) && AbstractC22676k.m65745e(this.description, fVar.description) && this.showCloseIcon == fVar.showCloseIcon && this.useSolidButtons == fVar.useSolidButtons && this.topDialogStyle == fVar.topDialogStyle && AbstractC22676k.m65745e(this.dialogType, fVar.dialogType) && AbstractC22676k.m65745e(this.approveEvent, fVar.approveEvent) && AbstractC22676k.m65745e(this.dismissEvent, fVar.dismissEvent);
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
            int iM106647f = AbstractC33745d.m106647f(this.topDialogStyle, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a((iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, this.description, 31), 31, this.showCloseIcon), 31, this.useSolidButtons), 31);
            InterfaceC22758a interfaceC22758a = this.dialogType;
            int iHashCode4 = (iM106647f + (interfaceC22758a == null ? 0 : interfaceC22758a.hashCode())) * 31;
            InterfaceC27034a interfaceC27034a = this.approveEvent;
            int iHashCode5 = (iHashCode4 + (interfaceC27034a == null ? 0 : interfaceC27034a.hashCode())) * 31;
            InterfaceC27034a interfaceC27034a2 = this.dismissEvent;
            return iHashCode5 + (interfaceC27034a2 != null ? interfaceC27034a2.hashCode() : 0);
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
            boolean z4 = this.showCloseIcon;
            boolean z13 = this.useSolidButtons;
            EnumC21213p enumC21213p = this.topDialogStyle;
            InterfaceC22758a interfaceC22758a = this.dialogType;
            InterfaceC27034a interfaceC27034a = this.approveEvent;
            InterfaceC27034a interfaceC27034a2 = this.dismissEvent;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("ShippingAddressDialogState(title=", textResource, ", primaryActionText=", textResource2, ", primaryActionColor=");
            AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", secondaryActionText=", textResource3, ", description=");
            AbstractC33745d.m106664w(textResource4, ", showCloseIcon=", ", useSolidButtons=", sbM106658q, z4);
            AbstractC33745d.m106666y(sbM106658q, z13, ", topDialogStyle=", enumC21213p, ", dialogType=");
            sbM106658q.append(interfaceC22758a);
            sbM106658q.append(", approveEvent=");
            sbM106658q.append(interfaceC27034a);
            sbM106658q.append(", dismissEvent=");
            sbM106658q.append(interfaceC27034a2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ f(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, boolean z4, boolean z13, EnumC21213p enumC21213p, InterfaceC22758a interfaceC22758a, InterfaceC27034a interfaceC27034a, InterfaceC27034a interfaceC27034a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : interfaceC39332e, (i13 & 8) != 0 ? null : textResource3, textResource4, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? EnumC21213p.DEFAULT : enumC21213p, (i13 & 256) != 0 ? null : interfaceC22758a, (i13 & 512) != 0 ? null : interfaceC27034a, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : interfaceC27034a2);
        }
    }
}

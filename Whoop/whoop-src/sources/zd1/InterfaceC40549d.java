package zd1;

import androidx.profileinstaller.ProfileVerifier;
import c41.C4092p2;
import com.mapbox.common.MapboxServices;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import n82.C26457c;
import n82.EnumC26455a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p294l3.C23254g;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import sp0.C32864d;
import sp0.C32870j;
import sp0.EnumC32861a;
import sp0.EnumC32862b;
import te0.AbstractC33745d;
import tp0.EnumC34058c;
import wb3.AbstractC37056f;
import y71.AbstractC39279l;
import y71.C39282o;
import z90.AbstractC40203a;

/* JADX INFO: renamed from: zd1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lzd1/d;", "", "a", "f", "e", "d", "b", "c", "Lzd1/d$a;", "Lzd1/d$b;", "Lzd1/d$c;", "Lzd1/d$d;", "Lzd1/d$e;", "Lzd1/d$f;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC40549d {

    /* JADX INFO: renamed from: zd1.d$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Lzd1/d$b;", "Lzd1/d;", "Lcom/whoop/design/util/TextResource;", "dialogTitle", "Ll3/g;", "description", "primaryButtonText", "secondaryButtonText", "<init>", "(Lcom/whoop/design/util/TextResource;Ll3/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ll3/g;", "()Ll3/g;", "c", "d", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC40549d {

        /* JADX INFO: renamed from: e */
        public static final int f174572e = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource dialogTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C23254g description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        public b(TextResource dialogTitle, C23254g description, TextResource primaryButtonText, TextResource secondaryButtonText) {
            AbstractC22676k.m65750j(dialogTitle, "dialogTitle");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.dialogTitle = dialogTitle;
            this.description = description;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = secondaryButtonText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C23254g getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDialogTitle() {
            return this.dialogTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.dialogTitle, bVar.dialogTitle) && AbstractC22676k.m65745e(this.description, bVar.description) && AbstractC22676k.m65745e(this.primaryButtonText, bVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, bVar.secondaryButtonText);
        }

        public int hashCode() {
            return this.secondaryButtonText.hashCode() + AbstractC31061c.m95625a((this.description.hashCode() + (this.dialogTitle.hashCode() * 31)) * 31, this.primaryButtonText, 31);
        }

        public String toString() {
            TextResource textResource = this.dialogTitle;
            C23254g c23254g = this.description;
            TextResource textResource2 = this.primaryButtonText;
            TextResource textResource3 = this.secondaryButtonText;
            StringBuilder sb4 = new StringBuilder("ConfirmOverlapDialogView(dialogTitle=");
            sb4.append(textResource);
            sb4.append(", description=");
            sb4.append((Object) c23254g);
            sb4.append(", primaryButtonText=");
            return AbstractC33745d.m106655n(sb4, textResource2, ", secondaryButtonText=", textResource3, ")");
        }
    }

    /* JADX INFO: renamed from: zd1.d$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lzd1/d$d;", "Lzd1/d;", "Lcom/whoop/design/util/TextResource;", "dialogTitle", "Ll3/g;", "description", "primaryButtonText", "<init>", "(Lcom/whoop/design/util/TextResource;Ll3/g;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ll3/g;", "()Ll3/g;", "c", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC40549d {

        /* JADX INFO: renamed from: d */
        public static final int f174584d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource dialogTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C23254g description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        public d(TextResource dialogTitle, C23254g description, TextResource primaryButtonText) {
            AbstractC22676k.m65750j(dialogTitle, "dialogTitle");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            this.dialogTitle = dialogTitle;
            this.description = description;
            this.primaryButtonText = primaryButtonText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C23254g getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDialogTitle() {
            return this.dialogTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.dialogTitle, dVar.dialogTitle) && AbstractC22676k.m65745e(this.description, dVar.description) && AbstractC22676k.m65745e(this.primaryButtonText, dVar.primaryButtonText);
        }

        public int hashCode() {
            return this.primaryButtonText.hashCode() + ((this.description.hashCode() + (this.dialogTitle.hashCode() * 31)) * 31);
        }

        public String toString() {
            TextResource textResource = this.dialogTitle;
            C23254g c23254g = this.description;
            TextResource textResource2 = this.primaryButtonText;
            StringBuilder sb4 = new StringBuilder("DialogView(dialogTitle=");
            sb4.append(textResource);
            sb4.append(", description=");
            sb4.append((Object) c23254g);
            sb4.append(", primaryButtonText=");
            return AbstractC30007c.m91841k(sb4, textResource2, ")");
        }
    }

    /* JADX INFO: renamed from: zd1.d$c */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, m65681d2 = {"Lzd1/d$c;", "Lzd1/d;", "Lcom/whoop/design/util/TextResource;", "title", "description", "primaryButtonText", "secondaryButtonText", "Lzd1/b;", "onApprove", "onDismiss", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lzd1/b;Lzd1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "e", "Lzd1/b;", "()Lzd1/b;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC40549d {

        /* JADX INFO: renamed from: g */
        public static final int f174577g = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC40547b onApprove;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC40547b onDismiss;

        public c(TextResource title, TextResource textResource, TextResource primaryButtonText, TextResource textResource2, InterfaceC40547b onApprove, InterfaceC40547b interfaceC40547b) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(onApprove, "onApprove");
            this.title = title;
            this.description = textResource;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = textResource2;
            this.onApprove = onApprove;
            this.onDismiss = interfaceC40547b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC40547b getOnApprove() {
            return this.onApprove;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC40547b getOnDismiss() {
            return this.onDismiss;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.description, cVar.description) && AbstractC22676k.m65745e(this.primaryButtonText, cVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, cVar.secondaryButtonText) && AbstractC22676k.m65745e(this.onApprove, cVar.onApprove) && AbstractC22676k.m65745e(this.onDismiss, cVar.onDismiss);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            TextResource textResource = this.description;
            int iM95625a = AbstractC31061c.m95625a((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, this.primaryButtonText, 31);
            TextResource textResource2 = this.secondaryButtonText;
            int iHashCode2 = (this.onApprove.hashCode() + ((iM95625a + (textResource2 == null ? 0 : textResource2.hashCode())) * 31)) * 31;
            InterfaceC40547b interfaceC40547b = this.onDismiss;
            return iHashCode2 + (interfaceC40547b != null ? interfaceC40547b.hashCode() : 0);
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.description;
            TextResource textResource3 = this.primaryButtonText;
            TextResource textResource4 = this.secondaryButtonText;
            InterfaceC40547b interfaceC40547b = this.onApprove;
            InterfaceC40547b interfaceC40547b2 = this.onDismiss;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("DialogState(title=", textResource, ", description=", textResource2, ", primaryButtonText=");
            AbstractC30007c.m91855y(sbM106658q, textResource3, ", secondaryButtonText=", textResource4, ", onApprove=");
            sbM106658q.append(interfaceC40547b);
            sbM106658q.append(", onDismiss=");
            sbM106658q.append(interfaceC40547b2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ c(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC40547b interfaceC40547b, InterfaceC40547b interfaceC40547b2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, textResource2, textResource3, (i13 & 8) != 0 ? null : textResource4, interfaceC40547b, (i13 & 32) != 0 ? null : interfaceC40547b2);
        }
    }

    /* JADX INFO: renamed from: zd1.d$e */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0001\u001cB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJh\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b.\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, m65681d2 = {"Lzd1/d$e;", "Lzd1/d;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Lzd1/b;", "primaryButtonClickEvent", "secondaryButtonText", "secondaryButtonClickEvent", "followUpEvent", "", "backToHomeScreen", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lzd1/b;Lcom/whoop/design/util/TextResource;Lzd1/b;Lzd1/b;Ljava/lang/Boolean;)V", "g", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lzd1/b;Lcom/whoop/design/util/TextResource;Lzd1/b;Lzd1/b;Ljava/lang/Boolean;)Lzd1/d$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "p", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "c", "l", "d", "Lzd1/b;", "k", "()Lzd1/b;", "e", "n", "f", "m", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC40549d {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: j */
        public static final int f174589j = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: k */
        private static final e f174590k = new e(AbstractC33208p0.c.f138471e, null, null, null, null, null, null, null, 254, null);

        /* JADX INFO: renamed from: l */
        private static final e f174591l;

        /* JADX INFO: renamed from: m */
        private static final e f174592m;

        /* JADX INFO: renamed from: n */
        private static final e f174593n;

        /* JADX INFO: renamed from: o */
        private static final e f174594o;

        /* JADX INFO: renamed from: p */
        private static final e f174595p;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC40547b primaryButtonClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC40547b secondaryButtonClickEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC40547b followUpEvent;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Boolean backToHomeScreen;

        /* JADX INFO: renamed from: zd1.d$e$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lzd1/d$e$a;", "", "<init>", "()V", "Lzd1/d$e;", "loading", "Lzd1/d$e;", "b", "()Lzd1/d$e;", "networkError", "c", "httpError", "a", "saving", "f", "saved", "d", "savedOverlapActivity", "e", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final e m131501a() {
                return e.f174592m;
            }

            /* JADX INFO: renamed from: b */
            public final e m131502b() {
                return e.f174590k;
            }

            /* JADX INFO: renamed from: c */
            public final e m131503c() {
                return e.f174591l;
            }

            /* JADX INFO: renamed from: d */
            public final e m131504d() {
                return e.f174594o;
            }

            /* JADX INFO: renamed from: e */
            public final e m131505e() {
                return e.f174595p;
            }

            /* JADX INFO: renamed from: f */
            public final e m131506f() {
                return e.f174593n;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            f174591l = new e(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC40203a.f173569z), false, objArr, 6, 0 == true ? 1 : 0), null, AbstractC8693b.m21277k(AbstractC40203a.f173546c), objArr2, AbstractC8693b.m21277k(AbstractC40203a.f173544a), objArr3, objArr4, null, 234, null);
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            f174592m = new e(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC40203a.f173565v), false, null, 6, 0 == true ? 1 : 0), null, AbstractC8693b.m21277k(AbstractC40203a.f173546c), objArr7, AbstractC8693b.m21277k(AbstractC40203a.f173544a), objArr5, objArr6, null, 234, null);
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            f174593n = new e(AbstractC33208p0.f.f138478e, null, 0 == true ? 1 : 0, null, objArr8, objArr9, 0 == true ? 1 : 0, null, 254, null);
            Object[] objArr10 = 0 == true ? 1 : 0;
            AbstractC33208p0.h hVar = new AbstractC33208p0.h(0 == true ? 1 : 0, 0L, objArr10, 7, 0 == true ? 1 : 0);
            Boolean bool = Boolean.TRUE;
            InterfaceC40547b interfaceC40547b = null;
            Object[] objArr11 = 0 == true ? 1 : 0;
            f174594o = new e(hVar, 0 == true ? 1 : 0, null, null, objArr11, interfaceC40547b, 0 == true ? 1 : 0, bool, 126, null);
            Object[] objArr12 = 0 == true ? 1 : 0;
            Object[] objArr13 = 0 == true ? 1 : 0;
            f174595p = new e(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21277k(AbstractC40203a.f173531D), objArr12, interfaceC40547b, objArr13, null, null, bool, 124, null);
        }

        public e(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC40547b interfaceC40547b, TextResource secondaryButtonText, InterfaceC40547b interfaceC40547b2, InterfaceC40547b interfaceC40547b3, Boolean bool) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.primaryButtonClickEvent = interfaceC40547b;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryButtonClickEvent = interfaceC40547b2;
            this.followUpEvent = interfaceC40547b3;
            this.backToHomeScreen = bool;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ e m131491h(e eVar, AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC40547b interfaceC40547b, TextResource textResource3, InterfaceC40547b interfaceC40547b2, InterfaceC40547b interfaceC40547b3, Boolean bool, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC33208p0 = eVar.type;
            }
            if ((i13 & 2) != 0) {
                textResource = eVar.supportText;
            }
            if ((i13 & 4) != 0) {
                textResource2 = eVar.primaryButtonText;
            }
            if ((i13 & 8) != 0) {
                interfaceC40547b = eVar.primaryButtonClickEvent;
            }
            if ((i13 & 16) != 0) {
                textResource3 = eVar.secondaryButtonText;
            }
            if ((i13 & 32) != 0) {
                interfaceC40547b2 = eVar.secondaryButtonClickEvent;
            }
            if ((i13 & 64) != 0) {
                interfaceC40547b3 = eVar.followUpEvent;
            }
            if ((i13 & 128) != 0) {
                bool = eVar.backToHomeScreen;
            }
            InterfaceC40547b interfaceC40547b4 = interfaceC40547b3;
            Boolean bool2 = bool;
            TextResource textResource4 = textResource3;
            InterfaceC40547b interfaceC40547b5 = interfaceC40547b2;
            return eVar.m131492g(abstractC33208p0, textResource, textResource2, interfaceC40547b, textResource4, interfaceC40547b5, interfaceC40547b4, bool2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.type, eVar.type) && AbstractC22676k.m65745e(this.supportText, eVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, eVar.primaryButtonText) && AbstractC22676k.m65745e(this.primaryButtonClickEvent, eVar.primaryButtonClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, eVar.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonClickEvent, eVar.secondaryButtonClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, eVar.followUpEvent) && AbstractC22676k.m65745e(this.backToHomeScreen, eVar.backToHomeScreen);
        }

        /* JADX INFO: renamed from: g */
        public final e m131492g(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC40547b primaryButtonClickEvent, TextResource secondaryButtonText, InterfaceC40547b secondaryButtonClickEvent, InterfaceC40547b followUpEvent, Boolean backToHomeScreen) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            return new e(type, supportText, primaryButtonText, primaryButtonClickEvent, secondaryButtonText, secondaryButtonClickEvent, followUpEvent, backToHomeScreen);
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC40547b interfaceC40547b = this.primaryButtonClickEvent;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC40547b == null ? 0 : interfaceC40547b.hashCode())) * 31, this.secondaryButtonText, 31);
            InterfaceC40547b interfaceC40547b2 = this.secondaryButtonClickEvent;
            int iHashCode = (iM95625a2 + (interfaceC40547b2 == null ? 0 : interfaceC40547b2.hashCode())) * 31;
            InterfaceC40547b interfaceC40547b3 = this.followUpEvent;
            int iHashCode2 = (iHashCode + (interfaceC40547b3 == null ? 0 : interfaceC40547b3.hashCode())) * 31;
            Boolean bool = this.backToHomeScreen;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Boolean getBackToHomeScreen() {
            return this.backToHomeScreen;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final InterfaceC40547b getFollowUpEvent() {
            return this.followUpEvent;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final InterfaceC40547b getPrimaryButtonClickEvent() {
            return this.primaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final InterfaceC40547b getSecondaryButtonClickEvent() {
            return this.secondaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC40547b interfaceC40547b = this.primaryButtonClickEvent;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC40547b interfaceC40547b2 = this.secondaryButtonClickEvent;
            InterfaceC40547b interfaceC40547b3 = this.followUpEvent;
            Boolean bool = this.backToHomeScreen;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", primaryButtonClickEvent=");
            sbM30862n.append(interfaceC40547b);
            sbM30862n.append(", secondaryButtonText=");
            sbM30862n.append(textResource3);
            sbM30862n.append(", secondaryButtonClickEvent=");
            sbM30862n.append(interfaceC40547b2);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC40547b3);
            sbM30862n.append(", backToHomeScreen=");
            sbM30862n.append(bool);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ e(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC40547b interfaceC40547b, TextResource textResource3, InterfaceC40547b interfaceC40547b2, InterfaceC40547b interfaceC40547b3, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC40547b, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC40547b2, (i13 & 64) == 0 ? interfaceC40547b3 : null, (i13 & 128) != 0 ? Boolean.FALSE : bool);
        }
    }

    /* JADX INFO: renamed from: zd1.d$f */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b7\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, m65681d2 = {"Lzd1/d$f;", "Lzd1/d;", "Lcom/whoop/design/util/TextResource;", "selectActivityTitleDisplay", "Lsp0/b;", "bottomSheetStateValue", "", MapboxServices.SEARCH, "", "Ly71/o;", "mostRecentList", "allList", "Ln82/a;", "activityScreenTypes", "pageType", "genericActivityText", "", "prefetch", "crossScoreTypeSearchEnabled", "<init>", "(Lcom/whoop/design/util/TextResource;Lsp0/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;Z)V", "Ln82/c;", "b", "()Ln82/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Lsp0/b;", "getBottomSheetStateValue", "()Lsp0/b;", "c", "Ljava/lang/String;", "getSearch", "d", "Ljava/util/List;", "getMostRecentList", "()Ljava/util/List;", "e", "getAllList", "f", "getActivityScreenTypes", "g", "Ln82/a;", "getPageType", "()Ln82/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getGenericActivityText", "i", "Ljava/lang/Boolean;", "getPrefetch", "()Ljava/lang/Boolean;", "j", "Z", "getCrossScoreTypeSearchEnabled", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC40549d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource selectActivityTitleDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC32862b bottomSheetStateValue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String search;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C39282o> mostRecentList;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C39282o> allList;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<EnumC26455a> activityScreenTypes;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final EnumC26455a pageType;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource genericActivityText;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Boolean prefetch;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean crossScoreTypeSearchEnabled;

        /* JADX WARN: Multi-variable type inference failed */
        public f(TextResource selectActivityTitleDisplay, EnumC32862b bottomSheetStateValue, String search, List<C39282o> mostRecentList, List<C39282o> allList, List<? extends EnumC26455a> activityScreenTypes, EnumC26455a pageType, TextResource textResource, Boolean bool, boolean z4) {
            AbstractC22676k.m65750j(selectActivityTitleDisplay, "selectActivityTitleDisplay");
            AbstractC22676k.m65750j(bottomSheetStateValue, "bottomSheetStateValue");
            AbstractC22676k.m65750j(search, "search");
            AbstractC22676k.m65750j(mostRecentList, "mostRecentList");
            AbstractC22676k.m65750j(allList, "allList");
            AbstractC22676k.m65750j(activityScreenTypes, "activityScreenTypes");
            AbstractC22676k.m65750j(pageType, "pageType");
            this.selectActivityTitleDisplay = selectActivityTitleDisplay;
            this.bottomSheetStateValue = bottomSheetStateValue;
            this.search = search;
            this.mostRecentList = mostRecentList;
            this.allList = allList;
            this.activityScreenTypes = activityScreenTypes;
            this.pageType = pageType;
            this.genericActivityText = textResource;
            this.prefetch = bool;
            this.crossScoreTypeSearchEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getSelectActivityTitleDisplay() {
            return this.selectActivityTitleDisplay;
        }

        /* JADX INFO: renamed from: b */
        public final C26457c m131508b() {
            return new C26457c(this.selectActivityTitleDisplay, this.search, this.mostRecentList, this.allList, null, this.activityScreenTypes, this.pageType, this.genericActivityText, this.prefetch, this.crossScoreTypeSearchEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.selectActivityTitleDisplay, fVar.selectActivityTitleDisplay) && this.bottomSheetStateValue == fVar.bottomSheetStateValue && AbstractC22676k.m65745e(this.search, fVar.search) && AbstractC22676k.m65745e(this.mostRecentList, fVar.mostRecentList) && AbstractC22676k.m65745e(this.allList, fVar.allList) && AbstractC22676k.m65745e(this.activityScreenTypes, fVar.activityScreenTypes) && this.pageType == fVar.pageType && AbstractC22676k.m65745e(this.genericActivityText, fVar.genericActivityText) && AbstractC22676k.m65745e(this.prefetch, fVar.prefetch) && this.crossScoreTypeSearchEnabled == fVar.crossScoreTypeSearchEnabled;
        }

        public int hashCode() {
            int iHashCode = (this.pageType.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d((this.bottomSheetStateValue.hashCode() + (this.selectActivityTitleDisplay.hashCode() * 31)) * 31, 31, this.search), 31, this.mostRecentList), 31, this.allList), 31, this.activityScreenTypes)) * 31;
            TextResource textResource = this.genericActivityText;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            Boolean bool = this.prefetch;
            return Boolean.hashCode(this.crossScoreTypeSearchEnabled) + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        public String toString() {
            TextResource textResource = this.selectActivityTitleDisplay;
            EnumC32862b enumC32862b = this.bottomSheetStateValue;
            String str = this.search;
            List<C39282o> list = this.mostRecentList;
            List<C39282o> list2 = this.allList;
            List<EnumC26455a> list3 = this.activityScreenTypes;
            EnumC26455a enumC26455a = this.pageType;
            TextResource textResource2 = this.genericActivityText;
            Boolean bool = this.prefetch;
            boolean z4 = this.crossScoreTypeSearchEnabled;
            StringBuilder sb4 = new StringBuilder("SelectActivity(selectActivityTitleDisplay=");
            sb4.append(textResource);
            sb4.append(", bottomSheetStateValue=");
            sb4.append(enumC32862b);
            sb4.append(", search=");
            AbstractC36095b.m114694v(str, ", mostRecentList=", ", allList=", sb4, list);
            AbstractC21702c.m61148s(sb4, list2, ", activityScreenTypes=", list3, ", pageType=");
            sb4.append(enumC26455a);
            sb4.append(", genericActivityText=");
            sb4.append(textResource2);
            sb4.append(", prefetch=");
            sb4.append(bool);
            sb4.append(", crossScoreTypeSearchEnabled=");
            sb4.append(z4);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ f(TextResource textResource, EnumC32862b enumC32862b, String str, List list, List list2, List list3, EnumC26455a enumC26455a, TextResource textResource2, Boolean bool, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            textResource = (i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource;
            enumC32862b = (i13 & 2) != 0 ? EnumC32862b.COLLAPSED : enumC32862b;
            str = (i13 & 4) != 0 ? "" : str;
            int i14 = i13 & 8;
            C25271y c25271y = C25271y.f99162w;
            this(textResource, enumC32862b, str, i14 != 0 ? c25271y : list, (i13 & 16) != 0 ? c25271y : list2, (i13 & 32) != 0 ? AbstractC37056f.m118959K(EnumC26455a.ALL, EnumC26455a.STRAIN, EnumC26455a.RECOVERY, EnumC26455a.SLEEP) : list3, (i13 & 64) != 0 ? EnumC26455a.ALL : enumC26455a, (i13 & 128) != 0 ? null : textResource2, (i13 & 256) != 0 ? Boolean.TRUE : bool, (i13 & 512) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: zd1.d$a */
    @Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00104\u001a\u0004\b5\u00106R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010-R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010;\u001a\u0004\b7\u0010<R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b0\u0010?R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u0010A\u001a\u0004\b=\u0010CR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b.\u0010IR\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\bG\u00106R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\b*\u0010-R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bB\u0010K\u001a\u0004\b@\u0010LR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bJ\u0010OR\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\bM\u00106R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u0010+\u001a\u0004\b9\u0010-¨\u0006Q"}, m65681d2 = {"Lzd1/d$a;", "Lzd1/d;", "Lcom/whoop/design/util/TextResource;", "editActivityTitleDisplay", "callToActionDisplay", "Ly71/o;", "selectedActivityMenuItemState", "", "isSelectedActivityVisible", "locationDividerTitleDisplay", "locationPromptDisplay", "Lsp0/j;", "currentStrapLocation", "", "allowedStrapLocations", "Lsp0/d;", "startTimePickerState", "endTimePickerState", "Lsp0/b;", "bottomSheetStateValue", "Lsp0/a;", "activityType", "primaryButtonEnabled", "activityLabel", "Lc41/p2;", "infoCalloutState", "Ltp0/c;", "selectedScreenSection", "isPrimaryButtonV2", "deleteActivityText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/o;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsp0/j;Ljava/util/List;Lsp0/d;Lsp0/d;Lsp0/b;Lsp0/a;ZLcom/whoop/design/util/TextResource;Lc41/p2;Ltp0/c;ZLcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ly71/o;", "m", "()Ly71/o;", "Z", "q", "()Z", "e", "j", "f", "k", "Lsp0/j;", "()Lsp0/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "i", "Lsp0/d;", "o", "()Lsp0/d;", "Lsp0/b;", "getBottomSheetStateValue", "()Lsp0/b;", "l", "Lsp0/a;", "()Lsp0/a;", "n", "Lc41/p2;", "()Lc41/p2;", "p", "Ltp0/c;", "()Ltp0/c;", "r", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC40549d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource editActivityTitleDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource callToActionDisplay;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39282o selectedActivityMenuItemState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isSelectedActivityVisible;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource locationDividerTitleDisplay;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource locationPromptDisplay;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C32870j currentStrapLocation;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C32870j> allowedStrapLocations;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C32864d startTimePickerState;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C32864d endTimePickerState;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final EnumC32862b bottomSheetStateValue;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final EnumC32861a activityType;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final boolean primaryButtonEnabled;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final TextResource activityLabel;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final C4092p2 infoCalloutState;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final EnumC34058c selectedScreenSection;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final boolean isPrimaryButtonV2;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final TextResource deleteActivityText;

        public a(TextResource editActivityTitleDisplay, TextResource callToActionDisplay, C39282o selectedActivityMenuItemState, boolean z4, TextResource locationDividerTitleDisplay, TextResource locationPromptDisplay, C32870j c32870j, List<C32870j> allowedStrapLocations, C32864d startTimePickerState, C32864d endTimePickerState, EnumC32862b bottomSheetStateValue, EnumC32861a activityType, boolean z13, TextResource activityLabel, C4092p2 c4092p2, EnumC34058c selectedScreenSection, boolean z14, TextResource textResource) {
            AbstractC22676k.m65750j(editActivityTitleDisplay, "editActivityTitleDisplay");
            AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
            AbstractC22676k.m65750j(selectedActivityMenuItemState, "selectedActivityMenuItemState");
            AbstractC22676k.m65750j(locationDividerTitleDisplay, "locationDividerTitleDisplay");
            AbstractC22676k.m65750j(locationPromptDisplay, "locationPromptDisplay");
            AbstractC22676k.m65750j(allowedStrapLocations, "allowedStrapLocations");
            AbstractC22676k.m65750j(startTimePickerState, "startTimePickerState");
            AbstractC22676k.m65750j(endTimePickerState, "endTimePickerState");
            AbstractC22676k.m65750j(bottomSheetStateValue, "bottomSheetStateValue");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(activityLabel, "activityLabel");
            AbstractC22676k.m65750j(selectedScreenSection, "selectedScreenSection");
            this.editActivityTitleDisplay = editActivityTitleDisplay;
            this.callToActionDisplay = callToActionDisplay;
            this.selectedActivityMenuItemState = selectedActivityMenuItemState;
            this.isSelectedActivityVisible = z4;
            this.locationDividerTitleDisplay = locationDividerTitleDisplay;
            this.locationPromptDisplay = locationPromptDisplay;
            this.currentStrapLocation = c32870j;
            this.allowedStrapLocations = allowedStrapLocations;
            this.startTimePickerState = startTimePickerState;
            this.endTimePickerState = endTimePickerState;
            this.bottomSheetStateValue = bottomSheetStateValue;
            this.activityType = activityType;
            this.primaryButtonEnabled = z13;
            this.activityLabel = activityLabel;
            this.infoCalloutState = c4092p2;
            this.selectedScreenSection = selectedScreenSection;
            this.isPrimaryButtonV2 = z14;
            this.deleteActivityText = textResource;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getActivityLabel() {
            return this.activityLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC32861a getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: c */
        public final List<C32870j> m131457c() {
            return this.allowedStrapLocations;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getCallToActionDisplay() {
            return this.callToActionDisplay;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C32870j getCurrentStrapLocation() {
            return this.currentStrapLocation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.editActivityTitleDisplay, aVar.editActivityTitleDisplay) && AbstractC22676k.m65745e(this.callToActionDisplay, aVar.callToActionDisplay) && AbstractC22676k.m65745e(this.selectedActivityMenuItemState, aVar.selectedActivityMenuItemState) && this.isSelectedActivityVisible == aVar.isSelectedActivityVisible && AbstractC22676k.m65745e(this.locationDividerTitleDisplay, aVar.locationDividerTitleDisplay) && AbstractC22676k.m65745e(this.locationPromptDisplay, aVar.locationPromptDisplay) && AbstractC22676k.m65745e(this.currentStrapLocation, aVar.currentStrapLocation) && AbstractC22676k.m65745e(this.allowedStrapLocations, aVar.allowedStrapLocations) && AbstractC22676k.m65745e(this.startTimePickerState, aVar.startTimePickerState) && AbstractC22676k.m65745e(this.endTimePickerState, aVar.endTimePickerState) && this.bottomSheetStateValue == aVar.bottomSheetStateValue && this.activityType == aVar.activityType && this.primaryButtonEnabled == aVar.primaryButtonEnabled && AbstractC22676k.m65745e(this.activityLabel, aVar.activityLabel) && AbstractC22676k.m65745e(this.infoCalloutState, aVar.infoCalloutState) && this.selectedScreenSection == aVar.selectedScreenSection && this.isPrimaryButtonV2 == aVar.isPrimaryButtonV2 && AbstractC22676k.m65745e(this.deleteActivityText, aVar.deleteActivityText);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getDeleteActivityText() {
            return this.deleteActivityText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getEditActivityTitleDisplay() {
            return this.editActivityTitleDisplay;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C32864d getEndTimePickerState() {
            return this.endTimePickerState;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b((this.selectedActivityMenuItemState.hashCode() + AbstractC31061c.m95625a(this.editActivityTitleDisplay.hashCode() * 31, this.callToActionDisplay, 31)) * 31, 31, this.isSelectedActivityVisible), this.locationDividerTitleDisplay, 31), this.locationPromptDisplay, 31);
            C32870j c32870j = this.currentStrapLocation;
            int iM95625a2 = AbstractC31061c.m95625a(AbstractC2875y.m8289b((this.activityType.hashCode() + ((this.bottomSheetStateValue.hashCode() + ((this.endTimePickerState.hashCode() + ((this.startTimePickerState.hashCode() + AbstractC11895b.m31983b((iM95625a + (c32870j == null ? 0 : c32870j.hashCode())) * 31, 31, this.allowedStrapLocations)) * 31)) * 31)) * 31)) * 31, 31, this.primaryButtonEnabled), this.activityLabel, 31);
            C4092p2 c4092p2 = this.infoCalloutState;
            int iM8289b = AbstractC2875y.m8289b((this.selectedScreenSection.hashCode() + ((iM95625a2 + (c4092p2 == null ? 0 : c4092p2.hashCode())) * 31)) * 31, 31, this.isPrimaryButtonV2);
            TextResource textResource = this.deleteActivityText;
            return iM8289b + (textResource != null ? textResource.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C4092p2 getInfoCalloutState() {
            return this.infoCalloutState;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getLocationDividerTitleDisplay() {
            return this.locationDividerTitleDisplay;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getLocationPromptDisplay() {
            return this.locationPromptDisplay;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getPrimaryButtonEnabled() {
            return this.primaryButtonEnabled;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final C39282o getSelectedActivityMenuItemState() {
            return this.selectedActivityMenuItemState;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final EnumC34058c getSelectedScreenSection() {
            return this.selectedScreenSection;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final C32864d getStartTimePickerState() {
            return this.startTimePickerState;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getIsPrimaryButtonV2() {
            return this.isPrimaryButtonV2;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getIsSelectedActivityVisible() {
            return this.isSelectedActivityVisible;
        }

        public String toString() {
            TextResource textResource = this.editActivityTitleDisplay;
            TextResource textResource2 = this.callToActionDisplay;
            C39282o c39282o = this.selectedActivityMenuItemState;
            boolean z4 = this.isSelectedActivityVisible;
            TextResource textResource3 = this.locationDividerTitleDisplay;
            TextResource textResource4 = this.locationPromptDisplay;
            C32870j c32870j = this.currentStrapLocation;
            List<C32870j> list = this.allowedStrapLocations;
            C32864d c32864d = this.startTimePickerState;
            C32864d c32864d2 = this.endTimePickerState;
            EnumC32862b enumC32862b = this.bottomSheetStateValue;
            EnumC32861a enumC32861a = this.activityType;
            boolean z13 = this.primaryButtonEnabled;
            TextResource textResource5 = this.activityLabel;
            C4092p2 c4092p2 = this.infoCalloutState;
            EnumC34058c enumC34058c = this.selectedScreenSection;
            boolean z14 = this.isPrimaryButtonV2;
            TextResource textResource6 = this.deleteActivityText;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("ActivityData(editActivityTitleDisplay=", textResource, ", callToActionDisplay=", textResource2, ", selectedActivityMenuItemState=");
            sbM106658q.append(c39282o);
            sbM106658q.append(", isSelectedActivityVisible=");
            sbM106658q.append(z4);
            sbM106658q.append(", locationDividerTitleDisplay=");
            AbstractC30007c.m91855y(sbM106658q, textResource3, ", locationPromptDisplay=", textResource4, ", currentStrapLocation=");
            sbM106658q.append(c32870j);
            sbM106658q.append(", allowedStrapLocations=");
            sbM106658q.append(list);
            sbM106658q.append(", startTimePickerState=");
            sbM106658q.append(c32864d);
            sbM106658q.append(", endTimePickerState=");
            sbM106658q.append(c32864d2);
            sbM106658q.append(", bottomSheetStateValue=");
            sbM106658q.append(enumC32862b);
            sbM106658q.append(", activityType=");
            sbM106658q.append(enumC32861a);
            sbM106658q.append(", primaryButtonEnabled=");
            AbstractC21702c.m61144o(textResource5, ", activityLabel=", ", infoCalloutState=", sbM106658q, z13);
            sbM106658q.append(c4092p2);
            sbM106658q.append(", selectedScreenSection=");
            sbM106658q.append(enumC34058c);
            sbM106658q.append(", isPrimaryButtonV2=");
            sbM106658q.append(z14);
            sbM106658q.append(", deleteActivityText=");
            sbM106658q.append(textResource6);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ a(TextResource textResource, TextResource textResource2, C39282o c39282o, boolean z4, TextResource textResource3, TextResource textResource4, C32870j c32870j, List list, C32864d c32864d, C32864d c32864d2, EnumC32862b enumC32862b, EnumC32861a enumC32861a, boolean z13, TextResource textResource5, C4092p2 c4092p2, EnumC34058c enumC34058c, boolean z14, TextResource textResource6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? new C39282o(null, AbstractC8693b.m21267a(), null, false, false, new AbstractC39279l.b(null, null, null, null, null, null, null, null, null, null, null, false, 4095, null), false, null, null, null, false, null, null, null, null, 32733, null) : c39282o, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 64) != 0 ? null : c32870j, (i13 & 128) != 0 ? C25271y.f99162w : list, (i13 & 256) != 0 ? new C32864d(null, null, null, null, null, 31, null) : c32864d, (i13 & 512) != 0 ? new C32864d(null, null, null, null, null, 31, null) : c32864d2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC32862b.COLLAPSED : enumC32862b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC32861a.SLEEP : enumC32861a, (i13 & 4096) != 0 ? false : z13, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? AbstractC8693b.m21267a() : textResource5, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : c4092p2, (i13 & 32768) != 0 ? EnumC34058c.NONE : enumC34058c, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? false : z14, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : textResource6);
        }
    }
}

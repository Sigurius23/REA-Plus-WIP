package iw1;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: iw1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m65681d2 = {"Liw1/k;", "Liw1/i;", "<init>", "()V", "b", "a", "d", "c", "Liw1/k$a;", "Liw1/k$b;", "Liw1/k$d;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21005k implements InterfaceC21003i {

    /* JADX INFO: renamed from: iw1.k$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liw1/k$a;", "Liw1/k;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC21005k {

        /* JADX INFO: renamed from: a */
        public static final a f79487a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: iw1.k$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liw1/k$b;", "Liw1/k;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC21005k {

        /* JADX INFO: renamed from: a */
        public static final b f79488a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: iw1.k$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Liw1/k$c;", "", "", "Lm91/u;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends InterfaceC25312u> items) {
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m58553a() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.items, ((c) other).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("SectionViewState(items=", ")", this.items);
        }
    }

    /* JADX INFO: renamed from: iw1.k$d */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b'\u0010&¨\u0006("}, m65681d2 = {"Liw1/k$d;", "Liw1/k;", "Lcom/whoop/design/util/TextResource;", "header", "", "trackingLabel", "trackingValue", "", "initialSectionIndex", "", "options", "Liw1/k$c;", "sections", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "i", "c", "j", "d", "I", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC21005k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource header;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String trackingLabel;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String trackingValue;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int initialSectionIndex;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<String> options;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<c> sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextResource header, String trackingLabel, String str, int i13, List<String> options, List<c> sections) {
            super(null);
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
            AbstractC22676k.m65750j(options, "options");
            AbstractC22676k.m65750j(sections, "sections");
            this.header = header;
            this.trackingLabel = trackingLabel;
            this.trackingValue = str;
            this.initialSectionIndex = i13;
            this.options = options;
            this.sections = sections;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getHeader() {
            return this.header;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.header, dVar.header) && AbstractC22676k.m65745e(this.trackingLabel, dVar.trackingLabel) && AbstractC22676k.m65745e(this.trackingValue, dVar.trackingValue) && this.initialSectionIndex == dVar.initialSectionIndex && AbstractC22676k.m65745e(this.options, dVar.options) && AbstractC22676k.m65745e(this.sections, dVar.sections);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getInitialSectionIndex() {
            return this.initialSectionIndex;
        }

        /* JADX INFO: renamed from: g */
        public final List<String> m58556g() {
            return this.options;
        }

        /* JADX INFO: renamed from: h */
        public final List<c> m58557h() {
            return this.sections;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.header.hashCode() * 31, 31, this.trackingLabel);
            String str = this.trackingValue;
            return this.sections.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.initialSectionIndex, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.options);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTrackingLabel() {
            return this.trackingLabel;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getTrackingValue() {
            return this.trackingValue;
        }

        public String toString() {
            TextResource textResource = this.header;
            String str = this.trackingLabel;
            String str2 = this.trackingValue;
            int i13 = this.initialSectionIndex;
            List<String> list = this.options;
            List<c> list2 = this.sections;
            StringBuilder sbM91845o = AbstractC30007c.m91845o("Success(header=", textResource, ", trackingLabel=", str, ", trackingValue=");
            AbstractC11266d.m30470x(i13, str2, ", initialSectionIndex=", ", options=", sbM91845o);
            return AbstractC30007c.m91843m(sbM91845o, list, ", sections=", list2, ")");
        }
    }

    public /* synthetic */ AbstractC21005k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21005k() {
    }
}

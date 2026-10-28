package d41;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: d41.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Ld41/j;", "", "<init>", "()V", "a", "c", "d", "e", "b", "Ld41/j$a;", "Ld41/j$b;", "Ld41/j$c;", "Ld41/j$d;", "Ld41/j$e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11684j {

    /* JADX INFO: renamed from: d41.j$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ld41/j$a;", "Ld41/j;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC11684j {

        /* JADX INFO: renamed from: a */
        public static final a f37766a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f37767b = 0;

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: d41.j$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, m65681d2 = {"Ld41/j$b;", "Ld41/j;", "Lkd1/o;", "image", "", "id", "<init>", "(Lkd1/o;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Ljava/lang/String;", "getId", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC11684j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC22403o image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC22403o image, String id4) {
            super(null);
            AbstractC22676k.m65750j(image, "image");
            AbstractC22676k.m65750j(id4, "id");
            this.image = image;
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC22403o getImage() {
            return this.image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.image, bVar.image) && AbstractC22676k.m65745e(this.id, bVar.id);
        }

        public int hashCode() {
            return this.id.hashCode() + (this.image.hashCode() * 31);
        }

        public String toString() {
            return "Image(image=" + this.image + ", id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: d41.j$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ld41/j$e;", "Ld41/j;", "Lkd1/o;", "image", "<init>", "(Lkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC11684j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC22403o image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC22403o image) {
            super(null);
            AbstractC22676k.m65750j(image, "image");
            this.image = image;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC22403o getImage() {
            return this.image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.image, ((e) other).image);
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        public String toString() {
            return "VideoNoOverlay(image=" + this.image + ")";
        }
    }

    public /* synthetic */ AbstractC11684j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC11684j() {
    }

    /* JADX INFO: renamed from: d41.j$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0016\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Ld41/j$d;", "Ld41/j;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "subText", "body", "tag", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC11684j {

        /* JADX INFO: renamed from: f */
        public static final int f37780f = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC22403o image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource subText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource body;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC22403o image, TextResource title, TextResource textResource, TextResource body, TextResource textResource2) {
            super(null);
            AbstractC22676k.m65750j(image, "image");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            this.image = image;
            this.title = title;
            this.subText = textResource;
            this.body = body;
            this.tag = textResource2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC22403o getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getSubText() {
            return this.subText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.image, dVar.image) && AbstractC22676k.m65745e(this.title, dVar.title) && AbstractC22676k.m65745e(this.subText, dVar.subText) && AbstractC22676k.m65745e(this.body, dVar.body) && AbstractC22676k.m65745e(this.tag, dVar.tag);
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(this.image.hashCode() * 31, this.title, 31);
            TextResource textResource = this.subText;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, this.body, 31);
            TextResource textResource2 = this.tag;
            return iM95625a2 + (textResource2 != null ? textResource2.hashCode() : 0);
        }

        public String toString() {
            AbstractC22403o abstractC22403o = this.image;
            TextResource textResource = this.title;
            TextResource textResource2 = this.subText;
            TextResource textResource3 = this.body;
            TextResource textResource4 = this.tag;
            StringBuilder sbM114683k = AbstractC36095b.m114683k("Video(image=", textResource, abstractC22403o, ", title=", ", subText=");
            AbstractC30007c.m91855y(sbM114683k, textResource2, ", body=", textResource3, ", tag=");
            return AbstractC30007c.m91841k(sbM114683k, textResource4, ")");
        }

        public /* synthetic */ d(AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC22403o, textResource, (i13 & 4) != 0 ? null : textResource2, textResource3, (i13 & 16) != 0 ? null : textResource4);
        }
    }

    /* JADX INFO: renamed from: d41.j$c */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u001e\u0010&R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b'\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b\u001b\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, m65681d2 = {"Ld41/j$c;", "Ld41/j;", "", "id", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "imageContentDescription", "", "iconRes", "title", "subText", "body", "tag", "Ld41/i;", "textSubType", "<init>", "(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld41/i;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lkd1/o;", "d", "()Lkd1/o;", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "i", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ld41/i;", "()Ld41/i;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC11684j {

        /* JADX INFO: renamed from: j */
        public static final int f37770j = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC22403o image;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource imageContentDescription;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer iconRes;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource subText;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource body;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource tag;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final AbstractC11683i textSubType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String id4, AbstractC22403o image, TextResource textResource, Integer num, TextResource title, TextResource textResource2, TextResource body, TextResource textResource3, AbstractC11683i textSubType) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(image, "image");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(textSubType, "textSubType");
            this.id = id4;
            this.image = image;
            this.imageContentDescription = textResource;
            this.iconRes = num;
            this.title = title;
            this.subText = textResource2;
            this.body = body;
            this.tag = textResource3;
            this.textSubType = textSubType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getIconRes() {
            return this.iconRes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AbstractC22403o getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getImageContentDescription() {
            return this.imageContentDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.id, cVar.id) && AbstractC22676k.m65745e(this.image, cVar.image) && AbstractC22676k.m65745e(this.imageContentDescription, cVar.imageContentDescription) && AbstractC22676k.m65745e(this.iconRes, cVar.iconRes) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subText, cVar.subText) && AbstractC22676k.m65745e(this.body, cVar.body) && AbstractC22676k.m65745e(this.tag, cVar.tag) && AbstractC22676k.m65745e(this.textSubType, cVar.textSubType);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getSubText() {
            return this.subText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final AbstractC11683i getTextSubType() {
            return this.textSubType;
        }

        public int hashCode() {
            int iM91833c = AbstractC30007c.m91833c(this.image, this.id.hashCode() * 31, 31);
            TextResource textResource = this.imageContentDescription;
            int iHashCode = (iM91833c + (textResource == null ? 0 : textResource.hashCode())) * 31;
            Integer num = this.iconRes;
            int iM95625a = AbstractC31061c.m95625a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, this.title, 31);
            TextResource textResource2 = this.subText;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, this.body, 31);
            TextResource textResource3 = this.tag;
            return this.textSubType.hashCode() + ((iM95625a2 + (textResource3 != null ? textResource3.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public String toString() {
            String str = this.id;
            AbstractC22403o abstractC22403o = this.image;
            TextResource textResource = this.imageContentDescription;
            Integer num = this.iconRes;
            TextResource textResource2 = this.title;
            TextResource textResource3 = this.subText;
            TextResource textResource4 = this.body;
            TextResource textResource5 = this.tag;
            AbstractC11683i abstractC11683i = this.textSubType;
            StringBuilder sb4 = new StringBuilder("Text(id=");
            sb4.append(str);
            sb4.append(", image=");
            sb4.append(abstractC22403o);
            sb4.append(", imageContentDescription=");
            sb4.append(textResource);
            sb4.append(", iconRes=");
            sb4.append(num);
            sb4.append(", title=");
            AbstractC30007c.m91855y(sb4, textResource2, ", subText=", textResource3, ", body=");
            AbstractC30007c.m91855y(sb4, textResource4, ", tag=", textResource5, ", textSubType=");
            sb4.append(abstractC11683i);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ c(String str, AbstractC22403o abstractC22403o, TextResource textResource, Integer num, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, AbstractC11683i abstractC11683i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, abstractC22403o, (i13 & 4) != 0 ? null : textResource, (i13 & 8) != 0 ? null : num, textResource2, (i13 & 32) != 0 ? null : textResource3, textResource4, (i13 & 128) != 0 ? null : textResource5, (i13 & 256) != 0 ? AbstractC11683i.b.f37765a : abstractC11683i);
        }
    }
}

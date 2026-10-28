package lo0;

import androidx.core.app.NotificationCompat;
import c31.C3927k;
import c41.C4092p2;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import hy0.C17749h0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io0.C20734u;
import java.util.List;
import n01.C26088e;
import o71.C27638h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p291l0.InterfaceC22974l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import t11.C33308h;

/* JADX INFO: renamed from: lo0.b0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*\fB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b \u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m65681d2 = {"Llo0/b0;", "Lfy1/k;", "Llo0/b0$a;", "fullScreenModal", "Llo0/b0$b;", "screenContent", "Llo0/l0;", "stepTransition", "Llo0/z$v;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Llo0/b0$a;Llo0/b0$b;Llo0/l0;Llo0/z$v;)V", "b", "(Llo0/b0$a;Llo0/b0$b;Llo0/l0;Llo0/z$v;)Llo0/b0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llo0/b0$a;", "e", "()Llo0/b0$a;", "c", "Llo0/b0$b;", "f", "()Llo0/b0$b;", "d", "Llo0/l0;", "g", "()Llo0/l0;", "Llo0/z$v;", "()Llo0/z$v;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24571b0 implements InterfaceC14875k {

    /* JADX INFO: renamed from: f */
    public static final int f95942f = C33211q0.f138501k;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final a fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final b screenContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC24591l0 stepTransition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC24615z.v event;

    /* JADX INFO: renamed from: lo0.b0$b */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\t\f\r\u000e\u000f\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Llo0/b0$b;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "intakeStepId", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "toolbarTitle", "e", "c", "d", "f", "Llo0/b0$b$a;", "Llo0/b0$b$b;", "Llo0/b0$b$c;", "Llo0/b0$b$d;", "Llo0/b0$b$e;", "Llo0/b0$b$f;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: lo0.b0$b$a */
        @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b\u001f\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b#\u0010)¨\u0006*"}, m65681d2 = {"Llo0/b0$b$a;", "Llo0/b0$b;", "", "intakeStepId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "title", "subtitle", "Lhy0/h0;", "image", "Lo71/h;", "heightWeightPicker", "Lc31/k;", "progressButton", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lhy0/h0;Lo71/h;Lc31/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "g", "d", "f", "e", "Lhy0/h0;", "()Lhy0/h0;", "Lo71/h;", "()Lo71/h;", "Lc31/k;", "()Lc31/k;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: h */
            public static final int f95952h = ((C3927k.f16020r | C27638h.f111213h) | C17749h0.f69004h) | TextResource.$stable;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String intakeStepId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final TextResource toolbarTitle;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String subtitle;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final C17749h0 image;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final C27638h heightWeightPicker;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final C3927k progressButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String intakeStepId, TextResource toolbarTitle, String title, String str, C17749h0 c17749h0, C27638h c27638h, C3927k c3927k) {
                super(null);
                AbstractC22676k.m65750j(intakeStepId, "intakeStepId");
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(title, "title");
                this.intakeStepId = intakeStepId;
                this.toolbarTitle = toolbarTitle;
                this.title = title;
                this.subtitle = str;
                this.image = c17749h0;
                this.heightWeightPicker = c27638h;
                this.progressButton = c3927k;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getIntakeStepId() {
                return this.intakeStepId;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public TextResource getToolbarTitle() {
                return this.toolbarTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C27638h getHeightWeightPicker() {
                return this.heightWeightPicker;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final C17749h0 getImage() {
                return this.image;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final C3927k getProgressButton() {
                return this.progressButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.intakeStepId, aVar.intakeStepId) && AbstractC22676k.m65745e(this.toolbarTitle, aVar.toolbarTitle) && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.subtitle, aVar.subtitle) && AbstractC22676k.m65745e(this.image, aVar.image) && AbstractC22676k.m65745e(this.heightWeightPicker, aVar.heightWeightPicker) && AbstractC22676k.m65745e(this.progressButton, aVar.progressButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.intakeStepId.hashCode() * 31, this.toolbarTitle, 31), 31, this.title);
                String str = this.subtitle;
                int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
                C17749h0 c17749h0 = this.image;
                int iHashCode2 = (iHashCode + (c17749h0 == null ? 0 : c17749h0.hashCode())) * 31;
                C27638h c27638h = this.heightWeightPicker;
                int iHashCode3 = (iHashCode2 + (c27638h == null ? 0 : c27638h.hashCode())) * 31;
                C3927k c3927k = this.progressButton;
                return iHashCode3 + (c3927k != null ? c3927k.hashCode() : 0);
            }

            public String toString() {
                String str = this.intakeStepId;
                TextResource textResource = this.toolbarTitle;
                String str2 = this.title;
                String str3 = this.subtitle;
                C17749h0 c17749h0 = this.image;
                C27638h c27638h = this.heightWeightPicker;
                C3927k c3927k = this.progressButton;
                StringBuilder sbM91847q = AbstractC30007c.m91847q("HeightWeightScreenContent(intakeStepId=", str, ", toolbarTitle=", textResource, ", title=");
                AbstractC11266d.m30444B(sbM91847q, str2, ", subtitle=", str3, ", image=");
                sbM91847q.append(c17749h0);
                sbM91847q.append(", heightWeightPicker=");
                sbM91847q.append(c27638h);
                sbM91847q.append(", progressButton=");
                sbM91847q.append(c3927k);
                sbM91847q.append(")");
                return sbM91847q.toString();
            }
        }

        /* JADX INFO: renamed from: lo0.b0$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010%R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b(\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b#\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b&\u0010-¨\u0006."}, m65681d2 = {"Llo0/b0$b$b;", "Llo0/b0$b;", "", "intakeStepId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "navigationSkipTitle", "Ll0/l;", "contentAlignment", "title", "subtitle", "", "Lm91/u;", "items", "Lc31/k;", "progressButton", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll0/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lc31/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "getNavigationSkipTitle", "d", "Ll0/l;", "()Ll0/l;", "e", "g", "f", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lc31/k;", "()Lc31/k;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41960b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String intakeStepId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final TextResource toolbarTitle;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final TextResource navigationSkipTitle;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final InterfaceC22974l contentAlignment;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final TextResource subtitle;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final List<InterfaceC25312u> items;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final C3927k progressButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C41960b(String intakeStepId, TextResource toolbarTitle, TextResource textResource, InterfaceC22974l contentAlignment, TextResource title, TextResource textResource2, List<? extends InterfaceC25312u> items, C3927k c3927k) {
                super(null);
                AbstractC22676k.m65750j(intakeStepId, "intakeStepId");
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(contentAlignment, "contentAlignment");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(items, "items");
                this.intakeStepId = intakeStepId;
                this.toolbarTitle = toolbarTitle;
                this.navigationSkipTitle = textResource;
                this.contentAlignment = contentAlignment;
                this.title = title;
                this.subtitle = textResource2;
                this.items = items;
                this.progressButton = c3927k;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getIntakeStepId() {
                return this.intakeStepId;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public TextResource getToolbarTitle() {
                return this.toolbarTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final InterfaceC22974l getContentAlignment() {
                return this.contentAlignment;
            }

            /* JADX INFO: renamed from: d */
            public final List<InterfaceC25312u> m71726d() {
                return this.items;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final C3927k getProgressButton() {
                return this.progressButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41960b)) {
                    return false;
                }
                C41960b c41960b = (C41960b) other;
                return AbstractC22676k.m65745e(this.intakeStepId, c41960b.intakeStepId) && AbstractC22676k.m65745e(this.toolbarTitle, c41960b.toolbarTitle) && AbstractC22676k.m65745e(this.navigationSkipTitle, c41960b.navigationSkipTitle) && AbstractC22676k.m65745e(this.contentAlignment, c41960b.contentAlignment) && AbstractC22676k.m65745e(this.title, c41960b.title) && AbstractC22676k.m65745e(this.subtitle, c41960b.subtitle) && AbstractC22676k.m65745e(this.items, c41960b.items) && AbstractC22676k.m65745e(this.progressButton, c41960b.progressButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final TextResource getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TextResource getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(this.intakeStepId.hashCode() * 31, this.toolbarTitle, 31);
                TextResource textResource = this.navigationSkipTitle;
                int iM95625a2 = AbstractC31061c.m95625a((this.contentAlignment.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31, this.title, 31);
                TextResource textResource2 = this.subtitle;
                int iM31983b = AbstractC11895b.m31983b((iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.items);
                C3927k c3927k = this.progressButton;
                return iM31983b + (c3927k != null ? c3927k.hashCode() : 0);
            }

            public String toString() {
                String str = this.intakeStepId;
                TextResource textResource = this.toolbarTitle;
                TextResource textResource2 = this.navigationSkipTitle;
                InterfaceC22974l interfaceC22974l = this.contentAlignment;
                TextResource textResource3 = this.title;
                TextResource textResource4 = this.subtitle;
                List<InterfaceC25312u> list = this.items;
                C3927k c3927k = this.progressButton;
                StringBuilder sbM91847q = AbstractC30007c.m91847q("InformationScreenContent(intakeStepId=", str, ", toolbarTitle=", textResource, ", navigationSkipTitle=");
                sbM91847q.append(textResource2);
                sbM91847q.append(", contentAlignment=");
                sbM91847q.append(interfaceC22974l);
                sbM91847q.append(", title=");
                AbstractC30007c.m91855y(sbM91847q, textResource3, ", subtitle=", textResource4, ", items=");
                sbM91847q.append(list);
                sbM91847q.append(", progressButton=");
                sbM91847q.append(c3927k);
                sbM91847q.append(")");
                return sbM91847q.toString();
            }
        }

        /* JADX INFO: renamed from: lo0.b0$b$c */
        @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010'R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b*\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b+\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b.\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b(\u00105¨\u00066"}, m65681d2 = {"Llo0/b0$b$c;", "Llo0/b0$b;", "", "intakeStepId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "navigationSkipTitle", "Ll0/l;", "contentAlignment", "title", "subtitle", "Ln01/e;", "optionsList", "Lt11/h;", "textAreaState", "", "textAreaVisible", "Lc31/k;", "progressButton", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll0/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ln01/e;Lt11/h;ZLc31/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "getNavigationSkipTitle", "d", "Ll0/l;", "()Ll0/l;", "e", "i", "f", "g", "Ln01/e;", "()Ln01/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lt11/h;", "()Lt11/h;", "Z", "()Z", "j", "Lc31/k;", "()Lc31/k;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: k */
            public static final int f95968k;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String intakeStepId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final TextResource toolbarTitle;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final TextResource navigationSkipTitle;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final InterfaceC22974l contentAlignment;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final TextResource subtitle;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final C26088e optionsList;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final C33308h textAreaState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final boolean textAreaVisible;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final C3927k progressButton;

            static {
                int i13 = C3927k.f16020r | C33308h.f138901o | C26088e.f103319h;
                int i14 = TextResource.$stable;
                f95968k = i13 | i14 | i14 | i14 | i14;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String intakeStepId, TextResource toolbarTitle, TextResource textResource, InterfaceC22974l contentAlignment, TextResource title, TextResource textResource2, C26088e optionsList, C33308h c33308h, boolean z4, C3927k c3927k) {
                super(null);
                AbstractC22676k.m65750j(intakeStepId, "intakeStepId");
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(contentAlignment, "contentAlignment");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(optionsList, "optionsList");
                this.intakeStepId = intakeStepId;
                this.toolbarTitle = toolbarTitle;
                this.navigationSkipTitle = textResource;
                this.contentAlignment = contentAlignment;
                this.title = title;
                this.subtitle = textResource2;
                this.optionsList = optionsList;
                this.textAreaState = c33308h;
                this.textAreaVisible = z4;
                this.progressButton = c3927k;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getIntakeStepId() {
                return this.intakeStepId;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public TextResource getToolbarTitle() {
                return this.toolbarTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final InterfaceC22974l getContentAlignment() {
                return this.contentAlignment;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final C26088e getOptionsList() {
                return this.optionsList;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final C3927k getProgressButton() {
                return this.progressButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return AbstractC22676k.m65745e(this.intakeStepId, cVar.intakeStepId) && AbstractC22676k.m65745e(this.toolbarTitle, cVar.toolbarTitle) && AbstractC22676k.m65745e(this.navigationSkipTitle, cVar.navigationSkipTitle) && AbstractC22676k.m65745e(this.contentAlignment, cVar.contentAlignment) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.optionsList, cVar.optionsList) && AbstractC22676k.m65745e(this.textAreaState, cVar.textAreaState) && this.textAreaVisible == cVar.textAreaVisible && AbstractC22676k.m65745e(this.progressButton, cVar.progressButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final TextResource getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final C33308h getTextAreaState() {
                return this.textAreaState;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getTextAreaVisible() {
                return this.textAreaVisible;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(this.intakeStepId.hashCode() * 31, this.toolbarTitle, 31);
                TextResource textResource = this.navigationSkipTitle;
                int iM95625a2 = AbstractC31061c.m95625a((this.contentAlignment.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31, this.title, 31);
                TextResource textResource2 = this.subtitle;
                int iHashCode = (this.optionsList.hashCode() + ((iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31)) * 31;
                C33308h c33308h = this.textAreaState;
                int iM8289b = AbstractC2875y.m8289b((iHashCode + (c33308h == null ? 0 : c33308h.hashCode())) * 31, 31, this.textAreaVisible);
                C3927k c3927k = this.progressButton;
                return iM8289b + (c3927k != null ? c3927k.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final TextResource getTitle() {
                return this.title;
            }

            public String toString() {
                String str = this.intakeStepId;
                TextResource textResource = this.toolbarTitle;
                TextResource textResource2 = this.navigationSkipTitle;
                InterfaceC22974l interfaceC22974l = this.contentAlignment;
                TextResource textResource3 = this.title;
                TextResource textResource4 = this.subtitle;
                C26088e c26088e = this.optionsList;
                C33308h c33308h = this.textAreaState;
                boolean z4 = this.textAreaVisible;
                C3927k c3927k = this.progressButton;
                StringBuilder sbM91847q = AbstractC30007c.m91847q("MultiSelectScreenContent(intakeStepId=", str, ", toolbarTitle=", textResource, ", navigationSkipTitle=");
                sbM91847q.append(textResource2);
                sbM91847q.append(", contentAlignment=");
                sbM91847q.append(interfaceC22974l);
                sbM91847q.append(", title=");
                AbstractC30007c.m91855y(sbM91847q, textResource3, ", subtitle=", textResource4, ", optionsList=");
                sbM91847q.append(c26088e);
                sbM91847q.append(", textAreaState=");
                sbM91847q.append(c33308h);
                sbM91847q.append(", textAreaVisible=");
                sbM91847q.append(z4);
                sbM91847q.append(", progressButton=");
                sbM91847q.append(c3927k);
                sbM91847q.append(")");
                return sbM91847q.toString();
            }
        }

        /* JADX INFO: renamed from: lo0.b0$b$d */
        @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b'\u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b!\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b%\u0010.¨\u0006/"}, m65681d2 = {"Llo0/b0$b$d;", "Llo0/b0$b;", "", "intakeStepId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "navigationSkipTitle", "title", "subtitle", "Llo0/m0;", "form", "Lc31/k;", "progressButton", "appointmentType", "Lio0/u;", "personalIntakeResponses", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Llo0/m0;Lc31/k;Ljava/lang/String;Lio0/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "getNavigationSkipTitle", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "g", "f", "Llo0/m0;", "()Llo0/m0;", "Lc31/k;", "()Lc31/k;", "i", "Lio0/u;", "()Lio0/u;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String intakeStepId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final TextResource toolbarTitle;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final TextResource navigationSkipTitle;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final TextResource subtitle;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final C24593m0 form;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final C3927k progressButton;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final String appointmentType;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final C20734u personalIntakeResponses;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String intakeStepId, TextResource toolbarTitle, TextResource textResource, TextResource title, TextResource textResource2, C24593m0 form, C3927k c3927k, String appointmentType, C20734u personalIntakeResponses) {
                super(null);
                AbstractC22676k.m65750j(intakeStepId, "intakeStepId");
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(form, "form");
                AbstractC22676k.m65750j(appointmentType, "appointmentType");
                AbstractC22676k.m65750j(personalIntakeResponses, "personalIntakeResponses");
                this.intakeStepId = intakeStepId;
                this.toolbarTitle = toolbarTitle;
                this.navigationSkipTitle = textResource;
                this.title = title;
                this.subtitle = textResource2;
                this.form = form;
                this.progressButton = c3927k;
                this.appointmentType = appointmentType;
                this.personalIntakeResponses = personalIntakeResponses;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getIntakeStepId() {
                return this.intakeStepId;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public TextResource getToolbarTitle() {
                return this.toolbarTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getAppointmentType() {
                return this.appointmentType;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final C24593m0 getForm() {
                return this.form;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final C20734u getPersonalIntakeResponses() {
                return this.personalIntakeResponses;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return AbstractC22676k.m65745e(this.intakeStepId, dVar.intakeStepId) && AbstractC22676k.m65745e(this.toolbarTitle, dVar.toolbarTitle) && AbstractC22676k.m65745e(this.navigationSkipTitle, dVar.navigationSkipTitle) && AbstractC22676k.m65745e(this.title, dVar.title) && AbstractC22676k.m65745e(this.subtitle, dVar.subtitle) && AbstractC22676k.m65745e(this.form, dVar.form) && AbstractC22676k.m65745e(this.progressButton, dVar.progressButton) && AbstractC22676k.m65745e(this.appointmentType, dVar.appointmentType) && AbstractC22676k.m65745e(this.personalIntakeResponses, dVar.personalIntakeResponses);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final C3927k getProgressButton() {
                return this.progressButton;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TextResource getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final TextResource getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(this.intakeStepId.hashCode() * 31, this.toolbarTitle, 31);
                TextResource textResource = this.navigationSkipTitle;
                int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, this.title, 31);
                TextResource textResource2 = this.subtitle;
                int iHashCode = (this.form.hashCode() + ((iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31)) * 31;
                C3927k c3927k = this.progressButton;
                return this.personalIntakeResponses.hashCode() + AbstractC11266d.m30450d((iHashCode + (c3927k != null ? c3927k.hashCode() : 0)) * 31, 31, this.appointmentType);
            }

            public String toString() {
                String str = this.intakeStepId;
                TextResource textResource = this.toolbarTitle;
                TextResource textResource2 = this.navigationSkipTitle;
                TextResource textResource3 = this.title;
                TextResource textResource4 = this.subtitle;
                C24593m0 c24593m0 = this.form;
                C3927k c3927k = this.progressButton;
                String str2 = this.appointmentType;
                C20734u c20734u = this.personalIntakeResponses;
                StringBuilder sbM91847q = AbstractC30007c.m91847q("PersonalIntakeScreenContent(intakeStepId=", str, ", toolbarTitle=", textResource, ", navigationSkipTitle=");
                AbstractC30007c.m91855y(sbM91847q, textResource2, ", title=", textResource3, ", subtitle=");
                sbM91847q.append(textResource4);
                sbM91847q.append(", form=");
                sbM91847q.append(c24593m0);
                sbM91847q.append(", progressButton=");
                sbM91847q.append(c3927k);
                sbM91847q.append(", appointmentType=");
                sbM91847q.append(str2);
                sbM91847q.append(", personalIntakeResponses=");
                sbM91847q.append(c20734u);
                sbM91847q.append(")");
                return sbM91847q.toString();
            }
        }

        /* JADX INFO: renamed from: lo0.b0$b$e */
        @Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b(\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b&\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b.\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b0\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b,\u0010<¨\u0006="}, m65681d2 = {"Llo0/b0$b$e;", "Llo0/b0$b;", "", "intakeStepId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "navigationSkipTitle", "Ll0/l;", "contentAlignment", "title", "subtitle", "Lhy0/h0;", "headerImage", "Lc41/p2;", "disclaimer", "Llo0/u0;", "searchField", "Ln01/e;", "statesList", "Lc31/k;", "progressButton", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll0/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/h0;Lc41/p2;Llo0/u0;Ln01/e;Lc31/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "getNavigationSkipTitle", "d", "Ll0/l;", "getContentAlignment", "()Ll0/l;", "e", "i", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lhy0/h0;", "()Lhy0/h0;", "Lc41/p2;", "()Lc41/p2;", "Llo0/u0;", "()Llo0/u0;", "j", "Ln01/e;", "()Ln01/e;", "k", "Lc31/k;", "()Lc31/k;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: l */
            public static final int f95988l;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String intakeStepId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final TextResource toolbarTitle;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final TextResource navigationSkipTitle;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final InterfaceC22974l contentAlignment;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final TextResource subtitle;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final C17749h0 headerImage;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final C4092p2 disclaimer;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final C24609u0 searchField;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final C26088e statesList;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final C3927k progressButton;

            static {
                int i13 = C3927k.f16020r | C26088e.f103319h | C4092p2.f16593v | C17749h0.f69004h;
                int i14 = TextResource.$stable;
                f95988l = i13 | i14 | i14 | i14 | i14;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String intakeStepId, TextResource toolbarTitle, TextResource textResource, InterfaceC22974l contentAlignment, TextResource title, TextResource textResource2, C17749h0 c17749h0, C4092p2 c4092p2, C24609u0 searchField, C26088e statesList, C3927k c3927k) {
                super(null);
                AbstractC22676k.m65750j(intakeStepId, "intakeStepId");
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(contentAlignment, "contentAlignment");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(searchField, "searchField");
                AbstractC22676k.m65750j(statesList, "statesList");
                this.intakeStepId = intakeStepId;
                this.toolbarTitle = toolbarTitle;
                this.navigationSkipTitle = textResource;
                this.contentAlignment = contentAlignment;
                this.title = title;
                this.subtitle = textResource2;
                this.headerImage = c17749h0;
                this.disclaimer = c4092p2;
                this.searchField = searchField;
                this.statesList = statesList;
                this.progressButton = c3927k;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getIntakeStepId() {
                return this.intakeStepId;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public TextResource getToolbarTitle() {
                return this.toolbarTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C4092p2 getDisclaimer() {
                return this.disclaimer;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final C17749h0 getHeaderImage() {
                return this.headerImage;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final C3927k getProgressButton() {
                return this.progressButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof e)) {
                    return false;
                }
                e eVar = (e) other;
                return AbstractC22676k.m65745e(this.intakeStepId, eVar.intakeStepId) && AbstractC22676k.m65745e(this.toolbarTitle, eVar.toolbarTitle) && AbstractC22676k.m65745e(this.navigationSkipTitle, eVar.navigationSkipTitle) && AbstractC22676k.m65745e(this.contentAlignment, eVar.contentAlignment) && AbstractC22676k.m65745e(this.title, eVar.title) && AbstractC22676k.m65745e(this.subtitle, eVar.subtitle) && AbstractC22676k.m65745e(this.headerImage, eVar.headerImage) && AbstractC22676k.m65745e(this.disclaimer, eVar.disclaimer) && AbstractC22676k.m65745e(this.searchField, eVar.searchField) && AbstractC22676k.m65745e(this.statesList, eVar.statesList) && AbstractC22676k.m65745e(this.progressButton, eVar.progressButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final C24609u0 getSearchField() {
                return this.searchField;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final C26088e getStatesList() {
                return this.statesList;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final TextResource getSubtitle() {
                return this.subtitle;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(this.intakeStepId.hashCode() * 31, this.toolbarTitle, 31);
                TextResource textResource = this.navigationSkipTitle;
                int iM95625a2 = AbstractC31061c.m95625a((this.contentAlignment.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31, this.title, 31);
                TextResource textResource2 = this.subtitle;
                int iHashCode = (iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
                C17749h0 c17749h0 = this.headerImage;
                int iHashCode2 = (iHashCode + (c17749h0 == null ? 0 : c17749h0.hashCode())) * 31;
                C4092p2 c4092p2 = this.disclaimer;
                int iHashCode3 = (this.statesList.hashCode() + ((this.searchField.hashCode() + ((iHashCode2 + (c4092p2 == null ? 0 : c4092p2.hashCode())) * 31)) * 31)) * 31;
                C3927k c3927k = this.progressButton;
                return iHashCode3 + (c3927k != null ? c3927k.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final TextResource getTitle() {
                return this.title;
            }

            public String toString() {
                String str = this.intakeStepId;
                TextResource textResource = this.toolbarTitle;
                TextResource textResource2 = this.navigationSkipTitle;
                InterfaceC22974l interfaceC22974l = this.contentAlignment;
                TextResource textResource3 = this.title;
                TextResource textResource4 = this.subtitle;
                C17749h0 c17749h0 = this.headerImage;
                C4092p2 c4092p2 = this.disclaimer;
                C24609u0 c24609u0 = this.searchField;
                C26088e c26088e = this.statesList;
                C3927k c3927k = this.progressButton;
                StringBuilder sbM91847q = AbstractC30007c.m91847q("StateSelectScreenContent(intakeStepId=", str, ", toolbarTitle=", textResource, ", navigationSkipTitle=");
                sbM91847q.append(textResource2);
                sbM91847q.append(", contentAlignment=");
                sbM91847q.append(interfaceC22974l);
                sbM91847q.append(", title=");
                AbstractC30007c.m91855y(sbM91847q, textResource3, ", subtitle=", textResource4, ", headerImage=");
                sbM91847q.append(c17749h0);
                sbM91847q.append(", disclaimer=");
                sbM91847q.append(c4092p2);
                sbM91847q.append(", searchField=");
                sbM91847q.append(c24609u0);
                sbM91847q.append(", statesList=");
                sbM91847q.append(c26088e);
                sbM91847q.append(", progressButton=");
                sbM91847q.append(c3927k);
                sbM91847q.append(")");
                return sbM91847q.toString();
            }
        }

        /* JADX INFO: renamed from: lo0.b0$b$f */
        @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b(\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0015R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b#\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b)\u00101¨\u00062"}, m65681d2 = {"Llo0/b0$b$f;", "Llo0/b0$b;", "", "intakeStepId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "navigationSkipTitle", "Lhy0/h0;", "image", "title", "subtitle", "", "Lt11/h;", "textAreaStates", "Llo0/k0;", "checkbox", "Lc31/k;", "progressButton", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lhy0/h0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llo0/k0;Lc31/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "e", "d", "Lhy0/h0;", "()Lhy0/h0;", "i", "f", "g", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "Llo0/k0;", "()Llo0/k0;", "Lc31/k;", "()Lc31/k;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String intakeStepId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final TextResource toolbarTitle;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String navigationSkipTitle;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final C17749h0 image;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final String subtitle;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final List<C33308h> textAreaStates;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final C24589k0 checkbox;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final C3927k progressButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String intakeStepId, TextResource toolbarTitle, String str, C17749h0 image, String title, String str2, List<C33308h> textAreaStates, C24589k0 c24589k0, C3927k c3927k) {
                super(null);
                AbstractC22676k.m65750j(intakeStepId, "intakeStepId");
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(image, "image");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(textAreaStates, "textAreaStates");
                this.intakeStepId = intakeStepId;
                this.toolbarTitle = toolbarTitle;
                this.navigationSkipTitle = str;
                this.image = image;
                this.title = title;
                this.subtitle = str2;
                this.textAreaStates = textAreaStates;
                this.checkbox = c24589k0;
                this.progressButton = c3927k;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getIntakeStepId() {
                return this.intakeStepId;
            }

            @Override // lo0.C24571b0.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public TextResource getToolbarTitle() {
                return this.toolbarTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C24589k0 getCheckbox() {
                return this.checkbox;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final C17749h0 getImage() {
                return this.image;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getNavigationSkipTitle() {
                return this.navigationSkipTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof f)) {
                    return false;
                }
                f fVar = (f) other;
                return AbstractC22676k.m65745e(this.intakeStepId, fVar.intakeStepId) && AbstractC22676k.m65745e(this.toolbarTitle, fVar.toolbarTitle) && AbstractC22676k.m65745e(this.navigationSkipTitle, fVar.navigationSkipTitle) && AbstractC22676k.m65745e(this.image, fVar.image) && AbstractC22676k.m65745e(this.title, fVar.title) && AbstractC22676k.m65745e(this.subtitle, fVar.subtitle) && AbstractC22676k.m65745e(this.textAreaStates, fVar.textAreaStates) && AbstractC22676k.m65745e(this.checkbox, fVar.checkbox) && AbstractC22676k.m65745e(this.progressButton, fVar.progressButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final C3927k getProgressButton() {
                return this.progressButton;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: h */
            public final List<C33308h> m71755h() {
                return this.textAreaStates;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(this.intakeStepId.hashCode() * 31, this.toolbarTitle, 31);
                String str = this.navigationSkipTitle;
                int iM30450d = AbstractC11266d.m30450d((this.image.hashCode() + ((iM95625a + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.title);
                String str2 = this.subtitle;
                int iM31983b = AbstractC11895b.m31983b((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.textAreaStates);
                C24589k0 c24589k0 = this.checkbox;
                int iHashCode = (iM31983b + (c24589k0 == null ? 0 : c24589k0.hashCode())) * 31;
                C3927k c3927k = this.progressButton;
                return iHashCode + (c3927k != null ? c3927k.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public String toString() {
                String str = this.intakeStepId;
                TextResource textResource = this.toolbarTitle;
                String str2 = this.navigationSkipTitle;
                C17749h0 c17749h0 = this.image;
                String str3 = this.title;
                String str4 = this.subtitle;
                List<C33308h> list = this.textAreaStates;
                C24589k0 c24589k0 = this.checkbox;
                C3927k c3927k = this.progressButton;
                StringBuilder sbM91847q = AbstractC30007c.m91847q("TextEntryScreenContent(intakeStepId=", str, ", toolbarTitle=", textResource, ", navigationSkipTitle=");
                sbM91847q.append(str2);
                sbM91847q.append(", image=");
                sbM91847q.append(c17749h0);
                sbM91847q.append(", title=");
                AbstractC11266d.m30444B(sbM91847q, str3, ", subtitle=", str4, ", textAreaStates=");
                sbM91847q.append(list);
                sbM91847q.append(", checkbox=");
                sbM91847q.append(c24589k0);
                sbM91847q.append(", progressButton=");
                sbM91847q.append(c3927k);
                sbM91847q.append(")");
                return sbM91847q.toString();
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract String getIntakeStepId();

        /* JADX INFO: renamed from: b */
        public abstract TextResource getToolbarTitle();

        private b() {
        }
    }

    public C24571b0(a aVar, b bVar, EnumC24591l0 stepTransition, InterfaceC24615z.v vVar) {
        AbstractC22676k.m65750j(stepTransition, "stepTransition");
        this.fullScreenModal = aVar;
        this.screenContent = bVar;
        this.stepTransition = stepTransition;
        this.event = vVar;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C24571b0 m71708c(C24571b0 c24571b0, a aVar, b bVar, EnumC24591l0 enumC24591l0, InterfaceC24615z.v vVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aVar = c24571b0.fullScreenModal;
        }
        if ((i13 & 2) != 0) {
            bVar = c24571b0.screenContent;
        }
        if ((i13 & 4) != 0) {
            enumC24591l0 = c24571b0.stepTransition;
        }
        if ((i13 & 8) != 0) {
            vVar = c24571b0.event;
        }
        return c24571b0.m71709b(aVar, bVar, enumC24591l0, vVar);
    }

    /* JADX INFO: renamed from: b */
    public final C24571b0 m71709b(a fullScreenModal, b screenContent, EnumC24591l0 stepTransition, InterfaceC24615z.v event) {
        AbstractC22676k.m65750j(stepTransition, "stepTransition");
        return new C24571b0(fullScreenModal, screenContent, stepTransition, event);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC24615z.v getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getFullScreenModal() {
        return this.fullScreenModal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24571b0)) {
            return false;
        }
        C24571b0 c24571b0 = (C24571b0) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c24571b0.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c24571b0.screenContent) && this.stepTransition == c24571b0.stepTransition && AbstractC22676k.m65745e(this.event, c24571b0.event);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getScreenContent() {
        return this.screenContent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC24591l0 getStepTransition() {
        return this.stepTransition;
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
        b bVar = this.screenContent;
        int iHashCode2 = (this.stepTransition.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        InterfaceC24615z.v vVar = this.event;
        return iHashCode2 + (vVar != null ? vVar.hashCode() : 0);
    }

    public String toString() {
        return "ClinicianVideoSchedulingIntakeViewState(fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ", stepTransition=" + this.stepTransition + ", event=" + this.event + ")";
    }

    /* JADX INFO: renamed from: lo0.b0$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Llo0/b0$a;", "", "Lsz0/q0;", "state", "Llo0/z;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Llo0/z;Llo0/z;Llo0/z;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Llo0/z;", "()Llo0/z;", "c", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: e */
        public static final int f95947e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC24615z primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC24615z secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC24615z backClickEvent;

        public a(C33211q0 state, InterfaceC24615z interfaceC24615z, InterfaceC24615z interfaceC24615z2, InterfaceC24615z interfaceC24615z3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC24615z;
            this.secondaryClickEvent = interfaceC24615z2;
            this.backClickEvent = interfaceC24615z3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC24615z getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC24615z getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC24615z getSecondaryClickEvent() {
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
            InterfaceC24615z interfaceC24615z = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC24615z == null ? 0 : interfaceC24615z.hashCode())) * 31;
            InterfaceC24615z interfaceC24615z2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC24615z2 == null ? 0 : interfaceC24615z2.hashCode())) * 31;
            InterfaceC24615z interfaceC24615z3 = this.backClickEvent;
            return iHashCode3 + (interfaceC24615z3 != null ? interfaceC24615z3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ a(C33211q0 c33211q0, InterfaceC24615z interfaceC24615z, InterfaceC24615z interfaceC24615z2, InterfaceC24615z interfaceC24615z3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC24615z, (i13 & 4) != 0 ? null : interfaceC24615z2, (i13 & 8) != 0 ? null : interfaceC24615z3);
        }
    }

    public /* synthetic */ C24571b0(a aVar, b bVar, EnumC24591l0 enumC24591l0, InterfaceC24615z.v vVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? EnumC24591l0.None : enumC24591l0, (i13 & 8) != 0 ? null : vVar);
    }
}

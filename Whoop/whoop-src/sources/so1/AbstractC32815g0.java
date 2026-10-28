package so1;

import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import m81.C25232g;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: so1.g0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lso1/g0;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lso1/g0$a;", "Lso1/g0$b;", "Lso1/g0$c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32815g0 implements InterfaceC14875k {

    /* JADX INFO: renamed from: so1.g0$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lso1/g0$a;", "Lso1/g0;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getErrorMessage", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC32815g0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String errorMessage) {
            super(null);
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.errorMessage, ((a) other).errorMessage);
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(errorMessage=", this.errorMessage, ")");
        }
    }

    /* JADX INFO: renamed from: so1.g0$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lso1/g0$b;", "Lso1/g0;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32815g0 {

        /* JADX INFO: renamed from: b */
        public static final b f136712b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: so1.g0$c */
    @Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b+\u0010.R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b/\u0010.R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b#\u0010.R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b'\u00101¨\u00062"}, m65681d2 = {"Lso1/g0$c;", "Lso1/g0;", "Ly81/e;", "backgroundColor", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "Lkd1/o;", "phaseImageUrl", "phaseTitleDisplay", "", "Lso1/i0;", "legends", "Lso1/j0;", "phaseStats", "Lm81/g;", "buttons", "", "", "Lso1/h0;", "education", "<init>", "(Ly81/e;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ly81/e;", "()Ly81/e;", "c", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "d", "Lkd1/o;", "g", "()Lkd1/o;", "e", "i", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/Map;", "()Ljava/util/Map;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC32815g0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC39332e backgroundColor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource navigationTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AbstractC22403o phaseImageUrl;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource phaseTitleDisplay;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<C32819i0> legends;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final List<C32821j0> phaseStats;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C25232g> buttons;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, C32817h0> education;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC39332e backgroundColor, TextResource navigationTitle, AbstractC22403o abstractC22403o, TextResource phaseTitleDisplay, List<C32819i0> legends, List<C32821j0> list, List<C25232g> buttons, Map<String, C32817h0> education) {
            super(null);
            AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            AbstractC22676k.m65750j(phaseTitleDisplay, "phaseTitleDisplay");
            AbstractC22676k.m65750j(legends, "legends");
            AbstractC22676k.m65750j(buttons, "buttons");
            AbstractC22676k.m65750j(education, "education");
            this.backgroundColor = backgroundColor;
            this.navigationTitle = navigationTitle;
            this.phaseImageUrl = abstractC22403o;
            this.phaseTitleDisplay = phaseTitleDisplay;
            this.legends = legends;
            this.phaseStats = list;
            this.buttons = buttons;
            this.education = education;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC39332e getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: c */
        public final List<C25232g> m102972c() {
            return this.buttons;
        }

        /* JADX INFO: renamed from: d */
        public final Map<String, C32817h0> m102973d() {
            return this.education;
        }

        /* JADX INFO: renamed from: e */
        public final List<C32819i0> m102974e() {
            return this.legends;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.backgroundColor, cVar.backgroundColor) && AbstractC22676k.m65745e(this.navigationTitle, cVar.navigationTitle) && AbstractC22676k.m65745e(this.phaseImageUrl, cVar.phaseImageUrl) && AbstractC22676k.m65745e(this.phaseTitleDisplay, cVar.phaseTitleDisplay) && AbstractC22676k.m65745e(this.legends, cVar.legends) && AbstractC22676k.m65745e(this.phaseStats, cVar.phaseStats) && AbstractC22676k.m65745e(this.buttons, cVar.buttons) && AbstractC22676k.m65745e(this.education, cVar.education);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getNavigationTitle() {
            return this.navigationTitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final AbstractC22403o getPhaseImageUrl() {
            return this.phaseImageUrl;
        }

        /* JADX INFO: renamed from: h */
        public final List<C32821j0> m102977h() {
            return this.phaseStats;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(this.backgroundColor.hashCode() * 31, this.navigationTitle, 31);
            AbstractC22403o abstractC22403o = this.phaseImageUrl;
            int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a((iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, this.phaseTitleDisplay, 31), 31, this.legends);
            List<C32821j0> list = this.phaseStats;
            return this.education.hashCode() + AbstractC11895b.m31983b((iM31983b + (list != null ? list.hashCode() : 0)) * 31, 31, this.buttons);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getPhaseTitleDisplay() {
            return this.phaseTitleDisplay;
        }

        public String toString() {
            InterfaceC39332e interfaceC39332e = this.backgroundColor;
            TextResource textResource = this.navigationTitle;
            AbstractC22403o abstractC22403o = this.phaseImageUrl;
            TextResource textResource2 = this.phaseTitleDisplay;
            List<C32819i0> list = this.legends;
            List<C32821j0> list2 = this.phaseStats;
            List<C25232g> list3 = this.buttons;
            Map<String, C32817h0> map = this.education;
            StringBuilder sb4 = new StringBuilder("Success(backgroundColor=");
            sb4.append(interfaceC39332e);
            sb4.append(", navigationTitle=");
            sb4.append(textResource);
            sb4.append(", phaseImageUrl=");
            AbstractC13673n.m38549A(sb4, abstractC22403o, ", phaseTitleDisplay=", textResource2, ", legends=");
            AbstractC21702c.m61148s(sb4, list, ", phaseStats=", list2, ", buttons=");
            sb4.append(list3);
            sb4.append(", education=");
            sb4.append(map);
            sb4.append(")");
            return sb4.toString();
        }
    }

    public /* synthetic */ AbstractC32815g0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof b) {
            return ScreenState.LOADING;
        }
        if (this instanceof a) {
            return ScreenState.ERROR;
        }
        if (this instanceof c) {
            return ScreenState.SUCCESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC32815g0() {
    }
}

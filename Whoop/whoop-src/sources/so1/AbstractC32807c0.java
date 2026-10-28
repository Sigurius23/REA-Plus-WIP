package so1;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import ep0.C13404j;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.c0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lso1/c0;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "e", "c", "d", "f", "Lso1/c0$a;", "Lso1/c0$b;", "Lso1/c0$c;", "Lso1/c0$d;", "Lso1/c0$e;", "Lso1/c0$f;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32807c0 implements InterfaceC14875k {

    /* JADX INFO: renamed from: so1.c0$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lso1/c0$a;", "Lso1/c0;", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC32807c0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.date, ((a) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: so1.c0$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lso1/c0$b;", "Lso1/c0;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32807c0 {

        /* JADX INFO: renamed from: b */
        public static final b f136650b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: so1.c0$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lso1/c0$c;", "Lso1/c0;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32807c0 {

        /* JADX INFO: renamed from: b */
        public static final c f136651b = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: so1.c0$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lso1/c0$d;", "Lso1/c0;", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC32807c0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.date, ((d) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SaveSuccess(date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: so1.c0$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lso1/c0$e;", "Lso1/c0;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32807c0 {

        /* JADX INFO: renamed from: b */
        public static final e f136653b = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC32807c0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof b) {
            return ScreenState.LOADING;
        }
        if ((this instanceof a) || (this instanceof c)) {
            return ScreenState.ERROR;
        }
        if ((this instanceof f) || (this instanceof d)) {
            return ScreenState.SUCCESS;
        }
        if (equals(e.f136653b)) {
            return ScreenState.OTHER;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC32807c0() {
    }

    /* JADX INFO: renamed from: so1.c0$f */
    @Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0084\u0001\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b+\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b/\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b8\u0010@¨\u0006A"}, m65681d2 = {"Lso1/c0$f;", "Lso1/c0;", "Lep0/j;", "screenContextMetadata", "", "Lm91/u;", "tiles", "Lso1/q;", "logPeriodBottomSheet", "Lcom/whoop/design/models/items/CyclePhaseStyle;", "currentPhase", "Ly81/e;", "backgroundColor", "Lcom/whoop/design/util/TextResource;", "title", "Lso1/l;", "editDialog", "Lso1/k0;", "symptomsScreen", "", "isUpdatingPredictions", "stopPoll", "<init>", "(Lep0/j;Ljava/util/List;Lso1/q;Lcom/whoop/design/models/items/CyclePhaseStyle;Ly81/e;Lcom/whoop/design/util/TextResource;Lso1/l;Lso1/k0;ZZ)V", "b", "(Lep0/j;Ljava/util/List;Lso1/q;Lcom/whoop/design/models/items/CyclePhaseStyle;Ly81/e;Lcom/whoop/design/util/TextResource;Lso1/l;Lso1/k0;ZZ)Lso1/c0$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lep0/j;", "g", "()Lep0/j;", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "d", "Lso1/q;", "f", "()Lso1/q;", "e", "Lcom/whoop/design/models/items/CyclePhaseStyle;", "getCurrentPhase", "()Lcom/whoop/design/models/items/CyclePhaseStyle;", "Ly81/e;", "()Ly81/e;", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lso1/l;", "()Lso1/l;", "i", "Lso1/k0;", "()Lso1/k0;", "Z", "l", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC32807c0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<InterfaceC25312u> tiles;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C32833q logPeriodBottomSheet;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final CyclePhaseStyle currentPhase;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC39332e backgroundColor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C32824l editDialog;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C32823k0 symptomsScreen;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean isUpdatingPredictions;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean stopPoll;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(C13404j c13404j, List<? extends InterfaceC25312u> tiles, C32833q c32833q, CyclePhaseStyle currentPhase, InterfaceC39332e backgroundColor, TextResource title, C32824l c32824l, C32823k0 c32823k0, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(tiles, "tiles");
            AbstractC22676k.m65750j(currentPhase, "currentPhase");
            AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
            AbstractC22676k.m65750j(title, "title");
            this.screenContextMetadata = c13404j;
            this.tiles = tiles;
            this.logPeriodBottomSheet = c32833q;
            this.currentPhase = currentPhase;
            this.backgroundColor = backgroundColor;
            this.title = title;
            this.editDialog = c32824l;
            this.symptomsScreen = c32823k0;
            this.isUpdatingPredictions = z4;
            this.stopPoll = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ f m102927c(f fVar, C13404j c13404j, List list, C32833q c32833q, CyclePhaseStyle cyclePhaseStyle, InterfaceC39332e interfaceC39332e, TextResource textResource, C32824l c32824l, C32823k0 c32823k0, boolean z4, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c13404j = fVar.screenContextMetadata;
            }
            if ((i13 & 2) != 0) {
                list = fVar.tiles;
            }
            if ((i13 & 4) != 0) {
                c32833q = fVar.logPeriodBottomSheet;
            }
            if ((i13 & 8) != 0) {
                cyclePhaseStyle = fVar.currentPhase;
            }
            if ((i13 & 16) != 0) {
                interfaceC39332e = fVar.backgroundColor;
            }
            if ((i13 & 32) != 0) {
                textResource = fVar.title;
            }
            if ((i13 & 64) != 0) {
                c32824l = fVar.editDialog;
            }
            if ((i13 & 128) != 0) {
                c32823k0 = fVar.symptomsScreen;
            }
            if ((i13 & 256) != 0) {
                z4 = fVar.isUpdatingPredictions;
            }
            if ((i13 & 512) != 0) {
                z13 = fVar.stopPoll;
            }
            boolean z14 = z4;
            boolean z15 = z13;
            C32824l c32824l2 = c32824l;
            C32823k0 c32823k1 = c32823k0;
            InterfaceC39332e interfaceC39332e2 = interfaceC39332e;
            TextResource textResource2 = textResource;
            return fVar.m102928b(c13404j, list, c32833q, cyclePhaseStyle, interfaceC39332e2, textResource2, c32824l2, c32823k1, z14, z15);
        }

        /* JADX INFO: renamed from: b */
        public final f m102928b(C13404j screenContextMetadata, List<? extends InterfaceC25312u> tiles, C32833q logPeriodBottomSheet, CyclePhaseStyle currentPhase, InterfaceC39332e backgroundColor, TextResource title, C32824l editDialog, C32823k0 symptomsScreen, boolean isUpdatingPredictions, boolean stopPoll) {
            AbstractC22676k.m65750j(tiles, "tiles");
            AbstractC22676k.m65750j(currentPhase, "currentPhase");
            AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
            AbstractC22676k.m65750j(title, "title");
            return new f(screenContextMetadata, tiles, logPeriodBottomSheet, currentPhase, backgroundColor, title, editDialog, symptomsScreen, isUpdatingPredictions, stopPoll);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC39332e getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C32824l getEditDialog() {
            return this.editDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.screenContextMetadata, fVar.screenContextMetadata) && AbstractC22676k.m65745e(this.tiles, fVar.tiles) && AbstractC22676k.m65745e(this.logPeriodBottomSheet, fVar.logPeriodBottomSheet) && this.currentPhase == fVar.currentPhase && AbstractC22676k.m65745e(this.backgroundColor, fVar.backgroundColor) && AbstractC22676k.m65745e(this.title, fVar.title) && AbstractC22676k.m65745e(this.editDialog, fVar.editDialog) && AbstractC22676k.m65745e(this.symptomsScreen, fVar.symptomsScreen) && this.isUpdatingPredictions == fVar.isUpdatingPredictions && this.stopPoll == fVar.stopPoll;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C32833q getLogPeriodBottomSheet() {
            return this.logPeriodBottomSheet;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getStopPoll() {
            return this.stopPoll;
        }

        public int hashCode() {
            C13404j c13404j = this.screenContextMetadata;
            int iM31983b = AbstractC11895b.m31983b((c13404j == null ? 0 : c13404j.hashCode()) * 31, 31, this.tiles);
            C32833q c32833q = this.logPeriodBottomSheet;
            int iM95625a = AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.backgroundColor, (this.currentPhase.hashCode() + ((iM31983b + (c32833q == null ? 0 : c32833q.hashCode())) * 31)) * 31, 31), this.title, 31);
            C32824l c32824l = this.editDialog;
            int iHashCode = (iM95625a + (c32824l == null ? 0 : c32824l.hashCode())) * 31;
            C32823k0 c32823k0 = this.symptomsScreen;
            return Boolean.hashCode(this.stopPoll) + AbstractC2875y.m8289b((iHashCode + (c32823k0 != null ? c32823k0.hashCode() : 0)) * 31, 31, this.isUpdatingPredictions);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C32823k0 getSymptomsScreen() {
            return this.symptomsScreen;
        }

        /* JADX INFO: renamed from: j */
        public final List<InterfaceC25312u> m102935j() {
            return this.tiles;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsUpdatingPredictions() {
            return this.isUpdatingPredictions;
        }

        public String toString() {
            C13404j c13404j = this.screenContextMetadata;
            List<InterfaceC25312u> list = this.tiles;
            C32833q c32833q = this.logPeriodBottomSheet;
            CyclePhaseStyle cyclePhaseStyle = this.currentPhase;
            InterfaceC39332e interfaceC39332e = this.backgroundColor;
            TextResource textResource = this.title;
            C32824l c32824l = this.editDialog;
            C32823k0 c32823k0 = this.symptomsScreen;
            boolean z4 = this.isUpdatingPredictions;
            boolean z13 = this.stopPoll;
            StringBuilder sb4 = new StringBuilder("Success(screenContextMetadata=");
            sb4.append(c13404j);
            sb4.append(", tiles=");
            sb4.append(list);
            sb4.append(", logPeriodBottomSheet=");
            sb4.append(c32833q);
            sb4.append(", currentPhase=");
            sb4.append(cyclePhaseStyle);
            sb4.append(", backgroundColor=");
            AbstractC33745d.m106665x(sb4, interfaceC39332e, ", title=", textResource, ", editDialog=");
            sb4.append(c32824l);
            sb4.append(", symptomsScreen=");
            sb4.append(c32823k0);
            sb4.append(", isUpdatingPredictions=");
            return AbstractC36095b.m114682j(sb4, z4, ", stopPoll=", z13, ")");
        }

        public /* synthetic */ f(C13404j c13404j, List list, C32833q c32833q, CyclePhaseStyle cyclePhaseStyle, InterfaceC39332e interfaceC39332e, TextResource textResource, C32824l c32824l, C32823k0 c32823k0, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : c13404j, list, c32833q, cyclePhaseStyle, interfaceC39332e, textResource, c32824l, c32823k0, (i13 & 256) != 0 ? false : z4, (i13 & 512) != 0 ? false : z13);
        }
    }
}

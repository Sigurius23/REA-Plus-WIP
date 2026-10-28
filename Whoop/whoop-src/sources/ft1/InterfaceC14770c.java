package ft1;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dt1.C12363a;
import h71.C16993j;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Instant;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p181h2.C16620e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import rs1.AbstractC31794f;
import rt1.C31812j;
import rt1.C31813k;
import sk1.C32573b;
import te0.AbstractC33745d;
import v41.C35691t;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ft1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, m65681d2 = {"Lft1/c;", "", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "j", "i", "k", "c", "b", "a", "f", "e", "Lft1/c$a;", "Lft1/c$b;", "Lft1/c$c;", "Lft1/c$d;", "Lft1/c$e;", "Lft1/c$f;", "Lft1/c$g;", "Lft1/c$h;", "Lft1/c$i;", "Lft1/c$j;", "Lft1/c$k;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14770c {

    /* JADX INFO: renamed from: ft1.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lft1/c$a;", "Lft1/c;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC14770c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Instant timestamp;

        public a(Instant timestamp) {
            AbstractC22676k.m65750j(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.timestamp, ((a) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "DeleteError(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: ft1.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lft1/c$b;", "Lft1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC14770c {

        /* JADX INFO: renamed from: a */
        public static final b f54715a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: ft1.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lft1/c$c;", "Lft1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC14770c {

        /* JADX INFO: renamed from: a */
        public static final c f54716a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: ft1.c$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lft1/c$d;", "Lft1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC14770c {

        /* JADX INFO: renamed from: a */
        public static final d f54717a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: ft1.c$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lft1/c$e;", "Lft1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14770c {

        /* JADX INFO: renamed from: a */
        public static final e f54718a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: ft1.c$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lft1/c$f;", "Lft1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC14770c {

        /* JADX INFO: renamed from: a */
        public static final f f54719a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: ft1.c$g */
    @Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0012\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b8\u00103R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u00103R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b4\u00103R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u00103R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\b=\u00103R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\b0\u00103R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\bG\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b?\u0010L\u001a\u0004\bA\u0010(R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bJ\u0010M\u001a\u0004\bN\u0010OR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0006¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bP\u0010@R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bQ\u0010(R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bP\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bC\u0010U\u001a\u0004\b<\u0010VR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bW\u0010L\u001a\u0004\bX\u0010(R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bD\u0010(R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bH\u00103R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\bF\u00103R\u0017\u0010\"\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b6\u0010I\u001a\u0004\bW\u0010KR\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bE\u0010[¨\u0006\\"}, m65681d2 = {"Lft1/c$g;", "Lft1/c;", "Lcom/whoop/design/util/TextResource;", "timestampTitle", "Lh71/j;", "waveform", "Lh2/e;", "initialGraphSize", "determinationTitle", "", "Lsk1/b;", "readings", "insightBody", "averageHr", "shareText", "disclaimerText", "addNotesText", "removeReadingText", "", "removeReadingEnabled", "", "id", "Ljava/time/Instant;", "timestamp", "savedSymptoms", "savedNotes", "Lrt1/k;", "symptomsBottomSheet", "Ldt1/a;", "dialogState", "pdfPresignedUrl", "pdfPath", "privacyTitle", "privacyDescription", "sharingPdf", "Lv41/t;", "pdfRendererFactory", "<init>", "(Lcom/whoop/design/util/TextResource;Lh71/j;JLcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Lrt1/k;Ldt1/a;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLv41/t;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "v", "()Lcom/whoop/design/util/TextResource;", "b", "Lh71/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Lh71/j;", "c", "J", "g", "()J", "d", "e", "Ljava/util/List;", "m", "()Ljava/util/List;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "r", "i", "j", "k", "o", "l", "Z", "n", "()Z", "Ljava/lang/String;", "Ljava/time/Instant;", "u", "()Ljava/time/Instant;", "q", "p", "Lrt1/k;", "t", "()Lrt1/k;", "Ldt1/a;", "()Ldt1/a;", "s", "getPdfPresignedUrl", "x", "Lv41/t;", "()Lv41/t;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC14770c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource timestampTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C16993j waveform;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long initialGraphSize;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource determinationTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C32573b> readings;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource insightBody;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource averageHr;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource shareText;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final TextResource disclaimerText;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final TextResource addNotesText;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final TextResource removeReadingText;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final boolean removeReadingEnabled;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final Instant timestamp;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final List<String> savedSymptoms;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final String savedNotes;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final C31813k symptomsBottomSheet;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final C12363a dialogState;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final String pdfPresignedUrl;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final String pdfPath;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final TextResource privacyTitle;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final TextResource privacyDescription;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final boolean sharingPdf;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final C35691t pdfRendererFactory;

        public /* synthetic */ g(TextResource textResource, C16993j c16993j, long j7, TextResource textResource2, List list, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, TextResource textResource8, boolean z4, String str, Instant instant, List list2, String str2, C31813k c31813k, C12363a c12363a, String str3, String str4, TextResource textResource9, TextResource textResource10, boolean z13, C35691t c35691t, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, c16993j, j7, textResource2, list, textResource3, textResource4, textResource5, textResource6, textResource7, textResource8, z4, str, instant, list2, str2, c31813k, c12363a, str3, str4, textResource9, textResource10, z13, c35691t);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getAddNotesText() {
            return this.addNotesText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getAverageHr() {
            return this.averageHr;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getDeterminationTitle() {
            return this.determinationTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C12363a getDialogState() {
            return this.dialogState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getDisclaimerText() {
            return this.disclaimerText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.timestampTitle, gVar.timestampTitle) && AbstractC22676k.m65745e(this.waveform, gVar.waveform) && C16620e.m47210b(this.initialGraphSize, gVar.initialGraphSize) && AbstractC22676k.m65745e(this.determinationTitle, gVar.determinationTitle) && AbstractC22676k.m65745e(this.readings, gVar.readings) && AbstractC22676k.m65745e(this.insightBody, gVar.insightBody) && AbstractC22676k.m65745e(this.averageHr, gVar.averageHr) && AbstractC22676k.m65745e(this.shareText, gVar.shareText) && AbstractC22676k.m65745e(this.disclaimerText, gVar.disclaimerText) && AbstractC22676k.m65745e(this.addNotesText, gVar.addNotesText) && AbstractC22676k.m65745e(this.removeReadingText, gVar.removeReadingText) && this.removeReadingEnabled == gVar.removeReadingEnabled && AbstractC22676k.m65745e(this.id, gVar.id) && AbstractC22676k.m65745e(this.timestamp, gVar.timestamp) && AbstractC22676k.m65745e(this.savedSymptoms, gVar.savedSymptoms) && AbstractC22676k.m65745e(this.savedNotes, gVar.savedNotes) && AbstractC22676k.m65745e(this.symptomsBottomSheet, gVar.symptomsBottomSheet) && AbstractC22676k.m65745e(this.dialogState, gVar.dialogState) && AbstractC22676k.m65745e(this.pdfPresignedUrl, gVar.pdfPresignedUrl) && AbstractC22676k.m65745e(this.pdfPath, gVar.pdfPath) && AbstractC22676k.m65745e(this.privacyTitle, gVar.privacyTitle) && AbstractC22676k.m65745e(this.privacyDescription, gVar.privacyDescription) && this.sharingPdf == gVar.sharingPdf && AbstractC22676k.m65745e(this.pdfRendererFactory, gVar.pdfRendererFactory);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final long getInitialGraphSize() {
            return this.initialGraphSize;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getInsightBody() {
            return this.insightBody;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC21702c.m61131b(this.timestamp, AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC11266d.m30451e((this.waveform.hashCode() + (this.timestampTitle.hashCode() * 31)) * 31, this.initialGraphSize, 31), this.determinationTitle, 31), 31, this.readings), this.insightBody, 31), this.averageHr, 31), this.shareText, 31), this.disclaimerText, 31), this.addNotesText, 31), this.removeReadingText, 31), 31, this.removeReadingEnabled), 31, this.id), 31), 31, this.savedSymptoms);
            String str = this.savedNotes;
            int iHashCode = (this.symptomsBottomSheet.hashCode() + ((iM31983b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            C12363a c12363a = this.dialogState;
            int iHashCode2 = (iHashCode + (c12363a == null ? 0 : c12363a.hashCode())) * 31;
            String str2 = this.pdfPresignedUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.pdfPath;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TextResource textResource = this.privacyTitle;
            int iHashCode5 = (iHashCode4 + (textResource == null ? 0 : textResource.hashCode())) * 31;
            TextResource textResource2 = this.privacyDescription;
            int iM8289b = AbstractC2875y.m8289b((iHashCode5 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.sharingPdf);
            C35691t c35691t = this.pdfRendererFactory;
            return iM8289b + (c35691t != null ? c35691t.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getPdfPath() {
            return this.pdfPath;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final C35691t getPdfRendererFactory() {
            return this.pdfRendererFactory;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getPrivacyDescription() {
            return this.privacyDescription;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getPrivacyTitle() {
            return this.privacyTitle;
        }

        /* JADX INFO: renamed from: m */
        public final List<C32573b> m42359m() {
            return this.readings;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getRemoveReadingEnabled() {
            return this.removeReadingEnabled;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final TextResource getRemoveReadingText() {
            return this.removeReadingText;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getSavedNotes() {
            return this.savedNotes;
        }

        /* JADX INFO: renamed from: q */
        public final List<String> m42363q() {
            return this.savedSymptoms;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final TextResource getShareText() {
            return this.shareText;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getSharingPdf() {
            return this.sharingPdf;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final C31813k getSymptomsBottomSheet() {
            return this.symptomsBottomSheet;
        }

        public String toString() {
            TextResource textResource = this.timestampTitle;
            C16993j c16993j = this.waveform;
            String strM47216h = C16620e.m47216h(this.initialGraphSize);
            TextResource textResource2 = this.determinationTitle;
            List<C32573b> list = this.readings;
            TextResource textResource3 = this.insightBody;
            TextResource textResource4 = this.averageHr;
            TextResource textResource5 = this.shareText;
            TextResource textResource6 = this.disclaimerText;
            TextResource textResource7 = this.addNotesText;
            TextResource textResource8 = this.removeReadingText;
            boolean z4 = this.removeReadingEnabled;
            String str = this.id;
            Instant instant = this.timestamp;
            List<String> list2 = this.savedSymptoms;
            String str2 = this.savedNotes;
            C31813k c31813k = this.symptomsBottomSheet;
            C12363a c12363a = this.dialogState;
            String str3 = this.pdfPresignedUrl;
            String str4 = this.pdfPath;
            TextResource textResource9 = this.privacyTitle;
            TextResource textResource10 = this.privacyDescription;
            boolean z13 = this.sharingPdf;
            C35691t c35691t = this.pdfRendererFactory;
            StringBuilder sb4 = new StringBuilder("Loaded(timestampTitle=");
            sb4.append(textResource);
            sb4.append(", waveform=");
            sb4.append(c16993j);
            sb4.append(", initialGraphSize=");
            AbstractC30007c.m91826A(sb4, strM47216h, ", determinationTitle=", textResource2, ", readings=");
            AbstractC30007c.m91852v(textResource3, ", insightBody=", ", averageHr=", sb4, list);
            AbstractC30007c.m91855y(sb4, textResource4, ", shareText=", textResource5, ", disclaimerText=");
            AbstractC30007c.m91855y(sb4, textResource6, ", addNotesText=", textResource7, ", removeReadingText=");
            AbstractC33745d.m106664w(textResource8, ", removeReadingEnabled=", ", id=", sb4, z4);
            sb4.append(str);
            sb4.append(", timestamp=");
            sb4.append(instant);
            sb4.append(", savedSymptoms=");
            AbstractC17176i.m48511m(", savedNotes=", str2, ", symptomsBottomSheet=", sb4, list2);
            sb4.append(c31813k);
            sb4.append(", dialogState=");
            sb4.append(c12363a);
            sb4.append(", pdfPresignedUrl=");
            AbstractC11266d.m30444B(sb4, str3, ", pdfPath=", str4, ", privacyTitle=");
            AbstractC30007c.m91855y(sb4, textResource9, ", privacyDescription=", textResource10, ", sharingPdf=");
            sb4.append(z13);
            sb4.append(", pdfRendererFactory=");
            sb4.append(c35691t);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final TextResource getTimestampTitle() {
            return this.timestampTitle;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final C16993j getWaveform() {
            return this.waveform;
        }

        private g(TextResource timestampTitle, C16993j waveform, long j7, TextResource determinationTitle, List<C32573b> readings, TextResource insightBody, TextResource averageHr, TextResource shareText, TextResource disclaimerText, TextResource addNotesText, TextResource removeReadingText, boolean z4, String id4, Instant timestamp, List<String> savedSymptoms, String str, C31813k symptomsBottomSheet, C12363a c12363a, String str2, String str3, TextResource textResource, TextResource textResource2, boolean z13, C35691t c35691t) {
            AbstractC22676k.m65750j(timestampTitle, "timestampTitle");
            AbstractC22676k.m65750j(waveform, "waveform");
            AbstractC22676k.m65750j(determinationTitle, "determinationTitle");
            AbstractC22676k.m65750j(readings, "readings");
            AbstractC22676k.m65750j(insightBody, "insightBody");
            AbstractC22676k.m65750j(averageHr, "averageHr");
            AbstractC22676k.m65750j(shareText, "shareText");
            AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
            AbstractC22676k.m65750j(addNotesText, "addNotesText");
            AbstractC22676k.m65750j(removeReadingText, "removeReadingText");
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(timestamp, "timestamp");
            AbstractC22676k.m65750j(savedSymptoms, "savedSymptoms");
            AbstractC22676k.m65750j(symptomsBottomSheet, "symptomsBottomSheet");
            this.timestampTitle = timestampTitle;
            this.waveform = waveform;
            this.initialGraphSize = j7;
            this.determinationTitle = determinationTitle;
            this.readings = readings;
            this.insightBody = insightBody;
            this.averageHr = averageHr;
            this.shareText = shareText;
            this.disclaimerText = disclaimerText;
            this.addNotesText = addNotesText;
            this.removeReadingText = removeReadingText;
            this.removeReadingEnabled = z4;
            this.id = id4;
            this.timestamp = timestamp;
            this.savedSymptoms = savedSymptoms;
            this.savedNotes = str;
            this.symptomsBottomSheet = symptomsBottomSheet;
            this.dialogState = c12363a;
            this.pdfPresignedUrl = str2;
            this.pdfPath = str3;
            this.privacyTitle = textResource;
            this.privacyDescription = textResource2;
            this.sharingPdf = z13;
            this.pdfRendererFactory = c35691t;
        }

        public /* synthetic */ g(TextResource textResource, C16993j c16993j, long j7, TextResource textResource2, List list, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, TextResource textResource8, boolean z4, String str, Instant instant, List list2, String str2, C31813k c31813k, C12363a c12363a, String str3, String str4, TextResource textResource9, TextResource textResource10, boolean z13, C35691t c35691t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            C16993j c16993j2;
            Instant EPOCH;
            TextResource textResourceM21267a = (i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource;
            if ((i13 & 2) != 0) {
                c16993j2 = new C16993j(null, null, 0.0f, null, null, null, 63, null);
            } else {
                c16993j2 = c16993j;
            }
            long j13 = (i13 & 4) != 0 ? 0L : j7;
            TextResource textResourceM21267a2 = (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2;
            int i14 = i13 & 16;
            List list3 = C25271y.f99162w;
            List list4 = i14 != 0 ? list3 : list;
            TextResource textResourceM21267a3 = (i13 & 32) != 0 ? AbstractC8693b.m21267a() : textResource3;
            TextResource textResourceM21267a4 = (i13 & 64) != 0 ? AbstractC8693b.m21267a() : textResource4;
            TextResource textResourceM21277k = (i13 & 128) != 0 ? AbstractC8693b.m21277k(AbstractC31794f.f131678q0) : textResource5;
            TextResource textResourceM21277k2 = (i13 & 256) != 0 ? AbstractC8693b.m21277k(AbstractC31794f.f131668l0) : textResource6;
            TextResource textResourceM21277k3 = (i13 & 512) != 0 ? AbstractC8693b.m21277k(AbstractC31794f.f131667l) : textResource7;
            TextResource textResourceM21277k4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC8693b.m21277k(AbstractC31794f.f131670m0) : textResource8;
            boolean z14 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? true : z4;
            TextResource textResource11 = textResourceM21267a;
            String str5 = (i13 & 4096) != 0 ? "" : str;
            TextResource textResource12 = textResourceM21267a2;
            if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                EPOCH = Instant.EPOCH;
                AbstractC22676k.m65749i(EPOCH, "EPOCH");
            } else {
                EPOCH = instant;
            }
            list3 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0 ? list2 : list3;
            String str6 = (32768 & i13) != 0 ? null : str2;
            TextResource textResource13 = textResourceM21267a3;
            TextResource textResource14 = textResourceM21267a4;
            TextResource textResource15 = textResourceM21277k;
            TextResource textResource16 = textResourceM21277k2;
            TextResource textResource17 = textResourceM21277k3;
            TextResource textResource18 = textResourceM21277k4;
            boolean z15 = z14;
            String str7 = str5;
            this(textResource11, c16993j2, j13, textResource12, list4, textResource13, textResource14, textResource15, textResource16, textResource17, textResource18, z15, str7, EPOCH, list3, str6, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? new C31813k("", new C31812j(null, null, null, null, 15, null)) : c31813k, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : c12363a, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str3, (i13 & 524288) != 0 ? null : str4, (i13 & 1048576) != 0 ? null : textResource9, (i13 & 2097152) != 0 ? null : textResource10, (i13 & 4194304) != 0 ? false : z13, (i13 & 8388608) == 0 ? c35691t : null, null);
        }
    }

    /* JADX INFO: renamed from: ft1.c$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lft1/c$h;", "Lft1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC14770c {

        /* JADX INFO: renamed from: a */
        public static final h f54744a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: ft1.c$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lft1/c$i;", "Lft1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC14770c {

        /* JADX INFO: renamed from: a */
        public static final i f54745a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: ft1.c$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lft1/c$j;", "Lft1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC14770c {

        /* JADX INFO: renamed from: a */
        public static final j f54746a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: ft1.c$k */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u001e"}, m65681d2 = {"Lft1/c$k;", "Lft1/c;", "", "id", "Ljava/time/Instant;", "timestamp", "", "symptoms", "notes", "<init>", "(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/Instant;", "d", "()Ljava/time/Instant;", "c", "Ljava/util/List;", "()Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC14770c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Instant timestamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> symptoms;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String notes;

        public k(String id4, Instant timestamp, List<String> symptoms, String notes) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(timestamp, "timestamp");
            AbstractC22676k.m65750j(symptoms, "symptoms");
            AbstractC22676k.m65750j(notes, "notes");
            this.id = id4;
            this.timestamp = timestamp;
            this.symptoms = symptoms;
            this.notes = notes;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        /* JADX INFO: renamed from: c */
        public final List<String> m42372c() {
            return this.symptoms;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.id, kVar.id) && AbstractC22676k.m65745e(this.timestamp, kVar.timestamp) && AbstractC22676k.m65745e(this.symptoms, kVar.symptoms) && AbstractC22676k.m65745e(this.notes, kVar.notes);
        }

        public int hashCode() {
            return this.notes.hashCode() + AbstractC11895b.m31983b(AbstractC21702c.m61131b(this.timestamp, this.id.hashCode() * 31, 31), 31, this.symptoms);
        }

        public String toString() {
            String str = this.id;
            Instant instant = this.timestamp;
            List<String> list = this.symptoms;
            String str2 = this.notes;
            StringBuilder sb4 = new StringBuilder("UpdateError(id=");
            sb4.append(str);
            sb4.append(", timestamp=");
            sb4.append(instant);
            sb4.append(", symptoms=");
            return AbstractC38963t7.m124377g(", notes=", str2, ")", sb4, list);
        }
    }
}

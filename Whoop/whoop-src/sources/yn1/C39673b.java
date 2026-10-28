package yn1;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yn1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010$\n\u0002\b\u000b\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\u0016J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\u0016J\u000f\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010\u0016J\u000f\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010\u0016J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0016J\u000f\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u0016J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u0016J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010\u000eJ\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010\u000eJ\u0019\u00100\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0016J!\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b5\u0010\u000eJ\u0017\u00106\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u0010\u000eJ\u0017\u00107\u001a\u00020\b2\u0006\u00102\u001a\u00020\u000bH\u0002¢\u0006\u0004\b7\u0010\u000eJ\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0016J#\u00109\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b9\u00104J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u000bH\u0002¢\u0006\u0004\b;\u0010\u000eJ!\u0010<\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b<\u00104J\u000f\u0010=\u001a\u00020\bH\u0002¢\u0006\u0004\b=\u0010\u0016J\u000f\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010\u0016J]\u0010C\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u000b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010@\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010ER$\u0010J\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010\u000e¨\u0006L"}, m65681d2 = {"Lyn1/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lyn1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "M", "(Lyn1/a;)V", "", "value", "e", "(Ljava/lang/String;)V", "", "opened", "f", "(Z)V", "enabled", "g", "o", "()V", "p", "q", "trimesterId", "x", "t", "d", "j", "label", "s", "z", "A", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "u", "v", "D", "y", "a", "C", "E", "i", "surface", "F", "syncState", "G", "source", "I", "H", "phase", "l", "(Ljava/lang/String;Ljava/lang/String;)V", "K", "B", "J", "k", "L", "category", "m", "r", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "n", "action", "eventName", "", "otherProperties", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lfi0/a;", "Ljava/lang/String;", "getPregInsightsScreenSource", "()Ljava/lang/String;", "N", "pregInsightsScreenSource", "c", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39673b {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final int f170776d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String pregInsightsScreenSource;

    /* JADX INFO: renamed from: yn1.b$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b`\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u0014\u0010\u001f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0014\u0010 \u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\rR\u0014\u0010!\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\rR\u0014\u0010\"\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0014\u0010#\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\rR\u0014\u0010$\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\rR\u0014\u0010%\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\rR\u0014\u0010&\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\rR\u0014\u0010'\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\rR\u0014\u0010(\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\rR\u0014\u0010)\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\rR\u0014\u0010*\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\rR\u0014\u0010+\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\rR\u0014\u0010,\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\rR\u0014\u0010-\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010\rR\u0014\u0010.\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010\rR\u0014\u0010/\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\rR\u0014\u00100\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\rR\u0014\u00101\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\rR\u0014\u00102\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010\rR\u0014\u00103\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010\rR\u0014\u00104\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010\rR\u0014\u00105\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010\rR\u0014\u00106\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010\rR\u0014\u00107\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010\rR\u0014\u00108\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010\rR\u0014\u00109\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010\rR\u0014\u0010:\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010\rR\u0014\u0010;\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010\rR\u0014\u0010=\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010\rR\u0014\u0010>\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010\rR\u0014\u0010?\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u0010\rR\u0014\u0010@\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010\rR\u0014\u0010A\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010\rR\u0014\u0010C\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010\rR\u0014\u0010D\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010\rR\u0014\u0010E\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010\rR\u0014\u0010F\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010\rR\u0014\u0010G\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010\rR\u0014\u0010H\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010\rR\u0014\u0010I\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010\rR\u0014\u0010J\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010\rR\u0014\u0010K\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010\rR\u0014\u0010L\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010\rR\u0014\u0010M\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bM\u0010\rR\u0014\u0010N\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010\rR\u0014\u0010O\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bO\u0010\rR\u0014\u0010P\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010\rR\u0014\u0010Q\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bQ\u0010\rR\u0014\u0010R\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bR\u0010\rR\u0014\u0010S\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bS\u0010\rR\u0014\u0010T\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bT\u0010\rR\u0014\u0010U\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bU\u0010\rR\u0014\u0010V\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bV\u0010\rR\u0014\u0010W\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bW\u0010\rR\u0014\u0010X\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bX\u0010\rR\u0014\u0010Y\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bY\u0010\rR\u0014\u0010Z\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bZ\u0010\rR\u0014\u0010[\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b[\u0010\rR\u0014\u0010\\\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\\\u0010\rR\u0014\u0010]\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b]\u0010\rR\u0014\u0010^\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b^\u0010\rR\u0014\u0010_\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b_\u0010\rR\u0014\u0010`\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b`\u0010\rR\u0014\u0010a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\ba\u0010\rR\u0014\u0010b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bb\u0010\rR\u0014\u0010c\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bc\u0010\r¨\u0006d"}, m65681d2 = {"Lyn1/b$a;", "", "<init>", "()V", "", "phaseId", "b", "(Ljava/lang/String;)Ljava/lang/String;", "segmentId", "c", "title", "a", "CATEGORY_PREGNANCY_COACHING", "Ljava/lang/String;", "EVENT_HI_PREGNANCY", "EVENT_GRAPH", "EVENT_PREGNANCY_SETTINGS", "EVENT_POSTPARTUM_ONBOARDING", "EVENT_POSTPARTUM", "EVENT_HIDE_METRICS", "EVENT_MCI", "EVENT_NATURAL_CYCLES", "EVENT_SETTINGS_HORMONAL_INSIGHTS", "ACTION_TOGGLED", "ACTION_CANCEL", "ACTION_ENABLE", "ACTION_DISABLE", "ACTION_START_ONBOARDING", "ACTION_FINISH_ONBOARDING", "ACTION_LOG_PERIOD", "ACTION_LOG_PERIOD_CALENDAR", "ACTION_VIEW_EDUCATION", "ACTION_CHANGE_PHASE", "ACTION_CHANGE_TAB", "ACTION_VIEW_GRAPH", "ACTION_VIEW_ALL_CYCLES", "ACTION_EDIT_CYCLES", "ACTION_VIEW_SYMPTOMS", "ACTION_LOG_SYMPTOMS", "ACTION_VIEW_ENTRY_POINT", "ACTION_VIEW_STATUS", "ACTION_VIEW_OVERVIEW", "ACTION_LOG_SYMPTOM_DRAWER", "ACTION_VIEW_ONBOARDING_PREDICTIONS", "ACTION_VIEW_POSSIBLE_SYMPTOMS", "ACTION_VIEW_CYCLE_JOURNAL", "ACTION_VIEW_PHASE_GUIDANCE", "ACTION_LOG_SAVE_SYMPTOM", "ACTION_VIEW_SYMPTOM_PATTERNS", "LABEL_ONBOARDING", "LABEL_PHASE_MENSTRUAL", "LABEL_PHASE_FOLLICULAR", "LABEL_PHASE_OVULATORY", "LABEL_PHASE_LUTEAL", "LABEL_CURRENT_CYCLE", "LABEL_LAST_3_MONTHS", "LABEL_SYMPTOMS", "LABEL_PERIOD", "LABEL_OVULATION", "LABEL_FIRST", "LABEL_SECOND", "LABEL_THIRD", "LABEL_PERIOD_TOGGLE", "LABEL_OVULATION_TOGGLE", "LABEL_CYCLE_EDUCATION", "LABEL_CYCLE_STATS", "LABEL_MCI_METRICS_GRAPH", "LABEL_ALL_CYCLES", "LABEL_MCI_SYMPTOMS", "CATEGORY_ONBOARDING", "CATEGORY_MCI_CORE", "CATEGORY_HORMONAL_INSIGHTS", "CATEGORY_MODE", "CATEGORY_CONTRACEPTION_TYPE", "CATEGORY_PRIVACY", "CATEGORY_PREVIOUS_PREGNANCIES", "CATEGORY_NATURAL_CYCLES_DISCOVERY", "CATEGORY_NATURAL_CYCLES_SYNC", "LABEL_TOGGLE_VALUE", "VALUE_CURRENT_TRIMESTER", "VALUE_ALL_TRIMESTERS", "SOURCE", "SOURCE_HOME_SCREEN", "SOURCE_HI_PREGNANCY", "SOURCE_DELIVERY_FLOW", "SOURCE_POSTPARTUM_ONBOARDING", "SOURCE_MCI", "SOURCE_WOMENS_HEALTH", "SOURCE_CYCLE_JOURNAL", "SOURCE_SYMPTOM_PATTERNS", "SOURCE_HOME_PAGE", "SOURCE_YOUR_SYMPTOMS", "SOURCE_JOURNAL", "SOURCE_POSSIBLE_SYMPTOMS_TODAY", "SOURCE_OVERVIEW", "SOURCE_HEALTH_TAB", "SOURCE_NOTIFICATIONS", "CATEGORY_SYMPTOM_DRAWER", "CATEGORY_PHASE_GUIDANCE", "MENSTRUATION", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m126874a(String title) {
            AbstractC22676k.m65750j(title, "title");
            if (title.equalsIgnoreCase("Symptoms")) {
                return "Symptoms";
            }
            if (title.equalsIgnoreCase("Period")) {
                return "Period";
            }
            if (title.equalsIgnoreCase("Ovulation")) {
                return "Ovulation";
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final String m126875b(String phaseId) {
            AbstractC22676k.m65750j(phaseId, "phaseId");
            String upperCase = phaseId.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            switch (upperCase) {
                case "LUTEAL":
                    return "L";
                case "FOLLICULAR":
                    return "F";
                case "OVULATORY":
                    return "O";
                case "MENSTRUAL":
                    return "M";
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final String m126876c(String segmentId) {
            AbstractC22676k.m65750j(segmentId, "segmentId");
            if (segmentId.equals("CURRENT_CYCLE")) {
                return "current_cycle";
            }
            if (segmentId.equals("LAST_THREE_CYCLES")) {
                return "last_3_months";
            }
            if (AbstractC39421y.m125920E(segmentId, "FIRST_TRIMESTER", false)) {
                return "1st";
            }
            if (AbstractC39421y.m125920E(segmentId, "SECOND_TRIMESTER", false)) {
                return "2nd";
            }
            if (AbstractC39421y.m125920E(segmentId, "THIRD_TRIMESTER", false)) {
                return "3rd";
            }
            return null;
        }

        private Companion() {
        }
    }

    public C39673b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: A */
    private final void m126834A() {
        m126848c(this, "mci_core", "view_education", "cycle_education", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: B */
    private final void m126835B(String label) {
        m126848c(this, "mci_core", "view_cycle_journal", label, "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: C */
    private final void m126836C() {
        m126848c(this, "mci_core", "view_education", "cycle_stats", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: D */
    private final void m126837D() {
        m126848c(this, "mci_core", "view_education", "mci_metrics_graph", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: E */
    private final void m126838E() {
        m126848c(this, "mci_core", "view_symptoms", "mci_symptoms", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: F */
    private final void m126839F(String surface) {
        m126848c(this, "natural_cycles_discovery", "view_entry_point", surface, "Natural Cycles", null, AbstractC31061c.m95645u("source", "womens_health"), 16, null);
    }

    /* JADX INFO: renamed from: G */
    private final void m126840G(String syncState) {
        m126848c(this, "natural_cycles_sync", "view_status", syncState, "Natural Cycles", null, AbstractC31061c.m95645u("source", "womens_health"), 16, null);
    }

    /* JADX INFO: renamed from: H */
    private final void m126841H() {
        m126848c(this, "mci_core", "view_onboarding_predictions", null, "MCI", null, AbstractC31061c.m95645u("source", "mci"), 20, null);
    }

    /* JADX INFO: renamed from: I */
    private final void m126842I(String source) {
        m126848c(this, "mci_core", "view_overview", null, "MCI", null, source != null ? AbstractC31061c.m95645u("source", source) : null, 20, null);
    }

    /* JADX INFO: renamed from: J */
    private final void m126843J(String phase) {
        m126848c(this, "phase_guidance", "view_phase_guidance", phase, "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: K */
    private final void m126844K(String label) {
        m126848c(this, "mci_core", "view_possible_symptoms", label, "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: L */
    private final void m126845L(String source, String label) {
        m126848c(this, "mci_core", "view_symptom_patterns", label, "MCI", null, source != null ? AbstractC31061c.m95645u("source", source) : null, 16, null);
    }

    /* JADX INFO: renamed from: a */
    private final void m126846a() {
        m126848c(this, "mci_core", "edit_cycles", "all_cycles", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: b */
    private final void m126847b(String category, String action, String label, String eventName, String value, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41422d(category, action, label, eventName, value, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m126848c(C39673b c39673b, String str, String str2, String str3, String str4, String str5, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "Pregnancy Coaching";
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        c39673b.m126847b(str, str2, str3, str4, str5, (i13 & 32) != 0 ? null : map);
    }

    /* JADX INFO: renamed from: d */
    private final void m126849d() {
        m126848c(this, "onboarding", "finish_onboarding", "onboarding", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m126850e(String value) {
        m126848c(this, null, "Toggled", "Toggle Value", "Graph", value, null, 33, null);
    }

    /* JADX INFO: renamed from: f */
    private final void m126851f(boolean opened) {
        m126848c(this, null, opened ? "Open" : "Cancel", null, "Postpartum - Onboarding", null, AbstractC31061c.m95645u("source", "Delivery Flow"), 21, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m126852g(boolean enabled) {
        m126848c(this, null, enabled ? "Enable" : "Disable", null, "Hide Metrics", null, AbstractC31061c.m95645u("source", "Postpartum Onboarding"), 21, null);
    }

    /* JADX INFO: renamed from: h */
    private final void m126853h() {
        m126848c(this, "hormonal_insights", "Open", null, "Settings - Hormonal Insights", null, null, 52, null);
    }

    /* JADX INFO: renamed from: i */
    private final void m126854i() {
        m126848c(this, "mci_core", "log_symptoms", "mci_symptoms", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: j */
    private final void m126855j() {
        m126848c(this, "mci_core", "log_period", "period_toggle", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: k */
    private final void m126856k() {
        m126848c(this, "symptom_drawer", "log_save_symptom", null, "MCI", null, AbstractC31061c.m95645u("source", "mci"), 20, null);
    }

    /* JADX INFO: renamed from: l */
    private final void m126857l(String phase, String source) {
        m126848c(this, "mci_core", "log_symptoms", phase, "MCI", null, source != null ? AbstractC31061c.m95645u("source", source) : null, 16, null);
    }

    /* JADX INFO: renamed from: m */
    private final void m126858m(String category) {
        m126848c(this, category, "Open", null, "Settings - Hormonal Insights", null, null, 52, null);
    }

    /* JADX INFO: renamed from: n */
    private final void m126859n() {
        m126848c(this, "privacy", "Open", null, "Settings - Hormonal Insights", null, null, 52, null);
    }

    /* JADX INFO: renamed from: o */
    private final void m126860o() {
        m126848c(this, null, "Open", null, "Postpartum", null, null, 53, null);
    }

    /* JADX INFO: renamed from: p */
    private final void m126861p() {
        String str = this.pregInsightsScreenSource;
        if (str != null) {
            m126848c(this, null, "Open", null, "HI - Pregnancy", null, AbstractC31061c.m95645u("source", str), 21, null);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m126862q() {
        m126848c(this, null, "Open", null, "Pregnancy Settings", null, AbstractC31061c.m95645u("source", "HI Pregnancy"), 21, null);
    }

    /* JADX INFO: renamed from: r */
    private final void m126863r(String category, String value) {
        m126848c(this, category, "Save", value, "Settings - Hormonal Insights", null, null, 48, null);
    }

    /* JADX INFO: renamed from: s */
    private final void m126864s(String label) {
        m126848c(this, "mci_core", "log_period", AbstractC22676k.m65745e(label, "MENSTRUATION") ? "period_toggle" : "ovulation_toggle", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: t */
    private final void m126865t() {
        m126848c(this, "onboarding", "start_onboarding", "onboarding", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: u */
    private final void m126866u() {
        m126848c(this, "mci_core", "change_tab", "cycle_education", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: v */
    private final void m126867v() {
        m126848c(this, "mci_core", "view_graph", "mci_metrics_graph", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: w */
    private final void m126868w() {
        m126848c(this, "mci_core", "change_phase", "cycle_education", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: x */
    private final void m126869x(String trimesterId) {
        m126850e(AbstractC22676k.m65745e(trimesterId, "CURRENT") ? "Current Trimester" : "All Trimesters");
    }

    /* JADX INFO: renamed from: y */
    private final void m126870y() {
        m126848c(this, "mci_core", "view_all_cycles", "all_cycles", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: z */
    private final void m126871z() {
        m126848c(this, "mci_core", "log_period_calendar", "period_toggle", "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m126872M(AbstractC39672a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC39672a.d) {
            m126850e(((AbstractC39672a.d) event).getValue());
            return;
        }
        if (event instanceof AbstractC39672a.e) {
            m126851f(((AbstractC39672a.e) event).getOpened());
            return;
        }
        if (event instanceof AbstractC39672a.f) {
            m126852g(((AbstractC39672a.f) event).getEnabled());
            return;
        }
        if (event.equals(AbstractC39672a.p.f170764a)) {
            m126860o();
            return;
        }
        if (event instanceof AbstractC39672a.x) {
            m126869x(((AbstractC39672a.x) event).getTrimesterId());
            return;
        }
        if (event instanceof AbstractC39672a.l0) {
            m126861p();
            return;
        }
        if (event.equals(AbstractC39672a.m0.f170759a)) {
            m126862q();
            return;
        }
        if (event.equals(AbstractC39672a.b.f170735a)) {
            m126846a();
            return;
        }
        if (event.equals(AbstractC39672a.c.f170737a)) {
            m126849d();
            return;
        }
        if (event.equals(AbstractC39672a.g.f170745a)) {
            m126854i();
            return;
        }
        if (event.equals(AbstractC39672a.h.f170747a)) {
            m126855j();
            return;
        }
        if (event.equals(AbstractC39672a.k.f170754a)) {
            m126858m("contraception_type");
            return;
        }
        if (event.equals(AbstractC39672a.l.f170756a)) {
            m126853h();
            return;
        }
        if (event.equals(AbstractC39672a.m.f170758a)) {
            m126858m("mode");
            return;
        }
        if (event.equals(AbstractC39672a.n.f170760a)) {
            m126858m("previous_pregnancies");
            return;
        }
        if (event.equals(AbstractC39672a.o.f170763a)) {
            m126859n();
            return;
        }
        if (event instanceof AbstractC39672a.q) {
            m126863r("contraception_type", ((AbstractC39672a.q) event).getValue());
            return;
        }
        if (event instanceof AbstractC39672a.r) {
            m126863r("mode", ((AbstractC39672a.r) event).getValue());
            return;
        }
        if (event instanceof AbstractC39672a.s) {
            m126864s(((AbstractC39672a.s) event).getType());
            return;
        }
        if (event.equals(AbstractC39672a.t.f170768a)) {
            m126865t();
            return;
        }
        if (event.equals(AbstractC39672a.u.f170769a)) {
            m126866u();
            return;
        }
        if (event.equals(AbstractC39672a.v.f170770a)) {
            m126867v();
            return;
        }
        if (event.equals(AbstractC39672a.w.f170771a)) {
            m126868w();
            return;
        }
        if (event.equals(AbstractC39672a.y.f170773a)) {
            m126870y();
            return;
        }
        if (event.equals(AbstractC39672a.z.f170774a)) {
            m126871z();
            return;
        }
        if (event.equals(AbstractC39672a.a0.f170734a)) {
            m126834A();
            return;
        }
        if (event.equals(AbstractC39672a.c0.f170738a)) {
            m126836C();
            return;
        }
        if (event.equals(AbstractC39672a.d0.f170740a)) {
            m126837D();
            return;
        }
        if (event.equals(AbstractC39672a.e0.f170742a)) {
            m126838E();
            return;
        }
        if (event instanceof AbstractC39672a.f0) {
            m126839F(((AbstractC39672a.f0) event).getSurface());
            return;
        }
        if (event instanceof AbstractC39672a.g0) {
            m126840G(((AbstractC39672a.g0) event).getSyncState());
            return;
        }
        if (event instanceof AbstractC39672a.i0) {
            m126842I(((AbstractC39672a.i0) event).getSource());
            return;
        }
        if (event.equals(AbstractC39672a.h0.f170748a)) {
            m126841H();
            return;
        }
        if (event instanceof AbstractC39672a.j) {
            AbstractC39672a.j jVar = (AbstractC39672a.j) event;
            m126857l(jVar.getPhaseLabel(), jVar.getSource());
            return;
        }
        if (event instanceof AbstractC39672a.k0) {
            m126844K(((AbstractC39672a.k0) event).getLabel());
            return;
        }
        if (event instanceof AbstractC39672a.b0) {
            m126835B(((AbstractC39672a.b0) event).getLabel());
            return;
        }
        if (event instanceof AbstractC39672a.j0) {
            m126843J(((AbstractC39672a.j0) event).getPhaseLabel());
            return;
        }
        if (event.equals(AbstractC39672a.i.f170749a)) {
            m126856k();
            return;
        }
        if (event instanceof AbstractC39672a.n0) {
            AbstractC39672a.n0 n0Var = (AbstractC39672a.n0) event;
            m126845L(n0Var.getSource(), n0Var.getLabel());
        } else {
            if (!(event instanceof AbstractC39672a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticEventModel analyticEvent = ((AbstractC39672a.a) event).getAnalyticEvent();
            this.analytics.mo41422d(analyticEvent.getCategory(), analyticEvent.getAction(), analyticEvent.getLabel(), analyticEvent.getName(), analyticEvent.getValue(), AbstractC31061c.m95645u("source", analyticEvent.getSource()));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m126873N(String str) {
        this.pregInsightsScreenSource = str;
    }
}

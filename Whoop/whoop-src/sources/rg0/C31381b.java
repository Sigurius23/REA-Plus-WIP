package rg0;

import androidx.core.app.NotificationCompat;
import com.whoop.metrics.domain.models.MetricPostType;
import fi0.InterfaceC14515a;
import ih0.InterfaceC18484b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.Map;
import jy1.C22047a;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25271y;
import n83.C26463f;
import or2.AbstractC28182m1;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import u02.InterfaceC34385a;
import xk0.C38425c;
import y82.EnumC39339b;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: rg0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00142\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010 2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u0010.J\u0017\u00101\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0014H\u0002¢\u0006\u0004\bH\u0010.J\u0017\u0010J\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bL\u0010.J\u0017\u0010N\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\\H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020_H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020bH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020eH\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020hH\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020kH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020nH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020qH\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020tH\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010x\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020wH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020zH\u0002¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020}H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0081\u0001\u001a\u00020\u00142\u0007\u0010\u001d\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00142\u0007\u0010\u001d\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u0086\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0087\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u0088\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010\u0089\u0001R\u0015\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010\u0089\u0001R\u0015\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bT\u0010\u0089\u0001R\u0015\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010\u0089\u0001R\u0015\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\br\u0010\u0089\u0001R\u0015\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010\u0089\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0007\n\u0005\bu\u0010\u0089\u0001R#\u0010\u008d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030\u008b\u00010 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010\u008c\u0001¨\u0006\u008e\u0001"}, m65681d2 = {"Lrg0/b;", "", "Lfi0/a;", "analytics", "Liy1/c;", "metricWriter", "Lrg0/d;", "formWidgetAnalyticsHelper", "", "sourcePillar", "sourceType", "presetQuestion", "sourceId", "source", "entrypointExperience", "<init>", "(Lfi0/a;Liy1/c;Lrg0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lu02/a$b;", "error", "context", "Ll83/a0;", "b", "(Lu02/a$b;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "c", "(Ljava/lang/Exception;Ljava/lang/String;)V", "Lrg0/a;", NotificationCompat.CATEGORY_EVENT, "a", "(Lrg0/a;)V", "", "properties", "M", "(Ljava/util/Map;)Ljava/util/Map;", "Lrg0/a$u;", "x", "(Lrg0/a$u;)V", "Lrg0/a$a;", "d", "(Lrg0/a$a;)V", "Lrg0/a$t;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lrg0/a$t;)V", "p", "()V", "o", "Lrg0/a$d;", "g", "(Lrg0/a$d;)V", "Lrg0/a$b;", "e", "(Lrg0/a$b;)V", "Lrg0/a$i;", "l", "(Lrg0/a$i;)V", "Lrg0/a$j;", "m", "(Lrg0/a$j;)V", "Lrg0/a$k;", "n", "(Lrg0/a$k;)V", "Lrg0/a$v;", "y", "(Lrg0/a$v;)V", "Lrg0/a$h;", "k", "(Lrg0/a$h;)V", "Lrg0/a$z;", "C", "(Lrg0/a$z;)V", "D", "Lrg0/a$c0;", "F", "(Lrg0/a$c0;)V", "H", "Lrg0/a$g0;", "J", "(Lrg0/a$g0;)V", "Lrg0/a$h0;", "K", "(Lrg0/a$h0;)V", "Lrg0/a$c;", "f", "(Lrg0/a$c;)V", "Lrg0/a$i0;", "L", "(Lrg0/a$i0;)V", "Lrg0/a$b0;", "E", "(Lrg0/a$b0;)V", "Lrg0/a$f0;", "I", "(Lrg0/a$f0;)V", "Lrg0/a$w;", "z", "(Lrg0/a$w;)V", "Lrg0/a$f;", "i", "(Lrg0/a$f;)V", "Lrg0/a$s;", "v", "(Lrg0/a$s;)V", "Lrg0/a$y;", "B", "(Lrg0/a$y;)V", "Lrg0/a$x;", "A", "(Lrg0/a$x;)V", "Lrg0/a$d0;", "G", "(Lrg0/a$d0;)V", "Lrg0/a$e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lrg0/a$e;)V", "Lrg0/a$g;", "j", "(Lrg0/a$g;)V", "Lrg0/a$p;", "s", "(Lrg0/a$p;)V", "Lrg0/a$n;", "q", "(Lrg0/a$n;)V", "Lrg0/a$q;", "t", "(Lrg0/a$q;)V", "Lrg0/a$r;", "u", "(Lrg0/a$r;)V", "Lrg0/a$o;", "r", "(Lrg0/a$o;)V", "Lfi0/a;", "Liy1/c;", "Lrg0/d;", "Ljava/lang/String;", "isPresetKey", "", "Ljava/util/Map;", "isChatV2Properties", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31381b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31383d formWidgetAnalyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String sourcePillar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String sourceType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String presetQuestion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String sourceId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String entrypointExperience;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String isPresetKey;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Map<String, Boolean> isChatV2Properties;

    public C31381b(InterfaceC14515a analytics, InterfaceC21030c metricWriter, C31383d formWidgetAnalyticsHelper, String sourcePillar, String sourceType, String presetQuestion, String sourceId, String source, String entrypointExperience) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(formWidgetAnalyticsHelper, "formWidgetAnalyticsHelper");
        AbstractC22676k.m65750j(sourcePillar, "sourcePillar");
        AbstractC22676k.m65750j(sourceType, "sourceType");
        AbstractC22676k.m65750j(presetQuestion, "presetQuestion");
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(entrypointExperience, "entrypointExperience");
        this.analytics = analytics;
        this.metricWriter = metricWriter;
        this.formWidgetAnalyticsHelper = formWidgetAnalyticsHelper;
        this.sourcePillar = sourcePillar;
        this.sourceType = sourceType;
        this.presetQuestion = presetQuestion;
        this.sourceId = sourceId;
        this.source = source;
        this.entrypointExperience = entrypointExperience;
        this.isPresetKey = "is_preset";
        this.isChatV2Properties = AbstractC36095b.m114688p(Boolean.TRUE, "is_chat_v2");
    }

    /* JADX INFO: renamed from: A */
    private final void m96584A(AbstractC31380a.x event) {
        C26463f c26463f = new C26463f();
        c26463f.put("fingerprint", event.getFingerprint());
        String fileType = event.getFileType();
        if (fileType != null) {
            c26463f.put("file_type", fileType);
        }
        String error = event.getError();
        if (error != null) {
            c26463f.put("error", error);
        }
        this.analytics.mo41422d(event.getRole(), "message_failure", event.getMessageType(), "AI Coach", event.getFailureReason(), m96596M(c26463f.m78380b()));
    }

    /* JADX INFO: renamed from: B */
    private final void m96585B(AbstractC31380a.y event) {
        InterfaceC14515a.m41418i(this.analytics, null, "MS Link Clicked", null, "AI Coach", null, m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())), 21, null);
    }

    /* JADX INFO: renamed from: C */
    private final void m96586C(AbstractC31380a.z event) {
        InterfaceC14515a.m41418i(this.analytics, null, "network_failure", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("failure_type", event.getFailureType().getAnalyticsString()), new C23465k("context", event.getContext()))), 21, null);
    }

    /* JADX INFO: renamed from: D */
    private final void m96587D() {
        String strM85299a = this.source;
        if (strM85299a.length() == 0) {
            strM85299a = AbstractC28182m1.m85299a(this.sourcePillar);
        }
        InterfaceC14515a.m41418i(this.analytics, null, "Open", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("source", strM85299a), new C23465k("source_type", this.sourceType), new C23465k("preset question type", this.presetQuestion))), 21, null);
        if (this.presetQuestion.length() > 0) {
            InterfaceC14515a interfaceC14515a = this.analytics;
            String str = this.source;
            if (str.length() == 0) {
                str = this.sourceId;
            }
            InterfaceC14515a.m41418i(interfaceC14515a, null, "bot_response", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("source", str), new C23465k(this.isPresetKey, Boolean.TRUE), new C23465k("preset question type", this.presetQuestion))), 21, null);
        }
        InterfaceC14515a interfaceC14515a2 = this.analytics;
        C26463f c26463f = new C26463f();
        String str2 = this.source;
        if (str2.length() == 0) {
            str2 = this.sourceId;
        }
        c26463f.put("source", str2);
        c26463f.put("source_type", this.sourceType);
        c26463f.put(AbstractC39421y.m125926K("preset question type", " ", "_", false), this.presetQuestion);
        c26463f.put("agent_id", this.sourceId);
        if (this.entrypointExperience.length() > 0) {
            c26463f.put("entrypoint_experience", this.entrypointExperience);
        }
        InterfaceC14515a.m41418i(interfaceC14515a2, "Chat Entry", "Chat Entered", null, "AI Coach", null, m96596M(c26463f.m78380b()), 20, null);
    }

    /* JADX INFO: renamed from: E */
    private final void m96588E(AbstractC31380a.b0 event) {
        InterfaceC14515a.m41418i(this.analytics, null, "Accessed Old Conversation", null, "AI Coach", null, m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())), 21, null);
    }

    /* JADX INFO: renamed from: F */
    private final void m96589F(AbstractC31380a.c0 event) {
        this.analytics.mo41422d(event.getRole(), "retry_pressed", event.getMessageType(), "AI Coach", event.getFailureReason(), this.isChatV2Properties);
    }

    /* JADX INFO: renamed from: G */
    private final void m96590G(AbstractC31380a.d0 event) {
        InterfaceC14515a.m41418i(this.analytics, null, "Retry View Shown", null, "AI Coach", null, m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())), 21, null);
        this.metricWriter.mo58701b(new C22047a(0, "whoop.ai.conversation.retry_view_shown", null, C25271y.f99162w, MetricPostType.COUNT, 5, null));
    }

    /* JADX INFO: renamed from: H */
    private final void m96591H() {
        InterfaceC14515a.m41418i(this.analytics, null, "Start New Conversation", null, "AI Coach", null, this.isChatV2Properties, 21, null);
    }

    /* JADX INFO: renamed from: I */
    private final void m96592I(AbstractC31380a.f0 event) {
        InterfaceC14515a.m41418i(this.analytics, null, "Stop Generating", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("fingerprint", event.getFingerprint()), new C23465k("message_id", event.getMessageId()))), 21, null);
    }

    /* JADX INFO: renamed from: J */
    private final void m96593J(AbstractC31380a.g0 event) {
        String strM85299a = this.source;
        if (strM85299a.length() == 0) {
            strM85299a = AbstractC28182m1.m85299a(this.sourcePillar);
        }
        InterfaceC14515a.m41418i(this.analytics, null, "Suggestion Selected", String.valueOf(event.getIndex()), "AI Coach", String.valueOf(event.getMessageCount()), m96596M(AbstractC25247g0.m73990Y(new C23465k("source", strM85299a), new C23465k("source_type", this.sourceType), new C23465k("fingerprint", event.getFingerprint()))), 1, null);
    }

    /* JADX INFO: renamed from: K */
    private final void m96594K(AbstractC31380a.h0 event) {
        String strM85299a = this.source;
        if (strM85299a.length() == 0) {
            strM85299a = AbstractC28182m1.m85299a(this.sourcePillar);
        }
        InterfaceC14515a.m41418i(this.analytics, null, "Suggestions Shown", null, "AI Coach", String.valueOf(event.getSuggestionCount()), m96596M(AbstractC25247g0.m73990Y(new C23465k("source", strM85299a), new C23465k("source_type", this.sourceType), new C23465k("fingerprint", event.getFingerprint()))), 5, null);
    }

    /* JADX INFO: renamed from: L */
    private final void m96595L(AbstractC31380a.i0 event) {
        InterfaceC14515a.m41418i(this.analytics, null, "uncommit_activity", event.getTitle(), "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("fingerprint", event.getFingerprint()), new C23465k("source", event.getFromGhostTile() ? "ghost_tile_coach" : null))), 17, null);
    }

    /* JADX INFO: renamed from: M */
    private final Map<String, Object> m96596M(Map<String, ? extends Object> properties) {
        return AbstractC25247g0.m73995d0(properties, this.isChatV2Properties);
    }

    /* JADX INFO: renamed from: d */
    private final void m96597d(AbstractC31380a.a event) {
        InterfaceC14515a.m41418i(this.analytics, null, "attachment_retry", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("fingerprint", event.getFingerprint()), new C23465k("file_type", event.getFileType()))), 21, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m96598e(AbstractC31380a.b event) {
        InterfaceC14515a.m41418i(this.analytics, null, "Bot Response", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("agent_id", this.sourceId), new C23465k("fingerprint", event.getFingerprint()), new C23465k("message_id", event.getMessageId()))), 21, null);
    }

    /* JADX INFO: renamed from: f */
    private final void m96599f(AbstractC31380a.c event) {
        InterfaceC14515a.m41418i(this.analytics, null, "commit_activity", event.getTitle(), "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("fingerprint", event.getFingerprint()), new C23465k("source", event.getFromGhostTile() ? "ghost_tile_coach" : null))), 17, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m96600g(AbstractC31380a.d event) {
        InterfaceC14515a.m41418i(this.analytics, null, "Opened History", null, "AI Coach", null, m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())), 21, null);
    }

    /* JADX INFO: renamed from: h */
    private final void m96601h(AbstractC31380a.e event) {
        InterfaceC14515a.m41418i(this.analytics, null, "conversation_time", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("fingerprint", event.getFingerprint()), new C23465k("duration_ms", Long.valueOf(event.getDurationMs())))), 21, null);
    }

    /* JADX INFO: renamed from: i */
    private final void m96602i(AbstractC31380a.f event) {
        InterfaceC14515a.m41418i(this.analytics, null, "Deleted Conversation", null, "AI Coach", null, m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())), 21, null);
    }

    /* JADX INFO: renamed from: j */
    private final void m96603j(AbstractC31380a.g event) {
        InterfaceC14515a.m41418i(this.analytics, null, "disabled_input_tapped", null, "AI Coach", null, m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())), 21, null);
        this.metricWriter.mo58701b(new C22047a(0, "whoop.ai.conversation.disabled_input_tapped", null, C25271y.f99162w, MetricPostType.COUNT, 5, null));
    }

    /* JADX INFO: renamed from: k */
    private final void m96604k(AbstractC31380a.h event) {
        InterfaceC14515a.m41418i(this.analytics, null, "empty_message_sent", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("raw_character_count", Integer.valueOf(event.getRawCharacterCount())), new C23465k("is_whitespace_only", Boolean.valueOf(event.getIsWhitespaceOnly())), new C23465k("send_source", event.getSendSource()))), 21, null);
    }

    /* JADX INFO: renamed from: l */
    private final void m96605l(AbstractC31380a.i event) {
        InterfaceC14515a.m41418i(this.analytics, null, "Error Message Displayed", null, "AI Coach", event.getIo.getstream.chat.android.models.MessageType.FAILED java.lang.String() ? EnumC39339b.RESULT_FAILURE : "Slow", m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())), 5, null);
    }

    /* JADX INFO: renamed from: m */
    private final void m96606m(AbstractC31380a.j event) {
        this.analytics.mo41428k(event.getLastFailureType() == null ? "no_failures" : "had_failure", "exit", event.getLastFailureType(), "AI Coach", m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())));
    }

    /* JADX INFO: renamed from: n */
    private final void m96607n(AbstractC31380a.k event) {
        InterfaceC14515a interfaceC14515a = this.analytics;
        String strValueOf = String.valueOf(event.getTimeWaitedMs());
        C26463f c26463f = new C26463f();
        c26463f.put("fingerprint", event.getFingerprint());
        String str = this.source;
        if (str.length() == 0) {
            str = this.sourceId;
        }
        c26463f.put("source", str);
        c26463f.put("source_type", this.sourceType);
        c26463f.put("agent_id", this.sourceId);
        if (this.entrypointExperience.length() > 0) {
            c26463f.put("entrypoint_experience", this.entrypointExperience);
        }
        interfaceC14515a.mo41422d("latency_abandon", "exit", "coach_latency", "AI Coach", strValueOf, m96596M(c26463f.m78380b()));
    }

    /* JADX INFO: renamed from: o */
    private final void m96608o() {
        InterfaceC14515a.m41418i(this.analytics, null, "file_size_limit_exceeded", null, "AI Coach", null, this.isChatV2Properties, 21, null);
    }

    /* JADX INFO: renamed from: p */
    private final void m96609p() {
        InterfaceC14515a.m41418i(this.analytics, null, "file_upload", null, "AI Coach", null, this.isChatV2Properties, 21, null);
    }

    /* JADX INFO: renamed from: q */
    private final void m96610q(AbstractC31380a.n event) {
        C31383d.m96638c(this.formWidgetAnalyticsHelper, new InterfaceC18484b.a(event.getFormId(), event.getFormKey(), event.getVersion()), event.getFingerprint(), false, 4, null);
    }

    /* JADX INFO: renamed from: r */
    private final void m96611r(AbstractC31380a.o event) {
        C31383d.m96638c(this.formWidgetAnalyticsHelper, new InterfaceC18484b.b(event.getFormId(), event.getFormKey(), event.getVersion(), event.getErrorType()), event.getFingerprint(), false, 4, null);
    }

    /* JADX INFO: renamed from: s */
    private final void m96612s(AbstractC31380a.p event) {
        C31383d.m96638c(this.formWidgetAnalyticsHelper, new InterfaceC18484b.c(event.getFormId(), event.getFormKey(), event.getVersion(), event.getQuestionId(), event.getOptionId()), event.getFingerprint(), false, 4, null);
    }

    /* JADX INFO: renamed from: t */
    private final void m96613t(AbstractC31380a.q event) {
        C31383d.m96638c(this.formWidgetAnalyticsHelper, new InterfaceC18484b.d(event.getFormId(), event.getFormKey(), event.getVersion(), event.getSelectedOptionId()), event.getFingerprint(), false, 4, null);
    }

    /* JADX INFO: renamed from: u */
    private final void m96614u(AbstractC31380a.r event) {
        C31383d.m96638c(this.formWidgetAnalyticsHelper, new InterfaceC18484b.e(event.getFormId(), event.getFormKey(), event.getVersion()), event.getFingerprint(), false, 4, null);
    }

    /* JADX INFO: renamed from: v */
    private final void m96615v(AbstractC31380a.s event) {
        InterfaceC14515a.m41418i(this.analytics, null, "image_deleted", event.getUploadState(), "AI Coach", null, m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())), 17, null);
    }

    /* JADX INFO: renamed from: w */
    private final void m96616w(AbstractC31380a.t event) {
        InterfaceC14515a.m41418i(this.analytics, null, "image_upload", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("fingerprint", event.getFingerprint()), new C23465k("input_type", event.getInputType()))), 21, null);
        this.metricWriter.mo58701b(new C22047a(0, "whoop.ai.conversation.image_upload", null, AbstractC31061c.m95644t("input_type:", event.getInputType()), MetricPostType.COUNT, 5, null));
    }

    /* JADX INFO: renamed from: x */
    private final void m96617x(AbstractC31380a.u event) {
        InterfaceC14515a.m41418i(this.analytics, null, "image_upload_success", null, "AI Coach", null, m96596M(AbstractC25247g0.m73990Y(new C23465k("fingerprint", event.getFingerprint()), new C23465k("file_type", event.getFileType()))), 21, null);
        this.metricWriter.mo58701b(new C22047a(0, "whoop.ai.conversation.image_upload_success", null, C25271y.f99162w, MetricPostType.COUNT, 5, null));
    }

    /* JADX INFO: renamed from: y */
    private final void m96618y(AbstractC31380a.v event) {
        String strM85299a = this.source;
        if (strM85299a.length() == 0) {
            strM85299a = AbstractC28182m1.m85299a(this.sourcePillar);
        }
        InterfaceC14515a.m41418i(this.analytics, null, "Member Response", null, "AI Coach", String.valueOf(event.getMessageCount()), m96596M(AbstractC25247g0.m73990Y(new C23465k("source", strM85299a), new C23465k("source_type", this.sourceType), new C23465k("message_id", event.getMessageId()), new C23465k("input-type", event.getIsVoiceInput() ? "push_to_talk" : "text"), new C23465k("fingerprint", event.getFingerprint()), new C23465k("is_suggestion", Boolean.valueOf(event.getIsSuggestion())))), 5, null);
    }

    /* JADX INFO: renamed from: z */
    private final void m96619z(AbstractC31380a.w event) {
        InterfaceC14515a.m41418i(this.analytics, null, "Message Copied", null, "AI Coach", null, m96596M(AbstractC31061c.m95645u("fingerprint", event.getFingerprint())), 21, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m96620a(AbstractC31380a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC31380a.b) {
            m96598e((AbstractC31380a.b) event);
            return;
        }
        if (event instanceof AbstractC31380a.i) {
            m96605l((AbstractC31380a.i) event);
            return;
        }
        if (event instanceof AbstractC31380a.j) {
            m96606m((AbstractC31380a.j) event);
            return;
        }
        if (event instanceof AbstractC31380a.k) {
            m96607n((AbstractC31380a.k) event);
            return;
        }
        if (event instanceof AbstractC31380a.v) {
            m96618y((AbstractC31380a.v) event);
            return;
        }
        if (event instanceof AbstractC31380a.h) {
            m96604k((AbstractC31380a.h) event);
            return;
        }
        if (event instanceof AbstractC31380a.z) {
            m96586C((AbstractC31380a.z) event);
            return;
        }
        if (event instanceof AbstractC31380a.a0) {
            m96587D();
            return;
        }
        if (event instanceof AbstractC31380a.c0) {
            m96589F((AbstractC31380a.c0) event);
            return;
        }
        if (event instanceof AbstractC31380a.e0) {
            m96591H();
            return;
        }
        if (event instanceof AbstractC31380a.g0) {
            m96593J((AbstractC31380a.g0) event);
            return;
        }
        if (event instanceof AbstractC31380a.h0) {
            m96594K((AbstractC31380a.h0) event);
            return;
        }
        if (event instanceof AbstractC31380a.c) {
            m96599f((AbstractC31380a.c) event);
            return;
        }
        if (event instanceof AbstractC31380a.i0) {
            m96595L((AbstractC31380a.i0) event);
            return;
        }
        if (event instanceof AbstractC31380a.d) {
            m96600g((AbstractC31380a.d) event);
            return;
        }
        if (event instanceof AbstractC31380a.u) {
            m96617x((AbstractC31380a.u) event);
            return;
        }
        if (event instanceof AbstractC31380a.a) {
            m96597d((AbstractC31380a.a) event);
            return;
        }
        if (event instanceof AbstractC31380a.t) {
            m96616w((AbstractC31380a.t) event);
            return;
        }
        if (event instanceof AbstractC31380a.m) {
            m96609p();
            return;
        }
        if (event instanceof AbstractC31380a.l) {
            m96608o();
            return;
        }
        if (event instanceof AbstractC31380a.b0) {
            m96588E((AbstractC31380a.b0) event);
            return;
        }
        if (event instanceof AbstractC31380a.f0) {
            m96592I((AbstractC31380a.f0) event);
            return;
        }
        if (event instanceof AbstractC31380a.w) {
            m96619z((AbstractC31380a.w) event);
            return;
        }
        if (event instanceof AbstractC31380a.f) {
            m96602i((AbstractC31380a.f) event);
            return;
        }
        if (event instanceof AbstractC31380a.s) {
            m96615v((AbstractC31380a.s) event);
            return;
        }
        if (event instanceof AbstractC31380a.y) {
            m96585B((AbstractC31380a.y) event);
            return;
        }
        if (event instanceof AbstractC31380a.x) {
            m96584A((AbstractC31380a.x) event);
            return;
        }
        if (event instanceof AbstractC31380a.d0) {
            m96590G((AbstractC31380a.d0) event);
            return;
        }
        if (event instanceof AbstractC31380a.e) {
            m96601h((AbstractC31380a.e) event);
            return;
        }
        if (event instanceof AbstractC31380a.g) {
            m96603j((AbstractC31380a.g) event);
            return;
        }
        if (event instanceof AbstractC31380a.p) {
            m96612s((AbstractC31380a.p) event);
            return;
        }
        if (event instanceof AbstractC31380a.n) {
            m96610q((AbstractC31380a.n) event);
            return;
        }
        if (event instanceof AbstractC31380a.q) {
            m96613t((AbstractC31380a.q) event);
        } else if (event instanceof AbstractC31380a.r) {
            m96614u((AbstractC31380a.r) event);
        } else {
            if (!(event instanceof AbstractC31380a.o)) {
                throw new NoWhenBranchMatchedException();
            }
            m96611r((AbstractC31380a.o) event);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m96621b(InterfaceC34385a.b<?> error, String context) {
        AbstractC22676k.m65750j(error, "error");
        AbstractC22676k.m65750j(context, "context");
        m96620a(new AbstractC31380a.z(C38425c.f164569a.m123103c(error), context));
    }

    /* JADX INFO: renamed from: c */
    public final void m96622c(Exception exception, String context) {
        AbstractC22676k.m65750j(exception, "exception");
        AbstractC22676k.m65750j(context, "context");
        m96620a(new AbstractC31380a.z(C38425c.f164569a.m123101a(exception), context));
    }
}

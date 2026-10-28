package j02;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.data.remote.domain.response.growth.CheckoutOrigin;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.GenericCachePolicy;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsApiKt;
import com.whoop.profile.domain.ProfileApiKt;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.json.JsonElement;
import m83.C25272z;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p114eb.C12997x0;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: j02.m0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000÷\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\bº\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:÷\u0001\b\u0005\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001ð\u0002¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001ß\u0001à\u0001á\u0001â\u0001ã\u0001ä\u0001å\u0001æ\u0001ç\u0001è\u0001é\u0001ê\u0001ë\u0001ì\u0001í\u0001î\u0001ï\u0001ð\u0001ñ\u0001ò\u0001ó\u0001ô\u0001õ\u0001ö\u0001÷\u0001ø\u0001ù\u0001ú\u0001û\u0001ü\u0001ý\u0001þ\u0001ÿ\u0001\u0080\u0002\u0081\u0002\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002\u0086\u0002\u0087\u0002\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002\u0096\u0002\u0097\u0002\u0098\u0002\u0099\u0002\u009a\u0002\u009b\u0002\u009c\u0002\u009d\u0002\u009e\u0002\u009f\u0002 \u0002¡\u0002¢\u0002£\u0002¤\u0002¥\u0002¦\u0002§\u0002¨\u0002©\u0002ª\u0002«\u0002¬\u0002\u00ad\u0002®\u0002¯\u0002°\u0002±\u0002²\u0002³\u0002´\u0002µ\u0002¶\u0002·\u0002¸\u0002¹\u0002º\u0002»\u0002¼\u0002½\u0002¾\u0002¿\u0002À\u0002Á\u0002Â\u0002Ã\u0002Ä\u0002Å\u0002Æ\u0002Ç\u0002È\u0002É\u0002Ê\u0002Ë\u0002Ì\u0002Í\u0002Î\u0002Ï\u0002Ð\u0002Ñ\u0002Ò\u0002Ó\u0002Ô\u0002Õ\u0002Ö\u0002×\u0002Ø\u0002Ù\u0002Ú\u0002Û\u0002Ü\u0002Ý\u0002Þ\u0002ß\u0002à\u0002á\u0002â\u0002ã\u0002ä\u0002å\u0002æ\u0002ç\u0002è\u0002é\u0002ê\u0002ë\u0002ì\u0002í\u0002î\u0002ï\u0002ð\u0002ñ\u0002ò\u0002ó\u0002ô\u0002õ\u0002ö\u0002¨\u0006÷\u0002"}, m65681d2 = {"Lj02/m0;", "Lj02/c;", "<init>", "()V", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "aiAction", "c", "k3", "b", "w4", "x0", "d", "e", "f", "g", "j", "l", "k", "m", "n", "p", "q", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "s", "t", "o", "u", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "y", "z", "a0", "b0", "c0", "d0", "f0", "e0", "g0", "d3", "h0", "n0", "j0", "i0", "k0", "m0", "l0", "o0", "p0", "q0", "s0", "r0", "t0", "u0", "v0", "w0", "y0", "a1", "b1", "c1", "f1", "g1", "j1", "h1", "i1", "k1", "l1", "m1", "e5", "n1", "o1", "p1", "q1", "s1", "u1", "r1", "t1", "w1", "v1", "x1", "z1", "y1", "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2", "i2", "j2", "k2", "l2", "m2", "n2", "o2", "q2", "p2", "r2", "s2", "t2", "u2", "v2", "w2", "y2", "x2", "z2", "a3", "b3", "j4", "e3", "c3", "f3", "g3", "h3", "i3", "u3", PersonalRecordsApiKt.VERSION, "l3", "p3", "m3", "n3", "o3", "q3", "r3", "s3", "t3", "w3", "y3", "b4", "r", "x3", "a4", "c4", "e4", "d4", "f4", "h4", "g4", "i4", "k4", "l4", "m4", "n4", "o4", "p4", "q4", "r4", "s4", "t4", "x4", "v4", "y4", "e1", "d1", "z0", "a5", "z4", "u4", "b5", "c5", "d5", "f5", "g5", "k5", "l5", "m5", "n5", "j5", "i5", "h5", "p5", "o5", "z3", "x", "q5", "r5", "s5", "t5", "u5", "v5", "x5", "w5", "y5", "a6", "b6", "z5", "j3", "Lj02/m0$a;", "Lj02/m0$b;", "Lj02/m0$c;", "Lj02/m0$d;", "Lj02/m0$e;", "Lj02/m0$f;", "Lj02/m0$g;", "Lj02/m0$h;", "Lj02/m0$i;", "Lj02/m0$j;", "Lj02/m0$k;", "Lj02/m0$l;", "Lj02/m0$m;", "Lj02/m0$n;", "Lj02/m0$o;", "Lj02/m0$p;", "Lj02/m0$q;", "Lj02/m0$r;", "Lj02/m0$s;", "Lj02/m0$t;", "Lj02/m0$u;", "Lj02/m0$v;", "Lj02/m0$w;", "Lj02/m0$x;", "Lj02/m0$y;", "Lj02/m0$z;", "Lj02/m0$a0;", "Lj02/m0$b0;", "Lj02/m0$c0;", "Lj02/m0$d0;", "Lj02/m0$e0;", "Lj02/m0$f0;", "Lj02/m0$g0;", "Lj02/m0$h0;", "Lj02/m0$i0;", "Lj02/m0$j0;", "Lj02/m0$k0;", "Lj02/m0$l0;", "Lj02/m0$m0;", "Lj02/m0$n0;", "Lj02/m0$o0;", "Lj02/m0$p0;", "Lj02/m0$q0;", "Lj02/m0$r0;", "Lj02/m0$s0;", "Lj02/m0$t0;", "Lj02/m0$u0;", "Lj02/m0$v0;", "Lj02/m0$w0;", "Lj02/m0$x0;", "Lj02/m0$y0;", "Lj02/m0$z0;", "Lj02/m0$a1;", "Lj02/m0$b1;", "Lj02/m0$c1;", "Lj02/m0$d1;", "Lj02/m0$e1;", "Lj02/m0$f1;", "Lj02/m0$g1;", "Lj02/m0$h1;", "Lj02/m0$i1;", "Lj02/m0$j1;", "Lj02/m0$k1;", "Lj02/m0$l1;", "Lj02/m0$m1;", "Lj02/m0$n1;", "Lj02/m0$o1;", "Lj02/m0$p1;", "Lj02/m0$q1;", "Lj02/m0$r1;", "Lj02/m0$s1;", "Lj02/m0$t1;", "Lj02/m0$u1;", "Lj02/m0$v1;", "Lj02/m0$w1;", "Lj02/m0$x1;", "Lj02/m0$y1;", "Lj02/m0$z1;", "Lj02/m0$a2;", "Lj02/m0$b2;", "Lj02/m0$c2;", "Lj02/m0$d2;", "Lj02/m0$e2;", "Lj02/m0$f2;", "Lj02/m0$g2;", "Lj02/m0$h2;", "Lj02/m0$i2;", "Lj02/m0$j2;", "Lj02/m0$k2;", "Lj02/m0$l2;", "Lj02/m0$m2;", "Lj02/m0$n2;", "Lj02/m0$o2;", "Lj02/m0$p2;", "Lj02/m0$q2;", "Lj02/m0$r2;", "Lj02/m0$s2;", "Lj02/m0$t2;", "Lj02/m0$u2;", "Lj02/m0$v2;", "Lj02/m0$w2;", "Lj02/m0$x2;", "Lj02/m0$y2;", "Lj02/m0$z2;", "Lj02/m0$a3;", "Lj02/m0$b3;", "Lj02/m0$c3;", "Lj02/m0$d3;", "Lj02/m0$e3;", "Lj02/m0$f3;", "Lj02/m0$g3;", "Lj02/m0$h3;", "Lj02/m0$i3;", "Lj02/m0$j3;", "Lj02/m0$k3;", "Lj02/m0$l3;", "Lj02/m0$m3;", "Lj02/m0$n3;", "Lj02/m0$o3;", "Lj02/m0$p3;", "Lj02/m0$q3;", "Lj02/m0$r3;", "Lj02/m0$s3;", "Lj02/m0$t3;", "Lj02/m0$u3;", "Lj02/m0$v3;", "Lj02/m0$w3;", "Lj02/m0$x3;", "Lj02/m0$y3;", "Lj02/m0$z3;", "Lj02/m0$a4;", "Lj02/m0$b4;", "Lj02/m0$c4;", "Lj02/m0$d4;", "Lj02/m0$e4;", "Lj02/m0$f4;", "Lj02/m0$g4;", "Lj02/m0$h4;", "Lj02/m0$i4;", "Lj02/m0$j4;", "Lj02/m0$k4;", "Lj02/m0$l4;", "Lj02/m0$m4;", "Lj02/m0$n4;", "Lj02/m0$o4;", "Lj02/m0$p4;", "Lj02/m0$q4;", "Lj02/m0$r4;", "Lj02/m0$s4;", "Lj02/m0$t4;", "Lj02/m0$u4;", "Lj02/m0$v4;", "Lj02/m0$w4;", "Lj02/m0$x4;", "Lj02/m0$y4;", "Lj02/m0$z4;", "Lj02/m0$a5;", "Lj02/m0$b5;", "Lj02/m0$c5;", "Lj02/m0$d5;", "Lj02/m0$e5;", "Lj02/m0$f5;", "Lj02/m0$g5;", "Lj02/m0$h5;", "Lj02/m0$i5;", "Lj02/m0$j5;", "Lj02/m0$k5;", "Lj02/m0$l5;", "Lj02/m0$m5;", "Lj02/m0$n5;", "Lj02/m0$o5;", "Lj02/m0$p5;", "Lj02/m0$q5;", "Lj02/m0$r5;", "Lj02/m0$s5;", "Lj02/m0$t5;", "Lj02/m0$u5;", "Lj02/m0$v5;", "Lj02/m0$w5;", "Lj02/m0$x5;", "Lj02/m0$y5;", "Lj02/m0$z5;", "Lj02/m0$a6;", "Lj02/m0$b6;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21155m0 implements InterfaceC21134c {

    /* JADX INFO: renamed from: a */
    public static final int f80247a = 0;

    /* JADX INFO: renamed from: j02.m0$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$a;", "Lj02/m0;", "", "source", "nextScreen", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String nextScreen;

        public a(String str, String str2) {
            super(null);
            this.source = str;
            this.nextScreen = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNextScreen() {
            return this.nextScreen;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.source, aVar.source) && AbstractC22676k.m65745e(this.nextScreen, aVar.nextScreen);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.nextScreen;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("AccessReconfirmBaselinesNavigationScreen(source=", this.source, ", nextScreen=", this.nextScreen, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$a0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lj02/m0$a0;", "Lj02/m0;", "", "sourceType", "sourceId", "activityType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "getActivityType", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sourceType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String sourceType, String str, String activityType) {
            super(null);
            AbstractC22676k.m65750j(sourceType, "sourceType");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.sourceType = sourceType;
            this.sourceId = str;
            this.activityType = activityType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) other;
            return AbstractC22676k.m65745e(this.sourceType, a0Var.sourceType) && AbstractC22676k.m65745e(this.sourceId, a0Var.sourceId) && AbstractC22676k.m65745e(this.activityType, a0Var.activityType);
        }

        public int hashCode() {
            int iHashCode = this.sourceType.hashCode() * 31;
            String str = this.sourceId;
            return this.activityType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.activityType, ")", AbstractC11895b.m32001t("AiInsightsScreen(sourceType=", this.sourceType, ", sourceId=", this.sourceId, ", activityType="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$a1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$a1;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final a1 f80253b = new a1();

        private a1() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$a3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$a3;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final a3 f80255b = new a3();

        private a3() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$a4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lj02/m0$a4;", "Lj02/m0;", "", "shareMessage", "source", "", "graphId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "(Ljava/lang/Integer;)V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String shareMessage;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private Integer graphId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a4(String shareMessage, String source, Integer num) {
            super(null);
            AbstractC22676k.m65750j(shareMessage, "shareMessage");
            AbstractC22676k.m65750j(source, "source");
            this.shareMessage = shareMessage;
            this.source = source;
            this.graphId = num;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getGraphId() {
            return this.graphId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getShareMessage() {
            return this.shareMessage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: e */
        public final void m59019e(Integer num) {
            this.graphId = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a4)) {
                return false;
            }
            a4 a4Var = (a4) other;
            return AbstractC22676k.m65745e(this.shareMessage, a4Var.shareMessage) && AbstractC22676k.m65745e(this.source, a4Var.source) && AbstractC22676k.m65745e(this.graphId, a4Var.graphId);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.shareMessage.hashCode() * 31, 31, this.source);
            Integer num = this.graphId;
            return iM30450d + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.shareMessage;
            String str2 = this.source;
            return AbstractC11478a.m30859k(AbstractC11895b.m32001t("ReferAFriendHubNavigationScreen(shareMessage=", str, ", source=", str2, ", graphId="), this.graphId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$a6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$a6;", "Lj02/m0;", "", "year", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a6 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int year;

        public a6(int i13) {
            super(null);
            this.year = i13;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a6) && this.year == ((a6) other).year;
        }

        public int hashCode() {
            return Integer.hashCode(this.year);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.year, "YearInReviewScreen(year=", ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$b;", "Lj02/m0;", "", "achievementType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String achievementType;

        public b(String str) {
            super(null);
            this.achievementType = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAchievementType() {
            return this.achievementType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.achievementType, ((b) other).achievementType);
        }

        public int hashCode() {
            String str = this.achievementType;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AchievementMilestoneUnlockNavigationScreen(achievementType=", this.achievementType, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$b0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$b0;", "Lj02/m0;", "", "biomarkerName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String biomarkerName;

        public b0(String str) {
            super(null);
            this.biomarkerName = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBiomarkerName() {
            return this.biomarkerName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b0) && AbstractC22676k.m65745e(this.biomarkerName, ((b0) other).biomarkerName);
        }

        public int hashCode() {
            String str = this.biomarkerName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AllBiomarkerRecordingsNavigationScreen(biomarkerName=", this.biomarkerName, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$b1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$b1;", "Lj02/m0;", "", HttpHeaders.DATE, "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String title;

        public b1(String str, String str2) {
            super(null);
            this.date = str;
            this.title = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b1)) {
                return false;
            }
            b1 b1Var = (b1) other;
            return AbstractC22676k.m65745e(this.date, b1Var.date) && AbstractC22676k.m65745e(this.title, b1Var.title);
        }

        public int hashCode() {
            String str = this.date;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("EditActivitiesDrawerNavigationScreen(date=", this.date, ", title=", this.title, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$b2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$b2;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final b2 f80267b = new b2();

        private b2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$b3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$b3;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "b", "(Ljava/lang/String;)Lj02/m0$b3;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public b3(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b */
        public final b3 m59029b(String source) {
            return new b3(source);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b3) && AbstractC22676k.m65745e(this.source, ((b3) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("MenuNavigationScreen(source=", this.source, ")");
        }

        public /* synthetic */ b3(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: j02.m0$b4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006\""}, m65681d2 = {"Lj02/m0$b4;", "Lj02/m0;", "", "shareMessage", "source", "Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;", "checkoutOrigin", "", "analyticsProperties", "", "disableDefaultOpenSheetAnalytic", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;Ljava/util/Map;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "e", "c", "f", "d", "Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;", "()Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;", "Ljava/util/Map;", "()Ljava/util/Map;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String shareMessage;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final CheckoutOrigin checkoutOrigin;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Map<String, String> analyticsProperties;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Boolean disableDefaultOpenSheetAnalytic;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b4(String shareMessage, String source, CheckoutOrigin checkoutOrigin, Map<String, String> map, Boolean bool) {
            super(null);
            AbstractC22676k.m65750j(shareMessage, "shareMessage");
            AbstractC22676k.m65750j(source, "source");
            this.shareMessage = shareMessage;
            this.source = source;
            this.checkoutOrigin = checkoutOrigin;
            this.analyticsProperties = map;
            this.disableDefaultOpenSheetAnalytic = bool;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, String> m59031b() {
            return this.analyticsProperties;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CheckoutOrigin getCheckoutOrigin() {
            return this.checkoutOrigin;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getDisableDefaultOpenSheetAnalytic() {
            return this.disableDefaultOpenSheetAnalytic;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getShareMessage() {
            return this.shareMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b4)) {
                return false;
            }
            b4 b4Var = (b4) other;
            return AbstractC22676k.m65745e(this.shareMessage, b4Var.shareMessage) && AbstractC22676k.m65745e(this.source, b4Var.source) && this.checkoutOrigin == b4Var.checkoutOrigin && AbstractC22676k.m65745e(this.analyticsProperties, b4Var.analyticsProperties) && AbstractC22676k.m65745e(this.disableDefaultOpenSheetAnalytic, b4Var.disableDefaultOpenSheetAnalytic);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.shareMessage.hashCode() * 31, 31, this.source);
            CheckoutOrigin checkoutOrigin = this.checkoutOrigin;
            int iHashCode = (iM30450d + (checkoutOrigin == null ? 0 : checkoutOrigin.hashCode())) * 31;
            Map<String, String> map = this.analyticsProperties;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Boolean bool = this.disableDefaultOpenSheetAnalytic;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.shareMessage;
            String str2 = this.source;
            CheckoutOrigin checkoutOrigin = this.checkoutOrigin;
            Map<String, String> map = this.analyticsProperties;
            Boolean bool = this.disableDefaultOpenSheetAnalytic;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ReferAFriendNavigationScreen(shareMessage=", str, ", source=", str2, ", checkoutOrigin=");
            sbM32001t.append(checkoutOrigin);
            sbM32001t.append(", analyticsProperties=");
            sbM32001t.append(map);
            sbM32001t.append(", disableDefaultOpenSheetAnalytic=");
            return AbstractC11478a.m30858j(sbM32001t, bool, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$b5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$b5;", "Lj02/m0;", "", "featureType", "pregnancyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String featureType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String pregnancyId;

        public b5(String str, String str2) {
            super(null);
            this.featureType = str;
            this.pregnancyId = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFeatureType() {
            return this.featureType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPregnancyId() {
            return this.pregnancyId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b5)) {
                return false;
            }
            b5 b5Var = (b5) other;
            return AbstractC22676k.m65745e(this.featureType, b5Var.featureType) && AbstractC22676k.m65745e(this.pregnancyId, b5Var.pregnancyId);
        }

        public int hashCode() {
            String str = this.featureType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.pregnancyId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("SymptomPatternsScreen(featureType=", this.featureType, ", pregnancyId=", this.pregnancyId, ")");
        }

        public /* synthetic */ b5(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: j02.m0$b6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$b6;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b6 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final b6 f80276b = new b6();

        private b6() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$c;", "Lj02/m0;", "", "source", "milestoneType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String milestoneType;

        public c(String str, String str2) {
            super(null);
            this.source = str;
            this.milestoneType = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMilestoneType() {
            return this.milestoneType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.source, cVar.source) && AbstractC22676k.m65745e(this.milestoneType, cVar.milestoneType);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.milestoneType;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("AchievementsNavigationScreen(source=", this.source, ", milestoneType=", this.milestoneType, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$c0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$c0;", "Lj02/m0;", "", "subscriptionType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String subscriptionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String subscriptionType) {
            super(null);
            AbstractC22676k.m65750j(subscriptionType, "subscriptionType");
            this.subscriptionType = subscriptionType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubscriptionType() {
            return this.subscriptionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c0) && AbstractC22676k.m65745e(this.subscriptionType, ((c0) other).subscriptionType);
        }

        public int hashCode() {
            return this.subscriptionType.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AnnualUpsellScreen(subscriptionType=", this.subscriptionType, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$c2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$c2;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final c2 f80287b = new c2();

        private c2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$c4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$c4;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final c4 f80290b = new c4();

        private c4() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$c5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$c5;", "Lj02/m0;", "", "cycleDate", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cycleDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        public c5(String str, String str2) {
            super(null);
            this.cycleDate = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCycleDate() {
            return this.cycleDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c5)) {
                return false;
            }
            c5 c5Var = (c5) other;
            return AbstractC22676k.m65745e(this.cycleDate, c5Var.cycleDate) && AbstractC22676k.m65745e(this.source, c5Var.source);
        }

        public int hashCode() {
            String str = this.cycleDate;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("TiltGraph(cycleDate=", this.cycleDate, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$d1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$d1;", "Lj02/m0;", "", "exerciseId", "entryPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String exerciseId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(String exerciseId, String str) {
            super(null);
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            this.exerciseId = exerciseId;
            this.entryPoint = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getExerciseId() {
            return this.exerciseId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d1)) {
                return false;
            }
            d1 d1Var = (d1) other;
            return AbstractC22676k.m65745e(this.exerciseId, d1Var.exerciseId) && AbstractC22676k.m65745e(this.entryPoint, d1Var.entryPoint);
        }

        public int hashCode() {
            int iHashCode = this.exerciseId.hashCode() * 31;
            String str = this.entryPoint;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("EditCustomExercise(exerciseId=", this.exerciseId, ", entryPoint=", this.entryPoint, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$d2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0018B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lj02/m0$d2;", "Lj02/m0;", "", "integrationId", "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "e", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: f */
        public static final int f80303f = 8;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String integrationId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AiAction aiAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d2(String integrationId, String str, AiAction aiAction) {
            super(null);
            AbstractC22676k.m65750j(integrationId, "integrationId");
            this.integrationId = integrationId;
            this.source = str;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d2)) {
                return false;
            }
            d2 d2Var = (d2) other;
            return AbstractC22676k.m65745e(this.integrationId, d2Var.integrationId) && AbstractC22676k.m65745e(this.source, d2Var.source) && AbstractC22676k.m65745e(this.aiAction, d2Var.aiAction);
        }

        public int hashCode() {
            int iHashCode = this.integrationId.hashCode() * 31;
            String str = this.source;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode2 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            String str = this.integrationId;
            String str2 = this.source;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("IntegrationsNavigationScreen(integrationId=", str, ", source=", str2, ", aiAction=");
            sbM32001t.append(aiAction);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: j02.m0$d3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$d3;", "Lj02/m0;", "", "consentAction", "testType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String consentAction;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String testType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d3(String consentAction, String str) {
            super(null);
            AbstractC22676k.m65750j(consentAction, "consentAction");
            this.consentAction = consentAction;
            this.testType = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getConsentAction() {
            return this.consentAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d3)) {
                return false;
            }
            d3 d3Var = (d3) other;
            return AbstractC22676k.m65745e(this.consentAction, d3Var.consentAction) && AbstractC22676k.m65745e(this.testType, d3Var.testType);
        }

        public int hashCode() {
            int iHashCode = this.consentAction.hashCode() * 31;
            String str = this.testType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("MultiConsentNavigationScreen(consentAction=", this.consentAction, ", testType=", this.testType, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$d4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$d4;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public d4(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d4) && AbstractC22676k.m65745e(this.source, ((d4) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SageManualEntryScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$d5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$d5;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final d5 f80310b = new d5();

        private d5() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$e0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$e0;", "Lj02/m0;", "", "detailId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String detailId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(String detailId, String str) {
            super(null);
            AbstractC22676k.m65750j(detailId, "detailId");
            this.detailId = detailId;
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDetailId() {
            return this.detailId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) other;
            return AbstractC22676k.m65745e(this.detailId, e0Var.detailId) && AbstractC22676k.m65745e(this.source, e0Var.source);
        }

        public int hashCode() {
            int iHashCode = this.detailId.hashCode() * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("BehaviorDetailsNavigationScreen(detailId=", this.detailId, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$e3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$e3;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final e3 f80338b = new e3();

        private e3() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$e4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$e4;", "Lj02/m0;", "", HttpHeaders.DATE, "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        public e4(String str, String str2) {
            super(null);
            this.date = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e4)) {
                return false;
            }
            e4 e4Var = (e4) other;
            return AbstractC22676k.m65745e(this.date, e4Var.date) && AbstractC22676k.m65745e(this.source, e4Var.source);
        }

        public int hashCode() {
            String str = this.date;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("SageNavigationScreen(date=", this.date, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$f0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$f0;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public f0(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f0) && AbstractC22676k.m65745e(this.source, ((f0) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("BehaviorImpactNavigationScreen(source=", this.source, ")");
        }

        public /* synthetic */ f0(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: j02.m0$f1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$f1;", "Lj02/m0;", "", "promoCode", "", "isOnTrial", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Z", "()Z", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isOnTrial;

        public f1(String str, boolean z4) {
            super(null);
            this.promoCode = str;
            this.isOnTrial = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsOnTrial() {
            return this.isOnTrial;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f1)) {
                return false;
            }
            f1 f1Var = (f1) other;
            return AbstractC22676k.m65745e(this.promoCode, f1Var.promoCode) && this.isOnTrial == f1Var.isOnTrial;
        }

        public int hashCode() {
            String str = this.promoCode;
            return Boolean.hashCode(this.isOnTrial) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("ExtensionsScreen(promoCode=", this.promoCode, ", isOnTrial=", ")", this.isOnTrial);
        }

        public /* synthetic */ f1(String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: j02.m0$f2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$f2;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final f2 f80359b = new f2();

        private f2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$f4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$f4;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final f4 f80365b = new f4();

        private f4() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$g;", "Lj02/m0;", "", "testId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testId;

        public g(String str) {
            super(null);
            this.testId = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.testId, ((g) other).testId);
        }

        public int hashCode() {
            String str = this.testId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AdvancedLabsActionPlanNavigationScreen(testId=", this.testId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$g0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$g0;", "Lj02/m0;", "", "biomarkerId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String biomarkerId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String biomarkerId, String str) {
            super(null);
            AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
            this.biomarkerId = biomarkerId;
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBiomarkerId() {
            return this.biomarkerId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g0)) {
                return false;
            }
            g0 g0Var = (g0) other;
            return AbstractC22676k.m65745e(this.biomarkerId, g0Var.biomarkerId) && AbstractC22676k.m65745e(this.source, g0Var.source);
        }

        public int hashCode() {
            int iHashCode = this.biomarkerId.hashCode() * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("BiomarkerDetailsNavigationScreen(biomarkerId=", this.biomarkerId, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$g1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$g1;", "Lj02/m0;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(String url) {
            super(null);
            AbstractC22676k.m65750j(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g1) && AbstractC22676k.m65745e(this.url, ((g1) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ExternalUrl(url=", this.url, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$g2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lj02/m0$g2;", "Lj02/m0;", "", "id", "", "showSaveButton", "isNewReading", "<init>", "(Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Z", "()Z", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean showSaveButton;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isNewReading;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g2(String id4, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.showSaveButton = z4;
            this.isNewReading = z13;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShowSaveButton() {
            return this.showSaveButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsNewReading() {
            return this.isNewReading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g2)) {
                return false;
            }
            g2 g2Var = (g2) other;
            return AbstractC22676k.m65745e(this.id, g2Var.id) && this.showSaveButton == g2Var.showSaveButton && this.isNewReading == g2Var.isNewReading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNewReading) + AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.showSaveButton);
        }

        public String toString() {
            String str = this.id;
            boolean z4 = this.showSaveButton;
            return AbstractC18489d0.m53372m(AbstractC25012a.m73379l("LabradorDetailsScreen(id=", str, ", showSaveButton=", ", isNewReading=", z4), this.isNewReading, ")");
        }

        public /* synthetic */ g2(String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? true : z4, (i13 & 4) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j02.m0$g3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$g3;", "Lj02/m0;", "", "videoUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String videoUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g3(String videoUrl) {
            super(null);
            AbstractC22676k.m65750j(videoUrl, "videoUrl");
            this.videoUrl = videoUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getVideoUrl() {
            return this.videoUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g3) && AbstractC22676k.m65745e(this.videoUrl, ((g3) other).videoUrl);
        }

        public int hashCode() {
            return this.videoUrl.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NativeMediaNavigationScreen(videoUrl=", this.videoUrl, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$g4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$g4;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final g4 f80381b = new g4();

        private g4() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$g5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$g5;", "Lj02/m0;", "", "notificationTileId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String notificationTileId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g5(String notificationTileId) {
            super(null);
            AbstractC22676k.m65750j(notificationTileId, "notificationTileId");
            this.notificationTileId = notificationTileId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNotificationTileId() {
            return this.notificationTileId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g5) && AbstractC22676k.m65745e(this.notificationTileId, ((g5) other).notificationTileId);
        }

        public int hashCode() {
            return this.notificationTileId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TurnoffAlarmWarningNavigationScreen(notificationTileId=", this.notificationTileId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$h;", "Lj02/m0;", "", "testId", "", "isAiConfirmation", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Z", "()Z", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isAiConfirmation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String testId, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(testId, "testId");
            this.testId = testId;
            this.isAiConfirmation = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsAiConfirmation() {
            return this.isAiConfirmation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.testId, hVar.testId) && this.isAiConfirmation == hVar.isAiConfirmation;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAiConfirmation) + (this.testId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("AdvancedLabsEditBiomarkersScreen(testId=", this.testId, ", isAiConfirmation=", ")", this.isAiConfirmation);
        }
    }

    /* JADX INFO: renamed from: j02.m0$h0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lj02/m0$h0;", "Lj02/m0;", "", "statusType", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String statusType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AiAction aiAction;

        public h0(String str, AiAction aiAction) {
            super(null);
            this.statusType = str;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStatusType() {
            return this.statusType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) other;
            return AbstractC22676k.m65745e(this.statusType, h0Var.statusType) && AbstractC22676k.m65745e(this.aiAction, h0Var.aiAction);
        }

        public int hashCode() {
            String str = this.statusType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            return "BiomarkerSummaryNavigationScreen(statusType=" + this.statusType + ", aiAction=" + this.aiAction + ")";
        }
    }

    /* JADX INFO: renamed from: j02.m0$h1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lj02/m0$h1;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getSource", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public h1(String str) {
            super(null);
            this.source = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h1) && AbstractC22676k.m65745e(this.source, ((h1) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("FamilyPlanHubScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$h2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$h2;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final h2 f80388b = new h2();

        private h2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$h3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$h3;", "Lj02/m0;", "", "subscriptionType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String subscriptionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h3(String subscriptionType) {
            super(null);
            AbstractC22676k.m65750j(subscriptionType, "subscriptionType");
            this.subscriptionType = subscriptionType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubscriptionType() {
            return this.subscriptionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h3) && AbstractC22676k.m65745e(this.subscriptionType, ((h3) other).subscriptionType);
        }

        public int hashCode() {
            return this.subscriptionType.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NativePlanSwitchScreen(subscriptionType=", this.subscriptionType, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$h4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$h4;", "Lj02/m0;", "", "source", "", "signUpOnEntry", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Z", "()Z", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean signUpOnEntry;

        public h4(String str, boolean z4) {
            super(null);
            this.source = str;
            this.signUpOnEntry = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getSignUpOnEntry() {
            return this.signUpOnEntry;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h4)) {
                return false;
            }
            h4 h4Var = (h4) other;
            return AbstractC22676k.m65745e(this.source, h4Var.source) && this.signUpOnEntry == h4Var.signUpOnEntry;
        }

        public int hashCode() {
            String str = this.source;
            return Boolean.hashCode(this.signUpOnEntry) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("SanguineWaitlistNavigationScreen(source=", this.source, ", signUpOnEntry=", ")", this.signUpOnEntry);
        }
    }

    /* JADX INFO: renamed from: j02.m0$h5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$h5;", "Lj02/m0;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h5(String url) {
            super(null);
            AbstractC22676k.m65750j(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h5) && AbstractC22676k.m65745e(this.url, ((h5) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("URLNavigationScreen(url=", this.url, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$i */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$i;", "Lj02/m0;", "", "testId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String testId) {
            super(null);
            AbstractC22676k.m65750j(testId, "testId");
            this.testId = testId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.testId, ((i) other).testId);
        }

        public int hashCode() {
            return this.testId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AdvancedLabsEditTestDetailsScreen(testId=", this.testId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$i0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$i0;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public i0(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i0) && AbstractC22676k.m65745e(this.source, ((i0) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ChallengeLandingNavigationScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$i1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lj02/m0$i1;", "Lj02/m0;", "", "isNewMember", "", "source", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "()Z", "c", "Ljava/lang/String;", "getSource", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isNewMember;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        public i1(boolean z4, String str) {
            super(null);
            this.isNewMember = z4;
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsNewMember() {
            return this.isNewMember;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i1)) {
                return false;
            }
            i1 i1Var = (i1) other;
            return this.isNewMember == i1Var.isNewMember && AbstractC22676k.m65745e(this.source, i1Var.source);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isNewMember) * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC3855a.m11825i("FamilyPlanInviteScreen(isNewMember=", ", source=", this.source, ")", this.isNewMember);
        }
    }

    /* JADX INFO: renamed from: j02.m0$i2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$i2;", "Lj02/m0;", "", "entryPoint", "<init>", "(Ljava/lang/String;)V", "b", "(Ljava/lang/String;)Lj02/m0$i2;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i2(String entryPoint) {
            super(null);
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            this.entryPoint = entryPoint;
        }

        /* JADX INFO: renamed from: b */
        public final i2 m59144b(String entryPoint) {
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            return new i2(entryPoint);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i2) && AbstractC22676k.m65745e(this.entryPoint, ((i2) other).entryPoint);
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LabradorOnboardingNavigationScreen(entryPoint=", this.entryPoint, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$i3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lj02/m0$i3;", "Lj02/m0;", "", "source", "Leb/x0;", "navOptions", "<init>", "(Ljava/lang/String;Leb/x0;)V", "b", "(Ljava/lang/String;Leb/x0;)Lj02/m0$i3;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "c", "Leb/x0;", "d", "()Leb/x0;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C12997x0 navOptions;

        public i3(String str, C12997x0 c12997x0) {
            super(null);
            this.source = str;
            this.navOptions = c12997x0;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ i3 m59146c(i3 i3Var, String str, C12997x0 c12997x0, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = i3Var.source;
            }
            if ((i13 & 2) != 0) {
                c12997x0 = i3Var.navOptions;
            }
            return i3Var.m59147b(str, c12997x0);
        }

        /* JADX INFO: renamed from: b */
        public final i3 m59147b(String source, C12997x0 navOptions) {
            return new i3(source, navOptions);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C12997x0 getNavOptions() {
            return this.navOptions;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i3)) {
                return false;
            }
            i3 i3Var = (i3) other;
            return AbstractC22676k.m65745e(this.source, i3Var.source) && AbstractC22676k.m65745e(this.navOptions, i3Var.navOptions);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            C12997x0 c12997x0 = this.navOptions;
            return iHashCode + (c12997x0 != null ? c12997x0.hashCode() : 0);
        }

        public String toString() {
            return "NativeStoreNavigationScreen(source=" + this.source + ", navOptions=" + this.navOptions + ")";
        }

        public /* synthetic */ i3(String str, C12997x0 c12997x0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : c12997x0);
        }
    }

    /* JADX INFO: renamed from: j02.m0$i4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lj02/m0$i4;", "Lj02/m0;", "", "measurementId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getMeasurementId", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String measurementId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i4(String measurementId) {
            super(null);
            AbstractC22676k.m65750j(measurementId, "measurementId");
            this.measurementId = measurementId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i4) && AbstractC22676k.m65745e(this.measurementId, ((i4) other).measurementId);
        }

        public int hashCode() {
            return this.measurementId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SeeAllRecordingsScreen(measurementId=", this.measurementId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$j */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$j;", "Lj02/m0;", "", "testId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testId;

        public j(String str) {
            super(null);
            this.testId = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.testId, ((j) other).testId);
        }

        public int hashCode() {
            String str = this.testId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AdvancedLabsHormonalContextNavigationScreen(testId=", this.testId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$j0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$j0;", "Lj02/m0;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String name) {
            super(null);
            AbstractC22676k.m65750j(name, "name");
            this.name = name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j0) && AbstractC22676k.m65745e(this.name, ((j0) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ChallengesNavigationScreen(name=", this.name, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$j1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$j1;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final j1 f80412b = new j1();

        private j1() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$j2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$j2;", "Lj02/m0;", "", "selectedWrist", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedWrist;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j2(String selectedWrist) {
            super(null);
            AbstractC22676k.m65750j(selectedWrist, "selectedWrist");
            this.selectedWrist = selectedWrist;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSelectedWrist() {
            return this.selectedWrist;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j2) && AbstractC22676k.m65745e(this.selectedWrist, ((j2) other).selectedWrist);
        }

        public int hashCode() {
            return this.selectedWrist.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LabradorReadingScreen(selectedWrist=", this.selectedWrist, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$j3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$j3;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final j3 f80414b = new j3();

        private j3() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$j4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$j4;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public j4(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j4) && AbstractC22676k.m65745e(this.source, ((j4) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SettingsModalScreen(source=", this.source, ")");
        }

        public /* synthetic */ j4(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: j02.m0$k */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$k;", "Lj02/m0;", "", "insightId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String insightId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String insightId, String str) {
            super(null);
            AbstractC22676k.m65750j(insightId, "insightId");
            this.insightId = insightId;
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInsightId() {
            return this.insightId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.insightId, kVar.insightId) && AbstractC22676k.m65745e(this.source, kVar.source);
        }

        public int hashCode() {
            int iHashCode = this.insightId.hashCode() * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("AdvancedLabsInsightsDeepDiveNavigationScreen(insightId=", this.insightId, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$k0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0015\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lj02/m0$k0;", "Lj02/m0;", "", "path", "", "payload", "paymentMethodId", "", "skipConfirmation", "category", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "e", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Map<String, String> payload;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String paymentMethodId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Boolean skipConfirmation;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(String path, Map<String, String> payload, String str, Boolean bool, String str2) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(payload, "payload");
            this.path = path;
            this.payload = payload;
            this.paymentMethodId = str;
            this.skipConfirmation = bool;
            this.category = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: d */
        public final Map<String, String> m59170d() {
            return this.payload;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k0)) {
                return false;
            }
            k0 k0Var = (k0) other;
            return AbstractC22676k.m65745e(this.path, k0Var.path) && AbstractC22676k.m65745e(this.payload, k0Var.payload) && AbstractC22676k.m65745e(this.paymentMethodId, k0Var.paymentMethodId) && AbstractC22676k.m65745e(this.skipConfirmation, k0Var.skipConfirmation) && AbstractC22676k.m65745e(this.category, k0Var.category);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Boolean getSkipConfirmation() {
            return this.skipConfirmation;
        }

        public int hashCode() {
            int iM11821e = AbstractC3855a.m11821e(this.payload, this.path.hashCode() * 31, 31);
            String str = this.paymentMethodId;
            int iHashCode = (iM11821e + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.skipConfirmation;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.category;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.path;
            Map<String, String> map = this.payload;
            String str2 = this.paymentMethodId;
            Boolean bool = this.skipConfirmation;
            String str3 = this.category;
            StringBuilder sbM114686n = AbstractC36095b.m114686n("CheckoutNavigationScreen(path=", str, ", payload=", ", paymentMethodId=", map);
            AbstractC36095b.m114692t(bool, str2, ", skipConfirmation=", ", category=", sbM114686n);
            return AbstractC25012a.m73376i(str3, ")", sbM114686n);
        }
    }

    /* JADX INFO: renamed from: j02.m0$k1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$k1;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public k1(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k1) && AbstractC22676k.m65745e(this.source, ((k1) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("FeedbackSurveyNavigationScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$k2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$k2;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final k2 f80428b = new k2();

        private k2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$k3 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$k3;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public k3(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k3) && AbstractC22676k.m65745e(this.source, ((k3) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OmronAuthNavigationScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$k4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lj02/m0$k4;", "Lj02/m0;", "", "gaugeType", "Ljava/time/LocalDate;", "selectedDate", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String gaugeType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final LocalDate selectedDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k4(String gaugeType, LocalDate selectedDate) {
            super(null);
            AbstractC22676k.m65750j(gaugeType, "gaugeType");
            AbstractC22676k.m65750j(selectedDate, "selectedDate");
            this.gaugeType = gaugeType;
            this.selectedDate = selectedDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getGaugeType() {
            return this.gaugeType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getSelectedDate() {
            return this.selectedDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k4)) {
                return false;
            }
            k4 k4Var = (k4) other;
            return AbstractC22676k.m65745e(this.gaugeType, k4Var.gaugeType) && AbstractC22676k.m65745e(this.selectedDate, k4Var.selectedDate);
        }

        public int hashCode() {
            return this.selectedDate.hashCode() + (this.gaugeType.hashCode() * 31);
        }

        public String toString() {
            return "ShareNavigationScreen(gaugeType=" + this.gaugeType + ", selectedDate=" + this.selectedDate + ")";
        }
    }

    /* JADX INFO: renamed from: j02.m0$l */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lj02/m0$l;", "Lj02/m0;", "", "testId", "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AiAction aiAction;

        public l(String str, String str2, AiAction aiAction) {
            super(null);
            this.testId = str;
            this.source = str2;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.testId, lVar.testId) && AbstractC22676k.m65745e(this.source, lVar.source) && AbstractC22676k.m65745e(this.aiAction, lVar.aiAction);
        }

        public int hashCode() {
            String str = this.testId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode2 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            String str = this.testId;
            String str2 = this.source;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("AdvancedLabsInsightsNavigationScreen(testId=", str, ", source=", str2, ", aiAction=");
            sbM32001t.append(aiAction);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: j02.m0$l0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$l0;", "Lj02/m0;", "", "appointmentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String appointmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(String appointmentId) {
            super(null);
            AbstractC22676k.m65750j(appointmentId, "appointmentId");
            this.appointmentId = appointmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAppointmentId() {
            return this.appointmentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l0) && AbstractC22676k.m65745e(this.appointmentId, ((l0) other).appointmentId);
        }

        public int hashCode() {
            return this.appointmentId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ClinicianSchedulingConfirmationNavigationScreen(appointmentId=", this.appointmentId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$l1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$l1;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final l1 f80441b = new l1();

        private l1() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$l2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$l2;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final l2 f80442b = new l2();

        private l2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$l4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$l4;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final l4 f80446b = new l4();

        private l4() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$l5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$l5;", "Lj02/m0;", "", "cartId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cartId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l5(String cartId, String source) {
            super(null);
            AbstractC22676k.m65750j(cartId, "cartId");
            AbstractC22676k.m65750j(source, "source");
            this.cartId = cartId;
            this.source = source;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l5)) {
                return false;
            }
            l5 l5Var = (l5) other;
            return AbstractC22676k.m65745e(this.cartId, l5Var.cartId) && AbstractC22676k.m65745e(this.source, l5Var.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.cartId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("UniversalCheckoutReceiptScreen(cartId=", this.cartId, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$m */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$m;", "Lj02/m0;", "", "source", "testCount", "initiallySelectedSegmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String testCount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String initiallySelectedSegmentId;

        public m(String str, String str2, String str3) {
            super(null);
            this.source = str;
            this.testCount = str2;
            this.initiallySelectedSegmentId = str3;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInitiallySelectedSegmentId() {
            return this.initiallySelectedSegmentId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTestCount() {
            return this.testCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.source, mVar.source) && AbstractC22676k.m65745e(this.testCount, mVar.testCount) && AbstractC22676k.m65745e(this.initiallySelectedSegmentId, mVar.initiallySelectedSegmentId);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.testCount;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.initiallySelectedSegmentId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.initiallySelectedSegmentId, ")", AbstractC11895b.m32001t("AdvancedLabsJoinNavigationScreen(source=", this.source, ", testCount=", this.testCount, ", initiallySelectedSegmentId="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$m0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$m0;", "Lj02/m0;", "", "appointmentType", "appointmentId", "intakeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String appointmentType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String appointmentId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String intakeType;

        public m0(String str, String str2, String str3) {
            super(null);
            this.appointmentType = str;
            this.appointmentId = str2;
            this.intakeType = str3;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAppointmentId() {
            return this.appointmentId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAppointmentType() {
            return this.appointmentType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getIntakeType() {
            return this.intakeType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m0)) {
                return false;
            }
            m0 m0Var = (m0) other;
            return AbstractC22676k.m65745e(this.appointmentType, m0Var.appointmentType) && AbstractC22676k.m65745e(this.appointmentId, m0Var.appointmentId) && AbstractC22676k.m65745e(this.intakeType, m0Var.intakeType);
        }

        public int hashCode() {
            String str = this.appointmentType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.appointmentId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.intakeType;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.intakeType, ")", AbstractC11895b.m32001t("ClinicianVideoSchedulingIntakeNavigationScreen(appointmentType=", this.appointmentType, ", appointmentId=", this.appointmentId, ", intakeType="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$m2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$m2;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final m2 f80465b = new m2();

        private m2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$m3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$m3;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public m3(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m3) && AbstractC22676k.m65745e(this.source, ((m3) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OrderConfirmationNavigationScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$m4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$m4;", "Lj02/m0;", "", HttpHeaders.DATE, "onboardingStoryName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String onboardingStoryName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m4(String date, String str) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
            this.onboardingStoryName = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getOnboardingStoryName() {
            return this.onboardingStoryName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m4)) {
                return false;
            }
            m4 m4Var = (m4) other;
            return AbstractC22676k.m65745e(this.date, m4Var.date) && AbstractC22676k.m65745e(this.onboardingStoryName, m4Var.onboardingStoryName);
        }

        public int hashCode() {
            int iHashCode = this.date.hashCode() * 31;
            String str = this.onboardingStoryName;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("ShepherdDetailsNavigationScreen(date=", this.date, ", onboardingStoryName=", this.onboardingStoryName, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$m5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$m5;", "Lj02/m0;", "", "cartId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cartId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m5(String cartId, String source) {
            super(null);
            AbstractC22676k.m65750j(cartId, "cartId");
            AbstractC22676k.m65750j(source, "source");
            this.cartId = cartId;
            this.source = source;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m5)) {
                return false;
            }
            m5 m5Var = (m5) other;
            return AbstractC22676k.m65745e(this.cartId, m5Var.cartId) && AbstractC22676k.m65745e(this.source, m5Var.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.cartId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("UniversalCheckoutShippingAddressScreen(cartId=", this.cartId, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$n */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$n;", "Lj02/m0;", "", "source", "navigationStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String navigationStyle;

        public n(String str, String str2) {
            super(null);
            this.source = str;
            this.navigationStyle = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNavigationStyle() {
            return this.navigationStyle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return AbstractC22676k.m65745e(this.source, nVar.source) && AbstractC22676k.m65745e(this.navigationStyle, nVar.navigationStyle);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.navigationStyle;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("AdvancedLabsManagementNavigationScreen(source=", this.source, ", navigationStyle=", this.navigationStyle, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$n0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$n0;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final n0 f80473b = new n0();

        private n0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$n1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$n1;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public n1(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n1) && AbstractC22676k.m65745e(this.source, ((n1) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("GiftHubNavigationScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$n2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$n2;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final n2 f80475b = new n2();

        private n2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$n3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$n3;", "Lj02/m0;", "Lcom/whoop/navigation/e;", "completionDestination", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C9598e completionDestination;

        public n3(C9598e c9598e) {
            super(null);
            this.completionDestination = c9598e;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getCompletionDestination() {
            return this.completionDestination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n3) && AbstractC22676k.m65745e(this.completionDestination, ((n3) other).completionDestination);
        }

        public int hashCode() {
            C9598e c9598e = this.completionDestination;
            if (c9598e == null) {
                return 0;
            }
            return c9598e.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("PairDeviceScreen(completionDestination=", this.completionDestination, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$n4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$n4;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final n4 f80477b = new n4();

        private n4() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$n5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$n5;", "Lj02/m0;", "", "cartId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cartId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n5(String cartId, String source) {
            super(null);
            AbstractC22676k.m65750j(cartId, "cartId");
            AbstractC22676k.m65750j(source, "source");
            this.cartId = cartId;
            this.source = source;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n5)) {
                return false;
            }
            n5 n5Var = (n5) other;
            return AbstractC22676k.m65745e(this.cartId, n5Var.cartId) && AbstractC22676k.m65745e(this.source, n5Var.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.cartId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("UniversalCheckoutShippingMethodScreen(cartId=", this.cartId, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$o */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$o;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final o f80480b = new o();

        private o() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$o0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$o0;", "Lj02/m0;", "", "shareCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String shareCode;

        public o0(String str) {
            super(null);
            this.shareCode = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getShareCode() {
            return this.shareCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o0) && AbstractC22676k.m65745e(this.shareCode, ((o0) other).shareCode);
        }

        public int hashCode() {
            String str = this.shareCode;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("CommunityNavigationScreen(shareCode=", this.shareCode, ")");
        }

        public /* synthetic */ o0(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: j02.m0$o1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$o1;", "Lj02/m0;", "", "source", "giftCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String giftCode;

        public o1(String str, String str2) {
            super(null);
            this.source = str;
            this.giftCode = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getGiftCode() {
            return this.giftCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o1)) {
                return false;
            }
            o1 o1Var = (o1) other;
            return AbstractC22676k.m65745e(this.source, o1Var.source) && AbstractC22676k.m65745e(this.giftCode, o1Var.giftCode);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.giftCode;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("GiftedNavigationScreen(source=", this.source, ", giftCode=", this.giftCode, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$o2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b%\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b \u0010)¨\u0006*"}, m65681d2 = {"Lj02/m0$o2;", "Lj02/m0;", "", "id", "", "level", "experience", "userId", "", "tier", "badge", "miniBadge", "minimumExperience", "maximumExperience", "<init>", "(JIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "getId", "()J", "c", "I", "d", "e", "getUserId", "f", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "i", "j", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int level;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int experience;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final long userId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String tier;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String badge;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String miniBadge;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final int minimumExperience;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final Integer maximumExperience;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o2(long j7, int i13, int i14, long j13, String tier, String badge, String miniBadge, int i15, Integer num) {
            super(null);
            AbstractC22676k.m65750j(tier, "tier");
            AbstractC22676k.m65750j(badge, "badge");
            AbstractC22676k.m65750j(miniBadge, "miniBadge");
            this.id = j7;
            this.level = i13;
            this.experience = i14;
            this.userId = j13;
            this.tier = tier;
            this.badge = badge;
            this.miniBadge = miniBadge;
            this.minimumExperience = i15;
            this.maximumExperience = num;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBadge() {
            return this.badge;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getExperience() {
            return this.experience;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getLevel() {
            return this.level;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getMaximumExperience() {
            return this.maximumExperience;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o2)) {
                return false;
            }
            o2 o2Var = (o2) other;
            return this.id == o2Var.id && this.level == o2Var.level && this.experience == o2Var.experience && this.userId == o2Var.userId && AbstractC22676k.m65745e(this.tier, o2Var.tier) && AbstractC22676k.m65745e(this.badge, o2Var.badge) && AbstractC22676k.m65745e(this.miniBadge, o2Var.miniBadge) && this.minimumExperience == o2Var.minimumExperience && AbstractC22676k.m65745e(this.maximumExperience, o2Var.maximumExperience);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getMiniBadge() {
            return this.miniBadge;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getMinimumExperience() {
            return this.minimumExperience;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTier() {
            return this.tier;
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.minimumExperience, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.experience, AbstractC11266d.m30448b(this.level, Long.hashCode(this.id) * 31, 31), 31), this.userId, 31), 31, this.tier), 31, this.badge), 31, this.miniBadge), 31);
            Integer num = this.maximumExperience;
            return iM30448b + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            long j7 = this.id;
            int i13 = this.level;
            int i14 = this.experience;
            long j13 = this.userId;
            String str = this.tier;
            String str2 = this.badge;
            String str3 = this.miniBadge;
            int i15 = this.minimumExperience;
            Integer num = this.maximumExperience;
            StringBuilder sb4 = new StringBuilder("LevelsScreen(id=");
            sb4.append(j7);
            sb4.append(", level=");
            sb4.append(i13);
            sb4.append(", experience=");
            sb4.append(i14);
            sb4.append(", userId=");
            sb4.append(j13);
            sb4.append(", tier=");
            sb4.append(str);
            AbstractC11266d.m30444B(sb4, ", badge=", str2, ", miniBadge=", str3);
            sb4.append(", minimumExperience=");
            sb4.append(i15);
            sb4.append(", maximumExperience=");
            sb4.append(num);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: j02.m0$o3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$o3;", "Lj02/m0;", "", "resetToken", "expires", NotificationCompat.CATEGORY_EMAIL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String resetToken;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String expires;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String email;

        public o3(String str, String str2, String str3) {
            super(null);
            this.resetToken = str;
            this.expires = str2;
            this.email = str3;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getExpires() {
            return this.expires;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getResetToken() {
            return this.resetToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o3)) {
                return false;
            }
            o3 o3Var = (o3) other;
            return AbstractC22676k.m65745e(this.resetToken, o3Var.resetToken) && AbstractC22676k.m65745e(this.expires, o3Var.expires) && AbstractC22676k.m65745e(this.email, o3Var.email);
        }

        public int hashCode() {
            String str = this.resetToken;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.expires;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.email;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.email, ")", AbstractC11895b.m32001t("PasswordResetNavigationScreen(resetToken=", this.resetToken, ", expires=", this.expires, ", email="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$o4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$o4;", "Lj02/m0;", "", "entryPoint", "<init>", "(Ljava/lang/String;)V", "b", "(Ljava/lang/String;)Lj02/m0$o4;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o4(String entryPoint) {
            super(null);
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            this.entryPoint = entryPoint;
        }

        /* JADX INFO: renamed from: b */
        public final o4 m59231b(String entryPoint) {
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            return new o4(entryPoint);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o4) && AbstractC22676k.m65745e(this.entryPoint, ((o4) other).entryPoint);
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ShepherdOnboardingNavigationScreen(entryPoint=", this.entryPoint, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$o5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$o5;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final o5 f80497b = new o5();

        private o5() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$p */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lj02/m0$p;", "Lj02/m0;", "", "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AiAction aiAction;

        public p(String str, AiAction aiAction) {
            super(null);
            this.source = str;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.source, pVar.source) && AbstractC22676k.m65745e(this.aiAction, pVar.aiAction);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            return "AdvancedLabsNavigationScreen(source=" + this.source + ", aiAction=" + this.aiAction + ")";
        }

        public /* synthetic */ p(String str, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$p0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$p0;", "Lj02/m0;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int id;

        public p0(int i13) {
            super(null);
            this.id = i13;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p0) && this.id == ((p0) other).id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.id, "CommunityTeamNavigationScreen(id=", ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$p1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lj02/m0$p1;", "Lj02/m0;", "", "source", "giftType", "testCount", "selectedTier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "e", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String giftType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String testCount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String selectedTier;

        public p1(String str, String str2, String str3, String str4) {
            super(null);
            this.source = str;
            this.giftType = str2;
            this.testCount = str3;
            this.selectedTier = str4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getGiftType() {
            return this.giftType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSelectedTier() {
            return this.selectedTier;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTestCount() {
            return this.testCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p1)) {
                return false;
            }
            p1 p1Var = (p1) other;
            return AbstractC22676k.m65745e(this.source, p1Var.source) && AbstractC22676k.m65745e(this.giftType, p1Var.giftType) && AbstractC22676k.m65745e(this.testCount, p1Var.testCount) && AbstractC22676k.m65745e(this.selectedTier, p1Var.selectedTier);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.giftType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.testCount;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.selectedTier;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.source;
            String str2 = this.giftType;
            return AbstractC11266d.m30464r(AbstractC11895b.m32001t("GiftingNavigationScreen(source=", str, ", giftType=", str2, ", testCount="), this.testCount, ", selectedTier=", this.selectedTier, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$p2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$p2;", "Lj02/m0;", "", "source", "offerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String offerId;

        public p2(String str, String str2) {
            super(null);
            this.source = str;
            this.offerId = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p2)) {
                return false;
            }
            p2 p2Var = (p2) other;
            return AbstractC22676k.m65745e(this.source, p2Var.source) && AbstractC22676k.m65745e(this.offerId, p2Var.offerId);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.offerId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("LimitedTimeOfferNavigationScreen(source=", this.source, ", offerId=", this.offerId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$p3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$p3;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public p3(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p3) && AbstractC22676k.m65745e(this.source, ((p3) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("PaymentMethodManagementNavigationScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$p4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$p4;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final p4 f80508b = new p4();

        private p4() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$p5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$p5;", "Lj02/m0;", "", "callId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String callId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p5(String callId) {
            super(null);
            AbstractC22676k.m65750j(callId, "callId");
            this.callId = callId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p5) && AbstractC22676k.m65745e(this.callId, ((p5) other).callId);
        }

        public int hashCode() {
            return this.callId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("VideoCallNavigationScreen(callId=", this.callId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$q */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$q;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public q(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof q) && AbstractC22676k.m65745e(this.source, ((q) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AdvancedLabsPrimerScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$q0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$q0;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final q0 f80511b = new q0();

        private q0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$q2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lj02/m0$q2;", "Lj02/m0;", "", "activityId", "entryPoint", "activityName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "getActivityName", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q2(String activityId, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(activityId, "activityId");
            this.activityId = activityId;
            this.entryPoint = str;
            this.activityName = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q2)) {
                return false;
            }
            q2 q2Var = (q2) other;
            return AbstractC22676k.m65745e(this.activityId, q2Var.activityId) && AbstractC22676k.m65745e(this.entryPoint, q2Var.entryPoint) && AbstractC22676k.m65745e(this.activityName, q2Var.activityName);
        }

        public int hashCode() {
            int iHashCode = this.activityId.hashCode() * 31;
            String str = this.entryPoint;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.activityName;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.activityName, ")", AbstractC11895b.m32001t("LinkWorkoutNavigationScreen(activityId=", this.activityId, ", entryPoint=", this.entryPoint, ", activityName="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$q3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lj02/m0$q3;", "Lj02/m0;", "", HttpHeaders.DATE, "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AiAction aiAction;

        public q3(String str, String str2, AiAction aiAction) {
            super(null);
            this.date = str;
            this.source = str2;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q3)) {
                return false;
            }
            q3 q3Var = (q3) other;
            return AbstractC22676k.m65745e(this.date, q3Var.date) && AbstractC22676k.m65745e(this.source, q3Var.source) && AbstractC22676k.m65745e(this.aiAction, q3Var.aiAction);
        }

        public int hashCode() {
            String str = this.date;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode2 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            String str = this.date;
            String str2 = this.source;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("PregnancyInsightsScreen(date=", str, ", source=", str2, ", aiAction=");
            sbM32001t.append(aiAction);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ q3(String str, String str2, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$q4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$q4;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final q4 f80523b = new q4();

        private q4() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$q5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$q5;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final q5 f80524b = new q5();

        private q5() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$r */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$r;", "Lj02/m0;", "", "source", "testCount", "navigationStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String testCount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String navigationStyle;

        public r(String str, String str2, String str3) {
            super(null);
            this.source = str;
            this.testCount = str2;
            this.navigationStyle = str3;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNavigationStyle() {
            return this.navigationStyle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTestCount() {
            return this.testCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r)) {
                return false;
            }
            r rVar = (r) other;
            return AbstractC22676k.m65745e(this.source, rVar.source) && AbstractC22676k.m65745e(this.testCount, rVar.testCount) && AbstractC22676k.m65745e(this.navigationStyle, rVar.navigationStyle);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.testCount;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.navigationStyle;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.navigationStyle, ")", AbstractC11895b.m32001t("AdvancedLabsPurchaseAddOnsNavigationScreen(source=", this.source, ", testCount=", this.testCount, ", navigationStyle="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$r0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$r0;", "Lj02/m0;", "", "connectivityNavType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String connectivityNavType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(String connectivityNavType) {
            super(null);
            AbstractC22676k.m65750j(connectivityNavType, "connectivityNavType");
            this.connectivityNavType = connectivityNavType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getConnectivityNavType() {
            return this.connectivityNavType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r0) && AbstractC22676k.m65745e(this.connectivityNavType, ((r0) other).connectivityNavType);
        }

        public int hashCode() {
            return this.connectivityNavType.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ConnectivityNavigationScreen(connectivityNavType=", this.connectivityNavType, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$r1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$r1;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final r1 f80529b = new r1();

        private r1() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$r2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$r2;", "Lj02/m0;", "", "source", "requestDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String requestDate;

        public r2(String str, String str2) {
            super(null);
            this.source = str;
            this.requestDate = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRequestDate() {
            return this.requestDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r2)) {
                return false;
            }
            r2 r2Var = (r2) other;
            return AbstractC22676k.m65745e(this.source, r2Var.source) && AbstractC22676k.m65745e(this.requestDate, r2Var.requestDate);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.requestDate;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("LogSymptomsNavigationScreen(source=", this.source, ", requestDate=", this.requestDate, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$r3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$r3;", "Lj02/m0;", "", "pregnancyScreen", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String pregnancyScreen;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        public r3(String str, String str2) {
            super(null);
            this.pregnancyScreen = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPregnancyScreen() {
            return this.pregnancyScreen;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r3)) {
                return false;
            }
            r3 r3Var = (r3) other;
            return AbstractC22676k.m65745e(this.pregnancyScreen, r3Var.pregnancyScreen) && AbstractC22676k.m65745e(this.source, r3Var.source);
        }

        public int hashCode() {
            String str = this.pregnancyScreen;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("PregnancySettingsScreen(pregnancyScreen=", this.pregnancyScreen, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$r4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$r4;", "Lj02/m0;", "", "sourcePillar", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sourcePillar;

        public r4(String str) {
            super(null);
            this.sourcePillar = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSourcePillar() {
            return this.sourcePillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r4) && AbstractC22676k.m65745e(this.sourcePillar, ((r4) other).sourcePillar);
        }

        public int hashCode() {
            String str = this.sourcePillar;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SleepCoachNavigationScreen(sourcePillar=", this.sourcePillar, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$r5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lj02/m0$r5;", "Lj02/m0;", "", "", "planEditScreens", "analyticsSource", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> planEditScreens;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String analyticsSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r5(List<String> planEditScreens, String analyticsSource) {
            super(null);
            AbstractC22676k.m65750j(planEditScreens, "planEditScreens");
            AbstractC22676k.m65750j(analyticsSource, "analyticsSource");
            this.planEditScreens = planEditScreens;
            this.analyticsSource = analyticsSource;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAnalyticsSource() {
            return this.analyticsSource;
        }

        /* JADX INFO: renamed from: c */
        public final List<String> m59263c() {
            return this.planEditScreens;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r5)) {
                return false;
            }
            r5 r5Var = (r5) other;
            return AbstractC22676k.m65745e(this.planEditScreens, r5Var.planEditScreens) && AbstractC22676k.m65745e(this.analyticsSource, r5Var.analyticsSource);
        }

        public int hashCode() {
            return this.analyticsSource.hashCode() + (this.planEditScreens.hashCode() * 31);
        }

        public String toString() {
            return AbstractC30802r.m94761j("WeeklyPlanEditScreen(planEditScreens=", ", analyticsSource=", this.analyticsSource, ")", this.planEditScreens);
        }
    }

    /* JADX INFO: renamed from: j02.m0$s */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$s;", "Lj02/m0;", "", "episodeId", "biomarkerTestId", "testType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String episodeId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String biomarkerTestId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String testType;

        public s(String str, String str2, String str3) {
            super(null);
            this.episodeId = str;
            this.biomarkerTestId = str2;
            this.testType = str3;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBiomarkerTestId() {
            return this.biomarkerTestId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEpisodeId() {
            return this.episodeId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return AbstractC22676k.m65745e(this.episodeId, sVar.episodeId) && AbstractC22676k.m65745e(this.biomarkerTestId, sVar.biomarkerTestId) && AbstractC22676k.m65745e(this.testType, sVar.testType);
        }

        public int hashCode() {
            String str = this.episodeId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.biomarkerTestId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.testType;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.testType, ")", AbstractC11895b.m32001t("AdvancedLabsSchedulingFormScreen(episodeId=", this.episodeId, ", biomarkerTestId=", this.biomarkerTestId, ", testType="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$s0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$s0;", "Lj02/m0;", "", "entryPoint", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(String entryPoint) {
            super(null);
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            this.entryPoint = entryPoint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s0) && AbstractC22676k.m65745e(this.entryPoint, ((s0) other).entryPoint);
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ContentSearchNavigationScreen(entryPoint=", this.entryPoint, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$s1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$s1;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public s1(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s1) && AbstractC22676k.m65745e(this.source, ((s1) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("HealthTabNavigationScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$s2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$s2;", "Lj02/m0;", "", "showCreateAccount", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getShowCreateAccount", "()Z", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean showCreateAccount;

        public s2(boolean z4) {
            super(null);
            this.showCreateAccount = z4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s2) && this.showCreateAccount == ((s2) other).showCreateAccount;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showCreateAccount);
        }

        public String toString() {
            return AbstractC3855a.m11827k("LoginNavigationScreen(showCreateAccount=", ")", this.showCreateAccount);
        }
    }

    /* JADX INFO: renamed from: j02.m0$s3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$s3;", "Lj02/m0;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s3(String id4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s3) && AbstractC22676k.m65745e(this.id, ((s3) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("PreviousPregnancyScreen(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$s4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$s4;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public s4(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s4) && AbstractC22676k.m65745e(this.source, ((s4) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SmsSetupScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$s5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lj02/m0$s5;", "Lj02/m0;", "", "showPresets", "", "scrollId", "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "c", "()Z", "Ljava/lang/String;", "d", "e", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean showPresets;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String scrollId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final AiAction aiAction;

        public s5(boolean z4, String str, String str2, AiAction aiAction) {
            super(null);
            this.showPresets = z4;
            this.scrollId = str;
            this.source = str2;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScrollId() {
            return this.scrollId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShowPresets() {
            return this.showPresets;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof s5)) {
                return false;
            }
            s5 s5Var = (s5) other;
            return this.showPresets == s5Var.showPresets && AbstractC22676k.m65745e(this.scrollId, s5Var.scrollId) && AbstractC22676k.m65745e(this.source, s5Var.source) && AbstractC22676k.m65745e(this.aiAction, s5Var.aiAction);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.showPresets) * 31;
            String str = this.scrollId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode3 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            boolean z4 = this.showPresets;
            String str = this.scrollId;
            String str2 = this.source;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM38567n = AbstractC13673n.m38567n("WeeklyPlanOverviewScreen(showPresets=", ", scrollId=", str, ", source=", z4);
            sbM38567n.append(str2);
            sbM38567n.append(", aiAction=");
            sbM38567n.append(aiAction);
            sbM38567n.append(")");
            return sbM38567n.toString();
        }

        public /* synthetic */ s5(boolean z4, String str, String str2, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(z4, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$t */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$t;", "Lj02/m0;", "", "step", "testType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String step;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String testType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String step, String str) {
            super(null);
            AbstractC22676k.m65750j(step, "step");
            this.step = step;
            this.testType = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStep() {
            return this.step;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t)) {
                return false;
            }
            t tVar = (t) other;
            return AbstractC22676k.m65745e(this.step, tVar.step) && AbstractC22676k.m65745e(this.testType, tVar.testType);
        }

        public int hashCode() {
            int iHashCode = this.step.hashCode() * 31;
            String str = this.testType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("AdvancedLabsSchedulingStepScreen(step=", this.step, ", testType=", this.testType, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$t0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$t0;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final t0 f80551b = new t0();

        private t0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$t1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lj02/m0$t1;", "Lj02/m0;", "", HttpHeaders.DATE, "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AiAction aiAction;

        public t1(String str, String str2, AiAction aiAction) {
            super(null);
            this.date = str;
            this.source = str2;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t1)) {
                return false;
            }
            t1 t1Var = (t1) other;
            return AbstractC22676k.m65745e(this.date, t1Var.date) && AbstractC22676k.m65745e(this.source, t1Var.source) && AbstractC22676k.m65745e(this.aiAction, t1Var.aiAction);
        }

        public int hashCode() {
            String str = this.date;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode2 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            String str = this.date;
            String str2 = this.source;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthspanNavigationScreen(date=", str, ", source=", str2, ", aiAction=");
            sbM32001t.append(aiAction);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ t1(String str, String str2, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$t2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$t2;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public t2(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof t2) && AbstractC22676k.m65745e(this.source, ((t2) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("MarketingConsentNavigationScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$t3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$t3;", "Lj02/m0;", "Lj02/u0;", "mode", "<init>", "(Lj02/u0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lj02/u0;", "()Lj02/u0;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC21171u0 mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t3(EnumC21171u0 mode) {
            super(null);
            AbstractC22676k.m65750j(mode, "mode");
            this.mode = mode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC21171u0 getMode() {
            return this.mode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof t3) && this.mode == ((t3) other).mode;
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        public String toString() {
            return "PrivacyScreen(mode=" + this.mode + ")";
        }

        public /* synthetic */ t3(EnumC21171u0 enumC21171u0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? EnumC21171u0.FULL : enumC21171u0);
        }
    }

    /* JADX INFO: renamed from: j02.m0$t5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$t5;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final t5 f80560b = new t5();

        private t5() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$u */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$u;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final u f80561b = new u();

        private u() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$u0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$u0;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final u0 f80562b = new u0();

        private u0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$u1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$u1;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u1(String source) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof u1) && AbstractC22676k.m65745e(this.source, ((u1) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("HeartScreenerScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$u2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$u2;", "Lj02/m0;", "", HttpHeaders.DATE, "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        public u2(String str, String str2) {
            super(null);
            this.date = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof u2)) {
                return false;
            }
            u2 u2Var = (u2) other;
            return AbstractC22676k.m65745e(this.date, u2Var.date) && AbstractC22676k.m65745e(this.source, u2Var.source);
        }

        public int hashCode() {
            String str = this.date;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("MciLogCalendarNavigationScreen(date=", this.date, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$u3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$u3;", "Lj02/m0;", "", "slug", "sku", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String slug;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sku;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u3(String slug, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(slug, "slug");
            this.slug = slug;
            this.sku = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof u3)) {
                return false;
            }
            u3 u3Var = (u3) other;
            return AbstractC22676k.m65745e(this.slug, u3Var.slug) && AbstractC22676k.m65745e(this.sku, u3Var.sku) && AbstractC22676k.m65745e(this.source, u3Var.source);
        }

        public int hashCode() {
            int iHashCode = this.slug.hashCode() * 31;
            String str = this.sku;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.source, ")", AbstractC11895b.m32001t("ProductDescriptionPageNavigationScreen(slug=", this.slug, ", sku=", this.sku, ", source="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$u4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$u4;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final u4 f80569b = new u4();

        private u4() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$u5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b(\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b1\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b/\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b-\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010\u0018R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b$\u0010\u0018R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00104¨\u00065"}, m65681d2 = {"Lj02/m0$u5;", "Lj02/m0;", "", "planName", "analyticsSource", "", "locked", "noPlanShowMetricSelection", "initialSelection", HttpHeaders.DATE, "source", "presetPlanCategory", "planTitle", "description", "explanationTitle", "explanation", "templateId", "category", "carouselPlacement", "Lj02/v;", "dismissalType", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/v;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "m", "c", "d", "Z", "k", "()Z", "e", "l", "f", "j", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "p", "i", "o", "n", "q", "Lj02/v;", "()Lj02/v;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String planName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String analyticsSource;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean locked;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean noPlanShowMetricSelection;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String initialSelection;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String presetPlanCategory;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String planTitle;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final String explanationTitle;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final String explanation;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final String templateId;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final String carouselPlacement;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final EnumC21172v dismissalType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u5(String planName, String analyticsSource, boolean z4, boolean z13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, EnumC21172v enumC21172v) {
            super(null);
            AbstractC22676k.m65750j(planName, "planName");
            AbstractC22676k.m65750j(analyticsSource, "analyticsSource");
            this.planName = planName;
            this.analyticsSource = analyticsSource;
            this.locked = z4;
            this.noPlanShowMetricSelection = z13;
            this.initialSelection = str;
            this.date = str2;
            this.source = str3;
            this.presetPlanCategory = str4;
            this.planTitle = str5;
            this.description = str6;
            this.explanationTitle = str7;
            this.explanation = str8;
            this.templateId = str9;
            this.category = str10;
            this.carouselPlacement = str11;
            this.dismissalType = enumC21172v;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAnalyticsSource() {
            return this.analyticsSource;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCarouselPlacement() {
            return this.carouselPlacement;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof u5)) {
                return false;
            }
            u5 u5Var = (u5) other;
            return AbstractC22676k.m65745e(this.planName, u5Var.planName) && AbstractC22676k.m65745e(this.analyticsSource, u5Var.analyticsSource) && this.locked == u5Var.locked && this.noPlanShowMetricSelection == u5Var.noPlanShowMetricSelection && AbstractC22676k.m65745e(this.initialSelection, u5Var.initialSelection) && AbstractC22676k.m65745e(this.date, u5Var.date) && AbstractC22676k.m65745e(this.source, u5Var.source) && AbstractC22676k.m65745e(this.presetPlanCategory, u5Var.presetPlanCategory) && AbstractC22676k.m65745e(this.planTitle, u5Var.planTitle) && AbstractC22676k.m65745e(this.description, u5Var.description) && AbstractC22676k.m65745e(this.explanationTitle, u5Var.explanationTitle) && AbstractC22676k.m65745e(this.explanation, u5Var.explanation) && AbstractC22676k.m65745e(this.templateId, u5Var.templateId) && AbstractC22676k.m65745e(this.category, u5Var.category) && AbstractC22676k.m65745e(this.carouselPlacement, u5Var.carouselPlacement) && this.dismissalType == u5Var.dismissalType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final EnumC21172v getDismissalType() {
            return this.dismissalType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getExplanation() {
            return this.explanation;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.planName.hashCode() * 31, 31, this.analyticsSource), 31, this.locked), 31, this.noPlanShowMetricSelection);
            String str = this.initialSelection;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.date;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.source;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.presetPlanCategory;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.planTitle;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.description;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.explanationTitle;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.explanation;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.templateId;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.category;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.carouselPlacement;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            EnumC21172v enumC21172v = this.dismissalType;
            return iHashCode11 + (enumC21172v != null ? enumC21172v.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getExplanationTitle() {
            return this.explanationTitle;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getInitialSelection() {
            return this.initialSelection;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getLocked() {
            return this.locked;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getNoPlanShowMetricSelection() {
            return this.noPlanShowMetricSelection;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getPlanName() {
            return this.planName;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getPlanTitle() {
            return this.planTitle;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getPresetPlanCategory() {
            return this.presetPlanCategory;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        public String toString() {
            String str = this.planName;
            String str2 = this.analyticsSource;
            boolean z4 = this.locked;
            boolean z13 = this.noPlanShowMetricSelection;
            String str3 = this.initialSelection;
            String str4 = this.date;
            String str5 = this.source;
            String str6 = this.presetPlanCategory;
            String str7 = this.planTitle;
            String str8 = this.description;
            String str9 = this.explanationTitle;
            String str10 = this.explanation;
            String str11 = this.templateId;
            String str12 = this.category;
            String str13 = this.carouselPlacement;
            EnumC21172v enumC21172v = this.dismissalType;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("WeeklyPlanSetUpScreen(planName=", str, ", analyticsSource=", str2, ", locked=");
            AbstractC38963t7.m124392v(sbM32001t, z4, ", noPlanShowMetricSelection=", z13, ", initialSelection=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", date=", str4, ", source=");
            AbstractC11266d.m30444B(sbM32001t, str5, ", presetPlanCategory=", str6, ", planTitle=");
            AbstractC11266d.m30444B(sbM32001t, str7, ", description=", str8, ", explanationTitle=");
            AbstractC11266d.m30444B(sbM32001t, str9, ", explanation=", str10, ", templateId=");
            AbstractC11266d.m30444B(sbM32001t, str11, ", category=", str12, ", carouselPlacement=");
            sbM32001t.append(str13);
            sbM32001t.append(", dismissalType=");
            sbM32001t.append(enumC21172v);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: j02.m0$v */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$v;", "Lj02/m0;", "", "testId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String testId) {
            super(null);
            AbstractC22676k.m65750j(testId, "testId");
            this.testId = testId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof v) && AbstractC22676k.m65745e(this.testId, ((v) other).testId);
        }

        public int hashCode() {
            return this.testId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AdvancedLabsTestResultsScreen(testId=", this.testId, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$v0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$v0;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final v0 f80587b = new v0();

        private v0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$v1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$v1;", "Lj02/m0;", "", "helpType", "entryPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String helpType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v1(String helpType, String entryPoint) {
            super(null);
            AbstractC22676k.m65750j(helpType, "helpType");
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            this.helpType = helpType;
            this.entryPoint = entryPoint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getHelpType() {
            return this.helpType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v1)) {
                return false;
            }
            v1 v1Var = (v1) other;
            return AbstractC22676k.m65745e(this.helpType, v1Var.helpType) && AbstractC22676k.m65745e(this.entryPoint, v1Var.entryPoint);
        }

        public int hashCode() {
            return this.entryPoint.hashCode() + (this.helpType.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("HelpCoachReleaseScreen(helpType=", this.helpType, ", entryPoint=", this.entryPoint, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$v3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$v3;", "Lj02/m0;", "", "key", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v3(String key) {
            super(null);
            AbstractC22676k.m65750j(key, "key");
            this.key = key;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof v3) && AbstractC22676k.m65745e(this.key, ((v3) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ProductSizeGuideNavigationScreen(key=", this.key, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$v4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$v4;", "Lj02/m0;", "", "code", "state", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String code;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String state;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String scope;

        public v4(String str, String str2, String str3) {
            super(null);
            this.code = str;
            this.state = str2;
            this.scope = str3;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getScope() {
            return this.scope;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v4)) {
                return false;
            }
            v4 v4Var = (v4) other;
            return AbstractC22676k.m65745e(this.code, v4Var.code) && AbstractC22676k.m65745e(this.state, v4Var.state) && AbstractC22676k.m65745e(this.scope, v4Var.scope);
        }

        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.state;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.scope;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.scope, ")", AbstractC11895b.m32001t("StravaSettingsNavigationScreen(code=", this.code, ", state=", this.state, ", scope="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$v5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lj02/m0$v5;", "Lj02/m0;", "", "planId", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AiAction aiAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v5(String planId, AiAction aiAction) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            this.planId = planId;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v5)) {
                return false;
            }
            v5 v5Var = (v5) other;
            return AbstractC22676k.m65745e(this.planId, v5Var.planId) && AbstractC22676k.m65745e(this.aiAction, v5Var.aiAction);
        }

        public int hashCode() {
            int iHashCode = this.planId.hashCode() * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode + (aiAction == null ? 0 : aiAction.hashCode());
        }

        public String toString() {
            return "WeeklyPlanSummaryScreen(planId=" + this.planId + ", aiAction=" + this.aiAction + ")";
        }
    }

    /* JADX INFO: renamed from: j02.m0$w */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$w;", "Lj02/m0;", "", QueryParams.URL, "testTokenId", "testType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String url;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String testTokenId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String testType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String url, String testTokenId, String str) {
            super(null);
            AbstractC22676k.m65750j(url, "url");
            AbstractC22676k.m65750j(testTokenId, "testTokenId");
            this.url = url;
            this.testTokenId = testTokenId;
            this.testType = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestTokenId() {
            return this.testTokenId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof w)) {
                return false;
            }
            w wVar = (w) other;
            return AbstractC22676k.m65745e(this.url, wVar.url) && AbstractC22676k.m65745e(this.testTokenId, wVar.testTokenId) && AbstractC22676k.m65745e(this.testType, wVar.testType);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.url.hashCode() * 31, 31, this.testTokenId);
            String str = this.testType;
            return iM30450d + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.testType, ")", AbstractC11895b.m32001t("AdvancedLabsTypeformWebviewScreen(url=", this.url, ", testTokenId=", this.testTokenId, ", testType="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$w0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000e¨\u0006 "}, m65681d2 = {"Lj02/m0$w0;", "Lj02/m0;", "", "fingerprint", "sourceId", "sourceType", "source", "conversationSeedId", "", "dismissible", "headerMetaData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "f", "Z", "()Z", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String fingerprint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String sourceType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String conversationSeedId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean dismissible;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String headerMetaData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(String str, String sourceId, String sourceType, String str2, String str3, boolean z4, String str4) {
            super(null);
            AbstractC22676k.m65750j(sourceId, "sourceId");
            AbstractC22676k.m65750j(sourceType, "sourceType");
            this.fingerprint = str;
            this.sourceId = sourceId;
            this.sourceType = sourceType;
            this.source = str2;
            this.conversationSeedId = str3;
            this.dismissible = z4;
            this.headerMetaData = str4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getConversationSeedId() {
            return this.conversationSeedId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getDismissible() {
            return this.dismissible;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getHeaderMetaData() {
            return this.headerMetaData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof w0)) {
                return false;
            }
            w0 w0Var = (w0) other;
            return AbstractC22676k.m65745e(this.fingerprint, w0Var.fingerprint) && AbstractC22676k.m65745e(this.sourceId, w0Var.sourceId) && AbstractC22676k.m65745e(this.sourceType, w0Var.sourceType) && AbstractC22676k.m65745e(this.source, w0Var.source) && AbstractC22676k.m65745e(this.conversationSeedId, w0Var.conversationSeedId) && this.dismissible == w0Var.dismissible && AbstractC22676k.m65745e(this.headerMetaData, w0Var.headerMetaData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        public int hashCode() {
            String str = this.fingerprint;
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.sourceId), 31, this.sourceType);
            String str2 = this.source;
            int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.conversationSeedId;
            int iM8289b = AbstractC2875y.m8289b((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.dismissible);
            String str4 = this.headerMetaData;
            return iM8289b + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.sourceId;
            String str3 = this.sourceType;
            String str4 = this.source;
            String str5 = this.conversationSeedId;
            boolean z4 = this.dismissible;
            String str6 = this.headerMetaData;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("DayZeroPersonalizationNavigationScreen(fingerprint=", str, ", sourceId=", str2, ", sourceType=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", source=", str4, ", conversationSeedId=");
            AbstractC38963t7.m124390t(sbM32001t, str5, ", dismissible=", z4, ", headerMetaData=");
            return AbstractC25012a.m73376i(str6, ")", sbM32001t);
        }
    }

    /* JADX INFO: renamed from: j02.m0$w2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lj02/m0$w2;", "Lj02/m0;", "", "phase", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String phase;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AiAction aiAction;

        public w2(String str, AiAction aiAction) {
            super(null);
            this.phase = str;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPhase() {
            return this.phase;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof w2)) {
                return false;
            }
            w2 w2Var = (w2) other;
            return AbstractC22676k.m65745e(this.phase, w2Var.phase) && AbstractC22676k.m65745e(this.aiAction, w2Var.aiAction);
        }

        public int hashCode() {
            String str = this.phase;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            return "MciPhaseCoachingNavigationScreen(phase=" + this.phase + ", aiAction=" + this.aiAction + ")";
        }
    }

    /* JADX INFO: renamed from: j02.m0$w4 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$w4;", "Lj02/m0;", "", "source", "celebrationType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String celebrationType;

        public w4(String str, String str2) {
            super(null);
            this.source = str;
            this.celebrationType = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCelebrationType() {
            return this.celebrationType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof w4)) {
                return false;
            }
            w4 w4Var = (w4) other;
            return AbstractC22676k.m65745e(this.source, w4Var.source) && AbstractC22676k.m65745e(this.celebrationType, w4Var.celebrationType);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.celebrationType;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("StreakCelebrationNavigationScreen(source=", this.source, ", celebrationType=", this.celebrationType, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$w5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$w5;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final w5 f80623b = new w5();

        private w5() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$x */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$x;", "Lj02/m0;", "", "source", "testCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String testCount;

        public x(String str, String str2) {
            super(null);
            this.source = str;
            this.testCount = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTestCount() {
            return this.testCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof x)) {
                return false;
            }
            x xVar = (x) other;
            return AbstractC22676k.m65745e(this.source, xVar.source) && AbstractC22676k.m65745e(this.testCount, xVar.testCount);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.testCount;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("AdvancedLabsUpdateTestsNavigationScreen(source=", this.source, ", testCount=", this.testCount, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$x0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$x0;", "Lj02/m0;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public x0(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof x0) && AbstractC22676k.m65745e(this.source, ((x0) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DayZeroSplashNavigationScreen(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$x1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lj02/m0$x1;", "Lj02/m0;", "", "showOnboarding", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "()Z", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean showOnboarding;

        public x1(boolean z4) {
            super(null);
            this.showOnboarding = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShowOnboarding() {
            return this.showOnboarding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof x1) && this.showOnboarding == ((x1) other).showOnboarding;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showOnboarding);
        }

        public String toString() {
            return AbstractC3855a.m11827k("HomeCustomizationScreen(showOnboarding=", ")", this.showOnboarding);
        }
    }

    /* JADX INFO: renamed from: j02.m0$x2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lj02/m0$x2;", "Lj02/m0;", "", "", "payload", "trackingTier", "trackingSource", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, String> payload;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String trackingTier;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String trackingSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x2(Map<String, String> payload, String str, String trackingSource) {
            super(null);
            AbstractC22676k.m65750j(payload, "payload");
            AbstractC22676k.m65750j(trackingSource, "trackingSource");
            this.payload = payload;
            this.trackingTier = str;
            this.trackingSource = trackingSource;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, String> m59340b() {
            return this.payload;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTrackingSource() {
            return this.trackingSource;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTrackingTier() {
            return this.trackingTier;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof x2)) {
                return false;
            }
            x2 x2Var = (x2) other;
            return AbstractC22676k.m65745e(this.payload, x2Var.payload) && AbstractC22676k.m65745e(this.trackingTier, x2Var.trackingTier) && AbstractC22676k.m65745e(this.trackingSource, x2Var.trackingSource);
        }

        public int hashCode() {
            int iHashCode = this.payload.hashCode() * 31;
            String str = this.trackingTier;
            return this.trackingSource.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            Map<String, String> map = this.payload;
            String str = this.trackingTier;
            String str2 = this.trackingSource;
            StringBuilder sb4 = new StringBuilder("MembershipAdjustmentCheckoutNavigationScreen(payload=");
            sb4.append(map);
            sb4.append(", trackingTier=");
            sb4.append(str);
            sb4.append(", trackingSource=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: j02.m0$x3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$x3;", "Lj02/m0;", "", "code", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x3(String code) {
            super(null);
            AbstractC22676k.m65750j(code, "code");
            this.code = code;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof x3) && AbstractC22676k.m65745e(this.code, ((x3) other).code);
        }

        public int hashCode() {
            return this.code.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("RafReceiverNavigationScreen(code=", this.code, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$x4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$x4;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final x4 f80632b = new x4();

        private x4() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$x5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lj02/m0$x5;", "Lj02/m0;", "", "campaignId", "sessionId", "", "campaignFilter", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "d", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer campaignId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer sessionId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String campaignFilter;

        public x5(Integer num, Integer num2, String str) {
            super(null);
            this.campaignId = num;
            this.sessionId = num2;
            this.campaignFilter = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCampaignFilter() {
            return this.campaignFilter;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof x5)) {
                return false;
            }
            x5 x5Var = (x5) other;
            return AbstractC22676k.m65745e(this.campaignId, x5Var.campaignId) && AbstractC22676k.m65745e(this.sessionId, x5Var.sessionId) && AbstractC22676k.m65745e(this.campaignFilter, x5Var.campaignFilter);
        }

        public int hashCode() {
            Integer num = this.campaignId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.sessionId;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.campaignFilter;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.campaignFilter, ")", AbstractC36095b.m114684l("WhoopLabsScreen(campaignId=", this.campaignId, ", sessionId=", this.sessionId, ", campaignFilter="));
        }

        public /* synthetic */ x5(Integer num, Integer num2, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2, (i13 & 4) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: j02.m0$y */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$y;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final y f80636b = new y();

        private y() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$y0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ>\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lj02/m0$y0;", "Lj02/m0;", "", "pillar", HttpHeaders.DATE, "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lj02/m0$y0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "c", "d", "f", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String pillar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final AiAction aiAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(String pillar, String str, String str2, AiAction aiAction) {
            super(null);
            AbstractC22676k.m65750j(pillar, "pillar");
            this.pillar = pillar;
            this.date = str;
            this.source = str2;
            this.aiAction = aiAction;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ y0 m59347c(y0 y0Var, String str, String str2, String str3, AiAction aiAction, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = y0Var.pillar;
            }
            if ((i13 & 2) != 0) {
                str2 = y0Var.date;
            }
            if ((i13 & 4) != 0) {
                str3 = y0Var.source;
            }
            if ((i13 & 8) != 0) {
                aiAction = y0Var.aiAction;
            }
            return y0Var.m59348b(str, str2, str3, aiAction);
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b */
        public final y0 m59348b(String pillar, String date, String source, AiAction aiAction) {
            AbstractC22676k.m65750j(pillar, "pillar");
            return new y0(pillar, date, source, aiAction);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPillar() {
            return this.pillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof y0)) {
                return false;
            }
            y0 y0Var = (y0) other;
            return AbstractC22676k.m65745e(this.pillar, y0Var.pillar) && AbstractC22676k.m65745e(this.date, y0Var.date) && AbstractC22676k.m65745e(this.source, y0Var.source) && AbstractC22676k.m65745e(this.aiAction, y0Var.aiAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = this.pillar.hashCode() * 31;
            String str = this.date;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode3 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            String str = this.pillar;
            String str2 = this.date;
            String str3 = this.source;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("DeepDiveNavigationScreen(pillar=", str, ", date=", str2, ", source=");
            sbM32001t.append(str3);
            sbM32001t.append(", aiAction=");
            sbM32001t.append(aiAction);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: j02.m0$y1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$y1;", "Lj02/m0;", "", "pillar", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String pillar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y1(String pillar) {
            super(null);
            AbstractC22676k.m65750j(pillar, "pillar");
            this.pillar = pillar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPillar() {
            return this.pillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof y1) && AbstractC22676k.m65745e(this.pillar, ((y1) other).pillar);
        }

        public int hashCode() {
            return this.pillar.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("HomePillar(pillar=", this.pillar, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$y2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$y2;", "Lj02/m0;", "", "strapSerial", "strapSignature", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String strapSerial;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String strapSignature;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y2(String strapSerial, String strapSignature, String str) {
            super(null);
            AbstractC22676k.m65750j(strapSerial, "strapSerial");
            AbstractC22676k.m65750j(strapSignature, "strapSignature");
            this.strapSerial = strapSerial;
            this.strapSignature = strapSignature;
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getStrapSerial() {
            return this.strapSerial;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getStrapSignature() {
            return this.strapSignature;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof y2)) {
                return false;
            }
            y2 y2Var = (y2) other;
            return AbstractC22676k.m65745e(this.strapSerial, y2Var.strapSerial) && AbstractC22676k.m65745e(this.strapSignature, y2Var.strapSignature) && AbstractC22676k.m65745e(this.source, y2Var.source);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.strapSerial.hashCode() * 31, 31, this.strapSignature);
            String str = this.source;
            return iM30450d + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.source, ")", AbstractC11895b.m32001t("MembershipAdjustmentNavigationScreen(strapSerial=", this.strapSerial, ", strapSignature=", this.strapSignature, ", source="));
        }
    }

    /* JADX INFO: renamed from: j02.m0$y3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$y3;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final y3 f80645b = new y3();

        private y3() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$y5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001f\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, m65681d2 = {"Lj02/m0$y5;", "Lj02/m0;", "", "cycleId", "", "lowerBound", "upperBound", "", "dayStrain", "", "recoveryScore", "sleepMilliseconds", "calories", "", "isComplete", "<init>", "(JLjava/lang/String;Ljava/lang/String;DIJIZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "()J", "Ljava/lang/String;", "e", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "D", "()D", "f", "I", "g", "i", "Z", "()Z", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String lowerBound;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String upperBound;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final double dayStrain;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int recoveryScore;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final long sleepMilliseconds;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final int calories;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean isComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y5(long j7, String lowerBound, String upperBound, double d3, int i13, long j13, int i14, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(lowerBound, "lowerBound");
            AbstractC22676k.m65750j(upperBound, "upperBound");
            this.cycleId = j7;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            this.dayStrain = d3;
            this.recoveryScore = i13;
            this.sleepMilliseconds = j13;
            this.calories = i14;
            this.isComplete = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCalories() {
            return this.calories;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final double getDayStrain() {
            return this.dayStrain;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getLowerBound() {
            return this.lowerBound;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof y5)) {
                return false;
            }
            y5 y5Var = (y5) other;
            return this.cycleId == y5Var.cycleId && AbstractC22676k.m65745e(this.lowerBound, y5Var.lowerBound) && AbstractC22676k.m65745e(this.upperBound, y5Var.upperBound) && Double.compare(this.dayStrain, y5Var.dayStrain) == 0 && this.recoveryScore == y5Var.recoveryScore && this.sleepMilliseconds == y5Var.sleepMilliseconds && this.calories == y5Var.calories && this.isComplete == y5Var.isComplete;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getRecoveryScore() {
            return this.recoveryScore;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final long getSleepMilliseconds() {
            return this.sleepMilliseconds;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getUpperBound() {
            return this.upperBound;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isComplete) + AbstractC11266d.m30448b(this.calories, AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.recoveryScore, AbstractC17176i.m48499a(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Long.hashCode(this.cycleId) * 31, 31, this.lowerBound), 31, this.upperBound), 31, this.dayStrain), 31), this.sleepMilliseconds, 31), 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public String toString() {
            long j7 = this.cycleId;
            String str = this.lowerBound;
            String str2 = this.upperBound;
            double d3 = this.dayStrain;
            int i13 = this.recoveryScore;
            long j13 = this.sleepMilliseconds;
            int i14 = this.calories;
            boolean z4 = this.isComplete;
            StringBuilder sbM114685m = AbstractC36095b.m114685m("WhoopLiveNavigationScreen(cycleId=", ", lowerBound=", j7, str);
            sbM114685m.append(", upperBound=");
            sbM114685m.append(str2);
            sbM114685m.append(", dayStrain=");
            sbM114685m.append(d3);
            sbM114685m.append(", recoveryScore=");
            sbM114685m.append(i13);
            AbstractC2875y.m8285A(sbM114685m, ", sleepMilliseconds=", j13, ", calories=");
            sbM114685m.append(i14);
            sbM114685m.append(", isComplete=");
            sbM114685m.append(z4);
            sbM114685m.append(")");
            return sbM114685m.toString();
        }
    }

    /* JADX INFO: renamed from: j02.m0$z0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$z0;", "Lj02/m0;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(String id4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof z0) && AbstractC22676k.m65745e(this.id, ((z0) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DownloadedFileExportScreen(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$z1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lj02/m0$z1;", "Lj02/m0;", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Lcom/whoop/navigation/AiAction;)V", "b", "(Lcom/whoop/navigation/AiAction;)Lj02/m0$z1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AiAction aiAction;

        public z1(AiAction aiAction) {
            super(null);
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b */
        public final z1 m59381b(AiAction aiAction) {
            return new z1(aiAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof z1) && AbstractC22676k.m65745e(this.aiAction, ((z1) other).aiAction);
        }

        public int hashCode() {
            AiAction aiAction = this.aiAction;
            if (aiAction == null) {
                return 0;
            }
            return aiAction.hashCode();
        }

        public String toString() {
            return "HomeScreen(aiAction=" + this.aiAction + ")";
        }

        public /* synthetic */ z1(AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$z2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$z2;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final z2 f80674b = new z2();

        private z2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$z3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj02/m0$z3;", "Lj02/m0;", "<init>", "()V", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b */
        public static final z3 f80675b = new z3();

        private z3() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: j02.m0$z4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$z4;", "Lj02/m0;", "", "interventionType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String interventionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z4(String interventionType) {
            super(null);
            AbstractC22676k.m65750j(interventionType, "interventionType");
            this.interventionType = interventionType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInterventionType() {
            return this.interventionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof z4) && AbstractC22676k.m65745e(this.interventionType, ((z4) other).interventionType);
        }

        public int hashCode() {
            return this.interventionType.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("StressInterventionScreen(interventionType=", this.interventionType, ")");
        }
    }

    /* JADX INFO: renamed from: j02.m0$z5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$z5;", "Lj02/m0;", "", "", "path", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z5(String path, String str) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
            this.source = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof z5)) {
                return false;
            }
            z5 z5Var = (z5) other;
            return AbstractC22676k.m65745e(this.path, z5Var.path) && AbstractC22676k.m65745e(this.source, z5Var.source);
        }

        public int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("WhoopShareScreen(path=", this.path, ", source=", this.source, ")");
        }
    }

    public /* synthetic */ AbstractC21155m0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public AiAction getAiAction() {
        return null;
    }

    /* JADX INFO: renamed from: j02.m0$a2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lj02/m0$a2;", "Lj02/m0;", "", "feature", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String feature;

        public a2(String str) {
            super(null);
            this.feature = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a2) && AbstractC22676k.m65745e(this.feature, ((a2) other).feature);
        }

        public int hashCode() {
            String str = this.feature;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("HormonalInsightsOnboardingScreen(feature=", this.feature, ")");
        }

        public /* synthetic */ a2(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    private AbstractC21155m0() {
    }

    /* JADX INFO: renamed from: j02.m0$c3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lj02/m0$c3;", "Lj02/m0;", "", "source", "enforcementTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String enforcementTag;

        public c3(String str, String str2) {
            super(null);
            this.source = str;
            this.enforcementTag = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEnforcementTag() {
            return this.enforcementTag;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c3)) {
                return false;
            }
            c3 c3Var = (c3) other;
            return AbstractC22676k.m65745e(this.source, c3Var.source) && AbstractC22676k.m65745e(this.enforcementTag, c3Var.enforcementTag);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.enforcementTag;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("MfaSetupScreen(source=", this.source, ", enforcementTag=", this.enforcementTag, ")");
        }

        public /* synthetic */ c3(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: j02.m0$a5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lj02/m0$a5;", "Lj02/m0;", "", HttpHeaders.DATE, "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lj02/m0$a5;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "c", "e", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AiAction aiAction;

        public a5(String str, String str2, AiAction aiAction) {
            super(null);
            this.date = str;
            this.source = str2;
            this.aiAction = aiAction;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ a5 m59020c(a5 a5Var, String str, String str2, AiAction aiAction, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = a5Var.date;
            }
            if ((i13 & 2) != 0) {
                str2 = a5Var.source;
            }
            if ((i13 & 4) != 0) {
                aiAction = a5Var.aiAction;
            }
            return a5Var.m59021b(str, str2, aiAction);
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b */
        public final a5 m59021b(String date, String source, AiAction aiAction) {
            return new a5(date, source, aiAction);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a5)) {
                return false;
            }
            a5 a5Var = (a5) other;
            return AbstractC22676k.m65745e(this.date, a5Var.date) && AbstractC22676k.m65745e(this.source, a5Var.source) && AbstractC22676k.m65745e(this.aiAction, a5Var.aiAction);
        }

        public int hashCode() {
            String str = this.date;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode2 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            String str = this.date;
            String str2 = this.source;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("StressMonitorScreen(date=", str, ", source=", str2, ", aiAction=");
            sbM32001t.append(aiAction);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ a5(String str, String str2, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$d */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lj02/m0$d;", "Lj02/m0;", "", "homeGraphStartDestinationId", "", "startScreen", "source", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer homeGraphStartDestinationId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String startScreen;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        public d(Integer num, String str, String str2) {
            super(null);
            this.homeGraphStartDestinationId = num;
            this.startScreen = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getHomeGraphStartDestinationId() {
            return this.homeGraphStartDestinationId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getStartScreen() {
            return this.startScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.homeGraphStartDestinationId, dVar.homeGraphStartDestinationId) && AbstractC22676k.m65745e(this.startScreen, dVar.startScreen) && AbstractC22676k.m65745e(this.source, dVar.source);
        }

        public int hashCode() {
            Integer num = this.homeGraphStartDestinationId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.startScreen;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.source, ")", AbstractC31061c.m95643s("ActivationScreen(homeGraphStartDestinationId=", ", startScreen=", this.homeGraphStartDestinationId, this.startScreen, ", source="));
        }

        public /* synthetic */ d(Integer num, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: j02.m0$l3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lj02/m0$l3;", "Lj02/m0;", "", "onboardingStoryName", "entryPoint", "", "cycleId", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "J", "()J", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String onboardingStoryName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l3(String onboardingStoryName, String entryPoint, long j7) {
            super(null);
            AbstractC22676k.m65750j(onboardingStoryName, "onboardingStoryName");
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            this.onboardingStoryName = onboardingStoryName;
            this.entryPoint = entryPoint;
            this.cycleId = j7;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getOnboardingStoryName() {
            return this.onboardingStoryName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l3)) {
                return false;
            }
            l3 l3Var = (l3) other;
            return AbstractC22676k.m65745e(this.onboardingStoryName, l3Var.onboardingStoryName) && AbstractC22676k.m65745e(this.entryPoint, l3Var.entryPoint) && this.cycleId == l3Var.cycleId;
        }

        public int hashCode() {
            return Long.hashCode(this.cycleId) + AbstractC11266d.m30450d(this.onboardingStoryName.hashCode() * 31, 31, this.entryPoint);
        }

        public String toString() {
            return AbstractC11266d.m30457k(this.cycleId, ")", AbstractC11895b.m32001t("OnboardingStoryNavigationScreen(onboardingStoryName=", this.onboardingStoryName, ", entryPoint=", this.entryPoint, ", cycleId="));
        }

        public /* synthetic */ l3(String str, String str2, long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? 0L : j7);
        }
    }

    /* JADX INFO: renamed from: j02.m0$t4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lj02/m0$t4;", "Lj02/m0;", "", "sportId", "", "autoStartActivity", "", "activityInternalName", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "d", "Ljava/lang/String;", "getActivityInternalName", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sportId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Boolean autoStartActivity;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityInternalName;

        public t4(Integer num, Boolean bool, String str) {
            super(null);
            this.sportId = num;
            this.autoStartActivity = bool;
            this.activityInternalName = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getAutoStartActivity() {
            return this.autoStartActivity;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getSportId() {
            return this.sportId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t4)) {
                return false;
            }
            t4 t4Var = (t4) other;
            return AbstractC22676k.m65745e(this.sportId, t4Var.sportId) && AbstractC22676k.m65745e(this.autoStartActivity, t4Var.autoStartActivity) && AbstractC22676k.m65745e(this.activityInternalName, t4Var.activityInternalName);
        }

        public int hashCode() {
            Integer num = this.sportId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.autoStartActivity;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.activityInternalName;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.sportId;
            Boolean bool = this.autoStartActivity;
            String str = this.activityInternalName;
            StringBuilder sb4 = new StringBuilder("StartActivityNavigationScreen(sportId=");
            sb4.append(num);
            sb4.append(", autoStartActivity=");
            sb4.append(bool);
            sb4.append(", activityInternalName=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ t4(Integer num, Boolean bool, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: j02.m0$d0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lj02/m0$d0;", "Lj02/m0;", "", "pathUrl", QueryParams.URL, "Lj02/j;", "confirmDismissContent", "Lcom/whoop/navigation/e;", "onDismissDestination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj02/j;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "e", "Lj02/j;", "()Lj02/j;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d0 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String pathUrl;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String url;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C21148j confirmDismissContent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C9598e onDismissDestination;

        public d0(String str, String str2, C21148j c21148j, C9598e c9598e) {
            super(null);
            this.pathUrl = str;
            this.url = str2;
            this.confirmDismissContent = c21148j;
            this.onDismissDestination = c9598e;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C21148j getConfirmDismissContent() {
            return this.confirmDismissContent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C9598e getOnDismissDestination() {
            return this.onDismissDestination;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPathUrl() {
            return this.pathUrl;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) other;
            return AbstractC22676k.m65745e(this.pathUrl, d0Var.pathUrl) && AbstractC22676k.m65745e(this.url, d0Var.url) && AbstractC22676k.m65745e(this.confirmDismissContent, d0Var.confirmDismissContent) && AbstractC22676k.m65745e(this.onDismissDestination, d0Var.onDismissDestination);
        }

        public int hashCode() {
            String str = this.pathUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.url;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            C21148j c21148j = this.confirmDismissContent;
            int iHashCode3 = (iHashCode2 + (c21148j == null ? 0 : c21148j.hashCode())) * 31;
            C9598e c9598e = this.onDismissDestination;
            return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
        }

        public String toString() {
            String str = this.pathUrl;
            String str2 = this.url;
            C21148j c21148j = this.confirmDismissContent;
            C9598e c9598e = this.onDismissDestination;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("AuthenticatedWebViewNavigationScreen(pathUrl=", str, ", url=", str2, ", confirmDismissContent=");
            sbM32001t.append(c21148j);
            sbM32001t.append(", onDismissDestination=");
            sbM32001t.append(c9598e);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ d0(String str, String str2, C21148j c21148j, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : c21148j, (i13 & 8) != 0 ? null : c9598e);
        }
    }

    /* JADX INFO: renamed from: j02.m0$j5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lj02/m0$j5;", "Lj02/m0;", "", "cartId", "sku", "source", "addIntent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "getSource", "e", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cartId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sku;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String addIntent;

        public j5(String str, String str2, String str3, String str4) {
            super(null);
            this.cartId = str;
            this.sku = str2;
            this.source = str3;
            this.addIntent = str4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAddIntent() {
            return this.addIntent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j5)) {
                return false;
            }
            j5 j5Var = (j5) other;
            return AbstractC22676k.m65745e(this.cartId, j5Var.cartId) && AbstractC22676k.m65745e(this.sku, j5Var.sku) && AbstractC22676k.m65745e(this.source, j5Var.source) && AbstractC22676k.m65745e(this.addIntent, j5Var.addIntent);
        }

        public int hashCode() {
            String str = this.cartId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sku;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.source;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.addIntent;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.cartId;
            String str2 = this.sku;
            return AbstractC11266d.m30464r(AbstractC11895b.m32001t("UniversalCartScreen(cartId=", str, ", sku=", str2, ", source="), this.source, ", addIntent=", this.addIntent, ")");
        }

        public /* synthetic */ j5(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4);
        }
    }

    /* JADX INFO: renamed from: j02.m0$w1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lj02/m0$w1;", "Lj02/m0;", "", "helpType", "entryPoint", "webUrl", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "e", "getSource", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String helpType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String webUrl;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w1(String helpType, String entryPoint, String str, String source) {
            super(null);
            AbstractC22676k.m65750j(helpType, "helpType");
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            AbstractC22676k.m65750j(source, "source");
            this.helpType = helpType;
            this.entryPoint = entryPoint;
            this.webUrl = str;
            this.source = source;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getHelpType() {
            return this.helpType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getWebUrl() {
            return this.webUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof w1)) {
                return false;
            }
            w1 w1Var = (w1) other;
            return AbstractC22676k.m65745e(this.helpType, w1Var.helpType) && AbstractC22676k.m65745e(this.entryPoint, w1Var.entryPoint) && AbstractC22676k.m65745e(this.webUrl, w1Var.webUrl) && AbstractC22676k.m65745e(this.source, w1Var.source);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.helpType.hashCode() * 31, 31, this.entryPoint);
            String str = this.webUrl;
            return this.source.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.helpType;
            String str2 = this.entryPoint;
            return AbstractC11266d.m30464r(AbstractC11895b.m32001t("HelpNavigationScreen(helpType=", str, ", entryPoint=", str2, ", webUrl="), this.webUrl, ", source=", this.source, ")");
        }

        public /* synthetic */ w1(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? "" : str4);
        }
    }

    /* JADX INFO: renamed from: j02.m0$w3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lj02/m0$w3;", "Lj02/m0;", "", ProfileApiKt.TARGET_USER_ID_PARAM, ProfileApiKt.COMMUNITY_ID_PARAM, "", "source", "educationType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "c", "d", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer targetUserId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer communityId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String educationType;

        public w3(Integer num, Integer num2, String str, String str2) {
            super(null);
            this.targetUserId = num;
            this.communityId = num2;
            this.source = str;
            this.educationType = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getCommunityId() {
            return this.communityId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEducationType() {
            return this.educationType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getTargetUserId() {
            return this.targetUserId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof w3)) {
                return false;
            }
            w3 w3Var = (w3) other;
            return AbstractC22676k.m65745e(this.targetUserId, w3Var.targetUserId) && AbstractC22676k.m65745e(this.communityId, w3Var.communityId) && AbstractC22676k.m65745e(this.source, w3Var.source) && AbstractC22676k.m65745e(this.educationType, w3Var.educationType);
        }

        public int hashCode() {
            Integer num = this.targetUserId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.communityId;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.source;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.educationType;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.targetUserId;
            Integer num2 = this.communityId;
            return AbstractC11266d.m30464r(AbstractC36095b.m114684l("ProfileNavigationScreen(targetUserId=", num, ", communityId=", num2, ", source="), this.source, ", educationType=", this.educationType, ")");
        }

        public /* synthetic */ w3(Integer num, Integer num2, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: j02.m0$e1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lj02/m0$e1;", "Lj02/m0;", "", "exerciseId", "", "showCTA", "entryPoint", "entryPointType", "isExerciseDetailsV2ExperimentEnabled", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "Z", "e", "()Z", "f", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String exerciseId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean showCTA;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String entryPointType;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isExerciseDetailsV2ExperimentEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(String exerciseId, boolean z4, String str, String entryPointType, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            AbstractC22676k.m65750j(entryPointType, "entryPointType");
            this.exerciseId = exerciseId;
            this.showCTA = z4;
            this.entryPoint = str;
            this.entryPointType = entryPointType;
            this.isExerciseDetailsV2ExperimentEnabled = z13;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntryPointType() {
            return this.entryPointType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getExerciseId() {
            return this.exerciseId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShowCTA() {
            return this.showCTA;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e1)) {
                return false;
            }
            e1 e1Var = (e1) other;
            return AbstractC22676k.m65745e(this.exerciseId, e1Var.exerciseId) && this.showCTA == e1Var.showCTA && AbstractC22676k.m65745e(this.entryPoint, e1Var.entryPoint) && AbstractC22676k.m65745e(this.entryPointType, e1Var.entryPointType) && this.isExerciseDetailsV2ExperimentEnabled == e1Var.isExerciseDetailsV2ExperimentEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsExerciseDetailsV2ExperimentEnabled() {
            return this.isExerciseDetailsV2ExperimentEnabled;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.exerciseId.hashCode() * 31, 31, this.showCTA);
            String str = this.entryPoint;
            return Boolean.hashCode(this.isExerciseDetailsV2ExperimentEnabled) + AbstractC11266d.m30450d((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.entryPointType);
        }

        public String toString() {
            String str = this.exerciseId;
            boolean z4 = this.showCTA;
            String str2 = this.entryPoint;
            String str3 = this.entryPointType;
            boolean z13 = this.isExerciseDetailsV2ExperimentEnabled;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("ExerciseDetails(exerciseId=", str, ", showCTA=", ", entryPoint=", z4);
            AbstractC11266d.m30444B(sbM73379l, str2, ", entryPointType=", str3, ", isExerciseDetailsV2ExperimentEnabled=");
            return AbstractC18489d0.m53372m(sbM73379l, z13, ")");
        }

        public /* synthetic */ e1(String str, boolean z4, String str2, String str3, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? "EXTERNAL" : str3, (i13 & 16) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: j02.m0$f3 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, m65681d2 = {"Lj02/m0$f3;", "Lj02/m0;", "", "id", "tag", "entryPoint", "eventName", "screenName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lj02/m0$f3;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "e", "g", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f3 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String tag;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f3(String id4, String str, String entryPoint, String eventName, String screenName) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(screenName, "screenName");
            this.id = id4;
            this.tag = str;
            this.entryPoint = entryPoint;
            this.eventName = eventName;
            this.screenName = screenName;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ f3 m59112c(f3 f3Var, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = f3Var.id;
            }
            if ((i13 & 2) != 0) {
                str2 = f3Var.tag;
            }
            if ((i13 & 4) != 0) {
                str3 = f3Var.entryPoint;
            }
            if ((i13 & 8) != 0) {
                str4 = f3Var.eventName;
            }
            if ((i13 & 16) != 0) {
                str5 = f3Var.screenName;
            }
            String str6 = str5;
            String str7 = str3;
            return f3Var.m59113b(str, str2, str7, str4, str6);
        }

        /* JADX INFO: renamed from: b */
        public final f3 m59113b(String id4, String tag, String entryPoint, String eventName, String screenName) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(screenName, "screenName");
            return new f3(id4, tag, entryPoint, eventName, screenName);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f3)) {
                return false;
            }
            f3 f3Var = (f3) other;
            return AbstractC22676k.m65745e(this.id, f3Var.id) && AbstractC22676k.m65745e(this.tag, f3Var.tag) && AbstractC22676k.m65745e(this.entryPoint, f3Var.entryPoint) && AbstractC22676k.m65745e(this.eventName, f3Var.eventName) && AbstractC22676k.m65745e(this.screenName, f3Var.screenName);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.tag;
            return this.screenName.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.entryPoint), 31, this.eventName);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.tag;
            String str3 = this.entryPoint;
            String str4 = this.eventName;
            String str5 = this.screenName;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("NativeArticleNavigationScreen(id=", str, ", tag=", str2, ", entryPoint=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", screenName=");
            return AbstractC25012a.m73376i(str5, ")", sbM32001t);
        }

        public /* synthetic */ f3(String str, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5);
        }
    }

    /* JADX INFO: renamed from: j02.m0$k5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lj02/m0$k5;", "Lj02/m0;", "", "path", "payload", "source", "method", "Lj02/x0;", "autoTrigger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "e", "f", "Lj02/x0;", "()Lj02/x0;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String method;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC21177x0 autoTrigger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k5(String path, String str, String str2, String str3, EnumC21177x0 enumC21177x0) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
            this.payload = str;
            this.source = str2;
            this.method = str3;
            this.autoTrigger = enumC21177x0;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC21177x0 getAutoTrigger() {
            return this.autoTrigger;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k5)) {
                return false;
            }
            k5 k5Var = (k5) other;
            return AbstractC22676k.m65745e(this.path, k5Var.path) && AbstractC22676k.m65745e(this.payload, k5Var.payload) && AbstractC22676k.m65745e(this.source, k5Var.source) && AbstractC22676k.m65745e(this.method, k5Var.method) && this.autoTrigger == k5Var.autoTrigger;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            String str = this.payload;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.method;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            EnumC21177x0 enumC21177x0 = this.autoTrigger;
            return iHashCode4 + (enumC21177x0 != null ? enumC21177x0.hashCode() : 0);
        }

        public String toString() {
            String str = this.path;
            String str2 = this.payload;
            String str3 = this.source;
            String str4 = this.method;
            EnumC21177x0 enumC21177x0 = this.autoTrigger;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("UniversalCheckoutNavigationScreen(path=", str, ", payload=", str2, ", source=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", method=", str4, ", autoTrigger=");
            sbM32001t.append(enumC21177x0);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ k5(String str, String str2, String str3, String str4, EnumC21177x0 enumC21177x0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i13 & 16) != 0 ? null : enumC21177x0);
        }
    }

    /* JADX INFO: renamed from: j02.m0$q1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lj02/m0$q1;", "Lj02/m0;", "", "source", "label", "", "initialHr", "initialHrZone", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lj02/m0$q1;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "c", "getLabel", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer initialHr;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String initialHrZone;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AiAction aiAction;

        public q1(String str, String str2, Integer num, String str3, AiAction aiAction) {
            super(null);
            this.source = str;
            this.label = str2;
            this.initialHr = num;
            this.initialHrZone = str3;
            this.aiAction = aiAction;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ q1 m59244c(q1 q1Var, String str, String str2, Integer num, String str3, AiAction aiAction, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = q1Var.source;
            }
            if ((i13 & 2) != 0) {
                str2 = q1Var.label;
            }
            if ((i13 & 4) != 0) {
                num = q1Var.initialHr;
            }
            if ((i13 & 8) != 0) {
                str3 = q1Var.initialHrZone;
            }
            if ((i13 & 16) != 0) {
                aiAction = q1Var.aiAction;
            }
            AiAction aiAction2 = aiAction;
            Integer num2 = num;
            return q1Var.m59245b(str, str2, num2, str3, aiAction2);
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b */
        public final q1 m59245b(String source, String label, Integer initialHr, String initialHrZone, AiAction aiAction) {
            return new q1(source, label, initialHr, initialHrZone, aiAction);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getInitialHr() {
            return this.initialHr;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInitialHrZone() {
            return this.initialHrZone;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q1)) {
                return false;
            }
            q1 q1Var = (q1) other;
            return AbstractC22676k.m65745e(this.source, q1Var.source) && AbstractC22676k.m65745e(this.label, q1Var.label) && AbstractC22676k.m65745e(this.initialHr, q1Var.initialHr) && AbstractC22676k.m65745e(this.initialHrZone, q1Var.initialHrZone) && AbstractC22676k.m65745e(this.aiAction, q1Var.aiAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.label;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.initialHr;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.initialHrZone;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode4 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            String str = this.source;
            String str2 = this.label;
            Integer num = this.initialHr;
            String str3 = this.initialHrZone;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthMonitorNavigationScreen(source=", str, ", label=", str2, ", initialHr=");
            AbstractC13673n.m38577x(num, ", initialHrZone=", str3, ", aiAction=", sbM32001t);
            sbM32001t.append(aiAction);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ q1(String str, String str2, Integer num, String str3, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$v2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lj02/m0$v2;", "Lj02/m0;", "", HttpHeaders.DATE, "", "doPollUponEntry", "preSelectedLogValue", "analyticsSource", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "e", "f", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean doPollUponEntry;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String preSelectedLogValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String analyticsSource;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AiAction aiAction;

        public v2(String str, boolean z4, String str2, String str3, AiAction aiAction) {
            super(null);
            this.date = str;
            this.doPollUponEntry = z4;
            this.preSelectedLogValue = str2;
            this.analyticsSource = str3;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAnalyticsSource() {
            return this.analyticsSource;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getDoPollUponEntry() {
            return this.doPollUponEntry;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPreSelectedLogValue() {
            return this.preSelectedLogValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v2)) {
                return false;
            }
            v2 v2Var = (v2) other;
            return AbstractC22676k.m65745e(this.date, v2Var.date) && this.doPollUponEntry == v2Var.doPollUponEntry && AbstractC22676k.m65745e(this.preSelectedLogValue, v2Var.preSelectedLogValue) && AbstractC22676k.m65745e(this.analyticsSource, v2Var.analyticsSource) && AbstractC22676k.m65745e(this.aiAction, v2Var.aiAction);
        }

        public int hashCode() {
            String str = this.date;
            int iM8289b = AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.doPollUponEntry);
            String str2 = this.preSelectedLogValue;
            int iHashCode = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.analyticsSource;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode2 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            String str = this.date;
            boolean z4 = this.doPollUponEntry;
            String str2 = this.preSelectedLogValue;
            String str3 = this.analyticsSource;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("MciOverviewNavigationScreen(date=", str, ", doPollUponEntry=", ", preSelectedLogValue=", z4);
            AbstractC11266d.m30444B(sbM73379l, str2, ", analyticsSource=", str3, ", aiAction=");
            sbM73379l.append(aiAction);
            sbM73379l.append(")");
            return sbM73379l.toString();
        }

        public /* synthetic */ v2(String str, boolean z4, String str2, String str3, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\u001b\u0010\u000f¨\u0006$"}, m65681d2 = {"Lj02/m0$f;", "Lj02/m0;", "", "isSleepActivity", "Ljava/time/LocalDate;", "activityDate", "Ljava/time/LocalDateTime;", "startTime", "endTime", "isGdcFlow", "", "activityInternalName", "<init>", "(ZLjava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "g", "()Z", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "d", "Ljava/time/LocalDateTime;", "e", "()Ljava/time/LocalDateTime;", "f", "Ljava/lang/String;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isSleepActivity;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final LocalDate activityDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final LocalDateTime startTime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final LocalDateTime endTime;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isGdcFlow;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String activityInternalName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, LocalDate activityDate, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z13, String activityInternalName) {
            super(null);
            AbstractC22676k.m65750j(activityDate, "activityDate");
            AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
            this.isSleepActivity = z4;
            this.activityDate = activityDate;
            this.startTime = localDateTime;
            this.endTime = localDateTime2;
            this.isGdcFlow = z13;
            this.activityInternalName = activityInternalName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getActivityDate() {
            return this.activityDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getActivityInternalName() {
            return this.activityInternalName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDateTime getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDateTime getStartTime() {
            return this.startTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.isSleepActivity == fVar.isSleepActivity && AbstractC22676k.m65745e(this.activityDate, fVar.activityDate) && AbstractC22676k.m65745e(this.startTime, fVar.startTime) && AbstractC22676k.m65745e(this.endTime, fVar.endTime) && this.isGdcFlow == fVar.isGdcFlow && AbstractC22676k.m65745e(this.activityInternalName, fVar.activityInternalName);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsGdcFlow() {
            return this.isGdcFlow;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsSleepActivity() {
            return this.isSleepActivity;
        }

        public int hashCode() {
            int iM38558e = AbstractC13673n.m38558e(this.activityDate, Boolean.hashCode(this.isSleepActivity) * 31, 31);
            LocalDateTime localDateTime = this.startTime;
            int iHashCode = (iM38558e + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
            LocalDateTime localDateTime2 = this.endTime;
            return this.activityInternalName.hashCode() + AbstractC2875y.m8289b((iHashCode + (localDateTime2 != null ? localDateTime2.hashCode() : 0)) * 31, 31, this.isGdcFlow);
        }

        public String toString() {
            boolean z4 = this.isSleepActivity;
            LocalDate localDate = this.activityDate;
            LocalDateTime localDateTime = this.startTime;
            LocalDateTime localDateTime2 = this.endTime;
            boolean z13 = this.isGdcFlow;
            String str = this.activityInternalName;
            StringBuilder sb4 = new StringBuilder("AddActivityNavigationScreen(isSleepActivity=");
            sb4.append(z4);
            sb4.append(", activityDate=");
            sb4.append(localDate);
            sb4.append(", startTime=");
            sb4.append(localDateTime);
            sb4.append(", endTime=");
            sb4.append(localDateTime2);
            sb4.append(", isGdcFlow=");
            return AbstractC21702c.m61139j(sb4, z13, ", activityInternalName=", str, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ f(boolean z4, LocalDate localDate, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z13, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            z4 = (i13 & 1) != 0 ? false : z4;
            if ((i13 & 2) != 0) {
                localDate = LocalDate.now();
                AbstractC22676k.m65749i(localDate, "now(...)");
            }
            this(z4, localDate, (i13 & 4) != 0 ? null : localDateTime, (i13 & 8) != 0 ? null : localDateTime2, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? "" : str);
        }
    }

    /* JADX INFO: renamed from: j02.m0$y4 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lj02/m0$y4;", "Lj02/m0;", "", "templateId", "", "activityId", "", "isFromWhoopCoach", "entryPoint", "openTab", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "c", "Ljava/lang/String;", "d", "Z", "f", "()Z", "g", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y4 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Long templateId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isFromWhoopCoach;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String openTab;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final AiAction aiAction;

        public y4(Long l7, String str, boolean z4, String str2, String str3, AiAction aiAction) {
            super(null);
            this.templateId = l7;
            this.activityId = str;
            this.isFromWhoopCoach = z4;
            this.entryPoint = str2;
            this.openTab = str3;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getOpenTab() {
            return this.openTab;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long getTemplateId() {
            return this.templateId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof y4)) {
                return false;
            }
            y4 y4Var = (y4) other;
            return AbstractC22676k.m65745e(this.templateId, y4Var.templateId) && AbstractC22676k.m65745e(this.activityId, y4Var.activityId) && this.isFromWhoopCoach == y4Var.isFromWhoopCoach && AbstractC22676k.m65745e(this.entryPoint, y4Var.entryPoint) && AbstractC22676k.m65745e(this.openTab, y4Var.openTab) && AbstractC22676k.m65745e(this.aiAction, y4Var.aiAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsFromWhoopCoach() {
            return this.isFromWhoopCoach;
        }

        public int hashCode() {
            Long l7 = this.templateId;
            int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
            String str = this.activityId;
            int iM8289b = AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isFromWhoopCoach);
            String str2 = this.entryPoint;
            int iHashCode2 = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.openTab;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode3 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            Long l7 = this.templateId;
            String str = this.activityId;
            boolean z4 = this.isFromWhoopCoach;
            String str2 = this.entryPoint;
            String str3 = this.openTab;
            AiAction aiAction = this.aiAction;
            StringBuilder sb4 = new StringBuilder("StrengthTrainer(templateId=");
            sb4.append(l7);
            sb4.append(", activityId=");
            sb4.append(str);
            sb4.append(", isFromWhoopCoach=");
            AbstractC38963t7.m124391u(sb4, z4, ", entryPoint=", str2, ", openTab=");
            sb4.append(str3);
            sb4.append(", aiAction=");
            sb4.append(aiAction);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ y4(Long l7, String str, boolean z4, String str2, String str3, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : l7, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$c1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Lj02/m0$c1;", "Lj02/m0;", "Lorg/joda/time/LocalDateTime;", "startTime", "endTime", "", "activityInternalName", "activityType", "activityIdV2", "flow", "", "isDeletable", "<init>", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lorg/joda/time/LocalDateTime;", "g", "()Lorg/joda/time/LocalDateTime;", "c", "e", "d", "Ljava/lang/String;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "()Z", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final org.joda.time.LocalDateTime startTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final org.joda.time.LocalDateTime endTime;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityInternalName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String activityIdV2;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String flow;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isDeletable;

        public c1(org.joda.time.LocalDateTime localDateTime, org.joda.time.LocalDateTime localDateTime2, String str, String str2, String str3, String str4, boolean z4) {
            super(null);
            this.startTime = localDateTime;
            this.endTime = localDateTime2;
            this.activityInternalName = str;
            this.activityType = str2;
            this.activityIdV2 = str3;
            this.flow = str4;
            this.isDeletable = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityIdV2() {
            return this.activityIdV2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getActivityInternalName() {
            return this.activityInternalName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final org.joda.time.LocalDateTime getEndTime() {
            return this.endTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c1)) {
                return false;
            }
            c1 c1Var = (c1) other;
            return AbstractC22676k.m65745e(this.startTime, c1Var.startTime) && AbstractC22676k.m65745e(this.endTime, c1Var.endTime) && AbstractC22676k.m65745e(this.activityInternalName, c1Var.activityInternalName) && AbstractC22676k.m65745e(this.activityType, c1Var.activityType) && AbstractC22676k.m65745e(this.activityIdV2, c1Var.activityIdV2) && AbstractC22676k.m65745e(this.flow, c1Var.flow) && this.isDeletable == c1Var.isDeletable;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getFlow() {
            return this.flow;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final org.joda.time.LocalDateTime getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsDeletable() {
            return this.isDeletable;
        }

        public int hashCode() {
            org.joda.time.LocalDateTime localDateTime = this.startTime;
            int iHashCode = (localDateTime == null ? 0 : localDateTime.hashCode()) * 31;
            org.joda.time.LocalDateTime localDateTime2 = this.endTime;
            int iHashCode2 = (iHashCode + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
            String str = this.activityInternalName;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.activityType;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.activityIdV2;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.flow;
            return Boolean.hashCode(this.isDeletable) + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public String toString() {
            org.joda.time.LocalDateTime localDateTime = this.startTime;
            org.joda.time.LocalDateTime localDateTime2 = this.endTime;
            String str = this.activityInternalName;
            String str2 = this.activityType;
            String str3 = this.activityIdV2;
            String str4 = this.flow;
            boolean z4 = this.isDeletable;
            StringBuilder sb4 = new StringBuilder("EditActivityNavigationScreen(startTime=");
            sb4.append(localDateTime);
            sb4.append(", endTime=");
            sb4.append(localDateTime2);
            sb4.append(", activityInternalName=");
            AbstractC11266d.m30444B(sb4, str, ", activityType=", str2, ", activityIdV2=");
            AbstractC11266d.m30444B(sb4, str3, ", flow=", str4, ", isDeletable=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }

        public /* synthetic */ c1(org.joda.time.LocalDateTime localDateTime, org.joda.time.LocalDateTime localDateTime2, String str, String str2, String str3, String str4, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : localDateTime, (i13 & 2) != 0 ? null : localDateTime2, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: j02.m0$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lj02/m0$e;", "Lj02/m0;", "", "activityIdV2", "activityType", "localDate", "whoopActivity", "", "newHome", "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "getLocalDate", "e", "getWhoopActivity", "f", "Z", "()Z", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityIdV2;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String localDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String whoopActivity;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean newHome;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final AiAction aiAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String activityIdV2, String activityType, String str, String str2, boolean z4, String str3, AiAction aiAction) {
            super(null);
            AbstractC22676k.m65750j(activityIdV2, "activityIdV2");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.activityIdV2 = activityIdV2;
            this.activityType = activityType;
            this.localDate = str;
            this.whoopActivity = str2;
            this.newHome = z4;
            this.source = str3;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityIdV2() {
            return this.activityIdV2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getNewHome() {
            return this.newHome;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.activityIdV2, eVar.activityIdV2) && AbstractC22676k.m65745e(this.activityType, eVar.activityType) && AbstractC22676k.m65745e(this.localDate, eVar.localDate) && AbstractC22676k.m65745e(this.whoopActivity, eVar.whoopActivity) && this.newHome == eVar.newHome && AbstractC22676k.m65745e(this.source, eVar.source) && AbstractC22676k.m65745e(this.aiAction, eVar.aiAction);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.activityIdV2.hashCode() * 31, 31, this.activityType);
            String str = this.localDate;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.whoopActivity;
            int iM8289b = AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.newHome);
            String str3 = this.source;
            int iHashCode2 = (iM8289b + (str3 == null ? 0 : str3.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode2 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        public String toString() {
            String str = this.activityIdV2;
            String str2 = this.activityType;
            String str3 = this.localDate;
            String str4 = this.whoopActivity;
            boolean z4 = this.newHome;
            String str5 = this.source;
            AiAction aiAction = this.aiAction;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivityDetailsNavigationScreen(activityIdV2=", str, ", activityType=", str2, ", localDate=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", whoopActivity=", str4, ", newHome=");
            AbstractC38963t7.m124391u(sbM32001t, z4, ", source=", str5, ", aiAction=");
            sbM32001t.append(aiAction);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ e(String str, String str2, String str3, String str4, boolean z4, String str5, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$f5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001f\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lj02/m0$f5;", "Lj02/m0;", "", "trendKey", "Ljava/time/LocalDate;", HttpHeaders.DATE, "fromLocation", "trendSource", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "sendTileProperties", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;IZLcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "d", "e", "g", "I", "Z", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String trendKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final LocalDate date;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String fromLocation;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String trendSource;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int duration;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean sendTileProperties;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final AiAction aiAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f5(String trendKey, LocalDate date, String fromLocation, String trendSource, int i13, boolean z4, AiAction aiAction) {
            super(null);
            AbstractC22676k.m65750j(trendKey, "trendKey");
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(fromLocation, "fromLocation");
            AbstractC22676k.m65750j(trendSource, "trendSource");
            this.trendKey = trendKey;
            this.date = date;
            this.fromLocation = fromLocation;
            this.trendSource = trendSource;
            this.duration = i13;
            this.sendTileProperties = z4;
            this.aiAction = aiAction;
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFromLocation() {
            return this.fromLocation;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getSendTileProperties() {
            return this.sendTileProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f5)) {
                return false;
            }
            f5 f5Var = (f5) other;
            return AbstractC22676k.m65745e(this.trendKey, f5Var.trendKey) && AbstractC22676k.m65745e(this.date, f5Var.date) && AbstractC22676k.m65745e(this.fromLocation, f5Var.fromLocation) && AbstractC22676k.m65745e(this.trendSource, f5Var.trendSource) && this.duration == f5Var.duration && this.sendTileProperties == f5Var.sendTileProperties && AbstractC22676k.m65745e(this.aiAction, f5Var.aiAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTrendKey() {
            return this.trendKey;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTrendSource() {
            return this.trendSource;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.duration, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC13673n.m38558e(this.date, this.trendKey.hashCode() * 31, 31), 31, this.fromLocation), 31, this.trendSource), 31), 31, this.sendTileProperties);
            AiAction aiAction = this.aiAction;
            return iM8289b + (aiAction == null ? 0 : aiAction.hashCode());
        }

        public String toString() {
            String str = this.trendKey;
            LocalDate localDate = this.date;
            String str2 = this.fromLocation;
            String str3 = this.trendSource;
            int i13 = this.duration;
            boolean z4 = this.sendTileProperties;
            AiAction aiAction = this.aiAction;
            StringBuilder sb4 = new StringBuilder("TrendsNavigationScreen(trendKey=");
            sb4.append(str);
            sb4.append(", date=");
            sb4.append(localDate);
            sb4.append(", fromLocation=");
            AbstractC11266d.m30444B(sb4, str2, ", trendSource=", str3, ", duration=");
            AbstractC13673n.m38573t(i13, ", sendTileProperties=", ", aiAction=", sb4, z4);
            sb4.append(aiAction);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ f5(String str, LocalDate localDate, String str2, String str3, int i13, boolean z4, AiAction aiAction, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i14 & 1) != 0 ? "" : str;
            if ((i14 & 2) != 0) {
                localDate = LocalDate.now();
                AbstractC22676k.m65749i(localDate, "now(...)");
            }
            this(str, localDate, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? 1 : i13, (i14 & 32) != 0 ? false : z4, (i14 & 64) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$e5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jx\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b+\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b'\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b,\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b/\u00106R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b8\u00109¨\u0006:"}, m65681d2 = {"Lj02/m0$e5;", "Lj02/m0;", "", "selectedTab", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lcom/whoop/navigation/GenericCachePolicy;", "cachePolicy", "navigationStyle", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "analyticEvents", "Lcom/whoop/analytics/MetricEventModel;", "metricEvents", "Lcom/whoop/navigation/models/GenericInteraction;", "onStartInteraction", "Leb/x0;", "navOptions", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Lcom/whoop/navigation/AiAction;)V", "b", "(Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Lcom/whoop/navigation/AiAction;)Lj02/m0$e5;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "c", "Lcom/whoop/navigation/models/ApiRequest;", "j", "()Lcom/whoop/navigation/models/ApiRequest;", "d", "Lcom/whoop/navigation/GenericCachePolicy;", "e", "()Lcom/whoop/navigation/GenericCachePolicy;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "()Lcom/whoop/analytics/ScreenAnalyticEventModel;", "g", "Lcom/whoop/analytics/MetricEventModel;", "()Lcom/whoop/analytics/MetricEventModel;", "Lcom/whoop/navigation/models/GenericInteraction;", "i", "()Lcom/whoop/navigation/models/GenericInteraction;", "Leb/x0;", "()Leb/x0;", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedTab;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final ApiRequest request;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final GenericCachePolicy cachePolicy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String navigationStyle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final ScreenAnalyticEventModel analyticEvents;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final MetricEventModel metricEvents;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final GenericInteraction onStartInteraction;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C12997x0 navOptions;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final AiAction aiAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e5(String selectedTab, ApiRequest request, GenericCachePolicy genericCachePolicy, String str, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, GenericInteraction genericInteraction, C12997x0 c12997x0, AiAction aiAction) {
            super(null);
            AbstractC22676k.m65750j(selectedTab, "selectedTab");
            AbstractC22676k.m65750j(request, "request");
            this.selectedTab = selectedTab;
            this.request = request;
            this.cachePolicy = genericCachePolicy;
            this.navigationStyle = str;
            this.analyticEvents = screenAnalyticEventModel;
            this.metricEvents = metricEventModel;
            this.onStartInteraction = genericInteraction;
            this.navOptions = c12997x0;
            this.aiAction = aiAction;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ e5 m59093c(e5 e5Var, String str, ApiRequest apiRequest, GenericCachePolicy genericCachePolicy, String str2, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, GenericInteraction genericInteraction, C12997x0 c12997x0, AiAction aiAction, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = e5Var.selectedTab;
            }
            if ((i13 & 2) != 0) {
                apiRequest = e5Var.request;
            }
            if ((i13 & 4) != 0) {
                genericCachePolicy = e5Var.cachePolicy;
            }
            if ((i13 & 8) != 0) {
                str2 = e5Var.navigationStyle;
            }
            if ((i13 & 16) != 0) {
                screenAnalyticEventModel = e5Var.analyticEvents;
            }
            if ((i13 & 32) != 0) {
                metricEventModel = e5Var.metricEvents;
            }
            if ((i13 & 64) != 0) {
                genericInteraction = e5Var.onStartInteraction;
            }
            if ((i13 & 128) != 0) {
                c12997x0 = e5Var.navOptions;
            }
            if ((i13 & 256) != 0) {
                aiAction = e5Var.aiAction;
            }
            C12997x0 c12997x1 = c12997x0;
            AiAction aiAction2 = aiAction;
            MetricEventModel metricEventModel2 = metricEventModel;
            GenericInteraction genericInteraction2 = genericInteraction;
            ScreenAnalyticEventModel screenAnalyticEventModel2 = screenAnalyticEventModel;
            GenericCachePolicy genericCachePolicy2 = genericCachePolicy;
            return e5Var.m59094b(str, apiRequest, genericCachePolicy2, str2, screenAnalyticEventModel2, metricEventModel2, genericInteraction2, c12997x1, aiAction2);
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b */
        public final e5 m59094b(String selectedTab, ApiRequest request, GenericCachePolicy cachePolicy, String navigationStyle, ScreenAnalyticEventModel analyticEvents, MetricEventModel metricEvents, GenericInteraction onStartInteraction, C12997x0 navOptions, AiAction aiAction) {
            AbstractC22676k.m65750j(selectedTab, "selectedTab");
            AbstractC22676k.m65750j(request, "request");
            return new e5(selectedTab, request, cachePolicy, navigationStyle, analyticEvents, metricEvents, onStartInteraction, navOptions, aiAction);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ScreenAnalyticEventModel getAnalyticEvents() {
            return this.analyticEvents;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final GenericCachePolicy getCachePolicy() {
            return this.cachePolicy;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e5)) {
                return false;
            }
            e5 e5Var = (e5) other;
            return AbstractC22676k.m65745e(this.selectedTab, e5Var.selectedTab) && AbstractC22676k.m65745e(this.request, e5Var.request) && AbstractC22676k.m65745e(this.cachePolicy, e5Var.cachePolicy) && AbstractC22676k.m65745e(this.navigationStyle, e5Var.navigationStyle) && AbstractC22676k.m65745e(this.analyticEvents, e5Var.analyticEvents) && AbstractC22676k.m65745e(this.metricEvents, e5Var.metricEvents) && AbstractC22676k.m65745e(this.onStartInteraction, e5Var.onStartInteraction) && AbstractC22676k.m65745e(this.navOptions, e5Var.navOptions) && AbstractC22676k.m65745e(this.aiAction, e5Var.aiAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final MetricEventModel getMetricEvents() {
            return this.metricEvents;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C12997x0 getNavOptions() {
            return this.navOptions;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getNavigationStyle() {
            return this.navigationStyle;
        }

        public int hashCode() {
            int iHashCode = (this.request.hashCode() + (this.selectedTab.hashCode() * 31)) * 31;
            GenericCachePolicy genericCachePolicy = this.cachePolicy;
            int iHashCode2 = (iHashCode + (genericCachePolicy == null ? 0 : genericCachePolicy.hashCode())) * 31;
            String str = this.navigationStyle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ScreenAnalyticEventModel screenAnalyticEventModel = this.analyticEvents;
            int iHashCode4 = (iHashCode3 + (screenAnalyticEventModel == null ? 0 : screenAnalyticEventModel.hashCode())) * 31;
            MetricEventModel metricEventModel = this.metricEvents;
            int iHashCode5 = (iHashCode4 + (metricEventModel == null ? 0 : metricEventModel.hashCode())) * 31;
            GenericInteraction genericInteraction = this.onStartInteraction;
            int iHashCode6 = (iHashCode5 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
            C12997x0 c12997x0 = this.navOptions;
            int iHashCode7 = (iHashCode6 + (c12997x0 == null ? 0 : c12997x0.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            return iHashCode7 + (aiAction != null ? aiAction.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final GenericInteraction getOnStartInteraction() {
            return this.onStartInteraction;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final ApiRequest getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getSelectedTab() {
            return this.selectedTab;
        }

        public String toString() {
            return "TopLevelGenericScreen(selectedTab=" + this.selectedTab + ", request=" + this.request + ", cachePolicy=" + this.cachePolicy + ", navigationStyle=" + this.navigationStyle + ", analyticEvents=" + this.analyticEvents + ", metricEvents=" + this.metricEvents + ", onStartInteraction=" + this.onStartInteraction + ", navOptions=" + this.navOptions + ", aiAction=" + this.aiAction + ")";
        }

        public /* synthetic */ e5(String str, ApiRequest apiRequest, GenericCachePolicy genericCachePolicy, String str2, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, GenericInteraction genericInteraction, C12997x0 c12997x0, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, apiRequest, (i13 & 4) != 0 ? null : genericCachePolicy, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : screenAnalyticEventModel, (i13 & 32) != 0 ? null : metricEventModel, (i13 & 64) != 0 ? null : genericInteraction, (i13 & 128) != 0 ? null : c12997x0, (i13 & 256) != 0 ? null : aiAction);
        }
    }

    /* JADX INFO: renamed from: j02.m0$i5 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b!\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b$\u0010\u0010¨\u0006%"}, m65681d2 = {"Lj02/m0$i5;", "Lj02/m0;", "", "sku", "packSku", "", "childItemSkus", "wywSku", "bandSku", "claspSku", "hookSku", "fastLinkSku", "storeDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "g", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "j", "f", "i", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i5 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sku;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String packSku;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<String> childItemSkus;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String wywSku;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String bandSku;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String claspSku;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String hookSku;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String fastLinkSku;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String storeDomain;

        public i5(String str, String str2, List<String> list, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(null);
            this.sku = str;
            this.packSku = str2;
            this.childItemSkus = list;
            this.wywSku = str3;
            this.bandSku = str4;
            this.claspSku = str5;
            this.hookSku = str6;
            this.fastLinkSku = str7;
            this.storeDomain = str8;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBandSku() {
            return this.bandSku;
        }

        /* JADX INFO: renamed from: c */
        public final List<String> m59151c() {
            return this.childItemSkus;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getClaspSku() {
            return this.claspSku;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getFastLinkSku() {
            return this.fastLinkSku;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i5)) {
                return false;
            }
            i5 i5Var = (i5) other;
            return AbstractC22676k.m65745e(this.sku, i5Var.sku) && AbstractC22676k.m65745e(this.packSku, i5Var.packSku) && AbstractC22676k.m65745e(this.childItemSkus, i5Var.childItemSkus) && AbstractC22676k.m65745e(this.wywSku, i5Var.wywSku) && AbstractC22676k.m65745e(this.bandSku, i5Var.bandSku) && AbstractC22676k.m65745e(this.claspSku, i5Var.claspSku) && AbstractC22676k.m65745e(this.hookSku, i5Var.hookSku) && AbstractC22676k.m65745e(this.fastLinkSku, i5Var.fastLinkSku) && AbstractC22676k.m65745e(this.storeDomain, i5Var.storeDomain);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getHookSku() {
            return this.hookSku;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPackSku() {
            return this.packSku;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        public int hashCode() {
            String str = this.sku;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.packSku;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.childItemSkus;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.wywSku;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.bandSku;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.claspSku;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.hookSku;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.fastLinkSku;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.storeDomain;
            return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getStoreDomain() {
            return this.storeDomain;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getWywSku() {
            return this.wywSku;
        }

        public String toString() {
            String str = this.sku;
            String str2 = this.packSku;
            List<String> list = this.childItemSkus;
            String str3 = this.wywSku;
            String str4 = this.bandSku;
            String str5 = this.claspSku;
            String str6 = this.hookSku;
            String str7 = this.fastLinkSku;
            String str8 = this.storeDomain;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("UniversalBuyNowScreen(sku=", str, ", packSku=", str2, ", childItemSkus=");
            AbstractC17176i.m48511m(", wywSku=", str3, ", bandSku=", sbM32001t, list);
            AbstractC11266d.m30444B(sbM32001t, str4, ", claspSku=", str5, ", hookSku=");
            AbstractC11266d.m30444B(sbM32001t, str6, ", fastLinkSku=", str7, ", storeDomain=");
            return AbstractC25012a.m73376i(str8, ")", sbM32001t);
        }

        public /* synthetic */ i5(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? null : str7, (i13 & 256) != 0 ? null : str8);
        }
    }

    /* JADX INFO: renamed from: j02.m0$m1 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0092\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b+\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b-\u0010>\u001a\u0004\b4\u0010?R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b9\u0010>\u001a\u0004\b0\u0010?¨\u0006@"}, m65681d2 = {"Lj02/m0$m1;", "Lj02/m0;", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lcom/whoop/navigation/GenericCachePolicy;", "cachePolicy", "", "navigationStyle", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "analyticEvents", "Lcom/whoop/analytics/MetricEventModel;", "metricEvents", "Lcom/whoop/navigation/AiAction;", "aiAction", "Lcom/whoop/navigation/models/GenericInteraction;", "onStartInteraction", "Leb/x0;", "navOptions", "", "Lkotlinx/serialization/json/JsonElement;", "loadingTopItems", "errorTopItems", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;)V", "b", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;)Lj02/m0$m1;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/models/ApiRequest;", "l", "()Lcom/whoop/navigation/models/ApiRequest;", "c", "Lcom/whoop/navigation/GenericCachePolicy;", "e", "()Lcom/whoop/navigation/GenericCachePolicy;", "d", "Ljava/lang/String;", "j", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "()Lcom/whoop/analytics/ScreenAnalyticEventModel;", "f", "Lcom/whoop/analytics/MetricEventModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/analytics/MetricEventModel;", "g", "Lcom/whoop/navigation/AiAction;", "a", "()Lcom/whoop/navigation/AiAction;", "Lcom/whoop/navigation/models/GenericInteraction;", "k", "()Lcom/whoop/navigation/models/GenericInteraction;", "i", "Leb/x0;", "()Leb/x0;", "Ljava/util/List;", "()Ljava/util/List;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m1 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ApiRequest request;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final GenericCachePolicy cachePolicy;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String navigationStyle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final ScreenAnalyticEventModel analyticEvents;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final MetricEventModel metricEvents;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final AiAction aiAction;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final GenericInteraction onStartInteraction;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C12997x0 navOptions;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final List<JsonElement> loadingTopItems;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final List<JsonElement> errorTopItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m1(ApiRequest request, GenericCachePolicy genericCachePolicy, String str, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, AiAction aiAction, GenericInteraction genericInteraction, C12997x0 c12997x0, List<? extends JsonElement> list, List<? extends JsonElement> list2) {
            super(null);
            AbstractC22676k.m65750j(request, "request");
            this.request = request;
            this.cachePolicy = genericCachePolicy;
            this.navigationStyle = str;
            this.analyticEvents = screenAnalyticEventModel;
            this.metricEvents = metricEventModel;
            this.aiAction = aiAction;
            this.onStartInteraction = genericInteraction;
            this.navOptions = c12997x0;
            this.loadingTopItems = list;
            this.errorTopItems = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ m1 m59196c(m1 m1Var, ApiRequest apiRequest, GenericCachePolicy genericCachePolicy, String str, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, AiAction aiAction, GenericInteraction genericInteraction, C12997x0 c12997x0, List list, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                apiRequest = m1Var.request;
            }
            if ((i13 & 2) != 0) {
                genericCachePolicy = m1Var.cachePolicy;
            }
            if ((i13 & 4) != 0) {
                str = m1Var.navigationStyle;
            }
            if ((i13 & 8) != 0) {
                screenAnalyticEventModel = m1Var.analyticEvents;
            }
            if ((i13 & 16) != 0) {
                metricEventModel = m1Var.metricEvents;
            }
            if ((i13 & 32) != 0) {
                aiAction = m1Var.aiAction;
            }
            if ((i13 & 64) != 0) {
                genericInteraction = m1Var.onStartInteraction;
            }
            if ((i13 & 128) != 0) {
                c12997x0 = m1Var.navOptions;
            }
            if ((i13 & 256) != 0) {
                list = m1Var.loadingTopItems;
            }
            if ((i13 & 512) != 0) {
                list2 = m1Var.errorTopItems;
            }
            List list3 = list;
            List list4 = list2;
            GenericInteraction genericInteraction2 = genericInteraction;
            C12997x0 c12997x1 = c12997x0;
            MetricEventModel metricEventModel2 = metricEventModel;
            AiAction aiAction2 = aiAction;
            return m1Var.m59197b(apiRequest, genericCachePolicy, str, screenAnalyticEventModel, metricEventModel2, aiAction2, genericInteraction2, c12997x1, list3, list4);
        }

        @Override // j02.AbstractC21155m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public AiAction getAiAction() {
            return this.aiAction;
        }

        /* JADX INFO: renamed from: b */
        public final m1 m59197b(ApiRequest request, GenericCachePolicy cachePolicy, String navigationStyle, ScreenAnalyticEventModel analyticEvents, MetricEventModel metricEvents, AiAction aiAction, GenericInteraction onStartInteraction, C12997x0 navOptions, List<? extends JsonElement> loadingTopItems, List<? extends JsonElement> errorTopItems) {
            AbstractC22676k.m65750j(request, "request");
            return new m1(request, cachePolicy, navigationStyle, analyticEvents, metricEvents, aiAction, onStartInteraction, navOptions, loadingTopItems, errorTopItems);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ScreenAnalyticEventModel getAnalyticEvents() {
            return this.analyticEvents;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final GenericCachePolicy getCachePolicy() {
            return this.cachePolicy;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m1)) {
                return false;
            }
            m1 m1Var = (m1) other;
            return AbstractC22676k.m65745e(this.request, m1Var.request) && AbstractC22676k.m65745e(this.cachePolicy, m1Var.cachePolicy) && AbstractC22676k.m65745e(this.navigationStyle, m1Var.navigationStyle) && AbstractC22676k.m65745e(this.analyticEvents, m1Var.analyticEvents) && AbstractC22676k.m65745e(this.metricEvents, m1Var.metricEvents) && AbstractC22676k.m65745e(this.aiAction, m1Var.aiAction) && AbstractC22676k.m65745e(this.onStartInteraction, m1Var.onStartInteraction) && AbstractC22676k.m65745e(this.navOptions, m1Var.navOptions) && AbstractC22676k.m65745e(this.loadingTopItems, m1Var.loadingTopItems) && AbstractC22676k.m65745e(this.errorTopItems, m1Var.errorTopItems);
        }

        /* JADX INFO: renamed from: f */
        public final List<JsonElement> m59200f() {
            return this.errorTopItems;
        }

        /* JADX INFO: renamed from: g */
        public final List<JsonElement> m59201g() {
            return this.loadingTopItems;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final MetricEventModel getMetricEvents() {
            return this.metricEvents;
        }

        public int hashCode() {
            int iHashCode = this.request.hashCode() * 31;
            GenericCachePolicy genericCachePolicy = this.cachePolicy;
            int iHashCode2 = (iHashCode + (genericCachePolicy == null ? 0 : genericCachePolicy.hashCode())) * 31;
            String str = this.navigationStyle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ScreenAnalyticEventModel screenAnalyticEventModel = this.analyticEvents;
            int iHashCode4 = (iHashCode3 + (screenAnalyticEventModel == null ? 0 : screenAnalyticEventModel.hashCode())) * 31;
            MetricEventModel metricEventModel = this.metricEvents;
            int iHashCode5 = (iHashCode4 + (metricEventModel == null ? 0 : metricEventModel.hashCode())) * 31;
            AiAction aiAction = this.aiAction;
            int iHashCode6 = (iHashCode5 + (aiAction == null ? 0 : aiAction.hashCode())) * 31;
            GenericInteraction genericInteraction = this.onStartInteraction;
            int iHashCode7 = (iHashCode6 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
            C12997x0 c12997x0 = this.navOptions;
            int iHashCode8 = (iHashCode7 + (c12997x0 == null ? 0 : c12997x0.hashCode())) * 31;
            List<JsonElement> list = this.loadingTopItems;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            List<JsonElement> list2 = this.errorTopItems;
            return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C12997x0 getNavOptions() {
            return this.navOptions;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getNavigationStyle() {
            return this.navigationStyle;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final GenericInteraction getOnStartInteraction() {
            return this.onStartInteraction;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final ApiRequest getRequest() {
            return this.request;
        }

        public String toString() {
            ApiRequest apiRequest = this.request;
            GenericCachePolicy genericCachePolicy = this.cachePolicy;
            String str = this.navigationStyle;
            ScreenAnalyticEventModel screenAnalyticEventModel = this.analyticEvents;
            MetricEventModel metricEventModel = this.metricEvents;
            AiAction aiAction = this.aiAction;
            GenericInteraction genericInteraction = this.onStartInteraction;
            C12997x0 c12997x0 = this.navOptions;
            List<JsonElement> list = this.loadingTopItems;
            List<JsonElement> list2 = this.errorTopItems;
            StringBuilder sb4 = new StringBuilder("GenericNavigationScreen(request=");
            sb4.append(apiRequest);
            sb4.append(", cachePolicy=");
            sb4.append(genericCachePolicy);
            sb4.append(", navigationStyle=");
            sb4.append(str);
            sb4.append(", analyticEvents=");
            sb4.append(screenAnalyticEventModel);
            sb4.append(", metricEvents=");
            sb4.append(metricEventModel);
            sb4.append(", aiAction=");
            sb4.append(aiAction);
            sb4.append(", onStartInteraction=");
            sb4.append(genericInteraction);
            sb4.append(", navOptions=");
            sb4.append(c12997x0);
            sb4.append(", loadingTopItems=");
            return AbstractC30007c.m91843m(sb4, list, ", errorTopItems=", list2, ")");
        }

        public /* synthetic */ m1(ApiRequest apiRequest, GenericCachePolicy genericCachePolicy, String str, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, AiAction aiAction, GenericInteraction genericInteraction, C12997x0 c12997x0, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(apiRequest, (i13 & 2) != 0 ? null : genericCachePolicy, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : screenAnalyticEventModel, (i13 & 16) != 0 ? null : metricEventModel, (i13 & 32) != 0 ? null : aiAction, (i13 & 64) != 0 ? null : genericInteraction, (i13 & 128) != 0 ? null : c12997x0, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : list2);
        }
    }

    /* JADX INFO: renamed from: j02.m0$z */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b%\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b#\u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b(\u0010\u0015R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b\u001d\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b'\u0010\u0015¨\u0006/"}, m65681d2 = {"Lj02/m0$z;", "Lj02/m0;", "", "suggestionCategory", "hint", "contextualMessage", "conversationIdSeed", "sourcePillar", "sourceType", "presetQuestion", "presetQuestionKey", "", "includeInitialMessage", "sourceId", "", "Lkotlinx/serialization/json/JsonElement;", "args", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "l", "c", "e", "d", "f", "j", "g", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "getPresetQuestionKey", "Z", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;", "m", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String suggestionCategory;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String hint;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String contextualMessage;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String conversationIdSeed;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String sourcePillar;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String sourceType;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String presetQuestion;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String presetQuestionKey;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean includeInitialMessage;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final Map<String, JsonElement> args;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public z(String suggestionCategory, String hint, String contextualMessage, String str, String str2, String str3, String str4, String str5, boolean z4, String sourceId, Map<String, ? extends JsonElement> args, String str6) {
            super(null);
            AbstractC22676k.m65750j(suggestionCategory, "suggestionCategory");
            AbstractC22676k.m65750j(hint, "hint");
            AbstractC22676k.m65750j(contextualMessage, "contextualMessage");
            AbstractC22676k.m65750j(sourceId, "sourceId");
            AbstractC22676k.m65750j(args, "args");
            this.suggestionCategory = suggestionCategory;
            this.hint = hint;
            this.contextualMessage = contextualMessage;
            this.conversationIdSeed = str;
            this.sourcePillar = str2;
            this.sourceType = str3;
            this.presetQuestion = str4;
            this.presetQuestionKey = str5;
            this.includeInitialMessage = z4;
            this.sourceId = sourceId;
            this.args = args;
            this.source = str6;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, JsonElement> m59369b() {
            return this.args;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getContextualMessage() {
            return this.contextualMessage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getConversationIdSeed() {
            return this.conversationIdSeed;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof z)) {
                return false;
            }
            z zVar = (z) other;
            return AbstractC22676k.m65745e(this.suggestionCategory, zVar.suggestionCategory) && AbstractC22676k.m65745e(this.hint, zVar.hint) && AbstractC22676k.m65745e(this.contextualMessage, zVar.contextualMessage) && AbstractC22676k.m65745e(this.conversationIdSeed, zVar.conversationIdSeed) && AbstractC22676k.m65745e(this.sourcePillar, zVar.sourcePillar) && AbstractC22676k.m65745e(this.sourceType, zVar.sourceType) && AbstractC22676k.m65745e(this.presetQuestion, zVar.presetQuestion) && AbstractC22676k.m65745e(this.presetQuestionKey, zVar.presetQuestionKey) && this.includeInitialMessage == zVar.includeInitialMessage && AbstractC22676k.m65745e(this.sourceId, zVar.sourceId) && AbstractC22676k.m65745e(this.args, zVar.args) && AbstractC22676k.m65745e(this.source, zVar.source);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIncludeInitialMessage() {
            return this.includeInitialMessage;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPresetQuestion() {
            return this.presetQuestion;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.suggestionCategory.hashCode() * 31, 31, this.hint), 31, this.contextualMessage);
            String str = this.conversationIdSeed;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sourcePillar;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sourceType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.presetQuestion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.presetQuestionKey;
            int iM11821e = AbstractC3855a.m11821e(this.args, AbstractC11266d.m30450d(AbstractC2875y.m8289b((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.includeInitialMessage), 31, this.sourceId), 31);
            String str6 = this.source;
            return iM11821e + (str6 != null ? str6.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getSourcePillar() {
            return this.sourcePillar;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getSuggestionCategory() {
            return this.suggestionCategory;
        }

        public String toString() {
            String str = this.suggestionCategory;
            String str2 = this.hint;
            String str3 = this.contextualMessage;
            String str4 = this.conversationIdSeed;
            String str5 = this.sourcePillar;
            String str6 = this.sourceType;
            String str7 = this.presetQuestion;
            String str8 = this.presetQuestionKey;
            boolean z4 = this.includeInitialMessage;
            String str9 = this.sourceId;
            Map<String, JsonElement> map = this.args;
            String str10 = this.source;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("AiChatScreen(suggestionCategory=", str, ", hint=", str2, ", contextualMessage=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", conversationIdSeed=", str4, ", sourcePillar=");
            AbstractC11266d.m30444B(sbM32001t, str5, ", sourceType=", str6, ", presetQuestion=");
            AbstractC11266d.m30444B(sbM32001t, str7, ", presetQuestionKey=", str8, ", includeInitialMessage=");
            AbstractC38963t7.m124391u(sbM32001t, z4, ", sourceId=", str9, ", args=");
            sbM32001t.append(map);
            sbM32001t.append(", source=");
            sbM32001t.append(str10);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ z(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z4, String str9, Map map, String str10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) == 0 ? str8 : null, (i13 & 256) != 0 ? true : z4, (i13 & 512) != 0 ? "" : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25272z.f99163w : map, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? "" : str10);
        }
    }

    /* JADX INFO: renamed from: j02.m0$e2 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0098\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b(\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b&\u00103R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b4\u0010%R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b5\u0010\u0018R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b\u0012\u0010%¨\u00066"}, m65681d2 = {"Lj02/m0$e2;", "Lj02/m0;", "", "requestDate", "", "isFromAutoPop", "shouldShowJournalTutorial", "", "cycleId", "previousCycleStartTime", "previousCycleEndTime", "Ljava/time/LocalDate;", "currentCycleStartDay", "currentCycleEndDay", "newHome", "source", "label", "fromFab", "isAutoPop", "<init>", "(Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/Long;Ljava/time/LocalDate;Ljava/time/LocalDate;ZLjava/lang/String;Ljava/lang/String;ZZ)V", "b", "(Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/Long;Ljava/time/LocalDate;Ljava/time/LocalDate;ZLjava/lang/String;Ljava/lang/String;ZZ)Lj02/m0$e2;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "l", "c", "Z", "o", "()Z", "d", "m", "e", "J", "f", "()J", "Ljava/lang/Long;", "k", "()Ljava/lang/Long;", "g", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "i", "n", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e2 extends AbstractC21155m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String requestDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isFromAutoPop;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean shouldShowJournalTutorial;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Long previousCycleStartTime;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final Long previousCycleEndTime;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final LocalDate currentCycleStartDay;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final LocalDate currentCycleEndDay;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean newHome;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final boolean fromFab;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final boolean isAutoPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e2(String requestDate, boolean z4, boolean z13, long j7, Long l7, Long l12, LocalDate currentCycleStartDay, LocalDate localDate, boolean z14, String source, String label, boolean z15, boolean z16) {
            super(null);
            AbstractC22676k.m65750j(requestDate, "requestDate");
            AbstractC22676k.m65750j(currentCycleStartDay, "currentCycleStartDay");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(label, "label");
            this.requestDate = requestDate;
            this.isFromAutoPop = z4;
            this.shouldShowJournalTutorial = z13;
            this.cycleId = j7;
            this.previousCycleStartTime = l7;
            this.previousCycleEndTime = l12;
            this.currentCycleStartDay = currentCycleStartDay;
            this.currentCycleEndDay = localDate;
            this.newHome = z14;
            this.source = source;
            this.label = label;
            this.fromFab = z15;
            this.isAutoPop = z16;
        }

        /* JADX INFO: renamed from: b */
        public final e2 m59078b(String requestDate, boolean isFromAutoPop, boolean shouldShowJournalTutorial, long cycleId, Long previousCycleStartTime, Long previousCycleEndTime, LocalDate currentCycleStartDay, LocalDate currentCycleEndDay, boolean newHome, String source, String label, boolean fromFab, boolean isAutoPop) {
            AbstractC22676k.m65750j(requestDate, "requestDate");
            AbstractC22676k.m65750j(currentCycleStartDay, "currentCycleStartDay");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(label, "label");
            return new e2(requestDate, isFromAutoPop, shouldShowJournalTutorial, cycleId, previousCycleStartTime, previousCycleEndTime, currentCycleStartDay, currentCycleEndDay, newHome, source, label, fromFab, isAutoPop);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getCurrentCycleEndDay() {
            return this.currentCycleEndDay;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDate getCurrentCycleStartDay() {
            return this.currentCycleStartDay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e2)) {
                return false;
            }
            e2 e2Var = (e2) other;
            return AbstractC22676k.m65745e(this.requestDate, e2Var.requestDate) && this.isFromAutoPop == e2Var.isFromAutoPop && this.shouldShowJournalTutorial == e2Var.shouldShowJournalTutorial && this.cycleId == e2Var.cycleId && AbstractC22676k.m65745e(this.previousCycleStartTime, e2Var.previousCycleStartTime) && AbstractC22676k.m65745e(this.previousCycleEndTime, e2Var.previousCycleEndTime) && AbstractC22676k.m65745e(this.currentCycleStartDay, e2Var.currentCycleStartDay) && AbstractC22676k.m65745e(this.currentCycleEndDay, e2Var.currentCycleEndDay) && this.newHome == e2Var.newHome && AbstractC22676k.m65745e(this.source, e2Var.source) && AbstractC22676k.m65745e(this.label, e2Var.label) && this.fromFab == e2Var.fromFab && this.isAutoPop == e2Var.isAutoPop;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getFromFab() {
            return this.fromFab;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iM30451e = AbstractC11266d.m30451e(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.requestDate.hashCode() * 31, 31, this.isFromAutoPop), 31, this.shouldShowJournalTutorial), this.cycleId, 31);
            Long l7 = this.previousCycleStartTime;
            int iHashCode = (iM30451e + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l12 = this.previousCycleEndTime;
            int iM38558e = AbstractC13673n.m38558e(this.currentCycleStartDay, (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31);
            LocalDate localDate = this.currentCycleEndDay;
            return Boolean.hashCode(this.isAutoPop) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b((iM38558e + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.newHome), 31, this.source), 31, this.label), 31, this.fromFab);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getNewHome() {
            return this.newHome;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Long getPreviousCycleEndTime() {
            return this.previousCycleEndTime;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Long getPreviousCycleStartTime() {
            return this.previousCycleStartTime;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getRequestDate() {
            return this.requestDate;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getShouldShowJournalTutorial() {
            return this.shouldShowJournalTutorial;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getIsFromAutoPop() {
            return this.isFromAutoPop;
        }

        public String toString() {
            String str = this.requestDate;
            boolean z4 = this.isFromAutoPop;
            boolean z13 = this.shouldShowJournalTutorial;
            long j7 = this.cycleId;
            Long l7 = this.previousCycleStartTime;
            Long l12 = this.previousCycleEndTime;
            LocalDate localDate = this.currentCycleStartDay;
            LocalDate localDate2 = this.currentCycleEndDay;
            boolean z14 = this.newHome;
            String str2 = this.source;
            String str3 = this.label;
            boolean z15 = this.fromFab;
            boolean z16 = this.isAutoPop;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("JournalNavigationScreen(requestDate=", str, ", isFromAutoPop=", ", shouldShowJournalTutorial=", z4);
            sbM73379l.append(z13);
            sbM73379l.append(", cycleId=");
            sbM73379l.append(j7);
            sbM73379l.append(", previousCycleStartTime=");
            sbM73379l.append(l7);
            sbM73379l.append(", previousCycleEndTime=");
            sbM73379l.append(l12);
            sbM73379l.append(", currentCycleStartDay=");
            sbM73379l.append(localDate);
            sbM73379l.append(", currentCycleEndDay=");
            sbM73379l.append(localDate2);
            sbM73379l.append(", newHome=");
            sbM73379l.append(z14);
            sbM73379l.append(", source=");
            sbM73379l.append(str2);
            sbM73379l.append(", label=");
            sbM73379l.append(str3);
            sbM73379l.append(", fromFab=");
            sbM73379l.append(z15);
            sbM73379l.append(", isAutoPop=");
            sbM73379l.append(z16);
            sbM73379l.append(")");
            return sbM73379l.toString();
        }

        public /* synthetic */ e2(String str, boolean z4, boolean z13, long j7, Long l7, Long l12, LocalDate localDate, LocalDate localDate2, boolean z14, String str2, String str3, boolean z15, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, z4, z13, j7, l7, l12, localDate, localDate2, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? "" : str2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "" : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z15, (i13 & 4096) != 0 ? false : z16);
        }
    }
}

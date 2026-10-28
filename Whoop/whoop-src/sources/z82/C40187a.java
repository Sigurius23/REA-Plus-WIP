package z82;

import a20.C0162b;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.InterfaceC4368h;
import ci2.InterfaceC4733b;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.LanguageChecker;
import com.whoop.data.repositories.RestingHeartRate;
import com.whoop.data.repositories.UserRepository;
import com.whoop.domain.model.FitnessLevel;
import com.whoop.domain.model.Gender;
import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.service.network.model.UserState;
import cq0.C11059g;
import ei0.InterfaceC13218a;
import fi0.C14519e;
import fi0.EnumC14518d;
import fi0.InterfaceC14517c;
import i92.C18258c;
import ih0.AbstractC18489d0;
import in2.InterfaceC18736h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import od1.C27847j;
import od1.C27858u;
import od1.C27861x;
import oh2.InterfaceC27939b;
import or2.AbstractC28165h;
import or2.AbstractC28202t0;
import or2.C28162g;
import or2.InterfaceC28197r1;
import org.joda.time.DateTime;
import p173gj.C15903d;
import p197hj.C17319b;
import p459rf.C31345p;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q92.C30076h;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rv1.C31842a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32975s;
import st0.EnumC32978v;
import st0.InterfaceC32974r;
import tr2.InterfaceC34116n;
import we1.AbstractC37230n;
import we1.InterfaceC37229m;
import xg3.AbstractC38284k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: z82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b@\b\u0007\u0018\u0000 v2\u00020\u0001:\u0001QBÁ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0010\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u0002022\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J+\u0010<\u001a\u0002022\u0006\u00106\u001a\u0002052\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020:09H\u0016¢\u0006\u0004\b<\u0010=J7\u0010B\u001a\u0002022\b\u0010>\u001a\u0004\u0018\u0001052\b\u0010?\u001a\u0004\u0018\u0001052\b\u0010@\u001a\u0004\u0018\u0001052\b\u0010A\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\bB\u0010CJA\u0010E\u001a\u0002022\b\u0010>\u001a\u0004\u0018\u0001052\b\u0010?\u001a\u0004\u0018\u0001052\b\u0010@\u001a\u0004\u0018\u0001052\b\u0010A\u001a\u0004\u0018\u0001052\b\u0010D\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\bE\u0010FJY\u0010H\u001a\u0002022\b\u0010>\u001a\u0004\u0018\u0001052\b\u0010?\u001a\u0004\u0018\u0001052\b\u0010@\u001a\u0004\u0018\u0001052\b\u0010A\u001a\u0004\u0018\u0001052\b\u0010D\u001a\u0004\u0018\u0001052\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u00010:\u0018\u000109H\u0016¢\u0006\u0004\bH\u0010IJO\u0010J\u001a\u0002022\b\u0010>\u001a\u0004\u0018\u0001052\b\u0010?\u001a\u0004\u0018\u0001052\b\u0010@\u001a\u0004\u0018\u0001052\b\u0010A\u001a\u0004\u0018\u0001052\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u00010:\u0018\u000109H\u0016¢\u0006\u0004\bJ\u0010KJw\u0010O\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u0001052\b\u0010>\u001a\u0004\u0018\u0001052\b\u0010L\u001a\u0004\u0018\u0001052\b\u0010M\u001a\u0004\u0018\u0001052\b\u0010N\u001a\u0004\u0018\u0001052\b\u0010?\u001a\u0004\u0018\u0001052\b\u0010@\u001a\u0004\u0018\u0001052\b\u0010D\u001a\u0004\u0018\u0001052\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u00010:\u0018\u000109H\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u000202H\u0016¢\u0006\u0004\bQ\u00104J\u0017\u0010T\u001a\u0002022\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ\u0018\u0010X\u001a\u0002022\u0006\u0010W\u001a\u00020VH\u0082@¢\u0006\u0004\bX\u0010YJJ\u0010a\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020:092\b\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010W\u001a\u00020V2\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010`\u001a\u0004\u0018\u000105H\u0082@¢\u0006\u0004\ba\u0010bJS\u0010e\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u0001052\u0014\u0010d\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020:\u0018\u00010c2\n\b\u0002\u0010L\u001a\u0004\u0018\u0001052\n\b\u0002\u0010M\u001a\u0004\u0018\u0001052\n\b\u0002\u0010N\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\be\u0010fJ3\u0010h\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u00010:092\u0014\u0010g\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u00010:09H\u0002¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u0004\u0018\u00010:2\b\u0010D\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bj\u0010kJ\u001b\u0010m\u001a\u0004\u0018\u00010:2\b\u0010l\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bm\u0010kJ\u0017\u0010o\u001a\u0002052\u0006\u0010n\u001a\u000205H\u0002¢\u0006\u0004\bo\u0010pJG\u0010q\u001a\u0002022\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020:0c2\n\b\u0002\u0010L\u001a\u0004\u0018\u0001052\n\b\u0002\u0010M\u001a\u0004\u0018\u0001052\n\b\u0002\u0010N\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bq\u0010rJ#\u0010s\u001a\u0002022\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020:0cH\u0002¢\u0006\u0004\bs\u0010tJ#\u0010v\u001a\u0002022\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020:0cH\u0002¢\u0006\u0004\bv\u0010tJ\u0017\u0010x\u001a\u0002052\u0006\u0010w\u001a\u000205H\u0002¢\u0006\u0004\bx\u0010pJ\u001c\u0010y\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020:0cH\u0082@¢\u0006\u0004\by\u0010zR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010{R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010|R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010}R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010~R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u007fR\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010\u0080\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010\u0081\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010\u0082\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bT\u0010\u0085\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010\u0086\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010\u009f\u0001\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010¡\u0001\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u009e\u0001R\u0018\u0010¢\u0001\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bs\u0010\u009e\u0001¨\u0006£\u0001"}, m65681d2 = {"Lz82/a;", "Lfi0/c;", "Lod1/j;", "userSessionRepo", "Lcq0/g;", "teamsRepository", "Lod1/u;", "userContext", "Lrv1/a;", "membershipRepository", "Lwe1/m;", "membershipTypeProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "applicationScope", "Lod1/x;", "userMgr", "Lcom/whoop/data/repositories/UserRepository;", "userRepository", "Lin2/h;", "Lxg3/k;", "Lcom/whoop/ui/util/SchedulerFactory;", "schedulerFactory", "Lq92/h;", "whoopStrapSharedPrefs", "Lci2/b;", "whoopStrapProvider", "Lgj/d;", "analytics", "Lfi0/e;", "pushNotificationPermissionStatus", "Ltr2/n;", "logger", "Li92/c;", "installationUuidProvider", "Lcom/whoop/data/repositories/LanguageChecker;", "languageRepository", "Lor2/g;", "buildConfigProvider", "Lor2/r1;", "systemResources", "Lca2/h;", "rawDataTrackingService", "Lst0/r;", "strapLockStateTracker", "Lei0/a;", "amplitudeEngagementClient", "<init>", "(Lod1/j;Lcq0/g;Lod1/u;Lrv1/a;Lwe1/m;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Lod1/x;Lcom/whoop/data/repositories/UserRepository;Lin2/h;Lq92/h;Lci2/b;Lgj/d;Lfi0/e;Ltr2/n;Li92/c;Lcom/whoop/data/repositories/LanguageChecker;Lor2/g;Lor2/r1;Lca2/h;Lst0/r;Lei0/a;)V", "Ll83/a0;", "b", "()V", "", "screenName", "g", "(Ljava/lang/String;)V", "", "", "extraData", "e", "(Ljava/lang/String;Ljava/util/Map;)V", "category", "action", "label", "eventName", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "value", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "otherProperties", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "maximVersion", "nordicVersion", "strapGeneration", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "a", "", "force", "j", "(Z)V", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "D", "(Lcom/whoop/domain/model/User;Lq83/d;)Ljava/lang/Object;", "", "teamsCount", "Lcom/whoop/data/repositories/RestingHeartRate;", "restingHr", "Lfi0/d;", "pushPermissionStatus", "userCategory", "C", "(Ljava/lang/Integer;Lcom/whoop/data/repositories/RestingHeartRate;Lcom/whoop/domain/model/User;Lfi0/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "properties", "L", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "input", "I", "(Ljava/util/Map;)Ljava/util/Map;", "J", "(Ljava/lang/Object;)Ljava/lang/Object;", "element", "H", "source", "K", "(Ljava/lang/String;)Ljava/lang/String;", "A", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "y", "(Ljava/util/Map;)V", "traits", "z", "languagePlusRegionString", "G", "B", "(Lq83/d;)Ljava/lang/Object;", "Lod1/j;", "Lcq0/g;", "Lod1/u;", "Lrv1/a;", "Lwe1/m;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lbc3/c0;", "Lod1/x;", "i", "Lcom/whoop/data/repositories/UserRepository;", "Lin2/h;", "Lq92/h;", "l", "Lci2/b;", "m", "Lgj/d;", "n", "Lfi0/e;", "o", "Ltr2/n;", "p", "Li92/c;", "q", "Lcom/whoop/data/repositories/LanguageChecker;", "r", "Lor2/g;", "s", "Lor2/r1;", "t", "Lca2/h;", "u", "Lst0/r;", "v", "Lei0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Z", "identifiedInstallationId", "x", "identifiedUserId", "identifiedFullUser", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40187a implements InterfaceC14517c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27847j userSessionRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC37229m membershipTypeProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationScope;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C27861x userMgr;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC18736h<AbstractC38284k> schedulerFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C15903d analytics;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C14519e pushNotificationPermissionStatus;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C18258c installationUuidProvider;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final LanguageChecker languageRepository;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final InterfaceC28197r1 systemResources;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final InterfaceC32974r strapLockStateTracker;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final InterfaceC13218a amplitudeEngagementClient;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean identifiedInstallationId;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean identifiedUserId;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean identifiedFullUser;

    /* JADX INFO: renamed from: A */
    public static final int f173424A = 8;

    /* JADX INFO: renamed from: z82.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.analytics.AmplitudeAnalyticsManager", m100430f = "AmplitudeAnalyticsManager.kt", m100431l = {426}, m100432m = "buildBaseTraits", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f173452F;

        /* JADX INFO: renamed from: w */
        Object f173453w;

        /* JADX INFO: renamed from: x */
        Object f173454x;

        /* JADX INFO: renamed from: y */
        Object f173455y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f173456z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173456z = obj;
            this.f173452F |= Integer.MIN_VALUE;
            return C40187a.this.m128946B(this);
        }
    }

    /* JADX INFO: renamed from: z82.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.service.analytics.AmplitudeAnalyticsManager", m100430f = "AmplitudeAnalyticsManager.kt", m100431l = {253}, m100432m = "buildUserTraits", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f173457E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f173458F;

        /* JADX INFO: renamed from: H */
        int f173460H;

        /* JADX INFO: renamed from: w */
        Object f173461w;

        /* JADX INFO: renamed from: x */
        Object f173462x;

        /* JADX INFO: renamed from: y */
        Object f173463y;

        /* JADX INFO: renamed from: z */
        Object f173464z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173458F = obj;
            this.f173460H |= Integer.MIN_VALUE;
            return C40187a.this.m128947C(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: z82.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.service.analytics.AmplitudeAnalyticsManager", m100430f = "AmplitudeAnalyticsManager.kt", m100431l = {231, 232, 233, 239}, m100432m = "callIdentify", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f173465E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f173466F;

        /* JADX INFO: renamed from: H */
        int f173468H;

        /* JADX INFO: renamed from: w */
        Object f173469w;

        /* JADX INFO: renamed from: x */
        Object f173470x;

        /* JADX INFO: renamed from: y */
        Object f173471y;

        /* JADX INFO: renamed from: z */
        Object f173472z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173466F = obj;
            this.f173468H |= Integer.MIN_VALUE;
            return C40187a.this.m128948D(null, this);
        }
    }

    /* JADX INFO: renamed from: z82.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.service.analytics.AmplitudeAnalyticsManager$identifyUser$1", m100430f = "AmplitudeAnalyticsManager.kt", m100431l = {203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173473w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ User f173475y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(User user, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173475y = user;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40187a.this.new e(this.f173475y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173473w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C40187a c40187a = C40187a.this;
                    User user = this.f173475y;
                    this.f173473w = 1;
                    if (c40187a.m128948D(user, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                C40187a.this.logger.mo85230v("Failed to identify user", e5, new AbstractC30556a.a[0]);
                C40187a.this.identifiedFullUser = false;
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z82.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.service.analytics.AmplitudeAnalyticsManager$identifyUser$2", m100430f = "AmplitudeAnalyticsManager.kt", m100431l = {216, 221}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173476w;

        /* JADX INFO: renamed from: x */
        Object f173477x;

        /* JADX INFO: renamed from: y */
        int f173478y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40187a.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C15903d c15903d;
            C15903d c15903d2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173478y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                int provisionalUserId = C40187a.this.userSessionRepo.getProvisionalUserId();
                if (provisionalUserId != 0) {
                    C40187a.this.analytics.m44887i(String.valueOf(provisionalUserId));
                    C15903d c15903d3 = C40187a.this.analytics;
                    C40187a c40187a = C40187a.this;
                    this.f173477x = c15903d3;
                    this.f173476w = provisionalUserId;
                    this.f173478y = 1;
                    obj = c40187a.m128946B(this);
                    if (obj != enumC31071a) {
                        c15903d2 = c15903d3;
                        C15903d.m44879g(c15903d2, (Map) obj);
                        C40187a.this.identifiedUserId = true;
                    }
                } else if (!C40187a.this.identifiedInstallationId) {
                    C40187a.this.analytics.m44887i(null);
                    C15903d c15903d4 = C40187a.this.analytics;
                    C40187a c40187a2 = C40187a.this;
                    this.f173477x = c15903d4;
                    this.f173476w = provisionalUserId;
                    this.f173478y = 2;
                    obj = c40187a2.m128946B(this);
                    if (obj != enumC31071a) {
                        c15903d = c15903d4;
                        C15903d.m44879g(c15903d, (Map) obj);
                        C40187a.this.identifiedInstallationId = true;
                    }
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                c15903d2 = (C15903d) this.f173477x;
                AbstractC34132o.m107864I(obj);
                C15903d.m44879g(c15903d2, (Map) obj);
                C40187a.this.identifiedUserId = true;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c15903d = (C15903d) this.f173477x;
                AbstractC34132o.m107864I(obj);
                C15903d.m44879g(c15903d, (Map) obj);
                C40187a.this.identifiedInstallationId = true;
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40187a(C27847j userSessionRepo, C11059g teamsRepository, C27858u userContext, C31842a membershipRepository, InterfaceC37229m membershipTypeProvider, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 applicationScope, C27861x userMgr, UserRepository userRepository, InterfaceC18736h<? extends AbstractC38284k> schedulerFactory, C30076h whoopStrapSharedPrefs, InterfaceC4733b whoopStrapProvider, C15903d analytics, C14519e pushNotificationPermissionStatus, InterfaceC34116n logger, C18258c installationUuidProvider, LanguageChecker languageRepository, C28162g buildConfigProvider, InterfaceC28197r1 systemResources, InterfaceC4368h rawDataTrackingService, InterfaceC32974r strapLockStateTracker, InterfaceC13218a amplitudeEngagementClient) {
        AbstractC22676k.m65750j(userSessionRepo, "userSessionRepo");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        AbstractC22676k.m65750j(membershipTypeProvider, "membershipTypeProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(userMgr, "userMgr");
        AbstractC22676k.m65750j(userRepository, "userRepository");
        AbstractC22676k.m65750j(schedulerFactory, "schedulerFactory");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(pushNotificationPermissionStatus, "pushNotificationPermissionStatus");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(installationUuidProvider, "installationUuidProvider");
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(systemResources, "systemResources");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        AbstractC22676k.m65750j(strapLockStateTracker, "strapLockStateTracker");
        AbstractC22676k.m65750j(amplitudeEngagementClient, "amplitudeEngagementClient");
        this.userSessionRepo = userSessionRepo;
        this.teamsRepository = teamsRepository;
        this.userContext = userContext;
        this.membershipRepository = membershipRepository;
        this.membershipTypeProvider = membershipTypeProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.applicationScope = applicationScope;
        this.userMgr = userMgr;
        this.userRepository = userRepository;
        this.schedulerFactory = schedulerFactory;
        this.whoopStrapSharedPrefs = whoopStrapSharedPrefs;
        this.whoopStrapProvider = whoopStrapProvider;
        this.analytics = analytics;
        this.pushNotificationPermissionStatus = pushNotificationPermissionStatus;
        this.logger = logger;
        this.installationUuidProvider = installationUuidProvider;
        this.languageRepository = languageRepository;
        this.buildConfigProvider = buildConfigProvider;
        this.systemResources = systemResources;
        this.rawDataTrackingService = rawDataTrackingService;
        this.strapLockStateTracker = strapLockStateTracker;
        this.amplitudeEngagementClient = amplitudeEngagementClient;
    }

    /* JADX INFO: renamed from: A */
    private final void m128945A(Map<String, Object> properties, String maximVersion, String nordicVersion, String strapGeneration) {
        EnumC32978v whoopDeviceType;
        InterfaceC27939b bluetoothVersion;
        InterfaceC27939b maximVersion2;
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        WhoopStrapInfo whoopStrapInfo = interfaceC21750d != null ? interfaceC21750d.get_strapInfo() : null;
        if (maximVersion == null) {
            maximVersion = (whoopStrapInfo == null || (maximVersion2 = whoopStrapInfo.getMaximVersion()) == null) ? null : maximVersion2.mo84319a();
            if (maximVersion == null) {
                maximVersion = this.whoopStrapSharedPrefs.m92198d();
            }
        }
        if (maximVersion.length() > 0) {
            properties.put("Maxim Version", maximVersion);
        }
        if (nordicVersion == null) {
            nordicVersion = (whoopStrapInfo == null || (bluetoothVersion = whoopStrapInfo.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
            if (nordicVersion == null) {
                nordicVersion = this.whoopStrapSharedPrefs.m92199e();
            }
        }
        if (nordicVersion.length() > 0) {
            properties.put("Nordic Version", nordicVersion);
        }
        if (strapGeneration == null) {
            strapGeneration = (whoopStrapInfo == null || (whoopDeviceType = whoopStrapInfo.getWhoopDeviceType()) == null) ? null : EnumC32978v.INSTANCE.m104089b(whoopDeviceType);
            if (strapGeneration == null) {
                strapGeneration = this.whoopStrapSharedPrefs.m92201g();
            }
        }
        if (strapGeneration == null || strapGeneration.length() == 0) {
            return;
        }
        properties.put("Strap Generation", strapGeneration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m128946B(InterfaceC30057d<? super Map<String, Object>> interfaceC30057d) {
        b bVar;
        Map linkedHashMap;
        Map map;
        String str;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f173452F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f173452F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM52601f = bVar.f173456z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f173452F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM52601f);
            linkedHashMap = new LinkedHashMap();
            C18258c c18258c = this.installationUuidProvider;
            bVar.f173453w = linkedHashMap;
            bVar.f173454x = linkedHashMap;
            bVar.f173455y = "installation_identifier";
            bVar.f173452F = 1;
            objM52601f = c18258c.m52601f(bVar);
            if (objM52601f == enumC31071a) {
                return enumC31071a;
            }
            map = linkedHashMap;
            str = "installation_identifier";
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.f173455y;
            linkedHashMap = (Map) bVar.f173454x;
            map = (Map) bVar.f173453w;
            AbstractC34132o.m107864I(objM52601f);
        }
        linkedHashMap.put(str, objM52601f);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public final Object m128947C(Integer num, RestingHeartRate restingHeartRate, User user, EnumC14518d enumC14518d, String str, InterfaceC30057d<? super Map<String, ? extends Object>> interfaceC30057d) {
        c cVar;
        Object nameKey;
        Object value;
        Object physiologicalBaseline;
        Object string;
        Gender gender;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f173460H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f173460H = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM128946B = cVar.f173458F;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f173460H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM128946B);
            cVar.f173461w = num;
            cVar.f173462x = restingHeartRate;
            cVar.f173463y = user;
            cVar.f173464z = enumC14518d;
            cVar.f173457E = str;
            cVar.f173460H = 1;
            objM128946B = m128946B(cVar);
            if (objM128946B == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f173457E;
            enumC14518d = (EnumC14518d) cVar.f173464z;
            user = (User) cVar.f173463y;
            restingHeartRate = (RestingHeartRate) cVar.f173462x;
            num = (Integer) cVar.f173461w;
            AbstractC34132o.m107864I(objM128946B);
        }
        Map<String, Object> map = (Map) objM128946B;
        map.put(NotificationCompat.CATEGORY_EMAIL, user.getEmailAddress());
        map.put("user_id", new Integer(user.getId()));
        map.put("first_name", user.getFirstName());
        map.put("last_name", user.getLastName());
        map.put("username", user.getUsername());
        map.put("min_HR", new Integer(user.getMinHeartRate()));
        map.put("max_HR", new Integer(user.getMaxHeartRate()));
        map.put("resting_HR", new Float(restingHeartRate.getValue()));
        map.put("weight", new Float(user.getWeightLbs()));
        map.put("height", new Float(user.getHeightIns()));
        FitnessLevel fitnessLevel = user.getFitnessLevel();
        Object obj2 = "";
        if (fitnessLevel == null || (nameKey = fitnessLevel.toNameKey()) == null) {
            nameKey = "";
        }
        map.put("fitness_level", nameKey);
        UserProfile profile = user.getProfile();
        if (profile == null || (gender = profile.getGender()) == null || (value = gender.getValue()) == null) {
            value = "";
        }
        map.put("gender", value);
        map.put("country", user.getCountry());
        if (num != null) {
            map.put("team_count", new Integer(num.intValue()));
        }
        UserProfile profile2 = user.getProfile();
        map.put("birthday", String.valueOf(profile2 != null ? profile2.getBirthday() : null));
        map.put("can_upload_data", Boolean.valueOf(user.canUploadData()));
        Object city = user.getCity();
        if (city == null) {
            city = "";
        }
        map.put("city", city);
        DateTime dateTimeM134165getCreatedAt = user.m134165getCreatedAt();
        if (dateTimeM134165getCreatedAt != null && (string = dateTimeM134165getCreatedAt.toString("yyyy-MM-dd")) != null) {
            obj2 = string;
        }
        map.put("account_creation", obj2);
        map.put("source_application", AbstractC28165h.m85265a(this.buildConfigProvider));
        MembershipStatus membershipStatus = (MembershipStatus) this.membershipRepository.m98946G().getValue();
        if (membershipStatus != null) {
            map.put("membership_status", membershipStatus.getValue());
        }
        if (str != null) {
            map.put("user_category", str);
        }
        map.put("recovery_count", new Integer(this.userMgr.m84091e()));
        UserProfile profile3 = user.getProfile();
        if (profile3 != null && (physiologicalBaseline = profile3.getPhysiologicalBaseline()) != null) {
            map.put("physiological_baseline", physiologicalBaseline);
        }
        if (enumC14518d != null) {
            map.put("system_notifications_status", enumC14518d.getLabel());
        }
        m128971z(map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: D */
    public final Object m128948D(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        Integer num;
        RestingHeartRate restingHeartRate;
        Object objM41435e;
        RestingHeartRate restingHeartRate2;
        User user2;
        String value;
        C40187a c40187a;
        User user3;
        AbstractC37230n abstractC37230nMo119305a;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f173468H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f173468H = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM29785L = dVar2.f173466F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f173468H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM29785L);
            C11059g c11059g = this.teamsRepository;
            dVar2.f173469w = user;
            dVar2.f173468H = 1;
            objM29785L = c11059g.m29785L(user, dVar2);
            if (objM29785L != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            user = (User) dVar2.f173469w;
            AbstractC34132o.m107864I(objM29785L);
        } else {
            if (i14 == 2) {
                Integer num2 = (Integer) dVar2.f173470x;
                User user4 = (User) dVar2.f173469w;
                AbstractC34132o.m107864I(objM29785L);
                num = num2;
                user = user4;
                restingHeartRate = (RestingHeartRate) objM29785L;
                C14519e c14519e = this.pushNotificationPermissionStatus;
                dVar2.f173469w = user;
                dVar2.f173470x = num;
                dVar2.f173471y = restingHeartRate;
                dVar2.f173468H = 3;
                objM41435e = c14519e.m41435e(dVar2);
                if (objM41435e == enumC31071a) {
                    restingHeartRate2 = restingHeartRate;
                    objM29785L = objM41435e;
                    user2 = user;
                    EnumC14518d enumC14518d = (EnumC14518d) objM29785L;
                    if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE)) {
                        value = null;
                    } else {
                        value = null;
                    }
                    dVar2.f173469w = user2;
                    dVar2.f173470x = null;
                    dVar2.f173471y = null;
                    dVar2.f173472z = null;
                    dVar2.f173465E = null;
                    dVar2.f173468H = 4;
                    Integer num3 = num;
                    c40187a = this;
                    objM29785L = c40187a.m128947C(num3, restingHeartRate2, user2, enumC14518d, value, dVar2);
                    if (objM29785L != enumC31071a) {
                        user3 = user2;
                    }
                }
                return enumC31071a;
            }
            if (i14 == 3) {
                RestingHeartRate restingHeartRate3 = (RestingHeartRate) dVar2.f173471y;
                num = (Integer) dVar2.f173470x;
                User user5 = (User) dVar2.f173469w;
                AbstractC34132o.m107864I(objM29785L);
                user2 = user5;
                restingHeartRate2 = restingHeartRate3;
                EnumC14518d enumC14518d2 = (EnumC14518d) objM29785L;
                if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE) || (abstractC37230nMo119305a = this.membershipTypeProvider.mo119305a()) == null) {
                    value = null;
                } else {
                    value = abstractC37230nMo119305a.getValue();
                }
                dVar2.f173469w = user2;
                dVar2.f173470x = null;
                dVar2.f173471y = null;
                dVar2.f173472z = null;
                dVar2.f173465E = null;
                dVar2.f173468H = 4;
                Integer num4 = num;
                c40187a = this;
                objM29785L = c40187a.m128947C(num4, restingHeartRate2, user2, enumC14518d2, value, dVar2);
                if (objM29785L != enumC31071a) {
                    user3 = user2;
                }
                return enumC31071a;
            }
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            user3 = (User) dVar2.f173469w;
            AbstractC34132o.m107864I(objM29785L);
            c40187a = this;
        }
        Map map = (Map) objM29785L;
        c40187a.analytics.m44887i(String.valueOf(user3.getId()));
        C15903d.m44879g(c40187a.analytics, map);
        c40187a.amplitudeEngagementClient.mo37117a(new C17319b(String.valueOf(user3.getId()), null, null, map, 6));
        return C23454a0.f92919a;
        Integer num5 = (Integer) objM29785L;
        UserRepository userRepository = this.userRepository;
        dVar2.f173469w = user;
        dVar2.f173470x = num5;
        dVar2.f173468H = 2;
        Object restingHeartRate$default = UserRepository.getRestingHeartRate$default(userRepository, false, dVar2, 1, null);
        if (restingHeartRate$default != enumC31071a) {
            num = num5;
            objM29785L = restingHeartRate$default;
            restingHeartRate = (RestingHeartRate) objM29785L;
            C14519e c14519e2 = this.pushNotificationPermissionStatus;
            dVar2.f173469w = user;
            dVar2.f173470x = num;
            dVar2.f173471y = restingHeartRate;
            dVar2.f173468H = 3;
            objM41435e = c14519e2.m41435e(dVar2);
            if (objM41435e == enumC31071a) {
                restingHeartRate2 = restingHeartRate;
                objM29785L = objM41435e;
                user2 = user;
                EnumC14518d enumC14518d3 = (EnumC14518d) objM29785L;
                if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE)) {
                    value = null;
                } else {
                    value = null;
                }
                dVar2.f173469w = user2;
                dVar2.f173470x = null;
                dVar2.f173471y = null;
                dVar2.f173472z = null;
                dVar2.f173465E = null;
                dVar2.f173468H = 4;
                Integer num6 = num;
                c40187a = this;
                objM29785L = c40187a.m128947C(num6, restingHeartRate2, user2, enumC14518d3, value, dVar2);
                if (objM29785L != enumC31071a) {
                    user3 = user2;
                    Map map2 = (Map) objM29785L;
                    c40187a.analytics.m44887i(String.valueOf(user3.getId()));
                    C15903d.m44879g(c40187a.analytics, map2);
                    c40187a.amplitudeEngagementClient.mo37117a(new C17319b(String.valueOf(user3.getId()), null, null, map2, 6));
                    return C23454a0.f92919a;
                }
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m128949E(C40187a c40187a, C27858u.a aVar) {
        c40187a.identifiedFullUser = false;
        c40187a.mo41427j(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m128950F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    private final String m128951G(String languagePlusRegionString) {
        String str = (String) AbstractC25265s.m74096F0(AbstractC39414r.m125906y0(languagePlusRegionString, new String[]{"-"}, 6));
        return AbstractC22676k.m65745e(str, "pt") ? languagePlusRegionString : str;
    }

    /* JADX INFO: renamed from: H */
    private final Object m128952H(Object element) {
        String string;
        if (element == null) {
            return null;
        }
        if (element instanceof String) {
            String lowerCase = ((String) element).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (!(element instanceof Map)) {
            return element;
        }
        Set<Map.Entry> setEntrySet = ((Map) element).entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || (string = key.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(string, value);
        }
        return m128953I(linkedHashMap);
    }

    /* JADX INFO: renamed from: I */
    private final Map<String, Object> m128953I(Map<String, ? extends Object> input) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : input.entrySet()) {
            linkedHashMap.put(m128955K(entry.getKey()), m128954J(entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: J */
    private final Object m128954J(Object value) {
        String string;
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            String lowerCase = ((String) value).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (value instanceof Enum) {
            String lowerCase2 = ((Enum) value).name().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            return lowerCase2;
        }
        if (value instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) value).entrySet();
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Object value2 = entry.getValue();
                if (key == null || (string = key.toString()) == null) {
                    string = "";
                }
                linkedHashMap.put(string, value2);
            }
            return m128953I(linkedHashMap);
        }
        if (value instanceof Iterable) {
            Iterable iterable = (Iterable) value;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m128952H(it.next()));
            }
            return arrayList;
        }
        if (!(value instanceof Object[])) {
            return value;
        }
        Object[] objArr = (Object[]) value;
        ArrayList arrayList2 = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList2.add(m128952H(obj));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: K */
    private final String m128955K(String source) {
        if (source.length() == 0) {
            return source;
        }
        String strM125926K = AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(source, " ", "_", false), "-", "_", false), ".", "_", false);
        Pattern patternCompile = Pattern.compile("([a-z0-9])([A-Z])");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strM125926K).replaceAll("$1_$2");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("([A-Z]+)([A-Z][a-z])");
        AbstractC22676k.m65749i(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("$1_$2");
        AbstractC22676k.m65749i(strReplaceAll2, "replaceAll(...)");
        Pattern patternCompile3 = Pattern.compile("__+");
        AbstractC22676k.m65749i(patternCompile3, "compile(...)");
        String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("_");
        AbstractC22676k.m65749i(strReplaceAll3, "replaceAll(...)");
        String lowerCase = AbstractC39414r.m125870P0(strReplaceAll3, '_').toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: L */
    private final void m128956L(String eventName, Map<String, Object> properties, String maximVersion, String nordicVersion, String strapGeneration) {
        if (eventName == null || eventName.length() == 0) {
            return;
        }
        if (properties != null) {
            m128945A(properties, maximVersion, nordicVersion, strapGeneration);
            m128970y(properties);
        }
        C15903d.m44880j(this.analytics, eventName, properties != null ? m128953I(properties) : null, 4);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m128957M(C40187a c40187a, String str, Map map, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        if ((i13 & 8) != 0) {
            str3 = null;
        }
        if ((i13 & 16) != 0) {
            str4 = null;
        }
        c40187a.m128956L(str, map, str2, str3, str4);
    }

    /* JADX INFO: renamed from: y */
    private final void m128970y(Map<String, Object> properties) {
        properties.put("is_raw_data_in_strap_or_app_backlog", String.valueOf(this.rawDataTrackingService.mo13761c()));
        if (this.whoopStrapProvider.getCommandCapableStrapFlow().getValue() != null) {
            properties.put("strap_lock_state", AbstractC32975s.m104081a(this.strapLockStateTracker));
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m128971z(Map<String, Object> traits) {
        List<Locale> listM85350a = AbstractC28202t0.m85350a(this.systemResources.mo85331a());
        Locale locale = (Locale) AbstractC25265s.m74102I0(0, listM85350a);
        if (locale != null) {
            traits.put("first_language_preference", locale.toLanguageTag());
        }
        Locale locale2 = (Locale) AbstractC25265s.m74102I0(1, listM85350a);
        if (locale2 != null) {
            traits.put("second_language_preference", locale2.toLanguageTag());
        }
        Locale locale3 = (Locale) AbstractC25265s.m74102I0(2, listM85350a);
        if (locale3 != null) {
            traits.put("third_language_preference", locale3.toLanguageTag());
        }
        String languageTag = this.languageRepository.getAllowedLanguage().toLanguageTag();
        AbstractC22676k.m65749i(languageTag, "toLanguageTag(...)");
        traits.put("app_language", m128951G(languageTag));
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: a */
    public void mo41419a() {
        C15903d c15903d = this.analytics;
        c15903d.m44887i(null);
        AbstractC3006f0.m8732z(c15903d.f60130c, c15903d.f60131d, null, new C0162b(c15903d, null, 23), 2);
        this.identifiedFullUser = false;
        this.identifiedUserId = false;
        this.identifiedInstallationId = false;
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: b */
    public void mo41420b() {
        this.userContext.m84061n().m122652B(this.schedulerFactory.mo54469a()).m122661K(new C6529c(new C31345p(this, 12), 28));
        mo41427j(true);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: c */
    public void mo41421c(String eventName, String category, String maximVersion, String nordicVersion, String strapGeneration, String action, String label, String value, Map<String, ? extends Object> otherProperties) {
        Set<String> setKeySet;
        mo41427j(false);
        String str = action;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (category == null) {
            category = "";
        }
        linkedHashMap.put("category", category);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("action", str);
        if (label == null) {
            label = "";
        }
        linkedHashMap.put("label", label);
        if (value == null) {
            value = "";
        }
        linkedHashMap.put("value", value);
        if (otherProperties != null && (setKeySet = otherProperties.keySet()) != null) {
            for (String str2 : setKeySet) {
                Object obj = otherProperties.get(str2);
                if (obj == null) {
                    obj = "";
                }
                linkedHashMap.put(str2, obj);
            }
        }
        if (eventName == null || eventName.length() == 0) {
            return;
        }
        m128956L(eventName, linkedHashMap, maximVersion, nordicVersion, strapGeneration);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: d */
    public void mo41422d(String category, String action, String label, String eventName, String value, Map<String, ? extends Object> otherProperties) {
        Set<String> setKeySet;
        mo41427j(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (category == null) {
            category = "";
        }
        linkedHashMap.put("category", category);
        if (action == null) {
            action = "";
        }
        linkedHashMap.put("action", action);
        if (label == null) {
            label = "";
        }
        linkedHashMap.put("label", label);
        if (value == null) {
            value = "";
        }
        linkedHashMap.put("value", value);
        if (otherProperties != null && (setKeySet = otherProperties.keySet()) != null) {
            for (String str : setKeySet) {
                Object obj = otherProperties.get(str);
                if (obj == null) {
                    obj = "";
                }
                linkedHashMap.put(str, obj);
            }
        }
        m128957M(this, eventName, linkedHashMap, null, null, null, 28, null);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: e */
    public void mo41423e(String screenName, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(extraData, "extraData");
        mo41427j(false);
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(extraData);
        linkedHashMapM74003l0.put("name", screenName);
        m128957M(this, "Viewed " + screenName + " Screen", linkedHashMapM74003l0, null, null, null, 28, null);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: f */
    public void mo41424f(String category, String action, String label, String eventName) {
        mo41427j(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (category == null) {
            category = "";
        }
        linkedHashMap.put("category", category);
        if (action == null) {
            action = "";
        }
        linkedHashMap.put("action", action);
        if (label == null) {
            label = "";
        }
        linkedHashMap.put("label", label);
        m128957M(this, eventName, linkedHashMap, null, null, null, 28, null);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: g */
    public void mo41425g(String screenName) {
        AbstractC22676k.m65750j(screenName, "screenName");
        mo41427j(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("name", screenName);
        m128957M(this, "Viewed " + screenName + " Screen", linkedHashMap, null, null, null, 28, null);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: h */
    public void mo41426h(String category, String action, String label, String eventName, String value) {
        mo41427j(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (category == null) {
            category = "";
        }
        linkedHashMap.put("category", category);
        if (action == null) {
            action = "";
        }
        linkedHashMap.put("action", action);
        if (label == null) {
            label = "";
        }
        linkedHashMap.put("label", label);
        if (value == null) {
            value = "";
        }
        linkedHashMap.put("value", value);
        m128957M(this, eventName, linkedHashMap, null, null, null, 28, null);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: j */
    public void mo41427j(boolean force) {
        if (!this.identifiedFullUser || force) {
            User userM84055f = this.userContext.m84055f();
            if (userM84055f != null) {
                this.identifiedFullUser = true;
                AbstractC3006f0.m8732z(this.applicationScope, null, null, new e(userM84055f, null), 3);
            } else {
                if (this.identifiedUserId) {
                    return;
                }
                AbstractC3006f0.m8732z(this.applicationScope, null, null, new f(null), 3);
            }
        }
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: k */
    public void mo41428k(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
        Set<String> setKeySet;
        mo41427j(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (category == null) {
            category = "";
        }
        linkedHashMap.put("category", category);
        if (action == null) {
            action = "";
        }
        linkedHashMap.put("action", action);
        if (label == null) {
            label = "";
        }
        linkedHashMap.put("label", label);
        if (otherProperties != null && (setKeySet = otherProperties.keySet()) != null) {
            for (String str : setKeySet) {
                Object obj = otherProperties.get(str);
                if (obj == null) {
                    obj = "";
                }
                linkedHashMap.put(str, obj);
            }
        }
        m128957M(this, eventName, linkedHashMap, null, null, null, 28, null);
    }
}

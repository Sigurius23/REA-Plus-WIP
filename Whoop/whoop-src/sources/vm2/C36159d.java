package vm2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import com.google.android.gms.common.C4987d;
import com.whoop.analytics.MetricEventModel;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.bot.settings.CoachSettingsFragmentKt;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.community.presentation.login.InviteCodeActivity;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.domain.model.WhoopUri;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9594a;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CommunityScreenModel;
import com.whoop.navigation.CommunityUnavailableScreenModel;
import com.whoop.navigation.GenericCachePolicy;
import com.whoop.navigation.NativeStoreScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.AbstractC10531a;
import com.whoop.profile.C9691R;
import com.whoop.profile.navigation.LevelsNavigationHelper;
import com.whoop.realtime.presentation.StartActivityActivity;
import com.whoop.video.VideoActivity;
import com.whoop.whooplive.selfie.SelfieActivity;
import d13.AbstractC11478a;
import dp0.InterfaceC12251g;
import e93.AbstractC12889b;
import hi0.AbstractC17304b;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import hj0.C17345d;
import ht1.EnumC17628e;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21128a;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.C21131b;
import j02.C21138e;
import j02.C21139e0;
import j02.C21141f0;
import j02.C21147i0;
import j02.C21148j;
import j02.C21163q0;
import j02.C21173v0;
import j02.EnumC21172v;
import j02.InterfaceC21134c;
import j02.InterfaceC21136d;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import j02.InterfaceC21152l;
import j02.InterfaceC21153l0;
import j02.InterfaceC21159o0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ji0.InterfaceC21718f;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25265s;
import m83.C25262p;
import m83.C25271y;
import m83.C25272z;
import m92.C25321d;
import n82.EnumC26455a;
import n92.C26480b;
import nf1.AbstractC26660a;
import nf1.AbstractC26666g;
import o02.InterfaceC27353d;
import or2.AbstractC28152c1;
import or2.C28216y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p114eb.InterfaceC12981p0;
import p114eb.InterfaceC12990u;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pq0.C29470e;
import pr1.AbstractC29491b;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import sm2.C32717b;
import tr2.InterfaceC34116n;
import ve0.C35926d;
import vt2.C36494c;
import we1.InterfaceC37217a;
import yb3.AbstractC39414r;
import yp0.InterfaceC39700a;

/* JADX INFO: renamed from: vm2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000È\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BÏ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\u001b\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0017\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bC\u0010BJ\u0017\u0010E\u001a\u00020@2\u0006\u0010D\u001a\u000208H\u0000¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020;2\b\u00107\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020@2\u0006\u0010I\u001a\u000208H\u0016¢\u0006\u0004\bJ\u0010FJ\u0015\u0010M\u001a\u00020;2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u000203¢\u0006\u0004\bO\u00105J\u0017\u0010R\u001a\u00020;2\b\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bR\u0010SJ$\u0010Y\u001a\u00020X2\u0006\u0010U\u001a\u00020T2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010VH\u0086@¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u0002032\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b]\u0010^J#\u0010c\u001a\u0004\u0018\u00010P2\u0006\u0010`\u001a\u00020_2\b\u0010b\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020@2\u0006\u0010I\u001a\u000208H\u0002¢\u0006\u0004\be\u0010FJ\u0013\u0010f\u001a\u00020;*\u00020>H\u0002¢\u0006\u0004\bf\u0010HJ\u0017\u0010g\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bg\u0010BJ\u001b\u0010k\u001a\u00020h*\u00020h2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u001b\u0010o\u001a\u000208*\u0002082\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ\u001d\u0010s\u001a\u000208*\u0002082\b\u0010r\u001a\u0004\u0018\u00010qH\u0002¢\u0006\u0004\bs\u0010tJ\u001f\u0010v\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P0u*\u00020mH\u0002¢\u0006\u0004\bv\u0010wJ\u001b\u0010z\u001a\u0004\u0018\u00010y2\b\u0010x\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bz\u0010{J\u0015\u0010|\u001a\u0004\u0018\u00010y*\u00020mH\u0002¢\u0006\u0004\b|\u0010}J*\u0010\u0080\u0001\u001a\u00020~*\u00020~2\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P0uH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J%\u0010\u0083\u0001\u001a\u00020@2\u0007\u0010\u0082\u0001\u001a\u00020P2\b\u0010D\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001c\u0010\u0086\u0001\u001a\u00020;2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0005\b\u0086\u0001\u0010SJ\u001b\u0010\u0088\u0001\u001a\u0002032\u0007\u0010\u0087\u0001\u001a\u00020>H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008a\u0001\u001a\u00020;2\u0006\u0010D\u001a\u000208H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0016\u0010\u008c\u0001\u001a\u00020;*\u00020@H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J#\u0010\u008f\u0001\u001a\u0002032\u0006\u0010I\u001a\u0002082\u0007\u0010\u008e\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J4\u0010\u0093\u0001\u001a\u00020;2\u0006\u0010I\u001a\u0002082\u0007\u0010\u0091\u0001\u001a\u00020;2\u000f\b\u0002\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u0002030\u0005H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0019\u0010\u0095\u0001\u001a\u00020@2\u0006\u0010I\u001a\u000208H\u0002¢\u0006\u0005\b\u0095\u0001\u0010FJ\u001b\u0010\u0097\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030\u0096\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030\u0099\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0012\u0010\u009c\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0012\u0010\u009e\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001J\u0012\u0010\u009f\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b\u009f\u0001\u0010\u009d\u0001J\u0012\u0010 \u0001\u001a\u00020@H\u0002¢\u0006\u0006\b \u0001\u0010\u009d\u0001J\u001b\u0010¢\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030¡\u0001H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0012\u0010¤\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b¤\u0001\u0010\u009d\u0001J\u001b\u0010¦\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030¥\u0001H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0012\u0010¨\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b¨\u0001\u0010\u009d\u0001J\u0012\u0010©\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b©\u0001\u0010\u009d\u0001J\u001b\u0010«\u0001\u001a\u00020@2\u0007\u0010ª\u0001\u001a\u00020PH\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0012\u0010\u00ad\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010\u009d\u0001J\u001b\u0010¯\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030®\u0001H\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001b\u0010²\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030±\u0001H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001b\u0010µ\u0001\u001a\u00020@2\u0007\u0010´\u0001\u001a\u00020PH\u0002¢\u0006\u0006\bµ\u0001\u0010¬\u0001J\u001b\u0010·\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030¶\u0001H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0012\u0010¹\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b¹\u0001\u0010\u009d\u0001J\u0012\u0010º\u0001\u001a\u00020@H\u0002¢\u0006\u0006\bº\u0001\u0010\u009d\u0001J<\u0010Á\u0001\u001a\u00020@2\f\b\u0002\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00012\f\b\u0002\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00012\f\b\u0002\u0010À\u0001\u001a\u0005\u0018\u00010¿\u0001H\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J,\u0010Ã\u0001\u001a\u00020@2\f\b\u0002\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J.\u0010Å\u0001\u001a\u00020@2\f\b\u0002\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00012\f\b\u0002\u0010À\u0001\u001a\u0005\u0018\u00010¿\u0001H\u0002¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001JI\u0010È\u0001\u001a\u00020@2\f\b\u0002\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00012\f\b\u0002\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00012\f\b\u0002\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00012\u000b\b\u0002\u0010Ç\u0001\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001d\u0010Ë\u0001\u001a\u00020@2\t\u0010Ê\u0001\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0006\bË\u0001\u0010¬\u0001J\u001b\u0010Í\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030Ì\u0001H\u0002¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u001b\u0010Ð\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030Ï\u0001H\u0002¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001b\u0010Ó\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030Ò\u0001H\u0002¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u001b\u0010Ö\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030Õ\u0001H\u0002¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u001b\u0010Ù\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030Ø\u0001H\u0002¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u001b\u0010Ü\u0001\u001a\u0002032\u0007\u0010D\u001a\u00030Û\u0001H\u0002¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u001f\u0010ß\u0001\u001a\u00020@2\u000b\b\u0002\u0010Þ\u0001\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0006\bß\u0001\u0010¬\u0001J\u0012\u0010à\u0001\u001a\u00020@H\u0002¢\u0006\u0006\bà\u0001\u0010\u009d\u0001J\u001b\u0010â\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030á\u0001H\u0002¢\u0006\u0006\bâ\u0001\u0010ã\u0001J%\u0010ç\u0001\u001a\u00020@2\u0007\u0010ä\u0001\u001a\u00020P2\b\u0010æ\u0001\u001a\u00030å\u0001H\u0002¢\u0006\u0006\bç\u0001\u0010è\u0001J,\u0010ê\u0001\u001a\u00020@2\u000b\b\u0002\u0010é\u0001\u001a\u0004\u0018\u00010P2\u000b\b\u0002\u0010Ê\u0001\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0006\bê\u0001\u0010ë\u0001J\u001b\u0010í\u0001\u001a\u00020@2\u0007\u0010ì\u0001\u001a\u00020;H\u0002¢\u0006\u0006\bí\u0001\u0010î\u0001J\u001f\u0010ï\u0001\u001a\u00020@2\u000b\b\u0002\u0010Ê\u0001\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0006\bï\u0001\u0010¬\u0001J&\u0010ñ\u0001\u001a\u00020@2\u0007\u0010ð\u0001\u001a\u00020P2\t\u0010Ê\u0001\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0006\bñ\u0001\u0010ë\u0001J3\u0010ô\u0001\u001a\u00020@2\u0007\u0010ò\u0001\u001a\u00020;2\t\u0010ó\u0001\u001a\u0004\u0018\u00010P2\u000b\b\u0002\u0010Ê\u0001\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0006\bô\u0001\u0010õ\u0001J&\u0010÷\u0001\u001a\u00020@2\u0007\u0010ö\u0001\u001a\u00020P2\t\u0010Ê\u0001\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0006\b÷\u0001\u0010ë\u0001J\u001b\u0010ù\u0001\u001a\u00020@2\u0007\u0010ø\u0001\u001a\u00020PH\u0002¢\u0006\u0006\bù\u0001\u0010¬\u0001J\u001b\u0010û\u0001\u001a\u00020@2\u0007\u0010ú\u0001\u001a\u00020PH\u0002¢\u0006\u0006\bû\u0001\u0010¬\u0001J\u001b\u0010ü\u0001\u001a\u00020@2\u0007\u0010Ê\u0001\u001a\u00020PH\u0002¢\u0006\u0006\bü\u0001\u0010¬\u0001J\u0012\u0010ý\u0001\u001a\u00020@H\u0002¢\u0006\u0006\bý\u0001\u0010\u009d\u0001J%\u0010þ\u0001\u001a\u0002032\b\u0010W\u001a\u0004\u0018\u00010V2\u0007\u0010\u008e\u0001\u001a\u00020XH\u0002¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\be\u0010\u0080\u0002R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010\u0083\u0002R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b|\u0010\u0084\u0002R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0087\u0002R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0088\u0002R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010\u0089\u0002R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010\u008a\u0002R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010\u008d\u0002R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0002R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010\u008f\u0002R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0090\u0002R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010\u0091\u0002R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010\u0092\u0002R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010\u0093\u0002R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010\u0094\u0002R\u0016\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010\u0095\u0002R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0016\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010\u0098\u0002R\u0016\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010\u0099\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u009a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010\u009b\u0002R\u0018\u0010\u009e\u0002\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u009d\u0002R\u0018\u0010\u009f\u0002\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010\u009d\u0002¨\u0006 \u0002"}, m65681d2 = {"Lvm2/d;", "Lj02/o0;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/fragment/app/r0;", "context", "Lkotlin/Function0;", "Leb/a0;", "navController", "Lor2/y;", "externalLinkNavigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwe1/a;", "entitlementChecker", "Ln92/b;", "customActionHandler", "Lj02/i0;", "navDeepLinkRequestHelper", "Ljava/time/Clock;", "clock", "Lcom/whoop/navigation/a;", "deepLinkNavigationParser", "", "Lj02/k0;", "navigationProviders", "Lo02/d;", "navigationReducer", "Lhj0/d;", "appLifecycle", "Lj02/l0;", "navigationReporter", "Lji0/f;", "bffBottomNavConfigSource", "Lvm2/a;", "appConfigurationTabResolver", "Lvm2/m;", "tabRootResolver", "Lvm2/f;", "bffDefaultTabResolver", "Lvm2/j;", "launchRedirectGate", "Lyp0/a;", "communityAccessChecker", "Ldp0/g;", "globalCoachManager", "Lj02/e;", "bffBottomNavTabEventPublisher", "Lvm2/l;", "navigationMetricsReporter", "<init>", "(Landroidx/fragment/app/r0;Lc93/a;Lor2/y;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Ln92/b;Lj02/i0;Ljava/time/Clock;Lcom/whoop/navigation/a;Ljava/util/List;Lo02/d;Lhj0/d;Lj02/l0;Lji0/f;Lvm2/a;Lvm2/m;Lvm2/f;Lvm2/j;Lyp0/a;Ldp0/g;Lj02/e;Lvm2/l;)V", "Ll83/a0;", "D", "()V", "Leb/n0;", "destination", "Lj02/m0;", "t", "(Leb/n0;)Lj02/m0;", "", "H", "()Z", "Lcom/whoop/navigation/e;", "navigationAction", "Lj02/p0;", "a", "(Lcom/whoop/navigation/e;)Lj02/p0;", "d", HMSTrackSource.SCREEN, "M", "(Lj02/m0;)Lj02/p0;", "e", "(Lcom/whoop/navigation/e;)Z", "navigationScreen", "b", "Lcom/whoop/appconfiguration/TabConfiguration;", "tab", "L0", "(Lcom/whoop/appconfiguration/TabConfiguration;)Z", "K", "", "selectedTabId", "B", "(Ljava/lang/String;)Z", "Lcom/whoop/domain/model/WhoopUri;", "whoopUri", "Landroid/content/Intent;", "intent", "Lj02/l;", "C", "(Lcom/whoop/domain/model/WhoopUri;Landroid/content/Intent;Lq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onStart", "(Landroidx/lifecycle/g0;)V", "", "destinationId", "Landroid/os/Bundle;", "arguments", "y", "(ILandroid/os/Bundle;)Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "P0", "v", "Lj02/m0$m1;", "Leb/q;", "replacedEntry", "q", "(Lj02/m0$m1;Leb/q;)Lj02/m0$m1;", "Lcom/whoop/navigation/NavigationScreenModel;", "parameters", "U0", "(Lj02/m0;Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "Lcom/whoop/navigation/AiAction;", "aiAction", "T0", "(Lj02/m0;Lcom/whoop/navigation/AiAction;)Lj02/m0;", "", "A", "(Lcom/whoop/navigation/NavigationScreenModel;)Ljava/util/Map;", "shareCode", "Lcom/whoop/navigation/GenericCachePolicy;", "r", "(Ljava/lang/String;)Lcom/whoop/navigation/GenericCachePolicy;", "z", "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/GenericCachePolicy;", "Lcom/whoop/navigation/models/ApiRequest;", "queryParams", "o", "(Lcom/whoop/navigation/models/ApiRequest;Ljava/util/Map;)Lcom/whoop/navigation/models/ApiRequest;", "tabId", "R0", "(Ljava/lang/String;Lj02/m0;)Lj02/p0;", "sourceOverride", "S0", "action", "O0", "(Lcom/whoop/navigation/e;)V", "F", "(Lj02/m0;)Z", "G", "(Lj02/p0;)Z", "result", "L", "(Lj02/m0;Lj02/p0;)V", "noopFixEnabled", "onAiActionHandled", "Q0", "(Lj02/m0;ZLc93/a;)Z", "E0", "Lj02/m0$q1;", "X", "(Lj02/m0$q1;)Lj02/p0;", "Lj02/m0$g2;", "h0", "(Lj02/m0$g2;)Lj02/p0;", "g0", "()Lj02/p0;", "m0", "u0", "p0", "Lj02/m0$m4;", "q0", "(Lj02/m0$m4;)Lj02/p0;", "r0", "Lj02/m0$o4;", "s0", "(Lj02/m0$o4;)Lj02/p0;", "t0", "l0", "entryPoint", "S", "(Ljava/lang/String;)Lj02/p0;", "i0", "Lj02/m0$i2;", "j0", "(Lj02/m0$i2;)Lj02/p0;", "Lj02/m0$j2;", "k0", "(Lj02/m0$j2;)Lj02/p0;", QueryParams.URL, "V", "Lj02/m0$y5;", "C0", "(Lj02/m0$y5;)Lj02/p0;", "v0", "D0", "Leb/p0;", "navDirections", "Leb/k0;", "navDeepLinkRequest", "Leb/x0;", "navOptions", "M0", "(Leb/p0;Leb/k0;Leb/x0;)Lj02/p0;", "F0", "(Leb/p0;Ljava/lang/String;)Lj02/p0;", "H0", "(Leb/p0;Leb/x0;)Lj02/p0;", "settingsSource", "J0", "(Leb/p0;Leb/k0;Leb/x0;Ljava/lang/String;)Lj02/p0;", "source", "N0", "Lj02/m0$e;", "N", "(Lj02/m0$e;)Lj02/p0;", "Lj02/m0$f;", "O", "(Lj02/m0$f;)Lj02/p0;", "Lj02/m0$c1;", "U", "(Lj02/m0$c1;)Lj02/p0;", "Lj02/m0$r0;", "R", "(Lj02/m0$r0;)Lj02/p0;", "Lj02/m0$e2;", "f0", "(Lj02/m0$e2;)Lj02/p0;", "Lj02/m0$f5;", "y0", "(Lj02/m0$f5;)V", "openTab", "w0", "W", "Lj02/m0$w1;", "Z", "(Lj02/m0$w1;)Lj02/p0;", "gaugeType", "Ljava/time/LocalDate;", "selectedDate", "o0", "(Ljava/lang/String;Ljava/time/LocalDate;)Lj02/p0;", SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE, "x0", "(Ljava/lang/String;Ljava/lang/String;)Lj02/p0;", "showOnboarding", "b0", "(Z)Lj02/p0;", "Q", "detailId", "P", "navigateToPresets", "scrollId", "A0", "(ZLjava/lang/String;Ljava/lang/String;)Lj02/p0;", "integrationId", "d0", "pillar", "c0", "code", "e0", "Y", "z0", "I", "(Landroid/content/Intent;Lj02/l;)V", "Landroidx/fragment/app/r0;", "x", "Lc93/a;", "Lor2/y;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "Lwe1/a;", "Ln92/b;", "Lj02/i0;", "Ljava/time/Clock;", "Lcom/whoop/navigation/a;", "J", "Ljava/util/List;", "Lo02/d;", "Lhj0/d;", "Lj02/l0;", "Lji0/f;", "Lvm2/a;", "Lvm2/m;", "Lvm2/f;", "Lvm2/j;", "Lyp0/a;", "T", "Ldp0/g;", "Lj02/e;", "Lvm2/l;", "Ltr2/n;", "Ltr2/n;", "logger", "Leb/x0;", "bottomNavButtonPressOptions", "bffTabNavOptions", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36159d implements InterfaceC21159o0, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C26480b customActionHandler;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C9594a deepLinkNavigationParser;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final List<InterfaceC21151k0> navigationProviders;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C17345d appLifecycle;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC21153l0 navigationReporter;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC21718f bffBottomNavConfigSource;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final C36156a appConfigurationTabResolver;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final C36168m tabRootResolver;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final C36161f bffDefaultTabResolver;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final C36165j launchRedirectGate;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC39700a communityAccessChecker;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final C21138e bffBottomNavTabEventPublisher;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final C36167l navigationMetricsReporter;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final C12997x0 bottomNavButtonPressOptions;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final C12997x0 bffTabNavOptions;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractActivityC1340r0 context;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC4339a navController;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: vm2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f154727a;

        static {
            int[] iArr = new int[ActivityDetailType.values().length];
            try {
                iArr[ActivityDetailType.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityDetailType.CARDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityDetailType.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityDetailType.WEIGHTLIFTING_MSK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f154727a = iArr;
        }
    }

    /* JADX INFO: renamed from: vm2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.presentation.AppNavigator", m100430f = "AppNavigator.kt", m100431l = {1674}, m100432m = "handleDeepLink", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f154728E;

        /* JADX INFO: renamed from: w */
        Object f154729w;

        /* JADX INFO: renamed from: x */
        Object f154730x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154731y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154731y = obj;
            this.f154728E |= Integer.MIN_VALUE;
            return C36159d.this.m115092C(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36159d(AbstractActivityC1340r0 context, InterfaceC4339a navController, C28216y externalLinkNavigator, FeatureFlagChecker featureFlagChecker, InterfaceC37217a entitlementChecker, C26480b customActionHandler, C21147i0 navDeepLinkRequestHelper, Clock clock, C9594a deepLinkNavigationParser, List<? extends InterfaceC21151k0> navigationProviders, InterfaceC27353d navigationReducer, C17345d appLifecycle, InterfaceC21153l0 navigationReporter, InterfaceC21718f bffBottomNavConfigSource, C36156a appConfigurationTabResolver, C36168m tabRootResolver, C36161f bffDefaultTabResolver, C36165j launchRedirectGate, InterfaceC39700a communityAccessChecker, InterfaceC12251g interfaceC12251g, C21138e bffBottomNavTabEventPublisher, C36167l navigationMetricsReporter) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(customActionHandler, "customActionHandler");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(deepLinkNavigationParser, "deepLinkNavigationParser");
        AbstractC22676k.m65750j(navigationProviders, "navigationProviders");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(appLifecycle, "appLifecycle");
        AbstractC22676k.m65750j(navigationReporter, "navigationReporter");
        AbstractC22676k.m65750j(bffBottomNavConfigSource, "bffBottomNavConfigSource");
        AbstractC22676k.m65750j(appConfigurationTabResolver, "appConfigurationTabResolver");
        AbstractC22676k.m65750j(tabRootResolver, "tabRootResolver");
        AbstractC22676k.m65750j(bffDefaultTabResolver, "bffDefaultTabResolver");
        AbstractC22676k.m65750j(launchRedirectGate, "launchRedirectGate");
        AbstractC22676k.m65750j(communityAccessChecker, "communityAccessChecker");
        AbstractC22676k.m65750j(bffBottomNavTabEventPublisher, "bffBottomNavTabEventPublisher");
        AbstractC22676k.m65750j(navigationMetricsReporter, "navigationMetricsReporter");
        this.context = context;
        this.navController = navController;
        this.externalLinkNavigator = externalLinkNavigator;
        this.featureFlagChecker = featureFlagChecker;
        this.entitlementChecker = entitlementChecker;
        this.customActionHandler = customActionHandler;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.clock = clock;
        this.deepLinkNavigationParser = deepLinkNavigationParser;
        this.navigationProviders = navigationProviders;
        this.navigationReducer = navigationReducer;
        this.appLifecycle = appLifecycle;
        this.navigationReporter = navigationReporter;
        this.bffBottomNavConfigSource = bffBottomNavConfigSource;
        this.appConfigurationTabResolver = appConfigurationTabResolver;
        this.tabRootResolver = tabRootResolver;
        this.bffDefaultTabResolver = bffDefaultTabResolver;
        this.launchRedirectGate = launchRedirectGate;
        this.communityAccessChecker = communityAccessChecker;
        this.globalCoachManager = interfaceC12251g;
        this.bffBottomNavTabEventPublisher = bffBottomNavTabEventPublisher;
        this.navigationMetricsReporter = navigationMetricsReporter;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("AppNavigator");
        this.bottomNavButtonPressOptions = new C12997x0(false, false, AbstractC17307e.f66562D2, false, false, -1, -1, -1, -1);
        this.bffTabNavOptions = new C12997x0(false, false, AbstractC17307e.f66568E2, false, false, -1, -1, -1, -1);
    }

    /* JADX INFO: renamed from: A */
    private final Map<String, String> m115014A(NavigationScreenModel navigationScreenModel) {
        boolean z4 = navigationScreenModel instanceof CommunityScreenModel;
        C25272z c25272z = C25272z.f99163w;
        if (!z4) {
            return c25272z;
        }
        String shareCode = ((CommunityScreenModel) navigationScreenModel).getShareCode();
        Map<String, String> mapM95645u = shareCode != null ? AbstractC31061c.m95645u("share_code", shareCode) : null;
        return mapM95645u == null ? c25272z : mapM95645u;
    }

    /* JADX INFO: renamed from: A0 */
    private final AbstractC21161p0 m115015A0(boolean navigateToPresets, String scrollId, String source) {
        StringBuilder sb4 = new StringBuilder("android-app://com.whoop/weeklyPlan?navigateToPresets=" + navigateToPresets + "&scrollId=" + scrollId);
        if (source != null) {
            sb4.append("&source=".concat(source));
        }
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        m115031M0(null, c21147i0.m58994a(string), new C12997x0(true, false, -1, false, false, AbstractC28152c1.m85184b().f44908f, AbstractC28152c1.m85184b().f44909g, AbstractC28152c1.m85184b().f44910h, AbstractC28152c1.m85184b().f44911i));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ AbstractC21161p0 m115016B0(C36159d c36159d, boolean z4, String str, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        return c36159d.m115015A0(z4, str, str2);
    }

    /* JADX INFO: renamed from: C0 */
    private final AbstractC21161p0 m115017C0(AbstractC21155m0.y5 screen) {
        SelfieActivity.C10877g c10877gM28839i1 = SelfieActivity.m28839i1(this.context, screen.getCycleId(), screen.getLowerBound(), screen.getUpperBound(), Double.valueOf(screen.getDayStrain()), screen.getRecoveryScore(), Long.valueOf(screen.getSleepMilliseconds()), screen.getIsComplete(), screen.getCalories());
        AbstractC22676k.m65749i(c10877gM28839i1, "intentBuilder(...)");
        c10877gM28839i1.m49148e().m49154m();
        return AbstractC21161p0.f.f80692a;
    }

    /* JADX INFO: renamed from: D0 */
    private final AbstractC21161p0 m115018D0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/customizeOverview"));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m115019E(C36159d c36159d, AbstractC12939a0 controller, C12977n0 destination, Bundle bundle) throws UnsupportedEncodingException {
        AbstractC21155m0 abstractC21155m0M115098t;
        C12977n0 c12977n0;
        AbstractC22676k.m65750j(controller, "controller");
        AbstractC22676k.m65750j(destination, "destination");
        String strM115087y = null;
        boolean z4 = true;
        AbstractC9597d.m23121m(controller, null, 1, null);
        if (c36159d.launchRedirectGate.m115104a() && (abstractC21155m0M115098t = c36159d.m115098t(destination)) != null) {
            C36167l c36167l = c36159d.navigationMetricsReporter;
            C12982q c12982qM36398m = controller.m36398m();
            if (c12982qM36398m != null && (c12977n0 = c12982qM36398m.f44844x) != null) {
                strM115087y = c12977n0.mo36467g();
            }
            c36167l.m115109b(strM115087y);
            c36159d.m115097M(abstractC21155m0M115098t);
            return;
        }
        boolean zM23119k = AbstractC9597d.m23119k(controller);
        strM115087y = zM23119k ? null : c36159d.m115087y(destination.f44819H, bundle);
        if (strM115087y != null) {
            c36159d.bffBottomNavTabEventPublisher.m58980c(new InterfaceC21136d.d(strM115087y));
        }
        if (!zM23119k && strM115087y == null) {
            z4 = false;
        }
        c36159d.bffBottomNavTabEventPublisher.m58980c(new InterfaceC21136d.c(z4));
    }

    /* JADX WARN: Code duplicated, block: B:173:0x042a  */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x042a, please report this as an issue */
    /* JADX INFO: renamed from: E0 */
    private final AbstractC21161p0 m115020E0(AbstractC21155m0 navigationScreen) throws UnsupportedEncodingException {
        AbstractC21161p0 abstractC21161p0M115090z0;
        C12969k0 c12969k0M58994a;
        String strConcat;
        String strConcat2;
        String strM30461o;
        String strEncode;
        if (navigationScreen instanceof AbstractC21155m0.e) {
            abstractC21161p0M115090z0 = m115032N((AbstractC21155m0.e) navigationScreen);
        } else if (navigationScreen instanceof AbstractC21155m0.f) {
            abstractC21161p0M115090z0 = m115034O((AbstractC21155m0.f) navigationScreen);
        } else {
            if (navigationScreen instanceof AbstractC21155m0.d0) {
                AbstractC21155m0.d0 d0Var = (AbstractC21155m0.d0) navigationScreen;
                String pathUrl = d0Var.getPathUrl();
                String url = d0Var.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
                C21148j confirmDismissContent = d0Var.getConfirmDismissContent();
                String strM58999d = confirmDismissContent != null ? confirmDismissContent.getTitle() : null;
                C21148j confirmDismissContent2 = d0Var.getConfirmDismissContent();
                String strM58998c = confirmDismissContent2 != null ? confirmDismissContent2.getMessage() : null;
                C21148j confirmDismissContent3 = d0Var.getConfirmDismissContent();
                String strM58996a = confirmDismissContent3 != null ? confirmDismissContent3.getCancelTitle() : null;
                C21148j confirmDismissContent4 = d0Var.getConfirmDismissContent();
                String strM58997b = confirmDismissContent4 != null ? confirmDismissContent4.getConfirmTitle() : null;
                C9598e onDismissDestination = d0Var.getOnDismissDestination();
                abstractC21161p0M115090z0 = m115027I0(this, AbstractC17304b.m49003n(pathUrl, url, strM58999d, strM58998c, strM58996a, strM58997b, onDismissDestination != null ? C32717b.f136014a.m102674b(onDismissDestination) : null), null, 2, null);
            } else if (navigationScreen instanceof AbstractC21155m0.o0) {
                abstractC21161p0M115090z0 = m115024G0(this, null, ((AbstractC21155m0.o0) navigationScreen).getShareCode(), 1, null);
            } else if (navigationScreen instanceof AbstractC21155m0.b3) {
                abstractC21161p0M115090z0 = m115029K0(this, null, null, null, ((AbstractC21155m0.b3) navigationScreen).getSource(), 7, null);
            } else if (navigationScreen instanceof AbstractC21155m0.j4) {
                abstractC21161p0M115090z0 = m115033N0(((AbstractC21155m0.j4) navigationScreen).getSource());
            } else if (navigationScreen instanceof AbstractC21155m0.r0) {
                abstractC21161p0M115090z0 = m115040R((AbstractC21155m0.r0) navigationScreen);
            } else if (navigationScreen instanceof AbstractC21155m0.u0) {
                abstractC21161p0M115090z0 = m115018D0();
            } else if (navigationScreen instanceof AbstractC21155m0.c1) {
                abstractC21161p0M115090z0 = m115045U((AbstractC21155m0.c1) navigationScreen);
            } else {
                if (navigationScreen instanceof AbstractC21155m0.j1) {
                    C12969k0 c12969k0M58994a2 = this.navDeepLinkRequestHelper.m58994a(this.featureFlagChecker.isFeatureEnabled("maverick-membership-management-android") ? "android-app://com.whoop/membershipManagement?openFamilyPlan=true" : "android-app://com.whoop/settings/myAccountFragment?openFamilyPlan=true");
                    ((AbstractC12939a0) this.navController.invoke()).m36401p(AbstractC17307e.f66858x, null, this.bottomNavButtonPressOptions);
                    if (this.featureFlagChecker.isFeatureEnabled("maverick-membership-management-android")) {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/settings/myAccountFragment"));
                    }
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(c12969k0M58994a2);
                    return AbstractC21161p0.e.f80691a;
                }
                if (navigationScreen instanceof AbstractC21155m0.g1) {
                    abstractC21161p0M115090z0 = m115047V(((AbstractC21155m0.g1) navigationScreen).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String());
                } else if (navigationScreen instanceof AbstractC21155m0.l1) {
                    abstractC21161p0M115090z0 = AbstractC21161p0.f.f80692a;
                } else if (navigationScreen instanceof AbstractC21155m0.q1) {
                    abstractC21161p0M115090z0 = m115049X((AbstractC21155m0.q1) navigationScreen);
                } else if (navigationScreen instanceof AbstractC21155m0.u1) {
                    abstractC21161p0M115090z0 = m115050Y(((AbstractC21155m0.u1) navigationScreen).getSource());
                } else if (navigationScreen instanceof AbstractC21155m0.w1) {
                    abstractC21161p0M115090z0 = m115051Z((AbstractC21155m0.w1) navigationScreen);
                } else if (navigationScreen instanceof AbstractC21155m0.x1) {
                    abstractC21161p0M115090z0 = m115052b0(((AbstractC21155m0.x1) navigationScreen).getShowOnboarding());
                } else if (navigationScreen instanceof AbstractC21155m0.z1) {
                    abstractC21161p0M115090z0 = m115027I0(this, AbstractC17304b.m49002m(), null, 2, null);
                } else if (navigationScreen instanceof AbstractC21155m0.y1) {
                    abstractC21161p0M115090z0 = m115053c0(((AbstractC21155m0.y1) navigationScreen).getPillar());
                } else if (navigationScreen instanceof AbstractC21155m0.d2) {
                    AbstractC21155m0.d2 d2Var = (AbstractC21155m0.d2) navigationScreen;
                    abstractC21161p0M115090z0 = m115054d0(d2Var.getIntegrationId(), d2Var.getSource());
                } else if (navigationScreen instanceof AbstractC21155m0.e2) {
                    abstractC21161p0M115090z0 = m115057f0((AbstractC21155m0.e2) navigationScreen);
                } else if (navigationScreen instanceof AbstractC21155m0.g2) {
                    abstractC21161p0M115090z0 = m115060h0((AbstractC21155m0.g2) navigationScreen);
                } else if (navigationScreen instanceof AbstractC21155m0.f2) {
                    abstractC21161p0M115090z0 = m115059g0();
                } else if (navigationScreen instanceof AbstractC21155m0.h2) {
                    abstractC21161p0M115090z0 = m115061i0();
                } else if (navigationScreen instanceof AbstractC21155m0.i2) {
                    abstractC21161p0M115090z0 = m115063j0((AbstractC21155m0.i2) navigationScreen);
                } else if (navigationScreen instanceof AbstractC21155m0.j2) {
                    abstractC21161p0M115090z0 = m115064k0((AbstractC21155m0.j2) navigationScreen);
                } else if (navigationScreen instanceof AbstractC21155m0.k2) {
                    abstractC21161p0M115090z0 = m115066l0();
                } else if (navigationScreen instanceof AbstractC21155m0.l2) {
                    abstractC21161p0M115090z0 = m115067m0();
                } else if (navigationScreen instanceof AbstractC21155m0.n2) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/whoopProCheckoutFragment"));
                    abstractC21161p0M115090z0 = AbstractC21161p0.e.f80691a;
                } else if (navigationScreen instanceof AbstractC21155m0.o2) {
                    ((AbstractC12939a0) this.navController.invoke()).m36401p(C9691R.id.profile_levels_graph, AbstractC12889b.m36273g(new C23465k("memberLevelData", LevelsNavigationHelper.INSTANCE.convertToMemberLevelProfileViewData((AbstractC21155m0.o2) navigationScreen))), AbstractC28152c1.m85188f(new C12995w0()).m36508a());
                    abstractC21161p0M115090z0 = AbstractC21161p0.g.f80693a;
                } else if (navigationScreen instanceof AbstractC21155m0.s2) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/activation"));
                    abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                } else if (navigationScreen instanceof AbstractC21155m0.e3) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/settings/myAccountFragment"));
                    abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                } else if (navigationScreen instanceof AbstractC21155m0.g3) {
                    Intent intent = new Intent(this.context, (Class<?>) VideoActivity.class);
                    intent.putExtra("videoUrl", ((AbstractC21155m0.g3) navigationScreen).getVideoUrl());
                    intent.putExtra("SHOULD_SUBTITLES_DEFAULT_TO_OFF", true);
                    this.context.startActivity(intent);
                    abstractC21161p0M115090z0 = AbstractC21161p0.f.f80692a;
                } else {
                    String str = "";
                    if (navigationScreen instanceof AbstractC21155m0.f3) {
                        String strEncode2 = this.featureFlagChecker.isFeatureEnabled("android-encode-education-path-with-spaces") ? Uri.encode(((AbstractC21155m0.f3) navigationScreen).getId()) : URLEncoder.encode(((AbstractC21155m0.f3) navigationScreen).getId(), "UTF-8");
                        AbstractC21155m0.f3 f3Var = (AbstractC21155m0.f3) navigationScreen;
                        String tag = f3Var.getTag();
                        if (tag != null && (strEncode = URLEncoder.encode(tag, "UTF-8")) != null) {
                            str = strEncode;
                        }
                        String eventName = f3Var.getEventName();
                        String entryPoint = f3Var.getEntryPoint();
                        String screenName = f3Var.getScreenName();
                        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
                        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/education?path=", strEncode2, "&eventName=", eventName, "&contentType=");
                        AbstractC11266d.m30444B(sbM32001t, str, "&articleId=", strEncode2, "&entryPoint=");
                        sbM32001t.append(entryPoint);
                        sbM32001t.append("&screenName=");
                        sbM32001t.append(screenName);
                        abstractC21161p0M115090z0 = m115029K0(this, null, c21147i0.m58994a(sbM32001t.toString()), null, null, 13, null);
                    } else if (navigationScreen instanceof AbstractC21155m0.l3) {
                        AbstractC21155m0.l3 l3Var = (AbstractC21155m0.l3) navigationScreen;
                        String onboardingStoryName = l3Var.getOnboardingStoryName();
                        String entryPoint2 = l3Var.getEntryPoint();
                        long cycleId = l3Var.getCycleId();
                        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
                        C21147i0 c21147i1 = this.navDeepLinkRequestHelper;
                        StringBuilder sbM32001t2 = AbstractC11895b.m32001t("android-app://com.whoop/onboardingStoriesFragmentRedesign/", onboardingStoryName, "?entryPoint=", entryPoint2, "&cycleId=");
                        sbM32001t2.append(cycleId);
                        abstractC12939a0.m36404s(c21147i1.m58994a(sbM32001t2.toString()));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.y4) {
                        AbstractC21155m0.y4 y4Var = (AbstractC21155m0.y4) navigationScreen;
                        Long templateId = y4Var.getTemplateId();
                        String entryPoint3 = y4Var.getEntryPoint();
                        String activityId = y4Var.getActivityId();
                        if (templateId == null && entryPoint3 == null) {
                            abstractC21161p0M115090z0 = m115085w0(y4Var.getOpenTab());
                        } else {
                            long jLongValue = templateId != null ? templateId.longValue() : -1L;
                            if (entryPoint3 == null || (strConcat = "&entryPoint=".concat(entryPoint3)) == null) {
                                strConcat = "";
                            }
                            if (activityId == null || (strConcat2 = "&activityId=".concat(activityId)) == null) {
                                strConcat2 = "";
                            }
                            String openTab = y4Var.getOpenTab();
                            if (openTab != null && (strM30461o = AbstractC11266d.m30461o("&openTab=", Uri.encode(openTab))) != null) {
                                str = strM30461o;
                            }
                            ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/workout/template?templateId=" + jLongValue + "&isFromWhoopCoach=" + y4Var.getIsFromWhoopCoach() + strConcat2 + strConcat + str));
                            abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                        }
                    } else if (navigationScreen instanceof AbstractC21155m0.q3) {
                        AbstractC21155m0.q3 q3Var = (AbstractC21155m0.q3) navigationScreen;
                        String date = q3Var.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        if (date != null) {
                            c12969k0M58994a = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/pregnancyInsights?date=" + date + "&source=" + q3Var.getSource());
                            if (c12969k0M58994a == null) {
                                c12969k0M58994a = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/pregnancyInsights?source=" + q3Var.getSource());
                            }
                        } else {
                            c12969k0M58994a = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/pregnancyInsights?source=" + q3Var.getSource());
                        }
                        C12995w0 c12995w0 = new C12995w0();
                        c12995w0.f44891a = true;
                        ((AbstractC12939a0) this.navController.invoke()).m36405t(c12969k0M58994a, this.featureFlagChecker.isFeatureEnabled("android-health-push-navigation") ? AbstractC28152c1.m85188f(c12995w0).m36508a() : c12995w0.m36508a());
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.r3) {
                        AbstractC21155m0.r3 r3Var = (AbstractC21155m0.r3) navigationScreen;
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/pregnancySettingsFragment?pregnancyScreen=" + r3Var.getPregnancyScreen() + "&source=" + r3Var.getSource()));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.s3) {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/pregnancyInsights?id=" + ((AbstractC21155m0.s3) navigationScreen).getId()));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.y3) {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/reactivationModal"));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.k4) {
                        AbstractC21155m0.k4 k4Var = (AbstractC21155m0.k4) navigationScreen;
                        abstractC21161p0M115090z0 = m115071o0(k4Var.getGaugeType(), k4Var.getSelectedDate());
                    } else if (navigationScreen instanceof AbstractC21155m0.l4) {
                        abstractC21161p0M115090z0 = m115073p0();
                    } else if (navigationScreen instanceof AbstractC21155m0.m4) {
                        abstractC21161p0M115090z0 = m115075q0((AbstractC21155m0.m4) navigationScreen);
                    } else if (navigationScreen instanceof AbstractC21155m0.n4) {
                        abstractC21161p0M115090z0 = m115077r0();
                    } else if (navigationScreen instanceof AbstractC21155m0.o4) {
                        abstractC21161p0M115090z0 = m115078s0((AbstractC21155m0.o4) navigationScreen);
                    } else if (navigationScreen instanceof AbstractC21155m0.p4) {
                        abstractC21161p0M115090z0 = m115079t0();
                    } else if (AbstractC22676k.m65745e(navigationScreen, AbstractC21155m0.q4.f80523b)) {
                        abstractC21161p0M115090z0 = m115081u0();
                    } else if (navigationScreen instanceof AbstractC21155m0.r4) {
                        abstractC21161p0M115090z0 = m115031M0(null, this.navDeepLinkRequestHelper.m58994a("whoop://com.whoop/sleepCoachFragment/?entryPoint=Home&clickType=tile&isFromHome=true&sourcePillar=" + ((AbstractC21155m0.r4) navigationScreen).getSourcePillar()), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105962g, AbstractC26660a.f105964i, AbstractC26660a.f105961f, AbstractC26660a.f105966k));
                    } else if (navigationScreen instanceof AbstractC21155m0.t4) {
                        Intent intentMo23852f = StartActivityActivity.INSTANCE.m24004a(this.context).m49148e().mo23852f();
                        AbstractC21155m0.t4 t4Var = (AbstractC21155m0.t4) navigationScreen;
                        Integer sportId = t4Var.getSportId();
                        if (sportId != null) {
                            intentMo23852f.putExtra("sport_id", sportId.intValue());
                        }
                        Boolean autoStartActivity = t4Var.getAutoStartActivity();
                        if (autoStartActivity != null) {
                            intentMo23852f.putExtra("auto_start", autoStartActivity.booleanValue());
                        }
                        this.context.startActivity(intentMo23852f);
                        abstractC21161p0M115090z0 = AbstractC21161p0.f.f80692a;
                    } else if (navigationScreen instanceof AbstractC21155m0.v4) {
                        AbstractC21155m0.v4 v4Var = (AbstractC21155m0.v4) navigationScreen;
                        String code = v4Var.getCode();
                        String scope = v4Var.getScope();
                        String state = v4Var.getState();
                        StringBuilder sbM32001t3 = AbstractC11895b.m32001t("android-app://com.whoop/strava/navigation?code=", code, "&scope=", scope, "&state=");
                        sbM32001t3.append(state);
                        abstractC21161p0M115090z0 = m115029K0(this, null, this.navDeepLinkRequestHelper.m58994a(sbM32001t3.toString()), null, null, 13, null);
                    } else if (navigationScreen instanceof AbstractC21155m0.c5) {
                        AbstractC21155m0.c5 c5Var = (AbstractC21155m0.c5) navigationScreen;
                        abstractC21161p0M115090z0 = m115086x0(c5Var.getCycleDate(), c5Var.getSource());
                    } else if (navigationScreen instanceof AbstractC21155m0.f5) {
                        m115088y0((AbstractC21155m0.f5) navigationScreen);
                        abstractC21161p0M115090z0 = AbstractC21161p0.f.f80692a;
                    } else if (navigationScreen instanceof AbstractC21155m0.d5) {
                        abstractC21161p0M115090z0 = m115048W();
                    } else if (navigationScreen instanceof AbstractC21155m0.o5) {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/upcycle_landing"));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.y5) {
                        abstractC21161p0M115090z0 = m115017C0((AbstractC21155m0.y5) navigationScreen);
                    } else if (navigationScreen instanceof AbstractC21155m0.f0) {
                        abstractC21161p0M115090z0 = m115038Q(((AbstractC21155m0.f0) navigationScreen).getSource());
                    } else if (navigationScreen instanceof AbstractC21155m0.e0) {
                        AbstractC21155m0.e0 e0Var = (AbstractC21155m0.e0) navigationScreen;
                        abstractC21161p0M115090z0 = m115036P(e0Var.getDetailId(), e0Var.getSource());
                    } else if (AbstractC22676k.m65745e(navigationScreen, AbstractC21155m0.u4.f80569b)) {
                        abstractC21161p0M115090z0 = m115083v0();
                    } else if (navigationScreen instanceof AbstractC21155m0.g5) {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/coaching/sleepcoach/turnOffAlarmWarningFragment?notificationTileId=" + ((AbstractC21155m0.g5) navigationScreen).getNotificationTileId()));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.s0) {
                        abstractC21161p0M115090z0 = m115042S(((AbstractC21155m0.s0) navigationScreen).getEntryPoint());
                    } else if (AbstractC22676k.m65745e(navigationScreen, AbstractC21155m0.n0.f80473b)) {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/ai-coach-settings"));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (AbstractC22676k.m65745e(navigationScreen, AbstractC21155m0.q5.f80524b)) {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/userJourneyFragment"));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.t5) {
                        abstractC21161p0M115090z0 = m115016B0(this, false, null, null, 4, null);
                    } else if (navigationScreen instanceof AbstractC21155m0.r5) {
                        AbstractC21155m0.r5 r5Var = (AbstractC21155m0.r5) navigationScreen;
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/customizePlan?planEditScreens=" + r5Var.m59263c() + "&analyticsSource=" + r5Var.getAnalyticsSource()));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.s5) {
                        AbstractC21155m0.s5 s5Var = (AbstractC21155m0.s5) navigationScreen;
                        m115015A0(s5Var.getShowPresets(), s5Var.getScrollId(), s5Var.getSource());
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.u5) {
                        C12997x0 c12997x0M85184b = AbstractC28152c1.m85184b();
                        AbstractC21155m0.u5 u5Var = (AbstractC21155m0.u5) navigationScreen;
                        boolean locked = u5Var.getLocked();
                        String planName = u5Var.getPlanName();
                        boolean noPlanShowMetricSelection = u5Var.getNoPlanShowMetricSelection();
                        String analyticsSource = u5Var.getAnalyticsSource();
                        StringBuilder sbM38567n = AbstractC13673n.m38567n("android-app://com.whoop/hubAndSpoke?locked=", "&planName=", planName, "&noPlanShowMetricSelection=", locked);
                        sbM38567n.append(noPlanShowMetricSelection);
                        sbM38567n.append("&analyticsSource=");
                        sbM38567n.append(analyticsSource);
                        StringBuilder sb4 = new StringBuilder(sbM38567n.toString());
                        String initialSelection = u5Var.getInitialSelection();
                        if (initialSelection != null) {
                            sb4.append("&initialSelection=" + URLEncoder.encode(initialSelection, "UTF-8"));
                        }
                        String date2 = u5Var.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        if (date2 != null) {
                            sb4.append("&date=".concat(date2));
                        }
                        String source = u5Var.getSource();
                        if (source != null) {
                            sb4.append("&source=".concat(source));
                        }
                        String presetPlanCategory = u5Var.getPresetPlanCategory();
                        if (presetPlanCategory != null) {
                            sb4.append("&presetPlanCategory=".concat(presetPlanCategory));
                        }
                        String planTitle = u5Var.getPlanTitle();
                        if (planTitle != null) {
                            sb4.append("&planTitle=" + URLEncoder.encode(planTitle, "UTF-8"));
                        }
                        String description = u5Var.getDescription();
                        if (description != null) {
                            sb4.append("&description=" + URLEncoder.encode(description, "UTF-8"));
                        }
                        String explanationTitle = u5Var.getExplanationTitle();
                        if (explanationTitle != null) {
                            sb4.append("&explanationTitle=" + URLEncoder.encode(explanationTitle, "UTF-8"));
                        }
                        String explanation = u5Var.getExplanation();
                        if (explanation != null) {
                            sb4.append("&explanation=" + URLEncoder.encode(explanation, "UTF-8"));
                        }
                        String templateId2 = u5Var.getTemplateId();
                        if (templateId2 != null) {
                            sb4.append("&templateId=".concat(templateId2));
                        }
                        String category = u5Var.getCategory();
                        if (category != null) {
                            sb4.append("&category=".concat(category));
                        }
                        String carouselPlacement = u5Var.getCarouselPlacement();
                        if (carouselPlacement != null) {
                            sb4.append("&carouselPlacement=".concat(carouselPlacement));
                        }
                        EnumC21172v dismissalType = u5Var.getDismissalType();
                        if (dismissalType != null) {
                            sb4.append("&dismissalType=" + dismissalType.name());
                        }
                        AbstractC12939a0 abstractC12939a1 = (AbstractC12939a0) this.navController.invoke();
                        C21147i0 c21147i2 = this.navDeepLinkRequestHelper;
                        String string = sb4.toString();
                        AbstractC22676k.m65749i(string, "toString(...)");
                        abstractC12939a1.m36405t(c21147i2.m58994a(string), c12997x0M85184b);
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.v5) {
                        AbstractC12939a0 abstractC12939a2 = (AbstractC12939a0) this.navController.invoke();
                        C21147i0 c21147i3 = this.navDeepLinkRequestHelper;
                        String string2 = C36494c.f155913a.m116954a(((AbstractC21155m0.v5) navigationScreen).getPlanId()).toString();
                        AbstractC22676k.m65749i(string2, "toString(...)");
                        abstractC12939a2.m36404s(c21147i3.m58994a(string2));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.w5) {
                        abstractC21161p0M115090z0 = m115090z0();
                    } else if (navigationScreen instanceof AbstractC21155m0.x5) {
                        Uri.Builder builderPath = new Uri.Builder().scheme("android-app").authority("com.whoop").path("whooplabs");
                        AbstractC21155m0.x5 x5Var = (AbstractC21155m0.x5) navigationScreen;
                        Integer campaignId = x5Var.getCampaignId();
                        if (campaignId != null) {
                            builderPath.appendQueryParameter("campaignId", String.valueOf(campaignId.intValue()));
                        }
                        Integer sessionId = x5Var.getSessionId();
                        if (sessionId != null) {
                            builderPath.appendQueryParameter("sessionId", String.valueOf(sessionId.intValue()));
                        }
                        String campaignFilter = x5Var.getCampaignFilter();
                        if (campaignFilter != null) {
                            builderPath.appendQueryParameter("campaignFilter", campaignFilter);
                        }
                        Uri uriBuild = builderPath.build();
                        AbstractC12939a0 abstractC12939a3 = (AbstractC12939a0) this.navController.invoke();
                        C21147i0 c21147i4 = this.navDeepLinkRequestHelper;
                        String string3 = uriBuild.toString();
                        AbstractC22676k.m65749i(string3, "toString(...)");
                        abstractC12939a3.m36404s(c21147i4.m58994a(string3));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.a6) {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/userJourneyFragment?year=" + ((AbstractC21155m0.a6) navigationScreen).getYear()));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.b6) {
                        ((AbstractC12939a0) this.navController.invoke()).m36405t(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/yearinreviewshare"), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.j0) {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/challengeDetails?name=" + ((AbstractC21155m0.j0) navigationScreen).getName()));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else if (navigationScreen instanceof AbstractC21155m0.z5) {
                        AbstractC21155m0.z5 z5Var = (AbstractC21155m0.z5) navigationScreen;
                        String source2 = z5Var.getSource();
                        String strM30461o2 = source2 != null ? AbstractC11266d.m30461o("&source=", Uri.encode(source2)) : null;
                        str = strM30461o2 != null ? strM30461o2 : "";
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/whoopShare?path=" + z5Var.getPath() + str));
                        abstractC21161p0M115090z0 = AbstractC21161p0.d.f80690a;
                    } else {
                        abstractC21161p0M115090z0 = AbstractC22676k.m65745e(navigationScreen, AbstractC21155m0.j3.f80414b) ? AbstractC21161p0.c.f80689a : AbstractC21161p0.h.f80694a;
                    }
                }
            }
        }
        this.logger.mo85228t("Navigation to " + navigationScreen + " resulted in " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(abstractC21161p0M115090z0.getClass()).getSimpleName(), new AbstractC30556a.a[0]);
        return abstractC21161p0M115090z0;
    }

    /* JADX INFO: renamed from: F */
    private final boolean m115021F(AbstractC21155m0 screen) {
        C12977n0 c12977n0M36394i;
        return ((screen instanceof AbstractC21155m0.z1) || (screen instanceof AbstractC21155m0.y1)) && (c12977n0M36394i = ((AbstractC12939a0) this.navController.invoke()).m36394i()) != null && c12977n0M36394i.f44819H == AbstractC17307e.f66562D2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F0 */
    private final AbstractC21161p0 m115022F0(InterfaceC12981p0 navDirections, String shareCode) throws UnsupportedEncodingException {
        String strM30461o;
        if (this.communityAccessChecker.mo31687a()) {
            mo59392a(new C9598e(AppScreen.C9361m1.f27766w, new CommunityUnavailableScreenModel("followers-service/v1/error/medicare", "COMMUNITY"), new C21173v0("community")));
        } else if (navDirections != null) {
            ((AbstractC12939a0) this.navController.invoke()).m36407v(navDirections);
        } else {
            String str = null;
            Object[] objArr = 0;
            if (C25321d.f99318a.m74366a(this.featureFlagChecker, this.entitlementChecker)) {
                if (shareCode == null || (strM30461o = AbstractC11266d.m30461o("followers-service/v1/followers-home?share_code=", Uri.encode(shareCode))) == null) {
                    strM30461o = "followers-service/v1/followers-home";
                }
                mo59393b(new AbstractC21155m0.e5("COMMUNITY", new ApiRequest(strM30461o, GenericHttpMethod.GET, (JsonElement) null, 4, (DefaultConstructorMarker) null), m115076r(shareCode), null, null, new MetricEventModel("community_followers_home", str, 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0)), null, this.bottomNavButtonPressOptions, null, 344, null));
            } else {
                ((AbstractC12939a0) this.navController.invoke()).m36401p(AbstractC17307e.f66823s, null, this.bottomNavButtonPressOptions);
            }
        }
        return AbstractC21161p0.b.f80688a;
    }

    /* JADX INFO: renamed from: G */
    private final boolean m115023G(AbstractC21161p0 abstractC21161p0) {
        return ((abstractC21161p0 instanceof AbstractC21161p0.c) || (abstractC21161p0 instanceof AbstractC21161p0.f) || (abstractC21161p0 instanceof AbstractC21161p0.h)) ? false : true;
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ AbstractC21161p0 m115024G0(C36159d c36159d, InterfaceC12981p0 interfaceC12981p0, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC12981p0 = null;
        }
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c36159d.m115022F0(interfaceC12981p0, str);
    }

    /* JADX INFO: renamed from: H0 */
    private final AbstractC21161p0 m115025H0(InterfaceC12981p0 navDirections, C12997x0 navOptions) {
        if (navDirections != null) {
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
            abstractC12939a0.getClass();
            abstractC12939a0.m36401p(navDirections.mo19186a(), navDirections.getArguments(), navOptions);
        } else {
            ((AbstractC12939a0) this.navController.invoke()).m36401p(AbstractC17307e.f66844v, AbstractC12889b.m36273g(new C23465k("destinationPillar", "OVERVIEW")), new C12997x0(false, false, AbstractC17307e.f66562D2, true, false, -1, -1, -1, -1));
        }
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: I */
    private final void m115026I(Intent intent, InterfaceC21152l result) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("push_source_id")) == null || (result instanceof C21131b)) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("push_type");
        if (stringExtra2 == null) {
            stringExtra2 = "unknown";
        }
        String stringExtra3 = intent.getStringExtra("push_channel_id");
        this.logger.mo85216g(AbstractC25012a.m73376i(stringExtra3 != null ? stringExtra3 : "unknown", "] failed to open - Failed to create a destination from deep link", AbstractC11895b.m32001t("Push Notification with [id=", stringExtra, "] [type=", stringExtra2, "] [channel_id=")), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ AbstractC21161p0 m115027I0(C36159d c36159d, InterfaceC12981p0 interfaceC12981p0, C12997x0 c12997x0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC12981p0 = null;
        }
        if ((i13 & 2) != 0) {
            c12997x0 = null;
        }
        return c36159d.m115025H0(interfaceC12981p0, c12997x0);
    }

    /* JADX INFO: renamed from: J0 */
    private final AbstractC21161p0 m115028J0(InterfaceC12981p0 navDirections, C12969k0 navDeepLinkRequest, C12997x0 navOptions, String settingsSource) {
        if (navDirections != null) {
            ((AbstractC12939a0) this.navController.invoke()).m36407v(navDirections);
        } else if (navDeepLinkRequest != null) {
            ((AbstractC12939a0) this.navController.invoke()).m36405t(navDeepLinkRequest, navOptions);
        } else {
            ((AbstractC12939a0) this.navController.invoke()).m36401p(AbstractC17307e.f66858x, AbstractC12889b.m36273g(new C23465k("settingsSource", settingsSource)), this.bottomNavButtonPressOptions);
        }
        return AbstractC21161p0.e.f80691a;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ AbstractC21161p0 m115029K0(C36159d c36159d, InterfaceC12981p0 interfaceC12981p0, C12969k0 c12969k0, C12997x0 c12997x0, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC12981p0 = null;
        }
        if ((i13 & 2) != 0) {
            c12969k0 = null;
        }
        if ((i13 & 4) != 0) {
            c12997x0 = null;
        }
        if ((i13 & 8) != 0) {
            str = null;
        }
        return c36159d.m115028J0(interfaceC12981p0, c12969k0, c12997x0, str);
    }

    /* JADX INFO: renamed from: L */
    private final void m115030L(AbstractC21155m0 navigationScreen, AbstractC21161p0 result) {
        if (m115023G(result) && this.tabRootResolver.m115110a(navigationScreen)) {
            m115095K();
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final AbstractC21161p0 m115031M0(InterfaceC12981p0 navDirections, C12969k0 navDeepLinkRequest, C12997x0 navOptions) {
        if (navDirections != null) {
            ((AbstractC12939a0) this.navController.invoke()).m36407v(navDirections);
        } else if (navDeepLinkRequest != null) {
            ((AbstractC12939a0) this.navController.invoke()).m36405t(navDeepLinkRequest, navOptions);
        } else {
            ((AbstractC12939a0) this.navController.invoke()).m36405t(this.navDeepLinkRequestHelper.m58994a("whoop://com.whoop/sleepCoachFragment/?entryPoint=BottomNav&clickType=tab"), this.bottomNavButtonPressOptions);
        }
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: N */
    private final AbstractC21161p0 m115032N(AbstractC21155m0.e screen) {
        int i13 = a.f154727a[AbstractC21128a.m58959a(screen.getActivityType()).ordinal()];
        if (i13 == 1) {
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
            C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
            String activityIdV2 = screen.getActivityIdV2();
            String source = screen.getSource();
            boolean newHome = screen.getNewHome();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/coreDetails/sleepDetails?sleepIdV2=", activityIdV2, "&source=", source, "&newHome=");
            sbM32001t.append(newHome);
            abstractC12939a0.m36405t(c21147i0.m58994a(sbM32001t.toString()), AbstractC28152c1.m85188f(new C12995w0()).m36508a());
            return AbstractC21161p0.d.f80690a;
        }
        if (i13 == 2) {
            String source2 = screen.getSource();
            return m115025H0(AbstractC17304b.m49001l(source2 != null ? source2 : "Overview", "Cardio", screen.getNewHome(), screen.getActivityIdV2()), AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-activity-push-navigation")));
        }
        if (i13 == 3) {
            String source3 = screen.getSource();
            return m115025H0(AbstractC17304b.m49001l(source3 != null ? source3 : "Overview", "Recovery", screen.getNewHome(), screen.getActivityIdV2()), AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-activity-push-navigation")));
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String source4 = screen.getSource();
        return m115025H0(AbstractC17304b.m49001l(source4 != null ? source4 : "Overview", "Cardio", screen.getNewHome(), screen.getActivityIdV2()), AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-activity-push-navigation")));
    }

    /* JADX INFO: renamed from: N0 */
    private final AbstractC21161p0 m115033N0(String source) {
        ((AbstractC12939a0) this.navController.invoke()).m36401p(AbstractC17307e.f66858x, AbstractC12889b.m36273g(new C23465k("navigationStyle", "PRESENT"), new C23465k("settingsSource", source)), AbstractC28152c1.m85186d(new C12995w0()).m36508a());
        return AbstractC21161p0.e.f80691a;
    }

    /* JADX INFO: renamed from: O */
    private final AbstractC21161p0 m115034O(AbstractC21155m0.f screen) {
        String string;
        String string2;
        String str;
        String str2;
        String value = (screen.getIsSleepActivity() ? EnumC26455a.SLEEP : EnumC26455a.ALL).getValue();
        LocalDateTime endTime = screen.getEndTime();
        if (endTime == null || (str2 = endTime.format(DateTimeFormatter.ofPattern(StreamDateFormatter.DATE_FORMAT))) == null || (string = str2.toString()) == null) {
            string = screen.getActivityDate().atTime(LocalTime.now(this.clock)).format(DateTimeFormatter.ofPattern(StreamDateFormatter.DATE_FORMAT)).toString();
        }
        LocalDateTime startTime = screen.getStartTime();
        if (startTime == null || (str = startTime.format(DateTimeFormatter.ofPattern(StreamDateFormatter.DATE_FORMAT))) == null || (string2 = str.toString()) == null) {
            string2 = screen.getActivityDate().atTime(LocalTime.now(this.clock)).minusHours(1L).format(DateTimeFormatter.ofPattern(StreamDateFormatter.DATE_FORMAT)).toString();
        }
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        String activityInternalName = screen.getActivityInternalName();
        boolean isGdcFlow = screen.getIsGdcFlow();
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/editActivity/AddActivity?screenType=", value, "&startDate=", string2, "&endDate=");
        AbstractC11266d.m30444B(sbM32001t, string, "&internalActivityName=", activityInternalName, "&GDCflow=");
        sbM32001t.append(isGdcFlow);
        abstractC12939a0.m36404s(c21147i0.m58994a(sbM32001t.toString()));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: O0 */
    private final void m115035O0(C9598e action) {
        if (AbstractC22676k.m65745e(action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9316g4.f27625w) && mo59395e(action)) {
            return;
        }
        mo59392a(action);
    }

    /* JADX INFO: renamed from: P */
    private final AbstractC21161p0 m115036P(String detailId, String source) {
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        if (source == null) {
            source = "";
        }
        ((AbstractC12939a0) this.navController.invoke()).m36405t(c21147i0.m58994a("android-app://com.whoop/behavior_impact_details?impactId=" + detailId + "?isNew=false?source=" + source), new C12997x0(true, false, -1, false, false, -1, -1, -1, -1));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: P0 */
    private final boolean m115037P0(C9598e c9598e) {
        C21173v0 tab = c9598e.getTab();
        return ((tab != null ? tab.getId() : null) == null && C36166k.f154741a.m115107a(c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()) == null) ? false : true;
    }

    /* JADX INFO: renamed from: Q */
    private final AbstractC21161p0 m115038Q(String source) {
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        if (source == null) {
            source = "Notification";
        }
        C12969k0 c12969k0M58994a = c21147i0.m58994a("android-app://com.whoop/behavior_impact?source=".concat(source));
        C12995w0 c12995w0 = new C12995w0();
        c12995w0.f44891a = true;
        m115031M0(null, c12969k0M58994a, this.featureFlagChecker.isFeatureEnabled("android-health-push-navigation") ? AbstractC28152c1.m85188f(c12995w0).m36508a() : c12995w0.m36508a());
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: Q0 */
    private final boolean m115039Q0(AbstractC21155m0 navigationScreen, boolean noopFixEnabled, InterfaceC4339a onAiActionHandled) {
        AbstractC21155m0 abstractC21155m0Mo34149y;
        C12977n0 c12977n0M36394i;
        C12977n0 c12977n0M36394i2;
        AiAction aiAction = navigationScreen.getAiAction();
        if (aiAction == null || !this.featureFlagChecker.isFeatureEnabled("wce-dynamic-bdn-deeplink-support")) {
            return false;
        }
        onAiActionHandled.invoke();
        InterfaceC12251g interfaceC12251g = this.globalCoachManager;
        if (interfaceC12251g != null) {
            InterfaceC12251g.m34132f(interfaceC12251g, 0L, null, AbstractC6219a.m18524b(aiAction, true), 3, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.p) {
            return false;
        }
        if ((navigationScreen instanceof AbstractC21155m0.z1) && (c12977n0M36394i2 = ((AbstractC12939a0) this.navController.invoke()).m36394i()) != null && c12977n0M36394i2.f44819H == AbstractC17307e.f66562D2) {
            return true;
        }
        if (noopFixEnabled && (navigationScreen instanceof AbstractC21155m0.d2) && (c12977n0M36394i = ((AbstractC12939a0) this.navController.invoke()).m36394i()) != null && c12977n0M36394i.f44819H == AbstractC17307e.f66592I2) {
            return true;
        }
        InterfaceC12251g interfaceC12251g2 = this.globalCoachManager;
        return (interfaceC12251g2 == null || (abstractC21155m0Mo34149y = interfaceC12251g2.mo34149y()) == null || !AbstractC36169n.m115112b(navigationScreen, abstractC21155m0Mo34149y)) ? false : true;
    }

    /* JADX INFO: renamed from: R */
    private final AbstractC21161p0 m115040R(AbstractC21155m0.r0 screen) {
        if (!AbstractC22676k.m65745e(screen.getConnectivityNavType(), "PAIR_STRAP")) {
            return m115029K0(this, null, this.navDeepLinkRequestHelper.m58994a("whoop://com.whoop/settings/newStrapSettings"), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, -1), null, 9, null);
        }
        AbstractC10531a.m27136a(this.context).m93405s().m49154m();
        return AbstractC21161p0.f.f80692a;
    }

    /* JADX INFO: renamed from: R0 */
    private final AbstractC21161p0 m115041R0(String tabId, AbstractC21155m0 screen) {
        AbstractC21161p0 abstractC21161p0Mo59393b;
        if (screen != null && this.bffBottomNavConfigSource.mo61185a(tabId)) {
            this.bffBottomNavTabEventPublisher.m58980c(new InterfaceC21136d.d(tabId));
            return m115097M(AbstractC36160e.m115099a(screen, this.bffTabNavOptions));
        }
        this.logger.mo85226q(AbstractC11478a.m30857i("Unknown BFF tab requested: tabId=", tabId, ", hasScreen=", screen != null), new AbstractC30556a.a[0]);
        this.bffBottomNavTabEventPublisher.m58980c(new InterfaceC21136d.e(tabId));
        return (screen == null || (abstractC21161p0Mo59393b = mo59393b(screen)) == null) ? AbstractC21161p0.h.f80694a : abstractC21161p0Mo59393b;
    }

    /* JADX INFO: renamed from: S */
    private final AbstractC21161p0 m115042S(String entryPoint) {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/contentSearchFragment?entryPoint=" + entryPoint));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: S0 */
    private final boolean m115043S0(String sourceOverride) {
        Object next;
        C9598e destination;
        Iterator it = ((Iterable) this.bffBottomNavConfigSource.mo61188d().getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            destination = ((TabConfiguration) next).getDestination();
        } while (!AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9316g4.f27625w));
        TabConfiguration tabConfiguration = (TabConfiguration) next;
        if (tabConfiguration == null) {
            return false;
        }
        AbstractC21155m0 abstractC21155m0M115012a = this.appConfigurationTabResolver.m115012a(tabConfiguration);
        if (sourceOverride != null && (abstractC21155m0M115012a instanceof AbstractC21155m0.i3)) {
            abstractC21155m0M115012a = AbstractC21155m0.i3.m59146c((AbstractC21155m0.i3) abstractC21155m0M115012a, sourceOverride, null, 2, null);
        }
        m115041R0(tabConfiguration.getId(), abstractC21155m0M115012a);
        return true;
    }

    /* JADX INFO: renamed from: T0 */
    private final AbstractC21155m0 m115044T0(AbstractC21155m0 abstractC21155m0, AiAction aiAction) {
        if (aiAction != null && abstractC21155m0.getAiAction() == null) {
            if (abstractC21155m0 instanceof AbstractC21155m0.z1) {
                return ((AbstractC21155m0.z1) abstractC21155m0).m59381b(aiAction);
            }
            if (abstractC21155m0 instanceof AbstractC21155m0.m1) {
                return AbstractC21155m0.m1.m59196c((AbstractC21155m0.m1) abstractC21155m0, null, null, null, null, null, aiAction, null, null, null, null, 991, null);
            }
            if (abstractC21155m0 instanceof AbstractC21155m0.e5) {
                return AbstractC21155m0.e5.m59093c((AbstractC21155m0.e5) abstractC21155m0, null, null, null, null, null, null, null, null, aiAction, 255, null);
            }
            this.logger.mo85226q(AbstractC11266d.m30461o("withAiAction: dropping ai_action for unsupported screen type ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(abstractC21155m0.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
        }
        return abstractC21155m0;
    }

    /* JADX INFO: renamed from: U */
    private final AbstractC21161p0 m115045U(AbstractC21155m0.c1 screen) {
        String activityType = screen.getActivityType();
        if (activityType == null) {
            activityType = "";
        }
        String activityIdV2 = screen.getActivityIdV2();
        if (activityIdV2 == null) {
            activityIdV2 = "";
        }
        String activityInternalName = screen.getActivityInternalName();
        String str = activityInternalName != null ? activityInternalName : "";
        org.joda.time.LocalDateTime endTime = screen.getEndTime();
        String string = endTime != null ? endTime.toString(DateTimeRange.INSTANCE.getDateTimeFormatter()) : null;
        org.joda.time.LocalDateTime startTime = screen.getStartTime();
        String string2 = startTime != null ? startTime.toString(DateTimeRange.INSTANCE.getDateTimeFormatter()) : null;
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        String flow = screen.getFlow();
        boolean isDeletable = screen.getIsDeletable();
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/editActivity/EditActivity?startDate=", string2, "&endDate=", string, "&internalActivityName=");
        AbstractC11266d.m30444B(sbM32001t, str, "&activityId=", activityIdV2, "&activityType=");
        AbstractC11266d.m30444B(sbM32001t, activityType, "&flow=", flow, "&isDeletable=");
        sbM32001t.append(isDeletable);
        abstractC12939a0.m36404s(c21147i0.m58994a(sbM32001t.toString()));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: U0 */
    private final AbstractC21155m0 m115046U0(AbstractC21155m0 abstractC21155m0, NavigationScreenModel navigationScreenModel) {
        Map<String, String> mapM115014A = m115014A(navigationScreenModel);
        if (mapM115014A.isEmpty()) {
            return abstractC21155m0;
        }
        GenericCachePolicy genericCachePolicyM115089z = m115089z(navigationScreenModel);
        if (abstractC21155m0 instanceof AbstractC21155m0.m1) {
            AbstractC21155m0.m1 m1Var = (AbstractC21155m0.m1) abstractC21155m0;
            ApiRequest apiRequestM115070o = m115070o(m1Var.getRequest(), mapM115014A);
            if (genericCachePolicyM115089z == null) {
                genericCachePolicyM115089z = m1Var.getCachePolicy();
            }
            return AbstractC21155m0.m1.m59196c(m1Var, apiRequestM115070o, genericCachePolicyM115089z, null, null, null, null, null, null, null, null, 1020, null);
        }
        if (!(abstractC21155m0 instanceof AbstractC21155m0.e5)) {
            return abstractC21155m0;
        }
        AbstractC21155m0.e5 e5Var = (AbstractC21155m0.e5) abstractC21155m0;
        ApiRequest apiRequestM115070o2 = m115070o(e5Var.getRequest(), mapM115014A);
        if (genericCachePolicyM115089z == null) {
            genericCachePolicyM115089z = e5Var.getCachePolicy();
        }
        return AbstractC21155m0.e5.m59093c(e5Var, null, apiRequestM115070o2, genericCachePolicyM115089z, null, null, null, null, null, null, 505, null);
    }

    /* JADX INFO: renamed from: V */
    private final AbstractC21161p0 m115047V(String url) {
        C28216y.m85414y(this.externalLinkNavigator, this.context, url, false, 4, null);
        return AbstractC21161p0.f.f80692a;
    }

    /* JADX INFO: renamed from: W */
    private final AbstractC21161p0 m115048W() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.context.getString(AbstractC26666g.f106017h)));
        intent.setPackage(C4987d.GOOGLE_PLAY_STORE_PACKAGE);
        try {
            this.context.startActivity(intent);
        } catch (ActivityNotFoundException e5) {
            this.logger.mo85230v("Failed to navigate to Play Store!", e5, new AbstractC30556a.a[0]);
            AbstractActivityC1340r0 abstractActivityC1340r0 = this.context;
            Toast.makeText(abstractActivityC1340r0, abstractActivityC1340r0.getString(AbstractC17312j.f67024t0), 1).show();
        }
        return AbstractC21161p0.f.f80692a;
    }

    /* JADX INFO: renamed from: X */
    private final AbstractC21161p0 m115049X(AbstractC21155m0.q1 navigationScreen) {
        Uri.Builder builderPath = new Uri.Builder().scheme("android-app").authority("com.whoop").path("composableHealthMonitor");
        String source = navigationScreen.getSource();
        if (source != null) {
            builderPath.appendQueryParameter("source", source);
        }
        if (navigationScreen.getInitialHr() != null && navigationScreen.getInitialHrZone() != null) {
            builderPath.appendQueryParameter("initialHr", String.valueOf(navigationScreen.getInitialHr()));
            builderPath.appendQueryParameter("initialHrZone", String.valueOf(navigationScreen.getInitialHrZone()));
        }
        C12997x0 c12997x0M85185c = AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-health-push-navigation"));
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        String string = builderPath.build().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        abstractC12939a0.m36405t(c21147i0.m58994a(string), c12997x0M85185c);
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: Y */
    private final AbstractC21161p0 m115050Y(String source) {
        ((AbstractC12939a0) this.navController.invoke()).m36405t(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/heart_screener?source=" + source), AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-health-push-navigation")));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: Z */
    private final AbstractC21161p0 m115051Z(AbstractC21155m0.w1 navigationScreen) {
        String webUrl;
        String helpType = navigationScreen.getHelpType();
        switch (helpType.hashCode()) {
            case -1838664331:
                if (helpType.equals("STRAIN")) {
                    if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NATIVE_EDUCATION_STRAIN)) {
                        C28216y c28216y = this.externalLinkNavigator;
                        AbstractActivityC1340r0 abstractActivityC1340r0 = this.context;
                        String string = abstractActivityC1340r0.getString(AbstractC17312j.f66986g1);
                        AbstractC22676k.m65749i(string, "getString(...)");
                        C28216y.m85414y(c28216y, abstractActivityC1340r0, string, false, 4, null);
                    } else {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=STRAIN_EDUCATION&entryPoint=" + navigationScreen.getEntryPoint() + "&screenName=Strain"));
                    }
                }
                break;
            case -1202284933:
                if (helpType.equals("NEW_HOME_INTRODUCTION")) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=NEW_HOME_INTRODUCTION&entryPoint=New_Home_Screen&screenName=New_Home"));
                }
                break;
            case -919348731:
                if (helpType.equals("PREGNANCY_INSIGHTS_DATA_PRIVACY") && (webUrl = navigationScreen.getWebUrl()) != null) {
                    C28216y.m85414y(this.externalLinkNavigator, this.context, webUrl, false, 4, null);
                }
                break;
            case -597279484:
                if (helpType.equals("DEVICE_BATTERY")) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=CHARGE_EDUCATION&entryPoint=" + navigationScreen.getEntryPoint() + "&screenName=New_Home"));
                }
                break;
            case -16486507:
                if (helpType.equals("RECOVERY")) {
                    if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NATIVE_EDUCATION_RECOVERY)) {
                        C28216y c28216y2 = this.externalLinkNavigator;
                        AbstractActivityC1340r0 abstractActivityC1340r1 = this.context;
                        String string2 = abstractActivityC1340r1.getString(AbstractC17312j.f66947Q0);
                        AbstractC22676k.m65749i(string2, "getString(...)");
                        C28216y.m85414y(c28216y2, abstractActivityC1340r1, string2, false, 4, null);
                    } else {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=RECOVERY_EDUCATION&entryPoint=" + navigationScreen.getEntryPoint() + "&screenName=Recovery"));
                    }
                }
                break;
            case 78984887:
                if (helpType.equals("SLEEP")) {
                    if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NATIVE_EDUCATION_SLEEP)) {
                        C28216y c28216y3 = this.externalLinkNavigator;
                        AbstractActivityC1340r0 abstractActivityC1340r2 = this.context;
                        String string3 = abstractActivityC1340r2.getString(AbstractC17312j.f66977d1);
                        AbstractC22676k.m65749i(string3, "getString(...)");
                        C28216y.m85414y(c28216y3, abstractActivityC1340r2, string3, false, 4, null);
                    } else {
                        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=SLEEP_EDUCATION&entryPoint=" + navigationScreen.getEntryPoint() + "&screenName=Sleep"));
                    }
                }
                break;
            case 87065052:
                if (helpType.equals("ARRHYTHMIA_INAPP")) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=ARRHYTHMIA_INAPP&entryPoint=" + navigationScreen.getEntryPoint()));
                }
                break;
            case 321334712:
                if (helpType.equals(CoachSettingsFragmentKt.HELP_TYPE_KEY)) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=WHOOP_COACH_DATA_PRIVACY&entryPoint=" + navigationScreen.getEntryPoint() + "&screenName=WHOOP_COACH"));
                }
                break;
            case 1356053827:
                if (helpType.equals("TRIAL_INFORMATION")) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=TRIAL_INFORMATION&entryPoint=" + navigationScreen.getEntryPoint()));
                }
                break;
            case 1697328983:
                if (helpType.equals("HOW_WHOOP_COACH_WORKS_EDUCATION")) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=HOW_WHOOP_COACH_WORKS_EDUCATION&entryPoint=" + navigationScreen.getEntryPoint()));
                }
                break;
            case 2021696102:
                if (helpType.equals("ECG_INAPP")) {
                    ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/education?path=ECG_INAPP&entryPoint=" + navigationScreen.getEntryPoint()));
                }
                break;
        }
        return AbstractC21161p0.f.f80692a;
    }

    /* JADX INFO: renamed from: b0 */
    private final AbstractC21161p0 m115052b0(boolean showOnboarding) {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/customizeHome?showOnboarding=" + showOnboarding));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: c0 */
    private final AbstractC21161p0 m115053c0(String pillar) {
        String upperCase = pillar.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        ((AbstractC12939a0) this.navController.invoke()).m36405t((iHashCode == -1838664331 ? !upperCase.equals("STRAIN") : iHashCode == -16486507 ? !upperCase.equals("RECOVERY") : !(iHashCode == 78984887 && upperCase.equals("SLEEP"))) ? this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/home") : this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/home?destinationPillar=".concat(pillar)), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, -1));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: d0 */
    private final AbstractC21161p0 m115054d0(String integrationId, String source) {
        String strM30461o;
        if (integrationId.length() == 0) {
            strM30461o = "android-app://com.whoop/settings/integrations";
        } else {
            strM30461o = (source == null || source.length() == 0) ? AbstractC11266d.m30461o("android-app://com.whoop/settings/integrations?integrationId=", integrationId) : AbstractC31061c.m95640p("android-app://com.whoop/settings/integrations?integrationId=", integrationId, "&source=", source);
        }
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a(strM30461o));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: e0 */
    private final AbstractC21161p0 m115055e0(String code) {
        Intent intent = new Intent(this.context, (Class<?>) InviteCodeActivity.class);
        intent.putExtra("inviteCode", code);
        intent.putExtra("joinTeam", true);
        this.context.startActivity(intent);
        return AbstractC21161p0.f.f80692a;
    }

    /* JADX INFO: renamed from: f0 */
    private final AbstractC21161p0 m115057f0(AbstractC21155m0.e2 screen) {
        LocalDate currentCycleEndDay;
        ZonedDateTime zonedDateTimeAtStartOfDay;
        Instant instant;
        C12977n0 c12977n0M36394i = ((AbstractC12939a0) this.navController.invoke()).m36394i();
        if (c12977n0M36394i != null && c12977n0M36394i.f44819H == AbstractC29491b.f119837a) {
            ((AbstractC12939a0) this.navController.invoke()).m36410z();
        }
        AbstractC17304b.j jVarM49004o = AbstractC17304b.m49004o(screen.getCycleId());
        jVarM49004o.m49056x(screen.getCurrentCycleStartDay().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
        jVarM49004o.m49055w((AbstractC22676k.m65745e(screen.getCurrentCycleStartDay(), LocalDate.now()) || (currentCycleEndDay = screen.getCurrentCycleEndDay()) == null || (zonedDateTimeAtStartOfDay = currentCycleEndDay.atStartOfDay(ZoneId.systemDefault())) == null || (instant = zonedDateTimeAtStartOfDay.toInstant()) == null) ? -1L : instant.toEpochMilli());
        Long previousCycleStartTime = screen.getPreviousCycleStartTime();
        jVarM49004o.m49052t(previousCycleStartTime != null ? previousCycleStartTime.longValue() : -1L);
        Long previousCycleEndTime = screen.getPreviousCycleEndTime();
        jVarM49004o.m49051s(previousCycleEndTime != null ? previousCycleEndTime.longValue() : -1L);
        jVarM49004o.m49047o(screen.getIsFromAutoPop());
        jVarM49004o.m49048p(screen.getShouldShowJournalTutorial());
        jVarM49004o.m49050r(screen.getNewHome());
        jVarM49004o.m49049q(screen.getLabel());
        jVarM49004o.m49054v(screen.getSource());
        jVarM49004o.m49046n(screen.getFromFab());
        String requestDate = screen.getRequestDate();
        if (requestDate.length() == 0) {
            requestDate = screen.getCurrentCycleStartDay().toString();
        }
        jVarM49004o.m49053u(requestDate);
        return m115027I0(this, jVarM49004o, null, 2, null);
    }

    /* JADX INFO: renamed from: g0 */
    private final AbstractC21161p0 m115059g0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/labradorAboutFragment"));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: h0 */
    private final AbstractC21161p0 m115060h0(AbstractC21155m0.g2 navigationScreen) {
        String id4 = navigationScreen.getId();
        boolean showSaveButton = navigationScreen.getShowSaveButton();
        boolean isNewReading = navigationScreen.getIsNewReading();
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("android-app://com.whoop/labradorDetailsFragment?id=", id4, "&showSaveButton=", "&isNewReading=", showSaveButton);
        sbM73379l.append(isNewReading);
        abstractC12939a0.m36404s(c21147i0.m58994a(sbM73379l.toString()));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: i0 */
    private final AbstractC21161p0 m115061i0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/labradorDeviceLocationFragment"));
        return AbstractC21161p0.e.f80691a;
    }

    /* JADX INFO: renamed from: j0 */
    private final AbstractC21161p0 m115063j0(AbstractC21155m0.i2 navigationScreen) {
        String entryPoint = navigationScreen.getEntryPoint();
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/labradorEligibility?entryPoint=" + entryPoint));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: k0 */
    private final AbstractC21161p0 m115064k0(AbstractC21155m0.j2 navigationScreen) {
        EnumC17628e enumC17628e;
        String selectedWrist = navigationScreen.getSelectedWrist();
        EnumC17628e[] enumC17628eArrValues = EnumC17628e.values();
        int length = enumC17628eArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC17628e = null;
                break;
            }
            enumC17628e = enumC17628eArrValues[i13];
            if (AbstractC22676k.m65745e(enumC17628e.getSerializedValue(), selectedWrist)) {
                break;
            }
            i13++;
        }
        if (enumC17628e != null) {
            ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/labradorReading?selectedWrist=" + selectedWrist));
        } else {
            ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/labradorDeviceLocationFragment"));
        }
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: l0 */
    private final AbstractC21161p0 m115066l0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/labradorRegistrationFragment"));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: m0 */
    private final AbstractC21161p0 m115067m0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/labradorResultsFragment"));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final AbstractC12939a0 m115068n(AbstractActivityC1340r0 abstractActivityC1340r0) {
        int i13 = AbstractC17307e.f66639Q1;
        AbstractC22676k.m65750j(abstractActivityC1340r0, "<this>");
        return AbstractC12350b.m34597r(abstractActivityC1340r0, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m115069n0(C22659b0 c22659b0) {
        c22659b0.f89329w = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private final ApiRequest m115070o(ApiRequest apiRequest, Map<String, String> map) {
        return ApiRequest.copy$default(apiRequest, AbstractC11895b.m31992k(AbstractC39414r.m125875T(apiRequest.getPath(), '?', false) ? '&' : '?', apiRequest.getPath(), AbstractC25265s.m74110N0(map.entrySet(), "&", null, null, new C35926d(12), 30)), null, null, 6, null);
    }

    /* JADX INFO: renamed from: o0 */
    private final AbstractC21161p0 m115071o0(String gaugeType, LocalDate selectedDate) {
        C29470e c29470e = new C29470e();
        Bundle bundle = new Bundle();
        bundle.putString("GlobalShareDialogSelectedPillar", gaugeType);
        bundle.putString("GlobalShareDialogSelectedDate", selectedDate.toString());
        c29470e.setArguments(bundle);
        c29470e.show(this.context.getSupportFragmentManager(), "GlobalShareDialogFragmentTag");
        return AbstractC21161p0.f.f80692a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final CharSequence m115072p(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getKey() + "=" + Uri.encode((String) it.getValue());
    }

    /* JADX INFO: renamed from: p0 */
    private final AbstractC21161p0 m115073p0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/shepherdAboutFragment"));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: q */
    private final AbstractC21155m0.m1 m115074q(AbstractC21155m0.m1 m1Var, C12982q c12982q) {
        String strM23122n = AbstractC9597d.m23122n(c12982q);
        C12995w0 c12995w0M95631g = AbstractC31061c.m95631g();
        C12995w0.m36507b(c12995w0M95631g, c12982q.f44844x.f44819H, true);
        return AbstractC21155m0.m1.m59196c(m1Var, null, null, strM23122n, null, null, null, null, c12995w0M95631g.m36508a(), null, null, 891, null);
    }

    /* JADX INFO: renamed from: q0 */
    private final AbstractC21161p0 m115075q0(AbstractC21155m0.m4 navigationScreen) {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/shepherdDetails?date=" + navigationScreen.getCom.mapbox.common.HttpHeaders.DATE java.lang.String() + "&education_name=" + navigationScreen.getOnboardingStoryName()));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: r */
    private final GenericCachePolicy m115076r(String shareCode) {
        if (shareCode == null) {
            return null;
        }
        return new GenericCachePolicy(false, (String) null, (Set) null, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: r0 */
    private final AbstractC21161p0 m115077r0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/settings/shepherdNotificationHistoryFragment"));
        return AbstractC21161p0.e.f80691a;
    }

    /* JADX INFO: renamed from: s0 */
    private final AbstractC21161p0 m115078s0(AbstractC21155m0.o4 navigationScreen) {
        String entryPoint = navigationScreen.getEntryPoint();
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/shepherdOnboarding?entryPoint=" + entryPoint));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: t0 */
    private final AbstractC21161p0 m115079t0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/shepherdRegistrationFragment"));
        return AbstractC21161p0.a.f80687a;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ AbstractC21155m0 m115080u(C36159d c36159d, C12977n0 c12977n0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c12977n0 = null;
        }
        return c36159d.m115098t(c12977n0);
    }

    /* JADX INFO: renamed from: u0 */
    private final AbstractC21161p0 m115081u0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/settings/shepherdNotificationHistoryFragment"));
        return AbstractC21161p0.e.f80691a;
    }

    /* JADX INFO: renamed from: v */
    private final AbstractC21161p0 m115082v(C9598e navigationAction) {
        AbstractC9597d.m23114f((AbstractC12939a0) this.navController.invoke(), EnumC21172v.AUTO, null, 2, null);
        return mo59392a(navigationAction);
    }

    /* JADX INFO: renamed from: v0 */
    private final AbstractC21161p0 m115083v0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/stealth-mode"));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: w */
    private final AbstractC21161p0 m115084w(AbstractC21155m0 navigationScreen) {
        Iterator<InterfaceC21151k0> it = this.navigationProviders.iterator();
        while (it.hasNext()) {
            InterfaceC21149j0 interfaceC21149j0ProvideNavigationData = it.next().provideNavigationData(navigationScreen);
            if (interfaceC21149j0ProvideNavigationData instanceof InterfaceC21149j0.c) {
                InterfaceC21149j0.c cVar = (InterfaceC21149j0.c) interfaceC21149j0ProvideNavigationData;
                ((AbstractC12939a0) this.navController.invoke()).m36405t(cVar.getLink(), cVar.getOptions());
                return cVar.getResult();
            }
            if (AbstractC22676k.m65745e(interfaceC21149j0ProvideNavigationData, InterfaceC21149j0.b.f80237a)) {
                this.logger.mo85222m("Failed to parse " + navigationScreen + " into deeplink", new AbstractC30556a.a[0]);
                return AbstractC21161p0.c.f80689a;
            }
            if (!AbstractC22676k.m65745e(interfaceC21149j0ProvideNavigationData, InterfaceC21149j0.d.f80241a)) {
                if (AbstractC22676k.m65745e(interfaceC21149j0ProvideNavigationData, InterfaceC21149j0.a.f80236a)) {
                    return AbstractC21161p0.f.f80692a;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return AbstractC21161p0.h.f80694a;
    }

    /* JADX INFO: renamed from: w0 */
    private final AbstractC21161p0 m115085w0(String openTab) {
        AbstractC17304b.k kVarM49005p = AbstractC17304b.m49005p();
        kVarM49005p.m49059d(openTab);
        return m115027I0(this, kVarM49005p, null, 2, null);
    }

    /* JADX INFO: renamed from: x0 */
    private final AbstractC21161p0 m115086x0(String cycle, String source) {
        ((AbstractC12939a0) this.navController.invoke()).m36405t(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/tiltGraphRevamp?date=" + cycle + "&source=" + source), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105961f, -1, -1, -1));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: y */
    private final String m115087y(int destinationId, Bundle arguments) {
        if (destinationId == AbstractC17307e.f66562D2) {
            return C36166k.f154741a.m115107a(AppScreen.C9426u2.f27963w);
        }
        if (destinationId == AbstractC17307e.f66745g5) {
            String string = arguments != null ? arguments.getString("selectedTab") : null;
            if (string != null) {
                switch (string.hashCode()) {
                    case 2223327:
                        if (string.equals("HOME")) {
                            return C36166k.f154741a.m115107a(AppScreen.C9426u2.f27963w);
                        }
                        break;
                    case 2372437:
                        if (string.equals("MORE")) {
                            return C36166k.f154741a.m115107a(AppScreen.C9276b4.f27502w);
                        }
                        break;
                    case 1306345417:
                        if (string.equals("COMMUNITY")) {
                            return C36166k.f154741a.m115107a(AppScreen.C9361m1.f27766w);
                        }
                        break;
                    case 2127033948:
                        if (string.equals("HEALTH")) {
                            return C36166k.f154741a.m115107a(AppScreen.C9394q2.f27867w);
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    private final void m115088y0(AbstractC21155m0.f5 screen) {
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        String trendKey = screen.getTrendKey();
        LocalDate date = screen.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        String trendSource = screen.getTrendSource();
        String fromLocation = screen.getFromLocation();
        int duration = screen.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String();
        boolean sendTileProperties = screen.getSendTileProperties();
        StringBuilder sb4 = new StringBuilder("android-app://com.whoop/trends?trendKey=");
        sb4.append(trendKey);
        sb4.append("&date=");
        sb4.append(date);
        sb4.append("&source=");
        AbstractC11266d.m30444B(sb4, trendSource, "&pillar=", fromLocation, "&duration=");
        sb4.append(duration);
        sb4.append("&sendTileProperties=");
        sb4.append(sendTileProperties);
        ((AbstractC12939a0) this.navController.invoke()).m36405t(c21147i0.m58994a(sb4.toString()), AbstractC28152c1.m85184b());
    }

    /* JADX INFO: renamed from: z */
    private final GenericCachePolicy m115089z(NavigationScreenModel navigationScreenModel) {
        if (navigationScreenModel instanceof CommunityScreenModel) {
            return m115076r(((CommunityScreenModel) navigationScreenModel).getShareCode());
        }
        return null;
    }

    /* JADX INFO: renamed from: z0 */
    private final AbstractC21161p0 m115090z0() {
        ((AbstractC12939a0) this.navController.invoke()).m36404s(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/whatToExpect"));
        return AbstractC21161p0.d.f80690a;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m115091B(String selectedTabId) {
        if (!m115094H()) {
            return false;
        }
        TabConfiguration tabConfigurationMo61186b = this.bffBottomNavConfigSource.mo61186b();
        if (selectedTabId == null || tabConfigurationMo61186b == null || selectedTabId.equals(tabConfigurationMo61186b.getId())) {
            return false;
        }
        return m115096L0(tabConfigurationMo61186b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public final Object m115092C(WhoopUri whoopUri, Intent intent, InterfaceC30057d<? super InterfaceC21152l> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f154728E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f154728E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM23105b = bVar.f154731y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f154728E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM23105b);
            C9594a c9594a = this.deepLinkNavigationParser;
            bVar.f154729w = null;
            bVar.f154730x = intent;
            bVar.f154728E = 1;
            objM23105b = c9594a.m23105b(whoopUri, bVar);
            if (objM23105b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intent = (Intent) bVar.f154730x;
            AbstractC34132o.m107864I(objM23105b);
        }
        InterfaceC21152l interfaceC21152l = (InterfaceC21152l) objM23105b;
        this.logger.mo85228t("handling deep link got " + interfaceC21152l, new AbstractC30556a.a[0]);
        if (interfaceC21152l instanceof C21163q0) {
            this.customActionHandler.m78517s(((C21163q0) interfaceC21152l).getActionString(), true, this);
        } else if (interfaceC21152l instanceof C21131b) {
            m115035O0(((C21131b) interfaceC21152l).getNavigationAction());
        } else if (interfaceC21152l instanceof C21141f0) {
            m115055e0(((C21141f0) interfaceC21152l).getCode());
        } else if (!AbstractC22676k.m65745e(interfaceC21152l, C21139e0.f80216a)) {
            throw new NoWhenBranchMatchedException();
        }
        m115026I(intent, interfaceC21152l);
        return interfaceC21152l;
    }

    /* JADX INFO: renamed from: D */
    public final void m115093D() {
        this.appLifecycle.m49090c(this);
        InterfaceC21153l0.m59003k(this.navigationReporter, (AbstractC12939a0) this.navController.invoke(), null, 2, null);
        ((AbstractC12939a0) this.navController.invoke()).m36388b(new InterfaceC12990u() { // from class: vm2.c
            @Override // p114eb.InterfaceC12990u
            /* JADX INFO: renamed from: a */
            public final void mo36501a(AbstractC12939a0 abstractC12939a0, C12977n0 c12977n0, Bundle bundle) throws UnsupportedEncodingException {
                C36159d.m115019E(this.f154701a, abstractC12939a0, c12977n0, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final boolean m115094H() {
        try {
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
            C12977n0 c12977n0M36394i = abstractC12939a0.m36394i();
            int i13 = c12977n0M36394i != null ? c12977n0M36394i.f44819H : 0;
            if (AbstractC9597d.m23119k(abstractC12939a0)) {
                return true;
            }
            C12982q c12982qM36393h = abstractC12939a0.m36393h();
            return m115087y(i13, c12982qM36393h != null ? c12982qM36393h.m36479a() : null) != null;
        } catch (IllegalArgumentException e5) {
            this.logger.mo85213c("AppNavigator.isOnTabRoot: nav host view not yet available", e5, new AbstractC30556a.a[0]);
            return false;
        } catch (IllegalStateException e13) {
            this.logger.mo85213c("AppNavigator.isOnTabRoot: NavController unavailable", e13, new AbstractC30556a.a[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m115095K() {
        C1601k1 c1601k1M36480b;
        C12982q c12982qM36393h = ((AbstractC12939a0) this.navController.invoke()).m36393h();
        if (c12982qM36393h != null && (c1601k1M36480b = c12982qM36393h.m36480b()) != null) {
            c1601k1M36480b.m5004e(Boolean.TRUE, "bff_is_tab_root");
        }
        this.bffBottomNavTabEventPublisher.m58980c(new InterfaceC21136d.c(true));
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m115096L0(TabConfiguration tab) {
        AbstractC22676k.m65750j(tab, "tab");
        AbstractC21155m0 abstractC21155m0M115012a = this.appConfigurationTabResolver.m115012a(tab);
        if (abstractC21155m0M115012a == null) {
            this.logger.mo85226q(AbstractC11895b.m31996o("BFF tab '", tab.getId(), "' has no resolvable destination; tile tap is a no-op"), new AbstractC30556a.a[0]);
            return false;
        }
        if (abstractC21155m0M115012a instanceof AbstractC21155m0.b3) {
            abstractC21155m0M115012a = ((AbstractC21155m0.b3) abstractC21155m0M115012a).m59029b("tab_bar");
        }
        boolean zM115023G = m115023G(m115097M(AbstractC36160e.m115099a(abstractC21155m0M115012a, this.bffTabNavOptions)));
        if (zM115023G) {
            this.bffBottomNavTabEventPublisher.m58980c(new InterfaceC21136d.d(tab.getId()));
        }
        return zM115023G;
    }

    /* JADX INFO: renamed from: M */
    public final AbstractC21161p0 m115097M(AbstractC21155m0 screen) throws UnsupportedEncodingException {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC21161p0 abstractC21161p0Mo59393b = mo59393b(screen);
        if (m115023G(abstractC21161p0Mo59393b)) {
            m115095K();
        }
        return abstractC21161p0Mo59393b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j02.m0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [vm2.d] */
    @Override // j02.InterfaceC21159o0
    /* JADX INFO: renamed from: a */
    public AbstractC21161p0 mo59392a(C9598e navigationAction) {
        AbstractC21155m0 abstractC21155m0M115012a;
        AbstractC21155m0 abstractC21155m0M115046U0;
        AbstractC22676k.m65750j(navigationAction, "navigationAction");
        InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(navigationAction.getParameters());
        ?? M115044T0 = 0;
        M115044T0 = 0;
        M115044T0 = 0;
        AbstractC21155m0 abstractC21155m0 = interfaceC21134cMo67681a instanceof AbstractC21155m0 ? (AbstractC21155m0) interfaceC21134cMo67681a : null;
        if (abstractC21155m0 == null || (abstractC21155m0 instanceof AbstractC21155m0.j3)) {
            this.logger.mo85226q("navigateToDestination: NavigationReducer could not map screen='" + navigationAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() + "'", new AbstractC30556a.a[0]);
            return AbstractC21161p0.h.f80694a;
        }
        C21173v0 tab = navigationAction.getTab();
        String strM59415a = tab != null ? tab.getId() : null;
        String strM115107a = C36166k.f154741a.m115107a(navigationAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
        if (strM59415a != null) {
            InterfaceC34116n interfaceC34116n = this.logger;
            AppScreen screen = navigationAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
            if (strM115107a == null) {
                strM115107a = "no tab";
            }
            StringBuilder sb4 = new StringBuilder("deeplink-migration: tab from backend: tab=");
            sb4.append(strM59415a);
            sb4.append(" screen=");
            sb4.append(screen);
            sb4.append(" (LegacyTabScreenMapping bypassed, would have given ");
            interfaceC34116n.mo85216g(AbstractC25012a.m73376i(strM115107a, ")", sb4), new AbstractC30556a.a[0]);
            return m115041R0(strM59415a, abstractC21155m0);
        }
        if (AbstractC22676k.m65745e(navigationAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9276b4.f27502w) && strM115107a != null && !this.bffBottomNavConfigSource.mo61185a(strM115107a)) {
            this.navigationMetricsReporter.m115108a(strM115107a);
            return mo59393b(new AbstractC21155m0.j4(M115044T0, 1, M115044T0));
        }
        if (strM115107a == null) {
            return mo59393b(abstractC21155m0);
        }
        this.navigationMetricsReporter.m115108a(strM115107a);
        this.logger.mo85216g("deeplink-migration: tab from LegacyTabScreenMapping: tab=" + strM115107a + " screen=" + navigationAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() + " (backend sent no tab)", new AbstractC30556a.a[0]);
        TabConfiguration tabConfigurationMo61187c = this.bffBottomNavConfigSource.mo61187c(strM115107a);
        if (tabConfigurationMo61187c != null && (abstractC21155m0M115012a = this.appConfigurationTabResolver.m115012a(tabConfigurationMo61187c)) != null && (abstractC21155m0M115046U0 = m115046U0(abstractC21155m0M115012a, navigationAction.getParameters())) != null) {
            M115044T0 = m115044T0(abstractC21155m0M115046U0, abstractC21155m0.getAiAction());
        }
        return m115041R0(strM115107a, M115044T0);
    }

    @Override // j02.InterfaceC21159o0
    /* JADX INFO: renamed from: b */
    public AbstractC21161p0 mo59393b(AbstractC21155m0 navigationScreen) throws UnsupportedEncodingException {
        InterfaceC12251g interfaceC12251g;
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("aix-app-navigator-noop-fix");
        C22659b0 c22659b0 = new C22659b0();
        c22659b0.f89329w = zIsFeatureEnabled;
        if (m115039Q0(navigationScreen, zIsFeatureEnabled, new C25262p(c22659b0, 19))) {
            if (this.tabRootResolver.m115110a(navigationScreen)) {
                m115095K();
            }
            return AbstractC21161p0.h.f80694a;
        }
        AbstractC21161p0 abstractC21161p0M115084w = m115084w(navigationScreen);
        if (AbstractC22676k.m65745e(abstractC21161p0M115084w, AbstractC21161p0.h.f80694a)) {
            abstractC21161p0M115084w = m115020E0(navigationScreen);
        } else {
            this.logger.mo85228t("Composite navigation to " + navigationScreen + " resulted in " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(abstractC21161p0M115084w.getClass()).getSimpleName(), new AbstractC30556a.a[0]);
        }
        if (c22659b0.f89329w && (interfaceC12251g = this.globalCoachManager) != null) {
            interfaceC12251g.mo34150z(navigationScreen);
        }
        m115030L(navigationScreen, abstractC21161p0M115084w);
        return abstractC21161p0M115084w;
    }

    @Override // j02.InterfaceC21159o0
    /* JADX INFO: renamed from: d */
    public AbstractC21161p0 mo59394d(C9598e navigationAction) {
        AbstractC22676k.m65750j(navigationAction, "navigationAction");
        InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(navigationAction.getParameters());
        AbstractC21155m0.m1 m1Var = interfaceC21134cMo67681a instanceof AbstractC21155m0.m1 ? (AbstractC21155m0.m1) interfaceC21134cMo67681a : null;
        C12982q c12982qM36393h = ((AbstractC12939a0) this.navController.invoke()).m36393h();
        return (m1Var == null || c12982qM36393h == null || m115037P0(navigationAction)) ? m115082v(navigationAction) : mo59393b(m115074q(m1Var, c12982qM36393h));
    }

    @Override // j02.InterfaceC21159o0
    /* JADX INFO: renamed from: e */
    public boolean mo59395e(C9598e destination) {
        NavigationScreenModel parameters = destination != null ? destination.getParameters() : null;
        NativeStoreScreenModel nativeStoreScreenModel = parameters instanceof NativeStoreScreenModel ? (NativeStoreScreenModel) parameters : null;
        return m115043S0(nativeStoreScreenModel != null ? nativeStoreScreenModel.getSource() : null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        super.onCreate(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        try {
            this.navigationReporter.mo59006a0(((AbstractC12939a0) this.navController.invoke()).m36394i());
        } catch (IllegalArgumentException unused) {
            this.logger.mo85228t("App started, but failed to find destination for nav tag due to IllegalArgumentException", new AbstractC30556a.a[0]);
        } catch (IllegalStateException unused2) {
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC21155m0 m115098t(C12977n0 destination) {
        AbstractC21155m0 abstractC21155m0M115100a;
        if (destination == null) {
            destination = ((AbstractC12939a0) this.navController.invoke()).m36394i();
        }
        if (destination == null || destination.f44819H != AbstractC17307e.f66562D2 || (abstractC21155m0M115100a = this.bffDefaultTabResolver.m115100a()) == null || m115021F(abstractC21155m0M115100a)) {
            return null;
        }
        return abstractC21155m0M115100a;
    }

    public /* synthetic */ C36159d(AbstractActivityC1340r0 abstractActivityC1340r0, InterfaceC4339a interfaceC4339a, C28216y c28216y, FeatureFlagChecker featureFlagChecker, InterfaceC37217a interfaceC37217a, C26480b c26480b, C21147i0 c21147i0, Clock clock, C9594a c9594a, List list, InterfaceC27353d interfaceC27353d, C17345d c17345d, InterfaceC21153l0 interfaceC21153l0, InterfaceC21718f interfaceC21718f, C36156a c36156a, C36168m c36168m, C36161f c36161f, C36165j c36165j, InterfaceC39700a interfaceC39700a, InterfaceC12251g interfaceC12251g, C21138e c21138e, C36167l c36167l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        AbstractActivityC1340r0 abstractActivityC1340r1;
        InterfaceC4339a c25262p;
        Clock clock2;
        if ((i13 & 2) != 0) {
            abstractActivityC1340r1 = abstractActivityC1340r0;
            c25262p = new C25262p(abstractActivityC1340r1, 20);
        } else {
            abstractActivityC1340r1 = abstractActivityC1340r0;
            c25262p = interfaceC4339a;
        }
        C21147i0 c21147i1 = (i13 & 64) != 0 ? new C21147i0() : c21147i0;
        if ((i13 & 128) != 0) {
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
            clock2 = clockSystemDefaultZone;
        } else {
            clock2 = clock;
        }
        this(abstractActivityC1340r1, c25262p, c28216y, featureFlagChecker, interfaceC37217a, c26480b, c21147i1, clock2, c9594a, (i13 & 512) != 0 ? C25271y.f99162w : list, interfaceC27353d, c17345d, interfaceC21153l0, interfaceC21718f, c36156a, c36168m, c36161f, c36165j, interfaceC39700a, (i13 & 524288) != 0 ? null : interfaceC12251g, c21138e, c36167l);
    }
}

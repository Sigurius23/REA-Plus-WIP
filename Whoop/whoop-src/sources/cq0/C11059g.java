package cq0;

import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC1615p0;
import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bl2.C3374c;
import bq0.C3545a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import com.whoop.community.data.network.ChatApi;
import com.whoop.community.data.network.ChatTokenResponseDto;
import com.whoop.community.data.network.CommunityServiceApi;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.data.local.room.dao.wipeable.FeatureTeamDao;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao;
import com.whoop.data.local.room.dao.wipeable.TeamsDao;
import com.whoop.data.local.room.entity.TeamsDto;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.commons.AppExecutors;
import com.whoop.data.remote.commons.NetworkBoundCoroutineResource;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.domain.exception.InviteCodeException;
import com.whoop.domain.model.LeadersDto;
import com.whoop.domain.model.RecordsDto;
import com.whoop.domain.model.User;
import com.whoop.domain.model.teams.CommunityDto;
import com.whoop.domain.model.teams.CommunityMemberDto;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.domain.model.teams.MemberStory;
import com.whoop.domain.model.teams.MemberStoryDto;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamInviteDto;
import com.whoop.domain.model.teams.TeamShareCodeDto;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.network.exception.DomainException;
import com.whoop.p069ui.teams.LeadersEntryDto;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.profile.view.edit.form.C9779c;
import com.whoop.service.network.CommunityApi;
import com.whoop.service.network.UsersApi;
import com.whoop.service.network.model.DefaultImages;
import com.whoop.service.network.model.UserState;
import hq0.C17561a;
import i92.AbstractC18274s;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh3.C22488a;
import l83.C23454a0;
import lh3.C24082e;
import m83.AbstractC25267u;
import m83.C25271y;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p000.AbstractC11266d;
import p012ab.C0680g0;
import p031b9.AbstractC2875y;
import p463rj.AbstractC31484o;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import retrofit2.HttpException;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34820i0;
import ud3.C34842t0;
import ud3.C34844u0;
import ud3.C34850x0;
import w02.AbstractC36685b;
import xg3.C38280g;
import yb3.C39412p;
import zg3.C40634a;

/* JADX INFO: renamed from: cq0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'H\u0086@¢\u0006\u0004\b*\u0010+JK\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010#0\"2\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010,2\b\u00100\u001a\u0004\u0018\u00010,¢\u0006\u0004\b3\u00104J*\u0010:\u001a\u0004\u0018\u0001092\u0006\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020)2\u0006\u00108\u001a\u000207H\u0086@¢\u0006\u0004\b:\u0010;J.\u0010>\u001a\b\u0012\u0004\u0012\u00020=012\u0006\u0010<\u001a\u00020)2\u0006\u00106\u001a\u00020)2\u0006\u00108\u001a\u000207H\u0086@¢\u0006\u0004\b>\u0010;J(\u0010?\u001a\u00020)2\u0006\u0010<\u001a\u00020)2\u0006\u00106\u001a\u00020)2\u0006\u00108\u001a\u000207H\u0086@¢\u0006\u0004\b?\u0010;Jj\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u00106\u001a\u00020)2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020B2\b\u0010F\u001a\u0004\u0018\u00010,2\b\u0010G\u001a\u0004\u0018\u00010,2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010J\u001a\u0004\u0018\u00010HH\u0086@¢\u0006\u0004\bL\u0010MJ \u0010N\u001a\u00020B2\u0006\u0010<\u001a\u00020)2\u0006\u00106\u001a\u00020)H\u0086@¢\u0006\u0004\bN\u0010OJ\u001e\u0010Q\u001a\b\u0012\u0004\u0012\u0002090#2\u0006\u0010P\u001a\u00020,H\u0086@¢\u0006\u0004\bQ\u0010RJ\"\u0010T\u001a\u0004\u0018\u0001092\u0006\u0010S\u001a\u0002092\u0006\u00106\u001a\u00020)H\u0086@¢\u0006\u0004\bT\u0010UJ*\u0010V\u001a\u0004\u0018\u0001092\u0006\u0010<\u001a\u00020)2\u0006\u00106\u001a\u00020)2\u0006\u0010I\u001a\u00020HH\u0086@¢\u0006\u0004\bV\u0010WJ*\u0010X\u001a\u0004\u0018\u0001092\u0006\u0010<\u001a\u00020)2\u0006\u00106\u001a\u00020)2\u0006\u0010J\u001a\u00020HH\u0086@¢\u0006\u0004\bX\u0010WJ;\u0010]\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020=\u0018\u0001010\\2\u0006\u0010<\u001a\u00020)2\u0006\u0010Y\u001a\u00020,2\u0006\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020)¢\u0006\u0004\b]\u0010^JC\u0010`\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020=\u0018\u00010_0\\2\u0006\u0010<\u001a\u00020)2\u0006\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020)2\u0006\u00106\u001a\u00020)2\u0006\u00108\u001a\u000207¢\u0006\u0004\b`\u0010aJK\u0010d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020=\u0018\u00010_0\\2\u0006\u0010<\u001a\u00020)2\u0006\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020)2\u0006\u00106\u001a\u00020)2\u0006\u0010b\u001a\u00020,2\u0006\u0010c\u001a\u00020)¢\u0006\u0004\bd\u0010eJ(\u0010g\u001a\u00020B2\u0006\u0010<\u001a\u00020)2\u0006\u0010f\u001a\u00020)2\u0006\u00106\u001a\u00020)H\u0086@¢\u0006\u0004\bg\u0010hJ(\u0010j\u001a\u00020B2\u0006\u0010<\u001a\u00020)2\u0006\u0010i\u001a\u00020)2\u0006\u00106\u001a\u00020)H\u0086@¢\u0006\u0004\bj\u0010hJ[\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010n0\\2\u0006\u0010<\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010k2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010k2\u0006\u00100\u001a\u00020l2\u0006\u0010m\u001a\u00020)2\u0006\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020)2\u0006\u00108\u001a\u000207¢\u0006\u0004\bo\u0010pJK\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010q0\\2\u0006\u0010<\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010k2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010k2\u0006\u00100\u001a\u00020l2\u0006\u0010m\u001a\u00020)2\u0006\u00108\u001a\u000207¢\u0006\u0004\br\u0010sJ \u0010u\u001a\n\u0012\u0004\u0012\u00020t\u0018\u0001012\u0006\u0010<\u001a\u00020)H\u0086@¢\u0006\u0004\bu\u0010vJ \u0010x\u001a\u00020B2\u0006\u0010w\u001a\u00020)2\u0006\u00106\u001a\u00020)H\u0086@¢\u0006\u0004\bx\u0010OJ \u0010y\u001a\u00020B2\u0006\u0010w\u001a\u00020)2\u0006\u00106\u001a\u00020)H\u0086@¢\u0006\u0004\by\u0010OJ\u0018\u0010z\u001a\u00020B2\u0006\u00106\u001a\u00020)H\u0086@¢\u0006\u0004\bz\u0010vJ\u0018\u0010{\u001a\u00020B2\u0006\u00106\u001a\u00020)H\u0086@¢\u0006\u0004\b{\u0010vJ*\u0010~\u001a\u0004\u0018\u00010t2\u0006\u0010<\u001a\u00020)2\u0006\u0010|\u001a\u00020)2\u0006\u0010}\u001a\u00020)H\u0086@¢\u0006\u0004\b~\u0010hJ \u0010\u007f\u001a\u00020B2\u0006\u0010w\u001a\u00020)2\u0006\u0010}\u001a\u00020)H\u0086@¢\u0006\u0004\b\u007f\u0010OJ\u001c\u0010\u0080\u0001\u001a\u0004\u0018\u00010,2\u0006\u0010<\u001a\u00020)H\u0086@¢\u0006\u0005\b\u0080\u0001\u0010vJ\u001a\u0010\u0081\u0001\u001a\u00020B2\u0006\u0010P\u001a\u00020,H\u0086@¢\u0006\u0005\b\u0081\u0001\u0010RJ*\u0010\u0082\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t010#0\"2\u0006\u0010(\u001a\u00020'¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u000101H\u0086@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001a\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u000101H\u0086@¢\u0006\u0006\b\u0088\u0001\u0010\u0086\u0001J\u001e\u0010\u008b\u0001\u001a\u00030\u008a\u00012\b\u0010\u0089\u0001\u001a\u00030\u0084\u0001H\u0086@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001d\u0010\u008e\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008d\u0001\u001a\u00020tH\u0086@¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J,\u0010\u0092\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0090\u0001\u001a\u00020B2\r\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020t01H\u0086@¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0010\u0010\u0094\u0001\u001a\u00020B¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001a\u0010\u0097\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0096\u0001\u001a\u00020B¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J)\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u0001012\u0010\u0010\u009a\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0099\u0001\u0018\u00010_¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001a\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010#H\u0086@¢\u0006\u0006\b\u009e\u0001\u0010\u0086\u0001J$\u0010 \u0001\u001a\u00020B2\u0006\u00105\u001a\u00020)2\u0007\u0010\u009f\u0001\u001a\u00020BH\u0086@¢\u0006\u0006\b \u0001\u0010¡\u0001J$\u0010£\u0001\u001a\u00020B2\u0006\u00105\u001a\u00020)2\u0007\u0010¢\u0001\u001a\u00020BH\u0086@¢\u0006\u0006\b£\u0001\u0010¡\u0001J\u001c\u0010¦\u0001\u001a\u00030¥\u00012\u0007\u0010¤\u0001\u001a\u00020HH\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001b\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001b\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\u001b\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R\u001b\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u001b\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u001b\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u001b\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R\u001b\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u001a\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\u000f\n\u0005\bz\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001a\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\u000f\n\u0005\bx\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u001b\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001b\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\u0010\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010à\u0001\u001a\u00030Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001¨\u0006á\u0001"}, m65681d2 = {"Lcq0/g;", "", "Lin2/d;", "dispatcherFactory", "Lcom/whoop/service/network/CommunityApi;", "communityApi", "Lcom/whoop/community/data/network/CommunityServiceApi;", "communityServiceApi", "Lcom/whoop/service/network/UsersApi;", "usersApi", "Lcom/whoop/community/data/network/ChatApi;", "chatApi", "Lcom/whoop/data/remote/commons/AppExecutors;", "appExecutors", "Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;", "teamsDao", "Lcom/whoop/data/remote/RemoteDataSource;", "remoteDataSourceImpl", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Ltr2/n;", "logger", "Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;", "teamsInviteDao", "Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;", "featureTeamDao", "Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;", "memberStoryDao", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lrr2/c;", "crashReporter", "<init>", "(Lin2/d;Lcom/whoop/service/network/CommunityApi;Lcom/whoop/community/data/network/CommunityServiceApi;Lcom/whoop/service/network/UsersApi;Lcom/whoop/community/data/network/ChatApi;Lcom/whoop/data/remote/commons/AppExecutors;Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/data/repositories/FeatureFlagRepository;Ltr2/n;Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;Lcom/whoop/data/local/prefs/PreferenceHelper;Lrr2/c;)V", "Landroidx/lifecycle/p0;", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/service/network/model/DefaultImages;", "C", "()Landroidx/lifecycle/p0;", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "", "L", "(Lcom/whoop/domain/model/User;Lq83/d;)Ljava/lang/Object;", "", "leaderboardType", "startDate", "endDate", "period", "", "Lcom/whoop/data/local/room/entity/TeamsDto;", "Q", "(Lcom/whoop/domain/model/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;", ProfileApiKt.COMMUNITY_ID_PARAM, "forUserId", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", "Lcom/whoop/domain/model/teams/Team;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)Ljava/lang/Object;", "teamId", "Lcom/whoop/domain/model/teams/TeamUser;", "A", "z", "name", "description", "", "shareStrain", "shareRecovery", "shareSleep", "bannerUrl", "avatarUrl", "Landroid/graphics/Bitmap;", "banner", "logo", "Lcom/whoop/domain/model/teams/CommunityDto;", "q", "(Ljava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;", "T", "(IILq83/d;)Ljava/lang/Object;", "inviteCode", "x", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "team", "r0", "(Lcom/whoop/domain/model/teams/Team;ILq83/d;)Ljava/lang/Object;", "n0", "(IILandroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;", "q0", "text", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lxg3/g;", "g0", "(ILjava/lang/String;II)Lxg3/g;", "Lcom/whoop/domain/model/RecordsDto;", "U", "(IIIILcom/whoop/domain/model/teams/TeamType;)Lxg3/g;", "filterText", "excludeUser", "d0", "(IIIILjava/lang/String;I)Lxg3/g;", "kickMemberId", "S", "(IIILq83/d;)Ljava/lang/Object;", "newOwnerId", "l0", "Lorg/joda/time/LocalDate;", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "sortBy", "Lhq0/a;", "X", "(ILorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lcom/whoop/community/domain/model/teams/TimePeriod;IIILcom/whoop/domain/model/teams/TeamType;)Lxg3/g;", "Lcom/whoop/domain/model/teams/LeadersEntry;", "a0", "(ILorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lcom/whoop/community/domain/model/teams/TimePeriod;ILcom/whoop/domain/model/teams/TeamType;)Lxg3/g;", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "J", "(ILq83/d;)Ljava/lang/Object;", "inviteId", "l", "s", "k", "r", "toUserId", "fromUserId", "j0", "u0", "N", "m", "M", "(Lcom/whoop/domain/model/User;)Landroidx/lifecycle/p0;", "Lcom/whoop/domain/model/teams/FeatureTeam;", "E", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/teams/MemberStory;", "G", "featureTeams", "Ll83/a0;", "o0", "(Lcom/whoop/domain/model/teams/FeatureTeam;Lq83/d;)Ljava/lang/Object;", "teamInviteDto", "p0", "(Lcom/whoop/domain/model/teams/TeamInviteDto;Lq83/d;)Ljava/lang/Object;", "showBadge", "teams", "m0", "(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;", "R", "()Z", "flag", "k0", "(Z)V", "Lcom/whoop/domain/model/teams/MemberStoryDto;", "data", "H", "(Lcom/whoop/domain/model/RecordsDto;)Ljava/util/List;", "Lbq0/a;", "v", "chatEnabled", "s0", "(IZLq83/d;)Ljava/lang/Object;", "online", "t0", "bitmap", "", "t", "(Landroid/graphics/Bitmap;)[B", "a", "Lin2/d;", "b", "Lcom/whoop/service/network/CommunityApi;", "y", "()Lcom/whoop/service/network/CommunityApi;", "c", "Lcom/whoop/community/data/network/CommunityServiceApi;", "B", "()Lcom/whoop/community/data/network/CommunityServiceApi;", "d", "Lcom/whoop/service/network/UsersApi;", "getUsersApi", "()Lcom/whoop/service/network/UsersApi;", "e", "Lcom/whoop/community/data/network/ChatApi;", "u", "()Lcom/whoop/community/data/network/ChatApi;", "f", "Lcom/whoop/data/remote/commons/AppExecutors;", "getAppExecutors", "()Lcom/whoop/data/remote/commons/AppExecutors;", "g", "Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;", "O", "()Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/data/remote/RemoteDataSource;", "K", "()Lcom/whoop/data/remote/RemoteDataSource;", "i", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "getFeatureFlagRepository", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "j", "Ltr2/n;", "F", "()Ltr2/n;", "Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;", "P", "()Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;", "Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;", "D", "()Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;", "Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;", "I", "()Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;", "n", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "getPreferenceHelper", "()Lcom/whoop/data/local/prefs/PreferenceHelper;", "o", "Lrr2/c;", "Lorg/joda/time/format/DateTimeFormatter;", "p", "Lorg/joda/time/format/DateTimeFormatter;", "apiDateFormat", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11059g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CommunityApi communityApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CommunityServiceApi communityServiceApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final UsersApi usersApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ChatApi chatApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TeamsDao teamsDao;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final RemoteDataSource remoteDataSourceImpl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TeamInviteDao teamsInviteDao;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final FeatureTeamDao featureTeamDao;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final MemberStoryDao memberStoryDao;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final DateTimeFormatter apiDateFormat;

    /* JADX INFO: renamed from: cq0.g$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {756, 757}, m100432m = "acceptAllInvites", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f34744E;

        /* JADX INFO: renamed from: G */
        int f34746G;

        /* JADX INFO: renamed from: w */
        int f34747w;

        /* JADX INFO: renamed from: x */
        int f34748x;

        /* JADX INFO: renamed from: y */
        Object f34749y;

        /* JADX INFO: renamed from: z */
        boolean f34750z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34744E = obj;
            this.f34746G |= Integer.MIN_VALUE;
            return C11059g.this.m29800k(0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$a0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$updateInviteBadgeStatus$2", m100430f = "TeamsRepository.kt", m100431l = {898}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34751w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TeamInviteDto f34753y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(TeamInviteDto teamInviteDto, InterfaceC30057d<? super a0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34753y = teamInviteDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new a0(this.f34753y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34751w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    TeamInviteDao teamsInviteDao = C11059g.this.getTeamsInviteDao();
                    boolean showBadge = this.f34753y.getShowBadge();
                    int id4 = this.f34753y.getId();
                    this.f34751w = 1;
                    if (teamsInviteDao.updateBadgeStatus(showBadge, id4, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Throwable th3) {
                C11059g.this.getLogger().mo85222m(AbstractC2875y.m8301n("Failed to update Invite: ", th3), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cq0.g$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {710, 711}, m100432m = "acceptInvite", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f34754E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f34755F;

        /* JADX INFO: renamed from: H */
        int f34757H;

        /* JADX INFO: renamed from: w */
        int f34758w;

        /* JADX INFO: renamed from: x */
        int f34759x;

        /* JADX INFO: renamed from: y */
        int f34760y;

        /* JADX INFO: renamed from: z */
        Object f34761z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34755F = obj;
            this.f34757H |= Integer.MIN_VALUE;
            return C11059g.this.m29802l(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$b0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {296}, m100432m = "updateLogo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f34762E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f34763F;

        /* JADX INFO: renamed from: H */
        int f34765H;

        /* JADX INFO: renamed from: w */
        int f34766w;

        /* JADX INFO: renamed from: x */
        int f34767x;

        /* JADX INFO: renamed from: y */
        Object f34768y;

        /* JADX INFO: renamed from: z */
        Object f34769z;

        public b0(InterfaceC30057d<? super b0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34763F = obj;
            this.f34765H |= Integer.MIN_VALUE;
            return C11059g.this.m29810q0(0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {807}, m100432m = "acceptInviteCode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f34770w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f34771x;

        /* JADX INFO: renamed from: z */
        int f34773z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34771x = obj;
            this.f34773z |= Integer.MIN_VALUE;
            return C11059g.this.m29804m(null, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$c0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$updateTeam$2$1", m100430f = "TeamsRepository.kt", m100431l = {265}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/domain/model/teams/Team;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/domain/model/teams/Team;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f34774E;

        /* JADX INFO: renamed from: w */
        int f34775w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ CommunityDto f34777y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Team f34778z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(CommunityDto communityDto, Team team, int i13, InterfaceC30057d<? super c0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34777y = communityDto;
            this.f34778z = team;
            this.f34774E = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new c0(this.f34777y, this.f34778z, this.f34774E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Team> interfaceC30057d) {
            return ((c0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34775w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    CommunityApi communityApi = C11059g.this.getCommunityApi();
                    CommunityDto communityDto = this.f34777y;
                    int id4 = this.f34778z.getId();
                    int i14 = this.f34774E;
                    this.f34775w = 1;
                    obj = communityApi.updateCommunity(communityDto, id4, i14, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                CommunityDto communityDto2 = (CommunityDto) ((C29218v0) obj).f118270b;
                if (communityDto2 != null) {
                    return communityDto2.toTeam();
                }
                return null;
            } catch (Throwable th3) {
                C11059g.this.getLogger().mo85230v("Error in updateTeam: ", th3, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cq0.g$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$createCommunity$2", m100430f = "TeamsRepository.kt", m100431l = {206}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/domain/model/teams/CommunityDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/domain/model/teams/CommunityDto;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Bitmap f34779E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C11059g f34780F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f34781G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f34782H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f34783I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f34784J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ boolean f34785K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ boolean f34786L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ boolean f34787M;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ int f34788N;

        /* JADX INFO: renamed from: w */
        Object f34789w;

        /* JADX INFO: renamed from: x */
        Object f34790x;

        /* JADX INFO: renamed from: y */
        int f34791y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Bitmap f34792z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bitmap bitmap, Bitmap bitmap2, C11059g c11059g, String str, String str2, String str3, String str4, boolean z4, boolean z13, boolean z14, int i13, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34792z = bitmap;
            this.f34779E = bitmap2;
            this.f34780F = c11059g;
            this.f34781G = str;
            this.f34782H = str2;
            this.f34783I = str3;
            this.f34784J = str4;
            this.f34785K = z4;
            this.f34786L = z13;
            this.f34787M = z14;
            this.f34788N = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f34792z, this.f34779E, this.f34780F, this.f34781G, this.f34782H, this.f34783I, this.f34784J, this.f34785K, this.f34786L, this.f34787M, this.f34788N, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super CommunityDto> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C34820i0 c34820i0M96963o;
            C34820i0 c34820i0M96963o2;
            C34842t0 c34842t0M109925b;
            C34842t0 c34842t0M109925b2;
            Object objCreateCommunity;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34791y;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Bitmap bitmap = this.f34792z;
                    if (bitmap != null) {
                        byte[] bArrM29773t = this.f34780F.m29773t(bitmap);
                        C34844u0 c34844u0 = AbstractC34846v0.Companion;
                        C39412p c39412p = C34818h0.f146589e;
                        C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J("image/*");
                        int length = bArrM29773t.length;
                        c34844u0.getClass();
                        c34820i0M96963o = AbstractC31484o.m96963o("banner", "banner.png", C34844u0.m109926c(c34818h0M5373J, bArrM29773t, 0, length));
                    } else {
                        c34820i0M96963o = null;
                    }
                    Bitmap bitmap2 = this.f34779E;
                    if (bitmap2 != null) {
                        byte[] bArrM29773t2 = this.f34780F.m29773t(bitmap2);
                        C34844u0 c34844u1 = AbstractC34846v0.Companion;
                        C39412p c39412p2 = C34818h0.f146589e;
                        C34818h0 c34818h0M5373J2 = AbstractC1772c1.m5373J("image/*");
                        int length2 = bArrM29773t2.length;
                        c34844u1.getClass();
                        c34820i0M96963o2 = AbstractC31484o.m96963o("avatar", "logo.png", C34844u0.m109926c(c34818h0M5373J2, bArrM29773t2, 0, length2));
                    } else {
                        c34820i0M96963o2 = null;
                    }
                    CommunityApi communityApi = this.f34780F.getCommunityApi();
                    String str = this.f34781G;
                    if (str != null) {
                        AbstractC34846v0.Companion.getClass();
                        c34842t0M109925b = C34844u0.m109925b(str, null);
                    } else {
                        c34842t0M109925b = null;
                    }
                    String str2 = this.f34782H;
                    if (str2 != null) {
                        AbstractC34846v0.Companion.getClass();
                        c34842t0M109925b2 = C34844u0.m109925b(str2, null);
                    } else {
                        c34842t0M109925b2 = null;
                    }
                    C34844u0 c34844u2 = AbstractC34846v0.Companion;
                    String str3 = this.f34783I;
                    c34844u2.getClass();
                    C34842t0 c34842t0M109925b3 = C34844u0.m109925b(str3, null);
                    C34842t0 c34842t0M109925b4 = C34844u0.m109925b(this.f34784J, null);
                    boolean z4 = this.f34785K;
                    boolean z13 = this.f34786L;
                    boolean z14 = this.f34787M;
                    int i14 = this.f34788N;
                    this.f34789w = null;
                    this.f34790x = null;
                    this.f34791y = 1;
                    objCreateCommunity = communityApi.createCommunity(c34820i0M96963o, c34820i0M96963o2, c34842t0M109925b, c34842t0M109925b2, c34842t0M109925b3, c34842t0M109925b4, z4, z13, z14, i14, this);
                    if (objCreateCommunity == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objCreateCommunity = obj;
                }
                return (CommunityDto) ((C29218v0) objCreateCommunity).f118270b;
            } catch (Throwable th3) {
                this.f34780F.getLogger().mo85230v("Error in createCommunity: ", th3, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cq0.g$d0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$updateTeamChatSettings$2", m100430f = "TeamsRepository.kt", m100431l = {953}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34793w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f34795y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f34796z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(int i13, boolean z4, InterfaceC30057d<? super d0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34795y = i13;
            this.f34796z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new d0(this.f34795y, this.f34796z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((d0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34793w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    CommunityServiceApi communityServiceApi = C11059g.this.getCommunityServiceApi();
                    int i14 = this.f34795y;
                    boolean z13 = this.f34796z;
                    this.f34793w = 1;
                    obj = communityServiceApi.updateTeamChatSettings(i14, z13, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                z4 = ((C29218v0) obj).f118269a.f146788Q;
            } catch (Throwable th3) {
                AbstractC36685b.m117759a(th3, "Exception occurred while updating the team chat preference", C11059g.this.getLogger(), C11059g.this.crashReporter);
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: renamed from: cq0.g$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {765, 766}, m100432m = "declineAllInvites", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f34797E;

        /* JADX INFO: renamed from: G */
        int f34799G;

        /* JADX INFO: renamed from: w */
        int f34800w;

        /* JADX INFO: renamed from: x */
        int f34801x;

        /* JADX INFO: renamed from: y */
        Object f34802y;

        /* JADX INFO: renamed from: z */
        boolean f34803z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34797E = obj;
            this.f34799G |= Integer.MIN_VALUE;
            return C11059g.this.m29811r(0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$e0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$updateUserOnlineStatus$2", m100430f = "TeamsRepository.kt", m100431l = {968}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34804w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f34806y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f34807z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(int i13, boolean z4, InterfaceC30057d<? super e0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34806y = i13;
            this.f34807z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new e0(this.f34806y, this.f34807z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((e0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34804w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ChatApi chatApi = C11059g.this.getChatApi();
                    int i14 = this.f34806y;
                    boolean z13 = this.f34807z;
                    this.f34804w = 1;
                    obj = chatApi.updateUserOnlineStatus(i14, z13, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                z4 = ((C29218v0) obj).f118269a.f146788Q;
            } catch (Throwable th3) {
                AbstractC36685b.m117759a(th3, "Exception occurred while updating the user online status", C11059g.this.getLogger(), C11059g.this.crashReporter);
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: renamed from: cq0.g$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {747, 748}, m100432m = "declineInvite", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f34808E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f34809F;

        /* JADX INFO: renamed from: H */
        int f34811H;

        /* JADX INFO: renamed from: w */
        int f34812w;

        /* JADX INFO: renamed from: x */
        int f34813x;

        /* JADX INFO: renamed from: y */
        int f34814y;

        /* JADX INFO: renamed from: z */
        Object f34815z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34809F = obj;
            this.f34811H |= Integer.MIN_VALUE;
            return C11059g.this.m29813s(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$f0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {786}, m100432m = "withdrawInvite", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f34816E;

        /* JADX INFO: renamed from: w */
        int f34817w;

        /* JADX INFO: renamed from: x */
        int f34818x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f34819y;

        public f0(InterfaceC30057d<? super f0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34819y = obj;
            this.f34816E |= Integer.MIN_VALUE;
            return C11059g.this.m29817u0(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$getChatToken$2", m100430f = "TeamsRepository.kt", m100431l = {938}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Lbq0/a;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34821w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<C3545a>> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34821w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ChatApi chatApi = C11059g.this.getChatApi();
                    this.f34821w = 1;
                    obj = chatApi.getStreamToken(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return Resource.INSTANCE.success(((ChatTokenResponseDto) obj).toChatTokenResponse());
            } catch (Throwable th3) {
                return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(th3, "Exception occurred while up fetching stream chat token", C11059g.this.getLogger(), C11059g.this.crashReporter), null, null, DomainException.INSTANCE.m23148a(th3), 6, null);
            }
        }
    }

    /* JADX INFO: renamed from: cq0.g$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$getCommunity$2", m100430f = "TeamsRepository.kt", m100431l = {150}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/domain/model/teams/Team;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/domain/model/teams/Team;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ TeamType f34823E;

        /* JADX INFO: renamed from: w */
        int f34824w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f34826y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f34827z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i13, int i14, TeamType teamType, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34826y = i13;
            this.f34827z = i14;
            this.f34823E = teamType;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new h(this.f34826y, this.f34827z, this.f34823E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Team> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34824w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    CommunityApi communityApi = C11059g.this.getCommunityApi();
                    int i14 = this.f34826y;
                    int i15 = this.f34827z;
                    String value = this.f34823E.getValue();
                    this.f34824w = 1;
                    obj = communityApi.getCommunity(i14, i15, value, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return ((CommunityDto) obj).toTeam();
            } catch (Throwable th3) {
                C11059g.this.getLogger().mo85230v("Error in getCommunity: ", th3, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cq0.g$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {239}, m100432m = "getCommunity", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f34828w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f34829x;

        /* JADX INFO: renamed from: z */
        int f34831z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34829x = obj;
            this.f34831z |= Integer.MIN_VALUE;
            return C11059g.this.m29820x(null, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$getCommunityMemberCount$2", m100430f = "TeamsRepository.kt", m100431l = {170}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)I"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ TeamType f34832E;

        /* JADX INFO: renamed from: w */
        int f34833w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f34835y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f34836z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i13, int i14, TeamType teamType, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34835y = i13;
            this.f34836z = i14;
            this.f34832E = teamType;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new j(this.f34835y, this.f34836z, this.f34832E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Integer> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            j jVar;
            Throwable th3;
            int totalCount;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34833w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    CommunityApi communityApi = C11059g.this.getCommunityApi();
                    int i14 = this.f34835y;
                    int i15 = this.f34836z;
                    String value = this.f34832E.getValue();
                    this.f34833w = 1;
                    jVar = this;
                    try {
                        obj = communityApi.getCommunityMembers(i14, 0, 50, i15, value, jVar);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th3 = th;
                        C11059g.this.getLogger().mo85230v("Error in getCommunityMemberCount: ", th3, new AbstractC30556a.a[0]);
                        totalCount = 0;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    jVar = this;
                    th3 = th;
                    C11059g.this.getLogger().mo85230v("Error in getCommunityMemberCount: ", th3, new AbstractC30556a.a[0]);
                    totalCount = 0;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    AbstractC34132o.m107864I(obj);
                    jVar = this;
                } catch (Throwable th6) {
                    th3 = th6;
                    jVar = this;
                    C11059g.this.getLogger().mo85230v("Error in getCommunityMemberCount: ", th3, new AbstractC30556a.a[0]);
                    totalCount = 0;
                }
            }
            totalCount = ((RecordsDto) obj).getTotalCount();
            return new Integer(totalCount);
        }
    }

    /* JADX INFO: renamed from: cq0.g$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$getCommunityMembers$2", m100430f = "TeamsRepository.kt", m100431l = {159}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lcom/whoop/domain/model/teams/TeamUser;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ TeamType f34837E;

        /* JADX INFO: renamed from: w */
        int f34838w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f34840y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f34841z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i13, int i14, TeamType teamType, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34840y = i13;
            this.f34841z = i14;
            this.f34837E = teamType;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new k(this.f34840y, this.f34841z, this.f34837E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<TeamUser>> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            Throwable th3;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34838w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    CommunityApi communityApi = C11059g.this.getCommunityApi();
                    int i14 = this.f34840y;
                    int i15 = this.f34841z;
                    String value = this.f34837E.getValue();
                    this.f34838w = 1;
                    kVar = this;
                    try {
                        obj = communityApi.getCommunityMembers(i14, 0, 50, i15, value, kVar);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th3 = th;
                        C11059g.this.getLogger().mo85230v("Error in getCommunityMembers: ", th3, new AbstractC30556a.a[0]);
                        return new ArrayList();
                    }
                } catch (Throwable th5) {
                    th = th5;
                    kVar = this;
                    th3 = th;
                    C11059g.this.getLogger().mo85230v("Error in getCommunityMembers: ", th3, new AbstractC30556a.a[0]);
                    return new ArrayList();
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    AbstractC34132o.m107864I(obj);
                    kVar = this;
                } catch (Throwable th6) {
                    th3 = th6;
                    kVar = this;
                    C11059g.this.getLogger().mo85230v("Error in getCommunityMembers: ", th3, new AbstractC30556a.a[0]);
                    return new ArrayList();
                }
            }
            List records = ((RecordsDto) obj).getRecords();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(records, 10));
            Iterator it = records.iterator();
            while (it.hasNext()) {
                arrayList.add(((CommunityMemberDto) it.next()).toTeamUser());
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: cq0.g$l */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"cq0/g$l", "Lcq0/e;", "Lcom/whoop/service/network/model/DefaultImages;", "Landroidx/lifecycle/p0;", "Lcom/whoop/data/remote/commons/ApiResponse;", "m", "()Landroidx/lifecycle/p0;", "item", "Ll83/a0;", "D", "(Lcom/whoop/service/network/model/DefaultImages;)V", "data", "", "E", "(Lcom/whoop/service/network/model/DefaultImages;)Z", "x", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC11057e<DefaultImages, DefaultImages> {
        public l(AppExecutors appExecutors) {
            super(appExecutors);
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public void mo29743A(DefaultImages item) {
            AbstractC22676k.m65750j(item, "item");
            C11059g.this.getTeamsDao().saveDefaultImages(item);
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean mo29744C(DefaultImages data) {
            return true;
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: m */
        public AbstractC1615p0 mo29746m() {
            return C11059g.this.getRemoteDataSourceImpl().getDefaultImagesLiveData();
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: x */
        public AbstractC1615p0 mo29747x() {
            return C11059g.this.getTeamsDao().getDefaultImagesLiveData();
        }
    }

    /* JADX INFO: renamed from: cq0.g$m */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"cq0/g$m", "Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;", "", "Lcom/whoop/domain/model/teams/FeatureTeam;", "data", "", "c", "(Ljava/util/List;)Z", "Ll83/a0;", "a", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "fetchFromDb", "(Lq83/d;)Ljava/lang/Object;", "fetchFromNetwork", "dataFromServer", "b", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends NetworkBoundCoroutineResource<List<? extends FeatureTeam>> {

        /* JADX INFO: renamed from: cq0.g$m$a */
        @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$getFeatureTeams$2$cache$2", m100430f = "TeamsRepository.kt", m100431l = {843}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f34844w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11059g f34845x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ List<FeatureTeam> f34846y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11059g c11059g, List<FeatureTeam> list, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f34845x = c11059g;
                this.f34846y = list;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f34845x, this.f34846y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f34844w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    FeatureTeamDao featureTeamDao = this.f34845x.getFeatureTeamDao();
                    List<FeatureTeam> list = this.f34846y;
                    this.f34844w = 1;
                    if (featureTeamDao.addFeatureTeams(list, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: cq0.g$m$b */
        @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$getFeatureTeams$2$fetchFromDb$2", m100430f = "TeamsRepository.kt", m100431l = {847}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lcom/whoop/domain/model/teams/FeatureTeam;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f34847w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11059g f34848x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C11059g c11059g, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f34848x = c11059g;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f34848x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<FeatureTeam>> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f34847w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                FeatureTeamDao featureTeamDao = this.f34848x.getFeatureTeamDao();
                this.f34847w = 1;
                Object featureTeamData = featureTeamDao.getFeatureTeamData(this);
                return featureTeamData == enumC31071a ? enumC31071a : featureTeamData;
            }
        }

        public m() {
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object cache(List<FeatureTeam> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
            Object objM8705K = AbstractC3006f0.m8705K(C11059g.this.dispatcherFactory.mo54465b(), new a(C11059g.this, list, null), interfaceC30057d);
            return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean shouldCache(List<FeatureTeam> dataFromServer) {
            AbstractC22676k.m65750j(dataFromServer, "dataFromServer");
            return true;
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean shouldFetch(List<FeatureTeam> data) {
            AbstractC22676k.m65750j(data, "data");
            return true;
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        public Object fetchFromDb(InterfaceC30057d<? super List<? extends FeatureTeam>> interfaceC30057d) {
            return AbstractC3006f0.m8705K(C11059g.this.dispatcherFactory.mo54465b(), new b(C11059g.this, null), interfaceC30057d);
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        public Object fetchFromNetwork(InterfaceC30057d<? super List<? extends FeatureTeam>> interfaceC30057d) {
            return C11059g.this.getRemoteDataSourceImpl().getFeatureTeams(interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: cq0.g$n */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"cq0/g$n", "Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;", "", "Lcom/whoop/domain/model/teams/MemberStory;", "data", "", "c", "(Ljava/util/List;)Z", "Ll83/a0;", "a", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "fetchFromDb", "(Lq83/d;)Ljava/lang/Object;", "fetchFromNetwork", "dataFromServer", "b", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends NetworkBoundCoroutineResource<List<? extends MemberStory>> {

        /* JADX INFO: renamed from: cq0.g$n$a */
        @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$getMemberStories$2$cache$2", m100430f = "TeamsRepository.kt", m100431l = {862}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f34850w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11059g f34851x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ List<MemberStory> f34852y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11059g c11059g, List<MemberStory> list, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f34851x = c11059g;
                this.f34852y = list;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f34851x, this.f34852y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f34850w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    MemberStoryDao memberStoryDao = this.f34851x.getMemberStoryDao();
                    List<MemberStory> list = this.f34852y;
                    this.f34850w = 1;
                    if (memberStoryDao.addMemberStories(list, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: cq0.g$n$b */
        @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$getMemberStories$2$fetchFromDb$2", m100430f = "TeamsRepository.kt", m100431l = {866}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lcom/whoop/domain/model/teams/MemberStory;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f34853w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11059g f34854x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C11059g c11059g, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f34854x = c11059g;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f34854x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<MemberStory>> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f34853w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                MemberStoryDao memberStoryDao = this.f34854x.getMemberStoryDao();
                this.f34853w = 1;
                Object memberStoryData = memberStoryDao.getMemberStoryData(this);
                return memberStoryData == enumC31071a ? enumC31071a : memberStoryData;
            }
        }

        /* JADX INFO: renamed from: cq0.g$n$c */
        @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$getMemberStories$2", m100430f = "TeamsRepository.kt", m100431l = {869}, m100432m = "fetchFromNetwork", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c extends AbstractC32269c {

            /* JADX INFO: renamed from: w */
            Object f34855w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f34856x;

            /* JADX INFO: renamed from: z */
            int f34858z;

            public c(InterfaceC30057d<? super c> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f34856x = obj;
                this.f34858z |= Integer.MIN_VALUE;
                return n.this.fetchFromNetwork(this);
            }
        }

        public n() {
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object cache(List<MemberStory> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
            Object objM8705K = AbstractC3006f0.m8705K(C11059g.this.dispatcherFactory.mo54465b(), new a(C11059g.this, list, null), interfaceC30057d);
            return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean shouldCache(List<MemberStory> dataFromServer) {
            AbstractC22676k.m65750j(dataFromServer, "dataFromServer");
            return true;
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean shouldFetch(List<MemberStory> data) {
            AbstractC22676k.m65750j(data, "data");
            return true;
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        public Object fetchFromDb(InterfaceC30057d<? super List<? extends MemberStory>> interfaceC30057d) {
            return AbstractC3006f0.m8705K(C11059g.this.dispatcherFactory.mo54465b(), new b(C11059g.this, null), interfaceC30057d);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        public Object fetchFromNetwork(InterfaceC30057d<? super List<? extends MemberStory>> interfaceC30057d) {
            c cVar;
            C11059g c11059g;
            if (interfaceC30057d instanceof c) {
                cVar = (c) interfaceC30057d;
                int i13 = cVar.f34858z;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    cVar.f34858z = i13 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(interfaceC30057d);
                }
            } else {
                cVar = new c(interfaceC30057d);
            }
            Object obj = cVar.f34856x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = cVar.f34858z;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g2 = C11059g.this;
                RemoteDataSource remoteDataSourceImpl = c11059g2.getRemoteDataSourceImpl();
                cVar.f34855w = c11059g2;
                cVar.f34858z = 1;
                Object memberStories = remoteDataSourceImpl.getMemberStories(cVar);
                if (memberStories == enumC31071a) {
                    return enumC31071a;
                }
                c11059g = c11059g2;
                obj = memberStories;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c11059g = (C11059g) cVar.f34855w;
                AbstractC34132o.m107864I(obj);
            }
            return c11059g.m29781H((RecordsDto) obj);
        }
    }

    /* JADX INFO: renamed from: cq0.g$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {698}, m100432m = "getPendingInvites", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f34859w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f34860x;

        /* JADX INFO: renamed from: z */
        int f34862z;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34860x = obj;
            this.f34862z |= Integer.MIN_VALUE;
            return C11059g.this.m29783J(0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$p */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {113}, m100432m = "getTeamCount", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f34863w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f34864x;

        /* JADX INFO: renamed from: z */
        int f34866z;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34864x = obj;
            this.f34866z |= Integer.MIN_VALUE;
            return C11059g.this.m29785L(null, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$q */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000f0\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"cq0/g$q", "Lcq0/e;", "", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "item", "Ll83/a0;", "D", "(Ljava/util/List;)V", "data", "", "E", "(Ljava/util/List;)Z", "Landroidx/lifecycle/p0;", "x", "()Landroidx/lifecycle/p0;", "Lcom/whoop/data/remote/commons/ApiResponse;", "m", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC11057e<List<? extends TeamInviteDto>, List<? extends TeamInviteDto>> {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ User f34868d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(User user, AppExecutors appExecutors) {
            super(appExecutors);
            this.f34868d = user;
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public void mo29743A(List<TeamInviteDto> item) {
            AbstractC22676k.m65750j(item, "item");
            C11059g.this.getTeamsInviteDao().addInvites(this.f34868d.getId(), item);
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean mo29744C(List<TeamInviteDto> data) {
            return true;
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: m */
        public AbstractC1615p0 mo29746m() {
            return C11059g.this.getRemoteDataSourceImpl().getTeamInviteLiveData(this.f34868d.getId());
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: x */
        public AbstractC1615p0 mo29747x() {
            return C11059g.this.getTeamsInviteDao().getLiveTeamInviteData();
        }
    }

    /* JADX INFO: renamed from: cq0.g$r */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {793}, m100432m = "getTeamShareCode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f34869w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f34870x;

        /* JADX INFO: renamed from: z */
        int f34872z;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34870x = obj;
            this.f34872z |= Integer.MIN_VALUE;
            return C11059g.this.m29787N(0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$s */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000f0\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"cq0/g$s", "Lcq0/e;", "", "Lcom/whoop/data/local/room/entity/TeamsDto;", "item", "Ll83/a0;", "D", "(Ljava/util/List;)V", "data", "", "E", "(Ljava/util/List;)Z", "Landroidx/lifecycle/p0;", "x", "()Landroidx/lifecycle/p0;", "Lcom/whoop/data/remote/commons/ApiResponse;", "m", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s extends AbstractC11057e<List<? extends TeamsDto>, List<? extends TeamsDto>> {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ User f34874d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f34875e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f34876f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f34877g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f34878h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(User user, String str, String str2, String str3, String str4, AppExecutors appExecutors) {
            super(appExecutors);
            this.f34874d = user;
            this.f34875e = str;
            this.f34876f = str2;
            this.f34877g = str3;
            this.f34878h = str4;
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public void mo29743A(List<TeamsDto> item) {
            AbstractC22676k.m65750j(item, "item");
            C11059g.this.getTeamsDao().updateTeams(this.f34874d.getId(), item);
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean mo29744C(List<TeamsDto> data) {
            return true;
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: m */
        public AbstractC1615p0 mo29746m() {
            return C11059g.this.getRemoteDataSourceImpl().getTeamsWithRankLiveData(this.f34874d.getId(), this.f34875e, this.f34876f, this.f34877g, this.f34878h);
        }

        @Override // cq0.AbstractC11057e
        /* JADX INFO: renamed from: x */
        public AbstractC1615p0 mo29747x() {
            return C11059g.this.getTeamsDao().getLiveTeamData(this.f34874d.getId());
        }
    }

    /* JADX INFO: renamed from: cq0.g$t */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {350}, m100432m = "kickMember", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f34880F;

        /* JADX INFO: renamed from: w */
        int f34881w;

        /* JADX INFO: renamed from: x */
        int f34882x;

        /* JADX INFO: renamed from: y */
        int f34883y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f34884z;

        public t(InterfaceC30057d<? super t> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34884z = obj;
            this.f34880F |= Integer.MIN_VALUE;
            return C11059g.this.m29792S(0, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$u */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$leaveTeam$2", m100430f = "TeamsRepository.kt", m100431l = {226}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34885w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f34887y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f34888z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i13, int i14, InterfaceC30057d<? super u> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34887y = i13;
            this.f34888z = i14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new u(this.f34887y, this.f34888z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((u) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34885w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    CommunityApi communityApi = C11059g.this.getCommunityApi();
                    int i14 = this.f34887y;
                    int i15 = this.f34888z;
                    this.f34885w = 1;
                    obj = communityApi.leaveCommunity(i14, i15, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C29218v0 c29218v0 = (C29218v0) obj;
                if (c29218v0.f118269a.f146788Q) {
                    C11059g.this.getTeamsDao().removeTeam(this.f34887y, TeamType.COMMUNITY.getValue());
                }
                z4 = c29218v0.f118269a.f146788Q;
            } catch (Throwable th3) {
                C11059g.this.getLogger().mo85230v("Error in leaveTeam: ", th3, new AbstractC30556a.a[0]);
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: renamed from: cq0.g$v */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {774}, m100432m = "sendInvite", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f34890F;

        /* JADX INFO: renamed from: w */
        int f34891w;

        /* JADX INFO: renamed from: x */
        int f34892x;

        /* JADX INFO: renamed from: y */
        int f34893y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f34894z;

        public v(InterfaceC30057d<? super v> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34894z = obj;
            this.f34890F |= Integer.MIN_VALUE;
            return C11059g.this.m29799j0(0, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$w */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {357}, m100432m = "transferOwnership", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f34896F;

        /* JADX INFO: renamed from: w */
        int f34897w;

        /* JADX INFO: renamed from: x */
        int f34898x;

        /* JADX INFO: renamed from: y */
        int f34899y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f34900z;

        public w(InterfaceC30057d<? super w> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34900z = obj;
            this.f34896F |= Integer.MIN_VALUE;
            return C11059g.this.m29803l0(0, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$x */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$updateAllInviteBadgeStatus$2", m100430f = "TeamsRepository.kt", m100431l = {908}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34901w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f34903y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<TeamInviteDto> f34904z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(boolean z4, List<TeamInviteDto> list, InterfaceC30057d<? super x> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34903y = z4;
            this.f34904z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new x(this.f34903y, this.f34904z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((x) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34901w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    TeamInviteDao teamsInviteDao = C11059g.this.getTeamsInviteDao();
                    boolean z4 = this.f34903y;
                    List<TeamInviteDto> list = this.f34904z;
                    this.f34901w = 1;
                    if (teamsInviteDao.updateAllBadgeStatus(z4, list, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Throwable th3) {
                C11059g.this.getLogger().mo85222m(AbstractC2875y.m8301n("Failed to update Invites: ", th3), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cq0.g$y */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository", m100430f = "TeamsRepository.kt", m100431l = {281}, m100432m = "updateBanner", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f34905E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f34906F;

        /* JADX INFO: renamed from: H */
        int f34908H;

        /* JADX INFO: renamed from: w */
        int f34909w;

        /* JADX INFO: renamed from: x */
        int f34910x;

        /* JADX INFO: renamed from: y */
        Object f34911y;

        /* JADX INFO: renamed from: z */
        Object f34912z;

        public y(InterfaceC30057d<? super y> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34906F = obj;
            this.f34908H |= Integer.MIN_VALUE;
            return C11059g.this.m29806n0(0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: cq0.g$z */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.TeamsRepository$updateFeatureTeamBadgeStatus$2", m100430f = "TeamsRepository.kt", m100431l = {888}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class z extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34913w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ FeatureTeam f34915y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(FeatureTeam featureTeam, InterfaceC30057d<? super z> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34915y = featureTeam;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11059g.this.new z(this.f34915y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((z) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34913w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    FeatureTeamDao featureTeamDao = C11059g.this.getFeatureTeamDao();
                    int communityId = this.f34915y.getCommunityId();
                    this.f34913w = 1;
                    if (featureTeamDao.updateBannerStatus(false, communityId, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Throwable th3) {
                C11059g.this.getLogger().mo85222m(AbstractC2875y.m8301n("Failed to update the feature team banner: ", th3), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    public C11059g(InterfaceC18732d dispatcherFactory, CommunityApi communityApi, CommunityServiceApi communityServiceApi, UsersApi usersApi, ChatApi chatApi, AppExecutors appExecutors, TeamsDao teamsDao, RemoteDataSource remoteDataSourceImpl, FeatureFlagRepository featureFlagRepository, InterfaceC34116n logger, TeamInviteDao teamsInviteDao, FeatureTeamDao featureTeamDao, MemberStoryDao memberStoryDao, PreferenceHelper preferenceHelper, InterfaceC31766c crashReporter) {
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(communityApi, "communityApi");
        AbstractC22676k.m65750j(communityServiceApi, "communityServiceApi");
        AbstractC22676k.m65750j(usersApi, "usersApi");
        AbstractC22676k.m65750j(chatApi, "chatApi");
        AbstractC22676k.m65750j(appExecutors, "appExecutors");
        AbstractC22676k.m65750j(teamsDao, "teamsDao");
        AbstractC22676k.m65750j(remoteDataSourceImpl, "remoteDataSourceImpl");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(teamsInviteDao, "teamsInviteDao");
        AbstractC22676k.m65750j(featureTeamDao, "featureTeamDao");
        AbstractC22676k.m65750j(memberStoryDao, "memberStoryDao");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        this.dispatcherFactory = dispatcherFactory;
        this.communityApi = communityApi;
        this.communityServiceApi = communityServiceApi;
        this.usersApi = usersApi;
        this.chatApi = chatApi;
        this.appExecutors = appExecutors;
        this.teamsDao = teamsDao;
        this.remoteDataSourceImpl = remoteDataSourceImpl;
        this.featureFlagRepository = featureFlagRepository;
        this.logger = logger;
        this.teamsInviteDao = teamsInviteDao;
        this.featureTeamDao = featureTeamDao;
        this.memberStoryDao = memberStoryDao;
        this.preferenceHelper = preferenceHelper;
        this.crashReporter = crashReporter;
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
        this.apiDateFormat = dateTimeFormatterForPattern;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final RecordsDto m29750V(int i13, C29218v0 c29218v0) {
        ArrayList arrayList;
        List records;
        RecordsDto recordsDto = (RecordsDto) c29218v0.f118270b;
        int totalCount = recordsDto != null ? recordsDto.getTotalCount() : 0;
        RecordsDto recordsDto2 = (RecordsDto) c29218v0.f118270b;
        if (recordsDto2 == null || (records = recordsDto2.getRecords()) == null) {
            arrayList = new ArrayList();
        } else {
            List list = records;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CommunityMemberDto) it.next()).toTeamUser());
            }
        }
        return new RecordsDto(i13, totalCount, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final RecordsDto m29751W(Function1 function1, Object obj) {
        return (RecordsDto) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m29752Y(C24082e c24082e, C29218v0 c29218v0) {
        List<LeadersEntryDto> records;
        C34850x0 c34850x0 = c29218v0.f118269a;
        Object obj = c29218v0.f118270b;
        if (c34850x0.f146788Q) {
            ArrayList arrayList = new ArrayList();
            LeadersDto leadersDto = (LeadersDto) obj;
            if (leadersDto != null && (records = leadersDto.getRecords()) != null) {
                Iterator<T> it = records.iterator();
                while (it.hasNext()) {
                    arrayList.add(((LeadersEntryDto) it.next()).toLeadersEntry());
                }
            }
            c24082e.onNext(new C17561a(leadersDto != null ? leadersDto.getAverage() : null, arrayList, leadersDto != null ? leadersDto.getLastUpdatedAt() : null, leadersDto != null ? Integer.valueOf(leadersDto.getTotalCount()) : null, leadersDto != null ? leadersDto.getTotalCompliant() : null, leadersDto != null ? leadersDto.getTotalNonCompliant() : null));
        } else {
            c24082e.onNext(null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m29753Z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m29756b0(C24082e c24082e, C29218v0 c29218v0) {
        if (c29218v0.f118269a.f146788Q) {
            LeadersEntryDto leadersEntryDto = (LeadersEntryDto) c29218v0.f118270b;
            c24082e.onNext(leadersEntryDto != null ? leadersEntryDto.toLeadersEntry() : null);
        } else {
            c24082e.onNext(null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m29758c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final RecordsDto m29761e0(int i13, C29218v0 response) {
        ArrayList arrayList;
        List records;
        AbstractC22676k.m65750j(response, "response");
        Object obj = response.f118270b;
        RecordsDto recordsDto = (RecordsDto) obj;
        int totalCount = recordsDto != null ? recordsDto.getTotalCount() : 0;
        RecordsDto recordsDto2 = (RecordsDto) obj;
        if (recordsDto2 == null || (records = recordsDto2.getRecords()) == null) {
            arrayList = new ArrayList();
        } else {
            List list = records;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CommunityMemberDto) it.next()).toTeamUser());
            }
        }
        return new RecordsDto(i13, totalCount, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final RecordsDto m29763f0(Function1 function1, Object obj) {
        return (RecordsDto) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final List m29766h0(C29218v0 c29218v0) {
        List records;
        RecordsDto recordsDto = (RecordsDto) c29218v0.f118270b;
        if (recordsDto == null || (records = recordsDto.getRecords()) == null) {
            return null;
        }
        List list = records;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CommunityMemberDto) it.next()).toTeamUser());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final List m29768i0(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final byte[] m29773t(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC22676k.m65749i(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX INFO: renamed from: A */
    public final Object m29774A(int i13, int i14, TeamType teamType, InterfaceC30057d<? super List<TeamUser>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new k(i13, i14, teamType, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final CommunityServiceApi getCommunityServiceApi() {
        return this.communityServiceApi;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC1615p0 m29776C() {
        return new l(this.appExecutors).m29745l();
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final FeatureTeamDao getFeatureTeamDao() {
        return this.featureTeamDao;
    }

    /* JADX INFO: renamed from: E */
    public final Object m29778E(InterfaceC30057d<? super List<FeatureTeam>> interfaceC30057d) {
        return new m().get(interfaceC30057d);
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: G */
    public final Object m29780G(InterfaceC30057d<? super List<MemberStory>> interfaceC30057d) {
        return new n().get(interfaceC30057d);
    }

    /* JADX INFO: renamed from: H */
    public final List<MemberStory> m29781H(RecordsDto<MemberStoryDto> data) {
        List<MemberStoryDto> records;
        try {
            ArrayList arrayList = new ArrayList();
            if (data != null && (records = data.getRecords()) != null) {
                Iterator<T> it = records.iterator();
                while (it.hasNext()) {
                    MemberStory memoryStory = ((MemberStoryDto) it.next()).toMemoryStory();
                    memoryStory.setShowBadge(true);
                    arrayList.add(memoryStory);
                }
            }
            return arrayList;
        } catch (Exception e5) {
            this.logger.mo85230v("Exception occurred while fetching the member stories", e5, new AbstractC30556a.a[0]);
            return C25271y.f99162w;
        }
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final MemberStoryDao getMemberStoryDao() {
        return this.memberStoryDao;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public final Object m29783J(int i13, InterfaceC30057d<? super List<TeamInviteDto>> interfaceC30057d) {
        o oVar;
        RecordsDto recordsDto;
        if (interfaceC30057d instanceof o) {
            oVar = (o) interfaceC30057d;
            int i14 = oVar.f34862z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f34862z = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(interfaceC30057d);
            }
        } else {
            oVar = new o(interfaceC30057d);
        }
        Object pendingInvites = oVar.f34860x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = oVar.f34862z;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(pendingInvites);
                CommunityApi communityApi = this.communityApi;
                oVar.f34859w = i13;
                oVar.f34862z = 1;
                pendingInvites = communityApi.getPendingInvites(i13, oVar);
                if (pendingInvites == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(pendingInvites);
            }
            C29218v0 c29218v0 = (C29218v0) pendingInvites;
            if (!c29218v0.f118269a.f146788Q || (recordsDto = (RecordsDto) c29218v0.f118270b) == null) {
                return null;
            }
            return recordsDto.getRecords();
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in getPendingInvites: ", th3, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final RemoteDataSource getRemoteDataSourceImpl() {
        return this.remoteDataSourceImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: L */
    public final Object m29785L(User user, InterfaceC30057d<? super Integer> interfaceC30057d) {
        p pVar;
        if (interfaceC30057d instanceof p) {
            pVar = (p) interfaceC30057d;
            int i13 = pVar.f34866z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                pVar.f34866z = i13 - Integer.MIN_VALUE;
            } else {
                pVar = new p(interfaceC30057d);
            }
        } else {
            pVar = new p(interfaceC30057d);
        }
        Object teamCount = pVar.f34864x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = pVar.f34866z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(teamCount);
                TeamsDao teamsDao = this.teamsDao;
                int id4 = user.getId();
                pVar.f34863w = null;
                pVar.f34866z = 1;
                teamCount = teamsDao.getTeamCount(id4, pVar);
                if (teamCount == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(teamCount);
            }
            return (Integer) teamCount;
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to fetch team count", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: M */
    public final AbstractC1615p0 m29786M(User user) {
        AbstractC22676k.m65750j(user, "user");
        return new q(user, this.appExecutors).m29745l();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: N */
    public final Object m29787N(int i13, InterfaceC30057d<? super String> interfaceC30057d) {
        r rVar;
        TeamShareCodeDto teamShareCodeDto;
        if (interfaceC30057d instanceof r) {
            rVar = (r) interfaceC30057d;
            int i14 = rVar.f34872z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f34872z = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(interfaceC30057d);
            }
        } else {
            rVar = new r(interfaceC30057d);
        }
        Object teamShareCode = rVar.f34870x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = rVar.f34872z;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(teamShareCode);
                CommunityApi communityApi = this.communityApi;
                rVar.f34869w = i13;
                rVar.f34872z = 1;
                teamShareCode = communityApi.getTeamShareCode(i13, rVar);
                if (teamShareCode == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(teamShareCode);
            }
            C29218v0 c29218v0 = (C29218v0) teamShareCode;
            if (!c29218v0.f118269a.f146788Q || (teamShareCodeDto = (TeamShareCodeDto) c29218v0.f118270b) == null || teamShareCodeDto.getDeleted()) {
                return null;
            }
            return teamShareCodeDto.getCode();
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in getTeamShareCode: ", th3, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final TeamsDao getTeamsDao() {
        return this.teamsDao;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final TeamInviteDao getTeamsInviteDao() {
        return this.teamsInviteDao;
    }

    /* JADX INFO: renamed from: Q */
    public final AbstractC1615p0 m29790Q(User user, String leaderboardType, String startDate, String endDate, String period) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(leaderboardType, "leaderboardType");
        AbstractC22676k.m65750j(startDate, "startDate");
        return new s(user, leaderboardType, startDate, endDate, period, this.appExecutors).m29745l();
    }

    /* JADX INFO: renamed from: R */
    public final boolean m29791R() {
        return this.preferenceHelper.getBooleanValueFromMainPrefs(SharedPreferenceConstants.KEY_COLLAPSE_STATE, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: S */
    public final Object m29792S(int i13, int i14, int i15, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        t tVar;
        boolean z4;
        if (interfaceC30057d instanceof t) {
            tVar = (t) interfaceC30057d;
            int i16 = tVar.f34880F;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                tVar.f34880F = i16 - Integer.MIN_VALUE;
            } else {
                tVar = new t(interfaceC30057d);
            }
        } else {
            tVar = new t(interfaceC30057d);
        }
        Object objRemoveCommunityMember = tVar.f34884z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = tVar.f34880F;
        try {
            if (i17 == 0) {
                AbstractC34132o.m107864I(objRemoveCommunityMember);
                CommunityApi communityApi = this.communityApi;
                tVar.f34881w = i13;
                tVar.f34882x = i14;
                tVar.f34883y = i15;
                tVar.f34880F = 1;
                objRemoveCommunityMember = communityApi.removeCommunityMember(i13, i14, i15, tVar);
                if (objRemoveCommunityMember == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objRemoveCommunityMember);
            }
            z4 = ((C29218v0) objRemoveCommunityMember).f118269a.f146788Q;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in kickMember: ", th3, new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: T */
    public final Object m29793T(int i13, int i14, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new u(i13, i14, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: U */
    public final C38280g<RecordsDto<TeamUser>> m29794U(int teamId, int offset, int limit, int forUserId, TeamType teamType) {
        AbstractC22676k.m65750j(teamType, "teamType");
        C38280g<RecordsDto<TeamUser>> c38280gM122682x = AbstractC18274s.m52648m(this.communityApi.observeCommunityMembers(teamId, offset, limit, forUserId, offset == 0, teamType.getValue())).m122682x(new C0680g0(new C6494e(offset, 4), 23));
        AbstractC22676k.m65749i(c38280gM122682x, "map(...)");
        return c38280gM122682x;
    }

    /* JADX INFO: renamed from: X */
    public final C38280g<C17561a> m29795X(int teamId, LocalDate startDate, LocalDate endDate, TimePeriod period, int sortBy, int offset, int limit, TeamType teamType) {
        C38280g<C29218v0<LeadersDto>> leadersStrainDaystrainAggregate;
        AbstractC22676k.m65750j(period, "period");
        AbstractC22676k.m65750j(teamType, "teamType");
        C24082e c24082eM71000Y = C24082e.m71000Y();
        if (startDate == null || teamId == 0) {
            c24082eM71000Y.onNext(null);
            return c24082eM71000Y;
        }
        String strPrint = this.apiDateFormat.print(startDate.toDateTimeAtStartOfDay());
        String strPrint2 = this.apiDateFormat.print(endDate != null ? endDate.toDateTimeAtStartOfDay() : null);
        if (period == TimePeriod.DAILY) {
            switch (sortBy) {
                case 0:
                    CommunityApi communityApi = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    leadersStrainDaystrainAggregate = communityApi.getLeadersStrainDaystrain(teamId, strPrint, offset, limit, teamType.getValue());
                    break;
                case 1:
                    CommunityApi communityApi2 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    leadersStrainDaystrainAggregate = communityApi2.getLeadersStrainActivity(teamId, strPrint, offset, limit, teamType.getValue());
                    break;
                case 2:
                    CommunityApi communityApi3 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    leadersStrainDaystrainAggregate = communityApi3.getLeadersStrainCalories(teamId, strPrint, offset, limit, teamType.getValue());
                    break;
                case 3:
                    CommunityApi communityApi4 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    leadersStrainDaystrainAggregate = communityApi4.getLeadersRecoveryScore(teamId, strPrint, offset, limit, teamType.getValue());
                    break;
                case 4:
                    CommunityApi communityApi5 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    leadersStrainDaystrainAggregate = communityApi5.getLeadersRecoveryHRV(teamId, strPrint, offset, limit, teamType.getValue());
                    break;
                case 5:
                    CommunityApi communityApi6 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    leadersStrainDaystrainAggregate = communityApi6.getLeadersRecoveryRHR(teamId, strPrint, offset, limit, teamType.getValue());
                    break;
                case 6:
                    CommunityApi communityApi7 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    leadersStrainDaystrainAggregate = communityApi7.getLeadersSleepPerformance(teamId, strPrint, offset, limit, teamType.getValue());
                    break;
                case 7:
                    CommunityApi communityApi8 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    leadersStrainDaystrainAggregate = communityApi8.getLeadersSleepHours(teamId, strPrint, offset, limit, teamType.getValue());
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            switch (sortBy) {
                case 0:
                    CommunityApi communityApi9 = this.communityApi;
                    String strName = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    leadersStrainDaystrainAggregate = communityApi9.getLeadersStrainDaystrainAggregate(teamId, strName, offset, limit, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 1:
                    CommunityApi communityApi10 = this.communityApi;
                    String strName2 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    leadersStrainDaystrainAggregate = communityApi10.getLeadersStrainActivityAggregate(teamId, strName2, offset, limit, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 2:
                    CommunityApi communityApi11 = this.communityApi;
                    String strName3 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    leadersStrainDaystrainAggregate = communityApi11.getLeadersStrainCaloriesAggregate(teamId, strName3, offset, limit, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 3:
                    CommunityApi communityApi12 = this.communityApi;
                    String strName4 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    leadersStrainDaystrainAggregate = communityApi12.getLeadersRecoveryScoreAggregate(teamId, strName4, offset, limit, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 4:
                    CommunityApi communityApi13 = this.communityApi;
                    String strName5 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    leadersStrainDaystrainAggregate = communityApi13.getLeadersRecoveryHrvAggregate(teamId, strName5, offset, limit, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 5:
                    CommunityApi communityApi14 = this.communityApi;
                    String strName6 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    leadersStrainDaystrainAggregate = communityApi14.getLeadersRecoveryRhrAggregate(teamId, strName6, offset, limit, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 6:
                    CommunityApi communityApi15 = this.communityApi;
                    String strName7 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    leadersStrainDaystrainAggregate = communityApi15.getLeadersSleepPerformanceAggregate(teamId, strName7, offset, limit, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 7:
                    CommunityApi communityApi16 = this.communityApi;
                    String strName8 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    leadersStrainDaystrainAggregate = communityApi16.getLeadersSleepDurationAggregate(teamId, strName8, offset, limit, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
        AbstractC18274s.m52648m(leadersStrainDaystrainAggregate).m122665P(C22488a.m64989a().f88182b).m122652B(C40634a.m131874a()).m122661K(new C3374c(new C11058f(c24082eM71000Y, 1), 3));
        return c24082eM71000Y;
    }

    /* JADX INFO: renamed from: a0 */
    public final C38280g<LeadersEntry> m29796a0(int teamId, LocalDate startDate, LocalDate endDate, TimePeriod period, int sortBy, TeamType teamType) {
        C38280g<C29218v0<LeadersEntryDto>> userRankStrainDaystrainAggregate;
        AbstractC22676k.m65750j(period, "period");
        AbstractC22676k.m65750j(teamType, "teamType");
        C24082e c24082eM71000Y = C24082e.m71000Y();
        if (startDate == null || teamId == 0) {
            c24082eM71000Y.onNext(null);
            return c24082eM71000Y;
        }
        String strPrint = this.apiDateFormat.print(startDate.toDateTimeAtStartOfDay());
        String strPrint2 = this.apiDateFormat.print(endDate != null ? endDate.toDateTimeAtStartOfDay() : null);
        if (period == TimePeriod.DAILY) {
            switch (sortBy) {
                case 0:
                    CommunityApi communityApi = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    userRankStrainDaystrainAggregate = communityApi.getUserRankStrainDaystrain(teamId, strPrint, teamType.getValue());
                    break;
                case 1:
                    CommunityApi communityApi2 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    userRankStrainDaystrainAggregate = communityApi2.getUserRankStrainActivity(teamId, strPrint, teamType.getValue());
                    break;
                case 2:
                    CommunityApi communityApi3 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    userRankStrainDaystrainAggregate = communityApi3.getUserRankStrainCalories(teamId, strPrint, teamType.getValue());
                    break;
                case 3:
                    CommunityApi communityApi4 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    userRankStrainDaystrainAggregate = communityApi4.getUserRankRecoveryScore(teamId, strPrint, teamType.getValue());
                    break;
                case 4:
                    CommunityApi communityApi5 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    userRankStrainDaystrainAggregate = communityApi5.getUserRankRecoveryHRV(teamId, strPrint, teamType.getValue());
                    break;
                case 5:
                    CommunityApi communityApi6 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    userRankStrainDaystrainAggregate = communityApi6.getUserRankRecoveryRHR(teamId, strPrint, teamType.getValue());
                    break;
                case 6:
                    CommunityApi communityApi7 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    userRankStrainDaystrainAggregate = communityApi7.getUserRankSleepPerformance(teamId, strPrint, teamType.getValue());
                    break;
                case 7:
                    CommunityApi communityApi8 = this.communityApi;
                    AbstractC22676k.m65747g(strPrint);
                    userRankStrainDaystrainAggregate = communityApi8.getUserRankSleepHours(teamId, strPrint, teamType.getValue());
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            switch (sortBy) {
                case 0:
                    CommunityApi communityApi9 = this.communityApi;
                    String strName = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    userRankStrainDaystrainAggregate = communityApi9.getUserRankStrainDaystrainAggregate(teamId, strName, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 1:
                    CommunityApi communityApi10 = this.communityApi;
                    String strName2 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    userRankStrainDaystrainAggregate = communityApi10.getUserRankStrainActivityAggregate(teamId, strName2, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 2:
                    CommunityApi communityApi11 = this.communityApi;
                    String strName3 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    userRankStrainDaystrainAggregate = communityApi11.getUserRankStrainCaloriesAggregate(teamId, strName3, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 3:
                    CommunityApi communityApi12 = this.communityApi;
                    String strName4 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    userRankStrainDaystrainAggregate = communityApi12.getUserRankRecoveryScoreAggregate(teamId, strName4, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 4:
                    CommunityApi communityApi13 = this.communityApi;
                    String strName5 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    userRankStrainDaystrainAggregate = communityApi13.getUserRankRecoveryHrvAggregate(teamId, strName5, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 5:
                    CommunityApi communityApi14 = this.communityApi;
                    String strName6 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    userRankStrainDaystrainAggregate = communityApi14.getUserRankRecoveryRhrAggregate(teamId, strName6, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 6:
                    CommunityApi communityApi15 = this.communityApi;
                    String strName7 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    userRankStrainDaystrainAggregate = communityApi15.getUserRankSleepPerformanceAggregate(teamId, strName7, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                case 7:
                    CommunityApi communityApi16 = this.communityApi;
                    String strName8 = period.name();
                    AbstractC22676k.m65747g(strPrint);
                    AbstractC22676k.m65747g(strPrint2);
                    userRankStrainDaystrainAggregate = communityApi16.getUserRankSleepHoursAggregate(teamId, strName8, strPrint, strPrint2, teamType.getValue(), true, 50);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
        AbstractC18274s.m52648m(userRankStrainDaystrainAggregate).m122665P(C22488a.m64989a().f88182b).m122652B(C40634a.m131874a()).m122661K(new C3374c(new C11058f(c24082eM71000Y, 0), 2));
        return c24082eM71000Y;
    }

    /* JADX INFO: renamed from: d0 */
    public final C38280g<RecordsDto<TeamUser>> m29797d0(int teamId, int offset, int limit, int forUserId, String filterText, int excludeUser) {
        AbstractC22676k.m65750j(filterText, "filterText");
        C38280g<RecordsDto<TeamUser>> c38280gM122682x = AbstractC18274s.m52648m(this.communityApi.searchCommunityMembers(teamId, offset, limit, forUserId, filterText, excludeUser)).m122682x(new C0680g0(new C6494e(offset, 5), 24));
        AbstractC22676k.m65749i(c38280gM122682x, "map(...)");
        return c38280gM122682x;
    }

    /* JADX INFO: renamed from: g0 */
    public final C38280g<List<TeamUser>> m29798g0(int teamId, String text, int offset, int limit) {
        AbstractC22676k.m65750j(text, "text");
        C38280g<List<TeamUser>> c38280gM122682x = AbstractC18274s.m52648m(this.communityApi.searchCommunityUsers(teamId, text, offset, limit)).m122682x(new C0680g0(new C9779c(9), 22));
        AbstractC22676k.m65749i(c38280gM122682x, "map(...)");
        return c38280gM122682x;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j0 */
    public final Object m29799j0(int i13, int i14, int i15, InterfaceC30057d<? super TeamInviteDto> interfaceC30057d) {
        v vVar;
        if (interfaceC30057d instanceof v) {
            vVar = (v) interfaceC30057d;
            int i16 = vVar.f34890F;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                vVar.f34890F = i16 - Integer.MIN_VALUE;
            } else {
                vVar = new v(interfaceC30057d);
            }
        } else {
            vVar = new v(interfaceC30057d);
        }
        Object objCreateInvite = vVar.f34894z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = vVar.f34890F;
        try {
            if (i17 == 0) {
                AbstractC34132o.m107864I(objCreateInvite);
                CommunityApi communityApi = this.communityApi;
                vVar.f34891w = i13;
                vVar.f34892x = i14;
                vVar.f34893y = i15;
                vVar.f34890F = 1;
                objCreateInvite = communityApi.createInvite(i13, i14, i15, vVar);
                if (objCreateInvite == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objCreateInvite);
            }
            C29218v0 c29218v0 = (C29218v0) objCreateInvite;
            if (c29218v0.f118269a.f146788Q) {
                return (TeamInviteDto) c29218v0.f118270b;
            }
            return null;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in sendInvite: ", th3, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m29800k(int i13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        Boolean bool;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f34746G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f34746G = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objAcceptAllInvites = aVar.f34744E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar.f34746G;
        boolean zBooleanValue = false;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objAcceptAllInvites);
                CommunityApi communityApi = this.communityApi;
                aVar.f34747w = i13;
                aVar.f34746G = 1;
                objAcceptAllInvites = communityApi.acceptAllInvites(i13, i13, aVar);
                if (objAcceptAllInvites == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i15 == 1) {
                i13 = aVar.f34747w;
                AbstractC34132o.m107864I(objAcceptAllInvites);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool = (Boolean) aVar.f34749y;
                AbstractC34132o.m107864I(objAcceptAllInvites);
            }
            zBooleanValue = bool.booleanValue();
            return Boolean.valueOf(zBooleanValue);
            boolean z4 = ((C29218v0) objAcceptAllInvites).f118269a.f146788Q;
            Boolean boolValueOf = Boolean.valueOf(z4);
            TeamInviteDao teamInviteDao = this.teamsInviteDao;
            aVar.f34749y = boolValueOf;
            aVar.f34747w = i13;
            aVar.f34750z = z4;
            aVar.f34748x = 0;
            aVar.f34746G = 2;
            if (teamInviteDao.removeAllInvites(aVar) != enumC31071a) {
                bool = boolValueOf;
                zBooleanValue = bool.booleanValue();
                return Boolean.valueOf(zBooleanValue);
            }
            return enumC31071a;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in acceptAllInvites: ", th3, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m29801k0(boolean flag) {
        this.preferenceHelper.putBooleanValueIntoMainPrefs(SharedPreferenceConstants.KEY_COLLAPSE_STATE, flag);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m29802l(int i13, int i14, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        Boolean bool;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i15 = bVar.f34757H;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f34757H = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objAcceptInvite = bVar.f34755F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = bVar.f34757H;
        boolean zBooleanValue = false;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(objAcceptInvite);
                CommunityApi communityApi = this.communityApi;
                bVar.f34758w = i13;
                bVar.f34759x = i14;
                bVar.f34757H = 1;
                objAcceptInvite = communityApi.acceptInvite(i13, i14, bVar);
                if (objAcceptInvite == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i16 == 1) {
                i14 = bVar.f34759x;
                i13 = bVar.f34758w;
                AbstractC34132o.m107864I(objAcceptInvite);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool = (Boolean) bVar.f34761z;
                AbstractC34132o.m107864I(objAcceptInvite);
            }
            zBooleanValue = bool.booleanValue();
            return Boolean.valueOf(zBooleanValue);
            boolean z4 = ((C29218v0) objAcceptInvite).f118269a.f146788Q;
            Boolean boolValueOf = Boolean.valueOf(z4);
            TeamInviteDao teamInviteDao = this.teamsInviteDao;
            bVar.f34761z = boolValueOf;
            bVar.f34758w = i13;
            bVar.f34759x = i14;
            bVar.f34754E = z4;
            bVar.f34760y = 0;
            bVar.f34757H = 2;
            if (teamInviteDao.removeInvite(i13, bVar) != enumC31071a) {
                bool = boolValueOf;
                zBooleanValue = bool.booleanValue();
                return Boolean.valueOf(zBooleanValue);
            }
            return enumC31071a;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in acceptInvite: ", th3, new AbstractC30556a.a[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l0 */
    public final Object m29803l0(int i13, int i14, int i15, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        w wVar;
        boolean z4;
        if (interfaceC30057d instanceof w) {
            wVar = (w) interfaceC30057d;
            int i16 = wVar.f34896F;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                wVar.f34896F = i16 - Integer.MIN_VALUE;
            } else {
                wVar = new w(interfaceC30057d);
            }
        } else {
            wVar = new w(interfaceC30057d);
        }
        Object objTransferCommunityOwnership = wVar.f34900z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = wVar.f34896F;
        try {
            if (i17 == 0) {
                AbstractC34132o.m107864I(objTransferCommunityOwnership);
                CommunityApi communityApi = this.communityApi;
                wVar.f34897w = i13;
                wVar.f34898x = i14;
                wVar.f34899y = i15;
                wVar.f34896F = 1;
                objTransferCommunityOwnership = communityApi.transferCommunityOwnership(i13, i14, i15, wVar);
                if (objTransferCommunityOwnership == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objTransferCommunityOwnership);
            }
            z4 = ((C29218v0) objTransferCommunityOwnership).f118269a.f146788Q;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in transferOwnership: ", th3, new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m29804m(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        boolean z4;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f34773z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f34773z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objJoinCommunityUsingCode = cVar.f34771x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f34773z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objJoinCommunityUsingCode);
                CommunityApi communityApi = this.communityApi;
                cVar.f34770w = null;
                cVar.f34773z = 1;
                objJoinCommunityUsingCode = communityApi.joinCommunityUsingCode(str, cVar);
                if (objJoinCommunityUsingCode == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objJoinCommunityUsingCode);
            }
            z4 = ((C29218v0) objJoinCommunityUsingCode).f118269a.f146788Q;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in acceptInviteCode: ", th3, new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: m0 */
    public final Object m29805m0(boolean z4, List<TeamInviteDto> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new x(z4, list, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n0 */
    public final Object m29806n0(int i13, int i14, Bitmap bitmap, InterfaceC30057d<? super Team> interfaceC30057d) {
        y yVar;
        if (interfaceC30057d instanceof y) {
            yVar = (y) interfaceC30057d;
            int i15 = yVar.f34908H;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                yVar.f34908H = i15 - Integer.MIN_VALUE;
            } else {
                yVar = new y(interfaceC30057d);
            }
        } else {
            yVar = new y(interfaceC30057d);
        }
        Object objUpdateBanner = yVar.f34906F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = yVar.f34908H;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(objUpdateBanner);
                byte[] bArrM29773t = m29773t(bitmap);
                C34844u0 c34844u0 = AbstractC34846v0.Companion;
                C39412p c39412p = C34818h0.f146589e;
                C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J("image/*");
                int length = bArrM29773t.length;
                c34844u0.getClass();
                C34820i0 c34820i0M96963o = AbstractC31484o.m96963o("file", "banner.png", C34844u0.m109926c(c34818h0M5373J, bArrM29773t, 0, length));
                CommunityApi communityApi = this.communityApi;
                yVar.f34911y = null;
                yVar.f34912z = null;
                yVar.f34905E = null;
                yVar.f34909w = i13;
                yVar.f34910x = i14;
                yVar.f34908H = 1;
                objUpdateBanner = communityApi.updateBanner(c34820i0M96963o, i13, i14, yVar);
                if (objUpdateBanner == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objUpdateBanner);
            }
            CommunityDto communityDto = (CommunityDto) ((C29218v0) objUpdateBanner).f118270b;
            if (communityDto != null) {
                return communityDto.toTeam();
            }
            return null;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in updateBanner: ", th3, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final Object m29807o0(FeatureTeam featureTeam, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new z(featureTeam, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p0 */
    public final Object m29808p0(TeamInviteDto teamInviteDto, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new a0(teamInviteDto, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public final Object m29809q(String str, String str2, int i13, boolean z4, boolean z13, boolean z14, String str3, String str4, Bitmap bitmap, Bitmap bitmap2, InterfaceC30057d<? super CommunityDto> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new d(bitmap, bitmap2, this, str3, str4, str, str2, z4, z13, z14, i13, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q0 */
    public final Object m29810q0(int i13, int i14, Bitmap bitmap, InterfaceC30057d<? super Team> interfaceC30057d) {
        b0 b0Var;
        if (interfaceC30057d instanceof b0) {
            b0Var = (b0) interfaceC30057d;
            int i15 = b0Var.f34765H;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                b0Var.f34765H = i15 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(interfaceC30057d);
            }
        } else {
            b0Var = new b0(interfaceC30057d);
        }
        Object objUpdateLogo = b0Var.f34763F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = b0Var.f34765H;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(objUpdateLogo);
                byte[] bArrM29773t = m29773t(bitmap);
                C34844u0 c34844u0 = AbstractC34846v0.Companion;
                C39412p c39412p = C34818h0.f146589e;
                C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J("image/*");
                int length = bArrM29773t.length;
                c34844u0.getClass();
                C34820i0 c34820i0M96963o = AbstractC31484o.m96963o("file", "logo.png", C34844u0.m109926c(c34818h0M5373J, bArrM29773t, 0, length));
                CommunityApi communityApi = this.communityApi;
                b0Var.f34768y = null;
                b0Var.f34769z = null;
                b0Var.f34762E = null;
                b0Var.f34766w = i13;
                b0Var.f34767x = i14;
                b0Var.f34765H = 1;
                objUpdateLogo = communityApi.updateLogo(c34820i0M96963o, i13, i14, b0Var);
                if (objUpdateLogo == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objUpdateLogo);
            }
            CommunityDto communityDto = (CommunityDto) ((C29218v0) objUpdateLogo).f118270b;
            if (communityDto != null) {
                return communityDto.toTeam();
            }
            return null;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in updateLogo: ", th3, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m29811r(int i13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        Boolean bool;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i14 = eVar.f34799G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f34799G = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objDeclineAllInvites = eVar.f34797E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = eVar.f34799G;
        boolean zBooleanValue = false;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objDeclineAllInvites);
                CommunityApi communityApi = this.communityApi;
                eVar.f34800w = i13;
                eVar.f34799G = 1;
                objDeclineAllInvites = communityApi.declineAllInvites(i13, i13, eVar);
                if (objDeclineAllInvites == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i15 == 1) {
                i13 = eVar.f34800w;
                AbstractC34132o.m107864I(objDeclineAllInvites);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool = (Boolean) eVar.f34802y;
                AbstractC34132o.m107864I(objDeclineAllInvites);
            }
            zBooleanValue = bool.booleanValue();
            return Boolean.valueOf(zBooleanValue);
            boolean z4 = ((C29218v0) objDeclineAllInvites).f118269a.f146788Q;
            Boolean boolValueOf = Boolean.valueOf(z4);
            TeamInviteDao teamInviteDao = this.teamsInviteDao;
            eVar.f34802y = boolValueOf;
            eVar.f34800w = i13;
            eVar.f34803z = z4;
            eVar.f34801x = 0;
            eVar.f34799G = 2;
            if (teamInviteDao.removeAllInvites(eVar) != enumC31071a) {
                bool = boolValueOf;
                zBooleanValue = bool.booleanValue();
                return Boolean.valueOf(zBooleanValue);
            }
            return enumC31071a;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in declineAllInvites: ", th3, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final Object m29812r0(Team team, int i13, InterfaceC30057d<? super Team> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new c0(team.toCommunityDto(), team, i13, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : (Team) objM8705K;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m29813s(int i13, int i14, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        f fVar;
        Boolean bool;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i15 = fVar.f34811H;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f34811H = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objDeclineInvite = fVar.f34809F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = fVar.f34811H;
        boolean zBooleanValue = false;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(objDeclineInvite);
                CommunityApi communityApi = this.communityApi;
                fVar.f34812w = i13;
                fVar.f34813x = i14;
                fVar.f34811H = 1;
                objDeclineInvite = communityApi.declineInvite(i13, i14, fVar);
                if (objDeclineInvite == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i16 == 1) {
                i14 = fVar.f34813x;
                i13 = fVar.f34812w;
                AbstractC34132o.m107864I(objDeclineInvite);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool = (Boolean) fVar.f34815z;
                AbstractC34132o.m107864I(objDeclineInvite);
            }
            zBooleanValue = bool.booleanValue();
            return Boolean.valueOf(zBooleanValue);
            boolean z4 = ((C29218v0) objDeclineInvite).f118269a.f146788Q;
            Boolean boolValueOf = Boolean.valueOf(z4);
            TeamInviteDao teamInviteDao = this.teamsInviteDao;
            fVar.f34815z = boolValueOf;
            fVar.f34812w = i13;
            fVar.f34813x = i14;
            fVar.f34808E = z4;
            fVar.f34814y = 0;
            fVar.f34811H = 2;
            if (teamInviteDao.removeInvite(i13, fVar) != enumC31071a) {
                bool = boolValueOf;
                zBooleanValue = bool.booleanValue();
                return Boolean.valueOf(zBooleanValue);
            }
            return enumC31071a;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in declineInvite: ", th3, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final Object m29814s0(int i13, boolean z4, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new d0(i13, z4, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: t0 */
    public final Object m29815t0(int i13, boolean z4, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new e0(i13, z4, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final ChatApi getChatApi() {
        return this.chatApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u0 */
    public final Object m29817u0(int i13, int i14, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        f0 f0Var;
        boolean z4;
        if (interfaceC30057d instanceof f0) {
            f0Var = (f0) interfaceC30057d;
            int i15 = f0Var.f34816E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                f0Var.f34816E = i15 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(interfaceC30057d);
            }
        } else {
            f0Var = new f0(interfaceC30057d);
        }
        Object objWithdrawInvite = f0Var.f34819y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = f0Var.f34816E;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(objWithdrawInvite);
                CommunityApi communityApi = this.communityApi;
                f0Var.f34817w = i13;
                f0Var.f34818x = i14;
                f0Var.f34816E = 1;
                objWithdrawInvite = communityApi.withdrawInvite(i13, i14, f0Var);
                if (objWithdrawInvite == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objWithdrawInvite);
            }
            z4 = ((C29218v0) objWithdrawInvite).f118269a.f146788Q;
        } catch (Throwable th3) {
            this.logger.mo85230v("Error in withdrawInvite: ", th3, new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: v */
    public final Object m29818v(InterfaceC30057d<? super Resource<C3545a>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new g(null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: w */
    public final Object m29819w(int i13, int i14, TeamType teamType, InterfaceC30057d<? super Team> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new h(i13, i14, teamType, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m29820x(String str, InterfaceC30057d<? super Resource<Team>> interfaceC30057d) {
        i iVar;
        DomainException.InterfaceC9606b interfaceC9606b;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f34831z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f34831z = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object communityByInviteCode = iVar.f34829x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f34831z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(communityByInviteCode);
                CommunityApi communityApi = this.communityApi;
                iVar.f34828w = null;
                iVar.f34831z = 1;
                communityByInviteCode = communityApi.getCommunityByInviteCode(str, iVar);
                if (communityByInviteCode == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(communityByInviteCode);
            }
            C29218v0 c29218v0 = (C29218v0) communityByInviteCode;
            C34850x0 c34850x0 = c29218v0.f118269a;
            if (c34850x0.f146788Q) {
                Resource.Companion companion = Resource.INSTANCE;
                Object obj = c29218v0.f118270b;
                AbstractC22676k.m65747g(obj);
                return companion.success(((CommunityDto) obj).toTeam());
            }
            int i15 = c34850x0.f146792z;
            if (i15 == 401) {
                interfaceC9606b = DomainException.EnumC9607c.AUTHORIZATION_ERROR;
            } else if (i15 != 404) {
                interfaceC9606b = i15 != 500 ? DomainException.EnumC9607c.NETWORK_ERROR : DomainException.EnumC9607c.INTERNAL_ERROR;
            } else {
                interfaceC9606b = InviteCodeException.EnumC8700a.COMMUNITY_CODE_NOT_VALID;
            }
            return Resource.Companion.error$default(Resource.INSTANCE, "Error", null, null, new DomainException(interfaceC9606b, null, 2, null), 6, null);
        } catch (HttpException e5) {
            Resource.Companion companion2 = Resource.INSTANCE;
            String str2 = e5.f128921x;
            AbstractC22676k.m65749i(str2, "message(...)");
            return Resource.Companion.error$default(companion2, str2, null, null, new DomainException(DomainException.EnumC9607c.HTTP_ERROR, null, 2, null), 6, null);
        } catch (Exception e13) {
            return Resource.Companion.error$default(Resource.INSTANCE, AbstractC11266d.m30461o("errorMessage: ", e13.getMessage()), null, null, new DomainException(DomainException.EnumC9607c.UNKNOWN, null, 2, null), 6, null);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final CommunityApi getCommunityApi() {
        return this.communityApi;
    }

    /* JADX INFO: renamed from: z */
    public final Object m29822z(int i13, int i14, TeamType teamType, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new j(i13, i14, teamType, null), interfaceC30057d);
    }
}

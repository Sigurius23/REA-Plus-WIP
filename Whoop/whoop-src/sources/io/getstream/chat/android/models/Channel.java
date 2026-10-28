package io.getstream.chat.android.models;

import androidx.profileinstaller.ProfileVerifier;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b?\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002¤\u0001BÁ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0014\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010+\u001a\u00020\u000b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0014\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\r\u0012\u0014\b\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020706¢\u0006\u0004\b8\u00109J\u0016\u0010v\u001a\b\u0012\u0002\b\u0003\u0018\u00010w2\u0006\u0010x\u001a\u00020\u0004H\u0016J\b\u0010y\u001a\u00020zH\u0007J\t\u0010{\u001a\u00020\u0004HÆ\u0003J\t\u0010|\u001a\u00020\u0004HÆ\u0003J\t\u0010}\u001a\u00020\u0004HÆ\u0003J\t\u0010~\u001a\u00020\u0004HÆ\u0003J\t\u0010\u007f\u001a\u00020\tHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\tHÆ\u0003J\u0010\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u0010\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003J\u0010\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014HÆ\u0003J\u0010\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\tHÆ\u0003J\u0010\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u0014HÆ\u0003J\u0010\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u0010\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040(HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\u0010\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020/0\u0014HÆ\u0003J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010gJ\f\u0010\u009a\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\u0010\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0016\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020706HÆ\u0003JÊ\u0003\u0010\u009e\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010#\u001a\u00020\t2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00142\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010+\u001a\u00020\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00142\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\n\b\u0002\u00104\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020706HÆ\u0001¢\u0006\u0003\u0010\u009f\u0001J\u0015\u0010 \u0001\u001a\u00020\u000b2\t\u0010¡\u0001\u001a\u0004\u0018\u000107HÖ\u0003J\n\u0010¢\u0001\u001a\u00020\tHÖ\u0001J\n\u0010£\u0001\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010;R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bF\u0010DR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bI\u0010@R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\b\n\u0000\u001a\u0004\bM\u0010KR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014¢\u0006\b\n\u0000\u001a\u0004\bN\u0010KR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010\u001e\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u001c\u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010T\u001a\u0004\bU\u0010@R\u0011\u0010 \u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010;R\u0015\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bW\u0010XR\u0013\u0010\"\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010DR\u0011\u0010#\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b[\u0010@R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010KR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b]\u0010KR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0013\u0010)\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\bb\u0010KR\u0011\u0010+\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010BR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0014¢\u0006\b\n\u0000\u001a\u0004\be\u0010KR\u0015\u00100\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010h\u001a\u0004\bf\u0010gR\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\b\n\u0000\u001a\u0004\bk\u0010KR\u0013\u00104\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bl\u0010DR \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020706X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0011\u0010o\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bp\u0010;R\u0013\u0010q\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\br\u0010DR\u001a\u0010s\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bt\u0010T\u001a\u0004\bu\u0010B¨\u0006¥\u0001"}, m65681d2 = {"Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "id", "", "type", "name", "image", "watcherCount", "", "frozen", "", "createdAt", "Ljava/util/Date;", "deletedAt", "updatedAt", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "memberCount", "messages", "", "Lio/getstream/chat/android/models/Message;", QueryChannelRequest.KEY_MEMBERS, "Lio/getstream/chat/android/models/Member;", "watchers", "Lio/getstream/chat/android/models/User;", "read", "Lio/getstream/chat/android/models/ChannelUserRead;", "config", "Lio/getstream/chat/android/models/Config;", "createdBy", "unreadCount", "team", "hidden", "hiddenMessagesBefore", "cooldown", "pendingMessages", "Lio/getstream/chat/android/models/PendingMessage;", "pinnedMessages", "ownCapabilities", "", "membership", "cachedLatestMessages", "isInsideSearch", "draftMessage", "Lio/getstream/chat/android/models/DraftMessage;", "activeLiveLocations", "Lio/getstream/chat/android/models/Location;", "messageCount", "pushPreference", "Lio/getstream/chat/android/models/PushPreference;", "filterTags", "lastMessageAt", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getType", "getName", "getImage", "getWatcherCount", "()I", "getFrozen", "()Z", "getCreatedAt", "()Ljava/util/Date;", "getDeletedAt", "getUpdatedAt", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "getMemberCount", "getMessages", "()Ljava/util/List;", "getMembers", "getWatchers", "getRead", "getConfig", "()Lio/getstream/chat/android/models/Config;", "getCreatedBy", "()Lio/getstream/chat/android/models/User;", "getUnreadCount$annotations", "()V", "getUnreadCount", "getTeam", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHiddenMessagesBefore", "getCooldown", "getPendingMessages", "getPinnedMessages", "getOwnCapabilities", "()Ljava/util/Set;", "getMembership", "()Lio/getstream/chat/android/models/Member;", "getCachedLatestMessages", "getDraftMessage", "()Lio/getstream/chat/android/models/DraftMessage;", "getActiveLiveLocations", "getMessageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPushPreference", "()Lio/getstream/chat/android/models/PushPreference;", "getFilterTags", "getLastMessageAt", "getExtraData", "()Ljava/util/Map;", "cid", "getCid", "lastUpdated", "getLastUpdated", "hasUnread", "getHasUnread$annotations", "getHasUnread", "getComparableField", "", "fieldName", "newBuilder", "Lio/getstream/chat/android/models/Channel$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/models/Channel;", "equals", "other", "hashCode", "toString", "Builder", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Channel implements CustomObject, ComparableFieldProvider {
    private final List<Location> activeLiveLocations;
    private final List<Message> cachedLatestMessages;
    private final Config config;
    private final int cooldown;
    private final Date createdAt;
    private final User createdBy;
    private final Date deletedAt;
    private final DraftMessage draftMessage;
    private final Map<String, Object> extraData;
    private final List<String> filterTags;
    private final boolean frozen;
    private final Boolean hidden;
    private final Date hiddenMessagesBefore;
    private final String id;
    private final String image;
    private final boolean isInsideSearch;
    private final Date lastMessageAt;
    private final int memberCount;
    private final List<Member> members;
    private final Member membership;
    private final Integer messageCount;
    private final List<Message> messages;
    private final String name;
    private final Set<String> ownCapabilities;
    private final List<PendingMessage> pendingMessages;
    private final List<Message> pinnedMessages;
    private final PushPreference pushPreference;
    private final List<ChannelUserRead> read;
    private final SyncStatus syncStatus;
    private final String team;
    private final String type;
    private final int unreadCount;
    private final Date updatedAt;
    private final int watcherCount;
    private final List<User> watchers;

    public Channel() {
        this(null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -1, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Channel copy$default(Channel channel, String str, String str2, String str3, String str4, int i13, boolean z4, Date date, Date date2, Date date3, SyncStatus syncStatus, int i14, List list, List list2, List list3, List list4, Config config, User user, int i15, String str5, Boolean bool, Date date4, int i16, List list5, List list6, Set set, Member member, List list7, boolean z13, DraftMessage draftMessage, List list8, Integer num, PushPreference pushPreference, List list9, Date date5, Map map, int i17, int i18, Object obj) {
        Map map2;
        Date date6;
        String str6 = (i17 & 1) != 0 ? channel.id : str;
        String str7 = (i17 & 2) != 0 ? channel.type : str2;
        String str8 = (i17 & 4) != 0 ? channel.name : str3;
        String str9 = (i17 & 8) != 0 ? channel.image : str4;
        int i19 = (i17 & 16) != 0 ? channel.watcherCount : i13;
        boolean z14 = (i17 & 32) != 0 ? channel.frozen : z4;
        Date date7 = (i17 & 64) != 0 ? channel.createdAt : date;
        Date date8 = (i17 & 128) != 0 ? channel.deletedAt : date2;
        Date date9 = (i17 & 256) != 0 ? channel.updatedAt : date3;
        SyncStatus syncStatus2 = (i17 & 512) != 0 ? channel.syncStatus : syncStatus;
        int i24 = (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? channel.memberCount : i14;
        List list10 = (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? channel.messages : list;
        List list11 = (i17 & 4096) != 0 ? channel.members : list2;
        List list12 = (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? channel.watchers : list3;
        String str10 = str6;
        List list13 = (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? channel.read : list4;
        Config config2 = (i17 & 32768) != 0 ? channel.config : config;
        User user2 = (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? channel.createdBy : user;
        int i25 = (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? channel.unreadCount : i15;
        String str11 = (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? channel.team : str5;
        Boolean bool2 = (i17 & 524288) != 0 ? channel.hidden : bool;
        Date date10 = (i17 & 1048576) != 0 ? channel.hiddenMessagesBefore : date4;
        int i26 = (i17 & 2097152) != 0 ? channel.cooldown : i16;
        List list14 = (i17 & 4194304) != 0 ? channel.pendingMessages : list5;
        List list15 = (i17 & 8388608) != 0 ? channel.pinnedMessages : list6;
        Set set2 = (i17 & 16777216) != 0 ? channel.ownCapabilities : set;
        Member member2 = (i17 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? channel.membership : member;
        List list16 = (i17 & 67108864) != 0 ? channel.cachedLatestMessages : list7;
        boolean z15 = (i17 & 134217728) != 0 ? channel.isInsideSearch : z13;
        DraftMessage draftMessage2 = (i17 & 268435456) != 0 ? channel.draftMessage : draftMessage;
        List list17 = (i17 & 536870912) != 0 ? channel.activeLiveLocations : list8;
        Integer num2 = (i17 & 1073741824) != 0 ? channel.messageCount : num;
        PushPreference pushPreference2 = (i17 & Integer.MIN_VALUE) != 0 ? channel.pushPreference : pushPreference;
        List list18 = (i18 & 1) != 0 ? channel.filterTags : list9;
        Date date11 = (i18 & 2) != 0 ? channel.lastMessageAt : date5;
        if ((i18 & 4) != 0) {
            date6 = date11;
            map2 = channel.extraData;
        } else {
            map2 = map;
            date6 = date11;
        }
        return channel.copy(str10, str7, str8, str9, i19, z14, date7, date8, date9, syncStatus2, i24, list10, list11, list12, list13, config2, user2, i25, str11, bool2, date10, i26, list14, list15, set2, member2, list16, z15, draftMessage2, list17, num2, pushPreference2, list18, date6, map2);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getHasUnread$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getUnreadCount$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    public final List<Message> component12() {
        return this.messages;
    }

    public final List<Member> component13() {
        return this.members;
    }

    public final List<User> component14() {
        return this.watchers;
    }

    public final List<ChannelUserRead> component15() {
        return this.read;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final User getCreatedBy() {
        return this.createdBy;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Date getHiddenMessagesBefore() {
        return this.hiddenMessagesBefore;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getCooldown() {
        return this.cooldown;
    }

    public final List<PendingMessage> component23() {
        return this.pendingMessages;
    }

    public final List<Message> component24() {
        return this.pinnedMessages;
    }

    public final Set<String> component25() {
        return this.ownCapabilities;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Member getMembership() {
        return this.membership;
    }

    public final List<Message> component27() {
        return this.cachedLatestMessages;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getIsInsideSearch() {
        return this.isInsideSearch;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final DraftMessage getDraftMessage() {
        return this.draftMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<Location> component30() {
        return this.activeLiveLocations;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Integer getMessageCount() {
        return this.messageCount;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final PushPreference getPushPreference() {
        return this.pushPreference;
    }

    public final List<String> component33() {
        return this.filterTags;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final Map<String, Object> component35() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWatcherCount() {
        return this.watcherCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getFrozen() {
        return this.frozen;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final Channel copy(String id4, String type, String name, String image, int watcherCount, boolean frozen, Date createdAt, Date deletedAt, Date updatedAt, SyncStatus syncStatus, int memberCount, List<Message> messages, List<Member> members, List<User> watchers, List<ChannelUserRead> read, Config config, User createdBy, int unreadCount, String team, Boolean hidden, Date hiddenMessagesBefore, int cooldown, List<PendingMessage> pendingMessages, List<Message> pinnedMessages, Set<String> ownCapabilities, Member membership, List<Message> cachedLatestMessages, boolean isInsideSearch, DraftMessage draftMessage, List<Location> activeLiveLocations, Integer messageCount, PushPreference pushPreference, List<String> filterTags, Date lastMessageAt, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(watchers, "watchers");
        AbstractC22676k.m65750j(read, "read");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(createdBy, "createdBy");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(pendingMessages, "pendingMessages");
        AbstractC22676k.m65750j(pinnedMessages, "pinnedMessages");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(cachedLatestMessages, "cachedLatestMessages");
        AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
        AbstractC22676k.m65750j(filterTags, "filterTags");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new Channel(id4, type, name, image, watcherCount, frozen, createdAt, deletedAt, updatedAt, syncStatus, memberCount, messages, members, watchers, read, config, createdBy, unreadCount, team, hidden, hiddenMessagesBefore, cooldown, pendingMessages, pinnedMessages, ownCapabilities, membership, cachedLatestMessages, isInsideSearch, draftMessage, activeLiveLocations, messageCount, pushPreference, filterTags, lastMessageAt, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) other;
        return AbstractC22676k.m65745e(this.id, channel.id) && AbstractC22676k.m65745e(this.type, channel.type) && AbstractC22676k.m65745e(this.name, channel.name) && AbstractC22676k.m65745e(this.image, channel.image) && this.watcherCount == channel.watcherCount && this.frozen == channel.frozen && AbstractC22676k.m65745e(this.createdAt, channel.createdAt) && AbstractC22676k.m65745e(this.deletedAt, channel.deletedAt) && AbstractC22676k.m65745e(this.updatedAt, channel.updatedAt) && this.syncStatus == channel.syncStatus && this.memberCount == channel.memberCount && AbstractC22676k.m65745e(this.messages, channel.messages) && AbstractC22676k.m65745e(this.members, channel.members) && AbstractC22676k.m65745e(this.watchers, channel.watchers) && AbstractC22676k.m65745e(this.read, channel.read) && AbstractC22676k.m65745e(this.config, channel.config) && AbstractC22676k.m65745e(this.createdBy, channel.createdBy) && this.unreadCount == channel.unreadCount && AbstractC22676k.m65745e(this.team, channel.team) && AbstractC22676k.m65745e(this.hidden, channel.hidden) && AbstractC22676k.m65745e(this.hiddenMessagesBefore, channel.hiddenMessagesBefore) && this.cooldown == channel.cooldown && AbstractC22676k.m65745e(this.pendingMessages, channel.pendingMessages) && AbstractC22676k.m65745e(this.pinnedMessages, channel.pinnedMessages) && AbstractC22676k.m65745e(this.ownCapabilities, channel.ownCapabilities) && AbstractC22676k.m65745e(this.membership, channel.membership) && AbstractC22676k.m65745e(this.cachedLatestMessages, channel.cachedLatestMessages) && this.isInsideSearch == channel.isInsideSearch && AbstractC22676k.m65745e(this.draftMessage, channel.draftMessage) && AbstractC22676k.m65745e(this.activeLiveLocations, channel.activeLiveLocations) && AbstractC22676k.m65745e(this.messageCount, channel.messageCount) && AbstractC22676k.m65745e(this.pushPreference, channel.pushPreference) && AbstractC22676k.m65745e(this.filterTags, channel.filterTags) && AbstractC22676k.m65745e(this.lastMessageAt, channel.lastMessageAt) && AbstractC22676k.m65745e(this.extraData, channel.extraData);
    }

    public final List<Location> getActiveLiveLocations() {
        return this.activeLiveLocations;
    }

    public final List<Message> getCachedLatestMessages() {
        return this.cachedLatestMessages;
    }

    public final String getCid() {
        return (this.id.length() == 0 || this.type.length() == 0) ? "" : AbstractC18489d0.m53370k(this.type, ":", this.id);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a9 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012c, code lost:
    
        if (r3.equals("pinnedAt") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0130, code lost:
    
        r3 = r2.membership;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0132, code lost:
    
        if (r3 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0138, code lost:
    
        return r3.getPinnedAt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0139, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0150, code lost:
    
        if (r3.equals("watcherCount") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0159, code lost:
    
        return java.lang.Integer.valueOf(r2.watcherCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0160, code lost:
    
        if (r3.equals("unreadCount") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0169, code lost:
    
        return java.lang.Integer.valueOf(r2.unreadCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r3.equals("lastUpdated") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x018c, code lost:
    
        if (r3.equals("updatedAt") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0191, code lost:
    
        return r2.updatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0198, code lost:
    
        if (r3.equals("has_unread") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b2, code lost:
    
        return java.lang.Boolean.valueOf(getHasUnread());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r3.equals("created_at") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r3.equals("memberCount") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3.equals("lastMessageAt") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r3.equals("archived_at") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r3.equals("watcher_count") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r3.equals("createdAt") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        return r2.createdAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r3.equals("last_updated") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        return getLastUpdated();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cf, code lost:
    
        if (r3.equals("member_count") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r3.equals("unread_count") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d9, code lost:
    
        return java.lang.Integer.valueOf(r2.memberCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r3.equals("last_message_at") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e6, code lost:
    
        return r2.lastMessageAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ed, code lost:
    
        if (r3.equals("archivedAt") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f1, code lost:
    
        r3 = r2.membership;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f3, code lost:
    
        if (r3 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f9, code lost:
    
        return r3.getArchivedAt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fa, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0101, code lost:
    
        if (r3.equals("pinned_at") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010b, code lost:
    
        if (r3.equals("hasUnread") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0115, code lost:
    
        if (r3.equals("updated_at") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011f, code lost:
    
        if (r3.equals("deletedAt") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0125, code lost:
    
        return r2.deletedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r3.equals("deleted_at") == false) goto L140;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Comparable<?> getComparableField(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.models.Channel.getComparableField(java.lang.String):java.lang.Comparable");
    }

    public final Config getConfig() {
        return this.config;
    }

    public final int getCooldown() {
        return this.cooldown;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final User getCreatedBy() {
        return this.createdBy;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final DraftMessage getDraftMessage() {
        return this.draftMessage;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
    }

    public final List<String> getFilterTags() {
        return this.filterTags;
    }

    public final boolean getFrozen() {
        return this.frozen;
    }

    public final boolean getHasUnread() {
        return this.unreadCount > 0;
    }

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final Date getHiddenMessagesBefore() {
        return this.hiddenMessagesBefore;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final Date getLastUpdated() {
        Date date = this.lastMessageAt;
        if (date != null) {
            Date date2 = this.createdAt;
            if (date2 != null && !date.after(date2)) {
                date = null;
            }
            if (date != null) {
                return date;
            }
        }
        return this.createdAt;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final List<Member> getMembers() {
        return this.members;
    }

    public final Member getMembership() {
        return this.membership;
    }

    public final Integer getMessageCount() {
        return this.messageCount;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public final String getName() {
        return this.name;
    }

    public final Set<String> getOwnCapabilities() {
        return this.ownCapabilities;
    }

    public final List<PendingMessage> getPendingMessages() {
        return this.pendingMessages;
    }

    public final List<Message> getPinnedMessages() {
        return this.pinnedMessages;
    }

    public final PushPreference getPushPreference() {
        return this.pushPreference;
    }

    public final List<ChannelUserRead> getRead() {
        return this.read;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final String getTeam() {
        return this.team;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getWatcherCount() {
        return this.watcherCount;
    }

    public final List<User> getWatchers() {
        return this.watchers;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.watcherCount, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.type), 31, this.name), 31, this.image), 31), 31, this.frozen);
        Date date = this.createdAt;
        int iHashCode = (iM8289b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.deletedAt;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.updatedAt;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.unreadCount, AbstractC11478a.m30850b(this.createdBy, (this.config.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.memberCount, (this.syncStatus.hashCode() + ((iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31)) * 31, 31), 31, this.messages), 31, this.members), 31, this.watchers), 31, this.read)) * 31, 31), 31), 31, this.team);
        Boolean bool = this.hidden;
        int iHashCode3 = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date4 = this.hiddenMessagesBefore;
        int iM73368a = AbstractC25012a.m73368a(this.ownCapabilities, AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.cooldown, (iHashCode3 + (date4 == null ? 0 : date4.hashCode())) * 31, 31), 31, this.pendingMessages), 31, this.pinnedMessages), 31);
        Member member = this.membership;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC11895b.m31983b((iM73368a + (member == null ? 0 : member.hashCode())) * 31, 31, this.cachedLatestMessages), 31, this.isInsideSearch);
        DraftMessage draftMessage = this.draftMessage;
        int iM31983b = AbstractC11895b.m31983b((iM8289b2 + (draftMessage == null ? 0 : draftMessage.hashCode())) * 31, 31, this.activeLiveLocations);
        Integer num = this.messageCount;
        int iHashCode4 = (iM31983b + (num == null ? 0 : num.hashCode())) * 31;
        PushPreference pushPreference = this.pushPreference;
        int iM31983b2 = AbstractC11895b.m31983b((iHashCode4 + (pushPreference == null ? 0 : pushPreference.hashCode())) * 31, 31, this.filterTags);
        Date date5 = this.lastMessageAt;
        return this.extraData.hashCode() + ((iM31983b2 + (date5 != null ? date5.hashCode() : 0)) * 31);
    }

    public final boolean isInsideSearch() {
        return this.isInsideSearch;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.name;
        String str4 = this.image;
        int i13 = this.watcherCount;
        boolean z4 = this.frozen;
        Date date = this.createdAt;
        Date date2 = this.deletedAt;
        Date date3 = this.updatedAt;
        SyncStatus syncStatus = this.syncStatus;
        int i14 = this.memberCount;
        List<Message> list = this.messages;
        List<Member> list2 = this.members;
        List<User> list3 = this.watchers;
        List<ChannelUserRead> list4 = this.read;
        Config config = this.config;
        User user = this.createdBy;
        int i15 = this.unreadCount;
        String str5 = this.team;
        Boolean bool = this.hidden;
        Date date4 = this.hiddenMessagesBefore;
        int i16 = this.cooldown;
        List<PendingMessage> list5 = this.pendingMessages;
        List<Message> list6 = this.pinnedMessages;
        Set<String> set = this.ownCapabilities;
        Member member = this.membership;
        List<Message> list7 = this.cachedLatestMessages;
        boolean z13 = this.isInsideSearch;
        DraftMessage draftMessage = this.draftMessage;
        List<Location> list8 = this.activeLiveLocations;
        Integer num = this.messageCount;
        PushPreference pushPreference = this.pushPreference;
        List<String> list9 = this.filterTags;
        Date date5 = this.lastMessageAt;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Channel(id=", str, ", type=", str2, ", name=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", image=", str4, ", watcherCount=");
        AbstractC13673n.m38573t(i13, ", frozen=", ", createdAt=", sbM32001t, z4);
        AbstractC17176i.m48512n(sbM32001t, date, ", deletedAt=", date2, ", updatedAt=");
        sbM32001t.append(date3);
        sbM32001t.append(", syncStatus=");
        sbM32001t.append(syncStatus);
        sbM32001t.append(", memberCount=");
        sbM32001t.append(i14);
        sbM32001t.append(", messages=");
        sbM32001t.append(list);
        sbM32001t.append(", members=");
        AbstractC21702c.m61148s(sbM32001t, list2, ", watchers=", list3, ", read=");
        sbM32001t.append(list4);
        sbM32001t.append(", config=");
        sbM32001t.append(config);
        sbM32001t.append(", createdBy=");
        sbM32001t.append(user);
        sbM32001t.append(", unreadCount=");
        sbM32001t.append(i15);
        sbM32001t.append(", team=");
        AbstractC36095b.m114692t(bool, str5, ", hidden=", ", hiddenMessagesBefore=", sbM32001t);
        sbM32001t.append(date4);
        sbM32001t.append(", cooldown=");
        sbM32001t.append(i16);
        sbM32001t.append(", pendingMessages=");
        AbstractC21702c.m61148s(sbM32001t, list5, ", pinnedMessages=", list6, ", ownCapabilities=");
        sbM32001t.append(set);
        sbM32001t.append(", membership=");
        sbM32001t.append(member);
        sbM32001t.append(", cachedLatestMessages=");
        AbstractC26725a.m79512p(", isInsideSearch=", ", draftMessage=", sbM32001t, list7, z13);
        sbM32001t.append(draftMessage);
        sbM32001t.append(", activeLiveLocations=");
        sbM32001t.append(list8);
        sbM32001t.append(", messageCount=");
        sbM32001t.append(num);
        sbM32001t.append(", pushPreference=");
        sbM32001t.append(pushPreference);
        sbM32001t.append(", filterTags=");
        sbM32001t.append(list9);
        sbM32001t.append(", lastMessageAt=");
        sbM32001t.append(date5);
        sbM32001t.append(", extraData=");
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    public Channel(String id4, String type, String name, String image, int i13, boolean z4, Date date, Date date2, Date date3, SyncStatus syncStatus, int i14, List<Message> messages, List<Member> members, List<User> watchers, List<ChannelUserRead> read, Config config, User createdBy, int i15, String team, Boolean bool, Date date4, int i16, List<PendingMessage> pendingMessages, List<Message> pinnedMessages, Set<String> ownCapabilities, Member member, List<Message> cachedLatestMessages, boolean z13, DraftMessage draftMessage, List<Location> activeLiveLocations, Integer num, PushPreference pushPreference, List<String> filterTags, Date date5, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(watchers, "watchers");
        AbstractC22676k.m65750j(read, "read");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(createdBy, "createdBy");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(pendingMessages, "pendingMessages");
        AbstractC22676k.m65750j(pinnedMessages, "pinnedMessages");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(cachedLatestMessages, "cachedLatestMessages");
        AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
        AbstractC22676k.m65750j(filterTags, "filterTags");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.type = type;
        this.name = name;
        this.image = image;
        this.watcherCount = i13;
        this.frozen = z4;
        this.createdAt = date;
        this.deletedAt = date2;
        this.updatedAt = date3;
        this.syncStatus = syncStatus;
        this.memberCount = i14;
        this.messages = messages;
        this.members = members;
        this.watchers = watchers;
        this.read = read;
        this.config = config;
        this.createdBy = createdBy;
        this.unreadCount = i15;
        this.team = team;
        this.hidden = bool;
        this.hiddenMessagesBefore = date4;
        this.cooldown = i16;
        this.pendingMessages = pendingMessages;
        this.pinnedMessages = pinnedMessages;
        this.ownCapabilities = ownCapabilities;
        this.membership = member;
        this.cachedLatestMessages = cachedLatestMessages;
        this.isInsideSearch = z13;
        this.draftMessage = draftMessage;
        this.activeLiveLocations = activeLiveLocations;
        this.messageCount = num;
        this.pushPreference = pushPreference;
        this.filterTags = filterTags;
        this.lastMessageAt = date5;
        this.extraData = extraData;
    }

    @Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010?\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010@\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010A\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010B\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010C\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rJ\u0014\u0010F\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0014\u0010G\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018J\u0014\u0010H\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018J\u0014\u0010I\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001dJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\rJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\bJ\u0015\u0010N\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010OJ\u0010\u0010P\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0011J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\rJ\u0014\u0010R\u001a\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0014\u0010S\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+J\u0010\u0010T\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u001bJ\u0014\u0010U\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000fJ\u0010\u0010W\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u000100J\u0014\u0010Y\u001a\u00020\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0018J\u0015\u0010Z\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010[J\u0010\u0010\\\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000106J\u0014\u0010]\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J\u0010\u0010^\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u00010\u0011J\u001a\u0010_\u001a\u00020\u00002\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010:J\u0006\u0010`\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006a"}, m65681d2 = {"Lio/getstream/chat/android/models/Channel$Builder;", "", "<init>", "()V", "channel", "Lio/getstream/chat/android/models/Channel;", "(Lio/getstream/chat/android/models/Channel;)V", "id", "", "type", "name", "image", "watcherCount", "", "frozen", "", "createdAt", "Ljava/util/Date;", "deletedAt", "updatedAt", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "memberCount", "messages", "", "Lio/getstream/chat/android/models/Message;", QueryChannelRequest.KEY_MEMBERS, "Lio/getstream/chat/android/models/Member;", "watchers", "Lio/getstream/chat/android/models/User;", "read", "Lio/getstream/chat/android/models/ChannelUserRead;", "config", "Lio/getstream/chat/android/models/Config;", "createdBy", "unreadCount", "team", "hidden", "Ljava/lang/Boolean;", "hiddenMessagesBefore", "cooldown", "pinnedMessages", "ownCapabilities", "", "membership", "cachedLatestMessages", "isInsideSearch", "draft", "Lio/getstream/chat/android/models/DraftMessage;", "activeLiveLocations", "Lio/getstream/chat/android/models/Location;", "messageCount", "Ljava/lang/Integer;", "pushPreference", "Lio/getstream/chat/android/models/PushPreference;", "filterTags", "lastMessageAt", "extraData", "", "withId", "withType", "withName", "withImage", "withWatcherCount", "withFrozen", "withCreatedAt", "withDeletedAt", "withUpdatedAt", "withSyncStatus", "withMemberCount", "withMessages", "withMembers", "withWatchers", "withRead", "withConfig", "withCreatedBy", "withUnreadCount", "withTeam", "withHidden", "(Ljava/lang/Boolean;)Lio/getstream/chat/android/models/Channel$Builder;", "withHiddenMessagesBefore", "withCooldown", "withPinnedMessages", "withOwnCapabilities", "withMembership", "withCachedLatestMessages", "withIsInsideSearch", "withDraftMessage", "draftMessage", "withActiveLiveLocations", "withMessageCount", "(Ljava/lang/Integer;)Lio/getstream/chat/android/models/Channel$Builder;", "withPushPreference", "withFilterTags", "withLastMessageAt", "withExtraData", "build", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private List<Location> activeLiveLocations;
        private List<Message> cachedLatestMessages;
        private Config config;
        private int cooldown;
        private Date createdAt;
        private User createdBy;
        private Date deletedAt;
        private DraftMessage draft;
        private Map<String, ? extends Object> extraData;
        private List<String> filterTags;
        private boolean frozen;
        private Boolean hidden;
        private Date hiddenMessagesBefore;
        private String id;
        private String image;
        private boolean isInsideSearch;
        private Date lastMessageAt;
        private int memberCount;
        private List<Member> members;
        private Member membership;
        private Integer messageCount;
        private List<Message> messages;
        private String name;
        private Set<String> ownCapabilities;
        private List<Message> pinnedMessages;
        private PushPreference pushPreference;
        private List<ChannelUserRead> read;
        private SyncStatus syncStatus;
        private String team;
        private String type;
        private int unreadCount;
        private Date updatedAt;
        private int watcherCount;
        private List<User> watchers;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this.id = "";
            this.type = "";
            this.name = "";
            this.image = "";
            this.syncStatus = SyncStatus.COMPLETED;
            C25271y c25271y = C25271y.f99162w;
            this.messages = c25271y;
            this.members = c25271y;
            this.watchers = c25271y;
            this.read = c25271y;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = null;
            boolean z4 = false;
            this.config = new Config(null, null, str, false, false, false, false, false, false, false, z4, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, 67108863, defaultConstructorMarker);
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            this.createdBy = new User(objArr, str, null, null, null, null, null, null, null, z4, null, null, null, objArr2, objArr3, objArr4, objArr5, null, objArr6, objArr7, objArr8, objArr9, null, null, null, 33554431, defaultConstructorMarker);
            this.team = "";
            this.pinnedMessages = c25271y;
            this.ownCapabilities = C25235a0.f99113w;
            this.cachedLatestMessages = c25271y;
            this.activeLiveLocations = c25271y;
            this.filterTags = c25271y;
            this.extraData = C25272z.f99163w;
        }

        public final Channel build() {
            return new Channel(this.id, this.type, this.name, this.image, this.watcherCount, this.frozen, this.createdAt, this.deletedAt, this.updatedAt, this.syncStatus, this.memberCount, this.messages, this.members, this.watchers, this.read, this.config, this.createdBy, this.unreadCount, this.team, this.hidden, this.hiddenMessagesBefore, this.cooldown, null, this.pinnedMessages, this.ownCapabilities, this.membership, this.cachedLatestMessages, this.isInsideSearch, this.draft, this.activeLiveLocations, this.messageCount, this.pushPreference, this.filterTags, this.lastMessageAt, this.extraData, 4194304, 0, null);
        }

        public final Builder withActiveLiveLocations(List<Location> activeLiveLocations) {
            AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
            this.activeLiveLocations = activeLiveLocations;
            return this;
        }

        public final Builder withCachedLatestMessages(List<Message> cachedLatestMessages) {
            AbstractC22676k.m65750j(cachedLatestMessages, "cachedLatestMessages");
            this.cachedLatestMessages = cachedLatestMessages;
            return this;
        }

        public final Builder withConfig(Config config) {
            AbstractC22676k.m65750j(config, "config");
            this.config = config;
            return this;
        }

        public final Builder withCooldown(int cooldown) {
            this.cooldown = cooldown;
            return this;
        }

        public final Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public final Builder withCreatedBy(User createdBy) {
            AbstractC22676k.m65750j(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        public final Builder withDeletedAt(Date deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public final Builder withDraftMessage(DraftMessage draftMessage) {
            this.draft = draftMessage;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            AbstractC22676k.m65750j(extraData, "extraData");
            this.extraData = extraData;
            return this;
        }

        public final Builder withFilterTags(List<String> filterTags) {
            AbstractC22676k.m65750j(filterTags, "filterTags");
            this.filterTags = filterTags;
            return this;
        }

        public final Builder withFrozen(boolean frozen) {
            this.frozen = frozen;
            return this;
        }

        public final Builder withHidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public final Builder withHiddenMessagesBefore(Date hiddenMessagesBefore) {
            this.hiddenMessagesBefore = hiddenMessagesBefore;
            return this;
        }

        public final Builder withId(String id4) {
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            return this;
        }

        public final Builder withImage(String image) {
            AbstractC22676k.m65750j(image, "image");
            this.image = image;
            return this;
        }

        public final Builder withIsInsideSearch(boolean isInsideSearch) {
            this.isInsideSearch = isInsideSearch;
            return this;
        }

        public final Builder withLastMessageAt(Date lastMessageAt) {
            this.lastMessageAt = lastMessageAt;
            return this;
        }

        public final Builder withMemberCount(int memberCount) {
            this.memberCount = memberCount;
            return this;
        }

        public final Builder withMembers(List<Member> members) {
            AbstractC22676k.m65750j(members, "members");
            this.members = members;
            return this;
        }

        public final Builder withMembership(Member membership) {
            this.membership = membership;
            return this;
        }

        public final Builder withMessageCount(Integer messageCount) {
            this.messageCount = messageCount;
            return this;
        }

        public final Builder withMessages(List<Message> messages) {
            AbstractC22676k.m65750j(messages, "messages");
            this.messages = messages;
            return this;
        }

        public final Builder withName(String name) {
            AbstractC22676k.m65750j(name, "name");
            this.name = name;
            return this;
        }

        public final Builder withOwnCapabilities(Set<String> ownCapabilities) {
            AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
            this.ownCapabilities = ownCapabilities;
            return this;
        }

        public final Builder withPinnedMessages(List<Message> pinnedMessages) {
            AbstractC22676k.m65750j(pinnedMessages, "pinnedMessages");
            this.pinnedMessages = pinnedMessages;
            return this;
        }

        public final Builder withPushPreference(PushPreference pushPreference) {
            this.pushPreference = pushPreference;
            return this;
        }

        public final Builder withRead(List<ChannelUserRead> read) {
            AbstractC22676k.m65750j(read, "read");
            this.read = read;
            return this;
        }

        public final Builder withSyncStatus(SyncStatus syncStatus) {
            AbstractC22676k.m65750j(syncStatus, "syncStatus");
            this.syncStatus = syncStatus;
            return this;
        }

        public final Builder withTeam(String team) {
            AbstractC22676k.m65750j(team, "team");
            this.team = team;
            return this;
        }

        public final Builder withType(String type) {
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
            return this;
        }

        public final Builder withUnreadCount(int unreadCount) {
            this.unreadCount = unreadCount;
            return this;
        }

        public final Builder withUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public final Builder withWatcherCount(int watcherCount) {
            this.watcherCount = watcherCount;
            return this;
        }

        public final Builder withWatchers(List<User> watchers) {
            AbstractC22676k.m65750j(watchers, "watchers");
            this.watchers = watchers;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Channel channel) {
            this();
            AbstractC22676k.m65750j(channel, "channel");
            this.id = channel.getId();
            this.type = channel.getType();
            this.name = channel.getName();
            this.image = channel.getImage();
            this.watcherCount = channel.getWatcherCount();
            this.frozen = channel.getFrozen();
            this.createdAt = channel.getCreatedAt();
            this.deletedAt = channel.getDeletedAt();
            this.updatedAt = channel.getUpdatedAt();
            this.syncStatus = channel.getSyncStatus();
            this.memberCount = channel.getMemberCount();
            this.messages = channel.getMessages();
            this.members = channel.getMembers();
            this.watchers = channel.getWatchers();
            this.read = channel.getRead();
            this.config = channel.getConfig();
            this.createdBy = channel.getCreatedBy();
            this.unreadCount = channel.getUnreadCount();
            this.team = channel.getTeam();
            this.hidden = channel.getHidden();
            this.hiddenMessagesBefore = channel.getHiddenMessagesBefore();
            this.cooldown = channel.getCooldown();
            this.pinnedMessages = channel.getPinnedMessages();
            this.ownCapabilities = channel.getOwnCapabilities();
            this.membership = channel.getMembership();
            this.cachedLatestMessages = channel.getCachedLatestMessages();
            this.isInsideSearch = channel.isInsideSearch();
            this.draft = channel.getDraftMessage();
            this.activeLiveLocations = channel.getActiveLiveLocations();
            this.messageCount = channel.getMessageCount();
            this.pushPreference = channel.getPushPreference();
            this.filterTags = channel.getFilterTags();
            this.lastMessageAt = channel.getLastMessageAt();
            this.extraData = channel.getExtraData();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Channel(String str, String str2, String str3, String str4, int i13, boolean z4, Date date, Date date2, Date date3, SyncStatus syncStatus, int i14, List list, List list2, List list3, List list4, Config config, User user, int i15, String str5, Boolean bool, Date date4, int i16, List list5, List list6, Set set, Member member, List list7, boolean z13, DraftMessage draftMessage, List list8, Integer num, PushPreference pushPreference, List list9, Date date5, Map map, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = (i17 & 1) != 0 ? "" : str;
        String str7 = (i17 & 2) != 0 ? "" : str2;
        String str8 = (i17 & 4) != 0 ? "" : str3;
        String str9 = (i17 & 8) != 0 ? "" : str4;
        int i19 = (i17 & 16) != 0 ? 0 : i13;
        boolean z14 = (i17 & 32) != 0 ? false : z4;
        Date date6 = (i17 & 64) != 0 ? null : date;
        Date date7 = (i17 & 128) != 0 ? null : date2;
        Date date8 = (i17 & 256) != 0 ? null : date3;
        SyncStatus syncStatus2 = (i17 & 512) != 0 ? SyncStatus.COMPLETED : syncStatus;
        int i24 = (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i14;
        int i25 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        List list10 = C25271y.f99162w;
        this(str6, str7, str8, str9, i19, z14, date6, date7, date8, syncStatus2, i24, i25 != 0 ? list10 : list, (i17 & 4096) != 0 ? list10 : list2, (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? list10 : list3, (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? list10 : list4, (i17 & 32768) != 0 ? new Config(null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, 67108863, null) : config, (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null) : user, (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? 0 : i15, (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0 ? str5 : "", (i17 & 524288) != 0 ? null : bool, (i17 & 1048576) != 0 ? null : date4, (i17 & 2097152) != 0 ? 0 : i16, (i17 & 4194304) != 0 ? list10 : list5, (i17 & 8388608) != 0 ? list10 : list6, (i17 & 16777216) != 0 ? C25235a0.f99113w : set, (i17 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? null : member, (i17 & 67108864) != 0 ? list10 : list7, (i17 & 134217728) != 0 ? false : z13, (i17 & 268435456) != 0 ? null : draftMessage, (i17 & 536870912) != 0 ? list10 : list8, (i17 & 1073741824) != 0 ? null : num, (i17 & Integer.MIN_VALUE) != 0 ? null : pushPreference, (i18 & 1) == 0 ? list9 : list10, (i18 & 2) != 0 ? null : date5, (i18 & 4) != 0 ? C25272z.f99163w : map);
    }
}

package iq0;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.community.data.network.MessageStatus;
import com.whoop.community.data.network.ReportMessage;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.AuthMaterial;
import cq0.C11053a;
import cq0.C11059g;
import dq0.InterfaceC12284b;
import hj0.AbstractC17356o;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.ChatEventListener;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import io.getstream.chat.android.client.channel.ChannelClient;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.utils.observable.Disposable;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.C28180m;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import y92.C39352a;
import z92.InterfaceC40205a;
import zp0.C40939a;

/* JADX INFO: renamed from: iq0.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ¼\u00012\u00020\u0001:\u0002Ó\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0087@¢\u0006\u0004\b\u001f\u0010\u001aJ\u0015\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0018¢\u0006\u0004\b%\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010&H\u0086@¢\u0006\u0004\b'\u0010\u001aJ\u001d\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010)2\u0006\u0010(\u001a\u00020\u0018¢\u0006\u0004\b*\u0010+J1\u00100\u001a\u00020!2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0)2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010\u00180.¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020!H\u0086@¢\u0006\u0004\b2\u0010\u001aJ\u000f\u00103\u001a\u00020!H\u0014¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020!2\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0018¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020!2\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0018¢\u0006\u0004\b9\u00108J\r\u0010:\u001a\u00020!¢\u0006\u0004\b:\u00104J\r\u0010;\u001a\u00020!¢\u0006\u0004\b;\u00104J\r\u0010<\u001a\u00020!¢\u0006\u0004\b<\u00104J\r\u0010=\u001a\u00020!¢\u0006\u0004\b=\u00104J%\u0010A\u001a\u00020!2\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0)2\u0006\u0010@\u001a\u00020\u0018¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020!¢\u0006\u0004\bC\u00104J\u0015\u0010E\u001a\u00020!2\u0006\u0010D\u001a\u00020\u0018¢\u0006\u0004\bE\u0010#J\u0010\u0010F\u001a\u00020\u0018H\u0082@¢\u0006\u0004\bF\u0010\u001aJ\u001e\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010GH\u0082@¢\u0006\u0004\bH\u0010\u001aJ\u0017\u0010I\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\bI\u0010#J\u0017\u0010K\u001a\u00020!2\u0006\u0010@\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010O\u001a\u00020!2\b\b\u0002\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020!2\u0006\u0010@\u001a\u00020J2\u0006\u0010Q\u001a\u00020\u0018H\u0002¢\u0006\u0004\bR\u0010SJ \u0010U\u001a\u00020!2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010N\u001a\u00020MH\u0082@¢\u0006\u0004\bU\u0010VJ5\u0010Z\u001a\u00020!2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00180)2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020\u0018H\u0002¢\u0006\u0004\bZ\u0010[J%\u0010\\\u001a\u00020!2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00180)2\u0006\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\\\u0010BJ\u0017\u0010^\u001a\u00020!2\u0006\u0010]\u001a\u00020MH\u0002¢\u0006\u0004\b^\u0010PJ\u0017\u0010_\u001a\u00020!2\u0006\u0010]\u001a\u00020MH\u0002¢\u0006\u0004\b_\u0010PJ-\u0010d\u001a\u00020!2\u0006\u0010`\u001a\u00020\u00182\f\u0010b\u001a\b\u0012\u0004\u0012\u00020J0a2\u0006\u0010c\u001a\u00020JH\u0002¢\u0006\u0004\bd\u0010eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010~\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R$\u0010X\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010{\u001a\u0005\b\u0080\u0001\u0010}\"\u0005\b\u0081\u0001\u0010#R%\u0010Y\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010{\u001a\u0005\b\u0083\u0001\u0010}\"\u0005\b\u0084\u0001\u0010#R%\u0010Q\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010{\u001a\u0005\b\u0086\u0001\u0010}\"\u0005\b\u0087\u0001\u0010#R&\u0010\u008b\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010{\u001a\u0005\b\u0089\u0001\u0010}\"\u0005\b\u008a\u0001\u0010#R(\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010{\u001a\u0005\b\u008d\u0001\u0010}\"\u0005\b\u008e\u0001\u0010#R)\u0010\u0096\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0091\u0001\u0010p\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010{\u001a\u0005\b\u0098\u0001\u0010}\"\u0005\b\u0099\u0001\u0010#R*\u0010 \u0001\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0005\b\u009f\u0001\u0010LR#\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020M0¡\u00018\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001f\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0017\u0010®\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010\u00ad\u0001R$\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010¡\u00018\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010£\u0001\u001a\u0006\b±\u0001\u0010¥\u0001R1\u0010»\u0001\u001a\n\u0012\u0005\u0012\u00030´\u00010³\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\"\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00020M0§\u00018\u0006¢\u0006\u000f\n\u0005\bU\u0010ª\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R#\u0010Á\u0001\u001a\t\u0012\u0004\u0012\u00020M0§\u00018\u0006¢\u0006\u0010\n\u0006\b¿\u0001\u0010ª\u0001\u001a\u0006\bÀ\u0001\u0010½\u0001R\"\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020M0§\u00018\u0006¢\u0006\u000f\n\u0005\b;\u0010ª\u0001\u001a\u0006\bÂ\u0001\u0010½\u0001R2\u0010Æ\u0001\u001a\u0018\u0012\u0013\u0012\u0011\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00180G0§\u00018\u0006¢\u0006\u0010\n\u0006\bÄ\u0001\u0010ª\u0001\u001a\u0006\bÅ\u0001\u0010½\u0001R)\u0010É\u0001\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b7\u0010\u009c\u0001\u001a\u0006\bÇ\u0001\u0010\u009e\u0001\"\u0005\bÈ\u0001\u0010LR \u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180Ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001b\u0010Ð\u0001\u001a\u0005\u0018\u00010Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010Ï\u0001R\u001c\u0010Ò\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010¡\u00018F¢\u0006\b\u001a\u0006\bÑ\u0001\u0010¥\u0001¨\u0006Ô\u0001"}, m65681d2 = {"Liq0/m;", "Lhj0/o;", "Ldq0/b;", "chatClient", "Lcq0/a;", "chatRepository", "Lcq0/g;", "teamsRepository", "Ltr2/n;", "logger", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lz92/a;", "userInfoAccessor", "Ly92/a;", "authManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lq83/j;", "ioContext", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldq0/b;Lcq0/a;Lcq0/g;Ltr2/n;Lcom/whoop/data/local/prefs/PreferenceHelper;Lz92/a;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/j;Lbc3/c0;)V", "", "F0", "(Lq83/d;)Ljava/lang/Object;", "h0", "E0", "t0", "Lio/getstream/chat/android/models/User;", "A0", "command", "Ll83/a0;", "Q0", "(Ljava/lang/String;)V", "messageText", "S0", "", "G0", "selectedType", "", "O0", "(Ljava/lang/String;)Ljava/util/List;", "Landroid/net/Uri;", "uris", "Lkotlin/Function1;", "getMimeType", "N0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "n1", "onCleared", "()V", "messageId", "reactionType", "f0", "(Ljava/lang/String;Ljava/lang/String;)V", "Y", "K0", "d0", "i1", "j1", "Landroid/graphics/Bitmap;", "localAttachments", "message", "m1", "(Ljava/util/List;Ljava/lang/String;)V", "I0", "reason", "P0", "p0", "Ll83/k;", "j0", "k1", "Lio/getstream/chat/android/models/Message;", "U0", "(Lio/getstream/chat/android/models/Message;)V", "", "switchUser", "y0", "(Z)V", "cid", "T0", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V", "chatToken", "b0", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "imageUrls", "channelId", "channelType", "R0", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "V0", "success", "M0", "L0", "sendType", "Ln23/h;", "result", "fallbackMessage", "J0", "(Ljava/lang/String;Ln23/h;Lio/getstream/chat/android/models/Message;)V", "E", "Ldq0/b;", "m0", "()Ldq0/b;", "F", "Lcq0/a;", "G", "Lcq0/g;", "H", "Ltr2/n;", "I", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "J", "Lz92/a;", "K", "Ly92/a;", "L", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "M", "Lq83/j;", "N", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "O", "k0", "Z0", "P", "l0", "a1", "Q", "n0", "b1", "R", "B0", "f1", "teamIconUrl", "S", "H0", "h1", "widgetUrl", "", "T", "C0", "()I", "g1", "(I)V", "teamId", "U", "s0", "d1", "parentId", "V", "Lio/getstream/chat/android/models/Message;", "x0", "()Lio/getstream/chat/android/models/Message;", "e1", "selectedMessage", "Landroidx/lifecycle/p0;", "W", "Landroidx/lifecycle/p0;", "q0", "()Landroidx/lifecycle/p0;", "messageResponseLiveData", "Landroidx/lifecycle/u0;", "", "X", "Landroidx/lifecycle/u0;", "_messageSendVersion", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "messageSendVersionCounter", "Lzp0/a;", "Z", "u0", "reactionAnalyticsLiveData", "", "Liq0/r;", "a0", "Ljava/util/List;", "w0", "()Ljava/util/List;", "setSelectedAttachments", "(Ljava/util/List;)V", "selectedAttachments", "i0", "()Landroidx/lifecycle/u0;", "attachmentStatus", "c0", "z0", "streamConnectionStatus", "v0", "reportMessageStatus", "e0", "D0", "typingState", "o0", "c1", "editMessage", "", "g0", "Ljava/util/Set;", "currentlyTyping", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "streamDisposable", "r0", "messageSendVersion", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20834m extends AbstractC17356o {

    /* JADX INFO: renamed from: j0 */
    public static final int f78222j0 = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC12284b chatClient;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C11053a chatRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String channelId;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String channelType;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String cid;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String teamIconUrl;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private String widgetUrl;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private int teamId;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private String parentId;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private Message selectedMessage;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final AbstractC1615p0 messageResponseLiveData;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final C1630u0 _messageSendVersion;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final AtomicLong messageSendVersionCounter;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final AbstractC1615p0 reactionAnalyticsLiveData;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private List<C20839r> selectedAttachments;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final C1630u0 attachmentStatus;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final C1630u0 streamConnectionStatus;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final C1630u0 reportMessageStatus;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final C1630u0 typingState;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private Message editMessage;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private Set<String> currentlyTyping;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private Disposable streamDisposable;

    /* JADX INFO: renamed from: iq0.m$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {341}, m100432m = "connectOrSwitchUser", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f78253E;

        /* JADX INFO: renamed from: w */
        Object f78254w;

        /* JADX INFO: renamed from: x */
        boolean f78255x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f78256y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78256y = obj;
            this.f78253E |= Integer.MIN_VALUE;
            return C20834m.this.m57488b0(null, false, this);
        }
    }

    /* JADX INFO: renamed from: iq0.m$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {70}, m100432m = "getAccessToken", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f78258w;

        /* JADX INFO: renamed from: y */
        int f78260y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78258w = obj;
            this.f78260y |= Integer.MIN_VALUE;
            return C20834m.this.m57527h0(this);
        }
    }

    /* JADX INFO: renamed from: iq0.m$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {93}, m100432m = "getAuthHeader", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f78261w;

        /* JADX INFO: renamed from: y */
        int f78263y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78261w = obj;
            this.f78263y |= Integer.MIN_VALUE;
            return C20834m.this.m57492j0(this);
        }
    }

    /* JADX INFO: renamed from: iq0.m$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {61}, m100432m = "getFullName", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f78264w;

        /* JADX INFO: renamed from: y */
        int f78266y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78264w = obj;
            this.f78266y |= Integer.MIN_VALUE;
            return C20834m.this.m57496p0(this);
        }
    }

    /* JADX INFO: renamed from: iq0.m$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {74}, m100432m = "getProfileIcon", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f78267w;

        /* JADX INFO: renamed from: y */
        int f78269y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78267w = obj;
            this.f78269y |= Integer.MIN_VALUE;
            return C20834m.this.m57542t0(this);
        }
    }

    /* JADX INFO: renamed from: iq0.m$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$getStreamChatToken$1", m100430f = "CommunityChatViewModel.kt", m100431l = {301, 305}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f78271F;

        /* JADX INFO: renamed from: w */
        Object f78272w;

        /* JADX INFO: renamed from: x */
        Object f78273x;

        /* JADX INFO: renamed from: y */
        int f78274y;

        /* JADX INFO: renamed from: z */
        int f78275z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z4, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78271F = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20834m.this.new g(this.f78271F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (r1.m57488b0(r7, r4, r6) == r0) goto L23;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f78275z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r6.f78273x
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f78272w
                com.whoop.data.remote.commons.Resource r0 = (com.whoop.data.remote.commons.Resource) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L95
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                iq0.m r7 = iq0.C20834m.this
                cq0.g r7 = iq0.C20834m.m57471O(r7)
                r6.f78275z = r3
                java.lang.Object r7 = r7.m29818v(r6)
                if (r7 != r0) goto L37
                goto L67
            L37:
                com.whoop.data.remote.commons.Resource r7 = (com.whoop.data.remote.commons.Resource) r7
                boolean r1 = r7.getSuccess()
                r3 = 0
                if (r1 == 0) goto L7d
                java.lang.Object r7 = r7.getData()
                bq0.a r7 = (bq0.C3545a) r7
                if (r7 == 0) goto L95
                java.lang.String r7 = r7.getChatToken()
                if (r7 == 0) goto L95
                iq0.m r1 = iq0.C20834m.this
                boolean r4 = r6.f78271F
                int r5 = r7.length()
                if (r5 <= 0) goto L68
                r5 = 0
                r6.f78272w = r5
                r6.f78273x = r5
                r6.f78274y = r3
                r6.f78275z = r2
                java.lang.Object r7 = iq0.C20834m.m57461G(r1, r7, r4, r6)
                if (r7 != r0) goto L95
            L67:
                return r0
            L68:
                androidx.lifecycle.u0 r7 = r1.getStreamConnectionStatus()
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                iq0.C20834m.m57482W(r1, r7, r0)
                tr2.n r7 = iq0.C20834m.m57468M(r1)
                java.lang.String r0 = "Get stream chat token api returned empty string"
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r3]
                r7.mo85216g(r0, r1)
                goto L95
            L7d:
                iq0.m r7 = iq0.C20834m.this
                androidx.lifecycle.u0 r0 = r7.getStreamConnectionStatus()
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                iq0.C20834m.m57482W(r7, r0, r1)
                iq0.m r7 = iq0.C20834m.this
                tr2.n r7 = iq0.C20834m.m57468M(r7)
                java.lang.String r0 = "Get stream chat token api call failed"
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r3]
                r7.mo85216g(r0, r1)
            L95:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: iq0.C20834m.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: iq0.m$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {97, AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 102, 103, 104, 105}, m100432m = "getStreamUser", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f78276E;

        /* JADX INFO: renamed from: F */
        int f78277F;

        /* JADX INFO: renamed from: G */
        int f78278G;

        /* JADX INFO: renamed from: H */
        int f78279H;

        /* JADX INFO: renamed from: I */
        int f78280I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f78281J;

        /* JADX INFO: renamed from: L */
        int f78283L;

        /* JADX INFO: renamed from: w */
        Object f78284w;

        /* JADX INFO: renamed from: x */
        Object f78285x;

        /* JADX INFO: renamed from: y */
        Object f78286y;

        /* JADX INFO: renamed from: z */
        Object f78287z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78281J = obj;
            this.f78283L |= Integer.MIN_VALUE;
            return C20834m.this.m57501A0(this);
        }
    }

    /* JADX INFO: renamed from: iq0.m$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {72}, m100432m = "getUserId", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f78288w;

        /* JADX INFO: renamed from: y */
        int f78290y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78288w = obj;
            this.f78290y |= Integer.MIN_VALUE;
            return C20834m.this.m57505E0(this);
        }
    }

    /* JADX INFO: renamed from: iq0.m$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {59}, m100432m = "getUserName", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f78291w;

        /* JADX INFO: renamed from: y */
        int f78293y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78291w = obj;
            this.f78293y |= Integer.MIN_VALUE;
            return C20834m.this.m57506F0(this);
        }
    }

    /* JADX INFO: renamed from: iq0.m$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {137}, m100432m = "getWidgetAuthUrl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f78294E;

        /* JADX INFO: renamed from: w */
        Object f78295w;

        /* JADX INFO: renamed from: x */
        Object f78296x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f78297y;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78297y = obj;
            this.f78294E |= Integer.MIN_VALUE;
            return C20834m.this.m57507G0(this);
        }
    }

    /* JADX INFO: renamed from: iq0.m$l */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$initStreamConnection$1", m100430f = "CommunityChatViewModel.kt", m100431l = {DfuBaseService.NOTIFICATION_ID}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78299w;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20834m.this.new l(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78299w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C20834m c20834m = C20834m.this;
                this.f78299w = 1;
                obj = c20834m.m57505E0(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            String str = (String) obj;
            User currentUser = C20834m.this.getChatClient().getCurrentUser();
            if (AbstractC22676k.m65745e(currentUser != null ? currentUser.getId() : null, str)) {
                C20834m c20834m2 = C20834m.this;
                c20834m2.m49140v(c20834m2.getStreamConnectionStatus(), Boolean.TRUE);
            } else {
                if (currentUser != null) {
                    C20834m.this.logger.mo85216g(AbstractC2875y.m8300m("Stream user mismatch: connectedUserId=", currentUser.getId(), ", expectedUserId=", str, ". Reconnecting."), new AbstractC30556a.a[0]);
                }
                C20834m.this.m57499y0(currentUser != null);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iq0.m$m */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$reportMessage$1", m100430f = "CommunityChatViewModel.kt", m100431l = {321}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f78302F;

        /* JADX INFO: renamed from: w */
        Object f78303w;

        /* JADX INFO: renamed from: x */
        Object f78304x;

        /* JADX INFO: renamed from: y */
        int f78305y;

        /* JADX INFO: renamed from: z */
        int f78306z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, InterfaceC30057d<? super m> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78302F = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20834m.this.new m(this.f78302F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C20834m c20834m;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78306z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Message selectedMessage = C20834m.this.getSelectedMessage();
                if (selectedMessage != null) {
                    C20834m c20834m2 = C20834m.this;
                    String str = this.f78302F;
                    C11053a c11053a = c20834m2.chatRepository;
                    ReportMessage reportMessage = new ReportMessage(c20834m2.getTeamId(), Integer.parseInt(selectedMessage.getUser().getId()), selectedMessage.getId(), selectedMessage.getText(), str);
                    this.f78303w = c20834m2;
                    this.f78304x = null;
                    this.f78305y = 0;
                    this.f78306z = 1;
                    obj = c11053a.m29714h(reportMessage, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                    c20834m = c20834m2;
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20834m = (C20834m) this.f78303w;
            AbstractC34132o.m107864I(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            c20834m.getReportMessageStatus().postValue(Boolean.valueOf(zBooleanValue));
            if (!zBooleanValue) {
                c20834m.logger.mo85216g("Message reporting failed", new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iq0.m$n */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$sendImageToStream$1", m100430f = "CommunityChatViewModel.kt", m100431l = {369}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f78307E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ List<String> f78308F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f78309G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f78310H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C20834m f78311I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f78312J;

        /* JADX INFO: renamed from: w */
        Object f78313w;

        /* JADX INFO: renamed from: x */
        Object f78314x;

        /* JADX INFO: renamed from: y */
        Object f78315y;

        /* JADX INFO: renamed from: z */
        int f78316z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List<String> list, String str, String str2, C20834m c20834m, String str3, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78308F = list;
            this.f78309G = str;
            this.f78310H = str2;
            this.f78311I = c20834m;
            this.f78312J = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final Attachment m57551j(String str) {
            return new Attachment(null, null, null, null, str, null, null, null, 0, str, null, "image", null, null, null, null, null, null, null, null, 1045999, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final Attachment m57552k(Function1 function1, Object obj) {
            return (Attachment) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static final void m57553l(C20834m c20834m, Message message, InterfaceC2994c0 interfaceC2994c0, AbstractC26205h abstractC26205h) {
            c20834m.m57464J0("image", abstractC26205h, message);
            c20834m.m57467L0(abstractC26205h instanceof C26204g);
            Message message2 = (Message) abstractC26205h.m77816b();
            if (message2 == null) {
                c20834m.logger.mo85216g("Send image to stream failed.", new AbstractC30556a.a[0]);
            } else {
                message = message2;
            }
            c20834m.m57477T0(message, c20834m.m57536n0());
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n nVar = new n(this.f78308F, this.f78309G, this.f78310H, this.f78311I, this.f78312J, interfaceC30057d);
            nVar.f78307E = obj;
            return nVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List listM74097F1;
            Object objM57501A0;
            String str;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f78307E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78316z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                List list = (List) this.f78308F.stream().map(new C20836o(new C20835n(0), 0)).collect(Collectors.toList());
                AbstractC22676k.m65747g(list);
                listM74097F1 = AbstractC25265s.m74097F1(list);
                String strM53370k = AbstractC18489d0.m53370k(this.f78309G, ":", this.f78310H);
                C20834m c20834m = this.f78311I;
                this.f78307E = interfaceC2994c0;
                this.f78313w = null;
                this.f78314x = listM74097F1;
                this.f78315y = strM53370k;
                this.f78316z = 1;
                objM57501A0 = c20834m.m57501A0(this);
                if (objM57501A0 == enumC31071a) {
                    return enumC31071a;
                }
                str = strM53370k;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) this.f78315y;
                listM74097F1 = (List) this.f78314x;
                AbstractC34132o.m107864I(obj);
                objM57501A0 = obj;
                str = str2;
            }
            List list2 = listM74097F1;
            String parentId = this.f78311I.getParentId();
            String str3 = null;
            Message message = new Message(str3, str, this.f78312J, null, parentId, null, list2, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, (User) objM57501A0, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -8388695, 65535, null);
            this.f78311I.getChatClient().sendMessage(this.f78309G, this.f78310H, message).enqueue(new C20831j(this.f78311I, message, interfaceC2994c0, 2));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iq0.m$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$sendMessage$1", m100430f = "CommunityChatViewModel.kt", m100431l = {121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f78317E;

        /* JADX INFO: renamed from: w */
        Object f78318w;

        /* JADX INFO: renamed from: x */
        Object f78319x;

        /* JADX INFO: renamed from: y */
        int f78320y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78317E = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final void m57555h(C20834m c20834m, Message message, AbstractC26205h abstractC26205h) {
            c20834m.m57464J0("text", abstractC26205h, message);
            Message message2 = (Message) abstractC26205h.m77816b();
            if (message2 != null) {
                message = message2;
            }
            c20834m.m57469M0(abstractC26205h instanceof C26204g);
            c20834m.m57477T0(message, c20834m.m57536n0());
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20834m.this.new o(this.f78317E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strM31995n;
            Object objM57501A0;
            String str;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78320y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (C20834m.this.getEditMessage() == null) {
                    strM31995n = AbstractC11895b.m31995n("toString(...)");
                    String strM53370k = AbstractC18489d0.m53370k(C20834m.this.m57533l0(), ":", C20834m.this.m57532k0());
                    C20834m c20834m = C20834m.this;
                    this.f78318w = strM31995n;
                    this.f78319x = strM53370k;
                    this.f78320y = 1;
                    objM57501A0 = c20834m.m57501A0(this);
                    if (objM57501A0 == enumC31071a) {
                        return enumC31071a;
                    }
                    str = strM53370k;
                } else {
                    C20834m.this.m57493k1(this.f78317E);
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) this.f78319x;
            strM31995n = (String) this.f78318w;
            AbstractC34132o.m107864I(obj);
            objM57501A0 = obj;
            str = str2;
            String str3 = strM31995n;
            String parentId = C20834m.this.getParentId();
            Message message = new Message(str3, str, this.f78317E, null, parentId, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, (User) objM57501A0, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -8388632, 65535, null);
            C20834m.this.getChatClient().sendMessage(C20834m.this.m57533l0(), C20834m.this.m57532k0(), message).enqueue(new C20837p(C20834m.this, message, 0));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iq0.m$p */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$sendMessageStatus$1", m100430f = "CommunityChatViewModel.kt", m100431l = {333}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C20834m f78322E;

        /* JADX INFO: renamed from: w */
        Object f78323w;

        /* JADX INFO: renamed from: x */
        int f78324x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Message f78325y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f78326z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Message message, String str, C20834m c20834m, InterfaceC30057d<? super p> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78325y = message;
            this.f78326z = str;
            this.f78322E = c20834m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new p(this.f78325y, this.f78326z, this.f78322E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78324x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageStatus messageStatus = new MessageStatus(this.f78325y.getId(), this.f78326z, this.f78325y.getText());
                C11053a c11053a = this.f78322E.chatRepository;
                this.f78323w = null;
                this.f78324x = 1;
                obj = c11053a.m29715i(messageStatus, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (!((Resource) obj).getSuccess()) {
                this.f78322E.logger.mo85216g("Send message status failed", new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iq0.m$q */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$sendUpdateMessageStatus$1", m100430f = "CommunityChatViewModel.kt", m100431l = {157}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f78327w;

        /* JADX INFO: renamed from: x */
        int f78328x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Message f78329y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C20834m f78330z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Message message, C20834m c20834m, InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78329y = message;
            this.f78330z = c20834m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new q(this.f78329y, this.f78330z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78328x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageStatus messageStatus = new MessageStatus(this.f78329y.getId(), this.f78330z.m57536n0(), this.f78329y.getText());
                C11053a c11053a = this.f78330z.chatRepository;
                this.f78327w = null;
                this.f78328x = 1;
                obj = c11053a.m29716j(messageStatus, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (!((Resource) obj).getSuccess()) {
                this.f78330z.logger.mo85216g("Send update message status failed", new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iq0.m$r */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$uploadChatAttachments$1", m100430f = "CommunityChatViewModel.kt", m100431l = {264}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78331w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<Bitmap> f78333y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f78334z;

        /* JADX INFO: renamed from: iq0.m$r$a */
        @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$uploadChatAttachments$1$1", m100430f = "CommunityChatViewModel.kt", m100431l = {270}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C20834m f78335E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ String f78336F;

            /* JADX INFO: renamed from: w */
            Object f78337w;

            /* JADX INFO: renamed from: x */
            int f78338x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f78339y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ List<Bitmap> f78340z;

            /* JADX INFO: renamed from: iq0.m$r$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel$uploadChatAttachments$1$1$imageUploadTask$1$1", m100430f = "CommunityChatViewModel.kt", m100431l = {267}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41780a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f78341w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C20834m f78342x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ Bitmap f78343y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41780a(C20834m c20834m, Bitmap bitmap, InterfaceC30057d<? super C41780a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f78342x = c20834m;
                    this.f78343y = bitmap;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41780a(this.f78342x, this.f78343y, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
                    return ((C41780a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f78341w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    C11053a c11053a = this.f78342x.chatRepository;
                    String strM57533l0 = this.f78342x.m57533l0();
                    String strM57532k0 = this.f78342x.m57532k0();
                    Bitmap bitmap = this.f78343y;
                    this.f78341w = 1;
                    Object objM29718l = c11053a.m29718l(strM57533l0, strM57532k0, bitmap, this);
                    return objM29718l == enumC31071a ? enumC31071a : objM29718l;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<Bitmap> list, C20834m c20834m, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f78340z = list;
                this.f78335E = c20834m;
                this.f78336F = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f78340z, this.f78335E, this.f78336F, interfaceC30057d);
                aVar.f78339y = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f78339y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f78338x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ArrayList arrayListM74092D0 = AbstractC25265s.m74092D0(this.f78340z);
                    C20834m c20834m = this.f78335E;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM74092D0, 10));
                    Iterator it = arrayListM74092D0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC3006f0.m8711e(interfaceC2994c0, null, new C41780a(c20834m, (Bitmap) it.next(), null), 3));
                    }
                    this.f78339y = null;
                    this.f78337w = null;
                    this.f78338x = 1;
                    obj = AbstractC3006f0.m8712f(arrayList, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                List list = (List) obj;
                if (this.f78335E.getEditMessage() == null) {
                    this.f78335E.m57475R0(AbstractC25265s.m74092D0(list), this.f78336F, this.f78335E.m57532k0(), this.f78335E.m57533l0());
                } else {
                    this.f78335E.m57481V0(AbstractC25265s.m74092D0(list), this.f78336F);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(List<Bitmap> list, String str, InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78333y = list;
            this.f78334z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20834m.this.new r(this.f78333y, this.f78334z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78331w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30063j interfaceC30063j = C20834m.this.ioContext;
                a aVar = new a(this.f78333y, C20834m.this, this.f78334z, null);
                this.f78331w = 1;
                if (AbstractC3006f0.m8705K(interfaceC30063j, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: iq0.m$s */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.CommunityChatViewModel", m100430f = "CommunityChatViewModel.kt", m100431l = {196}, m100432m = "watchChannel", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f78344w;

        /* JADX INFO: renamed from: y */
        int f78346y;

        public s(InterfaceC30057d<? super s> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78344w = obj;
            this.f78346y |= Integer.MIN_VALUE;
            return C20834m.this.m57537n1(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20834m(InterfaceC12284b chatClient, C11053a chatRepository, C11059g teamsRepository, InterfaceC34116n logger, PreferenceHelper preferenceHelper, InterfaceC40205a userInfoAccessor, C39352a authManager, FeatureFlagChecker featureFlagChecker, InterfaceC30063j ioContext, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(chatRepository, "chatRepository");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.chatClient = chatClient;
        this.chatRepository = chatRepository;
        this.teamsRepository = teamsRepository;
        this.logger = logger;
        this.preferenceHelper = preferenceHelper;
        this.userInfoAccessor = userInfoAccessor;
        this.authManager = authManager;
        this.featureFlagChecker = featureFlagChecker;
        this.ioContext = ioContext;
        this.logTag = "CommunityChatViewModel";
        this.messageResponseLiveData = new C1630u0();
        this._messageSendVersion = new C1630u0();
        this.messageSendVersionCounter = new AtomicLong(0L);
        this.reactionAnalyticsLiveData = new C1630u0();
        this.selectedAttachments = new ArrayList();
        this.attachmentStatus = new C1630u0();
        this.streamConnectionStatus = new C1630u0();
        this.reportMessageStatus = new C1630u0();
        this.typingState = new C1630u0();
        this.currentlyTyping = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public final void m57464J0(String sendType, AbstractC26205h result, Message fallbackMessage) {
        Message message = (Message) result.m77816b();
        InterfaceC34116n interfaceC34116n = this.logger;
        boolean z4 = result instanceof C26204g;
        String id4 = message != null ? message.getId() : null;
        String id5 = fallbackMessage.getId();
        int size = fallbackMessage.getMentionedUsersIds().size();
        int size2 = fallbackMessage.getAttachments().size();
        int length = fallbackMessage.getText().length();
        AbstractC26202e abstractC26202eM77815a = result.m77815a();
        StringBuilder sbM73379l = AbstractC25012a.m73379l("Chat stream send [", sendType, "]: success=", ", responseMessageId=", z4);
        AbstractC11266d.m30444B(sbM73379l, id4, ", fallbackMessageId=", id5, ", mentionCount=");
        AbstractC30802r.m94773v(sbM73379l, size, ", attachmentCount=", size2, ", textLength=");
        sbM73379l.append(length);
        sbM73379l.append(", error=");
        sbM73379l.append(abstractC26202eM77815a);
        interfaceC34116n.mo85216g(sbM73379l.toString(), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public final void m57467L0(boolean success) {
        m49138t(this.attachmentStatus, Boolean.valueOf(success));
        if (success) {
            this._messageSendVersion.postValue(Long.valueOf(this.messageSendVersionCounter.incrementAndGet()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public final void m57469M0(boolean success) {
        m49138t(this.messageResponseLiveData, Boolean.valueOf(success));
        if (success) {
            this._messageSendVersion.postValue(Long.valueOf(this.messageSendVersionCounter.incrementAndGet()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public final void m57475R0(List<String> imageUrls, String messageText, String channelId, String channelType) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new n(imageUrls, channelType, channelId, this, messageText, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public final void m57477T0(Message message, String cid) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new p(message, cid, this, null), 3);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m57479U0(Message message) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new q(message, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public final void m57481V0(List<String> imageUrls, String messageText) {
        Message messageCopy;
        List list = (List) imageUrls.stream().map(new C20836o(new C20835n(1), 1)).collect(Collectors.toList());
        Message message = this.editMessage;
        if (message != null) {
            AbstractC22676k.m65747g(list);
            messageCopy = message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : messageText, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : list, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
        } else {
            messageCopy = null;
        }
        this.editMessage = null;
        if (messageCopy != null) {
            this.chatClient.mo34191f(m57536n0()).updateMessage(messageCopy).enqueue(new C20837p(this, messageCopy, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final Attachment m57483W0(String str) {
        return new Attachment(null, null, null, null, str, null, null, null, 0, str, null, "image", null, null, null, null, null, null, null, null, 1045999, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Attachment m57485X0(Function1 function1, Object obj) {
        return (Attachment) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m57486Y0(C20834m c20834m, Message message, AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        Message message2 = (Message) result.m77816b();
        if (message2 == null) {
            c20834m.logger.mo85216g("Editing the message with attachments failed", new AbstractC30556a.a[0]);
        } else {
            message = message2;
        }
        c20834m.m57467L0(result instanceof C26204g);
        c20834m.m57479U0(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m57487Z(C20834m c20834m, String str, String str2, AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof C26204g) {
            return;
        }
        c20834m.logger.mo85222m(AbstractC2875y.m8300m("Adding reaction ", str, " in messageId ", str2, " failed"), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b0 */
    public final Object m57488b0(String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f78253E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f78253E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM57501A0 = bVar.f78256y;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f78253E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM57501A0);
            bVar.f78254w = str;
            bVar.f78255x = z4;
            bVar.f78253E = 1;
            objM57501A0 = m57501A0(bVar);
            if (objM57501A0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = bVar.f78255x;
            str = (String) bVar.f78254w;
            AbstractC34132o.m107864I(objM57501A0);
        }
        User user = (User) objM57501A0;
        (z4 ? this.chatClient.mo34186a(user, str) : this.chatClient.mo34188c(user, str)).enqueue(new C20833l(this, 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m57489c0(C20834m c20834m, AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        if (!(it instanceof C26204g)) {
            c20834m.logger.mo85216g("Connecting user to stream failed", new AbstractC30556a.a[0]);
        }
        c20834m.m49138t(c20834m.streamConnectionStatus, Boolean.valueOf(c20834m.chatClient.getCurrentUser() != null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m57490e0(C20834m c20834m, AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26204g) {
            return;
        }
        c20834m.logger.mo85216g("Deleting message failed", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m57491g0(C20834m c20834m, String str, String str2, AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof C26204g) {
            return;
        }
        c20834m.logger.mo85222m(AbstractC2875y.m8300m("Deleting reaction ", str, " in messageId ", str2, " failed"), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j0 */
    public final Object m57492j0(InterfaceC30057d<? super C23465k> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f78263y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f78263y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM57527h0 = dVar.f78261w;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f78263y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM57527h0);
            dVar.f78263y = 1;
            objM57527h0 = m57527h0(dVar);
            if (objM57527h0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM57527h0);
        }
        String str = (String) objM57527h0;
        if (str != null) {
            return new C23465k(TokenAuthInterceptor.AUTH_HEADER, "Bearer ".concat(str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public final void m57493k1(String messageText) {
        Message message = this.editMessage;
        Message messageCopy = message != null ? message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : messageText, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false) : null;
        this.editMessage = null;
        if (messageCopy != null) {
            this.chatClient.mo34191f(m57536n0()).updateMessage(messageCopy).enqueue(new C20837p(this, messageCopy, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final void m57494l1(C20834m c20834m, Message message, AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        Message message2 = (Message) result.m77816b();
        if (message2 == null) {
            c20834m.logger.mo85216g("Editing the message failed", new AbstractC30556a.a[0]);
        } else {
            message = message2;
        }
        c20834m.m57469M0(result instanceof C26204g);
        c20834m.m57479U0(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final void m57495o1(C20834m c20834m, String str, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        Set<String> setM57444a = C20826e0.f78205a.m57444a(c20834m.currentlyTyping, event, str);
        c20834m.currentlyTyping = setM57444a;
        c20834m.m49138t(c20834m.typingState, new C23465k(Integer.valueOf(setM57444a.size()), AbstractC25265s.m74098G0(c20834m.currentlyTyping)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p0 */
    public final Object m57496p0(InterfaceC30057d<? super String> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f78266y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f78266y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objMo129089c = eVar.f78264w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f78266y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            eVar.f78266y = 1;
            objMo129089c = interfaceC40205a.mo129089c(eVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        com.whoop.domain.model.User user = (com.whoop.domain.model.User) objMo129089c;
        return String.valueOf(user != null ? user.getFullName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final void m57499y0(boolean switchUser) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new g(switchUser, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0144  */
    /* JADX WARN: Code duplicated, block: B:36:0x0170  */
    /* JADX WARN: Code duplicated, block: B:40:0x019a  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
    
        if (r1 == r3) goto L43;
     */
    /* JADX INFO: renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m57501A0(q83.InterfaceC30057d<? super io.getstream.chat.android.models.User> r47) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iq0.C20834m.m57501A0(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: B0 */
    public final String m57502B0() {
        String str = this.teamIconUrl;
        if (str != null) {
            return str;
        }
        AbstractC22676k.m65757q("teamIconUrl");
        throw null;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final int getTeamId() {
        return this.teamId;
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final C1630u0 getTypingState() {
        return this.typingState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: E0 */
    public final Object m57505E0(InterfaceC30057d<? super String> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f78290y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f78290y = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objMo129089c = iVar.f78288w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f78290y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            iVar.f78290y = 1;
            objMo129089c = interfaceC40205a.mo129089c(iVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        com.whoop.domain.model.User user = (com.whoop.domain.model.User) objMo129089c;
        return String.valueOf(user != null ? new Integer(user.getId()) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F0 */
    public final Object m57506F0(InterfaceC30057d<? super String> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f78293y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f78293y = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object objMo129089c = jVar.f78291w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f78293y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            jVar.f78293y = 1;
            objMo129089c = interfaceC40205a.mo129089c(jVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        com.whoop.domain.model.User user = (com.whoop.domain.model.User) objMo129089c;
        return String.valueOf(user != null ? user.getUsername() : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G0 */
    public final Object m57507G0(InterfaceC30057d<Object> interfaceC30057d) {
        k kVar;
        C20838q c20838q;
        String str;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f78294E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f78294E = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object obj = kVar.f78297y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = kVar.f78294E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C20838q c20838q2 = C20838q.f78353a;
            String str2 = this.widgetUrl;
            kVar.f78295w = c20838q2;
            kVar.f78296x = str2;
            kVar.f78294E = 1;
            Object objM57492j0 = m57492j0(kVar);
            if (objM57492j0 == obj2) {
                return obj2;
            }
            c20838q = c20838q2;
            obj = objM57492j0;
            str = str2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) kVar.f78296x;
            c20838q = (C20838q) kVar.f78295w;
            AbstractC34132o.m107864I(obj);
        }
        return c20838q.m57557b(str, (C23465k) obj, this.preferenceHelper);
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final String getWidgetUrl() {
        return this.widgetUrl;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m57509I0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new l(null), 3);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m57510K0() {
        this.chatClient.mo34187b(m57533l0(), m57532k0()).enqueue();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x001d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: N0 */
    public final void m57511N0(List<? extends Uri> uris, Function1 getMimeType) {
        int i13;
        AttachmentMetaData attachmentMetaData;
        AbstractC22676k.m65750j(uris, "uris");
        AbstractC22676k.m65750j(getMimeType, "getMimeType");
        ArrayList arrayList = new ArrayList();
        for (Uri uri : uris) {
            try {
                String str = (String) getMimeType.invoke(uri);
                if (str == null) {
                    str = "image/*";
                }
                try {
                    i13 = 0;
                    try {
                        attachmentMetaData = new AttachmentMetaData(uri, "image", str, null, null, null, 32, null);
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        this.logger.mo85230v(AbstractC11266d.m30461o("Failed to read media URI from picker: ", e.getMessage()), e, new AbstractC30556a.a[i13]);
                        attachmentMetaData = null;
                    } catch (NullPointerException e13) {
                        e = e13;
                        this.logger.mo85230v(AbstractC11266d.m30461o("Failed to read media URI from picker: ", e.getMessage()), e, new AbstractC30556a.a[i13]);
                        attachmentMetaData = null;
                    } catch (SecurityException e14) {
                        e = e14;
                        this.logger.mo85230v(AbstractC11266d.m30461o("Failed to read media URI from picker: ", e.getMessage()), e, new AbstractC30556a.a[i13]);
                        attachmentMetaData = null;
                    }
                } catch (IllegalArgumentException e15) {
                    e = e15;
                    i13 = 0;
                    this.logger.mo85230v(AbstractC11266d.m30461o("Failed to read media URI from picker: ", e.getMessage()), e, new AbstractC30556a.a[i13]);
                    attachmentMetaData = null;
                    if (attachmentMetaData != null) {
                        arrayList.add(attachmentMetaData);
                    }
                } catch (NullPointerException e16) {
                    e = e16;
                    i13 = 0;
                } catch (SecurityException e17) {
                    e = e17;
                    i13 = 0;
                }
            } catch (IllegalArgumentException e18) {
                e = e18;
                i13 = 0;
                this.logger.mo85230v(AbstractC11266d.m30461o("Failed to read media URI from picker: ", e.getMessage()), e, new AbstractC30556a.a[i13]);
                attachmentMetaData = null;
                if (attachmentMetaData != null) {
                    arrayList.add(attachmentMetaData);
                }
            } catch (NullPointerException e19) {
                e = e19;
                i13 = 0;
            } catch (SecurityException e22) {
                e = e22;
                i13 = 0;
            }
            if (attachmentMetaData != null) {
                arrayList.add(attachmentMetaData);
            }
        }
        List<C20839r> list = this.selectedAttachments;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C20839r((AttachmentMetaData) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        list.addAll(arrayList2);
    }

    /* JADX INFO: renamed from: O0 */
    public final List<String> m57512O0(String selectedType) {
        AbstractC22676k.m65750j(selectedType, "selectedType");
        Message message = this.selectedMessage;
        if (message == null) {
            return null;
        }
        List<Reaction> ownReactions = message.getOwnReactions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(ownReactions, 10));
        Iterator<T> it = ownReactions.iterator();
        while (it.hasNext()) {
            arrayList.add(((Reaction) it.next()).getType());
        }
        if (arrayList.contains(selectedType)) {
            m57524f0(message.getId(), selectedType);
            return arrayList;
        }
        m57516Y(message.getId(), selectedType);
        return arrayList;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m57513P0(String reason) {
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new m(reason, null), 3);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m57514Q0(String command) {
        AbstractC22676k.m65750j(command, "command");
        ChannelClient.sendMessage$default(this.chatClient.mo34191f(m57536n0()), new Message(null, AbstractC18489d0.m53370k(m57533l0(), ":", m57532k0()), command, null, this.parentId, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -23, 65535, null), false, 2, null).enqueue();
    }

    /* JADX INFO: renamed from: S0 */
    public final void m57515S0(String messageText) {
        AbstractC22676k.m65750j(messageText, "messageText");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new o(messageText, null), 3);
    }

    /* JADX INFO: renamed from: Y */
    public final void m57516Y(String messageId, String reactionType) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        m49138t(this.reactionAnalyticsLiveData, new C40939a(String.valueOf(this.teamId), messageId, reactionType));
        ChannelClient.sendReaction$default(this.chatClient.mo34191f(m57536n0()), new Reaction(messageId, reactionType, 1, null, null, null, null, null, null, null, null, false, false, null, 16376, null), false, false, 4, null).enqueue(new C20831j(this, reactionType, messageId, 1));
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m57517Z0(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.channelId = str;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m57518a1(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.channelType = str;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m57519b1(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.cid = str;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m57520c1(Message message) {
        this.editMessage = message;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m57521d0() {
        Message message = this.selectedMessage;
        if (message != null) {
            this.chatClient.mo34189d(message.getId()).enqueue(new C20833l(this, 1));
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m57522d1(String str) {
        this.parentId = str;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m57523e1(Message message) {
        this.selectedMessage = message;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m57524f0(String messageId, String reactionType) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        new Reaction(messageId, reactionType, 1, null, null, null, null, null, null, null, null, false, false, null, 16376, null);
        this.chatClient.mo34191f(m57536n0()).deleteReaction(messageId, reactionType).enqueue(new C20831j(this, reactionType, messageId, 0));
    }

    /* JADX INFO: renamed from: f1 */
    public final void m57525f1(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.teamIconUrl = str;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m57526g1(int i13) {
        this.teamId = i13;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h0 */
    public final Object m57527h0(InterfaceC30057d<? super String> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f78260y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f78260y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM125478a = cVar.f78258w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f78260y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125478a);
            C39352a c39352a = this.authManager;
            cVar.f78260y = 1;
            objM125478a = c39352a.m125478a(cVar);
            if (objM125478a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM125478a);
        }
        AuthMaterial authMaterial = (AuthMaterial) objM125478a;
        if (authMaterial != null) {
            return authMaterial.getAccessToken();
        }
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m57528h1(String str) {
        this.widgetUrl = str;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final C1630u0 getAttachmentStatus() {
        return this.attachmentStatus;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m57530i1() {
        ChannelClient channelClientMo34191f = this.chatClient.mo34191f(m57536n0());
        Message message = this.selectedMessage;
        channelClientMo34191f.keystroke(message != null ? message.getId() : null).enqueue();
    }

    /* JADX INFO: renamed from: j1 */
    public final void m57531j1() {
        ChannelClient channelClientMo34191f = this.chatClient.mo34191f(m57536n0());
        Message message = this.selectedMessage;
        channelClientMo34191f.stopTyping(message != null ? message.getId() : null).enqueue();
    }

    /* JADX INFO: renamed from: k0 */
    public final String m57532k0() {
        String str = this.channelId;
        if (str != null) {
            return str;
        }
        AbstractC22676k.m65757q("channelId");
        throw null;
    }

    /* JADX INFO: renamed from: l0 */
    public final String m57533l0() {
        String str = this.channelType;
        if (str != null) {
            return str;
        }
        AbstractC22676k.m65757q("channelType");
        throw null;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final InterfaceC12284b getChatClient() {
        return this.chatClient;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m57535m1(List<Bitmap> localAttachments, String message) {
        AbstractC22676k.m65750j(localAttachments, "localAttachments");
        AbstractC22676k.m65750j(message, "message");
        List<C20839r> list = this.selectedAttachments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C20839r) obj).getDataWidget() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C20839r) it.next()).getDataWidget());
        }
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new r(AbstractC25265s.m74129g1(arrayList2, localAttachments), message, null), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final String m57536n0() {
        String str = this.cid;
        if (str != null) {
            return str;
        }
        AbstractC22676k.m65757q("cid");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n1 */
    public final Object m57537n1(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        s sVar;
        if (interfaceC30057d instanceof s) {
            sVar = (s) interfaceC30057d;
            int i13 = sVar.f78346y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                sVar.f78346y = i13 - Integer.MIN_VALUE;
            } else {
                sVar = new s(interfaceC30057d);
            }
        } else {
            sVar = new s(interfaceC30057d);
        }
        Object objM57505E0 = sVar.f78344w;
        Object obj = EnumC31071a.f128113w;
        int i14 = sVar.f78346y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM57505E0);
            sVar.f78346y = 1;
            objM57505E0 = m57505E0(sVar);
            if (objM57505E0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM57505E0);
        }
        final String str = (String) objM57505E0;
        Disposable disposable = this.streamDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.streamDisposable = this.chatClient.mo34191f(m57536n0()).subscribe(new ChatEventListener() { // from class: iq0.k
            @Override // io.getstream.chat.android.client.ChatEventListener
            public final void onEvent(ChatEvent chatEvent) {
                C20834m.m57495o1(this.f78217w, str, chatEvent);
            }
        });
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final Message getEditMessage() {
        return this.editMessage;
    }

    @Override // hj0.AbstractC17356o, androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.streamDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final AbstractC1615p0 getMessageResponseLiveData() {
        return this.messageResponseLiveData;
    }

    /* JADX INFO: renamed from: r0 */
    public final AbstractC1615p0 m57540r0() {
        return this._messageSendVersion;
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t0 */
    public final Object m57542t0(InterfaceC30057d<? super String> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f78269y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f78269y = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objMo129089c = fVar.f78267w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f78269y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            fVar.f78269y = 1;
            objMo129089c = interfaceC40205a.mo129089c(fVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        com.whoop.domain.model.User user = (com.whoop.domain.model.User) objMo129089c;
        return String.valueOf(user != null ? user.getAvatarUrl() : null);
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final AbstractC1615p0 getReactionAnalyticsLiveData() {
        return this.reactionAnalyticsLiveData;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final C1630u0 getReportMessageStatus() {
        return this.reportMessageStatus;
    }

    /* JADX INFO: renamed from: w0 */
    public final List<C20839r> m57545w0() {
        return this.selectedAttachments;
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final Message getSelectedMessage() {
        return this.selectedMessage;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final C1630u0 getStreamConnectionStatus() {
        return this.streamConnectionStatus;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20834m(InterfaceC12284b interfaceC12284b, C11053a c11053a, C11059g c11059g, InterfaceC34116n interfaceC34116n, PreferenceHelper preferenceHelper, InterfaceC40205a interfaceC40205a, C39352a c39352a, FeatureFlagChecker featureFlagChecker, InterfaceC30063j interfaceC30063j, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC30063j interfaceC30063j2;
        if ((i13 & 256) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j2 = ExecutorC22364d.f87316w;
        } else {
            interfaceC30063j2 = interfaceC30063j;
        }
        this(interfaceC12284b, c11053a, c11059g, interfaceC34116n, preferenceHelper, interfaceC40205a, c39352a, featureFlagChecker, interfaceC30063j2, (i13 & 512) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}

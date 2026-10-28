package hn;

import a00.C0072g;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import androidx.health.platform.client.proto.C1533u;
import bc3.C3058t;
import bh3.InterfaceC3260g;
import c23.InterfaceC3902h;
import c93.InterfaceC4339a;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import g40.InterfaceC15318a0;
import g40.InterfaceC15452z;
import hms.webrtc.CameraSession;
import hms.webrtc.CameraVideoCapturer;
import hms.webrtc.RTCStatsCollectorCallback;
import hms.webrtc.RTCStatsReport;
import i20.C17954j1;
import io.getstream.chat.android.client.helpers.AppSettingManager;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.CompatUserLookupHandler;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.CompatUserLookupHandlerKt;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.UserLookupHandler;
import io.getstream.chat.android.p226ui.feature.gallery.overview.MediaAttachmentGridView;
import io.getstream.chat.android.p226ui.feature.gallery.overview.internal.MediaAttachmentAdapter;
import io.getstream.chat.android.p226ui.feature.gallery.overview.internal.MediaAttachmentDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.LinkAttachmentView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.LinkAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.MessageListScrollHelper;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.UserReactionAdapter;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.UserReactionItem;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.UserReactionsView;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal.ViewReactionsView;
import io.getstream.chat.android.p226ui.feature.pinned.list.PinnedMessageListView;
import io.getstream.chat.android.p226ui.viewmodel.pinned.PinnedMessageListViewModel;
import io.sentry.C20351h5;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20320e4;
import io.sentry.InterfaceC20432n1;
import io.sentry.InterfaceC20642z3;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C20071e0;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.InterfaceC20081h1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SentryPerformanceProvider;
import io.sentry.android.replay.capture.AbstractC20187c;
import io.sentry.android.replay.capture.C20190f;
import io.sentry.android.replay.capture.C20199o;
import io.sentry.util.InterfaceC20583e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import jm.C21779a;
import kf0.C22429d;
import kk0.C22539b;
import lc0.C23821c;
import live.hms.video.audio.BluetoothErrorType;
import live.hms.video.audio.BluetoothErrors;
import live.hms.video.audio.HMSAudioManagerLegacy;
import live.hms.video.connection.HMSConnection;
import live.hms.video.error.HMSException;
import live.hms.video.media.capturers.HMSCameraCapturer;
import live.hms.video.sdk.IErrorListener;
import m63.C25126d;
import m92.C25327j;
import n23.AbstractC26205h;
import o23.InterfaceC27471a;
import om.InterfaceC28022a;
import p005a3.C0237p;
import p009a8.RunnableC0533c;
import p032bc.C2953i;
import p047c9.C4312c;
import p215i9.AbstractC18243s;
import p215i9.C18237m;
import p215i9.InterfaceC18242r;
import p296l5.InterfaceC23343g;
import p344nm.C26827i;
import p344nm.InterfaceC26821c;
import p465rm.C31521c0;
import p516u8.C34610p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.InterfaceC29201n;
import tg3.C33802c;
import ud3.AbstractC34799a1;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: hn.p */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17508p implements InterfaceC17512t, InterfaceC15452z, InterfaceC18242r, InterfaceC27471a, InterfaceC29201n, CompatUserLookupHandler, MediaAttachmentAdapter.MediaAttachmentClickListener, MediaAttachmentGridView.MediaClickListener, LinkAttachmentView.LinkPreviewClickListener, MessageListView.OnScrollToBottomHandler, UserReactionAdapter.UserReactionClickListener, ReactionClickListener, PinnedMessageListView.LoadMoreListener, InterfaceC23343g, InterfaceC20320e4, InterfaceC20583e, InterfaceC20081h1, InterfaceC20642z3, InterfaceC3902h, InterfaceC3260g, IErrorListener, BluetoothErrors, RTCStatsCollectorCallback, CameraVideoCapturer.CameraSessionCallback, InterfaceC28022a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67737w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f67738x;

    public /* synthetic */ C17508p(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC20432n1 interfaceC20432n1) {
        this.f67737w = 14;
        this.f67738x = interfaceC20432n1;
    }

    @Override // hn.InterfaceC17512t
    /* JADX INFO: renamed from: a */
    public int mo49749a(Object obj) {
        switch (this.f67737w) {
            case 0:
                try {
                    return ((C17504l) obj).m49695c((C31521c0) this.f67738x) ? 1 : 0;
                } catch (MediaCodecUtil$DecoderQueryException unused) {
                    return -1;
                }
            default:
                C34610p c34610p = (C34610p) this.f67738x;
                C18237m c18237m = (C18237m) obj;
                String str = c18237m.f70949b;
                return ((str.equals(c34610p.f145783n) || str.equals(AbstractC18243s.m52548b(c34610p))) && c18237m.m52511c(c34610p, false) && c18237m.m52512d(c34610p)) ? 1 : 0;
        }
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        switch (this.f67737w) {
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C22539b.m65147i((C22429d) this.f67738x, obj);
            default:
                return C25327j.m74399u((C23821c) this.f67738x, obj);
        }
    }

    @Override // io.sentry.InterfaceC20642z3
    /* JADX INFO: renamed from: c */
    public void mo11180c(C0237p c0237p) {
        ((InterfaceC20259b1) this.f67738x).mo56213x(new C0237p(9));
    }

    @Override // pg3.InterfaceC29201n
    public Object convert(Object obj) {
        return ((C33802c) this.f67738x).convert((AbstractC34799a1) obj);
    }

    @Override // g40.InterfaceC15452z
    public InterfaceC15318a0 create() {
        return (C17954j1) ((C25126d) this.f67738x).f98485y;
    }

    @Override // io.sentry.android.core.InterfaceC20081h1
    /* JADX INFO: renamed from: e */
    public void mo13593e() {
        FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.f67738x;
        WeakReference weakReference = feedbackShakeIntegration.f75254z;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        Boolean bool = C20071e0.f75391E.f75395z;
        if (activity == null || feedbackShakeIntegration.f75253y == null || feedbackShakeIntegration.f75249E || Boolean.TRUE.equals(bool)) {
            return;
        }
        activity.runOnUiThread(new RunnableC0533c(29, feedbackShakeIntegration, activity));
    }

    @Override // om.InterfaceC28022a
    public Object execute() {
        C26827i c26827i = (C26827i) ((InterfaceC26821c) this.f67738x);
        c26827i.getClass();
        int i13 = C21779a.f83901e;
        C0072g c0072g = new C0072g(19, false);
        c0072g.f223x = null;
        c0072g.f224y = new ArrayList();
        c0072g.f225z = null;
        c0072g.f221E = "";
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseM80058b = c26827i.m80058b();
        sQLiteDatabaseM80058b.beginTransaction();
        try {
            C21779a c21779a = (C21779a) C26827i.m80055J(sQLiteDatabaseM80058b.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C2953i(c26827i, map, c0072g, 12));
            sQLiteDatabaseM80058b.setTransactionSuccessful();
            return c21779a;
        } finally {
            sQLiteDatabaseM80058b.endTransaction();
        }
    }

    @Override // io.sentry.InterfaceC20320e4
    /* JADX INFO: renamed from: h */
    public void mo11182h(InterfaceC20259b1 it) {
        switch (this.f67737w) {
            case 14:
                it.mo56192N(new C4312c(15, (InterfaceC20432n1) this.f67738x, it));
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C20190f c20190f = (C20190f) this.f67738x;
                AbstractC22676k.m65750j(it, "it");
                it.mo56209t(c20190f.m56106g());
                break;
            default:
                C20199o c20199o = (C20199o) this.f67738x;
                AbstractC22676k.m65750j(it, "it");
                it.mo56209t(c20199o.m56106g());
                String strMo56179A = it.mo56179A();
                c20199o.f75842l.setValue(c20199o, AbstractC20187c.f75830q[2], strMo56179A != null ? AbstractC39414r.m125860F0('.', strMo56179A, strMo56179A) : null);
                break;
        }
    }

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.CompatUserLookupHandler
    public InterfaceC4339a handleCompatUserLookup(String str, Function1 function1) {
        return CompatUserLookupHandlerKt.m55019a((UserLookupHandler) this.f67738x, str, function1);
    }

    @Override // io.sentry.util.InterfaceC20583e
    /* JADX INFO: renamed from: j */
    public Object mo19991j() {
        int i13 = this.f67737w;
        Object obj = this.f67738x;
        switch (i13) {
            case 15:
                return ((SentryAndroidOptions) obj).getExecutorService();
            default:
                C20351h5 c20351h5 = (C20351h5) obj;
                int i14 = SentryPerformanceProvider.f75277F;
                return c20351h5;
        }
    }

    @Override // live.hms.video.audio.BluetoothErrors
    public void onBluetoothError(BluetoothErrorType bluetoothErrorType) {
        ((HMSAudioManagerLegacy) this.f67738x).lambda$start$2(bluetoothErrorType);
    }

    @Override // io.getstream.chat.android.ui.feature.gallery.overview.MediaAttachmentGridView.MediaClickListener
    public void onClick(int i13) {
        MediaAttachmentDialogFragment.m55172A((MediaAttachmentDialogFragment) this.f67738x, i13);
    }

    @Override // live.hms.video.sdk.IErrorListener
    public void onError(HMSException hMSException) {
        ((IErrorListener) this.f67738x).onError(hMSException);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.LinkAttachmentView.LinkPreviewClickListener
    public void onLinkPreviewClick(String str) {
        LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$9((LinkAttachmentsViewHolder) this.f67738x, str);
    }

    @Override // io.getstream.chat.android.ui.feature.pinned.list.PinnedMessageListView.LoadMoreListener
    public void onLoadMoreRequested() {
        ((PinnedMessageListViewModel) this.f67738x).loadMore();
    }

    @Override // io.getstream.chat.android.ui.feature.gallery.overview.internal.MediaAttachmentAdapter.MediaAttachmentClickListener
    public void onMediaAttachmentClick(int i13) {
        MediaAttachmentGridView.m55163a((MediaAttachmentGridView) this.f67738x, i13);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener
    public void onReactionClick(String str) {
        ViewReactionsView.applyStyle$lambda$2((ViewReactionsView) this.f67738x, str);
    }

    @Override // o23.InterfaceC27471a
    public void onResult(AbstractC26205h abstractC26205h) {
        AppSettingManager.loadAppSettings$lambda$2((AppSettingManager) this.f67738x, abstractC26205h);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnScrollToBottomHandler
    public void onScrollToBottom() {
        MessageListScrollHelper.onScrollToBottomHandler$lambda$0((MessageListScrollHelper) this.f67738x);
    }

    @Override // hms.webrtc.CameraVideoCapturer.CameraSessionCallback
    public void onSetupDone(CameraSession cameraSession) {
        HMSCameraCapturer._init_$lambda$1((HMSCameraCapturer) this.f67738x, cameraSession);
    }

    @Override // hms.webrtc.RTCStatsCollectorCallback
    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        HMSConnection.getStats$lambda$1((C3058t) this.f67738x, rTCStatsReport);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.reactions.user.internal.UserReactionAdapter.UserReactionClickListener
    public void onUserReactionClick(UserReactionItem userReactionItem) {
        UserReactionsView.userReactionsAdapter$lambda$0((UserReactionsView) this.f67738x, userReactionItem);
    }

    public /* synthetic */ C17508p(Object obj, int i13) {
        this.f67737w = i13;
        this.f67738x = obj;
    }
}

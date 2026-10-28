package aq0;

import a20.C0167g;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.recyclerview.widget.AbstractC1692i1;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.teams.ChatChannel;
import com.whoop.domain.model.teams.Team;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq0.AbstractC12285c;
import eq0.AbstractC13452d0;
import eq0.AbstractC13480i3;
import eq0.AbstractC13502n0;
import eq0.AbstractC13531t;
import eq0.AbstractC13550x;
import eq0.AbstractC13557y2;
import ge3.AbstractC15751g;
import gy0.AbstractC16273b;
import hj0.AbstractC17354m;
import in2.AbstractC18737i;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.core.ExperimentalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryDestination;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryItem;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryResultItem;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.viewmodel.messages.ChannelViewModelFactory;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageComposerViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModelBinding;
import iq0.AbstractC20830i;
import iq0.AbstractC20840s;
import iq0.C20823d;
import iq0.C20834m;
import iq0.C20839r;
import iq0.C20841t;
import iq0.C20844w;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import jf3.C21647a;
import jq0.C21886a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import mq0.C25880e;
import mq0.InterfaceC25883h;
import nf3.C26669a;
import od1.InterfaceC27837a0;
import or2.AbstractC28188o1;
import p000.C28503p;
import p003a1.C0103b;
import p012ab.C0680g0;
import p114eb.AbstractC12939a0;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p236j.AbstractC21065d;
import p267k.C22083d;
import p399pb.InterfaceC29049f;
import p404pq.AbstractC29455c;
import p429ql.AbstractC30457c;
import p464rl.InterfaceC31508c;
import p505ts.AbstractC34132o;
import p513u4.AbstractC34523k;
import p543v4.C35643b;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32416g;
import uf3.C34911a;
import ug.AbstractC34924m;
import vf3.InterfaceC35951a;
import vq0.C36278b;
import vu1.AbstractC36510a;
import vu1.AbstractC36512c;
import vu1.AbstractC36518i;
import xp0.AbstractC38499a0;
import xp0.AbstractC38503c0;
import xp0.AbstractC38505d0;
import xp0.AbstractC38507e0;
import xp0.AbstractC38529z;
import yb3.C39412p;
import z82.C40191e;
import zp0.C40939a;

/* JADX INFO: renamed from: aq0.q */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalStreamChatApi
@Metadata(m65680d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u000b*\u0004¥\u0001©\u0001\b\u0007\u0018\u0000 °\u00012\u00020\u00012\u00020\u0002:\u0002±\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0004J\u0010\u0010#\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010\u0004J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u0010\u0004J\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b:\u00102J\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000fH\u0002¢\u0006\u0004\b>\u0010\u0004J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000fH\u0002¢\u0006\u0004\bC\u0010\u0004J\u000f\u0010D\u001a\u00020\u000fH\u0002¢\u0006\u0004\bD\u0010\u0004J\u0017\u0010G\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u000fH\u0002¢\u0006\u0004\bI\u0010\u0004J\u0017\u0010K\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020?H\u0002¢\u0006\u0004\bK\u0010BJ\u000f\u0010L\u001a\u00020\u000fH\u0002¢\u0006\u0004\bL\u0010\u0004J\u000f\u0010M\u001a\u00020\u000fH\u0002¢\u0006\u0004\bM\u0010\u0004J'\u0010P\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020E2\u0006\u0010O\u001a\u00020N2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bP\u0010QJ\u001d\u0010T\u001a\u00020\u000f2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000b0RH\u0002¢\u0006\u0004\bT\u0010UJ%\u0010W\u001a\u00020\u000f2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000b0R2\u0006\u0010V\u001a\u000206H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bY\u00102J\u0017\u0010Z\u001a\u0002062\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u000206H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000fH\u0002¢\u0006\u0004\b^\u0010\u0004J\u0017\u0010_\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b_\u00102R\u001a\u0010d\u001a\u00020?8\u0016X\u0096D¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\"\u0010p\u001a\u0010\u0012\f\u0012\n m*\u0004\u0018\u00010l0l0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR+\u0010y\u001a\u00020q2\u0006\u0010r\u001a\u00020q8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010g\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010\u0091\u0001\u001a\u0002068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0089\u0001R \u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0001\u0010g\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010g\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001f\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0R8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001f\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0R8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009d\u0001R\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R'\u0010¯\u0001\u001a\u00020?2\u0006\u0010J\u001a\u00020?8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b\u00ad\u0001\u0010c\"\u0005\b®\u0001\u0010B¨\u0006³\u0001²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\r\u0010²\u0001\u001a\u00020~8\nX\u008a\u0084\u0002"}, m65681d2 = {"Laq0/q;", "Lhj0/m;", "Lmq0/h;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Liq0/t;", "data", "c", "(Liq0/t;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "attachmentMetaData", "Landroid/graphics/Bitmap;", "d1", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Landroid/graphics/Bitmap;", "onPause", "onDestroyView", "S0", "H2", "I2", "e2", "u1", "k2", "w1", "(Lq83/d;)Ljava/lang/Object;", "i2", "a1", "Q1", "k1", "y2", "z2", "Liq0/r;", "attachment", "V0", "(Liq0/r;)V", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;", "messageListViewModel", "u2", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V", "X0", "S1", "g2", "", "visible", "l1", "(Z)V", "T1", "Leq0/y2;", "m1", "()Leq0/y2;", "b2", "", "reaction", "x2", "(Ljava/lang/String;)V", "E2", "T0", "Lio/getstream/chat/android/models/Message;", "message", "n2", "(Lio/getstream/chat/android/models/Message;)V", "W0", "text", "K2", "b1", "Z0", "", "selectedIndex", "p2", "(Lio/getstream/chat/android/models/Message;ILio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "j1", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "showBottomSheet", "G2", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Z)V", "C2", "m2", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)Z", "l2", "()Z", "J2", "c1", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Liq0/m;", "x", "Ll83/h;", "e1", "()Liq0/m;", "communityChatViewModel", "Lj/d;", "Lj/m;", "kotlin.jvm.PlatformType", "y", "Lj/d;", "pickMediaLauncher", "Leq0/n0;", "<set-?>", "z", "Lcom/whoop/ui/b;", "f1", "()Leq0/n0;", "A2", "(Leq0/n0;)V", "dataBinding", "Liq0/d;", "E", "Liq0/d;", "composerSuggestionsController", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "F", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "messageComposerViewModel", "G", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;", "Lg/t;", "H", "Lg/t;", "chatBackPressCallback", "I", "Z", "isChatUiInitialized", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "J", "g1", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "K", "isInternationalizedTeamViews", "Lod1/a0;", "L", "i1", "()Lod1/a0;", "userManager", "Lj02/o0;", "M", "getNavigator", "()Lj02/o0;", "navigator", "N", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "messageActionBottomSheetBehavior", "O", "chatReportBottomSheetBehavior", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryDestination;", "P", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryDestination;", "attachmentGalleryDestination", "aq0/q$c", "Q", "Laq0/q$c;", "bottomSheetCallBack", "aq0/q$m", "R", "Laq0/q$m;", "messageComposeTextWatcher", "h1", "B2", "messageText", "S", "a", "composerViewModel", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1906q extends AbstractC17354m implements InterfaceC25883h {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private C20823d composerSuggestionsController;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private MessageComposerViewModel messageComposerViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private MessageListViewModel messageListViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private AbstractC14917t chatBackPressCallback;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isChatUiInitialized;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final boolean isInternationalizedTeamViews;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h userManager;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private BottomSheetBehavior<View> messageActionBottomSheetBehavior;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private BottomSheetBehavior<View> chatReportBottomSheetBehavior;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private AttachmentGalleryDestination attachmentGalleryDestination;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final c bottomSheetCallBack;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final m messageComposeTextWatcher;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "ChatFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h communityChatViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new t(this, null, new s(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AbstractC21065d pickMediaLauncher;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C10462b dataBinding;

    /* JADX INFO: renamed from: T */
    static final /* synthetic */ InterfaceC21493z[] f7468T = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C1906q.class, "dataBinding", "getDataBinding()Lcom/whoop/community/databinding/FragmentChatBinding;", 0))};

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: U */
    public static final int f7469U = 8;

    /* JADX INFO: renamed from: V */
    private static final C39412p f7470V = new C39412p("^\\/(?i)giphy(?-i)\\s+.+$");

    /* JADX INFO: renamed from: aq0.q$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Laq0/q$a;", "", "<init>", "()V", "Lcom/whoop/domain/model/teams/Team;", "team", "", "parentMessageId", "widgetUrl", "Laq0/q;", "a", "(Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;Ljava/lang/String;)Laq0/q;", "KEY_WIDGET_URL", "Ljava/lang/String;", "REPORT_ABUSE", "REPORT_INAPPROPRIATE", "Lyb3/p;", "GIPHY_COMMAND_REGEX", "Lyb3/p;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1906q m5837a(Team team, String parentMessageId, String widgetUrl) {
            AbstractC22676k.m65750j(team, "team");
            C1906q c1906q = new C1906q();
            Bundle bundleObtainArguments = c1906q.obtainArguments();
            ChatChannel chatChannel = team.getChatChannel();
            bundleObtainArguments.putString("channelId", chatChannel != null ? chatChannel.getId() : null);
            Bundle bundleObtainArguments2 = c1906q.obtainArguments();
            ChatChannel chatChannel2 = team.getChatChannel();
            bundleObtainArguments2.putString("channelType", chatChannel2 != null ? chatChannel2.getType() : null);
            Bundle bundleObtainArguments3 = c1906q.obtainArguments();
            ChatChannel chatChannel3 = team.getChatChannel();
            bundleObtainArguments3.putString("cid", chatChannel3 != null ? chatChannel3.getCid() : null);
            c1906q.obtainArguments().putString("parentMessageId", parentMessageId);
            c1906q.obtainArguments().putInt("chatTeamId", team.getId());
            c1906q.obtainArguments().putString("chatTeamIconUrl", team.getIconUrl());
            c1906q.obtainArguments().putString("widgetUrl", widgetUrl);
            return c1906q;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: aq0.q$b */
    @InterfaceC32271e(m100429c = "com.whoop.community.chat.ChatFragment$addGlobalShareWidget$1", m100430f = "ChatFragment.kt", m100431l = {227}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f7489E;

        /* JADX INFO: renamed from: w */
        Object f7491w;

        /* JADX INFO: renamed from: x */
        Object f7492x;

        /* JADX INFO: renamed from: y */
        Object f7493y;

        /* JADX INFO: renamed from: z */
        int f7494z;

        /* JADX INFO: renamed from: aq0.q$b$a */
        @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"aq0/q$b$a", "Lql/c;", "Landroid/graphics/Bitmap;", "resource", "Lrl/c;", "transition", "Ll83/a0;", "i", "(Landroid/graphics/Bitmap;Lrl/c;)V", "Landroid/graphics/drawable/Drawable;", "placeholder", "e", "(Landroid/graphics/drawable/Drawable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC30457c {

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C1906q f7495z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1906q c1906q) {
                super(0);
                this.f7495z = c1906q;
            }

            @Override // p429ql.InterfaceC30463i
            /* JADX INFO: renamed from: e */
            public void mo5839e(Drawable placeholder) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p429ql.InterfaceC30463i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public void mo5838b(Bitmap resource, InterfaceC31508c transition) {
                AbstractC22676k.m65750j(resource, "resource");
                this.f7495z.m5770e1().m57545w0().add(new C20839r(null, resource, 1, 0 == true ? 1 : 0));
                this.f7495z.m5759a1();
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C1906q.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C1906q c1906q;
            C4964f c4964f;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7489E;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (C1906q.this.m5770e1().getWidgetUrl() != null) {
                    c1906q = C1906q.this;
                    C4964f c4964fM15546j = ComponentCallbacks2C4960b.m15529e(c1906q.requireContext()).m15546j();
                    C20834m c20834mM5770e1 = c1906q.m5770e1();
                    this.f7491w = c1906q;
                    this.f7492x = null;
                    this.f7493y = c4964fM15546j;
                    this.f7494z = 0;
                    this.f7489E = 1;
                    Object objM57507G0 = c20834mM5770e1.m57507G0(this);
                    if (objM57507G0 == enumC31071a) {
                        return enumC31071a;
                    }
                    c4964f = c4964fM15546j;
                    obj = objM57507G0;
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4964f = (C4964f) this.f7493y;
            c1906q = (C1906q) this.f7491w;
            AbstractC34132o.m107864I(obj);
            c4964f.f20321Y = obj;
            c4964f.f20323a0 = true;
            c4964f.m15538z(new a(c1906q));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: aq0.q$c */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"aq0/q$c", "Lpq/c;", "Landroid/view/View;", "bottomSheet", "", "newState", "Ll83/a0;", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC29455c {
        public c() {
        }

        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: b */
        public void mo5841b(View bottomSheet, float slideOffset) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        }

        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: c */
        public void mo5842c(View bottomSheet, int newState) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
            if (newState == 3) {
                View transparentView = C1906q.this.m5773f1().f47485g;
                AbstractC22676k.m65749i(transparentView, "transparentView");
                transparentView.setVisibility(0);
            } else if (newState == 4 || newState == 5) {
                View transparentView2 = C1906q.this.m5773f1().f47485g;
                AbstractC22676k.m65749i(transparentView2, "transparentView");
                transparentView2.setVisibility(8);
            }
            C1906q.this.m5708J2();
        }
    }

    /* JADX INFO: renamed from: aq0.q$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f7497w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f7497w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f7497w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: aq0.q$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f7498w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f7499x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f7500y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f7501z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f7498w = componentCallbacks;
            this.f7499x = interfaceC35951a;
            this.f7500y = interfaceC4339a;
            this.f7501z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel] */
        @Override // c93.InterfaceC4339a
        public final MessageListViewModel invoke() {
            return AbstractC34132o.m107857B(this.f7498w, this.f7499x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(MessageListViewModel.class), this.f7500y, this.f7501z);
        }
    }

    /* JADX INFO: renamed from: aq0.q$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f7502w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f7502w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f7502w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: aq0.q$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f7503w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f7504x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f7505y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f7506z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f7503w = componentCallbacks;
            this.f7504x = interfaceC35951a;
            this.f7505y = interfaceC4339a;
            this.f7506z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, io.getstream.chat.android.ui.viewmodel.messages.MessageComposerViewModel] */
        @Override // c93.InterfaceC4339a
        public final MessageComposerViewModel invoke() {
            return AbstractC34132o.m107857B(this.f7503w, this.f7504x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(MessageComposerViewModel.class), this.f7505y, this.f7506z);
        }
    }

    /* JADX INFO: renamed from: aq0.q$h */
    @InterfaceC32271e(m100429c = "com.whoop.community.chat.ChatFragment$initChat$11$1", m100430f = "ChatFragment.kt", m100431l = {429}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f7507w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Message f7509y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Message message, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7509y = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C1906q.this.new h(this.f7509y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7507w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C1906q.this.m5788k1();
                C1906q.this.m5770e1().m57523e1(this.f7509y);
                C20834m c20834mM5770e1 = C1906q.this.m5770e1();
                this.f7507w = 1;
                obj = c20834mM5770e1.m57505E0(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            boolean zM65745e = AbstractC22676k.m65745e(obj, this.f7509y.getUser().getId());
            TextView messageActionDelete = C1906q.this.m5773f1().f47480b.f47782k;
            AbstractC22676k.m65749i(messageActionDelete, "messageActionDelete");
            messageActionDelete.setVisibility(zM65745e ? 0 : 8);
            TextView messageActionEdit = C1906q.this.m5773f1().f47480b.f47783l;
            AbstractC22676k.m65749i(messageActionEdit, "messageActionEdit");
            messageActionEdit.setVisibility(zM65745e ? 0 : 8);
            TextView messageActionReport = C1906q.this.m5773f1().f47480b.f47787p;
            AbstractC22676k.m65749i(messageActionReport, "messageActionReport");
            messageActionReport.setVisibility(!zM65745e ? 0 : 8);
            TextView messageActionReply = C1906q.this.m5773f1().f47480b.f47786o;
            AbstractC22676k.m65749i(messageActionReply, "messageActionReply");
            messageActionReply.setVisibility(AbstractC12285c.m34194c(this.f7509y) ? 8 : 0);
            C40191e eventDispatcher = C1906q.this.getEventDispatcher();
            String strValueOf = String.valueOf(C1906q.this.m5770e1().getTeamId());
            Message messageM57546x0 = C1906q.this.m5770e1().getSelectedMessage();
            eventDispatcher.m129008P0(strValueOf, "Open", messageM57546x0 != null ? AbstractC12285c.m34194c(messageM57546x0) : false);
            C1906q c1906q = C1906q.this;
            BottomSheetBehavior bottomSheetBehavior = c1906q.messageActionBottomSheetBehavior;
            if (bottomSheetBehavior != null) {
                c1906q.m5696G2(bottomSheetBehavior, true);
                return C23454a0.f92919a;
            }
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
    }

    /* JADX INFO: renamed from: aq0.q$i */
    @InterfaceC32271e(m100429c = "com.whoop.community.chat.ChatFragment", m100430f = "ChatFragment.kt", m100431l = {287, 305, 306}, m100432m = "initChat", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f7510E;

        /* JADX INFO: renamed from: G */
        int f7512G;

        /* JADX INFO: renamed from: w */
        Object f7513w;

        /* JADX INFO: renamed from: x */
        Object f7514x;

        /* JADX INFO: renamed from: y */
        Object f7515y;

        /* JADX INFO: renamed from: z */
        Object f7516z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f7510E = obj;
            this.f7512G |= Integer.MIN_VALUE;
            return C1906q.this.m5824w1(this);
        }
    }

    /* JADX INFO: renamed from: aq0.q$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class j extends C22672i implements Function1 {
        public j(Object obj) {
            super(1, 0, C1906q.class, obj, "cancelAttachment", "cancelAttachment(Lcom/whoop/community/presentation/chat/CustomAttachmentMetaData;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m5843a(C20839r p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C1906q) this.receiver).m5744V0(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5843a((C20839r) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: aq0.q$k */
    @InterfaceC32271e(m100429c = "com.whoop.community.chat.ChatFragment$initStreamConnection$1$1", m100430f = "ChatFragment.kt", m100431l = {258}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f7517w;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C1906q.this.new k(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7517w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C1906q c1906q = C1906q.this;
                this.f7517w = 1;
                if (c1906q.m5824w1(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: aq0.q$l */
    @InterfaceC32271e(m100429c = "com.whoop.community.chat.ChatFragment$initUserProfileImage$1", m100430f = "ChatFragment.kt", m100431l = {273}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f7519w;

        /* JADX INFO: renamed from: x */
        int f7520x;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C1906q.this.new l(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ComponentCallbacks2C4966h componentCallbacks2C4966h;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7520x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C1906q c1906q = C1906q.this;
                ComponentCallbacks2C4966h componentCallbacks2C4966hM75568g = ComponentCallbacks2C4960b.m15528d(c1906q.getContext()).m75568g(c1906q);
                C20834m c20834mM5770e1 = C1906q.this.m5770e1();
                this.f7519w = componentCallbacks2C4966hM75568g;
                this.f7520x = 1;
                Object objM57542t0 = c20834mM5770e1.m57542t0(this);
                if (objM57542t0 == enumC31071a) {
                    return enumC31071a;
                }
                componentCallbacks2C4966h = componentCallbacks2C4966hM75568g;
                obj = objM57542t0;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                componentCallbacks2C4966h = (ComponentCallbacks2C4966h) this.f7519w;
                AbstractC34132o.m107864I(obj);
            }
            ((C4964f) ((C4964f) componentCallbacks2C4966h.m15549m((String) obj).m89314d(C40786k.f175894e)).m89319j(AbstractC36512c.f156071n)).m15537y(C1906q.this.m5773f1().f47482d.f47245i);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: aq0.q$m */
    @Metadata(m65680d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"aq0/q$m", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Ll83/a0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements TextWatcher {
        public m() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s13) {
            C20823d c20823d = C1906q.this.composerSuggestionsController;
            if (c20823d != null) {
                c20823d.m57437k(String.valueOf(s13));
            }
            C1906q.this.m5712K2(String.valueOf(s13));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s13, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s13, int start, int before, int count) {
            if (count > 0) {
                C1906q.this.m5770e1().m57530i1();
            } else {
                C1906q.this.m5770e1().m57531j1();
            }
        }
    }

    /* JADX INFO: renamed from: aq0.q$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f7523w;

        public n(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f7523w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f7523w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7523w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: aq0.q$o */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"aq0/q$o", "Lg/t;", "Ll83/a0;", "d", "()V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC14917t {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ MessageListViewModel f7525e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(MessageListViewModel messageListViewModel) {
            super(false);
            this.f7525e = messageListViewModel;
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            BottomSheetBehavior bottomSheetBehavior = C1906q.this.messageActionBottomSheetBehavior;
            if (bottomSheetBehavior == null) {
                AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
                throw null;
            }
            if (bottomSheetBehavior.f20784L == 3) {
                C1906q c1906q = C1906q.this;
                BottomSheetBehavior bottomSheetBehavior2 = c1906q.messageActionBottomSheetBehavior;
                if (bottomSheetBehavior2 != null) {
                    c1906q.m5785j1(bottomSheetBehavior2);
                    return;
                } else {
                    AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
                    throw null;
                }
            }
            BottomSheetBehavior bottomSheetBehavior3 = C1906q.this.chatReportBottomSheetBehavior;
            if (bottomSheetBehavior3 == null) {
                AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
                throw null;
            }
            if (bottomSheetBehavior3.f20784L != 3) {
                if (C1906q.this.m5795m2(this.f7525e)) {
                    C1906q.this.m5765c1(this.f7525e);
                }
            } else {
                C1906q c1906q2 = C1906q.this;
                BottomSheetBehavior bottomSheetBehavior4 = c1906q2.chatReportBottomSheetBehavior;
                if (bottomSheetBehavior4 != null) {
                    c1906q2.m5696G2(bottomSheetBehavior4, false);
                } else {
                    AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: aq0.q$p */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f7526w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f7527x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f7528y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f7526w = componentCallbacks;
            this.f7527x = interfaceC35951a;
            this.f7528y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f7526w;
            InterfaceC35951a interfaceC35951a = this.f7527x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f7528y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: aq0.q$q */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f7529w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f7530x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f7531y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f7529w = componentCallbacks;
            this.f7530x = interfaceC35951a;
            this.f7531y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od1.a0] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27837a0 invoke() {
            ComponentCallbacks componentCallbacks = this.f7529w;
            InterfaceC35951a interfaceC35951a = this.f7530x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f7531y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27837a0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: aq0.q$r */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f7532w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f7533x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f7534y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f7532w = componentCallbacks;
            this.f7533x = interfaceC35951a;
            this.f7534y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f7532w;
            InterfaceC35951a interfaceC35951a = this.f7533x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f7534y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: aq0.q$s */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f7535w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f7535w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f7535w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: aq0.q$t */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f7536w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f7537x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f7538y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f7539z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f7536w = componentCallbacks;
            this.f7537x = interfaceC35951a;
            this.f7538y = interfaceC4339a;
            this.f7539z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, iq0.m] */
        @Override // c93.InterfaceC4339a
        public final C20834m invoke() {
            return AbstractC34132o.m107857B(this.f7536w, this.f7537x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C20834m.class), this.f7538y, this.f7539z);
        }
    }

    public C1906q() {
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$PickMultipleVisualMedia((Object) null), new C1904o(this, 0));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.pickMediaLauncher = abstractC21065dRegisterForActivityResult;
        this.dataBinding = AbstractC10463c.m26725b(this, new C1905p(0));
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.featureFlagRepository = AbstractC30060g.m92087G(enumC23463i, new p(this, null, null));
        this.isInternationalizedTeamViews = m5776g1().isFeatureEnabled(FeatureFlagRepositoryKt.INTERNATIONALIZED_TEAM_VIEWS);
        this.userManager = AbstractC30060g.m92087G(enumC23463i, new q(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new r(this, null, new C1891b(this, 1)));
        this.bottomSheetCallBack = new c();
        this.messageComposeTextWatcher = new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final boolean m5674A1(C20839r c20839r) {
        return c20839r.getStreamMetaData() != null;
    }

    /* JADX INFO: renamed from: A2 */
    private final void m5675A2(AbstractC13502n0 abstractC13502n0) {
        this.dataBinding.setValue(this, f7468T[0], abstractC13502n0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final boolean m5677B1(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: renamed from: B2 */
    private final void m5678B2(String str) {
        EditText messageCompose = m5773f1().f47482d.f47240d;
        AbstractC22676k.m65749i(messageCompose, "messageCompose");
        messageCompose.removeTextChangedListener(this.messageComposeTextWatcher);
        messageCompose.requestFocus();
        messageCompose.setText(str);
        Editable text = messageCompose.getText();
        messageCompose.setSelection(text != null ? text.length() : 0);
        messageCompose.addTextChangedListener(this.messageComposeTextWatcher);
        m5712K2(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final Bitmap m5680C1(C1906q c1906q, C20839r c20839r) {
        AttachmentMetaData attachmentMetaDataM57559b = c20839r.getStreamMetaData();
        AbstractC22676k.m65747g(attachmentMetaDataM57559b);
        return c1906q.m5836d1(attachmentMetaDataM57559b);
    }

    /* JADX INFO: renamed from: C2 */
    private final void m5681C2(MessageListViewModel messageListViewModel) {
        o oVar = new o(messageListViewModel);
        this.chatBackPressCallback = oVar;
        C14923z onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.m43015a(viewLifecycleOwner, oVar);
        messageListViewModel.getMode().observe(getViewLifecycleOwner(), new n(new C1890a(this, 14)));
        m5708J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final Bitmap m5683D1(Function1 function1, Object obj) {
        return (Bitmap) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final C23454a0 m5684D2(C1906q c1906q, MessageMode messageMode) {
        if (messageMode instanceof MessageMode.Normal) {
            c1906q.m5770e1().m57522d1(null);
        }
        c1906q.m5708J2();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final void m5687E1(C1906q c1906q, View view) {
        C40191e eventDispatcher = c1906q.getEventDispatcher();
        String strValueOf = String.valueOf(c1906q.m5770e1().getTeamId());
        Message messageM57546x0 = c1906q.m5770e1().getSelectedMessage();
        eventDispatcher.m128977A(strValueOf, messageM57546x0 != null ? AbstractC12285c.m34194c(messageM57546x0) : false, "Compose", "Team Chat - Compose");
    }

    /* JADX INFO: renamed from: E2 */
    private final void m5688E2() {
        BottomSheetBehavior<View> bottomSheetBehaviorM15688O = BottomSheetBehavior.m15688O(m5773f1().f47480b.f47785n);
        this.messageActionBottomSheetBehavior = bottomSheetBehaviorM15688O;
        bottomSheetBehaviorM15688O.m15700V(0);
        BottomSheetBehavior<View> bottomSheetBehavior = this.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        bottomSheetBehavior.m15701W(5);
        BottomSheetBehavior<View> bottomSheetBehaviorM15688O2 = BottomSheetBehavior.m15688O(m5773f1().f47481c.f47650f);
        this.chatReportBottomSheetBehavior = bottomSheetBehaviorM15688O2;
        bottomSheetBehaviorM15688O2.m15700V(0);
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.chatReportBottomSheetBehavior;
        if (bottomSheetBehavior2 == null) {
            AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
            throw null;
        }
        bottomSheetBehavior2.m15701W(5);
        m5773f1().f47485g.setOnClickListener(new ViewOnClickListenerC1896g(this, 0));
        BottomSheetBehavior<View> bottomSheetBehavior3 = this.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior3 == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        bottomSheetBehavior3.m15690I(this.bottomSheetCallBack);
        BottomSheetBehavior<View> bottomSheetBehavior4 = this.chatReportBottomSheetBehavior;
        if (bottomSheetBehavior4 != null) {
            bottomSheetBehavior4.m15690I(this.bottomSheetCallBack);
        } else {
            AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final C23454a0 m5691F1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.pickMediaLauncher.mo4052a(AbstractC32416g.m101149f(C22083d.f85640a), null);
        C40191e eventDispatcher = c1906q.getEventDispatcher();
        String strValueOf = String.valueOf(c1906q.m5770e1().getTeamId());
        Message messageM57546x0 = c1906q.m5770e1().getSelectedMessage();
        eventDispatcher.m128977A(strValueOf, messageM57546x0 != null ? AbstractC12285c.m34194c(messageM57546x0) : false, "Attach Media", "Team Chat - Add Attachment");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final void m5692F2(C1906q c1906q, View view) {
        BottomSheetBehavior<View> bottomSheetBehavior = c1906q.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        if (bottomSheetBehavior.f20784L == 3) {
            if (bottomSheetBehavior == null) {
                AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
                throw null;
            }
            c1906q.m5785j1(bottomSheetBehavior);
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = c1906q.chatReportBottomSheetBehavior;
        if (bottomSheetBehavior2 == null) {
            AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
            throw null;
        }
        if (bottomSheetBehavior2.f20784L == 3) {
            if (bottomSheetBehavior2 != null) {
                c1906q.m5696G2(bottomSheetBehavior2, false);
            } else {
                AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final C23454a0 m5695G1(C1906q c1906q, Long l7) {
        c1906q.m5747W0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public final void m5696G2(BottomSheetBehavior<View> bottomSheetBehavior, boolean showBottomSheet) {
        View transparentView = m5773f1().f47485g;
        AbstractC22676k.m65749i(transparentView, "transparentView");
        transparentView.setVisibility(showBottomSheet ? 0 : 8);
        if (showBottomSheet) {
            bottomSheetBehavior.m15701W(3);
        } else {
            bottomSheetBehavior.m15701W(5);
        }
        m5708J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final C23454a0 m5699H1(C1906q c1906q, Boolean bool) {
        if (!bool.booleanValue()) {
            c1906q.m5762b1();
        }
        LinearProgressIndicator uploadIndicator = c1906q.m5773f1().f47482d.f47244h;
        AbstractC22676k.m65749i(uploadIndicator, "uploadIndicator");
        uploadIndicator.setVisibility(8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H2 */
    private final void m5700H2() {
        ThrobberView throbberView = m5773f1().f47479a;
        throbberView.m26663f();
        throbberView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final boolean m5703I1(C1906q c1906q, Message message) {
        AbstractC22676k.m65750j(message, "message");
        InterfaceC1585g0 viewLifecycleOwner = c1906q.getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, c1906q.new h(message, null), 3);
        return true;
    }

    /* JADX INFO: renamed from: I2 */
    private final void m5704I2() {
        ThrobberView throbberView = m5773f1().f47479a;
        throbberView.m26664g();
        throbberView.setVisibility(8);
    }

    /* JADX INFO: renamed from: J1 */
    private static final MessageListViewModel m5707J1(InterfaceC23462h interfaceC23462h) {
        return (MessageListViewModel) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public final void m5708J2() {
        AbstractC14917t abstractC14917t = this.chatBackPressCallback;
        if (abstractC14917t != null) {
            abstractC14917t.m43013j(m5792l2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final C34911a m5711K1(ChannelViewModelFactory channelViewModelFactory) {
        return AbstractC15751g.m44431K(channelViewModelFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public final void m5712K2(String text) {
        if (text.length() <= 0 && m5770e1().m57545w0().isEmpty()) {
            m5756Z0();
        } else {
            m5762b1();
        }
    }

    /* JADX INFO: renamed from: L1 */
    private static final MessageComposerViewModel m5715L1(InterfaceC23462h interfaceC23462h) {
        return (MessageComposerViewModel) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final C23454a0 m5718M1(C1906q c1906q, String it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5678B2(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final C23454a0 m5721N1(C1906q c1906q, InterfaceC23462h interfaceC23462h, AbstractC20840s it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC20840s.e) {
            c1906q.m5798n2(((AbstractC20840s.e) it).getMessage());
        } else if (it instanceof AbstractC20840s.c) {
            AbstractC20840s.c cVar = (AbstractC20840s.c) it;
            c1906q.m5770e1().m57524f0(cVar.getId(), cVar.getReaction());
        } else if (it instanceof AbstractC20840s.a) {
            AbstractC20840s.a aVar = (AbstractC20840s.a) it;
            c1906q.m5770e1().m57516Y(aVar.getId(), aVar.getReaction());
        } else if (it instanceof AbstractC20840s.b) {
            AbstractC20840s.b bVar = (AbstractC20840s.b) it;
            c1906q.m5804p2(bVar.getMessage(), bVar.getSelectedIndex(), m5707J1(interfaceC23462h));
        } else {
            if (!(it instanceof AbstractC20840s.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c1906q.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((AbstractC20840s.d) it).getOgUrl())));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final boolean m5724O1(C1906q c1906q, Message message) {
        AbstractC22676k.m65750j(message, "message");
        BottomSheetBehavior<View> bottomSheetBehavior = c1906q.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        c1906q.m5696G2(bottomSheetBehavior, false);
        c1906q.m5770e1().m57522d1(message.getId());
        c1906q.m5770e1().m57523e1(message);
        c1906q.m5708J2();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final C23454a0 m5727P1(C1906q c1906q, InterfaceC23462h interfaceC23462h, MessageListViewModel.State state) {
        if (!(state instanceof MessageListViewModel.State.Loading) && !(state instanceof MessageListViewModel.State.Result)) {
            if (!(state instanceof MessageListViewModel.State.NavigateUp)) {
                throw new NoWhenBranchMatchedException();
            }
            BottomSheetBehavior<View> bottomSheetBehavior = c1906q.messageActionBottomSheetBehavior;
            if (bottomSheetBehavior == null) {
                AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
                throw null;
            }
            if (bottomSheetBehavior.f20784L == 3) {
                if (bottomSheetBehavior == null) {
                    AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
                    throw null;
                }
                c1906q.m5696G2(bottomSheetBehavior, false);
            } else if (c1906q.m5795m2(m5707J1(interfaceC23462h))) {
                c1906q.m5765c1(m5707J1(interfaceC23462h));
            } else {
                AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(c1906q);
                if (!abstractC12939a0M16799z.m36375A(AbstractC38499a0.f165077H0, false)) {
                    abstractC12939a0M16799z.m36410z();
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q1 */
    private final void m5730Q1() {
        AbstractC13452d0 abstractC13452d0 = m5773f1().f47483e;
        TextView composeData = abstractC13452d0.f47188e;
        AbstractC22676k.m65749i(composeData, "composeData");
        composeData.setVisibility(0);
        View firstDividerLayout = abstractC13452d0.f47192i;
        AbstractC22676k.m65749i(firstDividerLayout, "firstDividerLayout");
        firstDividerLayout.setVisibility(0);
        TextView composeData2 = abstractC13452d0.f47188e;
        AbstractC22676k.m65749i(composeData2, "composeData");
        AbstractC1953c.m5963a(composeData2, new C1890a(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final C23454a0 m5733R1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.getEventDispatcher().m129028c(c1906q.m5770e1().getParentId() != null, c1906q.m5770e1().getTeamId(), c1906q.m5770e1().m57536n0());
        new C25880e().show(c1906q.getChildFragmentManager(), "DataWidgetFragment");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S0 */
    private final void m5735S0() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: S1 */
    private final void m5736S1() {
        AbstractC13480i3 abstractC13480i3M38200c = AbstractC13480i3.m38200c(LayoutInflater.from(getContext()), null, false);
        AbstractC22676k.m65749i(abstractC13480i3M38200c, "inflate(...)");
        View root = abstractC13480i3M38200c.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15528d(getContext()).m75568g(this).m15549m(m5770e1().m57502B0()).m89314d(C40786k.f175894e)).m89319j(AbstractC38529z.f165830w)).m15537y(abstractC13480i3M38200c.f47355b);
        m5773f1().f47484f.setEmptyStateView(root, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    /* JADX INFO: renamed from: T0 */
    private final void m5738T0() {
        View root = m5773f1().getRoot();
        C0680g0 c0680g0 = new C0680g0(this, 1);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c0680g0);
    }

    /* JADX INFO: renamed from: T1 */
    private final void m5739T1(MessageListViewModel messageListViewModel) {
        m5770e1().getMessageResponseLiveData().observe(getViewLifecycleOwner(), new n(new C1890a(this, 6)));
        AbstractC13502n0 abstractC13502n0M5773f1 = m5773f1();
        TextView messageActionCopy = abstractC13502n0M5773f1.f47480b.f47781j;
        AbstractC22676k.m65749i(messageActionCopy, "messageActionCopy");
        AbstractC1953c.m5963a(messageActionCopy, new C1890a(this, 7));
        TextView messageActionDelete = abstractC13502n0M5773f1.f47480b.f47782k;
        AbstractC22676k.m65749i(messageActionDelete, "messageActionDelete");
        AbstractC1953c.m5963a(messageActionDelete, new C1890a(this, 8));
        TextView messageActionReport = abstractC13502n0M5773f1.f47480b.f47787p;
        AbstractC22676k.m65749i(messageActionReport, "messageActionReport");
        AbstractC1953c.m5963a(messageActionReport, new C1890a(this, 9));
        TextView messageActionEdit = abstractC13502n0M5773f1.f47480b.f47783l;
        AbstractC22676k.m65749i(messageActionEdit, "messageActionEdit");
        AbstractC1953c.m5963a(messageActionEdit, new C1897h(this, abstractC13502n0M5773f1));
        ImageView editClose = abstractC13502n0M5773f1.f47482d.f47238b;
        AbstractC22676k.m65749i(editClose, "editClose");
        AbstractC1953c.m5963a(editClose, new C1897h(abstractC13502n0M5773f1, this));
        TextView messageActionReply = abstractC13502n0M5773f1.f47480b.f47786o;
        AbstractC22676k.m65749i(messageActionReply, "messageActionReply");
        AbstractC1953c.m5963a(messageActionReply, new C0167g(11, this, messageListViewModel));
        m5794m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C16905q1 m5741U0(C1906q c1906q, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C16899o1 c16899o1 = windowInsets.f64864a;
        C35643b c35643bMo47530g = c16899o1.mo47530g(2);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        C35643b c35643bMo47530g2 = c16899o1.mo47530g(8);
        AbstractC22676k.m65749i(c35643bMo47530g2, "getInsets(...)");
        int iMax = Math.max(c35643bMo47530g.f151452d, c35643bMo47530g2.f151452d) + ((int) (4 * c1906q.getResources().getDisplayMetrics().density));
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        ConstraintLayout constraintLayout = childAt instanceof ConstraintLayout ? (ConstraintLayout) childAt : null;
        if (constraintLayout != null) {
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), iMax);
            constraintLayout.setBackgroundColor(c1906q.requireContext().getColor(AbstractC36510a.f156016Y));
        }
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final C23454a0 m5742U1(C1906q c1906q, Boolean bool) {
        if (AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
            String string = c1906q.getString(AbstractC38505d0.f165604N1);
            AbstractC22676k.m65749i(string, "getString(...)");
            AbstractC18737i.m54480e(c1906q, string);
            c1906q.m5762b1();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public final void m5744V0(C20839r attachment) {
        m5770e1().m57545w0().remove(attachment);
        AbstractC1692i1 adapter = m5773f1().f47482d.f47243g.getAdapter();
        AbstractC22676k.m65748h(adapter, "null cannot be cast to non-null type com.whoop.community.presentation.chat.attatchment.CustomMediaAttachmentAdapter");
        ((C21886a) adapter).removeItem(attachment);
        if (m5770e1().m57545w0().isEmpty()) {
            m5750X0();
            Editable text = m5773f1().f47482d.f47240d.getText();
            AbstractC22676k.m65749i(text, "getText(...)");
            if (text.length() == 0) {
                m5756Z0();
            } else {
                m5762b1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final C23454a0 m5745V1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        Message messageM57546x0 = c1906q.m5770e1().getSelectedMessage();
        if (messageM57546x0 != null) {
            Object systemService = c1906q.requireContext().getSystemService("clipboard");
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, messageM57546x0.getText()));
            BottomSheetBehavior<View> bottomSheetBehavior = c1906q.messageActionBottomSheetBehavior;
            if (bottomSheetBehavior == null) {
                AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
                throw null;
            }
            c1906q.m5785j1(bottomSheetBehavior);
            C40191e eventDispatcher = c1906q.getEventDispatcher();
            String strValueOf = String.valueOf(c1906q.m5770e1().getTeamId());
            Message messageM57546x1 = c1906q.m5770e1().getSelectedMessage();
            eventDispatcher.m129008P0(strValueOf, "Copy", messageM57546x1 != null ? AbstractC12285c.m34194c(messageM57546x1) : false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W0 */
    private final void m5747W0() {
        MessageComposerViewModel messageComposerViewModel = this.messageComposerViewModel;
        if (messageComposerViewModel != null) {
            messageComposerViewModel.clearData();
        }
        C20823d c20823d = this.composerSuggestionsController;
        if (c20823d != null) {
            c20823d.m57436i();
        }
        m5678B2("");
        ImageView editClose = m5773f1().f47482d.f47238b;
        AbstractC22676k.m65749i(editClose, "editClose");
        editClose.setVisibility(8);
        TextView editMessageLabel = m5773f1().f47482d.f47239c;
        AbstractC22676k.m65749i(editMessageLabel, "editMessageLabel");
        editMessageLabel.setVisibility(8);
        m5750X0();
        m5756Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final C23454a0 m5748W1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5770e1().m57521d0();
        BottomSheetBehavior<View> bottomSheetBehavior = c1906q.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        c1906q.m5785j1(bottomSheetBehavior);
        C40191e eventDispatcher = c1906q.getEventDispatcher();
        String strValueOf = String.valueOf(c1906q.m5770e1().getTeamId());
        Message messageM57546x0 = c1906q.m5770e1().getSelectedMessage();
        eventDispatcher.m129008P0(strValueOf, "Delete", messageM57546x0 != null ? AbstractC12285c.m34194c(messageM57546x0) : false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X0 */
    private final void m5750X0() {
        m5770e1().m57545w0().clear();
        FrameLayout selectedAttachmentsContainer = m5773f1().f47482d.f47241e;
        AbstractC22676k.m65749i(selectedAttachmentsContainer, "selectedAttachmentsContainer");
        selectedAttachmentsContainer.setVisibility(8);
        AbstractC1692i1 adapter = m5773f1().f47482d.f47243g.getAdapter();
        AbstractC22676k.m65748h(adapter, "null cannot be cast to non-null type com.whoop.community.presentation.chat.attatchment.CustomMediaAttachmentAdapter");
        ((C21886a) adapter).clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final C23454a0 m5751X1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        BottomSheetBehavior<View> bottomSheetBehavior = c1906q.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        c1906q.m5696G2(bottomSheetBehavior, false);
        BottomSheetBehavior<View> bottomSheetBehavior2 = c1906q.chatReportBottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            c1906q.m5696G2(bottomSheetBehavior2, true);
            return C23454a0.f92919a;
        }
        AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C23454a0 m5753Y0(AbstractC13502n0 it) {
        AbstractC22676k.m65750j(it, "it");
        it.f47484f.setOnMessageLongClickListener(null);
        it.f47484f.setOnThreadClickListener(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final C23454a0 m5754Y1(C1906q c1906q, AbstractC13502n0 abstractC13502n0, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5770e1().m57520c1(c1906q.m5770e1().getSelectedMessage());
        Message messageM57546x0 = c1906q.m5770e1().getSelectedMessage();
        if (messageM57546x0 != null) {
            TextView editMessageLabel = abstractC13502n0.f47482d.f47239c;
            AbstractC22676k.m65749i(editMessageLabel, "editMessageLabel");
            editMessageLabel.setVisibility(0);
            ImageView editClose = abstractC13502n0.f47482d.f47238b;
            AbstractC22676k.m65749i(editClose, "editClose");
            editClose.setVisibility(0);
            abstractC13502n0.f47482d.f47240d.setText(messageM57546x0.getText());
            BottomSheetBehavior<View> bottomSheetBehavior = c1906q.messageActionBottomSheetBehavior;
            if (bottomSheetBehavior == null) {
                AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
                throw null;
            }
            c1906q.m5696G2(bottomSheetBehavior, false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m5756Z0() {
        m5773f1().f47483e.f47186c.setVisibility(8);
        m5773f1().f47483e.f47187d.setVisibility(8);
        if (this.isInternationalizedTeamViews) {
            m5773f1().f47483e.f47187d.setVisibility(0);
            ImageView imageView = m5773f1().f47483e.f47191h;
            imageView.setImageDrawable(imageView.getResources().getDrawable(AbstractC38529z.f165829v));
            m5773f1().f47483e.f47191h.setClickable(false);
            return;
        }
        m5773f1().f47483e.f47186c.setVisibility(0);
        TextView textView = m5773f1().f47483e.f47190g;
        textView.setTextColor(requireContext().getColor(AbstractC36510a.f156007P));
        textView.setCompoundDrawablesWithIntrinsicBounds(AbstractC38529z.f165829v, 0, 0, 0);
        m5773f1().f47483e.f47190g.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final C23454a0 m5757Z1(AbstractC13502n0 abstractC13502n0, C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        TextView editMessageLabel = abstractC13502n0.f47482d.f47239c;
        AbstractC22676k.m65749i(editMessageLabel, "editMessageLabel");
        editMessageLabel.setVisibility(8);
        c1906q.m5770e1().m57520c1(null);
        it.setVisibility(8);
        abstractC13502n0.f47482d.f47240d.setText("");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public final void m5759a1() {
        FrameLayout selectedAttachmentsContainer = m5773f1().f47482d.f47241e;
        AbstractC22676k.m65749i(selectedAttachmentsContainer, "selectedAttachmentsContainer");
        selectedAttachmentsContainer.setVisibility(0);
        AbstractC1692i1 adapter = m5773f1().f47482d.f47243g.getAdapter();
        AbstractC22676k.m65748h(adapter, "null cannot be cast to non-null type com.whoop.community.presentation.chat.attatchment.CustomMediaAttachmentAdapter");
        ((C21886a) adapter).setItems(m5770e1().m57545w0());
        m5762b1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final C23454a0 m5760a2(C1906q c1906q, MessageListViewModel messageListViewModel, View it) {
        AbstractC22676k.m65750j(it, "it");
        Message messageM57546x0 = c1906q.m5770e1().getSelectedMessage();
        if (messageM57546x0 != null) {
            c1906q.m5770e1().m57522d1(messageM57546x0.getId());
            messageListViewModel.onEvent(new MessageListViewModel.Event.ThreadModeEntered(messageM57546x0));
            c1906q.m5708J2();
        }
        BottomSheetBehavior<View> bottomSheetBehavior = c1906q.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        c1906q.m5696G2(bottomSheetBehavior, false);
        C40191e eventDispatcher = c1906q.getEventDispatcher();
        String strValueOf = String.valueOf(c1906q.m5770e1().getTeamId());
        Message messageM57546x1 = c1906q.m5770e1().getSelectedMessage();
        eventDispatcher.m129008P0(strValueOf, "Reply", messageM57546x1 != null ? AbstractC12285c.m34194c(messageM57546x1) : false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b1 */
    private final void m5762b1() {
        if (this.isInternationalizedTeamViews) {
            ImageView imageView = m5773f1().f47483e.f47191h;
            imageView.setImageDrawable(imageView.getResources().getDrawable(AbstractC38529z.f165828u));
            m5773f1().f47483e.f47191h.setClickable(true);
        } else {
            TextView textView = m5773f1().f47483e.f47190g;
            textView.setTextColor(requireContext().getColor(AbstractC36510a.f156021b0));
            textView.setCompoundDrawablesWithIntrinsicBounds(AbstractC38529z.f165828u, 0, 0, 0);
            m5773f1().f47483e.f47190g.setClickable(true);
        }
    }

    /* JADX INFO: renamed from: b2 */
    private final void m5763b2() {
        AbstractC13531t abstractC13531t = m5773f1().f47481c;
        StrokedPillButton chatReportSubmit = abstractC13531t.f47651g;
        AbstractC22676k.m65749i(chatReportSubmit, "chatReportSubmit");
        AbstractC1953c.m5963a(chatReportSubmit, new C0167g(10, abstractC13531t, this));
        observe(m5770e1().getReportMessageStatus(), new n(new C1890a(this, 13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public final void m5765c1(MessageListViewModel messageListViewModel) {
        messageListViewModel.onEvent(MessageListViewModel.Event.BackButtonPressed.INSTANCE);
        m5770e1().m57522d1(null);
        m5708J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final C23454a0 m5766c2(AbstractC13531t abstractC13531t, C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5770e1().m57513P0(abstractC13531t.f47649e.getCheckedRadioButtonId() == AbstractC38499a0.f165014A0 ? "inappropriate" : "abuse");
        BottomSheetBehavior<View> bottomSheetBehavior = c1906q.chatReportBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            c1906q.m5785j1(bottomSheetBehavior);
            return C23454a0.f92919a;
        }
        AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final C23454a0 m5768d2(C1906q c1906q, Boolean bool) {
        AbstractC18737i.m54476a(c1906q, bool.booleanValue() ? AbstractC38505d0.f165669h : AbstractC38505d0.f165673i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public final C20834m m5770e1() {
        return (C20834m) this.communityChatViewModel.getValue();
    }

    /* JADX INFO: renamed from: e2 */
    private final void m5771e2() {
        m5770e1().m57509I0();
        observe(m5770e1().getStreamConnectionStatus(), new n(new C1890a(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public final AbstractC13502n0 m5773f1() {
        return (AbstractC13502n0) this.dataBinding.getValue(this, f7468T[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final C23454a0 m5774f2(C1906q c1906q, Boolean bool) {
        AbstractC22676k.m65747g(bool);
        c1906q.m5791l1(bool.booleanValue());
        if (bool.booleanValue()) {
            InterfaceC1585g0 viewLifecycleOwner = c1906q.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, c1906q.new k(null), 3);
        }
        c1906q.m5704I2();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g1 */
    private final FeatureFlagRepository m5776g1() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: renamed from: g2 */
    private final void m5777g2() {
        AbstractC13550x abstractC13550x = m5773f1().f47486h;
        StrokedPillButton tryAgain = abstractC13550x.f47740b;
        AbstractC22676k.m65749i(tryAgain, "tryAgain");
        AbstractC1953c.m5963a(tryAgain, new C0167g(12, abstractC13550x, this));
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: h1 */
    private final String m5779h1() {
        String string;
        Editable text = m5773f1().f47482d.f47240d.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final C23454a0 m5780h2(AbstractC13550x abstractC13550x, C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        ConstraintLayout tryAgainContent = abstractC13550x.f47741c;
        AbstractC22676k.m65749i(tryAgainContent, "tryAgainContent");
        tryAgainContent.setVisibility(8);
        c1906q.m5700H2();
        c1906q.m5770e1().m57509I0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i1 */
    private final InterfaceC27837a0 m5782i1() {
        return (InterfaceC27837a0) this.userManager.getValue();
    }

    /* JADX INFO: renamed from: i2 */
    private final void m5783i2() {
        observe(m5770e1().getTypingState(), new n(new C1890a(this, 12)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public final void m5785j1(BottomSheetBehavior<View> bottomSheetBehavior) {
        m5696G2(bottomSheetBehavior, false);
        m5770e1().m57523e1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final C23454a0 m5786j2(C1906q c1906q, C23465k c23465k) {
        int iIntValue = ((Number) c23465k.f92937w).intValue();
        String str = (String) c23465k.f92938x;
        AbstractC13502n0 abstractC13502n0M5773f1 = c1906q.m5773f1();
        TextView textView = abstractC13502n0M5773f1.f47488j;
        AbstractC22676k.m65747g(textView);
        textView.setVisibility(iIntValue > 0 ? 0 : 8);
        textView.setText(textView.getResources().getQuantityString(AbstractC38503c0.f165559a, iIntValue, str));
        ImageView imageView = abstractC13502n0M5773f1.f47487i;
        AbstractC22676k.m65747g(imageView);
        imageView.setVisibility(iIntValue > 0 ? 0 : 8);
        ((C4964f) ComponentCallbacks2C4960b.m15529e(c1906q.requireContext()).m15548l(Integer.valueOf(AbstractC38529z.f165832y)).m89314d(C40786k.f175894e)).m15537y(imageView);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public final void m5788k1() {
        EditText messageCompose = m5773f1().f47482d.f47240d;
        AbstractC22676k.m65749i(messageCompose, "messageCompose");
        Object systemService = requireContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(messageCompose.getWindowToken(), 0);
        }
        messageCompose.clearFocus();
    }

    /* JADX INFO: renamed from: k2 */
    private final void m5789k2() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new l(null), 3);
    }

    /* JADX INFO: renamed from: l1 */
    private final void m5791l1(boolean visible) {
        AbstractC13502n0 abstractC13502n0M5773f1 = m5773f1();
        MessageListView messageListView = abstractC13502n0M5773f1.f47484f;
        AbstractC22676k.m65749i(messageListView, "messageListView");
        messageListView.setVisibility(visible ? 0 : 8);
        View root = abstractC13502n0M5773f1.f47482d.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(visible ? 0 : 8);
        View root2 = abstractC13502n0M5773f1.f47483e.getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        root2.setVisibility(visible ? 0 : 8);
        ConstraintLayout tryAgainContent = abstractC13502n0M5773f1.f47486h.f47741c;
        AbstractC22676k.m65749i(tryAgainContent, "tryAgainContent");
        tryAgainContent.setVisibility(visible ? 8 : 0);
    }

    /* JADX INFO: renamed from: l2 */
    private final boolean m5792l2() {
        MessageListViewModel messageListViewModel;
        BottomSheetBehavior<View> bottomSheetBehavior = this.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        if (bottomSheetBehavior.f20784L != 3) {
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.chatReportBottomSheetBehavior;
            if (bottomSheetBehavior2 == null) {
                AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
                throw null;
            }
            if (bottomSheetBehavior2.f20784L != 3 && ((messageListViewModel = this.messageListViewModel) == null || !m5795m2(messageListViewModel))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m1 */
    private final AbstractC13557y2 m5794m1() {
        AbstractC13557y2 abstractC13557y2 = m5773f1().f47480b;
        ImageView emoteLove = abstractC13557y2.f47778g;
        AbstractC22676k.m65749i(emoteLove, "emoteLove");
        AbstractC1953c.m5963a(emoteLove, new C1890a(this, 15));
        ImageView emoteLike = abstractC13557y2.f47777f;
        AbstractC22676k.m65749i(emoteLike, "emoteLike");
        AbstractC1953c.m5963a(emoteLike, new C1890a(this, 16));
        ImageView emoteDislike = abstractC13557y2.f47774c;
        AbstractC22676k.m65749i(emoteDislike, "emoteDislike");
        AbstractC1953c.m5963a(emoteDislike, new C1890a(this, 17));
        ImageView emoteHaha = abstractC13557y2.f47776e;
        AbstractC22676k.m65749i(emoteHaha, "emoteHaha");
        AbstractC1953c.m5963a(emoteHaha, new C1890a(this, 18));
        ImageView emoteWow = abstractC13557y2.f47780i;
        AbstractC22676k.m65749i(emoteWow, "emoteWow");
        AbstractC1953c.m5963a(emoteWow, new C1890a(this, 19));
        ImageView emoteCry = abstractC13557y2.f47773b;
        AbstractC22676k.m65749i(emoteCry, "emoteCry");
        AbstractC1953c.m5963a(emoteCry, new C1890a(this, 20));
        ImageView emoteStrong = abstractC13557y2.f47779h;
        AbstractC22676k.m65749i(emoteStrong, "emoteStrong");
        AbstractC1953c.m5963a(emoteStrong, new C1890a(this, 21));
        return abstractC13557y2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public final boolean m5795m2(MessageListViewModel messageListViewModel) {
        return m5770e1().getParentId() != null || (messageListViewModel.getMode().getValue() instanceof MessageMode.MessageThread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C23454a0 m5797n1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5828x2("love");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n2 */
    private final void m5798n2(Message message) {
        getEventDispatcher().m129064w(String.valueOf(m5770e1().getTeamId()), message.getUser().getId(), AbstractC12285c.m34194c(message), AbstractC22676k.m65745e(message.getUser().getId(), String.valueOf(m5782i1().getUserId())));
        getNavigator().mo59393b(new AbstractC21155m0.w3(Integer.valueOf(Integer.parseInt(message.getUser().getId())), Integer.valueOf(m5770e1().getTeamId()), "community", null, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C23454a0 m5800o1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5828x2("like");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final C34911a m5801o2(C1906q c1906q) {
        return AbstractC15751g.m44431K(c1906q.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C23454a0 m5803p1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5828x2("dislike");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[LOOP:1: B:25:0x007f->B:27:0x0085, LOOP_END] */
    /* JADX INFO: renamed from: p2 */
    private final void m5804p2(final Message message, int selectedIndex, final MessageListViewModel messageListViewModel) {
        AttachmentGalleryDestination attachmentGalleryDestination;
        ArrayList arrayList;
        Iterator it;
        Attachment attachment;
        String strM34192a;
        final Attachment attachment2 = message.getAttachments().get(selectedIndex);
        List<Attachment> attachments = message.getAttachments();
        if ((attachments instanceof Collection) && attachments.isEmpty()) {
            List<Attachment> attachments2 = message.getAttachments();
            ArrayList arrayList2 = new ArrayList();
            while (r0.hasNext()) {
                attachment = (Attachment) obj;
                if (!AbstractC22676k.m65745e(attachment.getType(), "image")) {
                }
            }
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new AttachmentGalleryItem((Attachment) it.next(), message.getUser(), MessageExtensionsKt.getCreatedAtOrThrow(message), message.getId(), message.getCid(), AbstractC12285c.m34193b(message.getUser())));
            }
            int iIndexOf = arrayList2.indexOf(attachment2);
            Context contextRequireContext = requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            AttachmentGalleryDestination attachmentGalleryDestination2 = new AttachmentGalleryDestination(contextRequireContext, new AttachmentGalleryActivity.AttachmentReplyOptionHandler() { // from class: aq0.k
                @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentReplyOptionHandler
                public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                    C1906q.m5807q2(messageListViewModel, message, attachmentGalleryResultItem);
                }
            }, new C1901l(), new AttachmentGalleryActivity.AttachmentDownloadOptionHandler() { // from class: aq0.m
                @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentDownloadOptionHandler
                public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                    C1906q.m5813s2(this.f7460a, attachmentGalleryResultItem);
                }
            }, new AttachmentGalleryActivity.AttachmentDeleteOptionHandler() { // from class: aq0.n
                @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentDeleteOptionHandler
                public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                    C1906q.m5816t2(messageListViewModel, message, attachment2, attachmentGalleryResultItem);
                }
            });
            attachmentGalleryDestination2.register(requireActivity().getActivityResultRegistry());
            attachmentGalleryDestination2.setData(arrayList, iIndexOf);
            this.attachmentGalleryDestination = attachmentGalleryDestination2;
            attachmentGalleryDestination = attachmentGalleryDestination2;
        } else {
            Iterator<T> it3 = attachments.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    List<Attachment> attachments3 = message.getAttachments();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : attachments3) {
                        attachment = (Attachment) obj;
                        if (!AbstractC22676k.m65745e(attachment.getType(), "image") && (strM34192a = AbstractC12285c.m34192a(attachment)) != null && strM34192a.length() != 0) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new AttachmentGalleryItem((Attachment) it.next(), message.getUser(), MessageExtensionsKt.getCreatedAtOrThrow(message), message.getId(), message.getCid(), AbstractC12285c.m34193b(message.getUser())));
                    }
                    int iIndexOf2 = arrayList3.indexOf(attachment2);
                    Context contextRequireContext2 = requireContext();
                    AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
                    AttachmentGalleryDestination attachmentGalleryDestination3 = new AttachmentGalleryDestination(contextRequireContext2, new AttachmentGalleryActivity.AttachmentReplyOptionHandler() { // from class: aq0.k
                        @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentReplyOptionHandler
                        public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                            C1906q.m5807q2(messageListViewModel, message, attachmentGalleryResultItem);
                        }
                    }, new C1901l(), new AttachmentGalleryActivity.AttachmentDownloadOptionHandler() { // from class: aq0.m
                        @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentDownloadOptionHandler
                        public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                            C1906q.m5813s2(this.f7460a, attachmentGalleryResultItem);
                        }
                    }, new AttachmentGalleryActivity.AttachmentDeleteOptionHandler() { // from class: aq0.n
                        @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentDeleteOptionHandler
                        public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                            C1906q.m5816t2(messageListViewModel, message, attachment2, attachmentGalleryResultItem);
                        }
                    });
                    attachmentGalleryDestination3.register(requireActivity().getActivityResultRegistry());
                    attachmentGalleryDestination3.setData(arrayList, iIndexOf2);
                    this.attachmentGalleryDestination = attachmentGalleryDestination3;
                    attachmentGalleryDestination = attachmentGalleryDestination3;
                } else if (!AbstractC12285c.m34195d((Attachment) it3.next())) {
                    attachmentGalleryDestination = null;
                }
            }
        }
        if (attachmentGalleryDestination != null) {
            ChatUI.getNavigator().navigate(attachmentGalleryDestination);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C23454a0 m5806q1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5828x2("haha");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final void m5807q2(MessageListViewModel messageListViewModel, Message message, AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.ThreadModeEntered(message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final C23454a0 m5809r1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5828x2("wow");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final void m5810r2(AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C23454a0 m5812s1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5828x2("sad");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final void m5813s2(C1906q c1906q, AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
        Toast.makeText(c1906q.requireContext(), AbstractC38505d0.f165685l, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C23454a0 m5815t1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        c1906q.m5828x2("strong");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final void m5816t2(MessageListViewModel messageListViewModel, Message message, Attachment attachment, AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.RemoveAttachment(message.getId(), attachment));
    }

    /* JADX INFO: renamed from: u1 */
    private final void m5818u1() {
        m5770e1().getReactionAnalyticsLiveData().observe(getViewLifecycleOwner(), new n(new C1890a(this, 22)));
    }

    /* JADX INFO: renamed from: u2 */
    private final void m5819u2(MessageListViewModel messageListViewModel) {
        try {
            String string = obtainArguments().getString("parentMessageId", null);
            if (AbstractC28188o1.m85314d(string)) {
                m5770e1().m57522d1(string);
                AbstractC22676k.m65747g(string);
                messageListViewModel.onEvent(new MessageListViewModel.Event.ThreadModeEntered(new Message(string, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -2, 65535, null)));
                m5708J2();
            }
        } catch (Exception e5) {
            getLog().mo85230v("Exception while opening message thread view", e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final C23454a0 m5821v1(C1906q c1906q, C40939a c40939a) {
        c1906q.getEventDispatcher().m129062v(c40939a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final void m5822v2(C1906q c1906q, List uris) {
        Context context;
        ContentResolver contentResolver;
        AbstractC22676k.m65750j(uris, "uris");
        if (uris.isEmpty() || (context = c1906q.getContext()) == null || (contentResolver = context.getContentResolver()) == null) {
            return;
        }
        c1906q.m5770e1().m57511N0(uris, new C0103b(contentResolver, 7));
        c1906q.m5759a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0193  */
    /* JADX WARN: Code duplicated, block: B:33:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w1 */
    public final Object m5824w1(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        i iVar;
        final InterfaceC23462h interfaceC23462hM92087G;
        String str;
        Object objM57506F0;
        String str2;
        C20844w c20844w;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f7512G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f7512G = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objM57527h0 = iVar.f7510E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f7512G;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i15 = 1;
        Function1 function1 = null;
        Object[] objArr = 0;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM57527h0);
            C20834m c20834mM5770e1 = m5770e1();
            String string = obtainArguments().getString("channelId", "");
            AbstractC22676k.m65749i(string, "getString(...)");
            c20834mM5770e1.m57517Z0(string);
            C20834m c20834mM5770e2 = m5770e1();
            String string2 = obtainArguments().getString("channelType", "");
            AbstractC22676k.m65749i(string2, "getString(...)");
            c20834mM5770e2.m57518a1(string2);
            C20834m c20834mM5770e3 = m5770e1();
            String string3 = obtainArguments().getString("cid", "");
            AbstractC22676k.m65749i(string3, "getString(...)");
            c20834mM5770e3.m57519b1(string3);
            m5770e1().m57526g1(obtainArguments().getInt("chatTeamId"));
            C20834m c20834mM5770e4 = m5770e1();
            String string4 = obtainArguments().getString("chatTeamIconUrl", "");
            AbstractC22676k.m65749i(string4, "getString(...)");
            c20834mM5770e4.m57525f1(string4);
            m5770e1().m57528h1(obtainArguments().getString("widgetUrl", null));
            C20834m c20834mM5770e5 = m5770e1();
            iVar.f7512G = 1;
            if (c20834mM5770e5.m57537n1(iVar) != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objM57527h0);
        } else {
            if (i14 == 2) {
                interfaceC23462hM92087G = (InterfaceC23462h) iVar.f7514x;
                AbstractC34132o.m107864I(objM57527h0);
                str = (String) objM57527h0;
                C20834m c20834mM5770e6 = m5770e1();
                iVar.f7513w = null;
                iVar.f7514x = interfaceC23462hM92087G;
                iVar.f7515y = null;
                iVar.f7516z = str;
                iVar.f7512G = 3;
                objM57506F0 = c20834mM5770e6.m57506F0(iVar);
                if (objM57506F0 != enumC31071a) {
                    str2 = str;
                    objM57527h0 = objM57506F0;
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) iVar.f7516z;
            interfaceC23462hM92087G = (InterfaceC23462h) iVar.f7514x;
            AbstractC34132o.m107864I(objM57527h0);
        }
        final int i16 = 0;
        c20844w = new C20844w(str2, (String) objM57527h0, new Function1(this) { // from class: aq0.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C1906q f7446x;

            {
                this.f7446x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return C1906q.m5721N1(this.f7446x, interfaceC23462hM92087G, (AbstractC20840s) obj);
                    default:
                        return C1906q.m5727P1(this.f7446x, interfaceC23462hM92087G, (MessageListViewModel.State) obj);
                }
            }
        });
        if (!m5773f1().f47484f.isAdapterInitialized()) {
            m5773f1().f47484f.setMessageViewHolderFactory(c20844w);
        }
        MessageListViewModel messageListViewModelM5707J1 = m5707J1(interfaceC23462hM92087G);
        MessageListView messageListView = m5773f1().f47484f;
        AbstractC22676k.m65749i(messageListView, "messageListView");
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        MessageListViewModelBinding.bind(messageListViewModelM5707J1, messageListView, viewLifecycleOwner);
        m5773f1().f47484f.setOnThreadClickListener(new MessageListView.OnThreadClickListener() { // from class: aq0.f
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnThreadClickListener
            public final boolean onThreadClick(Message message) {
                return C1906q.m5724O1(this.f7448w, message);
            }
        });
        m5681C2(m5707J1(interfaceC23462hM92087G));
        final int i17 = 1;
        m5707J1(interfaceC23462hM92087G).getState().observe(getViewLifecycleOwner(), new n(new Function1(this) { // from class: aq0.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C1906q f7446x;

            {
                this.f7446x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        return C1906q.m5721N1(this.f7446x, interfaceC23462hM92087G, (AbstractC20840s) obj);
                    default:
                        return C1906q.m5727P1(this.f7446x, interfaceC23462hM92087G, (MessageListViewModel.State) obj);
                }
            }
        }));
        TextView composeSend = m5773f1().f47483e.f47190g;
        AbstractC22676k.m65749i(composeSend, "composeSend");
        AbstractC1953c.m5963a(composeSend, new C1890a(this, 4));
        m5756Z0();
        m5736S1();
        m5773f1().f47482d.f47240d.addTextChangedListener(this.messageComposeTextWatcher);
        m5773f1().f47482d.f47240d.setOnClickListener(new ViewOnClickListenerC1896g(this, 1));
        m5834z2();
        C21886a c21886a = new C21886a(function1, i15, objArr == true ? 1 : 0);
        c21886a.m62107f(new j(this));
        m5773f1().f47482d.f47243g.setAdapter(c21886a);
        TextView composeAdd = m5773f1().f47483e.f47184a;
        AbstractC22676k.m65749i(composeAdd, "composeAdd");
        AbstractC1953c.m5963a(composeAdd, new C1890a(this, 5));
        m5770e1().m57540r0().observe(getViewLifecycleOwner(), new n(new C1890a(this, 1)));
        m5770e1().getAttachmentStatus().observe(getViewLifecycleOwner(), new n(new C1890a(this, 2)));
        m5730Q1();
        m5773f1().f47484f.setOnMessageLongClickListener(new MessageListView.OnMessageLongClickListener() { // from class: aq0.c
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageLongClickListener
            public final boolean onMessageLongClick(Message message) {
                return C1906q.m5703I1(this.f7442w, message);
            }
        });
        m5739T1(m5707J1(interfaceC23462hM92087G));
        m5770e1().m57510K0();
        m5819u2(m5707J1(interfaceC23462hM92087G));
        m5783i2();
        m5735S0();
        return c23454a0;
        if (this.isChatUiInitialized) {
            return c23454a0;
        }
        this.isChatUiInitialized = true;
        C26669a c26669aM110120B = AbstractC34924m.m110120B(this);
        final ChannelViewModelFactory channelViewModelFactory = (ChannelViewModelFactory) c26669aM110120B.f106046a.f159364d.m122602a(new C1891b(this, 0), AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChannelViewModelFactory.class), null);
        final int i18 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: aq0.d
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return C1906q.m5830y1(channelViewModelFactory);
                    default:
                        return C1906q.m5711K1(channelViewModelFactory);
                }
            }
        };
        d dVar = new d(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        interfaceC23462hM92087G = AbstractC30060g.m92087G(enumC23463i, new e(this, null, dVar, interfaceC4339a));
        this.messageListViewModel = m5707J1(interfaceC23462hM92087G);
        final int i19 = 1;
        InterfaceC23462h interfaceC23462hM92087G2 = AbstractC30060g.m92087G(enumC23463i, new g(this, null, new f(this), new InterfaceC4339a() { // from class: aq0.d
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return C1906q.m5830y1(channelViewModelFactory);
                    default:
                        return C1906q.m5711K1(channelViewModelFactory);
                }
            }
        }));
        this.messageComposerViewModel = m5715L1(interfaceC23462hM92087G2);
        ConstraintLayout composeInputLayout = m5773f1().f47482d.f47237a;
        AbstractC22676k.m65749i(composeInputLayout, "composeInputLayout");
        MessageComposerViewModel messageComposerViewModelM5715L1 = m5715L1(interfaceC23462hM92087G2);
        InterfaceC1585g0 viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C20823d c20823d = new C20823d(composeInputLayout, messageComposerViewModelM5715L1, viewLifecycleOwner2, new C1890a(this, 3));
        c20823d.m57435g();
        this.composerSuggestionsController = c20823d;
        C20834m c20834mM5770e7 = m5770e1();
        iVar.f7513w = null;
        iVar.f7514x = interfaceC23462hM92087G;
        iVar.f7515y = null;
        iVar.f7512G = 2;
        objM57527h0 = c20834mM5770e7.m57527h0(iVar);
        if (objM57527h0 != enumC31071a) {
            str = (String) objM57527h0;
            C20834m c20834mM5770e8 = m5770e1();
            iVar.f7513w = null;
            iVar.f7514x = interfaceC23462hM92087G;
            iVar.f7515y = null;
            iVar.f7516z = str;
            iVar.f7512G = 3;
            objM57506F0 = c20834mM5770e8.m57506F0(iVar);
            if (objM57506F0 != enumC31071a) {
                str2 = str;
                objM57527h0 = objM57506F0;
                final int i110 = 0;
                c20844w = new C20844w(str2, (String) objM57527h0, new Function1(this) { // from class: aq0.e

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C1906q f7446x;

                    {
                        this.f7446x = this;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i110) {
                            case 0:
                                return C1906q.m5721N1(this.f7446x, interfaceC23462hM92087G, (AbstractC20840s) obj);
                            default:
                                return C1906q.m5727P1(this.f7446x, interfaceC23462hM92087G, (MessageListViewModel.State) obj);
                        }
                    }
                });
                if (!m5773f1().f47484f.isAdapterInitialized()) {
                    m5773f1().f47484f.setMessageViewHolderFactory(c20844w);
                }
                MessageListViewModel messageListViewModelM5707J2 = m5707J1(interfaceC23462hM92087G);
                MessageListView messageListView2 = m5773f1().f47484f;
                AbstractC22676k.m65749i(messageListView2, "messageListView");
                InterfaceC1585g0 viewLifecycleOwner3 = getViewLifecycleOwner();
                AbstractC22676k.m65749i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                MessageListViewModelBinding.bind(messageListViewModelM5707J2, messageListView2, viewLifecycleOwner3);
                m5773f1().f47484f.setOnThreadClickListener(new MessageListView.OnThreadClickListener() { // from class: aq0.f
                    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnThreadClickListener
                    public final boolean onThreadClick(Message message) {
                        return C1906q.m5724O1(this.f7448w, message);
                    }
                });
                m5681C2(m5707J1(interfaceC23462hM92087G));
                final int i111 = 1;
                m5707J1(interfaceC23462hM92087G).getState().observe(getViewLifecycleOwner(), new n(new Function1(this) { // from class: aq0.e

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C1906q f7446x;

                    {
                        this.f7446x = this;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i111) {
                            case 0:
                                return C1906q.m5721N1(this.f7446x, interfaceC23462hM92087G, (AbstractC20840s) obj);
                            default:
                                return C1906q.m5727P1(this.f7446x, interfaceC23462hM92087G, (MessageListViewModel.State) obj);
                        }
                    }
                }));
                TextView composeSend2 = m5773f1().f47483e.f47190g;
                AbstractC22676k.m65749i(composeSend2, "composeSend");
                AbstractC1953c.m5963a(composeSend2, new C1890a(this, 4));
                m5756Z0();
                m5736S1();
                m5773f1().f47482d.f47240d.addTextChangedListener(this.messageComposeTextWatcher);
                m5773f1().f47482d.f47240d.setOnClickListener(new ViewOnClickListenerC1896g(this, 1));
                m5834z2();
                C21886a c21886a2 = new C21886a(function1, i15, objArr == true ? 1 : 0);
                c21886a2.m62107f(new j(this));
                m5773f1().f47482d.f47243g.setAdapter(c21886a2);
                TextView composeAdd2 = m5773f1().f47483e.f47184a;
                AbstractC22676k.m65749i(composeAdd2, "composeAdd");
                AbstractC1953c.m5963a(composeAdd2, new C1890a(this, 5));
                m5770e1().m57540r0().observe(getViewLifecycleOwner(), new n(new C1890a(this, 1)));
                m5770e1().getAttachmentStatus().observe(getViewLifecycleOwner(), new n(new C1890a(this, 2)));
                m5730Q1();
                m5773f1().f47484f.setOnMessageLongClickListener(new MessageListView.OnMessageLongClickListener() { // from class: aq0.c
                    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageLongClickListener
                    public final boolean onMessageLongClick(Message message) {
                        return C1906q.m5703I1(this.f7442w, message);
                    }
                });
                m5739T1(m5707J1(interfaceC23462hM92087G));
                m5770e1().m57510K0();
                m5819u2(m5707J1(interfaceC23462hM92087G));
                m5783i2();
                m5735S0();
                return c23454a0;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final String m5825w2(ContentResolver contentResolver, Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        return contentResolver.getType(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final C34911a m5827x1(C1906q c1906q) {
        return AbstractC15751g.m44431K(c1906q.m5770e1().m57536n0());
    }

    /* JADX INFO: renamed from: x2 */
    private final void m5828x2(String reaction) {
        m5770e1().m57512O0(reaction);
        BottomSheetBehavior<View> bottomSheetBehavior = this.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        m5696G2(bottomSheetBehavior, false);
        m5770e1().m57523e1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final C34911a m5830y1(ChannelViewModelFactory channelViewModelFactory) {
        return AbstractC15751g.m44431K(channelViewModelFactory);
    }

    /* JADX INFO: renamed from: y2 */
    private final void m5831y2() {
        C20834m c20834mM5770e1 = m5770e1();
        String lowerCase = m5779h1().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        c20834mM5770e1.m57514Q0(lowerCase);
        m5678B2("");
        m5756Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C23454a0 m5833z1(C1906q c1906q, View it) {
        AbstractC22676k.m65750j(it, "it");
        String string = c1906q.m5773f1().f47482d.f47240d.getText().toString();
        if (!c1906q.m5770e1().m57545w0().isEmpty()) {
            int i13 = 0;
            List<Bitmap> list = (List) c1906q.m5770e1().m57545w0().stream().filter(new C1898i(new C28503p(29), i13)).map(new C1899j(new C1890a(c1906q, 10), i13)).collect(Collectors.toList());
            LinearProgressIndicator uploadIndicator = c1906q.m5773f1().f47482d.f47244h;
            AbstractC22676k.m65749i(uploadIndicator, "uploadIndicator");
            uploadIndicator.setVisibility(0);
            C20834m c20834mM5770e1 = c1906q.m5770e1();
            AbstractC22676k.m65747g(list);
            c20834mM5770e1.m57535m1(list, string);
        } else if (string.length() > 0) {
            if (f7470V.m125851e(string)) {
                c1906q.m5831y2();
            } else {
                c1906q.m5770e1().m57515S0(string);
            }
        }
        C40191e eventDispatcher = c1906q.getEventDispatcher();
        String strValueOf = String.valueOf(c1906q.m5770e1().getTeamId());
        boolean z4 = !c1906q.m5770e1().m57545w0().isEmpty();
        Message messageM57546x0 = c1906q.m5770e1().getSelectedMessage();
        eventDispatcher.m129010Q0(strValueOf, z4, messageM57546x0 != null ? AbstractC12285c.m34194c(messageM57546x0) : false, String.valueOf(string.length()));
        c1906q.m5756Z0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z2 */
    private final void m5834z2() {
        CharSequence string = requireContext().getString(AbstractC38505d0.f165689m);
        AbstractC22676k.m65749i(string, "getString(...)");
        EditText editText = m5773f1().f47482d.f47240d;
        Typeface typefaceM109098b = AbstractC34523k.m109098b(requireContext(), AbstractC16273b.f62202c);
        if (typefaceM109098b != null) {
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new AbsoluteSizeSpan(11, true), 0, spannableString.length(), 33);
            spannableString.setSpan(new C36278b(typefaceM109098b, 0.1f), 0, spannableString.length(), 33);
            string = spannableString;
        }
        editText.setHint(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq0.InterfaceC25883h
    /* JADX INFO: renamed from: c */
    public void mo5835c(C20841t data) {
        AbstractC22676k.m65750j(data, "data");
        int i13 = 1;
        getEventDispatcher().m129024a(m5770e1().getParentId() != null, m5770e1().getTeamId(), data.getName());
        m5770e1().m57545w0().add(new C20839r(null, data.getDataWidget(), i13, 0 == true ? 1 : 0));
        m5759a1();
    }

    /* JADX INFO: renamed from: d1 */
    public final Bitmap m5836d1(AttachmentMetaData attachmentMetaData) {
        AbstractC22676k.m65750j(attachmentMetaData, "attachmentMetaData");
        Uri uri = attachmentMetaData.getUri();
        if (uri == null) {
            return null;
        }
        ContentResolver contentResolver = requireActivity().getContentResolver();
        AbstractC22676k.m65749i(contentResolver, "getContentResolver(...)");
        return AbstractC20830i.m57453a(contentResolver, uri);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        requireContext().setTheme(AbstractC38507e0.f165741c);
        AbstractC13502n0 abstractC13502n0M38215c = AbstractC13502n0.m38215c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13502n0M38215c, "inflate(...)");
        m5675A2(abstractC13502n0M38215c);
        View root = m5773f1().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        this.isChatUiInitialized = false;
        C20823d c20823d = this.composerSuggestionsController;
        if (c20823d != null) {
            c20823d.m57436i();
        }
        this.composerSuggestionsController = null;
        super.onDestroyView();
        AttachmentGalleryDestination attachmentGalleryDestination = this.attachmentGalleryDestination;
        if (attachmentGalleryDestination != null) {
            attachmentGalleryDestination.unregister();
        }
        this.attachmentGalleryDestination = null;
        requireContext().setTheme(AbstractC36518i.f156127a);
        BottomSheetBehavior<View> bottomSheetBehavior = this.messageActionBottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("messageActionBottomSheetBehavior");
            throw null;
        }
        bottomSheetBehavior.f20795W.remove(this.bottomSheetCallBack);
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.chatReportBottomSheetBehavior;
        if (bottomSheetBehavior2 == null) {
            AbstractC22676k.m65757q("chatReportBottomSheetBehavior");
            throw null;
        }
        bottomSheetBehavior2.f20795W.remove(this.bottomSheetCallBack);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onPause() {
        super.onPause();
        C20823d c20823d = this.composerSuggestionsController;
        if (c20823d != null) {
            c20823d.m57436i();
        }
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m5738T0();
        m5688E2();
        m5789k2();
        m5818u1();
        m5777g2();
        m5763b2();
        m5700H2();
        m5771e2();
        m5773f1().f47484f.getLayoutTransition().setAnimateParentHierarchy(false);
    }
}

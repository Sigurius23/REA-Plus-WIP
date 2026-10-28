package io.getstream.chat.android.p226ui.feature.messages.list;

import android.animation.LayoutTransition;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1720p1;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.C1715o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.material.button.MaterialButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import ge3.AbstractC15751g;
import i01.C17841d;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import io.getstream.chat.android.p226ui.common.helper.DateFormatter;
import io.getstream.chat.android.p226ui.common.state.messages.BlockUser;
import io.getstream.chat.android.p226ui.common.state.messages.Copy;
import io.getstream.chat.android.p226ui.common.state.messages.CustomAction;
import io.getstream.chat.android.p226ui.common.state.messages.Delete;
import io.getstream.chat.android.p226ui.common.state.messages.Edit;
import io.getstream.chat.android.p226ui.common.state.messages.Flag;
import io.getstream.chat.android.p226ui.common.state.messages.MarkAsUnread;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.MuteUser;
import io.getstream.chat.android.p226ui.common.state.messages.Pin;
import io.getstream.chat.android.p226ui.common.state.messages.React;
import io.getstream.chat.android.p226ui.common.state.messages.Reply;
import io.getstream.chat.android.p226ui.common.state.messages.Resend;
import io.getstream.chat.android.p226ui.common.state.messages.ThreadReply;
import io.getstream.chat.android.p226ui.common.state.messages.UnblockUser;
import io.getstream.chat.android.p226ui.common.state.messages.UnmuteUser;
import io.getstream.chat.android.p226ui.common.state.messages.list.GiphyAction;
import io.getstream.chat.android.p226ui.common.state.messages.list.ModeratedMessageOption;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageListViewBinding;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryDestination;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryItem;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryResultItem;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryResultItemKt;
import io.getstream.chat.android.p226ui.feature.messages.dialog.ModeratedMessageDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewHolderFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListenersImpl;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.MessageListItemAdapter;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.AttachmentFactoryManager;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactoryImpl;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.HiddenMessageListItemPredicate;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.MessageListScrollHelper;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.MessageListViewExtensionsKt;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.ScrollButtonView;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.SwipeReplyCallback;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.AddPollCommentDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.PollCommentsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.PollResultsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.SuggestPollOptionDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.MessageOptionItem;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.MessageOptionItemsFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.MessageOptionsDialogFragment;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.model.MessageListItemWrapper;
import io.getstream.chat.android.p226ui.navigation.ChatNavigator;
import io.getstream.chat.android.p226ui.navigation.destinations.AttachmentDestination;
import io.getstream.chat.android.p226ui.navigation.destinations.ChatDestination;
import io.getstream.chat.android.p226ui.navigation.destinations.WebLinkDestination;
import io.getstream.chat.android.p226ui.utils.ListenerDelegate;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.utils.extensions.UserKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import n23.AbstractC26205h;
import no.nordicsemi.android.dfu.DfuBaseService;
import o23.C27478h;
import o23.InterfaceC27474d;
import p047c9.C4312c;
import p088dc.AbstractC11895b;
import p236j.AbstractC21071j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import xa0.C38136a;
import xb3.AbstractC38176k;
import xb3.C38170e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000´\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\bC*\u0002\u0083\u0004\u0018\u0000 \u008b\u00042\u00020\u0001:t\u008b\u0004\u008c\u0004\u008d\u0004\u008e\u0004\u008f\u0004\u0090\u0004\u0091\u0004\u0092\u0004\u0093\u0004\u0094\u0004\u0095\u0004\u0096\u0004\u0097\u0004\u0098\u0004\u0099\u0004\u009a\u0004\u009b\u0004\u009c\u0004\u009d\u0004\u009e\u0004\u009f\u0004 \u0004¡\u0004¢\u0004£\u0004¤\u0004¥\u0004¦\u0004§\u0004¨\u0004©\u0004ª\u0004«\u0004¬\u0004\u00ad\u0004®\u0004¯\u0004°\u0004±\u0004²\u0004³\u0004´\u0004µ\u0004¶\u0004·\u0004¸\u0004¹\u0004º\u0004»\u0004¼\u0004½\u0004¾\u0004¿\u0004À\u0004Á\u0004Â\u0004Ã\u0004Ä\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ]\u0010\u001a\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\"\u0010!J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0015¢\u0006\u0004\b0\u0010!J\u0015\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J!\u0010=\u001a\u00020\u00152\u0006\u0010:\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0015¢\u0006\u0004\b?\u0010!J\r\u0010@\u001a\u00020\u0015¢\u0006\u0004\b@\u0010!J\u0015\u0010B\u001a\u00020\u00152\u0006\u0010A\u001a\u00020&¢\u0006\u0004\bB\u0010)J!\u0010C\u001a\u00020\u00152\u0006\u0010:\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\bC\u0010>J\r\u0010D\u001a\u00020\u0015¢\u0006\u0004\bD\u0010!J\r\u0010E\u001a\u00020\u0015¢\u0006\u0004\bE\u0010!J\u0015\u0010H\u001a\u00020\u00152\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u00152\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00152\u0006\u0010N\u001a\u00020&¢\u0006\u0004\bO\u0010)J\u0015\u0010Q\u001a\u00020\u00152\u0006\u0010P\u001a\u00020&¢\u0006\u0004\bQ\u0010)J\u0015\u0010R\u001a\u00020\u00152\u0006\u0010P\u001a\u00020&¢\u0006\u0004\bR\u0010)J\u0015\u0010S\u001a\u00020\u00152\u0006\u0010P\u001a\u00020&¢\u0006\u0004\bS\u0010)J\u0015\u0010T\u001a\u00020\u00152\u0006\u0010P\u001a\u00020&¢\u0006\u0004\bT\u0010)J\u0015\u0010U\u001a\u00020\u00152\u0006\u0010P\u001a\u00020&¢\u0006\u0004\bU\u0010)J\u0015\u0010V\u001a\u00020\u00152\u0006\u0010P\u001a\u00020&¢\u0006\u0004\bV\u0010)J\u0015\u0010W\u001a\u00020\u00152\u0006\u0010P\u001a\u00020&¢\u0006\u0004\bW\u0010)J\u0015\u0010X\u001a\u00020\u00152\u0006\u0010P\u001a\u00020&¢\u0006\u0004\bX\u0010)J\u0015\u0010[\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b[\u0010\\J\u0015\u0010_\u001a\u00020\u00152\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u0015\u0010c\u001a\u00020\u00152\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bc\u0010dJ\u0015\u0010g\u001a\u00020\u00152\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ\u0015\u0010k\u001a\u00020\u00152\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u0015\u0010o\u001a\u00020\u00152\u0006\u0010n\u001a\u00020m¢\u0006\u0004\bo\u0010pJ\u0015\u0010s\u001a\u00020\u00152\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bs\u0010tJ\u0015\u0010w\u001a\u00020\u00152\u0006\u0010v\u001a\u00020u¢\u0006\u0004\bw\u0010xJ\u0017\u0010|\u001a\u00020\u00152\u0006\u0010y\u001a\u00020\tH\u0000¢\u0006\u0004\bz\u0010{J\u0016\u0010\u007f\u001a\u00020\u00152\u0006\u0010~\u001a\u00020}¢\u0006\u0005\b\u007f\u0010\u0080\u0001J!\u0010\u0084\u0001\u001a\u00020\u00152\u000f\u0010\u0083\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0087\u0001\u001a\u00030\u0086\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0010\u0010\u0089\u0001\u001a\u00020&¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001c\u0010\u008d\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001c\u0010\u0090\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008f\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001c\u0010\u0093\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0092\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001c\u0010\u0096\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0095\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u0099\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0098\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001c\u0010\u009c\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u009b\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001c\u0010\u009f\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u009e\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001c\u0010¢\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010¡\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001c\u0010¥\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010¤\u0001¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001c\u0010¨\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010§\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001c\u0010«\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001c\u0010®\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u00ad\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001c\u0010±\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010°\u0001¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001c\u0010´\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010³\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001c\u0010·\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010¶\u0001¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001c\u0010º\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010¹\u0001¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001c\u0010½\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010¼\u0001¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001c\u0010À\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010¿\u0001¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001c\u0010Ã\u0001\u001a\u00020\u00152\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010Â\u0001¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u001a\u0010Æ\u0001\u001a\u00020\u00152\b\u0010\u008c\u0001\u001a\u00030Å\u0001¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u001a\u0010Ê\u0001\u001a\u00020\u00152\b\u0010É\u0001\u001a\u00030È\u0001¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001a\u0010Î\u0001\u001a\u00020\u00152\b\u0010Í\u0001\u001a\u00030Ì\u0001¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u001a\u0010Ò\u0001\u001a\u00020\u00152\b\u0010Ñ\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u001a\u0010Ö\u0001\u001a\u00020\u00152\b\u0010Õ\u0001\u001a\u00030Ô\u0001¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u001a\u0010Ú\u0001\u001a\u00020\u00152\b\u0010Ù\u0001\u001a\u00030Ø\u0001¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\u001a\u0010Þ\u0001\u001a\u00020\u00152\b\u0010Ý\u0001\u001a\u00030Ü\u0001¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u001a\u0010â\u0001\u001a\u00020\u00152\b\u0010á\u0001\u001a\u00030à\u0001¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u001a\u0010æ\u0001\u001a\u00020\u00152\b\u0010å\u0001\u001a\u00030ä\u0001¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u001a\u0010ê\u0001\u001a\u00020\u00152\b\u0010é\u0001\u001a\u00030è\u0001¢\u0006\u0006\bê\u0001\u0010ë\u0001J\u001a\u0010î\u0001\u001a\u00020\u00152\b\u0010í\u0001\u001a\u00030ì\u0001¢\u0006\u0006\bî\u0001\u0010ï\u0001J\u001a\u0010ò\u0001\u001a\u00020\u00152\b\u0010ñ\u0001\u001a\u00030ð\u0001¢\u0006\u0006\bò\u0001\u0010ó\u0001J\u001a\u0010ö\u0001\u001a\u00020\u00152\b\u0010õ\u0001\u001a\u00030ô\u0001¢\u0006\u0006\bö\u0001\u0010÷\u0001J\u001a\u0010ú\u0001\u001a\u00020\u00152\b\u0010ù\u0001\u001a\u00030ø\u0001¢\u0006\u0006\bú\u0001\u0010û\u0001J\u001a\u0010þ\u0001\u001a\u00020\u00152\b\u0010ý\u0001\u001a\u00030ü\u0001¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J\u001a\u0010\u0082\u0002\u001a\u00020\u00152\b\u0010\u0081\u0002\u001a\u00030\u0080\u0002¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J\u001a\u0010\u0086\u0002\u001a\u00020\u00152\b\u0010\u0085\u0002\u001a\u00030\u0084\u0002¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J\u001a\u0010\u008a\u0002\u001a\u00020\u00152\b\u0010\u0089\u0002\u001a\u00030\u0088\u0002¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J\u001a\u0010\u008e\u0002\u001a\u00020\u00152\b\u0010\u008d\u0002\u001a\u00030\u008c\u0002¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\u001a\u0010\u0092\u0002\u001a\u00020\u00152\b\u0010\u0091\u0002\u001a\u00030\u0090\u0002¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J\u001a\u0010\u0096\u0002\u001a\u00020\u00152\b\u0010\u0095\u0002\u001a\u00030\u0094\u0002¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002J\u001a\u0010\u009a\u0002\u001a\u00020\u00152\b\u0010\u0099\u0002\u001a\u00030\u0098\u0002¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002J\u001a\u0010\u009e\u0002\u001a\u00020\u00152\b\u0010\u009d\u0002\u001a\u00030\u009c\u0002¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002J\u001a\u0010¢\u0002\u001a\u00020\u00152\b\u0010¡\u0002\u001a\u00030 \u0002¢\u0006\u0006\b¢\u0002\u0010£\u0002J\u001a\u0010¦\u0002\u001a\u00020\u00152\b\u0010¥\u0002\u001a\u00030¤\u0002¢\u0006\u0006\b¦\u0002\u0010§\u0002J\u001a\u0010©\u0002\u001a\u00020\u00152\b\u0010¥\u0002\u001a\u00030¨\u0002¢\u0006\u0006\b©\u0002\u0010ª\u0002J\u001a\u0010¬\u0002\u001a\u00020\u00152\b\u0010¥\u0002\u001a\u00030«\u0002¢\u0006\u0006\b¬\u0002\u0010\u00ad\u0002J\u001a\u0010¯\u0002\u001a\u00020\u00152\b\u0010¥\u0002\u001a\u00030®\u0002¢\u0006\u0006\b¯\u0002\u0010°\u0002J\u001a\u0010²\u0002\u001a\u00020\u00152\b\u0010¥\u0002\u001a\u00030±\u0002¢\u0006\u0006\b²\u0002\u0010³\u0002J\u001a\u0010µ\u0002\u001a\u00020\u00152\b\u0010¥\u0002\u001a\u00030´\u0002¢\u0006\u0006\bµ\u0002\u0010¶\u0002J\u001a\u0010¸\u0002\u001a\u00020\u00152\b\u0010¥\u0002\u001a\u00030·\u0002¢\u0006\u0006\b¸\u0002\u0010¹\u0002J\u001a\u0010»\u0002\u001a\u00020\u00152\b\u0010¥\u0002\u001a\u00030º\u0002¢\u0006\u0006\b»\u0002\u0010¼\u0002J\u001a\u0010¾\u0002\u001a\u00020\u00152\b\u0010\u008c\u0001\u001a\u00030½\u0002¢\u0006\u0006\b¾\u0002\u0010¿\u0002J\u001a\u0010Á\u0002\u001a\u00020\u00152\b\u0010\u008c\u0001\u001a\u00030À\u0002¢\u0006\u0006\bÁ\u0002\u0010Â\u0002J\u0017\u0010Ã\u0002\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0005\bÃ\u0002\u0010+J\u000f\u0010Ä\u0002\u001a\u00020\u0015¢\u0006\u0005\bÄ\u0002\u0010!J\u0017\u0010Å\u0002\u001a\u00020\u00152\u0006\u0010y\u001a\u00020\t¢\u0006\u0005\bÅ\u0002\u0010{J\u001d\u0010Ç\u0002\u001a\u00020\u00152\t\u0010Æ\u0002\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0006\bÇ\u0002\u0010È\u0002J\u001c\u0010Ë\u0002\u001a\u00020\u00152\b\u0010Ê\u0002\u001a\u00030É\u0002H\u0002¢\u0006\u0006\bË\u0002\u0010Ì\u0002J\u0011\u0010Í\u0002\u001a\u00020\u0015H\u0002¢\u0006\u0005\bÍ\u0002\u0010!J\u0011\u0010Î\u0002\u001a\u00020\u0015H\u0002¢\u0006\u0005\bÎ\u0002\u0010!J\u0011\u0010Ï\u0002\u001a\u00020\u0015H\u0002¢\u0006\u0005\bÏ\u0002\u0010!J\u0011\u0010Ð\u0002\u001a\u00020\u0015H\u0002¢\u0006\u0005\bÐ\u0002\u0010!J\u0011\u0010Ñ\u0002\u001a\u00020\u0015H\u0002¢\u0006\u0005\bÑ\u0002\u0010!J\u001d\u0010Ó\u0002\u001a\u00020\u00152\t\u0010Ò\u0002\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0006\bÓ\u0002\u0010È\u0002J\u001c\u0010Ö\u0002\u001a\u00020\u00152\b\u0010Õ\u0002\u001a\u00030Ô\u0002H\u0002¢\u0006\u0006\bÖ\u0002\u0010×\u0002J\u0011\u0010Ø\u0002\u001a\u00020\u0015H\u0002¢\u0006\u0005\bØ\u0002\u0010!J\u001a\u0010Ú\u0002\u001a\u00020\u00152\u0007\u0010Ù\u0002\u001a\u00020mH\u0002¢\u0006\u0005\bÚ\u0002\u0010pJ7\u0010ß\u0002\u001a\u00020\u0015*\u00030Ô\u00022\u000e\u0010Ü\u0002\u001a\t\u0012\u0005\u0012\u00030Û\u00020\u00102\u000e\u0010Þ\u0002\u001a\t\u0012\u0004\u0012\u00020\u00150Ý\u0002H\u0002¢\u0006\u0006\bß\u0002\u0010à\u0002J\u001a\u0010â\u0002\u001a\u00020\u00152\u0007\u0010á\u0002\u001a\u00020\tH\u0002¢\u0006\u0005\bâ\u0002\u0010{J\u001c\u0010å\u0002\u001a\u00020\u00152\b\u0010ä\u0002\u001a\u00030ã\u0002H\u0002¢\u0006\u0006\bå\u0002\u0010æ\u0002J\u001b\u0010è\u0002\u001a\u00020\u00152\u0007\u0010ç\u0002\u001a\u00020\u0018H\u0002¢\u0006\u0006\bè\u0002\u0010é\u0002R!\u0010ï\u0002\u001a\u00030ê\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bë\u0002\u0010ì\u0002\u001a\u0006\bí\u0002\u0010î\u0002R\u001c\u0010ð\u0002\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0002\u0010ñ\u0002R\u001a\u0010ó\u0002\u001a\u00030ò\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bó\u0002\u0010ô\u0002R\u001a\u0010Õ\u0002\u001a\u00030Ô\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÕ\u0002\u0010õ\u0002R\u0019\u0010ö\u0002\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bö\u0002\u0010÷\u0002R\u001a\u0010ù\u0002\u001a\u00030ø\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bù\u0002\u0010ú\u0002R\u0019\u0010û\u0002\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bû\u0002\u0010÷\u0002R\u001a\u0010ü\u0002\u001a\u00030ø\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bü\u0002\u0010ú\u0002R\u001a\u0010þ\u0002\u001a\u00030ý\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bþ\u0002\u0010ÿ\u0002R\u001c\u0010\u0081\u0003\u001a\u0005\u0018\u00010\u0080\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0003\u0010\u0082\u0003R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0083\u0003R \u0010\u0087\u0003\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0003\u0010ì\u0002\u001a\u0006\b\u0085\u0003\u0010\u0086\u0003R\u001a\u0010É\u0001\u001a\u00030È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010\u0088\u0003R\u001a\u0010Í\u0001\u001a\u00030Ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0089\u0003R\u001a\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010\u008a\u0003R\u001a\u0010Õ\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010\u008b\u0003R\u001a\u0010Ù\u0001\u001a\u00030Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010\u008c\u0003R\u001a\u0010Ý\u0001\u001a\u00030Ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010\u008d\u0003R\u001a\u0010á\u0001\u001a\u00030à\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010\u008e\u0003R\u001a\u0010å\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010\u008f\u0003R\u001a\u0010\u0090\u0003\u001a\u00030Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0003\u0010\u0091\u0003R\u001a\u0010é\u0001\u001a\u00030è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010\u0092\u0003R\u001a\u0010ù\u0001\u001a\u00030ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010\u0093\u0003R\u001a\u0010ý\u0001\u001a\u00030ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010\u0094\u0003R\u001a\u0010í\u0001\u001a\u00030ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010\u0095\u0003R\u001a\u0010ñ\u0001\u001a\u00030ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010\u0096\u0003R\u001a\u0010õ\u0001\u001a\u00030ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010\u0097\u0003R\u001a\u0010\u0081\u0002\u001a\u00030\u0080\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0098\u0003R\u001a\u0010\u0085\u0002\u001a\u00030\u0084\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0099\u0003R\u001a\u0010\u0089\u0002\u001a\u00030\u0088\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u009a\u0003R\u001a\u0010\u008d\u0002\u001a\u00030\u008c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u009b\u0003R\u001a\u0010\u0091\u0002\u001a\u00030\u0090\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u009c\u0003R\u001a\u0010\u0095\u0002\u001a\u00030\u0094\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u009d\u0003R\u001a\u0010\u0099\u0002\u001a\u00030\u0098\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009e\u0003R\u001c\u0010\u009f\u0003\u001a\u0005\u0018\u00010º\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0003\u0010 \u0003R\u001a\u0010\u009d\u0002\u001a\u00030\u009c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010¡\u0003R\u001a\u0010¡\u0002\u001a\u00030 \u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0003R5\u0010©\u0003\u001a\u00030¤\u00022\b\u0010£\u0003\u001a\u00030¤\u00028B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¤\u0003\u0010¥\u0003\u001a\u0006\b¦\u0003\u0010§\u0003\"\u0006\b¨\u0003\u0010§\u0002R5\u0010®\u0003\u001a\u00030¨\u00022\b\u0010£\u0003\u001a\u00030¨\u00028B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bª\u0003\u0010¥\u0003\u001a\u0006\b«\u0003\u0010¬\u0003\"\u0006\b\u00ad\u0003\u0010ª\u0002R5\u0010³\u0003\u001a\u00030«\u00022\b\u0010£\u0003\u001a\u00030«\u00028B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¯\u0003\u0010¥\u0003\u001a\u0006\b°\u0003\u0010±\u0003\"\u0006\b²\u0003\u0010\u00ad\u0002R5\u0010¸\u0003\u001a\u00030®\u00022\b\u0010£\u0003\u001a\u00030®\u00028B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b´\u0003\u0010¥\u0003\u001a\u0006\bµ\u0003\u0010¶\u0003\"\u0006\b·\u0003\u0010°\u0002R\u001a\u0010¹\u0003\u001a\u00030±\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0003\u0010º\u0003R\u001a\u0010»\u0003\u001a\u00030´\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0003\u0010¼\u0003R\u0017\u0010r\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\br\u0010½\u0003R\u0017\u0010v\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bv\u0010¾\u0003R\u0017\u0010j\u001a\u00020i8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010¿\u0003R\u001a\u0010Á\u0003\u001a\u00030À\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÁ\u0003\u0010Â\u0003R\u0017\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b-\u0010Ã\u0003R\u0019\u0010Ä\u0003\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0003\u0010Å\u0003R\u0018\u0010Æ\u0003\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0003\u0010Ç\u0003R\u0018\u0010È\u0003\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0003\u0010É\u0003R\u001c\u0010Ê\u0003\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0003\u0010Ë\u0003R\u0018\u0010Ì\u0003\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0003\u0010Í\u0003R\u0018\u0010Î\u0003\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0003\u0010Ï\u0003R\u0018\u0010Ñ\u0003\u001a\u00030Ð\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0003\u0010Ò\u0003R\u0018\u0010Ô\u0003\u001a\u00030Ó\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0003\u0010Õ\u0003R5\u0010Ø\u0003\u001a \u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140Ö\u0003j\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`×\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0003\u0010Ù\u0003R#\u0010Ú\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0003\u0010Û\u0003R\u0018\u0010Ü\u0003\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0003\u0010Ý\u0003R\u0018\u0010Þ\u0003\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0003\u0010ß\u0003R\u0018\u0010à\u0003\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0003\u0010á\u0003R\u0018\u0010â\u0003\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0003\u0010ã\u0003R\u0018\u0010ä\u0003\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0003\u0010å\u0003R\u0018\u0010ç\u0003\u001a\u00030æ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0003\u0010è\u0003R\u0018\u0010é\u0003\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0003\u0010ê\u0003R\u0018\u0010ë\u0003\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0003\u0010ì\u0003R\u0018\u0010í\u0003\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0003\u0010î\u0003R\u0018\u0010ï\u0003\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0003\u0010ð\u0003R\u0018\u0010ò\u0003\u001a\u00030ñ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0003\u0010ó\u0003R\u0018\u0010ô\u0003\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0003\u0010õ\u0003R\u0018\u0010ö\u0003\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0003\u0010÷\u0003R\u0018\u0010ø\u0003\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0003\u0010ù\u0003R\u0018\u0010ú\u0003\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0003\u0010û\u0003R\u0018\u0010ü\u0003\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0003\u0010ý\u0003R\u0018\u0010ÿ\u0003\u001a\u00030þ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0003\u0010\u0080\u0004R\u001a\u0010\u0081\u0004\u001a\u00030¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0004\u0010ì\u0003R\u001a\u0010\u0082\u0004\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0004\u0010î\u0003R\u0018\u0010\u0084\u0004\u001a\u00030\u0083\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0004\u0010\u0085\u0004R\u0017\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bZ\u0010\u0086\u0004R\u0017\u0010f\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bf\u0010\u0087\u0004R\u0017\u0010~\u001a\u00020}8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b~\u0010\u0088\u0004R\u0017\u0010^\u001a\u00020]8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b^\u0010\u0089\u0004R\u0017\u0010b\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bb\u0010\u008a\u0004¨\u0006Å\u0004"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/o1;", "fragmentManager", "Lio/getstream/chat/android/models/Message;", "message", "", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;", "messageOptionItems", "Lkotlin/Function2;", "", "Ll83/a0;", "reactionClickListener", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "optionClickListener", "showMessageOptionsDialog", "(Landroidx/fragment/app/o1;Lio/getstream/chat/android/models/Message;Ljava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;)V", "", "ownCapabilities", "setOwnCapabilities", "(Ljava/util/Set;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "", "loadingMore", "setLoadingMore", "(Z)V", "scrollToMessage", "(Lio/getstream/chat/android/models/Message;)V", "Lio/getstream/chat/android/models/Channel;", "channel", "updateChannel", "(Lio/getstream/chat/android/models/Channel;)V", "scrollToBottom", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "setCustomLinearLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "Landroidx/recyclerview/widget/p1;", "itemAnimator", "setCustomItemAnimator", "(Landroidx/recyclerview/widget/p1;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "setLoadingView", "(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V", "showLoadingView", "hideLoadingView", "shouldRequest", "shouldRequestMessagesAtBottom", "setEmptyStateView", "showEmptyStateView", "hideEmptyStateView", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "errorEvent", "showError", "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$NewMessagesBehaviour;", "newMessagesBehaviour", "setNewMessagesBehaviour", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$NewMessagesBehaviour;)V", "scrollToBottomButtonEnabled", "setScrollToBottomButtonEnabled", "enabled", "setEditMessageEnabled", "setDeleteMessageEnabled", "setDeleteMessageConfirmationEnabled", "setCopyMessageEnabled", "setMessageFlagEnabled", "setReactionsEnabled", "setThreadsEnabled", "setRepliesEnabled", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;", "messageListItemViewHolderFactory", "setMessageViewHolderFactory", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;)V", "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "messageBackgroundFactory", "setMessageBackgroundFactory", "(Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;)V", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory;", "messageOptionItemsFactory", "setMessageOptionItemsFactory", "(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory;)V", "Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "messageDateFormatter", "setMessageDateFormatter", "(Lio/getstream/chat/android/ui/common/helper/DateFormatter;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "showAvatarPredicate", "setShowAvatarPredicate", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V", "Lio/getstream/chat/android/ui/model/MessageListItemWrapper;", "messageListItemWrapper", "displayNewMessages", "(Lio/getstream/chat/android/ui/model/MessageListItemWrapper;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemPredicate;", "messageListItemPredicate", "setMessageListItemPredicate", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemPredicate;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemTransformer;", "messageListItemTransformer", "setMessageItemTransformer", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemTransformer;)V", "unreadCount", "setUnreadCount$stream_chat_android_ui_components_release", "(I)V", "setUnreadCount", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "attachmentFactoryManager", "setAttachmentFactoryManager", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)V", "Ln23/h;", "Lio/getstream/chat/android/models/Flag;", "result", "handleFlagMessageResult", "(Ln23/h;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "requireStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "isAdapterInitialized", "()Z", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;", "listener", "setOnMessageClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;", "setOnPollOptionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;", "setOnPollCloseClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;", "setOnViewPollResultClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;", "setOnSuggestPollOptionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;", "setOnAddPollCommentClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;", "setOnViewPollCommentsClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;", "setOnMessageLongClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnModeratedMessageLongClickListener;", "setOnModeratedMessageLongClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnModeratedMessageLongClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;", "setOnMessageRetryListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;", "setOnThreadClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;", "setOnAttachmentClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;", "setOnAttachmentDownloadClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;", "setOnReactionViewClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;", "setOnUserClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;", "setOnMentionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;", "setOnLinkClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;", "setOnEnterThreadListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserReactionClickListener;", "setOnUserReactionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserReactionClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReplyMessageClickListener;", "setOnReplyMessageClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReplyMessageClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$EndRegionReachedHandler;", "endRegionReachedHandler", "setEndRegionReachedHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$EndRegionReachedHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$BottomEndRegionReachedHandler;", "bottomEndRegionReachedHandler", "setBottomEndRegionReachedHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$BottomEndRegionReachedHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$LastMessageReadHandler;", "lastMessageReadHandler", "setLastMessageReadHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$LastMessageReadHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageEditHandler;", "messageEditHandler", "setMessageEditHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageEditHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageDeleteHandler;", "messageDeleteHandler", "setMessageDeleteHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageDeleteHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ThreadStartHandler;", "threadStartHandler", "setThreadStartHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ThreadStartHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OpenThreadHandler;", "openThreadHandler", "setOpenThreadHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OpenThreadHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ToggleOriginalTextHandler;", "toggleOriginalTextHandler", "setToggleOriginalTextHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ToggleOriginalTextHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageFlagHandler;", "messageFlagHandler", "setMessageFlagHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageFlagHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$FlagMessageResultHandler;", "flagMessageResultHandler", "setFlagMessageResultHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$FlagMessageResultHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagePinHandler;", "messagePinHandler", "setMessagePinHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagePinHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageMarkAsUnreadHandler;", "messageMarkAsUnreadHandler", "setMessageMarkAsUnreadHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageMarkAsUnreadHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserBlockHandler;", "messageUserBlockHandler", "setMessageUserBlockHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserBlockHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserUnblockHandler;", "messageUserUnblockHandler", "setMessageUserUnblockHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserUnblockHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUnpinHandler;", "messageUnpinHandler", "setMessageUnpinHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUnpinHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$GiphySendHandler;", "giphySendHandler", "setGiphySendHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$GiphySendHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageRetryHandler;", "messageRetryHandler", "setMessageRetryHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageRetryHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReactionHandler;", "messageReactionHandler", "setMessageReactionHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReactionHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$CustomActionHandler;", "customActionHandler", "setCustomActionHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$CustomActionHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReplyHandler;", "messageReplyHandler", "setMessageReplyHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReplyHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$AttachmentDownloadHandler;", "attachmentDownloadHandler", "setAttachmentDownloadHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$AttachmentDownloadHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmDeleteMessageHandler;", "confirmDeleteMessageHandler", "setConfirmDeleteMessageHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmDeleteMessageHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmFlagMessageHandler;", "confirmFlagMessageHandler", "setConfirmFlagMessageHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmFlagMessageHandler;)V", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;", "handler", "setAttachmentReplyOptionClickHandler", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;)V", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentShowInChatOptionHandler;", "setAttachmentShowInChatOptionClickHandler", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentShowInChatOptionHandler;)V", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDownloadOptionHandler;", "setDownloadOptionHandler", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDownloadOptionHandler;)V", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;", "setAttachmentDeleteOptionClickHandler", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ErrorEventHandler;", "setErrorEventHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ErrorEventHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;", "setModeratedMessageHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;", "setOnScrollToBottomHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPauseAudioRecordingAttachmentsHandler;", "setOnPauseAudioRecordingAttachmentsHandler", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPauseAudioRecordingAttachmentsHandler;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelClickListener;", "setOnUnreadLabelClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;", "setOnUnreadLabelReachedListener", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;)V", "showModeratedMessageDialog", "hideUnreadLabelButton", "showUnreadLabelButton", "attr", "init", "(Landroid/util/AttributeSet;)V", "Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;", "unreadLabelButtonStyle", "initUnreadLabelButton", "(Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;)V", "initLoadingView", "initEmptyStateView", "initRecyclerView", "initScrollHelper", "initSwipeToReply", "attributeSet", "configureAttributes", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;", "adapter", "setMessageListItemAdapter", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;)V", "initAdapter", "listItem", "handleNewWrapper", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "filteredList", "Lkotlin/Function0;", "commitCallback", "submitListOnAnimationsFinished", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;Ljava/util/List;Lc93/a;)V", "messageStartValue", "chatMessageStart", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;", "messagesStart", "changeLayoutForMessageStart", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;)V", "messageAction", "handleMessageAction", "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "messageListViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageListViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageListViewBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;", "loadingView", "Landroid/view/View;", "Landroid/view/ViewGroup;", "loadingViewContainer", "Landroid/view/ViewGroup;", "emptyStateView", "emptyStateViewContainer", "Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;", "scrollHelper", "Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;", "Lcom/google/android/material/button/MaterialButton;", "unreadLabelButton", "Lcom/google/android/material/button/MaterialButton;", "Ljava/util/Set;", "defaultChildLayoutParams$delegate", "getDefaultChildLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "defaultChildLayoutParams", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$EndRegionReachedHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$BottomEndRegionReachedHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$LastMessageReadHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageEditHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageDeleteHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ThreadStartHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OpenThreadHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ToggleOriginalTextHandler;", "replyMessageClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReplyMessageClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageFlagHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserBlockHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserUnblockHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$FlagMessageResultHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagePinHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageMarkAsUnreadHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUnpinHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$GiphySendHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageRetryHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReactionHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$CustomActionHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReplyHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$AttachmentDownloadHandler;", "onPauseAudioRecordingAttachmentsHandler", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPauseAudioRecordingAttachmentsHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmDeleteMessageHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmFlagMessageHandler;", "<set-?>", "_attachmentReplyOptionHandler$delegate", "Lio/getstream/chat/android/ui/utils/ListenerDelegate;", "get_attachmentReplyOptionHandler", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;", "set_attachmentReplyOptionHandler", "_attachmentReplyOptionHandler", "_attachmentShowInChatOptionClickHandler$delegate", "get_attachmentShowInChatOptionClickHandler", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentShowInChatOptionHandler;", "set_attachmentShowInChatOptionClickHandler", "_attachmentShowInChatOptionClickHandler", "_attachmentDownloadOptionHandler$delegate", "get_attachmentDownloadOptionHandler", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDownloadOptionHandler;", "set_attachmentDownloadOptionHandler", "_attachmentDownloadOptionHandler", "_attachmentDeleteOptionHandler$delegate", "get_attachmentDeleteOptionHandler", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;", "set_attachmentDeleteOptionHandler", "_attachmentDeleteOptionHandler", "errorEventHandler", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ErrorEventHandler;", "moderatedMessageOptionHandler", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemPredicate;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemTransformer;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;", "loadMoreListener", "Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;", "Lio/getstream/chat/android/models/Channel;", "lockScrollUp", "Z", "defaultMessageClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;", "defaultMessageLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;", "moderatedMessageLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnModeratedMessageLongClickListener;", "defaultMessageRetryListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;", "defaultThreadClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;", "defaultTranslatedLabelClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryDestination;", "attachmentGalleryDestination", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryDestination;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "languageCache", "Ljava/util/HashMap;", "getLanguageDisplayName", "Lkotlin/jvm/functions/Function1;", "defaultAttachmentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;", "defaultAttachmentDownloadClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;", "defaultReactionViewClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;", "defaultUserClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;", "defaultMentionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;", "defaultGiphySendListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;", "defaultLinkClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;", "defaultEnterThreadListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;", "defaultUserReactionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserReactionClickListener;", "defaultOnPollOptionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;", "defaultOnShowAllPollOptionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;", "defaultOnPollCloseClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;", "defaultOnViewPollResultClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;", "defaultOnSuggestPollOptionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;", "defaultOnAddPollCommentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;", "defaultOnViewPollCommentsClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;", "listenerContainer", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;", "enterThreadListener", "userReactionClickListener", "io/getstream/chat/android/ui/feature/messages/list/MessageListView$pauseAudioPlayerListener$1", "pauseAudioPlayerListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$pauseAudioPlayerListener$1;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;", "Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory;", "Companion", "BottomEndRegionReachedHandler", "OnEnterThreadListener", "OnMessageClickListener", "OnPollOptionClickListener", "OnShowAllPollOptionClickListener", "OnPollCloseClickListener", "OnViewPollResultClickListener", "OnSuggestPollOptionClickListener", "OnAddPollCommentClickListener", "OnViewPollCommentsClickListener", "OnReplyMessageClickListener", "OnMessageRetryListener", "OnMessageLongClickListener", "OnModeratedMessageLongClickListener", "OnThreadClickListener", "OnTranslatedLabelClickListener", "OnAttachmentClickListener", "OnAttachmentDownloadClickListener", "OnGiphySendListener", "OnLinkClickListener", "OnUnreadLabelClickListener", "OnUnreadLabelReachedListener", "OnUserClickListener", "OnMentionClickListener", "OnReactionViewClickListener", "OnUserReactionClickListener", "EndRegionReachedHandler", "LastMessageReadHandler", "MessageEditHandler", "MessageDeleteHandler", "ConfirmDeleteMessageHandler", "MessageFlagHandler", "MessageUserBlockHandler", "MessageUserUnblockHandler", "MessagePinHandler", "MessageMarkAsUnreadHandler", "MessageUnpinHandler", "FlagMessageResultHandler", "ConfirmFlagMessageHandler", "MessageRetryHandler", "MessageReactionHandler", "MessageReplyHandler", "ThreadStartHandler", "OpenThreadHandler", "ToggleOriginalTextHandler", "GiphySendHandler", "CustomActionHandler", "AttachmentDownloadHandler", "ErrorEventHandler", "ModeratedMessageOptionHandler", "OnScrollToBottomHandler", "OnPauseAudioRecordingAttachmentsHandler", "MessageListItemPredicate", "ShowAvatarPredicate", "MessageListItemTransformer", "NewMessagesBehaviour", "MessagesStart", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListView extends ConstraintLayout {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;
    private static final Companion Companion;
    private static final int LOAD_MORE_THRESHOLD = 10;

    /* JADX INFO: renamed from: _attachmentDeleteOptionHandler$delegate, reason: from kotlin metadata */
    private final ListenerDelegate _attachmentDeleteOptionHandler;

    /* JADX INFO: renamed from: _attachmentDownloadOptionHandler$delegate, reason: from kotlin metadata */
    private final ListenerDelegate _attachmentDownloadOptionHandler;

    /* JADX INFO: renamed from: _attachmentReplyOptionHandler$delegate, reason: from kotlin metadata */
    private final ListenerDelegate _attachmentReplyOptionHandler;

    /* JADX INFO: renamed from: _attachmentShowInChatOptionClickHandler$delegate, reason: from kotlin metadata */
    private final ListenerDelegate _attachmentShowInChatOptionClickHandler;
    private MessageListItemAdapter adapter;
    private AttachmentDownloadHandler attachmentDownloadHandler;
    private AttachmentFactoryManager attachmentFactoryManager;
    private final AttachmentGalleryDestination attachmentGalleryDestination;
    private StreamUiMessageListViewBinding binding;
    private BottomEndRegionReachedHandler bottomEndRegionReachedHandler;
    private Channel channel;
    private ConfirmDeleteMessageHandler confirmDeleteMessageHandler;
    private ConfirmFlagMessageHandler confirmFlagMessageHandler;
    private CustomActionHandler customActionHandler;
    private final OnAttachmentClickListener defaultAttachmentClickListener;
    private final OnAttachmentDownloadClickListener defaultAttachmentDownloadClickListener;

    /* JADX INFO: renamed from: defaultChildLayoutParams$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h defaultChildLayoutParams;
    private final OnEnterThreadListener defaultEnterThreadListener;
    private final OnGiphySendListener defaultGiphySendListener;
    private final OnLinkClickListener defaultLinkClickListener;
    private final OnMentionClickListener defaultMentionClickListener;
    private final OnMessageClickListener defaultMessageClickListener;
    private final OnMessageLongClickListener defaultMessageLongClickListener;
    private final OnMessageRetryListener defaultMessageRetryListener;
    private final OnAddPollCommentClickListener defaultOnAddPollCommentClickListener;
    private final OnPollCloseClickListener defaultOnPollCloseClickListener;
    private final OnPollOptionClickListener defaultOnPollOptionClickListener;
    private final OnShowAllPollOptionClickListener defaultOnShowAllPollOptionClickListener;
    private final OnSuggestPollOptionClickListener defaultOnSuggestPollOptionClickListener;
    private final OnViewPollCommentsClickListener defaultOnViewPollCommentsClickListener;
    private final OnViewPollResultClickListener defaultOnViewPollResultClickListener;
    private final OnReactionViewClickListener defaultReactionViewClickListener;
    private final OnThreadClickListener defaultThreadClickListener;
    private final OnTranslatedLabelClickListener defaultTranslatedLabelClickListener;
    private final OnUserClickListener defaultUserClickListener;
    private final OnUserReactionClickListener defaultUserReactionClickListener;
    private View emptyStateView;
    private ViewGroup emptyStateViewContainer;
    private EndRegionReachedHandler endRegionReachedHandler;
    private OnEnterThreadListener enterThreadListener;
    private ErrorEventHandler errorEventHandler;
    private FlagMessageResultHandler flagMessageResultHandler;
    private final Function1 getLanguageDisplayName;
    private GiphySendHandler giphySendHandler;
    private final HashMap<String, String> languageCache;
    private LastMessageReadHandler lastMessageReadHandler;
    private final MessageListListenersImpl listenerContainer;
    private EndlessMessageListScrollListener loadMoreListener;
    private View loadingView;
    private ViewGroup loadingViewContainer;
    private boolean lockScrollUp;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private MessageBackgroundFactory messageBackgroundFactory;
    private DateFormatter messageDateFormatter;
    private MessageDeleteHandler messageDeleteHandler;
    private MessageEditHandler messageEditHandler;
    private MessageFlagHandler messageFlagHandler;
    private MessageListItemPredicate messageListItemPredicate;
    private MessageListItemTransformer messageListItemTransformer;
    private MessageListItemViewHolderFactory messageListItemViewHolderFactory;
    private MessageListViewStyle messageListViewStyle;
    private MessageMarkAsUnreadHandler messageMarkAsUnreadHandler;
    private MessageOptionItemsFactory messageOptionItemsFactory;
    private MessagePinHandler messagePinHandler;
    private MessageReactionHandler messageReactionHandler;
    private MessageReplyHandler messageReplyHandler;
    private MessageRetryHandler messageRetryHandler;
    private MessageUnpinHandler messageUnpinHandler;
    private MessageUserBlockHandler messageUserBlockHandler;
    private MessageUserUnblockHandler messageUserUnblockHandler;
    private OnModeratedMessageLongClickListener moderatedMessageLongClickListener;
    private ModeratedMessageOptionHandler moderatedMessageOptionHandler;
    private OnPauseAudioRecordingAttachmentsHandler onPauseAudioRecordingAttachmentsHandler;
    private OpenThreadHandler openThreadHandler;
    private Set<String> ownCapabilities;
    private final MessageListView$pauseAudioPlayerListener$1 pauseAudioPlayerListener;
    private OnReplyMessageClickListener replyMessageClickListener;
    private MessageListScrollHelper scrollHelper;
    private ShowAvatarPredicate showAvatarPredicate;
    private ThreadStartHandler threadStartHandler;
    private ToggleOriginalTextHandler toggleOriginalTextHandler;
    private MaterialButton unreadLabelButton;
    private OnUserReactionClickListener userReactionClickListener;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$AttachmentDownloadHandler;", "", "Lkotlin/Function0;", "Lo23/d;", "Ll83/a0;", "attachmentDownloadCall", "onAttachmentDownload", "(Lc93/a;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface AttachmentDownloadHandler {
        void onAttachmentDownload(InterfaceC4339a attachmentDownloadCall);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$BottomEndRegionReachedHandler;", "", "", "messageId", "Ll83/a0;", "onBottomEndRegionReached", "(Ljava/lang/String;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface BottomEndRegionReachedHandler {
        void onBottomEndRegionReached(String messageId);
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$Companion;", "", "<init>", "()V", "LOAD_MORE_THRESHOLD", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmDeleteMessageHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Lkotlin/Function0;", "Ll83/a0;", "confirmCallback", "onConfirmDeleteMessage", "(Lio/getstream/chat/android/models/Message;Lc93/a;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ConfirmDeleteMessageHandler {
        void onConfirmDeleteMessage(Message message, InterfaceC4339a confirmCallback);
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ConfirmFlagMessageHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Lkotlin/Function0;", "Ll83/a0;", "confirmCallback", "onConfirmFlagMessage", "(Lio/getstream/chat/android/models/Message;Lc93/a;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ConfirmFlagMessageHandler {
        void onConfirmFlagMessage(Message message, InterfaceC4339a confirmCallback);
    }

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$CustomActionHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "", "", "extraProperties", "Ll83/a0;", "onCustomAction", "(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface CustomActionHandler {
        void onCustomAction(Message message, Map<String, ? extends Object> extraProperties);
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$EndRegionReachedHandler;", "", "Ll83/a0;", "onEndRegionReached", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface EndRegionReachedHandler {
        void onEndRegionReached();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ErrorEventHandler;", "", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "errorEvent", "Ll83/a0;", "onErrorEvent", "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ErrorEventHandler {
        void onErrorEvent(MessageListController.ErrorEvent errorEvent);
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$FlagMessageResultHandler;", "", "Ln23/h;", "Lio/getstream/chat/android/models/Flag;", "result", "Ll83/a0;", "onHandleResult", "(Ln23/h;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface FlagMessageResultHandler {
        void onHandleResult(AbstractC26205h result);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$GiphySendHandler;", "", "Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;", "action", "Ll83/a0;", "onSendGiphy", "(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface GiphySendHandler {
        void onSendGiphy(GiphyAction action);
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$LastMessageReadHandler;", "", "Ll83/a0;", "onLastMessageRead", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface LastMessageReadHandler {
        void onLastMessageRead();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageDeleteHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onMessageDelete", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageDeleteHandler {
        void onMessageDelete(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageEditHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onMessageEdit", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageEditHandler {
        void onMessageEdit(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageFlagHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onMessageFlag", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageFlagHandler {
        void onMessageFlag(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemPredicate;", "", "predicate", "", "item", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageListItemPredicate {
        boolean predicate(MessageListItem item);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemTransformer;", "", "transform", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "itemList", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageListItemTransformer {
        List<MessageListItem> transform(List<? extends MessageListItem> itemList);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageMarkAsUnreadHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onMessageMarkAsUnread", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageMarkAsUnreadHandler {
        void onMessageMarkAsUnread(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagePinHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onMessagePin", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessagePinHandler {
        void onMessagePin(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReactionHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "", "reactionType", "Ll83/a0;", "onMessageReaction", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageReactionHandler {
        void onMessageReaction(Message message, String reactionType);
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReplyHandler;", "", "", "cid", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onMessageReply", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageReplyHandler {
        void onMessageReply(String cid, Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageRetryHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onMessageRetry", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageRetryHandler {
        void onMessageRetry(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUnpinHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onMessageUnpin", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageUnpinHandler {
        void onMessageUnpin(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserBlockHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onUserBlocked", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageUserBlockHandler {
        void onUserBlocked(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageUserUnblockHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onUserUnblocked", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageUserUnblockHandler {
        void onUserUnblocked(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue$stream_chat_android_ui_components_release", "()I", "BOTTOM", "TOP", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public enum MessagesStart {
        BOTTOM(0),
        TOP(1);

        private final int value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart$Companion;", "", "<init>", "()V", "parseValue", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;", "value", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final MessagesStart parseValue(int value) {
                Object next;
                Iterator<E> it = MessagesStart.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((MessagesStart) next).getValue() != value);
                MessagesStart messagesStart = (MessagesStart) next;
                if (messagesStart != null) {
                    return messagesStart;
                }
                throw new IllegalArgumentException("Unknown messages start type. It must be either BOTTOM (int 0) or TOP (int 1)");
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        MessagesStart(int i13) {
            this.value = i13;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getValue$stream_chat_android_ui_components_release, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;", "moderatedMessageOption", "Ll83/a0;", "onModeratedMessageOptionSelected", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ModeratedMessageOptionHandler {
        void onModeratedMessageOptionSelected(Message message, ModeratedMessageOption moderatedMessageOption);
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$NewMessagesBehaviour;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue$stream_chat_android_ui_components_release", "()I", "SCROLL_TO_BOTTOM", "COUNT_UPDATE", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public enum NewMessagesBehaviour {
        SCROLL_TO_BOTTOM(0),
        COUNT_UPDATE(1);

        private final int value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$NewMessagesBehaviour$Companion;", "", "<init>", "()V", "parseValue", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$NewMessagesBehaviour;", "value", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final NewMessagesBehaviour parseValue(int value) {
                Object next;
                Iterator<E> it = NewMessagesBehaviour.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((NewMessagesBehaviour) next).getValue() != value);
                NewMessagesBehaviour newMessagesBehaviour = (NewMessagesBehaviour) next;
                if (newMessagesBehaviour != null) {
                    return newMessagesBehaviour;
                }
                throw new IllegalArgumentException("Unknown behaviour type. It must be either SCROLL_TO_BOTTOM (int 0) or COUNT_UPDATE (int 1)");
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        NewMessagesBehaviour(int i13) {
            this.value = i13;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getValue$stream_chat_android_ui_components_release, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;", "", "onAddPollCommentClick", "", "message", "Lio/getstream/chat/android/models/Message;", "poll", "Lio/getstream/chat/android/models/Poll;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnAddPollCommentClickListener {
        boolean onAddPollCommentClick(Message message, Poll poll);
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;", "", "onAttachmentClick", "", "message", "Lio/getstream/chat/android/models/Message;", "attachment", "Lio/getstream/chat/android/models/Attachment;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnAttachmentClickListener {
        boolean onAttachmentClick(Message message, Attachment attachment);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;", "", "onAttachmentDownloadClick", "", "attachment", "Lio/getstream/chat/android/models/Attachment;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnAttachmentDownloadClickListener {
        boolean onAttachmentDownloadClick(Attachment attachment);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;", "", "onThreadEntered", "", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnEnterThreadListener {
        boolean onThreadEntered(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;", "", "onGiphySend", "", "action", "Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnGiphySendListener {
        boolean onGiphySend(GiphyAction action);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;", "", "onLinkClick", "", QueryParams.URL, "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnLinkClickListener {
        boolean onLinkClick(String url);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;", "", "onMentionClick", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnMentionClickListener {
        boolean onMentionClick(User user);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;", "", "onMessageClick", "", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnMessageClickListener {
        boolean onMessageClick(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;", "", "onMessageLongClick", "", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnMessageLongClickListener {
        boolean onMessageLongClick(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;", "", "onRetryMessage", "", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnMessageRetryListener {
        boolean onRetryMessage(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnModeratedMessageLongClickListener;", "", "onModeratedMessageLongClick", "", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnModeratedMessageLongClickListener {
        boolean onModeratedMessageLongClick(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPauseAudioRecordingAttachmentsHandler;", "", "Ll83/a0;", "onPauseAudioRecordingAttachments", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnPauseAudioRecordingAttachmentsHandler {
        void onPauseAudioRecordingAttachments();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;", "", "onPollCloseClick", "", "poll", "Lio/getstream/chat/android/models/Poll;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnPollCloseClickListener {
        boolean onPollCloseClick(Poll poll);
    }

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;", "", "onPollOptionClick", "", "message", "Lio/getstream/chat/android/models/Message;", "poll", "Lio/getstream/chat/android/models/Poll;", "option", "Lio/getstream/chat/android/models/Option;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnPollOptionClickListener {
        boolean onPollOptionClick(Message message, Poll poll, Option option);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;", "", "onReactionViewClick", "", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnReactionViewClickListener {
        boolean onReactionViewClick(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReplyMessageClickListener;", "", "onReplyClick", "", "replyTo", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnReplyMessageClickListener {
        boolean onReplyClick(Message replyTo);
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;", "", "Ll83/a0;", "onScrollToBottom", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnScrollToBottomHandler {
        void onScrollToBottom();
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;", "", "onShowAllPollOptionClick", "", "message", "Lio/getstream/chat/android/models/Message;", "poll", "Lio/getstream/chat/android/models/Poll;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnShowAllPollOptionClickListener {
        boolean onShowAllPollOptionClick(Message message, Poll poll);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;", "", "onSuggestPollOptionClick", "", "poll", "Lio/getstream/chat/android/models/Poll;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnSuggestPollOptionClickListener {
        boolean onSuggestPollOptionClick(Poll poll);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;", "", "onThreadClick", "", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnThreadClickListener {
        boolean onThreadClick(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;", "", "onTranslatedLabelClick", "", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnTranslatedLabelClickListener {
        boolean onTranslatedLabelClick(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelClickListener;", "", "Ll83/a0;", "onUnreadLabelClick", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnUnreadLabelClickListener {
        void onUnreadLabelClick();
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;", "", "Ll83/a0;", "onUnreadLabelReached", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnUnreadLabelReachedListener {
        void onUnreadLabelReached();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;", "", "onUserClick", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnUserClickListener {
        boolean onUserClick(User user);
    }

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserReactionClickListener;", "", "onUserReactionClick", "", "message", "Lio/getstream/chat/android/models/Message;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "reaction", "Lio/getstream/chat/android/models/Reaction;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnUserReactionClickListener {
        boolean onUserReactionClick(Message message, User user, Reaction reaction);
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;", "", "onViewPollCommentsClick", "", "message", "Lio/getstream/chat/android/models/Message;", "poll", "Lio/getstream/chat/android/models/Poll;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnViewPollCommentsClickListener {
        boolean onViewPollCommentsClick(Message message, Poll poll);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;", "", "onViewPollResultClick", "", "poll", "Lio/getstream/chat/android/models/Poll;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnViewPollResultClickListener {
        boolean onViewPollResultClick(Poll poll);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OpenThreadHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onOpenThread", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OpenThreadHandler {
        void onOpenThread(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "", "shouldShow", "", "messageItem", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ShowAvatarPredicate {
        boolean shouldShow(MessageListItem.MessageItem messageItem);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ThreadStartHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onStartThread", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ThreadStartHandler {
        void onStartThread(Message message);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ToggleOriginalTextHandler;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onToggleOriginalText", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ToggleOriginalTextHandler {
        void onToggleOriginalText(Message message);
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessagesStart.values().length];
            try {
                iArr[MessagesStart.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagesStart.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.MessageListView$handleNewWrapper$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.list.MessageListView$handleNewWrapper$1", m100430f = "MessageListView.kt", m100431l = {1282}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C197241 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ MessageListItemWrapper $listItem;
        Object L$0;
        int label;
        final /* synthetic */ MessageListView this$0;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.MessageListView$handleNewWrapper$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.list.MessageListView$handleNewWrapper$1$1", m100430f = "MessageListView.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            final /* synthetic */ List<MessageListItem> $filteredList;
            final /* synthetic */ MessageListItemWrapper $listItem;
            int label;
            final /* synthetic */ MessageListView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(MessageListView messageListView, MessageListItemWrapper messageListItemWrapper, List<? extends MessageListItem> list, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = messageListView;
                this.$listItem = messageListItemWrapper;
                this.$filteredList = list;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$4(MessageListView messageListView, boolean z4, MessageListItemWrapper messageListItemWrapper, boolean z13, List list) {
                MessageListScrollHelper messageListScrollHelper = messageListView.scrollHelper;
                if (messageListScrollHelper != null) {
                    messageListScrollHelper.onMessageListChanged$stream_chat_android_ui_components_release(z4, messageListItemWrapper.getHasNewMessages(), z13 && !list.isEmpty(), messageListItemWrapper.getEndOfNewMessagesReached());
                    return C23454a0.f92919a;
                }
                AbstractC22676k.m65757q("scrollHelper");
                throw null;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new AnonymousClass1(this.this$0, this.$listItem, this.$filteredList, interfaceC30057d);
            }

            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass1.invokeSuspend(c23454a0);
                return c23454a0;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0046  */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                final boolean z4;
                MessageListViewStyle messageListViewStyle;
                Object next;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                MessageListItemAdapter messageListItemAdapter = this.this$0.adapter;
                if (messageListItemAdapter == null) {
                    AbstractC22676k.m65757q("adapter");
                    throw null;
                }
                boolean z13 = false;
                if (messageListItemAdapter.getIsThread() || !this.$listItem.isThread()) {
                    if (this.$listItem.isThread() && this.$listItem.getItems().size() > 1) {
                        MessageListItemAdapter messageListItemAdapter2 = this.this$0.adapter;
                        if (messageListItemAdapter2 == null) {
                            AbstractC22676k.m65757q("adapter");
                            throw null;
                        }
                        if (messageListItemAdapter2.getDisplayCount() <= 1) {
                            z4 = true;
                        }
                    }
                    z4 = false;
                } else {
                    z4 = true;
                }
                MessageListItemAdapter messageListItemAdapter3 = this.this$0.adapter;
                if (messageListItemAdapter3 == null) {
                    AbstractC22676k.m65757q("adapter");
                    throw null;
                }
                if (messageListItemAdapter3.getIsThread() && !this.$listItem.isThread()) {
                    z13 = true;
                }
                MessageListItemAdapter messageListItemAdapter4 = this.this$0.adapter;
                if (messageListItemAdapter4 == null) {
                    AbstractC22676k.m65757q("adapter");
                    throw null;
                }
                final boolean zIsEmpty = messageListItemAdapter4.getCurrentList().isEmpty();
                if (z4) {
                    C38170e c38170e = new C38170e(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(this.$listItem.getItems()), new C38136a(6)));
                    do {
                        if (!c38170e.hasNext()) {
                            next = null;
                            break;
                        }
                        next = c38170e.next();
                    } while (((MessageListItem.MessageItem) next).getMessage().getParentId() != null);
                    MessageListItem.MessageItem messageItem = (MessageListItem.MessageItem) next;
                    if (messageItem != null) {
                        this.this$0.enterThreadListener.onThreadEntered(messageItem.getMessage());
                    }
                }
                MessageListItemAdapter messageListItemAdapter5 = this.this$0.adapter;
                if (messageListItemAdapter5 == null) {
                    AbstractC22676k.m65757q("adapter");
                    throw null;
                }
                messageListItemAdapter5.setThread(this.$listItem.isThread());
                if (z4) {
                    MessageListViewStyle messageListViewStyle2 = this.this$0.messageListViewStyle;
                    if (messageListViewStyle2 != null) {
                        this.this$0.chatMessageStart(messageListViewStyle2.getThreadMessagesStart());
                    }
                } else if (z13 && (messageListViewStyle = this.this$0.messageListViewStyle) != null) {
                    this.this$0.chatMessageStart(messageListViewStyle.getMessagesStart());
                }
                C2345k logger = this.this$0.getLogger();
                List<MessageListItem> list = this.$filteredList;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[handleNewWrapper] isOldListEmpty: " + zIsEmpty + ", filteredList.size: " + list.size(), null);
                }
                MessageListView messageListView = this.this$0;
                MessageListItemAdapter messageListItemAdapter6 = messageListView.adapter;
                if (messageListItemAdapter6 == null) {
                    AbstractC22676k.m65757q("adapter");
                    throw null;
                }
                final List<MessageListItem> list2 = this.$filteredList;
                final MessageListView messageListView2 = this.this$0;
                final MessageListItemWrapper messageListItemWrapper = this.$listItem;
                messageListView.submitListOnAnimationsFinished(messageListItemAdapter6, list2, new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.feature.messages.list.b1
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        MessageListView.C197241.AnonymousClass1.invokeSuspend$lambda$4(messageListView2, z4, messageListItemWrapper, zIsEmpty, list2);
                        return C23454a0.f92919a;
                    }
                });
                return C23454a0.f92919a;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C197241(MessageListItemWrapper messageListItemWrapper, MessageListView messageListView, InterfaceC30057d<? super C197241> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$listItem = messageListItemWrapper;
            this.this$0 = messageListView;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C197241(this.$listItem, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C197241) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                List<MessageListItem> items = this.$listItem.getItems();
                MessageListItemPredicate messageListItemPredicate = this.this$0.messageListItemPredicate;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : items) {
                    if (messageListItemPredicate.predicate((MessageListItem) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                List<MessageListItem> listTransform = this.this$0.messageListItemTransformer.transform(arrayList);
                AbstractC3076z main = DispatcherProvider.INSTANCE.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$listItem, listTransform, null);
                this.L$0 = null;
                this.label = 1;
                if (AbstractC3006f0.m8705K(main, anonymousClass1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.MessageListView$setOnAddPollCommentClickListener$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C197251 implements OnAddPollCommentClickListener, InterfaceC22666f {
        final /* synthetic */ OnAddPollCommentClickListener $tmp0;

        public C197251(OnAddPollCommentClickListener onAddPollCommentClickListener) {
            this.$tmp0 = onAddPollCommentClickListener;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof OnAddPollCommentClickListener) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return new C22672i(2, 0, OnAddPollCommentClickListener.class, this.$tmp0, "onAddPollCommentClick", "onAddPollCommentClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAddPollCommentClickListener
        public final boolean onAddPollCommentClick(Message p13, Poll p14) {
            AbstractC22676k.m65750j(p13, "p0");
            AbstractC22676k.m65750j(p14, "p1");
            return this.$tmp0.onAddPollCommentClick(p13, p14);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.MessageListView$setOnSuggestPollOptionClickListener$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C197261 implements OnSuggestPollOptionClickListener, InterfaceC22666f {
        final /* synthetic */ OnSuggestPollOptionClickListener $tmp0;

        public C197261(OnSuggestPollOptionClickListener onSuggestPollOptionClickListener) {
            this.$tmp0 = onSuggestPollOptionClickListener;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof OnSuggestPollOptionClickListener) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return new C22672i(1, 0, OnSuggestPollOptionClickListener.class, this.$tmp0, "onSuggestPollOptionClick", "onSuggestPollOptionClick(Lio/getstream/chat/android/models/Poll;)Z");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnSuggestPollOptionClickListener
        public final boolean onSuggestPollOptionClick(Poll p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return this.$tmp0.onSuggestPollOptionClick(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.MessageListView$setOnViewPollCommentsClickListener$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C197271 implements OnViewPollCommentsClickListener, InterfaceC22666f {
        final /* synthetic */ OnViewPollCommentsClickListener $tmp0;

        public C197271(OnViewPollCommentsClickListener onViewPollCommentsClickListener) {
            this.$tmp0 = onViewPollCommentsClickListener;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof OnViewPollCommentsClickListener) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return new C22672i(2, 0, OnViewPollCommentsClickListener.class, this.$tmp0, "onViewPollCommentsClick", "onViewPollCommentsClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnViewPollCommentsClickListener
        public final boolean onViewPollCommentsClick(Message p13, Poll p14) {
            AbstractC22676k.m65750j(p13, "p0");
            AbstractC22676k.m65750j(p14, "p1");
            return this.$tmp0.onViewPollCommentsClick(p13, p14);
        }
    }

    static {
        C22686q c22686q = new C22686q(MessageListView.class, "_attachmentReplyOptionHandler", "get_attachmentReplyOptionHandler()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(MessageListView.class, "_attachmentShowInChatOptionClickHandler", "get_attachmentShowInChatOptionClickHandler()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentShowInChatOptionHandler;", 0, c22673i0), AbstractC11895b.m31990i(MessageListView.class, "_attachmentDownloadOptionHandler", "get_attachmentDownloadOptionHandler()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDownloadOptionHandler;", 0, c22673i0), AbstractC11895b.m31990i(MessageListView.class, "_attachmentDeleteOptionHandler", "get_attachmentDeleteOptionHandler()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;", 0, c22673i0)};
        Companion = new Companion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageListView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ C19863k0 m55328B0(InterfaceC4339a interfaceC4339a) {
        return (C19863k0) _attachmentDeleteOptionHandler_delegate$lambda$40(interfaceC4339a);
    }

    /* JADX INFO: renamed from: C */
    public static void m55329C(MessageListView messageListView, Message message) {
        messageListView.messageFlagHandler.onMessageFlag(message);
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m55330C0(Message message) {
        messageUserUnblockHandler$lambda$12(message);
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m55331D(Message message) {
        messageUnpinHandler$lambda$16(message);
        throw null;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C19829h m55333E(InterfaceC4339a interfaceC4339a) {
        return (C19829h) _attachmentDownloadOptionHandler_delegate$lambda$37(interfaceC4339a);
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ C27478h m55338G0(MessageListView messageListView, Attachment attachment) {
        return (C27478h) defaultAttachmentDownloadClickListener$lambda$65$lambda$64(messageListView, attachment);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m55342I0(AttachmentGalleryResultItem attachmentGalleryResultItem) {
        _attachmentShowInChatOptionClickHandler_delegate$lambda$32(attachmentGalleryResultItem);
        throw null;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m55350M0(AttachmentGalleryResultItem attachmentGalleryResultItem) {
        _attachmentReplyOptionHandler_delegate$lambda$29(attachmentGalleryResultItem);
        throw null;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m55357Q(Message message) {
        openThreadHandler$lambda$7(message);
        throw null;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m55360R0(Message message, String str) {
        messageReactionHandler$lambda$19(message, str);
        throw null;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m55361S(Message message) {
        messageUserBlockHandler$lambda$11(message);
        throw null;
    }

    /* JADX INFO: renamed from: U0 */
    public static void m55366U0(MessageListView messageListView, Message message) {
        messageListView.messageDeleteHandler.onMessageDelete(message);
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m55368V0(Message message, Map map) {
        customActionHandler$lambda$20(message, map);
        throw null;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m55373Y(Message message, String str) {
        messageReplyHandler$lambda$21(str, message);
        throw null;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m55375Z(Message message) {
        messageFlagHandler$lambda$10(message);
        throw null;
    }

    private static final void _attachmentDeleteOptionHandler_delegate$lambda$38(AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onAttachmentDeleteOptionClickHandler must be set");
    }

    private static final AttachmentGalleryActivity.AttachmentDeleteOptionHandler _attachmentDeleteOptionHandler_delegate$lambda$40(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new AttachmentGalleryActivity.AttachmentDeleteOptionHandler() { // from class: io.getstream.chat.android.ui.feature.messages.list.k0
            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentDeleteOptionHandler
            public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                MessageListView._attachmentDeleteOptionHandler_delegate$lambda$40$lambda$39(realListener, attachmentGalleryResultItem);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _attachmentDeleteOptionHandler_delegate$lambda$40$lambda$39(InterfaceC4339a interfaceC4339a, AttachmentGalleryResultItem attachmentData) {
        AbstractC22676k.m65750j(attachmentData, "attachmentData");
        ((AttachmentGalleryActivity.AttachmentDeleteOptionHandler) interfaceC4339a.invoke()).onClick(attachmentData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _attachmentDownloadOptionHandler_delegate$lambda$35(MessageListView messageListView, AttachmentGalleryResultItem attachmentData) {
        AbstractC22676k.m65750j(attachmentData, "attachmentData");
        messageListView.defaultAttachmentDownloadClickListener.onAttachmentDownloadClick(AttachmentGalleryResultItemKt.toAttachment(attachmentData));
    }

    private static final AttachmentGalleryActivity.AttachmentDownloadOptionHandler _attachmentDownloadOptionHandler_delegate$lambda$37(InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new C19829h(realListener, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _attachmentDownloadOptionHandler_delegate$lambda$37$lambda$36(InterfaceC4339a interfaceC4339a, AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
        ((AttachmentGalleryActivity.AttachmentDownloadOptionHandler) interfaceC4339a.invoke()).onClick(it);
    }

    private static final void _attachmentReplyOptionHandler_delegate$lambda$29(AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onAttachmentReplyOptionClickHandler must be set");
    }

    private static final AttachmentGalleryActivity.AttachmentReplyOptionHandler _attachmentReplyOptionHandler_delegate$lambda$31(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new AttachmentGalleryActivity.AttachmentReplyOptionHandler() { // from class: io.getstream.chat.android.ui.feature.messages.list.e
            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentReplyOptionHandler
            public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                MessageListView._attachmentReplyOptionHandler_delegate$lambda$31$lambda$30(realListener, attachmentGalleryResultItem);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _attachmentReplyOptionHandler_delegate$lambda$31$lambda$30(InterfaceC4339a interfaceC4339a, AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
        ((AttachmentGalleryActivity.AttachmentReplyOptionHandler) interfaceC4339a.invoke()).onClick(it);
    }

    private static final void _attachmentShowInChatOptionClickHandler_delegate$lambda$32(AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onAttachmentShowInChatOptionClickHandler must be set");
    }

    private static final AttachmentGalleryActivity.AttachmentShowInChatOptionHandler _attachmentShowInChatOptionClickHandler_delegate$lambda$34(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new AttachmentGalleryActivity.AttachmentShowInChatOptionHandler() { // from class: io.getstream.chat.android.ui.feature.messages.list.x0
            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentShowInChatOptionHandler
            public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                MessageListView.m55376x9e3ec404(realListener, attachmentGalleryResultItem);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _attachmentShowInChatOptionClickHandler_delegate$lambda$34$lambda$33 */
    public static final void m55376x9e3ec404(InterfaceC4339a interfaceC4339a, AttachmentGalleryResultItem it) {
        AbstractC22676k.m65750j(it, "it");
        ((AttachmentGalleryActivity.AttachmentShowInChatOptionHandler) interfaceC4339a.invoke()).onClick(it);
    }

    private static final void attachmentDownloadHandler$lambda$22(InterfaceC4339a it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onAttachmentDownloadHandler must be set");
    }

    private static final void bottomEndRegionReachedHandler$lambda$2(String str) {
        throw new IllegalStateException("bottomEndRegionReachedHandler must be set.");
    }

    private final void changeLayoutForMessageStart(MessagesStart messagesStart) {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        RecyclerView chatMessagesRV = streamUiMessageListViewBinding.chatMessagesRV;
        AbstractC22676k.m65749i(chatMessagesRV, "chatMessagesRV");
        AbstractC1740u1 layoutManager = chatMessagesRV.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[messagesStart.ordinal()];
        if (i13 == 1) {
            linearLayoutManager.setStackFromEnd(true);
            chatMessagesRV.setOverScrollMode(2);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            linearLayoutManager.setStackFromEnd(false);
            chatMessagesRV.setOverScrollMode(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void chatMessageStart(int messageStartValue) {
        changeLayoutForMessageStart(MessagesStart.INSTANCE.parseValue(messageStartValue));
    }

    private final void configureAttributes(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19469R.styleable.MessageListView, C19469R.attr.streamUiMessageListStyle, C19469R.style.StreamUi_MessageList);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        final int i13 = 0;
        final int i14 = 1;
        this.loadMoreListener = new EndlessMessageListScrollListener(typedArrayObtainStyledAttributes.getInteger(C19469R.styleable.MessageListView_streamUiLoadMoreThreshold, 10), new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.v0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MessageListView f74812x;

            {
                this.f74812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        MessageListView.m55397n(this.f74812x);
                        break;
                    default:
                        MessageListView.configureAttributes$lambda$109$lambda$107$lambda$106(this.f74812x);
                        break;
                }
                return C23454a0.f92919a;
            }
        }, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.v0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MessageListView f74812x;

            {
                this.f74812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        MessageListView.m55397n(this.f74812x);
                        break;
                    default:
                        MessageListView.configureAttributes$lambda$109$lambda$107$lambda$106(this.f74812x);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiMessageListViewBinding.scrollToBottomButton.setScrollButtonViewStyle(messageListViewStyleRequireStyle.getScrollButtonViewStyle());
        StreamUiMessageListViewBinding streamUiMessageListViewBinding2 = this.binding;
        if (streamUiMessageListViewBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = streamUiMessageListViewBinding2.scrollToBottomButton.getLayoutParams();
        C1141d c1141d = layoutParams instanceof C1141d ? (C1141d) layoutParams : null;
        if (c1141d != null) {
            ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin = messageListViewStyleRequireStyle.getScrollButtonBottomMargin();
            c1141d.setMarginEnd(messageListViewStyleRequireStyle.getScrollButtonEndMargin());
        }
        MessageListScrollHelper messageListScrollHelper = this.scrollHelper;
        if (messageListScrollHelper == null) {
            AbstractC22676k.m65757q("scrollHelper");
            throw null;
        }
        messageListScrollHelper.m55613xdcfee627(messageListViewStyleRequireStyle.getScrollButtonViewStyle().getScrollButtonEnabled());
        MessageListScrollHelper messageListScrollHelper2 = this.scrollHelper;
        if (messageListScrollHelper2 == null) {
            AbstractC22676k.m65757q("scrollHelper");
            throw null;
        }
        messageListScrollHelper2.m55612xfd98c951(messageListViewStyleRequireStyle.getScrollButtonBehaviour() == NewMessagesBehaviour.SCROLL_TO_BOTTOM);
        typedArrayObtainStyledAttributes.recycle();
        if (getBackground() == null) {
            setBackgroundColor(requireStyle().getBackgroundColor());
        }
    }

    private static final C23454a0 configureAttributes$lambda$109$lambda$107$lambda$104(MessageListView messageListView) {
        messageListView.endRegionReachedHandler.onEndRegionReached();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 configureAttributes$lambda$109$lambda$107$lambda$106(MessageListView messageListView) {
        Object next;
        MessageListItemAdapter messageListItemAdapter = messageListView.adapter;
        if (messageListItemAdapter == null) {
            AbstractC22676k.m65757q("adapter");
            throw null;
        }
        List<Object> currentList = messageListItemAdapter.getCurrentList();
        AbstractC22676k.m65749i(currentList, "getCurrentList(...)");
        C38170e c38170e = new C38170e(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(currentList), C19723x27b37ffa.INSTANCE));
        if (c38170e.hasNext()) {
            next = c38170e.next();
            while (c38170e.hasNext()) {
                next = c38170e.next();
            }
        } else {
            next = null;
        }
        MessageListItem.MessageItem messageItem = (MessageListItem.MessageItem) next;
        Message message = messageItem != null ? messageItem.getMessage() : null;
        C2345k logger = messageListView.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[loadMoreAtBottom] last.id: ", message != null ? message.getId() : null, ", last.text: ", message != null ? message.getText() : null), null);
        }
        messageListView.bottomEndRegionReachedHandler.onBottomEndRegionReached(message != null ? message.getId() : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmDeleteMessageHandler$lambda$25(MessageListView messageListView, Message message, InterfaceC4339a confirmCallback) {
        AbstractC22676k.m65750j(message, "<unused var>");
        AbstractC22676k.m65750j(confirmCallback, "confirmCallback");
        new AlertDialog.Builder(messageListView.getContext()).setTitle(C19469R.string.stream_ui_message_list_delete_confirmation_title).setMessage(C19469R.string.stream_ui_message_list_delete_confirmation_message).setPositiveButton(C19469R.string.stream_ui_message_list_delete_confirmation_positive_button, new DialogInterfaceOnClickListenerC19819c(confirmCallback, 1)).setNegativeButton(C19469R.string.stream_ui_message_list_delete_confirmation_negative_button, new DialogInterfaceOnClickListenerC19821d(1)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmDeleteMessageHandler$lambda$25$lambda$23(InterfaceC4339a interfaceC4339a, DialogInterface dialogInterface, int i13) {
        dialogInterface.dismiss();
        interfaceC4339a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmFlagMessageHandler$lambda$28(MessageListView messageListView, Message message, InterfaceC4339a confirmCallback) {
        AbstractC22676k.m65750j(message, "<unused var>");
        AbstractC22676k.m65750j(confirmCallback, "confirmCallback");
        new AlertDialog.Builder(messageListView.getContext()).setTitle(C19469R.string.stream_ui_message_list_flag_confirmation_title).setMessage(C19469R.string.stream_ui_message_list_flag_confirmation_message).setPositiveButton(C19469R.string.stream_ui_message_list_flag_confirmation_positive_button, new DialogInterfaceOnClickListenerC19819c(confirmCallback, 0)).setNegativeButton(C19469R.string.stream_ui_message_list_flag_confirmation_negative_button, new DialogInterfaceOnClickListenerC19821d(0)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmFlagMessageHandler$lambda$28$lambda$26(InterfaceC4339a interfaceC4339a, DialogInterface dialogInterface, int i13) {
        dialogInterface.dismiss();
        interfaceC4339a.invoke();
    }

    private static final void customActionHandler$lambda$20(Message message, Map map) {
        AbstractC22676k.m65750j(message, "<unused var>");
        AbstractC22676k.m65750j(map, "<unused var>");
        throw new IllegalStateException("onCustomActionHandler must be set.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104 A[LOOP:1: B:57:0x00fe->B:59:0x0104, LOOP_END] */
    public static final boolean defaultAttachmentClickListener$lambda$63(MessageListView messageListView, Message message, Attachment attachment) {
        ChatDestination attachmentDestination;
        ArrayList arrayList;
        Iterator it;
        Attachment attachment2;
        String assetUrl;
        String imageUrl;
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(attachment, "attachment");
        List<Attachment> attachments = message.getAttachments();
        if (!(attachments instanceof Collection) || !attachments.isEmpty()) {
            Iterator<T> it3 = attachments.iterator();
            while (it3.hasNext()) {
                if (((Attachment) it3.next()).getUploadState() != null) {
                    return false;
                }
            }
        }
        if (AttachmentUtilsKt.isGiphy(attachment)) {
            String thumbUrl = attachment.getThumbUrl();
            if (thumbUrl == null && (thumbUrl = attachment.getTitleLink()) == null) {
                thumbUrl = attachment.getOgUrl();
            }
            if (thumbUrl == null) {
                return true;
            }
            ChatNavigator navigator = ChatUI.getNavigator();
            Context context = messageListView.getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            navigator.navigate(new WebLinkDestination(context, thumbUrl));
            return true;
        }
        List<Attachment> attachments2 = message.getAttachments();
        if ((attachments2 instanceof Collection) && attachments2.isEmpty()) {
            List<Attachment> attachments3 = message.getAttachments();
            ArrayList arrayList2 = new ArrayList();
            while (r0.hasNext()) {
                attachment2 = (Attachment) obj;
                if (!AttachmentUtilsKt.isImage(attachment2)) {
                }
            }
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new AttachmentGalleryItem((Attachment) it.next(), message.getUser(), MessageKt.getCreatedAtOrThrow(message), message.getId(), message.getCid(), UserKt.isCurrentUser(message.getUser())));
            }
            messageListView.attachmentGalleryDestination.setData(arrayList, arrayList2.indexOf(attachment));
            attachmentDestination = messageListView.attachmentGalleryDestination;
        } else {
            for (Attachment attachment3 : attachments2) {
                if (!AttachmentUtilsKt.isImage(attachment3) && !AttachmentUtilsKt.isVideo(attachment3)) {
                    Context context2 = messageListView.getContext();
                    AbstractC22676k.m65749i(context2, "getContext(...)");
                    attachmentDestination = new AttachmentDestination(message, attachment, context2);
                }
            }
            List<Attachment> attachments4 = message.getAttachments();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : attachments4) {
                attachment2 = (Attachment) obj;
                if ((!AttachmentUtilsKt.isImage(attachment2) && (imageUrl = attachment2.getImageUrl()) != null && imageUrl.length() != 0) || (AttachmentUtilsKt.isVideo(attachment2) && (assetUrl = attachment2.getAssetUrl()) != null && assetUrl.length() != 0)) {
                    if (!AttachmentKt.hasLink(attachment2)) {
                        arrayList3.add(obj);
                    }
                }
            }
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(new AttachmentGalleryItem((Attachment) it.next(), message.getUser(), MessageKt.getCreatedAtOrThrow(message), message.getId(), message.getCid(), UserKt.isCurrentUser(message.getUser())));
            }
            messageListView.attachmentGalleryDestination.setData(arrayList, arrayList3.indexOf(attachment));
            attachmentDestination = messageListView.attachmentGalleryDestination;
        }
        ChatUI.getNavigator().navigate(attachmentDestination);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultAttachmentDownloadClickListener$lambda$65(MessageListView messageListView, Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        messageListView.attachmentDownloadHandler.onAttachmentDownload(new C17841d(18, messageListView, attachment));
        return true;
    }

    private static final InterfaceC27474d defaultAttachmentDownloadClickListener$lambda$65$lambda$64(MessageListView messageListView, Attachment attachment) {
        Toast.makeText(messageListView.getContext(), messageListView.getContext().getString(C19469R.string.stream_ui_message_list_download_started), 0).show();
        ChatClient chatClientInstance = ChatClient.INSTANCE.instance();
        Context context = messageListView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        return ChatClientExtensions.downloadAttachment(chatClientInstance, context, attachment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout.LayoutParams defaultChildLayoutParams_delegate$lambda$0() {
        return new FrameLayout.LayoutParams(-2, -2, 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultEnterThreadListener$lambda$75(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultGiphySendListener$lambda$73(MessageListView messageListView, GiphyAction action) {
        AbstractC22676k.m65750j(action, "action");
        messageListView.giphySendHandler.onSendGiphy(action);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultLinkClickListener$lambda$74(MessageListView messageListView, String url) {
        AbstractC22676k.m65750j(url, "url");
        ChatNavigator navigator = ChatUI.getNavigator();
        Context context = messageListView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        navigator.navigate(new WebLinkDestination(context, url));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultMentionClickListener$lambda$72(User it) {
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultMessageClickListener$lambda$44(MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        Message replyTo = message.getReplyTo();
        if (MessageUtils.belongsToThread(message)) {
            messageListView.openThreadHandler.onOpenThread(message);
            return true;
        }
        if ((replyTo != null ? replyTo.getId() : null) == null) {
            return false;
        }
        messageListView.replyMessageClickListener.onReplyClick(replyTo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    public static final boolean defaultMessageLongClickListener$lambda$46(MessageListView messageListView, Message message) {
        boolean z4;
        AbstractC22676k.m65750j(message, "message");
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(messageListView.getContext());
        if (fragmentManager != null) {
            User currentUser = ChatClient.INSTANCE.instance().getCurrentUser();
            if (!MessageUtils.isModerationError(message, currentUser != null ? currentUser.getId() : null)) {
                MessageListViewStyle messageListViewStyleRequireStyle = messageListView.requireStyle();
                boolean z13 = messageListViewStyleRequireStyle.getEditMessageEnabled() && !MessageKt.isGiphyNotEphemeral(message);
                if (messageListViewStyleRequireStyle.getThreadsEnabled()) {
                    Channel channel = messageListView.channel;
                    if (channel == null) {
                        AbstractC22676k.m65757q("channel");
                        throw null;
                    }
                    if (channel.getConfig().isThreadEnabled()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                MessageListViewStyle messageListViewStyleCopy = messageListViewStyleRequireStyle.copy(((-69633) & 1) != 0 ? messageListViewStyleRequireStyle.scrollButtonViewStyle : null, ((-69633) & 2) != 0 ? messageListViewStyleRequireStyle.scrollButtonBehaviour : null, ((-69633) & 4) != 0 ? messageListViewStyleRequireStyle.itemStyle : null, ((-69633) & 8) != 0 ? messageListViewStyleRequireStyle.giphyViewHolderStyle : null, ((-69633) & 16) != 0 ? messageListViewStyleRequireStyle.audioRecordPlayerViewStyle : null, ((-69633) & 32) != 0 ? messageListViewStyleRequireStyle.replyMessageStyle : null, ((-69633) & 64) != 0 ? messageListViewStyleRequireStyle.unreadLabelButtonStyle : null, ((-69633) & 128) != 0 ? messageListViewStyleRequireStyle.reactionsEnabled : false, ((-69633) & 256) != 0 ? messageListViewStyleRequireStyle.backgroundColor : 0, ((-69633) & 512) != 0 ? messageListViewStyleRequireStyle.replyIcon : 0, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.replyEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.threadReplyIcon : 0, ((-69633) & 4096) != 0 ? messageListViewStyleRequireStyle.threadsEnabled : z4, ((-69633) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.retryIcon : 0, ((-69633) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.copyIcon : 0, ((-69633) & 32768) != 0 ? messageListViewStyleRequireStyle.markAsUnreadIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.editMessageEnabled : z13, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.editIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.flagIcon : 0, ((-69633) & 524288) != 0 ? messageListViewStyleRequireStyle.flagEnabled : false, ((-69633) & 1048576) != 0 ? messageListViewStyleRequireStyle.pinIcon : 0, ((-69633) & 2097152) != 0 ? messageListViewStyleRequireStyle.unpinIcon : 0, ((-69633) & 4194304) != 0 ? messageListViewStyleRequireStyle.pinMessageEnabled : false, ((-69633) & 8388608) != 0 ? messageListViewStyleRequireStyle.deleteIcon : 0, ((-69633) & 16777216) != 0 ? messageListViewStyleRequireStyle.deleteMessageEnabled : false, ((-69633) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.blockUserIcon : 0, ((-69633) & 67108864) != 0 ? messageListViewStyleRequireStyle.unblockUserIcon : 0, ((-69633) & 134217728) != 0 ? messageListViewStyleRequireStyle.blockUserEnabled : false, ((-69633) & 268435456) != 0 ? messageListViewStyleRequireStyle.copyTextEnabled : false, ((-69633) & 536870912) != 0 ? messageListViewStyleRequireStyle.markAsUnreadEnabled : false, ((-69633) & 1073741824) != 0 ? messageListViewStyleRequireStyle.retryMessageEnabled : false, ((-69633) & Integer.MIN_VALUE) != 0 ? messageListViewStyleRequireStyle.deleteConfirmationEnabled : false, (Integer.MAX_VALUE & 1) != 0 ? messageListViewStyleRequireStyle.flagMessageConfirmationEnabled : false, (Integer.MAX_VALUE & 2) != 0 ? messageListViewStyleRequireStyle.messageOptionsText : null, (Integer.MAX_VALUE & 4) != 0 ? messageListViewStyleRequireStyle.warningMessageOptionsText : null, (Integer.MAX_VALUE & 8) != 0 ? messageListViewStyleRequireStyle.messageOptionsBackgroundColor : 0, (Integer.MAX_VALUE & 16) != 0 ? messageListViewStyleRequireStyle.userReactionsBackgroundColor : 0, (Integer.MAX_VALUE & 32) != 0 ? messageListViewStyleRequireStyle.userReactionsTitleText : null, (Integer.MAX_VALUE & 64) != 0 ? messageListViewStyleRequireStyle.optionsOverlayDimColor : 0, (Integer.MAX_VALUE & 128) != 0 ? messageListViewStyleRequireStyle.emptyViewTextStyle : null, (Integer.MAX_VALUE & 256) != 0 ? messageListViewStyleRequireStyle.loadingView : 0, (Integer.MAX_VALUE & 512) != 0 ? messageListViewStyleRequireStyle.messagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.threadMessagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.messageOptionsUserReactionAlignment : 0, (Integer.MAX_VALUE & 4096) != 0 ? messageListViewStyleRequireStyle.scrollButtonBottomMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.scrollButtonEndMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.disableScrollWhenShowingDialog : false, (Integer.MAX_VALUE & 32768) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginTop : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginBottom : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginStart : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginEnd : 0, (Integer.MAX_VALUE & 524288) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginTop : 0, (Integer.MAX_VALUE & 1048576) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginBottom : 0, (Integer.MAX_VALUE & 2097152) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginStart : 0, (Integer.MAX_VALUE & 4194304) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginEnd : 0, (Integer.MAX_VALUE & 8388608) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginTop : 0, (Integer.MAX_VALUE & 16777216) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginBottom : 0, (Integer.MAX_VALUE & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginStart : 0, (Integer.MAX_VALUE & 67108864) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginEnd : 0, (Integer.MAX_VALUE & 134217728) != 0 ? messageListViewStyleRequireStyle.showReactionsForUnsentMessages : false, (Integer.MAX_VALUE & 268435456) != 0 ? messageListViewStyleRequireStyle.readCountEnabled : false, (Integer.MAX_VALUE & 536870912) != 0 ? messageListViewStyleRequireStyle.swipeToReplyEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? messageListViewStyleRequireStyle.swipeToReplyIcon : 0);
                MessageOptionItemsFactory messageOptionItemsFactory = messageListView.messageOptionItemsFactory;
                if (messageOptionItemsFactory == null) {
                    AbstractC22676k.m65757q("messageOptionItemsFactory");
                    throw null;
                }
                User currentUser2 = ChatUI.getCurrentUserProvider().getCurrentUser();
                MessageListItemAdapter messageListItemAdapter = messageListView.adapter;
                if (messageListItemAdapter != null) {
                    showMessageOptionsDialog$default(messageListView, fragmentManager, message, messageOptionItemsFactory.createMessageOptionItems(message, currentUser2, messageListItemAdapter.getIsThread() || MessageUtils.isThreadReply(message), messageListView.ownCapabilities, messageListViewStyleCopy), null, null, 24, null);
                    return true;
                }
                AbstractC22676k.m65757q("adapter");
                throw null;
            }
            OnModeratedMessageLongClickListener onModeratedMessageLongClickListener = messageListView.moderatedMessageLongClickListener;
            if (onModeratedMessageLongClickListener != null) {
                onModeratedMessageLongClickListener.onModeratedMessageLongClick(message);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultMessageRetryListener$lambda$53(MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        messageListView.messageRetryHandler.onMessageRetry(message);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultOnAddPollCommentClickListener$lambda$86(MessageListView messageListView, Message message, Poll poll) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(messageListView.getContext());
        if (fragmentManager == null) {
            return false;
        }
        AddPollCommentDialogFragment.Companion.newInstance$default(AddPollCommentDialogFragment.INSTANCE, message.getId(), poll.getId(), null, 4, null).show(fragmentManager, AddPollCommentDialogFragment.TAG);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultOnPollCloseClickListener$lambda$80(Poll it) {
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultOnPollOptionClickListener$lambda$77(Message message, Poll poll, Option option) {
        AbstractC22676k.m65750j(message, "<unused var>");
        AbstractC22676k.m65750j(poll, "<unused var>");
        AbstractC22676k.m65750j(option, "<unused var>");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultOnShowAllPollOptionClickListener$lambda$79(MessageListView messageListView, Message message, Poll poll) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "<unused var>");
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(messageListView.getContext());
        if (fragmentManager == null) {
            return false;
        }
        AllPollOptionsDialogFragment.INSTANCE.newInstance(message).show(fragmentManager, AllPollOptionsDialogFragment.TAG);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultOnSuggestPollOptionClickListener$lambda$84(MessageListView messageListView, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(messageListView.getContext());
        if (fragmentManager == null) {
            return false;
        }
        SuggestPollOptionDialogFragment.INSTANCE.newInstance(poll.getId()).show(fragmentManager, SuggestPollOptionDialogFragment.TAG);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultOnViewPollCommentsClickListener$lambda$88(MessageListView messageListView, Message message, Poll poll) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "<unused var>");
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(messageListView.getContext());
        if (fragmentManager == null) {
            return false;
        }
        PollCommentsDialogFragment.INSTANCE.newInstance(message.getCid(), message.getId()).show(fragmentManager, PollCommentsDialogFragment.TAG);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultOnViewPollResultClickListener$lambda$82(MessageListView messageListView, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(messageListView.getContext());
        if (fragmentManager == null) {
            return false;
        }
        PollResultsDialogFragment.INSTANCE.newInstance(poll).show(fragmentManager, PollResultsDialogFragment.TAG);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultReactionViewClickListener$lambda$70(MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(messageListView.getContext());
        if (fragmentManager == null) {
            return false;
        }
        MessageOptionsDialogFragment.Companion companion = MessageOptionsDialogFragment.INSTANCE;
        Context context = messageListView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        MessageOptionsDialogFragment.OptionsDialogType optionsDialogType = MessageOptionsDialogFragment.OptionsDialogType.REACTION_OPTIONS;
        MessageListViewStyle messageListViewStyleRequireStyle = messageListView.requireStyle();
        MessageListItemViewHolderFactory messageListItemViewHolderFactory = messageListView.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        MessageBackgroundFactory messageBackgroundFactory = messageListView.messageBackgroundFactory;
        if (messageBackgroundFactory == null) {
            AbstractC22676k.m65757q("messageBackgroundFactory");
            throw null;
        }
        AttachmentFactoryManager attachmentFactoryManager = messageListView.attachmentFactoryManager;
        if (attachmentFactoryManager == null) {
            AbstractC22676k.m65757q("attachmentFactoryManager");
            throw null;
        }
        MessageOptionsDialogFragment messageOptionsDialogFragmentNewInstance = companion.newInstance(context, message, C25271y.f99162w, optionsDialogType, messageListViewStyleRequireStyle, messageBackgroundFactory, attachmentFactoryManager, messageListItemViewHolderFactory, messageListView.showAvatarPredicate);
        messageOptionsDialogFragmentNewInstance.setReactionClickListener(new C19860j(messageListView));
        messageOptionsDialogFragmentNewInstance.setUserReactionClickListener(new C19860j(messageListView));
        messageOptionsDialogFragmentNewInstance.show(fragmentManager, MessageOptionsDialogFragment.TAG);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: defaultReactionViewClickListener$lambda$70$lambda$69$lambda$68$lambda$66 */
    public static final void m55381x99b7758f(MessageListView messageListView, Message message, String reactionType) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        messageListView.messageReactionHandler.onMessageReaction(message, reactionType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: defaultReactionViewClickListener$lambda$70$lambda$69$lambda$68$lambda$67 */
    public static final void m55382x99b77590(MessageListView messageListView, Message message, User user, Reaction reaction) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(reaction, "reaction");
        messageListView.userReactionClickListener.onUserReactionClick(message, user, reaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultThreadClickListener$lambda$55(MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        boolean zBelongsToThread = MessageUtils.belongsToThread(message);
        if (zBelongsToThread) {
            messageListView.openThreadHandler.onOpenThread(message);
        }
        return zBelongsToThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultTranslatedLabelClickListener$lambda$56(MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        messageListView.toggleOriginalTextHandler.onToggleOriginalText(message);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultUserClickListener$lambda$71(User it) {
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean defaultUserReactionClickListener$lambda$76(Message message, User user, Reaction reaction) {
        AbstractC22676k.m65750j(message, "<unused var>");
        AbstractC22676k.m65750j(user, "<unused var>");
        AbstractC22676k.m65750j(reaction, "<unused var>");
        return false;
    }

    private static final void endRegionReachedHandler$lambda$1() {
        throw new IllegalStateException("endRegionReachedHandler must be set.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void errorEventHandler$lambda$41(MessageListView messageListView, MessageListController.ErrorEvent error) {
        int i13;
        AbstractC22676k.m65750j(error, "error");
        if (error instanceof MessageListController.ErrorEvent.MuteUserError) {
            i13 = C19469R.string.stream_ui_message_list_error_mute_user;
        } else if (error instanceof MessageListController.ErrorEvent.UnmuteUserError) {
            i13 = C19469R.string.stream_ui_message_list_error_unmute_user;
        } else if (error instanceof MessageListController.ErrorEvent.BlockUserError) {
            i13 = C19469R.string.stream_ui_message_list_error_block_user;
        } else if (error instanceof MessageListController.ErrorEvent.UnblockUserError) {
            i13 = C19469R.string.stream_ui_message_list_error_unblock_user;
        } else if (error instanceof MessageListController.ErrorEvent.FlagUserError) {
            i13 = C19469R.string.stream_ui_message_list_error_flag_user;
        } else if (error instanceof MessageListController.ErrorEvent.UnflagUserError) {
            i13 = C19469R.string.stream_ui_message_list_error_unflag_user;
        } else if (error instanceof MessageListController.ErrorEvent.FlagMessageError) {
            i13 = C19469R.string.stream_ui_message_list_error_flag_message;
        } else if (error instanceof MessageListController.ErrorEvent.PinMessageError) {
            i13 = C19469R.string.stream_ui_message_list_error_pin_message;
        } else if (error instanceof MessageListController.ErrorEvent.UnpinMessageError) {
            i13 = C19469R.string.stream_ui_message_list_error_unpin_message;
        } else if (error instanceof MessageListController.ErrorEvent.MarkUnreadError) {
            i13 = C19469R.string.stream_ui_message_list_error_mark_as_unread_message;
        } else if (error instanceof MessageListController.ErrorEvent.PollCreationError) {
            i13 = C19469R.string.stream_ui_message_list_error_create_poll;
        } else if ((error instanceof MessageListController.ErrorEvent.PollCastingVoteError) || (error instanceof MessageListController.ErrorEvent.PollRemovingVoteError)) {
            i13 = C19469R.string.stream_ui_message_list_error_cast_vote;
        } else {
            if (!(error instanceof MessageListController.ErrorEvent.PollClosingError)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = C19469R.string.stream_ui_message_list_error_close_poll;
        }
        ViewKt.showToast(messageListView, i13);
    }

    private final FrameLayout.LayoutParams getDefaultChildLayoutParams() {
        return (FrameLayout.LayoutParams) this.defaultChildLayoutParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLanguageDisplayName$lambda$58(MessageListView messageListView, String code) {
        AbstractC22676k.m65750j(code, "code");
        HashMap<String, String> map = messageListView.languageCache;
        String displayName = map.get(code);
        if (displayName == null) {
            displayName = new Locale(code).getDisplayName(Locale.getDefault());
            AbstractC22676k.m65749i(displayName, "getDisplayName(...)");
            map.put(code, displayName);
        }
        return displayName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final AttachmentGalleryActivity.AttachmentDeleteOptionHandler get_attachmentDeleteOptionHandler() {
        return (AttachmentGalleryActivity.AttachmentDeleteOptionHandler) this._attachmentDeleteOptionHandler.getValue(this, $$delegatedProperties[3]);
    }

    private final AttachmentGalleryActivity.AttachmentDownloadOptionHandler get_attachmentDownloadOptionHandler() {
        return (AttachmentGalleryActivity.AttachmentDownloadOptionHandler) this._attachmentDownloadOptionHandler.getValue(this, $$delegatedProperties[2]);
    }

    private final AttachmentGalleryActivity.AttachmentReplyOptionHandler get_attachmentReplyOptionHandler() {
        return (AttachmentGalleryActivity.AttachmentReplyOptionHandler) this._attachmentReplyOptionHandler.getValue(this, $$delegatedProperties[0]);
    }

    private final AttachmentGalleryActivity.AttachmentShowInChatOptionHandler get_attachmentShowInChatOptionClickHandler() {
        return (AttachmentGalleryActivity.AttachmentShowInChatOptionHandler) this._attachmentShowInChatOptionClickHandler.getValue(this, $$delegatedProperties[1]);
    }

    private static final void giphySendHandler$lambda$17(GiphyAction it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onSendGiphyHandler must be set.");
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ C19823e m55387h0(InterfaceC4339a interfaceC4339a) {
        return (C19823e) _attachmentReplyOptionHandler_delegate$lambda$31(interfaceC4339a);
    }

    private final void handleMessageAction(MessageAction messageAction) {
        final Message message = messageAction.getMessage();
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        if (messageAction instanceof Resend) {
            this.messageRetryHandler.onMessageRetry(message);
            return;
        }
        if (messageAction instanceof Reply) {
            this.messageReplyHandler.onMessageReply(message.getCid(), message);
            return;
        }
        if (messageAction instanceof ThreadReply) {
            this.threadStartHandler.onStartThread(message);
            return;
        }
        if (messageAction instanceof Copy) {
            String translatedText$default = MessageKt.getTranslatedText$default(message, null, 1, null);
            Context context = getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            ContextKt.copyToClipboard(context, translatedText$default);
            return;
        }
        if (messageAction instanceof Edit) {
            this.messageEditHandler.onMessageEdit(message);
            return;
        }
        if (messageAction instanceof Pin) {
            if (message.getPinned()) {
                this.messageUnpinHandler.onMessageUnpin(message);
                return;
            } else {
                this.messagePinHandler.onMessagePin(message);
                return;
            }
        }
        if (messageAction instanceof MarkAsUnread) {
            this.messageMarkAsUnreadHandler.onMessageMarkAsUnread(message);
            return;
        }
        if (messageAction instanceof Delete) {
            if (!messageListViewStyleRequireStyle.getDeleteConfirmationEnabled()) {
                this.messageDeleteHandler.onMessageDelete(message);
                return;
            } else {
                final int i13 = 0;
                this.confirmDeleteMessageHandler.onConfirmDeleteMessage(message, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.z0

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MessageListView f74820x;

                    {
                        this.f74820x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                MessageListView.m55366U0(this.f74820x, message);
                                break;
                            default:
                                MessageListView.m55329C(this.f74820x, message);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                });
                return;
            }
        }
        if (messageAction instanceof Flag) {
            if (!messageListViewStyleRequireStyle.getFlagMessageConfirmationEnabled()) {
                this.messageFlagHandler.onMessageFlag(message);
                return;
            } else {
                final int i14 = 1;
                this.confirmFlagMessageHandler.onConfirmFlagMessage(message, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.z0

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MessageListView f74820x;

                    {
                        this.f74820x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                MessageListView.m55366U0(this.f74820x, message);
                                break;
                            default:
                                MessageListView.m55329C(this.f74820x, message);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                });
                return;
            }
        }
        if (messageAction instanceof CustomAction) {
            this.customActionHandler.onCustomAction(message, ((CustomAction) messageAction).getExtraProperties());
            throw null;
        }
        if (messageAction instanceof React) {
            return;
        }
        if (messageAction instanceof BlockUser) {
            this.messageUserBlockHandler.onUserBlocked(message);
        } else if (messageAction instanceof UnblockUser) {
            this.messageUserUnblockHandler.onUserUnblocked(message);
        } else if (!(messageAction instanceof MuteUser) && !(messageAction instanceof UnmuteUser)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final C23454a0 handleMessageAction$lambda$146(MessageListView messageListView, Message message) {
        messageListView.messageDeleteHandler.onMessageDelete(message);
        return C23454a0.f92919a;
    }

    private static final C23454a0 handleMessageAction$lambda$147(MessageListView messageListView, Message message) {
        messageListView.messageFlagHandler.onMessageFlag(message);
        return C23454a0.f92919a;
    }

    private final void handleNewWrapper(MessageListItemWrapper listItem) {
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO()), null, null, new C197241(listItem, this, null), 3);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m55388i0(GiphyAction giphyAction) {
        giphySendHandler$lambda$17(giphyAction);
        throw null;
    }

    private final void init(AttributeSet attr) {
        UnreadLabelButtonStyle unreadLabelButtonStyle;
        this.binding = StreamUiMessageListViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        MessageListViewStyle.Companion companion = MessageListViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.messageListViewStyle = companion.invoke$stream_chat_android_ui_components_release(context, attr);
        initRecyclerView();
        MessageListViewStyle messageListViewStyle = this.messageListViewStyle;
        if (messageListViewStyle != null) {
            chatMessageStart(messageListViewStyle.getMessagesStart());
        }
        initScrollHelper();
        initSwipeToReply();
        initLoadingView();
        initEmptyStateView();
        MessageListViewStyle messageListViewStyle2 = this.messageListViewStyle;
        if (messageListViewStyle2 != null && (unreadLabelButtonStyle = messageListViewStyle2.getUnreadLabelButtonStyle()) != null) {
            initUnreadLabelButton(unreadLabelButtonStyle);
        }
        configureAttributes(attr);
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView defaultEmptyStateView = streamUiMessageListViewBinding.defaultEmptyStateView;
        AbstractC22676k.m65749i(defaultEmptyStateView, "defaultEmptyStateView");
        TextStyleKt.setTextStyle(defaultEmptyStateView, requireStyle().getEmptyViewTextStyle());
        setLayoutTransition(new LayoutTransition());
    }

    private final void initAdapter() {
        if (this.adapter != null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[initAdapter] rejected (already initialized)", null);
                return;
            }
            return;
        }
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        if (this.messageDateFormatter == null) {
            this.messageDateFormatter = ChatUI.getDateFormatter();
        }
        if (this.attachmentFactoryManager == null) {
            this.attachmentFactoryManager = ChatUI.getAttachmentFactoryManager();
        }
        if (this.messageListItemViewHolderFactory == null) {
            this.messageListItemViewHolderFactory = new MessageListItemViewHolderFactory();
        }
        if (this.messageBackgroundFactory == null) {
            this.messageBackgroundFactory = new MessageBackgroundFactoryImpl(messageListViewStyleRequireStyle.getItemStyle());
        }
        if (this.messageOptionItemsFactory == null) {
            MessageOptionItemsFactory.Companion companion = MessageOptionItemsFactory.INSTANCE;
            Context context = getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            this.messageOptionItemsFactory = companion.defaultFactory(context);
        }
        MessageListItemViewHolderFactory messageListItemViewHolderFactory = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        DecoratorProviderFactory decoratorProviderFactory = ChatUI.getDecoratorProviderFactory();
        Channel channel = this.channel;
        if (channel == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        DateFormatter dateFormatter = this.messageDateFormatter;
        if (dateFormatter == null) {
            AbstractC22676k.m65757q("messageDateFormatter");
            throw null;
        }
        ShowAvatarPredicate showAvatarPredicate = this.showAvatarPredicate;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        if (messageBackgroundFactory == null) {
            AbstractC22676k.m65757q("messageBackgroundFactory");
            throw null;
        }
        messageListItemViewHolderFactory.setDecoratorProvider$stream_chat_android_ui_components_release(decoratorProviderFactory.createDecoratorProvider(channel, dateFormatter, messageListViewStyleRequireStyle, showAvatarPredicate, messageBackgroundFactory, this.getLanguageDisplayName));
        MessageListItemViewHolderFactory messageListItemViewHolderFactory2 = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory2 == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        messageListItemViewHolderFactory2.setListeners$stream_chat_android_ui_components_release(this.listenerContainer);
        MessageListItemViewHolderFactory messageListItemViewHolderFactory3 = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory3 == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        AttachmentFactoryManager attachmentFactoryManager = this.attachmentFactoryManager;
        if (attachmentFactoryManager == null) {
            AbstractC22676k.m65757q("attachmentFactoryManager");
            throw null;
        }
        messageListItemViewHolderFactory3.m55427xe9ea4c35(attachmentFactoryManager);
        MessageListItemViewHolderFactory messageListItemViewHolderFactory4 = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory4 == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        messageListItemViewHolderFactory4.m55430x76a35cc8(messageListViewStyleRequireStyle.getItemStyle());
        MessageListItemViewHolderFactory messageListItemViewHolderFactory5 = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory5 == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        messageListItemViewHolderFactory5.m55429xf46d3450(messageListViewStyleRequireStyle.getGiphyViewHolderStyle());
        MessageListItemViewHolderFactory messageListItemViewHolderFactory6 = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory6 == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        messageListItemViewHolderFactory6.m55428xffb4c134(messageListViewStyleRequireStyle.getAudioRecordPlayerViewStyle());
        MessageListItemViewHolderFactory messageListItemViewHolderFactory7 = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory7 == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        messageListItemViewHolderFactory7.m55431x90bc9829(messageListViewStyleRequireStyle.getReplyMessageStyle());
        MessageListItemViewHolderFactory messageListItemViewHolderFactory8 = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory8 == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        MessageListItemAdapter messageListItemAdapter = new MessageListItemAdapter(messageListItemViewHolderFactory8);
        setMessageListItemAdapter(messageListItemAdapter);
        this.adapter = messageListItemAdapter;
    }

    private final void initEmptyStateView() {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView defaultEmptyStateView = streamUiMessageListViewBinding.defaultEmptyStateView;
        AbstractC22676k.m65749i(defaultEmptyStateView, "defaultEmptyStateView");
        this.emptyStateView = defaultEmptyStateView;
        StreamUiMessageListViewBinding streamUiMessageListViewBinding2 = this.binding;
        if (streamUiMessageListViewBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout emptyStateViewContainer = streamUiMessageListViewBinding2.emptyStateViewContainer;
        AbstractC22676k.m65749i(emptyStateViewContainer, "emptyStateViewContainer");
        this.emptyStateViewContainer = emptyStateViewContainer;
    }

    private final void initLoadingView() {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout loadingViewContainer = streamUiMessageListViewBinding.loadingViewContainer;
        AbstractC22676k.m65749i(loadingViewContainer, "loadingViewContainer");
        this.loadingViewContainer = loadingViewContainer;
        StreamUiMessageListViewBinding streamUiMessageListViewBinding2 = this.binding;
        if (streamUiMessageListViewBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        loadingViewContainer.removeView(streamUiMessageListViewBinding2.defaultLoadingView);
        MessageListViewStyle messageListViewStyle = this.messageListViewStyle;
        if (messageListViewStyle != null) {
            int loadingView = messageListViewStyle.getLoadingView();
            LayoutInflater streamThemeInflater = ViewGroupKt.getStreamThemeInflater(this);
            ViewGroup viewGroup = this.loadingViewContainer;
            if (viewGroup == null) {
                AbstractC22676k.m65757q("loadingViewContainer");
                throw null;
            }
            View viewInflate = streamThemeInflater.inflate(loadingView, viewGroup, false);
            AbstractC22676k.m65747g(viewInflate);
            viewInflate.setVisibility(0);
            ViewGroup viewGroup2 = this.loadingViewContainer;
            if (viewGroup2 == null) {
                AbstractC22676k.m65757q("loadingViewContainer");
                throw null;
            }
            viewGroup2.addView(viewInflate);
            this.loadingView = viewInflate;
        }
    }

    private final void initRecyclerView() {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        RecyclerView recyclerView = streamUiMessageListViewBinding.chatMessagesRV;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setHasFixedSize(false);
        recyclerView.setItemViewCacheSize(20);
    }

    private final void initScrollHelper() {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        RecyclerView chatMessagesRV = streamUiMessageListViewBinding.chatMessagesRV;
        AbstractC22676k.m65749i(chatMessagesRV, "chatMessagesRV");
        StreamUiMessageListViewBinding streamUiMessageListViewBinding2 = this.binding;
        if (streamUiMessageListViewBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ScrollButtonView scrollToBottomButton = streamUiMessageListViewBinding2.scrollToBottomButton;
        AbstractC22676k.m65749i(scrollToBottomButton, "scrollToBottomButton");
        MessageListViewStyle messageListViewStyle = this.messageListViewStyle;
        this.scrollHelper = new MessageListScrollHelper(chatMessagesRV, scrollToBottomButton, messageListViewStyle != null ? messageListViewStyle.getDisableScrollWhenShowingDialog() : true, new C19860j(this));
    }

    private final void initSwipeToReply() {
        Drawable drawable;
        MessageListViewStyle messageListViewStyle = this.messageListViewStyle;
        if (messageListViewStyle != null) {
            Integer numValueOf = Integer.valueOf(messageListViewStyle.getSwipeToReplyIcon());
            MessageListViewStyle messageListViewStyle2 = this.messageListViewStyle;
            if (messageListViewStyle2 != null && !messageListViewStyle2.getSwipeToReplyEnabled()) {
                numValueOf = null;
            }
            if (numValueOf == null || (drawable = getContext().getDrawable(numValueOf.intValue())) == null) {
                return;
            }
            SwipeReplyCallback swipeReplyCallback = new SwipeReplyCallback(drawable, new C19868n(this, 0));
            C1715o0 c1715o0 = new C1715o0(swipeReplyCallback);
            swipeReplyCallback.setOnReply(new C19223a(15, c1715o0, this));
            StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
            if (streamUiMessageListViewBinding != null) {
                c1715o0.m5283e(streamUiMessageListViewBinding.chatMessagesRV);
            } else {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 initSwipeToReply$lambda$103$lambda$102$lambda$101$lambda$100(C1715o0 c1715o0, MessageListView messageListView, Message it) {
        AbstractC22676k.m65750j(it, "it");
        c1715o0.m5283e(null);
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = messageListView.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c1715o0.m5283e(streamUiMessageListViewBinding.chatMessagesRV);
        messageListView.messageReplyHandler.onMessageReply(it.getCid(), it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initSwipeToReply$lambda$103$lambda$99(MessageListView messageListView, Message message) {
        if (message == null) {
            return false;
        }
        MessageListViewStyle messageListViewStyle = messageListView.messageListViewStyle;
        Boolean boolValueOf = messageListViewStyle != null ? Boolean.valueOf(MessageListViewExtensionsKt.canReplyToMessage(messageListViewStyle, message, messageListView.ownCapabilities)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final void initUnreadLabelButton(UnreadLabelButtonStyle unreadLabelButtonStyle) {
        if (!unreadLabelButtonStyle.getUnreadLabelButtonEnabled()) {
            StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
            if (streamUiMessageListViewBinding == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            MaterialButton unreadLabelButton = streamUiMessageListViewBinding.unreadLabelButton;
            AbstractC22676k.m65749i(unreadLabelButton, "unreadLabelButton");
            unreadLabelButton.setVisibility(8);
            return;
        }
        StreamUiMessageListViewBinding streamUiMessageListViewBinding2 = this.binding;
        if (streamUiMessageListViewBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        MaterialButton materialButton = streamUiMessageListViewBinding2.unreadLabelButton;
        this.unreadLabelButton = materialButton;
        if (materialButton != null) {
            TextStyleKt.setTextStyle(materialButton, unreadLabelButtonStyle.getUnreadLabelButtonTextStyle());
            materialButton.setBackgroundTintList(ColorStateList.valueOf(unreadLabelButtonStyle.getUnreadLabelButtonColor()));
            materialButton.setRippleColor(ColorStateList.valueOf(unreadLabelButtonStyle.getUnreadLabelButtonRippleColor()));
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m55393l(Message message) {
        messagePinHandler$lambda$14(message);
        throw null;
    }

    private static final void lastMessageReadHandler$lambda$3() {
        throw new IllegalStateException("lastMessageReadHandler must be set.");
    }

    /* JADX INFO: renamed from: m */
    public static void m55395m(MessageListView messageListView) {
        messageListView.lastMessageReadHandler.onLastMessageRead();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m55396m0(Message message) {
        messageDeleteHandler$lambda$5(message);
        throw null;
    }

    private static final void messageDeleteHandler$lambda$5(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onMessageDeleteHandler must be set.");
    }

    private static final void messageEditHandler$lambda$4(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onMessageEditHandler must be set.");
    }

    private static final void messageFlagHandler$lambda$10(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onMessageFlagHandler must be set.");
    }

    private static final List messageListItemTransformer$lambda$43(List it) {
        AbstractC22676k.m65750j(it, "it");
        return it;
    }

    private static final void messageMarkAsUnreadHandler$lambda$15(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onMessageMarkAsUnreadHandler must be set.");
    }

    private static final void messagePinHandler$lambda$14(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onMessagePinHandler must be set.");
    }

    private static final void messageReactionHandler$lambda$19(Message message, String str) {
        AbstractC22676k.m65750j(message, "<unused var>");
        AbstractC22676k.m65750j(str, "<unused var>");
        throw new IllegalStateException("onMessageReactionHandler must be set.");
    }

    private static final void messageReplyHandler$lambda$21(String str, Message message) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(message, "<unused var>");
        throw new IllegalStateException("onReplyMessageHandler must be set");
    }

    private static final void messageRetryHandler$lambda$18(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onMessageRetryHandler must be set.");
    }

    private static final void messageUnpinHandler$lambda$16(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onMessageUnpinHandler must be set.");
    }

    private static final void messageUserBlockHandler$lambda$11(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onMessageFlagHandler must be set.");
    }

    private static final void messageUserUnblockHandler$lambda$12(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onMessageFlagHandler must be set.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean moderatedMessageLongClickListener$lambda$52(MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        messageListView.showModeratedMessageDialog(message);
        return true;
    }

    private static final void moderatedMessageOptionHandler$lambda$42(Message message, ModeratedMessageOption moderatedMessageOption) {
        AbstractC22676k.m65750j(message, "<unused var>");
        AbstractC22676k.m65750j(moderatedMessageOption, "<unused var>");
        throw new IllegalStateException("onModeratedMessageOptionSelected must be set");
    }

    /* JADX INFO: renamed from: n */
    public static void m55397n(MessageListView messageListView) {
        messageListView.endRegionReachedHandler.onEndRegionReached();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m55398n0(Message message) {
        messageRetryHandler$lambda$18(message);
        throw null;
    }

    private static final void openThreadHandler$lambda$7(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onStartThreadHandler must be set.");
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m55401p(Message message) {
        threadStartHandler$lambda$6(message);
        throw null;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m55404q0() {
        lastMessageReadHandler$lambda$3();
        throw null;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m55406r0(InterfaceC4339a interfaceC4339a) {
        attachmentDownloadHandler$lambda$22(interfaceC4339a);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean replyMessageClickListener$lambda$9(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m55408s0(Message message, ModeratedMessageOption moderatedMessageOption) {
        moderatedMessageOptionHandler$lambda$42(message, moderatedMessageOption);
        throw null;
    }

    public static /* synthetic */ void setEmptyStateView$default(MessageListView messageListView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = messageListView.getDefaultChildLayoutParams();
        }
        messageListView.setEmptyStateView(view, layoutParams);
    }

    public static /* synthetic */ void setLoadingView$default(MessageListView messageListView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = messageListView.getDefaultChildLayoutParams();
        }
        messageListView.setLoadingView(view, layoutParams);
    }

    private final void setMessageListItemAdapter(MessageListItemAdapter adapter) {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        RecyclerView recyclerView = streamUiMessageListViewBinding.chatMessagesRV;
        EndlessMessageListScrollListener endlessMessageListScrollListener = this.loadMoreListener;
        if (endlessMessageListScrollListener == null) {
            AbstractC22676k.m65757q("loadMoreListener");
            throw null;
        }
        recyclerView.addOnScrollListener(endlessMessageListScrollListener);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.q0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
                MessageListView.setMessageListItemAdapter$lambda$112(this.f74795w, view, i13, i14, i15, i16, i17, i18, i19, i24);
            }
        });
        StreamUiMessageListViewBinding streamUiMessageListViewBinding2 = this.binding;
        if (streamUiMessageListViewBinding2 != null) {
            streamUiMessageListViewBinding2.chatMessagesRV.setAdapter(adapter);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMessageListItemAdapter$lambda$112(MessageListView messageListView, View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        if (i16 < i24) {
            messageListView.lockScrollUp = true;
            messageListView.postDelayed(new RunnableC19885t0(messageListView, 4), 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnAttachmentClickListener$lambda$136(OnAttachmentClickListener onAttachmentClickListener, MessageListView messageListView, Message message, Attachment attachment) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(attachment, "attachment");
        return onAttachmentClickListener.onAttachmentClick(message, attachment) || messageListView.defaultAttachmentClickListener.onAttachmentClick(message, attachment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnAttachmentDownloadClickListener$lambda$137(OnAttachmentDownloadClickListener onAttachmentDownloadClickListener, MessageListView messageListView, Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        return onAttachmentDownloadClickListener.onAttachmentDownloadClick(attachment) || messageListView.defaultAttachmentDownloadClickListener.onAttachmentDownloadClick(attachment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnEnterThreadListener$lambda$142(OnEnterThreadListener onEnterThreadListener, MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return onEnterThreadListener.onThreadEntered(message) || messageListView.defaultEnterThreadListener.onThreadEntered(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnLinkClickListener$lambda$141(OnLinkClickListener onLinkClickListener, MessageListView messageListView, String url) {
        AbstractC22676k.m65750j(url, "url");
        return onLinkClickListener.onLinkClick(url) || messageListView.defaultLinkClickListener.onLinkClick(url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnMentionClickListener$lambda$140(OnMentionClickListener onMentionClickListener, MessageListView messageListView, User user) {
        AbstractC22676k.m65750j(user, "user");
        return onMentionClickListener.onMentionClick(user) || messageListView.defaultMentionClickListener.onMentionClick(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnMessageClickListener$lambda$129(OnMessageClickListener onMessageClickListener, MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return onMessageClickListener.onMessageClick(message) || messageListView.defaultMessageClickListener.onMessageClick(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnMessageLongClickListener$lambda$133(OnMessageLongClickListener onMessageLongClickListener, MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return onMessageLongClickListener.onMessageLongClick(message) || messageListView.defaultMessageLongClickListener.onMessageLongClick(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnMessageRetryListener$lambda$134(OnMessageRetryListener onMessageRetryListener, MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return onMessageRetryListener.onRetryMessage(message) || messageListView.defaultMessageRetryListener.onRetryMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnPollCloseClickListener$lambda$131(OnPollCloseClickListener onPollCloseClickListener, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        return onPollCloseClickListener.onPollCloseClick(poll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnPollOptionClickListener$lambda$130(OnPollOptionClickListener onPollOptionClickListener, Message message, Poll poll, Option option) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(option, "option");
        return onPollOptionClickListener.onPollOptionClick(message, poll, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnReactionViewClickListener$lambda$138(OnReactionViewClickListener onReactionViewClickListener, MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return onReactionViewClickListener.onReactionViewClick(message) || messageListView.defaultReactionViewClickListener.onReactionViewClick(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnThreadClickListener$lambda$135(OnThreadClickListener onThreadClickListener, MessageListView messageListView, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return onThreadClickListener.onThreadClick(message) || messageListView.defaultThreadClickListener.onThreadClick(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnUserClickListener$lambda$139(OnUserClickListener onUserClickListener, MessageListView messageListView, User user) {
        AbstractC22676k.m65750j(user, "user");
        return onUserClickListener.onUserClick(user) || messageListView.defaultUserClickListener.onUserClick(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnViewPollResultClickListener$lambda$132(OnViewPollResultClickListener onViewPollResultClickListener, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        return onViewPollResultClickListener.onViewPollResultClick(poll);
    }

    private final void set_attachmentDeleteOptionHandler(AttachmentGalleryActivity.AttachmentDeleteOptionHandler attachmentDeleteOptionHandler) {
        this._attachmentDeleteOptionHandler.setValue(this, $$delegatedProperties[3], attachmentDeleteOptionHandler);
    }

    private final void set_attachmentDownloadOptionHandler(AttachmentGalleryActivity.AttachmentDownloadOptionHandler attachmentDownloadOptionHandler) {
        this._attachmentDownloadOptionHandler.setValue(this, $$delegatedProperties[2], attachmentDownloadOptionHandler);
    }

    private final void set_attachmentReplyOptionHandler(AttachmentGalleryActivity.AttachmentReplyOptionHandler attachmentReplyOptionHandler) {
        this._attachmentReplyOptionHandler.setValue(this, $$delegatedProperties[0], attachmentReplyOptionHandler);
    }

    private final void set_attachmentShowInChatOptionClickHandler(AttachmentGalleryActivity.AttachmentShowInChatOptionHandler attachmentShowInChatOptionHandler) {
        this._attachmentShowInChatOptionClickHandler.setValue(this, $$delegatedProperties[1], attachmentShowInChatOptionHandler);
    }

    public static /* synthetic */ void showMessageOptionsDialog$default(final MessageListView messageListView, AbstractC1329o1 abstractC1329o1, Message message, List list, InterfaceC4351m interfaceC4351m, Function1 function1, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            interfaceC4351m = new InterfaceC4351m() { // from class: io.getstream.chat.android.ui.feature.messages.list.l0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    MessageListView.showMessageOptionsDialog$lambda$47(this.f74775w, (Message) obj2, (String) obj3);
                    return C23454a0.f92919a;
                }
            };
        }
        InterfaceC4351m interfaceC4351m2 = interfaceC4351m;
        if ((i13 & 16) != 0) {
            function1 = new C19868n(messageListView, 2);
        }
        messageListView.showMessageOptionsDialog(abstractC1329o1, message, list, interfaceC4351m2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 showMessageOptionsDialog$lambda$47(MessageListView messageListView, Message message, String reactionType) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        messageListView.messageReactionHandler.onMessageReaction(message, reactionType);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 showMessageOptionsDialog$lambda$48(MessageListView messageListView, MessageAction messageAction) {
        AbstractC22676k.m65750j(messageAction, "messageAction");
        messageListView.handleMessageAction(messageAction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessageOptionsDialog$lambda$51$lambda$49(InterfaceC4351m interfaceC4351m, Message message, String reactionType) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        interfaceC4351m.invoke(message, reactionType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessageOptionsDialog$lambda$51$lambda$50(Function1 function1, MessageAction messageAction) {
        AbstractC22676k.m65750j(messageAction, "messageAction");
        function1.invoke(messageAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitListOnAnimationsFinished(MessageListItemAdapter messageListItemAdapter, List<? extends MessageListItem> list, InterfaceC4339a interfaceC4339a) {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        AbstractC1720p1 itemAnimator = streamUiMessageListViewBinding.chatMessagesRV.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.mo5300f()) {
            messageListItemAdapter.submitList(list, new RunnableC19885t0(interfaceC4339a, 0));
            return;
        }
        C19883s0 c19883s0 = new C19883s0(messageListItemAdapter, list, interfaceC4339a);
        if (itemAnimator.mo5300f()) {
            itemAnimator.f6803b.add(c19883s0);
        } else {
            submitListOnAnimationsFinished$lambda$125(messageListItemAdapter, list, interfaceC4339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitListOnAnimationsFinished$lambda$125(MessageListItemAdapter messageListItemAdapter, List list, InterfaceC4339a interfaceC4339a) {
        messageListItemAdapter.submitList(list, new RunnableC19885t0(interfaceC4339a, 1));
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C19893x0 m55409t(InterfaceC4339a interfaceC4339a) {
        return (C19893x0) _attachmentShowInChatOptionClickHandler_delegate$lambda$34(interfaceC4339a);
    }

    private static final void threadStartHandler$lambda$6(Message it) {
        AbstractC22676k.m65750j(it, "it");
        throw new IllegalStateException("onStartThreadHandler must be set.");
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m55411u(String str) {
        bottomEndRegionReachedHandler$lambda$2(str);
        throw null;
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m55412u0(AttachmentGalleryResultItem attachmentGalleryResultItem) {
        _attachmentDeleteOptionHandler_delegate$lambda$38(attachmentGalleryResultItem);
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m55415w(Message message) {
        messageMarkAsUnreadHandler$lambda$15(message);
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m55417x(Message message) {
        messageEditHandler$lambda$4(message);
        throw null;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m55422z0() {
        endRegionReachedHandler$lambda$1();
        throw null;
    }

    public final void displayNewMessages(MessageListItemWrapper messageListItemWrapper) {
        AbstractC22676k.m65750j(messageListItemWrapper, "messageListItemWrapper");
        handleNewWrapper(messageListItemWrapper);
    }

    public final RecyclerView getRecyclerView() {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        RecyclerView chatMessagesRV = streamUiMessageListViewBinding.chatMessagesRV;
        AbstractC22676k.m65749i(chatMessagesRV, "chatMessagesRV");
        return chatMessagesRV;
    }

    public final void handleFlagMessageResult(AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        this.flagMessageResultHandler.onHandleResult(result);
    }

    public final void hideEmptyStateView() {
        ViewGroup viewGroup = this.emptyStateViewContainer;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        } else {
            AbstractC22676k.m65757q("emptyStateViewContainer");
            throw null;
        }
    }

    public final void hideLoadingView() {
        ViewGroup viewGroup = this.loadingViewContainer;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        } else {
            AbstractC22676k.m65757q("loadingViewContainer");
            throw null;
        }
    }

    public final void hideUnreadLabelButton() {
        MaterialButton materialButton = this.unreadLabelButton;
        if (materialButton != null) {
            materialButton.setVisibility(8);
        }
    }

    public final boolean isAdapterInitialized() {
        return this.adapter != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC1638x lifecycle;
        AbstractC21071j activityResultRegistry;
        super.onAttachedToWindow();
        AbstractActivityC1340r0 activity = ViewKt.getActivity(this);
        if (activity != null && (activityResultRegistry = activity.getActivityResultRegistry()) != null) {
            this.attachmentGalleryDestination.register(activityResultRegistry);
        }
        InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(this);
        if (interfaceC1585g0M5017g == null || (lifecycle = interfaceC1585g0M5017g.getLifecycle()) == null) {
            return;
        }
        lifecycle.mo4986a(this.pauseAudioPlayerListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC1638x lifecycle;
        if (isAdapterInitialized()) {
            MessageListItemAdapter messageListItemAdapter = this.adapter;
            if (messageListItemAdapter == null) {
                AbstractC22676k.m65757q("adapter");
                throw null;
            }
            StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
            if (streamUiMessageListViewBinding == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            RecyclerView chatMessagesRV = streamUiMessageListViewBinding.chatMessagesRV;
            AbstractC22676k.m65749i(chatMessagesRV, "chatMessagesRV");
            messageListItemAdapter.onDetachedFromRecyclerView(chatMessagesRV);
        }
        InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(this);
        if (interfaceC1585g0M5017g != null && (lifecycle = interfaceC1585g0M5017g.getLifecycle()) != null) {
            lifecycle.mo4988d(this.pauseAudioPlayerListener);
        }
        this.attachmentGalleryDestination.unregister();
        super.onDetachedFromWindow();
    }

    public final MessageListViewStyle requireStyle() {
        MessageListViewStyle messageListViewStyle = this.messageListViewStyle;
        if (messageListViewStyle != null) {
            return messageListViewStyle;
        }
        throw new IllegalStateException("View must be initialized first to obtain style!");
    }

    public final void scrollToBottom() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[scrollToBottom] no args", null);
        }
        MessageListScrollHelper messageListScrollHelper = this.scrollHelper;
        if (messageListScrollHelper != null) {
            messageListScrollHelper.scrollToBottom$stream_chat_android_ui_components_release();
        } else {
            AbstractC22676k.m65757q("scrollHelper");
            throw null;
        }
    }

    public final void scrollToMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        MessageListScrollHelper messageListScrollHelper = this.scrollHelper;
        if (messageListScrollHelper != null) {
            messageListScrollHelper.scrollToMessage$stream_chat_android_ui_components_release(message);
        } else {
            AbstractC22676k.m65757q("scrollHelper");
            throw null;
        }
    }

    public final void setAttachmentDeleteOptionClickHandler(AttachmentGalleryActivity.AttachmentDeleteOptionHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        set_attachmentDeleteOptionHandler(handler);
    }

    public final void setAttachmentDownloadHandler(AttachmentDownloadHandler attachmentDownloadHandler) {
        AbstractC22676k.m65750j(attachmentDownloadHandler, "attachmentDownloadHandler");
        this.attachmentDownloadHandler = attachmentDownloadHandler;
    }

    public final void setAttachmentFactoryManager(AttachmentFactoryManager attachmentFactoryManager) {
        AbstractC22676k.m65750j(attachmentFactoryManager, "attachmentFactoryManager");
        if (isAdapterInitialized()) {
            throw new IllegalStateException("Adapter was already initialized, please set attachment factories first");
        }
        this.attachmentFactoryManager = attachmentFactoryManager;
    }

    public final void setAttachmentReplyOptionClickHandler(AttachmentGalleryActivity.AttachmentReplyOptionHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        set_attachmentReplyOptionHandler(handler);
    }

    public final void setAttachmentShowInChatOptionClickHandler(AttachmentGalleryActivity.AttachmentShowInChatOptionHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        set_attachmentShowInChatOptionClickHandler(handler);
    }

    public final void setBottomEndRegionReachedHandler(BottomEndRegionReachedHandler bottomEndRegionReachedHandler) {
        AbstractC22676k.m65750j(bottomEndRegionReachedHandler, "bottomEndRegionReachedHandler");
        this.bottomEndRegionReachedHandler = bottomEndRegionReachedHandler;
    }

    public final void setConfirmDeleteMessageHandler(ConfirmDeleteMessageHandler confirmDeleteMessageHandler) {
        AbstractC22676k.m65750j(confirmDeleteMessageHandler, "confirmDeleteMessageHandler");
        this.confirmDeleteMessageHandler = confirmDeleteMessageHandler;
    }

    public final void setConfirmFlagMessageHandler(ConfirmFlagMessageHandler confirmFlagMessageHandler) {
        AbstractC22676k.m65750j(confirmFlagMessageHandler, "confirmFlagMessageHandler");
        this.confirmFlagMessageHandler = confirmFlagMessageHandler;
    }

    public final void setCopyMessageEnabled(boolean enabled) {
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        this.messageListViewStyle = messageListViewStyleRequireStyle.copy(((-69633) & 1) != 0 ? messageListViewStyleRequireStyle.scrollButtonViewStyle : null, ((-69633) & 2) != 0 ? messageListViewStyleRequireStyle.scrollButtonBehaviour : null, ((-69633) & 4) != 0 ? messageListViewStyleRequireStyle.itemStyle : null, ((-69633) & 8) != 0 ? messageListViewStyleRequireStyle.giphyViewHolderStyle : null, ((-69633) & 16) != 0 ? messageListViewStyleRequireStyle.audioRecordPlayerViewStyle : null, ((-69633) & 32) != 0 ? messageListViewStyleRequireStyle.replyMessageStyle : null, ((-69633) & 64) != 0 ? messageListViewStyleRequireStyle.unreadLabelButtonStyle : null, ((-69633) & 128) != 0 ? messageListViewStyleRequireStyle.reactionsEnabled : false, ((-69633) & 256) != 0 ? messageListViewStyleRequireStyle.backgroundColor : 0, ((-69633) & 512) != 0 ? messageListViewStyleRequireStyle.replyIcon : 0, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.replyEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.threadReplyIcon : 0, ((-69633) & 4096) != 0 ? messageListViewStyleRequireStyle.threadsEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.retryIcon : 0, ((-69633) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.copyIcon : 0, ((-69633) & 32768) != 0 ? messageListViewStyleRequireStyle.markAsUnreadIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.editMessageEnabled : false, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.editIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.flagIcon : 0, ((-69633) & 524288) != 0 ? messageListViewStyleRequireStyle.flagEnabled : false, ((-69633) & 1048576) != 0 ? messageListViewStyleRequireStyle.pinIcon : 0, ((-69633) & 2097152) != 0 ? messageListViewStyleRequireStyle.unpinIcon : 0, ((-69633) & 4194304) != 0 ? messageListViewStyleRequireStyle.pinMessageEnabled : false, ((-69633) & 8388608) != 0 ? messageListViewStyleRequireStyle.deleteIcon : 0, ((-69633) & 16777216) != 0 ? messageListViewStyleRequireStyle.deleteMessageEnabled : false, ((-69633) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.blockUserIcon : 0, ((-69633) & 67108864) != 0 ? messageListViewStyleRequireStyle.unblockUserIcon : 0, ((-69633) & 134217728) != 0 ? messageListViewStyleRequireStyle.blockUserEnabled : false, ((-69633) & 268435456) != 0 ? messageListViewStyleRequireStyle.copyTextEnabled : enabled, ((-69633) & 536870912) != 0 ? messageListViewStyleRequireStyle.markAsUnreadEnabled : false, ((-69633) & 1073741824) != 0 ? messageListViewStyleRequireStyle.retryMessageEnabled : false, ((-69633) & Integer.MIN_VALUE) != 0 ? messageListViewStyleRequireStyle.deleteConfirmationEnabled : false, (Integer.MAX_VALUE & 1) != 0 ? messageListViewStyleRequireStyle.flagMessageConfirmationEnabled : false, (Integer.MAX_VALUE & 2) != 0 ? messageListViewStyleRequireStyle.messageOptionsText : null, (Integer.MAX_VALUE & 4) != 0 ? messageListViewStyleRequireStyle.warningMessageOptionsText : null, (Integer.MAX_VALUE & 8) != 0 ? messageListViewStyleRequireStyle.messageOptionsBackgroundColor : 0, (Integer.MAX_VALUE & 16) != 0 ? messageListViewStyleRequireStyle.userReactionsBackgroundColor : 0, (Integer.MAX_VALUE & 32) != 0 ? messageListViewStyleRequireStyle.userReactionsTitleText : null, (Integer.MAX_VALUE & 64) != 0 ? messageListViewStyleRequireStyle.optionsOverlayDimColor : 0, (Integer.MAX_VALUE & 128) != 0 ? messageListViewStyleRequireStyle.emptyViewTextStyle : null, (Integer.MAX_VALUE & 256) != 0 ? messageListViewStyleRequireStyle.loadingView : 0, (Integer.MAX_VALUE & 512) != 0 ? messageListViewStyleRequireStyle.messagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.threadMessagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.messageOptionsUserReactionAlignment : 0, (Integer.MAX_VALUE & 4096) != 0 ? messageListViewStyleRequireStyle.scrollButtonBottomMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.scrollButtonEndMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.disableScrollWhenShowingDialog : false, (Integer.MAX_VALUE & 32768) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginTop : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginBottom : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginStart : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginEnd : 0, (Integer.MAX_VALUE & 524288) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginTop : 0, (Integer.MAX_VALUE & 1048576) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginBottom : 0, (Integer.MAX_VALUE & 2097152) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginStart : 0, (Integer.MAX_VALUE & 4194304) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginEnd : 0, (Integer.MAX_VALUE & 8388608) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginTop : 0, (Integer.MAX_VALUE & 16777216) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginBottom : 0, (Integer.MAX_VALUE & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginStart : 0, (Integer.MAX_VALUE & 67108864) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginEnd : 0, (Integer.MAX_VALUE & 134217728) != 0 ? messageListViewStyleRequireStyle.showReactionsForUnsentMessages : false, (Integer.MAX_VALUE & 268435456) != 0 ? messageListViewStyleRequireStyle.readCountEnabled : false, (Integer.MAX_VALUE & 536870912) != 0 ? messageListViewStyleRequireStyle.swipeToReplyEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? messageListViewStyleRequireStyle.swipeToReplyIcon : 0);
    }

    public final void setCustomActionHandler(CustomActionHandler customActionHandler) {
        AbstractC22676k.m65750j(customActionHandler, "customActionHandler");
        this.customActionHandler = customActionHandler;
    }

    public final void setCustomItemAnimator(AbstractC1720p1 itemAnimator) {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding != null) {
            streamUiMessageListViewBinding.chatMessagesRV.setItemAnimator(itemAnimator);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setCustomLinearLayoutManager(LinearLayoutManager layoutManager) {
        AbstractC22676k.m65750j(layoutManager, "layoutManager");
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding != null) {
            streamUiMessageListViewBinding.chatMessagesRV.setLayoutManager(layoutManager);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setDeleteMessageConfirmationEnabled(boolean enabled) {
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        this.messageListViewStyle = messageListViewStyleRequireStyle.copy(((-69633) & 1) != 0 ? messageListViewStyleRequireStyle.scrollButtonViewStyle : null, ((-69633) & 2) != 0 ? messageListViewStyleRequireStyle.scrollButtonBehaviour : null, ((-69633) & 4) != 0 ? messageListViewStyleRequireStyle.itemStyle : null, ((-69633) & 8) != 0 ? messageListViewStyleRequireStyle.giphyViewHolderStyle : null, ((-69633) & 16) != 0 ? messageListViewStyleRequireStyle.audioRecordPlayerViewStyle : null, ((-69633) & 32) != 0 ? messageListViewStyleRequireStyle.replyMessageStyle : null, ((-69633) & 64) != 0 ? messageListViewStyleRequireStyle.unreadLabelButtonStyle : null, ((-69633) & 128) != 0 ? messageListViewStyleRequireStyle.reactionsEnabled : false, ((-69633) & 256) != 0 ? messageListViewStyleRequireStyle.backgroundColor : 0, ((-69633) & 512) != 0 ? messageListViewStyleRequireStyle.replyIcon : 0, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.replyEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.threadReplyIcon : 0, ((-69633) & 4096) != 0 ? messageListViewStyleRequireStyle.threadsEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.retryIcon : 0, ((-69633) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.copyIcon : 0, ((-69633) & 32768) != 0 ? messageListViewStyleRequireStyle.markAsUnreadIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.editMessageEnabled : false, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.editIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.flagIcon : 0, ((-69633) & 524288) != 0 ? messageListViewStyleRequireStyle.flagEnabled : false, ((-69633) & 1048576) != 0 ? messageListViewStyleRequireStyle.pinIcon : 0, ((-69633) & 2097152) != 0 ? messageListViewStyleRequireStyle.unpinIcon : 0, ((-69633) & 4194304) != 0 ? messageListViewStyleRequireStyle.pinMessageEnabled : false, ((-69633) & 8388608) != 0 ? messageListViewStyleRequireStyle.deleteIcon : 0, ((-69633) & 16777216) != 0 ? messageListViewStyleRequireStyle.deleteMessageEnabled : false, ((-69633) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.blockUserIcon : 0, ((-69633) & 67108864) != 0 ? messageListViewStyleRequireStyle.unblockUserIcon : 0, ((-69633) & 134217728) != 0 ? messageListViewStyleRequireStyle.blockUserEnabled : false, ((-69633) & 268435456) != 0 ? messageListViewStyleRequireStyle.copyTextEnabled : false, ((-69633) & 536870912) != 0 ? messageListViewStyleRequireStyle.markAsUnreadEnabled : false, ((-69633) & 1073741824) != 0 ? messageListViewStyleRequireStyle.retryMessageEnabled : false, ((-69633) & Integer.MIN_VALUE) != 0 ? messageListViewStyleRequireStyle.deleteConfirmationEnabled : enabled, (Integer.MAX_VALUE & 1) != 0 ? messageListViewStyleRequireStyle.flagMessageConfirmationEnabled : false, (Integer.MAX_VALUE & 2) != 0 ? messageListViewStyleRequireStyle.messageOptionsText : null, (Integer.MAX_VALUE & 4) != 0 ? messageListViewStyleRequireStyle.warningMessageOptionsText : null, (Integer.MAX_VALUE & 8) != 0 ? messageListViewStyleRequireStyle.messageOptionsBackgroundColor : 0, (Integer.MAX_VALUE & 16) != 0 ? messageListViewStyleRequireStyle.userReactionsBackgroundColor : 0, (Integer.MAX_VALUE & 32) != 0 ? messageListViewStyleRequireStyle.userReactionsTitleText : null, (Integer.MAX_VALUE & 64) != 0 ? messageListViewStyleRequireStyle.optionsOverlayDimColor : 0, (Integer.MAX_VALUE & 128) != 0 ? messageListViewStyleRequireStyle.emptyViewTextStyle : null, (Integer.MAX_VALUE & 256) != 0 ? messageListViewStyleRequireStyle.loadingView : 0, (Integer.MAX_VALUE & 512) != 0 ? messageListViewStyleRequireStyle.messagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.threadMessagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.messageOptionsUserReactionAlignment : 0, (Integer.MAX_VALUE & 4096) != 0 ? messageListViewStyleRequireStyle.scrollButtonBottomMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.scrollButtonEndMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.disableScrollWhenShowingDialog : false, (Integer.MAX_VALUE & 32768) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginTop : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginBottom : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginStart : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginEnd : 0, (Integer.MAX_VALUE & 524288) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginTop : 0, (Integer.MAX_VALUE & 1048576) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginBottom : 0, (Integer.MAX_VALUE & 2097152) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginStart : 0, (Integer.MAX_VALUE & 4194304) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginEnd : 0, (Integer.MAX_VALUE & 8388608) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginTop : 0, (Integer.MAX_VALUE & 16777216) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginBottom : 0, (Integer.MAX_VALUE & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginStart : 0, (Integer.MAX_VALUE & 67108864) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginEnd : 0, (Integer.MAX_VALUE & 134217728) != 0 ? messageListViewStyleRequireStyle.showReactionsForUnsentMessages : false, (Integer.MAX_VALUE & 268435456) != 0 ? messageListViewStyleRequireStyle.readCountEnabled : false, (Integer.MAX_VALUE & 536870912) != 0 ? messageListViewStyleRequireStyle.swipeToReplyEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? messageListViewStyleRequireStyle.swipeToReplyIcon : 0);
    }

    public final void setDeleteMessageEnabled(boolean enabled) {
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        this.messageListViewStyle = messageListViewStyleRequireStyle.copy(((-69633) & 1) != 0 ? messageListViewStyleRequireStyle.scrollButtonViewStyle : null, ((-69633) & 2) != 0 ? messageListViewStyleRequireStyle.scrollButtonBehaviour : null, ((-69633) & 4) != 0 ? messageListViewStyleRequireStyle.itemStyle : null, ((-69633) & 8) != 0 ? messageListViewStyleRequireStyle.giphyViewHolderStyle : null, ((-69633) & 16) != 0 ? messageListViewStyleRequireStyle.audioRecordPlayerViewStyle : null, ((-69633) & 32) != 0 ? messageListViewStyleRequireStyle.replyMessageStyle : null, ((-69633) & 64) != 0 ? messageListViewStyleRequireStyle.unreadLabelButtonStyle : null, ((-69633) & 128) != 0 ? messageListViewStyleRequireStyle.reactionsEnabled : false, ((-69633) & 256) != 0 ? messageListViewStyleRequireStyle.backgroundColor : 0, ((-69633) & 512) != 0 ? messageListViewStyleRequireStyle.replyIcon : 0, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.replyEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.threadReplyIcon : 0, ((-69633) & 4096) != 0 ? messageListViewStyleRequireStyle.threadsEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.retryIcon : 0, ((-69633) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.copyIcon : 0, ((-69633) & 32768) != 0 ? messageListViewStyleRequireStyle.markAsUnreadIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.editMessageEnabled : false, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.editIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.flagIcon : 0, ((-69633) & 524288) != 0 ? messageListViewStyleRequireStyle.flagEnabled : false, ((-69633) & 1048576) != 0 ? messageListViewStyleRequireStyle.pinIcon : 0, ((-69633) & 2097152) != 0 ? messageListViewStyleRequireStyle.unpinIcon : 0, ((-69633) & 4194304) != 0 ? messageListViewStyleRequireStyle.pinMessageEnabled : false, ((-69633) & 8388608) != 0 ? messageListViewStyleRequireStyle.deleteIcon : 0, ((-69633) & 16777216) != 0 ? messageListViewStyleRequireStyle.deleteMessageEnabled : enabled, ((-69633) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.blockUserIcon : 0, ((-69633) & 67108864) != 0 ? messageListViewStyleRequireStyle.unblockUserIcon : 0, ((-69633) & 134217728) != 0 ? messageListViewStyleRequireStyle.blockUserEnabled : false, ((-69633) & 268435456) != 0 ? messageListViewStyleRequireStyle.copyTextEnabled : false, ((-69633) & 536870912) != 0 ? messageListViewStyleRequireStyle.markAsUnreadEnabled : false, ((-69633) & 1073741824) != 0 ? messageListViewStyleRequireStyle.retryMessageEnabled : false, ((-69633) & Integer.MIN_VALUE) != 0 ? messageListViewStyleRequireStyle.deleteConfirmationEnabled : false, (Integer.MAX_VALUE & 1) != 0 ? messageListViewStyleRequireStyle.flagMessageConfirmationEnabled : false, (Integer.MAX_VALUE & 2) != 0 ? messageListViewStyleRequireStyle.messageOptionsText : null, (Integer.MAX_VALUE & 4) != 0 ? messageListViewStyleRequireStyle.warningMessageOptionsText : null, (Integer.MAX_VALUE & 8) != 0 ? messageListViewStyleRequireStyle.messageOptionsBackgroundColor : 0, (Integer.MAX_VALUE & 16) != 0 ? messageListViewStyleRequireStyle.userReactionsBackgroundColor : 0, (Integer.MAX_VALUE & 32) != 0 ? messageListViewStyleRequireStyle.userReactionsTitleText : null, (Integer.MAX_VALUE & 64) != 0 ? messageListViewStyleRequireStyle.optionsOverlayDimColor : 0, (Integer.MAX_VALUE & 128) != 0 ? messageListViewStyleRequireStyle.emptyViewTextStyle : null, (Integer.MAX_VALUE & 256) != 0 ? messageListViewStyleRequireStyle.loadingView : 0, (Integer.MAX_VALUE & 512) != 0 ? messageListViewStyleRequireStyle.messagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.threadMessagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.messageOptionsUserReactionAlignment : 0, (Integer.MAX_VALUE & 4096) != 0 ? messageListViewStyleRequireStyle.scrollButtonBottomMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.scrollButtonEndMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.disableScrollWhenShowingDialog : false, (Integer.MAX_VALUE & 32768) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginTop : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginBottom : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginStart : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginEnd : 0, (Integer.MAX_VALUE & 524288) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginTop : 0, (Integer.MAX_VALUE & 1048576) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginBottom : 0, (Integer.MAX_VALUE & 2097152) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginStart : 0, (Integer.MAX_VALUE & 4194304) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginEnd : 0, (Integer.MAX_VALUE & 8388608) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginTop : 0, (Integer.MAX_VALUE & 16777216) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginBottom : 0, (Integer.MAX_VALUE & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginStart : 0, (Integer.MAX_VALUE & 67108864) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginEnd : 0, (Integer.MAX_VALUE & 134217728) != 0 ? messageListViewStyleRequireStyle.showReactionsForUnsentMessages : false, (Integer.MAX_VALUE & 268435456) != 0 ? messageListViewStyleRequireStyle.readCountEnabled : false, (Integer.MAX_VALUE & 536870912) != 0 ? messageListViewStyleRequireStyle.swipeToReplyEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? messageListViewStyleRequireStyle.swipeToReplyIcon : 0);
    }

    public final void setDownloadOptionHandler(AttachmentGalleryActivity.AttachmentDownloadOptionHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        set_attachmentDownloadOptionHandler(handler);
    }

    public final void setEditMessageEnabled(boolean enabled) {
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        this.messageListViewStyle = messageListViewStyleRequireStyle.copy(((-69633) & 1) != 0 ? messageListViewStyleRequireStyle.scrollButtonViewStyle : null, ((-69633) & 2) != 0 ? messageListViewStyleRequireStyle.scrollButtonBehaviour : null, ((-69633) & 4) != 0 ? messageListViewStyleRequireStyle.itemStyle : null, ((-69633) & 8) != 0 ? messageListViewStyleRequireStyle.giphyViewHolderStyle : null, ((-69633) & 16) != 0 ? messageListViewStyleRequireStyle.audioRecordPlayerViewStyle : null, ((-69633) & 32) != 0 ? messageListViewStyleRequireStyle.replyMessageStyle : null, ((-69633) & 64) != 0 ? messageListViewStyleRequireStyle.unreadLabelButtonStyle : null, ((-69633) & 128) != 0 ? messageListViewStyleRequireStyle.reactionsEnabled : false, ((-69633) & 256) != 0 ? messageListViewStyleRequireStyle.backgroundColor : 0, ((-69633) & 512) != 0 ? messageListViewStyleRequireStyle.replyIcon : 0, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.replyEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.threadReplyIcon : 0, ((-69633) & 4096) != 0 ? messageListViewStyleRequireStyle.threadsEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.retryIcon : 0, ((-69633) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.copyIcon : 0, ((-69633) & 32768) != 0 ? messageListViewStyleRequireStyle.markAsUnreadIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.editMessageEnabled : enabled, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.editIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.flagIcon : 0, ((-69633) & 524288) != 0 ? messageListViewStyleRequireStyle.flagEnabled : false, ((-69633) & 1048576) != 0 ? messageListViewStyleRequireStyle.pinIcon : 0, ((-69633) & 2097152) != 0 ? messageListViewStyleRequireStyle.unpinIcon : 0, ((-69633) & 4194304) != 0 ? messageListViewStyleRequireStyle.pinMessageEnabled : false, ((-69633) & 8388608) != 0 ? messageListViewStyleRequireStyle.deleteIcon : 0, ((-69633) & 16777216) != 0 ? messageListViewStyleRequireStyle.deleteMessageEnabled : false, ((-69633) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.blockUserIcon : 0, ((-69633) & 67108864) != 0 ? messageListViewStyleRequireStyle.unblockUserIcon : 0, ((-69633) & 134217728) != 0 ? messageListViewStyleRequireStyle.blockUserEnabled : false, ((-69633) & 268435456) != 0 ? messageListViewStyleRequireStyle.copyTextEnabled : false, ((-69633) & 536870912) != 0 ? messageListViewStyleRequireStyle.markAsUnreadEnabled : false, ((-69633) & 1073741824) != 0 ? messageListViewStyleRequireStyle.retryMessageEnabled : false, ((-69633) & Integer.MIN_VALUE) != 0 ? messageListViewStyleRequireStyle.deleteConfirmationEnabled : false, (Integer.MAX_VALUE & 1) != 0 ? messageListViewStyleRequireStyle.flagMessageConfirmationEnabled : false, (Integer.MAX_VALUE & 2) != 0 ? messageListViewStyleRequireStyle.messageOptionsText : null, (Integer.MAX_VALUE & 4) != 0 ? messageListViewStyleRequireStyle.warningMessageOptionsText : null, (Integer.MAX_VALUE & 8) != 0 ? messageListViewStyleRequireStyle.messageOptionsBackgroundColor : 0, (Integer.MAX_VALUE & 16) != 0 ? messageListViewStyleRequireStyle.userReactionsBackgroundColor : 0, (Integer.MAX_VALUE & 32) != 0 ? messageListViewStyleRequireStyle.userReactionsTitleText : null, (Integer.MAX_VALUE & 64) != 0 ? messageListViewStyleRequireStyle.optionsOverlayDimColor : 0, (Integer.MAX_VALUE & 128) != 0 ? messageListViewStyleRequireStyle.emptyViewTextStyle : null, (Integer.MAX_VALUE & 256) != 0 ? messageListViewStyleRequireStyle.loadingView : 0, (Integer.MAX_VALUE & 512) != 0 ? messageListViewStyleRequireStyle.messagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.threadMessagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.messageOptionsUserReactionAlignment : 0, (Integer.MAX_VALUE & 4096) != 0 ? messageListViewStyleRequireStyle.scrollButtonBottomMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.scrollButtonEndMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.disableScrollWhenShowingDialog : false, (Integer.MAX_VALUE & 32768) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginTop : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginBottom : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginStart : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginEnd : 0, (Integer.MAX_VALUE & 524288) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginTop : 0, (Integer.MAX_VALUE & 1048576) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginBottom : 0, (Integer.MAX_VALUE & 2097152) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginStart : 0, (Integer.MAX_VALUE & 4194304) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginEnd : 0, (Integer.MAX_VALUE & 8388608) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginTop : 0, (Integer.MAX_VALUE & 16777216) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginBottom : 0, (Integer.MAX_VALUE & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginStart : 0, (Integer.MAX_VALUE & 67108864) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginEnd : 0, (Integer.MAX_VALUE & 134217728) != 0 ? messageListViewStyleRequireStyle.showReactionsForUnsentMessages : false, (Integer.MAX_VALUE & 268435456) != 0 ? messageListViewStyleRequireStyle.readCountEnabled : false, (Integer.MAX_VALUE & 536870912) != 0 ? messageListViewStyleRequireStyle.swipeToReplyEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? messageListViewStyleRequireStyle.swipeToReplyIcon : 0);
    }

    public final void setEmptyStateView(View view) {
        AbstractC22676k.m65750j(view, "view");
        setEmptyStateView$default(this, view, null, 2, null);
    }

    public final void setEndRegionReachedHandler(EndRegionReachedHandler endRegionReachedHandler) {
        AbstractC22676k.m65750j(endRegionReachedHandler, "endRegionReachedHandler");
        this.endRegionReachedHandler = endRegionReachedHandler;
    }

    public final void setErrorEventHandler(ErrorEventHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        this.errorEventHandler = handler;
    }

    public final void setFlagMessageResultHandler(FlagMessageResultHandler flagMessageResultHandler) {
        AbstractC22676k.m65750j(flagMessageResultHandler, "flagMessageResultHandler");
        this.flagMessageResultHandler = flagMessageResultHandler;
    }

    public final void setGiphySendHandler(GiphySendHandler giphySendHandler) {
        AbstractC22676k.m65750j(giphySendHandler, "giphySendHandler");
        this.giphySendHandler = giphySendHandler;
    }

    public final void setLastMessageReadHandler(LastMessageReadHandler lastMessageReadHandler) {
        AbstractC22676k.m65750j(lastMessageReadHandler, "lastMessageReadHandler");
        this.lastMessageReadHandler = lastMessageReadHandler;
    }

    public final void setLoadingMore(boolean loadingMore) {
        if (loadingMore) {
            EndlessMessageListScrollListener endlessMessageListScrollListener = this.loadMoreListener;
            if (endlessMessageListScrollListener != null) {
                endlessMessageListScrollListener.disablePagination();
                return;
            } else {
                AbstractC22676k.m65757q("loadMoreListener");
                throw null;
            }
        }
        EndlessMessageListScrollListener endlessMessageListScrollListener2 = this.loadMoreListener;
        if (endlessMessageListScrollListener2 != null) {
            endlessMessageListScrollListener2.enablePagination();
        } else {
            AbstractC22676k.m65757q("loadMoreListener");
            throw null;
        }
    }

    public final void setLoadingView(View view) {
        AbstractC22676k.m65750j(view, "view");
        setLoadingView$default(this, view, null, 2, null);
    }

    public final void setMessageBackgroundFactory(MessageBackgroundFactory messageBackgroundFactory) {
        AbstractC22676k.m65750j(messageBackgroundFactory, "messageBackgroundFactory");
        if (isAdapterInitialized()) {
            throw new IllegalStateException("Adapter was already initialized, please set MessageBackgroundFactory first");
        }
        this.messageBackgroundFactory = messageBackgroundFactory;
    }

    public final void setMessageDateFormatter(DateFormatter messageDateFormatter) {
        AbstractC22676k.m65750j(messageDateFormatter, "messageDateFormatter");
        if (isAdapterInitialized()) {
            throw new IllegalStateException("Adapter was already initialized; please set DateFormatter first");
        }
        this.messageDateFormatter = messageDateFormatter;
    }

    public final void setMessageDeleteHandler(MessageDeleteHandler messageDeleteHandler) {
        AbstractC22676k.m65750j(messageDeleteHandler, "messageDeleteHandler");
        this.messageDeleteHandler = messageDeleteHandler;
    }

    public final void setMessageEditHandler(MessageEditHandler messageEditHandler) {
        AbstractC22676k.m65750j(messageEditHandler, "messageEditHandler");
        this.messageEditHandler = messageEditHandler;
    }

    public final void setMessageFlagEnabled(boolean enabled) {
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        this.messageListViewStyle = messageListViewStyleRequireStyle.copy(((-69633) & 1) != 0 ? messageListViewStyleRequireStyle.scrollButtonViewStyle : null, ((-69633) & 2) != 0 ? messageListViewStyleRequireStyle.scrollButtonBehaviour : null, ((-69633) & 4) != 0 ? messageListViewStyleRequireStyle.itemStyle : null, ((-69633) & 8) != 0 ? messageListViewStyleRequireStyle.giphyViewHolderStyle : null, ((-69633) & 16) != 0 ? messageListViewStyleRequireStyle.audioRecordPlayerViewStyle : null, ((-69633) & 32) != 0 ? messageListViewStyleRequireStyle.replyMessageStyle : null, ((-69633) & 64) != 0 ? messageListViewStyleRequireStyle.unreadLabelButtonStyle : null, ((-69633) & 128) != 0 ? messageListViewStyleRequireStyle.reactionsEnabled : false, ((-69633) & 256) != 0 ? messageListViewStyleRequireStyle.backgroundColor : 0, ((-69633) & 512) != 0 ? messageListViewStyleRequireStyle.replyIcon : 0, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.replyEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.threadReplyIcon : 0, ((-69633) & 4096) != 0 ? messageListViewStyleRequireStyle.threadsEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.retryIcon : 0, ((-69633) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.copyIcon : 0, ((-69633) & 32768) != 0 ? messageListViewStyleRequireStyle.markAsUnreadIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.editMessageEnabled : false, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.editIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.flagIcon : 0, ((-69633) & 524288) != 0 ? messageListViewStyleRequireStyle.flagEnabled : enabled, ((-69633) & 1048576) != 0 ? messageListViewStyleRequireStyle.pinIcon : 0, ((-69633) & 2097152) != 0 ? messageListViewStyleRequireStyle.unpinIcon : 0, ((-69633) & 4194304) != 0 ? messageListViewStyleRequireStyle.pinMessageEnabled : false, ((-69633) & 8388608) != 0 ? messageListViewStyleRequireStyle.deleteIcon : 0, ((-69633) & 16777216) != 0 ? messageListViewStyleRequireStyle.deleteMessageEnabled : false, ((-69633) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.blockUserIcon : 0, ((-69633) & 67108864) != 0 ? messageListViewStyleRequireStyle.unblockUserIcon : 0, ((-69633) & 134217728) != 0 ? messageListViewStyleRequireStyle.blockUserEnabled : false, ((-69633) & 268435456) != 0 ? messageListViewStyleRequireStyle.copyTextEnabled : false, ((-69633) & 536870912) != 0 ? messageListViewStyleRequireStyle.markAsUnreadEnabled : false, ((-69633) & 1073741824) != 0 ? messageListViewStyleRequireStyle.retryMessageEnabled : false, ((-69633) & Integer.MIN_VALUE) != 0 ? messageListViewStyleRequireStyle.deleteConfirmationEnabled : false, (Integer.MAX_VALUE & 1) != 0 ? messageListViewStyleRequireStyle.flagMessageConfirmationEnabled : false, (Integer.MAX_VALUE & 2) != 0 ? messageListViewStyleRequireStyle.messageOptionsText : null, (Integer.MAX_VALUE & 4) != 0 ? messageListViewStyleRequireStyle.warningMessageOptionsText : null, (Integer.MAX_VALUE & 8) != 0 ? messageListViewStyleRequireStyle.messageOptionsBackgroundColor : 0, (Integer.MAX_VALUE & 16) != 0 ? messageListViewStyleRequireStyle.userReactionsBackgroundColor : 0, (Integer.MAX_VALUE & 32) != 0 ? messageListViewStyleRequireStyle.userReactionsTitleText : null, (Integer.MAX_VALUE & 64) != 0 ? messageListViewStyleRequireStyle.optionsOverlayDimColor : 0, (Integer.MAX_VALUE & 128) != 0 ? messageListViewStyleRequireStyle.emptyViewTextStyle : null, (Integer.MAX_VALUE & 256) != 0 ? messageListViewStyleRequireStyle.loadingView : 0, (Integer.MAX_VALUE & 512) != 0 ? messageListViewStyleRequireStyle.messagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.threadMessagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.messageOptionsUserReactionAlignment : 0, (Integer.MAX_VALUE & 4096) != 0 ? messageListViewStyleRequireStyle.scrollButtonBottomMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.scrollButtonEndMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.disableScrollWhenShowingDialog : false, (Integer.MAX_VALUE & 32768) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginTop : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginBottom : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginStart : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginEnd : 0, (Integer.MAX_VALUE & 524288) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginTop : 0, (Integer.MAX_VALUE & 1048576) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginBottom : 0, (Integer.MAX_VALUE & 2097152) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginStart : 0, (Integer.MAX_VALUE & 4194304) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginEnd : 0, (Integer.MAX_VALUE & 8388608) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginTop : 0, (Integer.MAX_VALUE & 16777216) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginBottom : 0, (Integer.MAX_VALUE & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginStart : 0, (Integer.MAX_VALUE & 67108864) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginEnd : 0, (Integer.MAX_VALUE & 134217728) != 0 ? messageListViewStyleRequireStyle.showReactionsForUnsentMessages : false, (Integer.MAX_VALUE & 268435456) != 0 ? messageListViewStyleRequireStyle.readCountEnabled : false, (Integer.MAX_VALUE & 536870912) != 0 ? messageListViewStyleRequireStyle.swipeToReplyEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? messageListViewStyleRequireStyle.swipeToReplyIcon : 0);
    }

    public final void setMessageFlagHandler(MessageFlagHandler messageFlagHandler) {
        AbstractC22676k.m65750j(messageFlagHandler, "messageFlagHandler");
        this.messageFlagHandler = messageFlagHandler;
    }

    public final void setMessageItemTransformer(MessageListItemTransformer messageListItemTransformer) {
        AbstractC22676k.m65750j(messageListItemTransformer, "messageListItemTransformer");
        this.messageListItemTransformer = messageListItemTransformer;
    }

    public final void setMessageListItemPredicate(MessageListItemPredicate messageListItemPredicate) {
        AbstractC22676k.m65750j(messageListItemPredicate, "messageListItemPredicate");
        if (isAdapterInitialized()) {
            throw new IllegalStateException("Adapter was already initialized, please set MessageListItemPredicate first");
        }
        this.messageListItemPredicate = messageListItemPredicate;
    }

    public final void setMessageMarkAsUnreadHandler(MessageMarkAsUnreadHandler messageMarkAsUnreadHandler) {
        AbstractC22676k.m65750j(messageMarkAsUnreadHandler, "messageMarkAsUnreadHandler");
        this.messageMarkAsUnreadHandler = messageMarkAsUnreadHandler;
    }

    public final void setMessageOptionItemsFactory(MessageOptionItemsFactory messageOptionItemsFactory) {
        AbstractC22676k.m65750j(messageOptionItemsFactory, "messageOptionItemsFactory");
        if (isAdapterInitialized()) {
            throw new IllegalStateException("Adapter was already initialized, please set MessageOptionItemsFactory first");
        }
        this.messageOptionItemsFactory = messageOptionItemsFactory;
    }

    public final void setMessagePinHandler(MessagePinHandler messagePinHandler) {
        AbstractC22676k.m65750j(messagePinHandler, "messagePinHandler");
        this.messagePinHandler = messagePinHandler;
    }

    public final void setMessageReactionHandler(MessageReactionHandler messageReactionHandler) {
        AbstractC22676k.m65750j(messageReactionHandler, "messageReactionHandler");
        this.messageReactionHandler = messageReactionHandler;
    }

    public final void setMessageReplyHandler(MessageReplyHandler messageReplyHandler) {
        AbstractC22676k.m65750j(messageReplyHandler, "messageReplyHandler");
        this.messageReplyHandler = messageReplyHandler;
    }

    public final void setMessageRetryHandler(MessageRetryHandler messageRetryHandler) {
        AbstractC22676k.m65750j(messageRetryHandler, "messageRetryHandler");
        this.messageRetryHandler = messageRetryHandler;
    }

    public final void setMessageUnpinHandler(MessageUnpinHandler messageUnpinHandler) {
        AbstractC22676k.m65750j(messageUnpinHandler, "messageUnpinHandler");
        this.messageUnpinHandler = messageUnpinHandler;
    }

    public final void setMessageUserBlockHandler(MessageUserBlockHandler messageUserBlockHandler) {
        AbstractC22676k.m65750j(messageUserBlockHandler, "messageUserBlockHandler");
        this.messageUserBlockHandler = messageUserBlockHandler;
    }

    public final void setMessageUserUnblockHandler(MessageUserUnblockHandler messageUserUnblockHandler) {
        AbstractC22676k.m65750j(messageUserUnblockHandler, "messageUserUnblockHandler");
        this.messageUserUnblockHandler = messageUserUnblockHandler;
    }

    public final void setMessageViewHolderFactory(MessageListItemViewHolderFactory messageListItemViewHolderFactory) {
        AbstractC22676k.m65750j(messageListItemViewHolderFactory, "messageListItemViewHolderFactory");
        if (isAdapterInitialized()) {
            throw new IllegalStateException("Adapter was already initialized, please set MessageViewHolderFactory first");
        }
        this.messageListItemViewHolderFactory = messageListItemViewHolderFactory;
    }

    public final void setModeratedMessageHandler(ModeratedMessageOptionHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        this.moderatedMessageOptionHandler = handler;
    }

    public final void setNewMessagesBehaviour(NewMessagesBehaviour newMessagesBehaviour) {
        AbstractC22676k.m65750j(newMessagesBehaviour, "newMessagesBehaviour");
        MessageListScrollHelper messageListScrollHelper = this.scrollHelper;
        if (messageListScrollHelper != null) {
            messageListScrollHelper.m55612xfd98c951(newMessagesBehaviour == NewMessagesBehaviour.SCROLL_TO_BOTTOM);
        } else {
            AbstractC22676k.m65757q("scrollHelper");
            throw null;
        }
    }

    public final void setOnAddPollCommentClickListener(OnAddPollCommentClickListener listener) {
        this.listenerContainer.setOnAddPollCommentClickListener(listener == null ? this.defaultOnAddPollCommentClickListener : new C197251(listener));
    }

    public final void setOnAttachmentClickListener(final OnAttachmentClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setAttachmentClickListener(this.defaultAttachmentClickListener);
        } else {
            this.listenerContainer.setAttachmentClickListener(new OnAttachmentClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.u0
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAttachmentClickListener
                public final boolean onAttachmentClick(Message message, Attachment attachment) {
                    return MessageListView.setOnAttachmentClickListener$lambda$136(listener, this, message, attachment);
                }
            });
        }
    }

    public final void setOnAttachmentDownloadClickListener(final OnAttachmentDownloadClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setAttachmentDownloadClickListener(this.defaultAttachmentDownloadClickListener);
        } else {
            this.listenerContainer.setAttachmentDownloadClickListener(new OnAttachmentDownloadClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.m0
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAttachmentDownloadClickListener
                public final boolean onAttachmentDownloadClick(Attachment attachment) {
                    return MessageListView.setOnAttachmentDownloadClickListener$lambda$137(listener, this, attachment);
                }
            });
        }
    }

    public final void setOnEnterThreadListener(OnEnterThreadListener listener) {
        if (listener == null) {
            this.enterThreadListener = this.defaultEnterThreadListener;
        } else {
            this.enterThreadListener = new C4312c(7, listener, this);
        }
    }

    public final void setOnLinkClickListener(final OnLinkClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setLinkClickListener(this.defaultLinkClickListener);
        } else {
            this.listenerContainer.setLinkClickListener(new OnLinkClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.n0
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnLinkClickListener
                public final boolean onLinkClick(String str) {
                    return MessageListView.setOnLinkClickListener$lambda$141(listener, this, str);
                }
            });
        }
    }

    public final void setOnMentionClickListener(final OnMentionClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setMentionClickListener(this.defaultMentionClickListener);
        } else {
            this.listenerContainer.setMentionClickListener(new OnMentionClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.f
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMentionClickListener
                public final boolean onMentionClick(User user) {
                    return MessageListView.setOnMentionClickListener$lambda$140(listener, this, user);
                }
            });
        }
    }

    public final void setOnMessageClickListener(final OnMessageClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setMessageClickListener(this.defaultMessageClickListener);
        } else {
            this.listenerContainer.setMessageClickListener(new OnMessageClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.b
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageClickListener
                public final boolean onMessageClick(Message message) {
                    return MessageListView.setOnMessageClickListener$lambda$129(listener, this, message);
                }
            });
        }
    }

    public final void setOnMessageLongClickListener(final OnMessageLongClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setMessageLongClickListener(this.defaultMessageLongClickListener);
        } else {
            this.listenerContainer.setMessageLongClickListener(new OnMessageLongClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.r0
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageLongClickListener
                public final boolean onMessageLongClick(Message message) {
                    return MessageListView.setOnMessageLongClickListener$lambda$133(listener, this, message);
                }
            });
        }
    }

    public final void setOnMessageRetryListener(final OnMessageRetryListener listener) {
        if (listener == null) {
            this.listenerContainer.setMessageRetryListener(this.defaultMessageRetryListener);
        } else {
            this.listenerContainer.setMessageRetryListener(new OnMessageRetryListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.y0
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageRetryListener
                public final boolean onRetryMessage(Message message) {
                    return MessageListView.setOnMessageRetryListener$lambda$134(listener, this, message);
                }
            });
        }
    }

    public final void setOnModeratedMessageLongClickListener(OnModeratedMessageLongClickListener listener) {
        this.moderatedMessageLongClickListener = listener;
    }

    public final void setOnPauseAudioRecordingAttachmentsHandler(OnPauseAudioRecordingAttachmentsHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        this.onPauseAudioRecordingAttachmentsHandler = handler;
    }

    public final void setOnPollCloseClickListener(final OnPollCloseClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setOnPollCloseClickListener(this.defaultOnPollCloseClickListener);
        } else {
            this.listenerContainer.setOnPollCloseClickListener(new OnPollCloseClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.g
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnPollCloseClickListener
                public final boolean onPollCloseClick(Poll poll) {
                    return MessageListView.setOnPollCloseClickListener$lambda$131(listener, poll);
                }
            });
        }
    }

    public final void setOnPollOptionClickListener(final OnPollOptionClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setOnPollOptionClickListener(this.defaultOnPollOptionClickListener);
        } else {
            this.listenerContainer.setOnPollOptionClickListener(new OnPollOptionClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.a1
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnPollOptionClickListener
                public final boolean onPollOptionClick(Message message, Poll poll, Option option) {
                    return MessageListView.setOnPollOptionClickListener$lambda$130(listener, message, poll, option);
                }
            });
        }
    }

    public final void setOnReactionViewClickListener(final OnReactionViewClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setReactionViewClickListener(this.defaultReactionViewClickListener);
        } else {
            this.listenerContainer.setReactionViewClickListener(new OnReactionViewClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.o0
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnReactionViewClickListener
                public final boolean onReactionViewClick(Message message) {
                    return MessageListView.setOnReactionViewClickListener$lambda$138(listener, this, message);
                }
            });
        }
    }

    public final void setOnReplyMessageClickListener(OnReplyMessageClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.replyMessageClickListener = listener;
    }

    public final void setOnScrollToBottomHandler(OnScrollToBottomHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        MessageListScrollHelper messageListScrollHelper = this.scrollHelper;
        if (messageListScrollHelper != null) {
            messageListScrollHelper.m55614x75f1e042(handler);
        } else {
            AbstractC22676k.m65757q("scrollHelper");
            throw null;
        }
    }

    public final void setOnSuggestPollOptionClickListener(OnSuggestPollOptionClickListener listener) {
        this.listenerContainer.setOnSuggestPollOptionClickListener(listener == null ? this.defaultOnSuggestPollOptionClickListener : new C197261(listener));
    }

    public final void setOnThreadClickListener(final OnThreadClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setThreadClickListener(this.defaultThreadClickListener);
        } else {
            this.listenerContainer.setThreadClickListener(new OnThreadClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.p0
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnThreadClickListener
                public final boolean onThreadClick(Message message) {
                    return MessageListView.setOnThreadClickListener$lambda$135(listener, this, message);
                }
            });
        }
    }

    public final void setOnUnreadLabelClickListener(final OnUnreadLabelClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        MaterialButton materialButton = this.unreadLabelButton;
        if (materialButton != null) {
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC21493z[] interfaceC21493zArr = MessageListView.$$delegatedProperties;
                    listener.onUnreadLabelClick();
                }
            });
        }
    }

    public final void setOnUnreadLabelReachedListener(OnUnreadLabelReachedListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.listenerContainer.setUnreadLabelReachedListener(listener);
    }

    public final void setOnUserClickListener(final OnUserClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setUserClickListener(this.defaultUserClickListener);
        } else {
            this.listenerContainer.setUserClickListener(new OnUserClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.c0
                @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnUserClickListener
                public final boolean onUserClick(User user) {
                    return MessageListView.setOnUserClickListener$lambda$139(listener, this, user);
                }
            });
        }
    }

    public final void setOnUserReactionClickListener(OnUserReactionClickListener listener) {
        if (listener == null) {
            listener = this.defaultUserReactionClickListener;
        }
        this.userReactionClickListener = listener;
    }

    public final void setOnViewPollCommentsClickListener(OnViewPollCommentsClickListener listener) {
        this.listenerContainer.setOnViewPollCommentsClickListener(listener == null ? this.defaultOnViewPollCommentsClickListener : new C197271(listener));
    }

    public final void setOnViewPollResultClickListener(OnViewPollResultClickListener listener) {
        if (listener == null) {
            this.listenerContainer.setOnViewPollResultClickListener(this.defaultOnViewPollResultClickListener);
        } else {
            this.listenerContainer.setOnViewPollResultClickListener(new C19828g0(listener, 1));
        }
    }

    public final void setOpenThreadHandler(OpenThreadHandler openThreadHandler) {
        AbstractC22676k.m65750j(openThreadHandler, "openThreadHandler");
        this.openThreadHandler = openThreadHandler;
    }

    public final void setOwnCapabilities(Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        this.ownCapabilities = ownCapabilities;
    }

    public final void setReactionsEnabled(boolean enabled) {
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        this.messageListViewStyle = messageListViewStyleRequireStyle.copy(((-69633) & 1) != 0 ? messageListViewStyleRequireStyle.scrollButtonViewStyle : null, ((-69633) & 2) != 0 ? messageListViewStyleRequireStyle.scrollButtonBehaviour : null, ((-69633) & 4) != 0 ? messageListViewStyleRequireStyle.itemStyle : null, ((-69633) & 8) != 0 ? messageListViewStyleRequireStyle.giphyViewHolderStyle : null, ((-69633) & 16) != 0 ? messageListViewStyleRequireStyle.audioRecordPlayerViewStyle : null, ((-69633) & 32) != 0 ? messageListViewStyleRequireStyle.replyMessageStyle : null, ((-69633) & 64) != 0 ? messageListViewStyleRequireStyle.unreadLabelButtonStyle : null, ((-69633) & 128) != 0 ? messageListViewStyleRequireStyle.reactionsEnabled : enabled, ((-69633) & 256) != 0 ? messageListViewStyleRequireStyle.backgroundColor : 0, ((-69633) & 512) != 0 ? messageListViewStyleRequireStyle.replyIcon : 0, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.replyEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.threadReplyIcon : 0, ((-69633) & 4096) != 0 ? messageListViewStyleRequireStyle.threadsEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.retryIcon : 0, ((-69633) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.copyIcon : 0, ((-69633) & 32768) != 0 ? messageListViewStyleRequireStyle.markAsUnreadIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.editMessageEnabled : false, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.editIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.flagIcon : 0, ((-69633) & 524288) != 0 ? messageListViewStyleRequireStyle.flagEnabled : false, ((-69633) & 1048576) != 0 ? messageListViewStyleRequireStyle.pinIcon : 0, ((-69633) & 2097152) != 0 ? messageListViewStyleRequireStyle.unpinIcon : 0, ((-69633) & 4194304) != 0 ? messageListViewStyleRequireStyle.pinMessageEnabled : false, ((-69633) & 8388608) != 0 ? messageListViewStyleRequireStyle.deleteIcon : 0, ((-69633) & 16777216) != 0 ? messageListViewStyleRequireStyle.deleteMessageEnabled : false, ((-69633) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.blockUserIcon : 0, ((-69633) & 67108864) != 0 ? messageListViewStyleRequireStyle.unblockUserIcon : 0, ((-69633) & 134217728) != 0 ? messageListViewStyleRequireStyle.blockUserEnabled : false, ((-69633) & 268435456) != 0 ? messageListViewStyleRequireStyle.copyTextEnabled : false, ((-69633) & 536870912) != 0 ? messageListViewStyleRequireStyle.markAsUnreadEnabled : false, ((-69633) & 1073741824) != 0 ? messageListViewStyleRequireStyle.retryMessageEnabled : false, ((-69633) & Integer.MIN_VALUE) != 0 ? messageListViewStyleRequireStyle.deleteConfirmationEnabled : false, (Integer.MAX_VALUE & 1) != 0 ? messageListViewStyleRequireStyle.flagMessageConfirmationEnabled : false, (Integer.MAX_VALUE & 2) != 0 ? messageListViewStyleRequireStyle.messageOptionsText : null, (Integer.MAX_VALUE & 4) != 0 ? messageListViewStyleRequireStyle.warningMessageOptionsText : null, (Integer.MAX_VALUE & 8) != 0 ? messageListViewStyleRequireStyle.messageOptionsBackgroundColor : 0, (Integer.MAX_VALUE & 16) != 0 ? messageListViewStyleRequireStyle.userReactionsBackgroundColor : 0, (Integer.MAX_VALUE & 32) != 0 ? messageListViewStyleRequireStyle.userReactionsTitleText : null, (Integer.MAX_VALUE & 64) != 0 ? messageListViewStyleRequireStyle.optionsOverlayDimColor : 0, (Integer.MAX_VALUE & 128) != 0 ? messageListViewStyleRequireStyle.emptyViewTextStyle : null, (Integer.MAX_VALUE & 256) != 0 ? messageListViewStyleRequireStyle.loadingView : 0, (Integer.MAX_VALUE & 512) != 0 ? messageListViewStyleRequireStyle.messagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.threadMessagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.messageOptionsUserReactionAlignment : 0, (Integer.MAX_VALUE & 4096) != 0 ? messageListViewStyleRequireStyle.scrollButtonBottomMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.scrollButtonEndMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.disableScrollWhenShowingDialog : false, (Integer.MAX_VALUE & 32768) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginTop : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginBottom : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginStart : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginEnd : 0, (Integer.MAX_VALUE & 524288) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginTop : 0, (Integer.MAX_VALUE & 1048576) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginBottom : 0, (Integer.MAX_VALUE & 2097152) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginStart : 0, (Integer.MAX_VALUE & 4194304) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginEnd : 0, (Integer.MAX_VALUE & 8388608) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginTop : 0, (Integer.MAX_VALUE & 16777216) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginBottom : 0, (Integer.MAX_VALUE & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginStart : 0, (Integer.MAX_VALUE & 67108864) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginEnd : 0, (Integer.MAX_VALUE & 134217728) != 0 ? messageListViewStyleRequireStyle.showReactionsForUnsentMessages : false, (Integer.MAX_VALUE & 268435456) != 0 ? messageListViewStyleRequireStyle.readCountEnabled : false, (Integer.MAX_VALUE & 536870912) != 0 ? messageListViewStyleRequireStyle.swipeToReplyEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? messageListViewStyleRequireStyle.swipeToReplyIcon : 0);
    }

    public final void setRepliesEnabled(boolean enabled) {
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        this.messageListViewStyle = messageListViewStyleRequireStyle.copy(((-69633) & 1) != 0 ? messageListViewStyleRequireStyle.scrollButtonViewStyle : null, ((-69633) & 2) != 0 ? messageListViewStyleRequireStyle.scrollButtonBehaviour : null, ((-69633) & 4) != 0 ? messageListViewStyleRequireStyle.itemStyle : null, ((-69633) & 8) != 0 ? messageListViewStyleRequireStyle.giphyViewHolderStyle : null, ((-69633) & 16) != 0 ? messageListViewStyleRequireStyle.audioRecordPlayerViewStyle : null, ((-69633) & 32) != 0 ? messageListViewStyleRequireStyle.replyMessageStyle : null, ((-69633) & 64) != 0 ? messageListViewStyleRequireStyle.unreadLabelButtonStyle : null, ((-69633) & 128) != 0 ? messageListViewStyleRequireStyle.reactionsEnabled : false, ((-69633) & 256) != 0 ? messageListViewStyleRequireStyle.backgroundColor : 0, ((-69633) & 512) != 0 ? messageListViewStyleRequireStyle.replyIcon : 0, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.replyEnabled : enabled, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.threadReplyIcon : 0, ((-69633) & 4096) != 0 ? messageListViewStyleRequireStyle.threadsEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.retryIcon : 0, ((-69633) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.copyIcon : 0, ((-69633) & 32768) != 0 ? messageListViewStyleRequireStyle.markAsUnreadIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.editMessageEnabled : false, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.editIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.flagIcon : 0, ((-69633) & 524288) != 0 ? messageListViewStyleRequireStyle.flagEnabled : false, ((-69633) & 1048576) != 0 ? messageListViewStyleRequireStyle.pinIcon : 0, ((-69633) & 2097152) != 0 ? messageListViewStyleRequireStyle.unpinIcon : 0, ((-69633) & 4194304) != 0 ? messageListViewStyleRequireStyle.pinMessageEnabled : false, ((-69633) & 8388608) != 0 ? messageListViewStyleRequireStyle.deleteIcon : 0, ((-69633) & 16777216) != 0 ? messageListViewStyleRequireStyle.deleteMessageEnabled : false, ((-69633) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.blockUserIcon : 0, ((-69633) & 67108864) != 0 ? messageListViewStyleRequireStyle.unblockUserIcon : 0, ((-69633) & 134217728) != 0 ? messageListViewStyleRequireStyle.blockUserEnabled : false, ((-69633) & 268435456) != 0 ? messageListViewStyleRequireStyle.copyTextEnabled : false, ((-69633) & 536870912) != 0 ? messageListViewStyleRequireStyle.markAsUnreadEnabled : false, ((-69633) & 1073741824) != 0 ? messageListViewStyleRequireStyle.retryMessageEnabled : false, ((-69633) & Integer.MIN_VALUE) != 0 ? messageListViewStyleRequireStyle.deleteConfirmationEnabled : false, (Integer.MAX_VALUE & 1) != 0 ? messageListViewStyleRequireStyle.flagMessageConfirmationEnabled : false, (Integer.MAX_VALUE & 2) != 0 ? messageListViewStyleRequireStyle.messageOptionsText : null, (Integer.MAX_VALUE & 4) != 0 ? messageListViewStyleRequireStyle.warningMessageOptionsText : null, (Integer.MAX_VALUE & 8) != 0 ? messageListViewStyleRequireStyle.messageOptionsBackgroundColor : 0, (Integer.MAX_VALUE & 16) != 0 ? messageListViewStyleRequireStyle.userReactionsBackgroundColor : 0, (Integer.MAX_VALUE & 32) != 0 ? messageListViewStyleRequireStyle.userReactionsTitleText : null, (Integer.MAX_VALUE & 64) != 0 ? messageListViewStyleRequireStyle.optionsOverlayDimColor : 0, (Integer.MAX_VALUE & 128) != 0 ? messageListViewStyleRequireStyle.emptyViewTextStyle : null, (Integer.MAX_VALUE & 256) != 0 ? messageListViewStyleRequireStyle.loadingView : 0, (Integer.MAX_VALUE & 512) != 0 ? messageListViewStyleRequireStyle.messagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.threadMessagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.messageOptionsUserReactionAlignment : 0, (Integer.MAX_VALUE & 4096) != 0 ? messageListViewStyleRequireStyle.scrollButtonBottomMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.scrollButtonEndMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.disableScrollWhenShowingDialog : false, (Integer.MAX_VALUE & 32768) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginTop : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginBottom : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginStart : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginEnd : 0, (Integer.MAX_VALUE & 524288) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginTop : 0, (Integer.MAX_VALUE & 1048576) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginBottom : 0, (Integer.MAX_VALUE & 2097152) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginStart : 0, (Integer.MAX_VALUE & 4194304) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginEnd : 0, (Integer.MAX_VALUE & 8388608) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginTop : 0, (Integer.MAX_VALUE & 16777216) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginBottom : 0, (Integer.MAX_VALUE & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginStart : 0, (Integer.MAX_VALUE & 67108864) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginEnd : 0, (Integer.MAX_VALUE & 134217728) != 0 ? messageListViewStyleRequireStyle.showReactionsForUnsentMessages : false, (Integer.MAX_VALUE & 268435456) != 0 ? messageListViewStyleRequireStyle.readCountEnabled : false, (Integer.MAX_VALUE & 536870912) != 0 ? messageListViewStyleRequireStyle.swipeToReplyEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? messageListViewStyleRequireStyle.swipeToReplyIcon : 0);
    }

    public final void setScrollToBottomButtonEnabled(boolean scrollToBottomButtonEnabled) {
        MessageListScrollHelper messageListScrollHelper = this.scrollHelper;
        if (messageListScrollHelper != null) {
            messageListScrollHelper.m55613xdcfee627(scrollToBottomButtonEnabled);
        } else {
            AbstractC22676k.m65757q("scrollHelper");
            throw null;
        }
    }

    public final void setShowAvatarPredicate(ShowAvatarPredicate showAvatarPredicate) {
        AbstractC22676k.m65750j(showAvatarPredicate, "showAvatarPredicate");
        if (isAdapterInitialized()) {
            throw new IllegalStateException("Adapter was already initialized; please set ShowAvatarPredicate first");
        }
        this.showAvatarPredicate = showAvatarPredicate;
    }

    public final void setThreadStartHandler(ThreadStartHandler threadStartHandler) {
        AbstractC22676k.m65750j(threadStartHandler, "threadStartHandler");
        this.threadStartHandler = threadStartHandler;
    }

    public final void setThreadsEnabled(boolean enabled) {
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        this.messageListViewStyle = messageListViewStyleRequireStyle.copy(((-69633) & 1) != 0 ? messageListViewStyleRequireStyle.scrollButtonViewStyle : null, ((-69633) & 2) != 0 ? messageListViewStyleRequireStyle.scrollButtonBehaviour : null, ((-69633) & 4) != 0 ? messageListViewStyleRequireStyle.itemStyle : null, ((-69633) & 8) != 0 ? messageListViewStyleRequireStyle.giphyViewHolderStyle : null, ((-69633) & 16) != 0 ? messageListViewStyleRequireStyle.audioRecordPlayerViewStyle : null, ((-69633) & 32) != 0 ? messageListViewStyleRequireStyle.replyMessageStyle : null, ((-69633) & 64) != 0 ? messageListViewStyleRequireStyle.unreadLabelButtonStyle : null, ((-69633) & 128) != 0 ? messageListViewStyleRequireStyle.reactionsEnabled : false, ((-69633) & 256) != 0 ? messageListViewStyleRequireStyle.backgroundColor : 0, ((-69633) & 512) != 0 ? messageListViewStyleRequireStyle.replyIcon : 0, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.replyEnabled : false, ((-69633) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.threadReplyIcon : 0, ((-69633) & 4096) != 0 ? messageListViewStyleRequireStyle.threadsEnabled : enabled, ((-69633) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.retryIcon : 0, ((-69633) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.copyIcon : 0, ((-69633) & 32768) != 0 ? messageListViewStyleRequireStyle.markAsUnreadIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.editMessageEnabled : false, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.editIcon : 0, ((-69633) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.flagIcon : 0, ((-69633) & 524288) != 0 ? messageListViewStyleRequireStyle.flagEnabled : false, ((-69633) & 1048576) != 0 ? messageListViewStyleRequireStyle.pinIcon : 0, ((-69633) & 2097152) != 0 ? messageListViewStyleRequireStyle.unpinIcon : 0, ((-69633) & 4194304) != 0 ? messageListViewStyleRequireStyle.pinMessageEnabled : false, ((-69633) & 8388608) != 0 ? messageListViewStyleRequireStyle.deleteIcon : 0, ((-69633) & 16777216) != 0 ? messageListViewStyleRequireStyle.deleteMessageEnabled : false, ((-69633) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.blockUserIcon : 0, ((-69633) & 67108864) != 0 ? messageListViewStyleRequireStyle.unblockUserIcon : 0, ((-69633) & 134217728) != 0 ? messageListViewStyleRequireStyle.blockUserEnabled : false, ((-69633) & 268435456) != 0 ? messageListViewStyleRequireStyle.copyTextEnabled : false, ((-69633) & 536870912) != 0 ? messageListViewStyleRequireStyle.markAsUnreadEnabled : false, ((-69633) & 1073741824) != 0 ? messageListViewStyleRequireStyle.retryMessageEnabled : false, ((-69633) & Integer.MIN_VALUE) != 0 ? messageListViewStyleRequireStyle.deleteConfirmationEnabled : false, (Integer.MAX_VALUE & 1) != 0 ? messageListViewStyleRequireStyle.flagMessageConfirmationEnabled : false, (Integer.MAX_VALUE & 2) != 0 ? messageListViewStyleRequireStyle.messageOptionsText : null, (Integer.MAX_VALUE & 4) != 0 ? messageListViewStyleRequireStyle.warningMessageOptionsText : null, (Integer.MAX_VALUE & 8) != 0 ? messageListViewStyleRequireStyle.messageOptionsBackgroundColor : 0, (Integer.MAX_VALUE & 16) != 0 ? messageListViewStyleRequireStyle.userReactionsBackgroundColor : 0, (Integer.MAX_VALUE & 32) != 0 ? messageListViewStyleRequireStyle.userReactionsTitleText : null, (Integer.MAX_VALUE & 64) != 0 ? messageListViewStyleRequireStyle.optionsOverlayDimColor : 0, (Integer.MAX_VALUE & 128) != 0 ? messageListViewStyleRequireStyle.emptyViewTextStyle : null, (Integer.MAX_VALUE & 256) != 0 ? messageListViewStyleRequireStyle.loadingView : 0, (Integer.MAX_VALUE & 512) != 0 ? messageListViewStyleRequireStyle.messagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListViewStyleRequireStyle.threadMessagesStart : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListViewStyleRequireStyle.messageOptionsUserReactionAlignment : 0, (Integer.MAX_VALUE & 4096) != 0 ? messageListViewStyleRequireStyle.scrollButtonBottomMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListViewStyleRequireStyle.scrollButtonEndMargin : 0, (Integer.MAX_VALUE & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListViewStyleRequireStyle.disableScrollWhenShowingDialog : false, (Integer.MAX_VALUE & 32768) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginTop : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginBottom : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginStart : 0, (Integer.MAX_VALUE & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageListViewStyleRequireStyle.optionsOverlayEditReactionsMarginEnd : 0, (Integer.MAX_VALUE & 524288) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginTop : 0, (Integer.MAX_VALUE & 1048576) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginBottom : 0, (Integer.MAX_VALUE & 2097152) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginStart : 0, (Integer.MAX_VALUE & 4194304) != 0 ? messageListViewStyleRequireStyle.optionsOverlayUserReactionsMarginEnd : 0, (Integer.MAX_VALUE & 8388608) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginTop : 0, (Integer.MAX_VALUE & 16777216) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginBottom : 0, (Integer.MAX_VALUE & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginStart : 0, (Integer.MAX_VALUE & 67108864) != 0 ? messageListViewStyleRequireStyle.optionsOverlayMessageOptionsMarginEnd : 0, (Integer.MAX_VALUE & 134217728) != 0 ? messageListViewStyleRequireStyle.showReactionsForUnsentMessages : false, (Integer.MAX_VALUE & 268435456) != 0 ? messageListViewStyleRequireStyle.readCountEnabled : false, (Integer.MAX_VALUE & 536870912) != 0 ? messageListViewStyleRequireStyle.swipeToReplyEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? messageListViewStyleRequireStyle.swipeToReplyIcon : 0);
    }

    public final void setToggleOriginalTextHandler(ToggleOriginalTextHandler toggleOriginalTextHandler) {
        AbstractC22676k.m65750j(toggleOriginalTextHandler, "toggleOriginalTextHandler");
        this.toggleOriginalTextHandler = toggleOriginalTextHandler;
    }

    public final void setUnreadCount$stream_chat_android_ui_components_release(int unreadCount) {
        StreamUiMessageListViewBinding streamUiMessageListViewBinding = this.binding;
        if (streamUiMessageListViewBinding != null) {
            streamUiMessageListViewBinding.scrollToBottomButton.setUnreadCount(unreadCount);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void shouldRequestMessagesAtBottom(boolean shouldRequest) {
        EndlessMessageListScrollListener endlessMessageListScrollListener = this.loadMoreListener;
        if (endlessMessageListScrollListener == null) {
            AbstractC22676k.m65757q("loadMoreListener");
            throw null;
        }
        endlessMessageListScrollListener.fetchAtBottom(shouldRequest);
        MessageListScrollHelper messageListScrollHelper = this.scrollHelper;
        if (messageListScrollHelper != null) {
            messageListScrollHelper.setUnreadCountEnabled$stream_chat_android_ui_components_release(!shouldRequest);
        } else {
            AbstractC22676k.m65757q("scrollHelper");
            throw null;
        }
    }

    public final void showEmptyStateView() {
        ViewGroup viewGroup = this.emptyStateViewContainer;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        } else {
            AbstractC22676k.m65757q("emptyStateViewContainer");
            throw null;
        }
    }

    public final void showError(MessageListController.ErrorEvent errorEvent) {
        AbstractC22676k.m65750j(errorEvent, "errorEvent");
        this.errorEventHandler.onErrorEvent(errorEvent);
    }

    public final void showLoadingView() {
        ViewGroup viewGroup = this.loadingViewContainer;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        } else {
            AbstractC22676k.m65757q("loadingViewContainer");
            throw null;
        }
    }

    public final void showMessageOptionsDialog(AbstractC1329o1 fragmentManager, Message message, List<MessageOptionItem> messageOptionItems, InterfaceC4351m reactionClickListener, Function1 optionClickListener) {
        AbstractC22676k.m65750j(fragmentManager, "fragmentManager");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(messageOptionItems, "messageOptionItems");
        AbstractC22676k.m65750j(reactionClickListener, "reactionClickListener");
        AbstractC22676k.m65750j(optionClickListener, "optionClickListener");
        MessageOptionsDialogFragment.Companion companion = MessageOptionsDialogFragment.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        MessageOptionsDialogFragment.OptionsDialogType optionsDialogType = MessageOptionsDialogFragment.OptionsDialogType.MESSAGE_OPTIONS;
        MessageListViewStyle messageListViewStyleRequireStyle = requireStyle();
        MessageListItemViewHolderFactory messageListItemViewHolderFactory = this.messageListItemViewHolderFactory;
        if (messageListItemViewHolderFactory == null) {
            AbstractC22676k.m65757q("messageListItemViewHolderFactory");
            throw null;
        }
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        if (messageBackgroundFactory == null) {
            AbstractC22676k.m65757q("messageBackgroundFactory");
            throw null;
        }
        AttachmentFactoryManager attachmentFactoryManager = this.attachmentFactoryManager;
        if (attachmentFactoryManager == null) {
            AbstractC22676k.m65757q("attachmentFactoryManager");
            throw null;
        }
        MessageOptionsDialogFragment messageOptionsDialogFragmentNewInstance = companion.newInstance(context, message, messageOptionItems, optionsDialogType, messageListViewStyleRequireStyle, messageBackgroundFactory, attachmentFactoryManager, messageListItemViewHolderFactory, this.showAvatarPredicate);
        messageOptionsDialogFragmentNewInstance.setReactionClickListener(new C19831i(reactionClickListener));
        messageOptionsDialogFragmentNewInstance.setMessageOptionClickListener(new C19831i(optionClickListener));
        messageOptionsDialogFragmentNewInstance.show(fragmentManager, MessageOptionsDialogFragment.TAG);
    }

    public final void showModeratedMessageDialog(Message message) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(getContext());
        if (fragmentManager != null) {
            ModeratedMessageDialogFragment moderatedMessageDialogFragmentNewInstance = ModeratedMessageDialogFragment.INSTANCE.newInstance(message);
            moderatedMessageDialogFragmentNewInstance.setDialogSelectionHandler(new ModeratedMessageDialogFragment.DialogSelectionHandler() { // from class: io.getstream.chat.android.ui.feature.messages.list.MessageListView$showModeratedMessageDialog$1$1$1
                @Override // io.getstream.chat.android.ui.feature.messages.dialog.ModeratedMessageDialogFragment.DialogSelectionHandler
                public final void onModeratedOptionSelected(Message message2, ModeratedMessageOption action) {
                    AbstractC22676k.m65750j(message2, "message");
                    AbstractC22676k.m65750j(action, "action");
                    this.this$0.moderatedMessageOptionHandler.onModeratedMessageOptionSelected(message2, action);
                }
            });
            moderatedMessageDialogFragmentNewInstance.show(fragmentManager, ModeratedMessageDialogFragment.TAG);
        }
    }

    public final void showUnreadLabelButton(int unreadCount) {
        MaterialButton materialButton = this.unreadLabelButton;
        if (materialButton != null) {
            materialButton.setVisibility(0);
        }
    }

    public final void updateChannel(Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        this.channel = channel;
        initAdapter();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    public final void setEmptyStateView(View view, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        ViewGroup viewGroup = this.emptyStateViewContainer;
        if (viewGroup == null) {
            AbstractC22676k.m65757q("emptyStateViewContainer");
            throw null;
        }
        View view2 = this.emptyStateView;
        if (view2 == null) {
            AbstractC22676k.m65757q("emptyStateView");
            throw null;
        }
        viewGroup.removeView(view2);
        this.emptyStateView = view;
        ViewGroup viewGroup2 = this.emptyStateViewContainer;
        if (viewGroup2 != null) {
            viewGroup2.addView(view, layoutParams);
        } else {
            AbstractC22676k.m65757q("emptyStateViewContainer");
            throw null;
        }
    }

    public final void setLoadingView(View view, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        ViewGroup viewGroup = this.loadingViewContainer;
        if (viewGroup == null) {
            AbstractC22676k.m65757q("loadingViewContainer");
            throw null;
        }
        View view2 = this.loadingView;
        if (view2 == null) {
            AbstractC22676k.m65757q("loadingView");
            throw null;
        }
        viewGroup.removeView(view2);
        this.loadingView = view;
        ViewGroup viewGroup2 = this.loadingViewContainer;
        if (viewGroup2 != null) {
            viewGroup2.addView(view, layoutParams);
        } else {
            AbstractC22676k.m65757q("loadingViewContainer");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.getstream.chat.android.ui.feature.messages.list.MessageListView$pauseAudioPlayerListener$1] */
    public MessageListView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MessageListView");
        this.ownCapabilities = C25235a0.f99113w;
        this.defaultChildLayoutParams = AbstractC30060g.m92088H(new C19728a(1));
        this.endRegionReachedHandler = new C19876p();
        this.bottomEndRegionReachedHandler = new C19876p();
        this.lastMessageReadHandler = new C19876p();
        this.messageEditHandler = new C19876p();
        this.messageDeleteHandler = new C19876p();
        this.threadStartHandler = new C19876p();
        this.openThreadHandler = new C19876p();
        this.toggleOriginalTextHandler = new C19876p();
        this.replyMessageClickListener = new C19876p();
        this.messageFlagHandler = new C19876p();
        this.messageUserBlockHandler = new C19876p();
        this.messageUserUnblockHandler = new C19876p();
        this.flagMessageResultHandler = new C19876p();
        this.messagePinHandler = new C19876p();
        this.messageMarkAsUnreadHandler = new C19876p();
        this.messageUnpinHandler = new C19876p();
        this.giphySendHandler = new C19876p();
        this.messageRetryHandler = new C19876p();
        this.messageReactionHandler = new C19876p();
        this.customActionHandler = new C19876p();
        this.messageReplyHandler = new C19876p();
        this.attachmentDownloadHandler = new C19876p();
        this.confirmDeleteMessageHandler = new C19860j(this);
        this.confirmFlagMessageHandler = new C19860j(this);
        final int i14 = 0;
        this._attachmentReplyOptionHandler = new ListenerDelegate(new C19862k(), new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.l
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj;
                switch (i14) {
                    case 0:
                        return MessageListView.m55387h0(interfaceC4339a);
                    case 1:
                        return MessageListView.m55409t(interfaceC4339a);
                    case 2:
                        return MessageListView.m55333E(interfaceC4339a);
                    default:
                        return MessageListView.m55328B0(interfaceC4339a);
                }
            }
        });
        final int i15 = 1;
        this._attachmentShowInChatOptionClickHandler = new ListenerDelegate(new C19866m(), new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.l
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj;
                switch (i15) {
                    case 0:
                        return MessageListView.m55387h0(interfaceC4339a);
                    case 1:
                        return MessageListView.m55409t(interfaceC4339a);
                    case 2:
                        return MessageListView.m55333E(interfaceC4339a);
                    default:
                        return MessageListView.m55328B0(interfaceC4339a);
                }
            }
        });
        final int i16 = 2;
        this._attachmentDownloadOptionHandler = new ListenerDelegate(new C19829h(this, 1), new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.l
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj;
                switch (i16) {
                    case 0:
                        return MessageListView.m55387h0(interfaceC4339a);
                    case 1:
                        return MessageListView.m55409t(interfaceC4339a);
                    case 2:
                        return MessageListView.m55333E(interfaceC4339a);
                    default:
                        return MessageListView.m55328B0(interfaceC4339a);
                }
            }
        });
        final int i17 = 3;
        this._attachmentDeleteOptionHandler = new ListenerDelegate(new C19870o(), new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.l
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj;
                switch (i17) {
                    case 0:
                        return MessageListView.m55387h0(interfaceC4339a);
                    case 1:
                        return MessageListView.m55409t(interfaceC4339a);
                    case 2:
                        return MessageListView.m55333E(interfaceC4339a);
                    default:
                        return MessageListView.m55328B0(interfaceC4339a);
                }
            }
        });
        this.errorEventHandler = new C19860j(this);
        this.moderatedMessageOptionHandler = new C19876p();
        this.messageListItemPredicate = HiddenMessageListItemPredicate.INSTANCE;
        this.messageListItemTransformer = new C19876p();
        this.showAvatarPredicate = new DefaultShowAvatarPredicate();
        this.lockScrollUp = true;
        OnMessageClickListener onMessageClickListener = new OnMessageClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.q
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageClickListener
            public final boolean onMessageClick(Message message) {
                return MessageListView.defaultMessageClickListener$lambda$44(this.f74794w, message);
            }
        };
        this.defaultMessageClickListener = onMessageClickListener;
        OnMessageLongClickListener onMessageLongClickListener = new OnMessageLongClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.r
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageLongClickListener
            public final boolean onMessageLongClick(Message message) {
                return MessageListView.defaultMessageLongClickListener$lambda$46(this.f74796w, message);
            }
        };
        this.defaultMessageLongClickListener = onMessageLongClickListener;
        this.moderatedMessageLongClickListener = new C19860j(this);
        OnMessageRetryListener onMessageRetryListener = new OnMessageRetryListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.s
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnMessageRetryListener
            public final boolean onRetryMessage(Message message) {
                MessageListView.defaultMessageRetryListener$lambda$53(this.f74800w, message);
                return true;
            }
        };
        this.defaultMessageRetryListener = onMessageRetryListener;
        OnThreadClickListener onThreadClickListener = new OnThreadClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.t
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnThreadClickListener
            public final boolean onThreadClick(Message message) {
                return MessageListView.defaultThreadClickListener$lambda$55(this.f74804w, message);
            }
        };
        this.defaultThreadClickListener = onThreadClickListener;
        OnTranslatedLabelClickListener onTranslatedLabelClickListener = new OnTranslatedLabelClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.u
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnTranslatedLabelClickListener
            public final boolean onTranslatedLabelClick(Message message) {
                MessageListView.defaultTranslatedLabelClickListener$lambda$56(this.f74807w, message);
                return true;
            }
        };
        this.defaultTranslatedLabelClickListener = onTranslatedLabelClickListener;
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.attachmentGalleryDestination = new AttachmentGalleryDestination(context2, get_attachmentReplyOptionHandler(), get_attachmentShowInChatOptionClickHandler(), get_attachmentDownloadOptionHandler(), get_attachmentDeleteOptionHandler());
        this.languageCache = new HashMap<>();
        this.getLanguageDisplayName = new C19868n(this, 1);
        OnAttachmentClickListener onAttachmentClickListener = new OnAttachmentClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.v
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAttachmentClickListener
            public final boolean onAttachmentClick(Message message, Attachment attachment) {
                return MessageListView.defaultAttachmentClickListener$lambda$63(this.f74810w, message, attachment);
            }
        };
        this.defaultAttachmentClickListener = onAttachmentClickListener;
        OnAttachmentDownloadClickListener onAttachmentDownloadClickListener = new OnAttachmentDownloadClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.w
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAttachmentDownloadClickListener
            public final boolean onAttachmentDownloadClick(Attachment attachment) {
                MessageListView.defaultAttachmentDownloadClickListener$lambda$65(this.f74813w, attachment);
                return true;
            }
        };
        this.defaultAttachmentDownloadClickListener = onAttachmentDownloadClickListener;
        OnReactionViewClickListener onReactionViewClickListener = new OnReactionViewClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.x
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnReactionViewClickListener
            public final boolean onReactionViewClick(Message message) {
                return MessageListView.defaultReactionViewClickListener$lambda$70(this.f74815w, message);
            }
        };
        this.defaultReactionViewClickListener = onReactionViewClickListener;
        C19894y c19894y = new C19894y();
        this.defaultUserClickListener = c19894y;
        this.defaultMentionClickListener = new C19896z();
        OnGiphySendListener onGiphySendListener = new OnGiphySendListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.a0
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnGiphySendListener
            public final boolean onGiphySend(GiphyAction giphyAction) {
                MessageListView.defaultGiphySendListener$lambda$73(this.f74591w, giphyAction);
                return false;
            }
        };
        this.defaultGiphySendListener = onGiphySendListener;
        OnLinkClickListener onLinkClickListener = new OnLinkClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.b0
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnLinkClickListener
            public final boolean onLinkClick(String str) {
                MessageListView.defaultLinkClickListener$lambda$74(this.f74726w, str);
                return true;
            }
        };
        this.defaultLinkClickListener = onLinkClickListener;
        C19876p c19876p = new C19876p();
        this.defaultEnterThreadListener = c19876p;
        C19876p c19876p2 = new C19876p();
        this.defaultUserReactionClickListener = c19876p2;
        C19822d0 c19822d0 = new C19822d0();
        this.defaultOnPollOptionClickListener = c19822d0;
        OnShowAllPollOptionClickListener onShowAllPollOptionClickListener = new OnShowAllPollOptionClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.e0
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnShowAllPollOptionClickListener
            public final boolean onShowAllPollOptionClick(Message message, Poll poll) {
                return MessageListView.defaultOnShowAllPollOptionClickListener$lambda$79(this.f74738a, message, poll);
            }
        };
        this.defaultOnShowAllPollOptionClickListener = onShowAllPollOptionClickListener;
        C19826f0 c19826f0 = new C19826f0();
        this.defaultOnPollCloseClickListener = c19826f0;
        C19828g0 c19828g0 = new C19828g0(this, 0);
        this.defaultOnViewPollResultClickListener = c19828g0;
        OnSuggestPollOptionClickListener onSuggestPollOptionClickListener = new OnSuggestPollOptionClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.h0
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnSuggestPollOptionClickListener
            public final boolean onSuggestPollOptionClick(Poll poll) {
                return MessageListView.defaultOnSuggestPollOptionClickListener$lambda$84(this.f74746w, poll);
            }
        };
        this.defaultOnSuggestPollOptionClickListener = onSuggestPollOptionClickListener;
        OnAddPollCommentClickListener onAddPollCommentClickListener = new OnAddPollCommentClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.i0
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAddPollCommentClickListener
            public final boolean onAddPollCommentClick(Message message, Poll poll) {
                return MessageListView.defaultOnAddPollCommentClickListener$lambda$86(this.f74748w, message, poll);
            }
        };
        this.defaultOnAddPollCommentClickListener = onAddPollCommentClickListener;
        OnViewPollCommentsClickListener onViewPollCommentsClickListener = new OnViewPollCommentsClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.j0
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnViewPollCommentsClickListener
            public final boolean onViewPollCommentsClick(Message message, Poll poll) {
                return MessageListView.defaultOnViewPollCommentsClickListener$lambda$88(this.f74772w, message, poll);
            }
        };
        this.defaultOnViewPollCommentsClickListener = onViewPollCommentsClickListener;
        this.listenerContainer = new MessageListListenersImpl(onMessageClickListener, onMessageLongClickListener, onMessageRetryListener, onThreadClickListener, onTranslatedLabelClickListener, onAttachmentClickListener, onAttachmentDownloadClickListener, onReactionViewClickListener, c19894y, null, onGiphySendListener, onLinkClickListener, null, c19822d0, onShowAllPollOptionClickListener, c19826f0, c19828g0, onSuggestPollOptionClickListener, onAddPollCommentClickListener, onViewPollCommentsClickListener, 4608, null);
        this.enterThreadListener = c19876p;
        this.userReactionClickListener = c19876p2;
        this.pauseAudioPlayerListener = new DefaultLifecycleObserver() { // from class: io.getstream.chat.android.ui.feature.messages.list.MessageListView$pauseAudioPlayerListener$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onCreate(InterfaceC1585g0 interfaceC1585g0) {
                super.onCreate(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
                super.onDestroy(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onPause(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                MessageListView.OnPauseAudioRecordingAttachmentsHandler onPauseAudioRecordingAttachmentsHandler = this.this$0.onPauseAudioRecordingAttachmentsHandler;
                if (onPauseAudioRecordingAttachmentsHandler != null) {
                    onPauseAudioRecordingAttachmentsHandler.onPauseAudioRecordingAttachments();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(InterfaceC1585g0 interfaceC1585g0) {
                super.onResume(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStart(InterfaceC1585g0 interfaceC1585g0) {
                super.onStart(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStop(InterfaceC1585g0 interfaceC1585g0) {
                super.onStop(interfaceC1585g0);
            }
        };
        init(attributeSet);
    }
}

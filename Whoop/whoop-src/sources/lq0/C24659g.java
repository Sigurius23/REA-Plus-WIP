package lq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import as2.AbstractC1953c;
import b13.ViewOnClickListenerC2292a;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.community.presentation.chat.view.ChatImageView;
import com.whoop.community.presentation.chat.view.ChatReactionView;
import com.whoop.community.presentation.chat.view.ChatRichTextLinkView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import de.hdodenhof.circleimageview.CircleImageView;
import eq0.AbstractC13482j0;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.ViewOnLongClickListenerC19797c;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import iq0.AbstractC20840s;
import iq0.C20827f;
import iq0.C20828g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kq0.C22772a;
import l83.C23454a0;
import l83.C23465k;
import or2.AbstractC28188o1;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36510a;
import vu1.AbstractC36512c;
import xp0.AbstractC38503c0;
import xp0.AbstractC38529z;

/* JADX INFO: renamed from: lq0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001dH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00100R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010#¨\u0006<"}, m65681d2 = {"Llq0/g;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parentView", "", "accessToken", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;", "messageLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;", "threadClickListener", "whoopUserName", "Lkotlin/Function1;", "Liq0/s;", "Ll83/a0;", "eventListener", "Leq0/j0;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leq0/j0;)V", "p", "()V", "Lio/getstream/chat/android/models/Attachment;", "richLinks", "", "hasNoUserAttachments", "Lcom/whoop/community/presentation/chat/view/ChatRichTextLinkView;", "B", "(Lio/getstream/chat/android/models/Attachment;Z)Lcom/whoop/community/presentation/chat/view/ChatRichTextLinkView;", "", "attachments", "Lcom/whoop/community/presentation/chat/view/ChatImageView;", "r", "(Ljava/util/List;)Lcom/whoop/community/presentation/chat/view/ChatImageView;", "q", "()Leq0/j0;", "Lcom/whoop/community/presentation/chat/view/ChatReactionView;", ProfileAnalyticsKt.VIEW, "Liq0/g;", "viewState", "y", "(Lcom/whoop/community/presentation/chat/view/ChatReactionView;Liq0/g;)Lcom/whoop/community/presentation/chat/view/ChatReactionView;", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "a", "Ljava/lang/String;", "b", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;", "c", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;", "d", "e", "Lkotlin/jvm/functions/Function1;", "f", "Leq0/j0;", "getBinding", "g", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24659g extends BaseMessageItemViewHolder<MessageListItem.MessageItem> {

    /* JADX INFO: renamed from: h */
    public static final int f96435h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String accessToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MessageListView.OnMessageLongClickListener messageLongClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final MessageListView.OnThreadClickListener threadClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String whoopUserName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1 eventListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC13482j0 binding;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C24659g(ViewGroup viewGroup, String str, MessageListView.OnMessageLongClickListener onMessageLongClickListener, MessageListView.OnThreadClickListener onThreadClickListener, String str2, Function1 function1, AbstractC13482j0 abstractC13482j0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        AbstractC13482j0 abstractC13482j1;
        if ((i13 & 64) != 0) {
            AbstractC13482j0 abstractC13482j0M38202c = AbstractC13482j0.m38202c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            AbstractC22676k.m65749i(abstractC13482j0M38202c, "inflate(...)");
            abstractC13482j1 = abstractC13482j0M38202c;
        } else {
            abstractC13482j1 = abstractC13482j0;
        }
        this(viewGroup, str, onMessageLongClickListener, onThreadClickListener, str2, function1, abstractC13482j1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m72006A(C24659g c24659g, C20828g c20828g, View it) {
        AbstractC22676k.m65750j(it, "it");
        c24659g.eventListener.invoke(new AbstractC20840s.a(c24659g.getData().getMessage().getId(), c20828g.getType()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private final ChatRichTextLinkView m72007B(Attachment richLinks, boolean hasNoUserAttachments) {
        ChatRichTextLinkView chatRichTextLinkView = this.binding.f47381t;
        AbstractC22676k.m65747g(chatRichTextLinkView);
        chatRichTextLinkView.setVisibility((!hasNoUserAttachments || richLinks == null) ? 8 : 0);
        if (richLinks != null) {
            chatRichTextLinkView.m19292f(richLinks);
            String titleLink = richLinks.getTitleLink();
            if (titleLink != null) {
                AbstractC1953c.m5963a(chatRichTextLinkView, new C24656d(0, this, titleLink));
            }
        }
        return chatRichTextLinkView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m72008C(C24659g c24659g, String str, View it) {
        AbstractC22676k.m65750j(it, "it");
        c24659g.eventListener.invoke(new AbstractC20840s.d(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m72021m(C24659g c24659g, MessageListItem.MessageItem messageItem, View view) {
        c24659g.threadClickListener.onThreadClick(messageItem.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final boolean m72022n(C24659g c24659g, MessageListItem.MessageItem messageItem, View view) {
        c24659g.messageLongClickListener.onMessageLongClick(messageItem.getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m72023o(C24659g c24659g, MessageListItem.MessageItem messageItem, View it) {
        AbstractC22676k.m65750j(it, "it");
        c24659g.eventListener.invoke(new AbstractC20840s.e(messageItem.getMessage()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private final void m72024p() {
        ArrayList arrayList = new ArrayList();
        Attachment attachment = null;
        for (Attachment attachment2 : getData().getMessage().getAttachments()) {
            if (attachment2.getOgUrl() != null) {
                attachment = attachment2;
            } else {
                arrayList.add(attachment2);
            }
        }
        m72007B(attachment, arrayList.isEmpty());
        m72026r(arrayList);
    }

    /* JADX INFO: renamed from: q */
    private final AbstractC13482j0 m72025q() {
        AbstractC13482j0 abstractC13482j0 = this.binding;
        Space spaceReactionsBottom = abstractC13482j0.f47382u;
        AbstractC22676k.m65749i(spaceReactionsBottom, "spaceReactionsBottom");
        spaceReactionsBottom.setVisibility(MessageKt.hasReactions(getData().getMessage()) ? 0 : 8);
        HashMap<String, C20828g> mapM57445a = C20827f.f78206a.m57445a(getData().getMessage());
        C20828g c20828g = mapM57445a.get("love");
        if (c20828g != null) {
            ChatReactionView reactionLove = abstractC13482j0.f47377p;
            AbstractC22676k.m65749i(reactionLove, "reactionLove");
            m72033y(reactionLove, c20828g);
        }
        C20828g c20828g2 = mapM57445a.get("like");
        if (c20828g2 != null) {
            ChatReactionView reactionLike = abstractC13482j0.f47376o;
            AbstractC22676k.m65749i(reactionLike, "reactionLike");
            m72033y(reactionLike, c20828g2);
        }
        C20828g c20828g3 = mapM57445a.get("dislike");
        if (c20828g3 != null) {
            ChatReactionView reactionDislike = abstractC13482j0.f47374m;
            AbstractC22676k.m65749i(reactionDislike, "reactionDislike");
            m72033y(reactionDislike, c20828g3);
        }
        C20828g c20828g4 = mapM57445a.get("haha");
        if (c20828g4 != null) {
            ChatReactionView reactionHaha = abstractC13482j0.f47375n;
            AbstractC22676k.m65749i(reactionHaha, "reactionHaha");
            m72033y(reactionHaha, c20828g4);
        }
        C20828g c20828g5 = mapM57445a.get("wow");
        if (c20828g5 != null) {
            ChatReactionView reactionWow = abstractC13482j0.f47380s;
            AbstractC22676k.m65749i(reactionWow, "reactionWow");
            m72033y(reactionWow, c20828g5);
        }
        C20828g c20828g6 = mapM57445a.get("sad");
        if (c20828g6 != null) {
            ChatReactionView reactionSad = abstractC13482j0.f47378q;
            AbstractC22676k.m65749i(reactionSad, "reactionSad");
            m72033y(reactionSad, c20828g6);
        }
        C20828g c20828g7 = mapM57445a.get("strong");
        if (c20828g7 != null) {
            ChatReactionView reactionStrong = abstractC13482j0.f47379r;
            AbstractC22676k.m65749i(reactionStrong, "reactionStrong");
            m72033y(reactionStrong, c20828g7);
        }
        return abstractC13482j0;
    }

    /* JADX INFO: renamed from: r */
    private final ChatImageView m72026r(List<Attachment> attachments) {
        ChatImageView chatImageView = this.binding.f47367f;
        AbstractC22676k.m65747g(chatImageView);
        chatImageView.setVisibility(!attachments.isEmpty() ? 0 : 8);
        String str = this.accessToken;
        chatImageView.m19290j(new C22772a(attachments, str != null ? new C23465k(TokenAuthInterceptor.AUTH_HEADER, "Bearer ".concat(str)) : null));
        final int i13 = 0;
        chatImageView.getImageOne().setOnClickListener(new View.OnClickListener(this) { // from class: lq0.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C24659g f96433x;

            {
                this.f96433x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        C24659g.m72027s(this.f96433x, view);
                        break;
                    case 1:
                        C24659g.m72028t(this.f96433x, view);
                        break;
                    default:
                        C24659g.m72029u(this.f96433x, view);
                        break;
                }
            }
        });
        final int i14 = 1;
        chatImageView.getImageTwo().setOnClickListener(new View.OnClickListener(this) { // from class: lq0.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C24659g f96433x;

            {
                this.f96433x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        C24659g.m72027s(this.f96433x, view);
                        break;
                    case 1:
                        C24659g.m72028t(this.f96433x, view);
                        break;
                    default:
                        C24659g.m72029u(this.f96433x, view);
                        break;
                }
            }
        });
        final int i15 = 2;
        chatImageView.getImageThree().setOnClickListener(new View.OnClickListener(this) { // from class: lq0.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C24659g f96433x;

            {
                this.f96433x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        C24659g.m72027s(this.f96433x, view);
                        break;
                    case 1:
                        C24659g.m72028t(this.f96433x, view);
                        break;
                    default:
                        C24659g.m72029u(this.f96433x, view);
                        break;
                }
            }
        });
        final int i16 = 1;
        chatImageView.getImageOne().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: lq0.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C24659g f96425b;

            {
                this.f96425b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i16) {
                    case 0:
                        return C24659g.m72032x(this.f96425b, view);
                    case 1:
                        return C24659g.m72030v(this.f96425b, view);
                    default:
                        return C24659g.m72031w(this.f96425b, view);
                }
            }
        });
        final int i17 = 2;
        chatImageView.getImageTwo().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: lq0.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C24659g f96425b;

            {
                this.f96425b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i17) {
                    case 0:
                        return C24659g.m72032x(this.f96425b, view);
                    case 1:
                        return C24659g.m72030v(this.f96425b, view);
                    default:
                        return C24659g.m72031w(this.f96425b, view);
                }
            }
        });
        final int i18 = 0;
        chatImageView.getImageThree().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: lq0.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C24659g f96425b;

            {
                this.f96425b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i18) {
                    case 0:
                        return C24659g.m72032x(this.f96425b, view);
                    case 1:
                        return C24659g.m72030v(this.f96425b, view);
                    default:
                        return C24659g.m72031w(this.f96425b, view);
                }
            }
        });
        return chatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m72027s(C24659g c24659g, View view) {
        c24659g.eventListener.invoke(new AbstractC20840s.b(c24659g.getData().getMessage(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m72028t(C24659g c24659g, View view) {
        c24659g.eventListener.invoke(new AbstractC20840s.b(c24659g.getData().getMessage(), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m72029u(C24659g c24659g, View view) {
        c24659g.eventListener.invoke(new AbstractC20840s.b(c24659g.getData().getMessage(), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final boolean m72030v(C24659g c24659g, View view) {
        c24659g.messageLongClickListener.onMessageLongClick(c24659g.getData().getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final boolean m72031w(C24659g c24659g, View view) {
        c24659g.messageLongClickListener.onMessageLongClick(c24659g.getData().getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final boolean m72032x(C24659g c24659g, View view) {
        c24659g.messageLongClickListener.onMessageLongClick(c24659g.getData().getMessage());
        return true;
    }

    /* JADX INFO: renamed from: y */
    private final ChatReactionView m72033y(ChatReactionView view, final C20828g viewState) {
        view.setVisibility(viewState.getIsVisible() ? 0 : 8);
        view.setCount(viewState.getCount());
        if (viewState.getHasSelfReaction()) {
            view.setBackgroundResource(AbstractC38529z.f165815h);
            final int i13 = 0;
            AbstractC1953c.m5963a(view, new Function1(this) { // from class: lq0.e

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C24659g f96430x;

                {
                    this.f96430x = this;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i13) {
                        case 0:
                            return C24659g.m72034z(this.f96430x, viewState, (View) obj);
                        default:
                            return C24659g.m72006A(this.f96430x, viewState, (View) obj);
                    }
                }
            });
            return view;
        }
        view.setBackgroundResource(AbstractC38529z.f165814g);
        final int i14 = 1;
        AbstractC1953c.m5963a(view, new Function1(this) { // from class: lq0.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C24659g f96430x;

            {
                this.f96430x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C24659g.m72034z(this.f96430x, viewState, (View) obj);
                    default:
                        return C24659g.m72006A(this.f96430x, viewState, (View) obj);
                }
            }
        });
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m72034z(C24659g c24659g, C20828g c20828g, View it) {
        AbstractC22676k.m65750j(it, "it");
        c24659g.eventListener.invoke(new AbstractC20840s.c(c24659g.getData().getMessage().getId(), c20828g.getType()));
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public void bindData(MessageListItem.MessageItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        AbstractC13482j0 abstractC13482j0 = this.binding;
        TextView textView = abstractC13482j0.f47368g;
        AbstractC22676k.m65747g(textView);
        textView.setVisibility(AbstractC28188o1.m85314d(data.getMessage().getText()) ? 0 : 8);
        textView.setText(data.getMessage().getText());
        ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(data.getMessage().getUser().getImage()).m89314d(C40786k.f175894e)).m89319j(AbstractC36512c.f156071n)).m15537y(abstractC13482j0.f47363b);
        if (AbstractC22676k.m65745e(this.whoopUserName, data.getMessage().getUser().getId())) {
            abstractC13482j0.f47373l.setTextColor(this.itemView.getContext().getColor(AbstractC36510a.f156012U));
        } else {
            abstractC13482j0.f47373l.setTextColor(this.itemView.getContext().getColor(AbstractC36510a.f156015X));
        }
        TextView messageReplyCount = abstractC13482j0.f47371j;
        AbstractC22676k.m65749i(messageReplyCount, "messageReplyCount");
        messageReplyCount.setVisibility(data.getMessage().getReplyCount() > 0 ? 0 : 8);
        if (data.getMessage().getReplyCount() > 0) {
            TextView messageReplyCount2 = abstractC13482j0.f47371j;
            AbstractC22676k.m65749i(messageReplyCount2, "messageReplyCount");
            messageReplyCount2.setVisibility(!data.isThreadMode() ? 0 : 8);
            abstractC13482j0.f47371j.setText(this.itemView.getResources().getQuantityString(AbstractC38503c0.f165561c, data.getMessage().getReplyCount(), String.valueOf(data.getMessage().getReplyCount())));
            abstractC13482j0.f47371j.setOnClickListener(new ViewOnClickListenerC2292a(7, this, data));
        }
        User user = data.getMessage().getUser();
        if (user.getExtraData().get("name") != null) {
            abstractC13482j0.f47372k.setVisibility(0);
            abstractC13482j0.f47372k.setText("@" + user.getExtraData().get("name"));
        } else {
            abstractC13482j0.f47372k.setVisibility(8);
        }
        abstractC13482j0.f47373l.setText(user.getExtraData().get("first_name") + " " + user.getExtraData().get("last_name"));
        Date createdAt = data.getMessage().getCreatedAt();
        if (createdAt != null) {
            abstractC13482j0.f47369h.setText(new SimpleDateFormat(DefaultDateFormatter.TIME_FORMAT_12H).format(createdAt));
        }
        abstractC13482j0.f47370i.setOnLongClickListener(new ViewOnLongClickListenerC19797c(5, this, data));
        CircleImageView avatarView = abstractC13482j0.f47363b;
        AbstractC22676k.m65749i(avatarView, "avatarView");
        AbstractC1953c.m5963a(avatarView, new C24656d(1, this, data));
        m72025q();
        m72024p();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C24659g(ViewGroup parentView, String str, MessageListView.OnMessageLongClickListener messageLongClickListener, MessageListView.OnThreadClickListener threadClickListener, String whoopUserName, Function1 eventListener, AbstractC13482j0 binding) {
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(messageLongClickListener, "messageLongClickListener");
        AbstractC22676k.m65750j(threadClickListener, "threadClickListener");
        AbstractC22676k.m65750j(whoopUserName, "whoopUserName");
        AbstractC22676k.m65750j(eventListener, "eventListener");
        AbstractC22676k.m65750j(binding, "binding");
        View root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.accessToken = str;
        this.messageLongClickListener = messageLongClickListener;
        this.threadClickListener = threadClickListener;
        this.whoopUserName = whoopUserName;
        this.eventListener = eventListener;
        this.binding = binding;
    }
}

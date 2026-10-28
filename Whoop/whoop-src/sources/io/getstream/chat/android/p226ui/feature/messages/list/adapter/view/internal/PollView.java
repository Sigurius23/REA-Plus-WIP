package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.p226ui.common.utils.extensions.PollKt;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.PollViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R.\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R.\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R(\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u00106\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R.\u00109\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010$\u001a\u0004\b:\u0010&\"\u0004\b;\u0010(R.\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010$\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(¨\u0006?"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/getstream/chat/android/models/Poll;", "poll", "", "isMine", "Ll83/a0;", "setPoll", "(Lio/getstream/chat/android/models/Poll;Z)V", "init", "(Landroid/util/AttributeSet;)V", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;", "pollAdapter", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Option;", "onOptionClick", "Lkotlin/jvm/functions/Function1;", "getOnOptionClick", "()Lkotlin/jvm/functions/Function1;", "setOnOptionClick", "(Lkotlin/jvm/functions/Function1;)V", "onClosePollClick", "getOnClosePollClick", "setOnClosePollClick", "onViewPollResultsClick", "getOnViewPollResultsClick", "setOnViewPollResultsClick", "Lkotlin/Function0;", "onShowAllPollOptionClick", "Lc93/a;", "getOnShowAllPollOptionClick", "()Lc93/a;", "setOnShowAllPollOptionClick", "(Lc93/a;)V", "onSuggestOptionClick", "getOnSuggestOptionClick", "setOnSuggestOptionClick", "onAddCommentClick", "getOnAddCommentClick", "setOnAddCommentClick", "onViewCommentsClick", "getOnViewCommentsClick", "setOnViewCommentsClick", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollView extends RecyclerView {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74617w = 0;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private Function1 onAddCommentClick;
    private Function1 onClosePollClick;
    private Function1 onOptionClick;
    private InterfaceC4339a onShowAllPollOptionClick;
    private Function1 onSuggestOptionClick;
    private Function1 onViewCommentsClick;
    private Function1 onViewPollResultsClick;
    private PollAdapter pollAdapter;
    private PollViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: B */
    public static void m55513B(PollView pollView) {
        pollView.onShowAllPollOptionClick.invoke();
    }

    /* JADX INFO: renamed from: C */
    public static void m55514C(PollView pollView, Poll poll) {
        pollView.onViewCommentsClick.invoke(poll);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void init(AttributeSet attrs) {
        PollViewStyle.Companion companion = PollViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.style = companion.invoke$stream_chat_android_ui_components_release(context, attrs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onAddCommentClick$lambda$5(Poll poll) {
        AbstractC22676k.m65750j(poll, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onClosePollClick$lambda$1(Poll poll) {
        AbstractC22676k.m65750j(poll, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onOptionClick$lambda$0(Option option) {
        AbstractC22676k.m65750j(option, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onSuggestOptionClick$lambda$4(Poll poll) {
        AbstractC22676k.m65750j(poll, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onViewCommentsClick$lambda$6(Poll poll) {
        AbstractC22676k.m65750j(poll, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onViewPollResultsClick$lambda$2(Poll poll) {
        AbstractC22676k.m65750j(poll, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static void m55517s(PollView pollView, Poll poll) {
        pollView.onSuggestOptionClick.invoke(poll);
    }

    private static final C23454a0 setPoll$lambda$10(PollView pollView, Poll poll) {
        pollView.onViewPollResultsClick.invoke(poll);
        return C23454a0.f92919a;
    }

    private static final C23454a0 setPoll$lambda$11(PollView pollView) {
        pollView.onShowAllPollOptionClick.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 setPoll$lambda$12(PollView pollView, Poll poll) {
        pollView.onSuggestOptionClick.invoke(poll);
        return C23454a0.f92919a;
    }

    private static final C23454a0 setPoll$lambda$13(PollView pollView, Poll poll) {
        pollView.onAddCommentClick.invoke(poll);
        return C23454a0.f92919a;
    }

    private static final C23454a0 setPoll$lambda$14(PollView pollView, Poll poll) {
        pollView.onViewCommentsClick.invoke(poll);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setPoll$lambda$8(PollView pollView, Option option) {
        AbstractC22676k.m65750j(option, "option");
        pollView.onOptionClick.invoke(option);
        return C23454a0.f92919a;
    }

    private static final C23454a0 setPoll$lambda$9(PollView pollView, Poll poll) {
        pollView.onClosePollClick.invoke(poll);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static void m55518t(PollView pollView, Poll poll) {
        pollView.onViewPollResultsClick.invoke(poll);
    }

    /* JADX INFO: renamed from: w */
    public static void m55521w(PollView pollView, Poll poll) {
        pollView.onClosePollClick.invoke(poll);
    }

    /* JADX INFO: renamed from: x */
    public static void m55522x(PollView pollView, Poll poll) {
        pollView.onAddCommentClick.invoke(poll);
    }

    public final Function1 getOnAddCommentClick() {
        return this.onAddCommentClick;
    }

    public final Function1 getOnClosePollClick() {
        return this.onClosePollClick;
    }

    public final Function1 getOnOptionClick() {
        return this.onOptionClick;
    }

    public final InterfaceC4339a getOnShowAllPollOptionClick() {
        return this.onShowAllPollOptionClick;
    }

    public final Function1 getOnSuggestOptionClick() {
        return this.onSuggestOptionClick;
    }

    public final Function1 getOnViewCommentsClick() {
        return this.onViewCommentsClick;
    }

    public final Function1 getOnViewPollResultsClick() {
        return this.onViewPollResultsClick;
    }

    public final void setOnAddCommentClick(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onAddCommentClick = function1;
    }

    public final void setOnClosePollClick(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onClosePollClick = function1;
    }

    public final void setOnOptionClick(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onOptionClick = function1;
    }

    public final void setOnShowAllPollOptionClick(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.onShowAllPollOptionClick = interfaceC4339a;
    }

    public final void setOnSuggestOptionClick(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onSuggestOptionClick = function1;
    }

    public final void setOnViewCommentsClick(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onViewCommentsClick = function1;
    }

    public final void setOnViewPollResultsClick(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onViewPollResultsClick = function1;
    }

    public final void setPoll(final Poll poll, boolean isMine) {
        AbstractC22676k.m65750j(poll, "poll");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[setPoll] poll: " + poll, null);
        }
        if (this.pollAdapter == null) {
            PollViewStyle pollViewStyle = this.style;
            if (pollViewStyle == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            C19781l c19781l = new C19781l(this, 2);
            final int i13 = 0;
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.o

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ PollView f74649x;

                {
                    this.f74649x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            PollView.m55521w(this.f74649x, poll);
                            break;
                        case 1:
                            PollView.m55518t(this.f74649x, poll);
                            break;
                        case 2:
                            PollView.m55517s(this.f74649x, poll);
                            break;
                        case 3:
                            PollView.m55522x(this.f74649x, poll);
                            break;
                        default:
                            PollView.m55514C(this.f74649x, poll);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
            final int i14 = 1;
            InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.o

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ PollView f74649x;

                {
                    this.f74649x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            PollView.m55521w(this.f74649x, poll);
                            break;
                        case 1:
                            PollView.m55518t(this.f74649x, poll);
                            break;
                        case 2:
                            PollView.m55517s(this.f74649x, poll);
                            break;
                        case 3:
                            PollView.m55522x(this.f74649x, poll);
                            break;
                        default:
                            PollView.m55514C(this.f74649x, poll);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
            final int i15 = 2;
            C19773d c19773d = new C19773d(this, 2);
            InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.o

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ PollView f74649x;

                {
                    this.f74649x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            PollView.m55521w(this.f74649x, poll);
                            break;
                        case 1:
                            PollView.m55518t(this.f74649x, poll);
                            break;
                        case 2:
                            PollView.m55517s(this.f74649x, poll);
                            break;
                        case 3:
                            PollView.m55522x(this.f74649x, poll);
                            break;
                        default:
                            PollView.m55514C(this.f74649x, poll);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
            final int i16 = 3;
            InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.o

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ PollView f74649x;

                {
                    this.f74649x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            PollView.m55521w(this.f74649x, poll);
                            break;
                        case 1:
                            PollView.m55518t(this.f74649x, poll);
                            break;
                        case 2:
                            PollView.m55517s(this.f74649x, poll);
                            break;
                        case 3:
                            PollView.m55522x(this.f74649x, poll);
                            break;
                        default:
                            PollView.m55514C(this.f74649x, poll);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
            final int i17 = 4;
            PollAdapter pollAdapter = new PollAdapter(pollViewStyle, c19781l, interfaceC4339a, interfaceC4339a2, c19773d, interfaceC4339a3, interfaceC4339a4, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.o

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ PollView f74649x;

                {
                    this.f74649x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i17) {
                        case 0:
                            PollView.m55521w(this.f74649x, poll);
                            break;
                        case 1:
                            PollView.m55518t(this.f74649x, poll);
                            break;
                        case 2:
                            PollView.m55517s(this.f74649x, poll);
                            break;
                        case 3:
                            PollView.m55522x(this.f74649x, poll);
                            break;
                        default:
                            PollView.m55514C(this.f74649x, poll);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            this.pollAdapter = pollAdapter;
            setAdapter(pollAdapter);
        }
        ArrayList arrayList = new ArrayList();
        String name = poll.getName();
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        arrayList.add(new PollItem.Header(name, PollKt.getSubtitle(poll, context)));
        Option winner = io.getstream.chat.android.client.extensions.internal.PollKt.getWinner(poll);
        List<Option> listM74156w1 = AbstractC25265s.m74156w1(poll.getOptions(), 5);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74156w1, 10));
        for (Option option : listM74156w1) {
            List<Vote> votesUnlessAnonymous = io.getstream.chat.android.client.extensions.internal.PollKt.getVotesUnlessAnonymous(poll, option);
            Integer num = poll.getVoteCountsByOption().get(option.getId());
            boolean z4 = false;
            int iIntValue = num != null ? num.intValue() : 0;
            List<Vote> ownVotes = poll.getOwnVotes();
            if (!(ownVotes instanceof Collection) || !ownVotes.isEmpty()) {
                Iterator<T> it = ownVotes.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((Vote) it.next()).getOptionId(), option.getId())) {
                        z4 = true;
                        break;
                    }
                }
            }
            arrayList2.add(new PollItem.Answer(option, votesUnlessAnonymous, z4, iIntValue, AbstractC25265s.m74154v1(poll.getVoteCountsByOption().values()), poll.getClosed(), AbstractC22676k.m65745e(winner, option)));
        }
        arrayList.addAll(arrayList2);
        PollItem.ShowAllOptions showAllOptions = new PollItem.ShowAllOptions(poll.getOptions().size());
        if (poll.getOptions().size() <= 5) {
            showAllOptions = null;
        }
        if (showAllOptions != null) {
            arrayList.add(showAllOptions);
        }
        PollItem.SuggestOption suggestOption = PollItem.SuggestOption.INSTANCE;
        if (!poll.getAllowUserSuggestedOptions() || poll.getClosed()) {
            suggestOption = null;
        }
        if (suggestOption != null) {
            arrayList.add(suggestOption);
        }
        PollItem.AddComment addComment = PollItem.AddComment.INSTANCE;
        if (!poll.getAllowAnswers() || !poll.getAnswers().isEmpty() || poll.getClosed()) {
            addComment = null;
        }
        if (addComment != null) {
            arrayList.add(addComment);
        }
        PollItem.ViewComments viewComments = new PollItem.ViewComments(poll.getAnswers().size());
        if (!poll.getAllowAnswers() || poll.getAnswers().isEmpty()) {
            viewComments = null;
        }
        if (viewComments != null) {
            arrayList.add(viewComments);
        }
        arrayList.add(PollItem.ViewResults.INSTANCE);
        PollItem.Close close = PollItem.Close.INSTANCE;
        if (!isMine || poll.getClosed()) {
            close = null;
        }
        if (close != null) {
            arrayList.add(close);
        }
        PollAdapter pollAdapter2 = this.pollAdapter;
        if (pollAdapter2 == null) {
            AbstractC22676k.m65757q("pollAdapter");
            throw null;
        }
        pollAdapter2.submitList(arrayList);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "PollView");
        this.onOptionClick = new C19778i(5);
        this.onClosePollClick = new C19778i(6);
        this.onViewPollResultsClick = new C19778i(7);
        this.onShowAllPollOptionClick = new C19777h(2);
        this.onSuggestOptionClick = new C19778i(2);
        this.onAddCommentClick = new C19778i(3);
        this.onViewCommentsClick = new C19778i(4);
        getContext();
        setLayoutManager(new LinearLayoutManager(1));
        setItemAnimator(null);
        init(attributeSet);
    }
}

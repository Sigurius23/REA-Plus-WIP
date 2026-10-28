package iq0;

import android.view.View;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.messages.MessageInput;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageComposerViewModel;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xp0.AbstractC38528y;

/* JADX INFO: renamed from: iq0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00108R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108¨\u0006<"}, m65681d2 = {"Liq0/d;", "", "Landroid/view/View;", "anchorView", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "messageComposerViewModel", "Landroidx/lifecycle/g0;", "lifecycleOwner", "Lkotlin/Function1;", "", "Ll83/a0;", "onTextAutocompleted", "<init>", "(Landroid/view/View;Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "state", "l", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "", "Lio/getstream/chat/android/models/User;", "mentions", "n", "(Ljava/util/List;)V", "Lio/getstream/chat/android/models/Command;", "commands", "m", "o", "()V", "g", "text", "k", "(Ljava/lang/String;)V", "i", "a", "Landroid/view/View;", "b", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "c", "Landroidx/lifecycle/g0;", "d", "Lkotlin/jvm/functions/Function1;", "Liq0/e;", "e", "Liq0/e;", "mentionAdapter", "Liq0/b;", "f", "Liq0/b;", "commandAdapter", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "suggestionsList", "Liq0/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Liq0/h;", "popup", "Ljava/util/List;", "cachedMentions", "j", "cachedCommands", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20823d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View anchorView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MessageComposerViewModel messageComposerViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC1585g0 lifecycleOwner;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1 onTextAutocompleted;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C20825e mentionAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C20819b commandAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final RecyclerView suggestionsList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C20829h popup;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private List<User> cachedMentions;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private List<Command> cachedCommands;

    /* JADX INFO: renamed from: iq0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.ChatComposerSuggestionsController$bind$1", m100430f = "ChatComposerSuggestionsController.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78192w;

        /* JADX INFO: renamed from: iq0.d$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.ChatComposerSuggestionsController$bind$1$1", m100430f = "ChatComposerSuggestionsController.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41776a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f78194w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f78195x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C20823d f78196y;

            /* JADX INFO: renamed from: iq0.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.ChatComposerSuggestionsController$bind$1$1$1", m100430f = "ChatComposerSuggestionsController.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41777a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f78197w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C20823d f78198x;

                /* JADX INFO: renamed from: iq0.d$a$a$a$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41778a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ C20823d f78199w;

                    public C41778a(C20823d c20823d) {
                        this.f78199w = c20823d;
                    }

                    @Override // ec3.InterfaceC13062m
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Object emit(MessageComposerState messageComposerState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        this.f78199w.m57431l(messageComposerState);
                        return C23454a0.f92919a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41777a(C20823d c20823d, InterfaceC30057d<? super C41777a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f78198x = c20823d;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41777a(this.f78198x, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41777a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f78197w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13037f2 messageComposerState = this.f78198x.messageComposerViewModel.getMessageComposerState();
                        C41778a c41778a = new C41778a(this.f78198x);
                        this.f78197w = 1;
                        if (messageComposerState.collect(c41778a, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX INFO: renamed from: iq0.d$a$a$b */
            @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.ChatComposerSuggestionsController$bind$1$1$2", m100430f = "ChatComposerSuggestionsController.kt", m100431l = {57}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class b extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f78200w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C20823d f78201x;

                /* JADX INFO: renamed from: iq0.d$a$a$b$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41779a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ C20823d f78202w;

                    public C41779a(C20823d c20823d) {
                        this.f78202w = c20823d;
                    }

                    @Override // ec3.InterfaceC13062m
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Object emit(MessageInput messageInput, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        MessageInput.Source source = messageInput.getSource();
                        if ((source instanceof MessageInput.Source.MentionSelected) || (source instanceof MessageInput.Source.CommandSelected)) {
                            this.f78202w.onTextAutocompleted.invoke(messageInput.getText());
                        }
                        return C23454a0.f92919a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C20823d c20823d, InterfaceC30057d<? super b> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f78201x = c20823d;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new b(this.f78201x, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f78200w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13037f2 messageInput = this.f78201x.messageComposerViewModel.getMessageInput();
                        C41779a c41779a = new C41779a(this.f78201x);
                        this.f78200w = 1;
                        if (messageInput.collect(c41779a, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41776a(C20823d c20823d, InterfaceC30057d<? super C41776a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f78196y = c20823d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41776a c41776a = new C41776a(this.f78196y, interfaceC30057d);
                c41776a.f78195x = obj;
                return c41776a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41776a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f78195x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f78194w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C41777a(this.f78196y, null), 3);
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(this.f78196y, null), 3);
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20823d.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78192w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC1585g0 interfaceC1585g0 = C20823d.this.lifecycleOwner;
                EnumC1635w enumC1635w = EnumC1635w.f6328z;
                C41776a c41776a = new C41776a(C20823d.this, null);
                this.f78192w = 1;
                if (AbstractC1613o1.m5023m(interfaceC1585g0, enumC1635w, c41776a, this) == enumC31071a) {
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

    public C20823d(View anchorView, MessageComposerViewModel messageComposerViewModel, InterfaceC1585g0 lifecycleOwner, Function1 onTextAutocompleted) {
        AbstractC22676k.m65750j(anchorView, "anchorView");
        AbstractC22676k.m65750j(messageComposerViewModel, "messageComposerViewModel");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(onTextAutocompleted, "onTextAutocompleted");
        this.anchorView = anchorView;
        this.messageComposerViewModel = messageComposerViewModel;
        this.lifecycleOwner = lifecycleOwner;
        this.onTextAutocompleted = onTextAutocompleted;
        final int i13 = 0;
        this.mentionAdapter = new C20825e(new Function1(this) { // from class: iq0.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C20823d f78180x;

            {
                this.f78180x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C20823d.m57430j(this.f78180x, (User) obj);
                    default:
                        return C20823d.m57429h(this.f78180x, (Command) obj);
                }
            }
        });
        final int i14 = 1;
        this.commandAdapter = new C20819b(new Function1(this) { // from class: iq0.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C20823d f78180x;

            {
                this.f78180x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C20823d.m57430j(this.f78180x, (User) obj);
                    default:
                        return C20823d.m57429h(this.f78180x, (Command) obj);
                }
            }
        });
        RecyclerView recyclerView = new RecyclerView(anchorView.getContext(), null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setBackgroundColor(recyclerView.getContext().getColor(AbstractC38528y.f165806d));
        this.suggestionsList = recyclerView;
        this.popup = new C20829h(recyclerView, anchorView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m57429h(C20823d c20823d, Command command) {
        AbstractC22676k.m65750j(command, "command");
        c20823d.messageComposerViewModel.selectCommand(command);
        c20823d.m57434o();
        c20823d.m57436i();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m57430j(C20823d c20823d, User user) {
        AbstractC22676k.m65750j(user, "user");
        c20823d.messageComposerViewModel.selectMention(user);
        c20823d.m57434o();
        c20823d.m57436i();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m57431l(MessageComposerState state) {
        if (!state.getMentionSuggestions().isEmpty()) {
            m57433n(state.getMentionSuggestions());
        } else {
            if (!state.getCommandSuggestions().isEmpty()) {
                m57432m(state.getCommandSuggestions());
                return;
            }
            this.cachedMentions = null;
            this.cachedCommands = null;
            this.popup.m57452a(false);
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m57432m(List<Command> commands) {
        if (AbstractC22676k.m65745e(this.cachedCommands, commands)) {
            return;
        }
        this.cachedCommands = commands;
        this.cachedMentions = null;
        AbstractC1692i1 adapter = this.suggestionsList.getAdapter();
        C20819b c20819b = this.commandAdapter;
        if (adapter != c20819b) {
            this.suggestionsList.setAdapter(c20819b);
        }
        this.commandAdapter.setItems(commands);
        this.popup.m57452a(!commands.isEmpty());
    }

    /* JADX INFO: renamed from: n */
    private final void m57433n(List<User> mentions) {
        if (AbstractC22676k.m65745e(this.cachedMentions, mentions)) {
            return;
        }
        this.cachedMentions = mentions;
        this.cachedCommands = null;
        AbstractC1692i1 adapter = this.suggestionsList.getAdapter();
        C20825e c20825e = this.mentionAdapter;
        if (adapter != c20825e) {
            this.suggestionsList.setAdapter(c20825e);
        }
        this.mentionAdapter.setItems(mentions);
        this.popup.m57452a(!mentions.isEmpty());
    }

    /* JADX INFO: renamed from: o */
    private final void m57434o() {
        this.onTextAutocompleted.invoke(((MessageInput) this.messageComposerViewModel.getMessageInput().getValue()).getText());
    }

    /* JADX INFO: renamed from: g */
    public final void m57435g() {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this.lifecycleOwner), null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: i */
    public final void m57436i() {
        this.cachedMentions = null;
        this.cachedCommands = null;
        this.popup.m57452a(false);
        this.messageComposerViewModel.dismissSuggestionsPopup();
    }

    /* JADX INFO: renamed from: k */
    public final void m57437k(String text) {
        AbstractC22676k.m65750j(text, "text");
        this.messageComposerViewModel.setMessageInput(text);
    }
}

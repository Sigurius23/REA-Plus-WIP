.class public final Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;
.super Lio/getstream/chat/android/ui/widgets/FullScreenDialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;,
        Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;,
        Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;,
        Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;,
        Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 Z2\u00020\u0001:\u0005[\\]^ZB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008 \u0010\u0003J\u000f\u0010!\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008#\u0010\u0003J\u000f\u0010$\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008$\u0010\u0003J\u000f\u0010%\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008%\u0010\u0003J\u000f\u0010&\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008&\u0010\u0003J0\u0010,\u001a\u00020\u000e*\u00020\'2\u0006\u0010)\u001a\u00020(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u000e0*H\u0082\u0008\u00a2\u0006\u0004\u0008,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010:\u001a\u00020\'8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008)\u0010<R\u001c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020>0=8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010AR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010BR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010CR\u001e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0D8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008O\u0010J\u001a\u0004\u0008P\u0010QR\u001e\u0010U\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020T0S8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010Y\u001a\u00020.8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010X\u00a8\u0006_"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;",
        "Lio/getstream/chat/android/ui/widgets/FullScreenDialogFragment;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "onDestroy",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;",
        "reactionClickListener",
        "setReactionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;",
        "userReactionClickListener",
        "setUserReactionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;",
        "messageOptionClickListener",
        "setMessageOptionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;)V",
        "onStart",
        "setupDialog",
        "setupDismissibleArea",
        "setupEditReactionsView",
        "setupMessageView",
        "setupUserReactionsView",
        "setupMessageOptions",
        "anchorReactionsViewToMessageView",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;",
        "messageOptionsDecoratorProvider",
        "Lkotlin/Function1;",
        "block",
        "withDecoratorProvider",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;",
        "optionsDialogType",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
        "messageListItemViewHolderFactory",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
        "messageOptionItems",
        "Ljava/util/List;",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;",
        "Lkotlin/Function0;",
        "Lio/getstream/chat/android/models/User;",
        "getCurrentUser",
        "Lc93/a;",
        "",
        "optionsOffset$delegate",
        "Ll83/h;",
        "getOptionsOffset",
        "()I",
        "optionsOffset",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "messageItem$delegate",
        "getMessageItem",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "messageItem",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "viewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;",
        "binding",
        "Companion",
        "ReactionClickListener",
        "UserReactionClickListener",
        "MessageOptionClickListener",
        "OptionsDialogType",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "MessageOptionsDialogFragment"


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

.field private getCurrentUser:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private message:Lio/getstream/chat/android/models/Message;

.field private final messageItem$delegate:Ll83/h;

.field private messageListItemViewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

.field private messageOptionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;

.field private messageOptionItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
            ">;"
        }
    .end annotation
.end field

.field private messageOptionsDecoratorProvider:Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;

.field private optionsDialogType:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;

.field private final optionsOffset$delegate:Ll83/h;

.field private reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;

.field private style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

.field private userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;

.field private viewHolder:Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/widgets/FullScreenDialogFragment;-><init>()V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$getCurrentUser$1;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$getCurrentUser$1;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getCurrentUser:Lc93/a;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->optionsOffset$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageItem$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageItem_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->setupMessageOptions$lambda$17$lambda$16(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    return-void
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;ILandroid/content/Context;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p11}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->anchorReactionsViewToMessageView$lambda$19(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;ILandroid/content/Context;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)I
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->optionsOffset_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)I

    move-result p0

    return p0
.end method

.method public static synthetic E(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->setupEditReactionsView$lambda$6$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setMessage$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->message:Lio/getstream/chat/android/models/Message;

    return-void
.end method

.method public static final synthetic access$setMessageListItemViewHolderFactory$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageListItemViewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    return-void
.end method

.method public static final synthetic access$setMessageOptionItems$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageOptionItems:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$setMessageOptionsDecoratorProvider$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageOptionsDecoratorProvider:Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;

    return-void
.end method

.method public static final synthetic access$setOptionsDialogType$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->optionsDialogType:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;

    return-void
.end method

.method public static final synthetic access$setStyle$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    return-void
.end method

.method private final anchorReactionsViewToMessageView()V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_horizontal_offset:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->viewHolder:Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->messageContainerView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/options/message/b;

    invoke-direct {v3, p0, v1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;ILandroid/content/Context;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_0
    return-void

    :cond_1
    const-string v0, "viewHolder"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final anchorReactionsViewToMessageView$lambda$19(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;ILandroid/content/Context;Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    add-int/2addr p6, p1

    iget-object p5, p3, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->editReactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;

    invoke-virtual {p5}, Landroid/view/View;->getLeft()I

    move-result p5

    sub-int/2addr p6, p5

    add-int/2addr p4, p1

    iget-object p1, p3, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->editReactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    sub-int/2addr p4, p1

    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    iget-object p2, p3, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->editReactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object p3

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result p3

    if-eqz p3, :cond_0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object p3

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result p3

    if-eqz p3, :cond_1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result p0

    if-nez p0, :cond_2

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move p6, p4

    :goto_1
    int-to-float p0, p6

    invoke-virtual {p2, p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->positionBubbleTail$stream_chat_android_ui_components_release(F)V

    return-void
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageItem$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    return-object v0
.end method

.method private final getOptionsOffset()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->optionsOffset$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private static final messageItem_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;
    .locals 12

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->message:Lio/getstream/chat/android/models/Message;

    const-string p0, "message"

    const/4 v2, 0x0

    move-object v3, v2

    if-eqz v1, :cond_2

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->BOTTOM:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v4

    invoke-interface {v4}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    :cond_0
    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v10, 0x1f8

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method private static final optionsOffset_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)I
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "requireContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_spacing_medium:I

    invoke-static {p0, v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method

.method private final setupDialog()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->setupDismissibleArea()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->setupEditReactionsView()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->setupMessageView()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->anchorReactionsViewToMessageView()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->optionsDialogType:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;

    if-eqz v0, :cond_2

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->setupUserReactionsView()V

    return-void

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->setupMessageOptions()V

    return-void

    :cond_2
    const-string v0, "optionsDialogType"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final setupDismissibleArea()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->containerView:Landroid/widget/LinearLayout;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->messageContainer:Lio/getstream/chat/android/ui/widgets/internal/TouchInterceptingFrameLayout;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final setupDismissibleArea$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private static final setupDismissibleArea$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private final setupEditReactionsView()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->editReactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    const-string v2, "style"

    const/4 v3, 0x0

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getEditReactionsViewStyle()Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->applyStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->message:Lio/getstream/chat/android/models/Message;

    const-string v4, "message"

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v1

    sget-object v5, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    if-ne v1, v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getReactionsEnabled()Z

    move-result v5

    if-eqz v5, :cond_4

    if-nez v1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getShowReactionsForUnsentMessages()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    :goto_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->message:Lio/getstream/chat/android/models/Message;

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-virtual {v0, v1, v4}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->setMessage(Lio/getstream/chat/android/models/Message;Z)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->setReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V

    goto :goto_2

    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_4
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayEditReactionsMarginTop()I

    move-result v1

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayEditReactionsMarginBottom()I

    move-result v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayEditReactionsMarginStart()I

    move-result v5

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayEditReactionsMarginEnd()I

    move-result v2

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    instance-of v1, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v1, :cond_5

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    :cond_5
    if-eqz v3, :cond_7

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v0

    if-eqz v0, :cond_6

    const v0, 0x800005

    goto :goto_3

    :cond_6
    const v0, 0x800003

    :goto_3
    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    :cond_7
    return-void

    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_d
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method private static final setupEditReactionsView$lambda$6$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Ljava/lang/String;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->message:Lio/getstream/chat/android/models/Message;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;->onReactionClick(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p0, "message"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private final setupMessageOptions()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->messageOptionsView:Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_b

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x800005

    goto :goto_0

    :cond_0
    const v2, 0x800003

    :goto_0
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-eqz v1, :cond_a

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, "style"

    if-eqz v3, :cond_2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageEndMargin()I

    move-result v3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getOptionsOffset()I

    move-result v6

    add-int/2addr v3, v6

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    goto :goto_1

    :cond_1
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_2
    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageStartMargin()I

    move-result v3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getOptionsOffset()I

    move-result v6

    add-int/2addr v3, v6

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageOptionItems:Ljava/util/List;

    if-eqz v1, :cond_8

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v3, :cond_7

    invoke-virtual {v0, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->setMessageOptions(Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->setMessageActionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayMessageOptionsMarginTop()I

    move-result v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayMessageOptionsMarginBottom()I

    move-result v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayMessageOptionsMarginStart()I

    move-result v3

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayMessageOptionsMarginEnd()I

    move-result v4

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    return-void

    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_4
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_6
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_7
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_8
    const-string v0, "messageOptionItems"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_9
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_a
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final setupMessageOptions$lambda$17$lambda$16(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V
    .locals 1

    const-string v0, "messageAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageOptionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;->onMessageOptionClick(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private final setupMessageView()V
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageListItemViewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageOptionsDecoratorProvider:Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setDecoratorProvider$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V

    :try_start_0
    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->messageContainer:Lio/getstream/chat/android/ui/widgets/internal/TouchInterceptingFrameLayout;

    const-string v3, "messageContainer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object v2

    iget-object v3, v2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->messageContainer:Lio/getstream/chat/android/ui/widgets/internal/TouchInterceptingFrameLayout;

    iget-object v4, v2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v7, -0x2

    invoke-direct {v5, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->getMessageItem()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object v3

    sget-object v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->access$getFULL$cp()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->bindListItem$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    iput-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->viewHolder:Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setDecoratorProvider$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V

    return-void

    :catchall_0
    move-exception v2

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setDecoratorProvider$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V

    throw v2

    :cond_0
    const-string v0, "messageOptionsDecoratorProvider"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "messageListItemViewHolderFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final setupMessageView$lambda$9$lambda$8$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private final setupUserReactionsView()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->userReactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    const/4 v2, 0x0

    const-string v3, "style"

    if-eqz v1, :cond_6

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->configure$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->message:Lio/getstream/chat/android/models/Message;

    if-eqz v4, :cond_0

    invoke-virtual {v0, v4, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->setMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)V

    goto :goto_0

    :cond_0
    const-string v0, "message"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->setOnUserReactionClickListener$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayUserReactionsMarginTop()I

    move-result v1

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayUserReactionsMarginBottom()I

    move-result v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayUserReactionsMarginStart()I

    move-result v5

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayUserReactionsMarginEnd()I

    move-result v2

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    return-void

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private static final setupUserReactionsView$lambda$13$lambda$12(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V
    .locals 2

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reaction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->message:Lio/getstream/chat/android/models/Message;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;->onUserReactionClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void

    :cond_0
    const-string p0, "message"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method private final withDecoratorProvider(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;",
            "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v0

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setDecoratorProvider$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V

    :try_start_0
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setDecoratorProvider$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setDecoratorProvider$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V

    throw p2
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->setupUserReactionsView$lambda$13$lambda$12(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V

    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->getRoot()Landroid/widget/ScrollView;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageOptionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;

    return-void
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/y;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    return-void
.end method

.method public final onStart()V
    .locals 3

    invoke-super {p0}, Lio/getstream/chat/android/ui/widgets/FullScreenDialogFragment;->onStart()V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getOptionsOverlayDimColor()I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->optionsDialogType:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->message:Lio/getstream/chat/android/models/Message;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageListItemViewHolderFactory:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageOptionItems:Ljava/util/List;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p2, :cond_1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->setupDialog()V

    return-void

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method public final setMessageOptionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;)V
    .locals 1

    const-string v0, "messageOptionClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->messageOptionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;

    return-void
.end method

.method public final setReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;)V
    .locals 1

    const-string v0, "reactionClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;

    return-void
.end method

.method public final setUserReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;)V
    .locals 1

    const-string v0, "userReactionClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$UserReactionClickListener;

    return-void
.end method

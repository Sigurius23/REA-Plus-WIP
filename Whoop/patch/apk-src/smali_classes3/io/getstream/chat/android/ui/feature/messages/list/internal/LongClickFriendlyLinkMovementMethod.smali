.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;
.super Lio/getstream/chat/android/ui/utils/TextViewLinkHandler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBA\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0019R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;",
        "Lio/getstream/chat/android/ui/utils/TextViewLinkHandler;",
        "Landroid/widget/TextView;",
        "textView",
        "Landroid/view/View;",
        "longClickTarget",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onLinkClicked",
        "Lio/getstream/chat/android/models/User;",
        "onUserClicked",
        "<init>",
        "(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "",
        "checkLongClick",
        "()Z",
        "url",
        "onLinkClick",
        "(Ljava/lang/String;)V",
        "user",
        "onUserClick",
        "(Lio/getstream/chat/android/models/User;)V",
        "Landroid/widget/TextView;",
        "Landroid/view/View;",
        "Lkotlin/jvm/functions/Function1;",
        "isLongClick",
        "Z",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;


# instance fields
.field private isLongClick:Z

.field private final longClickTarget:Landroid/view/View;

.field private final onLinkClicked:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final onUserClicked:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final textView:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;

    return-void
.end method

.method private constructor <init>(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Landroid/text/method/LinkMovementMethod;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->textView:Landroid/widget/TextView;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->longClickTarget:Landroid/view/View;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->onLinkClicked:Lkotlin/jvm/functions/Function1;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->onUserClicked:Lkotlin/jvm/functions/Function1;

    .line 7
    new-instance p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 8
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$special$$inlined$doAfterTextChanged$1;

    invoke-direct {p2, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$special$$inlined$doAfterTextChanged$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;)V

    .line 9
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;-><init>(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->isLongClick:Z

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->longClickTarget:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->performLongClick()Z

    invoke-static {}, Lio/getstream/chat/android/ui/utils/ManufacturerKt;->shouldConsumeLongTap()Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->_init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getTextView$p(Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->textView:Landroid/widget/TextView;

    return-object p0
.end method

.method private final checkLongClick()Z
    .locals 2

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->isLongClick:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->isLongClick:Z

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method


# virtual methods
.method public final onLinkClick(Ljava/lang/String;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->checkLongClick()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->onLinkClicked:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onUserClick(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->checkLongClick()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->onUserClicked:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

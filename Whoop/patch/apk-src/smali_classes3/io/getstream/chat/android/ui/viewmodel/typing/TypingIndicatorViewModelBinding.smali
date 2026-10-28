.class public final Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModelBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0008\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;",
        "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;",
        "view",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;Landroidx/lifecycle/g0;)V",
        "bindView",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModelBinding;->bindView$lambda$0(Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;Ljava/util/List;)Ll83/a0;

    return-void
.end method

.method public static final bind(Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->getTypingUsers()Landroidx/lifecycle/p0;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;Ljava/util/List;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->setTypingUsers(Ljava/util/List;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

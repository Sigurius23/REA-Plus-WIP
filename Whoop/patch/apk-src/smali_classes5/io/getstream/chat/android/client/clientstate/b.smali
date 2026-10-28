.class public final synthetic Lio/getstream/chat/android/client/clientstate/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/client/clientstate/UserStateService;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/clientstate/UserStateService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/clientstate/b;->w:Lio/getstream/chat/android/client/clientstate/UserStateService;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/b;->w:Lio/getstream/chat/android/client/clientstate/UserStateService;

    check-cast p1, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService;->c(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

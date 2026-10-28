.class public final synthetic Lio/getstream/chat/android/client/socket/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/getstream/chat/android/client/socket/SocketListener;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->h(Lio/getstream/chat/android/client/socket/SocketListener;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;

.field public final synthetic y:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->a(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Ltb/a;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;->y:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/b;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->e(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Ltb/a;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

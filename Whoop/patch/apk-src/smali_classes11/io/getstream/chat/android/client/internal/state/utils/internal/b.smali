.class public final synthetic Lio/getstream/chat/android/client/internal/state/utils/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lec3/f2;


# direct methods
.method public synthetic constructor <init>(ILec3/f2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->w:I

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->y:Lec3/f2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->y:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->y:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->y:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lio/getstream/chat/android/client/internal/state/utils/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lec3/f2;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function3;

.field public final synthetic y:Lec3/f2;

.field public final synthetic z:Lec3/f2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function3;Lec3/f2;Lec3/f2;Lec3/f2;I)V
    .locals 0

    iput p5, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->x:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->y:Lec3/f2;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->z:Lec3/f2;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->E:Lec3/f2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->y:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->z:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->E:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->x:Lkotlin/jvm/functions/Function3;

    invoke-interface {v3, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->z:Lec3/f2;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->E:Lec3/f2;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->y:Lec3/f2;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/a;->x:Lkotlin/jvm/functions/Function3;

    invoke-static {v2, v0, v1, v3}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->a(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lbd3/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/g0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;I)V
    .locals 0

    iput p2, p0, Lbd3/k0;->w:I

    iput-object p1, p0, Lbd3/k0;->x:Lkotlin/jvm/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbd3/k0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, La3/p2;

    const-string v0, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp0/g1;

    iget-object p1, p1, Lp0/g1;->O:Lp0/l0;

    iget-object v0, p0, Lbd3/k0;->x:Lkotlin/jvm/internal/g0;

    iget-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    filled-new-array {p1}, [Lp0/l0;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    :goto_0
    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, La3/o2;->x:La3/o2;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbd3/k0;->x:Lkotlin/jvm/internal/g0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->c(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbd3/k0;->x:Lkotlin/jvm/internal/g0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->f(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbd3/k0;->x:Lkotlin/jvm/internal/g0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->e(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbd3/k0;->x:Lkotlin/jvm/internal/g0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->a(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbd3/k0;->x:Lkotlin/jvm/internal/g0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->d(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lbd3/k0;->x:Lkotlin/jvm/internal/g0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->b(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/k0;->x:Lkotlin/jvm/internal/g0;

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

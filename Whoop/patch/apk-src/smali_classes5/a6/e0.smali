.class public final La6/e0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public final synthetic z:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;La6/i0;Lkotlin/jvm/internal/e0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La6/e0;->w:I

    .line 1
    iput-object p1, p0, La6/e0;->z:Ljava/io/Serializable;

    iput-object p2, p0, La6/e0;->E:Ljava/lang/Object;

    iput-object p3, p0, La6/e0;->F:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lt23/b4;Ljava/lang/String;Ljava/lang/String;Ltx/f;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La6/e0;->w:I

    .line 2
    iput-object p1, p0, La6/e0;->y:Ljava/lang/Object;

    iput-object p2, p0, La6/e0;->z:Ljava/io/Serializable;

    iput-object p3, p0, La6/e0;->E:Ljava/lang/Object;

    iput-object p4, p0, La6/e0;->F:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 7

    iget v0, p0, La6/e0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, La6/e0;

    iget-object v0, p0, La6/e0;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lt23/b4;

    iget-object v0, p0, La6/e0;->z:Ljava/io/Serializable;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, La6/e0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, La6/e0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ltx/f;

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, La6/e0;-><init>(Lt23/b4;Ljava/lang/String;Ljava/lang/String;Ltx/f;Lq83/d;)V

    return-object v1

    :pswitch_0
    move-object v6, p1

    new-instance p1, La6/e0;

    iget-object v0, p0, La6/e0;->z:Ljava/io/Serializable;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, La6/e0;->E:Ljava/lang/Object;

    check-cast v1, La6/i0;

    iget-object v2, p0, La6/e0;->F:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/e0;

    invoke-direct {p1, v0, v1, v2, v6}, La6/e0;-><init>(Lkotlin/jvm/internal/g0;La6/i0;Lkotlin/jvm/internal/e0;Lq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La6/e0;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, La6/e0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/e0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La6/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, La6/e0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/e0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La6/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, La6/e0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/e0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/e0;->y:Ljava/lang/Object;

    check-cast p1, Lt23/b4;

    iget-object p1, p1, Lt23/b4;->E:Ly33/c;

    invoke-virtual {p1}, Ly33/c;->a()Lio/getstream/android/video/generated/apis/ProductvideoApi;

    move-result-object p1

    iget-object v1, p0, La6/e0;->z:Ljava/io/Serializable;

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, La6/e0;->E:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lio/getstream/android/video/generated/models/RejectCallRequest;

    iget-object v5, p0, La6/e0;->F:Ljava/lang/Object;

    check-cast v5, Ltx/f;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ltx/f;->M()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    invoke-direct {v4, v5}, Lio/getstream/android/video/generated/models/RejectCallRequest;-><init>(Ljava/lang/String;)V

    iput v2, p0, La6/e0;->x:I

    invoke-interface {p1, v1, v3, v4, p0}, Lio/getstream/android/video/generated/apis/ProductvideoApi;->rejectCall(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RejectCallRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    move-object p1, v0

    :cond_3
    :goto_1
    return-object p1

    :pswitch_0
    iget-object v0, p0, La6/e0;->F:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    iget-object v1, p0, La6/e0;->z:Ljava/io/Serializable;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v2, p0, La6/e0;->E:Ljava/lang/Object;

    check-cast v2, La6/i0;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, La6/e0;->x:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_7

    if-eq v4, v7, :cond_6

    if-eq v4, v6, :cond_5

    if-ne v4, v5, :cond_4

    iget-object v0, p0, La6/e0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/io/Serializable;

    check-cast v0, Lkotlin/jvm/internal/e0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object v4, p0, La6/e0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/io/Serializable;

    check-cast v4, Lkotlin/jvm/internal/e0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_6
    iget-object v4, p0, La6/e0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/io/Serializable;

    check-cast v4, Lkotlin/jvm/internal/g0;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iput-object v1, p0, La6/e0;->y:Ljava/lang/Object;

    iput v7, p0, La6/e0;->x:I

    invoke-virtual {v2, p0}, La6/i0;->i(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_8

    goto :goto_6

    :cond_8
    move-object v4, v1

    :goto_2
    iput-object p1, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v2}, La6/i0;->h()La6/d1;

    move-result-object p1

    iput-object v0, p0, La6/e0;->y:Ljava/lang/Object;

    iput v6, p0, La6/e0;->x:I

    invoke-virtual {p1}, La6/d1;->a()Ljava/lang/Integer;

    move-result-object p1

    if-ne p1, v3, :cond_9

    goto :goto_6

    :cond_9
    move-object v4, v0

    :goto_3
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v4, Lkotlin/jvm/internal/e0;->w:I
    :try_end_2
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_5

    :catch_0
    iget-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v0, p0, La6/e0;->y:Ljava/lang/Object;

    iput v5, p0, La6/e0;->x:I

    invoke-virtual {v2, p1, v7, p0}, La6/i0;->j(Ljava/lang/Object;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_a

    goto :goto_6

    :cond_a
    :goto_4
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v0, Lkotlin/jvm/internal/e0;->w:I

    :goto_5
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

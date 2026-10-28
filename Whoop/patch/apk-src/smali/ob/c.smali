.class public final Lob/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Landroidx/room/z0;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lob/c;->w:I

    .line 1
    iput-object p1, p0, Lob/c;->y:Landroidx/room/z0;

    iput-boolean p2, p0, Lob/c;->z:Z

    iput-boolean p3, p0, Lob/c;->E:Z

    iput-object p4, p0, Lob/c;->F:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lq83/d;Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lob/c;->w:I

    .line 2
    iput-object p2, p0, Lob/c;->y:Landroidx/room/z0;

    iput-boolean p3, p0, Lob/c;->z:Z

    iput-boolean p4, p0, Lob/c;->E:Z

    iput-object p5, p0, Lob/c;->F:Lkotlin/jvm/functions/Function1;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    iget p1, p0, Lob/c;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lob/c;

    iget-boolean v4, p0, Lob/c;->E:Z

    iget-object v5, p0, Lob/c;->F:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lob/c;->y:Landroidx/room/z0;

    iget-boolean v3, p0, Lob/c;->z:Z

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lob/c;-><init>(Lq83/d;Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)V

    return-object v0

    :pswitch_0
    move-object v1, p2

    new-instance p1, Lob/c;

    iget-boolean v4, p0, Lob/c;->E:Z

    iget-object v5, p0, Lob/c;->F:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lob/c;->y:Landroidx/room/z0;

    iget-boolean v3, p0, Lob/c;->z:Z

    move-object v6, v1

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lob/c;-><init>(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lob/c;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lob/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lob/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lob/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lob/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lob/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lob/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lob/c;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lob/c;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v3, Lob/b;

    iget-object v8, p0, Lob/c;->F:Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x1

    iget-boolean v4, p0, Lob/c;->E:Z

    iget-boolean v5, p0, Lob/c;->z:Z

    iget-object v6, p0, Lob/c;->y:Landroidx/room/z0;

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lob/b;-><init>(ZZLandroidx/room/z0;Lq83/d;Lkotlin/jvm/functions/Function1;I)V

    iput v2, p0, Lob/c;->x:I

    invoke-virtual {v6, v5, v3, p0}, Landroidx/room/z0;->useConnection(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lob/c;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lob/c;->y:Landroidx/room/z0;

    invoke-virtual {p1}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Landroidx/room/z0;->inTransaction()Z

    move-result p1

    if-nez p1, :cond_6

    :cond_5
    iget-boolean p1, p0, Lob/c;->z:Z

    if-eqz p1, :cond_6

    move v4, v2

    goto :goto_1

    :cond_6
    const/4 p1, 0x0

    move v4, p1

    :goto_1
    new-instance v3, Lob/b;

    const/4 v7, 0x0

    const/4 v9, 0x0

    iget-boolean v5, p0, Lob/c;->E:Z

    iget-object v6, p0, Lob/c;->y:Landroidx/room/z0;

    iget-object v8, p0, Lob/c;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v3 .. v9}, Lob/b;-><init>(ZZLandroidx/room/z0;Lq83/d;Lkotlin/jvm/functions/Function1;I)V

    iput v2, p0, Lob/c;->x:I

    invoke-virtual {v6, v5, v3, p0}, Landroidx/room/z0;->useConnection(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    move-object p1, v0

    :cond_7
    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final Lrv/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Lec3/m;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;Lm63/d;Lec3/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lrv/f;->w:I

    .line 1
    iput-object p2, p0, Lrv/f;->E:Ljava/lang/Object;

    iput-object p3, p0, Lrv/f;->F:Ljava/lang/Object;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lq83/d;Lw23/p;Lc93/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lrv/f;->w:I

    .line 2
    iput-object p2, p0, Lrv/f;->E:Ljava/lang/Object;

    check-cast p3, Lkotlin/jvm/internal/m;

    iput-object p3, p0, Lrv/f;->F:Ljava/lang/Object;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lrv/f;->w:I

    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lrv/f;

    iget-object v1, p0, Lrv/f;->E:Ljava/lang/Object;

    check-cast v1, Lw23/p;

    iget-object v2, p0, Lrv/f;->F:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/m;

    invoke-direct {v0, p3, v1, v2}, Lrv/f;-><init>(Lq83/d;Lw23/p;Lc93/a;)V

    iput-object p1, v0, Lrv/f;->y:Lec3/m;

    iput-object p2, v0, Lrv/f;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lrv/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, Lrv/f;

    iget-object v1, p0, Lrv/f;->E:Ljava/lang/Object;

    check-cast v1, Lm63/d;

    iget-object v2, p0, Lrv/f;->F:Ljava/lang/Object;

    check-cast v2, Lec3/l;

    invoke-direct {v0, p3, v1, v2}, Lrv/f;-><init>(Lq83/d;Lm63/d;Lec3/l;)V

    iput-object p1, v0, Lrv/f;->y:Lec3/m;

    iput-object p2, v0, Lrv/f;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lrv/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lrv/f;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lrv/f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrv/f;->y:Lec3/m;

    iget-object v1, p0, Lrv/f;->z:Ljava/lang/Object;

    check-cast v1, Le33/u;

    iget-object v3, v1, Le33/u;->r:Lec3/h2;

    iget-object v4, p0, Lrv/f;->E:Ljava/lang/Object;

    check-cast v4, Lw23/p;

    iget-object v5, p0, Lrv/f;->F:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/m;

    iput v2, p0, Lrv/f;->x:I

    invoke-static {p1}, Lec3/v;->y(Lec3/m;)V

    new-instance v2, Landroidx/room/x;

    const/16 v6, 0x15

    invoke-direct {v2, v6, p1, v1}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lec3/f1;

    invoke-direct {p1, v2, v5, v4}, Lec3/f1;-><init>(Lec3/m;Lc93/a;Lw23/p;)V

    new-instance v1, La6/t;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, La6/t;-><init>(Lec3/m;I)V

    new-instance p1, Landroidx/room/x;

    const/16 v2, 0x14

    invoke-direct {p1, v2, v1, v4}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lrv/f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-ne v1, v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrv/f;->y:Lec3/m;

    iget-object v1, p0, Lrv/f;->z:Ljava/lang/Object;

    check-cast v1, Lev/r;

    const/4 v3, -0x1

    if-nez v1, :cond_4

    move v1, v3

    goto :goto_1

    :cond_4
    sget-object v4, Lrv/e;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v4, v1

    :goto_1
    if-eq v1, v3, :cond_7

    if-eq v1, v2, :cond_6

    const/4 v3, 0x2

    if-ne v1, v3, :cond_5

    iget-object v1, p0, Lrv/f;->F:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    new-instance v3, Lch/o;

    const/4 v4, 0x6

    invoke-direct {v3, v1, v4}, Lch/o;-><init>(Lec3/l;I)V

    goto :goto_2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    iget-object v1, p0, Lrv/f;->E:Ljava/lang/Object;

    check-cast v1, Lm63/d;

    iget-object v1, v1, Lm63/d;->F:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lec3/q1;

    goto :goto_2

    :cond_7
    sget-object v3, Lec3/k;->w:Lec3/k;

    :goto_2
    iput v2, p0, Lrv/f;->x:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

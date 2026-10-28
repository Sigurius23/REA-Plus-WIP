.class public final Lfc3/i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lec3/m;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lfc3/k;


# direct methods
.method public constructor <init>(Lfc3/k;Lec3/m;Ljava/lang/Object;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lfc3/i;->w:I

    .line 1
    iput-object p1, p0, Lfc3/i;->z:Lfc3/k;

    iput-object p2, p0, Lfc3/i;->E:Lec3/m;

    iput-object p3, p0, Lfc3/i;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lfc3/k;Lec3/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lfc3/i;->w:I

    .line 2
    iput-object p1, p0, Lfc3/i;->z:Lfc3/k;

    iput-object p2, p0, Lfc3/i;->E:Lec3/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lfc3/i;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lfc3/i;

    iget-object v1, p0, Lfc3/i;->z:Lfc3/k;

    iget-object v2, p0, Lfc3/i;->E:Lec3/m;

    invoke-direct {v0, v1, v2, p2}, Lfc3/i;-><init>(Lfc3/k;Lec3/m;Lq83/d;)V

    iput-object p1, v0, Lfc3/i;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance p1, Lfc3/i;

    iget-object v0, p0, Lfc3/i;->E:Lec3/m;

    iget-object v1, p0, Lfc3/i;->y:Ljava/lang/Object;

    iget-object v2, p0, Lfc3/i;->z:Lfc3/k;

    invoke-direct {p1, v2, v0, v1, p2}, Lfc3/i;-><init>(Lfc3/k;Lec3/m;Ljava/lang/Object;Lq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfc3/i;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lfc3/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfc3/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfc3/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lfc3/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfc3/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfc3/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lfc3/i;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfc3/i;->x:I

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

    iget-object p1, p0, Lfc3/i;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v3, p0, Lfc3/i;->z:Lfc3/k;

    iget-object v4, v3, Lfc3/g;->z:Lec3/l;

    new-instance v5, Landroidx/room/b2;

    iget-object v6, p0, Lfc3/i;->E:Lec3/m;

    invoke-direct {v5, v1, p1, v3, v6}, Landroidx/room/b2;-><init>(Lkotlin/jvm/internal/g0;Lbc3/c0;Lfc3/k;Lec3/m;)V

    iput v2, p0, Lfc3/i;->x:I

    invoke-interface {v4, v5, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfc3/i;->x:I

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

    iget-object p1, p0, Lfc3/i;->z:Lfc3/k;

    iget-object p1, p1, Lfc3/k;->E:Ls83/i;

    iget-object v1, p0, Lfc3/i;->y:Ljava/lang/Object;

    iput v2, p0, Lfc3/i;->x:I

    iget-object v2, p0, Lfc3/i;->E:Lec3/m;

    invoke-interface {p1, v2, v1, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

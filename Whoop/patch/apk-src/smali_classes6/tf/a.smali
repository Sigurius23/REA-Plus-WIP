.class public final Ltf/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ltf/d;

.field public final synthetic F:Luf/u;

.field public final synthetic G:Lkotlin/jvm/internal/e0;

.field public final synthetic H:Lyf/e;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lrg/h;


# direct methods
.method public constructor <init>(Lrg/h;Lq83/d;Ltf/d;Luf/u;Lkotlin/jvm/internal/e0;Lyf/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ltf/a;->w:I

    .line 1
    iput-object p1, p0, Ltf/a;->z:Lrg/h;

    iput-object p3, p0, Ltf/a;->E:Ltf/d;

    iput-object p4, p0, Ltf/a;->F:Luf/u;

    iput-object p5, p0, Ltf/a;->G:Lkotlin/jvm/internal/e0;

    iput-object p6, p0, Ltf/a;->H:Lyf/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lrg/h;Lq83/d;Ltf/d;Luf/u;Lyf/e;Lkotlin/jvm/internal/e0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltf/a;->w:I

    .line 2
    iput-object p1, p0, Ltf/a;->z:Lrg/h;

    iput-object p3, p0, Ltf/a;->E:Ltf/d;

    iput-object p4, p0, Ltf/a;->F:Luf/u;

    iput-object p5, p0, Ltf/a;->H:Lyf/e;

    iput-object p6, p0, Ltf/a;->G:Lkotlin/jvm/internal/e0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget v0, p0, Ltf/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Ltf/a;

    iget-object v6, p0, Ltf/a;->G:Lkotlin/jvm/internal/e0;

    iget-object v7, p0, Ltf/a;->H:Lyf/e;

    iget-object v2, p0, Ltf/a;->z:Lrg/h;

    iget-object v4, p0, Ltf/a;->E:Ltf/d;

    iget-object v5, p0, Ltf/a;->F:Luf/u;

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Ltf/a;-><init>(Lrg/h;Lq83/d;Ltf/d;Luf/u;Lkotlin/jvm/internal/e0;Lyf/e;)V

    iput-object p1, v1, Ltf/a;->y:Ljava/lang/Object;

    return-object v1

    :pswitch_0
    move-object v3, p2

    new-instance v2, Ltf/a;

    iget-object v7, p0, Ltf/a;->H:Lyf/e;

    iget-object v8, p0, Ltf/a;->G:Lkotlin/jvm/internal/e0;

    move-object v4, v3

    iget-object v3, p0, Ltf/a;->z:Lrg/h;

    iget-object v5, p0, Ltf/a;->E:Ltf/d;

    iget-object v6, p0, Ltf/a;->F:Luf/u;

    invoke-direct/range {v2 .. v8}, Ltf/a;-><init>(Lrg/h;Lq83/d;Ltf/d;Luf/u;Lyf/e;Lkotlin/jvm/internal/e0;)V

    iput-object p1, v2, Ltf/a;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ltf/a;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ltf/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ltf/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ltf/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ltf/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ltf/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ltf/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Ltf/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ltf/a;->F:Luf/u;

    iget-object v1, v0, Luf/u;->a:Ldg/a;

    iget-object v2, p0, Ltf/a;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Ltf/a;->x:I

    iget-object v5, p0, Ltf/a;->G:Lkotlin/jvm/internal/e0;

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    :cond_0
    move-object v3, p1

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ltf/a;->E:Ltf/d;

    iget-object v4, p1, Ltf/d;->a:Leg/o;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-class v8, Leg/o;

    invoke-virtual {v7, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v4, Lbf/c;->x:Lbf/c;

    invoke-static {v1, v4}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    goto :goto_0

    :cond_3
    const-class v8, Leg/f;

    invoke-virtual {v7, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, Lbf/c;->y:Lbf/c;

    invoke-static {v1, v4}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_4
    :goto_0
    iget v4, v5, Lkotlin/jvm/internal/e0;->w:I

    const/4 v8, 0x0

    if-le v4, v6, :cond_6

    invoke-interface {v2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v2

    new-instance v4, Lbg/j;

    const/16 v9, 0xd

    invoke-direct {v4, v5, v9}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    sget-object v9, Log/b;->z:Log/b;

    const-class v10, Ltf/d;

    invoke-virtual {v7, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-interface {v7}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-static {v2, v9, v7, v8, v4}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "log<T> cannot be used on an anonymous object"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    new-instance v2, Luf/u;

    iget-object v0, v0, Luf/u;->b:Ljava/lang/Object;

    check-cast v0, Lvg/d;

    invoke-interface {v0}, Lvg/d;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Luf/u;-><init>(Ldg/a;Ljava/lang/Object;)V

    iget v0, v5, Lkotlin/jvm/internal/e0;->w:I

    iput-object v8, p0, Ltf/a;->y:Ljava/lang/Object;

    iput v6, p0, Ltf/a;->x:I

    iget-object v1, p0, Ltf/a;->H:Lyf/e;

    invoke-static {p1, v2, v1, v0, p0}, Ltf/d;->b(Ltf/d;Luf/u;Lyf/e;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_0

    goto :goto_3

    :goto_2
    iget p1, v5, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr p1, v6

    iput p1, v5, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_3
    return-object v3

    :pswitch_0
    iget-object v0, p0, Ltf/a;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ltf/a;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_8

    if-ne v1, v2, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ltf/a;->G:Lkotlin/jvm/internal/e0;

    iget p1, p1, Lkotlin/jvm/internal/e0;->w:I

    const/4 v1, 0x0

    iput-object v1, p0, Ltf/a;->y:Ljava/lang/Object;

    iput v2, p0, Ltf/a;->x:I

    iget-object v1, p0, Ltf/a;->E:Ltf/d;

    iget-object v2, p0, Ltf/a;->F:Luf/u;

    iget-object v3, p0, Ltf/a;->H:Lyf/e;

    invoke-static {v1, v2, v3, p1, p0}, Ltf/d;->b(Ltf/d;Luf/u;Lyf/e;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_5

    :cond_9
    :goto_4
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_5
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

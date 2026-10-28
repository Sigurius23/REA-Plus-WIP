.class public final Lec3/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lec3/l;

.field public final synthetic y:Ll83/e;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V
    .locals 0

    .line 1
    iput p4, p0, Lec3/l1;->w:I

    iput-object p1, p0, Lec3/l1;->x:Lec3/l;

    iput-object p2, p0, Lec3/l1;->z:Ljava/lang/Object;

    iput-object p3, p0, Lec3/l1;->y:Ll83/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lec3/l1;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lec3/l1;->z:Ljava/lang/Object;

    iput-object p2, p0, Lec3/l1;->x:Lec3/l;

    iput-object p3, p0, Lec3/l1;->y:Ll83/e;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lec3/l1;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    iget-object v4, p0, Lec3/l1;->y:Ll83/e;

    iget-object v5, p0, Lec3/l1;->x:Lec3/l;

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    iget-object v7, p0, Lec3/l1;->z:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lc0/a0;

    check-cast v7, Landroidx/room/z0;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v7, v4, v1}, Lc0/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v5, v0, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    move-object v6, p1

    :cond_0
    return-object v6

    :pswitch_0
    check-cast v7, Lec3/l;

    new-array v0, v3, [Lec3/l;

    const/4 v3, 0x0

    aput-object v5, v0, v3

    aput-object v7, v0, v2

    new-instance v2, La63/j;

    check-cast v4, Lkotlin/jvm/functions/Function3;

    invoke-direct {v2, v4, v1}, La63/j;-><init>(Lkotlin/jvm/functions/Function3;Lq83/d;)V

    sget-object v1, Lec3/n1;->w:Lec3/n1;

    invoke-static {v1, p1, v2, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    move-object v6, p1

    :cond_1
    return-object v6

    :pswitch_1
    instance-of v0, p2, Lec3/k1;

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Lec3/k1;

    iget v4, v0, Lec3/k1;->x:I

    const/high16 v5, -0x80000000

    and-int v8, v4, v5

    if-eqz v8, :cond_2

    sub-int/2addr v4, v5

    iput v4, v0, Lec3/k1;->x:I

    goto :goto_0

    :cond_2
    new-instance v0, Lec3/k1;

    invoke-direct {v0, p0, p2}, Lec3/k1;-><init>(Lec3/l1;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/k1;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v0, Lec3/k1;->x:I

    if-eqz v5, :cond_5

    if-eq v5, v2, :cond_4

    if-ne v5, v3, :cond_3

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object p1, v0, Lec3/k1;->F:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lec3/k1;->E:Lec3/m;

    iget-object v5, v0, Lec3/k1;->z:Lec3/l1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p2

    iput-object v7, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object p0, v0, Lec3/k1;->z:Lec3/l1;

    iput-object p1, v0, Lec3/k1;->E:Lec3/m;

    iput-object p2, v0, Lec3/k1;->F:Lkotlin/jvm/internal/g0;

    iput v2, v0, Lec3/k1;->x:I

    invoke-interface {p1, v7, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    goto :goto_2

    :cond_6
    move-object v5, p0

    move-object v2, p1

    move-object p1, p2

    :goto_1
    iget-object p2, v5, Lec3/l1;->x:Lec3/l;

    new-instance v7, Lc0/a0;

    iget-object v5, v5, Lec3/l1;->y:Ll83/e;

    check-cast v5, Lkotlin/jvm/functions/Function3;

    const/4 v8, 0x4

    invoke-direct {v7, p1, v5, v2, v8}, Lc0/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v1, v0, Lec3/k1;->z:Lec3/l1;

    iput-object v1, v0, Lec3/k1;->E:Lec3/m;

    iput-object v1, v0, Lec3/k1;->F:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lec3/k1;->x:I

    invoke-interface {p2, v7, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_7

    :goto_2
    move-object v6, v4

    :cond_7
    :goto_3
    return-object v6

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

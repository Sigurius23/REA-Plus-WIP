.class public final Lxf/e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lgf/b;

.field public F:Ll83/h;

.field public G:[Ljava/lang/Object;

.field public H:Log/g;

.field public I:Lxf/c;

.field public J:I

.field public K:I

.field public L:I

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lrg/f;

.field public final synthetic z:Lve/g;


# direct methods
.method public constructor <init>(Lrg/f;Lq83/d;Lve/g;Lgf/b;)V
    .locals 0

    iput-object p1, p0, Lxf/e;->y:Lrg/f;

    iput-object p3, p0, Lxf/e;->z:Lve/g;

    iput-object p4, p0, Lxf/e;->E:Lgf/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Lxf/e;

    iget-object v1, p0, Lxf/e;->z:Lve/g;

    iget-object v2, p0, Lxf/e;->E:Lgf/b;

    iget-object v3, p0, Lxf/e;->y:Lrg/f;

    invoke-direct {v0, v3, p2, v1, v2}, Lxf/e;-><init>(Lrg/f;Lq83/d;Lve/g;Lgf/b;)V

    iput-object p1, v0, Lxf/e;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxf/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxf/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxf/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lxf/e;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lxf/e;->w:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget v0, p0, Lxf/e;->L:I

    iget v2, p0, Lxf/e;->K:I

    iget v5, p0, Lxf/e;->J:I

    iget-object v6, p0, Lxf/e;->I:Lxf/c;

    iget-object v7, p0, Lxf/e;->H:Log/g;

    iget-object v8, p0, Lxf/e;->G:[Ljava/lang/Object;

    check-cast v8, [Lxf/c;

    iget-object v9, p0, Lxf/e;->F:Ll83/h;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    const-class v0, Lve/g;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p1, v0}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p1

    new-instance v0, Lbg/j;

    const/16 v2, 0x14

    iget-object v5, p0, Lxf/e;->z:Lve/g;

    invoke-direct {v0, v5, v2}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iget-object v2, v5, Lve/g;->w:[Lxf/c;

    array-length v5, v2

    const/4 v6, 0x0

    move-object v7, p1

    move-object v9, v0

    move-object v8, v2

    move v0, v5

    move v2, v6

    move v5, v2

    :goto_0
    if-ge v2, v0, :cond_3

    aget-object v6, v8, v2

    new-instance p1, Lbg/j;

    const/16 v10, 0x13

    invoke-direct {p1, v6, v10}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v7, v4, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    :try_start_1
    iget-object p1, p0, Lxf/e;->E:Lgf/b;

    iput-object v4, p0, Lxf/e;->x:Ljava/lang/Object;

    iput-object v9, p0, Lxf/e;->F:Ll83/h;

    iput-object v8, p0, Lxf/e;->G:[Ljava/lang/Object;

    iput-object v7, p0, Lxf/e;->H:Log/g;

    iput-object v6, p0, Lxf/e;->I:Lxf/c;

    iput v5, p0, Lxf/e;->J:I

    iput v2, p0, Lxf/e;->K:I

    iput v0, p0, Lxf/e;->L:I

    iput v3, p0, Lxf/e;->w:I

    invoke-interface {v6, p1, p0}, Lxf/c;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_1
    const-string v10, "null cannot be cast to non-null type I of aws.smithy.kotlin.runtime.identity.IdentityProviderChain"

    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lxf/a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    new-instance v10, Lce/d;

    const/16 v11, 0x10

    invoke-direct {v10, v11, v6, p1}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v7, v4, v10}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Throwable;

    invoke-static {v6, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    add-int/2addr v2, v3

    goto :goto_0

    :cond_3
    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

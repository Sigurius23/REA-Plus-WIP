.class public final Leu/m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lup/c;

.field public final synthetic F:Lp1/o;

.field public final synthetic G:Leu/w;

.field public final synthetic H:I

.field public final synthetic I:Lp1/c1;

.field public final synthetic J:Lp1/c1;

.field public final synthetic K:Lp1/c1;

.field public final synthetic L:Lp1/c1;

.field public final synthetic M:Lp1/c1;

.field public final synthetic N:Lp1/c1;

.field public w:Ljava/lang/Object;

.field public x:Lup/c;

.field public y:Lx1/b;

.field public z:I


# direct methods
.method public constructor <init>(Lup/c;Lp1/o;Leu/w;ILp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Leu/m;->E:Lup/c;

    iput-object p2, p0, Leu/m;->F:Lp1/o;

    iput-object p3, p0, Leu/m;->G:Leu/w;

    iput p4, p0, Leu/m;->H:I

    iput-object p5, p0, Leu/m;->I:Lp1/c1;

    iput-object p6, p0, Leu/m;->J:Lp1/c1;

    iput-object p7, p0, Leu/m;->K:Lp1/c1;

    iput-object p8, p0, Leu/m;->L:Lp1/c1;

    iput-object p9, p0, Leu/m;->M:Lp1/c1;

    iput-object p10, p0, Leu/m;->N:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p11}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 12

    new-instance v0, Leu/m;

    iget-object v9, p0, Leu/m;->M:Lp1/c1;

    iget-object v10, p0, Leu/m;->N:Lp1/c1;

    iget-object v1, p0, Leu/m;->E:Lup/c;

    iget-object v2, p0, Leu/m;->F:Lp1/o;

    iget-object v3, p0, Leu/m;->G:Leu/w;

    iget v4, p0, Leu/m;->H:I

    iget-object v5, p0, Leu/m;->I:Lp1/c1;

    iget-object v6, p0, Leu/m;->J:Lp1/c1;

    iget-object v7, p0, Leu/m;->K:Lp1/c1;

    iget-object v8, p0, Leu/m;->L:Lp1/c1;

    move-object v11, p2

    invoke-direct/range {v0 .. v11}, Leu/m;-><init>(Lup/c;Lp1/o;Leu/w;ILp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Leu/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Leu/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Leu/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Leu/m;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Leu/m;->w:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp1/s;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_1
    iget-object v1, p0, Leu/m;->y:Lx1/b;

    iget-object v3, p0, Leu/m;->x:Lup/c;

    iget-object v4, p0, Leu/m;->w:Ljava/lang/Object;

    check-cast v4, Lp1/t;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v3

    move-object v3, p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v5, Leu/l;

    iget-object v6, p0, Leu/m;->G:Leu/w;

    iget v7, p0, Leu/m;->H:I

    iget-object v8, p0, Leu/m;->I:Lp1/c1;

    iget-object v9, p0, Leu/m;->J:Lp1/c1;

    iget-object v10, p0, Leu/m;->K:Lp1/c1;

    iget-object v11, p0, Leu/m;->L:Lp1/c1;

    iget-object v12, p0, Leu/m;->M:Lp1/c1;

    iget-object v13, p0, Leu/m;->N:Lp1/c1;

    invoke-direct/range {v5 .. v13}, Leu/l;-><init>(Leu/w;ILp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V

    new-instance v1, Lx1/b;

    const v4, 0x61d58b8

    invoke-direct {v1, v5, v3, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    iget-object v4, p0, Leu/m;->F:Lp1/o;

    iput-object v4, p0, Leu/m;->w:Ljava/lang/Object;

    iget-object v5, p0, Leu/m;->E:Lup/c;

    iput-object v5, p0, Leu/m;->x:Lup/c;

    iput-object v1, p0, Leu/m;->y:Lx1/b;

    iput v3, p0, Leu/m;->z:I

    new-instance v3, Lq83/l;

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v6

    invoke-direct {v3, v6}, Lq83/l;-><init>(Lq83/d;)V

    new-instance v6, Leu/t;

    invoke-direct {v6, v3}, Leu/t;-><init>(Lq83/l;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v7

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v8

    if-ne v7, v8, :cond_5

    iget-object v7, v5, Lup/c;->w:Lev/i;

    iget-object v8, v7, Lev/i;->a:Ljava/lang/Object;

    check-cast v8, Lq30/w0;

    if-eqz v8, :cond_3

    invoke-virtual {v8, v6}, Lq30/w0;->t(Leu/t;)V

    goto :goto_0

    :cond_3
    iget-object v7, v7, Lev/i;->i:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v3}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast v3, Lup/b;

    new-instance v6, Leu/v;

    invoke-direct {v6, v3, v5}, Leu/v;-><init>(Lup/b;Lup/c;)V

    new-instance v3, Lp1/w;

    invoke-direct {v3, v4, v6}, Lp1/w;-><init>(Lp1/t;Lhb3/a0;)V

    invoke-virtual {v3, v1}, Lp1/w;->A(Lc93/m;)V

    :try_start_1
    iput-object v3, p0, Leu/m;->w:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Leu/m;->x:Lup/c;

    iput-object v1, p0, Leu/m;->y:Lx1/b;

    iput v2, p0, Leu/m;->z:I

    invoke-static {p0}, Lbc3/m0;->a(Ls83/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, v3

    :goto_2
    invoke-interface {v1}, Lp1/s;->dispose()V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getMapAsync() must be called on the main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

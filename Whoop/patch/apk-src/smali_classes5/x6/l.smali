.class public final Lx6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/f;


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Lx31/a;

.field public final c:Lx6/s;

.field public final d:Lmc3/c;

.field public final e:Lx6/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lx31/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lx31/a;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v1, Landroidx/glance/session/SessionWorker;

    iput-object v1, p0, Lx6/l;->a:Ljava/lang/Class;

    iput-object v0, p0, Lx6/l;->b:Lx31/a;

    sget-object v0, Lx6/y;->a:Lx6/s;

    iput-object v0, p0, Lx6/l;->c:Lx6/s;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    iput-object v0, p0, Lx6/l;->d:Lmc3/c;

    new-instance v0, Lx6/k;

    invoke-direct {v0, p0}, Lx6/k;-><init>(Lx6/l;)V

    iput-object v0, p0, Lx6/l;->e:Lx6/k;

    return-void
.end method

.method public static b(Lx6/l;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lx6/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lx6/g;

    iget v1, v0, Lx6/g;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/g;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx6/g;

    invoke-direct {v0, p0, p2}, Lx6/g;-><init>(Lx6/l;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lx6/g;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx6/g;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lx6/g;->w:Ljava/lang/Object;

    check-cast p0, Lmc3/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lx6/g;->y:Lmc3/c;

    iget-object p1, v0, Lx6/g;->x:Ls83/i;

    check-cast p1, Lc93/m;

    iget-object v2, v0, Lx6/g;->w:Ljava/lang/Object;

    check-cast v2, Lx6/l;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p0

    move-object p0, v2

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lx6/l;->d:Lmc3/c;

    iput-object p0, v0, Lx6/g;->w:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ls83/i;

    iput-object v2, v0, Lx6/g;->x:Ls83/i;

    iput-object p2, v0, Lx6/g;->y:Lmc3/c;

    iput v4, v0, Lx6/g;->F:I

    invoke-virtual {p2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_1
    iget-object p0, p0, Lx6/l;->e:Lx6/k;

    iput-object p2, v0, Lx6/g;->w:Ljava/lang/Object;

    iput-object v5, v0, Lx6/g;->x:Ls83/i;

    iput-object v5, v0, Lx6/g;->y:Lmc3/c;

    iput v3, v0, Lx6/g;->F:I

    invoke-interface {p1, p0, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v6, p2

    move-object p2, p0

    move-object p0, v6

    :goto_3
    invoke-interface {p0, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p2

    :catchall_1
    move-exception p1

    move-object p0, p2

    :goto_4
    invoke-interface {p0, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method


# virtual methods
.method public final a(Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lx6/l;->b(Lx6/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

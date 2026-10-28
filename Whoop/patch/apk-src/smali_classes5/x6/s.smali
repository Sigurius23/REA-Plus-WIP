.class public final Lx6/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lux/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lux/f0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lux/f0;-><init>(I)V

    sput-object v0, Lx6/s;->a:Lux/f0;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lx6/x;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lx6/x;

    iget v1, v0, Lx6/x;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/x;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx6/x;

    invoke-direct {v0, p0, p3}, Lx6/x;-><init>(Lx6/s;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lx6/x;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx6/x;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object p1

    iget-object p3, p1, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    iget-object p1, p1, Ljc/v;->d:Lsc/a;

    const-string v2, "<this>"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "executor"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "name"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lr51/d;

    const/4 v4, 0x1

    invoke-direct {v2, p2, v4}, Lr51/d;-><init>(Ljava/lang/String;I)V

    check-cast p1, Lsc/b;

    iget-object p1, p1, Lsc/b;->a:Landroidx/room/u1;

    const-string p2, "getSerialTaskExecutor(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lqt2/e;

    const/16 v4, 0xd

    invoke-direct {p2, v4, v2, p3}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string p3, "loadStatusFuture"

    invoke-static {p1, p3, p2}, Lq83/g;->t(Landroidx/room/u1;Ljava/lang/String;Lc93/a;)Ld4/l;

    move-result-object p1

    iput v3, v0, Lx6/x;->y:I

    invoke-static {p1, v0}, Ltx/f;->x(Lds/v;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    move v0, p2

    :goto_2
    if-ge v0, p1, :cond_5

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lic/n0;

    sget-object v2, Lic/m0;->x:Lic/m0;

    sget-object v4, Lic/m0;->w:Lic/m0;

    filled-new-array {v2, v4}, [Lic/m0;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v1, v1, Lic/n0;->b:Lic/m0;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    move v3, p2

    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

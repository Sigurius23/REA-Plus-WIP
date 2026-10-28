.class final Ltk0/b$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltk0/b;->a(Ljava/util/Set;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ldc3/u;",
        "",
        "Ltk0/f;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ble.transport.scan.NordicPlatformScanner$scan$1"
    f = "NordicPlatformScanner.kt"
    l = {
        0x3e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic H:Ltk0/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ltk0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;",
            "Ltk0/b;",
            "Lq83/d<",
            "-",
            "Ltk0/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltk0/b$b;->G:Ljava/util/Set;

    iput-object p2, p0, Ltk0/b$b;->H:Ltk0/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Ltd3/b;Ltk0/b$b$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ltk0/b$b;->h(Ltd3/b;Ltk0/b$b$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ltd3/b;Ltk0/b$b$a;)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1}, Ltd3/b;->d(Ltd3/i;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltk0/b$b;

    iget-object v1, p0, Ltk0/b$b;->G:Ljava/util/Set;

    iget-object v2, p0, Ltk0/b$b;->H:Ltk0/b;

    invoke-direct {v0, v1, v2, p2}, Ltk0/b$b;-><init>(Ljava/util/Set;Ltk0/b;Lq83/d;)V

    iput-object p1, v0, Ltk0/b$b;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ltk0/b$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ltk0/b$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ltk0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ltk0/b$b;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    iget-object v0, v1, Ltk0/b$b;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ldc3/u;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, Ltk0/b$b;->E:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v0, v1, Ltk0/b$b;->z:Ljava/lang/Object;

    check-cast v0, Ltd3/n;

    iget-object v0, v1, Ltk0/b$b;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Ltk0/b$b;->x:Ljava/lang/Object;

    check-cast v0, Ltk0/b$b$a;

    iget-object v0, v1, Ltk0/b$b;->w:Ljava/lang/Object;

    check-cast v0, Ltd3/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Ltd3/b;->a()Ltd3/b;

    move-result-object v3

    new-instance v6, Ltk0/b$b$a;

    iget-object v7, v1, Ltk0/b$b;->H:Ltk0/b;

    invoke-direct {v6, v7, v2}, Ltk0/b$b$a;-><init>(Ltk0/b;Ldc3/u;)V

    iget-object v7, v1, Ltk0/b$b;->G:Ljava/util/Set;

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/UUID;

    new-instance v13, Landroid/os/ParcelUuid;

    invoke-direct {v13, v9}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    new-instance v10, Ltd3/k;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, -0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v10 .. v20}, Ltd3/k;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;[B[BI[B[B)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v7, v1, Ltk0/b$b;->H:Ltk0/b;

    invoke-virtual {v7}, Ltk0/b;->c()Ltd3/n;

    move-result-object v7

    :try_start_0
    invoke-virtual {v3, v8, v7, v6}, Ltd3/b;->b(Ljava/util/ArrayList;Ltd3/n;Ltd3/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v7, Ltk0/c;

    invoke-direct {v7, v3, v6}, Ltk0/c;-><init>(Ltd3/b;Ltk0/b$b$a;)V

    const/4 v3, 0x0

    iput-object v3, v1, Ltk0/b$b;->F:Ljava/lang/Object;

    iput-object v3, v1, Ltk0/b$b;->w:Ljava/lang/Object;

    iput-object v3, v1, Ltk0/b$b;->x:Ljava/lang/Object;

    iput-object v3, v1, Ltk0/b$b;->y:Ljava/lang/Object;

    iput-object v3, v1, Ltk0/b$b;->z:Ljava/lang/Object;

    iput v5, v1, Ltk0/b$b;->E:I

    invoke-static {v2, v7, v1}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    return-object v0

    :cond_3
    return-object v4

    :catch_0
    move-exception v0

    invoke-virtual {v3, v6}, Ltd3/b;->d(Ltd3/i;)V

    check-cast v2, Ldc3/t;

    invoke-virtual {v2, v0}, Ldc3/t;->r(Ljava/lang/Throwable;)Z

    return-object v4
.end method

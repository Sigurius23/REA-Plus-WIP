.class final Lln1/k$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lln1/k;->w(Ljava/util/List;Lz1/p;Lj31/k;Landroidx/compose/runtime/Composer;I)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.homecustomization.view.CustomizeOverviewScreenContentKt$SetupDragProtection$1$1"
    f = "CustomizeOverviewScreenContent.kt"
    l = {
        0xca
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic y:Lj31/k;

.field final synthetic z:Lz1/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/t2;Lj31/k;Lz1/p;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            "Lj31/k;",
            "Lz1/p;",
            "Lq83/d<",
            "-",
            "Lln1/k$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lln1/k$i;->x:Lp1/t2;

    iput-object p2, p0, Lln1/k$i;->y:Lj31/k;

    iput-object p3, p0, Lln1/k$i;->z:Lz1/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/t2;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lln1/k$i;->h(Lp1/t2;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lp1/t2;)Ljava/util/List;
    .locals 0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

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

    new-instance p1, Lln1/k$i;

    iget-object v0, p0, Lln1/k$i;->x:Lp1/t2;

    iget-object v1, p0, Lln1/k$i;->y:Lj31/k;

    iget-object v2, p0, Lln1/k$i;->z:Lz1/p;

    invoke-direct {p1, v0, v1, v2, p2}, Lln1/k$i;-><init>(Lp1/t2;Lj31/k;Lz1/p;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lln1/k$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lln1/k$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lln1/k$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lln1/k$i;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lln1/k$i;->w:I

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

    iget-object p1, p0, Lln1/k$i;->x:Lp1/t2;

    new-instance v1, Lln1/l;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lln1/l;-><init>(Lp1/t2;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lln1/k$i$a;

    iget-object v3, p0, Lln1/k$i;->y:Lj31/k;

    iget-object v4, p0, Lln1/k$i;->z:Lz1/p;

    invoke-direct {v1, v3, v4}, Lln1/k$i$a;-><init>(Lj31/k;Lz1/p;)V

    iput v2, p0, Lln1/k$i;->w:I

    invoke-virtual {p1, v1, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

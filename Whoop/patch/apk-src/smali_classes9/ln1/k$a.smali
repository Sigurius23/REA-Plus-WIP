.class final Lln1/k$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lln1/k;->k(Lj31/k;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.homecustomization.view.CustomizeOverviewScreenContentKt$HandleReorderingUX$1$1"
    f = "CustomizeOverviewScreenContent.kt"
    l = {
        0xe4
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lj31/k;

.field final synthetic z:Lq2/a;


# direct methods
.method public constructor <init>(Lj31/k;Lq2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj31/k;",
            "Lq2/a;",
            "Lq83/d<",
            "-",
            "Lln1/k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lln1/k$a;->y:Lj31/k;

    iput-object p2, p0, Lln1/k$a;->z:Lq2/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lj31/k;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lln1/k$a;->h(Lj31/k;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lj31/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lj31/m;->v()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lln1/k$a;

    iget-object v0, p0, Lln1/k$a;->y:Lj31/k;

    iget-object v1, p0, Lln1/k$a;->z:Lq2/a;

    invoke-direct {p1, v0, v1, p2}, Lln1/k$a;-><init>(Lj31/k;Lq2/a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lln1/k$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lln1/k$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lln1/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lln1/k$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lln1/k$a;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lln1/k$a;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p1

    iget-object v1, p0, Lln1/k$a;->y:Lj31/k;

    new-instance v3, Lln1/j;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lln1/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v1

    new-instance v3, Lln1/k$a$a;

    iget-object v4, p0, Lln1/k$a;->z:Lq2/a;

    invoke-direct {v3, p1, v4}, Lln1/k$a$a;-><init>(Lkotlin/jvm/internal/g0;Lq2/a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lln1/k$a;->w:Ljava/lang/Object;

    iput v2, p0, Lln1/k$a;->x:I

    invoke-virtual {v1, v3, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

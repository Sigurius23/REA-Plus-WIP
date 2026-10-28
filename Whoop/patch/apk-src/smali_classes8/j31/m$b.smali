.class final Lj31/m$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/m;->m(F)V
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
    c = "com.whoop.design.atomic.molecule.reordable.ReorderableState$autoscroll$1"
    f = "ReorderableState.kt"
    l = {
        0xae
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lj31/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj31/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:F


# direct methods
.method public constructor <init>(FLj31/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lj31/m<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Lj31/m$b;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lj31/m$b;->z:F

    iput-object p2, p0, Lj31/m$b;->E:Lj31/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/d0;Lj31/m;J)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lj31/m$b;->h(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/d0;Lj31/m;J)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/d0;Lj31/m;J)Ll83/a0;
    .locals 4

    iget-wide v0, p0, Lkotlin/jvm/internal/f0;->w:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iput-wide p3, p0, Lkotlin/jvm/internal/f0;->w:J

    goto :goto_0

    :cond_0
    sub-long/2addr p3, v0

    invoke-static {p2}, Lj31/m;->k(Lj31/m;)F

    move-result p0

    invoke-static {p2, p3, p4, p0}, Lj31/m;->g(Lj31/m;JF)F

    move-result p0

    iput p0, p1, Lkotlin/jvm/internal/d0;->w:F

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

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

    new-instance p1, Lj31/m$b;

    iget v0, p0, Lj31/m$b;->z:F

    iget-object v1, p0, Lj31/m$b;->E:Lj31/m;

    invoke-direct {p1, v0, v1, p2}, Lj31/m$b;-><init>(FLj31/m;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lj31/m$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj31/m$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj31/m$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj31/m$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj31/m$b;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lj31/m$b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/f0;

    iget-object v3, p0, Lj31/m$b;->w:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/d0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/d0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget v1, p0, Lj31/m$b;->z:F

    iput v1, p1, Lkotlin/jvm/internal/d0;->w:F

    new-instance v1, Lkotlin/jvm/internal/f0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object v3, p1

    :goto_0
    iget p1, v3, Lkotlin/jvm/internal/d0;->w:F

    const/4 v4, 0x0

    cmpg-float p1, p1, v4

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lj31/m$b;->E:Lj31/m;

    invoke-static {p1}, Lj31/m;->h(Lj31/m;)Lbc3/k1;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lbc3/k1;->isActive()Z

    move-result p1

    if-ne p1, v2, :cond_4

    iget-object p1, p0, Lj31/m$b;->E:Lj31/m;

    new-instance v4, Lj31/n;

    invoke-direct {v4, v1, v3, p1}, Lj31/n;-><init>(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/d0;Lj31/m;)V

    iput-object v3, p0, Lj31/m$b;->w:Ljava/lang/Object;

    iput-object v1, p0, Lj31/m$b;->x:Ljava/lang/Object;

    iput v2, p0, Lj31/m$b;->y:I

    invoke-static {v4, p0}, Lp1/x;->N(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    iget-object p1, p0, Lj31/m$b;->E:Lj31/m;

    invoke-virtual {p1}, Lj31/m;->H()Ldc3/l;

    move-result-object p1

    iget v4, v3, Lkotlin/jvm/internal/d0;->w:F

    new-instance v5, Ljava/lang/Float;

    invoke-direct {v5, v4}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {p1, v5}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

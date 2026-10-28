.class final Lbp0/s$r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbp0/s;->Q(Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$7$1"
    f = "GlobalCoachOverlay.kt"
    l = {
        0x14e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lzo0/c;

.field final synthetic F:Ldp0/g;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcp0/t;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lcp0/t;ZLzo0/c;Ldp0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp0/t;",
            "Z",
            "Lzo0/c;",
            "Ldp0/g;",
            "Lq83/d<",
            "-",
            "Lbp0/s$r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbp0/s$r;->y:Lcp0/t;

    iput-boolean p2, p0, Lbp0/s$r;->z:Z

    iput-object p3, p0, Lbp0/s$r;->E:Lzo0/c;

    iput-object p4, p0, Lbp0/s$r;->F:Ldp0/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lcp0/t;)Lcp0/l;
    .locals 0

    invoke-static {p0}, Lbp0/s$r;->h(Lcp0/t;)Lcp0/l;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lcp0/t;)Lcp0/l;
    .locals 0

    invoke-virtual {p0}, Lcp0/t;->g()Lcp0/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lbp0/s$r;

    iget-object v1, p0, Lbp0/s$r;->y:Lcp0/t;

    iget-boolean v2, p0, Lbp0/s$r;->z:Z

    iget-object v3, p0, Lbp0/s$r;->E:Lzo0/c;

    iget-object v4, p0, Lbp0/s$r;->F:Ldp0/g;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lbp0/s$r;-><init>(Lcp0/t;ZLzo0/c;Ldp0/g;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lbp0/s$r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbp0/s$r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbp0/s$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbp0/s$r;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbp0/s$r;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lbp0/s$r;->w:Ljava/lang/Object;

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

    move-result-object v5

    iget-object p1, p0, Lbp0/s$r;->y:Lcp0/t;

    invoke-virtual {p1}, Lcp0/t;->g()Lcp0/l;

    move-result-object p1

    iput-object p1, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lbp0/s$r;->y:Lcp0/t;

    new-instance v1, Lbp0/u;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lbp0/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v3, Lbp0/s$r$a;

    iget-boolean v4, p0, Lbp0/s$r;->z:Z

    iget-object v6, p0, Lbp0/s$r;->E:Lzo0/c;

    iget-object v7, p0, Lbp0/s$r;->y:Lcp0/t;

    iget-object v8, p0, Lbp0/s$r;->F:Ldp0/g;

    invoke-direct/range {v3 .. v8}, Lbp0/s$r$a;-><init>(ZLkotlin/jvm/internal/g0;Lzo0/c;Lcp0/t;Ldp0/g;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lbp0/s$r;->w:Ljava/lang/Object;

    iput v2, p0, Lbp0/s$r;->x:I

    invoke-interface {p1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

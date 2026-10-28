.class final Lbp0/s$e;
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
    c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$17$1$3$1$1"
    f = "GlobalCoachOverlay.kt"
    l = {
        0x24c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldp0/g;

.field w:I

.field final synthetic x:Lcp0/t;

.field final synthetic y:Z

.field final synthetic z:Lep0/j;


# direct methods
.method public constructor <init>(Lcp0/t;ZLep0/j;Ldp0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp0/t;",
            "Z",
            "Lep0/j;",
            "Ldp0/g;",
            "Lq83/d<",
            "-",
            "Lbp0/s$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbp0/s$e;->x:Lcp0/t;

    iput-boolean p2, p0, Lbp0/s$e;->y:Z

    iput-object p3, p0, Lbp0/s$e;->z:Lep0/j;

    iput-object p4, p0, Lbp0/s$e;->E:Ldp0/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Ldp0/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbp0/s$e;->h(Ldp0/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ldp0/g;)Ll83/a0;
    .locals 7

    const/4 v5, 0x7

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Ldp0/g;->f(Ldp0/g;JLjava/lang/String;Lep0/j;ILjava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

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

    new-instance v0, Lbp0/s$e;

    iget-object v1, p0, Lbp0/s$e;->x:Lcp0/t;

    iget-boolean v2, p0, Lbp0/s$e;->y:Z

    iget-object v3, p0, Lbp0/s$e;->z:Lep0/j;

    iget-object v4, p0, Lbp0/s$e;->E:Ldp0/g;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lbp0/s$e;-><init>(Lcp0/t;ZLep0/j;Ldp0/g;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lbp0/s$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbp0/s$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbp0/s$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbp0/s$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbp0/s$e;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbp0/s$e;->x:Lcp0/t;

    iget-boolean v1, p0, Lbp0/s$e;->y:Z

    iget-object v3, p0, Lbp0/s$e;->z:Lep0/j;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lep0/j;->g()Lcom/whoop/navigation/DrawerPresentation;

    move-result-object v3

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lbp0/s$e;->E:Ldp0/g;

    new-instance v5, Lbp0/t;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Lbp0/t;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lbp0/s$e;->w:I

    invoke-virtual {p1, v1, v3, v5, p0}, Lcp0/t;->h(ZLcom/whoop/navigation/DrawerPresentation;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

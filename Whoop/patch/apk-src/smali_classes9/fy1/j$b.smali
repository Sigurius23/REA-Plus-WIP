.class final Lfy1/j$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfy1/j;->d(Lfy1/k;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.metrics.common.ScreenStateObserverKt$ObserveScreenState$3$1"
    f = "ScreenStateObserver.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:J

.field final synthetic G:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic H:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic I:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lcom/whoop/metrics/common/ScreenState;

.field final synthetic z:Lfy1/l;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;Lfy1/l;ZJLc93/a;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/metrics/common/ScreenState;",
            "Lfy1/l;",
            "ZJ",
            "Lc93/a;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lfy1/j$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfy1/j$b;->x:Ljava/lang/String;

    iput-object p2, p0, Lfy1/j$b;->y:Lcom/whoop/metrics/common/ScreenState;

    iput-object p3, p0, Lfy1/j$b;->z:Lfy1/l;

    iput-boolean p4, p0, Lfy1/j$b;->E:Z

    iput-wide p5, p0, Lfy1/j$b;->F:J

    iput-object p7, p0, Lfy1/j$b;->G:Lc93/a;

    iput-object p8, p0, Lfy1/j$b;->H:Lp1/c1;

    iput-object p9, p0, Lfy1/j$b;->I:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11
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

    new-instance v0, Lfy1/j$b;

    iget-object v1, p0, Lfy1/j$b;->x:Ljava/lang/String;

    iget-object v2, p0, Lfy1/j$b;->y:Lcom/whoop/metrics/common/ScreenState;

    iget-object v3, p0, Lfy1/j$b;->z:Lfy1/l;

    iget-boolean v4, p0, Lfy1/j$b;->E:Z

    iget-wide v5, p0, Lfy1/j$b;->F:J

    iget-object v7, p0, Lfy1/j$b;->G:Lc93/a;

    iget-object v8, p0, Lfy1/j$b;->H:Lp1/c1;

    iget-object v9, p0, Lfy1/j$b;->I:Lp1/c1;

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lfy1/j$b;-><init>(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;Lfy1/l;ZJLc93/a;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lfy1/j$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfy1/j$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfy1/j$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfy1/j$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lfy1/j$b;->w:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfy1/j$b;->x:Ljava/lang/String;

    iget-object v0, p0, Lfy1/j$b;->y:Lcom/whoop/metrics/common/ScreenState;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lfy1/j$b;->H:Lp1/c1;

    invoke-static {p1}, Lfy1/j;->m(Lp1/c1;)Ll83/k;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lfy1/j$b;->z:Lfy1/l;

    iget-object v0, p0, Lfy1/j$b;->x:Ljava/lang/String;

    iget-object v2, p0, Lfy1/j$b;->y:Lcom/whoop/metrics/common/ScreenState;

    invoke-interface {p1, v0, v2}, Lfy1/l;->a(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;)V

    iget-object p1, p0, Lfy1/j$b;->H:Lp1/c1;

    invoke-static {p1, v1}, Lfy1/j;->n(Lp1/c1;Ll83/k;)V

    :cond_0
    iget-boolean p1, p0, Lfy1/j$b;->E:Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    sget-object v1, Lfy1/e;->a:Lfy1/e;

    iget-wide v2, p0, Lfy1/j$b;->F:J

    iget-object p1, p0, Lfy1/j$b;->I:Lp1/c1;

    invoke-static {p1}, Lfy1/j;->k(Lp1/c1;)Z

    move-result v4

    iget-object v5, p0, Lfy1/j$b;->y:Lcom/whoop/metrics/common/ScreenState;

    iget-object p1, p0, Lfy1/j$b;->G:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lfy1/e;->a(JZLcom/whoop/metrics/common/ScreenState;J)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lfy1/j$b;->I:Lp1/c1;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lfy1/j;->l(Lp1/c1;Z)V

    iget-object v1, p0, Lfy1/j$b;->z:Lfy1/l;

    iget-object v2, p0, Lfy1/j$b;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Lfy1/l;->b(Ljava/lang/String;J)V

    :cond_2
    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.class final Lxq2/b0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxq2/b0;->j(Landroidx/compose/ui/Modifier;Lxq2/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.TimeCapsuleItemKt$TimeCapsuleItemScreen$1$1"
    f = "TimeCapsuleItem.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lxq2/b0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxq2/b0$a;->x:Ljava/lang/String;

    iput-object p2, p0, Lxq2/b0$a;->y:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance p1, Lxq2/b0$a;

    iget-object v0, p0, Lxq2/b0$a;->x:Ljava/lang/String;

    iget-object v1, p0, Lxq2/b0$a;->y:Lp1/c1;

    invoke-direct {p1, v0, v1, p2}, Lxq2/b0$a;-><init>(Ljava/lang/String;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lxq2/b0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxq2/b0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxq2/b0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxq2/b0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lxq2/b0$a;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lxq2/b0$a;->y:Lp1/c1;

    invoke-static {p1}, Lxq2/b0;->v(Lp1/c1;)Lq3/y;

    move-result-object p1

    iget-object p1, p1, Lq3/y;->a:Ll3/g;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    iget-object v0, p0, Lxq2/b0$a;->x:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lxq2/b0$a;->y:Lp1/c1;

    iget-object v0, p0, Lxq2/b0$a;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lq3/y;

    iget-object v1, p0, Lxq2/b0$a;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2, v2}, Lj93/l0;->f(II)J

    move-result-wide v2

    const/4 v4, 0x4

    invoke-direct {v0, v4, v1, v2, v3}, Lq3/y;-><init>(ILjava/lang/String;J)V

    goto :goto_0

    :cond_0
    new-instance v0, Lq3/y;

    iget-object v1, p0, Lxq2/b0$a;->x:Ljava/lang/String;

    const-wide/16 v2, 0x0

    const/4 v4, 0x6

    invoke-direct {v0, v4, v1, v2, v3}, Lq3/y;-><init>(ILjava/lang/String;J)V

    :goto_0
    invoke-static {p1, v0}, Lxq2/b0;->w(Lp1/c1;Lq3/y;)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

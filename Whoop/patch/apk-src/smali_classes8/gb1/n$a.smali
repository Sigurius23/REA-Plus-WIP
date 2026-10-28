.class final Lgb1/n$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb1/n;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
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
    c = "com.whoop.design.modifier.KeyboardModifiersKt$centerAboveKeyboard$1$1"
    f = "KeyboardModifiers.kt"
    l = {
        0x26
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lr0/a;

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:I

.field w:Ljava/lang/Object;

.field x:I

.field y:F

.field z:I


# direct methods
.method public constructor <init>(Lr0/a;Lp1/c1;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/a;",
            "Lp1/c1;",
            "I",
            "Lq83/d<",
            "-",
            "Lgb1/n$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgb1/n$a;->E:Lr0/a;

    iput-object p2, p0, Lgb1/n$a;->F:Lp1/c1;

    iput p3, p0, Lgb1/n$a;->G:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance p1, Lgb1/n$a;

    iget-object v0, p0, Lgb1/n$a;->E:Lr0/a;

    iget-object v1, p0, Lgb1/n$a;->F:Lp1/c1;

    iget v2, p0, Lgb1/n$a;->G:I

    invoke-direct {p1, v0, v1, v2, p2}, Lgb1/n$a;-><init>(Lr0/a;Lp1/c1;ILq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lgb1/n$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgb1/n$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgb1/n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgb1/n$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lgb1/n$a;->z:I

    const/4 v2, 0x1

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lgb1/n$a;->w:Ljava/lang/Object;

    check-cast v0, Ly2/y;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgb1/n$a;->F:Lp1/c1;

    invoke-static {p1}, Lgb1/n;->b(Lp1/c1;)Ly2/y;

    move-result-object p1

    if-eqz p1, :cond_4

    iget v1, p0, Lgb1/n$a;->G:I

    const/4 v4, 0x0

    if-lez v1, :cond_2

    invoke-interface {p1}, Ly2/y;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v4

    :goto_0
    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lgb1/n;->c(Ly2/y;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v5

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v5, v5

    sub-int/2addr v5, v1

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    iget-object v6, p0, Lgb1/n$a;->E:Lr0/a;

    new-instance v7, Lh2/c;

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v8

    const/16 p1, 0x20

    shr-long/2addr v8, p1

    long-to-int p1, v8

    int-to-float p1, p1

    int-to-float v8, v1

    add-float/2addr v8, v5

    const/4 v9, 0x0

    invoke-direct {v7, v9, v5, p1, v8}, Lh2/c;-><init>(FFFF)V

    iput-object v4, p0, Lgb1/n$a;->w:Ljava/lang/Object;

    iput v1, p0, Lgb1/n$a;->x:I

    iput v5, p0, Lgb1/n$a;->y:F

    iput v2, p0, Lgb1/n$a;->z:I

    check-cast v6, Lr0/c;

    invoke-virtual {v6, v7, p0}, Lr0/c;->b(Lh2/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    return-object v3
.end method

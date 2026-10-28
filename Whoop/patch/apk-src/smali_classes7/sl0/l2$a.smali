.class final Lsl0/l2$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/l2;->u(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lbf3/b;ZZZLiz0/m;Lzk0/i0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.MarkdownKt$Markdown$2$1"
    f = "Markdown.kt"
    l = {
        0x6f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
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

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            "Z",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lsl0/l2$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/l2$a;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lsl0/l2$a;->z:Ljava/lang/String;

    iput-boolean p3, p0, Lsl0/l2$a;->E:Z

    iput-object p4, p0, Lsl0/l2$a;->F:Lp1/c1;

    iput-object p5, p0, Lsl0/l2$a;->G:Lp1/c1;

    iput-object p6, p0, Lsl0/l2$a;->H:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lsl0/l2$a;

    iget-object v1, p0, Lsl0/l2$a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lsl0/l2$a;->z:Ljava/lang/String;

    iget-boolean v3, p0, Lsl0/l2$a;->E:Z

    iget-object v4, p0, Lsl0/l2$a;->F:Lp1/c1;

    iget-object v5, p0, Lsl0/l2$a;->G:Lp1/c1;

    iget-object v6, p0, Lsl0/l2$a;->H:Lp1/c1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lsl0/l2$a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/l2$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/l2$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/l2$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/l2$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/l2$a;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lsl0/l2$a;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/l2$a;->F:Lp1/c1;

    invoke-static {p1}, Lsl0/l2;->b0(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lsl0/l2$a;->y:Lkotlin/jvm/functions/Function1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lsl0/l2$a;->z:Ljava/lang/String;

    const-string v1, " "

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x6

    invoke-static {p1, v1, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    move-object v1, p1

    :cond_2
    :goto_0
    iget-object p1, p0, Lsl0/l2$a;->G:Lp1/c1;

    invoke-static {p1}, Lsl0/l2;->c0(Lp1/c1;)I

    move-result p1

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    if-ge p1, v3, :cond_3

    iget-object p1, p0, Lsl0/l2$a;->H:Lp1/c1;

    iget-object v3, p0, Lsl0/l2$a;->G:Lp1/c1;

    invoke-static {v3}, Lsl0/l2;->c0(Lp1/c1;)I

    move-result v3

    add-int/2addr v3, v2

    const/4 v4, 0x0

    invoke-interface {v1, v4, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const-string v5, " "

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lsl0/l2;->f0(Lp1/c1;Ljava/lang/String;)V

    iget-object p1, p0, Lsl0/l2$a;->G:Lp1/c1;

    invoke-static {p1}, Lsl0/l2;->c0(Lp1/c1;)I

    move-result v3

    add-int/2addr v3, v2

    invoke-static {p1, v3}, Lsl0/l2;->d0(Lp1/c1;I)V

    iput-object v1, p0, Lsl0/l2$a;->w:Ljava/lang/Object;

    iput v2, p0, Lsl0/l2$a;->x:I

    const-wide/16 v3, 0xa

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_3
    iget-object p1, p0, Lsl0/l2$a;->H:Lp1/c1;

    invoke-static {p1}, Lsl0/l2;->e0(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lsl0/l2$a;->z:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lsl0/l2$a;->E:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lsl0/l2$a;->y:Lkotlin/jvm/functions/Function1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

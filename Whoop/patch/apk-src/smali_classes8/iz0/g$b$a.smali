.class final Liz0/g$b$a;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liz0/g$b;->invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/h;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu2/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lu2/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.atom.markdown.MarkdownKt$detectAnnotatedTextTap$1$1"
    f = "Markdown.kt"
    l = {
        0x2bd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic F:Ll3/g;

.field final synthetic G:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLc93/a;Ll3/g;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc93/a;",
            "Ll3/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Liz0/g$b$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Liz0/g$b$a;->z:Z

    iput-object p2, p0, Liz0/g$b$a;->E:Lc93/a;

    iput-object p3, p0, Liz0/g$b$a;->F:Ll3/g;

    iput-object p4, p0, Liz0/g$b$a;->G:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/h;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Liz0/g$b$a;

    iget-boolean v1, p0, Liz0/g$b$a;->z:Z

    iget-object v2, p0, Liz0/g$b$a;->E:Lc93/a;

    iget-object v3, p0, Liz0/g$b$a;->F:Ll3/g;

    iget-object v4, p0, Liz0/g$b$a;->G:Lkotlin/jvm/functions/Function1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Liz0/g$b$a;-><init>(ZLc93/a;Ll3/g;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Liz0/g$b$a;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lu2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Liz0/g$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liz0/g$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liz0/g$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liz0/g$b$a;->f(Lu2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Liz0/g$b$a;->y:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Liz0/g$b$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    iput-object v0, p0, Liz0/g$b$a;->y:Ljava/lang/Object;

    iput v3, p0, Liz0/g$b$a;->x:I

    invoke-static {v0, p0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lu2/k;

    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lu2/r;

    invoke-static {v4}, Lu2/d0;->d(Lu2/r;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    check-cast v2, Lu2/r;

    if-eqz v2, :cond_2

    iget-wide v4, v2, Lu2/r;->c:J

    iget-boolean p1, p0, Liz0/g$b$a;->z:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, Liz0/g$b$a;->E:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll3/r0;

    if-eqz p1, :cond_9

    iget-object p1, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p1, v4, v5}, Ll3/w;->g(J)I

    move-result p1

    iget-object v6, p0, Liz0/g$b$a;->F:Ll3/g;

    invoke-virtual {v6, p1, p1}, Ll3/g;->b(II)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v6, p1, Ljava/util/Collection;

    if-eqz v6, :cond_6

    move-object v6, p1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll3/e;

    iget-object v7, v6, Ll3/e;->d:Ljava/lang/String;

    const-string v8, "url"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    iget-object v6, v6, Ll3/e;->d:Ljava/lang/String;

    const-string v7, "email"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    :cond_8
    invoke-virtual {v2}, Lu2/r;->a()V

    :cond_9
    :goto_3
    iget-object p1, p0, Liz0/g$b$a;->G:Lkotlin/jvm/functions/Function1;

    new-instance v2, Lh2/b;

    invoke-direct {v2, v4, v5}, Lh2/b;-><init>(J)V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0
.end method

.class final Ln72/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln72/d;->f(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln72/d$a;",
        "accumulation",
        "Ld72/b;",
        "domainResult",
        "<anonymous>",
        "(Ln72/d$a;Ld72/b;)Ln72/d$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sage.presentation.reducers.SageViewStateReducer$reduce$1"
    f = "SageViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ln72/d;


# direct methods
.method public constructor <init>(Ln72/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln72/d;",
            "Lq83/d<",
            "-",
            "Ln72/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ln72/d$c;->z:Ln72/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ln72/d$a;Ld72/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln72/d$a;",
            "Ld72/b;",
            "Lq83/d<",
            "-",
            "Ln72/d$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ln72/d$c;

    iget-object v1, p0, Ln72/d$c;->z:Ln72/d;

    invoke-direct {v0, v1, p3}, Ln72/d$c;-><init>(Ln72/d;Lq83/d;)V

    iput-object p1, v0, Ln72/d$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Ln72/d$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ln72/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln72/d$a;

    check-cast p2, Ld72/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ln72/d$c;->f(Ln72/d$a;Ld72/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Ln72/d$c;->x:Ljava/lang/Object;

    check-cast v0, Ln72/d$a;

    iget-object v1, p0, Ln72/d$c;->y:Ljava/lang/Object;

    check-cast v1, Ld72/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ln72/d$c;->w:I

    if-nez v2, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Ld72/b$c;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    sget-object p1, Lm72/g$a;->b:Lm72/g$a;

    invoke-static {v0, p1, v3, v2, v4}, Ln72/d$a;->b(Ln72/d$a;Lm72/g;ZILjava/lang/Object;)Ln72/d$a;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Ld72/b$f;

    if-eqz p1, :cond_1

    iget-object p1, p0, Ln72/d$c;->z:Ln72/d;

    check-cast v1, Ld72/b$f;

    invoke-virtual {v1}, Ld72/b$f;->a()Lcom/whoop/sage/domain/models/SageResponse;

    move-result-object v1

    invoke-static {p1, v1, v0}, Ln72/d;->a(Ln72/d;Lcom/whoop/sage/domain/models/SageResponse;Ln72/d$a;)Ln72/d$a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v1, Ld72/b$d;

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    invoke-static {v0, v4, p1, p1, v4}, Ln72/d$a;->b(Ln72/d$a;Lm72/g;ZILjava/lang/Object;)Ln72/d$a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v1, Ld72/b$e;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    instance-of p1, v1, Ld72/b$a;

    if-eqz p1, :cond_4

    iget-object p1, p0, Ln72/d$c;->z:Ln72/d;

    check-cast v1, Ld72/b$a;

    invoke-virtual {v1}, Ld72/b$a;->a()Lcom/whoop/sage/domain/models/SageResponse;

    move-result-object v1

    invoke-static {p1, v1, v0}, Ln72/d;->a(Ln72/d;Lcom/whoop/sage/domain/models/SageResponse;Ln72/d$a;)Ln72/d$a;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v1, Ld72/b$b;

    if-eqz p1, :cond_8

    invoke-virtual {v0}, Ln72/d$a;->d()Lm72/g;

    move-result-object p1

    instance-of v5, p1, Lm72/g$c;

    if-eqz v5, :cond_5

    check-cast p1, Lm72/g$c;

    goto :goto_0

    :cond_5
    move-object p1, v4

    :goto_0
    if-eqz p1, :cond_7

    iget-object v5, p0, Ln72/d$c;->z:Ln72/d;

    check-cast v1, Ld72/b$b;

    invoke-virtual {v1}, Ld72/b$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, p1, v1}, Ln72/d;->b(Ln72/d;Lm72/g$c;Ljava/lang/String;)Lm72/g$c;

    move-result-object p1

    invoke-static {v0, p1, v3, v2, v4}, Ln72/d$a;->b(Ln72/d$a;Lm72/g;ZILjava/lang/Object;)Ln72/d$a;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    return-object p1

    :cond_7
    :goto_1
    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

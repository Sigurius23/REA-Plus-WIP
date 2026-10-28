.class final Ly72/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly72/d;->c(Lec3/l;)Lec3/l;
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
        "Ly72/c;",
        "accumulation",
        "Lt72/e;",
        "result",
        "<anonymous>",
        "(Ly72/c;Lt72/e;)Ly72/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sanguine.presentation.reducers.SanguineWaitlistViewStateReducer$reduce$1"
    f = "SanguineWaitlistViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ly72/d;


# direct methods
.method public constructor <init>(Ly72/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly72/d;",
            "Lq83/d<",
            "-",
            "Ly72/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly72/d$b;->z:Ly72/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ly72/c;Lt72/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly72/c;",
            "Lt72/e;",
            "Lq83/d<",
            "-",
            "Ly72/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ly72/d$b;

    iget-object v1, p0, Ly72/d$b;->z:Ly72/d;

    invoke-direct {v0, v1, p3}, Ly72/d$b;-><init>(Ly72/d;Lq83/d;)V

    iput-object p1, v0, Ly72/d$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Ly72/d$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ly72/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly72/c;

    check-cast p2, Lt72/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ly72/d$b;->f(Ly72/c;Lt72/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Ly72/d$b;->x:Ljava/lang/Object;

    check-cast v0, Ly72/c;

    iget-object v1, p0, Ly72/d$b;->y:Ljava/lang/Object;

    check-cast v1, Lt72/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ly72/d$b;->w:I

    if-nez v2, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly72/c;->a()Lw72/g;

    move-result-object p1

    instance-of v0, p1, Lw72/g$c;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw72/g$c;

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    instance-of v0, v1, Lt72/e$a;

    if-eqz v0, :cond_1

    sget-object p1, Lw72/g$a;->b:Lw72/g$a;

    goto/16 :goto_2

    :cond_1
    instance-of v0, v1, Lt72/e$f;

    if-eqz v0, :cond_3

    iget-object p1, p0, Ly72/d$b;->z:Ly72/d;

    check-cast v1, Lt72/e$f;

    invoke-virtual {v1}, Lt72/e$f;->a()Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;

    move-result-object v0

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lw72/g$c;->i()Lsz0/p0;

    move-result-object v2

    :cond_2
    invoke-static {p1, v0, v2}, Ly72/d;->a(Ly72/d;Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lsz0/p0;)Lw72/g$c;

    move-result-object p1

    goto/16 :goto_2

    :cond_3
    sget-object v0, Lt72/e$e;->a:Lt72/e$e;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz v3, :cond_8

    sget-object v9, Lsz0/p0$f;->e:Lsz0/p0$f;

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lw72/g$c;->c(Lw72/g$c;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lw72/a;Lsz0/p0;ILjava/lang/Object;)Lw72/g$c;

    move-result-object v0

    if-eqz v0, :cond_8

    :goto_1
    move-object p1, v0

    goto :goto_2

    :cond_4
    instance-of v0, v1, Lt72/e$d;

    if-eqz v0, :cond_5

    iget-object p1, p0, Ly72/d$b;->z:Ly72/d;

    check-cast v1, Lt72/e$d;

    invoke-virtual {v1}, Lt72/e$d;->a()Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;

    move-result-object v0

    new-instance v1, Lsz0/p0$h;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v0, v1}, Ly72/d;->a(Ly72/d;Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lsz0/p0;)Lw72/g$c;

    move-result-object p1

    goto :goto_2

    :cond_5
    sget-object v0, Lt72/e$b;->a:Lt72/e$b;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz v3, :cond_6

    new-instance v4, Lsz0/p0$b;

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget p1, Luv0/c;->H:I

    const/4 v0, 0x2

    invoke-direct {v5, p1, v2, v0, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x1f

    const/4 v11, 0x0

    move-object v9, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lw72/g$c;->c(Lw72/g$c;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lw72/a;Lsz0/p0;ILjava/lang/Object;)Lw72/g$c;

    move-result-object p1

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    sget-object p1, Lw72/g$a;->b:Lw72/g$a;

    goto :goto_2

    :cond_7
    sget-object v0, Lt72/e$c;->a:Lt72/e$c;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz v3, :cond_8

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lw72/g$c;->c(Lw72/g$c;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lw72/a;Lsz0/p0;ILjava/lang/Object;)Lw72/g$c;

    move-result-object v0

    if-eqz v0, :cond_8

    goto :goto_1

    :cond_8
    :goto_2
    new-instance v0, Ly72/c;

    invoke-direct {v0, p1}, Ly72/c;-><init>(Lw72/g;)V

    return-object v0

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

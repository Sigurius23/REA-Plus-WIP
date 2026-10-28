.class final Lzu2/d$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzu2/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lzu2/c;",
        "<anonymous>",
        "(Lbc3/c0;)Lzu2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.builder.name.domain.InputWorkoutNameInteractor$fetchWorkoutTemplateAndUpdate$2$1"
    f = "InputWorkoutNameInteractor.kt"
    l = {
        0x4f,
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lzu2/d;

.field final synthetic y:J

.field final synthetic z:Lzu2/c;


# direct methods
.method public constructor <init>(Lzu2/d;JLzu2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzu2/d;",
            "J",
            "Lzu2/c;",
            "Lq83/d<",
            "-",
            "Lzu2/d$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzu2/d$a$a;->x:Lzu2/d;

    iput-wide p2, p0, Lzu2/d$a$a;->y:J

    iput-object p4, p0, Lzu2/d$a$a;->z:Lzu2/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lzu2/d$a$a;

    iget-object v1, p0, Lzu2/d$a$a;->x:Lzu2/d;

    iget-wide v2, p0, Lzu2/d$a$a;->y:J

    iget-object v4, p0, Lzu2/d$a$a;->z:Lzu2/c;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lzu2/d$a$a;-><init>(Lzu2/d;JLzu2/c;Lq83/d;)V

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
            "Lzu2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lzu2/d$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzu2/d$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzu2/d$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzu2/d$a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lzu2/d$a$a;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v4

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lzu2/d$a$a;->x:Lzu2/d;

    invoke-static {v1}, Lzu2/d;->b(Lzu2/d;)Ltr2/n;

    move-result-object v5

    iget-object v1, p0, Lzu2/d$a$a;->x:Lzu2/d;

    invoke-static {v1}, Lzu2/d;->a(Lzu2/d;)Lrr2/c;

    move-result-object v6

    iget-wide v7, p0, Lzu2/d$a$a;->y:J

    const-string v1, "failed to fetch workout template "

    invoke-static {v7, v8, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lzu2/d$a$a$a;

    iget-object v1, p0, Lzu2/d$a$a;->x:Lzu2/d;

    iget-wide v9, p0, Lzu2/d$a$a;->y:J

    invoke-direct {v8, v1, v9, v10, v2}, Lzu2/d$a$a$a;-><init>(Lzu2/d;JLq83/d;)V

    iput p1, p0, Lzu2/d$a$a;->w:I

    move-object v9, p0

    invoke-virtual/range {v4 .. v9}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v4, p1

    check-cast v4, Lu02/a;

    iget-object p1, v9, Lzu2/d$a$a;->x:Lzu2/d;

    invoke-static {p1}, Lzu2/d;->b(Lzu2/d;)Ltr2/n;

    move-result-object v5

    iget-object p1, v9, Lzu2/d$a$a;->x:Lzu2/d;

    invoke-static {p1}, Lzu2/d;->a(Lzu2/d;)Lrr2/c;

    move-result-object v6

    iget-wide v7, v9, Lzu2/d$a$a;->y:J

    const-string p1, "failed to update workout template "

    invoke-static {v7, v8, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lzu2/d$a$a$b;

    iget-object p1, v9, Lzu2/d$a$a;->x:Lzu2/d;

    iget-wide v10, v9, Lzu2/d$a$a;->y:J

    invoke-direct {v8, p1, v10, v11, v2}, Lzu2/d$a$a$b;-><init>(Lzu2/d;JLq83/d;)V

    iput v3, v9, Lzu2/d$a$a;->w:I

    invoke-static/range {v4 .. v9}, Lu02/b;->a(Lu02/a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_5

    iget-object v1, v9, Lzu2/d$a$a;->z:Lzu2/c;

    sget-object v4, Lzu2/a$d;->a:Lzu2/a$d;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lzu2/c;->c(Lzu2/c;Ljava/lang/String;Lzu2/f;Lzu2/a;ILjava/lang/Object;)Lzu2/c;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of v0, p1, Lu02/a$b$b;

    if-eqz v0, :cond_6

    iget-object v1, v9, Lzu2/d$a$a;->z:Lzu2/c;

    sget-object v4, Lzu2/a$b;->a:Lzu2/a$b;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lzu2/c;->c(Lzu2/c;Ljava/lang/String;Lzu2/f;Lzu2/a;ILjava/lang/Object;)Lzu2/c;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_7

    iget-object v0, v9, Lzu2/d$a$a;->z:Lzu2/c;

    sget-object v3, Lzu2/a$c;->a:Lzu2/a$c;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lzu2/c;->c(Lzu2/c;Ljava/lang/String;Lzu2/f;Lzu2/a;ILjava/lang/Object;)Lzu2/c;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

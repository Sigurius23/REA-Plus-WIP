.class final Lza0/d$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza0/d;->interact(Lec3/l;)Lec3/l;
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
        "Lza0/c;",
        "prevResult",
        "Lza0/a;",
        "accumulator",
        "<anonymous>",
        "(Lza0/c;Lza0/a;)Lza0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsInteractor$interact$2"
    f = "BiomarkerDetailsInteractor.kt"
    l = {
        0x3d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lza0/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lza0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza0/d;",
            "Lq83/d<",
            "-",
            "Lza0/d$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lza0/d$f;->F:Lza0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lza0/c;Lza0/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza0/c;",
            "Lza0/a;",
            "Lq83/d<",
            "-",
            "Lza0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lza0/d$f;

    iget-object v1, p0, Lza0/d$f;->F:Lza0/d;

    invoke-direct {v0, v1, p3}, Lza0/d$f;-><init>(Lza0/d;Lq83/d;)V

    iput-object p1, v0, Lza0/d$f;->z:Ljava/lang/Object;

    iput-object p2, v0, Lza0/d$f;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lza0/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lza0/c;

    check-cast p2, Lza0/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lza0/d$f;->f(Lza0/c;Lza0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lza0/d$f;->z:Ljava/lang/Object;

    check-cast v0, Lza0/c;

    iget-object v1, p0, Lza0/d$f;->E:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lza0/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lza0/d$f;->y:I

    const/4 v9, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v9, :cond_0

    iget-object v0, p0, Lza0/d$f;->x:Ljava/lang/Object;

    check-cast v0, Lza0/a;

    iget-object v0, p0, Lza0/d$f;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lza0/c$d;

    const/4 v10, 0x0

    if-eqz p1, :cond_2

    move-object v3, v0

    check-cast v3, Lza0/c$d;

    goto :goto_0

    :cond_2
    move-object v3, v10

    :goto_0
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lza0/c$d;->d()Ljava/util/Set;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v6, v3

    goto :goto_3

    :cond_4
    :goto_2
    sget-object v3, Lm83/a0;->w:Lm83/a0;

    goto :goto_1

    :goto_3
    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lza0/a;->b(Lza0/a;Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;ILjava/lang/Object;)Lza0/a;

    move-result-object v3

    invoke-virtual {v2}, Lza0/a;->e()Z

    move-result v4

    if-eqz v4, :cond_8

    if-eqz p1, :cond_5

    check-cast v0, Lza0/c$d;

    goto :goto_4

    :cond_5
    move-object v0, v10

    :goto_4
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lza0/c$d;->e()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object v10

    :cond_6
    if-eqz v10, :cond_7

    new-instance p1, Lza0/c$a;

    invoke-virtual {v2}, Lza0/a;->c()Lza0/b;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsDomainAction.LoadData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lza0/b$b;

    invoke-virtual {v0}, Lza0/b$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lza0/a;->d()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p1, v0, v10, v1}, Lza0/c$a;-><init>(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)V

    return-object p1

    :cond_7
    sget-object p1, Lza0/c$c;->a:Lza0/c$c;

    return-object p1

    :cond_8
    iget-object p1, p0, Lza0/d$f;->F:Lza0/d;

    invoke-virtual {v3}, Lza0/a;->c()Lza0/b;

    move-result-object v2

    invoke-virtual {v3}, Lza0/a;->d()Ljava/util/Set;

    move-result-object v3

    iput-object v10, p0, Lza0/d$f;->z:Ljava/lang/Object;

    iput-object v10, p0, Lza0/d$f;->E:Ljava/lang/Object;

    iput-object v10, p0, Lza0/d$f;->w:Ljava/lang/Object;

    iput-object v10, p0, Lza0/d$f;->x:Ljava/lang/Object;

    iput v9, p0, Lza0/d$f;->y:I

    invoke-static {p1, v2, v3, v0, p0}, Lza0/d;->e(Lza0/d;Lza0/b;Ljava/util/Set;Lza0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    :goto_5
    check-cast p1, Lza0/c;

    return-object p1
.end method

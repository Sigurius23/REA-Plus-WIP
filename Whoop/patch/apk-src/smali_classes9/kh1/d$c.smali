.class final Lkh1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkh1/d;->interact(Lec3/l;)Lec3/l;
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
        "Lkh1/c;",
        "previousState",
        "Lkh1/e;",
        "internalAction",
        "<anonymous>",
        "(Lkh1/c;Lkh1/e;)Lkh1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$interact$3"
    f = "GiftingInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkh1/d;


# direct methods
.method public constructor <init>(Lkh1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkh1/d;",
            "Lq83/d<",
            "-",
            "Lkh1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkh1/d$c;->z:Lkh1/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lkh1/c;Lkh1/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkh1/c;",
            "Lkh1/e;",
            "Lq83/d<",
            "-",
            "Lkh1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkh1/d$c;

    iget-object v1, p0, Lkh1/d$c;->z:Lkh1/d;

    invoke-direct {v0, v1, p3}, Lkh1/d$c;-><init>(Lkh1/d;Lq83/d;)V

    iput-object p1, v0, Lkh1/d$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkh1/d$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkh1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkh1/c;

    check-cast p2, Lkh1/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkh1/d$c;->f(Lkh1/c;Lkh1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lkh1/d$c;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lkh1/c;

    iget-object v1, v0, Lkh1/d$c;->y:Ljava/lang/Object;

    check-cast v1, Lkh1/e;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lkh1/d$c;->w:I

    if-nez v3, :cond_8

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lkh1/e$a;

    if-eqz v3, :cond_0

    iget-object v3, v0, Lkh1/d$c;->z:Lkh1/d;

    check-cast v1, Lkh1/e$a;

    invoke-virtual {v1}, Lkh1/e$a;->a()Lkh1/b;

    move-result-object v1

    invoke-static {v3, v2, v1}, Lkh1/d;->c(Lkh1/d;Lkh1/c;Lkh1/b;)Lkh1/c;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v3, v1, Lkh1/e$b;

    if-eqz v3, :cond_6

    invoke-virtual {v2}, Lkh1/c;->k()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_1

    move-object v3, v1

    check-cast v3, Lkh1/e$b;

    invoke-virtual {v3}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v3

    invoke-virtual {v3}, Lkh1/c;->k()Ljava/lang/String;

    move-result-object v3

    :cond_1
    move-object v13, v3

    check-cast v1, Lkh1/e$b;

    invoke-virtual {v1}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v3

    invoke-virtual {v3}, Lkh1/c;->m()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Lkh1/c;->m()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_2

    invoke-virtual {v2}, Lkh1/c;->m()Ljava/lang/String;

    move-result-object v3

    :goto_0
    move-object v5, v3

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v3

    invoke-virtual {v3}, Lkh1/c;->m()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v3

    invoke-virtual {v3}, Lkh1/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2}, Lkh1/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_3

    invoke-virtual {v2}, Lkh1/c;->f()Ljava/lang/String;

    move-result-object v3

    :goto_2
    move-object v6, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v3

    invoke-virtual {v3}, Lkh1/c;->f()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :goto_3
    invoke-virtual {v1}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v3

    invoke-virtual {v3}, Lkh1/c;->n()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v2}, Lkh1/c;->n()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_4

    invoke-virtual {v2}, Lkh1/c;->n()Ljava/lang/String;

    move-result-object v3

    :goto_4
    move-object v7, v3

    goto :goto_5

    :cond_4
    invoke-virtual {v1}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v3

    invoke-virtual {v3}, Lkh1/c;->n()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :goto_5
    invoke-virtual {v1}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v3

    invoke-virtual {v3}, Lkh1/c;->l()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Lkh1/c;->l()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_5

    :goto_6
    invoke-virtual {v2}, Lkh1/c;->l()Ljava/lang/String;

    move-result-object v2

    move-object v8, v2

    goto :goto_7

    :cond_5
    invoke-virtual {v1}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v2

    goto :goto_6

    :goto_7
    invoke-virtual {v1}, Lkh1/e$b;->a()Lkh1/c;

    move-result-object v4

    const/16 v18, 0x1ef0

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v4 .. v19}, Lkh1/c;->b(Lkh1/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;ILjava/lang/Object;)Lkh1/c;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v1, Lkh1/e$c;

    if-eqz v3, :cond_7

    check-cast v1, Lkh1/e$c;

    invoke-virtual {v1}, Lkh1/e$c;->a()Lkh1/a;

    move-result-object v7

    const/16 v16, 0x1fef

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lkh1/c;->b(Lkh1/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;ILjava/lang/Object;)Lkh1/c;

    move-result-object v1

    return-object v1

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

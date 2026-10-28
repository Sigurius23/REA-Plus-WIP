.class final Lio0/p$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio0/p;->interact(Lec3/l;)Lec3/l;
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
        "Lio0/y;",
        "previousState",
        "Lio0/p$a;",
        "internalAction",
        "<anonymous>",
        "(Lio0/y;Lio0/p$a;)Lio0/y;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$interact$2"
    f = "ClinicianVideoSchedulingIntakeInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lio0/p;


# direct methods
.method public constructor <init>(Lio0/p;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio0/p;",
            "Lq83/d<",
            "-",
            "Lio0/p$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio0/p$e;->z:Lio0/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lio0/y;Lio0/p$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio0/y;",
            "Lio0/p$a;",
            "Lq83/d<",
            "-",
            "Lio0/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio0/p$e;

    iget-object v1, p0, Lio0/p$e;->z:Lio0/p;

    invoke-direct {v0, v1, p3}, Lio0/p$e;-><init>(Lio0/p;Lq83/d;)V

    iput-object p1, v0, Lio0/p$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lio0/p$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio0/p$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio0/y;

    check-cast p2, Lio0/p$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio0/p$e;->f(Lio0/y;Lio0/p$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lio0/p$e;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lio0/y;

    iget-object v1, v0, Lio0/p$e;->y:Ljava/lang/Object;

    check-cast v1, Lio0/p$a;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lio0/p$e;->w:I

    if-nez v3, :cond_8

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lio0/p$a$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    iget-object v2, v0, Lio0/p$e;->z:Lio0/p;

    check-cast v1, Lio0/p$a$a;

    invoke-virtual {v1}, Lio0/p$a$a;->d()Lpm0/a;

    move-result-object v4

    invoke-virtual {v1}, Lio0/p$a$a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lio0/p$a$a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lio0/p$a$a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lio0/p;->d(Lio0/p;Lio0/y;Lpm0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio0/y;

    move-result-object v1

    move-object v2, v3

    :goto_0
    move-object v3, v1

    goto/16 :goto_1

    :cond_0
    instance-of v3, v1, Lio0/p$a$c;

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio0/p$e;->z:Lio0/p;

    check-cast v1, Lio0/p$a$c;

    invoke-virtual {v1}, Lio0/p$a$c;->a()Lio0/o;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Lio0/p;->s(Lio0/y;Lio0/o;)Lio0/y;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v3, v1, Lio0/p$a$h;

    if-eqz v3, :cond_2

    sget-object v3, Lio0/x$f;->a:Lio0/x$f;

    const/16 v18, 0x7ffe

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v2 .. v19}, Lio0/y;->b(Lio0/y;Lio0/x;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;Ljava/lang/String;Llo0/z;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio0/u;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;ILjava/lang/Object;)Lio0/y;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of v3, v1, Lio0/p$a$d;

    if-eqz v3, :cond_3

    iget-object v1, v0, Lio0/p$e;->z:Lio0/p;

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lio0/p;->c(Lio0/p;Lio0/y;Z)Lio0/y;

    move-result-object v1

    goto :goto_0

    :cond_3
    instance-of v3, v1, Lio0/p$a$g;

    if-eqz v3, :cond_4

    sget-object v3, Lio0/x$f;->a:Lio0/x$f;

    new-instance v6, Llo0/z$a;

    check-cast v1, Lio0/p$a$g;

    invoke-virtual {v1}, Lio0/p$a$g;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-direct {v6, v1}, Llo0/z$a;-><init>(Lcom/whoop/navigation/e;)V

    const/16 v18, 0x7ff6

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v2 .. v19}, Lio0/y;->b(Lio0/y;Lio0/x;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;Ljava/lang/String;Llo0/z;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio0/u;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;ILjava/lang/Object;)Lio0/y;

    move-result-object v1

    goto :goto_0

    :cond_4
    instance-of v3, v1, Lio0/p$a$e;

    if-eqz v3, :cond_5

    sget-object v3, Lio0/x$c;->a:Lio0/x$c;

    const/16 v18, 0x7ffe

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v2 .. v19}, Lio0/y;->b(Lio0/y;Lio0/x;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;Ljava/lang/String;Llo0/z;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio0/u;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;ILjava/lang/Object;)Lio0/y;

    move-result-object v1

    goto/16 :goto_0

    :cond_5
    instance-of v3, v1, Lio0/p$a$b;

    if-eqz v3, :cond_6

    iget-object v3, v0, Lio0/p$e;->z:Lio0/p;

    check-cast v1, Lio0/p$a$b;

    invoke-virtual {v1}, Lio0/p$a$b;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v3, v2, v1}, Lio0/p;->e(Lio0/p;Lio0/y;Ljava/util/List;)Lio0/y;

    move-result-object v1

    goto/16 :goto_0

    :cond_6
    instance-of v1, v1, Lio0/p$a$f;

    if-eqz v1, :cond_7

    sget-object v3, Lio0/x$e;->a:Lio0/x$e;

    const/16 v18, 0x7ff6

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v2 .. v19}, Lio0/y;->b(Lio0/y;Lio0/x;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;Ljava/lang/String;Llo0/z;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio0/u;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;ILjava/lang/Object;)Lio0/y;

    move-result-object v1

    goto/16 :goto_0

    :goto_1
    invoke-virtual {v2}, Lio0/y;->g()I

    move-result v8

    iget-object v1, v0, Lio0/p$e;->z:Lio0/p;

    invoke-static {v1, v3}, Lio0/p;->l(Lio0/p;Lio0/y;)I

    move-result v9

    const/16 v19, 0x7fcf

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v3 .. v20}, Lio0/y;->b(Lio0/y;Lio0/x;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;Ljava/lang/String;Llo0/z;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio0/u;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;ILjava/lang/Object;)Lio0/y;

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

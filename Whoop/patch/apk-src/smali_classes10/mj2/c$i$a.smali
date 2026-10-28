.class public final Lmj2/c$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmj2/c$i;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lmj2/c;


# direct methods
.method public constructor <init>(Lec3/m;Lmj2/c;)V
    .locals 0

    iput-object p1, p0, Lmj2/c$i$a;->w:Lec3/m;

    iput-object p2, p0, Lmj2/c$i$a;->x:Lmj2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lmj2/c$i$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lmj2/c$i$a$a;

    iget v3, v2, Lmj2/c$i$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lmj2/c$i$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lmj2/c$i$a$a;

    invoke-direct {v2, v0, v1}, Lmj2/c$i$a$a;-><init>(Lmj2/c$i$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lmj2/c$i$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lmj2/c$i$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lmj2/c$i$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lmj2/c$i$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lmj2/c$i$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lmj2/c$i$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lkj2/g;

    invoke-virtual {v4}, Lkj2/g;->a()Lnj2/l;

    move-result-object v6

    invoke-virtual {v4}, Lkj2/g;->b()Lh91/b;

    move-result-object v4

    sget-object v7, Lnj2/l$d;->a:Lnj2/l$d;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    new-instance v8, Lnj2/p;

    const v31, 0x3ffffe

    const/16 v32, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v8 .. v32}, Lnj2/p;-><init>(ZLnj2/m;Lnj2/a;Lnj2/n;Lk51/c;Ls01/d;Lk71/c0;Lh51/f;Lh51/f;Lh51/f;Lcom/whoop/design/util/TextResource;Lnj2/e;Lnj2/d;Lk71/c0;Lnj2/y;La11/r;Lnj2/f;Lh91/b;Lk71/c0;Ljava/util/List;Lv31/g;Lep0/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_3
    instance-of v7, v6, Lnj2/l$a;

    if-eqz v7, :cond_4

    iget-object v4, v0, Lmj2/c$i$a;->x:Lmj2/c;

    check-cast v6, Lnj2/l$a;

    invoke-virtual {v6}, Lnj2/l$a;->a()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-result-object v6

    invoke-static {v4, v6}, Lmj2/c;->c(Lmj2/c;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)Lnj2/p;

    move-result-object v8

    goto/16 :goto_1

    :cond_4
    sget-object v7, Lnj2/l$b;->a:Lnj2/l$b;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    new-instance v8, Lnj2/p;

    sget-object v10, Lnj2/m;->NO_CONNECTION:Lnj2/m;

    const v31, 0x3ffffd

    const/16 v32, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v8 .. v32}, Lnj2/p;-><init>(ZLnj2/m;Lnj2/a;Lnj2/n;Lk51/c;Ls01/d;Lk71/c0;Lh51/f;Lh51/f;Lh51/f;Lcom/whoop/design/util/TextResource;Lnj2/e;Lnj2/d;Lk71/c0;Lnj2/y;La11/r;Lnj2/f;Lh91/b;Lk71/c0;Ljava/util/List;Lv31/g;Lep0/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    sget-object v7, Lnj2/l$c;->a:Lnj2/l$c;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    new-instance v8, Lnj2/p;

    sget-object v10, Lnj2/m;->GENERIC:Lnj2/m;

    const v31, 0x3ffffd

    const/16 v32, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v8 .. v32}, Lnj2/p;-><init>(ZLnj2/m;Lnj2/a;Lnj2/n;Lk51/c;Ls01/d;Lk71/c0;Lh51/f;Lh51/f;Lh51/f;Lcom/whoop/design/util/TextResource;Lnj2/e;Lnj2/d;Lk71/c0;Lnj2/y;La11/r;Lnj2/f;Lh91/b;Lk71/c0;Ljava/util/List;Lv31/g;Lep0/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_6
    instance-of v7, v6, Lnj2/l$e;

    if-eqz v7, :cond_8

    iget-object v7, v0, Lmj2/c$i$a;->x:Lmj2/c;

    check-cast v6, Lnj2/l$e;

    invoke-virtual {v6}, Lnj2/l$e;->t()Lcom/whoop/educationModels/FeatureEducationDto;

    move-result-object v8

    invoke-static {v7, v6, v8, v4}, Lmj2/c;->d(Lmj2/c;Lnj2/l$e;Lcom/whoop/educationModels/FeatureEducationDto;Lh91/b;)Lnj2/p;

    move-result-object v8

    :goto_1
    const/4 v4, 0x0

    iput-object v4, v2, Lmj2/c$i$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Lmj2/c$i$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Lmj2/c$i$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Lmj2/c$i$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lmj2/c$i$a$a;->H:I

    iput v5, v2, Lmj2/c$i$a$a;->x:I

    invoke-interface {v1, v8, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    return-object v3

    :cond_7
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

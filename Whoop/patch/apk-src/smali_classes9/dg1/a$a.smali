.class public final Ldg1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldg1/a;-><init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;)Lm91/u;
    .locals 33

    move-object/from16 v0, p1

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lsz0/m;

    invoke-virtual {v2}, Lsz0/m;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    instance-of v4, v1, Lhy0/h1;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, Lhy0/h1;

    goto :goto_1

    :cond_0
    move-object v4, v5

    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lhy0/h1;->s()Lhy0/o1;

    move-result-object v6

    sget-object v7, Lhy0/o1;->JOURNAL:Lhy0/o1;

    if-ne v6, v7, :cond_1

    move-object v8, v4

    goto :goto_2

    :cond_1
    move-object v8, v5

    :goto_2
    if-eqz v8, :cond_2

    const-wide v4, 0x3ff3333333333333L    # 1.2

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v19, v4, v5

    const v31, 0x3ffbff

    const/16 v32, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

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

    invoke-static/range {v8 .. v32}, Lhy0/h1;->b(Lhy0/h1;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lhy0/h1;

    move-result-object v4

    if-eqz v4, :cond_2

    move-object v1, v4

    :cond_2
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lsz0/m;->b(Lsz0/m;Ljava/util/List;Lb2/g;FILjava/lang/Object;)Lsz0/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Ldg1/a$a;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method

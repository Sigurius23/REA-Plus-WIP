.class public final Lzy1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzy1/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lzy1/c;",
        "",
        "Lzy1/a;",
        "progressButtonReducer",
        "Lz92/a;",
        "userInfoAccessor",
        "<init>",
        "(Lzy1/a;Lz92/a;)V",
        "Lxy1/a;",
        "state",
        "Lwy1/b;",
        "a",
        "(Lxy1/a;)Lwy1/b;",
        "Lzy1/a;",
        "b",
        "Lz92/a;",
        "mfa_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lzy1/a;

.field private final b:Lz92/a;


# direct methods
.method public constructor <init>(Lzy1/a;Lz92/a;)V
    .locals 1

    const-string v0, "progressButtonReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoAccessor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzy1/c;->a:Lzy1/a;

    iput-object p2, p0, Lzy1/c;->b:Lz92/a;

    return-void
.end method


# virtual methods
.method public final a(Lxy1/a;)Lwy1/b;
    .locals 52

    move-object/from16 v0, p0

    const-string v1, "state"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lxy1/a;->e()F

    move-result v1

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v1, v3, v4}, Le93/b;->m(FFF)F

    move-result v1

    invoke-virtual {v2}, Lxy1/a;->f()Lxy1/f;

    move-result-object v3

    sget-object v4, Lzy1/c$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v5, :cond_1

    if-eq v3, v4, :cond_0

    sget-object v3, Lxy1/g;->IDLE:Lxy1/g;

    goto :goto_0

    :cond_0
    sget-object v3, Lxy1/g;->FAILED:Lxy1/g;

    goto :goto_0

    :cond_1
    sget-object v3, Lxy1/g;->LOADING:Lxy1/g;

    :goto_0
    iget-object v6, v0, Lzy1/c;->a:Lzy1/a;

    invoke-virtual {v6, v1, v3}, Lzy1/a;->a(FLxy1/g;)Lc31/k;

    move-result-object v7

    iget-object v1, v0, Lzy1/c;->b:Lz92/a;

    invoke-interface {v1}, Lz92/a;->d()Lcom/whoop/domain/model/User;

    move-result-object v1

    const-string v6, ""

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getEmailAddress()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    move-object v1, v6

    :cond_3
    invoke-virtual {v2}, Lxy1/a;->c()Lxy1/c;

    move-result-object v8

    sget-object v27, Lzy1/c$a;->b:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v27, v8

    if-eq v8, v5, :cond_5

    if-ne v8, v4, :cond_4

    invoke-virtual {v2}, Lxy1/a;->d()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    move-object v8, v1

    :goto_1
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8

    const/16 v28, 0x0

    if-lez v8, :cond_6

    move/from16 v17, v5

    goto :goto_2

    :cond_6
    move/from16 v17, v28

    :goto_2
    const v25, 0x1fdff

    const/16 v26, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v7 .. v26}, Lc31/k;->b(Lc31/k;Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILjava/lang/Object;)Lc31/k;

    move-result-object v15

    sget-object v7, Lxy1/g;->FAILED:Lxy1/g;

    if-ne v3, v7, :cond_7

    new-instance v29, Lc41/p2;

    sget-object v30, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    sget v3, Lpy1/d;->o:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v34

    sget-object v36, Ly81/f;->ACCENT_ALERT_TREND_15:Ly81/f;

    sget-object v38, Ly81/f;->ACCENT_ALERT:Ly81/f;

    const v50, 0xffeae

    const/16 v51, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    invoke-direct/range {v29 .. v51}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_3
    move-object/from16 v17, v29

    goto :goto_4

    :cond_7
    const/16 v29, 0x0

    goto :goto_3

    :goto_4
    invoke-virtual {v2}, Lxy1/a;->c()Lxy1/c;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v27, v3

    if-eq v3, v5, :cond_a

    if-ne v3, v4, :cond_9

    new-instance v29, Lwy1/b;

    sget v1, Lpy1/d;->t:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v30

    sget v1, Lpy1/d;->r:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v31

    sget v1, Lpy1/d;->p:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v32

    invoke-virtual {v2}, Lxy1/a;->d()Ljava/lang/String;

    move-result-object v33

    sget v1, Lpy1/d;->q:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v34

    sget v1, Lpy1/d;->s:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v35

    invoke-virtual {v2}, Lxy1/a;->f()Lxy1/f;

    move-result-object v1

    sget-object v2, Lxy1/f;->SUCCESS:Lxy1/f;

    if-ne v1, v2, :cond_8

    move/from16 v39, v5

    goto :goto_5

    :cond_8
    move/from16 v39, v28

    :goto_5
    const/16 v40, 0x0

    sget-object v41, Lxy1/c;->PHONE:Lxy1/c;

    const/16 v37, 0x1

    move-object/from16 v36, v15

    move-object/from16 v38, v17

    invoke-direct/range {v29 .. v41}, Lwy1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc31/k;ZLc41/p2;ZZLxy1/c;)V

    return-object v29

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_a
    new-instance v8, Lwy1/b;

    sget v3, Lpy1/d;->n:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    sget v3, Lpy1/d;->l:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v11, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v13, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sget v3, Lpy1/d;->m:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v14

    invoke-virtual {v2}, Lxy1/a;->f()Lxy1/f;

    move-result-object v2

    sget-object v3, Lxy1/f;->SUCCESS:Lxy1/f;

    if-ne v2, v3, :cond_b

    move/from16 v18, v5

    goto :goto_6

    :cond_b
    move/from16 v18, v28

    :goto_6
    const/16 v19, 0x1

    sget-object v20, Lxy1/c;->EMAIL:Lxy1/c;

    const/16 v16, 0x0

    move-object v12, v1

    invoke-direct/range {v8 .. v20}, Lwy1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc31/k;ZLc41/p2;ZZLxy1/c;)V

    return-object v8
.end method

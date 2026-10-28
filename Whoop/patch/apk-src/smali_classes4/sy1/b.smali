.class public final Lsy1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsy1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lsy1/b;",
        "",
        "Lzy1/a;",
        "progressButtonReducer",
        "<init>",
        "(Lzy1/a;)V",
        "Lry1/a;",
        "state",
        "Lty1/k;",
        "a",
        "(Lry1/a;)Lty1/k;",
        "Lzy1/a;",
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


# direct methods
.method public constructor <init>(Lzy1/a;)V
    .locals 1

    const-string v0, "progressButtonReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsy1/b;->a:Lzy1/a;

    return-void
.end method


# virtual methods
.method public final a(Lry1/a;)Lty1/k;
    .locals 40

    const-string v0, "state"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lry1/a;->i()F

    move-result v0

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v0, v2, v3}, Le93/b;->m(FFF)F

    move-result v0

    invoke-virtual {v1}, Lry1/a;->l()Lxy1/f;

    move-result-object v2

    sget-object v3, Lsy1/b$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v4, 0x2

    if-eq v2, v4, :cond_0

    sget-object v2, Lxy1/g;->IDLE:Lxy1/g;

    goto :goto_0

    :cond_0
    sget-object v2, Lxy1/g;->FAILED:Lxy1/g;

    goto :goto_0

    :cond_1
    sget-object v2, Lxy1/g;->LOADING:Lxy1/g;

    :goto_0
    invoke-virtual {v1}, Lry1/a;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    if-lt v4, v3, :cond_2

    move/from16 v16, v3

    :goto_1
    move-object/from16 v4, p0

    goto :goto_2

    :cond_2
    move/from16 v16, v5

    goto :goto_1

    :goto_2
    iget-object v6, v4, Lsy1/b;->a:Lzy1/a;

    invoke-virtual {v6, v0, v2}, Lzy1/a;->a(FLxy1/g;)Lc31/k;

    move-result-object v6

    const v24, 0x1fdff

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v6 .. v25}, Lc31/k;->b(Lc31/k;Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILjava/lang/Object;)Lc31/k;

    move-result-object v37

    move/from16 v0, v16

    invoke-virtual {v1}, Lry1/a;->c()Lty1/a;

    move-result-object v2

    instance-of v2, v2, Lty1/a$b;

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lry1/a;->c()Lty1/a;

    move-result-object v2

    check-cast v2, Lty1/a$b;

    const/4 v6, 0x0

    invoke-static {v2, v6, v0, v3, v6}, Lty1/a$b;->d(Lty1/a$b;Lcom/whoop/design/util/TextResource;ZILjava/lang/Object;)Lty1/a$b;

    move-result-object v0

    :goto_3
    move-object/from16 v33, v0

    goto :goto_4

    :cond_3
    invoke-virtual {v1}, Lry1/a;->c()Lty1/a;

    move-result-object v0

    goto :goto_3

    :goto_4
    new-instance v26, Lty1/k;

    invoke-virtual {v1}, Lry1/a;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, Lpy1/d;->c:I

    goto :goto_5

    :cond_4
    sget v0, Lpy1/d;->d:I

    :goto_5
    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v28

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lpy1/d;->h:I

    new-instance v6, Lcom/whoop/design/util/TextResource$d$a;

    invoke-virtual {v1}, Lry1/a;->f()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    new-array v3, v3, [Lcom/whoop/design/util/TextResource$d;

    aput-object v6, v3, v5

    invoke-direct {v0, v2, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    invoke-virtual {v1}, Lry1/a;->e()Ljava/lang/String;

    move-result-object v30

    invoke-virtual {v1}, Lry1/a;->n()Z

    move-result v31

    invoke-virtual {v1}, Lry1/a;->j()Z

    move-result v32

    invoke-virtual {v1}, Lry1/a;->g()Lty1/l;

    move-result-object v34

    invoke-virtual {v1}, Lry1/a;->h()Ljava/time/Instant;

    move-result-object v35

    invoke-virtual {v1}, Lry1/a;->m()Z

    move-result v36

    const/16 v38, 0x1

    const/16 v39, 0x0

    const/16 v27, 0x0

    move-object/from16 v29, v0

    invoke-direct/range {v26 .. v39}, Lty1/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLty1/a;Lty1/l;Ljava/time/Instant;ZLc31/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v26
.end method

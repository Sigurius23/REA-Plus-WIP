.class public final Lzy1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzy1/a$a;,
        Lzy1/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lzy1/a;",
        "",
        "<init>",
        "()V",
        "",
        "progress",
        "Lxy1/g;",
        "submissionUIState",
        "Lc31/k;",
        "a",
        "(FLxy1/g;)Lc31/k;",
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


# static fields
.field public static final a:Lzy1/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzy1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzy1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzy1/a;->a:Lzy1/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FLxy1/g;)Lc31/k;
    .locals 24

    move-object/from16 v0, p2

    const-string v1, "submissionUIState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_0

    sget-object v1, Lzy1/i;->FIRST_STEP:Lzy1/i;

    goto :goto_0

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_1

    sget-object v1, Lzy1/i;->LAST_STEP:Lzy1/i;

    goto :goto_0

    :cond_1
    sget-object v1, Lzy1/i;->MIDDLE_STEP:Lzy1/i;

    :goto_0
    sget-object v2, Lxy1/g;->LOADING:Lxy1/g;

    if-ne v0, v2, :cond_2

    sget-object v3, Lc31/d;->LOADING:Lc31/d;

    :goto_1
    move-object v5, v3

    goto :goto_3

    :cond_2
    sget-object v3, Lzy1/i;->FIRST_STEP:Lzy1/i;

    if-eq v1, v3, :cond_4

    sget-object v3, Lzy1/i;->LAST_STEP:Lzy1/i;

    if-ne v1, v3, :cond_3

    goto :goto_2

    :cond_3
    sget-object v3, Lc31/d;->PROGRESS:Lc31/d;

    goto :goto_1

    :cond_4
    :goto_2
    sget-object v3, Lc31/d;->FILLED:Lc31/d;

    goto :goto_1

    :goto_3
    if-ne v0, v2, :cond_5

    sget v2, Lpy1/d;->y:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    :goto_4
    move-object v6, v2

    goto :goto_5

    :cond_5
    sget-object v2, Lxy1/g;->FAILED:Lxy1/g;

    if-ne v0, v2, :cond_6

    sget v2, Lpy1/d;->A:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    goto :goto_4

    :cond_6
    sget-object v2, Lzy1/i;->FIRST_STEP:Lzy1/i;

    if-ne v1, v2, :cond_7

    sget v2, Lpy1/d;->x:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    goto :goto_4

    :cond_7
    sget-object v2, Lzy1/i;->LAST_STEP:Lzy1/i;

    if-ne v1, v2, :cond_8

    sget v2, Lpy1/d;->B:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    goto :goto_4

    :cond_8
    sget v2, Lpy1/d;->z:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    goto :goto_4

    :goto_5
    const/16 v2, 0x64

    int-to-float v2, v2

    mul-float v2, v2, p1

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v12, v2

    sget-object v2, Lxy1/g;->FAILED:Lxy1/g;

    if-ne v0, v2, :cond_9

    sget-object v3, Lgz0/m0;->TINY_REFRESH:Lgz0/m0;

    :goto_6
    move-object v10, v3

    goto :goto_7

    :cond_9
    sget-object v3, Lzy1/i;->LAST_STEP:Lzy1/i;

    if-ne v1, v3, :cond_a

    sget-object v3, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    goto :goto_6

    :cond_a
    sget-object v3, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    goto :goto_6

    :goto_7
    if-ne v0, v2, :cond_b

    sget-object v0, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    :goto_8
    move-object/from16 v16, v0

    goto :goto_9

    :cond_b
    sget-object v0, Lzy1/i;->FIRST_STEP:Lzy1/i;

    if-ne v1, v0, :cond_c

    sget-object v0, Ly81/f;->STRAIN:Ly81/f;

    goto :goto_8

    :cond_c
    sget-object v0, Lzy1/i;->LAST_STEP:Lzy1/i;

    if-ne v1, v0, :cond_d

    sget-object v0, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    goto :goto_8

    :cond_d
    sget-object v0, Ly81/f;->ACCENT_ACTION:Ly81/f;

    goto :goto_8

    :goto_9
    sget-object v0, Lzy1/a$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v0, v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v7, 0x1

    if-eq v2, v7, :cond_10

    if-eq v2, v4, :cond_f

    if-ne v2, v3, :cond_e

    goto :goto_a

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    :goto_a
    sget-object v2, Ly81/f;->BRAND_WHITE:Ly81/f;

    :goto_b
    move-object/from16 v18, v2

    goto :goto_c

    :cond_10
    sget-object v2, Ly81/f;->BRAND_BLACK:Ly81/f;

    goto :goto_b

    :goto_c
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v7, :cond_13

    if-eq v0, v4, :cond_12

    if-ne v0, v3, :cond_11

    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    :goto_d
    move-object v7, v0

    goto :goto_e

    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_12
    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_d

    :cond_13
    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_d

    :goto_e
    new-instance v4, Lc31/k;

    const v22, 0x1d518

    const/16 v23, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x64

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v4 .. v23}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.class public abstract Ltw0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u001a\u0010\r\u001a\u00020\u00018\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0007\u001a\u0004\u0008\u000c\u0010\t\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lsw0/j;",
        "Lhy0/h1;",
        "inlineTag",
        "",
        "c",
        "(Lsw0/j;Lhy0/h1;)Ljava/util/List;",
        "a",
        "Lhy0/h1;",
        "getCustomBehaviorTag",
        "()Lhy0/h1;",
        "customBehaviorTag",
        "b",
        "getWeeklyPlanTag",
        "weeklyPlanTag",
        "Ljb1/a;",
        "Ljb1/a;",
        "cardReducer",
        "custombottomsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lhy0/h1;

.field private static final b:Lhy0/h1;

.field private static final c:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 51

    new-instance v0, Lhy0/h1;

    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lpw0/a;->b:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Ly81/f;->TRANSPARENT:Ly81/f;

    sget-object v5, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v8, Lhy0/o1;->BADGE_SMALL_SECONDARY_NEUTRAL:Lhy0/o1;

    int-to-float v6, v4

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float v25, v6, v7

    invoke-static/range {v25 .. v25}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v37, v6, v7

    const/4 v6, 0x1

    int-to-float v9, v6

    mul-float v38, v9, v7

    new-instance v7, Lhy0/c1;

    sget-object v9, Ly81/f;->WHITE_20:Ly81/f;

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v11, v11

    invoke-direct {v7, v9, v11, v3}, Lhy0/c1;-><init>(Ly81/e;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v23, 0x3bf16a

    const/16 v24, 0x0

    move-object v9, v3

    move-object v3, v2

    const/4 v2, 0x0

    move v11, v4

    const/4 v4, 0x0

    move v12, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move-object v13, v9

    const/4 v9, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v11, v37

    move/from16 v12, v38

    invoke-direct/range {v0 .. v24}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltw0/b;->a:Lhy0/h1;

    new-instance v26, Lhy0/h1;

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lpw0/a;->f:I

    const/4 v9, 0x0

    const/4 v11, 0x2

    invoke-direct {v0, v1, v9, v11, v9}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v29, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v31, Ly81/f;->RECOVERY:Ly81/f;

    sget-object v34, Lhy0/o1;->BADGE_SMALL_ACCENT:Lhy0/o1;

    invoke-static/range {v25 .. v25}, Lt0/j;->e(F)Lt0/i;

    move-result-object v36

    const v49, 0x3ff16a

    const/16 v50, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

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

    move-object/from16 v27, v0

    invoke-direct/range {v26 .. v50}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v26, Ltw0/b;->b:Lhy0/h1;

    const/4 v12, 0x1

    invoke-static {v9, v12, v9}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    sput-object v0, Ltw0/b;->c:Ljb1/a;

    return-void
.end method

.method public static final synthetic a()Ljb1/a;
    .locals 1

    sget-object v0, Ltw0/b;->c:Ljb1/a;

    return-object v0
.end method

.method public static final synthetic b(Lsw0/j;Lhy0/h1;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ltw0/b;->c(Lsw0/j;Lhy0/h1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lsw0/j;Lhy0/h1;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/j;",
            "Lhy0/h1;",
            ")",
            "Ljava/util/List<",
            "Lhy0/h1;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    invoke-virtual {p0}, Lsw0/j;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ltw0/b;->a:Lhy0/h1;

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Lsw0/j;->t()Z

    move-result p0

    if-eqz p0, :cond_1

    if-nez p1, :cond_1

    sget-object p0, Ltw0/b;->b:Lhy0/h1;

    invoke-virtual {v0, p0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p0

    return-object p0
.end method

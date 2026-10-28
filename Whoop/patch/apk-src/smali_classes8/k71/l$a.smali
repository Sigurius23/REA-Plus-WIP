.class public final Lk71/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk71/l;->E(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 35

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, -0x2c4e77a9

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    sget-object v10, Lcom/whoop/util/TrendKey;->RECOVERY:Lcom/whoop/util/TrendKey;

    new-instance v0, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/c;->d()I

    move-result v1

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v3, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "Graphing Card - One Legend"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v14, Lk71/d;

    sget-object v1, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    invoke-static {v1}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v15

    const-string v1, "HIGH RECOVERY"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v18, Ln21/i;->CIRCLE:Ln21/i;

    const/16 v20, 0x14

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8, v2}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v17

    new-instance v1, Lv31/g;

    const-string v3, "Wear WHOOP to sleep for 4 nights to fully calibrate your Recovery Score."

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v5, Lv31/a;

    sget-object v6, Lv31/b;->DISCRETE:Lv31/b;

    const/4 v7, 0x7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v9, 0x5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v5, v6, v7, v9, v4}, Lv31/a;-><init>(Lv31/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V

    sget-object v6, Lv31/h;->ONBOARDING:Lv31/h;

    invoke-direct {v1, v3, v5, v4, v6}, Lv31/g;-><init>(Lcom/whoop/design/util/TextResource;Lv31/a;Lgz0/m0;Lv31/h;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v32

    new-instance v5, Lk71/m;

    const v33, 0x3fef66

    const/16 v34, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v22, v0

    move-object v9, v5

    invoke-direct/range {v9 .. v34}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/16 v10, 0xd

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lk71/l$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

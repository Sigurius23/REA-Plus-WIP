.class public abstract Lgz0/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lgz0/e0;",
        "a",
        "Lgz0/e0;",
        "b",
        "()Lgz0/e0;",
        "strainIcons",
        "design_release"
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
.field private static final a:Lgz0/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgm1/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lgm1/b;-><init>(I)V

    invoke-static {v0}, Lgz0/p0;->b(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgz0/e0;

    sput-object v0, Lgz0/f0;->a:Lgz0/e0;

    return-void
.end method

.method public static synthetic a(Lkd1/g;)Lgz0/e0;
    .locals 0

    invoke-static {p0}, Lgz0/f0;->c(Lkd1/g;)Lgz0/e0;

    move-result-object p0

    return-object p0
.end method

.method public static final b()Lgz0/e0;
    .locals 1

    sget-object v0, Lgz0/f0;->a:Lgz0/e0;

    return-object v0
.end method

.method private static final c(Lkd1/g;)Lgz0/e0;
    .locals 25

    const-string v0, "$this$iconBuilder"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgz0/e0;

    sget v2, Lgy0/a;->A:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "Calories"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v7

    sget v1, Lgy0/a;->L0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Heart Rate"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v8

    sget v1, Lgy0/a;->W0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "HR Zones Training"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v9

    sget v1, Lgy0/a;->S0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "HR Zones 3"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v10

    sget v1, Lgy0/a;->U0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "HR Zones 4-5"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v11

    sget v1, Lgy0/a;->Q0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "HR Zone 1"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v12

    sget v1, Lgy0/a;->R0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "HR Zone 2"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v13

    sget v1, Lgy0/a;->S0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "HR Zone 3"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v14

    sget v1, Lgy0/a;->T0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "HR Zone 4"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v15

    sget v1, Lgy0/a;->V0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "HR Zone 5"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v16

    sget v1, Lgy0/a;->m1:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Lean Body Mass"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v17

    sget v1, Lgy0/a;->p1:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "List"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v18

    sget v1, Lgy0/a;->Q2:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Sedentary Time"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v19

    sget v1, Lgy0/a;->u3:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Steps"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v20

    sget v1, Lgy0/a;->y3:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Strain"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v21

    sget v1, Lgy0/a;->K3:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Superset"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v22

    sget v1, Lgy0/a;->u4:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Tonnage"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v23

    sget v1, Lgy0/a;->v4:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Total Volume Load"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v24

    sget v1, Lgy0/a;->F4:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Vo2 Max"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lkd1/g;->c()Ljava/util/List;

    move-result-object v2

    move v3, v8

    move v4, v9

    move v5, v10

    move v6, v11

    move v8, v13

    move v9, v14

    move v10, v15

    move/from16 v11, v16

    move/from16 v13, v18

    move/from16 v14, v19

    move/from16 v15, v20

    move/from16 v16, v21

    move/from16 v18, v23

    move/from16 v19, v24

    move/from16 v20, v1

    move-object/from16 v21, v2

    move v2, v7

    move v7, v12

    move/from16 v12, v17

    move/from16 v17, v22

    move-object v1, v0

    invoke-direct/range {v1 .. v21}, Lgz0/e0;-><init>(IIIIIIIIIIIIIIIIIIILjava/util/List;)V

    return-object v1
.end method

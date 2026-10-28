.class public abstract Lc41/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Lc41/t0;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "coachingCtaTileStates",
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc41/t0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 25

    new-instance v0, Lc41/t0;

    new-instance v3, Lc41/u0$d;

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7}, Lm4/a;->A(Lx81/d;)I

    move-result v1

    const-string v2, "LOW RECOVERY WITH GOOD SLEEP?"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v4, "Learn why your Recovery is in the RED, although your Sleep Performance is above 85%."

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v3, v1, v2, v4}, Lc41/u0$d;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v5, 0xb

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lc41/t0;

    new-instance v8, Lc41/u0$b;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->f()I

    move-result v9

    const-string v2, "ALARM ON"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v3, "In The Green"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const-string v3, "CHARGE YOUR WHOOP\nFOR 8:00 WAKEUP"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v15, 0x22

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lc41/u0$b;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v13, 0xb

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v11, v8

    move-object v8, v1

    invoke-direct/range {v8 .. v14}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lc41/t0;

    new-instance v9, Lc41/u0$b;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a;->f()I

    move-result v10

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const-string v4, "100% Sleep Needed"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/16 v16, 0x22

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lc41/u0$b;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v13, 0xb

    const/4 v14, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lc41/t0;

    new-instance v9, Lc41/u0$e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/g0;->d()I

    move-result v10

    sget-object v11, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const-string v4, "8:00am"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v4, "PLAN YOUR\nBEDTIME"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-direct/range {v9 .. v14}, Lc41/u0$e;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v14, 0xb

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v12, v9

    move-object v9, v3

    invoke-direct/range {v9 .. v15}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lc41/t0;

    new-instance v10, Lc41/u0$e;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/k0;->A()I

    move-result v11

    sget-object v12, Ly81/f;->WHITE_50:Ly81/f;

    const-string v5, "STRAIN COACH"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v6, "START ACTIVITY"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v16, 0x8

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v17}, Lc41/u0$e;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v12

    const/16 v14, 0xb

    const/4 v15, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lc41/t0;

    new-instance v20, Lc41/u0$e;

    invoke-static {v7}, Lm4/a;->b(Lx81/d;)I

    move-result v11

    sget-object v12, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v2, "In The Green (8:00am)"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    move-object/from16 v10, v20

    invoke-direct/range {v10 .. v15}, Lc41/u0$e;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v22, 0xb

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v17

    new-instance v17, Lc41/t0;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a;->f()I

    move-result v19

    sget-object v22, Ly81/f;->BLACK_30:Ly81/f;

    const-string v4, "Enable Your Journal"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    sget-object v23, Ly81/f;->BRAND_BLACK:Ly81/f;

    const-string v4, "Enable your journal to start tracking behaviors and see your recovery impacts"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v18, Lc41/u0$c;

    move-object/from16 v24, v23

    invoke-direct/range {v18 .. v24}, Lc41/u0$c;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ly81/f;)V

    const/16 v22, 0xb

    const/16 v23, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v17

    new-instance v10, Lc41/t0;

    new-instance v20, Lc41/u0$a;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/k0;->A()I

    move-result v13

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v18, 0x8

    move-object/from16 v12, v16

    const/16 v16, 0x0

    move-object v14, v12

    move-object/from16 v12, v20

    invoke-direct/range {v12 .. v19}, Lc41/u0$a;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x0

    move-object/from16 v17, v10

    invoke-direct/range {v17 .. v23}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v2

    move-object v6, v4

    move-object v2, v8

    move-object v4, v9

    move-object/from16 v7, v17

    filled-new-array/range {v0 .. v7}, [Lc41/t0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc41/s0;->a:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc41/t0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lc41/s0;->a:Ljava/util/List;

    return-object v0
.end method

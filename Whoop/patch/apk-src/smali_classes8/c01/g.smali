.class public abstract Lc01/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0006\"\u0014\u0010\u000c\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0006\"\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0006\u00a8\u0006\u0014"
    }
    d2 = {
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)V",
        "c",
        "Lc01/h;",
        "a",
        "Lc01/h;",
        "state1",
        "b",
        "state2",
        "state3",
        "d",
        "state4",
        "state5",
        "f",
        "state6",
        "g",
        "state7",
        "h",
        "state8",
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
.field private static final a:Lc01/h;

.field private static final b:Lc01/h;

.field private static final c:Lc01/h;

.field private static final d:Lc01/h;

.field private static final e:Lc01/h;

.field private static final f:Lc01/h;

.field private static final g:Lc01/h;

.field private static final h:Lc01/h;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    new-instance v0, Lc01/h;

    const-string v1, "SLEEP BREAKDOWN"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v6, "DAYS"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v7, Lc01/a;

    sget-object v8, Ly81/f;->SLEEP:Ly81/f;

    const-string v3, "Optimal (85%+)"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v7 .. v13}, Lc01/a;-><init>(Ly81/e;FILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lc01/a;

    sget-object v9, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    const-string v3, "Sufficient (85%-70%)"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x5

    invoke-direct/range {v8 .. v14}, Lc01/a;-><init>(Ly81/e;FILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lc01/a;

    sget-object v10, Ly81/f;->SLEEP_AWAKE:Ly81/f;

    const-string v3, "Poor (<70%)"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x9

    invoke-direct/range {v9 .. v15}, Lc01/a;-><init>(Ly81/e;FILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v7, v8, v9}, [Lc01/a;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v5, 0x1

    sget-object v10, Lm83/y;->w:Lm83/y;

    move-object v4, v10

    invoke-direct/range {v0 .. v5}, Lc01/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;I)V

    sput-object v0, Lc01/g;->a:Lc01/h;

    new-instance v7, Lc01/h;

    const-string v0, "RECOVERY"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v11, Lc01/a;

    sget-object v12, Ly81/f;->RECOVERY:Ly81/f;

    const-string v1, "Option 1"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x18

    invoke-direct/range {v11 .. v17}, Lc01/a;-><init>(Ly81/e;FILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lc01/a;

    sget-object v13, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    const-string v1, "Option 2"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xc7

    invoke-direct/range {v12 .. v18}, Lc01/a;-><init>(Ly81/e;FILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lc01/a;

    sget-object v14, Ly81/f;->RECOVERY_LOW_RECOVERY:Ly81/f;

    const-string v1, "Option 3"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x9

    invoke-direct/range {v13 .. v19}, Lc01/a;-><init>(Ly81/e;FILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lc01/a;

    sget-object v15, Ly81/f;->BRAND_WHITE:Ly81/f;

    const-string v1, "Option 4"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v20}, Lc01/a;-><init>(Ly81/e;FILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v11, v12, v13, v14}, [Lc01/a;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v12, 0x1

    move-object v11, v10

    move-object v10, v1

    invoke-direct/range {v7 .. v12}, Lc01/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;I)V

    move-object v10, v11

    sput-object v7, Lc01/g;->b:Lc01/h;

    new-instance v7, Lc01/h;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v0, "Zone 0"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const-string v1, "17:56"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lc01/i;

    const v4, 0x41c251ec    # 24.29f

    invoke-direct {v3, v15, v4, v2, v0}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    sget-object v0, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    const-string v2, "Zone 1"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v4, "29:36"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v6, Lc01/i;

    const v11, 0x425928f6    # 54.29f

    invoke-direct {v6, v0, v11, v5, v2}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    sget-object v0, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    const-string v2, "Zone 2"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v5, "08:20"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v12, Lc01/i;

    const v13, 0x4176b852    # 15.42f

    invoke-direct {v12, v0, v13, v11, v2}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    sget-object v0, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    const-string v2, "Zone 3"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v11, "02:42"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v15, Lc01/i;

    const/high16 v13, 0x40a00000    # 5.0f

    invoke-direct {v15, v0, v13, v14, v2}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    sget-object v0, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    const-string v2, "Zone 4"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v13, Lc01/i;

    move-object/from16 v22, v1

    const v1, 0x4176b852    # 15.42f

    invoke-direct {v13, v0, v1, v14, v2}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    sget-object v0, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    const-string v1, "Zone 5"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v11, Lc01/i;

    const/high16 v14, 0x40a00000    # 5.0f

    invoke-direct {v11, v0, v14, v2, v1}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v16, v3

    move-object/from16 v17, v6

    move-object/from16 v21, v11

    move-object/from16 v18, v12

    move-object/from16 v20, v13

    move-object/from16 v19, v15

    filled-new-array/range {v16 .. v21}, [Lc01/i;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const/4 v12, 0x2

    invoke-direct/range {v7 .. v12}, Lc01/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;I)V

    sput-object v7, Lc01/g;->c:Lc01/h;

    new-instance v7, Lc01/h;

    const-string v0, "STRENGTH ACTIVITY BREAKDOWN"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v1, "(WEEKLY TOTAL)"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v1, Lc01/g$b;->w:Lc01/g$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    const-string v2, "Barre3"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Lc01/i;

    const/high16 v6, 0x42580000    # 54.0f

    invoke-direct {v4, v1, v6, v3, v2}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    sget-object v1, Lc01/g$c;->w:Lc01/g$c;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    const-string v2, "Strength Trainer"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v11, Lc01/i;

    const/high16 v13, 0x41f00000    # 30.0f

    invoke-direct {v11, v1, v13, v6, v3}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    sget-object v1, Lc01/g$d;->w:Lc01/g$d;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    const-string v3, "HIIT"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v6, Lc01/i;

    const/high16 v12, 0x41d00000    # 26.0f

    invoke-direct {v6, v1, v12, v5, v3}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    filled-new-array {v4, v11, v6}, [Lc01/i;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const/4 v12, 0x1

    invoke-direct/range {v7 .. v12}, Lc01/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;I)V

    sput-object v7, Lc01/g;->d:Lc01/h;

    new-instance v7, Lc01/h;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v0, "(AVERAGE WEEKLY TOTAL)"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v0, Lc01/g$e;->w:Lc01/g$e;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Lc01/i;

    invoke-direct {v4, v0, v13, v3, v1}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-direct/range {v7 .. v12}, Lc01/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;I)V

    sput-object v7, Lc01/g;->e:Lc01/h;

    new-instance v7, Lc01/h;

    const-string v0, "STRENGTH ACTIVITY BREAKDOWN - WITH MORE TEXT"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v0, "(AVG. WEEKLY TOTAL)"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v1, Lc01/g$f;->w:Lc01/g$f;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Lc01/i;

    invoke-direct {v5, v1, v13, v4, v3}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-direct/range {v7 .. v12}, Lc01/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;I)V

    sput-object v7, Lc01/g;->f:Lc01/h;

    new-instance v7, Lc01/h;

    const-string v1, "STRENGTH ACTIVITY BREAKDOWN - WITH MORE TEXT REALLY LONG TO MAKE SURE IT WILL WRAP IN MULTIPLE LINES"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v0, Lc01/g$g;->w:Lc01/g$g;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Lc01/i;

    invoke-direct {v5, v0, v13, v4, v3}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-direct/range {v7 .. v12}, Lc01/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;I)V

    sput-object v7, Lc01/g;->g:Lc01/h;

    new-instance v7, Lc01/h;

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v0, "(AVG. WEEKLY TOTAL - WITH MORE TEXT REALLY LONG TO MAKE SURE IT WILL WRAP IN MULTIPLE LINES AT LEAST WITH THREE LINES)"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v0, Lc01/g$h;->w:Lc01/g$h;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lc01/i;

    invoke-direct {v3, v0, v13, v2, v1}, Lc01/i;-><init>(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-direct/range {v7 .. v12}, Lc01/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;I)V

    sput-object v7, Lc01/g;->h:Lc01/h;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc01/g;->d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc01/g;->f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x6d885bde

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lc01/g$a;

    invoke-direct {v1}, Lc01/g$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lc01/g;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    check-cast p0, Lp1/q;

    const v0, 0x1de0eaf

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, p0, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, p0, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v8, p0, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {p0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p0, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p0, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, p0, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, p0, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p0, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lc01/g;->a:Lc01/h;

    const/4 v3, 0x0

    invoke-static {v3, v2, p0, v0, v1}, Lc01/e;->i(Landroidx/compose/ui/Modifier;Lc01/h;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {p0, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v4, Lc01/g;->b:Lc01/h;

    invoke-static {v3, v4, p0, v0, v1}, Lc01/e;->i(Landroidx/compose/ui/Modifier;Lc01/h;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {p0, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v4, Lc01/g;->c:Lc01/h;

    invoke-static {v3, v4, p0, v0, v1}, Lc01/e;->i(Landroidx/compose/ui/Modifier;Lc01/h;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {p0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v2, Lc01/g;->d:Lc01/h;

    invoke-static {v3, v2, p0, v0, v1}, Lc01/e;->i(Landroidx/compose/ui/Modifier;Lc01/h;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lbz0/c;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lc01/g;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

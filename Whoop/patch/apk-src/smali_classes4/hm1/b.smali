.class public final Lhm1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhm1/b$a;,
        Lhm1/b$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lhm1/b;",
        "",
        "Lhm1/a;",
        "streaksAnimationHelper",
        "<init>",
        "(Lhm1/a;)V",
        "Lfm1/h;",
        "streakState",
        "Ly81/f;",
        "a",
        "(Lfm1/h;)Ly81/f;",
        "Lil1/n;",
        "result",
        "Lem1/l;",
        "homeDialogViewState",
        "",
        "isDateToday",
        "Lhm1/b$a;",
        "b",
        "(Lil1/n;Lem1/l;Z)Lhm1/b$a;",
        "Lhm1/a;",
        "home_release"
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
.field private final a:Lhm1/a;


# direct methods
.method public constructor <init>(Lhm1/a;)V
    .locals 1

    const-string v0, "streaksAnimationHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhm1/b;->a:Lhm1/a;

    return-void
.end method

.method private final a(Lfm1/h;)Ly81/f;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lhm1/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    sget-object p1, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    return-object p1

    :cond_1
    sget-object p1, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p1
.end method


# virtual methods
.method public final b(Lil1/n;Lem1/l;Z)Lhm1/b$a;
    .locals 27

    move-object/from16 v0, p0

    const-string v1, "result"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "homeDialogViewState"

    move-object/from16 v4, p2

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lil1/n;->u()Lbm1/c;

    move-result-object v1

    instance-of v3, v1, Lbm1/c$d;

    const/4 v8, 0x0

    if-eqz v3, :cond_0

    check-cast v1, Lbm1/c$d;

    goto :goto_0

    :cond_0
    move-object v1, v8

    :goto_0
    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lbm1/c$d;->c()Lcom/whoop/home/domain/models/StreakMetadata;

    move-result-object v9

    if-eqz v9, :cond_d

    iget-object v2, v0, Lhm1/b;->a:Lhm1/a;

    invoke-virtual/range {p1 .. p1}, Lil1/n;->u()Lbm1/c;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lil1/n;->r()Z

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lil1/n;->m()Lxl1/c;

    move-result-object v6

    invoke-virtual {v6}, Lxl1/c;->a()Z

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lil1/n;->a()Ljl1/a;

    move-result-object v7

    invoke-virtual {v7}, Ljl1/a;->d()Lcom/whoop/navigation/e;

    move-result-object v7

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-nez v7, :cond_1

    move v7, v11

    goto :goto_1

    :cond_1
    move v7, v10

    :goto_1
    invoke-virtual/range {v2 .. v7}, Lhm1/a;->a(Lbm1/c;Lem1/l;ZZZ)Z

    move-result v19

    invoke-virtual {v9}, Lcom/whoop/home/domain/models/StreakMetadata;->getStreakState()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lfm1/h;->values()[Lfm1/h;

    move-result-object v3

    array-length v4, v3

    move v5, v10

    :goto_2
    if-ge v5, v4, :cond_3

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v15, v6

    goto :goto_3

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    move-object v15, v8

    :goto_3
    invoke-virtual {v9}, Lcom/whoop/home/domain/models/StreakMetadata;->getStreakValue()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v0, v15}, Lhm1/b;->a(Lfm1/h;)Ly81/f;

    move-result-object v16

    invoke-virtual {v9}, Lcom/whoop/home/domain/models/StreakMetadata;->getLottieUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, Lv41/r0$e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_4
    move-object v2, v8

    :goto_4
    if-eqz v2, :cond_5

    invoke-static {v2}, Lv41/r0$e;->a(Ljava/lang/String;)Lv41/r0$e;

    move-result-object v2

    move-object/from16 v17, v2

    goto :goto_5

    :cond_5
    move-object/from16 v17, v8

    :goto_5
    invoke-virtual {v9}, Lcom/whoop/home/domain/models/StreakMetadata;->getImageUrl()Ljava/lang/String;

    move-result-object v21

    if-eqz v21, :cond_6

    new-instance v20, Lkd1/o$c;

    const/16 v25, 0xe

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v20 .. v26}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v20

    goto :goto_6

    :cond_6
    move-object/from16 v18, v8

    :goto_6
    invoke-virtual {v1}, Lbm1/c$d;->f()Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz v19, :cond_7

    sget-object v1, Lfm1/h;->FROZEN:Lfm1/h;

    if-eq v15, v1, :cond_7

    sget-object v1, Lfm1/h;->PENDING:Lfm1/h;

    if-eq v15, v1, :cond_7

    move/from16 v20, v11

    goto :goto_7

    :cond_7
    move/from16 v20, v10

    :goto_7
    invoke-virtual {v9}, Lcom/whoop/home/domain/models/StreakMetadata;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v21

    invoke-virtual {v9}, Lcom/whoop/home/domain/models/StreakMetadata;->getAnimationAccentColor()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    sget-object v2, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v3

    array-length v4, v3

    :goto_8
    if-ge v10, v4, :cond_9

    aget-object v5, v3, v10

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object v8, v5

    goto :goto_9

    :cond_8
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_9
    :goto_9
    if-nez v8, :cond_a

    goto :goto_a

    :cond_a
    move-object v2, v8

    :goto_a
    if-nez v2, :cond_b

    goto :goto_c

    :cond_b
    :goto_b
    move-object/from16 v22, v2

    goto :goto_d

    :cond_c
    :goto_c
    sget-object v2, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    goto :goto_b

    :goto_d
    new-instance v12, Lfm1/i;

    move/from16 v13, p3

    invoke-direct/range {v12 .. v22}, Lfm1/i;-><init>(ZLjava/lang/String;Lfm1/h;Ly81/f;Lv41/r0;Lkd1/o;ZZLcom/whoop/navigation/e;Ly81/f;)V

    move-object v8, v12

    :cond_d
    new-instance v1, Lhm1/b$a;

    invoke-direct {v1, v8}, Lhm1/b$a;-><init>(Lfm1/i;)V

    return-object v1
.end method

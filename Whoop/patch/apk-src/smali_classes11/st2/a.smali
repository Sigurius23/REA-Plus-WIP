.class public final Lst2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lst2/a;",
        "",
        "<init>",
        "()V",
        "event",
        "",
        "category",
        "Lcom/whoop/navigation/e;",
        "b",
        "(Ljava/lang/Object;Ljava/lang/String;)Lcom/whoop/navigation/e;",
        "carouselPlacement",
        "a",
        "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/e;",
        "weekly-plan_release"
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
.field public static final a:Lst2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lst2/a;

    invoke-direct {v0}, Lst2/a;-><init>()V

    sput-object v0, Lst2/a;->a:Lst2/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/e;
    .locals 21

    move-object/from16 v0, p1

    const-string v1, "event"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "carouselPlacement"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "category"

    move-object/from16 v3, p3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lcom/whoop/navigation/e;

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/navigation/e;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    instance-of v5, v1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    if-eqz v5, :cond_1

    check-cast v1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    goto :goto_1

    :cond_1
    move-object v1, v4

    :goto_1
    if-eqz v1, :cond_2

    const v19, 0x9fff

    const/16 v20, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, p3

    move-object/from16 v17, v2

    move-object v2, v1

    invoke-static/range {v2 .. v20}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->copy$default(Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    move-result-object v7

    const/4 v9, 0x5

    move-object v5, v0

    invoke-static/range {v5 .. v10}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v4
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/String;)Lcom/whoop/navigation/e;
    .locals 21

    move-object/from16 v0, p1

    const-string v1, "event"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "category"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lcom/whoop/navigation/e;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/navigation/e;

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    instance-of v4, v1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    if-eqz v4, :cond_1

    check-cast v1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_2

    const v19, 0xdfff

    const/16 v20, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    move-object/from16 v16, v2

    move-object v2, v1

    invoke-static/range {v2 .. v20}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->copy$default(Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    move-result-object v6

    const/4 v8, 0x5

    const/4 v5, 0x0

    move-object v4, v0

    invoke-static/range {v4 .. v9}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v3
.end method

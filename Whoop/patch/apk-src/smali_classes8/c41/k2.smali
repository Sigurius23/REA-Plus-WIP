.class public abstract Lc41/k2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0003\u00a8\u0006\u0008"
    }
    d2 = {
        "Lc41/l2;",
        "a",
        "Lc41/l2;",
        "()Lc41/l2;",
        "horizontalMetricTileSampleViewState",
        "b",
        "getHorizontalMetricTileLongLabelsViewState",
        "horizontalMetricTileLongLabelsViewState",
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
.field private static final a:Lc41/l2;

.field private static final b:Lc41/l2;


# direct methods
.method static constructor <clinit>()V
    .locals 28

    const-string v0, "HEALTH MONITOR"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v10, Lgz0/m0;->RESPIRATORY_RATE:Lgz0/m0;

    const-string v1, "RESP"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v11, Lgz0/m0;->TINY_CHECKMARK:Lgz0/m0;

    sget-object v12, Lc41/w3;->OK:Lc41/w3;

    new-instance v3, Lc41/n3;

    invoke-direct {v3, v1, v10, v11, v12}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    sget-object v13, Lgz0/m0;->BLOOD_OXYGEN:Lgz0/m0;

    const-string v1, "SPO2"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v9, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    sget-object v14, Lc41/w3;->WARNING:Lc41/w3;

    new-instance v4, Lc41/n3;

    invoke-direct {v4, v1, v13, v9, v14}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    sget-object v15, Lgz0/m0;->RHR:Lgz0/m0;

    const-string v1, "RHR"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v5, Lc41/n3;

    invoke-direct {v5, v1, v15, v9, v14}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    sget-object v1, Lgz0/m0;->HRV:Lgz0/m0;

    const-string v6, "HRV"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v7, Lc41/n3;

    invoke-direct {v7, v6, v1, v11, v12}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    sget-object v6, Lgz0/m0;->SKIN_TEMPERATURE:Lgz0/m0;

    const-string v8, "TEMP"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object/from16 v16, v0

    sget-object v0, Lc41/w3;->ALERT:Lc41/w3;

    move-object/from16 v17, v7

    new-instance v7, Lc41/n3;

    invoke-direct {v7, v8, v6, v9, v0}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    sget-object v0, Lgz0/m0;->SAGE:Lgz0/m0;

    const-string v8, "BP"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object/from16 v18, v1

    new-instance v1, Lc41/n3;

    invoke-direct {v1, v8, v0, v9, v14}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    move-object v8, v1

    move-object v0, v6

    move-object/from16 v6, v17

    filled-new-array/range {v3 .. v8}, [Lc41/n3;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    sget-object v3, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    new-instance v5, Lc41/h2;

    const-string v1, "2/6 Metrics within Range"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v6, "Needs 7 Recoveries"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v5, v1, v6, v9, v14}, Lc41/h2;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lc41/w3;)V

    new-instance v1, Lc41/l2;

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v14, v18

    invoke-direct/range {v1 .. v9}, Lc41/l2;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/util/List;Lc41/h2;Lcom/whoop/navigation/e;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lc41/k2;->a:Lc41/l2;

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const-string v1, "Respiratory Rate"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lc41/n3;

    invoke-direct {v2, v1, v10, v11, v12}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    const-string v1, "Blood Oxygen SPO2"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v4, Lc41/n3;

    invoke-direct {v4, v1, v13, v11, v12}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    const-string v1, "Resting Heart Rate (RHR)"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v5, Lc41/n3;

    invoke-direct {v5, v1, v15, v11, v12}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    const-string v1, "Heart Rate Variability (HRV)"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v6, Lc41/n3;

    invoke-direct {v6, v1, v14, v11, v12}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    const-string v1, "Skin Temperature"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v7, Lc41/n3;

    invoke-direct {v7, v1, v0, v11, v12}, Lc41/n3;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc41/w3;)V

    filled-new-array {v2, v4, v5, v6, v7}, [Lc41/n3;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v22

    new-instance v0, Lc41/h2;

    const-string v1, "5/5 Metrics within Range"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v2, ""

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v0, v1, v2, v11, v12}, Lc41/h2;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lc41/w3;)V

    new-instance v19, Lc41/l2;

    const/16 v26, 0x20

    const/16 v27, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v23, v0

    move-object/from16 v21, v3

    invoke-direct/range {v19 .. v27}, Lc41/l2;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/util/List;Lc41/h2;Lcom/whoop/navigation/e;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v19, Lc41/k2;->b:Lc41/l2;

    return-void
.end method

.method public static final a()Lc41/l2;
    .locals 1

    sget-object v0, Lc41/k2;->a:Lc41/l2;

    return-object v0
.end method

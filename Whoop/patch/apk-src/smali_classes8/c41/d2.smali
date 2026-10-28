.class public abstract Lc41/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Lc41/e2;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "healthMonitorTileStates",
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
            "Lc41/e2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 24

    sget-object v5, Lc41/f2;->POSITIVE:Lc41/f2;

    const-string v0, "5/5 METRIC"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v9, "WITHIN RANGE"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-static {v10}, Lb9/y;->c(Lx81/d;)I

    move-result v2

    new-instance v0, Lc41/e2;

    const/16 v7, 0x21

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lc41/e2;-><init>(ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/f2;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v16, Lc41/f2;->NEGATIVE:Lc41/f2;

    const-string v1, "3/5 Metric"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-static {v10}, Lih0/d0;->c(Lx81/d;)I

    move-result v13

    new-instance v11, Lc41/e2;

    const/16 v18, 0x21

    const/16 v19, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lc41/e2;-><init>(ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/f2;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v6, Lc41/f2;->ALERT:Lc41/f2;

    const-string v12, "RESPIRATORY RATE"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v13, "VERY ELEVATED"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v10}, Lih0/d0;->c(Lx81/d;)I

    move-result v3

    new-instance v1, Lc41/e2;

    const/16 v8, 0x21

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lc41/e2;-><init>(ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/f2;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v1

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v10}, Lih0/d0;->c(Lx81/d;)I

    move-result v3

    sget-object v7, Ly81/f;->ACCENT_ALERT_TREND_15:Ly81/f;

    new-instance v1, Lc41/e2;

    const/4 v8, 0x1

    invoke-direct/range {v1 .. v9}, Lc41/e2;-><init>(ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/f2;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "DATA UNAVAILABLE"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v15, Lc41/e2;

    const/16 v22, 0x3a

    const/16 v23, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v23}, Lc41/e2;-><init>(ZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/f2;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v11, v14, v1, v15}, [Lc41/e2;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc41/d2;->a:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc41/e2;",
            ">;"
        }
    .end annotation

    sget-object v0, Lc41/d2;->a:Ljava/util/List;

    return-object v0
.end method

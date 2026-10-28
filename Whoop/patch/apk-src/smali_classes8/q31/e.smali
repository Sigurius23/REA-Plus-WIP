.class public final Lq31/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000e\u001a\u0004\u0008\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000e\u001a\u0004\u0008\u0016\u0010\u0010\u00a8\u0006\u0018"
    }
    d2 = {
        "Lq31/e;",
        "",
        "<init>",
        "()V",
        "Lq31/a;",
        "b",
        "Lq31/a;",
        "annotatedSegmentItem1",
        "c",
        "annotatedSegmentItem2",
        "d",
        "annotatedSegmentItem3",
        "Lq31/f;",
        "e",
        "Lq31/f;",
        "a",
        "()Lq31/f;",
        "threeTabsSegmentContent",
        "f",
        "getTwoTabsSegmentSampleState",
        "twoTabsSegmentSampleState",
        "g",
        "getTwoTabsSegmentWithSubtitleSampleState",
        "twoTabsSegmentWithSubtitleSampleState",
        "design_release"
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
.field public static final a:Lq31/e;

.field private static final b:Lq31/a;

.field private static final c:Lq31/a;

.field private static final d:Lq31/a;

.field private static final e:Lq31/f;

.field private static final f:Lq31/f;

.field private static final g:Lq31/f;

.field public static final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 23

    new-instance v0, Lq31/e;

    invoke-direct {v0}, Lq31/e;-><init>()V

    sput-object v0, Lq31/e;->a:Lq31/e;

    new-instance v1, Lq31/a;

    new-instance v0, Lsz0/c;

    const-string v2, "Content for Segment 1, Item 1"

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-direct {v0, v2, v10, v11, v12}, Lsz0/c;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v8, 0x30

    const/4 v9, 0x0

    const-string v2, "1"

    const-string v3, "Segment 1"

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lq31/e;->b:Lq31/a;

    new-instance v13, Lq31/a;

    new-instance v0, Lsz0/c;

    const-string v2, "Different Content for Segment 2"

    invoke-direct {v0, v2, v10, v11, v12}, Lsz0/c;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v20, 0x30

    const/16 v21, 0x0

    const-string v14, "2"

    const-string v15, "Segment 2"

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v21}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Lq31/e;->c:Lq31/a;

    new-instance v14, Lq31/a;

    new-instance v0, Lsz0/c;

    const-string v2, "More Content Here (Segment 3)"

    invoke-direct {v0, v2, v10, v11, v12}, Lsz0/c;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const/16 v21, 0x30

    const/16 v22, 0x0

    const-string v15, "3"

    const-string v16, "Segment 3"

    const/16 v17, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v14, Lq31/e;->d:Lq31/a;

    new-instance v2, Lq31/f;

    filled-new-array {v1, v13, v14}, [Lq31/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/16 v8, 0x12

    const-string v3, "0"

    const/4 v5, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lq31/f;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lq31/e;->e:Lq31/f;

    new-instance v3, Lq31/f;

    filled-new-array {v1, v14}, [Lq31/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/16 v9, 0x12

    const/4 v10, 0x0

    const-string v4, "0"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lq31/f;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lq31/e;->f:Lq31/f;

    new-instance v0, Lq31/f;

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "Sub Text 1"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lq31/a;->b(Lq31/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lq31/a;

    move-result-object v1

    const/16 v21, 0x3b

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-string v17, "Sub Text 3"

    const/16 v18, 0x0

    invoke-static/range {v14 .. v22}, Lq31/a;->b(Lq31/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lq31/a;

    move-result-object v2

    filled-new-array {v1, v2}, [Lq31/a;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v10, 0x12

    const/4 v11, 0x0

    const-string v5, "0"

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v11}, Lq31/f;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lq31/e;->g:Lq31/f;

    const/16 v0, 0x8

    sput v0, Lq31/e;->h:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lq31/f;
    .locals 1

    sget-object v0, Lq31/e;->e:Lq31/f;

    return-object v0
.end method

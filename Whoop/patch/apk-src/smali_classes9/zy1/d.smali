.class public final Lzy1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0006\u001a\u0004\u0008\u0010\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lzy1/d;",
        "",
        "<init>",
        "()V",
        "Lc31/k;",
        "b",
        "Lc31/k;",
        "a",
        "()Lc31/k;",
        "firstStep",
        "c",
        "getMiddleStep",
        "middleStep",
        "d",
        "lastStep",
        "e",
        "getLoadingStep",
        "loadingStep",
        "mfa_release"
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
.field public static final a:Lzy1/d;

.field private static final b:Lc31/k;

.field private static final c:Lc31/k;

.field private static final d:Lc31/k;

.field private static final e:Lc31/k;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 24

    new-instance v0, Lzy1/d;

    invoke-direct {v0}, Lzy1/d;-><init>()V

    sput-object v0, Lzy1/d;->a:Lzy1/d;

    sget-object v2, Lc31/d;->FILLED:Lc31/d;

    sget v0, Lpy1/d;->x:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget-object v10, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    sget-object v13, Ly81/f;->STRAIN:Ly81/f;

    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v1, Lc31/k;

    const v19, 0x1d518

    const/16 v20, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x64

    const/4 v9, 0x0

    move-object v7, v10

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v15, v4

    invoke-direct/range {v1 .. v20}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lzy1/d;->b:Lc31/k;

    sget-object v5, Lc31/d;->PROGRESS:Lc31/d;

    sget v0, Lpy1/d;->z:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget-object v16, Ly81/f;->ACCENT_ACTION:Ly81/f;

    move-object v10, v7

    move-object v7, v4

    new-instance v4, Lc31/k;

    const v22, 0x1d518

    const/16 v23, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x64

    const/16 v12, 0x32

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v7

    invoke-direct/range {v4 .. v23}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v4

    move-object v4, v7

    move-object v0, v10

    move-object/from16 v21, v16

    sput-object v1, Lzy1/d;->c:Lc31/k;

    sget v1, Lpy1/d;->B:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget-object v7, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    sget-object v13, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v15, Ly81/f;->BRAND_BLACK:Ly81/f;

    new-instance v1, Lc31/k;

    const v19, 0x1d518

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x64

    const/16 v9, 0x64

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v20}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lzy1/d;->d:Lc31/k;

    sget-object v5, Lc31/d;->LOADING:Lc31/d;

    sget v1, Lpy1/d;->z:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    move-object v7, v4

    new-instance v4, Lc31/k;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x64

    const/16 v12, 0x42

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v21

    const/16 v21, 0x0

    move-object/from16 v18, v7

    move-object v10, v0

    invoke-direct/range {v4 .. v23}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lzy1/d;->e:Lc31/k;

    sget v0, Lc31/k;->r:I

    sput v0, Lzy1/d;->f:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lc31/k;
    .locals 1

    sget-object v0, Lzy1/d;->b:Lc31/k;

    return-object v0
.end method

.method public final b()Lc31/k;
    .locals 1

    sget-object v0, Lzy1/d;->d:Lc31/k;

    return-object v0
.end method

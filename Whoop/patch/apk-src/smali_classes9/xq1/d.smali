.class public final Lxq1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lxq1/d;",
        "",
        "<init>",
        "()V",
        "Lhy0/h1;",
        "b",
        "Lhy0/h1;",
        "a",
        "()Lhy0/h1;",
        "autoDetected",
        "behavior-impact_release"
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
.field public static final a:Lxq1/d;

.field private static final b:Lhy0/h1;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Lxq1/d;

    invoke-direct {v0}, Lxq1/d;-><init>()V

    sput-object v0, Lxq1/d;->a:Lxq1/d;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Ly71/g;

    sget v0, Lgy0/a;->k:I

    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lgy0/f;->D:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-direct {v1, v4, v5, v6, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    sget-object v9, Lhy0/o1;->JOURNAL_TRENDS:Lhy0/o1;

    sget-object v4, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v6, Ly81/f;->RECOVERY:Ly81/f;

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v12, v0, v1

    const/4 v0, 0x3

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v14, v0, v1

    new-instance v1, Lhy0/h1;

    const v24, 0x3fe368

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move v13, v12

    invoke-direct/range {v1 .. v25}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lxq1/d;->b:Lhy0/h1;

    sget v0, Lhy0/h1;->w:I

    sput v0, Lxq1/d;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lhy0/h1;
    .locals 1

    sget-object v0, Lxq1/d;->b:Lhy0/h1;

    return-object v0
.end method

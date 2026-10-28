.class public final Ln81/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Ln81/g;",
        "",
        "<init>",
        "()V",
        "Ln81/f;",
        "b",
        "Ln81/f;",
        "a",
        "()Ln81/f;",
        "successTwoTags",
        "c",
        "getCustomStyleTags",
        "customStyleTags",
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
.field public static final a:Ln81/g;

.field private static final b:Ln81/f;

.field private static final c:Ln81/f;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 23

    new-instance v0, Ln81/g;

    invoke-direct {v0}, Ln81/g;-><init>()V

    sput-object v0, Ln81/g;->a:Ln81/g;

    new-instance v1, Ln81/f;

    new-instance v2, Ln81/a;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "Sleep"

    const-string v4, "SLEEP"

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ln81/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ln81/a;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "Performance"

    const-string v5, "PERFORMANCE"

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Ln81/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v2, v3}, [Ln81/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lny0/p0;

    const-string v0, "Sleep Content"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Lcom/whoop/navigation/e;

    sget-object v6, Lcom/whoop/navigation/AppScreen$o2;->w:Lcom/whoop/navigation/AppScreen$o2;

    new-instance v7, Lcom/whoop/navigation/HealthMonitorScreenModel;

    const/16 v12, 0xf

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/whoop/navigation/HealthMonitorScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x4

    invoke-direct/range {v5 .. v10}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v6

    const/16 v18, 0x3ffc

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v3 .. v19}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ll83/k;

    const-string v5, "SLEEP"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lny0/p0;

    const-string v5, "Performance Content"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v6, Lcom/whoop/navigation/e;

    new-instance v7, Lcom/whoop/navigation/HealthMonitorScreenModel;

    const/16 v12, 0xf

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/whoop/navigation/HealthMonitorScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x4

    move-object v8, v7

    move-object v7, v0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x3ffc

    const/16 v22, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object v7, v5

    move-object v8, v6

    move-object v6, v3

    invoke-direct/range {v6 .. v22}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ll83/k;

    const-string v3, "PERFORMANCE"

    invoke-direct {v0, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x1c

    const-string v3, "SLEEP"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Ln81/f;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ln81/d;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ln81/g;->b:Ln81/f;

    new-instance v6, Ln81/d;

    new-instance v7, Lm81/f;

    sget-object v8, Ly81/f;->BRAND_WHITE:Ly81/f;

    sget-object v9, Ly81/f;->BRAND_BLACK:Ly81/f;

    sget-object v10, Ly81/f;->ACCENT_ALERT:Ly81/f;

    sget-object v11, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const/4 v0, 0x4

    int-to-float v12, v0

    const/4 v0, 0x1

    int-to-float v0, v0

    mul-float v13, v0, v12

    invoke-direct/range {v7 .. v14}, Lm81/f;-><init>(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lm81/f;

    sget-object v11, Ly81/f;->ACCENT_FOCUS:Ly81/f;

    move v2, v12

    sget-object v12, Ly81/f;->BLACK_20:Ly81/f;

    const/4 v3, 0x5

    int-to-float v13, v3

    const/4 v3, 0x2

    int-to-float v3, v3

    mul-float v14, v3, v2

    move-object v10, v8

    move-object v8, v0

    invoke-direct/range {v8 .. v15}, Lm81/f;-><init>(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lb91/c;->B5:Lb91/c;

    invoke-direct {v6, v7, v8, v0}, Ln81/d;-><init>(Lm81/f;Lm81/f;Lb91/c;)V

    const/16 v8, 0x2f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Ln81/f;->b(Ln81/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ln81/d;Ljava/util/Map;ILjava/lang/Object;)Ln81/f;

    move-result-object v0

    sput-object v0, Ln81/g;->c:Ln81/f;

    const/16 v0, 0x8

    sput v0, Ln81/g;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln81/f;
    .locals 1

    sget-object v0, Ln81/g;->b:Ln81/f;

    return-object v0
.end method

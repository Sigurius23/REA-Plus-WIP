.class public final Lug2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lug2/a;",
        "",
        "<init>",
        "()V",
        "",
        "path",
        "Lcom/whoop/design/item/DesignItemInteraction;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/design/item/DesignItemInteraction;",
        "start-activity_release"
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
.field public static final a:Lug2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lug2/a;

    invoke-direct {v0}, Lug2/a;-><init>()V

    sput-object v0, Lug2/a;->a:Lug2/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/whoop/design/item/DesignItemInteraction;
    .locals 11

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/item/DesignItemInteraction;

    new-instance v1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {p1}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object p1

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object p1

    const-string v2, "activityType"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    const/16 v9, 0x64

    const/4 v10, 0x0

    const-string v2, "Track Activity"

    const-string v3, ""

    const/4 v4, 0x0

    const-string v5, "target_load_error"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/analytics/AnalyticEventModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v0
.end method

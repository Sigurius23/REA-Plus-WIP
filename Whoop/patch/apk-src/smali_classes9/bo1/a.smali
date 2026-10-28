.class public final Lbo1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lbo1/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;",
        "model",
        "Lbo1/b;",
        "a",
        "(Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;)Lbo1/b;",
        "hormonal-insights_release"
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
.field public static final a:Lbo1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbo1/a;

    invoke-direct {v0}, Lbo1/a;-><init>()V

    sput-object v0, Lbo1/a;->a:Lbo1/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;)Lbo1/b;
    .locals 11

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;->getEnabled()Z

    move-result v4

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;->getCtaDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;->getCtaTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;->getCtaIcon()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    array-length v7, v1

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v1, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    :goto_1
    if-nez v9, :cond_2

    move-object v7, v0

    goto :goto_2

    :cond_2
    move-object v7, v9

    :goto_2
    new-instance v1, Lbo1/b;

    invoke-direct/range {v1 .. v7}, Lbo1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Lgz0/m0;)V

    return-object v1
.end method

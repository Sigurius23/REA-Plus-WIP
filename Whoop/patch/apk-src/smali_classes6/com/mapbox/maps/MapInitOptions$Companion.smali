.class public final Lcom/mapbox/maps/MapInitOptions$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/maps/MapInitOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/mapbox/maps/MapInitOptions$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lcom/mapbox/maps/MapOptions;",
        "getDefaultMapOptions",
        "(Landroid/content/Context;)Lcom/mapbox/maps/MapOptions;",
        "",
        "Lev/q;",
        "defaultPluginList",
        "Ljava/util/List;",
        "getDefaultPluginList",
        "()Ljava/util/List;",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mapbox/maps/MapInitOptions$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDefaultMapOptions(Landroid/content/Context;)Lcom/mapbox/maps/MapOptions;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/MapOptions$Builder;

    invoke-direct {v0}, Lcom/mapbox/maps/MapOptions$Builder;-><init>()V

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapInitOptionsKt;->applyDefaultParams(Lcom/mapbox/maps/MapOptions$Builder;Landroid/content/Context;)Lcom/mapbox/maps/MapOptions$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/maps/MapOptions$Builder;->build()Lcom/mapbox/maps/MapOptions;

    move-result-object p1

    const-string v0, "Builder().applyDefaultParams(context).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getDefaultPluginList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lev/q;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/mapbox/maps/MapInitOptions;->access$getDefaultPluginList$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

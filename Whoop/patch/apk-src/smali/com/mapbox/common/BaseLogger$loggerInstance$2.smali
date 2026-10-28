.class final Lcom/mapbox/common/BaseLogger$loggerInstance$2;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/BaseLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lqu/a;",
        "invoke",
        "()Lqu/a;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/mapbox/common/BaseLogger$loggerInstance$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/BaseLogger$loggerInstance$2;

    invoke-direct {v0}, Lcom/mapbox/common/BaseLogger$loggerInstance$2;-><init>()V

    sput-object v0, Lcom/mapbox/common/BaseLogger$loggerInstance$2;->INSTANCE:Lcom/mapbox/common/BaseLogger$loggerInstance$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/common/BaseLogger$loggerInstance$2;->invoke()Lqu/a;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lqu/a;
    .locals 3

    .line 2
    sget-object v0, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->INSTANCE:Lcom/mapbox/common/module/provider/MapboxModuleProvider;

    sget-object v1, Lpu/b;->E:Lpu/b;

    sget-object v2, Lcom/mapbox/common/BaseLogger$loggerInstance$2$1;->INSTANCE:Lcom/mapbox/common/BaseLogger$loggerInstance$2$1;

    invoke-virtual {v0, v1, v2}, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->createModule(Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqu/a;

    return-object v0
.end method

.class public final Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "Lc51/b0;",
        "Ly81/f;",
        "textStyleMap",
        "Ljava/util/Map;",
        "getTextStyleMap",
        "()Ljava/util/Map;",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
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
    invoke-direct {p0}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getTextStyleMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lc51/b0;",
            "Ly81/f;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->access$getTextStyleMap$cp()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

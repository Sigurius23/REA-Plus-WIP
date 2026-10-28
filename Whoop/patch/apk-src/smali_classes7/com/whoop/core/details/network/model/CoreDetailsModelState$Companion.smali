.class public final Lcom/whoop/core/details/network/model/CoreDetailsModelState$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/core/details/network/model/CoreDetailsModelState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/CoreDetailsModelState$Companion;",
        "",
        "<init>",
        "()V",
        "Lwc3/c;",
        "Lcom/whoop/core/details/network/model/CoreDetailsModelState;",
        "serializer",
        "()Lwc3/c;",
        "core-details_release"
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
.field static final synthetic $$INSTANCE:Lcom/whoop/core/details/network/model/CoreDetailsModelState$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/core/details/network/model/CoreDetailsModelState$Companion;

    invoke-direct {v0}, Lcom/whoop/core/details/network/model/CoreDetailsModelState$Companion;-><init>()V

    sput-object v0, Lcom/whoop/core/details/network/model/CoreDetailsModelState$Companion;->$$INSTANCE:Lcom/whoop/core/details/network/model/CoreDetailsModelState$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    new-instance v0, Lwc3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/core/details/network/model/CoreDetailsModelState;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v4, Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v4, 0x2

    move-object v5, v3

    new-array v3, v4, [Lj93/d;

    const/4 v6, 0x0

    aput-object v5, v3, v6

    const/4 v5, 0x1

    aput-object v1, v3, v5

    new-array v4, v4, [Lwc3/c;

    sget-object v1, Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/CoreDetailsModelState$CoreDetails$$serializer;

    aput-object v1, v4, v6

    sget-object v1, Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/CoreDetailsModelState$RecoveryDetails$$serializer;

    aput-object v1, v4, v5

    new-array v5, v6, [Ljava/lang/annotation/Annotation;

    const-string v1, "com.whoop.core.details.network.model.CoreDetailsModelState"

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

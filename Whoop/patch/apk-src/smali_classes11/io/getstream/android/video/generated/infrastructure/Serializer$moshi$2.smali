.class final Lio/getstream/android/video/generated/infrastructure/Serializer$moshi$2;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/android/video/generated/infrastructure/Serializer;
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lqx/l0;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()Lqx/l0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/android/video/generated/infrastructure/Serializer$moshi$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/android/video/generated/infrastructure/Serializer$moshi$2;

    invoke-direct {v0}, Lio/getstream/android/video/generated/infrastructure/Serializer$moshi$2;-><init>()V

    sput-object v0, Lio/getstream/android/video/generated/infrastructure/Serializer$moshi$2;->INSTANCE:Lio/getstream/android/video/generated/infrastructure/Serializer$moshi$2;

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
    invoke-virtual {p0}, Lio/getstream/android/video/generated/infrastructure/Serializer$moshi$2;->invoke()Lqx/l0;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lqx/l0;
    .locals 2

    .line 2
    invoke-static {}, Lio/getstream/android/video/generated/infrastructure/Serializer;->getMoshiBuilder()Lqx/i0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    new-instance v1, Lqx/l0;

    invoke-direct {v1, v0}, Lqx/l0;-><init>(Lqx/i0;)V

    return-object v1
.end method

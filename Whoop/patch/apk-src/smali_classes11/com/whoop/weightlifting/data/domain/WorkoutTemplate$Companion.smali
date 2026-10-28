.class public final Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0008\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$Companion;",
        "",
        "<init>",
        "()V",
        "Lwc3/c;",
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "serializer",
        "()Lwc3/c;",
        "empty",
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "getEmpty",
        "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "Ljava/util/UUID;",
        "idForNormalization",
        "Ljava/util/UUID;",
        "getIdForNormalization",
        "()Ljava/util/UUID;",
        "weightlifting_release"
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
    invoke-direct {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getEmpty()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->access$getEmpty$cp()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v0

    return-object v0
.end method

.method public final getIdForNormalization()Ljava/util/UUID;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->access$getIdForNormalization$cp()Ljava/util/UUID;

    move-result-object v0

    return-object v0
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$$serializer;

    return-object v0
.end method

.class public final enum Lio/getstream/chat/android/models/SyncStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/SyncStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/models/SyncStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/models/SyncStatus;",
        "",
        "status",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getStatus",
        "()I",
        "SYNC_NEEDED",
        "COMPLETED",
        "FAILED_PERMANENTLY",
        "IN_PROGRESS",
        "AWAITING_ATTACHMENTS",
        "Companion",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/models/SyncStatus;

.field public static final enum AWAITING_ATTACHMENTS:Lio/getstream/chat/android/models/SyncStatus;

.field public static final enum COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

.field public static final Companion:Lio/getstream/chat/android/models/SyncStatus$Companion;

.field public static final enum FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

.field public static final enum IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

.field public static final enum SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

.field private static final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final status:I


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/models/SyncStatus;
    .locals 5

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v2, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v3, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v4, Lio/getstream/chat/android/models/SyncStatus;->AWAITING_ATTACHMENTS:Lio/getstream/chat/android/models/SyncStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/getstream/chat/android/models/SyncStatus;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const-string v3, "SYNC_NEEDED"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/SyncStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    new-instance v0, Lio/getstream/chat/android/models/SyncStatus;

    const-string v1, "COMPLETED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lio/getstream/chat/android/models/SyncStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    new-instance v0, Lio/getstream/chat/android/models/SyncStatus;

    const-string v1, "FAILED_PERMANENTLY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lio/getstream/chat/android/models/SyncStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    new-instance v0, Lio/getstream/chat/android/models/SyncStatus;

    const-string v1, "IN_PROGRESS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lio/getstream/chat/android/models/SyncStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    new-instance v0, Lio/getstream/chat/android/models/SyncStatus;

    const-string v1, "AWAITING_ATTACHMENTS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lio/getstream/chat/android/models/SyncStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/getstream/chat/android/models/SyncStatus;->AWAITING_ATTACHMENTS:Lio/getstream/chat/android/models/SyncStatus;

    invoke-static {}, Lio/getstream/chat/android/models/SyncStatus;->$values()[Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/models/SyncStatus;->$VALUES:[Lio/getstream/chat/android/models/SyncStatus;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/models/SyncStatus;->$ENTRIES:Lt83/a;

    new-instance v0, Lio/getstream/chat/android/models/SyncStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/SyncStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/models/SyncStatus;->Companion:Lio/getstream/chat/android/models/SyncStatus$Companion;

    invoke-static {}, Lio/getstream/chat/android/models/SyncStatus;->getEntries()Lt83/a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/SyncStatus;

    iget v3, v3, Lio/getstream/chat/android/models/SyncStatus;->status:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sput-object v2, Lio/getstream/chat/android/models/SyncStatus;->map:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/getstream/chat/android/models/SyncStatus;->status:I

    return-void
.end method

.method public static final synthetic access$getMap$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->map:Ljava/util/Map;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    const-class v0, Lio/getstream/chat/android/models/SyncStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/SyncStatus;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->$VALUES:[Lio/getstream/chat/android/models/SyncStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method


# virtual methods
.method public final getStatus()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/SyncStatus;->status:I

    return v0
.end method

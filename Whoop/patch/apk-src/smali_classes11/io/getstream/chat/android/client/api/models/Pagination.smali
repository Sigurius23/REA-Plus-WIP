.class public final enum Lio/getstream/chat/android/client/api/models/Pagination;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/client/api/models/Pagination;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/Pagination;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "GREATER_THAN",
        "GREATER_THAN_OR_EQUAL",
        "LESS_THAN",
        "LESS_THAN_OR_EQUAL",
        "AROUND_ID",
        "toString",
        "stream-chat-android-client_release"
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

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/client/api/models/Pagination;

.field public static final enum AROUND_ID:Lio/getstream/chat/android/client/api/models/Pagination;

.field public static final enum GREATER_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

.field public static final enum GREATER_THAN_OR_EQUAL:Lio/getstream/chat/android/client/api/models/Pagination;

.field public static final enum LESS_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

.field public static final enum LESS_THAN_OR_EQUAL:Lio/getstream/chat/android/client/api/models/Pagination;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/client/api/models/Pagination;
    .locals 5

    sget-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    sget-object v1, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN_OR_EQUAL:Lio/getstream/chat/android/client/api/models/Pagination;

    sget-object v2, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    sget-object v3, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN_OR_EQUAL:Lio/getstream/chat/android/client/api/models/Pagination;

    sget-object v4, Lio/getstream/chat/android/client/api/models/Pagination;->AROUND_ID:Lio/getstream/chat/android/client/api/models/Pagination;

    filled-new-array {v0, v1, v2, v3, v4}, [Lio/getstream/chat/android/client/api/models/Pagination;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/getstream/chat/android/client/api/models/Pagination;

    const/4 v1, 0x0

    const-string v2, "id_gt"

    const-string v3, "GREATER_THAN"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/client/api/models/Pagination;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    new-instance v0, Lio/getstream/chat/android/client/api/models/Pagination;

    const/4 v1, 0x1

    const-string v2, "id_gte"

    const-string v3, "GREATER_THAN_OR_EQUAL"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/client/api/models/Pagination;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN_OR_EQUAL:Lio/getstream/chat/android/client/api/models/Pagination;

    new-instance v0, Lio/getstream/chat/android/client/api/models/Pagination;

    const/4 v1, 0x2

    const-string v2, "id_lt"

    const-string v3, "LESS_THAN"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/client/api/models/Pagination;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    new-instance v0, Lio/getstream/chat/android/client/api/models/Pagination;

    const/4 v1, 0x3

    const-string v2, "id_lte"

    const-string v3, "LESS_THAN_OR_EQUAL"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/client/api/models/Pagination;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN_OR_EQUAL:Lio/getstream/chat/android/client/api/models/Pagination;

    new-instance v0, Lio/getstream/chat/android/client/api/models/Pagination;

    const/4 v1, 0x4

    const-string v2, "id_around"

    const-string v3, "AROUND_ID"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/client/api/models/Pagination;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->AROUND_ID:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-static {}, Lio/getstream/chat/android/client/api/models/Pagination;->$values()[Lio/getstream/chat/android/client/api/models/Pagination;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->$VALUES:[Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/getstream/chat/android/client/api/models/Pagination;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/client/api/models/Pagination;
    .locals 1

    const-class v0, Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/api/models/Pagination;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/client/api/models/Pagination;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->$VALUES:[Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/client/api/models/Pagination;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/Pagination;->value:Ljava/lang/String;

    return-object v0
.end method

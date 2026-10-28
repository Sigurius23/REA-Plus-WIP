.class public final enum Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "TOP_START",
        "TOP_END",
        "BOTTOM_START",
        "BOTTOM_END",
        "stream-chat-android-ui-components_release"
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

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

.field public static final enum BOTTOM_END:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

.field public static final enum BOTTOM_START:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

.field public static final enum TOP_END:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

.field public static final enum TOP_START:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->TOP_START:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    sget-object v1, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->TOP_END:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    sget-object v2, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->BOTTOM_START:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    sget-object v3, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->BOTTOM_END:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    filled-new-array {v0, v1, v2, v3}, [Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    const-string v1, "TOP_START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->TOP_START:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    new-instance v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    const-string v1, "TOP_END"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->TOP_END:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    new-instance v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    const-string v1, "BOTTOM_START"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->BOTTOM_START:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    new-instance v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    const-string v1, "BOTTOM_END"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->BOTTOM_END:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    invoke-static {}, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->$values()[Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->$VALUES:[Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;
    .locals 1

    const-class v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->$VALUES:[Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    return-object v0
.end method

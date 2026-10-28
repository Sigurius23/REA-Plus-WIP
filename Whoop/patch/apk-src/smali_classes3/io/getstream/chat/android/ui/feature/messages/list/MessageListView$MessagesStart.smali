.class public final enum Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MessagesStart"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getValue$stream_chat_android_ui_components_release",
        "()I",
        "BOTTOM",
        "TOP",
        "Companion",
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

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

.field public static final enum BOTTOM:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart$Companion;

.field public static final enum TOP:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->BOTTOM:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->TOP:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    filled-new-array {v0, v1}, [Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    const-string v1, "BOTTOM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->BOTTOM:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    const-string v1, "TOP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->TOP:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->$values()[Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->$VALUES:[Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->$ENTRIES:Lt83/a;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart$Companion;

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

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->value:I

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

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;
    .locals 1

    const-class v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->$VALUES:[Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;

    return-object v0
.end method


# virtual methods
.method public final getValue$stream_chat_android_ui_components_release()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessagesStart;->value:I

    return v0
.end method

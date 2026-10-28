.class public abstract Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;
.super Landroidx/room/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;",
        "Landroidx/room/z0;",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;",
        "messageReceiptDao",
        "()Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;->Companion:Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/z0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract messageReceiptDao()Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;
.end method

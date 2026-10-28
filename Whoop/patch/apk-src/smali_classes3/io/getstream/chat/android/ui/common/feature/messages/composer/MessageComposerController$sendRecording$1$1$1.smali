.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendRecording$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendRecording$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo23/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendRecording$1$1$1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendRecording$1$1$1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendRecording$1$1$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendRecording$1$1$1;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendRecording$1$1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ln23/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            ")V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

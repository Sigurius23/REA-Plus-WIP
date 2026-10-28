.class final Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1$onServiceConnected$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1$onServiceConnected$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $endScreenShare:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1$onServiceConnected$1$1;->$endScreenShare:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1$onServiceConnected$1$1;->emit(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1$onServiceConnected$1$1;->$endScreenShare:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    .line 3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.class final Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/scope/user/UserIdentifier;->awaitFor-0E7RQCE(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.scope.user.UserIdentifier"
    f = "UserIdentifier.kt"
    l = {
        0x39
    }
    m = "awaitFor-0E7RQCE"
.end annotation


# instance fields
.field I$0:I

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/getstream/chat/android/client/scope/user/UserIdentifier;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/scope/user/UserIdentifier;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/scope/user/UserIdentifier;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->this$0:Lio/getstream/chat/android/client/scope/user/UserIdentifier;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->result:Ljava/lang/Object;

    iget p1, p0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->label:I

    iget-object p1, p0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->this$0:Lio/getstream/chat/android/client/scope/user/UserIdentifier;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->awaitFor-0E7RQCE(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

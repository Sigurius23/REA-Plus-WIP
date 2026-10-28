.class public final Lio/getstream/chat/android/client/scope/user/UserIdentifier;
.super Lq83/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/scope/user/UserIdentifier$Key;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J.\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\"\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R4\u0010\u0012\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0012\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0013\u0010\u000e\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/client/scope/user/UserIdentifier;",
        "Lq83/a;",
        "<init>",
        "()V",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "userId",
        "",
        "timeoutInMs",
        "Ll83/n;",
        "awaitFor-0E7RQCE",
        "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;",
        "awaitFor",
        "toString",
        "()Ljava/lang/String;",
        "Lec3/p1;",
        "_value",
        "Lec3/p1;",
        "value",
        "getValue",
        "setValue",
        "(Ljava/lang/String;)V",
        "Key",
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
.field private static final DEFAULT_TIMEOUT_IN_MS:J = 0x2710L

.field public static final Key:Lio/getstream/chat/android/client/scope/user/UserIdentifier$Key;


# instance fields
.field private final _value:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$Key;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->Key:Lio/getstream/chat/android/client/scope/user/UserIdentifier$Key;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->Key:Lio/getstream/chat/android/client/scope/user/UserIdentifier$Key;

    invoke-direct {p0, v0}, Lq83/a;-><init>(Lq83/i;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->_value:Lec3/p1;

    return-void
.end method

.method public static final synthetic access$get_value$p(Lio/getstream/chat/android/client/scope/user/UserIdentifier;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->_value:Lec3/p1;

    return-object p0
.end method

.method public static synthetic awaitFor-0E7RQCE$default(Lio/getstream/chat/android/client/scope/user/UserIdentifier;Ljava/lang/String;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const-wide/16 p2, 0x2710

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->awaitFor-0E7RQCE(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final awaitFor-0E7RQCE(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;

    iget v1, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;-><init>(Lio/getstream/chat/android/client/scope/user/UserIdentifier;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/scope/user/UserIdentifier;

    iget-object p1, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p4, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$2$1;

    const/4 v2, 0x0

    invoke-direct {p4, p0, p1, v2}, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$2$1;-><init>(Lio/getstream/chat/android/client/scope/user/UserIdentifier;Ljava/lang/String;Lq83/d;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->L$1:Ljava/lang/Object;

    iput-wide p2, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->J$0:J

    const/4 p1, 0x0

    iput p1, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier$awaitFor$1;->label:I

    invoke-static {p2, p3, p4, v0}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p4

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->_value:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final setValue(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->_value:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UserIdentifier("

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

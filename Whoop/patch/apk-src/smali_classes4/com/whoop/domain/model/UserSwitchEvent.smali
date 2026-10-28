.class public abstract Lcom/whoop/domain/model/UserSwitchEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0014\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000b\u001a\u00020\u000cH\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\r\u001a\u00020\t8G\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000f\u0082\u0001\u0002\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/domain/model/UserSwitchEvent;",
        "",
        "session",
        "Lcom/whoop/domain/model/Session;",
        "<init>",
        "(Lcom/whoop/domain/model/Session;)V",
        "getSession",
        "()Lcom/whoop/domain/model/Session;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "logout",
        "isLogout",
        "()Z",
        "login",
        "isLogin",
        "Lcom/whoop/domain/model/Login;",
        "Lcom/whoop/domain/model/Logout;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final session:Lcom/whoop/domain/model/Session;


# direct methods
.method private constructor <init>(Lcom/whoop/domain/model/Session;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/domain/model/UserSwitchEvent;->session:Lcom/whoop/domain/model/Session;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/domain/model/Session;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/domain/model/UserSwitchEvent;-><init>(Lcom/whoop/domain/model/Session;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/whoop/domain/model/UserSwitchEvent;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/domain/model/UserSwitchEvent;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/domain/model/UserSwitchEvent;->isLogout()Z

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserSwitchEvent;->isLogout()Z

    move-result v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/whoop/domain/model/UserSwitchEvent;->session:Lcom/whoop/domain/model/Session;

    invoke-virtual {v1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    iget-object p1, p1, Lcom/whoop/domain/model/UserSwitchEvent;->session:Lcom/whoop/domain/model/Session;

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getId()I

    move-result p1

    if-ne v1, p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public final getSession()Lcom/whoop/domain/model/Session;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserSwitchEvent;->session:Lcom/whoop/domain/model/Session;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/domain/model/UserSwitchEvent;->isLogout()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/domain/model/UserSwitchEvent;->session:Lcom/whoop/domain/model/Session;

    invoke-virtual {v1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final isLogin()Z
    .locals 1

    instance-of v0, p0, Lcom/whoop/domain/model/Login;

    return v0
.end method

.method public final isLogout()Z
    .locals 1

    instance-of v0, p0, Lcom/whoop/domain/model/Logout;

    return v0
.end method

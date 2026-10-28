.class public final Lcom/whoop/domain/model/Logout;
.super Lcom/whoop/domain/model/UserSwitchEvent;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\n\u0010\u0006\u001a\u00020\u0007H\u0096\u0080\u0004\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/domain/model/Logout;",
        "Lcom/whoop/domain/model/UserSwitchEvent;",
        "session",
        "Lcom/whoop/domain/model/Session;",
        "<init>",
        "(Lcom/whoop/domain/model/Session;)V",
        "toString",
        "",
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


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/Session;)V
    .locals 1

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/whoop/domain/model/UserSwitchEvent;-><init>(Lcom/whoop/domain/model/Session;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/domain/model/UserSwitchEvent;->getSession()Lcom/whoop/domain/model/Session;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getId()I

    move-result v0

    const-string v1, "Logout "

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

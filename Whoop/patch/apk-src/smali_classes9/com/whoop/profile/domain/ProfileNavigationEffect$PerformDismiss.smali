.class public final Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/profile/domain/ProfileNavigationEffect;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/domain/ProfileNavigationEffect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PerformDismiss"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;",
        "Lcom/whoop/profile/domain/ProfileNavigationEffect;",
        "Lj02/s;",
        "dismissEvent",
        "<init>",
        "(Lj02/s;)V",
        "component1",
        "()Lj02/s;",
        "copy",
        "(Lj02/s;)Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lj02/s;",
        "getDismissEvent",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final dismissEvent:Lj02/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lj02/s;->d:I

    sput v0, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->$stable:I

    return-void
.end method

.method public constructor <init>(Lj02/s;)V
    .locals 1

    const-string v0, "dismissEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->dismissEvent:Lj02/s;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;Lj02/s;ILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->dismissEvent:Lj02/s;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->copy(Lj02/s;)Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lj02/s;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->dismissEvent:Lj02/s;

    return-object v0
.end method

.method public final copy(Lj02/s;)Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;
    .locals 1

    const-string v0, "dismissEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;-><init>(Lj02/s;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->dismissEvent:Lj02/s;

    iget-object p1, p1, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->dismissEvent:Lj02/s;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getDismissEvent()Lj02/s;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->dismissEvent:Lj02/s;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->dismissEvent:Lj02/s;

    invoke-virtual {v0}, Lj02/s;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileNavigationEffect$PerformDismiss;->dismissEvent:Lj02/s;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "PerformDismiss(dismissEvent="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

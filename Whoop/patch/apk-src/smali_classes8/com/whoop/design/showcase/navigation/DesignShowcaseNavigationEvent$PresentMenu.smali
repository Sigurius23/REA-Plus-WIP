.class public final Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;
.super Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PresentMenu"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
        "type",
        "<init>",
        "(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)V",
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
        "a",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
        "()Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;",
        "design-showcase_release"
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
.field private final a:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;-><init>(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;->a:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->ROOT:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;-><init>(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;->a:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    iget-object v1, p0, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;->a:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    iget-object p1, p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;->a:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;->a:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;->a:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "PresentMenu(type="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

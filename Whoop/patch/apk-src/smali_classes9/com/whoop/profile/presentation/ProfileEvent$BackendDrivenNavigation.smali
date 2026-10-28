.class public final Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/presentation/ProfileEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BackendDrivenNavigation"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001d\u001a\u0004\u0008\u001e\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u001f\u001a\u0004\u0008 \u0010\u000f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;",
        "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "",
        "source",
        "Lm91/u;",
        "itemViewState",
        "<init>",
        "(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V",
        "component1",
        "()Lcom/whoop/navigation/e;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lm91/u;",
        "copy",
        "(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;",
        "toString",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/navigation/e;",
        "getNavAction",
        "Ljava/lang/String;",
        "getSource",
        "Lm91/u;",
        "getItemViewState",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final itemViewState:Lm91/u;

.field private final navAction:Lcom/whoop/navigation/e;

.field private final source:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V
    .locals 1

    const-string v0, "navAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->navAction:Lcom/whoop/navigation/e;

    iput-object p2, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->source:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->itemViewState:Lm91/u;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 2
    const-string p2, "profile"

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;ILjava/lang/Object;)Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->navAction:Lcom/whoop/navigation/e;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->source:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->itemViewState:Lm91/u;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->copy(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->navAction:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lm91/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->itemViewState:Lm91/u;

    return-object v0
.end method

.method public final copy(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;
    .locals 1

    const-string v0, "navAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->navAction:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->navAction:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->itemViewState:Lm91/u;

    iget-object p1, p1, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->itemViewState:Lm91/u;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getItemViewState()Lm91/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->itemViewState:Lm91/u;

    return-object v0
.end method

.method public final getNavAction()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->navAction:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->source:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->navAction:Lcom/whoop/navigation/e;

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->source:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->itemViewState:Lm91/u;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->navAction:Lcom/whoop/navigation/e;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->source:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->itemViewState:Lm91/u;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "BackendDrivenNavigation(navAction="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", itemViewState="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;
.implements Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/presentation/ProfileEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ItemClicked"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ$\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0019\u001a\u0004\u0008\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;",
        "Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;",
        "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;",
        "",
        "event",
        "Lm91/u;",
        "element",
        "<init>",
        "(Ljava/lang/Object;Lm91/u;)V",
        "component1",
        "()Ljava/lang/Object;",
        "component2",
        "()Lm91/u;",
        "copy",
        "(Ljava/lang/Object;Lm91/u;)Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Object;",
        "getEvent",
        "Lm91/u;",
        "getElement",
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
.field private final element:Lm91/u;

.field private final event:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lm91/u;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->event:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->element:Lm91/u;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;Ljava/lang/Object;Lm91/u;ILjava/lang/Object;)Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->event:Ljava/lang/Object;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->element:Lm91/u;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->copy(Ljava/lang/Object;Lm91/u;)Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->event:Ljava/lang/Object;

    return-object v0
.end method

.method public final component2()Lm91/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->element:Lm91/u;

    return-object v0
.end method

.method public final copy(Ljava/lang/Object;Lm91/u;)Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    invoke-direct {v0, p1, p2}, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;-><init>(Ljava/lang/Object;Lm91/u;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->event:Ljava/lang/Object;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->event:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->element:Lm91/u;

    iget-object p1, p1, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->element:Lm91/u;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getElement()Lm91/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->element:Lm91/u;

    return-object v0
.end method

.method public final getEvent()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->event:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->event:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->element:Lm91/u;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->event:Ljava/lang/Object;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->element:Lm91/u;

    const-string v2, ", element="

    const-string v3, ")"

    const-string v4, "ItemClicked(event="

    invoke-static {v4, v0, v2, v1, v3}, Lte0/d;->k(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lm91/u;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

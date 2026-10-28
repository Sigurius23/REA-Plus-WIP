.class public final Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;
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
    name = "ExpandableStatisticListEvent"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\u0008\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00d6\u0083\u0004J\n\u0010\r\u001a\u00020\u000eH\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;",
        "Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;",
        "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;",
        "isExpanded",
        "",
        "<init>",
        "(Z)V",
        "()Z",
        "component1",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final isExpanded:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->isExpanded:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;ZILjava/lang/Object;)Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->isExpanded:Z

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->copy(Z)Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->isExpanded:Z

    return v0
.end method

.method public final copy(Z)Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;
    .locals 1

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;

    invoke-direct {v0, p1}, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;-><init>(Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;

    iget-boolean v1, p0, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->isExpanded:Z

    iget-boolean p1, p1, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->isExpanded:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->isExpanded:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public final isExpanded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->isExpanded:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->isExpanded:Z

    const-string v1, "ExpandableStatisticListEvent(isExpanded="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lc13/a;->k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

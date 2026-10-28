.class public Lcom/whoop/community/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/community/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/HashMap;


# direct methods
.method private constructor <init>(ZLcom/whoop/domain/model/teams/Team;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    .line 4
    const-string v1, "isTransfer"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    .line 5
    const-string p1, "teamid"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Argument \"teamid\" is marked as non-null but was passed a null value."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(ZLcom/whoop/domain/model/teams/Team;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/whoop/community/g$b;-><init>(ZLcom/whoop/domain/model/teams/Team;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    sget v0, Lxp0/a0;->l:I

    return v0
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    const-string v1, "isTransfer"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public c()Lcom/whoop/domain/model/teams/Team;
    .locals 2

    iget-object v0, p0, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    const-string v1, "teamid"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/teams/Team;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/whoop/community/g$b;

    iget-object v2, p0, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    const-string v3, "isTransfer"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/community/g$b;->b()Z

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/community/g$b;->b()Z

    move-result v3

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    const-string v3, "teamid"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/community/g$b;->c()Lcom/whoop/domain/model/teams/Team;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lcom/whoop/community/g$b;->c()Lcom/whoop/domain/model/teams/Team;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/community/g$b;->c()Lcom/whoop/domain/model/teams/Team;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/whoop/domain/model/teams/Team;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lcom/whoop/community/g$b;->c()Lcom/whoop/domain/model/teams/Team;

    move-result-object v2

    if-eqz v2, :cond_6

    :goto_0
    return v1

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/community/g$b;->a()I

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/community/g$b;->a()I

    move-result p1

    if-eq v2, p1, :cond_7

    return v1

    :cond_7
    return v0

    :cond_8
    :goto_1
    return v1
.end method

.method public getArguments()Landroid/os/Bundle;
    .locals 6

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    const-string v2, "isTransfer"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    iget-object v1, p0, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    const-string v2, "teamid"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/whoop/community/g$b;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/domain/model/teams/Team;

    const-class v3, Landroid/os/Parcelable;

    const-class v4, Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_3

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const-class v3, Ljava/io/Serializable;

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v3, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/Serializable;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " must implement Parcelable or Serializable or must be an Enum."

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    invoke-virtual {v3, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_4
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/community/g$b;->b()Z

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/whoop/community/g$b;->c()Lcom/whoop/domain/model/teams/Team;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/whoop/community/g$b;->c()Lcom/whoop/domain/model/teams/Team;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/Team;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/whoop/community/g$b;->a()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ActionCommunityManageTeamFragmentToCommunityRemoveMembersFragment(actionId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/community/g$b;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "){isTransfer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/whoop/community/g$b;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", teamid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/whoop/community/g$b;->c()Lcom/whoop/domain/model/teams/Team;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

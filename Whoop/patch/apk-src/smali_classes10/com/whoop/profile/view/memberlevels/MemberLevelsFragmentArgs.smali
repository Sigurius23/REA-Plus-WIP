.class public Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs$Builder;
    }
.end annotation


# instance fields
.field private final arguments:Ljava/util/HashMap;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>(Ljava/util/HashMap;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/HashMap;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;-><init>(Ljava/util/HashMap;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    return-object p0
.end method

.method public static fromBundle(Landroid/os/Bundle;)Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;
    .locals 4

    new-instance v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    invoke-direct {v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;-><init>()V

    const-class v1, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    const-string v2, "memberLevelData"

    invoke-static {p0, v1, v2}, Lhc3/i;->t(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-class v1, Landroid/os/Parcelable;

    const-class v3, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_1

    const-class v1, Ljava/io/Serializable;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " must implement Parcelable or Serializable or must be an Enum."

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    if-eqz p0, :cond_2

    iget-object v1, v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"memberLevelData\" is marked as non-null but was passed a null value."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required argument \"memberLevelData\" is missing and does not have an android:defaultValue"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static fromSavedStateHandle(Landroidx/lifecycle/k1;)Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;
    .locals 3

    new-instance v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    invoke-direct {v0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;-><init>()V

    const-string v1, "memberLevelData"

    invoke-virtual {p0, v1}, Landroidx/lifecycle/k1;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    if-eqz p0, :cond_0

    iget-object v2, v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v2, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"memberLevelData\" is marked as non-null but was passed a null value."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required argument \"memberLevelData\" is missing and does not have an android:defaultValue"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    iget-object v2, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v3, "memberLevelData"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object p1

    if-eqz p1, :cond_4

    :goto_0
    return v1

    :cond_4
    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v1, "memberLevelData"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method

.method public toBundle()Landroid/os/Bundle;
    .locals 6

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v2, "memberLevelData"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    const-class v3, Landroid/os/Parcelable;

    const-class v4, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-class v3, Ljava/io/Serializable;

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v3, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/Serializable;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " must implement Parcelable or Serializable or must be an Enum."

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    invoke-virtual {v3, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_3
    return-object v0
.end method

.method public toSavedStateHandle()Landroidx/lifecycle/k1;
    .locals 6

    new-instance v0, Landroidx/lifecycle/k1;

    invoke-direct {v0}, Landroidx/lifecycle/k1;-><init>()V

    iget-object v1, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v2, "memberLevelData"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    const-class v3, Landroid/os/Parcelable;

    const-class v4, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-class v3, Ljava/io/Serializable;

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v3, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/Serializable;

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " must implement Parcelable or Serializable or must be an Enum."

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    invoke-virtual {v3, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MemberLevelsFragmentArgs{memberLevelData="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

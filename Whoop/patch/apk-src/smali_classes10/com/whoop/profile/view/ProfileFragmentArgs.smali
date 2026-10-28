.class public Lcom/whoop/profile/view/ProfileFragmentArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/ProfileFragmentArgs$Builder;
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

    iput-object v0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>(Ljava/util/HashMap;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/HashMap;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/profile/view/ProfileFragmentArgs;-><init>(Ljava/util/HashMap;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/whoop/profile/view/ProfileFragmentArgs;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    return-object p0
.end method

.method public static fromBundle(Landroid/os/Bundle;)Lcom/whoop/profile/view/ProfileFragmentArgs;
    .locals 5

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/whoop/profile/view/ProfileFragmentArgs;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileFragmentArgs;-><init>()V

    const-class v2, Lcom/whoop/profile/view/ProfileFragmentArgs;

    const-string v3, "source"

    invoke-static {p0, v2, v3}, Lhc3/i;->t(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v4, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v4, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"source\" is marked as non-null but was passed a null value."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object v2, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    const-string v2, "targetUserId"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    iget-object v4, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v3, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    const-string v2, "communityId"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iget-object v3, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v3, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    const-string v0, "educationType"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iget-object v2, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_4
    iget-object p0, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public static fromSavedStateHandle(Landroidx/lifecycle/k1;)Lcom/whoop/profile/view/ProfileFragmentArgs;
    .locals 5

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/whoop/profile/view/ProfileFragmentArgs;

    invoke-direct {v1}, Lcom/whoop/profile/view/ProfileFragmentArgs;-><init>()V

    const-string v2, "source"

    invoke-virtual {p0, v2}, Landroidx/lifecycle/k1;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v2}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v4, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"source\" is marked as non-null but was passed a null value."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object v3, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v4, ""

    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    const-string v2, "targetUserId"

    invoke-virtual {p0, v2}, Landroidx/lifecycle/k1;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0, v2}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    iget-object v4, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v3, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    const-string v2, "communityId"

    invoke-virtual {p0, v2}, Landroidx/lifecycle/k1;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v2}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    iget-object v3, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v3, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    const-string v0, "educationType"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/k1;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v0}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    iget-object v2, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_4
    iget-object p0, v1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/ProfileFragmentArgs;

    iget-object v2, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v3, "source"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getSource()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getSource()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getSource()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    :goto_0
    return v1

    :cond_4
    iget-object v2, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v3, "targetUserId"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getTargetUserId()I

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getTargetUserId()I

    move-result v3

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v3, "communityId"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_7

    return v1

    :cond_7
    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getCommunityId()I

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getCommunityId()I

    move-result v3

    if-eq v2, v3, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v3, "educationType"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p1, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eq v2, v3, :cond_9

    return v1

    :cond_9
    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getEducationType()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getEducationType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getEducationType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_1

    :cond_a
    invoke-virtual {p1}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getEducationType()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_b

    :goto_1
    return v1

    :cond_b
    return v0

    :cond_c
    :goto_2
    return v1
.end method

.method public getCommunityId()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v1, "communityId"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getEducationType()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v1, "educationType"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSource()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v1, "source"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTargetUserId()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v1, "targetUserId"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getSource()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getSource()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/16 v2, 0x1f

    add-int/2addr v0, v2

    mul-int/2addr v0, v2

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getTargetUserId()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getCommunityId()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getEducationType()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getEducationType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toBundle()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v2, "source"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v1, ""

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v1, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v2, "targetUserId"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, -0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :goto_1
    iget-object v1, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v2, "communityId"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :goto_2
    iget-object v1, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v2, "educationType"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public toSavedStateHandle()Landroidx/lifecycle/k1;
    .locals 4

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Landroidx/lifecycle/k1;

    invoke-direct {v1}, Landroidx/lifecycle/k1;-><init>()V

    iget-object v2, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v3, "source"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v2, ""

    invoke-virtual {v1, v2, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget-object v2, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v3, "targetUserId"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    iget-object v2, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v3, "communityId"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    iget-object v0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    const-string v2, "educationType"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileFragmentArgs;->arguments:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v1, v0, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ProfileFragmentArgs{source="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", targetUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getTargetUserId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", communityId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getCommunityId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", educationType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileFragmentArgs;->getEducationType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

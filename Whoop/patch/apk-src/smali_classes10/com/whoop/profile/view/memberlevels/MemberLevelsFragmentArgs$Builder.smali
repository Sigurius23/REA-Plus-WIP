.class public final Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final arguments:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs$Builder;->arguments:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    .line 6
    const-string v1, "memberLevelData"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"memberLevelData\" is marked as non-null but was passed a null value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs$Builder;->arguments:Ljava/util/HashMap;

    .line 3
    invoke-static {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;->a(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;
    .locals 3

    new-instance v0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;

    iget-object v1, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs$Builder;->arguments:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;-><init>(Ljava/util/HashMap;I)V

    return-object v0
.end method

.method public getMemberLevelData()Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs$Builder;->arguments:Ljava/util/HashMap;

    const-string v1, "memberLevelData"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    return-object v0
.end method

.method public setMemberLevelData(Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;)Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs$Builder;
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs$Builder;->arguments:Ljava/util/HashMap;

    const-string v1, "memberLevelData"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"memberLevelData\" is marked as non-null but was passed a null value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

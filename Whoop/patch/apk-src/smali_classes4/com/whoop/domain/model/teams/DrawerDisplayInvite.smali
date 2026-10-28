.class public final Lcom/whoop/domain/model/teams/DrawerDisplayInvite;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u000fJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0018Jb\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u000fJ\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008+\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010(\u001a\u0004\u0008,\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008-\u0010\u0018R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010*\u001a\u0004\u0008.\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010(\u001a\u0004\u0008/\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010*\u001a\u0004\u00080\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010*\u001a\u0004\u00081\u0010\u0018\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
        "Landroid/os/Parcelable;",
        "",
        "id",
        "",
        "status",
        "communityId",
        "communityName",
        "communityIconUrl",
        "senderId",
        "senderUsername",
        "inviteCode",
        "<init>",
        "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getId",
        "Ljava/lang/String;",
        "getStatus",
        "getCommunityId",
        "getCommunityName",
        "getCommunityIconUrl",
        "getSenderId",
        "getSenderUsername",
        "getInviteCode",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final communityIconUrl:Ljava/lang/String;

.field private final communityId:I

.field private final communityName:Ljava/lang/String;

.field private final id:I

.field private final inviteCode:Ljava/lang/String;

.field private final senderId:I

.field private final senderUsername:Ljava/lang/String;

.field private final status:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/DrawerDisplayInvite$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityIconUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "senderUsername"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->id:I

    iput-object p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->status:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityId:I

    iput-object p4, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityName:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityIconUrl:Ljava/lang/String;

    iput p6, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderId:I

    iput-object p7, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderUsername:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->inviteCode:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/domain/model/teams/DrawerDisplayInvite;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->id:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->status:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityId:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityName:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityIconUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderId:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderUsername:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->inviteCode:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->copy(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityId:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderId:I

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderUsername:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/teams/DrawerDisplayInvite;
    .locals 10

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityIconUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "senderUsername"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    iget v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->id:I

    iget v3, p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->status:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderId:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderUsername:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderUsername:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->inviteCode:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->inviteCode:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCommunityIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommunityId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityId:I

    return v0
.end method

.method public final getCommunityName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityName:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->id:I

    return v0
.end method

.method public final getInviteCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getSenderId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderId:I

    return v0
.end method

.method public final getSenderUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderUsername:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->status:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->status:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityIconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderUsername:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->inviteCode:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->id:I

    iget-object v1, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->status:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityId:I

    iget-object v3, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityName:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityIconUrl:Ljava/lang/String;

    iget v5, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderId:I

    iget-object v6, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderUsername:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->inviteCode:Ljava/lang/String;

    const-string v8, ", status="

    const-string v9, ", communityId="

    const-string v10, "DrawerDisplayInvite(id="

    invoke-static {v0, v10, v8, v1, v9}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", communityName="

    const-string v8, ", communityIconUrl="

    invoke-static {v2, v1, v3, v8, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", senderId="

    const-string v2, ", senderUsername="

    invoke-static {v5, v4, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", inviteCode="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->status:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->communityIconUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->senderUsername:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->inviteCode:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
